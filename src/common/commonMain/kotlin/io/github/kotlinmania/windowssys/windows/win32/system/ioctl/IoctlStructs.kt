@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileId128
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.StorageBusType

public data class AsyncDuplicateExtentsStatus(
    public var version: UInt = 0u,
    public var state: DuplicateExtentsState = 0,
    public var sourceFileOffset: ULong = 0uL,
    public var targetFileOffset: ULong = 0uL,
    public var byteCount: ULong = 0uL,
    public var bytesDuplicated: ULong = 0uL,
)

public data class BinCount(public var binRange: BinRange = BinRange(), public var binCount: UInt = 0u)

public data class BinRange(public var startValue: Long = 0L, public var length: Long = 0L)

public data class BinResults(public var numberOfBins: UInt = 0u, public var binCounts: List<BinCount> = List(1) { BinCount() })

public data class BootAreaInfo(public var bootSectorCount: UInt = 0u, public var bootSectors: List<BootAreaInfo0> = List(2) { BootAreaInfo0() })

public data class BootAreaInfo0(public var offset: Long = 0L)

public data class BulkSecurityTestData(public var desiredAccess: UInt = 0u, public var securityIds: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BulkSecurityTestData) return false
        if (this.desiredAccess != other.desiredAccess) return false
        if (!this.securityIds.contentEquals(other.securityIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.desiredAccess.hashCode()
        result = 31 * result + this.securityIds.contentHashCode()
        return result
    }
}

public data class ChangerElement(public var elementType: ElementType = 0, public var elementAddress: UInt = 0u)

public data class ChangerElementList(public var element: ChangerElement = ChangerElement(), public var numberOfElements: UInt = 0u)

public data class ChangerElementStatus(
    public var element: ChangerElement = ChangerElement(),
    public var srcElementAddress: ChangerElement = ChangerElement(),
    public var flags: ChangerElementStatusFlags = 0u,
    public var exceptionCode: UInt = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var reserved: UShort = 0u,
    public var primaryVolumeID: UByteArray = UByteArray(36),
    public var alternateVolumeID: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChangerElementStatus) return false
        if (this.element != other.element) return false
        if (this.srcElementAddress != other.srcElementAddress) return false
        if (this.flags != other.flags) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reserved != other.reserved) return false
        if (!this.primaryVolumeID.contentEquals(other.primaryVolumeID)) return false
        if (!this.alternateVolumeID.contentEquals(other.alternateVolumeID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.element.hashCode()
        result = 31 * result + this.srcElementAddress.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.exceptionCode.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.primaryVolumeID.contentHashCode()
        result = 31 * result + this.alternateVolumeID.contentHashCode()
        return result
    }
}

public data class ChangerElementStatusEx(
    public var element: ChangerElement = ChangerElement(),
    public var srcElementAddress: ChangerElement = ChangerElement(),
    public var flags: ChangerElementStatusFlags = 0u,
    public var exceptionCode: UInt = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var reserved: UShort = 0u,
    public var primaryVolumeID: UByteArray = UByteArray(36),
    public var alternateVolumeID: UByteArray = UByteArray(36),
    public var vendorIdentification: UByteArray = UByteArray(8),
    public var productIdentification: UByteArray = UByteArray(16),
    public var serialNumber: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChangerElementStatusEx) return false
        if (this.element != other.element) return false
        if (this.srcElementAddress != other.srcElementAddress) return false
        if (this.flags != other.flags) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reserved != other.reserved) return false
        if (!this.primaryVolumeID.contentEquals(other.primaryVolumeID)) return false
        if (!this.alternateVolumeID.contentEquals(other.alternateVolumeID)) return false
        if (!this.vendorIdentification.contentEquals(other.vendorIdentification)) return false
        if (!this.productIdentification.contentEquals(other.productIdentification)) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.element.hashCode()
        result = 31 * result + this.srcElementAddress.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.exceptionCode.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.primaryVolumeID.contentHashCode()
        result = 31 * result + this.alternateVolumeID.contentHashCode()
        result = 31 * result + this.vendorIdentification.contentHashCode()
        result = 31 * result + this.productIdentification.contentHashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        return result
    }
}

public data class ChangerExchangeMedium(
    public var transport: ChangerElement = ChangerElement(),
    public var source: ChangerElement = ChangerElement(),
    public var destination1: ChangerElement = ChangerElement(),
    public var destination2: ChangerElement = ChangerElement(),
    public var flip1: Boolean = false,
    public var flip2: Boolean = false,
)

public data class ChangerInitializeElementStatus(public var elementList: ChangerElementList = ChangerElementList(), public var barCodeScan: Boolean = false)

public data class ChangerMoveMedium(
    public var transport: ChangerElement = ChangerElement(),
    public var source: ChangerElement = ChangerElement(),
    public var destination: ChangerElement = ChangerElement(),
    public var flip: Boolean = false,
)

public data class ChangerProductData(
    public var vendorId: UByteArray = UByteArray(8),
    public var productId: UByteArray = UByteArray(16),
    public var revision: UByteArray = UByteArray(4),
    public var serialNumber: UByteArray = UByteArray(32),
    public var deviceType: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChangerProductData) return false
        if (!this.vendorId.contentEquals(other.vendorId)) return false
        if (!this.productId.contentEquals(other.productId)) return false
        if (!this.revision.contentEquals(other.revision)) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        if (this.deviceType != other.deviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vendorId.contentHashCode()
        result = 31 * result + this.productId.contentHashCode()
        result = 31 * result + this.revision.contentHashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        result = 31 * result + this.deviceType.hashCode()
        return result
    }
}

public data class ChangerReadElementStatus(public var elementList: ChangerElementList = ChangerElementList(), public var volumeTagInfo: Boolean = false)

public data class ChangerSendVolumeTagInformation(
    public var startingElement: ChangerElement = ChangerElement(),
    public var actionCode: UInt = 0u,
    public var volumeIDTemplate: UByteArray = UByteArray(40),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChangerSendVolumeTagInformation) return false
        if (this.startingElement != other.startingElement) return false
        if (this.actionCode != other.actionCode) return false
        if (!this.volumeIDTemplate.contentEquals(other.volumeIDTemplate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startingElement.hashCode()
        result = 31 * result + this.actionCode.hashCode()
        result = 31 * result + this.volumeIDTemplate.contentHashCode()
        return result
    }
}

public data class ChangerSetAccess(public var element: ChangerElement = ChangerElement(), public var control: UInt = 0u)

public data class ChangerSetPosition(
    public var transport: ChangerElement = ChangerElement(),
    public var destination: ChangerElement = ChangerElement(),
    public var flip: Boolean = false,
)

public data class ClassMediaChangeContext(public var mediaChangeCount: UInt = 0u, public var newState: UInt = 0u)

public data class ClusterRange(public var startingCluster: Long = 0L, public var clusterCount: Long = 0L)

public data class ContainerRootInfoInput(public var flags: UInt = 0u)

public data class ContainerRootInfoOutput(public var containerRootIdLength: UShort = 0u, public var containerRootId: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ContainerRootInfoOutput) return false
        if (this.containerRootIdLength != other.containerRootIdLength) return false
        if (!this.containerRootId.contentEquals(other.containerRootId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.containerRootIdLength.hashCode()
        result = 31 * result + this.containerRootId.contentHashCode()
        return result
    }
}

public data class ContainerVolumeState(public var flags: UInt = 0u)

public data class CreateDisk(public var partitionStyle: PartitionStyle = 0, public var anonymous: CreateDisk0 = CreateDisk0())

public data class CreateDisk0(public var mbr: CreateDiskMbr = CreateDiskMbr(), public var gpt: CreateDiskGpt = CreateDiskGpt())

public data class CreateDiskGpt(public var diskId: Guid = Guid(), public var maxPartitionCount: UInt = 0u)

public data class CreateDiskMbr(public var signature: UInt = 0u)

public data class CreateUsnJournalData(public var maximumSize: ULong = 0uL, public var allocationDelta: ULong = 0uL)

public data class CsvControlParam(public var operation: CsvControlOp = 0, public var unused: Long = 0L)

public data class CsvIsOwnedByCsvfs(public var ownedByCSVFS: Boolean = false)

public data class CsvMgmtLock(public var flags: UInt = 0u)

public data class CsvNamespaceInfo(
    public var version: UInt = 0u,
    public var deviceNumber: UInt = 0u,
    public var startingOffset: Long = 0L,
    public var sectorSize: UInt = 0u,
)

public data class CsvQueryFileRevision(public var fileId: Long = 0L, public var fileRevision: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryFileRevision) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileRevision.contentEquals(other.fileRevision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileId.hashCode()
        result = 31 * result + this.fileRevision.contentHashCode()
        return result
    }
}

public data class CsvQueryFileRevisionFileId128(public var fileId: FileId128 = FileId128(), public var fileRevision: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryFileRevisionFileId128) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileRevision.contentEquals(other.fileRevision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileId.hashCode()
        result = 31 * result + this.fileRevision.contentHashCode()
        return result
    }
}

public data class CsvQueryMdsPath(
    public var mdsNodeId: UInt = 0u,
    public var dsNodeId: UInt = 0u,
    public var pathLength: UInt = 0u,
    public var path: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryMdsPath) return false
        if (this.mdsNodeId != other.mdsNodeId) return false
        if (this.dsNodeId != other.dsNodeId) return false
        if (this.pathLength != other.pathLength) return false
        if (!this.path.contentEquals(other.path)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mdsNodeId.hashCode()
        result = 31 * result + this.dsNodeId.hashCode()
        result = 31 * result + this.pathLength.hashCode()
        result = 31 * result + this.path.contentHashCode()
        return result
    }
}

public data class CsvQueryMdsPathV2(
    public var version: Long = 0L,
    public var requiredSize: UInt = 0u,
    public var mdsNodeId: UInt = 0u,
    public var dsNodeId: UInt = 0u,
    public var flags: UInt = 0u,
    public var diskConnectivity: CsvfsDiskConnectivity = 0,
    public var volumeId: Guid = Guid(),
    public var ipAddressOffset: UInt = 0u,
    public var ipAddressLength: UInt = 0u,
    public var pathOffset: UInt = 0u,
    public var pathLength: UInt = 0u,
)

public data class CsvQueryRedirectState(
    public var mdsNodeId: UInt = 0u,
    public var dsNodeId: UInt = 0u,
    public var fileRedirected: Boolean = false,
)

public data class CsvQueryVetoFileDirectIoOutput(
    public var vetoedFromAltitudeIntegral: ULong = 0uL,
    public var vetoedFromAltitudeDecimal: ULong = 0uL,
    public var reason: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryVetoFileDirectIoOutput) return false
        if (this.vetoedFromAltitudeIntegral != other.vetoedFromAltitudeIntegral) return false
        if (this.vetoedFromAltitudeDecimal != other.vetoedFromAltitudeDecimal) return false
        if (!this.reason.contentEquals(other.reason)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vetoedFromAltitudeIntegral.hashCode()
        result = 31 * result + this.vetoedFromAltitudeDecimal.hashCode()
        result = 31 * result + this.reason.contentHashCode()
        return result
    }
}

