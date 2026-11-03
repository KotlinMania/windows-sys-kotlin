package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

public data class HARDWARE_COUNTER_DATA(
    public var Type: HARDWARE_COUNTER_TYPE = 0,
    public var Reserved: UInt = 0u,
    public var Value: ULong = 0uL,
)

public data class PERFORMANCE_DATA(
    public var Size: UShort = 0u,
    public var Version: UByte = 0u,
    public var HwCountersCount: UByte = 0u,
    public var ContextSwitchCount: UInt = 0u,
    public var WaitReasonBitMap: ULong = 0uL,
    public var CycleTime: ULong = 0uL,
    public var RetryCount: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var HwCounters: List<HARDWARE_COUNTER_DATA> = List(16) { HARDWARE_COUNTER_DATA() },
)
