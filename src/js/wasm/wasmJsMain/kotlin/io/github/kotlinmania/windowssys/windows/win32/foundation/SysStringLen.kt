// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR

// Upstream line 22 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysStringLen(pbstr : windows_sys::core::BSTR) -> u32);

public fun SysStringLen(pbstr: BSTR): UInt =
    throw UnsupportedOperationException("SysStringLen requires Windows N-API addon")
