@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileId128
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.StorageBusType

public data class AsyncDuplicateExtentsStatus(
    public var version: UInt = 0u,
    public var state: DuplicateExtentsState = 0,
    public var sourceFileOffset: ULong = 0uL,
    public var targetFileOffset: ULong = 0uL,
    public var byteCount: ULong = 0uL,
    public var bytesDuplicated: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AsyncDuplicateExtentsStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AsyncDuplicateExtentsStatus> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): AsyncDuplicateExtentsStatus =
                    AsyncDuplicateExtentsStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: AsyncDuplicateExtentsStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.sourceFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.targetFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.byteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.bytesDuplicated)
                }
            }
    }
}

public data class BinCount(
    public var binRange: BinRange = BinRange(),
    public var binCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinCount> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinCount> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): BinCount =
                    BinCount(
                        (BinRange.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: BinCount) {
                    (BinRange.typeLayout()).writeNative(addr, value.binRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.binCount)
                }
            }
    }
}

public data class BinRange(
    public var startValue: Long = 0L,
    public var length: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BinRange =
                    BinRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BinRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class BinResults(
    public var numberOfBins: UInt = 0u,
    public var binCounts: List<BinCount> = List(1) { BinCount() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinResults> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinResults> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): BinResults =
                    BinResults(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(BinCount.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BinResults) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfBins)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(BinCount.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.binCounts)
                }
            }
    }
}

public data class BootAreaInfo(
    public var bootSectorCount: UInt = 0u,
    public var bootSectors: List<BootAreaInfo0> = List(2) { BootAreaInfo0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BootAreaInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BootAreaInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): BootAreaInfo =
                    BootAreaInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(BootAreaInfo0.typeLayout(), (2).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BootAreaInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bootSectorCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(BootAreaInfo0.typeLayout(), (2).toInt())
                    ).writeNative(addr + 8L, value.bootSectors)
                }
            }
    }
}

public data class BootAreaInfo0(
    public var offset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BootAreaInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BootAreaInfo0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BootAreaInfo0 =
                    BootAreaInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BootAreaInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.offset)
                }
            }
    }
}

public data class BulkSecurityTestData(
    public var desiredAccess: UInt = 0u,
    public var securityIds: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BulkSecurityTestData) return false
        if (this.desiredAccess != other.desiredAccess) return false
        if (!this.securityIds.contentEquals(other.securityIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.desiredAccess.hashCode()
        result = 31 * result + this.securityIds.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BulkSecurityTestData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BulkSecurityTestData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BulkSecurityTestData =
                    BulkSecurityTestData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: BulkSecurityTestData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.desiredAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.securityIds.toList())
                }
            }
    }
}

public data class ChangerElement(
    public var elementType: ElementType = 0,
    public var elementAddress: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerElement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerElement> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ChangerElement =
                    ChangerElement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ChangerElement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.elementType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.elementAddress)
                }
            }
    }
}

public data class ChangerElementList(
    public var element: ChangerElement = ChangerElement(),
    public var numberOfElements: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerElementList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerElementList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ChangerElementList =
                    ChangerElementList(
                        (ChangerElement.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ChangerElementList) {
                    (ChangerElement.typeLayout()).writeNative(addr, value.element)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfElements)
                }
            }
    }
}

public data class ChangerElementStatus(
    public var element: ChangerElement = ChangerElement(),
    public var srcElementAddress: ChangerElement = ChangerElement(),
    public var flags: ChangerElementStatusFlags = 0u,
    public var exceptionCode: UInt = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var reserved: UShort = 0u,
    public var primaryVolumeID: UByteArray = UByteArray(36),
    public var alternateVolumeID: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChangerElementStatus) return false
        if (this.element != other.element) return false
        if (this.srcElementAddress != other.srcElementAddress) return false
        if (this.flags != other.flags) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reserved != other.reserved) return false
        if (!this.primaryVolumeID.contentEquals(other.primaryVolumeID)) return false
        if (!this.alternateVolumeID.contentEquals(other.alternateVolumeID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.element.hashCode()
        result = 31 * result + this.srcElementAddress.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.exceptionCode.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.primaryVolumeID.contentHashCode()
        result = 31 * result + this.alternateVolumeID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerElementStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerElementStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 100L
                override fun readNative(addr: Long): ChangerElementStatus =
                    ChangerElementStatus(
                        (ChangerElement.typeLayout()).readNative(addr),
                        (ChangerElement.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                        ).readNative(addr + 64L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ChangerElementStatus) {
                    (ChangerElement.typeLayout()).writeNative(addr, value.element)
                    (ChangerElement.typeLayout()).writeNative(addr + 8L, value.srcElementAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.exceptionCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                    ).writeNative(addr + 28L, value.primaryVolumeID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                    ).writeNative(addr + 64L, value.alternateVolumeID.toList())
                }
            }
    }
}

public data class ChangerElementStatusEx(
    public var element: ChangerElement = ChangerElement(),
    public var srcElementAddress: ChangerElement = ChangerElement(),
    public var flags: ChangerElementStatusFlags = 0u,
    public var exceptionCode: UInt = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var reserved: UShort = 0u,
    public var primaryVolumeID: UByteArray = UByteArray(36),
    public var alternateVolumeID: UByteArray = UByteArray(36),
    public var vendorIdentification: UByteArray = UByteArray(8),
    public var productIdentification: UByteArray = UByteArray(16),
    public var serialNumber: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChangerElementStatusEx) return false
        if (this.element != other.element) return false
        if (this.srcElementAddress != other.srcElementAddress) return false
        if (this.flags != other.flags) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reserved != other.reserved) return false
        if (!this.primaryVolumeID.contentEquals(other.primaryVolumeID)) return false
        if (!this.alternateVolumeID.contentEquals(other.alternateVolumeID)) return false
        if (!this.vendorIdentification.contentEquals(other.vendorIdentification)) return false
        if (!this.productIdentification.contentEquals(other.productIdentification)) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.element.hashCode()
        result = 31 * result + this.srcElementAddress.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.exceptionCode.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.primaryVolumeID.contentHashCode()
        result = 31 * result + this.alternateVolumeID.contentHashCode()
        result = 31 * result + this.vendorIdentification.contentHashCode()
        result = 31 * result + this.productIdentification.contentHashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerElementStatusEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerElementStatusEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 156L
                override fun readNative(addr: Long): ChangerElementStatusEx =
                    ChangerElementStatusEx(
                        (ChangerElement.typeLayout()).readNative(addr),
                        (ChangerElement.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                        ).readNative(addr + 64L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 100L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 108L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 124L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ChangerElementStatusEx) {
                    (ChangerElement.typeLayout()).writeNative(addr, value.element)
                    (ChangerElement.typeLayout()).writeNative(addr + 8L, value.srcElementAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.exceptionCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                    ).writeNative(addr + 28L, value.primaryVolumeID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                    ).writeNative(addr + 64L, value.alternateVolumeID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 100L, value.vendorIdentification.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 108L, value.productIdentification.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 124L, value.serialNumber.toList())
                }
            }
    }
}

public data class ChangerExchangeMedium(
    public var transport: ChangerElement = ChangerElement(),
    public var source: ChangerElement = ChangerElement(),
    public var destination1: ChangerElement = ChangerElement(),
    public var destination2: ChangerElement = ChangerElement(),
    public var flip1: Boolean = false,
    public var flip2: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerExchangeMedium> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerExchangeMedium> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): ChangerExchangeMedium =
                    ChangerExchangeMedium(
                        (ChangerElement.typeLayout()).readNative(addr),
                        (ChangerElement.typeLayout()).readNative(addr + 8L),
                        (ChangerElement.typeLayout()).readNative(addr + 16L),
                        (ChangerElement.typeLayout()).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 33L),
                    )
                override fun writeNative(addr: Long, value: ChangerExchangeMedium) {
                    (ChangerElement.typeLayout()).writeNative(addr, value.transport)
                    (ChangerElement.typeLayout()).writeNative(addr + 8L, value.source)
                    (ChangerElement.typeLayout()).writeNative(addr + 16L, value.destination1)
                    (ChangerElement.typeLayout()).writeNative(addr + 24L, value.destination2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 32L, value.flip1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 33L, value.flip2)
                }
            }
    }
}

public data class ChangerInitializeElementStatus(
    public var elementList: ChangerElementList = ChangerElementList(),
    public var barCodeScan: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerInitializeElementStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerInitializeElementStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ChangerInitializeElementStatus =
                    ChangerInitializeElementStatus(
                        (ChangerElementList.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ChangerInitializeElementStatus) {
                    (ChangerElementList.typeLayout()).writeNative(addr, value.elementList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.barCodeScan)
                }
            }
    }
}

public data class ChangerMoveMedium(
    public var transport: ChangerElement = ChangerElement(),
    public var source: ChangerElement = ChangerElement(),
    public var destination: ChangerElement = ChangerElement(),
    public var flip: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerMoveMedium> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerMoveMedium> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): ChangerMoveMedium =
                    ChangerMoveMedium(
                        (ChangerElement.typeLayout()).readNative(addr),
                        (ChangerElement.typeLayout()).readNative(addr + 8L),
                        (ChangerElement.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ChangerMoveMedium) {
                    (ChangerElement.typeLayout()).writeNative(addr, value.transport)
                    (ChangerElement.typeLayout()).writeNative(addr + 8L, value.source)
                    (ChangerElement.typeLayout()).writeNative(addr + 16L, value.destination)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 24L, value.flip)
                }
            }
    }
}

public data class ChangerProductData(
    public var vendorId: UByteArray = UByteArray(8),
    public var productId: UByteArray = UByteArray(16),
    public var revision: UByteArray = UByteArray(4),
    public var serialNumber: UByteArray = UByteArray(32),
    public var deviceType: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChangerProductData) return false
        if (!this.vendorId.contentEquals(other.vendorId)) return false
        if (!this.productId.contentEquals(other.productId)) return false
        if (!this.revision.contentEquals(other.revision)) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        if (this.deviceType != other.deviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vendorId.contentHashCode()
        result = 31 * result + this.productId.contentHashCode()
        result = 31 * result + this.revision.contentHashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        result = 31 * result + this.deviceType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerProductData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerProductData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 61L
                override fun readNative(addr: Long): ChangerProductData =
                    ChangerProductData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: ChangerProductData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr, value.vendorId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 8L, value.productId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 24L, value.revision.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 28L, value.serialNumber.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 60L, value.deviceType)
                }
            }
    }
}

public data class ChangerReadElementStatus(
    public var elementList: ChangerElementList = ChangerElementList(),
    public var volumeTagInfo: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerReadElementStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerReadElementStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ChangerReadElementStatus =
                    ChangerReadElementStatus(
                        (ChangerElementList.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ChangerReadElementStatus) {
                    (ChangerElementList.typeLayout()).writeNative(addr, value.elementList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.volumeTagInfo)
                }
            }
    }
}

public data class ChangerSendVolumeTagInformation(
    public var startingElement: ChangerElement = ChangerElement(),
    public var actionCode: UInt = 0u,
    public var volumeIDTemplate: UByteArray = UByteArray(40),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChangerSendVolumeTagInformation) return false
        if (this.startingElement != other.startingElement) return false
        if (this.actionCode != other.actionCode) return false
        if (!this.volumeIDTemplate.contentEquals(other.volumeIDTemplate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startingElement.hashCode()
        result = 31 * result + this.actionCode.hashCode()
        result = 31 * result + this.volumeIDTemplate.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerSendVolumeTagInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerSendVolumeTagInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): ChangerSendVolumeTagInformation =
                    ChangerSendVolumeTagInformation(
                        (ChangerElement.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ChangerSendVolumeTagInformation) {
                    (ChangerElement.typeLayout()).writeNative(addr, value.startingElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.actionCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                    ).writeNative(addr + 12L, value.volumeIDTemplate.toList())
                }
            }
    }
}

public data class ChangerSetAccess(
    public var element: ChangerElement = ChangerElement(),
    public var control: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerSetAccess> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerSetAccess> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ChangerSetAccess =
                    ChangerSetAccess(
                        (ChangerElement.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ChangerSetAccess) {
                    (ChangerElement.typeLayout()).writeNative(addr, value.element)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.control)
                }
            }
    }
}

public data class ChangerSetPosition(
    public var transport: ChangerElement = ChangerElement(),
    public var destination: ChangerElement = ChangerElement(),
    public var flip: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerSetPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChangerSetPosition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ChangerSetPosition =
                    ChangerSetPosition(
                        (ChangerElement.typeLayout()).readNative(addr),
                        (ChangerElement.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ChangerSetPosition) {
                    (ChangerElement.typeLayout()).writeNative(addr, value.transport)
                    (ChangerElement.typeLayout()).writeNative(addr + 8L, value.destination)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.flip)
                }
            }
    }
}

public data class ClassMediaChangeContext(
    public var mediaChangeCount: UInt = 0u,
    public var newState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClassMediaChangeContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClassMediaChangeContext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ClassMediaChangeContext =
                    ClassMediaChangeContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClassMediaChangeContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mediaChangeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.newState)
                }
            }
    }
}

public data class ClusterRange(
    public var startingCluster: Long = 0L,
    public var clusterCount: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ClusterRange =
                    ClusterRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ClusterRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingCluster)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.clusterCount)
                }
            }
    }
}

public data class ContainerRootInfoInput(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerRootInfoInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerRootInfoInput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ContainerRootInfoInput =
                    ContainerRootInfoInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ContainerRootInfoInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class ContainerRootInfoOutput(
    public var containerRootIdLength: UShort = 0u,
    public var containerRootId: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ContainerRootInfoOutput) return false
        if (this.containerRootIdLength != other.containerRootIdLength) return false
        if (!this.containerRootId.contentEquals(other.containerRootId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.containerRootIdLength.hashCode()
        result = 31 * result + this.containerRootId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerRootInfoOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerRootInfoOutput> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ContainerRootInfoOutput =
                    ContainerRootInfoOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ContainerRootInfoOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.containerRootIdLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.containerRootId.toList())
                }
            }
    }
}

public data class ContainerVolumeState(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerVolumeState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerVolumeState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ContainerVolumeState =
                    ContainerVolumeState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ContainerVolumeState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class CreateDisk(
    public var partitionStyle: PartitionStyle = 0,
    public var anonymous: CreateDisk0 = CreateDisk0(),
)

public data class CreateDisk0(
    public var mbr: CreateDiskMbr = CreateDiskMbr(),
    public var gpt: CreateDiskGpt = CreateDiskGpt(),
)

public data class CreateDiskGpt(
    public var diskId: Guid = Guid(),
    public var maxPartitionCount: UInt = 0u,
)

public data class CreateDiskMbr(
    public var signature: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CreateDiskMbr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CreateDiskMbr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CreateDiskMbr =
                    CreateDiskMbr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CreateDiskMbr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                }
            }
    }
}

public data class CreateUsnJournalData(
    public var maximumSize: ULong = 0uL,
    public var allocationDelta: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CreateUsnJournalData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CreateUsnJournalData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CreateUsnJournalData =
                    CreateUsnJournalData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CreateUsnJournalData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.maximumSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.allocationDelta)
                }
            }
    }
}

public data class CsvControlParam(
    public var operation: CsvControlOp = 0,
    public var unused: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvControlParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvControlParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CsvControlParam =
                    CsvControlParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CsvControlParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.operation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.unused)
                }
            }
    }
}

public data class CsvIsOwnedByCsvfs(
    public var ownedByCSVFS: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvIsOwnedByCsvfs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvIsOwnedByCsvfs> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): CsvIsOwnedByCsvfs =
                    CsvIsOwnedByCsvfs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CsvIsOwnedByCsvfs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.ownedByCSVFS)
                }
            }
    }
}

public data class CsvMgmtLock(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvMgmtLock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvMgmtLock> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CsvMgmtLock =
                    CsvMgmtLock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CsvMgmtLock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class CsvNamespaceInfo(
    public var version: UInt = 0u,
    public var deviceNumber: UInt = 0u,
    public var startingOffset: Long = 0L,
    public var sectorSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvNamespaceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvNamespaceInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CsvNamespaceInfo =
                    CsvNamespaceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CsvNamespaceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.deviceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.startingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sectorSize)
                }
            }
    }
}

public data class CsvQueryFileRevision(
    public var fileId: Long = 0L,
    public var fileRevision: LongArray = LongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryFileRevision) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileRevision.contentEquals(other.fileRevision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileId.hashCode()
        result = 31 * result + this.fileRevision.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryFileRevision> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryFileRevision> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CsvQueryFileRevision =
                    CsvQueryFileRevision(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (3).toInt())
                        ).readNative(addr + 8L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: CsvQueryFileRevision) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (3).toInt())
                    ).writeNative(addr + 8L, value.fileRevision.toList())
                }
            }
    }
}

public data class CsvQueryFileRevisionFileId128(
    public var fileId: FileId128 = FileId128(),
    public var fileRevision: LongArray = LongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryFileRevisionFileId128) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileRevision.contentEquals(other.fileRevision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileId.hashCode()
        result = 31 * result + this.fileRevision.contentHashCode()
        return result
    }
}

public data class CsvQueryMdsPath(
    public var mdsNodeId: UInt = 0u,
    public var dsNodeId: UInt = 0u,
    public var pathLength: UInt = 0u,
    public var path: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryMdsPath) return false
        if (this.mdsNodeId != other.mdsNodeId) return false
        if (this.dsNodeId != other.dsNodeId) return false
        if (this.pathLength != other.pathLength) return false
        if (!this.path.contentEquals(other.path)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mdsNodeId.hashCode()
        result = 31 * result + this.dsNodeId.hashCode()
        result = 31 * result + this.pathLength.hashCode()
        result = 31 * result + this.path.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryMdsPath> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryMdsPath> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CsvQueryMdsPath =
                    CsvQueryMdsPath(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: CsvQueryMdsPath) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mdsNodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dsNodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pathLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.path.toList())
                }
            }
    }
}

public data class CsvQueryMdsPathV2(
    public var version: Long = 0L,
    public var requiredSize: UInt = 0u,
    public var mdsNodeId: UInt = 0u,
    public var dsNodeId: UInt = 0u,
    public var flags: UInt = 0u,
    public var diskConnectivity: CsvfsDiskConnectivity = 0,
    public var volumeId: Guid = Guid(),
    public var ipAddressOffset: UInt = 0u,
    public var ipAddressLength: UInt = 0u,
    public var pathOffset: UInt = 0u,
    public var pathLength: UInt = 0u,
)

public data class CsvQueryRedirectState(
    public var mdsNodeId: UInt = 0u,
    public var dsNodeId: UInt = 0u,
    public var fileRedirected: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryRedirectState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryRedirectState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CsvQueryRedirectState =
                    CsvQueryRedirectState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CsvQueryRedirectState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mdsNodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dsNodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.fileRedirected)
                }
            }
    }
}

