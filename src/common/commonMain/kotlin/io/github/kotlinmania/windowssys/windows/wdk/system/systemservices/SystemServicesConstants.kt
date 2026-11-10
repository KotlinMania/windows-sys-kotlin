package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

public val ACPI_BUS: InterfaceType = 17

public val ADAPTER_INFO_API_BYPASS: UInt = 2u

public val ADAPTER_INFO_SYNCHRONOUS_CALLBACK: UInt = 1u

public val ALLOC_DATA_PRAGMA: UInt = 1u

public val ALLOC_PRAGMA: UInt = 1u

public val ANY_SIZE: UInt = 1u

public val APC_LEVEL: UInt = 1u

public val ARBITER_FLAG_BOOT_CONFIG: UInt = 1u

public val ARBITER_FLAG_OTHER_ENUM: UInt = 4u

public val ARBITER_FLAG_ROOT_ENUM: UInt = 2u

public val ARBITER_PARTIAL: UInt = 1u

public val ARM64_PCR_RESERVED_MASK: UInt = 4095u

public val ATS_DEVICE_SVM_OPTOUT: UInt = 1u

public val ACCESS_FLAG_FAULT: FaultInformationArm64Type = 5

public val ADDRESS_SIZE_FAULT: FaultInformationArm64Type = 1

public val AGP_CONTROL: ExtendedAgpRegister = 1

public val ALL_LOGGER_HANDLES_CLASS: TraceInformationClass = 6

public val APERTURE_PAGE_SIZE: ExtendedAgpRegister = 3

public val APERTURE_SIZE: ExtendedAgpRegister = 2

public val APIC_DESTINATION_MODE_LOGICAL_CLUSTERED: HalApicDestinationMode = 3

public val APIC_DESTINATION_MODE_LOGICAL_FLAT: HalApicDestinationMode = 2

public val APIC_DESTINATION_MODE_PHYSICAL: HalApicDestinationMode = 1

public val APIC_DESTINATION_MODE_UNKNOWN: HalApicDestinationMode = 4

public val ARBITER_ACTION_ADD_RESERVED: ArbiterAction = 8

public val ARBITER_ACTION_BOOT_ALLOCATION: ArbiterAction = 9

public val ARBITER_ACTION_COMMIT_ALLOCATION: ArbiterAction = 2

public val ARBITER_ACTION_QUERY_ALLOCATED_RESOURCES: ArbiterAction = 4

public val ARBITER_ACTION_QUERY_ARBITRATE: ArbiterAction = 7

public val ARBITER_ACTION_QUERY_CONFLICT: ArbiterAction = 6

public val ARBITER_ACTION_RETEST_ALLOCATION: ArbiterAction = 1

public val ARBITER_ACTION_ROLLBACK_ALLOCATION: ArbiterAction = 3

public val ARBITER_ACTION_TEST_ALLOCATION: ArbiterAction = 0

public val ARBITER_ACTION_WRITE_RESERVED_RESOURCES: ArbiterAction = 5

public val ARBITER_REQUEST_HAL_REPORTED: ArbiterRequestSource = 1

public val ARBITER_REQUEST_LEGACY_ASSIGNED: ArbiterRequestSource = 2

public val ARBITER_REQUEST_LEGACY_REPORTED: ArbiterRequestSource = 0

public val ARBITER_REQUEST_PNP_DETECTED: ArbiterRequestSource = 3

public val ARBITER_REQUEST_PNP_ENUMERATED: ArbiterRequestSource = 4

public val ARBITER_REQUEST_UNDEFINED: ArbiterRequestSource = -1

public val ARBITER_RESULT_EXTERNAL_CONFLICT: ArbiterResult = 1

public val ARBITER_RESULT_NULL_REQUEST: ArbiterResult = 2

public val ARBITER_RESULT_SUCCESS: ArbiterResult = 0

public val ARBITER_RESULT_UNDEFINED: ArbiterResult = -1

public val ARC_SYSTEM: ConfigurationType = 0

public val ASSIGN_SECURITY_DESCRIPTOR: SecurityOperationCode = 3

public val AUDIO_CONTROLLER: ConfigurationType = 23

public val BACKGROUND_WORK_QUEUE: WorkQueueType = 4

public val BD_CB_CLASSIFICATION_END: BdcbClassification = 4

public val BD_CB_CLASSIFICATION_KNOWN_BAD_IMAGE: BdcbClassification = 2

public val BD_CB_CLASSIFICATION_KNOWN_BAD_IMAGE_BOOT_CRITICAL: BdcbClassification = 3

public val BD_CB_CLASSIFICATION_KNOWN_GOOD_IMAGE: BdcbClassification = 1

public val BD_CB_CLASSIFICATION_UNKNOWN_IMAGE: BdcbClassification = 0

public val BD_CB_INITIALIZE_IMAGE: BdcbCallbackType = 1

public val BD_CB_STATUS_PREPARE_FOR_DEPENDENCY_LOAD: BdcbStatusUpdateType = 0

public val BD_CB_STATUS_PREPARE_FOR_DRIVER_LOAD: BdcbStatusUpdateType = 1

public val BD_CB_STATUS_PREPARE_FOR_UNLOAD: BdcbStatusUpdateType = 2

public val BD_CB_STATUS_UPDATE: BdcbCallbackType = 0

public val BOUND_EXCEPTION_CONTINUE_SEARCH: BoundCallbackStatus = 0

public val BOUND_EXCEPTION_ERROR: BoundCallbackStatus = 2

public val BOUND_EXCEPTION_HANDLED: BoundCallbackStatus = 1

public val BOUND_EXCEPTION_MAXIMUM: BoundCallbackStatus = 3

public val BUFFER_EMPTY: KbugcheckBufferDumpState = 0

public val BUFFER_FINISHED: KbugcheckBufferDumpState = 3

public val BUFFER_INCOMPLETE: KbugcheckBufferDumpState = 4

public val BUFFER_INSERTED: KbugcheckBufferDumpState = 1

public val BUFFER_STARTED: KbugcheckBufferDumpState = 2

public val BUS_QUERY_COMPATIBLE_I_DS: BusQueryIdType = 2

public val BUS_QUERY_CONTAINER_ID: BusQueryIdType = 5

public val BUS_QUERY_DEVICE_ID: BusQueryIdType = 0

public val BUS_QUERY_DEVICE_SERIAL_NUMBER: BusQueryIdType = 4

public val BUS_QUERY_HARDWARE_I_DS: BusQueryIdType = 1

public val BUS_QUERY_INSTANCE_ID: BusQueryIdType = 3

public val BUS_RELATIONS: DeviceRelationType = 0

public val BUS_WIDTH32BITS: PciBusWidth = 0

public val BUS_WIDTH64BITS: PciBusWidth = 1

public val C_BUS: InterfaceType = 9

public val CLFS_MAX_CONTAINER_INFO: UInt = 256u

public val CLFS_SCAN_BACKWARD: UByte = 4u.toUByte()

public val CLFS_SCAN_BUFFERED: UByte = 32u.toUByte()

public val CLFS_SCAN_CLOSE: UByte = 8u.toUByte()

public val CLFS_SCAN_FORWARD: UByte = 2u.toUByte()

public val CLFS_SCAN_INIT: UByte = 1u.toUByte()

public val CLFS_SCAN_INITIALIZED: UByte = 16u.toUByte()

public val CLOCK1_LEVEL: UInt = 28u

public val CLOCK2_LEVEL: UInt = 28u

public val CLOCK_LEVEL: UInt = 28u

public val CMCI_LEVEL: UInt = 5u

public val CM_RESOURCE_CONNECTION_CLASS_FUNCTION_CONFIG: UInt = 3u

public val CM_RESOURCE_CONNECTION_CLASS_GPIO: UInt = 1u

public val CM_RESOURCE_CONNECTION_CLASS_SERIAL: UInt = 2u

public val CM_RESOURCE_CONNECTION_TYPE_FUNCTION_CONFIG: UInt = 1u

public val CM_RESOURCE_CONNECTION_TYPE_GPIO_IO: UInt = 2u

public val CM_RESOURCE_CONNECTION_TYPE_SERIAL_I2C: UInt = 1u

public val CM_RESOURCE_CONNECTION_TYPE_SERIAL_SPI: UInt = 2u

public val CM_RESOURCE_CONNECTION_TYPE_SERIAL_UART: UInt = 3u

public val CM_RESOURCE_DMA_16: UInt = 1u

public val CM_RESOURCE_DMA_32: UInt = 2u

public val CM_RESOURCE_DMA_8: UInt = 0u

public val CM_RESOURCE_DMA_8_AND_16: UInt = 4u

public val CM_RESOURCE_DMA_BUS_MASTER: UInt = 8u

public val CM_RESOURCE_DMA_TYPE_A: UInt = 16u

public val CM_RESOURCE_DMA_TYPE_B: UInt = 32u

public val CM_RESOURCE_DMA_TYPE_F: UInt = 64u

public val CM_RESOURCE_DMA_V3: UInt = 128u

public val CM_RESOURCE_INTERRUPT_LATCHED: UInt = 1u

public val CM_RESOURCE_INTERRUPT_LEVEL_LATCHED_BITS: UInt = 1u

public val CM_RESOURCE_INTERRUPT_LEVEL_SENSITIVE: UInt = 0u

public val CM_RESOURCE_INTERRUPT_MESSAGE: UInt = 2u

public val CM_RESOURCE_INTERRUPT_POLICY_INCLUDED: UInt = 4u

public val CM_RESOURCE_INTERRUPT_SECONDARY_INTERRUPT: UInt = 16u

public val CM_RESOURCE_INTERRUPT_WAKE_HINT: UInt = 32u

public val CM_RESOURCE_MEMORY_24: UInt = 16u

public val CM_RESOURCE_MEMORY_BAR: UInt = 128u

public val CM_RESOURCE_MEMORY_CACHEABLE: UInt = 32u

public val CM_RESOURCE_MEMORY_COMBINEDWRITE: UInt = 8u

public val CM_RESOURCE_MEMORY_COMPAT_FOR_INACCESSIBLE_RANGE: UInt = 256u

public val CM_RESOURCE_MEMORY_LARGE: UInt = 3584u

public val CM_RESOURCE_MEMORY_LARGE_40: UInt = 512u

public val CM_RESOURCE_MEMORY_LARGE_40_MAXLEN: ULong = 1099511627520uL

public val CM_RESOURCE_MEMORY_LARGE_48: UInt = 1024u

public val CM_RESOURCE_MEMORY_LARGE_48_MAXLEN: ULong = 281474976645120uL

public val CM_RESOURCE_MEMORY_LARGE_64: UInt = 2048u

public val CM_RESOURCE_MEMORY_LARGE_64_MAXLEN: ULong = 18446744069414584320uL

public val CM_RESOURCE_MEMORY_PREFETCHABLE: UInt = 4u

public val CM_RESOURCE_MEMORY_READ_ONLY: UInt = 1u

public val CM_RESOURCE_MEMORY_READ_WRITE: UInt = 0u

public val CM_RESOURCE_MEMORY_WINDOW_DECODE: UInt = 64u

public val CM_RESOURCE_MEMORY_WRITEABILITY_MASK: UInt = 3u

public val CM_RESOURCE_MEMORY_WRITE_ONLY: UInt = 2u

public val CM_RESOURCE_PORT_10_BIT_DECODE: UInt = 4u

public val CM_RESOURCE_PORT_12_BIT_DECODE: UInt = 8u

public val CM_RESOURCE_PORT_16_BIT_DECODE: UInt = 16u

public val CM_RESOURCE_PORT_BAR: UInt = 256u

public val CM_RESOURCE_PORT_IO: UInt = 1u

public val CM_RESOURCE_PORT_MEMORY: UInt = 0u

public val CM_RESOURCE_PORT_PASSIVE_DECODE: UInt = 64u

public val CM_RESOURCE_PORT_POSITIVE_DECODE: UInt = 32u

public val CM_RESOURCE_PORT_WINDOW_DECODE: UInt = 128u

public val CM_SERVICE_MEASURED_BOOT_LOAD: UInt = 32u

public val CONNECT_CURRENT_VERSION: UInt = 5u

public val CONNECT_FULLY_SPECIFIED: UInt = 1u

public val CONNECT_FULLY_SPECIFIED_GROUP: UInt = 4u

public val CONNECT_LINE_BASED: UInt = 2u

public val CONNECT_MESSAGE_BASED: UInt = 3u

public val CONNECT_MESSAGE_BASED_PASSIVE: UInt = 5u

public val CP15_PCR_RESERVED_MASK: UInt = 4095u

public val CP_GET_ERROR: UInt = 2u

public val CP_GET_NODATA: UInt = 1u

public val CP_GET_SUCCESS: UInt = 0u

public val CARD_PRESENT: PciExpressCardPresence = 1

public val CBUS_CONFIGURATION: BusDataType = 3

public val CDROM_CONTROLLER: ConfigurationType = 15

public val CENTRAL_PROCESSOR: ConfigurationType = 1

public val CLFS_CLIENT_RECORD: UByte = 3u.toUByte()

public val CLFS_CONTAINER_ACTIVE: UInt = 4u

public val CLFS_CONTAINER_ACTIVE_PENDING_DELETE: UInt = 8u

public val CLFS_CONTAINER_INACTIVE: UInt = 2u

public val CLFS_CONTAINER_INITIALIZING: UInt = 1u

public val CLFS_CONTAINER_PENDING_ARCHIVE: UInt = 16u

public val CLFS_CONTAINER_PENDING_ARCHIVE_AND_DELETE: UInt = 32u

public val CLFS_DATA_RECORD: UByte = 1u.toUByte()

public val CLFS_NULL_RECORD: UByte = 0u.toUByte()

public val CLFS_RESTART_RECORD: UByte = 2u.toUByte()

public val CLS_CONTAINER_ACTIVE: UInt = 4u

public val CLS_CONTAINER_ACTIVE_PENDING_DELETE: UInt = 8u

public val CLS_CONTAINER_INACTIVE: UInt = 2u

public val CLS_CONTAINER_INITIALIZING: UInt = 1u

public val CLS_CONTAINER_PENDING_ARCHIVE: UInt = 16u

public val CLS_CONTAINER_PENDING_ARCHIVE_AND_DELETE: UInt = 32u

public val CM_RESOURCE_SHARE_DEVICE_EXCLUSIVE: CmShareDisposition = 1

public val CM_RESOURCE_SHARE_DRIVER_EXCLUSIVE: CmShareDisposition = 2

public val CM_RESOURCE_SHARE_SHARED: CmShareDisposition = 3

public val CM_RESOURCE_SHARE_UNDETERMINED: CmShareDisposition = 0

public val CM_RESOURCE_TYPE_BUS_NUMBER: UInt = 6u

public val CM_RESOURCE_TYPE_CONFIG_DATA: UInt = 128u

public val CM_RESOURCE_TYPE_CONNECTION: UInt = 132u

public val CM_RESOURCE_TYPE_DEVICE_PRIVATE: UInt = 129u

public val CM_RESOURCE_TYPE_DEVICE_SPECIFIC: UInt = 5u

public val CM_RESOURCE_TYPE_DMA: UInt = 4u

public val CM_RESOURCE_TYPE_INTERRUPT: UInt = 2u

public val CM_RESOURCE_TYPE_MAXIMUM: UInt = 8u

public val CM_RESOURCE_TYPE_MEMORY: UInt = 3u

public val CM_RESOURCE_TYPE_MEMORY_LARGE: UInt = 7u

public val CM_RESOURCE_TYPE_MF_CARD_CONFIG: UInt = 131u

public val CM_RESOURCE_TYPE_NON_ARBITRATED: UInt = 128u

public val CM_RESOURCE_TYPE_NULL: UInt = 0u

public val CM_RESOURCE_TYPE_PC_CARD_CONFIG: UInt = 130u

public val CM_RESOURCE_TYPE_PORT: UInt = 1u

public val CMOS: BusDataType = 0

public val COMMON_BUFFER_CONFIG_TYPE_HARDWARE_ACCESS_PERMISSIONS: DmaCommonBufferExtendedConfigurationType = 2

public val COMMON_BUFFER_CONFIG_TYPE_LOGICAL_ADDRESS_LIMITS: DmaCommonBufferExtendedConfigurationType = 0

public val COMMON_BUFFER_CONFIG_TYPE_MAX: DmaCommonBufferExtendedConfigurationType = 3

public val COMMON_BUFFER_CONFIG_TYPE_SUB_SECTION: DmaCommonBufferExtendedConfigurationType = 1

public val COMMON_BUFFER_HARDWARE_ACCESS_MAX: DmaCommonBufferExtendedConfigurationAccessType = 3

public val COMMON_BUFFER_HARDWARE_ACCESS_READ_ONLY: DmaCommonBufferExtendedConfigurationAccessType = 0

public val COMMON_BUFFER_HARDWARE_ACCESS_READ_WRITE: DmaCommonBufferExtendedConfigurationAccessType = 2

public val COMMON_BUFFER_HARDWARE_ACCESS_WRITE_ONLY: DmaCommonBufferExtendedConfigurationAccessType = 1

public val COMPATIBLE: DmaSpeed = 0

public val CONFIGURATION_SPACE_UNDEFINED: BusDataType = -1

public val CONTINUE_COMPLETION: IoCompletionRoutineResult = 0

public val CREATE_FILE_TYPE_MAILSLOT: CreateFileType = 2

public val CREATE_FILE_TYPE_NAMED_PIPE: CreateFileType = 1

public val CREATE_FILE_TYPE_NONE: CreateFileType = 0

public val CRITICAL_WORK_QUEUE: WorkQueueType = 0

public val CUSTOM_PRIORITY_WORK_QUEUE: WorkQueueType = 32

public val D3COLD_SUPPORT_INTERFACE_VERSION: UInt = 1u

public val DBG_DEVICE_FLAG_BARS_MAPPED: UInt = 2u

public val DBG_DEVICE_FLAG_HAL_SCRATCH_ALLOCATED: UInt = 1u

public val DBG_DEVICE_FLAG_HOST_VISIBLE_ALLOCATED: UInt = 32u

public val DBG_DEVICE_FLAG_SCRATCH_ALLOCATED: UInt = 4u

public val DBG_DEVICE_FLAG_SYNTHETIC: UInt = 16u

public val DBG_DEVICE_FLAG_UNCACHED_MEMORY: UInt = 8u

public val DBG_STATUS_BUGCHECK_FIRST: UInt = 3u

public val DBG_STATUS_BUGCHECK_SECOND: UInt = 4u

public val DBG_STATUS_CONTROL_C: UInt = 1u

public val DBG_STATUS_DEBUG_CONTROL: UInt = 6u

public val DBG_STATUS_FATAL: UInt = 5u

public val DBG_STATUS_SYSRQ: UInt = 2u

public val DBG_STATUS_WORKER: UInt = 7u

public val DEVICE_DESCRIPTION_VERSION: UInt = 0u

public val DEVICE_DESCRIPTION_VERSION1: UInt = 1u

public val DEVICE_DESCRIPTION_VERSION2: UInt = 2u

public val DEVICE_DESCRIPTION_VERSION3: UInt = 3u

public val DEVICE_INTERFACE_INCLUDE_NONACTIVE: UInt = 1u

public val DEVICE_RESET_INTERFACE_VERSION: UInt = 1u

public val DEVICE_RESET_INTERFACE_VERSION_1: UInt = 1u

public val DEVICE_RESET_INTERFACE_VERSION_2: UInt = 2u

public val DEVICE_RESET_INTERFACE_VERSION_3: UInt = 3u

public val DIRECTORY_CREATE_OBJECT: UInt = 4u

public val DIRECTORY_CREATE_SUBDIRECTORY: UInt = 8u

public val DIRECTORY_QUERY: UInt = 1u

public val DIRECTORY_TRAVERSE: UInt = 2u

public val DISPATCH_LEVEL: UInt = 2u

public val DMAV3_TRANFER_WIDTH_128: UInt = 4u

public val DMAV3_TRANFER_WIDTH_16: UInt = 1u

public val DMAV3_TRANFER_WIDTH_256: UInt = 5u

public val DMAV3_TRANFER_WIDTH_32: UInt = 2u

public val DMAV3_TRANFER_WIDTH_64: UInt = 3u

public val DMAV3_TRANFER_WIDTH_8: UInt = 0u

public val DMA_ADAPTER_INFO_VERSION1: UInt = 1u

public val DMA_FAIL_ON_BOUNCE: UInt = 4u

public val DMA_IOMMU_INTERFACE_EX_VERSION: UInt = 1u

public val DMA_IOMMU_INTERFACE_EX_VERSION_1: UInt = 1u

public val DMA_IOMMU_INTERFACE_EX_VERSION_2: UInt = 2u

public val DMA_IOMMU_INTERFACE_EX_VERSION_MAX: UInt = 2u

public val DMA_IOMMU_INTERFACE_EX_VERSION_MIN: UInt = 1u

public val DMA_IOMMU_INTERFACE_VERSION: UInt = 1u

public val DMA_IOMMU_INTERFACE_VERSION_1: UInt = 1u

public val DMA_SYNCHRONOUS_CALLBACK: UInt = 1u

public val DMA_TRANSFER_CONTEXT_SIZE_V1: UInt = 128u

public val DMA_TRANSFER_CONTEXT_VERSION1: UInt = 1u

public val DMA_TRANSFER_INFO_VERSION1: UInt = 1u

public val DMA_TRANSFER_INFO_VERSION2: UInt = 2u

public val DMA_ZERO_BUFFERS: UInt = 2u

public val DOMAIN_COMMON_BUFFER_LARGE_PAGE: UInt = 1u

public val DPC_NORMAL: UInt = 0u

public val DPC_THREADED: UInt = 1u

public val DPC_WATCHDOG_GLOBAL_TRIAGE_BLOCK_REVISION_1: UInt = 1u

public val DPC_WATCHDOG_GLOBAL_TRIAGE_BLOCK_SIGNATURE: UInt = 2931740382u

public val DRIVER_VERIFIER_FORCE_IRQL_CHECKING: UInt = 2u

public val DRIVER_VERIFIER_INJECT_ALLOCATION_FAILURES: UInt = 4u

public val DRIVER_VERIFIER_IO_CHECKING: UInt = 16u

public val DRIVER_VERIFIER_SPECIAL_POOLING: UInt = 1u

public val DRIVER_VERIFIER_TRACK_POOL_ALLOCATIONS: UInt = 8u

public val DRS_LEVEL: UInt = 14u

public val DRVO_BOOTREINIT_REGISTERED: UInt = 32u

public val DRVO_BUILTIN_DRIVER: UInt = 4u

public val DRVO_INITIALIZED: UInt = 16u

public val DRVO_LEGACY_DRIVER: UInt = 2u

public val DRVO_LEGACY_RESOURCES: UInt = 64u

public val DRVO_REINIT_REGISTERED: UInt = 8u

public val DRVO_UNLOAD_INVOKED: UInt = 1u

public val DUPLICATE_SAME_ATTRIBUTES: UInt = 4u

public val DEALLOCATE_OBJECT: IoAllocationAction = 2

public val DEALLOCATE_OBJECT_KEEP_REGISTERS: IoAllocationAction = 3

public val DELAY_EXECUTION: KwaitReason = 4

public val DELAYED_WORK_QUEUE: WorkQueueType = 1

public val DELETE_SECURITY_DESCRIPTOR: SecurityOperationCode = 2

public val DEVICE_DIRECTORY_DATA: DeviceDirectoryType = 0

public val DEVICE_POWER_STATE: PowerStateType = 1

public val DEVICE_PROPERTY_ADDRESS: DeviceRegistryProperty = 16

public val DEVICE_PROPERTY_ALLOCATED_RESOURCES: DeviceRegistryProperty = 21

public val DEVICE_PROPERTY_BOOT_CONFIGURATION: DeviceRegistryProperty = 3

public val DEVICE_PROPERTY_BOOT_CONFIGURATION_TRANSLATED: DeviceRegistryProperty = 4

public val DEVICE_PROPERTY_BUS_NUMBER: DeviceRegistryProperty = 14

public val DEVICE_PROPERTY_BUS_TYPE_GUID: DeviceRegistryProperty = 8204

public val DEVICE_PROPERTY_CLASS_GUID: DeviceRegistryProperty = 4102

public val DEVICE_PROPERTY_CLASS_NAME: DeviceRegistryProperty = 4101

public val DEVICE_PROPERTY_COMPATIBLE_I_DS: DeviceRegistryProperty = 16386

public val DEVICE_PROPERTY_CONTAINER_ID: DeviceRegistryProperty = 4118

public val DEVICE_PROPERTY_DEVICE_DESCRIPTION: DeviceRegistryProperty = 4096

public val DEVICE_PROPERTY_DRIVER_KEY_NAME: DeviceRegistryProperty = 4103

public val DEVICE_PROPERTY_ENUMERATOR_NAME: DeviceRegistryProperty = 4111

public val DEVICE_PROPERTY_FRIENDLY_NAME: DeviceRegistryProperty = 4105

public val DEVICE_PROPERTY_HARDWARE_ID: DeviceRegistryProperty = 16385

public val DEVICE_PROPERTY_INSTALL_STATE: DeviceRegistryProperty = 18

public val DEVICE_PROPERTY_LEGACY_BUS_TYPE: DeviceRegistryProperty = 13

public val DEVICE_PROPERTY_LOCATION_INFORMATION: DeviceRegistryProperty = 4106

public val DEVICE_PROPERTY_MANUFACTURER: DeviceRegistryProperty = 4104

public val DEVICE_PROPERTY_PHYSICAL_DEVICE_OBJECT_NAME: DeviceRegistryProperty = 4107

public val DEVICE_PROPERTY_REMOVAL_POLICY: DeviceRegistryProperty = 19

public val DEVICE_PROPERTY_RESOURCE_REQUIREMENTS: DeviceRegistryProperty = 20

public val DEVICE_PROPERTY_UI_NUMBER: DeviceRegistryProperty = 17

public val DEVICE_TEXT_DESCRIPTION: DeviceTextType = 0

public val DEVICE_TEXT_LOCATION_INFORMATION: DeviceTextType = 1

public val DEVICE_USAGE_TYPE_BOOT: DeviceUsageNotificationType = 4

public val DEVICE_USAGE_TYPE_DUMP_FILE: DeviceUsageNotificationType = 3

public val DEVICE_USAGE_TYPE_GUEST_ASSIGNED: DeviceUsageNotificationType = 6

public val DEVICE_USAGE_TYPE_HIBERNATION: DeviceUsageNotificationType = 2

public val DEVICE_USAGE_TYPE_PAGING: DeviceUsageNotificationType = 1

public val DEVICE_USAGE_TYPE_POST_DISPLAY: DeviceUsageNotificationType = 5

public val DEVICE_USAGE_TYPE_UNDEFINED: DeviceUsageNotificationType = 0

public val DEVICE_WAKE_DEPTH_D0: DeviceWakeDepth = 1

public val DEVICE_WAKE_DEPTH_D1: DeviceWakeDepth = 2

public val DEVICE_WAKE_DEPTH_D2: DeviceWakeDepth = 3

public val DEVICE_WAKE_DEPTH_D3COLD: DeviceWakeDepth = 5

public val DEVICE_WAKE_DEPTH_D3HOT: DeviceWakeDepth = 4

public val DEVICE_WAKE_DEPTH_MAXIMUM: DeviceWakeDepth = 6

public val DEVICE_WAKE_DEPTH_NOT_WAKEABLE: DeviceWakeDepth = 0

public val DIRECTORY_NOTIFY_EXTENDED_INFORMATION: DirectoryNotifyInformationClass = 2

public val DIRECTORY_NOTIFY_FULL_INFORMATION: DirectoryNotifyInformationClass = 3

public val DIRECTORY_NOTIFY_INFORMATION: DirectoryNotifyInformationClass = 1

public val DIRECTORY_NOTIFY_MAXIMUM_INFORMATION: DirectoryNotifyInformationClass = 4

public val DISABLED_CONTROL: NpemControlStandardControlBit = 11

public val DISK_CONTROLLER: ConfigurationType = 13

public val DISK_IO_NOTIFY_ROUTINES_CLASS: TraceInformationClass = 11

public val DISK_PERIPHERAL: ConfigurationType = 25

public val DISPLAY_CONTROLLER: ConfigurationType = 19

public val DMA_ABORTED: DmaCompletionStatus = 1

public val DMA_CANCELLED: DmaCompletionStatus = 3

public val DMA_COMPLETE: DmaCompletionStatus = 0

public val DMA_ERROR: DmaCompletionStatus = 2

public val DOCKING_INFORMATION: ConfigurationType = 38

public val DOMAIN_CONFIGURATION_ARM64: DomainConfigurationArch = 0

public val DOMAIN_CONFIGURATION_INVALID: DomainConfigurationArch = 2

public val DOMAIN_CONFIGURATION_X64: DomainConfigurationArch = 1

public val DOMAIN_TYPE_MAX: IommuDmaDomainType = 3

public val DOMAIN_TYPE_PASS_THROUGH: IommuDmaDomainType = 1

public val DOMAIN_TYPE_TRANSLATE: IommuDmaDomainType = 0

public val DOMAIN_TYPE_UNMANAGED: IommuDmaDomainType = 2

public val DRIVER_DIRECTORY_DATA: DriverDirectoryType = 1

public val DRIVER_DIRECTORY_IMAGE: DriverDirectoryType = 0

public val DRIVER_DIRECTORY_SHARED_DATA: DriverDirectoryType = 2

public val DRIVER_REG_KEY_PARAMETERS: DriverRegkeyType = 0

public val DRIVER_REG_KEY_PERSISTENT_STATE: DriverRegkeyType = 1

public val DRIVER_REG_KEY_SHARED_PERSISTENT_STATE: DriverRegkeyType = 2

public val DRV_RT_POOL_NX_OPT_IN: DriverRuntimeInitFlags = 1

public val DTI_ADAPTER: ConfigurationType = 11

public val EFLAG_SIGN: UInt = 32768u

public val EFLAG_ZERO: UInt = 16384u

public val EISA_EMPTY_SLOT: UInt = 131u

public val EISA_FREE_FORM_DATA: UInt = 64u

public val EISA_FUNCTION_ENABLED: UInt = 128u

public val EISA_HAS_DMA_ENTRY: UInt = 8u

public val EISA_HAS_IRQ_ENTRY: UInt = 4u

public val EISA_HAS_MEMORY_ENTRY: UInt = 2u

public val EISA_HAS_PORT_INIT_ENTRY: UInt = 32u

public val EISA_HAS_PORT_RANGE: UInt = 16u

public val EISA_HAS_TYPE_ENTRY: UInt = 1u

public val EISA_INVALID_BIOS_CALL: UInt = 134u

public val EISA_INVALID_CONFIGURATION: UInt = 130u

public val EISA_INVALID_FUNCTION: UInt = 129u

public val EISA_INVALID_SLOT: UInt = 128u

public val EISA_MEMORY_TYPE_RAM: UInt = 1u

public val EISA_MORE_ENTRIES: UInt = 128u

public val EISA_SYSTEM_MEMORY: UInt = 0u

public val ERROR_LOG_LIMIT_SIZE: UInt = 240u

public val ERROR_MAJOR_REVISION_SAL_03_00: UInt = 0u

public val ERROR_MINOR_REVISION_SAL_03_00: UInt = 2u

