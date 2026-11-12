@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.SPropProblemArray
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.SPropTagArray

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

public actual fun getAttribIMsgOnIStg(lpobject: MutPtr<CVoid>, lpproptagarray: MutPtr<SPropTagArray>, lpppropattrarray: MutPtr<MutPtr<SPropAttrArray>>): Hresult =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(lpobject.rawAddress, lpproptagarray.rawAddress, lpppropattrarray.rawAddress)

public actual fun mapStorageSCode(stgscode: Int): Int =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiMapStorageSCode(stgscode)

public actual fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr<CVoid>, lpmapisup: MutPtr<CVoid>, lpstg: MutPtr<CVoid>, lpfmsgcallrelease: MutPtr<Msgcallrelease>, ulcallerdata: UInt, ulflags: UInt, lppmsg: MutPtr<MutPtr<CVoid>>): Int =
    0

public actual fun openIMsgSession(lpmalloc: MutPtr<CVoid>, ulflags: UInt, lppmsgsess: MutPtr<Lpmsgsess>): Int =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiOpenIMsgSession(lpmalloc.rawAddress, ulflags.toInt(), lppmsgsess.rawAddress)

public actual fun setAttribIMsgOnIStg(lpobject: MutPtr<CVoid>, lpproptags: MutPtr<SPropTagArray>, lppropattrs: MutPtr<SPropAttrArray>, lpppropproblems: MutPtr<MutPtr<SPropProblemArray>>): Hresult =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(lpobject.rawAddress, lpproptags.rawAddress, lppropattrs.rawAddress, lpppropproblems.rawAddress)
