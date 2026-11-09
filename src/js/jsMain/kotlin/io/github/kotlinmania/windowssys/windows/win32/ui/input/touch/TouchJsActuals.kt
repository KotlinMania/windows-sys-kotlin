@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32UiInputTouchNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CloseGestureInfoHandle(hgestureinfo: HGESTUREINFO): BOOL =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_CloseGestureInfoHandle(hgestureinfo.toString()) as Int) else 0

public actual fun CloseTouchInputHandle(htouchinput: HTOUCHINPUT): BOOL =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_CloseTouchInputHandle(htouchinput.toString()) as Int) else 0

public actual fun GetGestureConfig(hwnd: HWND, dwreserved: UInt, dwflags: UInt, pcids: Long, pgestureconfig: Long, cbsize: UInt): BOOL =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_GetGestureConfig(hwnd.toString(), dwreserved.toInt(), dwflags.toInt(), pcids.toString(), pgestureconfig.toString(), cbsize.toInt()) as Int) else 0

public actual fun GetGestureExtraArgs(hgestureinfo: HGESTUREINFO, cbextraargs: UInt, pextraargs: Long): BOOL =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_GetGestureExtraArgs(hgestureinfo.toString(), cbextraargs.toInt(), pextraargs.toString()) as Int) else 0

public actual fun GetGestureInfo(hgestureinfo: HGESTUREINFO, pgestureinfo: Long): BOOL =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_GetGestureInfo(hgestureinfo.toString(), pgestureinfo.toString()) as Int) else 0

public actual fun GetTouchInputInfo(htouchinput: HTOUCHINPUT, cinputs: UInt, pinputs: Long, cbsize: Int): BOOL =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_GetTouchInputInfo(htouchinput.toString(), cinputs.toInt(), pinputs.toString(), cbsize) as Int) else 0

public actual fun IsTouchWindow(hwnd: HWND, pulflags: Long): BOOL =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_IsTouchWindow(hwnd.toString(), pulflags.toString()) as Int) else 0

public actual fun RegisterTouchWindow(hwnd: HWND, ulflags: REGISTER_TOUCH_WINDOW_FLAGS): BOOL =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_RegisterTouchWindow(hwnd.toString(), ulflags.toInt()) as Int) else 0

public actual fun SetGestureConfig(hwnd: HWND, dwreserved: UInt, cids: UInt, pgestureconfig: Long, cbsize: UInt): BOOL =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_SetGestureConfig(hwnd.toString(), dwreserved.toInt(), cids.toInt(), pgestureconfig.toString(), cbsize.toInt()) as Int) else 0

public actual fun UnregisterTouchWindow(hwnd: HWND): BOOL =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_UnregisterTouchWindow(hwnd.toString()) as Int) else 0
