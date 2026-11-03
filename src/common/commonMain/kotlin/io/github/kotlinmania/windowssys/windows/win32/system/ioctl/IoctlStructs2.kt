@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.windowssys.core.GUID

public data class PERSISTENT_RESERVE_COMMAND_0_1(
    public var _bitfield1: UByte = 0u,
    public var _bitfield2: UByte = 0u,
    public var ParameterList: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PERSISTENT_RESERVE_COMMAND_0_1) return false
        if (this._bitfield1 != other._bitfield1) return false
        if (this._bitfield2 != other._bitfield2) return false
        if (!this.ParameterList.contentEquals(other.ParameterList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield1.hashCode()
        result = 31 * result + this._bitfield2.hashCode()
        result = 31 * result + this.ParameterList.contentHashCode()
        return result
    }
}

public data class PHYSICAL_ELEMENT_STATUS(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DescriptorCount: UInt = 0u,
    public var ReturnedDescriptorCount: UInt = 0u,
    public var ElementIdentifierBeingDepoped: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Descriptors: List<PHYSICAL_ELEMENT_STATUS_DESCRIPTOR> = List(1) { PHYSICAL_ELEMENT_STATUS_DESCRIPTOR() },
)

public data class PHYSICAL_ELEMENT_STATUS_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var ElementIdentifier: UInt = 0u,
    public var PhysicalElementType: UByte = 0u,
    public var PhysicalElementHealth: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(2),
    public var AssociatedCapacity: ULong = 0uL,
    public var Reserved2: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PHYSICAL_ELEMENT_STATUS_DESCRIPTOR) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.ElementIdentifier != other.ElementIdentifier) return false
        if (this.PhysicalElementType != other.PhysicalElementType) return false
        if (this.PhysicalElementHealth != other.PhysicalElementHealth) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.AssociatedCapacity != other.AssociatedCapacity) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.ElementIdentifier.hashCode()
        result = 31 * result + this.PhysicalElementType.hashCode()
        result = 31 * result + this.PhysicalElementHealth.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.AssociatedCapacity.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class PHYSICAL_ELEMENT_STATUS_REQUEST(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var StartingElement: UInt = 0u,
    public var Filter: UByte = 0u,
    public var ReportType: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PHYSICAL_ELEMENT_STATUS_REQUEST) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.StartingElement != other.StartingElement) return false
        if (this.Filter != other.Filter) return false
        if (this.ReportType != other.ReportType) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.StartingElement.hashCode()
        result = 31 * result + this.Filter.hashCode()
        result = 31 * result + this.ReportType.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class PLEX_READ_DATA_REQUEST(
    public var ByteOffset: Long = 0L,
    public var ByteLength: UInt = 0u,
    public var PlexNumber: UInt = 0u,
)

public data class PREVENT_MEDIA_REMOVAL(public var PreventMediaRemoval: Boolean = false)

public data class QUERY_BAD_RANGES_INPUT(
    public var Flags: UInt = 0u,
    public var NumRanges: UInt = 0u,
    public var Ranges: List<QUERY_BAD_RANGES_INPUT_RANGE> = List(1) { QUERY_BAD_RANGES_INPUT_RANGE() },
)

public data class QUERY_BAD_RANGES_INPUT_RANGE(public var StartOffset: ULong = 0uL, public var LengthInBytes: ULong = 0uL)

public data class QUERY_BAD_RANGES_OUTPUT(
    public var Flags: UInt = 0u,
    public var NumBadRanges: UInt = 0u,
    public var NextOffsetToLookUp: ULong = 0uL,
    public var BadRanges: List<QUERY_BAD_RANGES_OUTPUT_RANGE> = List(1) { QUERY_BAD_RANGES_OUTPUT_RANGE() },
)

public data class QUERY_BAD_RANGES_OUTPUT_RANGE(
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var StartOffset: ULong = 0uL,
    public var LengthInBytes: ULong = 0uL,
)

public data class QUERY_FILE_LAYOUT_INPUT(
    public var Anonymous: QUERY_FILE_LAYOUT_INPUT_0 = QUERY_FILE_LAYOUT_INPUT_0(),
    public var Flags: UInt = 0u,
    public var FilterType: QUERY_FILE_LAYOUT_FILTER_TYPE = 0,
    public var Reserved: UInt = 0u,
    public var Filter: QUERY_FILE_LAYOUT_INPUT_1 = QUERY_FILE_LAYOUT_INPUT_1(),
)

public data class QUERY_FILE_LAYOUT_INPUT_0(public var FilterEntryCount: UInt = 0u, public var NumberOfPairs: UInt = 0u)

public data class QUERY_FILE_LAYOUT_INPUT_1(
    public var ClusterRanges: List<CLUSTER_RANGE> = List(1) { CLUSTER_RANGE() },
    public var FileReferenceRanges: List<FILE_REFERENCE_RANGE> = List(1) { FILE_REFERENCE_RANGE() },
    public var StorageReserveIds: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QUERY_FILE_LAYOUT_INPUT_1) return false
        if (this.ClusterRanges != other.ClusterRanges) return false
        if (this.FileReferenceRanges != other.FileReferenceRanges) return false
        if (!this.StorageReserveIds.contentEquals(other.StorageReserveIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClusterRanges.hashCode()
        result = 31 * result + this.FileReferenceRanges.hashCode()
        result = 31 * result + this.StorageReserveIds.contentHashCode()
        return result
    }
}

public data class QUERY_FILE_LAYOUT_OUTPUT(
    public var FileEntryCount: UInt = 0u,
    public var FirstFileOffset: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class READ_ELEMENT_ADDRESS_INFO(public var NumberOfElements: UInt = 0u, public var ElementStatus: List<CHANGER_ELEMENT_STATUS> = List(1) { CHANGER_ELEMENT_STATUS() })

public data class READ_FILE_USN_DATA(public var MinMajorVersion: UShort = 0u, public var MaxMajorVersion: UShort = 0u)

public data class READ_USN_JOURNAL_DATA_V0(
    public var StartUsn: Long = 0L,
    public var ReasonMask: UInt = 0u,
    public var ReturnOnlyOnClose: UInt = 0u,
    public var Timeout: ULong = 0uL,
    public var BytesToWaitFor: ULong = 0uL,
    public var UsnJournalID: ULong = 0uL,
)

public data class READ_USN_JOURNAL_DATA_V1(
    public var StartUsn: Long = 0L,
    public var ReasonMask: UInt = 0u,
    public var ReturnOnlyOnClose: UInt = 0u,
    public var Timeout: ULong = 0uL,
    public var BytesToWaitFor: ULong = 0uL,
    public var UsnJournalID: ULong = 0uL,
    public var MinMajorVersion: UShort = 0u,
    public var MaxMajorVersion: UShort = 0u,
)

public data class REASSIGN_BLOCKS(
    public var Reserved: UShort = 0u,
    public var Count: UShort = 0u,
    public var BlockNumber: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REASSIGN_BLOCKS) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Count != other.Count) return false
        if (!this.BlockNumber.contentEquals(other.BlockNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved.hashCode()
        result = 31 * result + this.Count.hashCode()
        result = 31 * result + this.BlockNumber.contentHashCode()
        return result
    }
}

public data class REASSIGN_BLOCKS_EX(
    public var Reserved: UShort = 0u,
    public var Count: UShort = 0u,
    public var BlockNumber: LongArray = LongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REASSIGN_BLOCKS_EX) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Count != other.Count) return false
        if (!this.BlockNumber.contentEquals(other.BlockNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved.hashCode()
        result = 31 * result + this.Count.hashCode()
        result = 31 * result + this.BlockNumber.contentHashCode()
        return result
    }
}

public data class REFS_SMR_VOLUME_GC_PARAMETERS(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Action: REFS_SMR_VOLUME_GC_ACTION = 0,
    public var Method: REFS_SMR_VOLUME_GC_METHOD = 0,
    public var IoGranularity: UInt = 0u,
    public var CompressionFormat: UInt = 0u,
    public var Unused: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_SMR_VOLUME_GC_PARAMETERS) return false
        if (this.Version != other.Version) return false
        if (this.Flags != other.Flags) return false
        if (this.Action != other.Action) return false
        if (this.Method != other.Method) return false
        if (this.IoGranularity != other.IoGranularity) return false
        if (this.CompressionFormat != other.CompressionFormat) return false
        if (!this.Unused.contentEquals(other.Unused)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Action.hashCode()
        result = 31 * result + this.Method.hashCode()
        result = 31 * result + this.IoGranularity.hashCode()
        result = 31 * result + this.CompressionFormat.hashCode()
        result = 31 * result + this.Unused.contentHashCode()
        return result
    }
}

public data class REFS_SMR_VOLUME_INFO_OUTPUT(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var SizeOfRandomlyWritableTier: Long = 0L,
    public var FreeSpaceInRandomlyWritableTier: Long = 0L,
    public var SizeofSMRTier: Long = 0L,
    public var FreeSpaceInSMRTier: Long = 0L,
    public var UsableFreeSpaceInSMRTier: Long = 0L,
    public var VolumeGcState: REFS_SMR_VOLUME_GC_STATE = 0,
    public var VolumeGcLastStatus: UInt = 0u,
    public var CurrentGcBandFillPercentage: UInt = 0u,
    public var Unused: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_SMR_VOLUME_INFO_OUTPUT) return false
        if (this.Version != other.Version) return false
        if (this.Flags != other.Flags) return false
        if (this.SizeOfRandomlyWritableTier != other.SizeOfRandomlyWritableTier) return false
        if (this.FreeSpaceInRandomlyWritableTier != other.FreeSpaceInRandomlyWritableTier) return false
        if (this.SizeofSMRTier != other.SizeofSMRTier) return false
        if (this.FreeSpaceInSMRTier != other.FreeSpaceInSMRTier) return false
        if (this.UsableFreeSpaceInSMRTier != other.UsableFreeSpaceInSMRTier) return false
        if (this.VolumeGcState != other.VolumeGcState) return false
        if (this.VolumeGcLastStatus != other.VolumeGcLastStatus) return false
        if (this.CurrentGcBandFillPercentage != other.CurrentGcBandFillPercentage) return false
        if (!this.Unused.contentEquals(other.Unused)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.SizeOfRandomlyWritableTier.hashCode()
        result = 31 * result + this.FreeSpaceInRandomlyWritableTier.hashCode()
        result = 31 * result + this.SizeofSMRTier.hashCode()
        result = 31 * result + this.FreeSpaceInSMRTier.hashCode()
        result = 31 * result + this.UsableFreeSpaceInSMRTier.hashCode()
        result = 31 * result + this.VolumeGcState.hashCode()
        result = 31 * result + this.VolumeGcLastStatus.hashCode()
        result = 31 * result + this.CurrentGcBandFillPercentage.hashCode()
        result = 31 * result + this.Unused.contentHashCode()
        return result
    }
}

public class REFS_VOLUME_DATA_BUFFER(
    public var ByteCount: UInt = 0u,
    public var MajorVersion: UInt = 0u,
    public var MinorVersion: UInt = 0u,
    public var BytesPerPhysicalSector: UInt = 0u,
    public var VolumeSerialNumber: Long = 0L,
    public var NumberSectors: Long = 0L,
    public var TotalClusters: Long = 0L,
    public var FreeClusters: Long = 0L,
    public var TotalReserved: Long = 0L,
    public var BytesPerSector: UInt = 0u,
    public var BytesPerCluster: UInt = 0u,
    public var MaximumSizeOfResidentFile: Long = 0L,
    public var FastTierDataFillRatio: UShort = 0u,
    public var SlowTierDataFillRatio: UShort = 0u,
    public var DestagesFastTierToSlowTierRate: UInt = 0u,
    public var MetadataChecksumType: UShort = 0u,
    public var Reserved0: UByteArray = UByteArray(6),
    public var Reserved: LongArray = LongArray(8),
)

public data class REMOVE_ELEMENT_AND_TRUNCATE_REQUEST(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var RequestCapacity: ULong = 0uL,
    public var ElementIdentifier: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class REPAIR_COPIES_INPUT(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var FileOffset: Long = 0L,
    public var Length: UInt = 0u,
    public var SourceCopy: UInt = 0u,
    public var NumberOfRepairCopies: UInt = 0u,
    public var RepairCopies: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REPAIR_COPIES_INPUT) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.FileOffset != other.FileOffset) return false
        if (this.Length != other.Length) return false
        if (this.SourceCopy != other.SourceCopy) return false
        if (this.NumberOfRepairCopies != other.NumberOfRepairCopies) return false
        if (!this.RepairCopies.contentEquals(other.RepairCopies)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.FileOffset.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.SourceCopy.hashCode()
        result = 31 * result + this.NumberOfRepairCopies.hashCode()
        result = 31 * result + this.RepairCopies.contentHashCode()
        return result
    }
}

public data class REPAIR_COPIES_OUTPUT(
    public var Size: UInt = 0u,
    public var Status: UInt = 0u,
    public var ResumeFileOffset: Long = 0L,
)

