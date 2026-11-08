package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID

public val ACPIBus: INTERFACE_TYPE = 17

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

public val ARM_PROCESSOR_ERROR_SECTION_GUID: GUID = GUID.from_u128(U128(0xe19e3d16bc1111e4uL, 0x9caac2051d5d46b0uL))

public val ATS_DEVICE_SVM_OPTOUT: UInt = 1u

public val AccessFlagFault: FAULT_INFORMATION_ARM64_TYPE = 5

public val AddressSizeFault: FAULT_INFORMATION_ARM64_TYPE = 1

public val AgpControl: EXTENDED_AGP_REGISTER = 1

public val AllLoggerHandlesClass: TRACE_INFORMATION_CLASS = 6

public val AperturePageSize: EXTENDED_AGP_REGISTER = 3

public val ApertureSize: EXTENDED_AGP_REGISTER = 2

public val ApicDestinationModeLogicalClustered: HAL_APIC_DESTINATION_MODE = 3

public val ApicDestinationModeLogicalFlat: HAL_APIC_DESTINATION_MODE = 2

public val ApicDestinationModePhysical: HAL_APIC_DESTINATION_MODE = 1

public val ApicDestinationModeUnknown: HAL_APIC_DESTINATION_MODE = 4

public val ArbiterActionAddReserved: ARBITER_ACTION = 8

public val ArbiterActionBootAllocation: ARBITER_ACTION = 9

public val ArbiterActionCommitAllocation: ARBITER_ACTION = 2

public val ArbiterActionQueryAllocatedResources: ARBITER_ACTION = 4

public val ArbiterActionQueryArbitrate: ARBITER_ACTION = 7

public val ArbiterActionQueryConflict: ARBITER_ACTION = 6

public val ArbiterActionRetestAllocation: ARBITER_ACTION = 1

public val ArbiterActionRollbackAllocation: ARBITER_ACTION = 3

public val ArbiterActionTestAllocation: ARBITER_ACTION = 0

public val ArbiterActionWriteReservedResources: ARBITER_ACTION = 5

public val ArbiterRequestHalReported: ARBITER_REQUEST_SOURCE = 1

public val ArbiterRequestLegacyAssigned: ARBITER_REQUEST_SOURCE = 2

public val ArbiterRequestLegacyReported: ARBITER_REQUEST_SOURCE = 0

public val ArbiterRequestPnpDetected: ARBITER_REQUEST_SOURCE = 3

public val ArbiterRequestPnpEnumerated: ARBITER_REQUEST_SOURCE = 4

public val ArbiterRequestUndefined: ARBITER_REQUEST_SOURCE = -1

public val ArbiterResultExternalConflict: ARBITER_RESULT = 1

public val ArbiterResultNullRequest: ARBITER_RESULT = 2

public val ArbiterResultSuccess: ARBITER_RESULT = 0

public val ArbiterResultUndefined: ARBITER_RESULT = -1

public val ArcSystem: CONFIGURATION_TYPE = 0

public val AssignSecurityDescriptor: SECURITY_OPERATION_CODE = 3

public val AudioController: CONFIGURATION_TYPE = 23

public val BMC_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x487565ba64944367uL, 0x95ca4eff893522f6uL))

public val BOOT_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x3d61a466ab40409auL, 0xa698f362d464b38fuL))

public val BackgroundWorkQueue: WORK_QUEUE_TYPE = 4

public val BdCbClassificationEnd: BDCB_CLASSIFICATION = 4

public val BdCbClassificationKnownBadImage: BDCB_CLASSIFICATION = 2

public val BdCbClassificationKnownBadImageBootCritical: BDCB_CLASSIFICATION = 3

public val BdCbClassificationKnownGoodImage: BDCB_CLASSIFICATION = 1

public val BdCbClassificationUnknownImage: BDCB_CLASSIFICATION = 0

public val BdCbInitializeImage: BDCB_CALLBACK_TYPE = 1

public val BdCbStatusPrepareForDependencyLoad: BDCB_STATUS_UPDATE_TYPE = 0

public val BdCbStatusPrepareForDriverLoad: BDCB_STATUS_UPDATE_TYPE = 1

public val BdCbStatusPrepareForUnload: BDCB_STATUS_UPDATE_TYPE = 2

public val BdCbStatusUpdate: BDCB_CALLBACK_TYPE = 0

public val BoundExceptionContinueSearch: BOUND_CALLBACK_STATUS = 0

public val BoundExceptionError: BOUND_CALLBACK_STATUS = 2

public val BoundExceptionHandled: BOUND_CALLBACK_STATUS = 1

public val BoundExceptionMaximum: BOUND_CALLBACK_STATUS = 3

public val BufferEmpty: KBUGCHECK_BUFFER_DUMP_STATE = 0

public val BufferFinished: KBUGCHECK_BUFFER_DUMP_STATE = 3

public val BufferIncomplete: KBUGCHECK_BUFFER_DUMP_STATE = 4

public val BufferInserted: KBUGCHECK_BUFFER_DUMP_STATE = 1

public val BufferStarted: KBUGCHECK_BUFFER_DUMP_STATE = 2

public val BusQueryCompatibleIDs: BUS_QUERY_ID_TYPE = 2

public val BusQueryContainerID: BUS_QUERY_ID_TYPE = 5

public val BusQueryDeviceID: BUS_QUERY_ID_TYPE = 0

public val BusQueryDeviceSerialNumber: BUS_QUERY_ID_TYPE = 4

public val BusQueryHardwareIDs: BUS_QUERY_ID_TYPE = 1

public val BusQueryInstanceID: BUS_QUERY_ID_TYPE = 3

public val BusRelations: DEVICE_RELATION_TYPE = 0

public val BusWidth32Bits: PCI_BUS_WIDTH = 0

public val BusWidth64Bits: PCI_BUS_WIDTH = 1

public val CBus: INTERFACE_TYPE = 9

public val CLFS_MAX_CONTAINER_INFO: UInt = 256u

public val CLFS_SCAN_BACKWARD: UByte = 4u

public val CLFS_SCAN_BUFFERED: UByte = 32u

public val CLFS_SCAN_CLOSE: UByte = 8u

public val CLFS_SCAN_FORWARD: UByte = 2u

public val CLFS_SCAN_INIT: UByte = 1u

public val CLFS_SCAN_INITIALIZED: UByte = 16u

public val CLOCK1_LEVEL: UInt = 28u

public val CLOCK2_LEVEL: UInt = 28u

public val CLOCK_LEVEL: UInt = 28u

public val CMCI_LEVEL: UInt = 5u

public val CMCI_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x919448b237394b7fuL, 0xa8f1e0062805c2a3uL))

public val CMC_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x2dce8bb1bdd7450euL, 0xb9ad9cf4ebd4f890uL))

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

public val CPER_EMPTY_GUID: GUID = GUID.from_u128(U128(0x0uL, 0x0uL))

public val CPE_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x4e292f96d8434a55uL, 0xa8c2d481f27ebeeeuL))

public val CP_GET_ERROR: UInt = 2u

public val CP_GET_NODATA: UInt = 1u

public val CP_GET_SUCCESS: UInt = 0u

public val CardPresent: PCI_EXPRESS_CARD_PRESENCE = 1

public val CbusConfiguration: BUS_DATA_TYPE = 3

public val CdromController: CONFIGURATION_TYPE = 15

public val CentralProcessor: CONFIGURATION_TYPE = 1

public val ClfsClientRecord: UByte = 3u

public val ClfsContainerActive: UInt = 4u

public val ClfsContainerActivePendingDelete: UInt = 8u

public val ClfsContainerInactive: UInt = 2u

public val ClfsContainerInitializing: UInt = 1u

public val ClfsContainerPendingArchive: UInt = 16u

public val ClfsContainerPendingArchiveAndDelete: UInt = 32u

public val ClfsDataRecord: UByte = 1u

public val ClfsNullRecord: UByte = 0u

public val ClfsRestartRecord: UByte = 2u

public val ClsContainerActive: UInt = 4u

public val ClsContainerActivePendingDelete: UInt = 8u

public val ClsContainerInactive: UInt = 2u

public val ClsContainerInitializing: UInt = 1u

