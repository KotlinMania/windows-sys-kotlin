@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeFileTimeToSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeGetTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeSetTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeSystemTimeToFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: MutPtr<DynamicTimeZoneInformation>): UInt =
    windowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation(dwindex, lptimezoneinformation.rawAddress.toCPointer<ByteVar>())

public actual fun fileTimeToSystemTime(lpfiletime: ConstPtr<Filetime>, lpsystemtime: MutPtr<Systemtime>): Bool =
    windowssysWindowsWin32SystemTimeFileTimeToSystemTime(lpfiletime.rawAddress.toCPointer<ByteVar>(), lpsystemtime.rawAddress.toCPointer<ByteVar>())

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: MutPtr<DynamicTimeZoneInformation>): UInt =
    windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation(ptimezoneinformation.rawAddress.toCPointer<ByteVar>())

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, firstyear: MutPtr<UInt>, lastyear: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation.rawAddress.toCPointer<ByteVar>(), firstyear.rawAddress.toCPointer<ByteVar>(), lastyear.rawAddress.toCPointer<ByteVar>())

public actual fun getTimeZoneInformation(lptimezoneinformation: MutPtr<TimeZoneInformation>): UInt =
    windowssysWindowsWin32SystemTimeGetTimeZoneInformation(lptimezoneinformation.rawAddress.toCPointer<ByteVar>())

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: ConstPtr<DynamicTimeZoneInformation>, ptzi: MutPtr<TimeZoneInformation>): Bool =
    windowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear(wyear, pdtzi.rawAddress.toCPointer<ByteVar>(), ptzi.rawAddress.toCPointer<ByteVar>())

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: ConstPtr<TimeZoneInformation>, localfiletime: ConstPtr<Filetime>, localsystemtime: MutPtr<Systemtime>): Bool =
    windowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime(timezoneinformation.rawAddress.toCPointer<ByteVar>(), localfiletime.rawAddress.toCPointer<ByteVar>(), localsystemtime.rawAddress.toCPointer<ByteVar>())

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: ConstPtr<TimeZoneInformation>, localsystemtime: ConstPtr<Systemtime>, localfiletime: MutPtr<Filetime>): Bool =
    windowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime(timezoneinformation.rawAddress.toCPointer<ByteVar>(), localsystemtime.rawAddress.toCPointer<ByteVar>(), localfiletime.rawAddress.toCPointer<ByteVar>())

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>): Bool =
    windowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation(lptimezoneinformation.rawAddress.toCPointer<ByteVar>())

public actual fun setTimeZoneInformation(lptimezoneinformation: ConstPtr<TimeZoneInformation>): Bool =
    windowssysWindowsWin32SystemTimeSetTimeZoneInformation(lptimezoneinformation.rawAddress.toCPointer<ByteVar>())

public actual fun systemTimeToFileTime(lpsystemtime: ConstPtr<Systemtime>, lpfiletime: MutPtr<Filetime>): Bool =
    windowssysWindowsWin32SystemTimeSystemTimeToFileTime(lpsystemtime.rawAddress.toCPointer<ByteVar>(), lpfiletime.rawAddress.toCPointer<ByteVar>())

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: ConstPtr<TimeZoneInformation>, lpuniversaltime: ConstPtr<Systemtime>, lplocaltime: MutPtr<Systemtime>): Bool =
    windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime(lptimezoneinformation.rawAddress.toCPointer<ByteVar>(), lpuniversaltime.rawAddress.toCPointer<ByteVar>(), lplocaltime.rawAddress.toCPointer<ByteVar>())

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, lpuniversaltime: ConstPtr<Systemtime>, lplocaltime: MutPtr<Systemtime>): Bool =
    windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation.rawAddress.toCPointer<ByteVar>(), lpuniversaltime.rawAddress.toCPointer<ByteVar>(), lplocaltime.rawAddress.toCPointer<ByteVar>())

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: ConstPtr<TimeZoneInformation>, lplocaltime: ConstPtr<Systemtime>, lpuniversaltime: MutPtr<Systemtime>): Bool =
    windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime(lptimezoneinformation.rawAddress.toCPointer<ByteVar>(), lplocaltime.rawAddress.toCPointer<ByteVar>(), lpuniversaltime.rawAddress.toCPointer<ByteVar>())

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, lplocaltime: ConstPtr<Systemtime>, lpuniversaltime: MutPtr<Systemtime>): Bool =
    windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation.rawAddress.toCPointer<ByteVar>(), lplocaltime.rawAddress.toCPointer<ByteVar>(), lpuniversaltime.rawAddress.toCPointer<ByteVar>())
