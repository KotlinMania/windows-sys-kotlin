package io.github.kotlinmania.windowssys.windows.win32.system.mixedreality

import io.github.kotlinmania.windowssys.core.GUID

public data class PERCEPTION_PAYLOAD_FIELD(
    public var FieldId: GUID = GUID(),
    public var OffsetInBytes: UInt = 0u,
    public var SizeInBytes: UInt = 0u,
)

public data class PERCEPTION_STATE_STREAM_TIMESTAMPS(public var InputTimestampInQpcCounts: Long = 0L, public var AvailableTimestampInQpcCounts: Long = 0L)
