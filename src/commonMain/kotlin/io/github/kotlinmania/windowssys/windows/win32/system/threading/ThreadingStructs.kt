// port-lint: source Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

// Upstream structs from Windows/Win32/System/Threading/mod.rs.
// Pointer fields use `Long` per this port's pointer-typealias
// convention (cf. core/Core.kt). Structs that upstream guards behind
// `#[cfg(feature = "Win32_System_Kernel")]` (CRITICAL_SECTION,
// CRITICAL_SECTION_DEBUG, PEB, PEB_LDR_DATA, PROCESS_BASIC_INFORMATION,
// TEB) reference Kernel types not yet ported; their pointer fields
// for those types are `Long` placeholders.

public data class APP_MEMORY_INFORMATION(
    public var availableCommit: ULong = 0uL,
    public var privateCommitUsage: ULong = 0uL,
    public var peakPrivateCommitUsage: ULong = 0uL,
    public var totalCommitUsage: ULong = 0uL,
)

public class CONDITION_VARIABLE(
    public var ptr: Long = 0L,
) {
    public companion object {
        public val INIT: CONDITION_VARIABLE = CONDITION_VARIABLE()
    }
}

public class INIT_ONCE(
    public var ptr: Long = 0L,
) {
    public companion object {
        public val STATIC_INIT: INIT_ONCE = INIT_ONCE()
    }
}

public data class IO_COUNTERS(
    public var readOperationCount: ULong = 0uL,
    public var writeOperationCount: ULong = 0uL,
    public var otherOperationCount: ULong = 0uL,
    public var readTransferCount: ULong = 0uL,
    public var writeTransferCount: ULong = 0uL,
    public var otherTransferCount: ULong = 0uL,
)

public data class MEMORY_PRIORITY_INFORMATION(
    public var memoryPriority: MEMORY_PRIORITY = 0u,
)

public data class OVERRIDE_PREFETCH_PARAMETER(
    public var value: UInt = 0u,
)

public data class PROCESS_INFORMATION(
    public var hProcess: HANDLE = 0L,
    public var hThread: HANDLE = 0L,
    public var dwProcessId: UInt = 0u,
    public var dwThreadId: UInt = 0u,
)

