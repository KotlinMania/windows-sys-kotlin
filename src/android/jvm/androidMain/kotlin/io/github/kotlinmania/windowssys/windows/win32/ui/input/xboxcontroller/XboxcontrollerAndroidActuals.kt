@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32UiInputXboxcontrollerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputEnable(enable: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds(dwuserindex: Int, prenderdeviceid: Long, prendercount: Long, pcapturedeviceid: Long, pcapturecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation(dwuserindex: Int, devtype: Byte, pbatteryinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities(dwuserindex: Int, dwflags: Int, pcapabilities: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke(dwuserindex: Int, dwreserved: Int, pkeystroke: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputGetState(dwuserindex: Int, pstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputXboxcontrollerXInputSetState(dwuserindex: Int, pvibration: Long): Int
}

public actual fun xInputEnable(enable: Bool) {
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputEnable(enable)
}

public actual fun xInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: Pwstr, prendercount: MutPtr, pcapturedeviceid: Pwstr, pcapturecount: MutPtr): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds(dwuserindex.toInt(), prenderdeviceid.rawAddress, prendercount.rawAddress, pcapturedeviceid.rawAddress, pcapturecount.rawAddress).toUInt()

public actual fun xInputGetBatteryInformation(dwuserindex: UInt, devtype: BatteryDevtype, pbatteryinformation: MutPtr): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation(dwuserindex.toInt(), devtype.toByte(), pbatteryinformation.rawAddress).toUInt()

public actual fun xInputGetCapabilities(dwuserindex: UInt, dwflags: XinputFlag, pcapabilities: MutPtr): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities(dwuserindex.toInt(), dwflags.toInt(), pcapabilities.rawAddress).toUInt()

public actual fun xInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: MutPtr): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke(dwuserindex.toInt(), dwreserved.toInt(), pkeystroke.rawAddress).toUInt()

public actual fun xInputGetState(dwuserindex: UInt, pstate: MutPtr): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputGetState(dwuserindex.toInt(), pstate.rawAddress).toUInt()

public actual fun xInputSetState(dwuserindex: UInt, pvibration: ConstPtr): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssysWindowsWin32UiInputXboxcontrollerXInputSetState(dwuserindex.toInt(), pvibration.rawAddress).toUInt()
