// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream lines 5114–5118 in Windows/Win32/Foundation/mod.rs:
//
//   pub type GENERIC_ACCESS_RIGHTS = u32;
//   pub const GENERIC_ALL: GENERIC_ACCESS_RIGHTS = 268435456u32;
//   pub const GENERIC_EXECUTE: GENERIC_ACCESS_RIGHTS = 536870912u32;
//   pub const GENERIC_READ: GENERIC_ACCESS_RIGHTS = 2147483648u32;
//   pub const GENERIC_WRITE: GENERIC_ACCESS_RIGHTS = 1073741824u32;

public typealias GENERIC_ACCESS_RIGHTS = UInt

public const val GENERIC_ALL: GENERIC_ACCESS_RIGHTS = 268435456u
public const val GENERIC_EXECUTE: GENERIC_ACCESS_RIGHTS = 536870912u
public const val GENERIC_READ: GENERIC_ACCESS_RIGHTS = 2147483648u
public const val GENERIC_WRITE: GENERIC_ACCESS_RIGHTS = 1073741824u
