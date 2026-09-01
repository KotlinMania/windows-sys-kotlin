// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.HRESULT

// Codex-demand `HRESULT` constants from the Windows Filtering Platform
// error namespace (FWP_E_*), in upstream line order. Upstream encodes
// each value as `0xXXXX_u32 as _`, reinterpreting a `u32` bit pattern
// as the signed `i32` HRESULT. Kotlin emits the same bits via
// `.toInt()` on a `UInt` literal.

// Upstream line 5038:
//   pub const FWP_E_ALREADY_EXISTS: windows_sys::core::HRESULT
//       = 0x80320009_u32 as _;
public val FWP_E_ALREADY_EXISTS: HRESULT = 0x80320009u.toInt()

// Upstream line 5052:
//   pub const FWP_E_FILTER_NOT_FOUND: windows_sys::core::HRESULT
//       = 0x80320003_u32 as _;
public val FWP_E_FILTER_NOT_FOUND: HRESULT = 0x80320003u.toInt()

// Upstream line 5084:
//   pub const FWP_E_NOT_FOUND: windows_sys::core::HRESULT
//       = 0x80320008_u32 as _;
public val FWP_E_NOT_FOUND: HRESULT = 0x80320008u.toInt()
