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

public expect fun bstrUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Bstr>)

public expect fun bstrUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Bstr>)

public expect fun bstrUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Bstr>): MutPtr<UByte>

public expect fun bstrUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Bstr>): MutPtr<UByte>

public expect fun bstrUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Bstr>): UInt

public expect fun bstrUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Bstr>): UInt

public expect fun bstrUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Bstr>): MutPtr<UByte>

public expect fun bstrUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Bstr>): MutPtr<UByte>

public expect fun clipformatUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<UShort>)

public expect fun clipformatUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<UShort>)

public expect fun clipformatUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<UShort>): MutPtr<UByte>

public expect fun clipformatUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<UShort>): MutPtr<UByte>

public expect fun clipformatUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<UShort>): UInt

public expect fun clipformatUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<UShort>): UInt

public expect fun clipformatUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<UShort>): MutPtr<UByte>

public expect fun clipformatUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<UShort>): MutPtr<UByte>

public expect fun coGetMarshalSizeMax(pulsize: MutPtr<UInt>, riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt): Hresult

public expect fun coGetStandardMarshal(riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt, ppmarshal: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coGetStdMarshalEx(punkouter: MutPtr<CVoid>, smexflags: UInt, ppunkinner: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coMarshalHresult(pstm: MutPtr<CVoid>, hresult: Hresult): Hresult

public expect fun coMarshalInterThreadInterfaceInStream(riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, ppstm: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coMarshalInterface(pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt): Hresult

public expect fun coReleaseMarshalData(pstm: MutPtr<CVoid>): Hresult

public expect fun coUnmarshalHresult(pstm: MutPtr<CVoid>, phresult: MutPtr<Hresult>): Hresult

public expect fun coUnmarshalInterface(pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun haccelUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Haccel>)

public expect fun haccelUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Haccel>)

public expect fun haccelUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Haccel>): MutPtr<UByte>

public expect fun haccelUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Haccel>): MutPtr<UByte>

public expect fun haccelUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Haccel>): UInt

public expect fun haccelUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Haccel>): UInt

public expect fun haccelUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Haccel>): MutPtr<UByte>

public expect fun haccelUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Haccel>): MutPtr<UByte>

public expect fun hbitmapUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hbitmap>)

public expect fun hbitmapUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hbitmap>)

public expect fun hbitmapUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hbitmap>): MutPtr<UByte>

public expect fun hbitmapUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hbitmap>): MutPtr<UByte>

public expect fun hbitmapUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hbitmap>): UInt

public expect fun hbitmapUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hbitmap>): UInt

public expect fun hbitmapUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hbitmap>): MutPtr<UByte>

public expect fun hbitmapUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hbitmap>): MutPtr<UByte>

public expect fun hdcUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hdc>)

public expect fun hdcUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hdc>)

public expect fun hdcUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hdc>): MutPtr<UByte>

public expect fun hdcUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hdc>): MutPtr<UByte>

public expect fun hdcUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hdc>): UInt

public expect fun hdcUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hdc>): UInt

public expect fun hdcUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hdc>): MutPtr<UByte>

public expect fun hdcUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hdc>): MutPtr<UByte>

public expect fun hglobalUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hglobal>)

public expect fun hglobalUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hglobal>)

public expect fun hglobalUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hglobal>): MutPtr<UByte>

public expect fun hglobalUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hglobal>): MutPtr<UByte>

public expect fun hglobalUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hglobal>): UInt

public expect fun hglobalUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hglobal>): UInt

public expect fun hglobalUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hglobal>): MutPtr<UByte>

public expect fun hglobalUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hglobal>): MutPtr<UByte>

public expect fun hiconUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hicon>)

public expect fun hiconUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hicon>)

public expect fun hiconUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hicon>): MutPtr<UByte>

public expect fun hiconUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hicon>): MutPtr<UByte>

public expect fun hiconUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hicon>): UInt

public expect fun hiconUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hicon>): UInt

public expect fun hiconUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hicon>): MutPtr<UByte>

public expect fun hiconUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hicon>): MutPtr<UByte>

public expect fun hmenuUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hmenu>)

public expect fun hmenuUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hmenu>)

public expect fun hmenuUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmenu>): MutPtr<UByte>

public expect fun hmenuUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmenu>): MutPtr<UByte>

public expect fun hmenuUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmenu>): UInt

public expect fun hmenuUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmenu>): UInt

public expect fun hmenuUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmenu>): MutPtr<UByte>

public expect fun hmenuUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmenu>): MutPtr<UByte>

public expect fun hpaletteUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hpalette>)

public expect fun hpaletteUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hpalette>)

public expect fun hpaletteUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hpalette>): MutPtr<UByte>

public expect fun hpaletteUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hpalette>): MutPtr<UByte>

public expect fun hpaletteUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hpalette>): UInt

public expect fun hpaletteUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hpalette>): UInt

public expect fun hpaletteUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hpalette>): MutPtr<UByte>

public expect fun hpaletteUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hpalette>): MutPtr<UByte>

public expect fun hwndUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hwnd>)

public expect fun hwndUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hwnd>)

public expect fun hwndUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hwnd>): MutPtr<UByte>

public expect fun hwndUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hwnd>): MutPtr<UByte>

public expect fun hwndUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hwnd>): UInt

public expect fun hwndUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hwnd>): UInt

public expect fun hwndUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hwnd>): MutPtr<UByte>

public expect fun hwndUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hwnd>): MutPtr<UByte>

public expect fun lpsafearrayUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<Safearray>>)

public expect fun lpsafearrayUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<Safearray>>)

public expect fun lpsafearrayUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<Safearray>>): MutPtr<UByte>

public expect fun lpsafearrayUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<Safearray>>): MutPtr<UByte>

public expect fun lpsafearrayUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<Safearray>>): UInt

public expect fun lpsafearrayUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<Safearray>>): UInt

public expect fun lpsafearrayUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<Safearray>>): MutPtr<UByte>

public expect fun lpsafearrayUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<Safearray>>): MutPtr<UByte>

public expect fun snbUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<ConstPtr<UShort>>>)

public expect fun snbUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<ConstPtr<UShort>>>)

public expect fun snbUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): MutPtr<UByte>

public expect fun snbUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): MutPtr<UByte>

public expect fun snbUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): UInt

public expect fun snbUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): UInt

public expect fun snbUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<MutPtr<UShort>>>): MutPtr<UByte>

public expect fun snbUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<MutPtr<UShort>>>): MutPtr<UByte>

public expect fun stgmediumUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Stgmedium>)

public expect fun stgmediumUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Stgmedium>)

public expect fun stgmediumUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Stgmedium>): MutPtr<UByte>

public expect fun stgmediumUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Stgmedium>): MutPtr<UByte>

public expect fun stgmediumUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Stgmedium>): UInt

public expect fun stgmediumUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Stgmedium>): UInt

public expect fun stgmediumUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Stgmedium>): MutPtr<UByte>

public expect fun stgmediumUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Stgmedium>): MutPtr<UByte>
