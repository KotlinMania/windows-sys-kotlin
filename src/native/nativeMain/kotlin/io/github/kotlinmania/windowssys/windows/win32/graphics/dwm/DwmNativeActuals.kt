@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmAttachMilContent
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmDefWindowProc
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmDetachMilContent
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmEnableComposition
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmEnableMMCSS
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmFlush
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmGetColorizationColor
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmRenderGesture
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmSetPresentParameters
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmShowContact
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail
import io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Margins
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dwmAttachMilContent(hwnd: Hwnd): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmAttachMilContent(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: MutPtr<Lresult>): Bool =
    windowssysWindowsWin32GraphicsDwmDwmDefWindowProc(hwnd.rawAddress.toCPointer<ByteVar>(), msg, wparam, lparam, plresult.rawAddress.toCPointer<ByteVar>())

public actual fun dwmDetachMilContent(hwnd: Hwnd): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmDetachMilContent(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: ConstPtr<DwmBlurbehind>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow(hwnd.rawAddress.toCPointer<ByteVar>(), pblurbehind.rawAddress.toCPointer<ByteVar>())

public actual fun dwmEnableComposition(ucompositionaction: UInt): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmEnableComposition(ucompositionaction)

public actual fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(fenablemmcss)

public actual fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: ConstPtr<Margins>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea(hwnd.rawAddress.toCPointer<ByteVar>(), pmarinset.rawAddress.toCPointer<ByteVar>())

public actual fun dwmFlush(): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmFlush()

public actual fun dwmGetColorizationColor(pcrcolorization: MutPtr<UInt>, pfopaqueblend: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmGetColorizationColor(pcrcolorization.rawAddress.toCPointer<ByteVar>(), pfopaqueblend.rawAddress.toCPointer<ByteVar>())

public actual fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: MutPtr<DwmTimingInfo>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo(hwnd.rawAddress.toCPointer<ByteVar>(), ptiminginfo.rawAddress.toCPointer<ByteVar>())

public actual fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: MutPtr<Guid>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient(uindex, pclientuuid.rawAddress.toCPointer<ByteVar>())

public actual fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: MutPtr<MilMatrix3x2D>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint(uindex, ptransform.rawAddress.toCPointer<ByteVar>())

public actual fun dwmGetTransportAttributes(pfisremoting: MutPtr<Bool>, pfisconnected: MutPtr<Bool>, pdwgeneration: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes(pfisremoting.rawAddress.toCPointer<ByteVar>(), pfisconnected.rawAddress.toCPointer<ByteVar>(), pdwgeneration.rawAddress.toCPointer<ByteVar>())

public actual fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: MutPtr<DwmTabWindowRequirements>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements(appwindow.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: MutPtr<CVoid>, cbattribute: UInt): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute(hwnd.rawAddress.toCPointer<ByteVar>(), dwattribute, pvattribute.rawAddress.toCPointer<ByteVar>(), cbattribute)

public actual fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun dwmIsCompositionEnabled(pfenabled: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled(pfenabled.rawAddress.toCPointer<ByteVar>())

public actual fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration(hwnd.rawAddress.toCPointer<ByteVar>(), crefreshes, frelative)

public actual fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: MutPtr<Size>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize(hthumbnail, psize.rawAddress.toCPointer<ByteVar>())

public actual fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: MutPtr<Long>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail(hwnddestination.rawAddress.toCPointer<ByteVar>(), hwndsource.rawAddress.toCPointer<ByteVar>(), phthumbnailid.rawAddress.toCPointer<ByteVar>())

public actual fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: ConstPtr<UInt>, ppoints: ConstPtr<Point>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmRenderGesture(gt, ccontacts, pdwpointerid.rawAddress.toCPointer<ByteVar>(), ppoints.rawAddress.toCPointer<ByteVar>())

public actual fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration(hwnd.rawAddress.toCPointer<ByteVar>(), crefreshes)

public actual fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: ConstPtr<Point>, dwsitflags: UInt): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap(hwnd.rawAddress.toCPointer<ByteVar>(), hbmp.rawAddress.toCPointer<ByteVar>(), pptclient.rawAddress.toCPointer<ByteVar>(), dwsitflags)

public actual fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail(hwnd.rawAddress.toCPointer<ByteVar>(), hbmp.rawAddress.toCPointer<ByteVar>(), dwsitflags)

public actual fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: MutPtr<DwmPresentParameters>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmSetPresentParameters(hwnd.rawAddress.toCPointer<ByteVar>(), ppresentparams.rawAddress.toCPointer<ByteVar>())

public actual fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: ConstPtr<CVoid>, cbattribute: UInt): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute(hwnd.rawAddress.toCPointer<ByteVar>(), dwattribute, pvattribute.rawAddress.toCPointer<ByteVar>(), cbattribute)

public actual fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmShowContact(dwpointerid, eshowcontact)

public actual fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult =
    0

public actual fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow(hwnd.rawAddress.toCPointer<ByteVar>(), target)

public actual fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(hthumbnailid)

public actual fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: ConstPtr<DwmThumbnailProperties>): Hresult =
    windowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties(hthumbnailid, ptnproperties.rawAddress.toCPointer<ByteVar>())
