package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT

public fun BSTR_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("oleaut32.dll", "BSTR_UserFree", longArrayOf(param0, param1))
}

public fun BSTR_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("oleaut32.dll", "BSTR_UserFree64", longArrayOf(param0, param1))
}

public fun BSTR_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "BSTR_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun BSTR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "BSTR_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun BSTR_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "BSTR_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun BSTR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "BSTR_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun BSTR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "BSTR_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun BSTR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "BSTR_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun CLIPFORMAT_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "CLIPFORMAT_UserFree", longArrayOf(param0, param1))
}

public fun CLIPFORMAT_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "CLIPFORMAT_UserFree64", longArrayOf(param0, param1))
}

public fun CLIPFORMAT_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "CLIPFORMAT_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun CLIPFORMAT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "CLIPFORMAT_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun CLIPFORMAT_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "CLIPFORMAT_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun CLIPFORMAT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "CLIPFORMAT_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun CLIPFORMAT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "CLIPFORMAT_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun CLIPFORMAT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "CLIPFORMAT_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun CoGetMarshalSizeMax(pulsize: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetMarshalSizeMax", longArrayOf(pulsize, riid, punk, dwdestcontext.toLong(), pvdestcontext, mshlflags.toLong())).toInt()
}

public fun CoGetStandardMarshal(riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt, ppmarshal: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetStandardMarshal", longArrayOf(riid, punk, dwdestcontext.toLong(), pvdestcontext, mshlflags.toLong(), ppmarshal)).toInt()
}

public fun CoGetStdMarshalEx(punkouter: Long, smexflags: UInt, ppunkinner: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetStdMarshalEx", longArrayOf(punkouter, smexflags.toLong(), ppunkinner)).toInt()
}

public fun CoMarshalHresult(pstm: Long, hresult: HRESULT): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoMarshalHresult", longArrayOf(pstm, hresult.toLong())).toInt()
}

public fun CoMarshalInterThreadInterfaceInStream(riid: Long, punk: Long, ppstm: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoMarshalInterThreadInterfaceInStream", longArrayOf(riid, punk, ppstm)).toInt()
}

public fun CoMarshalInterface(pstm: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoMarshalInterface", longArrayOf(pstm, riid, punk, dwdestcontext.toLong(), pvdestcontext, mshlflags.toLong())).toInt()
}

public fun CoReleaseMarshalData(pstm: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoReleaseMarshalData", longArrayOf(pstm)).toInt()
}

public fun CoUnmarshalHresult(pstm: Long, phresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoUnmarshalHresult", longArrayOf(pstm, phresult)).toInt()
}

public fun CoUnmarshalInterface(pstm: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoUnmarshalInterface", longArrayOf(pstm, riid, ppv)).toInt()
}

public fun HACCEL_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HACCEL_UserFree", longArrayOf(param0, param1))
}

public fun HACCEL_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HACCEL_UserFree64", longArrayOf(param0, param1))
}

public fun HACCEL_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HACCEL_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun HACCEL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HACCEL_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun HACCEL_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HACCEL_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HACCEL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HACCEL_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HACCEL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HACCEL_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun HACCEL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HACCEL_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun HBITMAP_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HBITMAP_UserFree", longArrayOf(param0, param1))
}

public fun HBITMAP_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HBITMAP_UserFree64", longArrayOf(param0, param1))
}

public fun HBITMAP_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HBITMAP_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun HBITMAP_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HBITMAP_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun HBITMAP_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HBITMAP_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HBITMAP_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HBITMAP_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HBITMAP_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HBITMAP_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun HBITMAP_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HBITMAP_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun HDC_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HDC_UserFree", longArrayOf(param0, param1))
}

public fun HDC_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HDC_UserFree64", longArrayOf(param0, param1))
}

public fun HDC_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HDC_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun HDC_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HDC_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun HDC_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HDC_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HDC_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HDC_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HDC_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HDC_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun HDC_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HDC_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun HGLOBAL_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HGLOBAL_UserFree", longArrayOf(param0, param1))
}

public fun HGLOBAL_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HGLOBAL_UserFree64", longArrayOf(param0, param1))
}

public fun HGLOBAL_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HGLOBAL_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun HGLOBAL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HGLOBAL_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun HGLOBAL_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HGLOBAL_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HGLOBAL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HGLOBAL_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HGLOBAL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HGLOBAL_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun HGLOBAL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HGLOBAL_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun HICON_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HICON_UserFree", longArrayOf(param0, param1))
}

public fun HICON_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HICON_UserFree64", longArrayOf(param0, param1))
}

public fun HICON_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HICON_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun HICON_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HICON_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun HICON_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HICON_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HICON_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HICON_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HICON_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HICON_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun HICON_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HICON_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun HMENU_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HMENU_UserFree", longArrayOf(param0, param1))
}

public fun HMENU_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HMENU_UserFree64", longArrayOf(param0, param1))
}

public fun HMENU_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HMENU_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun HMENU_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HMENU_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun HMENU_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HMENU_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HMENU_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HMENU_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HMENU_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HMENU_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun HMENU_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HMENU_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun HPALETTE_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HPALETTE_UserFree", longArrayOf(param0, param1))
}

public fun HPALETTE_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HPALETTE_UserFree64", longArrayOf(param0, param1))
}

public fun HPALETTE_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HPALETTE_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun HPALETTE_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HPALETTE_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun HPALETTE_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HPALETTE_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HPALETTE_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HPALETTE_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HPALETTE_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HPALETTE_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun HPALETTE_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HPALETTE_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun HWND_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HWND_UserFree", longArrayOf(param0, param1))
}

public fun HWND_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HWND_UserFree64", longArrayOf(param0, param1))
}

public fun HWND_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HWND_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun HWND_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HWND_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun HWND_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HWND_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HWND_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HWND_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HWND_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HWND_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun HWND_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HWND_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun LPSAFEARRAY_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("oleaut32.dll", "LPSAFEARRAY_UserFree", longArrayOf(param0, param1))
}

public fun LPSAFEARRAY_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("oleaut32.dll", "LPSAFEARRAY_UserFree64", longArrayOf(param0, param1))
}

public fun LPSAFEARRAY_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LPSAFEARRAY_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun LPSAFEARRAY_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LPSAFEARRAY_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun LPSAFEARRAY_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LPSAFEARRAY_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun LPSAFEARRAY_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LPSAFEARRAY_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun LPSAFEARRAY_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LPSAFEARRAY_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun LPSAFEARRAY_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LPSAFEARRAY_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun SNB_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "SNB_UserFree", longArrayOf(param0, param1))
}

public fun SNB_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "SNB_UserFree64", longArrayOf(param0, param1))
}

public fun SNB_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "SNB_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun SNB_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "SNB_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun SNB_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "SNB_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun SNB_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "SNB_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun SNB_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "SNB_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun SNB_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "SNB_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun STGMEDIUM_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "STGMEDIUM_UserFree", longArrayOf(param0, param1))
}

public fun STGMEDIUM_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "STGMEDIUM_UserFree64", longArrayOf(param0, param1))
}

public fun STGMEDIUM_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "STGMEDIUM_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun STGMEDIUM_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "STGMEDIUM_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun STGMEDIUM_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "STGMEDIUM_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun STGMEDIUM_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "STGMEDIUM_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun STGMEDIUM_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "STGMEDIUM_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun STGMEDIUM_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "STGMEDIUM_UserUnmarshal64", longArrayOf(param0, param1, param2))
}
