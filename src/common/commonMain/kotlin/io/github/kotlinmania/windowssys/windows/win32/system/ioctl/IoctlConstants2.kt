package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

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

public val DEVPKEY_STORAGE_DISK_NUMBER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 5u)

public val DEVPKEY_STORAGE_GPT_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 9u)

public val DEVPKEY_STORAGE_GPT_TYPE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 8u)

public val DEVPKEY_STORAGE_MBR_TYPE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 7u)

public val DEVPKEY_STORAGE_PARTITION_NUMBER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 6u)

public val DEVPKEY_STORAGE_PORTABLE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 2u)

public val DEVPKEY_STORAGE_REMOVABLE_MEDIA: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 3u)

public val DEVPKEY_STORAGE_SYSTEM_CRITICAL: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 4u)

public val FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE: Guid = Guid.fromU128(U128(0x9d453eb7d2a64dbduL, 0xa2e3fbd0ed9109a9uL))

public val FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE: Guid = Guid.fromU128(U128(0xb7624d64b9a34cf8uL, 0x80115b86c940e7b7uL))

public val FILE_TYPE_NOTIFICATION_GUID_PAGE_FILE: Guid = Guid.fromU128(U128(0xd0a64a138fc4db8uL, 0x9fe73f4352cd7c5cuL))

public val GUID_DEVICEDUMP_DRIVER_STORAGE_PORT: Guid = Guid.fromU128(U128(0xda82441d71424bc1uL, 0xb8440807c5a4b67fuL))

public val GUID_DEVICEDUMP_STORAGE_DEVICE: Guid = Guid.fromU128(U128(0xd8e2592f1aab4d56uL, 0xa7461f7585df40f4uL))

public val GUID_DEVINTERFACE_CDCHANGER: Guid = Guid.fromU128(U128(0x53f56312b6bf11d0uL, 0x94f200a0c91efb8buL))

public val GUID_DEVINTERFACE_CDROM: Guid = Guid.fromU128(U128(0x53f56308b6bf11d0uL, 0x94f200a0c91efb8buL))

public val GUID_DEVINTERFACE_COMPORT: Guid = Guid.fromU128(U128(0x86e0d1e0808911d0uL, 0x9ce408003e301f73uL))

public val GUID_DEVINTERFACE_DISK: Guid = Guid.fromU128(U128(0x53f56307b6bf11d0uL, 0x94f200a0c91efb8buL))

public val GUID_DEVINTERFACE_FLOPPY: Guid = Guid.fromU128(U128(0x53f56311b6bf11d0uL, 0x94f200a0c91efb8buL))

public val GUID_DEVINTERFACE_HIDDEN_VOLUME: Guid = Guid.fromU128(U128(0x7f108a2898334b3buL, 0xb7802c6b5fa5c062uL))

public val GUID_DEVINTERFACE_MEDIUMCHANGER: Guid = Guid.fromU128(U128(0x53f56310b6bf11d0uL, 0x94f200a0c91efb8buL))

public val GUID_DEVINTERFACE_PARTITION: Guid = Guid.fromU128(U128(0x53f5630ab6bf11d0uL, 0x94f200a0c91efb8buL))

public val GUID_DEVINTERFACE_SCM_PHYSICAL_DEVICE: Guid = Guid.fromU128(U128(0x4283609d4dc243beuL, 0xbbb44f15dfce2c61uL))

public val GUID_DEVINTERFACE_SERENUM_BUS_ENUMERATOR: Guid = Guid.fromU128(U128(0x4d36e978e32511ceuL, 0xbfc108002be10318uL))

public val GUID_DEVINTERFACE_SERVICE_VOLUME: Guid = Guid.fromU128(U128(0x6ead3d8225ec46bcuL, 0xb7fdc1f0df8f5037uL))

public val GUID_DEVINTERFACE_SES: Guid = Guid.fromU128(U128(0x1790c9ec47d54df3uL, 0xb5af9adf3cf23e48uL))

public val GUID_DEVINTERFACE_STORAGEPORT: Guid = Guid.fromU128(U128(0x2accfe60c13011d2uL, 0xb08200a0c91efb8buL))

public val GUID_DEVINTERFACE_TAPE: Guid = Guid.fromU128(U128(0x53f5630bb6bf11d0uL, 0x94f200a0c91efb8buL))

public val GUID_DEVINTERFACE_UNIFIED_ACCESS_RPMB: Guid = Guid.fromU128(U128(0x27447c21bcc34d07uL, 0xa05ba3395bb4eee7uL))

public val GUID_DEVINTERFACE_VMLUN: Guid = Guid.fromU128(U128(0x6f4166199f2942a5uL, 0xb20b37e219ca02b0uL))

public val GUID_DEVINTERFACE_VOLUME: Guid = Guid.fromU128(U128(0x53f5630db6bf11d0uL, 0x94f200a0c91efb8buL))

public val GUID_DEVINTERFACE_WRITEONCEDISK: Guid = Guid.fromU128(U128(0x53f5630cb6bf11d0uL, 0x94f200a0c91efb8buL))

public val GUID_DEVINTERFACE_ZNSDISK: Guid = Guid.fromU128(U128(0xb87941c5ffdb43c7uL, 0xb6b120b632f0b109uL))

public val GUID_SCM_PD_HEALTH_NOTIFICATION: Guid = Guid.fromU128(U128(0x9da2d38672f54ee3uL, 0x8155eca0678e3b06uL))

public val GUID_SCM_PD_PASSTHROUGH_INVDIMM: Guid = Guid.fromU128(U128(0x4309ac300d1111e4uL, 0x91910800200c9a66uL))

public val WMI_DISK_GEOMETRY_GUID: Guid = Guid.fromU128(U128(0x25007f5157c211d1uL, 0xa52800a0c9062910uL))
