package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun closeHandle(hobject: Handle): Bool

public expect fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool

public expect fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: MutPtr, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool

public expect fun freeLibrary(hlibmodule: Hmodule): Bool

public expect fun getHandleInformation(hobject: Handle, lpdwflags: MutPtr): Bool

public expect fun getLastError(): Win32Error

public expect fun globalFree(hmem: Hglobal): Hglobal

public expect fun localFree(hmem: Hlocal): Hlocal

public expect fun rtlNtStatusToDosError(status: Ntstatus): UInt

public expect fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool

public expect fun setLastError(dwerrcode: Win32Error)

public expect fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt)

public expect fun sysAddRefString(bstrstring: Bstr): Hresult

public expect fun sysAllocString(psz: Pcwstr): Bstr

public expect fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr

public expect fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr

public expect fun sysFreeString(bstrstring: Bstr)

public expect fun sysReAllocString(pbstr: MutPtr, psz: Pcwstr): Int

public expect fun sysReAllocStringLen(pbstr: MutPtr, psz: Pcwstr, len: UInt): Int

public expect fun sysReleaseString(bstrstring: Bstr)

public expect fun sysStringByteLen(bstr: Bstr): UInt

public expect fun sysStringLen(pbstr: Bstr): UInt
