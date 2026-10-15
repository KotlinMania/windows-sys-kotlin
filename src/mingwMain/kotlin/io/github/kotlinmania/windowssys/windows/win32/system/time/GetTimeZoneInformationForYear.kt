// port-lint: source Windows/Win32/System/Time/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_time_zone_information_for_year
import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.set
import kotlinx.cinterop.toCPointer

public fun GetTimeZoneInformationForYear(
    wyear: UShort,
    pdtzi: Long,
    ptzi: Long,
): BOOL =
    windows_sys_get_time_zone_information_for_year(
        wyear,
        pdtzi.toCPointer(),
        ptzi.toCPointer(),
    )

public fun GetTimeZoneInformationForYear(
    wyear: UShort,
    pdtzi: DYNAMIC_TIME_ZONE_INFORMATION?,
    ptzi: TIME_ZONE_INFORMATION,
): BOOL =
    memScoped {
        val nativeTzi = alloc<platform.windows.TIME_ZONE_INFORMATION>()
        val nativeDtziPtr =
            if (pdtzi != null) {
                val dtzi = alloc<platform.windows.DYNAMIC_TIME_ZONE_INFORMATION>()
                dtzi.Bias = pdtzi.Bias
                for (i in 0 until 32) {
                    dtzi.StandardName[i] = pdtzi.StandardName[i]
                    dtzi.DaylightName[i] = pdtzi.DaylightName[i]
                }
                dtzi.StandardDate.wYear = pdtzi.StandardDate.wYear
                dtzi.StandardDate.wMonth = pdtzi.StandardDate.wMonth
                dtzi.StandardDate.wDayOfWeek = pdtzi.StandardDate.wDayOfWeek
                dtzi.StandardDate.wDay = pdtzi.StandardDate.wDay
                dtzi.StandardDate.wHour = pdtzi.StandardDate.wHour
                dtzi.StandardDate.wMinute = pdtzi.StandardDate.wMinute
                dtzi.StandardDate.wSecond = pdtzi.StandardDate.wSecond
                dtzi.StandardDate.wMilliseconds = pdtzi.StandardDate.wMilliseconds
                dtzi.StandardBias = pdtzi.StandardBias
                dtzi.DaylightDate.wYear = pdtzi.DaylightDate.wYear
                dtzi.DaylightDate.wMonth = pdtzi.DaylightDate.wMonth
                dtzi.DaylightDate.wDayOfWeek = pdtzi.DaylightDate.wDayOfWeek
                dtzi.DaylightDate.wDay = pdtzi.DaylightDate.wDay
                dtzi.DaylightDate.wHour = pdtzi.DaylightDate.wHour
                dtzi.DaylightDate.wMinute = pdtzi.DaylightDate.wMinute
                dtzi.DaylightDate.wSecond = pdtzi.DaylightDate.wSecond
                dtzi.DaylightDate.wMilliseconds = pdtzi.DaylightDate.wMilliseconds
                dtzi.DaylightBias = pdtzi.DaylightBias
                for (i in 0 until 128) {
                    dtzi.TimeZoneKeyName[i] = pdtzi.TimeZoneKeyName[i]
                }
                dtzi.DynamicDaylightTimeDisabled = if (pdtzi.DynamicDaylightTimeDisabled) 1u else 0u
                dtzi.ptr
            } else {
                null
            }
        val res = windows_sys_get_time_zone_information_for_year(wyear, nativeDtziPtr, nativeTzi.ptr)
        if (res != 0) {
            copyNativeTimeZoneInformationToKotlin(nativeTzi, ptzi)
        }
        res
    }
