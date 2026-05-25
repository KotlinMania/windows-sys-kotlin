// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream line 10086 in Windows/Win32/Foundation/mod.rs:
//
//   pub type WIN32_ERROR = u32;
//
// Return type of `GetLastError` and the static type of every
// `APPMODEL_ERROR_*` / `ERROR_*` constant in upstream Foundation.

public typealias WIN32_ERROR = UInt
