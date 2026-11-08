@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.LIST_ENTRY
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.IMAGE_FILE_MACHINE

public data class APP_MEMORY_INFORMATION(
    public var AvailableCommit: ULong = 0uL,
    public var PrivateCommitUsage: ULong = 0uL,
    public var PeakPrivateCommitUsage: ULong = 0uL,
    public var TotalCommitUsage: ULong = 0uL,
)

public data class CONDITION_VARIABLE(public var Ptr: Long = 0L)

public data class CRITICAL_SECTION(
    public var DebugInfo: Long = 0L,
    public var LockCount: Int = 0,
    public var RecursionCount: Int = 0,
    public var OwningThread: HANDLE = 0L,
    public var LockSemaphore: HANDLE = 0L,
    public var SpinCount: ULong = 0uL,
)

public data class CRITICAL_SECTION_DEBUG(
    public var Type: UShort = 0u,
    public var CreatorBackTraceIndex: UShort = 0u,
    public var CriticalSection: Long = 0L,
    public var ProcessLocksList: LIST_ENTRY = LIST_ENTRY(),
    public var EntryCount: UInt = 0u,
    public var ContentionCount: UInt = 0u,
    public var Flags: UInt = 0u,
    public var CreatorBackTraceIndexHigh: UShort = 0u,
    public var Identifier: UShort = 0u,
)

public data class INIT_ONCE(public var Ptr: Long = 0L)

public data class IO_COUNTERS(
    public var ReadOperationCount: ULong = 0uL,
    public var WriteOperationCount: ULong = 0uL,
    public var OtherOperationCount: ULong = 0uL,
    public var ReadTransferCount: ULong = 0uL,
    public var WriteTransferCount: ULong = 0uL,
    public var OtherTransferCount: ULong = 0uL,
)

public data class MEMORY_PRIORITY_INFORMATION(public var MemoryPriority: MEMORY_PRIORITY = 0u)

public data class OVERRIDE_PREFETCH_PARAMETER(public var Value: UInt = 0u)

public class PEB(
    public var Reserved1: UByteArray = UByteArray(2),
    public var BeingDebugged: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(1),
    public var Reserved3: LongArray = LongArray(2),
    public var Ldr: Long = 0L,
    public var ProcessParameters: Long = 0L,
    public var Reserved4: LongArray = LongArray(3),
    public var AtlThunkSListPtr: Long = 0L,
    public var Reserved5: Long = 0L,
    public var Reserved6: UInt = 0u,
    public var Reserved7: Long = 0L,
    public var Reserved8: UInt = 0u,
    public var AtlThunkSListPtr32: UInt = 0u,
    public var Reserved9: LongArray = LongArray(45),
    public var Reserved10: UByteArray = UByteArray(96),
    public var PostProcessInitRoutine: PPS_POST_PROCESS_INIT_ROUTINE = null,
    public var Reserved11: UByteArray = UByteArray(128),
    public var Reserved12: LongArray = LongArray(1),
    public var SessionId: UInt = 0u,
)

public data class PEB_LDR_DATA(
    public var Reserved1: UByteArray = UByteArray(8),
    public var Reserved2: LongArray = LongArray(3),
    public var InMemoryOrderModuleList: LIST_ENTRY = LIST_ENTRY(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PEB_LDR_DATA) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.InMemoryOrderModuleList != other.InMemoryOrderModuleList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.InMemoryOrderModuleList.hashCode()
        return result
    }
}

public data class PROCESS_BASIC_INFORMATION(
    public var ExitStatus: NTSTATUS = 0,
    public var PebBaseAddress: Long = 0L,
    public var AffinityMask: ULong = 0uL,
    public var BasePriority: Int = 0,
    public var UniqueProcessId: ULong = 0uL,
    public var InheritedFromUniqueProcessId: ULong = 0uL,
)

public data class PROCESS_DYNAMIC_EH_CONTINUATION_TARGET(public var TargetAddress: ULong = 0uL, public var Flags: ULong = 0uL)

public data class PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION(
    public var NumberOfTargets: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Reserved2: UInt = 0u,
    public var Targets: Long = 0L,
)

public data class PROCESS_DYNAMIC_ENFORCED_ADDRESS_RANGE(
    public var BaseAddress: ULong = 0uL,
    public var Size: ULong = 0uL,
    public var Flags: UInt = 0u,
)

public data class PROCESS_DYNAMIC_ENFORCED_ADDRESS_RANGES_INFORMATION(
    public var NumberOfRanges: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Reserved2: UInt = 0u,
    public var Ranges: Long = 0L,
)

