@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileId128
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.StorageBusType
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.VirtualStorageType

public data class PersistentReserveCommand01(
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var parameterList: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersistentReserveCommand01) return false
        if (this.bitfield1 != other.bitfield1) return false
        if (this.bitfield2 != other.bitfield2) return false
        if (!this.parameterList.contentEquals(other.parameterList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield1.hashCode()
        result = 31 * result + this.bitfield2.hashCode()
        result = 31 * result + this.parameterList.contentHashCode()
        return result
    }
}

public data class PhysicalElementStatus(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var descriptorCount: UInt = 0u,
    public var returnedDescriptorCount: UInt = 0u,
    public var elementIdentifierBeingDepoped: UInt = 0u,
    public var reserved: UInt = 0u,
    public var descriptors: List<PhysicalElementStatusDescriptor> = List(1) { PhysicalElementStatusDescriptor() },
)

public data class PhysicalElementStatusDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var elementIdentifier: UInt = 0u,
    public var physicalElementType: UByte = 0u,
    public var physicalElementHealth: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(2),
    public var associatedCapacity: ULong = 0uL,
    public var reserved2: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PhysicalElementStatusDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.elementIdentifier != other.elementIdentifier) return false
        if (this.physicalElementType != other.physicalElementType) return false
        if (this.physicalElementHealth != other.physicalElementHealth) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.associatedCapacity != other.associatedCapacity) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.elementIdentifier.hashCode()
        result = 31 * result + this.physicalElementType.hashCode()
        result = 31 * result + this.physicalElementHealth.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.associatedCapacity.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class PhysicalElementStatusRequest(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var startingElement: UInt = 0u,
    public var filter: UByte = 0u,
    public var reportType: UByte = 0u,
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PhysicalElementStatusRequest) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.startingElement != other.startingElement) return false
        if (this.filter != other.filter) return false
        if (this.reportType != other.reportType) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.startingElement.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.reportType.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class PlexReadDataRequest(
    public var byteOffset: Long = 0L,
    public var byteLength: UInt = 0u,
    public var plexNumber: UInt = 0u,
)

public data class PreventMediaRemoval(public var preventMediaRemoval: Boolean = false)

public data class QueryBadRangesInput(
    public var flags: UInt = 0u,
    public var numRanges: UInt = 0u,
    public var ranges: List<QueryBadRangesInputRange> = List(1) { QueryBadRangesInputRange() },
)

public data class QueryBadRangesInputRange(public var startOffset: ULong = 0uL, public var lengthInBytes: ULong = 0uL)

public data class QueryBadRangesOutput(
    public var flags: UInt = 0u,
    public var numBadRanges: UInt = 0u,
    public var nextOffsetToLookUp: ULong = 0uL,
    public var badRanges: List<QueryBadRangesOutputRange> = List(1) { QueryBadRangesOutputRange() },
)

public data class QueryBadRangesOutputRange(
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var startOffset: ULong = 0uL,
    public var lengthInBytes: ULong = 0uL,
)

public data class QueryFileLayoutInput(
    public var anonymous: QueryFileLayoutInput0 = QueryFileLayoutInput0(),
    public var flags: UInt = 0u,
    public var filterType: QueryFileLayoutFilterType = 0,
    public var reserved: UInt = 0u,
    public var filter: QueryFileLayoutInput1 = QueryFileLayoutInput1(),
)

public data class QueryFileLayoutInput0(public var filterEntryCount: UInt = 0u, public var numberOfPairs: UInt = 0u)

public data class QueryFileLayoutInput1(
    public var clusterRanges: List<ClusterRange> = List(1) { ClusterRange() },
    public var fileReferenceRanges: List<FileReferenceRange> = List(1) { FileReferenceRange() },
    public var storageReserveIds: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QueryFileLayoutInput1) return false
        if (this.clusterRanges != other.clusterRanges) return false
        if (this.fileReferenceRanges != other.fileReferenceRanges) return false
        if (!this.storageReserveIds.contentEquals(other.storageReserveIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clusterRanges.hashCode()
        result = 31 * result + this.fileReferenceRanges.hashCode()
        result = 31 * result + this.storageReserveIds.contentHashCode()
        return result
    }
}

public data class QueryFileLayoutOutput(
    public var fileEntryCount: UInt = 0u,
    public var firstFileOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class ReadElementAddressInfo(public var numberOfElements: UInt = 0u, public var elementStatus: List<ChangerElementStatus> = List(1) { ChangerElementStatus() })

public data class ReadFileUsnData(public var minMajorVersion: UShort = 0u, public var maxMajorVersion: UShort = 0u)

public data class ReadUsnJournalDataV0(
    public var startUsn: Long = 0L,
    public var reasonMask: UInt = 0u,
    public var returnOnlyOnClose: UInt = 0u,
    public var timeout: ULong = 0uL,
    public var bytesToWaitFor: ULong = 0uL,
    public var usnJournalID: ULong = 0uL,
)

public data class ReadUsnJournalDataV1(
    public var startUsn: Long = 0L,
    public var reasonMask: UInt = 0u,
    public var returnOnlyOnClose: UInt = 0u,
    public var timeout: ULong = 0uL,
    public var bytesToWaitFor: ULong = 0uL,
    public var usnJournalID: ULong = 0uL,
    public var minMajorVersion: UShort = 0u,
    public var maxMajorVersion: UShort = 0u,
)

public data class ReassignBlocks(
    public var reserved: UShort = 0u,
    public var count: UShort = 0u,
    public var blockNumber: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReassignBlocks) return false
        if (this.reserved != other.reserved) return false
        if (this.count != other.count) return false
        if (!this.blockNumber.contentEquals(other.blockNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.blockNumber.contentHashCode()
        return result
    }
}

public data class ReassignBlocksEx(
    public var reserved: UShort = 0u,
    public var count: UShort = 0u,
    public var blockNumber: LongArray = LongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReassignBlocksEx) return false
        if (this.reserved != other.reserved) return false
        if (this.count != other.count) return false
        if (!this.blockNumber.contentEquals(other.blockNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.blockNumber.contentHashCode()
        return result
    }
}

public data class RefsSmrVolumeGcParameters(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var action: RefsSmrVolumeGcAction = 0,
    public var method: RefsSmrVolumeGcMethod = 0,
    public var ioGranularity: UInt = 0u,
    public var compressionFormat: UInt = 0u,
    public var unused: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsSmrVolumeGcParameters) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.action != other.action) return false
        if (this.method != other.method) return false
        if (this.ioGranularity != other.ioGranularity) return false
        if (this.compressionFormat != other.compressionFormat) return false
        if (!this.unused.contentEquals(other.unused)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.method.hashCode()
        result = 31 * result + this.ioGranularity.hashCode()
        result = 31 * result + this.compressionFormat.hashCode()
        result = 31 * result + this.unused.contentHashCode()
        return result
    }
}

public data class RefsSmrVolumeInfoOutput(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var sizeOfRandomlyWritableTier: Long = 0L,
    public var freeSpaceInRandomlyWritableTier: Long = 0L,
    public var sizeofSMRTier: Long = 0L,
    public var freeSpaceInSMRTier: Long = 0L,
    public var usableFreeSpaceInSMRTier: Long = 0L,
    public var volumeGcState: RefsSmrVolumeGcState = 0,
    public var volumeGcLastStatus: UInt = 0u,
    public var currentGcBandFillPercentage: UInt = 0u,
    public var unused: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsSmrVolumeInfoOutput) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.sizeOfRandomlyWritableTier != other.sizeOfRandomlyWritableTier) return false
        if (this.freeSpaceInRandomlyWritableTier != other.freeSpaceInRandomlyWritableTier) return false
        if (this.sizeofSMRTier != other.sizeofSMRTier) return false
        if (this.freeSpaceInSMRTier != other.freeSpaceInSMRTier) return false
        if (this.usableFreeSpaceInSMRTier != other.usableFreeSpaceInSMRTier) return false
        if (this.volumeGcState != other.volumeGcState) return false
        if (this.volumeGcLastStatus != other.volumeGcLastStatus) return false
        if (this.currentGcBandFillPercentage != other.currentGcBandFillPercentage) return false
        if (!this.unused.contentEquals(other.unused)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sizeOfRandomlyWritableTier.hashCode()
        result = 31 * result + this.freeSpaceInRandomlyWritableTier.hashCode()
        result = 31 * result + this.sizeofSMRTier.hashCode()
        result = 31 * result + this.freeSpaceInSMRTier.hashCode()
        result = 31 * result + this.usableFreeSpaceInSMRTier.hashCode()
        result = 31 * result + this.volumeGcState.hashCode()
        result = 31 * result + this.volumeGcLastStatus.hashCode()
        result = 31 * result + this.currentGcBandFillPercentage.hashCode()
        result = 31 * result + this.unused.contentHashCode()
        return result
    }
}

public class RefsVolumeDataBuffer(
    public var byteCount: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var bytesPerPhysicalSector: UInt = 0u,
    public var volumeSerialNumber: Long = 0L,
    public var numberSectors: Long = 0L,
    public var totalClusters: Long = 0L,
    public var freeClusters: Long = 0L,
    public var totalReserved: Long = 0L,
    public var bytesPerSector: UInt = 0u,
    public var bytesPerCluster: UInt = 0u,
    public var maximumSizeOfResidentFile: Long = 0L,
    public var fastTierDataFillRatio: UShort = 0u,
    public var slowTierDataFillRatio: UShort = 0u,
    public var destagesFastTierToSlowTierRate: UInt = 0u,
    public var metadataChecksumType: UShort = 0u,
    public var reserved0: UByteArray = UByteArray(6),
    public var reserved: LongArray = LongArray(8),
)

public data class RemoveElementAndTruncateRequest(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var requestCapacity: ULong = 0uL,
    public var elementIdentifier: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class RepairCopiesInput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileOffset: Long = 0L,
    public var length: UInt = 0u,
    public var sourceCopy: UInt = 0u,
    public var numberOfRepairCopies: UInt = 0u,
    public var repairCopies: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RepairCopiesInput) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.length != other.length) return false
        if (this.sourceCopy != other.sourceCopy) return false
        if (this.numberOfRepairCopies != other.numberOfRepairCopies) return false
        if (!this.repairCopies.contentEquals(other.repairCopies)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fileOffset.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.sourceCopy.hashCode()
        result = 31 * result + this.numberOfRepairCopies.hashCode()
        result = 31 * result + this.repairCopies.contentHashCode()
        return result
    }
}

public data class RepairCopiesOutput(
    public var size: UInt = 0u,
    public var status: UInt = 0u,
    public var resumeFileOffset: Long = 0L,
)

