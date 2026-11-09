@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT

private val _windowsWin32UiInputKeyboardandmouseNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ActivateKeyboardLayout(hkl: HKL, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_ActivateKeyboardLayout(hkl.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun BlockInput(fblockit: BOOL): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_BlockInput(fblockit) as Int) else 0

public actual fun DragDetect(hwnd: HWND, pt: POINT): BOOL =
    0

public actual fun EnableWindow(hwnd: HWND, benable: BOOL): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_EnableWindow(hwnd.toString(), benable) as Int) else 0

public actual fun GetActiveWindow(): HWND =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetActiveWindow() as String).toLong() else 0L

public actual fun GetAsyncKeyState(vkey: Int): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetAsyncKeyState(vkey) as Int).toShort() else 0

public actual fun GetCapture(): HWND =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetCapture() as String).toLong() else 0L

public actual fun GetDoubleClickTime(): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetDoubleClickTime() as Int).toUInt() else 0u

public actual fun GetFocus(): HWND =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetFocus() as String).toLong() else 0L

public actual fun GetKBCodePage(): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetKBCodePage() as Int).toUInt() else 0u

public actual fun GetKeyNameTextA(lparam: Int, lpstring: PSTR, cchsize: Int): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyNameTextA(lparam, lpstring.toString(), cchsize) as Int) else 0

public actual fun GetKeyNameTextW(lparam: Int, lpstring: PWSTR, cchsize: Int): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyNameTextW(lparam, lpstring.toString(), cchsize) as Int) else 0

public actual fun GetKeyState(nvirtkey: Int): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyState(nvirtkey) as Int).toShort() else 0

public actual fun GetKeyboardLayout(idthread: UInt): HKL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayout(idthread.toInt()) as String).toLong() else 0L

public actual fun GetKeyboardLayoutList(nbuff: Int, lplist: Long): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutList(nbuff, lplist.toString()) as Int) else 0

public actual fun GetKeyboardLayoutNameA(pwszklid: PSTR): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutNameA(pwszklid.toString()) as Int) else 0

public actual fun GetKeyboardLayoutNameW(pwszklid: PWSTR): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutNameW(pwszklid.toString()) as Int) else 0

public actual fun GetKeyboardState(lpkeystate: Long): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardState(lpkeystate.toString()) as Int) else 0

public actual fun GetKeyboardType(ntypeflag: Int): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardType(ntypeflag) as Int) else 0

public actual fun GetLastInputInfo(plii: Long): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetLastInputInfo(plii.toString()) as Int) else 0

public actual fun GetMouseMovePointsEx(cbsize: UInt, lppt: Long, lpptbuf: Long, nbufpoints: Int, resolution: GET_MOUSE_MOVE_POINTS_EX_RESOLUTION): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_GetMouseMovePointsEx(cbsize.toInt(), lppt.toString(), lpptbuf.toString(), nbufpoints, resolution.toInt()) as Int) else 0

public actual fun IsWindowEnabled(hwnd: HWND): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_IsWindowEnabled(hwnd.toString()) as Int) else 0

public actual fun LoadKeyboardLayoutA(pwszklid: PCSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_LoadKeyboardLayoutA(pwszklid.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun LoadKeyboardLayoutW(pwszklid: PCWSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_LoadKeyboardLayoutW(pwszklid.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun MapVirtualKeyA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyA(ucode.toInt(), umaptype.toInt()) as Int).toUInt() else 0u

public actual fun MapVirtualKeyExA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyExA(ucode.toInt(), umaptype.toInt(), dwhkl.toString()) as Int).toUInt() else 0u

public actual fun MapVirtualKeyExW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyExW(ucode.toInt(), umaptype.toInt(), dwhkl.toString()) as Int).toUInt() else 0u

public actual fun MapVirtualKeyW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyW(ucode.toInt(), umaptype.toInt()) as Int).toUInt() else 0u

public actual fun OemKeyScan(woemchar: UShort): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_OemKeyScan(woemchar.toInt()) as Int).toUInt() else 0u

