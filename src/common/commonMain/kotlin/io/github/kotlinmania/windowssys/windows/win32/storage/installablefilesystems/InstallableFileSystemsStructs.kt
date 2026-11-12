@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public data class FilterAggregateBasicInformation(
    public var nextEntryOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var type: FilterAggregateBasicInformation0 = FilterAggregateBasicInformation0(),
)

public data class FilterAggregateBasicInformation0(
    public var miniFilter: FilterAggregateBasicInformation00 = FilterAggregateBasicInformation00(),
    public var legacyFilter: FilterAggregateBasicInformation01 = FilterAggregateBasicInformation01(),
)

public data class FilterAggregateBasicInformation01(
    public var filterNameLength: UShort = 0u,
    public var filterNameBufferOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterAggregateBasicInformation01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterAggregateBasicInformation01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): FilterAggregateBasicInformation01 =
                    FilterAggregateBasicInformation01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FilterAggregateBasicInformation01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.filterNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.filterNameBufferOffset)
                }
            }
    }
}

public data class FilterAggregateBasicInformation00(
    public var frameID: UInt = 0u,
    public var numberOfInstances: UInt = 0u,
    public var filterNameLength: UShort = 0u,
    public var filterNameBufferOffset: UShort = 0u,
    public var filterAltitudeLength: UShort = 0u,
    public var filterAltitudeBufferOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterAggregateBasicInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterAggregateBasicInformation00> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FilterAggregateBasicInformation00 =
                    FilterAggregateBasicInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: FilterAggregateBasicInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.frameID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.filterNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.filterNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.filterAltitudeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.filterAltitudeBufferOffset)
                }
            }
    }
}

public data class FilterAggregateStandardInformation(
    public var nextEntryOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var type: FilterAggregateStandardInformation0 = FilterAggregateStandardInformation0(),
)

public data class FilterAggregateStandardInformation0(
    public var miniFilter: FilterAggregateStandardInformation00 = FilterAggregateStandardInformation00(),
    public var legacyFilter: FilterAggregateStandardInformation01 = FilterAggregateStandardInformation01(),
)

public data class FilterAggregateStandardInformation01(
    public var flags: UInt = 0u,
    public var filterNameLength: UShort = 0u,
    public var filterNameBufferOffset: UShort = 0u,
    public var filterAltitudeLength: UShort = 0u,
    public var filterAltitudeBufferOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterAggregateStandardInformation01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterAggregateStandardInformation01> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FilterAggregateStandardInformation01 =
                    FilterAggregateStandardInformation01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: FilterAggregateStandardInformation01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.filterNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.filterNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.filterAltitudeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.filterAltitudeBufferOffset)
                }
            }
    }
}

public data class FilterAggregateStandardInformation00(
    public var flags: UInt = 0u,
    public var frameID: UInt = 0u,
    public var numberOfInstances: UInt = 0u,
    public var filterNameLength: UShort = 0u,
    public var filterNameBufferOffset: UShort = 0u,
    public var filterAltitudeLength: UShort = 0u,
    public var filterAltitudeBufferOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterAggregateStandardInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterAggregateStandardInformation00> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FilterAggregateStandardInformation00 =
                    FilterAggregateStandardInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: FilterAggregateStandardInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.frameID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.filterNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.filterNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.filterAltitudeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.filterAltitudeBufferOffset)
                }
            }
    }
}

public data class FilterFullInformation(
    public var nextEntryOffset: UInt = 0u,
    public var frameID: UInt = 0u,
    public var numberOfInstances: UInt = 0u,
    public var filterNameLength: UShort = 0u,
    public var filterNameBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilterFullInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.frameID != other.frameID) return false
        if (this.numberOfInstances != other.numberOfInstances) return false
        if (this.filterNameLength != other.filterNameLength) return false
        if (!this.filterNameBuffer.contentEquals(other.filterNameBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.frameID.hashCode()
        result = 31 * result + this.numberOfInstances.hashCode()
        result = 31 * result + this.filterNameLength.hashCode()
        result = 31 * result + this.filterNameBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterFullInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterFullInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FilterFullInformation =
                    FilterFullInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: FilterFullInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.frameID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.filterNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 14L, value.filterNameBuffer)
                }
            }
    }
}

public data class FilterMessageHeader(
    public var replyLength: UInt = 0u,
    public var messageId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterMessageHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterMessageHeader> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FilterMessageHeader =
                    FilterMessageHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FilterMessageHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.replyLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.messageId)
                }
            }
    }
}

public data class FilterReplyHeader(
    public var status: Ntstatus = 0,
    public var messageId: ULong = 0uL,
)

public data class FilterVolumeBasicInformation(
    public var filterVolumeNameLength: UShort = 0u,
    public var filterVolumeName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilterVolumeBasicInformation) return false
        if (this.filterVolumeNameLength != other.filterVolumeNameLength) return false
        if (!this.filterVolumeName.contentEquals(other.filterVolumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.filterVolumeNameLength.hashCode()
        result = 31 * result + this.filterVolumeName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterVolumeBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterVolumeBasicInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): FilterVolumeBasicInformation =
                    FilterVolumeBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FilterVolumeBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.filterVolumeNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 2L, value.filterVolumeName)
                }
            }
    }
}

