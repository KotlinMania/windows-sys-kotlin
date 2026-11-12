@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class CfgCallTargetInfo(
    public var offset: Int = 0,
    public var flags: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfgCallTargetInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfgCallTargetInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CfgCallTargetInfo =
                    CfgCallTargetInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CfgCallTargetInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class HeapSummary(
    public var cb: UInt = 0u,
    public var cbAllocated: Int = 0,
    public var cbCommitted: Int = 0,
    public var cbReserved: Int = 0,
    public var cbMaxReserve: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HeapSummary> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HeapSummary> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): HeapSummary =
                    HeapSummary(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: HeapSummary) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.cbAllocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.cbCommitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.cbReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.cbMaxReserve)
                }
            }
    }
}

public class MemoryBasicInformation internal constructor(
    baseAddressCtorArg: MutPtr<CVoid>,
    allocationBaseCtorArg: MutPtr<CVoid>,
    public var allocationProtect: PageProtectionFlags,
    public var partitionId: UShort,
    public var regionSize: Int,
    public var state: VirtualAllocationType,
    public var protect: PageProtectionFlags,
    public var type: PageType,
) {
    public var baseAddress: MutPtr<CVoid> = baseAddressCtorArg
        internal set

    public var allocationBase: MutPtr<CVoid> = allocationBaseCtorArg
        internal set

    public constructor() : this(
        baseAddressCtorArg = MutPtr(0L),
        allocationBaseCtorArg = MutPtr(0L),
        allocationProtect = 0u,
        partitionId = 0u,
        regionSize = 0,
        state = 0u,
        protect = 0u,
        type = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.baseAddress

    public operator fun component2(): MutPtr<CVoid> = this.allocationBase

    public operator fun component3(): PageProtectionFlags = this.allocationProtect

    public operator fun component4(): UShort = this.partitionId

    public operator fun component5(): Int = this.regionSize

    public operator fun component6(): VirtualAllocationType = this.state

    public operator fun component7(): PageProtectionFlags = this.protect

    public operator fun component8(): PageType = this.type

    public fun copy(baseAddress: MutPtr<CVoid> = this.baseAddress, allocationBase: MutPtr<CVoid> = this.allocationBase, allocationProtect: PageProtectionFlags = this.allocationProtect, partitionId: UShort = this.partitionId, regionSize: Int = this.regionSize, state: VirtualAllocationType = this.state, protect: PageProtectionFlags = this.protect, type: PageType = this.type): MemoryBasicInformation = MemoryBasicInformation(baseAddressCtorArg = baseAddress, allocationBaseCtorArg = allocationBase, allocationProtect = allocationProtect, partitionId = partitionId, regionSize = regionSize, state = state, protect = protect, type = type)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MemoryBasicInformation) return false
        if (this.baseAddress != other.baseAddress) return false
        if (this.allocationBase != other.allocationBase) return false
        if (this.allocationProtect != other.allocationProtect) return false
        if (this.partitionId != other.partitionId) return false
        if (this.regionSize != other.regionSize) return false
        if (this.state != other.state) return false
        if (this.protect != other.protect) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.baseAddress.hashCode()
        result = 31 * result + this.allocationBase.hashCode()
        result = 31 * result + this.allocationProtect.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.regionSize.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.protect.hashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryBasicInformation> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MemoryBasicInformation =
                    MemoryBasicInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: MemoryBasicInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.baseAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.allocationBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allocationProtect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.partitionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.regionSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.protect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.type)
                }
            }

        public operator fun invoke(
            baseAddress: MutPtr<CVoid> = MutPtr(0L),
            allocationBase: MutPtr<CVoid> = MutPtr(0L),
            allocationProtect: PageProtectionFlags = 0u,
            partitionId: UShort = 0u,
            regionSize: Int = 0,
            state: VirtualAllocationType = 0u,
            protect: PageProtectionFlags = 0u,
            type: PageType = 0u,
        ): MemoryBasicInformation =
            MemoryBasicInformation(
                baseAddressCtorArg = baseAddress,
                allocationBaseCtorArg = allocationBase,
                allocationProtect = allocationProtect,
                partitionId = partitionId,
                regionSize = regionSize,
                state = state,
                protect = protect,
                type = type,
            )
    }
}

