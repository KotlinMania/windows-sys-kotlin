@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileId128
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.StorageBusType
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.VirtualStorageType

public data class PersistentReserveCommand01(
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var parameterList: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersistentReserveCommand01) return false
        if (this.bitfield1 != other.bitfield1) return false
        if (this.bitfield2 != other.bitfield2) return false
        if (!this.parameterList.contentEquals(other.parameterList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield1.hashCode()
        result = 31 * result + this.bitfield2.hashCode()
        result = 31 * result + this.parameterList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PersistentReserveCommand01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PersistentReserveCommand01> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): PersistentReserveCommand01 =
                    PersistentReserveCommand01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PersistentReserveCommand01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bitfield2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.parameterList.toList())
                }
            }
    }
}

public data class PhysicalElementStatus(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var descriptorCount: UInt = 0u,
    public var returnedDescriptorCount: UInt = 0u,
    public var elementIdentifierBeingDepoped: UInt = 0u,
    public var reserved: UInt = 0u,
    public var descriptors: List<PhysicalElementStatusDescriptor> = List(1) { PhysicalElementStatusDescriptor() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalElementStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalElementStatus> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): PhysicalElementStatus =
                    PhysicalElementStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PhysicalElementStatusDescriptor.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PhysicalElementStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.descriptorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.returnedDescriptorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.elementIdentifierBeingDepoped)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PhysicalElementStatusDescriptor.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.descriptors)
                }
            }
    }
}

public data class PhysicalElementStatusDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var elementIdentifier: UInt = 0u,
    public var physicalElementType: UByte = 0u,
    public var physicalElementHealth: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(2),
    public var associatedCapacity: ULong = 0uL,
    public var reserved2: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PhysicalElementStatusDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.elementIdentifier != other.elementIdentifier) return false
        if (this.physicalElementType != other.physicalElementType) return false
        if (this.physicalElementHealth != other.physicalElementHealth) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.associatedCapacity != other.associatedCapacity) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.elementIdentifier.hashCode()
        result = 31 * result + this.physicalElementType.hashCode()
        result = 31 * result + this.physicalElementHealth.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.associatedCapacity.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalElementStatusDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalElementStatusDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): PhysicalElementStatusDescriptor =
                    PhysicalElementStatusDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 14L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 24L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PhysicalElementStatusDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.elementIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.physicalElementType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.physicalElementHealth)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 14L, value.reserved1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.associatedCapacity)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 24L, value.reserved2.toList())
                }
            }
    }
}

public data class PhysicalElementStatusRequest(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var startingElement: UInt = 0u,
    public var filter: UByte = 0u,
    public var reportType: UByte = 0u,
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PhysicalElementStatusRequest) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.startingElement != other.startingElement) return false
        if (this.filter != other.filter) return false
        if (this.reportType != other.reportType) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.startingElement.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.reportType.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalElementStatusRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalElementStatusRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PhysicalElementStatusRequest =
                    PhysicalElementStatusRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 14L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PhysicalElementStatusRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.startingElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.filter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.reportType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 14L, value.reserved.toList())
                }
            }
    }
}

public data class PlexReadDataRequest(
    public var byteOffset: Long = 0L,
    public var byteLength: UInt = 0u,
    public var plexNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PlexReadDataRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PlexReadDataRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PlexReadDataRequest =
                    PlexReadDataRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PlexReadDataRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.byteOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.byteLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.plexNumber)
                }
            }
    }
}

public data class PreventMediaRemoval(
    public var preventMediaRemoval: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PreventMediaRemoval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PreventMediaRemoval> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PreventMediaRemoval =
                    PreventMediaRemoval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PreventMediaRemoval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.preventMediaRemoval)
                }
            }
    }
}

public data class QueryBadRangesInput(
    public var flags: UInt = 0u,
    public var numRanges: UInt = 0u,
    public var ranges: List<QueryBadRangesInputRange> = List(1) { QueryBadRangesInputRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryBadRangesInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryBadRangesInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): QueryBadRangesInput =
                    QueryBadRangesInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(QueryBadRangesInputRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QueryBadRangesInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numRanges)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(QueryBadRangesInputRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.ranges)
                }
            }
    }
}

public data class QueryBadRangesInputRange(
    public var startOffset: ULong = 0uL,
    public var lengthInBytes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryBadRangesInputRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryBadRangesInputRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): QueryBadRangesInputRange =
                    QueryBadRangesInputRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QueryBadRangesInputRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lengthInBytes)
                }
            }
    }
}

public data class QueryBadRangesOutput(
    public var flags: UInt = 0u,
    public var numBadRanges: UInt = 0u,
    public var nextOffsetToLookUp: ULong = 0uL,
    public var badRanges: List<QueryBadRangesOutputRange> = List(1) { QueryBadRangesOutputRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryBadRangesOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryBadRangesOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): QueryBadRangesOutput =
                    QueryBadRangesOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(QueryBadRangesOutputRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: QueryBadRangesOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numBadRanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.nextOffsetToLookUp)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(QueryBadRangesOutputRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.badRanges)
                }
            }
    }
}

public data class QueryBadRangesOutputRange(
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var startOffset: ULong = 0uL,
    public var lengthInBytes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryBadRangesOutputRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryBadRangesOutputRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): QueryBadRangesOutputRange =
                    QueryBadRangesOutputRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: QueryBadRangesOutputRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.startOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.lengthInBytes)
                }
            }
    }
}

public data class QueryFileLayoutInput(
    public var anonymous: QueryFileLayoutInput0 = QueryFileLayoutInput0(),
    public var flags: UInt = 0u,
    public var filterType: QueryFileLayoutFilterType = 0,
    public var reserved: UInt = 0u,
    public var filter: QueryFileLayoutInput1 = QueryFileLayoutInput1(),
)

public data class QueryFileLayoutInput0(
    public var filterEntryCount: UInt = 0u,
    public var numberOfPairs: UInt = 0u,
)

public data class QueryFileLayoutInput1(
    public var clusterRanges: List<ClusterRange> = List(1) { ClusterRange() },
    public var fileReferenceRanges: List<FileReferenceRange> = List(1) { FileReferenceRange() },
    public var storageReserveIds: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QueryFileLayoutInput1) return false
        if (this.clusterRanges != other.clusterRanges) return false
        if (this.fileReferenceRanges != other.fileReferenceRanges) return false
        if (!this.storageReserveIds.contentEquals(other.storageReserveIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clusterRanges.hashCode()
        result = 31 * result + this.fileReferenceRanges.hashCode()
        result = 31 * result + this.storageReserveIds.contentHashCode()
        return result
    }
}

public data class QueryFileLayoutOutput(
    public var fileEntryCount: UInt = 0u,
    public var firstFileOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryFileLayoutOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryFileLayoutOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): QueryFileLayoutOutput =
                    QueryFileLayoutOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: QueryFileLayoutOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileEntryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.firstFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class ReadElementAddressInfo(
    public var numberOfElements: UInt = 0u,
    public var elementStatus: List<ChangerElementStatus> = List(1) { ChangerElementStatus() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadElementAddressInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadElementAddressInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): ReadElementAddressInfo =
                    ReadElementAddressInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ChangerElementStatus.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ReadElementAddressInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ChangerElementStatus.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.elementStatus)
                }
            }
    }
}

public data class ReadFileUsnData(
    public var minMajorVersion: UShort = 0u,
    public var maxMajorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadFileUsnData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadFileUsnData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ReadFileUsnData =
                    ReadFileUsnData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ReadFileUsnData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.minMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maxMajorVersion)
                }
            }
    }
}

public data class ReadUsnJournalDataV0(
    public var startUsn: Long = 0L,
    public var reasonMask: UInt = 0u,
    public var returnOnlyOnClose: UInt = 0u,
    public var timeout: ULong = 0uL,
    public var bytesToWaitFor: ULong = 0uL,
    public var usnJournalID: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadUsnJournalDataV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadUsnJournalDataV0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ReadUsnJournalDataV0 =
                    ReadUsnJournalDataV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: ReadUsnJournalDataV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reasonMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.returnOnlyOnClose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.bytesToWaitFor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.usnJournalID)
                }
            }
    }
}

public data class ReadUsnJournalDataV1(
    public var startUsn: Long = 0L,
    public var reasonMask: UInt = 0u,
    public var returnOnlyOnClose: UInt = 0u,
    public var timeout: ULong = 0uL,
    public var bytesToWaitFor: ULong = 0uL,
    public var usnJournalID: ULong = 0uL,
    public var minMajorVersion: UShort = 0u,
    public var maxMajorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadUsnJournalDataV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadUsnJournalDataV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): ReadUsnJournalDataV1 =
                    ReadUsnJournalDataV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                    )
                override fun writeNative(addr: Long, value: ReadUsnJournalDataV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reasonMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.returnOnlyOnClose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.bytesToWaitFor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.usnJournalID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.minMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.maxMajorVersion)
                }
            }
    }
}

public data class ReassignBlocks(
    public var reserved: UShort = 0u,
    public var count: UShort = 0u,
    public var blockNumber: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReassignBlocks) return false
        if (this.reserved != other.reserved) return false
        if (this.count != other.count) return false
        if (!this.blockNumber.contentEquals(other.blockNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.blockNumber.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReassignBlocks> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReassignBlocks> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ReassignBlocks =
                    ReassignBlocks(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: ReassignBlocks) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.blockNumber.toList())
                }
            }
    }
}

public data class ReassignBlocksEx(
    public var reserved: UShort = 0u,
    public var count: UShort = 0u,
    public var blockNumber: LongArray = LongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReassignBlocksEx) return false
        if (this.reserved != other.reserved) return false
        if (this.count != other.count) return false
        if (!this.blockNumber.contentEquals(other.blockNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.blockNumber.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReassignBlocksEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReassignBlocksEx> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ReassignBlocksEx =
                    ReassignBlocksEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (1).toInt())
                        ).readNative(addr + 4L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: ReassignBlocksEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (1).toInt())
                    ).writeNative(addr + 4L, value.blockNumber.toList())
                }
            }
    }
}

public data class RefsSmrVolumeGcParameters(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var action: RefsSmrVolumeGcAction = 0,
    public var method: RefsSmrVolumeGcMethod = 0,
    public var ioGranularity: UInt = 0u,
    public var compressionFormat: UInt = 0u,
    public var unused: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsSmrVolumeGcParameters) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.action != other.action) return false
        if (this.method != other.method) return false
        if (this.ioGranularity != other.ioGranularity) return false
        if (this.compressionFormat != other.compressionFormat) return false
        if (!this.unused.contentEquals(other.unused)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.method.hashCode()
        result = 31 * result + this.ioGranularity.hashCode()
        result = 31 * result + this.compressionFormat.hashCode()
        result = 31 * result + this.unused.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsSmrVolumeGcParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsSmrVolumeGcParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): RefsSmrVolumeGcParameters =
                    RefsSmrVolumeGcParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 24L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: RefsSmrVolumeGcParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.method)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ioGranularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.compressionFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 24L, value.unused.toList())
                }
            }
    }
}

public data class RefsSmrVolumeInfoOutput(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var sizeOfRandomlyWritableTier: Long = 0L,
    public var freeSpaceInRandomlyWritableTier: Long = 0L,
    public var sizeofSMRTier: Long = 0L,
    public var freeSpaceInSMRTier: Long = 0L,
    public var usableFreeSpaceInSMRTier: Long = 0L,
    public var volumeGcState: RefsSmrVolumeGcState = 0,
    public var volumeGcLastStatus: UInt = 0u,
    public var currentGcBandFillPercentage: UInt = 0u,
    public var unused: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsSmrVolumeInfoOutput) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.sizeOfRandomlyWritableTier != other.sizeOfRandomlyWritableTier) return false
        if (this.freeSpaceInRandomlyWritableTier != other.freeSpaceInRandomlyWritableTier) return false
        if (this.sizeofSMRTier != other.sizeofSMRTier) return false
        if (this.freeSpaceInSMRTier != other.freeSpaceInSMRTier) return false
        if (this.usableFreeSpaceInSMRTier != other.usableFreeSpaceInSMRTier) return false
        if (this.volumeGcState != other.volumeGcState) return false
        if (this.volumeGcLastStatus != other.volumeGcLastStatus) return false
        if (this.currentGcBandFillPercentage != other.currentGcBandFillPercentage) return false
        if (!this.unused.contentEquals(other.unused)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sizeOfRandomlyWritableTier.hashCode()
        result = 31 * result + this.freeSpaceInRandomlyWritableTier.hashCode()
        result = 31 * result + this.sizeofSMRTier.hashCode()
        result = 31 * result + this.freeSpaceInSMRTier.hashCode()
        result = 31 * result + this.usableFreeSpaceInSMRTier.hashCode()
        result = 31 * result + this.volumeGcState.hashCode()
        result = 31 * result + this.volumeGcLastStatus.hashCode()
        result = 31 * result + this.currentGcBandFillPercentage.hashCode()
        result = 31 * result + this.unused.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsSmrVolumeInfoOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsSmrVolumeInfoOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): RefsSmrVolumeInfoOutput =
                    RefsSmrVolumeInfoOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                        ).readNative(addr + 64L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: RefsSmrVolumeInfoOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.sizeOfRandomlyWritableTier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.freeSpaceInRandomlyWritableTier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.sizeofSMRTier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.freeSpaceInSMRTier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.usableFreeSpaceInSMRTier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.volumeGcState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.volumeGcLastStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.currentGcBandFillPercentage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                    ).writeNative(addr + 64L, value.unused.toList())
                }
            }
    }
}

public class RefsVolumeDataBuffer(
    public var byteCount: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var bytesPerPhysicalSector: UInt = 0u,
    public var volumeSerialNumber: Long = 0L,
    public var numberSectors: Long = 0L,
    public var totalClusters: Long = 0L,
    public var freeClusters: Long = 0L,
    public var totalReserved: Long = 0L,
    public var bytesPerSector: UInt = 0u,
    public var bytesPerCluster: UInt = 0u,
    public var maximumSizeOfResidentFile: Long = 0L,
    public var fastTierDataFillRatio: UShort = 0u,
    public var slowTierDataFillRatio: UShort = 0u,
    public var destagesFastTierToSlowTierRate: UInt = 0u,
    public var metadataChecksumType: UShort = 0u,
    public var reserved0: UByteArray = UByteArray(6),
    public var reserved: LongArray = LongArray(8),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsVolumeDataBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsVolumeDataBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): RefsVolumeDataBuffer =
                    RefsVolumeDataBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 74L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 82L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (8).toInt())
                        ).readNative(addr + 88L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: RefsVolumeDataBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.byteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bytesPerPhysicalSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.volumeSerialNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.numberSectors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.totalClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.freeClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.totalReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.bytesPerSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.bytesPerCluster)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.maximumSizeOfResidentFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 72L, value.fastTierDataFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 74L, value.slowTierDataFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.destagesFastTierToSlowTierRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 80L, value.metadataChecksumType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 82L, value.reserved0.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (8).toInt())
                    ).writeNative(addr + 88L, value.reserved.toList())
                }
            }
    }
}

public data class RemoveElementAndTruncateRequest(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var requestCapacity: ULong = 0uL,
    public var elementIdentifier: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemoveElementAndTruncateRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemoveElementAndTruncateRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RemoveElementAndTruncateRequest =
                    RemoveElementAndTruncateRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: RemoveElementAndTruncateRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.requestCapacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.elementIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                }
            }
    }
}

public data class RepairCopiesInput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileOffset: Long = 0L,
    public var length: UInt = 0u,
    public var sourceCopy: UInt = 0u,
    public var numberOfRepairCopies: UInt = 0u,
    public var repairCopies: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RepairCopiesInput) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.length != other.length) return false
        if (this.sourceCopy != other.sourceCopy) return false
        if (this.numberOfRepairCopies != other.numberOfRepairCopies) return false
        if (!this.repairCopies.contentEquals(other.repairCopies)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fileOffset.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.sourceCopy.hashCode()
        result = 31 * result + this.numberOfRepairCopies.hashCode()
        result = 31 * result + this.repairCopies.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RepairCopiesInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RepairCopiesInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): RepairCopiesInput =
                    RepairCopiesInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 28L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: RepairCopiesInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sourceCopy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numberOfRepairCopies)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 28L, value.repairCopies.toList())
                }
            }
    }
}

public data class RepairCopiesOutput(
    public var size: UInt = 0u,
    public var status: UInt = 0u,
    public var resumeFileOffset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RepairCopiesOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RepairCopiesOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RepairCopiesOutput =
                    RepairCopiesOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RepairCopiesOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.resumeFileOffset)
                }
            }
    }
}

