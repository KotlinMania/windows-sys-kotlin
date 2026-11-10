@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.EcpList
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Eresource
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FastMutex
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoSecurityContext
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Irp
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PfreeFunction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.RtlSplayLinks
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.TokenControl
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.Msv10ProtocolMessageType
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecApplicationProtocolList
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecurityLogonType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileId128
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileSegmentElement
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ReparseGuidDataBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.FsBpioInflags
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.FsBpioOperations
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.QueryBadRangesInputRange
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.StorageReserveId
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.String

public data class AceHeader(
    public var aceType: UByte = 0u,
    public var aceFlags: UByte = 0u,
    public var aceSize: UShort = 0u,
)

public class AtomicCreateEcpContext(
    public var size: UShort = 0u,
    public var inFlags: UShort = 0u,
    public var outFlags: UShort = 0u,
    public var reparseBufferLength: UShort = 0u,
    public var reparseBuffer: ReparseDataBuffer? = null,
    public var fileSize: Long = 0L,
    public var validDataLength: Long = 0L,
    public var fileTimestamps: FileTimestamps? = null,
    public var fileAttributes: UInt = 0u,
    public var usnSourceInfo: UInt = 0u,
    public var usn: Long = 0L,
    public var suppressFileAttributeInheritanceMask: UInt = 0u,
    public var inOpFlags: UInt = 0u,
    public var outOpFlags: UInt = 0u,
    public var inGenFlags: UInt = 0u,
    public var outGenFlags: UInt = 0u,
    public var caseSensitiveFlagsMask: UInt = 0u,
    public var inCaseSensitiveFlags: UInt = 0u,
    public var outCaseSensitiveFlags: UInt = 0u,
)

public data class BaseMcb(
    public var maximumPairCount: UInt = 0u,
    public var pairCount: UInt = 0u,
    public var poolType: UShort = 0u,
    public var flags: UShort = 0u,
    public var mapping: COpaquePointer? = null,
)

public data class BootAreaInfo(public var bootSectorCount: UInt = 0u, public var bootSectors: List<BootAreaInfo0> = List(2) { BootAreaInfo0() })

public data class BootAreaInfo0(public var offset: Long = 0L)

public data class CacheManagerCallbacks(
    public var acquireForLazyWrite: PacquireForLazyWrite = null,
    public var releaseFromLazyWrite: PreleaseFromLazyWrite = null,
    public var acquireForReadAhead: PacquireForReadAhead = null,
    public var releaseFromReadAhead: PreleaseFromReadAhead = null,
)

public data class CacheManagerCallbacksEx(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var functions: CacheManagerCallbackFunctions = CacheManagerCallbackFunctions(),
)

public data class CacheManagerCallbackFunctions(
    public var acquireForLazyWriteEx: PacquireForLazyWriteEx = null,
    public var releaseFromLazyWrite: PreleaseFromLazyWrite = null,
    public var acquireForReadAhead: PacquireForReadAhead = null,
    public var releaseFromReadAhead: PreleaseFromReadAhead = null,
)

public data class CacheUninitializeEvent(public var next: CacheUninitializeEvent? = null, public var event: Kevent = Kevent())

public data class CcAsyncReadContext(
    public var completionRoutine: PasyncReadCompletionCallback = null,
    public var context: COpaquePointer? = null,
    public var mdl: Mdl? = null,
    public var requestorMode: Byte = 0,
    public var nestingLevel: UInt = 0u,
)

public data class CcErrorCallbackContext(public var nodeByteSize: Short = 0, public var errorCode: Ntstatus = 0)

public data class CcFileSizes(
    public var allocationSize: Long = 0L,
    public var fileSize: Long = 0L,
    public var validDataLength: Long = 0L,
)

public data class CompressedDataInfo(
    public var compressionFormatAndEngine: UShort = 0u,
    public var compressionUnitShift: UByte = 0u,
    public var chunkShift: UByte = 0u,
    public var clusterShift: UByte = 0u,
    public var reserved: UByte = 0u,
    public var numberOfChunks: UShort = 0u,
    public var compressedChunkSizes: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CompressedDataInfo) return false
        if (this.compressionFormatAndEngine != other.compressionFormatAndEngine) return false
        if (this.compressionUnitShift != other.compressionUnitShift) return false
        if (this.chunkShift != other.chunkShift) return false
        if (this.clusterShift != other.clusterShift) return false
        if (this.reserved != other.reserved) return false
        if (this.numberOfChunks != other.numberOfChunks) return false
        if (!this.compressedChunkSizes.contentEquals(other.compressedChunkSizes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compressionFormatAndEngine.hashCode()
        result = 31 * result + this.compressionUnitShift.hashCode()
        result = 31 * result + this.chunkShift.hashCode()
        result = 31 * result + this.clusterShift.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.numberOfChunks.hashCode()
        result = 31 * result + this.compressedChunkSizes.contentHashCode()
        return result
    }
}

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

public data class CopyInformation(public var sourceFileObject: FileObject? = null, public var sourceFileOffset: Long = 0L)

public data class Cptableinfo(
    public var codePage: UShort = 0u,
    public var maximumCharacterSize: UShort = 0u,
    public var defaultChar: UShort = 0u,
    public var uniDefaultChar: UShort = 0u,
    public var transDefaultChar: UShort = 0u,
    public var transUniDefaultChar: UShort = 0u,
    public var dBCSCodePage: UShort = 0u,
    public var leadByte: UByteArray = UByteArray(12),
    public var multiByteTable: UShort? = null,
    public var wideCharTable: COpaquePointer? = null,
    public var dBCSRanges: UShort? = null,
    public var dBCSOffsets: UShort? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cptableinfo) return false
        if (this.codePage != other.codePage) return false
        if (this.maximumCharacterSize != other.maximumCharacterSize) return false
        if (this.defaultChar != other.defaultChar) return false
        if (this.uniDefaultChar != other.uniDefaultChar) return false
        if (this.transDefaultChar != other.transDefaultChar) return false
        if (this.transUniDefaultChar != other.transUniDefaultChar) return false
        if (this.dBCSCodePage != other.dBCSCodePage) return false
        if (!this.leadByte.contentEquals(other.leadByte)) return false
        if (this.multiByteTable != other.multiByteTable) return false
        if (this.wideCharTable != other.wideCharTable) return false
        if (this.dBCSRanges != other.dBCSRanges) return false
        if (this.dBCSOffsets != other.dBCSOffsets) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.codePage.hashCode()
        result = 31 * result + this.maximumCharacterSize.hashCode()
        result = 31 * result + this.defaultChar.hashCode()
        result = 31 * result + this.uniDefaultChar.hashCode()
        result = 31 * result + this.transDefaultChar.hashCode()
        result = 31 * result + this.transUniDefaultChar.hashCode()
        result = 31 * result + this.dBCSCodePage.hashCode()
        result = 31 * result + this.leadByte.contentHashCode()
        result = 31 * result + this.multiByteTable.hashCode()
        result = 31 * result + this.wideCharTable.hashCode()
        result = 31 * result + this.dBCSRanges.hashCode()
        result = 31 * result + this.dBCSOffsets.hashCode()
        return result
    }
}

public data class CreateRedirectionEcpContext(
    public var size: UShort = 0u,
    public var flags: UShort = 0u,
    public var fileId: FileId128 = FileId128(),
    public var volumeGuid: Guid = Guid(),
)

public data class CreateUsnJournalData(public var maximumSize: ULong = 0uL, public var allocationDelta: ULong = 0uL)

public data class CsvDownLevelOpenEcpContext(
    public var version: UInt = 0u,
    public var isResume: Boolean = false,
    public var fileType: CsvDownLevelFileType = 0,
    public var sourceNodeId: UInt = 0u,
    public var destinationNodeId: UInt = 0u,
)

public data class CsvQueryFileRevisionEcpContext(public var fileId: Long = 0L, public var fileRevision: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryFileRevisionEcpContext) return false
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

public data class CsvQueryFileRevisionEcpContextFileId128(public var fileId: FileId128 = FileId128(), public var fileRevision: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryFileRevisionEcpContextFileId128) return false
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

