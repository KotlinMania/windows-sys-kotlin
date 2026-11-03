@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.core.GUID

public data class ACE_HEADER(
    public var AceType: UByte = 0u,
    public var AceFlags: UByte = 0u,
    public var AceSize: UShort = 0u,
)

public class ATOMIC_CREATE_ECP_CONTEXT(
    public var Size: UShort = 0u,
    public var InFlags: UShort = 0u,
    public var OutFlags: UShort = 0u,
    public var ReparseBufferLength: UShort = 0u,
    public var ReparseBuffer: Long = 0L,
    public var FileSize: Long = 0L,
    public var ValidDataLength: Long = 0L,
    public var FileTimestamps: Long = 0L,
    public var FileAttributes: UInt = 0u,
    public var UsnSourceInfo: UInt = 0u,
    public var Usn: Long = 0L,
    public var SuppressFileAttributeInheritanceMask: UInt = 0u,
    public var InOpFlags: UInt = 0u,
    public var OutOpFlags: UInt = 0u,
    public var InGenFlags: UInt = 0u,
    public var OutGenFlags: UInt = 0u,
    public var CaseSensitiveFlagsMask: UInt = 0u,
    public var InCaseSensitiveFlags: UInt = 0u,
    public var OutCaseSensitiveFlags: UInt = 0u,
)

public data class BASE_MCB(
    public var MaximumPairCount: UInt = 0u,
    public var PairCount: UInt = 0u,
    public var PoolType: UShort = 0u,
    public var Flags: UShort = 0u,
    public var Mapping: Long = 0L,
)

public data class BOOT_AREA_INFO(public var BootSectorCount: UInt = 0u, public var BootSectors: List<BOOT_AREA_INFO_0> = List(2) { BOOT_AREA_INFO_0() })

public data class BOOT_AREA_INFO_0(public var Offset: Long = 0L)

public data class CACHE_MANAGER_CALLBACKS(
    public var AcquireForLazyWrite: PACQUIRE_FOR_LAZY_WRITE = null,
    public var ReleaseFromLazyWrite: PRELEASE_FROM_LAZY_WRITE = null,
    public var AcquireForReadAhead: PACQUIRE_FOR_READ_AHEAD = null,
    public var ReleaseFromReadAhead: PRELEASE_FROM_READ_AHEAD = null,
)

public data class CACHE_MANAGER_CALLBACKS_EX(
    public var Version: UShort = 0u,
    public var Size: UShort = 0u,
    public var Functions: CACHE_MANAGER_CALLBACK_FUNCTIONS = CACHE_MANAGER_CALLBACK_FUNCTIONS(),
)

public data class CACHE_MANAGER_CALLBACK_FUNCTIONS(
    public var AcquireForLazyWriteEx: PACQUIRE_FOR_LAZY_WRITE_EX = null,
    public var ReleaseFromLazyWrite: PRELEASE_FROM_LAZY_WRITE = null,
    public var AcquireForReadAhead: PACQUIRE_FOR_READ_AHEAD = null,
    public var ReleaseFromReadAhead: PRELEASE_FROM_READ_AHEAD = null,
)

public data class CACHE_UNINITIALIZE_EVENT(public var Next: Long = 0L, public var Event: Foundation.KEVENT = Foundation.KEVENT())

public data class CC_ASYNC_READ_CONTEXT(
    public var CompletionRoutine: PASYNC_READ_COMPLETION_CALLBACK = null,
    public var Context: Long = 0L,
    public var Mdl: Long = 0L,
    public var RequestorMode: Byte = 0,
    public var NestingLevel: UInt = 0u,
)

public data class CC_ERROR_CALLBACK_CONTEXT(public var NodeByteSize: Short = 0, public var ErrorCode: Win32.Foundation.NTSTATUS = Win32.Foundation.NTSTATUS())

public data class CC_FILE_SIZES(
    public var AllocationSize: Long = 0L,
    public var FileSize: Long = 0L,
    public var ValidDataLength: Long = 0L,
)

public data class COMPRESSED_DATA_INFO(
    public var CompressionFormatAndEngine: UShort = 0u,
    public var CompressionUnitShift: UByte = 0u,
    public var ChunkShift: UByte = 0u,
    public var ClusterShift: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var NumberOfChunks: UShort = 0u,
    public var CompressedChunkSizes: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is COMPRESSED_DATA_INFO) return false
        if (this.CompressionFormatAndEngine != other.CompressionFormatAndEngine) return false
        if (this.CompressionUnitShift != other.CompressionUnitShift) return false
        if (this.ChunkShift != other.ChunkShift) return false
        if (this.ClusterShift != other.ClusterShift) return false
        if (this.Reserved != other.Reserved) return false
        if (this.NumberOfChunks != other.NumberOfChunks) return false
        if (!this.CompressedChunkSizes.contentEquals(other.CompressedChunkSizes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CompressionFormatAndEngine.hashCode()
        result = 31 * result + this.CompressionUnitShift.hashCode()
        result = 31 * result + this.ChunkShift.hashCode()
        result = 31 * result + this.ClusterShift.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.NumberOfChunks.hashCode()
        result = 31 * result + this.CompressedChunkSizes.contentHashCode()
        return result
    }
}

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

public data class COPY_INFORMATION(public var SourceFileObject: Long = 0L, public var SourceFileOffset: Long = 0L)

public data class CPTABLEINFO(
    public var CodePage: UShort = 0u,
    public var MaximumCharacterSize: UShort = 0u,
    public var DefaultChar: UShort = 0u,
    public var UniDefaultChar: UShort = 0u,
    public var TransDefaultChar: UShort = 0u,
    public var TransUniDefaultChar: UShort = 0u,
    public var DBCSCodePage: UShort = 0u,
    public var LeadByte: UByteArray = UByteArray(12),
    public var MultiByteTable: Long = 0L,
    public var WideCharTable: Long = 0L,
    public var DBCSRanges: Long = 0L,
    public var DBCSOffsets: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CPTABLEINFO) return false
        if (this.CodePage != other.CodePage) return false
        if (this.MaximumCharacterSize != other.MaximumCharacterSize) return false
        if (this.DefaultChar != other.DefaultChar) return false
        if (this.UniDefaultChar != other.UniDefaultChar) return false
        if (this.TransDefaultChar != other.TransDefaultChar) return false
        if (this.TransUniDefaultChar != other.TransUniDefaultChar) return false
        if (this.DBCSCodePage != other.DBCSCodePage) return false
        if (!this.LeadByte.contentEquals(other.LeadByte)) return false
        if (this.MultiByteTable != other.MultiByteTable) return false
        if (this.WideCharTable != other.WideCharTable) return false
        if (this.DBCSRanges != other.DBCSRanges) return false
        if (this.DBCSOffsets != other.DBCSOffsets) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CodePage.hashCode()
        result = 31 * result + this.MaximumCharacterSize.hashCode()
        result = 31 * result + this.DefaultChar.hashCode()
        result = 31 * result + this.UniDefaultChar.hashCode()
        result = 31 * result + this.TransDefaultChar.hashCode()
        result = 31 * result + this.TransUniDefaultChar.hashCode()
        result = 31 * result + this.DBCSCodePage.hashCode()
        result = 31 * result + this.LeadByte.contentHashCode()
        result = 31 * result + this.MultiByteTable.hashCode()
        result = 31 * result + this.WideCharTable.hashCode()
        result = 31 * result + this.DBCSRanges.hashCode()
        result = 31 * result + this.DBCSOffsets.hashCode()
        return result
    }
}

public data class CREATE_REDIRECTION_ECP_CONTEXT(
    public var Size: UShort = 0u,
    public var Flags: UShort = 0u,
    public var FileId: Win32.Storage.FileSystem.FILE_ID_128 = Win32.Storage.FileSystem.FILE_ID_128(),
    public var VolumeGuid: GUID = GUID(),
)

public data class CREATE_USN_JOURNAL_DATA(public var MaximumSize: ULong = 0uL, public var AllocationDelta: ULong = 0uL)

public data class CSV_DOWN_LEVEL_OPEN_ECP_CONTEXT(
    public var Version: UInt = 0u,
    public var IsResume: Boolean = false,
    public var FileType: CSV_DOWN_LEVEL_FILE_TYPE = 0,
    public var SourceNodeId: UInt = 0u,
    public var DestinationNodeId: UInt = 0u,
)

public data class CSV_QUERY_FILE_REVISION_ECP_CONTEXT(public var FileId: Long = 0L, public var FileRevision: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CSV_QUERY_FILE_REVISION_ECP_CONTEXT) return false
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

public data class CSV_QUERY_FILE_REVISION_ECP_CONTEXT_FILE_ID_128(public var FileId: Win32.Storage.FileSystem.FILE_ID_128 = Win32.Storage.FileSystem.FILE_ID_128(), public var FileRevision: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CSV_QUERY_FILE_REVISION_ECP_CONTEXT_FILE_ID_128) return false
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