public val ERROR_PROCESSOR_STATE_PARAMETER_BUS_CHECK_MASK: UInt = 1u

public val ERROR_PROCESSOR_STATE_PARAMETER_BUS_CHECK_SHIFT: UInt = 61u

public val ERROR_PROCESSOR_STATE_PARAMETER_CACHE_CHECK_MASK: UInt = 1u

public val ERROR_PROCESSOR_STATE_PARAMETER_CACHE_CHECK_SHIFT: UInt = 59u

public val ERROR_PROCESSOR_STATE_PARAMETER_MICROARCH_CHECK_MASK: UInt = 1u

public val ERROR_PROCESSOR_STATE_PARAMETER_MICROARCH_CHECK_SHIFT: UInt = 63u

public val ERROR_PROCESSOR_STATE_PARAMETER_REG_CHECK_MASK: UInt = 1u

public val ERROR_PROCESSOR_STATE_PARAMETER_REG_CHECK_SHIFT: UInt = 62u

public val ERROR_PROCESSOR_STATE_PARAMETER_TLB_CHECK_MASK: UInt = 1u

public val ERROR_PROCESSOR_STATE_PARAMETER_TLB_CHECK_SHIFT: UInt = 60u

public val ERROR_PROCESSOR_STATE_PARAMETER_UNKNOWN_CHECK_MASK: UInt = 1u

public val ERROR_PROCESSOR_STATE_PARAMETER_UNKNOWN_CHECK_SHIFT: UInt = 63u

public val ERRTYP_BUS: UInt = 16u

public val ERRTYP_CACHE: UInt = 6u

public val ERRTYP_FLOW: UInt = 9u

public val ERRTYP_FUNCTION: UInt = 7u

public val ERRTYP_IMPROPER: UInt = 18u

public val ERRTYP_INTERNAL: UInt = 1u

public val ERRTYP_LOSSOFLOCKSTEP: UInt = 20u

public val ERRTYP_MAP: UInt = 17u

public val ERRTYP_MEM: UInt = 4u

public val ERRTYP_PARITY: UInt = 22u

public val ERRTYP_PATHERROR: UInt = 24u

public val ERRTYP_POISONED: UInt = 26u

public val ERRTYP_PROTOCOL: UInt = 23u

public val ERRTYP_RESPONSE: UInt = 21u

public val ERRTYP_SELFTEST: UInt = 8u

public val ERRTYP_TIMEOUT: UInt = 25u

public val ERRTYP_TLB: UInt = 5u

public val ERRTYP_UNIMPL: UInt = 19u

public val EVENT_QUERY_STATE: UInt = 1u

public val EXCEPTION_ALIGNMENT_CHECK: UInt = 17u

public val EXCEPTION_BOUND_CHECK: UInt = 5u

public val EXCEPTION_CP_FAULT: UInt = 21u

public val EXCEPTION_DEBUG: UInt = 1u

public val EXCEPTION_DIVIDED_BY_ZERO: UInt = 0u

public val EXCEPTION_DOUBLE_FAULT: UInt = 8u

public val EXCEPTION_GP_FAULT: UInt = 13u

public val EXCEPTION_INT3: UInt = 3u

public val EXCEPTION_INVALID_OPCODE: UInt = 6u

public val EXCEPTION_INVALID_TSS: UInt = 10u

public val EXCEPTION_NMI: UInt = 2u

public val EXCEPTION_NPX_ERROR: UInt = 16u

public val EXCEPTION_NPX_NOT_AVAILABLE: UInt = 7u

public val EXCEPTION_NPX_OVERRUN: UInt = 9u

public val EXCEPTION_RESERVED_TRAP: UInt = 15u

public val EXCEPTION_SEGMENT_NOT_PRESENT: UInt = 11u

public val EXCEPTION_SE_FAULT: UInt = 23u

public val EXCEPTION_SOFTWARE_ORIGINATE: UInt = 128u

public val EXCEPTION_STACK_FAULT: UInt = 12u

public val EXCEPTION_VIRTUALIZATION_FAULT: UInt = 32u

public val EX_CARR_ALLOCATE_NONPAGED_POOL: UInt = 1u

public val EX_CARR_ALLOCATE_PAGED_POOL: UInt = 0u

public val EX_CARR_DISABLE_EXPANSION: UInt = 2u

public val EX_CREATE_FLAG_FILE_DEST_OPEN_FOR_COPY: UInt = 2u

public val EX_CREATE_FLAG_FILE_SOURCE_OPEN_FOR_COPY: UInt = 1u

public val EX_DEFAULT_PUSH_LOCK_FLAGS: UInt = 0u

public val EX_LOOKASIDE_LIST_EX_FLAGS_FAIL_NO_RAISE: UInt = 2u

public val EX_LOOKASIDE_LIST_EX_FLAGS_RAISE_ON_FAIL: UInt = 1u

public val EX_MAXIMUM_LOOKASIDE_DEPTH_BASE: UInt = 256u

public val EX_MAXIMUM_LOOKASIDE_DEPTH_LIMIT: UInt = 1024u

public val EX_RUNDOWN_ACTIVE: UInt = 1u

public val EX_RUNDOWN_COUNT_SHIFT: UInt = 1u

public val EX_TIMER_HIGH_RESOLUTION: UInt = 4u

public val EX_TIMER_NO_WAKE: UInt = 8u

public val EISA: InterfaceType = 2

public val EISA_ADAPTER: ConfigurationType = 8

public val EISA_CONFIGURATION: BusDataType = 1

public val EJECTION_RELATIONS: DeviceRelationType = 1

public val END_ALTERNATIVES: AlternativeArchitectureType = 2

public val EVENT_CATEGORY_DEVICE_INTERFACE_CHANGE: IoNotificationEventCategory = 2

public val EVENT_CATEGORY_HARDWARE_PROFILE_CHANGE: IoNotificationEventCategory = 1

public val EVENT_CATEGORY_KERNEL_SOFT_RESTART: IoNotificationEventCategory = 4

public val EVENT_CATEGORY_RESERVED: IoNotificationEventCategory = 0

public val EVENT_CATEGORY_TARGET_DEVICE_CHANGE: IoNotificationEventCategory = 3

public val EVENT_LOGGER_HANDLE_CLASS: TraceInformationClass = 5

public val EXECUTIVE: KwaitReason = 0

public val EXTERNAL_FAULT: FaultInformationArm64Type = 3

public val FILE_128_BYTE_ALIGNMENT: UInt = 127u

public val FILE_256_BYTE_ALIGNMENT: UInt = 255u

public val FILE_32_BYTE_ALIGNMENT: UInt = 31u

public val FILE_512_BYTE_ALIGNMENT: UInt = 511u

public val FILE_64_BYTE_ALIGNMENT: UInt = 63u

public val FILE_ATTRIBUTE_VALID_FLAGS: UInt = 32695u

public val FILE_ATTRIBUTE_VALID_KERNEL_SET_FLAGS: UInt = 5910951u

public val FILE_ATTRIBUTE_VALID_SET_FLAGS: UInt = 12711u

public val FILE_AUTOGENERATED_DEVICE_NAME: UInt = 128u

public val FILE_BYTE_ALIGNMENT: UInt = 0u

public val FILE_CHARACTERISTICS_EXPECT_ORDERLY_REMOVAL: UInt = 512u

public val FILE_CHARACTERISTICS_EXPECT_ORDERLY_REMOVAL_DEPRECATED: UInt = 512u

public val FILE_CHARACTERISTICS_EXPECT_ORDERLY_REMOVAL_EX: UInt = 16384u

public val FILE_CHARACTERISTICS_EXPECT_SURPRISE_REMOVAL: UInt = 768u

public val FILE_CHARACTERISTICS_EXPECT_SURPRISE_REMOVAL_DEPRECATED: UInt = 768u

public val FILE_CHARACTERISTICS_EXPECT_SURPRISE_REMOVAL_EX: UInt = 32768u

public val FILE_CHARACTERISTICS_REMOVAL_POLICY_MASK: UInt = 768u

public val FILE_CHARACTERISTICS_REMOVAL_POLICY_MASK_DEPRECATED: UInt = 768u

public val FILE_CHARACTERISTICS_REMOVAL_POLICY_MASK_EX: UInt = 768u

public val FILE_CHARACTERISTIC_CSV: UInt = 65536u

public val FILE_CHARACTERISTIC_PNP_DEVICE: UInt = 2048u

public val FILE_CHARACTERISTIC_TS_DEVICE: UInt = 4096u

public val FILE_CHARACTERISTIC_WEBDAV_DEVICE: UInt = 8192u

public val FILE_DEVICE_ALLOW_APPCONTAINER_TRAVERSAL: UInt = 131072u

public val FILE_DEVICE_IS_MOUNTED: UInt = 32u

public val FILE_DEVICE_REQUIRE_SECURITY_CHECK: UInt = 1048576u

public val FILE_DEVICE_SECURE_OPEN: UInt = 256u

public val FILE_FLOPPY_DISKETTE: UInt = 4u

public val FILE_LONG_ALIGNMENT: UInt = 3u

public val FILE_OCTA_ALIGNMENT: UInt = 15u

public val FILE_PORTABLE_DEVICE: UInt = 262144u

public val FILE_QUAD_ALIGNMENT: UInt = 7u

public val FILE_QUERY_INDEX_SPECIFIED: UInt = 4u

public val FILE_QUERY_NO_CURSOR_UPDATE: UInt = 16u

public val FILE_QUERY_RESTART_SCAN: UInt = 1u

public val FILE_QUERY_RETURN_ON_DISK_ENTRIES_ONLY: UInt = 8u

public val FILE_QUERY_RETURN_SINGLE_ENTRY: UInt = 2u

public val FILE_READ_ONLY_DEVICE: UInt = 2u

public val FILE_REMOTE_DEVICE: UInt = 16u

public val FILE_REMOTE_DEVICE_VSMB: UInt = 524288u

public val FILE_REMOVABLE_MEDIA: UInt = 1u

public val FILE_SHARE_VALID_FLAGS: UInt = 7u

public val FILE_SKIP_SET_USER_EVENT_ON_FAST_IO: UInt = 4u

public val FILE_USE_FILE_POINTER_POSITION: UInt = 4294967294u

public val FILE_VALID_EXTENDED_OPTION_FLAGS: UInt = 268435456u

public val FILE_VIRTUAL_VOLUME: UInt = 64u

public val FILE_WORD_ALIGNMENT: UInt = 1u

public val FILE_WRITE_ONCE_MEDIA: UInt = 8u

public val FILE_WRITE_TO_END_OF_FILE: UInt = 4294967295u

public val FLAG_OWNER_POINTER_IS_THREAD: UInt = 1u

public val FLUSH_MULTIPLE_MAXIMUM: UInt = 32u

public val FM_LOCK_BIT: UInt = 1u

public val FM_LOCK_BIT_V: UInt = 0u

public val FO_ALERTABLE_IO: UInt = 4u

public val FO_BYPASS_IO_ENABLED: UInt = 8388608u

public val FO_CACHE_SUPPORTED: UInt = 64u

public val FO_CLEANUP_COMPLETE: UInt = 16384u

public val FO_DELETE_ON_CLOSE: UInt = 65536u

public val FO_DIRECT_DEVICE_OPEN: UInt = 2048u

public val FO_DISALLOW_EXCLUSIVE: UInt = 33554432u

public val FO_FILE_FAST_IO_READ: UInt = 524288u

public val FO_FILE_MODIFIED: UInt = 4096u

public val FO_FILE_OPEN: UInt = 1u

public val FO_FILE_OPEN_CANCELLED: UInt = 2097152u

public val FO_FILE_SIZE_CHANGED: UInt = 8192u

public val FO_FLAGS_VALID_ONLY_DURING_CREATE: UInt = 33554432u

public val FO_GENERATE_AUDIT_ON_CLOSE: UInt = 1024u

public val FO_HANDLE_CREATED: UInt = 262144u

public val FO_INDIRECT_WAIT_OBJECT: UInt = 268435456u

public val FO_MAILSLOT: UInt = 512u

public val FO_NAMED_PIPE: UInt = 128u

public val FO_NO_INTERMEDIATE_BUFFERING: UInt = 8u

public val FO_OPENED_CASE_SENSITIVE: UInt = 131072u

public val FO_QUEUE_IRP_TO_THREAD: UInt = 1024u

public val FO_RANDOM_ACCESS: UInt = 1048576u

public val FO_REMOTE_ORIGIN: UInt = 16777216u

public val FO_SECTION_MINSTORE_TREATMENT: UInt = 536870912u

public val FO_SEQUENTIAL_ONLY: UInt = 32u

public val FO_SKIP_COMPLETION_PORT: UInt = 33554432u

public val FO_SKIP_SET_EVENT: UInt = 67108864u

public val FO_SKIP_SET_FAST_IO: UInt = 134217728u

public val FO_STREAM_FILE: UInt = 256u

public val FO_SYNCHRONOUS_IO: UInt = 2u

public val FO_TEMPORARY_FILE: UInt = 32768u

public val FO_VOLUME_OPEN: UInt = 4194304u

public val FO_WRITE_THROUGH: UInt = 16u

public val FPB_MEM_HIGH_VECTOR_GRANULARITY_16GB: UInt = 6u

public val FPB_MEM_HIGH_VECTOR_GRANULARITY_1GB: UInt = 2u

public val FPB_MEM_HIGH_VECTOR_GRANULARITY_1MB: UInt = 9u

public val FPB_MEM_HIGH_VECTOR_GRANULARITY_256MB: UInt = 0u

public val FPB_MEM_HIGH_VECTOR_GRANULARITY_2GB: UInt = 3u

public val FPB_MEM_HIGH_VECTOR_GRANULARITY_32GB: UInt = 7u

public val FPB_MEM_HIGH_VECTOR_GRANULARITY_4GB: UInt = 4u

public val FPB_MEM_HIGH_VECTOR_GRANULARITY_512MB: UInt = 1u

public val FPB_MEM_HIGH_VECTOR_GRANULARITY_8GB: UInt = 5u

public val FPB_MEM_LOW_VECTOR_GRANULARITY_16MB: UInt = 4u

public val FPB_MEM_LOW_VECTOR_GRANULARITY_1MB: UInt = 0u

public val FPB_MEM_LOW_VECTOR_GRANULARITY_2MB: UInt = 1u

public val FPB_MEM_LOW_VECTOR_GRANULARITY_4MB: UInt = 2u

public val FPB_MEM_LOW_VECTOR_GRANULARITY_8MB: UInt = 3u

public val FPB_MEM_VECTOR_GRANULARITY_1B: UInt = 8u

public val FPB_RID_VECTOR_GRANULARITY_256RIDS: UInt = 5u

public val FPB_RID_VECTOR_GRANULARITY_64RIDS: UInt = 3u

public val FPB_RID_VECTOR_GRANULARITY_8RIDS: UInt = 0u

public val FPB_VECTOR_SELECT_MEM_HIGH: UInt = 2u

public val FPB_VECTOR_SELECT_MEM_LOW: UInt = 1u

public val FPB_VECTOR_SELECT_RID: UInt = 0u

public val FPB_VECTOR_SIZE_SUPPORTED_1KBITS: UInt = 2u

public val FPB_VECTOR_SIZE_SUPPORTED_256BITS: UInt = 0u

public val FPB_VECTOR_SIZE_SUPPORTED_2KBITS: UInt = 3u

public val FPB_VECTOR_SIZE_SUPPORTED_4KBITS: UInt = 4u

public val FPB_VECTOR_SIZE_SUPPORTED_512BITS: UInt = 1u

public val FPB_VECTOR_SIZE_SUPPORTED_8KBITS: UInt = 5u

public val FAIL_CONTROL: NpemControlStandardControlBit = 4

