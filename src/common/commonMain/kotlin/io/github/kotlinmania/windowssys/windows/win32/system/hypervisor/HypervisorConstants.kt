package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val ARM64_RegisterActlrEl1: REGISTER_ID = 145

public val ARM64_RegisterAmairEl1: REGISTER_ID = 148

public val ARM64_RegisterCntkctlEl1: REGISTER_ID = 155

public val ARM64_RegisterCntvCtlEl0: REGISTER_ID = 157

public val ARM64_RegisterCntvCvalEl0: REGISTER_ID = 156

public val ARM64_RegisterContextIdrEl1: REGISTER_ID = 152

public val ARM64_RegisterCpacrEl1: REGISTER_ID = 153

public val ARM64_RegisterCpsr: REGISTER_ID = 101

public val ARM64_RegisterCsselrEl1: REGISTER_ID = 154

public val ARM64_RegisterElrEl1: REGISTER_ID = 140

public val ARM64_RegisterEsrEl1: REGISTER_ID = 136

public val ARM64_RegisterFarEl1: REGISTER_ID = 138

public val ARM64_RegisterFpControl: REGISTER_ID = 135

public val ARM64_RegisterFpStatus: REGISTER_ID = 134

public val ARM64_RegisterMairEl1: REGISTER_ID = 147

public val ARM64_RegisterMax: REGISTER_ID = 158

public val ARM64_RegisterParEl1: REGISTER_ID = 139

public val ARM64_RegisterPc: REGISTER_ID = 98

public val ARM64_RegisterQ0: REGISTER_ID = 102

public val ARM64_RegisterQ1: REGISTER_ID = 103

public val ARM64_RegisterQ10: REGISTER_ID = 112

public val ARM64_RegisterQ11: REGISTER_ID = 113

public val ARM64_RegisterQ12: REGISTER_ID = 114

public val ARM64_RegisterQ13: REGISTER_ID = 115

public val ARM64_RegisterQ14: REGISTER_ID = 116

public val ARM64_RegisterQ15: REGISTER_ID = 117

public val ARM64_RegisterQ16: REGISTER_ID = 118

public val ARM64_RegisterQ17: REGISTER_ID = 119

public val ARM64_RegisterQ18: REGISTER_ID = 120

public val ARM64_RegisterQ19: REGISTER_ID = 121

public val ARM64_RegisterQ2: REGISTER_ID = 104

public val ARM64_RegisterQ20: REGISTER_ID = 122

public val ARM64_RegisterQ21: REGISTER_ID = 123

public val ARM64_RegisterQ22: REGISTER_ID = 124

public val ARM64_RegisterQ23: REGISTER_ID = 125

public val ARM64_RegisterQ24: REGISTER_ID = 126

public val ARM64_RegisterQ25: REGISTER_ID = 127

public val ARM64_RegisterQ26: REGISTER_ID = 128

public val ARM64_RegisterQ27: REGISTER_ID = 129

public val ARM64_RegisterQ28: REGISTER_ID = 130

public val ARM64_RegisterQ29: REGISTER_ID = 131

public val ARM64_RegisterQ3: REGISTER_ID = 105

public val ARM64_RegisterQ30: REGISTER_ID = 132

public val ARM64_RegisterQ31: REGISTER_ID = 133

public val ARM64_RegisterQ4: REGISTER_ID = 106

public val ARM64_RegisterQ5: REGISTER_ID = 107

public val ARM64_RegisterQ6: REGISTER_ID = 108

public val ARM64_RegisterQ7: REGISTER_ID = 109

public val ARM64_RegisterQ8: REGISTER_ID = 110

public val ARM64_RegisterQ9: REGISTER_ID = 111

public val ARM64_RegisterSctlrEl1: REGISTER_ID = 144

public val ARM64_RegisterSpEl0: REGISTER_ID = 99

public val ARM64_RegisterSpEl1: REGISTER_ID = 100

public val ARM64_RegisterSpsrEl1: REGISTER_ID = 137

public val ARM64_RegisterTcrEl1: REGISTER_ID = 146

public val ARM64_RegisterTpidrEl0: REGISTER_ID = 149

public val ARM64_RegisterTpidrEl1: REGISTER_ID = 151

public val ARM64_RegisterTpidrroEl0: REGISTER_ID = 150

public val ARM64_RegisterTtbr0El1: REGISTER_ID = 141

public val ARM64_RegisterTtbr1El1: REGISTER_ID = 142

public val ARM64_RegisterVbarEl1: REGISTER_ID = 143

public val ARM64_RegisterX0: REGISTER_ID = 67

public val ARM64_RegisterX1: REGISTER_ID = 68

public val ARM64_RegisterX10: REGISTER_ID = 77

public val ARM64_RegisterX11: REGISTER_ID = 78

public val ARM64_RegisterX12: REGISTER_ID = 79

public val ARM64_RegisterX13: REGISTER_ID = 80

public val ARM64_RegisterX14: REGISTER_ID = 81

public val ARM64_RegisterX15: REGISTER_ID = 82

public val ARM64_RegisterX16: REGISTER_ID = 83

public val ARM64_RegisterX17: REGISTER_ID = 84

public val ARM64_RegisterX18: REGISTER_ID = 85

public val ARM64_RegisterX19: REGISTER_ID = 86

public val ARM64_RegisterX2: REGISTER_ID = 69

public val ARM64_RegisterX20: REGISTER_ID = 87

public val ARM64_RegisterX21: REGISTER_ID = 88

public val ARM64_RegisterX22: REGISTER_ID = 89

public val ARM64_RegisterX23: REGISTER_ID = 90

public val ARM64_RegisterX24: REGISTER_ID = 91

public val ARM64_RegisterX25: REGISTER_ID = 92

public val ARM64_RegisterX26: REGISTER_ID = 93

public val ARM64_RegisterX27: REGISTER_ID = 94

public val ARM64_RegisterX28: REGISTER_ID = 95

public val ARM64_RegisterX3: REGISTER_ID = 70

public val ARM64_RegisterX4: REGISTER_ID = 71

public val ARM64_RegisterX5: REGISTER_ID = 72

public val ARM64_RegisterX6: REGISTER_ID = 73

public val ARM64_RegisterX7: REGISTER_ID = 74

public val ARM64_RegisterX8: REGISTER_ID = 75

public val ARM64_RegisterX9: REGISTER_ID = 76

public val ARM64_RegisterXFp: REGISTER_ID = 96

public val ARM64_RegisterXLr: REGISTER_ID = 97

public val Arch_Armv8: VIRTUAL_PROCESSOR_ARCH = 3

public val Arch_Unknown: VIRTUAL_PROCESSOR_ARCH = 0

public val Arch_x64: VIRTUAL_PROCESSOR_ARCH = 2

public val Arch_x86: VIRTUAL_PROCESSOR_ARCH = 1

public val GUID_DEVINTERFACE_VM_GENCOUNTER: GUID = GUID.from_u128(U128(0x3ff2c92b65984e60uL, 0x8e1c0ccf4927e319uL))

public val GuestOsMicrosoftMSDOS: GUEST_OS_MICROSOFT_IDS = 1

public val GuestOsMicrosoftUndefined: GUEST_OS_MICROSOFT_IDS = 0

public val GuestOsMicrosoftWindows3x: GUEST_OS_MICROSOFT_IDS = 2

public val GuestOsMicrosoftWindows9x: GUEST_OS_MICROSOFT_IDS = 3

public val GuestOsMicrosoftWindowsCE: GUEST_OS_MICROSOFT_IDS = 5

public val GuestOsMicrosoftWindowsNT: GUEST_OS_MICROSOFT_IDS = 4

