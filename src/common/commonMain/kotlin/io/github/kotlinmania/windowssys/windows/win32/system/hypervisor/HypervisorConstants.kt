package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val ARM64_REGISTER_ACTLR_EL1: RegisterId = 145

public val ARM64_REGISTER_AMAIR_EL1: RegisterId = 148

public val ARM64_REGISTER_CNTKCTL_EL1: RegisterId = 155

public val ARM64_REGISTER_CNTV_CTL_EL0: RegisterId = 157

public val ARM64_REGISTER_CNTV_CVAL_EL0: RegisterId = 156

public val ARM64_REGISTER_CONTEXT_IDR_EL1: RegisterId = 152

public val ARM64_REGISTER_CPACR_EL1: RegisterId = 153

public val ARM64_REGISTER_CPSR: RegisterId = 101

public val ARM64_REGISTER_CSSELR_EL1: RegisterId = 154

public val ARM64_REGISTER_ELR_EL1: RegisterId = 140

public val ARM64_REGISTER_ESR_EL1: RegisterId = 136

public val ARM64_REGISTER_FAR_EL1: RegisterId = 138

public val ARM64_REGISTER_FP_CONTROL: RegisterId = 135

public val ARM64_REGISTER_FP_STATUS: RegisterId = 134

public val ARM64_REGISTER_MAIR_EL1: RegisterId = 147

public val ARM64_REGISTER_MAX: RegisterId = 158

public val ARM64_REGISTER_PAR_EL1: RegisterId = 139

public val ARM64_REGISTER_PC: RegisterId = 98

public val ARM64_REGISTER_Q0: RegisterId = 102

public val ARM64_REGISTER_Q1: RegisterId = 103

public val ARM64_REGISTER_Q10: RegisterId = 112

public val ARM64_REGISTER_Q11: RegisterId = 113

public val ARM64_REGISTER_Q12: RegisterId = 114

public val ARM64_REGISTER_Q13: RegisterId = 115

public val ARM64_REGISTER_Q14: RegisterId = 116

public val ARM64_REGISTER_Q15: RegisterId = 117

public val ARM64_REGISTER_Q16: RegisterId = 118

public val ARM64_REGISTER_Q17: RegisterId = 119

public val ARM64_REGISTER_Q18: RegisterId = 120

public val ARM64_REGISTER_Q19: RegisterId = 121

public val ARM64_REGISTER_Q2: RegisterId = 104

public val ARM64_REGISTER_Q20: RegisterId = 122

public val ARM64_REGISTER_Q21: RegisterId = 123

public val ARM64_REGISTER_Q22: RegisterId = 124

public val ARM64_REGISTER_Q23: RegisterId = 125

public val ARM64_REGISTER_Q24: RegisterId = 126

public val ARM64_REGISTER_Q25: RegisterId = 127

public val ARM64_REGISTER_Q26: RegisterId = 128

public val ARM64_REGISTER_Q27: RegisterId = 129

public val ARM64_REGISTER_Q28: RegisterId = 130

public val ARM64_REGISTER_Q29: RegisterId = 131

public val ARM64_REGISTER_Q3: RegisterId = 105

public val ARM64_REGISTER_Q30: RegisterId = 132

public val ARM64_REGISTER_Q31: RegisterId = 133

public val ARM64_REGISTER_Q4: RegisterId = 106

public val ARM64_REGISTER_Q5: RegisterId = 107

public val ARM64_REGISTER_Q6: RegisterId = 108

public val ARM64_REGISTER_Q7: RegisterId = 109

public val ARM64_REGISTER_Q8: RegisterId = 110

public val ARM64_REGISTER_Q9: RegisterId = 111

public val ARM64_REGISTER_SCTLR_EL1: RegisterId = 144

public val ARM64_REGISTER_SP_EL0: RegisterId = 99

public val ARM64_REGISTER_SP_EL1: RegisterId = 100

public val ARM64_REGISTER_SPSR_EL1: RegisterId = 137

public val ARM64_REGISTER_TCR_EL1: RegisterId = 146

public val ARM64_REGISTER_TPIDR_EL0: RegisterId = 149

public val ARM64_REGISTER_TPIDR_EL1: RegisterId = 151

public val ARM64_REGISTER_TPIDRRO_EL0: RegisterId = 150

public val ARM64_REGISTER_TTBR0EL1: RegisterId = 141

public val ARM64_REGISTER_TTBR1EL1: RegisterId = 142

public val ARM64_REGISTER_VBAR_EL1: RegisterId = 143

public val ARM64_REGISTER_X0: RegisterId = 67

public val ARM64_REGISTER_X1: RegisterId = 68

public val ARM64_REGISTER_X10: RegisterId = 77

public val ARM64_REGISTER_X11: RegisterId = 78

public val ARM64_REGISTER_X12: RegisterId = 79

public val ARM64_REGISTER_X13: RegisterId = 80

public val ARM64_REGISTER_X14: RegisterId = 81

public val ARM64_REGISTER_X15: RegisterId = 82

public val ARM64_REGISTER_X16: RegisterId = 83

public val ARM64_REGISTER_X17: RegisterId = 84

public val ARM64_REGISTER_X18: RegisterId = 85

public val ARM64_REGISTER_X19: RegisterId = 86

public val ARM64_REGISTER_X2: RegisterId = 69

public val ARM64_REGISTER_X20: RegisterId = 87

public val ARM64_REGISTER_X21: RegisterId = 88

public val ARM64_REGISTER_X22: RegisterId = 89

public val ARM64_REGISTER_X23: RegisterId = 90

public val ARM64_REGISTER_X24: RegisterId = 91

public val ARM64_REGISTER_X25: RegisterId = 92

public val ARM64_REGISTER_X26: RegisterId = 93

public val ARM64_REGISTER_X27: RegisterId = 94

public val ARM64_REGISTER_X28: RegisterId = 95

public val ARM64_REGISTER_X3: RegisterId = 70

public val ARM64_REGISTER_X4: RegisterId = 71

public val ARM64_REGISTER_X5: RegisterId = 72

public val ARM64_REGISTER_X6: RegisterId = 73

public val ARM64_REGISTER_X7: RegisterId = 74

public val ARM64_REGISTER_X8: RegisterId = 75

public val ARM64_REGISTER_X9: RegisterId = 76

public val ARM64_REGISTER_X_FP: RegisterId = 96

public val ARM64_REGISTER_X_LR: RegisterId = 97

public val ARCH_ARMV8: VirtualProcessorArch = 3

public val ARCH_UNKNOWN: VirtualProcessorArch = 0

public val ARCH_X64: VirtualProcessorArch = 2

public val ARCH_X86: VirtualProcessorArch = 1

public val GUEST_OS_MICROSOFT_MSDOS: GuestOsMicrosoftIds = 1

public val GUEST_OS_MICROSOFT_UNDEFINED: GuestOsMicrosoftIds = 0

public val GUEST_OS_MICROSOFT_WINDOWS3X: GuestOsMicrosoftIds = 2

public val GUEST_OS_MICROSOFT_WINDOWS9X: GuestOsMicrosoftIds = 3

public val GUEST_OS_MICROSOFT_WINDOWS_CE: GuestOsMicrosoftIds = 5

public val GUEST_OS_MICROSOFT_WINDOWS_NT: GuestOsMicrosoftIds = 4

public val GUEST_OS_OPEN_SOURCE_FREE_BSD: GuestOsOpensourceIds = 2

public val GUEST_OS_OPEN_SOURCE_ILLUMOS: GuestOsOpensourceIds = 4

public val GUEST_OS_OPEN_SOURCE_LINUX: GuestOsOpensourceIds = 1

