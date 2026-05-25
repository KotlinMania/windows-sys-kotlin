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
