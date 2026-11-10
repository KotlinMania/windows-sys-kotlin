@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileId128

public data class UsnTrackModifiedRanges(
    public var flags: UInt = 0u,
    public var unused: UInt = 0u,
    public var chunkSize: ULong = 0uL,
    public var fileSizeThreshold: Long = 0L,
)

public data class VerifyInformation(
    public var startingOffset: Long = 0L,
    public var length: UInt = 0u,
)

public data class VirtualizationInstanceInfoInput(
    public var numberOfWorkerThreads: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class VirtualizationInstanceInfoInputEx(
    public var headerSize: UShort = 0u,
    public var flags: UInt = 0u,
    public var notificationInfoSize: UInt = 0u,
    public var notificationInfoOffset: UShort = 0u,
    public var providerMajorVersion: UShort = 0u,
)

public data class VirtualizationInstanceInfoOutput(
    public var virtualizationInstanceID: Guid = Guid(),
)

public data class VirtualStorageSetBehaviorInput(
    public var size: UInt = 0u,
    public var behaviorCode: VirtualStorageBehaviorCode = 0,
)

public data class VolumeBitmapBuffer(
    public var startingLcn: Long = 0L,
    public var bitmapSize: Long = 0L,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeBitmapBuffer) return false
        if (this.startingLcn != other.startingLcn) return false
        if (this.bitmapSize != other.bitmapSize) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startingLcn.hashCode()
        result = 31 * result + this.bitmapSize.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class VolumeDiskExtents(
    public var numberOfDiskExtents: UInt = 0u,
    public var extents: List<DiskExtent> = List(1) { DiskExtent() },
)

public data class VolumeGetGptAttributesInformation(
    public var gptAttributes: ULong = 0uL,
)

public data class WimProviderAddOverlayInput(
    public var wimType: UInt = 0u,
    public var wimIndex: UInt = 0u,
    public var wimFileNameOffset: UInt = 0u,
    public var wimFileNameLength: UInt = 0u,
)

public data class WimProviderExternalInfo(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var dataSourceId: Long = 0L,
    public var resourceHash: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WimProviderExternalInfo) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.dataSourceId != other.dataSourceId) return false
        if (!this.resourceHash.contentEquals(other.resourceHash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dataSourceId.hashCode()
        result = 31 * result + this.resourceHash.contentHashCode()
        return result
    }
}

public data class WimProviderOverlayEntry(
    public var nextEntryOffset: UInt = 0u,
    public var dataSourceId: Long = 0L,
    public var wimGuid: Guid = Guid(),
    public var wimFileNameOffset: UInt = 0u,
    public var wimType: UInt = 0u,
    public var wimIndex: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class WimProviderRemoveOverlayInput(
    public var dataSourceId: Long = 0L,
)

public data class WimProviderSuspendOverlayInput(
    public var dataSourceId: Long = 0L,
)

public data class WimProviderUpdateOverlayInput(
    public var dataSourceId: Long = 0L,
    public var wimFileNameOffset: UInt = 0u,
    public var wimFileNameLength: UInt = 0u,
)

public data class WofExternalFileId(
    public var fileId: FileId128 = FileId128(),
)

public data class WofExternalInfo(
    public var version: UInt = 0u,
    public var provider: UInt = 0u,
)

public data class WofVersionInfo(
    public var wofVersion: UInt = 0u,
)

public data class WriteUsnReasonInput(
    public var flags: UInt = 0u,
    public var usnReasonToWrite: UInt = 0u,
)
