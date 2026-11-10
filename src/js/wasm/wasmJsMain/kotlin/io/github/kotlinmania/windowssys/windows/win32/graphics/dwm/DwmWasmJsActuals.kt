@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32GraphicsDwmNapiAddon(): Boolean

private val _windowsWin32GraphicsDwmNapiAvailable: Boolean = _initWindowsWin32GraphicsDwmNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmAttachMilContent(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmAttachMilContent(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmDefWindowProc(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmDefWindowProc(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmDetachMilContent(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmDetachMilContent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmEnableBlurBehindWindow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmEnableBlurBehindWindow(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmEnableComposition(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmEnableComposition(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmEnableMMCSS(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmEnableMMCSS(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmExtendFrameIntoClientArea(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmExtendFrameIntoClientArea(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmFlush()")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmFlush(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmGetColorizationColor(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmGetColorizationColor(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmGetCompositionTimingInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmGetCompositionTimingInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamClient(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamClient(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamTransformHint(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamTransformHint(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmGetTransportAttributes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmGetTransportAttributes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmGetUnmetTabRequirements(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmGetUnmetTabRequirements(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmGetWindowAttribute(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmGetWindowAttribute(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmInvalidateIconicBitmaps(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmInvalidateIconicBitmaps(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmIsCompositionEnabled(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmIsCompositionEnabled(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmModifyPreviousDxFrameDuration(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmModifyPreviousDxFrameDuration(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmQueryThumbnailSourceSize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmQueryThumbnailSourceSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmRegisterThumbnail(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmRegisterThumbnail(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmRenderGesture(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmRenderGesture(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmSetDxFrameDuration(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmSetDxFrameDuration(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmSetIconicLivePreviewBitmap(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmSetIconicLivePreviewBitmap(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmSetIconicThumbnail(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmSetIconicThumbnail(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmSetPresentParameters(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmSetPresentParameters(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmSetWindowAttribute(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmSetWindowAttribute(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmShowContact(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmShowContact(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmTransitionOwnedWindow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmTransitionOwnedWindow(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmUnregisterThumbnail(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmUnregisterThumbnail(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_dwm_dwmUpdateThumbnailProperties(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_dwm_dwmUpdateThumbnailProperties(p0: String, p1: String): Int

public actual fun dwmAttachMilContent(hwnd: Hwnd): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmAttachMilContent((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmDefWindowProc((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString(), (plresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmDetachMilContent(hwnd: Hwnd): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmDetachMilContent((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmEnableBlurBehindWindow((hwnd?.value ?: 0L).toString(), (pblurbehind?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableComposition(ucompositionaction: UInt): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmEnableComposition(ucompositionaction.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmEnableMMCSS(fenablemmcss) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmExtendFrameIntoClientArea((hwnd?.value ?: 0L).toString(), (pmarinset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmFlush(): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmFlush() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetColorizationColor(pcrcolorization: COpaquePointer?, pfopaqueblend: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmGetColorizationColor((pcrcolorization?.value ?: 0L).toString(), (pfopaqueblend?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmGetCompositionTimingInfo((hwnd?.value ?: 0L).toString(), (ptiminginfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamClient(uindex.toInt(), (pclientuuid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamTransformHint(uindex.toInt(), (ptransform?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetTransportAttributes(pfisremoting: COpaquePointer?, pfisconnected: COpaquePointer?, pdwgeneration: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmGetTransportAttributes((pfisremoting?.value ?: 0L).toString(), (pfisconnected?.value ?: 0L).toString(), (pdwgeneration?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmGetUnmetTabRequirements((appwindow?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmGetWindowAttribute((hwnd?.value ?: 0L).toString(), dwattribute.toInt(), (pvattribute?.value ?: 0L).toString(), cbattribute.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmInvalidateIconicBitmaps((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmIsCompositionEnabled(pfenabled: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmIsCompositionEnabled((pfenabled?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmModifyPreviousDxFrameDuration((hwnd?.value ?: 0L).toString(), crefreshes, frelative) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmQueryThumbnailSourceSize(hthumbnail.toString(), (psize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmRegisterThumbnail((hwnddestination?.value ?: 0L).toString(), (hwndsource?.value ?: 0L).toString(), (phthumbnailid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: COpaquePointer?, ppoints: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmRenderGesture(gt, ccontacts.toInt(), (pdwpointerid?.value ?: 0L).toString(), (ppoints?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmSetDxFrameDuration((hwnd?.value ?: 0L).toString(), crefreshes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: COpaquePointer?, dwsitflags: UInt): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmSetIconicLivePreviewBitmap((hwnd?.value ?: 0L).toString(), (hbmp?.value ?: 0L).toString(), (pptclient?.value ?: 0L).toString(), dwsitflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmSetIconicThumbnail((hwnd?.value ?: 0L).toString(), (hbmp?.value ?: 0L).toString(), dwsitflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmSetPresentParameters((hwnd?.value ?: 0L).toString(), (ppresentparams?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmSetWindowAttribute((hwnd?.value ?: 0L).toString(), dwattribute.toInt(), (pvattribute?.value ?: 0L).toString(), cbattribute.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmShowContact(dwpointerid.toInt(), eshowcontact.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmTransitionOwnedWindow((hwnd?.value ?: 0L).toString(), target) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmUnregisterThumbnail(hthumbnailid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAvailable) _wasm_windowssys_windows_win32_graphics_dwm_dwmUpdateThumbnailProperties(hthumbnailid.toString(), (ptnproperties?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
