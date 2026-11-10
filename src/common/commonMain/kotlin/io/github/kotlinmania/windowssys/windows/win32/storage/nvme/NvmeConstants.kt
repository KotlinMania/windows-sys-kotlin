package io.github.kotlinmania.windowssys.windows.win32.storage.nvme

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val FIRMWARE_ACTIVATION_HISTORY_ENTRY_VERSION_1: UInt = 1u

public val GUID_MFND_CHILD_CONTROLLER_EVENT_LOG_PAGE: Guid = Guid.fromU128(U128(0x98bcce18a5f0bf35uL, 0xa544d97f259d669cuL))

public val GUID_MFND_CHILD_CONTROLLER_EVENT_LOG_PAGE_GUID: Guid = Guid.fromU128(U128(0x98bcce18a5f0bf35uL, 0xa544d97f259d669cuL))

public val GUID_OCP_DEVICE_DEVICE_CAPABILITIES: Guid = Guid.fromU128(U128(0xd054297e1d198c9uL, 0x5d49584b913c05b7uL))

public val GUID_OCP_DEVICE_DEVICE_CAPABILITIES_GUID: Guid = Guid.fromU128(U128(0xd054297e1d198c9uL, 0x5d49584b913c05b7uL))

public val GUID_OCP_DEVICE_ERROR_RECOVERY: Guid = Guid.fromU128(U128(0x2131d94430feae34uL, 0xab4dfd3dba83195auL))

public val GUID_OCP_DEVICE_ERROR_RECOVERY_GUID: Guid = Guid.fromU128(U128(0x2131d94430feae34uL, 0xab4dfd3dba83195auL))

public val GUID_OCP_DEVICE_FIRMWARE_ACTIVATION_HISTORY: Guid = Guid.fromU128(U128(0x769a796ddab4a3f6uL, 0xe24db28aacf31cd1uL))

public val GUID_OCP_DEVICE_FIRMWARE_ACTIVATION_HISTORY_GUID: Guid = Guid.fromU128(U128(0x769a796ddab4a3f6uL, 0xe24db28aacf31cd1uL))

public val GUID_OCP_DEVICE_LATENCY_MONITOR: Guid = Guid.fromU128(U128(0x8cc07a9284d09c6cuL, 0x7043e6d4585ed485uL))

public val GUID_OCP_DEVICE_LATENCY_MONITOR_GUID: Guid = Guid.fromU128(U128(0x8cc07a9284d09c6cuL, 0x7043e6d4585ed485uL))

public val GUID_OCP_DEVICE_SMART_INFORMATION: Guid = Guid.fromU128(U128(0x2810afc5bfeaa4f2uL, 0x9c4f6f7cc914d5afuL))

public val GUID_OCP_DEVICE_SMART_INFORMATION_GUID: Guid = Guid.fromU128(U128(0x2810afc5bfeaa4f2uL, 0x9c4f6f7cc914d5afuL))

public val GUID_OCP_DEVICE_TCG_CONFIGURATION: Guid = Guid.fromU128(U128(0xbd244006e07e83e6uL, 0xc04754fa9d2ae054uL))

public val GUID_OCP_DEVICE_TCG_CONFIGURATION_GUID: Guid = Guid.fromU128(U128(0xbd244006e07e83e6uL, 0xc04754fa9d2ae054uL))

public val GUID_OCP_DEVICE_TCG_HISTORY: Guid = Guid.fromU128(U128(0x704b513e09c69490uL, 0x274ed0969690d788uL))

public val GUID_OCP_DEVICE_TCG_HISTORY_GUID: Guid = Guid.fromU128(U128(0x704b513e09c69490uL, 0x274ed0969690d788uL))

public val GUID_OCP_DEVICE_UNSUPPORTED_REQUIREMENTS: Guid = Guid.fromU128(U128(0xe9c722f2399bb2cuL, 0x634832d0b798bbc7uL))

public val GUID_OCP_DEVICE_UNSUPPORTED_REQUIREMENTS_GUID: Guid = Guid.fromU128(U128(0xe9c722f2399bb2cuL, 0x634832d0b798bbc7uL))

public val GUID_WCS_DEVICE_ERROR_RECOVERY: Guid = Guid.fromU128(U128(0x2131d94430feae34uL, 0xab4dfd3dba83195auL))

public val GUID_WCS_DEVICE_ERROR_RECOVERY_GUID: Guid = Guid.fromU128(U128(0x2131d94430feae34uL, 0xab4dfd3dba83195auL))

public val GUID_WCS_DEVICE_SMART_ATTRIBUTES: Guid = Guid.fromU128(U128(0x2810afc5bfeaa4f2uL, 0x9c4f6f7cc914d5afuL))

public val GUID_WCS_DEVICE_SMART_ATTRIBUTES_GUID: Guid = Guid.fromU128(U128(0x2810afc5bfeaa4f2uL, 0x9c4f6f7cc914d5afuL))

public val NVME_ACCESS_FREQUENCY_FR_WRITE_FR_READ: NvmeAccessFrequencies = 5

public val NVME_ACCESS_FREQUENCY_FR_WRITE_INFR_READ: NvmeAccessFrequencies = 4

public val NVME_ACCESS_FREQUENCY_INFR_WRITE_FR_READ: NvmeAccessFrequencies = 3

public val NVME_ACCESS_FREQUENCY_INFR_WRITE_INFR_READ: NvmeAccessFrequencies = 2

public val NVME_ACCESS_FREQUENCY_NONE: NvmeAccessFrequencies = 0

public val NVME_ACCESS_FREQUENCY_ONE_TIME_READ: NvmeAccessFrequencies = 6

public val NVME_ACCESS_FREQUENCY_SPECULATIVE_READ: NvmeAccessFrequencies = 7

public val NVME_ACCESS_FREQUENCY_TYPICAL: NvmeAccessFrequencies = 1

public val NVME_ACCESS_FREQUENCY_WILL_BE_OVERWRITTEN: NvmeAccessFrequencies = 8

public val NVME_ACCESS_LATENCY_IDLE: NvmeAccessLatencies = 1

public val NVME_ACCESS_LATENCY_LOW: NvmeAccessLatencies = 3

public val NVME_ACCESS_LATENCY_NONE: NvmeAccessLatencies = 0

public val NVME_ACCESS_LATENCY_NORMAL: NvmeAccessLatencies = 2

public val NVME_ADMIN_COMMAND_ABORT: NvmeAdminCommands = 8

public val NVME_ADMIN_COMMAND_ASYNC_EVENT_REQUEST: NvmeAdminCommands = 12

public val NVME_ADMIN_COMMAND_CREATE_IO_CQ: NvmeAdminCommands = 5

public val NVME_ADMIN_COMMAND_CREATE_IO_SQ: NvmeAdminCommands = 1

public val NVME_ADMIN_COMMAND_DELETE_IO_CQ: NvmeAdminCommands = 4

public val NVME_ADMIN_COMMAND_DELETE_IO_SQ: NvmeAdminCommands = 0

public val NVME_ADMIN_COMMAND_DEVICE_SELF_TEST: NvmeAdminCommands = 20

public val NVME_ADMIN_COMMAND_DIRECTIVE_RECEIVE: NvmeAdminCommands = 26

public val NVME_ADMIN_COMMAND_DIRECTIVE_SEND: NvmeAdminCommands = 25

public val NVME_ADMIN_COMMAND_DOORBELL_BUFFER_CONFIG: NvmeAdminCommands = 124

public val NVME_ADMIN_COMMAND_FIRMWARE_ACTIVATE: NvmeAdminCommands = 16

public val NVME_ADMIN_COMMAND_FIRMWARE_COMMIT: NvmeAdminCommands = 16

public val NVME_ADMIN_COMMAND_FIRMWARE_IMAGE_DOWNLOAD: NvmeAdminCommands = 17

public val NVME_ADMIN_COMMAND_FORMAT_NVM: NvmeAdminCommands = 128

public val NVME_ADMIN_COMMAND_GET_FEATURES: NvmeAdminCommands = 10

public val NVME_ADMIN_COMMAND_GET_LBA_STATUS: NvmeAdminCommands = 134

public val NVME_ADMIN_COMMAND_GET_LOG_PAGE: NvmeAdminCommands = 2

public val NVME_ADMIN_COMMAND_IDENTIFY: NvmeAdminCommands = 6

public val NVME_ADMIN_COMMAND_NAMESPACE_ATTACHMENT: NvmeAdminCommands = 21

public val NVME_ADMIN_COMMAND_NAMESPACE_MANAGEMENT: NvmeAdminCommands = 13

public val NVME_ADMIN_COMMAND_NVME_MI_RECEIVE: NvmeAdminCommands = 30

public val NVME_ADMIN_COMMAND_NVME_MI_SEND: NvmeAdminCommands = 29

public val NVME_ADMIN_COMMAND_SANITIZE: NvmeAdminCommands = 132

public val NVME_ADMIN_COMMAND_SECURITY_RECEIVE: NvmeAdminCommands = 130

public val NVME_ADMIN_COMMAND_SECURITY_SEND: NvmeAdminCommands = 129

public val NVME_ADMIN_COMMAND_SET_FEATURES: NvmeAdminCommands = 9

public val NVME_ADMIN_COMMAND_VIRTUALIZATION_MANAGEMENT: NvmeAdminCommands = 28

public val NVME_AMS_ROUND_ROBIN: NvmeAmsOption = 0

public val NVME_AMS_WEIGHTED_ROUND_ROBIN_URGENT: NvmeAmsOption = 1

public val NVME_ASYNC_ERROR_DIAG_FAILURE: NvmeAsyncEventErrorStatusCodes = 2

public val NVME_ASYNC_ERROR_FIRMWARE_IMAGE_LOAD_ERROR: NvmeAsyncEventErrorStatusCodes = 5

public val NVME_ASYNC_ERROR_INVALID_DOORBELL_WRITE_VALUE: NvmeAsyncEventErrorStatusCodes = 1

public val NVME_ASYNC_ERROR_INVALID_SUBMISSION_QUEUE: NvmeAsyncEventErrorStatusCodes = 0

public val NVME_ASYNC_ERROR_PERSISTENT_INTERNAL_DEVICE_ERROR: NvmeAsyncEventErrorStatusCodes = 3

public val NVME_ASYNC_ERROR_TRANSIENT_INTERNAL_DEVICE_ERROR: NvmeAsyncEventErrorStatusCodes = 4

public val NVME_ASYNC_EVENT_TYPE_ERROR_STATUS: NvmeAsyncEventTypes = 0

public val NVME_ASYNC_EVENT_TYPE_HEALTH_STATUS: NvmeAsyncEventTypes = 1

public val NVME_ASYNC_EVENT_TYPE_IO_COMMAND_SET_STATUS: NvmeAsyncEventTypes = 6

public val NVME_ASYNC_EVENT_TYPE_NOTICE: NvmeAsyncEventTypes = 2

public val NVME_ASYNC_EVENT_TYPE_VENDOR_SPECIFIC: NvmeAsyncEventTypes = 7

public val NVME_ASYNC_EVENT_TYPE_VENDOR_SPECIFIC_DEVICE_PANIC: NvmeAsyncEventTypeVendorSpecificCodes = 1

public val NVME_ASYNC_EVENT_TYPE_VENDOR_SPECIFIC_RESERVED: NvmeAsyncEventTypeVendorSpecificCodes = 0

public val NVME_ASYNC_HEALTH_NVM_SUBSYSTEM_RELIABILITY: NvmeAsyncEventHealthStatusCodes = 0

public val NVME_ASYNC_HEALTH_SPARE_BELOW_THRESHOLD: NvmeAsyncEventHealthStatusCodes = 2

public val NVME_ASYNC_HEALTH_TEMPERATURE_THRESHOLD: NvmeAsyncEventHealthStatusCodes = 1

public val NVME_ASYNC_IO_CMD_SANITIZE_OPERATION_COMPLETED: NvmeAsyncEventIoCommandSetStatusCodes = 1

public val NVME_ASYNC_IO_CMD_SANITIZE_OPERATION_COMPLETED_WITH_UNEXPECTED_DEALLOCATION: NvmeAsyncEventIoCommandSetStatusCodes = 2

public val NVME_ASYNC_IO_CMD_SET_RESERVATION_LOG_PAGE_AVAILABLE: NvmeAsyncEventIoCommandSetStatusCodes = 0

public val NVME_ASYNC_NOTICE_ASYMMETRIC_ACCESS_CHANGE: NvmeAsyncEventNoticeCodes = 3

public val NVME_ASYNC_NOTICE_ENDURANCE_GROUP_EVENT_AGGREGATE_LOG_CHANGE: NvmeAsyncEventNoticeCodes = 6

public val NVME_ASYNC_NOTICE_FIRMWARE_ACTIVATION_STARTING: NvmeAsyncEventNoticeCodes = 1

public val NVME_ASYNC_NOTICE_LBA_STATUS_INFORMATION_ALERT: NvmeAsyncEventNoticeCodes = 5

public val NVME_ASYNC_NOTICE_NAMESPACE_ATTRIBUTE_CHANGED: NvmeAsyncEventNoticeCodes = 0

public val NVME_ASYNC_NOTICE_PREDICTABLE_LATENCY_EVENT_AGGREGATE_LOG_CHANGE: NvmeAsyncEventNoticeCodes = 4

public val NVME_ASYNC_NOTICE_TELEMETRY_LOG_CHANGED: NvmeAsyncEventNoticeCodes = 2

public val NVME_ASYNC_NOTICE_ZONE_DESCRIPTOR_CHANGED: NvmeAsyncEventNoticeCodes = 239

public val NVME_CC_SHN_ABRUPT_SHUTDOWN: NvmeCcShnShutdownNotifications = 2

public val NVME_CC_SHN_NORMAL_SHUTDOWN: NvmeCcShnShutdownNotifications = 1

public val NVME_CC_SHN_NO_NOTIFICATION: NvmeCcShnShutdownNotifications = 0

public val NVME_CMBSZ_SIZE_UNITS_16MB: NvmeCmbszSizeUnits = 3

public val NVME_CMBSZ_SIZE_UNITS_1MB: NvmeCmbszSizeUnits = 2

public val NVME_CMBSZ_SIZE_UNITS_256MB: NvmeCmbszSizeUnits = 4

public val NVME_CMBSZ_SIZE_UNITS_4GB: NvmeCmbszSizeUnits = 5

public val NVME_CMBSZ_SIZE_UNITS_4KB: NvmeCmbszSizeUnits = 0

public val NVME_CMBSZ_SIZE_UNITS_64GB: NvmeCmbszSizeUnits = 6

public val NVME_CMBSZ_SIZE_UNITS_64KB: NvmeCmbszSizeUnits = 1

public val NVME_COMMAND_EFFECT_SBUMISSION_EXECUTION_LIMIT_NONE: NvmeCommandEffectSbumissionExecutionLimits = 0

public val NVME_COMMAND_EFFECT_SBUMISSION_EXECUTION_LIMIT_SINGLE_PER_CONTROLLER: NvmeCommandEffectSbumissionExecutionLimits = 2

public val NVME_COMMAND_EFFECT_SBUMISSION_EXECUTION_LIMIT_SINGLE_PER_NAMESPACE: NvmeCommandEffectSbumissionExecutionLimits = 1

public val NVME_COMMAND_SET_KEY_VALUE: NvmeCommandSetIdentifiers = 1

public val NVME_COMMAND_SET_NVM: NvmeCommandSetIdentifiers = 0

public val NVME_COMMAND_SET_ZONED_NAMESPACE: NvmeCommandSetIdentifiers = 2

public val NVME_CONTROLLER_METADATA_CHIPSET_DRIVER_NAME: NvmeControllerMetadataElementTypes = 8

public val NVME_CONTROLLER_METADATA_CHIPSET_DRIVER_VERSION: NvmeControllerMetadataElementTypes = 9

public val NVME_CONTROLLER_METADATA_DISPLAY_DRIVER_NAME: NvmeControllerMetadataElementTypes = 14

public val NVME_CONTROLLER_METADATA_DISPLAY_DRIVER_VERSION: NvmeControllerMetadataElementTypes = 15

public val NVME_CONTROLLER_METADATA_FIRMWARE_VERSION: NvmeControllerMetadataElementTypes = 12

