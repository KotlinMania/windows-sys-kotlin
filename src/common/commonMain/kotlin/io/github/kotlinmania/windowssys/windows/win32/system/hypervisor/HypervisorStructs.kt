@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR

public data class DOS_IMAGE_INFO(
    public var PdbName: PCSTR = 0L,
    public var ImageBaseAddress: ULong = 0uL,
    public var ImageSize: UInt = 0u,
    public var Timestamp: UInt = 0u,
)

public data class GPA_MEMORY_CHUNK(public var GuestPhysicalStartPageIndex: ULong = 0uL, public var PageCount: ULong = 0uL)

public data class GUEST_OS_INFO(
    public var AsUINT64: ULong = 0uL,
    public var ClosedSource: GUEST_OS_INFO_0 = GUEST_OS_INFO_0(),
    public var OpenSource: GUEST_OS_INFO_1 = GUEST_OS_INFO_1(),
)

public data class GUEST_OS_INFO_0(public var _bitfield: ULong = 0uL)

public data class GUEST_OS_INFO_1(public var _bitfield: ULong = 0uL)

public data class HDV_PCI_DEVICE_INTERFACE(
    public var Version: HDV_PCI_INTERFACE_VERSION = 0,
    public var Initialize: HDV_PCI_DEVICE_INITIALIZE = null,
    public var Teardown: HDV_PCI_DEVICE_TEARDOWN = null,
    public var SetConfiguration: HDV_PCI_DEVICE_SET_CONFIGURATION = null,
    public var GetDetails: HDV_PCI_DEVICE_GET_DETAILS = null,
    public var Start: HDV_PCI_DEVICE_START = null,
    public var Stop: HDV_PCI_DEVICE_STOP = null,
    public var ReadConfigSpace: HDV_PCI_READ_CONFIG_SPACE = null,
    public var WriteConfigSpace: HDV_PCI_WRITE_CONFIG_SPACE = null,
    public var ReadInterceptedMemory: HDV_PCI_READ_INTERCEPTED_MEMORY = null,
    public var WriteInterceptedMemory: HDV_PCI_WRITE_INTERCEPTED_MEMORY = null,
)

public data class HDV_PCI_PNP_ID(
    public var VendorID: UShort = 0u,
    public var DeviceID: UShort = 0u,
    public var RevisionID: UByte = 0u,
    public var ProgIf: UByte = 0u,
    public var SubClass: UByte = 0u,
    public var BaseClass: UByte = 0u,
    public var SubVendorID: UShort = 0u,
    public var SubSystemID: UShort = 0u,
)

public data class HVSOCKET_ADDRESS_INFO(
    public var SystemId: GUID = GUID(),
    public var VirtualMachineId: GUID = GUID(),
    public var SiloId: GUID = GUID(),
    public var Flags: UInt = 0u,
)

public data class MODULE_INFO(public var ProcessImageName: PCSTR = 0L, public var Image: DOS_IMAGE_INFO = DOS_IMAGE_INFO())

public data class SOCKADDR_HV(
    public var Family: Networking.WinSock.ADDRESS_FAMILY = Networking.WinSock.ADDRESS_FAMILY(),
    public var Reserved: UShort = 0u,
    public var VmId: GUID = GUID(),
    public var ServiceId: GUID = GUID(),
)

public data class VIRTUAL_PROCESSOR_REGISTER(
    public var Reg64: ULong = 0uL,
    public var Reg32: UInt = 0u,
    public var Reg16: UShort = 0u,
    public var Reg8: UByte = 0u,
    public var Reg128: VIRTUAL_PROCESSOR_REGISTER_0 = VIRTUAL_PROCESSOR_REGISTER_0(),
    public var X64: VIRTUAL_PROCESSOR_REGISTER_1 = VIRTUAL_PROCESSOR_REGISTER_1(),
)

public data class VIRTUAL_PROCESSOR_REGISTER_0(public var Low64: ULong = 0uL, public var High64: ULong = 0uL)

public data class VIRTUAL_PROCESSOR_REGISTER_1(
    public var Segment: VIRTUAL_PROCESSOR_REGISTER_1_0 = VIRTUAL_PROCESSOR_REGISTER_1_0(),
    public var Table: VIRTUAL_PROCESSOR_REGISTER_1_1 = VIRTUAL_PROCESSOR_REGISTER_1_1(),
    public var FpControlStatus: VIRTUAL_PROCESSOR_REGISTER_1_2 = VIRTUAL_PROCESSOR_REGISTER_1_2(),
    public var XmmControlStatus: VIRTUAL_PROCESSOR_REGISTER_1_3 = VIRTUAL_PROCESSOR_REGISTER_1_3(),
)

public data class VIRTUAL_PROCESSOR_REGISTER_1_2(
    public var FpControl: UShort = 0u,
    public var FpStatus: UShort = 0u,
    public var FpTag: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var LastFpOp: UShort = 0u,
    public var Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_2_0 = VIRTUAL_PROCESSOR_REGISTER_1_2_0(),
)

public data class VIRTUAL_PROCESSOR_REGISTER_1_2_0(public var LastFpRip: ULong = 0uL, public var Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_2_0_0 = VIRTUAL_PROCESSOR_REGISTER_1_2_0_0())

public data class VIRTUAL_PROCESSOR_REGISTER_1_2_0_0(public var LastFpEip: UInt = 0u, public var LastFpCs: UShort = 0u)

public data class VIRTUAL_PROCESSOR_REGISTER_1_0(
    public var Base: ULong = 0uL,
    public var Limit: UInt = 0u,
    public var Selector: UShort = 0u,
    public var Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_0_0 = VIRTUAL_PROCESSOR_REGISTER_1_0_0(),
)

public data class VIRTUAL_PROCESSOR_REGISTER_1_0_0(public var Attributes: UShort = 0u, public var Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_0_0_0 = VIRTUAL_PROCESSOR_REGISTER_1_0_0_0())

public data class VIRTUAL_PROCESSOR_REGISTER_1_0_0_0(public var _bitfield: UShort = 0u)

public data class VIRTUAL_PROCESSOR_REGISTER_1_1(public var Limit: UShort = 0u, public var Base: ULong = 0uL)

public data class VIRTUAL_PROCESSOR_REGISTER_1_3(
    public var Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_3_0 = VIRTUAL_PROCESSOR_REGISTER_1_3_0(),
    public var XmmStatusControl: UInt = 0u,
    public var XmmStatusControlMask: UInt = 0u,
)