public val GUEST_OS_OPEN_SOURCE_UNDEFINED: GuestOsOpensourceIds = 0

public val GUEST_OS_OPEN_SOURCE_XEN: GuestOsOpensourceIds = 3

public val GUEST_OS_VENDOR_HPE: GuestOsVendor = 2

public val GUEST_OS_VENDOR_LANCOM: GuestOsVendor = 512

public val GUEST_OS_VENDOR_MICROSOFT: GuestOsVendor = 1

public val GUEST_OS_VENDOR_UNDEFINED: GuestOsVendor = 0

public val HDV_DOORBELL_FLAG_TRIGGER_ANY_VALUE: HdvDoorbellFlags = -2147483648.toInt()

public val HDV_DOORBELL_FLAG_TRIGGER_SIZE_ANY: HdvDoorbellFlags = 0

public val HDV_DOORBELL_FLAG_TRIGGER_SIZE_BYTE: HdvDoorbellFlags = 1

public val HDV_DOORBELL_FLAG_TRIGGER_SIZE_DWORD: HdvDoorbellFlags = 3

public val HDV_DOORBELL_FLAG_TRIGGER_SIZE_QWORD: HdvDoorbellFlags = 4

public val HDV_DOORBELL_FLAG_TRIGGER_SIZE_WORD: HdvDoorbellFlags = 2

public val HDV_PCI_BAR0: HdvPciBarSelector = 0

public val HDV_PCI_BAR1: HdvPciBarSelector = 1

public val HDV_PCI_BAR2: HdvPciBarSelector = 2

public val HDV_PCI_BAR3: HdvPciBarSelector = 3

public val HDV_PCI_BAR4: HdvPciBarSelector = 4

public val HDV_PCI_BAR5: HdvPciBarSelector = 5

public val HDV_PCI_BAR_COUNT: UInt = 6u

public val HVSOCKET_ADDRESS_FLAG_PASSTHRU: UInt = 1u

public val HVSOCKET_CONNECTED_SUSPEND: UInt = 4u

public val HVSOCKET_CONNECT_TIMEOUT: UInt = 1u

public val HVSOCKET_CONNECT_TIMEOUT_MAX: UInt = 300000u

public val HVSOCKET_HIGH_VTL: UInt = 8u

public val HV_PROTOCOL_RAW: UInt = 1u

public val HDV_DEVICE_HOST_FLAG_INITIALIZE_COM_SECURITY: HdvDeviceHostFlags = 1

public val HDV_DEVICE_HOST_FLAG_NONE: HdvDeviceHostFlags = 0

public val HDV_DEVICE_TYPE_PCI: HdvDeviceType = 1

public val HDV_DEVICE_TYPE_UNDEFINED: HdvDeviceType = 0

public val HDV_MMIO_MAPPING_FLAG_EXECUTABLE: HdvMmioMappingFlags = 2

public val HDV_MMIO_MAPPING_FLAG_NONE: HdvMmioMappingFlags = 0

public val HDV_MMIO_MAPPING_FLAG_WRITEABLE: HdvMmioMappingFlags = 1

public val HDV_PCI_DEVICE_INTERFACE_VERSION1: HdvPciInterfaceVersion = 1

public val HDV_PCI_DEVICE_INTERFACE_VERSION_INVALID: HdvPciInterfaceVersion = 0

public val IOCTL_VMGENCOUNTER_READ: UInt = 3325956u

public val PAGING_32BIT: PagingMode = 2

public val PAGING_ARMV8: PagingMode = 5

public val PAGING_INVALID: PagingMode = 0

public val PAGING_LONG: PagingMode = 4

public val PAGING_NON_PAGED: PagingMode = 1

public val PAGING_PAE: PagingMode = 3

public val PROCESSOR_VENDOR_AMD: VirtualProcessorVendor = 1

public val PROCESSOR_VENDOR_ARM: VirtualProcessorVendor = 4

public val PROCESSOR_VENDOR_HYGON: VirtualProcessorVendor = 3

public val PROCESSOR_VENDOR_INTEL: VirtualProcessorVendor = 2

public val PROCESSOR_VENDOR_UNKNOWN: VirtualProcessorVendor = 0

public val VM_GENCOUNTER_SYMBOLIC_LINK_NAME: Pcwstr = w("\\VmGenerationCounter")

public val WHV_ANY_VP: UInt = 4294967295u

public val WHV_HYPERCALL_CONTEXT_MAX_XMM_REGISTERS: UInt = 6u

public val WHV_MAX_DEVICE_ID_SIZE_IN_CHARS: UInt = 200u

public val WHV_PROCESSOR_FEATURES_BANKS_COUNT: UInt = 2u

public val WHV_READ_WRITE_GPA_RANGE_MAX_SIZE: UInt = 16u

public val WHV_SYNIC_MESSAGE_SIZE: UInt = 256u

public val WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_COUNT: UInt = 1u

public val WHV_VPCI_TYPE0_BAR_COUNT: UInt = 6u

public val W_HV_ADVISE_GPA_RANGE_CODE_PIN: WhvAdviseGpaRangeCode = 1

public val W_HV_ADVISE_GPA_RANGE_CODE_POPULATE: WhvAdviseGpaRangeCode = 0

public val W_HV_ADVISE_GPA_RANGE_CODE_UNPIN: WhvAdviseGpaRangeCode = 2

public val W_HV_ALLOCATE_VPCI_RESOURCE_FLAG_ALLOW_DIRECT_P2P: WhvAllocateVpciResourceFlags = 1

public val W_HV_ALLOCATE_VPCI_RESOURCE_FLAG_NONE: WhvAllocateVpciResourceFlags = 0

public val W_HV_CACHE_TYPE_UNCACHED: WhvCacheType = 0

public val W_HV_CACHE_TYPE_WRITE_BACK: WhvCacheType = 6

public val W_HV_CACHE_TYPE_WRITE_COMBINING: WhvCacheType = 1

public val W_HV_CACHE_TYPE_WRITE_THROUGH: WhvCacheType = 4

public val W_HV_CAPABILITY_CODE_EXCEPTION_EXIT_BITMAP: WhvCapabilityCode = 3

public val W_HV_CAPABILITY_CODE_EXTENDED_VM_EXITS: WhvCapabilityCode = 2

public val W_HV_CAPABILITY_CODE_FEATURES: WhvCapabilityCode = 1

public val W_HV_CAPABILITY_CODE_GPA_RANGE_POPULATE_FLAGS: WhvCapabilityCode = 5

public val W_HV_CAPABILITY_CODE_HYPERVISOR_PRESENT: WhvCapabilityCode = 0

public val W_HV_CAPABILITY_CODE_INTERRUPT_CLOCK_FREQUENCY: WhvCapabilityCode = 4101

public val W_HV_CAPABILITY_CODE_PROCESSOR_CL_FLUSH_SIZE: WhvCapabilityCode = 4098

public val W_HV_CAPABILITY_CODE_PROCESSOR_CLOCK_FREQUENCY: WhvCapabilityCode = 4100

public val W_HV_CAPABILITY_CODE_PROCESSOR_FEATURES: WhvCapabilityCode = 4097

public val W_HV_CAPABILITY_CODE_PROCESSOR_FEATURES_BANKS: WhvCapabilityCode = 4102

public val W_HV_CAPABILITY_CODE_PROCESSOR_FREQUENCY_CAP: WhvCapabilityCode = 4103

public val W_HV_CAPABILITY_CODE_PROCESSOR_PERFMON_FEATURES: WhvCapabilityCode = 4105

public val W_HV_CAPABILITY_CODE_PROCESSOR_VENDOR: WhvCapabilityCode = 4096

