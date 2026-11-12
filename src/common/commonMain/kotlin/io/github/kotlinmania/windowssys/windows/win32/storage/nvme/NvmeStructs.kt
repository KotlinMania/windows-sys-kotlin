@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.nvme

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class ActiveLatencyConfiguration(
    public var anonymous: ActiveLatencyConfiguration0 = ActiveLatencyConfiguration0(),
)

public data class ActiveLatencyConfiguration0(
    public var anonymous: ActiveLatencyConfiguration00 = ActiveLatencyConfiguration00(),
    public var asUshort: UShort = 0u,
)

public data class ActiveLatencyConfiguration00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActiveLatencyConfiguration00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActiveLatencyConfiguration00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ActiveLatencyConfiguration00 =
                    ActiveLatencyConfiguration00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ActiveLatencyConfiguration00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class BucketCounter(
    public var reserved: UInt = 0u,
    public var trim: UInt = 0u,
    public var write: UInt = 0u,
    public var read: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BucketCounter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BucketCounter> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BucketCounter =
                    BucketCounter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: BucketCounter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.trim)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.write)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.read)
                }
            }
    }
}

public data class DebugBitField(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugBitField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugBitField> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): DebugBitField =
                    DebugBitField(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DebugBitField) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DssdPowerStateDescriptor(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DssdPowerStateDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DssdPowerStateDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): DssdPowerStateDescriptor =
                    DssdPowerStateDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DssdPowerStateDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class FirmwareActivationHistoryEntry(
    public var versionNumber: UByte = 0u,
    public var length: UByte = 0u,
    public var reserved0: UShort = 0u,
    public var activationCount: UShort = 0u,
    public var timestamp: ULong = 0uL,
    public var reserved1: ULong = 0uL,
    public var powerCycleCount: ULong = 0uL,
    public var previousFirmware: ULong = 0uL,
    public var newFirmware: ULong = 0uL,
    public var slotNumber: UByte = 0u,
    public var commitActionType: UByte = 0u,
    public var result: UShort = 0u,
    public var reserved2: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FirmwareActivationHistoryEntry) return false
        if (this.versionNumber != other.versionNumber) return false
        if (this.length != other.length) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.activationCount != other.activationCount) return false
        if (this.timestamp != other.timestamp) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.powerCycleCount != other.powerCycleCount) return false
        if (this.previousFirmware != other.previousFirmware) return false
        if (this.newFirmware != other.newFirmware) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.commitActionType != other.commitActionType) return false
        if (this.result != other.result) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.versionNumber.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.activationCount.hashCode()
        result = 31 * result + this.timestamp.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.powerCycleCount.hashCode()
        result = 31 * result + this.previousFirmware.hashCode()
        result = 31 * result + this.newFirmware.hashCode()
        result = 31 * result + this.slotNumber.hashCode()
        result = 31 * result + this.commitActionType.hashCode()
        result = 31 * result + this.result.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FirmwareActivationHistoryEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FirmwareActivationHistoryEntry> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): FirmwareActivationHistoryEntry =
                    FirmwareActivationHistoryEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 38L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 47L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 50L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FirmwareActivationHistoryEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.versionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.activationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 6L, value.timestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 14L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 22L, value.powerCycleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 30L, value.previousFirmware)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 38L, value.newFirmware)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 46L, value.slotNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 47L, value.commitActionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.result)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 50L, value.reserved2.toList())
                }
            }
    }
}

public data class LatencyMonitorFeatureStatus(
    public var anonymous: LatencyMonitorFeatureStatus0 = LatencyMonitorFeatureStatus0(),
)

public data class LatencyMonitorFeatureStatus0(
    public var anonymous: LatencyMonitorFeatureStatus00 = LatencyMonitorFeatureStatus00(),
    public var asUchar: UByte = 0u,
)

public data class LatencyMonitorFeatureStatus00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LatencyMonitorFeatureStatus00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LatencyMonitorFeatureStatus00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): LatencyMonitorFeatureStatus00 =
                    LatencyMonitorFeatureStatus00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: LatencyMonitorFeatureStatus00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class LatencyStamp(
    public var trim3: ULong = 0uL,
    public var write3: ULong = 0uL,
    public var read3: ULong = 0uL,
    public var trim2: ULong = 0uL,
    public var write2: ULong = 0uL,
    public var read2: ULong = 0uL,
    public var trim1: ULong = 0uL,
    public var write1: ULong = 0uL,
    public var read1: ULong = 0uL,
    public var trim0: ULong = 0uL,
    public var write0: ULong = 0uL,
    public var read0: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LatencyStamp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LatencyStamp> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): LatencyStamp =
                    LatencyStamp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
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
                    )
                override fun writeNative(addr: Long, value: LatencyStamp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.trim3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.write3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.read3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.trim2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.write2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.read2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.trim1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.write1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.read1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.trim0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.write0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.read0)
                }
            }
    }
}

public data class LatencyStampUnits(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LatencyStampUnits> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LatencyStampUnits> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): LatencyStampUnits =
                    LatencyStampUnits(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: LatencyStampUnits) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MeasuredLatency(
    public var trim3: UShort = 0u,
    public var write3: UShort = 0u,
    public var read3: UShort = 0u,
    public var trim2: UShort = 0u,
    public var write2: UShort = 0u,
    public var read2: UShort = 0u,
    public var trim1: UShort = 0u,
    public var write1: UShort = 0u,
    public var read1: UShort = 0u,
    public var trim0: UShort = 0u,
    public var write0: UShort = 0u,
    public var read0: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MeasuredLatency> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MeasuredLatency> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MeasuredLatency =
                    MeasuredLatency(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
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
                    )
                override fun writeNative(addr: Long, value: MeasuredLatency) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.trim3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.write3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.read3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.trim2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.write2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.read2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.trim1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.write1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.read1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.trim0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.write0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.read0)
                }
            }
    }
}

public data class NvmeActiveNamespaceIdList(
    public var nsid: UIntArray = UIntArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeActiveNamespaceIdList) return false
        if (!this.nsid.contentEquals(other.nsid)) return false
        return true
    }

    override fun hashCode(): Int = this.nsid.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeActiveNamespaceIdList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeActiveNamespaceIdList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4096L
                override fun readNative(addr: Long): NvmeActiveNamespaceIdList =
                    NvmeActiveNamespaceIdList(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1024).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: NvmeActiveNamespaceIdList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1024).toInt())
                    ).writeNative(addr, value.nsid.toList())
                }
            }
    }
}

public data class NvmeAdminCompletionQueueBaseAddress(
    public var anonymous: NvmeAdminCompletionQueueBaseAddress0 = NvmeAdminCompletionQueueBaseAddress0(),
    public var asUlonglong: ULong = 0uL,
)

public data class NvmeAdminCompletionQueueBaseAddress0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeAdminCompletionQueueBaseAddress0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeAdminCompletionQueueBaseAddress0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NvmeAdminCompletionQueueBaseAddress0 =
                    NvmeAdminCompletionQueueBaseAddress0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeAdminCompletionQueueBaseAddress0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeAdminQueueAttributes(
    public var anonymous: NvmeAdminQueueAttributes0 = NvmeAdminQueueAttributes0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeAdminQueueAttributes0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeAdminQueueAttributes0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeAdminQueueAttributes0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeAdminQueueAttributes0 =
                    NvmeAdminQueueAttributes0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeAdminQueueAttributes0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeAdminSubmissionQueueBaseAddress(
    public var anonymous: NvmeAdminSubmissionQueueBaseAddress0 = NvmeAdminSubmissionQueueBaseAddress0(),
    public var asUlonglong: ULong = 0uL,
)

public data class NvmeAdminSubmissionQueueBaseAddress0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeAdminSubmissionQueueBaseAddress0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeAdminSubmissionQueueBaseAddress0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NvmeAdminSubmissionQueueBaseAddress0 =
                    NvmeAdminSubmissionQueueBaseAddress0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeAdminSubmissionQueueBaseAddress0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeAutoPowerStateTransitionEntry(
    public var bitfield: UInt = 0u,
    public var reserved1: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeAutoPowerStateTransitionEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeAutoPowerStateTransitionEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NvmeAutoPowerStateTransitionEntry =
                    NvmeAutoPowerStateTransitionEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NvmeAutoPowerStateTransitionEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved1)
                }
            }
    }
}

