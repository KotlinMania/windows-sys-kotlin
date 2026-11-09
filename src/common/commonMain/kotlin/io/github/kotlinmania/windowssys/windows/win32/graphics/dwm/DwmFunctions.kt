package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP

public expect fun DwmAttachMilContent(hwnd: HWND): HRESULT

public expect fun DwmDefWindowProc(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, plresult: Long): BOOL

public expect fun DwmDetachMilContent(hwnd: HWND): HRESULT

public expect fun DwmEnableBlurBehindWindow(hwnd: HWND, pblurbehind: Long): HRESULT

public expect fun DwmEnableComposition(ucompositionaction: UInt): HRESULT

public expect fun DwmEnableMMCSS(fenablemmcss: BOOL): HRESULT

public expect fun DwmExtendFrameIntoClientArea(hwnd: HWND, pmarinset: Long): HRESULT

public expect fun DwmFlush(): HRESULT

public expect fun DwmGetColorizationColor(pcrcolorization: Long, pfopaqueblend: Long): HRESULT

public expect fun DwmGetCompositionTimingInfo(hwnd: HWND, ptiminginfo: Long): HRESULT

public expect fun DwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: Long): HRESULT

public expect fun DwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: Long): HRESULT

public expect fun DwmGetTransportAttributes(pfisremoting: Long, pfisconnected: Long, pdwgeneration: Long): HRESULT

public expect fun DwmGetUnmetTabRequirements(appwindow: HWND, value: Long): HRESULT

public expect fun DwmGetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT

public expect fun DwmInvalidateIconicBitmaps(hwnd: HWND): HRESULT

public expect fun DwmIsCompositionEnabled(pfenabled: Long): HRESULT

public expect fun DwmModifyPreviousDxFrameDuration(hwnd: HWND, crefreshes: Int, frelative: BOOL): HRESULT

public expect fun DwmQueryThumbnailSourceSize(hthumbnail: Long, psize: Long): HRESULT

public expect fun DwmRegisterThumbnail(hwnddestination: HWND, hwndsource: HWND, phthumbnailid: Long): HRESULT

public expect fun DwmRenderGesture(gt: GESTURE_TYPE, ccontacts: UInt, pdwpointerid: Long, ppoints: Long): HRESULT

public expect fun DwmSetDxFrameDuration(hwnd: HWND, crefreshes: Int): HRESULT

public expect fun DwmSetIconicLivePreviewBitmap(hwnd: HWND, hbmp: HBITMAP, pptclient: Long, dwsitflags: UInt): HRESULT

public expect fun DwmSetIconicThumbnail(hwnd: HWND, hbmp: HBITMAP, dwsitflags: UInt): HRESULT

public expect fun DwmSetPresentParameters(hwnd: HWND, ppresentparams: Long): HRESULT

public expect fun DwmSetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT

public expect fun DwmShowContact(dwpointerid: UInt, eshowcontact: DWM_SHOWCONTACT): HRESULT

public expect fun DwmTetherContact(dwpointerid: UInt, fenable: BOOL, pttether: POINT): HRESULT

public expect fun DwmTransitionOwnedWindow(hwnd: HWND, target: DWMTRANSITION_OWNEDWINDOW_TARGET): HRESULT

public expect fun DwmUnregisterThumbnail(hthumbnailid: Long): HRESULT

public expect fun DwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: Long): HRESULT