public data class CsvQueryVetoFileDirectIoOutput(
    public var vetoedFromAltitudeIntegral: ULong = 0uL,
    public var vetoedFromAltitudeDecimal: ULong = 0uL,
    public var reason: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryVetoFileDirectIoOutput) return false
        if (this.vetoedFromAltitudeIntegral != other.vetoedFromAltitudeIntegral) return false
        if (this.vetoedFromAltitudeDecimal != other.vetoedFromAltitudeDecimal) return false
        if (!this.reason.contentEquals(other.reason)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vetoedFromAltitudeIntegral.hashCode()
        result = 31 * result + this.vetoedFromAltitudeDecimal.hashCode()
        result = 31 * result + this.reason.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryVetoFileDirectIoOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryVetoFileDirectIoOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): CsvQueryVetoFileDirectIoOutput =
                    CsvQueryVetoFileDirectIoOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: CsvQueryVetoFileDirectIoOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.vetoedFromAltitudeIntegral)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.vetoedFromAltitudeDecimal)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 16L, value.reason.toList())
                }
            }
    }
}

public data class CsvQueryVolumeId(
    public var volumeId: Guid = Guid(),
)

public data class CsvQueryVolumeRedirectState(
    public var mdsNodeId: UInt = 0u,
    public var dsNodeId: UInt = 0u,
    public var isDiskConnected: Boolean = false,
    public var clusterEnableDirectIo: Boolean = false,
    public var diskConnectivity: CsvfsDiskConnectivity = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryVolumeRedirectState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryVolumeRedirectState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CsvQueryVolumeRedirectState =
                    CsvQueryVolumeRedirectState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: CsvQueryVolumeRedirectState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mdsNodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dsNodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.isDiskConnected)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.clusterEnableDirectIo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.diskConnectivity)
                }
            }
    }
}

public data class CsvSetVolumeId(
    public var volumeId: Guid = Guid(),
)

public data class DecryptionStatusBuffer(
    public var noEncryptedStreams: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DecryptionStatusBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DecryptionStatusBuffer> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): DecryptionStatusBuffer =
                    DecryptionStatusBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DecryptionStatusBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.noEncryptedStreams)
                }
            }
    }
}

public data class DeleteUsnJournalData(
    public var usnJournalID: ULong = 0uL,
    public var deleteFlags: UsnDeleteFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeleteUsnJournalData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeleteUsnJournalData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeleteUsnJournalData =
                    DeleteUsnJournalData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeleteUsnJournalData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.usnJournalID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.deleteFlags)
                }
            }
    }
}

public data class DevicedumpPrivateSubsection(
    public var dwFlags: UInt = 0u,
    public var gPLogId: GpLogPageDescriptor = GpLogPageDescriptor(),
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpPrivateSubsection) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.gPLogId != other.gPLogId) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.gPLogId.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpPrivateSubsection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpPrivateSubsection> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 9L
                override fun readNative(addr: Long): DevicedumpPrivateSubsection =
                    DevicedumpPrivateSubsection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (GpLogPageDescriptor.typeLayout()).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DevicedumpPrivateSubsection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (GpLogPageDescriptor.typeLayout()).writeNative(addr + 4L, value.gPLogId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.bData.toList())
                }
            }
    }
}

public data class DevicedumpPublicSubsection(
    public var dwFlags: UInt = 0u,
    public var gPLogTable: List<GpLogPageDescriptor> = List(16) { GpLogPageDescriptor() },
    public var szDescription: ByteArray = ByteArray(16),
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpPublicSubsection) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.gPLogTable != other.gPLogTable) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.gPLogTable.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpPublicSubsection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpPublicSubsection> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 85L
                override fun readNative(addr: Long): DevicedumpPublicSubsection =
                    DevicedumpPublicSubsection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(GpLogPageDescriptor.typeLayout(), (16).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 68L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 84L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DevicedumpPublicSubsection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(GpLogPageDescriptor.typeLayout(), (16).toInt())
                    ).writeNative(addr + 4L, value.gPLogTable)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 68L, value.szDescription.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 84L, value.bData.toList())
                }
            }
    }
}

public data class DevicedumpRestrictedSubsection(
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpRestrictedSubsection) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int = this.bData.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpRestrictedSubsection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpRestrictedSubsection> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): DevicedumpRestrictedSubsection =
                    DevicedumpRestrictedSubsection(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DevicedumpRestrictedSubsection) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr, value.bData.toList())
                }
            }
    }
}

public data class DevicedumpSectionHeader(
    public var guidDeviceDataId: Guid = Guid(),
    public var sOrganizationID: UByteArray = UByteArray(16),
    public var dwFirmwareRevision: UInt = 0u,
    public var sModelNumber: UByteArray = UByteArray(32),
    public var szDeviceManufacturingID: UByteArray = UByteArray(32),
    public var dwFlags: UInt = 0u,
    public var bRestrictedPrivateDataVersion: UInt = 0u,
    public var dwFirmwareIssueId: UInt = 0u,
    public var szIssueDescriptionString: UByteArray = UByteArray(132),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpSectionHeader) return false
        if (this.guidDeviceDataId != other.guidDeviceDataId) return false
        if (!this.sOrganizationID.contentEquals(other.sOrganizationID)) return false
        if (this.dwFirmwareRevision != other.dwFirmwareRevision) return false
        if (!this.sModelNumber.contentEquals(other.sModelNumber)) return false
        if (!this.szDeviceManufacturingID.contentEquals(other.szDeviceManufacturingID)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.bRestrictedPrivateDataVersion != other.bRestrictedPrivateDataVersion) return false
        if (this.dwFirmwareIssueId != other.dwFirmwareIssueId) return false
        if (!this.szIssueDescriptionString.contentEquals(other.szIssueDescriptionString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidDeviceDataId.hashCode()
        result = 31 * result + this.sOrganizationID.contentHashCode()
        result = 31 * result + this.dwFirmwareRevision.hashCode()
        result = 31 * result + this.sModelNumber.contentHashCode()
        result = 31 * result + this.szDeviceManufacturingID.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.bRestrictedPrivateDataVersion.hashCode()
        result = 31 * result + this.dwFirmwareIssueId.hashCode()
        result = 31 * result + this.szIssueDescriptionString.contentHashCode()
        return result
    }
}

public data class DevicedumpStoragedeviceData(
    public var descriptor: DevicedumpStructureVersion = DevicedumpStructureVersion(),
    public var sectionHeader: DevicedumpSectionHeader = DevicedumpSectionHeader(),
    public var dwBufferSize: UInt = 0u,
    public var dwReasonForCollection: UInt = 0u,
    public var publicData: DevicedumpSubsectionPointer = DevicedumpSubsectionPointer(),
    public var restrictedData: DevicedumpSubsectionPointer = DevicedumpSubsectionPointer(),
    public var privateData: DevicedumpSubsectionPointer = DevicedumpSubsectionPointer(),
)

public data class DevicedumpStoragestackPublicDump(
    public var descriptor: DevicedumpStructureVersion = DevicedumpStructureVersion(),
    public var dwReasonForCollection: UInt = 0u,
    public var cDriverName: UByteArray = UByteArray(16),
    public var uiNumRecords: UInt = 0u,
    public var recordArray: List<DevicedumpStoragestackPublicStateRecord> = List(1) { DevicedumpStoragestackPublicStateRecord() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpStoragestackPublicDump) return false
        if (this.descriptor != other.descriptor) return false
        if (this.dwReasonForCollection != other.dwReasonForCollection) return false
        if (!this.cDriverName.contentEquals(other.cDriverName)) return false
        if (this.uiNumRecords != other.uiNumRecords) return false
        if (this.recordArray != other.recordArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.descriptor.hashCode()
        result = 31 * result + this.dwReasonForCollection.hashCode()
        result = 31 * result + this.cDriverName.contentHashCode()
        result = 31 * result + this.uiNumRecords.hashCode()
        result = 31 * result + this.recordArray.hashCode()
        return result
    }
}

public data class DevicedumpStoragestackPublicStateRecord(
    public var cdb: UByteArray = UByteArray(16),
    public var command: UByteArray = UByteArray(16),
    public var startTime: ULong = 0uL,
    public var endTime: ULong = 0uL,
    public var operationStatus: UInt = 0u,
    public var operationError: UInt = 0u,
    public var stackSpecific: DevicedumpStoragestackPublicStateRecord0 = DevicedumpStoragestackPublicStateRecord0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpStoragestackPublicStateRecord) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        if (!this.command.contentEquals(other.command)) return false
        if (this.startTime != other.startTime) return false
        if (this.endTime != other.endTime) return false
        if (this.operationStatus != other.operationStatus) return false
        if (this.operationError != other.operationError) return false
        if (this.stackSpecific != other.stackSpecific) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cdb.contentHashCode()
        result = 31 * result + this.command.contentHashCode()
        result = 31 * result + this.startTime.hashCode()
        result = 31 * result + this.endTime.hashCode()
        result = 31 * result + this.operationStatus.hashCode()
        result = 31 * result + this.operationError.hashCode()
        result = 31 * result + this.stackSpecific.hashCode()
        return result
    }
}

public data class DevicedumpStoragestackPublicStateRecord0(
    public var externalStack: DevicedumpStoragestackPublicStateRecord00 = DevicedumpStoragestackPublicStateRecord00(),
    public var ataPort: DevicedumpStoragestackPublicStateRecord01 = DevicedumpStoragestackPublicStateRecord01(),
    public var storPort: DevicedumpStoragestackPublicStateRecord02 = DevicedumpStoragestackPublicStateRecord02(),
)

public data class DevicedumpStoragestackPublicStateRecord01(
    public var dwAtaPortSpecific: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpStoragestackPublicStateRecord01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpStoragestackPublicStateRecord01> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DevicedumpStoragestackPublicStateRecord01 =
                    DevicedumpStoragestackPublicStateRecord01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DevicedumpStoragestackPublicStateRecord01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAtaPortSpecific)
                }
            }
    }
}

public data class DevicedumpStoragestackPublicStateRecord00(
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpStoragestackPublicStateRecord00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpStoragestackPublicStateRecord00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DevicedumpStoragestackPublicStateRecord00 =
                    DevicedumpStoragestackPublicStateRecord00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DevicedumpStoragestackPublicStateRecord00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwReserved)
                }
            }
    }
}

public data class DevicedumpStoragestackPublicStateRecord02(
    public var srbTag: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpStoragestackPublicStateRecord02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpStoragestackPublicStateRecord02> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DevicedumpStoragestackPublicStateRecord02 =
                    DevicedumpStoragestackPublicStateRecord02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DevicedumpStoragestackPublicStateRecord02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.srbTag)
                }
            }
    }
}

public data class DevicedumpStructureVersion(
    public var dwSignature: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpStructureVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpStructureVersion> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DevicedumpStructureVersion =
                    DevicedumpStructureVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DevicedumpStructureVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSize)
                }
            }
    }
}

public data class DevicedumpSubsectionPointer(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpSubsectionPointer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicedumpSubsectionPointer> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DevicedumpSubsectionPointer =
                    DevicedumpSubsectionPointer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DevicedumpSubsectionPointer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOffset)
                }
            }
    }
}

public data class DeviceCopyOffloadDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var maximumTokenLifetime: UInt = 0u,
    public var defaultTokenLifetime: UInt = 0u,
    public var maximumTransferSize: ULong = 0uL,
    public var optimalTransferCount: ULong = 0uL,
    public var maximumDataDescriptors: UInt = 0u,
    public var maximumTransferLengthPerDescriptor: UInt = 0u,
    public var optimalTransferLengthPerDescriptor: UInt = 0u,
    public var optimalTransferLengthGranularity: UShort = 0u,
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceCopyOffloadDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.maximumTokenLifetime != other.maximumTokenLifetime) return false
        if (this.defaultTokenLifetime != other.defaultTokenLifetime) return false
        if (this.maximumTransferSize != other.maximumTransferSize) return false
        if (this.optimalTransferCount != other.optimalTransferCount) return false
        if (this.maximumDataDescriptors != other.maximumDataDescriptors) return false
        if (this.maximumTransferLengthPerDescriptor != other.maximumTransferLengthPerDescriptor) return false
        if (this.optimalTransferLengthPerDescriptor != other.optimalTransferLengthPerDescriptor) return false
        if (this.optimalTransferLengthGranularity != other.optimalTransferLengthGranularity) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.maximumTokenLifetime.hashCode()
        result = 31 * result + this.defaultTokenLifetime.hashCode()
        result = 31 * result + this.maximumTransferSize.hashCode()
        result = 31 * result + this.optimalTransferCount.hashCode()
        result = 31 * result + this.maximumDataDescriptors.hashCode()
        result = 31 * result + this.maximumTransferLengthPerDescriptor.hashCode()
        result = 31 * result + this.optimalTransferLengthPerDescriptor.hashCode()
        result = 31 * result + this.optimalTransferLengthGranularity.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceCopyOffloadDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceCopyOffloadDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): DeviceCopyOffloadDescriptor =
                    DeviceCopyOffloadDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 46L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DeviceCopyOffloadDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maximumTokenLifetime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.defaultTokenLifetime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.maximumTransferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.optimalTransferCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.maximumDataDescriptors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maximumTransferLengthPerDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.optimalTransferLengthPerDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.optimalTransferLengthGranularity)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 46L, value.reserved.toList())
                }
            }
    }
}

public data class DeviceDataSetLbpStateParameters(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var outputVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetLbpStateParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetLbpStateParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeviceDataSetLbpStateParameters =
                    DeviceDataSetLbpStateParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DeviceDataSetLbpStateParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.outputVersion)
                }
            }
    }
}

public data class DeviceDataSetLbProvisioningState(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var slabSizeInBytes: ULong = 0uL,
    public var slabOffsetDeltaInBytes: UInt = 0u,
    public var slabAllocationBitMapBitCount: UInt = 0u,
    public var slabAllocationBitMapLength: UInt = 0u,
    public var slabAllocationBitMap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDataSetLbProvisioningState) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.slabSizeInBytes != other.slabSizeInBytes) return false
        if (this.slabOffsetDeltaInBytes != other.slabOffsetDeltaInBytes) return false
        if (this.slabAllocationBitMapBitCount != other.slabAllocationBitMapBitCount) return false
        if (this.slabAllocationBitMapLength != other.slabAllocationBitMapLength) return false
        if (!this.slabAllocationBitMap.contentEquals(other.slabAllocationBitMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.slabSizeInBytes.hashCode()
        result = 31 * result + this.slabOffsetDeltaInBytes.hashCode()
        result = 31 * result + this.slabAllocationBitMapBitCount.hashCode()
        result = 31 * result + this.slabAllocationBitMapLength.hashCode()
        result = 31 * result + this.slabAllocationBitMap.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetLbProvisioningState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetLbProvisioningState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DeviceDataSetLbProvisioningState =
                    DeviceDataSetLbProvisioningState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 28L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: DeviceDataSetLbProvisioningState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.slabSizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.slabOffsetDeltaInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.slabAllocationBitMapBitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.slabAllocationBitMapLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 28L, value.slabAllocationBitMap.toList())
                }
            }
    }
}

public data class DeviceDataSetLbProvisioningStateV2(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var slabSizeInBytes: ULong = 0uL,
    public var slabOffsetDeltaInBytes: ULong = 0uL,
    public var slabAllocationBitMapBitCount: UInt = 0u,
    public var slabAllocationBitMapLength: UInt = 0u,
    public var slabAllocationBitMap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDataSetLbProvisioningStateV2) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.slabSizeInBytes != other.slabSizeInBytes) return false
        if (this.slabOffsetDeltaInBytes != other.slabOffsetDeltaInBytes) return false
        if (this.slabAllocationBitMapBitCount != other.slabAllocationBitMapBitCount) return false
        if (this.slabAllocationBitMapLength != other.slabAllocationBitMapLength) return false
        if (!this.slabAllocationBitMap.contentEquals(other.slabAllocationBitMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.slabSizeInBytes.hashCode()
        result = 31 * result + this.slabOffsetDeltaInBytes.hashCode()
        result = 31 * result + this.slabAllocationBitMapBitCount.hashCode()
        result = 31 * result + this.slabAllocationBitMapLength.hashCode()
        result = 31 * result + this.slabAllocationBitMap.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetLbProvisioningStateV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetLbProvisioningStateV2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DeviceDataSetLbProvisioningStateV2 =
                    DeviceDataSetLbProvisioningStateV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 32L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: DeviceDataSetLbProvisioningStateV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.slabSizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.slabOffsetDeltaInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.slabAllocationBitMapBitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.slabAllocationBitMapLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 32L, value.slabAllocationBitMap.toList())
                }
            }
    }
}

public data class DeviceDataSetRange(
    public var startingOffset: Long = 0L,
    public var lengthInBytes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeviceDataSetRange =
                    DeviceDataSetRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeviceDataSetRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lengthInBytes)
                }
            }
    }
}

public data class DeviceDataSetRepairOutput(
    public var parityExtent: DeviceDataSetRange = DeviceDataSetRange(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetRepairOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetRepairOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeviceDataSetRepairOutput =
                    DeviceDataSetRepairOutput(
                        (DeviceDataSetRange.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DeviceDataSetRepairOutput) {
                    (DeviceDataSetRange.typeLayout()).writeNative(addr, value.parityExtent)
                }
            }
    }
}

public data class DeviceDataSetRepairParameters(
    public var numberOfRepairCopies: UInt = 0u,
    public var sourceCopy: UInt = 0u,
    public var repairCopies: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDataSetRepairParameters) return false
        if (this.numberOfRepairCopies != other.numberOfRepairCopies) return false
        if (this.sourceCopy != other.sourceCopy) return false
        if (!this.repairCopies.contentEquals(other.repairCopies)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfRepairCopies.hashCode()
        result = 31 * result + this.sourceCopy.hashCode()
        result = 31 * result + this.repairCopies.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetRepairParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetRepairParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DeviceDataSetRepairParameters =
                    DeviceDataSetRepairParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: DeviceDataSetRepairParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfRepairCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sourceCopy)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.repairCopies.toList())
                }
            }
    }
}

public data class DeviceDataSetScrubExOutput(
    public var bytesProcessed: ULong = 0uL,
    public var bytesRepaired: ULong = 0uL,
    public var bytesFailed: ULong = 0uL,
    public var parityExtent: DeviceDataSetRange = DeviceDataSetRange(),
    public var bytesScrubbed: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetScrubExOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetScrubExOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): DeviceDataSetScrubExOutput =
                    DeviceDataSetScrubExOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (DeviceDataSetRange.typeLayout()).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: DeviceDataSetScrubExOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bytesProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.bytesRepaired)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.bytesFailed)
                    (DeviceDataSetRange.typeLayout()).writeNative(addr + 24L, value.parityExtent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.bytesScrubbed)
                }
            }
    }
}

public data class DeviceDataSetScrubOutput(
    public var bytesProcessed: ULong = 0uL,
    public var bytesRepaired: ULong = 0uL,
    public var bytesFailed: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetScrubOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetScrubOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DeviceDataSetScrubOutput =
                    DeviceDataSetScrubOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DeviceDataSetScrubOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bytesProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.bytesRepaired)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.bytesFailed)
                }
            }
    }
}

