@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId

public data class ByHandleFileInformation(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastWriteTime: Filetime = Filetime(),
    public var dwVolumeSerialNumber: UInt = 0u,
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var nNumberOfLinks: UInt = 0u,
    public var nFileIndexHigh: UInt = 0u,
    public var nFileIndexLow: UInt = 0u,
)

public data class ClfsLogNameInformation(
    public var nameLengthInBytes: UShort = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClfsLogNameInformation) return false
        if (this.nameLengthInBytes != other.nameLengthInBytes) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameLengthInBytes.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class ClfsMgmtNotification(
    public var notification: ClfsMgmtNotificationType = 0,
    public var lsn: ClsLsn = ClsLsn(),
    public var logIsPinned: UShort = 0u,
)

public data class ClfsMgmtPolicy(
    public var version: UInt = 0u,
    public var lengthInBytes: UInt = 0u,
    public var policyFlags: UInt = 0u,
    public var policyType: ClfsMgmtPolicyType = 0,
    public var policyParameters: ClfsMgmtPolicy0 = ClfsMgmtPolicy0(),
)

public data class ClfsMgmtPolicy0(
    public var maximumSize: ClfsMgmtPolicy00 = ClfsMgmtPolicy00(),
    public var minimumSize: ClfsMgmtPolicy01 = ClfsMgmtPolicy01(),
    public var newContainerSize: ClfsMgmtPolicy02 = ClfsMgmtPolicy02(),
    public var growthRate: ClfsMgmtPolicy03 = ClfsMgmtPolicy03(),
    public var logTail: ClfsMgmtPolicy04 = ClfsMgmtPolicy04(),
    public var autoShrink: ClfsMgmtPolicy05 = ClfsMgmtPolicy05(),
    public var autoGrow: ClfsMgmtPolicy06 = ClfsMgmtPolicy06(),
    public var newContainerPrefix: ClfsMgmtPolicy07 = ClfsMgmtPolicy07(),
    public var newContainerSuffix: ClfsMgmtPolicy08 = ClfsMgmtPolicy08(),
    public var newContainerExtension: ClfsMgmtPolicy09 = ClfsMgmtPolicy09(),
)

public data class ClfsMgmtPolicy06(
    public var enabled: UInt = 0u,
)

public data class ClfsMgmtPolicy05(
    public var percentage: UInt = 0u,
)

public data class ClfsMgmtPolicy03(
    public var absoluteGrowthInContainers: UInt = 0u,
    public var relativeGrowthPercentage: UInt = 0u,
)

public data class ClfsMgmtPolicy04(
    public var minimumAvailablePercentage: UInt = 0u,
    public var minimumAvailableContainers: UInt = 0u,
)

public data class ClfsMgmtPolicy00(
    public var containers: UInt = 0u,
)

public data class ClfsMgmtPolicy01(
    public var containers: UInt = 0u,
)

public data class ClfsMgmtPolicy09(
    public var extensionLengthInBytes: UShort = 0u,
    public var extensionString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClfsMgmtPolicy09) return false
        if (this.extensionLengthInBytes != other.extensionLengthInBytes) return false
        if (!this.extensionString.contentEquals(other.extensionString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extensionLengthInBytes.hashCode()
        result = 31 * result + this.extensionString.contentHashCode()
        return result
    }
}

public data class ClfsMgmtPolicy07(
    public var prefixLengthInBytes: UShort = 0u,
    public var prefixString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClfsMgmtPolicy07) return false
        if (this.prefixLengthInBytes != other.prefixLengthInBytes) return false
        if (!this.prefixString.contentEquals(other.prefixString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prefixLengthInBytes.hashCode()
        result = 31 * result + this.prefixString.contentHashCode()
        return result
    }
}

public data class ClfsMgmtPolicy02(
    public var sizeInBytes: UInt = 0u,
)

public data class ClfsMgmtPolicy08(
    public var nextContainerSuffix: ULong = 0uL,
)

public data class ClfsNodeId(
    public var cType: UInt = 0u,
    public var cbNode: UInt = 0u,
)

public data class ClfsPhysicalLsnInformation(
    public var streamIdentifier: UByte = 0u,
    public var virtualLsn: ClsLsn = ClsLsn(),
    public var physicalLsn: ClsLsn = ClsLsn(),
)

public data class ClfsStreamIdInformation(
    public var streamIdentifier: UByte = 0u,
)

public data class ClsArchiveDescriptor(
    public var coffLow: ULong = 0uL,
    public var coffHigh: ULong = 0uL,
    public var infoContainer: ClsContainerInformation = ClsContainerInformation(),
)

public data class ClsContainerInformation(
    public var fileAttributes: UInt = 0u,
    public var creationTime: ULong = 0uL,
    public var lastAccessTime: ULong = 0uL,
    public var lastWriteTime: ULong = 0uL,
    public var containerSize: Long = 0L,
    public var fileNameActualLength: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(256),
    public var state: UInt = 0u,
    public var physicalContainerId: UInt = 0u,
    public var logicalContainerId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClsContainerInformation) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.containerSize != other.containerSize) return false
        if (this.fileNameActualLength != other.fileNameActualLength) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.state != other.state) return false
        if (this.physicalContainerId != other.physicalContainerId) return false
        if (this.logicalContainerId != other.logicalContainerId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileAttributes.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.containerSize.hashCode()
        result = 31 * result + this.fileNameActualLength.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.physicalContainerId.hashCode()
        result = 31 * result + this.logicalContainerId.hashCode()
        return result
    }
}

public class ClsInformation(
    public var totalAvailable: Long = 0L,
    public var currentAvailable: Long = 0L,
    public var totalReservation: Long = 0L,
    public var baseFileSize: ULong = 0uL,
    public var containerSize: ULong = 0uL,
    public var totalContainers: UInt = 0u,
    public var freeContainers: UInt = 0u,
    public var totalClients: UInt = 0u,
    public var attributes: UInt = 0u,
    public var flushThreshold: UInt = 0u,
    public var sectorSize: UInt = 0u,
    public var minArchiveTailLsn: ClsLsn = ClsLsn(),
    public var baseLsn: ClsLsn = ClsLsn(),
    public var lastFlushedLsn: ClsLsn = ClsLsn(),
    public var lastLsn: ClsLsn = ClsLsn(),
    public var restartLsn: ClsLsn = ClsLsn(),
    public var identity: Guid = Guid(),
)

public data class ClsIoStatistics(
    public var hdrIoStats: ClsIoStatisticsHeader = ClsIoStatisticsHeader(),
    public var cFlush: ULong = 0uL,
    public var cbFlush: ULong = 0uL,
    public var cMetaFlush: ULong = 0uL,
    public var cbMetaFlush: ULong = 0uL,
)

public data class ClsIoStatisticsHeader(
    public var ubMajorVersion: UByte = 0u,
    public var ubMinorVersion: UByte = 0u,
    public var eStatsClass: ClfsIostatsClass = 0,
    public var cbLength: UShort = 0u,
    public var coffData: UInt = 0u,
)

public data class ClsLsn(
    public var internal: ULong = 0uL,
)

public data class ClsScanContext(
    public var cidNode: ClfsNodeId = ClfsNodeId(),
    public var hLog: Handle = null,
    public var cIndex: UInt = 0u,
    public var cContainers: UInt = 0u,
    public var cContainersReturned: UInt = 0u,
    public var eScanMode: UByte = 0u,
    public var pinfoContainer: ClsContainerInformation? = null,
)

public data class ClsWriteEntry(
    public var buffer: COpaquePointer? = null,
    public var byteLength: UInt = 0u,
)

public data class ConnectionInfo0(
    public var coni0Id: UInt = 0u,
)

public data class ConnectionInfo1(
    public var coni1Id: UInt = 0u,
    public var coni1Type: ShareType = 0u,
    public var coni1NumOpens: UInt = 0u,
    public var coni1NumUsers: UInt = 0u,
    public var coni1Time: UInt = 0u,
    public var coni1Username: Pwstr = null,
    public var coni1Netname: Pwstr = null,
)

public data class Copyfile2ExtendedParameters(
    public var dwSize: UInt = 0u,
    public var dwCopyFlags: CopyfileFlags = 0u,
    public var pfCancel: Bool? = null,
    public var pProgressRoutine: Pcopyfile2ProgressRoutine = null,
    public var pvCallbackContext: COpaquePointer? = null,
)

public data class Copyfile2ExtendedParametersV2(
    public var dwSize: UInt = 0u,
    public var dwCopyFlags: CopyfileFlags = 0u,
    public var pfCancel: Bool? = null,
    public var pProgressRoutine: Pcopyfile2ProgressRoutine = null,
    public var pvCallbackContext: COpaquePointer? = null,
    public var dwCopyFlagsV2: Copyfile2V2Flags = 0u,
    public var ioDesiredSize: UInt = 0u,
    public var ioDesiredRate: UInt = 0u,
    public var reserved: List<COpaquePointer> = List(8) { COpaquePointer(0L) },
)

public data class Copyfile2Message(
    public var type: Copyfile2MessageType = 0,
    public var dwPadding: UInt = 0u,
    public var info: Copyfile2Message0 = Copyfile2Message0(),
)

public data class Copyfile2Message0(
    public var chunkStarted: Copyfile2Message00 = Copyfile2Message00(),
    public var chunkFinished: Copyfile2Message01 = Copyfile2Message01(),
    public var streamStarted: Copyfile2Message02 = Copyfile2Message02(),
    public var streamFinished: Copyfile2Message03 = Copyfile2Message03(),
    public var pollContinue: Copyfile2Message04 = Copyfile2Message04(),
    public var error: Copyfile2Message05 = Copyfile2Message05(),
)

public data class Copyfile2Message01(
    public var dwStreamNumber: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hSourceFile: Handle = null,
    public var hDestinationFile: Handle = null,
    public var uliChunkNumber: ULong = 0uL,
    public var uliChunkSize: ULong = 0uL,
    public var uliStreamSize: ULong = 0uL,
    public var uliStreamBytesTransferred: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
    public var uliTotalBytesTransferred: ULong = 0uL,
)

public data class Copyfile2Message00(
    public var dwStreamNumber: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var hSourceFile: Handle = null,
    public var hDestinationFile: Handle = null,
    public var uliChunkNumber: ULong = 0uL,
    public var uliChunkSize: ULong = 0uL,
    public var uliStreamSize: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
)

public data class Copyfile2Message05(
    public var copyPhase: Copyfile2CopyPhase = 0,
    public var dwStreamNumber: UInt = 0u,
    public var hrFailure: Hresult = 0,
    public var dwReserved: UInt = 0u,
    public var uliChunkNumber: ULong = 0uL,
    public var uliStreamSize: ULong = 0uL,
    public var uliStreamBytesTransferred: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
    public var uliTotalBytesTransferred: ULong = 0uL,
)

public data class Copyfile2Message04(
    public var dwReserved: UInt = 0u,
)

public data class Copyfile2Message03(
    public var dwStreamNumber: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var hSourceFile: Handle = null,
    public var hDestinationFile: Handle = null,
    public var uliStreamSize: ULong = 0uL,
    public var uliStreamBytesTransferred: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
    public var uliTotalBytesTransferred: ULong = 0uL,
)

public data class Copyfile2Message02(
    public var dwStreamNumber: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var hSourceFile: Handle = null,
    public var hDestinationFile: Handle = null,
    public var uliStreamSize: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
)

public data class Createfile2ExtendedParameters(
    public var dwSize: UInt = 0u,
    public var dwFileAttributes: UInt = 0u,
    public var dwFileFlags: UInt = 0u,
    public var dwSecurityQosFlags: UInt = 0u,
    public var lpSecurityAttributes: SecurityAttributes? = null,
    public var hTemplateFile: Handle = null,
)

public data class DiskquotaUserInformation(
    public var quotaUsed: Long = 0L,
    public var quotaThreshold: Long = 0L,
    public var quotaLimit: Long = 0L,
)

public data class DiskSpaceInformation(
    public var actualTotalAllocationUnits: ULong = 0uL,
    public var actualAvailableAllocationUnits: ULong = 0uL,
    public var actualPoolUnavailableAllocationUnits: ULong = 0uL,
    public var callerTotalAllocationUnits: ULong = 0uL,
    public var callerAvailableAllocationUnits: ULong = 0uL,
    public var callerPoolUnavailableAllocationUnits: ULong = 0uL,
    public var usedAllocationUnits: ULong = 0uL,
    public var totalReservedAllocationUnits: ULong = 0uL,
    public var volumeStorageReserveAllocationUnits: ULong = 0uL,
    public var availableCommittedAllocationUnits: ULong = 0uL,
    public var poolAvailableAllocationUnits: ULong = 0uL,
    public var sectorsPerAllocationUnit: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
)

public data class EfsCertificateBlob(
    public var dwCertEncodingType: UInt = 0u,
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class EfsCompatibilityInfo(
    public var efsVersion: UInt = 0u,
)

public data class EfsDecryptionStatusInfo(
    public var dwDecryptionError: UInt = 0u,
    public var dwHashOffset: UInt = 0u,
    public var cbHash: UInt = 0u,
)

public data class EfsEncryptionStatusInfo(
    public var bHasCurrentKey: Bool = 0,
    public var dwEncryptionError: UInt = 0u,
)

public data class EfsHashBlob(
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class EfsKeyInfo(
    public var dwVersion: UInt = 0u,
    public var entropy: UInt = 0u,
    public var algorithm: AlgId = 0u,
    public var keyLength: UInt = 0u,
)

public data class EfsPinBlob(
    public var cbPadding: UInt = 0u,
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class EfsRpcBlob(
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class EfsVersionInfo(
    public var efsVersion: UInt = 0u,
    public var subVersion: UInt = 0u,
)

public data class EncryptedFileMetadataSignature(
    public var dwEfsAccessType: UInt = 0u,
    public var pCertificatesAdded: EncryptionCertificateHashList? = null,
    public var pEncryptionCertificate: EncryptionCertificate? = null,
    public var pEfsStreamSignature: EfsRpcBlob? = null,
)

public data class EncryptionCertificate(
    public var cbTotalLength: UInt = 0u,
    public var pUserSid: Sid? = null,
    public var pCertBlob: EfsCertificateBlob? = null,
)

public data class EncryptionCertificateHash(
    public var cbTotalLength: UInt = 0u,
    public var pUserSid: Sid? = null,
    public var pHash: EfsHashBlob? = null,
    public var lpDisplayInformation: Pwstr = null,
)

public data class EncryptionCertificateHashList(
    public var nCertHash: UInt = 0u,
    public var pUsers: COpaquePointer? = null,
)

public data class EncryptionCertificateList(
    public var nUsers: UInt = 0u,
    public var pUsers: COpaquePointer? = null,
)

public data class EncryptionProtector(
    public var cbTotalLength: UInt = 0u,
    public var pUserSid: Sid? = null,
    public var lpProtectorDescriptor: Pwstr = null,
)

public data class EncryptionProtectorList(
    public var nProtectors: UInt = 0u,
    public var pProtectors: COpaquePointer? = null,
)

public data class FhOverlapped(
    public var internal: Int = 0,
    public var internalHigh: Int = 0,
    public var offset: UInt = 0u,
    public var offsetHigh: UInt = 0u,
    public var hEvent: Handle = null,
    public var pfnCompletion: PfnIoCompletion = null,
    public var reserved1: Int = 0,
    public var reserved2: Int = 0,
    public var reserved3: Int = 0,
    public var reserved4: Int = 0,
)

public data class FileAlignmentInfo(
    public var alignmentRequirement: UInt = 0u,
)

public data class FileAllocationInfo(
    public var allocationSize: Long = 0L,
)

public data class FileAttributeTagInfo(
    public var fileAttributes: UInt = 0u,
    public var reparseTag: UInt = 0u,
)

public data class FileBasicInfo(
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var fileAttributes: UInt = 0u,
)

public data class FileCaseSensitiveInfo(
    public var flags: UInt = 0u,
)

public data class FileCompressionInfo(
    public var compressedFileSize: Long = 0L,
    public var compressionFormat: CompressionFormat = 0u,
    public var compressionUnitShift: UByte = 0u,
    public var chunkShift: UByte = 0u,
    public var clusterShift: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileCompressionInfo) return false
        if (this.compressedFileSize != other.compressedFileSize) return false
        if (this.compressionFormat != other.compressionFormat) return false
        if (this.compressionUnitShift != other.compressionUnitShift) return false
        if (this.chunkShift != other.chunkShift) return false
        if (this.clusterShift != other.clusterShift) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compressedFileSize.hashCode()
        result = 31 * result + this.compressionFormat.hashCode()
        result = 31 * result + this.compressionUnitShift.hashCode()
        result = 31 * result + this.chunkShift.hashCode()
        result = 31 * result + this.clusterShift.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class FileDispositionInfo(
    public var deleteFile: Boolean = false,
)

public data class FileDispositionInfoEx(
    public var flags: FileDispositionInfoExFlags = 0u,
)

public data class FileEndOfFileInfo(
    public var endOfFile: Long = 0L,
)

public data class FileExtent(
    public var volumeOffset: ULong = 0uL,
    public var extentLength: ULong = 0uL,
)

public data class FileFullDirInfo(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFullDirInfo) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileId128(
    public var identifier: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileId128) return false
        if (!this.identifier.contentEquals(other.identifier)) return false
        return true
    }

    override fun hashCode(): Int = this.identifier.contentHashCode()
}

public data class FileIdBothDirInfo(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var shortNameLength: Byte = 0,
    public var shortName: UShortArray = UShortArray(12),
    public var fileId: Long = 0L,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdBothDirInfo) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (this.shortNameLength != other.shortNameLength) return false
        if (!this.shortName.contentEquals(other.shortName)) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.shortNameLength.hashCode()
        result = 31 * result + this.shortName.contentHashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileIdDescriptor(
    public var dwSize: UInt = 0u,
    public var type: FileIdType = 0,
    public var anonymous: FileIdDescriptor0 = FileIdDescriptor0(),
)

public data class FileIdDescriptor0(
    public var fileId: Long = 0L,
    public var objectId: Guid = Guid(),
    public var extendedFileId: FileId128 = FileId128(),
)

public data class FileIdExtdDirInfo(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var reparsePointTag: UInt = 0u,
    public var fileId: FileId128 = FileId128(),
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdExtdDirInfo) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (this.reparsePointTag != other.reparsePointTag) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.reparsePointTag.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileIdInfo(
    public var volumeSerialNumber: ULong = 0uL,
    public var fileId: FileId128 = FileId128(),
)

public data class FileInfo2(
    public var fi2Id: UInt = 0u,
)

public data class FileInfo3(
    public var fi3Id: UInt = 0u,
    public var fi3Permissions: FileInfoFlagsPermissions = 0u,
    public var fi3NumLocks: UInt = 0u,
    public var fi3Pathname: Pwstr = null,
    public var fi3Username: Pwstr = null,
)

public data class FileIoPriorityHintInfo(
    public var priorityHint: PriorityHint = 0,
)

public data class FileNameInfo(
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNameInfo) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileNotifyExtendedInformation(
    public var nextEntryOffset: UInt = 0u,
    public var action: FileAction = 0u,
    public var creationTime: Long = 0L,
    public var lastModificationTime: Long = 0L,
    public var lastChangeTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var allocatedLength: Long = 0L,
    public var fileSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var anonymous: FileNotifyExtendedInformation0 = FileNotifyExtendedInformation0(),
    public var fileId: Long = 0L,
    public var parentFileId: Long = 0L,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNotifyExtendedInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.action != other.action) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastModificationTime != other.lastModificationTime) return false
        if (this.lastChangeTime != other.lastChangeTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.allocatedLength != other.allocatedLength) return false
        if (this.fileSize != other.fileSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.anonymous != other.anonymous) return false
        if (this.fileId != other.fileId) return false
        if (this.parentFileId != other.parentFileId) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastModificationTime.hashCode()
        result = 31 * result + this.lastChangeTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.allocatedLength.hashCode()
        result = 31 * result + this.fileSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.parentFileId.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileNotifyExtendedInformation0(
    public var reparsePointTag: UInt = 0u,
    public var eaSize: UInt = 0u,
)

public data class FileNotifyInformation(
    public var nextEntryOffset: UInt = 0u,
    public var action: FileAction = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNotifyInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.action != other.action) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileRemoteProtocolInfo(
    public var structureVersion: UShort = 0u,
    public var structureSize: UShort = 0u,
    public var protocol: UInt = 0u,
    public var protocolMajorVersion: UShort = 0u,
    public var protocolMinorVersion: UShort = 0u,
    public var protocolRevision: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var genericReserved: FileRemoteProtocolInfo0 = FileRemoteProtocolInfo0(),
    public var protocolSpecific: FileRemoteProtocolInfo1 = FileRemoteProtocolInfo1(),
)

public data class FileRemoteProtocolInfo0(
    public var reserved: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRemoteProtocolInfo0) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.contentHashCode()
}

public data class FileRemoteProtocolInfo1(
    public var smb2: FileRemoteProtocolInfo10 = FileRemoteProtocolInfo10(),
    public var reserved: UIntArray = UIntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRemoteProtocolInfo1) return false
        if (this.smb2 != other.smb2) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.smb2.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class FileRemoteProtocolInfo10(
    public var server: FileRemoteProtocolInfo100 = FileRemoteProtocolInfo100(),
    public var share: FileRemoteProtocolInfo101 = FileRemoteProtocolInfo101(),
)

public data class FileRemoteProtocolInfo100(
    public var capabilities: UInt = 0u,
)

public data class FileRemoteProtocolInfo101(
    public var capabilities: UInt = 0u,
    public var shareFlags: UInt = 0u,
)