public data class REQUEST_OPLOCK_INPUT_BUFFER(
    public var StructureVersion: UShort = 0u,
    public var StructureLength: UShort = 0u,
    public var RequestedOplockLevel: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class REQUEST_OPLOCK_OUTPUT_BUFFER(
    public var StructureVersion: UShort = 0u,
    public var StructureLength: UShort = 0u,
    public var OriginalOplockLevel: UInt = 0u,
    public var NewOplockLevel: UInt = 0u,
    public var Flags: UInt = 0u,
    public var AccessMode: UInt = 0u,
    public var ShareMode: UShort = 0u,
)

public data class REQUEST_RAW_ENCRYPTED_DATA(public var FileOffset: Long = 0L, public var Length: UInt = 0u)

public data class RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER(
    public var ExtentCount: UInt = 0u,
    public var StartingVcn: Long = 0L,
    public var Extents: List<RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER_0> = List(1) { RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER_0() },
)

public data class RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER_0(
    public var NextVcn: Long = 0L,
    public var Lcn: Long = 0L,
    public var ReferenceCount: UInt = 0u,
)

public data class RETRIEVAL_POINTERS_BUFFER(
    public var ExtentCount: UInt = 0u,
    public var StartingVcn: Long = 0L,
    public var Extents: List<RETRIEVAL_POINTERS_BUFFER_0> = List(1) { RETRIEVAL_POINTERS_BUFFER_0() },
)

public data class RETRIEVAL_POINTERS_BUFFER_0(public var NextVcn: Long = 0L, public var Lcn: Long = 0L)

public data class RETRIEVAL_POINTER_BASE(public var FileAreaOffset: Long = 0L)

public data class RETRIEVAL_POINTER_COUNT(public var ExtentCount: UInt = 0u)

public data class SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DeviceCount: UInt = 0u,
    public var Devices: List<SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO> = List(1) { SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO() },
)

public data class SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO(
    public var DeviceGuid: GUID = GUID(),
    public var DeviceNumber: UInt = 0u,
    public var Flags: SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO_0 = SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO_0(),
    public var DeviceSize: ULong = 0uL,
)

public data class SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO_0(public var _bitfield: UInt = 0u)

public data class SCM_BUS_DEDICATED_MEMORY_STATE(public var ActivateState: Boolean = false)

public data class SCM_BUS_PROPERTY_QUERY(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var PropertyId: SCM_BUS_PROPERTY_ID = 0,
    public var QueryType: SCM_BUS_QUERY_TYPE = 0,
    public var AdditionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_BUS_PROPERTY_QUERY) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.PropertyId != other.PropertyId) return false
        if (this.QueryType != other.QueryType) return false
        if (!this.AdditionalParameters.contentEquals(other.AdditionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.PropertyId.hashCode()
        result = 31 * result + this.QueryType.hashCode()
        result = 31 * result + this.AdditionalParameters.contentHashCode()
        return result
    }
}

public data class SCM_BUS_PROPERTY_SET(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var PropertyId: SCM_BUS_PROPERTY_ID = 0,
    public var SetType: SCM_BUS_SET_TYPE = 0,
    public var AdditionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_BUS_PROPERTY_SET) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.PropertyId != other.PropertyId) return false
        if (this.SetType != other.SetType) return false
        if (!this.AdditionalParameters.contentEquals(other.AdditionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.PropertyId.hashCode()
        result = 31 * result + this.SetType.hashCode()
        result = 31 * result + this.AdditionalParameters.contentHashCode()
        return result
    }
}

public data class SCM_BUS_RUNTIME_FW_ACTIVATION_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var RuntimeFwActivationSupported: Boolean = false,
    public var FirmwareActivationState: SCM_BUS_FIRMWARE_ACTIVATION_STATE = 0,
    public var FirmwareActivationCapability: SCM_BUS_RUNTIME_FW_ACTIVATION_INFO_0 = SCM_BUS_RUNTIME_FW_ACTIVATION_INFO_0(),
    public var EstimatedFirmwareActivationTimeInUSecs: ULong = 0uL,
    public var EstimatedProcessorAccessQuiesceTimeInUSecs: ULong = 0uL,
    public var EstimatedIOAccessQuiesceTimeInUSecs: ULong = 0uL,
    public var PlatformSupportedMaxIOAccessQuiesceTimeInUSecs: ULong = 0uL,
)

public data class SCM_BUS_RUNTIME_FW_ACTIVATION_INFO_0(public var _bitfield: UInt = 0u)

public data class SCM_INTERLEAVED_PD_INFO(public var DeviceHandle: UInt = 0u, public var DeviceGuid: GUID = GUID())

public data class SCM_LD_INTERLEAVE_SET_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var InterleaveSetSize: UInt = 0u,
    public var InterleaveSet: List<SCM_INTERLEAVED_PD_INFO> = List(1) { SCM_INTERLEAVED_PD_INFO() },
)

public data class SCM_LOGICAL_DEVICES(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DeviceCount: UInt = 0u,
    public var Devices: List<SCM_LOGICAL_DEVICE_INSTANCE> = List(1) { SCM_LOGICAL_DEVICE_INSTANCE() },
)

public data class SCM_LOGICAL_DEVICE_INSTANCE(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DeviceGuid: GUID = GUID(),
    public var SymbolicLink: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_LOGICAL_DEVICE_INSTANCE) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.DeviceGuid != other.DeviceGuid) return false
        if (!this.SymbolicLink.contentEquals(other.SymbolicLink)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.DeviceGuid.hashCode()
        result = 31 * result + this.SymbolicLink.contentHashCode()
        return result
    }
}

public data class SCM_PD_DESCRIPTOR_HEADER(public var Version: UInt = 0u, public var Size: UInt = 0u)

public data class SCM_PD_DEVICE_HANDLE(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DeviceGuid: GUID = GUID(),
    public var DeviceHandle: UInt = 0u,
)

public class SCM_PD_DEVICE_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DeviceGuid: GUID = GUID(),
    public var UnsafeShutdownCount: UInt = 0u,
    public var PersistentMemorySizeInBytes: ULong = 0uL,
    public var VolatileMemorySizeInBytes: ULong = 0uL,
    public var TotalMemorySizeInBytes: ULong = 0uL,
    public var SlotNumber: UInt = 0u,
    public var DeviceHandle: UInt = 0u,
    public var PhysicalId: UShort = 0u,
    public var NumberOfFormatInterfaceCodes: UByte = 0u,
    public var FormatInterfaceCodes: UShortArray = UShortArray(8),
    public var VendorId: UInt = 0u,
    public var ProductId: UInt = 0u,
    public var SubsystemDeviceId: UInt = 0u,
    public var SubsystemVendorId: UInt = 0u,
    public var ManufacturingLocation: UByte = 0u,
    public var ManufacturingWeek: UByte = 0u,
    public var ManufacturingYear: UByte = 0u,
    public var SerialNumber4Byte: UInt = 0u,
    public var SerialNumberLengthInChars: UInt = 0u,
    public var SerialNumber: ByteArray = ByteArray(1),
)

public data class SCM_PD_DEVICE_SPECIFIC_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var NumberOfProperties: UInt = 0u,
    public var DeviceSpecificProperties: List<SCM_PD_DEVICE_SPECIFIC_PROPERTY> = List(1) { SCM_PD_DEVICE_SPECIFIC_PROPERTY() },
)

public data class SCM_PD_DEVICE_SPECIFIC_PROPERTY(public var Name: UShortArray = UShortArray(128), public var Value: Long = 0L) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_DEVICE_SPECIFIC_PROPERTY) return false
        if (!this.Name.contentEquals(other.Name)) return false
        if (this.Value != other.Value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Name.contentHashCode()
        result = 31 * result + this.Value.hashCode()
        return result
    }
}

public data class SCM_PD_FIRMWARE_ACTIVATE(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Slot: UByte = 0u,
)

public data class SCM_PD_FIRMWARE_DOWNLOAD(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Slot: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var Offset: ULong = 0uL,
    public var FirmwareImageSizeInBytes: UInt = 0u,
    public var FirmwareImage: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_FIRMWARE_DOWNLOAD) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.Slot != other.Slot) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Offset != other.Offset) return false
        if (this.FirmwareImageSizeInBytes != other.FirmwareImageSizeInBytes) return false
        if (!this.FirmwareImage.contentEquals(other.FirmwareImage)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Slot.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Offset.hashCode()
        result = 31 * result + this.FirmwareImageSizeInBytes.hashCode()
        result = 31 * result + this.FirmwareImage.contentHashCode()
        return result
    }
}

public data class SCM_PD_FIRMWARE_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var ActiveSlot: UByte = 0u,
    public var NextActiveSlot: UByte = 0u,
    public var SlotCount: UByte = 0u,
    public var Slots: List<SCM_PD_FIRMWARE_SLOT_INFO> = List(1) { SCM_PD_FIRMWARE_SLOT_INFO() },
)

public data class SCM_PD_FIRMWARE_SLOT_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var SlotNumber: UByte = 0u,
    public var _bitfield: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(6),
    public var Revision: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_FIRMWARE_SLOT_INFO) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.SlotNumber != other.SlotNumber) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.Revision.contentEquals(other.Revision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.SlotNumber.hashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Revision.contentHashCode()
        return result
    }
}

public data class SCM_PD_FRU_ID_STRING(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var IdentifierSize: UInt = 0u,
    public var Identifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_FRU_ID_STRING) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.IdentifierSize != other.IdentifierSize) return false
        if (!this.Identifier.contentEquals(other.Identifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.IdentifierSize.hashCode()
        result = 31 * result + this.Identifier.contentHashCode()
        return result
    }
}

public data class SCM_PD_HEALTH_NOTIFICATION_DATA(public var DeviceGuid: GUID = GUID())

public data class SCM_PD_LOCATION_STRING(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Location: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_LOCATION_STRING) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (!this.Location.contentEquals(other.Location)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Location.contentHashCode()
        return result
    }
}

public data class SCM_PD_MANAGEMENT_STATUS(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Health: SCM_PD_HEALTH_STATUS = 0,
    public var NumberOfOperationalStatus: UInt = 0u,
    public var NumberOfAdditionalReasons: UInt = 0u,
    public var OperationalStatus: IntArray = IntArray(16),
    public var AdditionalReasons: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_MANAGEMENT_STATUS) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Health != other.Health) return false
        if (this.NumberOfOperationalStatus != other.NumberOfOperationalStatus) return false
        if (this.NumberOfAdditionalReasons != other.NumberOfAdditionalReasons) return false
        if (!this.OperationalStatus.contentEquals(other.OperationalStatus)) return false
        if (!this.AdditionalReasons.contentEquals(other.AdditionalReasons)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Health.hashCode()
        result = 31 * result + this.NumberOfOperationalStatus.hashCode()
        result = 31 * result + this.NumberOfAdditionalReasons.hashCode()
        result = 31 * result + this.OperationalStatus.contentHashCode()
        result = 31 * result + this.AdditionalReasons.contentHashCode()
        return result
    }
}

public data class SCM_PD_PASSTHROUGH_INPUT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var ProtocolGuid: GUID = GUID(),
    public var DataSize: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_PASSTHROUGH_INPUT) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.ProtocolGuid != other.ProtocolGuid) return false
        if (this.DataSize != other.DataSize) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.ProtocolGuid.hashCode()
        result = 31 * result + this.DataSize.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class SCM_PD_PASSTHROUGH_INVDIMM_INPUT(
    public var Opcode: UInt = 0u,
    public var OpcodeParametersLength: UInt = 0u,
    public var OpcodeParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_PASSTHROUGH_INVDIMM_INPUT) return false
        if (this.Opcode != other.Opcode) return false
        if (this.OpcodeParametersLength != other.OpcodeParametersLength) return false
        if (!this.OpcodeParameters.contentEquals(other.OpcodeParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Opcode.hashCode()
        result = 31 * result + this.OpcodeParametersLength.hashCode()
        result = 31 * result + this.OpcodeParameters.contentHashCode()
        return result
    }
}

public data class SCM_PD_PASSTHROUGH_INVDIMM_OUTPUT(
    public var GeneralStatus: UShort = 0u,
    public var ExtendedStatus: UShort = 0u,
    public var OutputDataLength: UInt = 0u,
    public var OutputData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_PASSTHROUGH_INVDIMM_OUTPUT) return false
        if (this.GeneralStatus != other.GeneralStatus) return false
        if (this.ExtendedStatus != other.ExtendedStatus) return false
        if (this.OutputDataLength != other.OutputDataLength) return false
        if (!this.OutputData.contentEquals(other.OutputData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.GeneralStatus.hashCode()
        result = 31 * result + this.ExtendedStatus.hashCode()
        result = 31 * result + this.OutputDataLength.hashCode()
        result = 31 * result + this.OutputData.contentHashCode()
        return result
    }
}

public data class SCM_PD_PASSTHROUGH_OUTPUT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var ProtocolGuid: GUID = GUID(),
    public var DataSize: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_PASSTHROUGH_OUTPUT) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.ProtocolGuid != other.ProtocolGuid) return false
        if (this.DataSize != other.DataSize) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.ProtocolGuid.hashCode()
        result = 31 * result + this.DataSize.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class SCM_PD_PROPERTY_QUERY(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var PropertyId: SCM_PD_PROPERTY_ID = 0,
    public var QueryType: SCM_PD_QUERY_TYPE = 0,
    public var AdditionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_PROPERTY_QUERY) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.PropertyId != other.PropertyId) return false
        if (this.QueryType != other.QueryType) return false
        if (!this.AdditionalParameters.contentEquals(other.AdditionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.PropertyId.hashCode()
        result = 31 * result + this.QueryType.hashCode()
        result = 31 * result + this.AdditionalParameters.contentHashCode()
        return result
    }
}

public data class SCM_PD_PROPERTY_SET(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var PropertyId: SCM_PD_PROPERTY_ID = 0,
    public var SetType: SCM_PD_SET_TYPE = 0,
    public var AdditionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PD_PROPERTY_SET) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.PropertyId != other.PropertyId) return false
        if (this.SetType != other.SetType) return false
        if (!this.AdditionalParameters.contentEquals(other.AdditionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.PropertyId.hashCode()
        result = 31 * result + this.SetType.hashCode()
        result = 31 * result + this.AdditionalParameters.contentHashCode()
        return result
    }
}

public data class SCM_PD_REINITIALIZE_MEDIA_INPUT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Options: SCM_PD_REINITIALIZE_MEDIA_INPUT_0 = SCM_PD_REINITIALIZE_MEDIA_INPUT_0(),
)

public data class SCM_PD_REINITIALIZE_MEDIA_INPUT_0(public var _bitfield: UInt = 0u)

public data class SCM_PD_REINITIALIZE_MEDIA_OUTPUT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Status: SCM_PD_MEDIA_REINITIALIZATION_STATUS = 0,
)

public data class SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE(public var ArmState: Boolean = false)

public data class SCM_PD_RUNTIME_FW_ACTIVATION_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var LastFirmwareActivationStatus: SCM_PD_LAST_FW_ACTIVATION_STATUS = 0,
    public var FirmwareActivationState: SCM_PD_FIRMWARE_ACTIVATION_STATE = 0,
)

public data class SCM_PHYSICAL_DEVICES(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DeviceCount: UInt = 0u,
    public var Devices: List<SCM_PHYSICAL_DEVICE_INSTANCE> = List(1) { SCM_PHYSICAL_DEVICE_INSTANCE() },
)

public data class SCM_PHYSICAL_DEVICE_INSTANCE(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var NfitHandle: UInt = 0u,
    public var SymbolicLink: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCM_PHYSICAL_DEVICE_INSTANCE) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.NfitHandle != other.NfitHandle) return false
        if (!this.SymbolicLink.contentEquals(other.SymbolicLink)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.NfitHandle.hashCode()
        result = 31 * result + this.SymbolicLink.contentHashCode()
        return result
    }
}

public data class SCM_REGION(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var NfitHandle: UInt = 0u,
    public var LogicalDeviceGuid: GUID = GUID(),
    public var AddressRangeType: GUID = GUID(),
    public var AssociatedId: UInt = 0u,
    public var Length: ULong = 0uL,
    public var StartingDPA: ULong = 0uL,
    public var BaseSPA: ULong = 0uL,
    public var SPAOffset: ULong = 0uL,
    public var RegionOffset: ULong = 0uL,
)

public data class SCM_REGIONS(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var RegionCount: UInt = 0u,
    public var Regions: List<SCM_REGION> = List(1) { SCM_REGION() },
)

public data class SD_CHANGE_MACHINE_SID_INPUT(
    public var CurrentMachineSIDOffset: UShort = 0u,
    public var CurrentMachineSIDLength: UShort = 0u,
    public var NewMachineSIDOffset: UShort = 0u,
    public var NewMachineSIDLength: UShort = 0u,
)

public data class SD_CHANGE_MACHINE_SID_OUTPUT(
    public var NumSDChangedSuccess: ULong = 0uL,
    public var NumSDChangedFail: ULong = 0uL,
    public var NumSDUnused: ULong = 0uL,
    public var NumSDTotal: ULong = 0uL,
    public var NumMftSDChangedSuccess: ULong = 0uL,
    public var NumMftSDChangedFail: ULong = 0uL,
    public var NumMftSDTotal: ULong = 0uL,
)

public data class SD_ENUM_SDS_ENTRY(
    public var Hash: UInt = 0u,
    public var SecurityId: UInt = 0u,
    public var Offset: ULong = 0uL,
    public var Length: UInt = 0u,
    public var Descriptor: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SD_ENUM_SDS_ENTRY) return false
        if (this.Hash != other.Hash) return false
        if (this.SecurityId != other.SecurityId) return false
        if (this.Offset != other.Offset) return false
        if (this.Length != other.Length) return false
        if (!this.Descriptor.contentEquals(other.Descriptor)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Hash.hashCode()
        result = 31 * result + this.SecurityId.hashCode()
        result = 31 * result + this.Offset.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Descriptor.contentHashCode()
        return result
    }
}

public data class SD_ENUM_SDS_INPUT(public var StartingOffset: ULong = 0uL, public var MaxSDEntriesToReturn: ULong = 0uL)

public data class SD_ENUM_SDS_OUTPUT(
    public var NextOffset: ULong = 0uL,
    public var NumSDEntriesReturned: ULong = 0uL,
    public var NumSDBytesReturned: ULong = 0uL,
    public var SDEntry: List<SD_ENUM_SDS_ENTRY> = List(1) { SD_ENUM_SDS_ENTRY() },
)

public data class SD_GLOBAL_CHANGE_INPUT(
    public var Flags: UInt = 0u,
    public var ChangeType: UInt = 0u,
    public var Anonymous: SD_GLOBAL_CHANGE_INPUT_0 = SD_GLOBAL_CHANGE_INPUT_0(),
)

public data class SD_GLOBAL_CHANGE_INPUT_0(
    public var SdChange: SD_CHANGE_MACHINE_SID_INPUT = SD_CHANGE_MACHINE_SID_INPUT(),
    public var SdQueryStats: SD_QUERY_STATS_INPUT = SD_QUERY_STATS_INPUT(),
    public var SdEnumSds: SD_ENUM_SDS_INPUT = SD_ENUM_SDS_INPUT(),
)

public data class SD_GLOBAL_CHANGE_OUTPUT(
    public var Flags: UInt = 0u,
    public var ChangeType: UInt = 0u,
    public var Anonymous: SD_GLOBAL_CHANGE_OUTPUT_0 = SD_GLOBAL_CHANGE_OUTPUT_0(),
)

public data class SD_GLOBAL_CHANGE_OUTPUT_0(
    public var SdChange: SD_CHANGE_MACHINE_SID_OUTPUT = SD_CHANGE_MACHINE_SID_OUTPUT(),
    public var SdQueryStats: SD_QUERY_STATS_OUTPUT = SD_QUERY_STATS_OUTPUT(),
    public var SdEnumSds: SD_ENUM_SDS_OUTPUT = SD_ENUM_SDS_OUTPUT(),
)

public data class SD_QUERY_STATS_INPUT(public var Reserved: UInt = 0u)

public data class SD_QUERY_STATS_OUTPUT(
    public var SdsStreamSize: ULong = 0uL,
    public var SdsAllocationSize: ULong = 0uL,
    public var SiiStreamSize: ULong = 0uL,
    public var SiiAllocationSize: ULong = 0uL,
    public var SdhStreamSize: ULong = 0uL,
    public var SdhAllocationSize: ULong = 0uL,
    public var NumSDTotal: ULong = 0uL,
    public var NumSDUnused: ULong = 0uL,
)

public data class SENDCMDINPARAMS(
    public var cBufferSize: UInt = 0u,
    public var irDriveRegs: IDEREGS = IDEREGS(),
    public var bDriveNumber: UByte = 0u,
    public var bReserved: UByteArray = UByteArray(3),
    public var dwReserved: UIntArray = UIntArray(4),
    public var bBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SENDCMDINPARAMS) return false
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
}

public data class SENDCMDOUTPARAMS(
    public var cBufferSize: UInt = 0u,
    public var DriverStatus: DRIVERSTATUS = DRIVERSTATUS(),
    public var bBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SENDCMDOUTPARAMS) return false
        if (this.cBufferSize != other.cBufferSize) return false
        if (this.DriverStatus != other.DriverStatus) return false
        if (!this.bBuffer.contentEquals(other.bBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBufferSize.hashCode()
        result = 31 * result + this.DriverStatus.hashCode()
        result = 31 * result + this.bBuffer.contentHashCode()
        return result
    }
}

public data class SET_DAX_ALLOC_ALIGNMENT_HINT_INPUT(
    public var Flags: UInt = 0u,
    public var AlignmentShift: UInt = 0u,
    public var FileOffsetToAlign: ULong = 0uL,
    public var FallbackAlignmentShift: UInt = 0u,
)

public data class SET_DISK_ATTRIBUTES(
    public var Version: UInt = 0u,
    public var Persist: Boolean = false,
    public var Reserved1: UByteArray = UByteArray(3),
    public var Attributes: ULong = 0uL,
    public var AttributesMask: ULong = 0uL,
    public var Reserved2: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SET_DISK_ATTRIBUTES) return false
        if (this.Version != other.Version) return false
        if (this.Persist != other.Persist) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.Attributes != other.Attributes) return false
        if (this.AttributesMask != other.AttributesMask) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Persist.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.AttributesMask.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class SET_PARTITION_INFORMATION(public var PartitionType: UByte = 0u)

public data class SET_PARTITION_INFORMATION_EX(public var PartitionStyle: PARTITION_STYLE = 0, public var Anonymous: SET_PARTITION_INFORMATION_EX_0 = SET_PARTITION_INFORMATION_EX_0())

public data class SET_PARTITION_INFORMATION_EX_0(public var Mbr: SET_PARTITION_INFORMATION = SET_PARTITION_INFORMATION(), public var Gpt: PARTITION_INFORMATION_GPT = PARTITION_INFORMATION_GPT())

public data class SET_PURGE_FAILURE_MODE_INPUT(public var Flags: UInt = 0u)

public data class SHRINK_VOLUME_INFORMATION(
    public var ShrinkRequestType: SHRINK_VOLUME_REQUEST_TYPES = 0,
    public var Flags: ULong = 0uL,
    public var NewNumberOfSectors: Long = 0L,
)

public data class SI_COPYFILE(
    public var SourceFileNameLength: UInt = 0u,
    public var DestinationFileNameLength: UInt = 0u,
    public var Flags: UInt = 0u,
    public var FileNameBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SI_COPYFILE) return false
        if (this.SourceFileNameLength != other.SourceFileNameLength) return false
        if (this.DestinationFileNameLength != other.DestinationFileNameLength) return false
        if (this.Flags != other.Flags) return false
        if (!this.FileNameBuffer.contentEquals(other.FileNameBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SourceFileNameLength.hashCode()
        result = 31 * result + this.DestinationFileNameLength.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.FileNameBuffer.contentHashCode()
        return result
    }
}

public data class SMB_SHARE_FLUSH_AND_PURGE_INPUT(public var Version: UShort = 0u)

public data class SMB_SHARE_FLUSH_AND_PURGE_OUTPUT(public var cEntriesPurged: UInt = 0u)

public data class STARTING_LCN_INPUT_BUFFER(public var StartingLcn: Long = 0L)

public data class STARTING_LCN_INPUT_BUFFER_EX(public var StartingLcn: Long = 0L, public var Flags: UInt = 0u)

public data class STARTING_VCN_INPUT_BUFFER(public var StartingVcn: Long = 0L)

public data class STORAGE_ACCESS_ALIGNMENT_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var BytesPerCacheLine: UInt = 0u,
    public var BytesOffsetForCacheAlignment: UInt = 0u,
    public var BytesPerLogicalSector: UInt = 0u,
    public var BytesPerPhysicalSector: UInt = 0u,
    public var BytesOffsetForSectorAlignment: UInt = 0u,
)

public data class STORAGE_ADAPTER_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var MaximumTransferLength: UInt = 0u,
    public var MaximumPhysicalPages: UInt = 0u,
    public var AlignmentMask: UInt = 0u,
    public var AdapterUsesPio: Boolean = false,
    public var AdapterScansDown: Boolean = false,
    public var CommandQueueing: Boolean = false,
    public var AcceleratedTransfer: Boolean = false,
    public var BusType: UByte = 0u,
    public var BusMajorVersion: UShort = 0u,
    public var BusMinorVersion: UShort = 0u,
    public var SrbType: UByte = 0u,
    public var AddressType: UByte = 0u,
)

public data class STORAGE_ADAPTER_SERIAL_NUMBER(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var SerialNumber: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_ADAPTER_SERIAL_NUMBER) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (!this.SerialNumber.contentEquals(other.SerialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.SerialNumber.contentHashCode()
        return result
    }
}

public data class STORAGE_ALLOCATE_BC_STREAM_INPUT(
    public var Version: UInt = 0u,
    public var RequestsPerPeriod: UInt = 0u,
    public var Period: UInt = 0u,
    public var RetryFailures: Boolean = false,
    public var Discardable: Boolean = false,
    public var Reserved1: BooleanArray = BooleanArray(2),
    public var AccessType: UInt = 0u,
    public var AccessMode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_ALLOCATE_BC_STREAM_INPUT) return false
        if (this.Version != other.Version) return false
        if (this.RequestsPerPeriod != other.RequestsPerPeriod) return false
        if (this.Period != other.Period) return false
        if (this.RetryFailures != other.RetryFailures) return false
        if (this.Discardable != other.Discardable) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.AccessType != other.AccessType) return false
        if (this.AccessMode != other.AccessMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.RequestsPerPeriod.hashCode()
        result = 31 * result + this.Period.hashCode()
        result = 31 * result + this.RetryFailures.hashCode()
        result = 31 * result + this.Discardable.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.AccessType.hashCode()
        result = 31 * result + this.AccessMode.hashCode()
        return result
    }
}