public data class NvmeCdw0FeatureEnableIeee1667Silo(
    public var anonymous: NvmeCdw0FeatureEnableIeee1667Silo0 = NvmeCdw0FeatureEnableIeee1667Silo0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw0FeatureEnableIeee1667Silo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw0FeatureEnableIeee1667Silo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw0FeatureEnableIeee1667Silo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw0FeatureEnableIeee1667Silo0 =
                    NvmeCdw0FeatureEnableIeee1667Silo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw0FeatureEnableIeee1667Silo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw0FeatureErrorInjection(
    public var anonymous: NvmeCdw0FeatureErrorInjection0 = NvmeCdw0FeatureErrorInjection0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw0FeatureErrorInjection0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw0FeatureErrorInjection0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw0FeatureErrorInjection0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw0FeatureErrorInjection0 =
                    NvmeCdw0FeatureErrorInjection0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw0FeatureErrorInjection0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw0FeatureReadonlyWritethroughMode(
    public var anonymous: NvmeCdw0FeatureReadonlyWritethroughMode0 = NvmeCdw0FeatureReadonlyWritethroughMode0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw0FeatureReadonlyWritethroughMode0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw0FeatureReadonlyWritethroughMode0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw0FeatureReadonlyWritethroughMode0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw0FeatureReadonlyWritethroughMode0 =
                    NvmeCdw0FeatureReadonlyWritethroughMode0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw0FeatureReadonlyWritethroughMode0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw0ReservationPersistence(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw0ReservationPersistence> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw0ReservationPersistence> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw0ReservationPersistence =
                    NvmeCdw0ReservationPersistence(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw0ReservationPersistence) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10Abort(
    public var anonymous: NvmeCdw10Abort0 = NvmeCdw10Abort0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10Abort0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10Abort0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10Abort0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10Abort0 =
                    NvmeCdw10Abort0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10Abort0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10CreateIoQueue(
    public var anonymous: NvmeCdw10CreateIoQueue0 = NvmeCdw10CreateIoQueue0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10CreateIoQueue0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10CreateIoQueue0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10CreateIoQueue0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10CreateIoQueue0 =
                    NvmeCdw10CreateIoQueue0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10CreateIoQueue0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10DatasetManagement(
    public var anonymous: NvmeCdw10DatasetManagement0 = NvmeCdw10DatasetManagement0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10DatasetManagement0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10DatasetManagement0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10DatasetManagement0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10DatasetManagement0 =
                    NvmeCdw10DatasetManagement0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10DatasetManagement0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10DirectiveReceive(
    public var numd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10DirectiveReceive> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10DirectiveReceive> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10DirectiveReceive =
                    NvmeCdw10DirectiveReceive(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10DirectiveReceive) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numd)
                }
            }
    }
}

public data class NvmeCdw10DirectiveSend(
    public var numd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10DirectiveSend> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10DirectiveSend> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10DirectiveSend =
                    NvmeCdw10DirectiveSend(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10DirectiveSend) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numd)
                }
            }
    }
}

public data class NvmeCdw10FirmwareActivate(
    public var anonymous: NvmeCdw10FirmwareActivate0 = NvmeCdw10FirmwareActivate0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10FirmwareActivate0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10FirmwareActivate0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10FirmwareActivate0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10FirmwareActivate0 =
                    NvmeCdw10FirmwareActivate0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10FirmwareActivate0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10FirmwareDownload(
    public var numd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10FirmwareDownload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10FirmwareDownload> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10FirmwareDownload =
                    NvmeCdw10FirmwareDownload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10FirmwareDownload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numd)
                }
            }
    }
}

public data class NvmeCdw10FormatNvm(
    public var anonymous: NvmeCdw10FormatNvm0 = NvmeCdw10FormatNvm0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10FormatNvm0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10FormatNvm0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10FormatNvm0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10FormatNvm0 =
                    NvmeCdw10FormatNvm0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10FormatNvm0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10GetFeatures(
    public var anonymous: NvmeCdw10GetFeatures0 = NvmeCdw10GetFeatures0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10GetFeatures0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10GetFeatures0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10GetFeatures0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10GetFeatures0 =
                    NvmeCdw10GetFeatures0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10GetFeatures0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10GetLogPage(
    public var anonymous: NvmeCdw10GetLogPage0 = NvmeCdw10GetLogPage0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10GetLogPage0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10GetLogPage0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10GetLogPage0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10GetLogPage0 =
                    NvmeCdw10GetLogPage0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10GetLogPage0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10GetLogPageV13(
    public var anonymous: NvmeCdw10GetLogPageV130 = NvmeCdw10GetLogPageV130(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10GetLogPageV130(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10GetLogPageV130> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10GetLogPageV130> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10GetLogPageV130 =
                    NvmeCdw10GetLogPageV130(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10GetLogPageV130) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10Identify(
    public var anonymous: NvmeCdw10Identify0 = NvmeCdw10Identify0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10Identify0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10Identify0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10Identify0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10Identify0 =
                    NvmeCdw10Identify0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10Identify0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10ReservationAcquire(
    public var anonymous: NvmeCdw10ReservationAcquire0 = NvmeCdw10ReservationAcquire0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10ReservationAcquire0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ReservationAcquire0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ReservationAcquire0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10ReservationAcquire0 =
                    NvmeCdw10ReservationAcquire0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10ReservationAcquire0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10ReservationRegister(
    public var anonymous: NvmeCdw10ReservationRegister0 = NvmeCdw10ReservationRegister0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10ReservationRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ReservationRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ReservationRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10ReservationRegister0 =
                    NvmeCdw10ReservationRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10ReservationRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10ReservationRelease(
    public var anonymous: NvmeCdw10ReservationRelease0 = NvmeCdw10ReservationRelease0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10ReservationRelease0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ReservationRelease0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ReservationRelease0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10ReservationRelease0 =
                    NvmeCdw10ReservationRelease0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10ReservationRelease0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10ReservationReport(
    public var anonymous: NvmeCdw10ReservationReport0 = NvmeCdw10ReservationReport0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10ReservationReport0(
    public var numd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ReservationReport0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ReservationReport0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10ReservationReport0 =
                    NvmeCdw10ReservationReport0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10ReservationReport0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numd)
                }
            }
    }
}

public data class NvmeCdw10Sanitize(
    public var anonymous: NvmeCdw10Sanitize0 = NvmeCdw10Sanitize0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10Sanitize0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10Sanitize0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10Sanitize0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10Sanitize0 =
                    NvmeCdw10Sanitize0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10Sanitize0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10SecuritySendReceive(
    public var anonymous: NvmeCdw10SecuritySendReceive0 = NvmeCdw10SecuritySendReceive0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10SecuritySendReceive0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10SecuritySendReceive0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10SecuritySendReceive0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10SecuritySendReceive0 =
                    NvmeCdw10SecuritySendReceive0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10SecuritySendReceive0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10SetFeatures(
    public var anonymous: NvmeCdw10SetFeatures0 = NvmeCdw10SetFeatures0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw10SetFeatures0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10SetFeatures0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10SetFeatures0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw10SetFeatures0 =
                    NvmeCdw10SetFeatures0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10SetFeatures0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw10ZoneAppend(
    public var slba: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ZoneAppend> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ZoneAppend> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NvmeCdw10ZoneAppend =
                    NvmeCdw10ZoneAppend(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10ZoneAppend) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.slba)
                }
            }
    }
}

public data class NvmeCdw10ZoneManagementReceive(
    public var slba: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ZoneManagementReceive> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ZoneManagementReceive> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NvmeCdw10ZoneManagementReceive =
                    NvmeCdw10ZoneManagementReceive(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10ZoneManagementReceive) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.slba)
                }
            }
    }
}

public data class NvmeCdw10ZoneManagementSend(
    public var slba: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ZoneManagementSend> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw10ZoneManagementSend> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NvmeCdw10ZoneManagementSend =
                    NvmeCdw10ZoneManagementSend(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw10ZoneManagementSend) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.slba)
                }
            }
    }
}

