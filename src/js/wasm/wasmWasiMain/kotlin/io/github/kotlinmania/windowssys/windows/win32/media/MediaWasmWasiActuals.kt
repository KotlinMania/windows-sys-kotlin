@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.windowssys.COpaquePointer

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timeGetDevCaps(ptc: COpaquePointer?, cbtc: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timeGetSystemTime(pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timeGetTime(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timeKillEvent(utimerid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
