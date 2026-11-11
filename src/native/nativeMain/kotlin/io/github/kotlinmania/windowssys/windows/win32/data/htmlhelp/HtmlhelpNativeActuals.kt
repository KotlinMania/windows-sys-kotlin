@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.cinterop.windowssys_windows_win32_data_htmlhelp_htmlHelpA
import io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.cinterop.windowssys_windows_win32_data_htmlhelp_htmlHelpW
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun htmlHelpA(hwndcaller: Hwnd, pszfile: Pcstr, ucommand: UInt, dwdata: ULong): Hwnd =
    windowssys_windows_win32_data_htmlhelp_htmlHelpA(hwndcaller?.value?.toCPointer<ByteVar>(), pszfile?.value?.toCPointer<ByteVar>(), ucommand, dwdata)?.let { COpaquePointer(it.toLong()) }

public actual fun htmlHelpW(hwndcaller: Hwnd, pszfile: Pcwstr, ucommand: UInt, dwdata: ULong): Hwnd =
    windowssys_windows_win32_data_htmlhelp_htmlHelpW(hwndcaller?.value?.toCPointer<ByteVar>(), pszfile?.value?.toCPointer<ByteVar>(), ucommand, dwdata)?.let { COpaquePointer(it.toLong()) }
