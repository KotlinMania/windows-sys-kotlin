@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ALG_ID

public data class BY_HANDLE_FILE_INFORMATION(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: FILETIME = FILETIME(),
    public var ftLastAccessTime: FILETIME = FILETIME(),
    public var ftLastWriteTime: FILETIME = FILETIME(),
    public var dwVolumeSerialNumber: UInt = 0u,
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var nNumberOfLinks: UInt = 0u,
    public var nFileIndexHigh: UInt = 0u,
    public var nFileIndexLow: UInt = 0u,
)

public data class CLFS_LOG_NAME_INFORMATION(public var NameLengthInBytes: UShort = 0u, public var Name: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLFS_LOG_NAME_INFORMATION) return false
        if (this.NameLengthInBytes != other.NameLengthInBytes) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NameLengthInBytes.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class CLFS_MGMT_NOTIFICATION(
    public var Notification: CLFS_MGMT_NOTIFICATION_TYPE = 0,
    public var Lsn: CLS_LSN = CLS_LSN(),
    public var LogIsPinned: UShort = 0u,
)

public data class CLFS_MGMT_POLICY(
    public var Version: UInt = 0u,
    public var LengthInBytes: UInt = 0u,
    public var PolicyFlags: UInt = 0u,
    public var PolicyType: CLFS_MGMT_POLICY_TYPE = 0,
    public var PolicyParameters: CLFS_MGMT_POLICY_0 = CLFS_MGMT_POLICY_0(),
)

public data class CLFS_MGMT_POLICY_0(
    public var MaximumSize: CLFS_MGMT_POLICY_0_0 = CLFS_MGMT_POLICY_0_0(),
    public var MinimumSize: CLFS_MGMT_POLICY_0_1 = CLFS_MGMT_POLICY_0_1(),
    public var NewContainerSize: CLFS_MGMT_POLICY_0_2 = CLFS_MGMT_POLICY_0_2(),
    public var GrowthRate: CLFS_MGMT_POLICY_0_3 = CLFS_MGMT_POLICY_0_3(),
    public var LogTail: CLFS_MGMT_POLICY_0_4 = CLFS_MGMT_POLICY_0_4(),
    public var AutoShrink: CLFS_MGMT_POLICY_0_5 = CLFS_MGMT_POLICY_0_5(),
    public var AutoGrow: CLFS_MGMT_POLICY_0_6 = CLFS_MGMT_POLICY_0_6(),
    public var NewContainerPrefix: CLFS_MGMT_POLICY_0_7 = CLFS_MGMT_POLICY_0_7(),
    public var NewContainerSuffix: CLFS_MGMT_POLICY_0_8 = CLFS_MGMT_POLICY_0_8(),
    public var NewContainerExtension: CLFS_MGMT_POLICY_0_9 = CLFS_MGMT_POLICY_0_9(),
)

public data class CLFS_MGMT_POLICY_0_6(public var Enabled: UInt = 0u)

public data class CLFS_MGMT_POLICY_0_5(public var Percentage: UInt = 0u)

public data class CLFS_MGMT_POLICY_0_3(public var AbsoluteGrowthInContainers: UInt = 0u, public var RelativeGrowthPercentage: UInt = 0u)

public data class CLFS_MGMT_POLICY_0_4(public var MinimumAvailablePercentage: UInt = 0u, public var MinimumAvailableContainers: UInt = 0u)

public data class CLFS_MGMT_POLICY_0_0(public var Containers: UInt = 0u)

public data class CLFS_MGMT_POLICY_0_1(public var Containers: UInt = 0u)

public data class CLFS_MGMT_POLICY_0_9(public var ExtensionLengthInBytes: UShort = 0u, public var ExtensionString: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLFS_MGMT_POLICY_0_9) return false
        if (this.ExtensionLengthInBytes != other.ExtensionLengthInBytes) return false
        if (!this.ExtensionString.contentEquals(other.ExtensionString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ExtensionLengthInBytes.hashCode()
        result = 31 * result + this.ExtensionString.contentHashCode()
        return result
    }
}

public data class CLFS_MGMT_POLICY_0_7(public var PrefixLengthInBytes: UShort = 0u, public var PrefixString: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLFS_MGMT_POLICY_0_7) return false
        if (this.PrefixLengthInBytes != other.PrefixLengthInBytes) return false
        if (!this.PrefixString.contentEquals(other.PrefixString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PrefixLengthInBytes.hashCode()
        result = 31 * result + this.PrefixString.contentHashCode()
        return result
    }
}

public data class CLFS_MGMT_POLICY_0_2(public var SizeInBytes: UInt = 0u)

public data class CLFS_MGMT_POLICY_0_8(public var NextContainerSuffix: ULong = 0uL)

public data class CLFS_NODE_ID(public var cType: UInt = 0u, public var cbNode: UInt = 0u)

public data class CLFS_PHYSICAL_LSN_INFORMATION(
    public var StreamIdentifier: UByte = 0u,
    public var VirtualLsn: CLS_LSN = CLS_LSN(),
    public var PhysicalLsn: CLS_LSN = CLS_LSN(),
)

public data class CLFS_STREAM_ID_INFORMATION(public var StreamIdentifier: UByte = 0u)

public data class CLS_ARCHIVE_DESCRIPTOR(
    public var coffLow: ULong = 0uL,
    public var coffHigh: ULong = 0uL,
    public var infoContainer: CLS_CONTAINER_INFORMATION = CLS_CONTAINER_INFORMATION(),
)

public data class CLS_CONTAINER_INFORMATION(
    public var FileAttributes: UInt = 0u,
    public var CreationTime: ULong = 0uL,
    public var LastAccessTime: ULong = 0uL,
    public var LastWriteTime: ULong = 0uL,
    public var ContainerSize: Long = 0L,
    public var FileNameActualLength: UInt = 0u,
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(256),
    public var State: UInt = 0u,
    public var PhysicalContainerId: UInt = 0u,
    public var LogicalContainerId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLS_CONTAINER_INFORMATION) return false
        if (this.FileAttributes != other.FileAttributes) return false
        if (this.CreationTime != other.CreationTime) return false
        if (this.LastAccessTime != other.LastAccessTime) return false
        if (this.LastWriteTime != other.LastWriteTime) return false
        if (this.ContainerSize != other.ContainerSize) return false
        if (this.FileNameActualLength != other.FileNameActualLength) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        if (this.State != other.State) return false
        if (this.PhysicalContainerId != other.PhysicalContainerId) return false
        if (this.LogicalContainerId != other.LogicalContainerId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileAttributes.hashCode()
        result = 31 * result + this.CreationTime.hashCode()
        result = 31 * result + this.LastAccessTime.hashCode()
        result = 31 * result + this.LastWriteTime.hashCode()
        result = 31 * result + this.ContainerSize.hashCode()
        result = 31 * result + this.FileNameActualLength.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.PhysicalContainerId.hashCode()
        result = 31 * result + this.LogicalContainerId.hashCode()
        return result
    }
}

public class CLS_INFORMATION(
    public var TotalAvailable: Long = 0L,
    public var CurrentAvailable: Long = 0L,
    public var TotalReservation: Long = 0L,
    public var BaseFileSize: ULong = 0uL,
    public var ContainerSize: ULong = 0uL,
    public var TotalContainers: UInt = 0u,
    public var FreeContainers: UInt = 0u,
    public var TotalClients: UInt = 0u,
    public var Attributes: UInt = 0u,
    public var FlushThreshold: UInt = 0u,
    public var SectorSize: UInt = 0u,
    public var MinArchiveTailLsn: CLS_LSN = CLS_LSN(),
    public var BaseLsn: CLS_LSN = CLS_LSN(),
    public var LastFlushedLsn: CLS_LSN = CLS_LSN(),
    public var LastLsn: CLS_LSN = CLS_LSN(),
    public var RestartLsn: CLS_LSN = CLS_LSN(),
    public var Identity: GUID = GUID(),
)

public data class CLS_IO_STATISTICS(
    public var hdrIoStats: CLS_IO_STATISTICS_HEADER = CLS_IO_STATISTICS_HEADER(),
    public var cFlush: ULong = 0uL,
    public var cbFlush: ULong = 0uL,
    public var cMetaFlush: ULong = 0uL,
    public var cbMetaFlush: ULong = 0uL,
)

public data class CLS_IO_STATISTICS_HEADER(
    public var ubMajorVersion: UByte = 0u,
    public var ubMinorVersion: UByte = 0u,
    public var eStatsClass: CLFS_IOSTATS_CLASS = 0,
    public var cbLength: UShort = 0u,
    public var coffData: UInt = 0u,
)

public data class CLS_LSN(public var Internal: ULong = 0uL)

public data class CLS_SCAN_CONTEXT(
    public var cidNode: CLFS_NODE_ID = CLFS_NODE_ID(),
    public var hLog: HANDLE = 0L,
    public var cIndex: UInt = 0u,
    public var cContainers: UInt = 0u,
    public var cContainersReturned: UInt = 0u,
    public var eScanMode: UByte = 0u,
    public var pinfoContainer: Long = 0L,
)

public data class CLS_WRITE_ENTRY(public var Buffer: Long = 0L, public var ByteLength: UInt = 0u)

public data class CONNECTION_INFO_0(public var coni0_id: UInt = 0u)

public data class CONNECTION_INFO_1(
    public var coni1_id: UInt = 0u,
    public var coni1_type: SHARE_TYPE = 0u,
    public var coni1_num_opens: UInt = 0u,
    public var coni1_num_users: UInt = 0u,
    public var coni1_time: UInt = 0u,
    public var coni1_username: PWSTR = 0L,
    public var coni1_netname: PWSTR = 0L,
)

public data class COPYFILE2_EXTENDED_PARAMETERS(
    public var dwSize: UInt = 0u,
    public var dwCopyFlags: COPYFILE_FLAGS = 0u,
    public var pfCancel: Long = 0L,
    public var pProgressRoutine: PCOPYFILE2_PROGRESS_ROUTINE = null,
    public var pvCallbackContext: Long = 0L,
)

public data class COPYFILE2_EXTENDED_PARAMETERS_V2(
    public var dwSize: UInt = 0u,
    public var dwCopyFlags: COPYFILE_FLAGS = 0u,
    public var pfCancel: Long = 0L,
    public var pProgressRoutine: PCOPYFILE2_PROGRESS_ROUTINE = null,
    public var pvCallbackContext: Long = 0L,
    public var dwCopyFlagsV2: COPYFILE2_V2_FLAGS = 0u,
    public var ioDesiredSize: UInt = 0u,
    public var ioDesiredRate: UInt = 0u,
    public var reserved: LongArray = LongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is COPYFILE2_EXTENDED_PARAMETERS_V2) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwCopyFlags != other.dwCopyFlags) return false
        if (this.pfCancel != other.pfCancel) return false
        if (this.pProgressRoutine != other.pProgressRoutine) return false
        if (this.pvCallbackContext != other.pvCallbackContext) return false
        if (this.dwCopyFlagsV2 != other.dwCopyFlagsV2) return false
        if (this.ioDesiredSize != other.ioDesiredSize) return false
        if (this.ioDesiredRate != other.ioDesiredRate) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwCopyFlags.hashCode()
        result = 31 * result + this.pfCancel.hashCode()
        result = 31 * result + this.pProgressRoutine.hashCode()
        result = 31 * result + this.pvCallbackContext.hashCode()
        result = 31 * result + this.dwCopyFlagsV2.hashCode()
        result = 31 * result + this.ioDesiredSize.hashCode()
        result = 31 * result + this.ioDesiredRate.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class COPYFILE2_MESSAGE(
    public var Type: COPYFILE2_MESSAGE_TYPE = 0,
    public var dwPadding: UInt = 0u,
    public var Info: COPYFILE2_MESSAGE_0 = COPYFILE2_MESSAGE_0(),
)

public data class COPYFILE2_MESSAGE_0(
    public var ChunkStarted: COPYFILE2_MESSAGE_0_0 = COPYFILE2_MESSAGE_0_0(),
    public var ChunkFinished: COPYFILE2_MESSAGE_0_1 = COPYFILE2_MESSAGE_0_1(),
    public var StreamStarted: COPYFILE2_MESSAGE_0_2 = COPYFILE2_MESSAGE_0_2(),
    public var StreamFinished: COPYFILE2_MESSAGE_0_3 = COPYFILE2_MESSAGE_0_3(),
    public var PollContinue: COPYFILE2_MESSAGE_0_4 = COPYFILE2_MESSAGE_0_4(),
    public var Error: COPYFILE2_MESSAGE_0_5 = COPYFILE2_MESSAGE_0_5(),
)

public data class COPYFILE2_MESSAGE_0_1(
    public var dwStreamNumber: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hSourceFile: HANDLE = 0L,
    public var hDestinationFile: HANDLE = 0L,
    public var uliChunkNumber: ULong = 0uL,
    public var uliChunkSize: ULong = 0uL,
    public var uliStreamSize: ULong = 0uL,
    public var uliStreamBytesTransferred: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
    public var uliTotalBytesTransferred: ULong = 0uL,
)

public data class COPYFILE2_MESSAGE_0_0(
    public var dwStreamNumber: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var hSourceFile: HANDLE = 0L,
    public var hDestinationFile: HANDLE = 0L,
    public var uliChunkNumber: ULong = 0uL,
    public var uliChunkSize: ULong = 0uL,
    public var uliStreamSize: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
)

public data class COPYFILE2_MESSAGE_0_5(
    public var CopyPhase: COPYFILE2_COPY_PHASE = 0,
    public var dwStreamNumber: UInt = 0u,
    public var hrFailure: HRESULT = 0,
    public var dwReserved: UInt = 0u,
    public var uliChunkNumber: ULong = 0uL,
    public var uliStreamSize: ULong = 0uL,
    public var uliStreamBytesTransferred: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
    public var uliTotalBytesTransferred: ULong = 0uL,
)

