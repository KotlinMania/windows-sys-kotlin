@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun dwmAttachMilContent(hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmAttachMilContent")

public actual fun dwmDefWindowProc(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, plresult: MutPtr<Lresult>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmDefWindowProc")

public actual fun dwmDetachMilContent(hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmDetachMilContent")

public actual fun dwmEnableBlurBehindWindow(hwnd: Hwnd, pblurbehind: ConstPtr<DwmBlurbehind>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsDwmDwmEnableComposition")
private external fun wasiWindowssysWindowsWin32GraphicsDwmDwmEnableComposition(ucompositionaction: Int): Int

public actual fun dwmEnableComposition(ucompositionaction: UInt): Hresult =
    wasiWindowssysWindowsWin32GraphicsDwmDwmEnableComposition(ucompositionaction.toInt()).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsDwmDwmEnableMMCSS")
private external fun wasiWindowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(fenablemmcss: Int): Int

public actual fun dwmEnableMMCSS(fenablemmcss: Bool): Hresult =
    wasiWindowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(fenablemmcss).toInt()

public actual fun dwmExtendFrameIntoClientArea(hwnd: Hwnd, pmarinset: ConstPtr<Margins>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsDwmDwmFlush")
private external fun wasiWindowssysWindowsWin32GraphicsDwmDwmFlush(): Int

public actual fun dwmFlush(): Hresult =
    wasiWindowssysWindowsWin32GraphicsDwmDwmFlush().toInt()

public actual fun dwmGetColorizationColor(pcrcolorization: MutPtr<UInt>, pfopaqueblend: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmGetColorizationColor")

public actual fun dwmGetCompositionTimingInfo(hwnd: Hwnd, ptiminginfo: MutPtr<DwmTimingInfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo")

public actual fun dwmGetGraphicsStreamClient(uindex: UInt, pclientuuid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient")

public actual fun dwmGetGraphicsStreamTransformHint(uindex: UInt, ptransform: MutPtr<MilMatrix3x2D>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint")

public actual fun dwmGetTransportAttributes(pfisremoting: MutPtr<Bool>, pfisconnected: MutPtr<Bool>, pdwgeneration: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes")

public actual fun dwmGetUnmetTabRequirements(appwindow: Hwnd, value: MutPtr<DwmTabWindowRequirements>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements")

public actual fun dwmGetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: MutPtr<CVoid>, cbattribute: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute")

public actual fun dwmInvalidateIconicBitmaps(hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps")

public actual fun dwmIsCompositionEnabled(pfenabled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled")

public actual fun dwmModifyPreviousDxFrameDuration(hwnd: Hwnd, crefreshes: Int, frelative: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration")

public actual fun dwmQueryThumbnailSourceSize(hthumbnail: Long, psize: MutPtr<Size>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize")

public actual fun dwmRegisterThumbnail(hwnddestination: Hwnd, hwndsource: Hwnd, phthumbnailid: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail")

public actual fun dwmRenderGesture(gt: GestureType, ccontacts: UInt, pdwpointerid: ConstPtr<UInt>, ppoints: ConstPtr<Point>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmRenderGesture")

public actual fun dwmSetDxFrameDuration(hwnd: Hwnd, crefreshes: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration")

public actual fun dwmSetIconicLivePreviewBitmap(hwnd: Hwnd, hbmp: Hbitmap, pptclient: ConstPtr<Point>, dwsitflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap")

public actual fun dwmSetIconicThumbnail(hwnd: Hwnd, hbmp: Hbitmap, dwsitflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail")

public actual fun dwmSetPresentParameters(hwnd: Hwnd, ppresentparams: MutPtr<DwmPresentParameters>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmSetPresentParameters")

public actual fun dwmSetWindowAttribute(hwnd: Hwnd, dwattribute: UInt, pvattribute: ConstPtr<CVoid>, cbattribute: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsDwmDwmShowContact")
private external fun wasiWindowssysWindowsWin32GraphicsDwmDwmShowContact(dwpointerid: Int, eshowcontact: Int): Int

public actual fun dwmShowContact(dwpointerid: UInt, eshowcontact: DwmShowcontact): Hresult =
    wasiWindowssysWindowsWin32GraphicsDwmDwmShowContact(dwpointerid.toInt(), eshowcontact.toInt()).toInt()

public actual fun dwmTetherContact(dwpointerid: UInt, fenable: Bool, pttether: Point): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmTetherContact")

public actual fun dwmTransitionOwnedWindow(hwnd: Hwnd, target: DwmtransitionOwnedwindowTarget): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail")
private external fun wasiWindowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(hthumbnailid: Long): Int

public actual fun dwmUnregisterThumbnail(hthumbnailid: Long): Hresult =
    wasiWindowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(hthumbnailid).toInt()

public actual fun dwmUpdateThumbnailProperties(hthumbnailid: Long, ptnproperties: ConstPtr<DwmThumbnailProperties>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties")
