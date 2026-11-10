package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ACCESS_ALL: ShareInfoPermissions = 32768u

public val ACCESS_ATRIB: ShareInfoPermissions = 32u

public val ACCESS_CREATE: ShareInfoPermissions = 4u

public val ACCESS_DELETE: ShareInfoPermissions = 16u

public val ACCESS_EXEC: ShareInfoPermissions = 8u

public val ACCESS_PERM: ShareInfoPermissions = 64u

public val ACCESS_READ: ShareInfoPermissions = 1u

public val ACCESS_WRITE: ShareInfoPermissions = 2u

public val BACKUP_ALTERNATE_DATA: WinStreamId = 4u

public val BACKUP_DATA: WinStreamId = 1u

public val BACKUP_EA_DATA: WinStreamId = 2u

public val BACKUP_LINK: WinStreamId = 5u

public val BACKUP_OBJECT_ID: WinStreamId = 7u

public val BACKUP_PROPERTY_DATA: WinStreamId = 6u

public val BACKUP_REPARSE_DATA: WinStreamId = 8u

public val BACKUP_SECURITY_DATA: WinStreamId = 3u

public val BACKUP_SPARSE_BLOCK: WinStreamId = 9u

public val BACKUP_TXFS_DATA: WinStreamId = 10u

public val BUS_TYPE1394: StorageBusType = 4

public val BUS_TYPE_ATA: StorageBusType = 3

public val BUS_TYPE_ATAPI: StorageBusType = 2

public val BUS_TYPE_FIBRE: StorageBusType = 6

public val BUS_TYPE_FILE_BACKED_VIRTUAL: StorageBusType = 15

public val BUS_TYPE_MAX: StorageBusType = 20

public val BUS_TYPE_MAX_RESERVED: StorageBusType = 127

public val BUS_TYPE_MMC: StorageBusType = 13

public val BUS_TYPE_NVME: StorageBusType = 17

public val BUS_TYPE_RAID: StorageBusType = 8

public val BUS_TYPE_SCM: StorageBusType = 18

public val BUS_TYPE_SAS: StorageBusType = 10

public val BUS_TYPE_SATA: StorageBusType = 11

public val BUS_TYPE_SCSI: StorageBusType = 1

public val BUS_TYPE_SD: StorageBusType = 12

public val BUS_TYPE_SPACES: StorageBusType = 16

public val BUS_TYPE_SSA: StorageBusType = 5

public val BUS_TYPE_UFS: StorageBusType = 19

public val BUS_TYPE_UNKNOWN: StorageBusType = 0

public val BUS_TYPE_USB: StorageBusType = 7

public val BUS_TYPE_VIRTUAL: StorageBusType = 14

public val BUS_TYPEI_SCSI: StorageBusType = 9

public val CALLBACK_CHUNK_FINISHED: LpprogressRoutineCallbackReason = 0u

public val CALLBACK_STREAM_SWITCH: LpprogressRoutineCallbackReason = 1u

public val CLFS_BASELOG_EXTENSION: Pcwstr = w(".blf")

public val CLFS_CONTAINER_RELATIVE_PREFIX: Pcwstr = w("%BLF%\\")

public val CLFS_CONTAINER_STREAM_PREFIX: Pcwstr = w("%BLF%:")

public val CLFS_FLAG_FILTER_INTERMEDIATE_LEVEL: UInt = 16u

public val CLFS_FLAG_FILTER_TOP_LEVEL: UInt = 32u

public val CLFS_FLAG_FORCE_APPEND: ClfsFlag = 1u

public val CLFS_FLAG_FORCE_FLUSH: ClfsFlag = 2u

public val CLFS_FLAG_HIDDEN_SYSTEM_LOG: UInt = 512u

public val CLFS_FLAG_IGNORE_SHARE_ACCESS: UInt = 64u

public val CLFS_FLAG_MINIFILTER_LEVEL: UInt = 256u

public val CLFS_FLAG_NON_REENTRANT_FILTER: UInt = 16u

public val CLFS_FLAG_NO_FLAGS: ClfsFlag = 0u

public val CLFS_FLAG_READ_IN_PROGRESS: UInt = 128u

public val CLFS_FLAG_REENTRANT_FILE_SYSTEM: UInt = 8u

public val CLFS_FLAG_REENTRANT_FILTER: UInt = 32u

public val CLFS_FLAG_USE_RESERVATION: ClfsFlag = 4u

public val CLFS_MARSHALLING_FLAG_DISABLE_BUFF_INIT: UInt = 1u

public val CLFS_MARSHALLING_FLAG_NONE: UInt = 0u

public val CLFS_MAX_CONTAINER_INFO: UInt = 256u

public val CLFS_MGMT_CLIENT_REGISTRATION_VERSION: UInt = 1u

public val CLFS_MGMT_POLICY_VERSION: UInt = 1u

public val CLFS_SCAN_BACKWARD: UByte = 4u.toUByte()

public val CLFS_SCAN_BUFFERED: UByte = 32u.toUByte()

public val CLFS_SCAN_CLOSE: UByte = 8u.toUByte()

public val CLFS_SCAN_FORWARD: UByte = 2u.toUByte()

public val CLFS_SCAN_INIT: UByte = 1u.toUByte()

public val CLFS_SCAN_INITIALIZED: UByte = 16u.toUByte()

public val CLSID_DISK_QUOTA_CONTROL: Guid = Guid.fromU128(U128(0x7988b571ec8911cfuL, 0x9c0000aa00a14f56uL))

public val COMPRESSION_FORMAT_DEFAULT: CompressionFormat = 1u.toUShort()

public val COMPRESSION_FORMAT_LZNT1: CompressionFormat = 2u.toUShort()

public val COMPRESSION_FORMAT_NONE: CompressionFormat = 0u.toUShort()

public val COMPRESSION_FORMAT_XP10: CompressionFormat = 5u.toUShort()

public val COMPRESSION_FORMAT_XPRESS: CompressionFormat = 3u.toUShort()

public val COMPRESSION_FORMAT_XPRESS_HUFF: CompressionFormat = 4u.toUShort()

public val COPYFILE2_CALLBACK_CHUNK_FINISHED: Copyfile2MessageType = 2

public val COPYFILE2_CALLBACK_CHUNK_STARTED: Copyfile2MessageType = 1

public val COPYFILE2_CALLBACK_ERROR: Copyfile2MessageType = 6

public val COPYFILE2_CALLBACK_MAX: Copyfile2MessageType = 7

public val COPYFILE2_CALLBACK_NONE: Copyfile2MessageType = 0

public val COPYFILE2_CALLBACK_POLL_CONTINUE: Copyfile2MessageType = 5

public val COPYFILE2_CALLBACK_STREAM_FINISHED: Copyfile2MessageType = 4

public val COPYFILE2_CALLBACK_STREAM_STARTED: Copyfile2MessageType = 3

public val COPYFILE2_IO_CYCLE_SIZE_MAX: UInt = 1073741824u

public val COPYFILE2_IO_CYCLE_SIZE_MIN: UInt = 4096u

public val COPYFILE2_IO_RATE_MIN: UInt = 512u

public val COPYFILE2_MESSAGE_COPY_OFFLOAD: Int = 1

public val COPYFILE2_PHASE_MAX: Copyfile2CopyPhase = 7

public val COPYFILE2_PHASE_NAMEGRAFT_COPY: Copyfile2CopyPhase = 6

public val COPYFILE2_PHASE_NONE: Copyfile2CopyPhase = 0

public val COPYFILE2_PHASE_PREPARE_DEST: Copyfile2CopyPhase = 2

public val COPYFILE2_PHASE_PREPARE_SOURCE: Copyfile2CopyPhase = 1

public val COPYFILE2_PHASE_READ_SOURCE: Copyfile2CopyPhase = 3

public val COPYFILE2_PHASE_SERVER_COPY: Copyfile2CopyPhase = 5

public val COPYFILE2_PHASE_WRITE_DESTINATION: Copyfile2CopyPhase = 4

public val COPYFILE2_PROGRESS_CANCEL: Copyfile2MessageAction = 1

public val COPYFILE2_PROGRESS_CONTINUE: Copyfile2MessageAction = 0

public val COPYFILE2_PROGRESS_PAUSE: Copyfile2MessageAction = 4

public val COPYFILE2_PROGRESS_QUIET: Copyfile2MessageAction = 3

public val COPYFILE2_PROGRESS_STOP: Copyfile2MessageAction = 2

public val COPY_FILE2_V2_DONT_COPY_JUNCTIONS: Copyfile2V2Flags = 1u

public val COPY_FILE2_V2_VALID_FLAGS: Copyfile2V2Flags = 1u

public val COPY_FILE_ALLOW_DECRYPTED_DESTINATION: CopyfileFlags = 8u

public val COPY_FILE_COPY_SYMLINK: CopyfileFlags = 2048u

public val COPY_FILE_DIRECTORY: CopyfileFlags = 128u

public val COPY_FILE_DISABLE_PRE_ALLOCATION: CopyfileFlags = 67108864u

public val COPY_FILE_DONT_REQUEST_DEST_WRITE_DAC: CopyfileFlags = 33554432u

public val COPY_FILE_ENABLE_LOW_FREE_SPACE_MODE: CopyfileFlags = 134217728u

public val COPY_FILE_ENABLE_SPARSE_COPY: CopyfileFlags = 536870912u

public val COPY_FILE_FAIL_IF_EXISTS: CopyfileFlags = 1u

public val COPY_FILE_IGNORE_EDP_BLOCK: CopyfileFlags = 4194304u

public val COPY_FILE_IGNORE_SOURCE_ENCRYPTION: CopyfileFlags = 8388608u

public val COPY_FILE_NO_BUFFERING: CopyfileFlags = 4096u

public val COPY_FILE_NO_OFFLOAD: CopyfileFlags = 262144u

public val COPY_FILE_OPEN_AND_COPY_REPARSE_POINT: CopyfileFlags = 2097152u

public val COPY_FILE_OPEN_SOURCE_FOR_WRITE: CopyfileFlags = 4u

public val COPY_FILE_REQUEST_COMPRESSED_TRAFFIC: CopyfileFlags = 268435456u

public val COPY_FILE_REQUEST_SECURITY_PRIVILEGES: CopyfileFlags = 8192u

public val COPY_FILE_RESTARTABLE: CopyfileFlags = 2u

public val COPY_FILE_RESUME_FROM_PAUSE: CopyfileFlags = 16384u

public val COPY_FILE_SKIP_ALTERNATE_STREAMS: CopyfileFlags = 32768u

public val CREATE_ALWAYS: FileCreationDisposition = 2u

public val CREATE_NEW: FileCreationDisposition = 1u

public val CRM_PROTOCOL_DYNAMIC_MARSHAL_INFO: UInt = 2u

public val CRM_PROTOCOL_EXPLICIT_MARSHAL_ONLY: UInt = 1u

