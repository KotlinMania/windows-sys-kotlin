@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

public actual fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
