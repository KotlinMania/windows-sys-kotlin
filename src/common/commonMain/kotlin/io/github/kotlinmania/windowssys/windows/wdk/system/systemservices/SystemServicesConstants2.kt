package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

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

public val PCI_RECOVERY_SECTION_GUID: Guid = Guid.fromU128(U128(0xdd060800f6e14204uL, 0xac27c4bca9568402uL))

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

public val PCI_STATUS_DATA_PARITY_DETECTED: UInt = 256u

public val PCI_STATUS_DETECTED_PARITY_ERROR: UInt = 32768u

public val PCI_STATUS_DEVSEL: UInt = 1536u

public val PCI_STATUS_FAST_BACK_TO_BACK: UInt = 128u

public val PCI_STATUS_IMMEDIATE_READINESS: UInt = 1u

public val PCI_STATUS_INTERRUPT_PENDING: UInt = 8u

public val PCI_STATUS_RECEIVED_MASTER_ABORT: UInt = 8192u

public val PCI_STATUS_RECEIVED_TARGET_ABORT: UInt = 4096u

public val PCI_STATUS_SIGNALED_SYSTEM_ERROR: UInt = 16384u

public val PCI_STATUS_SIGNALED_TARGET_ABORT: UInt = 2048u

public val PCI_STATUS_UDF_SUPPORTED: UInt = 64u

public val PCI_SUBCLASS_BR_CARDBUS: UInt = 7u

public val PCI_SUBCLASS_BR_EISA: UInt = 2u

public val PCI_SUBCLASS_BR_HOST: UInt = 0u

public val PCI_SUBCLASS_BR_ISA: UInt = 1u

public val PCI_SUBCLASS_BR_MCA: UInt = 3u

public val PCI_SUBCLASS_BR_NUBUS: UInt = 6u

public val PCI_SUBCLASS_BR_OTHER: UInt = 128u

public val PCI_SUBCLASS_BR_PCI_TO_PCI: UInt = 4u

public val PCI_SUBCLASS_BR_PCMCIA: UInt = 5u

public val PCI_SUBCLASS_BR_RACEWAY: UInt = 8u

public val PCI_SUBCLASS_COM_MODEM: UInt = 3u

public val PCI_SUBCLASS_COM_MULTIPORT: UInt = 2u

public val PCI_SUBCLASS_COM_OTHER: UInt = 128u

public val PCI_SUBCLASS_COM_PARALLEL: UInt = 1u

public val PCI_SUBCLASS_COM_SERIAL: UInt = 0u

public val PCI_SUBCLASS_CRYPTO_ENTERTAINMENT: UInt = 16u

public val PCI_SUBCLASS_CRYPTO_NET_COMP: UInt = 0u

public val PCI_SUBCLASS_CRYPTO_OTHER: UInt = 128u

public val PCI_SUBCLASS_DASP_DPIO: UInt = 0u

public val PCI_SUBCLASS_DASP_OTHER: UInt = 128u

public val PCI_SUBCLASS_DOC_GENERIC: UInt = 0u

public val PCI_SUBCLASS_DOC_OTHER: UInt = 128u

public val PCI_SUBCLASS_INP_DIGITIZER: UInt = 1u

public val PCI_SUBCLASS_INP_GAMEPORT: UInt = 4u

public val PCI_SUBCLASS_INP_KEYBOARD: UInt = 0u

public val PCI_SUBCLASS_INP_MOUSE: UInt = 2u

public val PCI_SUBCLASS_INP_OTHER: UInt = 128u

public val PCI_SUBCLASS_INP_SCANNER: UInt = 3u

public val PCI_SUBCLASS_INTIO_I2O: UInt = 0u

public val PCI_SUBCLASS_MEM_FLASH: UInt = 1u

public val PCI_SUBCLASS_MEM_OTHER: UInt = 128u

public val PCI_SUBCLASS_MEM_RAM: UInt = 0u

public val PCI_SUBCLASS_MM_AUDIO_DEV: UInt = 1u

public val PCI_SUBCLASS_MM_OTHER: UInt = 128u

public val PCI_SUBCLASS_MM_TELEPHONY_DEV: UInt = 2u

public val PCI_SUBCLASS_MM_VIDEO_DEV: UInt = 0u

public val PCI_SUBCLASS_MSC_AHCI_CTLR: UInt = 6u

public val PCI_SUBCLASS_MSC_FLOPPY_CTLR: UInt = 2u

public val PCI_SUBCLASS_MSC_IDE_CTLR: UInt = 1u

public val PCI_SUBCLASS_MSC_IPI_CTLR: UInt = 3u

public val PCI_SUBCLASS_MSC_NVM_CTLR: UInt = 8u

public val PCI_SUBCLASS_MSC_OTHER: UInt = 128u

public val PCI_SUBCLASS_MSC_RAID_CTLR: UInt = 4u

public val PCI_SUBCLASS_MSC_SCSI_BUS_CTLR: UInt = 0u

public val PCI_SUBCLASS_NET_ATM_CTLR: UInt = 3u

public val PCI_SUBCLASS_NET_ETHERNET_CTLR: UInt = 0u

public val PCI_SUBCLASS_NET_FDDI_CTLR: UInt = 2u

public val PCI_SUBCLASS_NET_ISDN_CTLR: UInt = 4u

public val PCI_SUBCLASS_NET_OTHER: UInt = 128u

public val PCI_SUBCLASS_NET_TOKEN_RING_CTLR: UInt = 1u

public val PCI_SUBCLASS_PRE_20_NON_VGA: UInt = 0u

public val PCI_SUBCLASS_PRE_20_VGA: UInt = 1u

public val PCI_SUBCLASS_PROC_386: UInt = 0u

public val PCI_SUBCLASS_PROC_486: UInt = 1u

public val PCI_SUBCLASS_PROC_ALPHA: UInt = 16u

public val PCI_SUBCLASS_PROC_COPROCESSOR: UInt = 64u

public val PCI_SUBCLASS_PROC_PENTIUM: UInt = 2u

public val PCI_SUBCLASS_PROC_POWERPC: UInt = 32u

public val PCI_SUBCLASS_SAT_AUDIO: UInt = 2u

public val PCI_SUBCLASS_SAT_DATA: UInt = 4u

public val PCI_SUBCLASS_SAT_TV: UInt = 1u

public val PCI_SUBCLASS_SAT_VOICE: UInt = 3u

public val PCI_SUBCLASS_SB_ACCESS: UInt = 1u

public val PCI_SUBCLASS_SB_FIBRE_CHANNEL: UInt = 4u

public val PCI_SUBCLASS_SB_IEEE1394: UInt = 0u

public val PCI_SUBCLASS_SB_SMBUS: UInt = 5u

public val PCI_SUBCLASS_SB_SSA: UInt = 2u

public val PCI_SUBCLASS_SB_THUNDERBOLT: UInt = 10u

public val PCI_SUBCLASS_SB_USB: UInt = 3u

public val PCI_SUBCLASS_SYS_DMA_CTLR: UInt = 1u

public val PCI_SUBCLASS_SYS_GEN_HOTPLUG_CTLR: UInt = 4u

public val PCI_SUBCLASS_SYS_INTERRUPT_CTLR: UInt = 0u

public val PCI_SUBCLASS_SYS_OTHER: UInt = 128u

public val PCI_SUBCLASS_SYS_RCEC: UInt = 7u

public val PCI_SUBCLASS_SYS_REAL_TIME_CLOCK: UInt = 3u

public val PCI_SUBCLASS_SYS_SDIO_CTRL: UInt = 5u

public val PCI_SUBCLASS_SYS_SYSTEM_TIMER: UInt = 2u

public val PCI_SUBCLASS_VID_OTHER: UInt = 128u

public val PCI_SUBCLASS_VID_VGA_CTLR: UInt = 0u

public val PCI_SUBCLASS_VID_XGA_CTLR: UInt = 1u

public val PCI_SUBCLASS_WIRELESS_CON_IR: UInt = 1u

public val PCI_SUBCLASS_WIRELESS_IRDA: UInt = 0u

public val PCI_SUBCLASS_WIRELESS_OTHER: UInt = 128u

public val PCI_SUBCLASS_WIRELESS_RF: UInt = 16u

public val PCI_SUBLCASS_VID_3D_CTLR: UInt = 2u

public val PCI_TYPE0_ADDRESSES: UInt = 6u

public val PCI_TYPE1_ADDRESSES: UInt = 2u

public val PCI_TYPE2_ADDRESSES: UInt = 5u

public val PCI_TYPE_20BIT: UInt = 2u

public val PCI_TYPE_32BIT: UInt = 0u

public val PCI_TYPE_64BIT: UInt = 4u

public val PCI_USE_CLASS_SUBCLASS: UInt = 8u

public val PCI_USE_LOCAL_BUS: UInt = 32u

public val PCI_USE_LOCAL_DEVICE: UInt = 64u

public val PCI_USE_PROGIF: UInt = 16u

public val PCI_USE_REVISION: UInt = 2u

public val PCI_USE_SUBSYSTEM_IDS: UInt = 1u

public val PCI_USE_VENDEV_IDS: UInt = 4u

public val PCI_WHICHSPACE_CONFIG: UInt = 0u

public val PCI_WHICHSPACE_ROM: UInt = 1382638416u

public val PC_IE_NOTIFY_TYPE_GUID: Guid = Guid.fromU128(U128(0xcf93c01f1a164dfcuL, 0xb8bc9c4daf67c104uL))

public val PCMCIA_BUS: InterfaceType = 8

public val PCMCIA_CONFIGURATION: BusDataType = 7

public val PCR_BTI_MITIGATION_CSWAP_HVC: UInt = 16u

public val PCR_BTI_MITIGATION_CSWAP_SMC: UInt = 32u

public val PCR_BTI_MITIGATION_NONE: UInt = 0u

public val PCR_BTI_MITIGATION_VBAR_MASK: UInt = 15u

public val PCR_MAJOR_VERSION: UInt = 1u

public val PCR_MINOR_VERSION: UInt = 1u

public val PCW_CURRENT_VERSION: UInt = 512u

public val PCW_VERSION_1: UInt = 256u

public val PCW_VERSION_2: UInt = 512u

public val PDE_BASE: UInt = 3224371200u

public val PDE_PER_PAGE: UInt = 512u

public val PDE_TOP: UInt = 3224375295u

public val PDI_SHIFT: UInt = 21u

public val PEI_NOTIFY_TYPE_GUID: Guid = Guid.fromU128(U128(0x9a9d5ac52044214uL, 0x96e594992e752bcduL))

public val PFA_CONTROL: NpemControlStandardControlBit = 6

public val PLUGPLAY_PROPERTY_PERSISTENT: UInt = 1u

public val PLUGPLAY_REGKEY_CURRENT_HWPROFILE: UInt = 4u

public val PLUGPLAY_REGKEY_DEVICE: UInt = 1u

public val PLUGPLAY_REGKEY_DRIVER: UInt = 2u

public val PMC_COUNTER: HardwareCounterType = 0

public val PMEM_ERROR_SECTION_GUID: Guid = Guid.fromU128(U128(0x81687003dbfd4728uL, 0x9ffdf0904f97597duL))

public val PNP_BUS: InterfaceType = 15

public val PNPISA_BUS: InterfaceType = 14

public val PNPISA_CONFIGURATION: BusDataType = 10

public val PNPNOTIFY_DEVICE_INTERFACE_INCLUDE_EXISTING_INTERFACES: UInt = 1u

public val PNP_DEVICE_ASSIGNED_TO_GUEST: UInt = 256u

public val PNP_DEVICE_DISABLED: UInt = 1u

public val PNP_DEVICE_DISCONNECTED: UInt = 64u

public val PNP_DEVICE_DONT_DISPLAY_IN_UI: UInt = 2u

public val PNP_DEVICE_FAILED: UInt = 4u

public val PNP_DEVICE_NOT_DISABLEABLE: UInt = 32u

public val PNP_DEVICE_REMOVED: UInt = 8u

public val PNP_DEVICE_RESOURCE_REQUIREMENTS_CHANGED: UInt = 16u

public val PNP_DEVICE_RESOURCE_UPDATED: UInt = 128u

public val PNP_EXTENDED_ADDRESS_INTERFACE_VERSION: UInt = 1u

public val PNP_REPLACE_DRIVER_INTERFACE_VERSION: UInt = 1u

public val PNP_REPLACE_HARDWARE_MEMORY_MIRRORING: UInt = 4u

public val PNP_REPLACE_HARDWARE_PAGE_COPY: UInt = 8u

public val PNP_REPLACE_HARDWARE_QUIESCE: UInt = 16u

public val PNP_REPLACE_MEMORY_SUPPORTED: UInt = 1u

public val PNP_REPLACE_PARAMETERS_VERSION: UInt = 2u

public val PNP_REPLACE_PROCESSOR_SUPPORTED: UInt = 2u

public val POOL_COLD_ALLOCATION: UInt = 256u

public val POOL_CREATE_FLG_SECURE_POOL: UInt = 1u

public val POOL_CREATE_FLG_USE_GLOBAL_POOL: UInt = 2u

public val POOL_CREATE_PARAMS_VERSION: UInt = 1u

public val POOL_EXTENDED_PARAMETER_REQUIRED_FIELD_BITS: UInt = 1u

public val POOL_EXTENDED_PARAMETER_TYPE_BITS: UInt = 8u

public val POOL_NX_ALLOCATION: UInt = 512u

public val POOL_NX_OPTIN_AUTO: UInt = 1u

public val POOL_QUOTA_FAIL_INSTEAD_OF_RAISE: UInt = 8u

public val POOL_RAISE_IF_ALLOCATION_FAILURE: UInt = 16u

public val POOL_TAGGING: UInt = 1u

public val POOL_ZEROING_INFORMATION: UInt = 227u

public val POOL_ZERO_ALLOCATION: UInt = 1024u

public val PORT_MAXIMUM_MESSAGE_LENGTH: UInt = 512u

public val POWER_LEVEL: UInt = 30u

public val POWER_PLATFORM_ROLE_V1: UInt = 1u

public val POWER_PLATFORM_ROLE_V2: UInt = 2u

public val POWER_PLATFORM_ROLE_VERSION: UInt = 2u

public val POWER_SETTING_VALUE_VERSION: UInt = 1u

public val POWER_THROTTLING_PROCESS_CURRENT_VERSION: UInt = 1u

public val POWER_THROTTLING_PROCESS_DELAYTIMERS: UInt = 2u

public val POWER_THROTTLING_PROCESS_EXECUTION_SPEED: UInt = 1u

public val POWER_THROTTLING_PROCESS_IGNORE_TIMER_RESOLUTION: UInt = 4u

public val POWER_THROTTLING_THREAD_CURRENT_VERSION: UInt = 1u

public val POWER_THROTTLING_THREAD_EXECUTION_SPEED: UInt = 1u

public val POWER_THROTTLING_THREAD_VALID_FLAGS: UInt = 1u

public val PO_FX_COMPONENT_FLAG_F0_ON_DX: ULong = 1uL

public val PO_FX_COMPONENT_FLAG_NO_DEBOUNCE: ULong = 2uL

public val PO_FX_DIRECTED_FX_DEFAULT_IDLE_TIMEOUT: UInt = 0u

public val PO_FX_FLAG_ASYNC_ONLY: UInt = 2u

public val PO_FX_FLAG_BLOCKING: UInt = 1u

public val PO_FX_FLAG_PERF_PEP_OPTIONAL: UInt = 1u

public val PO_FX_FLAG_PERF_QUERY_ON_ALL_IDLE_STATES: UInt = 4u

public val PO_FX_FLAG_PERF_QUERY_ON_F0: UInt = 2u

public val PO_FX_UNKNOWN_POWER: UInt = 4294967295u

public val PO_FX_UNKNOWN_TIME: ULong = 18446744073709551615uL

public val PO_FX_VERSION: UInt = 1u

public val PO_FX_VERSION_V1: UInt = 1u

public val PO_FX_VERSION_V2: UInt = 2u

public val PO_FX_VERSION_V3: UInt = 3u

public val PO_MEM_BOOT_PHASE: UInt = 65536u

public val PO_MEM_CLONE: UInt = 2u

public val PO_MEM_CL_OR_NCHK: UInt = 4u

public val PO_MEM_DISCARD: UInt = 32768u

public val PO_MEM_PAGE_ADDRESS: UInt = 16384u

public val PO_MEM_PRESERVE: UInt = 1u

public val PPI_SHIFT: UInt = 30u

public val PRIVILEGE_SET_ALL_NECESSARY: UInt = 1u

public val PROCESSOR_FEATURE_MAX: UInt = 64u

public val PROCESSOR_GENERIC_ERROR_SECTION_GUID: Guid = Guid.fromU128(U128(0x9876ccad47b44bdbuL, 0xb65e16f193c4f3dbuL))

public val PROCESS_EXCEPTION_PORT_ALL_STATE_BITS: UInt = 3u

public val PROCESS_HANDLE_EXCEPTIONS_ENABLED: UInt = 1u

public val PROCESS_HANDLE_RAISE_UM_EXCEPTION_ON_INVALID_HANDLE_CLOSE_DISABLED: UInt = 0u

public val PROCESS_HANDLE_RAISE_UM_EXCEPTION_ON_INVALID_HANDLE_CLOSE_ENABLED: UInt = 1u

public val PROCESS_HANDLE_TRACING_MAX_STACKS: UInt = 16u

public val PROCESS_LUID_DOSDEVICES_ONLY: UInt = 1u

public val PROFILE_LEVEL: UInt = 27u

public val PROTECTED_POOL: UInt = 0u

public val PS_IMAGE_NOTIFY_CONFLICTING_ARCHITECTURE: UInt = 1u

public val PS_INVALID_SILO_CONTEXT_SLOT: UInt = 4294967295u

public val PTE_BASE: UInt = 3221225472u

public val PTE_PER_PAGE: UInt = 512u

public val PTE_TOP: UInt = 3225419775u

public val PTI_SHIFT: UInt = 12u

public val PAGE_IN: KwaitReason = 2

public val PARALLEL_CONTROLLER: ConfigurationType = 20

public val PCI_ACS_BIT_DISABLE: PciAcsBit = 2

public val PCI_ACS_BIT_DONT_CARE: PciAcsBit = 3

public val PCI_ACS_BIT_ENABLE: PciAcsBit = 1

public val PCI_ACS_RESERVED: PciAcsBit = 0

public val PCI_ADDRESS_PARITY_ERROR: UShort = 6u.toUShort()

public val PCI_BUS_DATA_PARITY_ERROR: UShort = 1u.toUShort()

public val PCI_BUS_MASTER_ABORT: UShort = 3u.toUShort()

public val PCI_BUS_SYSTEM_ERROR: UShort = 2u.toUShort()

public val PCI_BUS_TIME_OUT: UShort = 4u.toUShort()

public val PCI_BUS_UNKNOWN_ERROR: UShort = 0u.toUShort()

public val PCI_COMMAND_PARITY_ERROR: UShort = 7u.toUShort()

public val PCI_CONVENTIONAL: PciHardwareInterface = 0

public val PCI_DEVICE_D3COLD_REASON_DEFAULT_STATE_BIT_INDEX: PciDeviceD3coldStateReason = 8

public val PCI_DEVICE_D3COLD_REASON_INF_BIT_INDEX: PciDeviceD3coldStateReason = 9

public val PCI_DEVICE_D3COLD_REASON_INTERFACE_API_BIT_INDEX: PciDeviceD3coldStateReason = 10

public val PCI_DEVICE_D3COLD_STATE_DISABLED_BIT_INDEX: PciDeviceD3coldStateReason = 1

public val PCI_DEVICE_D3COLD_STATE_DISABLED_BRIDGE_HACK_FLAGS_BIT_INDEX: PciDeviceD3coldStateReason = 4

public val PCI_DEVICE_D3COLD_STATE_ENABLED_BIT_INDEX: PciDeviceD3coldStateReason = 2

public val PCI_DEVICE_D3COLD_STATE_PARENT_ROOT_PORT_S0WAKE_SUPPORTED_BIT_INDEX: PciDeviceD3coldStateReason = 3

public val PCI_EXPRESS: PciHardwareInterface = 3

public val PCI_EXPRESS_ASPM_LINK_SUB_STATE_L11_BIT_INDEX: PciExpressLinkSubstate = 2

public val PCI_EXPRESS_ASPM_LINK_SUB_STATE_L12_BIT_INDEX: PciExpressLinkSubstate = 3

public val PCI_EXPRESS_DOWNSTREAM_SWITCH_PORT: PciExpressDeviceType = 6

public val PCI_EXPRESS_ENDPOINT: PciExpressDeviceType = 0

public val PCI_EXPRESS_LEGACY_ENDPOINT: PciExpressDeviceType = 1

public val PCI_EXPRESS_PCI_PM_LINK_SUB_STATE_L11_BIT_INDEX: PciExpressLinkSubstate = 0

public val PCI_EXPRESS_PCI_PM_LINK_SUB_STATE_L12_BIT_INDEX: PciExpressLinkSubstate = 1

public val PCI_EXPRESS_ROOT_COMPLEX_EVENT_COLLECTOR: PciExpressDeviceType = 10

public val PCI_EXPRESS_ROOT_COMPLEX_INTEGRATED_ENDPOINT: PciExpressDeviceType = 9

public val PCI_EXPRESS_ROOT_PORT: PciExpressDeviceType = 4

public val PCI_EXPRESS_TO_PCI_X_BRIDGE: PciExpressDeviceType = 7

public val PCI_EXPRESS_UPSTREAM_SWITCH_PORT: PciExpressDeviceType = 5

public val PCI_MASTER_DATA_PARITY_ERROR: UShort = 5u.toUShort()

public val PCI_X_MODE1: PciHardwareInterface = 1

public val PCI_X_MODE2: PciHardwareInterface = 2

public val PCI_X_TO_EXPRESS_BRIDGE: PciExpressDeviceType = 8

public val PCW_CALLBACK_ADD_COUNTER: PcwCallbackType = 0

public val PCW_CALLBACK_COLLECT_DATA: PcwCallbackType = 3

public val PCW_CALLBACK_ENUMERATE_INSTANCES: PcwCallbackType = 2

public val PCW_CALLBACK_REMOVE_COUNTER: PcwCallbackType = 1

public val PCW_REGISTRATION_NONE: PcwRegistrationFlags = 0

public val PCW_REGISTRATION_SILO_NEUTRAL: PcwRegistrationFlags = 1

public val PERMISSION_FAULT: FaultInformationArm64Type = 4

public val PLATFORM_LEVEL_DEVICE_RESET: DeviceResetType = 1

public val PLATFORM_ROLE_APPLIANCE_PC: PowerPlatformRole = 6

public val PLATFORM_ROLE_DESKTOP: PowerPlatformRole = 1

public val PLATFORM_ROLE_ENTERPRISE_SERVER: PowerPlatformRole = 4

public val PLATFORM_ROLE_MAXIMUM: PowerPlatformRole = 9

public val PLATFORM_ROLE_MOBILE: PowerPlatformRole = 2

public val PLATFORM_ROLE_PERFORMANCE_SERVER: PowerPlatformRole = 7

public val PLATFORM_ROLE_SOHO_SERVER: PowerPlatformRole = 5

public val PLATFORM_ROLE_SLATE: PowerPlatformRole = 8

public val PLATFORM_ROLE_UNSPECIFIED: PowerPlatformRole = 0

public val PLATFORM_ROLE_WORKSTATION: PowerPlatformRole = 3

public val PO_AC: SystemPowerCondition = 0

public val PO_CONDITION_MAXIMUM: SystemPowerCondition = 3

public val PO_DC: SystemPowerCondition = 1

public val PO_FX_PERF_STATE_TYPE_DISCRETE: PoFxPerfStateType = 0

public val PO_FX_PERF_STATE_TYPE_MAXIMUM: PoFxPerfStateType = 2

public val PO_FX_PERF_STATE_TYPE_RANGE: PoFxPerfStateType = 1

public val PO_FX_PERF_STATE_UNIT_BANDWIDTH: PoFxPerfStateUnit = 2

public val PO_FX_PERF_STATE_UNIT_FREQUENCY: PoFxPerfStateUnit = 1

public val PO_FX_PERF_STATE_UNIT_MAXIMUM: PoFxPerfStateUnit = 3

public val PO_FX_PERF_STATE_UNIT_OTHER: PoFxPerfStateUnit = 0

public val PO_HOT: SystemPowerCondition = 2

public val PO_THERMAL_REQUEST_ACTIVE: PoThermalRequestType = 1

public val PO_THERMAL_REQUEST_PASSIVE: PoThermalRequestType = 0

public val POINTER_CONTROLLER: ConfigurationType = 21

public val POINTER_PERIPHERAL: ConfigurationType = 31

public val POOL_ALLOCATION: KwaitReason = 3

public val POOL_EXTENDED_PARAMETER_INVALID_TYPE: PoolExtendedParameterType = 0

public val POOL_EXTENDED_PARAMETER_MAX: PoolExtendedParameterType = 4

public val POOL_EXTENDED_PARAMETER_NUMA_NODE: PoolExtendedParameterType = 3

public val POOL_EXTENDED_PARAMETER_PRIORITY: PoolExtendedParameterType = 1

public val POOL_EXTENDED_PARAMETER_SECURE_POOL: PoolExtendedParameterType = 2

public val POS: BusDataType = 2

public val POWER_OFF: PciExpressPowerState = 1

public val POWER_ON: PciExpressPowerState = 0

public val POWER_RELATIONS: DeviceRelationType = 2

public val PRIMARY_DCACHE: ConfigurationType = 4

public val PRIMARY_ICACHE: ConfigurationType = 3

public val PRINTER_PERIPHERAL: ConfigurationType = 30

public val PROCESSOR_INTERNAL: InterfaceType = 12

public val PROFILE2ISSUE: KprofileSource = 15

public val PROFILE3ISSUE: KprofileSource = 16

public val PROFILE4ISSUE: KprofileSource = 17

public val PROFILE_ALIGNMENT_FIXUP: KprofileSource = 1

public val PROFILE_BRANCH_INSTRUCTIONS: KprofileSource = 6

public val PROFILE_BRANCH_MISPREDICTIONS: KprofileSource = 11

public val PROFILE_CACHE_MISSES: KprofileSource = 10

public val PROFILE_DCACHE_ACCESSES: KprofileSource = 21

public val PROFILE_DCACHE_MISSES: KprofileSource = 8

public val PROFILE_FP_INSTRUCTIONS: KprofileSource = 13

public val PROFILE_ICACHE_ISSUES: KprofileSource = 20

public val PROFILE_ICACHE_MISSES: KprofileSource = 9

public val PROFILE_INTEGER_INSTRUCTIONS: KprofileSource = 14

public val PROFILE_LOAD_INSTRUCTIONS: KprofileSource = 4

public val PROFILE_LOAD_LINKED_ISSUES: KprofileSource = 23

public val PROFILE_MAXIMUM: KprofileSource = 24

public val PROFILE_MEMORY_BARRIER_CYCLES: KprofileSource = 22

public val PROFILE_PIPELINE_DRY: KprofileSource = 3

public val PROFILE_PIPELINE_FROZEN: KprofileSource = 5

public val PROFILE_SPECIAL_INSTRUCTIONS: KprofileSource = 18

public val PROFILE_STORE_INSTRUCTIONS: KprofileSource = 12

public val PROFILE_TIME: KprofileSource = 0

public val PROFILE_TOTAL_CYCLES: KprofileSource = 19

public val PROFILE_TOTAL_ISSUES: KprofileSource = 2

public val PROFILE_TOTAL_NONISSUES: KprofileSource = 7

public val PS_CREATE_PROCESS_NOTIFY_SUBSYSTEMS: Pscreateprocessnotifytype = 0

public val PS_CREATE_THREAD_NOTIFY_NON_SYSTEM: Pscreatethreadnotifytype = 0

public val PS_CREATE_THREAD_NOTIFY_SUBSYSTEMS: Pscreatethreadnotifytype = 1

public val PSHED_FA_DISCOVERY: UInt = 1u

public val PSHED_FA_ERROR_INFO_RETRIEVAL: UInt = 8u

public val PSHED_FA_ERROR_INJECTION: UInt = 32u

public val PSHED_FA_ERROR_RECORD_PERSISTENCE: UInt = 4u

public val PSHED_FA_ERROR_RECOVERY: UInt = 16u

public val PSHED_FA_ERROR_SOURCE_CONTROL: UInt = 2u

public val PSHED_PI_ENABLE_NOTIFY_ERROR_CREATE_NOTIFY_EVENT: WheaPshedPluginEnableNotifyErrors = 1

public val PSHED_PI_ENABLE_NOTIFY_ERROR_CREATE_SYSTEM_THREAD: WheaPshedPluginEnableNotifyErrors = 2

public val PSHED_PI_ENABLE_NOTIFY_ERROR_MAX: WheaPshedPluginEnableNotifyErrors = 3

public val PSHED_PI_ERR_READING_PCIE_OVERRIDES_BAD_SIGNATURE: PshedPiErrReadingPcieOverrides = 4

public val PSHED_PI_ERR_READING_PCIE_OVERRIDES_BAD_SIZE: PshedPiErrReadingPcieOverrides = 3

public val PSHED_PI_ERR_READING_PCIE_OVERRIDES_NO_CAP_OFFSET: PshedPiErrReadingPcieOverrides = 5

public val PSHED_PI_ERR_READING_PCIE_OVERRIDES_NO_ERR: PshedPiErrReadingPcieOverrides = 0

public val PSHED_PI_ERR_READING_PCIE_OVERRIDES_NO_MEMORY: PshedPiErrReadingPcieOverrides = 1

public val PSHED_PI_ERR_READING_PCIE_OVERRIDES_NOT_BINARY: PshedPiErrReadingPcieOverrides = 6

public val PSHED_PI_ERR_READING_PCIE_OVERRIDES_QUERY_ERR: PshedPiErrReadingPcieOverrides = 2

public val QUERY_SECURITY_DESCRIPTOR: SecurityOperationCode = 1

public val RCB128BYTES: PciExpressRcb = 1

public val RCB64BYTES: PciExpressRcb = 0

public val RECOVERY_INFO_SECTION_GUID: Guid = Guid.fromU128(U128(0xc34832a102c34c52uL, 0xa9f19f1d5d7723fcuL))

public val RESOURCE_HASH_TABLE_SIZE: UInt = 64u

public val RESULT_NEGATIVE: UInt = 1u

public val RESULT_POSITIVE: UInt = 2u

public val RESULT_ZERO: UInt = 0u

public val ROOT_CMD_ENABLE_CORRECTABLE_ERROR_REPORTING: UInt = 1u

public val ROOT_CMD_ENABLE_FATAL_ERROR_REPORTING: UInt = 4u

public val ROOT_CMD_ENABLE_NONFATAL_ERROR_REPORTING: UInt = 2u

public val RTL_GUID_STRING_SIZE: UInt = 38u

public val RTL_HASH_ALLOCATED_HEADER: UInt = 1u

public val RTL_HASH_RESERVED_SIGNATURE: UInt = 0u

public val RTL_QUERY_REGISTRY_DELETE: UInt = 64u

public val RTL_QUERY_REGISTRY_DIRECT: UInt = 32u

public val RTL_QUERY_REGISTRY_NOEXPAND: UInt = 16u

public val RTL_QUERY_REGISTRY_NOSTRING: UInt = 128u

public val RTL_QUERY_REGISTRY_NOVALUE: UInt = 8u

public val RTL_QUERY_REGISTRY_REQUIRED: UInt = 4u

public val RTL_QUERY_REGISTRY_SUBKEY: UInt = 1u

public val RTL_QUERY_REGISTRY_TOPKEY: UInt = 2u

public val RTL_QUERY_REGISTRY_TYPECHECK: UInt = 256u

public val RTL_QUERY_REGISTRY_TYPECHECK_SHIFT: UInt = 24u

public val RTL_REGISTRY_ABSOLUTE: UInt = 0u

public val RTL_REGISTRY_CONTROL: UInt = 2u

public val RTL_REGISTRY_DEVICEMAP: UInt = 4u

public val RTL_REGISTRY_HANDLE: UInt = 1073741824u

public val RTL_REGISTRY_MAXIMUM: UInt = 6u

public val RTL_REGISTRY_OPTIONAL: UInt = 2147483648u

public val RTL_REGISTRY_SERVICES: UInt = 1u

public val RTL_REGISTRY_USER: UInt = 5u

public val RTL_REGISTRY_WINDOWS_NT: UInt = 3u

public val RTL_STACK_WALKING_MODE_FRAMES_TO_SKIP_SHIFT: UInt = 8u

public val RANDOM_ACCESS: IoAccessMode = 1

public val READ_ACCESS: IoAccessType = 0

public val REAL_MODE_IRQ_ROUTING_TABLE: ConfigurationType = 39

public val REAL_MODE_PCI_ENUMERATION: ConfigurationType = 40

public val REAL_TIME_WORK_QUEUE: WorkQueueType = 5

public val REBUILD_CONTROL: NpemControlStandardControlBit = 5

public val REG_NT_CALLBACK_OBJECT_CONTEXT_CLEANUP: RegNotifyClass = 40

public val REG_NT_DELETE_KEY: RegNotifyClass = 0

public val REG_NT_DELETE_VALUE_KEY: RegNotifyClass = 2

public val REG_NT_ENUMERATE_KEY: RegNotifyClass = 5

public val REG_NT_ENUMERATE_VALUE_KEY: RegNotifyClass = 6

public val REG_NT_KEY_HANDLE_CLOSE: RegNotifyClass = 14

public val REG_NT_POST_CREATE_KEY: RegNotifyClass = 11

public val REG_NT_POST_CREATE_KEY_EX: RegNotifyClass = 27

public val REG_NT_POST_DELETE_KEY: RegNotifyClass = 15

public val REG_NT_POST_DELETE_VALUE_KEY: RegNotifyClass = 17

public val REG_NT_POST_ENUMERATE_KEY: RegNotifyClass = 20

public val REG_NT_POST_ENUMERATE_VALUE_KEY: RegNotifyClass = 21

public val REG_NT_POST_FLUSH_KEY: RegNotifyClass = 31

public val REG_NT_POST_KEY_HANDLE_CLOSE: RegNotifyClass = 25

public val REG_NT_POST_LOAD_KEY: RegNotifyClass = 33

public val REG_NT_POST_OPEN_KEY: RegNotifyClass = 13

public val REG_NT_POST_OPEN_KEY_EX: RegNotifyClass = 29

public val REG_NT_POST_QUERY_KEY: RegNotifyClass = 22

public val REG_NT_POST_QUERY_KEY_NAME: RegNotifyClass = 48

public val REG_NT_POST_QUERY_KEY_SECURITY: RegNotifyClass = 37

public val REG_NT_POST_QUERY_MULTIPLE_VALUE_KEY: RegNotifyClass = 24

public val REG_NT_POST_QUERY_VALUE_KEY: RegNotifyClass = 23

public val REG_NT_POST_RENAME_KEY: RegNotifyClass = 19

public val REG_NT_POST_REPLACE_KEY: RegNotifyClass = 46

public val REG_NT_POST_RESTORE_KEY: RegNotifyClass = 42

public val REG_NT_POST_SAVE_KEY: RegNotifyClass = 44

public val REG_NT_POST_SAVE_MERGED_KEY: RegNotifyClass = 50

public val REG_NT_POST_SET_INFORMATION_KEY: RegNotifyClass = 18

public val REG_NT_POST_SET_KEY_SECURITY: RegNotifyClass = 39

public val REG_NT_POST_SET_VALUE_KEY: RegNotifyClass = 16

public val REG_NT_POST_UN_LOAD_KEY: RegNotifyClass = 35

public val REG_NT_PRE_CREATE_KEY: RegNotifyClass = 10

public val REG_NT_PRE_CREATE_KEY_EX: RegNotifyClass = 26

public val REG_NT_PRE_DELETE_KEY: RegNotifyClass = 0

public val REG_NT_PRE_DELETE_VALUE_KEY: RegNotifyClass = 2

public val REG_NT_PRE_ENUMERATE_KEY: RegNotifyClass = 5

public val REG_NT_PRE_ENUMERATE_VALUE_KEY: RegNotifyClass = 6

public val REG_NT_PRE_FLUSH_KEY: RegNotifyClass = 30