public val NVME_CONTROLLER_METADATA_HOST_DETERMINED_FAILURE_RECORD: NvmeControllerMetadataElementTypes = 16

public val NVME_CONTROLLER_METADATA_OPERATING_SYSTEM_CONTROLLER_NAME: NvmeControllerMetadataElementTypes = 1

public val NVME_CONTROLLER_METADATA_OPERATING_SYSTEM_DRIVER_FILENAME: NvmeControllerMetadataElementTypes = 13

public val NVME_CONTROLLER_METADATA_OPERATING_SYSTEM_DRIVER_NAME: NvmeControllerMetadataElementTypes = 2

public val NVME_CONTROLLER_METADATA_OPERATING_SYSTEM_DRIVER_VERSION: NvmeControllerMetadataElementTypes = 3

public val NVME_CONTROLLER_METADATA_OPERATING_SYSTEM_NAME_AND_BUILD: NvmeControllerMetadataElementTypes = 10

public val NVME_CONTROLLER_METADATA_PREBOOT_CONTROLLER_NAME: NvmeControllerMetadataElementTypes = 4

public val NVME_CONTROLLER_METADATA_PREBOOT_DRIVER_NAME: NvmeControllerMetadataElementTypes = 5

public val NVME_CONTROLLER_METADATA_PREBOOT_DRIVER_VERSION: NvmeControllerMetadataElementTypes = 6

public val NVME_CONTROLLER_METADATA_SYSTEM_PROCESSOR_MODEL: NvmeControllerMetadataElementTypes = 7

public val NVME_CONTROLLER_METADATA_SYSTEM_PRODUCT_NAME: NvmeControllerMetadataElementTypes = 11

public val NVME_CSS_ADMIN_COMMAND_SET_ONLY: NvmeCssCommandSets = 7

public val NVME_CSS_ALL_SUPPORTED_IO_COMMAND_SET: NvmeCssCommandSets = 6

public val NVME_CSS_NVM_COMMAND_SET: NvmeCssCommandSets = 0

public val NVME_CSTS_SHST_NO_SHUTDOWN: NvmeCstsShstShutdownStatus = 0

public val NVME_CSTS_SHST_SHUTDOWN_COMPLETED: NvmeCstsShstShutdownStatus = 2

public val NVME_CSTS_SHST_SHUTDOWN_IN_PROCESS: NvmeCstsShstShutdownStatus = 1

public val NVME_DIRECTIVE_RECEIVE_IDENTIFY_OPERATION_RETURN_PARAMETERS: NvmeDirectiveReceiveIdentifyOperations = 1

public val NVME_DIRECTIVE_RECEIVE_STREAMS_OPERATION_ALLOCATE_RESOURCES: NvmeDirectiveReceiveStreamsOperations = 3

public val NVME_DIRECTIVE_RECEIVE_STREAMS_OPERATION_GET_STATUS: NvmeDirectiveReceiveStreamsOperations = 2

public val NVME_DIRECTIVE_RECEIVE_STREAMS_OPERATION_RETURN_PARAMETERS: NvmeDirectiveReceiveStreamsOperations = 1

public val NVME_DIRECTIVE_SEND_IDENTIFY_OPERATION_ENABLE_DIRECTIVE: NvmeDirectiveSendIdentifyOperations = 1

public val NVME_DIRECTIVE_SEND_STREAMS_OPERATION_RELEASE_IDENTIFIER: NvmeDirectiveSendStreamsOperations = 1

public val NVME_DIRECTIVE_SEND_STREAMS_OPERATION_RELEASE_RESOURCES: NvmeDirectiveSendStreamsOperations = 2

public val NVME_DIRECTIVE_TYPE_IDENTIFY: NvmeDirectiveTypes = 0

public val NVME_DIRECTIVE_TYPE_STREAMS: NvmeDirectiveTypes = 1

public val NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_CPU_CONTROLLER_HANG: NvmeErrorInjectionTypes = 1

public val NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_DRAM_CORRUPTION_CRITICAL: NvmeErrorInjectionTypes = 5

public val NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_DRAM_CORRUPTION_NONCRITICAL: NvmeErrorInjectionTypes = 6

public val NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_HW_MALFUNCTION: NvmeErrorInjectionTypes = 9

public val NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_LOGICAL_FW_ERROR: NvmeErrorInjectionTypes = 4

public val NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_NAND_CORRUPTION: NvmeErrorInjectionTypes = 7

public val NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_NAND_HANG: NvmeErrorInjectionTypes = 2

public val NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_PLP_DEFECT: NvmeErrorInjectionTypes = 3

public val NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_SRAM_CORRUPTION: NvmeErrorInjectionTypes = 8

public val NVME_ERROR_INJECTION_TYPE_MAX: NvmeErrorInjectionTypes = 65535

public val NVME_ERROR_INJECTION_TYPE_RESERVED0: NvmeErrorInjectionTypes = 0

public val NVME_ERROR_INJECTION_TYPE_RESERVED1: NvmeErrorInjectionTypes = 10

public val NVME_EXTENDED_HOST_IDENTIFIER_SIZE: UInt = 16u

public val NVME_FEATURE_ARBITRATION: NvmeFeatures = 1

public val NVME_FEATURE_ASYNC_EVENT_CONFIG: NvmeFeatures = 11

public val NVME_FEATURE_AUTONOMOUS_POWER_STATE_TRANSITION: NvmeFeatures = 12

public val NVME_FEATURE_CLEAR_FW_UPDATE_HISTORY: NvmeFeatures = 193

public val NVME_FEATURE_CLEAR_PCIE_CORRECTABLE_ERROR_COUNTERS: NvmeFeatures = 195

public val NVME_FEATURE_CONTROLLER_METADATA: NvmeFeatures = 126

public val NVME_FEATURE_ENABLE_IEEE1667_SILO: NvmeFeatures = 196

public val NVME_FEATURE_ENDURANCE_GROUP_EVENT_CONFIG: NvmeFeatures = 24

public val NVME_FEATURE_ENHANCED_CONTROLLER_METADATA: NvmeFeatures = 125

public val NVME_FEATURE_ERROR_INJECTION: NvmeFeatures = 192

public val NVME_FEATURE_ERROR_RECOVERY: NvmeFeatures = 5

public val NVME_FEATURE_HOST_BEHAVIOR_SUPPORT: NvmeFeatures = 22

public val NVME_FEATURE_HOST_CONTROLLED_THERMAL_MANAGEMENT: NvmeFeatures = 16

public val NVME_FEATURE_HOST_MEMORY_BUFFER: NvmeFeatures = 13

public val NVME_FEATURE_INTERRUPT_COALESCING: NvmeFeatures = 8

public val NVME_FEATURE_INTERRUPT_VECTOR_CONFIG: NvmeFeatures = 9

public val NVME_FEATURE_IO_COMMAND_SET_PROFILE: NvmeFeatures = 25

public val NVME_FEATURE_KEEP_ALIVE: NvmeFeatures = 15

public val NVME_FEATURE_LBA_RANGE_TYPE: NvmeFeatures = 3

public val NVME_FEATURE_LBA_STATUS_INFORMATION_REPORT_INTERVAL: NvmeFeatures = 21

public val NVME_FEATURE_NAMESPACE_METADATA: NvmeFeatures = 127

public val NVME_FEATURE_NONOPERATIONAL_POWER_STATE: NvmeFeatures = 17

public val NVME_FEATURE_NUMBER_OF_QUEUES: NvmeFeatures = 7

public val NVME_FEATURE_NVM_HOST_IDENTIFIER: NvmeFeatures = 129

public val NVME_FEATURE_NVM_NAMESPACE_WRITE_PROTECTION_CONFIG: NvmeFeatures = 132

public val NVME_FEATURE_NVM_RESERVATION_NOTIFICATION_MASK: NvmeFeatures = 130

public val NVME_FEATURE_NVM_RESERVATION_PERSISTANCE: NvmeFeatures = 131

public val NVME_FEATURE_NVM_SOFTWARE_PROGRESS_MARKER: NvmeFeatures = 128

public val NVME_FEATURE_PLP_HEALTH_MONITOR: NvmeFeatures = 197

public val NVME_FEATURE_POWER_MANAGEMENT: NvmeFeatures = 2

