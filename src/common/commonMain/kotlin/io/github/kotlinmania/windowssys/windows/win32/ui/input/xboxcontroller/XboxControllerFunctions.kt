package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun xInputEnable(enable: Bool)

public expect fun xInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: Pwstr, prendercount: MutPtr<UInt>, pcapturedeviceid: Pwstr, pcapturecount: MutPtr<UInt>): UInt

public expect fun xInputGetBatteryInformation(dwuserindex: UInt, devtype: BatteryDevtype, pbatteryinformation: MutPtr<XinputBatteryInformation>): UInt

public expect fun xInputGetCapabilities(dwuserindex: UInt, dwflags: XinputFlag, pcapabilities: MutPtr<XinputCapabilities>): UInt

public expect fun xInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: MutPtr<XinputKeystroke>): UInt

public expect fun xInputGetState(dwuserindex: UInt, pstate: MutPtr<XinputState>): UInt

public expect fun xInputSetState(dwuserindex: UInt, pvibration: ConstPtr<XinputVibration>): UInt
