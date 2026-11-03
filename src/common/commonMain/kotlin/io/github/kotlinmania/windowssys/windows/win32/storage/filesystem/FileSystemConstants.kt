package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ACCESS_ALL: SHARE_INFO_PERMISSIONS = 32768u

public val ACCESS_ATRIB: SHARE_INFO_PERMISSIONS = 32u

public val ACCESS_CREATE: SHARE_INFO_PERMISSIONS = 4u

public val ACCESS_DELETE: SHARE_INFO_PERMISSIONS = 16u

public val ACCESS_EXEC: SHARE_INFO_PERMISSIONS = 8u

public val ACCESS_PERM: SHARE_INFO_PERMISSIONS = 64u

public val ACCESS_READ: SHARE_INFO_PERMISSIONS = 1u

public val ACCESS_WRITE: SHARE_INFO_PERMISSIONS = 2u

public val BACKUP_ALTERNATE_DATA: WIN_STREAM_ID = 4u

public val BACKUP_DATA: WIN_STREAM_ID = 1u

public val BACKUP_EA_DATA: WIN_STREAM_ID = 2u

public val BACKUP_LINK: WIN_STREAM_ID = 5u

public val BACKUP_OBJECT_ID: WIN_STREAM_ID = 7u

public val BACKUP_PROPERTY_DATA: WIN_STREAM_ID = 6u

public val BACKUP_REPARSE_DATA: WIN_STREAM_ID = 8u

public val BACKUP_SECURITY_DATA: WIN_STREAM_ID = 3u

public val BACKUP_SPARSE_BLOCK: WIN_STREAM_ID = 9u

public val BACKUP_TXFS_DATA: WIN_STREAM_ID = 10u

public val BusType1394: STORAGE_BUS_TYPE = 4

public val BusTypeAta: STORAGE_BUS_TYPE = 3

public val BusTypeAtapi: STORAGE_BUS_TYPE = 2

public val BusTypeFibre: STORAGE_BUS_TYPE = 6

public val BusTypeFileBackedVirtual: STORAGE_BUS_TYPE = 15

public val BusTypeMax: STORAGE_BUS_TYPE = 20

public val BusTypeMaxReserved: STORAGE_BUS_TYPE = 127

public val BusTypeMmc: STORAGE_BUS_TYPE = 13

public val BusTypeNvme: STORAGE_BUS_TYPE = 17

public val BusTypeRAID: STORAGE_BUS_TYPE = 8

public val BusTypeSCM: STORAGE_BUS_TYPE = 18

public val BusTypeSas: STORAGE_BUS_TYPE = 10

public val BusTypeSata: STORAGE_BUS_TYPE = 11

public val BusTypeScsi: STORAGE_BUS_TYPE = 1

public val BusTypeSd: STORAGE_BUS_TYPE = 12

public val BusTypeSpaces: STORAGE_BUS_TYPE = 16

public val BusTypeSsa: STORAGE_BUS_TYPE = 5

public val BusTypeUfs: STORAGE_BUS_TYPE = 19

public val BusTypeUnknown: STORAGE_BUS_TYPE = 0

public val BusTypeUsb: STORAGE_BUS_TYPE = 7

public val BusTypeVirtual: STORAGE_BUS_TYPE = 14

public val BusTypeiScsi: STORAGE_BUS_TYPE = 9

public val CALLBACK_CHUNK_FINISHED: LPPROGRESS_ROUTINE_CALLBACK_REASON = 0u

public val CALLBACK_STREAM_SWITCH: LPPROGRESS_ROUTINE_CALLBACK_REASON = 1u

public val CLFS_BASELOG_EXTENSION: PCWSTR = w(".blf")

public val CLFS_CONTAINER_RELATIVE_PREFIX: PCWSTR = w("%BLF%\\")

public val CLFS_CONTAINER_STREAM_PREFIX: PCWSTR = w("%BLF%:")

public val CLFS_FLAG_FILTER_INTERMEDIATE_LEVEL: UInt = 16u

public val CLFS_FLAG_FILTER_TOP_LEVEL: UInt = 32u

public val CLFS_FLAG_FORCE_APPEND: CLFS_FLAG = 1u

public val CLFS_FLAG_FORCE_FLUSH: CLFS_FLAG = 2u

public val CLFS_FLAG_HIDDEN_SYSTEM_LOG: UInt = 512u

public val CLFS_FLAG_IGNORE_SHARE_ACCESS: UInt = 64u

public val CLFS_FLAG_MINIFILTER_LEVEL: UInt = 256u

public val CLFS_FLAG_NON_REENTRANT_FILTER: UInt = 16u

public val CLFS_FLAG_NO_FLAGS: CLFS_FLAG = 0u

public val CLFS_FLAG_READ_IN_PROGRESS: UInt = 128u

public val CLFS_FLAG_REENTRANT_FILE_SYSTEM: UInt = 8u

public val CLFS_FLAG_REENTRANT_FILTER: UInt = 32u

public val CLFS_FLAG_USE_RESERVATION: CLFS_FLAG = 4u

public val CLFS_MARSHALLING_FLAG_DISABLE_BUFF_INIT: UInt = 1u

public val CLFS_MARSHALLING_FLAG_NONE: UInt = 0u

public val CLFS_MAX_CONTAINER_INFO: UInt = 256u

public val CLFS_MGMT_CLIENT_REGISTRATION_VERSION: UInt = 1u

public val CLFS_MGMT_POLICY_VERSION: UInt = 1u

public val CLFS_SCAN_BACKWARD: UByte = 4u

public val CLFS_SCAN_BUFFERED: UByte = 32u

public val CLFS_SCAN_CLOSE: UByte = 8u

public val CLFS_SCAN_FORWARD: UByte = 2u

public val CLFS_SCAN_INIT: UByte = 1u

public val CLFS_SCAN_INITIALIZED: UByte = 16u

public val CLSID_DiskQuotaControl: GUID = GUID.from_u128(0x7988b571ec8911cfuL, 0x9c0000aa00a14f56uL)

public val COMPRESSION_FORMAT_DEFAULT: COMPRESSION_FORMAT = 1u

public val COMPRESSION_FORMAT_LZNT1: COMPRESSION_FORMAT = 2u

public val COMPRESSION_FORMAT_NONE: COMPRESSION_FORMAT = 0u

public val COMPRESSION_FORMAT_XP10: COMPRESSION_FORMAT = 5u

public val COMPRESSION_FORMAT_XPRESS: COMPRESSION_FORMAT = 3u

public val COMPRESSION_FORMAT_XPRESS_HUFF: COMPRESSION_FORMAT = 4u

public val COPYFILE2_CALLBACK_CHUNK_FINISHED: COPYFILE2_MESSAGE_TYPE = 2

public val COPYFILE2_CALLBACK_CHUNK_STARTED: COPYFILE2_MESSAGE_TYPE = 1

public val COPYFILE2_CALLBACK_ERROR: COPYFILE2_MESSAGE_TYPE = 6

public val COPYFILE2_CALLBACK_MAX: COPYFILE2_MESSAGE_TYPE = 7

public val COPYFILE2_CALLBACK_NONE: COPYFILE2_MESSAGE_TYPE = 0

public val COPYFILE2_CALLBACK_POLL_CONTINUE: COPYFILE2_MESSAGE_TYPE = 5

public val COPYFILE2_CALLBACK_STREAM_FINISHED: COPYFILE2_MESSAGE_TYPE = 4

public val COPYFILE2_CALLBACK_STREAM_STARTED: COPYFILE2_MESSAGE_TYPE = 3

public val COPYFILE2_IO_CYCLE_SIZE_MAX: UInt = 1073741824u

public val COPYFILE2_IO_CYCLE_SIZE_MIN: UInt = 4096u

