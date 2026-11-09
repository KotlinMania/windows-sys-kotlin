@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL

public actual fun EnumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: Long): UInt =
    0u

public actual fun FileTimeToSystemTime(lpfiletime: Long, lpsystemtime: Long): BOOL =
    0

public actual fun GetDynamicTimeZoneInformation(ptimezoneinformation: Long): UInt =
    0u

public actual fun GetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: Long, firstyear: Long, lastyear: Long): UInt =
    0u

public actual fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt =
    0u

public actual fun GetTimeZoneInformationForYear(wyear: UShort, pdtzi: Long, ptzi: Long): BOOL =
    0

public actual fun LocalFileTimeToLocalSystemTime(timezoneinformation: Long, localfiletime: Long, localsystemtime: Long): BOOL =
    0

public actual fun LocalSystemTimeToLocalFileTime(timezoneinformation: Long, localsystemtime: Long, localfiletime: Long): BOOL =
    0

public actual fun SetDynamicTimeZoneInformation(lptimezoneinformation: Long): BOOL =
    0

public actual fun SetTimeZoneInformation(lptimezoneinformation: Long): BOOL =
    0

public actual fun SystemTimeToFileTime(lpsystemtime: Long, lpfiletime: Long): BOOL =
    0

public actual fun SystemTimeToTzSpecificLocalTime(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL =
    0

public actual fun SystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL =
    0

public actual fun TzSpecificLocalTimeToSystemTime(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL =
    0

public actual fun TzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL =
    0
