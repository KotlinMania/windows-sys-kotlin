package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point

public expect fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl

public expect fun blockInput(fblockit: Bool): Bool

public expect fun dragDetect(hwnd: Hwnd, pt: Point): Bool

public expect fun enableWindow(hwnd: Hwnd, benable: Bool): Bool

public expect fun getActiveWindow(): Hwnd

public expect fun getAsyncKeyState(vkey: Int): Short

public expect fun getCapture(): Hwnd

public expect fun getDoubleClickTime(): UInt

public expect fun getFocus(): Hwnd

public expect fun getKBCodePage(): UInt

public expect fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int

public expect fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int

public expect fun getKeyState(nvirtkey: Int): Short

public expect fun getKeyboardLayout(idthread: UInt): Hkl

public expect fun getKeyboardLayoutList(nbuff: Int, lplist: MutPtr): Int

public expect fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool

public expect fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool

public expect fun getKeyboardState(lpkeystate: MutPtr): Bool

public expect fun getKeyboardType(ntypeflag: Int): Int

public expect fun getLastInputInfo(plii: MutPtr): Bool

public expect fun getMouseMovePointsEx(cbsize: UInt, lppt: ConstPtr, lpptbuf: MutPtr, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int

public expect fun isWindowEnabled(hwnd: Hwnd): Bool

public expect fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl

public expect fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl

public expect fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt

public expect fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt

public expect fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt

public expect fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt

public expect fun oemKeyScan(woemchar: UShort): UInt

public expect fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool

public expect fun releaseCapture(): Bool

public expect fun sendInput(cinputs: UInt, pinputs: ConstPtr, cbsize: Int): UInt

public expect fun setActiveWindow(hwnd: Hwnd): Hwnd

public expect fun setCapture(hwnd: Hwnd): Hwnd

public expect fun setDoubleClickTime(param0: UInt): Bool

public expect fun setFocus(hwnd: Hwnd): Hwnd

public expect fun setKeyboardState(lpkeystate: ConstPtr): Bool

public expect fun swapMouseButton(fswap: Bool): Bool

public expect fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr, lpchar: MutPtr, uflags: UInt): Int

public expect fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr, lpchar: MutPtr, uflags: UInt, dwhkl: Hkl): Int

public expect fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int

public expect fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int

public expect fun trackMouseEvent(lpeventtrack: MutPtr): Bool

public expect fun unloadKeyboardLayout(hkl: Hkl): Bool

public expect fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool

public expect fun vkKeyScanA(ch: Byte): Short

public expect fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short

public expect fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short

public expect fun vkKeyScanW(ch: UShort): Short

public expect fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong)

public expect fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong)
