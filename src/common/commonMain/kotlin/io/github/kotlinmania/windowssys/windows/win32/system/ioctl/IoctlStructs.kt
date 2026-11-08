@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.SID
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_ID_128
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.STORAGE_BUS_TYPE

public data class ASYNC_DUPLICATE_EXTENTS_STATUS(
    public var Version: UInt = 0u,
    public var State: DUPLICATE_EXTENTS_STATE = 0,
    public var SourceFileOffset: ULong = 0uL,
    public var TargetFileOffset: ULong = 0uL,
    public var ByteCount: ULong = 0uL,
    public var BytesDuplicated: ULong = 0uL,
)

public data class BIN_COUNT(public var BinRange: BIN_RANGE = BIN_RANGE(), public var BinCount: UInt = 0u)

public data class BIN_RANGE(public var StartValue: Long = 0L, public var Length: Long = 0L)

public data class BIN_RESULTS(public var NumberOfBins: UInt = 0u, public var BinCounts: List<BIN_COUNT> = List(1) { BIN_COUNT() })

public data class BOOT_AREA_INFO(public var BootSectorCount: UInt = 0u, public var BootSectors: List<BOOT_AREA_INFO_0> = List(2) { BOOT_AREA_INFO_0() })

public data class BOOT_AREA_INFO_0(public var Offset: Long = 0L)

public data class BULK_SECURITY_TEST_DATA(public var DesiredAccess: UInt = 0u, public var SecurityIds: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BULK_SECURITY_TEST_DATA) return false
        if (this.DesiredAccess != other.DesiredAccess) return false
        if (!this.SecurityIds.contentEquals(other.SecurityIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DesiredAccess.hashCode()
        result = 31 * result + this.SecurityIds.contentHashCode()
        return result
    }
}

public data class CHANGER_ELEMENT(public var ElementType: ELEMENT_TYPE = 0, public var ElementAddress: UInt = 0u)

public data class CHANGER_ELEMENT_LIST(public var Element: CHANGER_ELEMENT = CHANGER_ELEMENT(), public var NumberOfElements: UInt = 0u)

public data class CHANGER_ELEMENT_STATUS(
    public var Element: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var SrcElementAddress: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Flags: CHANGER_ELEMENT_STATUS_FLAGS = 0u,
    public var ExceptionCode: UInt = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var PrimaryVolumeID: UByteArray = UByteArray(36),
    public var AlternateVolumeID: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CHANGER_ELEMENT_STATUS) return false
        if (this.Element != other.Element) return false
        if (this.SrcElementAddress != other.SrcElementAddress) return false
        if (this.Flags != other.Flags) return false
        if (this.ExceptionCode != other.ExceptionCode) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.PrimaryVolumeID.contentEquals(other.PrimaryVolumeID)) return false
        if (!this.AlternateVolumeID.contentEquals(other.AlternateVolumeID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Element.hashCode()
        result = 31 * result + this.SrcElementAddress.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.ExceptionCode.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.PrimaryVolumeID.contentHashCode()
        result = 31 * result + this.AlternateVolumeID.contentHashCode()
        return result
    }
}

public data class CHANGER_ELEMENT_STATUS_EX(
    public var Element: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var SrcElementAddress: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Flags: CHANGER_ELEMENT_STATUS_FLAGS = 0u,
    public var ExceptionCode: UInt = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var PrimaryVolumeID: UByteArray = UByteArray(36),
    public var AlternateVolumeID: UByteArray = UByteArray(36),
    public var VendorIdentification: UByteArray = UByteArray(8),
    public var ProductIdentification: UByteArray = UByteArray(16),
    public var SerialNumber: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CHANGER_ELEMENT_STATUS_EX) return false
        if (this.Element != other.Element) return false
        if (this.SrcElementAddress != other.SrcElementAddress) return false
        if (this.Flags != other.Flags) return false
        if (this.ExceptionCode != other.ExceptionCode) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.PrimaryVolumeID.contentEquals(other.PrimaryVolumeID)) return false
        if (!this.AlternateVolumeID.contentEquals(other.AlternateVolumeID)) return false
        if (!this.VendorIdentification.contentEquals(other.VendorIdentification)) return false
        if (!this.ProductIdentification.contentEquals(other.ProductIdentification)) return false
        if (!this.SerialNumber.contentEquals(other.SerialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Element.hashCode()
        result = 31 * result + this.SrcElementAddress.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.ExceptionCode.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.PrimaryVolumeID.contentHashCode()
        result = 31 * result + this.AlternateVolumeID.contentHashCode()
        result = 31 * result + this.VendorIdentification.contentHashCode()
        result = 31 * result + this.ProductIdentification.contentHashCode()
        result = 31 * result + this.SerialNumber.contentHashCode()
        return result
    }
}

public data class CHANGER_EXCHANGE_MEDIUM(
    public var Transport: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Source: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Destination1: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Destination2: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Flip1: Boolean = false,
    public var Flip2: Boolean = false,
)

public data class CHANGER_INITIALIZE_ELEMENT_STATUS(public var ElementList: CHANGER_ELEMENT_LIST = CHANGER_ELEMENT_LIST(), public var BarCodeScan: Boolean = false)

public data class CHANGER_MOVE_MEDIUM(
    public var Transport: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Source: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Destination: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Flip: Boolean = false,
)

public data class CHANGER_PRODUCT_DATA(
    public var VendorId: UByteArray = UByteArray(8),
    public var ProductId: UByteArray = UByteArray(16),
    public var Revision: UByteArray = UByteArray(4),
    public var SerialNumber: UByteArray = UByteArray(32),
    public var DeviceType: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CHANGER_PRODUCT_DATA) return false
        if (!this.VendorId.contentEquals(other.VendorId)) return false
        if (!this.ProductId.contentEquals(other.ProductId)) return false
        if (!this.Revision.contentEquals(other.Revision)) return false
        if (!this.SerialNumber.contentEquals(other.SerialNumber)) return false
        if (this.DeviceType != other.DeviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VendorId.contentHashCode()
        result = 31 * result + this.ProductId.contentHashCode()
        result = 31 * result + this.Revision.contentHashCode()
        result = 31 * result + this.SerialNumber.contentHashCode()
        result = 31 * result + this.DeviceType.hashCode()
        return result
    }
}

public data class CHANGER_READ_ELEMENT_STATUS(public var ElementList: CHANGER_ELEMENT_LIST = CHANGER_ELEMENT_LIST(), public var VolumeTagInfo: Boolean = false)

public data class CHANGER_SEND_VOLUME_TAG_INFORMATION(
    public var StartingElement: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var ActionCode: UInt = 0u,
    public var VolumeIDTemplate: UByteArray = UByteArray(40),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CHANGER_SEND_VOLUME_TAG_INFORMATION) return false
        if (this.StartingElement != other.StartingElement) return false
        if (this.ActionCode != other.ActionCode) return false
        if (!this.VolumeIDTemplate.contentEquals(other.VolumeIDTemplate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.StartingElement.hashCode()
        result = 31 * result + this.ActionCode.hashCode()
        result = 31 * result + this.VolumeIDTemplate.contentHashCode()
        return result
    }
}

public data class CHANGER_SET_ACCESS(public var Element: CHANGER_ELEMENT = CHANGER_ELEMENT(), public var Control: UInt = 0u)

public data class CHANGER_SET_POSITION(
    public var Transport: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Destination: CHANGER_ELEMENT = CHANGER_ELEMENT(),
    public var Flip: Boolean = false,
)

public data class CLASS_MEDIA_CHANGE_CONTEXT(public var MediaChangeCount: UInt = 0u, public var NewState: UInt = 0u)

public data class CLUSTER_RANGE(public var StartingCluster: Long = 0L, public var ClusterCount: Long = 0L)

public data class CONTAINER_ROOT_INFO_INPUT(public var Flags: UInt = 0u)

public data class CONTAINER_ROOT_INFO_OUTPUT(public var ContainerRootIdLength: UShort = 0u, public var ContainerRootId: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CONTAINER_ROOT_INFO_OUTPUT) return false
        if (this.ContainerRootIdLength != other.ContainerRootIdLength) return false
        if (!this.ContainerRootId.contentEquals(other.ContainerRootId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ContainerRootIdLength.hashCode()
        result = 31 * result + this.ContainerRootId.contentHashCode()
        return result
    }
}

public data class CONTAINER_VOLUME_STATE(public var Flags: UInt = 0u)

public data class CREATE_DISK(public var PartitionStyle: PARTITION_STYLE = 0, public var Anonymous: CREATE_DISK_0 = CREATE_DISK_0())

public data class CREATE_DISK_0(public var Mbr: CREATE_DISK_MBR = CREATE_DISK_MBR(), public var Gpt: CREATE_DISK_GPT = CREATE_DISK_GPT())

public data class CREATE_DISK_GPT(public var DiskId: GUID = GUID(), public var MaxPartitionCount: UInt = 0u)

public data class CREATE_DISK_MBR(public var Signature: UInt = 0u)

public data class CREATE_USN_JOURNAL_DATA(public var MaximumSize: ULong = 0uL, public var AllocationDelta: ULong = 0uL)

public data class CSV_CONTROL_PARAM(public var Operation: CSV_CONTROL_OP = 0, public var Unused: Long = 0L)

public data class CSV_IS_OWNED_BY_CSVFS(public var OwnedByCSVFS: Boolean = false)

public data class CSV_MGMT_LOCK(public var Flags: UInt = 0u)

public data class CSV_NAMESPACE_INFO(
    public var Version: UInt = 0u,
    public var DeviceNumber: UInt = 0u,
    public var StartingOffset: Long = 0L,
    public var SectorSize: UInt = 0u,
)

public data class CSV_QUERY_FILE_REVISION(public var FileId: Long = 0L, public var FileRevision: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CSV_QUERY_FILE_REVISION) return false
        if (this.FileId != other.FileId) return false
        if (!this.FileRevision.contentEquals(other.FileRevision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileId.hashCode()
        result = 31 * result + this.FileRevision.contentHashCode()
        return result
    }
}

public data class CSV_QUERY_FILE_REVISION_FILE_ID_128(public var FileId: FILE_ID_128 = FILE_ID_128(), public var FileRevision: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CSV_QUERY_FILE_REVISION_FILE_ID_128) return false
        if (this.FileId != other.FileId) return false
        if (!this.FileRevision.contentEquals(other.FileRevision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileId.hashCode()
        result = 31 * result + this.FileRevision.contentHashCode()
        return result
    }
}

public data class CSV_QUERY_MDS_PATH(
    public var MdsNodeId: UInt = 0u,
    public var DsNodeId: UInt = 0u,
    public var PathLength: UInt = 0u,
    public var Path: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CSV_QUERY_MDS_PATH) return false
        if (this.MdsNodeId != other.MdsNodeId) return false
        if (this.DsNodeId != other.DsNodeId) return false
        if (this.PathLength != other.PathLength) return false
        if (!this.Path.contentEquals(other.Path)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MdsNodeId.hashCode()
        result = 31 * result + this.DsNodeId.hashCode()
        result = 31 * result + this.PathLength.hashCode()
        result = 31 * result + this.Path.contentHashCode()
        return result
    }
}

public data class CSV_QUERY_MDS_PATH_V2(
    public var Version: Long = 0L,
    public var RequiredSize: UInt = 0u,
    public var MdsNodeId: UInt = 0u,
    public var DsNodeId: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DiskConnectivity: CSVFS_DISK_CONNECTIVITY = 0,
    public var VolumeId: GUID = GUID(),
    public var IpAddressOffset: UInt = 0u,
    public var IpAddressLength: UInt = 0u,
    public var PathOffset: UInt = 0u,
    public var PathLength: UInt = 0u,
)

public data class CSV_QUERY_REDIRECT_STATE(
    public var MdsNodeId: UInt = 0u,
    public var DsNodeId: UInt = 0u,
    public var FileRedirected: Boolean = false,
)