public val COPYFILE2_IO_RATE_MIN: UInt = 512u

public val COPYFILE2_MESSAGE_COPY_OFFLOAD: Int = 1

public val COPYFILE2_PHASE_MAX: COPYFILE2_COPY_PHASE = 7

public val COPYFILE2_PHASE_NAMEGRAFT_COPY: COPYFILE2_COPY_PHASE = 6

public val COPYFILE2_PHASE_NONE: COPYFILE2_COPY_PHASE = 0

public val COPYFILE2_PHASE_PREPARE_DEST: COPYFILE2_COPY_PHASE = 2

public val COPYFILE2_PHASE_PREPARE_SOURCE: COPYFILE2_COPY_PHASE = 1

public val COPYFILE2_PHASE_READ_SOURCE: COPYFILE2_COPY_PHASE = 3

public val COPYFILE2_PHASE_SERVER_COPY: COPYFILE2_COPY_PHASE = 5

public val COPYFILE2_PHASE_WRITE_DESTINATION: COPYFILE2_COPY_PHASE = 4

public val COPYFILE2_PROGRESS_CANCEL: COPYFILE2_MESSAGE_ACTION = 1

public val COPYFILE2_PROGRESS_CONTINUE: COPYFILE2_MESSAGE_ACTION = 0

public val COPYFILE2_PROGRESS_PAUSE: COPYFILE2_MESSAGE_ACTION = 4

public val COPYFILE2_PROGRESS_QUIET: COPYFILE2_MESSAGE_ACTION = 3

public val COPYFILE2_PROGRESS_STOP: COPYFILE2_MESSAGE_ACTION = 2

public val COPY_FILE2_V2_DONT_COPY_JUNCTIONS: COPYFILE2_V2_FLAGS = 1u

public val COPY_FILE2_V2_VALID_FLAGS: COPYFILE2_V2_FLAGS = 1u

public val COPY_FILE_ALLOW_DECRYPTED_DESTINATION: COPYFILE_FLAGS = 8u

public val COPY_FILE_COPY_SYMLINK: COPYFILE_FLAGS = 2048u

public val COPY_FILE_DIRECTORY: COPYFILE_FLAGS = 128u

public val COPY_FILE_DISABLE_PRE_ALLOCATION: COPYFILE_FLAGS = 67108864u

public val COPY_FILE_DONT_REQUEST_DEST_WRITE_DAC: COPYFILE_FLAGS = 33554432u

public val COPY_FILE_ENABLE_LOW_FREE_SPACE_MODE: COPYFILE_FLAGS = 134217728u

public val COPY_FILE_ENABLE_SPARSE_COPY: COPYFILE_FLAGS = 536870912u

public val COPY_FILE_FAIL_IF_EXISTS: COPYFILE_FLAGS = 1u

public val COPY_FILE_IGNORE_EDP_BLOCK: COPYFILE_FLAGS = 4194304u

public val COPY_FILE_IGNORE_SOURCE_ENCRYPTION: COPYFILE_FLAGS = 8388608u

public val COPY_FILE_NO_BUFFERING: COPYFILE_FLAGS = 4096u

public val COPY_FILE_NO_OFFLOAD: COPYFILE_FLAGS = 262144u

public val COPY_FILE_OPEN_AND_COPY_REPARSE_POINT: COPYFILE_FLAGS = 2097152u

public val COPY_FILE_OPEN_SOURCE_FOR_WRITE: COPYFILE_FLAGS = 4u

public val COPY_FILE_REQUEST_COMPRESSED_TRAFFIC: COPYFILE_FLAGS = 268435456u

public val COPY_FILE_REQUEST_SECURITY_PRIVILEGES: COPYFILE_FLAGS = 8192u

public val COPY_FILE_RESTARTABLE: COPYFILE_FLAGS = 2u

public val COPY_FILE_RESUME_FROM_PAUSE: COPYFILE_FLAGS = 16384u

public val COPY_FILE_SKIP_ALTERNATE_STREAMS: COPYFILE_FLAGS = 32768u

public val CREATE_ALWAYS: FILE_CREATION_DISPOSITION = 2u

public val CREATE_NEW: FILE_CREATION_DISPOSITION = 1u

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

public val ClfsClientRecord: UByte = 3u

public val ClfsContainerActive: UInt = 4u

public val ClfsContainerActivePendingDelete: UInt = 8u

public val ClfsContainerInactive: UInt = 2u

public val ClfsContainerInitializing: UInt = 1u

public val ClfsContainerPendingArchive: UInt = 16u

public val ClfsContainerPendingArchiveAndDelete: UInt = 32u

public val ClfsContextForward: CLFS_CONTEXT_MODE = 3

public val ClfsContextNone: CLFS_CONTEXT_MODE = 0

public val ClfsContextPrevious: CLFS_CONTEXT_MODE = 2

public val ClfsContextUndoNext: CLFS_CONTEXT_MODE = 1

public val ClfsDataRecord: UByte = 1u

public val ClfsIoStatsDefault: CLFS_IOSTATS_CLASS = 0

public val ClfsIoStatsMax: CLFS_IOSTATS_CLASS = 65535

public val ClfsLogArchiveDisabled: CLFS_LOG_ARCHIVE_MODE = 2

public val ClfsLogArchiveEnabled: CLFS_LOG_ARCHIVE_MODE = 1

public val ClfsLogBasicInformation: CLS_LOG_INFORMATION_CLASS = 0

public val ClfsLogBasicInformationPhysical: CLS_LOG_INFORMATION_CLASS = 1

public val ClfsLogPhysicalLsnInformation: CLS_LOG_INFORMATION_CLASS = 5

public val ClfsLogPhysicalNameInformation: CLS_LOG_INFORMATION_CLASS = 2

public val ClfsLogStreamIdentifierInformation: CLS_LOG_INFORMATION_CLASS = 3

public val ClfsLogSystemMarkingInformation: CLS_LOG_INFORMATION_CLASS = 4

public val ClfsMgmtAdvanceTailNotification: CLFS_MGMT_NOTIFICATION_TYPE = 0

public val ClfsMgmtLogFullHandlerNotification: CLFS_MGMT_NOTIFICATION_TYPE = 1

public val ClfsMgmtLogUnpinnedNotification: CLFS_MGMT_NOTIFICATION_TYPE = 2

public val ClfsMgmtLogWriteNotification: CLFS_MGMT_NOTIFICATION_TYPE = 3

public val ClfsMgmtPolicyAutoGrow: CLFS_MGMT_POLICY_TYPE = 6

public val ClfsMgmtPolicyAutoShrink: CLFS_MGMT_POLICY_TYPE = 5

public val ClfsMgmtPolicyGrowthRate: CLFS_MGMT_POLICY_TYPE = 3

public val ClfsMgmtPolicyInvalid: CLFS_MGMT_POLICY_TYPE = 10

public val ClfsMgmtPolicyLogTail: CLFS_MGMT_POLICY_TYPE = 4

public val ClfsMgmtPolicyMaximumSize: CLFS_MGMT_POLICY_TYPE = 0

public val ClfsMgmtPolicyMinimumSize: CLFS_MGMT_POLICY_TYPE = 1

public val ClfsMgmtPolicyNewContainerExtension: CLFS_MGMT_POLICY_TYPE = 9

public val ClfsMgmtPolicyNewContainerPrefix: CLFS_MGMT_POLICY_TYPE = 7

public val ClfsMgmtPolicyNewContainerSize: CLFS_MGMT_POLICY_TYPE = 2

public val ClfsMgmtPolicyNewContainerSuffix: CLFS_MGMT_POLICY_TYPE = 8

public val ClfsNullRecord: UByte = 0u

public val ClfsRestartRecord: UByte = 2u

public val ClsContainerActive: UInt = 4u