public data class CsvQueryVolumeId(public var volumeId: Guid = Guid())

public data class CsvQueryVolumeRedirectState(
    public var mdsNodeId: UInt = 0u,
    public var dsNodeId: UInt = 0u,
    public var isDiskConnected: Boolean = false,
    public var clusterEnableDirectIo: Boolean = false,
    public var diskConnectivity: CsvfsDiskConnectivity = 0,
)

public data class CsvSetVolumeId(public var volumeId: Guid = Guid())

public data class DecryptionStatusBuffer(public var noEncryptedStreams: Boolean = false)

public data class DeleteUsnJournalData(public var usnJournalID: ULong = 0uL, public var deleteFlags: UsnDeleteFlags = 0u)

public data class DevicedumpPrivateSubsection(
    public var dwFlags: UInt = 0u,
    public var gPLogId: GpLogPageDescriptor = GpLogPageDescriptor(),
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpPrivateSubsection) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.gPLogId != other.gPLogId) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.gPLogId.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }
}

public data class DevicedumpPublicSubsection(
    public var dwFlags: UInt = 0u,
    public var gPLogTable: List<GpLogPageDescriptor> = List(16) { GpLogPageDescriptor() },
    public var szDescription: ByteArray = ByteArray(16),
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpPublicSubsection) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.gPLogTable != other.gPLogTable) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.gPLogTable.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }
}

public data class DevicedumpRestrictedSubsection(public var bData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpRestrictedSubsection) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bData.contentHashCode()
    }
}

public data class DevicedumpSectionHeader(
    public var guidDeviceDataId: Guid = Guid(),
    public var sOrganizationID: UByteArray = UByteArray(16),
    public var dwFirmwareRevision: UInt = 0u,
    public var sModelNumber: UByteArray = UByteArray(32),
    public var szDeviceManufacturingID: UByteArray = UByteArray(32),
    public var dwFlags: UInt = 0u,
    public var bRestrictedPrivateDataVersion: UInt = 0u,
    public var dwFirmwareIssueId: UInt = 0u,
    public var szIssueDescriptionString: UByteArray = UByteArray(132),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpSectionHeader) return false
        if (this.guidDeviceDataId != other.guidDeviceDataId) return false
        if (!this.sOrganizationID.contentEquals(other.sOrganizationID)) return false
        if (this.dwFirmwareRevision != other.dwFirmwareRevision) return false
        if (!this.sModelNumber.contentEquals(other.sModelNumber)) return false
        if (!this.szDeviceManufacturingID.contentEquals(other.szDeviceManufacturingID)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.bRestrictedPrivateDataVersion != other.bRestrictedPrivateDataVersion) return false
        if (this.dwFirmwareIssueId != other.dwFirmwareIssueId) return false
        if (!this.szIssueDescriptionString.contentEquals(other.szIssueDescriptionString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidDeviceDataId.hashCode()
        result = 31 * result + this.sOrganizationID.contentHashCode()
        result = 31 * result + this.dwFirmwareRevision.hashCode()
        result = 31 * result + this.sModelNumber.contentHashCode()
        result = 31 * result + this.szDeviceManufacturingID.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.bRestrictedPrivateDataVersion.hashCode()
        result = 31 * result + this.dwFirmwareIssueId.hashCode()
        result = 31 * result + this.szIssueDescriptionString.contentHashCode()
        return result
    }
}

public data class DevicedumpStoragedeviceData(
    public var descriptor: DevicedumpStructureVersion = DevicedumpStructureVersion(),
    public var sectionHeader: DevicedumpSectionHeader = DevicedumpSectionHeader(),
    public var dwBufferSize: UInt = 0u,
    public var dwReasonForCollection: UInt = 0u,
    public var publicData: DevicedumpSubsectionPointer = DevicedumpSubsectionPointer(),
    public var restrictedData: DevicedumpSubsectionPointer = DevicedumpSubsectionPointer(),
    public var privateData: DevicedumpSubsectionPointer = DevicedumpSubsectionPointer(),
)

public data class DevicedumpStoragestackPublicDump(
    public var descriptor: DevicedumpStructureVersion = DevicedumpStructureVersion(),
    public var dwReasonForCollection: UInt = 0u,
    public var cDriverName: UByteArray = UByteArray(16),
    public var uiNumRecords: UInt = 0u,
    public var recordArray: List<DevicedumpStoragestackPublicStateRecord> = List(1) { DevicedumpStoragestackPublicStateRecord() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpStoragestackPublicDump) return false
        if (this.descriptor != other.descriptor) return false
        if (this.dwReasonForCollection != other.dwReasonForCollection) return false
        if (!this.cDriverName.contentEquals(other.cDriverName)) return false
        if (this.uiNumRecords != other.uiNumRecords) return false
        if (this.recordArray != other.recordArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.descriptor.hashCode()
        result = 31 * result + this.dwReasonForCollection.hashCode()
        result = 31 * result + this.cDriverName.contentHashCode()
        result = 31 * result + this.uiNumRecords.hashCode()
        result = 31 * result + this.recordArray.hashCode()
        return result
    }
}

public data class DevicedumpStoragestackPublicStateRecord(
    public var cdb: UByteArray = UByteArray(16),
    public var command: UByteArray = UByteArray(16),
    public var startTime: ULong = 0uL,
    public var endTime: ULong = 0uL,
    public var operationStatus: UInt = 0u,
    public var operationError: UInt = 0u,
    public var stackSpecific: DevicedumpStoragestackPublicStateRecord0 = DevicedumpStoragestackPublicStateRecord0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicedumpStoragestackPublicStateRecord) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        if (!this.command.contentEquals(other.command)) return false
        if (this.startTime != other.startTime) return false
        if (this.endTime != other.endTime) return false
        if (this.operationStatus != other.operationStatus) return false
        if (this.operationError != other.operationError) return false
        if (this.stackSpecific != other.stackSpecific) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cdb.contentHashCode()
        result = 31 * result + this.command.contentHashCode()
        result = 31 * result + this.startTime.hashCode()
        result = 31 * result + this.endTime.hashCode()
        result = 31 * result + this.operationStatus.hashCode()
        result = 31 * result + this.operationError.hashCode()
        result = 31 * result + this.stackSpecific.hashCode()
        return result
    }
}

public data class DevicedumpStoragestackPublicStateRecord0(
    public var externalStack: DevicedumpStoragestackPublicStateRecord00 = DevicedumpStoragestackPublicStateRecord00(),
    public var ataPort: DevicedumpStoragestackPublicStateRecord01 = DevicedumpStoragestackPublicStateRecord01(),
    public var storPort: DevicedumpStoragestackPublicStateRecord02 = DevicedumpStoragestackPublicStateRecord02(),
)

public data class DevicedumpStoragestackPublicStateRecord01(public var dwAtaPortSpecific: UInt = 0u)

public data class DevicedumpStoragestackPublicStateRecord00(public var dwReserved: UInt = 0u)

public data class DevicedumpStoragestackPublicStateRecord02(public var srbTag: UInt = 0u)

public data class DevicedumpStructureVersion(
    public var dwSignature: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
)

public data class DevicedumpSubsectionPointer(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwOffset: UInt = 0u,
)

public data class DeviceCopyOffloadDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var maximumTokenLifetime: UInt = 0u,
    public var defaultTokenLifetime: UInt = 0u,
    public var maximumTransferSize: ULong = 0uL,
    public var optimalTransferCount: ULong = 0uL,
    public var maximumDataDescriptors: UInt = 0u,
    public var maximumTransferLengthPerDescriptor: UInt = 0u,
    public var optimalTransferLengthPerDescriptor: UInt = 0u,
    public var optimalTransferLengthGranularity: UShort = 0u,
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceCopyOffloadDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.maximumTokenLifetime != other.maximumTokenLifetime) return false
        if (this.defaultTokenLifetime != other.defaultTokenLifetime) return false
        if (this.maximumTransferSize != other.maximumTransferSize) return false
        if (this.optimalTransferCount != other.optimalTransferCount) return false
        if (this.maximumDataDescriptors != other.maximumDataDescriptors) return false
        if (this.maximumTransferLengthPerDescriptor != other.maximumTransferLengthPerDescriptor) return false
        if (this.optimalTransferLengthPerDescriptor != other.optimalTransferLengthPerDescriptor) return false
        if (this.optimalTransferLengthGranularity != other.optimalTransferLengthGranularity) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.maximumTokenLifetime.hashCode()
        result = 31 * result + this.defaultTokenLifetime.hashCode()
        result = 31 * result + this.maximumTransferSize.hashCode()
        result = 31 * result + this.optimalTransferCount.hashCode()
        result = 31 * result + this.maximumDataDescriptors.hashCode()
        result = 31 * result + this.maximumTransferLengthPerDescriptor.hashCode()
        result = 31 * result + this.optimalTransferLengthPerDescriptor.hashCode()
        result = 31 * result + this.optimalTransferLengthGranularity.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class DeviceDataSetLbpStateParameters(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var outputVersion: UInt = 0u,
)

public data class DeviceDataSetLbProvisioningState(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var slabSizeInBytes: ULong = 0uL,
    public var slabOffsetDeltaInBytes: UInt = 0u,
    public var slabAllocationBitMapBitCount: UInt = 0u,
    public var slabAllocationBitMapLength: UInt = 0u,
    public var slabAllocationBitMap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDataSetLbProvisioningState) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.slabSizeInBytes != other.slabSizeInBytes) return false
        if (this.slabOffsetDeltaInBytes != other.slabOffsetDeltaInBytes) return false
        if (this.slabAllocationBitMapBitCount != other.slabAllocationBitMapBitCount) return false
        if (this.slabAllocationBitMapLength != other.slabAllocationBitMapLength) return false
        if (!this.slabAllocationBitMap.contentEquals(other.slabAllocationBitMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.slabSizeInBytes.hashCode()
        result = 31 * result + this.slabOffsetDeltaInBytes.hashCode()
        result = 31 * result + this.slabAllocationBitMapBitCount.hashCode()
        result = 31 * result + this.slabAllocationBitMapLength.hashCode()
        result = 31 * result + this.slabAllocationBitMap.contentHashCode()
        return result
    }
}

public data class DeviceDataSetLbProvisioningStateV2(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var slabSizeInBytes: ULong = 0uL,
    public var slabOffsetDeltaInBytes: ULong = 0uL,
    public var slabAllocationBitMapBitCount: UInt = 0u,
    public var slabAllocationBitMapLength: UInt = 0u,
    public var slabAllocationBitMap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDataSetLbProvisioningStateV2) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.slabSizeInBytes != other.slabSizeInBytes) return false
        if (this.slabOffsetDeltaInBytes != other.slabOffsetDeltaInBytes) return false
        if (this.slabAllocationBitMapBitCount != other.slabAllocationBitMapBitCount) return false
        if (this.slabAllocationBitMapLength != other.slabAllocationBitMapLength) return false
        if (!this.slabAllocationBitMap.contentEquals(other.slabAllocationBitMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.slabSizeInBytes.hashCode()
        result = 31 * result + this.slabOffsetDeltaInBytes.hashCode()
        result = 31 * result + this.slabAllocationBitMapBitCount.hashCode()
        result = 31 * result + this.slabAllocationBitMapLength.hashCode()
        result = 31 * result + this.slabAllocationBitMap.contentHashCode()
        return result
    }
}

