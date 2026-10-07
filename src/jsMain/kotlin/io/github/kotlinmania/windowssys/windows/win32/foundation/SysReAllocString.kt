// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PCWSTR

// Upstream line 18 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysReAllocString(pbstr : *mut windows_sys::core::BSTR,
//                           psz : windows_sys::core::PCWSTR) -> i32);

public fun SysReAllocString(pbstr: LongArray, psz: PCWSTR): Int {
    val newBstr = WindowsSysNative.SysAllocString(psz.toDouble()).toLong()
    if (newBstr != 0L) {
        if (pbstr[0] != 0L) {
            WindowsSysNative.SysFreeString(pbstr[0].toDouble())
        }
        pbstr[0] = newBstr
        return 1
    }
    return 0
}