public val FAULT_INFORMATION_ARM64: FaultInformationArch = 1

public val FAULT_INFORMATION_INVALID: FaultInformationArch = 0

public val FAULT_INFORMATION_X64: FaultInformationArch = 2

public val FLOATING_POINT_PROCESSOR: ConfigurationType = 2

public val FLOPPY_DISK_PERIPHERAL: ConfigurationType = 26

public val FLT_IO_NOTIFY_ROUTINES_CLASS: TraceInformationClass = 13

public val FREE_PAGE: KwaitReason = 1

public val FUNCTION_LEVEL_DEVICE_RESET: DeviceResetType = 0

public val GENPROC_FLAGS_CORRECTED: UInt = 8u

public val GENPROC_FLAGS_OVERFLOW: UInt = 4u

public val GENPROC_FLAGS_PRECISEIP: UInt = 2u

public val GENPROC_FLAGS_RESTARTABLE: UInt = 1u

public val GENPROC_OP_DATAREAD: UInt = 1u

public val GENPROC_OP_DATAWRITE: UInt = 2u

public val GENPROC_OP_GENERIC: UInt = 0u

public val GENPROC_OP_INSTRUCTIONEXE: UInt = 3u

public val GENPROC_PROCERRTYPE_BUS: UInt = 4u

public val GENPROC_PROCERRTYPE_CACHE: UInt = 1u

public val GENPROC_PROCERRTYPE_MAE: UInt = 8u

public val GENPROC_PROCERRTYPE_TLB: UInt = 2u

public val GENPROC_PROCERRTYPE_UNKNOWN: UInt = 0u

public val GENPROC_PROCISA_ARM32: UInt = 4u

public val GENPROC_PROCISA_ARM64: UInt = 8u

public val GENPROC_PROCISA_IPF: UInt = 1u

public val GENPROC_PROCISA_X64: UInt = 2u

public val GENPROC_PROCISA_X86: UInt = 0u

public val GENPROC_PROCTYPE_ARM: UInt = 2u

public val GENPROC_PROCTYPE_IPF: UInt = 1u

public val GENPROC_PROCTYPE_XPF: UInt = 0u

public val GART_HIGH: ExtendedAgpRegister = 5

public val GART_LOW: ExtendedAgpRegister = 4

public val GENERIC_EQUAL: RtlGenericCompareResults = 2

public val GENERIC_GREATER_THAN: RtlGenericCompareResults = 1

public val GENERIC_LESS_THAN: RtlGenericCompareResults = 0

public val GLOBAL_LOGGER_HANDLE_CLASS: TraceInformationClass = 4

public val GROUP_AFFINITY_ALL_GROUP_ZERO: IrqGroupPolicy = 0

public val GROUP_AFFINITY_DONT_CARE: IrqGroupPolicy = 1

public val HAL_DISPATCH_VERSION: UInt = 5u

public val HAL_DMA_ADAPTER_VERSION_1: UInt = 1u

public val HAL_MASK_UNMASK_FLAGS_NONE: UInt = 0u

public val HAL_MASK_UNMASK_FLAGS_SERVICING_COMPLETE: UInt = 2u

public val HAL_MASK_UNMASK_FLAGS_SERVICING_DEFERRED: UInt = 1u

public val HAL_MCA_RECORD: McaExceptionType = 1

public val HAL_MCE_RECORD: McaExceptionType = 0

public val HAL_PLATFORM_ACPI_TABLES_CACHED: Int = 32

public val HAL_PLATFORM_DISABLE_PTCG: Int = 4

public val HAL_PLATFORM_DISABLE_UC_MAIN_MEMORY: Int = 8

public val HAL_PLATFORM_DISABLE_WRITE_COMBINING: Int = 1

public val HAL_PLATFORM_ENABLE_WRITE_COMBINING_MMIO: Int = 16

public val HASH_STRING_ALGORITHM_DEFAULT: UInt = 0u

public val HASH_STRING_ALGORITHM_INVALID: UInt = 4294967295u

public val HASH_STRING_ALGORITHM_X65599: UInt = 1u

public val HIGH_LEVEL: UInt = 31u

public val HIGH_PRIORITY: UInt = 31u

public val HAL_ACPI_AUDIT_INFORMATION: HalQueryInformationClass = 26

public val HAL_CALLBACK_INFORMATION: HalQueryInformationClass = 5

public val HAL_CHANNEL_TOPOLOGY_INFORMATION: HalQueryInformationClass = 31

public val HAL_CMC_LOG: HalSetInformationClass = 7

public val HAL_CMC_LOG_INFORMATION: HalQueryInformationClass = 13

public val HAL_CMC_REGISTER_DRIVER: HalSetInformationClass = 4

public val HAL_CPE_LOG: HalSetInformationClass = 8

public val HAL_CPE_LOG_INFORMATION: HalQueryInformationClass = 14

public val HAL_CPE_REGISTER_DRIVER: HalSetInformationClass = 5

public val HAL_DISPLAY_BIOS_INFORMATION: HalQueryInformationClass = 9

public val HAL_DISPLAY_EMULATED_BIOS: HalDisplayBiosInformation = 1

public val HAL_DISPLAY_INT10BIOS: HalDisplayBiosInformation = 0

public val HAL_DISPLAY_NO_BIOS: HalDisplayBiosInformation = 2

public val HAL_DMA_CRASH_DUMP_REGISTER_SET1: HalDmaCrashDumpRegisterType = 0

public val HAL_DMA_CRASH_DUMP_REGISTER_SET2: HalDmaCrashDumpRegisterType = 1

public val HAL_DMA_CRASH_DUMP_REGISTER_SET_MAX: HalDmaCrashDumpRegisterType = 2

public val HAL_DMA_REMAPPING_INFORMATION: HalQueryInformationClass = 47

public val HAL_ENLIGHTENMENT: HalSetInformationClass = 11

public val HAL_ERROR_INFORMATION: HalQueryInformationClass = 12

public val HAL_EXTERNAL_CACHE_INFORMATION: HalQueryInformationClass = 32

public val HAL_FRAME_BUFFER_CACHING_INFORMATION: HalQueryInformationClass = 8

public val HAL_FREQUENCY_INFORMATION: HalQueryInformationClass = 22

public val HAL_FW_BOOT_PERFORMANCE_INFORMATION: HalQueryInformationClass = 34

public val HAL_FW_S3PERFORMANCE_INFORMATION: HalQueryInformationClass = 35

public val HAL_GENERATE_CMC_INTERRUPT: HalSetInformationClass = 9

public val HAL_GET_CHANNEL_POWER_INFORMATION: HalQueryInformationClass = 36

public val HAL_HARDWARE_WATCHDOG_INFORMATION: HalQueryInformationClass = 46

public val HAL_HETEROGENEOUS_MEMORY_ATTRIBUTES_INTERFACE: HalQueryInformationClass = 49

public val HAL_HYPERVISOR_INFORMATION: HalQueryInformationClass = 24

public val HAL_I386EXCEPTION_CHAIN_TERMINATOR_INFORMATION: HalSetInformationClass = 15

public val HAL_INFORMATION_CLASS_UNUSED1: HalQueryInformationClass = 2

public val HAL_INIT_LOG_INFORMATION: HalQueryInformationClass = 21

public val HAL_INSTALLED_BUS_INFORMATION: HalQueryInformationClass = 0

public val HAL_INTERRUPT_CONTROLLER_INFORMATION: HalQueryInformationClass = 39

public val HAL_IRT_INFORMATION: HalQueryInformationClass = 27

public val HAL_KERNEL_ERROR_HANDLER: HalSetInformationClass = 3

public val HAL_MAP_REGISTER_INFORMATION: HalQueryInformationClass = 6

public val HAL_MCA_LOG: HalSetInformationClass = 6

public val HAL_MCA_LOG_INFORMATION: HalQueryInformationClass = 7

public val HAL_MCA_REGISTER_DRIVER: HalSetInformationClass = 2

public val HAL_NUMA_RANGE_TABLE_INFORMATION: HalQueryInformationClass = 30

public val HAL_NUMA_TOPOLOGY_INTERFACE: HalQueryInformationClass = 11

public val HAL_PARKING_PAGE_INFORMATION: HalQueryInformationClass = 29

public val HAL_PARTITION_IPI_INTERFACE: HalQueryInformationClass = 18

public val HAL_PLATFORM_INFORMATION: HalQueryInformationClass = 19

public val HAL_PLATFORM_TIMER_INFORMATION: HalQueryInformationClass = 25

public val HAL_POWER_INFORMATION: HalQueryInformationClass = 3

public val HAL_PROCESSOR_BRAND_STRING: HalQueryInformationClass = 23

public val HAL_PROCESSOR_FEATURE_INFORMATION: HalQueryInformationClass = 10

public val HAL_PROCESSOR_SPEED_INFORMATION: HalQueryInformationClass = 4

public val HAL_PROFILE_DPGO_SOURCE_INTERRUPT_HANDLER: HalSetInformationClass = 12

public val HAL_PROFILE_SOURCE_ADD: HalSetInformationClass = 20

public val HAL_PROFILE_SOURCE_INFORMATION: HalQueryInformationClass = 1

public val HAL_PROFILE_SOURCE_INTERRUPT_HANDLER: HalSetInformationClass = 1

public val HAL_PROFILE_SOURCE_INTERVAL: HalSetInformationClass = 0

public val HAL_PROFILE_SOURCE_REMOVE: HalSetInformationClass = 21

public val HAL_PROFILE_SOURCE_TIMER_HANDLER: HalSetInformationClass = 10

public val HAL_PSCI_INFORMATION: HalQueryInformationClass = 38

public val HAL_QUERY_AMLI_ILLEGAL_IO_PORT_ADDRESSES: HalQueryInformationClass = 16

public val HAL_QUERY_ACPI_WAKE_ALARM_SYSTEM_POWER_STATE_INFORMATION: HalQueryInformationClass = 43

public val HAL_QUERY_ARM_ERRATA_INFORMATION: HalQueryInformationClass = 41

public val HAL_QUERY_DEBUGGER_INFORMATION: HalQueryInformationClass = 33

public val HAL_QUERY_HYPERLAUNCH_ENTRYPOINT: HalQueryInformationClass = 45

public val HAL_QUERY_IOMMU_RESERVED_REGION_INFORMATION: HalQueryInformationClass = 40

public val HAL_QUERY_MAX_HOT_PLUG_MEMORY_ADDRESS: HalQueryInformationClass = 17

public val HAL_QUERY_MCA_INTERFACE: HalQueryInformationClass = 15

public val HAL_QUERY_PER_DEVICE_MSI_LIMIT_INFORMATION: HalQueryInformationClass = 50

public val HAL_QUERY_PROCESSOR_EFFICIENCY_INFORMATION: HalQueryInformationClass = 42

public val HAL_QUERY_PROFILE_CORRUPTION_STATUS: HalQueryInformationClass = 51

public val HAL_QUERY_PROFILE_COUNTER_OWNERSHIP: HalQueryInformationClass = 52

public val HAL_QUERY_PROFILE_NUMBER_OF_COUNTERS: HalQueryInformationClass = 44

public val HAL_QUERY_PROFILE_SOURCE_LIST: HalQueryInformationClass = 20

public val HAL_QUERY_STATE_ELEMENT_INFORMATION: HalQueryInformationClass = 37

public val HAL_QUERY_UNUSED0001: HalQueryInformationClass = 48

public val HAL_REGISTER_SECONDARY_INTERRUPT_INTERFACE: HalSetInformationClass = 13

public val HAL_SECONDARY_INTERRUPT_INFORMATION: HalQueryInformationClass = 28

public val HAL_SET_CHANNEL_POWER_INFORMATION: HalSetInformationClass = 14

public val HAL_SET_CLOCK_TIMER_MINIMUM_INTERVAL: HalSetInformationClass = 23

public val HAL_SET_HVCI_ENABLED: HalSetInformationClass = 18

public val HAL_SET_PROCESSOR_TRACE_INTERRUPT_HANDLER: HalSetInformationClass = 19

public val HAL_SET_PSCI_SUSPEND_MODE: HalSetInformationClass = 17

public val HAL_SET_RESET_PARK_DISPOSITION: HalSetInformationClass = 16

public val HAL_SET_SW_INTERRUPT_HANDLER: HalSetInformationClass = 22

public val HIGH_IMPORTANCE: KdpcImportance = 2

public val HIGH_PAGE_PRIORITY: MmPagePriority = 32

public val HIGH_POOL_PRIORITY: ExPoolPriority = 32

public val HIGH_POOL_PRIORITY_SPECIAL_POOL_OVERRUN: ExPoolPriority = 40

public val HIGH_POOL_PRIORITY_SPECIAL_POOL_UNDERRUN: ExPoolPriority = 41

public val HOT_SPARE_CONTROL: NpemControlStandardControlBit = 7

public val HYPER_CRITICAL_WORK_QUEUE: WorkQueueType = 2

public val IMAGE_ADDRESSING_MODE_32BIT: UInt = 3u

public val INITIAL_PRIVILEGE_COUNT: UInt = 3u

public val INJECT_ERRTYPE_MEMORY_CORRECTABLE: UInt = 8u

public val INJECT_ERRTYPE_MEMORY_UNCORRECTABLEFATAL: UInt = 32u

public val INJECT_ERRTYPE_MEMORY_UNCORRECTABLENONFATAL: UInt = 16u

public val INJECT_ERRTYPE_PCIEXPRESS_CORRECTABLE: UInt = 64u

public val INJECT_ERRTYPE_PCIEXPRESS_UNCORRECTABLEFATAL: UInt = 256u

public val INJECT_ERRTYPE_PCIEXPRESS_UNCORRECTABLENONFATAL: UInt = 128u

public val INJECT_ERRTYPE_PLATFORM_CORRECTABLE: UInt = 512u

public val INJECT_ERRTYPE_PLATFORM_UNCORRECTABLEFATAL: UInt = 2048u

public val INJECT_ERRTYPE_PLATFORM_UNCORRECTABLENONFATAL: UInt = 1024u

public val INJECT_ERRTYPE_PROCESSOR_CORRECTABLE: UInt = 1u

public val INJECT_ERRTYPE_PROCESSOR_UNCORRECTABLEFATAL: UInt = 4u

public val INJECT_ERRTYPE_PROCESSOR_UNCORRECTABLENONFATAL: UInt = 2u

public val IOCTL_CANCEL_DEVICE_WAKE: UInt = 2719752u

public val IOCTL_QUERY_DEVICE_POWER_STATE: UInt = 2703360u

public val IOCTL_SET_DEVICE_WAKE: UInt = 2719748u

public val IOMMU_ACCESS_NONE: UInt = 0u

public val IOMMU_ACCESS_READ: UInt = 1u

public val IOMMU_ACCESS_WRITE: UInt = 2u

public val IO_ATTACH_DEVICE: UInt = 1024u

public val IO_ATTRIBUTION_INFO_V1: UInt = 1u

public val IO_CHECK_CREATE_PARAMETERS: UInt = 512u

public val IO_CHECK_SHARE_ACCESS_DONT_CHECK_DELETE: UInt = 16u

public val IO_CHECK_SHARE_ACCESS_DONT_CHECK_READ: UInt = 4u

public val IO_CHECK_SHARE_ACCESS_DONT_CHECK_WRITE: UInt = 8u

public val IO_CHECK_SHARE_ACCESS_DONT_UPDATE_FILE_OBJECT: UInt = 2u

public val IO_CHECK_SHARE_ACCESS_FORCE_CHECK: UInt = 32u

public val IO_CHECK_SHARE_ACCESS_FORCE_USING_SCB: UInt = 64u

public val IO_CHECK_SHARE_ACCESS_UPDATE_SHARE_ACCESS: UInt = 1u

public val IO_FORCE_ACCESS_CHECK: UInt = 1u