public data class PROCESS_LEAP_SECOND_INFO(
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class PROCESS_MACHINE_INFORMATION(
    public var processMachine: UShort = 0u,
    public var res0: UShort = 0u,
    public var machineAttributes: MACHINE_ATTRIBUTES = 0,
)

public data class PROCESS_MEMORY_EXHAUSTION_INFO(
    public var version: UShort = 0u,
    public var reserved: UShort = 0u,
    public var type: PROCESS_MEMORY_EXHAUSTION_TYPE = 0,
    public var value: Long = 0L,
)

public data class PROCESS_POWER_THROTTLING_STATE(
    public var version: UInt = 0u,
    public var controlMask: UInt = 0u,
    public var stateMask: UInt = 0u,
)

public data class PROCESS_PROTECTION_LEVEL_INFORMATION(
    public var protectionLevel: PROCESS_PROTECTION_LEVEL = 0u,
)

public data class PROCESS_DYNAMIC_EH_CONTINUATION_TARGET(
    public var targetAddress: Long = 0L,
    public var flags: Long = 0L,
)

public class PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION(
    public var numberOfTargets: UShort = 0u,
    public var reserved: UShort = 0u,
    public var reserved2: UInt = 0u,
    public var targets: Long = 0L,
)

public data class PROCESS_DYNAMIC_ENFORCED_ADDRESS_RANGE(
    public var baseAddress: Long = 0L,
    public var size: Long = 0L,
    public var flags: UInt = 0u,
)

public class PROCESS_DYNAMIC_ENFORCED_ADDRESS_RANGES_INFORMATION(
    public var numberOfRanges: UShort = 0u,
    public var reserved: UShort = 0u,
    public var reserved2: UInt = 0u,
    public var ranges: Long = 0L,
)

public data class THREAD_POWER_THROTTLING_STATE(
    public var version: UInt = 0u,
    public var controlMask: UInt = 0u,
    public var stateMask: UInt = 0u,
)

public class SRWLOCK(
    public var ptr: Long = 0L,
) {
    public companion object {
        public val INIT: SRWLOCK = SRWLOCK()
    }
}

public class SYNCHRONIZATION_BARRIER(
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var reserved3: LongArray = LongArray(2),
    public var reserved4: UInt = 0u,
    public var reserved5: UInt = 0u,
)

public data class TP_POOL_STACK_INFORMATION(
    public var stackReserve: Long = 0L,
    public var stackCommit: Long = 0L,
)

// STARTUPINFOA — upstream lines 1002-1021
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

public class STARTUPINFOEXA(
    public var startupInfo: STARTUPINFOA = STARTUPINFOA(),
    public var lpAttributeList: LPPROC_THREAD_ATTRIBUTE_LIST = 0L,
)

// STARTUPINFOW — upstream lines 1051-1070
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

public class STARTUPINFOEXW(
    public var startupInfo: STARTUPINFOW = STARTUPINFOW(),
    public var lpAttributeList: LPPROC_THREAD_ATTRIBUTE_LIST = 0L,
)

// REASON_CONTEXT — upstream lines 913-946
public class REASON_CONTEXT_0_0(
    public var localizedReasonModule: HMODULE = 0L,
    public var localizedReasonId: UInt = 0u,
    public var reasonStringCount: UInt = 0u,
    public var reasonStrings: Long = 0L,
)

public class REASON_CONTEXT_0(
    public var detailed: REASON_CONTEXT_0_0 = REASON_CONTEXT_0_0(),
    public var simpleReasonString: PWSTR = 0L,
)

public class REASON_CONTEXT(
    public var version: UInt = 0u,
    public var flags: POWER_REQUEST_CONTEXT_FLAGS = 0u,
    public var reason: REASON_CONTEXT_0 = REASON_CONTEXT_0(),
)

// TP_CALLBACK_ENVIRON_V3 — upstream lines 1172-1204
public data class TP_CALLBACK_ENVIRON_V3_0_0(
    public var bitfield: UInt = 0u,
)

public class TP_CALLBACK_ENVIRON_V3_0(
    public var flags: UInt = 0u,
    public var s: TP_CALLBACK_ENVIRON_V3_0_0 = TP_CALLBACK_ENVIRON_V3_0_0(),
)

public class TP_CALLBACK_ENVIRON_V3(
    public var version: UInt = 0u,
    public var pool: PTP_POOL = 0L,
    public var cleanupGroup: PTP_CLEANUP_GROUP = 0L,
    public var cleanupGroupCancelCallback: PTP_CLEANUP_GROUP_CANCEL_CALLBACK = null,
    public var raceDll: Long = 0L,
    public var activationContext: Long = 0L,
    public var finalizationCallback: PTP_SIMPLE_CALLBACK = null,
    public var u: TP_CALLBACK_ENVIRON_V3_0 = TP_CALLBACK_ENVIRON_V3_0(),
    public var callbackPriority: TP_CALLBACK_PRIORITY = 0,
    public var size: UInt = 0u,
)

// UMS structs — upstream lines 1225-1262
public class UMS_SCHEDULER_STARTUP_INFO(
    public var umsVersion: UInt = 0u,
    public var completionList: Long = 0L,
    public var schedulerProc: Long = 0L,
    public var schedulerParam: Long = 0L,
)

public class UMS_SYSTEM_THREAD_INFORMATION_0_0(
    public var bitfield: UInt = 0u,
)

public class UMS_SYSTEM_THREAD_INFORMATION_0(
    public var anonymous: UMS_SYSTEM_THREAD_INFORMATION_0_0 = UMS_SYSTEM_THREAD_INFORMATION_0_0(),
    public var threadUmsFlags: UInt = 0u,
)

public class UMS_SYSTEM_THREAD_INFORMATION(
    public var umsVersion: UInt = 0u,
    public var anonymous: UMS_SYSTEM_THREAD_INFORMATION_0 = UMS_SYSTEM_THREAD_INFORMATION_0(),
)
