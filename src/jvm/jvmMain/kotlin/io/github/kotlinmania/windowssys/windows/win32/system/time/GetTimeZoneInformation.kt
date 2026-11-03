// port-lint: source Windows/Win32/System/Time/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt =
    Kernel32Jni.GetTimeZoneInformation(lptimezoneinformation).toUInt()

public fun GetTimeZoneInformation(lptimezoneinformation: TIME_ZONE_INFORMATION): UInt {
    val outInts = IntArray(19)
    val outStandardName = ShortArray(32)
    val outDaylightName = ShortArray(32)
    val res = Kernel32Jni.GetTimeZoneInformationStruct(outInts, outStandardName, outDaylightName)
    populateTimeZoneInformationFromArrays(outInts, outStandardName, outDaylightName, lptimezoneinformation)
    return res.toUInt()
}

internal fun populateTimeZoneInformationFromArrays(
    outInts: IntArray,
    outStandardName: ShortArray,
    outDaylightName: ShortArray,
    out: TIME_ZONE_INFORMATION,
) {
    out.Bias = outInts[0]
    for (i in 0 until 32) {
        out.StandardName[i] = outStandardName[i].toUShort()
        out.DaylightName[i] = outDaylightName[i].toUShort()
    }
    out.StandardDate =
        SYSTEMTIME(
            wYear = outInts[1].toUShort(),
            wMonth = outInts[2].toUShort(),
            wDayOfWeek = outInts[3].toUShort(),
            wDay = outInts[4].toUShort(),
            wHour = outInts[5].toUShort(),
            wMinute = outInts[6].toUShort(),
            wSecond = outInts[7].toUShort(),
            wMilliseconds = outInts[8].toUShort(),
        )
    out.StandardBias = outInts[9]
    out.DaylightDate =
        SYSTEMTIME(
            wYear = outInts[10].toUShort(),
            wMonth = outInts[11].toUShort(),
            wDayOfWeek = outInts[12].toUShort(),
            wDay = outInts[13].toUShort(),
            wHour = outInts[14].toUShort(),
            wMinute = outInts[15].toUShort(),
            wSecond = outInts[16].toUShort(),
            wMilliseconds = outInts[17].toUShort(),
        )
    out.DaylightBias = outInts[18]
}
