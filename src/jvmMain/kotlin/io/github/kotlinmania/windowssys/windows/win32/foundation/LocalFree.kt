// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.internal.Kernel32Jni

// Upstream line 7 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn LocalFree(hmem : HLOCAL) -> HLOCAL);

public fun LocalFree(hmem: HLOCAL): HLOCAL =
    Kernel32Jni.LocalFree(hmem)