public val ClsContainerPendingArchive: UInt = 16u

public val ClsContainerPendingArchiveAndDelete: UInt = 32u

public val CmResourceShareDeviceExclusive: CM_SHARE_DISPOSITION = 1

public val CmResourceShareDriverExclusive: CM_SHARE_DISPOSITION = 2

public val CmResourceShareShared: CM_SHARE_DISPOSITION = 3

public val CmResourceShareUndetermined: CM_SHARE_DISPOSITION = 0

public val CmResourceTypeBusNumber: UInt = 6u

public val CmResourceTypeConfigData: UInt = 128u

public val CmResourceTypeConnection: UInt = 132u

public val CmResourceTypeDevicePrivate: UInt = 129u

public val CmResourceTypeDeviceSpecific: UInt = 5u

public val CmResourceTypeDma: UInt = 4u

public val CmResourceTypeInterrupt: UInt = 2u

public val CmResourceTypeMaximum: UInt = 8u

public val CmResourceTypeMemory: UInt = 3u

public val CmResourceTypeMemoryLarge: UInt = 7u

public val CmResourceTypeMfCardConfig: UInt = 131u

public val CmResourceTypeNonArbitrated: UInt = 128u

public val CmResourceTypeNull: UInt = 0u

public val CmResourceTypePcCardConfig: UInt = 130u

public val CmResourceTypePort: UInt = 1u

public val Cmos: BUS_DATA_TYPE = 0

public val CommonBufferConfigTypeHardwareAccessPermissions: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_TYPE = 2

public val CommonBufferConfigTypeLogicalAddressLimits: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_TYPE = 0

public val CommonBufferConfigTypeMax: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_TYPE = 3

public val CommonBufferConfigTypeSubSection: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_TYPE = 1

public val CommonBufferHardwareAccessMax: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_ACCESS_TYPE = 3

public val CommonBufferHardwareAccessReadOnly: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_ACCESS_TYPE = 0

public val CommonBufferHardwareAccessReadWrite: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_ACCESS_TYPE = 2

public val CommonBufferHardwareAccessWriteOnly: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_ACCESS_TYPE = 1

public val Compatible: DMA_SPEED = 0

public val ConfigurationSpaceUndefined: BUS_DATA_TYPE = -1

public val ContinueCompletion: IO_COMPLETION_ROUTINE_RESULT = 0

public val CreateFileTypeMailslot: CREATE_FILE_TYPE = 2

public val CreateFileTypeNamedPipe: CREATE_FILE_TYPE = 1

public val CreateFileTypeNone: CREATE_FILE_TYPE = 0

public val CriticalWorkQueue: WORK_QUEUE_TYPE = 0

public val CustomPriorityWorkQueue: WORK_QUEUE_TYPE = 32

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

public val DEFAULT_DEVICE_DRIVER_CREATOR_GUID: GUID = GUID.from_u128(U128(0x57217c8d5e6644fbuL, 0x80339b74cacedf5buL))

public val DEVICE_DESCRIPTION_VERSION: UInt = 0u

public val DEVICE_DESCRIPTION_VERSION1: UInt = 1u

public val DEVICE_DESCRIPTION_VERSION2: UInt = 2u

public val DEVICE_DESCRIPTION_VERSION3: UInt = 3u

public val DEVICE_DRIVER_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x33f8032e704e88uL, 0x992c6f26daf3db7auL))

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

public val DeallocateObject: IO_ALLOCATION_ACTION = 2

public val DeallocateObjectKeepRegisters: IO_ALLOCATION_ACTION = 3

public val DelayExecution: KWAIT_REASON = 4

public val DelayedWorkQueue: WORK_QUEUE_TYPE = 1

public val DeleteSecurityDescriptor: SECURITY_OPERATION_CODE = 2

public val DeviceDirectoryData: DEVICE_DIRECTORY_TYPE = 0

public val DevicePowerState: POWER_STATE_TYPE = 1

public val DevicePropertyAddress: DEVICE_REGISTRY_PROPERTY = 16

public val DevicePropertyAllocatedResources: DEVICE_REGISTRY_PROPERTY = 21

public val DevicePropertyBootConfiguration: DEVICE_REGISTRY_PROPERTY = 3

public val DevicePropertyBootConfigurationTranslated: DEVICE_REGISTRY_PROPERTY = 4

public val DevicePropertyBusNumber: DEVICE_REGISTRY_PROPERTY = 14

public val DevicePropertyBusTypeGuid: DEVICE_REGISTRY_PROPERTY = 8204

public val DevicePropertyClassGuid: DEVICE_REGISTRY_PROPERTY = 4102

public val DevicePropertyClassName: DEVICE_REGISTRY_PROPERTY = 4101

public val DevicePropertyCompatibleIDs: DEVICE_REGISTRY_PROPERTY = 16386

public val DevicePropertyContainerID: DEVICE_REGISTRY_PROPERTY = 4118

public val DevicePropertyDeviceDescription: DEVICE_REGISTRY_PROPERTY = 4096

public val DevicePropertyDriverKeyName: DEVICE_REGISTRY_PROPERTY = 4103

public val DevicePropertyEnumeratorName: DEVICE_REGISTRY_PROPERTY = 4111

public val DevicePropertyFriendlyName: DEVICE_REGISTRY_PROPERTY = 4105

public val DevicePropertyHardwareID: DEVICE_REGISTRY_PROPERTY = 16385

public val DevicePropertyInstallState: DEVICE_REGISTRY_PROPERTY = 18

public val DevicePropertyLegacyBusType: DEVICE_REGISTRY_PROPERTY = 13

public val DevicePropertyLocationInformation: DEVICE_REGISTRY_PROPERTY = 4106

public val DevicePropertyManufacturer: DEVICE_REGISTRY_PROPERTY = 4104

public val DevicePropertyPhysicalDeviceObjectName: DEVICE_REGISTRY_PROPERTY = 4107

public val DevicePropertyRemovalPolicy: DEVICE_REGISTRY_PROPERTY = 19

public val DevicePropertyResourceRequirements: DEVICE_REGISTRY_PROPERTY = 20

public val DevicePropertyUINumber: DEVICE_REGISTRY_PROPERTY = 17

public val DeviceTextDescription: DEVICE_TEXT_TYPE = 0

public val DeviceTextLocationInformation: DEVICE_TEXT_TYPE = 1

public val DeviceUsageTypeBoot: DEVICE_USAGE_NOTIFICATION_TYPE = 4

public val DeviceUsageTypeDumpFile: DEVICE_USAGE_NOTIFICATION_TYPE = 3

public val DeviceUsageTypeGuestAssigned: DEVICE_USAGE_NOTIFICATION_TYPE = 6

public val DeviceUsageTypeHibernation: DEVICE_USAGE_NOTIFICATION_TYPE = 2

public val DeviceUsageTypePaging: DEVICE_USAGE_NOTIFICATION_TYPE = 1

public val DeviceUsageTypePostDisplay: DEVICE_USAGE_NOTIFICATION_TYPE = 5

public val DeviceUsageTypeUndefined: DEVICE_USAGE_NOTIFICATION_TYPE = 0

public val DeviceWakeDepthD0: DEVICE_WAKE_DEPTH = 1

public val DeviceWakeDepthD1: DEVICE_WAKE_DEPTH = 2

public val DeviceWakeDepthD2: DEVICE_WAKE_DEPTH = 3

public val DeviceWakeDepthD3cold: DEVICE_WAKE_DEPTH = 5

public val DeviceWakeDepthD3hot: DEVICE_WAKE_DEPTH = 4

public val DeviceWakeDepthMaximum: DEVICE_WAKE_DEPTH = 6

public val DeviceWakeDepthNotWakeable: DEVICE_WAKE_DEPTH = 0

public val DirectoryNotifyExtendedInformation: DIRECTORY_NOTIFY_INFORMATION_CLASS = 2

public val DirectoryNotifyFullInformation: DIRECTORY_NOTIFY_INFORMATION_CLASS = 3

public val DirectoryNotifyInformation: DIRECTORY_NOTIFY_INFORMATION_CLASS = 1

public val DirectoryNotifyMaximumInformation: DIRECTORY_NOTIFY_INFORMATION_CLASS = 4

