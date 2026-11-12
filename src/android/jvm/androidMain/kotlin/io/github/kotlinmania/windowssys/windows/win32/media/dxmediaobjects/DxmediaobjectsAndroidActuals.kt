@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32MediaDxmediaobjectsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsDMOEnum(guidcategory: Long, dwflags: Int, cintypes: Int, pintypes: Long, couttypes: Int, pouttypes: Long, ppenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsDMOGetName(clsiddmo: Long, szname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes(clsiddmo: Long, ulinputtypesrequested: Int, pulinputtypessupplied: Long, pinputtypes: Long, uloutputtypesrequested: Int, puloutputtypessupplied: Long, poutputtypes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsDMORegister(szname: Long, clsiddmo: Long, guidcategory: Long, dwflags: Int, cintypes: Int, pintypes: Long, couttypes: Int, pouttypes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsDMOUnregister(clsiddmo: Long, guidcategory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType(pmtdest: Long, pmtsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType(ppmt: Long, cbformat: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType(pmt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType(ppmtdest: Long, pmtsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType(pmt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType(pmt: Long, cbformat: Int): Int
}

public actual fun dMOEnum(guidcategory: ConstPtr, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr, couttypes: UInt, pouttypes: ConstPtr, ppenum: MutPtr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsDMOEnum(guidcategory.rawAddress, dwflags.toInt(), cintypes.toInt(), pintypes.rawAddress, couttypes.toInt(), pouttypes.rawAddress, ppenum.rawAddress)

public actual fun dMOGetName(clsiddmo: ConstPtr, szname: Pwstr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsDMOGetName(clsiddmo.rawAddress, szname.rawAddress)

public actual fun dMOGetTypes(clsiddmo: ConstPtr, ulinputtypesrequested: UInt, pulinputtypessupplied: MutPtr, pinputtypes: MutPtr, uloutputtypesrequested: UInt, puloutputtypessupplied: MutPtr, poutputtypes: MutPtr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes(clsiddmo.rawAddress, ulinputtypesrequested.toInt(), pulinputtypessupplied.rawAddress, pinputtypes.rawAddress, uloutputtypesrequested.toInt(), puloutputtypessupplied.rawAddress, poutputtypes.rawAddress)

public actual fun dMORegister(szname: Pcwstr, clsiddmo: ConstPtr, guidcategory: ConstPtr, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr, couttypes: UInt, pouttypes: ConstPtr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsDMORegister(szname.rawAddress, clsiddmo.rawAddress, guidcategory.rawAddress, dwflags.toInt(), cintypes.toInt(), pintypes.rawAddress, couttypes.toInt(), pouttypes.rawAddress)

public actual fun dMOUnregister(clsiddmo: ConstPtr, guidcategory: ConstPtr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsDMOUnregister(clsiddmo.rawAddress, guidcategory.rawAddress)

public actual fun moCopyMediaType(pmtdest: MutPtr, pmtsrc: ConstPtr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType(pmtdest.rawAddress, pmtsrc.rawAddress)

public actual fun moCreateMediaType(ppmt: MutPtr, cbformat: UInt): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType(ppmt.rawAddress, cbformat.toInt())

public actual fun moDeleteMediaType(pmt: MutPtr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType(pmt.rawAddress)

public actual fun moDuplicateMediaType(ppmtdest: MutPtr, pmtsrc: ConstPtr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType(ppmtdest.rawAddress, pmtsrc.rawAddress)

public actual fun moFreeMediaType(pmt: MutPtr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType(pmt.rawAddress)

public actual fun moInitMediaType(pmt: MutPtr, cbformat: UInt): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType(pmt.rawAddress, cbformat.toInt())
