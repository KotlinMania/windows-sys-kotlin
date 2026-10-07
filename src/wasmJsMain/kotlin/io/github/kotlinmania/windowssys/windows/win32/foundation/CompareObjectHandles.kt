// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL

// Upstream line 2 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("api-ms-win-core-handle-l1-1-0.dll" "system"
//       fn CompareObjectHandles(hfirstobjecthandle : HANDLE,
//                               hsecondobjecthandle : HANDLE)
//           -> windows_sys::core::BOOL);

public fun CompareObjectHandles(
    hfirstobjecthandle: HANDLE,
    hsecondobjecthandle: HANDLE,
): BOOL = throw UnsupportedOperationException("CompareObjectHandles requires Windows N-API addon")
