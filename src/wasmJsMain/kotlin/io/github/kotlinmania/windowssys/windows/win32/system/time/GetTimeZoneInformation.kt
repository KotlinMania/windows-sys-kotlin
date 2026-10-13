// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

public fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt =
    throw UnsupportedOperationException("GetTimeZoneInformation requires Windows N-API addon")
