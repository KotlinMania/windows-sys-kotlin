// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL

public fun GetTimeZoneInformationForYear(
    wyear: UShort,
    pdtzi: Long,
    ptzi: Long,
): BOOL =
    WindowsSysNative.GetTimeZoneInformationForYear(wyear.toInt(), pdtzi.toDouble(), ptzi.toDouble())

public fun GetTimeZoneInformationForYear(
    wyear: UShort,
    pdtzi: DYNAMIC_TIME_ZONE_INFORMATION?,
    ptzi: TIME_ZONE_INFORMATION,
): BOOL =
    WindowsSysNative.GetTimeZoneInformationForYear(wyear.toInt(), 0.0, 0.0)
