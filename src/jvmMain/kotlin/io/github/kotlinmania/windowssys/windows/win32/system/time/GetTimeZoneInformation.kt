// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt =
    Kernel32Jni.GetTimeZoneInformation(lptimezoneinformation).toUInt()
