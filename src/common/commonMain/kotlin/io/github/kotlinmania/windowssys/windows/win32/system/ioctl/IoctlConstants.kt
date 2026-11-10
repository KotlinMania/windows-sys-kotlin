package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public val ABL_5_WO: StorageMediaType = 64

public val ADR_1: StorageMediaType = 90

public val ADR_2: StorageMediaType = 91

public val AIT1_8MM: StorageMediaType = 38

public val AIT_8MM: StorageMediaType = 89

public val AME_8MM: StorageMediaType = 37

public val ASSERT_ALTERNATE: UInt = 9u

public val ASSERT_PRIMARY: UInt = 8u

public val ATAPI_ID_CMD: UInt = 161u

public val AVATAR_F2: StorageMediaType = 78

public val ALL_ELEMENTS: ElementType = 0

public val ATA_DATA_TYPE_IDENTIFY: StorageProtocolAtaDataType = 1

public val ATA_DATA_TYPE_LOG_PAGE: StorageProtocolAtaDataType = 2

public val ATA_DATA_TYPE_UNKNOWN: StorageProtocolAtaDataType = 0

public val CAP_ATAPI_ID_CMD: UInt = 2u

public val CAP_ATA_ID_CMD: UInt = 1u

public val CAP_SMART_CMD: UInt = 4u

public val CDB_SIZE: UInt = 16u

public val CD_R: StorageMediaType = 52

public val CD_ROM: StorageMediaType = 51

public val CD_RW: StorageMediaType = 53

public val CHANGER_BAR_CODE_SCANNER_INSTALLED: ChangerFeatures = 1u

public val CHANGER_CARTRIDGE_MAGAZINE: ChangerFeatures = 256u

public val CHANGER_CLEANER_ACCESS_NOT_VALID: ChangerFeatures = 262144u

public val CHANGER_CLEANER_AUTODISMOUNT: GetChangerParametersFeatures1 = 2147483652u

public val CHANGER_CLEANER_OPS_NOT_SUPPORTED: GetChangerParametersFeatures1 = 2147483712u

public val CHANGER_CLEANER_SLOT: ChangerFeatures = 64u

public val CHANGER_CLOSE_IEPORT: ChangerFeatures = 4u

public val CHANGER_DEVICE_REINITIALIZE_CAPABLE: ChangerFeatures = 134217728u

public val CHANGER_DRIVE_CLEANING_REQUIRED: ChangerFeatures = 65536u

public val CHANGER_DRIVE_EMPTY_ON_DOOR_ACCESS: ChangerFeatures = 536870912u

public val CHANGER_EXCHANGE_MEDIA: ChangerFeatures = 32u

public val CHANGER_IEPORT_USER_CONTROL_CLOSE: GetChangerParametersFeatures1 = 2147483904u

public val CHANGER_IEPORT_USER_CONTROL_OPEN: GetChangerParametersFeatures1 = 2147483776u

public val CHANGER_INIT_ELEM_STAT_WITH_RANGE: ChangerFeatures = 2u

public val CHANGER_KEYPAD_ENABLE_DISABLE: ChangerFeatures = 268435456u

public val CHANGER_LOCK_UNLOCK: ChangerFeatures = 128u

public val CHANGER_MEDIUM_FLIP: ChangerFeatures = 512u

public val CHANGER_MOVE_EXTENDS_IEPORT: GetChangerParametersFeatures1 = 2147484160u

public val CHANGER_MOVE_RETRACTS_IEPORT: GetChangerParametersFeatures1 = 2147484672u

public val CHANGER_OPEN_IEPORT: ChangerFeatures = 8u

public val CHANGER_POSITION_TO_ELEMENT: ChangerFeatures = 1024u

public val CHANGER_PREDISMOUNT_ALIGN_TO_DRIVE: GetChangerParametersFeatures1 = 2147483650u

public val CHANGER_PREDISMOUNT_ALIGN_TO_SLOT: GetChangerParametersFeatures1 = 2147483649u

public val CHANGER_PREDISMOUNT_EJECT_REQUIRED: ChangerFeatures = 131072u

public val CHANGER_PREMOUNT_EJECT_REQUIRED: ChangerFeatures = 524288u

public val CHANGER_REPORT_IEPORT_STATE: ChangerFeatures = 2048u

public val CHANGER_RESERVED_BIT: UInt = 2147483648u

public val CHANGER_RTN_MEDIA_TO_ORIGINAL_ADDR: GetChangerParametersFeatures1 = 2147483680u

public val CHANGER_SERIAL_NUMBER_VALID: ChangerFeatures = 67108864u

public val CHANGER_SLOTS_USE_TRAYS: GetChangerParametersFeatures1 = 2147483664u

public val CHANGER_STATUS_NON_VOLATILE: ChangerFeatures = 16u

public val CHANGER_STORAGE_DRIVE: ChangerFeatures = 4096u

public val CHANGER_STORAGE_IEPORT: ChangerFeatures = 8192u

public val CHANGER_STORAGE_SLOT: ChangerFeatures = 16384u

public val CHANGER_STORAGE_TRANSPORT: ChangerFeatures = 32768u

public val CHANGER_TO_DRIVE: UInt = 8u

public val CHANGER_TO_IEPORT: UInt = 4u

public val CHANGER_TO_SLOT: UInt = 2u

public val CHANGER_TO_TRANSPORT: UInt = 1u

public val CHANGER_TRUE_EXCHANGE_CAPABLE: GetChangerParametersFeatures1 = 2147483656u

public val CHANGER_VOLUME_ASSERT: ChangerFeatures = 4194304u

public val CHANGER_VOLUME_IDENTIFICATION: ChangerFeatures = 1048576u

public val CHANGER_VOLUME_REPLACE: ChangerFeatures = 8388608u

public val CHANGER_VOLUME_SEARCH: ChangerFeatures = 2097152u

public val CHANGER_VOLUME_UNDEFINE: ChangerFeatures = 16777216u

public val CHECKSUM_TYPE_CRC32: UInt = 1u

public val CHECKSUM_TYPE_CRC64: UInt = 2u

public val CHECKSUM_TYPE_ECC: UInt = 3u

public val CHECKSUM_TYPE_FIRST_UNUSED_TYPE: UInt = 5u

public val CHECKSUM_TYPE_NONE: UInt = 0u

public val CHECKSUM_TYPE_SHA256: UInt = 4u

public val CLEANER_CARTRIDGE: StorageMediaType = 50

public val CONTAINER_ROOT_INFO_FLAG_BIND_DO_NOT_MAP_NAME: UInt = 256u

public val CONTAINER_ROOT_INFO_FLAG_BIND_EXCEPTION_ROOT: UInt = 128u

public val CONTAINER_ROOT_INFO_FLAG_BIND_ROOT: UInt = 32u

public val CONTAINER_ROOT_INFO_FLAG_BIND_TARGET_ROOT: UInt = 64u

public val CONTAINER_ROOT_INFO_FLAG_LAYER_ROOT: UInt = 2u

public val CONTAINER_ROOT_INFO_FLAG_SCRATCH_ROOT: UInt = 1u

public val CONTAINER_ROOT_INFO_FLAG_UNION_LAYER_ROOT: UInt = 512u

public val CONTAINER_ROOT_INFO_FLAG_VIRTUALIZATION_EXCEPTION_ROOT: UInt = 16u

public val CONTAINER_ROOT_INFO_FLAG_VIRTUALIZATION_ROOT: UInt = 4u

public val CONTAINER_ROOT_INFO_FLAG_VIRTUALIZATION_TARGET_ROOT: UInt = 8u

public val CONTAINER_ROOT_INFO_VALID_FLAGS: UInt = 1023u

public val CONTAINER_VOLUME_STATE_HOSTING_CONTAINER: UInt = 1u

public val COPYFILE_SIS_FLAGS: UInt = 3u

public val COPYFILE_SIS_LINK: UInt = 1u

public val COPYFILE_SIS_REPLACE: UInt = 2u

public val CSV_INVALID_DEVICE_NUMBER: UInt = 4294967295u

public val CSV_MGMTLOCK_CHECK_VOLUME_REDIRECTED: UInt = 1u

public val CSV_QUERY_MDS_PATH_FLAG_CSV_DIRECT_IO_ENABLED: UInt = 2u

public val CSV_QUERY_MDS_PATH_FLAG_SMB_BYPASS_CSV_ENABLED: UInt = 4u

public val CSV_QUERY_MDS_PATH_FLAG_STORAGE_ON_THIS_NODE_IS_CONNECTED: UInt = 1u

public val CSV_QUERY_MDS_PATH_V2_VERSION_1: UInt = 1u

public val CYGNET_12_WO: StorageMediaType = 69

public val CHANGER_DOOR: ElementType = 5

public val CHANGER_DRIVE: ElementType = 4

public val CHANGER_IE_PORT: ElementType = 3

public val CHANGER_KEYPAD: ElementType = 6

public val CHANGER_MAX_ELEMENT: ElementType = 7

public val CHANGER_SLOT: ElementType = 2

public val CHANGER_TRANSPORT: ElementType = 1

public val CSV_CONTROL_DISABLE_CACHING: CsvControlOp = 19

public val CSV_CONTROL_ENABLE_CACHING: CsvControlOp = 20

public val CSV_CONTROL_ENABLE_USN_RANGE_MODIFICATION_TRACKING: CsvControlOp = 13

public val CSV_CONTROL_GET_CSV_FS_MDS_PATH_V2: CsvControlOp = 18

public val CSV_CONTROL_MARK_HANDLE_LOCAL_VOLUME_MOUNT: CsvControlOp = 14

public val CSV_CONTROL_QUERY_FILE_REVISION: CsvControlOp = 6

public val CSV_CONTROL_QUERY_FILE_REVISION_FILE_ID128: CsvControlOp = 9

public val CSV_CONTROL_QUERY_MDS_PATH: CsvControlOp = 8

public val CSV_CONTROL_QUERY_MDS_PATH_NO_PAUSE: CsvControlOp = 23

public val CSV_CONTROL_QUERY_REDIRECT_STATE: CsvControlOp = 4

public val CSV_CONTROL_QUERY_VOLUME_ID: CsvControlOp = 25

public val CSV_CONTROL_QUERY_VOLUME_REDIRECT_STATE: CsvControlOp = 10

public val CSV_CONTROL_SET_VOLUME_ID: CsvControlOp = 24

public val CSV_CONTROL_START_FORCE_DFO: CsvControlOp = 21

public val CSV_CONTROL_START_REDIRECT_FILE: CsvControlOp = 2

public val CSV_CONTROL_STOP_FORCE_DFO: CsvControlOp = 22

public val CSV_CONTROL_STOP_REDIRECT_FILE: CsvControlOp = 3

public val CSV_CONTROL_UNMARK_HANDLE_LOCAL_VOLUME_MOUNT: CsvControlOp = 15

public val CSV_FS_DISK_CONNECTIVITY_ALL_NODES: CsvfsDiskConnectivity = 3

public val CSV_FS_DISK_CONNECTIVITY_MDS_NODE_ONLY: CsvfsDiskConnectivity = 1

public val CSV_FS_DISK_CONNECTIVITY_NONE: CsvfsDiskConnectivity = 0

public val CSV_FS_DISK_CONNECTIVITY_SUBSET_OF_NODES: CsvfsDiskConnectivity = 2

public val DAX_ALLOC_ALIGNMENT_FLAG_FALLBACK_SPECIFIED: UInt = 2u

public val DAX_ALLOC_ALIGNMENT_FLAG_MANDATORY: UInt = 1u

public val DDS_4MM: StorageMediaType = 32

public val DDUMP_FLAG_DATA_READ_FROM_DEVICE: UInt = 1u

public val DEVICEDUMP_CAP_PRIVATE_SECTION: UInt = 1u

public val DEVICEDUMP_CAP_RESTRICTED_SECTION: UInt = 2u

public val DEVICEDUMP_MAX_IDSTRING: UInt = 32u

public val DEVICEDUMP_STRUCTURE_VERSION_V1: UInt = 1u

public val DEVICE_DATA_SET_LBP_STATE_PARAMETERS_VERSION_V1: UInt = 1u

public val DEVICE_DSM_FLAG_ALLOCATION_CONSOLIDATEABLE_ONLY: UInt = 1073741824u

public val DEVICE_DSM_FLAG_ENTIRE_DATA_SET_RANGE: UInt = 1u

public val DEVICE_DSM_FLAG_PHYSICAL_ADDRESSES_OMIT_TOTAL_RANGES: UInt = 268435456u

public val DEVICE_DSM_FLAG_REPAIR_INPUT_TOPOLOGY_ID_PRESENT: UInt = 1073741824u

public val DEVICE_DSM_FLAG_REPAIR_OUTPUT_PARITY_EXTENT: UInt = 536870912u

public val DEVICE_DSM_FLAG_SCRUB_OUTPUT_PARITY_EXTENT: UInt = 536870912u

public val DEVICE_DSM_FLAG_SCRUB_SKIP_IN_SYNC: UInt = 268435456u

public val DEVICE_DSM_FLAG_TRIM_BYPASS_RZAT: UInt = 1073741824u

public val DEVICE_DSM_FLAG_TRIM_NOT_FS_ALLOCATED: UInt = 2147483648u

public val DEVICE_DSM_NOTIFY_FLAG_BEGIN: UInt = 1u

public val DEVICE_DSM_NOTIFY_FLAG_END: UInt = 2u

public val DEVICE_DSM_PARAMETERS_V1: UInt = 1u

public val DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT_V1: UInt = 1u

public val DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT_VERSION_V1: UInt = 1u

public val DEVICE_DSM_RANGE_ERROR_INFO_VERSION_V1: UInt = 1u

public val DEVICE_DSM_RANGE_ERROR_OUTPUT_V1: UInt = 1u

public val DEVICE_STORAGE_NO_ERRORS: UInt = 1u

public val DEVPKEY_STORAGE_DISK_NUMBER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 5u)

public val DEVPKEY_STORAGE_GPT_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 9u)

public val DEVPKEY_STORAGE_GPT_TYPE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 8u)

public val DEVPKEY_STORAGE_MBR_TYPE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 7u)

public val DEVPKEY_STORAGE_PARTITION_NUMBER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 6u)

public val DEVPKEY_STORAGE_PORTABLE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 2u)

public val DEVPKEY_STORAGE_REMOVABLE_MEDIA: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 3u)

public val DEVPKEY_STORAGE_SYSTEM_CRITICAL: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4d1ebee808034774uL, 0x9842b77db50265e9uL)), pid = 4u)

public val DISABLE_SMART: UInt = 217u

public val DISK_ATTRIBUTE_OFFLINE: ULong = 1uL

public val DISK_ATTRIBUTE_READ_ONLY: ULong = 2uL

public val DISK_BINNING: UInt = 3u

public val DISK_LOGGING_DUMP: UInt = 2u

public val DISK_LOGGING_START: UInt = 0u

public val DISK_LOGGING_STOP: UInt = 1u

public val DLT: StorageMediaType = 39

public val DMI: StorageMediaType = 48

public val DST_L: StorageMediaType = 82

public val DST_M: StorageMediaType = 81

public val DST_S: StorageMediaType = 80

public val DUPLICATE_EXTENTS_DATA_EX_ASYNC: UInt = 2u

public val DUPLICATE_EXTENTS_DATA_EX_SOURCE_ATOMIC: UInt = 1u

public val DVD_R: StorageMediaType = 55

public val DVD_RAM: StorageMediaType = 88

public val DVD_ROM: StorageMediaType = 54

public val DVD_RW: StorageMediaType = 56

public val DV_6MM: StorageMediaType = 47

public val DETECT_EX_INT13: DetectionType = 2

public val DETECT_INT13: DetectionType = 1

public val DETECT_NONE: DetectionType = 0

public val DEVICE_CURRENT_INTERNAL_STATUS_DATA: DeviceInternalStatusDataRequestType = 2

public val DEVICE_CURRENT_INTERNAL_STATUS_DATA_HEADER: DeviceInternalStatusDataRequestType = 1

public val DEVICE_DSM_ACTION_FLAG_NON_DESTRUCTIVE: UInt = 2147483648u

public val DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE_UNDEFINED: DeviceInternalStatusDataRequestType = 0

public val DEVICE_PROBLEM_CHM_ERROR: ChangerDeviceProblemType = 2

public val DEVICE_PROBLEM_CHM_MOVE_ERROR: ChangerDeviceProblemType = 6

public val DEVICE_PROBLEM_CHM_ZERO_ERROR: ChangerDeviceProblemType = 7

public val DEVICE_PROBLEM_CALIBRATION_ERROR: ChangerDeviceProblemType = 4

public val DEVICE_PROBLEM_CARTRIDGE_EJECT_ERROR: ChangerDeviceProblemType = 11