public data class CsvSetHandlePropertiesEcpContext(
    public var size: Int = 0,
    public var pauseTimeoutInSeconds: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class DualOplockKeyEcpContext(
    public var parentOplockKey: Guid = Guid(),
    public var targetOplockKey: Guid = Guid(),
    public var parentOplockKeySet: Boolean = false,
    public var targetOplockKeySet: Boolean = false,
)

public data class DuplicateClusterData(
    public var sourceLcn: Long = 0L,
    public var targetFileOffset: Long = 0L,
    public var duplicationLimit: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class EcpOpenParameters(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class EofWaitBlock(public var eofWaitLinks: ListEntry = ListEntry(), public var event: Kevent = Kevent())

public data class ExtentReadCacheInfoBuffer(
    public var allocatedCache: Long = 0L,
    public var populatedCache: Long = 0L,
    public var inErrorCache: Long = 0L,
)

public data class FileAccessInformation(public var accessFlags: UInt = 0u)

public data class FileAlignmentInformation(public var alignmentRequirement: UInt = 0u)

public data class FileAllocationInformation(public var allocationSize: Long = 0L)

public data class FileAllInformation(
    public var basicInformation: FileBasicInformation = FileBasicInformation(),
    public var standardInformation: FileStandardInformation = FileStandardInformation(),
    public var internalInformation: FileInternalInformation = FileInternalInformation(),
    public var eaInformation: FileEaInformation = FileEaInformation(),
    public var accessInformation: FileAccessInformation = FileAccessInformation(),
    public var positionInformation: FilePositionInformation = FilePositionInformation(),
    public var modeInformation: FileModeInformation = FileModeInformation(),
    public var alignmentInformation: FileAlignmentInformation = FileAlignmentInformation(),
    public var nameInformation: FileNameInformation = FileNameInformation(),
)

public data class FileBasicInformation(
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var fileAttributes: UInt = 0u,
)

public data class FileBothDirInformation(
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
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileBothDirInformation) return false
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
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileCaseSensitiveInformation(public var flags: UInt = 0u)

public data class FileCompletionInformation(public var port: Handle = null, public var key: COpaquePointer? = null)

public data class FileCompressionInformation(
    public var compressedFileSize: Long = 0L,
    public var compressionFormat: UShort = 0u,
    public var compressionUnitShift: UByte = 0u,
    public var chunkShift: UByte = 0u,
    public var clusterShift: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileCompressionInformation) return false
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

public data class FileDirectoryInformation(
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
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileDirectoryInformation) return false
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
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileDispositionInformation(public var deleteFile: Boolean = false)

public data class FileDispositionInformationEx(public var flags: FileDispositionInformationExFlags = 0u)

public data class FileEaInformation(public var eaSize: UInt = 0u)

public data class FileEndOfFileInformationEx(
    public var endOfFile: Long = 0L,
    public var pagingFileSizeInMM: Long = 0L,
    public var pagingFileMaxSize: Long = 0L,
    public var flags: UInt = 0u,
)

public data class FileFsAttributeInformation(
    public var fileSystemAttributes: UInt = 0u,
    public var maximumComponentNameLength: Int = 0,
    public var fileSystemNameLength: UInt = 0u,
    public var fileSystemName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFsAttributeInformation) return false
        if (this.fileSystemAttributes != other.fileSystemAttributes) return false
        if (this.maximumComponentNameLength != other.maximumComponentNameLength) return false
        if (this.fileSystemNameLength != other.fileSystemNameLength) return false
        if (!this.fileSystemName.contentEquals(other.fileSystemName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileSystemAttributes.hashCode()
        result = 31 * result + this.maximumComponentNameLength.hashCode()
        result = 31 * result + this.fileSystemNameLength.hashCode()
        result = 31 * result + this.fileSystemName.contentHashCode()
        return result
    }
}

public data class FileFsControlInformation(
    public var freeSpaceStartFiltering: Long = 0L,
    public var freeSpaceThreshold: Long = 0L,
    public var freeSpaceStopFiltering: Long = 0L,
    public var defaultQuotaThreshold: Long = 0L,
    public var defaultQuotaLimit: Long = 0L,
    public var fileSystemControlFlags: UInt = 0u,
)

public data class FileFsDataCopyInformation(public var numberOfCopies: UInt = 0u)

public data class FileFsDriverPathInformation(
    public var driverInPath: Boolean = false,
    public var driverNameLength: UInt = 0u,
    public var driverName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFsDriverPathInformation) return false
        if (this.driverInPath != other.driverInPath) return false
        if (this.driverNameLength != other.driverNameLength) return false
        if (!this.driverName.contentEquals(other.driverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.driverInPath.hashCode()
        result = 31 * result + this.driverNameLength.hashCode()
        result = 31 * result + this.driverName.contentHashCode()
        return result
    }
}

public data class FileFsSectorSizeInformation(
    public var logicalBytesPerSector: UInt = 0u,
    public var physicalBytesPerSectorForAtomicity: UInt = 0u,
    public var physicalBytesPerSectorForPerformance: UInt = 0u,
    public var fileSystemEffectivePhysicalBytesPerSectorForAtomicity: UInt = 0u,
    public var flags: UInt = 0u,
    public var byteOffsetForSectorAlignment: UInt = 0u,
    public var byteOffsetForPartitionAlignment: UInt = 0u,
)

public data class FileFsVolumeFlagsInformation(public var flags: UInt = 0u)

public data class FileFullDirInformation(
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
        if (other !is FileFullDirInformation) return false
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

public data class FileFullEaInformation(
    public var nextEntryOffset: UInt = 0u,
    public var flags: UByte = 0u,
    public var eaNameLength: UByte = 0u,
    public var eaValueLength: UShort = 0u,
    public var eaName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFullEaInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.flags != other.flags) return false
        if (this.eaNameLength != other.eaNameLength) return false
        if (this.eaValueLength != other.eaValueLength) return false
        if (!this.eaName.contentEquals(other.eaName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.eaNameLength.hashCode()
        result = 31 * result + this.eaValueLength.hashCode()
        result = 31 * result + this.eaName.contentHashCode()
        return result
    }
}

public data class FileGetEaInformation(
    public var nextEntryOffset: UInt = 0u,
    public var eaNameLength: UByte = 0u,
    public var eaName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileGetEaInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.eaNameLength != other.eaNameLength) return false
        if (!this.eaName.contentEquals(other.eaName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.eaNameLength.hashCode()
        result = 31 * result + this.eaName.contentHashCode()
        return result
    }
}

public data class FileGetQuotaInformation(
    public var nextEntryOffset: UInt = 0u,
    public var sidLength: UInt = 0u,
    public var sid: Sid = Sid(),
)

public data class FileIdBothDirInformation(
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
        if (other !is FileIdBothDirInformation) return false
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

public data class FileIdExtdBothDirInformation(
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
    public var shortNameLength: Byte = 0,
    public var shortName: UShortArray = UShortArray(12),
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdExtdBothDirInformation) return false
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
        if (this.shortNameLength != other.shortNameLength) return false
        if (!this.shortName.contentEquals(other.shortName)) return false
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
        result = 31 * result + this.shortNameLength.hashCode()
        result = 31 * result + this.shortName.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileIdExtdDirInformation(
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
        if (other !is FileIdExtdDirInformation) return false
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

public data class FileIdFullDirInformation(
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
    public var fileId: Long = 0L,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdFullDirInformation) return false
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
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileIdGlobalTxDirInformation(
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
    public var fileId: Long = 0L,
    public var lockingTransactionId: Guid = Guid(),
    public var txInfoFlags: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdGlobalTxDirInformation) return false
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
        if (this.fileId != other.fileId) return false
        if (this.lockingTransactionId != other.lockingTransactionId) return false
        if (this.txInfoFlags != other.txInfoFlags) return false
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
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.lockingTransactionId.hashCode()
        result = 31 * result + this.txInfoFlags.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileIdInformation(public var volumeSerialNumber: ULong = 0uL, public var fileId: FileId128 = FileId128())

public data class FileInformationDefinition(
    public var cls: FileInformationClass = 0,
    public var nextEntryOffset: UInt = 0u,
    public var fileNameLengthOffset: UInt = 0u,
    public var fileNameOffset: UInt = 0u,
)

public data class FileInternalInformation(public var indexNumber: Long = 0L)

public data class FileKnownFolderInformation(public var type: FileKnownFolderType = 0)

public data class FileLinksFullIdInformation(
    public var bytesNeeded: UInt = 0u,
    public var entriesReturned: UInt = 0u,
    public var entry: FileLinkEntryFullIdInformation = FileLinkEntryFullIdInformation(),
)

public data class FileLinksInformation(
    public var bytesNeeded: UInt = 0u,
    public var entriesReturned: UInt = 0u,
    public var entry: FileLinkEntryInformation = FileLinkEntryInformation(),
)

public data class FileLinkEntryFullIdInformation(
    public var nextEntryOffset: UInt = 0u,
    public var parentFileId: FileId128 = FileId128(),
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLinkEntryFullIdInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.parentFileId != other.parentFileId) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.parentFileId.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileLinkEntryInformation(
    public var nextEntryOffset: UInt = 0u,
    public var parentFileId: Long = 0L,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLinkEntryInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.parentFileId != other.parentFileId) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.parentFileId.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileLinkInformation(
    public var anonymous: FileLinkInformation0 = FileLinkInformation0(),
    public var rootDirectory: Handle = null,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLinkInformation) return false
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

public data class FileLinkInformation0(public var replaceIfExists: Boolean = false, public var flags: UInt = 0u)

public data class FileLock(
    public var completeLockIrpRoutine: PcompleteLockIrpRoutine = null,
    public var unlockRoutine: PunlockRoutine = null,
    public var fastIoIsQuestionable: Boolean = false,
    public var spareC: BooleanArray = BooleanArray(3),
    public var lockInformation: COpaquePointer? = null,
    public var lastReturnedLockInfo: FileLockInfo = FileLockInfo(),
    public var lastReturnedLock: COpaquePointer? = null,
    public var lockRequestsInProgress: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLock) return false
        if (this.completeLockIrpRoutine != other.completeLockIrpRoutine) return false
        if (this.unlockRoutine != other.unlockRoutine) return false
        if (this.fastIoIsQuestionable != other.fastIoIsQuestionable) return false
        if (!this.spareC.contentEquals(other.spareC)) return false
        if (this.lockInformation != other.lockInformation) return false
        if (this.lastReturnedLockInfo != other.lastReturnedLockInfo) return false
        if (this.lastReturnedLock != other.lastReturnedLock) return false
        if (this.lockRequestsInProgress != other.lockRequestsInProgress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.completeLockIrpRoutine.hashCode()
        result = 31 * result + this.unlockRoutine.hashCode()
        result = 31 * result + this.fastIoIsQuestionable.hashCode()
        result = 31 * result + this.spareC.contentHashCode()
        result = 31 * result + this.lockInformation.hashCode()
        result = 31 * result + this.lastReturnedLockInfo.hashCode()
        result = 31 * result + this.lastReturnedLock.hashCode()
        result = 31 * result + this.lockRequestsInProgress.hashCode()
        return result
    }
}

public data class FileLockInfo(
    public var startingByte: Long = 0L,
    public var length: Long = 0L,
    public var exclusiveLock: Boolean = false,
    public var key: UInt = 0u,
    public var fileObject: FileObject? = null,
    public var processId: COpaquePointer? = null,
    public var endingByte: Long = 0L,
)

public data class FileMailslotQueryInformation(
    public var maximumMessageSize: UInt = 0u,
    public var mailslotQuota: UInt = 0u,
    public var nextMessageSize: UInt = 0u,
    public var messagesAvailable: UInt = 0u,
    public var readTimeout: Long = 0L,
)

public data class FileMailslotSetInformation(public var readTimeout: Long? = null)

public data class FileModeInformation(public var mode: UInt = 0u)

public data class FileMoveClusterInformation(
    public var clusterCount: UInt = 0u,
    public var rootDirectory: Handle = null,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileMoveClusterInformation) return false
        if (this.clusterCount != other.clusterCount) return false
        if (this.rootDirectory != other.rootDirectory) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clusterCount.hashCode()
        result = 31 * result + this.rootDirectory.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileNamesInformation(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNamesInformation) return false
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

public data class FileNameInformation(public var fileNameLength: UInt = 0u, public var fileName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNameInformation) return false
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

public data class FileNetworkOpenInformation(
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var fileAttributes: UInt = 0u,
)

public data class FileNetworkPhysicalNameInformation(public var fileNameLength: UInt = 0u, public var fileName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNetworkPhysicalNameInformation) return false
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

public data class FileObjectidInformation(
    public var fileReference: Long = 0L,
    public var objectId: UByteArray = UByteArray(16),
    public var anonymous: FileObjectidInformation0 = FileObjectidInformation0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidInformation) return false
        if (this.fileReference != other.fileReference) return false
        if (!this.objectId.contentEquals(other.objectId)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileReference.hashCode()
        result = 31 * result + this.objectId.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class FileObjectidInformation0(public var anonymous: FileObjectidInformation00 = FileObjectidInformation00(), public var extendedInfo: UByteArray = UByteArray(48)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidInformation0) return false
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

public data class FileObjectidInformation00(
    public var birthVolumeId: UByteArray = UByteArray(16),
    public var birthObjectId: UByteArray = UByteArray(16),
    public var domainId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidInformation00) return false
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

public data class FilePipeAssignEventBuffer(public var eventHandle: Handle = null, public var keyValue: UInt = 0u)

public data class FilePipeClientProcessBuffer(public var clientSession: COpaquePointer? = null, public var clientProcess: COpaquePointer? = null)

public data class FilePipeClientProcessBufferEx(
    public var clientSession: COpaquePointer? = null,
    public var clientProcess: COpaquePointer? = null,
    public var clientComputerNameLength: UShort = 0u,
    public var clientComputerBuffer: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePipeClientProcessBufferEx) return false
        if (this.clientSession != other.clientSession) return false
        if (this.clientProcess != other.clientProcess) return false
        if (this.clientComputerNameLength != other.clientComputerNameLength) return false
        if (!this.clientComputerBuffer.contentEquals(other.clientComputerBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientSession.hashCode()
        result = 31 * result + this.clientProcess.hashCode()
        result = 31 * result + this.clientComputerNameLength.hashCode()
        result = 31 * result + this.clientComputerBuffer.contentHashCode()
        return result
    }
}

public data class FilePipeClientProcessBufferV2(public var clientSession: ULong = 0uL, public var clientProcess: COpaquePointer? = null)

public data class FilePipeCreateSymlinkInput(
    public var nameOffset: UShort = 0u,
    public var nameLength: UShort = 0u,
    public var substituteNameOffset: UShort = 0u,
    public var substituteNameLength: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class FilePipeDeleteSymlinkInput(public var nameOffset: UShort = 0u, public var nameLength: UShort = 0u)

public data class FilePipeEventBuffer(
    public var namedPipeState: UInt = 0u,
    public var entryType: UInt = 0u,
    public var byteCount: UInt = 0u,
    public var keyValue: UInt = 0u,
    public var numberRequests: UInt = 0u,
)

public data class FilePipeInformation(public var readMode: UInt = 0u, public var completionMode: UInt = 0u)

public data class FilePipeLocalInformation(
    public var namedPipeType: UInt = 0u,
    public var namedPipeConfiguration: UInt = 0u,
    public var maximumInstances: UInt = 0u,
    public var currentInstances: UInt = 0u,
    public var inboundQuota: UInt = 0u,
    public var readDataAvailable: UInt = 0u,
    public var outboundQuota: UInt = 0u,
    public var writeQuotaAvailable: UInt = 0u,
    public var namedPipeState: UInt = 0u,
    public var namedPipeEnd: UInt = 0u,
)

public data class FilePipePeekBuffer(
    public var namedPipeState: UInt = 0u,
    public var readDataAvailable: UInt = 0u,
    public var numberOfMessages: UInt = 0u,
    public var messageLength: UInt = 0u,
    public var data: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePipePeekBuffer) return false
        if (this.namedPipeState != other.namedPipeState) return false
        if (this.readDataAvailable != other.readDataAvailable) return false
        if (this.numberOfMessages != other.numberOfMessages) return false
        if (this.messageLength != other.messageLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.namedPipeState.hashCode()
        result = 31 * result + this.readDataAvailable.hashCode()
        result = 31 * result + this.numberOfMessages.hashCode()
        result = 31 * result + this.messageLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class FilePipeRemoteInformation(public var collectDataTime: Long = 0L, public var maximumCollectionCount: UInt = 0u)

public data class FilePipeSiloArrivalInput(public var jobHandle: Handle = null)

public data class FilePipeWaitForBuffer(
    public var timeout: Long = 0L,
    public var nameLength: UInt = 0u,
    public var timeoutSpecified: Boolean = false,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePipeWaitForBuffer) return false
        if (this.timeout != other.timeout) return false
        if (this.nameLength != other.nameLength) return false
        if (this.timeoutSpecified != other.timeoutSpecified) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeout.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.timeoutSpecified.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class FilePositionInformation(public var currentByteOffset: Long = 0L)

public data class FileQuotaInformation(
    public var nextEntryOffset: UInt = 0u,
    public var sidLength: UInt = 0u,
    public var changeTime: Long = 0L,
    public var quotaUsed: Long = 0L,
    public var quotaThreshold: Long = 0L,
    public var quotaLimit: Long = 0L,
    public var sid: Sid = Sid(),
)

public data class FileRemoteProtocolInformation(
    public var structureVersion: UShort = 0u,
    public var structureSize: UShort = 0u,
    public var protocol: UInt = 0u,
    public var protocolMajorVersion: UShort = 0u,
    public var protocolMinorVersion: UShort = 0u,
    public var protocolRevision: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var genericReserved: FileRemoteProtocolInformation0 = FileRemoteProtocolInformation0(),
    public var protocolSpecific: FileRemoteProtocolInformation1 = FileRemoteProtocolInformation1(),
)

public data class FileRemoteProtocolInformation0(public var reserved: UIntArray = UIntArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRemoteProtocolInformation0) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.reserved.contentHashCode()
    }
}

public data class FileRemoteProtocolInformation1(public var smb2: FileRemoteProtocolInformation10 = FileRemoteProtocolInformation10(), public var reserved: UIntArray = UIntArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRemoteProtocolInformation1) return false
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

public data class FileRemoteProtocolInformation10(public var server: FileRemoteProtocolInformation100 = FileRemoteProtocolInformation100(), public var share: FileRemoteProtocolInformation101 = FileRemoteProtocolInformation101())

public data class FileRemoteProtocolInformation100(public var capabilities: UInt = 0u)

public data class FileRemoteProtocolInformation101(
    public var capabilities: UInt = 0u,
    public var shareFlags: UInt = 0u,
    public var shareType: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
    public var reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRemoteProtocolInformation101) return false
        if (this.capabilities != other.capabilities) return false
        if (this.shareFlags != other.shareFlags) return false
        if (this.shareType != other.shareType) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capabilities.hashCode()
        result = 31 * result + this.shareFlags.hashCode()
        result = 31 * result + this.shareType.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }
}

public data class FileRenameInformation(
    public var anonymous: FileRenameInformation0 = FileRenameInformation0(),
    public var rootDirectory: Handle = null,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRenameInformation) return false
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

public data class FileRenameInformation0(public var replaceIfExists: Boolean = false, public var flags: UInt = 0u)

public data class FileReparsePointInformation(public var fileReference: Long = 0L, public var tag: UInt = 0u)

public data class FileStandardInformation(
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var numberOfLinks: UInt = 0u,
    public var deletePending: Boolean = false,
    public var directory: Boolean = false,
)

public data class FileStandardLinkInformation(
    public var numberOfAccessibleLinks: UInt = 0u,
    public var totalNumberOfLinks: UInt = 0u,
    public var deletePending: Boolean = false,
    public var directory: Boolean = false,
)

public data class FileStatInformation(
    public var fileId: Long = 0L,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var reparseTag: UInt = 0u,
    public var numberOfLinks: UInt = 0u,
    public var effectiveAccess: UInt = 0u,
)

public class FileStatLxInformation(
    public var fileId: Long = 0L,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var reparseTag: UInt = 0u,
    public var numberOfLinks: UInt = 0u,
    public var effectiveAccess: UInt = 0u,
    public var lxFlags: UInt = 0u,
    public var lxUid: UInt = 0u,
    public var lxGid: UInt = 0u,
    public var lxMode: UInt = 0u,
    public var lxDeviceIdMajor: UInt = 0u,
    public var lxDeviceIdMinor: UInt = 0u,
)

public data class FileStorageReserveIdInformation(public var storageReserveId: StorageReserveId = 0)

public data class FileStreamInformation(
    public var nextEntryOffset: UInt = 0u,
    public var streamNameLength: UInt = 0u,
    public var streamSize: Long = 0L,
    public var streamAllocationSize: Long = 0L,
    public var streamName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileStreamInformation) return false
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

public data class FileTimestamps(
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
)

public data class FileTrackingInformation(
    public var destinationFile: Handle = null,
    public var objectInformationLength: UInt = 0u,
    public var objectInformation: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileTrackingInformation) return false
        if (this.destinationFile != other.destinationFile) return false
        if (this.objectInformationLength != other.objectInformationLength) return false
        if (!this.objectInformation.contentEquals(other.objectInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.destinationFile.hashCode()
        result = 31 * result + this.objectInformationLength.hashCode()
        result = 31 * result + this.objectInformation.contentHashCode()
        return result
    }
}

public data class FileVolumeNameInformation(public var deviceNameLength: UInt = 0u, public var deviceName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileVolumeNameInformation) return false
        if (this.deviceNameLength != other.deviceNameLength) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceNameLength.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        return result
    }
}

public data class FsctlGhostFileExtentsInputBuffer(
    public var fileOffset: Long = 0L,
    public var byteCount: Long = 0L,
    public var recallOwnerGuid: Guid = Guid(),
    public var recallMetadataBufferSize: UInt = 0u,
    public var recallMetadataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlGhostFileExtentsInputBuffer) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.byteCount != other.byteCount) return false
        if (this.recallOwnerGuid != other.recallOwnerGuid) return false
        if (this.recallMetadataBufferSize != other.recallMetadataBufferSize) return false
        if (!this.recallMetadataBuffer.contentEquals(other.recallMetadataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileOffset.hashCode()
        result = 31 * result + this.byteCount.hashCode()
        result = 31 * result + this.recallOwnerGuid.hashCode()
        result = 31 * result + this.recallMetadataBufferSize.hashCode()
        result = 31 * result + this.recallMetadataBuffer.contentHashCode()
        return result
    }
}

public data class FsctlQueryGhostedFileExtentsInputRange(public var fileOffset: Long = 0L, public var byteCount: Long = 0L)

public data class FsctlQueryGhostedFileExtentsOutput(
    public var extentCount: UInt = 0u,
    public var totalExtentCount: UInt = 0u,
    public var extents: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlQueryGhostedFileExtentsOutput) return false
        if (this.extentCount != other.extentCount) return false
        if (this.totalExtentCount != other.totalExtentCount) return false
        if (!this.extents.contentEquals(other.extents)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extentCount.hashCode()
        result = 31 * result + this.totalExtentCount.hashCode()
        result = 31 * result + this.extents.contentHashCode()
        return result
    }
}