public data class RequestOplockInputBuffer(
    public var structureVersion: UShort = 0u,
    public var structureLength: UShort = 0u,
    public var requestedOplockLevel: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestOplockInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestOplockInputBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): RequestOplockInputBuffer =
                    RequestOplockInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RequestOplockInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.structureVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.structureLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.requestedOplockLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class RequestOplockOutputBuffer(
    public var structureVersion: UShort = 0u,
    public var structureLength: UShort = 0u,
    public var originalOplockLevel: UInt = 0u,
    public var newOplockLevel: UInt = 0u,
    public var flags: UInt = 0u,
    public var accessMode: UInt = 0u,
    public var shareMode: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestOplockOutputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestOplockOutputBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RequestOplockOutputBuffer =
                    RequestOplockOutputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: RequestOplockOutputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.structureVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.structureLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.originalOplockLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.newOplockLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.accessMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.shareMode)
                }
            }
    }
}

public data class RequestRawEncryptedData(
    public var fileOffset: Long = 0L,
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestRawEncryptedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RequestRawEncryptedData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RequestRawEncryptedData =
                    RequestRawEncryptedData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RequestRawEncryptedData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class RetrievalPointersAndRefcountBuffer(
    public var extentCount: UInt = 0u,
    public var startingVcn: Long = 0L,
    public var extents: List<RetrievalPointersAndRefcountBuffer0> = List(1) { RetrievalPointersAndRefcountBuffer0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersAndRefcountBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersAndRefcountBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): RetrievalPointersAndRefcountBuffer =
                    RetrievalPointersAndRefcountBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(RetrievalPointersAndRefcountBuffer0.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RetrievalPointersAndRefcountBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.startingVcn)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(RetrievalPointersAndRefcountBuffer0.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.extents)
                }
            }
    }
}

public data class RetrievalPointersAndRefcountBuffer0(
    public var nextVcn: Long = 0L,
    public var lcn: Long = 0L,
    public var referenceCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersAndRefcountBuffer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersAndRefcountBuffer0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RetrievalPointersAndRefcountBuffer0 =
                    RetrievalPointersAndRefcountBuffer0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RetrievalPointersAndRefcountBuffer0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.nextVcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.referenceCount)
                }
            }
    }
}

public data class RetrievalPointersBuffer(
    public var extentCount: UInt = 0u,
    public var startingVcn: Long = 0L,
    public var extents: List<RetrievalPointersBuffer0> = List(1) { RetrievalPointersBuffer0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): RetrievalPointersBuffer =
                    RetrievalPointersBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(RetrievalPointersBuffer0.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RetrievalPointersBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.startingVcn)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(RetrievalPointersBuffer0.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.extents)
                }
            }
    }
}

public data class RetrievalPointersBuffer0(
    public var nextVcn: Long = 0L,
    public var lcn: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersBuffer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersBuffer0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RetrievalPointersBuffer0 =
                    RetrievalPointersBuffer0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RetrievalPointersBuffer0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.nextVcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lcn)
                }
            }
    }
}

public data class RetrievalPointerBase(
    public var fileAreaOffset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointerBase> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointerBase> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RetrievalPointerBase =
                    RetrievalPointerBase(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RetrievalPointerBase) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileAreaOffset)
                }
            }
    }
}

public data class RetrievalPointerCount(
    public var extentCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointerCount> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointerCount> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): RetrievalPointerCount =
                    RetrievalPointerCount(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RetrievalPointerCount) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extentCount)
                }
            }
    }
}

public data class ScmBusDedicatedMemoryDevicesInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceCount: UInt = 0u,
    public var devices: List<ScmBusDedicatedMemoryDeviceInfo> = List(1) { ScmBusDedicatedMemoryDeviceInfo() },
)

public data class ScmBusDedicatedMemoryDeviceInfo(
    public var deviceGuid: Guid = Guid(),
    public var deviceNumber: UInt = 0u,
    public var flags: ScmBusDedicatedMemoryDeviceInfo0 = ScmBusDedicatedMemoryDeviceInfo0(),
    public var deviceSize: ULong = 0uL,
)

public data class ScmBusDedicatedMemoryDeviceInfo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusDedicatedMemoryDeviceInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusDedicatedMemoryDeviceInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ScmBusDedicatedMemoryDeviceInfo0 =
                    ScmBusDedicatedMemoryDeviceInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScmBusDedicatedMemoryDeviceInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ScmBusDedicatedMemoryState(
    public var activateState: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusDedicatedMemoryState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusDedicatedMemoryState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): ScmBusDedicatedMemoryState =
                    ScmBusDedicatedMemoryState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScmBusDedicatedMemoryState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.activateState)
                }
            }
    }
}

public data class ScmBusPropertyQuery(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var propertyId: ScmBusPropertyId = 0,
    public var queryType: ScmBusQueryType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmBusPropertyQuery) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.propertyId != other.propertyId) return false
        if (this.queryType != other.queryType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.propertyId.hashCode()
        result = 31 * result + this.queryType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusPropertyQuery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusPropertyQuery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ScmBusPropertyQuery =
                    ScmBusPropertyQuery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScmBusPropertyQuery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.propertyId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.queryType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.additionalParameters.toList())
                }
            }
    }
}

public data class ScmBusPropertySet(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var propertyId: ScmBusPropertyId = 0,
    public var setType: ScmBusSetType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmBusPropertySet) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.propertyId != other.propertyId) return false
        if (this.setType != other.setType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.propertyId.hashCode()
        result = 31 * result + this.setType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusPropertySet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusPropertySet> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ScmBusPropertySet =
                    ScmBusPropertySet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScmBusPropertySet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.propertyId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.setType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.additionalParameters.toList())
                }
            }
    }
}

public data class ScmBusRuntimeFwActivationInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var runtimeFwActivationSupported: Boolean = false,
    public var firmwareActivationState: ScmBusFirmwareActivationState = 0,
    public var firmwareActivationCapability: ScmBusRuntimeFwActivationInfo0 = ScmBusRuntimeFwActivationInfo0(),
    public var estimatedFirmwareActivationTimeInUSecs: ULong = 0uL,
    public var estimatedProcessorAccessQuiesceTimeInUSecs: ULong = 0uL,
    public var estimatedIOAccessQuiesceTimeInUSecs: ULong = 0uL,
    public var platformSupportedMaxIOAccessQuiesceTimeInUSecs: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusRuntimeFwActivationInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusRuntimeFwActivationInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): ScmBusRuntimeFwActivationInfo =
                    ScmBusRuntimeFwActivationInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (ScmBusRuntimeFwActivationInfo0.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: ScmBusRuntimeFwActivationInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.runtimeFwActivationSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.firmwareActivationState)
                    (ScmBusRuntimeFwActivationInfo0.typeLayout()).writeNative(addr + 16L, value.firmwareActivationCapability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.estimatedFirmwareActivationTimeInUSecs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.estimatedProcessorAccessQuiesceTimeInUSecs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.estimatedIOAccessQuiesceTimeInUSecs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.platformSupportedMaxIOAccessQuiesceTimeInUSecs)
                }
            }
    }
}

public data class ScmBusRuntimeFwActivationInfo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusRuntimeFwActivationInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmBusRuntimeFwActivationInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ScmBusRuntimeFwActivationInfo0 =
                    ScmBusRuntimeFwActivationInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScmBusRuntimeFwActivationInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ScmInterleavedPdInfo(
    public var deviceHandle: UInt = 0u,
    public var deviceGuid: Guid = Guid(),
)

public data class ScmLdInterleaveSetInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var interleaveSetSize: UInt = 0u,
    public var interleaveSet: List<ScmInterleavedPdInfo> = List(1) { ScmInterleavedPdInfo() },
)

public data class ScmLogicalDevices(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceCount: UInt = 0u,
    public var devices: List<ScmLogicalDeviceInstance> = List(1) { ScmLogicalDeviceInstance() },
)

public data class ScmLogicalDeviceInstance(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceGuid: Guid = Guid(),
    public var symbolicLink: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmLogicalDeviceInstance) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.deviceGuid != other.deviceGuid) return false
        if (!this.symbolicLink.contentEquals(other.symbolicLink)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.deviceGuid.hashCode()
        result = 31 * result + this.symbolicLink.contentHashCode()
        return result
    }
}

public data class ScmPdDescriptorHeader(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdDescriptorHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdDescriptorHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScmPdDescriptorHeader =
                    ScmPdDescriptorHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScmPdDescriptorHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                }
            }
    }
}

public data class ScmPdDeviceHandle(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceGuid: Guid = Guid(),
    public var deviceHandle: UInt = 0u,
)

public class ScmPdDeviceInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceGuid: Guid = Guid(),
    public var unsafeShutdownCount: UInt = 0u,
    public var persistentMemorySizeInBytes: ULong = 0uL,
    public var volatileMemorySizeInBytes: ULong = 0uL,
    public var totalMemorySizeInBytes: ULong = 0uL,
    public var slotNumber: UInt = 0u,
    public var deviceHandle: UInt = 0u,
    public var physicalId: UShort = 0u,
    public var numberOfFormatInterfaceCodes: UByte = 0u,
    public var formatInterfaceCodes: UShortArray = UShortArray(8),
    public var vendorId: UInt = 0u,
    public var productId: UInt = 0u,
    public var subsystemDeviceId: UInt = 0u,
    public var subsystemVendorId: UInt = 0u,
    public var manufacturingLocation: UByte = 0u,
    public var manufacturingWeek: UByte = 0u,
    public var manufacturingYear: UByte = 0u,
    public var serialNumber4Byte: UInt = 0u,
    public var serialNumberLengthInChars: UInt = 0u,
    public var serialNumber: ByteArray = ByteArray(1),
)

public data class ScmPdDeviceSpecificInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numberOfProperties: UInt = 0u,
    public var deviceSpecificProperties: List<ScmPdDeviceSpecificProperty> = List(1) { ScmPdDeviceSpecificProperty() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdDeviceSpecificInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdDeviceSpecificInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 280L
                override fun readNative(addr: Long): ScmPdDeviceSpecificInfo =
                    ScmPdDeviceSpecificInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ScmPdDeviceSpecificProperty.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ScmPdDeviceSpecificInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ScmPdDeviceSpecificProperty.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.deviceSpecificProperties)
                }
            }
    }
}

public data class ScmPdDeviceSpecificProperty(
    public var name: UShortArray = UShortArray(128),
    public var value: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdDeviceSpecificProperty) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdDeviceSpecificProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdDeviceSpecificProperty> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 264L
                override fun readNative(addr: Long): ScmPdDeviceSpecificProperty =
                    ScmPdDeviceSpecificProperty(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 256L),
                    )
                override fun writeNative(addr: Long, value: ScmPdDeviceSpecificProperty) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr, value.name.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 256L, value.value)
                }
            }
    }
}

public data class ScmPdFirmwareActivate(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var slot: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdFirmwareActivate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdFirmwareActivate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScmPdFirmwareActivate =
                    ScmPdFirmwareActivate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScmPdFirmwareActivate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.slot)
                }
            }
    }
}

public data class ScmPdFirmwareDownload(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var slot: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var offset: ULong = 0uL,
    public var firmwareImageSizeInBytes: UInt = 0u,
    public var firmwareImage: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdFirmwareDownload) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.slot != other.slot) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.offset != other.offset) return false
        if (this.firmwareImageSizeInBytes != other.firmwareImageSizeInBytes) return false
        if (!this.firmwareImage.contentEquals(other.firmwareImage)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.slot.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.firmwareImageSizeInBytes.hashCode()
        result = 31 * result + this.firmwareImage.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdFirmwareDownload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdFirmwareDownload> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ScmPdFirmwareDownload =
                    ScmPdFirmwareDownload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScmPdFirmwareDownload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.slot)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.firmwareImageSizeInBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 28L, value.firmwareImage.toList())
                }
            }
    }
}

public data class ScmPdFirmwareInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var activeSlot: UByte = 0u,
    public var nextActiveSlot: UByte = 0u,
    public var slotCount: UByte = 0u,
    public var slots: List<ScmPdFirmwareSlotInfo> = List(1) { ScmPdFirmwareSlotInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdFirmwareInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdFirmwareInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): ScmPdFirmwareInfo =
                    ScmPdFirmwareInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ScmPdFirmwareSlotInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScmPdFirmwareInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.activeSlot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.nextActiveSlot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.slotCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ScmPdFirmwareSlotInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 12L, value.slots)
                }
            }
    }
}

public data class ScmPdFirmwareSlotInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var slotNumber: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(6),
    public var revision: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdFirmwareSlotInfo) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.revision.contentEquals(other.revision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.slotNumber.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.revision.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdFirmwareSlotInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdFirmwareSlotInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): ScmPdFirmwareSlotInfo =
                    ScmPdFirmwareSlotInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 10L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScmPdFirmwareSlotInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.slotNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 10L, value.reserved1.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 16L, value.revision.toList())
                }
            }
    }
}

public data class ScmPdFruIdString(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var identifierSize: UInt = 0u,
    public var identifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdFruIdString) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.identifierSize != other.identifierSize) return false
        if (!this.identifier.contentEquals(other.identifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.identifierSize.hashCode()
        result = 31 * result + this.identifier.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdFruIdString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdFruIdString> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScmPdFruIdString =
                    ScmPdFruIdString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScmPdFruIdString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.identifierSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.identifier.toList())
                }
            }
    }
}

public data class ScmPdHealthNotificationData(
    public var deviceGuid: Guid = Guid(),
)

public data class ScmPdLocationString(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var location: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdLocationString) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (!this.location.contentEquals(other.location)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.location.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdLocationString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdLocationString> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ScmPdLocationString =
                    ScmPdLocationString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ScmPdLocationString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.location.toList())
                }
            }
    }
}

public data class ScmPdManagementStatus(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var health: ScmPdHealthStatus = 0,
    public var numberOfOperationalStatus: UInt = 0u,
    public var numberOfAdditionalReasons: UInt = 0u,
    public var operationalStatus: IntArray = IntArray(16),
    public var additionalReasons: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdManagementStatus) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.health != other.health) return false
        if (this.numberOfOperationalStatus != other.numberOfOperationalStatus) return false
        if (this.numberOfAdditionalReasons != other.numberOfAdditionalReasons) return false
        if (!this.operationalStatus.contentEquals(other.operationalStatus)) return false
        if (!this.additionalReasons.contentEquals(other.additionalReasons)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.health.hashCode()
        result = 31 * result + this.numberOfOperationalStatus.hashCode()
        result = 31 * result + this.numberOfAdditionalReasons.hashCode()
        result = 31 * result + this.operationalStatus.contentHashCode()
        result = 31 * result + this.additionalReasons.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdManagementStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdManagementStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): ScmPdManagementStatus =
                    ScmPdManagementStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (16).toInt())
                        ).readNative(addr + 20L).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (1).toInt())
                        ).readNative(addr + 84L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: ScmPdManagementStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.health)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfOperationalStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfAdditionalReasons)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (16).toInt())
                    ).writeNative(addr + 20L, value.operationalStatus.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (1).toInt())
                    ).writeNative(addr + 84L, value.additionalReasons.toList())
                }
            }
    }
}

public data class ScmPdPassthroughInput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var protocolGuid: Guid = Guid(),
    public var dataSize: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPassthroughInput) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.protocolGuid != other.protocolGuid) return false
        if (this.dataSize != other.dataSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.protocolGuid.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class ScmPdPassthroughInvdimmInput(
    public var opcode: UInt = 0u,
    public var opcodeParametersLength: UInt = 0u,
    public var opcodeParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPassthroughInvdimmInput) return false
        if (this.opcode != other.opcode) return false
        if (this.opcodeParametersLength != other.opcodeParametersLength) return false
        if (!this.opcodeParameters.contentEquals(other.opcodeParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.opcode.hashCode()
        result = 31 * result + this.opcodeParametersLength.hashCode()
        result = 31 * result + this.opcodeParameters.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdPassthroughInvdimmInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdPassthroughInvdimmInput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ScmPdPassthroughInvdimmInput =
                    ScmPdPassthroughInvdimmInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScmPdPassthroughInvdimmInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.opcode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.opcodeParametersLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.opcodeParameters.toList())
                }
            }
    }
}

