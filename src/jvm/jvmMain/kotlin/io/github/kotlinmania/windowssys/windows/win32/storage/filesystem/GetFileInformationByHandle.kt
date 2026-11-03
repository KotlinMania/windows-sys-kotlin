// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetFileInformationByHandle(
    hfile: HANDLE,
    lpfileinformation: Long,
): BOOL = Kernel32Jni.GetFileInformationByHandle(hfile, lpfileinformation)

public fun GetFileInformationByHandle(
    hfile: HANDLE,
    lpfileinformation: BY_HANDLE_FILE_INFORMATION,
): BOOL {
    val outFields = IntArray(13)
    val res = Kernel32Jni.GetFileInformationByHandleStruct(hfile, outFields)
    if (res != 0) {
        lpfileinformation.dwFileAttributes = outFields[0].toUInt()
        lpfileinformation.ftCreationTime =
            FILETIME(
                dwLowDateTime = outFields[1].toUInt(),
                dwHighDateTime = outFields[2].toUInt(),
            )
        lpfileinformation.ftLastAccessTime =
            FILETIME(
                dwLowDateTime = outFields[3].toUInt(),
                dwHighDateTime = outFields[4].toUInt(),
            )
        lpfileinformation.ftLastWriteTime =
            FILETIME(
                dwLowDateTime = outFields[5].toUInt(),
                dwHighDateTime = outFields[6].toUInt(),
            )
        lpfileinformation.dwVolumeSerialNumber = outFields[7].toUInt()
        lpfileinformation.nFileSizeHigh = outFields[8].toUInt()
        lpfileinformation.nFileSizeLow = outFields[9].toUInt()
        lpfileinformation.nNumberOfLinks = outFields[10].toUInt()
        lpfileinformation.nFileIndexHigh = outFields[11].toUInt()
        lpfileinformation.nFileIndexLow = outFields[12].toUInt()
    }
    return res
}
