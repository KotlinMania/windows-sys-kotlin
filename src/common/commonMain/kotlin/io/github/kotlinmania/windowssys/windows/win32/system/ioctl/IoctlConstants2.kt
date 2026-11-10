package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.s

public val STORAGE_POWERUP_DEVICE_ATTENTION: StoragePowerupReasonType = 2

public val STORAGE_POWERUP_IO: StoragePowerupReasonType = 1

public val STORAGE_POWERUP_UNKNOWN: StoragePowerupReasonType = 0

public val STORAGE_RESERVE_ID_HARD: StorageReserveId = 1

public val STORAGE_RESERVE_ID_MAX: StorageReserveId = 4

public val STORAGE_RESERVE_ID_NONE: StorageReserveId = 0

public val STORAGE_RESERVE_ID_SOFT: StorageReserveId = 2

public val STORAGE_RESERVE_ID_UPDATE_SCRATCH: StorageReserveId = 3

public val STORAGE_RPMB_FRAME_TYPE_MAX: StorageRpmbFrameType = 2

public val STORAGE_RPMB_FRAME_TYPE_STANDARD: StorageRpmbFrameType = 1

public val STORAGE_RPMB_FRAME_TYPE_UNKNOWN: StorageRpmbFrameType = 0

public val STORAGE_SANITIZE_METHOD_BLOCK_ERASE: StorageSanitizeMethod = 1

public val STORAGE_SANITIZE_METHOD_CRYPTO_ERASE: StorageSanitizeMethod = 2

public val STORAGE_SANITIZE_METHOD_DEFAULT: StorageSanitizeMethod = 0

public val STORAGE_TIER_CLASS_CAPACITY: StorageTierClass = 1

public val STORAGE_TIER_CLASS_MAX: StorageTierClass = 3

public val STORAGE_TIER_CLASS_PERFORMANCE: StorageTierClass = 2

public val STORAGE_TIER_CLASS_UNSPECIFIED: StorageTierClass = 0

public val STORAGE_TIER_MEDIA_TYPE_DISK: StorageTierMediaType = 1

public val STORAGE_TIER_MEDIA_TYPE_MAX: StorageTierMediaType = 5

public val STORAGE_TIER_MEDIA_TYPE_SCM: StorageTierMediaType = 4

public val STORAGE_TIER_MEDIA_TYPE_SSD: StorageTierMediaType = 2

public val STORAGE_TIER_MEDIA_TYPE_UNSPECIFIED: StorageTierMediaType = 0

public val TAPE_RESET_STATISTICS: Int = 2

public val TAPE_RETURN_ENV_INFO: Int = 1

public val TAPE_RETURN_STATISTICS: Int = 0

public val TC_COLLECTION_APPLICATION_REQUESTED: DevicedumpCollectionTypeideNotificationType = 2

public val TC_COLLECTION_BUG_CHECK: DevicedumpCollectionTypeideNotificationType = 1

public val TC_COLLECTION_DEVICE_REQUESTED: DevicedumpCollectionTypeideNotificationType = 3

public val TC_DEVICEDUMP_SUBSECTION_DESC_LENGTH: UInt = 16u

public val TC_PUBLIC_DATA_TYPE_ATAGP: Pcstr = s("ATAGPLogPages")

public val TC_PUBLIC_DATA_TYPE_ATASMART: Pcstr = s("ATASMARTPages")

public val TC_PUBLIC_DEVICEDUMP_CONTENT_GPLOG: UInt = 2u

public val TC_PUBLIC_DEVICEDUMP_CONTENT_GPLOG_MAX: UInt = 16u

public val TC_PUBLIC_DEVICEDUMP_CONTENT_SMART: UInt = 1u

public val TELEMETRY_COMMAND_SIZE: UInt = 16u

public val TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY_FLAG_CREATED: UInt = 1u

public val TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY_FLAG_DELETED: UInt = 2u

public val TXFS_LOGGING_MODE_FULL: UInt = 2u

public val TXFS_LOGGING_MODE_SIMPLE: UInt = 1u

public val TXFS_RM_FLAG_DO_NOT_RESET_RM_AT_NEXT_START: TxfsRmfLags = 32768u

public val TXFS_RM_FLAG_ENFORCE_MINIMUM_SIZE: TxfsRmfLags = 4096u

public val TXFS_RM_FLAG_GROW_LOG: TxfsRmfLags = 1024u

public val TXFS_RM_FLAG_LOGGING_MODE: TxfsRmfLags = 1u

