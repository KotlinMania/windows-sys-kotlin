package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.COpaquePointer

public data class EnumPageFileInformation(
    public var cb: UInt = 0u,
    public var reserved: UInt = 0u,
    public var totalSize: Int = 0,
    public var totalInUse: Int = 0,
    public var peakUsage: Int = 0,
)

public data class Moduleinfo(
    public var lpBaseOfDll: COpaquePointer? = null,
    public var sizeOfImage: UInt = 0u,
    public var entryPoint: COpaquePointer? = null,
)

public data class PerformanceInformation(
    public var cb: UInt = 0u,
    public var commitTotal: Int = 0,
    public var commitLimit: Int = 0,
    public var commitPeak: Int = 0,
    public var physicalTotal: Int = 0,
    public var physicalAvailable: Int = 0,
    public var systemCache: Int = 0,
    public var kernelTotal: Int = 0,
    public var kernelPaged: Int = 0,
    public var kernelNonpaged: Int = 0,
    public var pageSize: Int = 0,
    public var handleCount: UInt = 0u,
    public var processCount: UInt = 0u,
    public var threadCount: UInt = 0u,
)

public data class ProcessMemoryCounters(
    public var cb: UInt = 0u,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: Int = 0,
    public var workingSetSize: Int = 0,
    public var quotaPeakPagedPoolUsage: Int = 0,
    public var quotaPagedPoolUsage: Int = 0,
    public var quotaPeakNonPagedPoolUsage: Int = 0,
    public var quotaNonPagedPoolUsage: Int = 0,
    public var pagefileUsage: Int = 0,
    public var peakPagefileUsage: Int = 0,
)

public data class ProcessMemoryCountersEx(
    public var cb: UInt = 0u,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: Int = 0,
    public var workingSetSize: Int = 0,
    public var quotaPeakPagedPoolUsage: Int = 0,
    public var quotaPagedPoolUsage: Int = 0,
    public var quotaPeakNonPagedPoolUsage: Int = 0,
    public var quotaNonPagedPoolUsage: Int = 0,
    public var pagefileUsage: Int = 0,
    public var peakPagefileUsage: Int = 0,
    public var privateUsage: Int = 0,
)

public data class ProcessMemoryCountersEx2(
    public var cb: UInt = 0u,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: Int = 0,
    public var workingSetSize: Int = 0,
    public var quotaPeakPagedPoolUsage: Int = 0,
    public var quotaPagedPoolUsage: Int = 0,
    public var quotaPeakNonPagedPoolUsage: Int = 0,
    public var quotaNonPagedPoolUsage: Int = 0,
    public var pagefileUsage: Int = 0,
    public var peakPagefileUsage: Int = 0,
    public var privateUsage: Int = 0,
    public var privateWorkingSetSize: Int = 0,
    public var sharedCommitUsage: ULong = 0uL,
)

public data class PsapiWorkingSetBlock(public var flags: Int = 0, public var anonymous: PsapiWorkingSetBlock0 = PsapiWorkingSetBlock0())

public data class PsapiWorkingSetBlock0(public var bitfield: Int = 0)

public data class PsapiWorkingSetExBlock(public var flags: Int = 0, public var anonymous: PsapiWorkingSetExBlock0 = PsapiWorkingSetExBlock0())

public data class PsapiWorkingSetExBlock0(public var anonymous: PsapiWorkingSetExBlock00 = PsapiWorkingSetExBlock00(), public var invalid: PsapiWorkingSetExBlock01 = PsapiWorkingSetExBlock01())

public data class PsapiWorkingSetExBlock00(public var bitfield: Int = 0)

public data class PsapiWorkingSetExBlock01(public var bitfield: Int = 0)

public data class PsapiWorkingSetExInformation(public var virtualAddress: COpaquePointer? = null, public var virtualAttributes: PsapiWorkingSetExBlock = PsapiWorkingSetExBlock())

public data class PsapiWorkingSetInformation(public var numberOfEntries: Int = 0, public var workingSetInfo: List<PsapiWorkingSetBlock> = List(1) { PsapiWorkingSetBlock() })

public data class PsapiWsWatchInformation(public var faultingPc: COpaquePointer? = null, public var faultingVa: COpaquePointer? = null)

public data class PsapiWsWatchInformationEx(
    public var basicInfo: PsapiWsWatchInformation = PsapiWsWatchInformation(),
    public var faultingThreadId: Int = 0,
    public var flags: Int = 0,
)
