// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL

public fun GetTimeZoneInformationForYear(
    wyear: UShort,
    pdtzi: Long,
    ptzi: Long,
): BOOL =
    throw UnsupportedOperationException("GetTimeZoneInformationForYear requires Windows N-API addon")

public fun GetTimeZoneInformationForYear(
    wyear: UShort,
    pdtzi: DYNAMIC_TIME_ZONE_INFORMATION?,
    ptzi: TIME_ZONE_INFORMATION,
): BOOL =
    throw UnsupportedOperationException("GetTimeZoneInformationForYear requires Windows N-API addon")
