// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.WindowsSysNative

public fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt =
    WindowsSysNative.GetTimeZoneInformation(lptimezoneinformation.toDouble()).toUInt()

public fun GetTimeZoneInformation(lptimezoneinformation: TIME_ZONE_INFORMATION): UInt =
    WindowsSysNative.GetTimeZoneInformation(0.0).toUInt()