public val W_HV_CAPABILITY_CODE_PROCESSOR_XSAVE_FEATURES: WhvCapabilityCode = 4099

public val W_HV_CAPABILITY_CODE_SCHEDULER_FEATURES: WhvCapabilityCode = 6

public val W_HV_CAPABILITY_CODE_SYNTHETIC_PROCESSOR_FEATURES_BANKS: WhvCapabilityCode = 4104

public val W_HV_CAPABILITY_CODE_X64MSR_EXIT_BITMAP: WhvCapabilityCode = 4

public val W_HV_CREATE_VPCI_DEVICE_FLAG_NONE: WhvCreateVpciDeviceFlags = 0

public val W_HV_CREATE_VPCI_DEVICE_FLAG_PHYSICALLY_BACKED: WhvCreateVpciDeviceFlags = 1

public val W_HV_CREATE_VPCI_DEVICE_FLAG_USE_LOGICAL_INTERRUPTS: WhvCreateVpciDeviceFlags = 2

public val W_HV_MAP_GPA_RANGE_FLAG_EXECUTE: WhvMapGpaRangeFlags = 4

public val W_HV_MAP_GPA_RANGE_FLAG_NONE: WhvMapGpaRangeFlags = 0

public val W_HV_MAP_GPA_RANGE_FLAG_READ: WhvMapGpaRangeFlags = 1

public val W_HV_MAP_GPA_RANGE_FLAG_TRACK_DIRTY_PAGES: WhvMapGpaRangeFlags = 8

public val W_HV_MAP_GPA_RANGE_FLAG_WRITE: WhvMapGpaRangeFlags = 2

public val W_HV_MEMORY_ACCESS_EXECUTE: WhvMemoryAccessType = 2

public val W_HV_MEMORY_ACCESS_READ: WhvMemoryAccessType = 0

public val W_HV_MEMORY_ACCESS_WRITE: WhvMemoryAccessType = 1

public val W_HV_MSR_ACTION_ARCHITECTURE_DEFAULT: WhvMsrAction = 0

public val W_HV_MSR_ACTION_EXIT: WhvMsrAction = 2

public val W_HV_MSR_ACTION_IGNORE_WRITE_READ_ZERO: WhvMsrAction = 1

public val W_HV_NOTIFICATION_PORT_PROPERTY_PREFERRED_TARGET_DURATION: WhvNotificationPortPropertyCode = 5

public val W_HV_NOTIFICATION_PORT_PROPERTY_PREFERRED_TARGET_VP: WhvNotificationPortPropertyCode = 1

public val W_HV_NOTIFICATION_PORT_TYPE_DOORBELL: WhvNotificationPortType = 4

public val W_HV_NOTIFICATION_PORT_TYPE_EVENT: WhvNotificationPortType = 2

public val W_HV_PARTITION_COUNTER_SET_MEMORY: WhvPartitionCounterSet = 0

public val W_HV_PARTITION_PROPERTY_CODE_ALLOW_DEVICE_ASSIGNMENT: WhvPartitionPropertyCode = 12

public val W_HV_PARTITION_PROPERTY_CODE_APIC_REMOTE_READ_SUPPORT: WhvPartitionPropertyCode = 4105

public val W_HV_PARTITION_PROPERTY_CODE_CPU_CAP: WhvPartitionPropertyCode = 8

public val W_HV_PARTITION_PROPERTY_CODE_CPU_GROUP_ID: WhvPartitionPropertyCode = 10

public val W_HV_PARTITION_PROPERTY_CODE_CPU_RESERVE: WhvPartitionPropertyCode = 7

public val W_HV_PARTITION_PROPERTY_CODE_CPU_WEIGHT: WhvPartitionPropertyCode = 9

public val W_HV_PARTITION_PROPERTY_CODE_CPUID_EXIT_LIST: WhvPartitionPropertyCode = 4099

public val W_HV_PARTITION_PROPERTY_CODE_CPUID_RESULT_LIST: WhvPartitionPropertyCode = 4100

public val W_HV_PARTITION_PROPERTY_CODE_CPUID_RESULT_LIST2: WhvPartitionPropertyCode = 4109

public val W_HV_PARTITION_PROPERTY_CODE_DISABLE_SMT: WhvPartitionPropertyCode = 13

public val W_HV_PARTITION_PROPERTY_CODE_EXCEPTION_EXIT_BITMAP: WhvPartitionPropertyCode = 2

public val W_HV_PARTITION_PROPERTY_CODE_EXTENDED_VM_EXITS: WhvPartitionPropertyCode = 1

public val W_HV_PARTITION_PROPERTY_CODE_INTERRUPT_CLOCK_FREQUENCY: WhvPartitionPropertyCode = 4104

public val W_HV_PARTITION_PROPERTY_CODE_LOCAL_APIC_EMULATION_MODE: WhvPartitionPropertyCode = 4101

public val W_HV_PARTITION_PROPERTY_CODE_MSR_ACTION_LIST: WhvPartitionPropertyCode = 4111

public val W_HV_PARTITION_PROPERTY_CODE_NESTED_VIRTUALIZATION: WhvPartitionPropertyCode = 4

public val W_HV_PARTITION_PROPERTY_CODE_PRIMARY_NUMA_NODE: WhvPartitionPropertyCode = 6

public val W_HV_PARTITION_PROPERTY_CODE_PROCESSOR_CL_FLUSH_SIZE: WhvPartitionPropertyCode = 4098

public val W_HV_PARTITION_PROPERTY_CODE_PROCESSOR_CLOCK_FREQUENCY: WhvPartitionPropertyCode = 4103

public val W_HV_PARTITION_PROPERTY_CODE_PROCESSOR_COUNT: WhvPartitionPropertyCode = 8191

public val W_HV_PARTITION_PROPERTY_CODE_PROCESSOR_FEATURES: WhvPartitionPropertyCode = 4097

public val W_HV_PARTITION_PROPERTY_CODE_PROCESSOR_FEATURES_BANKS: WhvPartitionPropertyCode = 4106

public val W_HV_PARTITION_PROPERTY_CODE_PROCESSOR_FREQUENCY_CAP: WhvPartitionPropertyCode = 11

public val W_HV_PARTITION_PROPERTY_CODE_PROCESSOR_PERFMON_FEATURES: WhvPartitionPropertyCode = 4110

public val W_HV_PARTITION_PROPERTY_CODE_PROCESSOR_XSAVE_FEATURES: WhvPartitionPropertyCode = 4102

public val W_HV_PARTITION_PROPERTY_CODE_REFERENCE_TIME: WhvPartitionPropertyCode = 4107

public val W_HV_PARTITION_PROPERTY_CODE_SEPARATE_SECURITY_DOMAIN: WhvPartitionPropertyCode = 3

public val W_HV_PARTITION_PROPERTY_CODE_SYNTHETIC_PROCESSOR_FEATURES_BANKS: WhvPartitionPropertyCode = 4108

public val W_HV_PARTITION_PROPERTY_CODE_UNIMPLEMENTED_MSR_ACTION: WhvPartitionPropertyCode = 4112

public val W_HV_PARTITION_PROPERTY_CODE_X64MSR_EXIT_BITMAP: WhvPartitionPropertyCode = 5

public val W_HV_PROCESSOR_COUNTER_SET_APIC: WhvProcessorCounterSet = 3

public val W_HV_PROCESSOR_COUNTER_SET_EVENTS: WhvProcessorCounterSet = 2

public val W_HV_PROCESSOR_COUNTER_SET_INTERCEPTS: WhvProcessorCounterSet = 1

public val W_HV_PROCESSOR_COUNTER_SET_RUNTIME: WhvProcessorCounterSet = 0

