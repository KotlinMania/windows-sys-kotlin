@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun vhfAsyncOperationComplete(vhfoperationhandle: ConstPtr, completionstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete")

public actual fun vhfCreate(vhfconfig: ConstPtr, vhfhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate")

public actual fun vhfDelete(vhfhandle: ConstPtr, wait: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete")

public actual fun vhfReadReportSubmit(vhfhandle: ConstPtr, hidtransferpacket: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit")

public actual fun vhfStart(vhfhandle: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart")