public data class STORAGE_ALLOCATE_BC_STREAM_OUTPUT(public var RequestSize: ULong = 0uL, public var NumOutStandingRequests: UInt = 0u)

public data class STORAGE_ATTRIBUTE_MGMT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Action: STORAGE_ATTRIBUTE_MGMT_ACTION = 0,
    public var Attribute: UInt = 0u,
)

public data class STORAGE_BREAK_RESERVATION_REQUEST(
    public var Length: UInt = 0u,
    public var _unused: UByte = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
)

public data class STORAGE_BUS_RESET_REQUEST(public var PathId: UByte = 0u)

public data class STORAGE_COUNTER(public var Type: STORAGE_COUNTER_TYPE = 0, public var Value: STORAGE_COUNTER_0 = STORAGE_COUNTER_0())

public data class STORAGE_COUNTER_0(public var ManufactureDate: STORAGE_COUNTER_0_0 = STORAGE_COUNTER_0_0(), public var AsUlonglong: ULong = 0uL)

public data class STORAGE_COUNTER_0_0(public var Week: UInt = 0u, public var Year: UInt = 0u)

public data class STORAGE_COUNTERS(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var NumberOfCounters: UInt = 0u,
    public var Counters: List<STORAGE_COUNTER> = List(1) { STORAGE_COUNTER() },
)

public data class STORAGE_CRYPTO_CAPABILITY(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var CryptoCapabilityIndex: UInt = 0u,
    public var AlgorithmId: STORAGE_CRYPTO_ALGORITHM_ID = 0,
    public var KeySize: STORAGE_CRYPTO_KEY_SIZE = 0,
    public var DataUnitSizeBitmask: UInt = 0u,
)

public data class STORAGE_CRYPTO_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var NumKeysSupported: UInt = 0u,
    public var NumCryptoCapabilities: UInt = 0u,
    public var CryptoCapabilities: List<STORAGE_CRYPTO_CAPABILITY> = List(1) { STORAGE_CRYPTO_CAPABILITY() },
)

public data class STORAGE_DESCRIPTOR_HEADER(public var Version: UInt = 0u, public var Size: UInt = 0u)

public data class STORAGE_DEVICE_ATTRIBUTES_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Attributes: ULong = 0uL,
)

public data class STORAGE_DEVICE_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DeviceType: UByte = 0u,
    public var DeviceTypeModifier: UByte = 0u,
    public var RemovableMedia: Boolean = false,
    public var CommandQueueing: Boolean = false,
    public var VendorIdOffset: UInt = 0u,
    public var ProductIdOffset: UInt = 0u,
    public var ProductRevisionOffset: UInt = 0u,
    public var SerialNumberOffset: UInt = 0u,
    public var BusType: Storage.FileSystem.STORAGE_BUS_TYPE = Storage.FileSystem.STORAGE_BUS_TYPE(),
    public var RawPropertiesLength: UInt = 0u,
    public var RawDeviceProperties: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_DEVICE_DESCRIPTOR) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.DeviceType != other.DeviceType) return false
        if (this.DeviceTypeModifier != other.DeviceTypeModifier) return false
        if (this.RemovableMedia != other.RemovableMedia) return false
        if (this.CommandQueueing != other.CommandQueueing) return false
        if (this.VendorIdOffset != other.VendorIdOffset) return false
        if (this.ProductIdOffset != other.ProductIdOffset) return false
        if (this.ProductRevisionOffset != other.ProductRevisionOffset) return false
        if (this.SerialNumberOffset != other.SerialNumberOffset) return false
        if (this.BusType != other.BusType) return false
        if (this.RawPropertiesLength != other.RawPropertiesLength) return false
        if (!this.RawDeviceProperties.contentEquals(other.RawDeviceProperties)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.DeviceType.hashCode()
        result = 31 * result + this.DeviceTypeModifier.hashCode()
        result = 31 * result + this.RemovableMedia.hashCode()
        result = 31 * result + this.CommandQueueing.hashCode()
        result = 31 * result + this.VendorIdOffset.hashCode()
        result = 31 * result + this.ProductIdOffset.hashCode()
        result = 31 * result + this.ProductRevisionOffset.hashCode()
        result = 31 * result + this.SerialNumberOffset.hashCode()
        result = 31 * result + this.BusType.hashCode()
        result = 31 * result + this.RawPropertiesLength.hashCode()
        result = 31 * result + this.RawDeviceProperties.contentHashCode()
        return result
    }
}

public data class STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var NumberOfFaultDomains: UInt = 0u,
    public var FaultDomainIds: List<GUID> = List(1) { GUID() },
)

public data class STORAGE_DEVICE_ID_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var NumberOfIdentifiers: UInt = 0u,
    public var Identifiers: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_DEVICE_ID_DESCRIPTOR) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.NumberOfIdentifiers != other.NumberOfIdentifiers) return false
        if (!this.Identifiers.contentEquals(other.Identifiers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.NumberOfIdentifiers.hashCode()
        result = 31 * result + this.Identifiers.contentHashCode()
        return result
    }
}

public data class STORAGE_DEVICE_IO_CAPABILITY_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var LunMaxIoCount: UInt = 0u,
    public var AdapterMaxIoCount: UInt = 0u,
)

public data class STORAGE_DEVICE_LED_STATE_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var State: ULong = 0uL,
)

public data class STORAGE_DEVICE_LOCATION_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Location: DEVICE_LOCATION = DEVICE_LOCATION(),
    public var StringOffset: UInt = 0u,
)

public data class STORAGE_DEVICE_MANAGEMENT_STATUS(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Health: STORAGE_DISK_HEALTH_STATUS = 0,
    public var NumberOfOperationalStatus: UInt = 0u,
    public var NumberOfAdditionalReasons: UInt = 0u,
    public var OperationalStatus: IntArray = IntArray(16),
    public var AdditionalReasons: List<STORAGE_OPERATIONAL_REASON> = List(1) { STORAGE_OPERATIONAL_REASON() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_DEVICE_MANAGEMENT_STATUS) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Health != other.Health) return false
        if (this.NumberOfOperationalStatus != other.NumberOfOperationalStatus) return false
        if (this.NumberOfAdditionalReasons != other.NumberOfAdditionalReasons) return false
        if (!this.OperationalStatus.contentEquals(other.OperationalStatus)) return false
        if (this.AdditionalReasons != other.AdditionalReasons) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Health.hashCode()
        result = 31 * result + this.NumberOfOperationalStatus.hashCode()
        result = 31 * result + this.NumberOfAdditionalReasons.hashCode()
        result = 31 * result + this.OperationalStatus.contentHashCode()
        result = 31 * result + this.AdditionalReasons.hashCode()
        return result
    }
}

public data class STORAGE_DEVICE_NUMA_PROPERTY(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var NumaNode: UInt = 0u,
)

public data class STORAGE_DEVICE_NUMBER(
    public var DeviceType: UInt = 0u,
    public var DeviceNumber: UInt = 0u,
    public var PartitionNumber: UInt = 0u,
)

public data class STORAGE_DEVICE_NUMBERS(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var NumberOfDevices: UInt = 0u,
    public var Devices: List<STORAGE_DEVICE_NUMBER> = List(1) { STORAGE_DEVICE_NUMBER() },
)

public data class STORAGE_DEVICE_NUMBER_EX(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DeviceType: UInt = 0u,
    public var DeviceNumber: UInt = 0u,
    public var DeviceGuid: GUID = GUID(),
    public var PartitionNumber: UInt = 0u,
)

public data class STORAGE_DEVICE_POWER_CAP(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Units: STORAGE_DEVICE_POWER_CAP_UNITS = 0,
    public var MaxPower: ULong = 0uL,
)

public data class STORAGE_DEVICE_RESILIENCY_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var NameOffset: UInt = 0u,
    public var NumberOfLogicalCopies: UInt = 0u,
    public var NumberOfPhysicalCopies: UInt = 0u,
    public var PhysicalDiskRedundancy: UInt = 0u,
    public var NumberOfColumns: UInt = 0u,
    public var Interleave: UInt = 0u,
)

public data class STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var SupportsSelfEncryption: Boolean = false,
)

public data class STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var SupportsSelfEncryption: Boolean = false,
    public var EncryptionType: STORAGE_ENCRYPTION_TYPE = 0,
)

public data class STORAGE_DEVICE_TIERING_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TotalNumberOfTiers: UInt = 0u,
    public var NumberOfTiersReturned: UInt = 0u,
    public var Tiers: List<STORAGE_TIER> = List(1) { STORAGE_TIER() },
)

public data class STORAGE_DEVICE_UNSAFE_SHUTDOWN_COUNT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var UnsafeShutdownCount: UInt = 0u,
)

public data class STORAGE_DIAGNOSTIC_DATA(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var ProviderId: GUID = GUID(),
    public var BufferSize: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var DiagnosticDataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_DIAGNOSTIC_DATA) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.ProviderId != other.ProviderId) return false
        if (this.BufferSize != other.BufferSize) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.DiagnosticDataBuffer.contentEquals(other.DiagnosticDataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.ProviderId.hashCode()
        result = 31 * result + this.BufferSize.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.DiagnosticDataBuffer.contentHashCode()
        return result
    }
}

public data class STORAGE_DIAGNOSTIC_REQUEST(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TargetType: STORAGE_DIAGNOSTIC_TARGET_TYPE = 0,
    public var Level: STORAGE_DIAGNOSTIC_LEVEL = 0,
)

public data class STORAGE_EVENT_NOTIFICATION(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Events: ULong = 0uL,
)

public data class STORAGE_FAILURE_PREDICTION_CONFIG(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Set: Boolean = false,
    public var Enabled: Boolean = false,
    public var Reserved: UShort = 0u,
)

public data class STORAGE_FRU_ID_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var IdentifierSize: UInt = 0u,
    public var Identifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_FRU_ID_DESCRIPTOR) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.IdentifierSize != other.IdentifierSize) return false
        if (!this.Identifier.contentEquals(other.Identifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.IdentifierSize.hashCode()
        result = 31 * result + this.Identifier.contentHashCode()
        return result
    }
}

public data class STORAGE_GET_BC_PROPERTIES_OUTPUT(
    public var MaximumRequestsPerPeriod: UInt = 0u,
    public var MinimumPeriod: UInt = 0u,
    public var MaximumRequestSize: ULong = 0uL,
    public var EstimatedTimePerRequest: UInt = 0u,
    public var NumOutStandingRequests: UInt = 0u,
    public var RequestSize: ULong = 0uL,
)

public data class STORAGE_HOTPLUG_INFO(
    public var Size: UInt = 0u,
    public var MediaRemovable: Boolean = false,
    public var MediaHotplug: Boolean = false,
    public var DeviceHotplug: Boolean = false,
    public var WriteCacheEnableOverride: Boolean = false,
)

public data class STORAGE_HW_ENDURANCE_DATA_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var EnduranceInfo: STORAGE_HW_ENDURANCE_INFO = STORAGE_HW_ENDURANCE_INFO(),
)

public data class STORAGE_HW_ENDURANCE_INFO(
    public var ValidFields: UInt = 0u,
    public var GroupId: UInt = 0u,
    public var Flags: STORAGE_HW_ENDURANCE_INFO_0 = STORAGE_HW_ENDURANCE_INFO_0(),
    public var LifePercentage: UInt = 0u,
    public var BytesReadCount: UByteArray = UByteArray(16),
    public var ByteWriteCount: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_HW_ENDURANCE_INFO) return false
        if (this.ValidFields != other.ValidFields) return false
        if (this.GroupId != other.GroupId) return false
        if (this.Flags != other.Flags) return false
        if (this.LifePercentage != other.LifePercentage) return false
        if (!this.BytesReadCount.contentEquals(other.BytesReadCount)) return false
        if (!this.ByteWriteCount.contentEquals(other.ByteWriteCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ValidFields.hashCode()
        result = 31 * result + this.GroupId.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.LifePercentage.hashCode()
        result = 31 * result + this.BytesReadCount.contentHashCode()
        result = 31 * result + this.ByteWriteCount.contentHashCode()
        return result
    }
}

public data class STORAGE_HW_ENDURANCE_INFO_0(public var _bitfield: UInt = 0u)

public data class STORAGE_HW_FIRMWARE_ACTIVATE(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Slot: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_HW_FIRMWARE_ACTIVATE) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.Slot != other.Slot) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Slot.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        return result
    }
}

public data class STORAGE_HW_FIRMWARE_DOWNLOAD(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Slot: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var Offset: ULong = 0uL,
    public var BufferSize: ULong = 0uL,
    public var ImageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_HW_FIRMWARE_DOWNLOAD) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.Slot != other.Slot) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Offset != other.Offset) return false
        if (this.BufferSize != other.BufferSize) return false
        if (!this.ImageBuffer.contentEquals(other.ImageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Slot.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Offset.hashCode()
        result = 31 * result + this.BufferSize.hashCode()
        result = 31 * result + this.ImageBuffer.contentHashCode()
        return result
    }
}

