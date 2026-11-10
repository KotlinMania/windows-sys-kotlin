@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dMOEnum(guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?, ppenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_dMOEnum(guidcategory?.value?.toCPointer<ByteVar>(), dwflags, cintypes, pintypes?.value?.toCPointer<ByteVar>(), couttypes, pouttypes?.value?.toCPointer<ByteVar>(), ppenum?.value?.toCPointer<ByteVar>())

public actual fun dMOGetName(clsiddmo: COpaquePointer?, szname: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_dMOGetName(clsiddmo?.value?.toCPointer<ByteVar>(), szname?.value?.toCPointer<ByteVar>())

public actual fun dMOGetTypes(clsiddmo: COpaquePointer?, ulinputtypesrequested: UInt, pulinputtypessupplied: COpaquePointer?, pinputtypes: COpaquePointer?, uloutputtypesrequested: UInt, puloutputtypessupplied: COpaquePointer?, poutputtypes: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_dMOGetTypes(clsiddmo?.value?.toCPointer<ByteVar>(), ulinputtypesrequested, pulinputtypessupplied?.value?.toCPointer<ByteVar>(), pinputtypes?.value?.toCPointer<ByteVar>(), uloutputtypesrequested, puloutputtypessupplied?.value?.toCPointer<ByteVar>(), poutputtypes?.value?.toCPointer<ByteVar>())

public actual fun dMORegister(szname: Pcwstr, clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_dMORegister(szname?.value?.toCPointer<ByteVar>(), clsiddmo?.value?.toCPointer<ByteVar>(), guidcategory?.value?.toCPointer<ByteVar>(), dwflags, cintypes, pintypes?.value?.toCPointer<ByteVar>(), couttypes, pouttypes?.value?.toCPointer<ByteVar>())

public actual fun dMOUnregister(clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_dMOUnregister(clsiddmo?.value?.toCPointer<ByteVar>(), guidcategory?.value?.toCPointer<ByteVar>())

public actual fun moCopyMediaType(pmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_moCopyMediaType(pmtdest?.value?.toCPointer<ByteVar>(), pmtsrc?.value?.toCPointer<ByteVar>())

public actual fun moCreateMediaType(ppmt: COpaquePointer?, cbformat: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_moCreateMediaType(ppmt?.value?.toCPointer<ByteVar>(), cbformat)

public actual fun moDeleteMediaType(pmt: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_moDeleteMediaType(pmt?.value?.toCPointer<ByteVar>())

public actual fun moDuplicateMediaType(ppmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_moDuplicateMediaType(ppmtdest?.value?.toCPointer<ByteVar>(), pmtsrc?.value?.toCPointer<ByteVar>())

public actual fun moFreeMediaType(pmt: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_moFreeMediaType(pmt?.value?.toCPointer<ByteVar>())

public actual fun moInitMediaType(pmt: COpaquePointer?, cbformat: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssys_windows_win32_media_dxmediaobjects_moInitMediaType(pmt?.value?.toCPointer<ByteVar>(), cbformat)
