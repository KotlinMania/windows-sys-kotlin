@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.windowssys.core.HRESULT

private object WindowsWin32SystemComMarshalJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_BSTR_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_BSTR_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_BSTR_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_BSTR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_BSTR_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_BSTR_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_BSTR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_BSTR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CoGetMarshalSizeMax(pulsize: Long, riid: Long, punk: Long, dwdestcontext: Int, pvdestcontext: Long, mshlflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CoGetStandardMarshal(riid: Long, punk: Long, dwdestcontext: Int, pvdestcontext: Long, mshlflags: Int, ppmarshal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CoGetStdMarshalEx(punkouter: Long, smexflags: Int, ppunkinner: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CoMarshalHresult(pstm: Long, hresult: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CoMarshalInterThreadInterfaceInStream(riid: Long, punk: Long, ppstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CoMarshalInterface(pstm: Long, riid: Long, punk: Long, dwdestcontext: Int, pvdestcontext: Long, mshlflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CoReleaseMarshalData(pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CoUnmarshalHresult(pstm: Long, phresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_CoUnmarshalInterface(pstm: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HACCEL_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HACCEL_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HACCEL_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HACCEL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HACCEL_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HACCEL_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HACCEL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HACCEL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HBITMAP_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HBITMAP_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HBITMAP_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HBITMAP_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HBITMAP_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HBITMAP_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HBITMAP_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HBITMAP_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HDC_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HDC_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HDC_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HDC_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HDC_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HDC_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HDC_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HDC_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HGLOBAL_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HGLOBAL_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HGLOBAL_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HGLOBAL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HGLOBAL_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HGLOBAL_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HGLOBAL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HGLOBAL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HICON_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HICON_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HICON_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HICON_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HICON_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HICON_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HICON_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HICON_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HMENU_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HMENU_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HMENU_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HMENU_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HMENU_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HMENU_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HMENU_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HMENU_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HPALETTE_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HPALETTE_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HPALETTE_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HPALETTE_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HPALETTE_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HPALETTE_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HPALETTE_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HPALETTE_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HWND_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HWND_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HWND_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HWND_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HWND_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HWND_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HWND_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_HWND_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_SNB_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_SNB_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_SNB_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_SNB_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_SNB_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_SNB_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_SNB_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_SNB_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long
}

public actual fun BSTR_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_BSTR_UserFree(param0, param1)
}

public actual fun BSTR_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_BSTR_UserFree64(param0, param1)
}

public actual fun BSTR_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_BSTR_UserMarshal(param0, param1, param2)

public actual fun BSTR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_BSTR_UserMarshal64(param0, param1, param2)

public actual fun BSTR_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_BSTR_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun BSTR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_BSTR_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun BSTR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_BSTR_UserUnmarshal(param0, param1, param2)

public actual fun BSTR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_BSTR_UserUnmarshal64(param0, param1, param2)

public actual fun CLIPFORMAT_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserFree(param0, param1)
}

public actual fun CLIPFORMAT_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserFree64(param0, param1)
}

public actual fun CLIPFORMAT_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserMarshal(param0, param1, param2)

public actual fun CLIPFORMAT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserMarshal64(param0, param1, param2)

public actual fun CLIPFORMAT_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun CLIPFORMAT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun CLIPFORMAT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserUnmarshal(param0, param1, param2)

public actual fun CLIPFORMAT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserUnmarshal64(param0, param1, param2)

public actual fun CoGetMarshalSizeMax(pulsize: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CoGetMarshalSizeMax(pulsize, riid, punk, dwdestcontext.toInt(), pvdestcontext, mshlflags.toInt())

public actual fun CoGetStandardMarshal(riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt, ppmarshal: Long): HRESULT =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CoGetStandardMarshal(riid, punk, dwdestcontext.toInt(), pvdestcontext, mshlflags.toInt(), ppmarshal)

public actual fun CoGetStdMarshalEx(punkouter: Long, smexflags: UInt, ppunkinner: Long): HRESULT =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CoGetStdMarshalEx(punkouter, smexflags.toInt(), ppunkinner)

public actual fun CoMarshalHresult(pstm: Long, hresult: HRESULT): HRESULT =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CoMarshalHresult(pstm, hresult)

public actual fun CoMarshalInterThreadInterfaceInStream(riid: Long, punk: Long, ppstm: Long): HRESULT =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CoMarshalInterThreadInterfaceInStream(riid, punk, ppstm)

public actual fun CoMarshalInterface(pstm: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CoMarshalInterface(pstm, riid, punk, dwdestcontext.toInt(), pvdestcontext, mshlflags.toInt())

public actual fun CoReleaseMarshalData(pstm: Long): HRESULT =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CoReleaseMarshalData(pstm)

public actual fun CoUnmarshalHresult(pstm: Long, phresult: Long): HRESULT =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CoUnmarshalHresult(pstm, phresult)

public actual fun CoUnmarshalInterface(pstm: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_CoUnmarshalInterface(pstm, riid, ppv)

public actual fun HACCEL_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HACCEL_UserFree(param0, param1)
}

public actual fun HACCEL_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HACCEL_UserFree64(param0, param1)
}

public actual fun HACCEL_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HACCEL_UserMarshal(param0, param1, param2)

public actual fun HACCEL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HACCEL_UserMarshal64(param0, param1, param2)

public actual fun HACCEL_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HACCEL_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun HACCEL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HACCEL_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun HACCEL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HACCEL_UserUnmarshal(param0, param1, param2)

public actual fun HACCEL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HACCEL_UserUnmarshal64(param0, param1, param2)

public actual fun HBITMAP_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HBITMAP_UserFree(param0, param1)
}

public actual fun HBITMAP_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HBITMAP_UserFree64(param0, param1)
}

public actual fun HBITMAP_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HBITMAP_UserMarshal(param0, param1, param2)

public actual fun HBITMAP_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HBITMAP_UserMarshal64(param0, param1, param2)

public actual fun HBITMAP_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HBITMAP_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun HBITMAP_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HBITMAP_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun HBITMAP_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HBITMAP_UserUnmarshal(param0, param1, param2)

public actual fun HBITMAP_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HBITMAP_UserUnmarshal64(param0, param1, param2)

public actual fun HDC_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HDC_UserFree(param0, param1)
}

public actual fun HDC_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HDC_UserFree64(param0, param1)
}

public actual fun HDC_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HDC_UserMarshal(param0, param1, param2)

public actual fun HDC_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HDC_UserMarshal64(param0, param1, param2)

public actual fun HDC_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HDC_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun HDC_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HDC_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun HDC_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HDC_UserUnmarshal(param0, param1, param2)

public actual fun HDC_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HDC_UserUnmarshal64(param0, param1, param2)

public actual fun HGLOBAL_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserFree(param0, param1)
}