public val NVME_FEATURE_PREDICTABLE_LATENCY_MODE_CONFIG: NvmeFeatures = 19

public val NVME_FEATURE_PREDICTABLE_LATENCY_MODE_WINDOW: NvmeFeatures = 20

public val NVME_FEATURE_READONLY_WRITETHROUGH_MODE: NvmeFeatures = 194

public val NVME_FEATURE_READ_RECOVERY_LEVEL_CONFIG: NvmeFeatures = 18

public val NVME_FEATURE_SANITIZE_CONFIG: NvmeFeatures = 23

public val NVME_FEATURE_TEMPERATURE_THRESHOLD: NvmeFeatures = 4

public val NVME_FEATURE_TIMESTAMP: NvmeFeatures = 14

public val NVME_FEATURE_VALUE_CURRENT: NvmeFeatureValueCodes = 0

public val NVME_FEATURE_VALUE_DEFAULT: NvmeFeatureValueCodes = 1

public val NVME_FEATURE_VALUE_SAVED: NvmeFeatureValueCodes = 2

public val NVME_FEATURE_VALUE_SUPPORTED_CAPABILITIES: NvmeFeatureValueCodes = 3

public val NVME_FEATURE_VOLATILE_WRITE_CACHE: NvmeFeatures = 6

public val NVME_FEATURE_WRITE_ATOMICITY: NvmeFeatures = 10

public val NVME_FIRMWARE_ACTIVATE_ACTION_ACTIVATE: NvmeFirmwareActivateActions = 2

public val NVME_FIRMWARE_ACTIVATE_ACTION_DOWNLOAD_TO_SLOT: NvmeFirmwareActivateActions = 0

public val NVME_FIRMWARE_ACTIVATE_ACTION_DOWNLOAD_TO_SLOT_AND_ACTIVATE: NvmeFirmwareActivateActions = 1

public val NVME_FIRMWARE_ACTIVATE_ACTION_DOWNLOAD_TO_SLOT_AND_ACTIVATE_IMMEDIATE: NvmeFirmwareActivateActions = 3

public val NVME_FUSED_OPERATION_FIRST_CMD: NvmeFusedOperationCodes = 1

public val NVME_FUSED_OPERATION_NORMAL: NvmeFusedOperationCodes = 0

public val NVME_FUSED_OPERATION_SECOND_CMD: NvmeFusedOperationCodes = 2

public val NVME_HOST_IDENTIFIER_SIZE: UInt = 8u

public val NVME_HOST_METADATA_ADD_ENTRY_MULTIPLE: NvmeHostMetadataElementActions = 2

public val NVME_HOST_METADATA_ADD_REPLACE_ENTRY: NvmeHostMetadataElementActions = 0

public val NVME_HOST_METADATA_DELETE_ENTRY_MULTIPLE: NvmeHostMetadataElementActions = 1

public val NVME_IDENTIFIER_TYPE_CSI: NvmeIdentifierType = 4

public val NVME_IDENTIFIER_TYPE_CSI_LENGTH: NvmeIdentifierTypeLength = 1

public val NVME_IDENTIFIER_TYPE_EUI64: NvmeIdentifierType = 1

public val NVME_IDENTIFIER_TYPE_EUI64_LENGTH: NvmeIdentifierTypeLength = 8

public val NVME_IDENTIFIER_TYPE_NGUID: NvmeIdentifierType = 2

public val NVME_IDENTIFIER_TYPE_NGUID_LENGTH: NvmeIdentifierTypeLength = 16

public val NVME_IDENTIFIER_TYPE_UUID: NvmeIdentifierType = 3

public val NVME_IDENTIFIER_TYPE_UUID_LENGTH: NvmeIdentifierTypeLength = 16

public val NVME_IDENTIFY_CNS_ACTIVE_NAMESPACES: NvmeIdentifyCnsCodes = 2

public val NVME_IDENTIFY_CNS_ACTIVE_NAMESPACE_LIST_IO_COMMAND_SET: NvmeIdentifyCnsCodes = 7

public val NVME_IDENTIFY_CNS_ALLOCATED_NAMESPACE: NvmeIdentifyCnsCodes = 17

public val NVME_IDENTIFY_CNS_ALLOCATED_NAMESPACE_IO_COMMAND_SET: NvmeIdentifyCnsCodes = 27

public val NVME_IDENTIFY_CNS_ALLOCATED_NAMESPACE_LIST: NvmeIdentifyCnsCodes = 16

public val NVME_IDENTIFY_CNS_ALLOCATED_NAMSPACE_LIST_IO_COMMAND_SET: NvmeIdentifyCnsCodes = 26

public val NVME_IDENTIFY_CNS_CONTROLLER: NvmeIdentifyCnsCodes = 1

public val NVME_IDENTIFY_CNS_CONTROLLER_LIST_OF_NSID: NvmeIdentifyCnsCodes = 18

public val NVME_IDENTIFY_CNS_CONTROLLER_LIST_OF_NVM_SUBSYSTEM: NvmeIdentifyCnsCodes = 19

public val NVME_IDENTIFY_CNS_DESCRIPTOR_NAMESPACE: NvmeIdentifyCnsCodes = 3

public val NVME_IDENTIFY_CNS_DESCRIPTOR_NAMESPACE_SIZE: UInt = 4096u

public val NVME_IDENTIFY_CNS_DOMAIN_LIST: NvmeIdentifyCnsCodes = 24

public val NVME_IDENTIFY_CNS_ENDURANCE_GROUP_LIST: NvmeIdentifyCnsCodes = 25

public val NVME_IDENTIFY_CNS_IO_COMMAND_SET: NvmeIdentifyCnsCodes = 28

public val NVME_IDENTIFY_CNS_NAMESPACE_GRANULARITY_LIST: NvmeIdentifyCnsCodes = 22

public val NVME_IDENTIFY_CNS_NVM_SET: NvmeIdentifyCnsCodes = 4

public val NVME_IDENTIFY_CNS_PRIMARY_CONTROLLER_CAPABILITIES: NvmeIdentifyCnsCodes = 20

public val NVME_IDENTIFY_CNS_SECONDARY_CONTROLLER_LIST: NvmeIdentifyCnsCodes = 21

public val NVME_IDENTIFY_CNS_SPECIFIC_CONTROLLER_IO_COMMAND_SET: NvmeIdentifyCnsCodes = 6

public val NVME_IDENTIFY_CNS_SPECIFIC_NAMESPACE: NvmeIdentifyCnsCodes = 0

public val NVME_IDENTIFY_CNS_SPECIFIC_NAMESPACE_IO_COMMAND_SET: NvmeIdentifyCnsCodes = 5

public val NVME_IDENTIFY_CNS_UUID_LIST: NvmeIdentifyCnsCodes = 23

public val NVME_IO_COMMAND_SET_COMBINATION_REJECTED: NvmeStatusCommandSpecificCodes = 43

public val NVME_IO_COMMAND_SET_INVALID: NvmeStatusCommandSpecificCodes = 44

public val NVME_IO_COMMAND_SET_NOT_ENABLED: NvmeStatusCommandSpecificCodes = 42

public val NVME_IO_COMMAND_SET_NOT_SUPPORTED: NvmeStatusCommandSpecificCodes = 41

public val NVME_LBA_RANGE_TYPE_CACHE: NvmeLbaRangeTypes = 3

public val NVME_LBA_RANGE_TYPE_FILESYSTEM: NvmeLbaRangeTypes = 1

public val NVME_LBA_RANGE_TYPE_PAGE_SWAP_FILE: NvmeLbaRangeTypes = 4

public val NVME_LBA_RANGE_TYPE_RAID: NvmeLbaRangeTypes = 2

public val NVME_LBA_RANGE_TYPE_RESERVED: NvmeLbaRangeTypes = 0

public val NVME_LOG_PAGE_ASYMMETRIC_NAMESPACE_ACCESS: NvmeLogPages = 12

public val NVME_LOG_PAGE_CHANGED_NAMESPACE_LIST: NvmeLogPages = 4

public val NVME_LOG_PAGE_CHANGED_ZONE_LIST: NvmeLogPages = 191

public val NVME_LOG_PAGE_COMMAND_EFFECTS: NvmeLogPages = 5

public val NVME_LOG_PAGE_DEVICE_SELF_TEST: NvmeLogPages = 6

