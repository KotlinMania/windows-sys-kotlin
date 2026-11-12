package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun timeBeginPeriod(uperiod: UInt): UInt

public expect fun timeEndPeriod(uperiod: UInt): UInt

public expect fun timeGetDevCaps(ptc: MutPtr<Timecaps>, cbtc: UInt): UInt

public expect fun timeGetSystemTime(pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt

public expect fun timeGetTime(): UInt

public expect fun timeKillEvent(utimerid: UInt): UInt

public expect fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt
