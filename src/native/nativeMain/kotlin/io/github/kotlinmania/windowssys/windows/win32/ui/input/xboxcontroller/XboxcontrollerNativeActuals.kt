@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun xInputEnable(enable: Bool) {
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_xInputEnable(enable)
}

public actual fun xInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: Pwstr, prendercount: COpaquePointer?, pcapturedeviceid: Pwstr, pcapturecount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetAudioDeviceIds(dwuserindex, prenderdeviceid?.value?.toCPointer<ByteVar>(), prendercount?.value?.toCPointer<ByteVar>(), pcapturedeviceid?.value?.toCPointer<ByteVar>(), pcapturecount?.value?.toCPointer<ByteVar>())

public actual fun xInputGetBatteryInformation(dwuserindex: UInt, devtype: BatteryDevtype, pbatteryinformation: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetBatteryInformation(dwuserindex, devtype, pbatteryinformation?.value?.toCPointer<ByteVar>())

public actual fun xInputGetCapabilities(dwuserindex: UInt, dwflags: XinputFlag, pcapabilities: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetCapabilities(dwuserindex, dwflags, pcapabilities?.value?.toCPointer<ByteVar>())

public actual fun xInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetKeystroke(dwuserindex, dwreserved, pkeystroke?.value?.toCPointer<ByteVar>())

public actual fun xInputGetState(dwuserindex: UInt, pstate: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetState(dwuserindex, pstate?.value?.toCPointer<ByteVar>())

public actual fun xInputSetState(dwuserindex: UInt, pvibration: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller.cinterop.windowssys_windows_win32_ui_input_xboxcontroller_xInputSetState(dwuserindex, pvibration?.value?.toCPointer<ByteVar>())
