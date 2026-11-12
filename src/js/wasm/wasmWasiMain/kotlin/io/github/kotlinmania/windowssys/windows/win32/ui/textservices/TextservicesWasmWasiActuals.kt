@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun doMsCtfMonitor(dwflags: UInt, heventforservicestop: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTextservicesDoMsCtfMonitor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiTextservicesInitLocalMsCtfMonitor")
private external fun wasiWindowssysWindowsWin32UiTextservicesInitLocalMsCtfMonitor(dwflags: Int): Int

public actual fun initLocalMsCtfMonitor(dwflags: UInt): Hresult =
    wasiWindowssysWindowsWin32UiTextservicesInitLocalMsCtfMonitor(dwflags.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiTextservicesUninitLocalMsCtfMonitor")
private external fun wasiWindowssysWindowsWin32UiTextservicesUninitLocalMsCtfMonitor(): Int

public actual fun uninitLocalMsCtfMonitor(): Hresult =
    wasiWindowssysWindowsWin32UiTextservicesUninitLocalMsCtfMonitor()
