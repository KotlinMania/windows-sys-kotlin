@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.M128A
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SINGLE_LIST_ENTRY

public data class WHEA_RECOVERY_CONTEXT_0(public var MemoryError: WHEA_RECOVERY_CONTEXT_0_0 = WHEA_RECOVERY_CONTEXT_0_0(), public var PmemError: WHEA_RECOVERY_CONTEXT_0_1 = WHEA_RECOVERY_CONTEXT_0_1())

public data class WHEA_RECOVERY_CONTEXT_0_0(
    public var Address: ULong = 0uL,
    public var Consumed: Boolean = false,
    public var ErrorCode: UShort = 0u,
    public var ErrorIpValid: Boolean = false,
    public var RestartIpValid: Boolean = false,
    public var ClearPoison: Boolean = false,
)

public data class WHEA_RECOVERY_CONTEXT_0_1(public var PmemErrInfo: ULong = 0uL)

public data class WHEA_REGISTER_KEY_NOTIFICATION_FAILED_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY())

public data class WHEA_REPORT_HW_ERROR_DEVICE_DRIVER_FLAGS(public var Anonymous: WHEA_REPORT_HW_ERROR_DEVICE_DRIVER_FLAGS_0 = WHEA_REPORT_HW_ERROR_DEVICE_DRIVER_FLAGS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_REPORT_HW_ERROR_DEVICE_DRIVER_FLAGS_0(public var _bitfield: UInt = 0u)

public data class WHEA_REVISION(public var Anonymous: WHEA_REVISION_0 = WHEA_REVISION_0(), public var AsUSHORT: UShort = 0u)

public data class WHEA_REVISION_0(public var MinorRevision: UByte = 0u, public var MajorRevision: UByte = 0u)

public data class WHEA_SEA_SECTION(
    public var Esr: UInt = 0u,
    public var Far: ULong = 0uL,
    public var Par: ULong = 0uL,
    public var WasKernel: Boolean = false,
)

public data class WHEA_SEI_SECTION(public var Esr: UInt = 0u, public var Far: ULong = 0uL)

public data class WHEA_SEL_BUGCHECK_PROGRESS(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var BugCheckCode: UInt = 0u,
    public var BugCheckProgressSummary: UInt = 0u,
)

public data class WHEA_SEL_BUGCHECK_RECOVERY_STATUS_MULTIPLE_BUGCHECK_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var IsBugcheckOwner: Boolean = false,
    public var RecursionCount: UByte = 0u,
    public var IsBugcheckRecoveryOwner: Boolean = false,
)

public data class WHEA_SEL_BUGCHECK_RECOVERY_STATUS_PHASE1_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Success: Boolean = false,
    public var Version: UByte = 0u,
    public var EntryCount: UShort = 0u,
    public var Data: WHEA_SEL_BUGCHECK_RECOVERY_STATUS_PHASE1_EVENT_0 = WHEA_SEL_BUGCHECK_RECOVERY_STATUS_PHASE1_EVENT_0(),
)

public data class WHEA_SEL_BUGCHECK_RECOVERY_STATUS_PHASE1_EVENT_0(public var DumpPolicy: UByte = 0u, public var Reserved: UByteArray = UByteArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_SEL_BUGCHECK_RECOVERY_STATUS_PHASE1_EVENT_0) return false
        if (this.DumpPolicy != other.DumpPolicy) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DumpPolicy.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class WHEA_SEL_BUGCHECK_RECOVERY_STATUS_PHASE2_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var BootId: UInt = 0u,
    public var Success: Boolean = false,
)

public data class WHEA_SEL_BUGCHECK_RECOVERY_STATUS_START_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var StartingIrql: UByte = 0u)

public data class WHEA_SRAR_DETAIL_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var RecoveryContextFlags: UInt = 0u,
    public var RecoveryContextPa: ULong = 0uL,
    public var PageOfflineStatus: NTSTATUS = 0,
    public var KernelConsumerError: Boolean = false,
)

