// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

// Upstream line 14 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysAllocString(psz : windows_sys::core::PCWSTR)
//           -> windows_sys::core::BSTR);

public fun SysAllocString(psz: PCWSTR): BSTR = Kernel32Jni.SysAllocString(psz)
