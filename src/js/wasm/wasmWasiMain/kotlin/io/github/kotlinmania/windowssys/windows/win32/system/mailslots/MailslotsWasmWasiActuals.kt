@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun createMailslotA(lpname: Pcstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createMailslotW(lpname: Pcwstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMailslotInfo(hmailslot: Handle, lpmaxmessagesize: COpaquePointer?, lpnextsize: COpaquePointer?, lpmessagecount: COpaquePointer?, lpreadtimeout: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMailslotInfo(hmailslot: Handle, lreadtimeout: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
