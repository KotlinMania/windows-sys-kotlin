@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ImageFileMachine

public data class AppMemoryInformation(
    public var availableCommit: ULong = 0uL,
    public var privateCommitUsage: ULong = 0uL,
    public var peakPrivateCommitUsage: ULong = 0uL,
    public var totalCommitUsage: ULong = 0uL,
)

public data class ConditionVariable(public var ptr: COpaquePointer? = null)

public data class CriticalSection(
    public var debugInfo: CriticalSectionDebug? = null,
    public var lockCount: Int = 0,
    public var recursionCount: Int = 0,
    public var owningThread: Handle = null,
    public var lockSemaphore: Handle = null,
    public var spinCount: Int = 0,
)

public data class CriticalSectionDebug(
    public var type: UShort = 0u,
    public var creatorBackTraceIndex: UShort = 0u,
    public var criticalSection: CriticalSection? = null,
    public var processLocksList: ListEntry = ListEntry(),
    public var entryCount: UInt = 0u,
    public var contentionCount: UInt = 0u,
    public var flags: UInt = 0u,
    public var creatorBackTraceIndexHigh: UShort = 0u,
    public var identifier: UShort = 0u,
)

public data class InitOnce(public var ptr: COpaquePointer? = null)

public data class IoCounters(
    public var readOperationCount: ULong = 0uL,
    public var writeOperationCount: ULong = 0uL,
    public var otherOperationCount: ULong = 0uL,
    public var readTransferCount: ULong = 0uL,
    public var writeTransferCount: ULong = 0uL,
    public var otherTransferCount: ULong = 0uL,
)

public data class MemoryPriorityInformation(public var memoryPriority: MemoryPriority = 0u)

public data class OverridePrefetchParameter(public var value: UInt = 0u)

public class Peb(
    public var reserved1: UByteArray = UByteArray(2),
    public var beingDebugged: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(1),
    public var reserved3: List<COpaquePointer> = List(2) { COpaquePointer(0L) },
    public var ldr: PebLdrData? = null,
    public var processParameters: RtlUserProcessParameters? = null,
    public var reserved4: List<COpaquePointer> = List(3) { COpaquePointer(0L) },
    public var atlThunkSListPtr: COpaquePointer? = null,
    public var reserved5: COpaquePointer? = null,
    public var reserved6: UInt = 0u,
    public var reserved7: COpaquePointer? = null,
    public var reserved8: UInt = 0u,
    public var atlThunkSListPtr32: UInt = 0u,
    public var reserved9: List<COpaquePointer> = List(45) { COpaquePointer(0L) },
    public var reserved10: UByteArray = UByteArray(96),
    public var postProcessInitRoutine: PpsPostProcessInitRoutine = null,
    public var reserved11: UByteArray = UByteArray(128),
    public var reserved12: List<COpaquePointer> = List(1) { COpaquePointer(0L) },
    public var sessionId: UInt = 0u,
)

public data class PebLdrData(
    public var reserved1: UByteArray = UByteArray(8),
    public var reserved2: List<COpaquePointer> = List(3) { COpaquePointer(0L) },
    public var inMemoryOrderModuleList: ListEntry = ListEntry(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PebLdrData) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.inMemoryOrderModuleList != other.inMemoryOrderModuleList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.inMemoryOrderModuleList.hashCode()
        return result
    }
}

public data class ProcessBasicInformation(
    public var exitStatus: Ntstatus = 0,
    public var pebBaseAddress: Peb? = null,
    public var affinityMask: Int = 0,
    public var basePriority: Int = 0,
    public var uniqueProcessId: Int = 0,
    public var inheritedFromUniqueProcessId: Int = 0,
)

public data class ProcessDynamicEhContinuationTarget(public var targetAddress: Int = 0, public var flags: Int = 0)

public data class ProcessDynamicEhContinuationTargetsInformation(
    public var numberOfTargets: UShort = 0u,
    public var reserved: UShort = 0u,
    public var reserved2: UInt = 0u,
    public var targets: ProcessDynamicEhContinuationTarget? = null,
)

public data class ProcessDynamicEnforcedAddressRange(
    public var baseAddress: Int = 0,
    public var size: Int = 0,
    public var flags: UInt = 0u,
)

