// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PCWSTR

// Upstream line 19 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysReAllocStringLen(pbstr : *mut windows_sys::core::BSTR,
//                            psz : windows_sys::core::PCWSTR,
//                            len : u32) -> i32);

public fun SysReAllocStringLen(pbstr: LongArray, psz: PCWSTR, len: UInt): Int {
    val newBstr = WindowsSysNative.SysAllocStringLen(psz.toDouble(), len.toInt()).toLong()
    if (newBstr != 0L) {
        if (pbstr[0] != 0L) {
            WindowsSysNative.SysFreeString(pbstr[0].toDouble())
        }
        pbstr[0] = newBstr
        return 1
    }
    return 0
}