public data class FsctlQueryVolumeNumaInfoOutput(public var numaNode: UInt = 0u)

public data class FsctlUnmapSpaceInputBuffer(public var bytesToUnmap: Long = 0L)

public data class FsctlUnmapSpaceOutput(public var bytesUnmapped: Long = 0L)

public data class FsrtlAdvancedFcbHeader(
    public var base: FsrtlCommonFcbHeader = FsrtlCommonFcbHeader(),
    public var fastMutex: FastMutex? = null,
    public var filterContexts: ListEntry = ListEntry(),
    public var pushLock: Int = 0,
    public var fileContextSupportPointer: COpaquePointer? = null,
    public var anonymous: FsrtlAdvancedFcbHeader0 = FsrtlAdvancedFcbHeader0(),
    public var aePushLock: COpaquePointer? = null,
    public var bypassIoOpenCount: UInt = 0u,
)

public data class FsrtlAdvancedFcbHeader0(public var oplock: COpaquePointer? = null, public var reservedForRemote: COpaquePointer? = null)

public data class FsrtlAuxiliaryBuffer(
    public var buffer: COpaquePointer? = null,
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
    public var mdl: Mdl? = null,
)

public data class FsrtlCommonFcbHeader(
    public var nodeTypeCode: Short = 0,
    public var nodeByteSize: Short = 0,
    public var flags: UByte = 0u,
    public var isFastIoPossible: UByte = 0u,
    public var flags2: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var resource: Eresource? = null,
    public var pagingIoResource: Eresource? = null,
    public var allocationSize: Long = 0L,
    public var fileSize: Long = 0L,
    public var validDataLength: Long = 0L,
)

