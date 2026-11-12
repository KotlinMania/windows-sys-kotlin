@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaTimeBeginPeriod")
private external fun wasiWindowssysWindowsWin32MediaTimeBeginPeriod(uperiod: Int): Int

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    wasiWindowssysWindowsWin32MediaTimeBeginPeriod(uperiod.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaTimeEndPeriod")
private external fun wasiWindowssysWindowsWin32MediaTimeEndPeriod(uperiod: Int): Int

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    wasiWindowssysWindowsWin32MediaTimeEndPeriod(uperiod.toInt()).toUInt()

public actual fun timeGetDevCaps(ptc: MutPtr, cbtc: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaTimeGetDevCaps")

public actual fun timeGetSystemTime(pmmt: MutPtr, cbmmt: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaTimeGetSystemTime")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaTimeGetTime")
private external fun wasiWindowssysWindowsWin32MediaTimeGetTime(): Int

public actual fun timeGetTime(): UInt =
    wasiWindowssysWindowsWin32MediaTimeGetTime().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaTimeKillEvent")
private external fun wasiWindowssysWindowsWin32MediaTimeKillEvent(utimerid: Int): Int

public actual fun timeKillEvent(utimerid: UInt): UInt =
    wasiWindowssysWindowsWin32MediaTimeKillEvent(utimerid.toInt()).toUInt()

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaTimeSetEvent")
