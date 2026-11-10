@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fileTimeToSystemTime(lpfiletime: COpaquePointer?, lpsystemtime: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: COpaquePointer?, firstyear: COpaquePointer?, lastyear: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTimeZoneInformation(lptimezoneinformation: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: COpaquePointer?, ptzi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: COpaquePointer?, localfiletime: COpaquePointer?, localsystemtime: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: COpaquePointer?, localsystemtime: COpaquePointer?, localfiletime: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun systemTimeToFileTime(lpsystemtime: COpaquePointer?, lpfiletime: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
