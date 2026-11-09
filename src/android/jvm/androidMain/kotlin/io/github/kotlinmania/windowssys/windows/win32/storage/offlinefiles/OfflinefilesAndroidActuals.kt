@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.windowssys.core.BOOL

private object WindowsWin32StorageOfflinefilesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_offlinefiles_OfflineFilesEnable(benable: Int, pbrebootrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_offlinefiles_OfflineFilesQueryStatus(pbactive: Long, pbenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_offlinefiles_OfflineFilesQueryStatusEx(pbactive: Long, pbenabled: Long, pbavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_offlinefiles_OfflineFilesStart(): Int
}

public actual fun OfflineFilesEnable(benable: BOOL, pbrebootrequired: Long): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssys_windows_win32_storage_offlinefiles_OfflineFilesEnable(benable, pbrebootrequired).toUInt()

public actual fun OfflineFilesQueryStatus(pbactive: Long, pbenabled: Long): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssys_windows_win32_storage_offlinefiles_OfflineFilesQueryStatus(pbactive, pbenabled).toUInt()

public actual fun OfflineFilesQueryStatusEx(pbactive: Long, pbenabled: Long, pbavailable: Long): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssys_windows_win32_storage_offlinefiles_OfflineFilesQueryStatusEx(pbactive, pbenabled, pbavailable).toUInt()

public actual fun OfflineFilesStart(): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssys_windows_win32_storage_offlinefiles_OfflineFilesStart().toUInt()
