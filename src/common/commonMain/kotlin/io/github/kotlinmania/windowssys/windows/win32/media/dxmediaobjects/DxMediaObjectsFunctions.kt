package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public expect fun DMOEnum(guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long, ppenum: Long): HRESULT

public expect fun DMOGetName(clsiddmo: Long, szname: PWSTR): HRESULT

public expect fun DMOGetTypes(clsiddmo: Long, ulinputtypesrequested: UInt, pulinputtypessupplied: Long, pinputtypes: Long, uloutputtypesrequested: UInt, puloutputtypessupplied: Long, poutputtypes: Long): HRESULT

public expect fun DMORegister(szname: PCWSTR, clsiddmo: Long, guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long): HRESULT

public expect fun DMOUnregister(clsiddmo: Long, guidcategory: Long): HRESULT

public expect fun MoCopyMediaType(pmtdest: Long, pmtsrc: Long): HRESULT

public expect fun MoCreateMediaType(ppmt: Long, cbformat: UInt): HRESULT

public expect fun MoDeleteMediaType(pmt: Long): HRESULT

public expect fun MoDuplicateMediaType(ppmtdest: Long, pmtsrc: Long): HRESULT

public expect fun MoFreeMediaType(pmt: Long): HRESULT

public expect fun MoInitMediaType(pmt: Long, cbformat: UInt): HRESULT
