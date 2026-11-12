package io.github.kotlinmania.windowssys.windows.win32.system.mixedreality

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.core.Guid

public data class PerceptionPayloadField(
    public var fieldId: Guid = Guid(),
    public var offsetInBytes: UInt = 0u,
    public var sizeInBytes: UInt = 0u,
)

public data class PerceptionStateStreamTimestamps(
    public var inputTimestampInQpcCounts: Long = 0L,
    public var availableTimestampInQpcCounts: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerceptionStateStreamTimestamps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerceptionStateStreamTimestamps> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PerceptionStateStreamTimestamps =
                    PerceptionStateStreamTimestamps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PerceptionStateStreamTimestamps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.inputTimestampInQpcCounts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.availableTimestampInQpcCounts)
                }
            }
    }
}
