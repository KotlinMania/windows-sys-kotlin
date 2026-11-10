@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun matchEnumTag(hmodule: Handle, pwcarg: Pcwstr, dwnumarg: UInt, penumtable: COpaquePointer?, pdwvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun matchToken(pwszusertoken: Pcwstr, pwszcmdtoken: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun preprocessCommand(hmodule: Handle, ppwcarguments: COpaquePointer?, dwcurrentindex: UInt, dwargcount: UInt, ptttags: COpaquePointer?, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printError(hmodule: Handle, dwerrid: UInt, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printMessage(pwszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printMessageFromModule(hmodule: Handle, dwmsgid: UInt, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerContext(pchildcontext: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerHelper(pguidparentcontext: COpaquePointer?, pfnregistersubcontext: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