public data class FileRenameInfo(
    public var anonymous: FileRenameInfo0 = FileRenameInfo0(),
    public var rootDirectory: Handle = null,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRenameInfo) return false
        if (this.anonymous != other.anonymous) return false
        if (this.rootDirectory != other.rootDirectory) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.rootDirectory.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileRenameInfo0(
    public var replaceIfExists: Boolean = false,
    public var flags: UInt = 0u,
)

public data class FileSegmentElement(
    public var buffer: COpaquePointer? = null,
    public var alignment: ULong = 0uL,
)

public data class FileStandardInfo(
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var numberOfLinks: UInt = 0u,
    public var deletePending: Boolean = false,
    public var directory: Boolean = false,
)

public data class FileStorageInfo(
    public var logicalBytesPerSector: UInt = 0u,
    public var physicalBytesPerSectorForAtomicity: UInt = 0u,
    public var physicalBytesPerSectorForPerformance: UInt = 0u,
    public var fileSystemEffectivePhysicalBytesPerSectorForAtomicity: UInt = 0u,
    public var flags: UInt = 0u,
    public var byteOffsetForSectorAlignment: UInt = 0u,
    public var byteOffsetForPartitionAlignment: UInt = 0u,
)

public data class FileStreamInfo(
    public var nextEntryOffset: UInt = 0u,
    public var streamNameLength: UInt = 0u,
    public var streamSize: Long = 0L,
    public var streamAllocationSize: Long = 0L,
    public var streamName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileStreamInfo) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.streamNameLength != other.streamNameLength) return false
        if (this.streamSize != other.streamSize) return false
        if (this.streamAllocationSize != other.streamAllocationSize) return false
        if (!this.streamName.contentEquals(other.streamName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.streamNameLength.hashCode()
        result = 31 * result + this.streamSize.hashCode()
        result = 31 * result + this.streamAllocationSize.hashCode()
        result = 31 * result + this.streamName.contentHashCode()
        return result
    }
}

public data class FioContext(
    public var mDwTempHack: UInt = 0u,
    public var mDwSignature: UInt = 0u,
    public var mHFile: Handle = null,
    public var mDwLinesOffset: UInt = 0u,
    public var mDwHeaderLength: UInt = 0u,
)

public data class IoringBufferInfo(
    public var address: COpaquePointer? = null,
    public var length: UInt = 0u,
)

public data class IoringBufferRef(
    public var kind: IoringRefKind = 0,
    public var buffer: IoringBufferRef0 = IoringBufferRef0(),
)

public data class IoringBufferRef0(
    public var address: COpaquePointer? = null,
    public var indexAndOffset: IoringRegisteredBuffer = IoringRegisteredBuffer(),
)

public data class IoringCapabilities(
    public var maxVersion: IoringVersion = 0,
    public var maxSubmissionQueueSize: UInt = 0u,
    public var maxCompletionQueueSize: UInt = 0u,
    public var featureFlags: IoringFeatureFlags = 0,
)

public data class IoringCqe(
    public var userData: Int = 0,
    public var resultCode: Hresult = 0,
    public var information: Int = 0,
)

public data class IoringCreateFlags(
    public var required: IoringCreateRequiredFlags = 0,
    public var advisory: IoringCreateAdvisoryFlags = 0,
)

public data class IoringHandleRef(
    public var kind: IoringRefKind = 0,
    public var handle: IoringHandleRef0 = IoringHandleRef0(),
)

public data class IoringHandleRef0(
    public var handle: Handle = null,
    public var index: UInt = 0u,
)

public data class IoringInfo(
    public var ioRingVersion: IoringVersion = 0,
    public var flags: IoringCreateFlags = IoringCreateFlags(),
    public var submissionQueueSize: UInt = 0u,
    public var completionQueueSize: UInt = 0u,
)

public data class IoringRegisteredBuffer(
    public var bufferIndex: UInt = 0u,
    public var offset: UInt = 0u,
)

public data class KcrmMarshalHeader(
    public var versionMajor: UInt = 0u,
    public var versionMinor: UInt = 0u,
    public var numProtocols: UInt = 0u,
    public var unused: UInt = 0u,
)

public data class KcrmProtocolBlob(
    public var protocolId: Guid = Guid(),
    public var staticInfoLength: UInt = 0u,
    public var transactionIdInfoLength: UInt = 0u,
    public var unused1: UInt = 0u,
    public var unused2: UInt = 0u,
)

public data class KcrmTransactionBlob(
    public var uow: Guid = Guid(),
    public var tmIdentity: Guid = Guid(),
    public var isolationLevel: UInt = 0u,
    public var isolationFlags: UInt = 0u,
    public var timeout: UInt = 0u,
    public var description: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KcrmTransactionBlob) return false
        if (this.uow != other.uow) return false
        if (this.tmIdentity != other.tmIdentity) return false
        if (this.isolationLevel != other.isolationLevel) return false
        if (this.isolationFlags != other.isolationFlags) return false
        if (this.timeout != other.timeout) return false
        if (!this.description.contentEquals(other.description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uow.hashCode()
        result = 31 * result + this.tmIdentity.hashCode()
        result = 31 * result + this.isolationLevel.hashCode()
        result = 31 * result + this.isolationFlags.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.description.contentHashCode()
        return result
    }
}

public data class LogManagementCallbacks(
    public var callbackContext: COpaquePointer? = null,
    public var advanceTailCallback: PlogTailAdvanceCallback = null,
    public var logFullHandlerCallback: PlogFullHandlerCallback = null,
    public var logUnpinnedCallback: PlogUnpinnedCallback = null,
)

public data class MediaLabelInfo(
    public var labelType: UShortArray = UShortArray(64),
    public var labelIDSize: UInt = 0u,
    public var labelID: UByteArray = UByteArray(256),
    public var labelAppDescr: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MediaLabelInfo) return false
        if (!this.labelType.contentEquals(other.labelType)) return false
        if (this.labelIDSize != other.labelIDSize) return false
        if (!this.labelID.contentEquals(other.labelID)) return false
        if (!this.labelAppDescr.contentEquals(other.labelAppDescr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.labelType.contentHashCode()
        result = 31 * result + this.labelIDSize.hashCode()
        result = 31 * result + this.labelID.contentHashCode()
        result = 31 * result + this.labelAppDescr.contentHashCode()
        return result
    }
}

public data class NameCacheContext(
    public var mDwSignature: UInt = 0u,
)

public data class NtmsAllocationInformation(
    public var dwSize: UInt = 0u,
    public var lpReserved: COpaquePointer? = null,
    public var allocatedFrom: Guid = Guid(),
)

public data class NtmsAsyncIo(
    public var operationId: Guid = Guid(),
    public var eventId: Guid = Guid(),
    public var dwOperationType: UInt = 0u,
    public var dwResult: UInt = 0u,
    public var dwAsyncState: UInt = 0u,
    public var hEvent: Handle = null,
    public var bOnStateChange: Bool = 0,
)

public data class NtmsChangerinformationa(
    public var number: UInt = 0u,
    public var changerType: Guid = Guid(),
    public var szSerialNumber: ByteArray = ByteArray(32),
    public var szRevision: ByteArray = ByteArray(32),
    public var szDeviceName: ByteArray = ByteArray(64),
    public var scsiPort: UShort = 0u,
    public var scsiBus: UShort = 0u,
    public var scsiTarget: UShort = 0u,
    public var scsiLun: UShort = 0u,
    public var library: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsChangerinformationa) return false
        if (this.number != other.number) return false
        if (this.changerType != other.changerType) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (this.scsiPort != other.scsiPort) return false
        if (this.scsiBus != other.scsiBus) return false
        if (this.scsiTarget != other.scsiTarget) return false
        if (this.scsiLun != other.scsiLun) return false
        if (this.library != other.library) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.number.hashCode()
        result = 31 * result + this.changerType.hashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.scsiPort.hashCode()
        result = 31 * result + this.scsiBus.hashCode()
        result = 31 * result + this.scsiTarget.hashCode()
        result = 31 * result + this.scsiLun.hashCode()
        result = 31 * result + this.library.hashCode()
        return result
    }
}

public data class NtmsChangerinformationw(
    public var number: UInt = 0u,
    public var changerType: Guid = Guid(),
    public var szSerialNumber: UShortArray = UShortArray(32),
    public var szRevision: UShortArray = UShortArray(32),
    public var szDeviceName: UShortArray = UShortArray(64),
    public var scsiPort: UShort = 0u,
    public var scsiBus: UShort = 0u,
    public var scsiTarget: UShort = 0u,
    public var scsiLun: UShort = 0u,
    public var library: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsChangerinformationw) return false
        if (this.number != other.number) return false
        if (this.changerType != other.changerType) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (this.scsiPort != other.scsiPort) return false
        if (this.scsiBus != other.scsiBus) return false
        if (this.scsiTarget != other.scsiTarget) return false
        if (this.scsiLun != other.scsiLun) return false
        if (this.library != other.library) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.number.hashCode()
        result = 31 * result + this.changerType.hashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.scsiPort.hashCode()
        result = 31 * result + this.scsiBus.hashCode()
        result = 31 * result + this.scsiTarget.hashCode()
        result = 31 * result + this.scsiLun.hashCode()
        result = 31 * result + this.library.hashCode()
        return result
    }
}

public data class NtmsChangertypeinformationa(
    public var szVendor: ByteArray = ByteArray(128),
    public var szProduct: ByteArray = ByteArray(128),
    public var deviceType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsChangertypeinformationa) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.deviceType != other.deviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.deviceType.hashCode()
        return result
    }
}

public data class NtmsChangertypeinformationw(
    public var szVendor: UShortArray = UShortArray(128),
    public var szProduct: UShortArray = UShortArray(128),
    public var deviceType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsChangertypeinformationw) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.deviceType != other.deviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.deviceType.hashCode()
        return result
    }
}

public data class NtmsComputerinformation(
    public var dwLibRequestPurgeTime: UInt = 0u,
    public var dwOpRequestPurgeTime: UInt = 0u,
    public var dwLibRequestFlags: UInt = 0u,
    public var dwOpRequestFlags: UInt = 0u,
    public var dwMediaPoolPolicy: UInt = 0u,
)

