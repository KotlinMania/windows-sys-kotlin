package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.s

public val StoragePowerupDeviceAttention: STORAGE_POWERUP_REASON_TYPE = 2

public val StoragePowerupIO: STORAGE_POWERUP_REASON_TYPE = 1

public val StoragePowerupUnknown: STORAGE_POWERUP_REASON_TYPE = 0

public val StorageReserveIdHard: STORAGE_RESERVE_ID = 1

public val StorageReserveIdMax: STORAGE_RESERVE_ID = 4

public val StorageReserveIdNone: STORAGE_RESERVE_ID = 0

public val StorageReserveIdSoft: STORAGE_RESERVE_ID = 2

public val StorageReserveIdUpdateScratch: STORAGE_RESERVE_ID = 3

public val StorageRpmbFrameTypeMax: STORAGE_RPMB_FRAME_TYPE = 2

public val StorageRpmbFrameTypeStandard: STORAGE_RPMB_FRAME_TYPE = 1

public val StorageRpmbFrameTypeUnknown: STORAGE_RPMB_FRAME_TYPE = 0

public val StorageSanitizeMethodBlockErase: STORAGE_SANITIZE_METHOD = 1

public val StorageSanitizeMethodCryptoErase: STORAGE_SANITIZE_METHOD = 2

public val StorageSanitizeMethodDefault: STORAGE_SANITIZE_METHOD = 0

public val StorageTierClassCapacity: STORAGE_TIER_CLASS = 1

public val StorageTierClassMax: STORAGE_TIER_CLASS = 3

public val StorageTierClassPerformance: STORAGE_TIER_CLASS = 2

public val StorageTierClassUnspecified: STORAGE_TIER_CLASS = 0

public val StorageTierMediaTypeDisk: STORAGE_TIER_MEDIA_TYPE = 1

public val StorageTierMediaTypeMax: STORAGE_TIER_MEDIA_TYPE = 5

public val StorageTierMediaTypeScm: STORAGE_TIER_MEDIA_TYPE = 4

public val StorageTierMediaTypeSsd: STORAGE_TIER_MEDIA_TYPE = 2

public val StorageTierMediaTypeUnspecified: STORAGE_TIER_MEDIA_TYPE = 0

public val TAPE_RESET_STATISTICS: Int = 2

public val TAPE_RETURN_ENV_INFO: Int = 1

public val TAPE_RETURN_STATISTICS: Int = 0

public val TCCollectionApplicationRequested: DEVICEDUMP_COLLECTION_TYPEIDE_NOTIFICATION_TYPE = 2

public val TCCollectionBugCheck: DEVICEDUMP_COLLECTION_TYPEIDE_NOTIFICATION_TYPE = 1

public val TCCollectionDeviceRequested: DEVICEDUMP_COLLECTION_TYPEIDE_NOTIFICATION_TYPE = 3

public val TC_DEVICEDUMP_SUBSECTION_DESC_LENGTH: UInt = 16u

public val TC_PUBLIC_DATA_TYPE_ATAGP: PCSTR = s("ATAGPLogPages")

public val TC_PUBLIC_DATA_TYPE_ATASMART: PCSTR = s("ATASMARTPages")

public val TC_PUBLIC_DEVICEDUMP_CONTENT_GPLOG: UInt = 2u

public val TC_PUBLIC_DEVICEDUMP_CONTENT_GPLOG_MAX: UInt = 16u

public val TC_PUBLIC_DEVICEDUMP_CONTENT_SMART: UInt = 1u

public val TELEMETRY_COMMAND_SIZE: UInt = 16u

public val TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY_FLAG_CREATED: UInt = 1u

public val TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY_FLAG_DELETED: UInt = 2u

public val TXFS_LOGGING_MODE_FULL: UInt = 2u

public val TXFS_LOGGING_MODE_SIMPLE: UInt = 1u

public val TXFS_RM_FLAG_DO_NOT_RESET_RM_AT_NEXT_START: TXFS_RMF_LAGS = 32768u

public val TXFS_RM_FLAG_ENFORCE_MINIMUM_SIZE: TXFS_RMF_LAGS = 4096u

public val TXFS_RM_FLAG_GROW_LOG: TXFS_RMF_LAGS = 1024u

public val TXFS_RM_FLAG_LOGGING_MODE: TXFS_RMF_LAGS = 1u

