@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32StorageOperationrecorderJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_operationrecorder_operationEnd(operationendparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_operationrecorder_operationStart(operationstartparams: Long): Int
}

public actual fun operationEnd(operationendparams: COpaquePointer?): Bool =
    WindowsWin32StorageOperationrecorderJniBridge.windowssys_windows_win32_storage_operationrecorder_operationEnd((operationendparams?.value ?: 0L))

public actual fun operationStart(operationstartparams: COpaquePointer?): Bool =
    WindowsWin32StorageOperationrecorderJniBridge.windowssys_windows_win32_storage_operationrecorder_operationStart((operationstartparams?.value ?: 0L))
