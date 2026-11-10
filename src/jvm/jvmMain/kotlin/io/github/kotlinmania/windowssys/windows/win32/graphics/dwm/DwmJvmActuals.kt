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

private object WindowsWin32GraphicsDwmJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmAttachMilContent(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmDefWindowProc(hwnd: Long, msg: Int, wparam: Long, lparam: Long, plresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmDetachMilContent(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmEnableBlurBehindWindow(hwnd: Long, pblurbehind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmEnableComposition(ucompositionaction: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmEnableMMCSS(fenablemmcss: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmExtendFrameIntoClientArea(hwnd: Long, pmarinset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmFlush(): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmGetColorizationColor(pcrcolorization: Long, pfopaqueblend: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmGetCompositionTimingInfo(hwnd: Long, ptiminginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamClient(uindex: Int, pclientuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamTransformHint(uindex: Int, ptransform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmGetTransportAttributes(pfisremoting: Long, pfisconnected: Long, pdwgeneration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmGetUnmetTabRequirements(appwindow: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmGetWindowAttribute(hwnd: Long, dwattribute: Int, pvattribute: Long, cbattribute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmInvalidateIconicBitmaps(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmIsCompositionEnabled(pfenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmModifyPreviousDxFrameDuration(hwnd: Long, crefreshes: Int, frelative: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmRegisterThumbnail(hwnddestination: Long, hwndsource: Long, phthumbnailid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmRenderGesture(gt: Int, ccontacts: Int, pdwpointerid: Long, ppoints: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmSetDxFrameDuration(hwnd: Long, crefreshes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmSetIconicLivePreviewBitmap(hwnd: Long, hbmp: Long, pptclient: Long, dwsitflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmSetIconicThumbnail(hwnd: Long, hbmp: Long, dwsitflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmSetPresentParameters(hwnd: Long, ppresentparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmSetWindowAttribute(hwnd: Long, dwattribute: Int, pvattribute: Long, cbattribute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmShowContact(dwpointerid: Int, eshowcontact: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmTransitionOwnedWindow(hwnd: Long, target: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmUnregisterThumbnail(hthumbnailid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_dwm_dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: Long): Int
}

public actual fun dwmAttachMilContent(hwnd: Hwnd): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmAttachMilContent((hwnd?.value ?: 0L))

public actual fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: COpaquePointer?): Bool =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmDefWindowProc((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam, (plresult?.value ?: 0L))

public actual fun dwmDetachMilContent(hwnd: Hwnd): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmDetachMilContent((hwnd?.value ?: 0L))

public actual fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmEnableBlurBehindWindow((hwnd?.value ?: 0L), (pblurbehind?.value ?: 0L))

public actual fun dwmEnableComposition(ucompositionaction: UInt): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmEnableComposition(ucompositionaction.toInt())

public actual fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmEnableMMCSS(fenablemmcss)

public actual fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmExtendFrameIntoClientArea((hwnd?.value ?: 0L), (pmarinset?.value ?: 0L))

public actual fun dwmFlush(): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmFlush()

public actual fun dwmGetColorizationColor(pcrcolorization: COpaquePointer?, pfopaqueblend: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmGetColorizationColor((pcrcolorization?.value ?: 0L), (pfopaqueblend?.value ?: 0L))

public actual fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmGetCompositionTimingInfo((hwnd?.value ?: 0L), (ptiminginfo?.value ?: 0L))

public actual fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamClient(uindex.toInt(), (pclientuuid?.value ?: 0L))

public actual fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamTransformHint(uindex.toInt(), (ptransform?.value ?: 0L))

public actual fun dwmGetTransportAttributes(pfisremoting: COpaquePointer?, pfisconnected: COpaquePointer?, pdwgeneration: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmGetTransportAttributes((pfisremoting?.value ?: 0L), (pfisconnected?.value ?: 0L), (pdwgeneration?.value ?: 0L))

public actual fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmGetUnmetTabRequirements((appwindow?.value ?: 0L), (value?.value ?: 0L))

public actual fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmGetWindowAttribute((hwnd?.value ?: 0L), dwattribute.toInt(), (pvattribute?.value ?: 0L), cbattribute.toInt())

public actual fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmInvalidateIconicBitmaps((hwnd?.value ?: 0L))

public actual fun dwmIsCompositionEnabled(pfenabled: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmIsCompositionEnabled((pfenabled?.value ?: 0L))

public actual fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmModifyPreviousDxFrameDuration((hwnd?.value ?: 0L), crefreshes, frelative)

public actual fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmQueryThumbnailSourceSize(hthumbnail, (psize?.value ?: 0L))

public actual fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmRegisterThumbnail((hwnddestination?.value ?: 0L), (hwndsource?.value ?: 0L), (phthumbnailid?.value ?: 0L))

public actual fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: COpaquePointer?, ppoints: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmRenderGesture(gt, ccontacts.toInt(), (pdwpointerid?.value ?: 0L), (ppoints?.value ?: 0L))

public actual fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmSetDxFrameDuration((hwnd?.value ?: 0L), crefreshes)

public actual fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: COpaquePointer?, dwsitflags: UInt): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmSetIconicLivePreviewBitmap((hwnd?.value ?: 0L), (hbmp?.value ?: 0L), (pptclient?.value ?: 0L), dwsitflags.toInt())

public actual fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmSetIconicThumbnail((hwnd?.value ?: 0L), (hbmp?.value ?: 0L), dwsitflags.toInt())

public actual fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmSetPresentParameters((hwnd?.value ?: 0L), (ppresentparams?.value ?: 0L))

public actual fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmSetWindowAttribute((hwnd?.value ?: 0L), dwattribute.toInt(), (pvattribute?.value ?: 0L), cbattribute.toInt())

public actual fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmShowContact(dwpointerid.toInt(), eshowcontact.toInt())

public actual fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult =
    0

public actual fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmTransitionOwnedWindow((hwnd?.value ?: 0L), target)

public actual fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmUnregisterThumbnail(hthumbnailid)

public actual fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: COpaquePointer?): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssys_windows_win32_graphics_dwm_dwmUpdateThumbnailProperties(hthumbnailid, (ptnproperties?.value ?: 0L))