public data class STORAGE_HW_FIRMWARE_DOWNLOAD_V2(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Slot: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var Offset: ULong = 0uL,
    public var BufferSize: ULong = 0uL,
    public var ImageSize: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var ImageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_HW_FIRMWARE_DOWNLOAD_V2) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.Slot != other.Slot) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Offset != other.Offset) return false
        if (this.BufferSize != other.BufferSize) return false
        if (this.ImageSize != other.ImageSize) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (!this.ImageBuffer.contentEquals(other.ImageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Slot.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Offset.hashCode()
        result = 31 * result + this.BufferSize.hashCode()
        result = 31 * result + this.ImageSize.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.ImageBuffer.contentHashCode()
        return result
    }
}

public data class STORAGE_HW_FIRMWARE_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var _bitfield: UByte = 0u,
    public var SlotCount: UByte = 0u,
    public var ActiveSlot: UByte = 0u,
    public var PendingActivateSlot: UByte = 0u,
    public var FirmwareShared: Boolean = false,
    public var Reserved: UByteArray = UByteArray(3),
    public var ImagePayloadAlignment: UInt = 0u,
    public var ImagePayloadMaxSize: UInt = 0u,
    public var Slot: List<STORAGE_HW_FIRMWARE_SLOT_INFO> = List(1) { STORAGE_HW_FIRMWARE_SLOT_INFO() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_HW_FIRMWARE_INFO) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this._bitfield != other._bitfield) return false
        if (this.SlotCount != other.SlotCount) return false
        if (this.ActiveSlot != other.ActiveSlot) return false
        if (this.PendingActivateSlot != other.PendingActivateSlot) return false
        if (this.FirmwareShared != other.FirmwareShared) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.ImagePayloadAlignment != other.ImagePayloadAlignment) return false
        if (this.ImagePayloadMaxSize != other.ImagePayloadMaxSize) return false
        if (this.Slot != other.Slot) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.SlotCount.hashCode()
        result = 31 * result + this.ActiveSlot.hashCode()
        result = 31 * result + this.PendingActivateSlot.hashCode()
        result = 31 * result + this.FirmwareShared.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.ImagePayloadAlignment.hashCode()
        result = 31 * result + this.ImagePayloadMaxSize.hashCode()
        result = 31 * result + this.Slot.hashCode()
        return result
    }
}

public data class STORAGE_HW_FIRMWARE_INFO_QUERY(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class STORAGE_HW_FIRMWARE_SLOT_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var SlotNumber: UByte = 0u,
    public var _bitfield: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(6),
    public var Revision: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_HW_FIRMWARE_SLOT_INFO) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.SlotNumber != other.SlotNumber) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.Revision.contentEquals(other.Revision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.SlotNumber.hashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Revision.contentHashCode()
        return result
    }
}

public data class STORAGE_IDENTIFIER(
    public var CodeSet: STORAGE_IDENTIFIER_CODE_SET = 0,
    public var Type: STORAGE_IDENTIFIER_TYPE = 0,
    public var IdentifierSize: UShort = 0u,
    public var NextOffset: UShort = 0u,
    public var Association: STORAGE_ASSOCIATION_TYPE = 0,
    public var Identifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_IDENTIFIER) return false
        if (this.CodeSet != other.CodeSet) return false
        if (this.Type != other.Type) return false
        if (this.IdentifierSize != other.IdentifierSize) return false
        if (this.NextOffset != other.NextOffset) return false
        if (this.Association != other.Association) return false
        if (!this.Identifier.contentEquals(other.Identifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CodeSet.hashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.IdentifierSize.hashCode()
        result = 31 * result + this.NextOffset.hashCode()
        result = 31 * result + this.Association.hashCode()
        result = 31 * result + this.Identifier.contentHashCode()
        return result
    }
}

public data class STORAGE_IDLE_POWER(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var _bitfield: UInt = 0u,
    public var D3IdleTimeout: UInt = 0u,
)

public data class STORAGE_IDLE_POWERUP_REASON(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var PowerupReason: STORAGE_POWERUP_REASON_TYPE = 0,
)

public data class STORAGE_LB_PROVISIONING_MAP_RESOURCES(
    public var Size: UInt = 0u,
    public var Version: UInt = 0u,
    public var _bitfield1: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(3),
    public var _bitfield2: UByte = 0u,
    public var Reserved3: UByteArray = UByteArray(3),
    public var AvailableMappingResources: ULong = 0uL,
    public var UsedMappingResources: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_LB_PROVISIONING_MAP_RESOURCES) return false
        if (this.Size != other.Size) return false
        if (this.Version != other.Version) return false
        if (this._bitfield1 != other._bitfield1) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this._bitfield2 != other._bitfield2) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        if (this.AvailableMappingResources != other.AvailableMappingResources) return false
        if (this.UsedMappingResources != other.UsedMappingResources) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this._bitfield1.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this._bitfield2.hashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        result = 31 * result + this.AvailableMappingResources.hashCode()
        result = 31 * result + this.UsedMappingResources.hashCode()
        return result
    }
}

public data class STORAGE_MEDIA_SERIAL_NUMBER_DATA(
    public var Reserved: UShort = 0u,
    public var SerialNumberLength: UShort = 0u,
    public var SerialNumber: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_MEDIA_SERIAL_NUMBER_DATA) return false
        if (this.Reserved != other.Reserved) return false
        if (this.SerialNumberLength != other.SerialNumberLength) return false
        if (!this.SerialNumber.contentEquals(other.SerialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved.hashCode()
        result = 31 * result + this.SerialNumberLength.hashCode()
        result = 31 * result + this.SerialNumber.contentHashCode()
        return result
    }
}

public data class STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var MediumProductType: UInt = 0u,
)

public data class STORAGE_MINIPORT_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Portdriver: STORAGE_PORT_CODE_SET = 0,
    public var LUNResetSupported: Boolean = false,
    public var TargetResetSupported: Boolean = false,
    public var IoTimeoutValue: UShort = 0u,
    public var ExtraIoInfoSupported: Boolean = false,
    public var Flags: STORAGE_MINIPORT_DESCRIPTOR_0 = STORAGE_MINIPORT_DESCRIPTOR_0(),
    public var Reserved0: UByteArray = UByteArray(2),
    public var Reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_MINIPORT_DESCRIPTOR) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Portdriver != other.Portdriver) return false
        if (this.LUNResetSupported != other.LUNResetSupported) return false
        if (this.TargetResetSupported != other.TargetResetSupported) return false
        if (this.IoTimeoutValue != other.IoTimeoutValue) return false
        if (this.ExtraIoInfoSupported != other.ExtraIoInfoSupported) return false
        if (this.Flags != other.Flags) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.Reserved1 != other.Reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Portdriver.hashCode()
        result = 31 * result + this.LUNResetSupported.hashCode()
        result = 31 * result + this.TargetResetSupported.hashCode()
        result = 31 * result + this.IoTimeoutValue.hashCode()
        result = 31 * result + this.ExtraIoInfoSupported.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.Reserved1.hashCode()
        return result
    }
}

public data class STORAGE_MINIPORT_DESCRIPTOR_0(public var Anonymous: STORAGE_MINIPORT_DESCRIPTOR_0_0 = STORAGE_MINIPORT_DESCRIPTOR_0_0(), public var AsBYTE: UByte = 0u)

public data class STORAGE_MINIPORT_DESCRIPTOR_0_0(public var _bitfield: UByte = 0u)

public data class STORAGE_OFFLOAD_READ_OUTPUT(
    public var OffloadReadFlags: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var LengthProtected: ULong = 0uL,
    public var TokenLength: UInt = 0u,
    public var Token: STORAGE_OFFLOAD_TOKEN = STORAGE_OFFLOAD_TOKEN(),
)

public data class STORAGE_OFFLOAD_TOKEN(
    public var TokenType: UByteArray = UByteArray(4),
    public var Reserved: UByteArray = UByteArray(2),
    public var TokenIdLength: UByteArray = UByteArray(2),
    public var Anonymous: STORAGE_OFFLOAD_TOKEN_0 = STORAGE_OFFLOAD_TOKEN_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_OFFLOAD_TOKEN) return false
        if (!this.TokenType.contentEquals(other.TokenType)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.TokenIdLength.contentEquals(other.TokenIdLength)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TokenType.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.TokenIdLength.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class STORAGE_OFFLOAD_TOKEN_0(public var StorageOffloadZeroDataToken: STORAGE_OFFLOAD_TOKEN_0_0 = STORAGE_OFFLOAD_TOKEN_0_0(), public var Token: UByteArray = UByteArray(504)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_OFFLOAD_TOKEN_0) return false
        if (this.StorageOffloadZeroDataToken != other.StorageOffloadZeroDataToken) return false
        if (!this.Token.contentEquals(other.Token)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.StorageOffloadZeroDataToken.hashCode()
        result = 31 * result + this.Token.contentHashCode()
        return result
    }
}

public data class STORAGE_OFFLOAD_TOKEN_0_0(public var Reserved2: UByteArray = UByteArray(504)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_OFFLOAD_TOKEN_0_0) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved2.contentHashCode()
    }
}

public data class STORAGE_OFFLOAD_WRITE_OUTPUT(
    public var OffloadWriteFlags: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var LengthCopied: ULong = 0uL,
)

public data class STORAGE_OPERATIONAL_REASON(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Reason: STORAGE_OPERATIONAL_STATUS_REASON = 0,
    public var RawBytes: STORAGE_OPERATIONAL_REASON_0 = STORAGE_OPERATIONAL_REASON_0(),
)

public data class STORAGE_OPERATIONAL_REASON_0(
    public var ScsiSenseKey: STORAGE_OPERATIONAL_REASON_0_0 = STORAGE_OPERATIONAL_REASON_0_0(),
    public var NVDIMM_N: STORAGE_OPERATIONAL_REASON_0_1 = STORAGE_OPERATIONAL_REASON_0_1(),
    public var AsUlong: UInt = 0u,
)

public data class STORAGE_OPERATIONAL_REASON_0_1(
    public var CriticalHealth: UByte = 0u,
    public var ModuleHealth: UByteArray = UByteArray(2),
    public var ErrorThresholdStatus: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_OPERATIONAL_REASON_0_1) return false
        if (this.CriticalHealth != other.CriticalHealth) return false
        if (!this.ModuleHealth.contentEquals(other.ModuleHealth)) return false
        if (this.ErrorThresholdStatus != other.ErrorThresholdStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CriticalHealth.hashCode()
        result = 31 * result + this.ModuleHealth.contentHashCode()
        result = 31 * result + this.ErrorThresholdStatus.hashCode()
        return result
    }
}

public data class STORAGE_OPERATIONAL_REASON_0_0(
    public var SenseKey: UByte = 0u,
    public var ASC: UByte = 0u,
    public var ASCQ: UByte = 0u,
    public var Reserved: UByte = 0u,
)

