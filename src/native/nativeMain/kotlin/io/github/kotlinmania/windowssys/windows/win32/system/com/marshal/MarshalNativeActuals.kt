@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_bstrUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_bstrUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_bstrUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_bstrUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_bstrUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_bstrUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_clipformatUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_clipformatUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_clipformatUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_clipformatUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_clipformatUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_clipformatUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_coGetMarshalSizeMax
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_coGetStandardMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_coGetStdMarshalEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_coMarshalHresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_coMarshalInterThreadInterfaceInStream
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_coMarshalInterface
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_coReleaseMarshalData
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_coUnmarshalHresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_coUnmarshalInterface
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_haccelUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_haccelUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_haccelUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_haccelUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_haccelUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_haccelUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hbitmapUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hbitmapUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hbitmapUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hbitmapUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hdcUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hdcUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hdcUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hdcUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hdcUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hdcUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hglobalUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hglobalUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hglobalUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hglobalUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hglobalUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hglobalUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hiconUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hiconUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hiconUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hiconUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hiconUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hiconUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hmenuUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hmenuUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hmenuUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hmenuUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hmenuUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hmenuUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hpaletteUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hpaletteUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hpaletteUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hpaletteUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hwndUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hwndUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hwndUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hwndUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hwndUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hwndUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_snbUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_snbUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_snbUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_snbUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_snbUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_snbUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_snbUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_snbUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_stgmediumUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_stgmediumUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_stgmediumUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_stgmediumUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal64
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun bstrUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_bstrUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun bstrUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_bstrUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun bstrUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_bstrUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bstrUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_bstrUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bstrUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_bstrUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun bstrUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_bstrUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun bstrUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bstrUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clipformatUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_clipformatUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun clipformatUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_clipformatUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun clipformatUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_clipformatUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clipformatUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_clipformatUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clipformatUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_clipformatUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun clipformatUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_clipformatUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun clipformatUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clipformatUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun coGetMarshalSizeMax(pulsize: COpaquePointer?, riid: COpaquePointer?, punk: COpaquePointer?, dwdestcontext: UInt, pvdestcontext: COpaquePointer?, mshlflags: UInt): Hresult =
    windowssys_windows_win32_system_com_marshal_coGetMarshalSizeMax(pulsize?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), punk?.value?.toCPointer<ByteVar>(), dwdestcontext, pvdestcontext?.value?.toCPointer<ByteVar>(), mshlflags)

public actual fun coGetStandardMarshal(riid: COpaquePointer?, punk: COpaquePointer?, dwdestcontext: UInt, pvdestcontext: COpaquePointer?, mshlflags: UInt, ppmarshal: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_marshal_coGetStandardMarshal(riid?.value?.toCPointer<ByteVar>(), punk?.value?.toCPointer<ByteVar>(), dwdestcontext, pvdestcontext?.value?.toCPointer<ByteVar>(), mshlflags, ppmarshal?.value?.toCPointer<ByteVar>())

public actual fun coGetStdMarshalEx(punkouter: COpaquePointer?, smexflags: UInt, ppunkinner: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_marshal_coGetStdMarshalEx(punkouter?.value?.toCPointer<ByteVar>(), smexflags, ppunkinner?.value?.toCPointer<ByteVar>())

public actual fun coMarshalHresult(pstm: COpaquePointer?, hresult: Hresult): Hresult =
    windowssys_windows_win32_system_com_marshal_coMarshalHresult(pstm?.value?.toCPointer<ByteVar>(), hresult)

public actual fun coMarshalInterThreadInterfaceInStream(riid: COpaquePointer?, punk: COpaquePointer?, ppstm: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_marshal_coMarshalInterThreadInterfaceInStream(riid?.value?.toCPointer<ByteVar>(), punk?.value?.toCPointer<ByteVar>(), ppstm?.value?.toCPointer<ByteVar>())

public actual fun coMarshalInterface(pstm: COpaquePointer?, riid: COpaquePointer?, punk: COpaquePointer?, dwdestcontext: UInt, pvdestcontext: COpaquePointer?, mshlflags: UInt): Hresult =
    windowssys_windows_win32_system_com_marshal_coMarshalInterface(pstm?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), punk?.value?.toCPointer<ByteVar>(), dwdestcontext, pvdestcontext?.value?.toCPointer<ByteVar>(), mshlflags)

public actual fun coReleaseMarshalData(pstm: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_marshal_coReleaseMarshalData(pstm?.value?.toCPointer<ByteVar>())

public actual fun coUnmarshalHresult(pstm: COpaquePointer?, phresult: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_marshal_coUnmarshalHresult(pstm?.value?.toCPointer<ByteVar>(), phresult?.value?.toCPointer<ByteVar>())

public actual fun coUnmarshalInterface(pstm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_marshal_coUnmarshalInterface(pstm?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun haccelUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_haccelUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun haccelUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_haccelUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun haccelUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_haccelUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun haccelUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_haccelUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun haccelUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_haccelUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun haccelUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_haccelUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun haccelUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun haccelUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hbitmapUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hbitmapUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hbitmapUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hbitmapUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hbitmapUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hbitmapUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hbitmapUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hbitmapUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hbitmapUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hbitmapUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hbitmapUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hbitmapUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hdcUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hdcUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hdcUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hdcUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hdcUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hdcUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hdcUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hdcUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hdcUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hdcUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hdcUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hdcUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hdcUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hdcUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hglobalUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hglobalUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hglobalUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hglobalUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hglobalUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hglobalUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hglobalUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hglobalUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hglobalUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hglobalUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hglobalUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hglobalUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hglobalUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hglobalUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hiconUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hiconUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hiconUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hiconUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hiconUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hiconUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hiconUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hiconUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hiconUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hiconUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hiconUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hiconUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hiconUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hiconUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hmenuUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hmenuUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hmenuUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hmenuUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hmenuUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hmenuUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hmenuUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hmenuUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hmenuUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hmenuUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hmenuUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hmenuUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hmenuUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hmenuUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hpaletteUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hpaletteUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hpaletteUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hpaletteUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hpaletteUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hpaletteUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hpaletteUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hpaletteUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hpaletteUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hpaletteUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hpaletteUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hpaletteUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hwndUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hwndUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hwndUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_hwndUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hwndUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hwndUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hwndUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hwndUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hwndUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hwndUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hwndUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_hwndUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hwndUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hwndUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lpsafearrayUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun lpsafearrayUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun lpsafearrayUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lpsafearrayUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lpsafearrayUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun lpsafearrayUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun lpsafearrayUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lpsafearrayUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun snbUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_snbUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun snbUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_snbUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun snbUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_snbUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun snbUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_snbUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun snbUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_snbUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun snbUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_snbUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun snbUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_snbUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun snbUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_snbUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun stgmediumUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_stgmediumUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun stgmediumUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    windowssys_windows_win32_system_com_marshal_stgmediumUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun stgmediumUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun stgmediumUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun stgmediumUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_stgmediumUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun stgmediumUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    windowssys_windows_win32_system_com_marshal_stgmediumUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun stgmediumUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun stgmediumUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }
