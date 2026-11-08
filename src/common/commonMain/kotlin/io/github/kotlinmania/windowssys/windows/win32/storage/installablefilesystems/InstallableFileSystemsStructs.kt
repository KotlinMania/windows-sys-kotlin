@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public data class FILTER_AGGREGATE_BASIC_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Type: FILTER_AGGREGATE_BASIC_INFORMATION_0 = FILTER_AGGREGATE_BASIC_INFORMATION_0(),
)

public data class FILTER_AGGREGATE_BASIC_INFORMATION_0(public var MiniFilter: FILTER_AGGREGATE_BASIC_INFORMATION_0_0 = FILTER_AGGREGATE_BASIC_INFORMATION_0_0(), public var LegacyFilter: FILTER_AGGREGATE_BASIC_INFORMATION_0_1 = FILTER_AGGREGATE_BASIC_INFORMATION_0_1())

public data class FILTER_AGGREGATE_BASIC_INFORMATION_0_1(public var FilterNameLength: UShort = 0u, public var FilterNameBufferOffset: UShort = 0u)

public data class FILTER_AGGREGATE_BASIC_INFORMATION_0_0(
    public var FrameID: UInt = 0u,
    public var NumberOfInstances: UInt = 0u,
    public var FilterNameLength: UShort = 0u,
    public var FilterNameBufferOffset: UShort = 0u,
    public var FilterAltitudeLength: UShort = 0u,
    public var FilterAltitudeBufferOffset: UShort = 0u,
)

public data class FILTER_AGGREGATE_STANDARD_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Type: FILTER_AGGREGATE_STANDARD_INFORMATION_0 = FILTER_AGGREGATE_STANDARD_INFORMATION_0(),
)

public data class FILTER_AGGREGATE_STANDARD_INFORMATION_0(public var MiniFilter: FILTER_AGGREGATE_STANDARD_INFORMATION_0_0 = FILTER_AGGREGATE_STANDARD_INFORMATION_0_0(), public var LegacyFilter: FILTER_AGGREGATE_STANDARD_INFORMATION_0_1 = FILTER_AGGREGATE_STANDARD_INFORMATION_0_1())

public data class FILTER_AGGREGATE_STANDARD_INFORMATION_0_1(
    public var Flags: UInt = 0u,
    public var FilterNameLength: UShort = 0u,
    public var FilterNameBufferOffset: UShort = 0u,
    public var FilterAltitudeLength: UShort = 0u,
    public var FilterAltitudeBufferOffset: UShort = 0u,
)

public data class FILTER_AGGREGATE_STANDARD_INFORMATION_0_0(
    public var Flags: UInt = 0u,
    public var FrameID: UInt = 0u,
    public var NumberOfInstances: UInt = 0u,
    public var FilterNameLength: UShort = 0u,
    public var FilterNameBufferOffset: UShort = 0u,
    public var FilterAltitudeLength: UShort = 0u,
    public var FilterAltitudeBufferOffset: UShort = 0u,
)

public data class FILTER_FULL_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var FrameID: UInt = 0u,
    public var NumberOfInstances: UInt = 0u,
    public var FilterNameLength: UShort = 0u,
    public var FilterNameBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILTER_FULL_INFORMATION) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.FrameID != other.FrameID) return false
        if (this.NumberOfInstances != other.NumberOfInstances) return false
        if (this.FilterNameLength != other.FilterNameLength) return false
        if (!this.FilterNameBuffer.contentEquals(other.FilterNameBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.FrameID.hashCode()
        result = 31 * result + this.NumberOfInstances.hashCode()
        result = 31 * result + this.FilterNameLength.hashCode()
        result = 31 * result + this.FilterNameBuffer.contentHashCode()
        return result
    }
}

public data class FILTER_MESSAGE_HEADER(public var ReplyLength: UInt = 0u, public var MessageId: ULong = 0uL)

public data class FILTER_REPLY_HEADER(public var Status: NTSTATUS = 0, public var MessageId: ULong = 0uL)

