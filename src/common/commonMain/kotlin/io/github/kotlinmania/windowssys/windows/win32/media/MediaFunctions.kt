package io.github.kotlinmania.windowssys.windows.win32.media

public expect fun timeBeginPeriod(uperiod: UInt): UInt

public expect fun timeEndPeriod(uperiod: UInt): UInt

public expect fun timeGetDevCaps(ptc: Long, cbtc: UInt): UInt

public expect fun timeGetSystemTime(pmmt: Long, cbmmt: UInt): UInt

public expect fun timeGetTime(): UInt

public expect fun timeKillEvent(utimerid: UInt): UInt

public expect fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: LPTIMECALLBACK, dwuser: ULong, fuevent: UInt): UInt
