package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun interface FnCallback {
    public operator fun invoke(utimerid: UInt, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public fun timeBeginPeriod(uperiod: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "timeBeginPeriod", longArrayOf(uperiod.toLong())).toUInt()
}

public fun timeEndPeriod(uperiod: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "timeEndPeriod", longArrayOf(uperiod.toLong())).toUInt()
}

public fun timeGetDevCaps(ptc: Long, cbtc: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "timeGetDevCaps", longArrayOf(ptc, cbtc.toLong())).toUInt()
}

public fun timeGetSystemTime(pmmt: Long, cbmmt: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "timeGetSystemTime", longArrayOf(pmmt, cbmmt.toLong())).toUInt()
}

public fun timeGetTime(): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "timeGetTime", longArrayOf()).toUInt()
}

public fun timeKillEvent(utimerid: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "timeKillEvent", longArrayOf(utimerid.toLong())).toUInt()
}

public fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: LPTIMECALLBACK, dwuser: ULong, fuevent: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "timeSetEvent", longArrayOf(udelay.toLong(), uresolution.toLong(), Win32DynamicFfi.objectSlot(fptc), dwuser.toLong(), fuevent.toLong())).toUInt()
}
