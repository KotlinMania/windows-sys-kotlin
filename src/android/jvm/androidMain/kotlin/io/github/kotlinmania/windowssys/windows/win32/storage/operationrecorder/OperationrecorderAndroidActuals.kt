@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32StorageOperationrecorderJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageOperationrecorderOperationEnd(operationendparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageOperationrecorderOperationStart(operationstartparams: Long): Int
}

public actual fun operationEnd(operationendparams: ConstPtr<OperationEndParameters>): Bool =
    WindowsWin32StorageOperationrecorderJniBridge.windowssysWindowsWin32StorageOperationrecorderOperationEnd(operationendparams.rawAddress)

public actual fun operationStart(operationstartparams: ConstPtr<OperationStartParameters>): Bool =
    WindowsWin32StorageOperationrecorderJniBridge.windowssysWindowsWin32StorageOperationrecorderOperationStart(operationstartparams.rawAddress)