public val W_HV_PROCESSOR_COUNTER_SET_SYNTHETIC_FEATURES: WhvProcessorCounterSet = 4

public val W_HV_PROCESSOR_VENDOR_AMD: WhvProcessorVendor = 0

public val W_HV_PROCESSOR_VENDOR_HYGON: WhvProcessorVendor = 2

public val W_HV_PROCESSOR_VENDOR_INTEL: WhvProcessorVendor = 1

public val W_HV_REGISTER_EOM: WhvRegisterName = 16404

public val W_HV_REGISTER_GUEST_OS_ID: WhvRegisterName = 20482

public val W_HV_REGISTER_INTERNAL_ACTIVITY_STATE: WhvRegisterName = -2147483643

public val W_HV_REGISTER_INTERRUPT_STATE: WhvRegisterName = -2147483647

public val W_HV_REGISTER_PENDING_EVENT: WhvRegisterName = -2147483646

public val W_HV_REGISTER_PENDING_INTERRUPTION: WhvRegisterName = -2147483648.toInt()

public val W_HV_REGISTER_REFERENCE_TSC: WhvRegisterName = 20503

public val W_HV_REGISTER_REFERENCE_TSC_SEQUENCE: WhvRegisterName = 20506

public val W_HV_REGISTER_SCONTROL: WhvRegisterName = 16400

public val W_HV_REGISTER_SIEFP: WhvRegisterName = 16402

public val W_HV_REGISTER_SIMP: WhvRegisterName = 16403

public val W_HV_REGISTER_SINT0: WhvRegisterName = 16384

public val W_HV_REGISTER_SINT1: WhvRegisterName = 16385

public val W_HV_REGISTER_SINT10: WhvRegisterName = 16394

public val W_HV_REGISTER_SINT11: WhvRegisterName = 16395

public val W_HV_REGISTER_SINT12: WhvRegisterName = 16396

public val W_HV_REGISTER_SINT13: WhvRegisterName = 16397

public val W_HV_REGISTER_SINT14: WhvRegisterName = 16398

public val W_HV_REGISTER_SINT15: WhvRegisterName = 16399

public val W_HV_REGISTER_SINT2: WhvRegisterName = 16386

public val W_HV_REGISTER_SINT3: WhvRegisterName = 16387

public val W_HV_REGISTER_SINT4: WhvRegisterName = 16388

public val W_HV_REGISTER_SINT5: WhvRegisterName = 16389

public val W_HV_REGISTER_SINT6: WhvRegisterName = 16390

public val W_HV_REGISTER_SINT7: WhvRegisterName = 16391

public val W_HV_REGISTER_SINT8: WhvRegisterName = 16392

public val W_HV_REGISTER_SINT9: WhvRegisterName = 16393

public val W_HV_REGISTER_SVERSION: WhvRegisterName = 16401

public val W_HV_REGISTER_VP_ASSIST_PAGE: WhvRegisterName = 20499

public val W_HV_REGISTER_VP_RUNTIME: WhvRegisterName = 20480

public val W_HV_RUN_VP_CANCEL_REASON_USER: WhvRunVpCancelReason = 0

public val W_HV_RUN_VP_EXIT_REASON_CANCELED: WhvRunVpExitReason = 8193

public val W_HV_RUN_VP_EXIT_REASON_EXCEPTION: WhvRunVpExitReason = 4098

public val W_HV_RUN_VP_EXIT_REASON_HYPERCALL: WhvRunVpExitReason = 4101

public val W_HV_RUN_VP_EXIT_REASON_INVALID_VP_REGISTER_VALUE: WhvRunVpExitReason = 5

public val W_HV_RUN_VP_EXIT_REASON_MEMORY_ACCESS: WhvRunVpExitReason = 1

public val W_HV_RUN_VP_EXIT_REASON_NONE: WhvRunVpExitReason = 0

public val W_HV_RUN_VP_EXIT_REASON_SYNIC_SINT_DELIVERABLE: WhvRunVpExitReason = 10

public val W_HV_RUN_VP_EXIT_REASON_UNRECOVERABLE_EXCEPTION: WhvRunVpExitReason = 4

public val W_HV_RUN_VP_EXIT_REASON_UNSUPPORTED_FEATURE: WhvRunVpExitReason = 6

public val W_HV_RUN_VP_EXIT_REASON_X64APIC_EOI: WhvRunVpExitReason = 9

public val W_HV_RUN_VP_EXIT_REASON_X64APIC_INIT_SIPI_TRAP: WhvRunVpExitReason = 4102

public val W_HV_RUN_VP_EXIT_REASON_X64APIC_SMI_TRAP: WhvRunVpExitReason = 4100

public val W_HV_RUN_VP_EXIT_REASON_X64APIC_WRITE_TRAP: WhvRunVpExitReason = 4103

public val W_HV_RUN_VP_EXIT_REASON_X64CPUID: WhvRunVpExitReason = 4097

public val W_HV_RUN_VP_EXIT_REASON_X64HALT: WhvRunVpExitReason = 8

public val W_HV_RUN_VP_EXIT_REASON_X64INTERRUPT_WINDOW: WhvRunVpExitReason = 7

public val W_HV_RUN_VP_EXIT_REASON_X64IO_PORT_ACCESS: WhvRunVpExitReason = 2

public val W_HV_RUN_VP_EXIT_REASON_X64MSR_ACCESS: WhvRunVpExitReason = 4096

public val W_HV_RUN_VP_EXIT_REASON_X64RDTSC: WhvRunVpExitReason = 4099

public val W_HV_TRANSLATE_GVA_FLAG_ENFORCE_SMAP: WhvTranslateGvaFlags = 256

public val W_HV_TRANSLATE_GVA_FLAG_NONE: WhvTranslateGvaFlags = 0

public val W_HV_TRANSLATE_GVA_FLAG_OVERRIDE_SMAP: WhvTranslateGvaFlags = 512

public val W_HV_TRANSLATE_GVA_FLAG_PRIVILEGE_EXEMPT: WhvTranslateGvaFlags = 8

public val W_HV_TRANSLATE_GVA_FLAG_SET_PAGE_TABLE_BITS: WhvTranslateGvaFlags = 16

public val W_HV_TRANSLATE_GVA_FLAG_VALIDATE_EXECUTE: WhvTranslateGvaFlags = 4

public val W_HV_TRANSLATE_GVA_FLAG_VALIDATE_READ: WhvTranslateGvaFlags = 1

public val W_HV_TRANSLATE_GVA_FLAG_VALIDATE_WRITE: WhvTranslateGvaFlags = 2

public val W_HV_TRANSLATE_GVA_RESULT_GPA_ILLEGAL_OVERLAY_ACCESS: WhvTranslateGvaResultCode = 7

public val W_HV_TRANSLATE_GVA_RESULT_GPA_NO_READ_ACCESS: WhvTranslateGvaResultCode = 5

public val W_HV_TRANSLATE_GVA_RESULT_GPA_NO_WRITE_ACCESS: WhvTranslateGvaResultCode = 6

public val W_HV_TRANSLATE_GVA_RESULT_GPA_UNMAPPED: WhvTranslateGvaResultCode = 4

public val W_HV_TRANSLATE_GVA_RESULT_INTERCEPT: WhvTranslateGvaResultCode = 8

public val W_HV_TRANSLATE_GVA_RESULT_INVALID_PAGE_TABLE_FLAGS: WhvTranslateGvaResultCode = 3

public val W_HV_TRANSLATE_GVA_RESULT_PAGE_NOT_PRESENT: WhvTranslateGvaResultCode = 1

