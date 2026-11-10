package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.windowssys.COpaquePointer

public expect fun timeBeginPeriod(uperiod: UInt): UInt

public expect fun timeEndPeriod(uperiod: UInt): UInt

public expect fun timeGetDevCaps(ptc: COpaquePointer?, cbtc: UInt): UInt

public expect fun timeGetSystemTime(pmmt: COpaquePointer?, cbmmt: UInt): UInt

public expect fun timeGetTime(): UInt

public expect fun timeKillEvent(utimerid: UInt): UInt

public expect fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt
