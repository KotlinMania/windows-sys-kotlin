// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.internal.Kernel32Jni

// Upstream line 11 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn SetLastError(dwerrcode : WIN32_ERROR));

public fun SetLastError(dwerrcode: WIN32_ERROR): Unit =
    Kernel32Jni.SetLastError(dwerrcode.toInt())