public val DisabledControl: NPEM_CONTROL_STANDARD_CONTROL_BIT = 11

public val DiskController: CONFIGURATION_TYPE = 13

public val DiskIoNotifyRoutinesClass: TRACE_INFORMATION_CLASS = 11

public val DiskPeripheral: CONFIGURATION_TYPE = 25

public val DisplayController: CONFIGURATION_TYPE = 19

public val DmaAborted: DMA_COMPLETION_STATUS = 1

public val DmaCancelled: DMA_COMPLETION_STATUS = 3

public val DmaComplete: DMA_COMPLETION_STATUS = 0

public val DmaError: DMA_COMPLETION_STATUS = 2

public val DockingInformation: CONFIGURATION_TYPE = 38

public val DomainConfigurationArm64: DOMAIN_CONFIGURATION_ARCH = 0

public val DomainConfigurationInvalid: DOMAIN_CONFIGURATION_ARCH = 2

public val DomainConfigurationX64: DOMAIN_CONFIGURATION_ARCH = 1

public val DomainTypeMax: IOMMU_DMA_DOMAIN_TYPE = 3

public val DomainTypePassThrough: IOMMU_DMA_DOMAIN_TYPE = 1

public val DomainTypeTranslate: IOMMU_DMA_DOMAIN_TYPE = 0

public val DomainTypeUnmanaged: IOMMU_DMA_DOMAIN_TYPE = 2

public val DriverDirectoryData: DRIVER_DIRECTORY_TYPE = 1

public val DriverDirectoryImage: DRIVER_DIRECTORY_TYPE = 0

public val DriverDirectorySharedData: DRIVER_DIRECTORY_TYPE = 2

public val DriverRegKeyParameters: DRIVER_REGKEY_TYPE = 0

public val DriverRegKeyPersistentState: DRIVER_REGKEY_TYPE = 1

public val DriverRegKeySharedPersistentState: DRIVER_REGKEY_TYPE = 2

public val DrvRtPoolNxOptIn: DRIVER_RUNTIME_INIT_FLAGS = 1

public val DtiAdapter: CONFIGURATION_TYPE = 11

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

public val ERROR_MEMORY_GUID: GUID = GUID.from_u128(U128(0xe429faf23cb711d4uL, 0xbca70080c73c8881uL))

public val ERROR_MINOR_REVISION_SAL_03_00: UInt = 2u

public val ERROR_PCI_BUS_GUID: GUID = GUID.from_u128(U128(0xe429faf43cb711d4uL, 0xbca70080c73c8881uL))

public val ERROR_PCI_COMPONENT_GUID: GUID = GUID.from_u128(U128(0xe429faf63cb711d4uL, 0xbca70080c73c8881uL))

public val ERROR_PLATFORM_BUS_GUID: GUID = GUID.from_u128(U128(0xe429faf93cb711d4uL, 0xbca70080c73c8881uL))

public val ERROR_PLATFORM_HOST_CONTROLLER_GUID: GUID = GUID.from_u128(U128(0xe429faf83cb711d4uL, 0xbca70080c73c8881uL))

public val ERROR_PLATFORM_SPECIFIC_GUID: GUID = GUID.from_u128(U128(0xe429faf73cb711d4uL, 0xbca70080c73c8881uL))

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

public val ERROR_SMBIOS_GUID: GUID = GUID.from_u128(U128(0xe429faf53cb711d4uL, 0xbca70080c73c8881uL))

public val ERROR_SYSTEM_EVENT_LOG_GUID: GUID = GUID.from_u128(U128(0xe429faf33cb711d4uL, 0xbca70080c73c8881uL))

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

public val EXTINT_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0xfe84086eb55743cfuL, 0xac1b17982e078470uL))

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

public val Eisa: INTERFACE_TYPE = 2

public val EisaAdapter: CONFIGURATION_TYPE = 8

public val EisaConfiguration: BUS_DATA_TYPE = 1

public val EjectionRelations: DEVICE_RELATION_TYPE = 1

public val EndAlternatives: ALTERNATIVE_ARCHITECTURE_TYPE = 2

public val EventCategoryDeviceInterfaceChange: IO_NOTIFICATION_EVENT_CATEGORY = 2

public val EventCategoryHardwareProfileChange: IO_NOTIFICATION_EVENT_CATEGORY = 1

public val EventCategoryKernelSoftRestart: IO_NOTIFICATION_EVENT_CATEGORY = 4

public val EventCategoryReserved: IO_NOTIFICATION_EVENT_CATEGORY = 0

public val EventCategoryTargetDeviceChange: IO_NOTIFICATION_EVENT_CATEGORY = 3

public val EventLoggerHandleClass: TRACE_INFORMATION_CLASS = 5

public val Executive: KWAIT_REASON = 0

public val ExternalFault: FAULT_INFORMATION_ARM64_TYPE = 3

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

public val FIRMWARE_ERROR_RECORD_REFERENCE_GUID: GUID = GUID.from_u128(U128(0x81212a9609ed4996uL, 0x94718d729c8e69eduL))

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

public val FailControl: NPEM_CONTROL_STANDARD_CONTROL_BIT = 4

public val FaultInformationArm64: FAULT_INFORMATION_ARCH = 1

public val FaultInformationInvalid: FAULT_INFORMATION_ARCH = 0

public val FaultInformationX64: FAULT_INFORMATION_ARCH = 2

public val FloatingPointProcessor: CONFIGURATION_TYPE = 2

public val FloppyDiskPeripheral: CONFIGURATION_TYPE = 26

public val FltIoNotifyRoutinesClass: TRACE_INFORMATION_CLASS = 13

public val FreePage: KWAIT_REASON = 1

public val FunctionLevelDeviceReset: DEVICE_RESET_TYPE = 0

public val GENERIC_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x3e62a467ab40409auL, 0xa698f362d464b38fuL))

public val GENERIC_SECTION_GUID: GUID = GUID.from_u128(U128(0xe71254e8c1b94940uL, 0xab76909703a4320fuL))

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

public val GUID_ECP_CREATE_USER_PROCESS: GUID = GUID.from_u128(U128(0xe0e429ff6ddc4e65uL, 0xaab645d05a038a08uL))

public val GartHigh: EXTENDED_AGP_REGISTER = 5

public val GartLow: EXTENDED_AGP_REGISTER = 4

public val GenericEqual: RTL_GENERIC_COMPARE_RESULTS = 2

public val GenericGreaterThan: RTL_GENERIC_COMPARE_RESULTS = 1

public val GenericLessThan: RTL_GENERIC_COMPARE_RESULTS = 0

public val GlobalLoggerHandleClass: TRACE_INFORMATION_CLASS = 4

public val GroupAffinityAllGroupZero: IRQ_GROUP_POLICY = 0

public val GroupAffinityDontCare: IRQ_GROUP_POLICY = 1

public val HAL_DISPATCH_VERSION: UInt = 5u

public val HAL_DMA_ADAPTER_VERSION_1: UInt = 1u

public val HAL_MASK_UNMASK_FLAGS_NONE: UInt = 0u

public val HAL_MASK_UNMASK_FLAGS_SERVICING_COMPLETE: UInt = 2u

public val HAL_MASK_UNMASK_FLAGS_SERVICING_DEFERRED: UInt = 1u

public val HAL_MCA_RECORD: MCA_EXCEPTION_TYPE = 1

public val HAL_MCE_RECORD: MCA_EXCEPTION_TYPE = 0

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

public val HalAcpiAuditInformation: HAL_QUERY_INFORMATION_CLASS = 26

public val HalCallbackInformation: HAL_QUERY_INFORMATION_CLASS = 5

public val HalChannelTopologyInformation: HAL_QUERY_INFORMATION_CLASS = 31

public val HalCmcLog: HAL_SET_INFORMATION_CLASS = 7

public val HalCmcLogInformation: HAL_QUERY_INFORMATION_CLASS = 13

public val HalCmcRegisterDriver: HAL_SET_INFORMATION_CLASS = 4

public val HalCpeLog: HAL_SET_INFORMATION_CLASS = 8

public val HalCpeLogInformation: HAL_QUERY_INFORMATION_CLASS = 14

public val HalCpeRegisterDriver: HAL_SET_INFORMATION_CLASS = 5

