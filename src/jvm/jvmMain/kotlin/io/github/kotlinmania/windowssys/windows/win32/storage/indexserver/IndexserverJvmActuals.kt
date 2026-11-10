@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32StorageIndexserverJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_indexserver_bindIFilterFromStorage(pstg: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_indexserver_bindIFilterFromStream(pstm: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_indexserver_loadIFilter(pwcspath: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_indexserver_loadIFilterEx(pwcspath: Long, dwflags: Int, riid: Long, ppiunk: Long): Int
}

public actual fun bindIFilterFromStorage(pstg: COpaquePointer?, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssys_windows_win32_storage_indexserver_bindIFilterFromStorage((pstg?.value ?: 0L), (punkouter?.value ?: 0L), (ppiunk?.value ?: 0L))

public actual fun bindIFilterFromStream(pstm: COpaquePointer?, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssys_windows_win32_storage_indexserver_bindIFilterFromStream((pstm?.value ?: 0L), (punkouter?.value ?: 0L), (ppiunk?.value ?: 0L))

public actual fun loadIFilter(pwcspath: Pcwstr, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssys_windows_win32_storage_indexserver_loadIFilter((pwcspath?.value ?: 0L), (punkouter?.value ?: 0L), (ppiunk?.value ?: 0L))

public actual fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssys_windows_win32_storage_indexserver_loadIFilterEx((pwcspath?.value ?: 0L), dwflags.toInt(), (riid?.value ?: 0L), (ppiunk?.value ?: 0L))
