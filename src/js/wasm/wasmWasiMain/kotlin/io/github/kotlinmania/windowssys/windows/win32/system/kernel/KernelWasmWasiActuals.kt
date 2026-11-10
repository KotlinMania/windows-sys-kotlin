@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.windowssys.COpaquePointer

public actual fun rtlFirstEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInitializeSListHead(listhead: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlInterlockedFlushSList(listhead: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInterlockedPopEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInterlockedPushEntrySList(listhead: COpaquePointer?, listentry: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInterlockedPushListSListEx(listhead: COpaquePointer?, list: COpaquePointer?, listend: COpaquePointer?, count: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlQueryDepthSList(listhead: COpaquePointer?): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
