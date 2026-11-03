// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public fun TzSpecificLocalTimeToSystemTime(
    lptimezoneinformation: Long,
    lplocaltime: Long,
    lpuniversaltime: Long,
): BOOL =
    WindowsSysNative.TzSpecificLocalTimeToSystemTime(
        lptimezoneinformation.toDouble(),
        lplocaltime.toDouble(),
        lpuniversaltime.toDouble(),
    )

public fun TzSpecificLocalTimeToSystemTime(
    lptimezoneinformation: TIME_ZONE_INFORMATION?,
    lplocaltime: SYSTEMTIME,
    lpuniversaltime: SYSTEMTIME,
): BOOL =
    WindowsSysNative.TzSpecificLocalTimeToSystemTime(0.0, 0.0, 0.0)