public val REG_NT_PRE_KEY_HANDLE_CLOSE: RegNotifyClass = 14

public val REG_NT_PRE_LOAD_KEY: RegNotifyClass = 32

public val REG_NT_PRE_OPEN_KEY: RegNotifyClass = 12

public val REG_NT_PRE_OPEN_KEY_EX: RegNotifyClass = 28

public val REG_NT_PRE_QUERY_KEY: RegNotifyClass = 7

public val REG_NT_PRE_QUERY_KEY_NAME: RegNotifyClass = 47

public val REG_NT_PRE_QUERY_KEY_SECURITY: RegNotifyClass = 36

public val REG_NT_PRE_QUERY_MULTIPLE_VALUE_KEY: RegNotifyClass = 9

public val REG_NT_PRE_QUERY_VALUE_KEY: RegNotifyClass = 8

public val REG_NT_PRE_RENAME_KEY: RegNotifyClass = 4

public val REG_NT_PRE_REPLACE_KEY: RegNotifyClass = 45

public val REG_NT_PRE_RESTORE_KEY: RegNotifyClass = 41

public val REG_NT_PRE_SAVE_KEY: RegNotifyClass = 43

public val REG_NT_PRE_SAVE_MERGED_KEY: RegNotifyClass = 49

public val REG_NT_PRE_SET_INFORMATION_KEY: RegNotifyClass = 3

public val REG_NT_PRE_SET_KEY_SECURITY: RegNotifyClass = 38

public val REG_NT_PRE_SET_VALUE_KEY: RegNotifyClass = 1

public val REG_NT_PRE_UN_LOAD_KEY: RegNotifyClass = 34

public val REG_NT_QUERY_KEY: RegNotifyClass = 7

public val REG_NT_QUERY_MULTIPLE_VALUE_KEY: RegNotifyClass = 9

public val REG_NT_QUERY_VALUE_KEY: RegNotifyClass = 8

public val REG_NT_RENAME_KEY: RegNotifyClass = 4

public val REG_NT_SET_INFORMATION_KEY: RegNotifyClass = 3

public val REG_NT_SET_VALUE_KEY: RegNotifyClass = 1

public val REMOVAL_POLICY_EXPECT_NO_REMOVAL: DeviceRemovalPolicy = 1

public val REMOVAL_POLICY_EXPECT_ORDERLY_REMOVAL: DeviceRemovalPolicy = 2

public val REMOVAL_POLICY_EXPECT_SURPRISE_REMOVAL: DeviceRemovalPolicy = 3

public val REMOVAL_RELATIONS: DeviceRelationType = 3

public val RESOURCE_NEVER_EXCLUSIVE: UInt = 16u

public val RESOURCE_OWNED_EXCLUSIVE: UInt = 128u

public val RESOURCE_RELEASE_BY_OTHER_THREAD: UInt = 32u

public val RESOURCE_TYPE_EVENT_BUFFER: PhysicalCounterResourceDescriptorType = 4

public val RESOURCE_TYPE_EXTENDED_COUNTER_CONFIGURATION: PhysicalCounterResourceDescriptorType = 2

public val RESOURCE_TYPE_IDENITIFICATION_TAG: PhysicalCounterResourceDescriptorType = 5

public val RESOURCE_TYPE_MAX: PhysicalCounterResourceDescriptorType = 6

public val RESOURCE_TYPE_OVERFLOW: PhysicalCounterResourceDescriptorType = 3

public val RESOURCE_TYPE_RANGE: PhysicalCounterResourceDescriptorType = 1

public val RESOURCE_TYPE_SINGLE: PhysicalCounterResourceDescriptorType = 0

public val RESULT_NEGATIVE1: InterlockedResult = 32768

public val RESULT_POSITIVE1: InterlockedResult = 0

public val RESULT_ZERO1: InterlockedResult = 16384

public val SCI_NOTIFY_TYPE_GUID: Guid = Guid.fromU128(U128(0xe9d5919794ee4a4fuL, 0x8ad89b7d8bd93d2euL))

public val SDEV_IDENTIFIER_INTERFACE_VERSION: UInt = 1u

public val SEA_NOTIFY_TYPE_GUID: Guid = Guid.fromU128(U128(0x9a78788abbe811e4uL, 0x809e67611e5d46b0uL))

public val SEA_SECTION_GUID: Guid = Guid.fromU128(U128(0xf5fe48a684ce4c1euL, 0xaa6420c9a53099f1uL))

public val SECTION_MAP_EXECUTE: UInt = 8u

public val SECTION_MAP_EXECUTE_EXPLICIT: UInt = 32u

public val SECTION_MAP_READ: UInt = 4u

public val SECTION_MAP_WRITE: UInt = 2u

public val SECTION_QUERY: UInt = 1u

public val SECURE_DRIVER_INTERFACE_VERSION: UInt = 1u

public val SECURE_POOL_FLAGS_FREEABLE: UInt = 1u

public val SECURE_POOL_FLAGS_MODIFIABLE: UInt = 2u

public val SECURE_POOL_FLAGS_NONE: UInt = 0u

public val SECURE_SECTION_ALLOW_PARTIAL_MDL: UInt = 1u

public val SEC_LARGE_PAGES: UInt = 2147483648u

public val SEH_VALIDATION_POLICY_DEFER: UInt = 3u

public val SEH_VALIDATION_POLICY_OFF: UInt = 1u

public val SEH_VALIDATION_POLICY_ON: UInt = 0u

public val SEH_VALIDATION_POLICY_TELEMETRY: UInt = 2u

public val SEI_NOTIFY_TYPE_GUID: Guid = Guid.fromU128(U128(0x5c284c81b0ae4e87uL, 0xa322b04c85624323uL))

public val SEI_SECTION_GUID: Guid = Guid.fromU128(U128(0xf2a4a1529c6d4020uL, 0xaecf7695b389251buL))

public val SEMAPHORE_QUERY_STATE: UInt = 1u

public val SE_ASSIGNPRIMARYTOKEN_PRIVILEGE: Int = 3

public val SE_AUDIT_PRIVILEGE: Int = 21

public val SE_BACKUP_PRIVILEGE: Int = 17

public val SE_CHANGE_NOTIFY_PRIVILEGE: Int = 23

public val SE_CREATE_GLOBAL_PRIVILEGE: Int = 30

public val SE_CREATE_PAGEFILE_PRIVILEGE: Int = 15

public val SE_CREATE_PERMANENT_PRIVILEGE: Int = 16

public val SE_CREATE_SYMBOLIC_LINK_PRIVILEGE: Int = 35

public val SE_CREATE_TOKEN_PRIVILEGE: Int = 2

public val SE_DEBUG_PRIVILEGE: Int = 20

public val SE_DELEGATE_SESSION_USER_IMPERSONATE_PRIVILEGE: Int = 36

public val SE_ENABLE_DELEGATION_PRIVILEGE: Int = 27

public val SE_IMPERSONATE_PRIVILEGE: Int = 29

public val SE_INCREASE_QUOTA_PRIVILEGE: Int = 5

public val SE_INC_BASE_PRIORITY_PRIVILEGE: Int = 14

public val SE_INC_WORKING_SET_PRIVILEGE: Int = 33

public val SE_LOAD_DRIVER_PRIVILEGE: Int = 10

public val SE_LOCK_MEMORY_PRIVILEGE: Int = 4

public val SE_MACHINE_ACCOUNT_PRIVILEGE: Int = 6

public val SE_MANAGE_VOLUME_PRIVILEGE: Int = 28

public val SE_MAX_WELL_KNOWN_PRIVILEGE: Int = 36

public val SE_MIN_WELL_KNOWN_PRIVILEGE: Int = 2

public val SE_PROF_SINGLE_PROCESS_PRIVILEGE: Int = 13

public val SE_RELABEL_PRIVILEGE: Int = 32

public val SE_REMOTE_SHUTDOWN_PRIVILEGE: Int = 24

public val SE_RESTORE_PRIVILEGE: Int = 18

public val SE_SECURITY_PRIVILEGE: Int = 8

public val SE_SHUTDOWN_PRIVILEGE: Int = 19

public val SE_SYNC_AGENT_PRIVILEGE: Int = 26

public val SE_SYSTEMTIME_PRIVILEGE: Int = 12

public val SE_SYSTEM_ENVIRONMENT_PRIVILEGE: Int = 22

public val SE_SYSTEM_PROFILE_PRIVILEGE: Int = 11

public val SE_TAKE_OWNERSHIP_PRIVILEGE: Int = 9

public val SE_TCB_PRIVILEGE: Int = 7

public val SE_TIME_ZONE_PRIVILEGE: Int = 34

public val SE_TRUSTED_CREDMAN_ACCESS_PRIVILEGE: Int = 31

public val SE_UNDOCK_PRIVILEGE: Int = 25

public val SE_UNSOLICITED_INPUT_PRIVILEGE: Int = 6

public val SHARED_GLOBAL_FLAGS_CLEAR_GLOBAL_DATA_FLAG: UInt = 2147483648u

public val SHARED_GLOBAL_FLAGS_CONSOLE_BROKER_ENABLED_V: UInt = 6u

public val SHARED_GLOBAL_FLAGS_DYNAMIC_PROC_ENABLED_V: UInt = 5u

public val SHARED_GLOBAL_FLAGS_ELEVATION_ENABLED_V: UInt = 1u

public val SHARED_GLOBAL_FLAGS_ERROR_PORT_V: UInt = 0u

public val SHARED_GLOBAL_FLAGS_INSTALLER_DETECT_ENABLED_V: UInt = 3u

public val SHARED_GLOBAL_FLAGS_LKG_ENABLED_V: UInt = 4u

public val SHARED_GLOBAL_FLAGS_MULTIUSERS_IN_SESSION_SKU_V: UInt = 9u

public val SHARED_GLOBAL_FLAGS_MULTI_SESSION_SKU_V: UInt = 8u

public val SHARED_GLOBAL_FLAGS_QPC_BYPASS_A73_ERRATA: UInt = 64u

public val SHARED_GLOBAL_FLAGS_QPC_BYPASS_DISABLE_32BIT: UInt = 4u

public val SHARED_GLOBAL_FLAGS_QPC_BYPASS_ENABLED: UInt = 1u

public val SHARED_GLOBAL_FLAGS_QPC_BYPASS_USE_HV_PAGE: UInt = 2u

public val SHARED_GLOBAL_FLAGS_QPC_BYPASS_USE_LFENCE: UInt = 32u

public val SHARED_GLOBAL_FLAGS_QPC_BYPASS_USE_MFENCE: UInt = 16u

public val SHARED_GLOBAL_FLAGS_QPC_BYPASS_USE_RDTSCP: UInt = 128u

public val SHARED_GLOBAL_FLAGS_SECURE_BOOT_ENABLED_V: UInt = 7u

public val SHARED_GLOBAL_FLAGS_SET_GLOBAL_DATA_FLAG: UInt = 1073741824u

public val SHARED_GLOBAL_FLAGS_STATE_SEPARATION_ENABLED_V: UInt = 10u

public val SHARED_GLOBAL_FLAGS_VIRT_ENABLED_V: UInt = 2u

public val SHORT_LEAST_SIGNIFICANT_BIT: UInt = 0u

public val SHORT_MOST_SIGNIFICANT_BIT: UInt = 1u

public val SILO_MONITOR_REGISTRATION_VERSION: UInt = 1u

public val SINGLE_GROUP_LEGACY_API: UInt = 1u

public val SL_ALLOW_RAW_MOUNT: UInt = 1u

public val SL_BYPASS_ACCESS_CHECK: UInt = 1u

public val SL_BYPASS_IO: UInt = 64u

public val SL_CASE_SENSITIVE: UInt = 128u

public val SL_ERROR_RETURNED: UInt = 2u

public val SL_EXCLUSIVE_LOCK: UInt = 2u

public val SL_FAIL_IMMEDIATELY: UInt = 1u

public val SL_FORCE_ACCESS_CHECK: UInt = 1u

public val SL_FORCE_ASYNCHRONOUS: UInt = 1u

public val SL_FORCE_DIRECT_WRITE: UInt = 16u

public val SL_FT_SEQUENTIAL_WRITE: UInt = 8u

public val SL_IGNORE_READONLY_ATTRIBUTE: UInt = 64u