public data class STORAGE_PHYSICAL_ADAPTER_DATA(
    public var AdapterId: UInt = 0u,
    public var HealthStatus: STORAGE_COMPONENT_HEALTH_STATUS = 0,
    public var CommandProtocol: STORAGE_PROTOCOL_TYPE = 0,
    public var SpecVersion: STORAGE_SPEC_VERSION = STORAGE_SPEC_VERSION(),
    public var Vendor: UByteArray = UByteArray(8),
    public var Model: UByteArray = UByteArray(40),
    public var FirmwareRevision: UByteArray = UByteArray(16),
    public var PhysicalLocation: UByteArray = UByteArray(32),
    public var ExpanderConnected: Boolean = false,
    public var Reserved0: UByteArray = UByteArray(3),
    public var Reserved1: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_PHYSICAL_ADAPTER_DATA) return false
        if (this.AdapterId != other.AdapterId) return false
        if (this.HealthStatus != other.HealthStatus) return false
        if (this.CommandProtocol != other.CommandProtocol) return false
        if (this.SpecVersion != other.SpecVersion) return false
        if (!this.Vendor.contentEquals(other.Vendor)) return false
        if (!this.Model.contentEquals(other.Model)) return false
        if (!this.FirmwareRevision.contentEquals(other.FirmwareRevision)) return false
        if (!this.PhysicalLocation.contentEquals(other.PhysicalLocation)) return false
        if (this.ExpanderConnected != other.ExpanderConnected) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AdapterId.hashCode()
        result = 31 * result + this.HealthStatus.hashCode()
        result = 31 * result + this.CommandProtocol.hashCode()
        result = 31 * result + this.SpecVersion.hashCode()
        result = 31 * result + this.Vendor.contentHashCode()
        result = 31 * result + this.Model.contentHashCode()
        result = 31 * result + this.FirmwareRevision.contentHashCode()
        result = 31 * result + this.PhysicalLocation.contentHashCode()
        result = 31 * result + this.ExpanderConnected.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class STORAGE_PHYSICAL_DEVICE_DATA(
    public var DeviceId: UInt = 0u,
    public var Role: UInt = 0u,
    public var HealthStatus: STORAGE_COMPONENT_HEALTH_STATUS = 0,
    public var CommandProtocol: STORAGE_PROTOCOL_TYPE = 0,
    public var SpecVersion: STORAGE_SPEC_VERSION = STORAGE_SPEC_VERSION(),
    public var FormFactor: STORAGE_DEVICE_FORM_FACTOR = 0,
    public var Vendor: UByteArray = UByteArray(8),
    public var Model: UByteArray = UByteArray(40),
    public var FirmwareRevision: UByteArray = UByteArray(16),
    public var Capacity: ULong = 0uL,
    public var PhysicalLocation: UByteArray = UByteArray(32),
    public var Reserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_PHYSICAL_DEVICE_DATA) return false
        if (this.DeviceId != other.DeviceId) return false
        if (this.Role != other.Role) return false
        if (this.HealthStatus != other.HealthStatus) return false
        if (this.CommandProtocol != other.CommandProtocol) return false
        if (this.SpecVersion != other.SpecVersion) return false
        if (this.FormFactor != other.FormFactor) return false
        if (!this.Vendor.contentEquals(other.Vendor)) return false
        if (!this.Model.contentEquals(other.Model)) return false
        if (!this.FirmwareRevision.contentEquals(other.FirmwareRevision)) return false
        if (this.Capacity != other.Capacity) return false
        if (!this.PhysicalLocation.contentEquals(other.PhysicalLocation)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceId.hashCode()
        result = 31 * result + this.Role.hashCode()
        result = 31 * result + this.HealthStatus.hashCode()
        result = 31 * result + this.CommandProtocol.hashCode()
        result = 31 * result + this.SpecVersion.hashCode()
        result = 31 * result + this.FormFactor.hashCode()
        result = 31 * result + this.Vendor.contentHashCode()
        result = 31 * result + this.Model.contentHashCode()
        result = 31 * result + this.FirmwareRevision.contentHashCode()
        result = 31 * result + this.Capacity.hashCode()
        result = 31 * result + this.PhysicalLocation.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class STORAGE_PHYSICAL_NODE_DATA(
    public var NodeId: UInt = 0u,
    public var AdapterCount: UInt = 0u,
    public var AdapterDataLength: UInt = 0u,
    public var AdapterDataOffset: UInt = 0u,
    public var DeviceCount: UInt = 0u,
    public var DeviceDataLength: UInt = 0u,
    public var DeviceDataOffset: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_PHYSICAL_NODE_DATA) return false
        if (this.NodeId != other.NodeId) return false
        if (this.AdapterCount != other.AdapterCount) return false
        if (this.AdapterDataLength != other.AdapterDataLength) return false
        if (this.AdapterDataOffset != other.AdapterDataOffset) return false
        if (this.DeviceCount != other.DeviceCount) return false
        if (this.DeviceDataLength != other.DeviceDataLength) return false
        if (this.DeviceDataOffset != other.DeviceDataOffset) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NodeId.hashCode()
        result = 31 * result + this.AdapterCount.hashCode()
        result = 31 * result + this.AdapterDataLength.hashCode()
        result = 31 * result + this.AdapterDataOffset.hashCode()
        result = 31 * result + this.DeviceCount.hashCode()
        result = 31 * result + this.DeviceDataLength.hashCode()
        result = 31 * result + this.DeviceDataOffset.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var NodeCount: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Node: List<STORAGE_PHYSICAL_NODE_DATA> = List(1) { STORAGE_PHYSICAL_NODE_DATA() },
)

public data class STORAGE_PREDICT_FAILURE(public var PredictFailure: UInt = 0u, public var VendorSpecific: UByteArray = UByteArray(512)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_PREDICT_FAILURE) return false
        if (this.PredictFailure != other.PredictFailure) return false
        if (!this.VendorSpecific.contentEquals(other.VendorSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PredictFailure.hashCode()
        result = 31 * result + this.VendorSpecific.contentHashCode()
        return result
    }
}

public data class STORAGE_PRIORITY_HINT_SUPPORT(public var SupportFlags: UInt = 0u)

public data class STORAGE_PROPERTY_QUERY(
    public var PropertyId: STORAGE_PROPERTY_ID = 0,
    public var QueryType: STORAGE_QUERY_TYPE = 0,
    public var AdditionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_PROPERTY_QUERY) return false
        if (this.PropertyId != other.PropertyId) return false
        if (this.QueryType != other.QueryType) return false
        if (!this.AdditionalParameters.contentEquals(other.AdditionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PropertyId.hashCode()
        result = 31 * result + this.QueryType.hashCode()
        result = 31 * result + this.AdditionalParameters.contentHashCode()
        return result
    }
}

public data class STORAGE_PROPERTY_SET(
    public var PropertyId: STORAGE_PROPERTY_ID = 0,
    public var SetType: STORAGE_SET_TYPE = 0,
    public var AdditionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_PROPERTY_SET) return false
        if (this.PropertyId != other.PropertyId) return false
        if (this.SetType != other.SetType) return false
        if (!this.AdditionalParameters.contentEquals(other.AdditionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PropertyId.hashCode()
        result = 31 * result + this.SetType.hashCode()
        result = 31 * result + this.AdditionalParameters.contentHashCode()
        return result
    }
}

public class STORAGE_PROTOCOL_COMMAND(
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var ProtocolType: STORAGE_PROTOCOL_TYPE = 0,
    public var Flags: UInt = 0u,
    public var ReturnStatus: UInt = 0u,
    public var ErrorCode: UInt = 0u,
    public var CommandLength: UInt = 0u,
    public var ErrorInfoLength: UInt = 0u,
    public var DataToDeviceTransferLength: UInt = 0u,
    public var DataFromDeviceTransferLength: UInt = 0u,
    public var TimeOutValue: UInt = 0u,
    public var ErrorInfoOffset: UInt = 0u,
    public var DataToDeviceBufferOffset: UInt = 0u,
    public var DataFromDeviceBufferOffset: UInt = 0u,
    public var CommandSpecific: UInt = 0u,
    public var Reserved0: UInt = 0u,
    public var FixedProtocolReturnData: UInt = 0u,
    public var Reserved1: UIntArray = UIntArray(3),
    public var Command: UByteArray = UByteArray(1),
)

public data class STORAGE_PROTOCOL_DATA_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var ProtocolSpecificData: STORAGE_PROTOCOL_SPECIFIC_DATA = STORAGE_PROTOCOL_SPECIFIC_DATA(),
)

public data class STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var ProtocolSpecificData: STORAGE_PROTOCOL_SPECIFIC_DATA_EXT = STORAGE_PROTOCOL_SPECIFIC_DATA_EXT(),
)

public data class STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE(public var Anonymous: STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE_0 = STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE_0(), public var AsUlong: UInt = 0u)

public data class STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE_0(public var _bitfield: UInt = 0u)

public data class STORAGE_PROTOCOL_SPECIFIC_DATA(
    public var ProtocolType: STORAGE_PROTOCOL_TYPE = 0,
    public var DataType: UInt = 0u,
    public var ProtocolDataRequestValue: UInt = 0u,
    public var ProtocolDataRequestSubValue: UInt = 0u,
    public var ProtocolDataOffset: UInt = 0u,
    public var ProtocolDataLength: UInt = 0u,
    public var FixedProtocolReturnData: UInt = 0u,
    public var ProtocolDataRequestSubValue2: UInt = 0u,
    public var ProtocolDataRequestSubValue3: UInt = 0u,
    public var ProtocolDataRequestSubValue4: UInt = 0u,
)

public data class STORAGE_PROTOCOL_SPECIFIC_DATA_EXT(
    public var ProtocolType: STORAGE_PROTOCOL_TYPE = 0,
    public var DataType: UInt = 0u,
    public var ProtocolDataValue: UInt = 0u,
    public var ProtocolDataSubValue: UInt = 0u,
    public var ProtocolDataOffset: UInt = 0u,
    public var ProtocolDataLength: UInt = 0u,
    public var FixedProtocolReturnData: UInt = 0u,
    public var ProtocolDataSubValue2: UInt = 0u,
    public var ProtocolDataSubValue3: UInt = 0u,
    public var ProtocolDataSubValue4: UInt = 0u,
    public var ProtocolDataSubValue5: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_PROTOCOL_SPECIFIC_DATA_EXT) return false
        if (this.ProtocolType != other.ProtocolType) return false
        if (this.DataType != other.DataType) return false
        if (this.ProtocolDataValue != other.ProtocolDataValue) return false
        if (this.ProtocolDataSubValue != other.ProtocolDataSubValue) return false
        if (this.ProtocolDataOffset != other.ProtocolDataOffset) return false
        if (this.ProtocolDataLength != other.ProtocolDataLength) return false
        if (this.FixedProtocolReturnData != other.FixedProtocolReturnData) return false
        if (this.ProtocolDataSubValue2 != other.ProtocolDataSubValue2) return false
        if (this.ProtocolDataSubValue3 != other.ProtocolDataSubValue3) return false
        if (this.ProtocolDataSubValue4 != other.ProtocolDataSubValue4) return false
        if (this.ProtocolDataSubValue5 != other.ProtocolDataSubValue5) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProtocolType.hashCode()
        result = 31 * result + this.DataType.hashCode()
        result = 31 * result + this.ProtocolDataValue.hashCode()
        result = 31 * result + this.ProtocolDataSubValue.hashCode()
        result = 31 * result + this.ProtocolDataOffset.hashCode()
        result = 31 * result + this.ProtocolDataLength.hashCode()
        result = 31 * result + this.FixedProtocolReturnData.hashCode()
        result = 31 * result + this.ProtocolDataSubValue2.hashCode()
        result = 31 * result + this.ProtocolDataSubValue3.hashCode()
        result = 31 * result + this.ProtocolDataSubValue4.hashCode()
        result = 31 * result + this.ProtocolDataSubValue5.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY(
    public var EntryLength: UInt = 0u,
    public var DependencyTypeFlags: UInt = 0u,
    public var ProviderSpecificFlags: UInt = 0u,
    public var VirtualStorageType: Storage.Vhd.VIRTUAL_STORAGE_TYPE = Storage.Vhd.VIRTUAL_STORAGE_TYPE(),
)

public data class STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY(
    public var EntryLength: UInt = 0u,
    public var DependencyTypeFlags: UInt = 0u,
    public var ProviderSpecificFlags: UInt = 0u,
    public var VirtualStorageType: Storage.Vhd.VIRTUAL_STORAGE_TYPE = Storage.Vhd.VIRTUAL_STORAGE_TYPE(),
    public var AncestorLevel: UInt = 0u,
    public var HostVolumeNameOffset: UInt = 0u,
    public var HostVolumeNameSize: UInt = 0u,
    public var DependentVolumeNameOffset: UInt = 0u,
    public var DependentVolumeNameSize: UInt = 0u,
    public var RelativePathOffset: UInt = 0u,
    public var RelativePathSize: UInt = 0u,
    public var DependentDeviceNameOffset: UInt = 0u,
    public var DependentDeviceNameSize: UInt = 0u,
)

public data class STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST(public var RequestLevel: UInt = 0u, public var RequestFlags: UInt = 0u)

public data class STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE(
    public var ResponseLevel: UInt = 0u,
    public var NumberEntries: UInt = 0u,
    public var Anonymous: STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE_0 = STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE_0(),
)

public data class STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE_0(public var Lev1Depends: List<STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY> = List(1) { STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY() }, public var Lev2Depends: List<STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY> = List(1) { STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY() })

public data class STORAGE_READ_CAPACITY(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var BlockLength: UInt = 0u,
    public var NumberOfBlocks: Long = 0L,
    public var DiskLength: Long = 0L,
)

public data class STORAGE_REINITIALIZE_MEDIA(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var TimeoutInSeconds: UInt = 0u,
    public var SanitizeOption: STORAGE_REINITIALIZE_MEDIA_0 = STORAGE_REINITIALIZE_MEDIA_0(),
)

public data class STORAGE_REINITIALIZE_MEDIA_0(public var _bitfield: UInt = 0u)

public data class STORAGE_RPMB_DATA_FRAME(
    public var Stuff: UByteArray = UByteArray(196),
    public var KeyOrMAC: UByteArray = UByteArray(32),
    public var Data: UByteArray = UByteArray(256),
    public var Nonce: UByteArray = UByteArray(16),
    public var WriteCounter: UByteArray = UByteArray(4),
    public var Address: UByteArray = UByteArray(2),
    public var BlockCount: UByteArray = UByteArray(2),
    public var OperationResult: UByteArray = UByteArray(2),
    public var RequestOrResponseType: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_RPMB_DATA_FRAME) return false
        if (!this.Stuff.contentEquals(other.Stuff)) return false
        if (!this.KeyOrMAC.contentEquals(other.KeyOrMAC)) return false
        if (!this.Data.contentEquals(other.Data)) return false
        if (!this.Nonce.contentEquals(other.Nonce)) return false
        if (!this.WriteCounter.contentEquals(other.WriteCounter)) return false
        if (!this.Address.contentEquals(other.Address)) return false
        if (!this.BlockCount.contentEquals(other.BlockCount)) return false
        if (!this.OperationResult.contentEquals(other.OperationResult)) return false
        if (!this.RequestOrResponseType.contentEquals(other.RequestOrResponseType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Stuff.contentHashCode()
        result = 31 * result + this.KeyOrMAC.contentHashCode()
        result = 31 * result + this.Data.contentHashCode()
        result = 31 * result + this.Nonce.contentHashCode()
        result = 31 * result + this.WriteCounter.contentHashCode()
        result = 31 * result + this.Address.contentHashCode()
        result = 31 * result + this.BlockCount.contentHashCode()
        result = 31 * result + this.OperationResult.contentHashCode()
        result = 31 * result + this.RequestOrResponseType.contentHashCode()
        return result
    }
}

