package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun RtlExtendCorrelationVector(correlationvector: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlExtendCorrelationVector", longArrayOf(correlationvector)).toUInt()
}

public fun RtlIncrementCorrelationVector(correlationvector: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIncrementCorrelationVector", longArrayOf(correlationvector)).toUInt()
}

public fun RtlInitializeCorrelationVector(correlationvector: Long, version: Int, guid: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInitializeCorrelationVector", longArrayOf(correlationvector, version.toLong(), guid)).toUInt()
}

public fun RtlValidateCorrelationVector(vector: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlValidateCorrelationVector", longArrayOf(vector)).toUInt()
}
