@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

private val _windowsWin32UiInputXboxcontrollerNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun XInputEnable(enable: BOOL) {
    if (_windowsWin32UiInputXboxcontrollerNapiAddon != null) {
        _windowsWin32UiInputXboxcontrollerNapiAddon.windowssys_windows_win32_ui_input_xboxcontroller_XInputEnable(enable)
    }
}

public actual fun XInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: PWSTR, prendercount: Long, pcapturedeviceid: PWSTR, pcapturecount: Long): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAddon != null) (_windowsWin32UiInputXboxcontrollerNapiAddon.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetAudioDeviceIds(dwuserindex.toInt(), prenderdeviceid.toString(), prendercount.toString(), pcapturedeviceid.toString(), pcapturecount.toString()) as Int).toUInt() else 0u

public actual fun XInputGetBatteryInformation(dwuserindex: UInt, devtype: BATTERY_DEVTYPE, pbatteryinformation: Long): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAddon != null) (_windowsWin32UiInputXboxcontrollerNapiAddon.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetBatteryInformation(dwuserindex.toInt(), devtype.toInt(), pbatteryinformation.toString()) as Int).toUInt() else 0u

public actual fun XInputGetCapabilities(dwuserindex: UInt, dwflags: XINPUT_FLAG, pcapabilities: Long): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAddon != null) (_windowsWin32UiInputXboxcontrollerNapiAddon.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetCapabilities(dwuserindex.toInt(), dwflags.toInt(), pcapabilities.toString()) as Int).toUInt() else 0u

public actual fun XInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: Long): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAddon != null) (_windowsWin32UiInputXboxcontrollerNapiAddon.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetKeystroke(dwuserindex.toInt(), dwreserved.toInt(), pkeystroke.toString()) as Int).toUInt() else 0u

public actual fun XInputGetState(dwuserindex: UInt, pstate: Long): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAddon != null) (_windowsWin32UiInputXboxcontrollerNapiAddon.windowssys_windows_win32_ui_input_xboxcontroller_XInputGetState(dwuserindex.toInt(), pstate.toString()) as Int).toUInt() else 0u

public actual fun XInputSetState(dwuserindex: UInt, pvibration: Long): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAddon != null) (_windowsWin32UiInputXboxcontrollerNapiAddon.windowssys_windows_win32_ui_input_xboxcontroller_XInputSetState(dwuserindex.toInt(), pvibration.toString()) as Int).toUInt() else 0u