public data class COPYFILE2_MESSAGE_0_4(public var dwReserved: UInt = 0u)

public data class COPYFILE2_MESSAGE_0_3(
    public var dwStreamNumber: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var hSourceFile: HANDLE = 0L,
    public var hDestinationFile: HANDLE = 0L,
    public var uliStreamSize: ULong = 0uL,
    public var uliStreamBytesTransferred: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
    public var uliTotalBytesTransferred: ULong = 0uL,
)

public data class COPYFILE2_MESSAGE_0_2(
    public var dwStreamNumber: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var hSourceFile: HANDLE = 0L,
    public var hDestinationFile: HANDLE = 0L,
    public var uliStreamSize: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
)

public data class CREATEFILE2_EXTENDED_PARAMETERS(
    public var dwSize: UInt = 0u,
    public var dwFileAttributes: UInt = 0u,
    public var dwFileFlags: UInt = 0u,
    public var dwSecurityQosFlags: UInt = 0u,
    public var lpSecurityAttributes: Long = 0L,
    public var hTemplateFile: HANDLE = 0L,
)

public data class DISKQUOTA_USER_INFORMATION(
    public var QuotaUsed: Long = 0L,
    public var QuotaThreshold: Long = 0L,
    public var QuotaLimit: Long = 0L,
)

public data class DISK_SPACE_INFORMATION(
    public var ActualTotalAllocationUnits: ULong = 0uL,
    public var ActualAvailableAllocationUnits: ULong = 0uL,
    public var ActualPoolUnavailableAllocationUnits: ULong = 0uL,
    public var CallerTotalAllocationUnits: ULong = 0uL,
    public var CallerAvailableAllocationUnits: ULong = 0uL,
    public var CallerPoolUnavailableAllocationUnits: ULong = 0uL,
    public var UsedAllocationUnits: ULong = 0uL,
    public var TotalReservedAllocationUnits: ULong = 0uL,
    public var VolumeStorageReserveAllocationUnits: ULong = 0uL,
    public var AvailableCommittedAllocationUnits: ULong = 0uL,
    public var PoolAvailableAllocationUnits: ULong = 0uL,
    public var SectorsPerAllocationUnit: UInt = 0u,
    public var BytesPerSector: UInt = 0u,
)

public data class EFS_CERTIFICATE_BLOB(
    public var dwCertEncodingType: UInt = 0u,
    public var cbData: UInt = 0u,
    public var pbData: Long = 0L,
)

public data class EFS_COMPATIBILITY_INFO(public var EfsVersion: UInt = 0u)

public data class EFS_DECRYPTION_STATUS_INFO(
    public var dwDecryptionError: UInt = 0u,
    public var dwHashOffset: UInt = 0u,
    public var cbHash: UInt = 0u,
)

public data class EFS_ENCRYPTION_STATUS_INFO(public var bHasCurrentKey: BOOL = 0, public var dwEncryptionError: UInt = 0u)

public data class EFS_HASH_BLOB(public var cbData: UInt = 0u, public var pbData: Long = 0L)

public data class EFS_KEY_INFO(
    public var dwVersion: UInt = 0u,
    public var Entropy: UInt = 0u,
    public var Algorithm: ALG_ID = 0u,
    public var KeyLength: UInt = 0u,
)

public data class EFS_PIN_BLOB(
    public var cbPadding: UInt = 0u,
    public var cbData: UInt = 0u,
    public var pbData: Long = 0L,
)

public data class EFS_RPC_BLOB(public var cbData: UInt = 0u, public var pbData: Long = 0L)

public data class EFS_VERSION_INFO(public var EfsVersion: UInt = 0u, public var SubVersion: UInt = 0u)

public data class ENCRYPTED_FILE_METADATA_SIGNATURE(
    public var dwEfsAccessType: UInt = 0u,
    public var pCertificatesAdded: Long = 0L,
    public var pEncryptionCertificate: Long = 0L,
    public var pEfsStreamSignature: Long = 0L,
)

public data class ENCRYPTION_CERTIFICATE(
    public var cbTotalLength: UInt = 0u,
    public var pUserSid: Long = 0L,
    public var pCertBlob: Long = 0L,
)

public data class ENCRYPTION_CERTIFICATE_HASH(
    public var cbTotalLength: UInt = 0u,
    public var pUserSid: Long = 0L,
    public var pHash: Long = 0L,
    public var lpDisplayInformation: PWSTR = 0L,
)

public data class ENCRYPTION_CERTIFICATE_HASH_LIST(public var nCert_Hash: UInt = 0u, public var pUsers: Long = 0L)

public data class ENCRYPTION_CERTIFICATE_LIST(public var nUsers: UInt = 0u, public var pUsers: Long = 0L)

public data class ENCRYPTION_PROTECTOR(
    public var cbTotalLength: UInt = 0u,
    public var pUserSid: Long = 0L,
    public var lpProtectorDescriptor: PWSTR = 0L,
)

public data class ENCRYPTION_PROTECTOR_LIST(public var nProtectors: UInt = 0u, public var pProtectors: Long = 0L)

public data class FH_OVERLAPPED(
    public var Internal: ULong = 0uL,
    public var InternalHigh: ULong = 0uL,
    public var Offset: UInt = 0u,
    public var OffsetHigh: UInt = 0u,
    public var hEvent: HANDLE = 0L,
    public var pfnCompletion: PFN_IO_COMPLETION = null,
    public var Reserved1: ULong = 0uL,
    public var Reserved2: ULong = 0uL,
    public var Reserved3: ULong = 0uL,
    public var Reserved4: ULong = 0uL,
)

public data class FILE_ALIGNMENT_INFO(public var AlignmentRequirement: UInt = 0u)

public data class FILE_ALLOCATION_INFO(public var AllocationSize: Long = 0L)

public data class FILE_ATTRIBUTE_TAG_INFO(public var FileAttributes: UInt = 0u, public var ReparseTag: UInt = 0u)

public data class FILE_BASIC_INFO(
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var FileAttributes: UInt = 0u,
)

public data class FILE_CASE_SENSITIVE_INFO(public var Flags: UInt = 0u)

public data class FILE_COMPRESSION_INFO(
    public var CompressedFileSize: Long = 0L,
    public var CompressionFormat: COMPRESSION_FORMAT = 0u,
    public var CompressionUnitShift: UByte = 0u,
    public var ChunkShift: UByte = 0u,
    public var ClusterShift: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_COMPRESSION_INFO) return false
        if (this.CompressedFileSize != other.CompressedFileSize) return false
        if (this.CompressionFormat != other.CompressionFormat) return false
        if (this.CompressionUnitShift != other.CompressionUnitShift) return false
        if (this.ChunkShift != other.ChunkShift) return false
        if (this.ClusterShift != other.ClusterShift) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CompressedFileSize.hashCode()
        result = 31 * result + this.CompressionFormat.hashCode()
        result = 31 * result + this.CompressionUnitShift.hashCode()
        result = 31 * result + this.ChunkShift.hashCode()
        result = 31 * result + this.ClusterShift.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class FILE_DISPOSITION_INFO(public var DeleteFile: Boolean = false)

public data class FILE_DISPOSITION_INFO_EX(public var Flags: FILE_DISPOSITION_INFO_EX_FLAGS = 0u)

public data class FILE_END_OF_FILE_INFO(public var EndOfFile: Long = 0L)

public data class FILE_EXTENT(public var VolumeOffset: ULong = 0uL, public var ExtentLength: ULong = 0uL)

public data class FILE_FULL_DIR_INFO(
    public var NextEntryOffset: UInt = 0u,
    public var FileIndex: UInt = 0u,
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var AllocationSize: Long = 0L,
    public var FileAttributes: UInt = 0u,
    public var FileNameLength: UInt = 0u,
    public var EaSize: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_FULL_DIR_INFO) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.FileIndex != other.FileIndex) return false
        if (this.CreationTime != other.CreationTime) return false
        if (this.LastAccessTime != other.LastAccessTime) return false
        if (this.LastWriteTime != other.LastWriteTime) return false
        if (this.ChangeTime != other.ChangeTime) return false
        if (this.EndOfFile != other.EndOfFile) return false
        if (this.AllocationSize != other.AllocationSize) return false
        if (this.FileAttributes != other.FileAttributes) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (this.EaSize != other.EaSize) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.FileIndex.hashCode()
        result = 31 * result + this.CreationTime.hashCode()
        result = 31 * result + this.LastAccessTime.hashCode()
        result = 31 * result + this.LastWriteTime.hashCode()
        result = 31 * result + this.ChangeTime.hashCode()
        result = 31 * result + this.EndOfFile.hashCode()
        result = 31 * result + this.AllocationSize.hashCode()
        result = 31 * result + this.FileAttributes.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.EaSize.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_ID_128(public var Identifier: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_ID_128) return false
        if (!this.Identifier.contentEquals(other.Identifier)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Identifier.contentHashCode()
    }
}

public data class FILE_ID_BOTH_DIR_INFO(
    public var NextEntryOffset: UInt = 0u,
    public var FileIndex: UInt = 0u,
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var AllocationSize: Long = 0L,
    public var FileAttributes: UInt = 0u,
    public var FileNameLength: UInt = 0u,
    public var EaSize: UInt = 0u,
    public var ShortNameLength: Byte = 0,
    public var ShortName: UShortArray = UShortArray(12),
    public var FileId: Long = 0L,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_ID_BOTH_DIR_INFO) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.FileIndex != other.FileIndex) return false
        if (this.CreationTime != other.CreationTime) return false
        if (this.LastAccessTime != other.LastAccessTime) return false
        if (this.LastWriteTime != other.LastWriteTime) return false
        if (this.ChangeTime != other.ChangeTime) return false
        if (this.EndOfFile != other.EndOfFile) return false
        if (this.AllocationSize != other.AllocationSize) return false
        if (this.FileAttributes != other.FileAttributes) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (this.EaSize != other.EaSize) return false
        if (this.ShortNameLength != other.ShortNameLength) return false
        if (!this.ShortName.contentEquals(other.ShortName)) return false
        if (this.FileId != other.FileId) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.FileIndex.hashCode()
        result = 31 * result + this.CreationTime.hashCode()
        result = 31 * result + this.LastAccessTime.hashCode()
        result = 31 * result + this.LastWriteTime.hashCode()
        result = 31 * result + this.ChangeTime.hashCode()
        result = 31 * result + this.EndOfFile.hashCode()
        result = 31 * result + this.AllocationSize.hashCode()
        result = 31 * result + this.FileAttributes.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.EaSize.hashCode()
        result = 31 * result + this.ShortNameLength.hashCode()
        result = 31 * result + this.ShortName.contentHashCode()
        result = 31 * result + this.FileId.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_ID_DESCRIPTOR(
    public var dwSize: UInt = 0u,
    public var Type: FILE_ID_TYPE = 0,
    public var Anonymous: FILE_ID_DESCRIPTOR_0 = FILE_ID_DESCRIPTOR_0(),
)

public data class FILE_ID_DESCRIPTOR_0(
    public var FileId: Long = 0L,
    public var ObjectId: GUID = GUID(),
    public var ExtendedFileId: FILE_ID_128 = FILE_ID_128(),
)

public data class FILE_ID_EXTD_DIR_INFO(
    public var NextEntryOffset: UInt = 0u,
    public var FileIndex: UInt = 0u,
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var AllocationSize: Long = 0L,
    public var FileAttributes: UInt = 0u,
    public var FileNameLength: UInt = 0u,
    public var EaSize: UInt = 0u,
    public var ReparsePointTag: UInt = 0u,
    public var FileId: FILE_ID_128 = FILE_ID_128(),
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_ID_EXTD_DIR_INFO) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.FileIndex != other.FileIndex) return false
        if (this.CreationTime != other.CreationTime) return false
        if (this.LastAccessTime != other.LastAccessTime) return false
        if (this.LastWriteTime != other.LastWriteTime) return false
        if (this.ChangeTime != other.ChangeTime) return false
        if (this.EndOfFile != other.EndOfFile) return false
        if (this.AllocationSize != other.AllocationSize) return false
        if (this.FileAttributes != other.FileAttributes) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (this.EaSize != other.EaSize) return false
        if (this.ReparsePointTag != other.ReparsePointTag) return false
        if (this.FileId != other.FileId) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.FileIndex.hashCode()
        result = 31 * result + this.CreationTime.hashCode()
        result = 31 * result + this.LastAccessTime.hashCode()
        result = 31 * result + this.LastWriteTime.hashCode()
        result = 31 * result + this.ChangeTime.hashCode()
        result = 31 * result + this.EndOfFile.hashCode()
        result = 31 * result + this.AllocationSize.hashCode()
        result = 31 * result + this.FileAttributes.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.EaSize.hashCode()
        result = 31 * result + this.ReparsePointTag.hashCode()
        result = 31 * result + this.FileId.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_ID_INFO(public var VolumeSerialNumber: ULong = 0uL, public var FileId: FILE_ID_128 = FILE_ID_128())

public data class FILE_INFO_2(public var fi2_id: UInt = 0u)

public data class FILE_INFO_3(
    public var fi3_id: UInt = 0u,
    public var fi3_permissions: FILE_INFO_FLAGS_PERMISSIONS = 0u,
    public var fi3_num_locks: UInt = 0u,
    public var fi3_pathname: PWSTR = 0L,
    public var fi3_username: PWSTR = 0L,
)

public data class FILE_IO_PRIORITY_HINT_INFO(public var PriorityHint: PRIORITY_HINT = 0)

public data class FILE_NAME_INFO(public var FileNameLength: UInt = 0u, public var FileName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_NAME_INFO) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileNameLength.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_NOTIFY_EXTENDED_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var Action: FILE_ACTION = 0u,
    public var CreationTime: Long = 0L,
    public var LastModificationTime: Long = 0L,
    public var LastChangeTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var AllocatedLength: Long = 0L,
    public var FileSize: Long = 0L,
    public var FileAttributes: UInt = 0u,
    public var Anonymous: FILE_NOTIFY_EXTENDED_INFORMATION_0 = FILE_NOTIFY_EXTENDED_INFORMATION_0(),
    public var FileId: Long = 0L,
    public var ParentFileId: Long = 0L,
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_NOTIFY_EXTENDED_INFORMATION) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.Action != other.Action) return false
        if (this.CreationTime != other.CreationTime) return false
        if (this.LastModificationTime != other.LastModificationTime) return false
        if (this.LastChangeTime != other.LastChangeTime) return false
        if (this.LastAccessTime != other.LastAccessTime) return false
        if (this.AllocatedLength != other.AllocatedLength) return false
        if (this.FileSize != other.FileSize) return false
        if (this.FileAttributes != other.FileAttributes) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.FileId != other.FileId) return false
        if (this.ParentFileId != other.ParentFileId) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.Action.hashCode()
        result = 31 * result + this.CreationTime.hashCode()
        result = 31 * result + this.LastModificationTime.hashCode()
        result = 31 * result + this.LastChangeTime.hashCode()
        result = 31 * result + this.LastAccessTime.hashCode()
        result = 31 * result + this.AllocatedLength.hashCode()
        result = 31 * result + this.FileSize.hashCode()
        result = 31 * result + this.FileAttributes.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.FileId.hashCode()
        result = 31 * result + this.ParentFileId.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_NOTIFY_EXTENDED_INFORMATION_0(public var ReparsePointTag: UInt = 0u, public var EaSize: UInt = 0u)

public data class FILE_NOTIFY_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var Action: FILE_ACTION = 0u,
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_NOTIFY_INFORMATION) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.Action != other.Action) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.Action.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_REMOTE_PROTOCOL_INFO(
    public var StructureVersion: UShort = 0u,
    public var StructureSize: UShort = 0u,
    public var Protocol: UInt = 0u,
    public var ProtocolMajorVersion: UShort = 0u,
    public var ProtocolMinorVersion: UShort = 0u,
    public var ProtocolRevision: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Flags: UInt = 0u,
    public var GenericReserved: FILE_REMOTE_PROTOCOL_INFO_0 = FILE_REMOTE_PROTOCOL_INFO_0(),
    public var ProtocolSpecific: FILE_REMOTE_PROTOCOL_INFO_1 = FILE_REMOTE_PROTOCOL_INFO_1(),
)

public data class FILE_REMOTE_PROTOCOL_INFO_0(public var Reserved: UIntArray = UIntArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_REMOTE_PROTOCOL_INFO_0) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved.contentHashCode()
    }
}

public data class FILE_REMOTE_PROTOCOL_INFO_1(public var Smb2: FILE_REMOTE_PROTOCOL_INFO_1_0 = FILE_REMOTE_PROTOCOL_INFO_1_0(), public var Reserved: UIntArray = UIntArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_REMOTE_PROTOCOL_INFO_1) return false
        if (this.Smb2 != other.Smb2) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Smb2.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class FILE_REMOTE_PROTOCOL_INFO_1_0(public var Server: FILE_REMOTE_PROTOCOL_INFO_1_0_0 = FILE_REMOTE_PROTOCOL_INFO_1_0_0(), public var Share: FILE_REMOTE_PROTOCOL_INFO_1_0_1 = FILE_REMOTE_PROTOCOL_INFO_1_0_1())

public data class FILE_REMOTE_PROTOCOL_INFO_1_0_0(public var Capabilities: UInt = 0u)

public data class FILE_REMOTE_PROTOCOL_INFO_1_0_1(public var Capabilities: UInt = 0u, public var ShareFlags: UInt = 0u)

public data class FILE_RENAME_INFO(
    public var Anonymous: FILE_RENAME_INFO_0 = FILE_RENAME_INFO_0(),
    public var RootDirectory: HANDLE = 0L,
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_RENAME_INFO) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.RootDirectory != other.RootDirectory) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.RootDirectory.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_RENAME_INFO_0(public var ReplaceIfExists: Boolean = false, public var Flags: UInt = 0u)

public data class FILE_SEGMENT_ELEMENT(public var Buffer: Long = 0L, public var Alignment: ULong = 0uL)

public data class FILE_STANDARD_INFO(
    public var AllocationSize: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var NumberOfLinks: UInt = 0u,
    public var DeletePending: Boolean = false,
    public var Directory: Boolean = false,
)

public data class FILE_STORAGE_INFO(
    public var LogicalBytesPerSector: UInt = 0u,
    public var PhysicalBytesPerSectorForAtomicity: UInt = 0u,
    public var PhysicalBytesPerSectorForPerformance: UInt = 0u,
    public var FileSystemEffectivePhysicalBytesPerSectorForAtomicity: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ByteOffsetForSectorAlignment: UInt = 0u,
    public var ByteOffsetForPartitionAlignment: UInt = 0u,
)

public data class FILE_STREAM_INFO(
    public var NextEntryOffset: UInt = 0u,
    public var StreamNameLength: UInt = 0u,
    public var StreamSize: Long = 0L,
    public var StreamAllocationSize: Long = 0L,
    public var StreamName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_STREAM_INFO) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.StreamNameLength != other.StreamNameLength) return false
        if (this.StreamSize != other.StreamSize) return false
        if (this.StreamAllocationSize != other.StreamAllocationSize) return false
        if (!this.StreamName.contentEquals(other.StreamName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.StreamNameLength.hashCode()
        result = 31 * result + this.StreamSize.hashCode()
        result = 31 * result + this.StreamAllocationSize.hashCode()
        result = 31 * result + this.StreamName.contentHashCode()
        return result
    }
}

public data class FIO_CONTEXT(
    public var m_dwTempHack: UInt = 0u,
    public var m_dwSignature: UInt = 0u,
    public var m_hFile: HANDLE = 0L,
    public var m_dwLinesOffset: UInt = 0u,
    public var m_dwHeaderLength: UInt = 0u,
)

public data class IORING_BUFFER_INFO(public var Address: Long = 0L, public var Length: UInt = 0u)

public data class IORING_BUFFER_REF(public var Kind: IORING_REF_KIND = 0, public var Buffer: IORING_BUFFER_REF_0 = IORING_BUFFER_REF_0())

public data class IORING_BUFFER_REF_0(public var Address: Long = 0L, public var IndexAndOffset: IORING_REGISTERED_BUFFER = IORING_REGISTERED_BUFFER())

public data class IORING_CAPABILITIES(
    public var MaxVersion: IORING_VERSION = 0,
    public var MaxSubmissionQueueSize: UInt = 0u,
    public var MaxCompletionQueueSize: UInt = 0u,
    public var FeatureFlags: IORING_FEATURE_FLAGS = 0,
)

public data class IORING_CQE(
    public var UserData: ULong = 0uL,
    public var ResultCode: HRESULT = 0,
    public var Information: ULong = 0uL,
)

public data class IORING_CREATE_FLAGS(public var Required: IORING_CREATE_REQUIRED_FLAGS = 0, public var Advisory: IORING_CREATE_ADVISORY_FLAGS = 0)

public data class IORING_HANDLE_REF(public var Kind: IORING_REF_KIND = 0, public var Handle: IORING_HANDLE_REF_0 = IORING_HANDLE_REF_0())

public data class IORING_HANDLE_REF_0(public var Handle: HANDLE = 0L, public var Index: UInt = 0u)

public data class IORING_INFO(
    public var IoRingVersion: IORING_VERSION = 0,
    public var Flags: IORING_CREATE_FLAGS = IORING_CREATE_FLAGS(),
    public var SubmissionQueueSize: UInt = 0u,
    public var CompletionQueueSize: UInt = 0u,
)

public data class IORING_REGISTERED_BUFFER(public var BufferIndex: UInt = 0u, public var Offset: UInt = 0u)

public data class KCRM_MARSHAL_HEADER(
    public var VersionMajor: UInt = 0u,
    public var VersionMinor: UInt = 0u,
    public var NumProtocols: UInt = 0u,
    public var Unused: UInt = 0u,
)

public data class KCRM_PROTOCOL_BLOB(
    public var ProtocolId: GUID = GUID(),
    public var StaticInfoLength: UInt = 0u,
    public var TransactionIdInfoLength: UInt = 0u,
    public var Unused1: UInt = 0u,
    public var Unused2: UInt = 0u,
)

public data class KCRM_TRANSACTION_BLOB(
    public var UOW: GUID = GUID(),
    public var TmIdentity: GUID = GUID(),
    public var IsolationLevel: UInt = 0u,
    public var IsolationFlags: UInt = 0u,
    public var Timeout: UInt = 0u,
    public var Description: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KCRM_TRANSACTION_BLOB) return false
        if (this.UOW != other.UOW) return false
        if (this.TmIdentity != other.TmIdentity) return false
        if (this.IsolationLevel != other.IsolationLevel) return false
        if (this.IsolationFlags != other.IsolationFlags) return false
        if (this.Timeout != other.Timeout) return false
        if (!this.Description.contentEquals(other.Description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.UOW.hashCode()
        result = 31 * result + this.TmIdentity.hashCode()
        result = 31 * result + this.IsolationLevel.hashCode()
        result = 31 * result + this.IsolationFlags.hashCode()
        result = 31 * result + this.Timeout.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        return result
    }
}

public data class LOG_MANAGEMENT_CALLBACKS(
    public var CallbackContext: Long = 0L,
    public var AdvanceTailCallback: PLOG_TAIL_ADVANCE_CALLBACK = null,
    public var LogFullHandlerCallback: PLOG_FULL_HANDLER_CALLBACK = null,
    public var LogUnpinnedCallback: PLOG_UNPINNED_CALLBACK = null,
)

public data class MediaLabelInfo(
    public var LabelType: UShortArray = UShortArray(64),
    public var LabelIDSize: UInt = 0u,
    public var LabelID: UByteArray = UByteArray(256),
    public var LabelAppDescr: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MediaLabelInfo) return false
        if (!this.LabelType.contentEquals(other.LabelType)) return false
        if (this.LabelIDSize != other.LabelIDSize) return false
        if (!this.LabelID.contentEquals(other.LabelID)) return false
        if (!this.LabelAppDescr.contentEquals(other.LabelAppDescr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LabelType.contentHashCode()
        result = 31 * result + this.LabelIDSize.hashCode()
        result = 31 * result + this.LabelID.contentHashCode()
        result = 31 * result + this.LabelAppDescr.contentHashCode()
        return result
    }
}

public data class NAME_CACHE_CONTEXT(public var m_dwSignature: UInt = 0u)

public data class NTMS_ALLOCATION_INFORMATION(
    public var dwSize: UInt = 0u,
    public var lpReserved: Long = 0L,
    public var AllocatedFrom: GUID = GUID(),
)

public data class NTMS_ASYNC_IO(
    public var OperationId: GUID = GUID(),
    public var EventId: GUID = GUID(),
    public var dwOperationType: UInt = 0u,
    public var dwResult: UInt = 0u,
    public var dwAsyncState: UInt = 0u,
    public var hEvent: HANDLE = 0L,
    public var bOnStateChange: BOOL = 0,
)

public data class NTMS_CHANGERINFORMATIONA(
    public var Number: UInt = 0u,
    public var ChangerType: GUID = GUID(),
    public var szSerialNumber: ByteArray = ByteArray(32),
    public var szRevision: ByteArray = ByteArray(32),
    public var szDeviceName: ByteArray = ByteArray(64),
    public var ScsiPort: UShort = 0u,
    public var ScsiBus: UShort = 0u,
    public var ScsiTarget: UShort = 0u,
    public var ScsiLun: UShort = 0u,
    public var Library: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_CHANGERINFORMATIONA) return false
        if (this.Number != other.Number) return false
        if (this.ChangerType != other.ChangerType) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (this.ScsiPort != other.ScsiPort) return false
        if (this.ScsiBus != other.ScsiBus) return false
        if (this.ScsiTarget != other.ScsiTarget) return false
        if (this.ScsiLun != other.ScsiLun) return false
        if (this.Library != other.Library) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Number.hashCode()
        result = 31 * result + this.ChangerType.hashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.ScsiPort.hashCode()
        result = 31 * result + this.ScsiBus.hashCode()
        result = 31 * result + this.ScsiTarget.hashCode()
        result = 31 * result + this.ScsiLun.hashCode()
        result = 31 * result + this.Library.hashCode()
        return result
    }
}

public data class NTMS_CHANGERINFORMATIONW(
    public var Number: UInt = 0u,
    public var ChangerType: GUID = GUID(),
    public var szSerialNumber: UShortArray = UShortArray(32),
    public var szRevision: UShortArray = UShortArray(32),
    public var szDeviceName: UShortArray = UShortArray(64),
    public var ScsiPort: UShort = 0u,
    public var ScsiBus: UShort = 0u,
    public var ScsiTarget: UShort = 0u,
    public var ScsiLun: UShort = 0u,
    public var Library: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_CHANGERINFORMATIONW) return false
        if (this.Number != other.Number) return false
        if (this.ChangerType != other.ChangerType) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (this.ScsiPort != other.ScsiPort) return false
        if (this.ScsiBus != other.ScsiBus) return false
        if (this.ScsiTarget != other.ScsiTarget) return false
        if (this.ScsiLun != other.ScsiLun) return false
        if (this.Library != other.Library) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Number.hashCode()
        result = 31 * result + this.ChangerType.hashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.ScsiPort.hashCode()
        result = 31 * result + this.ScsiBus.hashCode()
        result = 31 * result + this.ScsiTarget.hashCode()
        result = 31 * result + this.ScsiLun.hashCode()
        result = 31 * result + this.Library.hashCode()
        return result
    }
}

public data class NTMS_CHANGERTYPEINFORMATIONA(
    public var szVendor: ByteArray = ByteArray(128),
    public var szProduct: ByteArray = ByteArray(128),
    public var DeviceType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_CHANGERTYPEINFORMATIONA) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.DeviceType != other.DeviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.DeviceType.hashCode()
        return result
    }
}

public data class NTMS_CHANGERTYPEINFORMATIONW(
    public var szVendor: UShortArray = UShortArray(128),
    public var szProduct: UShortArray = UShortArray(128),
    public var DeviceType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_CHANGERTYPEINFORMATIONW) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.DeviceType != other.DeviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.DeviceType.hashCode()
        return result
    }
}

public data class NTMS_COMPUTERINFORMATION(
    public var dwLibRequestPurgeTime: UInt = 0u,
    public var dwOpRequestPurgeTime: UInt = 0u,
    public var dwLibRequestFlags: UInt = 0u,
    public var dwOpRequestFlags: UInt = 0u,
    public var dwMediaPoolPolicy: UInt = 0u,
)

public data class NTMS_DRIVEINFORMATIONA(
    public var Number: UInt = 0u,
    public var State: UInt = 0u,
    public var DriveType: GUID = GUID(),
    public var szDeviceName: ByteArray = ByteArray(64),
    public var szSerialNumber: ByteArray = ByteArray(32),
    public var szRevision: ByteArray = ByteArray(32),
    public var ScsiPort: UShort = 0u,
    public var ScsiBus: UShort = 0u,
    public var ScsiTarget: UShort = 0u,
    public var ScsiLun: UShort = 0u,
    public var dwMountCount: UInt = 0u,
    public var LastCleanedTs: SYSTEMTIME = SYSTEMTIME(),
    public var SavedPartitionId: GUID = GUID(),
    public var Library: GUID = GUID(),
    public var Reserved: GUID = GUID(),
    public var dwDeferDismountDelay: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_DRIVEINFORMATIONA) return false
        if (this.Number != other.Number) return false
        if (this.State != other.State) return false
        if (this.DriveType != other.DriveType) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (this.ScsiPort != other.ScsiPort) return false
        if (this.ScsiBus != other.ScsiBus) return false
        if (this.ScsiTarget != other.ScsiTarget) return false
        if (this.ScsiLun != other.ScsiLun) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.LastCleanedTs != other.LastCleanedTs) return false
        if (this.SavedPartitionId != other.SavedPartitionId) return false
        if (this.Library != other.Library) return false
        if (this.Reserved != other.Reserved) return false
        if (this.dwDeferDismountDelay != other.dwDeferDismountDelay) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Number.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.DriveType.hashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.ScsiPort.hashCode()
        result = 31 * result + this.ScsiBus.hashCode()
        result = 31 * result + this.ScsiTarget.hashCode()
        result = 31 * result + this.ScsiLun.hashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.LastCleanedTs.hashCode()
        result = 31 * result + this.SavedPartitionId.hashCode()
        result = 31 * result + this.Library.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.dwDeferDismountDelay.hashCode()
        return result
    }
}

public data class NTMS_DRIVEINFORMATIONW(
    public var Number: UInt = 0u,
    public var State: UInt = 0u,
    public var DriveType: GUID = GUID(),
    public var szDeviceName: UShortArray = UShortArray(64),
    public var szSerialNumber: UShortArray = UShortArray(32),
    public var szRevision: UShortArray = UShortArray(32),
    public var ScsiPort: UShort = 0u,
    public var ScsiBus: UShort = 0u,
    public var ScsiTarget: UShort = 0u,
    public var ScsiLun: UShort = 0u,
    public var dwMountCount: UInt = 0u,
    public var LastCleanedTs: SYSTEMTIME = SYSTEMTIME(),
    public var SavedPartitionId: GUID = GUID(),
    public var Library: GUID = GUID(),
    public var Reserved: GUID = GUID(),
    public var dwDeferDismountDelay: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_DRIVEINFORMATIONW) return false
        if (this.Number != other.Number) return false
        if (this.State != other.State) return false
        if (this.DriveType != other.DriveType) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (this.ScsiPort != other.ScsiPort) return false
        if (this.ScsiBus != other.ScsiBus) return false
        if (this.ScsiTarget != other.ScsiTarget) return false
        if (this.ScsiLun != other.ScsiLun) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.LastCleanedTs != other.LastCleanedTs) return false
        if (this.SavedPartitionId != other.SavedPartitionId) return false
        if (this.Library != other.Library) return false
        if (this.Reserved != other.Reserved) return false
        if (this.dwDeferDismountDelay != other.dwDeferDismountDelay) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Number.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.DriveType.hashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.ScsiPort.hashCode()
        result = 31 * result + this.ScsiBus.hashCode()
        result = 31 * result + this.ScsiTarget.hashCode()
        result = 31 * result + this.ScsiLun.hashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.LastCleanedTs.hashCode()
        result = 31 * result + this.SavedPartitionId.hashCode()
        result = 31 * result + this.Library.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.dwDeferDismountDelay.hashCode()
        return result
    }
}

public data class NTMS_DRIVETYPEINFORMATIONA(
    public var szVendor: ByteArray = ByteArray(128),
    public var szProduct: ByteArray = ByteArray(128),
    public var NumberOfHeads: UInt = 0u,
    public var DeviceType: FILE_DEVICE_TYPE = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_DRIVETYPEINFORMATIONA) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.NumberOfHeads != other.NumberOfHeads) return false
        if (this.DeviceType != other.DeviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.NumberOfHeads.hashCode()
        result = 31 * result + this.DeviceType.hashCode()
        return result
    }
}

public data class NTMS_DRIVETYPEINFORMATIONW(
    public var szVendor: UShortArray = UShortArray(128),
    public var szProduct: UShortArray = UShortArray(128),
    public var NumberOfHeads: UInt = 0u,
    public var DeviceType: FILE_DEVICE_TYPE = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_DRIVETYPEINFORMATIONW) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.NumberOfHeads != other.NumberOfHeads) return false
        if (this.DeviceType != other.DeviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.NumberOfHeads.hashCode()
        result = 31 * result + this.DeviceType.hashCode()
        return result
    }
}

public data class NTMS_FILESYSTEM_INFO(
    public var FileSystemType: UShortArray = UShortArray(64),
    public var VolumeName: UShortArray = UShortArray(256),
    public var SerialNumber: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_FILESYSTEM_INFO) return false
        if (!this.FileSystemType.contentEquals(other.FileSystemType)) return false
        if (!this.VolumeName.contentEquals(other.VolumeName)) return false
        if (this.SerialNumber != other.SerialNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileSystemType.contentHashCode()
        result = 31 * result + this.VolumeName.contentHashCode()
        result = 31 * result + this.SerialNumber.hashCode()
        return result
    }
}

public class NTMS_I1_LIBRARYINFORMATION(
    public var LibraryType: UInt = 0u,
    public var CleanerSlot: GUID = GUID(),
    public var CleanerSlotDefault: GUID = GUID(),
    public var LibrarySupportsDriveCleaning: BOOL = 0,
    public var BarCodeReaderInstalled: BOOL = 0,
    public var InventoryMethod: UInt = 0u,
    public var dwCleanerUsesRemaining: UInt = 0u,
    public var FirstDriveNumber: UInt = 0u,
    public var dwNumberOfDrives: UInt = 0u,
    public var FirstSlotNumber: UInt = 0u,
    public var dwNumberOfSlots: UInt = 0u,
    public var FirstDoorNumber: UInt = 0u,
    public var dwNumberOfDoors: UInt = 0u,
    public var FirstPortNumber: UInt = 0u,
    public var dwNumberOfPorts: UInt = 0u,
    public var FirstChangerNumber: UInt = 0u,
    public var dwNumberOfChangers: UInt = 0u,
    public var dwNumberOfMedia: UInt = 0u,
    public var dwNumberOfMediaTypes: UInt = 0u,
    public var dwNumberOfLibRequests: UInt = 0u,
    public var Reserved: GUID = GUID(),
)

