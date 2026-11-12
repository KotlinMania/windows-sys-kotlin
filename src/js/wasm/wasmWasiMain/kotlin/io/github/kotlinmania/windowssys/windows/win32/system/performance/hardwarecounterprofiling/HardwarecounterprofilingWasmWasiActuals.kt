@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun disableThreadProfiling(performancedatahandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingDisableThreadProfiling")

public actual fun enableThreadProfiling(threadhandle: Handle, flags: UInt, hardwarecounters: ULong, performancedatahandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingEnableThreadProfiling")

public actual fun queryThreadProfiling(threadhandle: Handle, enabled: MutPtr<Boolean>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingQueryThreadProfiling")

public actual fun readThreadProfilingData(performancedatahandle: Handle, flags: UInt, performancedata: MutPtr<PerformanceData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingReadThreadProfilingData")
