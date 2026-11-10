@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemIisJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_iis_getExtensionVersion(pver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_iis_getFilterVersion(pver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_iis_httpExtensionProc(pecb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_iis_httpFilterProc(pfc: Long, notificationtype: Int, pvnotification: Long): Int
}

public actual fun getExtensionVersion(pver: COpaquePointer?): Bool =
    WindowsWin32SystemIisJniBridge.windowssys_windows_win32_system_iis_getExtensionVersion((pver?.value ?: 0L))

public actual fun getFilterVersion(pver: COpaquePointer?): Bool =
    WindowsWin32SystemIisJniBridge.windowssys_windows_win32_system_iis_getFilterVersion((pver?.value ?: 0L))

public actual fun httpExtensionProc(pecb: COpaquePointer?): UInt =
    WindowsWin32SystemIisJniBridge.windowssys_windows_win32_system_iis_httpExtensionProc((pecb?.value ?: 0L)).toUInt()

public actual fun httpFilterProc(pfc: COpaquePointer?, notificationtype: UInt, pvnotification: COpaquePointer?): UInt =
    WindowsWin32SystemIisJniBridge.windowssys_windows_win32_system_iis_httpFilterProc((pfc?.value ?: 0L), notificationtype.toInt(), (pvnotification?.value ?: 0L)).toUInt()