public val IO_IGNORE_SHARE_ACCESS_CHECK: UInt = 2048u

public val IO_KEYBOARD_INCREMENT: UInt = 6u

public val IO_MOUSE_INCREMENT: UInt = 6u

public val IO_NO_PARAMETER_CHECKING: UInt = 256u

public val IO_PARALLEL_INCREMENT: UInt = 1u

public val IO_REMOUNT: UInt = 1u

public val IO_REPARSE: UInt = 0u

public val IO_REPARSE_GLOBAL: UInt = 2u

public val IO_RESOURCE_ALTERNATIVE: UInt = 8u

public val IO_RESOURCE_DEFAULT: UInt = 2u

public val IO_RESOURCE_PREFERRED: UInt = 1u

public val IO_SERIAL_INCREMENT: UInt = 2u

public val IO_SESSION_MAX_PAYLOAD_SIZE: Int = 256

public val IO_SESSION_STATE_ALL_EVENTS: UInt = 4294967295u

public val IO_SESSION_STATE_CONNECT_EVENT: UInt = 4u

public val IO_SESSION_STATE_CREATION_EVENT: UInt = 1u

public val IO_SESSION_STATE_DISCONNECT_EVENT: UInt = 8u

public val IO_SESSION_STATE_LOGOFF_EVENT: UInt = 32u

public val IO_SESSION_STATE_LOGON_EVENT: UInt = 16u

public val IO_SESSION_STATE_TERMINATION_EVENT: UInt = 2u

public val IO_SESSION_STATE_VALID_EVENT_MASK: UInt = 63u

public val IO_SET_IRP_IO_ATTRIBUTION_FLAGS_MASK: UInt = 3u

public val IO_SET_IRP_IO_ATTRIBUTION_FROM_PROCESS: UInt = 2u

public val IO_SET_IRP_IO_ATTRIBUTION_FROM_THREAD: UInt = 1u

public val IO_SHARE_ACCESS_NON_PRIMARY_STREAM: UInt = 128u

public val IO_SHARE_ACCESS_NO_WRITE_PERMISSION: UInt = 2147483648u

public val IO_SOUND_INCREMENT: UInt = 8u

public val IO_TYPE_ADAPTER: UInt = 1u

public val IO_TYPE_CONTROLLER: UInt = 2u

public val IO_TYPE_CSQ: UInt = 2u

public val IO_TYPE_CSQ_EX: UInt = 3u

public val IO_TYPE_CSQ_IRP_CONTEXT: UInt = 1u

public val IO_TYPE_DEVICE: UInt = 3u

public val IO_TYPE_DEVICE_OBJECT_EXTENSION: UInt = 13u

public val IO_TYPE_DRIVER: UInt = 4u

public val IO_TYPE_ERROR_LOG: UInt = 11u

public val IO_TYPE_ERROR_MESSAGE: UInt = 12u

public val IO_TYPE_FILE: UInt = 5u

public val IO_TYPE_IORING: UInt = 14u

public val IO_TYPE_IRP: UInt = 6u

public val IO_TYPE_MASTER_ADAPTER: UInt = 7u

public val IO_TYPE_OPEN_PACKET: UInt = 8u

public val IO_TYPE_TIMER: UInt = 9u

public val IO_TYPE_VPB: UInt = 10u

public val IO_VIDEO_INCREMENT: UInt = 1u

public val IPI_LEVEL: UInt = 29u

public val IRP_ALLOCATED_FIXED_SIZE: UInt = 4u

public val IRP_ALLOCATED_MUST_SUCCEED: UInt = 2u

public val IRP_ASSOCIATED_IRP: UInt = 8u

public val IRP_BUFFERED_IO: UInt = 16u

public val IRP_CLOSE_OPERATION: UInt = 1024u

public val IRP_CREATE_OPERATION: UInt = 128u

public val IRP_DEALLOCATE_BUFFER: UInt = 32u

public val IRP_DEFER_IO_COMPLETION: UInt = 2048u

public val IRP_HOLD_DEVICE_QUEUE: UInt = 8192u

public val IRP_INPUT_OPERATION: UInt = 64u

public val IRP_LOOKASIDE_ALLOCATION: UInt = 8u

public val IRP_MJ_CLEANUP: UInt = 18u

public val IRP_MJ_CLOSE: UInt = 2u

public val IRP_MJ_CREATE: UInt = 0u

public val IRP_MJ_CREATE_MAILSLOT: UInt = 19u

public val IRP_MJ_CREATE_NAMED_PIPE: UInt = 1u

public val IRP_MJ_DEVICE_CHANGE: UInt = 24u

public val IRP_MJ_DEVICE_CONTROL: UInt = 14u

public val IRP_MJ_DIRECTORY_CONTROL: UInt = 12u

public val IRP_MJ_FILE_SYSTEM_CONTROL: UInt = 13u

public val IRP_MJ_FLUSH_BUFFERS: UInt = 9u

public val IRP_MJ_INTERNAL_DEVICE_CONTROL: UInt = 15u

public val IRP_MJ_LOCK_CONTROL: UInt = 17u

public val IRP_MJ_MAXIMUM_FUNCTION: UInt = 27u

public val IRP_MJ_PNP: UInt = 27u

public val IRP_MJ_PNP_POWER: UInt = 27u

public val IRP_MJ_POWER: UInt = 22u

public val IRP_MJ_QUERY_EA: UInt = 7u

public val IRP_MJ_QUERY_INFORMATION: UInt = 5u

public val IRP_MJ_QUERY_QUOTA: UInt = 25u

public val IRP_MJ_QUERY_SECURITY: UInt = 20u

public val IRP_MJ_QUERY_VOLUME_INFORMATION: UInt = 10u

public val IRP_MJ_READ: UInt = 3u

public val IRP_MJ_SCSI: UInt = 15u

public val IRP_MJ_SET_EA: UInt = 8u

public val IRP_MJ_SET_INFORMATION: UInt = 6u

public val IRP_MJ_SET_QUOTA: UInt = 26u

public val IRP_MJ_SET_SECURITY: UInt = 21u

public val IRP_MJ_SET_VOLUME_INFORMATION: UInt = 11u

public val IRP_MJ_SHUTDOWN: UInt = 16u

public val IRP_MJ_SYSTEM_CONTROL: UInt = 23u

public val IRP_MJ_WRITE: UInt = 4u

public val IRP_MN_CANCEL_REMOVE_DEVICE: UInt = 3u

public val IRP_MN_CANCEL_STOP_DEVICE: UInt = 6u

public val IRP_MN_CHANGE_SINGLE_INSTANCE: UInt = 2u

public val IRP_MN_CHANGE_SINGLE_ITEM: UInt = 3u

public val IRP_MN_COMPLETE: UInt = 4u

public val IRP_MN_COMPRESSED: UInt = 8u

public val IRP_MN_DEVICE_ENUMERATED: UInt = 25u

public val IRP_MN_DEVICE_USAGE_NOTIFICATION: UInt = 22u

public val IRP_MN_DISABLE_COLLECTION: UInt = 7u

public val IRP_MN_DISABLE_EVENTS: UInt = 5u

public val IRP_MN_DPC: UInt = 1u

public val IRP_MN_EJECT: UInt = 17u

public val IRP_MN_ENABLE_COLLECTION: UInt = 6u

public val IRP_MN_ENABLE_EVENTS: UInt = 4u

public val IRP_MN_EXECUTE_METHOD: UInt = 9u

public val IRP_MN_FILTER_RESOURCE_REQUIREMENTS: UInt = 13u

public val IRP_MN_FLUSH_AND_PURGE: UInt = 1u

public val IRP_MN_FLUSH_DATA_ONLY: UInt = 2u

public val IRP_MN_FLUSH_DATA_SYNC_ONLY: UInt = 4u

public val IRP_MN_FLUSH_NO_SYNC: UInt = 3u

public val IRP_MN_KERNEL_CALL: UInt = 4u

public val IRP_MN_LOAD_FILE_SYSTEM: UInt = 3u

public val IRP_MN_LOCK: UInt = 1u

public val IRP_MN_MDL: UInt = 2u

public val IRP_MN_MOUNT_VOLUME: UInt = 1u

public val IRP_MN_NORMAL: UInt = 0u

public val IRP_MN_NOTIFY_CHANGE_DIRECTORY: UInt = 2u

public val IRP_MN_NOTIFY_CHANGE_DIRECTORY_EX: UInt = 3u

public val IRP_MN_POWER_SEQUENCE: UInt = 1u

public val IRP_MN_QUERY_ALL_DATA: UInt = 0u

public val IRP_MN_QUERY_BUS_INFORMATION: UInt = 21u

public val IRP_MN_QUERY_CAPABILITIES: UInt = 9u

public val IRP_MN_QUERY_DEVICE_RELATIONS: UInt = 7u

public val IRP_MN_QUERY_DEVICE_TEXT: UInt = 12u

public val IRP_MN_QUERY_DIRECTORY: UInt = 1u

public val IRP_MN_QUERY_ID: UInt = 19u

public val IRP_MN_QUERY_INTERFACE: UInt = 8u

public val IRP_MN_QUERY_LEGACY_BUS_INFORMATION: UInt = 24u

public val IRP_MN_QUERY_PNP_DEVICE_STATE: UInt = 20u

public val IRP_MN_QUERY_POWER: UInt = 3u

public val IRP_MN_QUERY_REMOVE_DEVICE: UInt = 1u

public val IRP_MN_QUERY_RESOURCES: UInt = 10u

public val IRP_MN_QUERY_RESOURCE_REQUIREMENTS: UInt = 11u

public val IRP_MN_QUERY_SINGLE_INSTANCE: UInt = 1u

public val IRP_MN_QUERY_STOP_DEVICE: UInt = 5u

public val IRP_MN_READ_CONFIG: UInt = 15u

public val IRP_MN_REGINFO: UInt = 8u

public val IRP_MN_REGINFO_EX: UInt = 11u

public val IRP_MN_REMOVE_DEVICE: UInt = 2u

public val IRP_MN_SCSI_CLASS: UInt = 1u

public val IRP_MN_SET_LOCK: UInt = 18u

public val IRP_MN_SET_POWER: UInt = 2u

public val IRP_MN_START_DEVICE: UInt = 0u

public val IRP_MN_STOP_DEVICE: UInt = 4u

public val IRP_MN_SURPRISE_REMOVAL: UInt = 23u

public val IRP_MN_TRACK_LINK: UInt = 4u

public val IRP_MN_UNLOCK_ALL: UInt = 3u

public val IRP_MN_UNLOCK_ALL_BY_KEY: UInt = 4u

public val IRP_MN_UNLOCK_SINGLE: UInt = 2u

public val IRP_MN_USER_FS_REQUEST: UInt = 0u

public val IRP_MN_VERIFY_VOLUME: UInt = 2u

public val IRP_MN_WAIT_WAKE: UInt = 0u

public val IRP_MN_WRITE_CONFIG: UInt = 16u

public val IRP_MOUNT_COMPLETION: UInt = 2u

public val IRP_NOCACHE: UInt = 1u

public val IRP_OB_QUERY_NAME: UInt = 4096u

public val IRP_PAGING_IO: UInt = 2u

public val IRP_QUOTA_CHARGED: UInt = 1u

public val IRP_READ_OPERATION: UInt = 256u

public val IRP_SYNCHRONOUS_API: UInt = 4u

public val IRP_SYNCHRONOUS_PAGING_IO: UInt = 64u

public val IRP_UM_DRIVER_INITIATED_IO: UInt = 4194304u

public val IRP_WRITE_OPERATION: UInt = 512u

public val IN_A_CRITICAL_ARRAY_CONTROL: NpemControlStandardControlBit = 8

public val IN_A_FAILED_ARRAY_CONTROL: NpemControlStandardControlBit = 9

public val INDICATOR_BLINK: PciExpressIndicatorState = 2

public val INDICATOR_OFF: PciExpressIndicatorState = 3

public val INDICATOR_ON: PciExpressIndicatorState = 1

public val INITIATE_RESET: NpemControlStandardControlBit = 1

public val INSTALL_STATE_FAILED_INSTALL: DeviceInstallState = 2

public val INSTALL_STATE_FINISH_INSTALL: DeviceInstallState = 3

public val INSTALL_STATE_INSTALLED: DeviceInstallState = 0

public val INSTALL_STATE_NEEDS_REINSTALL: DeviceInstallState = 1

public val INTEL_CACHE_DATA: IntelCacheType = 1

public val INTEL_CACHE_INSTRUCTION: IntelCacheType = 2

public val INTEL_CACHE_NULL: IntelCacheType = 0

public val INTEL_CACHE_RAM: IntelCacheType = 4

public val INTEL_CACHE_TRACE: IntelCacheType = 5

public val INTEL_CACHE_UNIFIED: IntelCacheType = 3

public val INTERFACE_TYPE_UNDEFINED: InterfaceType = -1

public val INTERNAL: InterfaceType = 0

public val INTERNAL_POWER_BUS: InterfaceType = 13

public val INTERRUPT_ACTIVE_BOTH: KinterruptPolarity = 3

public val INTERRUPT_ACTIVE_BOTH_TRIGGER_HIGH: KinterruptPolarity = 4

public val INTERRUPT_ACTIVE_BOTH_TRIGGER_LOW: KinterruptPolarity = 3

public val INTERRUPT_ACTIVE_HIGH: KinterruptPolarity = 1

public val INTERRUPT_ACTIVE_LOW: KinterruptPolarity = 2

public val INTERRUPT_FALLING_EDGE: KinterruptPolarity = 2

public val INTERRUPT_POLARITY_UNKNOWN: KinterruptPolarity = 0

public val INTERRUPT_RISING_EDGE: KinterruptPolarity = 1

public val INVALID_DEVICE_TYPE_CONTROL: NpemControlStandardControlBit = 10

public val IO_MAX_CONTAINER_INFORMATION_CLASS: IoContainerInformationClass = 1

public val IO_MAX_CONTAINER_NOTIFICATION_CLASS: IoContainerNotificationClass = 1

public val IO_MODIFY_ACCESS: LockOperation = 2

public val IO_PAGING_PRIORITY_HIGH: IoPagingPriority = 2

public val IO_PAGING_PRIORITY_INVALID: IoPagingPriority = 0

public val IO_PAGING_PRIORITY_NORMAL: IoPagingPriority = 1

public val IO_PAGING_PRIORITY_RESERVED1: IoPagingPriority = 3

public val IO_PAGING_PRIORITY_RESERVED2: IoPagingPriority = 4

public val IO_QUERY_DEVICE_COMPONENT_INFORMATION: IoQueryDeviceDataFormat = 2

public val IO_QUERY_DEVICE_CONFIGURATION_DATA: IoQueryDeviceDataFormat = 1

public val IO_QUERY_DEVICE_IDENTIFIER: IoQueryDeviceDataFormat = 0

public val IO_QUERY_DEVICE_MAX_DATA: IoQueryDeviceDataFormat = 3

public val IO_READ_ACCESS: LockOperation = 0

public val IO_SESSION_EVENT_CONNECTED: IoSessionEvent = 3

public val IO_SESSION_EVENT_CREATED: IoSessionEvent = 1

public val IO_SESSION_EVENT_DISCONNECTED: IoSessionEvent = 4

public val IO_SESSION_EVENT_IGNORE: IoSessionEvent = 0

public val IO_SESSION_EVENT_LOGOFF: IoSessionEvent = 6

public val IO_SESSION_EVENT_LOGON: IoSessionEvent = 5

public val IO_SESSION_EVENT_MAX: IoSessionEvent = 7

public val IO_SESSION_EVENT_TERMINATED: IoSessionEvent = 2

public val IO_SESSION_STATE_CONNECTED: IoSessionState = 3

public val IO_SESSION_STATE_CREATED: IoSessionState = 1

