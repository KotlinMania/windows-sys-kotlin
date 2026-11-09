package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun WnvOpen(): HANDLE

public expect fun WnvRequestNotification(wnvhandle: HANDLE, notificationparam: Long, overlapped: Long, bytestransferred: Long): UInt
