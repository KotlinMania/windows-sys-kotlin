@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public actual fun htmlHelpA(hwndcaller: Hwnd, pszfile: Pcstr, ucommand: UInt, dwdata: ULong): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun htmlHelpW(hwndcaller: Hwnd, pszfile: Pcwstr, ucommand: UInt, dwdata: ULong): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