public val DEVICE_PROBLEM_CARTRIDGE_INSERT_ERROR: ChangerDeviceProblemType = 8

public val DEVICE_PROBLEM_DOOR_OPEN: ChangerDeviceProblemType = 3

public val DEVICE_PROBLEM_DRIVE_ERROR: ChangerDeviceProblemType = 13

public val DEVICE_PROBLEM_GRIPPER_ERROR: ChangerDeviceProblemType = 12

public val DEVICE_PROBLEM_HARDWARE: ChangerDeviceProblemType = 1

public val DEVICE_PROBLEM_NONE: ChangerDeviceProblemType = 0

public val DEVICE_PROBLEM_POSITION_ERROR: ChangerDeviceProblemType = 9

public val DEVICE_PROBLEM_SENSOR_ERROR: ChangerDeviceProblemType = 10

public val DEVICE_PROBLEM_TARGET_FAILURE: ChangerDeviceProblemType = 5

public val DEVICE_SAVED_INTERNAL_STATUS_DATA: DeviceInternalStatusDataRequestType = 4

public val DEVICE_SAVED_INTERNAL_STATUS_DATA_HEADER: DeviceInternalStatusDataRequestType = 3

public val DEVICE_STATUS_DATA_SET1: DeviceInternalStatusDataSet = 1

public val DEVICE_STATUS_DATA_SET2: DeviceInternalStatusDataSet = 2

public val DEVICE_STATUS_DATA_SET3: DeviceInternalStatusDataSet = 3

public val DEVICE_STATUS_DATA_SET4: DeviceInternalStatusDataSet = 4

public val DEVICE_STATUS_DATA_SET_MAX: DeviceInternalStatusDataSet = 5

public val DEVICE_STATUS_DATA_SET_UNDEFINED: DeviceInternalStatusDataSet = 0

public val DISK_HEALTH_HEALTHY: StorageDiskHealthStatus = 3

public val DISK_HEALTH_MAX: StorageDiskHealthStatus = 4

public val DISK_HEALTH_UNHEALTHY: StorageDiskHealthStatus = 1

public val DISK_HEALTH_UNKNOWN: StorageDiskHealthStatus = 0

public val DISK_HEALTH_WARNING: StorageDiskHealthStatus = 2

public val DISK_OP_REASON_BACKGROUND_OPERATION: StorageOperationalStatusReason = 12

public val DISK_OP_REASON_COMPONENT: StorageOperationalStatusReason = 10

public val DISK_OP_REASON_CONFIGURATION: StorageOperationalStatusReason = 7

public val DISK_OP_REASON_DATA_PERSISTENCE_LOSS_IMMINENT: StorageOperationalStatusReason = 18

public val DISK_OP_REASON_DEVICE_CONTROLLER: StorageOperationalStatusReason = 8

public val DISK_OP_REASON_DISABLED_BY_PLATFORM: StorageOperationalStatusReason = 16

public val DISK_OP_REASON_ENERGY_SOURCE: StorageOperationalStatusReason = 6

public val DISK_OP_REASON_HEALTH_CHECK: StorageOperationalStatusReason = 14

public val DISK_OP_REASON_INVALID_FIRMWARE: StorageOperationalStatusReason = 13

public val DISK_OP_REASON_IO: StorageOperationalStatusReason = 3

public val DISK_OP_REASON_LOST_DATA: StorageOperationalStatusReason = 5

public val DISK_OP_REASON_LOST_DATA_PERSISTENCE: StorageOperationalStatusReason = 15

public val DISK_OP_REASON_LOST_WRITE_PERSISTENCE: StorageOperationalStatusReason = 17

public val DISK_OP_REASON_MAX: StorageOperationalStatusReason = 20

public val DISK_OP_REASON_MEDIA: StorageOperationalStatusReason = 2

public val DISK_OP_REASON_MEDIA_CONTROLLER: StorageOperationalStatusReason = 9

public val DISK_OP_REASON_NVDIMM_N: StorageOperationalStatusReason = 11

public val DISK_OP_REASON_SCSI_SENSE_CODE: StorageOperationalStatusReason = 1

public val DISK_OP_REASON_THRESHOLD_EXCEEDED: StorageOperationalStatusReason = 4

public val DISK_OP_REASON_UNKNOWN: StorageOperationalStatusReason = 0

public val DISK_OP_REASON_WRITE_PERSISTENCE_LOSS_IMMINENT: StorageOperationalStatusReason = 19

public val DISK_OP_STATUS_HARDWARE_ERROR: StorageDiskOperationalStatus = 5

public val DISK_OP_STATUS_IN_SERVICE: StorageDiskOperationalStatus = 4

public val DISK_OP_STATUS_MISSING: StorageDiskOperationalStatus = 8

public val DISK_OP_STATUS_NONE: StorageDiskOperationalStatus = 0

public val DISK_OP_STATUS_NOT_USABLE: StorageDiskOperationalStatus = 6

public val DISK_OP_STATUS_OK: StorageDiskOperationalStatus = 2

public val DISK_OP_STATUS_PREDICTING_FAILURE: StorageDiskOperationalStatus = 3

public val DISK_OP_STATUS_TRANSIENT_ERROR: StorageDiskOperationalStatus = 7

public val DISK_OP_STATUS_UNKNOWN: StorageDiskOperationalStatus = 1

public val EFS_TRACKED_OFFSET_HEADER_FLAG: UInt = 1u

public val ELEMENT_STATUS_ACCESS: ChangerElementStatusFlags = 8u

public val ELEMENT_STATUS_AVOLTAG: ChangerElementStatusFlags = 536870912u

public val ELEMENT_STATUS_EXCEPT: ChangerElementStatusFlags = 4u

public val ELEMENT_STATUS_EXENAB: ChangerElementStatusFlags = 16u

public val ELEMENT_STATUS_FULL: ChangerElementStatusFlags = 1u

public val ELEMENT_STATUS_ID_VALID: ChangerElementStatusFlags = 8192u

public val ELEMENT_STATUS_IMPEXP: ChangerElementStatusFlags = 2u

public val ELEMENT_STATUS_INENAB: ChangerElementStatusFlags = 32u

public val ELEMENT_STATUS_INVERT: ChangerElementStatusFlags = 4194304u

public val ELEMENT_STATUS_LUN_VALID: ChangerElementStatusFlags = 4096u

public val ELEMENT_STATUS_NOT_BUS: ChangerElementStatusFlags = 32768u

public val ELEMENT_STATUS_PRODUCT_DATA: ChangerElementStatusFlags = 64u

public val ELEMENT_STATUS_PVOLTAG: ChangerElementStatusFlags = 268435456u

public val ELEMENT_STATUS_SVALID: ChangerElementStatusFlags = 8388608u

public val ENABLE_DISABLE_AUTOSAVE: UInt = 210u

public val ENABLE_DISABLE_AUTO_OFFLINE: UInt = 219u

public val ENABLE_SMART: UInt = 216u

public val ENCRYPTED_DATA_INFO_SPARSE_FILE: UInt = 1u

public val ENCRYPTION_FORMAT_DEFAULT: UInt = 1u

public val ERROR_DRIVE_NOT_INSTALLED: UInt = 8u

public val ERROR_HISTORY_DIRECTORY_ENTRY_DEFAULT_COUNT: UInt = 8u

public val ERROR_INIT_STATUS_NEEDED: UInt = 17u

public val ERROR_LABEL_QUESTIONABLE: UInt = 2u

public val ERROR_LABEL_UNREADABLE: UInt = 1u

public val ERROR_SLOT_NOT_PRESENT: UInt = 4u

public val ERROR_TRAY_MALFUNCTION: UInt = 16u

public val ERROR_UNHANDLED_ERROR: UInt = 4294967295u

public val EXECUTE_OFFLINE_DIAGS: UInt = 212u

public val EXTEND_IEPORT: UInt = 2u

public val EQUAL_PRIORITY: DiskCacheRetentionPriority = 0

public val F3_120M_512: MediaType = 13

public val F3_128MB_512: MediaType = 20

public val F3_1PT23_1024: MediaType = 18

public val F3_1PT2_512: MediaType = 17

public val F3_1PT44_512: MediaType = 2

public val F3_200MB_512: MediaType = 23

public val F3_20PT8_512: MediaType = 4

public val F3_230MB_512: MediaType = 21

public val F3_240M_512: MediaType = 24

public val F3_2PT88_512: MediaType = 3

public val F3_32M_512: MediaType = 25

public val F3_640_512: MediaType = 14

public val F3_720_512: MediaType = 5

public val F5_160_512: MediaType = 10

public val F5_180_512: MediaType = 9

public val F5_1PT23_1024: MediaType = 19

public val F5_1PT2_512: MediaType = 1

public val F5_320_1024: MediaType = 8

public val F5_320_512: MediaType = 7

public val F5_360_512: MediaType = 6

public val F5_640_512: MediaType = 15

public val F5_720_512: MediaType = 16

public val F8_256_128: MediaType = 22

public val FILESYSTEM_STATISTICS_TYPE_EXFAT: FilesystemStatisticsType = 3u.toUShort()

public val FILESYSTEM_STATISTICS_TYPE_FAT: FilesystemStatisticsType = 2u.toUShort()

public val FILESYSTEM_STATISTICS_TYPE_NTFS: FilesystemStatisticsType = 1u.toUShort()

public val FILESYSTEM_STATISTICS_TYPE_REFS: UInt = 4u

public val FILE_ANY_ACCESS: UInt = 0u

public val FILE_CLEAR_ENCRYPTION: UInt = 2u

public val FILE_DEVICE_8042_PORT: UInt = 39u

public val FILE_DEVICE_ACPI: UInt = 50u

public val FILE_DEVICE_BATTERY: UInt = 41u

public val FILE_DEVICE_BEEP: UInt = 1u

public val FILE_DEVICE_BIOMETRIC: UInt = 68u

public val FILE_DEVICE_BLUETOOTH: UInt = 65u

public val FILE_DEVICE_BUS_EXTENDER: UInt = 42u

public val FILE_DEVICE_CD_ROM_FILE_SYSTEM: UInt = 3u

public val FILE_DEVICE_CHANGER: UInt = 48u

public val FILE_DEVICE_CONSOLE: UInt = 80u

public val FILE_DEVICE_CONTROLLER: UInt = 4u

public val FILE_DEVICE_CRYPT_PROVIDER: UInt = 63u

public val FILE_DEVICE_DATALINK: UInt = 5u

public val FILE_DEVICE_DEVAPI: UInt = 71u

public val FILE_DEVICE_DFS: UInt = 6u

public val FILE_DEVICE_DFS_FILE_SYSTEM: UInt = 53u

public val FILE_DEVICE_DFS_VOLUME: UInt = 54u

public val FILE_DEVICE_DISK_FILE_SYSTEM: UInt = 8u

public val FILE_DEVICE_EHSTOR: UInt = 70u

public val FILE_DEVICE_EVENT_COLLECTOR: UInt = 95u

public val FILE_DEVICE_FILE_SYSTEM: UInt = 9u

public val FILE_DEVICE_FIPS: UInt = 58u

public val FILE_DEVICE_FULLSCREEN_VIDEO: UInt = 52u

public val FILE_DEVICE_GPIO: UInt = 72u

public val FILE_DEVICE_HOLOGRAPHIC: UInt = 91u

public val FILE_DEVICE_INFINIBAND: UInt = 59u

public val FILE_DEVICE_INPORT_PORT: UInt = 10u

public val FILE_DEVICE_KEYBOARD: UInt = 11u

public val FILE_DEVICE_KS: UInt = 47u

public val FILE_DEVICE_KSEC: UInt = 57u

public val FILE_DEVICE_MAILSLOT: UInt = 12u

public val FILE_DEVICE_MASS_STORAGE: UInt = 45u

public val FILE_DEVICE_MIDI_IN: UInt = 13u

public val FILE_DEVICE_MIDI_OUT: UInt = 14u

public val FILE_DEVICE_MODEM: UInt = 43u

public val FILE_DEVICE_MOUSE: UInt = 15u

public val FILE_DEVICE_MT_COMPOSITE: UInt = 66u

public val FILE_DEVICE_MT_TRANSPORT: UInt = 67u

public val FILE_DEVICE_MULTI_UNC_PROVIDER: UInt = 16u

public val FILE_DEVICE_NAMED_PIPE: UInt = 17u

public val FILE_DEVICE_NETWORK: UInt = 18u

public val FILE_DEVICE_NETWORK_BROWSER: UInt = 19u

public val FILE_DEVICE_NETWORK_FILE_SYSTEM: UInt = 20u

public val FILE_DEVICE_NETWORK_REDIRECTOR: UInt = 40u

public val FILE_DEVICE_NFP: UInt = 81u

public val FILE_DEVICE_NULL: UInt = 21u

public val FILE_DEVICE_NVDIMM: UInt = 90u

public val FILE_DEVICE_PARALLEL_PORT: UInt = 22u

public val FILE_DEVICE_PERSISTENT_MEMORY: UInt = 89u

public val FILE_DEVICE_PHYSICAL_NETCARD: UInt = 23u

public val FILE_DEVICE_PMI: UInt = 69u

public val FILE_DEVICE_POINT_OF_SERVICE: UInt = 84u

public val FILE_DEVICE_PRINTER: UInt = 24u

public val FILE_DEVICE_PRM: UInt = 94u

public val FILE_DEVICE_SCANNER: UInt = 25u

public val FILE_DEVICE_SCREEN: UInt = 28u

public val FILE_DEVICE_SDFXHCI: UInt = 92u

public val FILE_DEVICE_SERENUM: UInt = 55u

public val FILE_DEVICE_SERIAL_MOUSE_PORT: UInt = 26u

public val FILE_DEVICE_SERIAL_PORT: UInt = 27u

public val FILE_DEVICE_SMB: UInt = 46u

public val FILE_DEVICE_SOUND: UInt = 29u

public val FILE_DEVICE_SOUNDWIRE: UInt = 97u

public val FILE_DEVICE_STORAGE_REPLICATION: UInt = 85u

public val FILE_DEVICE_STREAMS: UInt = 30u

public val FILE_DEVICE_SYSENV: UInt = 82u

public val FILE_DEVICE_TAPE_FILE_SYSTEM: UInt = 32u

public val FILE_DEVICE_TERMSRV: UInt = 56u

public val FILE_DEVICE_TRANSPORT: UInt = 33u

public val FILE_DEVICE_TRUST_ENV: UInt = 86u

public val FILE_DEVICE_UCM: UInt = 87u

public val FILE_DEVICE_UCMTCPCI: UInt = 88u

public val FILE_DEVICE_UCMUCSI: UInt = 93u

public val FILE_DEVICE_UNKNOWN: UInt = 34u

public val FILE_DEVICE_USB4: UInt = 96u

public val FILE_DEVICE_USBEX: UInt = 73u

public val FILE_DEVICE_VDM: UInt = 44u

public val FILE_DEVICE_VIDEO: UInt = 35u

public val FILE_DEVICE_VIRTUAL_BLOCK: UInt = 83u

public val FILE_DEVICE_VIRTUAL_DISK: UInt = 36u

public val FILE_DEVICE_VMBUS: UInt = 62u

public val FILE_DEVICE_WAVE_IN: UInt = 37u

public val FILE_DEVICE_WAVE_OUT: UInt = 38u

public val FILE_DEVICE_WPD: UInt = 64u

public val FILE_INITIATE_REPAIR_HINT1_ATTRIBUTE_NON_RESIDENT: ULong = 137438953472uL

public val FILE_INITIATE_REPAIR_HINT1_ATTRIBUTE_NOT_FOUND: ULong = 4096uL

public val FILE_INITIATE_REPAIR_HINT1_ATTRIBUTE_TOO_SMALL: ULong = 68719476736uL

public val FILE_INITIATE_REPAIR_HINT1_CLUSTERS_ALREADY_IN_USE: ULong = 32768uL

public val FILE_INITIATE_REPAIR_HINT1_DENY_DEFRAG: ULong = 274877906944uL

public val FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_IS_BASE_RECORD: ULong = 524288uL

public val FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_NOT_BASE_RECORD: ULong = 8uL

public val FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_NOT_EXIST: ULong = 4uL

public val FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_NOT_IN_USE: ULong = 1uL

public val FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_NOT_ORPHAN: ULong = 262144uL

public val FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_REUSED: ULong = 2uL

public val FILE_INITIATE_REPAIR_HINT1_INDEX_ENTRY_MISMATCH: ULong = 1099511627776uL

public val FILE_INITIATE_REPAIR_HINT1_INVALID_ARRAY_LENGTH_COUNT: ULong = 1048576uL

public val FILE_INITIATE_REPAIR_HINT1_INVALID_LCN: ULong = 4294967296uL

public val FILE_INITIATE_REPAIR_HINT1_INVALID_ORPHAN_RECOVERY_NAME: ULong = 2199023255552uL

