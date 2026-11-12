@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32GraphicsDwmNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dwmAttachMilContent(hwnd: Hwnd): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmAttachMilContent(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: MutPtr<Lresult>): Bool =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmDefWindowProc(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), plresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmDetachMilContent(hwnd: Hwnd): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmDetachMilContent(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: ConstPtr<DwmBlurbehind>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow(hwnd.rawAddress.toString(), pblurbehind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableComposition(ucompositionaction: UInt): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmEnableComposition(ucompositionaction.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(fenablemmcss) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: ConstPtr<Margins>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea(hwnd.rawAddress.toString(), pmarinset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmFlush(): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmFlush() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetColorizationColor(pcrcolorization: MutPtr<UInt>, pfopaqueblend: MutPtr<Bool>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmGetColorizationColor(pcrcolorization.rawAddress.toString(), pfopaqueblend.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: MutPtr<DwmTimingInfo>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo(hwnd.rawAddress.toString(), ptiminginfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: MutPtr<Guid>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient(uindex.toInt(), pclientuuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: MutPtr<MilMatrix3x2D>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint(uindex.toInt(), ptransform.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetTransportAttributes(pfisremoting: MutPtr<Bool>, pfisconnected: MutPtr<Bool>, pdwgeneration: MutPtr<UInt>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes(pfisremoting.rawAddress.toString(), pfisconnected.rawAddress.toString(), pdwgeneration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: MutPtr<DwmTabWindowRequirements>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements(appwindow.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: MutPtr<CVoid>, cbattribute: UInt): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute(hwnd.rawAddress.toString(), dwattribute.toInt(), pvattribute.rawAddress.toString(), cbattribute.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmIsCompositionEnabled(pfenabled: MutPtr<Bool>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled(pfenabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration(hwnd.rawAddress.toString(), crefreshes, frelative) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: MutPtr<Size>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize(hthumbnail.toString(), psize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: MutPtr<Long>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail(hwnddestination.rawAddress.toString(), hwndsource.rawAddress.toString(), phthumbnailid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: ConstPtr<UInt>, ppoints: ConstPtr<Point>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmRenderGesture(gt, ccontacts.toInt(), pdwpointerid.rawAddress.toString(), ppoints.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration(hwnd.rawAddress.toString(), crefreshes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: ConstPtr<Point>, dwsitflags: UInt): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap(hwnd.rawAddress.toString(), hbmp.rawAddress.toString(), pptclient.rawAddress.toString(), dwsitflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail(hwnd.rawAddress.toString(), hbmp.rawAddress.toString(), dwsitflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: MutPtr<DwmPresentParameters>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmSetPresentParameters(hwnd.rawAddress.toString(), ppresentparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: ConstPtr<CVoid>, cbattribute: UInt): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute(hwnd.rawAddress.toString(), dwattribute.toInt(), pvattribute.rawAddress.toString(), cbattribute.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmShowContact(dwpointerid.toInt(), eshowcontact.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow(hwnd.rawAddress.toString(), target) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(hthumbnailid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: ConstPtr<DwmThumbnailProperties>): Hresult =
    if (windowsWin32GraphicsDwmNapiAddon != null) (windowsWin32GraphicsDwmNapiAddon.windowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties(hthumbnailid.toString(), ptnproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