public val TXFS_RM_FLAG_LOG_AUTO_SHRINK_PERCENTAGE: TXFS_RMF_LAGS = 64u

public val TXFS_RM_FLAG_LOG_CONTAINER_COUNT_MAX: TXFS_RMF_LAGS = 4u

public val TXFS_RM_FLAG_LOG_CONTAINER_COUNT_MIN: TXFS_RMF_LAGS = 8u

public val TXFS_RM_FLAG_LOG_GROWTH_INCREMENT_NUM_CONTAINERS: TXFS_RMF_LAGS = 16u

public val TXFS_RM_FLAG_LOG_GROWTH_INCREMENT_PERCENT: TXFS_RMF_LAGS = 32u

public val TXFS_RM_FLAG_LOG_NO_CONTAINER_COUNT_MAX: TXFS_RMF_LAGS = 128u

public val TXFS_RM_FLAG_LOG_NO_CONTAINER_COUNT_MIN: TXFS_RMF_LAGS = 256u

public val TXFS_RM_FLAG_PREFER_AVAILABILITY: TXFS_RMF_LAGS = 131072u

public val TXFS_RM_FLAG_PREFER_CONSISTENCY: TXFS_RMF_LAGS = 65536u

public val TXFS_RM_FLAG_PRESERVE_CHANGES: TXFS_RMF_LAGS = 8192u

public val TXFS_RM_FLAG_RENAME_RM: TXFS_RMF_LAGS = 2u

public val TXFS_RM_FLAG_RESET_RM_AT_NEXT_START: TXFS_RMF_LAGS = 16384u

public val TXFS_RM_FLAG_SHRINK_LOG: TXFS_RMF_LAGS = 2048u

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

public val Travan: STORAGE_MEDIA_TYPE = 34

public val UNDEFINE_ALTERNATE: UInt = 13u

public val UNDEFINE_PRIMARY: UInt = 12u

public val UNLOCK_ELEMENT: UInt = 1u

public val UNRECOVERED_READS_VALID: UInt = 8u

public val UNRECOVERED_WRITES_VALID: UInt = 2u

public val USN_DELETE_FLAG_DELETE: USN_DELETE_FLAGS = 1u

public val USN_DELETE_FLAG_NOTIFY: USN_DELETE_FLAGS = 2u

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

public val USN_SOURCE_AUXILIARY_DATA: USN_SOURCE_INFO_ID = 2u

public val USN_SOURCE_CLIENT_REPLICATION_MANAGEMENT: USN_SOURCE_INFO_ID = 8u

public val USN_SOURCE_DATA_MANAGEMENT: USN_SOURCE_INFO_ID = 1u

public val USN_SOURCE_REPLICATION_MANAGEMENT: USN_SOURCE_INFO_ID = 4u

public val UfsDataTypeMax: STORAGE_PROTOCOL_UFS_DATA_TYPE = 6

public val UfsDataTypeQueryAttribute: STORAGE_PROTOCOL_UFS_DATA_TYPE = 2

public val UfsDataTypeQueryDescriptor: STORAGE_PROTOCOL_UFS_DATA_TYPE = 1

public val UfsDataTypeQueryDmeAttribute: STORAGE_PROTOCOL_UFS_DATA_TYPE = 4

public val UfsDataTypeQueryDmePeerAttribute: STORAGE_PROTOCOL_UFS_DATA_TYPE = 5

public val UfsDataTypeQueryFlag: STORAGE_PROTOCOL_UFS_DATA_TYPE = 3

public val UfsDataTypeUnknown: STORAGE_PROTOCOL_UFS_DATA_TYPE = 0

public val Unknown: MEDIA_TYPE = 0

public val VALID_NTFT: UInt = 192u

public val VENDOR_ID_LENGTH: UInt = 8u

public val VOLUME_IS_DIRTY: UInt = 1u

public val VOLUME_SESSION_OPEN: UInt = 4u

public val VOLUME_UPGRADE_SCHEDULED: UInt = 2u

public val VXATape: STORAGE_MEDIA_TYPE = 94

public val VXATape_1: STORAGE_MEDIA_TYPE = 83

public val VXATape_2: STORAGE_MEDIA_TYPE = 84

public val VirtualStorageBehaviorCacheWriteBack: VIRTUAL_STORAGE_BEHAVIOR_CODE = 2

