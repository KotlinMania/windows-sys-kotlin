@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32UiInputKeyboardandmouseNapiAddon(): Boolean

private val _windowsWin32UiInputKeyboardandmouseNapiAvailable: Boolean = _initWindowsWin32UiInputKeyboardandmouseNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_activateKeyboardLayout(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_activateKeyboardLayout(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_blockInput(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_blockInput(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_enableWindow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_enableWindow(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getActiveWindow()")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getActiveWindow(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getAsyncKeyState(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getAsyncKeyState(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getCapture()")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getCapture(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getDoubleClickTime()")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getDoubleClickTime(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getFocus()")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getFocus(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getKBCodePage()")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKBCodePage(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyState(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyState(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayout(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayout(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutList(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardState(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardType(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardType(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getLastInputInfo(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getLastInputInfo(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_getMouseMovePointsEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getMouseMovePointsEx(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_isWindowEnabled(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_isWindowEnabled(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutW(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyA(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyW(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_oemKeyScan(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_oemKeyScan(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_registerHotKey(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_registerHotKey(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_releaseCapture()")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_releaseCapture(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_sendInput(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_sendInput(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_setActiveWindow(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_setActiveWindow(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_setCapture(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_setCapture(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_setDoubleClickTime(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_setDoubleClickTime(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_setFocus(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_setFocus(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_setKeyboardState(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_setKeyboardState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_swapMouseButton(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_swapMouseButton(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_toAscii(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_toAscii(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_toAsciiEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_toAsciiEx(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_toUnicode(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_toUnicode(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_toUnicodeEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_toUnicodeEx(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_trackMouseEvent(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_trackMouseEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_unloadKeyboardLayout(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_unloadKeyboardLayout(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_unregisterHotKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_unregisterHotKey(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanA(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanW(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_keybdEvent(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_keybdEvent(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_keyboardandmouse_mouseEvent(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_mouseEvent(p0: Int, p1: Int, p2: Int, p3: Int, p4: String)

public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_activateKeyboardLayout((hkl?.value ?: 0L).toString(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun blockInput(fblockit: Bool): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_blockInput(fblockit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_enableWindow((hwnd?.value ?: 0L).toString(), benable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveWindow(): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getActiveWindow().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAsyncKeyState(vkey: Int): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getAsyncKeyState(vkey).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCapture(): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getCapture().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDoubleClickTime(): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getDoubleClickTime().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFocus(): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getFocus().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKBCodePage(): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKBCodePage().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextA(lparam, (lpstring?.value ?: 0L).toString(), cchsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextW(lparam, (lpstring?.value ?: 0L).toString(), cchsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyState(nvirtkey: Int): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyState(nvirtkey).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayout(idthread.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: COpaquePointer?): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutList(nbuff, (lplist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameA((pwszklid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameW((pwszklid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardState(lpkeystate: COpaquePointer?): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardState((lpkeystate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardType(ntypeflag: Int): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardType(ntypeflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastInputInfo(plii: COpaquePointer?): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getLastInputInfo((plii?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: COpaquePointer?, lpptbuf: COpaquePointer?, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_getMouseMovePointsEx(cbsize.toInt(), (lppt?.value ?: 0L).toString(), (lpptbuf?.value ?: 0L).toString(), nbufpoints, resolution.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_isWindowEnabled((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutA((pwszklid?.value ?: 0L).toString(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutW((pwszklid?.value ?: 0L).toString(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyA(ucode.toInt(), umaptype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExA(ucode.toInt(), umaptype.toInt(), (dwhkl?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExW(ucode.toInt(), umaptype.toInt(), (dwhkl?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyW(ucode.toInt(), umaptype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemKeyScan(woemchar: UShort): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_oemKeyScan(woemchar.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_registerHotKey((hwnd?.value ?: 0L).toString(), id, fsmodifiers.toInt(), vk.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseCapture(): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_releaseCapture() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendInput(cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_sendInput(cinputs.toInt(), (pinputs?.value ?: 0L).toString(), cbsize).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_setActiveWindow((hwnd?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_setCapture((hwnd?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDoubleClickTime(param0: UInt): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_setDoubleClickTime(param0.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_setFocus((hwnd?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setKeyboardState(lpkeystate: COpaquePointer?): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_setKeyboardState((lpkeystate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapMouseButton(fswap: Bool): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_swapMouseButton(fswap) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_toAscii(uvirtkey.toInt(), uscancode.toInt(), (lpkeystate?.value ?: 0L).toString(), (lpchar?.value ?: 0L).toString(), uflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt, dwhkl: Hkl): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_toAsciiEx(uvirtkey.toInt(), uscancode.toInt(), (lpkeystate?.value ?: 0L).toString(), (lpchar?.value ?: 0L).toString(), uflags.toInt(), (dwhkl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_toUnicode(wvirtkey.toInt(), wscancode.toInt(), (lpkeystate?.value ?: 0L).toString(), (pwszbuff?.value ?: 0L).toString(), cchbuff, wflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_toUnicodeEx(wvirtkey.toInt(), wscancode.toInt(), (lpkeystate?.value ?: 0L).toString(), (pwszbuff?.value ?: 0L).toString(), cchbuff, wflags.toInt(), (dwhkl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trackMouseEvent(lpeventtrack: COpaquePointer?): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_trackMouseEvent((lpeventtrack?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_unloadKeyboardLayout((hkl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_unregisterHotKey((hwnd?.value ?: 0L).toString(), id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanA(ch: Byte): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanA(ch.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExA(ch.toInt(), (dwhkl?.value ?: 0L).toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExW(ch.toInt(), (dwhkl?.value ?: 0L).toString()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanW(ch: UShort): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanW(ch.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong) {
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) {
        _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_keybdEvent(bvk.toInt(), bscan.toInt(), dwflags.toInt(), dwextrainfo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    if (_windowsWin32UiInputKeyboardandmouseNapiAvailable) {
        _wasm_windowssys_windows_win32_ui_input_keyboardandmouse_mouseEvent(dwflags.toInt(), dx, dy, dwdata, dwextrainfo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
