// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BSTR

// Upstream line 21 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysStringByteLen(bstr : windows_sys::core::BSTR) -> u32);

public fun SysStringByteLen(bstr: BSTR): UInt =
    WindowsSysNative.SysStringByteLen(bstr.toDouble()).toUInt()
