// port-lint: source Windows/Win32/System/Time/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.cinterop.windows_sys_system_time_to_tz_specific_local_time
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.set
import kotlinx.cinterop.toCPointer

public fun SystemTimeToTzSpecificLocalTime(
    lptimezoneinformation: Long,
    lpuniversaltime: Long,
    lplocaltime: Long,
): BOOL =
    windows_sys_system_time_to_tz_specific_local_time(
        lptimezoneinformation.toCPointer(),
        lpuniversaltime.toCPointer(),
        lplocaltime.toCPointer(),
    )

public fun SystemTimeToTzSpecificLocalTime(
    lptimezoneinformation: TIME_ZONE_INFORMATION?,
    lpuniversaltime: SYSTEMTIME,
    lplocaltime: SYSTEMTIME,
): BOOL =
    memScoped {
        val nativeTziPtr =
            if (lptimezoneinformation != null) {
                val tzi = alloc<platform.windows.TIME_ZONE_INFORMATION>()
                copyKotlinTimeZoneInformationToNative(lptimezoneinformation, tzi)
                tzi.ptr
            } else {
                null
            }
        val utc = alloc<platform.windows.SYSTEMTIME>()
        utc.wYear = lpuniversaltime.wYear
        utc.wMonth = lpuniversaltime.wMonth
        utc.wDayOfWeek = lpuniversaltime.wDayOfWeek
        utc.wDay = lpuniversaltime.wDay
        utc.wHour = lpuniversaltime.wHour
        utc.wMinute = lpuniversaltime.wMinute
        utc.wSecond = lpuniversaltime.wSecond
        utc.wMilliseconds = lpuniversaltime.wMilliseconds
        val local = alloc<platform.windows.SYSTEMTIME>()
        val res = windows_sys_system_time_to_tz_specific_local_time(nativeTziPtr, utc.ptr, local.ptr)
        if (res != 0) {
            lplocaltime.wYear = local.wYear
            lplocaltime.wMonth = local.wMonth
            lplocaltime.wDayOfWeek = local.wDayOfWeek
            lplocaltime.wDay = local.wDay
            lplocaltime.wHour = local.wHour
            lplocaltime.wMinute = local.wMinute
            lplocaltime.wSecond = local.wSecond
            lplocaltime.wMilliseconds = local.wMilliseconds
        }
        res
    }

internal fun copyKotlinTimeZoneInformationToNative(
    src: TIME_ZONE_INFORMATION,
    dst: platform.windows.TIME_ZONE_INFORMATION,
) {
    dst.Bias = src.Bias
    for (i in 0 until 32) {
        dst.StandardName[i] = src.StandardName[i]
        dst.DaylightName[i] = src.DaylightName[i]
    }
    dst.StandardDate.wYear = src.StandardDate.wYear
    dst.StandardDate.wMonth = src.StandardDate.wMonth
    dst.StandardDate.wDayOfWeek = src.StandardDate.wDayOfWeek
    dst.StandardDate.wDay = src.StandardDate.wDay
    dst.StandardDate.wHour = src.StandardDate.wHour
    dst.StandardDate.wMinute = src.StandardDate.wMinute
    dst.StandardDate.wSecond = src.StandardDate.wSecond
    dst.StandardDate.wMilliseconds = src.StandardDate.wMilliseconds
    dst.StandardBias = src.StandardBias
    dst.DaylightDate.wYear = src.DaylightDate.wYear
    dst.DaylightDate.wMonth = src.DaylightDate.wMonth
    dst.DaylightDate.wDayOfWeek = src.DaylightDate.wDayOfWeek
    dst.DaylightDate.wDay = src.DaylightDate.wDay
    dst.DaylightDate.wHour = src.DaylightDate.wHour
    dst.DaylightDate.wMinute = src.DaylightDate.wMinute
    dst.DaylightDate.wSecond = src.DaylightDate.wSecond
    dst.DaylightDate.wMilliseconds = src.DaylightDate.wMilliseconds
    dst.DaylightBias = src.DaylightBias
}
