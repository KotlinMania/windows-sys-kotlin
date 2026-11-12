@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssysWindowsWin32UiInputXboxcontrollerXInputEnable
import io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds
import io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation
import io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities
import io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke
import io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssysWindowsWin32UiInputXboxcontrollerXInputGetState
import io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssysWindowsWin32UiInputXboxcontrollerXInputSetState
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun xInputEnable(enable: Bool) {
    windowssysWindowsWin32UiInputXboxcontrollerXInputEnable(enable)
}

public actual fun xInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: Pwstr, prendercount: MutPtr<UInt>, pcapturedeviceid: Pwstr, pcapturecount: MutPtr<UInt>): UInt =
    windowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds(dwuserindex, prenderdeviceid.rawAddress.toCPointer<ByteVar>(), prendercount.rawAddress.toCPointer<ByteVar>(), pcapturedeviceid.rawAddress.toCPointer<ByteVar>(), pcapturecount.rawAddress.toCPointer<ByteVar>())

public actual fun xInputGetBatteryInformation(dwuserindex: UInt, devtype: BatteryDevtype, pbatteryinformation: MutPtr<XinputBatteryInformation>): UInt =
    windowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation(dwuserindex, devtype, pbatteryinformation.rawAddress.toCPointer<ByteVar>())

public actual fun xInputGetCapabilities(dwuserindex: UInt, dwflags: XinputFlag, pcapabilities: MutPtr<XinputCapabilities>): UInt =
    windowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities(dwuserindex, dwflags, pcapabilities.rawAddress.toCPointer<ByteVar>())

public actual fun xInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: MutPtr<XinputKeystroke>): UInt =
    windowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke(dwuserindex, dwreserved, pkeystroke.rawAddress.toCPointer<ByteVar>())

public actual fun xInputGetState(dwuserindex: UInt, pstate: MutPtr<XinputState>): UInt =
    windowssysWindowsWin32UiInputXboxcontrollerXInputGetState(dwuserindex, pstate.rawAddress.toCPointer<ByteVar>())

public actual fun xInputSetState(dwuserindex: UInt, pvibration: ConstPtr<XinputVibration>): UInt =
    windowssysWindowsWin32UiInputXboxcontrollerXInputSetState(dwuserindex, pvibration.rawAddress.toCPointer<ByteVar>())
