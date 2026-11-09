@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT

private val _windowsWin32UiInputNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun DefRawInputProc(parawinput: Long, ninput: Int, cbsizeheader: UInt): LRESULT =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_DefRawInputProc(parawinput.toString(), ninput, cbsizeheader.toInt()) as String).toLong() else 0L

public actual fun GetCIMSSM(inputmessagesource: Long): BOOL =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_GetCIMSSM(inputmessagesource.toString()) as Int) else 0

public actual fun GetCurrentInputMessageSource(inputmessagesource: Long): BOOL =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_GetCurrentInputMessageSource(inputmessagesource.toString()) as Int) else 0

public actual fun GetRawInputBuffer(pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_GetRawInputBuffer(pdata.toString(), pcbsize.toString(), cbsizeheader.toInt()) as Int).toUInt() else 0u

public actual fun GetRawInputData(hrawinput: HRAWINPUT, uicommand: RAW_INPUT_DATA_COMMAND_FLAGS, pdata: Long, pcbsize: Long, cbsizeheader: UInt): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_GetRawInputData(hrawinput.toString(), uicommand.toInt(), pdata.toString(), pcbsize.toString(), cbsizeheader.toInt()) as Int).toUInt() else 0u

public actual fun GetRawInputDeviceInfoA(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_GetRawInputDeviceInfoA(hdevice.toString(), uicommand.toInt(), pdata.toString(), pcbsize.toString()) as Int).toUInt() else 0u

public actual fun GetRawInputDeviceInfoW(hdevice: HANDLE, uicommand: RAW_INPUT_DEVICE_INFO_COMMAND, pdata: Long, pcbsize: Long): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_GetRawInputDeviceInfoW(hdevice.toString(), uicommand.toInt(), pdata.toString(), pcbsize.toString()) as Int).toUInt() else 0u

public actual fun GetRawInputDeviceList(prawinputdevicelist: Long, puinumdevices: Long, cbsize: UInt): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_GetRawInputDeviceList(prawinputdevicelist.toString(), puinumdevices.toString(), cbsize.toInt()) as Int).toUInt() else 0u

public actual fun GetRegisteredRawInputDevices(prawinputdevices: Long, puinumdevices: Long, cbsize: UInt): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_GetRegisteredRawInputDevices(prawinputdevices.toString(), puinumdevices.toString(), cbsize.toInt()) as Int).toUInt() else 0u

public actual fun RegisterRawInputDevices(prawinputdevices: Long, uinumdevices: UInt, cbsize: UInt): BOOL =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_RegisterRawInputDevices(prawinputdevices.toString(), uinumdevices.toInt(), cbsize.toInt()) as Int) else 0