public val CRM_PROTOCOL_MAXIMUM_OPTION: UInt = 3u

public val CSC_CACHE_AUTO_REINT: UInt = 16u

public val CSC_CACHE_MANUAL_REINT: UInt = 0u

public val CSC_CACHE_NONE: UInt = 48u

public val CSC_CACHE_VDO: UInt = 32u

public val CSC_MASK: UInt = 48u

public val CSC_MASK_EXT: UInt = 8240u

public val CSV_BLOCK_AND_FILE_CACHE_CALLBACK_VERSION: UInt = 2u

public val CSV_BLOCK_CACHE_CALLBACK_VERSION: UInt = 1u

public val CLFS_CLIENT_RECORD: UByte = 3u.toUByte()

public val CLFS_CONTAINER_ACTIVE: UInt = 4u

public val CLFS_CONTAINER_ACTIVE_PENDING_DELETE: UInt = 8u

public val CLFS_CONTAINER_INACTIVE: UInt = 2u

public val CLFS_CONTAINER_INITIALIZING: UInt = 1u

public val CLFS_CONTAINER_PENDING_ARCHIVE: UInt = 16u

public val CLFS_CONTAINER_PENDING_ARCHIVE_AND_DELETE: UInt = 32u

public val CLFS_CONTEXT_FORWARD: ClfsContextMode = 3

public val CLFS_CONTEXT_NONE: ClfsContextMode = 0

public val CLFS_CONTEXT_PREVIOUS: ClfsContextMode = 2

public val CLFS_CONTEXT_UNDO_NEXT: ClfsContextMode = 1

public val CLFS_DATA_RECORD: UByte = 1u.toUByte()

public val CLFS_IO_STATS_DEFAULT: ClfsIostatsClass = 0

public val CLFS_IO_STATS_MAX: ClfsIostatsClass = 65535

public val CLFS_LOG_ARCHIVE_DISABLED: ClfsLogArchiveMode = 2

public val CLFS_LOG_ARCHIVE_ENABLED: ClfsLogArchiveMode = 1

public val CLFS_LOG_BASIC_INFORMATION: ClsLogInformationClass = 0

public val CLFS_LOG_BASIC_INFORMATION_PHYSICAL: ClsLogInformationClass = 1

public val CLFS_LOG_PHYSICAL_LSN_INFORMATION: ClsLogInformationClass = 5

public val CLFS_LOG_PHYSICAL_NAME_INFORMATION: ClsLogInformationClass = 2

public val CLFS_LOG_STREAM_IDENTIFIER_INFORMATION: ClsLogInformationClass = 3

public val CLFS_LOG_SYSTEM_MARKING_INFORMATION: ClsLogInformationClass = 4

public val CLFS_MGMT_ADVANCE_TAIL_NOTIFICATION: ClfsMgmtNotificationType = 0

public val CLFS_MGMT_LOG_FULL_HANDLER_NOTIFICATION: ClfsMgmtNotificationType = 1

public val CLFS_MGMT_LOG_UNPINNED_NOTIFICATION: ClfsMgmtNotificationType = 2

public val CLFS_MGMT_LOG_WRITE_NOTIFICATION: ClfsMgmtNotificationType = 3

public val CLFS_MGMT_POLICY_AUTO_GROW: ClfsMgmtPolicyType = 6

public val CLFS_MGMT_POLICY_AUTO_SHRINK: ClfsMgmtPolicyType = 5

public val CLFS_MGMT_POLICY_GROWTH_RATE: ClfsMgmtPolicyType = 3

public val CLFS_MGMT_POLICY_INVALID: ClfsMgmtPolicyType = 10

public val CLFS_MGMT_POLICY_LOG_TAIL: ClfsMgmtPolicyType = 4

public val CLFS_MGMT_POLICY_MAXIMUM_SIZE: ClfsMgmtPolicyType = 0

public val CLFS_MGMT_POLICY_MINIMUM_SIZE: ClfsMgmtPolicyType = 1

public val CLFS_MGMT_POLICY_NEW_CONTAINER_EXTENSION: ClfsMgmtPolicyType = 9

public val CLFS_MGMT_POLICY_NEW_CONTAINER_PREFIX: ClfsMgmtPolicyType = 7

public val CLFS_MGMT_POLICY_NEW_CONTAINER_SIZE: ClfsMgmtPolicyType = 2

public val CLFS_MGMT_POLICY_NEW_CONTAINER_SUFFIX: ClfsMgmtPolicyType = 8

public val CLFS_NULL_RECORD: UByte = 0u.toUByte()

public val CLFS_RESTART_RECORD: UByte = 2u.toUByte()

public val CLS_CONTAINER_ACTIVE: UInt = 4u

public val CLS_CONTAINER_ACTIVE_PENDING_DELETE: UInt = 8u

public val CLS_CONTAINER_INACTIVE: UInt = 2u

public val CLS_CONTAINER_INITIALIZING: UInt = 1u

public val CLS_CONTAINER_PENDING_ARCHIVE: UInt = 16u

public val CLS_CONTAINER_PENDING_ARCHIVE_AND_DELETE: UInt = 32u

public val CLS_CONTEXT_FORWARD: ClsContextMode = 3

public val CLS_CONTEXT_NONE: ClsContextMode = 0

public val CLS_CONTEXT_PREVIOUS: ClsContextMode = 2

public val CLS_CONTEXT_UNDO_NEXT: ClsContextMode = 1

public val CLS_IO_STATS_DEFAULT: ClsIostatsClass = 0

public val CLS_IO_STATS_MAX: ClsIostatsClass = 65535

public val DDD_EXACT_MATCH_ON_REMOVE: DefineDosDeviceFlags = 4u

public val DDD_LUID_BROADCAST_DRIVE: DefineDosDeviceFlags = 16u

public val DDD_NO_BROADCAST_SYSTEM: DefineDosDeviceFlags = 8u

public val DDD_RAW_TARGET_PATH: DefineDosDeviceFlags = 1u

public val DDD_REMOVE_DEFINITION: DefineDosDeviceFlags = 2u

public val DELETE: FileAccessRights = 65536u

public val DISKQUOTA_FILESTATE_INCOMPLETE: UInt = 256u

public val DISKQUOTA_FILESTATE_MASK: UInt = 768u

public val DISKQUOTA_FILESTATE_REBUILDING: UInt = 512u

public val DISKQUOTA_LOGFLAG_USER_LIMIT: UInt = 2u

public val DISKQUOTA_LOGFLAG_USER_THRESHOLD: UInt = 1u

public val DISKQUOTA_STATE_DISABLED: UInt = 0u

public val DISKQUOTA_STATE_ENFORCE: UInt = 2u

public val DISKQUOTA_STATE_MASK: UInt = 3u

public val DISKQUOTA_STATE_TRACK: UInt = 1u

public val DISKQUOTA_USERNAME_RESOLVE_ASYNC: DiskquotaUsernameResolve = 2u

public val DISKQUOTA_USERNAME_RESOLVE_NONE: DiskquotaUsernameResolve = 0u

public val DISKQUOTA_USERNAME_RESOLVE_SYNC: DiskquotaUsernameResolve = 1u

public val DISKQUOTA_USER_ACCOUNT_DELETED: UInt = 2u

public val DISKQUOTA_USER_ACCOUNT_INVALID: UInt = 3u

public val DISKQUOTA_USER_ACCOUNT_RESOLVED: UInt = 0u

public val DISKQUOTA_USER_ACCOUNT_UNAVAILABLE: UInt = 1u

public val DISKQUOTA_USER_ACCOUNT_UNKNOWN: UInt = 4u

public val DISKQUOTA_USER_ACCOUNT_UNRESOLVED: UInt = 5u

public val EA_CONTAINER_NAME: Pcstr = s("ContainerName")

public val EA_CONTAINER_SIZE: Pcstr = s("ContainerSize")

public val EFS_COMPATIBILITY_VERSION_NCRYPT_PROTECTOR: UInt = 5u

public val EFS_COMPATIBILITY_VERSION_PFILE_PROTECTOR: UInt = 6u

public val EFS_EFS_SUBVER_EFS_CERT: UInt = 1u

public val EFS_METADATA_ADD_USER: UInt = 1u

public val EFS_METADATA_GENERAL_OP: UInt = 8u

public val EFS_METADATA_REMOVE_USER: UInt = 2u

public val EFS_METADATA_REPLACE_USER: UInt = 4u

public val EFS_PFILE_SUBVER_APPX: UInt = 3u

public val EFS_PFILE_SUBVER_RMS: UInt = 2u

public val EFS_SUBVER_UNKNOWN: UInt = 0u

public val ENLISTMENT_MAXIMUM_OPTION: UInt = 1u

public val ENLISTMENT_OBJECT_PATH: Pcwstr = w("\\Enlistment\\")

public val ENLISTMENT_SUPERIOR: UInt = 1u

public val EXTENDED_FILE_ID_TYPE: FileIdType = 2

public val FILE_ACTION_ADDED: FileAction = 1u

public val FILE_ACTION_MODIFIED: FileAction = 3u

public val FILE_ACTION_REMOVED: FileAction = 2u

public val FILE_ACTION_RENAMED_NEW_NAME: FileAction = 5u

public val FILE_ACTION_RENAMED_OLD_NAME: FileAction = 4u

public val FILE_ADD_FILE: FileAccessRights = 2u

public val FILE_ADD_SUBDIRECTORY: FileAccessRights = 4u

public val FILE_ALL_ACCESS: FileAccessRights = 2032127u

public val FILE_APPEND_DATA: FileAccessRights = 4u

public val FILE_ATTRIBUTE_ARCHIVE: FileFlagsAndAttributes = 32u

public val FILE_ATTRIBUTE_COMPRESSED: FileFlagsAndAttributes = 2048u

public val FILE_ATTRIBUTE_DEVICE: FileFlagsAndAttributes = 64u

public val FILE_ATTRIBUTE_DIRECTORY: FileFlagsAndAttributes = 16u

public val FILE_ATTRIBUTE_EA: FileFlagsAndAttributes = 262144u

public val FILE_ATTRIBUTE_ENCRYPTED: FileFlagsAndAttributes = 16384u

public val FILE_ATTRIBUTE_HIDDEN: FileFlagsAndAttributes = 2u

public val FILE_ATTRIBUTE_INTEGRITY_STREAM: FileFlagsAndAttributes = 32768u

public val FILE_ATTRIBUTE_NORMAL: FileFlagsAndAttributes = 128u

public val FILE_ATTRIBUTE_NOT_CONTENT_INDEXED: FileFlagsAndAttributes = 8192u

public val FILE_ATTRIBUTE_NO_SCRUB_DATA: FileFlagsAndAttributes = 131072u

public val FILE_ATTRIBUTE_OFFLINE: FileFlagsAndAttributes = 4096u

public val FILE_ATTRIBUTE_PINNED: FileFlagsAndAttributes = 524288u

