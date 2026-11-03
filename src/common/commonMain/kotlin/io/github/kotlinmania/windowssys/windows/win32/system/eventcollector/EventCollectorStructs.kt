package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR

public data class EC_VARIANT(
    public var Anonymous: EC_VARIANT_0 = EC_VARIANT_0(),
    public var Count: UInt = 0u,
    public var Type: UInt = 0u,
)

public data class EC_VARIANT_0(
    public var BooleanVal: BOOL = 0,
    public var UInt32Val: UInt = 0u,
    public var DateTimeVal: ULong = 0uL,
    public var StringVal: PCWSTR = 0L,
    public var BinaryVal: Long = 0L,
    public var BooleanArr: Long = 0L,
    public var Int32Arr: Long = 0L,
    public var StringArr: Long = 0L,
    public var PropertyHandleVal: Long = 0L,
)
