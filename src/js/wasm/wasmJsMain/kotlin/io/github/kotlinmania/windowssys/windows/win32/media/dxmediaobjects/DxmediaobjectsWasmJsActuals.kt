@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public actual fun DMOEnum(guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long, ppenum: Long): HRESULT =
    0

public actual fun DMOGetName(clsiddmo: Long, szname: PWSTR): HRESULT =
    0

public actual fun DMOGetTypes(clsiddmo: Long, ulinputtypesrequested: UInt, pulinputtypessupplied: Long, pinputtypes: Long, uloutputtypesrequested: UInt, puloutputtypessupplied: Long, poutputtypes: Long): HRESULT =
    0

public actual fun DMORegister(szname: PCWSTR, clsiddmo: Long, guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long): HRESULT =
    0

public actual fun DMOUnregister(clsiddmo: Long, guidcategory: Long): HRESULT =
    0

public actual fun MoCopyMediaType(pmtdest: Long, pmtsrc: Long): HRESULT =
    0

public actual fun MoCreateMediaType(ppmt: Long, cbformat: UInt): HRESULT =
    0

public actual fun MoDeleteMediaType(pmt: Long): HRESULT =
    0

public actual fun MoDuplicateMediaType(ppmtdest: Long, pmtsrc: Long): HRESULT =
    0

public actual fun MoFreeMediaType(pmt: Long): HRESULT =
    0

public actual fun MoInitMediaType(pmt: Long, cbformat: UInt): HRESULT =
    0