public val GuestOsOpenSourceFreeBSD: GUEST_OS_OPENSOURCE_IDS = 2

public val GuestOsOpenSourceIllumos: GUEST_OS_OPENSOURCE_IDS = 4

public val GuestOsOpenSourceLinux: GUEST_OS_OPENSOURCE_IDS = 1

public val GuestOsOpenSourceUndefined: GUEST_OS_OPENSOURCE_IDS = 0

public val GuestOsOpenSourceXen: GUEST_OS_OPENSOURCE_IDS = 3

public val GuestOsVendorHPE: GUEST_OS_VENDOR = 2

public val GuestOsVendorLANCOM: GUEST_OS_VENDOR = 512

public val GuestOsVendorMicrosoft: GUEST_OS_VENDOR = 1

public val GuestOsVendorUndefined: GUEST_OS_VENDOR = 0

public val HDV_DOORBELL_FLAG_TRIGGER_ANY_VALUE: HDV_DOORBELL_FLAGS = -2147483648

public val HDV_DOORBELL_FLAG_TRIGGER_SIZE_ANY: HDV_DOORBELL_FLAGS = 0

public val HDV_DOORBELL_FLAG_TRIGGER_SIZE_BYTE: HDV_DOORBELL_FLAGS = 1

public val HDV_DOORBELL_FLAG_TRIGGER_SIZE_DWORD: HDV_DOORBELL_FLAGS = 3

public val HDV_DOORBELL_FLAG_TRIGGER_SIZE_QWORD: HDV_DOORBELL_FLAGS = 4

public val HDV_DOORBELL_FLAG_TRIGGER_SIZE_WORD: HDV_DOORBELL_FLAGS = 2

public val HDV_PCI_BAR0: HDV_PCI_BAR_SELECTOR = 0

public val HDV_PCI_BAR1: HDV_PCI_BAR_SELECTOR = 1

public val HDV_PCI_BAR2: HDV_PCI_BAR_SELECTOR = 2

public val HDV_PCI_BAR3: HDV_PCI_BAR_SELECTOR = 3

public val HDV_PCI_BAR4: HDV_PCI_BAR_SELECTOR = 4

public val HDV_PCI_BAR5: HDV_PCI_BAR_SELECTOR = 5

public val HDV_PCI_BAR_COUNT: UInt = 6u

public val HVSOCKET_ADDRESS_FLAG_PASSTHRU: UInt = 1u

public val HVSOCKET_CONNECTED_SUSPEND: UInt = 4u

public val HVSOCKET_CONNECT_TIMEOUT: UInt = 1u

public val HVSOCKET_CONNECT_TIMEOUT_MAX: UInt = 300000u

public val HVSOCKET_HIGH_VTL: UInt = 8u

public val HV_GUID_BROADCAST: GUID = GUID.from_u128(U128(0xffffffffffffffffuL, 0xffffffffffffffffuL))

public val HV_GUID_CHILDREN: GUID = GUID.from_u128(U128(0x90db8b890d354f79uL, 0x8ce949ea0ac8b7cduL))

public val HV_GUID_LOOPBACK: GUID = GUID.from_u128(U128(0xe0e16197dd564a10uL, 0x91955ee7a155a838uL))

public val HV_GUID_PARENT: GUID = GUID.from_u128(U128(0xa42e7cdad03f480cuL, 0x9cc2a4de20abb878uL))

public val HV_GUID_SILOHOST: GUID = GUID.from_u128(U128(0x36bd0c5c72764223uL, 0x88ba7d03b654c568uL))

public val HV_GUID_VSOCK_TEMPLATE: GUID = GUID.from_u128(U128(0xfacb11e6uL, 0xbd5864006a7986d3uL))

public val HV_GUID_ZERO: GUID = GUID.from_u128(U128(0x0uL, 0x0uL))

public val HV_PROTOCOL_RAW: UInt = 1u

public val HdvDeviceHostFlagInitializeComSecurity: HDV_DEVICE_HOST_FLAGS = 1

public val HdvDeviceHostFlagNone: HDV_DEVICE_HOST_FLAGS = 0

public val HdvDeviceTypePCI: HDV_DEVICE_TYPE = 1

public val HdvDeviceTypeUndefined: HDV_DEVICE_TYPE = 0

public val HdvMmioMappingFlagExecutable: HDV_MMIO_MAPPING_FLAGS = 2

public val HdvMmioMappingFlagNone: HDV_MMIO_MAPPING_FLAGS = 0

public val HdvMmioMappingFlagWriteable: HDV_MMIO_MAPPING_FLAGS = 1

public val HdvPciDeviceInterfaceVersion1: HDV_PCI_INTERFACE_VERSION = 1

public val HdvPciDeviceInterfaceVersionInvalid: HDV_PCI_INTERFACE_VERSION = 0

public val IOCTL_VMGENCOUNTER_READ: UInt = 3325956u

public val Paging_32Bit: PAGING_MODE = 2

public val Paging_Armv8: PAGING_MODE = 5

public val Paging_Invalid: PAGING_MODE = 0

public val Paging_Long: PAGING_MODE = 4

public val Paging_NonPaged: PAGING_MODE = 1

public val Paging_Pae: PAGING_MODE = 3

public val ProcessorVendor_Amd: VIRTUAL_PROCESSOR_VENDOR = 1

public val ProcessorVendor_Arm: VIRTUAL_PROCESSOR_VENDOR = 4

public val ProcessorVendor_Hygon: VIRTUAL_PROCESSOR_VENDOR = 3

public val ProcessorVendor_Intel: VIRTUAL_PROCESSOR_VENDOR = 2

public val ProcessorVendor_Unknown: VIRTUAL_PROCESSOR_VENDOR = 0

public val VM_GENCOUNTER_SYMBOLIC_LINK_NAME: PCWSTR = w("\\VmGenerationCounter")

public val WHV_ANY_VP: UInt = 4294967295u

public val WHV_HYPERCALL_CONTEXT_MAX_XMM_REGISTERS: UInt = 6u

public val WHV_MAX_DEVICE_ID_SIZE_IN_CHARS: UInt = 200u

public val WHV_PROCESSOR_FEATURES_BANKS_COUNT: UInt = 2u

public val WHV_READ_WRITE_GPA_RANGE_MAX_SIZE: UInt = 16u

public val WHV_SYNIC_MESSAGE_SIZE: UInt = 256u

public val WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_COUNT: UInt = 1u

public val WHV_VPCI_TYPE0_BAR_COUNT: UInt = 6u

public val WHvAdviseGpaRangeCodePin: WHV_ADVISE_GPA_RANGE_CODE = 1

public val WHvAdviseGpaRangeCodePopulate: WHV_ADVISE_GPA_RANGE_CODE = 0

public val WHvAdviseGpaRangeCodeUnpin: WHV_ADVISE_GPA_RANGE_CODE = 2

public val WHvAllocateVpciResourceFlagAllowDirectP2P: WHV_ALLOCATE_VPCI_RESOURCE_FLAGS = 1

public val WHvAllocateVpciResourceFlagNone: WHV_ALLOCATE_VPCI_RESOURCE_FLAGS = 0

public val WHvCacheTypeUncached: WHV_CACHE_TYPE = 0

public val WHvCacheTypeWriteBack: WHV_CACHE_TYPE = 6

public val WHvCacheTypeWriteCombining: WHV_CACHE_TYPE = 1

public val WHvCacheTypeWriteThrough: WHV_CACHE_TYPE = 4

public val WHvCapabilityCodeExceptionExitBitmap: WHV_CAPABILITY_CODE = 3

