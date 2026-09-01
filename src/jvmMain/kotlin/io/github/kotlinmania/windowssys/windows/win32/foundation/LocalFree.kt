// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import com.sun.jna.Pointer
import io.github.kotlinmania.windowssys.internal.Kernel32Jna

// Upstream line 8 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn LocalFree(hmem : HLOCAL) -> HLOCAL);
//
// Returns null on success, the original handle on failure. JNA returns
// `Pointer?` — bridge back to the port's `Long` typealias via
// `Pointer.nativeValue` (or `0L` for null).

public fun LocalFree(hmem: HLOCAL): HLOCAL =
    Kernel32Jna.INSTANCE.LocalFree(Pointer(hmem))?.let { Pointer.nativeValue(it) } ?: 0L