public val FILE_INITIATE_REPAIR_HINT1_INVALID_PARENT: ULong = 8388608uL

public val FILE_INITIATE_REPAIR_HINT1_INVALID_RUN_LENGTH: ULong = 131072uL

public val FILE_INITIATE_REPAIR_HINT1_INVALID_VCN: ULong = 8589934592uL

public val FILE_INITIATE_REPAIR_HINT1_LCN_NOT_EXIST: ULong = 65536uL

public val FILE_INITIATE_REPAIR_HINT1_MULTIPLE_FILE_NAME_ATTRIBUTES: ULong = 4398046511104uL

public val FILE_INITIATE_REPAIR_HINT1_NAME_CONFLICT: ULong = 17179869184uL

public val FILE_INITIATE_REPAIR_HINT1_NOTHING_WRONG: ULong = 2048uL

public val FILE_INITIATE_REPAIR_HINT1_NOT_IMPLEMENTED: ULong = 32uL

public val FILE_INITIATE_REPAIR_HINT1_ORPHAN: ULong = 34359738368uL

public val FILE_INITIATE_REPAIR_HINT1_ORPHAN_GENERATED: ULong = 512uL

public val FILE_INITIATE_REPAIR_HINT1_OUT_OF_GENERIC_NAMES: ULong = 1073741824uL

public val FILE_INITIATE_REPAIR_HINT1_OUT_OF_RESOURCE: ULong = 2147483648uL

public val FILE_INITIATE_REPAIR_HINT1_PARENT_FILE_RECORD_NOT_BASE_RECORD: ULong = 134217728uL

public val FILE_INITIATE_REPAIR_HINT1_PARENT_FILE_RECORD_NOT_EXIST: ULong = 67108864uL

public val FILE_INITIATE_REPAIR_HINT1_PARENT_FILE_RECORD_NOT_INDEX: ULong = 268435456uL

public val FILE_INITIATE_REPAIR_HINT1_PARENT_FILE_RECORD_NOT_IN_USE: ULong = 16777216uL

public val FILE_INITIATE_REPAIR_HINT1_PARENT_FILE_RECORD_REUSED: ULong = 33554432uL

public val FILE_INITIATE_REPAIR_HINT1_POTENTIAL_CROSSLINK: ULong = 8192uL

public val FILE_INITIATE_REPAIR_HINT1_PREVIOUS_PARENT_STILL_VALID: ULong = 549755813888uL

public val FILE_INITIATE_REPAIR_HINT1_RECURSIVELY_CORRUPTED: ULong = 256uL

public val FILE_INITIATE_REPAIR_HINT1_REPAIRED: ULong = 1024uL

public val FILE_INITIATE_REPAIR_HINT1_REPAIR_DISABLED: ULong = 128uL

public val FILE_INITIATE_REPAIR_HINT1_SID_MISMATCH: ULong = 4194304uL

public val FILE_INITIATE_REPAIR_HINT1_SID_VALID: ULong = 2097152uL

public val FILE_INITIATE_REPAIR_HINT1_STALE_INFORMATION: ULong = 16384uL

public val FILE_INITIATE_REPAIR_HINT1_SYSTEM_FILE: ULong = 16uL

public val FILE_INITIATE_REPAIR_HINT1_UNABLE_TO_REPAIR: ULong = 64uL

public val FILE_INITIATE_REPAIR_HINT1_VALID_INDEX_ENTRY: ULong = 536870912uL

public val FILE_LAYOUT_NAME_ENTRY_DOS: UInt = 2u

public val FILE_LAYOUT_NAME_ENTRY_PRIMARY: UInt = 1u

public val FILE_PREFETCH_TYPE_FOR_CREATE: UInt = 1u

public val FILE_PREFETCH_TYPE_FOR_CREATE_EX: UInt = 3u

public val FILE_PREFETCH_TYPE_FOR_DIRENUM: UInt = 2u

public val FILE_PREFETCH_TYPE_FOR_DIRENUM_EX: UInt = 4u

public val FILE_PREFETCH_TYPE_MAX: UInt = 4u

public val FILE_PROVIDER_COMPRESSION_MAXIMUM: UInt = 4u

public val FILE_PROVIDER_CURRENT_VERSION: UInt = 1u

public val FILE_PROVIDER_FLAG_COMPRESS_ON_WRITE: UInt = 1u

public val FILE_PROVIDER_SINGLE_FILE: UInt = 1u

public val FILE_READ_ACCESS: UInt = 1u

public val FILE_REGION_USAGE_HUGE_PAGE_ALIGNMENT: UInt = 16u

public val FILE_REGION_USAGE_LARGE_PAGE_ALIGNMENT: UInt = 8u

public val FILE_REGION_USAGE_OTHER_PAGE_ALIGNMENT: UInt = 4u

public val FILE_REGION_USAGE_QUERY_ALIGNMENT: UInt = 8u

public val FILE_REGION_USAGE_VALID_CACHED_DATA: UInt = 1u

public val FILE_REGION_USAGE_VALID_NONCACHED_DATA: UInt = 2u

public val FILE_SET_ENCRYPTION: UInt = 1u

public val FILE_SPECIAL_ACCESS: UInt = 0u

public val FILE_STORAGE_TIER_DESCRIPTION_LENGTH: UInt = 512u

public val FILE_STORAGE_TIER_FLAG_NO_SEEK_PENALTY: FileStorageTierFlags = 131072u

public val FILE_STORAGE_TIER_FLAG_PARITY: UInt = 8388608u

public val FILE_STORAGE_TIER_FLAG_READ_CACHE: UInt = 4194304u

public val FILE_STORAGE_TIER_FLAG_SMR: UInt = 16777216u

public val FILE_STORAGE_TIER_FLAG_WRITE_BACK_CACHE: UInt = 2097152u

public val FILE_STORAGE_TIER_NAME_LENGTH: UInt = 256u

public val FILE_TYPE_NOTIFICATION_FLAG_USAGE_BEGIN: UInt = 1u

public val FILE_TYPE_NOTIFICATION_FLAG_USAGE_END: UInt = 2u

public val FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE: Guid = Guid.fromU128(U128(0x9d453eb7d2a64dbduL, 0xa2e3fbd0ed9109a9uL))

public val FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE: Guid = Guid.fromU128(U128(0xb7624d64b9a34cf8uL, 0x80115b86c940e7b7uL))

public val FILE_TYPE_NOTIFICATION_GUID_PAGE_FILE: Guid = Guid.fromU128(U128(0xd0a64a138fc4db8uL, 0x9fe73f4352cd7c5cuL))

public val FILE_WRITE_ACCESS: UInt = 2u

public val FILE_ZERO_DATA_INFORMATION_FLAG_PRESERVE_CACHED_DATA: UInt = 1u

public val FLAG_USN_TRACK_MODIFIED_RANGES_ENABLE: UInt = 1u

public val FSBPIO_INFL_NONE: FsBpioInflags = 0

public val FSBPIO_INFL_SKIP_STORAGE_STACK_QUERY: FsBpioInflags = 1

public val FSBPIO_OUTFL_COMPATIBLE_STORAGE_DRIVER: FsBpioOutflags = 8

public val FSBPIO_OUTFL_FILTER_ATTACH_BLOCKED: FsBpioOutflags = 4

public val FSBPIO_OUTFL_NONE: FsBpioOutflags = 0

public val FSBPIO_OUTFL_STREAM_BYPASS_PAUSED: FsBpioOutflags = 2

public val FSBPIO_OUTFL_VOLUME_STACK_BYPASS_PAUSED: FsBpioOutflags = 1

public val FSCTL_ADD_OVERLAY: UInt = 623408u

public val FSCTL_ADVANCE_FILE_ID: UInt = 590532u

public val FSCTL_ALLOW_EXTENDED_DASD_IO: UInt = 589955u

public val FSCTL_CLEAN_VOLUME_METADATA: UInt = 590716u

public val FSCTL_CLEAR_ALL_LCN_WEAK_REFERENCES: UInt = 590956u

public val FSCTL_CLEAR_LCN_WEAK_REFERENCE: UInt = 590948u

public val FSCTL_CORRUPTION_HANDLING: UInt = 590432u

public val FSCTL_CREATE_LCN_WEAK_REFERENCE: UInt = 590944u

public val FSCTL_CREATE_OR_GET_OBJECT_ID: UInt = 590016u

public val FSCTL_CREATE_USN_JOURNAL: UInt = 590055u

public val FSCTL_CSC_INTERNAL: UInt = 590255u

public val FSCTL_CSV_CONTROL: UInt = 590548u

public val FSCTL_CSV_GET_VOLUME_NAME_FOR_VOLUME_MOUNT_POINT: UInt = 590420u

public val FSCTL_CSV_GET_VOLUME_PATH_NAME: UInt = 590416u

public val FSCTL_CSV_GET_VOLUME_PATH_NAMES_FOR_VOLUME_NAME: UInt = 590424u

public val FSCTL_CSV_H_BREAKING_SYNC_TUNNEL_REQUEST: UInt = 590564u

public val FSCTL_CSV_INTERNAL: UInt = 590444u

public val FSCTL_CSV_MGMT_LOCK: UInt = 590524u

public val FSCTL_CSV_QUERY_DOWN_LEVEL_FILE_SYSTEM_CHARACTERISTICS: UInt = 590528u

public val FSCTL_CSV_QUERY_VETO_FILE_DIRECT_IO: UInt = 590540u

public val FSCTL_CSV_SYNC_TUNNEL_REQUEST: UInt = 590536u

public val FSCTL_CSV_TUNNEL_REQUEST: UInt = 590404u

public val FSCTL_DELETE_CORRUPTED_REFS_CONTAINER: UInt = 590836u

public val FSCTL_DELETE_EXTERNAL_BACKING: UInt = 590612u

public val FSCTL_DELETE_OBJECT_ID: UInt = 589984u

public val FSCTL_DELETE_REPARSE_POINT: UInt = 589996u

public val FSCTL_DELETE_USN_JOURNAL: UInt = 590072u

public val FSCTL_DFSR_SET_GHOST_HANDLE_STATE: UInt = 590264u

public val FSCTL_DISABLE_LOCAL_BUFFERING: UInt = 590520u

public val FSCTL_DISMOUNT_VOLUME: UInt = 589856u

public val FSCTL_DUPLICATE_CLUSTER: UInt = 590940u

public val FSCTL_DUPLICATE_EXTENTS_TO_FILE: UInt = 623428u

public val FSCTL_DUPLICATE_EXTENTS_TO_FILE_EX: UInt = 623592u

public val FSCTL_ENABLE_PER_IO_FLAGS: UInt = 590892u

public val FSCTL_ENABLE_UPGRADE: UInt = 622800u

public val FSCTL_ENCRYPTION_FSCTL_IO: UInt = 590043u

public val FSCTL_ENCRYPTION_KEY_CONTROL: UInt = 590852u

public val FSCTL_ENUM_EXTERNAL_BACKING: UInt = 590616u

public val FSCTL_ENUM_OVERLAY: UInt = 590623u

public val FSCTL_ENUM_USN_DATA: UInt = 590003u

public val FSCTL_EXTEND_VOLUME: UInt = 590064u

public val FSCTL_FILESYSTEM_GET_STATISTICS: UInt = 589920u

public val FSCTL_FILESYSTEM_GET_STATISTICS_EX: UInt = 590732u

public val FSCTL_FILE_LEVEL_TRIM: UInt = 623112u

public val FSCTL_FILE_PREFETCH: UInt = 590112u

public val FSCTL_FILE_TYPE_NOTIFICATION: UInt = 590340u

public val FSCTL_FIND_FILES_BY_SID: UInt = 589967u

public val FSCTL_GET_BOOT_AREA_INFO: UInt = 590384u

public val FSCTL_GET_COMPRESSION: UInt = 589884u

public val FSCTL_GET_EXTERNAL_BACKING: UInt = 590608u

public val FSCTL_GET_FILTER_FILE_IDENTIFIER: UInt = 590788u

public val FSCTL_GET_INTEGRITY_INFORMATION: UInt = 590460u

public val FSCTL_GET_NTFS_FILE_RECORD: UInt = 589928u

public val FSCTL_GET_NTFS_VOLUME_DATA: UInt = 589924u

public val FSCTL_GET_OBJECT_ID: UInt = 589980u

public val FSCTL_GET_REFS_VOLUME_DATA: UInt = 590552u

public val FSCTL_GET_REPAIR: UInt = 590236u

public val FSCTL_GET_REPARSE_POINT: UInt = 589992u

public val FSCTL_GET_RETRIEVAL_POINTERS: UInt = 589939u

public val FSCTL_GET_RETRIEVAL_POINTERS_AND_REFCOUNT: UInt = 590803u

public val FSCTL_GET_RETRIEVAL_POINTER_BASE: UInt = 590388u

public val FSCTL_GET_RETRIEVAL_POINTER_COUNT: UInt = 590891u

public val FSCTL_GET_VOLUME_BITMAP: UInt = 589935u

public val FSCTL_GET_WOF_VERSION: UInt = 590696u

public val FSCTL_GHOST_FILE_EXTENTS: UInt = 623532u

public val FSCTL_HCS_ASYNC_TUNNEL_REQUEST: UInt = 590704u

public val FSCTL_HCS_SYNC_NO_WRITE_TUNNEL_REQUEST: UInt = 590776u

public val FSCTL_HCS_SYNC_TUNNEL_REQUEST: UInt = 590700u

public val FSCTL_INITIATE_FILE_METADATA_OPTIMIZATION: UInt = 590684u

public val FSCTL_INITIATE_REPAIR: UInt = 590248u

public val FSCTL_INTEGRITY_FLAG_CHECKSUM_ENFORCEMENT_OFF: UInt = 1u

public val FSCTL_INVALIDATE_VOLUMES: UInt = 589908u

public val FSCTL_IS_CSV_FILE: UInt = 590408u

public val FSCTL_IS_FILE_ON_CSV_VOLUME: UInt = 590428u

public val FSCTL_IS_PATHNAME_VALID: UInt = 589868u

public val FSCTL_IS_VOLUME_DIRTY: UInt = 589944u

public val FSCTL_IS_VOLUME_MOUNTED: UInt = 589864u

public val FSCTL_IS_VOLUME_OWNED_BYCSVFS: UInt = 590456u

public val FSCTL_LMR_QUERY_INFO: UInt = 590968u

public val FSCTL_LOCK_VOLUME: UInt = 589848u

public val FSCTL_LOOKUP_STREAM_FROM_CLUSTER: UInt = 590332u

public val FSCTL_MAKE_MEDIA_COMPATIBLE: UInt = 622896u

public val FSCTL_MANAGE_BYPASS_IO: UInt = 590920u

public val FSCTL_MARK_AS_SYSTEM_HIVE: UInt = 589903u

public val FSCTL_MARK_HANDLE: UInt = 590076u

public val FSCTL_MARK_VOLUME_DIRTY: UInt = 589872u

public val FSCTL_MOVE_FILE: UInt = 589940u

public val FSCTL_NOTIFY_DATA_CHANGE: UInt = 590844u

public val FSCTL_NOTIFY_STORAGE_SPACE_ALLOCATION: UInt = 590748u

public val FSCTL_OFFLOAD_READ: UInt = 606820u

public val FSCTL_OFFLOAD_WRITE: UInt = 623208u

public val FSCTL_OPBATCH_ACK_CLOSE_PENDING: UInt = 589840u

public val FSCTL_OPLOCK_BREAK_ACKNOWLEDGE: UInt = 589836u

public val FSCTL_OPLOCK_BREAK_ACK_NO_2: UInt = 589904u

public val FSCTL_OPLOCK_BREAK_NOTIFY: UInt = 589844u

public val FSCTL_QUERY_ALLOCATED_RANGES: UInt = 606415u

public val FSCTL_QUERY_ASYNC_DUPLICATE_EXTENTS_STATUS: UInt = 590896u

public val FSCTL_QUERY_BAD_RANGES: UInt = 590828u

public val FSCTL_QUERY_DEPENDENT_VOLUME: UInt = 590320u

public val FSCTL_QUERY_DIRECT_ACCESS_EXTENTS: UInt = 590747u

public val FSCTL_QUERY_DIRECT_IMAGE_ORIGINAL_BASE: UInt = 590756u

public val FSCTL_QUERY_EXTENT_READ_CACHE_INFO: UInt = 590711u

public val FSCTL_QUERY_FAT_BPB: UInt = 589912u

public val FSCTL_QUERY_FILE_LAYOUT: UInt = 590455u

public val FSCTL_QUERY_FILE_METADATA_OPTIMIZATION: UInt = 590688u

public val FSCTL_QUERY_FILE_REGIONS: UInt = 590468u

public val FSCTL_QUERY_FILE_SYSTEM_RECOGNITION: UInt = 590412u

