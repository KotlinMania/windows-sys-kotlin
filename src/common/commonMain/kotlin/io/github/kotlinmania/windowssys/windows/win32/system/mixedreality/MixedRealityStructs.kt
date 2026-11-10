package io.github.kotlinmania.windowssys.windows.win32.system.mixedreality

import io.github.kotlinmania.windowssys.core.Guid

public data class PerceptionPayloadField(
    public var fieldId: Guid = Guid(),
    public var offsetInBytes: UInt = 0u,
    public var sizeInBytes: UInt = 0u,
)

public data class PerceptionStateStreamTimestamps(
    public var inputTimestampInQpcCounts: Long = 0L,
    public var availableTimestampInQpcCounts: Long = 0L,
)
