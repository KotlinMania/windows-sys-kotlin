@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Margins

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32GraphicsDwmNapiAddon(): Boolean

private val windowsWin32GraphicsDwmNapiAvailable: Boolean = initWindowsWin32GraphicsDwmNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmAttachMilContent(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmAttachMilContent(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmDefWindowProc(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmDefWindowProc(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmDetachMilContent(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmDetachMilContent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmEnableComposition(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmEnableComposition(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmFlush()")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmFlush(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmGetColorizationColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmGetColorizationColor(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmRenderGesture(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmRenderGesture(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmSetPresentParameters(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmSetPresentParameters(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmShowContact(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmShowContact(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties(p0: String, p1: String): Int

public actual fun dwmAttachMilContent(hwnd: Hwnd): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmAttachMilContent(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: MutPtr<Lresult>): Bool =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmDefWindowProc(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), plresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmDetachMilContent(hwnd: Hwnd): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmDetachMilContent(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: ConstPtr<DwmBlurbehind>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow(hwnd.rawAddress.toString(), pblurbehind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableComposition(ucompositionaction: UInt): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmEnableComposition(ucompositionaction.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(fenablemmcss) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: ConstPtr<Margins>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea(hwnd.rawAddress.toString(), pmarinset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmFlush(): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmFlush() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetColorizationColor(pcrcolorization: MutPtr<UInt>, pfopaqueblend: MutPtr<Bool>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmGetColorizationColor(pcrcolorization.rawAddress.toString(), pfopaqueblend.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: MutPtr<DwmTimingInfo>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo(hwnd.rawAddress.toString(), ptiminginfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: MutPtr<Guid>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient(uindex.toInt(), pclientuuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: MutPtr<MilMatrix3x2D>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint(uindex.toInt(), ptransform.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetTransportAttributes(pfisremoting: MutPtr<Bool>, pfisconnected: MutPtr<Bool>, pdwgeneration: MutPtr<UInt>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes(pfisremoting.rawAddress.toString(), pfisconnected.rawAddress.toString(), pdwgeneration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: MutPtr<DwmTabWindowRequirements>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements(appwindow.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: MutPtr<CVoid>, cbattribute: UInt): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute(hwnd.rawAddress.toString(), dwattribute.toInt(), pvattribute.rawAddress.toString(), cbattribute.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmIsCompositionEnabled(pfenabled: MutPtr<Bool>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled(pfenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration(hwnd.rawAddress.toString(), crefreshes, frelative) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: MutPtr<Size>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize(hthumbnail.toString(), psize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: MutPtr<Long>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail(hwnddestination.rawAddress.toString(), hwndsource.rawAddress.toString(), phthumbnailid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: ConstPtr<UInt>, ppoints: ConstPtr<Point>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmRenderGesture(gt, ccontacts.toInt(), pdwpointerid.rawAddress.toString(), ppoints.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration(hwnd.rawAddress.toString(), crefreshes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: ConstPtr<Point>, dwsitflags: UInt): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap(hwnd.rawAddress.toString(), hbmp.rawAddress.toString(), pptclient.rawAddress.toString(), dwsitflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail(hwnd.rawAddress.toString(), hbmp.rawAddress.toString(), dwsitflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: MutPtr<DwmPresentParameters>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmSetPresentParameters(hwnd.rawAddress.toString(), ppresentparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: ConstPtr<CVoid>, cbattribute: UInt): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute(hwnd.rawAddress.toString(), dwattribute.toInt(), pvattribute.rawAddress.toString(), cbattribute.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmShowContact(dwpointerid.toInt(), eshowcontact.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow(hwnd.rawAddress.toString(), target) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(hthumbnailid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: ConstPtr<DwmThumbnailProperties>): Hresult =
    if (windowsWin32GraphicsDwmNapiAvailable) wasmWindowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties(hthumbnailid.toString(), ptnproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
