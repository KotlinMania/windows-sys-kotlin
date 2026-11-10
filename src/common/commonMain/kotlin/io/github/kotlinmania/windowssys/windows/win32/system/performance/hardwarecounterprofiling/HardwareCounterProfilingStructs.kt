package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

public data class HardwareCounterData(
    public var type: HardwareCounterType = 0,
    public var reserved: UInt = 0u,
    public var value: ULong = 0uL,
)

public data class PerformanceData(
    public var size: UShort = 0u,
    public var version: UByte = 0u,
    public var hwCountersCount: UByte = 0u,
    public var contextSwitchCount: UInt = 0u,
    public var waitReasonBitMap: ULong = 0uL,
    public var cycleTime: ULong = 0uL,
    public var retryCount: UInt = 0u,
    public var reserved: UInt = 0u,
    public var hwCounters: List<HardwareCounterData> = List(16) { HardwareCounterData() },
)
