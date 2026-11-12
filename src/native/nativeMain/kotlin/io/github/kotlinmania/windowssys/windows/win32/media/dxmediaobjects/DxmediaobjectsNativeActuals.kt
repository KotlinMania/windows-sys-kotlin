@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsDMOEnum
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsDMOGetName
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsDMORegister
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsDMOUnregister
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType
import io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects.cinterop.windowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dMOEnum(guidcategory: ConstPtr<Guid>, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr<DmoPartialMediatype>, couttypes: UInt, pouttypes: ConstPtr<DmoPartialMediatype>, ppenum: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsDMOEnum(guidcategory.rawAddress.toCPointer<ByteVar>(), dwflags, cintypes, pintypes.rawAddress.toCPointer<ByteVar>(), couttypes, pouttypes.rawAddress.toCPointer<ByteVar>(), ppenum.rawAddress.toCPointer<ByteVar>())

public actual fun dMOGetName(clsiddmo: ConstPtr<Guid>, szname: Pwstr): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsDMOGetName(clsiddmo.rawAddress.toCPointer<ByteVar>(), szname.rawAddress.toCPointer<ByteVar>())

public actual fun dMOGetTypes(clsiddmo: ConstPtr<Guid>, ulinputtypesrequested: UInt, pulinputtypessupplied: MutPtr<UInt>, pinputtypes: MutPtr<DmoPartialMediatype>, uloutputtypesrequested: UInt, puloutputtypessupplied: MutPtr<UInt>, poutputtypes: MutPtr<DmoPartialMediatype>): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes(clsiddmo.rawAddress.toCPointer<ByteVar>(), ulinputtypesrequested, pulinputtypessupplied.rawAddress.toCPointer<ByteVar>(), pinputtypes.rawAddress.toCPointer<ByteVar>(), uloutputtypesrequested, puloutputtypessupplied.rawAddress.toCPointer<ByteVar>(), poutputtypes.rawAddress.toCPointer<ByteVar>())

public actual fun dMORegister(szname: Pcwstr, clsiddmo: ConstPtr<Guid>, guidcategory: ConstPtr<Guid>, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr<DmoPartialMediatype>, couttypes: UInt, pouttypes: ConstPtr<DmoPartialMediatype>): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsDMORegister(szname.rawAddress.toCPointer<ByteVar>(), clsiddmo.rawAddress.toCPointer<ByteVar>(), guidcategory.rawAddress.toCPointer<ByteVar>(), dwflags, cintypes, pintypes.rawAddress.toCPointer<ByteVar>(), couttypes, pouttypes.rawAddress.toCPointer<ByteVar>())

public actual fun dMOUnregister(clsiddmo: ConstPtr<Guid>, guidcategory: ConstPtr<Guid>): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsDMOUnregister(clsiddmo.rawAddress.toCPointer<ByteVar>(), guidcategory.rawAddress.toCPointer<ByteVar>())

public actual fun moCopyMediaType(pmtdest: MutPtr<DmoMediaType>, pmtsrc: ConstPtr<DmoMediaType>): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType(pmtdest.rawAddress.toCPointer<ByteVar>(), pmtsrc.rawAddress.toCPointer<ByteVar>())

public actual fun moCreateMediaType(ppmt: MutPtr<MutPtr<DmoMediaType>>, cbformat: UInt): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType(ppmt.rawAddress.toCPointer<ByteVar>(), cbformat)

public actual fun moDeleteMediaType(pmt: MutPtr<DmoMediaType>): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType(pmt.rawAddress.toCPointer<ByteVar>())

public actual fun moDuplicateMediaType(ppmtdest: MutPtr<MutPtr<DmoMediaType>>, pmtsrc: ConstPtr<DmoMediaType>): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType(ppmtdest.rawAddress.toCPointer<ByteVar>(), pmtsrc.rawAddress.toCPointer<ByteVar>())

public actual fun moFreeMediaType(pmt: MutPtr<DmoMediaType>): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType(pmt.rawAddress.toCPointer<ByteVar>())

public actual fun moInitMediaType(pmt: MutPtr<DmoMediaType>, cbformat: UInt): Hresult =
    windowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType(pmt.rawAddress.toCPointer<ByteVar>(), cbformat)