public val FSCTL_QUERY_GHOSTED_FILE_EXTENTS: UInt = 590768u

public val FSCTL_QUERY_LCN_WEAK_REFERENCE: UInt = 590952u

public val FSCTL_QUERY_ON_DISK_VOLUME_INFO: UInt = 590140u

public val FSCTL_QUERY_PAGEFILE_ENCRYPTION: UInt = 590312u

public val FSCTL_QUERY_PERSISTENT_VOLUME_STATE: UInt = 590396u

public val FSCTL_QUERY_REFS_SMR_VOLUME_INFO: UInt = 590812u

public val FSCTL_QUERY_REFS_VOLUME_COUNTER_INFO: UInt = 590715u

public val FSCTL_QUERY_REGION_INFO: UInt = 590576u

public val FSCTL_QUERY_RETRIEVAL_POINTERS: UInt = 589883u

public val FSCTL_QUERY_SHARED_VIRTUAL_DISK_SUPPORT: UInt = 590592u

public val FSCTL_QUERY_SPARING_INFO: UInt = 590136u

public val FSCTL_QUERY_STORAGE_CLASSES: UInt = 590572u

public val FSCTL_QUERY_USN_JOURNAL: UInt = 590068u

public val FSCTL_QUERY_VOLUME_CONTAINER_STATE: UInt = 590736u

public val FSCTL_QUERY_VOLUME_NUMA_INFO: UInt = 590804u

public val FSCTL_READ_FILE_USN_DATA: UInt = 590059u

public val FSCTL_READ_FROM_PLEX: UInt = 606494u

public val FSCTL_READ_RAW_ENCRYPTED: UInt = 590051u

public val FSCTL_READ_UNPRIVILEGED_USN_JOURNAL: UInt = 590763u

public val FSCTL_READ_USN_JOURNAL: UInt = 590011u

public val FSCTL_REARRANGE_FILE: UInt = 640032u

public val FSCTL_RECALL_FILE: UInt = 590103u

public val FSCTL_REFS_CHECKPOINT_VOLUME: UInt = 590972u

public val FSCTL_REFS_DEALLOCATE_RANGES: UInt = 590808u

public val FSCTL_REFS_DEALLOCATE_RANGES_EX: UInt = 590924u

public val FSCTL_REFS_QUERY_VOLUME_COMPRESSION_INFO: UInt = 590936u

public val FSCTL_REFS_QUERY_VOLUME_DEDUP_INFO: UInt = 590964u

public val FSCTL_REFS_QUERY_VOLUME_IO_METRICS_INFO: UInt = 590988u

public val FSCTL_REFS_QUERY_VOLUME_TOTAL_SHARED_LCNS: UInt = 590976u

public val FSCTL_REFS_SET_VOLUME_COMPRESSION_INFO: UInt = 590932u

public val FSCTL_REFS_SET_VOLUME_DEDUP_INFO: UInt = 590960u

public val FSCTL_REFS_SET_VOLUME_IO_METRICS_INFO: UInt = 590984u

public val FSCTL_REFS_STREAM_SNAPSHOT_MANAGEMENT: UInt = 590912u

public val FSCTL_REMOVE_OVERLAY: UInt = 623412u

public val FSCTL_REPAIR_COPIES: UInt = 639668u

public val FSCTL_REQUEST_BATCH_OPLOCK: UInt = 589832u

public val FSCTL_REQUEST_FILTER_OPLOCK: UInt = 589916u

public val FSCTL_REQUEST_OPLOCK: UInt = 590400u

public val FSCTL_REQUEST_OPLOCK_LEVEL_1: UInt = 589824u

public val FSCTL_REQUEST_OPLOCK_LEVEL_2: UInt = 589828u

public val FSCTL_RESET_VOLUME_ALLOCATION_HINTS: UInt = 590316u

public val FSCTL_RKF_INTERNAL: UInt = 590511u

public val FSCTL_SCRUB_DATA: UInt = 590512u

public val FSCTL_SCRUB_UNDISCOVERABLE_ID: UInt = 590840u

public val FSCTL_SD_GLOBAL_CHANGE: UInt = 590324u

public val FSCTL_SECURITY_ID_CHECK: UInt = 606391u

public val FSCTL_SET_BOOTLOADER_ACCESSED: UInt = 589903u

public val FSCTL_SET_CACHED_RUNS_STATE: UInt = 590928u

public val FSCTL_SET_COMPRESSION: UInt = 639040u

public val FSCTL_SET_DAX_ALLOC_ALIGNMENT_HINT: UInt = 590832u

public val FSCTL_SET_DEFECT_MANAGEMENT: UInt = 622900u

public val FSCTL_SET_ENCRYPTION: UInt = 590039u

public val FSCTL_SET_EXTERNAL_BACKING: UInt = 590604u

public val FSCTL_SET_INTEGRITY_INFORMATION: UInt = 639616u

public val FSCTL_SET_INTEGRITY_INFORMATION_EX: UInt = 590720u

public val FSCTL_SET_LAYER_ROOT: UInt = 590740u

public val FSCTL_SET_OBJECT_ID: UInt = 589976u

public val FSCTL_SET_OBJECT_ID_EXTENDED: UInt = 590012u

public val FSCTL_SET_PERSISTENT_VOLUME_STATE: UInt = 590392u

public val FSCTL_SET_PURGE_FAILURE_MODE: UInt = 590448u

public val FSCTL_SET_REFS_FILE_STRICTLY_SEQUENTIAL: UInt = 590820u

public val FSCTL_SET_REFS_SMR_VOLUME_GC_PARAMETERS: UInt = 590816u

public val FSCTL_SET_REPAIR: UInt = 590232u

public val FSCTL_SET_REPARSE_POINT: UInt = 589988u

public val FSCTL_SET_REPARSE_POINT_EX: UInt = 590860u

public val FSCTL_SET_SHORT_NAME_BEHAVIOR: UInt = 590260u

public val FSCTL_SET_SPARSE: UInt = 590020u

public val FSCTL_SET_VOLUME_COMPRESSION_STATE: UInt = 590144u

public val FSCTL_SET_ZERO_DATA: UInt = 622792u

public val FSCTL_SET_ZERO_ON_DEALLOCATION: UInt = 590228u

public val FSCTL_SHRINK_VOLUME: UInt = 590256u

public val FSCTL_SHUFFLE_FILE: UInt = 639808u

public val FSCTL_SIS_COPYFILE: UInt = 590080u

public val FSCTL_SIS_LINK_FILES: UInt = 639236u

public val FSCTL_SMB_SHARE_FLUSH_AND_PURGE: UInt = 590908u

public val FSCTL_SPARSE_OVERALLOCATE: UInt = 590668u

public val FSCTL_SSDI_STORAGE_REQUEST: UInt = 590752u

public val FSCTL_START_VIRTUALIZATION_INSTANCE: UInt = 590784u

public val FSCTL_START_VIRTUALIZATION_INSTANCE_EX: UInt = 590848u

public val FSCTL_STORAGE_QOS_CONTROL: UInt = 590672u

public val FSCTL_STREAMS_ASSOCIATE_ID: UInt = 590792u

public val FSCTL_STREAMS_QUERY_ID: UInt = 590796u

public val FSCTL_STREAMS_QUERY_PARAMETERS: UInt = 590788u

public val FSCTL_SUSPEND_OVERLAY: UInt = 590724u

public val FSCTL_SVHDX_ASYNC_TUNNEL_REQUEST: UInt = 590692u

public val FSCTL_SVHDX_SET_INITIATOR_INFORMATION: UInt = 590600u

public val FSCTL_SVHDX_SYNC_TUNNEL_REQUEST: UInt = 590596u

public val FSCTL_TXFS_CREATE_MINIVERSION: UInt = 622972u

public val FSCTL_TXFS_CREATE_SECONDARY_RM: UInt = 622952u

public val FSCTL_TXFS_GET_METADATA_INFO: UInt = 606572u

public val FSCTL_TXFS_GET_TRANSACTED_VERSION: UInt = 606576u

public val FSCTL_TXFS_LIST_TRANSACTIONS: UInt = 606692u

public val FSCTL_TXFS_LIST_TRANSACTION_LOCKED_FILES: UInt = 606688u

public val FSCTL_TXFS_MODIFY_RM: UInt = 622916u

public val FSCTL_TXFS_QUERY_RM_INFORMATION: UInt = 606536u

public val FSCTL_TXFS_READ_BACKUP_INFORMATION: UInt = 606560u

public val FSCTL_TXFS_READ_BACKUP_INFORMATION2: UInt = 590328u

public val FSCTL_TXFS_ROLLFORWARD_REDO: UInt = 622928u

public val FSCTL_TXFS_ROLLFORWARD_UNDO: UInt = 622932u

public val FSCTL_TXFS_SAVEPOINT_INFORMATION: UInt = 622968u

public val FSCTL_TXFS_SHUTDOWN_RM: UInt = 622940u

public val FSCTL_TXFS_START_RM: UInt = 622936u

public val FSCTL_TXFS_TRANSACTION_ACTIVE: UInt = 606604u

public val FSCTL_TXFS_WRITE_BACKUP_INFORMATION: UInt = 622948u

public val FSCTL_TXFS_WRITE_BACKUP_INFORMATION2: UInt = 590336u

public val FSCTL_UNLOCK_VOLUME: UInt = 589852u

public val FSCTL_UNMAP_SPACE: UInt = 590772u

public val FSCTL_UPDATE_OVERLAY: UInt = 623416u

public val FSCTL_UPGRADE_VOLUME: UInt = 590980u

public val FSCTL_USN_TRACK_MODIFIED_RANGES: UInt = 590580u

public val FSCTL_VIRTUAL_STORAGE_PASSTHROUGH: UInt = 590884u

public val FSCTL_VIRTUAL_STORAGE_QUERY_PROPERTY: UInt = 590728u

public val FSCTL_VIRTUAL_STORAGE_SET_BEHAVIOR: UInt = 590856u

public val FSCTL_WAIT_FOR_REPAIR: UInt = 590240u

public val FSCTL_WRITE_RAW_ENCRYPTED: UInt = 590047u

public val FSCTL_WRITE_USN_CLOSE_RECORD: UInt = 590063u

public val FSCTL_WRITE_USN_REASON: UInt = 590544u

public val FS_BPIO_OP_DISABLE: FsBpioOperations = 2

public val FS_BPIO_OP_ENABLE: FsBpioOperations = 1

public val FS_BPIO_OP_GET_INFO: FsBpioOperations = 8

public val FS_BPIO_OP_MAX_OPERATION: FsBpioOperations = 9

public val FS_BPIO_OP_QUERY: FsBpioOperations = 3

public val FS_BPIO_OP_STREAM_PAUSE: FsBpioOperations = 6

public val FS_BPIO_OP_STREAM_RESUME: FsBpioOperations = 7

public val FS_BPIO_OP_VOLUME_STACK_PAUSE: FsBpioOperations = 4

public val FS_BPIO_OP_VOLUME_STACK_RESUME: FsBpioOperations = 5

public val FW_ISSUEID_NO_ISSUE: UInt = 0u

public val FW_ISSUEID_UNKNOWN: UInt = 4294967295u

public val FILE_SNAP_STATE_INACTIVE: DuplicateExtentsState = 0

public val FILE_SNAP_STATE_SOURCE: DuplicateExtentsState = 1

public val FILE_SNAP_STATE_TARGET: DuplicateExtentsState = 2

public val FILE_STORAGE_TIER_CLASS_CAPACITY: FileStorageTierClass = 1

public val FILE_STORAGE_TIER_CLASS_MAX: FileStorageTierClass = 3

public val FILE_STORAGE_TIER_CLASS_PERFORMANCE: FileStorageTierClass = 2

public val FILE_STORAGE_TIER_CLASS_UNSPECIFIED: FileStorageTierClass = 0

public val FILE_STORAGE_TIER_MEDIA_TYPE_DISK: FileStorageTierMediaType = 1

public val FILE_STORAGE_TIER_MEDIA_TYPE_MAX: FileStorageTierMediaType = 5

public val FILE_STORAGE_TIER_MEDIA_TYPE_SCM: FileStorageTierMediaType = 4

public val FILE_STORAGE_TIER_MEDIA_TYPE_SSD: FileStorageTierMediaType = 2

public val FILE_STORAGE_TIER_MEDIA_TYPE_UNSPECIFIED: FileStorageTierMediaType = 0

public val FIXED_MEDIA: MediaType = 12

public val FORM_FACTOR1_8: StorageDeviceFormFactor = 3

public val FORM_FACTOR1_8LESS: StorageDeviceFormFactor = 4

public val FORM_FACTOR2_5: StorageDeviceFormFactor = 2

public val FORM_FACTOR3_5: StorageDeviceFormFactor = 1

public val FORM_FACTOR_DIMM: StorageDeviceFormFactor = 10

public val FORM_FACTOR_EMBEDDED: StorageDeviceFormFactor = 5

public val FORM_FACTOR_M_2: StorageDeviceFormFactor = 8

public val FORM_FACTOR_MEMORY_CARD: StorageDeviceFormFactor = 6

public val FORM_FACTOR_PC_IE_BOARD: StorageDeviceFormFactor = 9

public val FORM_FACTOR_UNKNOWN: StorageDeviceFormFactor = 0

public val FORM_FACTORM_SATA: StorageDeviceFormFactor = 7

public val GET_VOLUME_BITMAP_FLAG_MASK_METADATA: UInt = 1u

public val GPT_ATTRIBUTE_LEGACY_BIOS_BOOTABLE: ULong = 4uL

public val GPT_ATTRIBUTE_NO_BLOCK_IO_PROTOCOL: ULong = 2uL

public val GPT_ATTRIBUTE_PLATFORM_REQUIRED: GptAttributes = 1uL

public val GPT_BASIC_DATA_ATTRIBUTE_DAX: ULong = 288230376151711744uL

public val GPT_BASIC_DATA_ATTRIBUTE_HIDDEN: GptAttributes = 4611686018427387904uL

public val GPT_BASIC_DATA_ATTRIBUTE_NO_DRIVE_LETTER: GptAttributes = 9223372036854775808uL

public val GPT_BASIC_DATA_ATTRIBUTE_OFFLINE: ULong = 576460752303423488uL

public val GPT_BASIC_DATA_ATTRIBUTE_READ_ONLY: GptAttributes = 1152921504606846976uL

public val GPT_BASIC_DATA_ATTRIBUTE_SERVICE: ULong = 144115188075855872uL

public val GPT_BASIC_DATA_ATTRIBUTE_SHADOW_COPY: GptAttributes = 2305843009213693952uL

public val GPT_SPACES_ATTRIBUTE_NO_METADATA: ULong = 9223372036854775808uL

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

public val HIST_NO_OF_BUCKETS: UInt = 24u

public val HITACHI_12_WO: StorageMediaType = 68

public val HEALTH_STATUS_DISABLED: StorageComponentHealthStatus = 4

public val HEALTH_STATUS_FAILED: StorageComponentHealthStatus = 5

public val HEALTH_STATUS_NORMAL: StorageComponentHealthStatus = 1

public val HEALTH_STATUS_THROTTLED: StorageComponentHealthStatus = 2

public val HEALTH_STATUS_UNKNOWN: StorageComponentHealthStatus = 0

public val HEALTH_STATUS_WARNING: StorageComponentHealthStatus = 3

public val IBM_3480: StorageMediaType = 41

public val IBM_3490E: StorageMediaType = 42

public val IBM_MAGSTAR_3590: StorageMediaType = 43

public val IBM_MAGSTAR_MP: StorageMediaType = 44

public val IDENTIFY_BUFFER_SIZE: UInt = 512u

public val ID_CMD: UInt = 236u

public val IOCTL_CHANGER_BASE: UInt = 48u

public val IOCTL_CHANGER_EXCHANGE_MEDIUM: UInt = 3162144u

public val IOCTL_CHANGER_GET_ELEMENT_STATUS: UInt = 3194900u

public val IOCTL_CHANGER_GET_PARAMETERS: UInt = 3162112u

public val IOCTL_CHANGER_GET_PRODUCT_DATA: UInt = 3162120u

public val IOCTL_CHANGER_GET_STATUS: UInt = 3162116u

public val IOCTL_CHANGER_INITIALIZE_ELEMENT_STATUS: UInt = 3162136u

public val IOCTL_CHANGER_MOVE_MEDIUM: UInt = 3162148u

public val IOCTL_CHANGER_QUERY_VOLUME_TAGS: UInt = 3194924u

public val IOCTL_CHANGER_REINITIALIZE_TRANSPORT: UInt = 3162152u

public val IOCTL_CHANGER_SET_ACCESS: UInt = 3194896u

public val IOCTL_CHANGER_SET_POSITION: UInt = 3162140u

public val IOCTL_DISK_BASE: UInt = 7u