public data class MemoryBasicInformation32(
    public var baseAddress: UInt = 0u,
    public var allocationBase: UInt = 0u,
    public var allocationProtect: PageProtectionFlags = 0u,
    public var regionSize: UInt = 0u,
    public var state: VirtualAllocationType = 0u,
    public var protect: PageProtectionFlags = 0u,
    public var type: PageType = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryBasicInformation32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryBasicInformation32> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MemoryBasicInformation32 =
                    MemoryBasicInformation32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MemoryBasicInformation32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.allocationBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.allocationProtect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.regionSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.protect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.type)
                }
            }
    }
}

public data class MemoryBasicInformation64(
    public var baseAddress: ULong = 0uL,
    public var allocationBase: ULong = 0uL,
    public var allocationProtect: PageProtectionFlags = 0u,
    public var alignment1: UInt = 0u,
    public var regionSize: ULong = 0uL,
    public var state: VirtualAllocationType = 0u,
    public var protect: PageProtectionFlags = 0u,
    public var type: PageType = 0u,
    public var alignment2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryBasicInformation64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryBasicInformation64> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MemoryBasicInformation64 =
                    MemoryBasicInformation64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: MemoryBasicInformation64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.allocationBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allocationProtect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.alignment1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.regionSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.protect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.alignment2)
                }
            }
    }
}

public class MemoryMappedViewAddress internal constructor(
    valueCtorArg: MutPtr<CVoid>,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.value

    public fun copy(value: MutPtr<CVoid> = this.value): MemoryMappedViewAddress = MemoryMappedViewAddress(valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MemoryMappedViewAddress) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int = this.value.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryMappedViewAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryMappedViewAddress> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MemoryMappedViewAddress =
                    MemoryMappedViewAddress(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MemoryMappedViewAddress) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.value)
                }
            }

        public operator fun invoke(
            value: MutPtr<CVoid> = MutPtr(0L),
        ): MemoryMappedViewAddress =
            MemoryMappedViewAddress(
                valueCtorArg = value,
            )
    }
}

public data class MemoryPartitionDedicatedMemoryAttribute(
    public var type: MemDedicatedAttributeType = 0,
    public var reserved: UInt = 0u,
    public var value: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryPartitionDedicatedMemoryAttribute> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryPartitionDedicatedMemoryAttribute> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MemoryPartitionDedicatedMemoryAttribute =
                    MemoryPartitionDedicatedMemoryAttribute(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MemoryPartitionDedicatedMemoryAttribute) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public data class MemoryPartitionDedicatedMemoryInformation(
    public var nextEntryOffset: UInt = 0u,
    public var sizeOfInformation: UInt = 0u,
    public var flags: UInt = 0u,
    public var attributesOffset: UInt = 0u,
    public var attributeCount: UInt = 0u,
    public var reserved: UInt = 0u,
    public var typeId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryPartitionDedicatedMemoryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryPartitionDedicatedMemoryInformation> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MemoryPartitionDedicatedMemoryInformation =
                    MemoryPartitionDedicatedMemoryInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MemoryPartitionDedicatedMemoryInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.attributesOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.attributeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.typeId)
                }
            }
    }
}

