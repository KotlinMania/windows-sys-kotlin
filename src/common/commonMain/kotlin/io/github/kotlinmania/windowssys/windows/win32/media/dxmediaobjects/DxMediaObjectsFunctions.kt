package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun dMOEnum(guidcategory: ConstPtr, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr, couttypes: UInt, pouttypes: ConstPtr, ppenum: MutPtr): Hresult

public expect fun dMOGetName(clsiddmo: ConstPtr, szname: Pwstr): Hresult

public expect fun dMOGetTypes(clsiddmo: ConstPtr, ulinputtypesrequested: UInt, pulinputtypessupplied: MutPtr, pinputtypes: MutPtr, uloutputtypesrequested: UInt, puloutputtypessupplied: MutPtr, poutputtypes: MutPtr): Hresult

public expect fun dMORegister(szname: Pcwstr, clsiddmo: ConstPtr, guidcategory: ConstPtr, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr, couttypes: UInt, pouttypes: ConstPtr): Hresult

public expect fun dMOUnregister(clsiddmo: ConstPtr, guidcategory: ConstPtr): Hresult

public expect fun moCopyMediaType(pmtdest: MutPtr, pmtsrc: ConstPtr): Hresult

public expect fun moCreateMediaType(ppmt: MutPtr, cbformat: UInt): Hresult

public expect fun moDeleteMediaType(pmt: MutPtr): Hresult

public expect fun moDuplicateMediaType(ppmtdest: MutPtr, pmtsrc: ConstPtr): Hresult

public expect fun moFreeMediaType(pmt: MutPtr): Hresult

public expect fun moInitMediaType(pmt: MutPtr, cbformat: UInt): Hresult
