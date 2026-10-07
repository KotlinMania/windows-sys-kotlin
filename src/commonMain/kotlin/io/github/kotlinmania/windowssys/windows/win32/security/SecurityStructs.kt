// port-lint: source Windows/Win32/Security/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.core.BOOL

// Upstream lines 531-540 in Windows/Win32/Security/mod.rs:
//   #[repr(C)]
//   #[derive(Clone, Copy)]
//   pub struct SECURITY_ATTRIBUTES {
//       pub nLength: u32,
//       pub lpSecurityDescriptor: *mut core::ffi::c_void,
//       pub bInheritHandle: windows_sys::core::BOOL,
//   }

public data class SECURITY_ATTRIBUTES(
    public var nLength: UInt = 0u,
    public var lpSecurityDescriptor: Long = 0L,
    public var bInheritHandle: BOOL = 0,
)
