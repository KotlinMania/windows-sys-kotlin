@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun doMsCtfMonitor(dwflags: UInt, heventforservicestop: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initLocalMsCtfMonitor(dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uninitLocalMsCtfMonitor(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