public data class NtmsDriveinformationa(
    public var number: UInt = 0u,
    public var state: UInt = 0u,
    public var driveType: Guid = Guid(),
    public var szDeviceName: ByteArray = ByteArray(64),
    public var szSerialNumber: ByteArray = ByteArray(32),
    public var szRevision: ByteArray = ByteArray(32),
    public var scsiPort: UShort = 0u,
    public var scsiBus: UShort = 0u,
    public var scsiTarget: UShort = 0u,
    public var scsiLun: UShort = 0u,
    public var dwMountCount: UInt = 0u,
    public var lastCleanedTs: Systemtime = Systemtime(),
    public var savedPartitionId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var reserved: Guid = Guid(),
    public var dwDeferDismountDelay: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsDriveinformationa) return false
        if (this.number != other.number) return false
        if (this.state != other.state) return false
        if (this.driveType != other.driveType) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (this.scsiPort != other.scsiPort) return false
        if (this.scsiBus != other.scsiBus) return false
        if (this.scsiTarget != other.scsiTarget) return false
        if (this.scsiLun != other.scsiLun) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.lastCleanedTs != other.lastCleanedTs) return false
        if (this.savedPartitionId != other.savedPartitionId) return false
        if (this.library != other.library) return false
        if (this.reserved != other.reserved) return false
        if (this.dwDeferDismountDelay != other.dwDeferDismountDelay) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.number.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.driveType.hashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.scsiPort.hashCode()
        result = 31 * result + this.scsiBus.hashCode()
        result = 31 * result + this.scsiTarget.hashCode()
        result = 31 * result + this.scsiLun.hashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.lastCleanedTs.hashCode()
        result = 31 * result + this.savedPartitionId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.dwDeferDismountDelay.hashCode()
        return result
    }
}

public data class NtmsDriveinformationw(
    public var number: UInt = 0u,
    public var state: UInt = 0u,
    public var driveType: Guid = Guid(),
    public var szDeviceName: UShortArray = UShortArray(64),
    public var szSerialNumber: UShortArray = UShortArray(32),
    public var szRevision: UShortArray = UShortArray(32),
    public var scsiPort: UShort = 0u,
    public var scsiBus: UShort = 0u,
    public var scsiTarget: UShort = 0u,
    public var scsiLun: UShort = 0u,
    public var dwMountCount: UInt = 0u,
    public var lastCleanedTs: Systemtime = Systemtime(),
    public var savedPartitionId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var reserved: Guid = Guid(),
    public var dwDeferDismountDelay: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsDriveinformationw) return false
        if (this.number != other.number) return false
        if (this.state != other.state) return false
        if (this.driveType != other.driveType) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (this.scsiPort != other.scsiPort) return false
        if (this.scsiBus != other.scsiBus) return false
        if (this.scsiTarget != other.scsiTarget) return false
        if (this.scsiLun != other.scsiLun) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.lastCleanedTs != other.lastCleanedTs) return false
        if (this.savedPartitionId != other.savedPartitionId) return false
        if (this.library != other.library) return false
        if (this.reserved != other.reserved) return false
        if (this.dwDeferDismountDelay != other.dwDeferDismountDelay) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.number.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.driveType.hashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.scsiPort.hashCode()
        result = 31 * result + this.scsiBus.hashCode()
        result = 31 * result + this.scsiTarget.hashCode()
        result = 31 * result + this.scsiLun.hashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.lastCleanedTs.hashCode()
        result = 31 * result + this.savedPartitionId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.dwDeferDismountDelay.hashCode()
        return result
    }
}

public data class NtmsDrivetypeinformationa(
    public var szVendor: ByteArray = ByteArray(128),
    public var szProduct: ByteArray = ByteArray(128),
    public var numberOfHeads: UInt = 0u,
    public var deviceType: FileDeviceType = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsDrivetypeinformationa) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.numberOfHeads != other.numberOfHeads) return false
        if (this.deviceType != other.deviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.numberOfHeads.hashCode()
        result = 31 * result + this.deviceType.hashCode()
        return result
    }
}

public data class NtmsDrivetypeinformationw(
    public var szVendor: UShortArray = UShortArray(128),
    public var szProduct: UShortArray = UShortArray(128),
    public var numberOfHeads: UInt = 0u,
    public var deviceType: FileDeviceType = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsDrivetypeinformationw) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.numberOfHeads != other.numberOfHeads) return false
        if (this.deviceType != other.deviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.numberOfHeads.hashCode()
        result = 31 * result + this.deviceType.hashCode()
        return result
    }
}

public data class NtmsFilesystemInfo(
    public var fileSystemType: UShortArray = UShortArray(64),
    public var volumeName: UShortArray = UShortArray(256),
    public var serialNumber: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsFilesystemInfo) return false
        if (!this.fileSystemType.contentEquals(other.fileSystemType)) return false
        if (!this.volumeName.contentEquals(other.volumeName)) return false
        if (this.serialNumber != other.serialNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileSystemType.contentHashCode()
        result = 31 * result + this.volumeName.contentHashCode()
        result = 31 * result + this.serialNumber.hashCode()
        return result
    }
}

public class NtmsI1Libraryinformation(
    public var libraryType: UInt = 0u,
    public var cleanerSlot: Guid = Guid(),
    public var cleanerSlotDefault: Guid = Guid(),
    public var librarySupportsDriveCleaning: Bool = 0,
    public var barCodeReaderInstalled: Bool = 0,
    public var inventoryMethod: UInt = 0u,
    public var dwCleanerUsesRemaining: UInt = 0u,
    public var firstDriveNumber: UInt = 0u,
    public var dwNumberOfDrives: UInt = 0u,
    public var firstSlotNumber: UInt = 0u,
    public var dwNumberOfSlots: UInt = 0u,
    public var firstDoorNumber: UInt = 0u,
    public var dwNumberOfDoors: UInt = 0u,
    public var firstPortNumber: UInt = 0u,
    public var dwNumberOfPorts: UInt = 0u,
    public var firstChangerNumber: UInt = 0u,
    public var dwNumberOfChangers: UInt = 0u,
    public var dwNumberOfMedia: UInt = 0u,
    public var dwNumberOfMediaTypes: UInt = 0u,
    public var dwNumberOfLibRequests: UInt = 0u,
    public var reserved: Guid = Guid(),
)

public data class NtmsI1Librequestinformationa(
    public var operationCode: UInt = 0u,
    public var operationOption: UInt = 0u,
    public var state: UInt = 0u,
    public var partitionId: Guid = Guid(),
    public var driveId: Guid = Guid(),
    public var physMediaId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var slotId: Guid = Guid(),
    public var timeQueued: Systemtime = Systemtime(),
    public var timeCompleted: Systemtime = Systemtime(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Librequestinformationa) return false
        if (this.operationCode != other.operationCode) return false
        if (this.operationOption != other.operationOption) return false
        if (this.state != other.state) return false
        if (this.partitionId != other.partitionId) return false
        if (this.driveId != other.driveId) return false
        if (this.physMediaId != other.physMediaId) return false
        if (this.library != other.library) return false
        if (this.slotId != other.slotId) return false
        if (this.timeQueued != other.timeQueued) return false
        if (this.timeCompleted != other.timeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationCode.hashCode()
        result = 31 * result + this.operationOption.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.driveId.hashCode()
        result = 31 * result + this.physMediaId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.slotId.hashCode()
        result = 31 * result + this.timeQueued.hashCode()
        result = 31 * result + this.timeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsI1Librequestinformationw(
    public var operationCode: UInt = 0u,
    public var operationOption: UInt = 0u,
    public var state: UInt = 0u,
    public var partitionId: Guid = Guid(),
    public var driveId: Guid = Guid(),
    public var physMediaId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var slotId: Guid = Guid(),
    public var timeQueued: Systemtime = Systemtime(),
    public var timeCompleted: Systemtime = Systemtime(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Librequestinformationw) return false
        if (this.operationCode != other.operationCode) return false
        if (this.operationOption != other.operationOption) return false
        if (this.state != other.state) return false
        if (this.partitionId != other.partitionId) return false
        if (this.driveId != other.driveId) return false
        if (this.physMediaId != other.physMediaId) return false
        if (this.library != other.library) return false
        if (this.slotId != other.slotId) return false
        if (this.timeQueued != other.timeQueued) return false
        if (this.timeCompleted != other.timeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationCode.hashCode()
        result = 31 * result + this.operationOption.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.driveId.hashCode()
        result = 31 * result + this.physMediaId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.slotId.hashCode()
        result = 31 * result + this.timeQueued.hashCode()
        result = 31 * result + this.timeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsI1Objectinformationa(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var created: Systemtime = Systemtime(),
    public var modified: Systemtime = Systemtime(),
    public var objectGuid: Guid = Guid(),
    public var enabled: Bool = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
    public var szDescription: ByteArray = ByteArray(127),
    public var info: NtmsI1Objectinformationa0 = NtmsI1Objectinformationa0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Objectinformationa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.created != other.created) return false
        if (this.modified != other.modified) return false
        if (this.objectGuid != other.objectGuid) return false
        if (this.enabled != other.enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.info != other.info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.created.hashCode()
        result = 31 * result + this.modified.hashCode()
        result = 31 * result + this.objectGuid.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.info.hashCode()
        return result
    }
}

public data class NtmsI1Objectinformationa0(
    public var drive: NtmsDriveinformationa = NtmsDriveinformationa(),
    public var driveType: NtmsDrivetypeinformationa = NtmsDrivetypeinformationa(),
    public var library: NtmsI1Libraryinformation = NtmsI1Libraryinformation(),
    public var changer: NtmsChangerinformationa = NtmsChangerinformationa(),
    public var changerType: NtmsChangertypeinformationa = NtmsChangertypeinformationa(),
    public var storageSlot: NtmsStorageslotinformation = NtmsStorageslotinformation(),
    public var iEDoor: NtmsIedoorinformation = NtmsIedoorinformation(),
    public var iEPort: NtmsIeportinformation = NtmsIeportinformation(),
    public var physicalMedia: NtmsI1Pmidinformationa = NtmsI1Pmidinformationa(),
    public var logicalMedia: NtmsLmidinformation = NtmsLmidinformation(),
    public var partition: NtmsI1Partitioninformationa = NtmsI1Partitioninformationa(),
    public var mediaPool: NtmsMediapoolinformation = NtmsMediapoolinformation(),
    public var mediaType: NtmsMediatypeinformation = NtmsMediatypeinformation(),
    public var libRequest: NtmsI1Librequestinformationa = NtmsI1Librequestinformationa(),
    public var opRequest: NtmsI1Oprequestinformationa = NtmsI1Oprequestinformationa(),
)

public data class NtmsI1Objectinformationw(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var created: Systemtime = Systemtime(),
    public var modified: Systemtime = Systemtime(),
    public var objectGuid: Guid = Guid(),
    public var enabled: Bool = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
    public var szDescription: UShortArray = UShortArray(127),
    public var info: NtmsI1Objectinformationw0 = NtmsI1Objectinformationw0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Objectinformationw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.created != other.created) return false
        if (this.modified != other.modified) return false
        if (this.objectGuid != other.objectGuid) return false
        if (this.enabled != other.enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.info != other.info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.created.hashCode()
        result = 31 * result + this.modified.hashCode()
        result = 31 * result + this.objectGuid.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.info.hashCode()
        return result
    }
}

public data class NtmsI1Objectinformationw0(
    public var drive: NtmsDriveinformationw = NtmsDriveinformationw(),
    public var driveType: NtmsDrivetypeinformationw = NtmsDrivetypeinformationw(),
    public var library: NtmsI1Libraryinformation = NtmsI1Libraryinformation(),
    public var changer: NtmsChangerinformationw = NtmsChangerinformationw(),
    public var changerType: NtmsChangertypeinformationw = NtmsChangertypeinformationw(),
    public var storageSlot: NtmsStorageslotinformation = NtmsStorageslotinformation(),
    public var iEDoor: NtmsIedoorinformation = NtmsIedoorinformation(),
    public var iEPort: NtmsIeportinformation = NtmsIeportinformation(),
    public var physicalMedia: NtmsI1Pmidinformationw = NtmsI1Pmidinformationw(),
    public var logicalMedia: NtmsLmidinformation = NtmsLmidinformation(),
    public var partition: NtmsI1Partitioninformationw = NtmsI1Partitioninformationw(),
    public var mediaPool: NtmsMediapoolinformation = NtmsMediapoolinformation(),
    public var mediaType: NtmsMediatypeinformation = NtmsMediatypeinformation(),
    public var libRequest: NtmsI1Librequestinformationw = NtmsI1Librequestinformationw(),
    public var opRequest: NtmsI1Oprequestinformationw = NtmsI1Oprequestinformationw(),
)

public data class NtmsI1Oprequestinformationa(
    public var request: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var state: UInt = 0u,
    public var szMessage: ByteArray = ByteArray(127),
    public var arg1Type: UInt = 0u,
    public var arg1: Guid = Guid(),
    public var arg2Type: UInt = 0u,
    public var arg2: Guid = Guid(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Oprequestinformationa) return false
        if (this.request != other.request) return false
        if (this.submitted != other.submitted) return false
        if (this.state != other.state) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.arg1Type != other.arg1Type) return false
        if (this.arg1 != other.arg1) return false
        if (this.arg2Type != other.arg2Type) return false
        if (this.arg2 != other.arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.request.hashCode()
        result = 31 * result + this.submitted.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.arg1Type.hashCode()
        result = 31 * result + this.arg1.hashCode()
        result = 31 * result + this.arg2Type.hashCode()
        result = 31 * result + this.arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsI1Oprequestinformationw(
    public var request: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var state: UInt = 0u,
    public var szMessage: UShortArray = UShortArray(127),
    public var arg1Type: UInt = 0u,
    public var arg1: Guid = Guid(),
    public var arg2Type: UInt = 0u,
    public var arg2: Guid = Guid(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Oprequestinformationw) return false
        if (this.request != other.request) return false
        if (this.submitted != other.submitted) return false
        if (this.state != other.state) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.arg1Type != other.arg1Type) return false
        if (this.arg1 != other.arg1) return false
        if (this.arg2Type != other.arg2Type) return false
        if (this.arg2 != other.arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.request.hashCode()
        result = 31 * result + this.submitted.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.arg1Type.hashCode()
        result = 31 * result + this.arg1.hashCode()
        result = 31 * result + this.arg2Type.hashCode()
        result = 31 * result + this.arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsI1Partitioninformationa(
    public var physicalMedia: Guid = Guid(),
    public var logicalMedia: Guid = Guid(),
    public var state: UInt = 0u,
    public var side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var omidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: ByteArray = ByteArray(64),
    public var szOmidLabelInfo: ByteArray = ByteArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Partitioninformationa) return false
        if (this.physicalMedia != other.physicalMedia) return false
        if (this.logicalMedia != other.logicalMedia) return false
        if (this.state != other.state) return false
        if (this.side != other.side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.omidLabelId.contentEquals(other.omidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMedia.hashCode()
        result = 31 * result + this.logicalMedia.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.omidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        return result
    }
}

public data class NtmsI1Partitioninformationw(
    public var physicalMedia: Guid = Guid(),
    public var logicalMedia: Guid = Guid(),
    public var state: UInt = 0u,
    public var side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var omidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: UShortArray = UShortArray(64),
    public var szOmidLabelInfo: UShortArray = UShortArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Partitioninformationw) return false
        if (this.physicalMedia != other.physicalMedia) return false
        if (this.logicalMedia != other.logicalMedia) return false
        if (this.state != other.state) return false
        if (this.side != other.side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.omidLabelId.contentEquals(other.omidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMedia.hashCode()
        result = 31 * result + this.logicalMedia.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.omidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        return result
    }
}

public data class NtmsI1Pmidinformationa(
    public var currentLibrary: Guid = Guid(),
    public var mediaPool: Guid = Guid(),
    public var location: Guid = Guid(),
    public var locationType: UInt = 0u,
    public var mediaType: Guid = Guid(),
    public var homeSlot: Guid = Guid(),
    public var szBarCode: ByteArray = ByteArray(64),
    public var barCodeState: UInt = 0u,
    public var szSequenceNumber: ByteArray = ByteArray(32),
    public var mediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Pmidinformationa) return false
        if (this.currentLibrary != other.currentLibrary) return false
        if (this.mediaPool != other.mediaPool) return false
        if (this.location != other.location) return false
        if (this.locationType != other.locationType) return false
        if (this.mediaType != other.mediaType) return false
        if (this.homeSlot != other.homeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.barCodeState != other.barCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.mediaState != other.mediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentLibrary.hashCode()
        result = 31 * result + this.mediaPool.hashCode()
        result = 31 * result + this.location.hashCode()
        result = 31 * result + this.locationType.hashCode()
        result = 31 * result + this.mediaType.hashCode()
        result = 31 * result + this.homeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.barCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.mediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        return result
    }
}

public data class NtmsI1Pmidinformationw(
    public var currentLibrary: Guid = Guid(),
    public var mediaPool: Guid = Guid(),
    public var location: Guid = Guid(),
    public var locationType: UInt = 0u,
    public var mediaType: Guid = Guid(),
    public var homeSlot: Guid = Guid(),
    public var szBarCode: UShortArray = UShortArray(64),
    public var barCodeState: UInt = 0u,
    public var szSequenceNumber: UShortArray = UShortArray(32),
    public var mediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Pmidinformationw) return false
        if (this.currentLibrary != other.currentLibrary) return false
        if (this.mediaPool != other.mediaPool) return false
        if (this.location != other.location) return false
        if (this.locationType != other.locationType) return false
        if (this.mediaType != other.mediaType) return false
        if (this.homeSlot != other.homeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.barCodeState != other.barCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.mediaState != other.mediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentLibrary.hashCode()
        result = 31 * result + this.mediaPool.hashCode()
        result = 31 * result + this.location.hashCode()
        result = 31 * result + this.locationType.hashCode()
        result = 31 * result + this.mediaType.hashCode()
        result = 31 * result + this.homeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.barCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.mediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        return result
    }
}

public data class NtmsIedoorinformation(
    public var number: UInt = 0u,
    public var state: UInt = 0u,
    public var maxOpenSecs: UShort = 0u,
    public var library: Guid = Guid(),
)

public data class NtmsIeportinformation(
    public var number: UInt = 0u,
    public var content: UInt = 0u,
    public var position: UInt = 0u,
    public var maxExtendSecs: UShort = 0u,
    public var library: Guid = Guid(),
)

public class NtmsLibraryinformation(
    public var libraryType: UInt = 0u,
    public var cleanerSlot: Guid = Guid(),
    public var cleanerSlotDefault: Guid = Guid(),
    public var librarySupportsDriveCleaning: Bool = 0,
    public var barCodeReaderInstalled: Bool = 0,
    public var inventoryMethod: UInt = 0u,
    public var dwCleanerUsesRemaining: UInt = 0u,
    public var firstDriveNumber: UInt = 0u,
    public var dwNumberOfDrives: UInt = 0u,
    public var firstSlotNumber: UInt = 0u,
    public var dwNumberOfSlots: UInt = 0u,
    public var firstDoorNumber: UInt = 0u,
    public var dwNumberOfDoors: UInt = 0u,
    public var firstPortNumber: UInt = 0u,
    public var dwNumberOfPorts: UInt = 0u,
    public var firstChangerNumber: UInt = 0u,
    public var dwNumberOfChangers: UInt = 0u,
    public var dwNumberOfMedia: UInt = 0u,
    public var dwNumberOfMediaTypes: UInt = 0u,
    public var dwNumberOfLibRequests: UInt = 0u,
    public var reserved: Guid = Guid(),
    public var autoRecovery: Bool = 0,
    public var dwFlags: UInt = 0u,
)

public data class NtmsLibrequestinformationa(
    public var operationCode: UInt = 0u,
    public var operationOption: UInt = 0u,
    public var state: UInt = 0u,
    public var partitionId: Guid = Guid(),
    public var driveId: Guid = Guid(),
    public var physMediaId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var slotId: Guid = Guid(),
    public var timeQueued: Systemtime = Systemtime(),
    public var timeCompleted: Systemtime = Systemtime(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
    public var dwErrorCode: UInt = 0u,
    public var workItemId: Guid = Guid(),
    public var dwPriority: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsLibrequestinformationa) return false
        if (this.operationCode != other.operationCode) return false
        if (this.operationOption != other.operationOption) return false
        if (this.state != other.state) return false
        if (this.partitionId != other.partitionId) return false
        if (this.driveId != other.driveId) return false
        if (this.physMediaId != other.physMediaId) return false
        if (this.library != other.library) return false
        if (this.slotId != other.slotId) return false
        if (this.timeQueued != other.timeQueued) return false
        if (this.timeCompleted != other.timeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        if (this.dwErrorCode != other.dwErrorCode) return false
        if (this.workItemId != other.workItemId) return false
        if (this.dwPriority != other.dwPriority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationCode.hashCode()
        result = 31 * result + this.operationOption.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.driveId.hashCode()
        result = 31 * result + this.physMediaId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.slotId.hashCode()
        result = 31 * result + this.timeQueued.hashCode()
        result = 31 * result + this.timeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        result = 31 * result + this.dwErrorCode.hashCode()
        result = 31 * result + this.workItemId.hashCode()
        result = 31 * result + this.dwPriority.hashCode()
        return result
    }
}

public data class NtmsLibrequestinformationw(
    public var operationCode: UInt = 0u,
    public var operationOption: UInt = 0u,
    public var state: UInt = 0u,
    public var partitionId: Guid = Guid(),
    public var driveId: Guid = Guid(),
    public var physMediaId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var slotId: Guid = Guid(),
    public var timeQueued: Systemtime = Systemtime(),
    public var timeCompleted: Systemtime = Systemtime(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
    public var dwErrorCode: UInt = 0u,
    public var workItemId: Guid = Guid(),
    public var dwPriority: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsLibrequestinformationw) return false
        if (this.operationCode != other.operationCode) return false
        if (this.operationOption != other.operationOption) return false
        if (this.state != other.state) return false
        if (this.partitionId != other.partitionId) return false
        if (this.driveId != other.driveId) return false
        if (this.physMediaId != other.physMediaId) return false
        if (this.library != other.library) return false
        if (this.slotId != other.slotId) return false
        if (this.timeQueued != other.timeQueued) return false
        if (this.timeCompleted != other.timeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        if (this.dwErrorCode != other.dwErrorCode) return false
        if (this.workItemId != other.workItemId) return false
        if (this.dwPriority != other.dwPriority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationCode.hashCode()
        result = 31 * result + this.operationOption.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.driveId.hashCode()
        result = 31 * result + this.physMediaId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.slotId.hashCode()
        result = 31 * result + this.timeQueued.hashCode()
        result = 31 * result + this.timeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        result = 31 * result + this.dwErrorCode.hashCode()
        result = 31 * result + this.workItemId.hashCode()
        result = 31 * result + this.dwPriority.hashCode()
        return result
    }
}

public data class NtmsLmidinformation(
    public var mediaPool: Guid = Guid(),
    public var dwNumberOfPartitions: UInt = 0u,
)

public data class NtmsMediapoolinformation(
    public var poolType: UInt = 0u,
    public var mediaType: Guid = Guid(),
    public var parent: Guid = Guid(),
    public var allocationPolicy: UInt = 0u,
    public var deallocationPolicy: UInt = 0u,
    public var dwMaxAllocates: UInt = 0u,
    public var dwNumberOfPhysicalMedia: UInt = 0u,
    public var dwNumberOfLogicalMedia: UInt = 0u,
    public var dwNumberOfMediaPools: UInt = 0u,
)

public data class NtmsMediatypeinformation(
    public var mediaType: UInt = 0u,
    public var numberOfSides: UInt = 0u,
    public var readWriteCharacteristics: UInt = 0u,
    public var deviceType: FileDeviceType = 0u,
)

public data class NtmsMountInformation(
    public var dwSize: UInt = 0u,
    public var lpReserved: COpaquePointer? = null,
)

public data class NtmsNotificationinformation(
    public var dwOperation: UInt = 0u,
    public var objectId: Guid = Guid(),
)

public data class NtmsObjectinformationa(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var created: Systemtime = Systemtime(),
    public var modified: Systemtime = Systemtime(),
    public var objectGuid: Guid = Guid(),
    public var enabled: Bool = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
    public var szDescription: ByteArray = ByteArray(127),
    public var info: NtmsObjectinformationa0 = NtmsObjectinformationa0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsObjectinformationa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.created != other.created) return false
        if (this.modified != other.modified) return false
        if (this.objectGuid != other.objectGuid) return false
        if (this.enabled != other.enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.info != other.info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.created.hashCode()
        result = 31 * result + this.modified.hashCode()
        result = 31 * result + this.objectGuid.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.info.hashCode()
        return result
    }
}

public data class NtmsObjectinformationa0(
    public var drive: NtmsDriveinformationa = NtmsDriveinformationa(),
    public var driveType: NtmsDrivetypeinformationa = NtmsDrivetypeinformationa(),
    public var library: NtmsLibraryinformation = NtmsLibraryinformation(),
    public var changer: NtmsChangerinformationa = NtmsChangerinformationa(),
    public var changerType: NtmsChangertypeinformationa = NtmsChangertypeinformationa(),
    public var storageSlot: NtmsStorageslotinformation = NtmsStorageslotinformation(),
    public var iEDoor: NtmsIedoorinformation = NtmsIedoorinformation(),
    public var iEPort: NtmsIeportinformation = NtmsIeportinformation(),
    public var physicalMedia: NtmsPmidinformationa = NtmsPmidinformationa(),
    public var logicalMedia: NtmsLmidinformation = NtmsLmidinformation(),
    public var partition: NtmsPartitioninformationa = NtmsPartitioninformationa(),
    public var mediaPool: NtmsMediapoolinformation = NtmsMediapoolinformation(),
    public var mediaType: NtmsMediatypeinformation = NtmsMediatypeinformation(),
    public var libRequest: NtmsLibrequestinformationa = NtmsLibrequestinformationa(),
    public var opRequest: NtmsOprequestinformationa = NtmsOprequestinformationa(),
    public var computer: NtmsComputerinformation = NtmsComputerinformation(),
)

public data class NtmsObjectinformationw(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var created: Systemtime = Systemtime(),
    public var modified: Systemtime = Systemtime(),
    public var objectGuid: Guid = Guid(),
    public var enabled: Bool = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
    public var szDescription: UShortArray = UShortArray(127),
    public var info: NtmsObjectinformationw0 = NtmsObjectinformationw0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsObjectinformationw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.created != other.created) return false
        if (this.modified != other.modified) return false
        if (this.objectGuid != other.objectGuid) return false
        if (this.enabled != other.enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.info != other.info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.created.hashCode()
        result = 31 * result + this.modified.hashCode()
        result = 31 * result + this.objectGuid.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.info.hashCode()
        return result
    }
}

public data class NtmsObjectinformationw0(
    public var drive: NtmsDriveinformationw = NtmsDriveinformationw(),
    public var driveType: NtmsDrivetypeinformationw = NtmsDrivetypeinformationw(),
    public var library: NtmsLibraryinformation = NtmsLibraryinformation(),
    public var changer: NtmsChangerinformationw = NtmsChangerinformationw(),
    public var changerType: NtmsChangertypeinformationw = NtmsChangertypeinformationw(),
    public var storageSlot: NtmsStorageslotinformation = NtmsStorageslotinformation(),
    public var iEDoor: NtmsIedoorinformation = NtmsIedoorinformation(),
    public var iEPort: NtmsIeportinformation = NtmsIeportinformation(),
    public var physicalMedia: NtmsPmidinformationw = NtmsPmidinformationw(),
    public var logicalMedia: NtmsLmidinformation = NtmsLmidinformation(),
    public var partition: NtmsPartitioninformationw = NtmsPartitioninformationw(),
    public var mediaPool: NtmsMediapoolinformation = NtmsMediapoolinformation(),
    public var mediaType: NtmsMediatypeinformation = NtmsMediatypeinformation(),
    public var libRequest: NtmsLibrequestinformationw = NtmsLibrequestinformationw(),
    public var opRequest: NtmsOprequestinformationw = NtmsOprequestinformationw(),
    public var computer: NtmsComputerinformation = NtmsComputerinformation(),
)

public data class NtmsOprequestinformationa(
    public var request: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var state: UInt = 0u,
    public var szMessage: ByteArray = ByteArray(256),
    public var arg1Type: UInt = 0u,
    public var arg1: Guid = Guid(),
    public var arg2Type: UInt = 0u,
    public var arg2: Guid = Guid(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsOprequestinformationa) return false
        if (this.request != other.request) return false
        if (this.submitted != other.submitted) return false
        if (this.state != other.state) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.arg1Type != other.arg1Type) return false
        if (this.arg1 != other.arg1) return false
        if (this.arg2Type != other.arg2Type) return false
        if (this.arg2 != other.arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.request.hashCode()
        result = 31 * result + this.submitted.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.arg1Type.hashCode()
        result = 31 * result + this.arg1.hashCode()
        result = 31 * result + this.arg2Type.hashCode()
        result = 31 * result + this.arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsOprequestinformationw(
    public var request: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var state: UInt = 0u,
    public var szMessage: UShortArray = UShortArray(256),
    public var arg1Type: UInt = 0u,
    public var arg1: Guid = Guid(),
    public var arg2Type: UInt = 0u,
    public var arg2: Guid = Guid(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsOprequestinformationw) return false
        if (this.request != other.request) return false
        if (this.submitted != other.submitted) return false
        if (this.state != other.state) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.arg1Type != other.arg1Type) return false
        if (this.arg1 != other.arg1) return false
        if (this.arg2Type != other.arg2Type) return false
        if (this.arg2 != other.arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.request.hashCode()
        result = 31 * result + this.submitted.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.arg1Type.hashCode()
        result = 31 * result + this.arg1.hashCode()
        result = 31 * result + this.arg2Type.hashCode()
        result = 31 * result + this.arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsPartitioninformationa(
    public var physicalMedia: Guid = Guid(),
    public var logicalMedia: Guid = Guid(),
    public var state: UInt = 0u,
    public var side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var omidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: ByteArray = ByteArray(64),
    public var szOmidLabelInfo: ByteArray = ByteArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
    public var capacity: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsPartitioninformationa) return false
        if (this.physicalMedia != other.physicalMedia) return false
        if (this.logicalMedia != other.logicalMedia) return false
        if (this.state != other.state) return false
        if (this.side != other.side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.omidLabelId.contentEquals(other.omidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        if (this.capacity != other.capacity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMedia.hashCode()
        result = 31 * result + this.logicalMedia.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.omidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        result = 31 * result + this.capacity.hashCode()
        return result
    }
}

public data class NtmsPartitioninformationw(
    public var physicalMedia: Guid = Guid(),
    public var logicalMedia: Guid = Guid(),
    public var state: UInt = 0u,
    public var side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var omidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: UShortArray = UShortArray(64),
    public var szOmidLabelInfo: UShortArray = UShortArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
    public var capacity: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsPartitioninformationw) return false
        if (this.physicalMedia != other.physicalMedia) return false
        if (this.logicalMedia != other.logicalMedia) return false
        if (this.state != other.state) return false
        if (this.side != other.side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.omidLabelId.contentEquals(other.omidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        if (this.capacity != other.capacity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMedia.hashCode()
        result = 31 * result + this.logicalMedia.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.omidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        result = 31 * result + this.capacity.hashCode()
        return result
    }
}

public data class NtmsPmidinformationa(
    public var currentLibrary: Guid = Guid(),
    public var mediaPool: Guid = Guid(),
    public var location: Guid = Guid(),
    public var locationType: UInt = 0u,
    public var mediaType: Guid = Guid(),
    public var homeSlot: Guid = Guid(),
    public var szBarCode: ByteArray = ByteArray(64),
    public var barCodeState: UInt = 0u,
    public var szSequenceNumber: ByteArray = ByteArray(32),
    public var mediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
    public var dwMediaTypeCode: UInt = 0u,
    public var dwDensityCode: UInt = 0u,
    public var mountedPartition: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsPmidinformationa) return false
        if (this.currentLibrary != other.currentLibrary) return false
        if (this.mediaPool != other.mediaPool) return false
        if (this.location != other.location) return false
        if (this.locationType != other.locationType) return false
        if (this.mediaType != other.mediaType) return false
        if (this.homeSlot != other.homeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.barCodeState != other.barCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.mediaState != other.mediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        if (this.dwMediaTypeCode != other.dwMediaTypeCode) return false
        if (this.dwDensityCode != other.dwDensityCode) return false
        if (this.mountedPartition != other.mountedPartition) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentLibrary.hashCode()
        result = 31 * result + this.mediaPool.hashCode()
        result = 31 * result + this.location.hashCode()
        result = 31 * result + this.locationType.hashCode()
        result = 31 * result + this.mediaType.hashCode()
        result = 31 * result + this.homeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.barCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.mediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        result = 31 * result + this.dwMediaTypeCode.hashCode()
        result = 31 * result + this.dwDensityCode.hashCode()
        result = 31 * result + this.mountedPartition.hashCode()
        return result
    }
}

public data class NtmsPmidinformationw(
    public var currentLibrary: Guid = Guid(),
    public var mediaPool: Guid = Guid(),
    public var location: Guid = Guid(),
    public var locationType: UInt = 0u,
    public var mediaType: Guid = Guid(),
    public var homeSlot: Guid = Guid(),
    public var szBarCode: UShortArray = UShortArray(64),
    public var barCodeState: UInt = 0u,
    public var szSequenceNumber: UShortArray = UShortArray(32),
    public var mediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
    public var dwMediaTypeCode: UInt = 0u,
    public var dwDensityCode: UInt = 0u,
    public var mountedPartition: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsPmidinformationw) return false
        if (this.currentLibrary != other.currentLibrary) return false
        if (this.mediaPool != other.mediaPool) return false
        if (this.location != other.location) return false
        if (this.locationType != other.locationType) return false
        if (this.mediaType != other.mediaType) return false
        if (this.homeSlot != other.homeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.barCodeState != other.barCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.mediaState != other.mediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        if (this.dwMediaTypeCode != other.dwMediaTypeCode) return false
        if (this.dwDensityCode != other.dwDensityCode) return false
        if (this.mountedPartition != other.mountedPartition) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentLibrary.hashCode()
        result = 31 * result + this.mediaPool.hashCode()
        result = 31 * result + this.location.hashCode()
        result = 31 * result + this.locationType.hashCode()
        result = 31 * result + this.mediaType.hashCode()
        result = 31 * result + this.homeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.barCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.mediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        result = 31 * result + this.dwMediaTypeCode.hashCode()
        result = 31 * result + this.dwDensityCode.hashCode()
        result = 31 * result + this.mountedPartition.hashCode()
        return result
    }
}

public data class NtmsStorageslotinformation(
    public var number: UInt = 0u,
    public var state: UInt = 0u,
    public var library: Guid = Guid(),
)

public data class Ofstruct(
    public var cBytes: UByte = 0u,
    public var fFixedDisk: UByte = 0u,
    public var nErrCode: UShort = 0u,
    public var reserved1: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var szPathName: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ofstruct) return false
        if (this.cBytes != other.cBytes) return false
        if (this.fFixedDisk != other.fFixedDisk) return false
        if (this.nErrCode != other.nErrCode) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (!this.szPathName.contentEquals(other.szPathName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBytes.hashCode()
        result = 31 * result + this.fFixedDisk.hashCode()
        result = 31 * result + this.nErrCode.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.szPathName.contentHashCode()
        return result
    }
}

public data class ReparseGuidDataBuffer(
    public var reparseTag: UInt = 0u,
    public var reparseDataLength: UShort = 0u,
    public var reserved: UShort = 0u,
    public var reparseGuid: Guid = Guid(),
    public var genericReparseBuffer: ReparseGuidDataBuffer0 = ReparseGuidDataBuffer0(),
)

public data class ReparseGuidDataBuffer0(
    public var dataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReparseGuidDataBuffer0) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int = this.dataBuffer.contentHashCode()
}

public data class ServerAliasInfo0(
    public var srvai0Alias: Pwstr = null,
    public var srvai0Target: Pwstr = null,
    public var srvai0Default: Boolean = false,
    public var srvai0Reserved: UInt = 0u,
)

public data class ServerCertificateInfo0(
    public var srvci0Name: Pwstr = null,
    public var srvci0Subject: Pwstr = null,
    public var srvci0Issuer: Pwstr = null,
    public var srvci0Thumbprint: Pwstr = null,
    public var srvci0Friendlyname: Pwstr = null,
    public var srvci0Notbefore: Pwstr = null,
    public var srvci0Notafter: Pwstr = null,
    public var srvci0Storelocation: Pwstr = null,
    public var srvci0Storename: Pwstr = null,
    public var srvci0Renewalchain: Pwstr = null,
    public var srvci0Type: UInt = 0u,
    public var srvci0Flags: UInt = 0u,
    public var srvci0MappingStatus: UInt = 0u,
)

public data class SessionInfo0(
    public var sesi0Cname: Pwstr = null,
)

public data class SessionInfo1(
    public var sesi1Cname: Pwstr = null,
    public var sesi1Username: Pwstr = null,
    public var sesi1NumOpens: UInt = 0u,
    public var sesi1Time: UInt = 0u,
    public var sesi1IdleTime: UInt = 0u,
    public var sesi1UserFlags: SessionInfoUserFlags = 0u,
)

public data class SessionInfo10(
    public var sesi10Cname: Pwstr = null,
    public var sesi10Username: Pwstr = null,
    public var sesi10Time: UInt = 0u,
    public var sesi10IdleTime: UInt = 0u,
)

public data class SessionInfo2(
    public var sesi2Cname: Pwstr = null,
    public var sesi2Username: Pwstr = null,
    public var sesi2NumOpens: UInt = 0u,
    public var sesi2Time: UInt = 0u,
    public var sesi2IdleTime: UInt = 0u,
    public var sesi2UserFlags: SessionInfoUserFlags = 0u,
    public var sesi2CltypeName: Pwstr = null,
)

public data class SessionInfo502(
    public var sesi502Cname: Pwstr = null,
    public var sesi502Username: Pwstr = null,
    public var sesi502NumOpens: UInt = 0u,
    public var sesi502Time: UInt = 0u,
    public var sesi502IdleTime: UInt = 0u,
    public var sesi502UserFlags: SessionInfoUserFlags = 0u,
    public var sesi502CltypeName: Pwstr = null,
    public var sesi502Transport: Pwstr = null,
)

public data class ShareInfo0(
    public var shi0Netname: Pwstr = null,
)

public data class ShareInfo1(
    public var shi1Netname: Pwstr = null,
    public var shi1Type: ShareType = 0u,
    public var shi1Remark: Pwstr = null,
)

public data class ShareInfo1004(
    public var shi1004Remark: Pwstr = null,
)

public data class ShareInfo1005(
    public var shi1005Flags: UInt = 0u,
)

public data class ShareInfo1006(
    public var shi1006MaxUses: UInt = 0u,
)

public data class ShareInfo1501(
    public var shi1501Reserved: UInt = 0u,
    public var shi1501SecurityDescriptor: PsecurityDescriptor = null,
)

public data class ShareInfo1503(
    public var shi1503Sharefilter: Guid = Guid(),
)

public data class ShareInfo2(
    public var shi2Netname: Pwstr = null,
    public var shi2Type: ShareType = 0u,
    public var shi2Remark: Pwstr = null,
    public var shi2Permissions: ShareInfoPermissions = 0u,
    public var shi2MaxUses: UInt = 0u,
    public var shi2CurrentUses: UInt = 0u,
    public var shi2Path: Pwstr = null,
    public var shi2Passwd: Pwstr = null,
)

public data class ShareInfo501(
    public var shi501Netname: Pwstr = null,
    public var shi501Type: ShareType = 0u,
    public var shi501Remark: Pwstr = null,
    public var shi501Flags: UInt = 0u,
)

public data class ShareInfo502(
    public var shi502Netname: Pwstr = null,
    public var shi502Type: ShareType = 0u,
    public var shi502Remark: Pwstr = null,
    public var shi502Permissions: ShareInfoPermissions = 0u,
    public var shi502MaxUses: UInt = 0u,
    public var shi502CurrentUses: UInt = 0u,
    public var shi502Path: Pwstr = null,
    public var shi502Passwd: Pwstr = null,
    public var shi502Reserved: UInt = 0u,
    public var shi502SecurityDescriptor: PsecurityDescriptor = null,
)

public data class ShareInfo503(
    public var shi503Netname: Pwstr = null,
    public var shi503Type: ShareType = 0u,
    public var shi503Remark: Pwstr = null,
    public var shi503Permissions: ShareInfoPermissions = 0u,
    public var shi503MaxUses: UInt = 0u,
    public var shi503CurrentUses: UInt = 0u,
    public var shi503Path: Pwstr = null,
    public var shi503Passwd: Pwstr = null,
    public var shi503Servername: Pwstr = null,
    public var shi503Reserved: UInt = 0u,
    public var shi503SecurityDescriptor: PsecurityDescriptor = null,
)

public class StatServer0(
    public var sts0Start: UInt = 0u,
    public var sts0Fopens: UInt = 0u,
    public var sts0Devopens: UInt = 0u,
    public var sts0Jobsqueued: UInt = 0u,
    public var sts0Sopens: UInt = 0u,
    public var sts0Stimedout: UInt = 0u,
    public var sts0Serrorout: UInt = 0u,
    public var sts0Pwerrors: UInt = 0u,
    public var sts0Permerrors: UInt = 0u,
    public var sts0Syserrors: UInt = 0u,
    public var sts0BytessentLow: UInt = 0u,
    public var sts0BytessentHigh: UInt = 0u,
    public var sts0BytesrcvdLow: UInt = 0u,
    public var sts0BytesrcvdHigh: UInt = 0u,
    public var sts0Avresponse: UInt = 0u,
    public var sts0Reqbufneed: UInt = 0u,
    public var sts0Bigbufneed: UInt = 0u,
)

public class StatWorkstation0(
    public var statisticsStartTime: Long = 0L,
    public var bytesReceived: Long = 0L,
    public var smbsReceived: Long = 0L,
    public var pagingReadBytesRequested: Long = 0L,
    public var nonPagingReadBytesRequested: Long = 0L,
    public var cacheReadBytesRequested: Long = 0L,
    public var networkReadBytesRequested: Long = 0L,
    public var bytesTransmitted: Long = 0L,
    public var smbsTransmitted: Long = 0L,
    public var pagingWriteBytesRequested: Long = 0L,
    public var nonPagingWriteBytesRequested: Long = 0L,
    public var cacheWriteBytesRequested: Long = 0L,
    public var networkWriteBytesRequested: Long = 0L,
    public var initiallyFailedOperations: UInt = 0u,
    public var failedCompletionOperations: UInt = 0u,
    public var readOperations: UInt = 0u,
    public var randomReadOperations: UInt = 0u,
    public var readSmbs: UInt = 0u,
    public var largeReadSmbs: UInt = 0u,
    public var smallReadSmbs: UInt = 0u,
    public var writeOperations: UInt = 0u,
    public var randomWriteOperations: UInt = 0u,
    public var writeSmbs: UInt = 0u,
    public var largeWriteSmbs: UInt = 0u,
    public var smallWriteSmbs: UInt = 0u,
    public var rawReadsDenied: UInt = 0u,
    public var rawWritesDenied: UInt = 0u,
    public var networkErrors: UInt = 0u,
    public var sessions: UInt = 0u,
    public var failedSessions: UInt = 0u,
    public var reconnects: UInt = 0u,
    public var coreConnects: UInt = 0u,
    public var lanman20Connects: UInt = 0u,
    public var lanman21Connects: UInt = 0u,
    public var lanmanNtConnects: UInt = 0u,
    public var serverDisconnects: UInt = 0u,
    public var hungSessions: UInt = 0u,
    public var useCount: UInt = 0u,
    public var failedUseCount: UInt = 0u,
    public var currentCommands: UInt = 0u,
)

public data class TapeErase(
    public var type: EraseTapeType = 0u,
    public var immediate: Boolean = false,
)

public data class TapeGetPosition(
    public var type: TapePositionType = 0u,
    public var partition: UInt = 0u,
    public var offset: Long = 0L,
)

public data class TapePrepare(
    public var operation: PrepareTapeOperation = 0u,
    public var immediate: Boolean = false,
)

public data class TapeSetPosition(
    public var method: TapePositionMethod = 0u,
    public var partition: UInt = 0u,
    public var offset: Long = 0L,
    public var immediate: Boolean = false,
)

public data class TapeWriteMarks(
    public var type: TapemarkType = 0u,
    public var count: UInt = 0u,
    public var immediate: Boolean = false,
)

public data class TransactionNotification(
    public var transactionKey: COpaquePointer? = null,
    public var transactionNotification: UInt = 0u,
    public var tmVirtualClock: Long = 0L,
    public var argumentLength: UInt = 0u,
)

public data class TransactionNotificationMarshalArgument(
    public var marshalCookie: UInt = 0u,
    public var uow: Guid = Guid(),
)

public data class TransactionNotificationPropagateArgument(
    public var propagationCookie: UInt = 0u,
    public var uow: Guid = Guid(),
    public var tmIdentity: Guid = Guid(),
    public var bufferLength: UInt = 0u,
)

public data class TransactionNotificationRecoveryArgument(
    public var enlistmentId: Guid = Guid(),
    public var uow: Guid = Guid(),
)

public data class TransactionNotificationSavepointArgument(
    public var savepointId: UInt = 0u,
)

public data class TransactionNotificationTmOnlineArgument(
    public var tmIdentity: Guid = Guid(),
    public var flags: UInt = 0u,
)

public data class TxfId(
    public var anonymous: TxfId0 = TxfId0(),
)

public data class TxfId0(
    public var lowPart: Long = 0L,
    public var highPart: Long = 0L,
)

public data class TxfLogRecordAffectedFile(
    public var version: UShort = 0u,
    public var recordLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var txfFileId: TxfId = TxfId(),
    public var ktmGuid: Guid = Guid(),
    public var fileNameLength: UInt = 0u,
    public var fileNameByteOffsetInStructure: UInt = 0u,
)

public data class TxfLogRecordBase(
    public var version: UShort = 0u,
    public var recordType: TxfLogRecordType = 0u,
    public var recordLength: UInt = 0u,
)

public data class TxfLogRecordTruncate(
    public var version: UShort = 0u,
    public var recordType: UShort = 0u,
    public var recordLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var txfFileId: TxfId = TxfId(),
    public var ktmGuid: Guid = Guid(),
    public var newFileSize: Long = 0L,
    public var fileNameLength: UInt = 0u,
    public var fileNameByteOffsetInStructure: UInt = 0u,
)

public data class TxfLogRecordWrite(
    public var version: UShort = 0u,
    public var recordType: UShort = 0u,
    public var recordLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var txfFileId: TxfId = TxfId(),
    public var ktmGuid: Guid = Guid(),
    public var byteOffsetInFile: Long = 0L,
    public var numBytesWritten: UInt = 0u,
    public var byteOffsetInStructure: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileNameByteOffsetInStructure: UInt = 0u,
)

public data class VolumeAllocateBcStreamInput(
    public var version: UInt = 0u,
    public var requestsPerPeriod: UInt = 0u,
    public var period: UInt = 0u,
    public var retryFailures: Boolean = false,
    public var discardable: Boolean = false,
    public var reserved1: BooleanArray = BooleanArray(2),
    public var lowestByteOffset: ULong = 0uL,
    public var highestByteOffset: ULong = 0uL,
    public var accessType: UInt = 0u,
    public var accessMode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeAllocateBcStreamInput) return false
        if (this.version != other.version) return false
        if (this.requestsPerPeriod != other.requestsPerPeriod) return false
        if (this.period != other.period) return false
        if (this.retryFailures != other.retryFailures) return false
        if (this.discardable != other.discardable) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.lowestByteOffset != other.lowestByteOffset) return false
        if (this.highestByteOffset != other.highestByteOffset) return false
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
        result = 31 * result + this.lowestByteOffset.hashCode()
        result = 31 * result + this.highestByteOffset.hashCode()
        result = 31 * result + this.accessType.hashCode()
        result = 31 * result + this.accessMode.hashCode()
        return result
    }
}

