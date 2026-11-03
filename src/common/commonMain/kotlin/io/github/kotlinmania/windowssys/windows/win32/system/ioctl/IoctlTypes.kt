package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

public typealias BIN_TYPES = Int

public typealias CHANGER_DEVICE_PROBLEM_TYPE = Int

public typealias CHANGER_ELEMENT_STATUS_FLAGS = UInt

public typealias CHANGER_FEATURES = UInt

public typealias CSVFS_DISK_CONNECTIVITY = Int

public typealias CSV_CONTROL_OP = Int

public typealias DETECTION_TYPE = Int

public typealias DEVICEDUMP_COLLECTION_TYPEIDE_NOTIFICATION_TYPE = Int

public typealias DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE = Int

public typealias DEVICE_INTERNAL_STATUS_DATA_SET = Int

public typealias DISK_CACHE_RETENTION_PRIORITY = Int

public typealias DUPLICATE_EXTENTS_STATE = Int

public typealias ELEMENT_TYPE = Int

public typealias FILESYSTEM_STATISTICS_TYPE = UShort

public typealias FILE_STORAGE_TIER_CLASS = Int

public typealias FILE_STORAGE_TIER_FLAGS = UInt

public typealias FILE_STORAGE_TIER_MEDIA_TYPE = Int

public typealias FS_BPIO_INFLAGS = Int

public typealias FS_BPIO_OPERATIONS = Int

public typealias FS_BPIO_OUTFLAGS = Int

public typealias GET_CHANGER_PARAMETERS_FEATURES1 = UInt

public typealias GPT_ATTRIBUTES = ULong

public typealias LMR_QUERY_INFO_CLASS = Int

public typealias MEDIA_TYPE = Int

public typealias PARTITION_STYLE = Int

public fun interface PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACKFn {
    public operator fun invoke(sourcecontext: Long, targetcontext: Long, relativeoffset: Long)
}

public typealias PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK = PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACKFn?

public typealias QUERY_FILE_LAYOUT_FILTER_TYPE = Int

public typealias REFS_SMR_VOLUME_GC_ACTION = Int

public typealias REFS_SMR_VOLUME_GC_METHOD = Int

public typealias REFS_SMR_VOLUME_GC_STATE = Int

public typealias SCM_BUS_FIRMWARE_ACTIVATION_STATE = Int

public typealias SCM_BUS_PROPERTY_ID = Int

public typealias SCM_BUS_QUERY_TYPE = Int

public typealias SCM_BUS_SET_TYPE = Int

public typealias SCM_PD_FIRMWARE_ACTIVATION_STATE = Int

public typealias SCM_PD_HEALTH_STATUS = Int

public typealias SCM_PD_LAST_FW_ACTIVATION_STATUS = Int

public typealias SCM_PD_MEDIA_REINITIALIZATION_STATUS = Int

public typealias SCM_PD_OPERATIONAL_STATUS = Int

public typealias SCM_PD_OPERATIONAL_STATUS_REASON = Int

public typealias SCM_PD_PROPERTY_ID = Int

public typealias SCM_PD_QUERY_TYPE = Int

public typealias SCM_PD_SET_TYPE = Int

public typealias SCM_REGION_FLAG = Int

public typealias SHRINK_VOLUME_REQUEST_TYPES = Int

public typealias STORAGE_ASSOCIATION_TYPE = Int

public typealias STORAGE_ATTRIBUTE_MGMT_ACTION = Int

public typealias STORAGE_COMPONENT_HEALTH_STATUS = Int

public typealias STORAGE_COUNTER_TYPE = Int

public typealias STORAGE_CRYPTO_ALGORITHM_ID = Int

public typealias STORAGE_CRYPTO_KEY_SIZE = Int

public typealias STORAGE_DEVICE_FORM_FACTOR = Int

public typealias STORAGE_DEVICE_POWER_CAP_UNITS = Int

public typealias STORAGE_DIAGNOSTIC_LEVEL = Int

public typealias STORAGE_DIAGNOSTIC_TARGET_TYPE = Int

public typealias STORAGE_DISK_HEALTH_STATUS = Int

public typealias STORAGE_DISK_OPERATIONAL_STATUS = Int

public typealias STORAGE_ENCRYPTION_TYPE = Int

public typealias STORAGE_IDENTIFIER_CODE_SET = Int

public typealias STORAGE_IDENTIFIER_TYPE = Int

public typealias STORAGE_ID_NAA_FORMAT = Int

public typealias STORAGE_MEDIA_TYPE = Int

public typealias STORAGE_OPERATIONAL_STATUS_REASON = Int

public typealias STORAGE_PORT_CODE_SET = Int

public typealias STORAGE_POWERUP_REASON_TYPE = Int

public typealias STORAGE_PROPERTY_ID = Int

public typealias STORAGE_PROTOCOL_ATA_DATA_TYPE = Int

public typealias STORAGE_PROTOCOL_NVME_DATA_TYPE = Int

public typealias STORAGE_PROTOCOL_TYPE = Int

public typealias STORAGE_PROTOCOL_UFS_DATA_TYPE = Int

public typealias STORAGE_QUERY_TYPE = Int

public typealias STORAGE_RESERVE_ID = Int

public typealias STORAGE_RPMB_COMMAND_TYPE = Int

public typealias STORAGE_RPMB_FRAME_TYPE = Int

public typealias STORAGE_SANITIZE_METHOD = Int

public typealias STORAGE_SET_TYPE = Int

public typealias STORAGE_TIER_CLASS = Int

public typealias STORAGE_TIER_MEDIA_TYPE = Int

public typealias STORAGE_ZONED_DEVICE_TYPES = Int

public typealias STORAGE_ZONES_ATTRIBUTES = Int

public typealias STORAGE_ZONE_CONDITION = Int

public typealias STORAGE_ZONE_TYPES = Int

public typealias TXFS_RMF_LAGS = UInt

public typealias USN_DELETE_FLAGS = UInt

public typealias USN_SOURCE_INFO_ID = UInt

public typealias VIRTUAL_STORAGE_BEHAVIOR_CODE = Int

public typealias WRITE_CACHE_CHANGE = Int

public typealias WRITE_CACHE_ENABLE = Int

public typealias WRITE_CACHE_TYPE = Int

public typealias WRITE_THROUGH = Int