public data class NTMS_I1_LIBREQUESTINFORMATIONA(
    public var OperationCode: UInt = 0u,
    public var OperationOption: UInt = 0u,
    public var State: UInt = 0u,
    public var PartitionId: GUID = GUID(),
    public var DriveId: GUID = GUID(),
    public var PhysMediaId: GUID = GUID(),
    public var Library: GUID = GUID(),
    public var SlotId: GUID = GUID(),
    public var TimeQueued: SYSTEMTIME = SYSTEMTIME(),
    public var TimeCompleted: SYSTEMTIME = SYSTEMTIME(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_I1_LIBREQUESTINFORMATIONA) return false
        if (this.OperationCode != other.OperationCode) return false
        if (this.OperationOption != other.OperationOption) return false
        if (this.State != other.State) return false
        if (this.PartitionId != other.PartitionId) return false
        if (this.DriveId != other.DriveId) return false
        if (this.PhysMediaId != other.PhysMediaId) return false
        if (this.Library != other.Library) return false
        if (this.SlotId != other.SlotId) return false
        if (this.TimeQueued != other.TimeQueued) return false
        if (this.TimeCompleted != other.TimeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OperationCode.hashCode()
        result = 31 * result + this.OperationOption.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.PartitionId.hashCode()
        result = 31 * result + this.DriveId.hashCode()
        result = 31 * result + this.PhysMediaId.hashCode()
        result = 31 * result + this.Library.hashCode()
        result = 31 * result + this.SlotId.hashCode()
        result = 31 * result + this.TimeQueued.hashCode()
        result = 31 * result + this.TimeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NTMS_I1_LIBREQUESTINFORMATIONW(
    public var OperationCode: UInt = 0u,
    public var OperationOption: UInt = 0u,
    public var State: UInt = 0u,
    public var PartitionId: GUID = GUID(),
    public var DriveId: GUID = GUID(),
    public var PhysMediaId: GUID = GUID(),
    public var Library: GUID = GUID(),
    public var SlotId: GUID = GUID(),
    public var TimeQueued: SYSTEMTIME = SYSTEMTIME(),
    public var TimeCompleted: SYSTEMTIME = SYSTEMTIME(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_I1_LIBREQUESTINFORMATIONW) return false
        if (this.OperationCode != other.OperationCode) return false
        if (this.OperationOption != other.OperationOption) return false
        if (this.State != other.State) return false
        if (this.PartitionId != other.PartitionId) return false
        if (this.DriveId != other.DriveId) return false
        if (this.PhysMediaId != other.PhysMediaId) return false
        if (this.Library != other.Library) return false
        if (this.SlotId != other.SlotId) return false
        if (this.TimeQueued != other.TimeQueued) return false
        if (this.TimeCompleted != other.TimeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OperationCode.hashCode()
        result = 31 * result + this.OperationOption.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.PartitionId.hashCode()
        result = 31 * result + this.DriveId.hashCode()
        result = 31 * result + this.PhysMediaId.hashCode()
        result = 31 * result + this.Library.hashCode()
        result = 31 * result + this.SlotId.hashCode()
        result = 31 * result + this.TimeQueued.hashCode()
        result = 31 * result + this.TimeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NTMS_I1_OBJECTINFORMATIONA(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var Created: SYSTEMTIME = SYSTEMTIME(),
    public var Modified: SYSTEMTIME = SYSTEMTIME(),
    public var ObjectGuid: GUID = GUID(),
    public var Enabled: BOOL = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
    public var szDescription: ByteArray = ByteArray(127),
    public var Info: NTMS_I1_OBJECTINFORMATIONA_0 = NTMS_I1_OBJECTINFORMATIONA_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_I1_OBJECTINFORMATIONA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.Created != other.Created) return false
        if (this.Modified != other.Modified) return false
        if (this.ObjectGuid != other.ObjectGuid) return false
        if (this.Enabled != other.Enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.Info != other.Info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.Created.hashCode()
        result = 31 * result + this.Modified.hashCode()
        result = 31 * result + this.ObjectGuid.hashCode()
        result = 31 * result + this.Enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.Info.hashCode()
        return result
    }
}

public data class NTMS_I1_OBJECTINFORMATIONA_0(
    public var Drive: NTMS_DRIVEINFORMATIONA = NTMS_DRIVEINFORMATIONA(),
    public var DriveType: NTMS_DRIVETYPEINFORMATIONA = NTMS_DRIVETYPEINFORMATIONA(),
    public var Library: NTMS_I1_LIBRARYINFORMATION = NTMS_I1_LIBRARYINFORMATION(),
    public var Changer: NTMS_CHANGERINFORMATIONA = NTMS_CHANGERINFORMATIONA(),
    public var ChangerType: NTMS_CHANGERTYPEINFORMATIONA = NTMS_CHANGERTYPEINFORMATIONA(),
    public var StorageSlot: NTMS_STORAGESLOTINFORMATION = NTMS_STORAGESLOTINFORMATION(),
    public var IEDoor: NTMS_IEDOORINFORMATION = NTMS_IEDOORINFORMATION(),
    public var IEPort: NTMS_IEPORTINFORMATION = NTMS_IEPORTINFORMATION(),
    public var PhysicalMedia: NTMS_I1_PMIDINFORMATIONA = NTMS_I1_PMIDINFORMATIONA(),
    public var LogicalMedia: NTMS_LMIDINFORMATION = NTMS_LMIDINFORMATION(),
    public var Partition: NTMS_I1_PARTITIONINFORMATIONA = NTMS_I1_PARTITIONINFORMATIONA(),
    public var MediaPool: NTMS_MEDIAPOOLINFORMATION = NTMS_MEDIAPOOLINFORMATION(),
    public var MediaType: NTMS_MEDIATYPEINFORMATION = NTMS_MEDIATYPEINFORMATION(),
    public var LibRequest: NTMS_I1_LIBREQUESTINFORMATIONA = NTMS_I1_LIBREQUESTINFORMATIONA(),
    public var OpRequest: NTMS_I1_OPREQUESTINFORMATIONA = NTMS_I1_OPREQUESTINFORMATIONA(),
)

public data class NTMS_I1_OBJECTINFORMATIONW(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var Created: SYSTEMTIME = SYSTEMTIME(),
    public var Modified: SYSTEMTIME = SYSTEMTIME(),
    public var ObjectGuid: GUID = GUID(),
    public var Enabled: BOOL = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
    public var szDescription: UShortArray = UShortArray(127),
    public var Info: NTMS_I1_OBJECTINFORMATIONW_0 = NTMS_I1_OBJECTINFORMATIONW_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_I1_OBJECTINFORMATIONW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.Created != other.Created) return false
        if (this.Modified != other.Modified) return false
        if (this.ObjectGuid != other.ObjectGuid) return false
        if (this.Enabled != other.Enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.Info != other.Info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.Created.hashCode()
        result = 31 * result + this.Modified.hashCode()
        result = 31 * result + this.ObjectGuid.hashCode()
        result = 31 * result + this.Enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.Info.hashCode()
        return result
    }
}

public data class NTMS_I1_OBJECTINFORMATIONW_0(
    public var Drive: NTMS_DRIVEINFORMATIONW = NTMS_DRIVEINFORMATIONW(),
    public var DriveType: NTMS_DRIVETYPEINFORMATIONW = NTMS_DRIVETYPEINFORMATIONW(),
    public var Library: NTMS_I1_LIBRARYINFORMATION = NTMS_I1_LIBRARYINFORMATION(),
    public var Changer: NTMS_CHANGERINFORMATIONW = NTMS_CHANGERINFORMATIONW(),
    public var ChangerType: NTMS_CHANGERTYPEINFORMATIONW = NTMS_CHANGERTYPEINFORMATIONW(),
    public var StorageSlot: NTMS_STORAGESLOTINFORMATION = NTMS_STORAGESLOTINFORMATION(),
    public var IEDoor: NTMS_IEDOORINFORMATION = NTMS_IEDOORINFORMATION(),
    public var IEPort: NTMS_IEPORTINFORMATION = NTMS_IEPORTINFORMATION(),
    public var PhysicalMedia: NTMS_I1_PMIDINFORMATIONW = NTMS_I1_PMIDINFORMATIONW(),
    public var LogicalMedia: NTMS_LMIDINFORMATION = NTMS_LMIDINFORMATION(),
    public var Partition: NTMS_I1_PARTITIONINFORMATIONW = NTMS_I1_PARTITIONINFORMATIONW(),
    public var MediaPool: NTMS_MEDIAPOOLINFORMATION = NTMS_MEDIAPOOLINFORMATION(),
    public var MediaType: NTMS_MEDIATYPEINFORMATION = NTMS_MEDIATYPEINFORMATION(),
    public var LibRequest: NTMS_I1_LIBREQUESTINFORMATIONW = NTMS_I1_LIBREQUESTINFORMATIONW(),
    public var OpRequest: NTMS_I1_OPREQUESTINFORMATIONW = NTMS_I1_OPREQUESTINFORMATIONW(),
)

public data class NTMS_I1_OPREQUESTINFORMATIONA(
    public var Request: UInt = 0u,
    public var Submitted: SYSTEMTIME = SYSTEMTIME(),
    public var State: UInt = 0u,
    public var szMessage: ByteArray = ByteArray(127),
    public var Arg1Type: UInt = 0u,
    public var Arg1: GUID = GUID(),
    public var Arg2Type: UInt = 0u,
    public var Arg2: GUID = GUID(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_I1_OPREQUESTINFORMATIONA) return false
        if (this.Request != other.Request) return false
        if (this.Submitted != other.Submitted) return false
        if (this.State != other.State) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.Arg1Type != other.Arg1Type) return false
        if (this.Arg1 != other.Arg1) return false
        if (this.Arg2Type != other.Arg2Type) return false
        if (this.Arg2 != other.Arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Request.hashCode()
        result = 31 * result + this.Submitted.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.Arg1Type.hashCode()
        result = 31 * result + this.Arg1.hashCode()
        result = 31 * result + this.Arg2Type.hashCode()
        result = 31 * result + this.Arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NTMS_I1_OPREQUESTINFORMATIONW(
    public var Request: UInt = 0u,
    public var Submitted: SYSTEMTIME = SYSTEMTIME(),
    public var State: UInt = 0u,
    public var szMessage: UShortArray = UShortArray(127),
    public var Arg1Type: UInt = 0u,
    public var Arg1: GUID = GUID(),
    public var Arg2Type: UInt = 0u,
    public var Arg2: GUID = GUID(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_I1_OPREQUESTINFORMATIONW) return false
        if (this.Request != other.Request) return false
        if (this.Submitted != other.Submitted) return false
        if (this.State != other.State) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.Arg1Type != other.Arg1Type) return false
        if (this.Arg1 != other.Arg1) return false
        if (this.Arg2Type != other.Arg2Type) return false
        if (this.Arg2 != other.Arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Request.hashCode()
        result = 31 * result + this.Submitted.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.Arg1Type.hashCode()
        result = 31 * result + this.Arg1.hashCode()
        result = 31 * result + this.Arg2Type.hashCode()
        result = 31 * result + this.Arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NTMS_I1_PARTITIONINFORMATIONA(
    public var PhysicalMedia: GUID = GUID(),
    public var LogicalMedia: GUID = GUID(),
    public var State: UInt = 0u,
    public var Side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var OmidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: ByteArray = ByteArray(64),
    public var szOmidLabelInfo: ByteArray = ByteArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_I1_PARTITIONINFORMATIONA) return false
        if (this.PhysicalMedia != other.PhysicalMedia) return false
        if (this.LogicalMedia != other.LogicalMedia) return false
        if (this.State != other.State) return false
        if (this.Side != other.Side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.OmidLabelId.contentEquals(other.OmidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PhysicalMedia.hashCode()
        result = 31 * result + this.LogicalMedia.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.Side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.OmidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        return result
    }
}

public data class NTMS_I1_PARTITIONINFORMATIONW(
    public var PhysicalMedia: GUID = GUID(),
    public var LogicalMedia: GUID = GUID(),
    public var State: UInt = 0u,
    public var Side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var OmidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: UShortArray = UShortArray(64),
    public var szOmidLabelInfo: UShortArray = UShortArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_I1_PARTITIONINFORMATIONW) return false
        if (this.PhysicalMedia != other.PhysicalMedia) return false
        if (this.LogicalMedia != other.LogicalMedia) return false
        if (this.State != other.State) return false
        if (this.Side != other.Side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.OmidLabelId.contentEquals(other.OmidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PhysicalMedia.hashCode()
        result = 31 * result + this.LogicalMedia.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.Side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.OmidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        return result
    }
}

public data class NTMS_I1_PMIDINFORMATIONA(
    public var CurrentLibrary: GUID = GUID(),
    public var MediaPool: GUID = GUID(),
    public var Location: GUID = GUID(),
    public var LocationType: UInt = 0u,
    public var MediaType: GUID = GUID(),
    public var HomeSlot: GUID = GUID(),
    public var szBarCode: ByteArray = ByteArray(64),
    public var BarCodeState: UInt = 0u,
    public var szSequenceNumber: ByteArray = ByteArray(32),
    public var MediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_I1_PMIDINFORMATIONA) return false
        if (this.CurrentLibrary != other.CurrentLibrary) return false
        if (this.MediaPool != other.MediaPool) return false
        if (this.Location != other.Location) return false
        if (this.LocationType != other.LocationType) return false
        if (this.MediaType != other.MediaType) return false
        if (this.HomeSlot != other.HomeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.BarCodeState != other.BarCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.MediaState != other.MediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CurrentLibrary.hashCode()
        result = 31 * result + this.MediaPool.hashCode()
        result = 31 * result + this.Location.hashCode()
        result = 31 * result + this.LocationType.hashCode()
        result = 31 * result + this.MediaType.hashCode()
        result = 31 * result + this.HomeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.BarCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.MediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        return result
    }
}

public data class NTMS_I1_PMIDINFORMATIONW(
    public var CurrentLibrary: GUID = GUID(),
    public var MediaPool: GUID = GUID(),
    public var Location: GUID = GUID(),
    public var LocationType: UInt = 0u,
    public var MediaType: GUID = GUID(),
    public var HomeSlot: GUID = GUID(),
    public var szBarCode: UShortArray = UShortArray(64),
    public var BarCodeState: UInt = 0u,
    public var szSequenceNumber: UShortArray = UShortArray(32),
    public var MediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_I1_PMIDINFORMATIONW) return false
        if (this.CurrentLibrary != other.CurrentLibrary) return false
        if (this.MediaPool != other.MediaPool) return false
        if (this.Location != other.Location) return false
        if (this.LocationType != other.LocationType) return false
        if (this.MediaType != other.MediaType) return false
        if (this.HomeSlot != other.HomeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.BarCodeState != other.BarCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.MediaState != other.MediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CurrentLibrary.hashCode()
        result = 31 * result + this.MediaPool.hashCode()
        result = 31 * result + this.Location.hashCode()
        result = 31 * result + this.LocationType.hashCode()
        result = 31 * result + this.MediaType.hashCode()
        result = 31 * result + this.HomeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.BarCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.MediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        return result
    }
}

public data class NTMS_IEDOORINFORMATION(
    public var Number: UInt = 0u,
    public var State: UInt = 0u,
    public var MaxOpenSecs: UShort = 0u,
    public var Library: GUID = GUID(),
)

public data class NTMS_IEPORTINFORMATION(
    public var Number: UInt = 0u,
    public var Content: UInt = 0u,
    public var Position: UInt = 0u,
    public var MaxExtendSecs: UShort = 0u,
    public var Library: GUID = GUID(),
)

public class NTMS_LIBRARYINFORMATION(
    public var LibraryType: UInt = 0u,
    public var CleanerSlot: GUID = GUID(),
    public var CleanerSlotDefault: GUID = GUID(),
    public var LibrarySupportsDriveCleaning: BOOL = 0,
    public var BarCodeReaderInstalled: BOOL = 0,
    public var InventoryMethod: UInt = 0u,
    public var dwCleanerUsesRemaining: UInt = 0u,
    public var FirstDriveNumber: UInt = 0u,
    public var dwNumberOfDrives: UInt = 0u,
    public var FirstSlotNumber: UInt = 0u,
    public var dwNumberOfSlots: UInt = 0u,
    public var FirstDoorNumber: UInt = 0u,
    public var dwNumberOfDoors: UInt = 0u,
    public var FirstPortNumber: UInt = 0u,
    public var dwNumberOfPorts: UInt = 0u,
    public var FirstChangerNumber: UInt = 0u,
    public var dwNumberOfChangers: UInt = 0u,
    public var dwNumberOfMedia: UInt = 0u,
    public var dwNumberOfMediaTypes: UInt = 0u,
    public var dwNumberOfLibRequests: UInt = 0u,
    public var Reserved: GUID = GUID(),
    public var AutoRecovery: BOOL = 0,
    public var dwFlags: UInt = 0u,
)

public data class NTMS_LIBREQUESTINFORMATIONA(
    public var OperationCode: UInt = 0u,
    public var OperationOption: UInt = 0u,
    public var State: UInt = 0u,
    public var PartitionId: GUID = GUID(),
    public var DriveId: GUID = GUID(),
    public var PhysMediaId: GUID = GUID(),
    public var Library: GUID = GUID(),
    public var SlotId: GUID = GUID(),
    public var TimeQueued: SYSTEMTIME = SYSTEMTIME(),
    public var TimeCompleted: SYSTEMTIME = SYSTEMTIME(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
    public var dwErrorCode: UInt = 0u,
    public var WorkItemId: GUID = GUID(),
    public var dwPriority: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_LIBREQUESTINFORMATIONA) return false
        if (this.OperationCode != other.OperationCode) return false
        if (this.OperationOption != other.OperationOption) return false
        if (this.State != other.State) return false
        if (this.PartitionId != other.PartitionId) return false
        if (this.DriveId != other.DriveId) return false
        if (this.PhysMediaId != other.PhysMediaId) return false
        if (this.Library != other.Library) return false
        if (this.SlotId != other.SlotId) return false
        if (this.TimeQueued != other.TimeQueued) return false
        if (this.TimeCompleted != other.TimeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        if (this.dwErrorCode != other.dwErrorCode) return false
        if (this.WorkItemId != other.WorkItemId) return false
        if (this.dwPriority != other.dwPriority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OperationCode.hashCode()
        result = 31 * result + this.OperationOption.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.PartitionId.hashCode()
        result = 31 * result + this.DriveId.hashCode()
        result = 31 * result + this.PhysMediaId.hashCode()
        result = 31 * result + this.Library.hashCode()
        result = 31 * result + this.SlotId.hashCode()
        result = 31 * result + this.TimeQueued.hashCode()
        result = 31 * result + this.TimeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        result = 31 * result + this.dwErrorCode.hashCode()
        result = 31 * result + this.WorkItemId.hashCode()
        result = 31 * result + this.dwPriority.hashCode()
        return result
    }
}

public data class NTMS_LIBREQUESTINFORMATIONW(
    public var OperationCode: UInt = 0u,
    public var OperationOption: UInt = 0u,
    public var State: UInt = 0u,
    public var PartitionId: GUID = GUID(),
    public var DriveId: GUID = GUID(),
    public var PhysMediaId: GUID = GUID(),
    public var Library: GUID = GUID(),
    public var SlotId: GUID = GUID(),
    public var TimeQueued: SYSTEMTIME = SYSTEMTIME(),
    public var TimeCompleted: SYSTEMTIME = SYSTEMTIME(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
    public var dwErrorCode: UInt = 0u,
    public var WorkItemId: GUID = GUID(),
    public var dwPriority: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_LIBREQUESTINFORMATIONW) return false
        if (this.OperationCode != other.OperationCode) return false
        if (this.OperationOption != other.OperationOption) return false
        if (this.State != other.State) return false
        if (this.PartitionId != other.PartitionId) return false
        if (this.DriveId != other.DriveId) return false
        if (this.PhysMediaId != other.PhysMediaId) return false
        if (this.Library != other.Library) return false
        if (this.SlotId != other.SlotId) return false
        if (this.TimeQueued != other.TimeQueued) return false
        if (this.TimeCompleted != other.TimeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        if (this.dwErrorCode != other.dwErrorCode) return false
        if (this.WorkItemId != other.WorkItemId) return false
        if (this.dwPriority != other.dwPriority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OperationCode.hashCode()
        result = 31 * result + this.OperationOption.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.PartitionId.hashCode()
        result = 31 * result + this.DriveId.hashCode()
        result = 31 * result + this.PhysMediaId.hashCode()
        result = 31 * result + this.Library.hashCode()
        result = 31 * result + this.SlotId.hashCode()
        result = 31 * result + this.TimeQueued.hashCode()
        result = 31 * result + this.TimeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        result = 31 * result + this.dwErrorCode.hashCode()
        result = 31 * result + this.WorkItemId.hashCode()
        result = 31 * result + this.dwPriority.hashCode()
        return result
    }
}

public data class NTMS_LMIDINFORMATION(public var MediaPool: GUID = GUID(), public var dwNumberOfPartitions: UInt = 0u)

public data class NTMS_MEDIAPOOLINFORMATION(
    public var PoolType: UInt = 0u,
    public var MediaType: GUID = GUID(),
    public var Parent: GUID = GUID(),
    public var AllocationPolicy: UInt = 0u,
    public var DeallocationPolicy: UInt = 0u,
    public var dwMaxAllocates: UInt = 0u,
    public var dwNumberOfPhysicalMedia: UInt = 0u,
    public var dwNumberOfLogicalMedia: UInt = 0u,
    public var dwNumberOfMediaPools: UInt = 0u,
)

public data class NTMS_MEDIATYPEINFORMATION(
    public var MediaType: UInt = 0u,
    public var NumberOfSides: UInt = 0u,
    public var ReadWriteCharacteristics: UInt = 0u,
    public var DeviceType: FILE_DEVICE_TYPE = 0u,
)

public data class NTMS_MOUNT_INFORMATION(public var dwSize: UInt = 0u, public var lpReserved: Long = 0L)

public data class NTMS_NOTIFICATIONINFORMATION(public var dwOperation: UInt = 0u, public var ObjectId: GUID = GUID())

public data class NTMS_OBJECTINFORMATIONA(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var Created: SYSTEMTIME = SYSTEMTIME(),
    public var Modified: SYSTEMTIME = SYSTEMTIME(),
    public var ObjectGuid: GUID = GUID(),
    public var Enabled: BOOL = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
    public var szDescription: ByteArray = ByteArray(127),
    public var Info: NTMS_OBJECTINFORMATIONA_0 = NTMS_OBJECTINFORMATIONA_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_OBJECTINFORMATIONA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.Created != other.Created) return false
        if (this.Modified != other.Modified) return false
        if (this.ObjectGuid != other.ObjectGuid) return false
        if (this.Enabled != other.Enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.Info != other.Info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.Created.hashCode()
        result = 31 * result + this.Modified.hashCode()
        result = 31 * result + this.ObjectGuid.hashCode()
        result = 31 * result + this.Enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.Info.hashCode()
        return result
    }
}

public data class NTMS_OBJECTINFORMATIONA_0(
    public var Drive: NTMS_DRIVEINFORMATIONA = NTMS_DRIVEINFORMATIONA(),
    public var DriveType: NTMS_DRIVETYPEINFORMATIONA = NTMS_DRIVETYPEINFORMATIONA(),
    public var Library: NTMS_LIBRARYINFORMATION = NTMS_LIBRARYINFORMATION(),
    public var Changer: NTMS_CHANGERINFORMATIONA = NTMS_CHANGERINFORMATIONA(),
    public var ChangerType: NTMS_CHANGERTYPEINFORMATIONA = NTMS_CHANGERTYPEINFORMATIONA(),
    public var StorageSlot: NTMS_STORAGESLOTINFORMATION = NTMS_STORAGESLOTINFORMATION(),
    public var IEDoor: NTMS_IEDOORINFORMATION = NTMS_IEDOORINFORMATION(),
    public var IEPort: NTMS_IEPORTINFORMATION = NTMS_IEPORTINFORMATION(),
    public var PhysicalMedia: NTMS_PMIDINFORMATIONA = NTMS_PMIDINFORMATIONA(),
    public var LogicalMedia: NTMS_LMIDINFORMATION = NTMS_LMIDINFORMATION(),
    public var Partition: NTMS_PARTITIONINFORMATIONA = NTMS_PARTITIONINFORMATIONA(),
    public var MediaPool: NTMS_MEDIAPOOLINFORMATION = NTMS_MEDIAPOOLINFORMATION(),
    public var MediaType: NTMS_MEDIATYPEINFORMATION = NTMS_MEDIATYPEINFORMATION(),
    public var LibRequest: NTMS_LIBREQUESTINFORMATIONA = NTMS_LIBREQUESTINFORMATIONA(),
    public var OpRequest: NTMS_OPREQUESTINFORMATIONA = NTMS_OPREQUESTINFORMATIONA(),
    public var Computer: NTMS_COMPUTERINFORMATION = NTMS_COMPUTERINFORMATION(),
)

public data class NTMS_OBJECTINFORMATIONW(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var Created: SYSTEMTIME = SYSTEMTIME(),
    public var Modified: SYSTEMTIME = SYSTEMTIME(),
    public var ObjectGuid: GUID = GUID(),
    public var Enabled: BOOL = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
    public var szDescription: UShortArray = UShortArray(127),
    public var Info: NTMS_OBJECTINFORMATIONW_0 = NTMS_OBJECTINFORMATIONW_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_OBJECTINFORMATIONW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.Created != other.Created) return false
        if (this.Modified != other.Modified) return false
        if (this.ObjectGuid != other.ObjectGuid) return false
        if (this.Enabled != other.Enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.Info != other.Info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.Created.hashCode()
        result = 31 * result + this.Modified.hashCode()
        result = 31 * result + this.ObjectGuid.hashCode()
        result = 31 * result + this.Enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.Info.hashCode()
        return result
    }
}

public data class NTMS_OBJECTINFORMATIONW_0(
    public var Drive: NTMS_DRIVEINFORMATIONW = NTMS_DRIVEINFORMATIONW(),
    public var DriveType: NTMS_DRIVETYPEINFORMATIONW = NTMS_DRIVETYPEINFORMATIONW(),
    public var Library: NTMS_LIBRARYINFORMATION = NTMS_LIBRARYINFORMATION(),
    public var Changer: NTMS_CHANGERINFORMATIONW = NTMS_CHANGERINFORMATIONW(),
    public var ChangerType: NTMS_CHANGERTYPEINFORMATIONW = NTMS_CHANGERTYPEINFORMATIONW(),
    public var StorageSlot: NTMS_STORAGESLOTINFORMATION = NTMS_STORAGESLOTINFORMATION(),
    public var IEDoor: NTMS_IEDOORINFORMATION = NTMS_IEDOORINFORMATION(),
    public var IEPort: NTMS_IEPORTINFORMATION = NTMS_IEPORTINFORMATION(),
    public var PhysicalMedia: NTMS_PMIDINFORMATIONW = NTMS_PMIDINFORMATIONW(),
    public var LogicalMedia: NTMS_LMIDINFORMATION = NTMS_LMIDINFORMATION(),
    public var Partition: NTMS_PARTITIONINFORMATIONW = NTMS_PARTITIONINFORMATIONW(),
    public var MediaPool: NTMS_MEDIAPOOLINFORMATION = NTMS_MEDIAPOOLINFORMATION(),
    public var MediaType: NTMS_MEDIATYPEINFORMATION = NTMS_MEDIATYPEINFORMATION(),
    public var LibRequest: NTMS_LIBREQUESTINFORMATIONW = NTMS_LIBREQUESTINFORMATIONW(),
    public var OpRequest: NTMS_OPREQUESTINFORMATIONW = NTMS_OPREQUESTINFORMATIONW(),
    public var Computer: NTMS_COMPUTERINFORMATION = NTMS_COMPUTERINFORMATION(),
)

public data class NTMS_OPREQUESTINFORMATIONA(
    public var Request: UInt = 0u,
    public var Submitted: SYSTEMTIME = SYSTEMTIME(),
    public var State: UInt = 0u,
    public var szMessage: ByteArray = ByteArray(256),
    public var Arg1Type: UInt = 0u,
    public var Arg1: GUID = GUID(),
    public var Arg2Type: UInt = 0u,
    public var Arg2: GUID = GUID(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_OPREQUESTINFORMATIONA) return false
        if (this.Request != other.Request) return false
        if (this.Submitted != other.Submitted) return false
        if (this.State != other.State) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.Arg1Type != other.Arg1Type) return false
        if (this.Arg1 != other.Arg1) return false
        if (this.Arg2Type != other.Arg2Type) return false
        if (this.Arg2 != other.Arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Request.hashCode()
        result = 31 * result + this.Submitted.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.Arg1Type.hashCode()
        result = 31 * result + this.Arg1.hashCode()
        result = 31 * result + this.Arg2Type.hashCode()
        result = 31 * result + this.Arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NTMS_OPREQUESTINFORMATIONW(
    public var Request: UInt = 0u,
    public var Submitted: SYSTEMTIME = SYSTEMTIME(),
    public var State: UInt = 0u,
    public var szMessage: UShortArray = UShortArray(256),
    public var Arg1Type: UInt = 0u,
    public var Arg1: GUID = GUID(),
    public var Arg2Type: UInt = 0u,
    public var Arg2: GUID = GUID(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_OPREQUESTINFORMATIONW) return false
        if (this.Request != other.Request) return false
        if (this.Submitted != other.Submitted) return false
        if (this.State != other.State) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.Arg1Type != other.Arg1Type) return false
        if (this.Arg1 != other.Arg1) return false
        if (this.Arg2Type != other.Arg2Type) return false
        if (this.Arg2 != other.Arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Request.hashCode()
        result = 31 * result + this.Submitted.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.Arg1Type.hashCode()
        result = 31 * result + this.Arg1.hashCode()
        result = 31 * result + this.Arg2Type.hashCode()
        result = 31 * result + this.Arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NTMS_PARTITIONINFORMATIONA(
    public var PhysicalMedia: GUID = GUID(),
    public var LogicalMedia: GUID = GUID(),
    public var State: UInt = 0u,
    public var Side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var OmidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: ByteArray = ByteArray(64),
    public var szOmidLabelInfo: ByteArray = ByteArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
    public var Capacity: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_PARTITIONINFORMATIONA) return false
        if (this.PhysicalMedia != other.PhysicalMedia) return false
        if (this.LogicalMedia != other.LogicalMedia) return false
        if (this.State != other.State) return false
        if (this.Side != other.Side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.OmidLabelId.contentEquals(other.OmidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        if (this.Capacity != other.Capacity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PhysicalMedia.hashCode()
        result = 31 * result + this.LogicalMedia.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.Side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.OmidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        result = 31 * result + this.Capacity.hashCode()
        return result
    }
}

public data class NTMS_PARTITIONINFORMATIONW(
    public var PhysicalMedia: GUID = GUID(),
    public var LogicalMedia: GUID = GUID(),
    public var State: UInt = 0u,
    public var Side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var OmidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: UShortArray = UShortArray(64),
    public var szOmidLabelInfo: UShortArray = UShortArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
    public var Capacity: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_PARTITIONINFORMATIONW) return false
        if (this.PhysicalMedia != other.PhysicalMedia) return false
        if (this.LogicalMedia != other.LogicalMedia) return false
        if (this.State != other.State) return false
        if (this.Side != other.Side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.OmidLabelId.contentEquals(other.OmidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        if (this.Capacity != other.Capacity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PhysicalMedia.hashCode()
        result = 31 * result + this.LogicalMedia.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.Side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.OmidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        result = 31 * result + this.Capacity.hashCode()
        return result
    }
}

public data class NTMS_PMIDINFORMATIONA(
    public var CurrentLibrary: GUID = GUID(),
    public var MediaPool: GUID = GUID(),
    public var Location: GUID = GUID(),
    public var LocationType: UInt = 0u,
    public var MediaType: GUID = GUID(),
    public var HomeSlot: GUID = GUID(),
    public var szBarCode: ByteArray = ByteArray(64),
    public var BarCodeState: UInt = 0u,
    public var szSequenceNumber: ByteArray = ByteArray(32),
    public var MediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
    public var dwMediaTypeCode: UInt = 0u,
    public var dwDensityCode: UInt = 0u,
    public var MountedPartition: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_PMIDINFORMATIONA) return false
        if (this.CurrentLibrary != other.CurrentLibrary) return false
        if (this.MediaPool != other.MediaPool) return false
        if (this.Location != other.Location) return false
        if (this.LocationType != other.LocationType) return false
        if (this.MediaType != other.MediaType) return false
        if (this.HomeSlot != other.HomeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.BarCodeState != other.BarCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.MediaState != other.MediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        if (this.dwMediaTypeCode != other.dwMediaTypeCode) return false
        if (this.dwDensityCode != other.dwDensityCode) return false
        if (this.MountedPartition != other.MountedPartition) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CurrentLibrary.hashCode()
        result = 31 * result + this.MediaPool.hashCode()
        result = 31 * result + this.Location.hashCode()
        result = 31 * result + this.LocationType.hashCode()
        result = 31 * result + this.MediaType.hashCode()
        result = 31 * result + this.HomeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.BarCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.MediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        result = 31 * result + this.dwMediaTypeCode.hashCode()
        result = 31 * result + this.dwDensityCode.hashCode()
        result = 31 * result + this.MountedPartition.hashCode()
        return result
    }
}

public data class NTMS_PMIDINFORMATIONW(
    public var CurrentLibrary: GUID = GUID(),
    public var MediaPool: GUID = GUID(),
    public var Location: GUID = GUID(),
    public var LocationType: UInt = 0u,
    public var MediaType: GUID = GUID(),
    public var HomeSlot: GUID = GUID(),
    public var szBarCode: UShortArray = UShortArray(64),
    public var BarCodeState: UInt = 0u,
    public var szSequenceNumber: UShortArray = UShortArray(32),
    public var MediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
    public var dwMediaTypeCode: UInt = 0u,
    public var dwDensityCode: UInt = 0u,
    public var MountedPartition: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NTMS_PMIDINFORMATIONW) return false
        if (this.CurrentLibrary != other.CurrentLibrary) return false
        if (this.MediaPool != other.MediaPool) return false
        if (this.Location != other.Location) return false
        if (this.LocationType != other.LocationType) return false
        if (this.MediaType != other.MediaType) return false
        if (this.HomeSlot != other.HomeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.BarCodeState != other.BarCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.MediaState != other.MediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        if (this.dwMediaTypeCode != other.dwMediaTypeCode) return false
        if (this.dwDensityCode != other.dwDensityCode) return false
        if (this.MountedPartition != other.MountedPartition) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CurrentLibrary.hashCode()
        result = 31 * result + this.MediaPool.hashCode()
        result = 31 * result + this.Location.hashCode()
        result = 31 * result + this.LocationType.hashCode()
        result = 31 * result + this.MediaType.hashCode()
        result = 31 * result + this.HomeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.BarCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.MediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        result = 31 * result + this.dwMediaTypeCode.hashCode()
        result = 31 * result + this.dwDensityCode.hashCode()
        result = 31 * result + this.MountedPartition.hashCode()
        return result
    }
}

public data class NTMS_STORAGESLOTINFORMATION(
    public var Number: UInt = 0u,
    public var State: UInt = 0u,
    public var Library: GUID = GUID(),
)

public data class OFSTRUCT(
    public var cBytes: UByte = 0u,
    public var fFixedDisk: UByte = 0u,
    public var nErrCode: UShort = 0u,
    public var Reserved1: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var szPathName: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OFSTRUCT) return false
        if (this.cBytes != other.cBytes) return false
        if (this.fFixedDisk != other.fFixedDisk) return false
        if (this.nErrCode != other.nErrCode) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (!this.szPathName.contentEquals(other.szPathName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBytes.hashCode()
        result = 31 * result + this.fFixedDisk.hashCode()
        result = 31 * result + this.nErrCode.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.szPathName.contentHashCode()
        return result
    }
}

public data class REPARSE_GUID_DATA_BUFFER(
    public var ReparseTag: UInt = 0u,
    public var ReparseDataLength: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var ReparseGuid: GUID = GUID(),
    public var GenericReparseBuffer: REPARSE_GUID_DATA_BUFFER_0 = REPARSE_GUID_DATA_BUFFER_0(),
)

public data class REPARSE_GUID_DATA_BUFFER_0(public var DataBuffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REPARSE_GUID_DATA_BUFFER_0) return false
        if (!this.DataBuffer.contentEquals(other.DataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DataBuffer.contentHashCode()
    }
}

public data class SERVER_ALIAS_INFO_0(
    public var srvai0_alias: PWSTR = 0L,
    public var srvai0_target: PWSTR = 0L,
    public var srvai0_default: Boolean = false,
    public var srvai0_reserved: UInt = 0u,
)

public data class SERVER_CERTIFICATE_INFO_0(
    public var srvci0_name: PWSTR = 0L,
    public var srvci0_subject: PWSTR = 0L,
    public var srvci0_issuer: PWSTR = 0L,
    public var srvci0_thumbprint: PWSTR = 0L,
    public var srvci0_friendlyname: PWSTR = 0L,
    public var srvci0_notbefore: PWSTR = 0L,
    public var srvci0_notafter: PWSTR = 0L,
    public var srvci0_storelocation: PWSTR = 0L,
    public var srvci0_storename: PWSTR = 0L,
    public var srvci0_renewalchain: PWSTR = 0L,
    public var srvci0_type: UInt = 0u,
    public var srvci0_flags: UInt = 0u,
    public var srvci0_mapping_status: UInt = 0u,
)

public data class SESSION_INFO_0(public var sesi0_cname: PWSTR = 0L)

public data class SESSION_INFO_1(
    public var sesi1_cname: PWSTR = 0L,
    public var sesi1_username: PWSTR = 0L,
    public var sesi1_num_opens: UInt = 0u,
    public var sesi1_time: UInt = 0u,
    public var sesi1_idle_time: UInt = 0u,
    public var sesi1_user_flags: SESSION_INFO_USER_FLAGS = 0u,
)

public data class SESSION_INFO_10(
    public var sesi10_cname: PWSTR = 0L,
    public var sesi10_username: PWSTR = 0L,
    public var sesi10_time: UInt = 0u,
    public var sesi10_idle_time: UInt = 0u,
)

public data class SESSION_INFO_2(
    public var sesi2_cname: PWSTR = 0L,
    public var sesi2_username: PWSTR = 0L,
    public var sesi2_num_opens: UInt = 0u,
    public var sesi2_time: UInt = 0u,
    public var sesi2_idle_time: UInt = 0u,
    public var sesi2_user_flags: SESSION_INFO_USER_FLAGS = 0u,
    public var sesi2_cltype_name: PWSTR = 0L,
)

public data class SESSION_INFO_502(
    public var sesi502_cname: PWSTR = 0L,
    public var sesi502_username: PWSTR = 0L,
    public var sesi502_num_opens: UInt = 0u,
    public var sesi502_time: UInt = 0u,
    public var sesi502_idle_time: UInt = 0u,
    public var sesi502_user_flags: SESSION_INFO_USER_FLAGS = 0u,
    public var sesi502_cltype_name: PWSTR = 0L,
    public var sesi502_transport: PWSTR = 0L,
)

public data class SHARE_INFO_0(public var shi0_netname: PWSTR = 0L)

public data class SHARE_INFO_1(
    public var shi1_netname: PWSTR = 0L,
    public var shi1_type: SHARE_TYPE = 0u,
    public var shi1_remark: PWSTR = 0L,
)

public data class SHARE_INFO_1004(public var shi1004_remark: PWSTR = 0L)

public data class SHARE_INFO_1005(public var shi1005_flags: UInt = 0u)

public data class SHARE_INFO_1006(public var shi1006_max_uses: UInt = 0u)

public data class SHARE_INFO_1501(public var shi1501_reserved: UInt = 0u, public var shi1501_security_descriptor: PSECURITY_DESCRIPTOR = 0L)

public data class SHARE_INFO_1503(public var shi1503_sharefilter: GUID = GUID())

public data class SHARE_INFO_2(
    public var shi2_netname: PWSTR = 0L,
    public var shi2_type: SHARE_TYPE = 0u,
    public var shi2_remark: PWSTR = 0L,
    public var shi2_permissions: SHARE_INFO_PERMISSIONS = 0u,
    public var shi2_max_uses: UInt = 0u,
    public var shi2_current_uses: UInt = 0u,
    public var shi2_path: PWSTR = 0L,
    public var shi2_passwd: PWSTR = 0L,
)

public data class SHARE_INFO_501(
    public var shi501_netname: PWSTR = 0L,
    public var shi501_type: SHARE_TYPE = 0u,
    public var shi501_remark: PWSTR = 0L,
    public var shi501_flags: UInt = 0u,
)

public data class SHARE_INFO_502(
    public var shi502_netname: PWSTR = 0L,
    public var shi502_type: SHARE_TYPE = 0u,
    public var shi502_remark: PWSTR = 0L,
    public var shi502_permissions: SHARE_INFO_PERMISSIONS = 0u,
    public var shi502_max_uses: UInt = 0u,
    public var shi502_current_uses: UInt = 0u,
    public var shi502_path: PWSTR = 0L,
    public var shi502_passwd: PWSTR = 0L,
    public var shi502_reserved: UInt = 0u,
    public var shi502_security_descriptor: PSECURITY_DESCRIPTOR = 0L,
)

public data class SHARE_INFO_503(
    public var shi503_netname: PWSTR = 0L,
    public var shi503_type: SHARE_TYPE = 0u,
    public var shi503_remark: PWSTR = 0L,
    public var shi503_permissions: SHARE_INFO_PERMISSIONS = 0u,
    public var shi503_max_uses: UInt = 0u,
    public var shi503_current_uses: UInt = 0u,
    public var shi503_path: PWSTR = 0L,
    public var shi503_passwd: PWSTR = 0L,
    public var shi503_servername: PWSTR = 0L,
    public var shi503_reserved: UInt = 0u,
    public var shi503_security_descriptor: PSECURITY_DESCRIPTOR = 0L,
)

public class STAT_SERVER_0(
    public var sts0_start: UInt = 0u,
    public var sts0_fopens: UInt = 0u,
    public var sts0_devopens: UInt = 0u,
    public var sts0_jobsqueued: UInt = 0u,
    public var sts0_sopens: UInt = 0u,
    public var sts0_stimedout: UInt = 0u,
    public var sts0_serrorout: UInt = 0u,
    public var sts0_pwerrors: UInt = 0u,
    public var sts0_permerrors: UInt = 0u,
    public var sts0_syserrors: UInt = 0u,
    public var sts0_bytessent_low: UInt = 0u,
    public var sts0_bytessent_high: UInt = 0u,
    public var sts0_bytesrcvd_low: UInt = 0u,
    public var sts0_bytesrcvd_high: UInt = 0u,
    public var sts0_avresponse: UInt = 0u,
    public var sts0_reqbufneed: UInt = 0u,
    public var sts0_bigbufneed: UInt = 0u,
)

public class STAT_WORKSTATION_0(
    public var StatisticsStartTime: Long = 0L,
    public var BytesReceived: Long = 0L,
    public var SmbsReceived: Long = 0L,
    public var PagingReadBytesRequested: Long = 0L,
    public var NonPagingReadBytesRequested: Long = 0L,
    public var CacheReadBytesRequested: Long = 0L,
    public var NetworkReadBytesRequested: Long = 0L,
    public var BytesTransmitted: Long = 0L,
    public var SmbsTransmitted: Long = 0L,
    public var PagingWriteBytesRequested: Long = 0L,
    public var NonPagingWriteBytesRequested: Long = 0L,
    public var CacheWriteBytesRequested: Long = 0L,
    public var NetworkWriteBytesRequested: Long = 0L,
    public var InitiallyFailedOperations: UInt = 0u,
    public var FailedCompletionOperations: UInt = 0u,
    public var ReadOperations: UInt = 0u,
    public var RandomReadOperations: UInt = 0u,
    public var ReadSmbs: UInt = 0u,
    public var LargeReadSmbs: UInt = 0u,
    public var SmallReadSmbs: UInt = 0u,
    public var WriteOperations: UInt = 0u,
    public var RandomWriteOperations: UInt = 0u,
    public var WriteSmbs: UInt = 0u,
    public var LargeWriteSmbs: UInt = 0u,
    public var SmallWriteSmbs: UInt = 0u,
    public var RawReadsDenied: UInt = 0u,
    public var RawWritesDenied: UInt = 0u,
    public var NetworkErrors: UInt = 0u,
    public var Sessions: UInt = 0u,
    public var FailedSessions: UInt = 0u,
    public var Reconnects: UInt = 0u,
    public var CoreConnects: UInt = 0u,
    public var Lanman20Connects: UInt = 0u,
    public var Lanman21Connects: UInt = 0u,
    public var LanmanNtConnects: UInt = 0u,
    public var ServerDisconnects: UInt = 0u,
    public var HungSessions: UInt = 0u,
    public var UseCount: UInt = 0u,
    public var FailedUseCount: UInt = 0u,
    public var CurrentCommands: UInt = 0u,
)

public data class TAPE_ERASE(public var Type: ERASE_TAPE_TYPE = 0u, public var Immediate: Boolean = false)

public data class TAPE_GET_POSITION(
    public var Type: TAPE_POSITION_TYPE = 0u,
    public var Partition: UInt = 0u,
    public var Offset: Long = 0L,
)

public data class TAPE_PREPARE(public var Operation: PREPARE_TAPE_OPERATION = 0u, public var Immediate: Boolean = false)

public data class TAPE_SET_POSITION(
    public var Method: TAPE_POSITION_METHOD = 0u,
    public var Partition: UInt = 0u,
    public var Offset: Long = 0L,
    public var Immediate: Boolean = false,
)

public data class TAPE_WRITE_MARKS(
    public var Type: TAPEMARK_TYPE = 0u,
    public var Count: UInt = 0u,
    public var Immediate: Boolean = false,
)

public data class TRANSACTION_NOTIFICATION(
    public var TransactionKey: Long = 0L,
    public var TransactionNotification: UInt = 0u,
    public var TmVirtualClock: Long = 0L,
    public var ArgumentLength: UInt = 0u,
)

public data class TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT(public var MarshalCookie: UInt = 0u, public var UOW: GUID = GUID())

public data class TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT(
    public var PropagationCookie: UInt = 0u,
    public var UOW: GUID = GUID(),
    public var TmIdentity: GUID = GUID(),
    public var BufferLength: UInt = 0u,
)

public data class TRANSACTION_NOTIFICATION_RECOVERY_ARGUMENT(public var EnlistmentId: GUID = GUID(), public var UOW: GUID = GUID())

public data class TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT(public var SavepointId: UInt = 0u)

public data class TRANSACTION_NOTIFICATION_TM_ONLINE_ARGUMENT(public var TmIdentity: GUID = GUID(), public var Flags: UInt = 0u)

public data class TXF_ID(public var Anonymous: TXF_ID_0 = TXF_ID_0())

public data class TXF_ID_0(public var LowPart: Long = 0L, public var HighPart: Long = 0L)

public data class TXF_LOG_RECORD_AFFECTED_FILE(
    public var Version: UShort = 0u,
    public var RecordLength: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TxfFileId: TXF_ID = TXF_ID(),
    public var KtmGuid: GUID = GUID(),
    public var FileNameLength: UInt = 0u,
    public var FileNameByteOffsetInStructure: UInt = 0u,
)

public data class TXF_LOG_RECORD_BASE(
    public var Version: UShort = 0u,
    public var RecordType: TXF_LOG_RECORD_TYPE = 0u,
    public var RecordLength: UInt = 0u,
)

public data class TXF_LOG_RECORD_TRUNCATE(
    public var Version: UShort = 0u,
    public var RecordType: UShort = 0u,
    public var RecordLength: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TxfFileId: TXF_ID = TXF_ID(),
    public var KtmGuid: GUID = GUID(),
    public var NewFileSize: Long = 0L,
    public var FileNameLength: UInt = 0u,
    public var FileNameByteOffsetInStructure: UInt = 0u,
)

public data class TXF_LOG_RECORD_WRITE(
    public var Version: UShort = 0u,
    public var RecordType: UShort = 0u,
    public var RecordLength: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TxfFileId: TXF_ID = TXF_ID(),
    public var KtmGuid: GUID = GUID(),
    public var ByteOffsetInFile: Long = 0L,
    public var NumBytesWritten: UInt = 0u,
    public var ByteOffsetInStructure: UInt = 0u,
    public var FileNameLength: UInt = 0u,
    public var FileNameByteOffsetInStructure: UInt = 0u,
)

public data class VOLUME_ALLOCATE_BC_STREAM_INPUT(
    public var Version: UInt = 0u,
    public var RequestsPerPeriod: UInt = 0u,
    public var Period: UInt = 0u,
    public var RetryFailures: Boolean = false,
    public var Discardable: Boolean = false,
    public var Reserved1: BooleanArray = BooleanArray(2),
    public var LowestByteOffset: ULong = 0uL,
    public var HighestByteOffset: ULong = 0uL,
    public var AccessType: UInt = 0u,
    public var AccessMode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VOLUME_ALLOCATE_BC_STREAM_INPUT) return false
        if (this.Version != other.Version) return false
        if (this.RequestsPerPeriod != other.RequestsPerPeriod) return false
        if (this.Period != other.Period) return false
        if (this.RetryFailures != other.RetryFailures) return false
        if (this.Discardable != other.Discardable) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.LowestByteOffset != other.LowestByteOffset) return false
        if (this.HighestByteOffset != other.HighestByteOffset) return false
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
        result = 31 * result + this.LowestByteOffset.hashCode()
        result = 31 * result + this.HighestByteOffset.hashCode()
        result = 31 * result + this.AccessType.hashCode()
        result = 31 * result + this.AccessMode.hashCode()
        return result
    }
}

public data class VOLUME_ALLOCATE_BC_STREAM_OUTPUT(public var RequestSize: ULong = 0uL, public var NumOutStandingRequests: UInt = 0u)

public data class VOLUME_ALLOCATION_HINT_INPUT(
    public var ClusterSize: UInt = 0u,
    public var NumberOfClusters: UInt = 0u,
    public var StartingClusterNumber: Long = 0L,
)

public data class VOLUME_ALLOCATION_HINT_OUTPUT(public var Bitmap: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VOLUME_ALLOCATION_HINT_OUTPUT) return false
        if (!this.Bitmap.contentEquals(other.Bitmap)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Bitmap.contentHashCode()
    }
}