public data class FsrtlMupProviderInfoLevel1(public var providerId: UInt = 0u)

public data class FsrtlMupProviderInfoLevel2(public var providerId: UInt = 0u, public var providerName: UnicodeString = UnicodeString())

public data class FsrtlPerFileobjectContext(
    public var links: ListEntry = ListEntry(),
    public var ownerId: COpaquePointer? = null,
    public var instanceId: COpaquePointer? = null,
)

public data class FsrtlPerFileContext(
    public var links: ListEntry = ListEntry(),
    public var ownerId: COpaquePointer? = null,
    public var instanceId: COpaquePointer? = null,
    public var freeCallback: PfreeFunction = null,
)

public data class FsrtlPerStreamContext(
    public var links: ListEntry = ListEntry(),
    public var ownerId: COpaquePointer? = null,
    public var instanceId: COpaquePointer? = null,
    public var freeCallback: PfreeFunction = null,
)

public data class FsrtlUncProviderRegistration(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var anonymous1: FsrtlUncProviderRegistration0 = FsrtlUncProviderRegistration0(),
    public var anonymous2: FsrtlUncProviderRegistration1 = FsrtlUncProviderRegistration1(),
)

public data class FsrtlUncProviderRegistration0(public var providerFlags: UInt = 0u, public var anonymous: FsrtlUncProviderRegistration00 = FsrtlUncProviderRegistration00())

public data class FsrtlUncProviderRegistration00(public var bitfield: UInt = 0u)

public data class FsrtlUncProviderRegistration1(public var hardeningCapabilities: UInt = 0u, public var anonymous: FsrtlUncProviderRegistration10 = FsrtlUncProviderRegistration10())

public data class FsrtlUncProviderRegistration10(public var bitfield: UInt = 0u)

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

public data class FsFilterCallbacks(
    public var sizeOfFsFilterCallbacks: UInt = 0u,
    public var reserved: UInt = 0u,
    public var preAcquireForSectionSynchronization: PfsFilterCallback = null,
    public var postAcquireForSectionSynchronization: PfsFilterCompletionCallback = null,
    public var preReleaseForSectionSynchronization: PfsFilterCallback = null,
    public var postReleaseForSectionSynchronization: PfsFilterCompletionCallback = null,
    public var preAcquireForCcFlush: PfsFilterCallback = null,
    public var postAcquireForCcFlush: PfsFilterCompletionCallback = null,
    public var preReleaseForCcFlush: PfsFilterCallback = null,
    public var postReleaseForCcFlush: PfsFilterCompletionCallback = null,
    public var preAcquireForModifiedPageWriter: PfsFilterCallback = null,
    public var postAcquireForModifiedPageWriter: PfsFilterCompletionCallback = null,
    public var preReleaseForModifiedPageWriter: PfsFilterCallback = null,
    public var postReleaseForModifiedPageWriter: PfsFilterCompletionCallback = null,
    public var preQueryOpen: PfsFilterCallback = null,
    public var postQueryOpen: PfsFilterCompletionCallback = null,
)

public data class FsFilterCallbackData(
    public var sizeOfFsFilterCallbackData: UInt = 0u,
    public var operation: UByte = 0u,
    public var reserved: UByte = 0u,
    public var deviceObject: DeviceObject? = null,
    public var fileObject: FileObject? = null,
    public var parameters: FsFilterParameters = FsFilterParameters(),
)

public data class FsFilterParameters(
    public var acquireForModifiedPageWriter: FsFilterParameters0 = FsFilterParameters0(),
    public var releaseForModifiedPageWriter: FsFilterParameters1 = FsFilterParameters1(),
    public var acquireForSectionSynchronization: FsFilterParameters2 = FsFilterParameters2(),
    public var queryOpen: FsFilterParameters3 = FsFilterParameters3(),
    public var others: FsFilterParameters4 = FsFilterParameters4(),
)