public data class CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT(
    public var VetoedFromAltitudeIntegral: ULong = 0uL,
    public var VetoedFromAltitudeDecimal: ULong = 0uL,
    public var Reason: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT) return false
        if (this.VetoedFromAltitudeIntegral != other.VetoedFromAltitudeIntegral) return false
        if (this.VetoedFromAltitudeDecimal != other.VetoedFromAltitudeDecimal) return false
        if (!this.Reason.contentEquals(other.Reason)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VetoedFromAltitudeIntegral.hashCode()
        result = 31 * result + this.VetoedFromAltitudeDecimal.hashCode()
        result = 31 * result + this.Reason.contentHashCode()
        return result
    }
}

public data class CSV_QUERY_VOLUME_ID(public var VolumeId: GUID = GUID())

public data class CSV_QUERY_VOLUME_REDIRECT_STATE(
    public var MdsNodeId: UInt = 0u,
    public var DsNodeId: UInt = 0u,
    public var IsDiskConnected: Boolean = false,
    public var ClusterEnableDirectIo: Boolean = false,
    public var DiskConnectivity: CSVFS_DISK_CONNECTIVITY = 0,
)

public data class CSV_SET_VOLUME_ID(public var VolumeId: GUID = GUID())

public data class DECRYPTION_STATUS_BUFFER(public var NoEncryptedStreams: Boolean = false)

public data class DELETE_USN_JOURNAL_DATA(public var UsnJournalID: ULong = 0uL, public var DeleteFlags: USN_DELETE_FLAGS = 0u)

public data class DEVICEDUMP_PRIVATE_SUBSECTION(
    public var dwFlags: UInt = 0u,
    public var GPLogId: GP_LOG_PAGE_DESCRIPTOR = GP_LOG_PAGE_DESCRIPTOR(),
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICEDUMP_PRIVATE_SUBSECTION) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.GPLogId != other.GPLogId) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.GPLogId.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }
}

public data class DEVICEDUMP_PUBLIC_SUBSECTION(
    public var dwFlags: UInt = 0u,
    public var GPLogTable: List<GP_LOG_PAGE_DESCRIPTOR> = List(16) { GP_LOG_PAGE_DESCRIPTOR() },
    public var szDescription: ByteArray = ByteArray(16),
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICEDUMP_PUBLIC_SUBSECTION) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.GPLogTable != other.GPLogTable) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.GPLogTable.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }
}

public data class DEVICEDUMP_RESTRICTED_SUBSECTION(public var bData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICEDUMP_RESTRICTED_SUBSECTION) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bData.contentHashCode()
    }
}

public data class DEVICEDUMP_SECTION_HEADER(
    public var guidDeviceDataId: GUID = GUID(),
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
        if (other !is DEVICEDUMP_SECTION_HEADER) return false
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

public data class DEVICEDUMP_STORAGEDEVICE_DATA(
    public var Descriptor: DEVICEDUMP_STRUCTURE_VERSION = DEVICEDUMP_STRUCTURE_VERSION(),
    public var SectionHeader: DEVICEDUMP_SECTION_HEADER = DEVICEDUMP_SECTION_HEADER(),
    public var dwBufferSize: UInt = 0u,
    public var dwReasonForCollection: UInt = 0u,
    public var PublicData: DEVICEDUMP_SUBSECTION_POINTER = DEVICEDUMP_SUBSECTION_POINTER(),
    public var RestrictedData: DEVICEDUMP_SUBSECTION_POINTER = DEVICEDUMP_SUBSECTION_POINTER(),
    public var PrivateData: DEVICEDUMP_SUBSECTION_POINTER = DEVICEDUMP_SUBSECTION_POINTER(),
)

public data class DEVICEDUMP_STORAGESTACK_PUBLIC_DUMP(
    public var Descriptor: DEVICEDUMP_STRUCTURE_VERSION = DEVICEDUMP_STRUCTURE_VERSION(),
    public var dwReasonForCollection: UInt = 0u,
    public var cDriverName: UByteArray = UByteArray(16),
    public var uiNumRecords: UInt = 0u,
    public var RecordArray: List<DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD> = List(1) { DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICEDUMP_STORAGESTACK_PUBLIC_DUMP) return false
        if (this.Descriptor != other.Descriptor) return false
        if (this.dwReasonForCollection != other.dwReasonForCollection) return false
        if (!this.cDriverName.contentEquals(other.cDriverName)) return false
        if (this.uiNumRecords != other.uiNumRecords) return false
        if (this.RecordArray != other.RecordArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Descriptor.hashCode()
        result = 31 * result + this.dwReasonForCollection.hashCode()
        result = 31 * result + this.cDriverName.contentHashCode()
        result = 31 * result + this.uiNumRecords.hashCode()
        result = 31 * result + this.RecordArray.hashCode()
        return result
    }
}

public data class DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD(
    public var Cdb: UByteArray = UByteArray(16),
    public var Command: UByteArray = UByteArray(16),
    public var StartTime: ULong = 0uL,
    public var EndTime: ULong = 0uL,
    public var OperationStatus: UInt = 0u,
    public var OperationError: UInt = 0u,
    public var StackSpecific: DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0 = DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD) return false
        if (!this.Cdb.contentEquals(other.Cdb)) return false
        if (!this.Command.contentEquals(other.Command)) return false
        if (this.StartTime != other.StartTime) return false
        if (this.EndTime != other.EndTime) return false
        if (this.OperationStatus != other.OperationStatus) return false
        if (this.OperationError != other.OperationError) return false
        if (this.StackSpecific != other.StackSpecific) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Cdb.contentHashCode()
        result = 31 * result + this.Command.contentHashCode()
        result = 31 * result + this.StartTime.hashCode()
        result = 31 * result + this.EndTime.hashCode()
        result = 31 * result + this.OperationStatus.hashCode()
        result = 31 * result + this.OperationError.hashCode()
        result = 31 * result + this.StackSpecific.hashCode()
        return result
    }
}

public data class DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0(
    public var ExternalStack: DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_0 = DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_0(),
    public var AtaPort: DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_1 = DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_1(),
    public var StorPort: DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_2 = DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_2(),
)

public data class DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_1(public var dwAtaPortSpecific: UInt = 0u)

public data class DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_0(public var dwReserved: UInt = 0u)

public data class DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_2(public var SrbTag: UInt = 0u)

public data class DEVICEDUMP_STRUCTURE_VERSION(
    public var dwSignature: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
)

public data class DEVICEDUMP_SUBSECTION_POINTER(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwOffset: UInt = 0u,
)

public data class DEVICE_COPY_OFFLOAD_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var MaximumTokenLifetime: UInt = 0u,
    public var DefaultTokenLifetime: UInt = 0u,
    public var MaximumTransferSize: ULong = 0uL,
    public var OptimalTransferCount: ULong = 0uL,
    public var MaximumDataDescriptors: UInt = 0u,
    public var MaximumTransferLengthPerDescriptor: UInt = 0u,
    public var OptimalTransferLengthPerDescriptor: UInt = 0u,
    public var OptimalTransferLengthGranularity: UShort = 0u,
    public var Reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_COPY_OFFLOAD_DESCRIPTOR) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.MaximumTokenLifetime != other.MaximumTokenLifetime) return false
        if (this.DefaultTokenLifetime != other.DefaultTokenLifetime) return false
        if (this.MaximumTransferSize != other.MaximumTransferSize) return false
        if (this.OptimalTransferCount != other.OptimalTransferCount) return false
        if (this.MaximumDataDescriptors != other.MaximumDataDescriptors) return false
        if (this.MaximumTransferLengthPerDescriptor != other.MaximumTransferLengthPerDescriptor) return false
        if (this.OptimalTransferLengthPerDescriptor != other.OptimalTransferLengthPerDescriptor) return false
        if (this.OptimalTransferLengthGranularity != other.OptimalTransferLengthGranularity) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.MaximumTokenLifetime.hashCode()
        result = 31 * result + this.DefaultTokenLifetime.hashCode()
        result = 31 * result + this.MaximumTransferSize.hashCode()
        result = 31 * result + this.OptimalTransferCount.hashCode()
        result = 31 * result + this.MaximumDataDescriptors.hashCode()
        result = 31 * result + this.MaximumTransferLengthPerDescriptor.hashCode()
        result = 31 * result + this.OptimalTransferLengthPerDescriptor.hashCode()
        result = 31 * result + this.OptimalTransferLengthGranularity.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class DEVICE_DATA_SET_LBP_STATE_PARAMETERS(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var OutputVersion: UInt = 0u,
)

public data class DEVICE_DATA_SET_LB_PROVISIONING_STATE(
    public var Size: UInt = 0u,
    public var Version: UInt = 0u,
    public var SlabSizeInBytes: ULong = 0uL,
    public var SlabOffsetDeltaInBytes: UInt = 0u,
    public var SlabAllocationBitMapBitCount: UInt = 0u,
    public var SlabAllocationBitMapLength: UInt = 0u,
    public var SlabAllocationBitMap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_DATA_SET_LB_PROVISIONING_STATE) return false
        if (this.Size != other.Size) return false
        if (this.Version != other.Version) return false
        if (this.SlabSizeInBytes != other.SlabSizeInBytes) return false
        if (this.SlabOffsetDeltaInBytes != other.SlabOffsetDeltaInBytes) return false
        if (this.SlabAllocationBitMapBitCount != other.SlabAllocationBitMapBitCount) return false
        if (this.SlabAllocationBitMapLength != other.SlabAllocationBitMapLength) return false
        if (!this.SlabAllocationBitMap.contentEquals(other.SlabAllocationBitMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.SlabSizeInBytes.hashCode()
        result = 31 * result + this.SlabOffsetDeltaInBytes.hashCode()
        result = 31 * result + this.SlabAllocationBitMapBitCount.hashCode()
        result = 31 * result + this.SlabAllocationBitMapLength.hashCode()
        result = 31 * result + this.SlabAllocationBitMap.contentHashCode()
        return result
    }
}

public data class DEVICE_DATA_SET_LB_PROVISIONING_STATE_V2(
    public var Size: UInt = 0u,
    public var Version: UInt = 0u,
    public var SlabSizeInBytes: ULong = 0uL,
    public var SlabOffsetDeltaInBytes: ULong = 0uL,
    public var SlabAllocationBitMapBitCount: UInt = 0u,
    public var SlabAllocationBitMapLength: UInt = 0u,
    public var SlabAllocationBitMap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_DATA_SET_LB_PROVISIONING_STATE_V2) return false
        if (this.Size != other.Size) return false
        if (this.Version != other.Version) return false
        if (this.SlabSizeInBytes != other.SlabSizeInBytes) return false
        if (this.SlabOffsetDeltaInBytes != other.SlabOffsetDeltaInBytes) return false
        if (this.SlabAllocationBitMapBitCount != other.SlabAllocationBitMapBitCount) return false
        if (this.SlabAllocationBitMapLength != other.SlabAllocationBitMapLength) return false
        if (!this.SlabAllocationBitMap.contentEquals(other.SlabAllocationBitMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.SlabSizeInBytes.hashCode()
        result = 31 * result + this.SlabOffsetDeltaInBytes.hashCode()
        result = 31 * result + this.SlabAllocationBitMapBitCount.hashCode()
        result = 31 * result + this.SlabAllocationBitMapLength.hashCode()
        result = 31 * result + this.SlabAllocationBitMap.contentHashCode()
        return result
    }
}

public data class DEVICE_DATA_SET_RANGE(public var StartingOffset: Long = 0L, public var LengthInBytes: ULong = 0uL)

public data class DEVICE_DATA_SET_REPAIR_OUTPUT(public var ParityExtent: DEVICE_DATA_SET_RANGE = DEVICE_DATA_SET_RANGE())

public data class DEVICE_DATA_SET_REPAIR_PARAMETERS(
    public var NumberOfRepairCopies: UInt = 0u,
    public var SourceCopy: UInt = 0u,
    public var RepairCopies: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_DATA_SET_REPAIR_PARAMETERS) return false
        if (this.NumberOfRepairCopies != other.NumberOfRepairCopies) return false
        if (this.SourceCopy != other.SourceCopy) return false
        if (!this.RepairCopies.contentEquals(other.RepairCopies)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumberOfRepairCopies.hashCode()
        result = 31 * result + this.SourceCopy.hashCode()
        result = 31 * result + this.RepairCopies.contentHashCode()
        return result
    }
}

public data class DEVICE_DATA_SET_SCRUB_EX_OUTPUT(
    public var BytesProcessed: ULong = 0uL,
    public var BytesRepaired: ULong = 0uL,
    public var BytesFailed: ULong = 0uL,
    public var ParityExtent: DEVICE_DATA_SET_RANGE = DEVICE_DATA_SET_RANGE(),
    public var BytesScrubbed: ULong = 0uL,
)

public data class DEVICE_DATA_SET_SCRUB_OUTPUT(
    public var BytesProcessed: ULong = 0uL,
    public var BytesRepaired: ULong = 0uL,
    public var BytesFailed: ULong = 0uL,
)

public data class DEVICE_DATA_SET_TOPOLOGY_ID_QUERY_OUTPUT(public var TopologyRangeBytes: ULong = 0uL, public var TopologyId: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_DATA_SET_TOPOLOGY_ID_QUERY_OUTPUT) return false
        if (this.TopologyRangeBytes != other.TopologyRangeBytes) return false
        if (!this.TopologyId.contentEquals(other.TopologyId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TopologyRangeBytes.hashCode()
        result = 31 * result + this.TopologyId.contentHashCode()
        return result
    }
}

public data class DEVICE_DSM_CONVERSION_OUTPUT(public var Version: UInt = 0u, public var Source: GUID = GUID())

public data class DEVICE_DSM_DEFINITION(
    public var Action: UInt = 0u,
    public var SingleRange: Boolean = false,
    public var ParameterBlockAlignment: UInt = 0u,
    public var ParameterBlockLength: UInt = 0u,
    public var HasOutput: Boolean = false,
    public var OutputBlockAlignment: UInt = 0u,
    public var OutputBlockLength: UInt = 0u,
)

public data class DEVICE_DSM_FREE_SPACE_OUTPUT(public var Version: UInt = 0u, public var FreeSpace: ULong = 0uL)

public data class DEVICE_DSM_LOST_QUERY_OUTPUT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Alignment: ULong = 0uL,
    public var NumberOfBits: UInt = 0u,
    public var BitMap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_DSM_LOST_QUERY_OUTPUT) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Alignment != other.Alignment) return false
        if (this.NumberOfBits != other.NumberOfBits) return false
        if (!this.BitMap.contentEquals(other.BitMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Alignment.hashCode()
        result = 31 * result + this.NumberOfBits.hashCode()
        result = 31 * result + this.BitMap.contentHashCode()
        return result
    }
}

public data class DEVICE_DSM_LOST_QUERY_PARAMETERS(public var Version: UInt = 0u, public var Granularity: ULong = 0uL)

public data class DEVICE_DSM_NOTIFICATION_PARAMETERS(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var NumFileTypeIDs: UInt = 0u,
    public var FileTypeID: List<GUID> = List(1) { GUID() },
)

public data class DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS(
    public var Size: UInt = 0u,
    public var TargetPriority: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS) return false
        if (this.Size != other.Size) return false
        if (this.TargetPriority != other.TargetPriority) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.TargetPriority.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class DEVICE_DSM_OFFLOAD_READ_PARAMETERS(
    public var Flags: UInt = 0u,
    public var TimeToLive: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_DSM_OFFLOAD_READ_PARAMETERS) return false
        if (this.Flags != other.Flags) return false
        if (this.TimeToLive != other.TimeToLive) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.TimeToLive.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class DEVICE_DSM_OFFLOAD_WRITE_PARAMETERS(
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var TokenOffset: ULong = 0uL,
    public var Token: STORAGE_OFFLOAD_TOKEN = STORAGE_OFFLOAD_TOKEN(),
)

public data class DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TotalNumberOfRanges: UInt = 0u,
    public var NumberOfRangesReturned: UInt = 0u,
    public var Ranges: List<DEVICE_STORAGE_ADDRESS_RANGE> = List(1) { DEVICE_STORAGE_ADDRESS_RANGE() },
)

public data class DEVICE_DSM_RANGE_ERROR_INFO(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TotalNumberOfRanges: UInt = 0u,
    public var NumberOfRangesReturned: UInt = 0u,
    public var Ranges: List<DEVICE_STORAGE_RANGE_ATTRIBUTES> = List(1) { DEVICE_STORAGE_RANGE_ATTRIBUTES() },
)

public data class DEVICE_DSM_REPORT_ZONES_DATA(
    public var Size: UInt = 0u,
    public var ZoneCount: UInt = 0u,
    public var Attributes: STORAGE_ZONES_ATTRIBUTES = 0,
    public var Reserved0: UInt = 0u,
    public var ZoneDescriptors: List<STORAGE_ZONE_DESCRIPTOR> = List(1) { STORAGE_ZONE_DESCRIPTOR() },
)

public data class DEVICE_DSM_REPORT_ZONES_PARAMETERS(
    public var Size: UInt = 0u,
    public var ReportOption: UByte = 0u,
    public var Partial: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_DSM_REPORT_ZONES_PARAMETERS) return false
        if (this.Size != other.Size) return false
        if (this.ReportOption != other.ReportOption) return false
        if (this.Partial != other.Partial) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.ReportOption.hashCode()
        result = 31 * result + this.Partial.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class DEVICE_DSM_TIERING_QUERY_INPUT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var NumberOfTierIds: UInt = 0u,
    public var TierIds: List<GUID> = List(1) { GUID() },
)

public data class DEVICE_DSM_TIERING_QUERY_OUTPUT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Alignment: ULong = 0uL,
    public var TotalNumberOfRegions: UInt = 0u,
    public var NumberOfRegionsReturned: UInt = 0u,
    public var Regions: List<STORAGE_TIER_REGION> = List(1) { STORAGE_TIER_REGION() },
)

public data class DEVICE_INTERNAL_STATUS_DATA(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var T10VendorId: ULong = 0uL,
    public var DataSet1Length: UInt = 0u,
    public var DataSet2Length: UInt = 0u,
    public var DataSet3Length: UInt = 0u,
    public var DataSet4Length: UInt = 0u,
    public var StatusDataVersion: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var ReasonIdentifier: UByteArray = UByteArray(128),
    public var StatusDataLength: UInt = 0u,
    public var StatusData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_INTERNAL_STATUS_DATA) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.T10VendorId != other.T10VendorId) return false
        if (this.DataSet1Length != other.DataSet1Length) return false
        if (this.DataSet2Length != other.DataSet2Length) return false
        if (this.DataSet3Length != other.DataSet3Length) return false
        if (this.DataSet4Length != other.DataSet4Length) return false
        if (this.StatusDataVersion != other.StatusDataVersion) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.ReasonIdentifier.contentEquals(other.ReasonIdentifier)) return false
        if (this.StatusDataLength != other.StatusDataLength) return false
        if (!this.StatusData.contentEquals(other.StatusData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.T10VendorId.hashCode()
        result = 31 * result + this.DataSet1Length.hashCode()
        result = 31 * result + this.DataSet2Length.hashCode()
        result = 31 * result + this.DataSet3Length.hashCode()
        result = 31 * result + this.DataSet4Length.hashCode()
        result = 31 * result + this.StatusDataVersion.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.ReasonIdentifier.contentHashCode()
        result = 31 * result + this.StatusDataLength.hashCode()
        result = 31 * result + this.StatusData.contentHashCode()
        return result
    }
}

public data class DEVICE_LB_PROVISIONING_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var _bitfield: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(7),
    public var OptimalUnmapGranularity: ULong = 0uL,
    public var UnmapGranularityAlignment: ULong = 0uL,
    public var MaxUnmapLbaCount: UInt = 0u,
    public var MaxUnmapBlockDescriptorCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_LB_PROVISIONING_DESCRIPTOR) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.OptimalUnmapGranularity != other.OptimalUnmapGranularity) return false
        if (this.UnmapGranularityAlignment != other.UnmapGranularityAlignment) return false
        if (this.MaxUnmapLbaCount != other.MaxUnmapLbaCount) return false
        if (this.MaxUnmapBlockDescriptorCount != other.MaxUnmapBlockDescriptorCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.OptimalUnmapGranularity.hashCode()
        result = 31 * result + this.UnmapGranularityAlignment.hashCode()
        result = 31 * result + this.MaxUnmapLbaCount.hashCode()
        result = 31 * result + this.MaxUnmapBlockDescriptorCount.hashCode()
        return result
    }
}

public data class DEVICE_LOCATION(
    public var Socket: UInt = 0u,
    public var Slot: UInt = 0u,
    public var Adapter: UInt = 0u,
    public var Port: UInt = 0u,
    public var Anonymous: DEVICE_LOCATION_0 = DEVICE_LOCATION_0(),
)

public data class DEVICE_LOCATION_0(public var Anonymous1: DEVICE_LOCATION_0_0 = DEVICE_LOCATION_0_0(), public var Anonymous2: DEVICE_LOCATION_0_1 = DEVICE_LOCATION_0_1())

public data class DEVICE_LOCATION_0_0(public var Channel: UInt = 0u, public var Device: UInt = 0u)

public data class DEVICE_LOCATION_0_1(public var Target: UInt = 0u, public var Lun: UInt = 0u)

public data class DEVICE_MANAGE_DATA_SET_ATTRIBUTES(
    public var Size: UInt = 0u,
    public var Action: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ParameterBlockOffset: UInt = 0u,
    public var ParameterBlockLength: UInt = 0u,
    public var DataSetRangesOffset: UInt = 0u,
    public var DataSetRangesLength: UInt = 0u,
)

public data class DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT(
    public var Size: UInt = 0u,
    public var Action: UInt = 0u,
    public var Flags: UInt = 0u,
    public var OperationStatus: UInt = 0u,
    public var ExtendedError: UInt = 0u,
    public var TargetDetailedError: UInt = 0u,
    public var ReservedStatus: UInt = 0u,
    public var OutputBlockOffset: UInt = 0u,
    public var OutputBlockLength: UInt = 0u,
)

public data class DEVICE_MEDIA_INFO(public var DeviceSpecific: DEVICE_MEDIA_INFO_0 = DEVICE_MEDIA_INFO_0())

public data class DEVICE_MEDIA_INFO_0(
    public var DiskInfo: DEVICE_MEDIA_INFO_0_0 = DEVICE_MEDIA_INFO_0_0(),
    public var RemovableDiskInfo: DEVICE_MEDIA_INFO_0_1 = DEVICE_MEDIA_INFO_0_1(),
    public var TapeInfo: DEVICE_MEDIA_INFO_0_2 = DEVICE_MEDIA_INFO_0_2(),
)

public data class DEVICE_MEDIA_INFO_0_0(
    public var Cylinders: Long = 0L,
    public var MediaType: STORAGE_MEDIA_TYPE = 0,
    public var TracksPerCylinder: UInt = 0u,
    public var SectorsPerTrack: UInt = 0u,
    public var BytesPerSector: UInt = 0u,
    public var NumberMediaSides: UInt = 0u,
    public var MediaCharacteristics: UInt = 0u,
)

public data class DEVICE_MEDIA_INFO_0_1(
    public var Cylinders: Long = 0L,
    public var MediaType: STORAGE_MEDIA_TYPE = 0,
    public var TracksPerCylinder: UInt = 0u,
    public var SectorsPerTrack: UInt = 0u,
    public var BytesPerSector: UInt = 0u,
    public var NumberMediaSides: UInt = 0u,
    public var MediaCharacteristics: UInt = 0u,
)

public data class DEVICE_MEDIA_INFO_0_2(
    public var MediaType: STORAGE_MEDIA_TYPE = 0,
    public var MediaCharacteristics: UInt = 0u,
    public var CurrentBlockSize: UInt = 0u,
    public var BusType: STORAGE_BUS_TYPE = 0,
    public var BusSpecificData: DEVICE_MEDIA_INFO_0_2_0 = DEVICE_MEDIA_INFO_0_2_0(),
)

public data class DEVICE_MEDIA_INFO_0_2_0(public var ScsiInformation: DEVICE_MEDIA_INFO_0_2_0_0 = DEVICE_MEDIA_INFO_0_2_0_0())

public data class DEVICE_MEDIA_INFO_0_2_0_0(public var MediumType: UByte = 0u, public var DensityCode: UByte = 0u)

