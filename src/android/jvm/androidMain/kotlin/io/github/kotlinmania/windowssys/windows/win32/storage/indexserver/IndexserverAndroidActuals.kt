@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32StorageIndexserverJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage(pstg: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIndexserverBindIFilterFromStream(pstm: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIndexserverLoadIFilter(pwcspath: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIndexserverLoadIFilterEx(pwcspath: Long, dwflags: Int, riid: Long, ppiunk: Long): Int
}

public actual fun bindIFilterFromStorage(pstg: MutPtr<CVoid>, punkouter: MutPtr<CVoid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage(pstg.rawAddress, punkouter.rawAddress, ppiunk.rawAddress)

public actual fun bindIFilterFromStream(pstm: MutPtr<CVoid>, punkouter: MutPtr<CVoid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssysWindowsWin32StorageIndexserverBindIFilterFromStream(pstm.rawAddress, punkouter.rawAddress, ppiunk.rawAddress)

public actual fun loadIFilter(pwcspath: Pcwstr, punkouter: MutPtr<CVoid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssysWindowsWin32StorageIndexserverLoadIFilter(pwcspath.rawAddress, punkouter.rawAddress, ppiunk.rawAddress)

public actual fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: ConstPtr<Guid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssysWindowsWin32StorageIndexserverLoadIFilterEx(pwcspath.rawAddress, dwflags.toInt(), riid.rawAddress, ppiunk.rawAddress)
