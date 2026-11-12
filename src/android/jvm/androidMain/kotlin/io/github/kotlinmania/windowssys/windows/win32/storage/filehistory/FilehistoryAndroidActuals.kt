@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

private object WindowsWin32StorageFilehistoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup(pipe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceClosePipe(pipe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe(startserviceifstopped: Int, pipe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration(pipe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceStartBackup(pipe: Long, lowpriorityio: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceStopBackup(pipe: Long, stoptracking: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup(pipe: Long): Int
}

public actual fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup(pipe.rawAddress)

public actual fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceClosePipe(pipe.rawAddress)

public actual fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: MutPtr): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe(startserviceifstopped, pipe.rawAddress)

public actual fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration(pipe.rawAddress)

public actual fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceStartBackup(pipe.rawAddress, lowpriorityio)

public actual fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceStopBackup(pipe.rawAddress, stoptracking)

public actual fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup(pipe.rawAddress)