public data class NvmeCdw11CreateIoCq(
    public var anonymous: NvmeCdw11CreateIoCq0 = NvmeCdw11CreateIoCq0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11CreateIoCq0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11CreateIoCq0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11CreateIoCq0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11CreateIoCq0 =
                    NvmeCdw11CreateIoCq0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11CreateIoCq0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11CreateIoSq(
    public var anonymous: NvmeCdw11CreateIoSq0 = NvmeCdw11CreateIoSq0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11CreateIoSq0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11CreateIoSq0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11CreateIoSq0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11CreateIoSq0 =
                    NvmeCdw11CreateIoSq0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11CreateIoSq0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11DatasetManagement(
    public var anonymous: NvmeCdw11DatasetManagement0 = NvmeCdw11DatasetManagement0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11DatasetManagement0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11DatasetManagement0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11DatasetManagement0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11DatasetManagement0 =
                    NvmeCdw11DatasetManagement0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11DatasetManagement0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11DirectiveReceive(
    public var anonymous: NvmeCdw11DirectiveReceive0 = NvmeCdw11DirectiveReceive0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11DirectiveReceive0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11DirectiveReceive0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11DirectiveReceive0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11DirectiveReceive0 =
                    NvmeCdw11DirectiveReceive0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11DirectiveReceive0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11DirectiveSend(
    public var anonymous: NvmeCdw11DirectiveSend0 = NvmeCdw11DirectiveSend0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11DirectiveSend0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11DirectiveSend0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11DirectiveSend0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11DirectiveSend0 =
                    NvmeCdw11DirectiveSend0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11DirectiveSend0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class NvmeCdw11Features(
    public var numberOfQueues: NvmeCdw11FeatureNumberOfQueues = NvmeCdw11FeatureNumberOfQueues(),
    public var interruptCoalescing: NvmeCdw11FeatureInterruptCoalescing = NvmeCdw11FeatureInterruptCoalescing(),
    public var interruptVectorConfig: NvmeCdw11FeatureInterruptVectorConfig = NvmeCdw11FeatureInterruptVectorConfig(),
    public var lbaRangeType: NvmeCdw11FeatureLbaRangeType = NvmeCdw11FeatureLbaRangeType(),
    public var arbitration: NvmeCdw11FeatureArbitration = NvmeCdw11FeatureArbitration(),
    public var volatileWriteCache: NvmeCdw11FeatureVolatileWriteCache = NvmeCdw11FeatureVolatileWriteCache(),
    public var asyncEventConfig: NvmeCdw11FeatureAsyncEventConfig = NvmeCdw11FeatureAsyncEventConfig(),
    public var powerManagement: NvmeCdw11FeaturePowerManagement = NvmeCdw11FeaturePowerManagement(),
    public var autoPowerStateTransition: NvmeCdw11FeatureAutoPowerStateTransition = NvmeCdw11FeatureAutoPowerStateTransition(),
    public var temperatureThreshold: NvmeCdw11FeatureTemperatureThreshold = NvmeCdw11FeatureTemperatureThreshold(),
    public var errorRecovery: NvmeCdw11FeatureErrorRecovery = NvmeCdw11FeatureErrorRecovery(),
    public var hostMemoryBuffer: NvmeCdw11FeatureHostMemoryBuffer = NvmeCdw11FeatureHostMemoryBuffer(),
    public var writeAtomicityNormal: NvmeCdw11FeatureWriteAtomicityNormal = NvmeCdw11FeatureWriteAtomicityNormal(),
    public var nonOperationalPowerState: NvmeCdw11FeatureNonOperationalPowerState = NvmeCdw11FeatureNonOperationalPowerState(),
    public var ioCommandSetProfile: NvmeCdw11FeatureIoCommandSetProfile = NvmeCdw11FeatureIoCommandSetProfile(),
    public var errorInjection: NvmeCdw0FeatureErrorInjection = NvmeCdw0FeatureErrorInjection(),
    public var hostIdentifier: NvmeCdw11FeatureHostIdentifier = NvmeCdw11FeatureHostIdentifier(),
    public var reservationPersistence: NvmeCdw11FeatureReservationPersistence = NvmeCdw11FeatureReservationPersistence(),
    public var reservationNotificationMask: NvmeCdw11FeatureReservationNotificationMask = NvmeCdw11FeatureReservationNotificationMask(),
    public var getHostMetadata: NvmeCdw11FeatureGetHostMetadata = NvmeCdw11FeatureGetHostMetadata(),
    public var setHostMetadata: NvmeCdw11FeatureSetHostMetadata = NvmeCdw11FeatureSetHostMetadata(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureArbitration(
    public var anonymous: NvmeCdw11FeatureArbitration0 = NvmeCdw11FeatureArbitration0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureArbitration0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureArbitration0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureArbitration0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureArbitration0 =
                    NvmeCdw11FeatureArbitration0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureArbitration0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureAsyncEventConfig(
    public var anonymous: NvmeCdw11FeatureAsyncEventConfig0 = NvmeCdw11FeatureAsyncEventConfig0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureAsyncEventConfig0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureAsyncEventConfig0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureAsyncEventConfig0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureAsyncEventConfig0 =
                    NvmeCdw11FeatureAsyncEventConfig0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureAsyncEventConfig0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureAutoPowerStateTransition(
    public var anonymous: NvmeCdw11FeatureAutoPowerStateTransition0 = NvmeCdw11FeatureAutoPowerStateTransition0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureAutoPowerStateTransition0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureAutoPowerStateTransition0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureAutoPowerStateTransition0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureAutoPowerStateTransition0 =
                    NvmeCdw11FeatureAutoPowerStateTransition0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureAutoPowerStateTransition0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureClearFwUpdateHistory(
    public var anonymous: NvmeCdw11FeatureClearFwUpdateHistory0 = NvmeCdw11FeatureClearFwUpdateHistory0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureClearFwUpdateHistory0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureClearFwUpdateHistory0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureClearFwUpdateHistory0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureClearFwUpdateHistory0 =
                    NvmeCdw11FeatureClearFwUpdateHistory0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureClearFwUpdateHistory0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureClearPcieCorrectableErrorCounters(
    public var anonymous: NvmeCdw11FeatureClearPcieCorrectableErrorCounters0 = NvmeCdw11FeatureClearPcieCorrectableErrorCounters0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureClearPcieCorrectableErrorCounters0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureClearPcieCorrectableErrorCounters0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureClearPcieCorrectableErrorCounters0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureClearPcieCorrectableErrorCounters0 =
                    NvmeCdw11FeatureClearPcieCorrectableErrorCounters0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureClearPcieCorrectableErrorCounters0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureEnableIeee1667Silo(
    public var anonymous: NvmeCdw11FeatureEnableIeee1667Silo0 = NvmeCdw11FeatureEnableIeee1667Silo0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureEnableIeee1667Silo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureEnableIeee1667Silo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureEnableIeee1667Silo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureEnableIeee1667Silo0 =
                    NvmeCdw11FeatureEnableIeee1667Silo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureEnableIeee1667Silo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureErrorRecovery(
    public var anonymous: NvmeCdw11FeatureErrorRecovery0 = NvmeCdw11FeatureErrorRecovery0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureErrorRecovery0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureErrorRecovery0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureErrorRecovery0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureErrorRecovery0 =
                    NvmeCdw11FeatureErrorRecovery0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureErrorRecovery0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureGetHostMetadata(
    public var anonymous: NvmeCdw11FeatureGetHostMetadata0 = NvmeCdw11FeatureGetHostMetadata0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureGetHostMetadata0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureGetHostMetadata0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureGetHostMetadata0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureGetHostMetadata0 =
                    NvmeCdw11FeatureGetHostMetadata0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureGetHostMetadata0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureHostIdentifier(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureHostIdentifier> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureHostIdentifier> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureHostIdentifier =
                    NvmeCdw11FeatureHostIdentifier(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureHostIdentifier) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureHostMemoryBuffer(
    public var anonymous: NvmeCdw11FeatureHostMemoryBuffer0 = NvmeCdw11FeatureHostMemoryBuffer0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureHostMemoryBuffer0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureHostMemoryBuffer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureHostMemoryBuffer0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureHostMemoryBuffer0 =
                    NvmeCdw11FeatureHostMemoryBuffer0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureHostMemoryBuffer0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureInterruptCoalescing(
    public var anonymous: NvmeCdw11FeatureInterruptCoalescing0 = NvmeCdw11FeatureInterruptCoalescing0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureInterruptCoalescing0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureInterruptCoalescing0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureInterruptCoalescing0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureInterruptCoalescing0 =
                    NvmeCdw11FeatureInterruptCoalescing0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureInterruptCoalescing0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureInterruptVectorConfig(
    public var anonymous: NvmeCdw11FeatureInterruptVectorConfig0 = NvmeCdw11FeatureInterruptVectorConfig0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureInterruptVectorConfig0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureInterruptVectorConfig0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureInterruptVectorConfig0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureInterruptVectorConfig0 =
                    NvmeCdw11FeatureInterruptVectorConfig0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureInterruptVectorConfig0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureIoCommandSetProfile(
    public var anonymous: NvmeCdw11FeatureIoCommandSetProfile0 = NvmeCdw11FeatureIoCommandSetProfile0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureIoCommandSetProfile0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureIoCommandSetProfile0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureIoCommandSetProfile0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureIoCommandSetProfile0 =
                    NvmeCdw11FeatureIoCommandSetProfile0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureIoCommandSetProfile0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureLbaRangeType(
    public var anonymous: NvmeCdw11FeatureLbaRangeType0 = NvmeCdw11FeatureLbaRangeType0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureLbaRangeType0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureLbaRangeType0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureLbaRangeType0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureLbaRangeType0 =
                    NvmeCdw11FeatureLbaRangeType0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureLbaRangeType0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureNonOperationalPowerState(
    public var anonymous: NvmeCdw11FeatureNonOperationalPowerState0 = NvmeCdw11FeatureNonOperationalPowerState0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureNonOperationalPowerState0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureNonOperationalPowerState0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureNonOperationalPowerState0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureNonOperationalPowerState0 =
                    NvmeCdw11FeatureNonOperationalPowerState0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureNonOperationalPowerState0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureNumberOfQueues(
    public var anonymous: NvmeCdw11FeatureNumberOfQueues0 = NvmeCdw11FeatureNumberOfQueues0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureNumberOfQueues0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureNumberOfQueues0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureNumberOfQueues0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureNumberOfQueues0 =
                    NvmeCdw11FeatureNumberOfQueues0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureNumberOfQueues0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeaturePowerManagement(
    public var anonymous: NvmeCdw11FeaturePowerManagement0 = NvmeCdw11FeaturePowerManagement0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeaturePowerManagement0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeaturePowerManagement0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeaturePowerManagement0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeaturePowerManagement0 =
                    NvmeCdw11FeaturePowerManagement0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeaturePowerManagement0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureReadonlyWritethroughMode(
    public var anonymous: NvmeCdw11FeatureReadonlyWritethroughMode0 = NvmeCdw11FeatureReadonlyWritethroughMode0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureReadonlyWritethroughMode0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureReadonlyWritethroughMode0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureReadonlyWritethroughMode0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureReadonlyWritethroughMode0 =
                    NvmeCdw11FeatureReadonlyWritethroughMode0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureReadonlyWritethroughMode0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureReservationNotificationMask(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureReservationNotificationMask> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureReservationNotificationMask> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureReservationNotificationMask =
                    NvmeCdw11FeatureReservationNotificationMask(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureReservationNotificationMask) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureReservationPersistence(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureReservationPersistence> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureReservationPersistence> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureReservationPersistence =
                    NvmeCdw11FeatureReservationPersistence(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureReservationPersistence) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureSetHostMetadata(
    public var anonymous: NvmeCdw11FeatureSetHostMetadata0 = NvmeCdw11FeatureSetHostMetadata0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureSetHostMetadata0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureSetHostMetadata0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureSetHostMetadata0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureSetHostMetadata0 =
                    NvmeCdw11FeatureSetHostMetadata0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureSetHostMetadata0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureSupportedCapability(
    public var anonymous: NvmeCdw11FeatureSupportedCapability0 = NvmeCdw11FeatureSupportedCapability0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureSupportedCapability0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureSupportedCapability0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureSupportedCapability0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureSupportedCapability0 =
                    NvmeCdw11FeatureSupportedCapability0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureSupportedCapability0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureTemperatureThreshold(
    public var anonymous: NvmeCdw11FeatureTemperatureThreshold0 = NvmeCdw11FeatureTemperatureThreshold0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureTemperatureThreshold0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureTemperatureThreshold0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureTemperatureThreshold0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureTemperatureThreshold0 =
                    NvmeCdw11FeatureTemperatureThreshold0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureTemperatureThreshold0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureVolatileWriteCache(
    public var anonymous: NvmeCdw11FeatureVolatileWriteCache0 = NvmeCdw11FeatureVolatileWriteCache0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureVolatileWriteCache0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureVolatileWriteCache0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureVolatileWriteCache0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureVolatileWriteCache0 =
                    NvmeCdw11FeatureVolatileWriteCache0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureVolatileWriteCache0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FeatureWriteAtomicityNormal(
    public var anonymous: NvmeCdw11FeatureWriteAtomicityNormal0 = NvmeCdw11FeatureWriteAtomicityNormal0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11FeatureWriteAtomicityNormal0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureWriteAtomicityNormal0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FeatureWriteAtomicityNormal0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FeatureWriteAtomicityNormal0 =
                    NvmeCdw11FeatureWriteAtomicityNormal0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FeatureWriteAtomicityNormal0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11FirmwareDownload(
    public var ofst: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FirmwareDownload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11FirmwareDownload> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11FirmwareDownload =
                    NvmeCdw11FirmwareDownload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11FirmwareDownload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ofst)
                }
            }
    }
}

public data class NvmeCdw11GetLogPage(
    public var anonymous: NvmeCdw11GetLogPage0 = NvmeCdw11GetLogPage0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11GetLogPage0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11GetLogPage0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11GetLogPage0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11GetLogPage0 =
                    NvmeCdw11GetLogPage0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11GetLogPage0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11Identify(
    public var anonymous1: NvmeCdw11Identify0 = NvmeCdw11Identify0(),
    public var anonymous2: NvmeCdw11Identify1 = NvmeCdw11Identify1(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11Identify0(
    public var nvmsetid: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11Identify0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11Identify0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11Identify0 =
                    NvmeCdw11Identify0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11Identify0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nvmsetid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                }
            }
    }
}

public data class NvmeCdw11Identify1(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11Identify1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11Identify1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11Identify1 =
                    NvmeCdw11Identify1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11Identify1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11ReservationReport(
    public var anonymous: NvmeCdw11ReservationReport0 = NvmeCdw11ReservationReport0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11ReservationReport0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11ReservationReport0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11ReservationReport0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11ReservationReport0 =
                    NvmeCdw11ReservationReport0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11ReservationReport0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw11Sanitize(
    public var anonymous: NvmeCdw11Sanitize0 = NvmeCdw11Sanitize0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw11Sanitize0(
    public var ovrpat: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11Sanitize0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11Sanitize0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11Sanitize0 =
                    NvmeCdw11Sanitize0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11Sanitize0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ovrpat)
                }
            }
    }
}

public data class NvmeCdw11SecurityReceive(
    public var al: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11SecurityReceive> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11SecurityReceive> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11SecurityReceive =
                    NvmeCdw11SecurityReceive(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11SecurityReceive) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.al)
                }
            }
    }
}

public data class NvmeCdw11SecuritySend(
    public var tl: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11SecuritySend> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw11SecuritySend> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw11SecuritySend =
                    NvmeCdw11SecuritySend(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw11SecuritySend) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tl)
                }
            }
    }
}

public data class NvmeCdw12DirectiveReceive(
    public var allocateResources: NvmeCdw12DirectiveReceiveStreamsAllocateResources = NvmeCdw12DirectiveReceiveStreamsAllocateResources(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw12DirectiveReceiveStreamsAllocateResources(
    public var anonymous: NvmeCdw12DirectiveReceiveStreamsAllocateResources0 = NvmeCdw12DirectiveReceiveStreamsAllocateResources0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw12DirectiveReceiveStreamsAllocateResources0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12DirectiveReceiveStreamsAllocateResources0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12DirectiveReceiveStreamsAllocateResources0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw12DirectiveReceiveStreamsAllocateResources0 =
                    NvmeCdw12DirectiveReceiveStreamsAllocateResources0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw12DirectiveReceiveStreamsAllocateResources0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw12DirectiveSend(
    public var enableDirective: NvmeCdw12DirectiveSendIdentifyEnableDirective = NvmeCdw12DirectiveSendIdentifyEnableDirective(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw12DirectiveSendIdentifyEnableDirective(
    public var anonymous: NvmeCdw12DirectiveSendIdentifyEnableDirective0 = NvmeCdw12DirectiveSendIdentifyEnableDirective0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw12DirectiveSendIdentifyEnableDirective0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12DirectiveSendIdentifyEnableDirective0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12DirectiveSendIdentifyEnableDirective0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw12DirectiveSendIdentifyEnableDirective0 =
                    NvmeCdw12DirectiveSendIdentifyEnableDirective0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw12DirectiveSendIdentifyEnableDirective0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw12Features(
    public var hostMemoryBuffer: NvmeCdw12FeatureHostMemoryBuffer = NvmeCdw12FeatureHostMemoryBuffer(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw12FeatureHostMemoryBuffer(
    public var anonymous: NvmeCdw12FeatureHostMemoryBuffer0 = NvmeCdw12FeatureHostMemoryBuffer0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw12FeatureHostMemoryBuffer0(
    public var hsize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12FeatureHostMemoryBuffer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12FeatureHostMemoryBuffer0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw12FeatureHostMemoryBuffer0 =
                    NvmeCdw12FeatureHostMemoryBuffer0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw12FeatureHostMemoryBuffer0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hsize)
                }
            }
    }
}

public data class NvmeCdw12GetLogPage(
    public var lpol: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12GetLogPage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12GetLogPage> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw12GetLogPage =
                    NvmeCdw12GetLogPage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw12GetLogPage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lpol)
                }
            }
    }
}

public data class NvmeCdw12ReadWrite(
    public var anonymous: NvmeCdw12ReadWrite0 = NvmeCdw12ReadWrite0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw12ReadWrite0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12ReadWrite0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12ReadWrite0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw12ReadWrite0 =
                    NvmeCdw12ReadWrite0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw12ReadWrite0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw12ZoneAppend(
    public var anonymous: NvmeCdw12ZoneAppend0 = NvmeCdw12ZoneAppend0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw12ZoneAppend0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12ZoneAppend0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw12ZoneAppend0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw12ZoneAppend0 =
                    NvmeCdw12ZoneAppend0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw12ZoneAppend0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw13Features(
    public var hostMemoryBuffer: NvmeCdw13FeatureHostMemoryBuffer = NvmeCdw13FeatureHostMemoryBuffer(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw13FeatureHostMemoryBuffer(
    public var anonymous: NvmeCdw13FeatureHostMemoryBuffer0 = NvmeCdw13FeatureHostMemoryBuffer0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw13FeatureHostMemoryBuffer0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13FeatureHostMemoryBuffer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13FeatureHostMemoryBuffer0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw13FeatureHostMemoryBuffer0 =
                    NvmeCdw13FeatureHostMemoryBuffer0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw13FeatureHostMemoryBuffer0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw13GetLogPage(
    public var lpou: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13GetLogPage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13GetLogPage> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw13GetLogPage =
                    NvmeCdw13GetLogPage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw13GetLogPage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lpou)
                }
            }
    }
}

public data class NvmeCdw13ReadWrite(
    public var anonymous: NvmeCdw13ReadWrite0 = NvmeCdw13ReadWrite0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw13ReadWrite0(
    public var dsm: NvmeCdw13ReadWrite00 = NvmeCdw13ReadWrite00(),
    public var reserved: UByte = 0u,
    public var dspec: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13ReadWrite0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13ReadWrite0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw13ReadWrite0 =
                    NvmeCdw13ReadWrite0(
                        (NvmeCdw13ReadWrite00.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw13ReadWrite0) {
                    (NvmeCdw13ReadWrite00.typeLayout()).writeNative(addr, value.dsm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.dspec)
                }
            }
    }
}

public data class NvmeCdw13ReadWrite00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13ReadWrite00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13ReadWrite00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): NvmeCdw13ReadWrite00 =
                    NvmeCdw13ReadWrite00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw13ReadWrite00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw13ZoneManagementReceive(
    public var anonymous: NvmeCdw13ZoneManagementReceive0 = NvmeCdw13ZoneManagementReceive0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw13ZoneManagementReceive0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13ZoneManagementReceive0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13ZoneManagementReceive0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw13ZoneManagementReceive0 =
                    NvmeCdw13ZoneManagementReceive0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw13ZoneManagementReceive0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw13ZoneManagementSend(
    public var anonymous: NvmeCdw13ZoneManagementSend0 = NvmeCdw13ZoneManagementSend0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw13ZoneManagementSend0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13ZoneManagementSend0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw13ZoneManagementSend0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw13ZoneManagementSend0 =
                    NvmeCdw13ZoneManagementSend0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw13ZoneManagementSend0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw14Features(
    public var hostMemoryBuffer: NvmeCdw14FeatureHostMemoryBuffer = NvmeCdw14FeatureHostMemoryBuffer(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw14FeatureHostMemoryBuffer(
    public var anonymous: NvmeCdw14FeatureHostMemoryBuffer0 = NvmeCdw14FeatureHostMemoryBuffer0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw14FeatureHostMemoryBuffer0(
    public var hmdlua: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw14FeatureHostMemoryBuffer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw14FeatureHostMemoryBuffer0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw14FeatureHostMemoryBuffer0 =
                    NvmeCdw14FeatureHostMemoryBuffer0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw14FeatureHostMemoryBuffer0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hmdlua)
                }
            }
    }
}

public data class NvmeCdw14GetLogPage(
    public var anonymous: NvmeCdw14GetLogPage0 = NvmeCdw14GetLogPage0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw14GetLogPage0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw14GetLogPage0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw14GetLogPage0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw14GetLogPage0 =
                    NvmeCdw14GetLogPage0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw14GetLogPage0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw15Features(
    public var hostMemoryBuffer: NvmeCdw15FeatureHostMemoryBuffer = NvmeCdw15FeatureHostMemoryBuffer(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw15FeatureHostMemoryBuffer(
    public var anonymous: NvmeCdw15FeatureHostMemoryBuffer0 = NvmeCdw15FeatureHostMemoryBuffer0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw15FeatureHostMemoryBuffer0(
    public var hmdlec: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw15FeatureHostMemoryBuffer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw15FeatureHostMemoryBuffer0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw15FeatureHostMemoryBuffer0 =
                    NvmeCdw15FeatureHostMemoryBuffer0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw15FeatureHostMemoryBuffer0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hmdlec)
                }
            }
    }
}

public data class NvmeCdw15ReadWrite(
    public var anonymous: NvmeCdw15ReadWrite0 = NvmeCdw15ReadWrite0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw15ReadWrite0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw15ReadWrite0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw15ReadWrite0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw15ReadWrite0 =
                    NvmeCdw15ReadWrite0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw15ReadWrite0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCdw15ZoneAppend(
    public var anonymous: NvmeCdw15ZoneAppend0 = NvmeCdw15ZoneAppend0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCdw15ZoneAppend0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw15ZoneAppend0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCdw15ZoneAppend0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCdw15ZoneAppend0 =
                    NvmeCdw15ZoneAppend0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCdw15ZoneAppend0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeChangedNamespaceListLog(
    public var nsid: UIntArray = UIntArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeChangedNamespaceListLog) return false
        if (!this.nsid.contentEquals(other.nsid)) return false
        return true
    }

    override fun hashCode(): Int = this.nsid.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeChangedNamespaceListLog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeChangedNamespaceListLog> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4096L
                override fun readNative(addr: Long): NvmeChangedNamespaceListLog =
                    NvmeChangedNamespaceListLog(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1024).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: NvmeChangedNamespaceListLog) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1024).toInt())
                    ).writeNative(addr, value.nsid.toList())
                }
            }
    }
}

public data class NvmeChangedZoneListLog(
    public var zoneIdentifiersCount: UShort = 0u,
    public var reserved: UByteArray = UByteArray(6),
    public var zoneIdentifier: ULongArray = ULongArray(511),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeChangedZoneListLog) return false
        if (this.zoneIdentifiersCount != other.zoneIdentifiersCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.zoneIdentifier.contentEquals(other.zoneIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.zoneIdentifiersCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.zoneIdentifier.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeChangedZoneListLog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeChangedZoneListLog> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 4096L
                override fun readNative(addr: Long): NvmeChangedZoneListLog =
                    NvmeChangedZoneListLog(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (511).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: NvmeChangedZoneListLog) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.zoneIdentifiersCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 2L, value.reserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (511).toInt())
                    ).writeNative(addr + 8L, value.zoneIdentifier.toList())
                }
            }
    }
}

public data class NvmeCommand(
    public var cdw0: NvmeCommandDword0 = NvmeCommandDword0(),
    public var nsid: UInt = 0u,
    public var reserved0: UIntArray = UIntArray(2),
    public var mptr: ULong = 0uL,
    public var prp1: ULong = 0uL,
    public var prp2: ULong = 0uL,
    public var u: NvmeCommand0 = NvmeCommand0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeCommand) return false
        if (this.cdw0 != other.cdw0) return false
        if (this.nsid != other.nsid) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.mptr != other.mptr) return false
        if (this.prp1 != other.prp1) return false
        if (this.prp2 != other.prp2) return false
        if (this.u != other.u) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cdw0.hashCode()
        result = 31 * result + this.nsid.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.mptr.hashCode()
        result = 31 * result + this.prp1.hashCode()
        result = 31 * result + this.prp2.hashCode()
        result = 31 * result + this.u.hashCode()
        return result
    }
}

public class NvmeCommand0(
    public var general: NvmeCommand00 = NvmeCommand00(),
    public var identify: NvmeCommand01 = NvmeCommand01(),
    public var abort: NvmeCommand02 = NvmeCommand02(),
    public var getfeatures: NvmeCommand03 = NvmeCommand03(),
    public var setfeatures: NvmeCommand04 = NvmeCommand04(),
    public var getlogpage: NvmeCommand05 = NvmeCommand05(),
    public var createiocq: NvmeCommand06 = NvmeCommand06(),
    public var createiosq: NvmeCommand07 = NvmeCommand07(),
    public var datasetmanagement: NvmeCommand08 = NvmeCommand08(),
    public var securitysend: NvmeCommand09 = NvmeCommand09(),
    public var securityreceive: NvmeCommand010 = NvmeCommand010(),
    public var firmwaredownload: NvmeCommand011 = NvmeCommand011(),
    public var firmwareactivate: NvmeCommand012 = NvmeCommand012(),
    public var formatnvm: NvmeCommand013 = NvmeCommand013(),
    public var directivereceive: NvmeCommand014 = NvmeCommand014(),
    public var directivesend: NvmeCommand015 = NvmeCommand015(),
    public var sanitize: NvmeCommand016 = NvmeCommand016(),
    public var readwrite: NvmeCommand017 = NvmeCommand017(),
    public var reservationacquire: NvmeCommand018 = NvmeCommand018(),
    public var reservationregister: NvmeCommand019 = NvmeCommand019(),
    public var reservationrelease: NvmeCommand020 = NvmeCommand020(),
    public var reservationreport: NvmeCommand021 = NvmeCommand021(),
    public var zonemanagementsend: NvmeCommand022 = NvmeCommand022(),
    public var zonemanagementreceive: NvmeCommand023 = NvmeCommand023(),
    public var zoneappend: NvmeCommand024 = NvmeCommand024(),
)

public data class NvmeCommand02(
    public var cdw10: NvmeCdw10Abort = NvmeCdw10Abort(),
    public var cdw11: UInt = 0u,
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand06(
    public var cdw10: NvmeCdw10CreateIoQueue = NvmeCdw10CreateIoQueue(),
    public var cdw11: NvmeCdw11CreateIoCq = NvmeCdw11CreateIoCq(),
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand07(
    public var cdw10: NvmeCdw10CreateIoQueue = NvmeCdw10CreateIoQueue(),
    public var cdw11: NvmeCdw11CreateIoSq = NvmeCdw11CreateIoSq(),
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand08(
    public var cdw10: NvmeCdw10DatasetManagement = NvmeCdw10DatasetManagement(),
    public var cdw11: NvmeCdw11DatasetManagement = NvmeCdw11DatasetManagement(),
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand014(
    public var cdw10: NvmeCdw10DirectiveReceive = NvmeCdw10DirectiveReceive(),
    public var cdw11: NvmeCdw11DirectiveReceive = NvmeCdw11DirectiveReceive(),
    public var cdw12: NvmeCdw12DirectiveReceive = NvmeCdw12DirectiveReceive(),
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand015(
    public var cdw10: NvmeCdw10DirectiveSend = NvmeCdw10DirectiveSend(),
    public var cdw11: NvmeCdw11DirectiveSend = NvmeCdw11DirectiveSend(),
    public var cdw12: NvmeCdw12DirectiveSend = NvmeCdw12DirectiveSend(),
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand012(
    public var cdw10: NvmeCdw10FirmwareActivate = NvmeCdw10FirmwareActivate(),
    public var cdw11: UInt = 0u,
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand011(
    public var cdw10: NvmeCdw10FirmwareDownload = NvmeCdw10FirmwareDownload(),
    public var cdw11: NvmeCdw11FirmwareDownload = NvmeCdw11FirmwareDownload(),
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCommand011> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCommand011> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NvmeCommand011 =
                    NvmeCommand011(
                        (NvmeCdw10FirmwareDownload.typeLayout()).readNative(addr),
                        (NvmeCdw11FirmwareDownload.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NvmeCommand011) {
                    (NvmeCdw10FirmwareDownload.typeLayout()).writeNative(addr, value.cdw10)
                    (NvmeCdw11FirmwareDownload.typeLayout()).writeNative(addr + 4L, value.cdw11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cdw12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cdw13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cdw14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cdw15)
                }
            }
    }
}

public data class NvmeCommand013(
    public var cdw10: NvmeCdw10FormatNvm = NvmeCdw10FormatNvm(),
    public var cdw11: UInt = 0u,
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand00(
    public var cdw10: UInt = 0u,
    public var cdw11: UInt = 0u,
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCommand00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCommand00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NvmeCommand00 =
                    NvmeCommand00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NvmeCommand00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cdw10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cdw11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cdw12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cdw13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cdw14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cdw15)
                }
            }
    }
}

public data class NvmeCommand03(
    public var cdw10: NvmeCdw10GetFeatures = NvmeCdw10GetFeatures(),
    public var cdw11: NvmeCdw11Features = NvmeCdw11Features(),
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand05(
    public var anonymous: NvmeCommand050 = NvmeCommand050(),
    public var cdw11: NvmeCdw11GetLogPage = NvmeCdw11GetLogPage(),
    public var cdw12: NvmeCdw12GetLogPage = NvmeCdw12GetLogPage(),
    public var cdw13: NvmeCdw13GetLogPage = NvmeCdw13GetLogPage(),
    public var cdw14: NvmeCdw14GetLogPage = NvmeCdw14GetLogPage(),
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand050(
    public var cdw10: NvmeCdw10GetLogPage = NvmeCdw10GetLogPage(),
    public var cdw10V13: NvmeCdw10GetLogPageV13 = NvmeCdw10GetLogPageV13(),
)

public data class NvmeCommand01(
    public var cdw10: NvmeCdw10Identify = NvmeCdw10Identify(),
    public var cdw11: NvmeCdw11Identify = NvmeCdw11Identify(),
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand017(
    public var lbalow: UInt = 0u,
    public var lbahigh: UInt = 0u,
    public var cdw12: NvmeCdw12ReadWrite = NvmeCdw12ReadWrite(),
    public var cdw13: NvmeCdw13ReadWrite = NvmeCdw13ReadWrite(),
    public var cdw14: UInt = 0u,
    public var cdw15: NvmeCdw15ReadWrite = NvmeCdw15ReadWrite(),
)

public data class NvmeCommand018(
    public var cdw10: NvmeCdw10ReservationAcquire = NvmeCdw10ReservationAcquire(),
    public var cdw11: UInt = 0u,
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand019(
    public var cdw10: NvmeCdw10ReservationRegister = NvmeCdw10ReservationRegister(),
    public var cdw11: UInt = 0u,
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand020(
    public var cdw10: NvmeCdw10ReservationRelease = NvmeCdw10ReservationRelease(),
    public var cdw11: UInt = 0u,
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand021(
    public var cdw10: NvmeCdw10ReservationReport = NvmeCdw10ReservationReport(),
    public var cdw11: NvmeCdw11ReservationReport = NvmeCdw11ReservationReport(),
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand016(
    public var cdw10: NvmeCdw10Sanitize = NvmeCdw10Sanitize(),
    public var cdw11: NvmeCdw11Sanitize = NvmeCdw11Sanitize(),
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand010(
    public var cdw10: NvmeCdw10SecuritySendReceive = NvmeCdw10SecuritySendReceive(),
    public var cdw11: NvmeCdw11SecurityReceive = NvmeCdw11SecurityReceive(),
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand09(
    public var cdw10: NvmeCdw10SecuritySendReceive = NvmeCdw10SecuritySendReceive(),
    public var cdw11: NvmeCdw11SecuritySend = NvmeCdw11SecuritySend(),
    public var cdw12: UInt = 0u,
    public var cdw13: UInt = 0u,
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand04(
    public var cdw10: NvmeCdw10SetFeatures = NvmeCdw10SetFeatures(),
    public var cdw11: NvmeCdw11Features = NvmeCdw11Features(),
    public var cdw12: NvmeCdw12Features = NvmeCdw12Features(),
    public var cdw13: NvmeCdw13Features = NvmeCdw13Features(),
    public var cdw14: NvmeCdw14Features = NvmeCdw14Features(),
    public var cdw15: NvmeCdw15Features = NvmeCdw15Features(),
)

public data class NvmeCommand024(
    public var cdw1011: NvmeCdw10ZoneAppend = NvmeCdw10ZoneAppend(),
    public var cdw12: NvmeCdw12ZoneAppend = NvmeCdw12ZoneAppend(),
    public var cdw13: UInt = 0u,
    public var ilbrt: UInt = 0u,
    public var cdw15: NvmeCdw15ZoneAppend = NvmeCdw15ZoneAppend(),
)

public data class NvmeCommand023(
    public var cdw1011: NvmeCdw10ZoneManagementReceive = NvmeCdw10ZoneManagementReceive(),
    public var dwordcount: UInt = 0u,
    public var cdw13: NvmeCdw13ZoneManagementReceive = NvmeCdw13ZoneManagementReceive(),
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommand022(
    public var cdw1011: NvmeCdw10ZoneManagementSend = NvmeCdw10ZoneManagementSend(),
    public var cdw12: UInt = 0u,
    public var cdw13: NvmeCdw13ZoneManagementSend = NvmeCdw13ZoneManagementSend(),
    public var cdw14: UInt = 0u,
    public var cdw15: UInt = 0u,
)

public data class NvmeCommandDword0(
    public var anonymous: NvmeCommandDword00 = NvmeCommandDword00(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCommandDword00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCommandDword00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCommandDword00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCommandDword00 =
                    NvmeCommandDword00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCommandDword00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCommandEffectsData(
    public var anonymous: NvmeCommandEffectsData0 = NvmeCommandEffectsData0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCommandEffectsData0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCommandEffectsData0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCommandEffectsData0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCommandEffectsData0 =
                    NvmeCommandEffectsData0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCommandEffectsData0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCommandEffectsLog(
    public var acs: List<NvmeCommandEffectsData> = List(256) { NvmeCommandEffectsData() },
    public var iocs: List<NvmeCommandEffectsData> = List(256) { NvmeCommandEffectsData() },
    public var reserved: UByteArray = UByteArray(2048),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeCommandEffectsLog) return false
        if (this.acs != other.acs) return false
        if (this.iocs != other.iocs) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.acs.hashCode()
        result = 31 * result + this.iocs.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class NvmeCommandStatus(
    public var anonymous: NvmeCommandStatus0 = NvmeCommandStatus0(),
    public var asUshort: UShort = 0u,
)

public data class NvmeCommandStatus0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCommandStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCommandStatus0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): NvmeCommandStatus0 =
                    NvmeCommandStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCommandStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCompletionDw0AsyncEventRequest(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCompletionDw0AsyncEventRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCompletionDw0AsyncEventRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCompletionDw0AsyncEventRequest =
                    NvmeCompletionDw0AsyncEventRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCompletionDw0AsyncEventRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources(
    public var anonymous: NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources0 = NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources0(),
    public var asUlong: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources =
                    NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources(
                        (NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources0.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources) {
                    (NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources0.typeLayout()).writeNative(addr, value.anonymous)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.asUlong)
                }
            }
    }
}

public data class NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources0 =
                    NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCompletionDw0DirectiveReceiveStreamsAllocateResources0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeCompletionEntry(
    public var dw0: UInt = 0u,
    public var dw1: UInt = 0u,
    public var dw2: NvmeCompletionEntry0 = NvmeCompletionEntry0(),
    public var dw3: NvmeCompletionEntry1 = NvmeCompletionEntry1(),
)

public data class NvmeCompletionEntry0(
    public var anonymous: NvmeCompletionEntry00 = NvmeCompletionEntry00(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCompletionEntry00(
    public var sqhd: UShort = 0u,
    public var sqid: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCompletionEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCompletionEntry00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCompletionEntry00 =
                    NvmeCompletionEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: NvmeCompletionEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sqhd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sqid)
                }
            }
    }
}

public data class NvmeCompletionEntry1(
    public var anonymous: NvmeCompletionEntry10 = NvmeCompletionEntry10(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCompletionEntry10(
    public var cid: UShort = 0u,
    public var status: NvmeCommandStatus = NvmeCommandStatus(),
)

public data class NvmeCompletionQueueHeadDoorbell(
    public var anonymous: NvmeCompletionQueueHeadDoorbell0 = NvmeCompletionQueueHeadDoorbell0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeCompletionQueueHeadDoorbell0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCompletionQueueHeadDoorbell0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeCompletionQueueHeadDoorbell0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeCompletionQueueHeadDoorbell0 =
                    NvmeCompletionQueueHeadDoorbell0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeCompletionQueueHeadDoorbell0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeContextAttributes(
    public var anonymous: NvmeContextAttributes0 = NvmeContextAttributes0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeContextAttributes0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeContextAttributes0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeContextAttributes0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeContextAttributes0 =
                    NvmeContextAttributes0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeContextAttributes0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeControllerCapabilities(
    public var anonymous: NvmeControllerCapabilities0 = NvmeControllerCapabilities0(),
    public var asUlonglong: ULong = 0uL,
)

public data class NvmeControllerCapabilities0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerCapabilities0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerCapabilities0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NvmeControllerCapabilities0 =
                    NvmeControllerCapabilities0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeControllerCapabilities0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeControllerConfiguration(
    public var anonymous: NvmeControllerConfiguration0 = NvmeControllerConfiguration0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeControllerConfiguration0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerConfiguration0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerConfiguration0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeControllerConfiguration0 =
                    NvmeControllerConfiguration0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeControllerConfiguration0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeControllerList(
    public var numberOfIdentifiers: UShort = 0u,
    public var controllerID: UShortArray = UShortArray(2047),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeControllerList) return false
        if (this.numberOfIdentifiers != other.numberOfIdentifiers) return false
        if (!this.controllerID.contentEquals(other.controllerID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfIdentifiers.hashCode()
        result = 31 * result + this.controllerID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerList> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4096L
                override fun readNative(addr: Long): NvmeControllerList =
                    NvmeControllerList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2047).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: NvmeControllerList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.numberOfIdentifiers)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2047).toInt())
                    ).writeNative(addr + 2L, value.controllerID.toList())
                }
            }
    }
}

public data class NvmeControllerMemoryBufferLocation(
    public var anonymous: NvmeControllerMemoryBufferLocation0 = NvmeControllerMemoryBufferLocation0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeControllerMemoryBufferLocation0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerMemoryBufferLocation0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerMemoryBufferLocation0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeControllerMemoryBufferLocation0 =
                    NvmeControllerMemoryBufferLocation0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeControllerMemoryBufferLocation0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeControllerMemoryBufferSize(
    public var anonymous: NvmeControllerMemoryBufferSize0 = NvmeControllerMemoryBufferSize0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeControllerMemoryBufferSize0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerMemoryBufferSize0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerMemoryBufferSize0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeControllerMemoryBufferSize0 =
                    NvmeControllerMemoryBufferSize0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeControllerMemoryBufferSize0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeControllerRegisters(
    public var cap: NvmeControllerCapabilities = NvmeControllerCapabilities(),
    public var vs: NvmeVersion = NvmeVersion(),
    public var intms: UInt = 0u,
    public var intmc: UInt = 0u,
    public var cc: NvmeControllerConfiguration = NvmeControllerConfiguration(),
    public var reserved0: UInt = 0u,
    public var csts: NvmeControllerStatus = NvmeControllerStatus(),
    public var nssr: NvmeNvmSubsystemReset = NvmeNvmSubsystemReset(),
    public var aqa: NvmeAdminQueueAttributes = NvmeAdminQueueAttributes(),
    public var asq: NvmeAdminSubmissionQueueBaseAddress = NvmeAdminSubmissionQueueBaseAddress(),
    public var acq: NvmeAdminCompletionQueueBaseAddress = NvmeAdminCompletionQueueBaseAddress(),
    public var cmbloc: NvmeControllerMemoryBufferLocation = NvmeControllerMemoryBufferLocation(),
    public var cmbsz: NvmeControllerMemoryBufferSize = NvmeControllerMemoryBufferSize(),
    public var reserved2: UIntArray = UIntArray(944),
    public var reserved3: UIntArray = UIntArray(64),
    public var doorbells: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeControllerRegisters) return false
        if (this.cap != other.cap) return false
        if (this.vs != other.vs) return false
        if (this.intms != other.intms) return false
        if (this.intmc != other.intmc) return false
        if (this.cc != other.cc) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.csts != other.csts) return false
        if (this.nssr != other.nssr) return false
        if (this.aqa != other.aqa) return false
        if (this.asq != other.asq) return false
        if (this.acq != other.acq) return false
        if (this.cmbloc != other.cmbloc) return false
        if (this.cmbsz != other.cmbsz) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        if (!this.doorbells.contentEquals(other.doorbells)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cap.hashCode()
        result = 31 * result + this.vs.hashCode()
        result = 31 * result + this.intms.hashCode()
        result = 31 * result + this.intmc.hashCode()
        result = 31 * result + this.cc.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.csts.hashCode()
        result = 31 * result + this.nssr.hashCode()
        result = 31 * result + this.aqa.hashCode()
        result = 31 * result + this.asq.hashCode()
        result = 31 * result + this.acq.hashCode()
        result = 31 * result + this.cmbloc.hashCode()
        result = 31 * result + this.cmbsz.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        result = 31 * result + this.doorbells.contentHashCode()
        return result
    }
}

public data class NvmeControllerStatus(
    public var anonymous: NvmeControllerStatus0 = NvmeControllerStatus0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeControllerStatus0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeControllerStatus0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NvmeControllerStatus0 =
                    NvmeControllerStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeControllerStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeDeviceSelfTestLog(
    public var currentOperation: NvmeDeviceSelfTestLog0 = NvmeDeviceSelfTestLog0(),
    public var currentCompletion: NvmeDeviceSelfTestLog1 = NvmeDeviceSelfTestLog1(),
    public var reserved: UByteArray = UByteArray(2),
    public var resultData: List<NvmeDeviceSelfTestResultData> = List(20) { NvmeDeviceSelfTestResultData() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeDeviceSelfTestLog) return false
        if (this.currentOperation != other.currentOperation) return false
        if (this.currentCompletion != other.currentCompletion) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.resultData != other.resultData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentOperation.hashCode()
        result = 31 * result + this.currentCompletion.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.resultData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestLog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestLog> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 564L
                override fun readNative(addr: Long): NvmeDeviceSelfTestLog =
                    NvmeDeviceSelfTestLog(
                        (NvmeDeviceSelfTestLog0.typeLayout()).readNative(addr),
                        (NvmeDeviceSelfTestLog1.typeLayout()).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NvmeDeviceSelfTestResultData.typeLayout(), (20).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NvmeDeviceSelfTestLog) {
                    (NvmeDeviceSelfTestLog0.typeLayout()).writeNative(addr, value.currentOperation)
                    (NvmeDeviceSelfTestLog1.typeLayout()).writeNative(addr + 1L, value.currentCompletion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.reserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NvmeDeviceSelfTestResultData.typeLayout(), (20).toInt())
                    ).writeNative(addr + 4L, value.resultData)
                }
            }
    }
}

public data class NvmeDeviceSelfTestLog1(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestLog1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestLog1> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): NvmeDeviceSelfTestLog1 =
                    NvmeDeviceSelfTestLog1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeDeviceSelfTestLog1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeDeviceSelfTestLog0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestLog0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestLog0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): NvmeDeviceSelfTestLog0 =
                    NvmeDeviceSelfTestLog0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeDeviceSelfTestLog0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeDeviceSelfTestResultData(
    public var status: NvmeDeviceSelfTestResultData0 = NvmeDeviceSelfTestResultData0(),
    public var segmentNumber: UByte = 0u,
    public var validDiagnostics: NvmeDeviceSelfTestResultData1 = NvmeDeviceSelfTestResultData1(),
    public var reserved: UByte = 0u,
    public var poh: ULong = 0uL,
    public var nsid: UInt = 0u,
    public var failingLBA: ULong = 0uL,
    public var statusCodeType: NvmeDeviceSelfTestResultData2 = NvmeDeviceSelfTestResultData2(),
    public var statusCode: UByte = 0u,
    public var vendorSpecific: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestResultData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestResultData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): NvmeDeviceSelfTestResultData =
                    NvmeDeviceSelfTestResultData(
                        (NvmeDeviceSelfTestResultData0.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (NvmeDeviceSelfTestResultData1.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (NvmeDeviceSelfTestResultData2.typeLayout()).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                    )
                override fun writeNative(addr: Long, value: NvmeDeviceSelfTestResultData) {
                    (NvmeDeviceSelfTestResultData0.typeLayout()).writeNative(addr, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.segmentNumber)
                    (NvmeDeviceSelfTestResultData1.typeLayout()).writeNative(addr + 2L, value.validDiagnostics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 4L, value.poh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.failingLBA)
                    (NvmeDeviceSelfTestResultData2.typeLayout()).writeNative(addr + 24L, value.statusCodeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.statusCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.vendorSpecific)
                }
            }
    }
}

public data class NvmeDeviceSelfTestResultData2(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestResultData2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestResultData2> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): NvmeDeviceSelfTestResultData2 =
                    NvmeDeviceSelfTestResultData2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeDeviceSelfTestResultData2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeDeviceSelfTestResultData0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestResultData0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestResultData0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): NvmeDeviceSelfTestResultData0 =
                    NvmeDeviceSelfTestResultData0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeDeviceSelfTestResultData0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeDeviceSelfTestResultData1(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestResultData1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDeviceSelfTestResultData1> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): NvmeDeviceSelfTestResultData1 =
                    NvmeDeviceSelfTestResultData1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeDeviceSelfTestResultData1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeDirectiveIdentifyReturnParameters(
    public var directivesSupported: NvmeDirectiveIdentifyReturnParametersDescriptor = NvmeDirectiveIdentifyReturnParametersDescriptor(),
    public var directivesEnabled: NvmeDirectiveIdentifyReturnParametersDescriptor = NvmeDirectiveIdentifyReturnParametersDescriptor(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDirectiveIdentifyReturnParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDirectiveIdentifyReturnParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): NvmeDirectiveIdentifyReturnParameters =
                    NvmeDirectiveIdentifyReturnParameters(
                        (NvmeDirectiveIdentifyReturnParametersDescriptor.typeLayout()).readNative(addr),
                        (NvmeDirectiveIdentifyReturnParametersDescriptor.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: NvmeDirectiveIdentifyReturnParameters) {
                    (NvmeDirectiveIdentifyReturnParametersDescriptor.typeLayout()).writeNative(addr, value.directivesSupported)
                    (NvmeDirectiveIdentifyReturnParametersDescriptor.typeLayout()).writeNative(addr + 32L, value.directivesEnabled)
                }
            }
    }
}

public data class NvmeDirectiveIdentifyReturnParametersDescriptor(
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(31),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeDirectiveIdentifyReturnParametersDescriptor) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDirectiveIdentifyReturnParametersDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDirectiveIdentifyReturnParametersDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NvmeDirectiveIdentifyReturnParametersDescriptor =
                    NvmeDirectiveIdentifyReturnParametersDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (31).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NvmeDirectiveIdentifyReturnParametersDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (31).toInt())
                    ).writeNative(addr + 1L, value.reserved1.toList())
                }
            }
    }
}

public data class NvmeDirectiveStreamsGetStatusData(
    public var openStreamCount: UShort = 0u,
    public var streamIdentifiers: UShortArray = UShortArray(65535),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeDirectiveStreamsGetStatusData) return false
        if (this.openStreamCount != other.openStreamCount) return false
        if (!this.streamIdentifiers.contentEquals(other.streamIdentifiers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.openStreamCount.hashCode()
        result = 31 * result + this.streamIdentifiers.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDirectiveStreamsGetStatusData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDirectiveStreamsGetStatusData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 131072L
                override fun readNative(addr: Long): NvmeDirectiveStreamsGetStatusData =
                    NvmeDirectiveStreamsGetStatusData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65535).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: NvmeDirectiveStreamsGetStatusData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.openStreamCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65535).toInt())
                    ).writeNative(addr + 2L, value.streamIdentifiers.toList())
                }
            }
    }
}