public data class RequestOplockInputBuffer(
    public var structureVersion: UShort = 0u,
    public var structureLength: UShort = 0u,
    public var requestedOplockLevel: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class RequestOplockOutputBuffer(
    public var structureVersion: UShort = 0u,
    public var structureLength: UShort = 0u,
    public var originalOplockLevel: UInt = 0u,
    public var newOplockLevel: UInt = 0u,
    public var flags: UInt = 0u,
    public var accessMode: UInt = 0u,
    public var shareMode: UShort = 0u,
)

public data class RequestRawEncryptedData(public var fileOffset: Long = 0L, public var length: UInt = 0u)

public data class RetrievalPointersAndRefcountBuffer(
    public var extentCount: UInt = 0u,
    public var startingVcn: Long = 0L,
    public var extents: List<RetrievalPointersAndRefcountBuffer0> = List(1) { RetrievalPointersAndRefcountBuffer0() },
)

public data class RetrievalPointersAndRefcountBuffer0(
    public var nextVcn: Long = 0L,
    public var lcn: Long = 0L,
    public var referenceCount: UInt = 0u,
)

public data class RetrievalPointersBuffer(
    public var extentCount: UInt = 0u,
    public var startingVcn: Long = 0L,
    public var extents: List<RetrievalPointersBuffer0> = List(1) { RetrievalPointersBuffer0() },
)

public data class RetrievalPointersBuffer0(public var nextVcn: Long = 0L, public var lcn: Long = 0L)

public data class RetrievalPointerBase(public var fileAreaOffset: Long = 0L)

public data class RetrievalPointerCount(public var extentCount: UInt = 0u)

public data class ScmBusDedicatedMemoryDevicesInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceCount: UInt = 0u,
    public var devices: List<ScmBusDedicatedMemoryDeviceInfo> = List(1) { ScmBusDedicatedMemoryDeviceInfo() },
)

public data class ScmBusDedicatedMemoryDeviceInfo(
    public var deviceGuid: Guid = Guid(),
    public var deviceNumber: UInt = 0u,
    public var flags: ScmBusDedicatedMemoryDeviceInfo0 = ScmBusDedicatedMemoryDeviceInfo0(),
    public var deviceSize: ULong = 0uL,
)

public data class ScmBusDedicatedMemoryDeviceInfo0(public var bitfield: UInt = 0u)

public data class ScmBusDedicatedMemoryState(public var activateState: Boolean = false)

public data class ScmBusPropertyQuery(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var propertyId: ScmBusPropertyId = 0,
    public var queryType: ScmBusQueryType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmBusPropertyQuery) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.propertyId != other.propertyId) return false
        if (this.queryType != other.queryType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.propertyId.hashCode()
        result = 31 * result + this.queryType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }
}

public data class ScmBusPropertySet(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var propertyId: ScmBusPropertyId = 0,
    public var setType: ScmBusSetType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmBusPropertySet) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.propertyId != other.propertyId) return false
        if (this.setType != other.setType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.propertyId.hashCode()
        result = 31 * result + this.setType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }
}

public data class ScmBusRuntimeFwActivationInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var runtimeFwActivationSupported: Boolean = false,
    public var firmwareActivationState: ScmBusFirmwareActivationState = 0,
    public var firmwareActivationCapability: ScmBusRuntimeFwActivationInfo0 = ScmBusRuntimeFwActivationInfo0(),
    public var estimatedFirmwareActivationTimeInUSecs: ULong = 0uL,
    public var estimatedProcessorAccessQuiesceTimeInUSecs: ULong = 0uL,
    public var estimatedIOAccessQuiesceTimeInUSecs: ULong = 0uL,
    public var platformSupportedMaxIOAccessQuiesceTimeInUSecs: ULong = 0uL,
)

public data class ScmBusRuntimeFwActivationInfo0(public var bitfield: UInt = 0u)

public data class ScmInterleavedPdInfo(public var deviceHandle: UInt = 0u, public var deviceGuid: Guid = Guid())

public data class ScmLdInterleaveSetInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var interleaveSetSize: UInt = 0u,
    public var interleaveSet: List<ScmInterleavedPdInfo> = List(1) { ScmInterleavedPdInfo() },
)

public data class ScmLogicalDevices(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceCount: UInt = 0u,
    public var devices: List<ScmLogicalDeviceInstance> = List(1) { ScmLogicalDeviceInstance() },
)

public data class ScmLogicalDeviceInstance(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceGuid: Guid = Guid(),
    public var symbolicLink: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmLogicalDeviceInstance) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.deviceGuid != other.deviceGuid) return false
        if (!this.symbolicLink.contentEquals(other.symbolicLink)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.deviceGuid.hashCode()
        result = 31 * result + this.symbolicLink.contentHashCode()
        return result
    }
}

public data class ScmPdDescriptorHeader(public var version: UInt = 0u, public var size: UInt = 0u)

public data class ScmPdDeviceHandle(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceGuid: Guid = Guid(),
    public var deviceHandle: UInt = 0u,
)

public class ScmPdDeviceInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceGuid: Guid = Guid(),
    public var unsafeShutdownCount: UInt = 0u,
    public var persistentMemorySizeInBytes: ULong = 0uL,
    public var volatileMemorySizeInBytes: ULong = 0uL,
    public var totalMemorySizeInBytes: ULong = 0uL,
    public var slotNumber: UInt = 0u,
    public var deviceHandle: UInt = 0u,
    public var physicalId: UShort = 0u,
    public var numberOfFormatInterfaceCodes: UByte = 0u,
    public var formatInterfaceCodes: UShortArray = UShortArray(8),
    public var vendorId: UInt = 0u,
    public var productId: UInt = 0u,
    public var subsystemDeviceId: UInt = 0u,
    public var subsystemVendorId: UInt = 0u,
    public var manufacturingLocation: UByte = 0u,
    public var manufacturingWeek: UByte = 0u,
    public var manufacturingYear: UByte = 0u,
    public var serialNumber4Byte: UInt = 0u,
    public var serialNumberLengthInChars: UInt = 0u,
    public var serialNumber: ByteArray = ByteArray(1),
)

public data class ScmPdDeviceSpecificInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numberOfProperties: UInt = 0u,
    public var deviceSpecificProperties: List<ScmPdDeviceSpecificProperty> = List(1) { ScmPdDeviceSpecificProperty() },
)

public data class ScmPdDeviceSpecificProperty(public var name: UShortArray = UShortArray(128), public var value: Long = 0L) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdDeviceSpecificProperty) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }
}

public data class ScmPdFirmwareActivate(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var slot: UByte = 0u,
)

public data class ScmPdFirmwareDownload(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var slot: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var offset: ULong = 0uL,
    public var firmwareImageSizeInBytes: UInt = 0u,
    public var firmwareImage: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdFirmwareDownload) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.slot != other.slot) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.offset != other.offset) return false
        if (this.firmwareImageSizeInBytes != other.firmwareImageSizeInBytes) return false
        if (!this.firmwareImage.contentEquals(other.firmwareImage)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.slot.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.firmwareImageSizeInBytes.hashCode()
        result = 31 * result + this.firmwareImage.contentHashCode()
        return result
    }
}

public data class ScmPdFirmwareInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var activeSlot: UByte = 0u,
    public var nextActiveSlot: UByte = 0u,
    public var slotCount: UByte = 0u,
    public var slots: List<ScmPdFirmwareSlotInfo> = List(1) { ScmPdFirmwareSlotInfo() },
)

public data class ScmPdFirmwareSlotInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var slotNumber: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(6),
    public var revision: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdFirmwareSlotInfo) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.revision.contentEquals(other.revision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.slotNumber.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.revision.contentHashCode()
        return result
    }
}

public data class ScmPdFruIdString(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var identifierSize: UInt = 0u,
    public var identifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdFruIdString) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.identifierSize != other.identifierSize) return false
        if (!this.identifier.contentEquals(other.identifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.identifierSize.hashCode()
        result = 31 * result + this.identifier.contentHashCode()
        return result
    }
}

public data class ScmPdHealthNotificationData(public var deviceGuid: Guid = Guid())

public data class ScmPdLocationString(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var location: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdLocationString) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (!this.location.contentEquals(other.location)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.location.contentHashCode()
        return result
    }
}

public data class ScmPdManagementStatus(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var health: ScmPdHealthStatus = 0,
    public var numberOfOperationalStatus: UInt = 0u,
    public var numberOfAdditionalReasons: UInt = 0u,
    public var operationalStatus: IntArray = IntArray(16),
    public var additionalReasons: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdManagementStatus) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.health != other.health) return false
        if (this.numberOfOperationalStatus != other.numberOfOperationalStatus) return false
        if (this.numberOfAdditionalReasons != other.numberOfAdditionalReasons) return false
        if (!this.operationalStatus.contentEquals(other.operationalStatus)) return false
        if (!this.additionalReasons.contentEquals(other.additionalReasons)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.health.hashCode()
        result = 31 * result + this.numberOfOperationalStatus.hashCode()
        result = 31 * result + this.numberOfAdditionalReasons.hashCode()
        result = 31 * result + this.operationalStatus.contentHashCode()
        result = 31 * result + this.additionalReasons.contentHashCode()
        return result
    }
}

public data class ScmPdPassthroughInput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var protocolGuid: Guid = Guid(),
    public var dataSize: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPassthroughInput) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.protocolGuid != other.protocolGuid) return false
        if (this.dataSize != other.dataSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.protocolGuid.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class ScmPdPassthroughInvdimmInput(
    public var opcode: UInt = 0u,
    public var opcodeParametersLength: UInt = 0u,
    public var opcodeParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPassthroughInvdimmInput) return false
        if (this.opcode != other.opcode) return false
        if (this.opcodeParametersLength != other.opcodeParametersLength) return false
        if (!this.opcodeParameters.contentEquals(other.opcodeParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.opcode.hashCode()
        result = 31 * result + this.opcodeParametersLength.hashCode()
        result = 31 * result + this.opcodeParameters.contentHashCode()
        return result
    }
}

public data class ScmPdPassthroughInvdimmOutput(
    public var generalStatus: UShort = 0u,
    public var extendedStatus: UShort = 0u,
    public var outputDataLength: UInt = 0u,
    public var outputData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPassthroughInvdimmOutput) return false
        if (this.generalStatus != other.generalStatus) return false
        if (this.extendedStatus != other.extendedStatus) return false
        if (this.outputDataLength != other.outputDataLength) return false
        if (!this.outputData.contentEquals(other.outputData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.generalStatus.hashCode()
        result = 31 * result + this.extendedStatus.hashCode()
        result = 31 * result + this.outputDataLength.hashCode()
        result = 31 * result + this.outputData.contentHashCode()
        return result
    }
}

public data class ScmPdPassthroughOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var protocolGuid: Guid = Guid(),
    public var dataSize: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPassthroughOutput) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.protocolGuid != other.protocolGuid) return false
        if (this.dataSize != other.dataSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.protocolGuid.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class ScmPdPropertyQuery(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var propertyId: ScmPdPropertyId = 0,
    public var queryType: ScmPdQueryType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPropertyQuery) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.propertyId != other.propertyId) return false
        if (this.queryType != other.queryType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.propertyId.hashCode()
        result = 31 * result + this.queryType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }
}

public data class ScmPdPropertySet(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var propertyId: ScmPdPropertyId = 0,
    public var setType: ScmPdSetType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPdPropertySet) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.propertyId != other.propertyId) return false
        if (this.setType != other.setType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.propertyId.hashCode()
        result = 31 * result + this.setType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }
}

public data class ScmPdReinitializeMediaInput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var options: ScmPdReinitializeMediaInput0 = ScmPdReinitializeMediaInput0(),
)

public data class ScmPdReinitializeMediaInput0(public var bitfield: UInt = 0u)

public data class ScmPdReinitializeMediaOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var status: ScmPdMediaReinitializationStatus = 0,
)

public data class ScmPdRuntimeFwActivationArmState(public var armState: Boolean = false)

public data class ScmPdRuntimeFwActivationInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var lastFirmwareActivationStatus: ScmPdLastFwActivationStatus = 0,
    public var firmwareActivationState: ScmPdFirmwareActivationState = 0,
)

public data class ScmPhysicalDevices(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceCount: UInt = 0u,
    public var devices: List<ScmPhysicalDeviceInstance> = List(1) { ScmPhysicalDeviceInstance() },
)

public data class ScmPhysicalDeviceInstance(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var nfitHandle: UInt = 0u,
    public var symbolicLink: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScmPhysicalDeviceInstance) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.nfitHandle != other.nfitHandle) return false
        if (!this.symbolicLink.contentEquals(other.symbolicLink)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.nfitHandle.hashCode()
        result = 31 * result + this.symbolicLink.contentHashCode()
        return result
    }
}

public data class ScmRegion(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var nfitHandle: UInt = 0u,
    public var logicalDeviceGuid: Guid = Guid(),
    public var addressRangeType: Guid = Guid(),
    public var associatedId: UInt = 0u,
    public var length: ULong = 0uL,
    public var startingDPA: ULong = 0uL,
    public var baseSPA: ULong = 0uL,
    public var sPAOffset: ULong = 0uL,
    public var regionOffset: ULong = 0uL,
)

public data class ScmRegions(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var regionCount: UInt = 0u,
    public var regions: List<ScmRegion> = List(1) { ScmRegion() },
)

public data class SdChangeMachineSidInput(
    public var currentMachineSIDOffset: UShort = 0u,
    public var currentMachineSIDLength: UShort = 0u,
    public var newMachineSIDOffset: UShort = 0u,
    public var newMachineSIDLength: UShort = 0u,
)

public data class SdChangeMachineSidOutput(
    public var numSDChangedSuccess: ULong = 0uL,
    public var numSDChangedFail: ULong = 0uL,
    public var numSDUnused: ULong = 0uL,
    public var numSDTotal: ULong = 0uL,
    public var numMftSDChangedSuccess: ULong = 0uL,
    public var numMftSDChangedFail: ULong = 0uL,
    public var numMftSDTotal: ULong = 0uL,
)

public data class SdEnumSdsEntry(
    public var hash: UInt = 0u,
    public var securityId: UInt = 0u,
    public var offset: ULong = 0uL,
    public var length: UInt = 0u,
    public var descriptor: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SdEnumSdsEntry) return false
        if (this.hash != other.hash) return false
        if (this.securityId != other.securityId) return false
        if (this.offset != other.offset) return false
        if (this.length != other.length) return false
        if (!this.descriptor.contentEquals(other.descriptor)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hash.hashCode()
        result = 31 * result + this.securityId.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.descriptor.contentHashCode()
        return result
    }
}

public data class SdEnumSdsInput(public var startingOffset: ULong = 0uL, public var maxSDEntriesToReturn: ULong = 0uL)

public data class SdEnumSdsOutput(
    public var nextOffset: ULong = 0uL,
    public var numSDEntriesReturned: ULong = 0uL,
    public var numSDBytesReturned: ULong = 0uL,
    public var sDEntry: List<SdEnumSdsEntry> = List(1) { SdEnumSdsEntry() },
)

public data class SdGlobalChangeInput(
    public var flags: UInt = 0u,
    public var changeType: UInt = 0u,
    public var anonymous: SdGlobalChangeInput0 = SdGlobalChangeInput0(),
)

public data class SdGlobalChangeInput0(
    public var sdChange: SdChangeMachineSidInput = SdChangeMachineSidInput(),
    public var sdQueryStats: SdQueryStatsInput = SdQueryStatsInput(),
    public var sdEnumSds: SdEnumSdsInput = SdEnumSdsInput(),
)

public data class SdGlobalChangeOutput(
    public var flags: UInt = 0u,
    public var changeType: UInt = 0u,
    public var anonymous: SdGlobalChangeOutput0 = SdGlobalChangeOutput0(),
)

public data class SdGlobalChangeOutput0(
    public var sdChange: SdChangeMachineSidOutput = SdChangeMachineSidOutput(),
    public var sdQueryStats: SdQueryStatsOutput = SdQueryStatsOutput(),
    public var sdEnumSds: SdEnumSdsOutput = SdEnumSdsOutput(),
)

public data class SdQueryStatsInput(public var reserved: UInt = 0u)

public data class SdQueryStatsOutput(
    public var sdsStreamSize: ULong = 0uL,
    public var sdsAllocationSize: ULong = 0uL,
    public var siiStreamSize: ULong = 0uL,
    public var siiAllocationSize: ULong = 0uL,
    public var sdhStreamSize: ULong = 0uL,
    public var sdhAllocationSize: ULong = 0uL,
    public var numSDTotal: ULong = 0uL,
    public var numSDUnused: ULong = 0uL,
)

public data class Sendcmdinparams(
    public var cBufferSize: UInt = 0u,
    public var irDriveRegs: Ideregs = Ideregs(),
    public var bDriveNumber: UByte = 0u,
    public var bReserved: UByteArray = UByteArray(3),
    public var dwReserved: UIntArray = UIntArray(4),
    public var bBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sendcmdinparams) return false
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

public data class Sendcmdoutparams(
    public var cBufferSize: UInt = 0u,
    public var driverStatus: Driverstatus = Driverstatus(),
    public var bBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sendcmdoutparams) return false
        if (this.cBufferSize != other.cBufferSize) return false
        if (this.driverStatus != other.driverStatus) return false
        if (!this.bBuffer.contentEquals(other.bBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBufferSize.hashCode()
        result = 31 * result + this.driverStatus.hashCode()
        result = 31 * result + this.bBuffer.contentHashCode()
        return result
    }
}

public data class SetDaxAllocAlignmentHintInput(
    public var flags: UInt = 0u,
    public var alignmentShift: UInt = 0u,
    public var fileOffsetToAlign: ULong = 0uL,
    public var fallbackAlignmentShift: UInt = 0u,
)

public data class SetDiskAttributes(
    public var version: UInt = 0u,
    public var persist: Boolean = false,
    public var reserved1: UByteArray = UByteArray(3),
    public var attributes: ULong = 0uL,
    public var attributesMask: ULong = 0uL,
    public var reserved2: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SetDiskAttributes) return false
        if (this.version != other.version) return false
        if (this.persist != other.persist) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.attributes != other.attributes) return false
        if (this.attributesMask != other.attributesMask) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.persist.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.attributesMask.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class SetPartitionInformation(public var partitionType: UByte = 0u)

public data class SetPartitionInformationEx(public var partitionStyle: PartitionStyle = 0, public var anonymous: SetPartitionInformationEx0 = SetPartitionInformationEx0())

public data class SetPartitionInformationEx0(public var mbr: SetPartitionInformation = SetPartitionInformation(), public var gpt: PartitionInformationGpt = PartitionInformationGpt())

public data class SetPurgeFailureModeInput(public var flags: UInt = 0u)

public data class ShrinkVolumeInformation(
    public var shrinkRequestType: ShrinkVolumeRequestTypes = 0,
    public var flags: ULong = 0uL,
    public var newNumberOfSectors: Long = 0L,
)

public data class SiCopyfile(
    public var sourceFileNameLength: UInt = 0u,
    public var destinationFileNameLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileNameBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiCopyfile) return false
        if (this.sourceFileNameLength != other.sourceFileNameLength) return false
        if (this.destinationFileNameLength != other.destinationFileNameLength) return false
        if (this.flags != other.flags) return false
        if (!this.fileNameBuffer.contentEquals(other.fileNameBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sourceFileNameLength.hashCode()
        result = 31 * result + this.destinationFileNameLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fileNameBuffer.contentHashCode()
        return result
    }
}

public data class SmbShareFlushAndPurgeInput(public var version: UShort = 0u)

public data class SmbShareFlushAndPurgeOutput(public var cEntriesPurged: UInt = 0u)

public data class StartingLcnInputBuffer(public var startingLcn: Long = 0L)

public data class StartingLcnInputBufferEx(public var startingLcn: Long = 0L, public var flags: UInt = 0u)

public data class StartingVcnInputBuffer(public var startingVcn: Long = 0L)

public data class StorageAccessAlignmentDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var bytesPerCacheLine: UInt = 0u,
    public var bytesOffsetForCacheAlignment: UInt = 0u,
    public var bytesPerLogicalSector: UInt = 0u,
    public var bytesPerPhysicalSector: UInt = 0u,
    public var bytesOffsetForSectorAlignment: UInt = 0u,
)

public data class StorageAdapterDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var maximumTransferLength: UInt = 0u,
    public var maximumPhysicalPages: UInt = 0u,
    public var alignmentMask: UInt = 0u,
    public var adapterUsesPio: Boolean = false,
    public var adapterScansDown: Boolean = false,
    public var commandQueueing: Boolean = false,
    public var acceleratedTransfer: Boolean = false,
    public var busType: UByte = 0u,
    public var busMajorVersion: UShort = 0u,
    public var busMinorVersion: UShort = 0u,
    public var srbType: UByte = 0u,
    public var addressType: UByte = 0u,
)

public data class StorageAdapterSerialNumber(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var serialNumber: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageAdapterSerialNumber) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        return result
    }
}

public data class StorageAllocateBcStreamInput(
    public var version: UInt = 0u,
    public var requestsPerPeriod: UInt = 0u,
    public var period: UInt = 0u,
    public var retryFailures: Boolean = false,
    public var discardable: Boolean = false,
    public var reserved1: BooleanArray = BooleanArray(2),
    public var accessType: UInt = 0u,
    public var accessMode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageAllocateBcStreamInput) return false
        if (this.version != other.version) return false
        if (this.requestsPerPeriod != other.requestsPerPeriod) return false
        if (this.period != other.period) return false
        if (this.retryFailures != other.retryFailures) return false
        if (this.discardable != other.discardable) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.accessType != other.accessType) return false
        if (this.accessMode != other.accessMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.requestsPerPeriod.hashCode()
        result = 31 * result + this.period.hashCode()
        result = 31 * result + this.retryFailures.hashCode()
        result = 31 * result + this.discardable.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.accessType.hashCode()
        result = 31 * result + this.accessMode.hashCode()
        return result
    }
}

public data class StorageAllocateBcStreamOutput(public var requestSize: ULong = 0uL, public var numOutStandingRequests: UInt = 0u)

public data class StorageAttributeMgmt(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var action: StorageAttributeMgmtAction = 0,
    public var attribute: UInt = 0u,
)

public data class StorageBreakReservationRequest(
    public var length: UInt = 0u,
    public var unused: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
)

public data class StorageBusResetRequest(public var pathId: UByte = 0u)

public data class StorageCounter(public var type: StorageCounterType = 0, public var value: StorageCounter0 = StorageCounter0())

public data class StorageCounter0(public var manufactureDate: StorageCounter00 = StorageCounter00(), public var asUlonglong: ULong = 0uL)

public data class StorageCounter00(public var week: UInt = 0u, public var year: UInt = 0u)

public data class StorageCounters(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numberOfCounters: UInt = 0u,
    public var counters: List<StorageCounter> = List(1) { StorageCounter() },
)

public data class StorageCryptoCapability(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var cryptoCapabilityIndex: UInt = 0u,
    public var algorithmId: StorageCryptoAlgorithmId = 0,
    public var keySize: StorageCryptoKeySize = 0,
    public var dataUnitSizeBitmask: UInt = 0u,
)

public data class StorageCryptoDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numKeysSupported: UInt = 0u,
    public var numCryptoCapabilities: UInt = 0u,
    public var cryptoCapabilities: List<StorageCryptoCapability> = List(1) { StorageCryptoCapability() },
)

public data class StorageDescriptorHeader(public var version: UInt = 0u, public var size: UInt = 0u)

public data class StorageDeviceAttributesDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var attributes: ULong = 0uL,
)

public data class StorageDeviceDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceType: UByte = 0u,
    public var deviceTypeModifier: UByte = 0u,
    public var removableMedia: Boolean = false,
    public var commandQueueing: Boolean = false,
    public var vendorIdOffset: UInt = 0u,
    public var productIdOffset: UInt = 0u,
    public var productRevisionOffset: UInt = 0u,
    public var serialNumberOffset: UInt = 0u,
    public var busType: StorageBusType = 0,
    public var rawPropertiesLength: UInt = 0u,
    public var rawDeviceProperties: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDeviceDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.deviceType != other.deviceType) return false
        if (this.deviceTypeModifier != other.deviceTypeModifier) return false
        if (this.removableMedia != other.removableMedia) return false
        if (this.commandQueueing != other.commandQueueing) return false
        if (this.vendorIdOffset != other.vendorIdOffset) return false
        if (this.productIdOffset != other.productIdOffset) return false
        if (this.productRevisionOffset != other.productRevisionOffset) return false
        if (this.serialNumberOffset != other.serialNumberOffset) return false
        if (this.busType != other.busType) return false
        if (this.rawPropertiesLength != other.rawPropertiesLength) return false
        if (!this.rawDeviceProperties.contentEquals(other.rawDeviceProperties)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.deviceType.hashCode()
        result = 31 * result + this.deviceTypeModifier.hashCode()
        result = 31 * result + this.removableMedia.hashCode()
        result = 31 * result + this.commandQueueing.hashCode()
        result = 31 * result + this.vendorIdOffset.hashCode()
        result = 31 * result + this.productIdOffset.hashCode()
        result = 31 * result + this.productRevisionOffset.hashCode()
        result = 31 * result + this.serialNumberOffset.hashCode()
        result = 31 * result + this.busType.hashCode()
        result = 31 * result + this.rawPropertiesLength.hashCode()
        result = 31 * result + this.rawDeviceProperties.contentHashCode()
        return result
    }
}

public data class StorageDeviceFaultDomainDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numberOfFaultDomains: UInt = 0u,
    public var faultDomainIds: List<Guid> = List(1) { Guid() },
)

public data class StorageDeviceIdDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numberOfIdentifiers: UInt = 0u,
    public var identifiers: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDeviceIdDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.numberOfIdentifiers != other.numberOfIdentifiers) return false
        if (!this.identifiers.contentEquals(other.identifiers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.numberOfIdentifiers.hashCode()
        result = 31 * result + this.identifiers.contentHashCode()
        return result
    }
}

public data class StorageDeviceIoCapabilityDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var lunMaxIoCount: UInt = 0u,
    public var adapterMaxIoCount: UInt = 0u,
)

public data class StorageDeviceLedStateDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var state: ULong = 0uL,
)

public data class StorageDeviceLocationDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var location: DeviceLocation = DeviceLocation(),
    public var stringOffset: UInt = 0u,
)

public data class StorageDeviceManagementStatus(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var health: StorageDiskHealthStatus = 0,
    public var numberOfOperationalStatus: UInt = 0u,
    public var numberOfAdditionalReasons: UInt = 0u,
    public var operationalStatus: IntArray = IntArray(16),
    public var additionalReasons: List<StorageOperationalReason> = List(1) { StorageOperationalReason() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDeviceManagementStatus) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.health != other.health) return false
        if (this.numberOfOperationalStatus != other.numberOfOperationalStatus) return false
        if (this.numberOfAdditionalReasons != other.numberOfAdditionalReasons) return false
        if (!this.operationalStatus.contentEquals(other.operationalStatus)) return false
        if (this.additionalReasons != other.additionalReasons) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.health.hashCode()
        result = 31 * result + this.numberOfOperationalStatus.hashCode()
        result = 31 * result + this.numberOfAdditionalReasons.hashCode()
        result = 31 * result + this.operationalStatus.contentHashCode()
        result = 31 * result + this.additionalReasons.hashCode()
        return result
    }
}

public data class StorageDeviceNumaProperty(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numaNode: UInt = 0u,
)

public data class StorageDeviceNumber(
    public var deviceType: UInt = 0u,
    public var deviceNumber: UInt = 0u,
    public var partitionNumber: UInt = 0u,
)

public data class StorageDeviceNumbers(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var numberOfDevices: UInt = 0u,
    public var devices: List<StorageDeviceNumber> = List(1) { StorageDeviceNumber() },
)

public data class StorageDeviceNumberEx(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var deviceType: UInt = 0u,
    public var deviceNumber: UInt = 0u,
    public var deviceGuid: Guid = Guid(),
    public var partitionNumber: UInt = 0u,
)

public data class StorageDevicePowerCap(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var units: StorageDevicePowerCapUnits = 0,
    public var maxPower: ULong = 0uL,
)

public data class StorageDeviceResiliencyDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var nameOffset: UInt = 0u,
    public var numberOfLogicalCopies: UInt = 0u,
    public var numberOfPhysicalCopies: UInt = 0u,
    public var physicalDiskRedundancy: UInt = 0u,
    public var numberOfColumns: UInt = 0u,
    public var interleave: UInt = 0u,
)

public data class StorageDeviceSelfEncryptionProperty(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var supportsSelfEncryption: Boolean = false,
)

public data class StorageDeviceSelfEncryptionPropertyV2(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var supportsSelfEncryption: Boolean = false,
    public var encryptionType: StorageEncryptionType = 0,
)

public data class StorageDeviceTieringDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var totalNumberOfTiers: UInt = 0u,
    public var numberOfTiersReturned: UInt = 0u,
    public var tiers: List<StorageTier> = List(1) { StorageTier() },
)

public data class StorageDeviceUnsafeShutdownCount(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var unsafeShutdownCount: UInt = 0u,
)

public data class StorageDiagnosticData(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var providerId: Guid = Guid(),
    public var bufferSize: UInt = 0u,
    public var reserved: UInt = 0u,
    public var diagnosticDataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDiagnosticData) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.providerId != other.providerId) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.reserved != other.reserved) return false
        if (!this.diagnosticDataBuffer.contentEquals(other.diagnosticDataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.providerId.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.diagnosticDataBuffer.contentHashCode()
        return result
    }
}

public data class StorageDiagnosticRequest(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var targetType: StorageDiagnosticTargetType = 0,
    public var level: StorageDiagnosticLevel = 0,
)

public data class StorageEventNotification(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var events: ULong = 0uL,
)

public data class StorageFailurePredictionConfig(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var set: Boolean = false,
    public var enabled: Boolean = false,
    public var reserved: UShort = 0u,
)

public data class StorageFruIdDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var identifierSize: UInt = 0u,
    public var identifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFruIdDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.identifierSize != other.identifierSize) return false
        if (!this.identifier.contentEquals(other.identifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.identifierSize.hashCode()
        result = 31 * result + this.identifier.contentHashCode()
        return result
    }
}

public data class StorageGetBcPropertiesOutput(
    public var maximumRequestsPerPeriod: UInt = 0u,
    public var minimumPeriod: UInt = 0u,
    public var maximumRequestSize: ULong = 0uL,
    public var estimatedTimePerRequest: UInt = 0u,
    public var numOutStandingRequests: UInt = 0u,
    public var requestSize: ULong = 0uL,
)

public data class StorageHotplugInfo(
    public var size: UInt = 0u,
    public var mediaRemovable: Boolean = false,
    public var mediaHotplug: Boolean = false,
    public var deviceHotplug: Boolean = false,
    public var writeCacheEnableOverride: Boolean = false,
)

public data class StorageHwEnduranceDataDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var enduranceInfo: StorageHwEnduranceInfo = StorageHwEnduranceInfo(),
)

public data class StorageHwEnduranceInfo(
    public var validFields: UInt = 0u,
    public var groupId: UInt = 0u,
    public var flags: StorageHwEnduranceInfo0 = StorageHwEnduranceInfo0(),
    public var lifePercentage: UInt = 0u,
    public var bytesReadCount: UByteArray = UByteArray(16),
    public var byteWriteCount: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwEnduranceInfo) return false
        if (this.validFields != other.validFields) return false
        if (this.groupId != other.groupId) return false
        if (this.flags != other.flags) return false
        if (this.lifePercentage != other.lifePercentage) return false
        if (!this.bytesReadCount.contentEquals(other.bytesReadCount)) return false
        if (!this.byteWriteCount.contentEquals(other.byteWriteCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validFields.hashCode()
        result = 31 * result + this.groupId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lifePercentage.hashCode()
        result = 31 * result + this.bytesReadCount.contentHashCode()
        result = 31 * result + this.byteWriteCount.contentHashCode()
        return result
    }
}

public data class StorageHwEnduranceInfo0(public var bitfield: UInt = 0u)

public data class StorageHwFirmwareActivate(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var slot: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwFirmwareActivate) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.slot != other.slot) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.slot.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        return result
    }
}

public data class StorageHwFirmwareDownload(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var slot: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var offset: ULong = 0uL,
    public var bufferSize: ULong = 0uL,
    public var imageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwFirmwareDownload) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.slot != other.slot) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.offset != other.offset) return false
        if (this.bufferSize != other.bufferSize) return false
        if (!this.imageBuffer.contentEquals(other.imageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.slot.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.imageBuffer.contentHashCode()
        return result
    }
}

public data class StorageHwFirmwareDownloadV2(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var slot: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var offset: ULong = 0uL,
    public var bufferSize: ULong = 0uL,
    public var imageSize: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var imageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwFirmwareDownloadV2) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.slot != other.slot) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.offset != other.offset) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.imageSize != other.imageSize) return false
        if (this.reserved2 != other.reserved2) return false
        if (!this.imageBuffer.contentEquals(other.imageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.slot.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.imageSize.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.imageBuffer.contentHashCode()
        return result
    }
}

public data class StorageHwFirmwareInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var bitfield: UByte = 0u,
    public var slotCount: UByte = 0u,
    public var activeSlot: UByte = 0u,
    public var pendingActivateSlot: UByte = 0u,
    public var firmwareShared: Boolean = false,
    public var reserved: UByteArray = UByteArray(3),
    public var imagePayloadAlignment: UInt = 0u,
    public var imagePayloadMaxSize: UInt = 0u,
    public var slot: List<StorageHwFirmwareSlotInfo> = List(1) { StorageHwFirmwareSlotInfo() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwFirmwareInfo) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.bitfield != other.bitfield) return false
        if (this.slotCount != other.slotCount) return false
        if (this.activeSlot != other.activeSlot) return false
        if (this.pendingActivateSlot != other.pendingActivateSlot) return false
        if (this.firmwareShared != other.firmwareShared) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.imagePayloadAlignment != other.imagePayloadAlignment) return false
        if (this.imagePayloadMaxSize != other.imagePayloadMaxSize) return false
        if (this.slot != other.slot) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.slotCount.hashCode()
        result = 31 * result + this.activeSlot.hashCode()
        result = 31 * result + this.pendingActivateSlot.hashCode()
        result = 31 * result + this.firmwareShared.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.imagePayloadAlignment.hashCode()
        result = 31 * result + this.imagePayloadMaxSize.hashCode()
        result = 31 * result + this.slot.hashCode()
        return result
    }
}

public data class StorageHwFirmwareInfoQuery(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class StorageHwFirmwareSlotInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var slotNumber: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(6),
    public var revision: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageHwFirmwareSlotInfo) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.revision.contentEquals(other.revision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.slotNumber.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.revision.contentHashCode()
        return result
    }
}

public data class StorageIdentifier(
    public var codeSet: StorageIdentifierCodeSet = 0,
    public var type: StorageIdentifierType = 0,
    public var identifierSize: UShort = 0u,
    public var nextOffset: UShort = 0u,
    public var association: StorageAssociationType = 0,
    public var identifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageIdentifier) return false
        if (this.codeSet != other.codeSet) return false
        if (this.type != other.type) return false
        if (this.identifierSize != other.identifierSize) return false
        if (this.nextOffset != other.nextOffset) return false
        if (this.association != other.association) return false
        if (!this.identifier.contentEquals(other.identifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.codeSet.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.identifierSize.hashCode()
        result = 31 * result + this.nextOffset.hashCode()
        result = 31 * result + this.association.hashCode()
        result = 31 * result + this.identifier.contentHashCode()
        return result
    }
}

public data class StorageIdlePower(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var bitfield: UInt = 0u,
    public var d3IdleTimeout: UInt = 0u,
)

public data class StorageIdlePowerupReason(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var powerupReason: StoragePowerupReasonType = 0,
)

public data class StorageLbProvisioningMapResources(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var bitfield1: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var bitfield2: UByte = 0u,
    public var reserved3: UByteArray = UByteArray(3),
    public var availableMappingResources: ULong = 0uL,
    public var usedMappingResources: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageLbProvisioningMapResources) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.bitfield1 != other.bitfield1) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.bitfield2 != other.bitfield2) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        if (this.availableMappingResources != other.availableMappingResources) return false
        if (this.usedMappingResources != other.usedMappingResources) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.bitfield1.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.bitfield2.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        result = 31 * result + this.availableMappingResources.hashCode()
        result = 31 * result + this.usedMappingResources.hashCode()
        return result
    }
}

public data class StorageMediaSerialNumberData(
    public var reserved: UShort = 0u,
    public var serialNumberLength: UShort = 0u,
    public var serialNumber: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageMediaSerialNumberData) return false
        if (this.reserved != other.reserved) return false
        if (this.serialNumberLength != other.serialNumberLength) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.serialNumberLength.hashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        return result
    }
}

public data class StorageMediumProductTypeDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var mediumProductType: UInt = 0u,
)

public data class StorageMiniportDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var portdriver: StoragePortCodeSet = 0,
    public var lUNResetSupported: Boolean = false,
    public var targetResetSupported: Boolean = false,
    public var ioTimeoutValue: UShort = 0u,
    public var extraIoInfoSupported: Boolean = false,
    public var flags: StorageMiniportDescriptor0 = StorageMiniportDescriptor0(),
    public var reserved0: UByteArray = UByteArray(2),
    public var reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageMiniportDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.portdriver != other.portdriver) return false
        if (this.lUNResetSupported != other.lUNResetSupported) return false
        if (this.targetResetSupported != other.targetResetSupported) return false
        if (this.ioTimeoutValue != other.ioTimeoutValue) return false
        if (this.extraIoInfoSupported != other.extraIoInfoSupported) return false
        if (this.flags != other.flags) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.portdriver.hashCode()
        result = 31 * result + this.lUNResetSupported.hashCode()
        result = 31 * result + this.targetResetSupported.hashCode()
        result = 31 * result + this.ioTimeoutValue.hashCode()
        result = 31 * result + this.extraIoInfoSupported.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }
}

public data class StorageMiniportDescriptor0(public var anonymous: StorageMiniportDescriptor00 = StorageMiniportDescriptor00(), public var asBYTE: UByte = 0u)

public data class StorageMiniportDescriptor00(public var bitfield: UByte = 0u)

public data class StorageOffloadReadOutput(
    public var offloadReadFlags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var lengthProtected: ULong = 0uL,
    public var tokenLength: UInt = 0u,
    public var token: StorageOffloadToken = StorageOffloadToken(),
)

public data class StorageOffloadToken(
    public var tokenType: UByteArray = UByteArray(4),
    public var reserved: UByteArray = UByteArray(2),
    public var tokenIdLength: UByteArray = UByteArray(2),
    public var anonymous: StorageOffloadToken0 = StorageOffloadToken0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageOffloadToken) return false
        if (!this.tokenType.contentEquals(other.tokenType)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.tokenIdLength.contentEquals(other.tokenIdLength)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tokenType.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.tokenIdLength.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class StorageOffloadToken0(public var storageOffloadZeroDataToken: StorageOffloadToken00 = StorageOffloadToken00(), public var token: UByteArray = UByteArray(504)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageOffloadToken0) return false
        if (this.storageOffloadZeroDataToken != other.storageOffloadZeroDataToken) return false
        if (!this.token.contentEquals(other.token)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.storageOffloadZeroDataToken.hashCode()
        result = 31 * result + this.token.contentHashCode()
        return result
    }
}

public data class StorageOffloadToken00(public var reserved2: UByteArray = UByteArray(504)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageOffloadToken00) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.reserved2.contentHashCode()
    }
}

public data class StorageOffloadWriteOutput(
    public var offloadWriteFlags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var lengthCopied: ULong = 0uL,
)

public data class StorageOperationalReason(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var reason: StorageOperationalStatusReason = 0,
    public var rawBytes: StorageOperationalReason0 = StorageOperationalReason0(),
)

public data class StorageOperationalReason0(
    public var scsiSenseKey: StorageOperationalReason00 = StorageOperationalReason00(),
    public var nvdimmN: StorageOperationalReason01 = StorageOperationalReason01(),
    public var asUlong: UInt = 0u,
)

public data class StorageOperationalReason01(
    public var criticalHealth: UByte = 0u,
    public var moduleHealth: UByteArray = UByteArray(2),
    public var errorThresholdStatus: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageOperationalReason01) return false
        if (this.criticalHealth != other.criticalHealth) return false
        if (!this.moduleHealth.contentEquals(other.moduleHealth)) return false
        if (this.errorThresholdStatus != other.errorThresholdStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.criticalHealth.hashCode()
        result = 31 * result + this.moduleHealth.contentHashCode()
        result = 31 * result + this.errorThresholdStatus.hashCode()
        return result
    }
}

public data class StorageOperationalReason00(
    public var senseKey: UByte = 0u,
    public var asc: UByte = 0u,
    public var ascq: UByte = 0u,
    public var reserved: UByte = 0u,
)

public data class StoragePhysicalAdapterData(
    public var adapterId: UInt = 0u,
    public var healthStatus: StorageComponentHealthStatus = 0,
    public var commandProtocol: StorageProtocolType = 0,
    public var specVersion: StorageSpecVersion = StorageSpecVersion(),
    public var vendor: UByteArray = UByteArray(8),
    public var model: UByteArray = UByteArray(40),
    public var firmwareRevision: UByteArray = UByteArray(16),
    public var physicalLocation: UByteArray = UByteArray(32),
    public var expanderConnected: Boolean = false,
    public var reserved0: UByteArray = UByteArray(3),
    public var reserved1: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePhysicalAdapterData) return false
        if (this.adapterId != other.adapterId) return false
        if (this.healthStatus != other.healthStatus) return false
        if (this.commandProtocol != other.commandProtocol) return false
        if (this.specVersion != other.specVersion) return false
        if (!this.vendor.contentEquals(other.vendor)) return false
        if (!this.model.contentEquals(other.model)) return false
        if (!this.firmwareRevision.contentEquals(other.firmwareRevision)) return false
        if (!this.physicalLocation.contentEquals(other.physicalLocation)) return false
        if (this.expanderConnected != other.expanderConnected) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterId.hashCode()
        result = 31 * result + this.healthStatus.hashCode()
        result = 31 * result + this.commandProtocol.hashCode()
        result = 31 * result + this.specVersion.hashCode()
        result = 31 * result + this.vendor.contentHashCode()
        result = 31 * result + this.model.contentHashCode()
        result = 31 * result + this.firmwareRevision.contentHashCode()
        result = 31 * result + this.physicalLocation.contentHashCode()
        result = 31 * result + this.expanderConnected.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }
}

