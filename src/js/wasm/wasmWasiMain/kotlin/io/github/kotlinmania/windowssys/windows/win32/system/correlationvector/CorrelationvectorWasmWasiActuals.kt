@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun rtlExtendCorrelationVector(correlationvector: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemCorrelationvectorRtlExtendCorrelationVector")

public actual fun rtlIncrementCorrelationVector(correlationvector: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemCorrelationvectorRtlIncrementCorrelationVector")

public actual fun rtlInitializeCorrelationVector(correlationvector: MutPtr, version: Int, guid: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemCorrelationvectorRtlInitializeCorrelationVector")

public actual fun rtlValidateCorrelationVector(vector: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemCorrelationvectorRtlValidateCorrelationVector")
