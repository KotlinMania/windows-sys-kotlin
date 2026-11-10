@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dwmAttachMilContent(hwnd: Hwnd): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmAttachMilContent(hwnd?.value?.toCPointer<ByteVar>())

public actual fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmDefWindowProc(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam, plresult?.value?.toCPointer<ByteVar>())

public actual fun dwmDetachMilContent(hwnd: Hwnd): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmDetachMilContent(hwnd?.value?.toCPointer<ByteVar>())

public actual fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmEnableBlurBehindWindow(hwnd?.value?.toCPointer<ByteVar>(), pblurbehind?.value?.toCPointer<ByteVar>())

public actual fun dwmEnableComposition(ucompositionaction: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmEnableComposition(ucompositionaction)

public actual fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmEnableMMCSS(fenablemmcss)

public actual fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmExtendFrameIntoClientArea(hwnd?.value?.toCPointer<ByteVar>(), pmarinset?.value?.toCPointer<ByteVar>())

public actual fun dwmFlush(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmFlush()

public actual fun dwmGetColorizationColor(pcrcolorization: COpaquePointer?, pfopaqueblend: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmGetColorizationColor(pcrcolorization?.value?.toCPointer<ByteVar>(), pfopaqueblend?.value?.toCPointer<ByteVar>())

public actual fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmGetCompositionTimingInfo(hwnd?.value?.toCPointer<ByteVar>(), ptiminginfo?.value?.toCPointer<ByteVar>())

public actual fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamClient(uindex, pclientuuid?.value?.toCPointer<ByteVar>())

public actual fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamTransformHint(uindex, ptransform?.value?.toCPointer<ByteVar>())

public actual fun dwmGetTransportAttributes(pfisremoting: COpaquePointer?, pfisconnected: COpaquePointer?, pdwgeneration: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmGetTransportAttributes(pfisremoting?.value?.toCPointer<ByteVar>(), pfisconnected?.value?.toCPointer<ByteVar>(), pdwgeneration?.value?.toCPointer<ByteVar>())

public actual fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmGetUnmetTabRequirements(appwindow?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmGetWindowAttribute(hwnd?.value?.toCPointer<ByteVar>(), dwattribute, pvattribute?.value?.toCPointer<ByteVar>(), cbattribute)

public actual fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmInvalidateIconicBitmaps(hwnd?.value?.toCPointer<ByteVar>())

public actual fun dwmIsCompositionEnabled(pfenabled: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmIsCompositionEnabled(pfenabled?.value?.toCPointer<ByteVar>())

public actual fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmModifyPreviousDxFrameDuration(hwnd?.value?.toCPointer<ByteVar>(), crefreshes, frelative)

public actual fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmQueryThumbnailSourceSize(hthumbnail, psize?.value?.toCPointer<ByteVar>())

public actual fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmRegisterThumbnail(hwnddestination?.value?.toCPointer<ByteVar>(), hwndsource?.value?.toCPointer<ByteVar>(), phthumbnailid?.value?.toCPointer<ByteVar>())

public actual fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: COpaquePointer?, ppoints: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmRenderGesture(gt, ccontacts, pdwpointerid?.value?.toCPointer<ByteVar>(), ppoints?.value?.toCPointer<ByteVar>())

public actual fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmSetDxFrameDuration(hwnd?.value?.toCPointer<ByteVar>(), crefreshes)

public actual fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: COpaquePointer?, dwsitflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmSetIconicLivePreviewBitmap(hwnd?.value?.toCPointer<ByteVar>(), hbmp?.value?.toCPointer<ByteVar>(), pptclient?.value?.toCPointer<ByteVar>(), dwsitflags)

public actual fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmSetIconicThumbnail(hwnd?.value?.toCPointer<ByteVar>(), hbmp?.value?.toCPointer<ByteVar>(), dwsitflags)

public actual fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmSetPresentParameters(hwnd?.value?.toCPointer<ByteVar>(), ppresentparams?.value?.toCPointer<ByteVar>())

public actual fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmSetWindowAttribute(hwnd?.value?.toCPointer<ByteVar>(), dwattribute, pvattribute?.value?.toCPointer<ByteVar>(), cbattribute)

public actual fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmShowContact(dwpointerid, eshowcontact)

public actual fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult =
    0

public actual fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmTransitionOwnedWindow(hwnd?.value?.toCPointer<ByteVar>(), target)

public actual fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmUnregisterThumbnail(hthumbnailid)

public actual fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_dwmUpdateThumbnailProperties(hthumbnailid, ptnproperties?.value?.toCPointer<ByteVar>())