public val IOCTL_DISK_CHECK_VERIFY: UInt = 477184u

public val IOCTL_DISK_CONTROLLER_NUMBER: UInt = 458820u

public val IOCTL_DISK_CREATE_DISK: UInt = 507992u

public val IOCTL_DISK_DELETE_DRIVE_LAYOUT: UInt = 508160u

public val IOCTL_DISK_EJECT_MEDIA: UInt = 477192u

public val IOCTL_DISK_FIND_NEW_DEVICES: UInt = 477208u

public val IOCTL_DISK_FORMAT_DRIVE: UInt = 508876u

public val IOCTL_DISK_FORMAT_TRACKS: UInt = 507928u

public val IOCTL_DISK_FORMAT_TRACKS_EX: UInt = 507948u

public val IOCTL_DISK_GET_CACHE_INFORMATION: UInt = 475348u

public val IOCTL_DISK_GET_DISK_ATTRIBUTES: UInt = 458992u

public val IOCTL_DISK_GET_DRIVE_GEOMETRY: UInt = 458752u

public val IOCTL_DISK_GET_DRIVE_GEOMETRY_EX: UInt = 458912u

public val IOCTL_DISK_GET_DRIVE_LAYOUT: UInt = 475148u

public val IOCTL_DISK_GET_DRIVE_LAYOUT_EX: UInt = 458832u

public val IOCTL_DISK_GET_LENGTH_INFO: UInt = 475228u

public val IOCTL_DISK_GET_MEDIA_TYPES: UInt = 461824u

public val IOCTL_DISK_GET_PARTITION_INFO: UInt = 475140u

public val IOCTL_DISK_GET_PARTITION_INFO_EX: UInt = 458824u

public val IOCTL_DISK_GET_WRITE_CACHE_STATE: UInt = 475356u

public val IOCTL_DISK_GROW_PARTITION: UInt = 508112u

public val IOCTL_DISK_HISTOGRAM_DATA: UInt = 458804u

public val IOCTL_DISK_HISTOGRAM_RESET: UInt = 458808u

public val IOCTL_DISK_HISTOGRAM_STRUCTURE: UInt = 458800u

public val IOCTL_DISK_IS_WRITABLE: UInt = 458788u

public val IOCTL_DISK_LOAD_MEDIA: UInt = 477196u

public val IOCTL_DISK_LOGGING: UInt = 458792u

public val IOCTL_DISK_MEDIA_REMOVAL: UInt = 477188u

public val IOCTL_DISK_PERFORMANCE: UInt = 458784u

public val IOCTL_DISK_PERFORMANCE_OFF: UInt = 458848u

public val IOCTL_DISK_REASSIGN_BLOCKS: UInt = 507932u

public val IOCTL_DISK_REASSIGN_BLOCKS_EX: UInt = 508068u

public val IOCTL_DISK_RELEASE: UInt = 477204u

public val IOCTL_DISK_REQUEST_DATA: UInt = 458816u

public val IOCTL_DISK_REQUEST_STRUCTURE: UInt = 458812u

public val IOCTL_DISK_RESERVE: UInt = 477200u

public val IOCTL_DISK_RESET_SNAPSHOT_INFO: UInt = 508432u

public val IOCTL_DISK_SENSE_DEVICE: UInt = 459744u

public val IOCTL_DISK_SET_CACHE_INFORMATION: UInt = 508120u

public val IOCTL_DISK_SET_DISK_ATTRIBUTES: UInt = 508148u

public val IOCTL_DISK_SET_DRIVE_LAYOUT: UInt = 507920u

public val IOCTL_DISK_SET_DRIVE_LAYOUT_EX: UInt = 507988u

public val IOCTL_DISK_SET_PARTITION_INFO: UInt = 507912u

public val IOCTL_DISK_SET_PARTITION_INFO_EX: UInt = 507980u

public val IOCTL_DISK_UPDATE_DRIVE_SIZE: UInt = 508104u

public val IOCTL_DISK_UPDATE_PROPERTIES: UInt = 459072u

public val IOCTL_DISK_VERIFY: UInt = 458772u

public val IOCTL_SCMBUS_BASE: UInt = 89u

public val IOCTL_SCMBUS_DEVICE_FUNCTION_BASE: UInt = 0u

public val IOCTL_SCM_BUS_GET_LOGICAL_DEVICES: UInt = 5832704u

public val IOCTL_SCM_BUS_GET_PHYSICAL_DEVICES: UInt = 5832708u

public val IOCTL_SCM_BUS_GET_REGIONS: UInt = 5832712u

public val IOCTL_SCM_BUS_QUERY_PROPERTY: UInt = 5832716u

public val IOCTL_SCM_BUS_REFRESH_NAMESPACE: UInt = 5832728u

public val IOCTL_SCM_BUS_RUNTIME_FW_ACTIVATE: UInt = 5865488u

public val IOCTL_SCM_BUS_SET_PROPERTY: UInt = 5865492u

public val IOCTL_SCM_LD_GET_INTERLEAVE_SET: UInt = 5835776u

public val IOCTL_SCM_LOGICAL_DEVICE_FUNCTION_BASE: UInt = 768u

public val IOCTL_SCM_PD_FIRMWARE_ACTIVATE: UInt = 5871624u

public val IOCTL_SCM_PD_FIRMWARE_DOWNLOAD: UInt = 5871620u

public val IOCTL_SCM_PD_PASSTHROUGH: UInt = 5888012u

public val IOCTL_SCM_PD_QUERY_PROPERTY: UInt = 5838848u

public val IOCTL_SCM_PD_REINITIALIZE_MEDIA: UInt = 5871636u

public val IOCTL_SCM_PD_SET_PROPERTY: UInt = 5871640u

public val IOCTL_SCM_PD_UPDATE_MANAGEMENT_STATUS: UInt = 5838864u

public val IOCTL_SCM_PHYSICAL_DEVICE_FUNCTION_BASE: UInt = 1536u

public val IOCTL_SERENUM_EXPOSE_HARDWARE: UInt = 3604992u

public val IOCTL_SERENUM_GET_PORT_NAME: UInt = 3605004u

public val IOCTL_SERENUM_PORT_DESC: UInt = 3605000u

public val IOCTL_SERENUM_REMOVE_HARDWARE: UInt = 3604996u

public val IOCTL_SERIAL_LSRMST_INSERT: UInt = 1769596u

public val IOCTL_STORAGE_ALLOCATE_BC_STREAM: UInt = 3004420u

public val IOCTL_STORAGE_ATTRIBUTE_MANAGEMENT: UInt = 3005596u

public val IOCTL_STORAGE_BASE: UInt = 45u

public val IOCTL_STORAGE_BC_VERSION: UInt = 1u

public val IOCTL_STORAGE_BREAK_RESERVATION: UInt = 2969620u

public val IOCTL_STORAGE_CHECK_PRIORITY_HINT_SUPPORT: UInt = 2955392u

public val IOCTL_STORAGE_CHECK_VERIFY: UInt = 2967552u

public val IOCTL_STORAGE_CHECK_VERIFY2: UInt = 2951168u

public val IOCTL_STORAGE_DEVICE_POWER_CAP: UInt = 2956436u

public val IOCTL_STORAGE_DEVICE_TELEMETRY_NOTIFY: UInt = 3002820u

public val IOCTL_STORAGE_DEVICE_TELEMETRY_QUERY_CAPS: UInt = 3002824u

public val IOCTL_STORAGE_DIAGNOSTIC: UInt = 2956448u

public val IOCTL_STORAGE_EJECTION_CONTROL: UInt = 2951488u

public val IOCTL_STORAGE_EJECT_MEDIA: UInt = 2967560u

public val IOCTL_STORAGE_ENABLE_IDLE_POWER: UInt = 2956416u

public val IOCTL_STORAGE_EVENT_NOTIFICATION: UInt = 2956432u

public val IOCTL_STORAGE_FAILURE_PREDICTION_CONFIG: UInt = 2953476u

public val IOCTL_STORAGE_FIND_NEW_DEVICES: UInt = 2967576u

public val IOCTL_STORAGE_FIRMWARE_ACTIVATE: UInt = 3005448u

public val IOCTL_STORAGE_FIRMWARE_DOWNLOAD: UInt = 3005444u

public val IOCTL_STORAGE_FIRMWARE_GET_INFO: UInt = 2956288u

public val IOCTL_STORAGE_FREE_BC_STREAM: UInt = 3004424u

public val IOCTL_STORAGE_GET_BC_PROPERTIES: UInt = 2971648u

public val IOCTL_STORAGE_GET_COUNTERS: UInt = 2953480u

public val IOCTL_STORAGE_GET_DEVICE_INTERNAL_LOG: UInt = 2956484u

public val IOCTL_STORAGE_GET_DEVICE_NUMBER: UInt = 2953344u

public val IOCTL_STORAGE_GET_DEVICE_NUMBER_EX: UInt = 2953348u

public val IOCTL_STORAGE_GET_DEVICE_TELEMETRY: UInt = 3002816u

public val IOCTL_STORAGE_GET_DEVICE_TELEMETRY_RAW: UInt = 3002828u

public val IOCTL_STORAGE_GET_HOTPLUG_INFO: UInt = 2952212u

public val IOCTL_STORAGE_GET_IDLE_POWERUP_REASON: UInt = 2956420u

public val IOCTL_STORAGE_GET_LB_PROVISIONING_MAP_RESOURCES: UInt = 2970632u

public val IOCTL_STORAGE_GET_MEDIA_SERIAL_NUMBER: UInt = 2952208u

public val IOCTL_STORAGE_GET_MEDIA_TYPES: UInt = 2952192u

public val IOCTL_STORAGE_GET_MEDIA_TYPES_EX: UInt = 2952196u

public val IOCTL_STORAGE_GET_PHYSICAL_ELEMENT_STATUS: UInt = 2956452u

public val IOCTL_STORAGE_LOAD_MEDIA: UInt = 2967564u

public val IOCTL_STORAGE_LOAD_MEDIA2: UInt = 2951180u

public val IOCTL_STORAGE_MANAGE_BYPASS_IO: UInt = 2951360u

public val IOCTL_STORAGE_MANAGE_DATA_SET_ATTRIBUTES: UInt = 2987012u

public val IOCTL_STORAGE_MCN_CONTROL: UInt = 2951492u

public val IOCTL_STORAGE_MEDIA_REMOVAL: UInt = 2967556u

public val IOCTL_STORAGE_PERSISTENT_RESERVE_IN: UInt = 2969624u

public val IOCTL_STORAGE_PERSISTENT_RESERVE_OUT: UInt = 3002396u

public val IOCTL_STORAGE_POWER_ACTIVE: UInt = 2956424u

public val IOCTL_STORAGE_POWER_IDLE: UInt = 2956428u

public val IOCTL_STORAGE_PREDICT_FAILURE: UInt = 2953472u

public val IOCTL_STORAGE_PROTOCOL_COMMAND: UInt = 3003328u

public val IOCTL_STORAGE_QUERY_PROPERTY: UInt = 2954240u

public val IOCTL_STORAGE_READ_CAPACITY: UInt = 2969920u

public val IOCTL_STORAGE_REINITIALIZE_MEDIA: UInt = 2987584u

public val IOCTL_STORAGE_RELEASE: UInt = 2967572u

public val IOCTL_STORAGE_REMOVE_ELEMENT_AND_TRUNCATE: UInt = 2956480u

public val IOCTL_STORAGE_RESERVE: UInt = 2967568u

public val IOCTL_STORAGE_RESET_BUS: UInt = 2969600u

public val IOCTL_STORAGE_RESET_DEVICE: UInt = 2969604u

public val IOCTL_STORAGE_RPMB_COMMAND: UInt = 2956440u

public val IOCTL_STORAGE_SET_HOTPLUG_INFO: UInt = 3001368u

public val IOCTL_STORAGE_SET_PROPERTY: UInt = 2987004u

public val IOCTL_STORAGE_SET_TEMPERATURE_THRESHOLD: UInt = 3002880u

public val IOCTL_STORAGE_START_DATA_INTEGRITY_CHECK: UInt = 3004548u

public val IOCTL_STORAGE_STOP_DATA_INTEGRITY_CHECK: UInt = 3004552u

public val IOMEGA_JAZ: StorageMediaType = 74

public val IOMEGA_ZIP: StorageMediaType = 73

public val KODAK_14_WO: StorageMediaType = 70

public val KEEP_PREFETCHED_DATA: DiskCacheRetentionPriority = 1

public val KEEP_READ_DATA: DiskCacheRetentionPriority = 2

public val LMR_QUERY_SESSION_INFO: LmrQueryInfoClass = 1

public val LOCK_ELEMENT: UInt = 0u

public val LOCK_UNLOCK_DOOR: UInt = 2u

public val LOCK_UNLOCK_IEPORT: UInt = 1u

public val LOCK_UNLOCK_KEYPAD: UInt = 4u

public val LOOKUP_STREAM_FROM_CLUSTER_ENTRY_ATTRIBUTE_DATA: UInt = 16777216u

public val LOOKUP_STREAM_FROM_CLUSTER_ENTRY_ATTRIBUTE_INDEX: UInt = 33554432u

public val LOOKUP_STREAM_FROM_CLUSTER_ENTRY_ATTRIBUTE_MASK: UInt = 4278190080u

public val LOOKUP_STREAM_FROM_CLUSTER_ENTRY_ATTRIBUTE_SYSTEM: UInt = 50331648u

public val LOOKUP_STREAM_FROM_CLUSTER_ENTRY_FLAG_DENY_DEFRAG_SET: UInt = 2u

public val LOOKUP_STREAM_FROM_CLUSTER_ENTRY_FLAG_FS_SYSTEM_FILE: UInt = 4u

public val LOOKUP_STREAM_FROM_CLUSTER_ENTRY_FLAG_PAGE_FILE: UInt = 1u

public val LOOKUP_STREAM_FROM_CLUSTER_ENTRY_FLAG_TXF_SYSTEM_FILE: UInt = 8u

public val LTO_ACCELIS: StorageMediaType = 87

public val LTO_ULTRIUM: StorageMediaType = 86

public val MARK_HANDLE_CLOUD_SYNC: UInt = 2048u

public val MARK_HANDLE_DISABLE_FILE_METADATA_OPTIMIZATION: UInt = 4096u

public val MARK_HANDLE_ENABLE_CPU_CACHE: UInt = 268435456u

public val MARK_HANDLE_ENABLE_USN_SOURCE_ON_PAGING_IO: UInt = 8192u

public val MARK_HANDLE_FILTER_METADATA: UInt = 512u

public val MARK_HANDLE_NOT_READ_COPY: UInt = 256u

public val MARK_HANDLE_NOT_REALTIME: UInt = 64u

public val MARK_HANDLE_NOT_TXF_SYSTEM_LOG: UInt = 8u

public val MARK_HANDLE_PROTECT_CLUSTERS: UInt = 1u

public val MARK_HANDLE_READ_COPY: UInt = 128u

public val MARK_HANDLE_REALTIME: UInt = 32u

public val MARK_HANDLE_RETURN_PURGE_FAILURE: UInt = 1024u

public val MARK_HANDLE_SKIP_COHERENCY_SYNC_DISALLOW_WRITES: UInt = 16384u

public val MARK_HANDLE_SUPPRESS_VOLUME_OPEN_FLUSH: UInt = 32768u

public val MARK_HANDLE_TXF_SYSTEM_LOG: UInt = 4u

public val MAXIMUM_ENCRYPTION_VALUE: UInt = 4u

public val MAX_FW_BUCKET_ID_LENGTH: UInt = 132u

public val MAX_INTERFACE_CODES: UInt = 8u

public val MAX_VOLUME_ID_SIZE: UInt = 36u

public val MAX_VOLUME_TEMPLATE_SIZE: UInt = 40u

public val MEDIA_CURRENTLY_MOUNTED: UInt = 2147483648u

public val MEDIA_ERASEABLE: UInt = 1u

public val MEDIA_READ_ONLY: UInt = 4u

public val MEDIA_READ_WRITE: UInt = 8u

public val MEDIA_WRITE_ONCE: UInt = 2u

public val MEDIA_WRITE_PROTECTED: UInt = 256u

public val METHOD_BUFFERED: UInt = 0u

public val METHOD_DIRECT_FROM_HARDWARE: UInt = 2u

public val METHOD_DIRECT_TO_HARDWARE: UInt = 1u

public val METHOD_IN_DIRECT: UInt = 1u

public val METHOD_NEITHER: UInt = 3u

public val METHOD_OUT_DIRECT: UInt = 2u

public val MO_3_RW: StorageMediaType = 57

public val MO_5_LIMDOW: StorageMediaType = 60

public val MO_5_RW: StorageMediaType = 59

public val MO_5_WO: StorageMediaType = 58

