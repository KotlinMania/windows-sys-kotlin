// port-lint: source Windows/Win32/System/Time/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.cinterop.windows_sys_tz_specific_local_time_to_system_time
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer

public fun TzSpecificLocalTimeToSystemTime(
    lptimezoneinformation: Long,
    lplocaltime: Long,
    lpuniversaltime: Long,
): BOOL =
    windows_sys_tz_specific_local_time_to_system_time(
        lptimezoneinformation.toCPointer(),
        lplocaltime.toCPointer(),
        lpuniversaltime.toCPointer(),
    )

public fun TzSpecificLocalTimeToSystemTime(
    lptimezoneinformation: TIME_ZONE_INFORMATION?,
    lplocaltime: SYSTEMTIME,
    lpuniversaltime: SYSTEMTIME,
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
        val local = alloc<platform.windows.SYSTEMTIME>()
        local.wYear = lplocaltime.wYear
        local.wMonth = lplocaltime.wMonth
        local.wDayOfWeek = lplocaltime.wDayOfWeek
        local.wDay = lplocaltime.wDay
        local.wHour = lplocaltime.wHour
        local.wMinute = lplocaltime.wMinute
        local.wSecond = lplocaltime.wSecond
        local.wMilliseconds = lplocaltime.wMilliseconds
        val utc = alloc<platform.windows.SYSTEMTIME>()
        val res = windows_sys_tz_specific_local_time_to_system_time(nativeTziPtr, local.ptr, utc.ptr)
        if (res != 0) {
            lpuniversaltime.wYear = utc.wYear
            lpuniversaltime.wMonth = utc.wMonth
            lpuniversaltime.wDayOfWeek = utc.wDayOfWeek
            lpuniversaltime.wDay = utc.wDay
            lpuniversaltime.wHour = utc.wHour
            lpuniversaltime.wMinute = utc.wMinute
            lpuniversaltime.wSecond = utc.wSecond
            lpuniversaltime.wMilliseconds = utc.wMilliseconds
        }
        res
    }
