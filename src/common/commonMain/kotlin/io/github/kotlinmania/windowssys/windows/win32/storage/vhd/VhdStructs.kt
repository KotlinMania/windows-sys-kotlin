@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class ApplySnapshotVhdsetParameters(
    public var version: ApplySnapshotVhdsetVersion = 0,
    public var anonymous: ApplySnapshotVhdsetParameters0 = ApplySnapshotVhdsetParameters0(),
)

public data class ApplySnapshotVhdsetParameters0(
    public var version1: ApplySnapshotVhdsetParameters00 = ApplySnapshotVhdsetParameters00(),
)

public data class ApplySnapshotVhdsetParameters00(
    public var snapshotId: Guid = Guid(),
    public var leafSnapshotId: Guid = Guid(),
)

public data class AttachVirtualDiskParameters(
    public var version: AttachVirtualDiskVersion = 0,
    public var anonymous: AttachVirtualDiskParameters0 = AttachVirtualDiskParameters0(),
)

public data class AttachVirtualDiskParameters0(
    public var version1: AttachVirtualDiskParameters00 = AttachVirtualDiskParameters00(),
    public var version2: AttachVirtualDiskParameters01 = AttachVirtualDiskParameters01(),
)

public data class AttachVirtualDiskParameters00(
    public var reserved: UInt = 0u,
)

public data class AttachVirtualDiskParameters01(
    public var restrictedOffset: ULong = 0uL,
    public var restrictedLength: ULong = 0uL,
)

public data class CompactVirtualDiskParameters(
    public var version: CompactVirtualDiskVersion = 0,
    public var anonymous: CompactVirtualDiskParameters0 = CompactVirtualDiskParameters0(),
)

public data class CompactVirtualDiskParameters0(
    public var version1: CompactVirtualDiskParameters00 = CompactVirtualDiskParameters00(),
)

public data class CompactVirtualDiskParameters00(
    public var reserved: UInt = 0u,
)

public data class CreateVirtualDiskParameters(
    public var version: CreateVirtualDiskVersion = 0,
    public var anonymous: CreateVirtualDiskParameters0 = CreateVirtualDiskParameters0(),
)

public data class CreateVirtualDiskParameters0(
    public var version1: CreateVirtualDiskParameters00 = CreateVirtualDiskParameters00(),
    public var version2: CreateVirtualDiskParameters01 = CreateVirtualDiskParameters01(),
    public var version3: CreateVirtualDiskParameters02 = CreateVirtualDiskParameters02(),
    public var version4: CreateVirtualDiskParameters03 = CreateVirtualDiskParameters03(),
)

public data class CreateVirtualDiskParameters00(
    public var uniqueId: Guid = Guid(),
    public var maximumSize: ULong = 0uL,
    public var blockSizeInBytes: UInt = 0u,
    public var sectorSizeInBytes: UInt = 0u,
    public var parentPath: Pcwstr = null,
    public var sourcePath: Pcwstr = null,
)

public data class CreateVirtualDiskParameters01(
    public var uniqueId: Guid = Guid(),
    public var maximumSize: ULong = 0uL,
    public var blockSizeInBytes: UInt = 0u,
    public var sectorSizeInBytes: UInt = 0u,
    public var physicalSectorSizeInBytes: UInt = 0u,
    public var parentPath: Pcwstr = null,
    public var sourcePath: Pcwstr = null,
    public var openFlags: OpenVirtualDiskFlag = 0,
    public var parentVirtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var sourceVirtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var resiliencyGuid: Guid = Guid(),
)

public data class CreateVirtualDiskParameters02(
    public var uniqueId: Guid = Guid(),
    public var maximumSize: ULong = 0uL,
    public var blockSizeInBytes: UInt = 0u,
    public var sectorSizeInBytes: UInt = 0u,
    public var physicalSectorSizeInBytes: UInt = 0u,
    public var parentPath: Pcwstr = null,
    public var sourcePath: Pcwstr = null,
    public var openFlags: OpenVirtualDiskFlag = 0,
    public var parentVirtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var sourceVirtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var resiliencyGuid: Guid = Guid(),
    public var sourceLimitPath: Pcwstr = null,
    public var backingStorageType: VirtualStorageType = VirtualStorageType(),
)

public data class CreateVirtualDiskParameters03(
    public var uniqueId: Guid = Guid(),
    public var maximumSize: ULong = 0uL,
    public var blockSizeInBytes: UInt = 0u,
    public var sectorSizeInBytes: UInt = 0u,
    public var physicalSectorSizeInBytes: UInt = 0u,
    public var parentPath: Pcwstr = null,
    public var sourcePath: Pcwstr = null,
    public var openFlags: OpenVirtualDiskFlag = 0,
    public var parentVirtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var sourceVirtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var resiliencyGuid: Guid = Guid(),
    public var sourceLimitPath: Pcwstr = null,
    public var backingStorageType: VirtualStorageType = VirtualStorageType(),
    public var pmemAddressAbstractionType: Guid = Guid(),
    public var dataAlignment: ULong = 0uL,
)

public data class DeleteSnapshotVhdsetParameters(
    public var version: DeleteSnapshotVhdsetVersion = 0,
    public var anonymous: DeleteSnapshotVhdsetParameters0 = DeleteSnapshotVhdsetParameters0(),
)

public data class DeleteSnapshotVhdsetParameters0(
    public var version1: DeleteSnapshotVhdsetParameters00 = DeleteSnapshotVhdsetParameters00(),
)

public data class DeleteSnapshotVhdsetParameters00(
    public var snapshotId: Guid = Guid(),
)

public data class ExpandVirtualDiskParameters(
    public var version: ExpandVirtualDiskVersion = 0,
    public var anonymous: ExpandVirtualDiskParameters0 = ExpandVirtualDiskParameters0(),
)

public data class ExpandVirtualDiskParameters0(
    public var version1: ExpandVirtualDiskParameters00 = ExpandVirtualDiskParameters00(),
)

public data class ExpandVirtualDiskParameters00(
    public var newSize: ULong = 0uL,
)

public data class ForkVirtualDiskParameters(
    public var version: ForkVirtualDiskVersion = 0,
    public var anonymous: ForkVirtualDiskParameters0 = ForkVirtualDiskParameters0(),
)

public data class ForkVirtualDiskParameters0(
    public var version1: ForkVirtualDiskParameters00 = ForkVirtualDiskParameters00(),
)

public data class ForkVirtualDiskParameters00(
    public var forkedVirtualDiskPath: Pcwstr = null,
)

public data class GetVirtualDiskInfo(
    public var version: GetVirtualDiskInfoVersion = 0,
    public var anonymous: GetVirtualDiskInfo0 = GetVirtualDiskInfo0(),
)

public data class GetVirtualDiskInfo0(
    public var size: GetVirtualDiskInfo00 = GetVirtualDiskInfo00(),
    public var identifier: Guid = Guid(),
    public var parentLocation: GetVirtualDiskInfo01 = GetVirtualDiskInfo01(),
    public var parentIdentifier: Guid = Guid(),
    public var parentTimestamp: UInt = 0u,
    public var virtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var providerSubtype: UInt = 0u,
    public var is4kAligned: Bool = 0,
    public var isLoaded: Bool = 0,
    public var physicalDisk: GetVirtualDiskInfo02 = GetVirtualDiskInfo02(),
    public var vhdPhysicalSectorSize: UInt = 0u,
    public var smallestSafeVirtualSize: ULong = 0uL,
    public var fragmentationPercentage: UInt = 0u,
    public var virtualDiskId: Guid = Guid(),
    public var changeTrackingState: GetVirtualDiskInfo03 = GetVirtualDiskInfo03(),
)

public data class GetVirtualDiskInfo03(
    public var enabled: Bool = 0,
    public var newerChanges: Bool = 0,
    public var mostRecentId: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetVirtualDiskInfo03) return false
        if (this.enabled != other.enabled) return false
        if (this.newerChanges != other.newerChanges) return false
        if (!this.mostRecentId.contentEquals(other.mostRecentId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enabled.hashCode()
        result = 31 * result + this.newerChanges.hashCode()
        result = 31 * result + this.mostRecentId.contentHashCode()
        return result
    }
}

public data class GetVirtualDiskInfo01(
    public var parentResolved: Bool = 0,
    public var parentLocationBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetVirtualDiskInfo01) return false
        if (this.parentResolved != other.parentResolved) return false
        if (!this.parentLocationBuffer.contentEquals(other.parentLocationBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parentResolved.hashCode()
        result = 31 * result + this.parentLocationBuffer.contentHashCode()
        return result
    }
}

