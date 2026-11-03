package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun HtmlHelpA(hwndcaller: Foundation.HWND, pszfile: PCSTR, ucommand: UInt, dwdata: ULong): Foundation.HWND {
    Win32DynamicFfi.invoke("hhctrl.ocx", "HtmlHelpA", longArrayOf(Win32DynamicFfi.objectSlot(hwndcaller), pszfile, ucommand.toLong(), dwdata.toLong()))
    return Foundation.HWND()
}

public fun HtmlHelpW(hwndcaller: Foundation.HWND, pszfile: PCWSTR, ucommand: UInt, dwdata: ULong): Foundation.HWND {
    Win32DynamicFfi.invoke("hhctrl.ocx", "HtmlHelpW", longArrayOf(Win32DynamicFfi.objectSlot(hwndcaller), pszfile, ucommand.toLong(), dwdata.toLong()))
    return Foundation.HWND()
}