public class MemAddressRequirements internal constructor(
    lowestStartingAddressCtorArg: MutPtr<CVoid>,
    highestEndingAddressCtorArg: MutPtr<CVoid>,
    public var alignment: Int,
) {
    public var lowestStartingAddress: MutPtr<CVoid> = lowestStartingAddressCtorArg
        internal set

    public var highestEndingAddress: MutPtr<CVoid> = highestEndingAddressCtorArg
        internal set

    public constructor() : this(
        lowestStartingAddressCtorArg = MutPtr(0L),
        highestEndingAddressCtorArg = MutPtr(0L),
        alignment = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.lowestStartingAddress

    public operator fun component2(): MutPtr<CVoid> = this.highestEndingAddress

    public operator fun component3(): Int = this.alignment

    public fun copy(lowestStartingAddress: MutPtr<CVoid> = this.lowestStartingAddress, highestEndingAddress: MutPtr<CVoid> = this.highestEndingAddress, alignment: Int = this.alignment): MemAddressRequirements = MemAddressRequirements(lowestStartingAddressCtorArg = lowestStartingAddress, highestEndingAddressCtorArg = highestEndingAddress, alignment = alignment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MemAddressRequirements) return false
        if (this.lowestStartingAddress != other.lowestStartingAddress) return false
        if (this.highestEndingAddress != other.highestEndingAddress) return false
        if (this.alignment != other.alignment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lowestStartingAddress.hashCode()
        result = 31 * result + this.highestEndingAddress.hashCode()
        result = 31 * result + this.alignment.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemAddressRequirements> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemAddressRequirements> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MemAddressRequirements =
                    MemAddressRequirements(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MemAddressRequirements) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.lowestStartingAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.highestEndingAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.alignment)
                }
            }

        public operator fun invoke(
            lowestStartingAddress: MutPtr<CVoid> = MutPtr(0L),
            highestEndingAddress: MutPtr<CVoid> = MutPtr(0L),
            alignment: Int = 0,
        ): MemAddressRequirements =
            MemAddressRequirements(
                lowestStartingAddressCtorArg = lowestStartingAddress,
                highestEndingAddressCtorArg = highestEndingAddress,
                alignment = alignment,
            )
    }
}

public data class MemExtendedParameter(
    public var anonymous1: MemExtendedParameter0 = MemExtendedParameter0(),
    public var anonymous2: MemExtendedParameter1 = MemExtendedParameter1(),
)

public data class MemExtendedParameter0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemExtendedParameter0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemExtendedParameter0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MemExtendedParameter0 =
                    MemExtendedParameter0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MemExtendedParameter0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class MemExtendedParameter1 internal constructor(
    public var uLong64: ULong,
    pointerCtorArg: MutPtr<CVoid>,
    public var size: Int,
    handleCtorArg: Handle,
    public var uLong: UInt,
) {
    public var pointer: MutPtr<CVoid> = pointerCtorArg
        internal set

    public var handle: Handle = handleCtorArg
        internal set

    public constructor() : this(
        uLong64 = 0uL,
        pointerCtorArg = MutPtr(0L),
        size = 0,
        handleCtorArg = MutPtr(0L),
        uLong = 0u,
    )

    public operator fun component1(): ULong = this.uLong64

    public operator fun component2(): MutPtr<CVoid> = this.pointer

    public operator fun component3(): Int = this.size

    public operator fun component4(): Handle = this.handle

    public operator fun component5(): UInt = this.uLong

    public fun copy(uLong64: ULong = this.uLong64, pointer: MutPtr<CVoid> = this.pointer, size: Int = this.size, handle: Handle = this.handle, uLong: UInt = this.uLong): MemExtendedParameter1 = MemExtendedParameter1(uLong64 = uLong64, pointerCtorArg = pointer, size = size, handleCtorArg = handle, uLong = uLong)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MemExtendedParameter1) return false
        if (this.uLong64 != other.uLong64) return false
        if (this.pointer != other.pointer) return false
        if (this.size != other.size) return false
        if (this.handle != other.handle) return false
        if (this.uLong != other.uLong) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uLong64.hashCode()
        result = 31 * result + this.pointer.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.handle.hashCode()
        result = 31 * result + this.uLong.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uLong64: ULong = 0uL,
            pointer: MutPtr<CVoid> = MutPtr(0L),
            size: Int = 0,
            handle: Handle = MutPtr(0L),
            uLong: UInt = 0u,
        ): MemExtendedParameter1 =
            MemExtendedParameter1(
                uLong64 = uLong64,
                pointerCtorArg = pointer,
                size = size,
                handleCtorArg = handle,
                uLong = uLong,
            )
    }
}

