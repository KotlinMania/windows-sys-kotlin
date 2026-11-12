package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.SPropProblemArray
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.SPropTagArray

public expect fun closeIMsgSession(lpmsgsess: Lpmsgsess)

public expect fun getAttribIMsgOnIStg(lpobject: MutPtr<CVoid>, lpproptagarray: MutPtr<SPropTagArray>, lpppropattrarray: MutPtr<MutPtr<SPropAttrArray>>): Hresult

public expect fun mapStorageSCode(stgscode: Int): Int

public expect fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr<CVoid>, lpmapisup: MutPtr<CVoid>, lpstg: MutPtr<CVoid>, lpfmsgcallrelease: MutPtr<Msgcallrelease>, ulcallerdata: UInt, ulflags: UInt, lppmsg: MutPtr<MutPtr<CVoid>>): Int

public expect fun openIMsgSession(lpmalloc: MutPtr<CVoid>, ulflags: UInt, lppmsgsess: MutPtr<Lpmsgsess>): Int

public expect fun setAttribIMsgOnIStg(lpobject: MutPtr<CVoid>, lpproptags: MutPtr<SPropTagArray>, lppropattrs: MutPtr<SPropAttrArray>, lpppropproblems: MutPtr<MutPtr<SPropProblemArray>>): Hresult
