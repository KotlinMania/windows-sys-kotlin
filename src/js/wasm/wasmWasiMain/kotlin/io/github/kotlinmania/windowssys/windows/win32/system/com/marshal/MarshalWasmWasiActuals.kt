@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgmedium
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun bstrUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Bstr>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalBstrUserFree")

public actual fun bstrUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Bstr>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalBstrUserFree64")

public actual fun bstrUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Bstr>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalBstrUserMarshal")

public actual fun bstrUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Bstr>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalBstrUserMarshal64")

public actual fun bstrUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Bstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalBstrUserSize")

public actual fun bstrUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Bstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalBstrUserSize64")

public actual fun bstrUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Bstr>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal")

public actual fun bstrUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Bstr>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64")

public actual fun clipformatUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalClipformatUserFree")

public actual fun clipformatUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalClipformatUserFree64")

public actual fun clipformatUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<UShort>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalClipformatUserMarshal")

public actual fun clipformatUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<UShort>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalClipformatUserMarshal64")

public actual fun clipformatUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<UShort>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalClipformatUserSize")

public actual fun clipformatUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<UShort>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalClipformatUserSize64")

public actual fun clipformatUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<UShort>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal")

public actual fun clipformatUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<UShort>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64")

public actual fun coGetMarshalSizeMax(pulsize: MutPtr<UInt>, riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax")

public actual fun coGetStandardMarshal(riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt, ppmarshal: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalCoGetStandardMarshal")

public actual fun coGetStdMarshalEx(punkouter: MutPtr<CVoid>, smexflags: UInt, ppunkinner: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx")

public actual fun coMarshalHresult(pstm: MutPtr<CVoid>, hresult: Hresult): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalCoMarshalHresult")

public actual fun coMarshalInterThreadInterfaceInStream(riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream")

public actual fun coMarshalInterface(pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalCoMarshalInterface")

public actual fun coReleaseMarshalData(pstm: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalCoReleaseMarshalData")

public actual fun coUnmarshalHresult(pstm: MutPtr<CVoid>, phresult: MutPtr<Hresult>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalCoUnmarshalHresult")

public actual fun coUnmarshalInterface(pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalCoUnmarshalInterface")

public actual fun haccelUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Haccel>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHaccelUserFree")

public actual fun haccelUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Haccel>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHaccelUserFree64")

public actual fun haccelUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Haccel>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHaccelUserMarshal")

public actual fun haccelUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Haccel>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHaccelUserMarshal64")

public actual fun haccelUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Haccel>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHaccelUserSize")

public actual fun haccelUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Haccel>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHaccelUserSize64")

public actual fun haccelUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Haccel>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal")

public actual fun haccelUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Haccel>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64")

public actual fun hbitmapUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hbitmap>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHbitmapUserFree")

public actual fun hbitmapUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hbitmap>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHbitmapUserFree64")

public actual fun hbitmapUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hbitmap>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal")

public actual fun hbitmapUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hbitmap>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64")

public actual fun hbitmapUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hbitmap>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHbitmapUserSize")

public actual fun hbitmapUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hbitmap>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHbitmapUserSize64")

public actual fun hbitmapUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hbitmap>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal")

public actual fun hbitmapUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hbitmap>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64")

public actual fun hdcUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hdc>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHdcUserFree")

public actual fun hdcUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hdc>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHdcUserFree64")

public actual fun hdcUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hdc>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHdcUserMarshal")

public actual fun hdcUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hdc>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHdcUserMarshal64")

public actual fun hdcUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hdc>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHdcUserSize")

public actual fun hdcUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hdc>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHdcUserSize64")

public actual fun hdcUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hdc>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal")

public actual fun hdcUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hdc>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64")

public actual fun hglobalUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hglobal>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHglobalUserFree")

public actual fun hglobalUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hglobal>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHglobalUserFree64")

public actual fun hglobalUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hglobal>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHglobalUserMarshal")

public actual fun hglobalUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hglobal>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHglobalUserMarshal64")

public actual fun hglobalUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hglobal>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHglobalUserSize")

public actual fun hglobalUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hglobal>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHglobalUserSize64")

public actual fun hglobalUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hglobal>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal")

public actual fun hglobalUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hglobal>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64")

public actual fun hiconUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hicon>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHiconUserFree")

public actual fun hiconUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hicon>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHiconUserFree64")

public actual fun hiconUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hicon>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHiconUserMarshal")

public actual fun hiconUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hicon>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHiconUserMarshal64")

public actual fun hiconUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hicon>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHiconUserSize")

public actual fun hiconUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hicon>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHiconUserSize64")

public actual fun hiconUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hicon>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal")

public actual fun hiconUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hicon>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64")

public actual fun hmenuUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hmenu>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHmenuUserFree")

public actual fun hmenuUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hmenu>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHmenuUserFree64")

public actual fun hmenuUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmenu>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHmenuUserMarshal")

public actual fun hmenuUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmenu>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHmenuUserMarshal64")

public actual fun hmenuUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmenu>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHmenuUserSize")

public actual fun hmenuUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmenu>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHmenuUserSize64")

public actual fun hmenuUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmenu>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal")

public actual fun hmenuUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmenu>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64")

public actual fun hpaletteUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hpalette>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHpaletteUserFree")

public actual fun hpaletteUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hpalette>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHpaletteUserFree64")

public actual fun hpaletteUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hpalette>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal")

public actual fun hpaletteUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hpalette>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64")

public actual fun hpaletteUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hpalette>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHpaletteUserSize")

public actual fun hpaletteUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hpalette>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHpaletteUserSize64")

public actual fun hpaletteUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hpalette>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal")

public actual fun hpaletteUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hpalette>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64")

public actual fun hwndUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hwnd>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHwndUserFree")

public actual fun hwndUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hwnd>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHwndUserFree64")

public actual fun hwndUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hwnd>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHwndUserMarshal")

public actual fun hwndUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hwnd>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHwndUserMarshal64")

public actual fun hwndUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hwnd>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHwndUserSize")

public actual fun hwndUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hwnd>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHwndUserSize64")

public actual fun hwndUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hwnd>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal")

public actual fun hwndUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hwnd>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64")

public actual fun lpsafearrayUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<Safearray>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree")

public actual fun lpsafearrayUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<Safearray>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64")

public actual fun lpsafearrayUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<Safearray>>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal")

public actual fun lpsafearrayUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<Safearray>>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64")

public actual fun lpsafearrayUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<Safearray>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize")

public actual fun lpsafearrayUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<Safearray>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64")

public actual fun lpsafearrayUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<Safearray>>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal")

public actual fun lpsafearrayUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<Safearray>>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64")

public actual fun snbUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<ConstPtr<UShort>>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalSnbUserFree")

public actual fun snbUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<ConstPtr<UShort>>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalSnbUserFree64")

public actual fun snbUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalSnbUserMarshal")

public actual fun snbUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalSnbUserMarshal64")

public actual fun snbUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalSnbUserSize")

public actual fun snbUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalSnbUserSize64")

public actual fun snbUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<MutPtr<UShort>>>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal")

public actual fun snbUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<MutPtr<UShort>>>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64")

public actual fun stgmediumUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Stgmedium>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalStgmediumUserFree")

public actual fun stgmediumUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Stgmedium>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalStgmediumUserFree64")

public actual fun stgmediumUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Stgmedium>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal")

public actual fun stgmediumUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Stgmedium>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64")

public actual fun stgmediumUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Stgmedium>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalStgmediumUserSize")

public actual fun stgmediumUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Stgmedium>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalStgmediumUserSize64")

public actual fun stgmediumUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Stgmedium>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal")

public actual fun stgmediumUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Stgmedium>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64")
