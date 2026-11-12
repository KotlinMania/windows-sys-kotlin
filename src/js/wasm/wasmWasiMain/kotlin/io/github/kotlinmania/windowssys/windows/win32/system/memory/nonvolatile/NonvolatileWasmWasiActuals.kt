@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun rtlDrainNonVolatileFlush(nvtoken: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush")

public actual fun rtlFillNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvdestination: MutPtr<CVoid>, size: ULong, value: UByte, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory")

public actual fun rtlFlushNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvbuffer: ConstPtr<CVoid>, size: ULong, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory")

public actual fun rtlFlushNonVolatileMemoryRanges(nvtoken: ConstPtr<CVoid>, nvranges: ConstPtr<NvMemoryRange>, numranges: ULong, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges")

public actual fun rtlFreeNonVolatileToken(nvtoken: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken")

public actual fun rtlGetNonVolatileToken(nvbuffer: ConstPtr<CVoid>, size: ULong, nvtoken: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken")

public actual fun rtlWriteNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvdestination: MutPtr<CVoid>, source: ConstPtr<CVoid>, size: ULong, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory")
