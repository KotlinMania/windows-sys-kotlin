@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiInputKeyboardandmouseNapiAddon(): Boolean

private val windowsWin32UiInputKeyboardandmouseNapiAvailable: Boolean = initWindowsWin32UiInputKeyboardandmouseNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseActivateKeyboardLayout(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseActivateKeyboardLayout(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseBlockInput(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseBlockInput(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseEnableWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseEnableWindow(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetActiveWindow()")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetActiveWindow(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetCapture()")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetCapture(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime()")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetFocus()")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetFocus(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage()")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyState(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyState(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayout(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayout(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutList(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutList(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameA(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameW(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardState(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetLastInputInfo(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetLastInputInfo(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseGetMouseMovePointsEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetMouseMovePointsEx(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseIsWindowEnabled(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseIsWindowEnabled(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutW(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseRegisterHotKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseRegisterHotKey(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture()")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseSendInput(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseSendInput(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseSetActiveWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseSetActiveWindow(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseSetCapture(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseSetCapture(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseSetFocus(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseSetFocus(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseSetKeyboardState(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseSetKeyboardState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseToAscii(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseToAscii(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseToAsciiEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseToAsciiEx(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseToUnicode(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseToUnicode(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseToUnicodeEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseToUnicodeEx(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseTrackMouseEvent(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseTrackMouseEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseUnloadKeyboardLayout(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseUnloadKeyboardLayout(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseUnregisterHotKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseUnregisterHotKey(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW(p0)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputKeyboardandmouseMouseEvent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiInputKeyboardandmouseMouseEvent(p0: Int, p1: Int, p2: Int, p3: Int, p4: String)

public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputKeyboardandmouseActivateKeyboardLayout(hkl.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun blockInput(fblockit: Bool): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseBlockInput(fblockit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseEnableWindow(hwnd.rawAddress.toString(), benable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveWindow(): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetActiveWindow().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAsyncKeyState(vkey: Int): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState(vkey).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCapture(): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetCapture().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDoubleClickTime(): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFocus(): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetFocus().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKBCodePage(): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextA(lparam, lpstring.rawAddress.toString(), cchsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextW(lparam, lpstring.rawAddress.toString(), cchsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyState(nvirtkey: Int): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyState(nvirtkey).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayout(idthread.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: MutPtr<Hkl>): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutList(nbuff, lplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameA(pwszklid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameW(pwszklid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardState(lpkeystate: MutPtr<UByte>): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardState(lpkeystate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardType(ntypeflag: Int): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType(ntypeflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastInputInfo(plii: MutPtr<Lastinputinfo>): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetLastInputInfo(plii.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: ConstPtr<Mousemovepoint>, lpptbuf: MutPtr<Mousemovepoint>, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseGetMouseMovePointsEx(cbsize.toInt(), lppt.rawAddress.toString(), lpptbuf.rawAddress.toString(), nbufpoints, resolution.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseIsWindowEnabled(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutA(pwszklid.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutW(pwszklid.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA(ucode.toInt(), umaptype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExA(ucode.toInt(), umaptype.toInt(), dwhkl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExW(ucode.toInt(), umaptype.toInt(), dwhkl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW(ucode.toInt(), umaptype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemKeyScan(woemchar: UShort): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan(woemchar.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseRegisterHotKey(hwnd.rawAddress.toString(), id, fsmodifiers.toInt(), vk.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseCapture(): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendInput(cinputs: UInt, pinputs: ConstPtr<Input>, cbsize: Int): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseSendInput(cinputs.toInt(), pinputs.rawAddress.toString(), cbsize).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputKeyboardandmouseSetActiveWindow(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputKeyboardandmouseSetCapture(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDoubleClickTime(param0: UInt): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime(param0.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputKeyboardandmouseSetFocus(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setKeyboardState(lpkeystate: ConstPtr<UByte>): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseSetKeyboardState(lpkeystate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapMouseButton(fswap: Bool): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton(fswap) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr<UByte>, lpchar: MutPtr<UShort>, uflags: UInt): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseToAscii(uvirtkey.toInt(), uscancode.toInt(), lpkeystate.rawAddress.toString(), lpchar.rawAddress.toString(), uflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr<UByte>, lpchar: MutPtr<UShort>, uflags: UInt, dwhkl: Hkl): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseToAsciiEx(uvirtkey.toInt(), uscancode.toInt(), lpkeystate.rawAddress.toString(), lpchar.rawAddress.toString(), uflags.toInt(), dwhkl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr<UByte>, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseToUnicode(wvirtkey.toInt(), wscancode.toInt(), lpkeystate.rawAddress.toString(), pwszbuff.rawAddress.toString(), cchbuff, wflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr<UByte>, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseToUnicodeEx(wvirtkey.toInt(), wscancode.toInt(), lpkeystate.rawAddress.toString(), pwszbuff.rawAddress.toString(), cchbuff, wflags.toInt(), dwhkl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trackMouseEvent(lpeventtrack: MutPtr<Trackmouseevent>): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseTrackMouseEvent(lpeventtrack.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseUnloadKeyboardLayout(hkl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseUnregisterHotKey(hwnd.rawAddress.toString(), id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanA(ch: Byte): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA(ch.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExA(ch.toInt(), dwhkl.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExW(ch.toInt(), dwhkl.rawAddress.toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanW(ch: UShort): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) wasmWindowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW(ch.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong) {
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) {
        wasmWindowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent(bvk.toInt(), bscan.toInt(), dwflags.toInt(), dwextrainfo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    if (windowsWin32UiInputKeyboardandmouseNapiAvailable) {
        wasmWindowssysWindowsWin32UiInputKeyboardandmouseMouseEvent(dwflags.toInt(), dx, dy, dwdata, dwextrainfo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