public val ClsContainerActivePendingDelete: UInt = 8u

public val ClsContainerInactive: UInt = 2u

public val ClsContainerInitializing: UInt = 1u

public val ClsContainerPendingArchive: UInt = 16u

public val ClsContainerPendingArchiveAndDelete: UInt = 32u

public val ClsContextForward: CLS_CONTEXT_MODE = 3

public val ClsContextNone: CLS_CONTEXT_MODE = 0

public val ClsContextPrevious: CLS_CONTEXT_MODE = 2

public val ClsContextUndoNext: CLS_CONTEXT_MODE = 1

public val ClsIoStatsDefault: CLS_IOSTATS_CLASS = 0

public val ClsIoStatsMax: CLS_IOSTATS_CLASS = 65535

public val DDD_EXACT_MATCH_ON_REMOVE: DEFINE_DOS_DEVICE_FLAGS = 4u

public val DDD_LUID_BROADCAST_DRIVE: DEFINE_DOS_DEVICE_FLAGS = 16u

public val DDD_NO_BROADCAST_SYSTEM: DEFINE_DOS_DEVICE_FLAGS = 8u

public val DDD_RAW_TARGET_PATH: DEFINE_DOS_DEVICE_FLAGS = 1u

public val DDD_REMOVE_DEFINITION: DEFINE_DOS_DEVICE_FLAGS = 2u

public val DELETE: FILE_ACCESS_RIGHTS = 65536u

public val DISKQUOTA_FILESTATE_INCOMPLETE: UInt = 256u

public val DISKQUOTA_FILESTATE_MASK: UInt = 768u

public val DISKQUOTA_FILESTATE_REBUILDING: UInt = 512u

public val DISKQUOTA_LOGFLAG_USER_LIMIT: UInt = 2u

public val DISKQUOTA_LOGFLAG_USER_THRESHOLD: UInt = 1u

public val DISKQUOTA_STATE_DISABLED: UInt = 0u

public val DISKQUOTA_STATE_ENFORCE: UInt = 2u

public val DISKQUOTA_STATE_MASK: UInt = 3u

public val DISKQUOTA_STATE_TRACK: UInt = 1u

public val DISKQUOTA_USERNAME_RESOLVE_ASYNC: DISKQUOTA_USERNAME_RESOLVE = 2u

public val DISKQUOTA_USERNAME_RESOLVE_NONE: DISKQUOTA_USERNAME_RESOLVE = 0u

public val DISKQUOTA_USERNAME_RESOLVE_SYNC: DISKQUOTA_USERNAME_RESOLVE = 1u

public val DISKQUOTA_USER_ACCOUNT_DELETED: UInt = 2u

public val DISKQUOTA_USER_ACCOUNT_INVALID: UInt = 3u

public val DISKQUOTA_USER_ACCOUNT_RESOLVED: UInt = 0u

public val DISKQUOTA_USER_ACCOUNT_UNAVAILABLE: UInt = 1u

public val DISKQUOTA_USER_ACCOUNT_UNKNOWN: UInt = 4u

public val DISKQUOTA_USER_ACCOUNT_UNRESOLVED: UInt = 5u

public val EA_CONTAINER_NAME: PCSTR = s("ContainerName")

public val EA_CONTAINER_SIZE: PCSTR = s("ContainerSize")

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

public val ENLISTMENT_OBJECT_PATH: PCWSTR = w("\\Enlistment\\")

public val ENLISTMENT_SUPERIOR: UInt = 1u

public val ExtendedFileIdType: FILE_ID_TYPE = 2

public val FILE_ACTION_ADDED: FILE_ACTION = 1u

public val FILE_ACTION_MODIFIED: FILE_ACTION = 3u

public val FILE_ACTION_REMOVED: FILE_ACTION = 2u

public val FILE_ACTION_RENAMED_NEW_NAME: FILE_ACTION = 5u

public val FILE_ACTION_RENAMED_OLD_NAME: FILE_ACTION = 4u

public val FILE_ADD_FILE: FILE_ACCESS_RIGHTS = 2u

public val FILE_ADD_SUBDIRECTORY: FILE_ACCESS_RIGHTS = 4u

public val FILE_ALL_ACCESS: FILE_ACCESS_RIGHTS = 2032127u

public val FILE_APPEND_DATA: FILE_ACCESS_RIGHTS = 4u

public val FILE_ATTRIBUTE_ARCHIVE: FILE_FLAGS_AND_ATTRIBUTES = 32u

public val FILE_ATTRIBUTE_COMPRESSED: FILE_FLAGS_AND_ATTRIBUTES = 2048u

public val FILE_ATTRIBUTE_DEVICE: FILE_FLAGS_AND_ATTRIBUTES = 64u

public val FILE_ATTRIBUTE_DIRECTORY: FILE_FLAGS_AND_ATTRIBUTES = 16u

public val FILE_ATTRIBUTE_EA: FILE_FLAGS_AND_ATTRIBUTES = 262144u

public val FILE_ATTRIBUTE_ENCRYPTED: FILE_FLAGS_AND_ATTRIBUTES = 16384u

public val FILE_ATTRIBUTE_HIDDEN: FILE_FLAGS_AND_ATTRIBUTES = 2u

public val FILE_ATTRIBUTE_INTEGRITY_STREAM: FILE_FLAGS_AND_ATTRIBUTES = 32768u

public val FILE_ATTRIBUTE_NORMAL: FILE_FLAGS_AND_ATTRIBUTES = 128u

public val FILE_ATTRIBUTE_NOT_CONTENT_INDEXED: FILE_FLAGS_AND_ATTRIBUTES = 8192u

public val FILE_ATTRIBUTE_NO_SCRUB_DATA: FILE_FLAGS_AND_ATTRIBUTES = 131072u

public val FILE_ATTRIBUTE_OFFLINE: FILE_FLAGS_AND_ATTRIBUTES = 4096u

public val FILE_ATTRIBUTE_PINNED: FILE_FLAGS_AND_ATTRIBUTES = 524288u

public val FILE_ATTRIBUTE_READONLY: FILE_FLAGS_AND_ATTRIBUTES = 1u

public val FILE_ATTRIBUTE_RECALL_ON_DATA_ACCESS: FILE_FLAGS_AND_ATTRIBUTES = 4194304u

public val FILE_ATTRIBUTE_RECALL_ON_OPEN: FILE_FLAGS_AND_ATTRIBUTES = 262144u

public val FILE_ATTRIBUTE_REPARSE_POINT: FILE_FLAGS_AND_ATTRIBUTES = 1024u

public val FILE_ATTRIBUTE_SPARSE_FILE: FILE_FLAGS_AND_ATTRIBUTES = 512u

public val FILE_ATTRIBUTE_SYSTEM: FILE_FLAGS_AND_ATTRIBUTES = 4u

public val FILE_ATTRIBUTE_TEMPORARY: FILE_FLAGS_AND_ATTRIBUTES = 256u

public val FILE_ATTRIBUTE_UNPINNED: FILE_FLAGS_AND_ATTRIBUTES = 1048576u

public val FILE_ATTRIBUTE_VIRTUAL: FILE_FLAGS_AND_ATTRIBUTES = 65536u

public val FILE_BEGIN: SET_FILE_POINTER_MOVE_METHOD = 0u

public val FILE_CREATE_PIPE_INSTANCE: FILE_ACCESS_RIGHTS = 4u

public val FILE_CURRENT: SET_FILE_POINTER_MOVE_METHOD = 1u

public val FILE_DELETE_CHILD: FILE_ACCESS_RIGHTS = 64u

public val FILE_DEVICE_CD_ROM: FILE_DEVICE_TYPE = 2u

public val FILE_DEVICE_DISK: FILE_DEVICE_TYPE = 7u