public data class ScmPdPassthroughInvdimmOutput(
    public var generalStatus: UShort = 0u,
    public var extendedStatus: UShort = 0u,
    public var outputDataLength: UInt = 0u,
    public var outputData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPassthroughInvdimmOutput) return false
        if (this.generalStatus != other.generalStatus) return false
        if (this.extendedStatus != other.extendedStatus) return false
        if (this.outputDataLength != other.outputDataLength) return false
        if (!this.outputData.contentEquals(other.outputData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.generalStatus.hashCode()
        result = 31 * result + this.extendedStatus.hashCode()
        result = 31 * result + this.outputDataLength.hashCode()
        result = 31 * result + this.outputData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdPassthroughInvdimmOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdPassthroughInvdimmOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ScmPdPassthroughInvdimmOutput =
                    ScmPdPassthroughInvdimmOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScmPdPassthroughInvdimmOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.generalStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.extendedStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.outputDataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.outputData.toList())
                }
            }
    }
}

public data class ScmPdPassthroughOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var protocolGuid: Guid = Guid(),
    public var dataSize: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPassthroughOutput) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.protocolGuid != other.protocolGuid) return false
        if (this.dataSize != other.dataSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.protocolGuid.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class ScmPdPropertyQuery(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var propertyId: ScmPdPropertyId = 0,
    public var queryType: ScmPdQueryType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPropertyQuery) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.propertyId != other.propertyId) return false
        if (this.queryType != other.queryType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.propertyId.hashCode()
        result = 31 * result + this.queryType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdPropertyQuery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdPropertyQuery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ScmPdPropertyQuery =
                    ScmPdPropertyQuery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScmPdPropertyQuery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.propertyId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.queryType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.additionalParameters.toList())
                }
            }
    }
}

public data class ScmPdPropertySet(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var propertyId: ScmPdPropertyId = 0,
    public var setType: ScmPdSetType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPropertySet) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.propertyId != other.propertyId) return false
        if (this.setType != other.setType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.propertyId.hashCode()
        result = 31 * result + this.setType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdPropertySet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdPropertySet> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ScmPdPropertySet =
                    ScmPdPropertySet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScmPdPropertySet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.propertyId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.setType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.additionalParameters.toList())
                }
            }
    }
}

public data class ScmPdReinitializeMediaInput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var options: ScmPdReinitializeMediaInput0 = ScmPdReinitializeMediaInput0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdReinitializeMediaInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdReinitializeMediaInput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ScmPdReinitializeMediaInput =
                    ScmPdReinitializeMediaInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (ScmPdReinitializeMediaInput0.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScmPdReinitializeMediaInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (ScmPdReinitializeMediaInput0.typeLayout()).writeNative(addr + 8L, value.options)
                }
            }
    }
}

public data class ScmPdReinitializeMediaInput0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdReinitializeMediaInput0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdReinitializeMediaInput0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ScmPdReinitializeMediaInput0 =
                    ScmPdReinitializeMediaInput0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScmPdReinitializeMediaInput0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ScmPdReinitializeMediaOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var status: ScmPdMediaReinitializationStatus = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdReinitializeMediaOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdReinitializeMediaOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ScmPdReinitializeMediaOutput =
                    ScmPdReinitializeMediaOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScmPdReinitializeMediaOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.status)
                }
            }
    }
}

public data class ScmPdRuntimeFwActivationArmState(
    public var armState: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdRuntimeFwActivationArmState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdRuntimeFwActivationArmState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): ScmPdRuntimeFwActivationArmState =
                    ScmPdRuntimeFwActivationArmState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScmPdRuntimeFwActivationArmState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.armState)
                }
            }
    }
}

public data class ScmPdRuntimeFwActivationInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var lastFirmwareActivationStatus: ScmPdLastFwActivationStatus = 0,
    public var firmwareActivationState: ScmPdFirmwareActivationState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdRuntimeFwActivationInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPdRuntimeFwActivationInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScmPdRuntimeFwActivationInfo =
                    ScmPdRuntimeFwActivationInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScmPdRuntimeFwActivationInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lastFirmwareActivationStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.firmwareActivationState)
                }
            }
    }
}

public data class ScmPhysicalDevices(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceCount: UInt = 0u,
    public var devices: List<ScmPhysicalDeviceInstance> = List(1) { ScmPhysicalDeviceInstance() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPhysicalDevices> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPhysicalDevices> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 536L
                override fun readNative(addr: Long): ScmPhysicalDevices =
                    ScmPhysicalDevices(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ScmPhysicalDeviceInstance.typeLayout(), (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScmPhysicalDevices) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.deviceCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ScmPhysicalDeviceInstance.typeLayout(), (1).toInt())
                    ).writeNative(addr + 12L, value.devices)
                }
            }
    }
}

public data class ScmPhysicalDeviceInstance(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var nfitHandle: UInt = 0u,
    public var symbolicLink: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPhysicalDeviceInstance) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.nfitHandle != other.nfitHandle) return false
        if (!this.symbolicLink.contentEquals(other.symbolicLink)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.nfitHandle.hashCode()
        result = 31 * result + this.symbolicLink.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPhysicalDeviceInstance> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScmPhysicalDeviceInstance> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): ScmPhysicalDeviceInstance =
                    ScmPhysicalDeviceInstance(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ScmPhysicalDeviceInstance) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nfitHandle)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 12L, value.symbolicLink.toList())
                }
            }
    }
}

public data class ScmRegion(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var nfitHandle: UInt = 0u,
    public var logicalDeviceGuid: Guid = Guid(),
    public var addressRangeType: Guid = Guid(),
    public var associatedId: UInt = 0u,
    public var length: ULong = 0uL,
    public var startingDPA: ULong = 0uL,
    public var baseSPA: ULong = 0uL,
    public var sPAOffset: ULong = 0uL,
    public var regionOffset: ULong = 0uL,
)

public data class ScmRegions(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var regionCount: UInt = 0u,
    public var regions: List<ScmRegion> = List(1) { ScmRegion() },
)

public data class SdChangeMachineSidInput(
    public var currentMachineSIDOffset: UShort = 0u,
    public var currentMachineSIDLength: UShort = 0u,
    public var newMachineSIDOffset: UShort = 0u,
    public var newMachineSIDLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdChangeMachineSidInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdChangeMachineSidInput> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SdChangeMachineSidInput =
                    SdChangeMachineSidInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SdChangeMachineSidInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.currentMachineSIDOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.currentMachineSIDLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.newMachineSIDOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.newMachineSIDLength)
                }
            }
    }
}

public data class SdChangeMachineSidOutput(
    public var numSDChangedSuccess: ULong = 0uL,
    public var numSDChangedFail: ULong = 0uL,
    public var numSDUnused: ULong = 0uL,
    public var numSDTotal: ULong = 0uL,
    public var numMftSDChangedSuccess: ULong = 0uL,
    public var numMftSDChangedFail: ULong = 0uL,
    public var numMftSDTotal: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdChangeMachineSidOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdChangeMachineSidOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): SdChangeMachineSidOutput =
                    SdChangeMachineSidOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: SdChangeMachineSidOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.numSDChangedSuccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.numSDChangedFail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.numSDUnused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.numSDTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.numMftSDChangedSuccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.numMftSDChangedFail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.numMftSDTotal)
                }
            }
    }
}

public data class SdEnumSdsEntry(
    public var hash: UInt = 0u,
    public var securityId: UInt = 0u,
    public var offset: ULong = 0uL,
    public var length: UInt = 0u,
    public var descriptor: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SdEnumSdsEntry) return false
        if (this.hash != other.hash) return false
        if (this.securityId != other.securityId) return false
        if (this.offset != other.offset) return false
        if (this.length != other.length) return false
        if (!this.descriptor.contentEquals(other.descriptor)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hash.hashCode()
        result = 31 * result + this.securityId.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.descriptor.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdEnumSdsEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdEnumSdsEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SdEnumSdsEntry =
                    SdEnumSdsEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SdEnumSdsEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.securityId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.descriptor.toList())
                }
            }
    }
}

public data class SdEnumSdsInput(
    public var startingOffset: ULong = 0uL,
    public var maxSDEntriesToReturn: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdEnumSdsInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdEnumSdsInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SdEnumSdsInput =
                    SdEnumSdsInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SdEnumSdsInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maxSDEntriesToReturn)
                }
            }
    }
}

public data class SdEnumSdsOutput(
    public var nextOffset: ULong = 0uL,
    public var numSDEntriesReturned: ULong = 0uL,
    public var numSDBytesReturned: ULong = 0uL,
    public var sDEntry: List<SdEnumSdsEntry> = List(1) { SdEnumSdsEntry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdEnumSdsOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdEnumSdsOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SdEnumSdsOutput =
                    SdEnumSdsOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SdEnumSdsEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SdEnumSdsOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.nextOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.numSDEntriesReturned)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.numSDBytesReturned)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SdEnumSdsEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.sDEntry)
                }
            }
    }
}

public data class SdGlobalChangeInput(
    public var flags: UInt = 0u,
    public var changeType: UInt = 0u,
    public var anonymous: SdGlobalChangeInput0 = SdGlobalChangeInput0(),
)

public data class SdGlobalChangeInput0(
    public var sdChange: SdChangeMachineSidInput = SdChangeMachineSidInput(),
    public var sdQueryStats: SdQueryStatsInput = SdQueryStatsInput(),
    public var sdEnumSds: SdEnumSdsInput = SdEnumSdsInput(),
)

public data class SdGlobalChangeOutput(
    public var flags: UInt = 0u,
    public var changeType: UInt = 0u,
    public var anonymous: SdGlobalChangeOutput0 = SdGlobalChangeOutput0(),
)

public data class SdGlobalChangeOutput0(
    public var sdChange: SdChangeMachineSidOutput = SdChangeMachineSidOutput(),
    public var sdQueryStats: SdQueryStatsOutput = SdQueryStatsOutput(),
    public var sdEnumSds: SdEnumSdsOutput = SdEnumSdsOutput(),
)

public data class SdQueryStatsInput(
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdQueryStatsInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdQueryStatsInput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SdQueryStatsInput =
                    SdQueryStatsInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SdQueryStatsInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved)
                }
            }
    }
}

public data class SdQueryStatsOutput(
    public var sdsStreamSize: ULong = 0uL,
    public var sdsAllocationSize: ULong = 0uL,
    public var siiStreamSize: ULong = 0uL,
    public var siiAllocationSize: ULong = 0uL,
    public var sdhStreamSize: ULong = 0uL,
    public var sdhAllocationSize: ULong = 0uL,
    public var numSDTotal: ULong = 0uL,
    public var numSDUnused: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdQueryStatsOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdQueryStatsOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): SdQueryStatsOutput =
                    SdQueryStatsOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: SdQueryStatsOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.sdsStreamSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.sdsAllocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.siiStreamSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.siiAllocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.sdhStreamSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.sdhAllocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.numSDTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.numSDUnused)
                }
            }
    }
}

public data class Sendcmdinparams(
    public var cBufferSize: UInt = 0u,
    public var irDriveRegs: Ideregs = Ideregs(),
    public var bDriveNumber: UByte = 0u,
    public var bReserved: UByteArray = UByteArray(3),
    public var dwReserved: UIntArray = UIntArray(4),
    public var bBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sendcmdinparams) return false
        if (this.cBufferSize != other.cBufferSize) return false
        if (this.irDriveRegs != other.irDriveRegs) return false
        if (this.bDriveNumber != other.bDriveNumber) return false
        if (!this.bReserved.contentEquals(other.bReserved)) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        if (!this.bBuffer.contentEquals(other.bBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBufferSize.hashCode()
        result = 31 * result + this.irDriveRegs.hashCode()
        result = 31 * result + this.bDriveNumber.hashCode()
        result = 31 * result + this.bReserved.contentHashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        result = 31 * result + this.bBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sendcmdinparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sendcmdinparams> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 33L
                override fun readNative(addr: Long): Sendcmdinparams =
                    Sendcmdinparams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Ideregs.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Sendcmdinparams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cBufferSize)
                    (Ideregs.typeLayout()).writeNative(addr + 4L, value.irDriveRegs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.bDriveNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.bReserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 16L, value.dwReserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 32L, value.bBuffer.toList())
                }
            }
    }
}

public data class Sendcmdoutparams(
    public var cBufferSize: UInt = 0u,
    public var driverStatus: Driverstatus = Driverstatus(),
    public var bBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sendcmdoutparams) return false
        if (this.cBufferSize != other.cBufferSize) return false
        if (this.driverStatus != other.driverStatus) return false
        if (!this.bBuffer.contentEquals(other.bBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBufferSize.hashCode()
        result = 31 * result + this.driverStatus.hashCode()
        result = 31 * result + this.bBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sendcmdoutparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sendcmdoutparams> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 17L
                override fun readNative(addr: Long): Sendcmdoutparams =
                    Sendcmdoutparams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Driverstatus.typeLayout()).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Sendcmdoutparams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cBufferSize)
                    (Driverstatus.typeLayout()).writeNative(addr + 4L, value.driverStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.bBuffer.toList())
                }
            }
    }
}

public data class SetDaxAllocAlignmentHintInput(
    public var flags: UInt = 0u,
    public var alignmentShift: UInt = 0u,
    public var fileOffsetToAlign: ULong = 0uL,
    public var fallbackAlignmentShift: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetDaxAllocAlignmentHintInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetDaxAllocAlignmentHintInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SetDaxAllocAlignmentHintInput =
                    SetDaxAllocAlignmentHintInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SetDaxAllocAlignmentHintInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alignmentShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fileOffsetToAlign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fallbackAlignmentShift)
                }
            }
    }
}

public data class SetDiskAttributes(
    public var version: UInt = 0u,
    public var persist: Boolean = false,
    public var reserved1: UByteArray = UByteArray(3),
    public var attributes: ULong = 0uL,
    public var attributesMask: ULong = 0uL,
    public var reserved2: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SetDiskAttributes) return false
        if (this.version != other.version) return false
        if (this.persist != other.persist) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.attributes != other.attributes) return false
        if (this.attributesMask != other.attributesMask) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.persist.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.attributesMask.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetDiskAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetDiskAttributes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): SetDiskAttributes =
                    SetDiskAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 24L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: SetDiskAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.persist)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.reserved1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.attributesMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 24L, value.reserved2.toList())
                }
            }
    }
}

public data class SetPartitionInformation(
    public var partitionType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetPartitionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetPartitionInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): SetPartitionInformation =
                    SetPartitionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SetPartitionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.partitionType)
                }
            }
    }
}

public data class SetPartitionInformationEx(
    public var partitionStyle: PartitionStyle = 0,
    public var anonymous: SetPartitionInformationEx0 = SetPartitionInformationEx0(),
)

public data class SetPartitionInformationEx0(
    public var mbr: SetPartitionInformation = SetPartitionInformation(),
    public var gpt: PartitionInformationGpt = PartitionInformationGpt(),
)

public data class SetPurgeFailureModeInput(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetPurgeFailureModeInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetPurgeFailureModeInput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SetPurgeFailureModeInput =
                    SetPurgeFailureModeInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SetPurgeFailureModeInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class ShrinkVolumeInformation(
    public var shrinkRequestType: ShrinkVolumeRequestTypes = 0,
    public var flags: ULong = 0uL,
    public var newNumberOfSectors: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShrinkVolumeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShrinkVolumeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ShrinkVolumeInformation =
                    ShrinkVolumeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ShrinkVolumeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.shrinkRequestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.newNumberOfSectors)
                }
            }
    }
}

public data class SiCopyfile(
    public var sourceFileNameLength: UInt = 0u,
    public var destinationFileNameLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileNameBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiCopyfile) return false
        if (this.sourceFileNameLength != other.sourceFileNameLength) return false
        if (this.destinationFileNameLength != other.destinationFileNameLength) return false
        if (this.flags != other.flags) return false
        if (!this.fileNameBuffer.contentEquals(other.fileNameBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sourceFileNameLength.hashCode()
        result = 31 * result + this.destinationFileNameLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fileNameBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiCopyfile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiCopyfile> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SiCopyfile =
                    SiCopyfile(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SiCopyfile) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sourceFileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.destinationFileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.fileNameBuffer.toList())
                }
            }
    }
}

public data class SmbShareFlushAndPurgeInput(
    public var version: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmbShareFlushAndPurgeInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmbShareFlushAndPurgeInput> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): SmbShareFlushAndPurgeInput =
                    SmbShareFlushAndPurgeInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SmbShareFlushAndPurgeInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                }
            }
    }
}

public data class SmbShareFlushAndPurgeOutput(
    public var cEntriesPurged: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmbShareFlushAndPurgeOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SmbShareFlushAndPurgeOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SmbShareFlushAndPurgeOutput =
                    SmbShareFlushAndPurgeOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SmbShareFlushAndPurgeOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntriesPurged)
                }
            }
    }
}

public data class StartingLcnInputBuffer(
    public var startingLcn: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StartingLcnInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StartingLcnInputBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StartingLcnInputBuffer =
                    StartingLcnInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StartingLcnInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingLcn)
                }
            }
    }
}

