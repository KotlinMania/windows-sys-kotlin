@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

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
)

public data class FilterAggregateBasicInformation00(
    public var frameID: UInt = 0u,
    public var numberOfInstances: UInt = 0u,
    public var filterNameLength: UShort = 0u,
    public var filterNameBufferOffset: UShort = 0u,
    public var filterAltitudeLength: UShort = 0u,
    public var filterAltitudeBufferOffset: UShort = 0u,
)

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
)

public data class FilterAggregateStandardInformation00(
    public var flags: UInt = 0u,
    public var frameID: UInt = 0u,
    public var numberOfInstances: UInt = 0u,
    public var filterNameLength: UShort = 0u,
    public var filterNameBufferOffset: UShort = 0u,
    public var filterAltitudeLength: UShort = 0u,
    public var filterAltitudeBufferOffset: UShort = 0u,
)

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
}

public data class FilterMessageHeader(
    public var replyLength: UInt = 0u,
    public var messageId: ULong = 0uL,
)

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
)

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
)

public data class InstanceBasicInformation(
    public var nextEntryOffset: UInt = 0u,
    public var instanceNameLength: UShort = 0u,
    public var instanceNameBufferOffset: UShort = 0u,
)

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
)

public data class InstancePartialInformation(
    public var nextEntryOffset: UInt = 0u,
    public var instanceNameLength: UShort = 0u,
    public var instanceNameBufferOffset: UShort = 0u,
    public var altitudeLength: UShort = 0u,
    public var altitudeBufferOffset: UShort = 0u,
)
