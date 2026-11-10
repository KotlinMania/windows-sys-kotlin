@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.windowssys.COpaquePointer

private object WindowsWin32MediaJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_timeBeginPeriod(uperiod: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_timeEndPeriod(uperiod: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_timeGetDevCaps(ptc: Long, cbtc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_timeGetSystemTime(pmmt: Long, cbmmt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_timeGetTime(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_timeKillEvent(utimerid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_timeSetEvent(udelay: Int, uresolution: Int, fptc: Long, dwuser: Long, fuevent: Int): Int
}

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssys_windows_win32_media_timeBeginPeriod(uperiod.toInt()).toUInt()

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssys_windows_win32_media_timeEndPeriod(uperiod.toInt()).toUInt()

public actual fun timeGetDevCaps(ptc: COpaquePointer?, cbtc: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssys_windows_win32_media_timeGetDevCaps((ptc?.value ?: 0L), cbtc.toInt()).toUInt()

public actual fun timeGetSystemTime(pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssys_windows_win32_media_timeGetSystemTime((pmmt?.value ?: 0L), cbmmt.toInt()).toUInt()

public actual fun timeGetTime(): UInt =
    WindowsWin32MediaJniBridge.windowssys_windows_win32_media_timeGetTime().toUInt()

public actual fun timeKillEvent(utimerid: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssys_windows_win32_media_timeKillEvent(utimerid.toInt()).toUInt()

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssys_windows_win32_media_timeSetEvent(udelay.toInt(), uresolution.toInt(), 0L, dwuser.toLong(), fuevent.toInt()).toUInt()
