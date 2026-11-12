package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: MutPtr): UInt

public expect fun fileTimeToSystemTime(lpfiletime: ConstPtr, lpsystemtime: MutPtr): Bool

public expect fun getDynamicTimeZoneInformation(ptimezoneinformation: MutPtr): UInt

public expect fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: ConstPtr, firstyear: MutPtr, lastyear: MutPtr): UInt

public expect fun getTimeZoneInformation(lptimezoneinformation: MutPtr): UInt

public expect fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: ConstPtr, ptzi: MutPtr): Bool

public expect fun localFileTimeToLocalSystemTime(timezoneinformation: ConstPtr, localfiletime: ConstPtr, localsystemtime: MutPtr): Bool

public expect fun localSystemTimeToLocalFileTime(timezoneinformation: ConstPtr, localsystemtime: ConstPtr, localfiletime: MutPtr): Bool

public expect fun setDynamicTimeZoneInformation(lptimezoneinformation: ConstPtr): Bool

public expect fun setTimeZoneInformation(lptimezoneinformation: ConstPtr): Bool

public expect fun systemTimeToFileTime(lpsystemtime: ConstPtr, lpfiletime: MutPtr): Bool

public expect fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: ConstPtr, lpuniversaltime: ConstPtr, lplocaltime: MutPtr): Bool

public expect fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: ConstPtr, lpuniversaltime: ConstPtr, lplocaltime: MutPtr): Bool

public expect fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: ConstPtr, lplocaltime: ConstPtr, lpuniversaltime: MutPtr): Bool

public expect fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: ConstPtr, lplocaltime: ConstPtr, lpuniversaltime: MutPtr): Bool
