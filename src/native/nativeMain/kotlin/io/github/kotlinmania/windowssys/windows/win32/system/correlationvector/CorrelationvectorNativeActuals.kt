@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun RtlExtendCorrelationVector(correlationvector: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssys_windows_win32_system_correlationvector_RtlExtendCorrelationVector(correlationvector.toCPointer<ByteVar>())

public actual fun RtlIncrementCorrelationVector(correlationvector: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssys_windows_win32_system_correlationvector_RtlIncrementCorrelationVector(correlationvector.toCPointer<ByteVar>())

public actual fun RtlInitializeCorrelationVector(correlationvector: Long, version: Int, guid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssys_windows_win32_system_correlationvector_RtlInitializeCorrelationVector(correlationvector.toCPointer<ByteVar>(), version, guid.toCPointer<ByteVar>())

public actual fun RtlValidateCorrelationVector(vector: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssys_windows_win32_system_correlationvector_RtlValidateCorrelationVector(vector.toCPointer<ByteVar>())