public data class FsFilterParameters0(public var endingOffset: Long? = null, public var resourceToRelease: COpaquePointer? = null)

public data class FsFilterParameters2(
    public var syncType: FsFilterSectionSyncType = 0,
    public var pageProtection: UInt = 0u,
    public var outputInformation: FsFilterSectionSyncOutput? = null,
    public var flags: UInt = 0u,
    public var allocationAttributes: UInt = 0u,
)

public data class FsFilterParameters4(
    public var argument1: COpaquePointer? = null,
    public var argument2: COpaquePointer? = null,
    public var argument3: COpaquePointer? = null,
    public var argument4: COpaquePointer? = null,
    public var argument5: COpaquePointer? = null,
)

public data class FsFilterParameters3(
    public var irp: Irp? = null,
    public var fileInformation: COpaquePointer? = null,
    public var length: UInt? = null,
    public var fileInformationClass: FileInformationClass = 0,
    public var completionStatus: Ntstatus = 0,
)

public data class FsFilterParameters1(public var resourceToRelease: Eresource? = null)

public data class FsFilterSectionSyncOutput(
    public var structureSize: UInt = 0u,
    public var sizeReturned: UInt = 0u,
    public var flags: UInt = 0u,
    public var desiredReadAlignment: UInt = 0u,
)

public data class GenerateNameContext(
    public var checksum: UShort = 0u,
    public var checksumInserted: Boolean = false,
    public var nameLength: UByte = 0u,
    public var nameBuffer: UShortArray = UShortArray(8),
    public var extensionLength: UInt = 0u,
    public var extensionBuffer: UShortArray = UShortArray(4),
    public var lastIndexValue: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GenerateNameContext) return false
        if (this.checksum != other.checksum) return false
        if (this.checksumInserted != other.checksumInserted) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.nameBuffer.contentEquals(other.nameBuffer)) return false
        if (this.extensionLength != other.extensionLength) return false
        if (!this.extensionBuffer.contentEquals(other.extensionBuffer)) return false
        if (this.lastIndexValue != other.lastIndexValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.checksum.hashCode()
        result = 31 * result + this.checksumInserted.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.nameBuffer.contentHashCode()
        result = 31 * result + this.extensionLength.hashCode()
        result = 31 * result + this.extensionBuffer.contentHashCode()
        result = 31 * result + this.lastIndexValue.hashCode()
        return result
    }
}

public data class GhostedFileExtent(
    public var fileOffset: Long = 0L,
    public var byteCount: Long = 0L,
    public var recallOwnerGuid: Guid = Guid(),
    public var nextEntryOffset: UInt = 0u,
    public var recallMetadataBufferSize: UInt = 0u,
    public var recallMetadataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GhostedFileExtent) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.byteCount != other.byteCount) return false
        if (this.recallOwnerGuid != other.recallOwnerGuid) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.recallMetadataBufferSize != other.recallMetadataBufferSize) return false
        if (!this.recallMetadataBuffer.contentEquals(other.recallMetadataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileOffset.hashCode()
        result = 31 * result + this.byteCount.hashCode()
        result = 31 * result + this.recallOwnerGuid.hashCode()
        result = 31 * result + this.nextEntryOffset.hashCode()
        result = 31 * result + this.recallMetadataBufferSize.hashCode()
        result = 31 * result + this.recallMetadataBuffer.contentHashCode()
        return result
    }
}

public data class IoCreateStreamFileOptions(
    public var size: UShort = 0u,
    public var flags: UShort = 0u,
    public var targetDeviceObject: DeviceObject? = null,
)

public data class IoDeviceHintEcpContext(public var targetDevice: DeviceObject? = null, public var remainingName: UnicodeString = UnicodeString())

public data class IoPriorityInfo(
    public var size: UInt = 0u,
    public var threadPriority: UInt = 0u,
    public var pagePriority: UInt = 0u,
    public var ioPriority: IoPriorityHint = 0,
)

public data class IoStopOnSymlinkFilterEcpV0(public var out: IoStopOnSymlinkFilterEcpV00 = IoStopOnSymlinkFilterEcpV00())

public data class IoStopOnSymlinkFilterEcpV00(public var reparseCount: UInt = 0u, public var remainingPathLength: UInt = 0u)

public data class KapcState(
    public var apcListHead: List<ListEntry> = List(2) { ListEntry() },
    public var process: Int? = null,
    public var anonymous1: KapcState0 = KapcState0(),
    public var kernelApcPending: Boolean = false,
    public var anonymous2: KapcState1 = KapcState1(),
)

public data class KapcState0(public var inProgressFlags: UByte = 0u, public var anonymous: KapcState00 = KapcState00())

public data class KapcState00(public var bitfield: UByte = 0u)

public data class KapcState1(public var userApcPendingAll: Boolean = false, public var anonymous: KapcState10 = KapcState10())

public data class KapcState10(public var bitfield: UByte = 0u)

public data class LargeMcb(public var guardedMutex: FastMutex? = null, public var baseMcb: BaseMcb = BaseMcb())

public data class LcnWeakReferenceBuffer(
    public var lcn: Long = 0L,
    public var lengthInClusters: Long = 0L,
    public var referenceCount: UInt = 0u,
    public var state: UShort = 0u,
)

public data class LcnWeakReferenceCreateInputBuffer(
    public var offset: Long = 0L,
    public var length: Long = 0L,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class LinkTrackingInformation(public var type: LinkTrackingInformationType = 0, public var volumeId: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LinkTrackingInformation) return false
        if (this.type != other.type) return false
        if (!this.volumeId.contentEquals(other.volumeId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.volumeId.contentHashCode()
        return result
    }
}

public data class Mcb(public var dummyFieldThatSizesThisStructureCorrectly: LargeMcb = LargeMcb())

public data class MemoryRangeEntry(public var virtualAddress: COpaquePointer? = null, public var numberOfBytes: Int = 0)

public data class MftEnumData(
    public var startFileReferenceNumber: ULong = 0uL,
    public var lowUsn: Long = 0L,
    public var highUsn: Long = 0L,
    public var minMajorVersion: UShort = 0u,
    public var maxMajorVersion: UShort = 0u,
)

public data class MmPrefetchFlags(public var flags: MmPrefetchFlags0 = MmPrefetchFlags0(), public var allFlags: UInt = 0u)

public data class MmPrefetchFlags0(public var bitfield: UInt = 0u)

public data class Msv10EnumusersRequest(public var messageType: Msv10ProtocolMessageType = 0)

public data class Msv10EnumusersResponse(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var numberOfLoggedOnUsers: UInt = 0u,
    public var logonIds: Luid? = null,
    public var enumHandles: UInt? = null,
)

public data class Msv10GetchallenrespRequest(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var parameterControl: UInt = 0u,
    public var logonId: Luid = Luid(),
    public var password: UnicodeString = UnicodeString(),
    public var challengeToClient: UByteArray = UByteArray(8),
    public var userName: UnicodeString = UnicodeString(),
    public var logonDomainName: UnicodeString = UnicodeString(),
    public var serverName: UnicodeString = UnicodeString(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10GetchallenrespRequest) return false
        if (this.messageType != other.messageType) return false
        if (this.parameterControl != other.parameterControl) return false
        if (this.logonId != other.logonId) return false
        if (this.password != other.password) return false
        if (!this.challengeToClient.contentEquals(other.challengeToClient)) return false
        if (this.userName != other.userName) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (this.serverName != other.serverName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.parameterControl.hashCode()
        result = 31 * result + this.logonId.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.challengeToClient.contentHashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.serverName.hashCode()
        return result
    }
}

public data class Msv10GetchallenrespRequestV1(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var parameterControl: UInt = 0u,
    public var logonId: Luid = Luid(),
    public var password: UnicodeString = UnicodeString(),
    public var challengeToClient: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10GetchallenrespRequestV1) return false
        if (this.messageType != other.messageType) return false
        if (this.parameterControl != other.parameterControl) return false
        if (this.logonId != other.logonId) return false
        if (this.password != other.password) return false
        if (!this.challengeToClient.contentEquals(other.challengeToClient)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.parameterControl.hashCode()
        result = 31 * result + this.logonId.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.challengeToClient.contentHashCode()
        return result
    }
}

public data class Msv10GetchallenrespResponse(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var caseSensitiveChallengeResponse: String = String(),
    public var caseInsensitiveChallengeResponse: String = String(),
    public var userName: UnicodeString = UnicodeString(),
    public var logonDomainName: UnicodeString = UnicodeString(),
    public var userSessionKey: UByteArray = UByteArray(16),
    public var lanmanSessionKey: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10GetchallenrespResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.caseSensitiveChallengeResponse != other.caseSensitiveChallengeResponse) return false
        if (this.caseInsensitiveChallengeResponse != other.caseInsensitiveChallengeResponse) return false
        if (this.userName != other.userName) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (!this.userSessionKey.contentEquals(other.userSessionKey)) return false
        if (!this.lanmanSessionKey.contentEquals(other.lanmanSessionKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.caseSensitiveChallengeResponse.hashCode()
        result = 31 * result + this.caseInsensitiveChallengeResponse.hashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.userSessionKey.contentHashCode()
        result = 31 * result + this.lanmanSessionKey.contentHashCode()
        return result
    }
}