public val HalDisplayBiosInformation: HAL_QUERY_INFORMATION_CLASS = 9

public val HalDisplayEmulatedBios: HAL_DISPLAY_BIOS_INFORMATION = 1

public val HalDisplayInt10Bios: HAL_DISPLAY_BIOS_INFORMATION = 0

public val HalDisplayNoBios: HAL_DISPLAY_BIOS_INFORMATION = 2

public val HalDmaCrashDumpRegisterSet1: HAL_DMA_CRASH_DUMP_REGISTER_TYPE = 0

public val HalDmaCrashDumpRegisterSet2: HAL_DMA_CRASH_DUMP_REGISTER_TYPE = 1

public val HalDmaCrashDumpRegisterSetMax: HAL_DMA_CRASH_DUMP_REGISTER_TYPE = 2

public val HalDmaRemappingInformation: HAL_QUERY_INFORMATION_CLASS = 47

public val HalEnlightenment: HAL_SET_INFORMATION_CLASS = 11

public val HalErrorInformation: HAL_QUERY_INFORMATION_CLASS = 12

public val HalExternalCacheInformation: HAL_QUERY_INFORMATION_CLASS = 32

public val HalFrameBufferCachingInformation: HAL_QUERY_INFORMATION_CLASS = 8

public val HalFrequencyInformation: HAL_QUERY_INFORMATION_CLASS = 22

public val HalFwBootPerformanceInformation: HAL_QUERY_INFORMATION_CLASS = 34

public val HalFwS3PerformanceInformation: HAL_QUERY_INFORMATION_CLASS = 35

public val HalGenerateCmcInterrupt: HAL_SET_INFORMATION_CLASS = 9

public val HalGetChannelPowerInformation: HAL_QUERY_INFORMATION_CLASS = 36

public val HalHardwareWatchdogInformation: HAL_QUERY_INFORMATION_CLASS = 46

public val HalHeterogeneousMemoryAttributesInterface: HAL_QUERY_INFORMATION_CLASS = 49

public val HalHypervisorInformation: HAL_QUERY_INFORMATION_CLASS = 24

public val HalI386ExceptionChainTerminatorInformation: HAL_SET_INFORMATION_CLASS = 15

public val HalInformationClassUnused1: HAL_QUERY_INFORMATION_CLASS = 2

public val HalInitLogInformation: HAL_QUERY_INFORMATION_CLASS = 21

public val HalInstalledBusInformation: HAL_QUERY_INFORMATION_CLASS = 0

public val HalInterruptControllerInformation: HAL_QUERY_INFORMATION_CLASS = 39

public val HalIrtInformation: HAL_QUERY_INFORMATION_CLASS = 27

public val HalKernelErrorHandler: HAL_SET_INFORMATION_CLASS = 3

public val HalMapRegisterInformation: HAL_QUERY_INFORMATION_CLASS = 6

public val HalMcaLog: HAL_SET_INFORMATION_CLASS = 6

public val HalMcaLogInformation: HAL_QUERY_INFORMATION_CLASS = 7

public val HalMcaRegisterDriver: HAL_SET_INFORMATION_CLASS = 2

public val HalNumaRangeTableInformation: HAL_QUERY_INFORMATION_CLASS = 30

public val HalNumaTopologyInterface: HAL_QUERY_INFORMATION_CLASS = 11

public val HalParkingPageInformation: HAL_QUERY_INFORMATION_CLASS = 29

public val HalPartitionIpiInterface: HAL_QUERY_INFORMATION_CLASS = 18

public val HalPlatformInformation: HAL_QUERY_INFORMATION_CLASS = 19

public val HalPlatformTimerInformation: HAL_QUERY_INFORMATION_CLASS = 25

public val HalPowerInformation: HAL_QUERY_INFORMATION_CLASS = 3

public val HalProcessorBrandString: HAL_QUERY_INFORMATION_CLASS = 23

public val HalProcessorFeatureInformation: HAL_QUERY_INFORMATION_CLASS = 10

public val HalProcessorSpeedInformation: HAL_QUERY_INFORMATION_CLASS = 4

public val HalProfileDpgoSourceInterruptHandler: HAL_SET_INFORMATION_CLASS = 12

public val HalProfileSourceAdd: HAL_SET_INFORMATION_CLASS = 20

public val HalProfileSourceInformation: HAL_QUERY_INFORMATION_CLASS = 1

public val HalProfileSourceInterruptHandler: HAL_SET_INFORMATION_CLASS = 1

public val HalProfileSourceInterval: HAL_SET_INFORMATION_CLASS = 0

public val HalProfileSourceRemove: HAL_SET_INFORMATION_CLASS = 21

public val HalProfileSourceTimerHandler: HAL_SET_INFORMATION_CLASS = 10

public val HalPsciInformation: HAL_QUERY_INFORMATION_CLASS = 38

public val HalQueryAMLIIllegalIOPortAddresses: HAL_QUERY_INFORMATION_CLASS = 16

public val HalQueryAcpiWakeAlarmSystemPowerStateInformation: HAL_QUERY_INFORMATION_CLASS = 43

public val HalQueryArmErrataInformation: HAL_QUERY_INFORMATION_CLASS = 41

public val HalQueryDebuggerInformation: HAL_QUERY_INFORMATION_CLASS = 33

public val HalQueryHyperlaunchEntrypoint: HAL_QUERY_INFORMATION_CLASS = 45

public val HalQueryIommuReservedRegionInformation: HAL_QUERY_INFORMATION_CLASS = 40

public val HalQueryMaxHotPlugMemoryAddress: HAL_QUERY_INFORMATION_CLASS = 17

public val HalQueryMcaInterface: HAL_QUERY_INFORMATION_CLASS = 15

public val HalQueryPerDeviceMsiLimitInformation: HAL_QUERY_INFORMATION_CLASS = 50

public val HalQueryProcessorEfficiencyInformation: HAL_QUERY_INFORMATION_CLASS = 42

public val HalQueryProfileCorruptionStatus: HAL_QUERY_INFORMATION_CLASS = 51

public val HalQueryProfileCounterOwnership: HAL_QUERY_INFORMATION_CLASS = 52

public val HalQueryProfileNumberOfCounters: HAL_QUERY_INFORMATION_CLASS = 44

public val HalQueryProfileSourceList: HAL_QUERY_INFORMATION_CLASS = 20

public val HalQueryStateElementInformation: HAL_QUERY_INFORMATION_CLASS = 37

public val HalQueryUnused0001: HAL_QUERY_INFORMATION_CLASS = 48

public val HalRegisterSecondaryInterruptInterface: HAL_SET_INFORMATION_CLASS = 13

public val HalSecondaryInterruptInformation: HAL_QUERY_INFORMATION_CLASS = 28

public val HalSetChannelPowerInformation: HAL_SET_INFORMATION_CLASS = 14

public val HalSetClockTimerMinimumInterval: HAL_SET_INFORMATION_CLASS = 23

public val HalSetHvciEnabled: HAL_SET_INFORMATION_CLASS = 18

public val HalSetProcessorTraceInterruptHandler: HAL_SET_INFORMATION_CLASS = 19

public val HalSetPsciSuspendMode: HAL_SET_INFORMATION_CLASS = 17

public val HalSetResetParkDisposition: HAL_SET_INFORMATION_CLASS = 16

public val HalSetSwInterruptHandler: HAL_SET_INFORMATION_CLASS = 22

public val HighImportance: KDPC_IMPORTANCE = 2

public val HighPagePriority: MM_PAGE_PRIORITY = 32

public val HighPoolPriority: EX_POOL_PRIORITY = 32

public val HighPoolPrioritySpecialPoolOverrun: EX_POOL_PRIORITY = 40

public val HighPoolPrioritySpecialPoolUnderrun: EX_POOL_PRIORITY = 41

public val HotSpareControl: NPEM_CONTROL_STANDARD_CONTROL_BIT = 7

public val HyperCriticalWorkQueue: WORK_QUEUE_TYPE = 2

public val IMAGE_ADDRESSING_MODE_32BIT: UInt = 3u

public val INITIAL_PRIVILEGE_COUNT: UInt = 3u