public val NVME_LOG_PAGE_ENDURANCE_GROUP_EVENT_AGGREGATE: NvmeLogPages = 15

public val NVME_LOG_PAGE_ENDURANCE_GROUP_INFORMATION: NvmeLogPages = 9

public val NVME_LOG_PAGE_ERROR_INFO: NvmeLogPages = 1

public val NVME_LOG_PAGE_FIRMWARE_SLOT_INFO: NvmeLogPages = 3

public val NVME_LOG_PAGE_HEALTH_INFO: NvmeLogPages = 2

public val NVME_LOG_PAGE_LBA_STATUS_INFORMATION: NvmeLogPages = 14

public val NVME_LOG_PAGE_OCP_DEVICE_CAPABILITIES: NvmeVendorLogPages = 196

public val NVME_LOG_PAGE_OCP_DEVICE_ERROR_RECOVERY: NvmeVendorLogPages = 193

public val NVME_LOG_PAGE_OCP_DEVICE_SMART_INFORMATION: NvmeVendorLogPages = 192

public val NVME_LOG_PAGE_OCP_FIRMWARE_ACTIVATION_HISTORY: NvmeVendorLogPages = 194

public val NVME_LOG_PAGE_OCP_LATENCY_MONITOR: NvmeVendorLogPages = 195

public val NVME_LOG_PAGE_OCP_TCG_CONFIGURATION: NvmeVendorLogPages = 200

public val NVME_LOG_PAGE_OCP_TCG_HISTORY: NvmeVendorLogPages = 201

public val NVME_LOG_PAGE_OCP_UNSUPPORTED_REQUIREMENTS: NvmeVendorLogPages = 197

public val NVME_LOG_PAGE_PERSISTENT_EVENT_LOG: NvmeLogPages = 13

public val NVME_LOG_PAGE_PREDICTABLE_LATENCY_EVENT_AGGREGATE: NvmeLogPages = 11

public val NVME_LOG_PAGE_PREDICTABLE_LATENCY_NVM_SET: NvmeLogPages = 10

public val NVME_LOG_PAGE_RESERVATION_NOTIFICATION: NvmeLogPages = 128

public val NVME_LOG_PAGE_SANITIZE_STATUS: NvmeLogPages = 129

public val NVME_LOG_PAGE_TELEMETRY_CTLR_INITIATED: NvmeLogPages = 8

public val NVME_LOG_PAGE_TELEMETRY_HOST_INITIATED: NvmeLogPages = 7

public val NVME_MAX_HOST_IDENTIFIER_SIZE: UInt = 16u

public val NVME_MAX_LOG_SIZE: UInt = 4096u

public val NVME_MEDIA_ADDITIONALLY_MODIFIED_AFTER_SANITIZE_NOT_DEFINED: NvmeNoDeallocateModifiesMediaAfterSanitize = 0

public val NVME_MEDIA_ADDITIONALLY_MOFIDIED_AFTER_SANITIZE: NvmeNoDeallocateModifiesMediaAfterSanitize = 2

public val NVME_MEDIA_NOT_ADDITIONALLY_MODIFIED_AFTER_SANITIZE: NvmeNoDeallocateModifiesMediaAfterSanitize = 1

public val NVME_NAMESPACE_ALL: UInt = 4294967295u

public val NVME_NAMESPACE_METADATA_OPERATING_SYSTEM_NAMESPACE_NAME: NvmeNamespaceMetadataElementTypes = 1

public val NVME_NAMESPACE_METADATA_OPERATING_SYSTEM_NAMESPACE_NAME_QUALIFIER_1: NvmeNamespaceMetadataElementTypes = 3

public val NVME_NAMESPACE_METADATA_OPERATING_SYSTEM_NAMESPACE_NAME_QUALIFIER_2: NvmeNamespaceMetadataElementTypes = 4

public val NVME_NAMESPACE_METADATA_PREBOOT_NAMESPACE_NAME: NvmeNamespaceMetadataElementTypes = 2

public val NVME_NVM_COMMAND_COMPARE: NvmeNvmCommands = 5

public val NVME_NVM_COMMAND_COPY: NvmeNvmCommands = 25

public val NVME_NVM_COMMAND_DATASET_MANAGEMENT: NvmeNvmCommands = 9

public val NVME_NVM_COMMAND_FLUSH: NvmeNvmCommands = 0

public val NVME_NVM_COMMAND_READ: NvmeNvmCommands = 2

public val NVME_NVM_COMMAND_RESERVATION_ACQUIRE: NvmeNvmCommands = 17

public val NVME_NVM_COMMAND_RESERVATION_REGISTER: NvmeNvmCommands = 13

public val NVME_NVM_COMMAND_RESERVATION_RELEASE: NvmeNvmCommands = 21

public val NVME_NVM_COMMAND_RESERVATION_REPORT: NvmeNvmCommands = 14

public val NVME_NVM_COMMAND_VERIFY: NvmeNvmCommands = 12

public val NVME_NVM_COMMAND_WRITE: NvmeNvmCommands = 1

public val NVME_NVM_COMMAND_WRITE_UNCORRECTABLE: NvmeNvmCommands = 4

public val NVME_NVM_COMMAND_WRITE_ZEROES: NvmeNvmCommands = 8

public val NVME_NVM_COMMAND_ZONE_APPEND: NvmeNvmCommands = 125

public val NVME_NVM_COMMAND_ZONE_MANAGEMENT_RECEIVE: NvmeNvmCommands = 122

public val NVME_NVM_COMMAND_ZONE_MANAGEMENT_SEND: NvmeNvmCommands = 121

public val NVME_NVM_QUEUE_PRIORITY_HIGH: NvmeNvmQueuePriorities = 1

public val NVME_NVM_QUEUE_PRIORITY_LOW: NvmeNvmQueuePriorities = 3

public val NVME_NVM_QUEUE_PRIORITY_MEDIUM: NvmeNvmQueuePriorities = 2

public val NVME_NVM_QUEUE_PRIORITY_URGENT: NvmeNvmQueuePriorities = 0

public val NVME_OCP_DEVICE_CAPABILITIES_LOG_VERSION_1: UInt = 1u

public val NVME_OCP_DEVICE_ERROR_RECOVERY_LOG_VERSION_2: UInt = 2u

public val NVME_OCP_DEVICE_FIRMWARE_ACTIVATION_HISTORY_LOG_VERSION_1: UInt = 1u

public val NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_VERSION_1: UInt = 1u

public val NVME_OCP_DEVICE_SMART_INFORMATION_LOG_VERSION_3: UInt = 3u

public val NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_VERSION_1: UInt = 1u

public val NVME_OCP_DEVICE_TCG_HISTORY_LOG_VERSION_1: UInt = 1u

public val NVME_OCP_DEVICE_UNSUPPORTED_REQUIREMENTS_LOG_VERSION_1: UInt = 1u

public val NVME_PERSISTENT_EVENT_TYPE_CHANGE_NAMESPACE: NvmePersistentEventLogEventTypes = 6

public val NVME_PERSISTENT_EVENT_TYPE_FIRMWARE_COMMIT: NvmePersistentEventLogEventTypes = 2

public val NVME_PERSISTENT_EVENT_TYPE_FORMAT_NVM_COMPLETION: NvmePersistentEventLogEventTypes = 8

public val NVME_PERSISTENT_EVENT_TYPE_FORMAT_NVM_START: NvmePersistentEventLogEventTypes = 7

public val NVME_PERSISTENT_EVENT_TYPE_MAX: NvmePersistentEventLogEventTypes = 255

public val NVME_PERSISTENT_EVENT_TYPE_NVM_SUBSYSTEM_HARDWARE_ERROR: NvmePersistentEventLogEventTypes = 5

public val NVME_PERSISTENT_EVENT_TYPE_POWER_ON_OR_RESET: NvmePersistentEventLogEventTypes = 4

public val NVME_PERSISTENT_EVENT_TYPE_RESERVED0: NvmePersistentEventLogEventTypes = 0

public val NVME_PERSISTENT_EVENT_TYPE_RESERVED1_BEGIN: NvmePersistentEventLogEventTypes = 14

public val NVME_PERSISTENT_EVENT_TYPE_RESERVED1_END: NvmePersistentEventLogEventTypes = 221

