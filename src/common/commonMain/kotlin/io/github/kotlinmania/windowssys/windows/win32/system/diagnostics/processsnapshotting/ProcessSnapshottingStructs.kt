@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.memory.MEMORY_BASIC_INFORMATION

public data class PSS_ALLOCATOR(
    public var Context: Long = 0L,
    public var AllocRoutine: Long = 0L,
    public var FreeRoutine: Long = 0L,
)

public data class PSS_AUXILIARY_PAGES_INFORMATION(public var AuxPagesCaptured: UInt = 0u)

public data class PSS_AUXILIARY_PAGE_ENTRY(
    public var Address: Long = 0L,
    public var BasicInformation: MEMORY_BASIC_INFORMATION = MEMORY_BASIC_INFORMATION(),
    public var CaptureTime: FILETIME = FILETIME(),
    public var PageContents: Long = 0L,
    public var PageSize: UInt = 0u,
)

public data class PSS_HANDLE_ENTRY(
    public var Handle: HANDLE = 0L,
    public var Flags: PSS_HANDLE_FLAGS = 0,
    public var ObjectType: PSS_OBJECT_TYPE = 0,
    public var CaptureTime: FILETIME = FILETIME(),
    public var Attributes: UInt = 0u,
    public var GrantedAccess: UInt = 0u,
    public var HandleCount: UInt = 0u,
    public var PointerCount: UInt = 0u,
    public var PagedPoolCharge: UInt = 0u,
    public var NonPagedPoolCharge: UInt = 0u,
    public var CreationTime: FILETIME = FILETIME(),
    public var TypeNameLength: UShort = 0u,
    public var TypeName: PCWSTR = 0L,
    public var ObjectNameLength: UShort = 0u,
    public var ObjectName: PCWSTR = 0L,
    public var TypeSpecificInformation: PSS_HANDLE_ENTRY_0 = PSS_HANDLE_ENTRY_0(),
)

public data class PSS_HANDLE_ENTRY_0(
    public var Process: PSS_HANDLE_ENTRY_0_0 = PSS_HANDLE_ENTRY_0_0(),
    public var Thread: PSS_HANDLE_ENTRY_0_1 = PSS_HANDLE_ENTRY_0_1(),
    public var Mutant: PSS_HANDLE_ENTRY_0_2 = PSS_HANDLE_ENTRY_0_2(),
    public var Event: PSS_HANDLE_ENTRY_0_3 = PSS_HANDLE_ENTRY_0_3(),
    public var Section: PSS_HANDLE_ENTRY_0_4 = PSS_HANDLE_ENTRY_0_4(),
    public var Semaphore: PSS_HANDLE_ENTRY_0_5 = PSS_HANDLE_ENTRY_0_5(),
)

public data class PSS_HANDLE_ENTRY_0_3(public var ManualReset: BOOL = 0, public var Signaled: BOOL = 0)

public data class PSS_HANDLE_ENTRY_0_2(
    public var CurrentCount: Int = 0,
    public var Abandoned: BOOL = 0,
    public var OwnerProcessId: UInt = 0u,
    public var OwnerThreadId: UInt = 0u,
)