public data class StoragePhysicalDeviceData(
    public var deviceId: UInt = 0u,
    public var role: UInt = 0u,
    public var healthStatus: StorageComponentHealthStatus = 0,
    public var commandProtocol: StorageProtocolType = 0,
    public var specVersion: StorageSpecVersion = StorageSpecVersion(),
    public var formFactor: StorageDeviceFormFactor = 0,
    public var vendor: UByteArray = UByteArray(8),
    public var model: UByteArray = UByteArray(40),
    public var firmwareRevision: UByteArray = UByteArray(16),
    public var capacity: ULong = 0uL,
    public var physicalLocation: UByteArray = UByteArray(32),
    public var reserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePhysicalDeviceData) return false
        if (this.deviceId != other.deviceId) return false
        if (this.role != other.role) return false
        if (this.healthStatus != other.healthStatus) return false
        if (this.commandProtocol != other.commandProtocol) return false
        if (this.specVersion != other.specVersion) return false
        if (this.formFactor != other.formFactor) return false
        if (!this.vendor.contentEquals(other.vendor)) return false
        if (!this.model.contentEquals(other.model)) return false
        if (!this.firmwareRevision.contentEquals(other.firmwareRevision)) return false
        if (this.capacity != other.capacity) return false
        if (!this.physicalLocation.contentEquals(other.physicalLocation)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceId.hashCode()
        result = 31 * result + this.role.hashCode()
        result = 31 * result + this.healthStatus.hashCode()
        result = 31 * result + this.commandProtocol.hashCode()
        result = 31 * result + this.specVersion.hashCode()
        result = 31 * result + this.formFactor.hashCode()
        result = 31 * result + this.vendor.contentHashCode()
        result = 31 * result + this.model.contentHashCode()
        result = 31 * result + this.firmwareRevision.contentHashCode()
        result = 31 * result + this.capacity.hashCode()
        result = 31 * result + this.physicalLocation.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class StoragePhysicalNodeData(
    public var nodeId: UInt = 0u,
    public var adapterCount: UInt = 0u,
    public var adapterDataLength: UInt = 0u,
    public var adapterDataOffset: UInt = 0u,
    public var deviceCount: UInt = 0u,
    public var deviceDataLength: UInt = 0u,
    public var deviceDataOffset: UInt = 0u,
    public var reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePhysicalNodeData) return false
        if (this.nodeId != other.nodeId) return false
        if (this.adapterCount != other.adapterCount) return false
        if (this.adapterDataLength != other.adapterDataLength) return false
        if (this.adapterDataOffset != other.adapterDataOffset) return false
        if (this.deviceCount != other.deviceCount) return false
        if (this.deviceDataLength != other.deviceDataLength) return false
        if (this.deviceDataOffset != other.deviceDataOffset) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeId.hashCode()
        result = 31 * result + this.adapterCount.hashCode()
        result = 31 * result + this.adapterDataLength.hashCode()
        result = 31 * result + this.adapterDataOffset.hashCode()
        result = 31 * result + this.deviceCount.hashCode()
        result = 31 * result + this.deviceDataLength.hashCode()
        result = 31 * result + this.deviceDataOffset.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class StoragePhysicalTopologyDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var nodeCount: UInt = 0u,
    public var reserved: UInt = 0u,
    public var node: List<StoragePhysicalNodeData> = List(1) { StoragePhysicalNodeData() },
)

public data class StoragePredictFailure(public var predictFailure: UInt = 0u, public var vendorSpecific: UByteArray = UByteArray(512)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePredictFailure) return false
        if (this.predictFailure != other.predictFailure) return false
        if (!this.vendorSpecific.contentEquals(other.vendorSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.predictFailure.hashCode()
        result = 31 * result + this.vendorSpecific.contentHashCode()
        return result
    }
}

public data class StoragePriorityHintSupport(public var supportFlags: UInt = 0u)

public data class StoragePropertyQuery(
    public var propertyId: StoragePropertyId = 0,
    public var queryType: StorageQueryType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePropertyQuery) return false
        if (this.propertyId != other.propertyId) return false
        if (this.queryType != other.queryType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyId.hashCode()
        result = 31 * result + this.queryType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }
}

public data class StoragePropertySet(
    public var propertyId: StoragePropertyId = 0,
    public var setType: StorageSetType = 0,
    public var additionalParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StoragePropertySet) return false
        if (this.propertyId != other.propertyId) return false
        if (this.setType != other.setType) return false
        if (!this.additionalParameters.contentEquals(other.additionalParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyId.hashCode()
        result = 31 * result + this.setType.hashCode()
        result = 31 * result + this.additionalParameters.contentHashCode()
        return result
    }
}

public class StorageProtocolCommand(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var protocolType: StorageProtocolType = 0,
    public var flags: UInt = 0u,
    public var returnStatus: UInt = 0u,
    public var errorCode: UInt = 0u,
    public var commandLength: UInt = 0u,
    public var errorInfoLength: UInt = 0u,
    public var dataToDeviceTransferLength: UInt = 0u,
    public var dataFromDeviceTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var errorInfoOffset: UInt = 0u,
    public var dataToDeviceBufferOffset: UInt = 0u,
    public var dataFromDeviceBufferOffset: UInt = 0u,
    public var commandSpecific: UInt = 0u,
    public var reserved0: UInt = 0u,
    public var fixedProtocolReturnData: UInt = 0u,
    public var reserved1: UIntArray = UIntArray(3),
    public var command: UByteArray = UByteArray(1),
)

public data class StorageProtocolDataDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var protocolSpecificData: StorageProtocolSpecificData = StorageProtocolSpecificData(),
)

public data class StorageProtocolDataDescriptorExt(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var protocolSpecificData: StorageProtocolSpecificDataExt = StorageProtocolSpecificDataExt(),
)

public data class StorageProtocolDataSubvalueGetLogPage(public var anonymous: StorageProtocolDataSubvalueGetLogPage0 = StorageProtocolDataSubvalueGetLogPage0(), public var asUlong: UInt = 0u)

public data class StorageProtocolDataSubvalueGetLogPage0(public var bitfield: UInt = 0u)

public data class StorageProtocolSpecificData(
    public var protocolType: StorageProtocolType = 0,
    public var dataType: UInt = 0u,
    public var protocolDataRequestValue: UInt = 0u,
    public var protocolDataRequestSubValue: UInt = 0u,
    public var protocolDataOffset: UInt = 0u,
    public var protocolDataLength: UInt = 0u,
    public var fixedProtocolReturnData: UInt = 0u,
    public var protocolDataRequestSubValue2: UInt = 0u,
    public var protocolDataRequestSubValue3: UInt = 0u,
    public var protocolDataRequestSubValue4: UInt = 0u,
)

public data class StorageProtocolSpecificDataExt(
    public var protocolType: StorageProtocolType = 0,
    public var dataType: UInt = 0u,
    public var protocolDataValue: UInt = 0u,
    public var protocolDataSubValue: UInt = 0u,
    public var protocolDataOffset: UInt = 0u,
    public var protocolDataLength: UInt = 0u,
    public var fixedProtocolReturnData: UInt = 0u,
    public var protocolDataSubValue2: UInt = 0u,
    public var protocolDataSubValue3: UInt = 0u,
    public var protocolDataSubValue4: UInt = 0u,
    public var protocolDataSubValue5: UInt = 0u,
    public var reserved: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageProtocolSpecificDataExt) return false
        if (this.protocolType != other.protocolType) return false
        if (this.dataType != other.dataType) return false
        if (this.protocolDataValue != other.protocolDataValue) return false
        if (this.protocolDataSubValue != other.protocolDataSubValue) return false
        if (this.protocolDataOffset != other.protocolDataOffset) return false
        if (this.protocolDataLength != other.protocolDataLength) return false
        if (this.fixedProtocolReturnData != other.fixedProtocolReturnData) return false
        if (this.protocolDataSubValue2 != other.protocolDataSubValue2) return false
        if (this.protocolDataSubValue3 != other.protocolDataSubValue3) return false
        if (this.protocolDataSubValue4 != other.protocolDataSubValue4) return false
        if (this.protocolDataSubValue5 != other.protocolDataSubValue5) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protocolType.hashCode()
        result = 31 * result + this.dataType.hashCode()
        result = 31 * result + this.protocolDataValue.hashCode()
        result = 31 * result + this.protocolDataSubValue.hashCode()
        result = 31 * result + this.protocolDataOffset.hashCode()
        result = 31 * result + this.protocolDataLength.hashCode()
        result = 31 * result + this.fixedProtocolReturnData.hashCode()
        result = 31 * result + this.protocolDataSubValue2.hashCode()
        result = 31 * result + this.protocolDataSubValue3.hashCode()
        result = 31 * result + this.protocolDataSubValue4.hashCode()
        result = 31 * result + this.protocolDataSubValue5.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class StorageQueryDependentVolumeLev1Entry(
    public var entryLength: UInt = 0u,
    public var dependencyTypeFlags: UInt = 0u,
    public var providerSpecificFlags: UInt = 0u,
    public var virtualStorageType: VirtualStorageType = VirtualStorageType(),
)

public data class StorageQueryDependentVolumeLev2Entry(
    public var entryLength: UInt = 0u,
    public var dependencyTypeFlags: UInt = 0u,
    public var providerSpecificFlags: UInt = 0u,
    public var virtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var ancestorLevel: UInt = 0u,
    public var hostVolumeNameOffset: UInt = 0u,
    public var hostVolumeNameSize: UInt = 0u,
    public var dependentVolumeNameOffset: UInt = 0u,
    public var dependentVolumeNameSize: UInt = 0u,
    public var relativePathOffset: UInt = 0u,
    public var relativePathSize: UInt = 0u,
    public var dependentDeviceNameOffset: UInt = 0u,
    public var dependentDeviceNameSize: UInt = 0u,
)

public data class StorageQueryDependentVolumeRequest(public var requestLevel: UInt = 0u, public var requestFlags: UInt = 0u)

public data class StorageQueryDependentVolumeResponse(
    public var responseLevel: UInt = 0u,
    public var numberEntries: UInt = 0u,
    public var anonymous: StorageQueryDependentVolumeResponse0 = StorageQueryDependentVolumeResponse0(),
)

public data class StorageQueryDependentVolumeResponse0(public var lev1Depends: List<StorageQueryDependentVolumeLev1Entry> = List(1) { StorageQueryDependentVolumeLev1Entry() }, public var lev2Depends: List<StorageQueryDependentVolumeLev2Entry> = List(1) { StorageQueryDependentVolumeLev2Entry() })

public data class StorageReadCapacity(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var blockLength: UInt = 0u,
    public var numberOfBlocks: Long = 0L,
    public var diskLength: Long = 0L,
)

public data class StorageReinitializeMedia(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var timeoutInSeconds: UInt = 0u,
    public var sanitizeOption: StorageReinitializeMedia0 = StorageReinitializeMedia0(),
)

public data class StorageReinitializeMedia0(public var bitfield: UInt = 0u)

public data class StorageRpmbDataFrame(
    public var stuff: UByteArray = UByteArray(196),
    public var keyOrMAC: UByteArray = UByteArray(32),
    public var data: UByteArray = UByteArray(256),
    public var nonce: UByteArray = UByteArray(16),
    public var writeCounter: UByteArray = UByteArray(4),
    public var address: UByteArray = UByteArray(2),
    public var blockCount: UByteArray = UByteArray(2),
    public var operationResult: UByteArray = UByteArray(2),
    public var requestOrResponseType: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageRpmbDataFrame) return false
        if (!this.stuff.contentEquals(other.stuff)) return false
        if (!this.keyOrMAC.contentEquals(other.keyOrMAC)) return false
        if (!this.data.contentEquals(other.data)) return false
        if (!this.nonce.contentEquals(other.nonce)) return false
        if (!this.writeCounter.contentEquals(other.writeCounter)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (!this.blockCount.contentEquals(other.blockCount)) return false
        if (!this.operationResult.contentEquals(other.operationResult)) return false
        if (!this.requestOrResponseType.contentEquals(other.requestOrResponseType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stuff.contentHashCode()
        result = 31 * result + this.keyOrMAC.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        result = 31 * result + this.nonce.contentHashCode()
        result = 31 * result + this.writeCounter.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.blockCount.contentHashCode()
        result = 31 * result + this.operationResult.contentHashCode()
        result = 31 * result + this.requestOrResponseType.contentHashCode()
        return result
    }
}

public data class StorageRpmbDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var sizeInBytes: UInt = 0u,
    public var maxReliableWriteSizeInBytes: UInt = 0u,
    public var frameFormat: StorageRpmbFrameType = 0,
)

public data class StorageSpecVersion(public var anonymous: StorageSpecVersion0 = StorageSpecVersion0(), public var asUlong: UInt = 0u)

public data class StorageSpecVersion0(public var minorVersion: StorageSpecVersion00 = StorageSpecVersion00(), public var majorVersion: UShort = 0u)

public data class StorageSpecVersion00(public var anonymous: StorageSpecVersion000 = StorageSpecVersion000(), public var asUshort: UShort = 0u)

public data class StorageSpecVersion000(public var subMinor: UByte = 0u, public var minor: UByte = 0u)

public data class StorageTemperatureDataDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var criticalTemperature: Short = 0,
    public var warningTemperature: Short = 0,
    public var infoCount: UShort = 0u,
    public var reserved0: UByteArray = UByteArray(2),
    public var reserved1: UIntArray = UIntArray(2),
    public var temperatureInfo: List<StorageTemperatureInfo> = List(1) { StorageTemperatureInfo() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageTemperatureDataDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.criticalTemperature != other.criticalTemperature) return false
        if (this.warningTemperature != other.warningTemperature) return false
        if (this.infoCount != other.infoCount) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.temperatureInfo != other.temperatureInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.criticalTemperature.hashCode()
        result = 31 * result + this.warningTemperature.hashCode()
        result = 31 * result + this.infoCount.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.temperatureInfo.hashCode()
        return result
    }
}

public data class StorageTemperatureInfo(
    public var index: UShort = 0u,
    public var temperature: Short = 0,
    public var overThreshold: Short = 0,
    public var underThreshold: Short = 0,
    public var overThresholdChangable: Boolean = false,
    public var underThresholdChangable: Boolean = false,
    public var eventGenerated: Boolean = false,
    public var reserved0: UByte = 0u,
    public var reserved1: UInt = 0u,
)

public data class StorageTemperatureThreshold(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UShort = 0u,
    public var index: UShort = 0u,
    public var threshold: Short = 0,
    public var overThreshold: Boolean = false,
    public var reserved: UByte = 0u,
)

public data class StorageTier(
    public var id: Guid = Guid(),
    public var name: UShortArray = UShortArray(256),
    public var description: UShortArray = UShortArray(256),
    public var flags: ULong = 0uL,
    public var provisionedCapacity: ULong = 0uL,
    public var mediaType: StorageTierMediaType = 0,
    public var cls: StorageTierClass = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageTier) return false
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

public data class StorageTierRegion(
    public var tierId: Guid = Guid(),
    public var offset: ULong = 0uL,
    public var length: ULong = 0uL,
)

public data class StorageWriteCacheProperty(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var writeCacheType: WriteCacheType = 0,
    public var writeCacheEnabled: WriteCacheEnable = 0,
    public var writeCacheChangeable: WriteCacheChange = 0,
    public var writeThroughSupported: WriteThrough = 0,
    public var flushCacheSupported: Boolean = false,
    public var userDefinedPowerProtection: Boolean = false,
    public var nVCacheEnabled: Boolean = false,
)

public data class StorageZonedDeviceDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceType: StorageZonedDeviceTypes = 0,
    public var zoneCount: UInt = 0u,
    public var zoneAttributes: StorageZonedDeviceDescriptor0 = StorageZonedDeviceDescriptor0(),
    public var zoneGroupCount: UInt = 0u,
    public var zoneGroup: List<StorageZoneGroup> = List(1) { StorageZoneGroup() },
)

public data class StorageZonedDeviceDescriptor0(public var sequentialRequiredZone: StorageZonedDeviceDescriptor00 = StorageZonedDeviceDescriptor00(), public var sequentialPreferredZone: StorageZonedDeviceDescriptor01 = StorageZonedDeviceDescriptor01())

public data class StorageZonedDeviceDescriptor01(public var optimalOpenZoneCount: UInt = 0u, public var reserved: UInt = 0u)

public data class StorageZonedDeviceDescriptor00(
    public var maxOpenZoneCount: UInt = 0u,
    public var unrestrictedRead: Boolean = false,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageZonedDeviceDescriptor00) return false
        if (this.maxOpenZoneCount != other.maxOpenZoneCount) return false
        if (this.unrestrictedRead != other.unrestrictedRead) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxOpenZoneCount.hashCode()
        result = 31 * result + this.unrestrictedRead.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class StorageZoneDescriptor(
    public var size: UInt = 0u,
    public var zoneType: StorageZoneTypes = 0,
    public var zoneCondition: StorageZoneCondition = 0,
    public var resetWritePointerRecommend: Boolean = false,
    public var reserved0: UByteArray = UByteArray(3),
    public var zoneSize: ULong = 0uL,
    public var writePointerOffset: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageZoneDescriptor) return false
        if (this.size != other.size) return false
        if (this.zoneType != other.zoneType) return false
        if (this.zoneCondition != other.zoneCondition) return false
        if (this.resetWritePointerRecommend != other.resetWritePointerRecommend) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.zoneSize != other.zoneSize) return false
        if (this.writePointerOffset != other.writePointerOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.zoneType.hashCode()
        result = 31 * result + this.zoneCondition.hashCode()
        result = 31 * result + this.resetWritePointerRecommend.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.zoneSize.hashCode()
        result = 31 * result + this.writePointerOffset.hashCode()
        return result
    }
}

public data class StorageZoneGroup(
    public var zoneCount: UInt = 0u,
    public var zoneType: StorageZoneTypes = 0,
    public var zoneSize: ULong = 0uL,
)

public data class StreamsAssociateIdInputBuffer(public var flags: UInt = 0u, public var streamId: UInt = 0u)

public data class StreamsQueryIdOutputBuffer(public var streamId: UInt = 0u)

public data class StreamsQueryParametersOutputBuffer(
    public var optimalWriteSize: UInt = 0u,
    public var streamGranularitySize: UInt = 0u,
    public var streamIdMin: UInt = 0u,
    public var streamIdMax: UInt = 0u,
)

public data class StreamExtentEntry(public var flags: UInt = 0u, public var extentInformation: StreamExtentEntry0 = StreamExtentEntry0())

public data class StreamExtentEntry0(public var retrievalPointers: RetrievalPointersBuffer = RetrievalPointersBuffer())

public data class StreamInformationEntry(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var streamInformation: StreamInformationEntry0 = StreamInformationEntry0(),
)

public data class StreamInformationEntry0(
    public var desiredStorageClass: StreamInformationEntry00 = StreamInformationEntry00(),
    public var dataStream: StreamInformationEntry01 = StreamInformationEntry01(),
    public var reparse: StreamInformationEntry02 = StreamInformationEntry02(),
    public var ea: StreamInformationEntry03 = StreamInformationEntry03(),
)

public data class StreamInformationEntry01(
    public var length: UShort = 0u,
    public var flags: UShort = 0u,
    public var reserved: UInt = 0u,
    public var vdl: ULong = 0uL,
)

public data class StreamInformationEntry00(public var cls: FileStorageTierClass = 0, public var flags: UInt = 0u)

public data class StreamInformationEntry03(
    public var length: UShort = 0u,
    public var flags: UShort = 0u,
    public var eaSize: UInt = 0u,
    public var eaInformationOffset: UInt = 0u,
)

public data class StreamInformationEntry02(
    public var length: UShort = 0u,
    public var flags: UShort = 0u,
    public var reparseDataSize: UInt = 0u,
    public var reparseDataOffset: UInt = 0u,
)

public data class StreamLayoutEntry(
    public var version: UInt = 0u,
    public var nextStreamOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var extentInformationOffset: UInt = 0u,
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var streamInformationOffset: UInt = 0u,
    public var attributeTypeCode: UInt = 0u,
    public var attributeFlags: UInt = 0u,
    public var streamIdentifierLength: UInt = 0u,
    public var streamIdentifier: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StreamLayoutEntry) return false
        if (this.version != other.version) return false
        if (this.nextStreamOffset != other.nextStreamOffset) return false
        if (this.flags != other.flags) return false
        if (this.extentInformationOffset != other.extentInformationOffset) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.streamInformationOffset != other.streamInformationOffset) return false
        if (this.attributeTypeCode != other.attributeTypeCode) return false
        if (this.attributeFlags != other.attributeFlags) return false
        if (this.streamIdentifierLength != other.streamIdentifierLength) return false
        if (!this.streamIdentifier.contentEquals(other.streamIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.nextStreamOffset.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.extentInformationOffset.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.streamInformationOffset.hashCode()
        result = 31 * result + this.attributeTypeCode.hashCode()
        result = 31 * result + this.attributeFlags.hashCode()
        result = 31 * result + this.streamIdentifierLength.hashCode()
        result = 31 * result + this.streamIdentifier.contentHashCode()
        return result
    }
}

public data class TapeGetStatistics(public var operation: UInt = 0u)

public data class TapeStatistics(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var recoveredWrites: Long = 0L,
    public var unrecoveredWrites: Long = 0L,
    public var recoveredReads: Long = 0L,
    public var unrecoveredReads: Long = 0L,
    public var compressionRatioReads: UByte = 0u,
    public var compressionRatioWrites: UByte = 0u,
)

public data class TxfsCreateMiniversionInfo(
    public var structureVersion: UShort = 0u,
    public var structureLength: UShort = 0u,
    public var baseVersion: UInt = 0u,
    public var miniVersion: UShort = 0u,
)

public data class TxfsGetMetadataInfoOut(
    public var txfFileId: TxfsGetMetadataInfoOut0 = TxfsGetMetadataInfoOut0(),
    public var lockingTransaction: Guid = Guid(),
    public var lastLsn: ULong = 0uL,
    public var transactionState: UInt = 0u,
)

public data class TxfsGetMetadataInfoOut0(public var lowPart: Long = 0L, public var highPart: Long = 0L)