public data class Msv10GetuserinfoRequest(public var messageType: Msv10ProtocolMessageType = 0, public var logonId: Luid = Luid())

public data class Msv10GetuserinfoResponse(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var userSid: Psid = null,
    public var userName: UnicodeString = UnicodeString(),
    public var logonDomainName: UnicodeString = UnicodeString(),
    public var logonServer: UnicodeString = UnicodeString(),
    public var logonType: SecurityLogonType = SecurityLogonType(),
)

public data class Msv10Lm20ChallengeRequest(public var messageType: Msv10ProtocolMessageType = 0)

public data class Msv10Lm20ChallengeResponse(public var messageType: Msv10ProtocolMessageType = 0, public var challengeToClient: UByteArray = UByteArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10Lm20ChallengeResponse) return false
        if (this.messageType != other.messageType) return false
        if (!this.challengeToClient.contentEquals(other.challengeToClient)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.challengeToClient.contentHashCode()
        return result
    }
}

public data class NetworkAppInstanceEcpContext(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var appInstanceID: Guid = Guid(),
)

public data class NetworkAppInstanceVersionEcpContext(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var versionHigh: ULong = 0uL,
    public var versionLow: ULong = 0uL,
)

public data class NetworkOpenEcpContext(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var anonymous: NetworkOpenEcpContext0 = NetworkOpenEcpContext0(),
)

public data class NetworkOpenEcpContext0(public var input: NetworkOpenEcpContext00 = NetworkOpenEcpContext00(), public var out: NetworkOpenEcpContext01 = NetworkOpenEcpContext01())

public data class NetworkOpenEcpContext00(
    public var location: NetworkOpenLocationQualifier = 0,
    public var integrity: NetworkOpenIntegrityQualifier = 0,
    public var flags: UInt = 0u,
)

public data class NetworkOpenEcpContext01(
    public var location: NetworkOpenLocationQualifier = 0,
    public var integrity: NetworkOpenIntegrityQualifier = 0,
    public var flags: UInt = 0u,
)

public data class NetworkOpenEcpContextV0(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var anonymous: NetworkOpenEcpContextV00 = NetworkOpenEcpContextV00(),
)

public data class NetworkOpenEcpContextV00(public var input: NetworkOpenEcpContextV000 = NetworkOpenEcpContextV000(), public var out: NetworkOpenEcpContextV001 = NetworkOpenEcpContextV001())

public data class NetworkOpenEcpContextV000(public var location: NetworkOpenLocationQualifier = 0, public var integrity: NetworkOpenIntegrityQualifier = 0)

public data class NetworkOpenEcpContextV001(public var location: NetworkOpenLocationQualifier = 0, public var integrity: NetworkOpenIntegrityQualifier = 0)

public data class NfsOpenEcpContext(public var exportAlias: UnicodeString? = null, public var clientSocketAddress: SockaddrStorage? = null)

public data class Nlstableinfo(
    public var oemTableInfo: Cptableinfo = Cptableinfo(),
    public var ansiTableInfo: Cptableinfo = Cptableinfo(),
    public var upperCaseTable: UShort? = null,
    public var lowerCaseTable: UShort? = null,
)

public data class OpenReparseList(public var openReparseList: ListEntry = ListEntry())

public data class OpenReparseListEntry(
    public var openReparseListEntry: ListEntry = ListEntry(),
    public var reparseTag: UInt = 0u,
    public var flags: UInt = 0u,
    public var reparseGuid: Guid = Guid(),
    public var size: UShort = 0u,
    public var remainingLength: UShort = 0u,
)

public data class OplockKeyContext(
    public var version: UShort = 0u,
    public var flags: UShort = 0u,
    public var parentOplockKey: Guid = Guid(),
    public var targetOplockKey: Guid = Guid(),
    public var reserved: UInt = 0u,
)

public data class OplockKeyEcpContext(public var oplockKey: Guid = Guid(), public var reserved: UInt = 0u)

public data class OplockNotifyParams(
    public var notifyReason: OplockNotifyReason = 0,
    public var notifyContext: COpaquePointer? = null,
    public var irp: Irp? = null,
    public var status: Ntstatus = 0,
)

public data class PhysicalExtentsDescriptor(
    public var numberOfRuns: UInt = 0u,
    public var numberOfValidRuns: UInt = 0u,
    public var run: List<PhysicalMemoryRun> = List(1) { PhysicalMemoryRun() },
)

public data class PhysicalMemoryDescriptor(
    public var numberOfRuns: UInt = 0u,
    public var numberOfPages: UInt = 0u,
    public var run: List<PhysicalMemoryRun> = List(1) { PhysicalMemoryRun() },
)

public data class PhysicalMemoryRun(public var basePage: UInt = 0u, public var pageCount: UInt = 0u)

public data class PrefetchOpenEcpContext(public var context: COpaquePointer? = null)

public data class PrefixTable(
    public var nodeTypeCode: Short = 0,
    public var nameLength: Short = 0,
    public var nextPrefixTree: PrefixTableEntry? = null,
)

public data class PrefixTableEntry(
    public var nodeTypeCode: Short = 0,
    public var nameLength: Short = 0,
    public var nextPrefixTree: PrefixTableEntry? = null,
    public var links: RtlSplayLinks = RtlSplayLinks(),
    public var prefix: String? = null,
)

public data class PublicBcb(
    public var nodeTypeCode: Short = 0,
    public var nodeByteSize: Short = 0,
    public var mappedLength: UInt = 0u,
    public var mappedFileOffset: Long = 0L,
)

public data class QueryBadRangesInput(
    public var flags: UInt = 0u,
    public var numRanges: UInt = 0u,
    public var ranges: List<QueryBadRangesInputRange> = List(1) { QueryBadRangesInputRange() },
)

