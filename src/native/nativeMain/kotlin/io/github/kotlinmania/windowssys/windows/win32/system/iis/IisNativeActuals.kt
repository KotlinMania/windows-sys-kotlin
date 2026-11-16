@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssysWindowsWin32SystemIisGetExtensionVersion
import io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssysWindowsWin32SystemIisGetFilterVersion
import io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssysWindowsWin32SystemIisHttpExtensionProc
import io.github.kotlinmania.windowssys.windows.win32.system.iis.cinterop.windowssysWindowsWin32SystemIisHttpFilterProc
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getExtensionVersion(pver: MutPtr): Bool =
    windowssysWindowsWin32SystemIisGetExtensionVersion(pver.rawAddress.toCPointer<ByteVar>())

public actual fun getFilterVersion(pver: MutPtr): Bool =
    windowssysWindowsWin32SystemIisGetFilterVersion(pver.rawAddress.toCPointer<ByteVar>())

public actual fun httpExtensionProc(pecb: ConstPtr): UInt =
    windowssysWindowsWin32SystemIisHttpExtensionProc(pecb.rawAddress.toCPointer<ByteVar>())

public actual fun httpFilterProc(pfc: MutPtr, notificationtype: UInt, pvnotification: MutPtr): UInt =
    windowssysWindowsWin32SystemIisHttpFilterProc(pfc.rawAddress.toCPointer<ByteVar>(), notificationtype, pvnotification.rawAddress.toCPointer<ByteVar>())