public data class DeviceDataSetTopologyIdQueryOutput(
    public var topologyRangeBytes: ULong = 0uL,
    public var topologyId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDataSetTopologyIdQueryOutput) return false
        if (this.topologyRangeBytes != other.topologyRangeBytes) return false
        if (!this.topologyId.contentEquals(other.topologyId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.topologyRangeBytes.hashCode()
        result = 31 * result + this.topologyId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetTopologyIdQueryOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDataSetTopologyIdQueryOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DeviceDataSetTopologyIdQueryOutput =
                    DeviceDataSetTopologyIdQueryOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DeviceDataSetTopologyIdQueryOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.topologyRangeBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 8L, value.topologyId.toList())
                }
            }
    }
}

public data class DeviceDsmConversionOutput(
    public var version: UInt = 0u,
    public var source: Guid = Guid(),
)

public data class DeviceDsmDefinition(
    public var action: UInt = 0u,
    public var singleRange: Boolean = false,
    public var parameterBlockAlignment: UInt = 0u,
    public var parameterBlockLength: UInt = 0u,
    public var hasOutput: Boolean = false,
    public var outputBlockAlignment: UInt = 0u,
    public var outputBlockLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmDefinition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmDefinition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): DeviceDsmDefinition =
                    DeviceDsmDefinition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DeviceDsmDefinition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.singleRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.parameterBlockAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.parameterBlockLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.hasOutput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.outputBlockAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.outputBlockLength)
                }
            }
    }
}

public data class DeviceDsmFreeSpaceOutput(
    public var version: UInt = 0u,
    public var freeSpace: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmFreeSpaceOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmFreeSpaceOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeviceDsmFreeSpaceOutput =
                    DeviceDsmFreeSpaceOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeviceDsmFreeSpaceOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.freeSpace)
                }
            }
    }
}

public data class DeviceDsmLostQueryOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var alignment: ULong = 0uL,
    public var numberOfBits: UInt = 0u,
    public var bitMap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDsmLostQueryOutput) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.alignment != other.alignment) return false
        if (this.numberOfBits != other.numberOfBits) return false
        if (!this.bitMap.contentEquals(other.bitMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.numberOfBits.hashCode()
        result = 31 * result + this.bitMap.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmLostQueryOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmLostQueryOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DeviceDsmLostQueryOutput =
                    DeviceDsmLostQueryOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 20L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: DeviceDsmLostQueryOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfBits)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 20L, value.bitMap.toList())
                }
            }
    }
}

public data class DeviceDsmLostQueryParameters(
    public var version: UInt = 0u,
    public var granularity: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmLostQueryParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmLostQueryParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeviceDsmLostQueryParameters =
                    DeviceDsmLostQueryParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeviceDsmLostQueryParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.granularity)
                }
            }
    }
}

public data class DeviceDsmNotificationParameters(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var numFileTypeIDs: UInt = 0u,
    public var fileTypeID: List<Guid> = List(1) { Guid() },
)

public data class DeviceDsmNvcacheChangePriorityParameters(
    public var size: UInt = 0u,
    public var targetPriority: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDsmNvcacheChangePriorityParameters) return false
        if (this.size != other.size) return false
        if (this.targetPriority != other.targetPriority) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.targetPriority.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmNvcacheChangePriorityParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmNvcacheChangePriorityParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DeviceDsmNvcacheChangePriorityParameters =
                    DeviceDsmNvcacheChangePriorityParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DeviceDsmNvcacheChangePriorityParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.targetPriority)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.reserved.toList())
                }
            }
    }
}

public data class DeviceDsmOffloadReadParameters(
    public var flags: UInt = 0u,
    public var timeToLive: UInt = 0u,
    public var reserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDsmOffloadReadParameters) return false
        if (this.flags != other.flags) return false
        if (this.timeToLive != other.timeToLive) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.timeToLive.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmOffloadReadParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmOffloadReadParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeviceDsmOffloadReadParameters =
                    DeviceDsmOffloadReadParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: DeviceDsmOffloadReadParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeToLive)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 8L, value.reserved.toList())
                }
            }
    }
}

public data class DeviceDsmOffloadWriteParameters(
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var tokenOffset: ULong = 0uL,
    public var token: StorageOffloadToken = StorageOffloadToken(),
)

public data class DeviceDsmPhysicalAddressesOutput(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var totalNumberOfRanges: UInt = 0u,
    public var numberOfRangesReturned: UInt = 0u,
    public var ranges: List<DeviceStorageAddressRange> = List(1) { DeviceStorageAddressRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmPhysicalAddressesOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmPhysicalAddressesOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DeviceDsmPhysicalAddressesOutput =
                    DeviceDsmPhysicalAddressesOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(DeviceStorageAddressRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DeviceDsmPhysicalAddressesOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.totalNumberOfRanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfRangesReturned)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(DeviceStorageAddressRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.ranges)
                }
            }
    }
}

public data class DeviceDsmRangeErrorInfo(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var totalNumberOfRanges: UInt = 0u,
    public var numberOfRangesReturned: UInt = 0u,
    public var ranges: List<DeviceStorageRangeAttributes> = List(1) { DeviceStorageRangeAttributes() },
)

public data class DeviceDsmReportZonesData(
    public var size: UInt = 0u,
    public var zoneCount: UInt = 0u,
    public var attributes: StorageZonesAttributes = 0,
    public var reserved0: UInt = 0u,
    public var zoneDescriptors: List<StorageZoneDescriptor> = List(1) { StorageZoneDescriptor() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmReportZonesData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmReportZonesData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): DeviceDsmReportZonesData =
                    DeviceDsmReportZonesData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(StorageZoneDescriptor.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DeviceDsmReportZonesData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.zoneCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved0)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(StorageZoneDescriptor.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.zoneDescriptors)
                }
            }
    }
}

public data class DeviceDsmReportZonesParameters(
    public var size: UInt = 0u,
    public var reportOption: UByte = 0u,
    public var partial: UByte = 0u,
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDsmReportZonesParameters) return false
        if (this.size != other.size) return false
        if (this.reportOption != other.reportOption) return false
        if (this.partial != other.partial) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.reportOption.hashCode()
        result = 31 * result + this.partial.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmReportZonesParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDsmReportZonesParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DeviceDsmReportZonesParameters =
                    DeviceDsmReportZonesParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DeviceDsmReportZonesParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.reportOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.partial)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 6L, value.reserved.toList())
                }
            }
    }
}

public data class DeviceDsmTieringQueryInput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var numberOfTierIds: UInt = 0u,
    public var tierIds: List<Guid> = List(1) { Guid() },
)

public data class DeviceDsmTieringQueryOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var alignment: ULong = 0uL,
    public var totalNumberOfRegions: UInt = 0u,
    public var numberOfRegionsReturned: UInt = 0u,
    public var regions: List<StorageTierRegion> = List(1) { StorageTierRegion() },
)

public data class DeviceInternalStatusData(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var t10VendorId: ULong = 0uL,
    public var dataSet1Length: UInt = 0u,
    public var dataSet2Length: UInt = 0u,
    public var dataSet3Length: UInt = 0u,
    public var dataSet4Length: UInt = 0u,
    public var statusDataVersion: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var reasonIdentifier: UByteArray = UByteArray(128),
    public var statusDataLength: UInt = 0u,
    public var statusData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceInternalStatusData) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.t10VendorId != other.t10VendorId) return false
        if (this.dataSet1Length != other.dataSet1Length) return false
        if (this.dataSet2Length != other.dataSet2Length) return false
        if (this.dataSet3Length != other.dataSet3Length) return false
        if (this.dataSet4Length != other.dataSet4Length) return false
        if (this.statusDataVersion != other.statusDataVersion) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.reasonIdentifier.contentEquals(other.reasonIdentifier)) return false
        if (this.statusDataLength != other.statusDataLength) return false
        if (!this.statusData.contentEquals(other.statusData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.t10VendorId.hashCode()
        result = 31 * result + this.dataSet1Length.hashCode()
        result = 31 * result + this.dataSet2Length.hashCode()
        result = 31 * result + this.dataSet3Length.hashCode()
        result = 31 * result + this.dataSet4Length.hashCode()
        result = 31 * result + this.statusDataVersion.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.reasonIdentifier.contentHashCode()
        result = 31 * result + this.statusDataLength.hashCode()
        result = 31 * result + this.statusData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceInternalStatusData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceInternalStatusData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 176L
                override fun readNative(addr: Long): DeviceInternalStatusData =
                    DeviceInternalStatusData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 33L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr + 36L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 168L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DeviceInternalStatusData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.t10VendorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dataSet1Length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataSet2Length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dataSet3Length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dataSet4Length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 32L, value.statusDataVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 33L, value.reserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr + 36L, value.reasonIdentifier.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.statusDataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 168L, value.statusData.toList())
                }
            }
    }
}

public data class DeviceLbProvisioningDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(7),
    public var optimalUnmapGranularity: ULong = 0uL,
    public var unmapGranularityAlignment: ULong = 0uL,
    public var maxUnmapLbaCount: UInt = 0u,
    public var maxUnmapBlockDescriptorCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceLbProvisioningDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.optimalUnmapGranularity != other.optimalUnmapGranularity) return false
        if (this.unmapGranularityAlignment != other.unmapGranularityAlignment) return false
        if (this.maxUnmapLbaCount != other.maxUnmapLbaCount) return false
        if (this.maxUnmapBlockDescriptorCount != other.maxUnmapBlockDescriptorCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.optimalUnmapGranularity.hashCode()
        result = 31 * result + this.unmapGranularityAlignment.hashCode()
        result = 31 * result + this.maxUnmapLbaCount.hashCode()
        result = 31 * result + this.maxUnmapBlockDescriptorCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceLbProvisioningDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceLbProvisioningDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DeviceLbProvisioningDescriptor =
                    DeviceLbProvisioningDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: DeviceLbProvisioningDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                    ).writeNative(addr + 9L, value.reserved1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.optimalUnmapGranularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.unmapGranularityAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.maxUnmapLbaCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maxUnmapBlockDescriptorCount)
                }
            }
    }
}

public data class DeviceLocation(
    public var socket: UInt = 0u,
    public var slot: UInt = 0u,
    public var adapter: UInt = 0u,
    public var port: UInt = 0u,
    public var anonymous: DeviceLocation0 = DeviceLocation0(),
)

public data class DeviceLocation0(
    public var anonymous1: DeviceLocation00 = DeviceLocation00(),
    public var anonymous2: DeviceLocation01 = DeviceLocation01(),
)

public data class DeviceLocation00(
    public var channel: UInt = 0u,
    public var device: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceLocation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceLocation00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DeviceLocation00 =
                    DeviceLocation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DeviceLocation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.channel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.device)
                }
            }
    }
}

public data class DeviceLocation01(
    public var target: UInt = 0u,
    public var lun: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceLocation01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceLocation01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DeviceLocation01 =
                    DeviceLocation01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DeviceLocation01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.target)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lun)
                }
            }
    }
}

public data class DeviceManageDataSetAttributes(
    public var size: UInt = 0u,
    public var action: UInt = 0u,
    public var flags: UInt = 0u,
    public var parameterBlockOffset: UInt = 0u,
    public var parameterBlockLength: UInt = 0u,
    public var dataSetRangesOffset: UInt = 0u,
    public var dataSetRangesLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceManageDataSetAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceManageDataSetAttributes> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): DeviceManageDataSetAttributes =
                    DeviceManageDataSetAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DeviceManageDataSetAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.parameterBlockOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.parameterBlockLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataSetRangesOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dataSetRangesLength)
                }
            }
    }
}

public data class DeviceManageDataSetAttributesOutput(
    public var size: UInt = 0u,
    public var action: UInt = 0u,
    public var flags: UInt = 0u,
    public var operationStatus: UInt = 0u,
    public var extendedError: UInt = 0u,
    public var targetDetailedError: UInt = 0u,
    public var reservedStatus: UInt = 0u,
    public var outputBlockOffset: UInt = 0u,
    public var outputBlockLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceManageDataSetAttributesOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceManageDataSetAttributesOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): DeviceManageDataSetAttributesOutput =
                    DeviceManageDataSetAttributesOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: DeviceManageDataSetAttributesOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.operationStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.extendedError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.targetDetailedError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.reservedStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.outputBlockOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.outputBlockLength)
                }
            }
    }
}

public data class DeviceMediaInfo(
    public var deviceSpecific: DeviceMediaInfo0 = DeviceMediaInfo0(),
)

public data class DeviceMediaInfo0(
    public var diskInfo: DeviceMediaInfo00 = DeviceMediaInfo00(),
    public var removableDiskInfo: DeviceMediaInfo01 = DeviceMediaInfo01(),
    public var tapeInfo: DeviceMediaInfo02 = DeviceMediaInfo02(),
)

public data class DeviceMediaInfo00(
    public var cylinders: Long = 0L,
    public var mediaType: StorageMediaType = 0,
    public var tracksPerCylinder: UInt = 0u,
    public var sectorsPerTrack: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
    public var numberMediaSides: UInt = 0u,
    public var mediaCharacteristics: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceMediaInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceMediaInfo00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DeviceMediaInfo00 =
                    DeviceMediaInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DeviceMediaInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.cylinders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.mediaType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tracksPerCylinder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sectorsPerTrack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bytesPerSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numberMediaSides)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mediaCharacteristics)
                }
            }
    }
}

public data class DeviceMediaInfo01(
    public var cylinders: Long = 0L,
    public var mediaType: StorageMediaType = 0,
    public var tracksPerCylinder: UInt = 0u,
    public var sectorsPerTrack: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
    public var numberMediaSides: UInt = 0u,
    public var mediaCharacteristics: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceMediaInfo01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceMediaInfo01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DeviceMediaInfo01 =
                    DeviceMediaInfo01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DeviceMediaInfo01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.cylinders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.mediaType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tracksPerCylinder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sectorsPerTrack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bytesPerSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numberMediaSides)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mediaCharacteristics)
                }
            }
    }
}

public data class DeviceMediaInfo02(
    public var mediaType: StorageMediaType = 0,
    public var mediaCharacteristics: UInt = 0u,
    public var currentBlockSize: UInt = 0u,
    public var busType: StorageBusType = 0,
    public var busSpecificData: DeviceMediaInfo020 = DeviceMediaInfo020(),
)

public data class DeviceMediaInfo020(
    public var scsiInformation: DeviceMediaInfo0200 = DeviceMediaInfo0200(),
)

public data class DeviceMediaInfo0200(
    public var mediumType: UByte = 0u,
    public var densityCode: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceMediaInfo0200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceMediaInfo0200> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): DeviceMediaInfo0200 =
                    DeviceMediaInfo0200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: DeviceMediaInfo0200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.mediumType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.densityCode)
                }
            }
    }
}

public data class DevicePowerDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceAttentionSupported: Boolean = false,
    public var asynchronousNotificationSupported: Boolean = false,
    public var idlePowerManagementEnabled: Boolean = false,
    public var d3ColdEnabled: Boolean = false,
    public var d3ColdSupported: Boolean = false,
    public var noVerifyDuringIdlePower: Boolean = false,
    public var reserved: UByteArray = UByteArray(2),
    public var idleTimeoutInMS: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicePowerDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.deviceAttentionSupported != other.deviceAttentionSupported) return false
        if (this.asynchronousNotificationSupported != other.asynchronousNotificationSupported) return false
        if (this.idlePowerManagementEnabled != other.idlePowerManagementEnabled) return false
        if (this.d3ColdEnabled != other.d3ColdEnabled) return false
        if (this.d3ColdSupported != other.d3ColdSupported) return false
        if (this.noVerifyDuringIdlePower != other.noVerifyDuringIdlePower) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.idleTimeoutInMS != other.idleTimeoutInMS) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.deviceAttentionSupported.hashCode()
        result = 31 * result + this.asynchronousNotificationSupported.hashCode()
        result = 31 * result + this.idlePowerManagementEnabled.hashCode()
        result = 31 * result + this.d3ColdEnabled.hashCode()
        result = 31 * result + this.d3ColdSupported.hashCode()
        result = 31 * result + this.noVerifyDuringIdlePower.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.idleTimeoutInMS.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicePowerDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevicePowerDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DevicePowerDescriptor =
                    DevicePowerDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 13L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 14L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DevicePowerDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.deviceAttentionSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.asynchronousNotificationSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.idlePowerManagementEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 11L, value.d3ColdEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.d3ColdSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 13L, value.noVerifyDuringIdlePower)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 14L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.idleTimeoutInMS)
                }
            }
    }
}

public data class DeviceSeekPenaltyDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var incursSeekPenalty: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceSeekPenaltyDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceSeekPenaltyDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DeviceSeekPenaltyDescriptor =
                    DeviceSeekPenaltyDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeviceSeekPenaltyDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.incursSeekPenalty)
                }
            }
    }
}

public data class DeviceStorageAddressRange(
    public var startAddress: Long = 0L,
    public var lengthInBytes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceStorageAddressRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceStorageAddressRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeviceStorageAddressRange =
                    DeviceStorageAddressRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeviceStorageAddressRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lengthInBytes)
                }
            }
    }
}

public data class DeviceStorageRangeAttributes(
    public var lengthInBytes: ULong = 0uL,
    public var anonymous: DeviceStorageRangeAttributes0 = DeviceStorageRangeAttributes0(),
    public var reserved: UInt = 0u,
)

public data class DeviceStorageRangeAttributes0(
    public var allFlags: UInt = 0u,
    public var anonymous: DeviceStorageRangeAttributes00 = DeviceStorageRangeAttributes00(),
)

public data class DeviceStorageRangeAttributes00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceStorageRangeAttributes00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceStorageRangeAttributes00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DeviceStorageRangeAttributes00 =
                    DeviceStorageRangeAttributes00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DeviceStorageRangeAttributes00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DeviceTrimDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var trimEnabled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceTrimDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceTrimDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DeviceTrimDescriptor =
                    DeviceTrimDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeviceTrimDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.trimEnabled)
                }
            }
    }
}

public data class DeviceWriteAggregationDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var benefitsFromWriteAggregation: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceWriteAggregationDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceWriteAggregationDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DeviceWriteAggregationDescriptor =
                    DeviceWriteAggregationDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeviceWriteAggregationDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.benefitsFromWriteAggregation)
                }
            }
    }
}

public data class DiskCacheInformation(
    public var parametersSavable: Boolean = false,
    public var readCacheEnabled: Boolean = false,
    public var writeCacheEnabled: Boolean = false,
    public var readRetentionPriority: DiskCacheRetentionPriority = 0,
    public var writeRetentionPriority: DiskCacheRetentionPriority = 0,
    public var disablePrefetchTransferLength: UShort = 0u,
    public var prefetchScalar: Boolean = false,
    public var anonymous: DiskCacheInformation0 = DiskCacheInformation0(),
)

public data class DiskCacheInformation0(
    public var scalarPrefetch: DiskCacheInformation00 = DiskCacheInformation00(),
    public var blockPrefetch: DiskCacheInformation01 = DiskCacheInformation01(),
)

public data class DiskCacheInformation01(
    public var minimum: UShort = 0u,
    public var maximum: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskCacheInformation01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskCacheInformation01> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DiskCacheInformation01 =
                    DiskCacheInformation01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: DiskCacheInformation01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.minimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maximum)
                }
            }
    }
}

