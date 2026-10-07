// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

// Upstream line 12 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn SetHandleInformation(hobject : HANDLE,
//                               dwmask : u32,
//                               dwflags : u32)
//           -> windows_sys::core::BOOL);

public fun SetHandleInformation(
    hobject: HANDLE,
    dwmask: UInt,
    dwflags: UInt,
): BOOL =
    Kernel32Jni.SetHandleInformation(hobject, dwmask.toInt(), dwflags.toInt())
