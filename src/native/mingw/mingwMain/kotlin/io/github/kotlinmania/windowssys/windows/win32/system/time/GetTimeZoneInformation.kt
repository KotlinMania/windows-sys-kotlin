// port-lint: source Windows/Win32/System/Time/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_time_zone_information
import kotlinx.cinterop.alloc
import kotlinx.cinterop.get
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer

public fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt =
    windows_sys_get_time_zone_information(lptimezoneinformation.toCPointer())

public fun GetTimeZoneInformation(lptimezoneinformation: TIME_ZONE_INFORMATION): UInt =
    memScoped {
        val native = alloc<platform.windows.TIME_ZONE_INFORMATION>()
        val res = windows_sys_get_time_zone_information(native.ptr)
        copyNativeTimeZoneInformationToKotlin(native, lptimezoneinformation)
        res
    }

internal fun copyNativeTimeZoneInformationToKotlin(
    native: platform.windows.TIME_ZONE_INFORMATION,
    out: TIME_ZONE_INFORMATION,
) {
    out.Bias = native.Bias
    for (i in 0 until 32) {
        out.StandardName[i] = native.StandardName[i]
        out.DaylightName[i] = native.DaylightName[i]
    }
    out.StandardDate.wYear = native.StandardDate.wYear
    out.StandardDate.wMonth = native.StandardDate.wMonth
    out.StandardDate.wDayOfWeek = native.StandardDate.wDayOfWeek
    out.StandardDate.wDay = native.StandardDate.wDay
    out.StandardDate.wHour = native.StandardDate.wHour
    out.StandardDate.wMinute = native.StandardDate.wMinute
    out.StandardDate.wSecond = native.StandardDate.wSecond
    out.StandardDate.wMilliseconds = native.StandardDate.wMilliseconds
    out.StandardBias = native.StandardBias
    out.DaylightDate.wYear = native.DaylightDate.wYear
    out.DaylightDate.wMonth = native.DaylightDate.wMonth
    out.DaylightDate.wDayOfWeek = native.DaylightDate.wDayOfWeek
    out.DaylightDate.wDay = native.DaylightDate.wDay
    out.DaylightDate.wHour = native.DaylightDate.wHour
    out.DaylightDate.wMinute = native.DaylightDate.wMinute
    out.DaylightDate.wSecond = native.DaylightDate.wSecond
    out.DaylightDate.wMilliseconds = native.DaylightDate.wMilliseconds
    out.DaylightBias = native.DaylightBias
}
