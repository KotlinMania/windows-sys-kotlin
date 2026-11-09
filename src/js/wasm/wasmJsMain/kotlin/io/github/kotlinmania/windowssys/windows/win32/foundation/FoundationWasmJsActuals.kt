@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun CloseHandle(hobject: HANDLE): BOOL =
    0

public actual fun CompareObjectHandles(hfirstobjecthandle: HANDLE, hsecondobjecthandle: HANDLE): BOOL =
    0

public actual fun DuplicateHandle(hsourceprocesshandle: HANDLE, hsourcehandle: HANDLE, htargetprocesshandle: HANDLE, lptargethandle: Long, dwdesiredaccess: UInt, binherithandle: BOOL, dwoptions: DUPLICATE_HANDLE_OPTIONS): BOOL =
    0

public actual fun FreeLibrary(hlibmodule: HMODULE): BOOL =
    0

public actual fun GetHandleInformation(hobject: HANDLE, lpdwflags: Long): BOOL =
    0

public actual fun GetLastError(): WIN32_ERROR =
    0u

public actual fun GlobalFree(hmem: HGLOBAL): HGLOBAL =
    0L

public actual fun LocalFree(hmem: HLOCAL): HLOCAL =
    0L

public actual fun RtlNtStatusToDosError(status: NTSTATUS): UInt =
    0u

public actual fun SetHandleInformation(hobject: HANDLE, dwmask: UInt, dwflags: HANDLE_FLAGS): BOOL =
    0

public actual fun SetLastError(dwerrcode: WIN32_ERROR) {
}

public actual fun SetLastErrorEx(dwerrcode: WIN32_ERROR, dwtype: UInt) {
}

public actual fun SysAddRefString(bstrstring: BSTR): HRESULT =
    0

public actual fun SysAllocString(psz: PCWSTR): BSTR =
    0L

public actual fun SysAllocStringByteLen(psz: PCSTR, len: UInt): BSTR =
    0L

public actual fun SysAllocStringLen(strin: PCWSTR, ui: UInt): BSTR =
    0L

public actual fun SysFreeString(bstrstring: BSTR) {
}

public actual fun SysReAllocString(pbstr: Long, psz: PCWSTR): Int =
    0

public actual fun SysReAllocStringLen(pbstr: Long, psz: PCWSTR, len: UInt): Int =
    0

public actual fun SysReleaseString(bstrstring: BSTR) {
}

public actual fun SysStringByteLen(bstr: BSTR): UInt =
    0u

public actual fun SysStringLen(pbstr: BSTR): UInt =
    0u
