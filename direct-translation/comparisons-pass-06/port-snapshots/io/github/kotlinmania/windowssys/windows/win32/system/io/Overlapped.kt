// port-lint: source Windows/Win32/System/IO/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

// Upstream lines 37-47 in Windows/Win32/System/IO/mod.rs:
//   #[repr(C)]
//   #[derive(Clone, Copy)]
//   pub struct OVERLAPPED {
//       pub Internal: usize,
//       pub InternalHigh: usize,
//       pub Anonymous: OVERLAPPED_0,
//       pub hEvent: super::super::Foundation::HANDLE,
//   }

public data class OVERLAPPED(
    public var Internal: ULong = 0uL,
    public var InternalHigh: ULong = 0uL,
    public var Offset: UInt = 0u,
    public var OffsetHigh: UInt = 0u,
    public var hEvent: HANDLE = 0L,
)
