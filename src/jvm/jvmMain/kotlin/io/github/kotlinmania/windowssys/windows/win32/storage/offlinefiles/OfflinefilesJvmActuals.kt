@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32StorageOfflinefilesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_offlinefiles_offlineFilesEnable(benable: Int, pbrebootrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatus(pbactive: Long, pbenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatusEx(pbactive: Long, pbenabled: Long, pbavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_offlinefiles_offlineFilesStart(): Int
}

public actual fun offlineFilesEnable(benable: Bool, pbrebootrequired: COpaquePointer?): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssys_windows_win32_storage_offlinefiles_offlineFilesEnable(benable, (pbrebootrequired?.value ?: 0L)).toUInt()

public actual fun offlineFilesQueryStatus(pbactive: COpaquePointer?, pbenabled: COpaquePointer?): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatus((pbactive?.value ?: 0L), (pbenabled?.value ?: 0L)).toUInt()

public actual fun offlineFilesQueryStatusEx(pbactive: COpaquePointer?, pbenabled: COpaquePointer?, pbavailable: COpaquePointer?): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatusEx((pbactive?.value ?: 0L), (pbenabled?.value ?: 0L), (pbavailable?.value ?: 0L)).toUInt()

public actual fun offlineFilesStart(): UInt =
    WindowsWin32StorageOfflinefilesJniBridge.windowssys_windows_win32_storage_offlinefiles_offlineFilesStart().toUInt()
