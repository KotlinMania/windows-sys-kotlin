@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer

private object WindowsWin32StorageImapiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageImapiCloseIMsgSession(lpmsgsess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(lpobject: Long, lpproptagarray: Long, lpppropattrarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageImapiMapStorageSCode(stgscode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageImapiOpenIMsgSession(lpmalloc: Long, ulflags: Int, lppmsgsess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(lpobject: Long, lpproptags: Long, lppropattrs: Long, lpppropproblems: Long): Int
}

public actual fun closeIMsgSession(lpmsgsess: Lpmsgsess) {
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiCloseIMsgSession(lpmsgsess)
}

public actual fun getAttribIMsgOnIStg(lpobject: MutPtr, lpproptagarray: MutPtr, lpppropattrarray: MutPtr): Hresult =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(lpobject.rawAddress, lpproptagarray.rawAddress, lpppropattrarray.rawAddress)

public actual fun mapStorageSCode(stgscode: Int): Int =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiMapStorageSCode(stgscode)

public actual fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr, lpmapisup: MutPtr, lpstg: MutPtr, lpfmsgcallrelease: MutPtr, ulcallerdata: UInt, ulflags: UInt, lppmsg: MutPtr): Int =
    0

public actual fun openIMsgSession(lpmalloc: MutPtr, ulflags: UInt, lppmsgsess: MutPtr): Int =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiOpenIMsgSession(lpmalloc.rawAddress, ulflags.toInt(), lppmsgsess.rawAddress)

public actual fun setAttribIMsgOnIStg(lpobject: MutPtr, lpproptags: MutPtr, lppropattrs: MutPtr, lpppropproblems: MutPtr): Hresult =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(lpobject.rawAddress, lpproptags.rawAddress, lppropattrs.rawAddress, lpppropproblems.rawAddress)
