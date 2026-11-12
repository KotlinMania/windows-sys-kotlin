@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssysWindowsWin32StorageImapiCloseIMsgSession
import io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg
import io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssysWindowsWin32StorageImapiMapStorageSCode
import io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssysWindowsWin32StorageImapiOpenIMsgSession
import io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.SPropProblemArray
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.SPropTagArray
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun closeIMsgSession(lpmsgsess: Lpmsgsess) {
    windowssysWindowsWin32StorageImapiCloseIMsgSession(lpmsgsess)
}

public actual fun getAttribIMsgOnIStg(lpobject: MutPtr<CVoid>, lpproptagarray: MutPtr<SPropTagArray>, lpppropattrarray: MutPtr<MutPtr<SPropAttrArray>>): Hresult =
    windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(lpobject.rawAddress.toCPointer<ByteVar>(), lpproptagarray.rawAddress.toCPointer<ByteVar>(), lpppropattrarray.rawAddress.toCPointer<ByteVar>())

public actual fun mapStorageSCode(stgscode: Int): Int =
    windowssysWindowsWin32StorageImapiMapStorageSCode(stgscode)

public actual fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr<CVoid>, lpmapisup: MutPtr<CVoid>, lpstg: MutPtr<CVoid>, lpfmsgcallrelease: MutPtr<Msgcallrelease>, ulcallerdata: UInt, ulflags: UInt, lppmsg: MutPtr<MutPtr<CVoid>>): Int =
    0

public actual fun openIMsgSession(lpmalloc: MutPtr<CVoid>, ulflags: UInt, lppmsgsess: MutPtr<Lpmsgsess>): Int =
    windowssysWindowsWin32StorageImapiOpenIMsgSession(lpmalloc.rawAddress.toCPointer<ByteVar>(), ulflags, lppmsgsess.rawAddress.toCPointer<ByteVar>())

public actual fun setAttribIMsgOnIStg(lpobject: MutPtr<CVoid>, lpproptags: MutPtr<SPropTagArray>, lppropattrs: MutPtr<SPropAttrArray>, lpppropproblems: MutPtr<MutPtr<SPropProblemArray>>): Hresult =
    windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(lpobject.rawAddress.toCPointer<ByteVar>(), lpproptags.rawAddress.toCPointer<ByteVar>(), lppropattrs.rawAddress.toCPointer<ByteVar>(), lpppropproblems.rawAddress.toCPointer<ByteVar>())
