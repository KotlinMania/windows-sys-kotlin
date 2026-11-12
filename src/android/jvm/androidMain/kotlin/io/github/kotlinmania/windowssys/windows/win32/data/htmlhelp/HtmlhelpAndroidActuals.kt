@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DataHtmlhelpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DataHtmlhelpHtmlHelpA(hwndcaller: Long, pszfile: Long, ucommand: Int, dwdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DataHtmlhelpHtmlHelpW(hwndcaller: Long, pszfile: Long, ucommand: Int, dwdata: Long): Long
}

public actual fun htmlHelpA(hwndcaller: Hwnd, pszfile: Pcstr, ucommand: UInt, dwdata: ULong): Hwnd =
    MutPtr(WindowsWin32DataHtmlhelpJniBridge.windowssysWindowsWin32DataHtmlhelpHtmlHelpA(hwndcaller.rawAddress, pszfile.rawAddress, ucommand.toInt(), dwdata.toLong()))

public actual fun htmlHelpW(hwndcaller: Hwnd, pszfile: Pcwstr, ucommand: UInt, dwdata: ULong): Hwnd =
    MutPtr(WindowsWin32DataHtmlhelpJniBridge.windowssysWindowsWin32DataHtmlhelpHtmlHelpW(hwndcaller.rawAddress, pszfile.rawAddress, ucommand.toInt(), dwdata.toLong()))
