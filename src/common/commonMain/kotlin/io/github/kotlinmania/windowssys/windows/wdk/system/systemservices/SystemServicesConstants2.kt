package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID

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

public val PCI_RECOVERY_SECTION_GUID: GUID = GUID.from_u128(U128(0xdd060800f6e14204uL, 0xac27c4bca9568402uL))

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

public val PCIe_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0xcf93c01f1a164dfcuL, 0xb8bc9c4daf67c104uL))

public val PCMCIABus: INTERFACE_TYPE = 8

public val PCMCIAConfiguration: BUS_DATA_TYPE = 7

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

public val PEI_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x9a9d5ac52044214uL, 0x96e594992e752bcduL))

public val PFAControl: NPEM_CONTROL_STANDARD_CONTROL_BIT = 6

public val PLUGPLAY_PROPERTY_PERSISTENT: UInt = 1u

public val PLUGPLAY_REGKEY_CURRENT_HWPROFILE: UInt = 4u

public val PLUGPLAY_REGKEY_DEVICE: UInt = 1u

public val PLUGPLAY_REGKEY_DRIVER: UInt = 2u

public val PMCCounter: HARDWARE_COUNTER_TYPE = 0

public val PMEM_ERROR_SECTION_GUID: GUID = GUID.from_u128(U128(0x81687003dbfd4728uL, 0x9ffdf0904f97597duL))

public val PNPBus: INTERFACE_TYPE = 15

public val PNPISABus: INTERFACE_TYPE = 14

public val PNPISAConfiguration: BUS_DATA_TYPE = 10

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

public val PROCESSOR_GENERIC_ERROR_SECTION_GUID: GUID = GUID.from_u128(U128(0x9876ccad47b44bdbuL, 0xb65e16f193c4f3dbuL))

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

public val PageIn: KWAIT_REASON = 2

public val ParallelController: CONFIGURATION_TYPE = 20

public val PciAcsBitDisable: PCI_ACS_BIT = 2

public val PciAcsBitDontCare: PCI_ACS_BIT = 3

public val PciAcsBitEnable: PCI_ACS_BIT = 1

public val PciAcsReserved: PCI_ACS_BIT = 0

public val PciAddressParityError: UShort = 6u

public val PciBusDataParityError: UShort = 1u

public val PciBusMasterAbort: UShort = 3u

public val PciBusSystemError: UShort = 2u

public val PciBusTimeOut: UShort = 4u

public val PciBusUnknownError: UShort = 0u

public val PciCommandParityError: UShort = 7u

public val PciConventional: PCI_HARDWARE_INTERFACE = 0

public val PciDeviceD3Cold_Reason_Default_State_BitIndex: PCI_DEVICE_D3COLD_STATE_REASON = 8

public val PciDeviceD3Cold_Reason_INF_BitIndex: PCI_DEVICE_D3COLD_STATE_REASON = 9

public val PciDeviceD3Cold_Reason_Interface_Api_BitIndex: PCI_DEVICE_D3COLD_STATE_REASON = 10

public val PciDeviceD3Cold_State_Disabled_BitIndex: PCI_DEVICE_D3COLD_STATE_REASON = 1

public val PciDeviceD3Cold_State_Disabled_Bridge_HackFlags_BitIndex: PCI_DEVICE_D3COLD_STATE_REASON = 4

public val PciDeviceD3Cold_State_Enabled_BitIndex: PCI_DEVICE_D3COLD_STATE_REASON = 2

public val PciDeviceD3Cold_State_ParentRootPortS0WakeSupported_BitIndex: PCI_DEVICE_D3COLD_STATE_REASON = 3

public val PciExpress: PCI_HARDWARE_INTERFACE = 3

public val PciExpressASPMLinkSubState_L11_BitIndex: PCI_EXPRESS_LINK_SUBSTATE = 2

public val PciExpressASPMLinkSubState_L12_BitIndex: PCI_EXPRESS_LINK_SUBSTATE = 3

public val PciExpressDownstreamSwitchPort: PCI_EXPRESS_DEVICE_TYPE = 6

public val PciExpressEndpoint: PCI_EXPRESS_DEVICE_TYPE = 0

public val PciExpressLegacyEndpoint: PCI_EXPRESS_DEVICE_TYPE = 1

public val PciExpressPciPmLinkSubState_L11_BitIndex: PCI_EXPRESS_LINK_SUBSTATE = 0

public val PciExpressPciPmLinkSubState_L12_BitIndex: PCI_EXPRESS_LINK_SUBSTATE = 1

public val PciExpressRootComplexEventCollector: PCI_EXPRESS_DEVICE_TYPE = 10

public val PciExpressRootComplexIntegratedEndpoint: PCI_EXPRESS_DEVICE_TYPE = 9

public val PciExpressRootPort: PCI_EXPRESS_DEVICE_TYPE = 4

public val PciExpressToPciXBridge: PCI_EXPRESS_DEVICE_TYPE = 7

public val PciExpressUpstreamSwitchPort: PCI_EXPRESS_DEVICE_TYPE = 5

public val PciMasterDataParityError: UShort = 5u

public val PciXMode1: PCI_HARDWARE_INTERFACE = 1

public val PciXMode2: PCI_HARDWARE_INTERFACE = 2

public val PciXToExpressBridge: PCI_EXPRESS_DEVICE_TYPE = 8

public val PcwCallbackAddCounter: PCW_CALLBACK_TYPE = 0

public val PcwCallbackCollectData: PCW_CALLBACK_TYPE = 3

public val PcwCallbackEnumerateInstances: PCW_CALLBACK_TYPE = 2

public val PcwCallbackRemoveCounter: PCW_CALLBACK_TYPE = 1

public val PcwRegistrationNone: PCW_REGISTRATION_FLAGS = 0

public val PcwRegistrationSiloNeutral: PCW_REGISTRATION_FLAGS = 1

public val PermissionFault: FAULT_INFORMATION_ARM64_TYPE = 4

public val PlatformLevelDeviceReset: DEVICE_RESET_TYPE = 1

public val PlatformRoleAppliancePC: POWER_PLATFORM_ROLE = 6

public val PlatformRoleDesktop: POWER_PLATFORM_ROLE = 1

public val PlatformRoleEnterpriseServer: POWER_PLATFORM_ROLE = 4

public val PlatformRoleMaximum: POWER_PLATFORM_ROLE = 9

public val PlatformRoleMobile: POWER_PLATFORM_ROLE = 2

public val PlatformRolePerformanceServer: POWER_PLATFORM_ROLE = 7

public val PlatformRoleSOHOServer: POWER_PLATFORM_ROLE = 5

public val PlatformRoleSlate: POWER_PLATFORM_ROLE = 8

public val PlatformRoleUnspecified: POWER_PLATFORM_ROLE = 0

public val PlatformRoleWorkstation: POWER_PLATFORM_ROLE = 3

public val PoAc: SYSTEM_POWER_CONDITION = 0

public val PoConditionMaximum: SYSTEM_POWER_CONDITION = 3