public data class TxfsGetTransactedVersion(
    public var thisBaseVersion: UInt = 0u,
    public var latestVersion: UInt = 0u,
    public var thisMiniVersion: UShort = 0u,
    public var firstMiniVersion: UShort = 0u,
    public var latestMiniVersion: UShort = 0u,
)

public data class TxfsListTransactions(public var numberOfTransactions: ULong = 0uL, public var bufferSizeRequired: ULong = 0uL)

public data class TxfsListTransactionsEntry(
    public var transactionId: Guid = Guid(),
    public var transactionState: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var reserved3: Long = 0L,
)

public data class TxfsListTransactionLockedFiles(
    public var ktmTransaction: Guid = Guid(),
    public var numberOfFiles: ULong = 0uL,
    public var bufferSizeRequired: ULong = 0uL,
    public var offset: ULong = 0uL,
)

public data class TxfsListTransactionLockedFilesEntry(
    public var offset: ULong = 0uL,
    public var nameFlags: UInt = 0u,
    public var fileId: Long = 0L,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var reserved3: Long = 0L,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TxfsListTransactionLockedFilesEntry) return false
        if (this.offset != other.offset) return false
        if (this.nameFlags != other.nameFlags) return false
        if (this.fileId != other.fileId) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.reserved3 != other.reserved3) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offset.hashCode()
        result = 31 * result + this.nameFlags.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class TxfsModifyRm(
    public var flags: TxfsRmfLags = 0u,
    public var logContainerCountMax: UInt = 0u,
    public var logContainerCountMin: UInt = 0u,
    public var logContainerCount: UInt = 0u,
    public var logGrowthIncrement: UInt = 0u,
    public var logAutoShrinkPercentage: UInt = 0u,
    public var reserved: ULong = 0uL,
    public var loggingMode: UShort = 0u,
)

public class TxfsQueryRmInformation(
    public var bytesRequired: UInt = 0u,
    public var tailLsn: ULong = 0uL,
    public var currentLsn: ULong = 0uL,
    public var archiveTailLsn: ULong = 0uL,
    public var logContainerSize: ULong = 0uL,
    public var highestVirtualClock: Long = 0L,
    public var logContainerCount: UInt = 0u,
    public var logContainerCountMax: UInt = 0u,
    public var logContainerCountMin: UInt = 0u,
    public var logGrowthIncrement: UInt = 0u,
    public var logAutoShrinkPercentage: UInt = 0u,
    public var flags: TxfsRmfLags = 0u,
    public var loggingMode: UShort = 0u,
    public var reserved: UShort = 0u,
    public var rmState: UInt = 0u,
    public var logCapacity: ULong = 0uL,
    public var logFree: ULong = 0uL,
    public var topsSize: ULong = 0uL,
    public var topsUsed: ULong = 0uL,
    public var transactionCount: ULong = 0uL,
    public var onePCCount: ULong = 0uL,
    public var twoPCCount: ULong = 0uL,
    public var numberLogFileFull: ULong = 0uL,
    public var oldestTransactionAge: ULong = 0uL,
    public var rMName: Guid = Guid(),
    public var tmLogPathOffset: UInt = 0u,
)

public data class TxfsReadBackupInformationOut(public var anonymous: TxfsReadBackupInformationOut0 = TxfsReadBackupInformationOut0())

public data class TxfsReadBackupInformationOut0(public var bufferLength: UInt = 0u, public var buffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TxfsReadBackupInformationOut0) return false
        if (this.bufferLength != other.bufferLength) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bufferLength.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class TxfsRollforwardRedoInformation(
    public var lastVirtualClock: Long = 0L,
    public var lastRedoLsn: ULong = 0uL,
    public var highestRecoveryLsn: ULong = 0uL,
    public var flags: UInt = 0u,
)

public data class TxfsSavepointInformation(
    public var ktmTransaction: Handle = null,
    public var actionCode: UInt = 0u,
    public var savepointId: UInt = 0u,
)

public data class TxfsStartRmInformation(
    public var flags: UInt = 0u,
    public var logContainerSize: ULong = 0uL,
    public var logContainerCountMin: UInt = 0u,
    public var logContainerCountMax: UInt = 0u,
    public var logGrowthIncrement: UInt = 0u,
    public var logAutoShrinkPercentage: UInt = 0u,
    public var tmLogPathOffset: UInt = 0u,
    public var tmLogPathLength: UShort = 0u,
    public var loggingMode: UShort = 0u,
    public var logPathLength: UShort = 0u,
    public var reserved: UShort = 0u,
    public var logPath: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TxfsStartRmInformation) return false
        if (this.flags != other.flags) return false
        if (this.logContainerSize != other.logContainerSize) return false
        if (this.logContainerCountMin != other.logContainerCountMin) return false
        if (this.logContainerCountMax != other.logContainerCountMax) return false
        if (this.logGrowthIncrement != other.logGrowthIncrement) return false
        if (this.logAutoShrinkPercentage != other.logAutoShrinkPercentage) return false
        if (this.tmLogPathOffset != other.tmLogPathOffset) return false
        if (this.tmLogPathLength != other.tmLogPathLength) return false
        if (this.loggingMode != other.loggingMode) return false
        if (this.logPathLength != other.logPathLength) return false
        if (this.reserved != other.reserved) return false
        if (!this.logPath.contentEquals(other.logPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.logContainerSize.hashCode()
        result = 31 * result + this.logContainerCountMin.hashCode()
        result = 31 * result + this.logContainerCountMax.hashCode()
        result = 31 * result + this.logGrowthIncrement.hashCode()
        result = 31 * result + this.logAutoShrinkPercentage.hashCode()
        result = 31 * result + this.tmLogPathOffset.hashCode()
        result = 31 * result + this.tmLogPathLength.hashCode()
        result = 31 * result + this.loggingMode.hashCode()
        result = 31 * result + this.logPathLength.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.logPath.contentHashCode()
        return result
    }
}

public data class TxfsTransactionActiveInfo(public var transactionsActiveAtSnapshot: Boolean = false)

public data class TxfsWriteBackupInformation(public var buffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TxfsWriteBackupInformation) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.buffer.contentHashCode()
    }
}

public data class UsnJournalDataV0(
    public var usnJournalID: ULong = 0uL,
    public var firstUsn: Long = 0L,
    public var nextUsn: Long = 0L,
    public var lowestValidUsn: Long = 0L,
    public var maxUsn: Long = 0L,
    public var maximumSize: ULong = 0uL,
    public var allocationDelta: ULong = 0uL,
)

public data class UsnJournalDataV1(
    public var usnJournalID: ULong = 0uL,
    public var firstUsn: Long = 0L,
    public var nextUsn: Long = 0L,
    public var lowestValidUsn: Long = 0L,
    public var maxUsn: Long = 0L,
    public var maximumSize: ULong = 0uL,
    public var allocationDelta: ULong = 0uL,
    public var minSupportedMajorVersion: UShort = 0u,
    public var maxSupportedMajorVersion: UShort = 0u,
)

public data class UsnJournalDataV2(
    public var usnJournalID: ULong = 0uL,
    public var firstUsn: Long = 0L,
    public var nextUsn: Long = 0L,
    public var lowestValidUsn: Long = 0L,
    public var maxUsn: Long = 0L,
    public var maximumSize: ULong = 0uL,
    public var allocationDelta: ULong = 0uL,
    public var minSupportedMajorVersion: UShort = 0u,
    public var maxSupportedMajorVersion: UShort = 0u,
    public var flags: UInt = 0u,
    public var rangeTrackChunkSize: ULong = 0uL,
    public var rangeTrackFileSizeThreshold: Long = 0L,
)

public data class UsnRangeTrackOutput(public var usn: Long = 0L)

public data class UsnRecordCommonHeader(
    public var recordLength: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
)

public data class UsnRecordExtent(public var offset: Long = 0L, public var length: Long = 0L)

public data class UsnRecordUnion(
    public var header: UsnRecordCommonHeader = UsnRecordCommonHeader(),
    public var v2: UsnRecordV2 = UsnRecordV2(),
    public var v3: UsnRecordV3 = UsnRecordV3(),
    public var v4: UsnRecordV4 = UsnRecordV4(),
)

public data class UsnRecordV2(
    public var recordLength: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var fileReferenceNumber: ULong = 0uL,
    public var parentFileReferenceNumber: ULong = 0uL,
    public var usn: Long = 0L,
    public var timeStamp: Long = 0L,
    public var reason: UInt = 0u,
    public var sourceInfo: UInt = 0u,
    public var securityId: UInt = 0u,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UShort = 0u,
    public var fileNameOffset: UShort = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsnRecordV2) return false
        if (this.recordLength != other.recordLength) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.fileReferenceNumber != other.fileReferenceNumber) return false
        if (this.parentFileReferenceNumber != other.parentFileReferenceNumber) return false
        if (this.usn != other.usn) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.reason != other.reason) return false
        if (this.sourceInfo != other.sourceInfo) return false
        if (this.securityId != other.securityId) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.fileNameOffset != other.fileNameOffset) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recordLength.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.fileReferenceNumber.hashCode()
        result = 31 * result + this.parentFileReferenceNumber.hashCode()
        result = 31 * result + this.usn.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.sourceInfo.hashCode()
        result = 31 * result + this.securityId.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileNameOffset.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class UsnRecordV3(
    public var recordLength: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var fileReferenceNumber: FileId128 = FileId128(),
    public var parentFileReferenceNumber: FileId128 = FileId128(),
    public var usn: Long = 0L,
    public var timeStamp: Long = 0L,
    public var reason: UInt = 0u,
    public var sourceInfo: UInt = 0u,
    public var securityId: UInt = 0u,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UShort = 0u,
    public var fileNameOffset: UShort = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsnRecordV3) return false
        if (this.recordLength != other.recordLength) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.fileReferenceNumber != other.fileReferenceNumber) return false
        if (this.parentFileReferenceNumber != other.parentFileReferenceNumber) return false
        if (this.usn != other.usn) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.reason != other.reason) return false
        if (this.sourceInfo != other.sourceInfo) return false
        if (this.securityId != other.securityId) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.fileNameOffset != other.fileNameOffset) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recordLength.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.fileReferenceNumber.hashCode()
        result = 31 * result + this.parentFileReferenceNumber.hashCode()
        result = 31 * result + this.usn.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.sourceInfo.hashCode()
        result = 31 * result + this.securityId.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileNameOffset.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class UsnRecordV4(
    public var header: UsnRecordCommonHeader = UsnRecordCommonHeader(),
    public var fileReferenceNumber: FileId128 = FileId128(),
    public var parentFileReferenceNumber: FileId128 = FileId128(),
    public var usn: Long = 0L,
    public var reason: UInt = 0u,
    public var sourceInfo: UsnSourceInfoId = 0u,
    public var remainingExtents: UInt = 0u,
    public var numberOfExtents: UShort = 0u,
    public var extentSize: UShort = 0u,
    public var extents: List<UsnRecordExtent> = List(1) { UsnRecordExtent() },
)
