package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun WnvOpen(): HANDLE {
    return Win32DynamicFfi.invoke("wnvapi.dll", "WnvOpen", longArrayOf())
}

public fun WnvRequestNotification(wnvhandle: HANDLE, notificationparam: Long, overlapped: Long, bytestransferred: Long): UInt {
    return Win32DynamicFfi.invoke("wnvapi.dll", "WnvRequestNotification", longArrayOf(wnvhandle, notificationparam, overlapped, bytestransferred)).toUInt()
}
