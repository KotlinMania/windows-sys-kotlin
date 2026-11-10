package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.core.Guid

public data class HcnPortRangeEntry(
    public var owningPartitionId: Guid = Guid(),
    public var targetPartitionId: Guid = Guid(),
    public var protocol: HcnPortProtocol = 0,
    public var priority: ULong = 0uL,
    public var reservationType: UInt = 0u,
    public var sharingFlags: UInt = 0u,
    public var deliveryMode: UInt = 0u,
    public var startingPort: UShort = 0u,
    public var endingPort: UShort = 0u,
)

public data class HcnPortRangeReservation(public var startingPort: UShort = 0u, public var endingPort: UShort = 0u)
