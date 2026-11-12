package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class CorrelationVector(
    public var version: Byte = 0,
    public var vector: ByteArray = ByteArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CorrelationVector) return false
        if (this.version != other.version) return false
        if (!this.vector.contentEquals(other.vector)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.vector.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CorrelationVector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CorrelationVector> {
                override val sizeBytes: Long = 130L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): CorrelationVector =
                    CorrelationVector(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (129).toInt())
                        ).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: CorrelationVector) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (129).toInt())
                    ).writeNative(addr + 1L, value.vector)
                }
            }
    }
}
