package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun CloseHandle(hobject: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CloseHandle", longArrayOf(hobject)).toInt()
}

public fun CompareObjectHandles(hfirstobjecthandle: HANDLE, hsecondobjecthandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-handle-l1-1-0.dll", "CompareObjectHandles", longArrayOf(hfirstobjecthandle, hsecondobjecthandle)).toInt()
}

public fun DuplicateHandle(hsourceprocesshandle: HANDLE, hsourcehandle: HANDLE, htargetprocesshandle: HANDLE, lptargethandle: Long, dwdesiredaccess: UInt, binherithandle: BOOL, dwoptions: DUPLICATE_HANDLE_OPTIONS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DuplicateHandle", longArrayOf(hsourceprocesshandle, hsourcehandle, htargetprocesshandle, lptargethandle, dwdesiredaccess.toLong(), binherithandle.toLong(), dwoptions.toLong())).toInt()
}

public fun FreeLibrary(hlibmodule: HMODULE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FreeLibrary", longArrayOf(hlibmodule)).toInt()
}

public fun GetHandleInformation(hobject: HANDLE, lpdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetHandleInformation", longArrayOf(hobject, lpdwflags)).toInt()
}

public fun GetLastError(): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLastError", longArrayOf()).toUInt()
}

public fun GlobalFree(hmem: HGLOBAL): HGLOBAL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalFree", longArrayOf(hmem))
}

public fun LocalFree(hmem: HLOCAL): HLOCAL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalFree", longArrayOf(hmem))
}

public fun RtlNtStatusToDosError(status: NTSTATUS): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNtStatusToDosError", longArrayOf(status.toLong())).toUInt()
}

public fun SetHandleInformation(hobject: HANDLE, dwmask: UInt, dwflags: HANDLE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetHandleInformation", longArrayOf(hobject, dwmask.toLong(), dwflags.toLong())).toInt()
}

public fun SetLastError(dwerrcode: WIN32_ERROR) {
    Win32DynamicFfi.invoke("kernel32.dll", "SetLastError", longArrayOf(dwerrcode.toLong()))
}

public fun SetLastErrorEx(dwerrcode: WIN32_ERROR, dwtype: UInt) {
    Win32DynamicFfi.invoke("user32.dll", "SetLastErrorEx", longArrayOf(dwerrcode.toLong(), dwtype.toLong()))
}

public fun SysAddRefString(bstrstring: BSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SysAddRefString", longArrayOf(bstrstring)).toInt()
}

public fun SysAllocString(psz: PCWSTR): BSTR {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SysAllocString", longArrayOf(psz))
}

public fun SysAllocStringByteLen(psz: PCSTR, len: UInt): BSTR {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SysAllocStringByteLen", longArrayOf(psz, len.toLong()))
}

public fun SysAllocStringLen(strin: PCWSTR, ui: UInt): BSTR {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SysAllocStringLen", longArrayOf(strin, ui.toLong()))
}

public fun SysFreeString(bstrstring: BSTR) {
    Win32DynamicFfi.invoke("oleaut32.dll", "SysFreeString", longArrayOf(bstrstring))
}

public fun SysReAllocString(pbstr: Long, psz: PCWSTR): Int {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SysReAllocString", longArrayOf(pbstr, psz)).toInt()
}

public fun SysReAllocStringLen(pbstr: Long, psz: PCWSTR, len: UInt): Int {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SysReAllocStringLen", longArrayOf(pbstr, psz, len.toLong())).toInt()
}

public fun SysReleaseString(bstrstring: BSTR) {
    Win32DynamicFfi.invoke("oleaut32.dll", "SysReleaseString", longArrayOf(bstrstring))
}

public fun SysStringByteLen(bstr: BSTR): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SysStringByteLen", longArrayOf(bstr)).toUInt()
}

public fun SysStringLen(pbstr: BSTR): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SysStringLen", longArrayOf(pbstr)).toUInt()
}
