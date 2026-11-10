@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public actual fun vhfAsyncOperationComplete(vhfoperationhandle: COpaquePointer?, completionstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vhfCreate(vhfconfig: COpaquePointer?, vhfhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vhfDelete(vhfhandle: COpaquePointer?, wait: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun vhfReadReportSubmit(vhfhandle: COpaquePointer?, hidtransferpacket: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vhfStart(vhfhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