public class ProcessHeapEntry internal constructor(
    lpDataCtorArg: MutPtr<CVoid>,
    public var cbData: UInt,
    public var cbOverhead: UByte,
    public var iRegionIndex: UByte,
    public var wFlags: UShort,
    public var anonymous: ProcessHeapEntry0,
) {
    public var lpData: MutPtr<CVoid> = lpDataCtorArg
        internal set

    public constructor() : this(
        lpDataCtorArg = MutPtr(0L),
        cbData = 0u,
        cbOverhead = 0u,
        iRegionIndex = 0u,
        wFlags = 0u,
        anonymous = ProcessHeapEntry0(),
    )

    public operator fun component1(): MutPtr<CVoid> = this.lpData

    public operator fun component2(): UInt = this.cbData

    public operator fun component3(): UByte = this.cbOverhead

    public operator fun component4(): UByte = this.iRegionIndex

    public operator fun component5(): UShort = this.wFlags

    public operator fun component6(): ProcessHeapEntry0 = this.anonymous

    public fun copy(lpData: MutPtr<CVoid> = this.lpData, cbData: UInt = this.cbData, cbOverhead: UByte = this.cbOverhead, iRegionIndex: UByte = this.iRegionIndex, wFlags: UShort = this.wFlags, anonymous: ProcessHeapEntry0 = this.anonymous): ProcessHeapEntry = ProcessHeapEntry(lpDataCtorArg = lpData, cbData = cbData, cbOverhead = cbOverhead, iRegionIndex = iRegionIndex, wFlags = wFlags, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessHeapEntry) return false
        if (this.lpData != other.lpData) return false
        if (this.cbData != other.cbData) return false
        if (this.cbOverhead != other.cbOverhead) return false
        if (this.iRegionIndex != other.iRegionIndex) return false
        if (this.wFlags != other.wFlags) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.cbOverhead.hashCode()
        result = 31 * result + this.iRegionIndex.hashCode()
        result = 31 * result + this.wFlags.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpData: MutPtr<CVoid> = MutPtr(0L),
            cbData: UInt = 0u,
            cbOverhead: UByte = 0u,
            iRegionIndex: UByte = 0u,
            wFlags: UShort = 0u,
            anonymous: ProcessHeapEntry0 = ProcessHeapEntry0(),
        ): ProcessHeapEntry =
            ProcessHeapEntry(
                lpDataCtorArg = lpData,
                cbData = cbData,
                cbOverhead = cbOverhead,
                iRegionIndex = iRegionIndex,
                wFlags = wFlags,
                anonymous = anonymous,
            )
    }
}

public data class ProcessHeapEntry0(
    public var block: ProcessHeapEntry00 = ProcessHeapEntry00(),
    public var region: ProcessHeapEntry01 = ProcessHeapEntry01(),
)

public class ProcessHeapEntry00 internal constructor(
    hMemCtorArg: Handle,
    public var dwReserved: UIntArray,
) {
    public var hMem: Handle = hMemCtorArg
        internal set

    public constructor() : this(
        hMemCtorArg = MutPtr(0L),
        dwReserved = UIntArray(3),
    )

    public operator fun component1(): Handle = this.hMem

    public operator fun component2(): UIntArray = this.dwReserved

    public fun copy(hMem: Handle = this.hMem, dwReserved: UIntArray = this.dwReserved): ProcessHeapEntry00 = ProcessHeapEntry00(hMemCtorArg = hMem, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessHeapEntry00) return false
        if (this.hMem != other.hMem) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hMem.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hMem: Handle = MutPtr(0L),
            dwReserved: UIntArray = UIntArray(3),
        ): ProcessHeapEntry00 =
            ProcessHeapEntry00(
                hMemCtorArg = hMem,
                dwReserved = dwReserved,
            )
    }
}

public class ProcessHeapEntry01 internal constructor(
    public var dwCommittedSize: UInt,
    public var dwUnCommittedSize: UInt,
    lpFirstBlockCtorArg: MutPtr<CVoid>,
    lpLastBlockCtorArg: MutPtr<CVoid>,
) {
    public var lpFirstBlock: MutPtr<CVoid> = lpFirstBlockCtorArg
        internal set

    public var lpLastBlock: MutPtr<CVoid> = lpLastBlockCtorArg
        internal set

    public constructor() : this(
        dwCommittedSize = 0u,
        dwUnCommittedSize = 0u,
        lpFirstBlockCtorArg = MutPtr(0L),
        lpLastBlockCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwCommittedSize

    public operator fun component2(): UInt = this.dwUnCommittedSize

    public operator fun component3(): MutPtr<CVoid> = this.lpFirstBlock

    public operator fun component4(): MutPtr<CVoid> = this.lpLastBlock

    public fun copy(dwCommittedSize: UInt = this.dwCommittedSize, dwUnCommittedSize: UInt = this.dwUnCommittedSize, lpFirstBlock: MutPtr<CVoid> = this.lpFirstBlock, lpLastBlock: MutPtr<CVoid> = this.lpLastBlock): ProcessHeapEntry01 = ProcessHeapEntry01(dwCommittedSize = dwCommittedSize, dwUnCommittedSize = dwUnCommittedSize, lpFirstBlockCtorArg = lpFirstBlock, lpLastBlockCtorArg = lpLastBlock)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessHeapEntry01) return false
        if (this.dwCommittedSize != other.dwCommittedSize) return false
        if (this.dwUnCommittedSize != other.dwUnCommittedSize) return false
        if (this.lpFirstBlock != other.lpFirstBlock) return false
        if (this.lpLastBlock != other.lpLastBlock) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCommittedSize.hashCode()
        result = 31 * result + this.dwUnCommittedSize.hashCode()
        result = 31 * result + this.lpFirstBlock.hashCode()
        result = 31 * result + this.lpLastBlock.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessHeapEntry01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessHeapEntry01> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ProcessHeapEntry01 =
                    ProcessHeapEntry01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ProcessHeapEntry01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCommittedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwUnCommittedSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.lpFirstBlock)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.lpLastBlock)
                }
            }

        public operator fun invoke(
            dwCommittedSize: UInt = 0u,
            dwUnCommittedSize: UInt = 0u,
            lpFirstBlock: MutPtr<CVoid> = MutPtr(0L),
            lpLastBlock: MutPtr<CVoid> = MutPtr(0L),
        ): ProcessHeapEntry01 =
            ProcessHeapEntry01(
                dwCommittedSize = dwCommittedSize,
                dwUnCommittedSize = dwUnCommittedSize,
                lpFirstBlockCtorArg = lpFirstBlock,
                lpLastBlockCtorArg = lpLastBlock,
            )
    }
}

public class Win32MemoryPartitionInformation(
    public var flags: UInt = 0u,
    public var numaNode: UInt = 0u,
    public var channel: UInt = 0u,
    public var numberOfNumaNodes: UInt = 0u,
    public var residentAvailablePages: ULong = 0uL,
    public var committedPages: ULong = 0uL,
    public var commitLimit: ULong = 0uL,
    public var peakCommitment: ULong = 0uL,
    public var totalNumberOfPages: ULong = 0uL,
    public var availablePages: ULong = 0uL,
    public var zeroPages: ULong = 0uL,
    public var freePages: ULong = 0uL,
    public var standbyPages: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(16),
    public var maximumCommitLimit: ULong = 0uL,
    public var reserved2: ULong = 0uL,
    public var partitionId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Win32MemoryPartitionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Win32MemoryPartitionInformation> {
                override val sizeBytes: Long = 240L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Win32MemoryPartitionInformation =
                    Win32MemoryPartitionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                        ).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 232L),
                    )
                override fun writeNative(addr: Long, value: Win32MemoryPartitionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numaNode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.channel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfNumaNodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.residentAvailablePages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.committedPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.commitLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.peakCommitment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.totalNumberOfPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.availablePages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.zeroPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.freePages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.standbyPages)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                    ).writeNative(addr + 88L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.maximumCommitLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 224L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 232L, value.partitionId)
                }
            }
    }
}

