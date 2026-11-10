@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DataHtmlhelpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_data_htmlhelp_htmlHelpA(hwndcaller: Long, pszfile: Long, ucommand: Int, dwdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_data_htmlhelp_htmlHelpW(hwndcaller: Long, pszfile: Long, ucommand: Int, dwdata: Long): Long
}

public actual fun htmlHelpA(hwndcaller: Hwnd, pszfile: Pcstr, ucommand: UInt, dwdata: ULong): Hwnd =
    WindowsWin32DataHtmlhelpJniBridge.windowssys_windows_win32_data_htmlhelp_htmlHelpA((hwndcaller?.value ?: 0L), (pszfile?.value ?: 0L), ucommand.toInt(), dwdata.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun htmlHelpW(hwndcaller: Hwnd, pszfile: Pcwstr, ucommand: UInt, dwdata: ULong): Hwnd =
    WindowsWin32DataHtmlhelpJniBridge.windowssys_windows_win32_data_htmlhelp_htmlHelpW((hwndcaller?.value ?: 0L), (pszfile?.value ?: 0L), ucommand.toInt(), dwdata.toLong()).let { if (it == 0L) null else COpaquePointer(it) }