public data class DiskCacheInformation00(
    public var minimum: UShort = 0u,
    public var maximum: UShort = 0u,
    public var maximumBlocks: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskCacheInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskCacheInformation00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): DiskCacheInformation00 =
                    DiskCacheInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DiskCacheInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.minimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maximum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.maximumBlocks)
                }
            }
    }
}

public data class DiskControllerNumber(
    public var controllerNumber: UInt = 0u,
    public var diskNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskControllerNumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskControllerNumber> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DiskControllerNumber =
                    DiskControllerNumber(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DiskControllerNumber) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.controllerNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.diskNumber)
                }
            }
    }
}

public data class DiskDetectionInfo(
    public var sizeOfDetectInfo: UInt = 0u,
    public var detectionType: DetectionType = 0,
    public var anonymous: DiskDetectionInfo0 = DiskDetectionInfo0(),
)

public data class DiskDetectionInfo0(
    public var anonymous: DiskDetectionInfo00 = DiskDetectionInfo00(),
)

public data class DiskDetectionInfo00(
    public var int13: DiskInt13Info = DiskInt13Info(),
    public var exInt13: DiskExInt13Info = DiskExInt13Info(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskDetectionInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskDetectionInfo00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): DiskDetectionInfo00 =
                    DiskDetectionInfo00(
                        (DiskInt13Info.typeLayout()).readNative(addr),
                        (DiskExInt13Info.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DiskDetectionInfo00) {
                    (DiskInt13Info.typeLayout()).writeNative(addr, value.int13)
                    (DiskExInt13Info.typeLayout()).writeNative(addr + 16L, value.exInt13)
                }
            }
    }
}

public data class DiskExtent(
    public var diskNumber: UInt = 0u,
    public var startingOffset: Long = 0L,
    public var extentLength: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskExtent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskExtent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DiskExtent =
                    DiskExtent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DiskExtent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.diskNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.startingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.extentLength)
                }
            }
    }
}

public data class DiskExInt13Info(
    public var exBufferSize: UShort = 0u,
    public var exFlags: UShort = 0u,
    public var exCylinders: UInt = 0u,
    public var exHeads: UInt = 0u,
    public var exSectorsPerTrack: UInt = 0u,
    public var exSectorsPerDrive: ULong = 0uL,
    public var exSectorSize: UShort = 0u,
    public var exReserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskExInt13Info> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskExInt13Info> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DiskExInt13Info =
                    DiskExInt13Info(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                    )
                override fun writeNative(addr: Long, value: DiskExInt13Info) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.exBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.exFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.exCylinders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.exHeads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.exSectorsPerTrack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.exSectorsPerDrive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.exSectorSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.exReserved)
                }
            }
    }
}

public data class DiskGeometry(
    public var cylinders: Long = 0L,
    public var mediaType: MediaType = 0,
    public var tracksPerCylinder: UInt = 0u,
    public var sectorsPerTrack: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskGeometry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskGeometry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DiskGeometry =
                    DiskGeometry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DiskGeometry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.cylinders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.mediaType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tracksPerCylinder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sectorsPerTrack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bytesPerSector)
                }
            }
    }
}

public data class DiskGeometryEx(
    public var geometry: DiskGeometry = DiskGeometry(),
    public var diskSize: Long = 0L,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiskGeometryEx) return false
        if (this.geometry != other.geometry) return false
        if (this.diskSize != other.diskSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.geometry.hashCode()
        result = 31 * result + this.diskSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskGeometryEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskGeometryEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DiskGeometryEx =
                    DiskGeometryEx(
                        (DiskGeometry.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DiskGeometryEx) {
                    (DiskGeometry.typeLayout()).writeNative(addr, value.geometry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.diskSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 32L, value.data.toList())
                }
            }
    }
}

public data class DiskGrowPartition(
    public var partitionNumber: UInt = 0u,
    public var bytesToGrow: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskGrowPartition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskGrowPartition> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DiskGrowPartition =
                    DiskGrowPartition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DiskGrowPartition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.partitionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.bytesToGrow)
                }
            }
    }
}

public class DiskHistogram internal constructor(
    public var diskSize: Long,
    public var start: Long,
    public var end: Long,
    public var average: Long,
    public var averageRead: Long,
    public var averageWrite: Long,
    public var granularity: UInt,
    public var size: UInt,
    public var readCount: UInt,
    public var writeCount: UInt,
    histogramCtorArg: MutPtr<HistogramBucket>,
) {
    public var histogram: MutPtr<HistogramBucket> = histogramCtorArg
        internal set

    public constructor() : this(
        diskSize = 0L,
        start = 0L,
        end = 0L,
        average = 0L,
        averageRead = 0L,
        averageWrite = 0L,
        granularity = 0u,
        size = 0u,
        readCount = 0u,
        writeCount = 0u,
        histogramCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.diskSize

    public operator fun component2(): Long = this.start

    public operator fun component3(): Long = this.end

    public operator fun component4(): Long = this.average

    public operator fun component5(): Long = this.averageRead

    public operator fun component6(): Long = this.averageWrite

    public operator fun component7(): UInt = this.granularity

    public operator fun component8(): UInt = this.size

    public operator fun component9(): UInt = this.readCount

    public operator fun component10(): UInt = this.writeCount

    public operator fun component11(): MutPtr<HistogramBucket> = this.histogram

    public fun copy(diskSize: Long = this.diskSize, start: Long = this.start, end: Long = this.end, average: Long = this.average, averageRead: Long = this.averageRead, averageWrite: Long = this.averageWrite, granularity: UInt = this.granularity, size: UInt = this.size, readCount: UInt = this.readCount, writeCount: UInt = this.writeCount, histogram: MutPtr<HistogramBucket> = this.histogram): DiskHistogram = DiskHistogram(diskSize = diskSize, start = start, end = end, average = average, averageRead = averageRead, averageWrite = averageWrite, granularity = granularity, size = size, readCount = readCount, writeCount = writeCount, histogramCtorArg = histogram)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiskHistogram) return false
        if (this.diskSize != other.diskSize) return false
        if (this.start != other.start) return false
        if (this.end != other.end) return false
        if (this.average != other.average) return false
        if (this.averageRead != other.averageRead) return false
        if (this.averageWrite != other.averageWrite) return false
        if (this.granularity != other.granularity) return false
        if (this.size != other.size) return false
        if (this.readCount != other.readCount) return false
        if (this.writeCount != other.writeCount) return false
        if (this.histogram != other.histogram) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.diskSize.hashCode()
        result = 31 * result + this.start.hashCode()
        result = 31 * result + this.end.hashCode()
        result = 31 * result + this.average.hashCode()
        result = 31 * result + this.averageRead.hashCode()
        result = 31 * result + this.averageWrite.hashCode()
        result = 31 * result + this.granularity.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.readCount.hashCode()
        result = 31 * result + this.writeCount.hashCode()
        result = 31 * result + this.histogram.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskHistogram> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskHistogram> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): DiskHistogram =
                    DiskHistogram(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<HistogramBucket>(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: DiskHistogram) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.diskSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.end)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.average)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.averageRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.averageWrite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.granularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.readCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.writeCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<HistogramBucket>(64)
                    ).writeNative(addr + 64L, value.histogram)
                }
            }

        public operator fun invoke(
            diskSize: Long = 0L,
            start: Long = 0L,
            end: Long = 0L,
            average: Long = 0L,
            averageRead: Long = 0L,
            averageWrite: Long = 0L,
            granularity: UInt = 0u,
            size: UInt = 0u,
            readCount: UInt = 0u,
            writeCount: UInt = 0u,
            histogram: MutPtr<HistogramBucket> = MutPtr(0L),
        ): DiskHistogram =
            DiskHistogram(
                diskSize = diskSize,
                start = start,
                end = end,
                average = average,
                averageRead = averageRead,
                averageWrite = averageWrite,
                granularity = granularity,
                size = size,
                readCount = readCount,
                writeCount = writeCount,
                histogramCtorArg = histogram,
            )
    }
}

public data class DiskInt13Info(
    public var driveSelect: UShort = 0u,
    public var maxCylinders: UInt = 0u,
    public var sectorsPerTrack: UShort = 0u,
    public var maxHeads: UShort = 0u,
    public var numberDrives: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskInt13Info> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskInt13Info> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DiskInt13Info =
                    DiskInt13Info(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DiskInt13Info) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.driveSelect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxCylinders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.sectorsPerTrack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.maxHeads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.numberDrives)
                }
            }
    }
}

public class DiskLogging internal constructor(
    public var function: UByte,
    bufferAddressCtorArg: MutPtr<CVoid>,
    public var bufferSize: UInt,
) {
    public var bufferAddress: MutPtr<CVoid> = bufferAddressCtorArg
        internal set

    public constructor() : this(
        function = 0u,
        bufferAddressCtorArg = MutPtr(0L),
        bufferSize = 0u,
    )

    public operator fun component1(): UByte = this.function

    public operator fun component2(): MutPtr<CVoid> = this.bufferAddress

    public operator fun component3(): UInt = this.bufferSize

    public fun copy(function: UByte = this.function, bufferAddress: MutPtr<CVoid> = this.bufferAddress, bufferSize: UInt = this.bufferSize): DiskLogging = DiskLogging(function = function, bufferAddressCtorArg = bufferAddress, bufferSize = bufferSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiskLogging) return false
        if (this.function != other.function) return false
        if (this.bufferAddress != other.bufferAddress) return false
        if (this.bufferSize != other.bufferSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.function.hashCode()
        result = 31 * result + this.bufferAddress.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskLogging> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskLogging> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DiskLogging =
                    DiskLogging(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DiskLogging) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.function)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.bufferAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bufferSize)
                }
            }

        public operator fun invoke(
            function: UByte = 0u,
            bufferAddress: MutPtr<CVoid> = MutPtr(0L),
            bufferSize: UInt = 0u,
        ): DiskLogging =
            DiskLogging(
                function = function,
                bufferAddressCtorArg = bufferAddress,
                bufferSize = bufferSize,
            )
    }
}

public data class DiskPartitionInfo(
    public var sizeOfPartitionInfo: UInt = 0u,
    public var partitionStyle: PartitionStyle = 0,
    public var anonymous: DiskPartitionInfo0 = DiskPartitionInfo0(),
)

public data class DiskPartitionInfo0(
    public var mbr: DiskPartitionInfo00 = DiskPartitionInfo00(),
    public var gpt: DiskPartitionInfo01 = DiskPartitionInfo01(),
)

public data class DiskPartitionInfo01(
    public var diskId: Guid = Guid(),
)

public data class DiskPartitionInfo00(
    public var signature: UInt = 0u,
    public var checkSum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskPartitionInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskPartitionInfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DiskPartitionInfo00 =
                    DiskPartitionInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DiskPartitionInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.checkSum)
                }
            }
    }
}

public data class DiskPerformance(
    public var bytesRead: Long = 0L,
    public var bytesWritten: Long = 0L,
    public var readTime: Long = 0L,
    public var writeTime: Long = 0L,
    public var idleTime: Long = 0L,
    public var readCount: UInt = 0u,
    public var writeCount: UInt = 0u,
    public var queueDepth: UInt = 0u,
    public var splitCount: UInt = 0u,
    public var queryTime: Long = 0L,
    public var storageDeviceNumber: UInt = 0u,
    public var storageManagerName: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiskPerformance) return false
        if (this.bytesRead != other.bytesRead) return false
        if (this.bytesWritten != other.bytesWritten) return false
        if (this.readTime != other.readTime) return false
        if (this.writeTime != other.writeTime) return false
        if (this.idleTime != other.idleTime) return false
        if (this.readCount != other.readCount) return false
        if (this.writeCount != other.writeCount) return false
        if (this.queueDepth != other.queueDepth) return false
        if (this.splitCount != other.splitCount) return false
        if (this.queryTime != other.queryTime) return false
        if (this.storageDeviceNumber != other.storageDeviceNumber) return false
        if (!this.storageManagerName.contentEquals(other.storageManagerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bytesRead.hashCode()
        result = 31 * result + this.bytesWritten.hashCode()
        result = 31 * result + this.readTime.hashCode()
        result = 31 * result + this.writeTime.hashCode()
        result = 31 * result + this.idleTime.hashCode()
        result = 31 * result + this.readCount.hashCode()
        result = 31 * result + this.writeCount.hashCode()
        result = 31 * result + this.queueDepth.hashCode()
        result = 31 * result + this.splitCount.hashCode()
        result = 31 * result + this.queryTime.hashCode()
        result = 31 * result + this.storageDeviceNumber.hashCode()
        result = 31 * result + this.storageManagerName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskPerformance> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskPerformance> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): DiskPerformance =
                    DiskPerformance(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                        ).readNative(addr + 68L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: DiskPerformance) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.bytesRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.bytesWritten)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.readTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.writeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.idleTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.readCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.writeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.queueDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.splitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.queryTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.storageDeviceNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                    ).writeNative(addr + 68L, value.storageManagerName.toList())
                }
            }
    }
}

public class DiskRecord internal constructor(
    public var byteOffset: Long,
    public var startTime: Long,
    public var endTime: Long,
    virtualAddressCtorArg: MutPtr<CVoid>,
    public var numberOfBytes: UInt,
    public var deviceNumber: UByte,
    public var readRequest: Boolean,
) {
    public var virtualAddress: MutPtr<CVoid> = virtualAddressCtorArg
        internal set

    public constructor() : this(
        byteOffset = 0L,
        startTime = 0L,
        endTime = 0L,
        virtualAddressCtorArg = MutPtr(0L),
        numberOfBytes = 0u,
        deviceNumber = 0u,
        readRequest = false,
    )

    public operator fun component1(): Long = this.byteOffset

    public operator fun component2(): Long = this.startTime

    public operator fun component3(): Long = this.endTime

    public operator fun component4(): MutPtr<CVoid> = this.virtualAddress

    public operator fun component5(): UInt = this.numberOfBytes

    public operator fun component6(): UByte = this.deviceNumber

    public operator fun component7(): Boolean = this.readRequest

    public fun copy(byteOffset: Long = this.byteOffset, startTime: Long = this.startTime, endTime: Long = this.endTime, virtualAddress: MutPtr<CVoid> = this.virtualAddress, numberOfBytes: UInt = this.numberOfBytes, deviceNumber: UByte = this.deviceNumber, readRequest: Boolean = this.readRequest): DiskRecord = DiskRecord(byteOffset = byteOffset, startTime = startTime, endTime = endTime, virtualAddressCtorArg = virtualAddress, numberOfBytes = numberOfBytes, deviceNumber = deviceNumber, readRequest = readRequest)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiskRecord) return false
        if (this.byteOffset != other.byteOffset) return false
        if (this.startTime != other.startTime) return false
        if (this.endTime != other.endTime) return false
        if (this.virtualAddress != other.virtualAddress) return false
        if (this.numberOfBytes != other.numberOfBytes) return false
        if (this.deviceNumber != other.deviceNumber) return false
        if (this.readRequest != other.readRequest) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byteOffset.hashCode()
        result = 31 * result + this.startTime.hashCode()
        result = 31 * result + this.endTime.hashCode()
        result = 31 * result + this.virtualAddress.hashCode()
        result = 31 * result + this.numberOfBytes.hashCode()
        result = 31 * result + this.deviceNumber.hashCode()
        result = 31 * result + this.readRequest.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskRecord> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DiskRecord =
                    DiskRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 37L),
                    )
                override fun writeNative(addr: Long, value: DiskRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.byteOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.startTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.endTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.virtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.numberOfBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 36L, value.deviceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 37L, value.readRequest)
                }
            }

        public operator fun invoke(
            byteOffset: Long = 0L,
            startTime: Long = 0L,
            endTime: Long = 0L,
            virtualAddress: MutPtr<CVoid> = MutPtr(0L),
            numberOfBytes: UInt = 0u,
            deviceNumber: UByte = 0u,
            readRequest: Boolean = false,
        ): DiskRecord =
            DiskRecord(
                byteOffset = byteOffset,
                startTime = startTime,
                endTime = endTime,
                virtualAddressCtorArg = virtualAddress,
                numberOfBytes = numberOfBytes,
                deviceNumber = deviceNumber,
                readRequest = readRequest,
            )
    }
}

public data class Driverstatus(
    public var bDriverError: UByte = 0u,
    public var bIDEError: UByte = 0u,
    public var bReserved: UByteArray = UByteArray(2),
    public var dwReserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Driverstatus) return false
        if (this.bDriverError != other.bDriverError) return false
        if (this.bIDEError != other.bIDEError) return false
        if (!this.bReserved.contentEquals(other.bReserved)) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bDriverError.hashCode()
        result = 31 * result + this.bIDEError.hashCode()
        result = 31 * result + this.bReserved.contentHashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Driverstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Driverstatus> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Driverstatus =
                    Driverstatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Driverstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bDriverError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bIDEError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.bReserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 4L, value.dwReserved.toList())
                }
            }
    }
}

public data class DriveLayoutInformation(
    public var partitionCount: UInt = 0u,
    public var signature: UInt = 0u,
    public var partitionEntry: List<PartitionInformation> = List(1) { PartitionInformation() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriveLayoutInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriveLayoutInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DriveLayoutInformation =
                    DriveLayoutInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PartitionInformation.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DriveLayoutInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.partitionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.signature)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PartitionInformation.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.partitionEntry)
                }
            }
    }
}

public data class DriveLayoutInformationEx(
    public var partitionStyle: UInt = 0u,
    public var partitionCount: UInt = 0u,
    public var anonymous: DriveLayoutInformationEx0 = DriveLayoutInformationEx0(),
    public var partitionEntry: List<PartitionInformationEx> = List(1) { PartitionInformationEx() },
)

public data class DriveLayoutInformationEx0(
    public var mbr: DriveLayoutInformationMbr = DriveLayoutInformationMbr(),
    public var gpt: DriveLayoutInformationGpt = DriveLayoutInformationGpt(),
)

public data class DriveLayoutInformationGpt(
    public var diskId: Guid = Guid(),
    public var startingUsableOffset: Long = 0L,
    public var usableLength: Long = 0L,
    public var maxPartitionCount: UInt = 0u,
)

public data class DriveLayoutInformationMbr(
    public var signature: UInt = 0u,
    public var checkSum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriveLayoutInformationMbr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriveLayoutInformationMbr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DriveLayoutInformationMbr =
                    DriveLayoutInformationMbr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DriveLayoutInformationMbr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.checkSum)
                }
            }
    }
}

public class DuplicateExtentsData internal constructor(
    fileHandleCtorArg: Handle,
    public var sourceFileOffset: Long,
    public var targetFileOffset: Long,
    public var byteCount: Long,
) {
    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public constructor() : this(
        fileHandleCtorArg = MutPtr(0L),
        sourceFileOffset = 0L,
        targetFileOffset = 0L,
        byteCount = 0L,
    )

    public operator fun component1(): Handle = this.fileHandle

    public operator fun component2(): Long = this.sourceFileOffset

    public operator fun component3(): Long = this.targetFileOffset

    public operator fun component4(): Long = this.byteCount

    public fun copy(fileHandle: Handle = this.fileHandle, sourceFileOffset: Long = this.sourceFileOffset, targetFileOffset: Long = this.targetFileOffset, byteCount: Long = this.byteCount): DuplicateExtentsData = DuplicateExtentsData(fileHandleCtorArg = fileHandle, sourceFileOffset = sourceFileOffset, targetFileOffset = targetFileOffset, byteCount = byteCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DuplicateExtentsData) return false
        if (this.fileHandle != other.fileHandle) return false
        if (this.sourceFileOffset != other.sourceFileOffset) return false
        if (this.targetFileOffset != other.targetFileOffset) return false
        if (this.byteCount != other.byteCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileHandle.hashCode()
        result = 31 * result + this.sourceFileOffset.hashCode()
        result = 31 * result + this.targetFileOffset.hashCode()
        result = 31 * result + this.byteCount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fileHandle: Handle = MutPtr(0L),
            sourceFileOffset: Long = 0L,
            targetFileOffset: Long = 0L,
            byteCount: Long = 0L,
        ): DuplicateExtentsData =
            DuplicateExtentsData(
                fileHandleCtorArg = fileHandle,
                sourceFileOffset = sourceFileOffset,
                targetFileOffset = targetFileOffset,
                byteCount = byteCount,
            )
    }
}

