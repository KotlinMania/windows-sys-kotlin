package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun HtmlHelpA(hwndcaller: HWND, pszfile: PCSTR, ucommand: UInt, dwdata: ULong): HWND

public expect fun HtmlHelpW(hwndcaller: HWND, pszfile: PCWSTR, ucommand: UInt, dwdata: ULong): HWND
