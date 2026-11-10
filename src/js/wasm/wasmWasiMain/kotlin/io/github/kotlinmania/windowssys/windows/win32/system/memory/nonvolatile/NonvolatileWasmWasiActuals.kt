@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.windowssys.COpaquePointer

public actual fun rtlDrainNonVolatileFlush(nvtoken: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFillNonVolatileMemory(nvtoken: COpaquePointer?, nvdestination: COpaquePointer?, size: ULong, value: UByte, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFlushNonVolatileMemory(nvtoken: COpaquePointer?, nvbuffer: COpaquePointer?, size: ULong, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFlushNonVolatileMemoryRanges(nvtoken: COpaquePointer?, nvranges: COpaquePointer?, numranges: ULong, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFreeNonVolatileToken(nvtoken: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetNonVolatileToken(nvbuffer: COpaquePointer?, size: ULong, nvtoken: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlWriteNonVolatileMemory(nvtoken: COpaquePointer?, nvdestination: COpaquePointer?, source: COpaquePointer?, size: ULong, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
