@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32MediaDxmediaobjectsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_dMOEnum(guidcategory: Long, dwflags: Int, cintypes: Int, pintypes: Long, couttypes: Int, pouttypes: Long, ppenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_dMOGetName(clsiddmo: Long, szname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_dMOGetTypes(clsiddmo: Long, ulinputtypesrequested: Int, pulinputtypessupplied: Long, pinputtypes: Long, uloutputtypesrequested: Int, puloutputtypessupplied: Long, poutputtypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_dMORegister(szname: Long, clsiddmo: Long, guidcategory: Long, dwflags: Int, cintypes: Int, pintypes: Long, couttypes: Int, pouttypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_dMOUnregister(clsiddmo: Long, guidcategory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_moCopyMediaType(pmtdest: Long, pmtsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_moCreateMediaType(ppmt: Long, cbformat: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_moDeleteMediaType(pmt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_moDuplicateMediaType(ppmtdest: Long, pmtsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_moFreeMediaType(pmt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_moInitMediaType(pmt: Long, cbformat: Int): Int
}

public actual fun dMOEnum(guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?, ppenum: COpaquePointer?): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_dMOEnum((guidcategory?.value ?: 0L), dwflags.toInt(), cintypes.toInt(), (pintypes?.value ?: 0L), couttypes.toInt(), (pouttypes?.value ?: 0L), (ppenum?.value ?: 0L))

public actual fun dMOGetName(clsiddmo: COpaquePointer?, szname: Pwstr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_dMOGetName((clsiddmo?.value ?: 0L), (szname?.value ?: 0L))

public actual fun dMOGetTypes(clsiddmo: COpaquePointer?, ulinputtypesrequested: UInt, pulinputtypessupplied: COpaquePointer?, pinputtypes: COpaquePointer?, uloutputtypesrequested: UInt, puloutputtypessupplied: COpaquePointer?, poutputtypes: COpaquePointer?): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_dMOGetTypes((clsiddmo?.value ?: 0L), ulinputtypesrequested.toInt(), (pulinputtypessupplied?.value ?: 0L), (pinputtypes?.value ?: 0L), uloutputtypesrequested.toInt(), (puloutputtypessupplied?.value ?: 0L), (poutputtypes?.value ?: 0L))

public actual fun dMORegister(szname: Pcwstr, clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_dMORegister((szname?.value ?: 0L), (clsiddmo?.value ?: 0L), (guidcategory?.value ?: 0L), dwflags.toInt(), cintypes.toInt(), (pintypes?.value ?: 0L), couttypes.toInt(), (pouttypes?.value ?: 0L))

public actual fun dMOUnregister(clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_dMOUnregister((clsiddmo?.value ?: 0L), (guidcategory?.value ?: 0L))

public actual fun moCopyMediaType(pmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_moCopyMediaType((pmtdest?.value ?: 0L), (pmtsrc?.value ?: 0L))

public actual fun moCreateMediaType(ppmt: COpaquePointer?, cbformat: UInt): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_moCreateMediaType((ppmt?.value ?: 0L), cbformat.toInt())

public actual fun moDeleteMediaType(pmt: COpaquePointer?): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_moDeleteMediaType((pmt?.value ?: 0L))

public actual fun moDuplicateMediaType(ppmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_moDuplicateMediaType((ppmtdest?.value ?: 0L), (pmtsrc?.value ?: 0L))

public actual fun moFreeMediaType(pmt: COpaquePointer?): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_moFreeMediaType((pmt?.value ?: 0L))

public actual fun moInitMediaType(pmt: COpaquePointer?, cbformat: UInt): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_moInitMediaType((pmt?.value ?: 0L), cbformat.toInt())