public val SL_INDEX_SPECIFIED: UInt = 4u

public val SL_INFO_FORCE_ACCESS_CHECK: UInt = 1u

public val SL_INFO_IGNORE_READONLY_ATTRIBUTE: UInt = 64u

public val SL_INVOKE_ON_CANCEL: UInt = 32u

public val SL_INVOKE_ON_ERROR: UInt = 128u

public val SL_INVOKE_ON_SUCCESS: UInt = 64u

public val SL_KEY_SPECIFIED: UInt = 1u

public val SL_NO_CURSOR_UPDATE: UInt = 16u

public val SL_OPEN_PAGING_FILE: UInt = 2u

public val SL_OPEN_TARGET_DIRECTORY: UInt = 4u

public val SL_OVERRIDE_VERIFY_VOLUME: UInt = 2u

public val SL_PENDING_RETURNED: UInt = 1u

public val SL_PERSISTENT_MEMORY_FIXED_MAPPING: UInt = 32u

public val SL_QUERY_DIRECTORY_MASK: UInt = 27u

public val SL_READ_ACCESS_GRANTED: UInt = 1u

public val SL_REALTIME_STREAM: UInt = 32u

public val SL_RESTART_SCAN: UInt = 1u

public val SL_RETURN_ON_DISK_ENTRIES_ONLY: UInt = 8u

public val SL_RETURN_SINGLE_ENTRY: UInt = 2u

public val SL_STOP_ON_SYMLINK: UInt = 8u

public val SL_WATCH_TREE: UInt = 1u

public val SL_WRITE_ACCESS_GRANTED: UInt = 4u

public val SL_WRITE_THROUGH: UInt = 4u

public val SOC_SUBSYS_AUDIO_DSP: SocSubsystemType = 1

public val SOC_SUBSYS_COMPUTE_DSP: SocSubsystemType = 4

public val SOC_SUBSYS_SECURE_PROC: SocSubsystemType = 5

public val SOC_SUBSYS_SENSORS: SocSubsystemType = 3

public val SOC_SUBSYS_VENDOR_DEFINED: SocSubsystemType = 65536

public val SOC_SUBSYS_WIRELESS_MODEM: SocSubsystemType = 0

public val SOC_SUBSYS_WIRELSS_CONNECTIVITY: SocSubsystemType = 2

public val SSINFO_FLAGS_ALIGNED_DEVICE: UInt = 1u

public val SSINFO_FLAGS_BYTE_ADDRESSABLE: UInt = 16u

public val SSINFO_FLAGS_NO_SEEK_PENALTY: UInt = 4u

public val SSINFO_FLAGS_PARTITION_ALIGNED_ON_DEVICE: UInt = 2u

public val SSINFO_FLAGS_TRIM_ENABLED: UInt = 8u

public val SSINFO_OFFSET_UNKNOWN: UInt = 4294967295u

public val SYMBOLIC_LINK_QUERY: UInt = 1u

public val SYMBOLIC_LINK_SET: UInt = 2u

public val SYSTEM_CALL_INT_2E: UInt = 1u

public val SYSTEM_CALL_SYSCALL: UInt = 0u

public val SCSI_ADAPTER: ConfigurationType = 10

public val SE_IMAGE_TYPE_DRIVER: SeImageType = 1

public val SE_IMAGE_TYPE_DYNAMIC_CODE_FILE: SeImageType = 3

public val SE_IMAGE_TYPE_ELAM_DRIVER: SeImageType = 0

public val SE_IMAGE_TYPE_MAX: SeImageType = 4

public val SE_IMAGE_TYPE_PLATFORM_SECURE_FILE: SeImageType = 2

public val SE_IMAGE_VERIFICATION_CALLBACK_INFORMATIONAL: SeImageVerificationCallbackType = 0

public val SECONDARY_CACHE: ConfigurationType = 7

public val SECONDARY_DCACHE: ConfigurationType = 6

public val SECONDARY_ICACHE: ConfigurationType = 5

public val SEQUENTIAL_ACCESS: IoAccessMode = 0

public val SERIAL_CONTROLLER: ConfigurationType = 17

public val SET_SECURITY_DESCRIPTOR: SecurityOperationCode = 0

public val SGI_INTERNAL_CONFIGURATION: BusDataType = 11

public val SHARED_INTERRUPT_TIME: UInt = 4292804616u

public val SHARED_SYSTEM_TIME: UInt = 4292804628u

public val SHARED_TICK_COUNT: UInt = 4292805408u

public val SINGLE_BUS_RELATIONS: DeviceRelationType = 5

public val SLOT_EMPTY: PciExpressCardPresence = 0

public val STANDARD_DESIGN: AlternativeArchitectureType = 0

public val STOP_COMPLETION: IoCompletionRoutineResult = -1073741802

public val SUBSYSTEM_INFORMATION_TYPE_WSL: SubsystemInformationType = 1

public val SUBSYSTEM_INFORMATION_TYPE_WIN32: SubsystemInformationType = 0

public val SUPER_CRITICAL_WORK_QUEUE: WorkQueueType = 6

public val SUSPENDED: KwaitReason = 5

public val SYSTEM_FIRMWARE_TABLE_ENUMERATE: SystemFirmwareTableAction = 0

public val SYSTEM_FIRMWARE_TABLE_GET: SystemFirmwareTableAction = 1

public val SYSTEM_MEMORY: ConfigurationType = 37

public val SYSTEM_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION: PartitionInformationClass = 9

public val SYSTEM_MEMORY_PARTITION_INFORMATION: PartitionInformationClass = 0

public val SYSTEM_MEMORY_PARTITION_OPEN_DEDICATED_MEMORY: PartitionInformationClass = 10

public val SYSTEM_POWER_STATE: PowerStateType = 0

public val THREAD_ALERT: UInt = 4u

public val THREAD_CSWITCH_PMU_DISABLE: UInt = 0u

public val THREAD_CSWITCH_PMU_ENABLE: UInt = 1u

public val THREAD_GET_CONTEXT: UInt = 8u

public val THREAD_WAIT_OBJECTS: UInt = 3u

public val TIMER_EXPIRED_INDEX_BITS: UInt = 6u

public val TIMER_PROCESSOR_INDEX_BITS: UInt = 5u

public val TIMER_TOLERABLE_DELAY_BITS: UInt = 6u

public val TREE_CONNECT_NO_CLIENT_BUFFERING: UInt = 8u

public val TREE_CONNECT_WRITE_THROUGH: UInt = 2u

public val TXF_MINIVERSION_DEFAULT_VIEW: UInt = 65534u

public val TABLE_EMPTY_TREE: TableSearchResult = 0

public val TABLE_FOUND_NODE: TableSearchResult = 1

public val TABLE_INSERT_AS_LEFT: TableSearchResult = 2

public val TABLE_INSERT_AS_RIGHT: TableSearchResult = 3

public val TAPE_CONTROLLER: ConfigurationType = 14

public val TAPE_PERIPHERAL: ConfigurationType = 27

public val TARGET_DEVICE_RELATION: DeviceRelationType = 4

public val TC_ADAPTER: ConfigurationType = 9

public val TERMINAL_PERIPHERAL: ConfigurationType = 33

public val TLB_MATCH_CONFLICT: FaultInformationArm64Type = 2

public val TRACE_ENABLE_FLAGS_CLASS: TraceInformationClass = 2

public val TRACE_ENABLE_LEVEL_CLASS: TraceInformationClass = 3

public val TRACE_HANDLE_BY_NAME_CLASS: TraceInformationClass = 7

public val TRACE_HANDLE_CLASS: TraceInformationClass = 1

public val TRACE_ID_CLASS: TraceInformationClass = 0

public val TRACE_INFORMATION_CLASS_RESERVED1: TraceInformationClass = 12

public val TRACE_INFORMATION_CLASS_RESERVED2: TraceInformationClass = 14

public val TRACE_SESSION_SETTINGS_CLASS: TraceInformationClass = 9

public val TRANSLATE_CHILD_TO_PARENT: ResourceTranslationDirection = 0

public val TRANSLATE_PARENT_TO_CHILD: ResourceTranslationDirection = 1

public val TRANSLATION_FAULT: FaultInformationArm64Type = 6

public val TRANSPORT_RELATIONS: DeviceRelationType = 6

public val TURBO_CHANNEL: InterfaceType = 4

public val TYPE_A: DmaSpeed = 1

public val TYPE_B: DmaSpeed = 2

public val TYPE_C: DmaSpeed = 3

public val TYPE_F: DmaSpeed = 4

public val UADDRESS_BASE: UInt = 0u

public val UNSUPPORTED_UPSTREAM_TRANSACTION: FaultInformationArm64Type = 0

public val USER_MODE: Mode = 1

public val USER_NOT_PRESENT: PowerUserPresenceType = 0

public val USER_PRESENT: PowerUserPresenceType = 1

public val USER_REQUEST: KwaitReason = 6

public val USER_UNKNOWN: PowerUserPresenceType = 255

public val VME_BUS: InterfaceType = 6

public val VME_CONFIGURATION: BusDataType = 5

public val VPB_DIRECT_WRITES_ALLOWED: UInt = 32u

public val VPB_DISMOUNTING: UInt = 128u

public val VPB_FLAGS_BYPASSIO_BLOCKED: UInt = 64u

public val VPB_LOCKED: UInt = 2u

public val VPB_MOUNTED: UInt = 1u

public val VPB_PERSISTENT: UInt = 4u

public val VPB_RAW_MOUNT: UInt = 16u

public val VPB_REMOVE_PENDING: UInt = 8u

public val VMCS: InterfaceType = 16

public val WCS_RAS_REGISTER_NAME_MAX_LENGTH: UInt = 32u

public val WDM_MAJORVERSION: UInt = 6u

public val WDM_MINORVERSION: UInt = 0u

public val WHEA_AMD_EXT_REG_NUM: UInt = 10u

public val WHEA_BUSCHECK_GUID: Guid = Guid.fromU128(U128(0x1cf3f8b3c5b149a2uL, 0xaa595eef92ffa63cuL))

public val WHEA_CACHECHECK_GUID: Guid = Guid.fromU128(U128(0xa55701f5e3ef43deuL, 0xac72249b573fad2cuL))

public val WHEA_DEVICE_ERROR_SUMMARY_GUID: Guid = Guid.fromU128(U128(0x990b31e9541a4db0uL, 0xa42f837d344f6923uL))

public val WHEA_DPC_CAPABILITY_SECTION_GUID: Guid = Guid.fromU128(U128(0xec49534b30e74358uL, 0x972feca6958fae3buL))

public val WHEA_ERROR_LOG_ENTRY_VERSION: UInt = 1u

public val WHEA_ERROR_PACKET_SECTION_GUID: Guid = Guid.fromU128(U128(0xe71254e9c1b94940uL, 0xab76909703a4320fuL))

public val WHEA_ERROR_PACKET_V1_VERSION: UInt = 2u

public val WHEA_ERROR_PACKET_V2_VERSION: UInt = 3u

public val WHEA_ERROR_PACKET_VERSION: UInt = 3u

public val WHEA_ERROR_PKT_VERSION: UInt = 3u

public val WHEA_ERROR_RECORD_FLAGS_DEVICE_DRIVER: UInt = 8u

public val WHEA_ERROR_RECORD_FLAGS_PREVIOUSERROR: UInt = 2u

public val WHEA_ERROR_RECORD_FLAGS_RECOVERED: UInt = 1u

public val WHEA_ERROR_RECORD_FLAGS_SIMULATED: UInt = 4u

public val WHEA_ERROR_RECORD_REVISION: UInt = 528u

public val WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_REVISION: UInt = 768u

public val WHEA_ERROR_RECORD_SIGNATURE_END: UInt = 4294967295u

public val WHEA_ERROR_RECORD_VALID_PARTITIONID: UInt = 4u

public val WHEA_ERROR_RECORD_VALID_PLATFORMID: UInt = 1u

public val WHEA_ERROR_RECORD_VALID_TIMESTAMP: UInt = 2u

public val WHEA_ERROR_TEXT_LEN: UInt = 32u

public val WHEA_ERR_SRC_OVERRIDE_FLAG: UInt = 1u

public val WHEA_FIRMWARE_RECORD_TYPE_IPFSAL: UInt = 0u

