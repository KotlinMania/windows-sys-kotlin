@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.core.BOOL

private object WindowsWin32SystemIisJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_iis_GetExtensionVersion(pver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_iis_GetFilterVersion(pver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_iis_HttpExtensionProc(pecb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_iis_HttpFilterProc(pfc: Long, notificationtype: Int, pvnotification: Long): Int
}

public actual fun GetExtensionVersion(pver: Long): BOOL =
    WindowsWin32SystemIisJniBridge.windowssys_windows_win32_system_iis_GetExtensionVersion(pver)

public actual fun GetFilterVersion(pver: Long): BOOL =
    WindowsWin32SystemIisJniBridge.windowssys_windows_win32_system_iis_GetFilterVersion(pver)

public actual fun HttpExtensionProc(pecb: Long): UInt =
    WindowsWin32SystemIisJniBridge.windowssys_windows_win32_system_iis_HttpExtensionProc(pecb).toUInt()

public actual fun HttpFilterProc(pfc: Long, notificationtype: UInt, pvnotification: Long): UInt =
    WindowsWin32SystemIisJniBridge.windowssys_windows_win32_system_iis_HttpFilterProc(pfc, notificationtype.toInt(), pvnotification).toUInt()