public val FILE_DEVICE_DVD: FILE_DEVICE_TYPE = 51u

public val FILE_DEVICE_TAPE: FILE_DEVICE_TYPE = 31u

public val FILE_DISPOSITION_FLAG_DELETE: FILE_DISPOSITION_INFO_EX_FLAGS = 1u

public val FILE_DISPOSITION_FLAG_DO_NOT_DELETE: FILE_DISPOSITION_INFO_EX_FLAGS = 0u

public val FILE_DISPOSITION_FLAG_FORCE_IMAGE_SECTION_CHECK: FILE_DISPOSITION_INFO_EX_FLAGS = 4u

public val FILE_DISPOSITION_FLAG_IGNORE_READONLY_ATTRIBUTE: FILE_DISPOSITION_INFO_EX_FLAGS = 16u

public val FILE_DISPOSITION_FLAG_ON_CLOSE: FILE_DISPOSITION_INFO_EX_FLAGS = 8u

public val FILE_DISPOSITION_FLAG_POSIX_SEMANTICS: FILE_DISPOSITION_INFO_EX_FLAGS = 2u

public val FILE_END: SET_FILE_POINTER_MOVE_METHOD = 2u

public val FILE_EXECUTE: FILE_ACCESS_RIGHTS = 32u

public val FILE_FLAG_BACKUP_SEMANTICS: FILE_FLAGS_AND_ATTRIBUTES = 33554432u

public val FILE_FLAG_DELETE_ON_CLOSE: FILE_FLAGS_AND_ATTRIBUTES = 67108864u

public val FILE_FLAG_FIRST_PIPE_INSTANCE: FILE_FLAGS_AND_ATTRIBUTES = 524288u

public val FILE_FLAG_NO_BUFFERING: FILE_FLAGS_AND_ATTRIBUTES = 536870912u

public val FILE_FLAG_OPEN_NO_RECALL: FILE_FLAGS_AND_ATTRIBUTES = 1048576u

public val FILE_FLAG_OPEN_REPARSE_POINT: FILE_FLAGS_AND_ATTRIBUTES = 2097152u

public val FILE_FLAG_OVERLAPPED: FILE_FLAGS_AND_ATTRIBUTES = 1073741824u

public val FILE_FLAG_POSIX_SEMANTICS: FILE_FLAGS_AND_ATTRIBUTES = 16777216u

public val FILE_FLAG_RANDOM_ACCESS: FILE_FLAGS_AND_ATTRIBUTES = 268435456u

public val FILE_FLAG_SEQUENTIAL_SCAN: FILE_FLAGS_AND_ATTRIBUTES = 134217728u

public val FILE_FLAG_SESSION_AWARE: FILE_FLAGS_AND_ATTRIBUTES = 8388608u

public val FILE_FLAG_WRITE_THROUGH: FILE_FLAGS_AND_ATTRIBUTES = 2147483648u

public val FILE_FLUSH_DATA: FILE_FLUSH_MODE = 1

public val FILE_FLUSH_DEFAULT: FILE_FLUSH_MODE = 0

public val FILE_FLUSH_MIN_METADATA: FILE_FLUSH_MODE = 2

public val FILE_FLUSH_NO_SYNC: FILE_FLUSH_MODE = 3

public val FILE_GENERIC_EXECUTE: FILE_ACCESS_RIGHTS = 1179808u

public val FILE_GENERIC_READ: FILE_ACCESS_RIGHTS = 1179785u

public val FILE_GENERIC_WRITE: FILE_ACCESS_RIGHTS = 1179926u

public val FILE_LIST_DIRECTORY: FILE_ACCESS_RIGHTS = 1u

public val FILE_NAME_NORMALIZED: GETFINALPATHNAMEBYHANDLE_FLAGS = 0u

public val FILE_NAME_OPENED: GETFINALPATHNAMEBYHANDLE_FLAGS = 8u

public val FILE_NOTIFY_CHANGE_ATTRIBUTES: FILE_NOTIFY_CHANGE = 4u

public val FILE_NOTIFY_CHANGE_CREATION: FILE_NOTIFY_CHANGE = 64u

public val FILE_NOTIFY_CHANGE_DIR_NAME: FILE_NOTIFY_CHANGE = 2u

public val FILE_NOTIFY_CHANGE_FILE_NAME: FILE_NOTIFY_CHANGE = 1u

public val FILE_NOTIFY_CHANGE_LAST_ACCESS: FILE_NOTIFY_CHANGE = 32u

public val FILE_NOTIFY_CHANGE_LAST_WRITE: FILE_NOTIFY_CHANGE = 16u

public val FILE_NOTIFY_CHANGE_SECURITY: FILE_NOTIFY_CHANGE = 256u

public val FILE_NOTIFY_CHANGE_SIZE: FILE_NOTIFY_CHANGE = 8u

public val FILE_PROVIDER_COMPRESSION_LZX: UInt = 1u

public val FILE_PROVIDER_COMPRESSION_XPRESS16K: UInt = 3u

public val FILE_PROVIDER_COMPRESSION_XPRESS4K: UInt = 0u

public val FILE_PROVIDER_COMPRESSION_XPRESS8K: UInt = 2u

public val FILE_READ_ATTRIBUTES: FILE_ACCESS_RIGHTS = 128u

public val FILE_READ_DATA: FILE_ACCESS_RIGHTS = 1u

public val FILE_READ_EA: FILE_ACCESS_RIGHTS = 8u

public val FILE_SHARE_DELETE: FILE_SHARE_MODE = 4u

public val FILE_SHARE_NONE: FILE_SHARE_MODE = 0u

public val FILE_SHARE_READ: FILE_SHARE_MODE = 1u

public val FILE_SHARE_WRITE: FILE_SHARE_MODE = 2u

public val FILE_TRAVERSE: FILE_ACCESS_RIGHTS = 32u

public val FILE_TYPE_CHAR: FILE_TYPE = 2u

public val FILE_TYPE_DISK: FILE_TYPE = 1u

public val FILE_TYPE_PIPE: FILE_TYPE = 3u

public val FILE_TYPE_REMOTE: FILE_TYPE = 32768u

public val FILE_TYPE_UNKNOWN: FILE_TYPE = 0u

public val FILE_VER_GET_LOCALISED: GET_FILE_VERSION_INFO_FLAGS = 1u

public val FILE_VER_GET_NEUTRAL: GET_FILE_VERSION_INFO_FLAGS = 2u

public val FILE_VER_GET_PREFETCHED: GET_FILE_VERSION_INFO_FLAGS = 4u

public val FILE_WRITE_ATTRIBUTES: FILE_ACCESS_RIGHTS = 256u

public val FILE_WRITE_DATA: FILE_ACCESS_RIGHTS = 2u

public val FILE_WRITE_EA: FILE_ACCESS_RIGHTS = 16u

public val FILE_WRITE_FLAGS_NONE: FILE_WRITE_FLAGS = 0

public val FILE_WRITE_FLAGS_WRITE_THROUGH: FILE_WRITE_FLAGS = 1

public val FIND_FIRST_EX_CASE_SENSITIVE: FIND_FIRST_EX_FLAGS = 1u

public val FIND_FIRST_EX_LARGE_FETCH: FIND_FIRST_EX_FLAGS = 2u

public val FIND_FIRST_EX_ON_DISK_ENTRIES_ONLY: FIND_FIRST_EX_FLAGS = 4u

public val FileAlignmentInfo: FILE_INFO_BY_HANDLE_CLASS = 17

public val FileAllocationInfo: FILE_INFO_BY_HANDLE_CLASS = 5

public val FileAttributeTagInfo: FILE_INFO_BY_HANDLE_CLASS = 9

public val FileBasicInfo: FILE_INFO_BY_HANDLE_CLASS = 0

