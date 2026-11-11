@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization.cinterop.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvOpen
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization.cinterop.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvRequestNotification
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun wnvOpen(): Handle =
    windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvOpen()?.let { COpaquePointer(it.toLong()) }

public actual fun wnvRequestNotification(wnvhandle: Handle, notificationparam: COpaquePointer?, overlapped: COpaquePointer?, bytestransferred: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvRequestNotification(wnvhandle?.value?.toCPointer<ByteVar>(), notificationparam?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>(), bytestransferred?.value?.toCPointer<ByteVar>())