public data class CSV_SET_HANDLE_PROPERTIES_ECP_CONTEXT(
    public var Size: ULong = 0uL,
    public var PauseTimeoutInSeconds: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class DUAL_OPLOCK_KEY_ECP_CONTEXT(
    public var ParentOplockKey: GUID = GUID(),
    public var TargetOplockKey: GUID = GUID(),
    public var ParentOplockKeySet: Boolean = false,
    public var TargetOplockKeySet: Boolean = false,
)

public data class DUPLICATE_CLUSTER_DATA(
    public var SourceLcn: Long = 0L,
    public var TargetFileOffset: Long = 0L,
    public var DuplicationLimit: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class ECP_OPEN_PARAMETERS(
    public var Size: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Flags: UInt = 0u,
)

public data class EOF_WAIT_BLOCK(public var EofWaitLinks: Win32.System.Kernel.LIST_ENTRY = Win32.System.Kernel.LIST_ENTRY(), public var Event: Foundation.KEVENT = Foundation.KEVENT())

public data class EXTENT_READ_CACHE_INFO_BUFFER(
    public var AllocatedCache: Long = 0L,
    public var PopulatedCache: Long = 0L,
    public var InErrorCache: Long = 0L,
)

public data class FILE_ACCESS_INFORMATION(public var AccessFlags: UInt = 0u)

public data class FILE_ALIGNMENT_INFORMATION(public var AlignmentRequirement: UInt = 0u)

public data class FILE_ALLOCATION_INFORMATION(public var AllocationSize: Long = 0L)

public data class FILE_ALL_INFORMATION(
    public var BasicInformation: FILE_BASIC_INFORMATION = FILE_BASIC_INFORMATION(),
    public var StandardInformation: FILE_STANDARD_INFORMATION = FILE_STANDARD_INFORMATION(),
    public var InternalInformation: FILE_INTERNAL_INFORMATION = FILE_INTERNAL_INFORMATION(),
    public var EaInformation: FILE_EA_INFORMATION = FILE_EA_INFORMATION(),
    public var AccessInformation: FILE_ACCESS_INFORMATION = FILE_ACCESS_INFORMATION(),
    public var PositionInformation: FILE_POSITION_INFORMATION = FILE_POSITION_INFORMATION(),
    public var ModeInformation: FILE_MODE_INFORMATION = FILE_MODE_INFORMATION(),
    public var AlignmentInformation: FILE_ALIGNMENT_INFORMATION = FILE_ALIGNMENT_INFORMATION(),
    public var NameInformation: FILE_NAME_INFORMATION = FILE_NAME_INFORMATION(),
)

public data class FILE_BASIC_INFORMATION(
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var FileAttributes: UInt = 0u,
)

public data class FILE_BOTH_DIR_INFORMATION(
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
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_BOTH_DIR_INFORMATION) return false
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
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_CASE_SENSITIVE_INFORMATION(public var Flags: UInt = 0u)

public data class FILE_COMPLETION_INFORMATION(public var Port: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(), public var Key: Long = 0L)

public data class FILE_COMPRESSION_INFORMATION(
    public var CompressedFileSize: Long = 0L,
    public var CompressionFormat: UShort = 0u,
    public var CompressionUnitShift: UByte = 0u,
    public var ChunkShift: UByte = 0u,
    public var ClusterShift: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_COMPRESSION_INFORMATION) return false
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

public data class FILE_DIRECTORY_INFORMATION(
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
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_DIRECTORY_INFORMATION) return false
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
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_DISPOSITION_INFORMATION(public var DeleteFile: Boolean = false)

public data class FILE_DISPOSITION_INFORMATION_EX(public var Flags: FILE_DISPOSITION_INFORMATION_EX_FLAGS = 0u)

public data class FILE_EA_INFORMATION(public var EaSize: UInt = 0u)

public data class FILE_END_OF_FILE_INFORMATION_EX(
    public var EndOfFile: Long = 0L,
    public var PagingFileSizeInMM: Long = 0L,
    public var PagingFileMaxSize: Long = 0L,
    public var Flags: UInt = 0u,
)

public data class FILE_FS_ATTRIBUTE_INFORMATION(
    public var FileSystemAttributes: UInt = 0u,
    public var MaximumComponentNameLength: Int = 0,
    public var FileSystemNameLength: UInt = 0u,
    public var FileSystemName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_FS_ATTRIBUTE_INFORMATION) return false
        if (this.FileSystemAttributes != other.FileSystemAttributes) return false
        if (this.MaximumComponentNameLength != other.MaximumComponentNameLength) return false
        if (this.FileSystemNameLength != other.FileSystemNameLength) return false
        if (!this.FileSystemName.contentEquals(other.FileSystemName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileSystemAttributes.hashCode()
        result = 31 * result + this.MaximumComponentNameLength.hashCode()
        result = 31 * result + this.FileSystemNameLength.hashCode()
        result = 31 * result + this.FileSystemName.contentHashCode()
        return result
    }
}

public data class FILE_FS_CONTROL_INFORMATION(
    public var FreeSpaceStartFiltering: Long = 0L,
    public var FreeSpaceThreshold: Long = 0L,
    public var FreeSpaceStopFiltering: Long = 0L,
    public var DefaultQuotaThreshold: Long = 0L,
    public var DefaultQuotaLimit: Long = 0L,
    public var FileSystemControlFlags: UInt = 0u,
)

public data class FILE_FS_DATA_COPY_INFORMATION(public var NumberOfCopies: UInt = 0u)

public data class FILE_FS_DRIVER_PATH_INFORMATION(
    public var DriverInPath: Boolean = false,
    public var DriverNameLength: UInt = 0u,
    public var DriverName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_FS_DRIVER_PATH_INFORMATION) return false
        if (this.DriverInPath != other.DriverInPath) return false
        if (this.DriverNameLength != other.DriverNameLength) return false
        if (!this.DriverName.contentEquals(other.DriverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DriverInPath.hashCode()
        result = 31 * result + this.DriverNameLength.hashCode()
        result = 31 * result + this.DriverName.contentHashCode()
        return result
    }
}

public data class FILE_FS_SECTOR_SIZE_INFORMATION(
    public var LogicalBytesPerSector: UInt = 0u,
    public var PhysicalBytesPerSectorForAtomicity: UInt = 0u,
    public var PhysicalBytesPerSectorForPerformance: UInt = 0u,
    public var FileSystemEffectivePhysicalBytesPerSectorForAtomicity: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ByteOffsetForSectorAlignment: UInt = 0u,
    public var ByteOffsetForPartitionAlignment: UInt = 0u,
)

public data class FILE_FS_VOLUME_FLAGS_INFORMATION(public var Flags: UInt = 0u)

public data class FILE_FULL_DIR_INFORMATION(
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
        if (other !is FILE_FULL_DIR_INFORMATION) return false
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

public data class FILE_FULL_EA_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var Flags: UByte = 0u,
    public var EaNameLength: UByte = 0u,
    public var EaValueLength: UShort = 0u,
    public var EaName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_FULL_EA_INFORMATION) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.Flags != other.Flags) return false
        if (this.EaNameLength != other.EaNameLength) return false
        if (this.EaValueLength != other.EaValueLength) return false
        if (!this.EaName.contentEquals(other.EaName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.EaNameLength.hashCode()
        result = 31 * result + this.EaValueLength.hashCode()
        result = 31 * result + this.EaName.contentHashCode()
        return result
    }
}

public data class FILE_GET_EA_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var EaNameLength: UByte = 0u,
    public var EaName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_GET_EA_INFORMATION) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.EaNameLength != other.EaNameLength) return false
        if (!this.EaName.contentEquals(other.EaName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.EaNameLength.hashCode()
        result = 31 * result + this.EaName.contentHashCode()
        return result
    }
}

public data class FILE_GET_QUOTA_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var SidLength: UInt = 0u,
    public var Sid: Win32.Security.SID = Win32.Security.SID(),
)

public data class FILE_ID_BOTH_DIR_INFORMATION(
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
        if (other !is FILE_ID_BOTH_DIR_INFORMATION) return false
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

public data class FILE_ID_EXTD_BOTH_DIR_INFORMATION(
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
    public var FileId: Win32.Storage.FileSystem.FILE_ID_128 = Win32.Storage.FileSystem.FILE_ID_128(),
    public var ShortNameLength: Byte = 0,
    public var ShortName: UShortArray = UShortArray(12),
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_ID_EXTD_BOTH_DIR_INFORMATION) return false
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
        if (this.ShortNameLength != other.ShortNameLength) return false
        if (!this.ShortName.contentEquals(other.ShortName)) return false
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
        result = 31 * result + this.ShortNameLength.hashCode()
        result = 31 * result + this.ShortName.contentHashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_ID_EXTD_DIR_INFORMATION(
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
    public var FileId: Win32.Storage.FileSystem.FILE_ID_128 = Win32.Storage.FileSystem.FILE_ID_128(),
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_ID_EXTD_DIR_INFORMATION) return false
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

public data class FILE_ID_FULL_DIR_INFORMATION(
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
    public var FileId: Long = 0L,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_ID_FULL_DIR_INFORMATION) return false
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
        result = 31 * result + this.FileId.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_ID_GLOBAL_TX_DIR_INFORMATION(
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
    public var FileId: Long = 0L,
    public var LockingTransactionId: GUID = GUID(),
    public var TxInfoFlags: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_ID_GLOBAL_TX_DIR_INFORMATION) return false
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
        if (this.FileId != other.FileId) return false
        if (this.LockingTransactionId != other.LockingTransactionId) return false
        if (this.TxInfoFlags != other.TxInfoFlags) return false
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
        result = 31 * result + this.FileId.hashCode()
        result = 31 * result + this.LockingTransactionId.hashCode()
        result = 31 * result + this.TxInfoFlags.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_ID_INFORMATION(public var VolumeSerialNumber: ULong = 0uL, public var FileId: Win32.Storage.FileSystem.FILE_ID_128 = Win32.Storage.FileSystem.FILE_ID_128())

public data class FILE_INFORMATION_DEFINITION(
    public var Class: FILE_INFORMATION_CLASS = 0,
    public var NextEntryOffset: UInt = 0u,
    public var FileNameLengthOffset: UInt = 0u,
    public var FileNameOffset: UInt = 0u,
)

public data class FILE_INTERNAL_INFORMATION(public var IndexNumber: Long = 0L)

public data class FILE_KNOWN_FOLDER_INFORMATION(public var Type: FILE_KNOWN_FOLDER_TYPE = 0)

public data class FILE_LINKS_FULL_ID_INFORMATION(
    public var BytesNeeded: UInt = 0u,
    public var EntriesReturned: UInt = 0u,
    public var Entry: FILE_LINK_ENTRY_FULL_ID_INFORMATION = FILE_LINK_ENTRY_FULL_ID_INFORMATION(),
)

public data class FILE_LINKS_INFORMATION(
    public var BytesNeeded: UInt = 0u,
    public var EntriesReturned: UInt = 0u,
    public var Entry: FILE_LINK_ENTRY_INFORMATION = FILE_LINK_ENTRY_INFORMATION(),
)

public data class FILE_LINK_ENTRY_FULL_ID_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var ParentFileId: Win32.Storage.FileSystem.FILE_ID_128 = Win32.Storage.FileSystem.FILE_ID_128(),
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_LINK_ENTRY_FULL_ID_INFORMATION) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.ParentFileId != other.ParentFileId) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.ParentFileId.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_LINK_ENTRY_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var ParentFileId: Long = 0L,
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_LINK_ENTRY_INFORMATION) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.ParentFileId != other.ParentFileId) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.ParentFileId.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_LINK_INFORMATION(
    public var Anonymous: FILE_LINK_INFORMATION_0 = FILE_LINK_INFORMATION_0(),
    public var RootDirectory: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(),
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_LINK_INFORMATION) return false
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

public data class FILE_LINK_INFORMATION_0(public var ReplaceIfExists: Boolean = false, public var Flags: UInt = 0u)

public data class FILE_LOCK(
    public var CompleteLockIrpRoutine: PCOMPLETE_LOCK_IRP_ROUTINE = null,
    public var UnlockRoutine: PUNLOCK_ROUTINE = null,
    public var FastIoIsQuestionable: Boolean = false,
    public var SpareC: BooleanArray = BooleanArray(3),
    public var LockInformation: Long = 0L,
    public var LastReturnedLockInfo: FILE_LOCK_INFO = FILE_LOCK_INFO(),
    public var LastReturnedLock: Long = 0L,
    public var LockRequestsInProgress: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_LOCK) return false
        if (this.CompleteLockIrpRoutine != other.CompleteLockIrpRoutine) return false
        if (this.UnlockRoutine != other.UnlockRoutine) return false
        if (this.FastIoIsQuestionable != other.FastIoIsQuestionable) return false
        if (!this.SpareC.contentEquals(other.SpareC)) return false
        if (this.LockInformation != other.LockInformation) return false
        if (this.LastReturnedLockInfo != other.LastReturnedLockInfo) return false
        if (this.LastReturnedLock != other.LastReturnedLock) return false
        if (this.LockRequestsInProgress != other.LockRequestsInProgress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CompleteLockIrpRoutine.hashCode()
        result = 31 * result + this.UnlockRoutine.hashCode()
        result = 31 * result + this.FastIoIsQuestionable.hashCode()
        result = 31 * result + this.SpareC.contentHashCode()
        result = 31 * result + this.LockInformation.hashCode()
        result = 31 * result + this.LastReturnedLockInfo.hashCode()
        result = 31 * result + this.LastReturnedLock.hashCode()
        result = 31 * result + this.LockRequestsInProgress.hashCode()
        return result
    }
}

public data class FILE_LOCK_INFO(
    public var StartingByte: Long = 0L,
    public var Length: Long = 0L,
    public var ExclusiveLock: Boolean = false,
    public var Key: UInt = 0u,
    public var FileObject: Long = 0L,
    public var ProcessId: Long = 0L,
    public var EndingByte: Long = 0L,
)

public data class FILE_MAILSLOT_QUERY_INFORMATION(
    public var MaximumMessageSize: UInt = 0u,
    public var MailslotQuota: UInt = 0u,
    public var NextMessageSize: UInt = 0u,
    public var MessagesAvailable: UInt = 0u,
    public var ReadTimeout: Long = 0L,
)

public data class FILE_MAILSLOT_SET_INFORMATION(public var ReadTimeout: Long = 0L)

public data class FILE_MODE_INFORMATION(public var Mode: UInt = 0u)

public data class FILE_MOVE_CLUSTER_INFORMATION(
    public var ClusterCount: UInt = 0u,
    public var RootDirectory: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(),
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_MOVE_CLUSTER_INFORMATION) return false
        if (this.ClusterCount != other.ClusterCount) return false
        if (this.RootDirectory != other.RootDirectory) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClusterCount.hashCode()
        result = 31 * result + this.RootDirectory.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_NAMES_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var FileIndex: UInt = 0u,
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_NAMES_INFORMATION) return false
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

public data class FILE_NAME_INFORMATION(public var FileNameLength: UInt = 0u, public var FileName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_NAME_INFORMATION) return false
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

public data class FILE_NETWORK_OPEN_INFORMATION(
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var AllocationSize: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var FileAttributes: UInt = 0u,
)

public data class FILE_NETWORK_PHYSICAL_NAME_INFORMATION(public var FileNameLength: UInt = 0u, public var FileName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_NETWORK_PHYSICAL_NAME_INFORMATION) return false
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

public data class FILE_OBJECTID_INFORMATION(
    public var FileReference: Long = 0L,
    public var ObjectId: UByteArray = UByteArray(16),
    public var Anonymous: FILE_OBJECTID_INFORMATION_0 = FILE_OBJECTID_INFORMATION_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_OBJECTID_INFORMATION) return false
        if (this.FileReference != other.FileReference) return false
        if (!this.ObjectId.contentEquals(other.ObjectId)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileReference.hashCode()
        result = 31 * result + this.ObjectId.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class FILE_OBJECTID_INFORMATION_0(public var Anonymous: FILE_OBJECTID_INFORMATION_0_0 = FILE_OBJECTID_INFORMATION_0_0(), public var ExtendedInfo: UByteArray = UByteArray(48)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_OBJECTID_INFORMATION_0) return false
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

public data class FILE_OBJECTID_INFORMATION_0_0(
    public var BirthVolumeId: UByteArray = UByteArray(16),
    public var BirthObjectId: UByteArray = UByteArray(16),
    public var DomainId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_OBJECTID_INFORMATION_0_0) return false
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

public data class FILE_PIPE_ASSIGN_EVENT_BUFFER(public var EventHandle: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(), public var KeyValue: UInt = 0u)

public data class FILE_PIPE_CLIENT_PROCESS_BUFFER(public var ClientSession: Long = 0L, public var ClientProcess: Long = 0L)

public data class FILE_PIPE_CLIENT_PROCESS_BUFFER_EX(
    public var ClientSession: Long = 0L,
    public var ClientProcess: Long = 0L,
    public var ClientComputerNameLength: UShort = 0u,
    public var ClientComputerBuffer: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_PIPE_CLIENT_PROCESS_BUFFER_EX) return false
        if (this.ClientSession != other.ClientSession) return false
        if (this.ClientProcess != other.ClientProcess) return false
        if (this.ClientComputerNameLength != other.ClientComputerNameLength) return false
        if (!this.ClientComputerBuffer.contentEquals(other.ClientComputerBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClientSession.hashCode()
        result = 31 * result + this.ClientProcess.hashCode()
        result = 31 * result + this.ClientComputerNameLength.hashCode()
        result = 31 * result + this.ClientComputerBuffer.contentHashCode()
        return result
    }
}

public data class FILE_PIPE_CLIENT_PROCESS_BUFFER_V2(public var ClientSession: ULong = 0uL, public var ClientProcess: Long = 0L)

public data class FILE_PIPE_CREATE_SYMLINK_INPUT(
    public var NameOffset: UShort = 0u,
    public var NameLength: UShort = 0u,
    public var SubstituteNameOffset: UShort = 0u,
    public var SubstituteNameLength: UShort = 0u,
    public var Flags: UInt = 0u,
)

public data class FILE_PIPE_DELETE_SYMLINK_INPUT(public var NameOffset: UShort = 0u, public var NameLength: UShort = 0u)

public data class FILE_PIPE_EVENT_BUFFER(
    public var NamedPipeState: UInt = 0u,
    public var EntryType: UInt = 0u,
    public var ByteCount: UInt = 0u,
    public var KeyValue: UInt = 0u,
    public var NumberRequests: UInt = 0u,
)

public data class FILE_PIPE_INFORMATION(public var ReadMode: UInt = 0u, public var CompletionMode: UInt = 0u)

public data class FILE_PIPE_LOCAL_INFORMATION(
    public var NamedPipeType: UInt = 0u,
    public var NamedPipeConfiguration: UInt = 0u,
    public var MaximumInstances: UInt = 0u,
    public var CurrentInstances: UInt = 0u,
    public var InboundQuota: UInt = 0u,
    public var ReadDataAvailable: UInt = 0u,
    public var OutboundQuota: UInt = 0u,
    public var WriteQuotaAvailable: UInt = 0u,
    public var NamedPipeState: UInt = 0u,
    public var NamedPipeEnd: UInt = 0u,
)

public data class FILE_PIPE_PEEK_BUFFER(
    public var NamedPipeState: UInt = 0u,
    public var ReadDataAvailable: UInt = 0u,
    public var NumberOfMessages: UInt = 0u,
    public var MessageLength: UInt = 0u,
    public var Data: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_PIPE_PEEK_BUFFER) return false
        if (this.NamedPipeState != other.NamedPipeState) return false
        if (this.ReadDataAvailable != other.ReadDataAvailable) return false
        if (this.NumberOfMessages != other.NumberOfMessages) return false
        if (this.MessageLength != other.MessageLength) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NamedPipeState.hashCode()
        result = 31 * result + this.ReadDataAvailable.hashCode()
        result = 31 * result + this.NumberOfMessages.hashCode()
        result = 31 * result + this.MessageLength.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class FILE_PIPE_REMOTE_INFORMATION(public var CollectDataTime: Long = 0L, public var MaximumCollectionCount: UInt = 0u)

public data class FILE_PIPE_SILO_ARRIVAL_INPUT(public var JobHandle: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE())

public data class FILE_PIPE_WAIT_FOR_BUFFER(
    public var Timeout: Long = 0L,
    public var NameLength: UInt = 0u,
    public var TimeoutSpecified: Boolean = false,
    public var Name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_PIPE_WAIT_FOR_BUFFER) return false
        if (this.Timeout != other.Timeout) return false
        if (this.NameLength != other.NameLength) return false
        if (this.TimeoutSpecified != other.TimeoutSpecified) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Timeout.hashCode()
        result = 31 * result + this.NameLength.hashCode()
        result = 31 * result + this.TimeoutSpecified.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class FILE_POSITION_INFORMATION(public var CurrentByteOffset: Long = 0L)

public data class FILE_QUOTA_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var SidLength: UInt = 0u,
    public var ChangeTime: Long = 0L,
    public var QuotaUsed: Long = 0L,
    public var QuotaThreshold: Long = 0L,
    public var QuotaLimit: Long = 0L,
    public var Sid: Win32.Security.SID = Win32.Security.SID(),
)

public data class FILE_REMOTE_PROTOCOL_INFORMATION(
    public var StructureVersion: UShort = 0u,
    public var StructureSize: UShort = 0u,
    public var Protocol: UInt = 0u,
    public var ProtocolMajorVersion: UShort = 0u,
    public var ProtocolMinorVersion: UShort = 0u,
    public var ProtocolRevision: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Flags: UInt = 0u,
    public var GenericReserved: FILE_REMOTE_PROTOCOL_INFORMATION_0 = FILE_REMOTE_PROTOCOL_INFORMATION_0(),
    public var ProtocolSpecific: FILE_REMOTE_PROTOCOL_INFORMATION_1 = FILE_REMOTE_PROTOCOL_INFORMATION_1(),
)

public data class FILE_REMOTE_PROTOCOL_INFORMATION_0(public var Reserved: UIntArray = UIntArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_REMOTE_PROTOCOL_INFORMATION_0) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved.contentHashCode()
    }
}

public data class FILE_REMOTE_PROTOCOL_INFORMATION_1(public var Smb2: FILE_REMOTE_PROTOCOL_INFORMATION_1_0 = FILE_REMOTE_PROTOCOL_INFORMATION_1_0(), public var Reserved: UIntArray = UIntArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_REMOTE_PROTOCOL_INFORMATION_1) return false
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

public data class FILE_REMOTE_PROTOCOL_INFORMATION_1_0(public var Server: FILE_REMOTE_PROTOCOL_INFORMATION_1_0_0 = FILE_REMOTE_PROTOCOL_INFORMATION_1_0_0(), public var Share: FILE_REMOTE_PROTOCOL_INFORMATION_1_0_1 = FILE_REMOTE_PROTOCOL_INFORMATION_1_0_1())

public data class FILE_REMOTE_PROTOCOL_INFORMATION_1_0_0(public var Capabilities: UInt = 0u)

public data class FILE_REMOTE_PROTOCOL_INFORMATION_1_0_1(
    public var Capabilities: UInt = 0u,
    public var ShareFlags: UInt = 0u,
    public var ShareType: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(3),
    public var Reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_REMOTE_PROTOCOL_INFORMATION_1_0_1) return false
        if (this.Capabilities != other.Capabilities) return false
        if (this.ShareFlags != other.ShareFlags) return false
        if (this.ShareType != other.ShareType) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.Reserved1 != other.Reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Capabilities.hashCode()
        result = 31 * result + this.ShareFlags.hashCode()
        result = 31 * result + this.ShareType.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.Reserved1.hashCode()
        return result
    }
}

public data class FILE_RENAME_INFORMATION(
    public var Anonymous: FILE_RENAME_INFORMATION_0 = FILE_RENAME_INFORMATION_0(),
    public var RootDirectory: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(),
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_RENAME_INFORMATION) return false
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

public data class FILE_RENAME_INFORMATION_0(public var ReplaceIfExists: Boolean = false, public var Flags: UInt = 0u)

public data class FILE_REPARSE_POINT_INFORMATION(public var FileReference: Long = 0L, public var Tag: UInt = 0u)

public data class FILE_STANDARD_INFORMATION(
    public var AllocationSize: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var NumberOfLinks: UInt = 0u,
    public var DeletePending: Boolean = false,
    public var Directory: Boolean = false,
)

public data class FILE_STANDARD_LINK_INFORMATION(
    public var NumberOfAccessibleLinks: UInt = 0u,
    public var TotalNumberOfLinks: UInt = 0u,
    public var DeletePending: Boolean = false,
    public var Directory: Boolean = false,
)

public data class FILE_STAT_INFORMATION(
    public var FileId: Long = 0L,
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var AllocationSize: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var FileAttributes: UInt = 0u,
    public var ReparseTag: UInt = 0u,
    public var NumberOfLinks: UInt = 0u,
    public var EffectiveAccess: UInt = 0u,
)

