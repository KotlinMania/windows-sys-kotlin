// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public fun SystemTimeToFileTime(
    lpsystemtime: Long,
    lpfiletime: Long,
): BOOL =
    WindowsSysNative.SystemTimeToFileTime(lpsystemtime.toDouble(), lpfiletime.toDouble())

public fun SystemTimeToFileTime(
    lpsystemtime: SYSTEMTIME,
    lpfiletime: FILETIME,
): BOOL =
    WindowsSysNative.SystemTimeToFileTime(0.0, 0.0)
