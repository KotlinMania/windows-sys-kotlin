// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public fun TzSpecificLocalTimeToSystemTime(
    lptimezoneinformation: Long,
    lplocaltime: Long,
    lpuniversaltime: Long,
): BOOL =
    throw UnsupportedOperationException("TzSpecificLocalTimeToSystemTime requires Windows N-API addon")

public fun TzSpecificLocalTimeToSystemTime(
    lptimezoneinformation: TIME_ZONE_INFORMATION?,
    lplocaltime: SYSTEMTIME,
    lpuniversaltime: SYSTEMTIME,
): BOOL =
    throw UnsupportedOperationException("TzSpecificLocalTimeToSystemTime requires Windows N-API addon")