public val FileCaseSensitiveInfo: FILE_INFO_BY_HANDLE_CLASS = 23

public val FileCompressionInfo: FILE_INFO_BY_HANDLE_CLASS = 8

public val FileDispositionInfo: FILE_INFO_BY_HANDLE_CLASS = 4

public val FileDispositionInfoEx: FILE_INFO_BY_HANDLE_CLASS = 21

public val FileEndOfFileInfo: FILE_INFO_BY_HANDLE_CLASS = 6

public val FileFullDirectoryInfo: FILE_INFO_BY_HANDLE_CLASS = 14

public val FileFullDirectoryRestartInfo: FILE_INFO_BY_HANDLE_CLASS = 15

public val FileIdBothDirectoryInfo: FILE_INFO_BY_HANDLE_CLASS = 10

public val FileIdBothDirectoryRestartInfo: FILE_INFO_BY_HANDLE_CLASS = 11

public val FileIdExtdDirectoryInfo: FILE_INFO_BY_HANDLE_CLASS = 19

public val FileIdExtdDirectoryRestartInfo: FILE_INFO_BY_HANDLE_CLASS = 20

public val FileIdInfo: FILE_INFO_BY_HANDLE_CLASS = 18

public val FileIdType: FILE_ID_TYPE = 0

public val FileIoPriorityHintInfo: FILE_INFO_BY_HANDLE_CLASS = 12

public val FileNameInfo: FILE_INFO_BY_HANDLE_CLASS = 2

public val FileNormalizedNameInfo: FILE_INFO_BY_HANDLE_CLASS = 24

public val FileRemoteProtocolInfo: FILE_INFO_BY_HANDLE_CLASS = 13

public val FileRenameInfo: FILE_INFO_BY_HANDLE_CLASS = 3

public val FileRenameInfoEx: FILE_INFO_BY_HANDLE_CLASS = 22

public val FileStandardInfo: FILE_INFO_BY_HANDLE_CLASS = 1

public val FileStorageInfo: FILE_INFO_BY_HANDLE_CLASS = 16

public val FileStreamInfo: FILE_INFO_BY_HANDLE_CLASS = 7

public val FindExInfoBasic: FINDEX_INFO_LEVELS = 1

public val FindExInfoMaxInfoLevel: FINDEX_INFO_LEVELS = 2

public val FindExInfoStandard: FINDEX_INFO_LEVELS = 0

public val FindExSearchLimitToDevices: FINDEX_SEARCH_OPS = 2

public val FindExSearchLimitToDirectories: FINDEX_SEARCH_OPS = 1

public val FindExSearchMaxSearchOp: FINDEX_SEARCH_OPS = 3

public val FindExSearchNameMatch: FINDEX_SEARCH_OPS = 0

public val FindStreamInfoMaxInfoLevel: STREAM_INFO_LEVELS = 1

public val FindStreamInfoStandard: STREAM_INFO_LEVELS = 0

public val GET_TAPE_DRIVE_INFORMATION: GET_TAPE_DRIVE_PARAMETERS_OPERATION = 1u

public val GET_TAPE_MEDIA_INFORMATION: GET_TAPE_DRIVE_PARAMETERS_OPERATION = 0u

public val GetFileExInfoStandard: GET_FILEEX_INFO_LEVELS = 0

public val GetFileExMaxInfoLevel: GET_FILEEX_INFO_LEVELS = 1

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

public val IORING_CREATE_ADVISORY_FLAGS_NONE: IORING_CREATE_ADVISORY_FLAGS = 0

public val IORING_CREATE_REQUIRED_FLAGS_NONE: IORING_CREATE_REQUIRED_FLAGS = 0

public val IORING_FEATURE_FLAGS_NONE: IORING_FEATURE_FLAGS = 0

public val IORING_FEATURE_SET_COMPLETION_EVENT: IORING_FEATURE_FLAGS = 2

public val IORING_FEATURE_UM_EMULATION: IORING_FEATURE_FLAGS = 1

public val IORING_OP_CANCEL: IORING_OP_CODE = 4

public val IORING_OP_FLUSH: IORING_OP_CODE = 6

public val IORING_OP_NOP: IORING_OP_CODE = 0

public val IORING_OP_READ: IORING_OP_CODE = 1

public val IORING_OP_REGISTER_BUFFERS: IORING_OP_CODE = 3

public val IORING_OP_REGISTER_FILES: IORING_OP_CODE = 2

public val IORING_OP_WRITE: IORING_OP_CODE = 5

public val IORING_REF_RAW: IORING_REF_KIND = 0

public val IORING_REF_REGISTERED: IORING_REF_KIND = 1

public val IORING_VERSION_1: IORING_VERSION = 1

public val IORING_VERSION_2: IORING_VERSION = 2

public val IORING_VERSION_3: IORING_VERSION = 300

public val IORING_VERSION_INVALID: IORING_VERSION = 0

public val IOSQE_FLAGS_DRAIN_PRECEDING_OPS: IORING_SQE_FLAGS = 1

public val IOSQE_FLAGS_NONE: IORING_SQE_FLAGS = 0

public val IoPriorityHintLow: PRIORITY_HINT = 1

public val IoPriorityHintNormal: PRIORITY_HINT = 2

public val IoPriorityHintVeryLow: PRIORITY_HINT = 0

public val KTM_MARSHAL_BLOB_VERSION_MAJOR: UInt = 1u

public val KTM_MARSHAL_BLOB_VERSION_MINOR: UInt = 1u

public val LOCKFILE_EXCLUSIVE_LOCK: LOCK_FILE_FLAGS = 2u

public val LOCKFILE_FAIL_IMMEDIATELY: LOCK_FILE_FLAGS = 1u

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

public val MOVEFILE_COPY_ALLOWED: MOVE_FILE_FLAGS = 2u

public val MOVEFILE_CREATE_HARDLINK: MOVE_FILE_FLAGS = 16u

public val MOVEFILE_DELAY_UNTIL_REBOOT: MOVE_FILE_FLAGS = 4u

public val MOVEFILE_FAIL_IF_NOT_TRACKABLE: MOVE_FILE_FLAGS = 32u

public val MOVEFILE_REPLACE_EXISTING: MOVE_FILE_FLAGS = 1u

public val MOVEFILE_WRITE_THROUGH: MOVE_FILE_FLAGS = 8u

public val MaximumFileIdType: FILE_ID_TYPE = 3

public val MaximumFileInfoByHandleClass: FILE_INFO_BY_HANDLE_CLASS = 25

public val MaximumIoPriorityHintType: PRIORITY_HINT = 3

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

public val NTMS_OMID_TYPE_FILESYSTEM_INFO: NTMS_OMID_TYPE = 2u

public val NTMS_OMID_TYPE_RAW_LABEL: NTMS_OMID_TYPE = 1u

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

public val OF_CANCEL: LZOPENFILE_STYLE = 2048u

public val OF_CREATE: LZOPENFILE_STYLE = 4096u

public val OF_DELETE: LZOPENFILE_STYLE = 512u

public val OF_EXIST: LZOPENFILE_STYLE = 16384u

public val OF_PARSE: LZOPENFILE_STYLE = 256u

public val OF_PROMPT: LZOPENFILE_STYLE = 8192u

public val OF_READ: LZOPENFILE_STYLE = 0u

public val OF_READWRITE: LZOPENFILE_STYLE = 2u

public val OF_REOPEN: LZOPENFILE_STYLE = 32768u

public val OF_SHARE_COMPAT: LZOPENFILE_STYLE = 0u

public val OF_SHARE_DENY_NONE: LZOPENFILE_STYLE = 64u

public val OF_SHARE_DENY_READ: LZOPENFILE_STYLE = 48u

public val OF_SHARE_DENY_WRITE: LZOPENFILE_STYLE = 32u