public data class PROCESS_INFORMATION(
    public var hProcess: HANDLE = 0L,
    public var hThread: HANDLE = 0L,
    public var dwProcessId: UInt = 0u,
    public var dwThreadId: UInt = 0u,
)

public data class PROCESS_LEAP_SECOND_INFO(public var Flags: UInt = 0u, public var Reserved: UInt = 0u)

public data class PROCESS_MACHINE_INFORMATION(
    public var ProcessMachine: IMAGE_FILE_MACHINE = 0u,
    public var Res0: UShort = 0u,
    public var MachineAttributes: MACHINE_ATTRIBUTES = 0,
)

public data class PROCESS_MEMORY_EXHAUSTION_INFO(
    public var Version: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Type: PROCESS_MEMORY_EXHAUSTION_TYPE = 0,
    public var Value: ULong = 0uL,
)

public data class PROCESS_POWER_THROTTLING_STATE(
    public var Version: UInt = 0u,
    public var ControlMask: UInt = 0u,
    public var StateMask: UInt = 0u,
)

public data class PROCESS_PROTECTION_LEVEL_INFORMATION(public var ProtectionLevel: PROCESS_PROTECTION_LEVEL = 0u)

public data class REASON_CONTEXT(
    public var Version: UInt = 0u,
    public var Flags: POWER_REQUEST_CONTEXT_FLAGS = 0u,
    public var Reason: REASON_CONTEXT_0 = REASON_CONTEXT_0(),
)

public data class REASON_CONTEXT_0(public var Detailed: REASON_CONTEXT_0_0 = REASON_CONTEXT_0_0(), public var SimpleReasonString: PWSTR = 0L)

public data class REASON_CONTEXT_0_0(
    public var LocalizedReasonModule: HMODULE = 0L,
    public var LocalizedReasonId: UInt = 0u,
    public var ReasonStringCount: UInt = 0u,
    public var ReasonStrings: Long = 0L,
)

public data class RTL_USER_PROCESS_PARAMETERS(
    public var Reserved1: UByteArray = UByteArray(16),
    public var Reserved2: LongArray = LongArray(10),
    public var ImagePathName: UNICODE_STRING = UNICODE_STRING(),
    public var CommandLine: UNICODE_STRING = UNICODE_STRING(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RTL_USER_PROCESS_PARAMETERS) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.ImagePathName != other.ImagePathName) return false
        if (this.CommandLine != other.CommandLine) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.ImagePathName.hashCode()
        result = 31 * result + this.CommandLine.hashCode()
        return result
    }
}

public data class SRWLOCK(public var Ptr: Long = 0L)

public class STARTUPINFOA(
    public var cb: UInt = 0u,
    public var lpReserved: PSTR = 0L,
    public var lpDesktop: PSTR = 0L,
    public var lpTitle: PSTR = 0L,
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwXSize: UInt = 0u,
    public var dwYSize: UInt = 0u,
    public var dwXCountChars: UInt = 0u,
    public var dwYCountChars: UInt = 0u,
    public var dwFillAttribute: UInt = 0u,
    public var dwFlags: STARTUPINFOW_FLAGS = 0u,
    public var wShowWindow: UShort = 0u,
    public var cbReserved2: UShort = 0u,
    public var lpReserved2: Long = 0L,
    public var hStdInput: HANDLE = 0L,
    public var hStdOutput: HANDLE = 0L,
    public var hStdError: HANDLE = 0L,
)

public data class STARTUPINFOEXA(public var StartupInfo: STARTUPINFOA = STARTUPINFOA(), public var lpAttributeList: LPPROC_THREAD_ATTRIBUTE_LIST = 0L)

public data class STARTUPINFOEXW(public var StartupInfo: STARTUPINFOW = STARTUPINFOW(), public var lpAttributeList: LPPROC_THREAD_ATTRIBUTE_LIST = 0L)

public class STARTUPINFOW(
    public var cb: UInt = 0u,
    public var lpReserved: PWSTR = 0L,
    public var lpDesktop: PWSTR = 0L,
    public var lpTitle: PWSTR = 0L,
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwXSize: UInt = 0u,
    public var dwYSize: UInt = 0u,
    public var dwXCountChars: UInt = 0u,
    public var dwYCountChars: UInt = 0u,
    public var dwFillAttribute: UInt = 0u,
    public var dwFlags: STARTUPINFOW_FLAGS = 0u,
    public var wShowWindow: UShort = 0u,
    public var cbReserved2: UShort = 0u,
    public var lpReserved2: Long = 0L,
    public var hStdInput: HANDLE = 0L,
    public var hStdOutput: HANDLE = 0L,
    public var hStdError: HANDLE = 0L,
)