public data class VIRTUAL_PROCESSOR_REGISTER_1_3_0(public var LastFpRdp: ULong = 0uL, public var Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_3_0_0 = VIRTUAL_PROCESSOR_REGISTER_1_3_0_0())

public data class VIRTUAL_PROCESSOR_REGISTER_1_3_0_0(public var LastFpDp: UInt = 0u, public var LastFpDs: UShort = 0u)

public data class VM_GENCOUNTER(public var GenerationCount: ULong = 0uL, public var GenerationCountHigh: ULong = 0uL)

public data class WHV_ACCESS_GPA_CONTROLS(public var AsUINT64: ULong = 0uL, public var Anonymous: WHV_ACCESS_GPA_CONTROLS_0 = WHV_ACCESS_GPA_CONTROLS_0())

public data class WHV_ACCESS_GPA_CONTROLS_0(public var CacheType: WHV_CACHE_TYPE = 0, public var Reserved: UInt = 0u)

public data class WHV_ADVISE_GPA_RANGE(public var Populate: WHV_ADVISE_GPA_RANGE_POPULATE = WHV_ADVISE_GPA_RANGE_POPULATE())

public data class WHV_ADVISE_GPA_RANGE_POPULATE(public var Flags: WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS = WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS(), public var AccessType: WHV_MEMORY_ACCESS_TYPE = 0)

public data class WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS(public var AsUINT32: UInt = 0u, public var Anonymous: WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS_0 = WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS_0())

public data class WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS_0(public var _bitfield: UInt = 0u)

public class WHV_CAPABILITY(
    public var HypervisorPresent: BOOL = 0,
    public var Features: WHV_CAPABILITY_FEATURES = WHV_CAPABILITY_FEATURES(),
    public var ExtendedVmExits: WHV_EXTENDED_VM_EXITS = WHV_EXTENDED_VM_EXITS(),
    public var ProcessorVendor: WHV_PROCESSOR_VENDOR = 0,
    public var ProcessorFeatures: WHV_PROCESSOR_FEATURES = WHV_PROCESSOR_FEATURES(),
    public var SyntheticProcessorFeaturesBanks: WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS = WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS(),
    public var ProcessorXsaveFeatures: WHV_PROCESSOR_XSAVE_FEATURES = WHV_PROCESSOR_XSAVE_FEATURES(),
    public var ProcessorClFlushSize: UByte = 0u,
    public var ExceptionExitBitmap: ULong = 0uL,
    public var X64MsrExitBitmap: WHV_X64_MSR_EXIT_BITMAP = WHV_X64_MSR_EXIT_BITMAP(),
    public var ProcessorClockFrequency: ULong = 0uL,
    public var InterruptClockFrequency: ULong = 0uL,
    public var ProcessorFeaturesBanks: WHV_PROCESSOR_FEATURES_BANKS = WHV_PROCESSOR_FEATURES_BANKS(),
    public var GpaRangePopulateFlags: WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS = WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS(),
    public var ProcessorFrequencyCap: WHV_CAPABILITY_PROCESSOR_FREQUENCY_CAP = WHV_CAPABILITY_PROCESSOR_FREQUENCY_CAP(),
    public var ProcessorPerfmonFeatures: WHV_PROCESSOR_PERFMON_FEATURES = WHV_PROCESSOR_PERFMON_FEATURES(),
    public var SchedulerFeatures: WHV_SCHEDULER_FEATURES = WHV_SCHEDULER_FEATURES(),
)