public val PoDc: SYSTEM_POWER_CONDITION = 1

public val PoFxPerfStateTypeDiscrete: PO_FX_PERF_STATE_TYPE = 0

public val PoFxPerfStateTypeMaximum: PO_FX_PERF_STATE_TYPE = 2

public val PoFxPerfStateTypeRange: PO_FX_PERF_STATE_TYPE = 1

public val PoFxPerfStateUnitBandwidth: PO_FX_PERF_STATE_UNIT = 2

public val PoFxPerfStateUnitFrequency: PO_FX_PERF_STATE_UNIT = 1

public val PoFxPerfStateUnitMaximum: PO_FX_PERF_STATE_UNIT = 3

public val PoFxPerfStateUnitOther: PO_FX_PERF_STATE_UNIT = 0

public val PoHot: SYSTEM_POWER_CONDITION = 2

public val PoThermalRequestActive: PO_THERMAL_REQUEST_TYPE = 1

public val PoThermalRequestPassive: PO_THERMAL_REQUEST_TYPE = 0

public val PointerController: CONFIGURATION_TYPE = 21

public val PointerPeripheral: CONFIGURATION_TYPE = 31

public val PoolAllocation: KWAIT_REASON = 3

public val PoolExtendedParameterInvalidType: POOL_EXTENDED_PARAMETER_TYPE = 0

public val PoolExtendedParameterMax: POOL_EXTENDED_PARAMETER_TYPE = 4

public val PoolExtendedParameterNumaNode: POOL_EXTENDED_PARAMETER_TYPE = 3

public val PoolExtendedParameterPriority: POOL_EXTENDED_PARAMETER_TYPE = 1

public val PoolExtendedParameterSecurePool: POOL_EXTENDED_PARAMETER_TYPE = 2

public val Pos: BUS_DATA_TYPE = 2

public val PowerOff: PCI_EXPRESS_POWER_STATE = 1

public val PowerOn: PCI_EXPRESS_POWER_STATE = 0

public val PowerRelations: DEVICE_RELATION_TYPE = 2

public val PrimaryDcache: CONFIGURATION_TYPE = 4

public val PrimaryIcache: CONFIGURATION_TYPE = 3

public val PrinterPeripheral: CONFIGURATION_TYPE = 30

public val ProcessorInternal: INTERFACE_TYPE = 12

public val Profile2Issue: KPROFILE_SOURCE = 15

public val Profile3Issue: KPROFILE_SOURCE = 16

public val Profile4Issue: KPROFILE_SOURCE = 17

public val ProfileAlignmentFixup: KPROFILE_SOURCE = 1

public val ProfileBranchInstructions: KPROFILE_SOURCE = 6

public val ProfileBranchMispredictions: KPROFILE_SOURCE = 11

public val ProfileCacheMisses: KPROFILE_SOURCE = 10

public val ProfileDcacheAccesses: KPROFILE_SOURCE = 21

public val ProfileDcacheMisses: KPROFILE_SOURCE = 8

public val ProfileFpInstructions: KPROFILE_SOURCE = 13

public val ProfileIcacheIssues: KPROFILE_SOURCE = 20

public val ProfileIcacheMisses: KPROFILE_SOURCE = 9

public val ProfileIntegerInstructions: KPROFILE_SOURCE = 14

public val ProfileLoadInstructions: KPROFILE_SOURCE = 4

public val ProfileLoadLinkedIssues: KPROFILE_SOURCE = 23

public val ProfileMaximum: KPROFILE_SOURCE = 24

public val ProfileMemoryBarrierCycles: KPROFILE_SOURCE = 22

public val ProfilePipelineDry: KPROFILE_SOURCE = 3

public val ProfilePipelineFrozen: KPROFILE_SOURCE = 5

public val ProfileSpecialInstructions: KPROFILE_SOURCE = 18

public val ProfileStoreInstructions: KPROFILE_SOURCE = 12

public val ProfileTime: KPROFILE_SOURCE = 0

public val ProfileTotalCycles: KPROFILE_SOURCE = 19

public val ProfileTotalIssues: KPROFILE_SOURCE = 2

public val ProfileTotalNonissues: KPROFILE_SOURCE = 7

public val PsCreateProcessNotifySubsystems: PSCREATEPROCESSNOTIFYTYPE = 0

public val PsCreateThreadNotifyNonSystem: PSCREATETHREADNOTIFYTYPE = 0

public val PsCreateThreadNotifySubsystems: PSCREATETHREADNOTIFYTYPE = 1

public val PshedFADiscovery: UInt = 1u

public val PshedFAErrorInfoRetrieval: UInt = 8u

public val PshedFAErrorInjection: UInt = 32u

public val PshedFAErrorRecordPersistence: UInt = 4u

public val PshedFAErrorRecovery: UInt = 16u

public val PshedFAErrorSourceControl: UInt = 2u

public val PshedPiEnableNotifyErrorCreateNotifyEvent: WHEA_PSHED_PLUGIN_ENABLE_NOTIFY_ERRORS = 1

public val PshedPiEnableNotifyErrorCreateSystemThread: WHEA_PSHED_PLUGIN_ENABLE_NOTIFY_ERRORS = 2

public val PshedPiEnableNotifyErrorMax: WHEA_PSHED_PLUGIN_ENABLE_NOTIFY_ERRORS = 3

public val PshedPiErrReadingPcieOverridesBadSignature: PSHED_PI_ERR_READING_PCIE_OVERRIDES = 4

public val PshedPiErrReadingPcieOverridesBadSize: PSHED_PI_ERR_READING_PCIE_OVERRIDES = 3

public val PshedPiErrReadingPcieOverridesNoCapOffset: PSHED_PI_ERR_READING_PCIE_OVERRIDES = 5

public val PshedPiErrReadingPcieOverridesNoErr: PSHED_PI_ERR_READING_PCIE_OVERRIDES = 0

public val PshedPiErrReadingPcieOverridesNoMemory: PSHED_PI_ERR_READING_PCIE_OVERRIDES = 1

public val PshedPiErrReadingPcieOverridesNotBinary: PSHED_PI_ERR_READING_PCIE_OVERRIDES = 6

public val PshedPiErrReadingPcieOverridesQueryErr: PSHED_PI_ERR_READING_PCIE_OVERRIDES = 2

public val QuerySecurityDescriptor: SECURITY_OPERATION_CODE = 1

public val RCB128Bytes: PCI_EXPRESS_RCB = 1

public val RCB64Bytes: PCI_EXPRESS_RCB = 0

public val RECOVERY_INFO_SECTION_GUID: GUID = GUID.from_u128(U128(0xc34832a102c34c52uL, 0xa9f19f1d5d7723fcuL))

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

public val RandomAccess: IO_ACCESS_MODE = 1

public val ReadAccess: IO_ACCESS_TYPE = 0

public val RealModeIrqRoutingTable: CONFIGURATION_TYPE = 39

public val RealModePCIEnumeration: CONFIGURATION_TYPE = 40