public val WHvCapabilityCodeExtendedVmExits: WHV_CAPABILITY_CODE = 2

public val WHvCapabilityCodeFeatures: WHV_CAPABILITY_CODE = 1

public val WHvCapabilityCodeGpaRangePopulateFlags: WHV_CAPABILITY_CODE = 5

public val WHvCapabilityCodeHypervisorPresent: WHV_CAPABILITY_CODE = 0

public val WHvCapabilityCodeInterruptClockFrequency: WHV_CAPABILITY_CODE = 4101

public val WHvCapabilityCodeProcessorClFlushSize: WHV_CAPABILITY_CODE = 4098

public val WHvCapabilityCodeProcessorClockFrequency: WHV_CAPABILITY_CODE = 4100

public val WHvCapabilityCodeProcessorFeatures: WHV_CAPABILITY_CODE = 4097

public val WHvCapabilityCodeProcessorFeaturesBanks: WHV_CAPABILITY_CODE = 4102

public val WHvCapabilityCodeProcessorFrequencyCap: WHV_CAPABILITY_CODE = 4103

public val WHvCapabilityCodeProcessorPerfmonFeatures: WHV_CAPABILITY_CODE = 4105

public val WHvCapabilityCodeProcessorVendor: WHV_CAPABILITY_CODE = 4096

public val WHvCapabilityCodeProcessorXsaveFeatures: WHV_CAPABILITY_CODE = 4099

public val WHvCapabilityCodeSchedulerFeatures: WHV_CAPABILITY_CODE = 6

public val WHvCapabilityCodeSyntheticProcessorFeaturesBanks: WHV_CAPABILITY_CODE = 4104

public val WHvCapabilityCodeX64MsrExitBitmap: WHV_CAPABILITY_CODE = 4

public val WHvCreateVpciDeviceFlagNone: WHV_CREATE_VPCI_DEVICE_FLAGS = 0

public val WHvCreateVpciDeviceFlagPhysicallyBacked: WHV_CREATE_VPCI_DEVICE_FLAGS = 1

public val WHvCreateVpciDeviceFlagUseLogicalInterrupts: WHV_CREATE_VPCI_DEVICE_FLAGS = 2

public val WHvMapGpaRangeFlagExecute: WHV_MAP_GPA_RANGE_FLAGS = 4

public val WHvMapGpaRangeFlagNone: WHV_MAP_GPA_RANGE_FLAGS = 0

public val WHvMapGpaRangeFlagRead: WHV_MAP_GPA_RANGE_FLAGS = 1

public val WHvMapGpaRangeFlagTrackDirtyPages: WHV_MAP_GPA_RANGE_FLAGS = 8

public val WHvMapGpaRangeFlagWrite: WHV_MAP_GPA_RANGE_FLAGS = 2

public val WHvMemoryAccessExecute: WHV_MEMORY_ACCESS_TYPE = 2

public val WHvMemoryAccessRead: WHV_MEMORY_ACCESS_TYPE = 0

public val WHvMemoryAccessWrite: WHV_MEMORY_ACCESS_TYPE = 1

public val WHvMsrActionArchitectureDefault: WHV_MSR_ACTION = 0

public val WHvMsrActionExit: WHV_MSR_ACTION = 2

public val WHvMsrActionIgnoreWriteReadZero: WHV_MSR_ACTION = 1

public val WHvNotificationPortPropertyPreferredTargetDuration: WHV_NOTIFICATION_PORT_PROPERTY_CODE = 5

public val WHvNotificationPortPropertyPreferredTargetVp: WHV_NOTIFICATION_PORT_PROPERTY_CODE = 1

public val WHvNotificationPortTypeDoorbell: WHV_NOTIFICATION_PORT_TYPE = 4

public val WHvNotificationPortTypeEvent: WHV_NOTIFICATION_PORT_TYPE = 2

public val WHvPartitionCounterSetMemory: WHV_PARTITION_COUNTER_SET = 0

public val WHvPartitionPropertyCodeAllowDeviceAssignment: WHV_PARTITION_PROPERTY_CODE = 12

public val WHvPartitionPropertyCodeApicRemoteReadSupport: WHV_PARTITION_PROPERTY_CODE = 4105

public val WHvPartitionPropertyCodeCpuCap: WHV_PARTITION_PROPERTY_CODE = 8

public val WHvPartitionPropertyCodeCpuGroupId: WHV_PARTITION_PROPERTY_CODE = 10

public val WHvPartitionPropertyCodeCpuReserve: WHV_PARTITION_PROPERTY_CODE = 7

public val WHvPartitionPropertyCodeCpuWeight: WHV_PARTITION_PROPERTY_CODE = 9

public val WHvPartitionPropertyCodeCpuidExitList: WHV_PARTITION_PROPERTY_CODE = 4099

public val WHvPartitionPropertyCodeCpuidResultList: WHV_PARTITION_PROPERTY_CODE = 4100

public val WHvPartitionPropertyCodeCpuidResultList2: WHV_PARTITION_PROPERTY_CODE = 4109

public val WHvPartitionPropertyCodeDisableSmt: WHV_PARTITION_PROPERTY_CODE = 13

public val WHvPartitionPropertyCodeExceptionExitBitmap: WHV_PARTITION_PROPERTY_CODE = 2

public val WHvPartitionPropertyCodeExtendedVmExits: WHV_PARTITION_PROPERTY_CODE = 1

public val WHvPartitionPropertyCodeInterruptClockFrequency: WHV_PARTITION_PROPERTY_CODE = 4104

public val WHvPartitionPropertyCodeLocalApicEmulationMode: WHV_PARTITION_PROPERTY_CODE = 4101

public val WHvPartitionPropertyCodeMsrActionList: WHV_PARTITION_PROPERTY_CODE = 4111

public val WHvPartitionPropertyCodeNestedVirtualization: WHV_PARTITION_PROPERTY_CODE = 4

public val WHvPartitionPropertyCodePrimaryNumaNode: WHV_PARTITION_PROPERTY_CODE = 6

public val WHvPartitionPropertyCodeProcessorClFlushSize: WHV_PARTITION_PROPERTY_CODE = 4098

public val WHvPartitionPropertyCodeProcessorClockFrequency: WHV_PARTITION_PROPERTY_CODE = 4103

public val WHvPartitionPropertyCodeProcessorCount: WHV_PARTITION_PROPERTY_CODE = 8191

public val WHvPartitionPropertyCodeProcessorFeatures: WHV_PARTITION_PROPERTY_CODE = 4097

public val WHvPartitionPropertyCodeProcessorFeaturesBanks: WHV_PARTITION_PROPERTY_CODE = 4106

public val WHvPartitionPropertyCodeProcessorFrequencyCap: WHV_PARTITION_PROPERTY_CODE = 11

public val WHvPartitionPropertyCodeProcessorPerfmonFeatures: WHV_PARTITION_PROPERTY_CODE = 4110

public val WHvPartitionPropertyCodeProcessorXsaveFeatures: WHV_PARTITION_PROPERTY_CODE = 4102

public val WHvPartitionPropertyCodeReferenceTime: WHV_PARTITION_PROPERTY_CODE = 4107

public val WHvPartitionPropertyCodeSeparateSecurityDomain: WHV_PARTITION_PROPERTY_CODE = 3

public val WHvPartitionPropertyCodeSyntheticProcessorFeaturesBanks: WHV_PARTITION_PROPERTY_CODE = 4108

public val WHvPartitionPropertyCodeUnimplementedMsrAction: WHV_PARTITION_PROPERTY_CODE = 4112

