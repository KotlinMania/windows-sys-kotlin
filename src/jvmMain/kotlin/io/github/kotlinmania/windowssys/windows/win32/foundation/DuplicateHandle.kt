// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import com.sun.jna.Pointer
import com.sun.jna.ptr.PointerByReference
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jna

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
// JVM-on-Windows wrapper. Same out-param shape as the mingwMain
// version — caller passes a `LongArray` of size 1, reads the
// duplicated handle from index 0 after the call returns. Routes
// the out-pointer through JNA's `PointerByReference`.

public fun DuplicateHandle(
    hsourceprocesshandle: HANDLE,
    hsourcehandle: HANDLE,
    htargetprocesshandle: HANDLE,
    lptargethandle: LongArray,
    dwdesiredaccess: UInt,
    binherithandle: BOOL,
    dwoptions: DUPLICATE_HANDLE_OPTIONS,
): BOOL {
    val out = PointerByReference()
    val result = Kernel32Jna.INSTANCE.DuplicateHandle(
        Pointer(hsourceprocesshandle),
        Pointer(hsourcehandle),
        Pointer(htargetprocesshandle),
        out,
        dwdesiredaccess.toInt(),
        binherithandle,
        dwoptions.toInt(),
    )
    lptargethandle[0] = out.value?.let { Pointer.nativeValue(it) } ?: 0L
    return result
}
