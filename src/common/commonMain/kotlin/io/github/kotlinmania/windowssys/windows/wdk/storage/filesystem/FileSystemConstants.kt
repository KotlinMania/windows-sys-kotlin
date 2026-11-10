package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ATOMIC_CREATE_ECP_IN_FLAG_BEST_EFFORT: UInt = 256u

public val ATOMIC_CREATE_ECP_IN_FLAG_EOF_SPECIFIED: UInt = 4u

public val ATOMIC_CREATE_ECP_IN_FLAG_FILE_ATTRIBUTES_SPECIFIED: UInt = 32u

public val ATOMIC_CREATE_ECP_IN_FLAG_GEN_FLAGS_SPECIFIED: UInt = 32768u

public val ATOMIC_CREATE_ECP_IN_FLAG_MARK_USN_SOURCE_INFO: UInt = 2048u

public val ATOMIC_CREATE_ECP_IN_FLAG_OPERATION_MASK: UInt = 255u

public val ATOMIC_CREATE_ECP_IN_FLAG_OP_FLAGS_SPECIFIED: UInt = 128u

public val ATOMIC_CREATE_ECP_IN_FLAG_REPARSE_POINT_SPECIFIED: UInt = 2u

public val ATOMIC_CREATE_ECP_IN_FLAG_SPARSE_SPECIFIED: UInt = 1u

public val ATOMIC_CREATE_ECP_IN_FLAG_SUPPRESS_DIR_CHANGE_NOTIFY: UInt = 1024u

public val ATOMIC_CREATE_ECP_IN_FLAG_SUPPRESS_FILE_ATTRIBUTE_INHERITANCE: UInt = 64u

public val ATOMIC_CREATE_ECP_IN_FLAG_SUPPRESS_PARENT_TIMESTAMPS_UPDATE: UInt = 512u

public val ATOMIC_CREATE_ECP_IN_FLAG_TIMESTAMPS_SPECIFIED: UInt = 16u

public val ATOMIC_CREATE_ECP_IN_FLAG_VDL_SPECIFIED: UInt = 8u

public val ATOMIC_CREATE_ECP_IN_FLAG_WRITE_USN_CLOSE_RECORD: UInt = 4096u

public val ATOMIC_CREATE_ECP_IN_OP_FLAG_CASE_SENSITIVE_FLAGS_SPECIFIED: UInt = 1u

public val ATOMIC_CREATE_ECP_OUT_FLAG_EOF_SET: UInt = 4u

public val ATOMIC_CREATE_ECP_OUT_FLAG_FILE_ATTRIBUTES_RETURNED: UInt = 512u

public val ATOMIC_CREATE_ECP_OUT_FLAG_FILE_ATTRIBUTES_SET: UInt = 32u

public val ATOMIC_CREATE_ECP_OUT_FLAG_FILE_ATTRIBUTE_INHERITANCE_SUPPRESSED: UInt = 64u

public val ATOMIC_CREATE_ECP_OUT_FLAG_OPERATION_MASK: UInt = 255u

public val ATOMIC_CREATE_ECP_OUT_FLAG_OP_FLAGS_HONORED: UInt = 128u

public val ATOMIC_CREATE_ECP_OUT_FLAG_REPARSE_POINT_SET: UInt = 2u

public val ATOMIC_CREATE_ECP_OUT_FLAG_SPARSE_SET: UInt = 1u

public val ATOMIC_CREATE_ECP_OUT_FLAG_TIMESTAMPS_RETURNED: UInt = 256u

public val ATOMIC_CREATE_ECP_OUT_FLAG_TIMESTAMPS_SET: UInt = 16u

public val ATOMIC_CREATE_ECP_OUT_FLAG_USN_CLOSE_RECORD_WRITTEN: UInt = 2048u

public val ATOMIC_CREATE_ECP_OUT_FLAG_USN_RETURNED: UInt = 4096u

public val ATOMIC_CREATE_ECP_OUT_FLAG_USN_SOURCE_INFO_MARKED: UInt = 1024u

public val ATOMIC_CREATE_ECP_OUT_FLAG_VDL_SET: UInt = 8u

public val ATOMIC_CREATE_ECP_OUT_OP_FLAG_CASE_SENSITIVE_FLAGS_SET: UInt = 1u

public val AUDIT_ACCESS_CHECK: SeAuditOperation = 2

public val AUDIT_CLOSE_NON_OBJECT: SeAuditOperation = 9

public val AUDIT_CLOSE_OBJECT: SeAuditOperation = 5

public val AUDIT_DELETE_OBJECT: SeAuditOperation = 6

public val AUDIT_HANDLE_CREATION: SeAuditOperation = 12

public val AUDIT_OBJECT_REFERENCE: SeAuditOperation = 11

public val AUDIT_OPEN_NON_OBJECT: SeAuditOperation = 10

public val AUDIT_OPEN_OBJECT: SeAuditOperation = 3

public val AUDIT_OPEN_OBJECT_FOR_DELETE: SeAuditOperation = 7

public val AUDIT_OPEN_OBJECT_FOR_DELETE_WITH_TRANSACTION: SeAuditOperation = 8

public val AUDIT_OPEN_OBJECT_WITH_TRANSACTION: SeAuditOperation = 4

public val AUDIT_PRIVILEGE_OBJECT: SeAuditOperation = 0

public val AUDIT_PRIVILEGE_SERVICE: SeAuditOperation = 1

public val CACHE_MANAGER_CALLBACKS_EX_V1: UInt = 1u

public val CACHE_USE_DIRECT_ACCESS_MAPPING: UInt = 1u

public val CACHE_VALID_FLAGS: UInt = 1u

public val CC_ACQUIRE_DONT_WAIT: UInt = 1u

public val CC_ACQUIRE_SUPPORTS_ASYNC_LAZYWRITE: UInt = 1u

public val CC_AGGRESSIVE_UNMAP_BEHIND: UInt = 1u

public val CC_DISABLE_DIRTY_PAGE_TRACKING: UInt = 8u

public val CC_DISABLE_READ_AHEAD: UInt = 2u

public val CC_DISABLE_UNMAP_BEHIND: UInt = 32u

public val CC_DISABLE_WRITE_BEHIND: UInt = 4u

public val CC_ENABLE_CPU_CACHE: UInt = 268435456u

public val CC_ENABLE_DISK_IO_ACCOUNTING: UInt = 16u

public val CC_FLUSH_AND_PURGE_GATHER_DIRTY_BITS: UInt = 2u

public val CC_FLUSH_AND_PURGE_NO_PURGE: UInt = 1u

public val CC_FLUSH_AND_PURGE_WRITEABLE_VIEWS_NOTSEEN: UInt = 4u

public val COMPRESSION_ENGINE_MASK: UInt = 65280u

public val COMPRESSION_ENGINE_MAX: UInt = 512u

public val COMPRESSION_FORMAT_MASK: UInt = 255u

public val COMPRESSION_FORMAT_MAX: UInt = 5u

public val CREATE_REDIRECTION_FLAGS_SERVICED_FROM_LAYER: UInt = 1u

public val CREATE_REDIRECTION_FLAGS_SERVICED_FROM_REGISTERED_LAYER: UInt = 4u

public val CREATE_REDIRECTION_FLAGS_SERVICED_FROM_REMOTE_LAYER: UInt = 8u

public val CREATE_REDIRECTION_FLAGS_SERVICED_FROM_SCRATCH: UInt = 2u

public val CREATE_REDIRECTION_FLAGS_SERVICED_FROM_USER_MODE: UInt = 16u

public val CSV_SET_HANDLE_PROPERTIES_ECP_CONTEXT_FLAGS_VALID_ONLY_IF_CSV_COORDINATOR: UInt = 1u

public val CHANGE_DATA_CONTROL_AREA: FsrtlChangeBackingType = 0

public val CHANGE_IMAGE_CONTROL_AREA: FsrtlChangeBackingType = 1

public val CHANGE_SHARED_CACHE_MAP: FsrtlChangeBackingType = 2

public val CSV_CSV_FS_INTERNAL_FILE_OBJECT: CsvDownLevelFileType = 1

public val CSV_DOWN_LEVEL_FILE_OBJECT: CsvDownLevelFileType = 0

public val DD_MUP_DEVICE_NAME: Pcwstr = w("\\Device\\Mup")

public val DEVICE_RESET_KEEP_STACK: UInt = 4u

public val DEVICE_RESET_RESERVED_0: UInt = 1u

public val DEVICE_RESET_RESERVED_1: UInt = 2u

public val DO_BOOT_CRITICAL: UInt = 536870912u

public val DO_BUFFERED_IO: UInt = 4u

public val DO_BUS_ENUMERATED_DEVICE: UInt = 4096u

public val DO_DAX_VOLUME: UInt = 268435456u

public val DO_DEVICE_HAS_NAME: UInt = 64u

public val DO_DEVICE_INITIALIZING: UInt = 128u

public val DO_DEVICE_IRP_REQUIRES_EXTENSION: UInt = 134217728u

public val DO_DEVICE_TO_BE_RESET: UInt = 67108864u

public val DO_DIRECT_IO: UInt = 16u

public val DO_DISALLOW_EXECUTE: UInt = 8388608u

public val DO_EXCLUSIVE: UInt = 8u

public val DO_FORCE_NEITHER_IO: UInt = 524288u

public val DO_LONG_TERM_REQUESTS: UInt = 512u

public val DO_LOW_PRIORITY_FILESYSTEM: UInt = 65536u

public val DO_MAP_IO_BUFFER: UInt = 32u

public val DO_NEVER_LAST_DEVICE: UInt = 1024u

public val DO_NOT_PURGE_DIRTY_PAGES: UInt = 4u

public val DO_NOT_RETRY_PURGE: UInt = 2u

public val DO_POWER_INRUSH: UInt = 16384u

public val DO_POWER_PAGABLE: UInt = 8192u

public val DO_SHUTDOWN_REGISTERED: UInt = 2048u

public val DO_SUPPORTS_PERSISTENT_ACLS: UInt = 131072u

public val DO_SUPPORTS_TRANSACTIONS: UInt = 262144u

public val DO_SYSTEM_BOOT_PARTITION: UInt = 256u

public val DO_SYSTEM_CRITICAL_PARTITION: UInt = 4194304u

public val DO_SYSTEM_SYSTEM_PARTITION: UInt = 2097152u

