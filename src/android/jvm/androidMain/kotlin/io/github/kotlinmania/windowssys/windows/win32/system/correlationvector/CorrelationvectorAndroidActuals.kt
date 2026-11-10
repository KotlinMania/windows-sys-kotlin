@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.windowssys.COpaquePointer

private object WindowsWin32SystemCorrelationvectorJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_correlationvector_rtlExtendCorrelationVector(correlationvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_correlationvector_rtlIncrementCorrelationVector(correlationvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_correlationvector_rtlInitializeCorrelationVector(correlationvector: Long, version: Int, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_correlationvector_rtlValidateCorrelationVector(vector: Long): Int
}

public actual fun rtlExtendCorrelationVector(correlationvector: COpaquePointer?): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssys_windows_win32_system_correlationvector_rtlExtendCorrelationVector((correlationvector?.value ?: 0L)).toUInt()

public actual fun rtlIncrementCorrelationVector(correlationvector: COpaquePointer?): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssys_windows_win32_system_correlationvector_rtlIncrementCorrelationVector((correlationvector?.value ?: 0L)).toUInt()

public actual fun rtlInitializeCorrelationVector(correlationvector: COpaquePointer?, version: Int, guid: COpaquePointer?): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssys_windows_win32_system_correlationvector_rtlInitializeCorrelationVector((correlationvector?.value ?: 0L), version, (guid?.value ?: 0L)).toUInt()

public actual fun rtlValidateCorrelationVector(vector: COpaquePointer?): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssys_windows_win32_system_correlationvector_rtlValidateCorrelationVector((vector?.value ?: 0L)).toUInt()