public class FILE_STAT_LX_INFORMATION(
    public var FileId: Long = 0L,
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var AllocationSize: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var FileAttributes: UInt = 0u,
    public var ReparseTag: UInt = 0u,
    public var NumberOfLinks: UInt = 0u,
    public var EffectiveAccess: UInt = 0u,
    public var LxFlags: UInt = 0u,
    public var LxUid: UInt = 0u,
    public var LxGid: UInt = 0u,
    public var LxMode: UInt = 0u,
    public var LxDeviceIdMajor: UInt = 0u,
    public var LxDeviceIdMinor: UInt = 0u,
)

public data class FILE_STORAGE_RESERVE_ID_INFORMATION(public var StorageReserveId: Win32.System.Ioctl.STORAGE_RESERVE_ID = Win32.System.Ioctl.STORAGE_RESERVE_ID())

public data class FILE_STREAM_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var StreamNameLength: UInt = 0u,
    public var StreamSize: Long = 0L,
    public var StreamAllocationSize: Long = 0L,
    public var StreamName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_STREAM_INFORMATION) return false
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

public data class FILE_TIMESTAMPS(
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
)

public data class FILE_TRACKING_INFORMATION(
    public var DestinationFile: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(),
    public var ObjectInformationLength: UInt = 0u,
    public var ObjectInformation: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_TRACKING_INFORMATION) return false
        if (this.DestinationFile != other.DestinationFile) return false
        if (this.ObjectInformationLength != other.ObjectInformationLength) return false
        if (!this.ObjectInformation.contentEquals(other.ObjectInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DestinationFile.hashCode()
        result = 31 * result + this.ObjectInformationLength.hashCode()
        result = 31 * result + this.ObjectInformation.contentHashCode()
        return result
    }
}

public data class FILE_VOLUME_NAME_INFORMATION(public var DeviceNameLength: UInt = 0u, public var DeviceName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_VOLUME_NAME_INFORMATION) return false
        if (this.DeviceNameLength != other.DeviceNameLength) return false
        if (!this.DeviceName.contentEquals(other.DeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceNameLength.hashCode()
        result = 31 * result + this.DeviceName.contentHashCode()
        return result
    }
}

public data class FSCTL_GHOST_FILE_EXTENTS_INPUT_BUFFER(
    public var FileOffset: Long = 0L,
    public var ByteCount: Long = 0L,
    public var RecallOwnerGuid: GUID = GUID(),
    public var RecallMetadataBufferSize: UInt = 0u,
    public var RecallMetadataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FSCTL_GHOST_FILE_EXTENTS_INPUT_BUFFER) return false
        if (this.FileOffset != other.FileOffset) return false
        if (this.ByteCount != other.ByteCount) return false
        if (this.RecallOwnerGuid != other.RecallOwnerGuid) return false
        if (this.RecallMetadataBufferSize != other.RecallMetadataBufferSize) return false
        if (!this.RecallMetadataBuffer.contentEquals(other.RecallMetadataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileOffset.hashCode()
        result = 31 * result + this.ByteCount.hashCode()
        result = 31 * result + this.RecallOwnerGuid.hashCode()
        result = 31 * result + this.RecallMetadataBufferSize.hashCode()
        result = 31 * result + this.RecallMetadataBuffer.contentHashCode()
        return result
    }
}

public data class FSCTL_QUERY_GHOSTED_FILE_EXTENTS_INPUT_RANGE(public var FileOffset: Long = 0L, public var ByteCount: Long = 0L)

public data class FSCTL_QUERY_GHOSTED_FILE_EXTENTS_OUTPUT(
    public var ExtentCount: UInt = 0u,
    public var TotalExtentCount: UInt = 0u,
    public var Extents: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FSCTL_QUERY_GHOSTED_FILE_EXTENTS_OUTPUT) return false
        if (this.ExtentCount != other.ExtentCount) return false
        if (this.TotalExtentCount != other.TotalExtentCount) return false
        if (!this.Extents.contentEquals(other.Extents)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ExtentCount.hashCode()
        result = 31 * result + this.TotalExtentCount.hashCode()
        result = 31 * result + this.Extents.contentHashCode()
        return result
    }
}

public data class FSCTL_QUERY_VOLUME_NUMA_INFO_OUTPUT(public var NumaNode: UInt = 0u)

public data class FSCTL_UNMAP_SPACE_INPUT_BUFFER(public var BytesToUnmap: Long = 0L)

public data class FSCTL_UNMAP_SPACE_OUTPUT(public var BytesUnmapped: Long = 0L)

public data class FSRTL_ADVANCED_FCB_HEADER(
    public var Base: FSRTL_COMMON_FCB_HEADER = FSRTL_COMMON_FCB_HEADER(),
    public var FastMutex: Long = 0L,
    public var FilterContexts: Win32.System.Kernel.LIST_ENTRY = Win32.System.Kernel.LIST_ENTRY(),
    public var PushLock: ULong = 0uL,
    public var FileContextSupportPointer: Long = 0L,
    public var Anonymous: FSRTL_ADVANCED_FCB_HEADER_0 = FSRTL_ADVANCED_FCB_HEADER_0(),
    public var AePushLock: Long = 0L,
    public var BypassIoOpenCount: UInt = 0u,
)

public data class FSRTL_ADVANCED_FCB_HEADER_0(public var Oplock: Long = 0L, public var ReservedForRemote: Long = 0L)

public data class FSRTL_AUXILIARY_BUFFER(
    public var Buffer: Long = 0L,
    public var Length: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Mdl: Long = 0L,
)

public data class FSRTL_COMMON_FCB_HEADER(
    public var NodeTypeCode: Short = 0,
    public var NodeByteSize: Short = 0,
    public var Flags: UByte = 0u,
    public var IsFastIoPossible: UByte = 0u,
    public var Flags2: UByte = 0u,
    public var _bitfield: UByte = 0u,
    public var Resource: Long = 0L,
    public var PagingIoResource: Long = 0L,
    public var AllocationSize: Long = 0L,
    public var FileSize: Long = 0L,
    public var ValidDataLength: Long = 0L,
)

public data class FSRTL_MUP_PROVIDER_INFO_LEVEL_1(public var ProviderId: UInt = 0u)

public data class FSRTL_MUP_PROVIDER_INFO_LEVEL_2(public var ProviderId: UInt = 0u, public var ProviderName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING())

public data class FSRTL_PER_FILEOBJECT_CONTEXT(
    public var Links: Win32.System.Kernel.LIST_ENTRY = Win32.System.Kernel.LIST_ENTRY(),
    public var OwnerId: Long = 0L,
    public var InstanceId: Long = 0L,
)

public data class FSRTL_PER_FILE_CONTEXT(
    public var Links: Win32.System.Kernel.LIST_ENTRY = Win32.System.Kernel.LIST_ENTRY(),
    public var OwnerId: Long = 0L,
    public var InstanceId: Long = 0L,
    public var FreeCallback: Foundation.PFREE_FUNCTION = Foundation.PFREE_FUNCTION(),
)

public data class FSRTL_PER_STREAM_CONTEXT(
    public var Links: Win32.System.Kernel.LIST_ENTRY = Win32.System.Kernel.LIST_ENTRY(),
    public var OwnerId: Long = 0L,
    public var InstanceId: Long = 0L,
    public var FreeCallback: Foundation.PFREE_FUNCTION = Foundation.PFREE_FUNCTION(),
)

public data class FSRTL_UNC_PROVIDER_REGISTRATION(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Anonymous1: FSRTL_UNC_PROVIDER_REGISTRATION_0 = FSRTL_UNC_PROVIDER_REGISTRATION_0(),
    public var Anonymous2: FSRTL_UNC_PROVIDER_REGISTRATION_1 = FSRTL_UNC_PROVIDER_REGISTRATION_1(),
)

public data class FSRTL_UNC_PROVIDER_REGISTRATION_0(public var ProviderFlags: UInt = 0u, public var Anonymous: FSRTL_UNC_PROVIDER_REGISTRATION_0_0 = FSRTL_UNC_PROVIDER_REGISTRATION_0_0())

public data class FSRTL_UNC_PROVIDER_REGISTRATION_0_0(public var _bitfield: UInt = 0u)

public data class FSRTL_UNC_PROVIDER_REGISTRATION_1(public var HardeningCapabilities: UInt = 0u, public var Anonymous: FSRTL_UNC_PROVIDER_REGISTRATION_1_0 = FSRTL_UNC_PROVIDER_REGISTRATION_1_0())

public data class FSRTL_UNC_PROVIDER_REGISTRATION_1_0(public var _bitfield: UInt = 0u)

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
    public var Operation: Win32.System.Ioctl.FS_BPIO_OPERATIONS = Win32.System.Ioctl.FS_BPIO_OPERATIONS(),
    public var InFlags: Win32.System.Ioctl.FS_BPIO_INFLAGS = Win32.System.Ioctl.FS_BPIO_INFLAGS(),
    public var Reserved1: ULong = 0uL,
    public var Reserved2: ULong = 0uL,
)

public data class FS_FILTER_CALLBACKS(
    public var SizeOfFsFilterCallbacks: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var PreAcquireForSectionSynchronization: PFS_FILTER_CALLBACK = null,
    public var PostAcquireForSectionSynchronization: PFS_FILTER_COMPLETION_CALLBACK = null,
    public var PreReleaseForSectionSynchronization: PFS_FILTER_CALLBACK = null,
    public var PostReleaseForSectionSynchronization: PFS_FILTER_COMPLETION_CALLBACK = null,
    public var PreAcquireForCcFlush: PFS_FILTER_CALLBACK = null,
    public var PostAcquireForCcFlush: PFS_FILTER_COMPLETION_CALLBACK = null,
    public var PreReleaseForCcFlush: PFS_FILTER_CALLBACK = null,
    public var PostReleaseForCcFlush: PFS_FILTER_COMPLETION_CALLBACK = null,
    public var PreAcquireForModifiedPageWriter: PFS_FILTER_CALLBACK = null,
    public var PostAcquireForModifiedPageWriter: PFS_FILTER_COMPLETION_CALLBACK = null,
    public var PreReleaseForModifiedPageWriter: PFS_FILTER_CALLBACK = null,
    public var PostReleaseForModifiedPageWriter: PFS_FILTER_COMPLETION_CALLBACK = null,
    public var PreQueryOpen: PFS_FILTER_CALLBACK = null,
    public var PostQueryOpen: PFS_FILTER_COMPLETION_CALLBACK = null,
)

public data class FS_FILTER_CALLBACK_DATA(
    public var SizeOfFsFilterCallbackData: UInt = 0u,
    public var Operation: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var DeviceObject: Long = 0L,
    public var FileObject: Long = 0L,
    public var Parameters: FS_FILTER_PARAMETERS = FS_FILTER_PARAMETERS(),
)

public data class FS_FILTER_PARAMETERS(
    public var AcquireForModifiedPageWriter: FS_FILTER_PARAMETERS_0 = FS_FILTER_PARAMETERS_0(),
    public var ReleaseForModifiedPageWriter: FS_FILTER_PARAMETERS_1 = FS_FILTER_PARAMETERS_1(),
    public var AcquireForSectionSynchronization: FS_FILTER_PARAMETERS_2 = FS_FILTER_PARAMETERS_2(),
    public var QueryOpen: FS_FILTER_PARAMETERS_3 = FS_FILTER_PARAMETERS_3(),
    public var Others: FS_FILTER_PARAMETERS_4 = FS_FILTER_PARAMETERS_4(),
)