public val WHvPartitionPropertyCodeX64MsrExitBitmap: WHV_PARTITION_PROPERTY_CODE = 5

public val WHvProcessorCounterSetApic: WHV_PROCESSOR_COUNTER_SET = 3

public val WHvProcessorCounterSetEvents: WHV_PROCESSOR_COUNTER_SET = 2

public val WHvProcessorCounterSetIntercepts: WHV_PROCESSOR_COUNTER_SET = 1

public val WHvProcessorCounterSetRuntime: WHV_PROCESSOR_COUNTER_SET = 0

public val WHvProcessorCounterSetSyntheticFeatures: WHV_PROCESSOR_COUNTER_SET = 4

public val WHvProcessorVendorAmd: WHV_PROCESSOR_VENDOR = 0

public val WHvProcessorVendorHygon: WHV_PROCESSOR_VENDOR = 2

public val WHvProcessorVendorIntel: WHV_PROCESSOR_VENDOR = 1

public val WHvRegisterEom: WHV_REGISTER_NAME = 16404

public val WHvRegisterGuestOsId: WHV_REGISTER_NAME = 20482

public val WHvRegisterInternalActivityState: WHV_REGISTER_NAME = -2147483643

public val WHvRegisterInterruptState: WHV_REGISTER_NAME = -2147483647

public val WHvRegisterPendingEvent: WHV_REGISTER_NAME = -2147483646

public val WHvRegisterPendingInterruption: WHV_REGISTER_NAME = -2147483648

public val WHvRegisterReferenceTsc: WHV_REGISTER_NAME = 20503

public val WHvRegisterReferenceTscSequence: WHV_REGISTER_NAME = 20506

public val WHvRegisterScontrol: WHV_REGISTER_NAME = 16400

public val WHvRegisterSiefp: WHV_REGISTER_NAME = 16402

public val WHvRegisterSimp: WHV_REGISTER_NAME = 16403

public val WHvRegisterSint0: WHV_REGISTER_NAME = 16384

public val WHvRegisterSint1: WHV_REGISTER_NAME = 16385

public val WHvRegisterSint10: WHV_REGISTER_NAME = 16394

public val WHvRegisterSint11: WHV_REGISTER_NAME = 16395

public val WHvRegisterSint12: WHV_REGISTER_NAME = 16396

public val WHvRegisterSint13: WHV_REGISTER_NAME = 16397

public val WHvRegisterSint14: WHV_REGISTER_NAME = 16398

public val WHvRegisterSint15: WHV_REGISTER_NAME = 16399

public val WHvRegisterSint2: WHV_REGISTER_NAME = 16386

public val WHvRegisterSint3: WHV_REGISTER_NAME = 16387

public val WHvRegisterSint4: WHV_REGISTER_NAME = 16388

public val WHvRegisterSint5: WHV_REGISTER_NAME = 16389

public val WHvRegisterSint6: WHV_REGISTER_NAME = 16390

public val WHvRegisterSint7: WHV_REGISTER_NAME = 16391

public val WHvRegisterSint8: WHV_REGISTER_NAME = 16392

public val WHvRegisterSint9: WHV_REGISTER_NAME = 16393

public val WHvRegisterSversion: WHV_REGISTER_NAME = 16401

public val WHvRegisterVpAssistPage: WHV_REGISTER_NAME = 20499

public val WHvRegisterVpRuntime: WHV_REGISTER_NAME = 20480

public val WHvRunVpCancelReasonUser: WHV_RUN_VP_CANCEL_REASON = 0

public val WHvRunVpExitReasonCanceled: WHV_RUN_VP_EXIT_REASON = 8193

public val WHvRunVpExitReasonException: WHV_RUN_VP_EXIT_REASON = 4098

public val WHvRunVpExitReasonHypercall: WHV_RUN_VP_EXIT_REASON = 4101

public val WHvRunVpExitReasonInvalidVpRegisterValue: WHV_RUN_VP_EXIT_REASON = 5

public val WHvRunVpExitReasonMemoryAccess: WHV_RUN_VP_EXIT_REASON = 1

public val WHvRunVpExitReasonNone: WHV_RUN_VP_EXIT_REASON = 0

public val WHvRunVpExitReasonSynicSintDeliverable: WHV_RUN_VP_EXIT_REASON = 10

public val WHvRunVpExitReasonUnrecoverableException: WHV_RUN_VP_EXIT_REASON = 4

public val WHvRunVpExitReasonUnsupportedFeature: WHV_RUN_VP_EXIT_REASON = 6

public val WHvRunVpExitReasonX64ApicEoi: WHV_RUN_VP_EXIT_REASON = 9

public val WHvRunVpExitReasonX64ApicInitSipiTrap: WHV_RUN_VP_EXIT_REASON = 4102

public val WHvRunVpExitReasonX64ApicSmiTrap: WHV_RUN_VP_EXIT_REASON = 4100

public val WHvRunVpExitReasonX64ApicWriteTrap: WHV_RUN_VP_EXIT_REASON = 4103

public val WHvRunVpExitReasonX64Cpuid: WHV_RUN_VP_EXIT_REASON = 4097

public val WHvRunVpExitReasonX64Halt: WHV_RUN_VP_EXIT_REASON = 8

public val WHvRunVpExitReasonX64InterruptWindow: WHV_RUN_VP_EXIT_REASON = 7

public val WHvRunVpExitReasonX64IoPortAccess: WHV_RUN_VP_EXIT_REASON = 2

public val WHvRunVpExitReasonX64MsrAccess: WHV_RUN_VP_EXIT_REASON = 4096

public val WHvRunVpExitReasonX64Rdtsc: WHV_RUN_VP_EXIT_REASON = 4099

public val WHvTranslateGvaFlagEnforceSmap: WHV_TRANSLATE_GVA_FLAGS = 256

public val WHvTranslateGvaFlagNone: WHV_TRANSLATE_GVA_FLAGS = 0

public val WHvTranslateGvaFlagOverrideSmap: WHV_TRANSLATE_GVA_FLAGS = 512

public val WHvTranslateGvaFlagPrivilegeExempt: WHV_TRANSLATE_GVA_FLAGS = 8

public val WHvTranslateGvaFlagSetPageTableBits: WHV_TRANSLATE_GVA_FLAGS = 16

public val WHvTranslateGvaFlagValidateExecute: WHV_TRANSLATE_GVA_FLAGS = 4

public val WHvTranslateGvaFlagValidateRead: WHV_TRANSLATE_GVA_FLAGS = 1

public val WHvTranslateGvaFlagValidateWrite: WHV_TRANSLATE_GVA_FLAGS = 2

public val WHvTranslateGvaResultGpaIllegalOverlayAccess: WHV_TRANSLATE_GVA_RESULT_CODE = 7

public val WHvTranslateGvaResultGpaNoReadAccess: WHV_TRANSLATE_GVA_RESULT_CODE = 5

public val WHvTranslateGvaResultGpaNoWriteAccess: WHV_TRANSLATE_GVA_RESULT_CODE = 6

public val WHvTranslateGvaResultGpaUnmapped: WHV_TRANSLATE_GVA_RESULT_CODE = 4

public val WHvTranslateGvaResultIntercept: WHV_TRANSLATE_GVA_RESULT_CODE = 8

public val WHvTranslateGvaResultInvalidPageTableFlags: WHV_TRANSLATE_GVA_RESULT_CODE = 3

public val WHvTranslateGvaResultPageNotPresent: WHV_TRANSLATE_GVA_RESULT_CODE = 1

public val WHvTranslateGvaResultPrivilegeViolation: WHV_TRANSLATE_GVA_RESULT_CODE = 2

