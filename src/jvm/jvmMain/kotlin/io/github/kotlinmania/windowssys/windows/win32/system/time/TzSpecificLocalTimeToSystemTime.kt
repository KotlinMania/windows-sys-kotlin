// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public fun TzSpecificLocalTimeToSystemTime(
    lptimezoneinformation: Long,
    lplocaltime: Long,
    lpuniversaltime: Long,
): BOOL =
    Kernel32Jni.TzSpecificLocalTimeToSystemTime(lptimezoneinformation, lplocaltime, lpuniversaltime)

public fun TzSpecificLocalTimeToSystemTime(
    lptimezoneinformation: TIME_ZONE_INFORMATION?,
    lplocaltime: SYSTEMTIME,
    lpuniversaltime: SYSTEMTIME,
): BOOL {
    val inLocal =
        shortArrayOf(
            lplocaltime.wYear.toShort(),
            lplocaltime.wMonth.toShort(),
            lplocaltime.wDayOfWeek.toShort(),
            lplocaltime.wDay.toShort(),
            lplocaltime.wHour.toShort(),
            lplocaltime.wMinute.toShort(),
            lplocaltime.wSecond.toShort(),
            lplocaltime.wMilliseconds.toShort(),
        )
    val outUtc = ShortArray(8)
    val res = Kernel32Jni.TzSpecificLocalTimeToSystemTimeStruct(inLocal, outUtc)
    if (res != 0) {
        lpuniversaltime.wYear = outUtc[0].toUShort()
        lpuniversaltime.wMonth = outUtc[1].toUShort()
        lpuniversaltime.wDayOfWeek = outUtc[2].toUShort()
        lpuniversaltime.wDay = outUtc[3].toUShort()
        lpuniversaltime.wHour = outUtc[4].toUShort()
        lpuniversaltime.wMinute = outUtc[5].toUShort()
        lpuniversaltime.wSecond = outUtc[6].toUShort()
        lpuniversaltime.wMilliseconds = outUtc[7].toUShort()
    }
    return res
}
