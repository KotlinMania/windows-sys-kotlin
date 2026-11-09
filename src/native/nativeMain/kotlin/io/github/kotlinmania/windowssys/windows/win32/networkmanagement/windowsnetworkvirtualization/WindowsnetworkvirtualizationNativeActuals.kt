@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun WnvOpen(): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization.cinterop.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_WnvOpen()?.toLong() ?: 0L

public actual fun WnvRequestNotification(wnvhandle: HANDLE, notificationparam: Long, overlapped: Long, bytestransferred: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization.cinterop.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_WnvRequestNotification(wnvhandle.toCPointer<ByteVar>(), notificationparam.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>(), bytestransferred.toCPointer<ByteVar>())