public data class QueryDirectAccessExtents(
    public var fileOffset: Long = 0L,
    public var length: Long = 0L,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class QueryOnCreateEaInformation(public var eaBufferSize: UInt = 0u, public var eaBuffer: FileFullEaInformation? = null)

public data class QueryOnCreateEcpContext(
    public var requestedClasses: UInt = 0u,
    public var classesProcessed: UInt = 0u,
    public var classesWithErrors: UInt = 0u,
    public var classesWithNoData: UInt = 0u,
    public var statInformation: QueryOnCreateFileStatInformation = QueryOnCreateFileStatInformation(),
    public var lxInformation: QueryOnCreateFileLxInformation = QueryOnCreateFileLxInformation(),
    public var eaInformation: QueryOnCreateEaInformation = QueryOnCreateEaInformation(),
)

public data class QueryOnCreateFileLxInformation(
    public var effectiveAccess: UInt = 0u,
    public var lxFlags: UInt = 0u,
    public var lxUid: UInt = 0u,
    public var lxGid: UInt = 0u,
    public var lxMode: UInt = 0u,
    public var lxDeviceIdMajor: UInt = 0u,
    public var lxDeviceIdMinor: UInt = 0u,
)

public data class QueryOnCreateFileStatInformation(
    public var fileId: Long = 0L,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var reparseTag: UInt = 0u,
    public var numberOfLinks: UInt = 0u,
)

public data class QueryPathRequest(
    public var pathNameLength: UInt = 0u,
    public var securityContext: IoSecurityContext? = null,
    public var filePathName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QueryPathRequest) return false
        if (this.pathNameLength != other.pathNameLength) return false
        if (this.securityContext != other.securityContext) return false
        if (!this.filePathName.contentEquals(other.filePathName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pathNameLength.hashCode()
        result = 31 * result + this.securityContext.hashCode()
        result = 31 * result + this.filePathName.contentHashCode()
        return result
    }
}

public data class QueryPathRequestEx(
    public var pSecurityContext: IoSecurityContext? = null,
    public var eaLength: UInt = 0u,
    public var pEaBuffer: COpaquePointer? = null,
    public var pathName: UnicodeString = UnicodeString(),
    public var domainServiceName: UnicodeString = UnicodeString(),
    public var ecpList: EcpList? = null,
    public var silo: Pesilo = 0L,
    public var reserved: Int = 0,
)

public data class QueryPathResponse(public var lengthAccepted: UInt = 0u)

public data class ReadAheadParameters(
    public var nodeByteSize: Short = 0,
    public var granularity: UInt = 0u,
    public var pipelinedRequestSize: UInt = 0u,
    public var readAheadGrowthPercentage: UInt = 0u,
)

public data class ReadList(
    public var fileObject: FileObject? = null,
    public var numberOfEntries: UInt = 0u,
    public var isImage: UInt = 0u,
    public var list: List<FileSegmentElement> = List(1) { FileSegmentElement() },
)

public data class ReadUsnJournalData(
    public var startUsn: Long = 0L,
    public var reasonMask: UInt = 0u,
    public var returnOnlyOnClose: UInt = 0u,
    public var timeout: ULong = 0uL,
    public var bytesToWaitFor: ULong = 0uL,
    public var usnJournalID: ULong = 0uL,
    public var minMajorVersion: UShort = 0u,
    public var maxMajorVersion: UShort = 0u,
)

public data class RefsDeallocateRangesInputBuffer(public var rangeCount: UInt = 0u, public var ranges: List<RefsDeallocateRangesRange> = List(1) { RefsDeallocateRangesRange() })

public data class RefsDeallocateRangesInputBufferEx(
    public var rangeCount: UInt = 0u,
    public var allocator: RefsDeallocateRangesAllocator = 0,
    public var streamReserveUpdateCount: Long = 0L,
    public var offsetToRanges: UInt = 0u,
    public var offsetToLeakCounts: UInt = 0u,
    public var reserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsDeallocateRangesInputBufferEx) return false
        if (this.rangeCount != other.rangeCount) return false
        if (this.allocator != other.allocator) return false
        if (this.streamReserveUpdateCount != other.streamReserveUpdateCount) return false
        if (this.offsetToRanges != other.offsetToRanges) return false
        if (this.offsetToLeakCounts != other.offsetToLeakCounts) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rangeCount.hashCode()
        result = 31 * result + this.allocator.hashCode()
        result = 31 * result + this.streamReserveUpdateCount.hashCode()
        result = 31 * result + this.offsetToRanges.hashCode()
        result = 31 * result + this.offsetToLeakCounts.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RefsDeallocateRangesRange(public var startOfRange: ULong = 0uL, public var countOfRange: ULong = 0uL)

public data class RefsQueryVolumeCompressionInfoOutputBuffer(
    public var defaultCompressionFormat: RefsCompressionFormats = 0,
    public var defaultCompressionLevel: Short = 0,
    public var defaultCompressionChunkSizeBytes: UInt = 0u,
    public var volumeClusterSizeBytes: UInt = 0u,
    public var totalVolumeClusters: ULong = 0uL,
    public var totalAllocatedClusters: ULong = 0uL,
    public var totalCompressibleClustersAllocated: ULong = 0uL,
    public var totalCompressibleClustersInUse: ULong = 0uL,
    public var totalCompressedClusters: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsQueryVolumeCompressionInfoOutputBuffer) return false
        if (this.defaultCompressionFormat != other.defaultCompressionFormat) return false
        if (this.defaultCompressionLevel != other.defaultCompressionLevel) return false
        if (this.defaultCompressionChunkSizeBytes != other.defaultCompressionChunkSizeBytes) return false
        if (this.volumeClusterSizeBytes != other.volumeClusterSizeBytes) return false
        if (this.totalVolumeClusters != other.totalVolumeClusters) return false
        if (this.totalAllocatedClusters != other.totalAllocatedClusters) return false
        if (this.totalCompressibleClustersAllocated != other.totalCompressibleClustersAllocated) return false
        if (this.totalCompressibleClustersInUse != other.totalCompressibleClustersInUse) return false
        if (this.totalCompressedClusters != other.totalCompressedClusters) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.defaultCompressionFormat.hashCode()
        result = 31 * result + this.defaultCompressionLevel.hashCode()
        result = 31 * result + this.defaultCompressionChunkSizeBytes.hashCode()
        result = 31 * result + this.volumeClusterSizeBytes.hashCode()
        result = 31 * result + this.totalVolumeClusters.hashCode()
        result = 31 * result + this.totalAllocatedClusters.hashCode()
        result = 31 * result + this.totalCompressibleClustersAllocated.hashCode()
        result = 31 * result + this.totalCompressibleClustersInUse.hashCode()
        result = 31 * result + this.totalCompressedClusters.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RefsQueryVolumeDedupInfoOutputBuffer(public var enabled: Boolean = false)

public data class RefsRemoveHardlinkBackpointer(
    public var parentDirectory: ULong = 0uL,
    public var reserved: ULong = 0uL,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsRemoveHardlinkBackpointer) return false
        if (this.parentDirectory != other.parentDirectory) return false
        if (this.reserved != other.reserved) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parentDirectory.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class RefsSetVolumeCompressionInfoInputBuffer(
    public var compressionFormat: RefsCompressionFormats = 0,
    public var compressionLevel: Short = 0,
    public var compressionChunkSizeBytes: UInt = 0u,
    public var flags: RefsSetVolumeCompressionInfoFlags = 0,
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsSetVolumeCompressionInfoInputBuffer) return false
        if (this.compressionFormat != other.compressionFormat) return false
        if (this.compressionLevel != other.compressionLevel) return false
        if (this.compressionChunkSizeBytes != other.compressionChunkSizeBytes) return false
        if (this.flags != other.flags) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compressionFormat.hashCode()
        result = 31 * result + this.compressionLevel.hashCode()
        result = 31 * result + this.compressionChunkSizeBytes.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RefsSetVolumeDedupInfoInputBuffer(public var enable: Boolean = false)

public data class RefsStreamExtent(
    public var vcn: Long = 0L,
    public var lcn: Long = 0L,
    public var length: Long = 0L,
    public var properties: UShort = 0u,
)

public data class RefsStreamSnapshotListOutputBuffer(
    public var entryCount: UInt = 0u,
    public var bufferSizeRequiredForQuery: UInt = 0u,
    public var reserved: UIntArray = UIntArray(2),
    public var entries: List<RefsStreamSnapshotListOutputBufferEntry> = List(1) { RefsStreamSnapshotListOutputBufferEntry() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsStreamSnapshotListOutputBuffer) return false
        if (this.entryCount != other.entryCount) return false
        if (this.bufferSizeRequiredForQuery != other.bufferSizeRequiredForQuery) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.entries != other.entries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entryCount.hashCode()
        result = 31 * result + this.bufferSizeRequiredForQuery.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.entries.hashCode()
        return result
    }
}

public data class RefsStreamSnapshotListOutputBufferEntry(
    public var nextEntryOffset: UInt = 0u,
    public var snapshotNameLength: UShort = 0u,
    public var snapshotCreationTime: ULong = 0uL,
    public var streamSize: ULong = 0uL,
    public var streamAllocationSize: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(2),
    public var snapshotName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsStreamSnapshotListOutputBufferEntry) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.snapshotNameLength != other.snapshotNameLength) return false
        if (this.snapshotCreationTime != other.snapshotCreationTime) return false
        if (this.streamSize != other.streamSize) return false
        if (this.streamAllocationSize != other.streamAllocationSize) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.snapshotName.contentEquals(other.snapshotName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.snapshotNameLength.hashCode()
        result = 31 * result + this.snapshotCreationTime.hashCode()
        result = 31 * result + this.streamSize.hashCode()
        result = 31 * result + this.streamAllocationSize.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.snapshotName.contentHashCode()
        return result
    }
}

public data class RefsStreamSnapshotManagementInputBuffer(
    public var operation: RefsStreamSnapshotOperation = 0,
    public var snapshotNameLength: UShort = 0u,
    public var operationInputBufferLength: UShort = 0u,
    public var reserved: ULongArray = ULongArray(2),
    public var nameAndInputBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsStreamSnapshotManagementInputBuffer) return false
        if (this.operation != other.operation) return false
        if (this.snapshotNameLength != other.snapshotNameLength) return false
        if (this.operationInputBufferLength != other.operationInputBufferLength) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.nameAndInputBuffer.contentEquals(other.nameAndInputBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operation.hashCode()
        result = 31 * result + this.snapshotNameLength.hashCode()
        result = 31 * result + this.operationInputBufferLength.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.nameAndInputBuffer.contentHashCode()
        return result
    }
}

public data class RefsStreamSnapshotQueryDeltasInputBuffer(
    public var startingVcn: Long = 0L,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class RefsStreamSnapshotQueryDeltasOutputBuffer(
    public var extentCount: UInt = 0u,
    public var reserved: UIntArray = UIntArray(2),
    public var extents: List<RefsStreamExtent> = List(1) { RefsStreamExtent() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsStreamSnapshotQueryDeltasOutputBuffer) return false
        if (this.extentCount != other.extentCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.extents != other.extents) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extentCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.extents.hashCode()
        return result
    }
}

public data class RefsVolumeCounterInfoInputBuffer(public var resetCounters: Boolean = false)

public data class RefsVolumeDataBuffer(
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
    public var reserved: LongArray = LongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsVolumeDataBuffer) return false
        if (this.byteCount != other.byteCount) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.bytesPerPhysicalSector != other.bytesPerPhysicalSector) return false
        if (this.volumeSerialNumber != other.volumeSerialNumber) return false
        if (this.numberSectors != other.numberSectors) return false
        if (this.totalClusters != other.totalClusters) return false
        if (this.freeClusters != other.freeClusters) return false
        if (this.totalReserved != other.totalReserved) return false
        if (this.bytesPerSector != other.bytesPerSector) return false
        if (this.bytesPerCluster != other.bytesPerCluster) return false
        if (this.maximumSizeOfResidentFile != other.maximumSizeOfResidentFile) return false
        if (this.fastTierDataFillRatio != other.fastTierDataFillRatio) return false
        if (this.slowTierDataFillRatio != other.slowTierDataFillRatio) return false
        if (this.destagesFastTierToSlowTierRate != other.destagesFastTierToSlowTierRate) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byteCount.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.bytesPerPhysicalSector.hashCode()
        result = 31 * result + this.volumeSerialNumber.hashCode()
        result = 31 * result + this.numberSectors.hashCode()
        result = 31 * result + this.totalClusters.hashCode()
        result = 31 * result + this.freeClusters.hashCode()
        result = 31 * result + this.totalReserved.hashCode()
        result = 31 * result + this.bytesPerSector.hashCode()
        result = 31 * result + this.bytesPerCluster.hashCode()
        result = 31 * result + this.maximumSizeOfResidentFile.hashCode()
        result = 31 * result + this.fastTierDataFillRatio.hashCode()
        result = 31 * result + this.slowTierDataFillRatio.hashCode()
        result = 31 * result + this.destagesFastTierToSlowTierRate.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RemoteLinkTrackingInformation(
    public var targetFileObject: COpaquePointer? = null,
    public var targetLinkTrackingInformationLength: UInt = 0u,
    public var targetLinkTrackingInformationBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemoteLinkTrackingInformation) return false
        if (this.targetFileObject != other.targetFileObject) return false
        if (this.targetLinkTrackingInformationLength != other.targetLinkTrackingInformationLength) return false
        if (!this.targetLinkTrackingInformationBuffer.contentEquals(other.targetLinkTrackingInformationBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetFileObject.hashCode()
        result = 31 * result + this.targetLinkTrackingInformationLength.hashCode()
        result = 31 * result + this.targetLinkTrackingInformationBuffer.contentHashCode()
        return result
    }
}