public data class StartingLcnInputBufferEx(
    public var startingLcn: Long = 0L,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StartingLcnInputBufferEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StartingLcnInputBufferEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StartingLcnInputBufferEx =
                    StartingLcnInputBufferEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StartingLcnInputBufferEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingLcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class StartingVcnInputBuffer(
    public var startingVcn: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StartingVcnInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StartingVcnInputBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StartingVcnInputBuffer =
                    StartingVcnInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StartingVcnInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingVcn)
                }
            }
    }
}

public data class StorageAccessAlignmentDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var bytesPerCacheLine: UInt = 0u,
    public var bytesOffsetForCacheAlignment: UInt = 0u,
    public var bytesPerLogicalSector: UInt = 0u,
    public var bytesPerPhysicalSector: UInt = 0u,
    public var bytesOffsetForSectorAlignment: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAccessAlignmentDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAccessAlignmentDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): StorageAccessAlignmentDescriptor =
                    StorageAccessAlignmentDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: StorageAccessAlignmentDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bytesPerCacheLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bytesOffsetForCacheAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bytesPerLogicalSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bytesPerPhysicalSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.bytesOffsetForSectorAlignment)
                }
            }
    }
}

public data class StorageAdapterDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var maximumTransferLength: UInt = 0u,
    public var maximumPhysicalPages: UInt = 0u,
    public var alignmentMask: UInt = 0u,
    public var adapterUsesPio: Boolean = false,
    public var adapterScansDown: Boolean = false,
    public var commandQueueing: Boolean = false,
    public var acceleratedTransfer: Boolean = false,
    public var busType: UByte = 0u,
    public var busMajorVersion: UShort = 0u,
    public var busMinorVersion: UShort = 0u,
    public var srbType: UByte = 0u,
    public var addressType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAdapterDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAdapterDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): StorageAdapterDescriptor =
                    StorageAdapterDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 21L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 23L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 31L),
                    )
                override fun writeNative(addr: Long, value: StorageAdapterDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maximumTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maximumPhysicalPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.alignmentMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.adapterUsesPio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 21L, value.adapterScansDown)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 22L, value.commandQueueing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 23L, value.acceleratedTransfer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.busType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.busMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.busMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 30L, value.srbType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 31L, value.addressType)
                }
            }
    }
}

public data class StorageAdapterSerialNumber(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var serialNumber: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageAdapterSerialNumber) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAdapterSerialNumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAdapterSerialNumber> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 264L
                override fun readNative(addr: Long): StorageAdapterSerialNumber =
                    StorageAdapterSerialNumber(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: StorageAdapterSerialNumber) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 8L, value.serialNumber.toList())
                }
            }
    }
}

public data class StorageAllocateBcStreamInput(
    public var version: UInt = 0u,
    public var requestsPerPeriod: UInt = 0u,
    public var period: UInt = 0u,
    public var retryFailures: Boolean = false,
    public var discardable: Boolean = false,
    public var reserved1: BooleanArray = BooleanArray(2),
    public var accessType: UInt = 0u,
    public var accessMode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageAllocateBcStreamInput) return false
        if (this.version != other.version) return false
        if (this.requestsPerPeriod != other.requestsPerPeriod) return false
        if (this.period != other.period) return false
        if (this.retryFailures != other.retryFailures) return false
        if (this.discardable != other.discardable) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.accessType != other.accessType) return false
        if (this.accessMode != other.accessMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.requestsPerPeriod.hashCode()
        result = 31 * result + this.period.hashCode()
        result = 31 * result + this.retryFailures.hashCode()
        result = 31 * result + this.discardable.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.accessType.hashCode()
        result = 31 * result + this.accessMode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAllocateBcStreamInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAllocateBcStreamInput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StorageAllocateBcStreamInput =
                    StorageAllocateBcStreamInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 13L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL, (2).toInt())
                        ).readNative(addr + 14L).toBooleanArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: StorageAllocateBcStreamInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.requestsPerPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.period)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.retryFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 13L, value.discardable)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL, (2).toInt())
                    ).writeNative(addr + 14L, value.reserved1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.accessType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.accessMode)
                }
            }
    }
}

public data class StorageAllocateBcStreamOutput(
    public var requestSize: ULong = 0uL,
    public var numOutStandingRequests: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAllocateBcStreamOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAllocateBcStreamOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageAllocateBcStreamOutput =
                    StorageAllocateBcStreamOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageAllocateBcStreamOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.requestSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numOutStandingRequests)
                }
            }
    }
}

public data class StorageAttributeMgmt(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var action: StorageAttributeMgmtAction = 0,
    public var attribute: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAttributeMgmt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageAttributeMgmt> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageAttributeMgmt =
                    StorageAttributeMgmt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: StorageAttributeMgmt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.attribute)
                }
            }
    }
}

public data class StorageBreakReservationRequest(
    public var length: UInt = 0u,
    public var unused: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageBreakReservationRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageBreakReservationRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StorageBreakReservationRequest =
                    StorageBreakReservationRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: StorageBreakReservationRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.unused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.lun)
                }
            }
    }
}

public data class StorageBusResetRequest(
    public var pathId: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageBusResetRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageBusResetRequest> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): StorageBusResetRequest =
                    StorageBusResetRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StorageBusResetRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.pathId)
                }
            }
    }
}

public data class StorageCounter(
    public var type: StorageCounterType = 0,
    public var value: StorageCounter0 = StorageCounter0(),
)

public data class StorageCounter0(
    public var manufactureDate: StorageCounter00 = StorageCounter00(),
    public var asUlonglong: ULong = 0uL,
)

public data class StorageCounter00(
    public var week: UInt = 0u,
    public var year: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageCounter00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageCounter00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StorageCounter00 =
                    StorageCounter00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: StorageCounter00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.week)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.year)
                }
            }
    }
}

public data class StorageCounters(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numberOfCounters: UInt = 0u,
    public var counters: List<StorageCounter> = List(1) { StorageCounter() },
)

public data class StorageCryptoCapability(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var cryptoCapabilityIndex: UInt = 0u,
    public var algorithmId: StorageCryptoAlgorithmId = 0,
    public var keySize: StorageCryptoKeySize = 0,
    public var dataUnitSizeBitmask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageCryptoCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageCryptoCapability> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StorageCryptoCapability =
                    StorageCryptoCapability(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: StorageCryptoCapability) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cryptoCapabilityIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.algorithmId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.keySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataUnitSizeBitmask)
                }
            }
    }
}

public data class StorageCryptoDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numKeysSupported: UInt = 0u,
    public var numCryptoCapabilities: UInt = 0u,
    public var cryptoCapabilities: List<StorageCryptoCapability> = List(1) { StorageCryptoCapability() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageCryptoDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageCryptoDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): StorageCryptoDescriptor =
                    StorageCryptoDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(StorageCryptoCapability.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StorageCryptoDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numKeysSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numCryptoCapabilities)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(StorageCryptoCapability.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.cryptoCapabilities)
                }
            }
    }
}

public data class StorageDescriptorHeader(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDescriptorHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDescriptorHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StorageDescriptorHeader =
                    StorageDescriptorHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: StorageDescriptorHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                }
            }
    }
}

public data class StorageDeviceAttributesDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var attributes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceAttributesDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceAttributesDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageDeviceAttributesDescriptor =
                    StorageDeviceAttributesDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceAttributesDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.attributes)
                }
            }
    }
}

public data class StorageDeviceDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceType: UByte = 0u,
    public var deviceTypeModifier: UByte = 0u,
    public var removableMedia: Boolean = false,
    public var commandQueueing: Boolean = false,
    public var vendorIdOffset: UInt = 0u,
    public var productIdOffset: UInt = 0u,
    public var productRevisionOffset: UInt = 0u,
    public var serialNumberOffset: UInt = 0u,
    public var busType: StorageBusType = 0,
    public var rawPropertiesLength: UInt = 0u,
    public var rawDeviceProperties: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDeviceDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.deviceType != other.deviceType) return false
        if (this.deviceTypeModifier != other.deviceTypeModifier) return false
        if (this.removableMedia != other.removableMedia) return false
        if (this.commandQueueing != other.commandQueueing) return false
        if (this.vendorIdOffset != other.vendorIdOffset) return false
        if (this.productIdOffset != other.productIdOffset) return false
        if (this.productRevisionOffset != other.productRevisionOffset) return false
        if (this.serialNumberOffset != other.serialNumberOffset) return false
        if (this.busType != other.busType) return false
        if (this.rawPropertiesLength != other.rawPropertiesLength) return false
        if (!this.rawDeviceProperties.contentEquals(other.rawDeviceProperties)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.deviceType.hashCode()
        result = 31 * result + this.deviceTypeModifier.hashCode()
        result = 31 * result + this.removableMedia.hashCode()
        result = 31 * result + this.commandQueueing.hashCode()
        result = 31 * result + this.vendorIdOffset.hashCode()
        result = 31 * result + this.productIdOffset.hashCode()
        result = 31 * result + this.productRevisionOffset.hashCode()
        result = 31 * result + this.serialNumberOffset.hashCode()
        result = 31 * result + this.busType.hashCode()
        result = 31 * result + this.rawPropertiesLength.hashCode()
        result = 31 * result + this.rawDeviceProperties.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): StorageDeviceDescriptor =
                    StorageDeviceDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 36L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.deviceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.deviceTypeModifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.removableMedia)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 11L, value.commandQueueing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.vendorIdOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.productIdOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.productRevisionOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.serialNumberOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.busType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.rawPropertiesLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 36L, value.rawDeviceProperties.toList())
                }
            }
    }
}

public data class StorageDeviceFaultDomainDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numberOfFaultDomains: UInt = 0u,
    public var faultDomainIds: List<Guid> = List(1) { Guid() },
)

public data class StorageDeviceIdDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numberOfIdentifiers: UInt = 0u,
    public var identifiers: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDeviceIdDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.numberOfIdentifiers != other.numberOfIdentifiers) return false
        if (!this.identifiers.contentEquals(other.identifiers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.numberOfIdentifiers.hashCode()
        result = 31 * result + this.identifiers.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceIdDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceIdDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageDeviceIdDescriptor =
                    StorageDeviceIdDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceIdDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfIdentifiers)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.identifiers.toList())
                }
            }
    }
}

public data class StorageDeviceIoCapabilityDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var lunMaxIoCount: UInt = 0u,
    public var adapterMaxIoCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceIoCapabilityDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceIoCapabilityDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageDeviceIoCapabilityDescriptor =
                    StorageDeviceIoCapabilityDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceIoCapabilityDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.lunMaxIoCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.adapterMaxIoCount)
                }
            }
    }
}

public data class StorageDeviceLedStateDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var state: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceLedStateDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceLedStateDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageDeviceLedStateDescriptor =
                    StorageDeviceLedStateDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceLedStateDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.state)
                }
            }
    }
}

public data class StorageDeviceLocationDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var location: DeviceLocation = DeviceLocation(),
    public var stringOffset: UInt = 0u,
)

public data class StorageDeviceManagementStatus(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var health: StorageDiskHealthStatus = 0,
    public var numberOfOperationalStatus: UInt = 0u,
    public var numberOfAdditionalReasons: UInt = 0u,
    public var operationalStatus: IntArray = IntArray(16),
    public var additionalReasons: List<StorageOperationalReason> = List(1) { StorageOperationalReason() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDeviceManagementStatus) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.health != other.health) return false
        if (this.numberOfOperationalStatus != other.numberOfOperationalStatus) return false
        if (this.numberOfAdditionalReasons != other.numberOfAdditionalReasons) return false
        if (!this.operationalStatus.contentEquals(other.operationalStatus)) return false
        if (this.additionalReasons != other.additionalReasons) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.health.hashCode()
        result = 31 * result + this.numberOfOperationalStatus.hashCode()
        result = 31 * result + this.numberOfAdditionalReasons.hashCode()
        result = 31 * result + this.operationalStatus.contentHashCode()
        result = 31 * result + this.additionalReasons.hashCode()
        return result
    }
}

public data class StorageDeviceNumaProperty(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numaNode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceNumaProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceNumaProperty> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StorageDeviceNumaProperty =
                    StorageDeviceNumaProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceNumaProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numaNode)
                }
            }
    }
}

public data class StorageDeviceNumber(
    public var deviceType: UInt = 0u,
    public var deviceNumber: UInt = 0u,
    public var partitionNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceNumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceNumber> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StorageDeviceNumber =
                    StorageDeviceNumber(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceNumber) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.deviceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.deviceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.partitionNumber)
                }
            }
    }
}

public data class StorageDeviceNumbers(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numberOfDevices: UInt = 0u,
    public var devices: List<StorageDeviceNumber> = List(1) { StorageDeviceNumber() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceNumbers> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceNumbers> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StorageDeviceNumbers =
                    StorageDeviceNumbers(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(StorageDeviceNumber.typeLayout(), (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceNumbers) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfDevices)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(StorageDeviceNumber.typeLayout(), (1).toInt())
                    ).writeNative(addr + 12L, value.devices)
                }
            }
    }
}

public data class StorageDeviceNumberEx(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var deviceType: UInt = 0u,
    public var deviceNumber: UInt = 0u,
    public var deviceGuid: Guid = Guid(),
    public var partitionNumber: UInt = 0u,
)

public data class StorageDevicePowerCap(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var units: StorageDevicePowerCapUnits = 0,
    public var maxPower: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDevicePowerCap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDevicePowerCap> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StorageDevicePowerCap =
                    StorageDevicePowerCap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StorageDevicePowerCap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.units)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.maxPower)
                }
            }
    }
}

public data class StorageDeviceResiliencyDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var nameOffset: UInt = 0u,
    public var numberOfLogicalCopies: UInt = 0u,
    public var numberOfPhysicalCopies: UInt = 0u,
    public var physicalDiskRedundancy: UInt = 0u,
    public var numberOfColumns: UInt = 0u,
    public var interleave: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceResiliencyDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceResiliencyDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): StorageDeviceResiliencyDescriptor =
                    StorageDeviceResiliencyDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceResiliencyDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfLogicalCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfPhysicalCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.physicalDiskRedundancy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numberOfColumns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.interleave)
                }
            }
    }
}

public data class StorageDeviceSelfEncryptionProperty(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var supportsSelfEncryption: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceSelfEncryptionProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceSelfEncryptionProperty> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StorageDeviceSelfEncryptionProperty =
                    StorageDeviceSelfEncryptionProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceSelfEncryptionProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.supportsSelfEncryption)
                }
            }
    }
}

public data class StorageDeviceSelfEncryptionPropertyV2(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var supportsSelfEncryption: Boolean = false,
    public var encryptionType: StorageEncryptionType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceSelfEncryptionPropertyV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceSelfEncryptionPropertyV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageDeviceSelfEncryptionPropertyV2 =
                    StorageDeviceSelfEncryptionPropertyV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceSelfEncryptionPropertyV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.supportsSelfEncryption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.encryptionType)
                }
            }
    }
}

public data class StorageDeviceTieringDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var totalNumberOfTiers: UInt = 0u,
    public var numberOfTiersReturned: UInt = 0u,
    public var tiers: List<StorageTier> = List(1) { StorageTier() },
)

public data class StorageDeviceUnsafeShutdownCount(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var unsafeShutdownCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceUnsafeShutdownCount> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDeviceUnsafeShutdownCount> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StorageDeviceUnsafeShutdownCount =
                    StorageDeviceUnsafeShutdownCount(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageDeviceUnsafeShutdownCount) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.unsafeShutdownCount)
                }
            }
    }
}

public data class StorageDiagnosticData(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var providerId: Guid = Guid(),
    public var bufferSize: UInt = 0u,
    public var reserved: UInt = 0u,
    public var diagnosticDataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDiagnosticData) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.providerId != other.providerId) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.reserved != other.reserved) return false
        if (!this.diagnosticDataBuffer.contentEquals(other.diagnosticDataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.providerId.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.diagnosticDataBuffer.contentHashCode()
        return result
    }
}

public data class StorageDiagnosticRequest(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var targetType: StorageDiagnosticTargetType = 0,
    public var level: StorageDiagnosticLevel = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDiagnosticRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageDiagnosticRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): StorageDiagnosticRequest =
                    StorageDiagnosticRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StorageDiagnosticRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.targetType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.level)
                }
            }
    }
}

public data class StorageEventNotification(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var events: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageEventNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageEventNotification> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageEventNotification =
                    StorageEventNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageEventNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.events)
                }
            }
    }
}

