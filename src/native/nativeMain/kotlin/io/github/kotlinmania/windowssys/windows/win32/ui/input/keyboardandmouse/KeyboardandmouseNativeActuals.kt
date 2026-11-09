@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ActivateKeyboardLayout(hkl: HKL, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_ActivateKeyboardLayout(hkl.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun BlockInput(fblockit: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_BlockInput(fblockit)

public actual fun DragDetect(hwnd: HWND, pt: POINT): BOOL =
    0

public actual fun EnableWindow(hwnd: HWND, benable: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_EnableWindow(hwnd.toCPointer<ByteVar>(), benable)

public actual fun GetActiveWindow(): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetActiveWindow()?.toLong() ?: 0L

public actual fun GetAsyncKeyState(vkey: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetAsyncKeyState(vkey)

public actual fun GetCapture(): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetCapture()?.toLong() ?: 0L

public actual fun GetDoubleClickTime(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetDoubleClickTime()

public actual fun GetFocus(): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetFocus()?.toLong() ?: 0L

public actual fun GetKBCodePage(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetKBCodePage()

public actual fun GetKeyNameTextA(lparam: Int, lpstring: PSTR, cchsize: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyNameTextA(lparam, lpstring.toCPointer<ByteVar>(), cchsize)

public actual fun GetKeyNameTextW(lparam: Int, lpstring: PWSTR, cchsize: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyNameTextW(lparam, lpstring.toCPointer<ByteVar>(), cchsize)

public actual fun GetKeyState(nvirtkey: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyState(nvirtkey)

public actual fun GetKeyboardLayout(idthread: UInt): HKL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayout(idthread)?.toLong() ?: 0L

public actual fun GetKeyboardLayoutList(nbuff: Int, lplist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutList(nbuff, lplist.toCPointer<ByteVar>())

public actual fun GetKeyboardLayoutNameA(pwszklid: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutNameA(pwszklid.toCPointer<ByteVar>())

public actual fun GetKeyboardLayoutNameW(pwszklid: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutNameW(pwszklid.toCPointer<ByteVar>())

public actual fun GetKeyboardState(lpkeystate: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardState(lpkeystate.toCPointer<ByteVar>())

public actual fun GetKeyboardType(ntypeflag: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardType(ntypeflag)

public actual fun GetLastInputInfo(plii: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetLastInputInfo(plii.toCPointer<ByteVar>())

public actual fun GetMouseMovePointsEx(cbsize: UInt, lppt: Long, lpptbuf: Long, nbufpoints: Int, resolution: GET_MOUSE_MOVE_POINTS_EX_RESOLUTION): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_GetMouseMovePointsEx(cbsize, lppt.toCPointer<ByteVar>(), lpptbuf.toCPointer<ByteVar>(), nbufpoints, resolution)

public actual fun IsWindowEnabled(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_IsWindowEnabled(hwnd.toCPointer<ByteVar>())

public actual fun LoadKeyboardLayoutA(pwszklid: PCSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_LoadKeyboardLayoutA(pwszklid.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun LoadKeyboardLayoutW(pwszklid: PCWSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_LoadKeyboardLayoutW(pwszklid.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun MapVirtualKeyA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyA(ucode, umaptype)

public actual fun MapVirtualKeyExA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyExA(ucode, umaptype, dwhkl.toCPointer<ByteVar>())

public actual fun MapVirtualKeyExW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyExW(ucode, umaptype, dwhkl.toCPointer<ByteVar>())

public actual fun MapVirtualKeyW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyW(ucode, umaptype)

public actual fun OemKeyScan(woemchar: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_OemKeyScan(woemchar)

public actual fun RegisterHotKey(hwnd: HWND, id: Int, fsmodifiers: HOT_KEY_MODIFIERS, vk: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_RegisterHotKey(hwnd.toCPointer<ByteVar>(), id, fsmodifiers, vk)

public actual fun ReleaseCapture(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_ReleaseCapture()

public actual fun SendInput(cinputs: UInt, pinputs: Long, cbsize: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_SendInput(cinputs, pinputs.toCPointer<ByteVar>(), cbsize)

public actual fun SetActiveWindow(hwnd: HWND): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_SetActiveWindow(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetCapture(hwnd: HWND): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_SetCapture(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetDoubleClickTime(param0: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_SetDoubleClickTime(param0)

public actual fun SetFocus(hwnd: HWND): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_SetFocus(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetKeyboardState(lpkeystate: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_SetKeyboardState(lpkeystate.toCPointer<ByteVar>())

public actual fun SwapMouseButton(fswap: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_SwapMouseButton(fswap)

public actual fun ToAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_ToAscii(uvirtkey, uscancode, lpkeystate.toCPointer<ByteVar>(), lpchar.toCPointer<ByteVar>(), uflags)

public actual fun ToAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt, dwhkl: HKL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_ToAsciiEx(uvirtkey, uscancode, lpkeystate.toCPointer<ByteVar>(), lpchar.toCPointer<ByteVar>(), uflags, dwhkl.toCPointer<ByteVar>())

public actual fun ToUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_ToUnicode(wvirtkey, wscancode, lpkeystate.toCPointer<ByteVar>(), pwszbuff.toCPointer<ByteVar>(), cchbuff, wflags)

public actual fun ToUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt, dwhkl: HKL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_ToUnicodeEx(wvirtkey, wscancode, lpkeystate.toCPointer<ByteVar>(), pwszbuff.toCPointer<ByteVar>(), cchbuff, wflags, dwhkl.toCPointer<ByteVar>())

public actual fun TrackMouseEvent(lpeventtrack: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_TrackMouseEvent(lpeventtrack.toCPointer<ByteVar>())

public actual fun UnloadKeyboardLayout(hkl: HKL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_UnloadKeyboardLayout(hkl.toCPointer<ByteVar>())

public actual fun UnregisterHotKey(hwnd: HWND, id: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_UnregisterHotKey(hwnd.toCPointer<ByteVar>(), id)

public actual fun VkKeyScanA(ch: Byte): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanA(ch)

public actual fun VkKeyScanExA(ch: Byte, dwhkl: HKL): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanExA(ch, dwhkl.toCPointer<ByteVar>())

public actual fun VkKeyScanExW(ch: UShort, dwhkl: HKL): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanExW(ch, dwhkl.toCPointer<ByteVar>())

public actual fun VkKeyScanW(ch: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanW(ch)

public actual fun _TrackMouseEvent(lpeventtrack: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse__TrackMouseEvent(lpeventtrack.toCPointer<ByteVar>())

public actual fun keybd_event(bvk: UByte, bscan: UByte, dwflags: KEYBD_EVENT_FLAGS, dwextrainfo: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_keybd_event(bvk, bscan, dwflags, dwextrainfo)
}

public actual fun mouse_event(dwflags: MOUSE_EVENT_FLAGS, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mouse_event(dwflags, dx, dy, dwdata, dwextrainfo)
}
