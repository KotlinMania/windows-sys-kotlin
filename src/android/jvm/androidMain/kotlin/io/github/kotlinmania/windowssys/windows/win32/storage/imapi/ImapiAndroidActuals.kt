@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer

private object WindowsWin32StorageImapiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_imapi_closeIMsgSession(lpmsgsess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_imapi_getAttribIMsgOnIStg(lpobject: Long, lpproptagarray: Long, lpppropattrarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_imapi_mapStorageSCode(stgscode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_imapi_openIMsgSession(lpmalloc: Long, ulflags: Int, lppmsgsess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_imapi_setAttribIMsgOnIStg(lpobject: Long, lpproptags: Long, lppropattrs: Long, lpppropproblems: Long): Int
}

public actual fun closeIMsgSession(lpmsgsess: Lpmsgsess) {
    WindowsWin32StorageImapiJniBridge.windowssys_windows_win32_storage_imapi_closeIMsgSession(lpmsgsess)
}

public actual fun getAttribIMsgOnIStg(lpobject: COpaquePointer?, lpproptagarray: COpaquePointer?, lpppropattrarray: COpaquePointer?): Hresult =
    WindowsWin32StorageImapiJniBridge.windowssys_windows_win32_storage_imapi_getAttribIMsgOnIStg((lpobject?.value ?: 0L), (lpproptagarray?.value ?: 0L), (lpppropattrarray?.value ?: 0L))

public actual fun mapStorageSCode(stgscode: Int): Int =
    WindowsWin32StorageImapiJniBridge.windowssys_windows_win32_storage_imapi_mapStorageSCode(stgscode)

public actual fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: COpaquePointer?, lpmapisup: COpaquePointer?, lpstg: COpaquePointer?, lpfmsgcallrelease: COpaquePointer?, ulcallerdata: UInt, ulflags: UInt, lppmsg: COpaquePointer?): Int =
    0

public actual fun openIMsgSession(lpmalloc: COpaquePointer?, ulflags: UInt, lppmsgsess: COpaquePointer?): Int =
    WindowsWin32StorageImapiJniBridge.windowssys_windows_win32_storage_imapi_openIMsgSession((lpmalloc?.value ?: 0L), ulflags.toInt(), (lppmsgsess?.value ?: 0L))

public actual fun setAttribIMsgOnIStg(lpobject: COpaquePointer?, lpproptags: COpaquePointer?, lppropattrs: COpaquePointer?, lpppropproblems: COpaquePointer?): Hresult =
    WindowsWin32StorageImapiJniBridge.windowssys_windows_win32_storage_imapi_setAttribIMsgOnIStg((lpobject?.value ?: 0L), (lpproptags?.value ?: 0L), (lppropattrs?.value ?: 0L), (lpppropproblems?.value ?: 0L))
