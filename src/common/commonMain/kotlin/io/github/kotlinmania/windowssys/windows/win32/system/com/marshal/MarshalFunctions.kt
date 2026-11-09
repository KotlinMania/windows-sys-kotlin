package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.windowssys.core.HRESULT

public expect fun BSTR_UserFree(param0: Long, param1: Long)

public expect fun BSTR_UserFree64(param0: Long, param1: Long)

public expect fun BSTR_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun BSTR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun BSTR_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun BSTR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun BSTR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun BSTR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun CLIPFORMAT_UserFree(param0: Long, param1: Long)

public expect fun CLIPFORMAT_UserFree64(param0: Long, param1: Long)

public expect fun CLIPFORMAT_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun CLIPFORMAT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun CLIPFORMAT_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun CLIPFORMAT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun CLIPFORMAT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun CLIPFORMAT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun CoGetMarshalSizeMax(pulsize: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT

public expect fun CoGetStandardMarshal(riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt, ppmarshal: Long): HRESULT

public expect fun CoGetStdMarshalEx(punkouter: Long, smexflags: UInt, ppunkinner: Long): HRESULT

public expect fun CoMarshalHresult(pstm: Long, hresult: HRESULT): HRESULT

public expect fun CoMarshalInterThreadInterfaceInStream(riid: Long, punk: Long, ppstm: Long): HRESULT

public expect fun CoMarshalInterface(pstm: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT

public expect fun CoReleaseMarshalData(pstm: Long): HRESULT

public expect fun CoUnmarshalHresult(pstm: Long, phresult: Long): HRESULT

public expect fun CoUnmarshalInterface(pstm: Long, riid: Long, ppv: Long): HRESULT

public expect fun HACCEL_UserFree(param0: Long, param1: Long)

public expect fun HACCEL_UserFree64(param0: Long, param1: Long)

public expect fun HACCEL_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HACCEL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HACCEL_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HACCEL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HACCEL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HACCEL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HBITMAP_UserFree(param0: Long, param1: Long)

public expect fun HBITMAP_UserFree64(param0: Long, param1: Long)

public expect fun HBITMAP_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HBITMAP_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HBITMAP_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HBITMAP_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HBITMAP_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HBITMAP_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HDC_UserFree(param0: Long, param1: Long)

public expect fun HDC_UserFree64(param0: Long, param1: Long)

public expect fun HDC_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HDC_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HDC_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HDC_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HDC_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HDC_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HGLOBAL_UserFree(param0: Long, param1: Long)

public expect fun HGLOBAL_UserFree64(param0: Long, param1: Long)

public expect fun HGLOBAL_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HGLOBAL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HGLOBAL_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HGLOBAL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HGLOBAL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HGLOBAL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HICON_UserFree(param0: Long, param1: Long)

public expect fun HICON_UserFree64(param0: Long, param1: Long)

public expect fun HICON_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HICON_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HICON_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HICON_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HICON_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HICON_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HMENU_UserFree(param0: Long, param1: Long)

public expect fun HMENU_UserFree64(param0: Long, param1: Long)

public expect fun HMENU_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HMENU_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HMENU_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HMENU_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HMENU_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HMENU_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HPALETTE_UserFree(param0: Long, param1: Long)

public expect fun HPALETTE_UserFree64(param0: Long, param1: Long)

public expect fun HPALETTE_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HPALETTE_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HPALETTE_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HPALETTE_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HPALETTE_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HPALETTE_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HWND_UserFree(param0: Long, param1: Long)

public expect fun HWND_UserFree64(param0: Long, param1: Long)

public expect fun HWND_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HWND_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HWND_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HWND_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HWND_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HWND_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun LPSAFEARRAY_UserFree(param0: Long, param1: Long)

public expect fun LPSAFEARRAY_UserFree64(param0: Long, param1: Long)

public expect fun LPSAFEARRAY_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun LPSAFEARRAY_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun LPSAFEARRAY_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun LPSAFEARRAY_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun LPSAFEARRAY_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun LPSAFEARRAY_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun SNB_UserFree(param0: Long, param1: Long)

public expect fun SNB_UserFree64(param0: Long, param1: Long)

public expect fun SNB_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun SNB_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun SNB_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun SNB_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun SNB_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun SNB_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun STGMEDIUM_UserFree(param0: Long, param1: Long)

public expect fun STGMEDIUM_UserFree64(param0: Long, param1: Long)

public expect fun STGMEDIUM_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun STGMEDIUM_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun STGMEDIUM_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun STGMEDIUM_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun STGMEDIUM_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun STGMEDIUM_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long