public val OF_SHARE_EXCLUSIVE: LZOPENFILE_STYLE = 16u

public val OF_VERIFY: LZOPENFILE_STYLE = 1024u

public val OF_WRITE: LZOPENFILE_STYLE = 1u

public val OPEN_ALWAYS: FILE_CREATION_DISPOSITION = 4u

public val OPEN_EXISTING: FILE_CREATION_DISPOSITION = 3u

public val ObjectIdType: FILE_ID_TYPE = 1

public val PARTITION_BASIC_DATA_GUID: GUID = GUID.from_u128(0xebd0a0a2b9e54433uL, 0x87c068b6b72699c7uL)

public val PARTITION_BSP_GUID: GUID = GUID.from_u128(0x57434f534df945b9uL, 0x8e9e2370f006457cuL)

public val PARTITION_CLUSTER_GUID: GUID = GUID.from_u128(0xdb97dba908404baeuL, 0x97f0ffb9a327c7e1uL)

public val PARTITION_DPP_GUID: GUID = GUID.from_u128(0x57434f5394cb43f0uL, 0xa533d73c10cfa57duL)

public val PARTITION_ENTRY_UNUSED_GUID: GUID = GUID.from_u128(0x0uL, 0x0uL)

public val PARTITION_LDM_DATA_GUID: GUID = GUID.from_u128(0xaf9b60a014314f62uL, 0xbc683311714a69aduL)

public val PARTITION_LDM_METADATA_GUID: GUID = GUID.from_u128(0x5808c8aa7e8f42e0uL, 0x85d2e1e90434cfb3uL)

public val PARTITION_LEGACY_BL_GUID: GUID = GUID.from_u128(0x424ca0e27cb24fb9uL, 0x8143c52a99398bc6uL)

public val PARTITION_LEGACY_BL_GUID_BACKUP: GUID = GUID.from_u128(0x424c3e6cd79f49cbuL, 0x935d36d71467a288uL)

public val PARTITION_MAIN_OS_GUID: GUID = GUID.from_u128(0x57434f538f45405euL, 0x8a23186d8a4330d3uL)

public val PARTITION_MSFT_RECOVERY_GUID: GUID = GUID.from_u128(0xde94bba406d14d40uL, 0xa16abfd50179d6acuL)

public val PARTITION_MSFT_RESERVED_GUID: GUID = GUID.from_u128(0xe3c9e3160b5c4db8uL, 0x817df92df00215aeuL)

public val PARTITION_MSFT_SNAPSHOT_GUID: GUID = GUID.from_u128(0xcaddebf144004de8uL, 0xb10312117dcf3ccfuL)

public val PARTITION_OS_DATA_GUID: GUID = GUID.from_u128(0x57434f5323f244d5uL, 0xa83067bbdaa609f9uL)

public val PARTITION_PATCH_GUID: GUID = GUID.from_u128(0x8967a68696aa6aa8uL, 0x9589a84256541090uL)

public val PARTITION_PRE_INSTALLED_GUID: GUID = GUID.from_u128(0x57434f537fe04196uL, 0x9b42427b51643484uL)

public val PARTITION_SBL_CACHE_HDD_GUID: GUID = GUID.from_u128(0x3aaa829ebfc4e7euL, 0xaac9c4d76c63b24buL)

public val PARTITION_SBL_CACHE_SSD_GUID: GUID = GUID.from_u128(0xeeff8352dd2a44dbuL, 0xae83bee1cf7481dcuL)

public val PARTITION_SBL_CACHE_SSD_RESERVED_GUID: GUID = GUID.from_u128(0xdcc0c7c155ad4f17uL, 0x9d434bc776e0117euL)

public val PARTITION_SERVICING_FILES_GUID: GUID = GUID.from_u128(0x57434f53432e4014uL, 0xae4c8deaa9c0006auL)

public val PARTITION_SERVICING_METADATA_GUID: GUID = GUID.from_u128(0x57434f53c6914a05uL, 0xbb4e703dafd229ceuL)

public val PARTITION_SERVICING_RESERVE_GUID: GUID = GUID.from_u128(0x57434f534b81460buL, 0xa319ffb6fe136d14uL)

public val PARTITION_SERVICING_STAGING_ROOT_GUID: GUID = GUID.from_u128(0x57434f53e84d4e84uL, 0xaaf3ecbbbd04b9dfuL)

public val PARTITION_SPACES_DATA_GUID: GUID = GUID.from_u128(0xe7addcb4dc344539uL, 0x9a76ebbd07be6f7euL)

public val PARTITION_SPACES_GUID: GUID = GUID.from_u128(0xe75caf8ff6804ceeuL, 0xafa3b001e56efc2duL)

public val PARTITION_SYSTEM_GUID: GUID = GUID.from_u128(0xc12a7328f81f11d2uL, 0xba4b00a0c93ec93buL)

public val PARTITION_WINDOWS_SYSTEM_GUID: GUID = GUID.from_u128(0x57434f53e3e34631uL, 0xa5c526d2243873aauL)

public val PERM_FILE_CREATE: FILE_INFO_FLAGS_PERMISSIONS = 4u

public val PERM_FILE_READ: FILE_INFO_FLAGS_PERMISSIONS = 1u

public val PERM_FILE_WRITE: FILE_INFO_FLAGS_PERMISSIONS = 2u

public val PIPE_ACCESS_DUPLEX: FILE_FLAGS_AND_ATTRIBUTES = 3u

public val PIPE_ACCESS_INBOUND: FILE_FLAGS_AND_ATTRIBUTES = 1u

public val PIPE_ACCESS_OUTBOUND: FILE_FLAGS_AND_ATTRIBUTES = 2u

public val PROGRESS_CANCEL: COPYPROGRESSROUTINE_PROGRESS = 1u

public val PROGRESS_CONTINUE: COPYPROGRESSROUTINE_PROGRESS = 0u

public val PROGRESS_QUIET: COPYPROGRESSROUTINE_PROGRESS = 3u

public val PROGRESS_STOP: COPYPROGRESSROUTINE_PROGRESS = 2u

public val QUIC: SERVER_CERTIFICATE_TYPE = 0

public val READ_CONTROL: FILE_ACCESS_RIGHTS = 131072u

public val REPLACEFILE_IGNORE_ACL_ERRORS: REPLACE_FILE_FLAGS = 4u

public val REPLACEFILE_IGNORE_MERGE_ERRORS: REPLACE_FILE_FLAGS = 2u

public val REPLACEFILE_WRITE_THROUGH: REPLACE_FILE_FLAGS = 1u

public val RESOURCE_MANAGER_COMMUNICATION: UInt = 2u

public val RESOURCE_MANAGER_MAXIMUM_OPTION: UInt = 3u

public val RESOURCE_MANAGER_OBJECT_PATH: PCWSTR = w("\\ResourceManager\\")

public val RESOURCE_MANAGER_VOLATILE: UInt = 1u

public val ReadDirectoryNotifyExtendedInformation: READ_DIRECTORY_NOTIFY_INFORMATION_CLASS = 2

public val ReadDirectoryNotifyFullInformation: READ_DIRECTORY_NOTIFY_INFORMATION_CLASS = 3

public val ReadDirectoryNotifyInformation: READ_DIRECTORY_NOTIFY_INFORMATION_CLASS = 1

public val ReadDirectoryNotifyMaximumInformation: READ_DIRECTORY_NOTIFY_INFORMATION_CLASS = 4

public val SECURITY_ANONYMOUS: FILE_FLAGS_AND_ATTRIBUTES = 0u

public val SECURITY_CONTEXT_TRACKING: FILE_FLAGS_AND_ATTRIBUTES = 262144u

public val SECURITY_DELEGATION: FILE_FLAGS_AND_ATTRIBUTES = 196608u

