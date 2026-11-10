@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public actual fun chooseColorA(param0: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chooseColorW(param0: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chooseFontA(param0: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chooseFontW(param0: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun commDlgExtendedError(): CommonDlgErrors =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findTextA(param0: COpaquePointer?): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findTextW(param0: COpaquePointer?): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getOpenFileNameA(param0: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getOpenFileNameW(param0: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSaveFileNameA(param0: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSaveFileNameW(param0: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pageSetupDlgA(param0: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pageSetupDlgW(param0: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printDlgA(ppd: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printDlgExA(ppd: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printDlgExW(ppd: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printDlgW(ppd: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun replaceTextA(param0: COpaquePointer?): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun replaceTextW(param0: COpaquePointer?): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
