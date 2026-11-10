@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap

private val _windowsWin32GraphicsDwmNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dwmAttachMilContent(hwnd: Hwnd): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmAttachMilContent((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmDefWindowProc((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString(), (plresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmDetachMilContent(hwnd: Hwnd): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmDetachMilContent((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmEnableBlurBehindWindow((hwnd?.value ?: 0L).toString(), (pblurbehind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableComposition(ucompositionaction: UInt): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmEnableComposition(ucompositionaction.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmEnableMMCSS(fenablemmcss) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmExtendFrameIntoClientArea((hwnd?.value ?: 0L).toString(), (pmarinset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmFlush(): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmFlush() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetColorizationColor(pcrcolorization: COpaquePointer?, pfopaqueblend: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmGetColorizationColor((pcrcolorization?.value ?: 0L).toString(), (pfopaqueblend?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmGetCompositionTimingInfo((hwnd?.value ?: 0L).toString(), (ptiminginfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamClient(uindex.toInt(), (pclientuuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamTransformHint(uindex.toInt(), (ptransform?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetTransportAttributes(pfisremoting: COpaquePointer?, pfisconnected: COpaquePointer?, pdwgeneration: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmGetTransportAttributes((pfisremoting?.value ?: 0L).toString(), (pfisconnected?.value ?: 0L).toString(), (pdwgeneration?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmGetUnmetTabRequirements((appwindow?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmGetWindowAttribute((hwnd?.value ?: 0L).toString(), dwattribute.toInt(), (pvattribute?.value ?: 0L).toString(), cbattribute.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmInvalidateIconicBitmaps((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmIsCompositionEnabled(pfenabled: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmIsCompositionEnabled((pfenabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmModifyPreviousDxFrameDuration((hwnd?.value ?: 0L).toString(), crefreshes, frelative) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmQueryThumbnailSourceSize(hthumbnail.toString(), (psize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmRegisterThumbnail((hwnddestination?.value ?: 0L).toString(), (hwndsource?.value ?: 0L).toString(), (phthumbnailid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: COpaquePointer?, ppoints: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmRenderGesture(gt, ccontacts.toInt(), (pdwpointerid?.value ?: 0L).toString(), (ppoints?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmSetDxFrameDuration((hwnd?.value ?: 0L).toString(), crefreshes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: COpaquePointer?, dwsitflags: UInt): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmSetIconicLivePreviewBitmap((hwnd?.value ?: 0L).toString(), (hbmp?.value ?: 0L).toString(), (pptclient?.value ?: 0L).toString(), dwsitflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmSetIconicThumbnail((hwnd?.value ?: 0L).toString(), (hbmp?.value ?: 0L).toString(), dwsitflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmSetPresentParameters((hwnd?.value ?: 0L).toString(), (ppresentparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmSetWindowAttribute((hwnd?.value ?: 0L).toString(), dwattribute.toInt(), (pvattribute?.value ?: 0L).toString(), cbattribute.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmShowContact(dwpointerid.toInt(), eshowcontact.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmTransitionOwnedWindow((hwnd?.value ?: 0L).toString(), target) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmUnregisterThumbnail(hthumbnailid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: COpaquePointer?): Hresult =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_dwmUpdateThumbnailProperties(hthumbnailid.toString(), (ptnproperties?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
