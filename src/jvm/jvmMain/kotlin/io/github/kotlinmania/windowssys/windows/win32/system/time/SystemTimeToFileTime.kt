// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public fun SystemTimeToFileTime(
    lpsystemtime: Long,
    lpfiletime: Long,
): BOOL =
    Kernel32Jni.SystemTimeToFileTime(lpsystemtime, lpfiletime)

public fun SystemTimeToFileTime(
    lpsystemtime: SYSTEMTIME,
    lpfiletime: FILETIME,
): BOOL {
    val inSt =
        shortArrayOf(
            lpsystemtime.wYear.toShort(),
            lpsystemtime.wMonth.toShort(),
            lpsystemtime.wDayOfWeek.toShort(),
            lpsystemtime.wDay.toShort(),
            lpsystemtime.wHour.toShort(),
            lpsystemtime.wMinute.toShort(),
            lpsystemtime.wSecond.toShort(),
            lpsystemtime.wMilliseconds.toShort(),
        )
    val outFt = IntArray(2)
    val res = Kernel32Jni.SystemTimeToFileTimeStruct(inSt, outFt)
    if (res != 0) {
        lpfiletime.dwLowDateTime = outFt[0].toUInt()
        lpfiletime.dwHighDateTime = outFt[1].toUInt()
    }
    return res
}