public val RealTimeWorkQueue: WORK_QUEUE_TYPE = 5

public val RebuildControl: NPEM_CONTROL_STANDARD_CONTROL_BIT = 5

public val RegNtCallbackObjectContextCleanup: REG_NOTIFY_CLASS = 40

public val RegNtDeleteKey: REG_NOTIFY_CLASS = 0

public val RegNtDeleteValueKey: REG_NOTIFY_CLASS = 2

public val RegNtEnumerateKey: REG_NOTIFY_CLASS = 5

public val RegNtEnumerateValueKey: REG_NOTIFY_CLASS = 6

public val RegNtKeyHandleClose: REG_NOTIFY_CLASS = 14

public val RegNtPostCreateKey: REG_NOTIFY_CLASS = 11

public val RegNtPostCreateKeyEx: REG_NOTIFY_CLASS = 27

public val RegNtPostDeleteKey: REG_NOTIFY_CLASS = 15

public val RegNtPostDeleteValueKey: REG_NOTIFY_CLASS = 17

public val RegNtPostEnumerateKey: REG_NOTIFY_CLASS = 20

public val RegNtPostEnumerateValueKey: REG_NOTIFY_CLASS = 21

public val RegNtPostFlushKey: REG_NOTIFY_CLASS = 31

public val RegNtPostKeyHandleClose: REG_NOTIFY_CLASS = 25

public val RegNtPostLoadKey: REG_NOTIFY_CLASS = 33

public val RegNtPostOpenKey: REG_NOTIFY_CLASS = 13

public val RegNtPostOpenKeyEx: REG_NOTIFY_CLASS = 29

public val RegNtPostQueryKey: REG_NOTIFY_CLASS = 22

public val RegNtPostQueryKeyName: REG_NOTIFY_CLASS = 48

public val RegNtPostQueryKeySecurity: REG_NOTIFY_CLASS = 37

public val RegNtPostQueryMultipleValueKey: REG_NOTIFY_CLASS = 24

public val RegNtPostQueryValueKey: REG_NOTIFY_CLASS = 23

public val RegNtPostRenameKey: REG_NOTIFY_CLASS = 19

public val RegNtPostReplaceKey: REG_NOTIFY_CLASS = 46

public val RegNtPostRestoreKey: REG_NOTIFY_CLASS = 42

public val RegNtPostSaveKey: REG_NOTIFY_CLASS = 44

public val RegNtPostSaveMergedKey: REG_NOTIFY_CLASS = 50

public val RegNtPostSetInformationKey: REG_NOTIFY_CLASS = 18

public val RegNtPostSetKeySecurity: REG_NOTIFY_CLASS = 39

public val RegNtPostSetValueKey: REG_NOTIFY_CLASS = 16

public val RegNtPostUnLoadKey: REG_NOTIFY_CLASS = 35

public val RegNtPreCreateKey: REG_NOTIFY_CLASS = 10

public val RegNtPreCreateKeyEx: REG_NOTIFY_CLASS = 26

public val RegNtPreDeleteKey: REG_NOTIFY_CLASS = 0

public val RegNtPreDeleteValueKey: REG_NOTIFY_CLASS = 2

public val RegNtPreEnumerateKey: REG_NOTIFY_CLASS = 5

public val RegNtPreEnumerateValueKey: REG_NOTIFY_CLASS = 6

public val RegNtPreFlushKey: REG_NOTIFY_CLASS = 30

public val RegNtPreKeyHandleClose: REG_NOTIFY_CLASS = 14

public val RegNtPreLoadKey: REG_NOTIFY_CLASS = 32

public val RegNtPreOpenKey: REG_NOTIFY_CLASS = 12

public val RegNtPreOpenKeyEx: REG_NOTIFY_CLASS = 28

public val RegNtPreQueryKey: REG_NOTIFY_CLASS = 7

public val RegNtPreQueryKeyName: REG_NOTIFY_CLASS = 47

public val RegNtPreQueryKeySecurity: REG_NOTIFY_CLASS = 36

public val RegNtPreQueryMultipleValueKey: REG_NOTIFY_CLASS = 9

public val RegNtPreQueryValueKey: REG_NOTIFY_CLASS = 8

public val RegNtPreRenameKey: REG_NOTIFY_CLASS = 4

public val RegNtPreReplaceKey: REG_NOTIFY_CLASS = 45

public val RegNtPreRestoreKey: REG_NOTIFY_CLASS = 41

public val RegNtPreSaveKey: REG_NOTIFY_CLASS = 43

public val RegNtPreSaveMergedKey: REG_NOTIFY_CLASS = 49

public val RegNtPreSetInformationKey: REG_NOTIFY_CLASS = 3

public val RegNtPreSetKeySecurity: REG_NOTIFY_CLASS = 38

public val RegNtPreSetValueKey: REG_NOTIFY_CLASS = 1

public val RegNtPreUnLoadKey: REG_NOTIFY_CLASS = 34

public val RegNtQueryKey: REG_NOTIFY_CLASS = 7

public val RegNtQueryMultipleValueKey: REG_NOTIFY_CLASS = 9

public val RegNtQueryValueKey: REG_NOTIFY_CLASS = 8

public val RegNtRenameKey: REG_NOTIFY_CLASS = 4

public val RegNtSetInformationKey: REG_NOTIFY_CLASS = 3

public val RegNtSetValueKey: REG_NOTIFY_CLASS = 1

public val RemovalPolicyExpectNoRemoval: DEVICE_REMOVAL_POLICY = 1

public val RemovalPolicyExpectOrderlyRemoval: DEVICE_REMOVAL_POLICY = 2

public val RemovalPolicyExpectSurpriseRemoval: DEVICE_REMOVAL_POLICY = 3

public val RemovalRelations: DEVICE_RELATION_TYPE = 3

public val ResourceNeverExclusive: UInt = 16u

public val ResourceOwnedExclusive: UInt = 128u

public val ResourceReleaseByOtherThread: UInt = 32u

public val ResourceTypeEventBuffer: PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_TYPE = 4

public val ResourceTypeExtendedCounterConfiguration: PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_TYPE = 2

public val ResourceTypeIdenitificationTag: PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_TYPE = 5

public val ResourceTypeMax: PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_TYPE = 6

public val ResourceTypeOverflow: PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_TYPE = 3

public val ResourceTypeRange: PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_TYPE = 1

public val ResourceTypeSingle: PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_TYPE = 0

public val ResultNegative: INTERLOCKED_RESULT = 32768

public val ResultPositive: INTERLOCKED_RESULT = 0

public val ResultZero: INTERLOCKED_RESULT = 16384

public val SCI_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0xe9d5919794ee4a4fuL, 0x8ad89b7d8bd93d2euL))

public val SDEV_IDENTIFIER_INTERFACE_VERSION: UInt = 1u

public val SEA_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x9a78788abbe811e4uL, 0x809e67611e5d46b0uL))

public val SEA_SECTION_GUID: GUID = GUID.from_u128(U128(0xf5fe48a684ce4c1euL, 0xaa6420c9a53099f1uL))

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