public data class WHV_CAPABILITY_FEATURES(public var Anonymous: WHV_CAPABILITY_FEATURES_0 = WHV_CAPABILITY_FEATURES_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_CAPABILITY_FEATURES_0(public var _bitfield: ULong = 0uL)

public data class WHV_CAPABILITY_PROCESSOR_FREQUENCY_CAP(
    public var _bitfield: UInt = 0u,
    public var HighestFrequencyMhz: UInt = 0u,
    public var NominalFrequencyMhz: UInt = 0u,
    public var LowestFrequencyMhz: UInt = 0u,
    public var FrequencyStepMhz: UInt = 0u,
)

public data class WHV_CPUID_OUTPUT(
    public var Eax: UInt = 0u,
    public var Ebx: UInt = 0u,
    public var Ecx: UInt = 0u,
    public var Edx: UInt = 0u,
)

public data class WHV_DOORBELL_MATCH_DATA(
    public var GuestAddress: ULong = 0uL,
    public var Value: ULong = 0uL,
    public var Length: UInt = 0u,
    public var _bitfield: UInt = 0u,
)

public data class WHV_EMULATOR_CALLBACKS(
    public var Size: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var WHvEmulatorIoPortCallback: WHV_EMULATOR_IO_PORT_CALLBACK = null,
    public var WHvEmulatorMemoryCallback: WHV_EMULATOR_MEMORY_CALLBACK = null,
    public var WHvEmulatorGetVirtualProcessorRegisters: WHV_EMULATOR_GET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK = null,
    public var WHvEmulatorSetVirtualProcessorRegisters: WHV_EMULATOR_SET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK = null,
    public var WHvEmulatorTranslateGvaPage: WHV_EMULATOR_TRANSLATE_GVA_PAGE_CALLBACK = null,
)

public data class WHV_EMULATOR_IO_ACCESS_INFO(
    public var Direction: UByte = 0u,
    public var Port: UShort = 0u,
    public var AccessSize: UShort = 0u,
    public var Data: UInt = 0u,
)

public data class WHV_EMULATOR_MEMORY_ACCESS_INFO(
    public var GpaAddress: ULong = 0uL,
    public var Direction: UByte = 0u,
    public var AccessSize: UByte = 0u,
    public var Data: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_EMULATOR_MEMORY_ACCESS_INFO) return false
        if (this.GpaAddress != other.GpaAddress) return false
        if (this.Direction != other.Direction) return false
        if (this.AccessSize != other.AccessSize) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.GpaAddress.hashCode()
        result = 31 * result + this.Direction.hashCode()
        result = 31 * result + this.AccessSize.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WHV_EMULATOR_STATUS(public var Anonymous: WHV_EMULATOR_STATUS_0 = WHV_EMULATOR_STATUS_0(), public var AsUINT32: UInt = 0u)

public data class WHV_EMULATOR_STATUS_0(public var _bitfield: UInt = 0u)

public data class WHV_EXTENDED_VM_EXITS(public var Anonymous: WHV_EXTENDED_VM_EXITS_0 = WHV_EXTENDED_VM_EXITS_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_EXTENDED_VM_EXITS_0(public var _bitfield: ULong = 0uL)

public data class WHV_HYPERCALL_CONTEXT(
    public var Rax: ULong = 0uL,
    public var Rbx: ULong = 0uL,
    public var Rcx: ULong = 0uL,
    public var Rdx: ULong = 0uL,
    public var R8: ULong = 0uL,
    public var Rsi: ULong = 0uL,
    public var Rdi: ULong = 0uL,
    public var Reserved0: ULong = 0uL,
    public var XmmRegisters: List<WHV_UINT128> = List(6) { WHV_UINT128() },
    public var Reserved1: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_HYPERCALL_CONTEXT) return false
        if (this.Rax != other.Rax) return false
        if (this.Rbx != other.Rbx) return false
        if (this.Rcx != other.Rcx) return false
        if (this.Rdx != other.Rdx) return false
        if (this.R8 != other.R8) return false
        if (this.Rsi != other.Rsi) return false
        if (this.Rdi != other.Rdi) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this.XmmRegisters != other.XmmRegisters) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Rax.hashCode()
        result = 31 * result + this.Rbx.hashCode()
        result = 31 * result + this.Rcx.hashCode()
        result = 31 * result + this.Rdx.hashCode()
        result = 31 * result + this.R8.hashCode()
        result = 31 * result + this.Rsi.hashCode()
        result = 31 * result + this.Rdi.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this.XmmRegisters.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class WHV_INTERNAL_ACTIVITY_REGISTER(public var Anonymous: WHV_INTERNAL_ACTIVITY_REGISTER_0 = WHV_INTERNAL_ACTIVITY_REGISTER_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_INTERNAL_ACTIVITY_REGISTER_0(public var _bitfield: ULong = 0uL)

public data class WHV_INTERRUPT_CONTROL(
    public var _bitfield: ULong = 0uL,
    public var Destination: UInt = 0u,
    public var Vector: UInt = 0u,
)

public data class WHV_MEMORY_ACCESS_CONTEXT(
    public var InstructionByteCount: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var InstructionBytes: UByteArray = UByteArray(16),
    public var AccessInfo: WHV_MEMORY_ACCESS_INFO = WHV_MEMORY_ACCESS_INFO(),
    public var Gpa: ULong = 0uL,
    public var Gva: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_MEMORY_ACCESS_CONTEXT) return false
        if (this.InstructionByteCount != other.InstructionByteCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.InstructionBytes.contentEquals(other.InstructionBytes)) return false
        if (this.AccessInfo != other.AccessInfo) return false
        if (this.Gpa != other.Gpa) return false
        if (this.Gva != other.Gva) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InstructionByteCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.InstructionBytes.contentHashCode()
        result = 31 * result + this.AccessInfo.hashCode()
        result = 31 * result + this.Gpa.hashCode()
        result = 31 * result + this.Gva.hashCode()
        return result
    }
}

public data class WHV_MEMORY_ACCESS_INFO(public var Anonymous: WHV_MEMORY_ACCESS_INFO_0 = WHV_MEMORY_ACCESS_INFO_0(), public var AsUINT32: UInt = 0u)

public data class WHV_MEMORY_ACCESS_INFO_0(public var _bitfield: UInt = 0u)

public data class WHV_MEMORY_RANGE_ENTRY(public var GuestAddress: ULong = 0uL, public var SizeInBytes: ULong = 0uL)

public data class WHV_MSR_ACTION_ENTRY(
    public var Index: UInt = 0u,
    public var ReadAction: UByte = 0u,
    public var WriteAction: UByte = 0u,
    public var Reserved: UShort = 0u,
)

public data class WHV_NOTIFICATION_PORT_PARAMETERS(
    public var NotificationPortType: WHV_NOTIFICATION_PORT_TYPE = 0,
    public var Reserved: UInt = 0u,
    public var Anonymous: WHV_NOTIFICATION_PORT_PARAMETERS_0 = WHV_NOTIFICATION_PORT_PARAMETERS_0(),
)

public data class WHV_NOTIFICATION_PORT_PARAMETERS_0(public var Doorbell: WHV_DOORBELL_MATCH_DATA = WHV_DOORBELL_MATCH_DATA(), public var Event: WHV_NOTIFICATION_PORT_PARAMETERS_0_0 = WHV_NOTIFICATION_PORT_PARAMETERS_0_0())

public data class WHV_NOTIFICATION_PORT_PARAMETERS_0_0(public var ConnectionId: UInt = 0u)

public data class WHV_PARTITION_MEMORY_COUNTERS(
    public var Mapped4KPageCount: ULong = 0uL,
    public var Mapped2MPageCount: ULong = 0uL,
    public var Mapped1GPageCount: ULong = 0uL,
)

public class WHV_PARTITION_PROPERTY(
    public var ExtendedVmExits: WHV_EXTENDED_VM_EXITS = WHV_EXTENDED_VM_EXITS(),
    public var ProcessorFeatures: WHV_PROCESSOR_FEATURES = WHV_PROCESSOR_FEATURES(),
    public var SyntheticProcessorFeaturesBanks: WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS = WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS(),
    public var ProcessorXsaveFeatures: WHV_PROCESSOR_XSAVE_FEATURES = WHV_PROCESSOR_XSAVE_FEATURES(),
    public var ProcessorClFlushSize: UByte = 0u,
    public var ProcessorCount: UInt = 0u,
    public var CpuidExitList: UIntArray = UIntArray(1),
    public var CpuidResultList: List<WHV_X64_CPUID_RESULT> = List(1) { WHV_X64_CPUID_RESULT() },
    public var CpuidResultList2: List<WHV_X64_CPUID_RESULT2> = List(1) { WHV_X64_CPUID_RESULT2() },
    public var MsrActionList: List<WHV_MSR_ACTION_ENTRY> = List(1) { WHV_MSR_ACTION_ENTRY() },
    public var UnimplementedMsrAction: WHV_MSR_ACTION = 0,
    public var ExceptionExitBitmap: ULong = 0uL,
    public var LocalApicEmulationMode: WHV_X64_LOCAL_APIC_EMULATION_MODE = 0,
    public var SeparateSecurityDomain: BOOL = 0,
    public var NestedVirtualization: BOOL = 0,
    public var X64MsrExitBitmap: WHV_X64_MSR_EXIT_BITMAP = WHV_X64_MSR_EXIT_BITMAP(),
    public var ProcessorClockFrequency: ULong = 0uL,
    public var InterruptClockFrequency: ULong = 0uL,
    public var ApicRemoteRead: BOOL = 0,
    public var ProcessorFeaturesBanks: WHV_PROCESSOR_FEATURES_BANKS = WHV_PROCESSOR_FEATURES_BANKS(),
    public var ReferenceTime: ULong = 0uL,
    public var PrimaryNumaNode: UShort = 0u,
    public var CpuReserve: UInt = 0u,
    public var CpuCap: UInt = 0u,
    public var CpuWeight: UInt = 0u,
    public var CpuGroupId: ULong = 0uL,
    public var ProcessorFrequencyCap: UInt = 0u,
    public var AllowDeviceAssignment: BOOL = 0,
    public var ProcessorPerfmonFeatures: WHV_PROCESSOR_PERFMON_FEATURES = WHV_PROCESSOR_PERFMON_FEATURES(),
    public var DisableSmt: BOOL = 0,
)

