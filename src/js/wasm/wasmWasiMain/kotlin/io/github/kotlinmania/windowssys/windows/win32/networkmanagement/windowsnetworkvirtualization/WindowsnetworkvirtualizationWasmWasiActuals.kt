@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun WnvOpen(): HANDLE =
    0L

public actual fun WnvRequestNotification(wnvhandle: HANDLE, notificationparam: Long, overlapped: Long, bytestransferred: Long): UInt =
    0u
