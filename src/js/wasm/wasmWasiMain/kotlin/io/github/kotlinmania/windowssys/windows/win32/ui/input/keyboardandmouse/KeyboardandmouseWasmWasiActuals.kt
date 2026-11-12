@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseActivateKeyboardLayout")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseBlockInput")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseBlockInput(fblockit: Int): Int

public actual fun blockInput(fblockit: Bool): Bool =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseBlockInput(fblockit)

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseDragDetect")

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseEnableWindow")

public actual fun getActiveWindow(): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetActiveWindow")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState(vkey: Int): Int

public actual fun getAsyncKeyState(vkey: Int): Short =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState(vkey).toShort()

public actual fun getCapture(): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetCapture")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime(): Int

public actual fun getDoubleClickTime(): UInt =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime().toUInt()

public actual fun getFocus(): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetFocus")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage(): Int

public actual fun getKBCodePage(): UInt =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage().toUInt()

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextA")

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseGetKeyState")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyState(nvirtkey: Int): Int

public actual fun getKeyState(nvirtkey: Int): Short =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyState(nvirtkey).toShort()

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayout")

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: MutPtr<Hkl>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutList")

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameA")

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameW")

public actual fun getKeyboardState(lpkeystate: MutPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardState")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType(ntypeflag: Int): Int

public actual fun getKeyboardType(ntypeflag: Int): Int =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType(ntypeflag)

public actual fun getLastInputInfo(plii: MutPtr<Lastinputinfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetLastInputInfo")

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: ConstPtr<Mousemovepoint>, lpptbuf: MutPtr<Mousemovepoint>, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseGetMouseMovePointsEx")

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseIsWindowEnabled")

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutA")

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA(ucode: Int, umaptype: Int): Int

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA(ucode.toInt(), umaptype.toInt()).toUInt()

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExA")

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW(ucode: Int, umaptype: Int): Int

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW(ucode.toInt(), umaptype.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan(woemchar: Int): Int

public actual fun oemKeyScan(woemchar: UShort): UInt =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan(woemchar.toInt()).toUInt()

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseRegisterHotKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture(): Int

public actual fun releaseCapture(): Bool =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture()

public actual fun sendInput(cinputs: UInt, pinputs: ConstPtr<Input>, cbsize: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseSendInput")

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseSetActiveWindow")

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseSetCapture")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime(param0: Int): Int

public actual fun setDoubleClickTime(param0: UInt): Bool =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime(param0.toInt())

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseSetFocus")

public actual fun setKeyboardState(lpkeystate: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseSetKeyboardState")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton(fswap: Int): Int

public actual fun swapMouseButton(fswap: Bool): Bool =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton(fswap)

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr<UByte>, lpchar: MutPtr<UShort>, uflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseToAscii")

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr<UByte>, lpchar: MutPtr<UShort>, uflags: UInt, dwhkl: Hkl): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseToAsciiEx")

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr<UByte>, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseToUnicode")

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr<UByte>, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseToUnicodeEx")

public actual fun trackMouseEvent(lpeventtrack: MutPtr<Trackmouseevent>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseTrackMouseEvent")

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseUnloadKeyboardLayout")

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseUnregisterHotKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA(ch: Int): Int

public actual fun vkKeyScanA(ch: Byte): Short =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA(ch.toInt()).toShort()

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExA")

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW(ch: Int): Int

public actual fun vkKeyScanW(ch: UShort): Short =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW(ch.toInt()).toShort()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent(bvk: Int, bscan: Int, dwflags: Int, dwextrainfo: Long): Unit

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong): Unit =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent(bvk.toInt(), bscan.toInt(), dwflags.toInt(), dwextrainfo.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputKeyboardandmouseMouseEvent")
private external fun wasiWindowssysWindowsWin32UiInputKeyboardandmouseMouseEvent(dwflags: Int, dx: Int, dy: Int, dwdata: Int, dwextrainfo: Long): Unit

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong): Unit =
    wasiWindowssysWindowsWin32UiInputKeyboardandmouseMouseEvent(dwflags.toInt(), dx, dy, dwdata, dwextrainfo.toLong())