public data class DeviceDataSetRange(public var startingOffset: Long = 0L, public var lengthInBytes: ULong = 0uL)

public data class DeviceDataSetRepairOutput(public var parityExtent: DeviceDataSetRange = DeviceDataSetRange())

public data class DeviceDataSetRepairParameters(
    public var numberOfRepairCopies: UInt = 0u,
    public var sourceCopy: UInt = 0u,
    public var repairCopies: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDataSetRepairParameters) return false
        if (this.numberOfRepairCopies != other.numberOfRepairCopies) return false
        if (this.sourceCopy != other.sourceCopy) return false
        if (!this.repairCopies.contentEquals(other.repairCopies)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfRepairCopies.hashCode()
        result = 31 * result + this.sourceCopy.hashCode()
        result = 31 * result + this.repairCopies.contentHashCode()
        return result
    }
}

public data class DeviceDataSetScrubExOutput(
    public var bytesProcessed: ULong = 0uL,
    public var bytesRepaired: ULong = 0uL,
    public var bytesFailed: ULong = 0uL,
    public var parityExtent: DeviceDataSetRange = DeviceDataSetRange(),
    public var bytesScrubbed: ULong = 0uL,
)

public data class DeviceDataSetScrubOutput(
    public var bytesProcessed: ULong = 0uL,
    public var bytesRepaired: ULong = 0uL,
    public var bytesFailed: ULong = 0uL,
)

public data class DeviceDataSetTopologyIdQueryOutput(public var topologyRangeBytes: ULong = 0uL, public var topologyId: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDataSetTopologyIdQueryOutput) return false
        if (this.topologyRangeBytes != other.topologyRangeBytes) return false
        if (!this.topologyId.contentEquals(other.topologyId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.topologyRangeBytes.hashCode()
        result = 31 * result + this.topologyId.contentHashCode()
        return result
    }
}

public data class DeviceDsmConversionOutput(public var version: UInt = 0u, public var source: Guid = Guid())

public data class DeviceDsmDefinition(
    public var action: UInt = 0u,
    public var singleRange: Boolean = false,
    public var parameterBlockAlignment: UInt = 0u,
    public var parameterBlockLength: UInt = 0u,
    public var hasOutput: Boolean = false,
    public var outputBlockAlignment: UInt = 0u,
    public var outputBlockLength: UInt = 0u,
)

public data class DeviceDsmFreeSpaceOutput(public var version: UInt = 0u, public var freeSpace: ULong = 0uL)

public data class DeviceDsmLostQueryOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var alignment: ULong = 0uL,
    public var numberOfBits: UInt = 0u,
    public var bitMap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDsmLostQueryOutput) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.alignment != other.alignment) return false
        if (this.numberOfBits != other.numberOfBits) return false
        if (!this.bitMap.contentEquals(other.bitMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.numberOfBits.hashCode()
        result = 31 * result + this.bitMap.contentHashCode()
        return result
    }
}

public data class DeviceDsmLostQueryParameters(public var version: UInt = 0u, public var granularity: ULong = 0uL)

public data class DeviceDsmNotificationParameters(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var numFileTypeIDs: UInt = 0u,
    public var fileTypeID: List<Guid> = List(1) { Guid() },
)

public data class DeviceDsmNvcacheChangePriorityParameters(
    public var size: UInt = 0u,
    public var targetPriority: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDsmNvcacheChangePriorityParameters) return false
        if (this.size != other.size) return false
        if (this.targetPriority != other.targetPriority) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.targetPriority.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class DeviceDsmOffloadReadParameters(
    public var flags: UInt = 0u,
    public var timeToLive: UInt = 0u,
    public var reserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDsmOffloadReadParameters) return false
        if (this.flags != other.flags) return false
        if (this.timeToLive != other.timeToLive) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.timeToLive.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class DeviceDsmOffloadWriteParameters(
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var tokenOffset: ULong = 0uL,
    public var token: StorageOffloadToken = StorageOffloadToken(),
)

public data class DeviceDsmPhysicalAddressesOutput(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var totalNumberOfRanges: UInt = 0u,
    public var numberOfRangesReturned: UInt = 0u,
    public var ranges: List<DeviceStorageAddressRange> = List(1) { DeviceStorageAddressRange() },
)

public data class DeviceDsmRangeErrorInfo(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var totalNumberOfRanges: UInt = 0u,
    public var numberOfRangesReturned: UInt = 0u,
    public var ranges: List<DeviceStorageRangeAttributes> = List(1) { DeviceStorageRangeAttributes() },
)

public data class DeviceDsmReportZonesData(
    public var size: UInt = 0u,
    public var zoneCount: UInt = 0u,
    public var attributes: StorageZonesAttributes = 0,
    public var reserved0: UInt = 0u,
    public var zoneDescriptors: List<StorageZoneDescriptor> = List(1) { StorageZoneDescriptor() },
)

public data class DeviceDsmReportZonesParameters(
    public var size: UInt = 0u,
    public var reportOption: UByte = 0u,
    public var partial: UByte = 0u,
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceDsmReportZonesParameters) return false
        if (this.size != other.size) return false
        if (this.reportOption != other.reportOption) return false
        if (this.partial != other.partial) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.reportOption.hashCode()
        result = 31 * result + this.partial.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class DeviceDsmTieringQueryInput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var numberOfTierIds: UInt = 0u,
    public var tierIds: List<Guid> = List(1) { Guid() },
)

public data class DeviceDsmTieringQueryOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var alignment: ULong = 0uL,
    public var totalNumberOfRegions: UInt = 0u,
    public var numberOfRegionsReturned: UInt = 0u,
    public var regions: List<StorageTierRegion> = List(1) { StorageTierRegion() },
)

public data class DeviceInternalStatusData(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var t10VendorId: ULong = 0uL,
    public var dataSet1Length: UInt = 0u,
    public var dataSet2Length: UInt = 0u,
    public var dataSet3Length: UInt = 0u,
    public var dataSet4Length: UInt = 0u,
    public var statusDataVersion: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var reasonIdentifier: UByteArray = UByteArray(128),
    public var statusDataLength: UInt = 0u,
    public var statusData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceInternalStatusData) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.t10VendorId != other.t10VendorId) return false
        if (this.dataSet1Length != other.dataSet1Length) return false
        if (this.dataSet2Length != other.dataSet2Length) return false
        if (this.dataSet3Length != other.dataSet3Length) return false
        if (this.dataSet4Length != other.dataSet4Length) return false
        if (this.statusDataVersion != other.statusDataVersion) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.reasonIdentifier.contentEquals(other.reasonIdentifier)) return false
        if (this.statusDataLength != other.statusDataLength) return false
        if (!this.statusData.contentEquals(other.statusData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.t10VendorId.hashCode()
        result = 31 * result + this.dataSet1Length.hashCode()
        result = 31 * result + this.dataSet2Length.hashCode()
        result = 31 * result + this.dataSet3Length.hashCode()
        result = 31 * result + this.dataSet4Length.hashCode()
        result = 31 * result + this.statusDataVersion.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.reasonIdentifier.contentHashCode()
        result = 31 * result + this.statusDataLength.hashCode()
        result = 31 * result + this.statusData.contentHashCode()
        return result
    }
}

public data class DeviceLbProvisioningDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(7),
    public var optimalUnmapGranularity: ULong = 0uL,
    public var unmapGranularityAlignment: ULong = 0uL,
    public var maxUnmapLbaCount: UInt = 0u,
    public var maxUnmapBlockDescriptorCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceLbProvisioningDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.optimalUnmapGranularity != other.optimalUnmapGranularity) return false
        if (this.unmapGranularityAlignment != other.unmapGranularityAlignment) return false
        if (this.maxUnmapLbaCount != other.maxUnmapLbaCount) return false
        if (this.maxUnmapBlockDescriptorCount != other.maxUnmapBlockDescriptorCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.optimalUnmapGranularity.hashCode()
        result = 31 * result + this.unmapGranularityAlignment.hashCode()
        result = 31 * result + this.maxUnmapLbaCount.hashCode()
        result = 31 * result + this.maxUnmapBlockDescriptorCount.hashCode()
        return result
    }
}

public data class DeviceLocation(
    public var socket: UInt = 0u,
    public var slot: UInt = 0u,
    public var adapter: UInt = 0u,
    public var port: UInt = 0u,
    public var anonymous: DeviceLocation0 = DeviceLocation0(),
)

public data class DeviceLocation0(public var anonymous1: DeviceLocation00 = DeviceLocation00(), public var anonymous2: DeviceLocation01 = DeviceLocation01())

public data class DeviceLocation00(public var channel: UInt = 0u, public var device: UInt = 0u)

public data class DeviceLocation01(public var target: UInt = 0u, public var lun: UInt = 0u)

public data class DeviceManageDataSetAttributes(
    public var size: UInt = 0u,
    public var action: UInt = 0u,
    public var flags: UInt = 0u,
    public var parameterBlockOffset: UInt = 0u,
    public var parameterBlockLength: UInt = 0u,
    public var dataSetRangesOffset: UInt = 0u,
    public var dataSetRangesLength: UInt = 0u,
)

public data class DeviceManageDataSetAttributesOutput(
    public var size: UInt = 0u,
    public var action: UInt = 0u,
    public var flags: UInt = 0u,
    public var operationStatus: UInt = 0u,
    public var extendedError: UInt = 0u,
    public var targetDetailedError: UInt = 0u,
    public var reservedStatus: UInt = 0u,
    public var outputBlockOffset: UInt = 0u,
    public var outputBlockLength: UInt = 0u,
)

public data class DeviceMediaInfo(public var deviceSpecific: DeviceMediaInfo0 = DeviceMediaInfo0())

public data class DeviceMediaInfo0(
    public var diskInfo: DeviceMediaInfo00 = DeviceMediaInfo00(),
    public var removableDiskInfo: DeviceMediaInfo01 = DeviceMediaInfo01(),
    public var tapeInfo: DeviceMediaInfo02 = DeviceMediaInfo02(),
)

public data class DeviceMediaInfo00(
    public var cylinders: Long = 0L,
    public var mediaType: StorageMediaType = 0,
    public var tracksPerCylinder: UInt = 0u,
    public var sectorsPerTrack: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
    public var numberMediaSides: UInt = 0u,
    public var mediaCharacteristics: UInt = 0u,
)

public data class DeviceMediaInfo01(
    public var cylinders: Long = 0L,
    public var mediaType: StorageMediaType = 0,
    public var tracksPerCylinder: UInt = 0u,
    public var sectorsPerTrack: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
    public var numberMediaSides: UInt = 0u,
    public var mediaCharacteristics: UInt = 0u,
)

