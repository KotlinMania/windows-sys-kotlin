@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun miApplicationInitializeV1(flags: UInt, applicationid: ConstPtr<UShort>, extendederror: MutPtr<MutPtr<MiInstance>>, application: MutPtr<MiApplication>): MiResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWmiMiApplicationInitializeV1")
