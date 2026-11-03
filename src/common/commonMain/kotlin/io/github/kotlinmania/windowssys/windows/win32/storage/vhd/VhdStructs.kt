@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class APPLY_SNAPSHOT_VHDSET_PARAMETERS(public var Version: APPLY_SNAPSHOT_VHDSET_VERSION = 0, public var Anonymous: APPLY_SNAPSHOT_VHDSET_PARAMETERS_0 = APPLY_SNAPSHOT_VHDSET_PARAMETERS_0())

public data class APPLY_SNAPSHOT_VHDSET_PARAMETERS_0(public var Version1: APPLY_SNAPSHOT_VHDSET_PARAMETERS_0_0 = APPLY_SNAPSHOT_VHDSET_PARAMETERS_0_0())

public data class APPLY_SNAPSHOT_VHDSET_PARAMETERS_0_0(public var SnapshotId: GUID = GUID(), public var LeafSnapshotId: GUID = GUID())

public data class ATTACH_VIRTUAL_DISK_PARAMETERS(public var Version: ATTACH_VIRTUAL_DISK_VERSION = 0, public var Anonymous: ATTACH_VIRTUAL_DISK_PARAMETERS_0 = ATTACH_VIRTUAL_DISK_PARAMETERS_0())

public data class ATTACH_VIRTUAL_DISK_PARAMETERS_0(public var Version1: ATTACH_VIRTUAL_DISK_PARAMETERS_0_0 = ATTACH_VIRTUAL_DISK_PARAMETERS_0_0(), public var Version2: ATTACH_VIRTUAL_DISK_PARAMETERS_0_1 = ATTACH_VIRTUAL_DISK_PARAMETERS_0_1())

public data class ATTACH_VIRTUAL_DISK_PARAMETERS_0_0(public var Reserved: UInt = 0u)

public data class ATTACH_VIRTUAL_DISK_PARAMETERS_0_1(public var RestrictedOffset: ULong = 0uL, public var RestrictedLength: ULong = 0uL)

public data class COMPACT_VIRTUAL_DISK_PARAMETERS(public var Version: COMPACT_VIRTUAL_DISK_VERSION = 0, public var Anonymous: COMPACT_VIRTUAL_DISK_PARAMETERS_0 = COMPACT_VIRTUAL_DISK_PARAMETERS_0())

public data class COMPACT_VIRTUAL_DISK_PARAMETERS_0(public var Version1: COMPACT_VIRTUAL_DISK_PARAMETERS_0_0 = COMPACT_VIRTUAL_DISK_PARAMETERS_0_0())

public data class COMPACT_VIRTUAL_DISK_PARAMETERS_0_0(public var Reserved: UInt = 0u)

public data class CREATE_VIRTUAL_DISK_PARAMETERS(public var Version: CREATE_VIRTUAL_DISK_VERSION = 0, public var Anonymous: CREATE_VIRTUAL_DISK_PARAMETERS_0 = CREATE_VIRTUAL_DISK_PARAMETERS_0())

public data class CREATE_VIRTUAL_DISK_PARAMETERS_0(
    public var Version1: CREATE_VIRTUAL_DISK_PARAMETERS_0_0 = CREATE_VIRTUAL_DISK_PARAMETERS_0_0(),
    public var Version2: CREATE_VIRTUAL_DISK_PARAMETERS_0_1 = CREATE_VIRTUAL_DISK_PARAMETERS_0_1(),
    public var Version3: CREATE_VIRTUAL_DISK_PARAMETERS_0_2 = CREATE_VIRTUAL_DISK_PARAMETERS_0_2(),
    public var Version4: CREATE_VIRTUAL_DISK_PARAMETERS_0_3 = CREATE_VIRTUAL_DISK_PARAMETERS_0_3(),
)

public data class CREATE_VIRTUAL_DISK_PARAMETERS_0_0(
    public var UniqueId: GUID = GUID(),
    public var MaximumSize: ULong = 0uL,
    public var BlockSizeInBytes: UInt = 0u,
    public var SectorSizeInBytes: UInt = 0u,
    public var ParentPath: PCWSTR = 0L,
    public var SourcePath: PCWSTR = 0L,
)

public data class CREATE_VIRTUAL_DISK_PARAMETERS_0_1(
    public var UniqueId: GUID = GUID(),
    public var MaximumSize: ULong = 0uL,
    public var BlockSizeInBytes: UInt = 0u,
    public var SectorSizeInBytes: UInt = 0u,
    public var PhysicalSectorSizeInBytes: UInt = 0u,
    public var ParentPath: PCWSTR = 0L,
    public var SourcePath: PCWSTR = 0L,
    public var OpenFlags: OPEN_VIRTUAL_DISK_FLAG = 0,
    public var ParentVirtualStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
    public var SourceVirtualStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
    public var ResiliencyGuid: GUID = GUID(),
)

public data class CREATE_VIRTUAL_DISK_PARAMETERS_0_2(
    public var UniqueId: GUID = GUID(),
    public var MaximumSize: ULong = 0uL,
    public var BlockSizeInBytes: UInt = 0u,
    public var SectorSizeInBytes: UInt = 0u,
    public var PhysicalSectorSizeInBytes: UInt = 0u,
    public var ParentPath: PCWSTR = 0L,
    public var SourcePath: PCWSTR = 0L,
    public var OpenFlags: OPEN_VIRTUAL_DISK_FLAG = 0,
    public var ParentVirtualStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
    public var SourceVirtualStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
    public var ResiliencyGuid: GUID = GUID(),
    public var SourceLimitPath: PCWSTR = 0L,
    public var BackingStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
)

public data class CREATE_VIRTUAL_DISK_PARAMETERS_0_3(
    public var UniqueId: GUID = GUID(),
    public var MaximumSize: ULong = 0uL,
    public var BlockSizeInBytes: UInt = 0u,
    public var SectorSizeInBytes: UInt = 0u,
    public var PhysicalSectorSizeInBytes: UInt = 0u,
    public var ParentPath: PCWSTR = 0L,
    public var SourcePath: PCWSTR = 0L,
    public var OpenFlags: OPEN_VIRTUAL_DISK_FLAG = 0,
    public var ParentVirtualStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
    public var SourceVirtualStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
    public var ResiliencyGuid: GUID = GUID(),
    public var SourceLimitPath: PCWSTR = 0L,
    public var BackingStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
    public var PmemAddressAbstractionType: GUID = GUID(),
    public var DataAlignment: ULong = 0uL,
)

public data class DELETE_SNAPSHOT_VHDSET_PARAMETERS(public var Version: DELETE_SNAPSHOT_VHDSET_VERSION = 0, public var Anonymous: DELETE_SNAPSHOT_VHDSET_PARAMETERS_0 = DELETE_SNAPSHOT_VHDSET_PARAMETERS_0())

public data class DELETE_SNAPSHOT_VHDSET_PARAMETERS_0(public var Version1: DELETE_SNAPSHOT_VHDSET_PARAMETERS_0_0 = DELETE_SNAPSHOT_VHDSET_PARAMETERS_0_0())

public data class DELETE_SNAPSHOT_VHDSET_PARAMETERS_0_0(public var SnapshotId: GUID = GUID())

public data class EXPAND_VIRTUAL_DISK_PARAMETERS(public var Version: EXPAND_VIRTUAL_DISK_VERSION = 0, public var Anonymous: EXPAND_VIRTUAL_DISK_PARAMETERS_0 = EXPAND_VIRTUAL_DISK_PARAMETERS_0())

public data class EXPAND_VIRTUAL_DISK_PARAMETERS_0(public var Version1: EXPAND_VIRTUAL_DISK_PARAMETERS_0_0 = EXPAND_VIRTUAL_DISK_PARAMETERS_0_0())

public data class EXPAND_VIRTUAL_DISK_PARAMETERS_0_0(public var NewSize: ULong = 0uL)

public data class FORK_VIRTUAL_DISK_PARAMETERS(public var Version: FORK_VIRTUAL_DISK_VERSION = 0, public var Anonymous: FORK_VIRTUAL_DISK_PARAMETERS_0 = FORK_VIRTUAL_DISK_PARAMETERS_0())

public data class FORK_VIRTUAL_DISK_PARAMETERS_0(public var Version1: FORK_VIRTUAL_DISK_PARAMETERS_0_0 = FORK_VIRTUAL_DISK_PARAMETERS_0_0())

public data class FORK_VIRTUAL_DISK_PARAMETERS_0_0(public var ForkedVirtualDiskPath: PCWSTR = 0L)

public data class GET_VIRTUAL_DISK_INFO(public var Version: GET_VIRTUAL_DISK_INFO_VERSION = 0, public var Anonymous: GET_VIRTUAL_DISK_INFO_0 = GET_VIRTUAL_DISK_INFO_0())

