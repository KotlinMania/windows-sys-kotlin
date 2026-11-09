@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT

private object WindowsWin32UiInputKeyboardandmouseJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_ActivateKeyboardLayout(hkl: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_BlockInput(fblockit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_EnableWindow(hwnd: Long, benable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetActiveWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetAsyncKeyState(vkey: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetCapture(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetDoubleClickTime(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetFocus(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetKBCodePage(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyNameTextA(lparam: Int, lpstring: Long, cchsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyNameTextW(lparam: Int, lpstring: Long, cchsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyState(nvirtkey: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayout(idthread: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutList(nbuff: Int, lplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutNameA(pwszklid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutNameW(pwszklid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardState(lpkeystate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardType(ntypeflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetLastInputInfo(plii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_GetMouseMovePointsEx(cbsize: Int, lppt: Long, lpptbuf: Long, nbufpoints: Int, resolution: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_IsWindowEnabled(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_LoadKeyboardLayoutA(pwszklid: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_LoadKeyboardLayoutW(pwszklid: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyA(ucode: Int, umaptype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyExA(ucode: Int, umaptype: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyExW(ucode: Int, umaptype: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyW(ucode: Int, umaptype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_OemKeyScan(woemchar: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_RegisterHotKey(hwnd: Long, id: Int, fsmodifiers: Int, vk: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_ReleaseCapture(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_SendInput(cinputs: Int, pinputs: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_SetActiveWindow(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_SetCapture(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_SetDoubleClickTime(param0: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_SetFocus(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_SetKeyboardState(lpkeystate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_SwapMouseButton(fswap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_ToAscii(uvirtkey: Int, uscancode: Int, lpkeystate: Long, lpchar: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_ToAsciiEx(uvirtkey: Int, uscancode: Int, lpkeystate: Long, lpchar: Long, uflags: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_ToUnicode(wvirtkey: Int, wscancode: Int, lpkeystate: Long, pwszbuff: Long, cchbuff: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_ToUnicodeEx(wvirtkey: Int, wscancode: Int, lpkeystate: Long, pwszbuff: Long, cchbuff: Int, wflags: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_TrackMouseEvent(lpeventtrack: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_UnloadKeyboardLayout(hkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_UnregisterHotKey(hwnd: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanA(ch: Byte): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanExA(ch: Byte, dwhkl: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanExW(ch: Short, dwhkl: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanW(ch: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse__TrackMouseEvent(lpeventtrack: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_keybd_event(bvk: Byte, bscan: Byte, dwflags: Int, dwextrainfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_mouse_event(dwflags: Int, dx: Int, dy: Int, dwdata: Int, dwextrainfo: Long)
}

public actual fun ActivateKeyboardLayout(hkl: HKL, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_ActivateKeyboardLayout(hkl, flags.toInt())

public actual fun BlockInput(fblockit: BOOL): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_BlockInput(fblockit)

public actual fun DragDetect(hwnd: HWND, pt: POINT): BOOL =
    0

public actual fun EnableWindow(hwnd: HWND, benable: BOOL): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_EnableWindow(hwnd, benable)

public actual fun GetActiveWindow(): HWND =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetActiveWindow()

public actual fun GetAsyncKeyState(vkey: Int): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetAsyncKeyState(vkey)

public actual fun GetCapture(): HWND =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetCapture()

public actual fun GetDoubleClickTime(): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetDoubleClickTime().toUInt()

public actual fun GetFocus(): HWND =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetFocus()

public actual fun GetKBCodePage(): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetKBCodePage().toUInt()

public actual fun GetKeyNameTextA(lparam: Int, lpstring: PSTR, cchsize: Int): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyNameTextA(lparam, lpstring, cchsize)

public actual fun GetKeyNameTextW(lparam: Int, lpstring: PWSTR, cchsize: Int): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyNameTextW(lparam, lpstring, cchsize)

public actual fun GetKeyState(nvirtkey: Int): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyState(nvirtkey)

public actual fun GetKeyboardLayout(idthread: UInt): HKL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayout(idthread.toInt())

public actual fun GetKeyboardLayoutList(nbuff: Int, lplist: Long): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutList(nbuff, lplist)

public actual fun GetKeyboardLayoutNameA(pwszklid: PSTR): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutNameA(pwszklid)

public actual fun GetKeyboardLayoutNameW(pwszklid: PWSTR): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardLayoutNameW(pwszklid)

public actual fun GetKeyboardState(lpkeystate: Long): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardState(lpkeystate)

public actual fun GetKeyboardType(ntypeflag: Int): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetKeyboardType(ntypeflag)

public actual fun GetLastInputInfo(plii: Long): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetLastInputInfo(plii)

public actual fun GetMouseMovePointsEx(cbsize: UInt, lppt: Long, lpptbuf: Long, nbufpoints: Int, resolution: GET_MOUSE_MOVE_POINTS_EX_RESOLUTION): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_GetMouseMovePointsEx(cbsize.toInt(), lppt, lpptbuf, nbufpoints, resolution.toInt())

public actual fun IsWindowEnabled(hwnd: HWND): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_IsWindowEnabled(hwnd)

public actual fun LoadKeyboardLayoutA(pwszklid: PCSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_LoadKeyboardLayoutA(pwszklid, flags.toInt())

public actual fun LoadKeyboardLayoutW(pwszklid: PCWSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_LoadKeyboardLayoutW(pwszklid, flags.toInt())

public actual fun MapVirtualKeyA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyA(ucode.toInt(), umaptype.toInt()).toUInt()

public actual fun MapVirtualKeyExA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyExA(ucode.toInt(), umaptype.toInt(), dwhkl).toUInt()

public actual fun MapVirtualKeyExW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyExW(ucode.toInt(), umaptype.toInt(), dwhkl).toUInt()

public actual fun MapVirtualKeyW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_MapVirtualKeyW(ucode.toInt(), umaptype.toInt()).toUInt()

public actual fun OemKeyScan(woemchar: UShort): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_OemKeyScan(woemchar.toShort()).toUInt()

public actual fun RegisterHotKey(hwnd: HWND, id: Int, fsmodifiers: HOT_KEY_MODIFIERS, vk: UInt): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_RegisterHotKey(hwnd, id, fsmodifiers.toInt(), vk.toInt())

public actual fun ReleaseCapture(): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_ReleaseCapture()

public actual fun SendInput(cinputs: UInt, pinputs: Long, cbsize: Int): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_SendInput(cinputs.toInt(), pinputs, cbsize).toUInt()

public actual fun SetActiveWindow(hwnd: HWND): HWND =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_SetActiveWindow(hwnd)

public actual fun SetCapture(hwnd: HWND): HWND =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_SetCapture(hwnd)

public actual fun SetDoubleClickTime(param0: UInt): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_SetDoubleClickTime(param0.toInt())

public actual fun SetFocus(hwnd: HWND): HWND =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_SetFocus(hwnd)

public actual fun SetKeyboardState(lpkeystate: Long): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_SetKeyboardState(lpkeystate)

public actual fun SwapMouseButton(fswap: BOOL): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_SwapMouseButton(fswap)

public actual fun ToAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_ToAscii(uvirtkey.toInt(), uscancode.toInt(), lpkeystate, lpchar, uflags.toInt())

public actual fun ToAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt, dwhkl: HKL): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_ToAsciiEx(uvirtkey.toInt(), uscancode.toInt(), lpkeystate, lpchar, uflags.toInt(), dwhkl)

public actual fun ToUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_ToUnicode(wvirtkey.toInt(), wscancode.toInt(), lpkeystate, pwszbuff, cchbuff, wflags.toInt())

public actual fun ToUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt, dwhkl: HKL): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_ToUnicodeEx(wvirtkey.toInt(), wscancode.toInt(), lpkeystate, pwszbuff, cchbuff, wflags.toInt(), dwhkl)

public actual fun TrackMouseEvent(lpeventtrack: Long): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_TrackMouseEvent(lpeventtrack)

public actual fun UnloadKeyboardLayout(hkl: HKL): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_UnloadKeyboardLayout(hkl)

public actual fun UnregisterHotKey(hwnd: HWND, id: Int): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_UnregisterHotKey(hwnd, id)

public actual fun VkKeyScanA(ch: Byte): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanA(ch)

public actual fun VkKeyScanExA(ch: Byte, dwhkl: HKL): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanExA(ch, dwhkl)

public actual fun VkKeyScanExW(ch: UShort, dwhkl: HKL): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanExW(ch.toShort(), dwhkl)

public actual fun VkKeyScanW(ch: UShort): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_VkKeyScanW(ch.toShort())

public actual fun _TrackMouseEvent(lpeventtrack: Long): BOOL =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse__TrackMouseEvent(lpeventtrack)

public actual fun keybd_event(bvk: UByte, bscan: UByte, dwflags: KEYBD_EVENT_FLAGS, dwextrainfo: ULong) {
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_keybd_event(bvk.toByte(), bscan.toByte(), dwflags.toInt(), dwextrainfo.toLong())
}

public actual fun mouse_event(dwflags: MOUSE_EVENT_FLAGS, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_mouse_event(dwflags.toInt(), dx, dy, dwdata, dwextrainfo.toLong())
}
