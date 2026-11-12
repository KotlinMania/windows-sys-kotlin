@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort")

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort")

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSerialcommunicationComDBClose")

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: MutPtr, buffersize: UInt, reporttype: UInt, maxportsreported: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage")

public actual fun comDBOpen(phcomdb: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSerialcommunicationComDBOpen")

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort")

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase")