public data class DEVICE_POWER_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DeviceAttentionSupported: Boolean = false,
    public var AsynchronousNotificationSupported: Boolean = false,
    public var IdlePowerManagementEnabled: Boolean = false,
    public var D3ColdEnabled: Boolean = false,
    public var D3ColdSupported: Boolean = false,
    public var NoVerifyDuringIdlePower: Boolean = false,
    public var Reserved: UByteArray = UByteArray(2),
    public var IdleTimeoutInMS: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_POWER_DESCRIPTOR) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.DeviceAttentionSupported != other.DeviceAttentionSupported) return false
        if (this.AsynchronousNotificationSupported != other.AsynchronousNotificationSupported) return false
        if (this.IdlePowerManagementEnabled != other.IdlePowerManagementEnabled) return false
        if (this.D3ColdEnabled != other.D3ColdEnabled) return false
        if (this.D3ColdSupported != other.D3ColdSupported) return false
        if (this.NoVerifyDuringIdlePower != other.NoVerifyDuringIdlePower) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.IdleTimeoutInMS != other.IdleTimeoutInMS) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.DeviceAttentionSupported.hashCode()
        result = 31 * result + this.AsynchronousNotificationSupported.hashCode()
        result = 31 * result + this.IdlePowerManagementEnabled.hashCode()
        result = 31 * result + this.D3ColdEnabled.hashCode()
        result = 31 * result + this.D3ColdSupported.hashCode()
        result = 31 * result + this.NoVerifyDuringIdlePower.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.IdleTimeoutInMS.hashCode()
        return result
    }
}

public data class DEVICE_SEEK_PENALTY_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var IncursSeekPenalty: Boolean = false,
)

public data class DEVICE_STORAGE_ADDRESS_RANGE(public var StartAddress: Long = 0L, public var LengthInBytes: ULong = 0uL)

public data class DEVICE_STORAGE_RANGE_ATTRIBUTES(
    public var LengthInBytes: ULong = 0uL,
    public var Anonymous: DEVICE_STORAGE_RANGE_ATTRIBUTES_0 = DEVICE_STORAGE_RANGE_ATTRIBUTES_0(),
    public var Reserved: UInt = 0u,
)

public data class DEVICE_STORAGE_RANGE_ATTRIBUTES_0(public var AllFlags: UInt = 0u, public var Anonymous: DEVICE_STORAGE_RANGE_ATTRIBUTES_0_0 = DEVICE_STORAGE_RANGE_ATTRIBUTES_0_0())

public data class DEVICE_STORAGE_RANGE_ATTRIBUTES_0_0(public var _bitfield: UInt = 0u)

public data class DEVICE_TRIM_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var TrimEnabled: Boolean = false,
)

public data class DEVICE_WRITE_AGGREGATION_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var BenefitsFromWriteAggregation: Boolean = false,
)

public data class DISK_CACHE_INFORMATION(
    public var ParametersSavable: Boolean = false,
    public var ReadCacheEnabled: Boolean = false,
    public var WriteCacheEnabled: Boolean = false,
    public var ReadRetentionPriority: DISK_CACHE_RETENTION_PRIORITY = 0,
    public var WriteRetentionPriority: DISK_CACHE_RETENTION_PRIORITY = 0,
    public var DisablePrefetchTransferLength: UShort = 0u,
    public var PrefetchScalar: Boolean = false,
    public var Anonymous: DISK_CACHE_INFORMATION_0 = DISK_CACHE_INFORMATION_0(),
)

public data class DISK_CACHE_INFORMATION_0(public var ScalarPrefetch: DISK_CACHE_INFORMATION_0_0 = DISK_CACHE_INFORMATION_0_0(), public var BlockPrefetch: DISK_CACHE_INFORMATION_0_1 = DISK_CACHE_INFORMATION_0_1())

public data class DISK_CACHE_INFORMATION_0_1(public var Minimum: UShort = 0u, public var Maximum: UShort = 0u)

public data class DISK_CACHE_INFORMATION_0_0(
    public var Minimum: UShort = 0u,
    public var Maximum: UShort = 0u,
    public var MaximumBlocks: UShort = 0u,
)

public data class DISK_CONTROLLER_NUMBER(public var ControllerNumber: UInt = 0u, public var DiskNumber: UInt = 0u)

public data class DISK_DETECTION_INFO(
    public var SizeOfDetectInfo: UInt = 0u,
    public var DetectionType: DETECTION_TYPE = 0,
    public var Anonymous: DISK_DETECTION_INFO_0 = DISK_DETECTION_INFO_0(),
)

public data class DISK_DETECTION_INFO_0(public var Anonymous: DISK_DETECTION_INFO_0_0 = DISK_DETECTION_INFO_0_0())

public data class DISK_DETECTION_INFO_0_0(public var Int13: DISK_INT13_INFO = DISK_INT13_INFO(), public var ExInt13: DISK_EX_INT13_INFO = DISK_EX_INT13_INFO())

public data class DISK_EXTENT(
    public var DiskNumber: UInt = 0u,
    public var StartingOffset: Long = 0L,
    public var ExtentLength: Long = 0L,
)

public data class DISK_EX_INT13_INFO(
    public var ExBufferSize: UShort = 0u,
    public var ExFlags: UShort = 0u,
    public var ExCylinders: UInt = 0u,
    public var ExHeads: UInt = 0u,
    public var ExSectorsPerTrack: UInt = 0u,
    public var ExSectorsPerDrive: ULong = 0uL,
    public var ExSectorSize: UShort = 0u,
    public var ExReserved: UShort = 0u,
)

public data class DISK_GEOMETRY(
    public var Cylinders: Long = 0L,
    public var MediaType: MEDIA_TYPE = 0,
    public var TracksPerCylinder: UInt = 0u,
    public var SectorsPerTrack: UInt = 0u,
    public var BytesPerSector: UInt = 0u,
)

public data class DISK_GEOMETRY_EX(
    public var Geometry: DISK_GEOMETRY = DISK_GEOMETRY(),
    public var DiskSize: Long = 0L,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DISK_GEOMETRY_EX) return false
        if (this.Geometry != other.Geometry) return false
        if (this.DiskSize != other.DiskSize) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Geometry.hashCode()
        result = 31 * result + this.DiskSize.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class DISK_GROW_PARTITION(public var PartitionNumber: UInt = 0u, public var BytesToGrow: Long = 0L)

public data class DISK_HISTOGRAM(
    public var DiskSize: Long = 0L,
    public var Start: Long = 0L,
    public var End: Long = 0L,
    public var Average: Long = 0L,
    public var AverageRead: Long = 0L,
    public var AverageWrite: Long = 0L,
    public var Granularity: UInt = 0u,
    public var Size: UInt = 0u,
    public var ReadCount: UInt = 0u,
    public var WriteCount: UInt = 0u,
    public var Histogram: Long = 0L,
)

public data class DISK_INT13_INFO(
    public var DriveSelect: UShort = 0u,
    public var MaxCylinders: UInt = 0u,
    public var SectorsPerTrack: UShort = 0u,
    public var MaxHeads: UShort = 0u,
    public var NumberDrives: UShort = 0u,
)

public data class DISK_LOGGING(
    public var Function: UByte = 0u,
    public var BufferAddress: Long = 0L,
    public var BufferSize: UInt = 0u,
)

public data class DISK_PARTITION_INFO(
    public var SizeOfPartitionInfo: UInt = 0u,
    public var PartitionStyle: PARTITION_STYLE = 0,
    public var Anonymous: DISK_PARTITION_INFO_0 = DISK_PARTITION_INFO_0(),
)

public data class DISK_PARTITION_INFO_0(public var Mbr: DISK_PARTITION_INFO_0_0 = DISK_PARTITION_INFO_0_0(), public var Gpt: DISK_PARTITION_INFO_0_1 = DISK_PARTITION_INFO_0_1())

public data class DISK_PARTITION_INFO_0_1(public var DiskId: GUID = GUID())

public data class DISK_PARTITION_INFO_0_0(public var Signature: UInt = 0u, public var CheckSum: UInt = 0u)

public data class DISK_PERFORMANCE(
    public var BytesRead: Long = 0L,
    public var BytesWritten: Long = 0L,
    public var ReadTime: Long = 0L,
    public var WriteTime: Long = 0L,
    public var IdleTime: Long = 0L,
    public var ReadCount: UInt = 0u,
    public var WriteCount: UInt = 0u,
    public var QueueDepth: UInt = 0u,
    public var SplitCount: UInt = 0u,
    public var QueryTime: Long = 0L,
    public var StorageDeviceNumber: UInt = 0u,
    public var StorageManagerName: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DISK_PERFORMANCE) return false
        if (this.BytesRead != other.BytesRead) return false
        if (this.BytesWritten != other.BytesWritten) return false
        if (this.ReadTime != other.ReadTime) return false
        if (this.WriteTime != other.WriteTime) return false
        if (this.IdleTime != other.IdleTime) return false
        if (this.ReadCount != other.ReadCount) return false
        if (this.WriteCount != other.WriteCount) return false
        if (this.QueueDepth != other.QueueDepth) return false
        if (this.SplitCount != other.SplitCount) return false
        if (this.QueryTime != other.QueryTime) return false
        if (this.StorageDeviceNumber != other.StorageDeviceNumber) return false
        if (!this.StorageManagerName.contentEquals(other.StorageManagerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BytesRead.hashCode()
        result = 31 * result + this.BytesWritten.hashCode()
        result = 31 * result + this.ReadTime.hashCode()
        result = 31 * result + this.WriteTime.hashCode()
        result = 31 * result + this.IdleTime.hashCode()
        result = 31 * result + this.ReadCount.hashCode()
        result = 31 * result + this.WriteCount.hashCode()
        result = 31 * result + this.QueueDepth.hashCode()
        result = 31 * result + this.SplitCount.hashCode()
        result = 31 * result + this.QueryTime.hashCode()
        result = 31 * result + this.StorageDeviceNumber.hashCode()
        result = 31 * result + this.StorageManagerName.contentHashCode()
        return result
    }
}

public data class DISK_RECORD(
    public var ByteOffset: Long = 0L,
    public var StartTime: Long = 0L,
    public var EndTime: Long = 0L,
    public var VirtualAddress: Long = 0L,
    public var NumberOfBytes: UInt = 0u,
    public var DeviceNumber: UByte = 0u,
    public var ReadRequest: Boolean = false,
)

public data class DRIVERSTATUS(
    public var bDriverError: UByte = 0u,
    public var bIDEError: UByte = 0u,
    public var bReserved: UByteArray = UByteArray(2),
    public var dwReserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DRIVERSTATUS) return false
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

public data class DRIVE_LAYOUT_INFORMATION(
    public var PartitionCount: UInt = 0u,
    public var Signature: UInt = 0u,
    public var PartitionEntry: List<PARTITION_INFORMATION> = List(1) { PARTITION_INFORMATION() },
)

public data class DRIVE_LAYOUT_INFORMATION_EX(
    public var PartitionStyle: UInt = 0u,
    public var PartitionCount: UInt = 0u,
    public var Anonymous: DRIVE_LAYOUT_INFORMATION_EX_0 = DRIVE_LAYOUT_INFORMATION_EX_0(),
    public var PartitionEntry: List<PARTITION_INFORMATION_EX> = List(1) { PARTITION_INFORMATION_EX() },
)

public data class DRIVE_LAYOUT_INFORMATION_EX_0(public var Mbr: DRIVE_LAYOUT_INFORMATION_MBR = DRIVE_LAYOUT_INFORMATION_MBR(), public var Gpt: DRIVE_LAYOUT_INFORMATION_GPT = DRIVE_LAYOUT_INFORMATION_GPT())

public data class DRIVE_LAYOUT_INFORMATION_GPT(
    public var DiskId: GUID = GUID(),
    public var StartingUsableOffset: Long = 0L,
    public var UsableLength: Long = 0L,
    public var MaxPartitionCount: UInt = 0u,
)

public data class DRIVE_LAYOUT_INFORMATION_MBR(public var Signature: UInt = 0u, public var CheckSum: UInt = 0u)

public data class DUPLICATE_EXTENTS_DATA(
    public var FileHandle: HANDLE = 0L,
    public var SourceFileOffset: Long = 0L,
    public var TargetFileOffset: Long = 0L,
    public var ByteCount: Long = 0L,
)

