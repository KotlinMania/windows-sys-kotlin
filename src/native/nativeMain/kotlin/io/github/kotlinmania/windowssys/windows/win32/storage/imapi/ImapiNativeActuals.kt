@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssys_windows_win32_storage_imapi_closeIMsgSession
import io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssys_windows_win32_storage_imapi_getAttribIMsgOnIStg
import io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssys_windows_win32_storage_imapi_mapStorageSCode
import io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssys_windows_win32_storage_imapi_openIMsgSession
import io.github.kotlinmania.windowssys.windows.win32.storage.imapi.cinterop.windowssys_windows_win32_storage_imapi_setAttribIMsgOnIStg
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun closeIMsgSession(lpmsgsess: Lpmsgsess) {
    windowssys_windows_win32_storage_imapi_closeIMsgSession(lpmsgsess)
}

public actual fun getAttribIMsgOnIStg(lpobject: COpaquePointer?, lpproptagarray: COpaquePointer?, lpppropattrarray: COpaquePointer?): Hresult =
    windowssys_windows_win32_storage_imapi_getAttribIMsgOnIStg(lpobject?.value?.toCPointer<ByteVar>(), lpproptagarray?.value?.toCPointer<ByteVar>(), lpppropattrarray?.value?.toCPointer<ByteVar>())

public actual fun mapStorageSCode(stgscode: Int): Int =
    windowssys_windows_win32_storage_imapi_mapStorageSCode(stgscode)

public actual fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: COpaquePointer?, lpmapisup: COpaquePointer?, lpstg: COpaquePointer?, lpfmsgcallrelease: COpaquePointer?, ulcallerdata: UInt, ulflags: UInt, lppmsg: COpaquePointer?): Int =
    0

public actual fun openIMsgSession(lpmalloc: COpaquePointer?, ulflags: UInt, lppmsgsess: COpaquePointer?): Int =
    windowssys_windows_win32_storage_imapi_openIMsgSession(lpmalloc?.value?.toCPointer<ByteVar>(), ulflags, lppmsgsess?.value?.toCPointer<ByteVar>())

public actual fun setAttribIMsgOnIStg(lpobject: COpaquePointer?, lpproptags: COpaquePointer?, lppropattrs: COpaquePointer?, lpppropproblems: COpaquePointer?): Hresult =
    windowssys_windows_win32_storage_imapi_setAttribIMsgOnIStg(lpobject?.value?.toCPointer<ByteVar>(), lpproptags?.value?.toCPointer<ByteVar>(), lppropattrs?.value?.toCPointer<ByteVar>(), lpppropproblems?.value?.toCPointer<ByteVar>())
