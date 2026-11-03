// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

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

public fun DuplicateHandle(
    hsourceprocesshandle: HANDLE,
    hsourcehandle: HANDLE,
    htargetprocesshandle: HANDLE,
    lptargethandle: LongArray,
    dwdesiredaccess: UInt,
    binherithandle: BOOL,
    dwoptions: DUPLICATE_HANDLE_OPTIONS,
): BOOL =
    Kernel32Jni.DuplicateHandle(
        hsourceprocesshandle,
        hsourcehandle,
        htargetprocesshandle,
        lptargethandle,
        dwdesiredaccess.toInt(),
        binherithandle,
        dwoptions.toInt(),
    )
