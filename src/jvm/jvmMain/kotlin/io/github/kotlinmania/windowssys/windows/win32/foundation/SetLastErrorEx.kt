// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.internal.Kernel32Jni

// Upstream line 12 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("user32.dll" "system"
//       fn SetLastErrorEx(dwerrcode : WIN32_ERROR, dwtype : u32));

public fun SetLastErrorEx(dwerrcode: WIN32_ERROR, dwtype: UInt): Unit =
    Kernel32Jni.SetLastErrorEx(dwerrcode.toInt(), dwtype.toInt())