public data class DeviceMediaInfo02(
    public var mediaType: StorageMediaType = 0,
    public var mediaCharacteristics: UInt = 0u,
    public var currentBlockSize: UInt = 0u,
    public var busType: StorageBusType = 0,
    public var busSpecificData: DeviceMediaInfo020 = DeviceMediaInfo020(),
)

public data class DeviceMediaInfo020(public var scsiInformation: DeviceMediaInfo0200 = DeviceMediaInfo0200())

public data class DeviceMediaInfo0200(public var mediumType: UByte = 0u, public var densityCode: UByte = 0u)

public data class DevicePowerDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var deviceAttentionSupported: Boolean = false,
    public var asynchronousNotificationSupported: Boolean = false,
    public var idlePowerManagementEnabled: Boolean = false,
    public var d3ColdEnabled: Boolean = false,
    public var d3ColdSupported: Boolean = false,
    public var noVerifyDuringIdlePower: Boolean = false,
    public var reserved: UByteArray = UByteArray(2),
    public var idleTimeoutInMS: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevicePowerDescriptor) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.deviceAttentionSupported != other.deviceAttentionSupported) return false
        if (this.asynchronousNotificationSupported != other.asynchronousNotificationSupported) return false
        if (this.idlePowerManagementEnabled != other.idlePowerManagementEnabled) return false
        if (this.d3ColdEnabled != other.d3ColdEnabled) return false
        if (this.d3ColdSupported != other.d3ColdSupported) return false
        if (this.noVerifyDuringIdlePower != other.noVerifyDuringIdlePower) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.idleTimeoutInMS != other.idleTimeoutInMS) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.deviceAttentionSupported.hashCode()
        result = 31 * result + this.asynchronousNotificationSupported.hashCode()
        result = 31 * result + this.idlePowerManagementEnabled.hashCode()
        result = 31 * result + this.d3ColdEnabled.hashCode()
        result = 31 * result + this.d3ColdSupported.hashCode()
        result = 31 * result + this.noVerifyDuringIdlePower.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.idleTimeoutInMS.hashCode()
        return result
    }
}

public data class DeviceSeekPenaltyDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var incursSeekPenalty: Boolean = false,
)

public data class DeviceStorageAddressRange(public var startAddress: Long = 0L, public var lengthInBytes: ULong = 0uL)

public data class DeviceStorageRangeAttributes(
    public var lengthInBytes: ULong = 0uL,
    public var anonymous: DeviceStorageRangeAttributes0 = DeviceStorageRangeAttributes0(),
    public var reserved: UInt = 0u,
)

public data class DeviceStorageRangeAttributes0(public var allFlags: UInt = 0u, public var anonymous: DeviceStorageRangeAttributes00 = DeviceStorageRangeAttributes00())

public data class DeviceStorageRangeAttributes00(public var bitfield: UInt = 0u)

public data class DeviceTrimDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var trimEnabled: Boolean = false,
)

public data class DeviceWriteAggregationDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var benefitsFromWriteAggregation: Boolean = false,
)

public data class DiskCacheInformation(
    public var parametersSavable: Boolean = false,
    public var readCacheEnabled: Boolean = false,
    public var writeCacheEnabled: Boolean = false,
    public var readRetentionPriority: DiskCacheRetentionPriority = 0,
    public var writeRetentionPriority: DiskCacheRetentionPriority = 0,
    public var disablePrefetchTransferLength: UShort = 0u,
    public var prefetchScalar: Boolean = false,
    public var anonymous: DiskCacheInformation0 = DiskCacheInformation0(),
)

public data class DiskCacheInformation0(public var scalarPrefetch: DiskCacheInformation00 = DiskCacheInformation00(), public var blockPrefetch: DiskCacheInformation01 = DiskCacheInformation01())

public data class DiskCacheInformation01(public var minimum: UShort = 0u, public var maximum: UShort = 0u)

public data class DiskCacheInformation00(
    public var minimum: UShort = 0u,
    public var maximum: UShort = 0u,
    public var maximumBlocks: UShort = 0u,
)

public data class DiskControllerNumber(public var controllerNumber: UInt = 0u, public var diskNumber: UInt = 0u)

public data class DiskDetectionInfo(
    public var sizeOfDetectInfo: UInt = 0u,
    public var detectionType: DetectionType = 0,
    public var anonymous: DiskDetectionInfo0 = DiskDetectionInfo0(),
)

public data class DiskDetectionInfo0(public var anonymous: DiskDetectionInfo00 = DiskDetectionInfo00())

public data class DiskDetectionInfo00(public var int13: DiskInt13Info = DiskInt13Info(), public var exInt13: DiskExInt13Info = DiskExInt13Info())

public data class DiskExtent(
    public var diskNumber: UInt = 0u,
    public var startingOffset: Long = 0L,
    public var extentLength: Long = 0L,
)

public data class DiskExInt13Info(
    public var exBufferSize: UShort = 0u,
    public var exFlags: UShort = 0u,
    public var exCylinders: UInt = 0u,
    public var exHeads: UInt = 0u,
    public var exSectorsPerTrack: UInt = 0u,
    public var exSectorsPerDrive: ULong = 0uL,
    public var exSectorSize: UShort = 0u,
    public var exReserved: UShort = 0u,
)

public data class DiskGeometry(
    public var cylinders: Long = 0L,
    public var mediaType: MediaType = 0,
    public var tracksPerCylinder: UInt = 0u,
    public var sectorsPerTrack: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
)

public data class DiskGeometryEx(
    public var geometry: DiskGeometry = DiskGeometry(),
    public var diskSize: Long = 0L,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiskGeometryEx) return false
        if (this.geometry != other.geometry) return false
        if (this.diskSize != other.diskSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.geometry.hashCode()
        result = 31 * result + this.diskSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class DiskGrowPartition(public var partitionNumber: UInt = 0u, public var bytesToGrow: Long = 0L)

public data class DiskHistogram(
    public var diskSize: Long = 0L,
    public var start: Long = 0L,
    public var end: Long = 0L,
    public var average: Long = 0L,
    public var averageRead: Long = 0L,
    public var averageWrite: Long = 0L,
    public var granularity: UInt = 0u,
    public var size: UInt = 0u,
    public var readCount: UInt = 0u,
    public var writeCount: UInt = 0u,
    public var histogram: HistogramBucket? = null,
)

public data class DiskInt13Info(
    public var driveSelect: UShort = 0u,
    public var maxCylinders: UInt = 0u,
    public var sectorsPerTrack: UShort = 0u,
    public var maxHeads: UShort = 0u,
    public var numberDrives: UShort = 0u,
)

public data class DiskLogging(
    public var function: UByte = 0u,
    public var bufferAddress: COpaquePointer? = null,
    public var bufferSize: UInt = 0u,
)

public data class DiskPartitionInfo(
    public var sizeOfPartitionInfo: UInt = 0u,
    public var partitionStyle: PartitionStyle = 0,
    public var anonymous: DiskPartitionInfo0 = DiskPartitionInfo0(),
)

public data class DiskPartitionInfo0(public var mbr: DiskPartitionInfo00 = DiskPartitionInfo00(), public var gpt: DiskPartitionInfo01 = DiskPartitionInfo01())

public data class DiskPartitionInfo01(public var diskId: Guid = Guid())

public data class DiskPartitionInfo00(public var signature: UInt = 0u, public var checkSum: UInt = 0u)

public data class DiskPerformance(
    public var bytesRead: Long = 0L,
    public var bytesWritten: Long = 0L,
    public var readTime: Long = 0L,
    public var writeTime: Long = 0L,
    public var idleTime: Long = 0L,
    public var readCount: UInt = 0u,
    public var writeCount: UInt = 0u,
    public var queueDepth: UInt = 0u,
    public var splitCount: UInt = 0u,
    public var queryTime: Long = 0L,
    public var storageDeviceNumber: UInt = 0u,
    public var storageManagerName: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiskPerformance) return false
        if (this.bytesRead != other.bytesRead) return false
        if (this.bytesWritten != other.bytesWritten) return false
        if (this.readTime != other.readTime) return false
        if (this.writeTime != other.writeTime) return false
        if (this.idleTime != other.idleTime) return false
        if (this.readCount != other.readCount) return false
        if (this.writeCount != other.writeCount) return false
        if (this.queueDepth != other.queueDepth) return false
        if (this.splitCount != other.splitCount) return false
        if (this.queryTime != other.queryTime) return false
        if (this.storageDeviceNumber != other.storageDeviceNumber) return false
        if (!this.storageManagerName.contentEquals(other.storageManagerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bytesRead.hashCode()
        result = 31 * result + this.bytesWritten.hashCode()
        result = 31 * result + this.readTime.hashCode()
        result = 31 * result + this.writeTime.hashCode()
        result = 31 * result + this.idleTime.hashCode()
        result = 31 * result + this.readCount.hashCode()
        result = 31 * result + this.writeCount.hashCode()
        result = 31 * result + this.queueDepth.hashCode()
        result = 31 * result + this.splitCount.hashCode()
        result = 31 * result + this.queryTime.hashCode()
        result = 31 * result + this.storageDeviceNumber.hashCode()
        result = 31 * result + this.storageManagerName.contentHashCode()
        return result
    }
}

public data class DiskRecord(
    public var byteOffset: Long = 0L,
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var virtualAddress: COpaquePointer? = null,
    public var numberOfBytes: UInt = 0u,
    public var deviceNumber: UByte = 0u,
    public var readRequest: Boolean = false,
)

public data class Driverstatus(
    public var bDriverError: UByte = 0u,
    public var bIDEError: UByte = 0u,
    public var bReserved: UByteArray = UByteArray(2),
    public var dwReserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Driverstatus) return false
        if (this.bDriverError != other.bDriverError) return false
        if (this.bIDEError != other.bIDEError) return false
        if (!this.bReserved.contentEquals(other.bReserved)) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bDriverError.hashCode()
        result = 31 * result + this.bIDEError.hashCode()
        result = 31 * result + this.bReserved.contentHashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class DriveLayoutInformation(
    public var partitionCount: UInt = 0u,
    public var signature: UInt = 0u,
    public var partitionEntry: List<PartitionInformation> = List(1) { PartitionInformation() },
)

public data class DriveLayoutInformationEx(
    public var partitionStyle: UInt = 0u,
    public var partitionCount: UInt = 0u,
    public var anonymous: DriveLayoutInformationEx0 = DriveLayoutInformationEx0(),
    public var partitionEntry: List<PartitionInformationEx> = List(1) { PartitionInformationEx() },
)

public data class DriveLayoutInformationEx0(public var mbr: DriveLayoutInformationMbr = DriveLayoutInformationMbr(), public var gpt: DriveLayoutInformationGpt = DriveLayoutInformationGpt())

public data class DriveLayoutInformationGpt(
    public var diskId: Guid = Guid(),
    public var startingUsableOffset: Long = 0L,
    public var usableLength: Long = 0L,
    public var maxPartitionCount: UInt = 0u,
)

public data class DriveLayoutInformationMbr(public var signature: UInt = 0u, public var checkSum: UInt = 0u)

public data class DuplicateExtentsData(
    public var fileHandle: Handle = null,
    public var sourceFileOffset: Long = 0L,
    public var targetFileOffset: Long = 0L,
    public var byteCount: Long = 0L,
)

public data class DuplicateExtentsData32(
    public var fileHandle: UInt = 0u,
    public var sourceFileOffset: Long = 0L,
    public var targetFileOffset: Long = 0L,
    public var byteCount: Long = 0L,
)

public data class DuplicateExtentsDataEx(
    public var size: Int = 0,
    public var fileHandle: Handle = null,
    public var sourceFileOffset: Long = 0L,
    public var targetFileOffset: Long = 0L,
    public var byteCount: Long = 0L,
    public var flags: UInt = 0u,
)

public data class DuplicateExtentsDataEx32(
    public var size: UInt = 0u,
    public var fileHandle: UInt = 0u,
    public var sourceFileOffset: Long = 0L,
    public var targetFileOffset: Long = 0L,
    public var byteCount: Long = 0L,
    public var flags: UInt = 0u,
)

public data class EncryptedDataInfo(
    public var startingFileOffset: ULong = 0uL,
    public var outputBufferOffset: UInt = 0u,
    public var bytesWithinFileSize: UInt = 0u,
    public var bytesWithinValidDataLength: UInt = 0u,
    public var compressionFormat: UShort = 0u,
    public var dataUnitShift: UByte = 0u,
    public var chunkShift: UByte = 0u,
    public var clusterShift: UByte = 0u,
    public var encryptionFormat: UByte = 0u,
    public var numberOfDataBlocks: UShort = 0u,
    public var dataBlockSize: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptedDataInfo) return false
        if (this.startingFileOffset != other.startingFileOffset) return false
        if (this.outputBufferOffset != other.outputBufferOffset) return false
        if (this.bytesWithinFileSize != other.bytesWithinFileSize) return false
        if (this.bytesWithinValidDataLength != other.bytesWithinValidDataLength) return false
        if (this.compressionFormat != other.compressionFormat) return false
        if (this.dataUnitShift != other.dataUnitShift) return false
        if (this.chunkShift != other.chunkShift) return false
        if (this.clusterShift != other.clusterShift) return false
        if (this.encryptionFormat != other.encryptionFormat) return false
        if (this.numberOfDataBlocks != other.numberOfDataBlocks) return false
        if (!this.dataBlockSize.contentEquals(other.dataBlockSize)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startingFileOffset.hashCode()
        result = 31 * result + this.outputBufferOffset.hashCode()
        result = 31 * result + this.bytesWithinFileSize.hashCode()
        result = 31 * result + this.bytesWithinValidDataLength.hashCode()
        result = 31 * result + this.compressionFormat.hashCode()
        result = 31 * result + this.dataUnitShift.hashCode()
        result = 31 * result + this.chunkShift.hashCode()
        result = 31 * result + this.clusterShift.hashCode()
        result = 31 * result + this.encryptionFormat.hashCode()
        result = 31 * result + this.numberOfDataBlocks.hashCode()
        result = 31 * result + this.dataBlockSize.contentHashCode()
        return result
    }
}