public data class WHEA_SRAS_TABLE_ENTRIES_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var LogNumber: UInt = 0u,
    public var NumberSignals: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_SRAS_TABLE_ENTRIES_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (this.LogNumber != other.LogNumber) return false
        if (this.NumberSignals != other.NumberSignals) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.LogNumber.hashCode()
        result = 31 * result + this.NumberSignals.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WHEA_SRAS_TABLE_ERROR(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY())

public data class WHEA_SRAS_TABLE_NOT_FOUND(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY())

public data class WHEA_THROTTLE_ADD_ERR_SRC_FAILED_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY())

public data class WHEA_THROTTLE_MEMORY_ADD_OR_REMOVE_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var SocketId: UInt = 0u,
    public var ChannelId: UInt = 0u,
    public var DimmSlot: UInt = 0u,
)

public data class WHEA_THROTTLE_PCIE_ADD_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Address: WHEA_PCIE_ADDRESS = WHEA_PCIE_ADDRESS(),
    public var Mask: UInt = 0u,
    public var Updated: Boolean = false,
    public var Status: NTSTATUS = 0,
)

public data class WHEA_THROTTLE_PCIE_REMOVE_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Address: WHEA_PCIE_ADDRESS = WHEA_PCIE_ADDRESS(),
    public var Mask: UInt = 0u,
)

public data class WHEA_THROTTLE_REGISTRY_CORRUPT_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var ThrottleType: WHEA_THROTTLE_TYPE = 0)

public data class WHEA_THROTTLE_REG_DATA_IGNORED_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var ThrottleType: WHEA_THROTTLE_TYPE = 0)

public data class WHEA_TIMESTAMP(public var Anonymous: WHEA_TIMESTAMP_0 = WHEA_TIMESTAMP_0(), public var AsLARGE_INTEGER: Long = 0L)

public data class WHEA_TIMESTAMP_0(public var _bitfield: ULong = 0uL)

public class WHEA_X64_REGISTER_STATE(
    public var Rax: ULong = 0uL,
    public var Rbx: ULong = 0uL,
    public var Rcx: ULong = 0uL,
    public var Rdx: ULong = 0uL,
    public var Rsi: ULong = 0uL,
    public var Rdi: ULong = 0uL,
    public var Rbp: ULong = 0uL,
    public var Rsp: ULong = 0uL,
    public var R8: ULong = 0uL,
    public var R9: ULong = 0uL,
    public var R10: ULong = 0uL,
    public var R11: ULong = 0uL,
    public var R12: ULong = 0uL,
    public var R13: ULong = 0uL,
    public var R14: ULong = 0uL,
    public var R15: ULong = 0uL,
    public var Cs: UShort = 0u,
    public var Ds: UShort = 0u,
    public var Ss: UShort = 0u,
    public var Es: UShort = 0u,
    public var Fs: UShort = 0u,
    public var Gs: UShort = 0u,
    public var Reserved: UInt = 0u,
    public var Rflags: ULong = 0uL,
    public var Eip: ULong = 0uL,
    public var Cr0: ULong = 0uL,
    public var Cr1: ULong = 0uL,
    public var Cr2: ULong = 0uL,
    public var Cr3: ULong = 0uL,
    public var Cr4: ULong = 0uL,
    public var Cr8: ULong = 0uL,
    public var Gdtr: WHEA128A = WHEA128A(),
    public var Idtr: WHEA128A = WHEA128A(),
    public var Ldtr: UShort = 0u,
    public var Tr: UShort = 0u,
)

public class WHEA_X86_REGISTER_STATE(
    public var Eax: UInt = 0u,
    public var Ebx: UInt = 0u,
    public var Ecx: UInt = 0u,
    public var Edx: UInt = 0u,
    public var Esi: UInt = 0u,
    public var Edi: UInt = 0u,
    public var Ebp: UInt = 0u,
    public var Esp: UInt = 0u,
    public var Cs: UShort = 0u,
    public var Ds: UShort = 0u,
    public var Ss: UShort = 0u,
    public var Es: UShort = 0u,
    public var Fs: UShort = 0u,
    public var Gs: UShort = 0u,
    public var Eflags: UInt = 0u,
    public var Eip: UInt = 0u,
    public var Cr0: UInt = 0u,
    public var Cr1: UInt = 0u,
    public var Cr2: UInt = 0u,
    public var Cr3: UInt = 0u,
    public var Cr4: UInt = 0u,
    public var Gdtr: ULong = 0uL,
    public var Idtr: ULong = 0uL,
    public var Ldtr: UShort = 0u,
    public var Tr: UShort = 0u,
)

public data class WHEA_XPF_BUS_CHECK(public var Anonymous: WHEA_XPF_BUS_CHECK_0 = WHEA_XPF_BUS_CHECK_0(), public var XpfBusCheck: ULong = 0uL)

public data class WHEA_XPF_BUS_CHECK_0(public var _bitfield: ULong = 0uL)

public data class WHEA_XPF_CACHE_CHECK(public var Anonymous: WHEA_XPF_CACHE_CHECK_0 = WHEA_XPF_CACHE_CHECK_0(), public var XpfCacheCheck: ULong = 0uL)

public data class WHEA_XPF_CACHE_CHECK_0(public var _bitfield: ULong = 0uL)

public data class WHEA_XPF_CONTEXT_INFO(
    public var RegisterContextType: UShort = 0u,
    public var RegisterDataSize: UShort = 0u,
    public var MSRAddress: UInt = 0u,
    public var MmRegisterAddress: ULong = 0uL,
)

public data class WHEA_XPF_MCA_SECTION(
    public var VersionNumber: UInt = 0u,
    public var CpuVendor: WHEA_CPU_VENDOR = 0,
    public var Timestamp: Long = 0L,
    public var ProcessorNumber: UInt = 0u,
    public var GlobalStatus: MCG_STATUS = MCG_STATUS(),
    public var InstructionPointer: ULong = 0uL,
    public var BankNumber: UInt = 0u,
    public var Status: MCI_STATUS = MCI_STATUS(),
    public var Address: ULong = 0uL,
    public var Misc: ULong = 0uL,
    public var ExtendedRegisterCount: UInt = 0u,
    public var ApicId: UInt = 0u,
    public var Anonymous: WHEA_XPF_MCA_SECTION_0 = WHEA_XPF_MCA_SECTION_0(),
    public var GlobalCapability: MCG_CAP = MCG_CAP(),
    public var RecoveryInfo: XPF_RECOVERY_INFO = XPF_RECOVERY_INFO(),
)

public data class WHEA_XPF_MCA_SECTION_0(public var ExtendedRegisters: ULongArray = ULongArray(24), public var AMDExtendedRegisters: WHEA_AMD_EXTENDED_REGISTERS = WHEA_AMD_EXTENDED_REGISTERS()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_XPF_MCA_SECTION_0) return false
        if (!this.ExtendedRegisters.contentEquals(other.ExtendedRegisters)) return false
        if (this.AMDExtendedRegisters != other.AMDExtendedRegisters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ExtendedRegisters.contentHashCode()
        result = 31 * result + this.AMDExtendedRegisters.hashCode()
        return result
    }
}

public data class WHEA_XPF_MS_CHECK(public var Anonymous: WHEA_XPF_MS_CHECK_0 = WHEA_XPF_MS_CHECK_0(), public var XpfMsCheck: ULong = 0uL)

public data class WHEA_XPF_MS_CHECK_0(public var _bitfield: ULong = 0uL)

