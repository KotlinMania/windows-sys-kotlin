@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DMOEnum(guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long, ppenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_DMOEnum(guidcategory.toCPointer<ByteVar>(), dwflags, cintypes, pintypes.toCPointer<ByteVar>(), couttypes, pouttypes.toCPointer<ByteVar>(), ppenum.toCPointer<ByteVar>())

public actual fun DMOGetName(clsiddmo: Long, szname: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_DMOGetName(clsiddmo.toCPointer<ByteVar>(), szname.toCPointer<ByteVar>())

public actual fun DMOGetTypes(clsiddmo: Long, ulinputtypesrequested: UInt, pulinputtypessupplied: Long, pinputtypes: Long, uloutputtypesrequested: UInt, puloutputtypessupplied: Long, poutputtypes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_DMOGetTypes(clsiddmo.toCPointer<ByteVar>(), ulinputtypesrequested, pulinputtypessupplied.toCPointer<ByteVar>(), pinputtypes.toCPointer<ByteVar>(), uloutputtypesrequested, puloutputtypessupplied.toCPointer<ByteVar>(), poutputtypes.toCPointer<ByteVar>())

public actual fun DMORegister(szname: PCWSTR, clsiddmo: Long, guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_DMORegister(szname.toCPointer<ByteVar>(), clsiddmo.toCPointer<ByteVar>(), guidcategory.toCPointer<ByteVar>(), dwflags, cintypes, pintypes.toCPointer<ByteVar>(), couttypes, pouttypes.toCPointer<ByteVar>())

public actual fun DMOUnregister(clsiddmo: Long, guidcategory: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_DMOUnregister(clsiddmo.toCPointer<ByteVar>(), guidcategory.toCPointer<ByteVar>())

public actual fun MoCopyMediaType(pmtdest: Long, pmtsrc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_MoCopyMediaType(pmtdest.toCPointer<ByteVar>(), pmtsrc.toCPointer<ByteVar>())

public actual fun MoCreateMediaType(ppmt: Long, cbformat: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_MoCreateMediaType(ppmt.toCPointer<ByteVar>(), cbformat)

public actual fun MoDeleteMediaType(pmt: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_MoDeleteMediaType(pmt.toCPointer<ByteVar>())

public actual fun MoDuplicateMediaType(ppmtdest: Long, pmtsrc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_MoDuplicateMediaType(ppmtdest.toCPointer<ByteVar>(), pmtsrc.toCPointer<ByteVar>())

public actual fun MoFreeMediaType(pmt: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_MoFreeMediaType(pmt.toCPointer<ByteVar>())

public actual fun MoInitMediaType(pmt: Long, cbformat: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_MoInitMediaType(pmt.toCPointer<ByteVar>(), cbformat)