public data class EncryptionBuffer(public var encryptionOperation: UInt = 0u, public var private: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptionBuffer) return false
        if (this.encryptionOperation != other.encryptionOperation) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.encryptionOperation.hashCode()
        result = 31 * result + this.private.contentHashCode()
        return result
    }
}

public data class EncryptionKeyCtrlInput(
    public var headerSize: UInt = 0u,
    public var structureSize: UInt = 0u,
    public var keyOffset: UShort = 0u,
    public var keySize: UShort = 0u,
    public var dplLock: UInt = 0u,
    public var dplUserId: ULong = 0uL,
    public var dplCredentialId: ULong = 0uL,
)

public data class ExfatStatistics(
    public var createHits: UInt = 0u,
    public var successfulCreates: UInt = 0u,
    public var failedCreates: UInt = 0u,
    public var nonCachedReads: UInt = 0u,
    public var nonCachedReadBytes: UInt = 0u,
    public var nonCachedWrites: UInt = 0u,
    public var nonCachedWriteBytes: UInt = 0u,
    public var nonCachedDiskReads: UInt = 0u,
    public var nonCachedDiskWrites: UInt = 0u,
)

public data class ExtendedEncryptedDataInfo(
    public var extendedCode: UInt = 0u,
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class FatStatistics(
    public var createHits: UInt = 0u,
    public var successfulCreates: UInt = 0u,
    public var failedCreates: UInt = 0u,
    public var nonCachedReads: UInt = 0u,
    public var nonCachedReadBytes: UInt = 0u,
    public var nonCachedWrites: UInt = 0u,
    public var nonCachedWriteBytes: UInt = 0u,
    public var nonCachedDiskReads: UInt = 0u,
    public var nonCachedDiskWrites: UInt = 0u,
)

public data class FilesystemStatistics(
    public var fileSystemType: FilesystemStatisticsType = 0u,
    public var version: UShort = 0u,
    public var sizeOfCompleteStructure: UInt = 0u,
    public var userFileReads: UInt = 0u,
    public var userFileReadBytes: UInt = 0u,
    public var userDiskReads: UInt = 0u,
    public var userFileWrites: UInt = 0u,
    public var userFileWriteBytes: UInt = 0u,
    public var userDiskWrites: UInt = 0u,
    public var metaDataReads: UInt = 0u,
    public var metaDataReadBytes: UInt = 0u,
    public var metaDataDiskReads: UInt = 0u,
    public var metaDataWrites: UInt = 0u,
    public var metaDataWriteBytes: UInt = 0u,
    public var metaDataDiskWrites: UInt = 0u,
)

public data class FilesystemStatisticsEx(
    public var fileSystemType: FilesystemStatisticsType = 0u,
    public var version: UShort = 0u,
    public var sizeOfCompleteStructure: UInt = 0u,
    public var userFileReads: ULong = 0uL,
    public var userFileReadBytes: ULong = 0uL,
    public var userDiskReads: ULong = 0uL,
    public var userFileWrites: ULong = 0uL,
    public var userFileWriteBytes: ULong = 0uL,
    public var userDiskWrites: ULong = 0uL,
    public var metaDataReads: ULong = 0uL,
    public var metaDataReadBytes: ULong = 0uL,
    public var metaDataDiskReads: ULong = 0uL,
    public var metaDataWrites: ULong = 0uL,
    public var metaDataWriteBytes: ULong = 0uL,
    public var metaDataDiskWrites: ULong = 0uL,
)

public data class FileAllocatedRangeBuffer(public var fileOffset: Long = 0L, public var length: Long = 0L)

public data class FileDesiredStorageClassInformation(public var cls: FileStorageTierClass = 0, public var flags: UInt = 0u)

public data class FileFsPersistentVolumeInformation(
    public var volumeFlags: UInt = 0u,
    public var flagMask: UInt = 0u,
    public var version: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class FileInitiateRepairOutputBuffer(
    public var hint1: ULong = 0uL,
    public var hint2: ULong = 0uL,
    public var clsn: ULong = 0uL,
    public var status: UInt = 0u,
)

public data class FileLayoutEntry(
    public var version: UInt = 0u,
    public var nextFileOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileAttributes: UInt = 0u,
    public var fileReferenceNumber: ULong = 0uL,
    public var firstNameOffset: UInt = 0u,
    public var firstStreamOffset: UInt = 0u,
    public var extraInfoOffset: UInt = 0u,
    public var extraInfoLength: UInt = 0u,
)

public data class FileLayoutInfoEntry(
    public var basicInformation: FileLayoutInfoEntry0 = FileLayoutInfoEntry0(),
    public var ownerId: UInt = 0u,
    public var securityId: UInt = 0u,
    public var usn: Long = 0L,
    public var storageReserveId: StorageReserveId = 0,
)

public data class FileLayoutInfoEntry0(
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var fileAttributes: UInt = 0u,
)

public data class FileLayoutNameEntry(
    public var nextNameOffset: UInt = 0u,
    public var flags: UInt = 0u,
    public var parentFileReferenceNumber: ULong = 0uL,
    public var fileNameLength: UInt = 0u,
    public var reserved: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLayoutNameEntry) return false
        if (this.nextNameOffset != other.nextNameOffset) return false
        if (this.flags != other.flags) return false
        if (this.parentFileReferenceNumber != other.parentFileReferenceNumber) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.reserved != other.reserved) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextNameOffset.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.parentFileReferenceNumber.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileLevelTrim(
    public var key: UInt = 0u,
    public var numRanges: UInt = 0u,
    public var ranges: List<FileLevelTrimRange> = List(1) { FileLevelTrimRange() },
)

public data class FileLevelTrimOutput(public var numRangesProcessed: UInt = 0u)

public data class FileLevelTrimRange(public var offset: ULong = 0uL, public var length: ULong = 0uL)

public data class FileMakeCompatibleBuffer(public var closeDisc: Boolean = false)

public data class FileObjectidBuffer(public var objectId: UByteArray = UByteArray(16), public var anonymous: FileObjectidBuffer0 = FileObjectidBuffer0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidBuffer) return false
        if (!this.objectId.contentEquals(other.objectId)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectId.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class FileObjectidBuffer0(public var anonymous: FileObjectidBuffer00 = FileObjectidBuffer00(), public var extendedInfo: UByteArray = UByteArray(48)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidBuffer0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.extendedInfo.contentEquals(other.extendedInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.extendedInfo.contentHashCode()
        return result
    }
}

public data class FileObjectidBuffer00(
    public var birthVolumeId: UByteArray = UByteArray(16),
    public var birthObjectId: UByteArray = UByteArray(16),
    public var domainId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidBuffer00) return false
        if (!this.birthVolumeId.contentEquals(other.birthVolumeId)) return false
        if (!this.birthObjectId.contentEquals(other.birthObjectId)) return false
        if (!this.domainId.contentEquals(other.domainId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.birthVolumeId.contentHashCode()
        result = 31 * result + this.birthObjectId.contentHashCode()
        result = 31 * result + this.domainId.contentHashCode()
        return result
    }
}

public data class FilePrefetch(
    public var type: UInt = 0u,
    public var count: UInt = 0u,
    public var prefetch: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePrefetch) return false
        if (this.type != other.type) return false
        if (this.count != other.count) return false
        if (!this.prefetch.contentEquals(other.prefetch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.prefetch.contentHashCode()
        return result
    }
}

public data class FilePrefetchEx(
    public var type: UInt = 0u,
    public var count: UInt = 0u,
    public var context: COpaquePointer? = null,
    public var prefetch: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePrefetchEx) return false
        if (this.type != other.type) return false
        if (this.count != other.count) return false
        if (this.context != other.context) return false
        if (!this.prefetch.contentEquals(other.prefetch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.prefetch.contentHashCode()
        return result
    }
}

public data class FileProviderExternalInfoV0(public var version: UInt = 0u, public var algorithm: UInt = 0u)

public data class FileProviderExternalInfoV1(
    public var version: UInt = 0u,
    public var algorithm: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class FileQueryOnDiskVolInfoBuffer(
    public var directoryCount: Long = 0L,
    public var fileCount: Long = 0L,
    public var fsFormatMajVersion: UShort = 0u,
    public var fsFormatMinVersion: UShort = 0u,
    public var fsFormatName: UShortArray = UShortArray(12),
    public var formatTime: Long = 0L,
    public var lastUpdateTime: Long = 0L,
    public var copyrightInfo: UShortArray = UShortArray(34),
    public var abstractInfo: UShortArray = UShortArray(34),
    public var formattingImplementationInfo: UShortArray = UShortArray(34),
    public var lastModifyingImplementationInfo: UShortArray = UShortArray(34),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileQueryOnDiskVolInfoBuffer) return false
        if (this.directoryCount != other.directoryCount) return false
        if (this.fileCount != other.fileCount) return false
        if (this.fsFormatMajVersion != other.fsFormatMajVersion) return false
        if (this.fsFormatMinVersion != other.fsFormatMinVersion) return false
        if (!this.fsFormatName.contentEquals(other.fsFormatName)) return false
        if (this.formatTime != other.formatTime) return false
        if (this.lastUpdateTime != other.lastUpdateTime) return false
        if (!this.copyrightInfo.contentEquals(other.copyrightInfo)) return false
        if (!this.abstractInfo.contentEquals(other.abstractInfo)) return false
        if (!this.formattingImplementationInfo.contentEquals(other.formattingImplementationInfo)) return false
        if (!this.lastModifyingImplementationInfo.contentEquals(other.lastModifyingImplementationInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.directoryCount.hashCode()
        result = 31 * result + this.fileCount.hashCode()
        result = 31 * result + this.fsFormatMajVersion.hashCode()
        result = 31 * result + this.fsFormatMinVersion.hashCode()
        result = 31 * result + this.fsFormatName.contentHashCode()
        result = 31 * result + this.formatTime.hashCode()
        result = 31 * result + this.lastUpdateTime.hashCode()
        result = 31 * result + this.copyrightInfo.contentHashCode()
        result = 31 * result + this.abstractInfo.contentHashCode()
        result = 31 * result + this.formattingImplementationInfo.contentHashCode()
        result = 31 * result + this.lastModifyingImplementationInfo.contentHashCode()
        return result
    }
}

public data class FileQuerySparingBuffer(
    public var sparingUnitBytes: UInt = 0u,
    public var softwareSparing: Boolean = false,
    public var totalSpareBlocks: UInt = 0u,
    public var freeSpareBlocks: UInt = 0u,
)

public data class FileReferenceRange(public var startingFileReferenceNumber: ULong = 0uL, public var endingFileReferenceNumber: ULong = 0uL)

public data class FileRegionInfo(
    public var fileOffset: Long = 0L,
    public var length: Long = 0L,
    public var usage: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class FileRegionInput(
    public var fileOffset: Long = 0L,
    public var length: Long = 0L,
    public var desiredUsage: UInt = 0u,
)

public data class FileRegionOutput(
    public var flags: UInt = 0u,
    public var totalRegionEntryCount: UInt = 0u,
    public var regionEntryCount: UInt = 0u,
    public var reserved: UInt = 0u,
    public var region: List<FileRegionInfo> = List(1) { FileRegionInfo() },
)

public data class FileSetDefectMgmtBuffer(public var disable: Boolean = false)

public data class FileSetSparseBuffer(public var setSparse: Boolean = false)

public data class FileStorageTier(
    public var id: Guid = Guid(),
    public var name: UShortArray = UShortArray(256),
    public var description: UShortArray = UShortArray(256),
    public var flags: ULong = 0uL,
    public var provisionedCapacity: ULong = 0uL,
    public var mediaType: FileStorageTierMediaType = 0,
    public var cls: FileStorageTierClass = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileStorageTier) return false
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

public data class FileStorageTierRegion(
    public var tierId: Guid = Guid(),
    public var offset: ULong = 0uL,
    public var length: ULong = 0uL,
)

public data class FileSystemRecognitionInformation(public var fileSystem: ByteArray = ByteArray(9)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileSystemRecognitionInformation) return false
        if (!this.fileSystem.contentEquals(other.fileSystem)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.fileSystem.contentHashCode()
    }
}

public data class FileTypeNotificationInput(
    public var flags: UInt = 0u,
    public var numFileTypeIDs: UInt = 0u,
    public var fileTypeID: List<Guid> = List(1) { Guid() },
)

public data class FileZeroDataInformation(public var fileOffset: Long = 0L, public var beyondFinalZero: Long = 0L)

public data class FileZeroDataInformationEx(
    public var fileOffset: Long = 0L,
    public var beyondFinalZero: Long = 0L,
    public var flags: UInt = 0u,
)

public data class FindBySidData(public var restart: UInt = 0u, public var sid: Sid = Sid())

public data class FindBySidOutput(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FindBySidOutput) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FormatExParameters(
    public var mediaType: MediaType = 0,
    public var startCylinderNumber: UInt = 0u,
    public var endCylinderNumber: UInt = 0u,
    public var startHeadNumber: UInt = 0u,
    public var endHeadNumber: UInt = 0u,
    public var formatGapLength: UShort = 0u,
    public var sectorsPerTrack: UShort = 0u,
    public var sectorNumber: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FormatExParameters) return false
        if (this.mediaType != other.mediaType) return false
        if (this.startCylinderNumber != other.startCylinderNumber) return false
        if (this.endCylinderNumber != other.endCylinderNumber) return false
        if (this.startHeadNumber != other.startHeadNumber) return false
        if (this.endHeadNumber != other.endHeadNumber) return false
        if (this.formatGapLength != other.formatGapLength) return false
        if (this.sectorsPerTrack != other.sectorsPerTrack) return false
        if (!this.sectorNumber.contentEquals(other.sectorNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mediaType.hashCode()
        result = 31 * result + this.startCylinderNumber.hashCode()
        result = 31 * result + this.endCylinderNumber.hashCode()
        result = 31 * result + this.startHeadNumber.hashCode()
        result = 31 * result + this.endHeadNumber.hashCode()
        result = 31 * result + this.formatGapLength.hashCode()
        result = 31 * result + this.sectorsPerTrack.hashCode()
        result = 31 * result + this.sectorNumber.contentHashCode()
        return result
    }
}

public data class FormatParameters(
    public var mediaType: MediaType = 0,
    public var startCylinderNumber: UInt = 0u,
    public var endCylinderNumber: UInt = 0u,
    public var startHeadNumber: UInt = 0u,
    public var endHeadNumber: UInt = 0u,
)

public data class FsctlGetIntegrityInformationBuffer(
    public var checksumAlgorithm: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var checksumChunkSizeInBytes: UInt = 0u,
    public var clusterSizeInBytes: UInt = 0u,
)

public data class FsctlOffloadReadInput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var tokenTimeToLive: UInt = 0u,
    public var reserved: UInt = 0u,
    public var fileOffset: ULong = 0uL,
    public var copyLength: ULong = 0uL,
)

public data class FsctlOffloadReadOutput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var transferLength: ULong = 0uL,
    public var token: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlOffloadReadOutput) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.transferLength != other.transferLength) return false
        if (!this.token.contentEquals(other.token)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.transferLength.hashCode()
        result = 31 * result + this.token.contentHashCode()
        return result
    }
}

