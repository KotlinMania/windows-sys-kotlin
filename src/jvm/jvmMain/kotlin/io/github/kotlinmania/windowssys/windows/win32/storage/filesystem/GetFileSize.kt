// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetFileSize(hfile: HANDLE, lpfilesizehigh: UIntArray?): UInt {
    if (lpfilesizehigh == null) {
        return Kernel32Jni.GetFileSize(hfile, null).toUInt()
    }
    val arr = IntArray(1) { lpfilesizehigh[0].toInt() }
    val res = Kernel32Jni.GetFileSize(hfile, arr).toUInt()
    lpfilesizehigh[0] = arr[0].toUInt()
    return res
}
