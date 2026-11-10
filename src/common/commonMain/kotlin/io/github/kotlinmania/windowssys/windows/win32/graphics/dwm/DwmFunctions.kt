package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap

public expect fun dwmAttachMilContent(hwnd: Hwnd): Hresult

public expect fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: COpaquePointer?): Bool

public expect fun dwmDetachMilContent(hwnd: Hwnd): Hresult

public expect fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: COpaquePointer?): Hresult

public expect fun dwmEnableComposition(ucompositionaction: UInt): Hresult

public expect fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult

public expect fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: COpaquePointer?): Hresult

public expect fun dwmFlush(): Hresult

public expect fun dwmGetColorizationColor(pcrcolorization: COpaquePointer?, pfopaqueblend: COpaquePointer?): Hresult

public expect fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: COpaquePointer?): Hresult

public expect fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: COpaquePointer?): Hresult

public expect fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: COpaquePointer?): Hresult

public expect fun dwmGetTransportAttributes(pfisremoting: COpaquePointer?, pfisconnected: COpaquePointer?, pdwgeneration: COpaquePointer?): Hresult

public expect fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: COpaquePointer?): Hresult

public expect fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult

public expect fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult

public expect fun dwmIsCompositionEnabled(pfenabled: COpaquePointer?): Hresult

public expect fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult

public expect fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: COpaquePointer?): Hresult

public expect fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: COpaquePointer?): Hresult

public expect fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: COpaquePointer?, ppoints: COpaquePointer?): Hresult

public expect fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult

public expect fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: COpaquePointer?, dwsitflags: UInt): Hresult

public expect fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult

public expect fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: COpaquePointer?): Hresult

public expect fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult

public expect fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult

public expect fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult

public expect fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult

public expect fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult

public expect fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: COpaquePointer?): Hresult