public data class WHV_PROCESSOR_APIC_COUNTERS(
    public var MmioAccessCount: ULong = 0uL,
    public var EoiAccessCount: ULong = 0uL,
    public var TprAccessCount: ULong = 0uL,
    public var SentIpiCount: ULong = 0uL,
    public var SelfIpiCount: ULong = 0uL,
)

public data class WHV_PROCESSOR_EVENT_COUNTERS(
    public var PageFaultCount: ULong = 0uL,
    public var ExceptionCount: ULong = 0uL,
    public var InterruptCount: ULong = 0uL,
)

public data class WHV_PROCESSOR_FEATURES(public var Anonymous: WHV_PROCESSOR_FEATURES_0 = WHV_PROCESSOR_FEATURES_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_PROCESSOR_FEATURES_0(public var _bitfield: ULong = 0uL)

public data class WHV_PROCESSOR_FEATURES1(public var Anonymous: WHV_PROCESSOR_FEATURES1_0 = WHV_PROCESSOR_FEATURES1_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_PROCESSOR_FEATURES1_0(public var _bitfield: ULong = 0uL)

public data class WHV_PROCESSOR_FEATURES_BANKS(
    public var BanksCount: UInt = 0u,
    public var Reserved0: UInt = 0u,
    public var Anonymous: WHV_PROCESSOR_FEATURES_BANKS_0 = WHV_PROCESSOR_FEATURES_BANKS_0(),
)

public data class WHV_PROCESSOR_FEATURES_BANKS_0(public var Anonymous: WHV_PROCESSOR_FEATURES_BANKS_0_0 = WHV_PROCESSOR_FEATURES_BANKS_0_0(), public var AsUINT64: ULongArray = ULongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_PROCESSOR_FEATURES_BANKS_0) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.AsUINT64.contentEquals(other.AsUINT64)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.AsUINT64.contentHashCode()
        return result
    }
}

public data class WHV_PROCESSOR_FEATURES_BANKS_0_0(public var Bank0: WHV_PROCESSOR_FEATURES = WHV_PROCESSOR_FEATURES(), public var Bank1: WHV_PROCESSOR_FEATURES1 = WHV_PROCESSOR_FEATURES1())

public data class WHV_PROCESSOR_INTERCEPT_COUNTER(public var Count: ULong = 0uL, public var Time100ns: ULong = 0uL)

public data class WHV_PROCESSOR_INTERCEPT_COUNTERS(
    public var PageInvalidations: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var ControlRegisterAccesses: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var IoInstructions: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var HaltInstructions: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var CpuidInstructions: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var MsrAccesses: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var OtherIntercepts: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var PendingInterrupts: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var EmulatedInstructions: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var DebugRegisterAccesses: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var PageFaultIntercepts: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var NestedPageFaultIntercepts: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var Hypercalls: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
    public var RdpmcInstructions: WHV_PROCESSOR_INTERCEPT_COUNTER = WHV_PROCESSOR_INTERCEPT_COUNTER(),
)

