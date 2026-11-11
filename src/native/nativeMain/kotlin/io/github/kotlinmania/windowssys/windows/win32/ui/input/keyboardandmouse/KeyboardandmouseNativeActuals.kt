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
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_activateKeyboardLayout
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_blockInput
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_enableWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getActiveWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getAsyncKeyState
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getCapture
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getDoubleClickTime
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getFocus
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKBCodePage
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyState
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayout
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutList
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardState
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardType
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getLastInputInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_getMouseMovePointsEx
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_isWindowEnabled
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_keybdEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_mouseEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_oemKeyScan
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_registerHotKey
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_releaseCapture
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_sendInput
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_setActiveWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_setCapture
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_setDoubleClickTime
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_setFocus
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_setKeyboardState
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_swapMouseButton
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_toAscii
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_toAsciiEx
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_toUnicode
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_toUnicodeEx
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_trackMouseEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_unloadKeyboardLayout
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_unregisterHotKey
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    windowssys_windows_win32_ui_input_keyboardandmouse_activateKeyboardLayout(hkl?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun blockInput(fblockit: Bool): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_blockInput(fblockit)

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    0

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_enableWindow(hwnd?.value?.toCPointer<ByteVar>(), benable)

public actual fun getActiveWindow(): Hwnd =
    windowssys_windows_win32_ui_input_keyboardandmouse_getActiveWindow()?.let { COpaquePointer(it.toLong()) }

public actual fun getAsyncKeyState(vkey: Int): Short =
    windowssys_windows_win32_ui_input_keyboardandmouse_getAsyncKeyState(vkey)

public actual fun getCapture(): Hwnd =
    windowssys_windows_win32_ui_input_keyboardandmouse_getCapture()?.let { COpaquePointer(it.toLong()) }

public actual fun getDoubleClickTime(): UInt =
    windowssys_windows_win32_ui_input_keyboardandmouse_getDoubleClickTime()

public actual fun getFocus(): Hwnd =
    windowssys_windows_win32_ui_input_keyboardandmouse_getFocus()?.let { COpaquePointer(it.toLong()) }

public actual fun getKBCodePage(): UInt =
    windowssys_windows_win32_ui_input_keyboardandmouse_getKBCodePage()

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextA(lparam, lpstring?.value?.toCPointer<ByteVar>(), cchsize)

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextW(lparam, lpstring?.value?.toCPointer<ByteVar>(), cchsize)

public actual fun getKeyState(nvirtkey: Int): Short =
    windowssys_windows_win32_ui_input_keyboardandmouse_getKeyState(nvirtkey)

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayout(idthread)?.let { COpaquePointer(it.toLong()) }

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: COpaquePointer?): Int =
    windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutList(nbuff, lplist?.value?.toCPointer<ByteVar>())

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameA(pwszklid?.value?.toCPointer<ByteVar>())

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameW(pwszklid?.value?.toCPointer<ByteVar>())

public actual fun getKeyboardState(lpkeystate: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardState(lpkeystate?.value?.toCPointer<ByteVar>())

public actual fun getKeyboardType(ntypeflag: Int): Int =
    windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardType(ntypeflag)

public actual fun getLastInputInfo(plii: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_getLastInputInfo(plii?.value?.toCPointer<ByteVar>())

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: COpaquePointer?, lpptbuf: COpaquePointer?, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    windowssys_windows_win32_ui_input_keyboardandmouse_getMouseMovePointsEx(cbsize, lppt?.value?.toCPointer<ByteVar>(), lpptbuf?.value?.toCPointer<ByteVar>(), nbufpoints, resolution)

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_isWindowEnabled(hwnd?.value?.toCPointer<ByteVar>())

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutA(pwszklid?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutW(pwszklid?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyA(ucode, umaptype)

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExA(ucode, umaptype, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExW(ucode, umaptype, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyW(ucode, umaptype)

public actual fun oemKeyScan(woemchar: UShort): UInt =
    windowssys_windows_win32_ui_input_keyboardandmouse_oemKeyScan(woemchar)

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_registerHotKey(hwnd?.value?.toCPointer<ByteVar>(), id, fsmodifiers, vk)

public actual fun releaseCapture(): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_releaseCapture()

public actual fun sendInput(cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): UInt =
    windowssys_windows_win32_ui_input_keyboardandmouse_sendInput(cinputs, pinputs?.value?.toCPointer<ByteVar>(), cbsize)

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    windowssys_windows_win32_ui_input_keyboardandmouse_setActiveWindow(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    windowssys_windows_win32_ui_input_keyboardandmouse_setCapture(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setDoubleClickTime(param0: UInt): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_setDoubleClickTime(param0)

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    windowssys_windows_win32_ui_input_keyboardandmouse_setFocus(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setKeyboardState(lpkeystate: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_setKeyboardState(lpkeystate?.value?.toCPointer<ByteVar>())

public actual fun swapMouseButton(fswap: Bool): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_swapMouseButton(fswap)

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt): Int =
    windowssys_windows_win32_ui_input_keyboardandmouse_toAscii(uvirtkey, uscancode, lpkeystate?.value?.toCPointer<ByteVar>(), lpchar?.value?.toCPointer<ByteVar>(), uflags)

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt, dwhkl: Hkl): Int =
    windowssys_windows_win32_ui_input_keyboardandmouse_toAsciiEx(uvirtkey, uscancode, lpkeystate?.value?.toCPointer<ByteVar>(), lpchar?.value?.toCPointer<ByteVar>(), uflags, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    windowssys_windows_win32_ui_input_keyboardandmouse_toUnicode(wvirtkey, wscancode, lpkeystate?.value?.toCPointer<ByteVar>(), pwszbuff?.value?.toCPointer<ByteVar>(), cchbuff, wflags)

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    windowssys_windows_win32_ui_input_keyboardandmouse_toUnicodeEx(wvirtkey, wscancode, lpkeystate?.value?.toCPointer<ByteVar>(), pwszbuff?.value?.toCPointer<ByteVar>(), cchbuff, wflags, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun trackMouseEvent(lpeventtrack: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_trackMouseEvent(lpeventtrack?.value?.toCPointer<ByteVar>())

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_unloadKeyboardLayout(hkl?.value?.toCPointer<ByteVar>())

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    windowssys_windows_win32_ui_input_keyboardandmouse_unregisterHotKey(hwnd?.value?.toCPointer<ByteVar>(), id)

public actual fun vkKeyScanA(ch: Byte): Short =
    windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanA(ch)

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExA(ch, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExW(ch, dwhkl?.value?.toCPointer<ByteVar>())

public actual fun vkKeyScanW(ch: UShort): Short =
    windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanW(ch)

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong) {
    windowssys_windows_win32_ui_input_keyboardandmouse_keybdEvent(bvk, bscan, dwflags, dwextrainfo)
}

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    windowssys_windows_win32_ui_input_keyboardandmouse_mouseEvent(dwflags, dx, dy, dwdata, dwextrainfo)
}