public data class GET_VIRTUAL_DISK_INFO_0(
    public var Size: GET_VIRTUAL_DISK_INFO_0_0 = GET_VIRTUAL_DISK_INFO_0_0(),
    public var Identifier: GUID = GUID(),
    public var ParentLocation: GET_VIRTUAL_DISK_INFO_0_1 = GET_VIRTUAL_DISK_INFO_0_1(),
    public var ParentIdentifier: GUID = GUID(),
    public var ParentTimestamp: UInt = 0u,
    public var VirtualStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
    public var ProviderSubtype: UInt = 0u,
    public var Is4kAligned: BOOL = 0,
    public var IsLoaded: BOOL = 0,
    public var PhysicalDisk: GET_VIRTUAL_DISK_INFO_0_2 = GET_VIRTUAL_DISK_INFO_0_2(),
    public var VhdPhysicalSectorSize: UInt = 0u,
    public var SmallestSafeVirtualSize: ULong = 0uL,
    public var FragmentationPercentage: UInt = 0u,
    public var VirtualDiskId: GUID = GUID(),
    public var ChangeTrackingState: GET_VIRTUAL_DISK_INFO_0_3 = GET_VIRTUAL_DISK_INFO_0_3(),
)

public data class GET_VIRTUAL_DISK_INFO_0_3(
    public var Enabled: BOOL = 0,
    public var NewerChanges: BOOL = 0,
    public var MostRecentId: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GET_VIRTUAL_DISK_INFO_0_3) return false
        if (this.Enabled != other.Enabled) return false
        if (this.NewerChanges != other.NewerChanges) return false
        if (!this.MostRecentId.contentEquals(other.MostRecentId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Enabled.hashCode()
        result = 31 * result + this.NewerChanges.hashCode()
        result = 31 * result + this.MostRecentId.contentHashCode()
        return result
    }
}

public data class GET_VIRTUAL_DISK_INFO_0_1(public var ParentResolved: BOOL = 0, public var ParentLocationBuffer: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GET_VIRTUAL_DISK_INFO_0_1) return false
        if (this.ParentResolved != other.ParentResolved) return false
        if (!this.ParentLocationBuffer.contentEquals(other.ParentLocationBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ParentResolved.hashCode()
        result = 31 * result + this.ParentLocationBuffer.contentHashCode()
        return result
    }
}

public data class GET_VIRTUAL_DISK_INFO_0_2(
    public var LogicalSectorSize: UInt = 0u,
    public var PhysicalSectorSize: UInt = 0u,
    public var IsRemote: BOOL = 0,
)

public data class GET_VIRTUAL_DISK_INFO_0_0(
    public var VirtualSize: ULong = 0uL,
    public var PhysicalSize: ULong = 0uL,
    public var BlockSize: UInt = 0u,
    public var SectorSize: UInt = 0u,
)

public data class MERGE_VIRTUAL_DISK_PARAMETERS(public var Version: MERGE_VIRTUAL_DISK_VERSION = 0, public var Anonymous: MERGE_VIRTUAL_DISK_PARAMETERS_0 = MERGE_VIRTUAL_DISK_PARAMETERS_0())

public data class MERGE_VIRTUAL_DISK_PARAMETERS_0(public var Version1: MERGE_VIRTUAL_DISK_PARAMETERS_0_0 = MERGE_VIRTUAL_DISK_PARAMETERS_0_0(), public var Version2: MERGE_VIRTUAL_DISK_PARAMETERS_0_1 = MERGE_VIRTUAL_DISK_PARAMETERS_0_1())

public data class MERGE_VIRTUAL_DISK_PARAMETERS_0_0(public var MergeDepth: UInt = 0u)

public data class MERGE_VIRTUAL_DISK_PARAMETERS_0_1(public var MergeSourceDepth: UInt = 0u, public var MergeTargetDepth: UInt = 0u)

public data class MIRROR_VIRTUAL_DISK_PARAMETERS(public var Version: MIRROR_VIRTUAL_DISK_VERSION = 0, public var Anonymous: MIRROR_VIRTUAL_DISK_PARAMETERS_0 = MIRROR_VIRTUAL_DISK_PARAMETERS_0())

public data class MIRROR_VIRTUAL_DISK_PARAMETERS_0(public var Version1: MIRROR_VIRTUAL_DISK_PARAMETERS_0_0 = MIRROR_VIRTUAL_DISK_PARAMETERS_0_0())