public val INIT_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0xcc5263e89308454auL, 0x89d0340bd39bc98euL))

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

public val IPF_SAL_RECORD_SECTION_GUID: GUID = GUID.from_u128(U128(0x6f3380d16eb0497fuL, 0xa5784d4c65a71617uL))

public val IPI_LEVEL: UInt = 29u

public val IPMI_MSR_DUMP_SECTION_GUID: GUID = GUID.from_u128(U128(0x1c15b4459b064667uL, 0xac2533c056b88803uL))

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

public val InACriticalArrayControl: NPEM_CONTROL_STANDARD_CONTROL_BIT = 8

public val InAFailedArrayControl: NPEM_CONTROL_STANDARD_CONTROL_BIT = 9

public val IndicatorBlink: PCI_EXPRESS_INDICATOR_STATE = 2

public val IndicatorOff: PCI_EXPRESS_INDICATOR_STATE = 3

public val IndicatorOn: PCI_EXPRESS_INDICATOR_STATE = 1

public val InitiateReset: NPEM_CONTROL_STANDARD_CONTROL_BIT = 1

public val InstallStateFailedInstall: DEVICE_INSTALL_STATE = 2

public val InstallStateFinishInstall: DEVICE_INSTALL_STATE = 3

public val InstallStateInstalled: DEVICE_INSTALL_STATE = 0

public val InstallStateNeedsReinstall: DEVICE_INSTALL_STATE = 1

public val IntelCacheData: INTEL_CACHE_TYPE = 1

public val IntelCacheInstruction: INTEL_CACHE_TYPE = 2

public val IntelCacheNull: INTEL_CACHE_TYPE = 0

public val IntelCacheRam: INTEL_CACHE_TYPE = 4

public val IntelCacheTrace: INTEL_CACHE_TYPE = 5

public val IntelCacheUnified: INTEL_CACHE_TYPE = 3

public val InterfaceTypeUndefined: INTERFACE_TYPE = -1

public val Internal: INTERFACE_TYPE = 0

public val InternalPowerBus: INTERFACE_TYPE = 13

public val InterruptActiveBoth: KINTERRUPT_POLARITY = 3

public val InterruptActiveBothTriggerHigh: KINTERRUPT_POLARITY = 4

public val InterruptActiveBothTriggerLow: KINTERRUPT_POLARITY = 3

public val InterruptActiveHigh: KINTERRUPT_POLARITY = 1

public val InterruptActiveLow: KINTERRUPT_POLARITY = 2

public val InterruptFallingEdge: KINTERRUPT_POLARITY = 2

public val InterruptPolarityUnknown: KINTERRUPT_POLARITY = 0

public val InterruptRisingEdge: KINTERRUPT_POLARITY = 1

public val InvalidDeviceTypeControl: NPEM_CONTROL_STANDARD_CONTROL_BIT = 10

public val IoMaxContainerInformationClass: IO_CONTAINER_INFORMATION_CLASS = 1

public val IoMaxContainerNotificationClass: IO_CONTAINER_NOTIFICATION_CLASS = 1

public val IoModifyAccess: LOCK_OPERATION = 2

public val IoPagingPriorityHigh: IO_PAGING_PRIORITY = 2

public val IoPagingPriorityInvalid: IO_PAGING_PRIORITY = 0

public val IoPagingPriorityNormal: IO_PAGING_PRIORITY = 1

public val IoPagingPriorityReserved1: IO_PAGING_PRIORITY = 3

public val IoPagingPriorityReserved2: IO_PAGING_PRIORITY = 4

public val IoQueryDeviceComponentInformation: IO_QUERY_DEVICE_DATA_FORMAT = 2

public val IoQueryDeviceConfigurationData: IO_QUERY_DEVICE_DATA_FORMAT = 1

public val IoQueryDeviceIdentifier: IO_QUERY_DEVICE_DATA_FORMAT = 0

public val IoQueryDeviceMaxData: IO_QUERY_DEVICE_DATA_FORMAT = 3

public val IoReadAccess: LOCK_OPERATION = 0

public val IoSessionEventConnected: IO_SESSION_EVENT = 3

public val IoSessionEventCreated: IO_SESSION_EVENT = 1

public val IoSessionEventDisconnected: IO_SESSION_EVENT = 4

public val IoSessionEventIgnore: IO_SESSION_EVENT = 0

public val IoSessionEventLogoff: IO_SESSION_EVENT = 6

public val IoSessionEventLogon: IO_SESSION_EVENT = 5

public val IoSessionEventMax: IO_SESSION_EVENT = 7

public val IoSessionEventTerminated: IO_SESSION_EVENT = 2

public val IoSessionStateConnected: IO_SESSION_STATE = 3

public val IoSessionStateCreated: IO_SESSION_STATE = 1

public val IoSessionStateDisconnected: IO_SESSION_STATE = 4

public val IoSessionStateDisconnectedLoggedOn: IO_SESSION_STATE = 5

public val IoSessionStateInformation: IO_CONTAINER_INFORMATION_CLASS = 0

public val IoSessionStateInitialized: IO_SESSION_STATE = 2

public val IoSessionStateLoggedOff: IO_SESSION_STATE = 7

public val IoSessionStateLoggedOn: IO_SESSION_STATE = 6

public val IoSessionStateMax: IO_SESSION_STATE = 9

public val IoSessionStateNotification: IO_CONTAINER_NOTIFICATION_CLASS = 0

public val IoSessionStateTerminated: IO_SESSION_STATE = 8

public val IoWriteAccess: LOCK_OPERATION = 1

public val IommuDeviceCreationConfigTypeAcpi: IOMMU_DEVICE_CREATION_CONFIGURATION_TYPE = 1

public val IommuDeviceCreationConfigTypeDeviceId: IOMMU_DEVICE_CREATION_CONFIGURATION_TYPE = 2

public val IommuDeviceCreationConfigTypeMax: IOMMU_DEVICE_CREATION_CONFIGURATION_TYPE = 3

public val IommuDeviceCreationConfigTypeNone: IOMMU_DEVICE_CREATION_CONFIGURATION_TYPE = 0

public val IommuDmaLogicalAllocatorBuddy: IOMMU_DMA_LOGICAL_ALLOCATOR_TYPE = 1

public val IommuDmaLogicalAllocatorMax: IOMMU_DMA_LOGICAL_ALLOCATOR_TYPE = 2

public val IommuDmaLogicalAllocatorNone: IOMMU_DMA_LOGICAL_ALLOCATOR_TYPE = 0

public val IrqPolicyAllCloseProcessors: IRQ_DEVICE_POLICY = 1

public val IrqPolicyAllProcessorsInMachine: IRQ_DEVICE_POLICY = 3

public val IrqPolicyAllProcessorsInMachineWhenSteered: IRQ_DEVICE_POLICY = 6

public val IrqPolicyMachineDefault: IRQ_DEVICE_POLICY = 0

public val IrqPolicyOneCloseProcessor: IRQ_DEVICE_POLICY = 2

public val IrqPolicySpecifiedProcessors: IRQ_DEVICE_POLICY = 4

public val IrqPolicySpreadMessagesAcrossAllProcessors: IRQ_DEVICE_POLICY = 5

public val IrqPriorityHigh: IRQ_PRIORITY = 3

public val IrqPriorityLow: IRQ_PRIORITY = 1

public val IrqPriorityNormal: IRQ_PRIORITY = 2

public val IrqPriorityUndefined: IRQ_PRIORITY = 0

public val Isa: INTERFACE_TYPE = 1

public val IsochCommand: EXTENDED_AGP_REGISTER = 6

public val IsochStatus: EXTENDED_AGP_REGISTER = 0

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

public val KD_OPTION_SET_BLOCK_ENABLE: KD_OPTION = 0

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

public val KbCallbackAddPages: KBUGCHECK_CALLBACK_REASON = 4

public val KbCallbackDumpIo: KBUGCHECK_CALLBACK_REASON = 3

public val KbCallbackInvalid: KBUGCHECK_CALLBACK_REASON = 0

public val KbCallbackRemovePages: KBUGCHECK_CALLBACK_REASON = 6

public val KbCallbackReserved1: KBUGCHECK_CALLBACK_REASON = 1

public val KbCallbackReserved2: KBUGCHECK_CALLBACK_REASON = 8

