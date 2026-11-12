@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun offlineFilesEnable(benable: Bool, pbrebootrequired: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageOfflinefilesOfflineFilesEnable")

public actual fun offlineFilesQueryStatus(pbactive: MutPtr, pbenabled: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatus")

public actual fun offlineFilesQueryStatusEx(pbactive: MutPtr, pbenabled: MutPtr, pbavailable: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatusEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageOfflinefilesOfflineFilesStart")
private external fun wasiWindowssysWindowsWin32StorageOfflinefilesOfflineFilesStart(): Int

public actual fun offlineFilesStart(): UInt =
    wasiWindowssysWindowsWin32StorageOfflinefilesOfflineFilesStart().toUInt()
