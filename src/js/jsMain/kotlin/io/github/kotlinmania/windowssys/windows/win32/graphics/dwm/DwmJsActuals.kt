@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP

private val _windowsWin32GraphicsDwmNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun DwmAttachMilContent(hwnd: HWND): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmAttachMilContent(hwnd.toString()) as Int) else 0

public actual fun DwmDefWindowProc(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, plresult: Long): BOOL =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmDefWindowProc(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString(), plresult.toString()) as Int) else 0

public actual fun DwmDetachMilContent(hwnd: HWND): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmDetachMilContent(hwnd.toString()) as Int) else 0

public actual fun DwmEnableBlurBehindWindow(hwnd: HWND, pblurbehind: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmEnableBlurBehindWindow(hwnd.toString(), pblurbehind.toString()) as Int) else 0

public actual fun DwmEnableComposition(ucompositionaction: UInt): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmEnableComposition(ucompositionaction.toInt()) as Int) else 0

public actual fun DwmEnableMMCSS(fenablemmcss: BOOL): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmEnableMMCSS(fenablemmcss) as Int) else 0

public actual fun DwmExtendFrameIntoClientArea(hwnd: HWND, pmarinset: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmExtendFrameIntoClientArea(hwnd.toString(), pmarinset.toString()) as Int) else 0

public actual fun DwmFlush(): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmFlush() as Int) else 0

public actual fun DwmGetColorizationColor(pcrcolorization: Long, pfopaqueblend: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmGetColorizationColor(pcrcolorization.toString(), pfopaqueblend.toString()) as Int) else 0

public actual fun DwmGetCompositionTimingInfo(hwnd: HWND, ptiminginfo: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmGetCompositionTimingInfo(hwnd.toString(), ptiminginfo.toString()) as Int) else 0

public actual fun DwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmGetGraphicsStreamClient(uindex.toInt(), pclientuuid.toString()) as Int) else 0

public actual fun DwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmGetGraphicsStreamTransformHint(uindex.toInt(), ptransform.toString()) as Int) else 0

public actual fun DwmGetTransportAttributes(pfisremoting: Long, pfisconnected: Long, pdwgeneration: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmGetTransportAttributes(pfisremoting.toString(), pfisconnected.toString(), pdwgeneration.toString()) as Int) else 0

public actual fun DwmGetUnmetTabRequirements(appwindow: HWND, value: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmGetUnmetTabRequirements(appwindow.toString(), value.toString()) as Int) else 0

public actual fun DwmGetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmGetWindowAttribute(hwnd.toString(), dwattribute.toInt(), pvattribute.toString(), cbattribute.toInt()) as Int) else 0

public actual fun DwmInvalidateIconicBitmaps(hwnd: HWND): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmInvalidateIconicBitmaps(hwnd.toString()) as Int) else 0

public actual fun DwmIsCompositionEnabled(pfenabled: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmIsCompositionEnabled(pfenabled.toString()) as Int) else 0

public actual fun DwmModifyPreviousDxFrameDuration(hwnd: HWND, crefreshes: Int, frelative: BOOL): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmModifyPreviousDxFrameDuration(hwnd.toString(), crefreshes, frelative) as Int) else 0

public actual fun DwmQueryThumbnailSourceSize(hthumbnail: Long, psize: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmQueryThumbnailSourceSize(hthumbnail.toString(), psize.toString()) as Int) else 0

public actual fun DwmRegisterThumbnail(hwnddestination: HWND, hwndsource: HWND, phthumbnailid: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmRegisterThumbnail(hwnddestination.toString(), hwndsource.toString(), phthumbnailid.toString()) as Int) else 0

public actual fun DwmRenderGesture(gt: GESTURE_TYPE, ccontacts: UInt, pdwpointerid: Long, ppoints: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmRenderGesture(gt, ccontacts.toInt(), pdwpointerid.toString(), ppoints.toString()) as Int) else 0

public actual fun DwmSetDxFrameDuration(hwnd: HWND, crefreshes: Int): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmSetDxFrameDuration(hwnd.toString(), crefreshes) as Int) else 0

public actual fun DwmSetIconicLivePreviewBitmap(hwnd: HWND, hbmp: HBITMAP, pptclient: Long, dwsitflags: UInt): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmSetIconicLivePreviewBitmap(hwnd.toString(), hbmp.toString(), pptclient.toString(), dwsitflags.toInt()) as Int) else 0

public actual fun DwmSetIconicThumbnail(hwnd: HWND, hbmp: HBITMAP, dwsitflags: UInt): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmSetIconicThumbnail(hwnd.toString(), hbmp.toString(), dwsitflags.toInt()) as Int) else 0

public actual fun DwmSetPresentParameters(hwnd: HWND, ppresentparams: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmSetPresentParameters(hwnd.toString(), ppresentparams.toString()) as Int) else 0

public actual fun DwmSetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmSetWindowAttribute(hwnd.toString(), dwattribute.toInt(), pvattribute.toString(), cbattribute.toInt()) as Int) else 0

public actual fun DwmShowContact(dwpointerid: UInt, eshowcontact: DWM_SHOWCONTACT): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmShowContact(dwpointerid.toInt(), eshowcontact.toInt()) as Int) else 0

public actual fun DwmTetherContact(dwpointerid: UInt, fenable: BOOL, pttether: POINT): HRESULT =
    0

public actual fun DwmTransitionOwnedWindow(hwnd: HWND, target: DWMTRANSITION_OWNEDWINDOW_TARGET): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmTransitionOwnedWindow(hwnd.toString(), target) as Int) else 0

public actual fun DwmUnregisterThumbnail(hthumbnailid: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmUnregisterThumbnail(hthumbnailid.toString()) as Int) else 0

public actual fun DwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: Long): HRESULT =
    if (_windowsWin32GraphicsDwmNapiAddon != null) (_windowsWin32GraphicsDwmNapiAddon.windowssys_windows_win32_graphics_dwm_DwmUpdateThumbnailProperties(hthumbnailid.toString(), ptnproperties.toString()) as Int) else 0
