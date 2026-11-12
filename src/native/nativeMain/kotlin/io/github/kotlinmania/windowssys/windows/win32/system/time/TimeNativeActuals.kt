@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
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

public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: MutPtr): UInt =
    windowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation(dwindex, lptimezoneinformation.rawAddress.toCPointer<ByteVar>())

public actual fun fileTimeToSystemTime(lpfiletime: ConstPtr, lpsystemtime: MutPtr): Bool =
    windowssysWindowsWin32SystemTimeFileTimeToSystemTime(lpfiletime.rawAddress.toCPointer<ByteVar>(), lpsystemtime.rawAddress.toCPointer<ByteVar>())

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: MutPtr): UInt =
    windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation(ptimezoneinformation.rawAddress.toCPointer<ByteVar>())

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: ConstPtr, firstyear: MutPtr, lastyear: MutPtr): UInt =
    windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation.rawAddress.toCPointer<ByteVar>(), firstyear.rawAddress.toCPointer<ByteVar>(), lastyear.rawAddress.toCPointer<ByteVar>())

public actual fun getTimeZoneInformation(lptimezoneinformation: MutPtr): UInt =
    windowssysWindowsWin32SystemTimeGetTimeZoneInformation(lptimezoneinformation.rawAddress.toCPointer<ByteVar>())

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: ConstPtr, ptzi: MutPtr): Bool =
    windowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear(wyear, pdtzi.rawAddress.toCPointer<ByteVar>(), ptzi.rawAddress.toCPointer<ByteVar>())

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: ConstPtr, localfiletime: ConstPtr, localsystemtime: MutPtr): Bool =
    windowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime(timezoneinformation.rawAddress.toCPointer<ByteVar>(), localfiletime.rawAddress.toCPointer<ByteVar>(), localsystemtime.rawAddress.toCPointer<ByteVar>())

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: ConstPtr, localsystemtime: ConstPtr, localfiletime: MutPtr): Bool =
    windowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime(timezoneinformation.rawAddress.toCPointer<ByteVar>(), localsystemtime.rawAddress.toCPointer<ByteVar>(), localfiletime.rawAddress.toCPointer<ByteVar>())

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: ConstPtr): Bool =
    windowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation(lptimezoneinformation.rawAddress.toCPointer<ByteVar>())

public actual fun setTimeZoneInformation(lptimezoneinformation: ConstPtr): Bool =
    windowssysWindowsWin32SystemTimeSetTimeZoneInformation(lptimezoneinformation.rawAddress.toCPointer<ByteVar>())

public actual fun systemTimeToFileTime(lpsystemtime: ConstPtr, lpfiletime: MutPtr): Bool =
    windowssysWindowsWin32SystemTimeSystemTimeToFileTime(lpsystemtime.rawAddress.toCPointer<ByteVar>(), lpfiletime.rawAddress.toCPointer<ByteVar>())

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: ConstPtr, lpuniversaltime: ConstPtr, lplocaltime: MutPtr): Bool =
    windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime(lptimezoneinformation.rawAddress.toCPointer<ByteVar>(), lpuniversaltime.rawAddress.toCPointer<ByteVar>(), lplocaltime.rawAddress.toCPointer<ByteVar>())

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: ConstPtr, lpuniversaltime: ConstPtr, lplocaltime: MutPtr): Bool =
    windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation.rawAddress.toCPointer<ByteVar>(), lpuniversaltime.rawAddress.toCPointer<ByteVar>(), lplocaltime.rawAddress.toCPointer<ByteVar>())

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: ConstPtr, lplocaltime: ConstPtr, lpuniversaltime: MutPtr): Bool =
    windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime(lptimezoneinformation.rawAddress.toCPointer<ByteVar>(), lplocaltime.rawAddress.toCPointer<ByteVar>(), lpuniversaltime.rawAddress.toCPointer<ByteVar>())

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: ConstPtr, lplocaltime: ConstPtr, lpuniversaltime: MutPtr): Bool =
    windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation.rawAddress.toCPointer<ByteVar>(), lplocaltime.rawAddress.toCPointer<ByteVar>(), lpuniversaltime.rawAddress.toCPointer<ByteVar>())
