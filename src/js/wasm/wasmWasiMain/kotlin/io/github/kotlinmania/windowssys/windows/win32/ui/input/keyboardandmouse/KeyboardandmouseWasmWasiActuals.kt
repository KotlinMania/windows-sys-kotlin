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

public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun blockInput(fblockit: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getActiveWindow(): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAsyncKeyState(vkey: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCapture(): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDoubleClickTime(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getFocus(): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKBCodePage(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyState(nvirtkey: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyboardState(lpkeystate: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyboardType(ntypeflag: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getLastInputInfo(plii: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: COpaquePointer?, lpptbuf: COpaquePointer?, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oemKeyScan(woemchar: UShort): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun releaseCapture(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendInput(cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDoubleClickTime(param0: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setKeyboardState(lpkeystate: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun swapMouseButton(fswap: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt, dwhkl: Hkl): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun trackMouseEvent(lpeventtrack: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vkKeyScanA(ch: Byte): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vkKeyScanW(ch: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}
