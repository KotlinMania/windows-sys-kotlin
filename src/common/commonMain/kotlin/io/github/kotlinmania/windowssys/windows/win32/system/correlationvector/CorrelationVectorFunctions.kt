package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun rtlExtendCorrelationVector(correlationvector: MutPtr): UInt

public expect fun rtlIncrementCorrelationVector(correlationvector: MutPtr): UInt

public expect fun rtlInitializeCorrelationVector(correlationvector: MutPtr, version: Int, guid: ConstPtr): UInt

public expect fun rtlValidateCorrelationVector(vector: ConstPtr): UInt