public val SECURITY_EFFECTIVE_ONLY: FILE_FLAGS_AND_ATTRIBUTES = 524288u

public val SECURITY_IDENTIFICATION: FILE_FLAGS_AND_ATTRIBUTES = 65536u

public val SECURITY_IMPERSONATION: FILE_FLAGS_AND_ATTRIBUTES = 131072u

public val SECURITY_SQOS_PRESENT: FILE_FLAGS_AND_ATTRIBUTES = 1048576u

public val SECURITY_VALID_SQOS_FLAGS: FILE_FLAGS_AND_ATTRIBUTES = 2031616u

public val SESI1_NUM_ELEMENTS: UInt = 8u

public val SESI2_NUM_ELEMENTS: UInt = 9u

public val SESS_GUEST: SESSION_INFO_USER_FLAGS = 1u

public val SESS_NOENCRYPTION: SESSION_INFO_USER_FLAGS = 2u

public val SET_TAPE_DRIVE_INFORMATION: TAPE_INFORMATION_TYPE = 1u

public val SET_TAPE_MEDIA_INFORMATION: TAPE_INFORMATION_TYPE = 0u

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

public val SPECIFIC_RIGHTS_ALL: FILE_ACCESS_RIGHTS = 65535u

public val STANDARD_RIGHTS_ALL: FILE_ACCESS_RIGHTS = 2031616u

public val STANDARD_RIGHTS_EXECUTE: FILE_ACCESS_RIGHTS = 131072u

public val STANDARD_RIGHTS_READ: FILE_ACCESS_RIGHTS = 131072u

public val STANDARD_RIGHTS_REQUIRED: FILE_ACCESS_RIGHTS = 983040u

public val STANDARD_RIGHTS_WRITE: FILE_ACCESS_RIGHTS = 131072u

public val STATSOPT_CLR: UInt = 1u

public val STYPE_DEVICE: SHARE_TYPE = 2u

public val STYPE_DISKTREE: SHARE_TYPE = 0u

public val STYPE_IPC: SHARE_TYPE = 3u

public val STYPE_MASK: SHARE_TYPE = 255u

public val STYPE_PRINTQ: SHARE_TYPE = 1u

public val STYPE_RESERVED1: UInt = 16777216u

public val STYPE_RESERVED2: UInt = 33554432u

public val STYPE_RESERVED3: UInt = 67108864u

public val STYPE_RESERVED4: UInt = 134217728u

public val STYPE_RESERVED5: UInt = 1048576u

public val STYPE_RESERVED_ALL: UInt = 1073741568u

public val STYPE_SPECIAL: SHARE_TYPE = 2147483648u

public val STYPE_TEMPORARY: SHARE_TYPE = 1073741824u

public val SYMBOLIC_LINK_FLAG_ALLOW_UNPRIVILEGED_CREATE: SYMBOLIC_LINK_FLAGS = 2u

public val SYMBOLIC_LINK_FLAG_DIRECTORY: SYMBOLIC_LINK_FLAGS = 1u

public val SYNCHRONIZE: FILE_ACCESS_RIGHTS = 1048576u

public val TAPE_ABSOLUTE_BLOCK: TAPE_POSITION_METHOD = 1u

public val TAPE_ABSOLUTE_POSITION: TAPE_POSITION_TYPE = 0u

public val TAPE_ERASE_LONG: ERASE_TAPE_TYPE = 1u

public val TAPE_ERASE_SHORT: ERASE_TAPE_TYPE = 0u

public val TAPE_FILEMARKS: TAPEMARK_TYPE = 1u

public val TAPE_FIXED_PARTITIONS: CREATE_TAPE_PARTITION_METHOD = 0u

public val TAPE_FORMAT: PREPARE_TAPE_OPERATION = 5u

public val TAPE_INITIATOR_PARTITIONS: CREATE_TAPE_PARTITION_METHOD = 2u

public val TAPE_LOAD: PREPARE_TAPE_OPERATION = 0u

public val TAPE_LOCK: PREPARE_TAPE_OPERATION = 3u

public val TAPE_LOGICAL_BLOCK: TAPE_POSITION_METHOD = 2u

public val TAPE_LOGICAL_POSITION: TAPE_POSITION_TYPE = 1u

public val TAPE_LONG_FILEMARKS: TAPEMARK_TYPE = 3u

public val TAPE_REWIND: TAPE_POSITION_METHOD = 0u

public val TAPE_SELECT_PARTITIONS: CREATE_TAPE_PARTITION_METHOD = 1u

public val TAPE_SETMARKS: TAPEMARK_TYPE = 0u

public val TAPE_SHORT_FILEMARKS: TAPEMARK_TYPE = 2u

public val TAPE_SPACE_END_OF_DATA: TAPE_POSITION_METHOD = 4u

public val TAPE_SPACE_FILEMARKS: TAPE_POSITION_METHOD = 6u

public val TAPE_SPACE_RELATIVE_BLOCKS: TAPE_POSITION_METHOD = 5u

public val TAPE_SPACE_SEQUENTIAL_FMKS: TAPE_POSITION_METHOD = 7u

public val TAPE_SPACE_SEQUENTIAL_SMKS: TAPE_POSITION_METHOD = 9u

public val TAPE_SPACE_SETMARKS: TAPE_POSITION_METHOD = 8u

public val TAPE_TENSION: PREPARE_TAPE_OPERATION = 2u

public val TAPE_UNLOAD: PREPARE_TAPE_OPERATION = 1u

public val TAPE_UNLOCK: PREPARE_TAPE_OPERATION = 4u

public val TRANSACTIONMANAGER_OBJECT_PATH: PCWSTR = w("\\TransactionManager\\")

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

public val TRANSACTION_OBJECT_PATH: PCWSTR = w("\\Transaction\\")

public val TRUNCATE_EXISTING: FILE_CREATION_DISPOSITION = 5u

public val TXFS_MINIVERSION_COMMITTED_VIEW: TXFS_MINIVERSION = 0u

public val TXFS_MINIVERSION_DEFAULT_VIEW: TXFS_MINIVERSION = 65534u

public val TXFS_MINIVERSION_DIRTY_VIEW: TXFS_MINIVERSION = 65535u

public val TXF_LOG_RECORD_GENERIC_TYPE_ABORT: UInt = 2u

public val TXF_LOG_RECORD_GENERIC_TYPE_COMMIT: UInt = 1u

public val TXF_LOG_RECORD_GENERIC_TYPE_DATA: UInt = 8u

public val TXF_LOG_RECORD_GENERIC_TYPE_PREPARE: UInt = 4u

public val TXF_LOG_RECORD_TYPE_AFFECTED_FILE: TXF_LOG_RECORD_TYPE = 4u

public val TXF_LOG_RECORD_TYPE_TRUNCATE: TXF_LOG_RECORD_TYPE = 2u

public val TXF_LOG_RECORD_TYPE_WRITE: TXF_LOG_RECORD_TYPE = 1u

public val TransactionOutcomeAborted: TRANSACTION_OUTCOME = 3

public val TransactionOutcomeCommitted: TRANSACTION_OUTCOME = 2

public val TransactionOutcomeUndetermined: TRANSACTION_OUTCOME = 1

public val VFFF_ISSHAREDFILE: VER_FIND_FILE_FLAGS = 1u

public val VFF_BUFFTOOSMALL: VER_FIND_FILE_STATUS = 4u

public val VFF_CURNEDEST: VER_FIND_FILE_STATUS = 1u

public val VFF_FILEINUSE: VER_FIND_FILE_STATUS = 2u

public val VFT2_DRV_COMM: VS_FIXEDFILEINFO_FILE_SUBTYPE = 10

public val VFT2_DRV_DISPLAY: VS_FIXEDFILEINFO_FILE_SUBTYPE = 4

