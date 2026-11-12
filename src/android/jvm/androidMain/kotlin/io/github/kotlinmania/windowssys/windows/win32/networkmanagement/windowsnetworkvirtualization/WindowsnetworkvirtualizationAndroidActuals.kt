@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsnetworkvirtualizationWnvOpen(): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsnetworkvirtualizationWnvRequestNotification(wnvhandle: Long, notificationparam: Long, overlapped: Long, bytestransferred: Long): Int
}

public actual fun wnvOpen(): Handle =
    MutPtr(WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge.windowssysWindowsWin32NetworkmanagementWindowsnetworkvirtualizationWnvOpen())

public actual fun wnvRequestNotification(wnvhandle: Handle, notificationparam: MutPtr, overlapped: MutPtr, bytestransferred: MutPtr): UInt =
    WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge.windowssysWindowsWin32NetworkmanagementWindowsnetworkvirtualizationWnvRequestNotification(wnvhandle.rawAddress, notificationparam.rawAddress, overlapped.rawAddress, bytestransferred.rawAddress).toUInt()