public val FILE_ATTRIBUTE_READONLY: FileFlagsAndAttributes = 1u

public val FILE_ATTRIBUTE_RECALL_ON_DATA_ACCESS: FileFlagsAndAttributes = 4194304u

public val FILE_ATTRIBUTE_RECALL_ON_OPEN: FileFlagsAndAttributes = 262144u

public val FILE_ATTRIBUTE_REPARSE_POINT: FileFlagsAndAttributes = 1024u

public val FILE_ATTRIBUTE_SPARSE_FILE: FileFlagsAndAttributes = 512u

public val FILE_ATTRIBUTE_SYSTEM: FileFlagsAndAttributes = 4u

public val FILE_ATTRIBUTE_TEMPORARY: FileFlagsAndAttributes = 256u

public val FILE_ATTRIBUTE_UNPINNED: FileFlagsAndAttributes = 1048576u

public val FILE_ATTRIBUTE_VIRTUAL: FileFlagsAndAttributes = 65536u

public val FILE_BEGIN: SetFilePointerMoveMethod = 0u

public val FILE_CREATE_PIPE_INSTANCE: FileAccessRights = 4u

public val FILE_CURRENT: SetFilePointerMoveMethod = 1u

public val FILE_DELETE_CHILD: FileAccessRights = 64u

public val FILE_DEVICE_CD_ROM: FileDeviceType = 2u

public val FILE_DEVICE_DISK: FileDeviceType = 7u

public val FILE_DEVICE_DVD: FileDeviceType = 51u

public val FILE_DEVICE_TAPE: FileDeviceType = 31u

public val FILE_DISPOSITION_FLAG_DELETE: FileDispositionInfoExFlags = 1u

public val FILE_DISPOSITION_FLAG_DO_NOT_DELETE: FileDispositionInfoExFlags = 0u

public val FILE_DISPOSITION_FLAG_FORCE_IMAGE_SECTION_CHECK: FileDispositionInfoExFlags = 4u

public val FILE_DISPOSITION_FLAG_IGNORE_READONLY_ATTRIBUTE: FileDispositionInfoExFlags = 16u

public val FILE_DISPOSITION_FLAG_ON_CLOSE: FileDispositionInfoExFlags = 8u

public val FILE_DISPOSITION_FLAG_POSIX_SEMANTICS: FileDispositionInfoExFlags = 2u

public val FILE_END: SetFilePointerMoveMethod = 2u

public val FILE_EXECUTE: FileAccessRights = 32u

public val FILE_FLAG_BACKUP_SEMANTICS: FileFlagsAndAttributes = 33554432u

public val FILE_FLAG_DELETE_ON_CLOSE: FileFlagsAndAttributes = 67108864u

public val FILE_FLAG_FIRST_PIPE_INSTANCE: FileFlagsAndAttributes = 524288u

public val FILE_FLAG_NO_BUFFERING: FileFlagsAndAttributes = 536870912u

public val FILE_FLAG_OPEN_NO_RECALL: FileFlagsAndAttributes = 1048576u

public val FILE_FLAG_OPEN_REPARSE_POINT: FileFlagsAndAttributes = 2097152u

public val FILE_FLAG_OVERLAPPED: FileFlagsAndAttributes = 1073741824u

public val FILE_FLAG_POSIX_SEMANTICS: FileFlagsAndAttributes = 16777216u

public val FILE_FLAG_RANDOM_ACCESS: FileFlagsAndAttributes = 268435456u

public val FILE_FLAG_SEQUENTIAL_SCAN: FileFlagsAndAttributes = 134217728u

public val FILE_FLAG_SESSION_AWARE: FileFlagsAndAttributes = 8388608u

public val FILE_FLAG_WRITE_THROUGH: FileFlagsAndAttributes = 2147483648u

public val FILE_FLUSH_DATA: FileFlushMode = 1

public val FILE_FLUSH_DEFAULT: FileFlushMode = 0

public val FILE_FLUSH_MIN_METADATA: FileFlushMode = 2

public val FILE_FLUSH_NO_SYNC: FileFlushMode = 3

public val FILE_GENERIC_EXECUTE: FileAccessRights = 1179808u

public val FILE_GENERIC_READ: FileAccessRights = 1179785u

public val FILE_GENERIC_WRITE: FileAccessRights = 1179926u

public val FILE_LIST_DIRECTORY: FileAccessRights = 1u

public val FILE_NAME_NORMALIZED: GetfinalpathnamebyhandleFlags = 0u

public val FILE_NAME_OPENED: GetfinalpathnamebyhandleFlags = 8u

public val FILE_NOTIFY_CHANGE_ATTRIBUTES: FileNotifyChange = 4u

public val FILE_NOTIFY_CHANGE_CREATION: FileNotifyChange = 64u

public val FILE_NOTIFY_CHANGE_DIR_NAME: FileNotifyChange = 2u

public val FILE_NOTIFY_CHANGE_FILE_NAME: FileNotifyChange = 1u

public val FILE_NOTIFY_CHANGE_LAST_ACCESS: FileNotifyChange = 32u

public val FILE_NOTIFY_CHANGE_LAST_WRITE: FileNotifyChange = 16u

public val FILE_NOTIFY_CHANGE_SECURITY: FileNotifyChange = 256u

public val FILE_NOTIFY_CHANGE_SIZE: FileNotifyChange = 8u

public val FILE_PROVIDER_COMPRESSION_LZX: UInt = 1u

public val FILE_PROVIDER_COMPRESSION_XPRESS16K: UInt = 3u

public val FILE_PROVIDER_COMPRESSION_XPRESS4K: UInt = 0u

public val FILE_PROVIDER_COMPRESSION_XPRESS8K: UInt = 2u

public val FILE_READ_ATTRIBUTES: FileAccessRights = 128u

public val FILE_READ_DATA: FileAccessRights = 1u

public val FILE_READ_EA: FileAccessRights = 8u

public val FILE_SHARE_DELETE: FileShareMode = 4u

public val FILE_SHARE_NONE: FileShareMode = 0u

public val FILE_SHARE_READ: FileShareMode = 1u

public val FILE_SHARE_WRITE: FileShareMode = 2u

public val FILE_TRAVERSE: FileAccessRights = 32u

public val FILE_TYPE_CHAR: FileType = 2u

public val FILE_TYPE_DISK: FileType = 1u

public val FILE_TYPE_PIPE: FileType = 3u

public val FILE_TYPE_REMOTE: FileType = 32768u

public val FILE_TYPE_UNKNOWN: FileType = 0u

public val FILE_VER_GET_LOCALISED: GetFileVersionInfoFlags = 1u

public val FILE_VER_GET_NEUTRAL: GetFileVersionInfoFlags = 2u

public val FILE_VER_GET_PREFETCHED: GetFileVersionInfoFlags = 4u

public val FILE_WRITE_ATTRIBUTES: FileAccessRights = 256u

public val FILE_WRITE_DATA: FileAccessRights = 2u

public val FILE_WRITE_EA: FileAccessRights = 16u

public val FILE_WRITE_FLAGS_NONE: FileWriteFlags = 0

public val FILE_WRITE_FLAGS_WRITE_THROUGH: FileWriteFlags = 1

public val FIND_FIRST_EX_CASE_SENSITIVE: FindFirstExFlags = 1u

public val FIND_FIRST_EX_LARGE_FETCH: FindFirstExFlags = 2u

public val FIND_FIRST_EX_ON_DISK_ENTRIES_ONLY: FindFirstExFlags = 4u

public val FILE_ALIGNMENT_INFO: FileInfoByHandleClass = 17

public val FILE_ALLOCATION_INFO: FileInfoByHandleClass = 5

public val FILE_ATTRIBUTE_TAG_INFO: FileInfoByHandleClass = 9

public val FILE_BASIC_INFO: FileInfoByHandleClass = 0

public val FILE_CASE_SENSITIVE_INFO: FileInfoByHandleClass = 23

public val FILE_COMPRESSION_INFO: FileInfoByHandleClass = 8

public val FILE_DISPOSITION_INFO: FileInfoByHandleClass = 4

public val FILE_DISPOSITION_INFO_EX: FileInfoByHandleClass = 21

public val FILE_END_OF_FILE_INFO: FileInfoByHandleClass = 6

public val FILE_FULL_DIRECTORY_INFO: FileInfoByHandleClass = 14

public val FILE_FULL_DIRECTORY_RESTART_INFO: FileInfoByHandleClass = 15

public val FILE_ID_BOTH_DIRECTORY_INFO: FileInfoByHandleClass = 10

public val FILE_ID_BOTH_DIRECTORY_RESTART_INFO: FileInfoByHandleClass = 11

public val FILE_ID_EXTD_DIRECTORY_INFO: FileInfoByHandleClass = 19

public val FILE_ID_EXTD_DIRECTORY_RESTART_INFO: FileInfoByHandleClass = 20

public val FILE_ID_INFO: FileInfoByHandleClass = 18

public val FILE_ID_TYPE: FileIdType = 0

public val FILE_IO_PRIORITY_HINT_INFO: FileInfoByHandleClass = 12

public val FILE_NAME_INFO: FileInfoByHandleClass = 2

public val FILE_NORMALIZED_NAME_INFO: FileInfoByHandleClass = 24

public val FILE_REMOTE_PROTOCOL_INFO: FileInfoByHandleClass = 13

public val FILE_RENAME_INFO: FileInfoByHandleClass = 3

public val FILE_RENAME_INFO_EX: FileInfoByHandleClass = 22

public val FILE_STANDARD_INFO: FileInfoByHandleClass = 1

public val FILE_STORAGE_INFO: FileInfoByHandleClass = 16

public val FILE_STREAM_INFO: FileInfoByHandleClass = 7

public val FIND_EX_INFO_BASIC: FindexInfoLevels = 1

public val FIND_EX_INFO_MAX_INFO_LEVEL: FindexInfoLevels = 2

public val FIND_EX_INFO_STANDARD: FindexInfoLevels = 0

public val FIND_EX_SEARCH_LIMIT_TO_DEVICES: FindexSearchOps = 2

public val FIND_EX_SEARCH_LIMIT_TO_DIRECTORIES: FindexSearchOps = 1

public val FIND_EX_SEARCH_MAX_SEARCH_OP: FindexSearchOps = 3

public val FIND_EX_SEARCH_NAME_MATCH: FindexSearchOps = 0

public val FIND_STREAM_INFO_MAX_INFO_LEVEL: StreamInfoLevels = 1

public val FIND_STREAM_INFO_STANDARD: StreamInfoLevels = 0

public val GET_TAPE_DRIVE_INFORMATION: GetTapeDriveParametersOperation = 1u

public val GET_TAPE_MEDIA_INFORMATION: GetTapeDriveParametersOperation = 0u

public val GET_FILE_EX_INFO_STANDARD: GetFileexInfoLevels = 0

public val GET_FILE_EX_MAX_INFO_LEVEL: GetFileexInfoLevels = 1