public val IO_SESSION_STATE_DISCONNECTED: IoSessionState = 4

public val IO_SESSION_STATE_DISCONNECTED_LOGGED_ON: IoSessionState = 5

public val IO_SESSION_STATE_INFORMATION: IoContainerInformationClass = 0

public val IO_SESSION_STATE_INITIALIZED: IoSessionState = 2

public val IO_SESSION_STATE_LOGGED_OFF: IoSessionState = 7

public val IO_SESSION_STATE_LOGGED_ON: IoSessionState = 6

public val IO_SESSION_STATE_MAX: IoSessionState = 9

public val IO_SESSION_STATE_NOTIFICATION: IoContainerNotificationClass = 0

public val IO_SESSION_STATE_TERMINATED: IoSessionState = 8

public val IO_WRITE_ACCESS: LockOperation = 1

public val IOMMU_DEVICE_CREATION_CONFIG_TYPE_ACPI: IommuDeviceCreationConfigurationType = 1

public val IOMMU_DEVICE_CREATION_CONFIG_TYPE_DEVICE_ID: IommuDeviceCreationConfigurationType = 2

public val IOMMU_DEVICE_CREATION_CONFIG_TYPE_MAX: IommuDeviceCreationConfigurationType = 3

public val IOMMU_DEVICE_CREATION_CONFIG_TYPE_NONE: IommuDeviceCreationConfigurationType = 0

public val IOMMU_DMA_LOGICAL_ALLOCATOR_BUDDY: IommuDmaLogicalAllocatorType = 1

public val IOMMU_DMA_LOGICAL_ALLOCATOR_MAX: IommuDmaLogicalAllocatorType = 2

public val IOMMU_DMA_LOGICAL_ALLOCATOR_NONE: IommuDmaLogicalAllocatorType = 0

public val IRQ_POLICY_ALL_CLOSE_PROCESSORS: IrqDevicePolicy = 1

public val IRQ_POLICY_ALL_PROCESSORS_IN_MACHINE: IrqDevicePolicy = 3

public val IRQ_POLICY_ALL_PROCESSORS_IN_MACHINE_WHEN_STEERED: IrqDevicePolicy = 6

public val IRQ_POLICY_MACHINE_DEFAULT: IrqDevicePolicy = 0

public val IRQ_POLICY_ONE_CLOSE_PROCESSOR: IrqDevicePolicy = 2

public val IRQ_POLICY_SPECIFIED_PROCESSORS: IrqDevicePolicy = 4

public val IRQ_POLICY_SPREAD_MESSAGES_ACROSS_ALL_PROCESSORS: IrqDevicePolicy = 5

public val IRQ_PRIORITY_HIGH: IrqPriority = 3

public val IRQ_PRIORITY_LOW: IrqPriority = 1

public val IRQ_PRIORITY_NORMAL: IrqPriority = 2

public val IRQ_PRIORITY_UNDEFINED: IrqPriority = 0

public val ISA: InterfaceType = 1

public val ISOCH_COMMAND: ExtendedAgpRegister = 6

public val ISOCH_STATUS: ExtendedAgpRegister = 0

public val KADDRESS_BASE: UInt = 0u

public val KB_ADD_PAGES_FLAG_ADDITIONAL_RANGES_EXIST: UInt = 2147483648u

public val KB_ADD_PAGES_FLAG_PHYSICAL_ADDRESS: UInt = 2u

public val KB_ADD_PAGES_FLAG_VIRTUAL_ADDRESS: UInt = 1u

public val KB_REMOVE_PAGES_FLAG_ADDITIONAL_RANGES_EXIST: UInt = 2147483648u

public val KB_REMOVE_PAGES_FLAG_PHYSICAL_ADDRESS: UInt = 2u

public val KB_REMOVE_PAGES_FLAG_VIRTUAL_ADDRESS: UInt = 1u

public val KB_SECONDARY_DATA_FLAG_ADDITIONAL_DATA: UInt = 1u

public val KB_SECONDARY_DATA_FLAG_NO_DEVICE_ACCESS: UInt = 2u

public val KB_TRIAGE_DUMP_DATA_FLAG_BUGCHECK_ACTIVE: UInt = 1u

public val KD_OPTION_SET_BLOCK_ENABLE: KdOption = 0

public val KENCODED_TIMER_PROCESSOR: UInt = 1u

public val KERNEL_LARGE_STACK_COMMIT: UInt = 12288u

public val KERNEL_LARGE_STACK_SIZE: UInt = 61440u

public val KERNEL_MCA_EXCEPTION_STACK_SIZE: UInt = 8192u

public val KERNEL_SOFT_RESTART_NOTIFICATION_VERSION: UInt = 1u

public val KERNEL_STACK_SIZE: UInt = 12288u

public val KE_MAX_TRIAGE_DUMP_DATA_MEMORY_SIZE: UInt = 33554432u

public val KE_PROCESSOR_CHANGE_ADD_EXISTING: UInt = 1u

public val KI_USER_SHARED_DATA: UInt = 4292804608u

public val KUMS_UCH_VOLATILE_BIT: UInt = 0u

public val KB_CALLBACK_ADD_PAGES: KbugcheckCallbackReason = 4

public val KB_CALLBACK_DUMP_IO: KbugcheckCallbackReason = 3

public val KB_CALLBACK_INVALID: KbugcheckCallbackReason = 0

public val KB_CALLBACK_REMOVE_PAGES: KbugcheckCallbackReason = 6

public val KB_CALLBACK_RESERVED1: KbugcheckCallbackReason = 1

public val KB_CALLBACK_RESERVED2: KbugcheckCallbackReason = 8

public val KB_CALLBACK_SECONDARY_DUMP_DATA: KbugcheckCallbackReason = 2

public val KB_CALLBACK_SECONDARY_MULTI_PART_DUMP_DATA: KbugcheckCallbackReason = 5

public val KB_CALLBACK_TRIAGE_DUMP_DATA: KbugcheckCallbackReason = 7

public val KB_DUMP_IO_BODY: KbugcheckDumpIoType = 2

public val KB_DUMP_IO_COMPLETE: KbugcheckDumpIoType = 4

public val KB_DUMP_IO_HEADER: KbugcheckDumpIoType = 1

public val KB_DUMP_IO_INVALID: KbugcheckDumpIoType = 0

public val KB_DUMP_IO_SECONDARY_DATA: KbugcheckDumpIoType = 3

public val KD_CONFIGURE_DEVICE_AND_CONTINUE: KdCallbackAction = 0

public val KD_CONFIGURE_DEVICE_AND_STOP: KdCallbackAction = 2

public val KD_NAME_SPACE_ACPI: KdNamespaceEnum = 1

public val KD_NAME_SPACE_ANY: KdNamespaceEnum = 2

public val KD_NAME_SPACE_MAX: KdNamespaceEnum = 4

public val KD_NAME_SPACE_NONE: KdNamespaceEnum = 3

public val KD_NAME_SPACE_PCI: KdNamespaceEnum = 0

public val KD_SKIP_DEVICE_AND_CONTINUE: KdCallbackAction = 1

public val KD_SKIP_DEVICE_AND_STOP: KdCallbackAction = 3

public val KE_PROCESSOR_ADD_COMPLETE_NOTIFY: KeProcessorChangeNotifyState = 1

public val KE_PROCESSOR_ADD_FAILURE_NOTIFY: KeProcessorChangeNotifyState = 2

public val KE_PROCESSOR_ADD_START_NOTIFY: KeProcessorChangeNotifyState = 0

public val KEEP_OBJECT: IoAllocationAction = 1

public val KERNEL_MODE: Mode = 0

public val KEYBOARD_CONTROLLER: ConfigurationType = 22

public val KEYBOARD_PERIPHERAL: ConfigurationType = 32

public val L0S_AND_L1ENTRY_DISABLED: PciExpressAspmControl = 0

public val L0S_AND_L1ENTRY_ENABLED: PciExpressAspmControl = 3

public val L0S_AND_L1ENTRY_SUPPORT: PciExpressAspmSupport = 3

public val L0S_ENTRY_ENABLED: PciExpressAspmControl = 1

public val L0S_ENTRY_SUPPORT: PciExpressAspmSupport = 1

public val L0S_128NS_256NS: PciExpressL0sExitLatency = 2

public val L0S_1US_2US: PciExpressL0sExitLatency = 5

public val L0S_256NS_512NS: PciExpressL0sExitLatency = 3

public val L0S_2US_4US: PciExpressL0sExitLatency = 6

public val L0S_512NS_1US: PciExpressL0sExitLatency = 4

public val L0S_64NS_128NS: PciExpressL0sExitLatency = 1

public val L0S_ABOVE4US: PciExpressL0sExitLatency = 7

public val L0S_BELOW64NS: PciExpressL0sExitLatency = 0

public val L1ENTRY_ENABLED: PciExpressAspmControl = 2

public val L1ENTRY_SUPPORT: PciExpressAspmSupport = 2

public val L1_16US_32US: PciExpressL1ExitLatency = 5

public val L1_1US_2US: PciExpressL1ExitLatency = 1

public val L1_2US_4US: PciExpressL1ExitLatency = 2

public val L1_32US_64US: PciExpressL1ExitLatency = 6

public val L1_4US_8US: PciExpressL1ExitLatency = 3

public val L1_8US_16US: PciExpressL1ExitLatency = 4

public val L1_ABOVE64US: PciExpressL1ExitLatency = 7

public val L1_BELOW1US: PciExpressL1ExitLatency = 0

public val LOCK_QUEUE_HALTED: UInt = 4u

public val LOCK_QUEUE_HALTED_BIT: UInt = 2u

public val LOCK_QUEUE_OWNER: UInt = 2u

public val LOCK_QUEUE_OWNER_BIT: UInt = 1u

public val LOCK_QUEUE_WAIT: UInt = 1u

public val LOCK_QUEUE_WAIT_BIT: UInt = 0u

public val LONG_2ND_MOST_SIGNIFICANT_BIT: UInt = 2u

public val LONG_3RD_MOST_SIGNIFICANT_BIT: UInt = 1u

public val LONG_LEAST_SIGNIFICANT_BIT: UInt = 0u

public val LONG_MOST_SIGNIFICANT_BIT: UInt = 3u

public val LOWBYTE_MASK: UInt = 255u

public val LOW_LEVEL: UInt = 0u

public val LOW_PRIORITY: UInt = 0u

public val LOW_REALTIME_PRIORITY: UInt = 16u

public val LAST_D_STATE_TRANSITION_D3COLD: D3coldLastTransitionStatus = 2

public val LAST_D_STATE_TRANSITION_D3HOT: D3coldLastTransitionStatus = 1

public val LAST_D_STATE_TRANSITION_STATUS_UNKNOWN: D3coldLastTransitionStatus = 0

public val LAST_DRV_RT_FLAG: DriverRuntimeInitFlags = 2

public val LATCHED: KinterruptMode = 1

public val LEVEL_SENSITIVE: KinterruptMode = 0

public val LINE_PERIPHERAL: ConfigurationType = 35

public val LOCATE_CONTROL: NpemControlStandardControlBit = 3

public val LOCATION_TYPE_FILE_SYSTEM: StateLocationType = 1

public val LOCATION_TYPE_MAXIMUM: StateLocationType = 2

public val LOCATION_TYPE_REGISTRY: StateLocationType = 0

public val LOGGER_EVENTS_LOGGED_CLASS: TraceInformationClass = 10

public val LOGGER_EVENTS_LOST_CLASS: TraceInformationClass = 8

public val LOW_IMPORTANCE: KdpcImportance = 0

public val LOW_PAGE_PRIORITY: MmPagePriority = 0

public val LOW_POOL_PRIORITY: ExPoolPriority = 0

public val LOW_POOL_PRIORITY_SPECIAL_POOL_OVERRUN: ExPoolPriority = 8

public val LOW_POOL_PRIORITY_SPECIAL_POOL_UNDERRUN: ExPoolPriority = 9

public val MAXIMUM_DEBUG_BARS: UInt = 6u

public val MAXIMUM_FILENAME_LENGTH: UInt = 256u

public val MAXIMUM_PRIORITY: UInt = 32u

public val MAX_EVENT_COUNTERS: UInt = 31u

public val MCA_EXTREG_V2MAX: UInt = 24u

public val MDL_ALLOCATED_FIXED_SIZE: UInt = 8u

public val MDL_DESCRIBES_AWE: UInt = 1024u

public val MDL_FREE_EXTRA_PTES: UInt = 512u

public val MDL_INTERNAL: UInt = 32768u

public val MDL_LOCKED_PAGE_TABLES: UInt = 256u

public val MDL_PAGE_CONTENTS_INVARIANT: UInt = 16384u

public val MEM_COMMIT: UInt = 4096u

public val MEM_DECOMMIT: UInt = 16384u

public val MEM_EXTENDED_PARAMETER_EC_CODE: UInt = 64u

public val MEM_EXTENDED_PARAMETER_TYPE_BITS: UInt = 8u

public val MEM_LARGE_PAGES: UInt = 536870912u

public val MEM_MAPPED: UInt = 262144u

public val MEM_PRIVATE: UInt = 131072u

public val MEM_RELEASE: UInt = 32768u

public val MEM_RESERVE: UInt = 8192u

public val MEM_RESET: UInt = 524288u

public val MEM_RESET_UNDO: UInt = 16777216u

public val MEM_TOP_DOWN: UInt = 1048576u

public val MM_ADD_PHYSICAL_MEMORY_ALREADY_ZEROED: UInt = 1u

public val MM_ADD_PHYSICAL_MEMORY_HUGE_PAGES_ONLY: UInt = 4u

public val MM_ADD_PHYSICAL_MEMORY_LARGE_PAGES_ONLY: UInt = 2u

public val MM_ALLOCATE_AND_HOT_REMOVE: UInt = 256u

public val MM_ALLOCATE_CONTIGUOUS_MEMORY_FAST_ONLY: UInt = 1u

public val MM_ALLOCATE_FAST_LARGE_PAGES: UInt = 64u

public val MM_ALLOCATE_FROM_LOCAL_NODE_ONLY: UInt = 2u

public val MM_ALLOCATE_FULLY_REQUIRED: UInt = 4u

public val MM_ALLOCATE_NO_WAIT: UInt = 8u

public val MM_ALLOCATE_PREFER_CONTIGUOUS: UInt = 16u

public val MM_ALLOCATE_REQUIRE_CONTIGUOUS_CHUNKS: UInt = 32u

public val MM_ALLOCATE_TRIM_IF_NECESSARY: UInt = 128u

public val MM_ANY_NODE_OK: UInt = 2147483648u

public val MM_COPY_MEMORY_PHYSICAL: UInt = 1u

public val MM_COPY_MEMORY_VIRTUAL: UInt = 2u

public val MM_DONT_ZERO_ALLOCATION: UInt = 1u

public val MM_DUMP_MAP_CACHED: UInt = 1u

public val MM_DUMP_MAP_INVALIDATE: UInt = 2u

public val MM_FREE_MDL_PAGES_ZERO: UInt = 1u

public val MM_GET_CACHE_ATTRIBUTE_IO_SPACE: UInt = 1u

public val MM_GET_PHYSICAL_MEMORY_RANGES_INCLUDE_ALL_PARTITIONS: UInt = 2u

public val MM_GET_PHYSICAL_MEMORY_RANGES_INCLUDE_FILE_ONLY: UInt = 1u

public val MM_MAPPING_ADDRESS_DIVISIBLE: UInt = 1u

public val MM_MAXIMUM_DISK_IO_SIZE: UInt = 65536u

public val MM_PERMANENT_ADDRESS_IS_IO_SPACE: UInt = 1u

public val MM_PROTECT_DRIVER_SECTION_ALLOW_UNLOAD: UInt = 1u