public data class WHV_PROCESSOR_PERFMON_FEATURES(public var Anonymous: WHV_PROCESSOR_PERFMON_FEATURES_0 = WHV_PROCESSOR_PERFMON_FEATURES_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_PROCESSOR_PERFMON_FEATURES_0(public var _bitfield: ULong = 0uL)

public data class WHV_PROCESSOR_RUNTIME_COUNTERS(public var TotalRuntime100ns: ULong = 0uL, public var HypervisorRuntime100ns: ULong = 0uL)

public data class WHV_PROCESSOR_SYNTHETIC_FEATURES_COUNTERS(
    public var SyntheticInterruptsCount: ULong = 0uL,
    public var LongSpinWaitHypercallsCount: ULong = 0uL,
    public var OtherHypercallsCount: ULong = 0uL,
    public var SyntheticInterruptHypercallsCount: ULong = 0uL,
    public var VirtualInterruptHypercallsCount: ULong = 0uL,
    public var VirtualMmuHypercallsCount: ULong = 0uL,
)

public data class WHV_PROCESSOR_XSAVE_FEATURES(public var Anonymous: WHV_PROCESSOR_XSAVE_FEATURES_0 = WHV_PROCESSOR_XSAVE_FEATURES_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_PROCESSOR_XSAVE_FEATURES_0(public var _bitfield: ULong = 0uL)

public class WHV_REGISTER_VALUE(
    public var Reg128: WHV_UINT128 = WHV_UINT128(),
    public var Reg64: ULong = 0uL,
    public var Reg32: UInt = 0u,
    public var Reg16: UShort = 0u,
    public var Reg8: UByte = 0u,
    public var Fp: WHV_X64_FP_REGISTER = WHV_X64_FP_REGISTER(),
    public var FpControlStatus: WHV_X64_FP_CONTROL_STATUS_REGISTER = WHV_X64_FP_CONTROL_STATUS_REGISTER(),
    public var XmmControlStatus: WHV_X64_XMM_CONTROL_STATUS_REGISTER = WHV_X64_XMM_CONTROL_STATUS_REGISTER(),
    public var Segment: WHV_X64_SEGMENT_REGISTER = WHV_X64_SEGMENT_REGISTER(),
    public var Table: WHV_X64_TABLE_REGISTER = WHV_X64_TABLE_REGISTER(),
    public var InterruptState: WHV_X64_INTERRUPT_STATE_REGISTER = WHV_X64_INTERRUPT_STATE_REGISTER(),
    public var PendingInterruption: WHV_X64_PENDING_INTERRUPTION_REGISTER = WHV_X64_PENDING_INTERRUPTION_REGISTER(),
    public var DeliverabilityNotifications: WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER = WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER(),
    public var ExceptionEvent: WHV_X64_PENDING_EXCEPTION_EVENT = WHV_X64_PENDING_EXCEPTION_EVENT(),
    public var ExtIntEvent: WHV_X64_PENDING_EXT_INT_EVENT = WHV_X64_PENDING_EXT_INT_EVENT(),
    public var InternalActivity: WHV_INTERNAL_ACTIVITY_REGISTER = WHV_INTERNAL_ACTIVITY_REGISTER(),
    public var PendingDebugException: WHV_X64_PENDING_DEBUG_EXCEPTION = WHV_X64_PENDING_DEBUG_EXCEPTION(),
)

public data class WHV_RUN_VP_CANCELED_CONTEXT(public var CancelReason: WHV_RUN_VP_CANCEL_REASON = 0)

public data class WHV_RUN_VP_EXIT_CONTEXT(
    public var ExitReason: WHV_RUN_VP_EXIT_REASON = 0,
    public var Reserved: UInt = 0u,
    public var VpContext: WHV_VP_EXIT_CONTEXT = WHV_VP_EXIT_CONTEXT(),
    public var Anonymous: WHV_RUN_VP_EXIT_CONTEXT_0 = WHV_RUN_VP_EXIT_CONTEXT_0(),
)

public data class WHV_RUN_VP_EXIT_CONTEXT_0(
    public var MemoryAccess: WHV_MEMORY_ACCESS_CONTEXT = WHV_MEMORY_ACCESS_CONTEXT(),
    public var IoPortAccess: WHV_X64_IO_PORT_ACCESS_CONTEXT = WHV_X64_IO_PORT_ACCESS_CONTEXT(),
    public var MsrAccess: WHV_X64_MSR_ACCESS_CONTEXT = WHV_X64_MSR_ACCESS_CONTEXT(),
    public var CpuidAccess: WHV_X64_CPUID_ACCESS_CONTEXT = WHV_X64_CPUID_ACCESS_CONTEXT(),
    public var VpException: WHV_VP_EXCEPTION_CONTEXT = WHV_VP_EXCEPTION_CONTEXT(),
    public var InterruptWindow: WHV_X64_INTERRUPTION_DELIVERABLE_CONTEXT = WHV_X64_INTERRUPTION_DELIVERABLE_CONTEXT(),
    public var UnsupportedFeature: WHV_X64_UNSUPPORTED_FEATURE_CONTEXT = WHV_X64_UNSUPPORTED_FEATURE_CONTEXT(),
    public var CancelReason: WHV_RUN_VP_CANCELED_CONTEXT = WHV_RUN_VP_CANCELED_CONTEXT(),
    public var ApicEoi: WHV_X64_APIC_EOI_CONTEXT = WHV_X64_APIC_EOI_CONTEXT(),
    public var ReadTsc: WHV_X64_RDTSC_CONTEXT = WHV_X64_RDTSC_CONTEXT(),
    public var ApicSmi: WHV_X64_APIC_SMI_CONTEXT = WHV_X64_APIC_SMI_CONTEXT(),
    public var Hypercall: WHV_HYPERCALL_CONTEXT = WHV_HYPERCALL_CONTEXT(),
    public var ApicInitSipi: WHV_X64_APIC_INIT_SIPI_CONTEXT = WHV_X64_APIC_INIT_SIPI_CONTEXT(),
    public var ApicWrite: WHV_X64_APIC_WRITE_CONTEXT = WHV_X64_APIC_WRITE_CONTEXT(),
    public var SynicSintDeliverable: WHV_SYNIC_SINT_DELIVERABLE_CONTEXT = WHV_SYNIC_SINT_DELIVERABLE_CONTEXT(),
)

public data class WHV_SCHEDULER_FEATURES(public var Anonymous: WHV_SCHEDULER_FEATURES_0 = WHV_SCHEDULER_FEATURES_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_SCHEDULER_FEATURES_0(public var _bitfield: ULong = 0uL)

public data class WHV_SRIOV_RESOURCE_DESCRIPTOR(
    public var PnpInstanceId: UShortArray = UShortArray(200),
    public var VirtualFunctionId: Foundation.LUID = Foundation.LUID(),
    public var VirtualFunctionIndex: UShort = 0u,
    public var Reserved: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_SRIOV_RESOURCE_DESCRIPTOR) return false
        if (!this.PnpInstanceId.contentEquals(other.PnpInstanceId)) return false
        if (this.VirtualFunctionId != other.VirtualFunctionId) return false
        if (this.VirtualFunctionIndex != other.VirtualFunctionIndex) return false
        if (this.Reserved != other.Reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PnpInstanceId.contentHashCode()
        result = 31 * result + this.VirtualFunctionId.hashCode()
        result = 31 * result + this.VirtualFunctionIndex.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        return result
    }
}

public data class WHV_SYNIC_EVENT_PARAMETERS(
    public var VpIndex: UInt = 0u,
    public var TargetSint: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var FlagNumber: UShort = 0u,
)

public data class WHV_SYNIC_SINT_DELIVERABLE_CONTEXT(
    public var DeliverableSints: UShort = 0u,
    public var Reserved1: UShort = 0u,
    public var Reserved2: UInt = 0u,
)

public data class WHV_SYNTHETIC_PROCESSOR_FEATURES(public var Anonymous: WHV_SYNTHETIC_PROCESSOR_FEATURES_0 = WHV_SYNTHETIC_PROCESSOR_FEATURES_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_SYNTHETIC_PROCESSOR_FEATURES_0(public var _bitfield: ULong = 0uL)

public data class WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS(
    public var BanksCount: UInt = 0u,
    public var Reserved0: UInt = 0u,
    public var Anonymous: WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0 = WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0(),
)

public data class WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0(public var Anonymous: WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0 = WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0(), public var AsUINT64: ULongArray = ULongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.AsUINT64.contentEquals(other.AsUINT64)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.AsUINT64.contentHashCode()
        return result
    }
}

public data class WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0(public var Bank0: WHV_SYNTHETIC_PROCESSOR_FEATURES = WHV_SYNTHETIC_PROCESSOR_FEATURES())

public data class WHV_TRANSLATE_GVA_RESULT(public var ResultCode: WHV_TRANSLATE_GVA_RESULT_CODE = 0, public var Reserved: UInt = 0u)

public data class WHV_TRIGGER_PARAMETERS(
    public var TriggerType: WHV_TRIGGER_TYPE = 0,
    public var Reserved: UInt = 0u,
    public var Anonymous: WHV_TRIGGER_PARAMETERS_0 = WHV_TRIGGER_PARAMETERS_0(),
)

public data class WHV_TRIGGER_PARAMETERS_0(
    public var Interrupt: WHV_INTERRUPT_CONTROL = WHV_INTERRUPT_CONTROL(),
    public var SynicEvent: WHV_SYNIC_EVENT_PARAMETERS = WHV_SYNIC_EVENT_PARAMETERS(),
    public var DeviceInterrupt: WHV_TRIGGER_PARAMETERS_0_0 = WHV_TRIGGER_PARAMETERS_0_0(),
)

public data class WHV_TRIGGER_PARAMETERS_0_0(
    public var LogicalDeviceId: ULong = 0uL,
    public var MsiAddress: ULong = 0uL,
    public var MsiData: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class WHV_UINT128(public var Anonymous: WHV_UINT128_0 = WHV_UINT128_0(), public var Dword: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_UINT128) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.Dword.contentEquals(other.Dword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.Dword.contentHashCode()
        return result
    }
}

public data class WHV_UINT128_0(public var Low64: ULong = 0uL, public var High64: ULong = 0uL)

public data class WHV_VIRTUAL_PROCESSOR_PROPERTY(
    public var PropertyCode: WHV_VIRTUAL_PROCESSOR_PROPERTY_CODE = 0,
    public var Reserved: UInt = 0u,
    public var Anonymous: WHV_VIRTUAL_PROCESSOR_PROPERTY_0 = WHV_VIRTUAL_PROCESSOR_PROPERTY_0(),
)

public data class WHV_VIRTUAL_PROCESSOR_PROPERTY_0(public var NumaNode: UShort = 0u, public var Padding: ULong = 0uL)

public data class WHV_VPCI_DEVICE_NOTIFICATION(
    public var NotificationType: WHV_VPCI_DEVICE_NOTIFICATION_TYPE = 0,
    public var Reserved1: UInt = 0u,
    public var Anonymous: WHV_VPCI_DEVICE_NOTIFICATION_0 = WHV_VPCI_DEVICE_NOTIFICATION_0(),
)

public data class WHV_VPCI_DEVICE_NOTIFICATION_0(public var Reserved2: ULong = 0uL)

public data class WHV_VPCI_DEVICE_REGISTER(
    public var Location: WHV_VPCI_DEVICE_REGISTER_SPACE = 0,
    public var SizeInBytes: UInt = 0u,
    public var OffsetInBytes: ULong = 0uL,
)

public data class WHV_VPCI_HARDWARE_IDS(
    public var VendorID: UShort = 0u,
    public var DeviceID: UShort = 0u,
    public var RevisionID: UByte = 0u,
    public var ProgIf: UByte = 0u,
    public var SubClass: UByte = 0u,
    public var BaseClass: UByte = 0u,
    public var SubVendorID: UShort = 0u,
    public var SubSystemID: UShort = 0u,
)

public data class WHV_VPCI_INTERRUPT_TARGET(
    public var Vector: UInt = 0u,
    public var Flags: WHV_VPCI_INTERRUPT_TARGET_FLAGS = 0,
    public var ProcessorCount: UInt = 0u,
    public var Processors: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_VPCI_INTERRUPT_TARGET) return false
        if (this.Vector != other.Vector) return false
        if (this.Flags != other.Flags) return false
        if (this.ProcessorCount != other.ProcessorCount) return false
        if (!this.Processors.contentEquals(other.Processors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Vector.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.ProcessorCount.hashCode()
        result = 31 * result + this.Processors.contentHashCode()
        return result
    }
}

public data class WHV_VPCI_MMIO_MAPPING(
    public var Location: WHV_VPCI_DEVICE_REGISTER_SPACE = 0,
    public var Flags: WHV_VPCI_MMIO_RANGE_FLAGS = 0,
    public var SizeInBytes: ULong = 0uL,
    public var OffsetInBytes: ULong = 0uL,
    public var VirtualAddress: Long = 0L,
)

public data class WHV_VPCI_PROBED_BARS(public var Value: UIntArray = UIntArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_VPCI_PROBED_BARS) return false
        if (!this.Value.contentEquals(other.Value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Value.contentHashCode()
    }
}

public data class WHV_VP_EXCEPTION_CONTEXT(
    public var InstructionByteCount: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var InstructionBytes: UByteArray = UByteArray(16),
    public var ExceptionInfo: WHV_VP_EXCEPTION_INFO = WHV_VP_EXCEPTION_INFO(),
    public var ExceptionType: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(3),
    public var ErrorCode: UInt = 0u,
    public var ExceptionParameter: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_VP_EXCEPTION_CONTEXT) return false
        if (this.InstructionByteCount != other.InstructionByteCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.InstructionBytes.contentEquals(other.InstructionBytes)) return false
        if (this.ExceptionInfo != other.ExceptionInfo) return false
        if (this.ExceptionType != other.ExceptionType) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.ErrorCode != other.ErrorCode) return false
        if (this.ExceptionParameter != other.ExceptionParameter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InstructionByteCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.InstructionBytes.contentHashCode()
        result = 31 * result + this.ExceptionInfo.hashCode()
        result = 31 * result + this.ExceptionType.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.ErrorCode.hashCode()
        result = 31 * result + this.ExceptionParameter.hashCode()
        return result
    }
}

