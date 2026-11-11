@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_closeHandle
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_compareObjectHandles
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_duplicateHandle
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_freeLibrary
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_getHandleInformation
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_getLastError
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_globalFree
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_localFree
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_rtlNtStatusToDosError
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_setHandleInformation
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_setLastError
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_setLastErrorEx
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysAddRefString
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysAllocString
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysAllocStringByteLen
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysAllocStringLen
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysFreeString
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysReAllocString
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysReAllocStringLen
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysReleaseString
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysStringByteLen
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysStringLen
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun closeHandle(hobject: Handle): Bool =
    windowssys_windows_win32_foundation_closeHandle(hobject?.value?.toCPointer<ByteVar>())

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    windowssys_windows_win32_foundation_compareObjectHandles(hfirstobjecthandle?.value?.toCPointer<ByteVar>(), hsecondobjecthandle?.value?.toCPointer<ByteVar>())

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: COpaquePointer?, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    windowssys_windows_win32_foundation_duplicateHandle(hsourceprocesshandle?.value?.toCPointer<ByteVar>(), hsourcehandle?.value?.toCPointer<ByteVar>(), htargetprocesshandle?.value?.toCPointer<ByteVar>(), lptargethandle?.value?.toCPointer<ByteVar>(), dwdesiredaccess, binherithandle, dwoptions)

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    windowssys_windows_win32_foundation_freeLibrary(hlibmodule?.value?.toCPointer<ByteVar>())

public actual fun getHandleInformation(hobject: Handle, lpdwflags: COpaquePointer?): Bool =
    windowssys_windows_win32_foundation_getHandleInformation(hobject?.value?.toCPointer<ByteVar>(), lpdwflags?.value?.toCPointer<ByteVar>())

public actual fun getLastError(): Win32Error =
    windowssys_windows_win32_foundation_getLastError()

public actual fun globalFree(hmem: Hglobal): Hglobal =
    windowssys_windows_win32_foundation_globalFree(hmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localFree(hmem: Hlocal): Hlocal =
    windowssys_windows_win32_foundation_localFree(hmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    windowssys_windows_win32_foundation_rtlNtStatusToDosError(status)

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    windowssys_windows_win32_foundation_setHandleInformation(hobject?.value?.toCPointer<ByteVar>(), dwmask, dwflags)

public actual fun setLastError(dwerrcode: Win32Error) {
    windowssys_windows_win32_foundation_setLastError(dwerrcode)
}

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt) {
    windowssys_windows_win32_foundation_setLastErrorEx(dwerrcode, dwtype)
}

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    windowssys_windows_win32_foundation_sysAddRefString(bstrstring?.value?.toCPointer<ByteVar>())

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    windowssys_windows_win32_foundation_sysAllocString(psz?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    windowssys_windows_win32_foundation_sysAllocStringByteLen(psz?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    windowssys_windows_win32_foundation_sysAllocStringLen(strin?.value?.toCPointer<ByteVar>(), ui)?.let { COpaquePointer(it.toLong()) }

public actual fun sysFreeString(bstrstring: Bstr) {
    windowssys_windows_win32_foundation_sysFreeString(bstrstring?.value?.toCPointer<ByteVar>())
}

public actual fun sysReAllocString(pbstr: COpaquePointer?, psz: Pcwstr): Int =
    windowssys_windows_win32_foundation_sysReAllocString(pbstr?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>())

public actual fun sysReAllocStringLen(pbstr: COpaquePointer?, psz: Pcwstr, len: UInt): Int =
    windowssys_windows_win32_foundation_sysReAllocStringLen(pbstr?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>(), len)

public actual fun sysReleaseString(bstrstring: Bstr) {
    windowssys_windows_win32_foundation_sysReleaseString(bstrstring?.value?.toCPointer<ByteVar>())
}

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    windowssys_windows_win32_foundation_sysStringByteLen(bstr?.value?.toCPointer<ByteVar>())

public actual fun sysStringLen(pbstr: Bstr): UInt =
    windowssys_windows_win32_foundation_sysStringLen(pbstr?.value?.toCPointer<ByteVar>())
