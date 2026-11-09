@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_WnvOpen(): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_WnvRequestNotification(wnvhandle: Long, notificationparam: Long, overlapped: Long, bytestransferred: Long): Int
}

public actual fun WnvOpen(): HANDLE =
    WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_WnvOpen()

public actual fun WnvRequestNotification(wnvhandle: HANDLE, notificationparam: Long, overlapped: Long, bytestransferred: Long): UInt =
    WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_WnvRequestNotification(wnvhandle, notificationparam, overlapped, bytestransferred).toUInt()
