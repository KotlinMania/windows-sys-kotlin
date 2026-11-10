@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32FoundationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_foundation_closeHandle(hobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_compareObjectHandles(hfirstobjecthandle: Long, hsecondobjecthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_duplicateHandle(hsourceprocesshandle: Long, hsourcehandle: Long, htargetprocesshandle: Long, lptargethandle: Long, dwdesiredaccess: Int, binherithandle: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_freeLibrary(hlibmodule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_getHandleInformation(hobject: Long, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_getLastError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_globalFree(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_foundation_localFree(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_foundation_rtlNtStatusToDosError(status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_setHandleInformation(hobject: Long, dwmask: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_setLastError(dwerrcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_foundation_setLastErrorEx(dwerrcode: Int, dwtype: Int)

    @JvmStatic
    external fun windowssys_windows_win32_foundation_sysAddRefString(bstrstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_sysAllocString(psz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_foundation_sysAllocStringByteLen(psz: Long, len: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_foundation_sysAllocStringLen(strin: Long, ui: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_foundation_sysFreeString(bstrstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_foundation_sysReAllocString(pbstr: Long, psz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_sysReAllocStringLen(pbstr: Long, psz: Long, len: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_sysReleaseString(bstrstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_foundation_sysStringByteLen(bstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_foundation_sysStringLen(pbstr: Long): Int
}

public actual fun closeHandle(hobject: Handle): Bool =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_closeHandle((hobject?.value ?: 0L))

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_compareObjectHandles((hfirstobjecthandle?.value ?: 0L), (hsecondobjecthandle?.value ?: 0L))

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: COpaquePointer?, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_duplicateHandle((hsourceprocesshandle?.value ?: 0L), (hsourcehandle?.value ?: 0L), (htargetprocesshandle?.value ?: 0L), (lptargethandle?.value ?: 0L), dwdesiredaccess.toInt(), binherithandle, dwoptions.toInt())

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_freeLibrary((hlibmodule?.value ?: 0L))

public actual fun getHandleInformation(hobject: Handle, lpdwflags: COpaquePointer?): Bool =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_getHandleInformation((hobject?.value ?: 0L), (lpdwflags?.value ?: 0L))

public actual fun getLastError(): Win32Error =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_getLastError().toUInt()

public actual fun globalFree(hmem: Hglobal): Hglobal =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_globalFree((hmem?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localFree(hmem: Hlocal): Hlocal =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_localFree((hmem?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_rtlNtStatusToDosError(status).toUInt()

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_setHandleInformation((hobject?.value ?: 0L), dwmask.toInt(), dwflags.toInt())

public actual fun setLastError(dwerrcode: Win32Error) {
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_setLastError(dwerrcode.toInt())
}

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt) {
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_setLastErrorEx(dwerrcode.toInt(), dwtype.toInt())
}

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_sysAddRefString((bstrstring?.value ?: 0L))

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_sysAllocString((psz?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_sysAllocStringByteLen((psz?.value ?: 0L), len.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_sysAllocStringLen((strin?.value ?: 0L), ui.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sysFreeString(bstrstring: Bstr) {
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_sysFreeString((bstrstring?.value ?: 0L))
}

public actual fun sysReAllocString(pbstr: COpaquePointer?, psz: Pcwstr): Int =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_sysReAllocString((pbstr?.value ?: 0L), (psz?.value ?: 0L))

public actual fun sysReAllocStringLen(pbstr: COpaquePointer?, psz: Pcwstr, len: UInt): Int =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_sysReAllocStringLen((pbstr?.value ?: 0L), (psz?.value ?: 0L), len.toInt())

public actual fun sysReleaseString(bstrstring: Bstr) {
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_sysReleaseString((bstrstring?.value ?: 0L))
}

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_sysStringByteLen((bstr?.value ?: 0L)).toUInt()

public actual fun sysStringLen(pbstr: Bstr): UInt =
    WindowsWin32FoundationJniBridge.windowssys_windows_win32_foundation_sysStringLen((pbstr?.value ?: 0L)).toUInt()
