@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation")

public actual fun fileTimeToSystemTime(lpfiletime: ConstPtr, lpsystemtime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeFileTimeToSystemTime")

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation")

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: ConstPtr, firstyear: MutPtr, lastyear: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears")

public actual fun getTimeZoneInformation(lptimezoneinformation: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeGetTimeZoneInformation")

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: ConstPtr, ptzi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear")

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: ConstPtr, localfiletime: ConstPtr, localsystemtime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime")

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: ConstPtr, localsystemtime: ConstPtr, localfiletime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime")

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation")

public actual fun setTimeZoneInformation(lptimezoneinformation: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeSetTimeZoneInformation")

public actual fun systemTimeToFileTime(lpsystemtime: ConstPtr, lpfiletime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeSystemTimeToFileTime")

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: ConstPtr, lpuniversaltime: ConstPtr, lplocaltime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime")

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: ConstPtr, lpuniversaltime: ConstPtr, lplocaltime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx")

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: ConstPtr, lplocaltime: ConstPtr, lpuniversaltime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime")

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: ConstPtr, lplocaltime: ConstPtr, lpuniversaltime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx")