public val WHvTranslateGvaResultSuccess: WHV_TRANSLATE_GVA_RESULT_CODE = 0

public val WHvTriggerTypeDeviceInterrupt: WHV_TRIGGER_TYPE = 2

public val WHvTriggerTypeInterrupt: WHV_TRIGGER_TYPE = 0

public val WHvTriggerTypeSynicEvent: WHV_TRIGGER_TYPE = 1

public val WHvUnsupportedFeatureIntercept: WHV_X64_UNSUPPORTED_FEATURE_CODE = 1

public val WHvUnsupportedFeatureTaskSwitchTss: WHV_X64_UNSUPPORTED_FEATURE_CODE = 2

public val WHvVirtualProcessorPropertyCodeNumaNode: WHV_VIRTUAL_PROCESSOR_PROPERTY_CODE = 0

public val WHvVirtualProcessorStateTypeInterruptControllerState2: WHV_VIRTUAL_PROCESSOR_STATE_TYPE = 4096

public val WHvVirtualProcessorStateTypeSynicEventFlagPage: WHV_VIRTUAL_PROCESSOR_STATE_TYPE = 1

public val WHvVirtualProcessorStateTypeSynicMessagePage: WHV_VIRTUAL_PROCESSOR_STATE_TYPE = 0

public val WHvVirtualProcessorStateTypeSynicTimerState: WHV_VIRTUAL_PROCESSOR_STATE_TYPE = 2

public val WHvVirtualProcessorStateTypeXsaveState: WHV_VIRTUAL_PROCESSOR_STATE_TYPE = 4097

public val WHvVpciBar0: WHV_VPCI_DEVICE_REGISTER_SPACE = 0

public val WHvVpciBar1: WHV_VPCI_DEVICE_REGISTER_SPACE = 1

public val WHvVpciBar2: WHV_VPCI_DEVICE_REGISTER_SPACE = 2

public val WHvVpciBar3: WHV_VPCI_DEVICE_REGISTER_SPACE = 3

public val WHvVpciBar4: WHV_VPCI_DEVICE_REGISTER_SPACE = 4

public val WHvVpciBar5: WHV_VPCI_DEVICE_REGISTER_SPACE = 5

public val WHvVpciConfigSpace: WHV_VPCI_DEVICE_REGISTER_SPACE = -1

public val WHvVpciDeviceNotificationMmioRemapping: WHV_VPCI_DEVICE_NOTIFICATION_TYPE = 1

public val WHvVpciDeviceNotificationSurpriseRemoval: WHV_VPCI_DEVICE_NOTIFICATION_TYPE = 2

public val WHvVpciDeviceNotificationUndefined: WHV_VPCI_DEVICE_NOTIFICATION_TYPE = 0

public val WHvVpciDevicePropertyCodeHardwareIDs: WHV_VPCI_DEVICE_PROPERTY_CODE = 1

public val WHvVpciDevicePropertyCodeProbedBARs: WHV_VPCI_DEVICE_PROPERTY_CODE = 2

public val WHvVpciDevicePropertyCodeUndefined: WHV_VPCI_DEVICE_PROPERTY_CODE = 0

public val WHvVpciInterruptTargetFlagMulticast: WHV_VPCI_INTERRUPT_TARGET_FLAGS = 1

public val WHvVpciInterruptTargetFlagNone: WHV_VPCI_INTERRUPT_TARGET_FLAGS = 0

public val WHvVpciMmioRangeFlagReadAccess: WHV_VPCI_MMIO_RANGE_FLAGS = 1

public val WHvVpciMmioRangeFlagWriteAccess: WHV_VPCI_MMIO_RANGE_FLAGS = 2

public val WHvX64ApicWriteTypeDfr: WHV_X64_APIC_WRITE_TYPE = 224

public val WHvX64ApicWriteTypeLdr: WHV_X64_APIC_WRITE_TYPE = 208

public val WHvX64ApicWriteTypeLint0: WHV_X64_APIC_WRITE_TYPE = 848

public val WHvX64ApicWriteTypeLint1: WHV_X64_APIC_WRITE_TYPE = 864

public val WHvX64ApicWriteTypeSvr: WHV_X64_APIC_WRITE_TYPE = 240

public val WHvX64CpuidResult2FlagSubleafSpecific: WHV_X64_CPUID_RESULT2_FLAGS = 1

public val WHvX64CpuidResult2FlagVpSpecific: WHV_X64_CPUID_RESULT2_FLAGS = 2

public val WHvX64ExceptionTypeAlignmentCheckFault: WHV_EXCEPTION_TYPE = 17

public val WHvX64ExceptionTypeBoundRangeFault: WHV_EXCEPTION_TYPE = 5

public val WHvX64ExceptionTypeBreakpointTrap: WHV_EXCEPTION_TYPE = 3

public val WHvX64ExceptionTypeDebugTrapOrFault: WHV_EXCEPTION_TYPE = 1

public val WHvX64ExceptionTypeDeviceNotAvailableFault: WHV_EXCEPTION_TYPE = 7

public val WHvX64ExceptionTypeDivideErrorFault: WHV_EXCEPTION_TYPE = 0

public val WHvX64ExceptionTypeDoubleFaultAbort: WHV_EXCEPTION_TYPE = 8

public val WHvX64ExceptionTypeFloatingPointErrorFault: WHV_EXCEPTION_TYPE = 16

public val WHvX64ExceptionTypeGeneralProtectionFault: WHV_EXCEPTION_TYPE = 13

public val WHvX64ExceptionTypeInvalidOpcodeFault: WHV_EXCEPTION_TYPE = 6

public val WHvX64ExceptionTypeInvalidTaskStateSegmentFault: WHV_EXCEPTION_TYPE = 10

public val WHvX64ExceptionTypeMachineCheckAbort: WHV_EXCEPTION_TYPE = 18

public val WHvX64ExceptionTypeOverflowTrap: WHV_EXCEPTION_TYPE = 4

public val WHvX64ExceptionTypePageFault: WHV_EXCEPTION_TYPE = 14

public val WHvX64ExceptionTypeSegmentNotPresentFault: WHV_EXCEPTION_TYPE = 11

public val WHvX64ExceptionTypeSimdFloatingPointFault: WHV_EXCEPTION_TYPE = 19

public val WHvX64ExceptionTypeStackFault: WHV_EXCEPTION_TYPE = 12

public val WHvX64InterruptDestinationModeLogical: WHV_INTERRUPT_DESTINATION_MODE = 1

public val WHvX64InterruptDestinationModePhysical: WHV_INTERRUPT_DESTINATION_MODE = 0

public val WHvX64InterruptTriggerModeEdge: WHV_INTERRUPT_TRIGGER_MODE = 0

public val WHvX64InterruptTriggerModeLevel: WHV_INTERRUPT_TRIGGER_MODE = 1

public val WHvX64InterruptTypeFixed: WHV_INTERRUPT_TYPE = 0

public val WHvX64InterruptTypeInit: WHV_INTERRUPT_TYPE = 5

public val WHvX64InterruptTypeLocalInt1: WHV_INTERRUPT_TYPE = 9

public val WHvX64InterruptTypeLowestPriority: WHV_INTERRUPT_TYPE = 1

public val WHvX64InterruptTypeNmi: WHV_INTERRUPT_TYPE = 4

public val WHvX64InterruptTypeSipi: WHV_INTERRUPT_TYPE = 6

public val WHvX64LocalApicEmulationModeNone: WHV_X64_LOCAL_APIC_EMULATION_MODE = 0

public val WHvX64LocalApicEmulationModeX2Apic: WHV_X64_LOCAL_APIC_EMULATION_MODE = 2