public data class StorageFailurePredictionConfig(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var set: Boolean = false,
    public var enabled: Boolean = false,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFailurePredictionConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFailurePredictionConfig> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StorageFailurePredictionConfig =
                    StorageFailurePredictionConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: StorageFailurePredictionConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.set)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.enabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.reserved)
                }
            }
    }
}

public data class StorageFruIdDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var identifierSize: UInt = 0u,
    public var identifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFruIdDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.identifierSize != other.identifierSize) return false
        if (!this.identifier.contentEquals(other.identifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.identifierSize.hashCode()
        result = 31 * result + this.identifier.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFruIdDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFruIdDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageFruIdDescriptor =
                    StorageFruIdDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageFruIdDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.identifierSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.identifier.toList())
                }
            }
    }
}

public data class StorageGetBcPropertiesOutput(
    public var maximumRequestsPerPeriod: UInt = 0u,
    public var minimumPeriod: UInt = 0u,
    public var maximumRequestSize: ULong = 0uL,
    public var estimatedTimePerRequest: UInt = 0u,
    public var numOutStandingRequests: UInt = 0u,
    public var requestSize: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageGetBcPropertiesOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageGetBcPropertiesOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): StorageGetBcPropertiesOutput =
                    StorageGetBcPropertiesOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: StorageGetBcPropertiesOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumRequestsPerPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minimumPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maximumRequestSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.estimatedTimePerRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.numOutStandingRequests)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.requestSize)
                }
            }
    }
}

public data class StorageHotplugInfo(
    public var size: UInt = 0u,
    public var mediaRemovable: Boolean = false,
    public var mediaHotplug: Boolean = false,
    public var deviceHotplug: Boolean = false,
    public var writeCacheEnableOverride: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHotplugInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHotplugInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StorageHotplugInfo =
                    StorageHotplugInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: StorageHotplugInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.mediaRemovable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.mediaHotplug)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.deviceHotplug)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 7L, value.writeCacheEnableOverride)
                }
            }
    }
}

public data class StorageHwEnduranceDataDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var enduranceInfo: StorageHwEnduranceInfo = StorageHwEnduranceInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwEnduranceDataDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwEnduranceDataDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): StorageHwEnduranceDataDescriptor =
                    StorageHwEnduranceDataDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (StorageHwEnduranceInfo.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageHwEnduranceDataDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (StorageHwEnduranceInfo.typeLayout()).writeNative(addr + 8L, value.enduranceInfo)
                }
            }
    }
}

public data class StorageHwEnduranceInfo(
    public var validFields: UInt = 0u,
    public var groupId: UInt = 0u,
    public var flags: StorageHwEnduranceInfo0 = StorageHwEnduranceInfo0(),
    public var lifePercentage: UInt = 0u,
    public var bytesReadCount: UByteArray = UByteArray(16),
    public var byteWriteCount: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwEnduranceInfo) return false
        if (this.validFields != other.validFields) return false
        if (this.groupId != other.groupId) return false
        if (this.flags != other.flags) return false
        if (this.lifePercentage != other.lifePercentage) return false
        if (!this.bytesReadCount.contentEquals(other.bytesReadCount)) return false
        if (!this.byteWriteCount.contentEquals(other.byteWriteCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validFields.hashCode()
        result = 31 * result + this.groupId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lifePercentage.hashCode()
        result = 31 * result + this.bytesReadCount.contentHashCode()
        result = 31 * result + this.byteWriteCount.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwEnduranceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwEnduranceInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): StorageHwEnduranceInfo =
                    StorageHwEnduranceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (StorageHwEnduranceInfo0.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageHwEnduranceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.validFields)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.groupId)
                    (StorageHwEnduranceInfo0.typeLayout()).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.lifePercentage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.bytesReadCount.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 32L, value.byteWriteCount.toList())
                }
            }
    }
}

public data class StorageHwEnduranceInfo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwEnduranceInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwEnduranceInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): StorageHwEnduranceInfo0 =
                    StorageHwEnduranceInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StorageHwEnduranceInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class StorageHwFirmwareActivate(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var slot: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwFirmwareActivate) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.slot != other.slot) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.slot.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareActivate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareActivate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageHwFirmwareActivate =
                    StorageHwFirmwareActivate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageHwFirmwareActivate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.slot)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved0.toList())
                }
            }
    }
}

public data class StorageHwFirmwareDownload(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var slot: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var offset: ULong = 0uL,
    public var bufferSize: ULong = 0uL,
    public var imageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwFirmwareDownload) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.slot != other.slot) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.offset != other.offset) return false
        if (this.bufferSize != other.bufferSize) return false
        if (!this.imageBuffer.contentEquals(other.imageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.slot.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.imageBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareDownload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareDownload> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): StorageHwFirmwareDownload =
                    StorageHwFirmwareDownload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageHwFirmwareDownload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.slot)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 32L, value.imageBuffer.toList())
                }
            }
    }
}

public data class StorageHwFirmwareDownloadV2(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var slot: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var offset: ULong = 0uL,
    public var bufferSize: ULong = 0uL,
    public var imageSize: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var imageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwFirmwareDownloadV2) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.slot != other.slot) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.offset != other.offset) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.imageSize != other.imageSize) return false
        if (this.reserved2 != other.reserved2) return false
        if (!this.imageBuffer.contentEquals(other.imageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.slot.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.imageSize.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.imageBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareDownloadV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareDownloadV2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): StorageHwFirmwareDownloadV2 =
                    StorageHwFirmwareDownloadV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 40L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageHwFirmwareDownloadV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.slot)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.bufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.imageSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 40L, value.imageBuffer.toList())
                }
            }
    }
}

public data class StorageHwFirmwareInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var bitfield: UByte = 0u,
    public var slotCount: UByte = 0u,
    public var activeSlot: UByte = 0u,
    public var pendingActivateSlot: UByte = 0u,
    public var firmwareShared: Boolean = false,
    public var reserved: UByteArray = UByteArray(3),
    public var imagePayloadAlignment: UInt = 0u,
    public var imagePayloadMaxSize: UInt = 0u,
    public var slot: List<StorageHwFirmwareSlotInfo> = List(1) { StorageHwFirmwareSlotInfo() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwFirmwareInfo) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.bitfield != other.bitfield) return false
        if (this.slotCount != other.slotCount) return false
        if (this.activeSlot != other.activeSlot) return false
        if (this.pendingActivateSlot != other.pendingActivateSlot) return false
        if (this.firmwareShared != other.firmwareShared) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.imagePayloadAlignment != other.imagePayloadAlignment) return false
        if (this.imagePayloadMaxSize != other.imagePayloadMaxSize) return false
        if (this.slot != other.slot) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.slotCount.hashCode()
        result = 31 * result + this.activeSlot.hashCode()
        result = 31 * result + this.pendingActivateSlot.hashCode()
        result = 31 * result + this.firmwareShared.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.imagePayloadAlignment.hashCode()
        result = 31 * result + this.imagePayloadMaxSize.hashCode()
        result = 31 * result + this.slot.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): StorageHwFirmwareInfo =
                    StorageHwFirmwareInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(StorageHwFirmwareSlotInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: StorageHwFirmwareInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.slotCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.activeSlot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.pendingActivateSlot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.firmwareShared)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.imagePayloadAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.imagePayloadMaxSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(StorageHwFirmwareSlotInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.slot)
                }
            }
    }
}

public data class StorageHwFirmwareInfoQuery(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareInfoQuery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareInfoQuery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageHwFirmwareInfoQuery =
                    StorageHwFirmwareInfoQuery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: StorageHwFirmwareInfoQuery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class StorageHwFirmwareSlotInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var slotNumber: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(6),
    public var revision: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwFirmwareSlotInfo) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.revision.contentEquals(other.revision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.slotNumber.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.revision.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareSlotInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageHwFirmwareSlotInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): StorageHwFirmwareSlotInfo =
                    StorageHwFirmwareSlotInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 10L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageHwFirmwareSlotInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.slotNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 10L, value.reserved1.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.revision.toList())
                }
            }
    }
}

public data class StorageIdentifier(
    public var codeSet: StorageIdentifierCodeSet = 0,
    public var type: StorageIdentifierType = 0,
    public var identifierSize: UShort = 0u,
    public var nextOffset: UShort = 0u,
    public var association: StorageAssociationType = 0,
    public var identifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageIdentifier) return false
        if (this.codeSet != other.codeSet) return false
        if (this.type != other.type) return false
        if (this.identifierSize != other.identifierSize) return false
        if (this.nextOffset != other.nextOffset) return false
        if (this.association != other.association) return false
        if (!this.identifier.contentEquals(other.identifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.codeSet.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.identifierSize.hashCode()
        result = 31 * result + this.nextOffset.hashCode()
        result = 31 * result + this.association.hashCode()
        result = 31 * result + this.identifier.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageIdentifier> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageIdentifier> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): StorageIdentifier =
                    StorageIdentifier(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageIdentifier) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.codeSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.identifierSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.nextOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.association)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.identifier.toList())
                }
            }
    }
}

public data class StorageIdlePower(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var bitfield: UInt = 0u,
    public var d3IdleTimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageIdlePower> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageIdlePower> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageIdlePower =
                    StorageIdlePower(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: StorageIdlePower) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.d3IdleTimeout)
                }
            }
    }
}

public data class StorageIdlePowerupReason(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var powerupReason: StoragePowerupReasonType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageIdlePowerupReason> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageIdlePowerupReason> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StorageIdlePowerupReason =
                    StorageIdlePowerupReason(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageIdlePowerupReason) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.powerupReason)
                }
            }
    }
}

public data class StorageLbProvisioningMapResources(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var bitfield1: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var bitfield2: UByte = 0u,
    public var reserved3: UByteArray = UByteArray(3),
    public var availableMappingResources: ULong = 0uL,
    public var usedMappingResources: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageLbProvisioningMapResources) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.bitfield1 != other.bitfield1) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.bitfield2 != other.bitfield2) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        if (this.availableMappingResources != other.availableMappingResources) return false
        if (this.usedMappingResources != other.usedMappingResources) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.bitfield1.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.bitfield2.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        result = 31 * result + this.availableMappingResources.hashCode()
        result = 31 * result + this.usedMappingResources.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageLbProvisioningMapResources> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageLbProvisioningMapResources> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): StorageLbProvisioningMapResources =
                    StorageLbProvisioningMapResources(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: StorageLbProvisioningMapResources) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bitfield1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 9L, value.reserved1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.bitfield2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved3.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.availableMappingResources)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.usedMappingResources)
                }
            }
    }
}

public data class StorageMediaSerialNumberData(
    public var reserved: UShort = 0u,
    public var serialNumberLength: UShort = 0u,
    public var serialNumber: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageMediaSerialNumberData) return false
        if (this.reserved != other.reserved) return false
        if (this.serialNumberLength != other.serialNumberLength) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.serialNumberLength.hashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageMediaSerialNumberData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageMediaSerialNumberData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): StorageMediaSerialNumberData =
                    StorageMediaSerialNumberData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageMediaSerialNumberData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.serialNumberLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.serialNumber.toList())
                }
            }
    }
}

public data class StorageMediumProductTypeDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var mediumProductType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageMediumProductTypeDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageMediumProductTypeDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StorageMediumProductTypeDescriptor =
                    StorageMediumProductTypeDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageMediumProductTypeDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mediumProductType)
                }
            }
    }
}

public data class StorageMiniportDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var portdriver: StoragePortCodeSet = 0,
    public var lUNResetSupported: Boolean = false,
    public var targetResetSupported: Boolean = false,
    public var ioTimeoutValue: UShort = 0u,
    public var extraIoInfoSupported: Boolean = false,
    public var flags: StorageMiniportDescriptor0 = StorageMiniportDescriptor0(),
    public var reserved0: UByteArray = UByteArray(2),
    public var reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageMiniportDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.portdriver != other.portdriver) return false
        if (this.lUNResetSupported != other.lUNResetSupported) return false
        if (this.targetResetSupported != other.targetResetSupported) return false
        if (this.ioTimeoutValue != other.ioTimeoutValue) return false
        if (this.extraIoInfoSupported != other.extraIoInfoSupported) return false
        if (this.flags != other.flags) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.portdriver.hashCode()
        result = 31 * result + this.lUNResetSupported.hashCode()
        result = 31 * result + this.targetResetSupported.hashCode()
        result = 31 * result + this.ioTimeoutValue.hashCode()
        result = 31 * result + this.extraIoInfoSupported.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }
}

public data class StorageMiniportDescriptor0(
    public var anonymous: StorageMiniportDescriptor00 = StorageMiniportDescriptor00(),
    public var asBYTE: UByte = 0u,
)

public data class StorageMiniportDescriptor00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageMiniportDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageMiniportDescriptor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): StorageMiniportDescriptor00 =
                    StorageMiniportDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StorageMiniportDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class StorageOffloadReadOutput(
    public var offloadReadFlags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var lengthProtected: ULong = 0uL,
    public var tokenLength: UInt = 0u,
    public var token: StorageOffloadToken = StorageOffloadToken(),
)

public data class StorageOffloadToken(
    public var tokenType: UByteArray = UByteArray(4),
    public var reserved: UByteArray = UByteArray(2),
    public var tokenIdLength: UByteArray = UByteArray(2),
    public var anonymous: StorageOffloadToken0 = StorageOffloadToken0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageOffloadToken) return false
        if (!this.tokenType.contentEquals(other.tokenType)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.tokenIdLength.contentEquals(other.tokenIdLength)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tokenType.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.tokenIdLength.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class StorageOffloadToken0(
    public var storageOffloadZeroDataToken: StorageOffloadToken00 = StorageOffloadToken00(),
    public var token: UByteArray = UByteArray(504),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageOffloadToken0) return false
        if (this.storageOffloadZeroDataToken != other.storageOffloadZeroDataToken) return false
        if (!this.token.contentEquals(other.token)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.storageOffloadZeroDataToken.hashCode()
        result = 31 * result + this.token.contentHashCode()
        return result
    }
}

public data class StorageOffloadToken00(
    public var reserved2: UByteArray = UByteArray(504),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageOffloadToken00) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved2.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageOffloadToken00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageOffloadToken00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 504L
                override fun readNative(addr: Long): StorageOffloadToken00 =
                    StorageOffloadToken00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (504).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageOffloadToken00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (504).toInt())
                    ).writeNative(addr, value.reserved2.toList())
                }
            }
    }
}

public data class StorageOffloadWriteOutput(
    public var offloadWriteFlags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var lengthCopied: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageOffloadWriteOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageOffloadWriteOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageOffloadWriteOutput =
                    StorageOffloadWriteOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageOffloadWriteOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offloadWriteFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lengthCopied)
                }
            }
    }
}

public data class StorageOperationalReason(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var reason: StorageOperationalStatusReason = 0,
    public var rawBytes: StorageOperationalReason0 = StorageOperationalReason0(),
)

public data class StorageOperationalReason0(
    public var scsiSenseKey: StorageOperationalReason00 = StorageOperationalReason00(),
    public var nvdimmN: StorageOperationalReason01 = StorageOperationalReason01(),
    public var asUlong: UInt = 0u,
)

public data class StorageOperationalReason01(
    public var criticalHealth: UByte = 0u,
    public var moduleHealth: UByteArray = UByteArray(2),
    public var errorThresholdStatus: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageOperationalReason01) return false
        if (this.criticalHealth != other.criticalHealth) return false
        if (!this.moduleHealth.contentEquals(other.moduleHealth)) return false
        if (this.errorThresholdStatus != other.errorThresholdStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.criticalHealth.hashCode()
        result = 31 * result + this.moduleHealth.contentHashCode()
        result = 31 * result + this.errorThresholdStatus.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageOperationalReason01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageOperationalReason01> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): StorageOperationalReason01 =
                    StorageOperationalReason01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: StorageOperationalReason01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.criticalHealth)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 1L, value.moduleHealth.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.errorThresholdStatus)
                }
            }
    }
}

public data class StorageOperationalReason00(
    public var senseKey: UByte = 0u,
    public var asc: UByte = 0u,
    public var ascq: UByte = 0u,
    public var reserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageOperationalReason00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageOperationalReason00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): StorageOperationalReason00 =
                    StorageOperationalReason00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: StorageOperationalReason00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.senseKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.asc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ascq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                }
            }
    }
}

