@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.windowssys.core.HRESULT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BSTR_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_BSTR_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun BSTR_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_BSTR_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun BSTR_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_BSTR_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun BSTR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_BSTR_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun BSTR_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_BSTR_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun BSTR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_BSTR_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun BSTR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_BSTR_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun BSTR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_BSTR_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CLIPFORMAT_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun CLIPFORMAT_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun CLIPFORMAT_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CLIPFORMAT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CLIPFORMAT_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun CLIPFORMAT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun CLIPFORMAT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CLIPFORMAT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CoGetMarshalSizeMax(pulsize: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CoGetMarshalSizeMax(pulsize.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), punk.toCPointer<ByteVar>(), dwdestcontext, pvdestcontext.toCPointer<ByteVar>(), mshlflags)

public actual fun CoGetStandardMarshal(riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt, ppmarshal: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CoGetStandardMarshal(riid.toCPointer<ByteVar>(), punk.toCPointer<ByteVar>(), dwdestcontext, pvdestcontext.toCPointer<ByteVar>(), mshlflags, ppmarshal.toCPointer<ByteVar>())

public actual fun CoGetStdMarshalEx(punkouter: Long, smexflags: UInt, ppunkinner: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CoGetStdMarshalEx(punkouter.toCPointer<ByteVar>(), smexflags, ppunkinner.toCPointer<ByteVar>())

public actual fun CoMarshalHresult(pstm: Long, hresult: HRESULT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CoMarshalHresult(pstm.toCPointer<ByteVar>(), hresult)

public actual fun CoMarshalInterThreadInterfaceInStream(riid: Long, punk: Long, ppstm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CoMarshalInterThreadInterfaceInStream(riid.toCPointer<ByteVar>(), punk.toCPointer<ByteVar>(), ppstm.toCPointer<ByteVar>())

public actual fun CoMarshalInterface(pstm: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CoMarshalInterface(pstm.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), punk.toCPointer<ByteVar>(), dwdestcontext, pvdestcontext.toCPointer<ByteVar>(), mshlflags)

public actual fun CoReleaseMarshalData(pstm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CoReleaseMarshalData(pstm.toCPointer<ByteVar>())

public actual fun CoUnmarshalHresult(pstm: Long, phresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CoUnmarshalHresult(pstm.toCPointer<ByteVar>(), phresult.toCPointer<ByteVar>())

public actual fun CoUnmarshalInterface(pstm: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_CoUnmarshalInterface(pstm.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun HACCEL_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HACCEL_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HACCEL_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HACCEL_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HACCEL_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HACCEL_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HACCEL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HACCEL_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HACCEL_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HACCEL_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HACCEL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HACCEL_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HACCEL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HACCEL_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HACCEL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HACCEL_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HBITMAP_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HBITMAP_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HBITMAP_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HBITMAP_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HBITMAP_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HBITMAP_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HBITMAP_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HBITMAP_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HBITMAP_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HBITMAP_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HBITMAP_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HBITMAP_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HBITMAP_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HBITMAP_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HBITMAP_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HBITMAP_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HDC_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HDC_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HDC_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HDC_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HDC_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HDC_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HDC_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HDC_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HDC_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HDC_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HDC_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HDC_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HDC_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HDC_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HDC_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HDC_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HGLOBAL_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HGLOBAL_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HGLOBAL_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HGLOBAL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HGLOBAL_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HGLOBAL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HGLOBAL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HGLOBAL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HICON_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HICON_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HICON_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HICON_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HICON_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HICON_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HICON_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HICON_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HICON_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HICON_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HICON_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HICON_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HICON_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HICON_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HICON_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HICON_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HMENU_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HMENU_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HMENU_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HMENU_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HMENU_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HMENU_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HMENU_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HMENU_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HMENU_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HMENU_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HMENU_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HMENU_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HMENU_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HMENU_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HMENU_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HMENU_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HPALETTE_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HPALETTE_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HPALETTE_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HPALETTE_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HPALETTE_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HPALETTE_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HPALETTE_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HPALETTE_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HPALETTE_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HPALETTE_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HPALETTE_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HPALETTE_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HPALETTE_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HPALETTE_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HPALETTE_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HPALETTE_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HWND_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HWND_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HWND_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HWND_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HWND_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HWND_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HWND_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HWND_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HWND_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HWND_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HWND_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HWND_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HWND_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HWND_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HWND_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_HWND_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LPSAFEARRAY_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun LPSAFEARRAY_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun LPSAFEARRAY_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LPSAFEARRAY_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LPSAFEARRAY_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun LPSAFEARRAY_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun LPSAFEARRAY_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LPSAFEARRAY_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SNB_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_SNB_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun SNB_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_SNB_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun SNB_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_SNB_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SNB_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_SNB_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SNB_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_SNB_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun SNB_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_SNB_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun SNB_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_SNB_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SNB_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_SNB_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun STGMEDIUM_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun STGMEDIUM_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun STGMEDIUM_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun STGMEDIUM_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun STGMEDIUM_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun STGMEDIUM_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun STGMEDIUM_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun STGMEDIUM_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L
