package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun xInputEnable(enable: Bool)

public expect fun xInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: Pwstr, prendercount: COpaquePointer?, pcapturedeviceid: Pwstr, pcapturecount: COpaquePointer?): UInt

public expect fun xInputGetBatteryInformation(dwuserindex: UInt, devtype: BatteryDevtype, pbatteryinformation: COpaquePointer?): UInt

public expect fun xInputGetCapabilities(dwuserindex: UInt, dwflags: XinputFlag, pcapabilities: COpaquePointer?): UInt

public expect fun xInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: COpaquePointer?): UInt

public expect fun xInputGetState(dwuserindex: UInt, pstate: COpaquePointer?): UInt

public expect fun xInputSetState(dwuserindex: UInt, pvibration: COpaquePointer?): UInt