public actual fun HGLOBAL_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserFree64(param0, param1)
}

public actual fun HGLOBAL_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserMarshal(param0, param1, param2)

public actual fun HGLOBAL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserMarshal64(param0, param1, param2)

public actual fun HGLOBAL_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun HGLOBAL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun HGLOBAL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserUnmarshal(param0, param1, param2)

public actual fun HGLOBAL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserUnmarshal64(param0, param1, param2)

public actual fun HICON_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HICON_UserFree(param0, param1)
}

public actual fun HICON_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HICON_UserFree64(param0, param1)
}

public actual fun HICON_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HICON_UserMarshal(param0, param1, param2)

public actual fun HICON_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HICON_UserMarshal64(param0, param1, param2)

public actual fun HICON_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HICON_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun HICON_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HICON_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun HICON_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HICON_UserUnmarshal(param0, param1, param2)

public actual fun HICON_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HICON_UserUnmarshal64(param0, param1, param2)

public actual fun HMENU_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HMENU_UserFree(param0, param1)
}

public actual fun HMENU_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HMENU_UserFree64(param0, param1)
}

public actual fun HMENU_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HMENU_UserMarshal(param0, param1, param2)

public actual fun HMENU_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HMENU_UserMarshal64(param0, param1, param2)

public actual fun HMENU_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HMENU_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun HMENU_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HMENU_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun HMENU_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HMENU_UserUnmarshal(param0, param1, param2)

public actual fun HMENU_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HMENU_UserUnmarshal64(param0, param1, param2)

public actual fun HPALETTE_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HPALETTE_UserFree(param0, param1)
}

public actual fun HPALETTE_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HPALETTE_UserFree64(param0, param1)
}

public actual fun HPALETTE_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HPALETTE_UserMarshal(param0, param1, param2)

public actual fun HPALETTE_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HPALETTE_UserMarshal64(param0, param1, param2)

public actual fun HPALETTE_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HPALETTE_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun HPALETTE_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HPALETTE_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun HPALETTE_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HPALETTE_UserUnmarshal(param0, param1, param2)

public actual fun HPALETTE_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HPALETTE_UserUnmarshal64(param0, param1, param2)

public actual fun HWND_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HWND_UserFree(param0, param1)
}

public actual fun HWND_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HWND_UserFree64(param0, param1)
}

public actual fun HWND_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HWND_UserMarshal(param0, param1, param2)

public actual fun HWND_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HWND_UserMarshal64(param0, param1, param2)

public actual fun HWND_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HWND_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun HWND_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HWND_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun HWND_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HWND_UserUnmarshal(param0, param1, param2)

public actual fun HWND_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_HWND_UserUnmarshal64(param0, param1, param2)

public actual fun LPSAFEARRAY_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserFree(param0, param1)
}

public actual fun LPSAFEARRAY_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserFree64(param0, param1)
}

public actual fun LPSAFEARRAY_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserMarshal(param0, param1, param2)

public actual fun LPSAFEARRAY_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserMarshal64(param0, param1, param2)

public actual fun LPSAFEARRAY_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun LPSAFEARRAY_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun LPSAFEARRAY_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserUnmarshal(param0, param1, param2)

public actual fun LPSAFEARRAY_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserUnmarshal64(param0, param1, param2)

public actual fun SNB_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_SNB_UserFree(param0, param1)
}

public actual fun SNB_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_SNB_UserFree64(param0, param1)
}

public actual fun SNB_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_SNB_UserMarshal(param0, param1, param2)

public actual fun SNB_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_SNB_UserMarshal64(param0, param1, param2)

public actual fun SNB_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_SNB_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun SNB_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_SNB_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun SNB_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_SNB_UserUnmarshal(param0, param1, param2)

public actual fun SNB_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_SNB_UserUnmarshal64(param0, param1, param2)

public actual fun STGMEDIUM_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserFree(param0, param1)
}

public actual fun STGMEDIUM_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserFree64(param0, param1)
}

public actual fun STGMEDIUM_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserMarshal(param0, param1, param2)

public actual fun STGMEDIUM_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserMarshal64(param0, param1, param2)

public actual fun STGMEDIUM_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun STGMEDIUM_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun STGMEDIUM_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserUnmarshal(param0, param1, param2)

public actual fun STGMEDIUM_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserUnmarshal64(param0, param1, param2)
