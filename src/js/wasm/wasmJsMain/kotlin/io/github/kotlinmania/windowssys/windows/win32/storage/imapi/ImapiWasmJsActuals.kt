@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEBUFFER
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEMORE
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPFREEBUFFER

public actual fun CloseIMsgSession(lpmsgsess: LPMSGSESS) {
}

public actual fun GetAttribIMsgOnIStg(lpobject: Long, lpproptagarray: Long, lpppropattrarray: Long): HRESULT =
    0

public actual fun MapStorageSCode(stgscode: Int): Int =
    0

public actual fun OpenIMsgOnIStg(lpmsgsess: LPMSGSESS, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, lpmapisup: Long, lpstg: Long, lpfmsgcallrelease: Long, ulcallerdata: UInt, ulflags: UInt, lppmsg: Long): Int =
    0

public actual fun OpenIMsgSession(lpmalloc: Long, ulflags: UInt, lppmsgsess: Long): Int =
    0

public actual fun SetAttribIMsgOnIStg(lpobject: Long, lpproptags: Long, lppropattrs: Long, lpppropproblems: Long): HRESULT =
    0
