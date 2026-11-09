@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun HtmlHelpA(hwndcaller: HWND, pszfile: PCSTR, ucommand: UInt, dwdata: ULong): HWND =
    io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.cinterop.windowssys_windows_win32_data_htmlhelp_HtmlHelpA(hwndcaller.toCPointer<ByteVar>(), pszfile.toCPointer<ByteVar>(), ucommand, dwdata)?.toLong() ?: 0L

public actual fun HtmlHelpW(hwndcaller: HWND, pszfile: PCWSTR, ucommand: UInt, dwdata: ULong): HWND =
    io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.cinterop.windowssys_windows_win32_data_htmlhelp_HtmlHelpW(hwndcaller.toCPointer<ByteVar>(), pszfile.toCPointer<ByteVar>(), ucommand, dwdata)?.toLong() ?: 0L
