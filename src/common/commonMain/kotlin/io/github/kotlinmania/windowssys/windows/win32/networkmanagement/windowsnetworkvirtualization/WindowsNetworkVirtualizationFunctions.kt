package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun wnvOpen(): Handle

public expect fun wnvRequestNotification(wnvhandle: Handle, notificationparam: MutPtr, overlapped: MutPtr, bytestransferred: MutPtr): UInt
