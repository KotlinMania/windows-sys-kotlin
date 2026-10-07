// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL

// Upstream line 4 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn FreeLibrary(hlibmodule : HMODULE) -> windows_sys::core::BOOL);

public fun FreeLibrary(hlibmodule: HMODULE): BOOL =
    WindowsSysNative.FreeLibrary(hlibmodule.toDouble())