public val WHvX64LocalApicEmulationModeXApic: WHV_X64_LOCAL_APIC_EMULATION_MODE = 1

public val WHvX64PendingEventException: WHV_X64_PENDING_EVENT_TYPE = 0

public val WHvX64PendingEventExtInt: WHV_X64_PENDING_EVENT_TYPE = 5

public val WHvX64PendingException: WHV_X64_PENDING_INTERRUPTION_TYPE = 3

public val WHvX64PendingInterrupt: WHV_X64_PENDING_INTERRUPTION_TYPE = 0

public val WHvX64PendingNmi: WHV_X64_PENDING_INTERRUPTION_TYPE = 2

public val WHvX64RegisterACount: WHV_REGISTER_NAME = 8319

public val WHvX64RegisterApicBase: WHV_REGISTER_NAME = 8195

public val WHvX64RegisterApicCurrentCount: WHV_REGISTER_NAME = 12345

public val WHvX64RegisterApicDivide: WHV_REGISTER_NAME = 12350

public val WHvX64RegisterApicEoi: WHV_REGISTER_NAME = 12299

public val WHvX64RegisterApicEse: WHV_REGISTER_NAME = 12328

public val WHvX64RegisterApicIcr: WHV_REGISTER_NAME = 12336

public val WHvX64RegisterApicId: WHV_REGISTER_NAME = 12290

public val WHvX64RegisterApicInitCount: WHV_REGISTER_NAME = 12344

public val WHvX64RegisterApicIrr0: WHV_REGISTER_NAME = 12320

public val WHvX64RegisterApicIrr1: WHV_REGISTER_NAME = 12321

public val WHvX64RegisterApicIrr2: WHV_REGISTER_NAME = 12322

public val WHvX64RegisterApicIrr3: WHV_REGISTER_NAME = 12323

public val WHvX64RegisterApicIrr4: WHV_REGISTER_NAME = 12324

public val WHvX64RegisterApicIrr5: WHV_REGISTER_NAME = 12325

public val WHvX64RegisterApicIrr6: WHV_REGISTER_NAME = 12326

public val WHvX64RegisterApicIrr7: WHV_REGISTER_NAME = 12327

public val WHvX64RegisterApicIsr0: WHV_REGISTER_NAME = 12304

public val WHvX64RegisterApicIsr1: WHV_REGISTER_NAME = 12305

public val WHvX64RegisterApicIsr2: WHV_REGISTER_NAME = 12306

public val WHvX64RegisterApicIsr3: WHV_REGISTER_NAME = 12307

public val WHvX64RegisterApicIsr4: WHV_REGISTER_NAME = 12308

public val WHvX64RegisterApicIsr5: WHV_REGISTER_NAME = 12309

public val WHvX64RegisterApicIsr6: WHV_REGISTER_NAME = 12310

public val WHvX64RegisterApicIsr7: WHV_REGISTER_NAME = 12311

public val WHvX64RegisterApicLdr: WHV_REGISTER_NAME = 12301

public val WHvX64RegisterApicLvtError: WHV_REGISTER_NAME = 12343

public val WHvX64RegisterApicLvtLint0: WHV_REGISTER_NAME = 12341

public val WHvX64RegisterApicLvtLint1: WHV_REGISTER_NAME = 12342

public val WHvX64RegisterApicLvtPerfmon: WHV_REGISTER_NAME = 12340

public val WHvX64RegisterApicLvtThermal: WHV_REGISTER_NAME = 12339

public val WHvX64RegisterApicLvtTimer: WHV_REGISTER_NAME = 12338

public val WHvX64RegisterApicPpr: WHV_REGISTER_NAME = 12298

public val WHvX64RegisterApicSelfIpi: WHV_REGISTER_NAME = 12351

public val WHvX64RegisterApicSpurious: WHV_REGISTER_NAME = 12303

public val WHvX64RegisterApicTmr0: WHV_REGISTER_NAME = 12312

public val WHvX64RegisterApicTmr1: WHV_REGISTER_NAME = 12313

public val WHvX64RegisterApicTmr2: WHV_REGISTER_NAME = 12314

public val WHvX64RegisterApicTmr3: WHV_REGISTER_NAME = 12315

public val WHvX64RegisterApicTmr4: WHV_REGISTER_NAME = 12316

public val WHvX64RegisterApicTmr5: WHV_REGISTER_NAME = 12317

public val WHvX64RegisterApicTmr6: WHV_REGISTER_NAME = 12318

public val WHvX64RegisterApicTmr7: WHV_REGISTER_NAME = 12319

public val WHvX64RegisterApicTpr: WHV_REGISTER_NAME = 12296

public val WHvX64RegisterApicVersion: WHV_REGISTER_NAME = 12291

public val WHvX64RegisterBndcfgs: WHV_REGISTER_NAME = 8316

public val WHvX64RegisterCr0: WHV_REGISTER_NAME = 28

public val WHvX64RegisterCr2: WHV_REGISTER_NAME = 29

public val WHvX64RegisterCr3: WHV_REGISTER_NAME = 30

public val WHvX64RegisterCr4: WHV_REGISTER_NAME = 31

public val WHvX64RegisterCr8: WHV_REGISTER_NAME = 32

public val WHvX64RegisterCs: WHV_REGISTER_NAME = 19

public val WHvX64RegisterCstar: WHV_REGISTER_NAME = 8202

public val WHvX64RegisterDeliverabilityNotifications: WHV_REGISTER_NAME = -2147483644

public val WHvX64RegisterDr0: WHV_REGISTER_NAME = 33

public val WHvX64RegisterDr1: WHV_REGISTER_NAME = 34

public val WHvX64RegisterDr2: WHV_REGISTER_NAME = 35

public val WHvX64RegisterDr3: WHV_REGISTER_NAME = 36

public val WHvX64RegisterDr6: WHV_REGISTER_NAME = 37

public val WHvX64RegisterDr7: WHV_REGISTER_NAME = 38

public val WHvX64RegisterDs: WHV_REGISTER_NAME = 21

public val WHvX64RegisterEfer: WHV_REGISTER_NAME = 8193

public val WHvX64RegisterEs: WHV_REGISTER_NAME = 18

public val WHvX64RegisterFpControlStatus: WHV_REGISTER_NAME = 4120

public val WHvX64RegisterFpMmx0: WHV_REGISTER_NAME = 4112

public val WHvX64RegisterFpMmx1: WHV_REGISTER_NAME = 4113

public val WHvX64RegisterFpMmx2: WHV_REGISTER_NAME = 4114

public val WHvX64RegisterFpMmx3: WHV_REGISTER_NAME = 4115

public val WHvX64RegisterFpMmx4: WHV_REGISTER_NAME = 4116

public val WHvX64RegisterFpMmx5: WHV_REGISTER_NAME = 4117

public val WHvX64RegisterFpMmx6: WHV_REGISTER_NAME = 4118

public val WHvX64RegisterFpMmx7: WHV_REGISTER_NAME = 4119

public val WHvX64RegisterFs: WHV_REGISTER_NAME = 22

public val WHvX64RegisterGdtr: WHV_REGISTER_NAME = 27

public val WHvX64RegisterGs: WHV_REGISTER_NAME = 23

public val WHvX64RegisterHypercall: WHV_REGISTER_NAME = 20481

public val WHvX64RegisterIdtr: WHV_REGISTER_NAME = 26

public val WHvX64RegisterInitialApicId: WHV_REGISTER_NAME = 8204

public val WHvX64RegisterInterruptSspTableAddr: WHV_REGISTER_NAME = 8339