public data class WHEA_XPF_PROCESSOR_ERROR_SECTION(
    public var ValidBits: WHEA_XPF_PROCESSOR_ERROR_SECTION_VALIDBITS = WHEA_XPF_PROCESSOR_ERROR_SECTION_VALIDBITS(),
    public var LocalAPICId: ULong = 0uL,
    public var CpuId: UByteArray = UByteArray(48),
    public var VariableInfo: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_XPF_PROCESSOR_ERROR_SECTION) return false
        if (this.ValidBits != other.ValidBits) return false
        if (this.LocalAPICId != other.LocalAPICId) return false
        if (!this.CpuId.contentEquals(other.CpuId)) return false
        if (!this.VariableInfo.contentEquals(other.VariableInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ValidBits.hashCode()
        result = 31 * result + this.LocalAPICId.hashCode()
        result = 31 * result + this.CpuId.contentHashCode()
        result = 31 * result + this.VariableInfo.contentHashCode()
        return result
    }
}

public data class WHEA_XPF_PROCESSOR_ERROR_SECTION_VALIDBITS(public var Anonymous: WHEA_XPF_PROCESSOR_ERROR_SECTION_VALIDBITS_0 = WHEA_XPF_PROCESSOR_ERROR_SECTION_VALIDBITS_0(), public var ValidBits: ULong = 0uL)

public data class WHEA_XPF_PROCESSOR_ERROR_SECTION_VALIDBITS_0(public var _bitfield: ULong = 0uL)

public data class WHEA_XPF_PROCINFO(
    public var CheckInfoId: GUID = GUID(),
    public var ValidBits: WHEA_XPF_PROCINFO_VALIDBITS = WHEA_XPF_PROCINFO_VALIDBITS(),
    public var CheckInfo: WHEA_XPF_PROCINFO_0 = WHEA_XPF_PROCINFO_0(),
    public var TargetId: ULong = 0uL,
    public var RequesterId: ULong = 0uL,
    public var ResponderId: ULong = 0uL,
    public var InstructionPointer: ULong = 0uL,
)

public data class WHEA_XPF_PROCINFO_0(
    public var CacheCheck: WHEA_XPF_CACHE_CHECK = WHEA_XPF_CACHE_CHECK(),
    public var TlbCheck: WHEA_XPF_TLB_CHECK = WHEA_XPF_TLB_CHECK(),
    public var BusCheck: WHEA_XPF_BUS_CHECK = WHEA_XPF_BUS_CHECK(),
    public var MsCheck: WHEA_XPF_MS_CHECK = WHEA_XPF_MS_CHECK(),
    public var AsULONGLONG: ULong = 0uL,
)

public data class WHEA_XPF_PROCINFO_VALIDBITS(public var Anonymous: WHEA_XPF_PROCINFO_VALIDBITS_0 = WHEA_XPF_PROCINFO_VALIDBITS_0(), public var ValidBits: ULong = 0uL)

public data class WHEA_XPF_PROCINFO_VALIDBITS_0(public var _bitfield: ULong = 0uL)

public data class WHEA_XPF_TLB_CHECK(public var Anonymous: WHEA_XPF_TLB_CHECK_0 = WHEA_XPF_TLB_CHECK_0(), public var XpfTLBCheck: ULong = 0uL)

public data class WHEA_XPF_TLB_CHECK_0(public var _bitfield: ULong = 0uL)

public data class XPF_RECOVERY_INFO(
    public var FailureReason: XPF_RECOVERY_INFO_0 = XPF_RECOVERY_INFO_0(),
    public var Action: XPF_RECOVERY_INFO_1 = XPF_RECOVERY_INFO_1(),
    public var ActionRequired: Boolean = false,
    public var RecoverySucceeded: Boolean = false,
    public var RecoveryKernel: Boolean = false,
    public var Reserved: UByte = 0u,
    public var Reserved2: UShort = 0u,
    public var Reserved3: UShort = 0u,
    public var Reserved4: UInt = 0u,
)

public data class XPF_RECOVERY_INFO_1(public var _bitfield: UInt = 0u)

public data class XPF_RECOVERY_INFO_0(public var _bitfield: UInt = 0u)

