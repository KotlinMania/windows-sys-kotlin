// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.SECURITY_ATTRIBUTES

public typealias COMPRESSION_FORMAT = UShort
public const val COMPRESSION_FORMAT_NONE: COMPRESSION_FORMAT = 0u
public const val COMPRESSION_FORMAT_DEFAULT: COMPRESSION_FORMAT = 1u
public const val COMPRESSION_FORMAT_LZNT1: COMPRESSION_FORMAT = 2u
public const val COMPRESSION_FORMAT_XPRESS: COMPRESSION_FORMAT = 3u
public const val COMPRESSION_FORMAT_XPRESS_HUFF: COMPRESSION_FORMAT = 4u

public typealias FILE_DISPOSITION_INFO_EX_FLAGS = UInt

public data class FILE_ID_128(
    public var Identifier: UByteArray = UByteArray(16),
)

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

public data class CREATEFILE2_EXTENDED_PARAMETERS(
    public var dwSize: UInt = 0u,
    public var dwFileAttributes: UInt = 0u,
    public var dwFileFlags: UInt = 0u,
    public var dwSecurityQosFlags: UInt = 0u,
    public var lpSecurityAttributes: SECURITY_ATTRIBUTES? = null,
    public var hTemplateFile: HANDLE = 0L,
)

public data class OFSTRUCT(
    public var cBytes: UByte = 0u,
    public var fFixedDisk: UByte = 0u,
    public var nErrCode: UShort = 0u,
    public var Reserved1: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var szPathName: ByteArray = ByteArray(128),
)

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
)

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
)

public data class WIN32_FIND_STREAM_DATA(
    public var StreamSize: Long = 0L,
    public var cStreamName: UShortArray = UShortArray(296),
)

public data class FILE_ALIGNMENT_INFO(
    public var AlignmentRequirement: UInt = 0u,
)

public data class FILE_ALLOCATION_INFO(
    public var AllocationSize: Long = 0L,
)

public data class FILE_ATTRIBUTE_TAG_INFO(
    public var FileAttributes: UInt = 0u,
    public var ReparseTag: UInt = 0u,
)

public data class FILE_BASIC_INFO(
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var FileAttributes: UInt = 0u,
)

public data class FILE_CASE_SENSITIVE_INFO(
    public var Flags: UInt = 0u,
)

public data class FILE_COMPRESSION_INFO(
    public var CompressedFileSize: Long = 0L,
    public var CompressionFormat: COMPRESSION_FORMAT = 0u,
    public var CompressionUnitShift: UByte = 0u,
    public var ChunkShift: UByte = 0u,
    public var ClusterShift: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
)

public data class FILE_DISPOSITION_INFO(
    public var DeleteFile: Boolean = false,
)

public data class FILE_DISPOSITION_INFO_EX(
    public var Flags: FILE_DISPOSITION_INFO_EX_FLAGS = 0u,
)

public data class FILE_END_OF_FILE_INFO(
    public var EndOfFile: Long = 0L,
)

public data class FILE_EXTENT(
    public var VolumeOffset: ULong = 0uL,
    public var ExtentLength: ULong = 0uL,
)

public data class FILE_ID_INFO(
    public var VolumeSerialNumber: ULong = 0uL,
    public var FileId: FILE_ID_128 = FILE_ID_128(),
)

public data class FILE_NAME_INFO(
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
)

public data class FILE_RENAME_INFO(
    public var RootDirectory: HANDLE = 0L,
    public var FileNameLength: UInt = 0u,
    public var FileName: UShortArray = UShortArray(1),
)

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
)