public val DO_VERIFY_VOLUME: UInt = 2u

public val DO_VOLUME_DEVICE_OBJECT: UInt = 1048576u

public val DFS_LINK_TRACKING_INFORMATION: LinkTrackingInformationType = 1

public val EA_NAME_NETWORK_OPEN_ECP_INTEGRITY: Pcstr = s("ECP{c584edbf-00df-4d28-00b8-8435baca8911e8}-INTEGRITY")

public val EA_NAME_NETWORK_OPEN_ECP_INTEGRITY_U: Pcwstr = w("ECP{c584edbf-00df-4d28-00b8-8435baca8911e8}-INTEGRITY")

public val EA_NAME_NETWORK_OPEN_ECP_PRIVACY: Pcstr = s("ECP{c584edbf-00df-4d28-00b8-8435baca8911e8}-PRIVACY")

public val EA_NAME_NETWORK_OPEN_ECP_PRIVACY_U: Pcwstr = w("ECP{c584edbf-00df-4d28-00b8-8435baca8911e8}-PRIVACY")

public val ECP_OPEN_PARAMETERS_FLAG_FAIL_ON_CASE_SENSITIVE_DIR: UInt = 16u

public val ECP_OPEN_PARAMETERS_FLAG_IGNORE_DIR_CASE_SENSITIVITY: UInt = 8u

public val ECP_OPEN_PARAMETERS_FLAG_OPEN_FOR_DELETE: UInt = 4u

public val ECP_OPEN_PARAMETERS_FLAG_OPEN_FOR_READ: UInt = 1u

public val ECP_OPEN_PARAMETERS_FLAG_OPEN_FOR_WRITE: UInt = 2u

public val ECP_TYPE_CLFS_CREATE_CONTAINER: Guid = Guid.fromU128(U128(0x8650c9fe0cec8bf6uL, 0xbd1e835956541090uL))

public val ECP_TYPE_IO_STOP_ON_SYMLINK_FILTER_GUID: Guid = Guid.fromU128(U128(0x940e5d5616464d3cuL, 0x87b6577ec36a1466uL))

public val ECP_TYPE_OPEN_REPARSE_GUID: Guid = Guid.fromU128(U128(0x323eb6a8affd4d95uL, 0x8230863bce09d37auL))

public val EVENT_INCREMENT: UInt = 1u

public val EQUAL_TO: FsrtlComparisonResult = 0

public val FILE_ACTION_ADDED_STREAM: UInt = 6u

public val FILE_ACTION_ID_NOT_TUNNELLED: UInt = 10u

public val FILE_ACTION_MODIFIED_STREAM: UInt = 8u

public val FILE_ACTION_REMOVED_BY_DELETE: UInt = 9u

public val FILE_ACTION_REMOVED_STREAM: UInt = 7u

public val FILE_ACTION_TUNNELLED_ID_COLLISION: UInt = 11u

public val FILE_CLEANUP_FILE_DELETED: UInt = 4u

public val FILE_CLEANUP_FILE_REMAINS: UInt = 2u

public val FILE_CLEANUP_LINK_DELETED: UInt = 8u

public val FILE_CLEANUP_POSIX_STYLE_DELETE: UInt = 32u

public val FILE_CLEANUP_STREAM_DELETED: UInt = 16u

public val FILE_CLEANUP_UNKNOWN: UInt = 0u

public val FILE_CLEANUP_WRONG_DEVICE: UInt = 1u

public val FILE_COMPLETE_IF_OPLOCKED: NtcreatefileCreateOptions = 256u

public val FILE_CONTAINS_EXTENDED_CREATE_INFORMATION: NtcreatefileCreateOptions = 268435456u

public val FILE_CREATE: NtcreatefileCreateDisposition = 2u

public val FILE_CREATE_TREE_CONNECTION: NtcreatefileCreateOptions = 128u

public val FILE_DELETE_ON_CLOSE: NtcreatefileCreateOptions = 4096u

public val FILE_DIRECTORY_FILE: NtcreatefileCreateOptions = 1u

public val FILE_DISALLOW_EXCLUSIVE: NtcreatefileCreateOptions = 131072u

public val FILE_DISPOSITION_DELETE: FileDispositionInformationExFlags = 1u

public val FILE_DISPOSITION_DO_NOT_DELETE: FileDispositionInformationExFlags = 0u

public val FILE_DISPOSITION_FORCE_IMAGE_SECTION_CHECK: FileDispositionInformationExFlags = 4u

public val FILE_DISPOSITION_IGNORE_READONLY_ATTRIBUTE: FileDispositionInformationExFlags = 16u

public val FILE_DISPOSITION_ON_CLOSE: FileDispositionInformationExFlags = 8u

public val FILE_DISPOSITION_POSIX_SEMANTICS: FileDispositionInformationExFlags = 2u

public val FILE_EA_TYPE_ASCII: UInt = 65533u

public val FILE_EA_TYPE_ASN1: UInt = 65501u

public val FILE_EA_TYPE_BINARY: UInt = 65534u

public val FILE_EA_TYPE_BITMAP: UInt = 65531u

public val FILE_EA_TYPE_EA: UInt = 65518u

public val FILE_EA_TYPE_FAMILY_IDS: UInt = 65281u

public val FILE_EA_TYPE_ICON: UInt = 65529u

public val FILE_EA_TYPE_METAFILE: UInt = 65530u

public val FILE_EA_TYPE_MVMT: UInt = 65503u

public val FILE_EA_TYPE_MVST: UInt = 65502u

public val FILE_ID_GLOBAL_TX_DIR_INFO_FLAG_VISIBLE_OUTSIDE_TX: UInt = 4u

public val FILE_ID_GLOBAL_TX_DIR_INFO_FLAG_VISIBLE_TO_TX: UInt = 2u

public val FILE_ID_GLOBAL_TX_DIR_INFO_FLAG_WRITELOCKED: UInt = 1u

public val FILE_LINK_FORCE_RESIZE_SOURCE_SR: UInt = 256u

public val FILE_LINK_FORCE_RESIZE_SR: UInt = 384u

public val FILE_LINK_FORCE_RESIZE_TARGET_SR: UInt = 128u

public val FILE_LINK_IGNORE_READONLY_ATTRIBUTE: UInt = 64u

public val FILE_LINK_NO_DECREASE_AVAILABLE_SPACE: UInt = 32u

public val FILE_LINK_NO_INCREASE_AVAILABLE_SPACE: UInt = 16u

public val FILE_LINK_POSIX_SEMANTICS: UInt = 2u

public val FILE_LINK_PRESERVE_AVAILABLE_SPACE: UInt = 48u

public val FILE_LINK_REPLACE_IF_EXISTS: UInt = 1u

public val FILE_LINK_SUPPRESS_STORAGE_RESERVE_INHERITANCE: UInt = 8u

public val FILE_NEED_EA: UInt = 128u

public val FILE_NON_DIRECTORY_FILE: NtcreatefileCreateOptions = 64u

public val FILE_NOTIFY_CHANGE_EA: UInt = 128u

public val FILE_NOTIFY_CHANGE_NAME: UInt = 3u

public val FILE_NOTIFY_CHANGE_STREAM_NAME: UInt = 512u

public val FILE_NOTIFY_CHANGE_STREAM_SIZE: UInt = 1024u

public val FILE_NOTIFY_CHANGE_STREAM_WRITE: UInt = 2048u

public val FILE_NOTIFY_VALID_MASK: UInt = 4095u

public val FILE_NO_COMPRESSION: NtcreatefileCreateOptions = 32768u

public val FILE_NO_EA_KNOWLEDGE: NtcreatefileCreateOptions = 512u

public val FILE_NO_INTERMEDIATE_BUFFERING: NtcreatefileCreateOptions = 8u

public val FILE_OPBATCH_BREAK_UNDERWAY: UInt = 9u

public val FILE_OPEN: NtcreatefileCreateDisposition = 1u

public val FILE_OPEN_BY_FILE_ID: NtcreatefileCreateOptions = 8192u

public val FILE_OPEN_FOR_BACKUP_INTENT: NtcreatefileCreateOptions = 16384u

public val FILE_OPEN_FOR_FREE_SPACE_QUERY: NtcreatefileCreateOptions = 8388608u

public val FILE_OPEN_IF: NtcreatefileCreateDisposition = 3u

public val FILE_OPEN_NO_RECALL: NtcreatefileCreateOptions = 4194304u

public val FILE_OPEN_REPARSE_POINT: NtcreatefileCreateOptions = 2097152u

public val FILE_OPEN_REQUIRING_OPLOCK: NtcreatefileCreateOptions = 65536u

public val FILE_OPLOCK_BROKEN_TO_LEVEL_2: UInt = 7u

public val FILE_OPLOCK_BROKEN_TO_NONE: UInt = 8u

public val FILE_OVERWRITE: NtcreatefileCreateDisposition = 4u

public val FILE_OVERWRITE_IF: NtcreatefileCreateDisposition = 5u

public val FILE_PIPE_ACCEPT_REMOTE_CLIENTS: UInt = 0u

public val FILE_PIPE_BYTE_STREAM_MODE: UInt = 0u

public val FILE_PIPE_BYTE_STREAM_TYPE: UInt = 0u

public val FILE_PIPE_CLIENT_END: UInt = 0u

public val FILE_PIPE_CLOSING_STATE: UInt = 4u

public val FILE_PIPE_COMPLETE_OPERATION: UInt = 1u

public val FILE_PIPE_COMPUTER_NAME_LENGTH: UInt = 15u

public val FILE_PIPE_CONNECTED_STATE: UInt = 3u

public val FILE_PIPE_DISCONNECTED_STATE: UInt = 1u

public val FILE_PIPE_FULL_DUPLEX: UInt = 2u

public val FILE_PIPE_INBOUND: UInt = 0u

public val FILE_PIPE_LISTENING_STATE: UInt = 2u

public val FILE_PIPE_MESSAGE_MODE: UInt = 1u

public val FILE_PIPE_MESSAGE_TYPE: UInt = 1u

public val FILE_PIPE_OUTBOUND: UInt = 1u

public val FILE_PIPE_QUEUE_OPERATION: UInt = 0u

public val FILE_PIPE_READ_DATA: UInt = 0u

public val FILE_PIPE_REJECT_REMOTE_CLIENTS: UInt = 2u

public val FILE_PIPE_SERVER_END: UInt = 1u

