package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

public expect fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: MutPtr<DynamicTimeZoneInformation>): UInt

public expect fun fileTimeToSystemTime(lpfiletime: ConstPtr<Filetime>, lpsystemtime: MutPtr<Systemtime>): Bool

public expect fun getDynamicTimeZoneInformation(ptimezoneinformation: MutPtr<DynamicTimeZoneInformation>): UInt

public expect fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, firstyear: MutPtr<UInt>, lastyear: MutPtr<UInt>): UInt

public expect fun getTimeZoneInformation(lptimezoneinformation: MutPtr<TimeZoneInformation>): UInt

public expect fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: ConstPtr<DynamicTimeZoneInformation>, ptzi: MutPtr<TimeZoneInformation>): Bool

public expect fun localFileTimeToLocalSystemTime(timezoneinformation: ConstPtr<TimeZoneInformation>, localfiletime: ConstPtr<Filetime>, localsystemtime: MutPtr<Systemtime>): Bool

public expect fun localSystemTimeToLocalFileTime(timezoneinformation: ConstPtr<TimeZoneInformation>, localsystemtime: ConstPtr<Systemtime>, localfiletime: MutPtr<Filetime>): Bool

public expect fun setDynamicTimeZoneInformation(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>): Bool

public expect fun setTimeZoneInformation(lptimezoneinformation: ConstPtr<TimeZoneInformation>): Bool

public expect fun systemTimeToFileTime(lpsystemtime: ConstPtr<Systemtime>, lpfiletime: MutPtr<Filetime>): Bool

public expect fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: ConstPtr<TimeZoneInformation>, lpuniversaltime: ConstPtr<Systemtime>, lplocaltime: MutPtr<Systemtime>): Bool

public expect fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, lpuniversaltime: ConstPtr<Systemtime>, lplocaltime: MutPtr<Systemtime>): Bool

public expect fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: ConstPtr<TimeZoneInformation>, lplocaltime: ConstPtr<Systemtime>, lpuniversaltime: MutPtr<Systemtime>): Bool

public expect fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, lplocaltime: ConstPtr<Systemtime>, lpuniversaltime: MutPtr<Systemtime>): Bool
