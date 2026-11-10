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

public actual fun dwmAttachMilContent(hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmDetachMilContent(hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmEnableComposition(ucompositionaction: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmFlush(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmGetColorizationColor(pcrcolorization: COpaquePointer?, pfopaqueblend: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmGetTransportAttributes(pfisremoting: COpaquePointer?, pfisconnected: COpaquePointer?, pdwgeneration: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmIsCompositionEnabled(pfenabled: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: COpaquePointer?, ppoints: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: COpaquePointer?, dwsitflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
