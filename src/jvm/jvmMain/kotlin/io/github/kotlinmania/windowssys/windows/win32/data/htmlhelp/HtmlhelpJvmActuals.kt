@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32DataHtmlhelpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_data_htmlhelp_HtmlHelpA(hwndcaller: Long, pszfile: Long, ucommand: Int, dwdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_data_htmlhelp_HtmlHelpW(hwndcaller: Long, pszfile: Long, ucommand: Int, dwdata: Long): Long
}

public actual fun HtmlHelpA(hwndcaller: HWND, pszfile: PCSTR, ucommand: UInt, dwdata: ULong): HWND =
    WindowsWin32DataHtmlhelpJniBridge.windowssys_windows_win32_data_htmlhelp_HtmlHelpA(hwndcaller, pszfile, ucommand.toInt(), dwdata.toLong())

public actual fun HtmlHelpW(hwndcaller: HWND, pszfile: PCWSTR, ucommand: UInt, dwdata: ULong): HWND =
    WindowsWin32DataHtmlhelpJniBridge.windowssys_windows_win32_data_htmlhelp_HtmlHelpW(hwndcaller, pszfile, ucommand.toInt(), dwdata.toLong())