public val WHEA_GENERIC_ENTRY_TEXT_LEN: UInt = 20u

public val WHEA_GENERIC_ENTRY_V2_VERSION: UInt = 768u

public val WHEA_GENERIC_ENTRY_VERSION: UInt = 768u

public val WHEA_INVALID_ERR_SRC_ID: UInt = 0u

public val WHEA_IN_USE_PAGE_NOTIFY_FLAG_NOTIFYALL: UInt = 64u

public val WHEA_IN_USE_PAGE_NOTIFY_FLAG_PAGEOFFLINED: UInt = 128u

public val WHEA_IN_USE_PAGE_NOTIFY_FLAG_PLATFORMDIRECTED: UInt = 1u

public val WHEA_MAX_LOG_DATA_LEN: UInt = 36u

public val WHEA_MEMERRTYPE_INVALIDADDRESS: UInt = 10u

public val WHEA_MEMERRTYPE_MASTERABORT: UInt = 6u

public val WHEA_MEMERRTYPE_MEMORYSPARING: UInt = 12u

public val WHEA_MEMERRTYPE_MIRRORBROKEN: UInt = 11u

public val WHEA_MEMERRTYPE_MULTIBITECC: UInt = 3u

public val WHEA_MEMERRTYPE_MULTISYMCHIPKILL: UInt = 5u

public val WHEA_MEMERRTYPE_NOERROR: UInt = 1u

public val WHEA_MEMERRTYPE_PARITYERROR: UInt = 8u

public val WHEA_MEMERRTYPE_SINGLEBITECC: UInt = 2u

public val WHEA_MEMERRTYPE_SINGLESYMCHIPKILL: UInt = 4u

public val WHEA_MEMERRTYPE_TARGETABORT: UInt = 7u

public val WHEA_MEMERRTYPE_UNKNOWN: UInt = 0u

public val WHEA_MEMERRTYPE_WATCHDOGTIMEOUT: UInt = 9u

public val WHEA_MSCHECK_GUID: Guid = Guid.fromU128(U128(0x48ab7f57dc344f6cuL, 0xa7d3b0b5b0a74314uL))

public val WHEA_PCIE_CORRECTABLE_ERROR_SECTION_COUNT_SIZE: UInt = 32u

public val WHEA_PLUGIN_REGISTRATION_PACKET_V1: UInt = 65536u

public val WHEA_PLUGIN_REGISTRATION_PACKET_V2: UInt = 131072u

public val WHEA_PLUGIN_REGISTRATION_PACKET_VERSION: UInt = 131072u

public val WHEA_PMEM_ERROR_SECTION_LOCATION_INFO_SIZE: UInt = 64u

public val WHEA_PMEM_ERROR_SECTION_MAX_PAGES: UInt = 50u

public val WHEA_RECORD_CREATOR_GUID: Guid = Guid.fromU128(U128(0xcf07c4bdb7894e18uL, 0xb3c41f732cb57131uL))

public val WHEA_SECTION_DESCRIPTOR_FLAGS_CONTAINMENTWRN: UInt = 2u

public val WHEA_SECTION_DESCRIPTOR_FLAGS_FRU_TEXT_BY_PLUGIN: UInt = 128u

public val WHEA_SECTION_DESCRIPTOR_FLAGS_LATENTERROR: UInt = 32u

public val WHEA_SECTION_DESCRIPTOR_FLAGS_PRIMARY: UInt = 1u

public val WHEA_SECTION_DESCRIPTOR_FLAGS_PROPAGATED: UInt = 64u

public val WHEA_SECTION_DESCRIPTOR_FLAGS_RESET: UInt = 4u

public val WHEA_SECTION_DESCRIPTOR_FLAGS_RESOURCENA: UInt = 16u

public val WHEA_SECTION_DESCRIPTOR_FLAGS_THRESHOLDEXCEEDED: UInt = 8u

public val WHEA_SECTION_DESCRIPTOR_REVISION: UInt = 768u

public val WHEA_SEL_BUGCHECK_RECOVERY_STATUS_PHASE1_VERSION: UInt = 1u

public val WHEA_TLBCHECK_GUID: Guid = Guid.fromU128(U128(0xfc06b5355e1f4562uL, 0x9f250a3b9adb63c3uL))

public val WHEA_WRITE_FLAG_DUMMY: UInt = 1u

public val WHEA_XPF_MCA_EXTREG_MAX_COUNT: UInt = 24u

public val WHEA_XPF_MCA_SECTION_VERSION: UInt = 3u

public val WHEA_XPF_MCA_SECTION_VERSION_2: UInt = 2u

public val WHEA_XPF_MCA_SECTION_VERSION_3: UInt = 3u

public val WMIREGISTER: UInt = 0u

public val WMIREG_ACTION_BLOCK_IRPS: UInt = 5u

public val WMIREG_ACTION_DEREGISTER: UInt = 2u

public val WMIREG_ACTION_REGISTER: UInt = 1u

public val WMIREG_ACTION_REREGISTER: UInt = 3u

public val WMIREG_ACTION_UPDATE_GUIDS: UInt = 4u

public val WMIUPDATE: UInt = 1u

public val WDF_NOTIFY_ROUTINES_CLASS: TraceInformationClass = 15

public val WHEA_CPU_VENDOR_AMD: WheaCpuVendor = 2

public val WHEA_CPU_VENDOR_INTEL: WheaCpuVendor = 1

public val WHEA_CPU_VENDOR_OTHER: WheaCpuVendor = 0

public val WHEA_DATA_FORMAT_GENERIC: WheaErrorPacketDataFormat = 7

public val WHEA_DATA_FORMAT_IPF_SAL_RECORD: WheaErrorPacketDataFormat = 0

public val WHEA_DATA_FORMAT_MAX: WheaErrorPacketDataFormat = 8

public val WHEA_DATA_FORMAT_MEMORY: WheaErrorPacketDataFormat = 2

public val WHEA_DATA_FORMAT_NMI_PORT: WheaErrorPacketDataFormat = 4

public val WHEA_DATA_FORMAT_PCI_EXPRESS: WheaErrorPacketDataFormat = 3

public val WHEA_DATA_FORMAT_PCIX_BUS: WheaErrorPacketDataFormat = 5

public val WHEA_DATA_FORMAT_PCIX_DEVICE: WheaErrorPacketDataFormat = 6

public val WHEA_DATA_FORMAT_XPFMCA: WheaErrorPacketDataFormat = 1

public val WHEA_ERR_SEV_CORRECTED: WheaErrorSeverity = 2

public val WHEA_ERR_SEV_FATAL: WheaErrorSeverity = 1

public val WHEA_ERR_SEV_INFORMATIONAL: WheaErrorSeverity = 3

public val WHEA_ERR_SEV_RECOVERABLE: WheaErrorSeverity = 0

public val WHEA_ERR_TYPE_GENERIC: WheaErrorType = 6

public val WHEA_ERR_TYPE_MEMORY: WheaErrorType = 1

public val WHEA_ERR_TYPE_NMI: WheaErrorType = 3

public val WHEA_ERR_TYPE_PCI_EXPRESS: WheaErrorType = 2

public val WHEA_ERR_TYPE_PCIX_BUS: WheaErrorType = 4

public val WHEA_ERR_TYPE_PCIX_DEVICE: WheaErrorType = 5

public val WHEA_ERR_TYPE_PMEM: WheaErrorType = 7

public val WHEA_ERR_TYPE_PROCESSOR: WheaErrorType = 0

public val WHEA_EVENT_BUG_CHECK_RECOVERY_ENTRY: WheaBugcheckRecoveryLogType = 0

public val WHEA_EVENT_BUG_CHECK_RECOVERY_MAX: WheaBugcheckRecoveryLogType = 2

public val WHEA_EVENT_BUG_CHECK_RECOVERY_RETURN: WheaBugcheckRecoveryLogType = 1

public val WHEA_EVENT_LOG_AZCC_ROOT_BUS_LIST: WheaEventLogEntryId = -2147483617

public val WHEA_EVENT_LOG_AZCC_ROOT_BUS_POISON_SET: WheaEventLogEntryId = -2147483602

public val WHEA_EVENT_LOG_AZCC_ROOT_BUS_SEARCH_ERR: WheaEventLogEntryId = -2147483618

public val WHEA_EVENT_LOG_CMCI_FINAL_RESTART: WheaEventLogEntryId = -2147483620

public val WHEA_EVENT_LOG_CMCI_RESTART: WheaEventLogEntryId = -2147483621

public val WHEA_EVENT_LOG_ENTRY_EARLY_ERROR: WheaEventLogEntryId = -2147483594

public val WHEA_EVENT_LOG_ENTRY_ETW_OVER_FLOW: WheaEventLogEntryId = -2147483619

public val WHEA_EVENT_LOG_ENTRY_ID_ACPI_TIME_OUT: WheaEventLogEntryId = -2147483622

public val WHEA_EVENT_LOG_ENTRY_ID_ADD_REMOVE_ERROR_SOURCE: WheaEventLogEntryId = -2147483636

public val WHEA_EVENT_LOG_ENTRY_ID_AER_NOT_GRANTED_TO_OS: WheaEventLogEntryId = -2147483624

public val WHEA_EVENT_LOG_ENTRY_ID_ATTEMPT_ERROR_RECOVERY: WheaEventLogEntryId = -2147483634

public val WHEA_EVENT_LOG_ENTRY_ID_BAD_HEST_NOTIFY_DATA: WheaEventLogEntryId = -2147483565

public val WHEA_EVENT_LOG_ENTRY_ID_BAD_PAGE_LIMIT_REACHED: WheaEventLogEntryId = -2147483596

public val WHEA_EVENT_LOG_ENTRY_ID_CLEARED_POISON: WheaEventLogEntryId = -2147483630

public val WHEA_EVENT_LOG_ENTRY_ID_CMC_POLLING_TIMEOUT: WheaEventLogEntryId = -2147483647

public val WHEA_EVENT_LOG_ENTRY_ID_CMC_SWITCH_TO_POLLING: WheaEventLogEntryId = -2147483645

public val WHEA_EVENT_LOG_ENTRY_ID_CMCI_IMPL_PRESENT: WheaEventLogEntryId = -2147483608

public val WHEA_EVENT_LOG_ENTRY_ID_CMCI_INIT_ERROR: WheaEventLogEntryId = -2147483607

public val WHEA_EVENT_LOG_ENTRY_ID_CPU_BUSES_INIT_FAILED: WheaEventLogEntryId = -2147483571

public val WHEA_EVENT_LOG_ENTRY_ID_CPUS_FROZEN: WheaEventLogEntryId = -2147483552

public val WHEA_EVENT_LOG_ENTRY_ID_CPUS_FROZEN_NO_CRASH_DUMP: WheaEventLogEntryId = -2147483551

public val WHEA_EVENT_LOG_ENTRY_ID_CREATE_GENERIC_RECORD: WheaEventLogEntryId = -2147483627

public val WHEA_EVENT_LOG_ENTRY_ID_DEFECT_LIST_CORRUPT: WheaEventLogEntryId = -2147483566

public val WHEA_EVENT_LOG_ENTRY_ID_DEFECT_LIST_FULL: WheaEventLogEntryId = -2147483568

public val WHEA_EVENT_LOG_ENTRY_ID_DEFECT_LIST_UEFI_VAR_FAILED: WheaEventLogEntryId = -2147483567

public val WHEA_EVENT_LOG_ENTRY_ID_DEVICE_DRIVER: WheaEventLogEntryId = -2147483609

public val WHEA_EVENT_LOG_ENTRY_ID_DROPPED_CORRECTED_ERROR: WheaEventLogEntryId = -2147483644

public val WHEA_EVENT_LOG_ENTRY_ID_DRV_ERR_SRC_INVALID: WheaEventLogEntryId = -2147483605

public val WHEA_EVENT_LOG_ENTRY_ID_DRV_HANDLE_BUSY: WheaEventLogEntryId = -2147483604

public val WHEA_EVENT_LOG_ENTRY_ID_ENABLE_KEY_NOTIF_FAILED: WheaEventLogEntryId = -2147483580

public val WHEA_EVENT_LOG_ENTRY_ID_ERR_DIMM_INFO_MISMATCH: WheaEventLogEntryId = -2147483600