public data class GetVirtualDiskInfo02(
    public var logicalSectorSize: UInt = 0u,
    public var physicalSectorSize: UInt = 0u,
    public var isRemote: Bool = 0,
)

public data class GetVirtualDiskInfo00(
    public var virtualSize: ULong = 0uL,
    public var physicalSize: ULong = 0uL,
    public var blockSize: UInt = 0u,
    public var sectorSize: UInt = 0u,
)

public data class MergeVirtualDiskParameters(
    public var version: MergeVirtualDiskVersion = 0,
    public var anonymous: MergeVirtualDiskParameters0 = MergeVirtualDiskParameters0(),
)

public data class MergeVirtualDiskParameters0(
    public var version1: MergeVirtualDiskParameters00 = MergeVirtualDiskParameters00(),
    public var version2: MergeVirtualDiskParameters01 = MergeVirtualDiskParameters01(),
)

public data class MergeVirtualDiskParameters00(
    public var mergeDepth: UInt = 0u,
)

public data class MergeVirtualDiskParameters01(
    public var mergeSourceDepth: UInt = 0u,
    public var mergeTargetDepth: UInt = 0u,
)

public data class MirrorVirtualDiskParameters(
    public var version: MirrorVirtualDiskVersion = 0,
    public var anonymous: MirrorVirtualDiskParameters0 = MirrorVirtualDiskParameters0(),
)

public data class MirrorVirtualDiskParameters0(
    public var version1: MirrorVirtualDiskParameters00 = MirrorVirtualDiskParameters00(),
)

public data class MirrorVirtualDiskParameters00(
    public var mirrorVirtualDiskPath: Pcwstr = null,
)

public data class ModifyVhdsetParameters(
    public var version: ModifyVhdsetVersion = 0,
    public var anonymous: ModifyVhdsetParameters0 = ModifyVhdsetParameters0(),
)

public data class ModifyVhdsetParameters0(
    public var snapshotPath: ModifyVhdsetParameters00 = ModifyVhdsetParameters00(),
    public var snapshotId: Guid = Guid(),
    public var defaultFilePath: Pcwstr = null,
)

public data class ModifyVhdsetParameters00(
    public var snapshotId: Guid = Guid(),
    public var snapshotFilePath: Pcwstr = null,
)

public data class OpenVirtualDiskParameters(
    public var version: OpenVirtualDiskVersion = 0,
    public var anonymous: OpenVirtualDiskParameters0 = OpenVirtualDiskParameters0(),
)

public data class OpenVirtualDiskParameters0(
    public var version1: OpenVirtualDiskParameters00 = OpenVirtualDiskParameters00(),
    public var version2: OpenVirtualDiskParameters01 = OpenVirtualDiskParameters01(),
    public var version3: OpenVirtualDiskParameters02 = OpenVirtualDiskParameters02(),
)

public data class OpenVirtualDiskParameters00(
    public var rWDepth: UInt = 0u,
)

public data class OpenVirtualDiskParameters01(
    public var getInfoOnly: Bool = 0,
    public var readOnly: Bool = 0,
    public var resiliencyGuid: Guid = Guid(),
)

public data class OpenVirtualDiskParameters02(
    public var getInfoOnly: Bool = 0,
    public var readOnly: Bool = 0,
    public var resiliencyGuid: Guid = Guid(),
    public var snapshotId: Guid = Guid(),
)

public data class QueryChangesVirtualDiskRange(
    public var byteOffset: ULong = 0uL,
    public var byteLength: ULong = 0uL,
    public var reserved: ULong = 0uL,
)

public data class RawScsiVirtualDiskParameters(
    public var version: RawScsiVirtualDiskVersion = 0,
    public var anonymous: RawScsiVirtualDiskParameters0 = RawScsiVirtualDiskParameters0(),
)

public data class RawScsiVirtualDiskParameters0(
    public var version1: RawScsiVirtualDiskParameters00 = RawScsiVirtualDiskParameters00(),
)

