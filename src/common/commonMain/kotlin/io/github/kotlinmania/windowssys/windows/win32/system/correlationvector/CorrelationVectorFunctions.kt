package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

public expect fun RtlExtendCorrelationVector(correlationvector: Long): UInt

public expect fun RtlIncrementCorrelationVector(correlationvector: Long): UInt

public expect fun RtlInitializeCorrelationVector(correlationvector: Long, version: Int, guid: Long): UInt

public expect fun RtlValidateCorrelationVector(vector: Long): UInt