public val W_HV_TRANSLATE_GVA_RESULT_PRIVILEGE_VIOLATION: WhvTranslateGvaResultCode = 2

public val W_HV_TRANSLATE_GVA_RESULT_SUCCESS: WhvTranslateGvaResultCode = 0

public val W_HV_TRIGGER_TYPE_DEVICE_INTERRUPT: WhvTriggerType = 2

public val W_HV_TRIGGER_TYPE_INTERRUPT: WhvTriggerType = 0

public val W_HV_TRIGGER_TYPE_SYNIC_EVENT: WhvTriggerType = 1

public val W_HV_UNSUPPORTED_FEATURE_INTERCEPT: WhvX64UnsupportedFeatureCode = 1

public val W_HV_UNSUPPORTED_FEATURE_TASK_SWITCH_TSS: WhvX64UnsupportedFeatureCode = 2

public val W_HV_VIRTUAL_PROCESSOR_PROPERTY_CODE_NUMA_NODE: WhvVirtualProcessorPropertyCode = 0

public val W_HV_VIRTUAL_PROCESSOR_STATE_TYPE_INTERRUPT_CONTROLLER_STATE2: WhvVirtualProcessorStateType = 4096

public val W_HV_VIRTUAL_PROCESSOR_STATE_TYPE_SYNIC_EVENT_FLAG_PAGE: WhvVirtualProcessorStateType = 1

public val W_HV_VIRTUAL_PROCESSOR_STATE_TYPE_SYNIC_MESSAGE_PAGE: WhvVirtualProcessorStateType = 0

public val W_HV_VIRTUAL_PROCESSOR_STATE_TYPE_SYNIC_TIMER_STATE: WhvVirtualProcessorStateType = 2

public val W_HV_VIRTUAL_PROCESSOR_STATE_TYPE_XSAVE_STATE: WhvVirtualProcessorStateType = 4097

public val W_HV_VPCI_BAR0: WhvVpciDeviceRegisterSpace = 0

public val W_HV_VPCI_BAR1: WhvVpciDeviceRegisterSpace = 1

public val W_HV_VPCI_BAR2: WhvVpciDeviceRegisterSpace = 2

public val W_HV_VPCI_BAR3: WhvVpciDeviceRegisterSpace = 3

public val W_HV_VPCI_BAR4: WhvVpciDeviceRegisterSpace = 4

public val W_HV_VPCI_BAR5: WhvVpciDeviceRegisterSpace = 5

public val W_HV_VPCI_CONFIG_SPACE: WhvVpciDeviceRegisterSpace = -1

public val W_HV_VPCI_DEVICE_NOTIFICATION_MMIO_REMAPPING: WhvVpciDeviceNotificationType = 1

public val W_HV_VPCI_DEVICE_NOTIFICATION_SURPRISE_REMOVAL: WhvVpciDeviceNotificationType = 2

public val W_HV_VPCI_DEVICE_NOTIFICATION_UNDEFINED: WhvVpciDeviceNotificationType = 0

public val W_HV_VPCI_DEVICE_PROPERTY_CODE_HARDWARE_I_DS: WhvVpciDevicePropertyCode = 1

public val W_HV_VPCI_DEVICE_PROPERTY_CODE_PROBED_BA_RS: WhvVpciDevicePropertyCode = 2

public val W_HV_VPCI_DEVICE_PROPERTY_CODE_UNDEFINED: WhvVpciDevicePropertyCode = 0

public val W_HV_VPCI_INTERRUPT_TARGET_FLAG_MULTICAST: WhvVpciInterruptTargetFlags = 1

public val W_HV_VPCI_INTERRUPT_TARGET_FLAG_NONE: WhvVpciInterruptTargetFlags = 0

public val W_HV_VPCI_MMIO_RANGE_FLAG_READ_ACCESS: WhvVpciMmioRangeFlags = 1

public val W_HV_VPCI_MMIO_RANGE_FLAG_WRITE_ACCESS: WhvVpciMmioRangeFlags = 2

public val W_HV_X64APIC_WRITE_TYPE_DFR: WhvX64ApicWriteType = 224

public val W_HV_X64APIC_WRITE_TYPE_LDR: WhvX64ApicWriteType = 208

public val W_HV_X64APIC_WRITE_TYPE_LINT0: WhvX64ApicWriteType = 848

public val W_HV_X64APIC_WRITE_TYPE_LINT1: WhvX64ApicWriteType = 864

public val W_HV_X64APIC_WRITE_TYPE_SVR: WhvX64ApicWriteType = 240

public val W_HV_X64CPUID_RESULT2FLAG_SUBLEAF_SPECIFIC: WhvX64CpuidResult2Flags = 1

public val W_HV_X64CPUID_RESULT2FLAG_VP_SPECIFIC: WhvX64CpuidResult2Flags = 2

public val W_HV_X64EXCEPTION_TYPE_ALIGNMENT_CHECK_FAULT: WhvExceptionType = 17

public val W_HV_X64EXCEPTION_TYPE_BOUND_RANGE_FAULT: WhvExceptionType = 5

public val W_HV_X64EXCEPTION_TYPE_BREAKPOINT_TRAP: WhvExceptionType = 3

public val W_HV_X64EXCEPTION_TYPE_DEBUG_TRAP_OR_FAULT: WhvExceptionType = 1

public val W_HV_X64EXCEPTION_TYPE_DEVICE_NOT_AVAILABLE_FAULT: WhvExceptionType = 7

public val W_HV_X64EXCEPTION_TYPE_DIVIDE_ERROR_FAULT: WhvExceptionType = 0

public val W_HV_X64EXCEPTION_TYPE_DOUBLE_FAULT_ABORT: WhvExceptionType = 8

public val W_HV_X64EXCEPTION_TYPE_FLOATING_POINT_ERROR_FAULT: WhvExceptionType = 16

public val W_HV_X64EXCEPTION_TYPE_GENERAL_PROTECTION_FAULT: WhvExceptionType = 13

public val W_HV_X64EXCEPTION_TYPE_INVALID_OPCODE_FAULT: WhvExceptionType = 6

public val W_HV_X64EXCEPTION_TYPE_INVALID_TASK_STATE_SEGMENT_FAULT: WhvExceptionType = 10

public val W_HV_X64EXCEPTION_TYPE_MACHINE_CHECK_ABORT: WhvExceptionType = 18

public val W_HV_X64EXCEPTION_TYPE_OVERFLOW_TRAP: WhvExceptionType = 4

public val W_HV_X64EXCEPTION_TYPE_PAGE_FAULT: WhvExceptionType = 14

public val W_HV_X64EXCEPTION_TYPE_SEGMENT_NOT_PRESENT_FAULT: WhvExceptionType = 11

public val W_HV_X64EXCEPTION_TYPE_SIMD_FLOATING_POINT_FAULT: WhvExceptionType = 19

public val W_HV_X64EXCEPTION_TYPE_STACK_FAULT: WhvExceptionType = 12

public val W_HV_X64INTERRUPT_DESTINATION_MODE_LOGICAL: WhvInterruptDestinationMode = 1

public val W_HV_X64INTERRUPT_DESTINATION_MODE_PHYSICAL: WhvInterruptDestinationMode = 0

public val W_HV_X64INTERRUPT_TRIGGER_MODE_EDGE: WhvInterruptTriggerMode = 0

public val W_HV_X64INTERRUPT_TRIGGER_MODE_LEVEL: WhvInterruptTriggerMode = 1

public val W_HV_X64INTERRUPT_TYPE_FIXED: WhvInterruptType = 0

public val W_HV_X64INTERRUPT_TYPE_INIT: WhvInterruptType = 5