public val INVALID_FILE_ATTRIBUTES: UInt = 4294967295u

public val INVALID_FILE_SIZE: UInt = 4294967295u

public val INVALID_SET_FILE_POINTER: UInt = 4294967295u

public val IOCTL_VOLUME_ALLOCATE_BC_STREAM: UInt = 5685312u

public val IOCTL_VOLUME_BASE: UInt = 86u

public val IOCTL_VOLUME_BC_VERSION: UInt = 1u

public val IOCTL_VOLUME_FREE_BC_STREAM: UInt = 5685316u

public val IOCTL_VOLUME_GET_BC_PROPERTIES: UInt = 5652540u

public val IOCTL_VOLUME_GET_CSVBLOCKCACHE_CALLBACK: UInt = 5685352u

public val IOCTL_VOLUME_GET_GPT_ATTRIBUTES: UInt = 5636152u

public val IOCTL_VOLUME_GET_VOLUME_DISK_EXTENTS: UInt = 5636096u

public val IOCTL_VOLUME_IS_CLUSTERED: UInt = 5636144u

public val IOCTL_VOLUME_IS_CSV: UInt = 5636192u

public val IOCTL_VOLUME_IS_DYNAMIC: UInt = 5636168u

public val IOCTL_VOLUME_IS_IO_CAPABLE: UInt = 5636116u

public val IOCTL_VOLUME_IS_OFFLINE: UInt = 5636112u

public val IOCTL_VOLUME_IS_PARTITION: UInt = 5636136u

public val IOCTL_VOLUME_LOGICAL_TO_PHYSICAL: UInt = 5636128u

public val IOCTL_VOLUME_OFFLINE: UInt = 5685260u

public val IOCTL_VOLUME_ONLINE: UInt = 5685256u

public val IOCTL_VOLUME_PHYSICAL_TO_LOGICAL: UInt = 5636132u

public val IOCTL_VOLUME_POST_ONLINE: UInt = 5685348u

public val IOCTL_VOLUME_PREPARE_FOR_CRITICAL_IO: UInt = 5685324u

public val IOCTL_VOLUME_PREPARE_FOR_SHRINK: UInt = 5685340u

public val IOCTL_VOLUME_QUERY_ALLOCATION_HINT: UInt = 5652562u

public val IOCTL_VOLUME_QUERY_FAILOVER_SET: UInt = 5636120u

public val IOCTL_VOLUME_QUERY_MINIMUM_SHRINK_SIZE: UInt = 5652568u

public val IOCTL_VOLUME_QUERY_VOLUME_NUMBER: UInt = 5636124u

public val IOCTL_VOLUME_READ_PLEX: UInt = 5652526u

public val IOCTL_VOLUME_SET_GPT_ATTRIBUTES: UInt = 5636148u

public val IOCTL_VOLUME_SUPPORTS_ONLINE_OFFLINE: UInt = 5636100u

public val IOCTL_VOLUME_UPDATE_PROPERTIES: UInt = 5636180u

public val IORING_CREATE_ADVISORY_FLAGS_NONE: IoringCreateAdvisoryFlags = 0

public val IORING_CREATE_REQUIRED_FLAGS_NONE: IoringCreateRequiredFlags = 0

public val IORING_FEATURE_FLAGS_NONE: IoringFeatureFlags = 0

public val IORING_FEATURE_SET_COMPLETION_EVENT: IoringFeatureFlags = 2

public val IORING_FEATURE_UM_EMULATION: IoringFeatureFlags = 1

public val IORING_OP_CANCEL: IoringOpCode = 4

public val IORING_OP_FLUSH: IoringOpCode = 6

public val IORING_OP_NOP: IoringOpCode = 0

public val IORING_OP_READ: IoringOpCode = 1

public val IORING_OP_REGISTER_BUFFERS: IoringOpCode = 3

public val IORING_OP_REGISTER_FILES: IoringOpCode = 2

public val IORING_OP_WRITE: IoringOpCode = 5

public val IORING_REF_RAW: IoringRefKind = 0

public val IORING_REF_REGISTERED: IoringRefKind = 1

public val IORING_VERSION_1: IoringVersion = 1

public val IORING_VERSION_2: IoringVersion = 2

public val IORING_VERSION_3: IoringVersion = 300

public val IORING_VERSION_INVALID: IoringVersion = 0

public val IOSQE_FLAGS_DRAIN_PRECEDING_OPS: IoringSqeFlags = 1

public val IOSQE_FLAGS_NONE: IoringSqeFlags = 0

public val IO_PRIORITY_HINT_LOW: PriorityHint = 1

public val IO_PRIORITY_HINT_NORMAL: PriorityHint = 2

public val IO_PRIORITY_HINT_VERY_LOW: PriorityHint = 0

public val KTM_MARSHAL_BLOB_VERSION_MAJOR: UInt = 1u

public val KTM_MARSHAL_BLOB_VERSION_MINOR: UInt = 1u

public val LOCKFILE_EXCLUSIVE_LOCK: LockFileFlags = 2u

public val LOCKFILE_FAIL_IMMEDIATELY: LockFileFlags = 1u

public val LOG_POLICY_OVERWRITE: UInt = 1u

public val LOG_POLICY_PERSIST: UInt = 2u

public val LZERROR_BADINHANDLE: Int = -1

public val LZERROR_BADOUTHANDLE: Int = -2

public val LZERROR_BADVALUE: Int = -7

public val LZERROR_GLOBALLOC: Int = -5

public val LZERROR_GLOBLOCK: Int = -6

public val LZERROR_READ: Int = -3

public val LZERROR_UNKNOWNALG: Int = -8

public val LZERROR_WRITE: Int = -4

public val MAXIMUM_REPARSE_DATA_BUFFER_SIZE: UInt = 16384u

public val MAX_RESOURCEMANAGER_DESCRIPTION_LENGTH: UInt = 64u

public val MAX_SID_SIZE: UInt = 256u

public val MAX_TRANSACTION_DESCRIPTION_LENGTH: UInt = 64u

public val MOVEFILE_COPY_ALLOWED: MoveFileFlags = 2u

public val MOVEFILE_CREATE_HARDLINK: MoveFileFlags = 16u

public val MOVEFILE_DELAY_UNTIL_REBOOT: MoveFileFlags = 4u

public val MOVEFILE_FAIL_IF_NOT_TRACKABLE: MoveFileFlags = 32u

public val MOVEFILE_REPLACE_EXISTING: MoveFileFlags = 1u

public val MOVEFILE_WRITE_THROUGH: MoveFileFlags = 8u

public val MAXIMUM_FILE_ID_TYPE: FileIdType = 3

public val MAXIMUM_FILE_INFO_BY_HANDLE_CLASS: FileInfoByHandleClass = 25

public val MAXIMUM_IO_PRIORITY_HINT_TYPE: PriorityHint = 3

public val NTMSMLI_MAXAPPDESCR: UInt = 256u

public val NTMSMLI_MAXIDSIZE: UInt = 256u

public val NTMSMLI_MAXTYPE: UInt = 64u

public val NTMS_ALLOCATE_ERROR_IF_UNAVAILABLE: NtmsAllocateOptions = 4

public val NTMS_ALLOCATE_FROMSCRATCH: NtmsAllocationPolicy = 1

public val NTMS_ALLOCATE_NEW: NtmsAllocateOptions = 1

public val NTMS_ALLOCATE_NEXT: NtmsAllocateOptions = 2

public val NTMS_APPLICATIONNAME_LENGTH: UInt = 64u

public val NTMS_ASYNCOP_MOUNT: NtmsAsyncOperations = 1

public val NTMS_ASYNCSTATE_COMPLETE: NtmsAsyncStatus = 4

public val NTMS_ASYNCSTATE_INPROCESS: NtmsAsyncStatus = 3

public val NTMS_ASYNCSTATE_QUEUED: NtmsAsyncStatus = 0

public val NTMS_ASYNCSTATE_WAIT_OPERATOR: NtmsAsyncStatus = 2

public val NTMS_ASYNCSTATE_WAIT_RESOURCE: NtmsAsyncStatus = 1

public val NTMS_BARCODESTATE_OK: NtmsBarCodeState = 1

public val NTMS_BARCODESTATE_UNREADABLE: NtmsBarCodeState = 2

public val NTMS_BARCODE_LENGTH: UInt = 64u

public val NTMS_CHANGER: NtmsObjectsTypes = 2

public val NTMS_CHANGER_TYPE: NtmsObjectsTypes = 3

public val NTMS_COMPUTER: NtmsObjectsTypes = 4

public val NTMS_COMPUTERNAME_LENGTH: UInt = 64u

public val NTMS_CONTROL_ACCESS: NtmsAccessMask = 4

public val NTMS_CREATE_NEW: NtmsCreateOptions = 2

public val NTMS_DEALLOCATE_TOSCRATCH: NtmsDeallocationPolicy = 1

public val NTMS_DESCRIPTION_LENGTH: UInt = 127u

public val NTMS_DEVICENAME_LENGTH: UInt = 64u

public val NTMS_DISMOUNT_DEFERRED: NtmsDismountOptions = 1

public val NTMS_DISMOUNT_IMMEDIATE: NtmsDismountOptions = 2

public val NTMS_DOORSTATE_CLOSED: NtmsDoorState = 1

public val NTMS_DOORSTATE_OPEN: NtmsDoorState = 2

public val NTMS_DOORSTATE_UNKNOWN: NtmsDoorState = 0

public val NTMS_DRIVE: NtmsObjectsTypes = 5

public val NTMS_DRIVESTATE_BEING_CLEANED: NtmsDriveState = 6

public val NTMS_DRIVESTATE_DISMOUNTABLE: NtmsDriveState = 7

public val NTMS_DRIVESTATE_DISMOUNTED: NtmsDriveState = 0

public val NTMS_DRIVESTATE_LOADED: NtmsDriveState = 2

public val NTMS_DRIVESTATE_MOUNTED: NtmsDriveState = 1

public val NTMS_DRIVESTATE_UNLOADED: NtmsDriveState = 5

public val NTMS_DRIVE_TYPE: NtmsObjectsTypes = 6

public val NTMS_EJECT_ASK_USER: NtmsEjectOperation = 5

public val NTMS_EJECT_FORCE: NtmsEjectOperation = 3

public val NTMS_EJECT_IMMEDIATE: NtmsEjectOperation = 4

public val NTMS_EJECT_QUEUE: NtmsEjectOperation = 2

public val NTMS_EJECT_START: NtmsEjectOperation = 0

public val NTMS_EJECT_STOP: NtmsEjectOperation = 1

public val NTMS_ENUM_DEFAULT: NtmsEnumerateOption = 0

public val NTMS_ENUM_ROOTPOOL: NtmsEnumerateOption = 1

public val NTMS_ERROR_ON_DUPLICATE: NtmsCreateNtmsMediaOptions = 1