public data class FILTER_VOLUME_BASIC_INFORMATION(public var FilterVolumeNameLength: UShort = 0u, public var FilterVolumeName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILTER_VOLUME_BASIC_INFORMATION) return false
        if (this.FilterVolumeNameLength != other.FilterVolumeNameLength) return false
        if (!this.FilterVolumeName.contentEquals(other.FilterVolumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FilterVolumeNameLength.hashCode()
        result = 31 * result + this.FilterVolumeName.contentHashCode()
        return result
    }
}

public data class FILTER_VOLUME_STANDARD_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var Flags: UInt = 0u,
    public var FrameID: UInt = 0u,
    public var FileSystemType: FLT_FILESYSTEM_TYPE = 0,
    public var FilterVolumeNameLength: UShort = 0u,
    public var FilterVolumeName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILTER_VOLUME_STANDARD_INFORMATION) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.Flags != other.Flags) return false
        if (this.FrameID != other.FrameID) return false
        if (this.FileSystemType != other.FileSystemType) return false
        if (this.FilterVolumeNameLength != other.FilterVolumeNameLength) return false
        if (!this.FilterVolumeName.contentEquals(other.FilterVolumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.FrameID.hashCode()
        result = 31 * result + this.FileSystemType.hashCode()
        result = 31 * result + this.FilterVolumeNameLength.hashCode()
        result = 31 * result + this.FilterVolumeName.contentHashCode()
        return result
    }
}

public data class INSTANCE_AGGREGATE_STANDARD_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Type: INSTANCE_AGGREGATE_STANDARD_INFORMATION_0 = INSTANCE_AGGREGATE_STANDARD_INFORMATION_0(),
)

public data class INSTANCE_AGGREGATE_STANDARD_INFORMATION_0(public var MiniFilter: INSTANCE_AGGREGATE_STANDARD_INFORMATION_0_0 = INSTANCE_AGGREGATE_STANDARD_INFORMATION_0_0(), public var LegacyFilter: INSTANCE_AGGREGATE_STANDARD_INFORMATION_0_1 = INSTANCE_AGGREGATE_STANDARD_INFORMATION_0_1())

public data class INSTANCE_AGGREGATE_STANDARD_INFORMATION_0_1(
    public var Flags: UInt = 0u,
    public var AltitudeLength: UShort = 0u,
    public var AltitudeBufferOffset: UShort = 0u,
    public var VolumeNameLength: UShort = 0u,
    public var VolumeNameBufferOffset: UShort = 0u,
    public var FilterNameLength: UShort = 0u,
    public var FilterNameBufferOffset: UShort = 0u,
    public var SupportedFeatures: UInt = 0u,
)

public data class INSTANCE_AGGREGATE_STANDARD_INFORMATION_0_0(
    public var Flags: UInt = 0u,
    public var FrameID: UInt = 0u,
    public var VolumeFileSystemType: FLT_FILESYSTEM_TYPE = 0,
    public var InstanceNameLength: UShort = 0u,
    public var InstanceNameBufferOffset: UShort = 0u,
    public var AltitudeLength: UShort = 0u,
    public var AltitudeBufferOffset: UShort = 0u,
    public var VolumeNameLength: UShort = 0u,
    public var VolumeNameBufferOffset: UShort = 0u,
    public var FilterNameLength: UShort = 0u,
    public var FilterNameBufferOffset: UShort = 0u,
    public var SupportedFeatures: UInt = 0u,
)

public data class INSTANCE_BASIC_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var InstanceNameLength: UShort = 0u,
    public var InstanceNameBufferOffset: UShort = 0u,
)

public data class INSTANCE_FULL_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var InstanceNameLength: UShort = 0u,
    public var InstanceNameBufferOffset: UShort = 0u,
    public var AltitudeLength: UShort = 0u,
    public var AltitudeBufferOffset: UShort = 0u,
    public var VolumeNameLength: UShort = 0u,
    public var VolumeNameBufferOffset: UShort = 0u,
    public var FilterNameLength: UShort = 0u,
    public var FilterNameBufferOffset: UShort = 0u,
)

public data class INSTANCE_PARTIAL_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var InstanceNameLength: UShort = 0u,
    public var InstanceNameBufferOffset: UShort = 0u,
    public var AltitudeLength: UShort = 0u,
    public var AltitudeBufferOffset: UShort = 0u,
)
