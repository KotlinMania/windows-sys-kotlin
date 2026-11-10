@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.Context
import io.github.kotlinmania.windowssys.windows.win32.system.memory.MemoryBasicInformation

public data class PssAllocator(
    public var context: COpaquePointer? = null,
    public var allocRoutine: Int = 0,
    public var freeRoutine: Int = 0,
)

public data class PssAuxiliaryPagesInformation(
    public var auxPagesCaptured: UInt = 0u,
)

public data class PssAuxiliaryPageEntry(
    public var address: COpaquePointer? = null,
    public var basicInformation: MemoryBasicInformation = MemoryBasicInformation(),
    public var captureTime: Filetime = Filetime(),
    public var pageContents: COpaquePointer? = null,
    public var pageSize: UInt = 0u,
)

public data class PssHandleEntry(
    public var handle: Handle = null,
    public var flags: PssHandleFlags = 0,
    public var objectType: PssObjectType = 0,
    public var captureTime: Filetime = Filetime(),
    public var attributes: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pointerCount: UInt = 0u,
    public var pagedPoolCharge: UInt = 0u,
    public var nonPagedPoolCharge: UInt = 0u,
    public var creationTime: Filetime = Filetime(),
    public var typeNameLength: UShort = 0u,
    public var typeName: Pcwstr = null,
    public var objectNameLength: UShort = 0u,
    public var objectName: Pcwstr = null,
    public var typeSpecificInformation: PssHandleEntry0 = PssHandleEntry0(),
)

public data class PssHandleEntry0(
    public var process: PssHandleEntry00 = PssHandleEntry00(),
    public var thread: PssHandleEntry01 = PssHandleEntry01(),
    public var mutant: PssHandleEntry02 = PssHandleEntry02(),
    public var event: PssHandleEntry03 = PssHandleEntry03(),
    public var section: PssHandleEntry04 = PssHandleEntry04(),
    public var semaphore: PssHandleEntry05 = PssHandleEntry05(),
)

public data class PssHandleEntry03(
    public var manualReset: Bool = 0,
    public var signaled: Bool = 0,
)

public data class PssHandleEntry02(
    public var currentCount: Int = 0,
    public var abandoned: Bool = 0,
    public var ownerProcessId: UInt = 0u,
    public var ownerThreadId: UInt = 0u,
)

public data class PssHandleEntry00(
    public var exitStatus: UInt = 0u,
    public var pebBaseAddress: COpaquePointer? = null,
    public var affinityMask: Int = 0,
    public var basePriority: Int = 0,
    public var processId: UInt = 0u,
    public var parentProcessId: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class PssHandleEntry04(
    public var baseAddress: COpaquePointer? = null,
    public var allocationAttributes: UInt = 0u,
    public var maximumSize: Long = 0L,
)

public data class PssHandleEntry05(
    public var currentCount: Int = 0,
    public var maximumCount: Int = 0,
)

public data class PssHandleEntry01(
    public var exitStatus: UInt = 0u,
    public var tebBaseAddress: COpaquePointer? = null,
    public var processId: UInt = 0u,
    public var threadId: UInt = 0u,
    public var affinityMask: Int = 0,
    public var priority: Int = 0,
    public var basePriority: Int = 0,
    public var win32StartAddress: COpaquePointer? = null,
)

public data class PssHandleInformation(
    public var handlesCaptured: UInt = 0u,
)

public data class PssHandleTraceInformation(
    public var sectionHandle: Handle = null,
    public var size: UInt = 0u,
)

public data class PssPerformanceCounters(
    public var totalCycleCount: ULong = 0uL,
    public var totalWallClockPeriod: ULong = 0uL,
    public var vaCloneCycleCount: ULong = 0uL,
    public var vaCloneWallClockPeriod: ULong = 0uL,
    public var vaSpaceCycleCount: ULong = 0uL,
    public var vaSpaceWallClockPeriod: ULong = 0uL,
    public var auxPagesCycleCount: ULong = 0uL,
    public var auxPagesWallClockPeriod: ULong = 0uL,
    public var handlesCycleCount: ULong = 0uL,
    public var handlesWallClockPeriod: ULong = 0uL,
    public var threadsCycleCount: ULong = 0uL,
    public var threadsWallClockPeriod: ULong = 0uL,
)

public class PssProcessInformation(
    public var exitStatus: UInt = 0u,
    public var pebBaseAddress: COpaquePointer? = null,
    public var affinityMask: Int = 0,
    public var basePriority: Int = 0,
    public var processId: UInt = 0u,
    public var parentProcessId: UInt = 0u,
    public var flags: PssProcessFlags = 0,
    public var createTime: Filetime = Filetime(),
    public var exitTime: Filetime = Filetime(),
    public var kernelTime: Filetime = Filetime(),
    public var userTime: Filetime = Filetime(),
    public var priorityClass: UInt = 0u,
    public var peakVirtualSize: Int = 0,
    public var virtualSize: Int = 0,
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
    public var executeFlags: UInt = 0u,
    public var imageFileName: UShortArray = UShortArray(260),
)

public class PssThreadEntry(
    public var exitStatus: UInt = 0u,
    public var tebBaseAddress: COpaquePointer? = null,
    public var processId: UInt = 0u,
    public var threadId: UInt = 0u,
    public var affinityMask: Int = 0,
    public var priority: Int = 0,
    public var basePriority: Int = 0,
    public var lastSyscallFirstArgument: COpaquePointer? = null,
    public var lastSyscallNumber: UShort = 0u,
    public var createTime: Filetime = Filetime(),
    public var exitTime: Filetime = Filetime(),
    public var kernelTime: Filetime = Filetime(),
    public var userTime: Filetime = Filetime(),
    public var win32StartAddress: COpaquePointer? = null,
    public var captureTime: Filetime = Filetime(),
    public var flags: PssThreadFlags = 0,
    public var suspendCount: UShort = 0u,
    public var sizeOfContextRecord: UShort = 0u,
    public var contextRecord: Context? = null,
)

public data class PssThreadInformation(
    public var threadsCaptured: UInt = 0u,
    public var contextLength: UInt = 0u,
)

public data class PssVaCloneInformation(
    public var vaCloneHandle: Handle = null,
)

public data class PssVaSpaceEntry(
    public var baseAddress: COpaquePointer? = null,
    public var allocationBase: COpaquePointer? = null,
    public var allocationProtect: UInt = 0u,
    public var regionSize: Int = 0,
    public var state: UInt = 0u,
    public var protect: UInt = 0u,
    public var type: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var sizeOfImage: UInt = 0u,
    public var imageBase: COpaquePointer? = null,
    public var checkSum: UInt = 0u,
    public var mappedFileNameLength: UShort = 0u,
    public var mappedFileName: Pcwstr = null,
)

public data class PssVaSpaceInformation(
    public var regionCount: UInt = 0u,
)
