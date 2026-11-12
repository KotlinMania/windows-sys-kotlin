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

private object WindowsWin32GraphicsDwmJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmAttachMilContent(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmDefWindowProc(hwnd: Long, msg: Int, wparam: Long, lparam: Long, plresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmDetachMilContent(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow(hwnd: Long, pblurbehind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmEnableComposition(ucompositionaction: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(fenablemmcss: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea(hwnd: Long, pmarinset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmFlush(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmGetColorizationColor(pcrcolorization: Long, pfopaqueblend: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo(hwnd: Long, ptiminginfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient(uindex: Int, pclientuuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint(uindex: Int, ptransform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes(pfisremoting: Long, pfisconnected: Long, pdwgeneration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements(appwindow: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute(hwnd: Long, dwattribute: Int, pvattribute: Long, cbattribute: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled(pfenabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration(hwnd: Long, crefreshes: Int, frelative: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize(hthumbnail: Long, psize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail(hwnddestination: Long, hwndsource: Long, phthumbnailid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmRenderGesture(gt: Int, ccontacts: Int, pdwpointerid: Long, ppoints: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration(hwnd: Long, crefreshes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap(hwnd: Long, hbmp: Long, pptclient: Long, dwsitflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail(hwnd: Long, hbmp: Long, dwsitflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmSetPresentParameters(hwnd: Long, ppresentparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute(hwnd: Long, dwattribute: Int, pvattribute: Long, cbattribute: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmShowContact(dwpointerid: Int, eshowcontact: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow(hwnd: Long, target: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(hthumbnailid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: Long): Int
}

public actual fun dwmAttachMilContent(hwnd: Hwnd): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmAttachMilContent(hwnd.rawAddress)

public actual fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: MutPtr<Lresult>): Bool =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmDefWindowProc(hwnd.rawAddress, msg.toInt(), wparam.toLong(), lparam, plresult.rawAddress)

public actual fun dwmDetachMilContent(hwnd: Hwnd): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmDetachMilContent(hwnd.rawAddress)

public actual fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: ConstPtr<DwmBlurbehind>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow(hwnd.rawAddress, pblurbehind.rawAddress)

public actual fun dwmEnableComposition(ucompositionaction: UInt): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmEnableComposition(ucompositionaction.toInt())

public actual fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(fenablemmcss)

public actual fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: ConstPtr<Margins>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea(hwnd.rawAddress, pmarinset.rawAddress)

public actual fun dwmFlush(): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmFlush()

public actual fun dwmGetColorizationColor(pcrcolorization: MutPtr<UInt>, pfopaqueblend: MutPtr<Bool>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmGetColorizationColor(pcrcolorization.rawAddress, pfopaqueblend.rawAddress)

public actual fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: MutPtr<DwmTimingInfo>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo(hwnd.rawAddress, ptiminginfo.rawAddress)

public actual fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: MutPtr<Guid>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient(uindex.toInt(), pclientuuid.rawAddress)

public actual fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: MutPtr<MilMatrix3x2D>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint(uindex.toInt(), ptransform.rawAddress)

public actual fun dwmGetTransportAttributes(pfisremoting: MutPtr<Bool>, pfisconnected: MutPtr<Bool>, pdwgeneration: MutPtr<UInt>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes(pfisremoting.rawAddress, pfisconnected.rawAddress, pdwgeneration.rawAddress)

public actual fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: MutPtr<DwmTabWindowRequirements>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements(appwindow.rawAddress, value.rawAddress)

public actual fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: MutPtr<CVoid>, cbattribute: UInt): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute(hwnd.rawAddress, dwattribute.toInt(), pvattribute.rawAddress, cbattribute.toInt())

public actual fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps(hwnd.rawAddress)

public actual fun dwmIsCompositionEnabled(pfenabled: MutPtr<Bool>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled(pfenabled.rawAddress)

public actual fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration(hwnd.rawAddress, crefreshes, frelative)

public actual fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: MutPtr<Size>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize(hthumbnail, psize.rawAddress)

public actual fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: MutPtr<Long>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail(hwnddestination.rawAddress, hwndsource.rawAddress, phthumbnailid.rawAddress)

public actual fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: ConstPtr<UInt>, ppoints: ConstPtr<Point>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmRenderGesture(gt, ccontacts.toInt(), pdwpointerid.rawAddress, ppoints.rawAddress)

public actual fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration(hwnd.rawAddress, crefreshes)

public actual fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: ConstPtr<Point>, dwsitflags: UInt): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap(hwnd.rawAddress, hbmp.rawAddress, pptclient.rawAddress, dwsitflags.toInt())

public actual fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail(hwnd.rawAddress, hbmp.rawAddress, dwsitflags.toInt())

public actual fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: MutPtr<DwmPresentParameters>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmSetPresentParameters(hwnd.rawAddress, ppresentparams.rawAddress)

public actual fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: ConstPtr<CVoid>, cbattribute: UInt): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute(hwnd.rawAddress, dwattribute.toInt(), pvattribute.rawAddress, cbattribute.toInt())

public actual fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmShowContact(dwpointerid.toInt(), eshowcontact.toInt())

public actual fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult =
    0

public actual fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow(hwnd.rawAddress, target)

public actual fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(hthumbnailid)

public actual fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: ConstPtr<DwmThumbnailProperties>): Hresult =
    WindowsWin32GraphicsDwmJniBridge.windowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties(hthumbnailid, ptnproperties.rawAddress)