public data class FsctlOffloadWriteInput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileOffset: ULong = 0uL,
    public var copyLength: ULong = 0uL,
    public var transferOffset: ULong = 0uL,
    public var token: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlOffloadWriteInput) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.copyLength != other.copyLength) return false
        if (this.transferOffset != other.transferOffset) return false
        if (!this.token.contentEquals(other.token)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fileOffset.hashCode()
        result = 31 * result + this.copyLength.hashCode()
        result = 31 * result + this.transferOffset.hashCode()
        result = 31 * result + this.token.contentHashCode()
        return result
    }
}

public data class FsctlOffloadWriteOutput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var lengthWritten: ULong = 0uL,
)

public data class FsctlQueryFatBpbBuffer(public var first0x24BytesOfBootSector: UByteArray = UByteArray(36)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlQueryFatBpbBuffer) return false
        if (!this.first0x24BytesOfBootSector.contentEquals(other.first0x24BytesOfBootSector)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.first0x24BytesOfBootSector.contentHashCode()
    }
}

public data class FsctlQueryRegionInfoInput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var numberOfTierIds: UInt = 0u,
    public var tierIds: List<Guid> = List(1) { Guid() },
)

public data class FsctlQueryRegionInfoOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var alignment: ULong = 0uL,
    public var totalNumberOfRegions: UInt = 0u,
    public var numberOfRegionsReturned: UInt = 0u,
    public var regions: List<FileStorageTierRegion> = List(1) { FileStorageTierRegion() },
)

public data class FsctlQueryStorageClassesOutput(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: FileStorageTierFlags = 0u,
    public var totalNumberOfTiers: UInt = 0u,
    public var numberOfTiersReturned: UInt = 0u,
    public var tiers: List<FileStorageTier> = List(1) { FileStorageTier() },
)

public data class FsctlSetIntegrityInformationBuffer(
    public var checksumAlgorithm: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class FsctlSetIntegrityInformationBufferEx(
    public var enableIntegrity: UByte = 0u,
    public var keepIntegrityStateUnchanged: UByte = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var version: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlSetIntegrityInformationBufferEx) return false
        if (this.enableIntegrity != other.enableIntegrity) return false
        if (this.keepIntegrityStateUnchanged != other.keepIntegrityStateUnchanged) return false
        if (this.reserved != other.reserved) return false
        if (this.flags != other.flags) return false
        if (this.version != other.version) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enableIntegrity.hashCode()
        result = 31 * result + this.keepIntegrityStateUnchanged.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class FsBpioInfo(
    public var activeBypassIoCount: UInt = 0u,
    public var storageDriverNameLen: UShort = 0u,
    public var storageDriverName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsBpioInfo) return false
        if (this.activeBypassIoCount != other.activeBypassIoCount) return false
        if (this.storageDriverNameLen != other.storageDriverNameLen) return false
        if (!this.storageDriverName.contentEquals(other.storageDriverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.activeBypassIoCount.hashCode()
        result = 31 * result + this.storageDriverNameLen.hashCode()
        result = 31 * result + this.storageDriverName.contentHashCode()
        return result
    }
}

public data class FsBpioInput(
    public var operation: FsBpioOperations = 0,
    public var inFlags: FsBpioInflags = 0,
    public var reserved1: ULong = 0uL,
    public var reserved2: ULong = 0uL,
)

public data class FsBpioOutput(
    public var operation: FsBpioOperations = 0,
    public var outFlags: FsBpioOutflags = 0,
    public var reserved1: ULong = 0uL,
    public var reserved2: ULong = 0uL,
    public var anonymous: FsBpioOutput0 = FsBpioOutput0(),
)

public data class FsBpioOutput0(
    public var enable: FsBpioResults = FsBpioResults(),
    public var query: FsBpioResults = FsBpioResults(),
    public var volumeStackResume: FsBpioResults = FsBpioResults(),
    public var streamResume: FsBpioResults = FsBpioResults(),
    public var getInfo: FsBpioInfo = FsBpioInfo(),
)

public data class FsBpioResults(
    public var opStatus: UInt = 0u,
    public var failingDriverNameLen: UShort = 0u,
    public var failingDriverName: UShortArray = UShortArray(32),
    public var failureReasonLen: UShort = 0u,
    public var failureReason: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsBpioResults) return false
        if (this.opStatus != other.opStatus) return false
        if (this.failingDriverNameLen != other.failingDriverNameLen) return false
        if (!this.failingDriverName.contentEquals(other.failingDriverName)) return false
        if (this.failureReasonLen != other.failureReasonLen) return false
        if (!this.failureReason.contentEquals(other.failureReason)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.opStatus.hashCode()
        result = 31 * result + this.failingDriverNameLen.hashCode()
        result = 31 * result + this.failingDriverName.contentHashCode()
        result = 31 * result + this.failureReasonLen.hashCode()
        result = 31 * result + this.failureReason.contentHashCode()
        return result
    }
}

