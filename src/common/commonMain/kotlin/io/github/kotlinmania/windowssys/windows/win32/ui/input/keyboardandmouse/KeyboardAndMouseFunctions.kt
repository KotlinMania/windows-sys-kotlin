package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun ActivateKeyboardLayout(hkl: HKL, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL {
    return Win32DynamicFfi.invoke("user32.dll", "ActivateKeyboardLayout", longArrayOf(hkl, flags.toLong()))
}

public fun BlockInput(fblockit: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "BlockInput", longArrayOf(fblockit.toLong())).toInt()
}

public fun DragDetect(hwnd: Foundation.HWND, pt: Foundation.POINT): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DragDetect", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(pt))).toInt()
}

public fun EnableWindow(hwnd: Foundation.HWND, benable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnableWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), benable.toLong())).toInt()
}

public fun GetActiveWindow(): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetActiveWindow", longArrayOf())
    return Foundation.HWND()
}

public fun GetAsyncKeyState(vkey: Int): Short {
    return Win32DynamicFfi.invoke("user32.dll", "GetAsyncKeyState", longArrayOf(vkey.toLong())).toShort()
}

public fun GetCapture(): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetCapture", longArrayOf())
    return Foundation.HWND()
}

public fun GetDoubleClickTime(): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetDoubleClickTime", longArrayOf()).toUInt()
}

public fun GetFocus(): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetFocus", longArrayOf())
    return Foundation.HWND()
}

public fun GetKBCodePage(): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetKBCodePage", longArrayOf()).toUInt()
}

public fun GetKeyNameTextA(lparam: Int, lpstring: PSTR, cchsize: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetKeyNameTextA", longArrayOf(lparam.toLong(), lpstring, cchsize.toLong())).toInt()
}

public fun GetKeyNameTextW(lparam: Int, lpstring: PWSTR, cchsize: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetKeyNameTextW", longArrayOf(lparam.toLong(), lpstring, cchsize.toLong())).toInt()
}

public fun GetKeyState(nvirtkey: Int): Short {
    return Win32DynamicFfi.invoke("user32.dll", "GetKeyState", longArrayOf(nvirtkey.toLong())).toShort()
}

public fun GetKeyboardLayout(idthread: UInt): HKL {
    return Win32DynamicFfi.invoke("user32.dll", "GetKeyboardLayout", longArrayOf(idthread.toLong()))
}

public fun GetKeyboardLayoutList(nbuff: Int, lplist: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetKeyboardLayoutList", longArrayOf(nbuff.toLong(), lplist)).toInt()
}

public fun GetKeyboardLayoutNameA(pwszklid: PSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetKeyboardLayoutNameA", longArrayOf(pwszklid)).toInt()
}

public fun GetKeyboardLayoutNameW(pwszklid: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetKeyboardLayoutNameW", longArrayOf(pwszklid)).toInt()
}

public fun GetKeyboardState(lpkeystate: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetKeyboardState", longArrayOf(lpkeystate)).toInt()
}

public fun GetKeyboardType(ntypeflag: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetKeyboardType", longArrayOf(ntypeflag.toLong())).toInt()
}

public fun GetLastInputInfo(plii: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetLastInputInfo", longArrayOf(plii)).toInt()
}

public fun GetMouseMovePointsEx(cbsize: UInt, lppt: Long, lpptbuf: Long, nbufpoints: Int, resolution: GET_MOUSE_MOVE_POINTS_EX_RESOLUTION): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetMouseMovePointsEx", longArrayOf(cbsize.toLong(), lppt, lpptbuf, nbufpoints.toLong(), resolution.toLong())).toInt()
}

public fun IsWindowEnabled(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsWindowEnabled", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun LoadKeyboardLayoutA(pwszklid: PCSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL {
    return Win32DynamicFfi.invoke("user32.dll", "LoadKeyboardLayoutA", longArrayOf(pwszklid, flags.toLong()))
}

public fun LoadKeyboardLayoutW(pwszklid: PCWSTR, flags: ACTIVATE_KEYBOARD_LAYOUT_FLAGS): HKL {
    return Win32DynamicFfi.invoke("user32.dll", "LoadKeyboardLayoutW", longArrayOf(pwszklid, flags.toLong()))
}

public fun MapVirtualKeyA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "MapVirtualKeyA", longArrayOf(ucode.toLong(), umaptype.toLong())).toUInt()
}

public fun MapVirtualKeyExA(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "MapVirtualKeyExA", longArrayOf(ucode.toLong(), umaptype.toLong(), dwhkl)).toUInt()
}

public fun MapVirtualKeyExW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE, dwhkl: HKL): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "MapVirtualKeyExW", longArrayOf(ucode.toLong(), umaptype.toLong(), dwhkl)).toUInt()
}

public fun MapVirtualKeyW(ucode: UInt, umaptype: MAP_VIRTUAL_KEY_TYPE): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "MapVirtualKeyW", longArrayOf(ucode.toLong(), umaptype.toLong())).toUInt()
}