public val FILE_PIPE_SYMLINK_FLAG_GLOBAL: UInt = 1u

public val FILE_PIPE_SYMLINK_FLAG_RELATIVE: UInt = 2u

public val FILE_PIPE_TYPE_VALID_MASK: UInt = 3u

public val FILE_PIPE_WRITE_SPACE: UInt = 1u

public val FILE_RANDOM_ACCESS: NtcreatefileCreateOptions = 2048u

public val FILE_RENAME_FORCE_RESIZE_SOURCE_SR: UInt = 256u

public val FILE_RENAME_FORCE_RESIZE_SR: UInt = 384u

public val FILE_RENAME_FORCE_RESIZE_TARGET_SR: UInt = 128u

public val FILE_RENAME_IGNORE_READONLY_ATTRIBUTE: UInt = 64u

public val FILE_RENAME_NO_DECREASE_AVAILABLE_SPACE: UInt = 32u

public val FILE_RENAME_NO_INCREASE_AVAILABLE_SPACE: UInt = 16u

public val FILE_RENAME_POSIX_SEMANTICS: UInt = 2u

public val FILE_RENAME_PRESERVE_AVAILABLE_SPACE: UInt = 48u

public val FILE_RENAME_REPLACE_IF_EXISTS: UInt = 1u

public val FILE_RENAME_SUPPRESS_PIN_STATE_INHERITANCE: UInt = 4u

public val FILE_RENAME_SUPPRESS_STORAGE_RESERVE_INHERITANCE: UInt = 8u

public val FILE_RESERVE_OPFILTER: NtcreatefileCreateOptions = 1048576u

public val FILE_SEQUENTIAL_ONLY: NtcreatefileCreateOptions = 4u

public val FILE_SESSION_AWARE: NtcreatefileCreateOptions = 262144u

public val FILE_SUPERSEDE: NtcreatefileCreateDisposition = 0u

public val FILE_SYNCHRONOUS_IO_ALERT: NtcreatefileCreateOptions = 16u

public val FILE_SYNCHRONOUS_IO_NONALERT: NtcreatefileCreateOptions = 32u

public val FILE_VC_CONTENT_INDEX_DISABLED: UInt = 8u

public val FILE_VC_LOG_QUOTA_LIMIT: UInt = 32u

public val FILE_VC_LOG_QUOTA_THRESHOLD: UInt = 16u

public val FILE_VC_LOG_VOLUME_LIMIT: UInt = 128u

public val FILE_VC_LOG_VOLUME_THRESHOLD: UInt = 64u

public val FILE_VC_QUOTAS_INCOMPLETE: UInt = 256u

public val FILE_VC_QUOTAS_REBUILDING: UInt = 512u

public val FILE_VC_QUOTA_ENFORCE: UInt = 2u

public val FILE_VC_QUOTA_MASK: UInt = 3u

public val FILE_VC_QUOTA_NONE: UInt = 0u

public val FILE_VC_QUOTA_TRACK: UInt = 1u

public val FILE_VC_VALID_MASK: UInt = 1023u

public val FILE_WRITE_THROUGH: NtcreatefileCreateOptions = 2u

public val FLAGS_DELAY_REASONS_BITMAP_SCANNED: UInt = 2u

public val FLAGS_DELAY_REASONS_LOG_FILE_FULL: UInt = 1u

public val FLAGS_END_OF_FILE_INFO_EX_EXTEND_PAGING: UInt = 1u

public val FLAGS_END_OF_FILE_INFO_EX_NO_EXTRA_PAGING_EXTEND: UInt = 2u

public val FLAGS_END_OF_FILE_INFO_EX_TIME_CONSTRAINED: UInt = 4u

public val FSCTL_LMR_GET_LINK_TRACKING_INFORMATION: UInt = 1310952u

public val FSCTL_LMR_SET_LINK_TRACKING_INFORMATION: UInt = 1310956u

public val FSCTL_MAILSLOT_PEEK: UInt = 802819u

public val FSCTL_PIPE_ASSIGN_EVENT: UInt = 1114112u

public val FSCTL_PIPE_CREATE_SYMLINK: UInt = 1114188u

public val FSCTL_PIPE_DELETE_SYMLINK: UInt = 1114192u

public val FSCTL_PIPE_DISABLE_IMPERSONATE: UInt = 1114180u

public val FSCTL_PIPE_DISCONNECT: UInt = 1114116u

public val FSCTL_PIPE_FLUSH: UInt = 1146944u

public val FSCTL_PIPE_GET_CONNECTION_ATTRIBUTE: UInt = 1114160u

public val FSCTL_PIPE_GET_HANDLE_ATTRIBUTE: UInt = 1114168u

public val FSCTL_PIPE_GET_PIPE_ATTRIBUTE: UInt = 1114152u

public val FSCTL_PIPE_IMPERSONATE: UInt = 1114140u

public val FSCTL_PIPE_INTERNAL_READ: UInt = 1138676u

public val FSCTL_PIPE_INTERNAL_READ_OVFLOW: UInt = 1138688u

public val FSCTL_PIPE_INTERNAL_TRANSCEIVE: UInt = 1171455u

public val FSCTL_PIPE_INTERNAL_WRITE: UInt = 1155064u

public val FSCTL_PIPE_LISTEN: UInt = 1114120u

public val FSCTL_PIPE_PEEK: UInt = 1130508u

public val FSCTL_PIPE_QUERY_CLIENT_PROCESS: UInt = 1114148u

public val FSCTL_PIPE_QUERY_CLIENT_PROCESS_V2: UInt = 1114196u

public val FSCTL_PIPE_QUERY_EVENT: UInt = 1114128u

public val FSCTL_PIPE_SET_CLIENT_PROCESS: UInt = 1114144u

public val FSCTL_PIPE_SET_CONNECTION_ATTRIBUTE: UInt = 1114164u

public val FSCTL_PIPE_SET_HANDLE_ATTRIBUTE: UInt = 1114172u

public val FSCTL_PIPE_SET_PIPE_ATTRIBUTE: UInt = 1114156u

public val FSCTL_PIPE_SILO_ARRIVAL: UInt = 1146952u

public val FSCTL_PIPE_TRANSCEIVE: UInt = 1163287u

public val FSCTL_PIPE_WAIT: UInt = 1114136u

public val FSRTL_ADD_TC_CASE_SENSITIVE: UInt = 1u

public val FSRTL_ADD_TC_KEY_BY_SHORT_NAME: UInt = 2u

public val FSRTL_ALLOCATE_ECPLIST_FLAG_CHARGE_QUOTA: UInt = 1u

public val FSRTL_ALLOCATE_ECP_FLAG_CHARGE_QUOTA: UInt = 1u

public val FSRTL_ALLOCATE_ECP_FLAG_NONPAGED_POOL: UInt = 2u

public val FSRTL_AUXILIARY_FLAG_DEALLOCATE: UInt = 1u

public val FSRTL_CC_FLUSH_ERROR_FLAG_NO_HARD_ERROR: UInt = 1u

public val FSRTL_CC_FLUSH_ERROR_FLAG_NO_LOG_ENTRY: UInt = 2u

public val FSRTL_DRIVER_BACKING_FLAG_USE_PAGE_FILE: UInt = 1u

public val FSRTL_ECP_LOOKASIDE_FLAG_NONPAGED_POOL: UInt = 2u

public val FSRTL_FAT_LEGAL: UInt = 1u

public val FSRTL_FCB_HEADER_V0: UInt = 0u

public val FSRTL_FCB_HEADER_V1: UInt = 1u

public val FSRTL_FCB_HEADER_V2: UInt = 2u

public val FSRTL_FCB_HEADER_V3: UInt = 3u

public val FSRTL_FCB_HEADER_V4: UInt = 4u

public val FSRTL_FIND_TC_CASE_SENSITIVE: UInt = 1u

public val FSRTL_FLAG2_BYPASSIO_STREAM_PAUSED: UInt = 32u

public val FSRTL_FLAG2_DO_MODIFIED_WRITE: UInt = 1u

public val FSRTL_FLAG2_IS_PAGING_FILE: UInt = 8u

public val FSRTL_FLAG2_PURGE_WHEN_MAPPED: UInt = 4u

public val FSRTL_FLAG2_SUPPORTS_FILTER_CONTEXTS: UInt = 2u

public val FSRTL_FLAG2_WRITABLE_USER_MAPPED_FILE: UInt = 16u

public val FSRTL_FLAG_ACQUIRE_MAIN_RSRC_EX: UInt = 8u

public val FSRTL_FLAG_ACQUIRE_MAIN_RSRC_SH: UInt = 16u

public val FSRTL_FLAG_ADVANCED_HEADER: UInt = 64u

public val FSRTL_FLAG_EOF_ADVANCE_ACTIVE: UInt = 128u

public val FSRTL_FLAG_FILE_LENGTH_CHANGED: UInt = 2u

public val FSRTL_FLAG_FILE_MODIFIED: UInt = 1u

public val FSRTL_FLAG_LIMIT_MODIFIED_PAGES: UInt = 4u

public val FSRTL_FLAG_USER_MAPPED_FILE: UInt = 32u

public val FSRTL_HPFS_LEGAL: UInt = 2u

public val FSRTL_NTFS_LEGAL: UInt = 4u

public val FSRTL_OLE_LEGAL: UInt = 16u

public val FSRTL_UNC_HARDENING_CAPABILITIES_INTEGRITY: UInt = 2u

public val FSRTL_UNC_HARDENING_CAPABILITIES_MUTUAL_AUTH: UInt = 1u

public val FSRTL_UNC_HARDENING_CAPABILITIES_PRIVACY: UInt = 4u

public val FSRTL_UNC_PROVIDER_FLAGS_CONTAINER_AWARE: UInt = 8u

public val FSRTL_UNC_PROVIDER_FLAGS_CSC_ENABLED: UInt = 2u

public val FSRTL_UNC_PROVIDER_FLAGS_DOMAIN_SVC_AWARE: UInt = 4u

public val FSRTL_UNC_PROVIDER_FLAGS_MAILSLOTS_SUPPORTED: UInt = 1u

public val FSRTL_UNC_REGISTRATION_CURRENT_VERSION: UInt = 513u

public val FSRTL_UNC_REGISTRATION_VERSION_0200: UInt = 512u

public val FSRTL_UNC_REGISTRATION_VERSION_0201: UInt = 513u

public val FSRTL_VIRTDISK_FULLY_ALLOCATED: UInt = 1u