public val SEI_NOTIFY_TYPE_GUID: GUID = GUID.from_u128(U128(0x5c284c81b0ae4e87uL, 0xa322b04c85624323uL))

public val SEI_SECTION_GUID: GUID = GUID.from_u128(U128(0xf2a4a1529c6d4020uL, 0xaecf7695b389251buL))

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

public val SOC_SUBSYS_AUDIO_DSP: SOC_SUBSYSTEM_TYPE = 1

public val SOC_SUBSYS_COMPUTE_DSP: SOC_SUBSYSTEM_TYPE = 4

public val SOC_SUBSYS_SECURE_PROC: SOC_SUBSYSTEM_TYPE = 5

public val SOC_SUBSYS_SENSORS: SOC_SUBSYSTEM_TYPE = 3

public val SOC_SUBSYS_VENDOR_DEFINED: SOC_SUBSYSTEM_TYPE = 65536

public val SOC_SUBSYS_WIRELESS_MODEM: SOC_SUBSYSTEM_TYPE = 0

public val SOC_SUBSYS_WIRELSS_CONNECTIVITY: SOC_SUBSYSTEM_TYPE = 2

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

public val ScsiAdapter: CONFIGURATION_TYPE = 10

public val SeImageTypeDriver: SE_IMAGE_TYPE = 1

public val SeImageTypeDynamicCodeFile: SE_IMAGE_TYPE = 3

public val SeImageTypeElamDriver: SE_IMAGE_TYPE = 0

public val SeImageTypeMax: SE_IMAGE_TYPE = 4

public val SeImageTypePlatformSecureFile: SE_IMAGE_TYPE = 2

public val SeImageVerificationCallbackInformational: SE_IMAGE_VERIFICATION_CALLBACK_TYPE = 0

public val SecondaryCache: CONFIGURATION_TYPE = 7

public val SecondaryDcache: CONFIGURATION_TYPE = 6

public val SecondaryIcache: CONFIGURATION_TYPE = 5

public val SequentialAccess: IO_ACCESS_MODE = 0

public val SerialController: CONFIGURATION_TYPE = 17

public val SetSecurityDescriptor: SECURITY_OPERATION_CODE = 0

public val SgiInternalConfiguration: BUS_DATA_TYPE = 11

public val SharedInterruptTime: UInt = 4292804616u

public val SharedSystemTime: UInt = 4292804628u

public val SharedTickCount: UInt = 4292805408u

public val SingleBusRelations: DEVICE_RELATION_TYPE = 5

public val SlotEmpty: PCI_EXPRESS_CARD_PRESENCE = 0

public val StandardDesign: ALTERNATIVE_ARCHITECTURE_TYPE = 0

public val StopCompletion: IO_COMPLETION_ROUTINE_RESULT = -1073741802

public val SubsystemInformationTypeWSL: SUBSYSTEM_INFORMATION_TYPE = 1

public val SubsystemInformationTypeWin32: SUBSYSTEM_INFORMATION_TYPE = 0

public val SuperCriticalWorkQueue: WORK_QUEUE_TYPE = 6

public val Suspended: KWAIT_REASON = 5

public val SystemFirmwareTable_Enumerate: SYSTEM_FIRMWARE_TABLE_ACTION = 0

public val SystemFirmwareTable_Get: SYSTEM_FIRMWARE_TABLE_ACTION = 1

public val SystemMemory: CONFIGURATION_TYPE = 37

public val SystemMemoryPartitionDedicatedMemoryInformation: PARTITION_INFORMATION_CLASS = 9

public val SystemMemoryPartitionInformation: PARTITION_INFORMATION_CLASS = 0

public val SystemMemoryPartitionOpenDedicatedMemory: PARTITION_INFORMATION_CLASS = 10

public val SystemPowerState: POWER_STATE_TYPE = 0

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

public val TableEmptyTree: TABLE_SEARCH_RESULT = 0

public val TableFoundNode: TABLE_SEARCH_RESULT = 1

public val TableInsertAsLeft: TABLE_SEARCH_RESULT = 2

public val TableInsertAsRight: TABLE_SEARCH_RESULT = 3

public val TapeController: CONFIGURATION_TYPE = 14

public val TapePeripheral: CONFIGURATION_TYPE = 27

public val TargetDeviceRelation: DEVICE_RELATION_TYPE = 4

public val TcAdapter: CONFIGURATION_TYPE = 9

public val TerminalPeripheral: CONFIGURATION_TYPE = 33

public val TlbMatchConflict: FAULT_INFORMATION_ARM64_TYPE = 2

public val TraceEnableFlagsClass: TRACE_INFORMATION_CLASS = 2

public val TraceEnableLevelClass: TRACE_INFORMATION_CLASS = 3

public val TraceHandleByNameClass: TRACE_INFORMATION_CLASS = 7

public val TraceHandleClass: TRACE_INFORMATION_CLASS = 1

public val TraceIdClass: TRACE_INFORMATION_CLASS = 0

public val TraceInformationClassReserved1: TRACE_INFORMATION_CLASS = 12

public val TraceInformationClassReserved2: TRACE_INFORMATION_CLASS = 14

public val TraceSessionSettingsClass: TRACE_INFORMATION_CLASS = 9

public val TranslateChildToParent: RESOURCE_TRANSLATION_DIRECTION = 0

public val TranslateParentToChild: RESOURCE_TRANSLATION_DIRECTION = 1

public val TranslationFault: FAULT_INFORMATION_ARM64_TYPE = 6

public val TransportRelations: DEVICE_RELATION_TYPE = 6

public val TurboChannel: INTERFACE_TYPE = 4

public val TypeA: DMA_SPEED = 1

public val TypeB: DMA_SPEED = 2

public val TypeC: DMA_SPEED = 3

public val TypeF: DMA_SPEED = 4

public val UADDRESS_BASE: UInt = 0u

public val UnsupportedUpstreamTransaction: FAULT_INFORMATION_ARM64_TYPE = 0

public val UserMode: MODE = 1

public val UserNotPresent: POWER_USER_PRESENCE_TYPE = 0

public val UserPresent: POWER_USER_PRESENCE_TYPE = 1

public val UserRequest: KWAIT_REASON = 6

public val UserUnknown: POWER_USER_PRESENCE_TYPE = 255

public val VMEBus: INTERFACE_TYPE = 6

public val VMEConfiguration: BUS_DATA_TYPE = 5

public val VPB_DIRECT_WRITES_ALLOWED: UInt = 32u

public val VPB_DISMOUNTING: UInt = 128u

public val VPB_FLAGS_BYPASSIO_BLOCKED: UInt = 64u

public val VPB_LOCKED: UInt = 2u

public val VPB_MOUNTED: UInt = 1u

public val VPB_PERSISTENT: UInt = 4u

public val VPB_RAW_MOUNT: UInt = 16u

public val VPB_REMOVE_PENDING: UInt = 8u

public val Vmcs: INTERFACE_TYPE = 16

