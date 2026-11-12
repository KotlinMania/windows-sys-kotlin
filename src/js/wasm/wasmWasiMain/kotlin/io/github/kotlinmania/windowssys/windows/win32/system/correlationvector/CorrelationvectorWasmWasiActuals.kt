@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun rtlExtendCorrelationVector(correlationvector: MutPtr<CorrelationVector>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemCorrelationvectorRtlExtendCorrelationVector")

public actual fun rtlIncrementCorrelationVector(correlationvector: MutPtr<CorrelationVector>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemCorrelationvectorRtlIncrementCorrelationVector")

public actual fun rtlInitializeCorrelationVector(correlationvector: MutPtr<CorrelationVector>, version: Int, guid: ConstPtr<Guid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemCorrelationvectorRtlInitializeCorrelationVector")

public actual fun rtlValidateCorrelationVector(vector: ConstPtr<CorrelationVector>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemCorrelationvectorRtlValidateCorrelationVector")