public data class RawScsiVirtualDiskParameters00(
    public var rSVDHandle: Bool = 0,
    public var dataIn: UByte = 0u,
    public var cdbLength: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var srbFlags: UInt = 0u,
    public var dataTransferLength: UInt = 0u,
    public var dataBuffer: COpaquePointer? = null,
    public var senseInfo: COpaquePointer? = null,
    public var cdb: COpaquePointer? = null,
)

public data class RawScsiVirtualDiskResponse(
    public var version: RawScsiVirtualDiskVersion = 0,
    public var anonymous: RawScsiVirtualDiskResponse0 = RawScsiVirtualDiskResponse0(),
)

public data class RawScsiVirtualDiskResponse0(
    public var version1: RawScsiVirtualDiskResponse00 = RawScsiVirtualDiskResponse00(),
)

public data class RawScsiVirtualDiskResponse00(
    public var scsiStatus: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
)

public data class ResizeVirtualDiskParameters(
    public var version: ResizeVirtualDiskVersion = 0,
    public var anonymous: ResizeVirtualDiskParameters0 = ResizeVirtualDiskParameters0(),
)

public data class ResizeVirtualDiskParameters0(
    public var version1: ResizeVirtualDiskParameters00 = ResizeVirtualDiskParameters00(),
)

public data class ResizeVirtualDiskParameters00(
    public var newSize: ULong = 0uL,
)

public data class SetVirtualDiskInfo(
    public var version: SetVirtualDiskInfoVersion = 0,
    public var anonymous: SetVirtualDiskInfo0 = SetVirtualDiskInfo0(),
)

public data class SetVirtualDiskInfo0(
    public var parentFilePath: Pcwstr = null,
    public var uniqueIdentifier: Guid = Guid(),
    public var parentPathWithDepthInfo: SetVirtualDiskInfo00 = SetVirtualDiskInfo00(),
    public var vhdPhysicalSectorSize: UInt = 0u,
    public var virtualDiskId: Guid = Guid(),
    public var changeTrackingEnabled: Bool = 0,
    public var parentLocator: SetVirtualDiskInfo01 = SetVirtualDiskInfo01(),
)

public data class SetVirtualDiskInfo01(
    public var linkageId: Guid = Guid(),
    public var parentFilePath: Pcwstr = null,
)

public data class SetVirtualDiskInfo00(
    public var childDepth: UInt = 0u,
    public var parentFilePath: Pcwstr = null,
)

public data class StorageDependencyInfo(
    public var version: StorageDependencyInfoVersion = 0,
    public var numberEntries: UInt = 0u,
    public var anonymous: StorageDependencyInfo0 = StorageDependencyInfo0(),
)

public data class StorageDependencyInfo0(
    public var version1Entries: List<StorageDependencyInfoType1> = List(1) { StorageDependencyInfoType1() },
    public var version2Entries: List<StorageDependencyInfoType2> = List(1) { StorageDependencyInfoType2() },
)

public data class StorageDependencyInfoType1(
    public var dependencyTypeFlags: DependentDiskFlag = 0,
    public var providerSpecificFlags: UInt = 0u,
    public var virtualStorageType: VirtualStorageType = VirtualStorageType(),
)

public data class StorageDependencyInfoType2(
    public var dependencyTypeFlags: DependentDiskFlag = 0,
    public var providerSpecificFlags: UInt = 0u,
    public var virtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var ancestorLevel: UInt = 0u,
    public var dependencyDeviceName: Pwstr = null,
    public var hostVolumeName: Pwstr = null,
    public var dependentVolumeName: Pwstr = null,
    public var dependentVolumeRelativePath: Pwstr = null,
)

public data class TakeSnapshotVhdsetParameters(
    public var version: TakeSnapshotVhdsetVersion = 0,
    public var anonymous: TakeSnapshotVhdsetParameters0 = TakeSnapshotVhdsetParameters0(),
)

public data class TakeSnapshotVhdsetParameters0(
    public var version1: TakeSnapshotVhdsetParameters00 = TakeSnapshotVhdsetParameters00(),
)

public data class TakeSnapshotVhdsetParameters00(
    public var snapshotId: Guid = Guid(),
)

public data class VirtualDiskProgress(
    public var operationStatus: UInt = 0u,
    public var currentValue: ULong = 0uL,
    public var completionValue: ULong = 0uL,
)

public data class VirtualStorageType(
    public var deviceId: UInt = 0u,
    public var vendorId: Guid = Guid(),
)
