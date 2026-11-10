@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point

private object WindowsWin32UiInputKeyboardandmouseJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_activateKeyboardLayout(hkl: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_blockInput(fblockit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_enableWindow(hwnd: Long, benable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getActiveWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getAsyncKeyState(vkey: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getCapture(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getDoubleClickTime(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getFocus(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getKBCodePage(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextA(lparam: Int, lpstring: Long, cchsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextW(lparam: Int, lpstring: Long, cchsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getKeyState(nvirtkey: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayout(idthread: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutList(nbuff: Int, lplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameA(pwszklid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameW(pwszklid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardState(lpkeystate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardType(ntypeflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getLastInputInfo(plii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_getMouseMovePointsEx(cbsize: Int, lppt: Long, lpptbuf: Long, nbufpoints: Int, resolution: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_isWindowEnabled(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutA(pwszklid: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutW(pwszklid: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyA(ucode: Int, umaptype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExA(ucode: Int, umaptype: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExW(ucode: Int, umaptype: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyW(ucode: Int, umaptype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_oemKeyScan(woemchar: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_registerHotKey(hwnd: Long, id: Int, fsmodifiers: Int, vk: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_releaseCapture(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_sendInput(cinputs: Int, pinputs: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_setActiveWindow(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_setCapture(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_setDoubleClickTime(param0: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_setFocus(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_setKeyboardState(lpkeystate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_swapMouseButton(fswap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_toAscii(uvirtkey: Int, uscancode: Int, lpkeystate: Long, lpchar: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_toAsciiEx(uvirtkey: Int, uscancode: Int, lpkeystate: Long, lpchar: Long, uflags: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_toUnicode(wvirtkey: Int, wscancode: Int, lpkeystate: Long, pwszbuff: Long, cchbuff: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_toUnicodeEx(wvirtkey: Int, wscancode: Int, lpkeystate: Long, pwszbuff: Long, cchbuff: Int, wflags: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_trackMouseEvent(lpeventtrack: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_unloadKeyboardLayout(hkl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_unregisterHotKey(hwnd: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanA(ch: Byte): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExA(ch: Byte, dwhkl: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExW(ch: Short, dwhkl: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanW(ch: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_keybdEvent(bvk: Byte, bscan: Byte, dwflags: Int, dwextrainfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_keyboardandmouse_mouseEvent(dwflags: Int, dx: Int, dy: Int, dwdata: Int, dwextrainfo: Long)
}

public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_activateKeyboardLayout((hkl?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun blockInput(fblockit: Bool): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_blockInput(fblockit)

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    0

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_enableWindow((hwnd?.value ?: 0L), benable)

public actual fun getActiveWindow(): Hwnd =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getActiveWindow().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getAsyncKeyState(vkey: Int): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getAsyncKeyState(vkey)

public actual fun getCapture(): Hwnd =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getCapture().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getDoubleClickTime(): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getDoubleClickTime().toUInt()

public actual fun getFocus(): Hwnd =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getFocus().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getKBCodePage(): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getKBCodePage().toUInt()

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextA(lparam, (lpstring?.value ?: 0L), cchsize)

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextW(lparam, (lpstring?.value ?: 0L), cchsize)

public actual fun getKeyState(nvirtkey: Int): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyState(nvirtkey)

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayout(idthread.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: COpaquePointer?): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutList(nbuff, (lplist?.value ?: 0L))

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameA((pwszklid?.value ?: 0L))

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameW((pwszklid?.value ?: 0L))

public actual fun getKeyboardState(lpkeystate: COpaquePointer?): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardState((lpkeystate?.value ?: 0L))

public actual fun getKeyboardType(ntypeflag: Int): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardType(ntypeflag)

public actual fun getLastInputInfo(plii: COpaquePointer?): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getLastInputInfo((plii?.value ?: 0L))

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: COpaquePointer?, lpptbuf: COpaquePointer?, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_getMouseMovePointsEx(cbsize.toInt(), (lppt?.value ?: 0L), (lpptbuf?.value ?: 0L), nbufpoints, resolution.toInt())

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_isWindowEnabled((hwnd?.value ?: 0L))

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutA((pwszklid?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutW((pwszklid?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyA(ucode.toInt(), umaptype.toInt()).toUInt()

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExA(ucode.toInt(), umaptype.toInt(), (dwhkl?.value ?: 0L)).toUInt()

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExW(ucode.toInt(), umaptype.toInt(), (dwhkl?.value ?: 0L)).toUInt()

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyW(ucode.toInt(), umaptype.toInt()).toUInt()

public actual fun oemKeyScan(woemchar: UShort): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_oemKeyScan(woemchar.toShort()).toUInt()

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_registerHotKey((hwnd?.value ?: 0L), id, fsmodifiers.toInt(), vk.toInt())

public actual fun releaseCapture(): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_releaseCapture()

public actual fun sendInput(cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_sendInput(cinputs.toInt(), (pinputs?.value ?: 0L), cbsize).toUInt()

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_setActiveWindow((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_setCapture((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setDoubleClickTime(param0: UInt): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_setDoubleClickTime(param0.toInt())

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_setFocus((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setKeyboardState(lpkeystate: COpaquePointer?): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_setKeyboardState((lpkeystate?.value ?: 0L))

public actual fun swapMouseButton(fswap: Bool): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_swapMouseButton(fswap)

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_toAscii(uvirtkey.toInt(), uscancode.toInt(), (lpkeystate?.value ?: 0L), (lpchar?.value ?: 0L), uflags.toInt())

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt, dwhkl: Hkl): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_toAsciiEx(uvirtkey.toInt(), uscancode.toInt(), (lpkeystate?.value ?: 0L), (lpchar?.value ?: 0L), uflags.toInt(), (dwhkl?.value ?: 0L))

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_toUnicode(wvirtkey.toInt(), wscancode.toInt(), (lpkeystate?.value ?: 0L), (pwszbuff?.value ?: 0L), cchbuff, wflags.toInt())

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_toUnicodeEx(wvirtkey.toInt(), wscancode.toInt(), (lpkeystate?.value ?: 0L), (pwszbuff?.value ?: 0L), cchbuff, wflags.toInt(), (dwhkl?.value ?: 0L))

public actual fun trackMouseEvent(lpeventtrack: COpaquePointer?): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_trackMouseEvent((lpeventtrack?.value ?: 0L))

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_unloadKeyboardLayout((hkl?.value ?: 0L))

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_unregisterHotKey((hwnd?.value ?: 0L), id)

public actual fun vkKeyScanA(ch: Byte): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanA(ch)

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExA(ch, (dwhkl?.value ?: 0L))

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExW(ch.toShort(), (dwhkl?.value ?: 0L))

public actual fun vkKeyScanW(ch: UShort): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanW(ch.toShort())

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong) {
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_keybdEvent(bvk.toByte(), bscan.toByte(), dwflags.toInt(), dwextrainfo.toLong())
}

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssys_windows_win32_ui_input_keyboardandmouse_mouseEvent(dwflags.toInt(), dx, dy, dwdata, dwextrainfo.toLong())
}