public data class ProcessDynamicEnforcedAddressRangesInformation(
    public var numberOfRanges: UShort = 0u,
    public var reserved: UShort = 0u,
    public var reserved2: UInt = 0u,
    public var ranges: ProcessDynamicEnforcedAddressRange? = null,
)

public data class ProcessInformation(
    public var hProcess: Handle = null,
    public var hThread: Handle = null,
    public var dwProcessId: UInt = 0u,
    public var dwThreadId: UInt = 0u,
)

public data class ProcessLeapSecondInfo(public var flags: UInt = 0u, public var reserved: UInt = 0u)

public data class ProcessMachineInformation(
    public var processMachine: ImageFileMachine = 0u,
    public var res0: UShort = 0u,
    public var machineAttributes: MachineAttributes = 0,
)

public data class ProcessMemoryExhaustionInfo(
    public var version: UShort = 0u,
    public var reserved: UShort = 0u,
    public var type: ProcessMemoryExhaustionType = 0,
    public var value: Int = 0,
)

public data class ProcessPowerThrottlingState(
    public var version: UInt = 0u,
    public var controlMask: UInt = 0u,
    public var stateMask: UInt = 0u,
)

public data class ProcessProtectionLevelInformation(public var protectionLevel: ProcessProtectionLevel = 0u)

public data class ReasonContext(
    public var version: UInt = 0u,
    public var flags: PowerRequestContextFlags = 0u,
    public var reason: ReasonContext0 = ReasonContext0(),
)

public data class ReasonContext0(public var detailed: ReasonContext00 = ReasonContext00(), public var simpleReasonString: Pwstr = null)

public data class ReasonContext00(
    public var localizedReasonModule: Hmodule = null,
    public var localizedReasonId: UInt = 0u,
    public var reasonStringCount: UInt = 0u,
    public var reasonStrings: Pwstr? = null,
)

public data class RtlUserProcessParameters(
    public var reserved1: UByteArray = UByteArray(16),
    public var reserved2: List<COpaquePointer> = List(10) { COpaquePointer(0L) },
    public var imagePathName: UnicodeString = UnicodeString(),
    public var commandLine: UnicodeString = UnicodeString(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlUserProcessParameters) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.imagePathName != other.imagePathName) return false
        if (this.commandLine != other.commandLine) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.imagePathName.hashCode()
        result = 31 * result + this.commandLine.hashCode()
        return result
    }
}

public data class Srwlock(public var ptr: COpaquePointer? = null)

public class Startupinfoa(
    public var cb: UInt = 0u,
    public var lpReserved: Pstr = null,
    public var lpDesktop: Pstr = null,
    public var lpTitle: Pstr = null,
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwXSize: UInt = 0u,
    public var dwYSize: UInt = 0u,
    public var dwXCountChars: UInt = 0u,
    public var dwYCountChars: UInt = 0u,
    public var dwFillAttribute: UInt = 0u,
    public var dwFlags: StartupinfowFlags = 0u,
    public var wShowWindow: UShort = 0u,
    public var cbReserved2: UShort = 0u,
    public var lpReserved2: COpaquePointer? = null,
    public var hStdInput: Handle = null,
    public var hStdOutput: Handle = null,
    public var hStdError: Handle = null,
)

public data class Startupinfoexa(public var startupInfo: Startupinfoa = Startupinfoa(), public var lpAttributeList: LpprocThreadAttributeList = null)

public data class Startupinfoexw(public var startupInfo: Startupinfow = Startupinfow(), public var lpAttributeList: LpprocThreadAttributeList = null)

public class Startupinfow(
    public var cb: UInt = 0u,
    public var lpReserved: Pwstr = null,
    public var lpDesktop: Pwstr = null,
    public var lpTitle: Pwstr = null,
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwXSize: UInt = 0u,
    public var dwYSize: UInt = 0u,
    public var dwXCountChars: UInt = 0u,
    public var dwYCountChars: UInt = 0u,
    public var dwFillAttribute: UInt = 0u,
    public var dwFlags: StartupinfowFlags = 0u,
    public var wShowWindow: UShort = 0u,
    public var cbReserved2: UShort = 0u,
    public var lpReserved2: COpaquePointer? = null,
    public var hStdInput: Handle = null,
    public var hStdOutput: Handle = null,
    public var hStdError: Handle = null,
)

