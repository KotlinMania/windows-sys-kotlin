package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

public data class ENUM_PAGE_FILE_INFORMATION(
    public var cb: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var TotalSize: ULong = 0uL,
    public var TotalInUse: ULong = 0uL,
    public var PeakUsage: ULong = 0uL,
)

public data class MODULEINFO(
    public var lpBaseOfDll: Long = 0L,
    public var SizeOfImage: UInt = 0u,
    public var EntryPoint: Long = 0L,
)

public data class PERFORMANCE_INFORMATION(
    public var cb: UInt = 0u,
    public var CommitTotal: ULong = 0uL,
    public var CommitLimit: ULong = 0uL,
    public var CommitPeak: ULong = 0uL,
    public var PhysicalTotal: ULong = 0uL,
    public var PhysicalAvailable: ULong = 0uL,
    public var SystemCache: ULong = 0uL,
    public var KernelTotal: ULong = 0uL,
    public var KernelPaged: ULong = 0uL,
    public var KernelNonpaged: ULong = 0uL,
    public var PageSize: ULong = 0uL,
    public var HandleCount: UInt = 0u,
    public var ProcessCount: UInt = 0u,
    public var ThreadCount: UInt = 0u,
)

public data class PROCESS_MEMORY_COUNTERS(
    public var cb: UInt = 0u,
    public var PageFaultCount: UInt = 0u,
    public var PeakWorkingSetSize: ULong = 0uL,
    public var WorkingSetSize: ULong = 0uL,
    public var QuotaPeakPagedPoolUsage: ULong = 0uL,
    public var QuotaPagedPoolUsage: ULong = 0uL,
    public var QuotaPeakNonPagedPoolUsage: ULong = 0uL,
    public var QuotaNonPagedPoolUsage: ULong = 0uL,
    public var PagefileUsage: ULong = 0uL,
    public var PeakPagefileUsage: ULong = 0uL,
)

public data class PROCESS_MEMORY_COUNTERS_EX(
    public var cb: UInt = 0u,
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
)

public data class PROCESS_MEMORY_COUNTERS_EX2(
    public var cb: UInt = 0u,
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
    public var PrivateWorkingSetSize: ULong = 0uL,
    public var SharedCommitUsage: ULong = 0uL,
)

public data class PSAPI_WORKING_SET_BLOCK(public var Flags: ULong = 0uL, public var Anonymous: PSAPI_WORKING_SET_BLOCK_0 = PSAPI_WORKING_SET_BLOCK_0())

public data class PSAPI_WORKING_SET_BLOCK_0(public var _bitfield: ULong = 0uL)

public data class PSAPI_WORKING_SET_EX_BLOCK(public var Flags: ULong = 0uL, public var Anonymous: PSAPI_WORKING_SET_EX_BLOCK_0 = PSAPI_WORKING_SET_EX_BLOCK_0())

public data class PSAPI_WORKING_SET_EX_BLOCK_0(public var Anonymous: PSAPI_WORKING_SET_EX_BLOCK_0_0 = PSAPI_WORKING_SET_EX_BLOCK_0_0(), public var Invalid: PSAPI_WORKING_SET_EX_BLOCK_0_1 = PSAPI_WORKING_SET_EX_BLOCK_0_1())

public data class PSAPI_WORKING_SET_EX_BLOCK_0_0(public var _bitfield: ULong = 0uL)

public data class PSAPI_WORKING_SET_EX_BLOCK_0_1(public var _bitfield: ULong = 0uL)

public data class PSAPI_WORKING_SET_EX_INFORMATION(public var VirtualAddress: Long = 0L, public var VirtualAttributes: PSAPI_WORKING_SET_EX_BLOCK = PSAPI_WORKING_SET_EX_BLOCK())

public data class PSAPI_WORKING_SET_INFORMATION(public var NumberOfEntries: ULong = 0uL, public var WorkingSetInfo: List<PSAPI_WORKING_SET_BLOCK> = List(1) { PSAPI_WORKING_SET_BLOCK() })

public data class PSAPI_WS_WATCH_INFORMATION(public var FaultingPc: Long = 0L, public var FaultingVa: Long = 0L)

public data class PSAPI_WS_WATCH_INFORMATION_EX(
    public var BasicInfo: PSAPI_WS_WATCH_INFORMATION = PSAPI_WS_WATCH_INFORMATION(),
    public var FaultingThreadId: ULong = 0uL,
    public var Flags: ULong = 0uL,
)