public val FSRTL_VIRTDISK_NO_DRIVE_LETTER: UInt = 2u

public val FSRTL_VOLUME_BACKGROUND_FORMAT: UInt = 14u

public val FSRTL_VOLUME_CHANGE_SIZE: UInt = 13u

public val FSRTL_VOLUME_DISMOUNT: UInt = 1u

public val FSRTL_VOLUME_DISMOUNT_FAILED: UInt = 2u

public val FSRTL_VOLUME_FORCED_CLOSED: UInt = 10u

public val FSRTL_VOLUME_INFO_MAKE_COMPAT: UInt = 11u

public val FSRTL_VOLUME_LOCK: UInt = 3u

public val FSRTL_VOLUME_LOCK_FAILED: UInt = 4u

public val FSRTL_VOLUME_MOUNT: UInt = 6u

public val FSRTL_VOLUME_NEEDS_CHKDSK: UInt = 7u

public val FSRTL_VOLUME_PREPARING_EJECT: UInt = 12u

public val FSRTL_VOLUME_UNLOCK: UInt = 5u

public val FSRTL_VOLUME_WEARING_OUT: UInt = 9u

public val FSRTL_VOLUME_WORM_NEAR_FULL: UInt = 8u

public val FSRTL_WILD_CHARACTER: UInt = 8u

public val FS_FILTER_ACQUIRE_FOR_CC_FLUSH: UShort = 65531u.toUShort()

public val FS_FILTER_ACQUIRE_FOR_MOD_WRITE: UShort = 65533u.toUShort()

public val FS_FILTER_ACQUIRE_FOR_SECTION_SYNCHRONIZATION: UShort = 65535u.toUShort()

public val FS_FILTER_QUERY_OPEN: UShort = 65529u.toUShort()

public val FS_FILTER_RELEASE_FOR_CC_FLUSH: UShort = 65530u.toUShort()

public val FS_FILTER_RELEASE_FOR_MOD_WRITE: UShort = 65532u.toUShort()

public val FS_FILTER_RELEASE_FOR_SECTION_SYNCHRONIZATION: UShort = 65534u.toUShort()

public val FS_FILTER_SECTION_SYNC_IMAGE_EXTENTS_ARE_NOT_RVA: UInt = 8u

public val FS_FILTER_SECTION_SYNC_IN_FLAG_DONT_UPDATE_LAST_ACCESS: UInt = 1u

public val FS_FILTER_SECTION_SYNC_IN_FLAG_DONT_UPDATE_LAST_WRITE: UInt = 2u

public val FS_FILTER_SECTION_SYNC_SUPPORTS_ASYNC_PARALLEL_IO: UInt = 1u

public val FS_FILTER_SECTION_SYNC_SUPPORTS_DIRECT_MAP_DATA: UInt = 2u

public val FS_FILTER_SECTION_SYNC_SUPPORTS_DIRECT_MAP_IMAGE: UInt = 4u

public val FAST_IO_IS_NOT_POSSIBLE: FastIoPossible = 0

public val FAST_IO_IS_POSSIBLE: FastIoPossible = 1

public val FAST_IO_IS_QUESTIONABLE: FastIoPossible = 2

public val FILE_ACCESS_INFORMATION: FileInformationClass = 8

public val FILE_ALIGNMENT_INFORMATION: FileInformationClass = 17

public val FILE_ALL_INFORMATION: FileInformationClass = 18

public val FILE_ALLOCATION_INFORMATION: FileInformationClass = 19

public val FILE_ALTERNATE_NAME_INFORMATION: FileInformationClass = 21

public val FILE_ATTRIBUTE_TAG_INFORMATION: FileInformationClass = 35

public val FILE_BASIC_INFORMATION: FileInformationClass = 4

public val FILE_BOTH_DIRECTORY_INFORMATION: FileInformationClass = 3

public val FILE_CASE_SENSITIVE_INFORMATION: FileInformationClass = 71

public val FILE_CASE_SENSITIVE_INFORMATION_FORCE_ACCESS_CHECK: FileInformationClass = 75

public val FILE_COMPLETION_INFORMATION: FileInformationClass = 30

public val FILE_COMPRESSION_INFORMATION: FileInformationClass = 28

public val FILE_DESIRED_STORAGE_CLASS_INFORMATION: FileInformationClass = 67

public val FILE_DIRECTORY_INFORMATION: FileInformationClass = 1

public val FILE_DISPOSITION_INFORMATION: FileInformationClass = 13

public val FILE_DISPOSITION_INFORMATION_EX: FileInformationClass = 64

public val FILE_EA_INFORMATION: FileInformationClass = 7

public val FILE_END_OF_FILE_INFORMATION: FileInformationClass = 20

public val FILE_FS_ATTRIBUTE_INFORMATION: FsInformationClass = 5

public val FILE_FS_CONTROL_INFORMATION: FsInformationClass = 6

public val FILE_FS_DATA_COPY_INFORMATION: FsInformationClass = 12

public val FILE_FS_DEVICE_INFORMATION: FsInformationClass = 4

public val FILE_FS_DRIVER_PATH_INFORMATION: FsInformationClass = 9

public val FILE_FS_FULL_SIZE_INFORMATION: FsInformationClass = 7

public val FILE_FS_FULL_SIZE_INFORMATION_EX: FsInformationClass = 14

public val FILE_FS_LABEL_INFORMATION: FsInformationClass = 2

public val FILE_FS_MAXIMUM_INFORMATION: FsInformationClass = 15

public val FILE_FS_METADATA_SIZE_INFORMATION: FsInformationClass = 13

public val FILE_FS_OBJECT_ID_INFORMATION: FsInformationClass = 8

public val FILE_FS_SECTOR_SIZE_INFORMATION: FsInformationClass = 11

public val FILE_FS_SIZE_INFORMATION: FsInformationClass = 3

public val FILE_FS_VOLUME_FLAGS_INFORMATION: FsInformationClass = 10

public val FILE_FS_VOLUME_INFORMATION: FsInformationClass = 1

public val FILE_FULL_DIRECTORY_INFORMATION: FileInformationClass = 2

public val FILE_FULL_EA_INFORMATION: FileInformationClass = 15

public val FILE_HARD_LINK_FULL_ID_INFORMATION: FileInformationClass = 62

public val FILE_HARD_LINK_INFORMATION: FileInformationClass = 46

public val FILE_ID_BOTH_DIRECTORY_INFORMATION: FileInformationClass = 37

public val FILE_ID_EXTD_BOTH_DIRECTORY_INFORMATION: FileInformationClass = 63

public val FILE_ID_EXTD_DIRECTORY_INFORMATION: FileInformationClass = 60

public val FILE_ID_FULL_DIRECTORY_INFORMATION: FileInformationClass = 38

public val FILE_ID_GLOBAL_TX_DIRECTORY_INFORMATION: FileInformationClass = 50

public val FILE_ID_INFORMATION: FileInformationClass = 59

public val FILE_INTERNAL_INFORMATION: FileInformationClass = 6

public val FILE_IO_COMPLETION_NOTIFICATION_INFORMATION: FileInformationClass = 41

public val FILE_IO_PRIORITY_HINT_INFORMATION: FileInformationClass = 43

public val FILE_IO_STATUS_BLOCK_RANGE_INFORMATION: FileInformationClass = 42

public val FILE_IS_REMOTE_DEVICE_INFORMATION: FileInformationClass = 51

public val FILE_KNOWN_FOLDER_INFORMATION: FileInformationClass = 76

public val FILE_LINK_INFORMATION: FileInformationClass = 11

public val FILE_LINK_INFORMATION_BYPASS_ACCESS_CHECK: FileInformationClass = 57

public val FILE_LINK_INFORMATION_EX: FileInformationClass = 72

public val FILE_LINK_INFORMATION_EX_BYPASS_ACCESS_CHECK: FileInformationClass = 73

public val FILE_MAILSLOT_QUERY_INFORMATION: FileInformationClass = 26

public val FILE_MAILSLOT_SET_INFORMATION: FileInformationClass = 27

public val FILE_MAXIMUM_INFORMATION: FileInformationClass = 77

public val FILE_MEMORY_PARTITION_INFORMATION: FileInformationClass = 69

public val FILE_MODE_INFORMATION: FileInformationClass = 16

public val FILE_MOVE_CLUSTER_INFORMATION: FileInformationClass = 31

public val FILE_NAME_INFORMATION: FileInformationClass = 9

public val FILE_NAMES_INFORMATION: FileInformationClass = 12

public val FILE_NETWORK_OPEN_INFORMATION: FileInformationClass = 34

public val FILE_NETWORK_PHYSICAL_NAME_INFORMATION: FileInformationClass = 49

public val FILE_NORMALIZED_NAME_INFORMATION: FileInformationClass = 48

public val FILE_NUMA_NODE_INFORMATION: FileInformationClass = 53

public val FILE_OBJECT_ID_INFORMATION: FileInformationClass = 29

public val FILE_PIPE_INFORMATION: FileInformationClass = 23

public val FILE_PIPE_LOCAL_INFORMATION: FileInformationClass = 24

public val FILE_PIPE_REMOTE_INFORMATION: FileInformationClass = 25

public val FILE_POSITION_INFORMATION: FileInformationClass = 14

public val FILE_PROCESS_IDS_USING_FILE_INFORMATION: FileInformationClass = 47

public val FILE_QUOTA_INFORMATION: FileInformationClass = 32

public val FILE_REMOTE_PROTOCOL_INFORMATION: FileInformationClass = 55

public val FILE_RENAME_INFORMATION: FileInformationClass = 10

public val FILE_RENAME_INFORMATION_BYPASS_ACCESS_CHECK: FileInformationClass = 56

public val FILE_RENAME_INFORMATION_EX: FileInformationClass = 65

public val FILE_RENAME_INFORMATION_EX_BYPASS_ACCESS_CHECK: FileInformationClass = 66

public val FILE_REPARSE_POINT_INFORMATION: FileInformationClass = 33

public val FILE_REPLACE_COMPLETION_INFORMATION: FileInformationClass = 61

public val FILE_SFIO_RESERVE_INFORMATION: FileInformationClass = 44

public val FILE_SFIO_VOLUME_INFORMATION: FileInformationClass = 45

public val FILE_SHORT_NAME_INFORMATION: FileInformationClass = 40