public data class WHV_VP_EXCEPTION_INFO(public var Anonymous: WHV_VP_EXCEPTION_INFO_0 = WHV_VP_EXCEPTION_INFO_0(), public var AsUINT32: UInt = 0u)

public data class WHV_VP_EXCEPTION_INFO_0(public var _bitfield: UInt = 0u)

public data class WHV_VP_EXIT_CONTEXT(
    public var ExecutionState: WHV_X64_VP_EXECUTION_STATE = WHV_X64_VP_EXECUTION_STATE(),
    public var _bitfield: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var Reserved2: UInt = 0u,
    public var Cs: WHV_X64_SEGMENT_REGISTER = WHV_X64_SEGMENT_REGISTER(),
    public var Rip: ULong = 0uL,
    public var Rflags: ULong = 0uL,
)

public data class WHV_X64_APIC_EOI_CONTEXT(public var InterruptVector: UInt = 0u)

public data class WHV_X64_APIC_INIT_SIPI_CONTEXT(public var ApicIcr: ULong = 0uL)

public data class WHV_X64_APIC_SMI_CONTEXT(public var ApicIcr: ULong = 0uL)

public data class WHV_X64_APIC_WRITE_CONTEXT(
    public var Type: WHV_X64_APIC_WRITE_TYPE = 0,
    public var Reserved: UInt = 0u,
    public var WriteValue: ULong = 0uL,
)

