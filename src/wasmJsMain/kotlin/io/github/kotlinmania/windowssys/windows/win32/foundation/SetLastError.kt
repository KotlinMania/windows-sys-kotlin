// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream line 11 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn SetLastError(dwerrcode : WIN32_ERROR));

public fun SetLastError(dwerrcode: WIN32_ERROR): Unit =
    throw UnsupportedOperationException("SetLastError requires Windows N-API addon")