public data class VOLUME_CRITICAL_IO(
    public var AccessType: UInt = 0u,
    public var ExtentsCount: UInt = 0u,
    public var Extents: List<FILE_EXTENT> = List(1) { FILE_EXTENT() },
)

public data class VOLUME_FAILOVER_SET(public var NumberOfDisks: UInt = 0u, public var DiskNumbers: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VOLUME_FAILOVER_SET) return false
        if (this.NumberOfDisks != other.NumberOfDisks) return false
        if (!this.DiskNumbers.contentEquals(other.DiskNumbers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumberOfDisks.hashCode()
        result = 31 * result + this.DiskNumbers.contentHashCode()
        return result
    }
}

public data class VOLUME_GET_BC_PROPERTIES_INPUT(
    public var Version: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var LowestByteOffset: ULong = 0uL,
    public var HighestByteOffset: ULong = 0uL,
    public var AccessType: UInt = 0u,
    public var AccessMode: UInt = 0u,
)

public data class VOLUME_GET_BC_PROPERTIES_OUTPUT(
    public var MaximumRequestsPerPeriod: UInt = 0u,
    public var MinimumPeriod: UInt = 0u,
    public var MaximumRequestSize: ULong = 0uL,
    public var EstimatedTimePerRequest: UInt = 0u,
    public var NumOutStandingRequests: UInt = 0u,
    public var RequestSize: ULong = 0uL,
)

