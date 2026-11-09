@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun GetExtensionVersion(pver: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssys_windows_win32_system_iis_GetExtensionVersion(pver.toCPointer<ByteVar>())

public actual fun GetFilterVersion(pver: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssys_windows_win32_system_iis_GetFilterVersion(pver.toCPointer<ByteVar>())

public actual fun HttpExtensionProc(pecb: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssys_windows_win32_system_iis_HttpExtensionProc(pecb.toCPointer<ByteVar>())

public actual fun HttpFilterProc(pfc: Long, notificationtype: UInt, pvnotification: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssys_windows_win32_system_iis_HttpFilterProc(pfc.toCPointer<ByteVar>(), notificationtype, pvnotification.toCPointer<ByteVar>())