public data class STORAGE_RPMB_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var SizeInBytes: UInt = 0u,
    public var MaxReliableWriteSizeInBytes: UInt = 0u,
    public var FrameFormat: STORAGE_RPMB_FRAME_TYPE = 0,
)

public data class STORAGE_SPEC_VERSION(public var Anonymous: STORAGE_SPEC_VERSION_0 = STORAGE_SPEC_VERSION_0(), public var AsUlong: UInt = 0u)

public data class STORAGE_SPEC_VERSION_0(public var MinorVersion: STORAGE_SPEC_VERSION_0_0 = STORAGE_SPEC_VERSION_0_0(), public var MajorVersion: UShort = 0u)

public data class STORAGE_SPEC_VERSION_0_0(public var Anonymous: STORAGE_SPEC_VERSION_0_0_0 = STORAGE_SPEC_VERSION_0_0_0(), public var AsUshort: UShort = 0u)

public data class STORAGE_SPEC_VERSION_0_0_0(public var SubMinor: UByte = 0u, public var Minor: UByte = 0u)

public data class STORAGE_TEMPERATURE_DATA_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var CriticalTemperature: Short = 0,
    public var WarningTemperature: Short = 0,
    public var InfoCount: UShort = 0u,
    public var Reserved0: UByteArray = UByteArray(2),
    public var Reserved1: UIntArray = UIntArray(2),
    public var TemperatureInfo: List<STORAGE_TEMPERATURE_INFO> = List(1) { STORAGE_TEMPERATURE_INFO() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_TEMPERATURE_DATA_DESCRIPTOR) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.CriticalTemperature != other.CriticalTemperature) return false
        if (this.WarningTemperature != other.WarningTemperature) return false
        if (this.InfoCount != other.InfoCount) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.TemperatureInfo != other.TemperatureInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.CriticalTemperature.hashCode()
        result = 31 * result + this.WarningTemperature.hashCode()
        result = 31 * result + this.InfoCount.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.TemperatureInfo.hashCode()
        return result
    }
}

public data class STORAGE_TEMPERATURE_INFO(
    public var Index: UShort = 0u,
    public var Temperature: Short = 0,
    public var OverThreshold: Short = 0,
    public var UnderThreshold: Short = 0,
    public var OverThresholdChangable: Boolean = false,
    public var UnderThresholdChangable: Boolean = false,
    public var EventGenerated: Boolean = false,
    public var Reserved0: UByte = 0u,
    public var Reserved1: UInt = 0u,
)

public data class STORAGE_TEMPERATURE_THRESHOLD(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UShort = 0u,
    public var Index: UShort = 0u,
    public var Threshold: Short = 0,
    public var OverThreshold: Boolean = false,
    public var Reserved: UByte = 0u,
)

public data class STORAGE_TIER(
    public var Id: GUID = GUID(),
    public var Name: UShortArray = UShortArray(256),
    public var Description: UShortArray = UShortArray(256),
    public var Flags: ULong = 0uL,
    public var ProvisionedCapacity: ULong = 0uL,
    public var MediaType: STORAGE_TIER_MEDIA_TYPE = 0,
    public var Class: STORAGE_TIER_CLASS = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_TIER) return false
        if (this.Id != other.Id) return false
        if (!this.Name.contentEquals(other.Name)) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (this.Flags != other.Flags) return false
        if (this.ProvisionedCapacity != other.ProvisionedCapacity) return false
        if (this.MediaType != other.MediaType) return false
        if (this.Class != other.Class) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Id.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.ProvisionedCapacity.hashCode()
        result = 31 * result + this.MediaType.hashCode()
        result = 31 * result + this.Class.hashCode()
        return result
    }
}

public data class STORAGE_TIER_REGION(
    public var TierId: GUID = GUID(),
    public var Offset: ULong = 0uL,
    public var Length: ULong = 0uL,
)

public data class STORAGE_WRITE_CACHE_PROPERTY(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var WriteCacheType: WRITE_CACHE_TYPE = 0,
    public var WriteCacheEnabled: WRITE_CACHE_ENABLE = 0,
    public var WriteCacheChangeable: WRITE_CACHE_CHANGE = 0,
    public var WriteThroughSupported: WRITE_THROUGH = 0,
    public var FlushCacheSupported: Boolean = false,
    public var UserDefinedPowerProtection: Boolean = false,
    public var NVCacheEnabled: Boolean = false,
)

public data class STORAGE_ZONED_DEVICE_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DeviceType: STORAGE_ZONED_DEVICE_TYPES = 0,
    public var ZoneCount: UInt = 0u,
    public var ZoneAttributes: STORAGE_ZONED_DEVICE_DESCRIPTOR_0 = STORAGE_ZONED_DEVICE_DESCRIPTOR_0(),
    public var ZoneGroupCount: UInt = 0u,
    public var ZoneGroup: List<STORAGE_ZONE_GROUP> = List(1) { STORAGE_ZONE_GROUP() },
)

public data class STORAGE_ZONED_DEVICE_DESCRIPTOR_0(public var SequentialRequiredZone: STORAGE_ZONED_DEVICE_DESCRIPTOR_0_0 = STORAGE_ZONED_DEVICE_DESCRIPTOR_0_0(), public var SequentialPreferredZone: STORAGE_ZONED_DEVICE_DESCRIPTOR_0_1 = STORAGE_ZONED_DEVICE_DESCRIPTOR_0_1())

public data class STORAGE_ZONED_DEVICE_DESCRIPTOR_0_1(public var OptimalOpenZoneCount: UInt = 0u, public var Reserved: UInt = 0u)

public data class STORAGE_ZONED_DEVICE_DESCRIPTOR_0_0(
    public var MaxOpenZoneCount: UInt = 0u,
    public var UnrestrictedRead: Boolean = false,
    public var Reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_ZONED_DEVICE_DESCRIPTOR_0_0) return false
        if (this.MaxOpenZoneCount != other.MaxOpenZoneCount) return false
        if (this.UnrestrictedRead != other.UnrestrictedRead) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MaxOpenZoneCount.hashCode()
        result = 31 * result + this.UnrestrictedRead.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class STORAGE_ZONE_DESCRIPTOR(
    public var Size: UInt = 0u,
    public var ZoneType: STORAGE_ZONE_TYPES = 0,
    public var ZoneCondition: STORAGE_ZONE_CONDITION = 0,
    public var ResetWritePointerRecommend: Boolean = false,
    public var Reserved0: UByteArray = UByteArray(3),
    public var ZoneSize: ULong = 0uL,
    public var WritePointerOffset: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_ZONE_DESCRIPTOR) return false
        if (this.Size != other.Size) return false
        if (this.ZoneType != other.ZoneType) return false
        if (this.ZoneCondition != other.ZoneCondition) return false
        if (this.ResetWritePointerRecommend != other.ResetWritePointerRecommend) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.ZoneSize != other.ZoneSize) return false
        if (this.WritePointerOffset != other.WritePointerOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.ZoneType.hashCode()
        result = 31 * result + this.ZoneCondition.hashCode()
        result = 31 * result + this.ResetWritePointerRecommend.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.ZoneSize.hashCode()
        result = 31 * result + this.WritePointerOffset.hashCode()
        return result
    }
}

public data class STORAGE_ZONE_GROUP(
    public var ZoneCount: UInt = 0u,
    public var ZoneType: STORAGE_ZONE_TYPES = 0,
    public var ZoneSize: ULong = 0uL,
)

public data class STREAMS_ASSOCIATE_ID_INPUT_BUFFER(public var Flags: UInt = 0u, public var StreamId: UInt = 0u)

public data class STREAMS_QUERY_ID_OUTPUT_BUFFER(public var StreamId: UInt = 0u)

public data class STREAMS_QUERY_PARAMETERS_OUTPUT_BUFFER(
    public var OptimalWriteSize: UInt = 0u,
    public var StreamGranularitySize: UInt = 0u,
    public var StreamIdMin: UInt = 0u,
    public var StreamIdMax: UInt = 0u,
)

public data class STREAM_EXTENT_ENTRY(public var Flags: UInt = 0u, public var ExtentInformation: STREAM_EXTENT_ENTRY_0 = STREAM_EXTENT_ENTRY_0())

public data class STREAM_EXTENT_ENTRY_0(public var RetrievalPointers: RETRIEVAL_POINTERS_BUFFER = RETRIEVAL_POINTERS_BUFFER())

public data class STREAM_INFORMATION_ENTRY(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var StreamInformation: STREAM_INFORMATION_ENTRY_0 = STREAM_INFORMATION_ENTRY_0(),
)

public data class STREAM_INFORMATION_ENTRY_0(
    public var DesiredStorageClass: STREAM_INFORMATION_ENTRY_0_0 = STREAM_INFORMATION_ENTRY_0_0(),
    public var DataStream: STREAM_INFORMATION_ENTRY_0_1 = STREAM_INFORMATION_ENTRY_0_1(),
    public var Reparse: STREAM_INFORMATION_ENTRY_0_2 = STREAM_INFORMATION_ENTRY_0_2(),
    public var Ea: STREAM_INFORMATION_ENTRY_0_3 = STREAM_INFORMATION_ENTRY_0_3(),
)

public data class STREAM_INFORMATION_ENTRY_0_1(
    public var Length: UShort = 0u,
    public var Flags: UShort = 0u,
    public var Reserved: UInt = 0u,
    public var Vdl: ULong = 0uL,
)

public data class STREAM_INFORMATION_ENTRY_0_0(public var Class: FILE_STORAGE_TIER_CLASS = 0, public var Flags: UInt = 0u)

public data class STREAM_INFORMATION_ENTRY_0_3(
    public var Length: UShort = 0u,
    public var Flags: UShort = 0u,
    public var EaSize: UInt = 0u,
    public var EaInformationOffset: UInt = 0u,
)

public data class STREAM_INFORMATION_ENTRY_0_2(
    public var Length: UShort = 0u,
    public var Flags: UShort = 0u,
    public var ReparseDataSize: UInt = 0u,
    public var ReparseDataOffset: UInt = 0u,
)

public data class STREAM_LAYOUT_ENTRY(
    public var Version: UInt = 0u,
    public var NextStreamOffset: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ExtentInformationOffset: UInt = 0u,
    public var AllocationSize: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var StreamInformationOffset: UInt = 0u,
    public var AttributeTypeCode: UInt = 0u,
    public var AttributeFlags: UInt = 0u,
    public var StreamIdentifierLength: UInt = 0u,
    public var StreamIdentifier: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STREAM_LAYOUT_ENTRY) return false
        if (this.Version != other.Version) return false
        if (this.NextStreamOffset != other.NextStreamOffset) return false
        if (this.Flags != other.Flags) return false
        if (this.ExtentInformationOffset != other.ExtentInformationOffset) return false
        if (this.AllocationSize != other.AllocationSize) return false
        if (this.EndOfFile != other.EndOfFile) return false
        if (this.StreamInformationOffset != other.StreamInformationOffset) return false
        if (this.AttributeTypeCode != other.AttributeTypeCode) return false
        if (this.AttributeFlags != other.AttributeFlags) return false
        if (this.StreamIdentifierLength != other.StreamIdentifierLength) return false
        if (!this.StreamIdentifier.contentEquals(other.StreamIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.NextStreamOffset.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.ExtentInformationOffset.hashCode()
        result = 31 * result + this.AllocationSize.hashCode()
        result = 31 * result + this.EndOfFile.hashCode()
        result = 31 * result + this.StreamInformationOffset.hashCode()
        result = 31 * result + this.AttributeTypeCode.hashCode()
        result = 31 * result + this.AttributeFlags.hashCode()
        result = 31 * result + this.StreamIdentifierLength.hashCode()
        result = 31 * result + this.StreamIdentifier.contentHashCode()
        return result
    }
}

public data class TAPE_GET_STATISTICS(public var Operation: UInt = 0u)

public data class TAPE_STATISTICS(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var RecoveredWrites: Long = 0L,
    public var UnrecoveredWrites: Long = 0L,
    public var RecoveredReads: Long = 0L,
    public var UnrecoveredReads: Long = 0L,
    public var CompressionRatioReads: UByte = 0u,
    public var CompressionRatioWrites: UByte = 0u,
)

public data class TXFS_CREATE_MINIVERSION_INFO(
    public var StructureVersion: UShort = 0u,
    public var StructureLength: UShort = 0u,
    public var BaseVersion: UInt = 0u,
    public var MiniVersion: UShort = 0u,
)

public data class TXFS_GET_METADATA_INFO_OUT(
    public var TxfFileId: TXFS_GET_METADATA_INFO_OUT_0 = TXFS_GET_METADATA_INFO_OUT_0(),
    public var LockingTransaction: GUID = GUID(),
    public var LastLsn: ULong = 0uL,
    public var TransactionState: UInt = 0u,
)

public data class TXFS_GET_METADATA_INFO_OUT_0(public var LowPart: Long = 0L, public var HighPart: Long = 0L)

public data class TXFS_GET_TRANSACTED_VERSION(
    public var ThisBaseVersion: UInt = 0u,
    public var LatestVersion: UInt = 0u,
    public var ThisMiniVersion: UShort = 0u,
    public var FirstMiniVersion: UShort = 0u,
    public var LatestMiniVersion: UShort = 0u,
)