public data class VOLUME_LOGICAL_OFFSET(public var LogicalOffset: Long = 0L)

public data class VOLUME_NUMBER(public var VolumeNumber: UInt = 0u, public var VolumeManagerName: UShortArray = UShortArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VOLUME_NUMBER) return false
        if (this.VolumeNumber != other.VolumeNumber) return false
        if (!this.VolumeManagerName.contentEquals(other.VolumeManagerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VolumeNumber.hashCode()
        result = 31 * result + this.VolumeManagerName.contentHashCode()
        return result
    }
}

public data class VOLUME_PHYSICAL_OFFSET(public var DiskNumber: UInt = 0u, public var Offset: Long = 0L)

public data class VOLUME_PHYSICAL_OFFSETS(public var NumberOfPhysicalOffsets: UInt = 0u, public var PhysicalOffset: List<VOLUME_PHYSICAL_OFFSET> = List(1) { VOLUME_PHYSICAL_OFFSET() })

public data class VOLUME_READ_PLEX_INPUT(
    public var ByteOffset: Long = 0L,
    public var Length: UInt = 0u,
    public var PlexNumber: UInt = 0u,
)

public data class VOLUME_SET_GPT_ATTRIBUTES_INFORMATION(
    public var GptAttributes: ULong = 0uL,
    public var RevertOnClose: Boolean = false,
    public var ApplyToAllConnectedVolumes: Boolean = false,
    public var Reserved1: UShort = 0u,
    public var Reserved2: UInt = 0u,
)

