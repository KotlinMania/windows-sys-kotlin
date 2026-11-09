@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

private object WindowsWin32StorageFilehistoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_FhServiceBlockBackup(pipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_FhServiceClosePipe(pipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_FhServiceOpenPipe(startserviceifstopped: Int, pipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_FhServiceReloadConfiguration(pipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_FhServiceStartBackup(pipe: Long, lowpriorityio: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_FhServiceStopBackup(pipe: Long, stoptracking: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filehistory_FhServiceUnblockBackup(pipe: Long): Int
}

public actual fun FhServiceBlockBackup(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_FhServiceBlockBackup(pipe)

public actual fun FhServiceClosePipe(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_FhServiceClosePipe(pipe)

public actual fun FhServiceOpenPipe(startserviceifstopped: BOOL, pipe: Long): HRESULT =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_FhServiceOpenPipe(startserviceifstopped, pipe)

public actual fun FhServiceReloadConfiguration(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_FhServiceReloadConfiguration(pipe)

public actual fun FhServiceStartBackup(pipe: FH_SERVICE_PIPE_HANDLE, lowpriorityio: BOOL): HRESULT =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_FhServiceStartBackup(pipe, lowpriorityio)

public actual fun FhServiceStopBackup(pipe: FH_SERVICE_PIPE_HANDLE, stoptracking: BOOL): HRESULT =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_FhServiceStopBackup(pipe, stoptracking)

public actual fun FhServiceUnblockBackup(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    WindowsWin32StorageFilehistoryJniBridge.windowssys_windows_win32_storage_filehistory_FhServiceUnblockBackup(pipe)