public data class SynchronizationBarrier(
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var reserved3: IntArray = IntArray(2),
    public var reserved4: UInt = 0u,
    public var reserved5: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SynchronizationBarrier) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        if (this.reserved4 != other.reserved4) return false
        if (this.reserved5 != other.reserved5) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        result = 31 * result + this.reserved4.hashCode()
        result = 31 * result + this.reserved5.hashCode()
        return result
    }
}

public data class Teb(
    public var reserved1: List<COpaquePointer> = List(12) { COpaquePointer(0L) },
    public var processEnvironmentBlock: Peb? = null,
    public var reserved2: List<COpaquePointer> = List(399) { COpaquePointer(0L) },
    public var reserved3: UByteArray = UByteArray(1952),
    public var tlsSlots: List<COpaquePointer> = List(64) { COpaquePointer(0L) },
    public var reserved4: UByteArray = UByteArray(8),
    public var reserved5: List<COpaquePointer> = List(26) { COpaquePointer(0L) },
    public var reservedForOle: COpaquePointer? = null,
    public var reserved6: List<COpaquePointer> = List(4) { COpaquePointer(0L) },
    public var tlsExpansionSlots: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Teb) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.processEnvironmentBlock != other.processEnvironmentBlock) return false
        if (this.reserved2 != other.reserved2) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        if (this.tlsSlots != other.tlsSlots) return false
        if (!this.reserved4.contentEquals(other.reserved4)) return false
        if (this.reserved5 != other.reserved5) return false
        if (this.reservedForOle != other.reservedForOle) return false
        if (this.reserved6 != other.reserved6) return false
        if (this.tlsExpansionSlots != other.tlsExpansionSlots) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.processEnvironmentBlock.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        result = 31 * result + this.tlsSlots.hashCode()
        result = 31 * result + this.reserved4.contentHashCode()
        result = 31 * result + this.reserved5.hashCode()
        result = 31 * result + this.reservedForOle.hashCode()
        result = 31 * result + this.reserved6.hashCode()
        result = 31 * result + this.tlsExpansionSlots.hashCode()
        return result
    }
}

public data class ThreadPowerThrottlingState(
    public var version: UInt = 0u,
    public var controlMask: UInt = 0u,
    public var stateMask: UInt = 0u,
)

public data class TpCallbackEnvironV3(
    public var version: UInt = 0u,
    public var pool: PtpPool = 0L,
    public var cleanupGroup: PtpCleanupGroup = 0L,
    public var cleanupGroupCancelCallback: PtpCleanupGroupCancelCallback = null,
    public var raceDll: COpaquePointer? = null,
    public var activationContext: Int = 0,
    public var finalizationCallback: PtpSimpleCallback = null,
    public var u: TpCallbackEnvironV30 = TpCallbackEnvironV30(),
    public var callbackPriority: TpCallbackPriority = 0,
    public var size: UInt = 0u,
)

public data class TpCallbackEnvironV30(public var flags: UInt = 0u, public var s: TpCallbackEnvironV300 = TpCallbackEnvironV300())

public data class TpCallbackEnvironV300(public var bitfield: UInt = 0u)

public data class TpPoolStackInformation(public var stackReserve: Int = 0, public var stackCommit: Int = 0)

public data class UmsSchedulerStartupInfo(
    public var umsVersion: UInt = 0u,
    public var completionList: COpaquePointer? = null,
    public var schedulerProc: PrtlUmsSchedulerEntryPoint = null,
    public var schedulerParam: COpaquePointer? = null,
)

public data class UmsSystemThreadInformation(public var umsVersion: UInt = 0u, public var anonymous: UmsSystemThreadInformation0 = UmsSystemThreadInformation0())

public data class UmsSystemThreadInformation0(public var anonymous: UmsSystemThreadInformation00 = UmsSystemThreadInformation00(), public var threadUmsFlags: UInt = 0u)

public data class UmsSystemThreadInformation00(public var bitfield: UInt = 0u)
