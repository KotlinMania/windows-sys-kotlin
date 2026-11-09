package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEBUFFER
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEMORE
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPFREEBUFFER

public expect fun CloseIMsgSession(lpmsgsess: LPMSGSESS)

public expect fun GetAttribIMsgOnIStg(lpobject: Long, lpproptagarray: Long, lpppropattrarray: Long): HRESULT

public expect fun MapStorageSCode(stgscode: Int): Int

public expect fun OpenIMsgOnIStg(lpmsgsess: LPMSGSESS, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, lpmapisup: Long, lpstg: Long, lpfmsgcallrelease: Long, ulcallerdata: UInt, ulflags: UInt, lppmsg: Long): Int

public expect fun OpenIMsgSession(lpmalloc: Long, ulflags: UInt, lppmsgsess: Long): Int

public expect fun SetAttribIMsgOnIStg(lpobject: Long, lpproptags: Long, lppropattrs: Long, lpppropproblems: Long): HRESULT
