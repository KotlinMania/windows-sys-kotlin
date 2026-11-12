@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup")

public actual fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilehistoryFhServiceClosePipe")

public actual fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: MutPtr<FhServicePipeHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe")

public actual fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration")

public actual fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilehistoryFhServiceStartBackup")

public actual fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilehistoryFhServiceStopBackup")

public actual fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup")
