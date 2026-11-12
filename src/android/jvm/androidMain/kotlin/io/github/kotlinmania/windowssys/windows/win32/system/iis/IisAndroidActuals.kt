@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemIisJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemIisGetExtensionVersion(pver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIisGetFilterVersion(pver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIisHttpExtensionProc(pecb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIisHttpFilterProc(pfc: Long, notificationtype: Int, pvnotification: Long): Int
}

public actual fun getExtensionVersion(pver: MutPtr): Bool =
    WindowsWin32SystemIisJniBridge.windowssysWindowsWin32SystemIisGetExtensionVersion(pver.rawAddress)

public actual fun getFilterVersion(pver: MutPtr): Bool =
    WindowsWin32SystemIisJniBridge.windowssysWindowsWin32SystemIisGetFilterVersion(pver.rawAddress)

public actual fun httpExtensionProc(pecb: ConstPtr): UInt =
    WindowsWin32SystemIisJniBridge.windowssysWindowsWin32SystemIisHttpExtensionProc(pecb.rawAddress).toUInt()

public actual fun httpFilterProc(pfc: MutPtr, notificationtype: UInt, pvnotification: MutPtr): UInt =
    WindowsWin32SystemIisJniBridge.windowssysWindowsWin32SystemIisHttpFilterProc(pfc.rawAddress, notificationtype.toInt(), pvnotification.rawAddress).toUInt()
