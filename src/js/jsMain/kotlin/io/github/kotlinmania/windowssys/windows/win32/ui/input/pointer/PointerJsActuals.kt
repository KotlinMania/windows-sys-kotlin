@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.HSYNTHETICPOINTERDEVICE

private val _windowsWin32UiInputPointerNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun EnableMouseInPointer(fenable: BOOL): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_EnableMouseInPointer(fenable) as Int) else 0

public actual fun GetPointerCursorId(pointerid: UInt, cursorid: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerCursorId(pointerid.toInt(), cursorid.toString()) as Int) else 0

public actual fun GetPointerDevice(device: HANDLE, pointerdevice: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerDevice(device.toString(), pointerdevice.toString()) as Int) else 0

public actual fun GetPointerDeviceCursors(device: HANDLE, cursorcount: Long, devicecursors: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerDeviceCursors(device.toString(), cursorcount.toString(), devicecursors.toString()) as Int) else 0

public actual fun GetPointerDeviceProperties(device: HANDLE, propertycount: Long, pointerproperties: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerDeviceProperties(device.toString(), propertycount.toString(), pointerproperties.toString()) as Int) else 0

public actual fun GetPointerDeviceRects(device: HANDLE, pointerdevicerect: Long, displayrect: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerDeviceRects(device.toString(), pointerdevicerect.toString(), displayrect.toString()) as Int) else 0

public actual fun GetPointerDevices(devicecount: Long, pointerdevices: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerDevices(devicecount.toString(), pointerdevices.toString()) as Int) else 0

public actual fun GetPointerFrameInfo(pointerid: UInt, pointercount: Long, pointerinfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfo(pointerid.toInt(), pointercount.toString(), pointerinfo.toString()) as Int) else 0

public actual fun GetPointerFrameInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, pointerinfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfoHistory(pointerid.toInt(), entriescount.toString(), pointercount.toString(), pointerinfo.toString()) as Int) else 0

public actual fun GetPointerFramePenInfo(pointerid: UInt, pointercount: Long, peninfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfo(pointerid.toInt(), pointercount.toString(), peninfo.toString()) as Int) else 0

public actual fun GetPointerFramePenInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, peninfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfoHistory(pointerid.toInt(), entriescount.toString(), pointercount.toString(), peninfo.toString()) as Int) else 0

public actual fun GetPointerFrameTouchInfo(pointerid: UInt, pointercount: Long, touchinfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfo(pointerid.toInt(), pointercount.toString(), touchinfo.toString()) as Int) else 0

public actual fun GetPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: Long, pointercount: Long, touchinfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfoHistory(pointerid.toInt(), entriescount.toString(), pointercount.toString(), touchinfo.toString()) as Int) else 0

public actual fun GetPointerInfo(pointerid: UInt, pointerinfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerInfo(pointerid.toInt(), pointerinfo.toString()) as Int) else 0

public actual fun GetPointerInfoHistory(pointerid: UInt, entriescount: Long, pointerinfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerInfoHistory(pointerid.toInt(), entriescount.toString(), pointerinfo.toString()) as Int) else 0

public actual fun GetPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerInputTransform(pointerid.toInt(), historycount.toInt(), inputtransform.toString()) as Int) else 0

public actual fun GetPointerPenInfo(pointerid: UInt, peninfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerPenInfo(pointerid.toInt(), peninfo.toString()) as Int) else 0

public actual fun GetPointerPenInfoHistory(pointerid: UInt, entriescount: Long, peninfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerPenInfoHistory(pointerid.toInt(), entriescount.toString(), peninfo.toString()) as Int) else 0

public actual fun GetPointerTouchInfo(pointerid: UInt, touchinfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfo(pointerid.toInt(), touchinfo.toString()) as Int) else 0

public actual fun GetPointerTouchInfoHistory(pointerid: UInt, entriescount: Long, touchinfo: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfoHistory(pointerid.toInt(), entriescount.toString(), touchinfo.toString()) as Int) else 0

public actual fun GetPointerType(pointerid: UInt, pointertype: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetPointerType(pointerid.toInt(), pointertype.toString()) as Int) else 0

public actual fun GetRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: Long, pvalues: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetRawPointerDeviceData(pointerid.toInt(), historycount.toInt(), propertiescount.toInt(), pproperties.toString(), pvalues.toString()) as Int) else 0

public actual fun GetUnpredictedMessagePos(): UInt =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_GetUnpredictedMessagePos() as Int).toUInt() else 0u

public actual fun InitializeTouchInjection(maxcount: UInt, dwmode: TOUCH_FEEDBACK_MODE): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_InitializeTouchInjection(maxcount.toInt(), dwmode.toInt()) as Int) else 0

public actual fun InjectSyntheticPointerInput(device: HSYNTHETICPOINTERDEVICE, pointerinfo: Long, count: UInt): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_InjectSyntheticPointerInput(device.toString(), pointerinfo.toString(), count.toInt()) as Int) else 0

public actual fun InjectTouchInput(count: UInt, contacts: Long): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_InjectTouchInput(count.toInt(), contacts.toString()) as Int) else 0

public actual fun IsMouseInPointerEnabled(): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_IsMouseInPointerEnabled() as Int) else 0

public actual fun SkipPointerFrameMessages(pointerid: UInt): BOOL =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_SkipPointerFrameMessages(pointerid.toInt()) as Int) else 0
