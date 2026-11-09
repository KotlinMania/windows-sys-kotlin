package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL

public expect fun EnumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: Long): UInt

public expect fun FileTimeToSystemTime(lpfiletime: Long, lpsystemtime: Long): BOOL

public expect fun GetDynamicTimeZoneInformation(ptimezoneinformation: Long): UInt

public expect fun GetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: Long, firstyear: Long, lastyear: Long): UInt

public expect fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt

public expect fun GetTimeZoneInformationForYear(wyear: UShort, pdtzi: Long, ptzi: Long): BOOL

public expect fun LocalFileTimeToLocalSystemTime(timezoneinformation: Long, localfiletime: Long, localsystemtime: Long): BOOL

public expect fun LocalSystemTimeToLocalFileTime(timezoneinformation: Long, localsystemtime: Long, localfiletime: Long): BOOL

public expect fun SetDynamicTimeZoneInformation(lptimezoneinformation: Long): BOOL

public expect fun SetTimeZoneInformation(lptimezoneinformation: Long): BOOL

public expect fun SystemTimeToFileTime(lpsystemtime: Long, lpfiletime: Long): BOOL

public expect fun SystemTimeToTzSpecificLocalTime(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL

public expect fun SystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL

public expect fun TzSpecificLocalTimeToSystemTime(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL

public expect fun TzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL
