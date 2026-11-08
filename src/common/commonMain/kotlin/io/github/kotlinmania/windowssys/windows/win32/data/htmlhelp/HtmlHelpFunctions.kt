package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun HtmlHelpA(hwndcaller: HWND, pszfile: PCSTR, ucommand: UInt, dwdata: ULong): HWND {
    return Win32DynamicFfi.invoke("hhctrl.ocx", "HtmlHelpA", longArrayOf(hwndcaller, pszfile, ucommand.toLong(), dwdata.toLong()))
}

public fun HtmlHelpW(hwndcaller: HWND, pszfile: PCWSTR, ucommand: UInt, dwdata: ULong): HWND {
    return Win32DynamicFfi.invoke("hhctrl.ocx", "HtmlHelpW", longArrayOf(hwndcaller, pszfile, ucommand.toLong(), dwdata.toLong()))
}
