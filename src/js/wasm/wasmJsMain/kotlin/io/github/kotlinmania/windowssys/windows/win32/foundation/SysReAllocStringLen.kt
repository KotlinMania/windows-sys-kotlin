// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.PCWSTR

// Upstream line 19 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysReAllocStringLen(pbstr : *mut windows_sys::core::BSTR,
//                            psz : windows_sys::core::PCWSTR,
//                            len : u32) -> i32);

public fun SysReAllocStringLen(pbstr: LongArray, psz: PCWSTR, len: UInt): Int =
    throw UnsupportedOperationException("SysReAllocStringLen requires Windows N-API addon")
