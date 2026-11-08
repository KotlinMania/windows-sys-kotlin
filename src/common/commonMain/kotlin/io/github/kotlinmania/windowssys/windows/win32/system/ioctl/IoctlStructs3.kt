@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_ID_128

public data class USN_TRACK_MODIFIED_RANGES(
    public var Flags: UInt = 0u,
    public var Unused: UInt = 0u,
    public var ChunkSize: ULong = 0uL,
    public var FileSizeThreshold: Long = 0L,
)

public data class VERIFY_INFORMATION(public var StartingOffset: Long = 0L, public var Length: UInt = 0u)

public data class VIRTUALIZATION_INSTANCE_INFO_INPUT(public var NumberOfWorkerThreads: UInt = 0u, public var Flags: UInt = 0u)

public data class VIRTUALIZATION_INSTANCE_INFO_INPUT_EX(
    public var HeaderSize: UShort = 0u,
    public var Flags: UInt = 0u,
    public var NotificationInfoSize: UInt = 0u,
    public var NotificationInfoOffset: UShort = 0u,
    public var ProviderMajorVersion: UShort = 0u,
)

public data class VIRTUALIZATION_INSTANCE_INFO_OUTPUT(public var VirtualizationInstanceID: GUID = GUID())

public data class VIRTUAL_STORAGE_SET_BEHAVIOR_INPUT(public var Size: UInt = 0u, public var BehaviorCode: VIRTUAL_STORAGE_BEHAVIOR_CODE = 0)

public data class VOLUME_BITMAP_BUFFER(
    public var StartingLcn: Long = 0L,
    public var BitmapSize: Long = 0L,
    public var Buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VOLUME_BITMAP_BUFFER) return false
        if (this.StartingLcn != other.StartingLcn) return false
        if (this.BitmapSize != other.BitmapSize) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.StartingLcn.hashCode()
        result = 31 * result + this.BitmapSize.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class VOLUME_DISK_EXTENTS(public var NumberOfDiskExtents: UInt = 0u, public var Extents: List<DISK_EXTENT> = List(1) { DISK_EXTENT() })

public data class VOLUME_GET_GPT_ATTRIBUTES_INFORMATION(public var GptAttributes: ULong = 0uL)

public data class WIM_PROVIDER_ADD_OVERLAY_INPUT(
    public var WimType: UInt = 0u,
    public var WimIndex: UInt = 0u,
    public var WimFileNameOffset: UInt = 0u,
    public var WimFileNameLength: UInt = 0u,
)

public data class WIM_PROVIDER_EXTERNAL_INFO(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DataSourceId: Long = 0L,
    public var ResourceHash: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WIM_PROVIDER_EXTERNAL_INFO) return false
        if (this.Version != other.Version) return false
        if (this.Flags != other.Flags) return false
        if (this.DataSourceId != other.DataSourceId) return false
        if (!this.ResourceHash.contentEquals(other.ResourceHash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.DataSourceId.hashCode()
        result = 31 * result + this.ResourceHash.contentHashCode()
        return result
    }
}

public data class WIM_PROVIDER_OVERLAY_ENTRY(
    public var NextEntryOffset: UInt = 0u,
    public var DataSourceId: Long = 0L,
    public var WimGuid: GUID = GUID(),
    public var WimFileNameOffset: UInt = 0u,
    public var WimType: UInt = 0u,
    public var WimIndex: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class WIM_PROVIDER_REMOVE_OVERLAY_INPUT(public var DataSourceId: Long = 0L)

public data class WIM_PROVIDER_SUSPEND_OVERLAY_INPUT(public var DataSourceId: Long = 0L)

public data class WIM_PROVIDER_UPDATE_OVERLAY_INPUT(
    public var DataSourceId: Long = 0L,
    public var WimFileNameOffset: UInt = 0u,
    public var WimFileNameLength: UInt = 0u,
)

public data class WOF_EXTERNAL_FILE_ID(public var FileId: FILE_ID_128 = FILE_ID_128())

public data class WOF_EXTERNAL_INFO(public var Version: UInt = 0u, public var Provider: UInt = 0u)

public data class WOF_VERSION_INFO(public var WofVersion: UInt = 0u)

public data class WRITE_USN_REASON_INPUT(public var Flags: UInt = 0u, public var UsnReasonToWrite: UInt = 0u)
