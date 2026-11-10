@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val _windowsWin32UiInputTouchNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_closeGestureInfoHandle((hgestureinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeTouchInputHandle(htouchinput: Htouchinput): Bool =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_closeTouchInputHandle((htouchinput?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: COpaquePointer?, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_getGestureConfig((hwnd?.value ?: 0L).toString(), dwreserved.toInt(), dwflags.toInt(), (pcids?.value ?: 0L).toString(), (pgestureconfig?.value ?: 0L).toString(), cbsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: COpaquePointer?): Bool =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_getGestureExtraArgs((hgestureinfo?.value ?: 0L).toString(), cbextraargs.toInt(), (pextraargs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_getGestureInfo((hgestureinfo?.value ?: 0L).toString(), (pgestureinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): Bool =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_getTouchInputInfo((htouchinput?.value ?: 0L).toString(), cinputs.toInt(), (pinputs?.value ?: 0L).toString(), cbsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTouchWindow(hwnd: Hwnd, pulflags: COpaquePointer?): Bool =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_isTouchWindow((hwnd?.value ?: 0L).toString(), (pulflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_registerTouchWindow((hwnd?.value ?: 0L).toString(), ulflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_setGestureConfig((hwnd?.value ?: 0L).toString(), dwreserved.toInt(), cids.toInt(), (pgestureconfig?.value ?: 0L).toString(), cbsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterTouchWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32UiInputTouchNapiAddon != null) (_windowsWin32UiInputTouchNapiAddon.windowssys_windows_win32_ui_input_touch_unregisterTouchWindow((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