public val WHvX64RegisterKernelGsBase: WHV_REGISTER_NAME = 8194

public val WHvX64RegisterLdtr: WHV_REGISTER_NAME = 24

public val WHvX64RegisterLstar: WHV_REGISTER_NAME = 8201

public val WHvX64RegisterMCount: WHV_REGISTER_NAME = 8318

public val WHvX64RegisterMsrMtrrCap: WHV_REGISTER_NAME = 8205

public val WHvX64RegisterMsrMtrrDefType: WHV_REGISTER_NAME = 8206

public val WHvX64RegisterMsrMtrrFix16k80000: WHV_REGISTER_NAME = 8305

public val WHvX64RegisterMsrMtrrFix16kA0000: WHV_REGISTER_NAME = 8306

public val WHvX64RegisterMsrMtrrFix4kC0000: WHV_REGISTER_NAME = 8307

public val WHvX64RegisterMsrMtrrFix4kC8000: WHV_REGISTER_NAME = 8308

public val WHvX64RegisterMsrMtrrFix4kD0000: WHV_REGISTER_NAME = 8309

public val WHvX64RegisterMsrMtrrFix4kD8000: WHV_REGISTER_NAME = 8310

public val WHvX64RegisterMsrMtrrFix4kE0000: WHV_REGISTER_NAME = 8311

public val WHvX64RegisterMsrMtrrFix4kE8000: WHV_REGISTER_NAME = 8312

public val WHvX64RegisterMsrMtrrFix4kF0000: WHV_REGISTER_NAME = 8313

public val WHvX64RegisterMsrMtrrFix4kF8000: WHV_REGISTER_NAME = 8314

public val WHvX64RegisterMsrMtrrFix64k00000: WHV_REGISTER_NAME = 8304

public val WHvX64RegisterMsrMtrrPhysBase0: WHV_REGISTER_NAME = 8208

public val WHvX64RegisterMsrMtrrPhysBase1: WHV_REGISTER_NAME = 8209

public val WHvX64RegisterMsrMtrrPhysBase2: WHV_REGISTER_NAME = 8210

public val WHvX64RegisterMsrMtrrPhysBase3: WHV_REGISTER_NAME = 8211

public val WHvX64RegisterMsrMtrrPhysBase4: WHV_REGISTER_NAME = 8212

public val WHvX64RegisterMsrMtrrPhysBase5: WHV_REGISTER_NAME = 8213

public val WHvX64RegisterMsrMtrrPhysBase6: WHV_REGISTER_NAME = 8214

public val WHvX64RegisterMsrMtrrPhysBase7: WHV_REGISTER_NAME = 8215

public val WHvX64RegisterMsrMtrrPhysBase8: WHV_REGISTER_NAME = 8216

public val WHvX64RegisterMsrMtrrPhysBase9: WHV_REGISTER_NAME = 8217

public val WHvX64RegisterMsrMtrrPhysBaseA: WHV_REGISTER_NAME = 8218

public val WHvX64RegisterMsrMtrrPhysBaseB: WHV_REGISTER_NAME = 8219

public val WHvX64RegisterMsrMtrrPhysBaseC: WHV_REGISTER_NAME = 8220

public val WHvX64RegisterMsrMtrrPhysBaseD: WHV_REGISTER_NAME = 8221

public val WHvX64RegisterMsrMtrrPhysBaseE: WHV_REGISTER_NAME = 8222

public val WHvX64RegisterMsrMtrrPhysBaseF: WHV_REGISTER_NAME = 8223

public val WHvX64RegisterMsrMtrrPhysMask0: WHV_REGISTER_NAME = 8256

public val WHvX64RegisterMsrMtrrPhysMask1: WHV_REGISTER_NAME = 8257

public val WHvX64RegisterMsrMtrrPhysMask2: WHV_REGISTER_NAME = 8258

public val WHvX64RegisterMsrMtrrPhysMask3: WHV_REGISTER_NAME = 8259

public val WHvX64RegisterMsrMtrrPhysMask4: WHV_REGISTER_NAME = 8260

public val WHvX64RegisterMsrMtrrPhysMask5: WHV_REGISTER_NAME = 8261

public val WHvX64RegisterMsrMtrrPhysMask6: WHV_REGISTER_NAME = 8262

public val WHvX64RegisterMsrMtrrPhysMask7: WHV_REGISTER_NAME = 8263

public val WHvX64RegisterMsrMtrrPhysMask8: WHV_REGISTER_NAME = 8264

public val WHvX64RegisterMsrMtrrPhysMask9: WHV_REGISTER_NAME = 8265

public val WHvX64RegisterMsrMtrrPhysMaskA: WHV_REGISTER_NAME = 8266

public val WHvX64RegisterMsrMtrrPhysMaskB: WHV_REGISTER_NAME = 8267

public val WHvX64RegisterMsrMtrrPhysMaskC: WHV_REGISTER_NAME = 8268

public val WHvX64RegisterMsrMtrrPhysMaskD: WHV_REGISTER_NAME = 8269

public val WHvX64RegisterMsrMtrrPhysMaskE: WHV_REGISTER_NAME = 8270

public val WHvX64RegisterMsrMtrrPhysMaskF: WHV_REGISTER_NAME = 8271

public val WHvX64RegisterPat: WHV_REGISTER_NAME = 8196

public val WHvX64RegisterPendingDebugException: WHV_REGISTER_NAME = -2147483642

public val WHvX64RegisterPl0Ssp: WHV_REGISTER_NAME = 8335

public val WHvX64RegisterPl1Ssp: WHV_REGISTER_NAME = 8336

public val WHvX64RegisterPl2Ssp: WHV_REGISTER_NAME = 8337

public val WHvX64RegisterPl3Ssp: WHV_REGISTER_NAME = 8338

public val WHvX64RegisterPredCmd: WHV_REGISTER_NAME = 8325

public val WHvX64RegisterR10: WHV_REGISTER_NAME = 10

public val WHvX64RegisterR11: WHV_REGISTER_NAME = 11

public val WHvX64RegisterR12: WHV_REGISTER_NAME = 12

public val WHvX64RegisterR13: WHV_REGISTER_NAME = 13

public val WHvX64RegisterR14: WHV_REGISTER_NAME = 14

public val WHvX64RegisterR15: WHV_REGISTER_NAME = 15

public val WHvX64RegisterR8: WHV_REGISTER_NAME = 8

public val WHvX64RegisterR9: WHV_REGISTER_NAME = 9

public val WHvX64RegisterRax: WHV_REGISTER_NAME = 0

public val WHvX64RegisterRbp: WHV_REGISTER_NAME = 5

public val WHvX64RegisterRbx: WHV_REGISTER_NAME = 3

public val WHvX64RegisterRcx: WHV_REGISTER_NAME = 1

public val WHvX64RegisterRdi: WHV_REGISTER_NAME = 7

public val WHvX64RegisterRdx: WHV_REGISTER_NAME = 2

public val WHvX64RegisterRflags: WHV_REGISTER_NAME = 17

public val WHvX64RegisterRip: WHV_REGISTER_NAME = 16

public val WHvX64RegisterRsi: WHV_REGISTER_NAME = 6

public val WHvX64RegisterRsp: WHV_REGISTER_NAME = 4

public val WHvX64RegisterSCet: WHV_REGISTER_NAME = 8333

public val WHvX64RegisterSfmask: WHV_REGISTER_NAME = 8203

public val WHvX64RegisterSpecCtrl: WHV_REGISTER_NAME = 8324

public val WHvX64RegisterSs: WHV_REGISTER_NAME = 20