public data class MIRROR_VIRTUAL_DISK_PARAMETERS_0_0(public var MirrorVirtualDiskPath: PCWSTR = 0L)

public data class MODIFY_VHDSET_PARAMETERS(public var Version: MODIFY_VHDSET_VERSION = 0, public var Anonymous: MODIFY_VHDSET_PARAMETERS_0 = MODIFY_VHDSET_PARAMETERS_0())

public data class MODIFY_VHDSET_PARAMETERS_0(
    public var SnapshotPath: MODIFY_VHDSET_PARAMETERS_0_0 = MODIFY_VHDSET_PARAMETERS_0_0(),
    public var SnapshotId: GUID = GUID(),
    public var DefaultFilePath: PCWSTR = 0L,
)

public data class MODIFY_VHDSET_PARAMETERS_0_0(public var SnapshotId: GUID = GUID(), public var SnapshotFilePath: PCWSTR = 0L)

public data class OPEN_VIRTUAL_DISK_PARAMETERS(public var Version: OPEN_VIRTUAL_DISK_VERSION = 0, public var Anonymous: OPEN_VIRTUAL_DISK_PARAMETERS_0 = OPEN_VIRTUAL_DISK_PARAMETERS_0())

public data class OPEN_VIRTUAL_DISK_PARAMETERS_0(
    public var Version1: OPEN_VIRTUAL_DISK_PARAMETERS_0_0 = OPEN_VIRTUAL_DISK_PARAMETERS_0_0(),
    public var Version2: OPEN_VIRTUAL_DISK_PARAMETERS_0_1 = OPEN_VIRTUAL_DISK_PARAMETERS_0_1(),
    public var Version3: OPEN_VIRTUAL_DISK_PARAMETERS_0_2 = OPEN_VIRTUAL_DISK_PARAMETERS_0_2(),
)

public data class OPEN_VIRTUAL_DISK_PARAMETERS_0_0(public var RWDepth: UInt = 0u)

public data class OPEN_VIRTUAL_DISK_PARAMETERS_0_1(
    public var GetInfoOnly: BOOL = 0,
    public var ReadOnly: BOOL = 0,
    public var ResiliencyGuid: GUID = GUID(),
)

public data class OPEN_VIRTUAL_DISK_PARAMETERS_0_2(
    public var GetInfoOnly: BOOL = 0,
    public var ReadOnly: BOOL = 0,
    public var ResiliencyGuid: GUID = GUID(),
    public var SnapshotId: GUID = GUID(),
)

public data class QUERY_CHANGES_VIRTUAL_DISK_RANGE(
    public var ByteOffset: ULong = 0uL,
    public var ByteLength: ULong = 0uL,
    public var Reserved: ULong = 0uL,
)

public data class RAW_SCSI_VIRTUAL_DISK_PARAMETERS(public var Version: RAW_SCSI_VIRTUAL_DISK_VERSION = 0, public var Anonymous: RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0 = RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0())

public data class RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0(public var Version1: RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0_0 = RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0_0())

public data class RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0_0(
    public var RSVDHandle: BOOL = 0,
    public var DataIn: UByte = 0u,
    public var CdbLength: UByte = 0u,
    public var SenseInfoLength: UByte = 0u,
    public var SrbFlags: UInt = 0u,
    public var DataTransferLength: UInt = 0u,
    public var DataBuffer: Long = 0L,
    public var SenseInfo: Long = 0L,
    public var Cdb: Long = 0L,
)

public data class RAW_SCSI_VIRTUAL_DISK_RESPONSE(public var Version: RAW_SCSI_VIRTUAL_DISK_VERSION = 0, public var Anonymous: RAW_SCSI_VIRTUAL_DISK_RESPONSE_0 = RAW_SCSI_VIRTUAL_DISK_RESPONSE_0())

public data class RAW_SCSI_VIRTUAL_DISK_RESPONSE_0(public var Version1: RAW_SCSI_VIRTUAL_DISK_RESPONSE_0_0 = RAW_SCSI_VIRTUAL_DISK_RESPONSE_0_0())

public data class RAW_SCSI_VIRTUAL_DISK_RESPONSE_0_0(
    public var ScsiStatus: UByte = 0u,
    public var SenseInfoLength: UByte = 0u,
    public var DataTransferLength: UInt = 0u,
)

public data class RESIZE_VIRTUAL_DISK_PARAMETERS(public var Version: RESIZE_VIRTUAL_DISK_VERSION = 0, public var Anonymous: RESIZE_VIRTUAL_DISK_PARAMETERS_0 = RESIZE_VIRTUAL_DISK_PARAMETERS_0())

