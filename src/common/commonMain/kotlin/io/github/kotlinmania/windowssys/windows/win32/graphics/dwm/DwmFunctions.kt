package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

public fun DwmAttachMilContent(hwnd: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmAttachMilContent", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun DwmDefWindowProc(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, plresult: Long): BOOL {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmDefWindowProc", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam), plresult)).toInt()
}

public fun DwmDetachMilContent(hwnd: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmDetachMilContent", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun DwmEnableBlurBehindWindow(hwnd: Foundation.HWND, pblurbehind: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmEnableBlurBehindWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pblurbehind)).toInt()
}

public fun DwmEnableComposition(ucompositionaction: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmEnableComposition", longArrayOf(ucompositionaction.toLong())).toInt()
}

public fun DwmEnableMMCSS(fenablemmcss: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmEnableMMCSS", longArrayOf(fenablemmcss.toLong())).toInt()
}

public fun DwmExtendFrameIntoClientArea(hwnd: Foundation.HWND, pmarinset: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmExtendFrameIntoClientArea", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pmarinset)).toInt()
}

public fun DwmFlush(): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmFlush", longArrayOf()).toInt()
}

public fun DwmGetColorizationColor(pcrcolorization: Long, pfopaqueblend: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetColorizationColor", longArrayOf(pcrcolorization, pfopaqueblend)).toInt()
}

public fun DwmGetCompositionTimingInfo(hwnd: Foundation.HWND, ptiminginfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetCompositionTimingInfo", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ptiminginfo)).toInt()
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

public fun DwmGetUnmetTabRequirements(appwindow: Foundation.HWND, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetUnmetTabRequirements", longArrayOf(Win32DynamicFfi.objectSlot(appwindow), value)).toInt()
}

public fun DwmGetWindowAttribute(hwnd: Foundation.HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmGetWindowAttribute", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwattribute.toLong(), pvattribute, cbattribute.toLong())).toInt()
}

public fun DwmInvalidateIconicBitmaps(hwnd: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmInvalidateIconicBitmaps", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun DwmIsCompositionEnabled(pfenabled: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmIsCompositionEnabled", longArrayOf(pfenabled)).toInt()
}

public fun DwmModifyPreviousDxFrameDuration(hwnd: Foundation.HWND, crefreshes: Int, frelative: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmModifyPreviousDxFrameDuration", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), crefreshes.toLong(), frelative.toLong())).toInt()
}

public fun DwmQueryThumbnailSourceSize(hthumbnail: Long, psize: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmQueryThumbnailSourceSize", longArrayOf(hthumbnail, psize)).toInt()
}

public fun DwmRegisterThumbnail(hwnddestination: Foundation.HWND, hwndsource: Foundation.HWND, phthumbnailid: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmRegisterThumbnail", longArrayOf(Win32DynamicFfi.objectSlot(hwnddestination), Win32DynamicFfi.objectSlot(hwndsource), phthumbnailid)).toInt()
}

public fun DwmRenderGesture(gt: GESTURE_TYPE, ccontacts: UInt, pdwpointerid: Long, ppoints: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmRenderGesture", longArrayOf(gt.toLong(), ccontacts.toLong(), pdwpointerid, ppoints)).toInt()
}

public fun DwmSetDxFrameDuration(hwnd: Foundation.HWND, crefreshes: Int): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmSetDxFrameDuration", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), crefreshes.toLong())).toInt()
}

public fun DwmSetIconicLivePreviewBitmap(hwnd: Foundation.HWND, hbmp: Gdi.HBITMAP, pptclient: Long, dwsitflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmSetIconicLivePreviewBitmap", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hbmp), pptclient, dwsitflags.toLong())).toInt()
}

public fun DwmSetIconicThumbnail(hwnd: Foundation.HWND, hbmp: Gdi.HBITMAP, dwsitflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmSetIconicThumbnail", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hbmp), dwsitflags.toLong())).toInt()
}

public fun DwmSetPresentParameters(hwnd: Foundation.HWND, ppresentparams: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmSetPresentParameters", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ppresentparams)).toInt()
}

public fun DwmSetWindowAttribute(hwnd: Foundation.HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmSetWindowAttribute", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwattribute.toLong(), pvattribute, cbattribute.toLong())).toInt()
}

public fun DwmShowContact(dwpointerid: UInt, eshowcontact: DWM_SHOWCONTACT): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmShowContact", longArrayOf(dwpointerid.toLong(), eshowcontact.toLong())).toInt()
}

public fun DwmTetherContact(dwpointerid: UInt, fenable: BOOL, pttether: Foundation.POINT): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmTetherContact", longArrayOf(dwpointerid.toLong(), fenable.toLong(), Win32DynamicFfi.objectSlot(pttether))).toInt()
}

public fun DwmTransitionOwnedWindow(hwnd: Foundation.HWND, target: DWMTRANSITION_OWNEDWINDOW_TARGET): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmTransitionOwnedWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), target.toLong())).toInt()
}

public fun DwmUnregisterThumbnail(hthumbnailid: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmUnregisterThumbnail", longArrayOf(hthumbnailid)).toInt()
}

public fun DwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: Long): HRESULT {
    return Win32DynamicFfi.invoke("dwmapi.dll", "DwmUpdateThumbnailProperties", longArrayOf(hthumbnailid, ptnproperties)).toInt()
}