public data class DuplicateExtentsData32(
    public var fileHandle: UInt = 0u,
    public var sourceFileOffset: Long = 0L,
    public var targetFileOffset: Long = 0L,
    public var byteCount: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DuplicateExtentsData32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DuplicateExtentsData32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DuplicateExtentsData32 =
                    DuplicateExtentsData32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DuplicateExtentsData32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.sourceFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.targetFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.byteCount)
                }
            }
    }
}

public class DuplicateExtentsDataEx internal constructor(
    public var size: Int,
    fileHandleCtorArg: Handle,
    public var sourceFileOffset: Long,
    public var targetFileOffset: Long,
    public var byteCount: Long,
    public var flags: UInt,
) {
    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public constructor() : this(
        size = 0,
        fileHandleCtorArg = MutPtr(0L),
        sourceFileOffset = 0L,
        targetFileOffset = 0L,
        byteCount = 0L,
        flags = 0u,
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): Handle = this.fileHandle

    public operator fun component3(): Long = this.sourceFileOffset

    public operator fun component4(): Long = this.targetFileOffset

    public operator fun component5(): Long = this.byteCount

    public operator fun component6(): UInt = this.flags

    public fun copy(size: Int = this.size, fileHandle: Handle = this.fileHandle, sourceFileOffset: Long = this.sourceFileOffset, targetFileOffset: Long = this.targetFileOffset, byteCount: Long = this.byteCount, flags: UInt = this.flags): DuplicateExtentsDataEx = DuplicateExtentsDataEx(size = size, fileHandleCtorArg = fileHandle, sourceFileOffset = sourceFileOffset, targetFileOffset = targetFileOffset, byteCount = byteCount, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DuplicateExtentsDataEx) return false
        if (this.size != other.size) return false
        if (this.fileHandle != other.fileHandle) return false
        if (this.sourceFileOffset != other.sourceFileOffset) return false
        if (this.targetFileOffset != other.targetFileOffset) return false
        if (this.byteCount != other.byteCount) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.fileHandle.hashCode()
        result = 31 * result + this.sourceFileOffset.hashCode()
        result = 31 * result + this.targetFileOffset.hashCode()
        result = 31 * result + this.byteCount.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            fileHandle: Handle = MutPtr(0L),
            sourceFileOffset: Long = 0L,
            targetFileOffset: Long = 0L,
            byteCount: Long = 0L,
            flags: UInt = 0u,
        ): DuplicateExtentsDataEx =
            DuplicateExtentsDataEx(
                size = size,
                fileHandleCtorArg = fileHandle,
                sourceFileOffset = sourceFileOffset,
                targetFileOffset = targetFileOffset,
                byteCount = byteCount,
                flags = flags,
            )
    }
}

public data class DuplicateExtentsDataEx32(
    public var size: UInt = 0u,
    public var fileHandle: UInt = 0u,
    public var sourceFileOffset: Long = 0L,
    public var targetFileOffset: Long = 0L,
    public var byteCount: Long = 0L,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DuplicateExtentsDataEx32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DuplicateExtentsDataEx32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DuplicateExtentsDataEx32 =
                    DuplicateExtentsDataEx32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: DuplicateExtentsDataEx32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.sourceFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.targetFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.byteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.flags)
                }
            }
    }
}

public data class EncryptedDataInfo(
    public var startingFileOffset: ULong = 0uL,
    public var outputBufferOffset: UInt = 0u,
    public var bytesWithinFileSize: UInt = 0u,
    public var bytesWithinValidDataLength: UInt = 0u,
    public var compressionFormat: UShort = 0u,
    public var dataUnitShift: UByte = 0u,
    public var chunkShift: UByte = 0u,
    public var clusterShift: UByte = 0u,
    public var encryptionFormat: UByte = 0u,
    public var numberOfDataBlocks: UShort = 0u,
    public var dataBlockSize: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptedDataInfo) return false
        if (this.startingFileOffset != other.startingFileOffset) return false
        if (this.outputBufferOffset != other.outputBufferOffset) return false
        if (this.bytesWithinFileSize != other.bytesWithinFileSize) return false
        if (this.bytesWithinValidDataLength != other.bytesWithinValidDataLength) return false
        if (this.compressionFormat != other.compressionFormat) return false
        if (this.dataUnitShift != other.dataUnitShift) return false
        if (this.chunkShift != other.chunkShift) return false
        if (this.clusterShift != other.clusterShift) return false
        if (this.encryptionFormat != other.encryptionFormat) return false
        if (this.numberOfDataBlocks != other.numberOfDataBlocks) return false
        if (!this.dataBlockSize.contentEquals(other.dataBlockSize)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startingFileOffset.hashCode()
        result = 31 * result + this.outputBufferOffset.hashCode()
        result = 31 * result + this.bytesWithinFileSize.hashCode()
        result = 31 * result + this.bytesWithinValidDataLength.hashCode()
        result = 31 * result + this.compressionFormat.hashCode()
        result = 31 * result + this.dataUnitShift.hashCode()
        result = 31 * result + this.chunkShift.hashCode()
        result = 31 * result + this.clusterShift.hashCode()
        result = 31 * result + this.encryptionFormat.hashCode()
        result = 31 * result + this.numberOfDataBlocks.hashCode()
        result = 31 * result + this.dataBlockSize.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptedDataInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptedDataInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): EncryptedDataInfo =
                    EncryptedDataInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 23L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 28L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: EncryptedDataInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startingFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.outputBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bytesWithinFileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bytesWithinValidDataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.compressionFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.dataUnitShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 23L, value.chunkShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.clusterShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.encryptionFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.numberOfDataBlocks)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 28L, value.dataBlockSize.toList())
                }
            }
    }
}

public data class EncryptionBuffer(
    public var encryptionOperation: UInt = 0u,
    public var private: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptionBuffer) return false
        if (this.encryptionOperation != other.encryptionOperation) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.encryptionOperation.hashCode()
        result = 31 * result + this.private.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): EncryptionBuffer =
                    EncryptionBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: EncryptionBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encryptionOperation)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.private.toList())
                }
            }
    }
}

public data class EncryptionKeyCtrlInput(
    public var headerSize: UInt = 0u,
    public var structureSize: UInt = 0u,
    public var keyOffset: UShort = 0u,
    public var keySize: UShort = 0u,
    public var dplLock: UInt = 0u,
    public var dplUserId: ULong = 0uL,
    public var dplCredentialId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionKeyCtrlInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionKeyCtrlInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): EncryptionKeyCtrlInput =
                    EncryptionKeyCtrlInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: EncryptionKeyCtrlInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.headerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.structureSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.keyOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.keySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dplLock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.dplUserId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.dplCredentialId)
                }
            }
    }
}

public data class ExfatStatistics(
    public var createHits: UInt = 0u,
    public var successfulCreates: UInt = 0u,
    public var failedCreates: UInt = 0u,
    public var nonCachedReads: UInt = 0u,
    public var nonCachedReadBytes: UInt = 0u,
    public var nonCachedWrites: UInt = 0u,
    public var nonCachedWriteBytes: UInt = 0u,
    public var nonCachedDiskReads: UInt = 0u,
    public var nonCachedDiskWrites: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExfatStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExfatStatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): ExfatStatistics =
                    ExfatStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: ExfatStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.createHits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.successfulCreates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.failedCreates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nonCachedReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nonCachedReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nonCachedWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.nonCachedWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.nonCachedDiskReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.nonCachedDiskWrites)
                }
            }
    }
}

public data class ExtendedEncryptedDataInfo(
    public var extendedCode: UInt = 0u,
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtendedEncryptedDataInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtendedEncryptedDataInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ExtendedEncryptedDataInfo =
                    ExtendedEncryptedDataInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ExtendedEncryptedDataInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extendedCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class FatStatistics(
    public var createHits: UInt = 0u,
    public var successfulCreates: UInt = 0u,
    public var failedCreates: UInt = 0u,
    public var nonCachedReads: UInt = 0u,
    public var nonCachedReadBytes: UInt = 0u,
    public var nonCachedWrites: UInt = 0u,
    public var nonCachedWriteBytes: UInt = 0u,
    public var nonCachedDiskReads: UInt = 0u,
    public var nonCachedDiskWrites: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FatStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FatStatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): FatStatistics =
                    FatStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FatStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.createHits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.successfulCreates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.failedCreates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nonCachedReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nonCachedReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nonCachedWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.nonCachedWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.nonCachedDiskReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.nonCachedDiskWrites)
                }
            }
    }
}

public data class FilesystemStatistics(
    public var fileSystemType: FilesystemStatisticsType = 0u,
    public var version: UShort = 0u,
    public var sizeOfCompleteStructure: UInt = 0u,
    public var userFileReads: UInt = 0u,
    public var userFileReadBytes: UInt = 0u,
    public var userDiskReads: UInt = 0u,
    public var userFileWrites: UInt = 0u,
    public var userFileWriteBytes: UInt = 0u,
    public var userDiskWrites: UInt = 0u,
    public var metaDataReads: UInt = 0u,
    public var metaDataReadBytes: UInt = 0u,
    public var metaDataDiskReads: UInt = 0u,
    public var metaDataWrites: UInt = 0u,
    public var metaDataWriteBytes: UInt = 0u,
    public var metaDataDiskWrites: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilesystemStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilesystemStatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): FilesystemStatistics =
                    FilesystemStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: FilesystemStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.fileSystemType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfCompleteStructure)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.userFileReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.userFileReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.userDiskReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.userFileWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.userFileWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.userDiskWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.metaDataReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.metaDataReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.metaDataDiskReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.metaDataWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.metaDataWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.metaDataDiskWrites)
                }
            }
    }
}

public data class FilesystemStatisticsEx(
    public var fileSystemType: FilesystemStatisticsType = 0u,
    public var version: UShort = 0u,
    public var sizeOfCompleteStructure: UInt = 0u,
    public var userFileReads: ULong = 0uL,
    public var userFileReadBytes: ULong = 0uL,
    public var userDiskReads: ULong = 0uL,
    public var userFileWrites: ULong = 0uL,
    public var userFileWriteBytes: ULong = 0uL,
    public var userDiskWrites: ULong = 0uL,
    public var metaDataReads: ULong = 0uL,
    public var metaDataReadBytes: ULong = 0uL,
    public var metaDataDiskReads: ULong = 0uL,
    public var metaDataWrites: ULong = 0uL,
    public var metaDataWriteBytes: ULong = 0uL,
    public var metaDataDiskWrites: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilesystemStatisticsEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilesystemStatisticsEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): FilesystemStatisticsEx =
                    FilesystemStatisticsEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: FilesystemStatisticsEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.fileSystemType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfCompleteStructure)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.userFileReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.userFileReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.userDiskReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.userFileWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.userFileWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.userDiskWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.metaDataReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.metaDataReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.metaDataDiskReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.metaDataWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.metaDataWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.metaDataDiskWrites)
                }
            }
    }
}

public data class FileAllocatedRangeBuffer(
    public var fileOffset: Long = 0L,
    public var length: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAllocatedRangeBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAllocatedRangeBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FileAllocatedRangeBuffer =
                    FileAllocatedRangeBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileAllocatedRangeBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class FileDesiredStorageClassInformation(
    public var cls: FileStorageTierClass = 0,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDesiredStorageClassInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDesiredStorageClassInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FileDesiredStorageClassInformation =
                    FileDesiredStorageClassInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileDesiredStorageClassInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class FileFsPersistentVolumeInformation(
    public var volumeFlags: UInt = 0u,
    public var flagMask: UInt = 0u,
    public var version: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsPersistentVolumeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsPersistentVolumeInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FileFsPersistentVolumeInformation =
                    FileFsPersistentVolumeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FileFsPersistentVolumeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.volumeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flagMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class FileInitiateRepairOutputBuffer(
    public var hint1: ULong = 0uL,
    public var hint2: ULong = 0uL,
    public var clsn: ULong = 0uL,
    public var status: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileInitiateRepairOutputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileInitiateRepairOutputBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): FileInitiateRepairOutputBuffer =
                    FileInitiateRepairOutputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FileInitiateRepairOutputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.hint1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.hint2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.clsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.status)
                }
            }
    }
}

public data class FileLayoutEntry(
    public var version: UInt = 0u,
    public var nextFileOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileAttributes: UInt = 0u,
    public var fileReferenceNumber: ULong = 0uL,
    public var firstNameOffset: UInt = 0u,
    public var firstStreamOffset: UInt = 0u,
    public var extraInfoOffset: UInt = 0u,
    public var extraInfoLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLayoutEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLayoutEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): FileLayoutEntry =
                    FileLayoutEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: FileLayoutEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nextFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.firstNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.firstStreamOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.extraInfoOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.extraInfoLength)
                }
            }
    }
}

public data class FileLayoutInfoEntry(
    public var basicInformation: FileLayoutInfoEntry0 = FileLayoutInfoEntry0(),
    public var ownerId: UInt = 0u,
    public var securityId: UInt = 0u,
    public var usn: Long = 0L,
    public var storageReserveId: StorageReserveId = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLayoutInfoEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLayoutInfoEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): FileLayoutInfoEntry =
                    FileLayoutInfoEntry(
                        (FileLayoutInfoEntry0.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: FileLayoutInfoEntry) {
                    (FileLayoutInfoEntry0.typeLayout()).writeNative(addr, value.basicInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ownerId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.securityId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.usn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.storageReserveId)
                }
            }
    }
}

public data class FileLayoutInfoEntry0(
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var fileAttributes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLayoutInfoEntry0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLayoutInfoEntry0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): FileLayoutInfoEntry0 =
                    FileLayoutInfoEntry0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FileLayoutInfoEntry0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.fileAttributes)
                }
            }
    }
}

public data class FileLayoutNameEntry(
    public var nextNameOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var parentFileReferenceNumber: ULong = 0uL,
    public var fileNameLength: UInt = 0u,
    public var reserved: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLayoutNameEntry) return false
        if (this.nextNameOffset != other.nextNameOffset) return false
        if (this.flags != other.flags) return false
        if (this.parentFileReferenceNumber != other.parentFileReferenceNumber) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.reserved != other.reserved) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextNameOffset.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.parentFileReferenceNumber.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLayoutNameEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLayoutNameEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): FileLayoutNameEntry =
                    FileLayoutNameEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: FileLayoutNameEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.parentFileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 24L, value.fileName.toList())
                }
            }
    }
}

public data class FileLevelTrim(
    public var key: UInt = 0u,
    public var numRanges: UInt = 0u,
    public var ranges: List<FileLevelTrimRange> = List(1) { FileLevelTrimRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLevelTrim> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLevelTrim> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FileLevelTrim =
                    FileLevelTrim(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(FileLevelTrimRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileLevelTrim) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numRanges)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(FileLevelTrimRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.ranges)
                }
            }
    }
}

public data class FileLevelTrimOutput(
    public var numRangesProcessed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLevelTrimOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLevelTrimOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FileLevelTrimOutput =
                    FileLevelTrimOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileLevelTrimOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numRangesProcessed)
                }
            }
    }
}

public data class FileLevelTrimRange(
    public var offset: ULong = 0uL,
    public var length: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLevelTrimRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLevelTrimRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FileLevelTrimRange =
                    FileLevelTrimRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileLevelTrimRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class FileMakeCompatibleBuffer(
    public var closeDisc: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileMakeCompatibleBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileMakeCompatibleBuffer> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): FileMakeCompatibleBuffer =
                    FileMakeCompatibleBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileMakeCompatibleBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.closeDisc)
                }
            }
    }
}

public data class FileObjectidBuffer(
    public var objectId: UByteArray = UByteArray(16),
    public var anonymous: FileObjectidBuffer0 = FileObjectidBuffer0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidBuffer) return false
        if (!this.objectId.contentEquals(other.objectId)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectId.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class FileObjectidBuffer0(
    public var anonymous: FileObjectidBuffer00 = FileObjectidBuffer00(),
    public var extendedInfo: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidBuffer0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.extendedInfo.contentEquals(other.extendedInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.extendedInfo.contentHashCode()
        return result
    }
}

public data class FileObjectidBuffer00(
    public var birthVolumeId: UByteArray = UByteArray(16),
    public var birthObjectId: UByteArray = UByteArray(16),
    public var domainId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidBuffer00) return false
        if (!this.birthVolumeId.contentEquals(other.birthVolumeId)) return false
        if (!this.birthObjectId.contentEquals(other.birthObjectId)) return false
        if (!this.domainId.contentEquals(other.domainId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.birthVolumeId.contentHashCode()
        result = 31 * result + this.birthObjectId.contentHashCode()
        result = 31 * result + this.domainId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileObjectidBuffer00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileObjectidBuffer00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): FileObjectidBuffer00 =
                    FileObjectidBuffer00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FileObjectidBuffer00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.birthVolumeId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.birthObjectId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 32L, value.domainId.toList())
                }
            }
    }
}

public data class FilePrefetch(
    public var type: UInt = 0u,
    public var count: UInt = 0u,
    public var prefetch: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePrefetch) return false
        if (this.type != other.type) return false
        if (this.count != other.count) return false
        if (!this.prefetch.contentEquals(other.prefetch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.prefetch.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePrefetch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePrefetch> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FilePrefetch =
                    FilePrefetch(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: FilePrefetch) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                    ).writeNative(addr + 8L, value.prefetch.toList())
                }
            }
    }
}

public class FilePrefetchEx internal constructor(
    public var type: UInt,
    public var count: UInt,
    contextCtorArg: MutPtr<CVoid>,
    public var prefetch: ULongArray,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        count = 0u,
        contextCtorArg = MutPtr(0L),
        prefetch = ULongArray(1),
    )

    public operator fun component1(): UInt = this.type

    public operator fun component2(): UInt = this.count

    public operator fun component3(): MutPtr<CVoid> = this.context

    public operator fun component4(): ULongArray = this.prefetch

    public fun copy(type: UInt = this.type, count: UInt = this.count, context: MutPtr<CVoid> = this.context, prefetch: ULongArray = this.prefetch): FilePrefetchEx = FilePrefetchEx(type = type, count = count, contextCtorArg = context, prefetch = prefetch)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePrefetchEx) return false
        if (this.type != other.type) return false
        if (this.count != other.count) return false
        if (this.context != other.context) return false
        if (!this.prefetch.contentEquals(other.prefetch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.prefetch.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePrefetchEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePrefetchEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FilePrefetchEx =
                    FilePrefetchEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                        ).readNative(addr + 16L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: FilePrefetchEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.context)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                    ).writeNative(addr + 16L, value.prefetch.toList())
                }
            }

        public operator fun invoke(
            type: UInt = 0u,
            count: UInt = 0u,
            context: MutPtr<CVoid> = MutPtr(0L),
            prefetch: ULongArray = ULongArray(1),
        ): FilePrefetchEx =
            FilePrefetchEx(
                type = type,
                count = count,
                contextCtorArg = context,
                prefetch = prefetch,
            )
    }
}

