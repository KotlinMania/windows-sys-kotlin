@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun vhfAsyncOperationComplete(vhfoperationhandle: ConstPtr<CVoid>, completionstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete")

public actual fun vhfCreate(vhfconfig: ConstPtr<VhfConfig>, vhfhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate")

public actual fun vhfDelete(vhfhandle: ConstPtr<CVoid>, wait: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete")

public actual fun vhfReadReportSubmit(vhfhandle: ConstPtr<CVoid>, hidtransferpacket: ConstPtr<HidXferPacket>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit")

public actual fun vhfStart(vhfhandle: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart")
