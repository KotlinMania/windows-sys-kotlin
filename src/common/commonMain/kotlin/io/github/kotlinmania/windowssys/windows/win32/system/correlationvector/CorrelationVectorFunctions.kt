package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid

public expect fun rtlExtendCorrelationVector(correlationvector: MutPtr<CorrelationVector>): UInt

public expect fun rtlIncrementCorrelationVector(correlationvector: MutPtr<CorrelationVector>): UInt

public expect fun rtlInitializeCorrelationVector(correlationvector: MutPtr<CorrelationVector>, version: Int, guid: ConstPtr<Guid>): UInt

public expect fun rtlValidateCorrelationVector(vector: ConstPtr<CorrelationVector>): UInt
