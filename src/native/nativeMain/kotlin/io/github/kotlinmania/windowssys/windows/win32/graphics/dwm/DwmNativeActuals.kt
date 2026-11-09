@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DwmAttachMilContent(hwnd: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmAttachMilContent(hwnd.toCPointer<ByteVar>())

public actual fun DwmDefWindowProc(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, plresult: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmDefWindowProc(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam, plresult.toCPointer<ByteVar>())

public actual fun DwmDetachMilContent(hwnd: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmDetachMilContent(hwnd.toCPointer<ByteVar>())

public actual fun DwmEnableBlurBehindWindow(hwnd: HWND, pblurbehind: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmEnableBlurBehindWindow(hwnd.toCPointer<ByteVar>(), pblurbehind.toCPointer<ByteVar>())

public actual fun DwmEnableComposition(ucompositionaction: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmEnableComposition(ucompositionaction)

public actual fun DwmEnableMMCSS(fenablemmcss: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmEnableMMCSS(fenablemmcss)

public actual fun DwmExtendFrameIntoClientArea(hwnd: HWND, pmarinset: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmExtendFrameIntoClientArea(hwnd.toCPointer<ByteVar>(), pmarinset.toCPointer<ByteVar>())

public actual fun DwmFlush(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmFlush()

public actual fun DwmGetColorizationColor(pcrcolorization: Long, pfopaqueblend: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmGetColorizationColor(pcrcolorization.toCPointer<ByteVar>(), pfopaqueblend.toCPointer<ByteVar>())

public actual fun DwmGetCompositionTimingInfo(hwnd: HWND, ptiminginfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmGetCompositionTimingInfo(hwnd.toCPointer<ByteVar>(), ptiminginfo.toCPointer<ByteVar>())

public actual fun DwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmGetGraphicsStreamClient(uindex, pclientuuid.toCPointer<ByteVar>())

public actual fun DwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmGetGraphicsStreamTransformHint(uindex, ptransform.toCPointer<ByteVar>())

public actual fun DwmGetTransportAttributes(pfisremoting: Long, pfisconnected: Long, pdwgeneration: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmGetTransportAttributes(pfisremoting.toCPointer<ByteVar>(), pfisconnected.toCPointer<ByteVar>(), pdwgeneration.toCPointer<ByteVar>())

public actual fun DwmGetUnmetTabRequirements(appwindow: HWND, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmGetUnmetTabRequirements(appwindow.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun DwmGetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmGetWindowAttribute(hwnd.toCPointer<ByteVar>(), dwattribute, pvattribute.toCPointer<ByteVar>(), cbattribute)

public actual fun DwmInvalidateIconicBitmaps(hwnd: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmInvalidateIconicBitmaps(hwnd.toCPointer<ByteVar>())

public actual fun DwmIsCompositionEnabled(pfenabled: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmIsCompositionEnabled(pfenabled.toCPointer<ByteVar>())

public actual fun DwmModifyPreviousDxFrameDuration(hwnd: HWND, crefreshes: Int, frelative: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmModifyPreviousDxFrameDuration(hwnd.toCPointer<ByteVar>(), crefreshes, frelative)

public actual fun DwmQueryThumbnailSourceSize(hthumbnail: Long, psize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmQueryThumbnailSourceSize(hthumbnail, psize.toCPointer<ByteVar>())

public actual fun DwmRegisterThumbnail(hwnddestination: HWND, hwndsource: HWND, phthumbnailid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmRegisterThumbnail(hwnddestination.toCPointer<ByteVar>(), hwndsource.toCPointer<ByteVar>(), phthumbnailid.toCPointer<ByteVar>())

public actual fun DwmRenderGesture(gt: GESTURE_TYPE, ccontacts: UInt, pdwpointerid: Long, ppoints: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmRenderGesture(gt, ccontacts, pdwpointerid.toCPointer<ByteVar>(), ppoints.toCPointer<ByteVar>())

public actual fun DwmSetDxFrameDuration(hwnd: HWND, crefreshes: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmSetDxFrameDuration(hwnd.toCPointer<ByteVar>(), crefreshes)

public actual fun DwmSetIconicLivePreviewBitmap(hwnd: HWND, hbmp: HBITMAP, pptclient: Long, dwsitflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmSetIconicLivePreviewBitmap(hwnd.toCPointer<ByteVar>(), hbmp.toCPointer<ByteVar>(), pptclient.toCPointer<ByteVar>(), dwsitflags)

public actual fun DwmSetIconicThumbnail(hwnd: HWND, hbmp: HBITMAP, dwsitflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmSetIconicThumbnail(hwnd.toCPointer<ByteVar>(), hbmp.toCPointer<ByteVar>(), dwsitflags)

public actual fun DwmSetPresentParameters(hwnd: HWND, ppresentparams: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmSetPresentParameters(hwnd.toCPointer<ByteVar>(), ppresentparams.toCPointer<ByteVar>())

public actual fun DwmSetWindowAttribute(hwnd: HWND, dwattribute: UInt, pvattribute: Long, cbattribute: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmSetWindowAttribute(hwnd.toCPointer<ByteVar>(), dwattribute, pvattribute.toCPointer<ByteVar>(), cbattribute)

public actual fun DwmShowContact(dwpointerid: UInt, eshowcontact: DWM_SHOWCONTACT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmShowContact(dwpointerid, eshowcontact)

public actual fun DwmTetherContact(dwpointerid: UInt, fenable: BOOL, pttether: POINT): HRESULT =
    0

public actual fun DwmTransitionOwnedWindow(hwnd: HWND, target: DWMTRANSITION_OWNEDWINDOW_TARGET): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmTransitionOwnedWindow(hwnd.toCPointer<ByteVar>(), target)

public actual fun DwmUnregisterThumbnail(hthumbnailid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmUnregisterThumbnail(hthumbnailid)

public actual fun DwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.dwm.cinterop.windowssys_windows_win32_graphics_dwm_DwmUpdateThumbnailProperties(hthumbnailid, ptnproperties.toCPointer<ByteVar>())
