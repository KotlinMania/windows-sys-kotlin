@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiMagnificationNapiAddon(): Boolean

private val windowsWin32UiMagnificationNapiAvailable: Boolean = initWindowsWin32UiMagnificationNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagGetColorEffect(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagGetColorEffect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect(p0)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagGetFullscreenTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagGetFullscreenTransform(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagGetImageScalingCallback(p0)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagGetImageScalingCallback(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagGetInputTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagGetInputTransform(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagGetWindowFilterList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagGetWindowFilterList(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagGetWindowSource(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagGetWindowSource(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagGetWindowTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagGetWindowTransform(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagInitialize()")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagInitialize(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagSetColorEffect(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagSetColorEffect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect(p0)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(p0: Double, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagSetImageScalingCallback(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagSetImageScalingCallback(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagSetInputTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagSetInputTransform(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagSetWindowFilterList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagSetWindowFilterList(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagSetWindowTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagSetWindowTransform(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagShowSystemCursor(p0)")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagShowSystemCursor(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiMagnificationMagUninitialize()")
private external fun wasmWindowssysWindowsWin32UiMagnificationMagUninitialize(): Int

public actual fun magGetColorEffect(hwnd: Hwnd, peffect: MutPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagGetColorEffect(hwnd.rawAddress.toString(), peffect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetFullscreenColorEffect(peffect: MutPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect(peffect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetFullscreenTransform(pmaglevel: MutPtr, pxoffset: MutPtr, pyoffset: MutPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagGetFullscreenTransform(pmaglevel.rawAddress.toString(), pxoffset.rawAddress.toString(), pyoffset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetImageScalingCallback(hwnd: Hwnd): MagImageScalingCallback =
    if (windowsWin32UiMagnificationNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetInputTransform(pfenabled: MutPtr, prectsource: MutPtr, prectdest: MutPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagGetInputTransform(pfenabled.rawAddress.toString(), prectsource.rawAddress.toString(), prectdest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetWindowFilterList(hwnd: Hwnd, pdwfiltermode: MutPtr, count: Int, phwnd: MutPtr): Int =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagGetWindowFilterList(hwnd.rawAddress.toString(), pdwfiltermode.rawAddress.toString(), count, phwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetWindowSource(hwnd: Hwnd, prect: MutPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagGetWindowSource(hwnd.rawAddress.toString(), prect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetWindowTransform(hwnd: Hwnd, ptransform: MutPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagGetWindowTransform(hwnd.rawAddress.toString(), ptransform.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magInitialize(): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagInitialize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetColorEffect(hwnd: Hwnd, peffect: MutPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagSetColorEffect(hwnd.rawAddress.toString(), peffect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetFullscreenColorEffect(peffect: ConstPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect(peffect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(maglevel.toDouble(), xoffset, yoffset) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetImageScalingCallback(hwnd: Hwnd, callback: MagImageScalingCallback): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagSetImageScalingCallback(hwnd.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetInputTransform(fenabled: Bool, prectsource: ConstPtr, prectdest: ConstPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagSetInputTransform(fenabled, prectsource.rawAddress.toString(), prectdest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetWindowFilterList(hwnd: Hwnd, dwfiltermode: MwFiltermode, count: Int, phwnd: MutPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagSetWindowFilterList(hwnd.rawAddress.toString(), dwfiltermode.toInt(), count, phwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetWindowSource(hwnd: Hwnd, rect: Rect): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetWindowTransform(hwnd: Hwnd, ptransform: MutPtr): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagSetWindowTransform(hwnd.rawAddress.toString(), ptransform.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magShowSystemCursor(fshowcursor: Bool): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagShowSystemCursor(fshowcursor) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magUninitialize(): Bool =
    if (windowsWin32UiMagnificationNapiAvailable) wasmWindowssysWindowsWin32UiMagnificationMagUninitialize() else throw UnsupportedOperationException("Native FFI addon is not available")
