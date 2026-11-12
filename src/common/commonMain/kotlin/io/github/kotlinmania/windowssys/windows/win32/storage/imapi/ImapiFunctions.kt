package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer

public expect fun closeIMsgSession(lpmsgsess: Lpmsgsess)

public expect fun getAttribIMsgOnIStg(lpobject: MutPtr, lpproptagarray: MutPtr, lpppropattrarray: MutPtr): Hresult

public expect fun mapStorageSCode(stgscode: Int): Int

public expect fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr, lpmapisup: MutPtr, lpstg: MutPtr, lpfmsgcallrelease: MutPtr, ulcallerdata: UInt, ulflags: UInt, lppmsg: MutPtr): Int

public expect fun openIMsgSession(lpmalloc: MutPtr, ulflags: UInt, lppmsgsess: MutPtr): Int

public expect fun setAttribIMsgOnIStg(lpobject: MutPtr, lpproptags: MutPtr, lppropattrs: MutPtr, lpppropproblems: MutPtr): Hresult
