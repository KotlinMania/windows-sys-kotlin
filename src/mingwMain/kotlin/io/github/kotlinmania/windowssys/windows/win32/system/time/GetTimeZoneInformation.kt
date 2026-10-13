// port-lint: source Windows/Win32/System/Time/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_time_zone_information
import kotlinx.cinterop.toCPointer

public fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt =
    windows_sys_get_time_zone_information(lptimezoneinformation.toCPointer())
