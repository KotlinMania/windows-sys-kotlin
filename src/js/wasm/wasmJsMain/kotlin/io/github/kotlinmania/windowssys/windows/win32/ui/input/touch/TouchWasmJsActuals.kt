@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32UiInputTouchNapiAddon(): Boolean

private val _windowsWin32UiInputTouchNapiAvailable: Boolean = _initWindowsWin32UiInputTouchNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_touch_closeGestureInfoHandle(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_touch_closeGestureInfoHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_touch_closeTouchInputHandle(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_touch_closeTouchInputHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_touch_getGestureConfig(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_touch_getGestureConfig(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_touch_getGestureExtraArgs(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_touch_getGestureExtraArgs(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_touch_getGestureInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_touch_getGestureInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_touch_getTouchInputInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_touch_getTouchInputInfo(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_touch_isTouchWindow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_touch_isTouchWindow(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_touch_registerTouchWindow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_touch_registerTouchWindow(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_touch_setGestureConfig(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_ui_input_touch_setGestureConfig(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_touch_unregisterTouchWindow(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_touch_unregisterTouchWindow(p0: String): Int

public actual fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool =
    if (_windowsWin32UiInputTouchNapiAvailable) _wasm_windowssys_windows_win32_ui_input_touch_closeGestureInfoHandle((hgestureinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeTouchInputHandle(htouchinput: Htouchinput): Bool =
    if (_windowsWin32UiInputTouchNapiAvailable) _wasm_windowssys_windows_win32_ui_input_touch_closeTouchInputHandle((htouchinput?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: COpaquePointer?, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool =
    if (_windowsWin32UiInputTouchNapiAvailable) _wasm_windowssys_windows_win32_ui_input_touch_getGestureConfig((hwnd?.value ?: 0L).toString(), dwreserved.toInt(), dwflags.toInt(), (pcids?.value ?: 0L).toString(), (pgestureconfig?.value ?: 0L).toString(), cbsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: COpaquePointer?): Bool =
    if (_windowsWin32UiInputTouchNapiAvailable) _wasm_windowssys_windows_win32_ui_input_touch_getGestureExtraArgs((hgestureinfo?.value ?: 0L).toString(), cbextraargs.toInt(), (pextraargs?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputTouchNapiAvailable) _wasm_windowssys_windows_win32_ui_input_touch_getGestureInfo((hgestureinfo?.value ?: 0L).toString(), (pgestureinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): Bool =
    if (_windowsWin32UiInputTouchNapiAvailable) _wasm_windowssys_windows_win32_ui_input_touch_getTouchInputInfo((htouchinput?.value ?: 0L).toString(), cinputs.toInt(), (pinputs?.value ?: 0L).toString(), cbsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTouchWindow(hwnd: Hwnd, pulflags: COpaquePointer?): Bool =
    if (_windowsWin32UiInputTouchNapiAvailable) _wasm_windowssys_windows_win32_ui_input_touch_isTouchWindow((hwnd?.value ?: 0L).toString(), (pulflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool =
    if (_windowsWin32UiInputTouchNapiAvailable) _wasm_windowssys_windows_win32_ui_input_touch_registerTouchWindow((hwnd?.value ?: 0L).toString(), ulflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool =
    if (_windowsWin32UiInputTouchNapiAvailable) _wasm_windowssys_windows_win32_ui_input_touch_setGestureConfig((hwnd?.value ?: 0L).toString(), dwreserved.toInt(), cids.toInt(), (pgestureconfig?.value ?: 0L).toString(), cbsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterTouchWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32UiInputTouchNapiAvailable) _wasm_windowssys_windows_win32_ui_input_touch_unregisterTouchWindow((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
