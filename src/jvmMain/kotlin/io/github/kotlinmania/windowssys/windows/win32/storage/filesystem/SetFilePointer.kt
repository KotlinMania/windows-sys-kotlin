// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SetFilePointer(
    hfile: HANDLE,
    ldistancetomove: Int,
    lpdistancetomovehigh: IntArray?,
    dwmovemethod: SET_FILE_POINTER_MOVE_METHOD,
): UInt =
    Kernel32Jni.SetFilePointer(hfile, ldistancetomove, lpdistancetomovehigh, dwmovemethod.toInt()).toUInt()