public val NVME_PERSISTENT_EVENT_TYPE_RESERVED2_BEGIN: NvmePersistentEventLogEventTypes = 224

public val NVME_PERSISTENT_EVENT_TYPE_RESERVED2_END: NvmePersistentEventLogEventTypes = 255

public val NVME_PERSISTENT_EVENT_TYPE_SANITIZE_COMPLETION: NvmePersistentEventLogEventTypes = 10

public val NVME_PERSISTENT_EVENT_TYPE_SANITIZE_START: NvmePersistentEventLogEventTypes = 9

public val NVME_PERSISTENT_EVENT_TYPE_SET_FEATURE: NvmePersistentEventLogEventTypes = 11

public val NVME_PERSISTENT_EVENT_TYPE_SMART_HEALTH_LOG_SNAPSHOT: NvmePersistentEventLogEventTypes = 1

public val NVME_PERSISTENT_EVENT_TYPE_TCG_DEFINED: NvmePersistentEventLogEventTypes = 223

public val NVME_PERSISTENT_EVENT_TYPE_TELEMETRY_LOG_CREATED: NvmePersistentEventLogEventTypes = 12

public val NVME_PERSISTENT_EVENT_TYPE_THERMAL_EXCURSION: NvmePersistentEventLogEventTypes = 13

public val NVME_PERSISTENT_EVENT_TYPE_TIMESTAMP_CHANGE: NvmePersistentEventLogEventTypes = 3

public val NVME_PERSISTENT_EVENT_TYPE_VENDOR_SPECIFIC_EVENT: NvmePersistentEventLogEventTypes = 222

public val NVME_PROTECTION_INFORMATION_NOT_ENABLED: NvmeProtectionInformationTypes = 0

public val NVME_PROTECTION_INFORMATION_TYPE1: NvmeProtectionInformationTypes = 1

public val NVME_PROTECTION_INFORMATION_TYPE2: NvmeProtectionInformationTypes = 2

public val NVME_PROTECTION_INFORMATION_TYPE3: NvmeProtectionInformationTypes = 3

public val NVME_RESERVATION_ACQUIRE_ACTION_ACQUIRE: NvmeReservationAcquireActions = 0

public val NVME_RESERVATION_ACQUIRE_ACTION_PREEMPT: NvmeReservationAcquireActions = 1

public val NVME_RESERVATION_ACQUIRE_ACTION_PREEMPT_AND_ABORT: NvmeReservationAcquireActions = 2

public val NVME_RESERVATION_NOTIFICATION_TYPE_EMPTY_LOG_PAGE: NvmeReservationNotificationTypes = 0

public val NVME_RESERVATION_NOTIFICATION_TYPE_REGISTRATION_PREEMPTED: NvmeReservationNotificationTypes = 1

public val NVME_RESERVATION_NOTIFICATION_TYPE_REGISTRATION_RELEASED: NvmeReservationNotificationTypes = 2

public val NVME_RESERVATION_NOTIFICATION_TYPE_RESERVATION_PREEPMPTED: NvmeReservationNotificationTypes = 3

public val NVME_RESERVATION_REGISTER_ACTION_REGISTER: NvmeReservationRegisterActions = 0

public val NVME_RESERVATION_REGISTER_ACTION_REPLACE: NvmeReservationRegisterActions = 2

public val NVME_RESERVATION_REGISTER_ACTION_UNREGISTER: NvmeReservationRegisterActions = 1

public val NVME_RESERVATION_REGISTER_PTPL_STATE_NO_CHANGE: NvmeReservationRegisterPtplStateChanges = 0

public val NVME_RESERVATION_REGISTER_PTPL_STATE_RESERVED: NvmeReservationRegisterPtplStateChanges = 1

public val NVME_RESERVATION_REGISTER_PTPL_STATE_SET_TO_0: NvmeReservationRegisterPtplStateChanges = 2

public val NVME_RESERVATION_REGISTER_PTPL_STATE_SET_TO_1: NvmeReservationRegisterPtplStateChanges = 3

public val NVME_RESERVATION_RELEASE_ACTION_CLEAR: NvmeReservationReleaseActions = 1

public val NVME_RESERVATION_RELEASE_ACTION_RELEASE: NvmeReservationReleaseActions = 0

public val NVME_RESERVATION_TYPE_EXCLUSIVE_ACCESS: NvmeReservationTypes = 2

public val NVME_RESERVATION_TYPE_EXCLUSIVE_ACCESS_ALL_REGISTRANTS: NvmeReservationTypes = 6

public val NVME_RESERVATION_TYPE_EXCLUSIVE_ACCESS_REGISTRANTS_ONLY: NvmeReservationTypes = 4

public val NVME_RESERVATION_TYPE_RESERVED: NvmeReservationTypes = 0

public val NVME_RESERVATION_TYPE_WRITE_EXCLUSIVE: NvmeReservationTypes = 1

public val NVME_RESERVATION_TYPE_WRITE_EXCLUSIVE_ALL_REGISTRANTS: NvmeReservationTypes = 5

public val NVME_RESERVATION_TYPE_WRITE_EXCLUSIVE_REGISTRANTS_ONLY: NvmeReservationTypes = 3

public val NVME_SANITIZE_ACTION_EXIT_FAILURE_MODE: NvmeSanitizeAction = 1

public val NVME_SANITIZE_ACTION_RESERVED: NvmeSanitizeAction = 0

public val NVME_SANITIZE_ACTION_START_BLOCK_ERASE_SANITIZE: NvmeSanitizeAction = 2

public val NVME_SANITIZE_ACTION_START_CRYPTO_ERASE_SANITIZE: NvmeSanitizeAction = 4

public val NVME_SANITIZE_ACTION_START_OVERWRITE_SANITIZE: NvmeSanitizeAction = 3

public val NVME_SANITIZE_OPERATION_FAILED: NvmeSanitizeOperationStatus = 3

public val NVME_SANITIZE_OPERATION_IN_PROGRESS: NvmeSanitizeOperationStatus = 2

public val NVME_SANITIZE_OPERATION_NONE: NvmeSanitizeOperationStatus = 0

public val NVME_SANITIZE_OPERATION_SUCCEEDED: NvmeSanitizeOperationStatus = 1

public val NVME_SANITIZE_OPERATION_SUCCEEDED_WITH_FORCED_DEALLOCATION: NvmeSanitizeOperationStatus = 4

public val NVME_SECURE_ERASE_CRYPTOGRAPHIC: NvmeSecureEraseSettings = 2

public val NVME_SECURE_ERASE_NONE: NvmeSecureEraseSettings = 0

public val NVME_SECURE_ERASE_USER_DATA: NvmeSecureEraseSettings = 1

public val NVME_STATE_ZSC: ZoneState = 4

public val NVME_STATE_ZSE: ZoneState = 1

public val NVME_STATE_ZSEO: ZoneState = 3

public val NVME_STATE_ZSF: ZoneState = 14

public val NVME_STATE_ZSIO: ZoneState = 2

public val NVME_STATE_ZSO: ZoneState = 15

public val NVME_STATE_ZSRO: ZoneState = 13

public val NVME_STATUS_ABORT_COMMAND_LIMIT_EXCEEDED: NvmeStatusCommandSpecificCodes = 3

public val NVME_STATUS_ANA_ATTACH_FAILED: NvmeStatusCommandSpecificCodes = 37

public val NVME_STATUS_ASYNC_EVENT_REQUEST_LIMIT_EXCEEDED: NvmeStatusCommandSpecificCodes = 5

public val NVME_STATUS_ATOMIC_WRITE_UNIT_EXCEEDED: NvmeStatusGenericCommandCodes = 20

public val NVME_STATUS_BOOT_PARTITION_WRITE_PROHIBITED: NvmeStatusCommandSpecificCodes = 30

public val NVME_STATUS_COMMAND_ABORTED_DUE_TO_FAILED_FUSED_COMMAND: NvmeStatusGenericCommandCodes = 9

public val NVME_STATUS_COMMAND_ABORTED_DUE_TO_FAILED_MISSING_COMMAND: NvmeStatusGenericCommandCodes = 10

public val NVME_STATUS_COMMAND_ABORTED_DUE_TO_POWER_LOSS_NOTIFICATION: NvmeStatusGenericCommandCodes = 5