public val MM_PROTECT_DRIVER_SECTION_VALID_FLAGS: UInt = 1u

public val MM_REMOVE_PHYSICAL_MEMORY_BAD_ONLY: UInt = 1u

public val MM_SECURE_EXCLUSIVE: UInt = 1u

public val MM_SECURE_NO_CHANGE: UInt = 2u

public val MM_SECURE_NO_INHERIT: UInt = 8u

public val MM_SECURE_USER_MODE_ONLY: UInt = 4u

public val MM_SYSTEM_SPACE_END: UInt = 4294967295u

public val MM_SYSTEM_VIEW_EXCEPTIONS_FOR_INPAGE_ERRORS: UInt = 1u

public val MPI_BUS: InterfaceType = 10

public val MPI_CONFIGURATION: BusDataType = 8

public val MPSA_BUS: InterfaceType = 11

public val MPSA_CONFIGURATION: BusDataType = 9

public val MRL_CLOSED: PciExpressMrlState = 0

public val MRL_OPEN: PciExpressMrlState = 1

public val MAP_PHYSICAL_ADDRESS_TYPE_CONTIGUOUS_RANGE: IommuMapPhysicalAddressType = 1

public val MAP_PHYSICAL_ADDRESS_TYPE_MAX: IommuMapPhysicalAddressType = 3

public val MAP_PHYSICAL_ADDRESS_TYPE_MDL: IommuMapPhysicalAddressType = 0

public val MAP_PHYSICAL_ADDRESS_TYPE_PFN: IommuMapPhysicalAddressType = 2

public val MAX_FAULT_TYPE: FaultInformationArm64Type = 7

public val MAX_HARDWARE_COUNTER_TYPE: HardwareCounterType = 1

public val MAX_PAYLOAD1024BYTES: PciExpressMaxPayloadSize = 3

public val MAX_PAYLOAD128BYTES: PciExpressMaxPayloadSize = 0

public val MAX_PAYLOAD2048BYTES: PciExpressMaxPayloadSize = 4

public val MAX_PAYLOAD256BYTES: PciExpressMaxPayloadSize = 1

public val MAX_PAYLOAD4096BYTES: PciExpressMaxPayloadSize = 5

public val MAX_PAYLOAD512BYTES: PciExpressMaxPayloadSize = 2

public val MAX_REG_NT_NOTIFY_CLASS: RegNotifyClass = 51

public val MAX_SUBSYSTEM_INFORMATION_TYPE: SubsystemInformationType = 2

public val MAX_TRACE_INFORMATION_CLASS: TraceInformationClass = 16

public val MAXIMUM_BUS_DATA_TYPE: BusDataType = 12

public val MAXIMUM_DMA_SPEED: DmaSpeed = 5

public val MAXIMUM_DMA_WIDTH: DmaWidth = 5

public val MAXIMUM_INTERFACE_TYPE: InterfaceType = 18

public val MAXIMUM_MODE: Mode = 2

public val MAXIMUM_TYPE: ConfigurationType = 41

public val MAXIMUM_WAIT_REASON: KwaitReason = 42

public val MAXIMUM_WORK_QUEUE: WorkQueueType = 7

public val MDL_MAPPING_NO_EXECUTE: UInt = 1073741824u

public val MDL_MAPPING_NO_WRITE: UInt = 2147483648u

public val MDL_MAPPING_WITH_GUARD_PTES: UInt = 536870912u

public val MEDIUM_HIGH_IMPORTANCE: KdpcImportance = 3

public val MEDIUM_IMPORTANCE: KdpcImportance = 1

public val MEM_DEDICATED_ATTRIBUTE_MAX: MemDedicatedAttributeType = 4

public val MEM_DEDICATED_ATTRIBUTE_READ_BANDWIDTH: MemDedicatedAttributeType = 0

public val MEM_DEDICATED_ATTRIBUTE_READ_LATENCY: MemDedicatedAttributeType = 1

public val MEM_DEDICATED_ATTRIBUTE_WRITE_BANDWIDTH: MemDedicatedAttributeType = 2

public val MEM_DEDICATED_ATTRIBUTE_WRITE_LATENCY: MemDedicatedAttributeType = 3

public val MEM_SECTION_EXTENDED_PARAMETER_INVALID_TYPE: MemSectionExtendedParameterType = 0

public val MEM_SECTION_EXTENDED_PARAMETER_MAX: MemSectionExtendedParameterType = 4

public val MEM_SECTION_EXTENDED_PARAMETER_NUMA_NODE: MemSectionExtendedParameterType = 2

public val MEM_SECTION_EXTENDED_PARAMETER_SIGNING_LEVEL: MemSectionExtendedParameterType = 3

public val MEM_SECTION_EXTENDED_PARAMETER_USER_PHYSICAL_FLAGS: MemSectionExtendedParameterType = 1

public val MICRO_CHANNEL: InterfaceType = 3

public val MM_CACHED: MemoryCachingType = 1

public val MM_FRAME_BUFFER_CACHED: MemoryCachingTypeOrig = 2

public val MM_HARDWARE_COHERENT_CACHED: MemoryCachingType = 3

public val MM_LARGE_SYSTEM: MmSystemsize = 2

public val MM_MAXIMUM_CACHE_TYPE: MemoryCachingType = 6

public val MM_MAXIMUM_ROTATE_DIRECTION: MmRotateDirection = 4

public val MM_MDL_PAGE_CONTENTS_DYNAMIC: MmMdlPageContentsState = 0

public val MM_MDL_PAGE_CONTENTS_INVARIANT: MmMdlPageContentsState = 1

public val MM_MDL_PAGE_CONTENTS_QUERY: MmMdlPageContentsState = 2

public val MM_MEDIUM_SYSTEM: MmSystemsize = 1

public val MM_NON_CACHED: MemoryCachingType = 0

public val MM_NON_CACHED_UNORDERED: MemoryCachingType = 4

public val MM_NOT_MAPPED: MemoryCachingType = -1

public val MM_SMALL_SYSTEM: MmSystemsize = 0

public val MM_TO_FRAME_BUFFER: MmRotateDirection = 0

public val MM_TO_FRAME_BUFFER_NO_COPY: MmRotateDirection = 1

public val MM_TO_REGULAR_MEMORY: MmRotateDirection = 2

public val MM_TO_REGULAR_MEMORY_NO_COPY: MmRotateDirection = 3

public val MM_USWC_CACHED: MemoryCachingType = 5

public val MM_WRITE_COMBINED: MemoryCachingType = 2

public val MODEM_PERIPHERAL: ConfigurationType = 28

public val MODIFY_ACCESS: IoAccessType = 2

public val MONITOR_PERIPHERAL: ConfigurationType = 29

public val MONITOR_REQUEST_REASON_AC_DC_DISPLAY_BURST: PowerMonitorRequestReason = 5

public val MONITOR_REQUEST_REASON_AC_DC_DISPLAY_BURST_SUPPRESSED: PowerMonitorRequestReason = 28

public val MONITOR_REQUEST_REASON_BATTERY_COUNT_CHANGE: PowerMonitorRequestReason = 16

public val MONITOR_REQUEST_REASON_BATTERY_COUNT_CHANGE_SUPPRESSED: PowerMonitorRequestReason = 49

public val MONITOR_REQUEST_REASON_BATTERY_PRE_CRITICAL: PowerMonitorRequestReason = 53

public val MONITOR_REQUEST_REASON_BUILTIN_PANEL: PowerMonitorRequestReason = 47

public val MONITOR_REQUEST_REASON_DP: PowerMonitorRequestReason = 19

public val MONITOR_REQUEST_REASON_DIM: PowerMonitorRequestReason = 46

public val MONITOR_REQUEST_REASON_DIRECTED_DRIPS: PowerMonitorRequestReason = 45

public val MONITOR_REQUEST_REASON_DISPLAY_REQUIRED_UN_DIM: PowerMonitorRequestReason = 48

public val MONITOR_REQUEST_REASON_FULL_WAKE: PowerMonitorRequestReason = 9

public val MONITOR_REQUEST_REASON_GRACE_PERIOD: PowerMonitorRequestReason = 17

public val MONITOR_REQUEST_REASON_IDLE_TIMEOUT: PowerMonitorRequestReason = 12

public val MONITOR_REQUEST_REASON_LID: PowerMonitorRequestReason = 15

public val MONITOR_REQUEST_REASON_MAX: PowerMonitorRequestReason = 55

public val MONITOR_REQUEST_REASON_NEAR_PROXIMITY: PowerMonitorRequestReason = 22

public val MONITOR_REQUEST_REASON_PDC_SIGNAL: PowerMonitorRequestReason = 27

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_FINGERPRINT: PowerMonitorRequestReason = 44

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_HEY_CORTANA: PowerMonitorRequestReason = 42

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_HOLOGRAPHIC_SHELL: PowerMonitorRequestReason = 43

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_SENSORS_HUMAN_PRESENCE: PowerMonitorRequestReason = 52

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_WINDOWS_MOBILE_PWR_NOTIF: PowerMonitorRequestReason = 40

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_WINDOWS_MOBILE_SHELL: PowerMonitorRequestReason = 41

public val MONITOR_REQUEST_REASON_PN_P: PowerMonitorRequestReason = 18

public val MONITOR_REQUEST_REASON_PO_SET_SYSTEM_STATE: PowerMonitorRequestReason = 7

public val MONITOR_REQUEST_REASON_POLICY_CHANGE: PowerMonitorRequestReason = 13

public val MONITOR_REQUEST_REASON_POWER_BUTTON: PowerMonitorRequestReason = 1

public val MONITOR_REQUEST_REASON_REMOTE_CONNECTION: PowerMonitorRequestReason = 2

public val MONITOR_REQUEST_REASON_RESUME_MODERN_STANDBY: PowerMonitorRequestReason = 50

public val MONITOR_REQUEST_REASON_RESUME_PDC: PowerMonitorRequestReason = 24

public val MONITOR_REQUEST_REASON_RESUME_S4: PowerMonitorRequestReason = 25

public val MONITOR_REQUEST_REASON_SC_MONITORPOWER: PowerMonitorRequestReason = 3

public val MONITOR_REQUEST_REASON_SCREEN_OFF_REQUEST: PowerMonitorRequestReason = 11

public val MONITOR_REQUEST_REASON_SESSION_UNLOCK: PowerMonitorRequestReason = 10

public val MONITOR_REQUEST_REASON_SET_THREAD_EXECUTION_STATE: PowerMonitorRequestReason = 8

public val MONITOR_REQUEST_REASON_SLEEP_BUTTON: PowerMonitorRequestReason = 14

public val MONITOR_REQUEST_REASON_SX_TRANSITION: PowerMonitorRequestReason = 20

public val MONITOR_REQUEST_REASON_SYSTEM_IDLE: PowerMonitorRequestReason = 21

public val MONITOR_REQUEST_REASON_SYSTEM_STATE_ENTERED: PowerMonitorRequestReason = 29

public val MONITOR_REQUEST_REASON_TERMINAL: PowerMonitorRequestReason = 26

public val MONITOR_REQUEST_REASON_TERMINAL_INIT: PowerMonitorRequestReason = 51

public val MONITOR_REQUEST_REASON_THERMAL_STANDBY: PowerMonitorRequestReason = 23

public val MONITOR_REQUEST_REASON_UNKNOWN: PowerMonitorRequestReason = 0

public val MONITOR_REQUEST_REASON_USER_DISPLAY_BURST: PowerMonitorRequestReason = 6

public val MONITOR_REQUEST_REASON_USER_INPUT: PowerMonitorRequestReason = 4

public val MONITOR_REQUEST_REASON_USER_INPUT_ACCELEROMETER: PowerMonitorRequestReason = 35

public val MONITOR_REQUEST_REASON_USER_INPUT_HID: PowerMonitorRequestReason = 36

public val MONITOR_REQUEST_REASON_USER_INPUT_INITIALIZATION: PowerMonitorRequestReason = 39

public val MONITOR_REQUEST_REASON_USER_INPUT_KEYBOARD: PowerMonitorRequestReason = 31

public val MONITOR_REQUEST_REASON_USER_INPUT_MOUSE: PowerMonitorRequestReason = 32

public val MONITOR_REQUEST_REASON_USER_INPUT_PEN: PowerMonitorRequestReason = 34

public val MONITOR_REQUEST_REASON_USER_INPUT_PO_USER_PRESENT: PowerMonitorRequestReason = 37

public val MONITOR_REQUEST_REASON_USER_INPUT_SESSION_SWITCH: PowerMonitorRequestReason = 38

public val MONITOR_REQUEST_REASON_USER_INPUT_TOUCH: PowerMonitorRequestReason = 54

public val MONITOR_REQUEST_REASON_USER_INPUT_TOUCHPAD: PowerMonitorRequestReason = 33

public val MONITOR_REQUEST_REASON_WINRT: PowerMonitorRequestReason = 30

public val MONITOR_REQUEST_TYPE_OFF: PowerMonitorRequestType = 0

public val MONITOR_REQUEST_TYPE_ON_AND_PRESENT: PowerMonitorRequestType = 1

public val MONITOR_REQUEST_TYPE_TOGGLE_ON: PowerMonitorRequestType = 2

public val MULTI_FUNCTION_ADAPTER: ConfigurationType = 12

public val NEC98X86: AlternativeArchitectureType = 1

public val NPEM_CONTROL_INTERFACE_CURRENT_VERSION: UInt = 2u

public val NPEM_CONTROL_INTERFACE_VERSION1: UInt = 1u

public val NPEM_CONTROL_INTERFACE_VERSION2: UInt = 2u

public val NT_PAGING_LEVELS: UInt = 2u

public val NX_SUPPORT_POLICY_ALWAYSOFF: UInt = 0u

public val NX_SUPPORT_POLICY_ALWAYSON: UInt = 1u

public val NX_SUPPORT_POLICY_OPTIN: UInt = 2u

public val NX_SUPPORT_POLICY_OPTOUT: UInt = 3u

public val NETWORK_CONTROLLER: ConfigurationType = 18

public val NETWORK_PERIPHERAL: ConfigurationType = 36

public val NO_ASPM_SUPPORT: PciExpressAspmSupport = 0

public val NORMAL_PAGE_PRIORITY: MmPagePriority = 16

public val NORMAL_POOL_PRIORITY: ExPoolPriority = 16

public val NORMAL_POOL_PRIORITY_SPECIAL_POOL_OVERRUN: ExPoolPriority = 24

public val NORMAL_POOL_PRIORITY_SPECIAL_POOL_UNDERRUN: ExPoolPriority = 25

public val NORMAL_WORK_QUEUE: WorkQueueType = 3

public val NU_BUS: InterfaceType = 7

public val NU_BUS_CONFIGURATION: BusDataType = 6

public val OBJECT_TYPE_CREATE: UInt = 1u

public val OB_FLT_REGISTRATION_VERSION: UInt = 256u

public val OB_FLT_REGISTRATION_VERSION_0100: UInt = 256u

public val OB_OPERATION_HANDLE_CREATE: UInt = 1u

public val OB_OPERATION_HANDLE_DUPLICATE: UInt = 2u

public val OB_PREOP_SUCCESS: ObPreopCallbackStatus = 0

public val OPLOCK_KEY_FLAG_PARENT_KEY: UInt = 1u

public val OPLOCK_KEY_FLAG_TARGET_KEY: UInt = 2u

public val OPLOCK_KEY_VERSION_WIN7: UInt = 1u

public val OPLOCK_KEY_VERSION_WIN8: UInt = 2u

public val OSC_CAPABILITIES_MASKED: UInt = 16u

public val OSC_FIRMWARE_FAILURE: UInt = 2u

public val OSC_UNRECOGNIZED_REVISION: UInt = 8u

public val OSC_UNRECOGNIZED_UUID: UInt = 4u

public val OK_CONTROL: NpemControlStandardControlBit = 2

