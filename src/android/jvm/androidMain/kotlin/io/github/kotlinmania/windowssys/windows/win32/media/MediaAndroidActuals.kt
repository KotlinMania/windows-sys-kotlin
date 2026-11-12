@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsWin32MediaJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeBeginPeriod(uperiod: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeEndPeriod(uperiod: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeGetDevCaps(ptc: Long, cbtc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeGetSystemTime(pmmt: Long, cbmmt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeGetTime(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeKillEvent(utimerid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeSetEvent(udelay: Int, uresolution: Int, fptc: Long, dwuser: Long, fuevent: Int): Int
}

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeBeginPeriod(uperiod.toInt()).toUInt()

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeEndPeriod(uperiod.toInt()).toUInt()

public actual fun timeGetDevCaps(ptc: MutPtr, cbtc: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeGetDevCaps(ptc.rawAddress, cbtc.toInt()).toUInt()

public actual fun timeGetSystemTime(pmmt: MutPtr, cbmmt: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeGetSystemTime(pmmt.rawAddress, cbmmt.toInt()).toUInt()

public actual fun timeGetTime(): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeGetTime().toUInt()

public actual fun timeKillEvent(utimerid: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeKillEvent(utimerid.toInt()).toUInt()

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeSetEvent(udelay.toInt(), uresolution.toInt(), 0L, dwuser.toLong(), fuevent.toInt()).toUInt()
