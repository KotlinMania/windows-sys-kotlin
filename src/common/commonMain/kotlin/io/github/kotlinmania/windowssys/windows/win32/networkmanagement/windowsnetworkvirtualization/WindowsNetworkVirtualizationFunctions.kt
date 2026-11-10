package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun wnvOpen(): Handle

public expect fun wnvRequestNotification(wnvhandle: Handle, notificationparam: COpaquePointer?, overlapped: COpaquePointer?, bytestransferred: COpaquePointer?): UInt
