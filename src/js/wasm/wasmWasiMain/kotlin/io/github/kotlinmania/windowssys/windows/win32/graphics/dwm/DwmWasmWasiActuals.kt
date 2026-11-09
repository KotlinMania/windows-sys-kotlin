@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP

public actual fun DwmAttachMilContent(hwnd: HWND): HRESULT =
    0

public actual fun DwmDefWindowProc(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, plresult: Long): BOOL =
    0

public actual fun DwmDetachMilContent(hwnd: HWND): HRESULT =
    0

public actual fun DwmEnableBlurBehindWindow(hwnd: HWND, pblurbehind: Long): HRESULT =
    0

public actual fun DwmEnableComposition(ucompositionaction: UInt): HRESULT =
    0

public actual fun DwmEnableMMCSS(fenablemmcss: BOOL): HRESULT =
    0

public actual fun DwmExtendFrameIntoClientArea(hwnd: HWND, pmarinset: Long): HRESULT =
    0

public actual fun DwmFlush(): HRESULT =
    0

public actual fun DwmGetColorizationColor(pcrcolorization: Long, pfopaqueblend: Long): HRESULT =
    0

public actual fun DwmGetCompositionTimingInfo(hwnd: HWND, ptiminginfo: Long): HRESULT =
    0

public actual fun DwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: Long): HRESULT =
    0

public actual fun DwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: Long): HRESULT =
    0

public actual fun DwmGetTransportAttributes(pfisremoting: Long, pfisconnected: Long, pdwgeneration: Long): HRESULT =
    0

public actual fun DwmGetUnmetTabRequirements(appwindow: HWND, value: Long): HRESULT =
    0

public actual fun DwmGetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT =
    0

public actual fun DwmInvalidateIconicBitmaps(hwnd: HWND): HRESULT =
    0

public actual fun DwmIsCompositionEnabled(pfenabled: Long): HRESULT =
    0

public actual fun DwmModifyPreviousDxFrameDuration(hwnd: HWND, crefreshes: Int, frelative: BOOL): HRESULT =
    0

public actual fun DwmQueryThumbnailSourceSize(hthumbnail: Long, psize: Long): HRESULT =
    0

public actual fun DwmRegisterThumbnail(hwnddestination: HWND, hwndsource: HWND, phthumbnailid: Long): HRESULT =
    0

public actual fun DwmRenderGesture(gt: GESTURE_TYPE, ccontacts: UInt, pdwpointerid: Long, ppoints: Long): HRESULT =
    0

public actual fun DwmSetDxFrameDuration(hwnd: HWND, crefreshes: Int): HRESULT =
    0

public actual fun DwmSetIconicLivePreviewBitmap(hwnd: HWND, hbmp: HBITMAP, pptclient: Long, dwsitflags: UInt): HRESULT =
    0

public actual fun DwmSetIconicThumbnail(hwnd: HWND, hbmp: HBITMAP, dwsitflags: UInt): HRESULT =
    0

public actual fun DwmSetPresentParameters(hwnd: HWND, ppresentparams: Long): HRESULT =
    0

public actual fun DwmSetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT =
    0

public actual fun DwmShowContact(dwpointerid: UInt, eshowcontact: DWM_SHOWCONTACT): HRESULT =
    0

public actual fun DwmTetherContact(dwpointerid: UInt, fenable: BOOL, pttether: POINT): HRESULT =
    0

public actual fun DwmTransitionOwnedWindow(hwnd: HWND, target: DWMTRANSITION_OWNEDWINDOW_TARGET): HRESULT =
    0

public actual fun DwmUnregisterThumbnail(hthumbnailid: Long): HRESULT =
    0

public actual fun DwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: Long): HRESULT =
    0
