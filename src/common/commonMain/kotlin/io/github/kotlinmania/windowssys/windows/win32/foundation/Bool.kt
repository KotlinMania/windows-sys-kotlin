// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL

// Upstream lines 4755 and 9806 in Windows/Win32/Foundation/mod.rs:
//
//   pub const FALSE: windows_sys::core::BOOL = 0i32;
//   pub const TRUE:  windows_sys::core::BOOL = 1i32;
//
// `BOOL` is typed in `core/Core.kt` as `Int`. The `i32` literal values
// translate directly.

public const val FALSE: BOOL = 0
public const val TRUE: BOOL = 1
