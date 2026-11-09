@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun XInputEnable(enable: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_XInputEnable(enable)
}

public actual fun XInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: PWSTR, prendercount: Long, pcapturedeviceid: PWSTR, pcapturecount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetAudioDeviceIds(dwuserindex, prenderdeviceid.toCPointer<ByteVar>(), prendercount.toCPointer<ByteVar>(), pcapturedeviceid.toCPointer<ByteVar>(), pcapturecount.toCPointer<ByteVar>())

public actual fun XInputGetBatteryInformation(dwuserindex: UInt, devtype: BATTERY_DEVTYPE, pbatteryinformation: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetBatteryInformation(dwuserindex, devtype, pbatteryinformation.toCPointer<ByteVar>())

public actual fun XInputGetCapabilities(dwuserindex: UInt, dwflags: XINPUT_FLAG, pcapabilities: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetCapabilities(dwuserindex, dwflags, pcapabilities.toCPointer<ByteVar>())

public actual fun XInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetKeystroke(dwuserindex, dwreserved, pkeystroke.toCPointer<ByteVar>())

public actual fun XInputGetState(dwuserindex: UInt, pstate: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetState(dwuserindex, pstate.toCPointer<ByteVar>())

public actual fun XInputSetState(dwuserindex: UInt, pvibration: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_XInputSetState(dwuserindex, pvibration.toCPointer<ByteVar>())