public data class DUPLICATE_EXTENTS_DATA32(
    public var FileHandle: UInt = 0u,
    public var SourceFileOffset: Long = 0L,
    public var TargetFileOffset: Long = 0L,
    public var ByteCount: Long = 0L,
)

public data class DUPLICATE_EXTENTS_DATA_EX(
    public var Size: ULong = 0uL,
    public var FileHandle: HANDLE = 0L,
    public var SourceFileOffset: Long = 0L,
    public var TargetFileOffset: Long = 0L,
    public var ByteCount: Long = 0L,
    public var Flags: UInt = 0u,
)

public data class DUPLICATE_EXTENTS_DATA_EX32(
    public var Size: UInt = 0u,
    public var FileHandle: UInt = 0u,
    public var SourceFileOffset: Long = 0L,
    public var TargetFileOffset: Long = 0L,
    public var ByteCount: Long = 0L,
    public var Flags: UInt = 0u,
)

public data class ENCRYPTED_DATA_INFO(
    public var StartingFileOffset: ULong = 0uL,
    public var OutputBufferOffset: UInt = 0u,
    public var BytesWithinFileSize: UInt = 0u,
    public var BytesWithinValidDataLength: UInt = 0u,
    public var CompressionFormat: UShort = 0u,
    public var DataUnitShift: UByte = 0u,
    public var ChunkShift: UByte = 0u,
    public var ClusterShift: UByte = 0u,
    public var EncryptionFormat: UByte = 0u,
    public var NumberOfDataBlocks: UShort = 0u,
    public var DataBlockSize: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENCRYPTED_DATA_INFO) return false
        if (this.StartingFileOffset != other.StartingFileOffset) return false
        if (this.OutputBufferOffset != other.OutputBufferOffset) return false
        if (this.BytesWithinFileSize != other.BytesWithinFileSize) return false
        if (this.BytesWithinValidDataLength != other.BytesWithinValidDataLength) return false
        if (this.CompressionFormat != other.CompressionFormat) return false
        if (this.DataUnitShift != other.DataUnitShift) return false
        if (this.ChunkShift != other.ChunkShift) return false
        if (this.ClusterShift != other.ClusterShift) return false
        if (this.EncryptionFormat != other.EncryptionFormat) return false
        if (this.NumberOfDataBlocks != other.NumberOfDataBlocks) return false
        if (!this.DataBlockSize.contentEquals(other.DataBlockSize)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.StartingFileOffset.hashCode()
        result = 31 * result + this.OutputBufferOffset.hashCode()
        result = 31 * result + this.BytesWithinFileSize.hashCode()
        result = 31 * result + this.BytesWithinValidDataLength.hashCode()
        result = 31 * result + this.CompressionFormat.hashCode()
        result = 31 * result + this.DataUnitShift.hashCode()
        result = 31 * result + this.ChunkShift.hashCode()
        result = 31 * result + this.ClusterShift.hashCode()
        result = 31 * result + this.EncryptionFormat.hashCode()
        result = 31 * result + this.NumberOfDataBlocks.hashCode()
        result = 31 * result + this.DataBlockSize.contentHashCode()
        return result
    }
}

public data class ENCRYPTION_BUFFER(public var EncryptionOperation: UInt = 0u, public var Private: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENCRYPTION_BUFFER) return false
        if (this.EncryptionOperation != other.EncryptionOperation) return false
        if (!this.Private.contentEquals(other.Private)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EncryptionOperation.hashCode()
        result = 31 * result + this.Private.contentHashCode()
        return result
    }
}

public data class ENCRYPTION_KEY_CTRL_INPUT(
    public var HeaderSize: UInt = 0u,
    public var StructureSize: UInt = 0u,
    public var KeyOffset: UShort = 0u,
    public var KeySize: UShort = 0u,
    public var DplLock: UInt = 0u,
    public var DplUserId: ULong = 0uL,
    public var DplCredentialId: ULong = 0uL,
)

public data class EXFAT_STATISTICS(
    public var CreateHits: UInt = 0u,
    public var SuccessfulCreates: UInt = 0u,
    public var FailedCreates: UInt = 0u,
    public var NonCachedReads: UInt = 0u,
    public var NonCachedReadBytes: UInt = 0u,
    public var NonCachedWrites: UInt = 0u,
    public var NonCachedWriteBytes: UInt = 0u,
    public var NonCachedDiskReads: UInt = 0u,
    public var NonCachedDiskWrites: UInt = 0u,
)