public val TXFS_RM_FLAG_LOG_AUTO_SHRINK_PERCENTAGE: TxfsRmfLags = 64u

public val TXFS_RM_FLAG_LOG_CONTAINER_COUNT_MAX: TxfsRmfLags = 4u

public val TXFS_RM_FLAG_LOG_CONTAINER_COUNT_MIN: TxfsRmfLags = 8u

public val TXFS_RM_FLAG_LOG_GROWTH_INCREMENT_NUM_CONTAINERS: TxfsRmfLags = 16u

public val TXFS_RM_FLAG_LOG_GROWTH_INCREMENT_PERCENT: TxfsRmfLags = 32u

public val TXFS_RM_FLAG_LOG_NO_CONTAINER_COUNT_MAX: TxfsRmfLags = 128u

public val TXFS_RM_FLAG_LOG_NO_CONTAINER_COUNT_MIN: TxfsRmfLags = 256u

public val TXFS_RM_FLAG_PREFER_AVAILABILITY: TxfsRmfLags = 131072u

public val TXFS_RM_FLAG_PREFER_CONSISTENCY: TxfsRmfLags = 65536u

public val TXFS_RM_FLAG_PRESERVE_CHANGES: TxfsRmfLags = 8192u

public val TXFS_RM_FLAG_RENAME_RM: TxfsRmfLags = 2u

public val TXFS_RM_FLAG_RESET_RM_AT_NEXT_START: TxfsRmfLags = 16384u

public val TXFS_RM_FLAG_SHRINK_LOG: TxfsRmfLags = 2048u

public val TXFS_RM_STATE_ACTIVE: UInt = 2u

public val TXFS_RM_STATE_NOT_STARTED: UInt = 0u

public val TXFS_RM_STATE_SHUTTING_DOWN: UInt = 3u

public val TXFS_RM_STATE_STARTING: UInt = 1u

public val TXFS_ROLLFORWARD_REDO_FLAG_USE_LAST_REDO_LSN: UInt = 1u

public val TXFS_ROLLFORWARD_REDO_FLAG_USE_LAST_VIRTUAL_CLOCK: UInt = 2u

public val TXFS_SAVEPOINT_CLEAR: UInt = 4u

public val TXFS_SAVEPOINT_CLEAR_ALL: UInt = 16u

public val TXFS_SAVEPOINT_ROLLBACK: UInt = 2u

public val TXFS_SAVEPOINT_SET: UInt = 1u

public val TXFS_START_RM_FLAG_LOGGING_MODE: UInt = 1024u

public val TXFS_START_RM_FLAG_LOG_AUTO_SHRINK_PERCENTAGE: UInt = 32u

public val TXFS_START_RM_FLAG_LOG_CONTAINER_COUNT_MAX: UInt = 1u

public val TXFS_START_RM_FLAG_LOG_CONTAINER_COUNT_MIN: UInt = 2u

public val TXFS_START_RM_FLAG_LOG_CONTAINER_SIZE: UInt = 4u

public val TXFS_START_RM_FLAG_LOG_GROWTH_INCREMENT_NUM_CONTAINERS: UInt = 8u

public val TXFS_START_RM_FLAG_LOG_GROWTH_INCREMENT_PERCENT: UInt = 16u

public val TXFS_START_RM_FLAG_LOG_NO_CONTAINER_COUNT_MAX: UInt = 64u

public val TXFS_START_RM_FLAG_LOG_NO_CONTAINER_COUNT_MIN: UInt = 128u

public val TXFS_START_RM_FLAG_PREFER_AVAILABILITY: UInt = 8192u

public val TXFS_START_RM_FLAG_PREFER_CONSISTENCY: UInt = 4096u

public val TXFS_START_RM_FLAG_PRESERVE_CHANGES: UInt = 2048u

public val TXFS_START_RM_FLAG_RECOVER_BEST_EFFORT: UInt = 512u

public val TXFS_TRANSACTED_VERSION_NONTRANSACTED: UInt = 4294967294u

public val TXFS_TRANSACTED_VERSION_UNCOMMITTED: UInt = 4294967295u

public val TXFS_TRANSACTION_STATE_ACTIVE: UInt = 1u

public val TXFS_TRANSACTION_STATE_NONE: UInt = 0u

public val TXFS_TRANSACTION_STATE_NOTACTIVE: UInt = 3u

public val TXFS_TRANSACTION_STATE_PREPARED: UInt = 2u

public val TRAVAN: StorageMediaType = 34

