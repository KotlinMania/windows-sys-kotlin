@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization.cinterop.windowssysWindowsWin32NetworkmanagementWindowsnetworkvirtualizationWnvOpen
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization.cinterop.windowssysWindowsWin32NetworkmanagementWindowsnetworkvirtualizationWnvRequestNotification
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun wnvOpen(): Handle =
    MutPtr(windowssysWindowsWin32NetworkmanagementWindowsnetworkvirtualizationWnvOpen()?.toLong() ?: 0L)

public actual fun wnvRequestNotification(wnvhandle: Handle, notificationparam: MutPtr<WnvNotificationParam>, overlapped: MutPtr<Overlapped>, bytestransferred: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsnetworkvirtualizationWnvRequestNotification(wnvhandle.rawAddress.toCPointer<ByteVar>(), notificationparam.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>(), bytestransferred.rawAddress.toCPointer<ByteVar>())