public fun OemKeyScan(woemchar: UShort): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "OemKeyScan", longArrayOf(woemchar.toLong())).toUInt()
}

public fun RegisterHotKey(hwnd: Foundation.HWND, id: Int, fsmodifiers: HOT_KEY_MODIFIERS, vk: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterHotKey", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), id.toLong(), fsmodifiers.toLong(), vk.toLong())).toInt()
}

public fun ReleaseCapture(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ReleaseCapture", longArrayOf()).toInt()
}

public fun SendInput(cinputs: UInt, pinputs: Long, cbsize: Int): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "SendInput", longArrayOf(cinputs.toLong(), pinputs, cbsize.toLong())).toUInt()
}

public fun SetActiveWindow(hwnd: Foundation.HWND): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "SetActiveWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
    return Foundation.HWND()
}

public fun SetCapture(hwnd: Foundation.HWND): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "SetCapture", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
    return Foundation.HWND()
}

public fun SetDoubleClickTime(param0: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetDoubleClickTime", longArrayOf(param0.toLong())).toInt()
}

public fun SetFocus(hwnd: Foundation.HWND): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "SetFocus", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
    return Foundation.HWND()
}

public fun SetKeyboardState(lpkeystate: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetKeyboardState", longArrayOf(lpkeystate)).toInt()
}

public fun SwapMouseButton(fswap: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SwapMouseButton", longArrayOf(fswap.toLong())).toInt()
}

public fun ToAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt): Int {
    return Win32DynamicFfi.invoke("user32.dll", "ToAscii", longArrayOf(uvirtkey.toLong(), uscancode.toLong(), lpkeystate, lpchar, uflags.toLong())).toInt()
}

public fun ToAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: Long, lpchar: Long, uflags: UInt, dwhkl: HKL): Int {
    return Win32DynamicFfi.invoke("user32.dll", "ToAsciiEx", longArrayOf(uvirtkey.toLong(), uscancode.toLong(), lpkeystate, lpchar, uflags.toLong(), dwhkl)).toInt()
}

public fun ToUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt): Int {
    return Win32DynamicFfi.invoke("user32.dll", "ToUnicode", longArrayOf(wvirtkey.toLong(), wscancode.toLong(), lpkeystate, pwszbuff, cchbuff.toLong(), wflags.toLong())).toInt()
}

public fun ToUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: Long, pwszbuff: PWSTR, cchbuff: Int, wflags: UInt, dwhkl: HKL): Int {
    return Win32DynamicFfi.invoke("user32.dll", "ToUnicodeEx", longArrayOf(wvirtkey.toLong(), wscancode.toLong(), lpkeystate, pwszbuff, cchbuff.toLong(), wflags.toLong(), dwhkl)).toInt()
}

public fun TrackMouseEvent(lpeventtrack: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "TrackMouseEvent", longArrayOf(lpeventtrack)).toInt()
}

public fun UnloadKeyboardLayout(hkl: HKL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnloadKeyboardLayout", longArrayOf(hkl)).toInt()
}

public fun UnregisterHotKey(hwnd: Foundation.HWND, id: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnregisterHotKey", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), id.toLong())).toInt()
}

public fun VkKeyScanA(ch: Byte): Short {
    return Win32DynamicFfi.invoke("user32.dll", "VkKeyScanA", longArrayOf(ch.toLong())).toShort()
}

public fun VkKeyScanExA(ch: Byte, dwhkl: HKL): Short {
    return Win32DynamicFfi.invoke("user32.dll", "VkKeyScanExA", longArrayOf(ch.toLong(), dwhkl)).toShort()
}

public fun VkKeyScanExW(ch: UShort, dwhkl: HKL): Short {
    return Win32DynamicFfi.invoke("user32.dll", "VkKeyScanExW", longArrayOf(ch.toLong(), dwhkl)).toShort()
}

public fun VkKeyScanW(ch: UShort): Short {
    return Win32DynamicFfi.invoke("user32.dll", "VkKeyScanW", longArrayOf(ch.toLong())).toShort()
}

public fun _TrackMouseEvent(lpeventtrack: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "_TrackMouseEvent", longArrayOf(lpeventtrack)).toInt()
}

public fun keybd_event(bvk: UByte, bscan: UByte, dwflags: KEYBD_EVENT_FLAGS, dwextrainfo: ULong) {
    Win32DynamicFfi.invoke("user32.dll", "keybd_event", longArrayOf(bvk.toLong(), bscan.toLong(), dwflags.toLong(), dwextrainfo.toLong()))
}

public fun mouse_event(dwflags: MOUSE_EVENT_FLAGS, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    Win32DynamicFfi.invoke("user32.dll", "mouse_event", longArrayOf(dwflags.toLong(), dx.toLong(), dy.toLong(), dwdata.toLong(), dwextrainfo.toLong()))
}