public data class StoragePhysicalAdapterData(
    public var adapterId: UInt = 0u,
    public var healthStatus: StorageComponentHealthStatus = 0,
    public var commandProtocol: StorageProtocolType = 0,
    public var specVersion: StorageSpecVersion = StorageSpecVersion(),
    public var vendor: UByteArray = UByteArray(8),
    public var model: UByteArray = UByteArray(40),
    public var firmwareRevision: UByteArray = UByteArray(16),
    public var physicalLocation: UByteArray = UByteArray(32),
    public var expanderConnected: Boolean = false,
    public var reserved0: UByteArray = UByteArray(3),
    public var reserved1: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePhysicalAdapterData) return false
        if (this.adapterId != other.adapterId) return false
        if (this.healthStatus != other.healthStatus) return false
        if (this.commandProtocol != other.commandProtocol) return false
        if (this.specVersion != other.specVersion) return false
        if (!this.vendor.contentEquals(other.vendor)) return false
        if (!this.model.contentEquals(other.model)) return false
        if (!this.firmwareRevision.contentEquals(other.firmwareRevision)) return false
        if (!this.physicalLocation.contentEquals(other.physicalLocation)) return false
        if (this.expanderConnected != other.expanderConnected) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterId.hashCode()
        result = 31 * result + this.healthStatus.hashCode()
        result = 31 * result + this.commandProtocol.hashCode()
        result = 31 * result + this.specVersion.hashCode()
        result = 31 * result + this.vendor.contentHashCode()
        result = 31 * result + this.model.contentHashCode()
        result = 31 * result + this.firmwareRevision.contentHashCode()
        result = 31 * result + this.physicalLocation.contentHashCode()
        result = 31 * result + this.expanderConnected.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }
}

public data class StoragePhysicalDeviceData(
    public var deviceId: UInt = 0u,
    public var role: UInt = 0u,
    public var healthStatus: StorageComponentHealthStatus = 0,
    public var commandProtocol: StorageProtocolType = 0,
    public var specVersion: StorageSpecVersion = StorageSpecVersion(),
    public var formFactor: StorageDeviceFormFactor = 0,
    public var vendor: UByteArray = UByteArray(8),
    public var model: UByteArray = UByteArray(40),
    public var firmwareRevision: UByteArray = UByteArray(16),
    public var capacity: ULong = 0uL,
    public var physicalLocation: UByteArray = UByteArray(32),
    public var reserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePhysicalDeviceData) return false
        if (this.deviceId != other.deviceId) return false
        if (this.role != other.role) return false
        if (this.healthStatus != other.healthStatus) return false
        if (this.commandProtocol != other.commandProtocol) return false
        if (this.specVersion != other.specVersion) return false
        if (this.formFactor != other.formFactor) return false
        if (!this.vendor.contentEquals(other.vendor)) return false
        if (!this.model.contentEquals(other.model)) return false
        if (!this.firmwareRevision.contentEquals(other.firmwareRevision)) return false
        if (this.capacity != other.capacity) return false
        if (!this.physicalLocation.contentEquals(other.physicalLocation)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceId.hashCode()
        result = 31 * result + this.role.hashCode()
        result = 31 * result + this.healthStatus.hashCode()
        result = 31 * result + this.commandProtocol.hashCode()
        result = 31 * result + this.specVersion.hashCode()
        result = 31 * result + this.formFactor.hashCode()
        result = 31 * result + this.vendor.contentHashCode()
        result = 31 * result + this.model.contentHashCode()
        result = 31 * result + this.firmwareRevision.contentHashCode()
        result = 31 * result + this.capacity.hashCode()
        result = 31 * result + this.physicalLocation.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class StoragePhysicalNodeData(
    public var nodeId: UInt = 0u,
    public var adapterCount: UInt = 0u,
    public var adapterDataLength: UInt = 0u,
    public var adapterDataOffset: UInt = 0u,
    public var deviceCount: UInt = 0u,
    public var deviceDataLength: UInt = 0u,
    public var deviceDataOffset: UInt = 0u,
    public var reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePhysicalNodeData) return false
        if (this.nodeId != other.nodeId) return false
        if (this.adapterCount != other.adapterCount) return false
        if (this.adapterDataLength != other.adapterDataLength) return false
        if (this.adapterDataOffset != other.adapterDataOffset) return false
        if (this.deviceCount != other.deviceCount) return false
        if (this.deviceDataLength != other.deviceDataLength) return false
        if (this.deviceDataOffset != other.deviceDataOffset) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeId.hashCode()
        result = 31 * result + this.adapterCount.hashCode()
        result = 31 * result + this.adapterDataLength.hashCode()
        result = 31 * result + this.adapterDataOffset.hashCode()
        result = 31 * result + this.deviceCount.hashCode()
        result = 31 * result + this.deviceDataLength.hashCode()
        result = 31 * result + this.deviceDataOffset.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePhysicalNodeData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePhysicalNodeData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): StoragePhysicalNodeData =
                    StoragePhysicalNodeData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 28L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: StoragePhysicalNodeData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.adapterCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.adapterDataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.adapterDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.deviceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.deviceDataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.deviceDataOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 28L, value.reserved.toList())
                }
            }
    }
}

public data class StoragePhysicalTopologyDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var nodeCount: UInt = 0u,
    public var reserved: UInt = 0u,
    public var node: List<StoragePhysicalNodeData> = List(1) { StoragePhysicalNodeData() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePhysicalTopologyDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePhysicalTopologyDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): StoragePhysicalTopologyDescriptor =
                    StoragePhysicalTopologyDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(StoragePhysicalNodeData.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StoragePhysicalTopologyDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nodeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(StoragePhysicalNodeData.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.node)
                }
            }
    }
}

public data class StoragePredictFailure(
    public var predictFailure: UInt = 0u,
    public var vendorSpecific: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePredictFailure) return false
        if (this.predictFailure != other.predictFailure) return false
        if (!this.vendorSpecific.contentEquals(other.vendorSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.predictFailure.hashCode()
        result = 31 * result + this.vendorSpecific.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePredictFailure> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePredictFailure> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 516L
                override fun readNative(addr: Long): StoragePredictFailure =
                    StoragePredictFailure(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StoragePredictFailure) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.predictFailure)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                    ).writeNative(addr + 4L, value.vendorSpecific.toList())
                }
            }
    }
}

public data class StoragePriorityHintSupport(
    public var supportFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePriorityHintSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePriorityHintSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): StoragePriorityHintSupport =
                    StoragePriorityHintSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StoragePriorityHintSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.supportFlags)
                }
            }
    }
}

public data class StoragePropertyQuery(
    public var propertyId: StoragePropertyId = 0,
    public var queryType: StorageQueryType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePropertyQuery) return false
        if (this.propertyId != other.propertyId) return false
        if (this.queryType != other.queryType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyId.hashCode()
        result = 31 * result + this.queryType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePropertyQuery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePropertyQuery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StoragePropertyQuery =
                    StoragePropertyQuery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StoragePropertyQuery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.propertyId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.queryType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.additionalParameters.toList())
                }
            }
    }
}

public data class StoragePropertySet(
    public var propertyId: StoragePropertyId = 0,
    public var setType: StorageSetType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePropertySet) return false
        if (this.propertyId != other.propertyId) return false
        if (this.setType != other.setType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyId.hashCode()
        result = 31 * result + this.setType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePropertySet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StoragePropertySet> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StoragePropertySet =
                    StoragePropertySet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StoragePropertySet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.propertyId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.setType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.additionalParameters.toList())
                }
            }
    }
}

public class StorageProtocolCommand(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var protocolType: StorageProtocolType = 0,
    public var flags: UInt = 0u,
    public var returnStatus: UInt = 0u,
    public var errorCode: UInt = 0u,
    public var commandLength: UInt = 0u,
    public var errorInfoLength: UInt = 0u,
    public var dataToDeviceTransferLength: UInt = 0u,
    public var dataFromDeviceTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var errorInfoOffset: UInt = 0u,
    public var dataToDeviceBufferOffset: UInt = 0u,
    public var dataFromDeviceBufferOffset: UInt = 0u,
    public var commandSpecific: UInt = 0u,
    public var reserved0: UInt = 0u,
    public var fixedProtocolReturnData: UInt = 0u,
    public var reserved1: UIntArray = UIntArray(3),
    public var command: UByteArray = UByteArray(1),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolCommand> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolCommand> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): StorageProtocolCommand =
                    StorageProtocolCommand(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 68L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 80L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageProtocolCommand) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.protocolType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.returnStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.errorCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.commandLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.errorInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dataToDeviceTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dataFromDeviceTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.errorInfoOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dataToDeviceBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dataFromDeviceBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.commandSpecific)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.fixedProtocolReturnData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 68L, value.reserved1.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 80L, value.command.toList())
                }
            }
    }
}

public data class StorageProtocolDataDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var protocolSpecificData: StorageProtocolSpecificData = StorageProtocolSpecificData(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolDataDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolDataDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): StorageProtocolDataDescriptor =
                    StorageProtocolDataDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (StorageProtocolSpecificData.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageProtocolDataDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (StorageProtocolSpecificData.typeLayout()).writeNative(addr + 8L, value.protocolSpecificData)
                }
            }
    }
}

public data class StorageProtocolDataDescriptorExt(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var protocolSpecificData: StorageProtocolSpecificDataExt = StorageProtocolSpecificDataExt(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolDataDescriptorExt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolDataDescriptorExt> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): StorageProtocolDataDescriptorExt =
                    StorageProtocolDataDescriptorExt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (StorageProtocolSpecificDataExt.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageProtocolDataDescriptorExt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (StorageProtocolSpecificDataExt.typeLayout()).writeNative(addr + 8L, value.protocolSpecificData)
                }
            }
    }
}

public data class StorageProtocolDataSubvalueGetLogPage(
    public var anonymous: StorageProtocolDataSubvalueGetLogPage0 = StorageProtocolDataSubvalueGetLogPage0(),
    public var asUlong: UInt = 0u,
)

public data class StorageProtocolDataSubvalueGetLogPage0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolDataSubvalueGetLogPage0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolDataSubvalueGetLogPage0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): StorageProtocolDataSubvalueGetLogPage0 =
                    StorageProtocolDataSubvalueGetLogPage0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StorageProtocolDataSubvalueGetLogPage0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class StorageProtocolSpecificData(
    public var protocolType: StorageProtocolType = 0,
    public var dataType: UInt = 0u,
    public var protocolDataRequestValue: UInt = 0u,
    public var protocolDataRequestSubValue: UInt = 0u,
    public var protocolDataOffset: UInt = 0u,
    public var protocolDataLength: UInt = 0u,
    public var fixedProtocolReturnData: UInt = 0u,
    public var protocolDataRequestSubValue2: UInt = 0u,
    public var protocolDataRequestSubValue3: UInt = 0u,
    public var protocolDataRequestSubValue4: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolSpecificData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolSpecificData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): StorageProtocolSpecificData =
                    StorageProtocolSpecificData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: StorageProtocolSpecificData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.protocolType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dataType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.protocolDataRequestValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.protocolDataRequestSubValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.protocolDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.protocolDataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fixedProtocolReturnData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.protocolDataRequestSubValue2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.protocolDataRequestSubValue3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.protocolDataRequestSubValue4)
                }
            }
    }
}

public data class StorageProtocolSpecificDataExt(
    public var protocolType: StorageProtocolType = 0,
    public var dataType: UInt = 0u,
    public var protocolDataValue: UInt = 0u,
    public var protocolDataSubValue: UInt = 0u,
    public var protocolDataOffset: UInt = 0u,
    public var protocolDataLength: UInt = 0u,
    public var fixedProtocolReturnData: UInt = 0u,
    public var protocolDataSubValue2: UInt = 0u,
    public var protocolDataSubValue3: UInt = 0u,
    public var protocolDataSubValue4: UInt = 0u,
    public var protocolDataSubValue5: UInt = 0u,
    public var reserved: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageProtocolSpecificDataExt) return false
        if (this.protocolType != other.protocolType) return false
        if (this.dataType != other.dataType) return false
        if (this.protocolDataValue != other.protocolDataValue) return false
        if (this.protocolDataSubValue != other.protocolDataSubValue) return false
        if (this.protocolDataOffset != other.protocolDataOffset) return false
        if (this.protocolDataLength != other.protocolDataLength) return false
        if (this.fixedProtocolReturnData != other.fixedProtocolReturnData) return false
        if (this.protocolDataSubValue2 != other.protocolDataSubValue2) return false
        if (this.protocolDataSubValue3 != other.protocolDataSubValue3) return false
        if (this.protocolDataSubValue4 != other.protocolDataSubValue4) return false
        if (this.protocolDataSubValue5 != other.protocolDataSubValue5) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protocolType.hashCode()
        result = 31 * result + this.dataType.hashCode()
        result = 31 * result + this.protocolDataValue.hashCode()
        result = 31 * result + this.protocolDataSubValue.hashCode()
        result = 31 * result + this.protocolDataOffset.hashCode()
        result = 31 * result + this.protocolDataLength.hashCode()
        result = 31 * result + this.fixedProtocolReturnData.hashCode()
        result = 31 * result + this.protocolDataSubValue2.hashCode()
        result = 31 * result + this.protocolDataSubValue3.hashCode()
        result = 31 * result + this.protocolDataSubValue4.hashCode()
        result = 31 * result + this.protocolDataSubValue5.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolSpecificDataExt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageProtocolSpecificDataExt> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): StorageProtocolSpecificDataExt =
                    StorageProtocolSpecificDataExt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                        ).readNative(addr + 44L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: StorageProtocolSpecificDataExt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.protocolType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dataType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.protocolDataValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.protocolDataSubValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.protocolDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.protocolDataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fixedProtocolReturnData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.protocolDataSubValue2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.protocolDataSubValue3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.protocolDataSubValue4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.protocolDataSubValue5)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                    ).writeNative(addr + 44L, value.reserved.toList())
                }
            }
    }
}

public data class StorageQueryDependentVolumeLev1Entry(
    public var entryLength: UInt = 0u,
    public var dependencyTypeFlags: UInt = 0u,
    public var providerSpecificFlags: UInt = 0u,
    public var virtualStorageType: VirtualStorageType = VirtualStorageType(),
)

public data class StorageQueryDependentVolumeLev2Entry(
    public var entryLength: UInt = 0u,
    public var dependencyTypeFlags: UInt = 0u,
    public var providerSpecificFlags: UInt = 0u,
    public var virtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var ancestorLevel: UInt = 0u,
    public var hostVolumeNameOffset: UInt = 0u,
    public var hostVolumeNameSize: UInt = 0u,
    public var dependentVolumeNameOffset: UInt = 0u,
    public var dependentVolumeNameSize: UInt = 0u,
    public var relativePathOffset: UInt = 0u,
    public var relativePathSize: UInt = 0u,
    public var dependentDeviceNameOffset: UInt = 0u,
    public var dependentDeviceNameSize: UInt = 0u,
)

public data class StorageQueryDependentVolumeRequest(
    public var requestLevel: UInt = 0u,
    public var requestFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageQueryDependentVolumeRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageQueryDependentVolumeRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StorageQueryDependentVolumeRequest =
                    StorageQueryDependentVolumeRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: StorageQueryDependentVolumeRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.requestFlags)
                }
            }
    }
}

public data class StorageQueryDependentVolumeResponse(
    public var responseLevel: UInt = 0u,
    public var numberEntries: UInt = 0u,
    public var anonymous: StorageQueryDependentVolumeResponse0 = StorageQueryDependentVolumeResponse0(),
)

public data class StorageQueryDependentVolumeResponse0(
    public var lev1Depends: List<StorageQueryDependentVolumeLev1Entry> = List(1) { StorageQueryDependentVolumeLev1Entry() },
    public var lev2Depends: List<StorageQueryDependentVolumeLev2Entry> = List(1) { StorageQueryDependentVolumeLev2Entry() },
)

public data class StorageReadCapacity(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var blockLength: UInt = 0u,
    public var numberOfBlocks: Long = 0L,
    public var diskLength: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageReadCapacity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageReadCapacity> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): StorageReadCapacity =
                    StorageReadCapacity(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: StorageReadCapacity) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.blockLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.numberOfBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.diskLength)
                }
            }
    }
}

public data class StorageReinitializeMedia(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var timeoutInSeconds: UInt = 0u,
    public var sanitizeOption: StorageReinitializeMedia0 = StorageReinitializeMedia0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageReinitializeMedia> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageReinitializeMedia> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageReinitializeMedia =
                    StorageReinitializeMedia(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (StorageReinitializeMedia0.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: StorageReinitializeMedia) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.timeoutInSeconds)
                    (StorageReinitializeMedia0.typeLayout()).writeNative(addr + 12L, value.sanitizeOption)
                }
            }
    }
}

