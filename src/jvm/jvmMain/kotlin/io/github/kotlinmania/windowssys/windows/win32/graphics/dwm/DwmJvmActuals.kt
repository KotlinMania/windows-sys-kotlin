@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP

private object WindowsWin32GraphicsDwmJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmAttachMilContent(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmDefWindowProc(hwnd: Long, msg: Int, wparam: Long, lparam: Long, plresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmDetachMilContent(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmEnableBlurBehindWindow(hwnd: Long, pblurbehind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmEnableComposition(ucompositionaction: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmEnableMMCSS(fenablemmcss: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmExtendFrameIntoClientArea(hwnd: Long, pmarinset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmFlush(): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmGetColorizationColor(pcrcolorization: Long, pfopaqueblend: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmGetCompositionTimingInfo(hwnd: Long, ptiminginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmGetGraphicsStreamClient(uindex: Int, pclientuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmGetGraphicsStreamTransformHint(uindex: Int, ptransform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmGetTransportAttributes(pfisremoting: Long, pfisconnected: Long, pdwgeneration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmGetUnmetTabRequirements(appwindow: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmGetWindowAttribute(hwnd: Long, dwattribute: Int, pvattribute: Long, cbattribute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmInvalidateIconicBitmaps(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmIsCompositionEnabled(pfenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmModifyPreviousDxFrameDuration(hwnd: Long, crefreshes: Int, frelative: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmQueryThumbnailSourceSize(hthumbnail: Long, psize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmRegisterThumbnail(hwnddestination: Long, hwndsource: Long, phthumbnailid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmRenderGesture(gt: Int, ccontacts: Int, pdwpointerid: Long, ppoints: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmSetDxFrameDuration(hwnd: Long, crefreshes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmSetIconicLivePreviewBitmap(hwnd: Long, hbmp: Long, pptclient: Long, dwsitflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmSetIconicThumbnail(hwnd: Long, hbmp: Long, dwsitflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmSetPresentParameters(hwnd: Long, ppresentparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmSetWindowAttribute(hwnd: Long, dwattribute: Int, pvattribute: Long, cbattribute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmShowContact(dwpointerid: Int, eshowcontact: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmTransitionOwnedWindow(hwnd: Long, target: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmUnregisterThumbnail(hthumbnailid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_DwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: Long): Int
}

public actual fun DwmAttachMilContent(hwnd: HWND): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmAttachMilContent(hwnd)

public actual fun DwmDefWindowProc(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, plresult: Long): BOOL =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmDefWindowProc(hwnd, msg.toInt(), wparam.toLong(), lparam, plresult)

public actual fun DwmDetachMilContent(hwnd: HWND): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmDetachMilContent(hwnd)

public actual fun DwmEnableBlurBehindWindow(hwnd: HWND, pblurbehind: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmEnableBlurBehindWindow(hwnd, pblurbehind)

public actual fun DwmEnableComposition(ucompositionaction: UInt): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmEnableComposition(ucompositionaction.toInt())

public actual fun DwmEnableMMCSS(fenablemmcss: BOOL): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmEnableMMCSS(fenablemmcss)

public actual fun DwmExtendFrameIntoClientArea(hwnd: HWND, pmarinset: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmExtendFrameIntoClientArea(hwnd, pmarinset)

public actual fun DwmFlush(): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmFlush()

public actual fun DwmGetColorizationColor(pcrcolorization: Long, pfopaqueblend: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmGetColorizationColor(pcrcolorization, pfopaqueblend)

public actual fun DwmGetCompositionTimingInfo(hwnd: HWND, ptiminginfo: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmGetCompositionTimingInfo(hwnd, ptiminginfo)

public actual fun DwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmGetGraphicsStreamClient(uindex.toInt(), pclientuuid)

public actual fun DwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmGetGraphicsStreamTransformHint(uindex.toInt(), ptransform)

public actual fun DwmGetTransportAttributes(pfisremoting: Long, pfisconnected: Long, pdwgeneration: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmGetTransportAttributes(pfisremoting, pfisconnected, pdwgeneration)

public actual fun DwmGetUnmetTabRequirements(appwindow: HWND, value: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmGetUnmetTabRequirements(appwindow, value)

public actual fun DwmGetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmGetWindowAttribute(hwnd, dwattribute.toInt(), pvattribute, cbattribute.toInt())

public actual fun DwmInvalidateIconicBitmaps(hwnd: HWND): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmInvalidateIconicBitmaps(hwnd)

public actual fun DwmIsCompositionEnabled(pfenabled: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmIsCompositionEnabled(pfenabled)

public actual fun DwmModifyPreviousDxFrameDuration(hwnd: HWND, crefreshes: Int, frelative: BOOL): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmModifyPreviousDxFrameDuration(hwnd, crefreshes, frelative)

public actual fun DwmQueryThumbnailSourceSize(hthumbnail: Long, psize: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmQueryThumbnailSourceSize(hthumbnail, psize)

public actual fun DwmRegisterThumbnail(hwnddestination: HWND, hwndsource: HWND, phthumbnailid: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmRegisterThumbnail(hwnddestination, hwndsource, phthumbnailid)

public actual fun DwmRenderGesture(gt: GESTURE_TYPE, ccontacts: UInt, pdwpointerid: Long, ppoints: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmRenderGesture(gt, ccontacts.toInt(), pdwpointerid, ppoints)

public actual fun DwmSetDxFrameDuration(hwnd: HWND, crefreshes: Int): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmSetDxFrameDuration(hwnd, crefreshes)

public actual fun DwmSetIconicLivePreviewBitmap(hwnd: HWND, hbmp: HBITMAP, pptclient: Long, dwsitflags: UInt): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmSetIconicLivePreviewBitmap(hwnd, hbmp, pptclient, dwsitflags.toInt())

public actual fun DwmSetIconicThumbnail(hwnd: HWND, hbmp: HBITMAP, dwsitflags: UInt): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmSetIconicThumbnail(hwnd, hbmp, dwsitflags.toInt())

public actual fun DwmSetPresentParameters(hwnd: HWND, ppresentparams: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmSetPresentParameters(hwnd, ppresentparams)

public actual fun DwmSetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmSetWindowAttribute(hwnd, dwattribute.toInt(), pvattribute, cbattribute.toInt())

public actual fun DwmShowContact(dwpointerid: UInt, eshowcontact: DWM_SHOWCONTACT): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmShowContact(dwpointerid.toInt(), eshowcontact.toInt())

public actual fun DwmTetherContact(dwpointerid: UInt, fenable: BOOL, pttether: POINT): HRESULT =
    0

public actual fun DwmTransitionOwnedWindow(hwnd: HWND, target: DWMTRANSITION_OWNEDWINDOW_TARGET): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmTransitionOwnedWindow(hwnd, target)

public actual fun DwmUnregisterThumbnail(hthumbnailid: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmUnregisterThumbnail(hthumbnailid)

public actual fun DwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: Long): HRESULT =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_DwmUpdateThumbnailProperties(hthumbnailid, ptnproperties)
