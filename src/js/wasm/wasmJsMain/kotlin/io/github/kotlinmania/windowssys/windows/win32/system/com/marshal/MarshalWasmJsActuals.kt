@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.windowssys.core.HRESULT

public actual fun BSTR_UserFree(param0: Long, param1: Long) {
}

public actual fun BSTR_UserFree64(param0: Long, param1: Long) {
}

public actual fun BSTR_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun BSTR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun BSTR_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun BSTR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun BSTR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun BSTR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun CLIPFORMAT_UserFree(param0: Long, param1: Long) {
}

public actual fun CLIPFORMAT_UserFree64(param0: Long, param1: Long) {
}

public actual fun CLIPFORMAT_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun CLIPFORMAT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun CLIPFORMAT_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun CLIPFORMAT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun CLIPFORMAT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun CLIPFORMAT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun CoGetMarshalSizeMax(pulsize: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT =
    0

public actual fun CoGetStandardMarshal(riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt, ppmarshal: Long): HRESULT =
    0

public actual fun CoGetStdMarshalEx(punkouter: Long, smexflags: UInt, ppunkinner: Long): HRESULT =
    0

public actual fun CoMarshalHresult(pstm: Long, hresult: HRESULT): HRESULT =
    0

public actual fun CoMarshalInterThreadInterfaceInStream(riid: Long, punk: Long, ppstm: Long): HRESULT =
    0

public actual fun CoMarshalInterface(pstm: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT =
    0

public actual fun CoReleaseMarshalData(pstm: Long): HRESULT =
    0

public actual fun CoUnmarshalHresult(pstm: Long, phresult: Long): HRESULT =
    0

public actual fun CoUnmarshalInterface(pstm: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun HACCEL_UserFree(param0: Long, param1: Long) {
}

public actual fun HACCEL_UserFree64(param0: Long, param1: Long) {
}

public actual fun HACCEL_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HACCEL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HACCEL_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HACCEL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HACCEL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HACCEL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HBITMAP_UserFree(param0: Long, param1: Long) {
}

public actual fun HBITMAP_UserFree64(param0: Long, param1: Long) {
}

public actual fun HBITMAP_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HBITMAP_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HBITMAP_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HBITMAP_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HBITMAP_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HBITMAP_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HDC_UserFree(param0: Long, param1: Long) {
}

public actual fun HDC_UserFree64(param0: Long, param1: Long) {
}

public actual fun HDC_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HDC_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HDC_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HDC_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HDC_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HDC_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HGLOBAL_UserFree(param0: Long, param1: Long) {
}

public actual fun HGLOBAL_UserFree64(param0: Long, param1: Long) {
}

public actual fun HGLOBAL_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HGLOBAL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HGLOBAL_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HGLOBAL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HGLOBAL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HGLOBAL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HICON_UserFree(param0: Long, param1: Long) {
}

public actual fun HICON_UserFree64(param0: Long, param1: Long) {
}

public actual fun HICON_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HICON_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HICON_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HICON_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HICON_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HICON_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HMENU_UserFree(param0: Long, param1: Long) {
}

public actual fun HMENU_UserFree64(param0: Long, param1: Long) {
}

public actual fun HMENU_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HMENU_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HMENU_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HMENU_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HMENU_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HMENU_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HPALETTE_UserFree(param0: Long, param1: Long) {
}

public actual fun HPALETTE_UserFree64(param0: Long, param1: Long) {
}

public actual fun HPALETTE_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HPALETTE_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HPALETTE_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HPALETTE_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HPALETTE_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HPALETTE_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HWND_UserFree(param0: Long, param1: Long) {
}

public actual fun HWND_UserFree64(param0: Long, param1: Long) {
}

public actual fun HWND_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HWND_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HWND_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HWND_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HWND_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HWND_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun LPSAFEARRAY_UserFree(param0: Long, param1: Long) {
}

public actual fun LPSAFEARRAY_UserFree64(param0: Long, param1: Long) {
}

public actual fun LPSAFEARRAY_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun LPSAFEARRAY_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun LPSAFEARRAY_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun LPSAFEARRAY_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun LPSAFEARRAY_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun LPSAFEARRAY_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun SNB_UserFree(param0: Long, param1: Long) {
}

public actual fun SNB_UserFree64(param0: Long, param1: Long) {
}

public actual fun SNB_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun SNB_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun SNB_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun SNB_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun SNB_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun SNB_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun STGMEDIUM_UserFree(param0: Long, param1: Long) {
}

public actual fun STGMEDIUM_UserFree64(param0: Long, param1: Long) {
}

public actual fun STGMEDIUM_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun STGMEDIUM_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun STGMEDIUM_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun STGMEDIUM_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun STGMEDIUM_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun STGMEDIUM_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L