public class Win32MemoryRangeEntry internal constructor(
    virtualAddressCtorArg: MutPtr<CVoid>,
    public var numberOfBytes: Int,
) {
    public var virtualAddress: MutPtr<CVoid> = virtualAddressCtorArg
        internal set

    public constructor() : this(
        virtualAddressCtorArg = MutPtr(0L),
        numberOfBytes = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.virtualAddress

    public operator fun component2(): Int = this.numberOfBytes

    public fun copy(virtualAddress: MutPtr<CVoid> = this.virtualAddress, numberOfBytes: Int = this.numberOfBytes): Win32MemoryRangeEntry = Win32MemoryRangeEntry(virtualAddressCtorArg = virtualAddress, numberOfBytes = numberOfBytes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Win32MemoryRangeEntry) return false
        if (this.virtualAddress != other.virtualAddress) return false
        if (this.numberOfBytes != other.numberOfBytes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualAddress.hashCode()
        result = 31 * result + this.numberOfBytes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Win32MemoryRangeEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Win32MemoryRangeEntry> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Win32MemoryRangeEntry =
                    Win32MemoryRangeEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Win32MemoryRangeEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.virtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.numberOfBytes)
                }
            }

        public operator fun invoke(
            virtualAddress: MutPtr<CVoid> = MutPtr(0L),
            numberOfBytes: Int = 0,
        ): Win32MemoryRangeEntry =
            Win32MemoryRangeEntry(
                virtualAddressCtorArg = virtualAddress,
                numberOfBytes = numberOfBytes,
            )
    }
}

public class Win32MemoryRegionInformation internal constructor(
    allocationBaseCtorArg: MutPtr<CVoid>,
    public var allocationProtect: UInt,
    public var anonymous: Win32MemoryRegionInformation0,
    public var regionSize: Int,
    public var commitSize: Int,
) {
    public var allocationBase: MutPtr<CVoid> = allocationBaseCtorArg
        internal set

    public constructor() : this(
        allocationBaseCtorArg = MutPtr(0L),
        allocationProtect = 0u,
        anonymous = Win32MemoryRegionInformation0(),
        regionSize = 0,
        commitSize = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.allocationBase

    public operator fun component2(): UInt = this.allocationProtect

    public operator fun component3(): Win32MemoryRegionInformation0 = this.anonymous

    public operator fun component4(): Int = this.regionSize

    public operator fun component5(): Int = this.commitSize

    public fun copy(allocationBase: MutPtr<CVoid> = this.allocationBase, allocationProtect: UInt = this.allocationProtect, anonymous: Win32MemoryRegionInformation0 = this.anonymous, regionSize: Int = this.regionSize, commitSize: Int = this.commitSize): Win32MemoryRegionInformation = Win32MemoryRegionInformation(allocationBaseCtorArg = allocationBase, allocationProtect = allocationProtect, anonymous = anonymous, regionSize = regionSize, commitSize = commitSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Win32MemoryRegionInformation) return false
        if (this.allocationBase != other.allocationBase) return false
        if (this.allocationProtect != other.allocationProtect) return false
        if (this.anonymous != other.anonymous) return false
        if (this.regionSize != other.regionSize) return false
        if (this.commitSize != other.commitSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.allocationBase.hashCode()
        result = 31 * result + this.allocationProtect.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.regionSize.hashCode()
        result = 31 * result + this.commitSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            allocationBase: MutPtr<CVoid> = MutPtr(0L),
            allocationProtect: UInt = 0u,
            anonymous: Win32MemoryRegionInformation0 = Win32MemoryRegionInformation0(),
            regionSize: Int = 0,
            commitSize: Int = 0,
        ): Win32MemoryRegionInformation =
            Win32MemoryRegionInformation(
                allocationBaseCtorArg = allocationBase,
                allocationProtect = allocationProtect,
                anonymous = anonymous,
                regionSize = regionSize,
                commitSize = commitSize,
            )
    }
}

public data class Win32MemoryRegionInformation0(
    public var flags: UInt = 0u,
    public var anonymous: Win32MemoryRegionInformation00 = Win32MemoryRegionInformation00(),
)

public data class Win32MemoryRegionInformation00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Win32MemoryRegionInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Win32MemoryRegionInformation00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Win32MemoryRegionInformation00 =
                    Win32MemoryRegionInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Win32MemoryRegionInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}
