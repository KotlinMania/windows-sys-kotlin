package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class NvMemoryRange internal constructor(
    baseAddressCtorArg: MutPtr,
    public var length: Int,
) {
    public var baseAddress: MutPtr = baseAddressCtorArg
        internal set

    public constructor() : this(
        baseAddressCtorArg = MutPtr(0L),
        length = 0,
    )

    public operator fun component1(): MutPtr = this.baseAddress

    public operator fun component2(): Int = this.length

    public fun copy(baseAddress: MutPtr = this.baseAddress, length: Int = this.length): NvMemoryRange = NvMemoryRange(baseAddressCtorArg = baseAddress, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvMemoryRange) return false
        if (this.baseAddress != other.baseAddress) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.baseAddress.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvMemoryRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvMemoryRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NvMemoryRange =
                    NvMemoryRange(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NvMemoryRange) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.length)
                }
            }

        public operator fun invoke(
            baseAddress: MutPtr = MutPtr(0L),
            length: Int = 0,
        ): NvMemoryRange =
            NvMemoryRange(
                baseAddressCtorArg = baseAddress,
                length = length,
            )
    }
}
