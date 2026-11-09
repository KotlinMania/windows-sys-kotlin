@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    0u

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    0u

public actual fun timeGetDevCaps(ptc: Long, cbtc: UInt): UInt =
    0u

public actual fun timeGetSystemTime(pmmt: Long, cbmmt: UInt): UInt =
    0u

public actual fun timeGetTime(): UInt =
    0u

public actual fun timeKillEvent(utimerid: UInt): UInt =
    0u

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: LPTIMECALLBACK, dwuser: ULong, fuevent: UInt): UInt =
    0u
