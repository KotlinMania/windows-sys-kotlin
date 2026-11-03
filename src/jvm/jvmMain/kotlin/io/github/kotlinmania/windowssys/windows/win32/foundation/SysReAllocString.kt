// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

// Upstream line 18 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysReAllocString(pbstr : *mut windows_sys::core::BSTR,
//                           psz : windows_sys::core::PCWSTR) -> i32);

public fun SysReAllocString(pbstr: LongArray, psz: PCWSTR): Int =
    Kernel32Jni.SysReAllocString(pbstr, psz)
