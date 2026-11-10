@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32UiMagnificationNapiAddon(): Boolean

private val _windowsWin32UiMagnificationNapiAvailable: Boolean = _initWindowsWin32UiMagnificationNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magGetColorEffect(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magGetColorEffect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magGetFullscreenColorEffect(p0)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magGetFullscreenColorEffect(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magGetFullscreenTransform(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magGetFullscreenTransform(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magGetImageScalingCallback(p0)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magGetImageScalingCallback(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magGetInputTransform(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magGetInputTransform(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magGetWindowFilterList(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magGetWindowFilterList(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magGetWindowSource(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magGetWindowSource(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magGetWindowTransform(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magGetWindowTransform(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magInitialize()")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magInitialize(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magSetColorEffect(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magSetColorEffect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magSetFullscreenColorEffect(p0)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magSetFullscreenColorEffect(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magSetFullscreenTransform(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magSetFullscreenTransform(p0: Double, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magSetImageScalingCallback(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magSetImageScalingCallback(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magSetInputTransform(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magSetInputTransform(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magSetWindowFilterList(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magSetWindowFilterList(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magSetWindowTransform(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magSetWindowTransform(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magShowSystemCursor(p0)")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magShowSystemCursor(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_magnification_magUninitialize()")
private external fun _wasm_windowssys_windows_win32_ui_magnification_magUninitialize(): Int

public actual fun magGetColorEffect(hwnd: Hwnd, peffect: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magGetColorEffect((hwnd?.value ?: 0L).toString(), (peffect?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetFullscreenColorEffect(peffect: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magGetFullscreenColorEffect((peffect?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetFullscreenTransform(pmaglevel: COpaquePointer?, pxoffset: COpaquePointer?, pyoffset: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magGetFullscreenTransform((pmaglevel?.value ?: 0L).toString(), (pxoffset?.value ?: 0L).toString(), (pyoffset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetImageScalingCallback(hwnd: Hwnd): MagImageScalingCallback =
    if (_windowsWin32UiMagnificationNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetInputTransform(pfenabled: COpaquePointer?, prectsource: COpaquePointer?, prectdest: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magGetInputTransform((pfenabled?.value ?: 0L).toString(), (prectsource?.value ?: 0L).toString(), (prectdest?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetWindowFilterList(hwnd: Hwnd, pdwfiltermode: COpaquePointer?, count: Int, phwnd: COpaquePointer?): Int =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magGetWindowFilterList((hwnd?.value ?: 0L).toString(), (pdwfiltermode?.value ?: 0L).toString(), count, (phwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetWindowSource(hwnd: Hwnd, prect: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magGetWindowSource((hwnd?.value ?: 0L).toString(), (prect?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetWindowTransform(hwnd: Hwnd, ptransform: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magGetWindowTransform((hwnd?.value ?: 0L).toString(), (ptransform?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magInitialize(): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magInitialize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetColorEffect(hwnd: Hwnd, peffect: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magSetColorEffect((hwnd?.value ?: 0L).toString(), (peffect?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetFullscreenColorEffect(peffect: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magSetFullscreenColorEffect((peffect?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magSetFullscreenTransform(maglevel.toDouble(), xoffset, yoffset) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetImageScalingCallback(hwnd: Hwnd, callback: MagImageScalingCallback): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magSetImageScalingCallback((hwnd?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetInputTransform(fenabled: Bool, prectsource: COpaquePointer?, prectdest: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magSetInputTransform(fenabled, (prectsource?.value ?: 0L).toString(), (prectdest?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetWindowFilterList(hwnd: Hwnd, dwfiltermode: MwFiltermode, count: Int, phwnd: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magSetWindowFilterList((hwnd?.value ?: 0L).toString(), dwfiltermode.toInt(), count, (phwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetWindowSource(hwnd: Hwnd, rect: Rect): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetWindowTransform(hwnd: Hwnd, ptransform: COpaquePointer?): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magSetWindowTransform((hwnd?.value ?: 0L).toString(), (ptransform?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magShowSystemCursor(fshowcursor: Bool): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magShowSystemCursor(fshowcursor) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magUninitialize(): Bool =
    if (_windowsWin32UiMagnificationNapiAvailable) _wasm_windowssys_windows_win32_ui_magnification_magUninitialize() else throw UnsupportedOperationException("Native FFI addon is not available")