public val KbCallbackSecondaryDumpData: KBUGCHECK_CALLBACK_REASON = 2

public val KbCallbackSecondaryMultiPartDumpData: KBUGCHECK_CALLBACK_REASON = 5

public val KbCallbackTriageDumpData: KBUGCHECK_CALLBACK_REASON = 7

public val KbDumpIoBody: KBUGCHECK_DUMP_IO_TYPE = 2

public val KbDumpIoComplete: KBUGCHECK_DUMP_IO_TYPE = 4

public val KbDumpIoHeader: KBUGCHECK_DUMP_IO_TYPE = 1

public val KbDumpIoInvalid: KBUGCHECK_DUMP_IO_TYPE = 0

public val KbDumpIoSecondaryData: KBUGCHECK_DUMP_IO_TYPE = 3

public val KdConfigureDeviceAndContinue: KD_CALLBACK_ACTION = 0

public val KdConfigureDeviceAndStop: KD_CALLBACK_ACTION = 2

public val KdNameSpaceACPI: KD_NAMESPACE_ENUM = 1

public val KdNameSpaceAny: KD_NAMESPACE_ENUM = 2

public val KdNameSpaceMax: KD_NAMESPACE_ENUM = 4

public val KdNameSpaceNone: KD_NAMESPACE_ENUM = 3

public val KdNameSpacePCI: KD_NAMESPACE_ENUM = 0

public val KdSkipDeviceAndContinue: KD_CALLBACK_ACTION = 1

public val KdSkipDeviceAndStop: KD_CALLBACK_ACTION = 3

public val KeProcessorAddCompleteNotify: KE_PROCESSOR_CHANGE_NOTIFY_STATE = 1

public val KeProcessorAddFailureNotify: KE_PROCESSOR_CHANGE_NOTIFY_STATE = 2

public val KeProcessorAddStartNotify: KE_PROCESSOR_CHANGE_NOTIFY_STATE = 0

public val KeepObject: IO_ALLOCATION_ACTION = 1

public val KernelMode: MODE = 0

public val KeyboardController: CONFIGURATION_TYPE = 22

public val KeyboardPeripheral: CONFIGURATION_TYPE = 32

public val L0sAndL1EntryDisabled: PCI_EXPRESS_ASPM_CONTROL = 0

public val L0sAndL1EntryEnabled: PCI_EXPRESS_ASPM_CONTROL = 3

public val L0sAndL1EntrySupport: PCI_EXPRESS_ASPM_SUPPORT = 3

public val L0sEntryEnabled: PCI_EXPRESS_ASPM_CONTROL = 1

public val L0sEntrySupport: PCI_EXPRESS_ASPM_SUPPORT = 1

public val L0s_128ns_256ns: PCI_EXPRESS_L0s_EXIT_LATENCY = 2

public val L0s_1us_2us: PCI_EXPRESS_L0s_EXIT_LATENCY = 5

public val L0s_256ns_512ns: PCI_EXPRESS_L0s_EXIT_LATENCY = 3

public val L0s_2us_4us: PCI_EXPRESS_L0s_EXIT_LATENCY = 6

public val L0s_512ns_1us: PCI_EXPRESS_L0s_EXIT_LATENCY = 4

public val L0s_64ns_128ns: PCI_EXPRESS_L0s_EXIT_LATENCY = 1

public val L0s_Above4us: PCI_EXPRESS_L0s_EXIT_LATENCY = 7

public val L0s_Below64ns: PCI_EXPRESS_L0s_EXIT_LATENCY = 0

public val L1EntryEnabled: PCI_EXPRESS_ASPM_CONTROL = 2

public val L1EntrySupport: PCI_EXPRESS_ASPM_SUPPORT = 2

public val L1_16us_32us: PCI_EXPRESS_L1_EXIT_LATENCY = 5

public val L1_1us_2us: PCI_EXPRESS_L1_EXIT_LATENCY = 1

public val L1_2us_4us: PCI_EXPRESS_L1_EXIT_LATENCY = 2

public val L1_32us_64us: PCI_EXPRESS_L1_EXIT_LATENCY = 6

public val L1_4us_8us: PCI_EXPRESS_L1_EXIT_LATENCY = 3

public val L1_8us_16us: PCI_EXPRESS_L1_EXIT_LATENCY = 4

public val L1_Above64us: PCI_EXPRESS_L1_EXIT_LATENCY = 7

public val L1_Below1us: PCI_EXPRESS_L1_EXIT_LATENCY = 0

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

public val LastDStateTransitionD3cold: D3COLD_LAST_TRANSITION_STATUS = 2

public val LastDStateTransitionD3hot: D3COLD_LAST_TRANSITION_STATUS = 1

public val LastDStateTransitionStatusUnknown: D3COLD_LAST_TRANSITION_STATUS = 0

public val LastDrvRtFlag: DRIVER_RUNTIME_INIT_FLAGS = 2

public val Latched: KINTERRUPT_MODE = 1

public val LevelSensitive: KINTERRUPT_MODE = 0

public val LinePeripheral: CONFIGURATION_TYPE = 35

public val LocateControl: NPEM_CONTROL_STANDARD_CONTROL_BIT = 3

public val LocationTypeFileSystem: STATE_LOCATION_TYPE = 1

public val LocationTypeMaximum: STATE_LOCATION_TYPE = 2

public val LocationTypeRegistry: STATE_LOCATION_TYPE = 0

public val LoggerEventsLoggedClass: TRACE_INFORMATION_CLASS = 10

public val LoggerEventsLostClass: TRACE_INFORMATION_CLASS = 8

public val LowImportance: KDPC_IMPORTANCE = 0

public val LowPagePriority: MM_PAGE_PRIORITY = 0

public val LowPoolPriority: EX_POOL_PRIORITY = 0

public val LowPoolPrioritySpecialPoolOverrun: EX_POOL_PRIORITY = 8

public val LowPoolPrioritySpecialPoolUnderrun: EX_POOL_PRIORITY = 9

public val MAXIMUM_DEBUG_BARS: UInt = 6u

public val MAXIMUM_FILENAME_LENGTH: UInt = 256u

public val MAXIMUM_PRIORITY: UInt = 32u

public val MAX_EVENT_COUNTERS: UInt = 31u

public val MCA_EXTREG_V2MAX: UInt = 24u

public val MCE_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0xe8f56ffe919c4cc5uL, 0xba8865abe14913bbuL))

public val MDL_ALLOCATED_FIXED_SIZE: UInt = 8u

public val MDL_DESCRIBES_AWE: UInt = 1024u

public val MDL_FREE_EXTRA_PTES: UInt = 512u

public val MDL_INTERNAL: UInt = 32768u

public val MDL_LOCKED_PAGE_TABLES: UInt = 256u

public val MDL_PAGE_CONTENTS_INVARIANT: UInt = 16384u

public val MEMORY_CORRECTABLE_ERROR_SUMMARY_SECTION_GUID: GUID = GUID.from_u128(U128(0xe36c93eca154a83uL, 0xba8acbe80f7f0017uL))

public val MEMORY_ERROR_SECTION_GUID: GUID = GUID.from_u128(U128(0xa5bc11146f644edeuL, 0xb8633e83ed7c83b1uL))

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

public val MPIBus: INTERFACE_TYPE = 10

public val MPIConfiguration: BUS_DATA_TYPE = 8

public val MPSABus: INTERFACE_TYPE = 11

public val MPSAConfiguration: BUS_DATA_TYPE = 9

public val MRLClosed: PCI_EXPRESS_MRL_STATE = 0

public val MRLOpen: PCI_EXPRESS_MRL_STATE = 1

public val MU_TELEMETRY_SECTION_GUID: GUID = GUID.from_u128(U128(0x85183a8b9c41429cuL, 0x939c5c3c087ca280uL))

public val MapPhysicalAddressTypeContiguousRange: IOMMU_MAP_PHYSICAL_ADDRESS_TYPE = 1

public val MapPhysicalAddressTypeMax: IOMMU_MAP_PHYSICAL_ADDRESS_TYPE = 3

public val MapPhysicalAddressTypeMdl: IOMMU_MAP_PHYSICAL_ADDRESS_TYPE = 0

