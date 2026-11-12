@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: MutPtr<DynamicTimeZoneInformation>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation")

public actual fun fileTimeToSystemTime(lpfiletime: ConstPtr<Filetime>, lpsystemtime: MutPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeFileTimeToSystemTime")

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: MutPtr<DynamicTimeZoneInformation>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation")

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, firstyear: MutPtr<UInt>, lastyear: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears")

public actual fun getTimeZoneInformation(lptimezoneinformation: MutPtr<TimeZoneInformation>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeGetTimeZoneInformation")

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: ConstPtr<DynamicTimeZoneInformation>, ptzi: MutPtr<TimeZoneInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear")

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: ConstPtr<TimeZoneInformation>, localfiletime: ConstPtr<Filetime>, localsystemtime: MutPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime")

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: ConstPtr<TimeZoneInformation>, localsystemtime: ConstPtr<Systemtime>, localfiletime: MutPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime")

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation")

public actual fun setTimeZoneInformation(lptimezoneinformation: ConstPtr<TimeZoneInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeSetTimeZoneInformation")

public actual fun systemTimeToFileTime(lpsystemtime: ConstPtr<Systemtime>, lpfiletime: MutPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeSystemTimeToFileTime")

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: ConstPtr<TimeZoneInformation>, lpuniversaltime: ConstPtr<Systemtime>, lplocaltime: MutPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime")

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, lpuniversaltime: ConstPtr<Systemtime>, lplocaltime: MutPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx")

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: ConstPtr<TimeZoneInformation>, lplocaltime: ConstPtr<Systemtime>, lpuniversaltime: MutPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime")

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, lplocaltime: ConstPtr<Systemtime>, lpuniversaltime: MutPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx")
