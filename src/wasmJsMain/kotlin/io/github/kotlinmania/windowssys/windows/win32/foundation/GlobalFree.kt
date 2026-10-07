// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream line 7 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn GlobalFree(hmem : HGLOBAL) -> HGLOBAL);

public fun GlobalFree(hmem: HGLOBAL): HGLOBAL =
    throw UnsupportedOperationException("GlobalFree requires Windows N-API addon")