public data class VolumeAllocateBcStreamOutput(
    public var requestSize: ULong = 0uL,
    public var numOutStandingRequests: UInt = 0u,
)

public data class VolumeAllocationHintInput(
    public var clusterSize: UInt = 0u,
    public var numberOfClusters: UInt = 0u,
    public var startingClusterNumber: Long = 0L,
)

public data class VolumeAllocationHintOutput(
    public var bitmap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeAllocationHintOutput) return false
        if (!this.bitmap.contentEquals(other.bitmap)) return false
        return true
    }

    override fun hashCode(): Int = this.bitmap.contentHashCode()
}

public data class VolumeCriticalIo(
    public var accessType: UInt = 0u,
    public var extentsCount: UInt = 0u,
    public var extents: List<FileExtent> = List(1) { FileExtent() },
)

public data class VolumeFailoverSet(
    public var numberOfDisks: UInt = 0u,
    public var diskNumbers: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeFailoverSet) return false
        if (this.numberOfDisks != other.numberOfDisks) return false
        if (!this.diskNumbers.contentEquals(other.diskNumbers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfDisks.hashCode()
        result = 31 * result + this.diskNumbers.contentHashCode()
        return result
    }
}

public data class VolumeGetBcPropertiesInput(
    public var version: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var lowestByteOffset: ULong = 0uL,
    public var highestByteOffset: ULong = 0uL,
    public var accessType: UInt = 0u,
    public var accessMode: UInt = 0u,
)