public actual fun RegisterHotKey(hwnd: HWND, id: Int, fsmodifiers: HOT_KEY_MODIFIERS, vk: UInt): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_RegisterHotKey(hwnd.toString(), id, fsmodifiers.toInt(), vk.toInt()) as Int) else 0

public actual fun ReleaseCapture(): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_ReleaseCapture() as Int) else 0

public actual fun SendInput(cinputs: UInt, pinputs: Long, cbsize: Int): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_SendInput(cinputs.toInt(), pinputs.toString(), cbsize) as Int).toUInt() else 0u

public actual fun SetActiveWindow(hwnd: HWND): HWND =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_SetActiveWindow(hwnd.toString()) as String).toLong() else 0L

public actual fun SetCapture(hwnd: HWND): HWND =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_SetCapture(hwnd.toString()) as String).toLong() else 0L

public actual fun SetDoubleClickTime(param0: UInt): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_SetDoubleClickTime(param0.toInt()) as Int) else 0

public actual fun SetFocus(hwnd: HWND): HWND =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_SetFocus(hwnd.toString()) as String).toLong() else 0L

public actual fun SetKeyboardState(lpkeystate: Long): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_SetKeyboardState(lpkeystate.toString()) as Int) else 0

public actual fun SwapMouseButton(fswap: BOOL): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_SwapMouseButton(fswap) as Int) else 0

public actual fun ToAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_ToAscii(uvirtkey.toInt(), uscancode.toInt(), lpkeystate.toString(), lpchar.toString(), uflags.toInt()) as Int) else 0

public actual fun ToAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt, dwhkl: HKL): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_ToAsciiEx(uvirtkey.toInt(), uscancode.toInt(), lpkeystate.toString(), lpchar.toString(), uflags.toInt(), dwhkl.toString()) as Int) else 0

public actual fun ToUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_ToUnicode(wvirtkey.toInt(), wscancode.toInt(), lpkeystate.toString(), pwszbuff.toString(), cchbuff, wflags.toInt()) as Int) else 0

public actual fun ToUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt, dwhkl: HKL): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_ToUnicodeEx(wvirtkey.toInt(), wscancode.toInt(), lpkeystate.toString(), pwszbuff.toString(), cchbuff, wflags.toInt(), dwhkl.toString()) as Int) else 0

public actual fun TrackMouseEvent(lpeventtrack: Long): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_TrackMouseEvent(lpeventtrack.toString()) as Int) else 0

public actual fun UnloadKeyboardLayout(hkl: HKL): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_UnloadKeyboardLayout(hkl.toString()) as Int) else 0

public actual fun UnregisterHotKey(hwnd: HWND, id: Int): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_UnregisterHotKey(hwnd.toString(), id) as Int) else 0

public actual fun VkKeyScanA(ch: Byte): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanA(ch.toInt()) as Int).toShort() else 0

public actual fun VkKeyScanExA(ch: Byte, dwhkl: HKL): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanExA(ch.toInt(), dwhkl.toString()) as Int).toShort() else 0

public actual fun VkKeyScanExW(ch: UShort, dwhkl: HKL): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanExW(ch.toInt(), dwhkl.toString()) as Int).toShort() else 0

public actual fun VkKeyScanW(ch: UShort): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanW(ch.toInt()) as Int).toShort() else 0

public actual fun _TrackMouseEvent(lpeventtrack: Long): BOOL =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse__TrackMouseEvent(lpeventtrack.toString()) as Int) else 0

public actual fun keybd_event(bvk: UByte, bscan: UByte, dwflags: KEYBD_EVENT_FLAGS, dwextrainfo: ULong) {
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) {
        _windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_keybd_event(bvk.toInt(), bscan.toInt(), dwflags.toInt(), dwextrainfo.toString())
    }
}

public actual fun mouse_event(dwflags: MOUSE_EVENT_FLAGS, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) {
        _windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_mouse_event(dwflags.toInt(), dx, dy, dwdata, dwextrainfo.toString())
    }
}