public val VirtualStorageBehaviorCacheWriteThrough: VIRTUAL_STORAGE_BEHAVIOR_CODE = 1

public val VirtualStorageBehaviorRestartIoProcessing: VIRTUAL_STORAGE_BEHAVIOR_CODE = 4

public val VirtualStorageBehaviorStopIoProcessing: VIRTUAL_STORAGE_BEHAVIOR_CODE = 3

public val VirtualStorageBehaviorUndefined: VIRTUAL_STORAGE_BEHAVIOR_CODE = 0

public val WIM_PROVIDER_CURRENT_VERSION: UInt = 1u

public val WIM_PROVIDER_EXTERNAL_FLAG_NOT_ACTIVE: UInt = 1u

public val WIM_PROVIDER_EXTERNAL_FLAG_SUSPENDED: UInt = 2u

public val WMI_DISK_GEOMETRY_GUID: GUID = GUID.from_u128(U128(0x25007f5157c211d1uL, 0xa52800a0c9062910uL))

public val WOF_CURRENT_VERSION: UInt = 1u

public val WOF_PROVIDER_CLOUD: UInt = 3u

public val WRITE_COMPRESSION_INFO_VALID: UInt = 16u

public val WriteCacheChangeUnknown: WRITE_CACHE_CHANGE = 0

public val WriteCacheChangeable: WRITE_CACHE_CHANGE = 2

public val WriteCacheDisabled: WRITE_CACHE_ENABLE = 1

public val WriteCacheEnableUnknown: WRITE_CACHE_ENABLE = 0

public val WriteCacheEnabled: WRITE_CACHE_ENABLE = 2

public val WriteCacheNotChangeable: WRITE_CACHE_CHANGE = 1

public val WriteCacheTypeNone: WRITE_CACHE_TYPE = 1

public val WriteCacheTypeUnknown: WRITE_CACHE_TYPE = 0

public val WriteCacheTypeWriteBack: WRITE_CACHE_TYPE = 2

public val WriteCacheTypeWriteThrough: WRITE_CACHE_TYPE = 3

public val WriteThroughNotSupported: WRITE_THROUGH = 1

public val WriteThroughSupported: WRITE_THROUGH = 2

public val WriteThroughUnknown: WRITE_THROUGH = 0

public val ZoneConditionClosed: STORAGE_ZONE_CONDITION = 4

public val ZoneConditionConventional: STORAGE_ZONE_CONDITION = 0

public val ZoneConditionEmpty: STORAGE_ZONE_CONDITION = 1

public val ZoneConditionExplicitlyOpened: STORAGE_ZONE_CONDITION = 3

public val ZoneConditionFull: STORAGE_ZONE_CONDITION = 14

public val ZoneConditionImplicitlyOpened: STORAGE_ZONE_CONDITION = 2

public val ZoneConditionOffline: STORAGE_ZONE_CONDITION = 15

public val ZoneConditionReadOnly: STORAGE_ZONE_CONDITION = 13

public val ZoneTypeConventional: STORAGE_ZONE_TYPES = 1

public val ZoneTypeMax: STORAGE_ZONE_TYPES = 4

public val ZoneTypeSequentialWritePreferred: STORAGE_ZONE_TYPES = 3

public val ZoneTypeSequentialWriteRequired: STORAGE_ZONE_TYPES = 2

public val ZoneTypeUnknown: STORAGE_ZONE_TYPES = 0

public val ZonedDeviceTypeDeviceManaged: STORAGE_ZONED_DEVICE_TYPES = 3

public val ZonedDeviceTypeHostAware: STORAGE_ZONED_DEVICE_TYPES = 2

public val ZonedDeviceTypeHostManaged: STORAGE_ZONED_DEVICE_TYPES = 1

public val ZonedDeviceTypeUnknown: STORAGE_ZONED_DEVICE_TYPES = 0

public val ZonesAttributeTypeAndLengthMayDifferent: STORAGE_ZONES_ATTRIBUTES = 0

public val ZonesAttributeTypeMayDifferentLengthSame: STORAGE_ZONES_ATTRIBUTES = 3

public val ZonesAttributeTypeSameLastZoneLengthDifferent: STORAGE_ZONES_ATTRIBUTES = 2

public val ZonesAttributeTypeSameLengthSame: STORAGE_ZONES_ATTRIBUTES = 1
