// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import platform.windows.SetLastErrorEx as winSetLastErrorEx

// Upstream line 12 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("user32.dll" "system"
//       fn SetLastErrorEx(dwerrcode : WIN32_ERROR, dwtype : u32));
//
// Sets the calling thread's last-error code with an optional type
// indicator. Direct wrapper around `platform.windows.SetLastErrorEx`
// (user32.dll).

public fun SetLastErrorEx(dwerrcode: WIN32_ERROR, dwtype: UInt): Unit =
    winSetLastErrorEx(dwerrcode, dwtype)