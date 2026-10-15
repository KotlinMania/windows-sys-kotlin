// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public fun SystemTimeToFileTime(
    lpsystemtime: Long,
    lpfiletime: Long,
): BOOL =
    throw UnsupportedOperationException("SystemTimeToFileTime requires Windows N-API addon")

public fun SystemTimeToFileTime(
    lpsystemtime: SYSTEMTIME,
    lpfiletime: FILETIME,
): BOOL =
    throw UnsupportedOperationException("SystemTimeToFileTime requires Windows N-API addon")