public data class NvmeDirectiveStreamsReturnParameters(
    public var msl: UShort = 0u,
    public var nssa: UShort = 0u,
    public var nsso: UShort = 0u,
    public var reserved0: UByteArray = UByteArray(10),
    public var sws: UInt = 0u,
    public var sgs: UShort = 0u,
    public var nsa: UShort = 0u,
    public var nso: UShort = 0u,
    public var reserved1: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeDirectiveStreamsReturnParameters) return false
        if (this.msl != other.msl) return false
        if (this.nssa != other.nssa) return false
        if (this.nsso != other.nsso) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.sws != other.sws) return false
        if (this.sgs != other.sgs) return false
        if (this.nsa != other.nsa) return false
        if (this.nso != other.nso) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msl.hashCode()
        result = 31 * result + this.nssa.hashCode()
        result = 31 * result + this.nsso.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.sws.hashCode()
        result = 31 * result + this.sgs.hashCode()
        result = 31 * result + this.nsa.hashCode()
        result = 31 * result + this.nso.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDirectiveStreamsReturnParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeDirectiveStreamsReturnParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NvmeDirectiveStreamsReturnParameters =
                    NvmeDirectiveStreamsReturnParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (10).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 26L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NvmeDirectiveStreamsReturnParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.msl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nssa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.nsso)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (10).toInt())
                    ).writeNative(addr + 6L, value.reserved0.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sws)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.sgs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.nsa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.nso)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 26L, value.reserved1.toList())
                }
            }
    }
}