public data class FS_FILTER_PARAMETERS_0(public var EndingOffset: Long = 0L, public var ResourceToRelease: Long = 0L)

public data class FS_FILTER_PARAMETERS_2(
    public var SyncType: FS_FILTER_SECTION_SYNC_TYPE = 0,
    public var PageProtection: UInt = 0u,
    public var OutputInformation: Long = 0L,
    public var Flags: UInt = 0u,
    public var AllocationAttributes: UInt = 0u,
)

public data class FS_FILTER_PARAMETERS_4(
    public var Argument1: Long = 0L,
    public var Argument2: Long = 0L,
    public var Argument3: Long = 0L,
    public var Argument4: Long = 0L,
    public var Argument5: Long = 0L,
)

public data class FS_FILTER_PARAMETERS_3(
    public var Irp: Long = 0L,
    public var FileInformation: Long = 0L,
    public var Length: Long = 0L,
    public var FileInformationClass: FILE_INFORMATION_CLASS = 0,
    public var CompletionStatus: Win32.Foundation.NTSTATUS = Win32.Foundation.NTSTATUS(),
)

public data class FS_FILTER_PARAMETERS_1(public var ResourceToRelease: Long = 0L)

public data class FS_FILTER_SECTION_SYNC_OUTPUT(
    public var StructureSize: UInt = 0u,
    public var SizeReturned: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DesiredReadAlignment: UInt = 0u,
)

public data class GENERATE_NAME_CONTEXT(
    public var Checksum: UShort = 0u,
    public var ChecksumInserted: Boolean = false,
    public var NameLength: UByte = 0u,
    public var NameBuffer: UShortArray = UShortArray(8),
    public var ExtensionLength: UInt = 0u,
    public var ExtensionBuffer: UShortArray = UShortArray(4),
    public var LastIndexValue: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GENERATE_NAME_CONTEXT) return false
        if (this.Checksum != other.Checksum) return false
        if (this.ChecksumInserted != other.ChecksumInserted) return false
        if (this.NameLength != other.NameLength) return false
        if (!this.NameBuffer.contentEquals(other.NameBuffer)) return false
        if (this.ExtensionLength != other.ExtensionLength) return false
        if (!this.ExtensionBuffer.contentEquals(other.ExtensionBuffer)) return false
        if (this.LastIndexValue != other.LastIndexValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Checksum.hashCode()
        result = 31 * result + this.ChecksumInserted.hashCode()
        result = 31 * result + this.NameLength.hashCode()
        result = 31 * result + this.NameBuffer.contentHashCode()
        result = 31 * result + this.ExtensionLength.hashCode()
        result = 31 * result + this.ExtensionBuffer.contentHashCode()
        result = 31 * result + this.LastIndexValue.hashCode()
        return result
    }
}

public data class GHOSTED_FILE_EXTENT(
    public var FileOffset: Long = 0L,
    public var ByteCount: Long = 0L,
    public var RecallOwnerGuid: GUID = GUID(),
    public var NextEntryOffset: UInt = 0u,
    public var RecallMetadataBufferSize: UInt = 0u,
    public var RecallMetadataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GHOSTED_FILE_EXTENT) return false
        if (this.FileOffset != other.FileOffset) return false
        if (this.ByteCount != other.ByteCount) return false
        if (this.RecallOwnerGuid != other.RecallOwnerGuid) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.RecallMetadataBufferSize != other.RecallMetadataBufferSize) return false
        if (!this.RecallMetadataBuffer.contentEquals(other.RecallMetadataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileOffset.hashCode()
        result = 31 * result + this.ByteCount.hashCode()
        result = 31 * result + this.RecallOwnerGuid.hashCode()
        result = 31 * result + this.NextEntryOffset.hashCode()
        result = 31 * result + this.RecallMetadataBufferSize.hashCode()
        result = 31 * result + this.RecallMetadataBuffer.contentHashCode()
        return result
    }
}

public data class IO_CREATE_STREAM_FILE_OPTIONS(
    public var Size: UShort = 0u,
    public var Flags: UShort = 0u,
    public var TargetDeviceObject: Long = 0L,
)

public data class IO_DEVICE_HINT_ECP_CONTEXT(public var TargetDevice: Long = 0L, public var RemainingName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING())

public data class IO_PRIORITY_INFO(
    public var Size: UInt = 0u,
    public var ThreadPriority: UInt = 0u,
    public var PagePriority: UInt = 0u,
    public var IoPriority: Foundation.IO_PRIORITY_HINT = Foundation.IO_PRIORITY_HINT(),
)

public data class IO_STOP_ON_SYMLINK_FILTER_ECP_v0(public var Out: IO_STOP_ON_SYMLINK_FILTER_ECP_v0_0 = IO_STOP_ON_SYMLINK_FILTER_ECP_v0_0())

public data class IO_STOP_ON_SYMLINK_FILTER_ECP_v0_0(public var ReparseCount: UInt = 0u, public var RemainingPathLength: UInt = 0u)

public data class KAPC_STATE(
    public var ApcListHead: List<Win32.System.Kernel.LIST_ENTRY> = List(2) { Win32.System.Kernel.LIST_ENTRY() },
    public var Process: Long = 0L,
    public var Anonymous1: KAPC_STATE_0 = KAPC_STATE_0(),
    public var KernelApcPending: Boolean = false,
    public var Anonymous2: KAPC_STATE_1 = KAPC_STATE_1(),
)

public data class KAPC_STATE_0(public var InProgressFlags: UByte = 0u, public var Anonymous: KAPC_STATE_0_0 = KAPC_STATE_0_0())

public data class KAPC_STATE_0_0(public var _bitfield: UByte = 0u)

public data class KAPC_STATE_1(public var UserApcPendingAll: Boolean = false, public var Anonymous: KAPC_STATE_1_0 = KAPC_STATE_1_0())

public data class KAPC_STATE_1_0(public var _bitfield: UByte = 0u)

public data class LARGE_MCB(public var GuardedMutex: Long = 0L, public var BaseMcb: BASE_MCB = BASE_MCB())

public data class LCN_WEAK_REFERENCE_BUFFER(
    public var Lcn: Long = 0L,
    public var LengthInClusters: Long = 0L,
    public var ReferenceCount: UInt = 0u,
    public var State: UShort = 0u,
)

public data class LCN_WEAK_REFERENCE_CREATE_INPUT_BUFFER(
    public var Offset: Long = 0L,
    public var Length: Long = 0L,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class LINK_TRACKING_INFORMATION(public var Type: LINK_TRACKING_INFORMATION_TYPE = 0, public var VolumeId: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LINK_TRACKING_INFORMATION) return false
        if (this.Type != other.Type) return false
        if (!this.VolumeId.contentEquals(other.VolumeId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.VolumeId.contentHashCode()
        return result
    }
}

public data class MCB(public var DummyFieldThatSizesThisStructureCorrectly: LARGE_MCB = LARGE_MCB())

public data class MEMORY_RANGE_ENTRY(public var VirtualAddress: Long = 0L, public var NumberOfBytes: ULong = 0uL)

public data class MFT_ENUM_DATA(
    public var StartFileReferenceNumber: ULong = 0uL,
    public var LowUsn: Long = 0L,
    public var HighUsn: Long = 0L,
    public var MinMajorVersion: UShort = 0u,
    public var MaxMajorVersion: UShort = 0u,
)

public data class MM_PREFETCH_FLAGS(public var Flags: MM_PREFETCH_FLAGS_0 = MM_PREFETCH_FLAGS_0(), public var AllFlags: UInt = 0u)

public data class MM_PREFETCH_FLAGS_0(public var _bitfield: UInt = 0u)

public data class MSV1_0_ENUMUSERS_REQUEST(public var MessageType: Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE = Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE())

public data class MSV1_0_ENUMUSERS_RESPONSE(
    public var MessageType: Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE = Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE(),
    public var NumberOfLoggedOnUsers: UInt = 0u,
    public var LogonIds: Long = 0L,
    public var EnumHandles: Long = 0L,
)

public data class MSV1_0_GETCHALLENRESP_REQUEST(
    public var MessageType: Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE = Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE(),
    public var ParameterControl: UInt = 0u,
    public var LogonId: Win32.Foundation.LUID = Win32.Foundation.LUID(),
    public var Password: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var ChallengeToClient: UByteArray = UByteArray(8),
    public var UserName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var LogonDomainName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var ServerName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_GETCHALLENRESP_REQUEST) return false
        if (this.MessageType != other.MessageType) return false
        if (this.ParameterControl != other.ParameterControl) return false
        if (this.LogonId != other.LogonId) return false
        if (this.Password != other.Password) return false
        if (!this.ChallengeToClient.contentEquals(other.ChallengeToClient)) return false
        if (this.UserName != other.UserName) return false
        if (this.LogonDomainName != other.LogonDomainName) return false
        if (this.ServerName != other.ServerName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageType.hashCode()
        result = 31 * result + this.ParameterControl.hashCode()
        result = 31 * result + this.LogonId.hashCode()
        result = 31 * result + this.Password.hashCode()
        result = 31 * result + this.ChallengeToClient.contentHashCode()
        result = 31 * result + this.UserName.hashCode()
        result = 31 * result + this.LogonDomainName.hashCode()
        result = 31 * result + this.ServerName.hashCode()
        return result
    }
}

public data class MSV1_0_GETCHALLENRESP_REQUEST_V1(
    public var MessageType: Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE = Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE(),
    public var ParameterControl: UInt = 0u,
    public var LogonId: Win32.Foundation.LUID = Win32.Foundation.LUID(),
    public var Password: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var ChallengeToClient: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_GETCHALLENRESP_REQUEST_V1) return false
        if (this.MessageType != other.MessageType) return false
        if (this.ParameterControl != other.ParameterControl) return false
        if (this.LogonId != other.LogonId) return false
        if (this.Password != other.Password) return false
        if (!this.ChallengeToClient.contentEquals(other.ChallengeToClient)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageType.hashCode()
        result = 31 * result + this.ParameterControl.hashCode()
        result = 31 * result + this.LogonId.hashCode()
        result = 31 * result + this.Password.hashCode()
        result = 31 * result + this.ChallengeToClient.contentHashCode()
        return result
    }
}

public data class MSV1_0_GETCHALLENRESP_RESPONSE(
    public var MessageType: Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE = Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE(),
    public var CaseSensitiveChallengeResponse: Win32.System.Kernel.STRING = Win32.System.Kernel.STRING(),
    public var CaseInsensitiveChallengeResponse: Win32.System.Kernel.STRING = Win32.System.Kernel.STRING(),
    public var UserName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var LogonDomainName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var UserSessionKey: UByteArray = UByteArray(16),
    public var LanmanSessionKey: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_GETCHALLENRESP_RESPONSE) return false
        if (this.MessageType != other.MessageType) return false
        if (this.CaseSensitiveChallengeResponse != other.CaseSensitiveChallengeResponse) return false
        if (this.CaseInsensitiveChallengeResponse != other.CaseInsensitiveChallengeResponse) return false
        if (this.UserName != other.UserName) return false
        if (this.LogonDomainName != other.LogonDomainName) return false
        if (!this.UserSessionKey.contentEquals(other.UserSessionKey)) return false
        if (!this.LanmanSessionKey.contentEquals(other.LanmanSessionKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageType.hashCode()
        result = 31 * result + this.CaseSensitiveChallengeResponse.hashCode()
        result = 31 * result + this.CaseInsensitiveChallengeResponse.hashCode()
        result = 31 * result + this.UserName.hashCode()
        result = 31 * result + this.LogonDomainName.hashCode()
        result = 31 * result + this.UserSessionKey.contentHashCode()
        result = 31 * result + this.LanmanSessionKey.contentHashCode()
        return result
    }
}

public data class MSV1_0_GETUSERINFO_REQUEST(public var MessageType: Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE = Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE(), public var LogonId: Win32.Foundation.LUID = Win32.Foundation.LUID())

public data class MSV1_0_GETUSERINFO_RESPONSE(
    public var MessageType: Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE = Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE(),
    public var UserSid: Win32.Security.PSID = Win32.Security.PSID(),
    public var UserName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var LogonDomainName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var LogonServer: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var LogonType: Win32.Security.Authentication.Identity.SECURITY_LOGON_TYPE = Win32.Security.Authentication.Identity.SECURITY_LOGON_TYPE(),
)

public data class MSV1_0_LM20_CHALLENGE_REQUEST(public var MessageType: Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE = Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE())

public data class MSV1_0_LM20_CHALLENGE_RESPONSE(public var MessageType: Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE = Win32.Security.Authentication.Identity.MSV1_0_PROTOCOL_MESSAGE_TYPE(), public var ChallengeToClient: UByteArray = UByteArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_LM20_CHALLENGE_RESPONSE) return false
        if (this.MessageType != other.MessageType) return false
        if (!this.ChallengeToClient.contentEquals(other.ChallengeToClient)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageType.hashCode()
        result = 31 * result + this.ChallengeToClient.contentHashCode()
        return result
    }
}

public data class NETWORK_APP_INSTANCE_ECP_CONTEXT(
    public var Size: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var AppInstanceID: GUID = GUID(),
)

public data class NETWORK_APP_INSTANCE_VERSION_ECP_CONTEXT(
    public var Size: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var VersionHigh: ULong = 0uL,
    public var VersionLow: ULong = 0uL,
)

public data class NETWORK_OPEN_ECP_CONTEXT(
    public var Size: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Anonymous: NETWORK_OPEN_ECP_CONTEXT_0 = NETWORK_OPEN_ECP_CONTEXT_0(),
)

public data class NETWORK_OPEN_ECP_CONTEXT_0(public var input: NETWORK_OPEN_ECP_CONTEXT_0_0 = NETWORK_OPEN_ECP_CONTEXT_0_0(), public var out: NETWORK_OPEN_ECP_CONTEXT_0_1 = NETWORK_OPEN_ECP_CONTEXT_0_1())

public data class NETWORK_OPEN_ECP_CONTEXT_0_0(
    public var Location: NETWORK_OPEN_LOCATION_QUALIFIER = 0,
    public var Integrity: NETWORK_OPEN_INTEGRITY_QUALIFIER = 0,
    public var Flags: UInt = 0u,
)

public data class NETWORK_OPEN_ECP_CONTEXT_0_1(
    public var Location: NETWORK_OPEN_LOCATION_QUALIFIER = 0,
    public var Integrity: NETWORK_OPEN_INTEGRITY_QUALIFIER = 0,
    public var Flags: UInt = 0u,
)

public data class NETWORK_OPEN_ECP_CONTEXT_V0(
    public var Size: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Anonymous: NETWORK_OPEN_ECP_CONTEXT_V0_0 = NETWORK_OPEN_ECP_CONTEXT_V0_0(),
)

public data class NETWORK_OPEN_ECP_CONTEXT_V0_0(public var input: NETWORK_OPEN_ECP_CONTEXT_V0_0_0 = NETWORK_OPEN_ECP_CONTEXT_V0_0_0(), public var out: NETWORK_OPEN_ECP_CONTEXT_V0_0_1 = NETWORK_OPEN_ECP_CONTEXT_V0_0_1())

public data class NETWORK_OPEN_ECP_CONTEXT_V0_0_0(public var Location: NETWORK_OPEN_LOCATION_QUALIFIER = 0, public var Integrity: NETWORK_OPEN_INTEGRITY_QUALIFIER = 0)

public data class NETWORK_OPEN_ECP_CONTEXT_V0_0_1(public var Location: NETWORK_OPEN_LOCATION_QUALIFIER = 0, public var Integrity: NETWORK_OPEN_INTEGRITY_QUALIFIER = 0)

public data class NFS_OPEN_ECP_CONTEXT(public var ExportAlias: Long = 0L, public var ClientSocketAddress: Long = 0L)

public data class NLSTABLEINFO(
    public var OemTableInfo: CPTABLEINFO = CPTABLEINFO(),
    public var AnsiTableInfo: CPTABLEINFO = CPTABLEINFO(),
    public var UpperCaseTable: Long = 0L,
    public var LowerCaseTable: Long = 0L,
)

public data class OPEN_REPARSE_LIST(public var OpenReparseList: Win32.System.Kernel.LIST_ENTRY = Win32.System.Kernel.LIST_ENTRY())

public data class OPEN_REPARSE_LIST_ENTRY(
    public var OpenReparseListEntry: Win32.System.Kernel.LIST_ENTRY = Win32.System.Kernel.LIST_ENTRY(),
    public var ReparseTag: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ReparseGuid: GUID = GUID(),
    public var Size: UShort = 0u,
    public var RemainingLength: UShort = 0u,
)

public data class OPLOCK_KEY_CONTEXT(
    public var Version: UShort = 0u,
    public var Flags: UShort = 0u,
    public var ParentOplockKey: GUID = GUID(),
    public var TargetOplockKey: GUID = GUID(),
    public var Reserved: UInt = 0u,
)

public data class OPLOCK_KEY_ECP_CONTEXT(public var OplockKey: GUID = GUID(), public var Reserved: UInt = 0u)

public data class OPLOCK_NOTIFY_PARAMS(
    public var NotifyReason: OPLOCK_NOTIFY_REASON = 0,
    public var NotifyContext: Long = 0L,
    public var Irp: Long = 0L,
    public var Status: Win32.Foundation.NTSTATUS = Win32.Foundation.NTSTATUS(),
)

public data class PHYSICAL_EXTENTS_DESCRIPTOR(
    public var NumberOfRuns: UInt = 0u,
    public var NumberOfValidRuns: UInt = 0u,
    public var Run: List<PHYSICAL_MEMORY_RUN> = List(1) { PHYSICAL_MEMORY_RUN() },
)

public data class PHYSICAL_MEMORY_DESCRIPTOR(
    public var NumberOfRuns: UInt = 0u,
    public var NumberOfPages: UInt = 0u,
    public var Run: List<PHYSICAL_MEMORY_RUN> = List(1) { PHYSICAL_MEMORY_RUN() },
)

public data class PHYSICAL_MEMORY_RUN(public var BasePage: UInt = 0u, public var PageCount: UInt = 0u)

public data class PREFETCH_OPEN_ECP_CONTEXT(public var Context: Long = 0L)

public data class PREFIX_TABLE(
    public var NodeTypeCode: Short = 0,
    public var NameLength: Short = 0,
    public var NextPrefixTree: Long = 0L,
)

public data class PREFIX_TABLE_ENTRY(
    public var NodeTypeCode: Short = 0,
    public var NameLength: Short = 0,
    public var NextPrefixTree: Long = 0L,
    public var Links: Foundation.RTL_SPLAY_LINKS = Foundation.RTL_SPLAY_LINKS(),
    public var Prefix: Long = 0L,
)

public data class PUBLIC_BCB(
    public var NodeTypeCode: Short = 0,
    public var NodeByteSize: Short = 0,
    public var MappedLength: UInt = 0u,
    public var MappedFileOffset: Long = 0L,
)

public data class QUERY_BAD_RANGES_INPUT(
    public var Flags: UInt = 0u,
    public var NumRanges: UInt = 0u,
    public var Ranges: List<Win32.System.Ioctl.QUERY_BAD_RANGES_INPUT_RANGE> = List(1) { Win32.System.Ioctl.QUERY_BAD_RANGES_INPUT_RANGE() },
)

public data class QUERY_DIRECT_ACCESS_EXTENTS(
    public var FileOffset: Long = 0L,
    public var Length: Long = 0L,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class QUERY_ON_CREATE_EA_INFORMATION(public var EaBufferSize: UInt = 0u, public var EaBuffer: Long = 0L)

public data class QUERY_ON_CREATE_ECP_CONTEXT(
    public var RequestedClasses: UInt = 0u,
    public var ClassesProcessed: UInt = 0u,
    public var ClassesWithErrors: UInt = 0u,
    public var ClassesWithNoData: UInt = 0u,
    public var StatInformation: QUERY_ON_CREATE_FILE_STAT_INFORMATION = QUERY_ON_CREATE_FILE_STAT_INFORMATION(),
    public var LxInformation: QUERY_ON_CREATE_FILE_LX_INFORMATION = QUERY_ON_CREATE_FILE_LX_INFORMATION(),
    public var EaInformation: QUERY_ON_CREATE_EA_INFORMATION = QUERY_ON_CREATE_EA_INFORMATION(),
)

public data class QUERY_ON_CREATE_FILE_LX_INFORMATION(
    public var EffectiveAccess: UInt = 0u,
    public var LxFlags: UInt = 0u,
    public var LxUid: UInt = 0u,
    public var LxGid: UInt = 0u,
    public var LxMode: UInt = 0u,
    public var LxDeviceIdMajor: UInt = 0u,
    public var LxDeviceIdMinor: UInt = 0u,
)

public data class QUERY_ON_CREATE_FILE_STAT_INFORMATION(
    public var FileId: Long = 0L,
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var AllocationSize: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var FileAttributes: UInt = 0u,
    public var ReparseTag: UInt = 0u,
    public var NumberOfLinks: UInt = 0u,
)

public data class QUERY_PATH_REQUEST(
    public var PathNameLength: UInt = 0u,
    public var SecurityContext: Long = 0L,
    public var FilePathName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QUERY_PATH_REQUEST) return false
        if (this.PathNameLength != other.PathNameLength) return false
        if (this.SecurityContext != other.SecurityContext) return false
        if (!this.FilePathName.contentEquals(other.FilePathName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PathNameLength.hashCode()
        result = 31 * result + this.SecurityContext.hashCode()
        result = 31 * result + this.FilePathName.contentHashCode()
        return result
    }
}

public data class QUERY_PATH_REQUEST_EX(
    public var pSecurityContext: Long = 0L,
    public var EaLength: UInt = 0u,
    public var pEaBuffer: Long = 0L,
    public var PathName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var DomainServiceName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var EcpList: Long = 0L,
    public var Silo: Foundation.PESILO = Foundation.PESILO(),
    public var Reserved: ULong = 0uL,
)

public data class QUERY_PATH_RESPONSE(public var LengthAccepted: UInt = 0u)

public data class READ_AHEAD_PARAMETERS(
    public var NodeByteSize: Short = 0,
    public var Granularity: UInt = 0u,
    public var PipelinedRequestSize: UInt = 0u,
    public var ReadAheadGrowthPercentage: UInt = 0u,
)

public data class READ_LIST(
    public var FileObject: Long = 0L,
    public var NumberOfEntries: UInt = 0u,
    public var IsImage: UInt = 0u,
    public var List: List<Win32.Storage.FileSystem.FILE_SEGMENT_ELEMENT> = List(1) { Win32.Storage.FileSystem.FILE_SEGMENT_ELEMENT() },
)

public data class READ_USN_JOURNAL_DATA(
    public var StartUsn: Long = 0L,
    public var ReasonMask: UInt = 0u,
    public var ReturnOnlyOnClose: UInt = 0u,
    public var Timeout: ULong = 0uL,
    public var BytesToWaitFor: ULong = 0uL,
    public var UsnJournalID: ULong = 0uL,
    public var MinMajorVersion: UShort = 0u,
    public var MaxMajorVersion: UShort = 0u,
)

public data class REFS_DEALLOCATE_RANGES_INPUT_BUFFER(public var RangeCount: UInt = 0u, public var Ranges: List<REFS_DEALLOCATE_RANGES_RANGE> = List(1) { REFS_DEALLOCATE_RANGES_RANGE() })

public data class REFS_DEALLOCATE_RANGES_INPUT_BUFFER_EX(
    public var RangeCount: UInt = 0u,
    public var Allocator: REFS_DEALLOCATE_RANGES_ALLOCATOR = 0,
    public var StreamReserveUpdateCount: Long = 0L,
    public var OffsetToRanges: UInt = 0u,
    public var OffsetToLeakCounts: UInt = 0u,
    public var Reserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_DEALLOCATE_RANGES_INPUT_BUFFER_EX) return false
        if (this.RangeCount != other.RangeCount) return false
        if (this.Allocator != other.Allocator) return false
        if (this.StreamReserveUpdateCount != other.StreamReserveUpdateCount) return false
        if (this.OffsetToRanges != other.OffsetToRanges) return false
        if (this.OffsetToLeakCounts != other.OffsetToLeakCounts) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RangeCount.hashCode()
        result = 31 * result + this.Allocator.hashCode()
        result = 31 * result + this.StreamReserveUpdateCount.hashCode()
        result = 31 * result + this.OffsetToRanges.hashCode()
        result = 31 * result + this.OffsetToLeakCounts.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class REFS_DEALLOCATE_RANGES_RANGE(public var StartOfRange: ULong = 0uL, public var CountOfRange: ULong = 0uL)

public data class REFS_QUERY_VOLUME_COMPRESSION_INFO_OUTPUT_BUFFER(
    public var DefaultCompressionFormat: REFS_COMPRESSION_FORMATS = 0,
    public var DefaultCompressionLevel: Short = 0,
    public var DefaultCompressionChunkSizeBytes: UInt = 0u,
    public var VolumeClusterSizeBytes: UInt = 0u,
    public var TotalVolumeClusters: ULong = 0uL,
    public var TotalAllocatedClusters: ULong = 0uL,
    public var TotalCompressibleClustersAllocated: ULong = 0uL,
    public var TotalCompressibleClustersInUse: ULong = 0uL,
    public var TotalCompressedClusters: ULong = 0uL,
    public var Reserved: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_QUERY_VOLUME_COMPRESSION_INFO_OUTPUT_BUFFER) return false
        if (this.DefaultCompressionFormat != other.DefaultCompressionFormat) return false
        if (this.DefaultCompressionLevel != other.DefaultCompressionLevel) return false
        if (this.DefaultCompressionChunkSizeBytes != other.DefaultCompressionChunkSizeBytes) return false
        if (this.VolumeClusterSizeBytes != other.VolumeClusterSizeBytes) return false
        if (this.TotalVolumeClusters != other.TotalVolumeClusters) return false
        if (this.TotalAllocatedClusters != other.TotalAllocatedClusters) return false
        if (this.TotalCompressibleClustersAllocated != other.TotalCompressibleClustersAllocated) return false
        if (this.TotalCompressibleClustersInUse != other.TotalCompressibleClustersInUse) return false
        if (this.TotalCompressedClusters != other.TotalCompressedClusters) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DefaultCompressionFormat.hashCode()
        result = 31 * result + this.DefaultCompressionLevel.hashCode()
        result = 31 * result + this.DefaultCompressionChunkSizeBytes.hashCode()
        result = 31 * result + this.VolumeClusterSizeBytes.hashCode()
        result = 31 * result + this.TotalVolumeClusters.hashCode()
        result = 31 * result + this.TotalAllocatedClusters.hashCode()
        result = 31 * result + this.TotalCompressibleClustersAllocated.hashCode()
        result = 31 * result + this.TotalCompressibleClustersInUse.hashCode()
        result = 31 * result + this.TotalCompressedClusters.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class REFS_QUERY_VOLUME_DEDUP_INFO_OUTPUT_BUFFER(public var Enabled: Boolean = false)

public data class REFS_REMOVE_HARDLINK_BACKPOINTER(
    public var ParentDirectory: ULong = 0uL,
    public var Reserved: ULong = 0uL,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_REMOVE_HARDLINK_BACKPOINTER) return false
        if (this.ParentDirectory != other.ParentDirectory) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ParentDirectory.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class REFS_SET_VOLUME_COMPRESSION_INFO_INPUT_BUFFER(
    public var CompressionFormat: REFS_COMPRESSION_FORMATS = 0,
    public var CompressionLevel: Short = 0,
    public var CompressionChunkSizeBytes: UInt = 0u,
    public var Flags: REFS_SET_VOLUME_COMPRESSION_INFO_FLAGS = 0,
    public var Reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_SET_VOLUME_COMPRESSION_INFO_INPUT_BUFFER) return false
        if (this.CompressionFormat != other.CompressionFormat) return false
        if (this.CompressionLevel != other.CompressionLevel) return false
        if (this.CompressionChunkSizeBytes != other.CompressionChunkSizeBytes) return false
        if (this.Flags != other.Flags) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CompressionFormat.hashCode()
        result = 31 * result + this.CompressionLevel.hashCode()
        result = 31 * result + this.CompressionChunkSizeBytes.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class REFS_SET_VOLUME_DEDUP_INFO_INPUT_BUFFER(public var Enable: Boolean = false)

public data class REFS_STREAM_EXTENT(
    public var Vcn: Long = 0L,
    public var Lcn: Long = 0L,
    public var Length: Long = 0L,
    public var Properties: UShort = 0u,
)

public data class REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER(
    public var EntryCount: UInt = 0u,
    public var BufferSizeRequiredForQuery: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(2),
    public var Entries: List<REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER_ENTRY> = List(1) { REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER_ENTRY() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER) return false
        if (this.EntryCount != other.EntryCount) return false
        if (this.BufferSizeRequiredForQuery != other.BufferSizeRequiredForQuery) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Entries != other.Entries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EntryCount.hashCode()
        result = 31 * result + this.BufferSizeRequiredForQuery.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Entries.hashCode()
        return result
    }
}

public data class REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER_ENTRY(
    public var NextEntryOffset: UInt = 0u,
    public var SnapshotNameLength: UShort = 0u,
    public var SnapshotCreationTime: ULong = 0uL,
    public var StreamSize: ULong = 0uL,
    public var StreamAllocationSize: ULong = 0uL,
    public var Reserved: ULongArray = ULongArray(2),
    public var SnapshotName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER_ENTRY) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.SnapshotNameLength != other.SnapshotNameLength) return false
        if (this.SnapshotCreationTime != other.SnapshotCreationTime) return false
        if (this.StreamSize != other.StreamSize) return false
        if (this.StreamAllocationSize != other.StreamAllocationSize) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.SnapshotName.contentEquals(other.SnapshotName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.SnapshotNameLength.hashCode()
        result = 31 * result + this.SnapshotCreationTime.hashCode()
        result = 31 * result + this.StreamSize.hashCode()
        result = 31 * result + this.StreamAllocationSize.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.SnapshotName.contentHashCode()
        return result
    }
}

public data class REFS_STREAM_SNAPSHOT_MANAGEMENT_INPUT_BUFFER(
    public var Operation: REFS_STREAM_SNAPSHOT_OPERATION = 0,
    public var SnapshotNameLength: UShort = 0u,
    public var OperationInputBufferLength: UShort = 0u,
    public var Reserved: ULongArray = ULongArray(2),
    public var NameAndInputBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_STREAM_SNAPSHOT_MANAGEMENT_INPUT_BUFFER) return false
        if (this.Operation != other.Operation) return false
        if (this.SnapshotNameLength != other.SnapshotNameLength) return false
        if (this.OperationInputBufferLength != other.OperationInputBufferLength) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.NameAndInputBuffer.contentEquals(other.NameAndInputBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Operation.hashCode()
        result = 31 * result + this.SnapshotNameLength.hashCode()
        result = 31 * result + this.OperationInputBufferLength.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.NameAndInputBuffer.contentHashCode()
        return result
    }
}

public data class REFS_STREAM_SNAPSHOT_QUERY_DELTAS_INPUT_BUFFER(
    public var StartingVcn: Long = 0L,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class REFS_STREAM_SNAPSHOT_QUERY_DELTAS_OUTPUT_BUFFER(
    public var ExtentCount: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(2),
    public var Extents: List<REFS_STREAM_EXTENT> = List(1) { REFS_STREAM_EXTENT() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_STREAM_SNAPSHOT_QUERY_DELTAS_OUTPUT_BUFFER) return false
        if (this.ExtentCount != other.ExtentCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Extents != other.Extents) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ExtentCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Extents.hashCode()
        return result
    }
}

public data class REFS_VOLUME_COUNTER_INFO_INPUT_BUFFER(public var ResetCounters: Boolean = false)

public data class REFS_VOLUME_DATA_BUFFER(
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
    public var Reserved: LongArray = LongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REFS_VOLUME_DATA_BUFFER) return false
        if (this.ByteCount != other.ByteCount) return false
        if (this.MajorVersion != other.MajorVersion) return false
        if (this.MinorVersion != other.MinorVersion) return false
        if (this.BytesPerPhysicalSector != other.BytesPerPhysicalSector) return false
        if (this.VolumeSerialNumber != other.VolumeSerialNumber) return false
        if (this.NumberSectors != other.NumberSectors) return false
        if (this.TotalClusters != other.TotalClusters) return false
        if (this.FreeClusters != other.FreeClusters) return false
        if (this.TotalReserved != other.TotalReserved) return false
        if (this.BytesPerSector != other.BytesPerSector) return false
        if (this.BytesPerCluster != other.BytesPerCluster) return false
        if (this.MaximumSizeOfResidentFile != other.MaximumSizeOfResidentFile) return false
        if (this.FastTierDataFillRatio != other.FastTierDataFillRatio) return false
        if (this.SlowTierDataFillRatio != other.SlowTierDataFillRatio) return false
        if (this.DestagesFastTierToSlowTierRate != other.DestagesFastTierToSlowTierRate) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ByteCount.hashCode()
        result = 31 * result + this.MajorVersion.hashCode()
        result = 31 * result + this.MinorVersion.hashCode()
        result = 31 * result + this.BytesPerPhysicalSector.hashCode()
        result = 31 * result + this.VolumeSerialNumber.hashCode()
        result = 31 * result + this.NumberSectors.hashCode()
        result = 31 * result + this.TotalClusters.hashCode()
        result = 31 * result + this.FreeClusters.hashCode()
        result = 31 * result + this.TotalReserved.hashCode()
        result = 31 * result + this.BytesPerSector.hashCode()
        result = 31 * result + this.BytesPerCluster.hashCode()
        result = 31 * result + this.MaximumSizeOfResidentFile.hashCode()
        result = 31 * result + this.FastTierDataFillRatio.hashCode()
        result = 31 * result + this.SlowTierDataFillRatio.hashCode()
        result = 31 * result + this.DestagesFastTierToSlowTierRate.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class REMOTE_LINK_TRACKING_INFORMATION(
    public var TargetFileObject: Long = 0L,
    public var TargetLinkTrackingInformationLength: UInt = 0u,
    public var TargetLinkTrackingInformationBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REMOTE_LINK_TRACKING_INFORMATION) return false
        if (this.TargetFileObject != other.TargetFileObject) return false
        if (this.TargetLinkTrackingInformationLength != other.TargetLinkTrackingInformationLength) return false
        if (!this.TargetLinkTrackingInformationBuffer.contentEquals(other.TargetLinkTrackingInformationBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TargetFileObject.hashCode()
        result = 31 * result + this.TargetLinkTrackingInformationLength.hashCode()
        result = 31 * result + this.TargetLinkTrackingInformationBuffer.contentHashCode()
        return result
    }
}

public data class REPARSE_DATA_BUFFER(
    public var ReparseTag: UInt = 0u,
    public var ReparseDataLength: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Anonymous: REPARSE_DATA_BUFFER_0 = REPARSE_DATA_BUFFER_0(),
)

public data class REPARSE_DATA_BUFFER_0(
    public var SymbolicLinkReparseBuffer: REPARSE_DATA_BUFFER_0_0 = REPARSE_DATA_BUFFER_0_0(),
    public var MountPointReparseBuffer: REPARSE_DATA_BUFFER_0_1 = REPARSE_DATA_BUFFER_0_1(),
    public var GenericReparseBuffer: REPARSE_DATA_BUFFER_0_2 = REPARSE_DATA_BUFFER_0_2(),
)

public data class REPARSE_DATA_BUFFER_0_2(public var DataBuffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REPARSE_DATA_BUFFER_0_2) return false
        if (!this.DataBuffer.contentEquals(other.DataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DataBuffer.contentHashCode()
    }
}

public data class REPARSE_DATA_BUFFER_0_1(
    public var SubstituteNameOffset: UShort = 0u,
    public var SubstituteNameLength: UShort = 0u,
    public var PrintNameOffset: UShort = 0u,
    public var PrintNameLength: UShort = 0u,
    public var PathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REPARSE_DATA_BUFFER_0_1) return false
        if (this.SubstituteNameOffset != other.SubstituteNameOffset) return false
        if (this.SubstituteNameLength != other.SubstituteNameLength) return false
        if (this.PrintNameOffset != other.PrintNameOffset) return false
        if (this.PrintNameLength != other.PrintNameLength) return false
        if (!this.PathBuffer.contentEquals(other.PathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SubstituteNameOffset.hashCode()
        result = 31 * result + this.SubstituteNameLength.hashCode()
        result = 31 * result + this.PrintNameOffset.hashCode()
        result = 31 * result + this.PrintNameLength.hashCode()
        result = 31 * result + this.PathBuffer.contentHashCode()
        return result
    }
}

public data class REPARSE_DATA_BUFFER_0_0(
    public var SubstituteNameOffset: UShort = 0u,
    public var SubstituteNameLength: UShort = 0u,
    public var PrintNameOffset: UShort = 0u,
    public var PrintNameLength: UShort = 0u,
    public var Flags: UInt = 0u,
    public var PathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is REPARSE_DATA_BUFFER_0_0) return false
        if (this.SubstituteNameOffset != other.SubstituteNameOffset) return false
        if (this.SubstituteNameLength != other.SubstituteNameLength) return false
        if (this.PrintNameOffset != other.PrintNameOffset) return false
        if (this.PrintNameLength != other.PrintNameLength) return false
        if (this.Flags != other.Flags) return false
        if (!this.PathBuffer.contentEquals(other.PathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SubstituteNameOffset.hashCode()
        result = 31 * result + this.SubstituteNameLength.hashCode()
        result = 31 * result + this.PrintNameOffset.hashCode()
        result = 31 * result + this.PrintNameLength.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.PathBuffer.contentHashCode()
        return result
    }
}

public data class REPARSE_DATA_BUFFER_EX(
    public var Flags: UInt = 0u,
    public var ExistingReparseTag: UInt = 0u,
    public var ExistingReparseGuid: GUID = GUID(),
    public var Reserved: ULong = 0uL,
    public var Anonymous: REPARSE_DATA_BUFFER_EX_0 = REPARSE_DATA_BUFFER_EX_0(),
)

public data class REPARSE_DATA_BUFFER_EX_0(public var ReparseDataBuffer: REPARSE_DATA_BUFFER = REPARSE_DATA_BUFFER(), public var ReparseGuidDataBuffer: Win32.Storage.FileSystem.REPARSE_GUID_DATA_BUFFER = Win32.Storage.FileSystem.REPARSE_GUID_DATA_BUFFER())

public data class REPARSE_INDEX_KEY(public var FileReparseTag: UInt = 0u, public var FileId: Long = 0L)

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

public data class RKF_BYPASS_ECP_CONTEXT(public var Reserved: Int = 0, public var Version: Int = 0)

public data class RTL_HEAP_MEMORY_LIMIT_DATA(
    public var CommitLimitBytes: ULong = 0uL,
    public var CommitLimitFailureCode: ULong = 0uL,
    public var MaxAllocationSizeBytes: ULong = 0uL,
    public var AllocationLimitFailureCode: ULong = 0uL,
)

public data class RTL_HEAP_MEMORY_LIMIT_INFO(public var Version: UInt = 0u, public var Data: RTL_HEAP_MEMORY_LIMIT_DATA = RTL_HEAP_MEMORY_LIMIT_DATA())

public data class RTL_HEAP_PARAMETERS(
    public var Length: UInt = 0u,
    public var SegmentReserve: ULong = 0uL,
    public var SegmentCommit: ULong = 0uL,
    public var DeCommitFreeBlockThreshold: ULong = 0uL,
    public var DeCommitTotalFreeThreshold: ULong = 0uL,
    public var MaximumAllocationSize: ULong = 0uL,
    public var VirtualMemoryThreshold: ULong = 0uL,
    public var InitialCommit: ULong = 0uL,
    public var InitialReserve: ULong = 0uL,
    public var CommitRoutine: PRTL_HEAP_COMMIT_ROUTINE = null,
    public var Reserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RTL_HEAP_PARAMETERS) return false
        if (this.Length != other.Length) return false
        if (this.SegmentReserve != other.SegmentReserve) return false
        if (this.SegmentCommit != other.SegmentCommit) return false
        if (this.DeCommitFreeBlockThreshold != other.DeCommitFreeBlockThreshold) return false
        if (this.DeCommitTotalFreeThreshold != other.DeCommitTotalFreeThreshold) return false
        if (this.MaximumAllocationSize != other.MaximumAllocationSize) return false
        if (this.VirtualMemoryThreshold != other.VirtualMemoryThreshold) return false
        if (this.InitialCommit != other.InitialCommit) return false
        if (this.InitialReserve != other.InitialReserve) return false
        if (this.CommitRoutine != other.CommitRoutine) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.SegmentReserve.hashCode()
        result = 31 * result + this.SegmentCommit.hashCode()
        result = 31 * result + this.DeCommitFreeBlockThreshold.hashCode()
        result = 31 * result + this.DeCommitTotalFreeThreshold.hashCode()
        result = 31 * result + this.MaximumAllocationSize.hashCode()
        result = 31 * result + this.VirtualMemoryThreshold.hashCode()
        result = 31 * result + this.InitialCommit.hashCode()
        result = 31 * result + this.InitialReserve.hashCode()
        result = 31 * result + this.CommitRoutine.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class RTL_NLS_STATE(
    public var DefaultAcpTableInfo: CPTABLEINFO = CPTABLEINFO(),
    public var DefaultOemTableInfo: CPTABLEINFO = CPTABLEINFO(),
    public var ActiveCodePageData: Long = 0L,
    public var OemCodePageData: Long = 0L,
    public var LeadByteInfo: Long = 0L,
    public var OemLeadByteInfo: Long = 0L,
    public var CaseMappingData: Long = 0L,
    public var UnicodeUpcaseTable844: Long = 0L,
    public var UnicodeLowercaseTable844: Long = 0L,
)

public data class RTL_SEGMENT_HEAP_MEMORY_SOURCE(
    public var Flags: UInt = 0u,
    public var MemoryTypeMask: UInt = 0u,
    public var NumaNode: UInt = 0u,
    public var Anonymous: RTL_SEGMENT_HEAP_MEMORY_SOURCE_0 = RTL_SEGMENT_HEAP_MEMORY_SOURCE_0(),
    public var Reserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RTL_SEGMENT_HEAP_MEMORY_SOURCE) return false
        if (this.Flags != other.Flags) return false
        if (this.MemoryTypeMask != other.MemoryTypeMask) return false
        if (this.NumaNode != other.NumaNode) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.MemoryTypeMask.hashCode()
        result = 31 * result + this.NumaNode.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class RTL_SEGMENT_HEAP_MEMORY_SOURCE_0(public var PartitionHandle: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(), public var Callbacks: Long = 0L)

public data class RTL_SEGMENT_HEAP_PARAMETERS(
    public var Version: UShort = 0u,
    public var Size: UShort = 0u,
    public var Flags: UInt = 0u,
    public var MemorySource: RTL_SEGMENT_HEAP_MEMORY_SOURCE = RTL_SEGMENT_HEAP_MEMORY_SOURCE(),
    public var Reserved: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RTL_SEGMENT_HEAP_PARAMETERS) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.MemorySource != other.MemorySource) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.MemorySource.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class RTL_SEGMENT_HEAP_VA_CALLBACKS(
    public var CallbackContext: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(),
    public var AllocateVirtualMemory: PALLOCATE_VIRTUAL_MEMORY_EX_CALLBACK = null,
    public var FreeVirtualMemory: PFREE_VIRTUAL_MEMORY_EX_CALLBACK = null,
    public var QueryVirtualMemory: PQUERY_VIRTUAL_MEMORY_CALLBACK = null,
)

public data class SECURITY_CLIENT_CONTEXT(
    public var SecurityQos: Win32.Security.SECURITY_QUALITY_OF_SERVICE = Win32.Security.SECURITY_QUALITY_OF_SERVICE(),
    public var ClientToken: Long = 0L,
    public var DirectlyAccessClientToken: Boolean = false,
    public var DirectAccessEffectiveOnly: Boolean = false,
    public var ServerIsRemote: Boolean = false,
    public var ClientTokenControl: Win32.Security.TOKEN_CONTROL = Win32.Security.TOKEN_CONTROL(),
)

public data class SEC_APPLICATION_PROTOCOLS(public var ProtocolListsSize: UInt = 0u, public var ProtocolLists: List<Win32.Security.Authentication.Identity.SEC_APPLICATION_PROTOCOL_LIST> = List(1) { Win32.Security.Authentication.Identity.SEC_APPLICATION_PROTOCOL_LIST() })

public data class SEC_DTLS_MTU(public var PathMTU: UShort = 0u)