public data class VolumeGetBcPropertiesOutput(
    public var maximumRequestsPerPeriod: UInt = 0u,
    public var minimumPeriod: UInt = 0u,
    public var maximumRequestSize: ULong = 0uL,
    public var estimatedTimePerRequest: UInt = 0u,
    public var numOutStandingRequests: UInt = 0u,
    public var requestSize: ULong = 0uL,
)

public data class VolumeLogicalOffset(
    public var logicalOffset: Long = 0L,
)

public data class VolumeNumber(
    public var volumeNumber: UInt = 0u,
    public var volumeManagerName: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeNumber) return false
        if (this.volumeNumber != other.volumeNumber) return false
        if (!this.volumeManagerName.contentEquals(other.volumeManagerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeNumber.hashCode()
        result = 31 * result + this.volumeManagerName.contentHashCode()
        return result
    }
}

public data class VolumePhysicalOffset(
    public var diskNumber: UInt = 0u,
    public var offset: Long = 0L,
)

public data class VolumePhysicalOffsets(
    public var numberOfPhysicalOffsets: UInt = 0u,
    public var physicalOffset: List<VolumePhysicalOffset> = List(1) { VolumePhysicalOffset() },
)

public data class VolumeReadPlexInput(
    public var byteOffset: Long = 0L,
    public var length: UInt = 0u,
    public var plexNumber: UInt = 0u,
)

