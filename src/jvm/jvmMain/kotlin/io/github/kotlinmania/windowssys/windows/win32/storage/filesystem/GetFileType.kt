// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetFileType(hfile: HANDLE): FILE_TYPE =
    Kernel32Jni.GetFileType(hfile).toUInt()