public val WHEA_EVENT_LOG_ENTRY_ID_ERR_SRC_ARRAY_INVALID: WheaEventLogEntryId = -2147483623

public val WHEA_EVENT_LOG_ENTRY_ID_ERR_SRC_INVALID: WheaEventLogEntryId = -2147483616

public val WHEA_EVENT_LOG_ENTRY_ID_ERROR_RECORD: WheaEventLogEntryId = -2147483626

public val WHEA_EVENT_LOG_ENTRY_ID_ERROR_RECORD_LIMIT: WheaEventLogEntryId = -2147483625

public val WHEA_EVENT_LOG_ENTRY_ID_FAILED_ADD_TO_DEFECT_LIST: WheaEventLogEntryId = -2147483569

public val WHEA_EVENT_LOG_ENTRY_ID_GENERIC_ERR_MEM_MAP: WheaEventLogEntryId = -2147483615

public val WHEA_EVENT_LOG_ENTRY_ID_KEY_NOTIFICATION_FAILED: WheaEventLogEntryId = -2147483579

public val WHEA_EVENT_LOG_ENTRY_ID_MCA_ERROR_CLEARED: WheaEventLogEntryId = -2147483631

public val WHEA_EVENT_LOG_ENTRY_ID_MCA_FOUND_ERROR_IN_BANK: WheaEventLogEntryId = -2147483633

public val WHEA_EVENT_LOG_ENTRY_ID_MCA_STUCK_ERROR_CHECK: WheaEventLogEntryId = -2147483632

public val WHEA_EVENT_LOG_ENTRY_ID_MEMORY_ADD_DEVICE: WheaEventLogEntryId = -2147483575

public val WHEA_EVENT_LOG_ENTRY_ID_MEMORY_REMOVE_DEVICE: WheaEventLogEntryId = -2147483574

public val WHEA_EVENT_LOG_ENTRY_ID_MEMORY_SUMMARY_FAILED: WheaEventLogEntryId = -2147483573

public val WHEA_EVENT_LOG_ENTRY_ID_OSC_CAPABILITIES: WheaEventLogEntryId = -2147483638

public val WHEA_EVENT_LOG_ENTRY_ID_PFA_MEMORY_OFFLINED: WheaEventLogEntryId = -2147483642

public val WHEA_EVENT_LOG_ENTRY_ID_PFA_MEMORY_POLICY: WheaEventLogEntryId = -2147483640

public val WHEA_EVENT_LOG_ENTRY_ID_PFA_MEMORY_REMOVE_MONITOR: WheaEventLogEntryId = -2147483641

public val WHEA_EVENT_LOG_ENTRY_ID_PCIE_ADD_DEVICE: WheaEventLogEntryId = -2147483577

public val WHEA_EVENT_LOG_ENTRY_ID_PCIE_CONFIG_INFO: WheaEventLogEntryId = -2147483591

public val WHEA_EVENT_LOG_ENTRY_ID_PCIE_DPC_ERROR: WheaEventLogEntryId = -2147483572

public val WHEA_EVENT_LOG_ENTRY_ID_PCIE_OVERRIDE_INFO: WheaEventLogEntryId = -2147483593

public val WHEA_EVENT_LOG_ENTRY_ID_PCIE_REMOVE_DEVICE: WheaEventLogEntryId = -2147483578

public val WHEA_EVENT_LOG_ENTRY_ID_PCIE_SPURIOUS_ERR_SOURCE: WheaEventLogEntryId = -2147483576

public val WHEA_EVENT_LOG_ENTRY_ID_PCIE_SUMMARY_FAILED: WheaEventLogEntryId = -2147483584

public val WHEA_EVENT_LOG_ENTRY_ID_PROCESS_EINJ: WheaEventLogEntryId = -2147483629

public val WHEA_EVENT_LOG_ENTRY_ID_PROCESS_HEST: WheaEventLogEntryId = -2147483628

public val WHEA_EVENT_LOG_ENTRY_ID_PSHED_CALLBACK_COLLISION: WheaEventLogEntryId = -2147483614

public val WHEA_EVENT_LOG_ENTRY_ID_PSHED_INJECT_ERROR: WheaEventLogEntryId = -2147483639

public val WHEA_EVENT_LOG_ENTRY_ID_PSHED_PI_TRACE_LOG: WheaEventLogEntryId = -2147221488

public val WHEA_EVENT_LOG_ENTRY_ID_PSHED_PLUGIN_INIT_FAILED: WheaEventLogEntryId = -2147483570

public val WHEA_EVENT_LOG_ENTRY_ID_PSHED_PLUGIN_LOAD: WheaEventLogEntryId = -2147483612

public val WHEA_EVENT_LOG_ENTRY_ID_PSHED_PLUGIN_REGISTER: WheaEventLogEntryId = -2147483637

public val WHEA_EVENT_LOG_ENTRY_ID_PSHED_PLUGIN_SUPPORTED: WheaEventLogEntryId = -2147483610

public val WHEA_EVENT_LOG_ENTRY_ID_PSHED_PLUGIN_UNLOAD: WheaEventLogEntryId = -2147483611

public val WHEA_EVENT_LOG_ENTRY_ID_READ_PCIE_OVERRIDES_ERR: WheaEventLogEntryId = -2147483592

public val WHEA_EVENT_LOG_ENTRY_ID_ROW_FAILURE: WheaEventLogEntryId = -2147483561

public val WHEA_EVENT_LOG_ENTRY_ID_SEL_BUG_CHECK_INFO: WheaEventLogEntryId = -2147483601

public val WHEA_EVENT_LOG_ENTRY_ID_SEL_BUG_CHECK_PROGRESS: WheaEventLogEntryId = -2147483613

public val WHEA_EVENT_LOG_ENTRY_ID_SEL_BUG_CHECK_RECOVERY: WheaEventLogEntryId = -2147483606

public val WHEA_EVENT_LOG_ENTRY_ID_SRAS_TABLE_ENTRIES: WheaEventLogEntryId = -2147483562

public val WHEA_EVENT_LOG_ENTRY_ID_SRAS_TABLE_ERROR: WheaEventLogEntryId = -2147483563

public val WHEA_EVENT_LOG_ENTRY_ID_SRAS_TABLE_NOT_FOUND: WheaEventLogEntryId = -2147483564

public val WHEA_EVENT_LOG_ENTRY_ID_STARTED_REPORT_HW_ERROR: WheaEventLogEntryId = -2147483643

public val WHEA_EVENT_LOG_ENTRY_ID_THROTTLE_ADD_ERR_SRC_FAILED: WheaEventLogEntryId = -2147483582

public val WHEA_EVENT_LOG_ENTRY_ID_THROTTLE_REG_CORRUPT: WheaEventLogEntryId = -2147483583

public val WHEA_EVENT_LOG_ENTRY_ID_THROTTLE_REG_DATA_IGNORED: WheaEventLogEntryId = -2147483581

public val WHEA_EVENT_LOG_ENTRY_ID_WHEA_HEARTBEAT: WheaEventLogEntryId = -2147483603

public val WHEA_EVENT_LOG_ENTRY_ID_WHEA_INIT: WheaEventLogEntryId = -2147483646

public val WHEA_EVENT_LOG_ENTRY_ID_WORK_QUEUE_ITEM: WheaEventLogEntryId = -2147483635

public val WHEA_EVENT_LOG_ENTRY_IDE_DPC_ENABLED: WheaEventLogEntryId = -2147483599

public val WHEA_EVENT_LOG_ENTRY_PAGE_OFFLINE_DONE: WheaEventLogEntryId = -2147483598

public val WHEA_EVENT_LOG_ENTRY_PAGE_OFFLINE_PEND_MAX: WheaEventLogEntryId = -2147483597

public val WHEA_EVENT_LOG_ENTRY_SRAR_DETAIL: WheaEventLogEntryId = -2147483595

public val WHEA_EVENT_LOG_ENTRY_TYPE_ERROR: WheaEventLogEntryType = 2

public val WHEA_EVENT_LOG_ENTRY_TYPE_INFORMATIONAL: WheaEventLogEntryType = 0

public val WHEA_EVENT_LOG_ENTRY_TYPE_WARNING: WheaEventLogEntryType = 1

public val WHEA_MEMORY_THROTTLE: WheaThrottleType = 1

public val WHEA_PCI_EXPRESS_DOWNSTREAM_SWITCH_PORT: WheaPciexpressDeviceType = 6

public val WHEA_PCI_EXPRESS_ENDPOINT: WheaPciexpressDeviceType = 0

public val WHEA_PCI_EXPRESS_LEGACY_ENDPOINT: WheaPciexpressDeviceType = 1

public val WHEA_PCI_EXPRESS_ROOT_COMPLEX_EVENT_COLLECTOR: WheaPciexpressDeviceType = 10

public val WHEA_PCI_EXPRESS_ROOT_COMPLEX_INTEGRATED_ENDPOINT: WheaPciexpressDeviceType = 9

public val WHEA_PCI_EXPRESS_ROOT_PORT: WheaPciexpressDeviceType = 4

public val WHEA_PCI_EXPRESS_TO_PCI_X_BRIDGE: WheaPciexpressDeviceType = 7

public val WHEA_PCI_EXPRESS_UPSTREAM_SWITCH_PORT: WheaPciexpressDeviceType = 5

public val WHEA_PCI_R_ECOVERY_STATUS_UNKNOWN: WheaPciRecoveryStatus = 0

public val WHEA_PCI_RECOVERY_SIGNAL_AER: WheaPciRecoverySignal = 1

public val WHEA_PCI_RECOVERY_SIGNAL_DPC: WheaPciRecoverySignal = 2

public val WHEA_PCI_RECOVERY_SIGNAL_UNKNOWN: WheaPciRecoverySignal = 0

public val WHEA_PCI_RECOVERY_STATUS_BUS_NOT_FOUND: WheaPciRecoveryStatus = 6

public val WHEA_PCI_RECOVERY_STATUS_COMPLEX_TREE: WheaPciRecoveryStatus = 5

public val WHEA_PCI_RECOVERY_STATUS_LINK_DISABLE_TIMEOUT: WheaPciRecoveryStatus = 2

public val WHEA_PCI_RECOVERY_STATUS_LINK_ENABLE_TIMEOUT: WheaPciRecoveryStatus = 3

public val WHEA_PCI_RECOVERY_STATUS_NO_ERROR: WheaPciRecoveryStatus = 1

public val WHEA_PCI_RECOVERY_STATUS_RP_BUSY_TIMEOUT: WheaPciRecoveryStatus = 4

public val WHEA_PCI_X_TO_EXPRESS_BRIDGE: WheaPciexpressDeviceType = 8

public val WHEA_PCIE_THROTTLE: WheaThrottleType = 0

public val WHEA_PFA_REMOVE_CAPACITY: WheaPfaRemoveTrigger = 3

public val WHEA_PFA_REMOVE_ERROR_THRESHOLD: WheaPfaRemoveTrigger = 1

public val WHEA_PFA_REMOVE_TIMEOUT: WheaPfaRemoveTrigger = 2

public val WHEA_RAW_DATA_FORMAT_AMD64MCA: WheaRawDataFormat = 3

public val WHEA_RAW_DATA_FORMAT_GENERIC: WheaRawDataFormat = 9

public val WHEA_RAW_DATA_FORMAT_IA32MCA: WheaRawDataFormat = 1

public val WHEA_RAW_DATA_FORMAT_IPF_SAL_RECORD: WheaRawDataFormat = 0

public val WHEA_RAW_DATA_FORMAT_INTEL64MCA: WheaRawDataFormat = 2

public val WHEA_RAW_DATA_FORMAT_MAX: WheaRawDataFormat = 10

public val WHEA_RAW_DATA_FORMAT_MEMORY: WheaRawDataFormat = 4

public val WHEA_RAW_DATA_FORMAT_NMI_PORT: WheaRawDataFormat = 6

public val WHEA_RAW_DATA_FORMAT_PCI_EXPRESS: WheaRawDataFormat = 5

public val WHEA_RAW_DATA_FORMAT_PCIX_BUS: WheaRawDataFormat = 7

public val WHEA_RAW_DATA_FORMAT_PCIX_DEVICE: WheaRawDataFormat = 8

public val WHEA_RECOVERY_CONTEXT_ERROR_TYPE_MAX: WheaRecoveryContextErrorType = 3