public data class EXTENDED_ENCRYPTED_DATA_INFO(
    public var ExtendedCode: UInt = 0u,
    public var Length: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class FAT_STATISTICS(
    public var CreateHits: UInt = 0u,
    public var SuccessfulCreates: UInt = 0u,
    public var FailedCreates: UInt = 0u,
    public var NonCachedReads: UInt = 0u,
    public var NonCachedReadBytes: UInt = 0u,
    public var NonCachedWrites: UInt = 0u,
    public var NonCachedWriteBytes: UInt = 0u,
    public var NonCachedDiskReads: UInt = 0u,
    public var NonCachedDiskWrites: UInt = 0u,
)

public data class FILESYSTEM_STATISTICS(
    public var FileSystemType: FILESYSTEM_STATISTICS_TYPE = 0u,
    public var Version: UShort = 0u,
    public var SizeOfCompleteStructure: UInt = 0u,
    public var UserFileReads: UInt = 0u,
    public var UserFileReadBytes: UInt = 0u,
    public var UserDiskReads: UInt = 0u,
    public var UserFileWrites: UInt = 0u,
    public var UserFileWriteBytes: UInt = 0u,
    public var UserDiskWrites: UInt = 0u,
    public var MetaDataReads: UInt = 0u,
    public var MetaDataReadBytes: UInt = 0u,
    public var MetaDataDiskReads: UInt = 0u,
    public var MetaDataWrites: UInt = 0u,
    public var MetaDataWriteBytes: UInt = 0u,
    public var MetaDataDiskWrites: UInt = 0u,
)

public data class FILESYSTEM_STATISTICS_EX(
    public var FileSystemType: FILESYSTEM_STATISTICS_TYPE = 0u,
    public var Version: UShort = 0u,
    public var SizeOfCompleteStructure: UInt = 0u,
    public var UserFileReads: ULong = 0uL,
    public var UserFileReadBytes: ULong = 0uL,
    public var UserDiskReads: ULong = 0uL,
    public var UserFileWrites: ULong = 0uL,
    public var UserFileWriteBytes: ULong = 0uL,
    public var UserDiskWrites: ULong = 0uL,
    public var MetaDataReads: ULong = 0uL,
    public var MetaDataReadBytes: ULong = 0uL,
    public var MetaDataDiskReads: ULong = 0uL,
    public var MetaDataWrites: ULong = 0uL,
    public var MetaDataWriteBytes: ULong = 0uL,
    public var MetaDataDiskWrites: ULong = 0uL,
)

public data class FILE_ALLOCATED_RANGE_BUFFER(public var FileOffset: Long = 0L, public var Length: Long = 0L)

public data class FILE_DESIRED_STORAGE_CLASS_INFORMATION(public var Class: FILE_STORAGE_TIER_CLASS = 0, public var Flags: UInt = 0u)

public data class FILE_FS_PERSISTENT_VOLUME_INFORMATION(
    public var VolumeFlags: UInt = 0u,
    public var FlagMask: UInt = 0u,
    public var Version: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class FILE_INITIATE_REPAIR_OUTPUT_BUFFER(
    public var Hint1: ULong = 0uL,
    public var Hint2: ULong = 0uL,
    public var Clsn: ULong = 0uL,
    public var Status: UInt = 0u,
)

public data class FILE_LAYOUT_ENTRY(
    public var Version: UInt = 0u,
    public var NextFileOffset: UInt = 0u,
    public var Flags: UInt = 0u,
    public var FileAttributes: UInt = 0u,
    public var FileReferenceNumber: ULong = 0uL,
    public var FirstNameOffset: UInt = 0u,
    public var FirstStreamOffset: UInt = 0u,
    public var ExtraInfoOffset: UInt = 0u,
    public var ExtraInfoLength: UInt = 0u,
)

public data class FILE_LAYOUT_INFO_ENTRY(
    public var BasicInformation: FILE_LAYOUT_INFO_ENTRY_0 = FILE_LAYOUT_INFO_ENTRY_0(),
    public var OwnerId: UInt = 0u,
    public var SecurityId: UInt = 0u,
    public var Usn: Long = 0L,
    public var StorageReserveId: STORAGE_RESERVE_ID = 0,
)

public data class FILE_LAYOUT_INFO_ENTRY_0(
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var FileAttributes: UInt = 0u,
)

public data class FILE_LAYOUT_NAME_ENTRY(
    public var NextNameOffset: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ParentFileReferenceNumber: ULong = 0uL,
    public var FileNameLength: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_LAYOUT_NAME_ENTRY) return false
        if (this.NextNameOffset != other.NextNameOffset) return false
        if (this.Flags != other.Flags) return false
        if (this.ParentFileReferenceNumber != other.ParentFileReferenceNumber) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextNameOffset.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.ParentFileReferenceNumber.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_LEVEL_TRIM(
    public var Key: UInt = 0u,
    public var NumRanges: UInt = 0u,
    public var Ranges: List<FILE_LEVEL_TRIM_RANGE> = List(1) { FILE_LEVEL_TRIM_RANGE() },
)

public data class FILE_LEVEL_TRIM_OUTPUT(public var NumRangesProcessed: UInt = 0u)

public data class FILE_LEVEL_TRIM_RANGE(public var Offset: ULong = 0uL, public var Length: ULong = 0uL)

public data class FILE_MAKE_COMPATIBLE_BUFFER(public var CloseDisc: Boolean = false)

public data class FILE_OBJECTID_BUFFER(public var ObjectId: UByteArray = UByteArray(16), public var Anonymous: FILE_OBJECTID_BUFFER_0 = FILE_OBJECTID_BUFFER_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_OBJECTID_BUFFER) return false
        if (!this.ObjectId.contentEquals(other.ObjectId)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ObjectId.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class FILE_OBJECTID_BUFFER_0(public var Anonymous: FILE_OBJECTID_BUFFER_0_0 = FILE_OBJECTID_BUFFER_0_0(), public var ExtendedInfo: UByteArray = UByteArray(48)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_OBJECTID_BUFFER_0) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.ExtendedInfo.contentEquals(other.ExtendedInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.ExtendedInfo.contentHashCode()
        return result
    }
}

public data class FILE_OBJECTID_BUFFER_0_0(
    public var BirthVolumeId: UByteArray = UByteArray(16),
    public var BirthObjectId: UByteArray = UByteArray(16),
    public var DomainId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_OBJECTID_BUFFER_0_0) return false
        if (!this.BirthVolumeId.contentEquals(other.BirthVolumeId)) return false
        if (!this.BirthObjectId.contentEquals(other.BirthObjectId)) return false
        if (!this.DomainId.contentEquals(other.DomainId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BirthVolumeId.contentHashCode()
        result = 31 * result + this.BirthObjectId.contentHashCode()
        result = 31 * result + this.DomainId.contentHashCode()
        return result
    }
}

public data class FILE_PREFETCH(
    public var Type: UInt = 0u,
    public var Count: UInt = 0u,
    public var Prefetch: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_PREFETCH) return false
        if (this.Type != other.Type) return false
        if (this.Count != other.Count) return false
        if (!this.Prefetch.contentEquals(other.Prefetch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.Count.hashCode()
        result = 31 * result + this.Prefetch.contentHashCode()
        return result
    }
}

public data class FILE_PREFETCH_EX(
    public var Type: UInt = 0u,
    public var Count: UInt = 0u,
    public var Context: Long = 0L,
    public var Prefetch: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_PREFETCH_EX) return false
        if (this.Type != other.Type) return false
        if (this.Count != other.Count) return false
        if (this.Context != other.Context) return false
        if (!this.Prefetch.contentEquals(other.Prefetch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.Count.hashCode()
        result = 31 * result + this.Context.hashCode()
        result = 31 * result + this.Prefetch.contentHashCode()
        return result
    }
}

public data class FILE_PROVIDER_EXTERNAL_INFO_V0(public var Version: UInt = 0u, public var Algorithm: UInt = 0u)

public data class FILE_PROVIDER_EXTERNAL_INFO_V1(
    public var Version: UInt = 0u,
    public var Algorithm: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class FILE_QUERY_ON_DISK_VOL_INFO_BUFFER(
    public var DirectoryCount: Long = 0L,
    public var FileCount: Long = 0L,
    public var FsFormatMajVersion: UShort = 0u,
    public var FsFormatMinVersion: UShort = 0u,
    public var FsFormatName: UShortArray = UShortArray(12),
    public var FormatTime: Long = 0L,
    public var LastUpdateTime: Long = 0L,
    public var CopyrightInfo: UShortArray = UShortArray(34),
    public var AbstractInfo: UShortArray = UShortArray(34),
    public var FormattingImplementationInfo: UShortArray = UShortArray(34),
    public var LastModifyingImplementationInfo: UShortArray = UShortArray(34),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_QUERY_ON_DISK_VOL_INFO_BUFFER) return false
        if (this.DirectoryCount != other.DirectoryCount) return false
        if (this.FileCount != other.FileCount) return false
        if (this.FsFormatMajVersion != other.FsFormatMajVersion) return false
        if (this.FsFormatMinVersion != other.FsFormatMinVersion) return false
        if (!this.FsFormatName.contentEquals(other.FsFormatName)) return false
        if (this.FormatTime != other.FormatTime) return false
        if (this.LastUpdateTime != other.LastUpdateTime) return false
        if (!this.CopyrightInfo.contentEquals(other.CopyrightInfo)) return false
        if (!this.AbstractInfo.contentEquals(other.AbstractInfo)) return false
        if (!this.FormattingImplementationInfo.contentEquals(other.FormattingImplementationInfo)) return false
        if (!this.LastModifyingImplementationInfo.contentEquals(other.LastModifyingImplementationInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DirectoryCount.hashCode()
        result = 31 * result + this.FileCount.hashCode()
        result = 31 * result + this.FsFormatMajVersion.hashCode()
        result = 31 * result + this.FsFormatMinVersion.hashCode()
        result = 31 * result + this.FsFormatName.contentHashCode()
        result = 31 * result + this.FormatTime.hashCode()
        result = 31 * result + this.LastUpdateTime.hashCode()
        result = 31 * result + this.CopyrightInfo.contentHashCode()
        result = 31 * result + this.AbstractInfo.contentHashCode()
        result = 31 * result + this.FormattingImplementationInfo.contentHashCode()
        result = 31 * result + this.LastModifyingImplementationInfo.contentHashCode()
        return result
    }
}

public data class FILE_QUERY_SPARING_BUFFER(
    public var SparingUnitBytes: UInt = 0u,
    public var SoftwareSparing: Boolean = false,
    public var TotalSpareBlocks: UInt = 0u,
    public var FreeSpareBlocks: UInt = 0u,
)

public data class FILE_REFERENCE_RANGE(public var StartingFileReferenceNumber: ULong = 0uL, public var EndingFileReferenceNumber: ULong = 0uL)

public data class FILE_REGION_INFO(
    public var FileOffset: Long = 0L,
    public var Length: Long = 0L,
    public var Usage: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class FILE_REGION_INPUT(
    public var FileOffset: Long = 0L,
    public var Length: Long = 0L,
    public var DesiredUsage: UInt = 0u,
)

public data class FILE_REGION_OUTPUT(
    public var Flags: UInt = 0u,
    public var TotalRegionEntryCount: UInt = 0u,
    public var RegionEntryCount: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Region: List<FILE_REGION_INFO> = List(1) { FILE_REGION_INFO() },
)

public data class FILE_SET_DEFECT_MGMT_BUFFER(public var Disable: Boolean = false)

public data class FILE_SET_SPARSE_BUFFER(public var SetSparse: Boolean = false)

public data class FILE_STORAGE_TIER(
    public var Id: GUID = GUID(),
    public var Name: UShortArray = UShortArray(256),
    public var Description: UShortArray = UShortArray(256),
    public var Flags: ULong = 0uL,
    public var ProvisionedCapacity: ULong = 0uL,
    public var MediaType: FILE_STORAGE_TIER_MEDIA_TYPE = 0,
    public var Class: FILE_STORAGE_TIER_CLASS = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_STORAGE_TIER) return false
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

public data class FILE_STORAGE_TIER_REGION(
    public var TierId: GUID = GUID(),
    public var Offset: ULong = 0uL,
    public var Length: ULong = 0uL,
)

public data class FILE_SYSTEM_RECOGNITION_INFORMATION(public var FileSystem: ByteArray = ByteArray(9)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_SYSTEM_RECOGNITION_INFORMATION) return false
        if (!this.FileSystem.contentEquals(other.FileSystem)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.FileSystem.contentHashCode()
    }
}

public data class FILE_TYPE_NOTIFICATION_INPUT(
    public var Flags: UInt = 0u,
    public var NumFileTypeIDs: UInt = 0u,
    public var FileTypeID: List<GUID> = List(1) { GUID() },
)

public data class FILE_ZERO_DATA_INFORMATION(public var FileOffset: Long = 0L, public var BeyondFinalZero: Long = 0L)

public data class FILE_ZERO_DATA_INFORMATION_EX(
    public var FileOffset: Long = 0L,
    public var BeyondFinalZero: Long = 0L,
    public var Flags: UInt = 0u,
)

public data class FIND_BY_SID_DATA(public var Restart: UInt = 0u, public var Sid: SID = SID())

public data class FIND_BY_SID_OUTPUT(
    public var NextEntryOffset: UInt = 0u,
    public var FileIndex: UInt = 0u,
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FIND_BY_SID_OUTPUT) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.FileIndex != other.FileIndex) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.FileIndex.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FORMAT_EX_PARAMETERS(
    public var MediaType: MEDIA_TYPE = 0,
    public var StartCylinderNumber: UInt = 0u,
    public var EndCylinderNumber: UInt = 0u,
    public var StartHeadNumber: UInt = 0u,
    public var EndHeadNumber: UInt = 0u,
    public var FormatGapLength: UShort = 0u,
    public var SectorsPerTrack: UShort = 0u,
    public var SectorNumber: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FORMAT_EX_PARAMETERS) return false
        if (this.MediaType != other.MediaType) return false
        if (this.StartCylinderNumber != other.StartCylinderNumber) return false
        if (this.EndCylinderNumber != other.EndCylinderNumber) return false
        if (this.StartHeadNumber != other.StartHeadNumber) return false
        if (this.EndHeadNumber != other.EndHeadNumber) return false
        if (this.FormatGapLength != other.FormatGapLength) return false
        if (this.SectorsPerTrack != other.SectorsPerTrack) return false
        if (!this.SectorNumber.contentEquals(other.SectorNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MediaType.hashCode()
        result = 31 * result + this.StartCylinderNumber.hashCode()
        result = 31 * result + this.EndCylinderNumber.hashCode()
        result = 31 * result + this.StartHeadNumber.hashCode()
        result = 31 * result + this.EndHeadNumber.hashCode()
        result = 31 * result + this.FormatGapLength.hashCode()
        result = 31 * result + this.SectorsPerTrack.hashCode()
        result = 31 * result + this.SectorNumber.contentHashCode()
        return result
    }
}

public data class FORMAT_PARAMETERS(
    public var MediaType: MEDIA_TYPE = 0,
    public var StartCylinderNumber: UInt = 0u,
    public var EndCylinderNumber: UInt = 0u,
    public var StartHeadNumber: UInt = 0u,
    public var EndHeadNumber: UInt = 0u,
)

public data class FSCTL_GET_INTEGRITY_INFORMATION_BUFFER(
    public var ChecksumAlgorithm: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Flags: UInt = 0u,
    public var ChecksumChunkSizeInBytes: UInt = 0u,
    public var ClusterSizeInBytes: UInt = 0u,
)

public data class FSCTL_OFFLOAD_READ_INPUT(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TokenTimeToLive: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var FileOffset: ULong = 0uL,
    public var CopyLength: ULong = 0uL,
)

public data class FSCTL_OFFLOAD_READ_OUTPUT(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TransferLength: ULong = 0uL,
    public var Token: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FSCTL_OFFLOAD_READ_OUTPUT) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.TransferLength != other.TransferLength) return false
        if (!this.Token.contentEquals(other.Token)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.TransferLength.hashCode()
        result = 31 * result + this.Token.contentHashCode()
        return result
    }
}

public data class FSCTL_OFFLOAD_WRITE_INPUT(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var FileOffset: ULong = 0uL,
    public var CopyLength: ULong = 0uL,
    public var TransferOffset: ULong = 0uL,
    public var Token: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FSCTL_OFFLOAD_WRITE_INPUT) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.FileOffset != other.FileOffset) return false
        if (this.CopyLength != other.CopyLength) return false
        if (this.TransferOffset != other.TransferOffset) return false
        if (!this.Token.contentEquals(other.Token)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.FileOffset.hashCode()
        result = 31 * result + this.CopyLength.hashCode()
        result = 31 * result + this.TransferOffset.hashCode()
        result = 31 * result + this.Token.contentHashCode()
        return result
    }
}

public data class FSCTL_OFFLOAD_WRITE_OUTPUT(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var LengthWritten: ULong = 0uL,
)

public data class FSCTL_QUERY_FAT_BPB_BUFFER(public var First0x24BytesOfBootSector: UByteArray = UByteArray(36)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FSCTL_QUERY_FAT_BPB_BUFFER) return false
        if (!this.First0x24BytesOfBootSector.contentEquals(other.First0x24BytesOfBootSector)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.First0x24BytesOfBootSector.contentHashCode()
    }
}

public data class FSCTL_QUERY_REGION_INFO_INPUT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var NumberOfTierIds: UInt = 0u,
    public var TierIds: List<GUID> = List(1) { GUID() },
)

public data class FSCTL_QUERY_REGION_INFO_OUTPUT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Alignment: ULong = 0uL,
    public var TotalNumberOfRegions: UInt = 0u,
    public var NumberOfRegionsReturned: UInt = 0u,
    public var Regions: List<FILE_STORAGE_TIER_REGION> = List(1) { FILE_STORAGE_TIER_REGION() },
)

public data class FSCTL_QUERY_STORAGE_CLASSES_OUTPUT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: FILE_STORAGE_TIER_FLAGS = 0u,
    public var TotalNumberOfTiers: UInt = 0u,
    public var NumberOfTiersReturned: UInt = 0u,
    public var Tiers: List<FILE_STORAGE_TIER> = List(1) { FILE_STORAGE_TIER() },
)

public data class FSCTL_SET_INTEGRITY_INFORMATION_BUFFER(
    public var ChecksumAlgorithm: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Flags: UInt = 0u,
)

public data class FSCTL_SET_INTEGRITY_INFORMATION_BUFFER_EX(
    public var EnableIntegrity: UByte = 0u,
    public var KeepIntegrityStateUnchanged: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var Flags: UInt = 0u,
    public var Version: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FSCTL_SET_INTEGRITY_INFORMATION_BUFFER_EX) return false
        if (this.EnableIntegrity != other.EnableIntegrity) return false
        if (this.KeepIntegrityStateUnchanged != other.KeepIntegrityStateUnchanged) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Flags != other.Flags) return false
        if (this.Version != other.Version) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EnableIntegrity.hashCode()
        result = 31 * result + this.KeepIntegrityStateUnchanged.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class FS_BPIO_INFO(
    public var ActiveBypassIoCount: UInt = 0u,
    public var StorageDriverNameLen: UShort = 0u,
    public var StorageDriverName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FS_BPIO_INFO) return false
        if (this.ActiveBypassIoCount != other.ActiveBypassIoCount) return false
        if (this.StorageDriverNameLen != other.StorageDriverNameLen) return false
        if (!this.StorageDriverName.contentEquals(other.StorageDriverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ActiveBypassIoCount.hashCode()
        result = 31 * result + this.StorageDriverNameLen.hashCode()
        result = 31 * result + this.StorageDriverName.contentHashCode()
        return result
    }
}

public data class FS_BPIO_INPUT(
    public var Operation: FS_BPIO_OPERATIONS = 0,
    public var InFlags: FS_BPIO_INFLAGS = 0,
    public var Reserved1: ULong = 0uL,
    public var Reserved2: ULong = 0uL,
)