public data class FileProviderExternalInfoV0(
    public var version: UInt = 0u,
    public var algorithm: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileProviderExternalInfoV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileProviderExternalInfoV0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FileProviderExternalInfoV0 =
                    FileProviderExternalInfoV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileProviderExternalInfoV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.algorithm)
                }
            }
    }
}

public data class FileProviderExternalInfoV1(
    public var version: UInt = 0u,
    public var algorithm: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileProviderExternalInfoV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileProviderExternalInfoV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): FileProviderExternalInfoV1 =
                    FileProviderExternalInfoV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileProviderExternalInfoV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.algorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class FileQueryOnDiskVolInfoBuffer(
    public var directoryCount: Long = 0L,
    public var fileCount: Long = 0L,
    public var fsFormatMajVersion: UShort = 0u,
    public var fsFormatMinVersion: UShort = 0u,
    public var fsFormatName: UShortArray = UShortArray(12),
    public var formatTime: Long = 0L,
    public var lastUpdateTime: Long = 0L,
    public var copyrightInfo: UShortArray = UShortArray(34),
    public var abstractInfo: UShortArray = UShortArray(34),
    public var formattingImplementationInfo: UShortArray = UShortArray(34),
    public var lastModifyingImplementationInfo: UShortArray = UShortArray(34),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileQueryOnDiskVolInfoBuffer) return false
        if (this.directoryCount != other.directoryCount) return false
        if (this.fileCount != other.fileCount) return false
        if (this.fsFormatMajVersion != other.fsFormatMajVersion) return false
        if (this.fsFormatMinVersion != other.fsFormatMinVersion) return false
        if (!this.fsFormatName.contentEquals(other.fsFormatName)) return false
        if (this.formatTime != other.formatTime) return false
        if (this.lastUpdateTime != other.lastUpdateTime) return false
        if (!this.copyrightInfo.contentEquals(other.copyrightInfo)) return false
        if (!this.abstractInfo.contentEquals(other.abstractInfo)) return false
        if (!this.formattingImplementationInfo.contentEquals(other.formattingImplementationInfo)) return false
        if (!this.lastModifyingImplementationInfo.contentEquals(other.lastModifyingImplementationInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.directoryCount.hashCode()
        result = 31 * result + this.fileCount.hashCode()
        result = 31 * result + this.fsFormatMajVersion.hashCode()
        result = 31 * result + this.fsFormatMinVersion.hashCode()
        result = 31 * result + this.fsFormatName.contentHashCode()
        result = 31 * result + this.formatTime.hashCode()
        result = 31 * result + this.lastUpdateTime.hashCode()
        result = 31 * result + this.copyrightInfo.contentHashCode()
        result = 31 * result + this.abstractInfo.contentHashCode()
        result = 31 * result + this.formattingImplementationInfo.contentHashCode()
        result = 31 * result + this.lastModifyingImplementationInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileQueryOnDiskVolInfoBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileQueryOnDiskVolInfoBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 336L
                override fun readNative(addr: Long): FileQueryOnDiskVolInfoBuffer =
                    FileQueryOnDiskVolInfoBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (12).toInt())
                        ).readNative(addr + 20L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (34).toInt())
                        ).readNative(addr + 64L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (34).toInt())
                        ).readNative(addr + 132L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (34).toInt())
                        ).readNative(addr + 200L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (34).toInt())
                        ).readNative(addr + 268L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: FileQueryOnDiskVolInfoBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.directoryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.fileCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.fsFormatMajVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.fsFormatMinVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (12).toInt())
                    ).writeNative(addr + 20L, value.fsFormatName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.formatTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.lastUpdateTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (34).toInt())
                    ).writeNative(addr + 64L, value.copyrightInfo.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (34).toInt())
                    ).writeNative(addr + 132L, value.abstractInfo.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (34).toInt())
                    ).writeNative(addr + 200L, value.formattingImplementationInfo.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (34).toInt())
                    ).writeNative(addr + 268L, value.lastModifyingImplementationInfo.toList())
                }
            }
    }
}

public data class FileQuerySparingBuffer(
    public var sparingUnitBytes: UInt = 0u,
    public var softwareSparing: Boolean = false,
    public var totalSpareBlocks: UInt = 0u,
    public var freeSpareBlocks: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileQuerySparingBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileQuerySparingBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FileQuerySparingBuffer =
                    FileQuerySparingBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FileQuerySparingBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sparingUnitBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.softwareSparing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.totalSpareBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.freeSpareBlocks)
                }
            }
    }
}

public data class FileReferenceRange(
    public var startingFileReferenceNumber: ULong = 0uL,
    public var endingFileReferenceNumber: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileReferenceRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileReferenceRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FileReferenceRange =
                    FileReferenceRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileReferenceRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startingFileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.endingFileReferenceNumber)
                }
            }
    }
}

public data class FileRegionInfo(
    public var fileOffset: Long = 0L,
    public var length: Long = 0L,
    public var usage: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRegionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRegionInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FileRegionInfo =
                    FileRegionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: FileRegionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.usage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                }
            }
    }
}

public data class FileRegionInput(
    public var fileOffset: Long = 0L,
    public var length: Long = 0L,
    public var desiredUsage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRegionInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRegionInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FileRegionInput =
                    FileRegionInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FileRegionInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.desiredUsage)
                }
            }
    }
}

public data class FileRegionOutput(
    public var flags: UInt = 0u,
    public var totalRegionEntryCount: UInt = 0u,
    public var regionEntryCount: UInt = 0u,
    public var reserved: UInt = 0u,
    public var region: List<FileRegionInfo> = List(1) { FileRegionInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRegionOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRegionOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): FileRegionOutput =
                    FileRegionOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(FileRegionInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FileRegionOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalRegionEntryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.regionEntryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(FileRegionInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.region)
                }
            }
    }
}

public data class FileSetDefectMgmtBuffer(
    public var disable: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileSetDefectMgmtBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileSetDefectMgmtBuffer> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): FileSetDefectMgmtBuffer =
                    FileSetDefectMgmtBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileSetDefectMgmtBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.disable)
                }
            }
    }
}

public data class FileSetSparseBuffer(
    public var setSparse: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileSetSparseBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileSetSparseBuffer> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): FileSetSparseBuffer =
                    FileSetSparseBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileSetSparseBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.setSparse)
                }
            }
    }
}

public data class FileStorageTier(
    public var id: Guid = Guid(),
    public var name: UShortArray = UShortArray(256),
    public var description: UShortArray = UShortArray(256),
    public var flags: ULong = 0uL,
    public var provisionedCapacity: ULong = 0uL,
    public var mediaType: FileStorageTierMediaType = 0,
    public var cls: FileStorageTierClass = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileStorageTier) return false
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

public data class FileStorageTierRegion(
    public var tierId: Guid = Guid(),
    public var offset: ULong = 0uL,
    public var length: ULong = 0uL,
)

public data class FileSystemRecognitionInformation(
    public var fileSystem: ByteArray = ByteArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileSystemRecognitionInformation) return false
        if (!this.fileSystem.contentEquals(other.fileSystem)) return false
        return true
    }

    override fun hashCode(): Int = this.fileSystem.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileSystemRecognitionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileSystemRecognitionInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 9L
                override fun readNative(addr: Long): FileSystemRecognitionInformation =
                    FileSystemRecognitionInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (9).toInt())
                        ).readNative(addr).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: FileSystemRecognitionInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (9).toInt())
                    ).writeNative(addr, value.fileSystem.toList())
                }
            }
    }
}

public data class FileTypeNotificationInput(
    public var flags: UInt = 0u,
    public var numFileTypeIDs: UInt = 0u,
    public var fileTypeID: List<Guid> = List(1) { Guid() },
)

public data class FileZeroDataInformation(
    public var fileOffset: Long = 0L,
    public var beyondFinalZero: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileZeroDataInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileZeroDataInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FileZeroDataInformation =
                    FileZeroDataInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileZeroDataInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.beyondFinalZero)
                }
            }
    }
}

public data class FileZeroDataInformationEx(
    public var fileOffset: Long = 0L,
    public var beyondFinalZero: Long = 0L,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileZeroDataInformationEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileZeroDataInformationEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FileZeroDataInformationEx =
                    FileZeroDataInformationEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FileZeroDataInformationEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.beyondFinalZero)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class FindBySidData(
    public var restart: UInt = 0u,
    public var sid: Sid = Sid(),
)

public data class FindBySidOutput(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FindBySidOutput) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FindBySidOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FindBySidOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FindBySidOutput =
                    FindBySidOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: FindBySidOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fileNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.fileName.toList())
                }
            }
    }
}

public data class FormatExParameters(
    public var mediaType: MediaType = 0,
    public var startCylinderNumber: UInt = 0u,
    public var endCylinderNumber: UInt = 0u,
    public var startHeadNumber: UInt = 0u,
    public var endHeadNumber: UInt = 0u,
    public var formatGapLength: UShort = 0u,
    public var sectorsPerTrack: UShort = 0u,
    public var sectorNumber: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FormatExParameters) return false
        if (this.mediaType != other.mediaType) return false
        if (this.startCylinderNumber != other.startCylinderNumber) return false
        if (this.endCylinderNumber != other.endCylinderNumber) return false
        if (this.startHeadNumber != other.startHeadNumber) return false
        if (this.endHeadNumber != other.endHeadNumber) return false
        if (this.formatGapLength != other.formatGapLength) return false
        if (this.sectorsPerTrack != other.sectorsPerTrack) return false
        if (!this.sectorNumber.contentEquals(other.sectorNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mediaType.hashCode()
        result = 31 * result + this.startCylinderNumber.hashCode()
        result = 31 * result + this.endCylinderNumber.hashCode()
        result = 31 * result + this.startHeadNumber.hashCode()
        result = 31 * result + this.endHeadNumber.hashCode()
        result = 31 * result + this.formatGapLength.hashCode()
        result = 31 * result + this.sectorsPerTrack.hashCode()
        result = 31 * result + this.sectorNumber.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FormatExParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FormatExParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): FormatExParameters =
                    FormatExParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: FormatExParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mediaType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.startCylinderNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.endCylinderNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.startHeadNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.endHeadNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.formatGapLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.sectorsPerTrack)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 24L, value.sectorNumber.toList())
                }
            }
    }
}

public data class FormatParameters(
    public var mediaType: MediaType = 0,
    public var startCylinderNumber: UInt = 0u,
    public var endCylinderNumber: UInt = 0u,
    public var startHeadNumber: UInt = 0u,
    public var endHeadNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FormatParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FormatParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): FormatParameters =
                    FormatParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FormatParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mediaType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.startCylinderNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.endCylinderNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.startHeadNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.endHeadNumber)
                }
            }
    }
}

public data class FsctlGetIntegrityInformationBuffer(
    public var checksumAlgorithm: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var checksumChunkSizeInBytes: UInt = 0u,
    public var clusterSizeInBytes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlGetIntegrityInformationBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlGetIntegrityInformationBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FsctlGetIntegrityInformationBuffer =
                    FsctlGetIntegrityInformationBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FsctlGetIntegrityInformationBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.checksumAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.checksumChunkSizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.clusterSizeInBytes)
                }
            }
    }
}

public data class FsctlOffloadReadInput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var tokenTimeToLive: UInt = 0u,
    public var reserved: UInt = 0u,
    public var fileOffset: ULong = 0uL,
    public var copyLength: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlOffloadReadInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlOffloadReadInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): FsctlOffloadReadInput =
                    FsctlOffloadReadInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FsctlOffloadReadInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tokenTimeToLive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.copyLength)
                }
            }
    }
}

public data class FsctlOffloadReadOutput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var transferLength: ULong = 0uL,
    public var token: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlOffloadReadOutput) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.transferLength != other.transferLength) return false
        if (!this.token.contentEquals(other.token)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.transferLength.hashCode()
        result = 31 * result + this.token.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlOffloadReadOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlOffloadReadOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): FsctlOffloadReadOutput =
                    FsctlOffloadReadOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FsctlOffloadReadOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.transferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                    ).writeNative(addr + 16L, value.token.toList())
                }
            }
    }
}

public data class FsctlOffloadWriteInput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileOffset: ULong = 0uL,
    public var copyLength: ULong = 0uL,
    public var transferOffset: ULong = 0uL,
    public var token: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlOffloadWriteInput) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.copyLength != other.copyLength) return false
        if (this.transferOffset != other.transferOffset) return false
        if (!this.token.contentEquals(other.token)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fileOffset.hashCode()
        result = 31 * result + this.copyLength.hashCode()
        result = 31 * result + this.transferOffset.hashCode()
        result = 31 * result + this.token.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlOffloadWriteInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlOffloadWriteInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 544L
                override fun readNative(addr: Long): FsctlOffloadWriteInput =
                    FsctlOffloadWriteInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FsctlOffloadWriteInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.copyLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.transferOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                    ).writeNative(addr + 32L, value.token.toList())
                }
            }
    }
}

public data class FsctlOffloadWriteOutput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var lengthWritten: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlOffloadWriteOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlOffloadWriteOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FsctlOffloadWriteOutput =
                    FsctlOffloadWriteOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FsctlOffloadWriteOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lengthWritten)
                }
            }
    }
}

public data class FsctlQueryFatBpbBuffer(
    public var first0x24BytesOfBootSector: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlQueryFatBpbBuffer) return false
        if (!this.first0x24BytesOfBootSector.contentEquals(other.first0x24BytesOfBootSector)) return false
        return true
    }

    override fun hashCode(): Int = this.first0x24BytesOfBootSector.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlQueryFatBpbBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlQueryFatBpbBuffer> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): FsctlQueryFatBpbBuffer =
                    FsctlQueryFatBpbBuffer(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FsctlQueryFatBpbBuffer) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                    ).writeNative(addr, value.first0x24BytesOfBootSector.toList())
                }
            }
    }
}

public data class FsctlQueryRegionInfoInput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var numberOfTierIds: UInt = 0u,
    public var tierIds: List<Guid> = List(1) { Guid() },
)

public data class FsctlQueryRegionInfoOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var alignment: ULong = 0uL,
    public var totalNumberOfRegions: UInt = 0u,
    public var numberOfRegionsReturned: UInt = 0u,
    public var regions: List<FileStorageTierRegion> = List(1) { FileStorageTierRegion() },
)

public data class FsctlQueryStorageClassesOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: FileStorageTierFlags = 0u,
    public var totalNumberOfTiers: UInt = 0u,
    public var numberOfTiersReturned: UInt = 0u,
    public var tiers: List<FileStorageTier> = List(1) { FileStorageTier() },
)

public data class FsctlSetIntegrityInformationBuffer(
    public var checksumAlgorithm: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlSetIntegrityInformationBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlSetIntegrityInformationBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FsctlSetIntegrityInformationBuffer =
                    FsctlSetIntegrityInformationBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FsctlSetIntegrityInformationBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.checksumAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class FsctlSetIntegrityInformationBufferEx(
    public var enableIntegrity: UByte = 0u,
    public var keepIntegrityStateUnchanged: UByte = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var version: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlSetIntegrityInformationBufferEx) return false
        if (this.enableIntegrity != other.enableIntegrity) return false
        if (this.keepIntegrityStateUnchanged != other.keepIntegrityStateUnchanged) return false
        if (this.reserved != other.reserved) return false
        if (this.flags != other.flags) return false
        if (this.version != other.version) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enableIntegrity.hashCode()
        result = 31 * result + this.keepIntegrityStateUnchanged.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlSetIntegrityInformationBufferEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlSetIntegrityInformationBufferEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FsctlSetIntegrityInformationBufferEx =
                    FsctlSetIntegrityInformationBufferEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FsctlSetIntegrityInformationBufferEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.enableIntegrity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.keepIntegrityStateUnchanged)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                    ).writeNative(addr + 9L, value.reserved2.toList())
                }
            }
    }
}

public data class FsBpioInfo(
    public var activeBypassIoCount: UInt = 0u,
    public var storageDriverNameLen: UShort = 0u,
    public var storageDriverName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsBpioInfo) return false
        if (this.activeBypassIoCount != other.activeBypassIoCount) return false
        if (this.storageDriverNameLen != other.storageDriverNameLen) return false
        if (!this.storageDriverName.contentEquals(other.storageDriverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.activeBypassIoCount.hashCode()
        result = 31 * result + this.storageDriverNameLen.hashCode()
        result = 31 * result + this.storageDriverName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsBpioInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsBpioInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): FsBpioInfo =
                    FsBpioInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 6L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: FsBpioInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.activeBypassIoCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.storageDriverNameLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 6L, value.storageDriverName.toList())
                }
            }
    }
}

public data class FsBpioInput(
    public var operation: FsBpioOperations = 0,
    public var inFlags: FsBpioInflags = 0,
    public var reserved1: ULong = 0uL,
    public var reserved2: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsBpioInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsBpioInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FsBpioInput =
                    FsBpioInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FsBpioInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.operation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.inFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.reserved2)
                }
            }
    }
}

public data class FsBpioOutput(
    public var operation: FsBpioOperations = 0,
    public var outFlags: FsBpioOutflags = 0,
    public var reserved1: ULong = 0uL,
    public var reserved2: ULong = 0uL,
    public var anonymous: FsBpioOutput0 = FsBpioOutput0(),
)

public data class FsBpioOutput0(
    public var enable: FsBpioResults = FsBpioResults(),
    public var query: FsBpioResults = FsBpioResults(),
    public var volumeStackResume: FsBpioResults = FsBpioResults(),
    public var streamResume: FsBpioResults = FsBpioResults(),
    public var getInfo: FsBpioInfo = FsBpioInfo(),
)

public data class FsBpioResults(
    public var opStatus: UInt = 0u,
    public var failingDriverNameLen: UShort = 0u,
    public var failingDriverName: UShortArray = UShortArray(32),
    public var failureReasonLen: UShort = 0u,
    public var failureReason: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsBpioResults) return false
        if (this.opStatus != other.opStatus) return false
        if (this.failingDriverNameLen != other.failingDriverNameLen) return false
        if (!this.failingDriverName.contentEquals(other.failingDriverName)) return false
        if (this.failureReasonLen != other.failureReasonLen) return false
        if (!this.failureReason.contentEquals(other.failureReason)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.opStatus.hashCode()
        result = 31 * result + this.failingDriverNameLen.hashCode()
        result = 31 * result + this.failingDriverName.contentHashCode()
        result = 31 * result + this.failureReasonLen.hashCode()
        result = 31 * result + this.failureReason.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsBpioResults> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsBpioResults> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 328L
                override fun readNative(addr: Long): FsBpioResults =
                    FsBpioResults(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 6L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 70L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 72L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: FsBpioResults) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.opStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.failingDriverNameLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 6L, value.failingDriverName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 70L, value.failureReasonLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 72L, value.failureReason.toList())
                }
            }
    }
}

