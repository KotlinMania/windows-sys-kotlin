@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32StorageOfflinefilesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageOfflinefilesOfflineFilesEnable(benable: Int, pbrebootrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatus(pbactive: Long, pbenabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatusEx(pbactive: Long, pbenabled: Long, pbavailable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageOfflinefilesOfflineFilesStart(): Int
}

public actual fun offlineFilesEnable(benable: Bool, pbrebootrequired: MutPtr): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssysWindowsWin32StorageOfflinefilesOfflineFilesEnable(benable, pbrebootrequired.rawAddress).toUInt()

public actual fun offlineFilesQueryStatus(pbactive: MutPtr, pbenabled: MutPtr): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatus(pbactive.rawAddress, pbenabled.rawAddress).toUInt()

public actual fun offlineFilesQueryStatusEx(pbactive: MutPtr, pbenabled: MutPtr, pbavailable: MutPtr): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatusEx(pbactive.rawAddress, pbenabled.rawAddress, pbavailable.rawAddress).toUInt()

public actual fun offlineFilesStart(): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssysWindowsWin32StorageOfflinefilesOfflineFilesStart().toUInt()