public val NVME_STATUS_COMMAND_ABORTED_DUE_TO_PREEMPT_ABORT: NvmeStatusGenericCommandCodes = 27

public val NVME_STATUS_COMMAND_ABORTED_DUE_TO_SQ_DELETION: NvmeStatusGenericCommandCodes = 8

public val NVME_STATUS_COMMAND_ABORT_REQUESTED: NvmeStatusGenericCommandCodes = 7

public val NVME_STATUS_COMMAND_ID_CONFLICT: NvmeStatusGenericCommandCodes = 3

public val NVME_STATUS_COMMAND_SEQUENCE_ERROR: NvmeStatusGenericCommandCodes = 12

public val NVME_STATUS_COMPLETION_QUEUE_INVALID: NvmeStatusCommandSpecificCodes = 0

public val NVME_STATUS_CONTROLLER_LIST_INVALID: NvmeStatusCommandSpecificCodes = 28

public val NVME_STATUS_DATA_SGL_LENGTH_INVALID: NvmeStatusGenericCommandCodes = 15

public val NVME_STATUS_DATA_TRANSFER_ERROR: NvmeStatusGenericCommandCodes = 4

public val NVME_STATUS_DEVICE_SELF_TEST_IN_PROGRESS: NvmeStatusCommandSpecificCodes = 29

public val NVME_STATUS_DIRECTIVE_ID_INVALID: NvmeStatusGenericCommandCodes = 113

public val NVME_STATUS_DIRECTIVE_TYPE_INVALID: NvmeStatusGenericCommandCodes = 112

public val NVME_STATUS_FEATURE_ID_NOT_SAVEABLE: NvmeStatusCommandSpecificCodes = 13

public val NVME_STATUS_FEATURE_NOT_CHANGEABLE: NvmeStatusCommandSpecificCodes = 14

public val NVME_STATUS_FEATURE_NOT_NAMESPACE_SPECIFIC: NvmeStatusCommandSpecificCodes = 15

public val NVME_STATUS_FIRMWARE_ACTIVATION_PROHIBITED: NvmeStatusCommandSpecificCodes = 19

public val NVME_STATUS_FIRMWARE_ACTIVATION_REQUIRES_CONVENTIONAL_RESET: NvmeStatusCommandSpecificCodes = 11

public val NVME_STATUS_FIRMWARE_ACTIVATION_REQUIRES_MAX_TIME_VIOLATION: NvmeStatusCommandSpecificCodes = 18

public val NVME_STATUS_FIRMWARE_ACTIVATION_REQUIRES_NVM_SUBSYSTEM_RESET: NvmeStatusCommandSpecificCodes = 16

public val NVME_STATUS_FIRMWARE_ACTIVATION_REQUIRES_RESET: NvmeStatusCommandSpecificCodes = 17

public val NVME_STATUS_FORMAT_IN_PROGRESS: NvmeStatusGenericCommandCodes = 132

public val NVME_STATUS_HOST_IDENTIFIER_INCONSISTENT_FORMAT: NvmeStatusGenericCommandCodes = 24

public val NVME_STATUS_INTERNAL_DEVICE_ERROR: NvmeStatusGenericCommandCodes = 6

public val NVME_STATUS_INVALID_ANA_GROUP_IDENTIFIER: NvmeStatusCommandSpecificCodes = 36

public val NVME_STATUS_INVALID_COMMAND_OPCODE: NvmeStatusGenericCommandCodes = 1

public val NVME_STATUS_INVALID_CONTROLLER_IDENTIFIER: NvmeStatusCommandSpecificCodes = 31

public val NVME_STATUS_INVALID_FIELD_IN_COMMAND: NvmeStatusGenericCommandCodes = 2

public val NVME_STATUS_INVALID_FIRMWARE_IMAGE: NvmeStatusCommandSpecificCodes = 7

public val NVME_STATUS_INVALID_FIRMWARE_SLOT: NvmeStatusCommandSpecificCodes = 6

public val NVME_STATUS_INVALID_FORMAT: NvmeStatusCommandSpecificCodes = 10

public val NVME_STATUS_INVALID_INTERRUPT_VECTOR: NvmeStatusCommandSpecificCodes = 8

public val NVME_STATUS_INVALID_LOG_PAGE: NvmeStatusCommandSpecificCodes = 9

public val NVME_STATUS_INVALID_NAMESPACE_OR_FORMAT: NvmeStatusGenericCommandCodes = 11

public val NVME_STATUS_INVALID_NUMBER_OF_CONTROLLER_RESOURCES: NvmeStatusCommandSpecificCodes = 33

public val NVME_STATUS_INVALID_NUMBER_OF_SGL_DESCR: NvmeStatusGenericCommandCodes = 14

public val NVME_STATUS_INVALID_QUEUE_DELETION: NvmeStatusCommandSpecificCodes = 12

public val NVME_STATUS_INVALID_QUEUE_IDENTIFIER: NvmeStatusCommandSpecificCodes = 1

public val NVME_STATUS_INVALID_RESOURCE_IDENTIFIER: NvmeStatusCommandSpecificCodes = 34

public val NVME_STATUS_INVALID_SECONDARY_CONTROLLER_STATE: NvmeStatusCommandSpecificCodes = 32

public val NVME_STATUS_INVALID_SGL_LAST_SEGMENT_DESCR: NvmeStatusGenericCommandCodes = 13

public val NVME_STATUS_INVALID_USE_OF_CONTROLLER_MEMORY_BUFFER: NvmeStatusGenericCommandCodes = 18

public val NVME_STATUS_KEEP_ALIVE_TIMEOUT_EXPIRED: NvmeStatusGenericCommandCodes = 25

public val NVME_STATUS_KEEP_ALIVE_TIMEOUT_INVALID: NvmeStatusGenericCommandCodes = 26

public val NVME_STATUS_MAX_QUEUE_SIZE_EXCEEDED: NvmeStatusCommandSpecificCodes = 2

public val NVME_STATUS_METADATA_SGL_LENGTH_INVALID: NvmeStatusGenericCommandCodes = 16

public val NVME_STATUS_NAMESPACE_ALREADY_ATTACHED: NvmeStatusCommandSpecificCodes = 24

public val NVME_STATUS_NAMESPACE_IDENTIFIER_UNAVAILABLE: NvmeStatusCommandSpecificCodes = 22

public val NVME_STATUS_NAMESPACE_INSUFFICIENT_CAPACITY: NvmeStatusCommandSpecificCodes = 21

public val NVME_STATUS_NAMESPACE_IS_PRIVATE: NvmeStatusCommandSpecificCodes = 25

public val NVME_STATUS_NAMESPACE_NOT_ATTACHED: NvmeStatusCommandSpecificCodes = 26

public val NVME_STATUS_NAMESPACE_THIN_PROVISIONING_NOT_SUPPORTED: NvmeStatusCommandSpecificCodes = 27

public val NVME_STATUS_NVM_ACCESS_DENIED: NvmeStatusMediaErrorCodes = 134

public val NVME_STATUS_NVM_ATTEMPTED_WRITE_TO_READ_ONLY_RANGE: NvmeStatusCommandSpecificCodes = 130

public val NVME_STATUS_NVM_CAPACITY_EXCEEDED: NvmeStatusGenericCommandCodes = 129

public val NVME_STATUS_NVM_COMMAND_SIZE_LIMIT_EXCEEDED: NvmeStatusCommandSpecificCodes = 131

public val NVME_STATUS_NVM_COMPARE_FAILURE: NvmeStatusMediaErrorCodes = 133

public val NVME_STATUS_NVM_CONFLICTING_ATTRIBUTES: NvmeStatusCommandSpecificCodes = 128

public val NVME_STATUS_NVM_DEALLOCATED_OR_UNWRITTEN_LOGICAL_BLOCK: NvmeStatusMediaErrorCodes = 135

public val NVME_STATUS_NVM_END_TO_END_APPLICATION_TAG_CHECK_ERROR: NvmeStatusMediaErrorCodes = 131

public val NVME_STATUS_NVM_END_TO_END_GUARD_CHECK_ERROR: NvmeStatusMediaErrorCodes = 130

