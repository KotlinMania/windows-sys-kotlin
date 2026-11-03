package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

public fun XInputEnable(enable: BOOL) {
    Win32DynamicFfi.invoke("xinput1_4.dll", "XInputEnable", longArrayOf(enable.toLong()))
}

public fun XInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: PWSTR, prendercount: Long, pcapturedeviceid: PWSTR, pcapturecount: Long): UInt {
    return Win32DynamicFfi.invoke("xinput1_4.dll", "XInputGetAudioDeviceIds", longArrayOf(dwuserindex.toLong(), prenderdeviceid, prendercount, pcapturedeviceid, pcapturecount)).toUInt()
}

public fun XInputGetBatteryInformation(dwuserindex: UInt, devtype: BATTERY_DEVTYPE, pbatteryinformation: Long): UInt {
    return Win32DynamicFfi.invoke("xinput1_4.dll", "XInputGetBatteryInformation", longArrayOf(dwuserindex.toLong(), devtype.toLong(), pbatteryinformation)).toUInt()
}

public fun XInputGetCapabilities(dwuserindex: UInt, dwflags: XINPUT_FLAG, pcapabilities: Long): UInt {
    return Win32DynamicFfi.invoke("xinput1_4.dll", "XInputGetCapabilities", longArrayOf(dwuserindex.toLong(), dwflags.toLong(), pcapabilities)).toUInt()
}

public fun XInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: Long): UInt {
    return Win32DynamicFfi.invoke("xinput1_4.dll", "XInputGetKeystroke", longArrayOf(dwuserindex.toLong(), dwreserved.toLong(), pkeystroke)).toUInt()
}

public fun XInputGetState(dwuserindex: UInt, pstate: Long): UInt {
    return Win32DynamicFfi.invoke("xinput1_4.dll", "XInputGetState", longArrayOf(dwuserindex.toLong(), pstate)).toUInt()
}

public fun XInputSetState(dwuserindex: UInt, pvibration: Long): UInt {
    return Win32DynamicFfi.invoke("xinput1_4.dll", "XInputSetState", longArrayOf(dwuserindex.toLong(), pvibration)).toUInt()
}