public data class ReparseDataBuffer(
    public var reparseTag: UInt = 0u,
    public var reparseDataLength: UShort = 0u,
    public var reserved: UShort = 0u,
    public var anonymous: ReparseDataBuffer0 = ReparseDataBuffer0(),
)

public data class ReparseDataBuffer0(
    public var symbolicLinkReparseBuffer: ReparseDataBuffer00 = ReparseDataBuffer00(),
    public var mountPointReparseBuffer: ReparseDataBuffer01 = ReparseDataBuffer01(),
    public var genericReparseBuffer: ReparseDataBuffer02 = ReparseDataBuffer02(),
)

public data class ReparseDataBuffer02(public var dataBuffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReparseDataBuffer02) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.dataBuffer.contentHashCode()
    }
}

public data class ReparseDataBuffer01(
    public var substituteNameOffset: UShort = 0u,
    public var substituteNameLength: UShort = 0u,
    public var printNameOffset: UShort = 0u,
    public var printNameLength: UShort = 0u,
    public var pathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReparseDataBuffer01) return false
        if (this.substituteNameOffset != other.substituteNameOffset) return false
        if (this.substituteNameLength != other.substituteNameLength) return false
        if (this.printNameOffset != other.printNameOffset) return false
        if (this.printNameLength != other.printNameLength) return false
        if (!this.pathBuffer.contentEquals(other.pathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.substituteNameOffset.hashCode()
        result = 31 * result + this.substituteNameLength.hashCode()
        result = 31 * result + this.printNameOffset.hashCode()
        result = 31 * result + this.printNameLength.hashCode()
        result = 31 * result + this.pathBuffer.contentHashCode()
        return result
    }
}

public data class ReparseDataBuffer00(
    public var substituteNameOffset: UShort = 0u,
    public var substituteNameLength: UShort = 0u,
    public var printNameOffset: UShort = 0u,
    public var printNameLength: UShort = 0u,
    public var flags: UInt = 0u,
    public var pathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReparseDataBuffer00) return false
        if (this.substituteNameOffset != other.substituteNameOffset) return false
        if (this.substituteNameLength != other.substituteNameLength) return false
        if (this.printNameOffset != other.printNameOffset) return false
        if (this.printNameLength != other.printNameLength) return false
        if (this.flags != other.flags) return false
        if (!this.pathBuffer.contentEquals(other.pathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.substituteNameOffset.hashCode()
        result = 31 * result + this.substituteNameLength.hashCode()
        result = 31 * result + this.printNameOffset.hashCode()
        result = 31 * result + this.printNameLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pathBuffer.contentHashCode()
        return result
    }
}

public data class ReparseDataBufferEx(
    public var flags: UInt = 0u,
    public var existingReparseTag: UInt = 0u,
    public var existingReparseGuid: Guid = Guid(),
    public var reserved: ULong = 0uL,
    public var anonymous: ReparseDataBufferEx0 = ReparseDataBufferEx0(),
)

public data class ReparseDataBufferEx0(public var reparseDataBuffer: ReparseDataBuffer = ReparseDataBuffer(), public var reparseGuidDataBuffer: ReparseGuidDataBuffer = ReparseGuidDataBuffer())

public data class ReparseIndexKey(public var fileReparseTag: UInt = 0u, public var fileId: Long = 0L)

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

public data class RkfBypassEcpContext(public var reserved: Int = 0, public var version: Int = 0)

public data class RtlHeapMemoryLimitData(
    public var commitLimitBytes: Int = 0,
    public var commitLimitFailureCode: Int = 0,
    public var maxAllocationSizeBytes: Int = 0,
    public var allocationLimitFailureCode: Int = 0,
)

public data class RtlHeapMemoryLimitInfo(public var version: UInt = 0u, public var data: RtlHeapMemoryLimitData = RtlHeapMemoryLimitData())

public data class RtlHeapParameters(
    public var length: UInt = 0u,
    public var segmentReserve: Int = 0,
    public var segmentCommit: Int = 0,
    public var deCommitFreeBlockThreshold: Int = 0,
    public var deCommitTotalFreeThreshold: Int = 0,
    public var maximumAllocationSize: Int = 0,
    public var virtualMemoryThreshold: Int = 0,
    public var initialCommit: Int = 0,
    public var initialReserve: Int = 0,
    public var commitRoutine: PrtlHeapCommitRoutine = null,
    public var reserved: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlHeapParameters) return false
        if (this.length != other.length) return false
        if (this.segmentReserve != other.segmentReserve) return false
        if (this.segmentCommit != other.segmentCommit) return false
        if (this.deCommitFreeBlockThreshold != other.deCommitFreeBlockThreshold) return false
        if (this.deCommitTotalFreeThreshold != other.deCommitTotalFreeThreshold) return false
        if (this.maximumAllocationSize != other.maximumAllocationSize) return false
        if (this.virtualMemoryThreshold != other.virtualMemoryThreshold) return false
        if (this.initialCommit != other.initialCommit) return false
        if (this.initialReserve != other.initialReserve) return false
        if (this.commitRoutine != other.commitRoutine) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.segmentReserve.hashCode()
        result = 31 * result + this.segmentCommit.hashCode()
        result = 31 * result + this.deCommitFreeBlockThreshold.hashCode()
        result = 31 * result + this.deCommitTotalFreeThreshold.hashCode()
        result = 31 * result + this.maximumAllocationSize.hashCode()
        result = 31 * result + this.virtualMemoryThreshold.hashCode()
        result = 31 * result + this.initialCommit.hashCode()
        result = 31 * result + this.initialReserve.hashCode()
        result = 31 * result + this.commitRoutine.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RtlNlsState(
    public var defaultAcpTableInfo: Cptableinfo = Cptableinfo(),
    public var defaultOemTableInfo: Cptableinfo = Cptableinfo(),
    public var activeCodePageData: UShort? = null,
    public var oemCodePageData: UShort? = null,
    public var leadByteInfo: UShort? = null,
    public var oemLeadByteInfo: UShort? = null,
    public var caseMappingData: UShort? = null,
    public var unicodeUpcaseTable844: UShort? = null,
    public var unicodeLowercaseTable844: UShort? = null,
)

public data class RtlSegmentHeapMemorySource(
    public var flags: UInt = 0u,
    public var memoryTypeMask: UInt = 0u,
    public var numaNode: UInt = 0u,
    public var anonymous: RtlSegmentHeapMemorySource0 = RtlSegmentHeapMemorySource0(),
    public var reserved: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlSegmentHeapMemorySource) return false
        if (this.flags != other.flags) return false
        if (this.memoryTypeMask != other.memoryTypeMask) return false
        if (this.numaNode != other.numaNode) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.memoryTypeMask.hashCode()
        result = 31 * result + this.numaNode.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RtlSegmentHeapMemorySource0(public var partitionHandle: Handle = null, public var callbacks: RtlSegmentHeapVaCallbacks? = null)

public data class RtlSegmentHeapParameters(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var flags: UInt = 0u,
    public var memorySource: RtlSegmentHeapMemorySource = RtlSegmentHeapMemorySource(),
    public var reserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlSegmentHeapParameters) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.memorySource != other.memorySource) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.memorySource.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RtlSegmentHeapVaCallbacks(
    public var callbackContext: Handle = null,
    public var allocateVirtualMemory: PallocateVirtualMemoryExCallback = null,
    public var freeVirtualMemory: PfreeVirtualMemoryExCallback = null,
    public var queryVirtualMemory: PqueryVirtualMemoryCallback = null,
)

public data class SecurityClientContext(
    public var securityQos: SecurityQualityOfService = SecurityQualityOfService(),
    public var clientToken: COpaquePointer? = null,
    public var directlyAccessClientToken: Boolean = false,
    public var directAccessEffectiveOnly: Boolean = false,
    public var serverIsRemote: Boolean = false,
    public var clientTokenControl: TokenControl = TokenControl(),
)

public data class SecApplicationProtocols(public var protocolListsSize: UInt = 0u, public var protocolLists: List<SecApplicationProtocolList> = List(1) { SecApplicationProtocolList() })

public data class SecDtlsMtu(public var pathMTU: UShort = 0u)
