@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid

private object WindowsWin32SystemCorrelationvectorJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemCorrelationvectorRtlExtendCorrelationVector(correlationvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemCorrelationvectorRtlIncrementCorrelationVector(correlationvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemCorrelationvectorRtlInitializeCorrelationVector(correlationvector: Long, version: Int, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemCorrelationvectorRtlValidateCorrelationVector(vector: Long): Int
}

public actual fun rtlExtendCorrelationVector(correlationvector: MutPtr<CorrelationVector>): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssysWindowsWin32SystemCorrelationvectorRtlExtendCorrelationVector(correlationvector.rawAddress).toUInt()

public actual fun rtlIncrementCorrelationVector(correlationvector: MutPtr<CorrelationVector>): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssysWindowsWin32SystemCorrelationvectorRtlIncrementCorrelationVector(correlationvector.rawAddress).toUInt()

public actual fun rtlInitializeCorrelationVector(correlationvector: MutPtr<CorrelationVector>, version: Int, guid: ConstPtr<Guid>): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssysWindowsWin32SystemCorrelationvectorRtlInitializeCorrelationVector(correlationvector.rawAddress, version, guid.rawAddress).toUInt()

public actual fun rtlValidateCorrelationVector(vector: ConstPtr<CorrelationVector>): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssysWindowsWin32SystemCorrelationvectorRtlValidateCorrelationVector(vector.rawAddress).toUInt()
