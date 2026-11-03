// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public fun SystemTimeToTzSpecificLocalTime(
    lptimezoneinformation: Long,
    lpuniversaltime: Long,
    lplocaltime: Long,
): BOOL =
    Kernel32Jni.SystemTimeToTzSpecificLocalTime(lptimezoneinformation, lpuniversaltime, lplocaltime)

public fun SystemTimeToTzSpecificLocalTime(
    lptimezoneinformation: TIME_ZONE_INFORMATION?,
    lpuniversaltime: SYSTEMTIME,
    lplocaltime: SYSTEMTIME,
): BOOL {
    val inUtc =
        shortArrayOf(
            lpuniversaltime.wYear.toShort(),
            lpuniversaltime.wMonth.toShort(),
            lpuniversaltime.wDayOfWeek.toShort(),
            lpuniversaltime.wDay.toShort(),
            lpuniversaltime.wHour.toShort(),
            lpuniversaltime.wMinute.toShort(),
            lpuniversaltime.wSecond.toShort(),
            lpuniversaltime.wMilliseconds.toShort(),
        )
    val outLocal = ShortArray(8)
    val res = Kernel32Jni.SystemTimeToTzSpecificLocalTimeStruct(inUtc, outLocal)
    if (res != 0) {
        lplocaltime.wYear = outLocal[0].toUShort()
        lplocaltime.wMonth = outLocal[1].toUShort()
        lplocaltime.wDayOfWeek = outLocal[2].toUShort()
        lplocaltime.wDay = outLocal[3].toUShort()
        lplocaltime.wHour = outLocal[4].toUShort()
        lplocaltime.wMinute = outLocal[5].toUShort()
        lplocaltime.wSecond = outLocal[6].toUShort()
        lplocaltime.wMilliseconds = outLocal[7].toUShort()
    }
    return res
}
