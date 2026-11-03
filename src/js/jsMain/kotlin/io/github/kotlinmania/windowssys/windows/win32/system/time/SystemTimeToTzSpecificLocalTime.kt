// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public fun SystemTimeToTzSpecificLocalTime(
    lptimezoneinformation: Long,
    lpuniversaltime: Long,
    lplocaltime: Long,
): BOOL =
    WindowsSysNative.SystemTimeToTzSpecificLocalTime(
        lptimezoneinformation.toDouble(),
        lpuniversaltime.toDouble(),
        lplocaltime.toDouble(),
    )

public fun SystemTimeToTzSpecificLocalTime(
    lptimezoneinformation: TIME_ZONE_INFORMATION?,
    lpuniversaltime: SYSTEMTIME,
    lplocaltime: SYSTEMTIME,
): BOOL =
    WindowsSysNative.SystemTimeToTzSpecificLocalTime(0.0, 0.0, 0.0)
