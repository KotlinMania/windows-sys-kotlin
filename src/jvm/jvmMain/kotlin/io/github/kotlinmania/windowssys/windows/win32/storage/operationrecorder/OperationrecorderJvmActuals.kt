@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.windowssys.core.BOOL

private object WindowsWin32StorageOperationrecorderJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_operationrecorder_OperationEnd(operationendparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_operationrecorder_OperationStart(operationstartparams: Long): Int
}

public actual fun OperationEnd(operationendparams: Long): BOOL =
    WindowsWin32StorageOperationrecorderJniBridge.windowssys_windows_win32_storage_operationrecorder_OperationEnd(operationendparams)

public actual fun OperationStart(operationstartparams: Long): BOOL =
    WindowsWin32StorageOperationrecorderJniBridge.windowssys_windows_win32_storage_operationrecorder_OperationStart(operationstartparams)