public val MapPhysicalAddressTypePfn: IOMMU_MAP_PHYSICAL_ADDRESS_TYPE = 2

public val MaxFaultType: FAULT_INFORMATION_ARM64_TYPE = 7

public val MaxHardwareCounterType: HARDWARE_COUNTER_TYPE = 1

public val MaxPayload1024Bytes: PCI_EXPRESS_MAX_PAYLOAD_SIZE = 3

public val MaxPayload128Bytes: PCI_EXPRESS_MAX_PAYLOAD_SIZE = 0

public val MaxPayload2048Bytes: PCI_EXPRESS_MAX_PAYLOAD_SIZE = 4

public val MaxPayload256Bytes: PCI_EXPRESS_MAX_PAYLOAD_SIZE = 1

public val MaxPayload4096Bytes: PCI_EXPRESS_MAX_PAYLOAD_SIZE = 5

public val MaxPayload512Bytes: PCI_EXPRESS_MAX_PAYLOAD_SIZE = 2

public val MaxRegNtNotifyClass: REG_NOTIFY_CLASS = 51

public val MaxSubsystemInformationType: SUBSYSTEM_INFORMATION_TYPE = 2

public val MaxTraceInformationClass: TRACE_INFORMATION_CLASS = 16

public val MaximumBusDataType: BUS_DATA_TYPE = 12

public val MaximumDmaSpeed: DMA_SPEED = 5

public val MaximumDmaWidth: DMA_WIDTH = 5

public val MaximumInterfaceType: INTERFACE_TYPE = 18

public val MaximumMode: MODE = 2

public val MaximumType: CONFIGURATION_TYPE = 41

public val MaximumWaitReason: KWAIT_REASON = 42

public val MaximumWorkQueue: WORK_QUEUE_TYPE = 7

public val MdlMappingNoExecute: UInt = 1073741824u

public val MdlMappingNoWrite: UInt = 2147483648u

public val MdlMappingWithGuardPtes: UInt = 536870912u

public val MediumHighImportance: KDPC_IMPORTANCE = 3

public val MediumImportance: KDPC_IMPORTANCE = 1

public val MemDedicatedAttributeMax: MEM_DEDICATED_ATTRIBUTE_TYPE = 4

public val MemDedicatedAttributeReadBandwidth: MEM_DEDICATED_ATTRIBUTE_TYPE = 0

public val MemDedicatedAttributeReadLatency: MEM_DEDICATED_ATTRIBUTE_TYPE = 1

public val MemDedicatedAttributeWriteBandwidth: MEM_DEDICATED_ATTRIBUTE_TYPE = 2

public val MemDedicatedAttributeWriteLatency: MEM_DEDICATED_ATTRIBUTE_TYPE = 3

public val MemSectionExtendedParameterInvalidType: MEM_SECTION_EXTENDED_PARAMETER_TYPE = 0

public val MemSectionExtendedParameterMax: MEM_SECTION_EXTENDED_PARAMETER_TYPE = 4

public val MemSectionExtendedParameterNumaNode: MEM_SECTION_EXTENDED_PARAMETER_TYPE = 2

public val MemSectionExtendedParameterSigningLevel: MEM_SECTION_EXTENDED_PARAMETER_TYPE = 3

public val MemSectionExtendedParameterUserPhysicalFlags: MEM_SECTION_EXTENDED_PARAMETER_TYPE = 1

public val MicroChannel: INTERFACE_TYPE = 3

public val MmCached: MEMORY_CACHING_TYPE = 1

public val MmFrameBufferCached: MEMORY_CACHING_TYPE_ORIG = 2

public val MmHardwareCoherentCached: MEMORY_CACHING_TYPE = 3

public val MmLargeSystem: MM_SYSTEMSIZE = 2

public val MmMaximumCacheType: MEMORY_CACHING_TYPE = 6

public val MmMaximumRotateDirection: MM_ROTATE_DIRECTION = 4

public val MmMdlPageContentsDynamic: MM_MDL_PAGE_CONTENTS_STATE = 0

public val MmMdlPageContentsInvariant: MM_MDL_PAGE_CONTENTS_STATE = 1

public val MmMdlPageContentsQuery: MM_MDL_PAGE_CONTENTS_STATE = 2

public val MmMediumSystem: MM_SYSTEMSIZE = 1

public val MmNonCached: MEMORY_CACHING_TYPE = 0

public val MmNonCachedUnordered: MEMORY_CACHING_TYPE = 4

public val MmNotMapped: MEMORY_CACHING_TYPE = -1

public val MmSmallSystem: MM_SYSTEMSIZE = 0

public val MmToFrameBuffer: MM_ROTATE_DIRECTION = 0

public val MmToFrameBufferNoCopy: MM_ROTATE_DIRECTION = 1

public val MmToRegularMemory: MM_ROTATE_DIRECTION = 2

public val MmToRegularMemoryNoCopy: MM_ROTATE_DIRECTION = 3

public val MmUSWCCached: MEMORY_CACHING_TYPE = 5

public val MmWriteCombined: MEMORY_CACHING_TYPE = 2

public val ModemPeripheral: CONFIGURATION_TYPE = 28

public val ModifyAccess: IO_ACCESS_TYPE = 2

public val MonitorPeripheral: CONFIGURATION_TYPE = 29

public val MonitorRequestReasonAcDcDisplayBurst: POWER_MONITOR_REQUEST_REASON = 5

public val MonitorRequestReasonAcDcDisplayBurstSuppressed: POWER_MONITOR_REQUEST_REASON = 28

public val MonitorRequestReasonBatteryCountChange: POWER_MONITOR_REQUEST_REASON = 16

public val MonitorRequestReasonBatteryCountChangeSuppressed: POWER_MONITOR_REQUEST_REASON = 49

public val MonitorRequestReasonBatteryPreCritical: POWER_MONITOR_REQUEST_REASON = 53

public val MonitorRequestReasonBuiltinPanel: POWER_MONITOR_REQUEST_REASON = 47

public val MonitorRequestReasonDP: POWER_MONITOR_REQUEST_REASON = 19

public val MonitorRequestReasonDim: POWER_MONITOR_REQUEST_REASON = 46

public val MonitorRequestReasonDirectedDrips: POWER_MONITOR_REQUEST_REASON = 45

public val MonitorRequestReasonDisplayRequiredUnDim: POWER_MONITOR_REQUEST_REASON = 48

public val MonitorRequestReasonFullWake: POWER_MONITOR_REQUEST_REASON = 9

public val MonitorRequestReasonGracePeriod: POWER_MONITOR_REQUEST_REASON = 17

public val MonitorRequestReasonIdleTimeout: POWER_MONITOR_REQUEST_REASON = 12

public val MonitorRequestReasonLid: POWER_MONITOR_REQUEST_REASON = 15

public val MonitorRequestReasonMax: POWER_MONITOR_REQUEST_REASON = 55

public val MonitorRequestReasonNearProximity: POWER_MONITOR_REQUEST_REASON = 22

public val MonitorRequestReasonPdcSignal: POWER_MONITOR_REQUEST_REASON = 27

public val MonitorRequestReasonPdcSignalFingerprint: POWER_MONITOR_REQUEST_REASON = 44

public val MonitorRequestReasonPdcSignalHeyCortana: POWER_MONITOR_REQUEST_REASON = 42

public val MonitorRequestReasonPdcSignalHolographicShell: POWER_MONITOR_REQUEST_REASON = 43

public val MonitorRequestReasonPdcSignalSensorsHumanPresence: POWER_MONITOR_REQUEST_REASON = 52

public val MonitorRequestReasonPdcSignalWindowsMobilePwrNotif: POWER_MONITOR_REQUEST_REASON = 40

public val MonitorRequestReasonPdcSignalWindowsMobileShell: POWER_MONITOR_REQUEST_REASON = 41

public val MonitorRequestReasonPnP: POWER_MONITOR_REQUEST_REASON = 18

public val MonitorRequestReasonPoSetSystemState: POWER_MONITOR_REQUEST_REASON = 7

public val MonitorRequestReasonPolicyChange: POWER_MONITOR_REQUEST_REASON = 13

public val MonitorRequestReasonPowerButton: POWER_MONITOR_REQUEST_REASON = 1

