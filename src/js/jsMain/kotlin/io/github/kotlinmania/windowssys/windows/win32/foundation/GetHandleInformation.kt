// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL

// Upstream line 5 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn GetHandleInformation(hobject : HANDLE, lpdwflags : *mut u32)
//           -> windows_sys::core::BOOL);

public fun GetHandleInformation(hobject: HANDLE, lpdwflags: UIntArray): BOOL {
    val res = WindowsSysNative.GetHandleInformation(hobject.toDouble())
    if (res != null) {
        val success = (res.success as? Number)?.toInt() ?: 0
        val flags = (res.flags as? Number)?.toInt() ?: 0
        lpdwflags[0] = flags.toUInt()
        return success
    }
    return 0
}
