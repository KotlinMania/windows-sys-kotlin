package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun WnvOpen(): Foundation.HANDLE {
    Win32DynamicFfi.invoke("wnvapi.dll", "WnvOpen", longArrayOf())
    return Foundation.HANDLE()
}

public fun WnvRequestNotification(wnvhandle: Foundation.HANDLE, notificationparam: Long, overlapped: Long, bytestransferred: Long): UInt {
    return Win32DynamicFfi.invoke("wnvapi.dll", "WnvRequestNotification", longArrayOf(Win32DynamicFfi.objectSlot(wnvhandle), notificationparam, overlapped, bytestransferred)).toUInt()
}