public val WCS_RAS_REGISTER_NAME_MAX_LENGTH: UInt = 32u

public val WDM_MAJORVERSION: UInt = 6u

public val WDM_MINORVERSION: UInt = 0u

public val WHEA_AMD_EXT_REG_NUM: UInt = 10u

public val WHEA_BUSCHECK_GUID: GUID = GUID.from_u128(U128(0x1cf3f8b3c5b149a2uL, 0xaa595eef92ffa63cuL))

public val WHEA_CACHECHECK_GUID: GUID = GUID.from_u128(U128(0xa55701f5e3ef43deuL, 0xac72249b573fad2cuL))

public val WHEA_DEVICE_ERROR_SUMMARY_GUID: GUID = GUID.from_u128(U128(0x990b31e9541a4db0uL, 0xa42f837d344f6923uL))

public val WHEA_DPC_CAPABILITY_SECTION_GUID: GUID = GUID.from_u128(U128(0xec49534b30e74358uL, 0x972feca6958fae3buL))

public val WHEA_ERROR_LOG_ENTRY_VERSION: UInt = 1u

public val WHEA_ERROR_PACKET_SECTION_GUID: GUID = GUID.from_u128(U128(0xe71254e9c1b94940uL, 0xab76909703a4320fuL))

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

public val WHEA_MSCHECK_GUID: GUID = GUID.from_u128(U128(0x48ab7f57dc344f6cuL, 0xa7d3b0b5b0a74314uL))

public val WHEA_PCIE_CORRECTABLE_ERROR_SECTION_COUNT_SIZE: UInt = 32u

public val WHEA_PLUGIN_REGISTRATION_PACKET_V1: UInt = 65536u

public val WHEA_PLUGIN_REGISTRATION_PACKET_V2: UInt = 131072u

public val WHEA_PLUGIN_REGISTRATION_PACKET_VERSION: UInt = 131072u

public val WHEA_PMEM_ERROR_SECTION_LOCATION_INFO_SIZE: UInt = 64u

public val WHEA_PMEM_ERROR_SECTION_MAX_PAGES: UInt = 50u

public val WHEA_RECORD_CREATOR_GUID: GUID = GUID.from_u128(U128(0xcf07c4bdb7894e18uL, 0xb3c41f732cb57131uL))

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

public val WHEA_TLBCHECK_GUID: GUID = GUID.from_u128(U128(0xfc06b5355e1f4562uL, 0x9f250a3b9adb63c3uL))

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

public val WdfNotifyRoutinesClass: TRACE_INFORMATION_CLASS = 15

public val WheaCpuVendorAmd: WHEA_CPU_VENDOR = 2

public val WheaCpuVendorIntel: WHEA_CPU_VENDOR = 1

public val WheaCpuVendorOther: WHEA_CPU_VENDOR = 0

public val WheaDataFormatGeneric: WHEA_ERROR_PACKET_DATA_FORMAT = 7

public val WheaDataFormatIPFSalRecord: WHEA_ERROR_PACKET_DATA_FORMAT = 0

public val WheaDataFormatMax: WHEA_ERROR_PACKET_DATA_FORMAT = 8

public val WheaDataFormatMemory: WHEA_ERROR_PACKET_DATA_FORMAT = 2

public val WheaDataFormatNMIPort: WHEA_ERROR_PACKET_DATA_FORMAT = 4

public val WheaDataFormatPCIExpress: WHEA_ERROR_PACKET_DATA_FORMAT = 3

public val WheaDataFormatPCIXBus: WHEA_ERROR_PACKET_DATA_FORMAT = 5

public val WheaDataFormatPCIXDevice: WHEA_ERROR_PACKET_DATA_FORMAT = 6

public val WheaDataFormatXPFMCA: WHEA_ERROR_PACKET_DATA_FORMAT = 1

public val WheaErrSevCorrected: WHEA_ERROR_SEVERITY = 2

public val WheaErrSevFatal: WHEA_ERROR_SEVERITY = 1

public val WheaErrSevInformational: WHEA_ERROR_SEVERITY = 3

public val WheaErrSevRecoverable: WHEA_ERROR_SEVERITY = 0

public val WheaErrTypeGeneric: WHEA_ERROR_TYPE = 6

public val WheaErrTypeMemory: WHEA_ERROR_TYPE = 1

public val WheaErrTypeNMI: WHEA_ERROR_TYPE = 3

public val WheaErrTypePCIExpress: WHEA_ERROR_TYPE = 2

public val WheaErrTypePCIXBus: WHEA_ERROR_TYPE = 4

public val WheaErrTypePCIXDevice: WHEA_ERROR_TYPE = 5

public val WheaErrTypePmem: WHEA_ERROR_TYPE = 7

public val WheaErrTypeProcessor: WHEA_ERROR_TYPE = 0

public val WheaEventBugCheckRecoveryEntry: WHEA_BUGCHECK_RECOVERY_LOG_TYPE = 0

public val WheaEventBugCheckRecoveryMax: WHEA_BUGCHECK_RECOVERY_LOG_TYPE = 2

public val WheaEventBugCheckRecoveryReturn: WHEA_BUGCHECK_RECOVERY_LOG_TYPE = 1

public val WheaEventLogAzccRootBusList: WHEA_EVENT_LOG_ENTRY_ID = -2147483617

public val WheaEventLogAzccRootBusPoisonSet: WHEA_EVENT_LOG_ENTRY_ID = -2147483602

public val WheaEventLogAzccRootBusSearchErr: WHEA_EVENT_LOG_ENTRY_ID = -2147483618

public val WheaEventLogCmciFinalRestart: WHEA_EVENT_LOG_ENTRY_ID = -2147483620

public val WheaEventLogCmciRestart: WHEA_EVENT_LOG_ENTRY_ID = -2147483621

public val WheaEventLogEntryEarlyError: WHEA_EVENT_LOG_ENTRY_ID = -2147483594

public val WheaEventLogEntryEtwOverFlow: WHEA_EVENT_LOG_ENTRY_ID = -2147483619

public val WheaEventLogEntryIdAcpiTimeOut: WHEA_EVENT_LOG_ENTRY_ID = -2147483622

public val WheaEventLogEntryIdAddRemoveErrorSource: WHEA_EVENT_LOG_ENTRY_ID = -2147483636

public val WheaEventLogEntryIdAerNotGrantedToOs: WHEA_EVENT_LOG_ENTRY_ID = -2147483624

public val WheaEventLogEntryIdAttemptErrorRecovery: WHEA_EVENT_LOG_ENTRY_ID = -2147483634

public val WheaEventLogEntryIdBadHestNotifyData: WHEA_EVENT_LOG_ENTRY_ID = -2147483565

public val WheaEventLogEntryIdBadPageLimitReached: WHEA_EVENT_LOG_ENTRY_ID = -2147483596

public val WheaEventLogEntryIdClearedPoison: WHEA_EVENT_LOG_ENTRY_ID = -2147483630

