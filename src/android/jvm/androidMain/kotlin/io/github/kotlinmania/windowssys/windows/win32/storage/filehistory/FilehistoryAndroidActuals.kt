@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

private object WindowsWin32StorageFilehistoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_fhServiceBlockBackup(pipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_fhServiceClosePipe(pipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_fhServiceOpenPipe(startserviceifstopped: Int, pipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_fhServiceReloadConfiguration(pipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_fhServiceStartBackup(pipe: Long, lowpriorityio: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_fhServiceStopBackup(pipe: Long, stoptracking: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_fhServiceUnblockBackup(pipe: Long): Int
}

public actual fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_fhServiceBlockBackup((pipe?.value ?: 0L))

public actual fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_fhServiceClosePipe((pipe?.value ?: 0L))

public actual fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: COpaquePointer?): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_fhServiceOpenPipe(startserviceifstopped, (pipe?.value ?: 0L))

public actual fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_fhServiceReloadConfiguration((pipe?.value ?: 0L))

public actual fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_fhServiceStartBackup((pipe?.value ?: 0L), lowpriorityio)

public actual fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_fhServiceStopBackup((pipe?.value ?: 0L), stoptracking)

public actual fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_fhServiceUnblockBackup((pipe?.value ?: 0L))