public data class PSS_HANDLE_ENTRY_0_0(
    public var ExitStatus: UInt = 0u,
    public var PebBaseAddress: Long = 0L,
    public var AffinityMask: ULong = 0uL,
    public var BasePriority: Int = 0,
    public var ProcessId: UInt = 0u,
    public var ParentProcessId: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class PSS_HANDLE_ENTRY_0_4(
    public var BaseAddress: Long = 0L,
    public var AllocationAttributes: UInt = 0u,
    public var MaximumSize: Long = 0L,
)

public data class PSS_HANDLE_ENTRY_0_5(public var CurrentCount: Int = 0, public var MaximumCount: Int = 0)

public data class PSS_HANDLE_ENTRY_0_1(
    public var ExitStatus: UInt = 0u,
    public var TebBaseAddress: Long = 0L,
    public var ProcessId: UInt = 0u,
    public var ThreadId: UInt = 0u,
    public var AffinityMask: ULong = 0uL,
    public var Priority: Int = 0,
    public var BasePriority: Int = 0,
    public var Win32StartAddress: Long = 0L,
)

public data class PSS_HANDLE_INFORMATION(public var HandlesCaptured: UInt = 0u)

public data class PSS_HANDLE_TRACE_INFORMATION(public var SectionHandle: HANDLE = 0L, public var Size: UInt = 0u)

public data class PSS_PERFORMANCE_COUNTERS(
    public var TotalCycleCount: ULong = 0uL,
    public var TotalWallClockPeriod: ULong = 0uL,
    public var VaCloneCycleCount: ULong = 0uL,
    public var VaCloneWallClockPeriod: ULong = 0uL,
    public var VaSpaceCycleCount: ULong = 0uL,
    public var VaSpaceWallClockPeriod: ULong = 0uL,
    public var AuxPagesCycleCount: ULong = 0uL,
    public var AuxPagesWallClockPeriod: ULong = 0uL,
    public var HandlesCycleCount: ULong = 0uL,
    public var HandlesWallClockPeriod: ULong = 0uL,
    public var ThreadsCycleCount: ULong = 0uL,
    public var ThreadsWallClockPeriod: ULong = 0uL,
)

public class PSS_PROCESS_INFORMATION(
    public var ExitStatus: UInt = 0u,
    public var PebBaseAddress: Long = 0L,
    public var AffinityMask: ULong = 0uL,
    public var BasePriority: Int = 0,
    public var ProcessId: UInt = 0u,
    public var ParentProcessId: UInt = 0u,
    public var Flags: PSS_PROCESS_FLAGS = 0,
    public var CreateTime: FILETIME = FILETIME(),
    public var ExitTime: FILETIME = FILETIME(),
    public var KernelTime: FILETIME = FILETIME(),
    public var UserTime: FILETIME = FILETIME(),
    public var PriorityClass: UInt = 0u,
    public var PeakVirtualSize: ULong = 0uL,
    public var VirtualSize: ULong = 0uL,
    public var PageFaultCount: UInt = 0u,
    public var PeakWorkingSetSize: ULong = 0uL,
    public var WorkingSetSize: ULong = 0uL,
    public var QuotaPeakPagedPoolUsage: ULong = 0uL,
    public var QuotaPagedPoolUsage: ULong = 0uL,
    public var QuotaPeakNonPagedPoolUsage: ULong = 0uL,
    public var QuotaNonPagedPoolUsage: ULong = 0uL,
    public var PagefileUsage: ULong = 0uL,
    public var PeakPagefileUsage: ULong = 0uL,
    public var PrivateUsage: ULong = 0uL,
    public var ExecuteFlags: UInt = 0u,
    public var ImageFileName: UShortArray = UShortArray(260),
)

public class PSS_THREAD_ENTRY(
    public var ExitStatus: UInt = 0u,
    public var TebBaseAddress: Long = 0L,
    public var ProcessId: UInt = 0u,
    public var ThreadId: UInt = 0u,
    public var AffinityMask: ULong = 0uL,
    public var Priority: Int = 0,
    public var BasePriority: Int = 0,
    public var LastSyscallFirstArgument: Long = 0L,
    public var LastSyscallNumber: UShort = 0u,
    public var CreateTime: FILETIME = FILETIME(),
    public var ExitTime: FILETIME = FILETIME(),
    public var KernelTime: FILETIME = FILETIME(),
    public var UserTime: FILETIME = FILETIME(),
    public var Win32StartAddress: Long = 0L,
    public var CaptureTime: FILETIME = FILETIME(),
    public var Flags: PSS_THREAD_FLAGS = 0,
    public var SuspendCount: UShort = 0u,
    public var SizeOfContextRecord: UShort = 0u,
    public var ContextRecord: Long = 0L,
)

public data class PSS_THREAD_INFORMATION(public var ThreadsCaptured: UInt = 0u, public var ContextLength: UInt = 0u)

public data class PSS_VA_CLONE_INFORMATION(public var VaCloneHandle: HANDLE = 0L)

public data class PSS_VA_SPACE_ENTRY(
    public var BaseAddress: Long = 0L,
    public var AllocationBase: Long = 0L,
    public var AllocationProtect: UInt = 0u,
    public var RegionSize: ULong = 0uL,
    public var State: UInt = 0u,
    public var Protect: UInt = 0u,
    public var Type: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var SizeOfImage: UInt = 0u,
    public var ImageBase: Long = 0L,
    public var CheckSum: UInt = 0u,
    public var MappedFileNameLength: UShort = 0u,
    public var MappedFileName: PCWSTR = 0L,
)

public data class PSS_VA_SPACE_INFORMATION(public var RegionCount: UInt = 0u)