public data class RESIZE_VIRTUAL_DISK_PARAMETERS_0(public var Version1: RESIZE_VIRTUAL_DISK_PARAMETERS_0_0 = RESIZE_VIRTUAL_DISK_PARAMETERS_0_0())

public data class RESIZE_VIRTUAL_DISK_PARAMETERS_0_0(public var NewSize: ULong = 0uL)

public data class SET_VIRTUAL_DISK_INFO(public var Version: SET_VIRTUAL_DISK_INFO_VERSION = 0, public var Anonymous: SET_VIRTUAL_DISK_INFO_0 = SET_VIRTUAL_DISK_INFO_0())

public data class SET_VIRTUAL_DISK_INFO_0(
    public var ParentFilePath: PCWSTR = 0L,
    public var UniqueIdentifier: GUID = GUID(),
    public var ParentPathWithDepthInfo: SET_VIRTUAL_DISK_INFO_0_0 = SET_VIRTUAL_DISK_INFO_0_0(),
    public var VhdPhysicalSectorSize: UInt = 0u,
    public var VirtualDiskId: GUID = GUID(),
    public var ChangeTrackingEnabled: BOOL = 0,
    public var ParentLocator: SET_VIRTUAL_DISK_INFO_0_1 = SET_VIRTUAL_DISK_INFO_0_1(),
)

public data class SET_VIRTUAL_DISK_INFO_0_1(public var LinkageId: GUID = GUID(), public var ParentFilePath: PCWSTR = 0L)

public data class SET_VIRTUAL_DISK_INFO_0_0(public var ChildDepth: UInt = 0u, public var ParentFilePath: PCWSTR = 0L)

public data class STORAGE_DEPENDENCY_INFO(
    public var Version: STORAGE_DEPENDENCY_INFO_VERSION = 0,
    public var NumberEntries: UInt = 0u,
    public var Anonymous: STORAGE_DEPENDENCY_INFO_0 = STORAGE_DEPENDENCY_INFO_0(),
)

public data class STORAGE_DEPENDENCY_INFO_0(public var Version1Entries: List<STORAGE_DEPENDENCY_INFO_TYPE_1> = List(1) { STORAGE_DEPENDENCY_INFO_TYPE_1() }, public var Version2Entries: List<STORAGE_DEPENDENCY_INFO_TYPE_2> = List(1) { STORAGE_DEPENDENCY_INFO_TYPE_2() })

public data class STORAGE_DEPENDENCY_INFO_TYPE_1(
    public var DependencyTypeFlags: DEPENDENT_DISK_FLAG = 0,
    public var ProviderSpecificFlags: UInt = 0u,
    public var VirtualStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
)

public data class STORAGE_DEPENDENCY_INFO_TYPE_2(
    public var DependencyTypeFlags: DEPENDENT_DISK_FLAG = 0,
    public var ProviderSpecificFlags: UInt = 0u,
    public var VirtualStorageType: VIRTUAL_STORAGE_TYPE = VIRTUAL_STORAGE_TYPE(),
    public var AncestorLevel: UInt = 0u,
    public var DependencyDeviceName: PWSTR = 0L,
    public var HostVolumeName: PWSTR = 0L,
    public var DependentVolumeName: PWSTR = 0L,
    public var DependentVolumeRelativePath: PWSTR = 0L,
)

public data class TAKE_SNAPSHOT_VHDSET_PARAMETERS(public var Version: TAKE_SNAPSHOT_VHDSET_VERSION = 0, public var Anonymous: TAKE_SNAPSHOT_VHDSET_PARAMETERS_0 = TAKE_SNAPSHOT_VHDSET_PARAMETERS_0())

public data class TAKE_SNAPSHOT_VHDSET_PARAMETERS_0(public var Version1: TAKE_SNAPSHOT_VHDSET_PARAMETERS_0_0 = TAKE_SNAPSHOT_VHDSET_PARAMETERS_0_0())

public data class TAKE_SNAPSHOT_VHDSET_PARAMETERS_0_0(public var SnapshotId: GUID = GUID())

public data class VIRTUAL_DISK_PROGRESS(
    public var OperationStatus: UInt = 0u,
    public var CurrentValue: ULong = 0uL,
    public var CompletionValue: ULong = 0uL,
)

public data class VIRTUAL_STORAGE_TYPE(public var DeviceId: UInt = 0u, public var VendorId: GUID = GUID())
