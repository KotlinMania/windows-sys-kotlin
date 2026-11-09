@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL

private object WindowsWin32SystemTimeJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_time_EnumDynamicTimeZoneInformation(dwindex: Int, lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_FileTimeToSystemTime(lpfiletime: Long, lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_GetDynamicTimeZoneInformation(ptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_GetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: Long, firstyear: Long, lastyear: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_GetTimeZoneInformation(lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_GetTimeZoneInformationForYear(wyear: Short, pdtzi: Long, ptzi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_LocalFileTimeToLocalSystemTime(timezoneinformation: Long, localfiletime: Long, localsystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_LocalSystemTimeToLocalFileTime(timezoneinformation: Long, localsystemtime: Long, localfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_SetDynamicTimeZoneInformation(lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_SetTimeZoneInformation(lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_SystemTimeToFileTime(lpsystemtime: Long, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTime(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTime(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): Int
}

public actual fun EnumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: Long): UInt =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_EnumDynamicTimeZoneInformation(dwindex.toInt(), lptimezoneinformation).toUInt()

public actual fun FileTimeToSystemTime(lpfiletime: Long, lpsystemtime: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_FileTimeToSystemTime(lpfiletime, lpsystemtime)

public actual fun GetDynamicTimeZoneInformation(ptimezoneinformation: Long): UInt =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_GetDynamicTimeZoneInformation(ptimezoneinformation).toUInt()

public actual fun GetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: Long, firstyear: Long, lastyear: Long): UInt =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_GetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation, firstyear, lastyear).toUInt()

public actual fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_GetTimeZoneInformation(lptimezoneinformation).toUInt()

public actual fun GetTimeZoneInformationForYear(wyear: UShort, pdtzi: Long, ptzi: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_GetTimeZoneInformationForYear(wyear.toShort(), pdtzi, ptzi)

public actual fun LocalFileTimeToLocalSystemTime(timezoneinformation: Long, localfiletime: Long, localsystemtime: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_LocalFileTimeToLocalSystemTime(timezoneinformation, localfiletime, localsystemtime)

public actual fun LocalSystemTimeToLocalFileTime(timezoneinformation: Long, localsystemtime: Long, localfiletime: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_LocalSystemTimeToLocalFileTime(timezoneinformation, localsystemtime, localfiletime)

public actual fun SetDynamicTimeZoneInformation(lptimezoneinformation: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_SetDynamicTimeZoneInformation(lptimezoneinformation)

public actual fun SetTimeZoneInformation(lptimezoneinformation: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_SetTimeZoneInformation(lptimezoneinformation)

public actual fun SystemTimeToFileTime(lpsystemtime: Long, lpfiletime: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_SystemTimeToFileTime(lpsystemtime, lpfiletime)

public actual fun SystemTimeToTzSpecificLocalTime(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTime(lptimezoneinformation, lpuniversaltime, lplocaltime)

public actual fun SystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation, lpuniversaltime, lplocaltime)

public actual fun TzSpecificLocalTimeToSystemTime(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTime(lptimezoneinformation, lplocaltime, lpuniversaltime)

public actual fun TzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation, lplocaltime, lpuniversaltime)
