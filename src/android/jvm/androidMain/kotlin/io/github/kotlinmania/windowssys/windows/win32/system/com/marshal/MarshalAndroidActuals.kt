@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult

private object WindowsWin32SystemComMarshalJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_bstrUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_bstrUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_bstrUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_bstrUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_bstrUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_bstrUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_clipformatUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_clipformatUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_clipformatUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_clipformatUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_clipformatUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_clipformatUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_coGetMarshalSizeMax(pulsize: Long, riid: Long, punk: Long, dwdestcontext: Int, pvdestcontext: Long, mshlflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_coGetStandardMarshal(riid: Long, punk: Long, dwdestcontext: Int, pvdestcontext: Long, mshlflags: Int, ppmarshal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_coGetStdMarshalEx(punkouter: Long, smexflags: Int, ppunkinner: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_coMarshalHresult(pstm: Long, hresult: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_coMarshalInterThreadInterfaceInStream(riid: Long, punk: Long, ppstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_coMarshalInterface(pstm: Long, riid: Long, punk: Long, dwdestcontext: Int, pvdestcontext: Long, mshlflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_coReleaseMarshalData(pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_coUnmarshalHresult(pstm: Long, phresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_coUnmarshalInterface(pstm: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_haccelUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_haccelUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_haccelUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_haccelUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_haccelUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_haccelUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hbitmapUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hbitmapUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hbitmapUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hbitmapUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hdcUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hdcUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hdcUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hdcUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hdcUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hdcUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hglobalUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hglobalUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hglobalUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hglobalUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hglobalUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hglobalUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hiconUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hiconUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hiconUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hiconUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hiconUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hiconUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hmenuUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hmenuUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hmenuUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hmenuUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hmenuUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hmenuUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hpaletteUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hpaletteUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hpaletteUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hpaletteUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hwndUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hwndUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hwndUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hwndUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hwndUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hwndUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_snbUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_snbUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_snbUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_snbUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_snbUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_snbUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_snbUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_snbUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_stgmediumUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_stgmediumUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_stgmediumUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_stgmediumUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long
}

public actual fun bstrUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_bstrUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun bstrUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_bstrUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun bstrUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_bstrUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bstrUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_bstrUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bstrUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_bstrUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun bstrUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_bstrUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun bstrUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bstrUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clipformatUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_clipformatUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun clipformatUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_clipformatUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun clipformatUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_clipformatUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clipformatUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_clipformatUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clipformatUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_clipformatUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun clipformatUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_clipformatUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun clipformatUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clipformatUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun coGetMarshalSizeMax(pulsize: COpaquePointer?, riid: COpaquePointer?, punk: COpaquePointer?, dwdestcontext: UInt, pvdestcontext: COpaquePointer?, mshlflags: UInt): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_coGetMarshalSizeMax((pulsize?.value ?: 0L), (riid?.value ?: 0L), (punk?.value ?: 0L), dwdestcontext.toInt(), (pvdestcontext?.value ?: 0L), mshlflags.toInt())

public actual fun coGetStandardMarshal(riid: COpaquePointer?, punk: COpaquePointer?, dwdestcontext: UInt, pvdestcontext: COpaquePointer?, mshlflags: UInt, ppmarshal: COpaquePointer?): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_coGetStandardMarshal((riid?.value ?: 0L), (punk?.value ?: 0L), dwdestcontext.toInt(), (pvdestcontext?.value ?: 0L), mshlflags.toInt(), (ppmarshal?.value ?: 0L))

public actual fun coGetStdMarshalEx(punkouter: COpaquePointer?, smexflags: UInt, ppunkinner: COpaquePointer?): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_coGetStdMarshalEx((punkouter?.value ?: 0L), smexflags.toInt(), (ppunkinner?.value ?: 0L))

public actual fun coMarshalHresult(pstm: COpaquePointer?, hresult: Hresult): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_coMarshalHresult((pstm?.value ?: 0L), hresult)

public actual fun coMarshalInterThreadInterfaceInStream(riid: COpaquePointer?, punk: COpaquePointer?, ppstm: COpaquePointer?): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_coMarshalInterThreadInterfaceInStream((riid?.value ?: 0L), (punk?.value ?: 0L), (ppstm?.value ?: 0L))

public actual fun coMarshalInterface(pstm: COpaquePointer?, riid: COpaquePointer?, punk: COpaquePointer?, dwdestcontext: UInt, pvdestcontext: COpaquePointer?, mshlflags: UInt): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_coMarshalInterface((pstm?.value ?: 0L), (riid?.value ?: 0L), (punk?.value ?: 0L), dwdestcontext.toInt(), (pvdestcontext?.value ?: 0L), mshlflags.toInt())

public actual fun coReleaseMarshalData(pstm: COpaquePointer?): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_coReleaseMarshalData((pstm?.value ?: 0L))

public actual fun coUnmarshalHresult(pstm: COpaquePointer?, phresult: COpaquePointer?): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_coUnmarshalHresult((pstm?.value ?: 0L), (phresult?.value ?: 0L))

public actual fun coUnmarshalInterface(pstm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_coUnmarshalInterface((pstm?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun haccelUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_haccelUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun haccelUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_haccelUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun haccelUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_haccelUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun haccelUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_haccelUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun haccelUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_haccelUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun haccelUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_haccelUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun haccelUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun haccelUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hbitmapUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hbitmapUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hbitmapUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hbitmapUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hbitmapUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hbitmapUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hbitmapUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hbitmapUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hbitmapUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hbitmapUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hbitmapUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hbitmapUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hdcUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hdcUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hdcUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hdcUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hdcUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hdcUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hdcUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hdcUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hdcUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hdcUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hdcUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hdcUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hdcUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hdcUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hglobalUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hglobalUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hglobalUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hglobalUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hglobalUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hglobalUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hglobalUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hglobalUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hglobalUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hglobalUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hglobalUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hglobalUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hglobalUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hglobalUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hiconUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hiconUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hiconUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hiconUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hiconUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hiconUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hiconUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hiconUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hiconUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hiconUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hiconUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hiconUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hiconUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hiconUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hmenuUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hmenuUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hmenuUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hmenuUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hmenuUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hmenuUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hmenuUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hmenuUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hmenuUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hmenuUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hmenuUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hmenuUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hmenuUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hmenuUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hpaletteUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hpaletteUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hpaletteUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hpaletteUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hpaletteUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hpaletteUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hpaletteUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hpaletteUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hpaletteUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hpaletteUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hpaletteUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hpaletteUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hwndUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hwndUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hwndUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hwndUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hwndUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hwndUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hwndUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hwndUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hwndUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hwndUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hwndUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hwndUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hwndUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hwndUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lpsafearrayUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun lpsafearrayUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun lpsafearrayUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lpsafearrayUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lpsafearrayUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun lpsafearrayUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun lpsafearrayUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lpsafearrayUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun snbUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_snbUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun snbUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_snbUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun snbUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_snbUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun snbUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_snbUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun snbUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_snbUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun snbUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_snbUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun snbUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_snbUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun snbUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_snbUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stgmediumUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_stgmediumUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun stgmediumUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_stgmediumUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun stgmediumUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stgmediumUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stgmediumUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_stgmediumUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun stgmediumUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_stgmediumUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun stgmediumUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stgmediumUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComMarshalJniBridge.windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }
