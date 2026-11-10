@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_activateKeyboardLayout(hkl?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun blockInput(fblockit: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_blockInput(fblockit)

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    0

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_enableWindow(hwnd?.value?.toCPointer<ByteVar>(), benable)

public actual fun getActiveWindow(): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getActiveWindow()?.let { COpaquePointer(it.toLong()) }

public actual fun getAsyncKeyState(vkey: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getAsyncKeyState(vkey)

public actual fun getCapture(): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getCapture()?.let { COpaquePointer(it.toLong()) }

public actual fun getDoubleClickTime(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getDoubleClickTime()

public actual fun getFocus(): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getFocus()?.let { COpaquePointer(it.toLong()) }

public actual fun getKBCodePage(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKBCodePage()

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextA(lparam, lpstring?.value?.toCPointer<ByteVar>(), cchsize)

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextW(lparam, lpstring?.value?.toCPointer<ByteVar>(), cchsize)

public actual fun getKeyState(nvirtkey: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyState(nvirtkey)

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayout(idthread)?.let { COpaquePointer(it.toLong()) }

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutList(nbuff, lplist?.value?.toCPointer<ByteVar>())

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameA(pwszklid?.value?.toCPointer<ByteVar>())

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameW(pwszklid?.value?.toCPointer<ByteVar>())

public actual fun getKeyboardState(lpkeystate: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardState(lpkeystate?.value?.toCPointer<ByteVar>())

public actual fun getKeyboardType(ntypeflag: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardType(ntypeflag)

public actual fun getLastInputInfo(plii: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getLastInputInfo(plii?.value?.toCPointer<ByteVar>())

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: COpaquePointer?, lpptbuf: COpaquePointer?, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getMouseMovePointsEx(cbsize, lppt?.value?.toCPointer<ByteVar>(), lpptbuf?.value?.toCPointer<ByteVar>(), nbufpoints, resolution)

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_isWindowEnabled(hwnd?.value?.toCPointer<ByteVar>())

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutA(pwszklid?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutW(pwszklid?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyA(ucode, umaptype)

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExA(ucode, umaptype, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExW(ucode, umaptype, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyW(ucode, umaptype)

public actual fun oemKeyScan(woemchar: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_oemKeyScan(woemchar)

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_registerHotKey(hwnd?.value?.toCPointer<ByteVar>(), id, fsmodifiers, vk)

public actual fun releaseCapture(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_releaseCapture()

public actual fun sendInput(cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_sendInput(cinputs, pinputs?.value?.toCPointer<ByteVar>(), cbsize)

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_setActiveWindow(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_setCapture(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setDoubleClickTime(param0: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_setDoubleClickTime(param0)

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_setFocus(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setKeyboardState(lpkeystate: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_setKeyboardState(lpkeystate?.value?.toCPointer<ByteVar>())

public actual fun swapMouseButton(fswap: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_swapMouseButton(fswap)

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_toAscii(uvirtkey, uscancode, lpkeystate?.value?.toCPointer<ByteVar>(), lpchar?.value?.toCPointer<ByteVar>(), uflags)

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt, dwhkl: Hkl): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_toAsciiEx(uvirtkey, uscancode, lpkeystate?.value?.toCPointer<ByteVar>(), lpchar?.value?.toCPointer<ByteVar>(), uflags, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_toUnicode(wvirtkey, wscancode, lpkeystate?.value?.toCPointer<ByteVar>(), pwszbuff?.value?.toCPointer<ByteVar>(), cchbuff, wflags)

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_toUnicodeEx(wvirtkey, wscancode, lpkeystate?.value?.toCPointer<ByteVar>(), pwszbuff?.value?.toCPointer<ByteVar>(), cchbuff, wflags, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun trackMouseEvent(lpeventtrack: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_trackMouseEvent(lpeventtrack?.value?.toCPointer<ByteVar>())

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_unloadKeyboardLayout(hkl?.value?.toCPointer<ByteVar>())

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_unregisterHotKey(hwnd?.value?.toCPointer<ByteVar>(), id)

public actual fun vkKeyScanA(ch: Byte): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanA(ch)

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExA(ch, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExW(ch, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun vkKeyScanW(ch: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanW(ch)

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_keybdEvent(bvk, bscan, dwflags, dwextrainfo)
}

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mouseEvent(dwflags, dx, dy, dwdata, dwextrainfo)
}