public val NTMS_EVENT_COMPLETE: NtmsNotificationOperations = 5

public val NTMS_EVENT_SIGNAL: NtmsNotificationOperations = 4

public val NTMS_I1_MESSAGE_LENGTH: UInt = 127u

public val NTMS_IEDOOR: NtmsObjectsTypes = 7

public val NTMS_IEPORT: NtmsObjectsTypes = 8

public val NTMS_INITIALIZING: NtmsOperationalState = 10

public val NTMS_INJECT_RETRACT: NtmsInjectOperation = 2

public val NTMS_INJECT_START: NtmsInjectOperation = 0

public val NTMS_INJECT_STARTMANY: NtmsInjectOperation = 3

public val NTMS_INJECT_STOP: NtmsInjectOperation = 1

public val NTMS_INVENTORY_DEFAULT: NtmsInventoryMethod = 3

public val NTMS_INVENTORY_FAST: NtmsInventoryMethod = 1

public val NTMS_INVENTORY_MAX: NtmsInventoryMethod = 6

public val NTMS_INVENTORY_NONE: NtmsInventoryMethod = 0

public val NTMS_INVENTORY_OMID: NtmsInventoryMethod = 2

public val NTMS_INVENTORY_SLOT: NtmsInventoryMethod = 4

public val NTMS_INVENTORY_STOP: NtmsInventoryMethod = 5

public val NTMS_LIBRARY: NtmsObjectsTypes = 9

public val NTMS_LIBRARYFLAG_AUTODETECTCHANGE: NtmsLibraryFlags = 4

public val NTMS_LIBRARYFLAG_CLEANERPRESENT: NtmsLibraryFlags = 2

public val NTMS_LIBRARYFLAG_FIXEDOFFLINE: NtmsLibraryFlags = 1

public val NTMS_LIBRARYFLAG_IGNORECLEANERUSESREMAINING: NtmsLibraryFlags = 8

public val NTMS_LIBRARYFLAG_RECOGNIZECLEANERBARCODE: NtmsLibraryFlags = 16

public val NTMS_LIBRARYTYPE_OFFLINE: NtmsLibraryType = 1

public val NTMS_LIBRARYTYPE_ONLINE: NtmsLibraryType = 2

public val NTMS_LIBRARYTYPE_STANDALONE: NtmsLibraryType = 3

public val NTMS_LIBRARYTYPE_UNKNOWN: NtmsLibraryType = 0

public val NTMS_LIBREQFLAGS_NOAUTOPURGE: NtmsLibRequestFlags = 1

public val NTMS_LIBREQFLAGS_NOFAILEDPURGE: NtmsLibRequestFlags = 2

public val NTMS_LIBREQUEST: NtmsObjectsTypes = 10

public val NTMS_LM_CANCELLED: NtmsLmState = 7

public val NTMS_LM_CLASSIFY: NtmsLmOperation = 19

public val NTMS_LM_CLEANDRIVE: NtmsLmOperation = 15

public val NTMS_LM_DEFERRED: NtmsLmState = 6

public val NTMS_LM_DEFFERED: NtmsLmState = 6

public val NTMS_LM_DISABLECHANGER: NtmsLmOperation = 1

public val NTMS_LM_DISABLEDRIVE: NtmsLmOperation = 3

public val NTMS_LM_DISABLELIBRARY: NtmsLmOperation = 1

public val NTMS_LM_DISABLEMEDIA: NtmsLmOperation = 5

public val NTMS_LM_DISMOUNT: NtmsLmOperation = 16

public val NTMS_LM_DOORACCESS: NtmsLmOperation = 9

public val NTMS_LM_EJECT: NtmsLmOperation = 10

public val NTMS_LM_EJECTCLEANER: NtmsLmOperation = 11

public val NTMS_LM_ENABLECHANGER: NtmsLmOperation = 2

public val NTMS_LM_ENABLEDRIVE: NtmsLmOperation = 4

public val NTMS_LM_ENABLELIBRARY: NtmsLmOperation = 2

public val NTMS_LM_ENABLEMEDIA: NtmsLmOperation = 6

public val NTMS_LM_FAILED: NtmsLmState = 3

public val NTMS_LM_INJECT: NtmsLmOperation = 12

public val NTMS_LM_INJECTCLEANER: NtmsLmOperation = 13

public val NTMS_LM_INPROCESS: NtmsLmState = 1

public val NTMS_LM_INVALID: NtmsLmState = 4

public val NTMS_LM_INVENTORY: NtmsLmOperation = 8

public val NTMS_LM_MAXWORKITEM: NtmsLmOperation = 22

public val NTMS_LM_MOUNT: NtmsLmOperation = 17

public val NTMS_LM_PASSED: NtmsLmState = 2

public val NTMS_LM_PROCESSOMID: NtmsLmOperation = 14

public val NTMS_LM_QUEUED: NtmsLmState = 0

public val NTMS_LM_RELEASECLEANER: NtmsLmOperation = 21

public val NTMS_LM_REMOVE: NtmsLmOperation = 0

public val NTMS_LM_RESERVECLEANER: NtmsLmOperation = 20

public val NTMS_LM_STOPPED: NtmsLmState = 8

public val NTMS_LM_UPDATEOMID: NtmsLmOperation = 7

public val NTMS_LM_WAITING: NtmsLmState = 5

public val NTMS_LM_WRITESCRATCH: NtmsLmOperation = 18

public val NTMS_LOGICAL_MEDIA: NtmsObjectsTypes = 11

public val NTMS_MAXATTR_LENGTH: UInt = 65536u

public val NTMS_MAXATTR_NAMELEN: UInt = 32u

public val NTMS_MEDIARW_READONLY: NtmsReadWriteCharacteristics = 3

public val NTMS_MEDIARW_REWRITABLE: NtmsReadWriteCharacteristics = 1

public val NTMS_MEDIARW_UNKNOWN: NtmsReadWriteCharacteristics = 0

public val NTMS_MEDIARW_WRITEONCE: NtmsReadWriteCharacteristics = 2

public val NTMS_MEDIASTATE_IDLE: NtmsMediaState = 0

public val NTMS_MEDIASTATE_INUSE: NtmsMediaState = 1

public val NTMS_MEDIASTATE_LOADED: NtmsMediaState = 3

public val NTMS_MEDIASTATE_MOUNTED: NtmsMediaState = 2

public val NTMS_MEDIASTATE_OPERROR: NtmsMediaState = 5

public val NTMS_MEDIASTATE_OPREQ: NtmsMediaState = 6

public val NTMS_MEDIASTATE_UNLOADED: NtmsMediaState = 4

public val NTMS_MEDIA_POOL: NtmsObjectsTypes = 12

public val NTMS_MEDIA_TYPE: NtmsObjectsTypes = 13

public val NTMS_MESSAGE_LENGTH: UInt = 256u

public val NTMS_MODIFY_ACCESS: NtmsAccessMask = 2

public val NTMS_MOUNT_ERROR_IF_OFFLINE: NtmsMountOptions = 8

public val NTMS_MOUNT_ERROR_IF_UNAVAILABLE: NtmsMountOptions = 4

public val NTMS_MOUNT_ERROR_NOT_AVAILABLE: NtmsMountOptions = 4

public val NTMS_MOUNT_ERROR_OFFLINE: NtmsMountOptions = 8

public val NTMS_MOUNT_NOWAIT: NtmsMountOptions = 32

public val NTMS_MOUNT_READ: NtmsMountOptions = 1

public val NTMS_MOUNT_SPECIFIC_DRIVE: NtmsMountOptions = 16

public val NTMS_MOUNT_WRITE: NtmsMountOptions = 2

public val NTMS_NEEDS_SERVICE: NtmsOperationalState = 20

public val NTMS_NOT_PRESENT: NtmsOperationalState = 21

public val NTMS_NUMBER_OF_OBJECT_TYPES: NtmsObjectsTypes = 19

public val NTMS_OBJECT: NtmsObjectsTypes = 1

public val NTMS_OBJECTNAME_LENGTH: UInt = 64u

public val NTMS_OBJ_DELETE: NtmsNotificationOperations = 3

public val NTMS_OBJ_INSERT: NtmsNotificationOperations = 2

public val NTMS_OBJ_UPDATE: NtmsNotificationOperations = 1

public val NTMS_OMIDLABELID_LENGTH: UInt = 255u

public val NTMS_OMIDLABELINFO_LENGTH: UInt = 256u

public val NTMS_OMIDLABELTYPE_LENGTH: UInt = 64u

public val NTMS_OMID_TYPE_FILESYSTEM_INFO: NtmsOmidType = 2u

public val NTMS_OMID_TYPE_RAW_LABEL: NtmsOmidType = 1u

public val NTMS_OPEN_ALWAYS: NtmsCreateOptions = 3

public val NTMS_OPEN_EXISTING: NtmsCreateOptions = 1

public val NTMS_OPREQFLAGS_NOALERTS: NtmsOpRequestFlags = 16

public val NTMS_OPREQFLAGS_NOAUTOPURGE: NtmsOpRequestFlags = 1

public val NTMS_OPREQFLAGS_NOFAILEDPURGE: NtmsOpRequestFlags = 2

public val NTMS_OPREQFLAGS_NOTRAYICON: NtmsOpRequestFlags = 32

public val NTMS_OPREQUEST: NtmsObjectsTypes = 17

public val NTMS_OPREQ_CLEANER: NtmsOpreqCommand = 2

public val NTMS_OPREQ_DEVICESERVICE: NtmsOpreqCommand = 3

public val NTMS_OPREQ_MESSAGE: NtmsOpreqCommand = 5

public val NTMS_OPREQ_MOVEMEDIA: NtmsOpreqCommand = 4

public val NTMS_OPREQ_NEWMEDIA: NtmsOpreqCommand = 1

public val NTMS_OPREQ_UNKNOWN: NtmsOpreqCommand = 0

public val NTMS_OPSTATE_ACTIVE: NtmsOpreqState = 2

public val NTMS_OPSTATE_COMPLETE: NtmsOpreqState = 5

public val NTMS_OPSTATE_INPROGRESS: NtmsOpreqState = 3

public val NTMS_OPSTATE_REFUSED: NtmsOpreqState = 4

public val NTMS_OPSTATE_SUBMITTED: NtmsOpreqState = 1

public val NTMS_OPSTATE_UNKNOWN: NtmsOpreqState = 0

public val NTMS_PARTITION: NtmsObjectsTypes = 14

public val NTMS_PARTSTATE_ALLOCATED: NtmsPartitionState = 5

public val NTMS_PARTSTATE_AVAILABLE: NtmsPartitionState = 4

public val NTMS_PARTSTATE_COMPLETE: NtmsPartitionState = 6

public val NTMS_PARTSTATE_DECOMMISSIONED: NtmsPartitionState = 3

public val NTMS_PARTSTATE_FOREIGN: NtmsPartitionState = 7

