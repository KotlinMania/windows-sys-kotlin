// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BSTR

// Upstream line 20 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysReleaseString(bstrstring : windows_sys::core::BSTR));

public fun SysReleaseString(bstrstring: BSTR): Unit =
    WindowsSysNative.SysReleaseString(bstrstring.toDouble())
