// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.toCPointer
import platform.windows.FreeLibrary as winFreeLibrary

// Upstream line 4 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn FreeLibrary(hlibmodule : HMODULE) -> windows_sys::core::BOOL);
//
// Decrements the reference count of a loaded DLL. Direct wrapper
// around `platform.windows.FreeLibrary` (kernel32.dll).

public fun FreeLibrary(hlibmodule: HMODULE): BOOL = winFreeLibrary(hlibmodule.toCPointer())