public val MonitorRequestReasonRemoteConnection: POWER_MONITOR_REQUEST_REASON = 2

public val MonitorRequestReasonResumeModernStandby: POWER_MONITOR_REQUEST_REASON = 50

public val MonitorRequestReasonResumePdc: POWER_MONITOR_REQUEST_REASON = 24

public val MonitorRequestReasonResumeS4: POWER_MONITOR_REQUEST_REASON = 25

public val MonitorRequestReasonScMonitorpower: POWER_MONITOR_REQUEST_REASON = 3

public val MonitorRequestReasonScreenOffRequest: POWER_MONITOR_REQUEST_REASON = 11

public val MonitorRequestReasonSessionUnlock: POWER_MONITOR_REQUEST_REASON = 10

public val MonitorRequestReasonSetThreadExecutionState: POWER_MONITOR_REQUEST_REASON = 8

public val MonitorRequestReasonSleepButton: POWER_MONITOR_REQUEST_REASON = 14

public val MonitorRequestReasonSxTransition: POWER_MONITOR_REQUEST_REASON = 20

public val MonitorRequestReasonSystemIdle: POWER_MONITOR_REQUEST_REASON = 21

public val MonitorRequestReasonSystemStateEntered: POWER_MONITOR_REQUEST_REASON = 29

public val MonitorRequestReasonTerminal: POWER_MONITOR_REQUEST_REASON = 26

public val MonitorRequestReasonTerminalInit: POWER_MONITOR_REQUEST_REASON = 51

public val MonitorRequestReasonThermalStandby: POWER_MONITOR_REQUEST_REASON = 23

public val MonitorRequestReasonUnknown: POWER_MONITOR_REQUEST_REASON = 0

public val MonitorRequestReasonUserDisplayBurst: POWER_MONITOR_REQUEST_REASON = 6

public val MonitorRequestReasonUserInput: POWER_MONITOR_REQUEST_REASON = 4

public val MonitorRequestReasonUserInputAccelerometer: POWER_MONITOR_REQUEST_REASON = 35

public val MonitorRequestReasonUserInputHid: POWER_MONITOR_REQUEST_REASON = 36

public val MonitorRequestReasonUserInputInitialization: POWER_MONITOR_REQUEST_REASON = 39

public val MonitorRequestReasonUserInputKeyboard: POWER_MONITOR_REQUEST_REASON = 31

public val MonitorRequestReasonUserInputMouse: POWER_MONITOR_REQUEST_REASON = 32

public val MonitorRequestReasonUserInputPen: POWER_MONITOR_REQUEST_REASON = 34

public val MonitorRequestReasonUserInputPoUserPresent: POWER_MONITOR_REQUEST_REASON = 37

public val MonitorRequestReasonUserInputSessionSwitch: POWER_MONITOR_REQUEST_REASON = 38

public val MonitorRequestReasonUserInputTouch: POWER_MONITOR_REQUEST_REASON = 54

public val MonitorRequestReasonUserInputTouchpad: POWER_MONITOR_REQUEST_REASON = 33

public val MonitorRequestReasonWinrt: POWER_MONITOR_REQUEST_REASON = 30

public val MonitorRequestTypeOff: POWER_MONITOR_REQUEST_TYPE = 0

public val MonitorRequestTypeOnAndPresent: POWER_MONITOR_REQUEST_TYPE = 1

public val MonitorRequestTypeToggleOn: POWER_MONITOR_REQUEST_TYPE = 2

public val MultiFunctionAdapter: CONFIGURATION_TYPE = 12

public val NEC98x86: ALTERNATIVE_ARCHITECTURE_TYPE = 1

public val NMI_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x5bad89ffb7e642c9uL, 0x814acf2485d6e98auL))

public val NMI_SECTION_GUID: GUID = GUID.from_u128(U128(0xe71254e7c1b94940uL, 0xab76909703a4320fuL))

public val NPEM_CONTROL_INTERFACE_CURRENT_VERSION: UInt = 2u

public val NPEM_CONTROL_INTERFACE_VERSION1: UInt = 1u

public val NPEM_CONTROL_INTERFACE_VERSION2: UInt = 2u

public val NT_PAGING_LEVELS: UInt = 2u

public val NX_SUPPORT_POLICY_ALWAYSOFF: UInt = 0u

public val NX_SUPPORT_POLICY_ALWAYSON: UInt = 1u

public val NX_SUPPORT_POLICY_OPTIN: UInt = 2u

public val NX_SUPPORT_POLICY_OPTOUT: UInt = 3u

public val NetworkController: CONFIGURATION_TYPE = 18

public val NetworkPeripheral: CONFIGURATION_TYPE = 36

public val NoAspmSupport: PCI_EXPRESS_ASPM_SUPPORT = 0

public val NormalPagePriority: MM_PAGE_PRIORITY = 16

public val NormalPoolPriority: EX_POOL_PRIORITY = 16

public val NormalPoolPrioritySpecialPoolOverrun: EX_POOL_PRIORITY = 24

public val NormalPoolPrioritySpecialPoolUnderrun: EX_POOL_PRIORITY = 25

public val NormalWorkQueue: WORK_QUEUE_TYPE = 3

public val NuBus: INTERFACE_TYPE = 7

public val NuBusConfiguration: BUS_DATA_TYPE = 6

public val OBJECT_TYPE_CREATE: UInt = 1u

public val OB_FLT_REGISTRATION_VERSION: UInt = 256u

public val OB_FLT_REGISTRATION_VERSION_0100: UInt = 256u

public val OB_OPERATION_HANDLE_CREATE: UInt = 1u

public val OB_OPERATION_HANDLE_DUPLICATE: UInt = 2u

public val OB_PREOP_SUCCESS: OB_PREOP_CALLBACK_STATUS = 0

public val OPLOCK_KEY_FLAG_PARENT_KEY: UInt = 1u

public val OPLOCK_KEY_FLAG_TARGET_KEY: UInt = 2u

public val OPLOCK_KEY_VERSION_WIN7: UInt = 1u

public val OPLOCK_KEY_VERSION_WIN8: UInt = 2u

public val OSC_CAPABILITIES_MASKED: UInt = 16u

public val OSC_FIRMWARE_FAILURE: UInt = 2u

public val OSC_UNRECOGNIZED_REVISION: UInt = 8u

public val OSC_UNRECOGNIZED_UUID: UInt = 4u

public val OkControl: NPEM_CONTROL_STANDARD_CONTROL_BIT = 2

public val OtherController: CONFIGURATION_TYPE = 24

public val OtherPeripheral: CONFIGURATION_TYPE = 34

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

public val PCIBus: INTERFACE_TYPE = 5

public val PCIConfiguration: BUS_DATA_TYPE = 4

public val PCIEXPRESS_ERROR_SECTION_GUID: GUID = GUID.from_u128(U128(0xd995e954bbc1430fuL, 0xad91b44dcb3c6f35uL))

public val PCIE_CORRECTABLE_ERROR_SUMMARY_SECTION_GUID: GUID = GUID.from_u128(U128(0xe96eca9953e24f52uL, 0x9be7d2dbe9508ed0uL))

public val PCIXBUS_ERROR_SECTION_GUID: GUID = GUID.from_u128(U128(0xc57539633b844095uL, 0xbf78eddad3f9c9dduL))

public val PCIXBUS_ERRTYPE_ADDRESSPARITY: UInt = 6u

public val PCIXBUS_ERRTYPE_BUSTIMEOUT: UInt = 4u

public val PCIXBUS_ERRTYPE_COMMANDPARITY: UInt = 7u

public val PCIXBUS_ERRTYPE_DATAPARITY: UInt = 1u

public val PCIXBUS_ERRTYPE_MASTERABORT: UInt = 3u

public val PCIXBUS_ERRTYPE_MASTERDATAPARITY: UInt = 5u

public val PCIXBUS_ERRTYPE_SYSTEM: UInt = 2u

public val PCIXBUS_ERRTYPE_UNKNOWN: UInt = 0u

public val PCIXDEVICE_ERROR_SECTION_GUID: GUID = GUID.from_u128(U128(0xeb5e4685ca664769uL, 0xb6a226068b001326uL))

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
