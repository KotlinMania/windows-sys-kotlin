@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssysWindowsWin32SystemCorrelationvectorRtlExtendCorrelationVector
import io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssysWindowsWin32SystemCorrelationvectorRtlIncrementCorrelationVector
import io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssysWindowsWin32SystemCorrelationvectorRtlInitializeCorrelationVector
import io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.cinterop.windowssysWindowsWin32SystemCorrelationvectorRtlValidateCorrelationVector
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun rtlExtendCorrelationVector(correlationvector: MutPtr<CorrelationVector>): UInt =
    windowssysWindowsWin32SystemCorrelationvectorRtlExtendCorrelationVector(correlationvector.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIncrementCorrelationVector(correlationvector: MutPtr<CorrelationVector>): UInt =
    windowssysWindowsWin32SystemCorrelationvectorRtlIncrementCorrelationVector(correlationvector.rawAddress.toCPointer<ByteVar>())

public actual fun rtlInitializeCorrelationVector(correlationvector: MutPtr<CorrelationVector>, version: Int, guid: ConstPtr<Guid>): UInt =
    windowssysWindowsWin32SystemCorrelationvectorRtlInitializeCorrelationVector(correlationvector.rawAddress.toCPointer<ByteVar>(), version, guid.rawAddress.toCPointer<ByteVar>())

public actual fun rtlValidateCorrelationVector(vector: ConstPtr<CorrelationVector>): UInt =
    windowssysWindowsWin32SystemCorrelationvectorRtlValidateCorrelationVector(vector.rawAddress.toCPointer<ByteVar>())