public val MO_NFR_525: StorageMediaType = 71

public val MP2_8MM: StorageMediaType = 79

public val MP_8MM: StorageMediaType = 36

public val MINI_QIC: StorageMediaType = 33

public val NCTP: StorageMediaType = 40

public val NIKON_12_RW: StorageMediaType = 72

public val NV_ME_DATA_TYPE_FEATURE: StorageProtocolNvmeDataType = 3

public val NV_ME_DATA_TYPE_IDENTIFY: StorageProtocolNvmeDataType = 1

public val NV_ME_DATA_TYPE_LOG_PAGE: StorageProtocolNvmeDataType = 2

public val NV_ME_DATA_TYPE_UNKNOWN: StorageProtocolNvmeDataType = 0

public val OBSOLETE_DISK_GET_WRITE_CACHE_STATE: UInt = 475356u

public val OBSOLETE_IOCTL_STORAGE_RESET_BUS: UInt = 3002368u

public val OBSOLETE_IOCTL_STORAGE_RESET_DEVICE: UInt = 3002372u

public val OFFLOAD_READ_FLAG_ALL_ZERO_BEYOND_CURRENT_RANGE: UInt = 1u

public val OPLOCK_LEVEL_CACHE_HANDLE: UInt = 2u

public val OPLOCK_LEVEL_CACHE_READ: UInt = 1u

public val OPLOCK_LEVEL_CACHE_WRITE: UInt = 4u

public val PARTIITON_OS_DATA: UInt = 41u

public val PARTITION_BSP: UInt = 43u

public val PARTITION_DM: UInt = 84u

public val PARTITION_DPP: UInt = 44u

public val PARTITION_ENTRY_UNUSED: UInt = 0u

public val PARTITION_EXTENDED: UInt = 5u

public val PARTITION_EZDRIVE: UInt = 85u

public val PARTITION_FAT32: UInt = 11u

public val PARTITION_FAT32_XINT13: UInt = 12u

public val PARTITION_FAT_12: UInt = 1u

public val PARTITION_FAT_16: UInt = 4u

public val PARTITION_GPT: UInt = 238u

public val PARTITION_HUGE: UInt = 6u

public val PARTITION_IFS: UInt = 7u

public val PARTITION_LDM: UInt = 66u

public val PARTITION_MAIN_OS: UInt = 40u

public val PARTITION_MSFT_RECOVERY: UInt = 39u

public val PARTITION_NTFT: UInt = 128u

public val PARTITION_OS2BOOTMGR: UInt = 10u

public val PARTITION_PREP: UInt = 65u

public val PARTITION_PRE_INSTALLED: UInt = 42u

public val PARTITION_SPACES: UInt = 231u

public val PARTITION_SPACES_DATA: UInt = 215u

public val PARTITION_STYLE_GPT: PartitionStyle = 1

public val PARTITION_STYLE_MBR: PartitionStyle = 0

public val PARTITION_STYLE_RAW: PartitionStyle = 2

public val PARTITION_SYSTEM: UInt = 239u

public val PARTITION_UNIX: UInt = 99u

public val PARTITION_WINDOWS_SYSTEM: UInt = 45u

public val PARTITION_XENIX_1: UInt = 2u

public val PARTITION_XENIX_2: UInt = 3u

public val PARTITION_XINT13: UInt = 14u

public val PARTITION_XINT13_EXTENDED: UInt = 15u

public val PC_5_RW: StorageMediaType = 62

public val PC_5_WO: StorageMediaType = 61

public val PD_5_RW: StorageMediaType = 63

public val PERSISTENT_VOLUME_STATE_BACKED_BY_WIM: UInt = 64u

public val PERSISTENT_VOLUME_STATE_CHKDSK_RAN_ONCE: UInt = 1024u

public val PERSISTENT_VOLUME_STATE_CONTAINS_BACKING_WIM: UInt = 32u

public val PERSISTENT_VOLUME_STATE_DAX_FORMATTED: UInt = 4096u

public val PERSISTENT_VOLUME_STATE_DEV_VOLUME: UInt = 8192u

public val PERSISTENT_VOLUME_STATE_GLOBAL_METADATA_NO_SEEK_PENALTY: UInt = 4u

public val PERSISTENT_VOLUME_STATE_LOCAL_METADATA_NO_SEEK_PENALTY: UInt = 8u

public val PERSISTENT_VOLUME_STATE_MODIFIED_BY_CHKDSK: UInt = 2048u

public val PERSISTENT_VOLUME_STATE_NO_HEAT_GATHERING: UInt = 16u

public val PERSISTENT_VOLUME_STATE_NO_WRITE_AUTO_TIERING: UInt = 128u

public val PERSISTENT_VOLUME_STATE_REALLOCATE_ALL_DATA_WRITES: UInt = 512u

public val PERSISTENT_VOLUME_STATE_SHORT_NAME_CREATION_DISABLED: UInt = 1u

public val PERSISTENT_VOLUME_STATE_TRUSTED_VOLUME: UInt = 16384u

public val PERSISTENT_VOLUME_STATE_TXF_DISABLED: UInt = 256u

public val PERSISTENT_VOLUME_STATE_VOLUME_SCRUB_DISABLED: UInt = 2u

public val PHILIPS_12_WO: StorageMediaType = 67

public val PINNACLE_APEX_5_RW: StorageMediaType = 65

public val PRODUCT_ID_LENGTH: UInt = 16u

public val PROJFS_PROTOCOL_VERSION: UInt = 3u

public val PROPERTY_EXISTS_QUERY: StorageQueryType = 1

public val PROPERTY_EXISTS_SET: StorageSetType = 1

public val PROPERTY_MASK_QUERY: StorageQueryType = 2

public val PROPERTY_QUERY_MAX_DEFINED: StorageQueryType = 3

public val PROPERTY_SET_MAX_DEFINED: StorageSetType = 2

public val PROPERTY_STANDARD_QUERY: StorageQueryType = 0

public val PROPERTY_STANDARD_SET: StorageSetType = 0

public val PROTOCOL_TYPE_ATA: StorageProtocolType = 2

public val PROTOCOL_TYPE_MAX_RESERVED: StorageProtocolType = 127

public val PROTOCOL_TYPE_NVME: StorageProtocolType = 3

public val PROTOCOL_TYPE_PROPRIETARY: StorageProtocolType = 126

public val PROTOCOL_TYPE_SCSI: StorageProtocolType = 1

public val PROTOCOL_TYPE_SD: StorageProtocolType = 4

public val PROTOCOL_TYPE_UFS: StorageProtocolType = 5

public val PROTOCOL_TYPE_UNKNOWN: StorageProtocolType = 0

public val QIC: StorageMediaType = 35

public val QUERY_DEPENDENT_VOLUME_REQUEST_FLAG_GUEST_VOLUMES: UInt = 2u

public val QUERY_DEPENDENT_VOLUME_REQUEST_FLAG_HOST_VOLUMES: UInt = 1u

public val QUERY_FILE_LAYOUT_FILTER_TYPE_CLUSTERS: QueryFileLayoutFilterType = 1

public val QUERY_FILE_LAYOUT_FILTER_TYPE_FILEID: QueryFileLayoutFilterType = 2

public val QUERY_FILE_LAYOUT_FILTER_TYPE_NONE: QueryFileLayoutFilterType = 0

public val QUERY_FILE_LAYOUT_FILTER_TYPE_STORAGE_RESERVE_ID: QueryFileLayoutFilterType = 3

public val QUERY_FILE_LAYOUT_INCLUDE_EXTENTS: UInt = 8u

public val QUERY_FILE_LAYOUT_INCLUDE_EXTRA_INFO: UInt = 16u

public val QUERY_FILE_LAYOUT_INCLUDE_FILES_WITH_DSC_ATTRIBUTE: UInt = 4096u

public val QUERY_FILE_LAYOUT_INCLUDE_FULL_PATH_IN_NAMES: UInt = 64u

public val QUERY_FILE_LAYOUT_INCLUDE_NAMES: UInt = 2u

public val QUERY_FILE_LAYOUT_INCLUDE_ONLY_FILES_WITH_SPECIFIC_ATTRIBUTES: UInt = 2048u

public val QUERY_FILE_LAYOUT_INCLUDE_STREAMS: UInt = 4u

public val QUERY_FILE_LAYOUT_INCLUDE_STREAMS_WITH_NO_CLUSTERS_ALLOCATED: UInt = 32u

public val QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION: UInt = 128u

public val QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_DATA_ATTRIBUTE: UInt = 8192u

public val QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_DSC_ATTRIBUTE: UInt = 256u

public val QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_EA_ATTRIBUTE: UInt = 32768u

public val QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_EFS_ATTRIBUTE: UInt = 1024u

public val QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_REPARSE_ATTRIBUTE: UInt = 16384u

public val QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_TXF_ATTRIBUTE: UInt = 512u

public val QUERY_FILE_LAYOUT_NUM_FILTER_TYPES: QueryFileLayoutFilterType = 4

public val QUERY_FILE_LAYOUT_REPARSE_DATA_INVALID: UInt = 1u

public val QUERY_FILE_LAYOUT_REPARSE_TAG_INVALID: UInt = 2u

public val QUERY_FILE_LAYOUT_RESTART: UInt = 1u

public val QUERY_FILE_LAYOUT_SINGLE_INSTANCED: UInt = 1u

public val QUERY_STORAGE_CLASSES_FLAGS_MEASURE_READ: UInt = 1073741824u

public val QUERY_STORAGE_CLASSES_FLAGS_MEASURE_WRITE: UInt = 2147483648u

public val QUERY_STORAGE_CLASSES_FLAGS_NO_DEFRAG_VOLUME: UInt = 536870912u

public val READ_ATTRIBUTES: UInt = 208u

public val READ_ATTRIBUTE_BUFFER_SIZE: UInt = 512u

public val READ_COMPRESSION_INFO_VALID: UInt = 32u

public val READ_COPY_NUMBER_BYPASS_CACHE_FLAG: UInt = 256u

public val READ_COPY_NUMBER_KEY: UInt = 1380142592u

public val READ_THRESHOLDS: UInt = 209u

public val READ_THRESHOLD_BUFFER_SIZE: UInt = 512u

public val RECOVERED_READS_VALID: UInt = 4u

public val RECOVERED_WRITES_VALID: UInt = 1u

public val REFS_SMR_VOLUME_GC_PARAMETERS_VERSION_V1: UInt = 1u

public val REFS_SMR_VOLUME_INFO_OUTPUT_VERSION_V0: UInt = 0u

public val REFS_SMR_VOLUME_INFO_OUTPUT_VERSION_V1: UInt = 1u

public val REPLACE_ALTERNATE: UInt = 11u

public val REPLACE_PRIMARY: UInt = 10u

public val REQUEST_OPLOCK_CURRENT_VERSION: UInt = 1u

public val REQUEST_OPLOCK_INPUT_FLAG_ACK: UInt = 2u

public val REQUEST_OPLOCK_INPUT_FLAG_COMPLETE_ACK_ON_CLOSE: UInt = 4u

public val REQUEST_OPLOCK_INPUT_FLAG_REQUEST: UInt = 1u

public val REQUEST_OPLOCK_OUTPUT_FLAG_ACK_REQUIRED: UInt = 1u

public val REQUEST_OPLOCK_OUTPUT_FLAG_MODES_PROVIDED: UInt = 2u

public val REQUEST_OPLOCK_OUTPUT_FLAG_WRITABLE_SECTION_PRESENT: UInt = 4u

public val RETRACT_IEPORT: UInt = 3u

public val RETURN_SMART_STATUS: UInt = 218u

public val REVISION_LENGTH: UInt = 4u

public val REMOVABLE_MEDIA: MediaType = 11

public val REQUEST_LOCATION: BinTypes = 1

public val REQUEST_SIZE: BinTypes = 0

public val SAIT: StorageMediaType = 93

public val SAVE_ATTRIBUTE_VALUES: UInt = 211u

public val SCM_MAX_SYMLINK_LEN_IN_CHARS: UInt = 256u

public val SCM_PD_FIRMWARE_LAST_DOWNLOAD: UInt = 1u

public val SCM_PD_FIRMWARE_REVISION_LENGTH_BYTES: UInt = 32u

public val SCM_PD_MAX_OPERATIONAL_STATUS: UInt = 16u

public val SCM_PD_PROPERTY_NAME_LENGTH_IN_CHARS: UInt = 128u

public val SD_GLOBAL_CHANGE_TYPE_ENUM_SDS: UInt = 131072u

public val SD_GLOBAL_CHANGE_TYPE_MACHINE_SID: UInt = 1u

public val SD_GLOBAL_CHANGE_TYPE_QUERY_STATS: UInt = 65536u

public val SEARCH_ALL: UInt = 0u

public val SEARCH_ALL_NO_SEQ: UInt = 4u

public val SEARCH_ALTERNATE: UInt = 2u

public val SEARCH_ALT_NO_SEQ: UInt = 6u

public val SEARCH_PRIMARY: UInt = 1u

public val SEARCH_PRI_NO_SEQ: UInt = 5u

public val SERIAL_IOC_FCR_DMA_MODE: UInt = 8u

public val SERIAL_IOC_FCR_FIFO_ENABLE: UInt = 1u

public val SERIAL_IOC_FCR_RCVR_RESET: UInt = 2u

public val SERIAL_IOC_FCR_RCVR_TRIGGER_LSB: UInt = 64u

public val SERIAL_IOC_FCR_RCVR_TRIGGER_MSB: UInt = 128u

public val SERIAL_IOC_FCR_RES1: UInt = 16u

public val SERIAL_IOC_FCR_RES2: UInt = 32u

public val SERIAL_IOC_FCR_XMIT_RESET: UInt = 4u

public val SERIAL_IOC_MCR_DTR: UInt = 1u

public val SERIAL_IOC_MCR_LOOP: UInt = 16u

public val SERIAL_IOC_MCR_OUT1: UInt = 4u

public val SERIAL_IOC_MCR_OUT2: UInt = 8u

public val SERIAL_IOC_MCR_RTS: UInt = 2u

public val SERIAL_NUMBER_LENGTH: UInt = 32u

public val SET_PURGE_FAILURE_MODE_DISABLED: UInt = 2u

public val SET_PURGE_FAILURE_MODE_ENABLED: UInt = 1u

public val SET_REPAIR_DISABLED_AND_BUGCHECK_ON_CORRUPT: UInt = 16u

public val SET_REPAIR_ENABLED: UInt = 1u

public val SET_REPAIR_VALID_MASK: UInt = 25u

public val SET_REPAIR_WARN_ABOUT_DATA_LOSS: UInt = 8u

public val SMART_ABORT_OFFLINE_SELFTEST: UInt = 127u

public val SMART_CMD: UInt = 176u

public val SMART_CYL_HI: UInt = 194u

public val SMART_CYL_LOW: UInt = 79u

public val SMART_ERROR_NO_MEM: UInt = 7u

public val SMART_EXTENDED_SELFTEST_CAPTIVE: UInt = 130u

public val SMART_EXTENDED_SELFTEST_OFFLINE: UInt = 2u

public val SMART_GET_VERSION: UInt = 475264u

public val SMART_IDE_ERROR: UInt = 1u

public val SMART_INVALID_BUFFER: UInt = 4u

public val SMART_INVALID_COMMAND: UInt = 3u

public val SMART_INVALID_DRIVE: UInt = 5u

public val SMART_INVALID_FLAG: UInt = 2u

public val SMART_INVALID_IOCTL: UInt = 6u

public val SMART_INVALID_REGISTER: UInt = 8u

public val SMART_LOG_SECTOR_SIZE: UInt = 512u

public val SMART_NOT_SUPPORTED: UInt = 9u

public val SMART_NO_ERROR: UInt = 0u

public val SMART_NO_IDE_DEVICE: UInt = 10u

public val SMART_OFFLINE_ROUTINE_OFFLINE: UInt = 0u

public val SMART_RCV_DRIVE_DATA: UInt = 508040u

public val SMART_RCV_DRIVE_DATA_EX: UInt = 458892u

public val SMART_READ_LOG: UInt = 213u

public val SMART_SEND_DRIVE_COMMAND: UInt = 508036u

public val SMART_SHORT_SELFTEST_CAPTIVE: UInt = 129u

public val SMART_SHORT_SELFTEST_OFFLINE: UInt = 1u

public val SMART_WRITE_LOG: UInt = 214u

public val SONY_12_WO: StorageMediaType = 66

public val SONY_D2: StorageMediaType = 49

public val SONY_DTF: StorageMediaType = 46

public val SPACES_TRACKED_OFFSET_HEADER_FLAG: UInt = 2u

public val SRB_TYPE_SCSI_REQUEST_BLOCK: UInt = 0u

public val SRB_TYPE_STORAGE_REQUEST_BLOCK: UInt = 1u

