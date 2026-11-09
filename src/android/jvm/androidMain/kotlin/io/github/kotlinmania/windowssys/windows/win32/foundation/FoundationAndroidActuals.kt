@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32FoundationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_foundation_CloseHandle(hobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_CompareObjectHandles(hfirstobjecthandle: Long, hsecondobjecthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_DuplicateHandle(hsourceprocesshandle: Long, hsourcehandle: Long, htargetprocesshandle: Long, lptargethandle: Long, dwdesiredaccess: Int, binherithandle: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_FreeLibrary(hlibmodule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_GetHandleInformation(hobject: Long, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_GetLastError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_GlobalFree(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_foundation_LocalFree(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_foundation_RtlNtStatusToDosError(status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SetHandleInformation(hobject: Long, dwmask: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SetLastError(dwerrcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SetLastErrorEx(dwerrcode: Int, dwtype: Int)

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SysAddRefString(bstrstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SysAllocString(psz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SysAllocStringByteLen(psz: Long, len: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SysAllocStringLen(strin: Long, ui: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SysFreeString(bstrstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SysReAllocString(pbstr: Long, psz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SysReAllocStringLen(pbstr: Long, psz: Long, len: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SysReleaseString(bstrstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SysStringByteLen(bstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_SysStringLen(pbstr: Long): Int
}

public actual fun CloseHandle(hobject: HANDLE): BOOL =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_CloseHandle(hobject)

public actual fun CompareObjectHandles(hfirstobjecthandle: HANDLE, hsecondobjecthandle: HANDLE): BOOL =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_CompareObjectHandles(hfirstobjecthandle, hsecondobjecthandle)

public actual fun DuplicateHandle(hsourceprocesshandle: HANDLE, hsourcehandle: HANDLE, htargetprocesshandle: HANDLE, lptargethandle: Long, dwdesiredaccess: UInt, binherithandle: BOOL, dwoptions: DUPLICATE_HANDLE_OPTIONS): BOOL =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_DuplicateHandle(hsourceprocesshandle, hsourcehandle, htargetprocesshandle, lptargethandle, dwdesiredaccess.toInt(), binherithandle, dwoptions.toInt())

public actual fun FreeLibrary(hlibmodule: HMODULE): BOOL =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_FreeLibrary(hlibmodule)

public actual fun GetHandleInformation(hobject: HANDLE, lpdwflags: Long): BOOL =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_GetHandleInformation(hobject, lpdwflags)

public actual fun GetLastError(): WIN32_ERROR =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_GetLastError().toUInt()

public actual fun GlobalFree(hmem: HGLOBAL): HGLOBAL =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_GlobalFree(hmem)

public actual fun LocalFree(hmem: HLOCAL): HLOCAL =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_LocalFree(hmem)

public actual fun RtlNtStatusToDosError(status: NTSTATUS): UInt =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_RtlNtStatusToDosError(status).toUInt()

public actual fun SetHandleInformation(hobject: HANDLE, dwmask: UInt, dwflags: HANDLE_FLAGS): BOOL =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SetHandleInformation(hobject, dwmask.toInt(), dwflags.toInt())

public actual fun SetLastError(dwerrcode: WIN32_ERROR) {
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SetLastError(dwerrcode.toInt())
}

public actual fun SetLastErrorEx(dwerrcode: WIN32_ERROR, dwtype: UInt) {
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SetLastErrorEx(dwerrcode.toInt(), dwtype.toInt())
}

public actual fun SysAddRefString(bstrstring: BSTR): HRESULT =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SysAddRefString(bstrstring)

public actual fun SysAllocString(psz: PCWSTR): BSTR =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SysAllocString(psz)

public actual fun SysAllocStringByteLen(psz: PCSTR, len: UInt): BSTR =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SysAllocStringByteLen(psz, len.toInt())

public actual fun SysAllocStringLen(strin: PCWSTR, ui: UInt): BSTR =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SysAllocStringLen(strin, ui.toInt())

public actual fun SysFreeString(bstrstring: BSTR) {
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SysFreeString(bstrstring)
}

public actual fun SysReAllocString(pbstr: Long, psz: PCWSTR): Int =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SysReAllocString(pbstr, psz)

public actual fun SysReAllocStringLen(pbstr: Long, psz: PCWSTR, len: UInt): Int =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SysReAllocStringLen(pbstr, psz, len.toInt())

public actual fun SysReleaseString(bstrstring: BSTR) {
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SysReleaseString(bstrstring)
}

public actual fun SysStringByteLen(bstr: BSTR): UInt =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SysStringByteLen(bstr).toUInt()

public actual fun SysStringLen(pbstr: BSTR): UInt =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_SysStringLen(pbstr).toUInt()
