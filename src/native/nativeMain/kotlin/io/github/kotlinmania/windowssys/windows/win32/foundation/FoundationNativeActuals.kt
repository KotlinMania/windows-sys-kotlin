@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun closeHandle(hobject: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_closeHandle(hobject?.value?.toCPointer<ByteVar>())

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_compareObjectHandles(hfirstobjecthandle?.value?.toCPointer<ByteVar>(), hsecondobjecthandle?.value?.toCPointer<ByteVar>())

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: COpaquePointer?, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_duplicateHandle(hsourceprocesshandle?.value?.toCPointer<ByteVar>(), hsourcehandle?.value?.toCPointer<ByteVar>(), htargetprocesshandle?.value?.toCPointer<ByteVar>(), lptargethandle?.value?.toCPointer<ByteVar>(), dwdesiredaccess, binherithandle, dwoptions)

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_freeLibrary(hlibmodule?.value?.toCPointer<ByteVar>())

public actual fun getHandleInformation(hobject: Handle, lpdwflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_getHandleInformation(hobject?.value?.toCPointer<ByteVar>(), lpdwflags?.value?.toCPointer<ByteVar>())

public actual fun getLastError(): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_getLastError()

public actual fun globalFree(hmem: Hglobal): Hglobal =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_globalFree(hmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localFree(hmem: Hlocal): Hlocal =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_localFree(hmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_rtlNtStatusToDosError(status)

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_setHandleInformation(hobject?.value?.toCPointer<ByteVar>(), dwmask, dwflags)

public actual fun setLastError(dwerrcode: Win32Error) {
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_setLastError(dwerrcode)
}

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_setLastErrorEx(dwerrcode, dwtype)
}

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysAddRefString(bstrstring?.value?.toCPointer<ByteVar>())

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysAllocString(psz?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysAllocStringByteLen(psz?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysAllocStringLen(strin?.value?.toCPointer<ByteVar>(), ui)?.let { COpaquePointer(it.toLong()) }

public actual fun sysFreeString(bstrstring: Bstr) {
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysFreeString(bstrstring?.value?.toCPointer<ByteVar>())
}

public actual fun sysReAllocString(pbstr: COpaquePointer?, psz: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysReAllocString(pbstr?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>())

public actual fun sysReAllocStringLen(pbstr: COpaquePointer?, psz: Pcwstr, len: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysReAllocStringLen(pbstr?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>(), len)

public actual fun sysReleaseString(bstrstring: Bstr) {
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysReleaseString(bstrstring?.value?.toCPointer<ByteVar>())
}

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysStringByteLen(bstr?.value?.toCPointer<ByteVar>())

public actual fun sysStringLen(pbstr: Bstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssys_windows_win32_foundation_sysStringLen(pbstr?.value?.toCPointer<ByteVar>())