public data class SYNCHRONIZATION_BARRIER(
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var Reserved3: ULongArray = ULongArray(2),
    public var Reserved4: UInt = 0u,
    public var Reserved5: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYNCHRONIZATION_BARRIER) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        if (this.Reserved4 != other.Reserved4) return false
        if (this.Reserved5 != other.Reserved5) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        result = 31 * result + this.Reserved4.hashCode()
        result = 31 * result + this.Reserved5.hashCode()
        return result
    }
}

public data class TEB(
    public var Reserved1: LongArray = LongArray(12),
    public var ProcessEnvironmentBlock: Long = 0L,
    public var Reserved2: LongArray = LongArray(399),
    public var Reserved3: UByteArray = UByteArray(1952),
    public var TlsSlots: LongArray = LongArray(64),
    public var Reserved4: UByteArray = UByteArray(8),
    public var Reserved5: LongArray = LongArray(26),
    public var ReservedForOle: Long = 0L,
    public var Reserved6: LongArray = LongArray(4),
    public var TlsExpansionSlots: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TEB) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.ProcessEnvironmentBlock != other.ProcessEnvironmentBlock) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        if (!this.TlsSlots.contentEquals(other.TlsSlots)) return false
        if (!this.Reserved4.contentEquals(other.Reserved4)) return false
        if (!this.Reserved5.contentEquals(other.Reserved5)) return false
        if (this.ReservedForOle != other.ReservedForOle) return false
        if (!this.Reserved6.contentEquals(other.Reserved6)) return false
        if (this.TlsExpansionSlots != other.TlsExpansionSlots) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.ProcessEnvironmentBlock.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        result = 31 * result + this.TlsSlots.contentHashCode()
        result = 31 * result + this.Reserved4.contentHashCode()
        result = 31 * result + this.Reserved5.contentHashCode()
        result = 31 * result + this.ReservedForOle.hashCode()
        result = 31 * result + this.Reserved6.contentHashCode()
        result = 31 * result + this.TlsExpansionSlots.hashCode()
        return result
    }
}

public data class THREAD_POWER_THROTTLING_STATE(
    public var Version: UInt = 0u,
    public var ControlMask: UInt = 0u,
    public var StateMask: UInt = 0u,
)

public data class TP_CALLBACK_ENVIRON_V3(
    public var Version: UInt = 0u,
    public var Pool: PTP_POOL = 0L,
    public var CleanupGroup: PTP_CLEANUP_GROUP = 0L,
    public var CleanupGroupCancelCallback: PTP_CLEANUP_GROUP_CANCEL_CALLBACK = null,
    public var RaceDll: Long = 0L,
    public var ActivationContext: Long = 0L,
    public var FinalizationCallback: PTP_SIMPLE_CALLBACK = null,
    public var u: TP_CALLBACK_ENVIRON_V3_0 = TP_CALLBACK_ENVIRON_V3_0(),
    public var CallbackPriority: TP_CALLBACK_PRIORITY = 0,
    public var Size: UInt = 0u,
)

public data class TP_CALLBACK_ENVIRON_V3_0(public var Flags: UInt = 0u, public var s: TP_CALLBACK_ENVIRON_V3_0_0 = TP_CALLBACK_ENVIRON_V3_0_0())

public data class TP_CALLBACK_ENVIRON_V3_0_0(public var _bitfield: UInt = 0u)

public data class TP_POOL_STACK_INFORMATION(public var StackReserve: ULong = 0uL, public var StackCommit: ULong = 0uL)

public data class UMS_SCHEDULER_STARTUP_INFO(
    public var UmsVersion: UInt = 0u,
    public var CompletionList: Long = 0L,
    public var SchedulerProc: PRTL_UMS_SCHEDULER_ENTRY_POINT = null,
    public var SchedulerParam: Long = 0L,
)

public data class UMS_SYSTEM_THREAD_INFORMATION(public var UmsVersion: UInt = 0u, public var Anonymous: UMS_SYSTEM_THREAD_INFORMATION_0 = UMS_SYSTEM_THREAD_INFORMATION_0())

public data class UMS_SYSTEM_THREAD_INFORMATION_0(public var Anonymous: UMS_SYSTEM_THREAD_INFORMATION_0_0 = UMS_SYSTEM_THREAD_INFORMATION_0_0(), public var ThreadUmsFlags: UInt = 0u)

public data class UMS_SYSTEM_THREAD_INFORMATION_0_0(public var _bitfield: UInt = 0u)