public data class TXFS_LIST_TRANSACTIONS(public var NumberOfTransactions: ULong = 0uL, public var BufferSizeRequired: ULong = 0uL)

public data class TXFS_LIST_TRANSACTIONS_ENTRY(
    public var TransactionId: GUID = GUID(),
    public var TransactionState: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var Reserved3: Long = 0L,
)

public data class TXFS_LIST_TRANSACTION_LOCKED_FILES(
    public var KtmTransaction: GUID = GUID(),
    public var NumberOfFiles: ULong = 0uL,
    public var BufferSizeRequired: ULong = 0uL,
    public var Offset: ULong = 0uL,
)

public data class TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY(
    public var Offset: ULong = 0uL,
    public var NameFlags: UInt = 0u,
    public var FileId: Long = 0L,
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var Reserved3: Long = 0L,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY) return false
        if (this.Offset != other.Offset) return false
        if (this.NameFlags != other.NameFlags) return false
        if (this.FileId != other.FileId) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.Reserved3 != other.Reserved3) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Offset.hashCode()
        result = 31 * result + this.NameFlags.hashCode()
        result = 31 * result + this.FileId.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.Reserved3.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class TXFS_MODIFY_RM(
    public var Flags: TXFS_RMF_LAGS = 0u,
    public var LogContainerCountMax: UInt = 0u,
    public var LogContainerCountMin: UInt = 0u,
    public var LogContainerCount: UInt = 0u,
    public var LogGrowthIncrement: UInt = 0u,
    public var LogAutoShrinkPercentage: UInt = 0u,
    public var Reserved: ULong = 0uL,
    public var LoggingMode: UShort = 0u,
)

public class TXFS_QUERY_RM_INFORMATION(
    public var BytesRequired: UInt = 0u,
    public var TailLsn: ULong = 0uL,
    public var CurrentLsn: ULong = 0uL,
    public var ArchiveTailLsn: ULong = 0uL,
    public var LogContainerSize: ULong = 0uL,
    public var HighestVirtualClock: Long = 0L,
    public var LogContainerCount: UInt = 0u,
    public var LogContainerCountMax: UInt = 0u,
    public var LogContainerCountMin: UInt = 0u,
    public var LogGrowthIncrement: UInt = 0u,
    public var LogAutoShrinkPercentage: UInt = 0u,
    public var Flags: TXFS_RMF_LAGS = 0u,
    public var LoggingMode: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var RmState: UInt = 0u,
    public var LogCapacity: ULong = 0uL,
    public var LogFree: ULong = 0uL,
    public var TopsSize: ULong = 0uL,
    public var TopsUsed: ULong = 0uL,
    public var TransactionCount: ULong = 0uL,
    public var OnePCCount: ULong = 0uL,
    public var TwoPCCount: ULong = 0uL,
    public var NumberLogFileFull: ULong = 0uL,
    public var OldestTransactionAge: ULong = 0uL,
    public var RMName: GUID = GUID(),
    public var TmLogPathOffset: UInt = 0u,
)

public data class TXFS_READ_BACKUP_INFORMATION_OUT(public var Anonymous: TXFS_READ_BACKUP_INFORMATION_OUT_0 = TXFS_READ_BACKUP_INFORMATION_OUT_0())

public data class TXFS_READ_BACKUP_INFORMATION_OUT_0(public var BufferLength: UInt = 0u, public var Buffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TXFS_READ_BACKUP_INFORMATION_OUT_0) return false
        if (this.BufferLength != other.BufferLength) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BufferLength.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class TXFS_ROLLFORWARD_REDO_INFORMATION(
    public var LastVirtualClock: Long = 0L,
    public var LastRedoLsn: ULong = 0uL,
    public var HighestRecoveryLsn: ULong = 0uL,
    public var Flags: UInt = 0u,
)

public data class TXFS_SAVEPOINT_INFORMATION(
    public var KtmTransaction: Foundation.HANDLE = Foundation.HANDLE(),
    public var ActionCode: UInt = 0u,
    public var SavepointId: UInt = 0u,
)

public data class TXFS_START_RM_INFORMATION(
    public var Flags: UInt = 0u,
    public var LogContainerSize: ULong = 0uL,
    public var LogContainerCountMin: UInt = 0u,
    public var LogContainerCountMax: UInt = 0u,
    public var LogGrowthIncrement: UInt = 0u,
    public var LogAutoShrinkPercentage: UInt = 0u,
    public var TmLogPathOffset: UInt = 0u,
    public var TmLogPathLength: UShort = 0u,
    public var LoggingMode: UShort = 0u,
    public var LogPathLength: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var LogPath: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TXFS_START_RM_INFORMATION) return false
        if (this.Flags != other.Flags) return false
        if (this.LogContainerSize != other.LogContainerSize) return false
        if (this.LogContainerCountMin != other.LogContainerCountMin) return false
        if (this.LogContainerCountMax != other.LogContainerCountMax) return false
        if (this.LogGrowthIncrement != other.LogGrowthIncrement) return false
        if (this.LogAutoShrinkPercentage != other.LogAutoShrinkPercentage) return false
        if (this.TmLogPathOffset != other.TmLogPathOffset) return false
        if (this.TmLogPathLength != other.TmLogPathLength) return false
        if (this.LoggingMode != other.LoggingMode) return false
        if (this.LogPathLength != other.LogPathLength) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.LogPath.contentEquals(other.LogPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.LogContainerSize.hashCode()
        result = 31 * result + this.LogContainerCountMin.hashCode()
        result = 31 * result + this.LogContainerCountMax.hashCode()
        result = 31 * result + this.LogGrowthIncrement.hashCode()
        result = 31 * result + this.LogAutoShrinkPercentage.hashCode()
        result = 31 * result + this.TmLogPathOffset.hashCode()
        result = 31 * result + this.TmLogPathLength.hashCode()
        result = 31 * result + this.LoggingMode.hashCode()
        result = 31 * result + this.LogPathLength.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.LogPath.contentHashCode()
        return result
    }
}

public data class TXFS_TRANSACTION_ACTIVE_INFO(public var TransactionsActiveAtSnapshot: Boolean = false)

public data class TXFS_WRITE_BACKUP_INFORMATION(public var Buffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TXFS_WRITE_BACKUP_INFORMATION) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Buffer.contentHashCode()
    }
}

public data class USN_JOURNAL_DATA_V0(
    public var UsnJournalID: ULong = 0uL,
    public var FirstUsn: Long = 0L,
    public var NextUsn: Long = 0L,
    public var LowestValidUsn: Long = 0L,
    public var MaxUsn: Long = 0L,
    public var MaximumSize: ULong = 0uL,
    public var AllocationDelta: ULong = 0uL,
)

public data class USN_JOURNAL_DATA_V1(
    public var UsnJournalID: ULong = 0uL,
    public var FirstUsn: Long = 0L,
    public var NextUsn: Long = 0L,
    public var LowestValidUsn: Long = 0L,
    public var MaxUsn: Long = 0L,
    public var MaximumSize: ULong = 0uL,
    public var AllocationDelta: ULong = 0uL,
    public var MinSupportedMajorVersion: UShort = 0u,
    public var MaxSupportedMajorVersion: UShort = 0u,
)

public data class USN_JOURNAL_DATA_V2(
    public var UsnJournalID: ULong = 0uL,
    public var FirstUsn: Long = 0L,
    public var NextUsn: Long = 0L,
    public var LowestValidUsn: Long = 0L,
    public var MaxUsn: Long = 0L,
    public var MaximumSize: ULong = 0uL,
    public var AllocationDelta: ULong = 0uL,
    public var MinSupportedMajorVersion: UShort = 0u,
    public var MaxSupportedMajorVersion: UShort = 0u,
    public var Flags: UInt = 0u,
    public var RangeTrackChunkSize: ULong = 0uL,
    public var RangeTrackFileSizeThreshold: Long = 0L,
)

public data class USN_RANGE_TRACK_OUTPUT(public var Usn: Long = 0L)

public data class USN_RECORD_COMMON_HEADER(
    public var RecordLength: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
)

public data class USN_RECORD_EXTENT(public var Offset: Long = 0L, public var Length: Long = 0L)

public data class USN_RECORD_UNION(
    public var Header: USN_RECORD_COMMON_HEADER = USN_RECORD_COMMON_HEADER(),
    public var V2: USN_RECORD_V2 = USN_RECORD_V2(),
    public var V3: USN_RECORD_V3 = USN_RECORD_V3(),
    public var V4: USN_RECORD_V4 = USN_RECORD_V4(),
)

public data class USN_RECORD_V2(
    public var RecordLength: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var FileReferenceNumber: ULong = 0uL,
    public var ParentFileReferenceNumber: ULong = 0uL,
    public var Usn: Long = 0L,
    public var TimeStamp: Long = 0L,
    public var Reason: UInt = 0u,
    public var SourceInfo: UInt = 0u,
    public var SecurityId: UInt = 0u,
    public var FileAttributes: UInt = 0u,
    public var FileNameLength: UShort = 0u,
    public var FileNameOffset: UShort = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USN_RECORD_V2) return false
        if (this.RecordLength != other.RecordLength) return false
        if (this.MajorVersion != other.MajorVersion) return false
        if (this.MinorVersion != other.MinorVersion) return false
        if (this.FileReferenceNumber != other.FileReferenceNumber) return false
        if (this.ParentFileReferenceNumber != other.ParentFileReferenceNumber) return false
        if (this.Usn != other.Usn) return false
        if (this.TimeStamp != other.TimeStamp) return false
        if (this.Reason != other.Reason) return false
        if (this.SourceInfo != other.SourceInfo) return false
        if (this.SecurityId != other.SecurityId) return false
        if (this.FileAttributes != other.FileAttributes) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (this.FileNameOffset != other.FileNameOffset) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RecordLength.hashCode()
        result = 31 * result + this.MajorVersion.hashCode()
        result = 31 * result + this.MinorVersion.hashCode()
        result = 31 * result + this.FileReferenceNumber.hashCode()
        result = 31 * result + this.ParentFileReferenceNumber.hashCode()
        result = 31 * result + this.Usn.hashCode()
        result = 31 * result + this.TimeStamp.hashCode()
        result = 31 * result + this.Reason.hashCode()
        result = 31 * result + this.SourceInfo.hashCode()
        result = 31 * result + this.SecurityId.hashCode()
        result = 31 * result + this.FileAttributes.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileNameOffset.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class USN_RECORD_V3(
    public var RecordLength: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var FileReferenceNumber: Storage.FileSystem.FILE_ID_128 = Storage.FileSystem.FILE_ID_128(),
    public var ParentFileReferenceNumber: Storage.FileSystem.FILE_ID_128 = Storage.FileSystem.FILE_ID_128(),
    public var Usn: Long = 0L,
    public var TimeStamp: Long = 0L,
    public var Reason: UInt = 0u,
    public var SourceInfo: UInt = 0u,
    public var SecurityId: UInt = 0u,
    public var FileAttributes: UInt = 0u,
    public var FileNameLength: UShort = 0u,
    public var FileNameOffset: UShort = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USN_RECORD_V3) return false
        if (this.RecordLength != other.RecordLength) return false
        if (this.MajorVersion != other.MajorVersion) return false
        if (this.MinorVersion != other.MinorVersion) return false
        if (this.FileReferenceNumber != other.FileReferenceNumber) return false
        if (this.ParentFileReferenceNumber != other.ParentFileReferenceNumber) return false
        if (this.Usn != other.Usn) return false
        if (this.TimeStamp != other.TimeStamp) return false
        if (this.Reason != other.Reason) return false
        if (this.SourceInfo != other.SourceInfo) return false
        if (this.SecurityId != other.SecurityId) return false
        if (this.FileAttributes != other.FileAttributes) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (this.FileNameOffset != other.FileNameOffset) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RecordLength.hashCode()
        result = 31 * result + this.MajorVersion.hashCode()
        result = 31 * result + this.MinorVersion.hashCode()
        result = 31 * result + this.FileReferenceNumber.hashCode()
        result = 31 * result + this.ParentFileReferenceNumber.hashCode()
        result = 31 * result + this.Usn.hashCode()
        result = 31 * result + this.TimeStamp.hashCode()
        result = 31 * result + this.Reason.hashCode()
        result = 31 * result + this.SourceInfo.hashCode()
        result = 31 * result + this.SecurityId.hashCode()
        result = 31 * result + this.FileAttributes.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileNameOffset.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class USN_RECORD_V4(
    public var Header: USN_RECORD_COMMON_HEADER = USN_RECORD_COMMON_HEADER(),
    public var FileReferenceNumber: Storage.FileSystem.FILE_ID_128 = Storage.FileSystem.FILE_ID_128(),
    public var ParentFileReferenceNumber: Storage.FileSystem.FILE_ID_128 = Storage.FileSystem.FILE_ID_128(),
    public var Usn: Long = 0L,
    public var Reason: UInt = 0u,
    public var SourceInfo: USN_SOURCE_INFO_ID = 0u,
    public var RemainingExtents: UInt = 0u,
    public var NumberOfExtents: UShort = 0u,
    public var ExtentSize: UShort = 0u,
    public var Extents: List<USN_RECORD_EXTENT> = List(1) { USN_RECORD_EXTENT() },
)
