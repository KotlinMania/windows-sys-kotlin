@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

private object WindowsWin32SystemCorrelationvectorJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_correlationvector_RtlExtendCorrelationVector(correlationvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_correlationvector_RtlIncrementCorrelationVector(correlationvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_correlationvector_RtlInitializeCorrelationVector(correlationvector: Long, version: Int, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_correlationvector_RtlValidateCorrelationVector(vector: Long): Int
}

public actual fun RtlExtendCorrelationVector(correlationvector: Long): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssys_windows_win32_system_correlationvector_RtlExtendCorrelationVector(correlationvector).toUInt()

public actual fun RtlIncrementCorrelationVector(correlationvector: Long): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssys_windows_win32_system_correlationvector_RtlIncrementCorrelationVector(correlationvector).toUInt()

public actual fun RtlInitializeCorrelationVector(correlationvector: Long, version: Int, guid: Long): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssys_windows_win32_system_correlationvector_RtlInitializeCorrelationVector(correlationvector, version, guid).toUInt()

public actual fun RtlValidateCorrelationVector(vector: Long): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssys_windows_win32_system_correlationvector_RtlValidateCorrelationVector(vector).toUInt()