public val FILE_STANDARD_INFORMATION: FileInformationClass = 5

public val FILE_STANDARD_LINK_INFORMATION: FileInformationClass = 54

public val FILE_STAT_INFORMATION: FileInformationClass = 68

public val FILE_STAT_LX_INFORMATION: FileInformationClass = 70

public val FILE_STORAGE_RESERVE_ID_INFORMATION: FileInformationClass = 74

public val FILE_STREAM_INFORMATION: FileInformationClass = 22

public val FILE_TRACKING_INFORMATION: FileInformationClass = 36

public val FILE_UNUSED_INFORMATION: FileInformationClass = 52

public val FILE_VALID_DATA_LENGTH_INFORMATION: FileInformationClass = 39

public val FILE_VOLUME_NAME_INFORMATION: FileInformationClass = 58

public val GCR_ALLOW_LM: UInt = 4096u

public val GCR_ALLOW_NO_TARGET: UInt = 8192u

public val GCR_ALLOW_NTLM: UInt = 256u

public val GCR_MACHINE_CREDENTIAL: UInt = 1024u

public val GCR_NTLM3_PARMS: UInt = 32u

public val GCR_TARGET_INFO: UInt = 64u

public val GCR_USE_OEM_SET: UInt = 512u

public val GCR_USE_OWF_PASSWORD: UInt = 2048u

public val GCR_VSM_PROTECTED_PASSWORD: UInt = 16384u

public val GENERATE_CLIENT_CHALLENGE: UInt = 16u

public val GUID_ECP_ATOMIC_CREATE: Guid = Guid.fromU128(U128(0x4720bd8352ac4104uL, 0xa130d1ec6a8cc8e5uL))

public val GUID_ECP_CLOUDFILES_ATTRIBUTION: Guid = Guid.fromU128(U128(0x2932ff5283784fc1uL, 0x8edb6bdc8f602709uL))

public val GUID_ECP_CREATE_REDIRECTION: Guid = Guid.fromU128(U128(0x188d6bd6a1264fa8uL, 0xbdf21ccdf896f3e0uL))

public val GUID_ECP_CSV_DOWN_LEVEL_OPEN: Guid = Guid.fromU128(U128(0x4248be44647f488fuL, 0x8be5a08aaf70f028uL))

public val GUID_ECP_CSV_QUERY_FILE_REVISION: Guid = Guid.fromU128(U128(0x44aec90bde654d46uL, 0x8fbf763f9d970b1duL))

public val GUID_ECP_CSV_QUERY_FILE_REVISION_FILE_ID_128: Guid = Guid.fromU128(U128(0x7a3a4aa1aa744bc6uL, 0xb070ab56a38c1feduL))

public val GUID_ECP_CSV_SET_HANDLE_PROPERTIES: Guid = Guid.fromU128(U128(0x7a9fdd947b5842bbuL, 0x97403cb86983a615uL))

public val GUID_ECP_DUAL_OPLOCK_KEY: Guid = Guid.fromU128(U128(0x41621a14b08b4df1uL, 0xb676a05ffdf01beauL))

public val GUID_ECP_IO_DEVICE_HINT: Guid = Guid.fromU128(U128(0xf315b732ac6b4d4duL, 0xbe0cb3126490e1a3uL))

public val GUID_ECP_NETWORK_APP_INSTANCE: Guid = Guid.fromU128(U128(0x6aa6bc45a7ef4af7uL, 0x9008fa462e144d74uL))

public val GUID_ECP_NETWORK_APP_INSTANCE_VERSION: Guid = Guid.fromU128(U128(0xb7d082b9563b4f07uL, 0xa07b524a8116a010uL))

public val GUID_ECP_NETWORK_OPEN_CONTEXT: Guid = Guid.fromU128(U128(0xc584edbf00df4d28uL, 0xb88435baca8911e8uL))

public val GUID_ECP_NFS_OPEN: Guid = Guid.fromU128(U128(0xf326d30ce5f84fe7uL, 0xab74f5a3196d92dbuL))

public val GUID_ECP_OPEN_PARAMETERS: Guid = Guid.fromU128(U128(0xcd0a93c33bb7463duL, 0xaccb969d3435a5a5uL))

public val GUID_ECP_OPLOCK_KEY: Guid = Guid.fromU128(U128(0x4885059630504be7uL, 0x9863fec350ce8d7fuL))

public val GUID_ECP_PREFETCH_OPEN: Guid = Guid.fromU128(U128(0xe1777b21847e4837uL, 0xaa4564161d280655uL))

public val GUID_ECP_QUERY_ON_CREATE: Guid = Guid.fromU128(U128(0x1aca62e9abb44ff2uL, 0xbb5c1c79025e417fuL))

public val GUID_ECP_RKF_BYPASS: Guid = Guid.fromU128(U128(0x2378cc6f73c489cuL, 0x8282564d1a99131buL))

public val GUID_ECP_SRV_OPEN: Guid = Guid.fromU128(U128(0xbebfaebcaabf489duL, 0x9d2ce9e361102853uL))

public val GREATER_THAN: FsrtlComparisonResult = 1

public val HEAP_CLASS_0: UInt = 0u

public val HEAP_CLASS_1: UInt = 4096u

public val HEAP_CLASS_2: UInt = 8192u

public val HEAP_CLASS_3: UInt = 12288u

public val HEAP_CLASS_4: UInt = 16384u

public val HEAP_CLASS_5: UInt = 20480u

public val HEAP_CLASS_6: UInt = 24576u

public val HEAP_CLASS_7: UInt = 28672u

public val HEAP_CLASS_8: UInt = 32768u

public val HEAP_CLASS_MASK: UInt = 61440u

public val HEAP_CREATE_ALIGN_16: UInt = 65536u

public val HEAP_CREATE_ENABLE_EXECUTE: UInt = 262144u

public val HEAP_CREATE_ENABLE_TRACING: UInt = 131072u

public val HEAP_CREATE_HARDENED: UInt = 512u

public val HEAP_CREATE_SEGMENT_HEAP: UInt = 256u

public val HEAP_DISABLE_COALESCE_ON_FREE: UInt = 128u

public val HEAP_FREE_CHECKING_ENABLED: UInt = 64u

public val HEAP_GENERATE_EXCEPTIONS: UInt = 4u

public val HEAP_GLOBAL_TAG: UInt = 2048u

public val HEAP_GROWABLE: UInt = 2u

public val HEAP_MAXIMUM_TAG: UInt = 4095u

public val HEAP_NO_SERIALIZE: UInt = 1u

public val HEAP_PSEUDO_TAG_FLAG: UInt = 32768u

public val HEAP_REALLOC_IN_PLACE_ONLY: UInt = 16u

public val HEAP_SETTABLE_USER_FLAG1: UInt = 512u

public val HEAP_SETTABLE_USER_FLAG2: UInt = 1024u

public val HEAP_SETTABLE_USER_FLAG3: UInt = 2048u

public val HEAP_SETTABLE_USER_FLAGS: UInt = 3584u

public val HEAP_SETTABLE_USER_VALUE: UInt = 256u

public val HEAP_TAG_SHIFT: UInt = 18u

public val HEAP_TAIL_CHECKING_ENABLED: UInt = 32u

public val HEAP_ZERO_MEMORY: UInt = 8u

public val HEAP_MEMORY_BASIC_INFORMATION: HeapMemoryInfoClass = 0

public val INVALID_PROCESSOR_INDEX: UInt = 4294967295u

public val IOCTL_LMR_ARE_FILE_OBJECTS_ON_SAME_SERVER: UInt = 1310960u

public val IOCTL_REDIR_QUERY_PATH: UInt = 1311119u

public val IOCTL_REDIR_QUERY_PATH_EX: UInt = 1311123u

public val IOCTL_VOLSNAP_FLUSH_AND_HOLD_WRITES: UInt = 5488640u

public val IO_CD_ROM_INCREMENT: UInt = 1u

public val IO_CREATE_STREAM_FILE_LITE: UInt = 2u

public val IO_CREATE_STREAM_FILE_RAISE_ON_ERROR: UInt = 1u

public val IO_DISK_INCREMENT: UInt = 1u

public val IO_FILE_OBJECT_NON_PAGED_POOL_CHARGE: UInt = 64u

public val IO_FILE_OBJECT_PAGED_POOL_CHARGE: UInt = 1024u

public val IO_IGNORE_READONLY_ATTRIBUTE: UInt = 64u

public val IO_MAILSLOT_INCREMENT: UInt = 2u

public val IO_MM_PAGING_FILE: UInt = 16u

public val IO_NAMED_PIPE_INCREMENT: UInt = 2u

public val IO_NETWORK_INCREMENT: UInt = 2u

public val IO_NO_INCREMENT: UInt = 0u

public val IO_OPEN_PAGING_FILE: UInt = 2u

public val IO_OPEN_TARGET_DIRECTORY: UInt = 4u

public val IO_REPARSE_TAG_ACRONIS_HSM_0: Int = 96

public val IO_REPARSE_TAG_ACRONIS_HSM_1: Int = 97

public val IO_REPARSE_TAG_ACRONIS_HSM_2: Int = 98

public val IO_REPARSE_TAG_ACRONIS_HSM_3: Int = 99

public val IO_REPARSE_TAG_ACRONIS_HSM_4: Int = 100

public val IO_REPARSE_TAG_ACRONIS_HSM_5: Int = 101

public val IO_REPARSE_TAG_ACRONIS_HSM_6: Int = 102

public val IO_REPARSE_TAG_ACRONIS_HSM_7: Int = 103

public val IO_REPARSE_TAG_ACRONIS_HSM_8: Int = 104

public val IO_REPARSE_TAG_ACRONIS_HSM_9: Int = 105

public val IO_REPARSE_TAG_ACRONIS_HSM_A: Int = 106

public val IO_REPARSE_TAG_ACRONIS_HSM_B: Int = 107

public val IO_REPARSE_TAG_ACRONIS_HSM_C: Int = 108

public val IO_REPARSE_TAG_ACRONIS_HSM_D: Int = 109

public val IO_REPARSE_TAG_ACRONIS_HSM_E: Int = 110

public val IO_REPARSE_TAG_ACRONIS_HSM_F: Int = 111

public val IO_REPARSE_TAG_ACTIVISION_HSM: Int = 71

public val IO_REPARSE_TAG_ADA_HSM: Int = 38

public val IO_REPARSE_TAG_ADOBE_HSM: Int = 69

