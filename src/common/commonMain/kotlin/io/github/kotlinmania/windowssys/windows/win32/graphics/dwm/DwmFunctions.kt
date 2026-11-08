package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP

public fun DwmAttachMilContent(hwnd: HWND): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmAttachMilContent", longArrayOf(hwnd)).toInt()
}

public fun DwmDefWindowProc(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, plresult: Long): BOOL {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmDefWindowProc", longArrayOf(hwnd, msg.toLong(), wparam.toLong(), lparam, plresult)).toInt()
}

public fun DwmDetachMilContent(hwnd: HWND): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmDetachMilContent", longArrayOf(hwnd)).toInt()
}

public fun DwmEnableBlurBehindWindow(hwnd: HWND, pblurbehind: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmEnableBlurBehindWindow", longArrayOf(hwnd, pblurbehind)).toInt()
}

public fun DwmEnableComposition(ucompositionaction: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmEnableComposition", longArrayOf(ucompositionaction.toLong())).toInt()
}

public fun DwmEnableMMCSS(fenablemmcss: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmEnableMMCSS", longArrayOf(fenablemmcss.toLong())).toInt()
}

public fun DwmExtendFrameIntoClientArea(hwnd: HWND, pmarinset: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmExtendFrameIntoClientArea", longArrayOf(hwnd, pmarinset)).toInt()
}

public fun DwmFlush(): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmFlush", longArrayOf()).toInt()
}

public fun DwmGetColorizationColor(pcrcolorization: Long, pfopaqueblend: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetColorizationColor", longArrayOf(pcrcolorization, pfopaqueblend)).toInt()
}

public fun DwmGetCompositionTimingInfo(hwnd: HWND, ptiminginfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetCompositionTimingInfo", longArrayOf(hwnd, ptiminginfo)).toInt()
}

public fun DwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetGraphicsStreamClient", longArrayOf(uindex.toLong(), pclientuuid)).toInt()
}

public fun DwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetGraphicsStreamTransformHint", longArrayOf(uindex.toLong(), ptransform)).toInt()
}

public fun DwmGetTransportAttributes(pfisremoting: Long, pfisconnected: Long, pdwgeneration: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetTransportAttributes", longArrayOf(pfisremoting, pfisconnected, pdwgeneration)).toInt()
}

public fun DwmGetUnmetTabRequirements(appwindow: HWND, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetUnmetTabRequirements", longArrayOf(appwindow, value)).toInt()
}

public fun DwmGetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetWindowAttribute", longArrayOf(hwnd, dwattribute.toLong(), pvattribute, cbattribute.toLong())).toInt()
}

public fun DwmInvalidateIconicBitmaps(hwnd: HWND): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmInvalidateIconicBitmaps", longArrayOf(hwnd)).toInt()
}

public fun DwmIsCompositionEnabled(pfenabled: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmIsCompositionEnabled", longArrayOf(pfenabled)).toInt()
}

public fun DwmModifyPreviousDxFrameDuration(hwnd: HWND, crefreshes: Int, frelative: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmModifyPreviousDxFrameDuration", longArrayOf(hwnd, crefreshes.toLong(), frelative.toLong())).toInt()
}

public fun DwmQueryThumbnailSourceSize(hthumbnail: Long, psize: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmQueryThumbnailSourceSize", longArrayOf(hthumbnail, psize)).toInt()
}

public fun DwmRegisterThumbnail(hwnddestination: HWND, hwndsource: HWND, phthumbnailid: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmRegisterThumbnail", longArrayOf(hwnddestination, hwndsource, phthumbnailid)).toInt()
}

public fun DwmRenderGesture(gt: GESTURE_TYPE, ccontacts: UInt, pdwpointerid: Long, ppoints: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmRenderGesture", longArrayOf(gt.toLong(), ccontacts.toLong(), pdwpointerid, ppoints)).toInt()
}

public fun DwmSetDxFrameDuration(hwnd: HWND, crefreshes: Int): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmSetDxFrameDuration", longArrayOf(hwnd, crefreshes.toLong())).toInt()
}

public fun DwmSetIconicLivePreviewBitmap(hwnd: HWND, hbmp: HBITMAP, pptclient: Long, dwsitflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmSetIconicLivePreviewBitmap", longArrayOf(hwnd, hbmp, pptclient, dwsitflags.toLong())).toInt()
}

public fun DwmSetIconicThumbnail(hwnd: HWND, hbmp: HBITMAP, dwsitflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmSetIconicThumbnail", longArrayOf(hwnd, hbmp, dwsitflags.toLong())).toInt()
}

public fun DwmSetPresentParameters(hwnd: HWND, ppresentparams: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmSetPresentParameters", longArrayOf(hwnd, ppresentparams)).toInt()
}

public fun DwmSetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmSetWindowAttribute", longArrayOf(hwnd, dwattribute.toLong(), pvattribute, cbattribute.toLong())).toInt()
}

public fun DwmShowContact(dwpointerid: UInt, eshowcontact: DWM_SHOWCONTACT): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmShowContact", longArrayOf(dwpointerid.toLong(), eshowcontact.toLong())).toInt()
}

public fun DwmTetherContact(dwpointerid: UInt, fenable: BOOL, pttether: POINT): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmTetherContact", longArrayOf(dwpointerid.toLong(), fenable.toLong(), ((pttether.x.toLong() and 0xFFFF_FFFFL) or ((pttether.y.toLong() and 0xFFFF_FFFFL) shl 32)))).toInt()
}

public fun DwmTransitionOwnedWindow(hwnd: HWND, target: DWMTRANSITION_OWNEDWINDOW_TARGET): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmTransitionOwnedWindow", longArrayOf(hwnd, target.toLong())).toInt()
}

public fun DwmUnregisterThumbnail(hthumbnailid: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmUnregisterThumbnail", longArrayOf(hthumbnailid)).toInt()
}

public fun DwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmUpdateThumbnailProperties", longArrayOf(hthumbnailid, ptnproperties)).toInt()
}