public data class Getversioninparams(
    public var bVersion: UByte = 0u,
    public var bRevision: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bIDEDeviceMap: UByte = 0u,
    public var fCapabilities: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Getversioninparams) return false
        if (this.bVersion != other.bVersion) return false
        if (this.bRevision != other.bRevision) return false
        if (this.bReserved != other.bReserved) return false
        if (this.bIDEDeviceMap != other.bIDEDeviceMap) return false
        if (this.fCapabilities != other.fCapabilities) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bVersion.hashCode()
        result = 31 * result + this.bRevision.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.bIDEDeviceMap.hashCode()
        result = 31 * result + this.fCapabilities.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Getversioninparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Getversioninparams> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Getversioninparams =
                    Getversioninparams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Getversioninparams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bIDEDeviceMap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fCapabilities)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 8L, value.dwReserved.toList())
                }
            }
    }
}

public class GetChangerParameters(
    public var size: UInt = 0u,
    public var numberTransportElements: UShort = 0u,
    public var numberStorageElements: UShort = 0u,
    public var numberCleanerSlots: UShort = 0u,
    public var numberIEElements: UShort = 0u,
    public var numberDataTransferElements: UShort = 0u,
    public var numberOfDoors: UShort = 0u,
    public var firstSlotNumber: UShort = 0u,
    public var firstDriveNumber: UShort = 0u,
    public var firstTransportNumber: UShort = 0u,
    public var firstIEPortNumber: UShort = 0u,
    public var firstCleanerSlotAddress: UShort = 0u,
    public var magazineSize: UShort = 0u,
    public var driveCleanTimeout: UInt = 0u,
    public var features0: ChangerFeatures = 0u,
    public var features1: GetChangerParametersFeatures1 = 0u,
    public var moveFromTransport: UByte = 0u,
    public var moveFromSlot: UByte = 0u,
    public var moveFromIePort: UByte = 0u,
    public var moveFromDrive: UByte = 0u,
    public var exchangeFromTransport: UByte = 0u,
    public var exchangeFromSlot: UByte = 0u,
    public var exchangeFromIePort: UByte = 0u,
    public var exchangeFromDrive: UByte = 0u,
    public var lockUnlockCapabilities: UByte = 0u,
    public var positionCapabilities: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(2),
    public var reserved2: UIntArray = UIntArray(2),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetChangerParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetChangerParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): GetChangerParameters =
                    GetChangerParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 41L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 43L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 45L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 47L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 49L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 50L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 52L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: GetChangerParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.numberTransportElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.numberStorageElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.numberCleanerSlots)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.numberIEElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.numberDataTransferElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.numberOfDoors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.firstSlotNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.firstDriveNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.firstTransportNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.firstIEPortNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.firstCleanerSlotAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.magazineSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.driveCleanTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.features0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.features1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 40L, value.moveFromTransport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 41L, value.moveFromSlot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 42L, value.moveFromIePort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 43L, value.moveFromDrive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 44L, value.exchangeFromTransport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 45L, value.exchangeFromSlot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 46L, value.exchangeFromIePort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 47L, value.exchangeFromDrive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 48L, value.lockUnlockCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 49L, value.positionCapabilities)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 50L, value.reserved1.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 52L, value.reserved2.toList())
                }
            }
    }
}

public data class GetDeviceInternalStatusDataRequest(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var requestDataType: DeviceInternalStatusDataRequestType = 0,
    public var requestDataSet: DeviceInternalStatusDataSet = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetDeviceInternalStatusDataRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetDeviceInternalStatusDataRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): GetDeviceInternalStatusDataRequest =
                    GetDeviceInternalStatusDataRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: GetDeviceInternalStatusDataRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.requestDataType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.requestDataSet)
                }
            }
    }
}

public data class GetDiskAttributes(
    public var version: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var attributes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetDiskAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetDiskAttributes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): GetDiskAttributes =
                    GetDiskAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GetDiskAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.attributes)
                }
            }
    }
}

public data class GetFilterFileIdentifierInput(
    public var altitudeLength: UShort = 0u,
    public var altitude: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetFilterFileIdentifierInput) return false
        if (this.altitudeLength != other.altitudeLength) return false
        if (!this.altitude.contentEquals(other.altitude)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.altitudeLength.hashCode()
        result = 31 * result + this.altitude.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetFilterFileIdentifierInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetFilterFileIdentifierInput> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): GetFilterFileIdentifierInput =
                    GetFilterFileIdentifierInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: GetFilterFileIdentifierInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.altitudeLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 2L, value.altitude.toList())
                }
            }
    }
}

public data class GetFilterFileIdentifierOutput(
    public var filterFileIdentifierLength: UShort = 0u,
    public var filterFileIdentifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetFilterFileIdentifierOutput) return false
        if (this.filterFileIdentifierLength != other.filterFileIdentifierLength) return false
        if (!this.filterFileIdentifier.contentEquals(other.filterFileIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.filterFileIdentifierLength.hashCode()
        result = 31 * result + this.filterFileIdentifier.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetFilterFileIdentifierOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetFilterFileIdentifierOutput> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): GetFilterFileIdentifierOutput =
                    GetFilterFileIdentifierOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: GetFilterFileIdentifierOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.filterFileIdentifierLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.filterFileIdentifier.toList())
                }
            }
    }
}

public data class GetLengthInformation(
    public var length: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetLengthInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetLengthInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GetLengthInformation =
                    GetLengthInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GetLengthInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.length)
                }
            }
    }
}

public data class GetMediaTypes(
    public var deviceType: UInt = 0u,
    public var mediaInfoCount: UInt = 0u,
    public var mediaInfo: List<DeviceMediaInfo> = List(1) { DeviceMediaInfo() },
)

public data class GpLogPageDescriptor(
    public var logAddress: UShort = 0u,
    public var logSectors: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpLogPageDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpLogPageDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): GpLogPageDescriptor =
                    GpLogPageDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: GpLogPageDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.logAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.logSectors)
                }
            }
    }
}

public data class HistogramBucket(
    public var reads: UInt = 0u,
    public var writes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HistogramBucket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HistogramBucket> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HistogramBucket =
                    HistogramBucket(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HistogramBucket) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.writes)
                }
            }
    }
}

public data class Ideregs(
    public var bFeaturesReg: UByte = 0u,
    public var bSectorCountReg: UByte = 0u,
    public var bSectorNumberReg: UByte = 0u,
    public var bCylLowReg: UByte = 0u,
    public var bCylHighReg: UByte = 0u,
    public var bDriveHeadReg: UByte = 0u,
    public var bCommandReg: UByte = 0u,
    public var bReserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ideregs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ideregs> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ideregs =
                    Ideregs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: Ideregs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bFeaturesReg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bSectorCountReg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bSectorNumberReg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bCylLowReg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bCylHighReg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bDriveHeadReg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bCommandReg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bReserved)
                }
            }
    }
}

public data class IoIrpExtTrackOffsetHeader(
    public var validation: UShort = 0u,
    public var flags: UShort = 0u,
    public var trackedOffsetCallback: PioIrpExtProcessTrackedOffsetCallback = null,
)

public data class LmrQueryInfoParam(
    public var operation: LmrQueryInfoClass = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LmrQueryInfoParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LmrQueryInfoParam> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): LmrQueryInfoParam =
                    LmrQueryInfoParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: LmrQueryInfoParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.operation)
                }
            }
    }
}

public data class LmrQuerySessionInfo(
    public var sessionId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LmrQuerySessionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LmrQuerySessionInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): LmrQuerySessionInfo =
                    LmrQuerySessionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: LmrQuerySessionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.sessionId)
                }
            }
    }
}

public data class LookupStreamFromClusterEntry(
    public var offsetToNext: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: Long = 0L,
    public var cluster: Long = 0L,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LookupStreamFromClusterEntry) return false
        if (this.offsetToNext != other.offsetToNext) return false
        if (this.flags != other.flags) return false
        if (this.reserved != other.reserved) return false
        if (this.cluster != other.cluster) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offsetToNext.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.cluster.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LookupStreamFromClusterEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LookupStreamFromClusterEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): LookupStreamFromClusterEntry =
                    LookupStreamFromClusterEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: LookupStreamFromClusterEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offsetToNext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.cluster)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 24L, value.fileName.toList())
                }
            }
    }
}

public data class LookupStreamFromClusterInput(
    public var flags: UInt = 0u,
    public var numberOfClusters: UInt = 0u,
    public var cluster: LongArray = LongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LookupStreamFromClusterInput) return false
        if (this.flags != other.flags) return false
        if (this.numberOfClusters != other.numberOfClusters) return false
        if (!this.cluster.contentEquals(other.cluster)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.numberOfClusters.hashCode()
        result = 31 * result + this.cluster.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LookupStreamFromClusterInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LookupStreamFromClusterInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): LookupStreamFromClusterInput =
                    LookupStreamFromClusterInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (1).toInt())
                        ).readNative(addr + 8L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: LookupStreamFromClusterInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfClusters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (1).toInt())
                    ).writeNative(addr + 8L, value.cluster.toList())
                }
            }
    }
}

public data class LookupStreamFromClusterOutput(
    public var offset: UInt = 0u,
    public var numberOfMatches: UInt = 0u,
    public var bufferSizeRequired: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LookupStreamFromClusterOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LookupStreamFromClusterOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): LookupStreamFromClusterOutput =
                    LookupStreamFromClusterOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LookupStreamFromClusterOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfMatches)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bufferSizeRequired)
                }
            }
    }
}

public class MarkHandleInfo internal constructor(
    public var anonymous: MarkHandleInfo0,
    volumeHandleCtorArg: Handle,
    public var handleInfo: UInt,
) {
    public var volumeHandle: Handle = volumeHandleCtorArg
        internal set

    public constructor() : this(
        anonymous = MarkHandleInfo0(),
        volumeHandleCtorArg = MutPtr(0L),
        handleInfo = 0u,
    )

    public operator fun component1(): MarkHandleInfo0 = this.anonymous

    public operator fun component2(): Handle = this.volumeHandle

    public operator fun component3(): UInt = this.handleInfo

    public fun copy(anonymous: MarkHandleInfo0 = this.anonymous, volumeHandle: Handle = this.volumeHandle, handleInfo: UInt = this.handleInfo): MarkHandleInfo = MarkHandleInfo(anonymous = anonymous, volumeHandleCtorArg = volumeHandle, handleInfo = handleInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MarkHandleInfo) return false
        if (this.anonymous != other.anonymous) return false
        if (this.volumeHandle != other.volumeHandle) return false
        if (this.handleInfo != other.handleInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.volumeHandle.hashCode()
        result = 31 * result + this.handleInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: MarkHandleInfo0 = MarkHandleInfo0(),
            volumeHandle: Handle = MutPtr(0L),
            handleInfo: UInt = 0u,
        ): MarkHandleInfo =
            MarkHandleInfo(
                anonymous = anonymous,
                volumeHandleCtorArg = volumeHandle,
                handleInfo = handleInfo,
            )
    }
}

public data class MarkHandleInfo0(
    public var usnSourceInfo: UInt = 0u,
    public var copyNumber: UInt = 0u,
)

public data class MarkHandleInfo32(
    public var anonymous: MarkHandleInfo320 = MarkHandleInfo320(),
    public var volumeHandle: UInt = 0u,
    public var handleInfo: UInt = 0u,
)

public data class MarkHandleInfo320(
    public var usnSourceInfo: UInt = 0u,
    public var copyNumber: UInt = 0u,
)

public data class MftEnumDataV0(
    public var startFileReferenceNumber: ULong = 0uL,
    public var lowUsn: Long = 0L,
    public var highUsn: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MftEnumDataV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MftEnumDataV0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MftEnumDataV0 =
                    MftEnumDataV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MftEnumDataV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startFileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lowUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.highUsn)
                }
            }
    }
}

public data class MftEnumDataV1(
    public var startFileReferenceNumber: ULong = 0uL,
    public var lowUsn: Long = 0L,
    public var highUsn: Long = 0L,
    public var minMajorVersion: UShort = 0u,
    public var maxMajorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MftEnumDataV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MftEnumDataV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MftEnumDataV1 =
                    MftEnumDataV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                    )
                override fun writeNative(addr: Long, value: MftEnumDataV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startFileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lowUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.highUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.minMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.maxMajorVersion)
                }
            }
    }
}

public class MoveFileData internal constructor(
    fileHandleCtorArg: Handle,
    public var startingVcn: Long,
    public var startingLcn: Long,
    public var clusterCount: UInt,
) {
    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public constructor() : this(
        fileHandleCtorArg = MutPtr(0L),
        startingVcn = 0L,
        startingLcn = 0L,
        clusterCount = 0u,
    )

    public operator fun component1(): Handle = this.fileHandle

    public operator fun component2(): Long = this.startingVcn

    public operator fun component3(): Long = this.startingLcn

    public operator fun component4(): UInt = this.clusterCount

    public fun copy(fileHandle: Handle = this.fileHandle, startingVcn: Long = this.startingVcn, startingLcn: Long = this.startingLcn, clusterCount: UInt = this.clusterCount): MoveFileData = MoveFileData(fileHandleCtorArg = fileHandle, startingVcn = startingVcn, startingLcn = startingLcn, clusterCount = clusterCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MoveFileData) return false
        if (this.fileHandle != other.fileHandle) return false
        if (this.startingVcn != other.startingVcn) return false
        if (this.startingLcn != other.startingLcn) return false
        if (this.clusterCount != other.clusterCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileHandle.hashCode()
        result = 31 * result + this.startingVcn.hashCode()
        result = 31 * result + this.startingLcn.hashCode()
        result = 31 * result + this.clusterCount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fileHandle: Handle = MutPtr(0L),
            startingVcn: Long = 0L,
            startingLcn: Long = 0L,
            clusterCount: UInt = 0u,
        ): MoveFileData =
            MoveFileData(
                fileHandleCtorArg = fileHandle,
                startingVcn = startingVcn,
                startingLcn = startingLcn,
                clusterCount = clusterCount,
            )
    }
}

public data class MoveFileData32(
    public var fileHandle: UInt = 0u,
    public var startingVcn: Long = 0L,
    public var startingLcn: Long = 0L,
    public var clusterCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MoveFileData32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MoveFileData32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MoveFileData32 =
                    MoveFileData32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MoveFileData32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.startingVcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.startingLcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.clusterCount)
                }
            }
    }
}

public class MoveFileRecordData internal constructor(
    fileHandleCtorArg: Handle,
    public var sourceFileRecord: Long,
    public var targetFileRecord: Long,
) {
    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public constructor() : this(
        fileHandleCtorArg = MutPtr(0L),
        sourceFileRecord = 0L,
        targetFileRecord = 0L,
    )

    public operator fun component1(): Handle = this.fileHandle

    public operator fun component2(): Long = this.sourceFileRecord

    public operator fun component3(): Long = this.targetFileRecord

    public fun copy(fileHandle: Handle = this.fileHandle, sourceFileRecord: Long = this.sourceFileRecord, targetFileRecord: Long = this.targetFileRecord): MoveFileRecordData = MoveFileRecordData(fileHandleCtorArg = fileHandle, sourceFileRecord = sourceFileRecord, targetFileRecord = targetFileRecord)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MoveFileRecordData) return false
        if (this.fileHandle != other.fileHandle) return false
        if (this.sourceFileRecord != other.sourceFileRecord) return false
        if (this.targetFileRecord != other.targetFileRecord) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileHandle.hashCode()
        result = 31 * result + this.sourceFileRecord.hashCode()
        result = 31 * result + this.targetFileRecord.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fileHandle: Handle = MutPtr(0L),
            sourceFileRecord: Long = 0L,
            targetFileRecord: Long = 0L,
        ): MoveFileRecordData =
            MoveFileRecordData(
                fileHandleCtorArg = fileHandle,
                sourceFileRecord = sourceFileRecord,
                targetFileRecord = targetFileRecord,
            )
    }
}

public data class NtfsExtendedVolumeData(
    public var byteCount: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var bytesPerPhysicalSector: UInt = 0u,
    public var lfsMajorVersion: UShort = 0u,
    public var lfsMinorVersion: UShort = 0u,
    public var maxDeviceTrimExtentCount: UInt = 0u,
    public var maxDeviceTrimByteCount: UInt = 0u,
    public var maxVolumeTrimExtentCount: UInt = 0u,
    public var maxVolumeTrimByteCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsExtendedVolumeData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsExtendedVolumeData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NtfsExtendedVolumeData =
                    NtfsExtendedVolumeData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: NtfsExtendedVolumeData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.byteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bytesPerPhysicalSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.lfsMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.lfsMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maxDeviceTrimExtentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.maxDeviceTrimByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.maxVolumeTrimExtentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.maxVolumeTrimByteCount)
                }
            }
    }
}

public data class NtfsFileRecordInputBuffer(
    public var fileReferenceNumber: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsFileRecordInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsFileRecordInputBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NtfsFileRecordInputBuffer =
                    NtfsFileRecordInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NtfsFileRecordInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileReferenceNumber)
                }
            }
    }
}

public data class NtfsFileRecordOutputBuffer(
    public var fileReferenceNumber: Long = 0L,
    public var fileRecordLength: UInt = 0u,
    public var fileRecordBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtfsFileRecordOutputBuffer) return false
        if (this.fileReferenceNumber != other.fileReferenceNumber) return false
        if (this.fileRecordLength != other.fileRecordLength) return false
        if (!this.fileRecordBuffer.contentEquals(other.fileRecordBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileReferenceNumber.hashCode()
        result = 31 * result + this.fileRecordLength.hashCode()
        result = 31 * result + this.fileRecordBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsFileRecordOutputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsFileRecordOutputBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NtfsFileRecordOutputBuffer =
                    NtfsFileRecordOutputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NtfsFileRecordOutputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fileRecordLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.fileRecordBuffer.toList())
                }
            }
    }
}

