@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Guid

public data class ImmpMpvStoreDriverHandle(
    public var guidSignature: Guid = Guid(),
)

public data class SPropAttrArray(
    public var cValues: UInt = 0u,
    public var aPropAttr: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SPropAttrArray) return false
        if (this.cValues != other.cValues) return false
        if (!this.aPropAttr.contentEquals(other.aPropAttr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.aPropAttr.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SPropAttrArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SPropAttrArray> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SPropAttrArray =
                    SPropAttrArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: SPropAttrArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.aPropAttr.toList())
                }
            }
    }
}

public class TagImmpidGuidlistItem internal constructor(
    pguidCtorArg: ConstPtr,
    public var dwStart: UInt,
    public var dwLast: UInt,
) {
    public var pguid: ConstPtr = pguidCtorArg
        internal set

    public constructor() : this(
        pguidCtorArg = ConstPtr(0L),
        dwStart = 0u,
        dwLast = 0u,
    )

    public operator fun component1(): ConstPtr = this.pguid

    public operator fun component2(): UInt = this.dwStart

    public operator fun component3(): UInt = this.dwLast

    public fun copy(pguid: ConstPtr = this.pguid, dwStart: UInt = this.dwStart, dwLast: UInt = this.dwLast): TagImmpidGuidlistItem = TagImmpidGuidlistItem(pguidCtorArg = pguid, dwStart = dwStart, dwLast = dwLast)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TagImmpidGuidlistItem) return false
        if (this.pguid != other.pguid) return false
        if (this.dwStart != other.dwStart) return false
        if (this.dwLast != other.dwLast) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pguid.hashCode()
        result = 31 * result + this.dwStart.hashCode()
        result = 31 * result + this.dwLast.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TagImmpidGuidlistItem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TagImmpidGuidlistItem> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TagImmpidGuidlistItem =
                    TagImmpidGuidlistItem(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TagImmpidGuidlistItem) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr, value.pguid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwLast)
                }
            }

        public operator fun invoke(
            pguid: ConstPtr = ConstPtr(0L),
            dwStart: UInt = 0u,
            dwLast: UInt = 0u,
        ): TagImmpidGuidlistItem =
            TagImmpidGuidlistItem(
                pguidCtorArg = pguid,
                dwStart = dwStart,
                dwLast = dwLast,
            )
    }
}