public val W_HV_X64INTERRUPT_TYPE_LOCAL_INT1: WhvInterruptType = 9

public val W_HV_X64INTERRUPT_TYPE_LOWEST_PRIORITY: WhvInterruptType = 1

public val W_HV_X64INTERRUPT_TYPE_NMI: WhvInterruptType = 4

public val W_HV_X64INTERRUPT_TYPE_SIPI: WhvInterruptType = 6

public val W_HV_X64LOCAL_APIC_EMULATION_MODE_NONE: WhvX64LocalApicEmulationMode = 0

public val W_HV_X64LOCAL_APIC_EMULATION_MODE_X2APIC: WhvX64LocalApicEmulationMode = 2

public val W_HV_X64LOCAL_APIC_EMULATION_MODE_X_APIC: WhvX64LocalApicEmulationMode = 1

public val W_HV_X64PENDING_EVENT_EXCEPTION: WhvX64PendingEventType = 0

public val W_HV_X64PENDING_EVENT_EXT_INT: WhvX64PendingEventType = 5

public val W_HV_X64PENDING_EXCEPTION: WhvX64PendingInterruptionType = 3

public val W_HV_X64PENDING_INTERRUPT: WhvX64PendingInterruptionType = 0

public val W_HV_X64PENDING_NMI: WhvX64PendingInterruptionType = 2

public val W_HV_X64REGISTER_A_COUNT: WhvRegisterName = 8319

public val W_HV_X64REGISTER_APIC_BASE: WhvRegisterName = 8195

public val W_HV_X64REGISTER_APIC_CURRENT_COUNT: WhvRegisterName = 12345

public val W_HV_X64REGISTER_APIC_DIVIDE: WhvRegisterName = 12350

public val W_HV_X64REGISTER_APIC_EOI: WhvRegisterName = 12299

public val W_HV_X64REGISTER_APIC_ESE: WhvRegisterName = 12328

public val W_HV_X64REGISTER_APIC_ICR: WhvRegisterName = 12336

public val W_HV_X64REGISTER_APIC_ID: WhvRegisterName = 12290

public val W_HV_X64REGISTER_APIC_INIT_COUNT: WhvRegisterName = 12344

public val W_HV_X64REGISTER_APIC_IRR0: WhvRegisterName = 12320

public val W_HV_X64REGISTER_APIC_IRR1: WhvRegisterName = 12321

public val W_HV_X64REGISTER_APIC_IRR2: WhvRegisterName = 12322

public val W_HV_X64REGISTER_APIC_IRR3: WhvRegisterName = 12323

public val W_HV_X64REGISTER_APIC_IRR4: WhvRegisterName = 12324

public val W_HV_X64REGISTER_APIC_IRR5: WhvRegisterName = 12325

public val W_HV_X64REGISTER_APIC_IRR6: WhvRegisterName = 12326

public val W_HV_X64REGISTER_APIC_IRR7: WhvRegisterName = 12327

public val W_HV_X64REGISTER_APIC_ISR0: WhvRegisterName = 12304

public val W_HV_X64REGISTER_APIC_ISR1: WhvRegisterName = 12305

public val W_HV_X64REGISTER_APIC_ISR2: WhvRegisterName = 12306

public val W_HV_X64REGISTER_APIC_ISR3: WhvRegisterName = 12307

public val W_HV_X64REGISTER_APIC_ISR4: WhvRegisterName = 12308

public val W_HV_X64REGISTER_APIC_ISR5: WhvRegisterName = 12309

public val W_HV_X64REGISTER_APIC_ISR6: WhvRegisterName = 12310

public val W_HV_X64REGISTER_APIC_ISR7: WhvRegisterName = 12311

public val W_HV_X64REGISTER_APIC_LDR: WhvRegisterName = 12301

public val W_HV_X64REGISTER_APIC_LVT_ERROR: WhvRegisterName = 12343

public val W_HV_X64REGISTER_APIC_LVT_LINT0: WhvRegisterName = 12341

public val W_HV_X64REGISTER_APIC_LVT_LINT1: WhvRegisterName = 12342

public val W_HV_X64REGISTER_APIC_LVT_PERFMON: WhvRegisterName = 12340

public val W_HV_X64REGISTER_APIC_LVT_THERMAL: WhvRegisterName = 12339

public val W_HV_X64REGISTER_APIC_LVT_TIMER: WhvRegisterName = 12338

public val W_HV_X64REGISTER_APIC_PPR: WhvRegisterName = 12298

public val W_HV_X64REGISTER_APIC_SELF_IPI: WhvRegisterName = 12351

public val W_HV_X64REGISTER_APIC_SPURIOUS: WhvRegisterName = 12303

public val W_HV_X64REGISTER_APIC_TMR0: WhvRegisterName = 12312

public val W_HV_X64REGISTER_APIC_TMR1: WhvRegisterName = 12313

public val W_HV_X64REGISTER_APIC_TMR2: WhvRegisterName = 12314

public val W_HV_X64REGISTER_APIC_TMR3: WhvRegisterName = 12315

public val W_HV_X64REGISTER_APIC_TMR4: WhvRegisterName = 12316

public val W_HV_X64REGISTER_APIC_TMR5: WhvRegisterName = 12317

public val W_HV_X64REGISTER_APIC_TMR6: WhvRegisterName = 12318

public val W_HV_X64REGISTER_APIC_TMR7: WhvRegisterName = 12319

public val W_HV_X64REGISTER_APIC_TPR: WhvRegisterName = 12296

public val W_HV_X64REGISTER_APIC_VERSION: WhvRegisterName = 12291

public val W_HV_X64REGISTER_BNDCFGS: WhvRegisterName = 8316

public val W_HV_X64REGISTER_CR0: WhvRegisterName = 28

public val W_HV_X64REGISTER_CR2: WhvRegisterName = 29

public val W_HV_X64REGISTER_CR3: WhvRegisterName = 30

public val W_HV_X64REGISTER_CR4: WhvRegisterName = 31

public val W_HV_X64REGISTER_CR8: WhvRegisterName = 32

public val W_HV_X64REGISTER_CS: WhvRegisterName = 19

public val W_HV_X64REGISTER_CSTAR: WhvRegisterName = 8202

public val W_HV_X64REGISTER_DELIVERABILITY_NOTIFICATIONS: WhvRegisterName = -2147483644

public val W_HV_X64REGISTER_DR0: WhvRegisterName = 33

public val W_HV_X64REGISTER_DR1: WhvRegisterName = 34

public val W_HV_X64REGISTER_DR2: WhvRegisterName = 35

public val W_HV_X64REGISTER_DR3: WhvRegisterName = 36

public val W_HV_X64REGISTER_DR6: WhvRegisterName = 37

public val W_HV_X64REGISTER_DR7: WhvRegisterName = 38

public val W_HV_X64REGISTER_DS: WhvRegisterName = 21

public val W_HV_X64REGISTER_EFER: WhvRegisterName = 8193

public val W_HV_X64REGISTER_ES: WhvRegisterName = 18

public val W_HV_X64REGISTER_FP_CONTROL_STATUS: WhvRegisterName = 4120

public val W_HV_X64REGISTER_FP_MMX0: WhvRegisterName = 4112

public val W_HV_X64REGISTER_FP_MMX1: WhvRegisterName = 4113

public val W_HV_X64REGISTER_FP_MMX2: WhvRegisterName = 4114

public val W_HV_X64REGISTER_FP_MMX3: WhvRegisterName = 4115

public val W_HV_X64REGISTER_FP_MMX4: WhvRegisterName = 4116

public val W_HV_X64REGISTER_FP_MMX5: WhvRegisterName = 4117

