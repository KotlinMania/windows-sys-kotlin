@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getExtensionVersion(pver: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssys_windows_win32_system_iis_getExtensionVersion(pver?.value?.toCPointer<ByteVar>())

public actual fun getFilterVersion(pver: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssys_windows_win32_system_iis_getFilterVersion(pver?.value?.toCPointer<ByteVar>())

public actual fun httpExtensionProc(pecb: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssys_windows_win32_system_iis_httpExtensionProc(pecb?.value?.toCPointer<ByteVar>())

public actual fun httpFilterProc(pfc: COpaquePointer?, notificationtype: UInt, pvnotification: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssys_windows_win32_system_iis_httpFilterProc(pfc?.value?.toCPointer<ByteVar>(), notificationtype, pvnotification?.value?.toCPointer<ByteVar>())