public val NTMS_PARTSTATE_IMPORT: NtmsPartitionState = 8

public val NTMS_PARTSTATE_INCOMPATIBLE: NtmsPartitionState = 2

public val NTMS_PARTSTATE_RESERVED: NtmsPartitionState = 9

public val NTMS_PARTSTATE_UNKNOWN: NtmsPartitionState = 0

public val NTMS_PARTSTATE_UNPREPARED: NtmsPartitionState = 1

public val NTMS_PHYSICAL_MEDIA: NtmsObjectsTypes = 15

public val NTMS_POOLHIERARCHY_LENGTH: UInt = 512u

public val NTMS_POOLPOLICY_KEEPOFFLINEIMPORT: NtmsMediaPoolPolicy = 2

public val NTMS_POOLPOLICY_PURGEOFFLINESCRATCH: NtmsMediaPoolPolicy = 1

public val NTMS_POOLTYPE_APPLICATION: NtmsPoolType = 1000

public val NTMS_POOLTYPE_FOREIGN: NtmsPoolType = 2

public val NTMS_POOLTYPE_IMPORT: NtmsPoolType = 3

public val NTMS_POOLTYPE_SCRATCH: NtmsPoolType = 1

public val NTMS_POOLTYPE_UNKNOWN: NtmsPoolType = 0

public val NTMS_PORTCONTENT_EMPTY: NtmsPortContent = 2

public val NTMS_PORTCONTENT_FULL: NtmsPortContent = 1

public val NTMS_PORTCONTENT_UNKNOWN: NtmsPortContent = 0

public val NTMS_PORTPOSITION_EXTENDED: NtmsPortPosition = 1

public val NTMS_PORTPOSITION_RETRACTED: NtmsPortPosition = 2

public val NTMS_PORTPOSITION_UNKNOWN: NtmsPortPosition = 0

public val NTMS_PRIORITY_DEFAULT: NtmsMountPriority = 0

public val NTMS_PRIORITY_HIGH: NtmsMountPriority = 7

public val NTMS_PRIORITY_HIGHEST: NtmsMountPriority = 15

public val NTMS_PRIORITY_LOW: NtmsMountPriority = -7

public val NTMS_PRIORITY_LOWEST: NtmsMountPriority = -15

public val NTMS_PRIORITY_NORMAL: NtmsMountPriority = 0

public val NTMS_PRODUCTNAME_LENGTH: UInt = 128u

public val NTMS_READY: NtmsOperationalState = 0

public val NTMS_REVISION_LENGTH: UInt = 32u

public val NTMS_SEQUENCE_LENGTH: UInt = 32u

public val NTMS_SERIALNUMBER_LENGTH: UInt = 32u

public val NTMS_SESSION_QUERYEXPEDITE: NtmsSessionOptions = 1

public val NTMS_SLOTSTATE_EMPTY: NtmsSlotState = 2

public val NTMS_SLOTSTATE_FULL: NtmsSlotState = 1

public val NTMS_SLOTSTATE_NEEDSINVENTORY: NtmsSlotState = 4

public val NTMS_SLOTSTATE_NOTPRESENT: NtmsSlotState = 3

public val NTMS_SLOTSTATE_UNKNOWN: NtmsSlotState = 0

public val NTMS_STORAGESLOT: NtmsObjectsTypes = 16

public val NTMS_UIDEST_ADD: NtmsUIOperations = 1

public val NTMS_UIDEST_DELETE: NtmsUIOperations = 2

public val NTMS_UIDEST_DELETEALL: NtmsUIOperations = 3

public val NTMS_UIOPERATION_MAX: NtmsUIOperations = 4

public val NTMS_UITYPE_ERR: NtmsUITypes = 3

public val NTMS_UITYPE_INFO: NtmsUITypes = 1

public val NTMS_UITYPE_INVALID: NtmsUITypes = 0

public val NTMS_UITYPE_MAX: NtmsUITypes = 4

public val NTMS_UITYPE_REQ: NtmsUITypes = 2

public val NTMS_UI_DESTINATION: NtmsObjectsTypes = 18

public val NTMS_UNKNOWN: NtmsObjectsTypes = 0

public val NTMS_UNKNOWN_DRIVE: NtmsDriveType = 0

public val NTMS_USERNAME_LENGTH: UInt = 64u

public val NTMS_USE_ACCESS: NtmsAccessMask = 1

public val NTMS_VENDORNAME_LENGTH: UInt = 128u

public val OF_CANCEL: LzopenfileStyle = 2048u.toUShort()

public val OF_CREATE: LzopenfileStyle = 4096u.toUShort()

public val OF_DELETE: LzopenfileStyle = 512u.toUShort()

public val OF_EXIST: LzopenfileStyle = 16384u.toUShort()

public val OF_PARSE: LzopenfileStyle = 256u.toUShort()

public val OF_PROMPT: LzopenfileStyle = 8192u.toUShort()

public val OF_READ: LzopenfileStyle = 0u.toUShort()

public val OF_READWRITE: LzopenfileStyle = 2u.toUShort()

public val OF_REOPEN: LzopenfileStyle = 32768u.toUShort()

public val OF_SHARE_COMPAT: LzopenfileStyle = 0u.toUShort()

public val OF_SHARE_DENY_NONE: LzopenfileStyle = 64u.toUShort()

public val OF_SHARE_DENY_READ: LzopenfileStyle = 48u.toUShort()

public val OF_SHARE_DENY_WRITE: LzopenfileStyle = 32u.toUShort()

public val OF_SHARE_EXCLUSIVE: LzopenfileStyle = 16u.toUShort()

public val OF_VERIFY: LzopenfileStyle = 1024u.toUShort()

public val OF_WRITE: LzopenfileStyle = 1u.toUShort()

public val OPEN_ALWAYS: FileCreationDisposition = 4u

public val OPEN_EXISTING: FileCreationDisposition = 3u

public val OBJECT_ID_TYPE: FileIdType = 1

public val PARTITION_BASIC_DATA_GUID: Guid = Guid.fromU128(U128(0xebd0a0a2b9e54433uL, 0x87c068b6b72699c7uL))

public val PARTITION_BSP_GUID: Guid = Guid.fromU128(U128(0x57434f534df945b9uL, 0x8e9e2370f006457cuL))

public val PARTITION_CLUSTER_GUID: Guid = Guid.fromU128(U128(0xdb97dba908404baeuL, 0x97f0ffb9a327c7e1uL))

public val PARTITION_DPP_GUID: Guid = Guid.fromU128(U128(0x57434f5394cb43f0uL, 0xa533d73c10cfa57duL))

public val PARTITION_ENTRY_UNUSED_GUID: Guid = Guid.fromU128(U128(0x0uL, 0x0uL))

public val PARTITION_LDM_DATA_GUID: Guid = Guid.fromU128(U128(0xaf9b60a014314f62uL, 0xbc683311714a69aduL))

public val PARTITION_LDM_METADATA_GUID: Guid = Guid.fromU128(U128(0x5808c8aa7e8f42e0uL, 0x85d2e1e90434cfb3uL))

public val PARTITION_LEGACY_BL_GUID: Guid = Guid.fromU128(U128(0x424ca0e27cb24fb9uL, 0x8143c52a99398bc6uL))

public val PARTITION_LEGACY_BL_GUID_BACKUP: Guid = Guid.fromU128(U128(0x424c3e6cd79f49cbuL, 0x935d36d71467a288uL))

public val PARTITION_MAIN_OS_GUID: Guid = Guid.fromU128(U128(0x57434f538f45405euL, 0x8a23186d8a4330d3uL))

public val PARTITION_MSFT_RECOVERY_GUID: Guid = Guid.fromU128(U128(0xde94bba406d14d40uL, 0xa16abfd50179d6acuL))

public val PARTITION_MSFT_RESERVED_GUID: Guid = Guid.fromU128(U128(0xe3c9e3160b5c4db8uL, 0x817df92df00215aeuL))

public val PARTITION_MSFT_SNAPSHOT_GUID: Guid = Guid.fromU128(U128(0xcaddebf144004de8uL, 0xb10312117dcf3ccfuL))

public val PARTITION_OS_DATA_GUID: Guid = Guid.fromU128(U128(0x57434f5323f244d5uL, 0xa83067bbdaa609f9uL))

public val PARTITION_PATCH_GUID: Guid = Guid.fromU128(U128(0x8967a68696aa6aa8uL, 0x9589a84256541090uL))

public val PARTITION_PRE_INSTALLED_GUID: Guid = Guid.fromU128(U128(0x57434f537fe04196uL, 0x9b42427b51643484uL))

public val PARTITION_SBL_CACHE_HDD_GUID: Guid = Guid.fromU128(U128(0x3aaa829ebfc4e7euL, 0xaac9c4d76c63b24buL))

public val PARTITION_SBL_CACHE_SSD_GUID: Guid = Guid.fromU128(U128(0xeeff8352dd2a44dbuL, 0xae83bee1cf7481dcuL))

public val PARTITION_SBL_CACHE_SSD_RESERVED_GUID: Guid = Guid.fromU128(U128(0xdcc0c7c155ad4f17uL, 0x9d434bc776e0117euL))

public val PARTITION_SERVICING_FILES_GUID: Guid = Guid.fromU128(U128(0x57434f53432e4014uL, 0xae4c8deaa9c0006auL))

public val PARTITION_SERVICING_METADATA_GUID: Guid = Guid.fromU128(U128(0x57434f53c6914a05uL, 0xbb4e703dafd229ceuL))

public val PARTITION_SERVICING_RESERVE_GUID: Guid = Guid.fromU128(U128(0x57434f534b81460buL, 0xa319ffb6fe136d14uL))

public val PARTITION_SERVICING_STAGING_ROOT_GUID: Guid = Guid.fromU128(U128(0x57434f53e84d4e84uL, 0xaaf3ecbbbd04b9dfuL))

public val PARTITION_SPACES_DATA_GUID: Guid = Guid.fromU128(U128(0xe7addcb4dc344539uL, 0x9a76ebbd07be6f7euL))

public val PARTITION_SPACES_GUID: Guid = Guid.fromU128(U128(0xe75caf8ff6804ceeuL, 0xafa3b001e56efc2duL))

public val PARTITION_SYSTEM_GUID: Guid = Guid.fromU128(U128(0xc12a7328f81f11d2uL, 0xba4b00a0c93ec93buL))

public val PARTITION_WINDOWS_SYSTEM_GUID: Guid = Guid.fromU128(U128(0x57434f53e3e34631uL, 0xa5c526d2243873aauL))

public val PERM_FILE_CREATE: FileInfoFlagsPermissions = 4u

public val PERM_FILE_READ: FileInfoFlagsPermissions = 1u

public val PERM_FILE_WRITE: FileInfoFlagsPermissions = 2u

public val PIPE_ACCESS_DUPLEX: FileFlagsAndAttributes = 3u

public val PIPE_ACCESS_INBOUND: FileFlagsAndAttributes = 1u

public val PIPE_ACCESS_OUTBOUND: FileFlagsAndAttributes = 2u

public val PROGRESS_CANCEL: CopyprogressroutineProgress = 1u

public val PROGRESS_CONTINUE: CopyprogressroutineProgress = 0u

public val PROGRESS_QUIET: CopyprogressroutineProgress = 3u

public val PROGRESS_STOP: CopyprogressroutineProgress = 2u

public val QUIC: ServerCertificateType = 0

public val READ_CONTROL: FileAccessRights = 131072u

public val REPLACEFILE_IGNORE_ACL_ERRORS: ReplaceFileFlags = 4u

public val REPLACEFILE_IGNORE_MERGE_ERRORS: ReplaceFileFlags = 2u

public val REPLACEFILE_WRITE_THROUGH: ReplaceFileFlags = 1u

public val RESOURCE_MANAGER_COMMUNICATION: UInt = 2u

public val RESOURCE_MANAGER_MAXIMUM_OPTION: UInt = 3u

public val RESOURCE_MANAGER_OBJECT_PATH: Pcwstr = w("\\ResourceManager\\")

public val RESOURCE_MANAGER_VOLATILE: UInt = 1u

public val READ_DIRECTORY_NOTIFY_EXTENDED_INFORMATION: ReadDirectoryNotifyInformationClass = 2

public val READ_DIRECTORY_NOTIFY_FULL_INFORMATION: ReadDirectoryNotifyInformationClass = 3

public val READ_DIRECTORY_NOTIFY_INFORMATION: ReadDirectoryNotifyInformationClass = 1

public val READ_DIRECTORY_NOTIFY_MAXIMUM_INFORMATION: ReadDirectoryNotifyInformationClass = 4

public val SECURITY_ANONYMOUS: FileFlagsAndAttributes = 0u

public val SECURITY_CONTEXT_TRACKING: FileFlagsAndAttributes = 262144u

public val SECURITY_DELEGATION: FileFlagsAndAttributes = 196608u

public val SECURITY_EFFECTIVE_ONLY: FileFlagsAndAttributes = 524288u

public val SECURITY_IDENTIFICATION: FileFlagsAndAttributes = 65536u

public val SECURITY_IMPERSONATION: FileFlagsAndAttributes = 131072u

public val SECURITY_SQOS_PRESENT: FileFlagsAndAttributes = 1048576u

public val SECURITY_VALID_SQOS_FLAGS: FileFlagsAndAttributes = 2031616u

public val SESI1_NUM_ELEMENTS: UInt = 8u

public val SESI2_NUM_ELEMENTS: UInt = 9u

public val SESS_GUEST: SessionInfoUserFlags = 1u

public val SESS_NOENCRYPTION: SessionInfoUserFlags = 2u

public val SET_TAPE_DRIVE_INFORMATION: TapeInformationType = 1u

public val SET_TAPE_MEDIA_INFORMATION: TapeInformationType = 0u

public val SHARE_CURRENT_USES_PARMNUM: UInt = 7u

public val SHARE_FILE_SD_PARMNUM: UInt = 501u

public val SHARE_MAX_USES_PARMNUM: UInt = 6u

public val SHARE_NETNAME_PARMNUM: UInt = 1u

public val SHARE_PASSWD_PARMNUM: UInt = 9u

public val SHARE_PATH_PARMNUM: UInt = 8u

public val SHARE_PERMISSIONS_PARMNUM: UInt = 5u

public val SHARE_QOS_POLICY_PARMNUM: UInt = 504u

public val SHARE_REMARK_PARMNUM: UInt = 4u

public val SHARE_SERVER_PARMNUM: UInt = 503u

public val SHARE_TYPE_PARMNUM: UInt = 3u

public val SHI1005_FLAGS_ACCESS_BASED_DIRECTORY_ENUM: UInt = 2048u

public val SHI1005_FLAGS_ALLOW_NAMESPACE_CACHING: UInt = 1024u

public val SHI1005_FLAGS_CLUSTER_MANAGED: UInt = 524288u

public val SHI1005_FLAGS_COMPRESS_DATA: UInt = 1048576u

public val SHI1005_FLAGS_DFS: UInt = 1u

public val SHI1005_FLAGS_DFS_ROOT: UInt = 2u

public val SHI1005_FLAGS_DISABLE_CLIENT_BUFFERING: UInt = 131072u

public val SHI1005_FLAGS_DISABLE_DIRECTORY_HANDLE_LEASING: UInt = 4194304u

public val SHI1005_FLAGS_ENABLE_CA: UInt = 16384u

public val SHI1005_FLAGS_ENABLE_HASH: UInt = 8192u

public val SHI1005_FLAGS_ENCRYPT_DATA: UInt = 32768u

public val SHI1005_FLAGS_FORCE_LEVELII_OPLOCK: UInt = 4096u

public val SHI1005_FLAGS_FORCE_SHARED_DELETE: UInt = 512u

public val SHI1005_FLAGS_IDENTITY_REMOTING: UInt = 262144u

public val SHI1005_FLAGS_ISOLATED_TRANSPORT: UInt = 2097152u

public val SHI1005_FLAGS_RESERVED: UInt = 65536u

public val SHI1005_FLAGS_RESTRICT_EXCLUSIVE_OPENS: UInt = 256u

public val SHI1_NUM_ELEMENTS: UInt = 4u

public val SHI2_NUM_ELEMENTS: UInt = 10u

public val SHI_USES_UNLIMITED: UInt = 4294967295u

public val SPECIFIC_RIGHTS_ALL: FileAccessRights = 65535u

public val STANDARD_RIGHTS_ALL: FileAccessRights = 2031616u

public val STANDARD_RIGHTS_EXECUTE: FileAccessRights = 131072u

public val STANDARD_RIGHTS_READ: FileAccessRights = 131072u

public val STANDARD_RIGHTS_REQUIRED: FileAccessRights = 983040u

public val STANDARD_RIGHTS_WRITE: FileAccessRights = 131072u

public val STATSOPT_CLR: UInt = 1u

public val STYPE_DEVICE: ShareType = 2u

public val STYPE_DISKTREE: ShareType = 0u

public val STYPE_IPC: ShareType = 3u

public val STYPE_MASK: ShareType = 255u

public val STYPE_PRINTQ: ShareType = 1u

public val STYPE_RESERVED1: UInt = 16777216u

public val STYPE_RESERVED2: UInt = 33554432u

public val STYPE_RESERVED3: UInt = 67108864u

public val STYPE_RESERVED4: UInt = 134217728u

public val STYPE_RESERVED5: UInt = 1048576u

public val STYPE_RESERVED_ALL: UInt = 1073741568u

public val STYPE_SPECIAL: ShareType = 2147483648u

public val STYPE_TEMPORARY: ShareType = 1073741824u

public val SYMBOLIC_LINK_FLAG_ALLOW_UNPRIVILEGED_CREATE: SymbolicLinkFlags = 2u

public val SYMBOLIC_LINK_FLAG_DIRECTORY: SymbolicLinkFlags = 1u

public val SYNCHRONIZE: FileAccessRights = 1048576u

public val TAPE_ABSOLUTE_BLOCK: TapePositionMethod = 1u

public val TAPE_ABSOLUTE_POSITION: TapePositionType = 0u

public val TAPE_ERASE_LONG: EraseTapeType = 1u

public val TAPE_ERASE_SHORT: EraseTapeType = 0u

public val TAPE_FILEMARKS: TapemarkType = 1u

public val TAPE_FIXED_PARTITIONS: CreateTapePartitionMethod = 0u

public val TAPE_FORMAT: PrepareTapeOperation = 5u

public val TAPE_INITIATOR_PARTITIONS: CreateTapePartitionMethod = 2u

public val TAPE_LOAD: PrepareTapeOperation = 0u

public val TAPE_LOCK: PrepareTapeOperation = 3u

public val TAPE_LOGICAL_BLOCK: TapePositionMethod = 2u

public val TAPE_LOGICAL_POSITION: TapePositionType = 1u

public val TAPE_LONG_FILEMARKS: TapemarkType = 3u

public val TAPE_REWIND: TapePositionMethod = 0u

public val TAPE_SELECT_PARTITIONS: CreateTapePartitionMethod = 1u

public val TAPE_SETMARKS: TapemarkType = 0u

public val TAPE_SHORT_FILEMARKS: TapemarkType = 2u

public val TAPE_SPACE_END_OF_DATA: TapePositionMethod = 4u

public val TAPE_SPACE_FILEMARKS: TapePositionMethod = 6u

public val TAPE_SPACE_RELATIVE_BLOCKS: TapePositionMethod = 5u

public val TAPE_SPACE_SEQUENTIAL_FMKS: TapePositionMethod = 7u

public val TAPE_SPACE_SEQUENTIAL_SMKS: TapePositionMethod = 9u

public val TAPE_SPACE_SETMARKS: TapePositionMethod = 8u

public val TAPE_TENSION: PrepareTapeOperation = 2u

public val TAPE_UNLOAD: PrepareTapeOperation = 1u

public val TAPE_UNLOCK: PrepareTapeOperation = 4u

public val TRANSACTIONMANAGER_OBJECT_PATH: Pcwstr = w("\\TransactionManager\\")

public val TRANSACTION_DO_NOT_PROMOTE: UInt = 1u

public val TRANSACTION_MANAGER_COMMIT_DEFAULT: UInt = 0u

public val TRANSACTION_MANAGER_COMMIT_LOWEST: UInt = 8u

public val TRANSACTION_MANAGER_COMMIT_SYSTEM_HIVES: UInt = 4u

public val TRANSACTION_MANAGER_COMMIT_SYSTEM_VOLUME: UInt = 2u

public val TRANSACTION_MANAGER_CORRUPT_FOR_PROGRESS: UInt = 32u

public val TRANSACTION_MANAGER_CORRUPT_FOR_RECOVERY: UInt = 16u

public val TRANSACTION_MANAGER_MAXIMUM_OPTION: UInt = 63u

public val TRANSACTION_MANAGER_VOLATILE: UInt = 1u

public val TRANSACTION_MAXIMUM_OPTION: UInt = 1u

public val TRANSACTION_NOTIFICATION_TM_ONLINE_FLAG_IS_CLUSTERED: UInt = 1u

public val TRANSACTION_NOTIFY_COMMIT: UInt = 4u

public val TRANSACTION_NOTIFY_COMMIT_COMPLETE: UInt = 64u

public val TRANSACTION_NOTIFY_COMMIT_FINALIZE: UInt = 1073741824u

public val TRANSACTION_NOTIFY_COMMIT_REQUEST: UInt = 67108864u

public val TRANSACTION_NOTIFY_DELEGATE_COMMIT: UInt = 1024u

public val TRANSACTION_NOTIFY_ENLIST_MASK: UInt = 262144u

public val TRANSACTION_NOTIFY_ENLIST_PREPREPARE: UInt = 4096u

public val TRANSACTION_NOTIFY_INDOUBT: UInt = 16384u

public val TRANSACTION_NOTIFY_LAST_RECOVER: UInt = 8192u

public val TRANSACTION_NOTIFY_MARSHAL: UInt = 131072u

public val TRANSACTION_NOTIFY_MASK: UInt = 1073741823u

public val TRANSACTION_NOTIFY_PREPARE: UInt = 2u

public val TRANSACTION_NOTIFY_PREPARE_COMPLETE: UInt = 32u

public val TRANSACTION_NOTIFY_PREPREPARE: UInt = 1u

public val TRANSACTION_NOTIFY_PREPREPARE_COMPLETE: UInt = 16u

public val TRANSACTION_NOTIFY_PROMOTE: UInt = 134217728u

public val TRANSACTION_NOTIFY_PROMOTE_NEW: UInt = 268435456u

public val TRANSACTION_NOTIFY_PROPAGATE_PULL: UInt = 32768u

public val TRANSACTION_NOTIFY_PROPAGATE_PUSH: UInt = 65536u

public val TRANSACTION_NOTIFY_RECOVER: UInt = 256u

public val TRANSACTION_NOTIFY_RECOVER_QUERY: UInt = 2048u

public val TRANSACTION_NOTIFY_REQUEST_OUTCOME: UInt = 536870912u

public val TRANSACTION_NOTIFY_RM_DISCONNECTED: UInt = 16777216u

public val TRANSACTION_NOTIFY_ROLLBACK: UInt = 8u

public val TRANSACTION_NOTIFY_ROLLBACK_COMPLETE: UInt = 128u

public val TRANSACTION_NOTIFY_SINGLE_PHASE_COMMIT: UInt = 512u

public val TRANSACTION_NOTIFY_TM_ONLINE: UInt = 33554432u

public val TRANSACTION_OBJECT_PATH: Pcwstr = w("\\Transaction\\")

public val TRUNCATE_EXISTING: FileCreationDisposition = 5u

public val TXFS_MINIVERSION_COMMITTED_VIEW: TxfsMiniversion = 0u

public val TXFS_MINIVERSION_DEFAULT_VIEW: TxfsMiniversion = 65534u

public val TXFS_MINIVERSION_DIRTY_VIEW: TxfsMiniversion = 65535u

public val TXF_LOG_RECORD_GENERIC_TYPE_ABORT: UInt = 2u

public val TXF_LOG_RECORD_GENERIC_TYPE_COMMIT: UInt = 1u

public val TXF_LOG_RECORD_GENERIC_TYPE_DATA: UInt = 8u

public val TXF_LOG_RECORD_GENERIC_TYPE_PREPARE: UInt = 4u

public val TXF_LOG_RECORD_TYPE_AFFECTED_FILE: TxfLogRecordType = 4u.toUShort()

public val TXF_LOG_RECORD_TYPE_TRUNCATE: TxfLogRecordType = 2u.toUShort()

public val TXF_LOG_RECORD_TYPE_WRITE: TxfLogRecordType = 1u.toUShort()

public val TRANSACTION_OUTCOME_ABORTED: TransactionOutcome = 3

public val TRANSACTION_OUTCOME_COMMITTED: TransactionOutcome = 2

public val TRANSACTION_OUTCOME_UNDETERMINED: TransactionOutcome = 1

public val VFFF_ISSHAREDFILE: VerFindFileFlags = 1u

public val VFF_BUFFTOOSMALL: VerFindFileStatus = 4u

public val VFF_CURNEDEST: VerFindFileStatus = 1u

public val VFF_FILEINUSE: VerFindFileStatus = 2u

public val VFT2_DRV_COMM: VsFixedfileinfoFileSubtype = 10

public val VFT2_DRV_DISPLAY: VsFixedfileinfoFileSubtype = 4

public val VFT2_DRV_INPUTMETHOD: VsFixedfileinfoFileSubtype = 11

public val VFT2_DRV_INSTALLABLE: VsFixedfileinfoFileSubtype = 8

public val VFT2_DRV_KEYBOARD: VsFixedfileinfoFileSubtype = 2

public val VFT2_DRV_LANGUAGE: VsFixedfileinfoFileSubtype = 3

public val VFT2_DRV_MOUSE: VsFixedfileinfoFileSubtype = 5

public val VFT2_DRV_NETWORK: VsFixedfileinfoFileSubtype = 6

public val VFT2_DRV_PRINTER: VsFixedfileinfoFileSubtype = 1

public val VFT2_DRV_SOUND: VsFixedfileinfoFileSubtype = 9

public val VFT2_DRV_SYSTEM: VsFixedfileinfoFileSubtype = 7

public val VFT2_DRV_VERSIONED_PRINTER: VsFixedfileinfoFileSubtype = 12

public val VFT2_FONT_RASTER: VsFixedfileinfoFileSubtype = 1

public val VFT2_FONT_TRUETYPE: VsFixedfileinfoFileSubtype = 3

public val VFT2_FONT_VECTOR: VsFixedfileinfoFileSubtype = 2

public val VFT2_UNKNOWN: VsFixedfileinfoFileSubtype = 0

public val VFT_APP: VsFixedfileinfoFileType = 1

public val VFT_DLL: VsFixedfileinfoFileType = 2

public val VFT_DRV: VsFixedfileinfoFileType = 3

public val VFT_FONT: VsFixedfileinfoFileType = 4

public val VFT_STATIC_LIB: VsFixedfileinfoFileType = 7

public val VFT_UNKNOWN: VsFixedfileinfoFileType = 0

public val VFT_VXD: VsFixedfileinfoFileType = 5

public val VIFF_DONTDELETEOLD: VerInstallFileFlags = 2u

public val VIFF_FORCEINSTALL: VerInstallFileFlags = 1u

public val VIF_ACCESSVIOLATION: VerInstallFileStatus = 512u

public val VIF_BUFFTOOSMALL: VerInstallFileStatus = 262144u

public val VIF_CANNOTCREATE: VerInstallFileStatus = 2048u

public val VIF_CANNOTDELETE: VerInstallFileStatus = 4096u

public val VIF_CANNOTDELETECUR: VerInstallFileStatus = 16384u

public val VIF_CANNOTLOADCABINET: VerInstallFileStatus = 1048576u

public val VIF_CANNOTLOADLZ32: VerInstallFileStatus = 524288u

public val VIF_CANNOTREADDST: VerInstallFileStatus = 131072u

public val VIF_CANNOTREADSRC: VerInstallFileStatus = 65536u

public val VIF_CANNOTRENAME: VerInstallFileStatus = 8192u

public val VIF_DIFFCODEPG: VerInstallFileStatus = 16u

public val VIF_DIFFLANG: VerInstallFileStatus = 8u

public val VIF_DIFFTYPE: VerInstallFileStatus = 32u

public val VIF_FILEINUSE: VerInstallFileStatus = 128u

public val VIF_MISMATCH: VerInstallFileStatus = 2u

public val VIF_OUTOFMEMORY: VerInstallFileStatus = 32768u

public val VIF_OUTOFSPACE: VerInstallFileStatus = 256u

public val VIF_SHARINGVIOLATION: VerInstallFileStatus = 1024u

public val VIF_SRCOLD: VerInstallFileStatus = 4u

public val VIF_TEMPFILE: VerInstallFileStatus = 1u

public val VIF_WRITEPROT: VerInstallFileStatus = 64u

public val VOLUME_NAME_DOS: GetfinalpathnamebyhandleFlags = 0u

public val VOLUME_NAME_GUID: GetfinalpathnamebyhandleFlags = 1u

public val VOLUME_NAME_NONE: GetfinalpathnamebyhandleFlags = 4u

public val VOLUME_NAME_NT: GetfinalpathnamebyhandleFlags = 2u

public val VOS_DOS: VsFixedfileinfoFileOs = 65536u

public val VOS_DOS_WINDOWS16: VsFixedfileinfoFileOs = 65537u

public val VOS_DOS_WINDOWS32: VsFixedfileinfoFileOs = 65540u

public val VOS_NT: VsFixedfileinfoFileOs = 262144u

public val VOS_NT_WINDOWS32: VsFixedfileinfoFileOs = 262148u

public val VOS_OS216: VsFixedfileinfoFileOs = 131072u

public val VOS_OS216_PM16: VsFixedfileinfoFileOs = 131074u

public val VOS_OS232: VsFixedfileinfoFileOs = 196608u

public val VOS_OS232_PM32: VsFixedfileinfoFileOs = 196611u

public val VOS_UNKNOWN: VsFixedfileinfoFileOs = 0u

public val VOS_WINCE: VsFixedfileinfoFileOs = 327680u

public val VOS__BASE: VsFixedfileinfoFileOs = 0u

public val VOS__PM16: VsFixedfileinfoFileOs = 2u

public val VOS__PM32: VsFixedfileinfoFileOs = 3u

public val VOS__WINDOWS16: VsFixedfileinfoFileOs = 1u

public val VOS__WINDOWS32: VsFixedfileinfoFileOs = 4u

public val VS_FFI_FILEFLAGSMASK: Int = 63

public val VS_FFI_SIGNATURE: Int = -17890115

public val VS_FFI_STRUCVERSION: Int = 65536

public val VS_FF_DEBUG: VsFixedfileinfoFileFlags = 1u

public val VS_FF_INFOINFERRED: VsFixedfileinfoFileFlags = 16u

public val VS_FF_PATCHED: VsFixedfileinfoFileFlags = 4u

public val VS_FF_PRERELEASE: VsFixedfileinfoFileFlags = 2u

public val VS_FF_PRIVATEBUILD: VsFixedfileinfoFileFlags = 8u

public val VS_FF_SPECIALBUILD: VsFixedfileinfoFileFlags = 32u

public val VS_USER_DEFINED: UInt = 100u

public val VS_VERSION_INFO: UInt = 1u

public val WIM_BOOT_NOT_OS_WIM: UInt = 0u

public val WIM_BOOT_OS_WIM: UInt = 1u

public val WIM_ENTRY_FLAG_NOT_ACTIVE: UInt = 1u

public val WIM_ENTRY_FLAG_SUSPENDED: UInt = 2u

public val WIM_EXTERNAL_FILE_INFO_FLAG_NOT_ACTIVE: UInt = 1u

public val WIM_EXTERNAL_FILE_INFO_FLAG_SUSPENDED: UInt = 2u

public val WIM_PROVIDER_HASH_SIZE: UInt = 20u

public val WINEFS_SETUSERKEY_SET_CAPABILITIES: UInt = 1u

public val WOF_PROVIDER_FILE: UInt = 2u

public val WOF_PROVIDER_WIM: UInt = 1u

public val WRITE_DAC: FileAccessRights = 262144u

public val WRITE_OWNER: FileAccessRights = 524288u

public val FT_TYPES_DEFINITION: UInt = 1u