public val W_HV_X64REGISTER_FP_MMX6: WhvRegisterName = 4118

public val W_HV_X64REGISTER_FP_MMX7: WhvRegisterName = 4119

public val W_HV_X64REGISTER_FS: WhvRegisterName = 22

public val W_HV_X64REGISTER_GDTR: WhvRegisterName = 27

public val W_HV_X64REGISTER_GS: WhvRegisterName = 23

public val W_HV_X64REGISTER_HYPERCALL: WhvRegisterName = 20481

public val W_HV_X64REGISTER_IDTR: WhvRegisterName = 26

public val W_HV_X64REGISTER_INITIAL_APIC_ID: WhvRegisterName = 8204

public val W_HV_X64REGISTER_INTERRUPT_SSP_TABLE_ADDR: WhvRegisterName = 8339

public val W_HV_X64REGISTER_KERNEL_GS_BASE: WhvRegisterName = 8194

public val W_HV_X64REGISTER_LDTR: WhvRegisterName = 24

public val W_HV_X64REGISTER_LSTAR: WhvRegisterName = 8201

public val W_HV_X64REGISTER_M_COUNT: WhvRegisterName = 8318

public val W_HV_X64REGISTER_MSR_MTRR_CAP: WhvRegisterName = 8205

public val W_HV_X64REGISTER_MSR_MTRR_DEF_TYPE: WhvRegisterName = 8206

public val W_HV_X64REGISTER_MSR_MTRR_FIX16K80000: WhvRegisterName = 8305

public val W_HV_X64REGISTER_MSR_MTRR_FIX16K_A0000: WhvRegisterName = 8306

public val W_HV_X64REGISTER_MSR_MTRR_FIX4K_C0000: WhvRegisterName = 8307

public val W_HV_X64REGISTER_MSR_MTRR_FIX4K_C8000: WhvRegisterName = 8308

public val W_HV_X64REGISTER_MSR_MTRR_FIX4K_D0000: WhvRegisterName = 8309

public val W_HV_X64REGISTER_MSR_MTRR_FIX4K_D8000: WhvRegisterName = 8310

public val W_HV_X64REGISTER_MSR_MTRR_FIX4K_E0000: WhvRegisterName = 8311

public val W_HV_X64REGISTER_MSR_MTRR_FIX4K_E8000: WhvRegisterName = 8312

public val W_HV_X64REGISTER_MSR_MTRR_FIX4K_F0000: WhvRegisterName = 8313

public val W_HV_X64REGISTER_MSR_MTRR_FIX4K_F8000: WhvRegisterName = 8314

public val W_HV_X64REGISTER_MSR_MTRR_FIX64K00000: WhvRegisterName = 8304

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE0: WhvRegisterName = 8208

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE1: WhvRegisterName = 8209

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE2: WhvRegisterName = 8210

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE3: WhvRegisterName = 8211

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE4: WhvRegisterName = 8212

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE5: WhvRegisterName = 8213

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE6: WhvRegisterName = 8214

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE7: WhvRegisterName = 8215

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE8: WhvRegisterName = 8216

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE9: WhvRegisterName = 8217

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE_A: WhvRegisterName = 8218

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE_B: WhvRegisterName = 8219

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE_C: WhvRegisterName = 8220

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE_D: WhvRegisterName = 8221

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE_E: WhvRegisterName = 8222

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_BASE_F: WhvRegisterName = 8223

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK0: WhvRegisterName = 8256

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK1: WhvRegisterName = 8257

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK2: WhvRegisterName = 8258

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK3: WhvRegisterName = 8259

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK4: WhvRegisterName = 8260

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK5: WhvRegisterName = 8261

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK6: WhvRegisterName = 8262

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK7: WhvRegisterName = 8263

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK8: WhvRegisterName = 8264

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK9: WhvRegisterName = 8265

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK_A: WhvRegisterName = 8266

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK_B: WhvRegisterName = 8267

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK_C: WhvRegisterName = 8268

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK_D: WhvRegisterName = 8269

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK_E: WhvRegisterName = 8270

public val W_HV_X64REGISTER_MSR_MTRR_PHYS_MASK_F: WhvRegisterName = 8271

public val W_HV_X64REGISTER_PAT: WhvRegisterName = 8196

public val W_HV_X64REGISTER_PENDING_DEBUG_EXCEPTION: WhvRegisterName = -2147483642

public val W_HV_X64REGISTER_PL0SSP: WhvRegisterName = 8335

public val W_HV_X64REGISTER_PL1SSP: WhvRegisterName = 8336

public val W_HV_X64REGISTER_PL2SSP: WhvRegisterName = 8337

public val W_HV_X64REGISTER_PL3SSP: WhvRegisterName = 8338

public val W_HV_X64REGISTER_PRED_CMD: WhvRegisterName = 8325

public val W_HV_X64REGISTER_R10: WhvRegisterName = 10

public val W_HV_X64REGISTER_R11: WhvRegisterName = 11

public val W_HV_X64REGISTER_R12: WhvRegisterName = 12

public val W_HV_X64REGISTER_R13: WhvRegisterName = 13

public val W_HV_X64REGISTER_R14: WhvRegisterName = 14

public val W_HV_X64REGISTER_R15: WhvRegisterName = 15

public val W_HV_X64REGISTER_R8: WhvRegisterName = 8

public val W_HV_X64REGISTER_R9: WhvRegisterName = 9

public val W_HV_X64REGISTER_RAX: WhvRegisterName = 0

public val W_HV_X64REGISTER_RBP: WhvRegisterName = 5

public val W_HV_X64REGISTER_RBX: WhvRegisterName = 3

public val W_HV_X64REGISTER_RCX: WhvRegisterName = 1

public val W_HV_X64REGISTER_RDI: WhvRegisterName = 7

public val W_HV_X64REGISTER_RDX: WhvRegisterName = 2

public val W_HV_X64REGISTER_RFLAGS: WhvRegisterName = 17

public val W_HV_X64REGISTER_RIP: WhvRegisterName = 16

public val W_HV_X64REGISTER_RSI: WhvRegisterName = 6

public val W_HV_X64REGISTER_RSP: WhvRegisterName = 4

public val W_HV_X64REGISTER_S_CET: WhvRegisterName = 8333

public val W_HV_X64REGISTER_SFMASK: WhvRegisterName = 8203

public val W_HV_X64REGISTER_SPEC_CTRL: WhvRegisterName = 8324

public val W_HV_X64REGISTER_SS: WhvRegisterName = 20

public val W_HV_X64REGISTER_SSP: WhvRegisterName = 8334

public val W_HV_X64REGISTER_STAR: WhvRegisterName = 8200

public val W_HV_X64REGISTER_SYSENTER_CS: WhvRegisterName = 8197

public val W_HV_X64REGISTER_SYSENTER_EIP: WhvRegisterName = 8198

public val W_HV_X64REGISTER_SYSENTER_ESP: WhvRegisterName = 8199

public val W_HV_X64REGISTER_TR: WhvRegisterName = 25

public val W_HV_X64REGISTER_TSC: WhvRegisterName = 8192

public val W_HV_X64REGISTER_TSC_ADJUST: WhvRegisterName = 8342

public val W_HV_X64REGISTER_TSC_AUX: WhvRegisterName = 8315

public val W_HV_X64REGISTER_TSC_DEADLINE: WhvRegisterName = 8341

public val W_HV_X64REGISTER_TSC_VIRTUAL_OFFSET: WhvRegisterName = 8327

public val W_HV_X64REGISTER_TSX_CTRL: WhvRegisterName = 8328

public val W_HV_X64REGISTER_U_CET: WhvRegisterName = 8332