public data class FS_BPIO_OUTPUT(
    public var Operation: FS_BPIO_OPERATIONS = 0,
    public var OutFlags: FS_BPIO_OUTFLAGS = 0,
    public var Reserved1: ULong = 0uL,
    public var Reserved2: ULong = 0uL,
    public var Anonymous: FS_BPIO_OUTPUT_0 = FS_BPIO_OUTPUT_0(),
)

public data class FS_BPIO_OUTPUT_0(
    public var Enable: FS_BPIO_RESULTS = FS_BPIO_RESULTS(),
    public var Query: FS_BPIO_RESULTS = FS_BPIO_RESULTS(),
    public var VolumeStackResume: FS_BPIO_RESULTS = FS_BPIO_RESULTS(),
    public var StreamResume: FS_BPIO_RESULTS = FS_BPIO_RESULTS(),
    public var GetInfo: FS_BPIO_INFO = FS_BPIO_INFO(),
)

public data class FS_BPIO_RESULTS(
    public var OpStatus: UInt = 0u,
    public var FailingDriverNameLen: UShort = 0u,
    public var FailingDriverName: UShortArray = UShortArray(32),
    public var FailureReasonLen: UShort = 0u,
    public var FailureReason: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FS_BPIO_RESULTS) return false
        if (this.OpStatus != other.OpStatus) return false
        if (this.FailingDriverNameLen != other.FailingDriverNameLen) return false
        if (!this.FailingDriverName.contentEquals(other.FailingDriverName)) return false
        if (this.FailureReasonLen != other.FailureReasonLen) return false
        if (!this.FailureReason.contentEquals(other.FailureReason)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OpStatus.hashCode()
        result = 31 * result + this.FailingDriverNameLen.hashCode()
        result = 31 * result + this.FailingDriverName.contentHashCode()
        result = 31 * result + this.FailureReasonLen.hashCode()
        result = 31 * result + this.FailureReason.contentHashCode()
        return result
    }
}

public data class GETVERSIONINPARAMS(
    public var bVersion: UByte = 0u,
    public var bRevision: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bIDEDeviceMap: UByte = 0u,
    public var fCapabilities: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GETVERSIONINPARAMS) return false
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

public class GET_CHANGER_PARAMETERS(
    public var Size: UInt = 0u,
    public var NumberTransportElements: UShort = 0u,
    public var NumberStorageElements: UShort = 0u,
    public var NumberCleanerSlots: UShort = 0u,
    public var NumberIEElements: UShort = 0u,
    public var NumberDataTransferElements: UShort = 0u,
    public var NumberOfDoors: UShort = 0u,
    public var FirstSlotNumber: UShort = 0u,
    public var FirstDriveNumber: UShort = 0u,
    public var FirstTransportNumber: UShort = 0u,
    public var FirstIEPortNumber: UShort = 0u,
    public var FirstCleanerSlotAddress: UShort = 0u,
    public var MagazineSize: UShort = 0u,
    public var DriveCleanTimeout: UInt = 0u,
    public var Features0: CHANGER_FEATURES = 0u,
    public var Features1: GET_CHANGER_PARAMETERS_FEATURES1 = 0u,
    public var MoveFromTransport: UByte = 0u,
    public var MoveFromSlot: UByte = 0u,
    public var MoveFromIePort: UByte = 0u,
    public var MoveFromDrive: UByte = 0u,
    public var ExchangeFromTransport: UByte = 0u,
    public var ExchangeFromSlot: UByte = 0u,
    public var ExchangeFromIePort: UByte = 0u,
    public var ExchangeFromDrive: UByte = 0u,
    public var LockUnlockCapabilities: UByte = 0u,
    public var PositionCapabilities: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(2),
    public var Reserved2: UIntArray = UIntArray(2),
)

public data class GET_DEVICE_INTERNAL_STATUS_DATA_REQUEST(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var RequestDataType: DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE = 0,
    public var RequestDataSet: DEVICE_INTERNAL_STATUS_DATA_SET = 0,
)

public data class GET_DISK_ATTRIBUTES(
    public var Version: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Attributes: ULong = 0uL,
)

public data class GET_FILTER_FILE_IDENTIFIER_INPUT(public var AltitudeLength: UShort = 0u, public var Altitude: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GET_FILTER_FILE_IDENTIFIER_INPUT) return false
        if (this.AltitudeLength != other.AltitudeLength) return false
        if (!this.Altitude.contentEquals(other.Altitude)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AltitudeLength.hashCode()
        result = 31 * result + this.Altitude.contentHashCode()
        return result
    }
}

public data class GET_FILTER_FILE_IDENTIFIER_OUTPUT(public var FilterFileIdentifierLength: UShort = 0u, public var FilterFileIdentifier: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GET_FILTER_FILE_IDENTIFIER_OUTPUT) return false
        if (this.FilterFileIdentifierLength != other.FilterFileIdentifierLength) return false
        if (!this.FilterFileIdentifier.contentEquals(other.FilterFileIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FilterFileIdentifierLength.hashCode()
        result = 31 * result + this.FilterFileIdentifier.contentHashCode()
        return result
    }
}

public data class GET_LENGTH_INFORMATION(public var Length: Long = 0L)

public data class GET_MEDIA_TYPES(
    public var DeviceType: UInt = 0u,
    public var MediaInfoCount: UInt = 0u,
    public var MediaInfo: List<DEVICE_MEDIA_INFO> = List(1) { DEVICE_MEDIA_INFO() },
)

public data class GP_LOG_PAGE_DESCRIPTOR(public var LogAddress: UShort = 0u, public var LogSectors: UShort = 0u)

public data class HISTOGRAM_BUCKET(public var Reads: UInt = 0u, public var Writes: UInt = 0u)

public data class IDEREGS(
    public var bFeaturesReg: UByte = 0u,
    public var bSectorCountReg: UByte = 0u,
    public var bSectorNumberReg: UByte = 0u,
    public var bCylLowReg: UByte = 0u,
    public var bCylHighReg: UByte = 0u,
    public var bDriveHeadReg: UByte = 0u,
    public var bCommandReg: UByte = 0u,
    public var bReserved: UByte = 0u,
)

public data class IO_IRP_EXT_TRACK_OFFSET_HEADER(
    public var Validation: UShort = 0u,
    public var Flags: UShort = 0u,
    public var TrackedOffsetCallback: PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK = null,
)

public data class LMR_QUERY_INFO_PARAM(public var Operation: LMR_QUERY_INFO_CLASS = 0)

public data class LMR_QUERY_SESSION_INFO(public var SessionId: ULong = 0uL)

public data class LOOKUP_STREAM_FROM_CLUSTER_ENTRY(
    public var OffsetToNext: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Reserved: Long = 0L,
    public var Cluster: Long = 0L,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LOOKUP_STREAM_FROM_CLUSTER_ENTRY) return false
        if (this.OffsetToNext != other.OffsetToNext) return false
        if (this.Flags != other.Flags) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Cluster != other.Cluster) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OffsetToNext.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Cluster.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class LOOKUP_STREAM_FROM_CLUSTER_INPUT(
    public var Flags: UInt = 0u,
    public var NumberOfClusters: UInt = 0u,
    public var Cluster: LongArray = LongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LOOKUP_STREAM_FROM_CLUSTER_INPUT) return false
        if (this.Flags != other.Flags) return false
        if (this.NumberOfClusters != other.NumberOfClusters) return false
        if (!this.Cluster.contentEquals(other.Cluster)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.NumberOfClusters.hashCode()
        result = 31 * result + this.Cluster.contentHashCode()
        return result
    }
}

public data class LOOKUP_STREAM_FROM_CLUSTER_OUTPUT(
    public var Offset: UInt = 0u,
    public var NumberOfMatches: UInt = 0u,
    public var BufferSizeRequired: UInt = 0u,
)

public data class MARK_HANDLE_INFO(
    public var Anonymous: MARK_HANDLE_INFO_0 = MARK_HANDLE_INFO_0(),
    public var VolumeHandle: HANDLE = 0L,
    public var HandleInfo: UInt = 0u,
)

public data class MARK_HANDLE_INFO_0(public var UsnSourceInfo: UInt = 0u, public var CopyNumber: UInt = 0u)

public data class MARK_HANDLE_INFO32(
    public var Anonymous: MARK_HANDLE_INFO32_0 = MARK_HANDLE_INFO32_0(),
    public var VolumeHandle: UInt = 0u,
    public var HandleInfo: UInt = 0u,
)

public data class MARK_HANDLE_INFO32_0(public var UsnSourceInfo: UInt = 0u, public var CopyNumber: UInt = 0u)

public data class MFT_ENUM_DATA_V0(
    public var StartFileReferenceNumber: ULong = 0uL,
    public var LowUsn: Long = 0L,
    public var HighUsn: Long = 0L,
)

public data class MFT_ENUM_DATA_V1(
    public var StartFileReferenceNumber: ULong = 0uL,
    public var LowUsn: Long = 0L,
    public var HighUsn: Long = 0L,
    public var MinMajorVersion: UShort = 0u,
    public var MaxMajorVersion: UShort = 0u,
)

public data class MOVE_FILE_DATA(
    public var FileHandle: HANDLE = 0L,
    public var StartingVcn: Long = 0L,
    public var StartingLcn: Long = 0L,
    public var ClusterCount: UInt = 0u,
)

public data class MOVE_FILE_DATA32(
    public var FileHandle: UInt = 0u,
    public var StartingVcn: Long = 0L,
    public var StartingLcn: Long = 0L,
    public var ClusterCount: UInt = 0u,
)

public data class MOVE_FILE_RECORD_DATA(
    public var FileHandle: HANDLE = 0L,
    public var SourceFileRecord: Long = 0L,
    public var TargetFileRecord: Long = 0L,
)

public data class NTFS_EXTENDED_VOLUME_DATA(
    public var ByteCount: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var BytesPerPhysicalSector: UInt = 0u,
    public var LfsMajorVersion: UShort = 0u,
    public var LfsMinorVersion: UShort = 0u,
    public var MaxDeviceTrimExtentCount: UInt = 0u,
    public var MaxDeviceTrimByteCount: UInt = 0u,
    public var MaxVolumeTrimExtentCount: UInt = 0u,
    public var MaxVolumeTrimByteCount: UInt = 0u,
)

public data class NTFS_FILE_RECORD_INPUT_BUFFER(public var FileReferenceNumber: Long = 0L)

public data class NTFS_FILE_RECORD_OUTPUT_BUFFER(
    public var FileReferenceNumber: Long = 0L,
    public var FileRecordLength: UInt = 0u,
    public var FileRecordBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTFS_FILE_RECORD_OUTPUT_BUFFER) return false
        if (this.FileReferenceNumber != other.FileReferenceNumber) return false
        if (this.FileRecordLength != other.FileRecordLength) return false
        if (!this.FileRecordBuffer.contentEquals(other.FileRecordBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileReferenceNumber.hashCode()
        result = 31 * result + this.FileRecordLength.hashCode()
        result = 31 * result + this.FileRecordBuffer.contentHashCode()
        return result
    }
}