public data class StorageReinitializeMedia0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageReinitializeMedia0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageReinitializeMedia0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): StorageReinitializeMedia0 =
                    StorageReinitializeMedia0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StorageReinitializeMedia0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class StorageRpmbDataFrame(
    public var stuff: UByteArray = UByteArray(196),
    public var keyOrMAC: UByteArray = UByteArray(32),
    public var data: UByteArray = UByteArray(256),
    public var nonce: UByteArray = UByteArray(16),
    public var writeCounter: UByteArray = UByteArray(4),
    public var address: UByteArray = UByteArray(2),
    public var blockCount: UByteArray = UByteArray(2),
    public var operationResult: UByteArray = UByteArray(2),
    public var requestOrResponseType: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageRpmbDataFrame) return false
        if (!this.stuff.contentEquals(other.stuff)) return false
        if (!this.keyOrMAC.contentEquals(other.keyOrMAC)) return false
        if (!this.data.contentEquals(other.data)) return false
        if (!this.nonce.contentEquals(other.nonce)) return false
        if (!this.writeCounter.contentEquals(other.writeCounter)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (!this.blockCount.contentEquals(other.blockCount)) return false
        if (!this.operationResult.contentEquals(other.operationResult)) return false
        if (!this.requestOrResponseType.contentEquals(other.requestOrResponseType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stuff.contentHashCode()
        result = 31 * result + this.keyOrMAC.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        result = 31 * result + this.nonce.contentHashCode()
        result = 31 * result + this.writeCounter.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.blockCount.contentHashCode()
        result = 31 * result + this.operationResult.contentHashCode()
        result = 31 * result + this.requestOrResponseType.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageRpmbDataFrame> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageRpmbDataFrame> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 512L
                override fun readNative(addr: Long): StorageRpmbDataFrame =
                    StorageRpmbDataFrame(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (196).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 196L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 228L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 484L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 500L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 504L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 506L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 508L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 510L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageRpmbDataFrame) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (196).toInt())
                    ).writeNative(addr, value.stuff.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 196L, value.keyOrMAC.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 228L, value.data.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 484L, value.nonce.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 500L, value.writeCounter.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 504L, value.address.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 506L, value.blockCount.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 508L, value.operationResult.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 510L, value.requestOrResponseType.toList())
                }
            }
    }
}

public data class StorageRpmbDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var sizeInBytes: UInt = 0u,
    public var maxReliableWriteSizeInBytes: UInt = 0u,
    public var frameFormat: StorageRpmbFrameType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageRpmbDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageRpmbDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): StorageRpmbDescriptor =
                    StorageRpmbDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StorageRpmbDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxReliableWriteSizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.frameFormat)
                }
            }
    }
}

public data class StorageSpecVersion(
    public var anonymous: StorageSpecVersion0 = StorageSpecVersion0(),
    public var asUlong: UInt = 0u,
)

public data class StorageSpecVersion0(
    public var minorVersion: StorageSpecVersion00 = StorageSpecVersion00(),
    public var majorVersion: UShort = 0u,
)

public data class StorageSpecVersion00(
    public var anonymous: StorageSpecVersion000 = StorageSpecVersion000(),
    public var asUshort: UShort = 0u,
)

public data class StorageSpecVersion000(
    public var subMinor: UByte = 0u,
    public var minor: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageSpecVersion000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageSpecVersion000> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): StorageSpecVersion000 =
                    StorageSpecVersion000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: StorageSpecVersion000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.subMinor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.minor)
                }
            }
    }
}

public data class StorageTemperatureDataDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var criticalTemperature: Short = 0,
    public var warningTemperature: Short = 0,
    public var infoCount: UShort = 0u,
    public var reserved0: UByteArray = UByteArray(2),
    public var reserved1: UIntArray = UIntArray(2),
    public var temperatureInfo: List<StorageTemperatureInfo> = List(1) { StorageTemperatureInfo() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageTemperatureDataDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.criticalTemperature != other.criticalTemperature) return false
        if (this.warningTemperature != other.warningTemperature) return false
        if (this.infoCount != other.infoCount) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.temperatureInfo != other.temperatureInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.criticalTemperature.hashCode()
        result = 31 * result + this.warningTemperature.hashCode()
        result = 31 * result + this.infoCount.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.temperatureInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageTemperatureDataDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageTemperatureDataDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): StorageTemperatureDataDescriptor =
                    StorageTemperatureDataDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 14L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(StorageTemperatureInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: StorageTemperatureDataDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.criticalTemperature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.warningTemperature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.infoCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 14L, value.reserved0.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 16L, value.reserved1.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(StorageTemperatureInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.temperatureInfo)
                }
            }
    }
}

public data class StorageTemperatureInfo(
    public var index: UShort = 0u,
    public var temperature: Short = 0,
    public var overThreshold: Short = 0,
    public var underThreshold: Short = 0,
    public var overThresholdChangable: Boolean = false,
    public var underThresholdChangable: Boolean = false,
    public var eventGenerated: Boolean = false,
    public var reserved0: UByte = 0u,
    public var reserved1: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageTemperatureInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageTemperatureInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageTemperatureInfo =
                    StorageTemperatureInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: StorageTemperatureInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.temperature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.overThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.underThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.overThresholdChangable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.underThresholdChangable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.eventGenerated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved1)
                }
            }
    }
}

public data class StorageTemperatureThreshold(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UShort = 0u,
    public var index: UShort = 0u,
    public var threshold: Short = 0,
    public var overThreshold: Boolean = false,
    public var reserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageTemperatureThreshold> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageTemperatureThreshold> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageTemperatureThreshold =
                    StorageTemperatureThreshold(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                    )
                override fun writeNative(addr: Long, value: StorageTemperatureThreshold) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.threshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 14L, value.overThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.reserved)
                }
            }
    }
}

public data class StorageTier(
    public var id: Guid = Guid(),
    public var name: UShortArray = UShortArray(256),
    public var description: UShortArray = UShortArray(256),
    public var flags: ULong = 0uL,
    public var provisionedCapacity: ULong = 0uL,
    public var mediaType: StorageTierMediaType = 0,
    public var cls: StorageTierClass = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageTier) return false
        if (this.id != other.id) return false
        if (!this.name.contentEquals(other.name)) return false
        if (!this.description.contentEquals(other.description)) return false
        if (this.flags != other.flags) return false
        if (this.provisionedCapacity != other.provisionedCapacity) return false
        if (this.mediaType != other.mediaType) return false
        if (this.cls != other.cls) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.provisionedCapacity.hashCode()
        result = 31 * result + this.mediaType.hashCode()
        result = 31 * result + this.cls.hashCode()
        return result
    }
}

public data class StorageTierRegion(
    public var tierId: Guid = Guid(),
    public var offset: ULong = 0uL,
    public var length: ULong = 0uL,
)

public data class StorageWriteCacheProperty(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var writeCacheType: WriteCacheType = 0,
    public var writeCacheEnabled: WriteCacheEnable = 0,
    public var writeCacheChangeable: WriteCacheChange = 0,
    public var writeThroughSupported: WriteThrough = 0,
    public var flushCacheSupported: Boolean = false,
    public var userDefinedPowerProtection: Boolean = false,
    public var nVCacheEnabled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageWriteCacheProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageWriteCacheProperty> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): StorageWriteCacheProperty =
                    StorageWriteCacheProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 26L),
                    )
                override fun writeNative(addr: Long, value: StorageWriteCacheProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.writeCacheType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.writeCacheEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.writeCacheChangeable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.writeThroughSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 24L, value.flushCacheSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 25L, value.userDefinedPowerProtection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 26L, value.nVCacheEnabled)
                }
            }
    }
}

public data class StorageZonedDeviceDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceType: StorageZonedDeviceTypes = 0,
    public var zoneCount: UInt = 0u,
    public var zoneAttributes: StorageZonedDeviceDescriptor0 = StorageZonedDeviceDescriptor0(),
    public var zoneGroupCount: UInt = 0u,
    public var zoneGroup: List<StorageZoneGroup> = List(1) { StorageZoneGroup() },
)

public data class StorageZonedDeviceDescriptor0(
    public var sequentialRequiredZone: StorageZonedDeviceDescriptor00 = StorageZonedDeviceDescriptor00(),
    public var sequentialPreferredZone: StorageZonedDeviceDescriptor01 = StorageZonedDeviceDescriptor01(),
)

public data class StorageZonedDeviceDescriptor01(
    public var optimalOpenZoneCount: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageZonedDeviceDescriptor01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageZonedDeviceDescriptor01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StorageZonedDeviceDescriptor01 =
                    StorageZonedDeviceDescriptor01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: StorageZonedDeviceDescriptor01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.optimalOpenZoneCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class StorageZonedDeviceDescriptor00(
    public var maxOpenZoneCount: UInt = 0u,
    public var unrestrictedRead: Boolean = false,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageZonedDeviceDescriptor00) return false
        if (this.maxOpenZoneCount != other.maxOpenZoneCount) return false
        if (this.unrestrictedRead != other.unrestrictedRead) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxOpenZoneCount.hashCode()
        result = 31 * result + this.unrestrictedRead.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageZonedDeviceDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageZonedDeviceDescriptor00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StorageZonedDeviceDescriptor00 =
                    StorageZonedDeviceDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageZonedDeviceDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxOpenZoneCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.unrestrictedRead)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.reserved.toList())
                }
            }
    }
}

public data class StorageZoneDescriptor(
    public var size: UInt = 0u,
    public var zoneType: StorageZoneTypes = 0,
    public var zoneCondition: StorageZoneCondition = 0,
    public var resetWritePointerRecommend: Boolean = false,
    public var reserved0: UByteArray = UByteArray(3),
    public var zoneSize: ULong = 0uL,
    public var writePointerOffset: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageZoneDescriptor) return false
        if (this.size != other.size) return false
        if (this.zoneType != other.zoneType) return false
        if (this.zoneCondition != other.zoneCondition) return false
        if (this.resetWritePointerRecommend != other.resetWritePointerRecommend) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.zoneSize != other.zoneSize) return false
        if (this.writePointerOffset != other.writePointerOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.zoneType.hashCode()
        result = 31 * result + this.zoneCondition.hashCode()
        result = 31 * result + this.resetWritePointerRecommend.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.zoneSize.hashCode()
        result = 31 * result + this.writePointerOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageZoneDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageZoneDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): StorageZoneDescriptor =
                    StorageZoneDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: StorageZoneDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.zoneType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.zoneCondition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.resetWritePointerRecommend)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved0.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.zoneSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.writePointerOffset)
                }
            }
    }
}

public data class StorageZoneGroup(
    public var zoneCount: UInt = 0u,
    public var zoneType: StorageZoneTypes = 0,
    public var zoneSize: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageZoneGroup> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageZoneGroup> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StorageZoneGroup =
                    StorageZoneGroup(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageZoneGroup) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.zoneCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.zoneType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.zoneSize)
                }
            }
    }
}

public data class StreamsAssociateIdInputBuffer(
    public var flags: UInt = 0u,
    public var streamId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamsAssociateIdInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamsAssociateIdInputBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StreamsAssociateIdInputBuffer =
                    StreamsAssociateIdInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: StreamsAssociateIdInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.streamId)
                }
            }
    }
}

public data class StreamsQueryIdOutputBuffer(
    public var streamId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamsQueryIdOutputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamsQueryIdOutputBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): StreamsQueryIdOutputBuffer =
                    StreamsQueryIdOutputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StreamsQueryIdOutputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.streamId)
                }
            }
    }
}

public data class StreamsQueryParametersOutputBuffer(
    public var optimalWriteSize: UInt = 0u,
    public var streamGranularitySize: UInt = 0u,
    public var streamIdMin: UInt = 0u,
    public var streamIdMax: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamsQueryParametersOutputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamsQueryParametersOutputBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StreamsQueryParametersOutputBuffer =
                    StreamsQueryParametersOutputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: StreamsQueryParametersOutputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.optimalWriteSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.streamGranularitySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.streamIdMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.streamIdMax)
                }
            }
    }
}

public data class StreamExtentEntry(
    public var flags: UInt = 0u,
    public var extentInformation: StreamExtentEntry0 = StreamExtentEntry0(),
)

public data class StreamExtentEntry0(
    public var retrievalPointers: RetrievalPointersBuffer = RetrievalPointersBuffer(),
)

public data class StreamInformationEntry(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var streamInformation: StreamInformationEntry0 = StreamInformationEntry0(),
)

public data class StreamInformationEntry0(
    public var desiredStorageClass: StreamInformationEntry00 = StreamInformationEntry00(),
    public var dataStream: StreamInformationEntry01 = StreamInformationEntry01(),
    public var reparse: StreamInformationEntry02 = StreamInformationEntry02(),
    public var ea: StreamInformationEntry03 = StreamInformationEntry03(),
)

public data class StreamInformationEntry01(
    public var length: UShort = 0u,
    public var flags: UShort = 0u,
    public var reserved: UInt = 0u,
    public var vdl: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamInformationEntry01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamInformationEntry01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StreamInformationEntry01 =
                    StreamInformationEntry01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StreamInformationEntry01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.vdl)
                }
            }
    }
}

public data class StreamInformationEntry00(
    public var cls: FileStorageTierClass = 0,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamInformationEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamInformationEntry00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StreamInformationEntry00 =
                    StreamInformationEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: StreamInformationEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class StreamInformationEntry03(
    public var length: UShort = 0u,
    public var flags: UShort = 0u,
    public var eaSize: UInt = 0u,
    public var eaInformationOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamInformationEntry03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamInformationEntry03> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StreamInformationEntry03 =
                    StreamInformationEntry03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StreamInformationEntry03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.eaSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eaInformationOffset)
                }
            }
    }
}

public data class StreamInformationEntry02(
    public var length: UShort = 0u,
    public var flags: UShort = 0u,
    public var reparseDataSize: UInt = 0u,
    public var reparseDataOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamInformationEntry02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamInformationEntry02> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StreamInformationEntry02 =
                    StreamInformationEntry02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StreamInformationEntry02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reparseDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reparseDataOffset)
                }
            }
    }
}

public data class StreamLayoutEntry(
    public var version: UInt = 0u,
    public var nextStreamOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var extentInformationOffset: UInt = 0u,
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var streamInformationOffset: UInt = 0u,
    public var attributeTypeCode: UInt = 0u,
    public var attributeFlags: UInt = 0u,
    public var streamIdentifierLength: UInt = 0u,
    public var streamIdentifier: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StreamLayoutEntry) return false
        if (this.version != other.version) return false
        if (this.nextStreamOffset != other.nextStreamOffset) return false
        if (this.flags != other.flags) return false
        if (this.extentInformationOffset != other.extentInformationOffset) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.streamInformationOffset != other.streamInformationOffset) return false
        if (this.attributeTypeCode != other.attributeTypeCode) return false
        if (this.attributeFlags != other.attributeFlags) return false
        if (this.streamIdentifierLength != other.streamIdentifierLength) return false
        if (!this.streamIdentifier.contentEquals(other.streamIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.nextStreamOffset.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.extentInformationOffset.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.streamInformationOffset.hashCode()
        result = 31 * result + this.attributeTypeCode.hashCode()
        result = 31 * result + this.attributeFlags.hashCode()
        result = 31 * result + this.streamIdentifierLength.hashCode()
        result = 31 * result + this.streamIdentifier.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamLayoutEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StreamLayoutEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): StreamLayoutEntry =
                    StreamLayoutEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 48L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: StreamLayoutEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nextStreamOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.extentInformationOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.streamInformationOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.attributeTypeCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.attributeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.streamIdentifierLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 48L, value.streamIdentifier.toList())
                }
            }
    }
}

public data class TapeGetStatistics(
    public var operation: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeGetStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeGetStatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TapeGetStatistics =
                    TapeGetStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TapeGetStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.operation)
                }
            }
    }
}

public data class TapeStatistics(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var recoveredWrites: Long = 0L,
    public var unrecoveredWrites: Long = 0L,
    public var recoveredReads: Long = 0L,
    public var unrecoveredReads: Long = 0L,
    public var compressionRatioReads: UByte = 0u,
    public var compressionRatioWrites: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeStatistics> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): TapeStatistics =
                    TapeStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 41L),
                    )
                override fun writeNative(addr: Long, value: TapeStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.recoveredWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.unrecoveredWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.recoveredReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.unrecoveredReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 40L, value.compressionRatioReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 41L, value.compressionRatioWrites)
                }
            }
    }
}

public data class TxfsCreateMiniversionInfo(
    public var structureVersion: UShort = 0u,
    public var structureLength: UShort = 0u,
    public var baseVersion: UInt = 0u,
    public var miniVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsCreateMiniversionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsCreateMiniversionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): TxfsCreateMiniversionInfo =
                    TxfsCreateMiniversionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TxfsCreateMiniversionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.structureVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.structureLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.baseVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.miniVersion)
                }
            }
    }
}