public val UNDEFINE_ALTERNATE: UInt = 13u

public val UNDEFINE_PRIMARY: UInt = 12u

public val UNLOCK_ELEMENT: UInt = 1u

public val UNRECOVERED_READS_VALID: UInt = 8u

public val UNRECOVERED_WRITES_VALID: UInt = 2u

public val USN_DELETE_FLAG_DELETE: UsnDeleteFlags = 1u

public val USN_DELETE_FLAG_NOTIFY: UsnDeleteFlags = 2u

public val USN_DELETE_VALID_FLAGS: UInt = 3u

public val USN_PAGE_SIZE: UInt = 4096u

public val USN_REASON_BASIC_INFO_CHANGE: UInt = 32768u

public val USN_REASON_CLOSE: UInt = 2147483648u

public val USN_REASON_COMPRESSION_CHANGE: UInt = 131072u

public val USN_REASON_DATA_EXTEND: UInt = 2u

public val USN_REASON_DATA_OVERWRITE: UInt = 1u

public val USN_REASON_DATA_TRUNCATION: UInt = 4u

public val USN_REASON_DESIRED_STORAGE_CLASS_CHANGE: UInt = 16777216u

public val USN_REASON_EA_CHANGE: UInt = 1024u

public val USN_REASON_ENCRYPTION_CHANGE: UInt = 262144u

public val USN_REASON_FILE_CREATE: UInt = 256u

public val USN_REASON_FILE_DELETE: UInt = 512u

public val USN_REASON_HARD_LINK_CHANGE: UInt = 65536u

public val USN_REASON_INDEXABLE_CHANGE: UInt = 16384u

public val USN_REASON_INTEGRITY_CHANGE: UInt = 8388608u

public val USN_REASON_NAMED_DATA_EXTEND: UInt = 32u

public val USN_REASON_NAMED_DATA_OVERWRITE: UInt = 16u

public val USN_REASON_NAMED_DATA_TRUNCATION: UInt = 64u

public val USN_REASON_OBJECT_ID_CHANGE: UInt = 524288u

public val USN_REASON_RENAME_NEW_NAME: UInt = 8192u

public val USN_REASON_RENAME_OLD_NAME: UInt = 4096u

public val USN_REASON_REPARSE_POINT_CHANGE: UInt = 1048576u

public val USN_REASON_SECURITY_CHANGE: UInt = 2048u

public val USN_REASON_STREAM_CHANGE: UInt = 2097152u

public val USN_REASON_TRANSACTED_CHANGE: UInt = 4194304u

public val USN_SOURCE_AUXILIARY_DATA: UsnSourceInfoId = 2u

public val USN_SOURCE_CLIENT_REPLICATION_MANAGEMENT: UsnSourceInfoId = 8u

public val USN_SOURCE_DATA_MANAGEMENT: UsnSourceInfoId = 1u

public val USN_SOURCE_REPLICATION_MANAGEMENT: UsnSourceInfoId = 4u

public val UFS_DATA_TYPE_MAX: StorageProtocolUfsDataType = 6

public val UFS_DATA_TYPE_QUERY_ATTRIBUTE: StorageProtocolUfsDataType = 2

public val UFS_DATA_TYPE_QUERY_DESCRIPTOR: StorageProtocolUfsDataType = 1

public val UFS_DATA_TYPE_QUERY_DME_ATTRIBUTE: StorageProtocolUfsDataType = 4

public val UFS_DATA_TYPE_QUERY_DME_PEER_ATTRIBUTE: StorageProtocolUfsDataType = 5

public val UFS_DATA_TYPE_QUERY_FLAG: StorageProtocolUfsDataType = 3

public val UFS_DATA_TYPE_UNKNOWN: StorageProtocolUfsDataType = 0

public val UNKNOWN: MediaType = 0

public val VALID_NTFT: UInt = 192u

public val VENDOR_ID_LENGTH: UInt = 8u

public val VOLUME_IS_DIRTY: UInt = 1u

public val VOLUME_SESSION_OPEN: UInt = 4u

public val VOLUME_UPGRADE_SCHEDULED: UInt = 2u

public val VXA_TAPE: StorageMediaType = 94

public val VXA_TAPE_1: StorageMediaType = 83

public val VXA_TAPE_2: StorageMediaType = 84

public val VIRTUAL_STORAGE_BEHAVIOR_CACHE_WRITE_BACK: VirtualStorageBehaviorCode = 2

public val VIRTUAL_STORAGE_BEHAVIOR_CACHE_WRITE_THROUGH: VirtualStorageBehaviorCode = 1

