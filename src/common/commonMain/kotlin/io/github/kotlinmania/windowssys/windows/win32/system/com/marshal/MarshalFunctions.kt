package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

public expect fun bstrUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun bstrUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun bstrUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun bstrUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun bstrUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun bstrUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun bstrUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun bstrUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun clipformatUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun clipformatUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun clipformatUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun clipformatUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun clipformatUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun clipformatUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun clipformatUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun clipformatUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun coGetMarshalSizeMax(pulsize: MutPtr, riid: ConstPtr, punk: MutPtr, dwdestcontext: UInt, pvdestcontext: ConstPtr, mshlflags: UInt): Hresult

public expect fun coGetStandardMarshal(riid: ConstPtr, punk: MutPtr, dwdestcontext: UInt, pvdestcontext: ConstPtr, mshlflags: UInt, ppmarshal: MutPtr): Hresult

public expect fun coGetStdMarshalEx(punkouter: MutPtr, smexflags: UInt, ppunkinner: MutPtr): Hresult

public expect fun coMarshalHresult(pstm: MutPtr, hresult: Hresult): Hresult

public expect fun coMarshalInterThreadInterfaceInStream(riid: ConstPtr, punk: MutPtr, ppstm: MutPtr): Hresult

public expect fun coMarshalInterface(pstm: MutPtr, riid: ConstPtr, punk: MutPtr, dwdestcontext: UInt, pvdestcontext: ConstPtr, mshlflags: UInt): Hresult

public expect fun coReleaseMarshalData(pstm: MutPtr): Hresult

public expect fun coUnmarshalHresult(pstm: MutPtr, phresult: MutPtr): Hresult

public expect fun coUnmarshalInterface(pstm: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun haccelUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun haccelUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun haccelUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun haccelUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun haccelUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun haccelUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun haccelUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun haccelUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hbitmapUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun hbitmapUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun hbitmapUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hbitmapUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hbitmapUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hbitmapUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hbitmapUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hbitmapUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hdcUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun hdcUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun hdcUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hdcUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hdcUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hdcUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hdcUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hdcUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hglobalUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun hglobalUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun hglobalUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hglobalUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hglobalUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hglobalUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hglobalUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hglobalUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hiconUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun hiconUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun hiconUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hiconUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hiconUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hiconUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hiconUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hiconUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hmenuUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun hmenuUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun hmenuUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hmenuUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hmenuUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hmenuUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hmenuUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hmenuUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hpaletteUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun hpaletteUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun hpaletteUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hpaletteUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hpaletteUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hpaletteUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hpaletteUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hpaletteUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hwndUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun hwndUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun hwndUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hwndUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hwndUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hwndUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hwndUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hwndUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun lpsafearrayUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun lpsafearrayUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun lpsafearrayUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun lpsafearrayUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun lpsafearrayUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun lpsafearrayUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun lpsafearrayUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun lpsafearrayUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun snbUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun snbUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun snbUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun snbUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun snbUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun snbUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun snbUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun snbUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun stgmediumUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun stgmediumUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun stgmediumUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun stgmediumUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun stgmediumUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun stgmediumUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun stgmediumUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun stgmediumUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr
