@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public actual fun offlineFilesEnable(benable: Bool, pbrebootrequired: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun offlineFilesQueryStatus(pbactive: COpaquePointer?, pbenabled: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun offlineFilesQueryStatusEx(pbactive: COpaquePointer?, pbenabled: COpaquePointer?, pbavailable: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun offlineFilesStart(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
