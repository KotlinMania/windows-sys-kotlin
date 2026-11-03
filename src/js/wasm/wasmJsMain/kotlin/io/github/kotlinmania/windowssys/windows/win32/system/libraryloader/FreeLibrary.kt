// port-lint: source Windows/Win32/System/LibraryLoader/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.FreeLibrary as foundationFreeLibrary

public fun FreeLibrary(hlibmodule: HMODULE): BOOL = foundationFreeLibrary(hlibmodule)
