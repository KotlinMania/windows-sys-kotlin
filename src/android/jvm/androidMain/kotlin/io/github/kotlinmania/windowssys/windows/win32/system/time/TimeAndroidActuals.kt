@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemTimeJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_time_enumDynamicTimeZoneInformation(dwindex: Int, lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_fileTimeToSystemTime(lpfiletime: Long, lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_getDynamicTimeZoneInformation(ptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: Long, firstyear: Long, lastyear: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_getTimeZoneInformation(lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_getTimeZoneInformationForYear(wyear: Short, pdtzi: Long, ptzi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_localFileTimeToLocalSystemTime(timezoneinformation: Long, localfiletime: Long, localsystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_localSystemTimeToLocalFileTime(timezoneinformation: Long, localsystemtime: Long, localfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_setDynamicTimeZoneInformation(lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_setTimeZoneInformation(lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_systemTimeToFileTime(lpsystemtime: Long, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTime(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTime(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): Int
}

public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: COpaquePointer?): UInt =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_enumDynamicTimeZoneInformation(dwindex.toInt(), (lptimezoneinformation?.value ?: 0L)).toUInt()

public actual fun fileTimeToSystemTime(lpfiletime: COpaquePointer?, lpsystemtime: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_fileTimeToSystemTime((lpfiletime?.value ?: 0L), (lpsystemtime?.value ?: 0L))

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: COpaquePointer?): UInt =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_getDynamicTimeZoneInformation((ptimezoneinformation?.value ?: 0L)).toUInt()

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: COpaquePointer?, firstyear: COpaquePointer?, lastyear: COpaquePointer?): UInt =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_getDynamicTimeZoneInformationEffectiveYears((lptimezoneinformation?.value ?: 0L), (firstyear?.value ?: 0L), (lastyear?.value ?: 0L)).toUInt()

public actual fun getTimeZoneInformation(lptimezoneinformation: COpaquePointer?): UInt =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_getTimeZoneInformation((lptimezoneinformation?.value ?: 0L)).toUInt()

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: COpaquePointer?, ptzi: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_getTimeZoneInformationForYear(wyear.toShort(), (pdtzi?.value ?: 0L), (ptzi?.value ?: 0L))

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: COpaquePointer?, localfiletime: COpaquePointer?, localsystemtime: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_localFileTimeToLocalSystemTime((timezoneinformation?.value ?: 0L), (localfiletime?.value ?: 0L), (localsystemtime?.value ?: 0L))

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: COpaquePointer?, localsystemtime: COpaquePointer?, localfiletime: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_localSystemTimeToLocalFileTime((timezoneinformation?.value ?: 0L), (localsystemtime?.value ?: 0L), (localfiletime?.value ?: 0L))

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_setDynamicTimeZoneInformation((lptimezoneinformation?.value ?: 0L))

public actual fun setTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_setTimeZoneInformation((lptimezoneinformation?.value ?: 0L))

public actual fun systemTimeToFileTime(lpsystemtime: COpaquePointer?, lpfiletime: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_systemTimeToFileTime((lpsystemtime?.value ?: 0L), (lpfiletime?.value ?: 0L))

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTime((lptimezoneinformation?.value ?: 0L), (lpuniversaltime?.value ?: 0L), (lplocaltime?.value ?: 0L))

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTimeEx((lptimezoneinformation?.value ?: 0L), (lpuniversaltime?.value ?: 0L), (lplocaltime?.value ?: 0L))

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTime((lptimezoneinformation?.value ?: 0L), (lplocaltime?.value ?: 0L), (lpuniversaltime?.value ?: 0L))

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool =
    WindowsWin32SystemTimeJniBridge.windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTimeEx((lptimezoneinformation?.value ?: 0L), (lplocaltime?.value ?: 0L), (lpuniversaltime?.value ?: 0L))
