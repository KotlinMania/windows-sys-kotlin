// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR

public fun DeleteFileA(lpfilename: PCSTR): BOOL =
    WindowsSysNative.DeleteFileA(lpfilename.toDouble())
