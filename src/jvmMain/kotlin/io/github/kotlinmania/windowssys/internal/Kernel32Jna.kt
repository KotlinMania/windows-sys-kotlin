// Internal JNA projection of kernel32.dll for the jvmMain Win32 wrappers.
// Each upstream `windows_link::link!("kernel32.dll" "system" fn …)`
// declaration in the parceled Win32 source files maps to one method on
// this interface, with parameter types translated to JNA primitives
// (Pointer? for HANDLE / pointer typealiases, Int for u32 / FILE_*, etc.).
//
// Holding all kernel32 declarations on a single interface keeps the
// shared library loaded exactly once across every Win32 wrapper in
// this port, matching the upstream Rust crate's single-DLL link.
package io.github.kotlinmania.windowssys.internal

import com.sun.jna.Library
import com.sun.jna.Native
import com.sun.jna.Pointer
import com.sun.jna.ptr.PointerByReference

internal interface Kernel32Jna : Library {
    // Win32 BOOL is `i32`; JNA projects it as `Int`. JNA returns `Pointer?`
    // for HANDLE/HLOCAL and `Long` round-trips via `Pointer(addr)`.

    fun CloseHandle(hObject: Pointer?): Int

    fun GetLastError(): Int

    fun LocalFree(hMem: Pointer?): Pointer?

    fun SetHandleInformation(hObject: Pointer?, dwMask: Int, dwFlags: Int): Int

    fun DuplicateHandle(
        hSourceProcessHandle: Pointer?,
        hSourceHandle: Pointer?,
        hTargetProcessHandle: Pointer?,
        lpTargetHandle: PointerByReference,
        dwDesiredAccess: Int,
        bInheritHandle: Int,
        dwOptions: Int,
    ): Int

    companion object {
        val INSTANCE: Kernel32Jna = Native.load("kernel32", Kernel32Jna::class.java)
    }
}