public val STK_9840: StorageMediaType = 85

public val STK_9940: StorageMediaType = 92

public val STK_DATA_D3: StorageMediaType = 45

public val STORAGE_ADAPTER_SERIAL_NUMBER_V1_MAX_LENGTH: UInt = 128u

public val STORAGE_ADDRESS_TYPE_BTL8: UInt = 0u

public val STORAGE_ATTRIBUTE_ASYNC_EVENT_NOTIFICATION: UInt = 16u

public val STORAGE_ATTRIBUTE_BLOCK_IO: UInt = 2u

public val STORAGE_ATTRIBUTE_BYTE_ADDRESSABLE_IO: UInt = 1u

public val STORAGE_ATTRIBUTE_DYNAMIC_PERSISTENCE: UInt = 4u

public val STORAGE_ATTRIBUTE_PERF_SIZE_INDEPENDENT: UInt = 32u

public val STORAGE_ATTRIBUTE_VOLATILE: UInt = 8u

public val STORAGE_COMPONENT_ROLE_CACHE: UInt = 1u

public val STORAGE_COMPONENT_ROLE_DATA: UInt = 4u

public val STORAGE_COMPONENT_ROLE_TIERING: UInt = 2u

public val STORAGE_CRASH_TELEMETRY_REGKEY: Pcwstr = w("\\Registry\\Machine\\System\\CurrentControlSet\\Control\\CrashControl\\StorageTelemetry")

public val STORAGE_CRYPTO_CAPABILITY_VERSION_1: UInt = 1u

public val STORAGE_CRYPTO_DESCRIPTOR_VERSION_1: UInt = 1u

public val STORAGE_DEVICE_FLAGS_PAGE_83_DEVICEGUID: UInt = 4u

public val STORAGE_DEVICE_FLAGS_RANDOM_DEVICEGUID_REASON_CONFLICT: UInt = 1u

public val STORAGE_DEVICE_FLAGS_RANDOM_DEVICEGUID_REASON_NOHWID: UInt = 2u

public val STORAGE_DEVICE_MAX_OPERATIONAL_STATUS: UInt = 16u

public val STORAGE_DEVICE_NUMA_NODE_UNKNOWN: UInt = 4294967295u

public val STORAGE_DEVICE_POWER_CAP_VERSION_V1: UInt = 1u

public val STORAGE_DEVICE_TELEMETRY_REGKEY: Pcwstr = w("\\Registry\\Machine\\System\\CurrentControlSet\\Control\\Storage\\StorageTelemetry")

public val STORAGE_DIAGNOSTIC_FLAG_ADAPTER_REQUEST: UInt = 1u

public val STORAGE_EVENT_DEVICE_OPERATION: ULong = 4uL

public val STORAGE_EVENT_DEVICE_STATUS: ULong = 2uL

public val STORAGE_EVENT_MEDIA_STATUS: ULong = 1uL

public val STORAGE_EVENT_NOTIFICATION_VERSION_V1: UInt = 1u

public val STORAGE_FAILURE_PREDICTION_CONFIG_V1: UInt = 1u

public val STORAGE_HW_FIRMWARE_INVALID_SLOT: UInt = 255u

public val STORAGE_HW_FIRMWARE_REQUEST_FLAG_CONTROLLER: UInt = 1u

public val STORAGE_HW_FIRMWARE_REQUEST_FLAG_FIRST_SEGMENT: UInt = 4u

public val STORAGE_HW_FIRMWARE_REQUEST_FLAG_LAST_SEGMENT: UInt = 2u

public val STORAGE_HW_FIRMWARE_REQUEST_FLAG_REPLACE_EXISTING_IMAGE: UInt = 1073741824u

public val STORAGE_HW_FIRMWARE_REQUEST_FLAG_SWITCH_TO_EXISTING_FIRMWARE: UInt = 2147483648u

public val STORAGE_HW_FIRMWARE_REVISION_LENGTH: UInt = 16u

public val STORAGE_IDLE_POWERUP_REASON_VERSION_V1: UInt = 1u

public val STORAGE_OFFLOAD_MAX_TOKEN_LENGTH: UInt = 512u

public val STORAGE_OFFLOAD_READ_RANGE_TRUNCATED: UInt = 1u

public val STORAGE_OFFLOAD_TOKEN_ID_LENGTH: UInt = 504u

public val STORAGE_OFFLOAD_TOKEN_INVALID: UInt = 2u

public val STORAGE_OFFLOAD_TOKEN_TYPE_ZERO_DATA: UInt = 4294901761u

public val STORAGE_OFFLOAD_WRITE_RANGE_TRUNCATED: UInt = 1u

public val STORAGE_PRIORITY_HINT_SUPPORTED: UInt = 1u

public val STORAGE_PROTOCOL_COMMAND_FLAG_ADAPTER_REQUEST: UInt = 2147483648u

public val STORAGE_PROTOCOL_COMMAND_LENGTH_NVME: UInt = 64u

public val STORAGE_PROTOCOL_SPECIFIC_NVME_ADMIN_COMMAND: UInt = 1u

public val STORAGE_PROTOCOL_SPECIFIC_NVME_NVM_COMMAND: UInt = 2u

public val STORAGE_PROTOCOL_STATUS_BUSY: UInt = 5u

public val STORAGE_PROTOCOL_STATUS_DATA_OVERRUN: UInt = 6u

public val STORAGE_PROTOCOL_STATUS_ERROR: UInt = 2u

public val STORAGE_PROTOCOL_STATUS_INSUFFICIENT_RESOURCES: UInt = 7u

public val STORAGE_PROTOCOL_STATUS_INVALID_REQUEST: UInt = 3u

public val STORAGE_PROTOCOL_STATUS_NOT_SUPPORTED: UInt = 255u

public val STORAGE_PROTOCOL_STATUS_NO_DEVICE: UInt = 4u

public val STORAGE_PROTOCOL_STATUS_PENDING: UInt = 0u

public val STORAGE_PROTOCOL_STATUS_SUCCESS: UInt = 1u

public val STORAGE_PROTOCOL_STATUS_THROTTLED_REQUEST: UInt = 8u

public val STORAGE_PROTOCOL_STRUCTURE_VERSION: UInt = 1u

public val STORAGE_RPMB_DESCRIPTOR_VERSION_1: UInt = 1u

public val STORAGE_RPMB_MINIMUM_RELIABLE_WRITE_SIZE: UInt = 512u

public val STORAGE_SUPPORTED_FEATURES_BYPASS_IO: UInt = 1u

public val STORAGE_SUPPORTED_FEATURES_MASK: UInt = 1u

public val STORAGE_TEMPERATURE_THRESHOLD_FLAG_ADAPTER_REQUEST: UInt = 1u

public val STORAGE_TEMPERATURE_VALUE_NOT_REPORTED: UInt = 32768u

public val STORAGE_TIER_DESCRIPTION_LENGTH: UInt = 512u

public val STORAGE_TIER_FLAG_NO_SEEK_PENALTY: UInt = 131072u

public val STORAGE_TIER_FLAG_PARITY: UInt = 8388608u

public val STORAGE_TIER_FLAG_READ_CACHE: UInt = 4194304u

public val STORAGE_TIER_FLAG_SMR: UInt = 16777216u

public val STORAGE_TIER_FLAG_WRITE_BACK_CACHE: UInt = 2097152u

public val STORAGE_TIER_NAME_LENGTH: UInt = 256u

public val STORATTRIBUTE_MANAGEMENT_STATE: UInt = 1u

public val STORATTRIBUTE_NONE: UInt = 0u

public val STREAMS_ASSOCIATE_ID_CLEAR: UInt = 1u

public val STREAMS_ASSOCIATE_ID_SET: UInt = 2u

public val STREAMS_INVALID_ID: UInt = 0u

public val STREAMS_MAX_ID: UInt = 65535u

public val STREAM_CLEAR_ENCRYPTION: UInt = 4u

public val STREAM_EXTENT_ENTRY_ALL_EXTENTS: UInt = 2u

public val STREAM_EXTENT_ENTRY_AS_RETRIEVAL_POINTERS: UInt = 1u

public val STREAM_LAYOUT_ENTRY_HAS_INFORMATION: UInt = 16u

public val STREAM_LAYOUT_ENTRY_IMMOVABLE: UInt = 1u

public val STREAM_LAYOUT_ENTRY_NO_CLUSTERS_ALLOCATED: UInt = 8u

public val STREAM_LAYOUT_ENTRY_PINNED: UInt = 2u

public val STREAM_LAYOUT_ENTRY_RESIDENT: UInt = 4u

public val STREAM_SET_ENCRYPTION: UInt = 3u

public val SYQUEST_EZ135: StorageMediaType = 75

public val SYQUEST_EZFLYER: StorageMediaType = 76

public val SYQUEST_SYJET: StorageMediaType = 77

public val SCM_BUS_FIRMWARE_ACTIVATION_STATE_ARMED: ScmBusFirmwareActivationState = 1

public val SCM_BUS_FIRMWARE_ACTIVATION_STATE_BUSY: ScmBusFirmwareActivationState = 2

public val SCM_BUS_FIRMWARE_ACTIVATION_STATE_IDLE: ScmBusFirmwareActivationState = 0

public val SCM_BUS_PROPERTY_DEDICATED_MEMORY_INFO: ScmBusPropertyId = 1

public val SCM_BUS_PROPERTY_DEDICATED_MEMORY_STATE: ScmBusPropertyId = 2

public val SCM_BUS_PROPERTY_MAX: ScmBusPropertyId = 3

public val SCM_BUS_PROPERTY_RUNTIME_FW_ACTIVATION_INFO: ScmBusPropertyId = 0

public val SCM_BUS_QUERY_DESCRIPTOR: ScmBusQueryType = 0

public val SCM_BUS_QUERY_IS_SUPPORTED: ScmBusQueryType = 1

public val SCM_BUS_QUERY_MAX: ScmBusQueryType = 2

public val SCM_BUS_SET_DESCRIPTOR: ScmBusSetType = 0

public val SCM_BUS_SET_IS_SUPPORTED: ScmBusSetType = 1

public val SCM_BUS_SET_MAX: ScmBusSetType = 2

public val SCM_PD_FIRMWARE_ACTIVATION_STATE_ARMED: ScmPdFirmwareActivationState = 1

public val SCM_PD_FIRMWARE_ACTIVATION_STATE_BUSY: ScmPdFirmwareActivationState = 2

public val SCM_PD_FIRMWARE_ACTIVATION_STATE_IDLE: ScmPdFirmwareActivationState = 0

public val SCM_PD_LAST_FW_ACTIVAITON_STATUS_ACTIVATION_IN_PROGRESS: ScmPdLastFwActivationStatus = 4

public val SCM_PD_LAST_FW_ACTIVAITON_STATUS_FW_UNSUPPORTED: ScmPdLastFwActivationStatus = 6

public val SCM_PD_LAST_FW_ACTIVAITON_STATUS_RETRY: ScmPdLastFwActivationStatus = 5

public val SCM_PD_LAST_FW_ACTIVAITON_STATUS_UNKNOWN_ERROR: ScmPdLastFwActivationStatus = 7

public val SCM_PD_LAST_FW_ACTIVATION_STATUS_COLD_REBOOT_REQUIRED: ScmPdLastFwActivationStatus = 3

public val SCM_PD_LAST_FW_ACTIVATION_STATUS_FW_NOT_FOUND: ScmPdLastFwActivationStatus = 2

public val SCM_PD_LAST_FW_ACTIVATION_STATUS_NONE: ScmPdLastFwActivationStatus = 0

public val SCM_PD_LAST_FW_ACTIVATION_STATUS_SUCCESS: ScmPdLastFwActivationStatus = 1

public val SCM_PHYSICAL_DEVICE_HEALTH_HEALTHY: ScmPdHealthStatus = 3

public val SCM_PHYSICAL_DEVICE_HEALTH_MAX: ScmPdHealthStatus = 4

public val SCM_PHYSICAL_DEVICE_HEALTH_UNHEALTHY: ScmPdHealthStatus = 1

public val SCM_PHYSICAL_DEVICE_HEALTH_UNKNOWN: ScmPdHealthStatus = 0

public val SCM_PHYSICAL_DEVICE_HEALTH_WARNING: ScmPdHealthStatus = 2

public val SCM_PHYSICAL_DEVICE_OP_REASON_BACKGROUND_OPERATION: ScmPdOperationalStatusReason = 9

public val SCM_PHYSICAL_DEVICE_OP_REASON_COMPONENT: ScmPdOperationalStatusReason = 8

public val SCM_PHYSICAL_DEVICE_OP_REASON_CONFIGURATION: ScmPdOperationalStatusReason = 5

public val SCM_PHYSICAL_DEVICE_OP_REASON_DATA_PERSISTENCE_LOSS_IMMINENT: ScmPdOperationalStatusReason = 17

public val SCM_PHYSICAL_DEVICE_OP_REASON_DEVICE_CONTROLLER: ScmPdOperationalStatusReason = 6

public val SCM_PHYSICAL_DEVICE_OP_REASON_DISABLED_BY_PLATFORM: ScmPdOperationalStatusReason = 13

public val SCM_PHYSICAL_DEVICE_OP_REASON_ENERGY_SOURCE: ScmPdOperationalStatusReason = 4

public val SCM_PHYSICAL_DEVICE_OP_REASON_EXCESSIVE_TEMPERATURE: ScmPdOperationalStatusReason = 21

public val SCM_PHYSICAL_DEVICE_OP_REASON_FATAL_ERROR: ScmPdOperationalStatusReason = 16

public val SCM_PHYSICAL_DEVICE_OP_REASON_HEALTH_CHECK: ScmPdOperationalStatusReason = 11

public val SCM_PHYSICAL_DEVICE_OP_REASON_INTERNAL_FAILURE: ScmPdOperationalStatusReason = 22

public val SCM_PHYSICAL_DEVICE_OP_REASON_INVALID_FIRMWARE: ScmPdOperationalStatusReason = 10

public val SCM_PHYSICAL_DEVICE_OP_REASON_LOST_DATA: ScmPdOperationalStatusReason = 3

public val SCM_PHYSICAL_DEVICE_OP_REASON_LOST_DATA_PERSISTENCE: ScmPdOperationalStatusReason = 12

public val SCM_PHYSICAL_DEVICE_OP_REASON_LOST_WRITE_PERSISTENCE: ScmPdOperationalStatusReason = 15

public val SCM_PHYSICAL_DEVICE_OP_REASON_MAX: ScmPdOperationalStatusReason = 23

public val SCM_PHYSICAL_DEVICE_OP_REASON_MEDIA: ScmPdOperationalStatusReason = 1

public val SCM_PHYSICAL_DEVICE_OP_REASON_MEDIA_CONTROLLER: ScmPdOperationalStatusReason = 7

public val SCM_PHYSICAL_DEVICE_OP_REASON_MEDIA_REMAINING_SPARE_BLOCK: ScmPdOperationalStatusReason = 19

public val SCM_PHYSICAL_DEVICE_OP_REASON_PERFORMANCE_DEGRADATION: ScmPdOperationalStatusReason = 20

public val SCM_PHYSICAL_DEVICE_OP_REASON_PERMANENT_ERROR: ScmPdOperationalStatusReason = 14

public val SCM_PHYSICAL_DEVICE_OP_REASON_THRESHOLD_EXCEEDED: ScmPdOperationalStatusReason = 2

public val SCM_PHYSICAL_DEVICE_OP_REASON_UNKNOWN: ScmPdOperationalStatusReason = 0

public val SCM_PHYSICAL_DEVICE_OP_REASON_WRITE_PERSISTENCE_LOSS_IMMINENT: ScmPdOperationalStatusReason = 18

public val SCM_PHYSICAL_DEVICE_OP_STATUS_HARDWARE_ERROR: ScmPdOperationalStatus = 4

public val SCM_PHYSICAL_DEVICE_OP_STATUS_IN_SERVICE: ScmPdOperationalStatus = 3

public val SCM_PHYSICAL_DEVICE_OP_STATUS_MAX: ScmPdOperationalStatus = 8

public val SCM_PHYSICAL_DEVICE_OP_STATUS_MISSING: ScmPdOperationalStatus = 7

public val SCM_PHYSICAL_DEVICE_OP_STATUS_NOT_USABLE: ScmPdOperationalStatus = 5

public val SCM_PHYSICAL_DEVICE_OP_STATUS_OK: ScmPdOperationalStatus = 1

public val SCM_PHYSICAL_DEVICE_OP_STATUS_PREDICTING_FAILURE: ScmPdOperationalStatus = 2

public val SCM_PHYSICAL_DEVICE_OP_STATUS_TRANSIENT_ERROR: ScmPdOperationalStatus = 6

public val SCM_PHYSICAL_DEVICE_OP_STATUS_UNKNOWN: ScmPdOperationalStatus = 0

