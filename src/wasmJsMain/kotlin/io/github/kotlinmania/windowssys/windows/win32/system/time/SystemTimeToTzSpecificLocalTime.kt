// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public fun SystemTimeToTzSpecificLocalTime(
    lptimezoneinformation: Long,
    lpuniversaltime: Long,
    lplocaltime: Long,
): BOOL =
    throw UnsupportedOperationException("SystemTimeToTzSpecificLocalTime requires Windows N-API addon")

public fun SystemTimeToTzSpecificLocalTime(
    lptimezoneinformation: TIME_ZONE_INFORMATION?,
    lpuniversaltime: SYSTEMTIME,
    lplocaltime: SYSTEMTIME,
): BOOL =
    throw UnsupportedOperationException("SystemTimeToTzSpecificLocalTime requires Windows N-API addon")
