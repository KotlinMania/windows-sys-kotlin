package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT

public expect fun ActivateKeyboardLayout(hkl: HKL, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL

public expect fun BlockInput(fblockit: BOOL): BOOL

public expect fun DragDetect(hwnd: HWND, pt: POINT): BOOL

public expect fun EnableWindow(hwnd: HWND, benable: BOOL): BOOL

public expect fun GetActiveWindow(): HWND

public expect fun GetAsyncKeyState(vkey: Int): Short

public expect fun GetCapture(): HWND

public expect fun GetDoubleClickTime(): UInt

public expect fun GetFocus(): HWND

public expect fun GetKBCodePage(): UInt

public expect fun GetKeyNameTextA(lparam: Int, lpstring: PSTR, cchsize: Int): Int

public expect fun GetKeyNameTextW(lparam: Int, lpstring: PWSTR, cchsize: Int): Int

public expect fun GetKeyState(nvirtkey: Int): Short

public expect fun GetKeyboardLayout(idthread: UInt): HKL

public expect fun GetKeyboardLayoutList(nbuff: Int, lplist: Long): Int

public expect fun GetKeyboardLayoutNameA(pwszklid: PSTR): BOOL

public expect fun GetKeyboardLayoutNameW(pwszklid: PWSTR): BOOL

public expect fun GetKeyboardState(lpkeystate: Long): BOOL

public expect fun GetKeyboardType(ntypeflag: Int): Int

public expect fun GetLastInputInfo(plii: Long): BOOL

public expect fun GetMouseMovePointsEx(cbsize: UInt, lppt: Long, lpptbuf: Long, nbufpoints: Int, resolution: GET_MOUSE_MOVE_POINTS_EX_RESOLUTION): Int

public expect fun IsWindowEnabled(hwnd: HWND): BOOL

public expect fun LoadKeyboardLayoutA(pwszklid: PCSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL

public expect fun LoadKeyboardLayoutW(pwszklid: PCWSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL

public expect fun MapVirtualKeyA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt

public expect fun MapVirtualKeyExA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt

public expect fun MapVirtualKeyExW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt

public expect fun MapVirtualKeyW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt

public expect fun OemKeyScan(woemchar: UShort): UInt

public expect fun RegisterHotKey(hwnd: HWND, id: Int, fsmodifiers: HOT_KEY_MODIFIERS, vk: UInt): BOOL

public expect fun ReleaseCapture(): BOOL

public expect fun SendInput(cinputs: UInt, pinputs: Long, cbsize: Int): UInt

public expect fun SetActiveWindow(hwnd: HWND): HWND

public expect fun SetCapture(hwnd: HWND): HWND

public expect fun SetDoubleClickTime(param0: UInt): BOOL

public expect fun SetFocus(hwnd: HWND): HWND

public expect fun SetKeyboardState(lpkeystate: Long): BOOL

public expect fun SwapMouseButton(fswap: BOOL): BOOL

public expect fun ToAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt): Int

public expect fun ToAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt, dwhkl: HKL): Int

public expect fun ToUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt): Int

public expect fun ToUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt, dwhkl: HKL): Int

public expect fun TrackMouseEvent(lpeventtrack: Long): BOOL

public expect fun UnloadKeyboardLayout(hkl: HKL): BOOL

public expect fun UnregisterHotKey(hwnd: HWND, id: Int): BOOL

public expect fun VkKeyScanA(ch: Byte): Short

public expect fun VkKeyScanExA(ch: Byte, dwhkl: HKL): Short

public expect fun VkKeyScanExW(ch: UShort, dwhkl: HKL): Short

public expect fun VkKeyScanW(ch: UShort): Short

public expect fun _TrackMouseEvent(lpeventtrack: Long): BOOL

public expect fun keybd_event(bvk: UByte, bscan: UByte, dwflags: KEYBD_EVENT_FLAGS, dwextrainfo: ULong)

public expect fun mouse_event(dwflags: MOUSE_EVENT_FLAGS, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong)
