package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun dMOEnum(guidcategory: ConstPtr<Guid>, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr<DmoPartialMediatype>, couttypes: UInt, pouttypes: ConstPtr<DmoPartialMediatype>, ppenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun dMOGetName(clsiddmo: ConstPtr<Guid>, szname: Pwstr): Hresult

public expect fun dMOGetTypes(clsiddmo: ConstPtr<Guid>, ulinputtypesrequested: UInt, pulinputtypessupplied: MutPtr<UInt>, pinputtypes: MutPtr<DmoPartialMediatype>, uloutputtypesrequested: UInt, puloutputtypessupplied: MutPtr<UInt>, poutputtypes: MutPtr<DmoPartialMediatype>): Hresult

public expect fun dMORegister(szname: Pcwstr, clsiddmo: ConstPtr<Guid>, guidcategory: ConstPtr<Guid>, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr<DmoPartialMediatype>, couttypes: UInt, pouttypes: ConstPtr<DmoPartialMediatype>): Hresult

public expect fun dMOUnregister(clsiddmo: ConstPtr<Guid>, guidcategory: ConstPtr<Guid>): Hresult

public expect fun moCopyMediaType(pmtdest: MutPtr<DmoMediaType>, pmtsrc: ConstPtr<DmoMediaType>): Hresult

public expect fun moCreateMediaType(ppmt: MutPtr<MutPtr<DmoMediaType>>, cbformat: UInt): Hresult

public expect fun moDeleteMediaType(pmt: MutPtr<DmoMediaType>): Hresult

public expect fun moDuplicateMediaType(ppmtdest: MutPtr<MutPtr<DmoMediaType>>, pmtsrc: ConstPtr<DmoMediaType>): Hresult

public expect fun moFreeMediaType(pmt: MutPtr<DmoMediaType>): Hresult

public expect fun moInitMediaType(pmt: MutPtr<DmoMediaType>, cbformat: UInt): Hresult
