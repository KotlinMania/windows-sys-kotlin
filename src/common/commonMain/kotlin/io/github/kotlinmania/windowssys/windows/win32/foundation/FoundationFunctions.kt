package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun CloseHandle(hobject: HANDLE): BOOL

public expect fun CompareObjectHandles(hfirstobjecthandle: HANDLE, hsecondobjecthandle: HANDLE): BOOL

public expect fun DuplicateHandle(hsourceprocesshandle: HANDLE, hsourcehandle: HANDLE, htargetprocesshandle: HANDLE, lptargethandle: Long, dwdesiredaccess: UInt, binherithandle: BOOL, dwoptions: DUPLICATE_HANDLE_OPTIONS): BOOL

public expect fun FreeLibrary(hlibmodule: HMODULE): BOOL

public expect fun GetHandleInformation(hobject: HANDLE, lpdwflags: Long): BOOL

public expect fun GetLastError(): WIN32_ERROR

public expect fun GlobalFree(hmem: HGLOBAL): HGLOBAL

public expect fun LocalFree(hmem: HLOCAL): HLOCAL

public expect fun RtlNtStatusToDosError(status: NTSTATUS): UInt

public expect fun SetHandleInformation(hobject: HANDLE, dwmask: UInt, dwflags: HANDLE_FLAGS): BOOL

public expect fun SetLastError(dwerrcode: WIN32_ERROR)

public expect fun SetLastErrorEx(dwerrcode: WIN32_ERROR, dwtype: UInt)

public expect fun SysAddRefString(bstrstring: BSTR): HRESULT

public expect fun SysAllocString(psz: PCWSTR): BSTR

public expect fun SysAllocStringByteLen(psz: PCSTR, len: UInt): BSTR

public expect fun SysAllocStringLen(strin: PCWSTR, ui: UInt): BSTR

public expect fun SysFreeString(bstrstring: BSTR)

public expect fun SysReAllocString(pbstr: Long, psz: PCWSTR): Int

public expect fun SysReAllocStringLen(pbstr: Long, psz: PCWSTR, len: UInt): Int

public expect fun SysReleaseString(bstrstring: BSTR)

public expect fun SysStringByteLen(bstr: BSTR): UInt

public expect fun SysStringLen(pbstr: BSTR): UInt
