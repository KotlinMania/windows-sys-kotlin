package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun EnumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EnumDynamicTimeZoneInformation", longArrayOf(dwindex.toLong(), lptimezoneinformation)).toUInt()
}

public fun FileTimeToSystemTime(lpfiletime: Long, lpsystemtime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FileTimeToSystemTime", longArrayOf(lpfiletime, lpsystemtime)).toInt()
}

public fun GetDynamicTimeZoneInformation(ptimezoneinformation: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDynamicTimeZoneInformation", longArrayOf(ptimezoneinformation)).toUInt()
}

public fun GetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: Long, firstyear: Long, lastyear: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetDynamicTimeZoneInformationEffectiveYears", longArrayOf(lptimezoneinformation, firstyear, lastyear)).toUInt()
}

public fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTimeZoneInformation", longArrayOf(lptimezoneinformation)).toUInt()
}

public fun GetTimeZoneInformationForYear(wyear: UShort, pdtzi: Long, ptzi: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTimeZoneInformationForYear", longArrayOf(wyear.toLong(), pdtzi, ptzi)).toInt()
}

public fun LocalFileTimeToLocalSystemTime(timezoneinformation: Long, localfiletime: Long, localsystemtime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalFileTimeToLocalSystemTime", longArrayOf(timezoneinformation, localfiletime, localsystemtime)).toInt()
}

public fun LocalSystemTimeToLocalFileTime(timezoneinformation: Long, localsystemtime: Long, localfiletime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalSystemTimeToLocalFileTime", longArrayOf(timezoneinformation, localsystemtime, localfiletime)).toInt()
}

public fun SetDynamicTimeZoneInformation(lptimezoneinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetDynamicTimeZoneInformation", longArrayOf(lptimezoneinformation)).toInt()
}

public fun SetTimeZoneInformation(lptimezoneinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetTimeZoneInformation", longArrayOf(lptimezoneinformation)).toInt()
}

public fun SystemTimeToFileTime(lpsystemtime: Long, lpfiletime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SystemTimeToFileTime", longArrayOf(lpsystemtime, lpfiletime)).toInt()
}

public fun SystemTimeToTzSpecificLocalTime(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SystemTimeToTzSpecificLocalTime", longArrayOf(lptimezoneinformation, lpuniversaltime, lplocaltime)).toInt()
}

public fun SystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SystemTimeToTzSpecificLocalTimeEx", longArrayOf(lptimezoneinformation, lpuniversaltime, lplocaltime)).toInt()
}

public fun TzSpecificLocalTimeToSystemTime(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TzSpecificLocalTimeToSystemTime", longArrayOf(lptimezoneinformation, lplocaltime, lpuniversaltime)).toInt()
}

public fun TzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TzSpecificLocalTimeToSystemTimeEx", longArrayOf(lptimezoneinformation, lplocaltime, lpuniversaltime)).toInt()
}