public data class WHV_X64_CPUID_ACCESS_CONTEXT(
    public var Rax: ULong = 0uL,
    public var Rcx: ULong = 0uL,
    public var Rdx: ULong = 0uL,
    public var Rbx: ULong = 0uL,
    public var DefaultResultRax: ULong = 0uL,
    public var DefaultResultRcx: ULong = 0uL,
    public var DefaultResultRdx: ULong = 0uL,
    public var DefaultResultRbx: ULong = 0uL,
)

public data class WHV_X64_CPUID_RESULT(
    public var Function: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(3),
    public var Eax: UInt = 0u,
    public var Ebx: UInt = 0u,
    public var Ecx: UInt = 0u,
    public var Edx: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_X64_CPUID_RESULT) return false
        if (this.Function != other.Function) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Eax != other.Eax) return false
        if (this.Ebx != other.Ebx) return false
        if (this.Ecx != other.Ecx) return false
        if (this.Edx != other.Edx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Function.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Eax.hashCode()
        result = 31 * result + this.Ebx.hashCode()
        result = 31 * result + this.Ecx.hashCode()
        result = 31 * result + this.Edx.hashCode()
        return result
    }
}

public data class WHV_X64_CPUID_RESULT2(
    public var Function: UInt = 0u,
    public var Index: UInt = 0u,
    public var VpIndex: UInt = 0u,
    public var Flags: WHV_X64_CPUID_RESULT2_FLAGS = 0,
    public var Output: WHV_CPUID_OUTPUT = WHV_CPUID_OUTPUT(),
    public var Mask: WHV_CPUID_OUTPUT = WHV_CPUID_OUTPUT(),
)

public data class WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER(public var Anonymous: WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER_0 = WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER_0(public var _bitfield: ULong = 0uL)

public data class WHV_X64_FP_CONTROL_STATUS_REGISTER(public var Anonymous: WHV_X64_FP_CONTROL_STATUS_REGISTER_0 = WHV_X64_FP_CONTROL_STATUS_REGISTER_0(), public var AsUINT128: WHV_UINT128 = WHV_UINT128())

public data class WHV_X64_FP_CONTROL_STATUS_REGISTER_0(
    public var FpControl: UShort = 0u,
    public var FpStatus: UShort = 0u,
    public var FpTag: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var LastFpOp: UShort = 0u,
    public var Anonymous: WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0 = WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0(),
)

public data class WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0(public var LastFpRip: ULong = 0uL, public var Anonymous: WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0_0 = WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0_0())

public data class WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0_0(
    public var LastFpEip: UInt = 0u,
    public var LastFpCs: UShort = 0u,
    public var Reserved2: UShort = 0u,
)

public data class WHV_X64_FP_REGISTER(public var Anonymous: WHV_X64_FP_REGISTER_0 = WHV_X64_FP_REGISTER_0(), public var AsUINT128: WHV_UINT128 = WHV_UINT128())

public data class WHV_X64_FP_REGISTER_0(public var Mantissa: ULong = 0uL, public var _bitfield: ULong = 0uL)

public data class WHV_X64_INTERRUPTION_DELIVERABLE_CONTEXT(public var DeliverableType: WHV_X64_PENDING_INTERRUPTION_TYPE = 0)

public data class WHV_X64_INTERRUPT_STATE_REGISTER(public var Anonymous: WHV_X64_INTERRUPT_STATE_REGISTER_0 = WHV_X64_INTERRUPT_STATE_REGISTER_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_X64_INTERRUPT_STATE_REGISTER_0(public var _bitfield: ULong = 0uL)

public data class WHV_X64_IO_PORT_ACCESS_CONTEXT(
    public var InstructionByteCount: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var InstructionBytes: UByteArray = UByteArray(16),
    public var AccessInfo: WHV_X64_IO_PORT_ACCESS_INFO = WHV_X64_IO_PORT_ACCESS_INFO(),
    public var PortNumber: UShort = 0u,
    public var Reserved2: UShortArray = UShortArray(3),
    public var Rax: ULong = 0uL,
    public var Rcx: ULong = 0uL,
    public var Rsi: ULong = 0uL,
    public var Rdi: ULong = 0uL,
    public var Ds: WHV_X64_SEGMENT_REGISTER = WHV_X64_SEGMENT_REGISTER(),
    public var Es: WHV_X64_SEGMENT_REGISTER = WHV_X64_SEGMENT_REGISTER(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_X64_IO_PORT_ACCESS_CONTEXT) return false
        if (this.InstructionByteCount != other.InstructionByteCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.InstructionBytes.contentEquals(other.InstructionBytes)) return false
        if (this.AccessInfo != other.AccessInfo) return false
        if (this.PortNumber != other.PortNumber) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.Rax != other.Rax) return false
        if (this.Rcx != other.Rcx) return false
        if (this.Rsi != other.Rsi) return false
        if (this.Rdi != other.Rdi) return false
        if (this.Ds != other.Ds) return false
        if (this.Es != other.Es) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InstructionByteCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.InstructionBytes.contentHashCode()
        result = 31 * result + this.AccessInfo.hashCode()
        result = 31 * result + this.PortNumber.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.Rax.hashCode()
        result = 31 * result + this.Rcx.hashCode()
        result = 31 * result + this.Rsi.hashCode()
        result = 31 * result + this.Rdi.hashCode()
        result = 31 * result + this.Ds.hashCode()
        result = 31 * result + this.Es.hashCode()
        return result
    }
}

public data class WHV_X64_IO_PORT_ACCESS_INFO(public var Anonymous: WHV_X64_IO_PORT_ACCESS_INFO_0 = WHV_X64_IO_PORT_ACCESS_INFO_0(), public var AsUINT32: UInt = 0u)

