@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_enumDynamicTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_fileTimeToSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_getDynamicTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_getDynamicTimeZoneInformationEffectiveYears
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_getTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_getTimeZoneInformationForYear
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_localFileTimeToLocalSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_localSystemTimeToLocalFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_setDynamicTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_setTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_systemTimeToFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTimeEx
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.cinterop.windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTimeEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: COpaquePointer?): UInt =
    windowssys_windows_win32_system_time_enumDynamicTimeZoneInformation(dwindex, lptimezoneinformation?.value?.toCPointer<ByteVar>())

public actual fun fileTimeToSystemTime(lpfiletime: COpaquePointer?, lpsystemtime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_fileTimeToSystemTime(lpfiletime?.value?.toCPointer<ByteVar>(), lpsystemtime?.value?.toCPointer<ByteVar>())

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: COpaquePointer?): UInt =
    windowssys_windows_win32_system_time_getDynamicTimeZoneInformation(ptimezoneinformation?.value?.toCPointer<ByteVar>())

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: COpaquePointer?, firstyear: COpaquePointer?, lastyear: COpaquePointer?): UInt =
    windowssys_windows_win32_system_time_getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation?.value?.toCPointer<ByteVar>(), firstyear?.value?.toCPointer<ByteVar>(), lastyear?.value?.toCPointer<ByteVar>())

public actual fun getTimeZoneInformation(lptimezoneinformation: COpaquePointer?): UInt =
    windowssys_windows_win32_system_time_getTimeZoneInformation(lptimezoneinformation?.value?.toCPointer<ByteVar>())

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: COpaquePointer?, ptzi: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_getTimeZoneInformationForYear(wyear, pdtzi?.value?.toCPointer<ByteVar>(), ptzi?.value?.toCPointer<ByteVar>())

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: COpaquePointer?, localfiletime: COpaquePointer?, localsystemtime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_localFileTimeToLocalSystemTime(timezoneinformation?.value?.toCPointer<ByteVar>(), localfiletime?.value?.toCPointer<ByteVar>(), localsystemtime?.value?.toCPointer<ByteVar>())

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: COpaquePointer?, localsystemtime: COpaquePointer?, localfiletime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_localSystemTimeToLocalFileTime(timezoneinformation?.value?.toCPointer<ByteVar>(), localsystemtime?.value?.toCPointer<ByteVar>(), localfiletime?.value?.toCPointer<ByteVar>())

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_setDynamicTimeZoneInformation(lptimezoneinformation?.value?.toCPointer<ByteVar>())

public actual fun setTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_setTimeZoneInformation(lptimezoneinformation?.value?.toCPointer<ByteVar>())

public actual fun systemTimeToFileTime(lpsystemtime: COpaquePointer?, lpfiletime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_systemTimeToFileTime(lpsystemtime?.value?.toCPointer<ByteVar>(), lpfiletime?.value?.toCPointer<ByteVar>())

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTime(lptimezoneinformation?.value?.toCPointer<ByteVar>(), lpuniversaltime?.value?.toCPointer<ByteVar>(), lplocaltime?.value?.toCPointer<ByteVar>())

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation?.value?.toCPointer<ByteVar>(), lpuniversaltime?.value?.toCPointer<ByteVar>(), lplocaltime?.value?.toCPointer<ByteVar>())

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTime(lptimezoneinformation?.value?.toCPointer<ByteVar>(), lplocaltime?.value?.toCPointer<ByteVar>(), lpuniversaltime?.value?.toCPointer<ByteVar>())

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation?.value?.toCPointer<ByteVar>(), lplocaltime?.value?.toCPointer<ByteVar>(), lpuniversaltime?.value?.toCPointer<ByteVar>())
