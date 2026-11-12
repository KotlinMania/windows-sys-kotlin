@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr, systeminformationlength: UInt, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation")

public actual fun ntQuerySystemTime(systemtime: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSysteminformationNtQuerySystemTime")

public actual fun ntQueryTimerResolution(maximumtime: MutPtr, minimumtime: MutPtr, currenttime: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution")

public actual fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr, systeminformationlength: UInt, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation")

public actual fun zwQuerySystemTime(systemtime: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSysteminformationZwQuerySystemTime")

public actual fun zwQueryTimerResolution(maximumtime: MutPtr, minimumtime: MutPtr, currenttime: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution")
