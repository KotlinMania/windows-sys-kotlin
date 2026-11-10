package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer

public expect fun closeIMsgSession(lpmsgsess: Lpmsgsess)

public expect fun getAttribIMsgOnIStg(lpobject: COpaquePointer?, lpproptagarray: COpaquePointer?, lpppropattrarray: COpaquePointer?): Hresult

public expect fun mapStorageSCode(stgscode: Int): Int

public expect fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: COpaquePointer?, lpmapisup: COpaquePointer?, lpstg: COpaquePointer?, lpfmsgcallrelease: COpaquePointer?, ulcallerdata: UInt, ulflags: UInt, lppmsg: COpaquePointer?): Int

public expect fun openIMsgSession(lpmalloc: COpaquePointer?, ulflags: UInt, lppmsgsess: COpaquePointer?): Int

public expect fun setAttribIMsgOnIStg(lpobject: COpaquePointer?, lpproptags: COpaquePointer?, lppropattrs: COpaquePointer?, lpppropproblems: COpaquePointer?): Hresult