public data class VolumeSetGptAttributesInformation(
    public var gptAttributes: ULong = 0uL,
    public var revertOnClose: Boolean = false,
    public var applyToAllConnectedVolumes: Boolean = false,
    public var reserved1: UShort = 0u,
    public var reserved2: UInt = 0u,
)

public data class VolumeShrinkInfo(
    public var volumeSize: ULong = 0uL,
)

public data class VsFixedfileinfo(
    public var dwSignature: UInt = 0u,
    public var dwStrucVersion: UInt = 0u,
    public var dwFileVersionMS: UInt = 0u,
    public var dwFileVersionLS: UInt = 0u,
    public var dwProductVersionMS: UInt = 0u,
    public var dwProductVersionLS: UInt = 0u,
    public var dwFileFlagsMask: UInt = 0u,
    public var dwFileFlags: VsFixedfileinfoFileFlags = 0u,
    public var dwFileOS: VsFixedfileinfoFileOs = 0u,
    public var dwFileType: UInt = 0u,
    public var dwFileSubtype: UInt = 0u,
    public var dwFileDateMS: UInt = 0u,
    public var dwFileDateLS: UInt = 0u,
)

public data class WimEntryInfo(
    public var wimEntryInfoSize: UInt = 0u,
    public var wimType: UInt = 0u,
    public var dataSourceId: Long = 0L,
    public var wimGuid: Guid = Guid(),
    public var wimPath: Pcwstr = null,
    public var wimIndex: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class WimExternalFileInfo(
    public var dataSourceId: Long = 0L,
    public var resourceHash: UByteArray = UByteArray(20),
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WimExternalFileInfo) return false
        if (this.dataSourceId != other.dataSourceId) return false
        if (!this.resourceHash.contentEquals(other.resourceHash)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataSourceId.hashCode()
        result = 31 * result + this.resourceHash.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class Win32FileAttributeData(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastWriteTime: Filetime = Filetime(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
)

public data class Win32FindDataa(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastWriteTime: Filetime = Filetime(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var dwReserved0: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var cFileName: ByteArray = ByteArray(260),
    public var cAlternateFileName: ByteArray = ByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Win32FindDataa) return false
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

public data class Win32FindDataw(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastWriteTime: Filetime = Filetime(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var dwReserved0: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var cFileName: UShortArray = UShortArray(260),
    public var cAlternateFileName: UShortArray = UShortArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Win32FindDataw) return false
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

public data class Win32FindStreamData(
    public var streamSize: Long = 0L,
    public var cStreamName: UShortArray = UShortArray(296),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Win32FindStreamData) return false
        if (this.streamSize != other.streamSize) return false
        if (!this.cStreamName.contentEquals(other.cStreamName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.streamSize.hashCode()
        result = 31 * result + this.cStreamName.contentHashCode()
        return result
    }
}

public data class Win32StreamId(
    public var dwStreamId: WinStreamId = 0u,
    public var dwStreamAttributes: UInt = 0u,
    public var size: Long = 0L,
    public var dwStreamNameSize: UInt = 0u,
    public var cStreamName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Win32StreamId) return false
        if (this.dwStreamId != other.dwStreamId) return false
        if (this.dwStreamAttributes != other.dwStreamAttributes) return false
        if (this.size != other.size) return false
        if (this.dwStreamNameSize != other.dwStreamNameSize) return false
        if (!this.cStreamName.contentEquals(other.cStreamName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStreamId.hashCode()
        result = 31 * result + this.dwStreamAttributes.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.dwStreamNameSize.hashCode()
        result = 31 * result + this.cStreamName.contentHashCode()
        return result
    }
}

public data class WofFileCompressionInfoV0(
    public var algorithm: UInt = 0u,
)

public data class WofFileCompressionInfoV1(
    public var algorithm: UInt = 0u,
    public var flags: UInt = 0u,
)
