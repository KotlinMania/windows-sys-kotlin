@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalBstrUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalBstrUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalBstrUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalBstrUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalBstrUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalBstrUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalClipformatUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalClipformatUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalClipformatUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalClipformatUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalClipformatUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalClipformatUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalCoGetStandardMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalCoMarshalHresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalCoMarshalInterface
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalCoReleaseMarshalData
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalCoUnmarshalHresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalCoUnmarshalInterface
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHaccelUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHaccelUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHaccelUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHaccelUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHaccelUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHaccelUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHbitmapUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHbitmapUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHbitmapUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHbitmapUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHdcUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHdcUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHdcUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHdcUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHdcUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHdcUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHglobalUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHglobalUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHglobalUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHglobalUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHglobalUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHglobalUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHiconUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHiconUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHiconUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHiconUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHiconUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHiconUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHmenuUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHmenuUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHmenuUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHmenuUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHmenuUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHmenuUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHpaletteUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHpaletteUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHpaletteUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHpaletteUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHwndUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHwndUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHwndUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHwndUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHwndUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHwndUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalSnbUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalSnbUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalSnbUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalSnbUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalSnbUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalSnbUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalStgmediumUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalStgmediumUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalStgmediumUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalStgmediumUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.com.marshal.cinterop.windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun bstrUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Bstr>) {
    windowssysWindowsWin32SystemComMarshalBstrUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun bstrUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Bstr>) {
    windowssysWindowsWin32SystemComMarshalBstrUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun bstrUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Bstr>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalBstrUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun bstrUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Bstr>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalBstrUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun bstrUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Bstr>): UInt =
    windowssysWindowsWin32SystemComMarshalBstrUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun bstrUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Bstr>): UInt =
    windowssysWindowsWin32SystemComMarshalBstrUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun bstrUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Bstr>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun bstrUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Bstr>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clipformatUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<UShort>) {
    windowssysWindowsWin32SystemComMarshalClipformatUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun clipformatUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<UShort>) {
    windowssysWindowsWin32SystemComMarshalClipformatUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun clipformatUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<UShort>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalClipformatUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clipformatUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<UShort>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalClipformatUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clipformatUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<UShort>): UInt =
    windowssysWindowsWin32SystemComMarshalClipformatUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun clipformatUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<UShort>): UInt =
    windowssysWindowsWin32SystemComMarshalClipformatUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun clipformatUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<UShort>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clipformatUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<UShort>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun coGetMarshalSizeMax(pulsize: MutPtr<UInt>, riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt): Hresult =
    windowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax(pulsize.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), punk.rawAddress.toCPointer<ByteVar>(), dwdestcontext, pvdestcontext.rawAddress.toCPointer<ByteVar>(), mshlflags)

