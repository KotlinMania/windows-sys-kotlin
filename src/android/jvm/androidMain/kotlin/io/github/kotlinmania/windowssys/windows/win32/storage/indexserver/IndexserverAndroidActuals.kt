@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32StorageIndexserverJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_indexserver_BindIFilterFromStorage(pstg: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_indexserver_BindIFilterFromStream(pstm: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_indexserver_LoadIFilter(pwcspath: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_indexserver_LoadIFilterEx(pwcspath: Long, dwflags: Int, riid: Long, ppiunk: Long): Int
}

public actual fun BindIFilterFromStorage(pstg: Long, punkouter: Long, ppiunk: Long): HRESULT =
    WindowsWin32StorageIndexserverJniBridge.windowssys_windows_win32_storage_indexserver_BindIFilterFromStorage(pstg, punkouter, ppiunk)

public actual fun BindIFilterFromStream(pstm: Long, punkouter: Long, ppiunk: Long): HRESULT =
    WindowsWin32StorageIndexserverJniBridge.windowssys_windows_win32_storage_indexserver_BindIFilterFromStream(pstm, punkouter, ppiunk)

public actual fun LoadIFilter(pwcspath: PCWSTR, punkouter: Long, ppiunk: Long): HRESULT =
    WindowsWin32StorageIndexserverJniBridge.windowssys_windows_win32_storage_indexserver_LoadIFilter(pwcspath, punkouter, ppiunk)

public actual fun LoadIFilterEx(pwcspath: PCWSTR, dwflags: UInt, riid: Long, ppiunk: Long): HRESULT =
    WindowsWin32StorageIndexserverJniBridge.windowssys_windows_win32_storage_indexserver_LoadIFilterEx(pwcspath, dwflags.toInt(), riid, ppiunk)