public data class NvmeEnduranceGroupLog(
    public var reserved0: UInt = 0u,
    public var availableSpareThreshold: UByte = 0u,
    public var percentageUsed: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(26),
    public var enduranceEstimate: UByteArray = UByteArray(16),
    public var dataUnitsRead: UByteArray = UByteArray(16),
    public var dataUnitsWritten: UByteArray = UByteArray(16),
    public var mediaUnitsWritten: UByteArray = UByteArray(16),
    public var reserved2: UByteArray = UByteArray(416),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeEnduranceGroupLog) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.availableSpareThreshold != other.availableSpareThreshold) return false
        if (this.percentageUsed != other.percentageUsed) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.enduranceEstimate.contentEquals(other.enduranceEstimate)) return false
        if (!this.dataUnitsRead.contentEquals(other.dataUnitsRead)) return false
        if (!this.dataUnitsWritten.contentEquals(other.dataUnitsWritten)) return false
        if (!this.mediaUnitsWritten.contentEquals(other.mediaUnitsWritten)) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved0.hashCode()
        result = 31 * result + this.availableSpareThreshold.hashCode()
        result = 31 * result + this.percentageUsed.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.enduranceEstimate.contentHashCode()
        result = 31 * result + this.dataUnitsRead.contentHashCode()
        result = 31 * result + this.dataUnitsWritten.contentHashCode()
        result = 31 * result + this.mediaUnitsWritten.contentHashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeEnduranceGroupLog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeEnduranceGroupLog> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 512L
                override fun readNative(addr: Long): NvmeEnduranceGroupLog =
                    NvmeEnduranceGroupLog(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (26).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 48L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 64L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 80L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (416).toInt())
                        ).readNative(addr + 96L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NvmeEnduranceGroupLog) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.availableSpareThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.percentageUsed)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (26).toInt())
                    ).writeNative(addr + 6L, value.reserved1.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 32L, value.enduranceEstimate.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 48L, value.dataUnitsRead.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 64L, value.dataUnitsWritten.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 80L, value.mediaUnitsWritten.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (416).toInt())
                    ).writeNative(addr + 96L, value.reserved2.toList())
                }
            }
    }
}

