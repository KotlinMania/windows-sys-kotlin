// port-lint: source windows-sys/src/Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.windowssys.cinterop.CompareObjectHandles as winCompareObjectHandles

// Upstream line 2 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("api-ms-win-core-handle-l1-1-0.dll" "system"
//       fn CompareObjectHandles(hfirstobjecthandle : HANDLE,
//                               hsecondobjecthandle : HANDLE)
//           -> windows_sys::core::BOOL);
//
// Compares two handle values to determine if they refer to the same
// underlying object. The function is not in the MinGW-w64 headers
// shipped with Kotlin/Native's platform.windows cinterop, so the
// declaration is provided through the win32extras cinterop def.

public fun CompareObjectHandles(
    hfirstobjecthandle: HANDLE,
    hsecondobjecthandle: HANDLE,
): BOOL = winCompareObjectHandles(hfirstobjecthandle.toCPointer(), hsecondobjecthandle.toCPointer())
