@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssys_windows_win32_media_timeBeginPeriod
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssys_windows_win32_media_timeEndPeriod
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssys_windows_win32_media_timeGetDevCaps
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssys_windows_win32_media_timeGetSystemTime
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssys_windows_win32_media_timeGetTime
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssys_windows_win32_media_timeKillEvent
import io.github.kotlinmania.windowssys.windows.win32.media.cinterop.windowssys_windows_win32_media_timeSetEvent
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    windowssys_windows_win32_media_timeBeginPeriod(uperiod)

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    windowssys_windows_win32_media_timeEndPeriod(uperiod)

public actual fun timeGetDevCaps(ptc: COpaquePointer?, cbtc: UInt): UInt =
    windowssys_windows_win32_media_timeGetDevCaps(ptc?.value?.toCPointer<ByteVar>(), cbtc)

public actual fun timeGetSystemTime(pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    windowssys_windows_win32_media_timeGetSystemTime(pmmt?.value?.toCPointer<ByteVar>(), cbmmt)

public actual fun timeGetTime(): UInt =
    windowssys_windows_win32_media_timeGetTime()

public actual fun timeKillEvent(utimerid: UInt): UInt =
    windowssys_windows_win32_media_timeKillEvent(utimerid)

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt =
    windowssys_windows_win32_media_timeSetEvent(udelay, uresolution, 0L.toCPointer<ByteVar>(), dwuser, fuevent)
