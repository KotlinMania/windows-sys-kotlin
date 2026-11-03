// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream line 932 in Windows/Win32/Foundation/mod.rs:
//
//   pub type DUPLICATE_HANDLE_OPTIONS = u32;

public typealias DUPLICATE_HANDLE_OPTIONS = UInt

// Upstream line 933:
//   pub const DUPLICATE_SAME_ACCESS: DUPLICATE_HANDLE_OPTIONS = 2u32;

public const val DUPLICATE_SAME_ACCESS: DUPLICATE_HANDLE_OPTIONS = 2u