public data class XSAVE_FORMAT(
    public var ControlWord: UShort = 0u,
    public var StatusWord: UShort = 0u,
    public var TagWord: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var ErrorOpcode: UShort = 0u,
    public var ErrorOffset: UInt = 0u,
    public var ErrorSelector: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var DataOffset: UInt = 0u,
    public var DataSelector: UShort = 0u,
    public var Reserved3: UShort = 0u,
    public var MxCsr: UInt = 0u,
    public var MxCsr_Mask: UInt = 0u,
    public var FloatRegisters: List<M128A> = List(8) { M128A() },
    public var XmmRegisters: List<M128A> = List(8) { M128A() },
    public var Reserved4: UByteArray = UByteArray(224),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XSAVE_FORMAT) return false
        if (this.ControlWord != other.ControlWord) return false
        if (this.StatusWord != other.StatusWord) return false
        if (this.TagWord != other.TagWord) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.ErrorOpcode != other.ErrorOpcode) return false
        if (this.ErrorOffset != other.ErrorOffset) return false
        if (this.ErrorSelector != other.ErrorSelector) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.DataOffset != other.DataOffset) return false
        if (this.DataSelector != other.DataSelector) return false
        if (this.Reserved3 != other.Reserved3) return false
        if (this.MxCsr != other.MxCsr) return false
        if (this.MxCsr_Mask != other.MxCsr_Mask) return false
        if (this.FloatRegisters != other.FloatRegisters) return false
        if (this.XmmRegisters != other.XmmRegisters) return false
        if (!this.Reserved4.contentEquals(other.Reserved4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ControlWord.hashCode()
        result = 31 * result + this.StatusWord.hashCode()
        result = 31 * result + this.TagWord.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.ErrorOpcode.hashCode()
        result = 31 * result + this.ErrorOffset.hashCode()
        result = 31 * result + this.ErrorSelector.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.DataOffset.hashCode()
        result = 31 * result + this.DataSelector.hashCode()
        result = 31 * result + this.Reserved3.hashCode()
        result = 31 * result + this.MxCsr.hashCode()
        result = 31 * result + this.MxCsr_Mask.hashCode()
        result = 31 * result + this.FloatRegisters.hashCode()
        result = 31 * result + this.XmmRegisters.hashCode()
        result = 31 * result + this.Reserved4.contentHashCode()
        return result
    }
}

public data class XSTATE_CONTEXT(
    public var Mask: ULong = 0uL,
    public var Length: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Area: Long = 0L,
    public var Reserved2: UInt = 0u,
    public var Buffer: Long = 0L,
    public var Reserved3: UInt = 0u,
)

public data class XSTATE_SAVE(public var Anonymous: XSTATE_SAVE_0 = XSTATE_SAVE_0())

public data class XSTATE_SAVE_0(public var Anonymous: XSTATE_SAVE_0_0 = XSTATE_SAVE_0_0(), public var XStateContext: XSTATE_CONTEXT = XSTATE_CONTEXT())

public data class XSTATE_SAVE_0_0(
    public var Reserved1: Long = 0L,
    public var Reserved2: UInt = 0u,
    public var Prev: Long = 0L,
    public var Reserved3: Long = 0L,
    public var Thread: Long = 0L,
    public var Reserved4: Long = 0L,
    public var Level: UByte = 0u,
)

public data class ZONE_HEADER(
    public var FreeList: SINGLE_LIST_ENTRY = SINGLE_LIST_ENTRY(),
    public var SegmentList: SINGLE_LIST_ENTRY = SINGLE_LIST_ENTRY(),
    public var BlockSize: UInt = 0u,
    public var TotalSegmentSize: UInt = 0u,
)

public data class ZONE_SEGMENT_HEADER(public var SegmentList: SINGLE_LIST_ENTRY = SINGLE_LIST_ENTRY(), public var Reserved: Long = 0L)

public data class _EXT_SET_PARAMETERS_V0(
    public var Version: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var NoWakeTolerance: Long = 0L,
)