public class NtfsStatistics(
    public var logFileFullExceptions: UInt = 0u,
    public var otherExceptions: UInt = 0u,
    public var mftReads: UInt = 0u,
    public var mftReadBytes: UInt = 0u,
    public var mftWrites: UInt = 0u,
    public var mftWriteBytes: UInt = 0u,
    public var mftWritesUserLevel: NtfsStatistics0 = NtfsStatistics0(),
    public var mftWritesFlushForLogFileFull: UShort = 0u,
    public var mftWritesLazyWriter: UShort = 0u,
    public var mftWritesUserRequest: UShort = 0u,
    public var mft2Writes: UInt = 0u,
    public var mft2WriteBytes: UInt = 0u,
    public var mft2WritesUserLevel: NtfsStatistics1 = NtfsStatistics1(),
    public var mft2WritesFlushForLogFileFull: UShort = 0u,
    public var mft2WritesLazyWriter: UShort = 0u,
    public var mft2WritesUserRequest: UShort = 0u,
    public var rootIndexReads: UInt = 0u,
    public var rootIndexReadBytes: UInt = 0u,
    public var rootIndexWrites: UInt = 0u,
    public var rootIndexWriteBytes: UInt = 0u,
    public var bitmapReads: UInt = 0u,
    public var bitmapReadBytes: UInt = 0u,
    public var bitmapWrites: UInt = 0u,
    public var bitmapWriteBytes: UInt = 0u,
    public var bitmapWritesFlushForLogFileFull: UShort = 0u,
    public var bitmapWritesLazyWriter: UShort = 0u,
    public var bitmapWritesUserRequest: UShort = 0u,
    public var bitmapWritesUserLevel: NtfsStatistics2 = NtfsStatistics2(),
    public var mftBitmapReads: UInt = 0u,
    public var mftBitmapReadBytes: UInt = 0u,
    public var mftBitmapWrites: UInt = 0u,
    public var mftBitmapWriteBytes: UInt = 0u,
    public var mftBitmapWritesFlushForLogFileFull: UShort = 0u,
    public var mftBitmapWritesLazyWriter: UShort = 0u,
    public var mftBitmapWritesUserRequest: UShort = 0u,
    public var mftBitmapWritesUserLevel: NtfsStatistics3 = NtfsStatistics3(),
    public var userIndexReads: UInt = 0u,
    public var userIndexReadBytes: UInt = 0u,
    public var userIndexWrites: UInt = 0u,
    public var userIndexWriteBytes: UInt = 0u,
    public var logFileReads: UInt = 0u,
    public var logFileReadBytes: UInt = 0u,
    public var logFileWrites: UInt = 0u,
    public var logFileWriteBytes: UInt = 0u,
    public var allocate: NtfsStatistics4 = NtfsStatistics4(),
    public var diskResourcesExhausted: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 216L
                override fun readNative(addr: Long): NtfsStatistics =
                    NtfsStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (NtfsStatistics0.typeLayout()).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (NtfsStatistics1.typeLayout()).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 98L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 100L),
                        (NtfsStatistics2.typeLayout()).readNative(addr + 102L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 126L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 128L),
                        (NtfsStatistics3.typeLayout()).readNative(addr + 130L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L),
                        (NtfsStatistics4.typeLayout()).readNative(addr + 172L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 212L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.logFileFullExceptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.otherExceptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mftReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.mftReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.mftWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.mftWriteBytes)
                    (NtfsStatistics0.typeLayout()).writeNative(addr + 24L, value.mftWritesUserLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.mftWritesFlushForLogFileFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.mftWritesLazyWriter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.mftWritesUserRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.mft2Writes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.mft2WriteBytes)
                    (NtfsStatistics1.typeLayout()).writeNative(addr + 48L, value.mft2WritesUserLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.mft2WritesFlushForLogFileFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.mft2WritesLazyWriter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.mft2WritesUserRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.rootIndexReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.rootIndexReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.rootIndexWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.rootIndexWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.bitmapReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.bitmapReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.bitmapWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.bitmapWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 96L, value.bitmapWritesFlushForLogFileFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 98L, value.bitmapWritesLazyWriter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 100L, value.bitmapWritesUserRequest)
                    (NtfsStatistics2.typeLayout()).writeNative(addr + 102L, value.bitmapWritesUserLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.mftBitmapReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.mftBitmapReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.mftBitmapWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.mftBitmapWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 124L, value.mftBitmapWritesFlushForLogFileFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 126L, value.mftBitmapWritesLazyWriter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 128L, value.mftBitmapWritesUserRequest)
                    (NtfsStatistics3.typeLayout()).writeNative(addr + 130L, value.mftBitmapWritesUserLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.userIndexReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.userIndexReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.userIndexWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.userIndexWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.logFileReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.logFileReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.logFileWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.logFileWriteBytes)
                    (NtfsStatistics4.typeLayout()).writeNative(addr + 172L, value.allocate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 212L, value.diskResourcesExhausted)
                }
            }
    }
}

public data class NtfsStatistics4(
    public var calls: UInt = 0u,
    public var clusters: UInt = 0u,
    public var hints: UInt = 0u,
    public var runsReturned: UInt = 0u,
    public var hintsHonored: UInt = 0u,
    public var hintsClusters: UInt = 0u,
    public var cache: UInt = 0u,
    public var cacheClusters: UInt = 0u,
    public var cacheMiss: UInt = 0u,
    public var cacheMissClusters: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics4> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): NtfsStatistics4 =
                    NtfsStatistics4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
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
                override fun writeNative(addr: Long, value: NtfsStatistics4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.calls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.clusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.runsReturned)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.hintsHonored)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.hintsClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cache)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cacheClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cacheMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cacheMissClusters)
                }
            }
    }
}

public data class NtfsStatistics2(
    public var write: UShort = 0u,
    public var create: UShort = 0u,
    public var setInfo: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): NtfsStatistics2 =
                    NtfsStatistics2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatistics2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.write)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.create)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.setInfo)
                }
            }
    }
}

public data class NtfsStatistics1(
    public var write: UShort = 0u,
    public var create: UShort = 0u,
    public var setInfo: UShort = 0u,
    public var flush: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics1> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NtfsStatistics1 =
                    NtfsStatistics1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatistics1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.write)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.create)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.setInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.flush)
                }
            }
    }
}

public data class NtfsStatistics3(
    public var write: UShort = 0u,
    public var create: UShort = 0u,
    public var setInfo: UShort = 0u,
    public var flush: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics3> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NtfsStatistics3 =
                    NtfsStatistics3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatistics3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.write)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.create)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.setInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.flush)
                }
            }
    }
}

public data class NtfsStatistics0(
    public var write: UShort = 0u,
    public var create: UShort = 0u,
    public var setInfo: UShort = 0u,
    public var flush: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatistics0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NtfsStatistics0 =
                    NtfsStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.write)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.create)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.setInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.flush)
                }
            }
    }
}

public class NtfsStatisticsEx(
    public var logFileFullExceptions: UInt = 0u,
    public var otherExceptions: UInt = 0u,
    public var mftReads: ULong = 0uL,
    public var mftReadBytes: ULong = 0uL,
    public var mftWrites: ULong = 0uL,
    public var mftWriteBytes: ULong = 0uL,
    public var mftWritesUserLevel: NtfsStatisticsEx0 = NtfsStatisticsEx0(),
    public var mftWritesFlushForLogFileFull: UInt = 0u,
    public var mftWritesLazyWriter: UInt = 0u,
    public var mftWritesUserRequest: UInt = 0u,
    public var mft2Writes: ULong = 0uL,
    public var mft2WriteBytes: ULong = 0uL,
    public var mft2WritesUserLevel: NtfsStatisticsEx1 = NtfsStatisticsEx1(),
    public var mft2WritesFlushForLogFileFull: UInt = 0u,
    public var mft2WritesLazyWriter: UInt = 0u,
    public var mft2WritesUserRequest: UInt = 0u,
    public var rootIndexReads: ULong = 0uL,
    public var rootIndexReadBytes: ULong = 0uL,
    public var rootIndexWrites: ULong = 0uL,
    public var rootIndexWriteBytes: ULong = 0uL,
    public var bitmapReads: ULong = 0uL,
    public var bitmapReadBytes: ULong = 0uL,
    public var bitmapWrites: ULong = 0uL,
    public var bitmapWriteBytes: ULong = 0uL,
    public var bitmapWritesFlushForLogFileFull: UInt = 0u,
    public var bitmapWritesLazyWriter: UInt = 0u,
    public var bitmapWritesUserRequest: UInt = 0u,
    public var bitmapWritesUserLevel: NtfsStatisticsEx2 = NtfsStatisticsEx2(),
    public var mftBitmapReads: ULong = 0uL,
    public var mftBitmapReadBytes: ULong = 0uL,
    public var mftBitmapWrites: ULong = 0uL,
    public var mftBitmapWriteBytes: ULong = 0uL,
    public var mftBitmapWritesFlushForLogFileFull: UInt = 0u,
    public var mftBitmapWritesLazyWriter: UInt = 0u,
    public var mftBitmapWritesUserRequest: UInt = 0u,
    public var mftBitmapWritesUserLevel: NtfsStatisticsEx3 = NtfsStatisticsEx3(),
    public var userIndexReads: ULong = 0uL,
    public var userIndexReadBytes: ULong = 0uL,
    public var userIndexWrites: ULong = 0uL,
    public var userIndexWriteBytes: ULong = 0uL,
    public var logFileReads: ULong = 0uL,
    public var logFileReadBytes: ULong = 0uL,
    public var logFileWrites: ULong = 0uL,
    public var logFileWriteBytes: ULong = 0uL,
    public var allocate: NtfsStatisticsEx4 = NtfsStatisticsEx4(),
    public var diskResourcesExhausted: UInt = 0u,
    public var volumeTrimCount: ULong = 0uL,
    public var volumeTrimTime: ULong = 0uL,
    public var volumeTrimByteCount: ULong = 0uL,
    public var fileLevelTrimCount: ULong = 0uL,
    public var fileLevelTrimTime: ULong = 0uL,
    public var fileLevelTrimByteCount: ULong = 0uL,
    public var volumeTrimSkippedCount: ULong = 0uL,
    public var volumeTrimSkippedByteCount: ULong = 0uL,
    public var ntfsFillStatInfoFromMftRecordCalledCount: ULong = 0uL,
    public var ntfsFillStatInfoFromMftRecordBailedBecauseOfAttributeListCount: ULong = 0uL,
    public var ntfsFillStatInfoFromMftRecordBailedBecauseOfNonResReparsePointCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 496L
                override fun readNative(addr: Long): NtfsStatisticsEx =
                    NtfsStatisticsEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (NtfsStatisticsEx0.typeLayout()).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (NtfsStatisticsEx1.typeLayout()).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                        (NtfsStatisticsEx2.typeLayout()).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 252L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 256L),
                        (NtfsStatisticsEx3.typeLayout()).readNative(addr + 260L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 280L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 296L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 304L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 312L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 320L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 328L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 336L),
                        (NtfsStatisticsEx4.typeLayout()).readNative(addr + 344L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 400L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 408L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 416L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 424L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 432L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 440L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 448L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 456L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 464L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 472L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 480L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 488L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatisticsEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.logFileFullExceptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.otherExceptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.mftReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.mftReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.mftWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.mftWriteBytes)
                    (NtfsStatisticsEx0.typeLayout()).writeNative(addr + 40L, value.mftWritesUserLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.mftWritesFlushForLogFileFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.mftWritesLazyWriter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.mftWritesUserRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.mft2Writes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.mft2WriteBytes)
                    (NtfsStatisticsEx1.typeLayout()).writeNative(addr + 88L, value.mft2WritesUserLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.mft2WritesFlushForLogFileFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.mft2WritesLazyWriter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.mft2WritesUserRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.rootIndexReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.rootIndexReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.rootIndexWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.rootIndexWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.bitmapReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.bitmapReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.bitmapWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.bitmapWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.bitmapWritesFlushForLogFileFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.bitmapWritesLazyWriter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.bitmapWritesUserRequest)
                    (NtfsStatisticsEx2.typeLayout()).writeNative(addr + 196L, value.bitmapWritesUserLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.mftBitmapReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 224L, value.mftBitmapReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 232L, value.mftBitmapWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 240L, value.mftBitmapWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 248L, value.mftBitmapWritesFlushForLogFileFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 252L, value.mftBitmapWritesLazyWriter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 256L, value.mftBitmapWritesUserRequest)
                    (NtfsStatisticsEx3.typeLayout()).writeNative(addr + 260L, value.mftBitmapWritesUserLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 280L, value.userIndexReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 288L, value.userIndexReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 296L, value.userIndexWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 304L, value.userIndexWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 312L, value.logFileReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 320L, value.logFileReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 328L, value.logFileWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 336L, value.logFileWriteBytes)
                    (NtfsStatisticsEx4.typeLayout()).writeNative(addr + 344L, value.allocate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 400L, value.diskResourcesExhausted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 408L, value.volumeTrimCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 416L, value.volumeTrimTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 424L, value.volumeTrimByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 432L, value.fileLevelTrimCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 440L, value.fileLevelTrimTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 448L, value.fileLevelTrimByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 456L, value.volumeTrimSkippedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 464L, value.volumeTrimSkippedByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 472L, value.ntfsFillStatInfoFromMftRecordCalledCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 480L, value.ntfsFillStatInfoFromMftRecordBailedBecauseOfAttributeListCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 488L, value.ntfsFillStatInfoFromMftRecordBailedBecauseOfNonResReparsePointCount)
                }
            }
    }
}

public data class NtfsStatisticsEx4(
    public var calls: UInt = 0u,
    public var runsReturned: UInt = 0u,
    public var hints: UInt = 0u,
    public var hintsHonored: UInt = 0u,
    public var cache: UInt = 0u,
    public var cacheMiss: UInt = 0u,
    public var clusters: ULong = 0uL,
    public var hintsClusters: ULong = 0uL,
    public var cacheClusters: ULong = 0uL,
    public var cacheMissClusters: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx4> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): NtfsStatisticsEx4 =
                    NtfsStatisticsEx4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatisticsEx4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.calls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.runsReturned)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hintsHonored)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cache)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cacheMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.clusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.hintsClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.cacheClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.cacheMissClusters)
                }
            }
    }
}

public data class NtfsStatisticsEx2(
    public var write: UInt = 0u,
    public var create: UInt = 0u,
    public var setInfo: UInt = 0u,
    public var flush: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NtfsStatisticsEx2 =
                    NtfsStatisticsEx2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatisticsEx2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.write)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.create)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.setInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flush)
                }
            }
    }
}

public data class NtfsStatisticsEx1(
    public var write: UInt = 0u,
    public var create: UInt = 0u,
    public var setInfo: UInt = 0u,
    public var flush: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NtfsStatisticsEx1 =
                    NtfsStatisticsEx1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatisticsEx1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.write)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.create)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.setInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flush)
                }
            }
    }
}

public data class NtfsStatisticsEx3(
    public var write: UInt = 0u,
    public var create: UInt = 0u,
    public var setInfo: UInt = 0u,
    public var flush: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NtfsStatisticsEx3 =
                    NtfsStatisticsEx3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatisticsEx3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.write)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.create)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.setInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flush)
                }
            }
    }
}

public data class NtfsStatisticsEx0(
    public var write: UInt = 0u,
    public var create: UInt = 0u,
    public var setInfo: UInt = 0u,
    public var flush: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsStatisticsEx0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NtfsStatisticsEx0 =
                    NtfsStatisticsEx0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NtfsStatisticsEx0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.write)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.create)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.setInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flush)
                }
            }
    }
}

public data class NtfsVolumeDataBuffer(
    public var volumeSerialNumber: Long = 0L,
    public var numberSectors: Long = 0L,
    public var totalClusters: Long = 0L,
    public var freeClusters: Long = 0L,
    public var totalReserved: Long = 0L,
    public var bytesPerSector: UInt = 0u,
    public var bytesPerCluster: UInt = 0u,
    public var bytesPerFileRecordSegment: UInt = 0u,
    public var clustersPerFileRecordSegment: UInt = 0u,
    public var mftValidDataLength: Long = 0L,
    public var mftStartLcn: Long = 0L,
    public var mft2StartLcn: Long = 0L,
    public var mftZoneStart: Long = 0L,
    public var mftZoneEnd: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsVolumeDataBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsVolumeDataBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): NtfsVolumeDataBuffer =
                    NtfsVolumeDataBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: NtfsVolumeDataBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.volumeSerialNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.numberSectors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.totalClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.freeClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.totalReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.bytesPerSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.bytesPerCluster)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.bytesPerFileRecordSegment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.clustersPerFileRecordSegment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.mftValidDataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.mftStartLcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.mft2StartLcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.mftZoneStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.mftZoneEnd)
                }
            }
    }
}

public data class PartitionInformation(
    public var startingOffset: Long = 0L,
    public var partitionLength: Long = 0L,
    public var hiddenSectors: UInt = 0u,
    public var partitionNumber: UInt = 0u,
    public var partitionType: UByte = 0u,
    public var bootIndicator: Boolean = false,
    public var recognizedPartition: Boolean = false,
    public var rewritePartition: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PartitionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PartitionInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PartitionInformation =
                    PartitionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 27L),
                    )
                override fun writeNative(addr: Long, value: PartitionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.partitionLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.hiddenSectors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.partitionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.partitionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 25L, value.bootIndicator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 26L, value.recognizedPartition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 27L, value.rewritePartition)
                }
            }
    }
}

public data class PartitionInformationEx(
    public var partitionStyle: PartitionStyle = 0,
    public var startingOffset: Long = 0L,
    public var partitionLength: Long = 0L,
    public var partitionNumber: UInt = 0u,
    public var rewritePartition: Boolean = false,
    public var isServicePartition: Boolean = false,
    public var anonymous: PartitionInformationEx0 = PartitionInformationEx0(),
)

public data class PartitionInformationEx0(
    public var mbr: PartitionInformationMbr = PartitionInformationMbr(),
    public var gpt: PartitionInformationGpt = PartitionInformationGpt(),
)

public data class PartitionInformationGpt(
    public var partitionType: Guid = Guid(),
    public var partitionId: Guid = Guid(),
    public var attributes: GptAttributes = 0uL,
    public var name: UShortArray = UShortArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PartitionInformationGpt) return false
        if (this.partitionType != other.partitionType) return false
        if (this.partitionId != other.partitionId) return false
        if (this.attributes != other.attributes) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.partitionType.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class PartitionInformationMbr(
    public var partitionType: UByte = 0u,
    public var bootIndicator: Boolean = false,
    public var recognizedPartition: Boolean = false,
    public var hiddenSectors: UInt = 0u,
    public var partitionId: Guid = Guid(),
)

public data class PathnameBuffer(
    public var pathNameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PathnameBuffer) return false
        if (this.pathNameLength != other.pathNameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pathNameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PathnameBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PathnameBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PathnameBuffer =
                    PathnameBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: PathnameBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pathNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.name.toList())
                }
            }
    }
}

public data class PerfBin(
    public var numberOfBins: UInt = 0u,
    public var typeOfBin: UInt = 0u,
    public var binsRanges: List<BinRange> = List(1) { BinRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfBin> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfBin> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PerfBin =
                    PerfBin(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(BinRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PerfBin) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfBins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.typeOfBin)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(BinRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.binsRanges)
                }
            }
    }
}

public data class PersistentReserveCommand(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var anonymous: PersistentReserveCommand0 = PersistentReserveCommand0(),
)

public data class PersistentReserveCommand0(
    public var prIn: PersistentReserveCommand00 = PersistentReserveCommand00(),
    public var prOut: PersistentReserveCommand01 = PersistentReserveCommand01(),
)

public data class PersistentReserveCommand00(
    public var bitfield: UByte = 0u,
    public var allocationLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PersistentReserveCommand00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PersistentReserveCommand00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PersistentReserveCommand00 =
                    PersistentReserveCommand00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: PersistentReserveCommand00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.allocationLength)
                }
            }
    }
}
