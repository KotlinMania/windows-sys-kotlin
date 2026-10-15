// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetFileType(hfile: HANDLE): FILE_TYPE =
    WindowsSysNative.GetFileType(hfile.toDouble()).toUInt()
