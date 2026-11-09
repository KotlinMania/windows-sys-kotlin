@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private object WindowsWin32MediaDxmediaobjectsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_DMOEnum(guidcategory: Long, dwflags: Int, cintypes: Int, pintypes: Long, couttypes: Int, pouttypes: Long, ppenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_DMOGetName(clsiddmo: Long, szname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_DMOGetTypes(clsiddmo: Long, ulinputtypesrequested: Int, pulinputtypessupplied: Long, pinputtypes: Long, uloutputtypesrequested: Int, puloutputtypessupplied: Long, poutputtypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_DMORegister(szname: Long, clsiddmo: Long, guidcategory: Long, dwflags: Int, cintypes: Int, pintypes: Long, couttypes: Int, pouttypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_DMOUnregister(clsiddmo: Long, guidcategory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_MoCopyMediaType(pmtdest: Long, pmtsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_MoCreateMediaType(ppmt: Long, cbformat: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_MoDeleteMediaType(pmt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_MoDuplicateMediaType(ppmtdest: Long, pmtsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_MoFreeMediaType(pmt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_dxmediaobjects_MoInitMediaType(pmt: Long, cbformat: Int): Int
}

public actual fun DMOEnum(guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long, ppenum: Long): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_DMOEnum(guidcategory, dwflags.toInt(), cintypes.toInt(), pintypes, couttypes.toInt(), pouttypes, ppenum)

public actual fun DMOGetName(clsiddmo: Long, szname: PWSTR): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_DMOGetName(clsiddmo, szname)

public actual fun DMOGetTypes(clsiddmo: Long, ulinputtypesrequested: UInt, pulinputtypessupplied: Long, pinputtypes: Long, uloutputtypesrequested: UInt, puloutputtypessupplied: Long, poutputtypes: Long): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_DMOGetTypes(clsiddmo, ulinputtypesrequested.toInt(), pulinputtypessupplied, pinputtypes, uloutputtypesrequested.toInt(), puloutputtypessupplied, poutputtypes)

public actual fun DMORegister(szname: PCWSTR, clsiddmo: Long, guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_DMORegister(szname, clsiddmo, guidcategory, dwflags.toInt(), cintypes.toInt(), pintypes, couttypes.toInt(), pouttypes)

public actual fun DMOUnregister(clsiddmo: Long, guidcategory: Long): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_DMOUnregister(clsiddmo, guidcategory)

public actual fun MoCopyMediaType(pmtdest: Long, pmtsrc: Long): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_MoCopyMediaType(pmtdest, pmtsrc)

public actual fun MoCreateMediaType(ppmt: Long, cbformat: UInt): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_MoCreateMediaType(ppmt, cbformat.toInt())

public actual fun MoDeleteMediaType(pmt: Long): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_MoDeleteMediaType(pmt)

public actual fun MoDuplicateMediaType(ppmtdest: Long, pmtsrc: Long): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_MoDuplicateMediaType(ppmtdest, pmtsrc)

public actual fun MoFreeMediaType(pmt: Long): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_MoFreeMediaType(pmt)

public actual fun MoInitMediaType(pmt: Long, cbformat: UInt): HRESULT =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssys_windows_win32_media_dxmediaobjects_MoInitMediaType(pmt, cbformat.toInt())