public data class TxfsGetMetadataInfoOut(
    public var txfFileId: TxfsGetMetadataInfoOut0 = TxfsGetMetadataInfoOut0(),
    public var lockingTransaction: Guid = Guid(),
    public var lastLsn: ULong = 0uL,
    public var transactionState: UInt = 0u,
)

public data class TxfsGetMetadataInfoOut0(
    public var lowPart: Long = 0L,
    public var highPart: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsGetMetadataInfoOut0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsGetMetadataInfoOut0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TxfsGetMetadataInfoOut0 =
                    TxfsGetMetadataInfoOut0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TxfsGetMetadataInfoOut0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lowPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.highPart)
                }
            }
    }
}

public data class TxfsGetTransactedVersion(
    public var thisBaseVersion: UInt = 0u,
    public var latestVersion: UInt = 0u,
    public var thisMiniVersion: UShort = 0u,
    public var firstMiniVersion: UShort = 0u,
    public var latestMiniVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsGetTransactedVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsGetTransactedVersion> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TxfsGetTransactedVersion =
                    TxfsGetTransactedVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TxfsGetTransactedVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.thisBaseVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.latestVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.thisMiniVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.firstMiniVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.latestMiniVersion)
                }
            }
    }
}

public data class TxfsListTransactions(
    public var numberOfTransactions: ULong = 0uL,
    public var bufferSizeRequired: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsListTransactions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsListTransactions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TxfsListTransactions =
                    TxfsListTransactions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TxfsListTransactions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.numberOfTransactions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.bufferSizeRequired)
                }
            }
    }
}

public data class TxfsListTransactionsEntry(
    public var transactionId: Guid = Guid(),
    public var transactionState: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var reserved3: Long = 0L,
)

public data class TxfsListTransactionLockedFiles(
    public var ktmTransaction: Guid = Guid(),
    public var numberOfFiles: ULong = 0uL,
    public var bufferSizeRequired: ULong = 0uL,
    public var offset: ULong = 0uL,
)

public data class TxfsListTransactionLockedFilesEntry(
    public var offset: ULong = 0uL,
    public var nameFlags: UInt = 0u,
    public var fileId: Long = 0L,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var reserved3: Long = 0L,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TxfsListTransactionLockedFilesEntry) return false
        if (this.offset != other.offset) return false
        if (this.nameFlags != other.nameFlags) return false
        if (this.fileId != other.fileId) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.reserved3 != other.reserved3) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offset.hashCode()
        result = 31 * result + this.nameFlags.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsListTransactionLockedFilesEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsListTransactionLockedFilesEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): TxfsListTransactionLockedFilesEntry =
                    TxfsListTransactionLockedFilesEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 40L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: TxfsListTransactionLockedFilesEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nameFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.fileId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.reserved3)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 40L, value.fileName.toList())
                }
            }
    }
}

public data class TxfsModifyRm(
    public var flags: TxfsRmfLags = 0u,
    public var logContainerCountMax: UInt = 0u,
    public var logContainerCountMin: UInt = 0u,
    public var logContainerCount: UInt = 0u,
    public var logGrowthIncrement: UInt = 0u,
    public var logAutoShrinkPercentage: UInt = 0u,
    public var reserved: ULong = 0uL,
    public var loggingMode: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsModifyRm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsModifyRm> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): TxfsModifyRm =
                    TxfsModifyRm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: TxfsModifyRm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.logContainerCountMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.logContainerCountMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.logContainerCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.logGrowthIncrement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.logAutoShrinkPercentage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.loggingMode)
                }
            }
    }
}

public class TxfsQueryRmInformation(
    public var bytesRequired: UInt = 0u,
    public var tailLsn: ULong = 0uL,
    public var currentLsn: ULong = 0uL,
    public var archiveTailLsn: ULong = 0uL,
    public var logContainerSize: ULong = 0uL,
    public var highestVirtualClock: Long = 0L,
    public var logContainerCount: UInt = 0u,
    public var logContainerCountMax: UInt = 0u,
    public var logContainerCountMin: UInt = 0u,
    public var logGrowthIncrement: UInt = 0u,
    public var logAutoShrinkPercentage: UInt = 0u,
    public var flags: TxfsRmfLags = 0u,
    public var loggingMode: UShort = 0u,
    public var reserved: UShort = 0u,
    public var rmState: UInt = 0u,
    public var logCapacity: ULong = 0uL,
    public var logFree: ULong = 0uL,
    public var topsSize: ULong = 0uL,
    public var topsUsed: ULong = 0uL,
    public var transactionCount: ULong = 0uL,
    public var onePCCount: ULong = 0uL,
    public var twoPCCount: ULong = 0uL,
    public var numberLogFileFull: ULong = 0uL,
    public var oldestTransactionAge: ULong = 0uL,
    public var rMName: Guid = Guid(),
    public var tmLogPathOffset: UInt = 0u,
)

public data class TxfsReadBackupInformationOut(
    public var anonymous: TxfsReadBackupInformationOut0 = TxfsReadBackupInformationOut0(),
)

public data class TxfsReadBackupInformationOut0(
    public var bufferLength: UInt = 0u,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TxfsReadBackupInformationOut0) return false
        if (this.bufferLength != other.bufferLength) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bufferLength.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class TxfsRollforwardRedoInformation(
    public var lastVirtualClock: Long = 0L,
    public var lastRedoLsn: ULong = 0uL,
    public var highestRecoveryLsn: ULong = 0uL,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsRollforwardRedoInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsRollforwardRedoInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): TxfsRollforwardRedoInformation =
                    TxfsRollforwardRedoInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TxfsRollforwardRedoInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lastVirtualClock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lastRedoLsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.highestRecoveryLsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                }
            }
    }
}

public class TxfsSavepointInformation internal constructor(
    ktmTransactionCtorArg: Handle,
    public var actionCode: UInt,
    public var savepointId: UInt,
) {
    public var ktmTransaction: Handle = ktmTransactionCtorArg
        internal set

    public constructor() : this(
        ktmTransactionCtorArg = MutPtr(0L),
        actionCode = 0u,
        savepointId = 0u,
    )

    public operator fun component1(): Handle = this.ktmTransaction

    public operator fun component2(): UInt = this.actionCode

    public operator fun component3(): UInt = this.savepointId

    public fun copy(ktmTransaction: Handle = this.ktmTransaction, actionCode: UInt = this.actionCode, savepointId: UInt = this.savepointId): TxfsSavepointInformation = TxfsSavepointInformation(ktmTransactionCtorArg = ktmTransaction, actionCode = actionCode, savepointId = savepointId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TxfsSavepointInformation) return false
        if (this.ktmTransaction != other.ktmTransaction) return false
        if (this.actionCode != other.actionCode) return false
        if (this.savepointId != other.savepointId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ktmTransaction.hashCode()
        result = 31 * result + this.actionCode.hashCode()
        result = 31 * result + this.savepointId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ktmTransaction: Handle = MutPtr(0L),
            actionCode: UInt = 0u,
            savepointId: UInt = 0u,
        ): TxfsSavepointInformation =
            TxfsSavepointInformation(
                ktmTransactionCtorArg = ktmTransaction,
                actionCode = actionCode,
                savepointId = savepointId,
            )
    }
}

public data class TxfsStartRmInformation(
    public var flags: UInt = 0u,
    public var logContainerSize: ULong = 0uL,
    public var logContainerCountMin: UInt = 0u,
    public var logContainerCountMax: UInt = 0u,
    public var logGrowthIncrement: UInt = 0u,
    public var logAutoShrinkPercentage: UInt = 0u,
    public var tmLogPathOffset: UInt = 0u,
    public var tmLogPathLength: UShort = 0u,
    public var loggingMode: UShort = 0u,
    public var logPathLength: UShort = 0u,
    public var reserved: UShort = 0u,
    public var logPath: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TxfsStartRmInformation) return false
        if (this.flags != other.flags) return false
        if (this.logContainerSize != other.logContainerSize) return false
        if (this.logContainerCountMin != other.logContainerCountMin) return false
        if (this.logContainerCountMax != other.logContainerCountMax) return false
        if (this.logGrowthIncrement != other.logGrowthIncrement) return false
        if (this.logAutoShrinkPercentage != other.logAutoShrinkPercentage) return false
        if (this.tmLogPathOffset != other.tmLogPathOffset) return false
        if (this.tmLogPathLength != other.tmLogPathLength) return false
        if (this.loggingMode != other.loggingMode) return false
        if (this.logPathLength != other.logPathLength) return false
        if (this.reserved != other.reserved) return false
        if (!this.logPath.contentEquals(other.logPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.logContainerSize.hashCode()
        result = 31 * result + this.logContainerCountMin.hashCode()
        result = 31 * result + this.logContainerCountMax.hashCode()
        result = 31 * result + this.logGrowthIncrement.hashCode()
        result = 31 * result + this.logAutoShrinkPercentage.hashCode()
        result = 31 * result + this.tmLogPathOffset.hashCode()
        result = 31 * result + this.tmLogPathLength.hashCode()
        result = 31 * result + this.loggingMode.hashCode()
        result = 31 * result + this.logPathLength.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.logPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsStartRmInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsStartRmInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): TxfsStartRmInformation =
                    TxfsStartRmInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 38L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 44L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: TxfsStartRmInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.logContainerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.logContainerCountMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.logContainerCountMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.logGrowthIncrement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.logAutoShrinkPercentage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.tmLogPathOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.tmLogPathLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 38L, value.loggingMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.logPathLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 44L, value.logPath.toList())
                }
            }
    }
}

public data class TxfsTransactionActiveInfo(
    public var transactionsActiveAtSnapshot: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsTransactionActiveInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsTransactionActiveInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): TxfsTransactionActiveInfo =
                    TxfsTransactionActiveInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TxfsTransactionActiveInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.transactionsActiveAtSnapshot)
                }
            }
    }
}

public data class TxfsWriteBackupInformation(
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TxfsWriteBackupInformation) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int = this.buffer.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsWriteBackupInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfsWriteBackupInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): TxfsWriteBackupInformation =
                    TxfsWriteBackupInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: TxfsWriteBackupInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr, value.buffer.toList())
                }
            }
    }
}

public data class UsnJournalDataV0(
    public var usnJournalID: ULong = 0uL,
    public var firstUsn: Long = 0L,
    public var nextUsn: Long = 0L,
    public var lowestValidUsn: Long = 0L,
    public var maxUsn: Long = 0L,
    public var maximumSize: ULong = 0uL,
    public var allocationDelta: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnJournalDataV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnJournalDataV0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): UsnJournalDataV0 =
                    UsnJournalDataV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: UsnJournalDataV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.usnJournalID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.firstUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.nextUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lowestValidUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.maxUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.maximumSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.allocationDelta)
                }
            }
    }
}

public data class UsnJournalDataV1(
    public var usnJournalID: ULong = 0uL,
    public var firstUsn: Long = 0L,
    public var nextUsn: Long = 0L,
    public var lowestValidUsn: Long = 0L,
    public var maxUsn: Long = 0L,
    public var maximumSize: ULong = 0uL,
    public var allocationDelta: ULong = 0uL,
    public var minSupportedMajorVersion: UShort = 0u,
    public var maxSupportedMajorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnJournalDataV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnJournalDataV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): UsnJournalDataV1 =
                    UsnJournalDataV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                    )
                override fun writeNative(addr: Long, value: UsnJournalDataV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.usnJournalID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.firstUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.nextUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lowestValidUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.maxUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.maximumSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.allocationDelta)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.minSupportedMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.maxSupportedMajorVersion)
                }
            }
    }
}

public data class UsnJournalDataV2(
    public var usnJournalID: ULong = 0uL,
    public var firstUsn: Long = 0L,
    public var nextUsn: Long = 0L,
    public var lowestValidUsn: Long = 0L,
    public var maxUsn: Long = 0L,
    public var maximumSize: ULong = 0uL,
    public var allocationDelta: ULong = 0uL,
    public var minSupportedMajorVersion: UShort = 0u,
    public var maxSupportedMajorVersion: UShort = 0u,
    public var flags: UInt = 0u,
    public var rangeTrackChunkSize: ULong = 0uL,
    public var rangeTrackFileSizeThreshold: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnJournalDataV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnJournalDataV2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): UsnJournalDataV2 =
                    UsnJournalDataV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: UsnJournalDataV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.usnJournalID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.firstUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.nextUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lowestValidUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.maxUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.maximumSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.allocationDelta)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.minSupportedMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.maxSupportedMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.rangeTrackChunkSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.rangeTrackFileSizeThreshold)
                }
            }
    }
}

public data class UsnRangeTrackOutput(
    public var usn: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnRangeTrackOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnRangeTrackOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UsnRangeTrackOutput =
                    UsnRangeTrackOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsnRangeTrackOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.usn)
                }
            }
    }
}

public data class UsnRecordCommonHeader(
    public var recordLength: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnRecordCommonHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnRecordCommonHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UsnRecordCommonHeader =
                    UsnRecordCommonHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: UsnRecordCommonHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.recordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.minorVersion)
                }
            }
    }
}

public data class UsnRecordExtent(
    public var offset: Long = 0L,
    public var length: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnRecordExtent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnRecordExtent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UsnRecordExtent =
                    UsnRecordExtent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UsnRecordExtent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class UsnRecordUnion(
    public var header: UsnRecordCommonHeader = UsnRecordCommonHeader(),
    public var v2: UsnRecordV2 = UsnRecordV2(),
    public var v3: UsnRecordV3 = UsnRecordV3(),
    public var v4: UsnRecordV4 = UsnRecordV4(),
)

public data class UsnRecordV2(
    public var recordLength: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var fileReferenceNumber: ULong = 0uL,
    public var parentFileReferenceNumber: ULong = 0uL,
    public var usn: Long = 0L,
    public var timeStamp: Long = 0L,
    public var reason: UInt = 0u,
    public var sourceInfo: UInt = 0u,
    public var securityId: UInt = 0u,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UShort = 0u,
    public var fileNameOffset: UShort = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsnRecordV2) return false
        if (this.recordLength != other.recordLength) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.fileReferenceNumber != other.fileReferenceNumber) return false
        if (this.parentFileReferenceNumber != other.parentFileReferenceNumber) return false
        if (this.usn != other.usn) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.reason != other.reason) return false
        if (this.sourceInfo != other.sourceInfo) return false
        if (this.securityId != other.securityId) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.fileNameOffset != other.fileNameOffset) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recordLength.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.fileReferenceNumber.hashCode()
        result = 31 * result + this.parentFileReferenceNumber.hashCode()
        result = 31 * result + this.usn.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.sourceInfo.hashCode()
        result = 31 * result + this.securityId.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileNameOffset.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnRecordV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnRecordV2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): UsnRecordV2 =
                    UsnRecordV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 60L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UsnRecordV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.recordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.parentFileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.usn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.timeStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.reason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.sourceInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.securityId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.fileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.fileNameOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 60L, value.fileName.toList())
                }
            }
    }
}

public data class UsnRecordV3(
    public var recordLength: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var fileReferenceNumber: FileId128 = FileId128(),
    public var parentFileReferenceNumber: FileId128 = FileId128(),
    public var usn: Long = 0L,
    public var timeStamp: Long = 0L,
    public var reason: UInt = 0u,
    public var sourceInfo: UInt = 0u,
    public var securityId: UInt = 0u,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UShort = 0u,
    public var fileNameOffset: UShort = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsnRecordV3) return false
        if (this.recordLength != other.recordLength) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.fileReferenceNumber != other.fileReferenceNumber) return false
        if (this.parentFileReferenceNumber != other.parentFileReferenceNumber) return false
        if (this.usn != other.usn) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.reason != other.reason) return false
        if (this.sourceInfo != other.sourceInfo) return false
        if (this.securityId != other.securityId) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.fileNameOffset != other.fileNameOffset) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recordLength.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.fileReferenceNumber.hashCode()
        result = 31 * result + this.parentFileReferenceNumber.hashCode()
        result = 31 * result + this.usn.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.sourceInfo.hashCode()
        result = 31 * result + this.securityId.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileNameOffset.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class UsnRecordV4(
    public var header: UsnRecordCommonHeader = UsnRecordCommonHeader(),
    public var fileReferenceNumber: FileId128 = FileId128(),
    public var parentFileReferenceNumber: FileId128 = FileId128(),
    public var usn: Long = 0L,
    public var reason: UInt = 0u,
    public var sourceInfo: UsnSourceInfoId = 0u,
    public var remainingExtents: UInt = 0u,
    public var numberOfExtents: UShort = 0u,
    public var extentSize: UShort = 0u,
    public var extents: List<UsnRecordExtent> = List(1) { UsnRecordExtent() },
)
