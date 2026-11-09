package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

public expect fun XInputEnable(enable: BOOL)

public expect fun XInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: PWSTR, prendercount: Long, pcapturedeviceid: PWSTR, pcapturecount: Long): UInt

public expect fun XInputGetBatteryInformation(dwuserindex: UInt, devtype: BATTERY_DEVTYPE, pbatteryinformation: Long): UInt

public expect fun XInputGetCapabilities(dwuserindex: UInt, dwflags: XINPUT_FLAG, pcapabilities: Long): UInt

public expect fun XInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: Long): UInt

public expect fun XInputGetState(dwuserindex: UInt, pstate: Long): UInt

public expect fun XInputSetState(dwuserindex: UInt, pvibration: Long): UInt
