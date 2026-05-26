// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlinx.cinterop.value
import platform.windows.DuplicateHandle as winDuplicateHandle
import platform.windows.HANDLEVar

// Upstream line 3 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn DuplicateHandle(hsourceprocesshandle : HANDLE,
//                          hsourcehandle : HANDLE,
//                          htargetprocesshandle : HANDLE,
//                          lptargethandle : *mut HANDLE,
//                          dwdesiredaccess : u32,
//                          binherithandle : windows_sys::core::BOOL,
//                          dwoptions : DUPLICATE_HANDLE_OPTIONS)
//           -> windows_sys::core::BOOL);
//
// `lptargethandle` is an out-param; upstream signature is `*mut HANDLE`.
// The Kotlin wrapper accepts a `LongArray` of size 1 — the caller reads
// the duplicated handle from index 0 after the call returns. Mirrors
// the `MaybeUninit<HANDLE>` / `let mut h: HANDLE = null_mut()` shape
// upstream Rust callers use to materialise the out-param.

public fun DuplicateHandle(
    hsourceprocesshandle: HANDLE,
    hsourcehandle: HANDLE,
    htargetprocesshandle: HANDLE,
    lptargethandle: LongArray,
    dwdesiredaccess: UInt,
    binherithandle: BOOL,
    dwoptions: DUPLICATE_HANDLE_OPTIONS,
): BOOL = memScoped {
    val out = alloc<HANDLEVar>()
    val result = winDuplicateHandle(
        hsourceprocesshandle.toCPointer(),
        hsourcehandle.toCPointer(),
        htargetprocesshandle.toCPointer(),
        out.ptr,
        dwdesiredaccess,
        binherithandle,
        dwoptions,
    )
    lptargethandle[0] = out.value?.toLong() ?: 0L
    result
}
