@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder.cinterop.windowssysWindowsWin32StorageOperationrecorderOperationEnd
import io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder.cinterop.windowssysWindowsWin32StorageOperationrecorderOperationStart
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun operationEnd(operationendparams: ConstPtr<OperationEndParameters>): Bool =
    windowssysWindowsWin32StorageOperationrecorderOperationEnd(operationendparams.rawAddress.toCPointer<ByteVar>())

public actual fun operationStart(operationstartparams: ConstPtr<OperationStartParameters>): Bool =
    windowssysWindowsWin32StorageOperationrecorderOperationStart(operationstartparams.rawAddress.toCPointer<ByteVar>())