public actual fun coGetStandardMarshal(riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt, ppmarshal: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemComMarshalCoGetStandardMarshal(riid.rawAddress.toCPointer<ByteVar>(), punk.rawAddress.toCPointer<ByteVar>(), dwdestcontext, pvdestcontext.rawAddress.toCPointer<ByteVar>(), mshlflags, ppmarshal.rawAddress.toCPointer<ByteVar>())

public actual fun coGetStdMarshalEx(punkouter: MutPtr<CVoid>, smexflags: UInt, ppunkinner: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx(punkouter.rawAddress.toCPointer<ByteVar>(), smexflags, ppunkinner.rawAddress.toCPointer<ByteVar>())

public actual fun coMarshalHresult(pstm: MutPtr<CVoid>, hresult: Hresult): Hresult =
    windowssysWindowsWin32SystemComMarshalCoMarshalHresult(pstm.rawAddress.toCPointer<ByteVar>(), hresult)

public actual fun coMarshalInterThreadInterfaceInStream(riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream(riid.rawAddress.toCPointer<ByteVar>(), punk.rawAddress.toCPointer<ByteVar>(), ppstm.rawAddress.toCPointer<ByteVar>())

public actual fun coMarshalInterface(pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt): Hresult =
    windowssysWindowsWin32SystemComMarshalCoMarshalInterface(pstm.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), punk.rawAddress.toCPointer<ByteVar>(), dwdestcontext, pvdestcontext.rawAddress.toCPointer<ByteVar>(), mshlflags)

public actual fun coReleaseMarshalData(pstm: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComMarshalCoReleaseMarshalData(pstm.rawAddress.toCPointer<ByteVar>())

public actual fun coUnmarshalHresult(pstm: MutPtr<CVoid>, phresult: MutPtr<Hresult>): Hresult =
    windowssysWindowsWin32SystemComMarshalCoUnmarshalHresult(pstm.rawAddress.toCPointer<ByteVar>(), phresult.rawAddress.toCPointer<ByteVar>())

public actual fun coUnmarshalInterface(pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemComMarshalCoUnmarshalInterface(pstm.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun haccelUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Haccel>) {
    windowssysWindowsWin32SystemComMarshalHaccelUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun haccelUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Haccel>) {
    windowssysWindowsWin32SystemComMarshalHaccelUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun haccelUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Haccel>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHaccelUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun haccelUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Haccel>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHaccelUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun haccelUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Haccel>): UInt =
    windowssysWindowsWin32SystemComMarshalHaccelUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun haccelUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Haccel>): UInt =
    windowssysWindowsWin32SystemComMarshalHaccelUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun haccelUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Haccel>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun haccelUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Haccel>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hbitmapUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hbitmap>) {
    windowssysWindowsWin32SystemComMarshalHbitmapUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hbitmapUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hbitmap>) {
    windowssysWindowsWin32SystemComMarshalHbitmapUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hbitmapUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hbitmap>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hbitmapUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hbitmap>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hbitmapUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hbitmap>): UInt =
    windowssysWindowsWin32SystemComMarshalHbitmapUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hbitmapUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hbitmap>): UInt =
    windowssysWindowsWin32SystemComMarshalHbitmapUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hbitmapUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hbitmap>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hbitmapUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hbitmap>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hdcUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hdc>) {
    windowssysWindowsWin32SystemComMarshalHdcUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hdcUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hdc>) {
    windowssysWindowsWin32SystemComMarshalHdcUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hdcUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hdc>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHdcUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hdcUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hdc>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHdcUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hdcUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hdc>): UInt =
    windowssysWindowsWin32SystemComMarshalHdcUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hdcUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hdc>): UInt =
    windowssysWindowsWin32SystemComMarshalHdcUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hdcUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hdc>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hdcUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hdc>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hglobalUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hglobal>) {
    windowssysWindowsWin32SystemComMarshalHglobalUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hglobalUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hglobal>) {
    windowssysWindowsWin32SystemComMarshalHglobalUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hglobalUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hglobal>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHglobalUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hglobalUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hglobal>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHglobalUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hglobalUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hglobal>): UInt =
    windowssysWindowsWin32SystemComMarshalHglobalUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hglobalUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hglobal>): UInt =
    windowssysWindowsWin32SystemComMarshalHglobalUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hglobalUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hglobal>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hglobalUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hglobal>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hiconUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hicon>) {
    windowssysWindowsWin32SystemComMarshalHiconUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hiconUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hicon>) {
    windowssysWindowsWin32SystemComMarshalHiconUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hiconUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hicon>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHiconUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hiconUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hicon>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHiconUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hiconUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hicon>): UInt =
    windowssysWindowsWin32SystemComMarshalHiconUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hiconUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hicon>): UInt =
    windowssysWindowsWin32SystemComMarshalHiconUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hiconUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hicon>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hiconUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hicon>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hmenuUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hmenu>) {
    windowssysWindowsWin32SystemComMarshalHmenuUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hmenuUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hmenu>) {
    windowssysWindowsWin32SystemComMarshalHmenuUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hmenuUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmenu>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHmenuUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hmenuUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmenu>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHmenuUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hmenuUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmenu>): UInt =
    windowssysWindowsWin32SystemComMarshalHmenuUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hmenuUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmenu>): UInt =
    windowssysWindowsWin32SystemComMarshalHmenuUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hmenuUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmenu>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hmenuUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmenu>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hpaletteUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hpalette>) {
    windowssysWindowsWin32SystemComMarshalHpaletteUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hpaletteUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hpalette>) {
    windowssysWindowsWin32SystemComMarshalHpaletteUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hpaletteUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hpalette>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hpaletteUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hpalette>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hpaletteUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hpalette>): UInt =
    windowssysWindowsWin32SystemComMarshalHpaletteUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hpaletteUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hpalette>): UInt =
    windowssysWindowsWin32SystemComMarshalHpaletteUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hpaletteUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hpalette>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hpaletteUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hpalette>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hwndUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hwnd>) {
    windowssysWindowsWin32SystemComMarshalHwndUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hwndUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hwnd>) {
    windowssysWindowsWin32SystemComMarshalHwndUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun hwndUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hwnd>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHwndUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hwndUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hwnd>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHwndUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hwndUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hwnd>): UInt =
    windowssysWindowsWin32SystemComMarshalHwndUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hwndUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hwnd>): UInt =
    windowssysWindowsWin32SystemComMarshalHwndUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun hwndUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hwnd>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hwndUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hwnd>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lpsafearrayUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<Safearray>>) {
    windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun lpsafearrayUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<Safearray>>) {
    windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun lpsafearrayUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<Safearray>>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lpsafearrayUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<Safearray>>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lpsafearrayUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<Safearray>>): UInt =
    windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun lpsafearrayUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<Safearray>>): UInt =
    windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun lpsafearrayUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<Safearray>>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lpsafearrayUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<Safearray>>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun snbUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<ConstPtr<UShort>>>) {
    windowssysWindowsWin32SystemComMarshalSnbUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun snbUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<ConstPtr<UShort>>>) {
    windowssysWindowsWin32SystemComMarshalSnbUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun snbUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalSnbUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun snbUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalSnbUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun snbUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): UInt =
    windowssysWindowsWin32SystemComMarshalSnbUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun snbUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): UInt =
    windowssysWindowsWin32SystemComMarshalSnbUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun snbUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<MutPtr<UShort>>>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun snbUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<MutPtr<UShort>>>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun stgmediumUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Stgmedium>) {
    windowssysWindowsWin32SystemComMarshalStgmediumUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun stgmediumUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Stgmedium>) {
    windowssysWindowsWin32SystemComMarshalStgmediumUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun stgmediumUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Stgmedium>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun stgmediumUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Stgmedium>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun stgmediumUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Stgmedium>): UInt =
    windowssysWindowsWin32SystemComMarshalStgmediumUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun stgmediumUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Stgmedium>): UInt =
    windowssysWindowsWin32SystemComMarshalStgmediumUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun stgmediumUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Stgmedium>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun stgmediumUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Stgmedium>): MutPtr<UByte> =
    MutPtr(windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)