public val W_HV_X64REGISTER_UMWAIT_CONTROL: WhvRegisterName = 8344

public val W_HV_X64REGISTER_VIRTUAL_CR0: WhvRegisterName = 40

public val W_HV_X64REGISTER_VIRTUAL_CR3: WhvRegisterName = 41

public val W_HV_X64REGISTER_VIRTUAL_CR4: WhvRegisterName = 42

public val W_HV_X64REGISTER_VIRTUAL_CR8: WhvRegisterName = 43

public val W_HV_X64REGISTER_X_CR0: WhvRegisterName = 39

public val W_HV_X64REGISTER_XFD: WhvRegisterName = 8345

public val W_HV_X64REGISTER_XFD_ERR: WhvRegisterName = 8346

public val W_HV_X64REGISTER_XMM0: WhvRegisterName = 4096

public val W_HV_X64REGISTER_XMM1: WhvRegisterName = 4097

public val W_HV_X64REGISTER_XMM10: WhvRegisterName = 4106

public val W_HV_X64REGISTER_XMM11: WhvRegisterName = 4107

public val W_HV_X64REGISTER_XMM12: WhvRegisterName = 4108

public val W_HV_X64REGISTER_XMM13: WhvRegisterName = 4109

public val W_HV_X64REGISTER_XMM14: WhvRegisterName = 4110

public val W_HV_X64REGISTER_XMM15: WhvRegisterName = 4111

public val W_HV_X64REGISTER_XMM2: WhvRegisterName = 4098

public val W_HV_X64REGISTER_XMM3: WhvRegisterName = 4099

public val W_HV_X64REGISTER_XMM4: WhvRegisterName = 4100

public val W_HV_X64REGISTER_XMM5: WhvRegisterName = 4101

public val W_HV_X64REGISTER_XMM6: WhvRegisterName = 4102

public val W_HV_X64REGISTER_XMM7: WhvRegisterName = 4103

public val W_HV_X64REGISTER_XMM8: WhvRegisterName = 4104

public val W_HV_X64REGISTER_XMM9: WhvRegisterName = 4105

public val W_HV_X64REGISTER_XMM_CONTROL_STATUS: WhvRegisterName = 4121

public val W_HV_X64REGISTER_XSS: WhvRegisterName = 8331

public val X64_REGISTER_CR0: RegisterId = 44

public val X64_REGISTER_CR2: RegisterId = 45

public val X64_REGISTER_CR3: RegisterId = 46

public val X64_REGISTER_CR4: RegisterId = 47

public val X64_REGISTER_CR8: RegisterId = 48

public val X64_REGISTER_CS: RegisterId = 57

public val X64_REGISTER_DR0: RegisterId = 50

public val X64_REGISTER_DR1: RegisterId = 51

public val X64_REGISTER_DR2: RegisterId = 52

public val X64_REGISTER_DR3: RegisterId = 53

public val X64_REGISTER_DR6: RegisterId = 54

public val X64_REGISTER_DR7: RegisterId = 55

public val X64_REGISTER_DS: RegisterId = 59

public val X64_REGISTER_EFER: RegisterId = 49

public val X64_REGISTER_ES: RegisterId = 56

public val X64_REGISTER_FP_CONTROL_STATUS: RegisterId = 42

public val X64_REGISTER_FP_MMX0: RegisterId = 34

public val X64_REGISTER_FP_MMX1: RegisterId = 35

public val X64_REGISTER_FP_MMX2: RegisterId = 36

public val X64_REGISTER_FP_MMX3: RegisterId = 37

public val X64_REGISTER_FP_MMX4: RegisterId = 38

public val X64_REGISTER_FP_MMX5: RegisterId = 39

public val X64_REGISTER_FP_MMX6: RegisterId = 40

public val X64_REGISTER_FP_MMX7: RegisterId = 41

public val X64_REGISTER_FS: RegisterId = 60

public val X64_REGISTER_GDTR: RegisterId = 65

public val X64_REGISTER_GS: RegisterId = 61

public val X64_REGISTER_IDTR: RegisterId = 64

public val X64_REGISTER_LDTR: RegisterId = 62

public val X64_REGISTER_MAX: RegisterId = 66

public val X64_REGISTER_R10: RegisterId = 10

public val X64_REGISTER_R11: RegisterId = 11

public val X64_REGISTER_R12: RegisterId = 12

public val X64_REGISTER_R13: RegisterId = 13

public val X64_REGISTER_R14: RegisterId = 14

public val X64_REGISTER_R15: RegisterId = 15

public val X64_REGISTER_R8: RegisterId = 8

public val X64_REGISTER_R9: RegisterId = 9

public val X64_REGISTER_R_FLAGS: RegisterId = 17

public val X64_REGISTER_RAX: RegisterId = 0

public val X64_REGISTER_RBP: RegisterId = 5

public val X64_REGISTER_RBX: RegisterId = 3

public val X64_REGISTER_RCX: RegisterId = 1

public val X64_REGISTER_RDI: RegisterId = 7

public val X64_REGISTER_RDX: RegisterId = 2

public val X64_REGISTER_RIP: RegisterId = 16

public val X64_REGISTER_RSI: RegisterId = 6

public val X64_REGISTER_RSP: RegisterId = 4

public val X64_REGISTER_SS: RegisterId = 58

public val X64_REGISTER_TR: RegisterId = 63

public val X64_REGISTER_XMM0: RegisterId = 18

public val X64_REGISTER_XMM1: RegisterId = 19

public val X64_REGISTER_XMM10: RegisterId = 28

public val X64_REGISTER_XMM11: RegisterId = 29

public val X64_REGISTER_XMM12: RegisterId = 30

public val X64_REGISTER_XMM13: RegisterId = 31

public val X64_REGISTER_XMM14: RegisterId = 32

public val X64_REGISTER_XMM15: RegisterId = 33

public val X64_REGISTER_XMM2: RegisterId = 20

public val X64_REGISTER_XMM3: RegisterId = 21

public val X64_REGISTER_XMM4: RegisterId = 22

public val X64_REGISTER_XMM5: RegisterId = 23

public val X64_REGISTER_XMM6: RegisterId = 24

public val X64_REGISTER_XMM7: RegisterId = 25

public val X64_REGISTER_XMM8: RegisterId = 26

public val X64_REGISTER_XMM9: RegisterId = 27

public val X64_REGISTER_XMM_CONTROL_STATUS: RegisterId = 43

public val GUID_DEVINTERFACE_VM_GENCOUNTER: Guid = Guid.fromU128(U128(0x3ff2c92b65984e60uL, 0x8e1c0ccf4927e319uL))

public val HV_GUID_BROADCAST: Guid = Guid.fromU128(U128(0xffffffffffffffffuL, 0xffffffffffffffffuL))

public val HV_GUID_CHILDREN: Guid = Guid.fromU128(U128(0x90db8b890d354f79uL, 0x8ce949ea0ac8b7cduL))

public val HV_GUID_LOOPBACK: Guid = Guid.fromU128(U128(0xe0e16197dd564a10uL, 0x91955ee7a155a838uL))

public val HV_GUID_PARENT: Guid = Guid.fromU128(U128(0xa42e7cdad03f480cuL, 0x9cc2a4de20abb878uL))

public val HV_GUID_SILOHOST: Guid = Guid.fromU128(U128(0x36bd0c5c72764223uL, 0x88ba7d03b654c568uL))

public val HV_GUID_VSOCK_TEMPLATE: Guid = Guid.fromU128(U128(0xfacb11e6uL, 0xbd5864006a7986d3uL))

public val HV_GUID_ZERO: Guid = Guid.fromU128(U128(0x0uL, 0x0uL))