public val WheaEventLogEntryIdCmcPollingTimeout: WHEA_EVENT_LOG_ENTRY_ID = -2147483647

public val WheaEventLogEntryIdCmcSwitchToPolling: WHEA_EVENT_LOG_ENTRY_ID = -2147483645

public val WheaEventLogEntryIdCmciImplPresent: WHEA_EVENT_LOG_ENTRY_ID = -2147483608

public val WheaEventLogEntryIdCmciInitError: WHEA_EVENT_LOG_ENTRY_ID = -2147483607

public val WheaEventLogEntryIdCpuBusesInitFailed: WHEA_EVENT_LOG_ENTRY_ID = -2147483571

public val WheaEventLogEntryIdCpusFrozen: WHEA_EVENT_LOG_ENTRY_ID = -2147483552

public val WheaEventLogEntryIdCpusFrozenNoCrashDump: WHEA_EVENT_LOG_ENTRY_ID = -2147483551

public val WheaEventLogEntryIdCreateGenericRecord: WHEA_EVENT_LOG_ENTRY_ID = -2147483627

public val WheaEventLogEntryIdDefectListCorrupt: WHEA_EVENT_LOG_ENTRY_ID = -2147483566

public val WheaEventLogEntryIdDefectListFull: WHEA_EVENT_LOG_ENTRY_ID = -2147483568

public val WheaEventLogEntryIdDefectListUEFIVarFailed: WHEA_EVENT_LOG_ENTRY_ID = -2147483567

public val WheaEventLogEntryIdDeviceDriver: WHEA_EVENT_LOG_ENTRY_ID = -2147483609

public val WheaEventLogEntryIdDroppedCorrectedError: WHEA_EVENT_LOG_ENTRY_ID = -2147483644

public val WheaEventLogEntryIdDrvErrSrcInvalid: WHEA_EVENT_LOG_ENTRY_ID = -2147483605

public val WheaEventLogEntryIdDrvHandleBusy: WHEA_EVENT_LOG_ENTRY_ID = -2147483604

public val WheaEventLogEntryIdEnableKeyNotifFailed: WHEA_EVENT_LOG_ENTRY_ID = -2147483580

public val WheaEventLogEntryIdErrDimmInfoMismatch: WHEA_EVENT_LOG_ENTRY_ID = -2147483600

public val WheaEventLogEntryIdErrSrcArrayInvalid: WHEA_EVENT_LOG_ENTRY_ID = -2147483623

public val WheaEventLogEntryIdErrSrcInvalid: WHEA_EVENT_LOG_ENTRY_ID = -2147483616

public val WheaEventLogEntryIdErrorRecord: WHEA_EVENT_LOG_ENTRY_ID = -2147483626

public val WheaEventLogEntryIdErrorRecordLimit: WHEA_EVENT_LOG_ENTRY_ID = -2147483625

public val WheaEventLogEntryIdFailedAddToDefectList: WHEA_EVENT_LOG_ENTRY_ID = -2147483569

public val WheaEventLogEntryIdGenericErrMemMap: WHEA_EVENT_LOG_ENTRY_ID = -2147483615

public val WheaEventLogEntryIdKeyNotificationFailed: WHEA_EVENT_LOG_ENTRY_ID = -2147483579

public val WheaEventLogEntryIdMcaErrorCleared: WHEA_EVENT_LOG_ENTRY_ID = -2147483631

public val WheaEventLogEntryIdMcaFoundErrorInBank: WHEA_EVENT_LOG_ENTRY_ID = -2147483633

public val WheaEventLogEntryIdMcaStuckErrorCheck: WHEA_EVENT_LOG_ENTRY_ID = -2147483632

public val WheaEventLogEntryIdMemoryAddDevice: WHEA_EVENT_LOG_ENTRY_ID = -2147483575

public val WheaEventLogEntryIdMemoryRemoveDevice: WHEA_EVENT_LOG_ENTRY_ID = -2147483574

public val WheaEventLogEntryIdMemorySummaryFailed: WHEA_EVENT_LOG_ENTRY_ID = -2147483573

public val WheaEventLogEntryIdOscCapabilities: WHEA_EVENT_LOG_ENTRY_ID = -2147483638

public val WheaEventLogEntryIdPFAMemoryOfflined: WHEA_EVENT_LOG_ENTRY_ID = -2147483642

public val WheaEventLogEntryIdPFAMemoryPolicy: WHEA_EVENT_LOG_ENTRY_ID = -2147483640

public val WheaEventLogEntryIdPFAMemoryRemoveMonitor: WHEA_EVENT_LOG_ENTRY_ID = -2147483641

public val WheaEventLogEntryIdPcieAddDevice: WHEA_EVENT_LOG_ENTRY_ID = -2147483577

public val WheaEventLogEntryIdPcieConfigInfo: WHEA_EVENT_LOG_ENTRY_ID = -2147483591

public val WheaEventLogEntryIdPcieDpcError: WHEA_EVENT_LOG_ENTRY_ID = -2147483572

public val WheaEventLogEntryIdPcieOverrideInfo: WHEA_EVENT_LOG_ENTRY_ID = -2147483593

public val WheaEventLogEntryIdPcieRemoveDevice: WHEA_EVENT_LOG_ENTRY_ID = -2147483578

public val WheaEventLogEntryIdPcieSpuriousErrSource: WHEA_EVENT_LOG_ENTRY_ID = -2147483576

public val WheaEventLogEntryIdPcieSummaryFailed: WHEA_EVENT_LOG_ENTRY_ID = -2147483584

public val WheaEventLogEntryIdProcessEINJ: WHEA_EVENT_LOG_ENTRY_ID = -2147483629

public val WheaEventLogEntryIdProcessHEST: WHEA_EVENT_LOG_ENTRY_ID = -2147483628

public val WheaEventLogEntryIdPshedCallbackCollision: WHEA_EVENT_LOG_ENTRY_ID = -2147483614

public val WheaEventLogEntryIdPshedInjectError: WHEA_EVENT_LOG_ENTRY_ID = -2147483639

public val WheaEventLogEntryIdPshedPiTraceLog: WHEA_EVENT_LOG_ENTRY_ID = -2147221488

public val WheaEventLogEntryIdPshedPluginInitFailed: WHEA_EVENT_LOG_ENTRY_ID = -2147483570

public val WheaEventLogEntryIdPshedPluginLoad: WHEA_EVENT_LOG_ENTRY_ID = -2147483612

public val WheaEventLogEntryIdPshedPluginRegister: WHEA_EVENT_LOG_ENTRY_ID = -2147483637

public val WheaEventLogEntryIdPshedPluginSupported: WHEA_EVENT_LOG_ENTRY_ID = -2147483610

public val WheaEventLogEntryIdPshedPluginUnload: WHEA_EVENT_LOG_ENTRY_ID = -2147483611

public val WheaEventLogEntryIdReadPcieOverridesErr: WHEA_EVENT_LOG_ENTRY_ID = -2147483592

