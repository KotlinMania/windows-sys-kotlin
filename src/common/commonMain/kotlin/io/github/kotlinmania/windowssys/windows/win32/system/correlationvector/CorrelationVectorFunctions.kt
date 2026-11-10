package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.windowssys.COpaquePointer

public expect fun rtlExtendCorrelationVector(correlationvector: COpaquePointer?): UInt

public expect fun rtlIncrementCorrelationVector(correlationvector: COpaquePointer?): UInt

public expect fun rtlInitializeCorrelationVector(correlationvector: COpaquePointer?, version: Int, guid: COpaquePointer?): UInt

public expect fun rtlValidateCorrelationVector(vector: COpaquePointer?): UInt
