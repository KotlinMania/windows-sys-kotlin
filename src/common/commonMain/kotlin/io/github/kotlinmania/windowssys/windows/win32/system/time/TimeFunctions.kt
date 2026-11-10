package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public expect fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: COpaquePointer?): UInt

public expect fun fileTimeToSystemTime(lpfiletime: COpaquePointer?, lpsystemtime: COpaquePointer?): Bool

public expect fun getDynamicTimeZoneInformation(ptimezoneinformation: COpaquePointer?): UInt

public expect fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: COpaquePointer?, firstyear: COpaquePointer?, lastyear: COpaquePointer?): UInt

public expect fun getTimeZoneInformation(lptimezoneinformation: COpaquePointer?): UInt

public expect fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: COpaquePointer?, ptzi: COpaquePointer?): Bool

public expect fun localFileTimeToLocalSystemTime(timezoneinformation: COpaquePointer?, localfiletime: COpaquePointer?, localsystemtime: COpaquePointer?): Bool

public expect fun localSystemTimeToLocalFileTime(timezoneinformation: COpaquePointer?, localsystemtime: COpaquePointer?, localfiletime: COpaquePointer?): Bool

public expect fun setDynamicTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool

public expect fun setTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool

public expect fun systemTimeToFileTime(lpsystemtime: COpaquePointer?, lpfiletime: COpaquePointer?): Bool

public expect fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool

public expect fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool

public expect fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool

public expect fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool
