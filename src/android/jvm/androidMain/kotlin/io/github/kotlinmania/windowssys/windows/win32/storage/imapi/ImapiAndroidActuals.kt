@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEBUFFER
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPALLOCATEMORE
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.LPFREEBUFFER

private object WindowsWin32StorageImapiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_imapi_CloseIMsgSession(lpmsgsess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_imapi_GetAttribIMsgOnIStg(lpobject: Long, lpproptagarray: Long, lpppropattrarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_imapi_MapStorageSCode(stgscode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_imapi_OpenIMsgSession(lpmalloc: Long, ulflags: Int, lppmsgsess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_imapi_SetAttribIMsgOnIStg(lpobject: Long, lpproptags: Long, lppropattrs: Long, lpppropproblems: Long): Int
}

public actual fun CloseIMsgSession(lpmsgsess: LPMSGSESS) {
    WindowsWin32StorageImapiJniBridge.windowssys_windows_win32_storage_imapi_CloseIMsgSession(lpmsgsess)
}

public actual fun GetAttribIMsgOnIStg(lpobject: Long, lpproptagarray: Long, lpppropattrarray: Long): HRESULT =
    WindowsWin32StorageImapiJniBridge.windowssys_windows_win32_storage_imapi_GetAttribIMsgOnIStg(lpobject, lpproptagarray, lpppropattrarray)

public actual fun MapStorageSCode(stgscode: Int): Int =
    WindowsWin32StorageImapiJniBridge.windowssys_windows_win32_storage_imapi_MapStorageSCode(stgscode)

public actual fun OpenIMsgOnIStg(lpmsgsess: LPMSGSESS, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, lpmapisup: Long, lpstg: Long, lpfmsgcallrelease: Long, ulcallerdata: UInt, ulflags: UInt, lppmsg: Long): Int =
    0

public actual fun OpenIMsgSession(lpmalloc: Long, ulflags: UInt, lppmsgsess: Long): Int =
    WindowsWin32StorageImapiJniBridge.windowssys_windows_win32_storage_imapi_OpenIMsgSession(lpmalloc, ulflags.toInt(), lppmsgsess)

public actual fun SetAttribIMsgOnIStg(lpobject: Long, lpproptags: Long, lppropattrs: Long, lpppropproblems: Long): HRESULT =
    WindowsWin32StorageImapiJniBridge.windowssys_windows_win32_storage_imapi_SetAttribIMsgOnIStg(lpobject, lpproptags, lppropattrs, lpppropproblems)
