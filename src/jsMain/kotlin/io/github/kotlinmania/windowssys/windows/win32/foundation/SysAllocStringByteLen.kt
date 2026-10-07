// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.PCSTR

// Upstream line 15 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysAllocStringByteLen(psz : windows_sys::core::PCSTR, len : u32)
//           -> windows_sys::core::BSTR);

public fun SysAllocStringByteLen(psz: PCSTR, len: UInt): BSTR =
    WindowsSysNative.SysAllocStringByteLen(psz.toDouble(), len.toInt()).toLong()
