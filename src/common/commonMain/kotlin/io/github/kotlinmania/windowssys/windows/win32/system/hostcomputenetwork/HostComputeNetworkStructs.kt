package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.core.GUID

public data class HCN_PORT_RANGE_ENTRY(
    public var OwningPartitionId: GUID = GUID(),
    public var TargetPartitionId: GUID = GUID(),
    public var Protocol: HCN_PORT_PROTOCOL = 0,
    public var Priority: ULong = 0uL,
    public var ReservationType: UInt = 0u,
    public var SharingFlags: UInt = 0u,
    public var DeliveryMode: UInt = 0u,
    public var StartingPort: UShort = 0u,
    public var EndingPort: UShort = 0u,
)

public data class HCN_PORT_RANGE_RESERVATION(public var startingPort: UShort = 0u, public var endingPort: UShort = 0u)
