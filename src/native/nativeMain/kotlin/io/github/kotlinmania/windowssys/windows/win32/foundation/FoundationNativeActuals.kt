@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationCompareObjectHandles
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationDuplicateHandle
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationFreeLibrary
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationGetHandleInformation
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationGetLastError
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationGlobalFree
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationLocalFree
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationRtlNtStatusToDosError
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSetHandleInformation
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSetLastError
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSetLastErrorEx
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSysAddRefString
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSysAllocString
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSysAllocStringByteLen
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSysAllocStringLen
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSysFreeString
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSysReAllocString
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSysReAllocStringLen
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSysReleaseString
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSysStringByteLen
import io.github.kotlinmania.windowssys.windows.win32.foundation.cinterop.windowssysWindowsWin32FoundationSysStringLen
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun closeHandle(hobject: Handle): Bool =
    windowssysWindowsWin32FoundationCloseHandle(hobject.rawAddress.toCPointer<ByteVar>())

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    windowssysWindowsWin32FoundationCompareObjectHandles(hfirstobjecthandle.rawAddress.toCPointer<ByteVar>(), hsecondobjecthandle.rawAddress.toCPointer<ByteVar>())

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: MutPtr, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    windowssysWindowsWin32FoundationDuplicateHandle(hsourceprocesshandle.rawAddress.toCPointer<ByteVar>(), hsourcehandle.rawAddress.toCPointer<ByteVar>(), htargetprocesshandle.rawAddress.toCPointer<ByteVar>(), lptargethandle.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess, binherithandle, dwoptions)

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    windowssysWindowsWin32FoundationFreeLibrary(hlibmodule.rawAddress.toCPointer<ByteVar>())

public actual fun getHandleInformation(hobject: Handle, lpdwflags: MutPtr): Bool =
    windowssysWindowsWin32FoundationGetHandleInformation(hobject.rawAddress.toCPointer<ByteVar>(), lpdwflags.rawAddress.toCPointer<ByteVar>())

public actual fun getLastError(): Win32Error =
    windowssysWindowsWin32FoundationGetLastError()

public actual fun globalFree(hmem: Hglobal): Hglobal =
    MutPtr(windowssysWindowsWin32FoundationGlobalFree(hmem.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localFree(hmem: Hlocal): Hlocal =
    MutPtr(windowssysWindowsWin32FoundationLocalFree(hmem.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    windowssysWindowsWin32FoundationRtlNtStatusToDosError(status)

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    windowssysWindowsWin32FoundationSetHandleInformation(hobject.rawAddress.toCPointer<ByteVar>(), dwmask, dwflags)

public actual fun setLastError(dwerrcode: Win32Error) {
    windowssysWindowsWin32FoundationSetLastError(dwerrcode)
}

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt) {
    windowssysWindowsWin32FoundationSetLastErrorEx(dwerrcode, dwtype)
}

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    windowssysWindowsWin32FoundationSysAddRefString(bstrstring.rawAddress.toCPointer<ByteVar>())

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    ConstPtr(windowssysWindowsWin32FoundationSysAllocString(psz.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    ConstPtr(windowssysWindowsWin32FoundationSysAllocStringByteLen(psz.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    ConstPtr(windowssysWindowsWin32FoundationSysAllocStringLen(strin.rawAddress.toCPointer<ByteVar>(), ui)?.toLong() ?: 0L)

public actual fun sysFreeString(bstrstring: Bstr) {
    windowssysWindowsWin32FoundationSysFreeString(bstrstring.rawAddress.toCPointer<ByteVar>())
}

public actual fun sysReAllocString(pbstr: MutPtr, psz: Pcwstr): Int =
    windowssysWindowsWin32FoundationSysReAllocString(pbstr.rawAddress.toCPointer<ByteVar>(), psz.rawAddress.toCPointer<ByteVar>())

public actual fun sysReAllocStringLen(pbstr: MutPtr, psz: Pcwstr, len: UInt): Int =
    windowssysWindowsWin32FoundationSysReAllocStringLen(pbstr.rawAddress.toCPointer<ByteVar>(), psz.rawAddress.toCPointer<ByteVar>(), len)

public actual fun sysReleaseString(bstrstring: Bstr) {
    windowssysWindowsWin32FoundationSysReleaseString(bstrstring.rawAddress.toCPointer<ByteVar>())
}

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    windowssysWindowsWin32FoundationSysStringByteLen(bstr.rawAddress.toCPointer<ByteVar>())

public actual fun sysStringLen(pbstr: Bstr): UInt =
    windowssysWindowsWin32FoundationSysStringLen(pbstr.rawAddress.toCPointer<ByteVar>())
