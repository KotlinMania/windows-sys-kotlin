@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun OperationEnd(operationendparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder.cinterop.windowssys_windows_win32_storage_operationrecorder_OperationEnd(operationendparams.toCPointer<ByteVar>())

public actual fun OperationStart(operationstartparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder.cinterop.windowssys_windows_win32_storage_operationrecorder_OperationStart(operationstartparams.toCPointer<ByteVar>())
