// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL

// Upstream line 10 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn SetHandleInformation(hobject : HANDLE, dwmask : u32,
//                               dwflags : HANDLE_FLAGS)
//           -> windows_sys::core::BOOL);

public fun SetHandleInformation(
    hobject: HANDLE,
    dwmask: UInt,
    dwflags: HANDLE_FLAGS,
): BOOL =
    throw UnsupportedOperationException("SetHandleInformation requires Windows N-API addon")
