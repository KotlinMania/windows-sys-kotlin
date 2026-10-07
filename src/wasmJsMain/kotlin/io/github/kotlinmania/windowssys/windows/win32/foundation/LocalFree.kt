// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream line 8 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn LocalFree(hmem : HLOCAL) -> HLOCAL);

public fun LocalFree(hmem: HLOCAL): HLOCAL =
    throw UnsupportedOperationException("LocalFree requires Windows N-API addon")
