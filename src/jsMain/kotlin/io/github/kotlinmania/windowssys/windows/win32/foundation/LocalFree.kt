// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.WindowsSysNative

// Upstream line 8 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn LocalFree(hmem : HLOCAL) -> HLOCAL);
//
// Kotlin/JS wrapper delegating to the N-API native bindings.

public fun LocalFree(hmem: HLOCAL): HLOCAL =
    WindowsSysNative.LocalFree(hmem.toDouble()).toLong()
