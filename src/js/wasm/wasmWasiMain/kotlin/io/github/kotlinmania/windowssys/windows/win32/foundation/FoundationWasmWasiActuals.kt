@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun closeHandle(hobject: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationCloseHandle")

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationCompareObjectHandles")

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: MutPtr, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationDuplicateHandle")

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationFreeLibrary")

public actual fun getHandleInformation(hobject: Handle, lpdwflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationGetHandleInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32FoundationGetLastError")
private external fun wasiWindowssysWindowsWin32FoundationGetLastError(): Int

public actual fun getLastError(): Win32Error =
    wasiWindowssysWindowsWin32FoundationGetLastError().toUInt()

public actual fun globalFree(hmem: Hglobal): Hglobal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationGlobalFree")

public actual fun localFree(hmem: Hlocal): Hlocal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationLocalFree")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32FoundationRtlNtStatusToDosError")
private external fun wasiWindowssysWindowsWin32FoundationRtlNtStatusToDosError(status: Int): Int

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    wasiWindowssysWindowsWin32FoundationRtlNtStatusToDosError(status).toUInt()

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSetHandleInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32FoundationSetLastError")
private external fun wasiWindowssysWindowsWin32FoundationSetLastError(dwerrcode: Int): Unit

public actual fun setLastError(dwerrcode: Win32Error): Unit =
    wasiWindowssysWindowsWin32FoundationSetLastError(dwerrcode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32FoundationSetLastErrorEx")
private external fun wasiWindowssysWindowsWin32FoundationSetLastErrorEx(dwerrcode: Int, dwtype: Int): Unit

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt): Unit =
    wasiWindowssysWindowsWin32FoundationSetLastErrorEx(dwerrcode.toInt(), dwtype.toInt())

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSysAddRefString")

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSysAllocString")

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSysAllocStringByteLen")

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSysAllocStringLen")

public actual fun sysFreeString(bstrstring: Bstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSysFreeString")

public actual fun sysReAllocString(pbstr: MutPtr, psz: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSysReAllocString")

public actual fun sysReAllocStringLen(pbstr: MutPtr, psz: Pcwstr, len: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSysReAllocStringLen")

public actual fun sysReleaseString(bstrstring: Bstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSysReleaseString")

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSysStringByteLen")

public actual fun sysStringLen(pbstr: Bstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32FoundationSysStringLen")