public val VIRTUAL_STORAGE_BEHAVIOR_RESTART_IO_PROCESSING: VirtualStorageBehaviorCode = 4

public val VIRTUAL_STORAGE_BEHAVIOR_STOP_IO_PROCESSING: VirtualStorageBehaviorCode = 3

public val VIRTUAL_STORAGE_BEHAVIOR_UNDEFINED: VirtualStorageBehaviorCode = 0

public val WIM_PROVIDER_CURRENT_VERSION: UInt = 1u

public val WIM_PROVIDER_EXTERNAL_FLAG_NOT_ACTIVE: UInt = 1u

public val WIM_PROVIDER_EXTERNAL_FLAG_SUSPENDED: UInt = 2u

public val WMI_DISK_GEOMETRY_GUID: Guid = Guid.fromU128(U128(0x25007f5157c211d1uL, 0xa52800a0c9062910uL))

public val WOF_CURRENT_VERSION: UInt = 1u

public val WOF_PROVIDER_CLOUD: UInt = 3u

public val WRITE_COMPRESSION_INFO_VALID: UInt = 16u

public val WRITE_CACHE_CHANGE_UNKNOWN: WriteCacheChange = 0

public val WRITE_CACHE_CHANGEABLE: WriteCacheChange = 2

public val WRITE_CACHE_DISABLED: WriteCacheEnable = 1

public val WRITE_CACHE_ENABLE_UNKNOWN: WriteCacheEnable = 0

public val WRITE_CACHE_ENABLED: WriteCacheEnable = 2

public val WRITE_CACHE_NOT_CHANGEABLE: WriteCacheChange = 1

public val WRITE_CACHE_TYPE_NONE: WriteCacheType = 1

public val WRITE_CACHE_TYPE_UNKNOWN: WriteCacheType = 0

public val WRITE_CACHE_TYPE_WRITE_BACK: WriteCacheType = 2

public val WRITE_CACHE_TYPE_WRITE_THROUGH: WriteCacheType = 3

public val WRITE_THROUGH_NOT_SUPPORTED: WriteThrough = 1

public val WRITE_THROUGH_SUPPORTED: WriteThrough = 2

public val WRITE_THROUGH_UNKNOWN: WriteThrough = 0

public val ZONE_CONDITION_CLOSED: StorageZoneCondition = 4

public val ZONE_CONDITION_CONVENTIONAL: StorageZoneCondition = 0

public val ZONE_CONDITION_EMPTY: StorageZoneCondition = 1

public val ZONE_CONDITION_EXPLICITLY_OPENED: StorageZoneCondition = 3

public val ZONE_CONDITION_FULL: StorageZoneCondition = 14

public val ZONE_CONDITION_IMPLICITLY_OPENED: StorageZoneCondition = 2

public val ZONE_CONDITION_OFFLINE: StorageZoneCondition = 15

public val ZONE_CONDITION_READ_ONLY: StorageZoneCondition = 13

public val ZONE_TYPE_CONVENTIONAL: StorageZoneTypes = 1

public val ZONE_TYPE_MAX: StorageZoneTypes = 4

public val ZONE_TYPE_SEQUENTIAL_WRITE_PREFERRED: StorageZoneTypes = 3

public val ZONE_TYPE_SEQUENTIAL_WRITE_REQUIRED: StorageZoneTypes = 2

public val ZONE_TYPE_UNKNOWN: StorageZoneTypes = 0

public val ZONED_DEVICE_TYPE_DEVICE_MANAGED: StorageZonedDeviceTypes = 3

public val ZONED_DEVICE_TYPE_HOST_AWARE: StorageZonedDeviceTypes = 2

public val ZONED_DEVICE_TYPE_HOST_MANAGED: StorageZonedDeviceTypes = 1

public val ZONED_DEVICE_TYPE_UNKNOWN: StorageZonedDeviceTypes = 0

public val ZONES_ATTRIBUTE_TYPE_AND_LENGTH_MAY_DIFFERENT: StorageZonesAttributes = 0

public val ZONES_ATTRIBUTE_TYPE_MAY_DIFFERENT_LENGTH_SAME: StorageZonesAttributes = 3

public val ZONES_ATTRIBUTE_TYPE_SAME_LAST_ZONE_LENGTH_DIFFERENT: StorageZonesAttributes = 2

public val ZONES_ATTRIBUTE_TYPE_SAME_LENGTH_SAME: StorageZonesAttributes = 1
