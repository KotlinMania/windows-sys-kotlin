package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public expect fun wnvOpen(): Handle

public expect fun wnvRequestNotification(wnvhandle: Handle, notificationparam: MutPtr<WnvNotificationParam>, overlapped: MutPtr<Overlapped>, bytestransferred: MutPtr<UInt>): UInt
