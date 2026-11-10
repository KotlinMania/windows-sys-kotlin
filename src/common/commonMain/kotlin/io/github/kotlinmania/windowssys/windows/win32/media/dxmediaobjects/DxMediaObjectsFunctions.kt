package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun dMOEnum(guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?, ppenum: COpaquePointer?): Hresult

public expect fun dMOGetName(clsiddmo: COpaquePointer?, szname: Pwstr): Hresult

public expect fun dMOGetTypes(clsiddmo: COpaquePointer?, ulinputtypesrequested: UInt, pulinputtypessupplied: COpaquePointer?, pinputtypes: COpaquePointer?, uloutputtypesrequested: UInt, puloutputtypessupplied: COpaquePointer?, poutputtypes: COpaquePointer?): Hresult

public expect fun dMORegister(szname: Pcwstr, clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?): Hresult

public expect fun dMOUnregister(clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?): Hresult

public expect fun moCopyMediaType(pmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult

public expect fun moCreateMediaType(ppmt: COpaquePointer?, cbformat: UInt): Hresult

public expect fun moDeleteMediaType(pmt: COpaquePointer?): Hresult

public expect fun moDuplicateMediaType(ppmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult

public expect fun moFreeMediaType(pmt: COpaquePointer?): Hresult

public expect fun moInitMediaType(pmt: COpaquePointer?, cbformat: UInt): Hresult
