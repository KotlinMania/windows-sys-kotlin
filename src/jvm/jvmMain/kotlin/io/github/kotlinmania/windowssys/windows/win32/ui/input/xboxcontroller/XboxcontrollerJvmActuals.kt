@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

private object WindowsWin32UiInputXboxcontrollerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_XInputEnable(enable: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_XInputGetAudioDeviceIds(dwuserindex: Int, prenderdeviceid: Long, prendercount: Long, pcapturedeviceid: Long, pcapturecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_XInputGetBatteryInformation(dwuserindex: Int, devtype: Byte, pbatteryinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_XInputGetCapabilities(dwuserindex: Int, dwflags: Int, pcapabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_XInputGetKeystroke(dwuserindex: Int, dwreserved: Int, pkeystroke: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_XInputGetState(dwuserindex: Int, pstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_XInputSetState(dwuserindex: Int, pvibration: Long): Int
}

public actual fun XInputEnable(enable: BOOL) {
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_XInputEnable(enable)
}

public actual fun XInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: PWSTR, prendercount: Long, pcapturedeviceid: PWSTR, pcapturecount: Long): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetAudioDeviceIds(dwuserindex.toInt(), prenderdeviceid, prendercount, pcapturedeviceid, pcapturecount).toUInt()

public actual fun XInputGetBatteryInformation(dwuserindex: UInt, devtype: BATTERY_DEVTYPE, pbatteryinformation: Long): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetBatteryInformation(dwuserindex.toInt(), devtype.toByte(), pbatteryinformation).toUInt()

public actual fun XInputGetCapabilities(dwuserindex: UInt, dwflags: XINPUT_FLAG, pcapabilities: Long): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetCapabilities(dwuserindex.toInt(), dwflags.toInt(), pcapabilities).toUInt()

public actual fun XInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: Long): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetKeystroke(dwuserindex.toInt(), dwreserved.toInt(), pkeystroke).toUInt()

public actual fun XInputGetState(dwuserindex: UInt, pstate: Long): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetState(dwuserindex.toInt(), pstate).toUInt()

public actual fun XInputSetState(dwuserindex: UInt, pvibration: Long): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_XInputSetState(dwuserindex.toInt(), pvibration).toUInt()