public val WheaEventLogEntryIdRowFailure: WHEA_EVENT_LOG_ENTRY_ID = -2147483561

public val WheaEventLogEntryIdSELBugCheckInfo: WHEA_EVENT_LOG_ENTRY_ID = -2147483601

public val WheaEventLogEntryIdSELBugCheckProgress: WHEA_EVENT_LOG_ENTRY_ID = -2147483613

public val WheaEventLogEntryIdSELBugCheckRecovery: WHEA_EVENT_LOG_ENTRY_ID = -2147483606

public val WheaEventLogEntryIdSrasTableEntries: WHEA_EVENT_LOG_ENTRY_ID = -2147483562

public val WheaEventLogEntryIdSrasTableError: WHEA_EVENT_LOG_ENTRY_ID = -2147483563

public val WheaEventLogEntryIdSrasTableNotFound: WHEA_EVENT_LOG_ENTRY_ID = -2147483564

public val WheaEventLogEntryIdStartedReportHwError: WHEA_EVENT_LOG_ENTRY_ID = -2147483643

public val WheaEventLogEntryIdThrottleAddErrSrcFailed: WHEA_EVENT_LOG_ENTRY_ID = -2147483582

public val WheaEventLogEntryIdThrottleRegCorrupt: WHEA_EVENT_LOG_ENTRY_ID = -2147483583

public val WheaEventLogEntryIdThrottleRegDataIgnored: WHEA_EVENT_LOG_ENTRY_ID = -2147483581

public val WheaEventLogEntryIdWheaHeartbeat: WHEA_EVENT_LOG_ENTRY_ID = -2147483603

public val WheaEventLogEntryIdWheaInit: WHEA_EVENT_LOG_ENTRY_ID = -2147483646

public val WheaEventLogEntryIdWorkQueueItem: WHEA_EVENT_LOG_ENTRY_ID = -2147483635

public val WheaEventLogEntryIdeDpcEnabled: WHEA_EVENT_LOG_ENTRY_ID = -2147483599

public val WheaEventLogEntryPageOfflineDone: WHEA_EVENT_LOG_ENTRY_ID = -2147483598

public val WheaEventLogEntryPageOfflinePendMax: WHEA_EVENT_LOG_ENTRY_ID = -2147483597

public val WheaEventLogEntrySrarDetail: WHEA_EVENT_LOG_ENTRY_ID = -2147483595

public val WheaEventLogEntryTypeError: WHEA_EVENT_LOG_ENTRY_TYPE = 2

public val WheaEventLogEntryTypeInformational: WHEA_EVENT_LOG_ENTRY_TYPE = 0

public val WheaEventLogEntryTypeWarning: WHEA_EVENT_LOG_ENTRY_TYPE = 1

public val WheaMemoryThrottle: WHEA_THROTTLE_TYPE = 1

public val WheaPciExpressDownstreamSwitchPort: WHEA_PCIEXPRESS_DEVICE_TYPE = 6

public val WheaPciExpressEndpoint: WHEA_PCIEXPRESS_DEVICE_TYPE = 0

public val WheaPciExpressLegacyEndpoint: WHEA_PCIEXPRESS_DEVICE_TYPE = 1

public val WheaPciExpressRootComplexEventCollector: WHEA_PCIEXPRESS_DEVICE_TYPE = 10

public val WheaPciExpressRootComplexIntegratedEndpoint: WHEA_PCIEXPRESS_DEVICE_TYPE = 9

public val WheaPciExpressRootPort: WHEA_PCIEXPRESS_DEVICE_TYPE = 4

public val WheaPciExpressToPciXBridge: WHEA_PCIEXPRESS_DEVICE_TYPE = 7

public val WheaPciExpressUpstreamSwitchPort: WHEA_PCIEXPRESS_DEVICE_TYPE = 5

public val WheaPciREcoveryStatusUnknown: WHEA_PCI_RECOVERY_STATUS = 0

public val WheaPciRecoverySignalAer: WHEA_PCI_RECOVERY_SIGNAL = 1

public val WheaPciRecoverySignalDpc: WHEA_PCI_RECOVERY_SIGNAL = 2

public val WheaPciRecoverySignalUnknown: WHEA_PCI_RECOVERY_SIGNAL = 0

public val WheaPciRecoveryStatusBusNotFound: WHEA_PCI_RECOVERY_STATUS = 6

public val WheaPciRecoveryStatusComplexTree: WHEA_PCI_RECOVERY_STATUS = 5

public val WheaPciRecoveryStatusLinkDisableTimeout: WHEA_PCI_RECOVERY_STATUS = 2

public val WheaPciRecoveryStatusLinkEnableTimeout: WHEA_PCI_RECOVERY_STATUS = 3

public val WheaPciRecoveryStatusNoError: WHEA_PCI_RECOVERY_STATUS = 1

public val WheaPciRecoveryStatusRpBusyTimeout: WHEA_PCI_RECOVERY_STATUS = 4

public val WheaPciXToExpressBridge: WHEA_PCIEXPRESS_DEVICE_TYPE = 8

public val WheaPcieThrottle: WHEA_THROTTLE_TYPE = 0

public val WheaPfaRemoveCapacity: WHEA_PFA_REMOVE_TRIGGER = 3

public val WheaPfaRemoveErrorThreshold: WHEA_PFA_REMOVE_TRIGGER = 1

public val WheaPfaRemoveTimeout: WHEA_PFA_REMOVE_TRIGGER = 2

public val WheaRawDataFormatAMD64MCA: WHEA_RAW_DATA_FORMAT = 3

public val WheaRawDataFormatGeneric: WHEA_RAW_DATA_FORMAT = 9

public val WheaRawDataFormatIA32MCA: WHEA_RAW_DATA_FORMAT = 1

public val WheaRawDataFormatIPFSalRecord: WHEA_RAW_DATA_FORMAT = 0

public val WheaRawDataFormatIntel64MCA: WHEA_RAW_DATA_FORMAT = 2

public val WheaRawDataFormatMax: WHEA_RAW_DATA_FORMAT = 10

public val WheaRawDataFormatMemory: WHEA_RAW_DATA_FORMAT = 4

public val WheaRawDataFormatNMIPort: WHEA_RAW_DATA_FORMAT = 6

public val WheaRawDataFormatPCIExpress: WHEA_RAW_DATA_FORMAT = 5

public val WheaRawDataFormatPCIXBus: WHEA_RAW_DATA_FORMAT = 7

public val WheaRawDataFormatPCIXDevice: WHEA_RAW_DATA_FORMAT = 8

public val WheaRecoveryContextErrorTypeMax: WHEA_RECOVERY_CONTEXT_ERROR_TYPE = 3

public val WheaRecoveryContextErrorTypeMemory: WHEA_RECOVERY_CONTEXT_ERROR_TYPE = 1

public val WheaRecoveryContextErrorTypePmem: WHEA_RECOVERY_CONTEXT_ERROR_TYPE = 2

public val WheaRecoveryFailureReasonFarNotValid: WHEA_RECOVERY_FAILURE_REASON = 17