public val IO_REPARSE_TAG_ALERTBOOT: Int = 536870988

public val IO_REPARSE_TAG_ALTIRIS_HSM: Int = 25

public val IO_REPARSE_TAG_APPXSTRM: Int = -1073741804

public val IO_REPARSE_TAG_ARCO_BACKUP: Int = 59

public val IO_REPARSE_TAG_ARKIVIO: Int = 12

public val IO_REPARSE_TAG_AURISTOR_FS: Int = 73

public val IO_REPARSE_TAG_AUTN_HSM: Int = 39

public val IO_REPARSE_TAG_BRIDGEHEAD_HSM: Int = 22

public val IO_REPARSE_TAG_C2CSYSTEMS_HSM: Int = 49

public val IO_REPARSE_TAG_CARINGO_HSM: Int = 52

public val IO_REPARSE_TAG_CARROLL_HSM: Int = 60

public val IO_REPARSE_TAG_CITRIX_PM: Int = 54

public val IO_REPARSE_TAG_COMMVAULT: Int = 14

public val IO_REPARSE_TAG_COMMVAULT_HSM: Int = 29

public val IO_REPARSE_TAG_COMTRADE_HSM: Int = 61

public val IO_REPARSE_TAG_CTERA_HSM: Int = 78

public val IO_REPARSE_TAG_DATAFIRST_HSM: Int = 48

public val IO_REPARSE_TAG_DATAGLOBAL_HSM: Int = 46

public val IO_REPARSE_TAG_DATASTOR_SIS: Int = 30

public val IO_REPARSE_TAG_DFM: Int = -2147483626

public val IO_REPARSE_TAG_DOR_HSM: Int = 82

public val IO_REPARSE_TAG_DOUBLE_TAKE_HSM: Int = 34

public val IO_REPARSE_TAG_DOUBLE_TAKE_SIS: Int = 41

public val IO_REPARSE_TAG_DRIVE_EXTENDER: Int = -2147483643

public val IO_REPARSE_TAG_DROPBOX_HSM: Int = 68

public val IO_REPARSE_TAG_EASEFILTER_HSM: Int = 87

public val IO_REPARSE_TAG_EASEVAULT_HSM: Int = 62

public val IO_REPARSE_TAG_EDSI_HSM: Int = 31

public val IO_REPARSE_TAG_ELTAN_HSM: Int = 43

public val IO_REPARSE_TAG_EMC_HSM: Int = 57

public val IO_REPARSE_TAG_ENIGMA_HSM: Int = 17

public val IO_REPARSE_TAG_FILTER_MANAGER: Int = -2147483637

public val IO_REPARSE_TAG_GLOBAL360_HSM: Int = 24

public val IO_REPARSE_TAG_GOOGLE_HSM: Int = 65

public val IO_REPARSE_TAG_GRAU_DATASTORAGE_HSM: Int = 28

public val IO_REPARSE_TAG_HDS_HCP_HSM: Int = 72

public val IO_REPARSE_TAG_HDS_HSM: Int = 63

public val IO_REPARSE_TAG_HERMES_HSM: Int = 26

public val IO_REPARSE_TAG_HP_BACKUP: Int = 67

public val IO_REPARSE_TAG_HP_DATA_PROTECT: Int = 70

public val IO_REPARSE_TAG_HP_HSM: Int = 32

public val IO_REPARSE_TAG_HSAG_HSM: Int = 37

public val IO_REPARSE_TAG_HUBSTOR_HSM: Int = 85

public val IO_REPARSE_TAG_IFSTEST_CONGRUENT: Int = 9

public val IO_REPARSE_TAG_IIS_CACHE: Int = -1610612720

public val IO_REPARSE_TAG_IMANAGE_HSM: Int = 536870998

public val IO_REPARSE_TAG_INTERCOPE_HSM: Int = 19

public val IO_REPARSE_TAG_ITSTATION: Int = 74

public val IO_REPARSE_TAG_KOM_NETWORKS_HSM: Int = 20

public val IO_REPARSE_TAG_LX_BLK: Int = -2147483610

public val IO_REPARSE_TAG_LX_CHR: Int = -2147483611

public val IO_REPARSE_TAG_LX_FIFO: Int = -2147483612

public val IO_REPARSE_TAG_LX_SYMLINK: Int = -1610612707

public val IO_REPARSE_TAG_MAGINATICS_RDR: Int = 64

public val IO_REPARSE_TAG_MAXISCALE_HSM: Int = 536870965

public val IO_REPARSE_TAG_MEMORY_TECH_HSM: Int = 21

public val IO_REPARSE_TAG_MIMOSA_HSM: Int = 36

public val IO_REPARSE_TAG_MOONWALK_HSM: Int = 10

public val IO_REPARSE_TAG_MTALOS: Int = 77

public val IO_REPARSE_TAG_NEUSHIELD: Int = 81

public val IO_REPARSE_TAG_NEXSAN_HSM: Int = 40

public val IO_REPARSE_TAG_NIPPON_HSM: Int = 79

public val IO_REPARSE_TAG_NVIDIA_UNIONFS: Int = 536870996

public val IO_REPARSE_TAG_OPENAFS_DFS: Int = 55

public val IO_REPARSE_TAG_OSR_SAMPLE: Int = 536870935

public val IO_REPARSE_TAG_OVERTONE: Int = 15

public val IO_REPARSE_TAG_POINTSOFT_HSM: Int = 27

public val IO_REPARSE_TAG_QI_TECH_HSM: Int = 536870959

public val IO_REPARSE_TAG_QUADDRA_HSM: Int = 66

public val IO_REPARSE_TAG_QUEST_HSM: Int = 45

public val IO_REPARSE_TAG_REDSTOR_HSM: Int = 80

public val IO_REPARSE_TAG_RIVERBED_HSM: Int = 51

public val IO_REPARSE_TAG_SER_HSM: Int = 33

public val IO_REPARSE_TAG_SHX_BACKUP: Int = 83

public val IO_REPARSE_TAG_SOLUTIONSOFT: Int = 536870925

public val IO_REPARSE_TAG_SONY_HSM: Int = 42

public val IO_REPARSE_TAG_SPHARSOFT: Int = 75

public val IO_REPARSE_TAG_SYMANTEC_HSM: Int = 18

public val IO_REPARSE_TAG_SYMANTEC_HSM2: Int = 16

public val IO_REPARSE_TAG_TSINGHUA_UNIVERSITY_RESEARCH: Int = 11

public val IO_REPARSE_TAG_UTIXO_HSM: Int = 44

public val IO_REPARSE_TAG_VALID_VALUES: UInt = 4026597375u

public val IO_REPARSE_TAG_VMWARE_PM: Int = 58

public val IO_REPARSE_TAG_WATERFORD: Int = 50

public val IO_REPARSE_TAG_WISDATA_HSM: Int = 35

public val IO_REPARSE_TAG_ZLTI_HSM: Int = 56

public val IO_STOP_ON_SYMLINK: UInt = 8u

public val KNOWN_FOLDER_DESKTOP: FileKnownFolderType = 1

public val KNOWN_FOLDER_DOCUMENTS: FileKnownFolderType = 2

public val KNOWN_FOLDER_DOWNLOADS: FileKnownFolderType = 3

public val KNOWN_FOLDER_MAX: FileKnownFolderType = 7

public val KNOWN_FOLDER_MUSIC: FileKnownFolderType = 4

public val KNOWN_FOLDER_NONE: FileKnownFolderType = 0

public val KNOWN_FOLDER_OTHER: FileKnownFolderType = 7

public val KNOWN_FOLDER_PICTURES: FileKnownFolderType = 5

public val KNOWN_FOLDER_VIDEOS: FileKnownFolderType = 6

public val LCN_CHECKSUM_VALID: LcnWeakReferenceState = 2

public val LCN_WEAK_REFERENCE_VALID: LcnWeakReferenceState = 1

public val LX_FILE_CASE_SENSITIVE_DIR: UInt = 16u

public val LX_FILE_METADATA_DEVICE_ID_EA_NAME: Pcstr = s("\$LXDEV")

public val LX_FILE_METADATA_GID_EA_NAME: Pcstr = s("\$LXGID")

public val LX_FILE_METADATA_HAS_DEVICE_ID: UInt = 8u

public val LX_FILE_METADATA_HAS_GID: UInt = 2u

public val LX_FILE_METADATA_HAS_MODE: UInt = 4u

public val LX_FILE_METADATA_HAS_UID: UInt = 1u

public val LX_FILE_METADATA_MODE_EA_NAME: Pcstr = s("\$LXMOD")

public val LX_FILE_METADATA_UID_EA_NAME: Pcstr = s("\$LXUID")

public val LESS_THAN: FsrtlComparisonResult = -1

public val MAP_DISABLE_PAGEFAULT_CLUSTERING: UInt = 256u

public val MAP_HIGH_PRIORITY: UInt = 64u

public val MAP_NO_READ: UInt = 16u

public val MAP_WAIT: UInt = 1u

public val MAXIMUM_LEADBYTES: UInt = 12u

public val MAX_UNICODE_STACK_BUFFER_LENGTH: UInt = 256u

public val MCB_FLAG_RAISE_ON_ALLOCATION_FAILURE: UInt = 1u

public val MM_FORCE_CLOSED_DATA: UInt = 1u

public val MM_FORCE_CLOSED_IMAGE: UInt = 2u

public val MM_FORCE_CLOSED_LATER_OK: UInt = 4u

public val MM_IS_FILE_SECTION_ACTIVE_DATA: UInt = 2u

public val MM_IS_FILE_SECTION_ACTIVE_IMAGE: UInt = 1u

public val MM_IS_FILE_SECTION_ACTIVE_USER: UInt = 4u

public val MEMORY_BASIC_INFORMATION: MemoryInformationClass = 0

public val MEMORY_TYPE64K_PAGE: RtlMemoryType = 2

public val MEMORY_TYPE_CUSTOM: RtlMemoryType = 5

public val MEMORY_TYPE_HUGE_PAGE: RtlMemoryType = 4

public val MEMORY_TYPE_LARGE_PAGE: RtlMemoryType = 3

public val MEMORY_TYPE_MAX: RtlMemoryType = 6

public val MEMORY_TYPE_NON_PAGED: RtlMemoryType = 1

public val MEMORY_TYPE_PAGED: RtlMemoryType = 0

