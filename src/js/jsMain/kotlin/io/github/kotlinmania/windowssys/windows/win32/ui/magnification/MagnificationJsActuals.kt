@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

private val windowsWin32UiMagnificationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun magGetColorEffect(hwnd: Hwnd, peffect: MutPtr<Magcoloreffect>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagGetColorEffect(hwnd.rawAddress.toString(), peffect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetFullscreenColorEffect(peffect: MutPtr<Magcoloreffect>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect(peffect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetFullscreenTransform(pmaglevel: MutPtr<Float>, pxoffset: MutPtr<Int>, pyoffset: MutPtr<Int>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagGetFullscreenTransform(pmaglevel.rawAddress.toString(), pxoffset.rawAddress.toString(), pyoffset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetImageScalingCallback(hwnd: Hwnd): MagImageScalingCallback =
    if (windowsWin32UiMagnificationNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetInputTransform(pfenabled: MutPtr<Bool>, prectsource: MutPtr<Rect>, prectdest: MutPtr<Rect>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagGetInputTransform(pfenabled.rawAddress.toString(), prectsource.rawAddress.toString(), prectdest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetWindowFilterList(hwnd: Hwnd, pdwfiltermode: MutPtr<MwFiltermode>, count: Int, phwnd: MutPtr<Hwnd>): Int =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagGetWindowFilterList(hwnd.rawAddress.toString(), pdwfiltermode.rawAddress.toString(), count, phwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetWindowSource(hwnd: Hwnd, prect: MutPtr<Rect>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagGetWindowSource(hwnd.rawAddress.toString(), prect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magGetWindowTransform(hwnd: Hwnd, ptransform: MutPtr<Magtransform>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagGetWindowTransform(hwnd.rawAddress.toString(), ptransform.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magInitialize(): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagInitialize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetColorEffect(hwnd: Hwnd, peffect: MutPtr<Magcoloreffect>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagSetColorEffect(hwnd.rawAddress.toString(), peffect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetFullscreenColorEffect(peffect: ConstPtr<Magcoloreffect>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect(peffect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(maglevel.toDouble(), xoffset, yoffset) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetImageScalingCallback(hwnd: Hwnd, callback: MagImageScalingCallback): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagSetImageScalingCallback(hwnd.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetInputTransform(fenabled: Bool, prectsource: ConstPtr<Rect>, prectdest: ConstPtr<Rect>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagSetInputTransform(fenabled, prectsource.rawAddress.toString(), prectdest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetWindowFilterList(hwnd: Hwnd, dwfiltermode: MwFiltermode, count: Int, phwnd: MutPtr<Hwnd>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagSetWindowFilterList(hwnd.rawAddress.toString(), dwfiltermode.toInt(), count, phwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetWindowSource(hwnd: Hwnd, rect: Rect): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magSetWindowTransform(hwnd: Hwnd, ptransform: MutPtr<Magtransform>): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagSetWindowTransform(hwnd.rawAddress.toString(), ptransform.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magShowSystemCursor(fshowcursor: Bool): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagShowSystemCursor(fshowcursor) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun magUninitialize(): Bool =
    if (windowsWin32UiMagnificationNapiAddon != null) (windowsWin32UiMagnificationNapiAddon.windowssysWindowsWin32UiMagnificationMagUninitialize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