public data class VOLUME_SHRINK_INFO(public var VolumeSize: ULong = 0uL)

public data class VS_FIXEDFILEINFO(
    public var dwSignature: UInt = 0u,
    public var dwStrucVersion: UInt = 0u,
    public var dwFileVersionMS: UInt = 0u,
    public var dwFileVersionLS: UInt = 0u,
    public var dwProductVersionMS: UInt = 0u,
    public var dwProductVersionLS: UInt = 0u,
    public var dwFileFlagsMask: UInt = 0u,
    public var dwFileFlags: VS_FIXEDFILEINFO_FILE_FLAGS = 0u,
    public var dwFileOS: VS_FIXEDFILEINFO_FILE_OS = 0u,
    public var dwFileType: UInt = 0u,
    public var dwFileSubtype: UInt = 0u,
    public var dwFileDateMS: UInt = 0u,
    public var dwFileDateLS: UInt = 0u,
)

public data class WIM_ENTRY_INFO(
    public var WimEntryInfoSize: UInt = 0u,
    public var WimType: UInt = 0u,
    public var DataSourceId: Long = 0L,
    public var WimGuid: GUID = GUID(),
    public var WimPath: PCWSTR = 0L,
    public var WimIndex: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class WIM_EXTERNAL_FILE_INFO(
    public var DataSourceId: Long = 0L,
    public var ResourceHash: UByteArray = UByteArray(20),
    public var Flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WIM_EXTERNAL_FILE_INFO) return false
        if (this.DataSourceId != other.DataSourceId) return false
        if (!this.ResourceHash.contentEquals(other.ResourceHash)) return false
        if (this.Flags != other.Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DataSourceId.hashCode()
        result = 31 * result + this.ResourceHash.contentHashCode()
        result = 31 * result + this.Flags.hashCode()
        return result
    }
}

public data class WIN32_FILE_ATTRIBUTE_DATA(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: FILETIME = FILETIME(),
    public var ftLastAccessTime: FILETIME = FILETIME(),
    public var ftLastWriteTime: FILETIME = FILETIME(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
)

public data class WIN32_FIND_DATAA(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: FILETIME = FILETIME(),
    public var ftLastAccessTime: FILETIME = FILETIME(),
    public var ftLastWriteTime: FILETIME = FILETIME(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var dwReserved0: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var cFileName: ByteArray = ByteArray(260),
    public var cAlternateFileName: ByteArray = ByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WIN32_FIND_DATAA) return false
        if (this.dwFileAttributes != other.dwFileAttributes) return false
        if (this.ftCreationTime != other.ftCreationTime) return false
        if (this.ftLastAccessTime != other.ftLastAccessTime) return false
        if (this.ftLastWriteTime != other.ftLastWriteTime) return false
        if (this.nFileSizeHigh != other.nFileSizeHigh) return false
        if (this.nFileSizeLow != other.nFileSizeLow) return false
        if (this.dwReserved0 != other.dwReserved0) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (!this.cFileName.contentEquals(other.cFileName)) return false
        if (!this.cAlternateFileName.contentEquals(other.cAlternateFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFileAttributes.hashCode()
        result = 31 * result + this.ftCreationTime.hashCode()
        result = 31 * result + this.ftLastAccessTime.hashCode()
        result = 31 * result + this.ftLastWriteTime.hashCode()
        result = 31 * result + this.nFileSizeHigh.hashCode()
        result = 31 * result + this.nFileSizeLow.hashCode()
        result = 31 * result + this.dwReserved0.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.cFileName.contentHashCode()
        result = 31 * result + this.cAlternateFileName.contentHashCode()
        return result
    }
}

public data class WIN32_FIND_DATAW(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: FILETIME = FILETIME(),
    public var ftLastAccessTime: FILETIME = FILETIME(),
    public var ftLastWriteTime: FILETIME = FILETIME(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var dwReserved0: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var cFileName: UShortArray = UShortArray(260),
    public var cAlternateFileName: UShortArray = UShortArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WIN32_FIND_DATAW) return false
        if (this.dwFileAttributes != other.dwFileAttributes) return false
        if (this.ftCreationTime != other.ftCreationTime) return false
        if (this.ftLastAccessTime != other.ftLastAccessTime) return false
        if (this.ftLastWriteTime != other.ftLastWriteTime) return false
        if (this.nFileSizeHigh != other.nFileSizeHigh) return false
        if (this.nFileSizeLow != other.nFileSizeLow) return false
        if (this.dwReserved0 != other.dwReserved0) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (!this.cFileName.contentEquals(other.cFileName)) return false
        if (!this.cAlternateFileName.contentEquals(other.cAlternateFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFileAttributes.hashCode()
        result = 31 * result + this.ftCreationTime.hashCode()
        result = 31 * result + this.ftLastAccessTime.hashCode()
        result = 31 * result + this.ftLastWriteTime.hashCode()
        result = 31 * result + this.nFileSizeHigh.hashCode()
        result = 31 * result + this.nFileSizeLow.hashCode()
        result = 31 * result + this.dwReserved0.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.cFileName.contentHashCode()
        result = 31 * result + this.cAlternateFileName.contentHashCode()
        return result
    }
}

public data class WIN32_FIND_STREAM_DATA(public var StreamSize: Long = 0L, public var cStreamName: UShortArray = UShortArray(296)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WIN32_FIND_STREAM_DATA) return false
        if (this.StreamSize != other.StreamSize) return false
        if (!this.cStreamName.contentEquals(other.cStreamName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.StreamSize.hashCode()
        result = 31 * result + this.cStreamName.contentHashCode()
        return result
    }
}

public data class WIN32_STREAM_ID(
    public var dwStreamId: WIN_STREAM_ID = 0u,
    public var dwStreamAttributes: UInt = 0u,
    public var Size: Long = 0L,
    public var dwStreamNameSize: UInt = 0u,
    public var cStreamName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WIN32_STREAM_ID) return false
        if (this.dwStreamId != other.dwStreamId) return false
        if (this.dwStreamAttributes != other.dwStreamAttributes) return false
        if (this.Size != other.Size) return false
        if (this.dwStreamNameSize != other.dwStreamNameSize) return false
        if (!this.cStreamName.contentEquals(other.cStreamName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStreamId.hashCode()
        result = 31 * result + this.dwStreamAttributes.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.dwStreamNameSize.hashCode()
        result = 31 * result + this.cStreamName.contentHashCode()
        return result
    }
}

public data class WOF_FILE_COMPRESSION_INFO_V0(public var Algorithm: UInt = 0u)

public data class WOF_FILE_COMPRESSION_INFO_V1(public var Algorithm: UInt = 0u, public var Flags: UInt = 0u)