public val MM_FLUSH_FOR_DELETE: MmflushType = 0

public val MM_FLUSH_FOR_WRITE: MmflushType = 1

public val MSV_AV_CHANNEL_BINDINGS: Msv10Avid = 10

public val MSV_AV_DNS_COMPUTER_NAME: Msv10Avid = 3

public val MSV_AV_DNS_DOMAIN_NAME: Msv10Avid = 4

public val MSV_AV_DNS_TREE_NAME: Msv10Avid = 5

public val MSV_AV_EOL: Msv10Avid = 0

public val MSV_AV_FLAGS: Msv10Avid = 6

public val MSV_AV_NB_COMPUTER_NAME: Msv10Avid = 1

public val MSV_AV_NB_DOMAIN_NAME: Msv10Avid = 2

public val MSV_AV_RESTRICTIONS: Msv10Avid = 8

public val MSV_AV_TARGET_NAME: Msv10Avid = 9

public val MSV_AV_TIMESTAMP: Msv10Avid = 7

public val NETWORK_OPEN_ECP_IN_FLAG_DISABLE_HANDLE_COLLAPSING: UInt = 1u

public val NETWORK_OPEN_ECP_IN_FLAG_DISABLE_HANDLE_DURABILITY: UInt = 2u

public val NETWORK_OPEN_ECP_IN_FLAG_DISABLE_OPLOCKS: UInt = 4u

public val NETWORK_OPEN_ECP_IN_FLAG_FORCE_BUFFERED_SYNCHRONOUS_IO_HACK: UInt = 2147483648u

public val NETWORK_OPEN_ECP_IN_FLAG_FORCE_MAX_EOF_HACK: UInt = 1073741824u

public val NETWORK_OPEN_ECP_IN_FLAG_REQ_MUTUAL_AUTH: UInt = 8u

public val NETWORK_OPEN_ECP_OUT_FLAG_RET_MUTUAL_AUTH: UInt = 8u

public val NO_8DOT3_NAME_PRESENT: UInt = 1u

public val NETWORK_OPEN_INTEGRITY_ANY: NetworkOpenIntegrityQualifier = 0

public val NETWORK_OPEN_INTEGRITY_ENCRYPTED: NetworkOpenIntegrityQualifier = 3

public val NETWORK_OPEN_INTEGRITY_MAXIMUM: NetworkOpenIntegrityQualifier = 4

public val NETWORK_OPEN_INTEGRITY_NONE: NetworkOpenIntegrityQualifier = 1

public val NETWORK_OPEN_INTEGRITY_SIGNED: NetworkOpenIntegrityQualifier = 2

public val NETWORK_OPEN_LOCATION_ANY: NetworkOpenLocationQualifier = 0

public val NETWORK_OPEN_LOCATION_LOOPBACK: NetworkOpenLocationQualifier = 2

public val NETWORK_OPEN_LOCATION_REMOTE: NetworkOpenLocationQualifier = 1

public val NOTIFY_TYPE_CREATE: FsFilterStreamFoNotificationType = 0

public val NOTIFY_TYPE_RETIRED: FsFilterStreamFoNotificationType = 1

public val NTFS_LINK_TRACKING_INFORMATION: LinkTrackingInformationType = 0

public val OPEN_REPARSE_POINT_OVERRIDE_CREATE_OPTION: UInt = 64u

public val OPEN_REPARSE_POINT_REPARSE_ALWAYS: UInt = 126u

public val OPEN_REPARSE_POINT_REPARSE_IF_CHILD_EXISTS: UInt = 2u

public val OPEN_REPARSE_POINT_REPARSE_IF_CHILD_NOT_EXISTS: UInt = 4u

public val OPEN_REPARSE_POINT_REPARSE_IF_DIRECTORY_FINAL_COMPONENT: UInt = 8u

public val OPEN_REPARSE_POINT_REPARSE_IF_DIRECTORY_FINAL_COMPONENT_ALWAYS: UInt = 72u

public val OPEN_REPARSE_POINT_REPARSE_IF_FINAL_COMPONENT: UInt = 40u

public val OPEN_REPARSE_POINT_REPARSE_IF_FINAL_COMPONENT_ALWAYS: UInt = 104u

public val OPEN_REPARSE_POINT_REPARSE_IF_NON_DIRECTORY_FINAL_COMPONENT: UInt = 32u

public val OPEN_REPARSE_POINT_REPARSE_IF_NON_DIRECTORY_FINAL_COMPONENT_ALWAYS: UInt = 96u

public val OPEN_REPARSE_POINT_REPARSE_IF_NON_DIRECTORY_NON_FINAL_COMPONENT: UInt = 16u

public val OPEN_REPARSE_POINT_REPARSE_IF_NON_DIRECTORY_NON_FINAL_COMPONENT_ALWAYS: UInt = 80u

public val OPEN_REPARSE_POINT_REPARSE_IF_NON_FINAL_COMPONENT: UInt = 22u

public val OPEN_REPARSE_POINT_RETURN_REPARSE_DATA_BUFFER: UInt = 128u

public val OPEN_REPARSE_POINT_TAG_ENCOUNTERED: UInt = 1u

public val OPEN_REPARSE_POINT_VERSION_EX: UInt = 2147483648u

public val OPLOCK_FLAG_BACK_OUT_ATOMIC_OPLOCK: UInt = 4u

public val OPLOCK_FLAG_BREAKING_FOR_SHARING_VIOLATION: UInt = 128u

public val OPLOCK_FLAG_CLOSING_DELETE_ON_CLOSE: UInt = 32u

public val OPLOCK_FLAG_COMPLETE_IF_OPLOCKED: UInt = 1u

public val OPLOCK_FLAG_IGNORE_OPLOCK_KEYS: UInt = 8u

public val OPLOCK_FLAG_OPLOCK_KEY_CHECK_ONLY: UInt = 2u

public val OPLOCK_FLAG_PARENT_OBJECT: UInt = 16u

public val OPLOCK_FLAG_REMOVING_FILE_OR_LINK: UInt = 64u

public val OPLOCK_FSCTRL_FLAG_ALL_KEYS_MATCH: UInt = 1u

public val OPLOCK_NOTIFY_BREAK_WAIT_INTERIM_TIMEOUT: OplockNotifyReason = 0

public val OPLOCK_NOTIFY_BREAK_WAIT_TERMINATED: OplockNotifyReason = 1

public val OPLOCK_UPPER_FLAG_CHECK_NO_BREAK: UInt = 65536u

public val OPLOCK_UPPER_FLAG_NOTIFY_REFRESH_READ: UInt = 131072u

public val PIN_CALLER_TRACKS_DIRTY_DATA: UInt = 32u

public val PIN_EXCLUSIVE: UInt = 2u

public val PIN_HIGH_PRIORITY: UInt = 64u

public val PIN_IF_BCB: UInt = 8u

public val PIN_NO_READ: UInt = 4u

public val PIN_VERIFY_REQUIRED: UInt = 128u

public val PIN_WAIT: UInt = 1u

public val POLICY_AUDIT_SUBCATEGORY_COUNT: UInt = 59u

public val PO_CB_AC_STATUS: UInt = 1u

public val PO_CB_BUTTON_COLLISION: UInt = 2u

public val PO_CB_LID_SWITCH_STATE: UInt = 4u

public val PO_CB_PROCESSOR_POWER_POLICY: UInt = 5u

public val PO_CB_SYSTEM_POWER_POLICY: UInt = 0u

public val PO_CB_SYSTEM_STATE_LOCK: UInt = 3u

public val PSMP_MAXIMUM_SYSAPP_CLAIM_VALUES: UInt = 4u

public val PSMP_MINIMUM_SYSAPP_CLAIM_VALUES: UInt = 2u

public val PURGE_WITH_ACTIVE_VIEWS: UInt = 8u

public val QUERY_DIRECT_ACCESS_DATA_EXTENTS: UInt = 2u

public val QUERY_DIRECT_ACCESS_IMAGE_EXTENTS: UInt = 1u

public val QO_C_FILE_EA_INFORMATION: UInt = 4u

public val QO_C_FILE_LX_INFORMATION: UInt = 2u

public val QO_C_FILE_STAT_INFORMATION: UInt = 1u

public val REFS_COMPRESSION_FORMAT_LZ4: RefsCompressionFormats = 1

public val REFS_COMPRESSION_FORMAT_MAX: RefsCompressionFormats = 3

public val REFS_COMPRESSION_FORMAT_UNCOMPRESSED: RefsCompressionFormats = 0

public val REFS_COMPRESSION_FORMAT_ZSTD: RefsCompressionFormats = 2

public val REFS_DEALLOCATE_RANGES_ALLOCATOR_CAA: RefsDeallocateRangesAllocator = 2

public val REFS_DEALLOCATE_RANGES_ALLOCATOR_MAA: RefsDeallocateRangesAllocator = 3

public val REFS_DEALLOCATE_RANGES_ALLOCATOR_NONE: RefsDeallocateRangesAllocator = 0

public val REFS_DEALLOCATE_RANGES_ALLOCATOR_SAA: RefsDeallocateRangesAllocator = 1

public val REFS_SET_VOLUME_COMPRESSION_INFO_FLAG_COMPRESS_SYNC: RefsSetVolumeCompressionInfoFlags = 1

public val REFS_SET_VOLUME_COMPRESSION_INFO_FLAG_MAX: RefsSetVolumeCompressionInfoFlags = 1

public val REFS_STREAM_EXTENT_PROPERTY_CRC32: RefsStreamExtentProperties = 128

public val REFS_STREAM_EXTENT_PROPERTY_CRC64: RefsStreamExtentProperties = 256

public val REFS_STREAM_EXTENT_PROPERTY_GHOSTED: RefsStreamExtentProperties = 512

public val REFS_STREAM_EXTENT_PROPERTY_READONLY: RefsStreamExtentProperties = 1024

public val REFS_STREAM_EXTENT_PROPERTY_SPARSE: RefsStreamExtentProperties = 8

public val REFS_STREAM_EXTENT_PROPERTY_STREAM_RESERVED: RefsStreamExtentProperties = 32

public val REFS_STREAM_EXTENT_PROPERTY_VALID: RefsStreamExtentProperties = 16

public val REFS_STREAM_SNAPSHOT_OPERATION_CLEAR_SHADOW_BTREE: RefsStreamSnapshotOperation = 6

