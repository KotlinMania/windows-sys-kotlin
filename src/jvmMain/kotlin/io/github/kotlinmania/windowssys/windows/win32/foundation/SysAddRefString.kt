// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

// Upstream line 13 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysAddRefString(bstrstring : windows_sys::core::BSTR)
//           -> windows_sys::core::HRESULT);

public fun SysAddRefString(bstrstring: BSTR): HRESULT =
    Kernel32Jni.SysAddRefString(bstrstring)
