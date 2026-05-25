// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream lines 5396–5401 in Windows/Win32/Foundation/mod.rs:
//
//   #[repr(C)]
//   #[derive(Clone, Copy, Default)]
//   pub struct LUID {
//       pub LowPart: u32,
//       pub HighPart: i32,
//   }
//
// Locally Unique Identifier — 64-bit value, half unsigned, half signed,
// matching the upstream LUID layout exactly. Used by Win32 privilege
// and token APIs. Kotlin field types preserve the Rust signedness:
// `u32` → `UInt`, `i32` → `Int`.

public data class LUID(
    public var LowPart: UInt = 0u,
    public var HighPart: Int = 0,
)
