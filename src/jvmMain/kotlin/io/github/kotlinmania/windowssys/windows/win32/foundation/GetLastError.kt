// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.internal.Kernel32Jna

// Upstream line 6 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn GetLastError() -> WIN32_ERROR);

public fun GetLastError(): WIN32_ERROR = Kernel32Jna.INSTANCE.GetLastError().toUInt()
