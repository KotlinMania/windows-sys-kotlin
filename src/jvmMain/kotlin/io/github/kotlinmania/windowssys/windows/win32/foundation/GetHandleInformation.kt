// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

// Upstream line 5 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn GetHandleInformation(hobject : HANDLE, lpdwflags : *mut u32)
//           -> windows_sys::core::BOOL);

public fun GetHandleInformation(hobject: HANDLE, lpdwflags: UIntArray): BOOL {
    val arr = IntArray(1) { lpdwflags[0].toInt() }
    val res = Kernel32Jni.GetHandleInformation(hobject, arr)
    lpdwflags[0] = arr[0].toUInt()
    return res
}
