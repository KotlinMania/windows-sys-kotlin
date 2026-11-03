// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

// Upstream line 16 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysAllocStringLen(strin : windows_sys::core::PCWSTR, ui : u32)
//           -> windows_sys::core::BSTR);

public fun SysAllocStringLen(strin: PCWSTR, ui: UInt): BSTR =
    throw UnsupportedOperationException("SysAllocStringLen requires Windows N-API addon")