public data class NvmeErrorInfoLog(
    public var errorCount: ULong = 0uL,
    public var sqid: UShort = 0u,
    public var cmdid: UShort = 0u,
    public var status: NvmeCommandStatus = NvmeCommandStatus(),
    public var parameterErrorLocation: NvmeErrorInfoLog0 = NvmeErrorInfoLog0(),
    public var lba: ULong = 0uL,
    public var nameSpace: UInt = 0u,
    public var vendorInfoAvailable: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
    public var commandSpecificInfo: ULong = 0uL,
    public var reserved1: UByteArray = UByteArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeErrorInfoLog) return false
        if (this.errorCount != other.errorCount) return false
        if (this.sqid != other.sqid) return false
        if (this.cmdid != other.cmdid) return false
        if (this.status != other.status) return false
        if (this.parameterErrorLocation != other.parameterErrorLocation) return false
        if (this.lba != other.lba) return false
        if (this.nameSpace != other.nameSpace) return false
        if (this.vendorInfoAvailable != other.vendorInfoAvailable) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.commandSpecificInfo != other.commandSpecificInfo) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.errorCount.hashCode()
        result = 31 * result + this.sqid.hashCode()
        result = 31 * result + this.cmdid.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.parameterErrorLocation.hashCode()
        result = 31 * result + this.lba.hashCode()
        result = 31 * result + this.nameSpace.hashCode()
        result = 31 * result + this.vendorInfoAvailable.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.commandSpecificInfo.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }
}

public data class NvmeErrorInfoLog0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeErrorInfoLog0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeErrorInfoLog0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): NvmeErrorInfoLog0 =
                    NvmeErrorInfoLog0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeErrorInfoLog0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeErrorInjectionEntry(
    public var flags: NvmeErrorInjectionEntry0 = NvmeErrorInjectionEntry0(),
    public var reserved1: UByte = 0u,
    public var errorInjectionType: UShort = 0u,
    public var errorInjectionTypeSpecific: UByteArray = UByteArray(28),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeErrorInjectionEntry) return false
        if (this.flags != other.flags) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.errorInjectionType != other.errorInjectionType) return false
        if (!this.errorInjectionTypeSpecific.contentEquals(other.errorInjectionTypeSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.errorInjectionType.hashCode()
        result = 31 * result + this.errorInjectionTypeSpecific.contentHashCode()
        return result
    }
}

public data class NvmeErrorInjectionEntry0(
    public var anonymous: NvmeErrorInjectionEntry00 = NvmeErrorInjectionEntry00(),
    public var asUchar: UByte = 0u,
)
