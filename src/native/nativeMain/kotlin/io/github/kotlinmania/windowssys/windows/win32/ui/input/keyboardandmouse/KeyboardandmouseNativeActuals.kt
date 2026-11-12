@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseActivateKeyboardLayout
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseBlockInput
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseEnableWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetActiveWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetCapture
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetFocus
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyState
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayout
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutList
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardState
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetLastInputInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseGetMouseMovePointsEx
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseIsWindowEnabled
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseMouseEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseRegisterHotKey
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseSendInput
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseSetActiveWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseSetCapture
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseSetFocus
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseSetKeyboardState
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseToAscii
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseToAsciiEx
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseToUnicode
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseToUnicodeEx
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseTrackMouseEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseUnloadKeyboardLayout
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseUnregisterHotKey
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExA
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExW
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.cinterop.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    MutPtr(windowssysWindowsWin32UiInputKeyboardandmouseActivateKeyboardLayout(hkl.rawAddress.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L)

public actual fun blockInput(fblockit: Bool): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseBlockInput(fblockit)

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    0

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseEnableWindow(hwnd.rawAddress.toCPointer<ByteVar>(), benable)

public actual fun getActiveWindow(): Hwnd =
    MutPtr(windowssysWindowsWin32UiInputKeyboardandmouseGetActiveWindow()?.toLong() ?: 0L)

public actual fun getAsyncKeyState(vkey: Int): Short =
    windowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState(vkey)

public actual fun getCapture(): Hwnd =
    MutPtr(windowssysWindowsWin32UiInputKeyboardandmouseGetCapture()?.toLong() ?: 0L)

public actual fun getDoubleClickTime(): UInt =
    windowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime()

public actual fun getFocus(): Hwnd =
    MutPtr(windowssysWindowsWin32UiInputKeyboardandmouseGetFocus()?.toLong() ?: 0L)

public actual fun getKBCodePage(): UInt =
    windowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage()

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextA(lparam, lpstring.rawAddress.toCPointer<ByteVar>(), cchsize)

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextW(lparam, lpstring.rawAddress.toCPointer<ByteVar>(), cchsize)

public actual fun getKeyState(nvirtkey: Int): Short =
    windowssysWindowsWin32UiInputKeyboardandmouseGetKeyState(nvirtkey)

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    MutPtr(windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayout(idthread)?.toLong() ?: 0L)

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: MutPtr<Hkl>): Int =
    windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutList(nbuff, lplist.rawAddress.toCPointer<ByteVar>())

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameA(pwszklid.rawAddress.toCPointer<ByteVar>())

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameW(pwszklid.rawAddress.toCPointer<ByteVar>())

public actual fun getKeyboardState(lpkeystate: MutPtr<UByte>): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardState(lpkeystate.rawAddress.toCPointer<ByteVar>())

public actual fun getKeyboardType(ntypeflag: Int): Int =
    windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType(ntypeflag)

public actual fun getLastInputInfo(plii: MutPtr<Lastinputinfo>): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseGetLastInputInfo(plii.rawAddress.toCPointer<ByteVar>())

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: ConstPtr<Mousemovepoint>, lpptbuf: MutPtr<Mousemovepoint>, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    windowssysWindowsWin32UiInputKeyboardandmouseGetMouseMovePointsEx(cbsize, lppt.rawAddress.toCPointer<ByteVar>(), lpptbuf.rawAddress.toCPointer<ByteVar>(), nbufpoints, resolution)

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseIsWindowEnabled(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    MutPtr(windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutA(pwszklid.rawAddress.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L)

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    MutPtr(windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutW(pwszklid.rawAddress.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L)

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA(ucode, umaptype)

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExA(ucode, umaptype, dwhkl.rawAddress.toCPointer<ByteVar>())

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExW(ucode, umaptype, dwhkl.rawAddress.toCPointer<ByteVar>())

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW(ucode, umaptype)

public actual fun oemKeyScan(woemchar: UShort): UInt =
    windowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan(woemchar)

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseRegisterHotKey(hwnd.rawAddress.toCPointer<ByteVar>(), id, fsmodifiers, vk)

public actual fun releaseCapture(): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture()

public actual fun sendInput(cinputs: UInt, pinputs: ConstPtr<Input>, cbsize: Int): UInt =
    windowssysWindowsWin32UiInputKeyboardandmouseSendInput(cinputs, pinputs.rawAddress.toCPointer<ByteVar>(), cbsize)

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    MutPtr(windowssysWindowsWin32UiInputKeyboardandmouseSetActiveWindow(hwnd.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    MutPtr(windowssysWindowsWin32UiInputKeyboardandmouseSetCapture(hwnd.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setDoubleClickTime(param0: UInt): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime(param0)

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    MutPtr(windowssysWindowsWin32UiInputKeyboardandmouseSetFocus(hwnd.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setKeyboardState(lpkeystate: ConstPtr<UByte>): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseSetKeyboardState(lpkeystate.rawAddress.toCPointer<ByteVar>())

public actual fun swapMouseButton(fswap: Bool): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton(fswap)

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr<UByte>, lpchar: MutPtr<UShort>, uflags: UInt): Int =
    windowssysWindowsWin32UiInputKeyboardandmouseToAscii(uvirtkey, uscancode, lpkeystate.rawAddress.toCPointer<ByteVar>(), lpchar.rawAddress.toCPointer<ByteVar>(), uflags)

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr<UByte>, lpchar: MutPtr<UShort>, uflags: UInt, dwhkl: Hkl): Int =
    windowssysWindowsWin32UiInputKeyboardandmouseToAsciiEx(uvirtkey, uscancode, lpkeystate.rawAddress.toCPointer<ByteVar>(), lpchar.rawAddress.toCPointer<ByteVar>(), uflags, dwhkl.rawAddress.toCPointer<ByteVar>())

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr<UByte>, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    windowssysWindowsWin32UiInputKeyboardandmouseToUnicode(wvirtkey, wscancode, lpkeystate.rawAddress.toCPointer<ByteVar>(), pwszbuff.rawAddress.toCPointer<ByteVar>(), cchbuff, wflags)

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr<UByte>, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    windowssysWindowsWin32UiInputKeyboardandmouseToUnicodeEx(wvirtkey, wscancode, lpkeystate.rawAddress.toCPointer<ByteVar>(), pwszbuff.rawAddress.toCPointer<ByteVar>(), cchbuff, wflags, dwhkl.rawAddress.toCPointer<ByteVar>())

public actual fun trackMouseEvent(lpeventtrack: MutPtr<Trackmouseevent>): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseTrackMouseEvent(lpeventtrack.rawAddress.toCPointer<ByteVar>())

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseUnloadKeyboardLayout(hkl.rawAddress.toCPointer<ByteVar>())

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    windowssysWindowsWin32UiInputKeyboardandmouseUnregisterHotKey(hwnd.rawAddress.toCPointer<ByteVar>(), id)

public actual fun vkKeyScanA(ch: Byte): Short =
    windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA(ch)

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExA(ch, dwhkl.rawAddress.toCPointer<ByteVar>())

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExW(ch, dwhkl.rawAddress.toCPointer<ByteVar>())

public actual fun vkKeyScanW(ch: UShort): Short =
    windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW(ch)

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong) {
    windowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent(bvk, bscan, dwflags, dwextrainfo)
}

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    windowssysWindowsWin32UiInputKeyboardandmouseMouseEvent(dwflags, dx, dy, dwdata, dwextrainfo)
}
