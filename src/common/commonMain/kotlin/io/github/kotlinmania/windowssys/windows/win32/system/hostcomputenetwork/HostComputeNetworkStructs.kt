package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
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

public data class HcnPortRangeReservation(
    public var startingPort: UShort = 0u,
    public var endingPort: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HcnPortRangeReservation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HcnPortRangeReservation> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HcnPortRangeReservation =
                    HcnPortRangeReservation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: HcnPortRangeReservation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.startingPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.endingPort)
                }
            }
    }
}