public val NVME_STATUS_NVM_END_TO_END_REFERENCE_TAG_CHECK_ERROR: NvmeStatusMediaErrorCodes = 132

public val NVME_STATUS_NVM_INVALID_PROTECTION_INFORMATION: NvmeStatusCommandSpecificCodes = 129

public val NVME_STATUS_NVM_LBA_OUT_OF_RANGE: NvmeStatusGenericCommandCodes = 128

public val NVME_STATUS_NVM_NAMESPACE_NOT_READY: NvmeStatusGenericCommandCodes = 130

public val NVME_STATUS_NVM_RESERVATION_CONFLICT: NvmeStatusGenericCommandCodes = 131

public val NVME_STATUS_NVM_UNRECOVERED_READ_ERROR: NvmeStatusMediaErrorCodes = 129

public val NVME_STATUS_NVM_WRITE_FAULT: NvmeStatusMediaErrorCodes = 128

public val NVME_STATUS_OPERATION_DENIED: NvmeStatusGenericCommandCodes = 21

public val NVME_STATUS_OVERLAPPING_RANGE: NvmeStatusCommandSpecificCodes = 20

public val NVME_STATUS_PRP_OFFSET_INVALID: NvmeStatusGenericCommandCodes = 19

public val NVME_STATUS_RESERVED: NvmeStatusGenericCommandCodes = 23

public val NVME_STATUS_SANITIZE_FAILED: NvmeStatusGenericCommandCodes = 28

public val NVME_STATUS_SANITIZE_IN_PROGRESS: NvmeStatusGenericCommandCodes = 29

public val NVME_STATUS_SANITIZE_PROHIBITED_ON_PERSISTENT_MEMORY: NvmeStatusCommandSpecificCodes = 35

public val NVME_STATUS_SGL_DATA_BLOCK_GRANULARITY_INVALID: NvmeStatusGenericCommandCodes = 30

public val NVME_STATUS_SGL_DESCR_TYPE_INVALID: NvmeStatusGenericCommandCodes = 17

public val NVME_STATUS_SGL_OFFSET_INVALID: NvmeStatusGenericCommandCodes = 22

public val NVME_STATUS_STREAM_RESOURCE_ALLOCATION_FAILED: NvmeStatusCommandSpecificCodes = 127

public val NVME_STATUS_SUCCESS_COMPLETION: NvmeStatusGenericCommandCodes = 0

public val NVME_STATUS_TYPE_COMMAND_SPECIFIC: NvmeStatusTypes = 1

public val NVME_STATUS_TYPE_GENERIC_COMMAND: NvmeStatusTypes = 0

public val NVME_STATUS_TYPE_MEDIA_ERROR: NvmeStatusTypes = 2

public val NVME_STATUS_TYPE_VENDOR_SPECIFIC: NvmeStatusTypes = 7

public val NVME_STATUS_ZONE_BOUNDARY_ERROR: NvmeStatusCommandSpecificCodes = 184

public val NVME_STATUS_ZONE_FULL: NvmeStatusCommandSpecificCodes = 185

public val NVME_STATUS_ZONE_INVALID_FORMAT: NvmeStatusCommandSpecificCodes = 127

public val NVME_STATUS_ZONE_INVALID_STATE_TRANSITION: NvmeStatusCommandSpecificCodes = 191

public val NVME_STATUS_ZONE_INVALID_WRITE: NvmeStatusCommandSpecificCodes = 188

public val NVME_STATUS_ZONE_OFFLINE: NvmeStatusCommandSpecificCodes = 187

public val NVME_STATUS_ZONE_READ_ONLY: NvmeStatusCommandSpecificCodes = 186

public val NVME_STATUS_ZONE_TOO_MANY_ACTIVE: NvmeStatusCommandSpecificCodes = 189

public val NVME_STATUS_ZONE_TOO_MANY_OPEN: NvmeStatusCommandSpecificCodes = 190

public val NVME_STREAMS_GET_STATUS_MAX_IDS: UInt = 65535u

public val NVME_STREAMS_ID_MAX: UInt = 65535u

public val NVME_STREAMS_ID_MIN: UInt = 1u

public val NVME_TELEMETRY_DATA_BLOCK_SIZE: UInt = 512u

public val NVME_TEMPERATURE_OVER_THRESHOLD: NvmeTemperatureThresholdTypes = 0

public val NVME_TEMPERATURE_UNDER_THRESHOLD: NvmeTemperatureThresholdTypes = 1

public val NVME_WCS_DEVICE_ERROR_RECOVERY_LOG_VERSION_1: UInt = 1u

public val NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_VERSION_2: UInt = 2u

public val NVME_ZONE_RECEIVE_EXTENDED_REPORT_ZONES: NvmeZoneReceiveAction = 1

public val NVME_ZONE_RECEIVE_REPORT_ZONES: NvmeZoneReceiveAction = 0

public val NVME_ZONE_SEND_CLOSE: NvmeZoneSendAction = 1

public val NVME_ZONE_SEND_FINISH: NvmeZoneSendAction = 2

public val NVME_ZONE_SEND_OFFLINE: NvmeZoneSendAction = 5

public val NVME_ZONE_SEND_OPEN: NvmeZoneSendAction = 3

public val NVME_ZONE_SEND_RESET: NvmeZoneSendAction = 4

public val NVME_ZONE_SEND_SET_ZONE_DESCRIPTOR: NvmeZoneSendAction = 16

public val NVME_ZRA_ALL_ZONES: NvmeZoneReceiveActionSpecific = 0

public val NVME_ZRA_CLOSED_STATE_ZONES: NvmeZoneReceiveActionSpecific = 4

public val NVME_ZRA_EMPTY_STATE_ZONES: NvmeZoneReceiveActionSpecific = 1

public val NVME_ZRA_EO_STATE_ZONES: NvmeZoneReceiveActionSpecific = 3

public val NVME_ZRA_FULL_STATE_ZONES: NvmeZoneReceiveActionSpecific = 5

public val NVME_ZRA_IO_STATE_ZONES: NvmeZoneReceiveActionSpecific = 2

public val NVME_ZRA_OFFLINE_STATE_ZONES: NvmeZoneReceiveActionSpecific = 7

public val NVME_ZRA_RO_STATE_ZONES: NvmeZoneReceiveActionSpecific = 6

public val NV_ME_DEVICE_RECOVERY1MAX: NvmeWcsDeviceRecoveryAction1 = 15

public val NV_ME_DEVICE_RECOVERY2MAX: NvmeWcsDeviceRecoveryAction2 = 15

public val NV_ME_DEVICE_RECOVERY_CONTROLLER_RESET: NvmeWcsDeviceRecoveryAction2 = 0

public val NV_ME_DEVICE_RECOVERY_DEVICE_REPLACEMENT: NvmeWcsDeviceRecoveryAction1 = 4

public val NV_ME_DEVICE_RECOVERY_FORMAT_NVM: NvmeWcsDeviceRecoveryAction1 = 1

public val NV_ME_DEVICE_RECOVERY_NO_ACTION: NvmeWcsDeviceRecoveryAction1 = 0

public val NV_ME_DEVICE_RECOVERY_PERST: NvmeWcsDeviceRecoveryAction2 = 3

public val NV_ME_DEVICE_RECOVERY_PCIE_FUNCTION_RESET: NvmeWcsDeviceRecoveryAction2 = 2

public val NV_ME_DEVICE_RECOVERY_PCIE_HOT_RESET: NvmeWcsDeviceRecoveryAction2 = 5

public val NV_ME_DEVICE_RECOVERY_POWER_CYCLE: NvmeWcsDeviceRecoveryAction2 = 4

public val NV_ME_DEVICE_RECOVERY_SANITIZE: NvmeWcsDeviceRecoveryAction1 = 5

public val NV_ME_DEVICE_RECOVERY_SUBSYSTEM_RESET: NvmeWcsDeviceRecoveryAction2 = 1

public val NV_ME_DEVICE_RECOVERY_VENDOR_ANALYSIS: NvmeWcsDeviceRecoveryAction1 = 3

public val NV_ME_DEVICE_RECOVERY_VENDOR_SPECIFIC_COMMAND: NvmeWcsDeviceRecoveryAction1 = 2

public val TCG_HISTORY_ENTRY_VERSION_1: UInt = 1u
