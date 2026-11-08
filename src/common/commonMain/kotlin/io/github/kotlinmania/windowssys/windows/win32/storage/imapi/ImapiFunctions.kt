package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEBUFFER
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEMORE
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPFREEBUFFER

public fun CloseIMsgSession(lpmsgsess: LPMSGSESS) {
    Win32DynamicFfi.invoke("mapi32.dll", "CloseIMsgSession", longArrayOf(lpmsgsess))
}

public fun GetAttribIMsgOnIStg(lpobject: Long, lpproptagarray: Long, lpppropattrarray: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "GetAttribIMsgOnIStg", longArrayOf(lpobject, lpproptagarray, lpppropattrarray)).toInt()
}

public fun MapStorageSCode(stgscode: Int): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "MapStorageSCode", longArrayOf(stgscode.toLong())).toInt()
}

public fun OpenIMsgOnIStg(lpmsgsess: LPMSGSESS, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, lpmapisup: Long, lpstg: Long, lpfmsgcallrelease: Long, ulcallerdata: UInt, ulflags: UInt, lppmsg: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "OpenIMsgOnIStg", longArrayOf(lpmsgsess, Win32DynamicFfi.objectSlot(lpallocatebuffer), Win32DynamicFfi.objectSlot(lpallocatemore), Win32DynamicFfi.objectSlot(lpfreebuffer), lpmalloc, lpmapisup, lpstg, lpfmsgcallrelease, ulcallerdata.toLong(), ulflags.toLong(), lppmsg)).toInt()
}

public fun OpenIMsgSession(lpmalloc: Long, ulflags: UInt, lppmsgsess: Long): Int {
    return Win32DynamicFfi.invoke("mapi32.dll", "OpenIMsgSession", longArrayOf(lpmalloc, ulflags.toLong(), lppmsgsess)).toInt()
}

public fun SetAttribIMsgOnIStg(lpobject: Long, lpproptags: Long, lppropattrs: Long, lpppropproblems: Long): HRESULT {
    return Win32DynamicFfi.invoke("mapi32.dll", "SetAttribIMsgOnIStg", longArrayOf(lpobject, lpproptags, lppropattrs, lpppropproblems)).toInt()
}