public data class Getversioninparams(
    public var bVersion: UByte = 0u,
    public var bRevision: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bIDEDeviceMap: UByte = 0u,
    public var fCapabilities: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Getversioninparams) return false
        if (this.bVersion != other.bVersion) return false
        if (this.bRevision != other.bRevision) return false
        if (this.bReserved != other.bReserved) return false
        if (this.bIDEDeviceMap != other.bIDEDeviceMap) return false
        if (this.fCapabilities != other.fCapabilities) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bVersion.hashCode()
        result = 31 * result + this.bRevision.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.bIDEDeviceMap.hashCode()
        result = 31 * result + this.fCapabilities.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public class GetChangerParameters(
    public var size: UInt = 0u,
    public var numberTransportElements: UShort = 0u,
    public var numberStorageElements: UShort = 0u,
    public var numberCleanerSlots: UShort = 0u,
    public var numberIEElements: UShort = 0u,
    public var numberDataTransferElements: UShort = 0u,
    public var numberOfDoors: UShort = 0u,
    public var firstSlotNumber: UShort = 0u,
    public var firstDriveNumber: UShort = 0u,
    public var firstTransportNumber: UShort = 0u,
    public var firstIEPortNumber: UShort = 0u,
    public var firstCleanerSlotAddress: UShort = 0u,
    public var magazineSize: UShort = 0u,
    public var driveCleanTimeout: UInt = 0u,
    public var features0: ChangerFeatures = 0u,
    public var features1: GetChangerParametersFeatures1 = 0u,
    public var moveFromTransport: UByte = 0u,
    public var moveFromSlot: UByte = 0u,
    public var moveFromIePort: UByte = 0u,
    public var moveFromDrive: UByte = 0u,
    public var exchangeFromTransport: UByte = 0u,
    public var exchangeFromSlot: UByte = 0u,
    public var exchangeFromIePort: UByte = 0u,
    public var exchangeFromDrive: UByte = 0u,
    public var lockUnlockCapabilities: UByte = 0u,
    public var positionCapabilities: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(2),
    public var reserved2: UIntArray = UIntArray(2),
)

public data class GetDeviceInternalStatusDataRequest(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var requestDataType: DeviceInternalStatusDataRequestType = 0,
    public var requestDataSet: DeviceInternalStatusDataSet = 0,
)

public data class GetDiskAttributes(
    public var version: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var attributes: ULong = 0uL,
)

public data class GetFilterFileIdentifierInput(public var altitudeLength: UShort = 0u, public var altitude: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetFilterFileIdentifierInput) return false
        if (this.altitudeLength != other.altitudeLength) return false
        if (!this.altitude.contentEquals(other.altitude)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.altitudeLength.hashCode()
        result = 31 * result + this.altitude.contentHashCode()
        return result
    }
}

public data class GetFilterFileIdentifierOutput(public var filterFileIdentifierLength: UShort = 0u, public var filterFileIdentifier: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetFilterFileIdentifierOutput) return false
        if (this.filterFileIdentifierLength != other.filterFileIdentifierLength) return false
        if (!this.filterFileIdentifier.contentEquals(other.filterFileIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.filterFileIdentifierLength.hashCode()
        result = 31 * result + this.filterFileIdentifier.contentHashCode()
        return result
    }
}

public data class GetLengthInformation(public var length: Long = 0L)

public data class GetMediaTypes(
    public var deviceType: UInt = 0u,
    public var mediaInfoCount: UInt = 0u,
    public var mediaInfo: List<DeviceMediaInfo> = List(1) { DeviceMediaInfo() },
)

public data class GpLogPageDescriptor(public var logAddress: UShort = 0u, public var logSectors: UShort = 0u)

public data class HistogramBucket(public var reads: UInt = 0u, public var writes: UInt = 0u)

public data class Ideregs(
    public var bFeaturesReg: UByte = 0u,
    public var bSectorCountReg: UByte = 0u,
    public var bSectorNumberReg: UByte = 0u,
    public var bCylLowReg: UByte = 0u,
    public var bCylHighReg: UByte = 0u,
    public var bDriveHeadReg: UByte = 0u,
    public var bCommandReg: UByte = 0u,
    public var bReserved: UByte = 0u,
)

public data class IoIrpExtTrackOffsetHeader(
    public var validation: UShort = 0u,
    public var flags: UShort = 0u,
    public var trackedOffsetCallback: PioIrpExtProcessTrackedOffsetCallback = null,
)

public data class LmrQueryInfoParam(public var operation: LmrQueryInfoClass = 0)

public data class LmrQuerySessionInfo(public var sessionId: ULong = 0uL)

public data class LookupStreamFromClusterEntry(
    public var offsetToNext: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: Long = 0L,
    public var cluster: Long = 0L,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LookupStreamFromClusterEntry) return false
        if (this.offsetToNext != other.offsetToNext) return false
        if (this.flags != other.flags) return false
        if (this.reserved != other.reserved) return false
        if (this.cluster != other.cluster) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offsetToNext.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.cluster.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class LookupStreamFromClusterInput(
    public var flags: UInt = 0u,
    public var numberOfClusters: UInt = 0u,
    public var cluster: LongArray = LongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LookupStreamFromClusterInput) return false
        if (this.flags != other.flags) return false
        if (this.numberOfClusters != other.numberOfClusters) return false
        if (!this.cluster.contentEquals(other.cluster)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.numberOfClusters.hashCode()
        result = 31 * result + this.cluster.contentHashCode()
        return result
    }
}

public data class LookupStreamFromClusterOutput(
    public var offset: UInt = 0u,
    public var numberOfMatches: UInt = 0u,
    public var bufferSizeRequired: UInt = 0u,
)

public data class MarkHandleInfo(
    public var anonymous: MarkHandleInfo0 = MarkHandleInfo0(),
    public var volumeHandle: Handle = null,
    public var handleInfo: UInt = 0u,
)

public data class MarkHandleInfo0(public var usnSourceInfo: UInt = 0u, public var copyNumber: UInt = 0u)

public data class MarkHandleInfo32(
    public var anonymous: MarkHandleInfo320 = MarkHandleInfo320(),
    public var volumeHandle: UInt = 0u,
    public var handleInfo: UInt = 0u,
)

public data class MarkHandleInfo320(public var usnSourceInfo: UInt = 0u, public var copyNumber: UInt = 0u)

public data class MftEnumDataV0(
    public var startFileReferenceNumber: ULong = 0uL,
    public var lowUsn: Long = 0L,
    public var highUsn: Long = 0L,
)

public data class MftEnumDataV1(
    public var startFileReferenceNumber: ULong = 0uL,
    public var lowUsn: Long = 0L,
    public var highUsn: Long = 0L,
    public var minMajorVersion: UShort = 0u,
    public var maxMajorVersion: UShort = 0u,
)

public data class MoveFileData(
    public var fileHandle: Handle = null,
    public var startingVcn: Long = 0L,
    public var startingLcn: Long = 0L,
    public var clusterCount: UInt = 0u,
)

public data class MoveFileData32(
    public var fileHandle: UInt = 0u,
    public var startingVcn: Long = 0L,
    public var startingLcn: Long = 0L,
    public var clusterCount: UInt = 0u,
)

public data class MoveFileRecordData(
    public var fileHandle: Handle = null,
    public var sourceFileRecord: Long = 0L,
    public var targetFileRecord: Long = 0L,
)

public data class NtfsExtendedVolumeData(
    public var byteCount: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var bytesPerPhysicalSector: UInt = 0u,
    public var lfsMajorVersion: UShort = 0u,
    public var lfsMinorVersion: UShort = 0u,
    public var maxDeviceTrimExtentCount: UInt = 0u,
    public var maxDeviceTrimByteCount: UInt = 0u,
    public var maxVolumeTrimExtentCount: UInt = 0u,
    public var maxVolumeTrimByteCount: UInt = 0u,
)

public data class NtfsFileRecordInputBuffer(public var fileReferenceNumber: Long = 0L)

public data class NtfsFileRecordOutputBuffer(
    public var fileReferenceNumber: Long = 0L,
    public var fileRecordLength: UInt = 0u,
    public var fileRecordBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtfsFileRecordOutputBuffer) return false
        if (this.fileReferenceNumber != other.fileReferenceNumber) return false
        if (this.fileRecordLength != other.fileRecordLength) return false
        if (!this.fileRecordBuffer.contentEquals(other.fileRecordBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileReferenceNumber.hashCode()
        result = 31 * result + this.fileRecordLength.hashCode()
        result = 31 * result + this.fileRecordBuffer.contentHashCode()
        return result
    }
}