public class NTFS_STATISTICS(
    public var LogFileFullExceptions: UInt = 0u,
    public var OtherExceptions: UInt = 0u,
    public var MftReads: UInt = 0u,
    public var MftReadBytes: UInt = 0u,
    public var MftWrites: UInt = 0u,
    public var MftWriteBytes: UInt = 0u,
    public var MftWritesUserLevel: NTFS_STATISTICS_0 = NTFS_STATISTICS_0(),
    public var MftWritesFlushForLogFileFull: UShort = 0u,
    public var MftWritesLazyWriter: UShort = 0u,
    public var MftWritesUserRequest: UShort = 0u,
    public var Mft2Writes: UInt = 0u,
    public var Mft2WriteBytes: UInt = 0u,
    public var Mft2WritesUserLevel: NTFS_STATISTICS_1 = NTFS_STATISTICS_1(),
    public var Mft2WritesFlushForLogFileFull: UShort = 0u,
    public var Mft2WritesLazyWriter: UShort = 0u,
    public var Mft2WritesUserRequest: UShort = 0u,
    public var RootIndexReads: UInt = 0u,
    public var RootIndexReadBytes: UInt = 0u,
    public var RootIndexWrites: UInt = 0u,
    public var RootIndexWriteBytes: UInt = 0u,
    public var BitmapReads: UInt = 0u,
    public var BitmapReadBytes: UInt = 0u,
    public var BitmapWrites: UInt = 0u,
    public var BitmapWriteBytes: UInt = 0u,
    public var BitmapWritesFlushForLogFileFull: UShort = 0u,
    public var BitmapWritesLazyWriter: UShort = 0u,
    public var BitmapWritesUserRequest: UShort = 0u,
    public var BitmapWritesUserLevel: NTFS_STATISTICS_2 = NTFS_STATISTICS_2(),
    public var MftBitmapReads: UInt = 0u,
    public var MftBitmapReadBytes: UInt = 0u,
    public var MftBitmapWrites: UInt = 0u,
    public var MftBitmapWriteBytes: UInt = 0u,
    public var MftBitmapWritesFlushForLogFileFull: UShort = 0u,
    public var MftBitmapWritesLazyWriter: UShort = 0u,
    public var MftBitmapWritesUserRequest: UShort = 0u,
    public var MftBitmapWritesUserLevel: NTFS_STATISTICS_3 = NTFS_STATISTICS_3(),
    public var UserIndexReads: UInt = 0u,
    public var UserIndexReadBytes: UInt = 0u,
    public var UserIndexWrites: UInt = 0u,
    public var UserIndexWriteBytes: UInt = 0u,
    public var LogFileReads: UInt = 0u,
    public var LogFileReadBytes: UInt = 0u,
    public var LogFileWrites: UInt = 0u,
    public var LogFileWriteBytes: UInt = 0u,
    public var Allocate: NTFS_STATISTICS_4 = NTFS_STATISTICS_4(),
    public var DiskResourcesExhausted: UInt = 0u,
)

public data class NTFS_STATISTICS_4(
    public var Calls: UInt = 0u,
    public var Clusters: UInt = 0u,
    public var Hints: UInt = 0u,
    public var RunsReturned: UInt = 0u,
    public var HintsHonored: UInt = 0u,
    public var HintsClusters: UInt = 0u,
    public var Cache: UInt = 0u,
    public var CacheClusters: UInt = 0u,
    public var CacheMiss: UInt = 0u,
    public var CacheMissClusters: UInt = 0u,
)

public data class NTFS_STATISTICS_2(
    public var Write: UShort = 0u,
    public var Create: UShort = 0u,
    public var SetInfo: UShort = 0u,
)

public data class NTFS_STATISTICS_1(
    public var Write: UShort = 0u,
    public var Create: UShort = 0u,
    public var SetInfo: UShort = 0u,
    public var Flush: UShort = 0u,
)

public data class NTFS_STATISTICS_3(
    public var Write: UShort = 0u,
    public var Create: UShort = 0u,
    public var SetInfo: UShort = 0u,
    public var Flush: UShort = 0u,
)

public data class NTFS_STATISTICS_0(
    public var Write: UShort = 0u,
    public var Create: UShort = 0u,
    public var SetInfo: UShort = 0u,
    public var Flush: UShort = 0u,
)

public class NTFS_STATISTICS_EX(
    public var LogFileFullExceptions: UInt = 0u,
    public var OtherExceptions: UInt = 0u,
    public var MftReads: ULong = 0uL,
    public var MftReadBytes: ULong = 0uL,
    public var MftWrites: ULong = 0uL,
    public var MftWriteBytes: ULong = 0uL,
    public var MftWritesUserLevel: NTFS_STATISTICS_EX_0 = NTFS_STATISTICS_EX_0(),
    public var MftWritesFlushForLogFileFull: UInt = 0u,
    public var MftWritesLazyWriter: UInt = 0u,
    public var MftWritesUserRequest: UInt = 0u,
    public var Mft2Writes: ULong = 0uL,
    public var Mft2WriteBytes: ULong = 0uL,
    public var Mft2WritesUserLevel: NTFS_STATISTICS_EX_1 = NTFS_STATISTICS_EX_1(),
    public var Mft2WritesFlushForLogFileFull: UInt = 0u,
    public var Mft2WritesLazyWriter: UInt = 0u,
    public var Mft2WritesUserRequest: UInt = 0u,
    public var RootIndexReads: ULong = 0uL,
    public var RootIndexReadBytes: ULong = 0uL,
    public var RootIndexWrites: ULong = 0uL,
    public var RootIndexWriteBytes: ULong = 0uL,
    public var BitmapReads: ULong = 0uL,
    public var BitmapReadBytes: ULong = 0uL,
    public var BitmapWrites: ULong = 0uL,
    public var BitmapWriteBytes: ULong = 0uL,
    public var BitmapWritesFlushForLogFileFull: UInt = 0u,
    public var BitmapWritesLazyWriter: UInt = 0u,
    public var BitmapWritesUserRequest: UInt = 0u,
    public var BitmapWritesUserLevel: NTFS_STATISTICS_EX_2 = NTFS_STATISTICS_EX_2(),
    public var MftBitmapReads: ULong = 0uL,
    public var MftBitmapReadBytes: ULong = 0uL,
    public var MftBitmapWrites: ULong = 0uL,
    public var MftBitmapWriteBytes: ULong = 0uL,
    public var MftBitmapWritesFlushForLogFileFull: UInt = 0u,
    public var MftBitmapWritesLazyWriter: UInt = 0u,
    public var MftBitmapWritesUserRequest: UInt = 0u,
    public var MftBitmapWritesUserLevel: NTFS_STATISTICS_EX_3 = NTFS_STATISTICS_EX_3(),
    public var UserIndexReads: ULong = 0uL,
    public var UserIndexReadBytes: ULong = 0uL,
    public var UserIndexWrites: ULong = 0uL,
    public var UserIndexWriteBytes: ULong = 0uL,
    public var LogFileReads: ULong = 0uL,
    public var LogFileReadBytes: ULong = 0uL,
    public var LogFileWrites: ULong = 0uL,
    public var LogFileWriteBytes: ULong = 0uL,
    public var Allocate: NTFS_STATISTICS_EX_4 = NTFS_STATISTICS_EX_4(),
    public var DiskResourcesExhausted: UInt = 0u,
    public var VolumeTrimCount: ULong = 0uL,
    public var VolumeTrimTime: ULong = 0uL,
    public var VolumeTrimByteCount: ULong = 0uL,
    public var FileLevelTrimCount: ULong = 0uL,
    public var FileLevelTrimTime: ULong = 0uL,
    public var FileLevelTrimByteCount: ULong = 0uL,
    public var VolumeTrimSkippedCount: ULong = 0uL,
    public var VolumeTrimSkippedByteCount: ULong = 0uL,
    public var NtfsFillStatInfoFromMftRecordCalledCount: ULong = 0uL,
    public var NtfsFillStatInfoFromMftRecordBailedBecauseOfAttributeListCount: ULong = 0uL,
    public var NtfsFillStatInfoFromMftRecordBailedBecauseOfNonResReparsePointCount: ULong = 0uL,
)

public data class NTFS_STATISTICS_EX_4(
    public var Calls: UInt = 0u,
    public var RunsReturned: UInt = 0u,
    public var Hints: UInt = 0u,
    public var HintsHonored: UInt = 0u,
    public var Cache: UInt = 0u,
    public var CacheMiss: UInt = 0u,
    public var Clusters: ULong = 0uL,
    public var HintsClusters: ULong = 0uL,
    public var CacheClusters: ULong = 0uL,
    public var CacheMissClusters: ULong = 0uL,
)

public data class NTFS_STATISTICS_EX_2(
    public var Write: UInt = 0u,
    public var Create: UInt = 0u,
    public var SetInfo: UInt = 0u,
    public var Flush: UInt = 0u,
)

public data class NTFS_STATISTICS_EX_1(
    public var Write: UInt = 0u,
    public var Create: UInt = 0u,
    public var SetInfo: UInt = 0u,
    public var Flush: UInt = 0u,
)

public data class NTFS_STATISTICS_EX_3(
    public var Write: UInt = 0u,
    public var Create: UInt = 0u,
    public var SetInfo: UInt = 0u,
    public var Flush: UInt = 0u,
)

public data class NTFS_STATISTICS_EX_0(
    public var Write: UInt = 0u,
    public var Create: UInt = 0u,
    public var SetInfo: UInt = 0u,
    public var Flush: UInt = 0u,
)

public data class NTFS_VOLUME_DATA_BUFFER(
    public var VolumeSerialNumber: Long = 0L,
    public var NumberSectors: Long = 0L,
    public var TotalClusters: Long = 0L,
    public var FreeClusters: Long = 0L,
    public var TotalReserved: Long = 0L,
    public var BytesPerSector: UInt = 0u,
    public var BytesPerCluster: UInt = 0u,
    public var BytesPerFileRecordSegment: UInt = 0u,
    public var ClustersPerFileRecordSegment: UInt = 0u,
    public var MftValidDataLength: Long = 0L,
    public var MftStartLcn: Long = 0L,
    public var Mft2StartLcn: Long = 0L,
    public var MftZoneStart: Long = 0L,
    public var MftZoneEnd: Long = 0L,
)

public data class PARTITION_INFORMATION(
    public var StartingOffset: Long = 0L,
    public var PartitionLength: Long = 0L,
    public var HiddenSectors: UInt = 0u,
    public var PartitionNumber: UInt = 0u,
    public var PartitionType: UByte = 0u,
    public var BootIndicator: Boolean = false,
    public var RecognizedPartition: Boolean = false,
    public var RewritePartition: Boolean = false,
)

public data class PARTITION_INFORMATION_EX(
    public var PartitionStyle: PARTITION_STYLE = 0,
    public var StartingOffset: Long = 0L,
    public var PartitionLength: Long = 0L,
    public var PartitionNumber: UInt = 0u,
    public var RewritePartition: Boolean = false,
    public var IsServicePartition: Boolean = false,
    public var Anonymous: PARTITION_INFORMATION_EX_0 = PARTITION_INFORMATION_EX_0(),
)

public data class PARTITION_INFORMATION_EX_0(public var Mbr: PARTITION_INFORMATION_MBR = PARTITION_INFORMATION_MBR(), public var Gpt: PARTITION_INFORMATION_GPT = PARTITION_INFORMATION_GPT())

public data class PARTITION_INFORMATION_GPT(
    public var PartitionType: GUID = GUID(),
    public var PartitionId: GUID = GUID(),
    public var Attributes: GPT_ATTRIBUTES = 0uL,
    public var Name: UShortArray = UShortArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PARTITION_INFORMATION_GPT) return false
        if (this.PartitionType != other.PartitionType) return false
        if (this.PartitionId != other.PartitionId) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PartitionType.hashCode()
        result = 31 * result + this.PartitionId.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class PARTITION_INFORMATION_MBR(
    public var PartitionType: UByte = 0u,
    public var BootIndicator: Boolean = false,
    public var RecognizedPartition: Boolean = false,
    public var HiddenSectors: UInt = 0u,
    public var PartitionId: GUID = GUID(),
)

public data class PATHNAME_BUFFER(public var PathNameLength: UInt = 0u, public var Name: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PATHNAME_BUFFER) return false
        if (this.PathNameLength != other.PathNameLength) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PathNameLength.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class PERF_BIN(
    public var NumberOfBins: UInt = 0u,
    public var TypeOfBin: UInt = 0u,
    public var BinsRanges: List<BIN_RANGE> = List(1) { BIN_RANGE() },
)

public data class PERSISTENT_RESERVE_COMMAND(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Anonymous: PERSISTENT_RESERVE_COMMAND_0 = PERSISTENT_RESERVE_COMMAND_0(),
)

public data class PERSISTENT_RESERVE_COMMAND_0(public var PR_IN: PERSISTENT_RESERVE_COMMAND_0_0 = PERSISTENT_RESERVE_COMMAND_0_0(), public var PR_OUT: PERSISTENT_RESERVE_COMMAND_0_1 = PERSISTENT_RESERVE_COMMAND_0_1())

public data class PERSISTENT_RESERVE_COMMAND_0_0(public var _bitfield: UByte = 0u, public var AllocationLength: UShort = 0u)
