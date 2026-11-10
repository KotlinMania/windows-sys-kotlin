@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: COpaquePointer?, buffersize: UInt, reporttype: UInt, maxportsreported: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun comDBOpen(phcomdb: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