public val VFT2_DRV_INPUTMETHOD: VS_FIXEDFILEINFO_FILE_SUBTYPE = 11

public val VFT2_DRV_INSTALLABLE: VS_FIXEDFILEINFO_FILE_SUBTYPE = 8

public val VFT2_DRV_KEYBOARD: VS_FIXEDFILEINFO_FILE_SUBTYPE = 2

public val VFT2_DRV_LANGUAGE: VS_FIXEDFILEINFO_FILE_SUBTYPE = 3

public val VFT2_DRV_MOUSE: VS_FIXEDFILEINFO_FILE_SUBTYPE = 5

public val VFT2_DRV_NETWORK: VS_FIXEDFILEINFO_FILE_SUBTYPE = 6

public val VFT2_DRV_PRINTER: VS_FIXEDFILEINFO_FILE_SUBTYPE = 1

public val VFT2_DRV_SOUND: VS_FIXEDFILEINFO_FILE_SUBTYPE = 9

public val VFT2_DRV_SYSTEM: VS_FIXEDFILEINFO_FILE_SUBTYPE = 7

public val VFT2_DRV_VERSIONED_PRINTER: VS_FIXEDFILEINFO_FILE_SUBTYPE = 12

public val VFT2_FONT_RASTER: VS_FIXEDFILEINFO_FILE_SUBTYPE = 1

public val VFT2_FONT_TRUETYPE: VS_FIXEDFILEINFO_FILE_SUBTYPE = 3

public val VFT2_FONT_VECTOR: VS_FIXEDFILEINFO_FILE_SUBTYPE = 2

public val VFT2_UNKNOWN: VS_FIXEDFILEINFO_FILE_SUBTYPE = 0

public val VFT_APP: VS_FIXEDFILEINFO_FILE_TYPE = 1

public val VFT_DLL: VS_FIXEDFILEINFO_FILE_TYPE = 2

public val VFT_DRV: VS_FIXEDFILEINFO_FILE_TYPE = 3

public val VFT_FONT: VS_FIXEDFILEINFO_FILE_TYPE = 4

public val VFT_STATIC_LIB: VS_FIXEDFILEINFO_FILE_TYPE = 7

public val VFT_UNKNOWN: VS_FIXEDFILEINFO_FILE_TYPE = 0

public val VFT_VXD: VS_FIXEDFILEINFO_FILE_TYPE = 5

public val VIFF_DONTDELETEOLD: VER_INSTALL_FILE_FLAGS = 2u

public val VIFF_FORCEINSTALL: VER_INSTALL_FILE_FLAGS = 1u

public val VIF_ACCESSVIOLATION: VER_INSTALL_FILE_STATUS = 512u

public val VIF_BUFFTOOSMALL: VER_INSTALL_FILE_STATUS = 262144u

public val VIF_CANNOTCREATE: VER_INSTALL_FILE_STATUS = 2048u

public val VIF_CANNOTDELETE: VER_INSTALL_FILE_STATUS = 4096u

public val VIF_CANNOTDELETECUR: VER_INSTALL_FILE_STATUS = 16384u

public val VIF_CANNOTLOADCABINET: VER_INSTALL_FILE_STATUS = 1048576u

public val VIF_CANNOTLOADLZ32: VER_INSTALL_FILE_STATUS = 524288u

public val VIF_CANNOTREADDST: VER_INSTALL_FILE_STATUS = 131072u

public val VIF_CANNOTREADSRC: VER_INSTALL_FILE_STATUS = 65536u

public val VIF_CANNOTRENAME: VER_INSTALL_FILE_STATUS = 8192u

public val VIF_DIFFCODEPG: VER_INSTALL_FILE_STATUS = 16u

public val VIF_DIFFLANG: VER_INSTALL_FILE_STATUS = 8u

public val VIF_DIFFTYPE: VER_INSTALL_FILE_STATUS = 32u

public val VIF_FILEINUSE: VER_INSTALL_FILE_STATUS = 128u

public val VIF_MISMATCH: VER_INSTALL_FILE_STATUS = 2u

public val VIF_OUTOFMEMORY: VER_INSTALL_FILE_STATUS = 32768u

public val VIF_OUTOFSPACE: VER_INSTALL_FILE_STATUS = 256u

public val VIF_SHARINGVIOLATION: VER_INSTALL_FILE_STATUS = 1024u

public val VIF_SRCOLD: VER_INSTALL_FILE_STATUS = 4u

public val VIF_TEMPFILE: VER_INSTALL_FILE_STATUS = 1u

public val VIF_WRITEPROT: VER_INSTALL_FILE_STATUS = 64u

public val VOLUME_NAME_DOS: GETFINALPATHNAMEBYHANDLE_FLAGS = 0u

public val VOLUME_NAME_GUID: GETFINALPATHNAMEBYHANDLE_FLAGS = 1u

public val VOLUME_NAME_NONE: GETFINALPATHNAMEBYHANDLE_FLAGS = 4u

public val VOLUME_NAME_NT: GETFINALPATHNAMEBYHANDLE_FLAGS = 2u

public val VOS_DOS: VS_FIXEDFILEINFO_FILE_OS = 65536u

public val VOS_DOS_WINDOWS16: VS_FIXEDFILEINFO_FILE_OS = 65537u

public val VOS_DOS_WINDOWS32: VS_FIXEDFILEINFO_FILE_OS = 65540u

public val VOS_NT: VS_FIXEDFILEINFO_FILE_OS = 262144u

public val VOS_NT_WINDOWS32: VS_FIXEDFILEINFO_FILE_OS = 262148u

public val VOS_OS216: VS_FIXEDFILEINFO_FILE_OS = 131072u

public val VOS_OS216_PM16: VS_FIXEDFILEINFO_FILE_OS = 131074u

public val VOS_OS232: VS_FIXEDFILEINFO_FILE_OS = 196608u

public val VOS_OS232_PM32: VS_FIXEDFILEINFO_FILE_OS = 196611u

public val VOS_UNKNOWN: VS_FIXEDFILEINFO_FILE_OS = 0u

public val VOS_WINCE: VS_FIXEDFILEINFO_FILE_OS = 327680u

public val VOS__BASE: VS_FIXEDFILEINFO_FILE_OS = 0u

public val VOS__PM16: VS_FIXEDFILEINFO_FILE_OS = 2u

public val VOS__PM32: VS_FIXEDFILEINFO_FILE_OS = 3u

public val VOS__WINDOWS16: VS_FIXEDFILEINFO_FILE_OS = 1u

public val VOS__WINDOWS32: VS_FIXEDFILEINFO_FILE_OS = 4u

public val VS_FFI_FILEFLAGSMASK: Int = 63

public val VS_FFI_SIGNATURE: Int = -17890115

public val VS_FFI_STRUCVERSION: Int = 65536

public val VS_FF_DEBUG: VS_FIXEDFILEINFO_FILE_FLAGS = 1u

public val VS_FF_INFOINFERRED: VS_FIXEDFILEINFO_FILE_FLAGS = 16u

public val VS_FF_PATCHED: VS_FIXEDFILEINFO_FILE_FLAGS = 4u

public val VS_FF_PRERELEASE: VS_FIXEDFILEINFO_FILE_FLAGS = 2u

public val VS_FF_PRIVATEBUILD: VS_FIXEDFILEINFO_FILE_FLAGS = 8u

public val VS_FF_SPECIALBUILD: VS_FIXEDFILEINFO_FILE_FLAGS = 32u

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

public val WRITE_DAC: FILE_ACCESS_RIGHTS = 262144u

public val WRITE_OWNER: FILE_ACCESS_RIGHTS = 524288u

public val _FT_TYPES_DEFINITION_: UInt = 1u
