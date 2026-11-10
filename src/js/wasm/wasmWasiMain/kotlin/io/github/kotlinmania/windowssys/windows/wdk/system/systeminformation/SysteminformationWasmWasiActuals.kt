@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public actual fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: COpaquePointer?, systeminformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQuerySystemTime(systemtime: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: COpaquePointer?, systeminformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQuerySystemTime(systemtime: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