public val WHEA_RECOVERY_CONTEXT_ERROR_TYPE_MEMORY: WheaRecoveryContextErrorType = 1

public val WHEA_RECOVERY_CONTEXT_ERROR_TYPE_PMEM: WheaRecoveryContextErrorType = 2

public val WHEA_RECOVERY_FAILURE_REASON_FAR_NOT_VALID: WheaRecoveryFailureReason = 17

public val WHEA_RECOVERY_FAILURE_REASON_HIGH_IRQL: WheaRecoveryFailureReason = 10

public val WHEA_RECOVERY_FAILURE_REASON_INSUFFICIENT_ALT_CONTEXT_WRAPPERS: WheaRecoveryFailureReason = 11

public val WHEA_RECOVERY_FAILURE_REASON_INTERRUPTS_DISABLED: WheaRecoveryFailureReason = 12

public val WHEA_RECOVERY_FAILURE_REASON_INVALID_ADDRESS_MODE: WheaRecoveryFailureReason = 9

public val WHEA_RECOVERY_FAILURE_REASON_KERNEL_COULD_NOT_MARK_MEMORY_BAD: WheaRecoveryFailureReason = 1

public val WHEA_RECOVERY_FAILURE_REASON_KERNEL_MARK_MEMORY_BAD_TIMED_OUT: WheaRecoveryFailureReason = 2

public val WHEA_RECOVERY_FAILURE_REASON_KERNEL_WILL_PAGE_FAULT_BC_AT_CURRENT_IRQL: WheaRecoveryFailureReason = 16

public val WHEA_RECOVERY_FAILURE_REASON_MAX: WheaRecoveryFailureReason = 18

public val WHEA_RECOVERY_FAILURE_REASON_MISC_OR_ADDR_NOT_VALID: WheaRecoveryFailureReason = 8

public val WHEA_RECOVERY_FAILURE_REASON_NO_RECOVERY_CONTEXT: WheaRecoveryFailureReason = 3

public val WHEA_RECOVERY_FAILURE_REASON_NOT_CONTINUABLE: WheaRecoveryFailureReason = 4

public val WHEA_RECOVERY_FAILURE_REASON_NOT_SUPPORTED: WheaRecoveryFailureReason = 7

public val WHEA_RECOVERY_FAILURE_REASON_OVERFLOW: WheaRecoveryFailureReason = 6

public val WHEA_RECOVERY_FAILURE_REASON_PCC: WheaRecoveryFailureReason = 5

public val WHEA_RECOVERY_FAILURE_REASON_STACK_OVERFLOW: WheaRecoveryFailureReason = 14

public val WHEA_RECOVERY_FAILURE_REASON_SWAP_BUSY: WheaRecoveryFailureReason = 13

public val WHEA_RECOVERY_FAILURE_REASON_UNEXPECTED_FAILURE: WheaRecoveryFailureReason = 15

public val WHEA_RECOVERY_TYPE_ACTION_OPTIONAL: WheaRecoveryType = 2

public val WHEA_RECOVERY_TYPE_ACTION_REQUIRED: WheaRecoveryType = 1

public val WHEA_RECOVERY_TYPE_MAX: WheaRecoveryType = 3

public val WHEAP_DPC_ERR_BUS_NOT_FOUND: WheapDpcErrorEventType = 1

public val WHEAP_DPC_ERR_DEVICE_ID_BAD: WheapDpcErrorEventType = 3

public val WHEAP_DPC_ERR_DPCED_SUBTREE: WheapDpcErrorEventType = 2

public val WHEAP_DPC_ERR_NO_CHILDREN: WheapDpcErrorEventType = 5

public val WHEAP_DPC_ERR_NO_ERR: WheapDpcErrorEventType = 0

public val WHEAP_DPC_ERR_RESET_FAILED: WheapDpcErrorEventType = 4

public val WHEAP_PFA_OFFLINE_PREDICTIVE_FAILURE: WheapPfaOfflineDecisionType = 1

public val WHEAP_PFA_OFFLINE_UNCORRECTED_ERROR: WheapPfaOfflineDecisionType = 2

public val WIDTH16BITS: DmaWidth = 1

public val WIDTH32BITS: DmaWidth = 2

public val WIDTH64BITS: DmaWidth = 3

public val WIDTH8BITS: DmaWidth = 0

public val WIDTH_NO_WRAP: DmaWidth = 4

public val WORM_CONTROLLER: ConfigurationType = 16

public val WR_ALERT_BY_THREAD_ID: KwaitReason = 37

public val WR_CALLOUT_STACK: KwaitReason = 25

public val WR_CPU_RATE_CONTROL: KwaitReason = 24

public val WR_DEFERRED_PREEMPT: KwaitReason = 38

public val WR_DELAY_EXECUTION: KwaitReason = 11

public val WR_DISPATCH_INT: KwaitReason = 31

public val WR_EXECUTIVE: KwaitReason = 7

public val WR_FAST_MUTEX: KwaitReason = 34

public val WR_FREE_PAGE: KwaitReason = 8

public val WR_GUARDED_MUTEX: KwaitReason = 35

public val WR_IO_RING: KwaitReason = 40

public val WR_KERNEL: KwaitReason = 26

public val WR_KEYED_EVENT: KwaitReason = 21

public val WR_LPC_RECEIVE: KwaitReason = 16

public val WR_LPC_REPLY: KwaitReason = 17

public val WR_MDL_CACHE: KwaitReason = 41

public val WR_MUTEX: KwaitReason = 29

public val WR_PAGE_IN: KwaitReason = 9

public val WR_PAGE_OUT: KwaitReason = 19

public val WR_PHYSICAL_FAULT: KwaitReason = 39

public val WR_POOL_ALLOCATION: KwaitReason = 10

public val WR_PREEMPTED: KwaitReason = 32

public val WR_PROCESS_IN_SWAP: KwaitReason = 23

public val WR_PUSH_LOCK: KwaitReason = 28

public val WR_QUANTUM_END: KwaitReason = 30

public val WR_QUEUE: KwaitReason = 15

public val WR_RENDEZVOUS: KwaitReason = 20

public val WR_RESOURCE: KwaitReason = 27

public val WR_RUNDOWN: KwaitReason = 36

public val WR_SPARE0: KwaitReason = 14

public val WR_SUSPENDED: KwaitReason = 12

public val WR_TERMINATED: KwaitReason = 22

public val WR_USER_REQUEST: KwaitReason = 13

public val WR_VIRTUAL_MEMORY: KwaitReason = 18

public val WR_YIELD_EXECUTION: KwaitReason = 33

public val WRITE_ACCESS: IoAccessType = 1

public val XPF_BUS_CHECK_ADDRESS_IO: UInt = 2u

public val XPF_BUS_CHECK_ADDRESS_MEMORY: UInt = 0u

public val XPF_BUS_CHECK_ADDRESS_OTHER: UInt = 3u

public val XPF_BUS_CHECK_ADDRESS_RESERVED: UInt = 1u

public val XPF_BUS_CHECK_OPERATION_DATAREAD: UInt = 3u

public val XPF_BUS_CHECK_OPERATION_DATAWRITE: UInt = 4u

public val XPF_BUS_CHECK_OPERATION_GENERIC: UInt = 0u

public val XPF_BUS_CHECK_OPERATION_GENREAD: UInt = 1u

public val XPF_BUS_CHECK_OPERATION_GENWRITE: UInt = 2u

public val XPF_BUS_CHECK_OPERATION_INSTRUCTIONFETCH: UInt = 5u

public val XPF_BUS_CHECK_OPERATION_PREFETCH: UInt = 6u

public val XPF_BUS_CHECK_PARTICIPATION_GENERIC: UInt = 3u

public val XPF_BUS_CHECK_PARTICIPATION_PROCOBSERVED: UInt = 2u

public val XPF_BUS_CHECK_PARTICIPATION_PROCORIGINATED: UInt = 0u

public val XPF_BUS_CHECK_PARTICIPATION_PROCRESPONDED: UInt = 1u

public val XPF_BUS_CHECK_TRANSACTIONTYPE_DATAACCESS: UInt = 1u

public val XPF_BUS_CHECK_TRANSACTIONTYPE_GENERIC: UInt = 2u

public val XPF_BUS_CHECK_TRANSACTIONTYPE_INSTRUCTION: UInt = 0u

public val XPF_CACHE_CHECK_OPERATION_DATAREAD: UInt = 3u

public val XPF_CACHE_CHECK_OPERATION_DATAWRITE: UInt = 4u

public val XPF_CACHE_CHECK_OPERATION_EVICTION: UInt = 7u

public val XPF_CACHE_CHECK_OPERATION_GENERIC: UInt = 0u

public val XPF_CACHE_CHECK_OPERATION_GENREAD: UInt = 1u

public val XPF_CACHE_CHECK_OPERATION_GENWRITE: UInt = 2u

public val XPF_CACHE_CHECK_OPERATION_INSTRUCTIONFETCH: UInt = 5u

public val XPF_CACHE_CHECK_OPERATION_PREFETCH: UInt = 6u

public val XPF_CACHE_CHECK_OPERATION_SNOOP: UInt = 8u

public val XPF_CACHE_CHECK_TRANSACTIONTYPE_DATAACCESS: UInt = 1u

public val XPF_CACHE_CHECK_TRANSACTIONTYPE_GENERIC: UInt = 2u

public val XPF_CACHE_CHECK_TRANSACTIONTYPE_INSTRUCTION: UInt = 0u

public val XPF_CONTEXT_INFO_32BITCONTEXT: UInt = 2u

public val XPF_CONTEXT_INFO_32BITDEBUGREGS: UInt = 5u

public val XPF_CONTEXT_INFO_64BITCONTEXT: UInt = 3u

public val XPF_CONTEXT_INFO_64BITDEBUGREGS: UInt = 6u

public val XPF_CONTEXT_INFO_FXSAVE: UInt = 4u

public val XPF_CONTEXT_INFO_MMREGISTERS: UInt = 7u

public val XPF_CONTEXT_INFO_MSRREGISTERS: UInt = 1u

public val XPF_CONTEXT_INFO_UNCLASSIFIEDDATA: UInt = 0u

public val XPF_MCA_SECTION_GUID: Guid = Guid.fromU128(U128(0x8a1e1d0142f94557uL, 0x9c33565e5cc3f7e8uL))

public val XPF_MS_CHECK_ERRORTYPE_EXTERNAL: UInt = 3u

public val XPF_MS_CHECK_ERRORTYPE_FRC: UInt = 4u

public val XPF_MS_CHECK_ERRORTYPE_INTERNALUNCLASSIFIED: UInt = 5u

public val XPF_MS_CHECK_ERRORTYPE_MCROMPARITY: UInt = 2u

public val XPF_MS_CHECK_ERRORTYPE_NOERROR: UInt = 0u

public val XPF_MS_CHECK_ERRORTYPE_UNCLASSIFIED: UInt = 1u

public val XPF_PROCESSOR_ERROR_SECTION_GUID: Guid = Guid.fromU128(U128(0xdc3ea0b0a1444797uL, 0xb95b53fa242b6e1duL))

public val XPF_TLB_CHECK_OPERATION_DATAREAD: UInt = 3u

public val XPF_TLB_CHECK_OPERATION_DATAWRITE: UInt = 4u

public val XPF_TLB_CHECK_OPERATION_GENERIC: UInt = 0u

public val XPF_TLB_CHECK_OPERATION_GENREAD: UInt = 1u

public val XPF_TLB_CHECK_OPERATION_GENWRITE: UInt = 2u

public val XPF_TLB_CHECK_OPERATION_INSTRUCTIONFETCH: UInt = 5u

public val XPF_TLB_CHECK_OPERATION_PREFETCH: UInt = 6u

public val XPF_TLB_CHECK_TRANSACTIONTYPE_DATAACCESS: UInt = 1u

public val XPF_TLB_CHECK_TRANSACTIONTYPE_GENERIC: UInt = 2u

public val XPF_TLB_CHECK_TRANSACTIONTYPE_INSTRUCTION: UInt = 0u

public val STRSAFE_USE_SECURE_CRT: UInt = 0u

public val GUID_TYPE: UInt = 8192u

public val MULTI_STRING_TYPE: UInt = 16384u

public val STRING_TYPE: UInt = 4096u
