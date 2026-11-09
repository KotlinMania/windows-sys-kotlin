@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CloseHandle(hobject: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_CloseHandle(hobject.toCPointer<ByteVar>())

public actual fun CompareObjectHandles(hfirstobjecthandle: HANDLE, hsecondobjecthandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_CompareObjectHandles(hfirstobjecthandle.toCPointer<ByteVar>(), hsecondobjecthandle.toCPointer<ByteVar>())

public actual fun DuplicateHandle(hsourceprocesshandle: HANDLE, hsourcehandle: HANDLE, htargetprocesshandle: HANDLE, lptargethandle: Long, dwdesiredaccess: UInt, binherithandle: BOOL, dwoptions: DUPLICATE_HANDLE_OPTIONS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_DuplicateHandle(hsourceprocesshandle.toCPointer<ByteVar>(), hsourcehandle.toCPointer<ByteVar>(), htargetprocesshandle.toCPointer<ByteVar>(), lptargethandle.toCPointer<ByteVar>(), dwdesiredaccess, binherithandle, dwoptions)

public actual fun FreeLibrary(hlibmodule: HMODULE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_FreeLibrary(hlibmodule.toCPointer<ByteVar>())

public actual fun GetHandleInformation(hobject: HANDLE, lpdwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_GetHandleInformation(hobject.toCPointer<ByteVar>(), lpdwflags.toCPointer<ByteVar>())

public actual fun GetLastError(): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_GetLastError()

public actual fun GlobalFree(hmem: HGLOBAL): HGLOBAL =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_GlobalFree(hmem.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LocalFree(hmem: HLOCAL): HLOCAL =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_LocalFree(hmem.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlNtStatusToDosError(status: NTSTATUS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_RtlNtStatusToDosError(status)

public actual fun SetHandleInformation(hobject: HANDLE, dwmask: UInt, dwflags: HANDLE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SetHandleInformation(hobject.toCPointer<ByteVar>(), dwmask, dwflags)

public actual fun SetLastError(dwerrcode: WIN32_ERROR) {
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SetLastError(dwerrcode)
}

public actual fun SetLastErrorEx(dwerrcode: WIN32_ERROR, dwtype: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SetLastErrorEx(dwerrcode, dwtype)
}

public actual fun SysAddRefString(bstrstring: BSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SysAddRefString(bstrstring.toCPointer<ByteVar>())

public actual fun SysAllocString(psz: PCWSTR): BSTR =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SysAllocString(psz.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SysAllocStringByteLen(psz: PCSTR, len: UInt): BSTR =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SysAllocStringByteLen(psz.toCPointer<ByteVar>(), len)?.toLong() ?: 0L

public actual fun SysAllocStringLen(strin: PCWSTR, ui: UInt): BSTR =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SysAllocStringLen(strin.toCPointer<ByteVar>(), ui)?.toLong() ?: 0L

public actual fun SysFreeString(bstrstring: BSTR) {
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SysFreeString(bstrstring.toCPointer<ByteVar>())
}

public actual fun SysReAllocString(pbstr: Long, psz: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SysReAllocString(pbstr.toCPointer<ByteVar>(), psz.toCPointer<ByteVar>())

public actual fun SysReAllocStringLen(pbstr: Long, psz: PCWSTR, len: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SysReAllocStringLen(pbstr.toCPointer<ByteVar>(), psz.toCPointer<ByteVar>(), len)

public actual fun SysReleaseString(bstrstring: BSTR) {
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SysReleaseString(bstrstring.toCPointer<ByteVar>())
}

public actual fun SysStringByteLen(bstr: BSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SysStringByteLen(bstr.toCPointer<ByteVar>())

public actual fun SysStringLen(pbstr: BSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_SysStringLen(pbstr.toCPointer<ByteVar>())
