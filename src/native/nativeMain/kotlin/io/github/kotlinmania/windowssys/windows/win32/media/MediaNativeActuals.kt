@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssysWindowsWin32MediaTimeBeginPeriod
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssysWindowsWin32MediaTimeEndPeriod
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssysWindowsWin32MediaTimeGetDevCaps
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssysWindowsWin32MediaTimeGetSystemTime
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssysWindowsWin32MediaTimeGetTime
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssysWindowsWin32MediaTimeKillEvent
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssysWindowsWin32MediaTimeSetEvent
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    windowssysWindowsWin32MediaTimeBeginPeriod(uperiod)

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    windowssysWindowsWin32MediaTimeEndPeriod(uperiod)

public actual fun timeGetDevCaps(ptc: MutPtr<Timecaps>, cbtc: UInt): UInt =
    windowssysWindowsWin32MediaTimeGetDevCaps(ptc.rawAddress.toCPointer<ByteVar>(), cbtc)

public actual fun timeGetSystemTime(pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    windowssysWindowsWin32MediaTimeGetSystemTime(pmmt.rawAddress.toCPointer<ByteVar>(), cbmmt)

public actual fun timeGetTime(): UInt =
    windowssysWindowsWin32MediaTimeGetTime()

public actual fun timeKillEvent(utimerid: UInt): UInt =
    windowssysWindowsWin32MediaTimeKillEvent(utimerid)

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt =
    windowssysWindowsWin32MediaTimeSetEvent(udelay, uresolution, 0L.toCPointer<ByteVar>(), dwuser, fuevent)
