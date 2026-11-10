@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun disableThreadProfiling(performancedatahandle: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enableThreadProfiling(threadhandle: Handle, flags: UInt, hardwarecounters: ULong, performancedatahandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryThreadProfiling(threadhandle: Handle, enabled: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readThreadProfilingData(performancedatahandle: Handle, flags: UInt, performancedata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
