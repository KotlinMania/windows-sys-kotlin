@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public actual fun closeHandle(hobject: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: COpaquePointer?, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getHandleInformation(hobject: Handle, lpdwflags: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getLastError(): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalFree(hmem: Hglobal): Hglobal =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localFree(hmem: Hlocal): Hlocal =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setLastError(dwerrcode: Win32Error) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysFreeString(bstrstring: Bstr) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sysReAllocString(pbstr: COpaquePointer?, psz: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysReAllocStringLen(pbstr: COpaquePointer?, psz: Pcwstr, len: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysReleaseString(bstrstring: Bstr) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysStringLen(pbstr: Bstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
