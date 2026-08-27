// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream lines 5119–5123 in Windows/Win32/Foundation/mod.rs:
//
//   pub type HANDLE = *mut core::ffi::c_void;
//   pub type HANDLE_FLAGS = u32;
//   pub const HANDLE_FLAG_INHERIT: HANDLE_FLAGS = 1u32;
//   pub const HANDLE_FLAG_PROTECT_FROM_CLOSE: HANDLE_FLAGS = 2u32;
//   pub type HANDLE_PTR = usize;
//
// HANDLE / HANDLE_PTR map to Long per the pointer-typealias convention
// already established in `core/Core.kt` (PSTR/PWSTR/HSTRING).
// HANDLE_FLAGS / its constants follow the `u32` → `UInt` convention used
// throughout this port (cf. `windows/win32/devices/beep/Beep.kt`).

public typealias HANDLE = Long
public typealias HANDLE_FLAGS = UInt

public const val HANDLE_FLAG_INHERIT: HANDLE_FLAGS = 1u
public const val HANDLE_FLAG_PROTECT_FROM_CLOSE: HANDLE_FLAGS = 2u

public typealias HANDLE_PTR = Long

// Upstream line 5291 in Windows/Win32/Foundation/mod.rs:
//
//   pub const INVALID_HANDLE_VALUE: HANDLE = -1i32 as _;
//
// The Rust source reinterprets an `i32` of `-1` as a `*mut c_void`,
// which on every Windows platform is the all-ones pointer value used
// by Win32 APIs to signal "no valid handle." Long equivalent is `-1L`
// (sign-extended, same bit pattern).

public const val INVALID_HANDLE_VALUE: HANDLE = -1L
