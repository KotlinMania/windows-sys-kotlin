@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvOpen(): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvRequestNotification(wnvhandle: Long, notificationparam: Long, overlapped: Long, bytestransferred: Long): Int
}

public actual fun wnvOpen(): Handle =
    WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvOpen().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wnvRequestNotification(wnvhandle: Handle, notificationparam: COpaquePointer?, overlapped: COpaquePointer?, bytestransferred: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvRequestNotification((wnvhandle?.value ?: 0L), (notificationparam?.value ?: 0L), (overlapped?.value ?: 0L), (bytestransferred?.value ?: 0L)).toUInt()