public val OTHER_CONTROLLER: ConfigurationType = 24

public val OTHER_PERIPHERAL: ConfigurationType = 34

public val PAGE_ENCLAVE_NO_CHANGE: UInt = 536870912u

public val PAGE_ENCLAVE_THREAD_CONTROL: UInt = 2147483648u

public val PAGE_ENCLAVE_UNVALIDATED: UInt = 536870912u

public val PAGE_EXECUTE: UInt = 16u

public val PAGE_EXECUTE_READ: UInt = 32u

public val PAGE_EXECUTE_READWRITE: UInt = 64u

public val PAGE_EXECUTE_WRITECOPY: UInt = 128u

public val PAGE_GRAPHICS_COHERENT: UInt = 131072u

public val PAGE_GRAPHICS_EXECUTE: UInt = 16384u

public val PAGE_GRAPHICS_EXECUTE_READ: UInt = 32768u

public val PAGE_GRAPHICS_EXECUTE_READWRITE: UInt = 65536u

public val PAGE_GRAPHICS_NOACCESS: UInt = 2048u

public val PAGE_GRAPHICS_NOCACHE: UInt = 262144u

public val PAGE_GRAPHICS_READONLY: UInt = 4096u

public val PAGE_GRAPHICS_READWRITE: UInt = 8192u

public val PAGE_GUARD: UInt = 256u

public val PAGE_NOACCESS: UInt = 1u

public val PAGE_NOCACHE: UInt = 512u

public val PAGE_READONLY: UInt = 2u

public val PAGE_READWRITE: UInt = 4u

public val PAGE_REVERT_TO_FILE_MAP: UInt = 2147483648u

public val PAGE_SHIFT: Int = 12

public val PAGE_SIZE: UInt = 4096u

public val PAGE_TARGETS_INVALID: UInt = 1073741824u

public val PAGE_TARGETS_NO_UPDATE: UInt = 1073741824u

public val PAGE_WRITECOMBINE: UInt = 1024u

public val PAGE_WRITECOPY: UInt = 8u

public val PARKING_TOPOLOGY_POLICY_DISABLED: UInt = 0u

public val PASSIVE_LEVEL: UInt = 0u

public val PCCARD_DEVICE_PCI: UInt = 16u

public val PCCARD_DUP_LEGACY_BASE: UInt = 6u

public val PCCARD_MAP_ERROR: UInt = 1u

public val PCCARD_MAP_ZERO: UInt = 2u

public val PCCARD_NO_CONTROLLERS: UInt = 7u

public val PCCARD_NO_LEGACY_BASE: UInt = 5u

public val PCCARD_NO_PIC: UInt = 4u

public val PCCARD_NO_TIMER: UInt = 3u

public val PCCARD_SCAN_DISABLED: UInt = 1u

public val PCI_BUS: InterfaceType = 5

public val PCI_CONFIGURATION: BusDataType = 4

public val PCIXBUS_ERRTYPE_ADDRESSPARITY: UInt = 6u

public val PCIXBUS_ERRTYPE_BUSTIMEOUT: UInt = 4u

public val PCIXBUS_ERRTYPE_COMMANDPARITY: UInt = 7u

public val PCIXBUS_ERRTYPE_DATAPARITY: UInt = 1u

public val PCIXBUS_ERRTYPE_MASTERABORT: UInt = 3u

public val PCIXBUS_ERRTYPE_MASTERDATAPARITY: UInt = 5u

public val PCIXBUS_ERRTYPE_SYSTEM: UInt = 2u

public val PCIXBUS_ERRTYPE_UNKNOWN: UInt = 0u

public val PCIX_MODE1_100MHZ: UInt = 2u

public val PCIX_MODE1_133MHZ: UInt = 3u

public val PCIX_MODE1_66MHZ: UInt = 1u

public val PCIX_MODE2_266_100MHZ: UInt = 10u

public val PCIX_MODE2_266_133MHZ: UInt = 11u

public val PCIX_MODE2_266_66MHZ: UInt = 9u

public val PCIX_MODE2_533_100MHZ: UInt = 14u

public val PCIX_MODE2_533_133MHZ: UInt = 15u

public val PCIX_MODE2_533_66MHZ: UInt = 13u

public val PCIX_MODE_CONVENTIONAL_PCI: UInt = 0u

public val PCIX_VERSION_DUAL_MODE_ECC: UInt = 2u

public val PCIX_VERSION_MODE1_ONLY: UInt = 0u

public val PCIX_VERSION_MODE2_ECC: UInt = 1u

public val PCI_ACS_ALLOWED: UInt = 0u

public val PCI_ACS_BLOCKED: UInt = 1u

public val PCI_ACS_REDIRECTED: UInt = 2u

public val PCI_ADDRESS_IO_ADDRESS_MASK: UInt = 4294967292u

public val PCI_ADDRESS_IO_SPACE: UInt = 1u

public val PCI_ADDRESS_MEMORY_ADDRESS_MASK: UInt = 4294967280u

public val PCI_ADDRESS_MEMORY_PREFETCHABLE: UInt = 8u

public val PCI_ADDRESS_MEMORY_TYPE_MASK: UInt = 6u

public val PCI_ADDRESS_ROM_ADDRESS_MASK: UInt = 4294965248u

public val PCI_AGP_RATE_1X: UInt = 1u

public val PCI_AGP_RATE_2X: UInt = 2u

public val PCI_AGP_RATE_4X: UInt = 4u

public val PCI_ATS_INTERFACE_VERSION: UInt = 1u

public val PCI_BRIDGE_TYPE: UInt = 1u

public val PCI_BUS_INTERFACE_STANDARD_VERSION: UInt = 2u

public val PCI_CAPABILITY_ID_ADVANCED_FEATURES: UInt = 19u

public val PCI_CAPABILITY_ID_AGP: UInt = 2u

public val PCI_CAPABILITY_ID_AGP_TARGET: UInt = 14u

public val PCI_CAPABILITY_ID_CPCI_HOTSWAP: UInt = 6u

public val PCI_CAPABILITY_ID_CPCI_RES_CTRL: UInt = 11u

public val PCI_CAPABILITY_ID_DEBUG_PORT: UInt = 10u

public val PCI_CAPABILITY_ID_FPB: UInt = 21u

public val PCI_CAPABILITY_ID_HYPERTRANSPORT: UInt = 8u

public val PCI_CAPABILITY_ID_MSI: UInt = 5u

public val PCI_CAPABILITY_ID_MSIX: UInt = 17u

public val PCI_CAPABILITY_ID_P2P_SSID: UInt = 13u

public val PCI_CAPABILITY_ID_PCIX: UInt = 7u

public val PCI_CAPABILITY_ID_PCI_EXPRESS: UInt = 16u

public val PCI_CAPABILITY_ID_POWER_MANAGEMENT: UInt = 1u

public val PCI_CAPABILITY_ID_SATA_CONFIG: UInt = 18u

public val PCI_CAPABILITY_ID_SECURE: UInt = 15u

public val PCI_CAPABILITY_ID_SHPC: UInt = 12u

public val PCI_CAPABILITY_ID_SLOT_ID: UInt = 4u

public val PCI_CAPABILITY_ID_VENDOR_SPECIFIC: UInt = 9u

public val PCI_CAPABILITY_ID_VPD: UInt = 3u

public val PCI_CARDBUS_BRIDGE_TYPE: UInt = 2u

public val PCI_CLASS_BASE_SYSTEM_DEV: UInt = 8u

public val PCI_CLASS_BRIDGE_DEV: UInt = 6u

public val PCI_CLASS_DATA_ACQ_SIGNAL_PROC: UInt = 17u

public val PCI_CLASS_DISPLAY_CTLR: UInt = 3u

public val PCI_CLASS_DOCKING_STATION: UInt = 10u

public val PCI_CLASS_ENCRYPTION_DECRYPTION: UInt = 16u

public val PCI_CLASS_INPUT_DEV: UInt = 9u

public val PCI_CLASS_INTELLIGENT_IO_CTLR: UInt = 14u

public val PCI_CLASS_MASS_STORAGE_CTLR: UInt = 1u

public val PCI_CLASS_MEMORY_CTLR: UInt = 5u

public val PCI_CLASS_MULTIMEDIA_DEV: UInt = 4u

public val PCI_CLASS_NETWORK_CTLR: UInt = 2u

public val PCI_CLASS_NOT_DEFINED: UInt = 255u

public val PCI_CLASS_PRE_20: UInt = 0u

public val PCI_CLASS_PROCESSOR: UInt = 11u

public val PCI_CLASS_SATELLITE_COMMS_CTLR: UInt = 15u

public val PCI_CLASS_SERIAL_BUS_CTLR: UInt = 12u

public val PCI_CLASS_SIMPLE_COMMS_CTLR: UInt = 7u

public val PCI_CLASS_WIRELESS_CTLR: UInt = 13u

public val PCI_DATA_VERSION: UInt = 1u

public val PCI_DEVICE_PRESENT_INTERFACE_VERSION: UInt = 1u

public val PCI_DEVICE_TYPE: UInt = 0u

public val PCI_DISABLE_LEVEL_INTERRUPT: UInt = 1024u

public val PCI_ENABLE_BUS_MASTER: UInt = 4u

public val PCI_ENABLE_FAST_BACK_TO_BACK: UInt = 512u

public val PCI_ENABLE_IO_SPACE: UInt = 1u

public val PCI_ENABLE_MEMORY_SPACE: UInt = 2u

public val PCI_ENABLE_PARITY: UInt = 64u

public val PCI_ENABLE_SERR: UInt = 256u

public val PCI_ENABLE_SPECIAL_CYCLES: UInt = 8u

public val PCI_ENABLE_VGA_COMPATIBLE_PALETTE: UInt = 32u

public val PCI_ENABLE_WAIT_CYCLE: UInt = 128u

public val PCI_ENABLE_WRITE_AND_INVALIDATE: UInt = 16u

public val PCI_EXPRESS_ACCESS_CONTROL_SERVICES_CAP_ID: UInt = 13u

public val PCI_EXPRESS_ADVANCED_ERROR_REPORTING_CAP_ID: UInt = 1u

public val PCI_EXPRESS_ARI_CAP_ID: UInt = 14u

public val PCI_EXPRESS_ATS_CAP_ID: UInt = 15u

public val PCI_EXPRESS_CONFIGURATION_ACCESS_CORRELATION_CAP_ID: UInt = 12u

public val PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_CAP_ID: UInt = 35u

public val PCI_EXPRESS_DEVICE_SERIAL_NUMBER_CAP_ID: UInt = 3u

public val PCI_EXPRESS_DPA_CAP_ID: UInt = 22u

public val PCI_EXPRESS_DPC_CAP_ID: UInt = 29u

public val PCI_EXPRESS_FRS_QUEUEING_CAP_ID: UInt = 33u

public val PCI_EXPRESS_L1_PM_SS_CAP_ID: UInt = 30u

public val PCI_EXPRESS_LINK_QUIESCENT_INTERFACE_VERSION: UInt = 1u

public val PCI_EXPRESS_LN_REQUESTER_CAP_ID: UInt = 28u

public val PCI_EXPRESS_LTR_CAP_ID: UInt = 24u

public val PCI_EXPRESS_MFVC_CAP_ID: UInt = 8u

public val PCI_EXPRESS_MPCIE_CAP_ID: UInt = 32u

public val PCI_EXPRESS_MULTICAST_CAP_ID: UInt = 18u

public val PCI_EXPRESS_MULTI_ROOT_IO_VIRTUALIZATION_CAP_ID: UInt = 17u

public val PCI_EXPRESS_NPEM_CAP_ID: UInt = 41u

public val PCI_EXPRESS_PAGE_REQUEST_CAP_ID: UInt = 19u

public val PCI_EXPRESS_PASID_CAP_ID: UInt = 27u

public val PCI_EXPRESS_PMUX_CAP_ID: UInt = 26u

public val PCI_EXPRESS_POWER_BUDGETING_CAP_ID: UInt = 4u

public val PCI_EXPRESS_PTM_CAP_ID: UInt = 31u

public val PCI_EXPRESS_RCRB_HEADER_CAP_ID: UInt = 10u

public val PCI_EXPRESS_RC_EVENT_COLLECTOR_ENDPOINT_ASSOCIATION_CAP_ID: UInt = 7u

public val PCI_EXPRESS_RC_INTERNAL_LINK_CONTROL_CAP_ID: UInt = 6u

public val PCI_EXPRESS_RC_LINK_DECLARATION_CAP_ID: UInt = 5u

public val PCI_EXPRESS_READINESS_TIME_REPORTING_CAP_ID: UInt = 34u

public val PCI_EXPRESS_RESERVED_FOR_AMD_CAP_ID: UInt = 20u

public val PCI_EXPRESS_RESIZABLE_BAR_CAP_ID: UInt = 21u

public val PCI_EXPRESS_ROOT_PORT_INTERFACE_VERSION: UInt = 1u

public val PCI_EXPRESS_SECONDARY_PCI_EXPRESS_CAP_ID: UInt = 25u

public val PCI_EXPRESS_SINGLE_ROOT_IO_VIRTUALIZATION_CAP_ID: UInt = 16u

public val PCI_EXPRESS_TPH_REQUESTER_CAP_ID: UInt = 23u

public val PCI_EXPRESS_TPH_ST_LOCATION_MSIX_TABLE: UInt = 2u

public val PCI_EXPRESS_TPH_ST_LOCATION_NONE: UInt = 0u

public val PCI_EXPRESS_TPH_ST_LOCATION_RESERVED: UInt = 3u

public val PCI_EXPRESS_TPH_ST_LOCATION_TPH_CAPABILITY: UInt = 1u

public val PCI_EXPRESS_VC_AND_MFVC_CAP_ID: UInt = 9u

public val PCI_EXPRESS_VENDOR_SPECIFIC_CAP_ID: UInt = 11u

public val PCI_EXPRESS_VIRTUAL_CHANNEL_CAP_ID: UInt = 2u

public val PCI_EXTENDED_CONFIG_LENGTH: UInt = 4096u

public val PCI_INVALID_ALTERNATE_FUNCTION_NUMBER: UInt = 255u

public val PCI_INVALID_VENDORID: UInt = 65535u

public val PCI_MAX_BRIDGE_NUMBER: UInt = 255u

public val PCI_MAX_DEVICES: UInt = 32u

public val PCI_MAX_FUNCTION: UInt = 8u

public val PCI_MAX_SEGMENT_NUMBER: UInt = 65535u

public val PCI_MSIX_TABLE_CONFIG_INTERFACE_VERSION: UInt = 1u

public val PCI_MULTIFUNCTION: UInt = 128u

public val PCI_PROGRAMMING_INTERFACE_MSC_NVM_EXPRESS: UInt = 2u

public val PCI_PTM_TIME_SOURCE_AUX: UInt = 4294967295u

public val PCI_ROMADDRESS_ENABLED: UInt = 1u

public val PCI_ROOT_BUS_OSC_METHOD_CAPABILITY_REVISION: UInt = 1u

public val PCI_SECURITY_DIRECT_TRANSLATED_P2P: UInt = 4u

public val PCI_SECURITY_ENHANCED: UInt = 2u

public val PCI_SECURITY_FULLY_SUPPORTED: UInt = 1u

public val PCI_SECURITY_GUEST_ASSIGNED: UInt = 1u

public val PCI_SECURITY_INTERFACE_VERSION: UInt = 1u

public val PCI_SECURITY_INTERFACE_VERSION2: UInt = 2u

public val PCI_SECURITY_SRIOV_DIRECT_TRANSLATED_P2P: UInt = 262144u

public val PCI_STATUS_66MHZ_CAPABLE: UInt = 32u

public val PCI_STATUS_CAPABILITIES_LIST: UInt = 16u