public class NtfsStatistics(
    public var logFileFullExceptions: UInt = 0u,
    public var otherExceptions: UInt = 0u,
    public var mftReads: UInt = 0u,
    public var mftReadBytes: UInt = 0u,
    public var mftWrites: UInt = 0u,
    public var mftWriteBytes: UInt = 0u,
    public var mftWritesUserLevel: NtfsStatistics0 = NtfsStatistics0(),
    public var mftWritesFlushForLogFileFull: UShort = 0u,
    public var mftWritesLazyWriter: UShort = 0u,
    public var mftWritesUserRequest: UShort = 0u,
    public var mft2Writes: UInt = 0u,
    public var mft2WriteBytes: UInt = 0u,
    public var mft2WritesUserLevel: NtfsStatistics1 = NtfsStatistics1(),
    public var mft2WritesFlushForLogFileFull: UShort = 0u,
    public var mft2WritesLazyWriter: UShort = 0u,
    public var mft2WritesUserRequest: UShort = 0u,
    public var rootIndexReads: UInt = 0u,
    public var rootIndexReadBytes: UInt = 0u,
    public var rootIndexWrites: UInt = 0u,
    public var rootIndexWriteBytes: UInt = 0u,
    public var bitmapReads: UInt = 0u,
    public var bitmapReadBytes: UInt = 0u,
    public var bitmapWrites: UInt = 0u,
    public var bitmapWriteBytes: UInt = 0u,
    public var bitmapWritesFlushForLogFileFull: UShort = 0u,
    public var bitmapWritesLazyWriter: UShort = 0u,
    public var bitmapWritesUserRequest: UShort = 0u,
    public var bitmapWritesUserLevel: NtfsStatistics2 = NtfsStatistics2(),
    public var mftBitmapReads: UInt = 0u,
    public var mftBitmapReadBytes: UInt = 0u,
    public var mftBitmapWrites: UInt = 0u,
    public var mftBitmapWriteBytes: UInt = 0u,
    public var mftBitmapWritesFlushForLogFileFull: UShort = 0u,
    public var mftBitmapWritesLazyWriter: UShort = 0u,
    public var mftBitmapWritesUserRequest: UShort = 0u,
    public var mftBitmapWritesUserLevel: NtfsStatistics3 = NtfsStatistics3(),
    public var userIndexReads: UInt = 0u,
    public var userIndexReadBytes: UInt = 0u,
    public var userIndexWrites: UInt = 0u,
    public var userIndexWriteBytes: UInt = 0u,
    public var logFileReads: UInt = 0u,
    public var logFileReadBytes: UInt = 0u,
    public var logFileWrites: UInt = 0u,
    public var logFileWriteBytes: UInt = 0u,
    public var allocate: NtfsStatistics4 = NtfsStatistics4(),
    public var diskResourcesExhausted: UInt = 0u,
)

public data class NtfsStatistics4(
    public var calls: UInt = 0u,
    public var clusters: UInt = 0u,
    public var hints: UInt = 0u,
    public var runsReturned: UInt = 0u,
    public var hintsHonored: UInt = 0u,
    public var hintsClusters: UInt = 0u,
    public var cache: UInt = 0u,
    public var cacheClusters: UInt = 0u,
    public var cacheMiss: UInt = 0u,
    public var cacheMissClusters: UInt = 0u,
)

public data class NtfsStatistics2(
    public var write: UShort = 0u,
    public var create: UShort = 0u,
    public var setInfo: UShort = 0u,
)

public data class NtfsStatistics1(
    public var write: UShort = 0u,
    public var create: UShort = 0u,
    public var setInfo: UShort = 0u,
    public var flush: UShort = 0u,
)

public data class NtfsStatistics3(
    public var write: UShort = 0u,
    public var create: UShort = 0u,
    public var setInfo: UShort = 0u,
    public var flush: UShort = 0u,
)

public data class NtfsStatistics0(
    public var write: UShort = 0u,
    public var create: UShort = 0u,
    public var setInfo: UShort = 0u,
    public var flush: UShort = 0u,
)

public class NtfsStatisticsEx(
    public var logFileFullExceptions: UInt = 0u,
    public var otherExceptions: UInt = 0u,
    public var mftReads: ULong = 0uL,
    public var mftReadBytes: ULong = 0uL,
    public var mftWrites: ULong = 0uL,
    public var mftWriteBytes: ULong = 0uL,
    public var mftWritesUserLevel: NtfsStatisticsEx0 = NtfsStatisticsEx0(),
    public var mftWritesFlushForLogFileFull: UInt = 0u,
    public var mftWritesLazyWriter: UInt = 0u,
    public var mftWritesUserRequest: UInt = 0u,
    public var mft2Writes: ULong = 0uL,
    public var mft2WriteBytes: ULong = 0uL,
    public var mft2WritesUserLevel: NtfsStatisticsEx1 = NtfsStatisticsEx1(),
    public var mft2WritesFlushForLogFileFull: UInt = 0u,
    public var mft2WritesLazyWriter: UInt = 0u,
    public var mft2WritesUserRequest: UInt = 0u,
    public var rootIndexReads: ULong = 0uL,
    public var rootIndexReadBytes: ULong = 0uL,
    public var rootIndexWrites: ULong = 0uL,
    public var rootIndexWriteBytes: ULong = 0uL,
    public var bitmapReads: ULong = 0uL,
    public var bitmapReadBytes: ULong = 0uL,
    public var bitmapWrites: ULong = 0uL,
    public var bitmapWriteBytes: ULong = 0uL,
    public var bitmapWritesFlushForLogFileFull: UInt = 0u,
    public var bitmapWritesLazyWriter: UInt = 0u,
    public var bitmapWritesUserRequest: UInt = 0u,
    public var bitmapWritesUserLevel: NtfsStatisticsEx2 = NtfsStatisticsEx2(),
    public var mftBitmapReads: ULong = 0uL,
    public var mftBitmapReadBytes: ULong = 0uL,
    public var mftBitmapWrites: ULong = 0uL,
    public var mftBitmapWriteBytes: ULong = 0uL,
    public var mftBitmapWritesFlushForLogFileFull: UInt = 0u,
    public var mftBitmapWritesLazyWriter: UInt = 0u,
    public var mftBitmapWritesUserRequest: UInt = 0u,
    public var mftBitmapWritesUserLevel: NtfsStatisticsEx3 = NtfsStatisticsEx3(),
    public var userIndexReads: ULong = 0uL,
    public var userIndexReadBytes: ULong = 0uL,
    public var userIndexWrites: ULong = 0uL,
    public var userIndexWriteBytes: ULong = 0uL,
    public var logFileReads: ULong = 0uL,
    public var logFileReadBytes: ULong = 0uL,
    public var logFileWrites: ULong = 0uL,
    public var logFileWriteBytes: ULong = 0uL,
    public var allocate: NtfsStatisticsEx4 = NtfsStatisticsEx4(),
    public var diskResourcesExhausted: UInt = 0u,
    public var volumeTrimCount: ULong = 0uL,
    public var volumeTrimTime: ULong = 0uL,
    public var volumeTrimByteCount: ULong = 0uL,
    public var fileLevelTrimCount: ULong = 0uL,
    public var fileLevelTrimTime: ULong = 0uL,
    public var fileLevelTrimByteCount: ULong = 0uL,
    public var volumeTrimSkippedCount: ULong = 0uL,
    public var volumeTrimSkippedByteCount: ULong = 0uL,
    public var ntfsFillStatInfoFromMftRecordCalledCount: ULong = 0uL,
    public var ntfsFillStatInfoFromMftRecordBailedBecauseOfAttributeListCount: ULong = 0uL,
    public var ntfsFillStatInfoFromMftRecordBailedBecauseOfNonResReparsePointCount: ULong = 0uL,
)

public data class NtfsStatisticsEx4(
    public var calls: UInt = 0u,
    public var runsReturned: UInt = 0u,
    public var hints: UInt = 0u,
    public var hintsHonored: UInt = 0u,
    public var cache: UInt = 0u,
    public var cacheMiss: UInt = 0u,
    public var clusters: ULong = 0uL,
    public var hintsClusters: ULong = 0uL,
    public var cacheClusters: ULong = 0uL,
    public var cacheMissClusters: ULong = 0uL,
)

public data class NtfsStatisticsEx2(
    public var write: UInt = 0u,
    public var create: UInt = 0u,
    public var setInfo: UInt = 0u,
    public var flush: UInt = 0u,
)

public data class NtfsStatisticsEx1(
    public var write: UInt = 0u,
    public var create: UInt = 0u,
    public var setInfo: UInt = 0u,
    public var flush: UInt = 0u,
)

public data class NtfsStatisticsEx3(
    public var write: UInt = 0u,
    public var create: UInt = 0u,
    public var setInfo: UInt = 0u,
    public var flush: UInt = 0u,
)

public data class NtfsStatisticsEx0(
    public var write: UInt = 0u,
    public var create: UInt = 0u,
    public var setInfo: UInt = 0u,
    public var flush: UInt = 0u,
)

public data class NtfsVolumeDataBuffer(
    public var volumeSerialNumber: Long = 0L,
    public var numberSectors: Long = 0L,
    public var totalClusters: Long = 0L,
    public var freeClusters: Long = 0L,
    public var totalReserved: Long = 0L,
    public var bytesPerSector: UInt = 0u,
    public var bytesPerCluster: UInt = 0u,
    public var bytesPerFileRecordSegment: UInt = 0u,
    public var clustersPerFileRecordSegment: UInt = 0u,
    public var mftValidDataLength: Long = 0L,
    public var mftStartLcn: Long = 0L,
    public var mft2StartLcn: Long = 0L,
    public var mftZoneStart: Long = 0L,
    public var mftZoneEnd: Long = 0L,
)

public data class PartitionInformation(
    public var startingOffset: Long = 0L,
    public var partitionLength: Long = 0L,
    public var hiddenSectors: UInt = 0u,
    public var partitionNumber: UInt = 0u,
    public var partitionType: UByte = 0u,
    public var bootIndicator: Boolean = false,
    public var recognizedPartition: Boolean = false,
    public var rewritePartition: Boolean = false,
)

public data class PartitionInformationEx(
    public var partitionStyle: PartitionStyle = 0,
    public var startingOffset: Long = 0L,
    public var partitionLength: Long = 0L,
    public var partitionNumber: UInt = 0u,
    public var rewritePartition: Boolean = false,
    public var isServicePartition: Boolean = false,
    public var anonymous: PartitionInformationEx0 = PartitionInformationEx0(),
)

public data class PartitionInformationEx0(public var mbr: PartitionInformationMbr = PartitionInformationMbr(), public var gpt: PartitionInformationGpt = PartitionInformationGpt())

public data class PartitionInformationGpt(
    public var partitionType: Guid = Guid(),
    public var partitionId: Guid = Guid(),
    public var attributes: GptAttributes = 0uL,
    public var name: UShortArray = UShortArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PartitionInformationGpt) return false
        if (this.partitionType != other.partitionType) return false
        if (this.partitionId != other.partitionId) return false
        if (this.attributes != other.attributes) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.partitionType.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class PartitionInformationMbr(
    public var partitionType: UByte = 0u,
    public var bootIndicator: Boolean = false,
    public var recognizedPartition: Boolean = false,
    public var hiddenSectors: UInt = 0u,
    public var partitionId: Guid = Guid(),
)

public data class PathnameBuffer(public var pathNameLength: UInt = 0u, public var name: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PathnameBuffer) return false
        if (this.pathNameLength != other.pathNameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pathNameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class PerfBin(
    public var numberOfBins: UInt = 0u,
    public var typeOfBin: UInt = 0u,
    public var binsRanges: List<BinRange> = List(1) { BinRange() },
)

public data class PersistentReserveCommand(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var anonymous: PersistentReserveCommand0 = PersistentReserveCommand0(),
)

public data class PersistentReserveCommand0(public var prIn: PersistentReserveCommand00 = PersistentReserveCommand00(), public var prOut: PersistentReserveCommand01 = PersistentReserveCommand01())

public data class PersistentReserveCommand00(public var bitfield: UByte = 0u, public var allocationLength: UShort = 0u)
