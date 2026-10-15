// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetTimeZoneInformationForYear(
    wyear: UShort,
    pdtzi: Long,
    ptzi: Long,
): BOOL =
    Kernel32Jni.GetTimeZoneInformationForYear(wyear.toInt(), pdtzi, ptzi)

public fun GetTimeZoneInformationForYear(
    wyear: UShort,
    pdtzi: DYNAMIC_TIME_ZONE_INFORMATION?,
    ptzi: TIME_ZONE_INFORMATION,
): BOOL {
    val outInts = IntArray(19)
    val outStandardName = ShortArray(32)
    val outDaylightName = ShortArray(32)
    val res = Kernel32Jni.GetTimeZoneInformationForYearStruct(wyear.toInt(), outInts, outStandardName, outDaylightName)
    if (res != 0) {
        populateTimeZoneInformationFromArrays(outInts, outStandardName, outDaylightName, ptzi)
    }
    return res
}
