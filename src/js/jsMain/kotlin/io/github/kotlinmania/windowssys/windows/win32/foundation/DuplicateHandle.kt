// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL

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
// Kotlin/JS wrapper delegating to the N-API native bindings.

public fun DuplicateHandle(
    hsourceprocesshandle: HANDLE,
    hsourcehandle: HANDLE,
    htargetprocesshandle: HANDLE,
    lptargethandle: LongArray,
    dwdesiredaccess: UInt,
    binherithandle: BOOL,
    dwoptions: DUPLICATE_HANDLE_OPTIONS,
): BOOL {
    val res =
        WindowsSysNative.DuplicateHandle(
            hsourceprocesshandle.toDouble(),
            hsourcehandle.toDouble(),
            htargetprocesshandle.toDouble(),
            dwdesiredaccess.toInt(),
            binherithandle != 0,
            dwoptions.toInt(),
        )
    val success = (res.success as Number).toInt()
    if (lptargethandle.isNotEmpty()) {
        lptargethandle[0] = (res.targetHandle as Number).toLong()
    }
    return success
}
