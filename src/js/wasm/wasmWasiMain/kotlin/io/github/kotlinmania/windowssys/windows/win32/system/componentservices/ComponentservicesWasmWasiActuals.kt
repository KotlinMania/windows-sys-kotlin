@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun coCreateActivity(piunknown: MutPtr, riid: ConstPtr, ppobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComponentservicesCoCreateActivity")

public actual fun coEnterServiceDomain(pconfigobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain")

public actual fun coGetDefaultContext(apttype: Apttype, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComponentservicesCoGetDefaultContext")

public actual fun coLeaveServiceDomain(punkstatus: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain")

public actual fun getDispenserManager(param0: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComponentservicesGetDispenserManager")

public actual fun getManagedExtensions(dwexts: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComponentservicesGetManagedExtensions")

public actual fun mTSCreateActivity(riid: ConstPtr, ppobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComponentservicesMTSCreateActivity")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComponentservicesRecycleSurrogate")
private external fun wasiWindowssysWindowsWin32SystemComponentservicesRecycleSurrogate(lreasoncode: Int): Int

public actual fun recycleSurrogate(lreasoncode: Int): Hresult =
    wasiWindowssysWindowsWin32SystemComponentservicesRecycleSurrogate(lreasoncode)

public actual fun safeRef(rid: ConstPtr, punk: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComponentservicesSafeRef")
