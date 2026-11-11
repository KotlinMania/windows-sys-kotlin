@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder.cinterop.windowssys_windows_win32_storage_operationrecorder_operationEnd
import io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder.cinterop.windowssys_windows_win32_storage_operationrecorder_operationStart
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun operationEnd(operationendparams: COpaquePointer?): Bool =
    windowssys_windows_win32_storage_operationrecorder_operationEnd(operationendparams?.value?.toCPointer<ByteVar>())

public actual fun operationStart(operationstartparams: COpaquePointer?): Bool =
    windowssys_windows_win32_storage_operationrecorder_operationStart(operationstartparams?.value?.toCPointer<ByteVar>())
