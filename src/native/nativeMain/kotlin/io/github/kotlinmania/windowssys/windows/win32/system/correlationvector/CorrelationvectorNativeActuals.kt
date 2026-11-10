@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.windowssys.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun rtlExtendCorrelationVector(correlationvector: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssys_windows_win32_system_correlationvector_rtlExtendCorrelationVector(correlationvector?.value?.toCPointer<ByteVar>())

public actual fun rtlIncrementCorrelationVector(correlationvector: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssys_windows_win32_system_correlationvector_rtlIncrementCorrelationVector(correlationvector?.value?.toCPointer<ByteVar>())

public actual fun rtlInitializeCorrelationVector(correlationvector: COpaquePointer?, version: Int, guid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssys_windows_win32_system_correlationvector_rtlInitializeCorrelationVector(correlationvector?.value?.toCPointer<ByteVar>(), version, guid?.value?.toCPointer<ByteVar>())

public actual fun rtlValidateCorrelationVector(vector: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssys_windows_win32_system_correlationvector_rtlValidateCorrelationVector(vector?.value?.toCPointer<ByteVar>())