public val REFS_STREAM_SNAPSHOT_OPERATION_CREATE: RefsStreamSnapshotOperation = 1

public val REFS_STREAM_SNAPSHOT_OPERATION_INVALID: RefsStreamSnapshotOperation = 0

public val REFS_STREAM_SNAPSHOT_OPERATION_LIST: RefsStreamSnapshotOperation = 2

public val REFS_STREAM_SNAPSHOT_OPERATION_MAX: RefsStreamSnapshotOperation = 6

public val REFS_STREAM_SNAPSHOT_OPERATION_QUERY_DELTAS: RefsStreamSnapshotOperation = 3

public val REFS_STREAM_SNAPSHOT_OPERATION_REVERT: RefsStreamSnapshotOperation = 4

public val REFS_STREAM_SNAPSHOT_OPERATION_SET_SHADOW_BTREE: RefsStreamSnapshotOperation = 5

public val REMOTE_PROTOCOL_FLAG_INTEGRITY: UInt = 16u

public val REMOTE_PROTOCOL_FLAG_LOOPBACK: UInt = 1u

public val REMOTE_PROTOCOL_FLAG_MUTUAL_AUTH: UInt = 32u

public val REMOTE_PROTOCOL_FLAG_OFFLINE: UInt = 2u

public val REMOTE_PROTOCOL_FLAG_PERSISTENT_HANDLE: UInt = 4u

public val REMOTE_PROTOCOL_FLAG_PRIVACY: UInt = 8u

public val REMOVED_8DOT3_NAME: UInt = 2u

public val REPARSE_DATA_EX_FLAG_GIVEN_TAG_OR_NONE: UInt = 1u

public val RETURN_NON_NT_USER_SESSION_KEY: UInt = 8u

public val RETURN_PRIMARY_LOGON_DOMAINNAME: UInt = 4u

public val RETURN_PRIMARY_USERNAME: UInt = 2u

public val RETURN_RESERVED_PARAMETER: UInt = 128u

public val RPI_SMB2_SERVERCAP_DFS: UInt = 1u

public val RPI_SMB2_SERVERCAP_DIRECTORY_LEASING: UInt = 32u

public val RPI_SMB2_SERVERCAP_ENCRYPTION_AWARE: UInt = 64u

public val RPI_SMB2_SERVERCAP_LARGEMTU: UInt = 4u

public val RPI_SMB2_SERVERCAP_LEASING: UInt = 2u

public val RPI_SMB2_SERVERCAP_MULTICHANNEL: UInt = 8u

public val RPI_SMB2_SERVERCAP_PERSISTENT_HANDLES: UInt = 16u

public val RPI_SMB2_SHARECAP_ACCESS_BASED_DIRECTORY_ENUM: UInt = 256u

public val RPI_SMB2_SHARECAP_ASYMMETRIC_SCALEOUT: UInt = 1024u

public val RPI_SMB2_SHARECAP_CLUSTER: UInt = 64u

public val RPI_SMB2_SHARECAP_CONTINUOUS_AVAILABILITY: UInt = 16u

public val RPI_SMB2_SHARECAP_DFS: UInt = 8u

public val RPI_SMB2_SHARECAP_ENCRYPTED: UInt = 128u

public val RPI_SMB2_SHARECAP_IDENTITY_REMOTING: UInt = 512u

public val RPI_SMB2_SHARECAP_SCALEOUT: UInt = 32u

public val RPI_SMB2_SHARECAP_TIMEWARP: UInt = 2u

public val RPI_SMB2_SHARETYPE_DISK: UInt = 0u

public val RPI_SMB2_SHARETYPE_PIPE: UInt = 1u

public val RPI_SMB2_SHARETYPE_PRINT: UInt = 2u

public val RTL_DUPLICATE_UNICODE_STRING_ALLOCATE_NULL_STRING: UInt = 2u

public val RTL_DUPLICATE_UNICODE_STRING_NULL_TERMINATE: UInt = 1u

public val RTL_HEAP_MEMORY_LIMIT_CURRENT_VERSION: UInt = 1u

public val RTL_SYSTEM_VOLUME_INFORMATION_FOLDER: Pcwstr = w("System Volume Information")

public val SECURITY_ANONYMOUS_LOGON_RID: Int = 7

public val SEGMENT_HEAP_FLG_USE_PAGE_HEAP: UInt = 1u

public val SEGMENT_HEAP_PARAMETERS_VERSION: UInt = 3u

public val SEGMENT_HEAP_PARAMS_VALID_FLAGS: UInt = 1u

public val SEMAPHORE_INCREMENT: UInt = 1u

public val SET_PURGE_FAILURE_MODE_DISABLED: UInt = 2u

public val SE_BACKUP_PRIVILEGES_CHECKED: UInt = 256u

public val SE_DACL_UNTRUSTED: UInt = 64u

public val SE_SERVER_SECURITY: UInt = 128u

public val SPECIAL_ENCRYPTED_OPEN: UInt = 262144u

public val SRV_OPEN_ECP_CONTEXT_VERSION_2: UInt = 2u

public val SUPPORTED_FS_FEATURES_BYPASS_IO: UInt = 8u

public val SUPPORTED_FS_FEATURES_OFFLOAD_READ: UInt = 1u

public val SUPPORTED_FS_FEATURES_OFFLOAD_WRITE: UInt = 2u

public val SUPPORTED_FS_FEATURES_QUERY_OPEN: UInt = 4u

public val SYMLINK_DIRECTORY: UInt = 2147483648u

public val SYMLINK_FILE: UInt = 1073741824u

public val SYMLINK_FLAG_RELATIVE: UInt = 1u

public val SYMLINK_RESERVED_MASK: UInt = 4026531840u

public val SYSTEM_PAGE_PRIORITY_BITS: UInt = 3u

public val SHARED_VIRTUAL_DISK_CDP_SNAPSHOTS_SUPPORTED: SharedVirtualDiskSupportType = 7

public val SHARED_VIRTUAL_DISK_HANDLE_STATE_FILE_SHARED: SharedVirtualDiskHandleState = 1

public val SHARED_VIRTUAL_DISK_HANDLE_STATE_HANDLE_SHARED: SharedVirtualDiskHandleState = 3

public val SHARED_VIRTUAL_DISK_HANDLE_STATE_NONE: SharedVirtualDiskHandleState = 0

public val SHARED_VIRTUAL_DISK_SNAPSHOTS_SUPPORTED: SharedVirtualDiskSupportType = 3

public val SHARED_VIRTUAL_DISKS_SUPPORTED: SharedVirtualDiskSupportType = 1

public val SHARED_VIRTUAL_DISKS_UNSUPPORTED: SharedVirtualDiskSupportType = 0

public val SRV_INSTANCE_TYPE_CSV: SrvInstanceType = 2

public val SRV_INSTANCE_TYPE_PRIMARY: SrvInstanceType = 1

public val SRV_INSTANCE_TYPE_SBL: SrvInstanceType = 3

public val SRV_INSTANCE_TYPE_SR: SrvInstanceType = 4

public val SRV_INSTANCE_TYPE_UNDEFINED: SrvInstanceType = 0

public val SRV_INSTANCE_TYPE_VSMB: SrvInstanceType = 5

public val SYNC_TYPE_CREATE_SECTION: FsFilterSectionSyncType = 1

public val SYNC_TYPE_OTHER: FsFilterSectionSyncType = 0

public val TOKEN_AUDIT_NO_CHILD_PROCESS: UInt = 2097152u

public val TOKEN_AUDIT_REDIRECTION_TRUST: UInt = 8388608u

public val TOKEN_DO_NOT_USE_GLOBAL_ATTRIBS_FOR_QUERY: UInt = 131072u

public val TOKEN_ENFORCE_REDIRECTION_TRUST: UInt = 4194304u

public val TOKEN_HAS_BACKUP_PRIVILEGE: UInt = 2u

public val TOKEN_HAS_IMPERSONATE_PRIVILEGE: UInt = 128u

public val TOKEN_HAS_OWN_CLAIM_ATTRIBUTES: UInt = 32768u

public val TOKEN_HAS_RESTORE_PRIVILEGE: UInt = 4u

public val TOKEN_HAS_TRAVERSE_PRIVILEGE: UInt = 1u

public val TOKEN_IS_FILTERED: UInt = 2048u

public val TOKEN_IS_RESTRICTED: UInt = 16u

public val TOKEN_LEARNING_MODE_LOGGING: UInt = 16777216u

public val TOKEN_LOWBOX: UInt = 16384u

public val TOKEN_NOT_LOW: UInt = 8192u

public val TOKEN_NO_CHILD_PROCESS: UInt = 524288u

public val TOKEN_NO_CHILD_PROCESS_UNLESS_SECURE: UInt = 1048576u

public val TOKEN_PERMISSIVE_LEARNING_MODE: UInt = 50331648u

public val TOKEN_PRIVATE_NAMESPACE: UInt = 65536u

public val TOKEN_SANDBOX_INERT: UInt = 64u

public val TOKEN_SESSION_NOT_REFERENCED: UInt = 32u

public val TOKEN_UIACCESS: UInt = 4096u

public val TOKEN_VIRTUALIZE_ALLOWED: UInt = 512u

public val TOKEN_VIRTUALIZE_ENABLED: UInt = 1024u

public val TOKEN_WRITE_RESTRICTED: UInt = 8u

public val UNINITIALIZE_CACHE_MAPS: UInt = 1u

public val USE_PRIMARY_PASSWORD: UInt = 1u

public val USN_DELETE_FLAG_DELETE: UInt = 1u

public val VACB_MAPPING_GRANULARITY: UInt = 262144u

public val VACB_OFFSET_SHIFT: UInt = 18u

public val VALID_INHERIT_FLAGS: UInt = 31u

public val VOLSNAPCONTROLTYPE: UInt = 83u

public val VM_PREFETCH_INFORMATION: VirtualMemoryInformationClass = 0

public val WCIFS_REDIRECTION_FLAGS_CREATE_SERVICED_FROM_LAYER: UInt = 1u

public val WCIFS_REDIRECTION_FLAGS_CREATE_SERVICED_FROM_REGISTERED_LAYER: UInt = 4u

public val WCIFS_REDIRECTION_FLAGS_CREATE_SERVICED_FROM_REMOTE_LAYER: UInt = 8u

public val WCIFS_REDIRECTION_FLAGS_CREATE_SERVICED_FROM_SCRATCH: UInt = 2u
