@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun magGetColorEffect(hwnd: Hwnd, peffect: MutPtr<Magcoloreffect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagGetColorEffect")

public actual fun magGetFullscreenColorEffect(peffect: MutPtr<Magcoloreffect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect")

public actual fun magGetFullscreenTransform(pmaglevel: MutPtr<Float>, pxoffset: MutPtr<Int>, pyoffset: MutPtr<Int>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagGetFullscreenTransform")

public actual fun magGetImageScalingCallback(hwnd: Hwnd): MagImageScalingCallback =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagGetImageScalingCallback")

public actual fun magGetInputTransform(pfenabled: MutPtr<Bool>, prectsource: MutPtr<Rect>, prectdest: MutPtr<Rect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagGetInputTransform")

public actual fun magGetWindowFilterList(hwnd: Hwnd, pdwfiltermode: MutPtr<MwFiltermode>, count: Int, phwnd: MutPtr<Hwnd>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagGetWindowFilterList")

public actual fun magGetWindowSource(hwnd: Hwnd, prect: MutPtr<Rect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagGetWindowSource")

public actual fun magGetWindowTransform(hwnd: Hwnd, ptransform: MutPtr<Magtransform>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagGetWindowTransform")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiMagnificationMagInitialize")
private external fun wasiWindowssysWindowsWin32UiMagnificationMagInitialize(): Int

public actual fun magInitialize(): Bool =
    wasiWindowssysWindowsWin32UiMagnificationMagInitialize().toInt()

public actual fun magSetColorEffect(hwnd: Hwnd, peffect: MutPtr<Magcoloreffect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagSetColorEffect")

public actual fun magSetFullscreenColorEffect(peffect: ConstPtr<Magcoloreffect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiMagnificationMagSetFullscreenTransform")
private external fun wasiWindowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Int

public actual fun magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Bool =
    wasiWindowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(maglevel, xoffset, yoffset).toInt()

public actual fun magSetImageScalingCallback(hwnd: Hwnd, callback: MagImageScalingCallback): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagSetImageScalingCallback")

public actual fun magSetInputTransform(fenabled: Bool, prectsource: ConstPtr<Rect>, prectdest: ConstPtr<Rect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagSetInputTransform")

public actual fun magSetWindowFilterList(hwnd: Hwnd, dwfiltermode: MwFiltermode, count: Int, phwnd: MutPtr<Hwnd>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagSetWindowFilterList")

public actual fun magSetWindowSource(hwnd: Hwnd, rect: Rect): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagSetWindowSource")

public actual fun magSetWindowTransform(hwnd: Hwnd, ptransform: MutPtr<Magtransform>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiMagnificationMagSetWindowTransform")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiMagnificationMagShowSystemCursor")
private external fun wasiWindowssysWindowsWin32UiMagnificationMagShowSystemCursor(fshowcursor: Int): Int

public actual fun magShowSystemCursor(fshowcursor: Bool): Bool =
    wasiWindowssysWindowsWin32UiMagnificationMagShowSystemCursor(fshowcursor).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiMagnificationMagUninitialize")
private external fun wasiWindowssysWindowsWin32UiMagnificationMagUninitialize(): Int

public actual fun magUninitialize(): Bool =
    wasiWindowssysWindowsWin32UiMagnificationMagUninitialize().toInt()