public data class FilterVolumeStandardInformation(
    public var nextEntryOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var frameID: UInt = 0u,
    public var fileSystemType: FltFilesystemType = 0,
    public var filterVolumeNameLength: UShort = 0u,
    public var filterVolumeName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilterVolumeStandardInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.flags != other.flags) return false
        if (this.frameID != other.frameID) return false
        if (this.fileSystemType != other.fileSystemType) return false
        if (this.filterVolumeNameLength != other.filterVolumeNameLength) return false
        if (!this.filterVolumeName.contentEquals(other.filterVolumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.frameID.hashCode()
        result = 31 * result + this.fileSystemType.hashCode()
        result = 31 * result + this.filterVolumeNameLength.hashCode()
        result = 31 * result + this.filterVolumeName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterVolumeStandardInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilterVolumeStandardInformation> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FilterVolumeStandardInformation =
                    FilterVolumeStandardInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: FilterVolumeStandardInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.frameID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.fileSystemType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.filterVolumeNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 18L, value.filterVolumeName)
                }
            }
    }
}

public data class InstanceAggregateStandardInformation(
    public var nextEntryOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var type: InstanceAggregateStandardInformation0 = InstanceAggregateStandardInformation0(),
)

public data class InstanceAggregateStandardInformation0(
    public var miniFilter: InstanceAggregateStandardInformation00 = InstanceAggregateStandardInformation00(),
    public var legacyFilter: InstanceAggregateStandardInformation01 = InstanceAggregateStandardInformation01(),
)

public data class InstanceAggregateStandardInformation01(
    public var flags: UInt = 0u,
    public var altitudeLength: UShort = 0u,
    public var altitudeBufferOffset: UShort = 0u,
    public var volumeNameLength: UShort = 0u,
    public var volumeNameBufferOffset: UShort = 0u,
    public var filterNameLength: UShort = 0u,
    public var filterNameBufferOffset: UShort = 0u,
    public var supportedFeatures: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InstanceAggregateStandardInformation01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InstanceAggregateStandardInformation01> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InstanceAggregateStandardInformation01 =
                    InstanceAggregateStandardInformation01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: InstanceAggregateStandardInformation01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.altitudeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.altitudeBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.volumeNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.volumeNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.filterNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.filterNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.supportedFeatures)
                }
            }
    }
}

public data class InstanceAggregateStandardInformation00(
    public var flags: UInt = 0u,
    public var frameID: UInt = 0u,
    public var volumeFileSystemType: FltFilesystemType = 0,
    public var instanceNameLength: UShort = 0u,
    public var instanceNameBufferOffset: UShort = 0u,
    public var altitudeLength: UShort = 0u,
    public var altitudeBufferOffset: UShort = 0u,
    public var volumeNameLength: UShort = 0u,
    public var volumeNameBufferOffset: UShort = 0u,
    public var filterNameLength: UShort = 0u,
    public var filterNameBufferOffset: UShort = 0u,
    public var supportedFeatures: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InstanceAggregateStandardInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InstanceAggregateStandardInformation00> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InstanceAggregateStandardInformation00 =
                    InstanceAggregateStandardInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: InstanceAggregateStandardInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.frameID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.volumeFileSystemType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.instanceNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.instanceNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.altitudeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.altitudeBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.volumeNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.volumeNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.filterNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.filterNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.supportedFeatures)
                }
            }
    }
}

public data class InstanceBasicInformation(
    public var nextEntryOffset: UInt = 0u,
    public var instanceNameLength: UShort = 0u,
    public var instanceNameBufferOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InstanceBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InstanceBasicInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InstanceBasicInformation =
                    InstanceBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: InstanceBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.instanceNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.instanceNameBufferOffset)
                }
            }
    }
}

public data class InstanceFullInformation(
    public var nextEntryOffset: UInt = 0u,
    public var instanceNameLength: UShort = 0u,
    public var instanceNameBufferOffset: UShort = 0u,
    public var altitudeLength: UShort = 0u,
    public var altitudeBufferOffset: UShort = 0u,
    public var volumeNameLength: UShort = 0u,
    public var volumeNameBufferOffset: UShort = 0u,
    public var filterNameLength: UShort = 0u,
    public var filterNameBufferOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InstanceFullInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InstanceFullInformation> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InstanceFullInformation =
                    InstanceFullInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: InstanceFullInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.instanceNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.instanceNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.altitudeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.altitudeBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.volumeNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.volumeNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.filterNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.filterNameBufferOffset)
                }
            }
    }
}

public data class InstancePartialInformation(
    public var nextEntryOffset: UInt = 0u,
    public var instanceNameLength: UShort = 0u,
    public var instanceNameBufferOffset: UShort = 0u,
    public var altitudeLength: UShort = 0u,
    public var altitudeBufferOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InstancePartialInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InstancePartialInformation> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InstancePartialInformation =
                    InstancePartialInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: InstancePartialInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.instanceNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.instanceNameBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.altitudeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.altitudeBufferOffset)
                }
            }
    }
}
