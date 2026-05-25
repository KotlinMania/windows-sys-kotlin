// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream line 10024:
//   pub type WAIT_EVENT = u32;
public typealias WAIT_EVENT = UInt

// Upstream line 10027:
//   pub const WAIT_OBJECT_0: WAIT_EVENT = 0u32;
public const val WAIT_OBJECT_0: WAIT_EVENT = 0u