public val SCM_PHYSICAL_DEVICE_PROPERTY_DEVICE_HANDLE: ScmPdPropertyId = 5

public val SCM_PHYSICAL_DEVICE_PROPERTY_DEVICE_INFO: ScmPdPropertyId = 0

public val SCM_PHYSICAL_DEVICE_PROPERTY_DEVICE_SPECIFIC_INFO: ScmPdPropertyId = 4

public val SCM_PHYSICAL_DEVICE_PROPERTY_FIRMWARE_INFO: ScmPdPropertyId = 2

public val SCM_PHYSICAL_DEVICE_PROPERTY_FRU_ID_STRING: ScmPdPropertyId = 6

public val SCM_PHYSICAL_DEVICE_PROPERTY_LOCATION_STRING: ScmPdPropertyId = 3

public val SCM_PHYSICAL_DEVICE_PROPERTY_MANAGEMENT_STATUS: ScmPdPropertyId = 1

public val SCM_PHYSICAL_DEVICE_PROPERTY_MAX: ScmPdPropertyId = 9

public val SCM_PHYSICAL_DEVICE_PROPERTY_RUNTIME_FW_ACTIVATION_ARM_STATE: ScmPdPropertyId = 8

public val SCM_PHYSICAL_DEVICE_PROPERTY_RUNTIME_FW_ACTIVATION_INFO: ScmPdPropertyId = 7

public val SCM_PHYSICAL_DEVICE_QUERY_DESCRIPTOR: ScmPdQueryType = 0

public val SCM_PHYSICAL_DEVICE_QUERY_IS_SUPPORTED: ScmPdQueryType = 1

public val SCM_PHYSICAL_DEVICE_QUERY_MAX: ScmPdQueryType = 2

public val SCM_PHYSICAL_DEVICE_REINIT_COLD_BOOT_NEEDED: ScmPdMediaReinitializationStatus = 2

public val SCM_PHYSICAL_DEVICE_REINIT_MAX: ScmPdMediaReinitializationStatus = 3

public val SCM_PHYSICAL_DEVICE_REINIT_REBOOT_NEEDED: ScmPdMediaReinitializationStatus = 1

public val SCM_PHYSICAL_DEVICE_REINIT_SUCCESS: ScmPdMediaReinitializationStatus = 0

public val SCM_PHYSICAL_DEVICE_SET_DESCRIPTOR: ScmPdSetType = 0

public val SCM_PHYSICAL_DEVICE_SET_IS_SUPPORTED: ScmPdSetType = 1

public val SCM_PHYSICAL_DEVICE_SET_MAX: ScmPdSetType = 2

public val SCM_REGION_FLAG_LABEL: ScmRegionFlag = 1

public val SCM_REGION_FLAG_NONE: ScmRegionFlag = 0

public val SHRINK_ABORT: ShrinkVolumeRequestTypes = 3

public val SHRINK_COMMIT: ShrinkVolumeRequestTypes = 2

public val SHRINK_PREPARE: ShrinkVolumeRequestTypes = 1

public val SMR_GC_ACTION_PAUSE: RefsSmrVolumeGcAction = 3

public val SMR_GC_ACTION_START: RefsSmrVolumeGcAction = 1

public val SMR_GC_ACTION_START_FULL_SPEED: RefsSmrVolumeGcAction = 2

public val SMR_GC_ACTION_STOP: RefsSmrVolumeGcAction = 4

public val SMR_GC_METHOD_COMPACTION: RefsSmrVolumeGcMethod = 1

public val SMR_GC_METHOD_COMPRESSION: RefsSmrVolumeGcMethod = 2

public val SMR_GC_METHOD_ROTATION: RefsSmrVolumeGcMethod = 3

public val SMR_GC_STATE_ACTIVE: RefsSmrVolumeGcState = 2

public val SMR_GC_STATE_ACTIVE_FULL_SPEED: RefsSmrVolumeGcState = 3

public val SMR_GC_STATE_INACTIVE: RefsSmrVolumeGcState = 0

public val SMR_GC_STATE_PAUSED: RefsSmrVolumeGcState = 1

public val STOR_ATTRIBUTE_MGMT_CLEAR_ATTRIBUTE: StorageAttributeMgmtAction = 0

public val STOR_ATTRIBUTE_MGMT_RESET_ATTRIBUTE: StorageAttributeMgmtAction = 2

public val STOR_ATTRIBUTE_MGMT_SET_ATTRIBUTE: StorageAttributeMgmtAction = 1

public val STOR_RPMB_AUTHENTICATED_DEVICE_CONFIG_READ: StorageRpmbCommandType = 7

public val STOR_RPMB_AUTHENTICATED_DEVICE_CONFIG_WRITE: StorageRpmbCommandType = 6

public val STOR_RPMB_AUTHENTICATED_READ: StorageRpmbCommandType = 4

public val STOR_RPMB_AUTHENTICATED_WRITE: StorageRpmbCommandType = 3

public val STOR_RPMB_PROGRAM_AUTH_KEY: StorageRpmbCommandType = 1

public val STOR_RPMB_QUERY_WRITE_COUNTER: StorageRpmbCommandType = 2

public val STOR_RPMB_READ_RESULT_REQUEST: StorageRpmbCommandType = 5

public val STORAGE_ACCESS_ALIGNMENT_PROPERTY: StoragePropertyId = 6

public val STORAGE_ADAPTER_CRYPTO_PROPERTY: StoragePropertyId = 17

public val STORAGE_ADAPTER_PHYSICAL_TOPOLOGY_PROPERTY: StoragePropertyId = 53

public val STORAGE_ADAPTER_PROPERTY: StoragePropertyId = 1

public val STORAGE_ADAPTER_PROTOCOL_SPECIFIC_PROPERTY: StoragePropertyId = 49

public val STORAGE_ADAPTER_RPMB_PROPERTY: StoragePropertyId = 16

public val STORAGE_ADAPTER_SERIAL_NUMBER_PROPERTY: StoragePropertyId = 57

public val STORAGE_ADAPTER_TEMPERATURE_PROPERTY: StoragePropertyId = 51

public val STORAGE_COUNTER_TYPE_FLUSH_LATENCY100NS_MAX: StorageCounterType = 20

public val STORAGE_COUNTER_TYPE_LOAD_UNLOAD_CYCLE_COUNT: StorageCounterType = 12

public val STORAGE_COUNTER_TYPE_LOAD_UNLOAD_CYCLE_COUNT_MAX: StorageCounterType = 13

public val STORAGE_COUNTER_TYPE_MANUFACTURE_DATE: StorageCounterType = 9

public val STORAGE_COUNTER_TYPE_MAX: StorageCounterType = 21

public val STORAGE_COUNTER_TYPE_POWER_ON_HOURS: StorageCounterType = 17

public val STORAGE_COUNTER_TYPE_READ_ERRORS_CORRECTED: StorageCounterType = 4

public val STORAGE_COUNTER_TYPE_READ_ERRORS_TOTAL: StorageCounterType = 3

public val STORAGE_COUNTER_TYPE_READ_ERRORS_UNCORRECTED: StorageCounterType = 5

public val STORAGE_COUNTER_TYPE_READ_LATENCY100NS_MAX: StorageCounterType = 18

public val STORAGE_COUNTER_TYPE_START_STOP_CYCLE_COUNT: StorageCounterType = 10

public val STORAGE_COUNTER_TYPE_START_STOP_CYCLE_COUNT_MAX: StorageCounterType = 11

public val STORAGE_COUNTER_TYPE_TEMPERATURE_CELSIUS: StorageCounterType = 1

public val STORAGE_COUNTER_TYPE_TEMPERATURE_CELSIUS_MAX: StorageCounterType = 2

public val STORAGE_COUNTER_TYPE_UNKNOWN: StorageCounterType = 0

public val STORAGE_COUNTER_TYPE_WEAR_PERCENTAGE: StorageCounterType = 14

public val STORAGE_COUNTER_TYPE_WEAR_PERCENTAGE_MAX: StorageCounterType = 16

public val STORAGE_COUNTER_TYPE_WEAR_PERCENTAGE_WARNING: StorageCounterType = 15

public val STORAGE_COUNTER_TYPE_WRITE_ERRORS_CORRECTED: StorageCounterType = 7

public val STORAGE_COUNTER_TYPE_WRITE_ERRORS_TOTAL: StorageCounterType = 6

public val STORAGE_COUNTER_TYPE_WRITE_ERRORS_UNCORRECTED: StorageCounterType = 8

public val STORAGE_COUNTER_TYPE_WRITE_LATENCY100NS_MAX: StorageCounterType = 19

public val STORAGE_CRYPTO_ALGORITHM_AESECB: StorageCryptoAlgorithmId = 3

public val STORAGE_CRYPTO_ALGORITHM_BITLOCKER_AESCBC: StorageCryptoAlgorithmId = 2

public val STORAGE_CRYPTO_ALGORITHM_ESSIVAESCBC: StorageCryptoAlgorithmId = 4

public val STORAGE_CRYPTO_ALGORITHM_MAX: StorageCryptoAlgorithmId = 5

public val STORAGE_CRYPTO_ALGORITHM_UNKNOWN: StorageCryptoAlgorithmId = 0

public val STORAGE_CRYPTO_ALGORITHM_XTSAES: StorageCryptoAlgorithmId = 1

public val STORAGE_CRYPTO_KEY_SIZE128BITS: StorageCryptoKeySize = 1

public val STORAGE_CRYPTO_KEY_SIZE192BITS: StorageCryptoKeySize = 2

public val STORAGE_CRYPTO_KEY_SIZE256BITS: StorageCryptoKeySize = 3

public val STORAGE_CRYPTO_KEY_SIZE512BITS: StorageCryptoKeySize = 4

public val STORAGE_CRYPTO_KEY_SIZE_UNKNOWN: StorageCryptoKeySize = 0

public val STORAGE_DEVICE_ATTRIBUTES_PROPERTY: StoragePropertyId = 55

public val STORAGE_DEVICE_COPY_OFFLOAD_PROPERTY: StoragePropertyId = 13

public val STORAGE_DEVICE_DEVICE_TELEMETRY_PROPERTY: StoragePropertyId = 10

public val STORAGE_DEVICE_ENDURANCE_PROPERTY: StoragePropertyId = 62

public val STORAGE_DEVICE_ID_PROPERTY: StoragePropertyId = 2

public val STORAGE_DEVICE_IO_CAPABILITY_PROPERTY: StoragePropertyId = 48

public val STORAGE_DEVICE_LB_PROVISIONING_PROPERTY: StoragePropertyId = 11

public val STORAGE_DEVICE_LED_STATE_PROPERTY: StoragePropertyId = 63

public val STORAGE_DEVICE_LOCATION_PROPERTY: StoragePropertyId = 58

public val STORAGE_DEVICE_MANAGEMENT_STATUS: StoragePropertyId = 56

public val STORAGE_DEVICE_MEDIUM_PRODUCT_TYPE: StoragePropertyId = 15

public val STORAGE_DEVICE_NUMA_PROPERTY: StoragePropertyId = 59

public val STORAGE_DEVICE_PHYSICAL_TOPOLOGY_PROPERTY: StoragePropertyId = 54

public val STORAGE_DEVICE_POWER_CAP_UNITS_MILLIWATTS: StorageDevicePowerCapUnits = 1

public val STORAGE_DEVICE_POWER_CAP_UNITS_PERCENT: StorageDevicePowerCapUnits = 0

public val STORAGE_DEVICE_POWER_PROPERTY: StoragePropertyId = 12

public val STORAGE_DEVICE_PROPERTY: StoragePropertyId = 0

public val STORAGE_DEVICE_PROTOCOL_SPECIFIC_PROPERTY: StoragePropertyId = 50

public val STORAGE_DEVICE_RESILIENCY_PROPERTY: StoragePropertyId = 14

public val STORAGE_DEVICE_SEEK_PENALTY_PROPERTY: StoragePropertyId = 7

public val STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY: StoragePropertyId = 64

public val STORAGE_DEVICE_TEMPERATURE_PROPERTY: StoragePropertyId = 52

public val STORAGE_DEVICE_TRIM_PROPERTY: StoragePropertyId = 8

public val STORAGE_DEVICE_UNIQUE_ID_PROPERTY: StoragePropertyId = 3

public val STORAGE_DEVICE_UNSAFE_SHUTDOWN_COUNT: StoragePropertyId = 61

public val STORAGE_DEVICE_WRITE_AGGREGATION_PROPERTY: StoragePropertyId = 9

public val STORAGE_DEVICE_WRITE_CACHE_PROPERTY: StoragePropertyId = 4

public val STORAGE_DEVICE_ZONED_DEVICE_PROPERTY: StoragePropertyId = 60

public val STORAGE_DIAGNOSTIC_LEVEL_DEFAULT: StorageDiagnosticLevel = 0

public val STORAGE_DIAGNOSTIC_LEVEL_MAX: StorageDiagnosticLevel = 1

public val STORAGE_DIAGNOSTIC_TARGET_TYPE_HBA_FIRMWARE: StorageDiagnosticTargetType = 3

public val STORAGE_DIAGNOSTIC_TARGET_TYPE_MAX: StorageDiagnosticTargetType = 4

public val STORAGE_DIAGNOSTIC_TARGET_TYPE_MINIPORT: StorageDiagnosticTargetType = 2

public val STORAGE_DIAGNOSTIC_TARGET_TYPE_PORT: StorageDiagnosticTargetType = 1

public val STORAGE_DIAGNOSTIC_TARGET_TYPE_UNDEFINED: StorageDiagnosticTargetType = 0

public val STORAGE_ENCRYPTION_TYPE_E_DRIVE: StorageEncryptionType = 1

public val STORAGE_ENCRYPTION_TYPE_TCG_OPAL: StorageEncryptionType = 2

public val STORAGE_ENCRYPTION_TYPE_UNKNOWN: StorageEncryptionType = 0

public val STORAGE_FRU_ID_PROPERTY: StoragePropertyId = 65

public val STORAGE_ID_ASSOC_DEVICE: StorageAssociationType = 0

public val STORAGE_ID_ASSOC_PORT: StorageAssociationType = 1

public val STORAGE_ID_ASSOC_TARGET: StorageAssociationType = 2

public val STORAGE_ID_CODE_SET_ASCII: StorageIdentifierCodeSet = 2

public val STORAGE_ID_CODE_SET_BINARY: StorageIdentifierCodeSet = 1

public val STORAGE_ID_CODE_SET_RESERVED: StorageIdentifierCodeSet = 0

public val STORAGE_ID_CODE_SET_UTF8: StorageIdentifierCodeSet = 3

public val STORAGE_ID_NAA_FORMAT_IEEEE_REGISTERED_EXTENDED: StorageIdNaaFormat = 5

public val STORAGE_ID_NAA_FORMAT_IEEE_EXTENDED: StorageIdNaaFormat = 2

public val STORAGE_ID_NAA_FORMAT_IEEE_REGISTERED: StorageIdNaaFormat = 3

public val STORAGE_ID_TYPE_EUI64: StorageIdentifierType = 2

public val STORAGE_ID_TYPE_FCPH_NAME: StorageIdentifierType = 3

public val STORAGE_ID_TYPE_LOGICAL_UNIT_GROUP: StorageIdentifierType = 6

public val STORAGE_ID_TYPE_MD5LOGICAL_UNIT_IDENTIFIER: StorageIdentifierType = 7

public val STORAGE_ID_TYPE_PORT_RELATIVE: StorageIdentifierType = 4

public val STORAGE_ID_TYPE_SCSI_NAME_STRING: StorageIdentifierType = 8

public val STORAGE_ID_TYPE_TARGET_PORT_GROUP: StorageIdentifierType = 5

public val STORAGE_ID_TYPE_VENDOR_ID: StorageIdentifierType = 1

public val STORAGE_ID_TYPE_VENDOR_SPECIFIC: StorageIdentifierType = 0

public val STORAGE_MINIPORT_PROPERTY: StoragePropertyId = 5

public val STORAGE_PORT_CODE_SET_AT_APORT: StoragePortCodeSet = 4

public val STORAGE_PORT_CODE_SET_RESERVED: StoragePortCodeSet = 0

public val STORAGE_PORT_CODE_SET_SBP2PORT: StoragePortCodeSet = 6

public val STORAGE_PORT_CODE_SET_SCS_IPORT: StoragePortCodeSet = 2

public val STORAGE_PORT_CODE_SET_S_DPORT: StoragePortCodeSet = 7

public val STORAGE_PORT_CODE_SET_SPACEPORT: StoragePortCodeSet = 3

public val STORAGE_PORT_CODE_SET_STORPORT: StoragePortCodeSet = 1

public val STORAGE_PORT_CODE_SET_US_BPORT: StoragePortCodeSet = 5
