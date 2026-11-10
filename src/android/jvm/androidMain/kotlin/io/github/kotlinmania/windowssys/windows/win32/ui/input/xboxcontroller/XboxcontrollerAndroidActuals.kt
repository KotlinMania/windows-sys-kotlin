@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32UiInputXboxcontrollerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_xInputEnable(enable: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_xInputGetAudioDeviceIds(dwuserindex: Int, prenderdeviceid: Long, prendercount: Long, pcapturedeviceid: Long, pcapturecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_xInputGetBatteryInformation(dwuserindex: Int, devtype: Byte, pbatteryinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_xInputGetCapabilities(dwuserindex: Int, dwflags: Int, pcapabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_xInputGetKeystroke(dwuserindex: Int, dwreserved: Int, pkeystroke: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_xInputGetState(dwuserindex: Int, pstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_xboxcontroller_xInputSetState(dwuserindex: Int, pvibration: Long): Int
}

public actual fun xInputEnable(enable: Bool) {
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_xInputEnable(enable)
}

public actual fun xInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: Pwstr, prendercount: COpaquePointer?, pcapturedeviceid: Pwstr, pcapturecount: COpaquePointer?): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetAudioDeviceIds(dwuserindex.toInt(), (prenderdeviceid?.value ?: 0L), (prendercount?.value ?: 0L), (pcapturedeviceid?.value ?: 0L), (pcapturecount?.value ?: 0L)).toUInt()

public actual fun xInputGetBatteryInformation(dwuserindex: UInt, devtype: BatteryDevtype, pbatteryinformation: COpaquePointer?): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetBatteryInformation(dwuserindex.toInt(), devtype.toByte(), (pbatteryinformation?.value ?: 0L)).toUInt()

public actual fun xInputGetCapabilities(dwuserindex: UInt, dwflags: XinputFlag, pcapabilities: COpaquePointer?): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetCapabilities(dwuserindex.toInt(), dwflags.toInt(), (pcapabilities?.value ?: 0L)).toUInt()

public actual fun xInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: COpaquePointer?): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetKeystroke(dwuserindex.toInt(), dwreserved.toInt(), (pkeystroke?.value ?: 0L)).toUInt()

public actual fun xInputGetState(dwuserindex: UInt, pstate: COpaquePointer?): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetState(dwuserindex.toInt(), (pstate?.value ?: 0L)).toUInt()

public actual fun xInputSetState(dwuserindex: UInt, pvibration: COpaquePointer?): UInt =
    WindowsWin32UiInputXboxcontrollerJniBridge.windowssys_windows_win32_ui_input_xboxcontroller_xInputSetState(dwuserindex.toInt(), (pvibration?.value ?: 0L)).toUInt()
