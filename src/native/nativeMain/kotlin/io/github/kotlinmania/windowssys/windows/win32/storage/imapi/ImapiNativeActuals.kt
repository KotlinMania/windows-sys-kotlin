@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEBUFFER
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEMORE
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPFREEBUFFER
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CloseIMsgSession(lpmsgsess: LPMSGSESS) {
    io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssys_windows_win32_storage_imapi_CloseIMsgSession(lpmsgsess)
}

public actual fun GetAttribIMsgOnIStg(lpobject: Long, lpproptagarray: Long, lpppropattrarray: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssys_windows_win32_storage_imapi_GetAttribIMsgOnIStg(lpobject.toCPointer<ByteVar>(), lpproptagarray.toCPointer<ByteVar>(), lpppropattrarray.toCPointer<ByteVar>())

public actual fun MapStorageSCode(stgscode: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssys_windows_win32_storage_imapi_MapStorageSCode(stgscode)

public actual fun OpenIMsgOnIStg(lpmsgsess: LPMSGSESS, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, lpmapisup: Long, lpstg: Long, lpfmsgcallrelease: Long, ulcallerdata: UInt, ulflags: UInt, lppmsg: Long): Int =
    0

public actual fun OpenIMsgSession(lpmalloc: Long, ulflags: UInt, lppmsgsess: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssys_windows_win32_storage_imapi_OpenIMsgSession(lpmalloc.toCPointer<ByteVar>(), ulflags, lppmsgsess.toCPointer<ByteVar>())

public actual fun SetAttribIMsgOnIStg(lpobject: Long, lpproptags: Long, lppropattrs: Long, lpppropproblems: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssys_windows_win32_storage_imapi_SetAttribIMsgOnIStg(lpobject.toCPointer<ByteVar>(), lpproptags.toCPointer<ByteVar>(), lppropattrs.toCPointer<ByteVar>(), lpppropproblems.toCPointer<ByteVar>())
