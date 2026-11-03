// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_file_information_by_handle
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import platform.windows.BY_HANDLE_FILE_INFORMATION as CByHandleFileInfo

public fun GetFileInformationByHandle(
    hfile: HANDLE,
    lpfileinformation: Long,
): BOOL =
    windows_sys_get_file_information_by_handle(
        hfile.toCPointer(),
        lpfileinformation.toCPointer(),
    )

public fun GetFileInformationByHandle(
    hfile: HANDLE,
    lpfileinformation: BY_HANDLE_FILE_INFORMATION,
): BOOL =
    memScoped {
        val nativeInfo = alloc<CByHandleFileInfo>()
        val res = windows_sys_get_file_information_by_handle(hfile.toCPointer(), nativeInfo.ptr)
        if (res != 0) {
            lpfileinformation.dwFileAttributes = nativeInfo.dwFileAttributes
            lpfileinformation.ftCreationTime =
                FILETIME(
                    dwLowDateTime = nativeInfo.ftCreationTime.dwLowDateTime,
                    dwHighDateTime = nativeInfo.ftCreationTime.dwHighDateTime,
                )
            lpfileinformation.ftLastAccessTime =
                FILETIME(
                    dwLowDateTime = nativeInfo.ftLastAccessTime.dwLowDateTime,
                    dwHighDateTime = nativeInfo.ftLastAccessTime.dwHighDateTime,
                )
            lpfileinformation.ftLastWriteTime =
                FILETIME(
                    dwLowDateTime = nativeInfo.ftLastWriteTime.dwLowDateTime,
                    dwHighDateTime = nativeInfo.ftLastWriteTime.dwHighDateTime,
                )
            lpfileinformation.dwVolumeSerialNumber = nativeInfo.dwVolumeSerialNumber
            lpfileinformation.nFileSizeHigh = nativeInfo.nFileSizeHigh
            lpfileinformation.nFileSizeLow = nativeInfo.nFileSizeLow
            lpfileinformation.nNumberOfLinks = nativeInfo.nNumberOfLinks
            lpfileinformation.nFileIndexHigh = nativeInfo.nFileIndexHigh
            lpfileinformation.nFileIndexLow = nativeInfo.nFileIndexLow
        }
        res
    }
