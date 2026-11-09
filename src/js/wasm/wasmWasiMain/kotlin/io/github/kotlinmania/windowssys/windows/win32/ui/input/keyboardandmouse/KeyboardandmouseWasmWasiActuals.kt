@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT

public actual fun ActivateKeyboardLayout(hkl: HKL, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    0L

public actual fun BlockInput(fblockit: BOOL): BOOL =
    0

public actual fun DragDetect(hwnd: HWND, pt: POINT): BOOL =
    0

public actual fun EnableWindow(hwnd: HWND, benable: BOOL): BOOL =
    0

public actual fun GetActiveWindow(): HWND =
    0L

public actual fun GetAsyncKeyState(vkey: Int): Short =
    0

public actual fun GetCapture(): HWND =
    0L

public actual fun GetDoubleClickTime(): UInt =
    0u

public actual fun GetFocus(): HWND =
    0L

public actual fun GetKBCodePage(): UInt =
    0u

public actual fun GetKeyNameTextA(lparam: Int, lpstring: PSTR, cchsize: Int): Int =
    0

public actual fun GetKeyNameTextW(lparam: Int, lpstring: PWSTR, cchsize: Int): Int =
    0

public actual fun GetKeyState(nvirtkey: Int): Short =
    0

public actual fun GetKeyboardLayout(idthread: UInt): HKL =
    0L

public actual fun GetKeyboardLayoutList(nbuff: Int, lplist: Long): Int =
    0

public actual fun GetKeyboardLayoutNameA(pwszklid: PSTR): BOOL =
    0

public actual fun GetKeyboardLayoutNameW(pwszklid: PWSTR): BOOL =
    0

public actual fun GetKeyboardState(lpkeystate: Long): BOOL =
    0

public actual fun GetKeyboardType(ntypeflag: Int): Int =
    0

public actual fun GetLastInputInfo(plii: Long): BOOL =
    0

public actual fun GetMouseMovePointsEx(cbsize: UInt, lppt: Long, lpptbuf: Long, nbufpoints: Int, resolution: GET_MOUSE_MOVE_POINTS_EX_RESOLUTION): Int =
    0

public actual fun IsWindowEnabled(hwnd: HWND): BOOL =
    0

public actual fun LoadKeyboardLayoutA(pwszklid: PCSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    0L

public actual fun LoadKeyboardLayoutW(pwszklid: PCWSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    0L

public actual fun MapVirtualKeyA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt =
    0u

public actual fun MapVirtualKeyExA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt =
    0u

public actual fun MapVirtualKeyExW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt =
    0u

public actual fun MapVirtualKeyW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt =
    0u

public actual fun OemKeyScan(woemchar: UShort): UInt =
    0u

public actual fun RegisterHotKey(hwnd: HWND, id: Int, fsmodifiers: HOT_KEY_MODIFIERS, vk: UInt): BOOL =
    0

public actual fun ReleaseCapture(): BOOL =
    0

public actual fun SendInput(cinputs: UInt, pinputs: Long, cbsize: Int): UInt =
    0u

public actual fun SetActiveWindow(hwnd: HWND): HWND =
    0L

public actual fun SetCapture(hwnd: HWND): HWND =
    0L

public actual fun SetDoubleClickTime(param0: UInt): BOOL =
    0

public actual fun SetFocus(hwnd: HWND): HWND =
    0L

public actual fun SetKeyboardState(lpkeystate: Long): BOOL =
    0

public actual fun SwapMouseButton(fswap: BOOL): BOOL =
    0

public actual fun ToAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt): Int =
    0

public actual fun ToAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt, dwhkl: HKL): Int =
    0

public actual fun ToUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt): Int =
    0

public actual fun ToUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt, dwhkl: HKL): Int =
    0

public actual fun TrackMouseEvent(lpeventtrack: Long): BOOL =
    0

public actual fun UnloadKeyboardLayout(hkl: HKL): BOOL =
    0

public actual fun UnregisterHotKey(hwnd: HWND, id: Int): BOOL =
    0

public actual fun VkKeyScanA(ch: Byte): Short =
    0

public actual fun VkKeyScanExA(ch: Byte, dwhkl: HKL): Short =
    0

public actual fun VkKeyScanExW(ch: UShort, dwhkl: HKL): Short =
    0

public actual fun VkKeyScanW(ch: UShort): Short =
    0

public actual fun _TrackMouseEvent(lpeventtrack: Long): BOOL =
    0

public actual fun keybd_event(bvk: UByte, bscan: UByte, dwflags: KEYBD_EVENT_FLAGS, dwextrainfo: ULong) {
}

public actual fun mouse_event(dwflags: MOUSE_EVENT_FLAGS, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
}