public val WheaRecoveryFailureReasonHighIrql: WHEA_RECOVERY_FAILURE_REASON = 10

public val WheaRecoveryFailureReasonInsufficientAltContextWrappers: WHEA_RECOVERY_FAILURE_REASON = 11

public val WheaRecoveryFailureReasonInterruptsDisabled: WHEA_RECOVERY_FAILURE_REASON = 12

public val WheaRecoveryFailureReasonInvalidAddressMode: WHEA_RECOVERY_FAILURE_REASON = 9

public val WheaRecoveryFailureReasonKernelCouldNotMarkMemoryBad: WHEA_RECOVERY_FAILURE_REASON = 1

public val WheaRecoveryFailureReasonKernelMarkMemoryBadTimedOut: WHEA_RECOVERY_FAILURE_REASON = 2

public val WheaRecoveryFailureReasonKernelWillPageFaultBCAtCurrentIrql: WHEA_RECOVERY_FAILURE_REASON = 16

public val WheaRecoveryFailureReasonMax: WHEA_RECOVERY_FAILURE_REASON = 18

public val WheaRecoveryFailureReasonMiscOrAddrNotValid: WHEA_RECOVERY_FAILURE_REASON = 8

public val WheaRecoveryFailureReasonNoRecoveryContext: WHEA_RECOVERY_FAILURE_REASON = 3

public val WheaRecoveryFailureReasonNotContinuable: WHEA_RECOVERY_FAILURE_REASON = 4

public val WheaRecoveryFailureReasonNotSupported: WHEA_RECOVERY_FAILURE_REASON = 7

public val WheaRecoveryFailureReasonOverflow: WHEA_RECOVERY_FAILURE_REASON = 6

public val WheaRecoveryFailureReasonPcc: WHEA_RECOVERY_FAILURE_REASON = 5

public val WheaRecoveryFailureReasonStackOverflow: WHEA_RECOVERY_FAILURE_REASON = 14

public val WheaRecoveryFailureReasonSwapBusy: WHEA_RECOVERY_FAILURE_REASON = 13

public val WheaRecoveryFailureReasonUnexpectedFailure: WHEA_RECOVERY_FAILURE_REASON = 15

public val WheaRecoveryTypeActionOptional: WHEA_RECOVERY_TYPE = 2

public val WheaRecoveryTypeActionRequired: WHEA_RECOVERY_TYPE = 1

public val WheaRecoveryTypeMax: WHEA_RECOVERY_TYPE = 3

public val WheapDpcErrBusNotFound: WHEAP_DPC_ERROR_EVENT_TYPE = 1

public val WheapDpcErrDeviceIdBad: WHEAP_DPC_ERROR_EVENT_TYPE = 3

public val WheapDpcErrDpcedSubtree: WHEAP_DPC_ERROR_EVENT_TYPE = 2

public val WheapDpcErrNoChildren: WHEAP_DPC_ERROR_EVENT_TYPE = 5

public val WheapDpcErrNoErr: WHEAP_DPC_ERROR_EVENT_TYPE = 0

public val WheapDpcErrResetFailed: WHEAP_DPC_ERROR_EVENT_TYPE = 4

public val WheapPfaOfflinePredictiveFailure: WHEAP_PFA_OFFLINE_DECISION_TYPE = 1

public val WheapPfaOfflineUncorrectedError: WHEAP_PFA_OFFLINE_DECISION_TYPE = 2

public val Width16Bits: DMA_WIDTH = 1

public val Width32Bits: DMA_WIDTH = 2

public val Width64Bits: DMA_WIDTH = 3

public val Width8Bits: DMA_WIDTH = 0

public val WidthNoWrap: DMA_WIDTH = 4

public val WormController: CONFIGURATION_TYPE = 16

public val WrAlertByThreadId: KWAIT_REASON = 37

public val WrCalloutStack: KWAIT_REASON = 25

public val WrCpuRateControl: KWAIT_REASON = 24

public val WrDeferredPreempt: KWAIT_REASON = 38

public val WrDelayExecution: KWAIT_REASON = 11

public val WrDispatchInt: KWAIT_REASON = 31

public val WrExecutive: KWAIT_REASON = 7

public val WrFastMutex: KWAIT_REASON = 34

public val WrFreePage: KWAIT_REASON = 8

public val WrGuardedMutex: KWAIT_REASON = 35

public val WrIoRing: KWAIT_REASON = 40

public val WrKernel: KWAIT_REASON = 26

public val WrKeyedEvent: KWAIT_REASON = 21

public val WrLpcReceive: KWAIT_REASON = 16

public val WrLpcReply: KWAIT_REASON = 17

public val WrMdlCache: KWAIT_REASON = 41

public val WrMutex: KWAIT_REASON = 29

public val WrPageIn: KWAIT_REASON = 9

public val WrPageOut: KWAIT_REASON = 19

public val WrPhysicalFault: KWAIT_REASON = 39

public val WrPoolAllocation: KWAIT_REASON = 10

public val WrPreempted: KWAIT_REASON = 32

public val WrProcessInSwap: KWAIT_REASON = 23

public val WrPushLock: KWAIT_REASON = 28

public val WrQuantumEnd: KWAIT_REASON = 30

public val WrQueue: KWAIT_REASON = 15

public val WrRendezvous: KWAIT_REASON = 20

public val WrResource: KWAIT_REASON = 27

public val WrRundown: KWAIT_REASON = 36

public val WrSpare0: KWAIT_REASON = 14

public val WrSuspended: KWAIT_REASON = 12

public val WrTerminated: KWAIT_REASON = 22

public val WrUserRequest: KWAIT_REASON = 13

public val WrVirtualMemory: KWAIT_REASON = 18

public val WrYieldExecution: KWAIT_REASON = 33

public val WriteAccess: IO_ACCESS_TYPE = 1

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

public val XPF_MCA_SECTION_GUID: GUID = GUID.from_u128(U128(0x8a1e1d0142f94557uL, 0x9c33565e5cc3f7e8uL))

public val XPF_MS_CHECK_ERRORTYPE_EXTERNAL: UInt = 3u

public val XPF_MS_CHECK_ERRORTYPE_FRC: UInt = 4u

public val XPF_MS_CHECK_ERRORTYPE_INTERNALUNCLASSIFIED: UInt = 5u

public val XPF_MS_CHECK_ERRORTYPE_MCROMPARITY: UInt = 2u

public val XPF_MS_CHECK_ERRORTYPE_NOERROR: UInt = 0u

public val XPF_MS_CHECK_ERRORTYPE_UNCLASSIFIED: UInt = 1u

public val XPF_PROCESSOR_ERROR_SECTION_GUID: GUID = GUID.from_u128(U128(0xdc3ea0b0a1444797uL, 0xb95b53fa242b6e1duL))

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

public val _STRSAFE_USE_SECURE_CRT: UInt = 0u

public val __guid_type: UInt = 8192u

public val __multiString_type: UInt = 16384u

public val __string_type: UInt = 4096u