public val WHvX64RegisterSsp: WHV_REGISTER_NAME = 8334

public val WHvX64RegisterStar: WHV_REGISTER_NAME = 8200

public val WHvX64RegisterSysenterCs: WHV_REGISTER_NAME = 8197

public val WHvX64RegisterSysenterEip: WHV_REGISTER_NAME = 8198

public val WHvX64RegisterSysenterEsp: WHV_REGISTER_NAME = 8199

public val WHvX64RegisterTr: WHV_REGISTER_NAME = 25

public val WHvX64RegisterTsc: WHV_REGISTER_NAME = 8192

public val WHvX64RegisterTscAdjust: WHV_REGISTER_NAME = 8342

public val WHvX64RegisterTscAux: WHV_REGISTER_NAME = 8315

public val WHvX64RegisterTscDeadline: WHV_REGISTER_NAME = 8341

public val WHvX64RegisterTscVirtualOffset: WHV_REGISTER_NAME = 8327

public val WHvX64RegisterTsxCtrl: WHV_REGISTER_NAME = 8328

public val WHvX64RegisterUCet: WHV_REGISTER_NAME = 8332

public val WHvX64RegisterUmwaitControl: WHV_REGISTER_NAME = 8344

public val WHvX64RegisterVirtualCr0: WHV_REGISTER_NAME = 40

public val WHvX64RegisterVirtualCr3: WHV_REGISTER_NAME = 41

public val WHvX64RegisterVirtualCr4: WHV_REGISTER_NAME = 42

public val WHvX64RegisterVirtualCr8: WHV_REGISTER_NAME = 43

public val WHvX64RegisterXCr0: WHV_REGISTER_NAME = 39

public val WHvX64RegisterXfd: WHV_REGISTER_NAME = 8345

public val WHvX64RegisterXfdErr: WHV_REGISTER_NAME = 8346

public val WHvX64RegisterXmm0: WHV_REGISTER_NAME = 4096

public val WHvX64RegisterXmm1: WHV_REGISTER_NAME = 4097

public val WHvX64RegisterXmm10: WHV_REGISTER_NAME = 4106

public val WHvX64RegisterXmm11: WHV_REGISTER_NAME = 4107

public val WHvX64RegisterXmm12: WHV_REGISTER_NAME = 4108

public val WHvX64RegisterXmm13: WHV_REGISTER_NAME = 4109

public val WHvX64RegisterXmm14: WHV_REGISTER_NAME = 4110

public val WHvX64RegisterXmm15: WHV_REGISTER_NAME = 4111

public val WHvX64RegisterXmm2: WHV_REGISTER_NAME = 4098

public val WHvX64RegisterXmm3: WHV_REGISTER_NAME = 4099

public val WHvX64RegisterXmm4: WHV_REGISTER_NAME = 4100

public val WHvX64RegisterXmm5: WHV_REGISTER_NAME = 4101

public val WHvX64RegisterXmm6: WHV_REGISTER_NAME = 4102

public val WHvX64RegisterXmm7: WHV_REGISTER_NAME = 4103

public val WHvX64RegisterXmm8: WHV_REGISTER_NAME = 4104

public val WHvX64RegisterXmm9: WHV_REGISTER_NAME = 4105

public val WHvX64RegisterXmmControlStatus: WHV_REGISTER_NAME = 4121

public val WHvX64RegisterXss: WHV_REGISTER_NAME = 8331

public val X64_RegisterCr0: REGISTER_ID = 44

public val X64_RegisterCr2: REGISTER_ID = 45

public val X64_RegisterCr3: REGISTER_ID = 46

public val X64_RegisterCr4: REGISTER_ID = 47

public val X64_RegisterCr8: REGISTER_ID = 48

public val X64_RegisterCs: REGISTER_ID = 57

public val X64_RegisterDr0: REGISTER_ID = 50

public val X64_RegisterDr1: REGISTER_ID = 51

public val X64_RegisterDr2: REGISTER_ID = 52

public val X64_RegisterDr3: REGISTER_ID = 53

public val X64_RegisterDr6: REGISTER_ID = 54

public val X64_RegisterDr7: REGISTER_ID = 55

public val X64_RegisterDs: REGISTER_ID = 59

public val X64_RegisterEfer: REGISTER_ID = 49

public val X64_RegisterEs: REGISTER_ID = 56

public val X64_RegisterFpControlStatus: REGISTER_ID = 42

public val X64_RegisterFpMmx0: REGISTER_ID = 34

public val X64_RegisterFpMmx1: REGISTER_ID = 35

public val X64_RegisterFpMmx2: REGISTER_ID = 36

public val X64_RegisterFpMmx3: REGISTER_ID = 37

public val X64_RegisterFpMmx4: REGISTER_ID = 38

public val X64_RegisterFpMmx5: REGISTER_ID = 39

public val X64_RegisterFpMmx6: REGISTER_ID = 40

public val X64_RegisterFpMmx7: REGISTER_ID = 41

public val X64_RegisterFs: REGISTER_ID = 60

public val X64_RegisterGdtr: REGISTER_ID = 65

public val X64_RegisterGs: REGISTER_ID = 61

public val X64_RegisterIdtr: REGISTER_ID = 64

public val X64_RegisterLdtr: REGISTER_ID = 62

public val X64_RegisterMax: REGISTER_ID = 66

public val X64_RegisterR10: REGISTER_ID = 10

public val X64_RegisterR11: REGISTER_ID = 11

public val X64_RegisterR12: REGISTER_ID = 12

public val X64_RegisterR13: REGISTER_ID = 13

public val X64_RegisterR14: REGISTER_ID = 14

public val X64_RegisterR15: REGISTER_ID = 15

public val X64_RegisterR8: REGISTER_ID = 8

public val X64_RegisterR9: REGISTER_ID = 9

public val X64_RegisterRFlags: REGISTER_ID = 17

public val X64_RegisterRax: REGISTER_ID = 0

public val X64_RegisterRbp: REGISTER_ID = 5

public val X64_RegisterRbx: REGISTER_ID = 3

public val X64_RegisterRcx: REGISTER_ID = 1

public val X64_RegisterRdi: REGISTER_ID = 7

public val X64_RegisterRdx: REGISTER_ID = 2

public val X64_RegisterRip: REGISTER_ID = 16

public val X64_RegisterRsi: REGISTER_ID = 6

public val X64_RegisterRsp: REGISTER_ID = 4

public val X64_RegisterSs: REGISTER_ID = 58

public val X64_RegisterTr: REGISTER_ID = 63

public val X64_RegisterXmm0: REGISTER_ID = 18

public val X64_RegisterXmm1: REGISTER_ID = 19

public val X64_RegisterXmm10: REGISTER_ID = 28

public val X64_RegisterXmm11: REGISTER_ID = 29

public val X64_RegisterXmm12: REGISTER_ID = 30

public val X64_RegisterXmm13: REGISTER_ID = 31

public val X64_RegisterXmm14: REGISTER_ID = 32

public val X64_RegisterXmm15: REGISTER_ID = 33

public val X64_RegisterXmm2: REGISTER_ID = 20

public val X64_RegisterXmm3: REGISTER_ID = 21

public val X64_RegisterXmm4: REGISTER_ID = 22

public val X64_RegisterXmm5: REGISTER_ID = 23

public val X64_RegisterXmm6: REGISTER_ID = 24

public val X64_RegisterXmm7: REGISTER_ID = 25

public val X64_RegisterXmm8: REGISTER_ID = 26

public val X64_RegisterXmm9: REGISTER_ID = 27

public val X64_RegisterXmmControlStatus: REGISTER_ID = 43
