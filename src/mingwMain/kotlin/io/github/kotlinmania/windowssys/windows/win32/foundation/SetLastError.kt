// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import platform.windows.SetLastError as winSetLastError

// Upstream line 11 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn SetLastError(dwerrcode : WIN32_ERROR));
//
// Sets the calling thread's last-error code. Direct wrapper around
// `platform.windows.SetLastError` (kernel32.dll).

public fun SetLastError(dwerrcode: WIN32_ERROR): Unit = winSetLastError(dwerrcode)