public data class WHV_X64_IO_PORT_ACCESS_INFO_0(public var _bitfield: UInt = 0u)

public data class WHV_X64_MSR_ACCESS_CONTEXT(
    public var AccessInfo: WHV_X64_MSR_ACCESS_INFO = WHV_X64_MSR_ACCESS_INFO(),
    public var MsrNumber: UInt = 0u,
    public var Rax: ULong = 0uL,
    public var Rdx: ULong = 0uL,
)

public data class WHV_X64_MSR_ACCESS_INFO(public var Anonymous: WHV_X64_MSR_ACCESS_INFO_0 = WHV_X64_MSR_ACCESS_INFO_0(), public var AsUINT32: UInt = 0u)

public data class WHV_X64_MSR_ACCESS_INFO_0(public var _bitfield: UInt = 0u)

public data class WHV_X64_MSR_EXIT_BITMAP(public var AsUINT64: ULong = 0uL, public var Anonymous: WHV_X64_MSR_EXIT_BITMAP_0 = WHV_X64_MSR_EXIT_BITMAP_0())

public data class WHV_X64_MSR_EXIT_BITMAP_0(public var _bitfield: ULong = 0uL)

public data class WHV_X64_PENDING_DEBUG_EXCEPTION(public var AsUINT64: ULong = 0uL, public var Anonymous: WHV_X64_PENDING_DEBUG_EXCEPTION_0 = WHV_X64_PENDING_DEBUG_EXCEPTION_0())

public data class WHV_X64_PENDING_DEBUG_EXCEPTION_0(public var _bitfield: ULong = 0uL)

public data class WHV_X64_PENDING_EXCEPTION_EVENT(public var Anonymous: WHV_X64_PENDING_EXCEPTION_EVENT_0 = WHV_X64_PENDING_EXCEPTION_EVENT_0(), public var AsUINT128: WHV_UINT128 = WHV_UINT128())

public data class WHV_X64_PENDING_EXCEPTION_EVENT_0(
    public var _bitfield: UInt = 0u,
    public var ErrorCode: UInt = 0u,
    public var ExceptionParameter: ULong = 0uL,
)

public data class WHV_X64_PENDING_EXT_INT_EVENT(public var Anonymous: WHV_X64_PENDING_EXT_INT_EVENT_0 = WHV_X64_PENDING_EXT_INT_EVENT_0(), public var AsUINT128: WHV_UINT128 = WHV_UINT128())

public data class WHV_X64_PENDING_EXT_INT_EVENT_0(public var _bitfield: ULong = 0uL, public var Reserved2: ULong = 0uL)

public data class WHV_X64_PENDING_INTERRUPTION_REGISTER(public var Anonymous: WHV_X64_PENDING_INTERRUPTION_REGISTER_0 = WHV_X64_PENDING_INTERRUPTION_REGISTER_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_X64_PENDING_INTERRUPTION_REGISTER_0(public var _bitfield: UInt = 0u, public var ErrorCode: UInt = 0u)

public data class WHV_X64_RDTSC_CONTEXT(
    public var TscAux: ULong = 0uL,
    public var VirtualOffset: ULong = 0uL,
    public var Tsc: ULong = 0uL,
    public var ReferenceTime: ULong = 0uL,
    public var RdtscInfo: WHV_X64_RDTSC_INFO = WHV_X64_RDTSC_INFO(),
)

public data class WHV_X64_RDTSC_INFO(public var Anonymous: WHV_X64_RDTSC_INFO_0 = WHV_X64_RDTSC_INFO_0(), public var AsUINT64: ULong = 0uL)

public data class WHV_X64_RDTSC_INFO_0(public var _bitfield: ULong = 0uL)

public data class WHV_X64_SEGMENT_REGISTER(
    public var Base: ULong = 0uL,
    public var Limit: UInt = 0u,
    public var Selector: UShort = 0u,
    public var Anonymous: WHV_X64_SEGMENT_REGISTER_0 = WHV_X64_SEGMENT_REGISTER_0(),
)

public data class WHV_X64_SEGMENT_REGISTER_0(public var Anonymous: WHV_X64_SEGMENT_REGISTER_0_0 = WHV_X64_SEGMENT_REGISTER_0_0(), public var Attributes: UShort = 0u)

public data class WHV_X64_SEGMENT_REGISTER_0_0(public var _bitfield: UShort = 0u)

public data class WHV_X64_TABLE_REGISTER(
    public var Pad: UShortArray = UShortArray(3),
    public var Limit: UShort = 0u,
    public var Base: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHV_X64_TABLE_REGISTER) return false
        if (!this.Pad.contentEquals(other.Pad)) return false
        if (this.Limit != other.Limit) return false
        if (this.Base != other.Base) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Pad.contentHashCode()
        result = 31 * result + this.Limit.hashCode()
        result = 31 * result + this.Base.hashCode()
        return result
    }
}

public data class WHV_X64_UNSUPPORTED_FEATURE_CONTEXT(
    public var FeatureCode: WHV_X64_UNSUPPORTED_FEATURE_CODE = 0,
    public var Reserved: UInt = 0u,
    public var FeatureParameter: ULong = 0uL,
)

public data class WHV_X64_VP_EXECUTION_STATE(public var Anonymous: WHV_X64_VP_EXECUTION_STATE_0 = WHV_X64_VP_EXECUTION_STATE_0(), public var AsUINT16: UShort = 0u)

public data class WHV_X64_VP_EXECUTION_STATE_0(public var _bitfield: UShort = 0u)

public data class WHV_X64_XMM_CONTROL_STATUS_REGISTER(public var Anonymous: WHV_X64_XMM_CONTROL_STATUS_REGISTER_0 = WHV_X64_XMM_CONTROL_STATUS_REGISTER_0(), public var AsUINT128: WHV_UINT128 = WHV_UINT128())

public data class WHV_X64_XMM_CONTROL_STATUS_REGISTER_0(
    public var Anonymous: WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0 = WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0(),
    public var XmmStatusControl: UInt = 0u,
    public var XmmStatusControlMask: UInt = 0u,
)

public data class WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0(public var LastFpRdp: ULong = 0uL, public var Anonymous: WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0_0 = WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0_0())

public data class WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0_0(
    public var LastFpDp: UInt = 0u,
    public var LastFpDs: UShort = 0u,
    public var Reserved: UShort = 0u,
)
