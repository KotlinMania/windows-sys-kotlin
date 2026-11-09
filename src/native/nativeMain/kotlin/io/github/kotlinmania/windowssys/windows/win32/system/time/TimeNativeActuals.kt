@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun EnumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_EnumDynamicTimeZoneInformation(dwindex, lptimezoneinformation.toCPointer<ByteVar>())

public actual fun FileTimeToSystemTime(lpfiletime: Long, lpsystemtime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_FileTimeToSystemTime(lpfiletime.toCPointer<ByteVar>(), lpsystemtime.toCPointer<ByteVar>())

public actual fun GetDynamicTimeZoneInformation(ptimezoneinformation: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_GetDynamicTimeZoneInformation(ptimezoneinformation.toCPointer<ByteVar>())

public actual fun GetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: Long, firstyear: Long, lastyear: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_GetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation.toCPointer<ByteVar>(), firstyear.toCPointer<ByteVar>(), lastyear.toCPointer<ByteVar>())

public actual fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_GetTimeZoneInformation(lptimezoneinformation.toCPointer<ByteVar>())

public actual fun GetTimeZoneInformationForYear(wyear: UShort, pdtzi: Long, ptzi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_GetTimeZoneInformationForYear(wyear, pdtzi.toCPointer<ByteVar>(), ptzi.toCPointer<ByteVar>())

public actual fun LocalFileTimeToLocalSystemTime(timezoneinformation: Long, localfiletime: Long, localsystemtime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_LocalFileTimeToLocalSystemTime(timezoneinformation.toCPointer<ByteVar>(), localfiletime.toCPointer<ByteVar>(), localsystemtime.toCPointer<ByteVar>())

public actual fun LocalSystemTimeToLocalFileTime(timezoneinformation: Long, localsystemtime: Long, localfiletime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_LocalSystemTimeToLocalFileTime(timezoneinformation.toCPointer<ByteVar>(), localsystemtime.toCPointer<ByteVar>(), localfiletime.toCPointer<ByteVar>())

public actual fun SetDynamicTimeZoneInformation(lptimezoneinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_SetDynamicTimeZoneInformation(lptimezoneinformation.toCPointer<ByteVar>())

public actual fun SetTimeZoneInformation(lptimezoneinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_SetTimeZoneInformation(lptimezoneinformation.toCPointer<ByteVar>())

public actual fun SystemTimeToFileTime(lpsystemtime: Long, lpfiletime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_SystemTimeToFileTime(lpsystemtime.toCPointer<ByteVar>(), lpfiletime.toCPointer<ByteVar>())

public actual fun SystemTimeToTzSpecificLocalTime(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTime(lptimezoneinformation.toCPointer<ByteVar>(), lpuniversaltime.toCPointer<ByteVar>(), lplocaltime.toCPointer<ByteVar>())

public actual fun SystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation.toCPointer<ByteVar>(), lpuniversaltime.toCPointer<ByteVar>(), lplocaltime.toCPointer<ByteVar>())

public actual fun TzSpecificLocalTimeToSystemTime(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTime(lptimezoneinformation.toCPointer<ByteVar>(), lplocaltime.toCPointer<ByteVar>(), lpuniversaltime.toCPointer<ByteVar>())

public actual fun TzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation.toCPointer<ByteVar>(), lplocaltime.toCPointer<ByteVar>(), lpuniversaltime.toCPointer<ByteVar>())
