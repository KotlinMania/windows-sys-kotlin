@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppMemoryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppMemoryInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): AppMemoryInformation =
                    AppMemoryInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: AppMemoryInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.availableCommit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.privateCommitUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.peakPrivateCommitUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.totalCommitUsage)
                }
            }
    }
}

public class ConditionVariable internal constructor(
    ptrCtorArg: MutPtr<CVoid>,
) {
    public var ptr: MutPtr<CVoid> = ptrCtorArg
        internal set

    public constructor() : this(
        ptrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.ptr

    public fun copy(ptr: MutPtr<CVoid> = this.ptr): ConditionVariable = ConditionVariable(ptrCtorArg = ptr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConditionVariable) return false
        if (this.ptr != other.ptr) return false
        return true
    }

    override fun hashCode(): Int = this.ptr.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConditionVariable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConditionVariable> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ConditionVariable =
                    ConditionVariable(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ConditionVariable) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ptr)
                }
            }

        public operator fun invoke(
            ptr: MutPtr<CVoid> = MutPtr(0L),
        ): ConditionVariable =
            ConditionVariable(
                ptrCtorArg = ptr,
            )
    }
}

public class CriticalSection internal constructor(
    debugInfoCtorArg: MutPtr<CriticalSectionDebug>,
    public var lockCount: Int,
    public var recursionCount: Int,
    owningThreadCtorArg: Handle,
    lockSemaphoreCtorArg: Handle,
    public var spinCount: Int,
) {
    public var debugInfo: MutPtr<CriticalSectionDebug> = debugInfoCtorArg
        internal set

    public var owningThread: Handle = owningThreadCtorArg
        internal set

    public var lockSemaphore: Handle = lockSemaphoreCtorArg
        internal set

    public constructor() : this(
        debugInfoCtorArg = MutPtr(0L),
        lockCount = 0,
        recursionCount = 0,
        owningThreadCtorArg = MutPtr(0L),
        lockSemaphoreCtorArg = MutPtr(0L),
        spinCount = 0,
    )

    public operator fun component1(): MutPtr<CriticalSectionDebug> = this.debugInfo

    public operator fun component2(): Int = this.lockCount

    public operator fun component3(): Int = this.recursionCount

    public operator fun component4(): Handle = this.owningThread

    public operator fun component5(): Handle = this.lockSemaphore

    public operator fun component6(): Int = this.spinCount

    public fun copy(debugInfo: MutPtr<CriticalSectionDebug> = this.debugInfo, lockCount: Int = this.lockCount, recursionCount: Int = this.recursionCount, owningThread: Handle = this.owningThread, lockSemaphore: Handle = this.lockSemaphore, spinCount: Int = this.spinCount): CriticalSection = CriticalSection(debugInfoCtorArg = debugInfo, lockCount = lockCount, recursionCount = recursionCount, owningThreadCtorArg = owningThread, lockSemaphoreCtorArg = lockSemaphore, spinCount = spinCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CriticalSection) return false
        if (this.debugInfo != other.debugInfo) return false
        if (this.lockCount != other.lockCount) return false
        if (this.recursionCount != other.recursionCount) return false
        if (this.owningThread != other.owningThread) return false
        if (this.lockSemaphore != other.lockSemaphore) return false
        if (this.spinCount != other.spinCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.debugInfo.hashCode()
        result = 31 * result + this.lockCount.hashCode()
        result = 31 * result + this.recursionCount.hashCode()
        result = 31 * result + this.owningThread.hashCode()
        result = 31 * result + this.lockSemaphore.hashCode()
        result = 31 * result + this.spinCount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            debugInfo: MutPtr<CriticalSectionDebug> = MutPtr(0L),
            lockCount: Int = 0,
            recursionCount: Int = 0,
            owningThread: Handle = MutPtr(0L),
            lockSemaphore: Handle = MutPtr(0L),
            spinCount: Int = 0,
        ): CriticalSection =
            CriticalSection(
                debugInfoCtorArg = debugInfo,
                lockCount = lockCount,
                recursionCount = recursionCount,
                owningThreadCtorArg = owningThread,
                lockSemaphoreCtorArg = lockSemaphore,
                spinCount = spinCount,
            )
    }
}

public class CriticalSectionDebug internal constructor(
    public var type: UShort,
    public var creatorBackTraceIndex: UShort,
    criticalSectionCtorArg: MutPtr<CriticalSection>,
    public var processLocksList: ListEntry,
    public var entryCount: UInt,
    public var contentionCount: UInt,
    public var flags: UInt,
    public var creatorBackTraceIndexHigh: UShort,
    public var identifier: UShort,
) {
    public var criticalSection: MutPtr<CriticalSection> = criticalSectionCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        creatorBackTraceIndex = 0u,
        criticalSectionCtorArg = MutPtr(0L),
        processLocksList = ListEntry(),
        entryCount = 0u,
        contentionCount = 0u,
        flags = 0u,
        creatorBackTraceIndexHigh = 0u,
        identifier = 0u,
    )

    public operator fun component1(): UShort = this.type

    public operator fun component2(): UShort = this.creatorBackTraceIndex

    public operator fun component3(): MutPtr<CriticalSection> = this.criticalSection

    public operator fun component4(): ListEntry = this.processLocksList

    public operator fun component5(): UInt = this.entryCount

    public operator fun component6(): UInt = this.contentionCount

    public operator fun component7(): UInt = this.flags

    public operator fun component8(): UShort = this.creatorBackTraceIndexHigh

    public operator fun component9(): UShort = this.identifier

    public fun copy(type: UShort = this.type, creatorBackTraceIndex: UShort = this.creatorBackTraceIndex, criticalSection: MutPtr<CriticalSection> = this.criticalSection, processLocksList: ListEntry = this.processLocksList, entryCount: UInt = this.entryCount, contentionCount: UInt = this.contentionCount, flags: UInt = this.flags, creatorBackTraceIndexHigh: UShort = this.creatorBackTraceIndexHigh, identifier: UShort = this.identifier): CriticalSectionDebug = CriticalSectionDebug(type = type, creatorBackTraceIndex = creatorBackTraceIndex, criticalSectionCtorArg = criticalSection, processLocksList = processLocksList, entryCount = entryCount, contentionCount = contentionCount, flags = flags, creatorBackTraceIndexHigh = creatorBackTraceIndexHigh, identifier = identifier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CriticalSectionDebug) return false
        if (this.type != other.type) return false
        if (this.creatorBackTraceIndex != other.creatorBackTraceIndex) return false
        if (this.criticalSection != other.criticalSection) return false
        if (this.processLocksList != other.processLocksList) return false
        if (this.entryCount != other.entryCount) return false
        if (this.contentionCount != other.contentionCount) return false
        if (this.flags != other.flags) return false
        if (this.creatorBackTraceIndexHigh != other.creatorBackTraceIndexHigh) return false
        if (this.identifier != other.identifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.creatorBackTraceIndex.hashCode()
        result = 31 * result + this.criticalSection.hashCode()
        result = 31 * result + this.processLocksList.hashCode()
        result = 31 * result + this.entryCount.hashCode()
        result = 31 * result + this.contentionCount.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.creatorBackTraceIndexHigh.hashCode()
        result = 31 * result + this.identifier.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: UShort = 0u,
            creatorBackTraceIndex: UShort = 0u,
            criticalSection: MutPtr<CriticalSection> = MutPtr(0L),
            processLocksList: ListEntry = ListEntry(),
            entryCount: UInt = 0u,
            contentionCount: UInt = 0u,
            flags: UInt = 0u,
            creatorBackTraceIndexHigh: UShort = 0u,
            identifier: UShort = 0u,
        ): CriticalSectionDebug =
            CriticalSectionDebug(
                type = type,
                creatorBackTraceIndex = creatorBackTraceIndex,
                criticalSectionCtorArg = criticalSection,
                processLocksList = processLocksList,
                entryCount = entryCount,
                contentionCount = contentionCount,
                flags = flags,
                creatorBackTraceIndexHigh = creatorBackTraceIndexHigh,
                identifier = identifier,
            )
    }
}

public class InitOnce internal constructor(
    ptrCtorArg: MutPtr<CVoid>,
) {
    public var ptr: MutPtr<CVoid> = ptrCtorArg
        internal set

    public constructor() : this(
        ptrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.ptr

    public fun copy(ptr: MutPtr<CVoid> = this.ptr): InitOnce = InitOnce(ptrCtorArg = ptr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InitOnce) return false
        if (this.ptr != other.ptr) return false
        return true
    }

    override fun hashCode(): Int = this.ptr.hashCode()

    public companion object {
        public operator fun invoke(
            ptr: MutPtr<CVoid> = MutPtr(0L),
        ): InitOnce =
            InitOnce(
                ptrCtorArg = ptr,
            )
    }
}

public data class IoCounters(
    public var readOperationCount: ULong = 0uL,
    public var writeOperationCount: ULong = 0uL,
    public var otherOperationCount: ULong = 0uL,
    public var readTransferCount: ULong = 0uL,
    public var writeTransferCount: ULong = 0uL,
    public var otherTransferCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoCounters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): IoCounters =
                    IoCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: IoCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.readOperationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.writeOperationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.otherOperationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.readTransferCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.writeTransferCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.otherTransferCount)
                }
            }
    }
}

public data class MemoryPriorityInformation(
    public var memoryPriority: MemoryPriority = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryPriorityInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryPriorityInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MemoryPriorityInformation =
                    MemoryPriorityInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MemoryPriorityInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.memoryPriority)
                }
            }
    }
}

public data class OverridePrefetchParameter(
    public var value: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OverridePrefetchParameter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OverridePrefetchParameter> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): OverridePrefetchParameter =
                    OverridePrefetchParameter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: OverridePrefetchParameter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.value)
                }
            }
    }
}

public class Peb internal constructor(
    public var reserved1: UByteArray,
    public var beingDebugged: UByte,
    public var reserved2: UByteArray,
    reserved3CtorArg: List<MutPtr<CVoid>>,
    ldrCtorArg: MutPtr<PebLdrData>,
    processParametersCtorArg: MutPtr<RtlUserProcessParameters>,
    reserved4CtorArg: List<MutPtr<CVoid>>,
    atlThunkSListPtrCtorArg: MutPtr<CVoid>,
    reserved5CtorArg: MutPtr<CVoid>,
    public var reserved6: UInt,
    reserved7CtorArg: MutPtr<CVoid>,
    public var reserved8: UInt,
    public var atlThunkSListPtr32: UInt,
    reserved9CtorArg: List<MutPtr<CVoid>>,
    public var reserved10: UByteArray,
    public var postProcessInitRoutine: PpsPostProcessInitRoutine,
    public var reserved11: UByteArray,
    reserved12CtorArg: List<MutPtr<CVoid>>,
    public var sessionId: UInt,
) {
    public var reserved3: List<MutPtr<CVoid>> = reserved3CtorArg
        internal set

    public var ldr: MutPtr<PebLdrData> = ldrCtorArg
        internal set

    public var processParameters: MutPtr<RtlUserProcessParameters> = processParametersCtorArg
        internal set

    public var reserved4: List<MutPtr<CVoid>> = reserved4CtorArg
        internal set

    public var atlThunkSListPtr: MutPtr<CVoid> = atlThunkSListPtrCtorArg
        internal set

    public var reserved5: MutPtr<CVoid> = reserved5CtorArg
        internal set

    public var reserved7: MutPtr<CVoid> = reserved7CtorArg
        internal set

    public var reserved9: List<MutPtr<CVoid>> = reserved9CtorArg
        internal set

    public var reserved12: List<MutPtr<CVoid>> = reserved12CtorArg
        internal set

    public constructor() : this(
        reserved1 = UByteArray(2),
        beingDebugged = 0u,
        reserved2 = UByteArray(1),
        reserved3CtorArg = List(2) { MutPtr(0L) },
        ldrCtorArg = MutPtr(0L),
        processParametersCtorArg = MutPtr(0L),
        reserved4CtorArg = List(3) { MutPtr(0L) },
        atlThunkSListPtrCtorArg = MutPtr(0L),
        reserved5CtorArg = MutPtr(0L),
        reserved6 = 0u,
        reserved7CtorArg = MutPtr(0L),
        reserved8 = 0u,
        atlThunkSListPtr32 = 0u,
        reserved9CtorArg = List(45) { MutPtr(0L) },
        reserved10 = UByteArray(96),
        postProcessInitRoutine = null,
        reserved11 = UByteArray(128),
        reserved12CtorArg = List(1) { MutPtr(0L) },
        sessionId = 0u,
    )

    public companion object {
        public operator fun invoke(
            reserved1: UByteArray = UByteArray(2),
            beingDebugged: UByte = 0u,
            reserved2: UByteArray = UByteArray(1),
            reserved3: List<MutPtr<CVoid>> = List(2) { MutPtr(0L) },
            ldr: MutPtr<PebLdrData> = MutPtr(0L),
            processParameters: MutPtr<RtlUserProcessParameters> = MutPtr(0L),
            reserved4: List<MutPtr<CVoid>> = List(3) { MutPtr(0L) },
            atlThunkSListPtr: MutPtr<CVoid> = MutPtr(0L),
            reserved5: MutPtr<CVoid> = MutPtr(0L),
            reserved6: UInt = 0u,
            reserved7: MutPtr<CVoid> = MutPtr(0L),
            reserved8: UInt = 0u,
            atlThunkSListPtr32: UInt = 0u,
            reserved9: List<MutPtr<CVoid>> = List(45) { MutPtr(0L) },
            reserved10: UByteArray = UByteArray(96),
            postProcessInitRoutine: PpsPostProcessInitRoutine = null,
            reserved11: UByteArray = UByteArray(128),
            reserved12: List<MutPtr<CVoid>> = List(1) { MutPtr(0L) },
            sessionId: UInt = 0u,
        ): Peb =
            Peb(
                reserved1 = reserved1,
                beingDebugged = beingDebugged,
                reserved2 = reserved2,
                reserved3CtorArg = reserved3,
                ldrCtorArg = ldr,
                processParametersCtorArg = processParameters,
                reserved4CtorArg = reserved4,
                atlThunkSListPtrCtorArg = atlThunkSListPtr,
                reserved5CtorArg = reserved5,
                reserved6 = reserved6,
                reserved7CtorArg = reserved7,
                reserved8 = reserved8,
                atlThunkSListPtr32 = atlThunkSListPtr32,
                reserved9CtorArg = reserved9,
                reserved10 = reserved10,
                postProcessInitRoutine = postProcessInitRoutine,
                reserved11 = reserved11,
                reserved12CtorArg = reserved12,
                sessionId = sessionId,
            )
    }
}

public class PebLdrData internal constructor(
    public var reserved1: UByteArray,
    reserved2CtorArg: List<MutPtr<CVoid>>,
    public var inMemoryOrderModuleList: ListEntry,
) {
    public var reserved2: List<MutPtr<CVoid>> = reserved2CtorArg
        internal set

    public constructor() : this(
        reserved1 = UByteArray(8),
        reserved2CtorArg = List(3) { MutPtr(0L) },
        inMemoryOrderModuleList = ListEntry(),
    )

    public operator fun component1(): UByteArray = this.reserved1

    public operator fun component2(): List<MutPtr<CVoid>> = this.reserved2

    public operator fun component3(): ListEntry = this.inMemoryOrderModuleList

    public fun copy(reserved1: UByteArray = this.reserved1, reserved2: List<MutPtr<CVoid>> = this.reserved2, inMemoryOrderModuleList: ListEntry = this.inMemoryOrderModuleList): PebLdrData = PebLdrData(reserved1 = reserved1, reserved2CtorArg = reserved2, inMemoryOrderModuleList = inMemoryOrderModuleList)

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

    public companion object {
        public operator fun invoke(
            reserved1: UByteArray = UByteArray(8),
            reserved2: List<MutPtr<CVoid>> = List(3) { MutPtr(0L) },
            inMemoryOrderModuleList: ListEntry = ListEntry(),
        ): PebLdrData =
            PebLdrData(
                reserved1 = reserved1,
                reserved2CtorArg = reserved2,
                inMemoryOrderModuleList = inMemoryOrderModuleList,
            )
    }
}

public class ProcessBasicInformation internal constructor(
    public var exitStatus: Ntstatus,
    pebBaseAddressCtorArg: MutPtr<Peb>,
    public var affinityMask: Int,
    public var basePriority: Int,
    public var uniqueProcessId: Int,
    public var inheritedFromUniqueProcessId: Int,
) {
    public var pebBaseAddress: MutPtr<Peb> = pebBaseAddressCtorArg
        internal set

    public constructor() : this(
        exitStatus = 0,
        pebBaseAddressCtorArg = MutPtr(0L),
        affinityMask = 0,
        basePriority = 0,
        uniqueProcessId = 0,
        inheritedFromUniqueProcessId = 0,
    )

    public operator fun component1(): Ntstatus = this.exitStatus

    public operator fun component2(): MutPtr<Peb> = this.pebBaseAddress

    public operator fun component3(): Int = this.affinityMask

    public operator fun component4(): Int = this.basePriority

    public operator fun component5(): Int = this.uniqueProcessId

    public operator fun component6(): Int = this.inheritedFromUniqueProcessId

    public fun copy(exitStatus: Ntstatus = this.exitStatus, pebBaseAddress: MutPtr<Peb> = this.pebBaseAddress, affinityMask: Int = this.affinityMask, basePriority: Int = this.basePriority, uniqueProcessId: Int = this.uniqueProcessId, inheritedFromUniqueProcessId: Int = this.inheritedFromUniqueProcessId): ProcessBasicInformation = ProcessBasicInformation(exitStatus = exitStatus, pebBaseAddressCtorArg = pebBaseAddress, affinityMask = affinityMask, basePriority = basePriority, uniqueProcessId = uniqueProcessId, inheritedFromUniqueProcessId = inheritedFromUniqueProcessId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessBasicInformation) return false
        if (this.exitStatus != other.exitStatus) return false
        if (this.pebBaseAddress != other.pebBaseAddress) return false
        if (this.affinityMask != other.affinityMask) return false
        if (this.basePriority != other.basePriority) return false
        if (this.uniqueProcessId != other.uniqueProcessId) return false
        if (this.inheritedFromUniqueProcessId != other.inheritedFromUniqueProcessId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exitStatus.hashCode()
        result = 31 * result + this.pebBaseAddress.hashCode()
        result = 31 * result + this.affinityMask.hashCode()
        result = 31 * result + this.basePriority.hashCode()
        result = 31 * result + this.uniqueProcessId.hashCode()
        result = 31 * result + this.inheritedFromUniqueProcessId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessBasicInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): ProcessBasicInformation =
                    ProcessBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Peb>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: ProcessBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.exitStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Peb>(64)
                    ).writeNative(addr + 8L, value.pebBaseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.affinityMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.basePriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.uniqueProcessId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.inheritedFromUniqueProcessId)
                }
            }

        public operator fun invoke(
            exitStatus: Ntstatus = 0,
            pebBaseAddress: MutPtr<Peb> = MutPtr(0L),
            affinityMask: Int = 0,
            basePriority: Int = 0,
            uniqueProcessId: Int = 0,
            inheritedFromUniqueProcessId: Int = 0,
        ): ProcessBasicInformation =
            ProcessBasicInformation(
                exitStatus = exitStatus,
                pebBaseAddressCtorArg = pebBaseAddress,
                affinityMask = affinityMask,
                basePriority = basePriority,
                uniqueProcessId = uniqueProcessId,
                inheritedFromUniqueProcessId = inheritedFromUniqueProcessId,
            )
    }
}

public data class ProcessDynamicEhContinuationTarget(
    public var targetAddress: Int = 0,
    public var flags: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDynamicEhContinuationTarget> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDynamicEhContinuationTarget> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ProcessDynamicEhContinuationTarget =
                    ProcessDynamicEhContinuationTarget(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ProcessDynamicEhContinuationTarget) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.targetAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public class ProcessDynamicEhContinuationTargetsInformation internal constructor(
    public var numberOfTargets: UShort,
    public var reserved: UShort,
    public var reserved2: UInt,
    targetsCtorArg: MutPtr<ProcessDynamicEhContinuationTarget>,
) {
    public var targets: MutPtr<ProcessDynamicEhContinuationTarget> = targetsCtorArg
        internal set

    public constructor() : this(
        numberOfTargets = 0u,
        reserved = 0u,
        reserved2 = 0u,
        targetsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.numberOfTargets

    public operator fun component2(): UShort = this.reserved

    public operator fun component3(): UInt = this.reserved2

    public operator fun component4(): MutPtr<ProcessDynamicEhContinuationTarget> = this.targets

    public fun copy(numberOfTargets: UShort = this.numberOfTargets, reserved: UShort = this.reserved, reserved2: UInt = this.reserved2, targets: MutPtr<ProcessDynamicEhContinuationTarget> = this.targets): ProcessDynamicEhContinuationTargetsInformation = ProcessDynamicEhContinuationTargetsInformation(numberOfTargets = numberOfTargets, reserved = reserved, reserved2 = reserved2, targetsCtorArg = targets)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessDynamicEhContinuationTargetsInformation) return false
        if (this.numberOfTargets != other.numberOfTargets) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.targets != other.targets) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfTargets.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.targets.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDynamicEhContinuationTargetsInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDynamicEhContinuationTargetsInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ProcessDynamicEhContinuationTargetsInformation =
                    ProcessDynamicEhContinuationTargetsInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ProcessDynamicEhContinuationTarget>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ProcessDynamicEhContinuationTargetsInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.numberOfTargets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ProcessDynamicEhContinuationTarget>(64)
                    ).writeNative(addr + 8L, value.targets)
                }
            }

        public operator fun invoke(
            numberOfTargets: UShort = 0u,
            reserved: UShort = 0u,
            reserved2: UInt = 0u,
            targets: MutPtr<ProcessDynamicEhContinuationTarget> = MutPtr(0L),
        ): ProcessDynamicEhContinuationTargetsInformation =
            ProcessDynamicEhContinuationTargetsInformation(
                numberOfTargets = numberOfTargets,
                reserved = reserved,
                reserved2 = reserved2,
                targetsCtorArg = targets,
            )
    }
}

public data class ProcessDynamicEnforcedAddressRange(
    public var baseAddress: Int = 0,
    public var size: Int = 0,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDynamicEnforcedAddressRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDynamicEnforcedAddressRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ProcessDynamicEnforcedAddressRange =
                    ProcessDynamicEnforcedAddressRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ProcessDynamicEnforcedAddressRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public class ProcessDynamicEnforcedAddressRangesInformation internal constructor(
    public var numberOfRanges: UShort,
    public var reserved: UShort,
    public var reserved2: UInt,
    rangesCtorArg: MutPtr<ProcessDynamicEnforcedAddressRange>,
) {
    public var ranges: MutPtr<ProcessDynamicEnforcedAddressRange> = rangesCtorArg
        internal set

    public constructor() : this(
        numberOfRanges = 0u,
        reserved = 0u,
        reserved2 = 0u,
        rangesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.numberOfRanges

    public operator fun component2(): UShort = this.reserved

    public operator fun component3(): UInt = this.reserved2

    public operator fun component4(): MutPtr<ProcessDynamicEnforcedAddressRange> = this.ranges

    public fun copy(numberOfRanges: UShort = this.numberOfRanges, reserved: UShort = this.reserved, reserved2: UInt = this.reserved2, ranges: MutPtr<ProcessDynamicEnforcedAddressRange> = this.ranges): ProcessDynamicEnforcedAddressRangesInformation = ProcessDynamicEnforcedAddressRangesInformation(numberOfRanges = numberOfRanges, reserved = reserved, reserved2 = reserved2, rangesCtorArg = ranges)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessDynamicEnforcedAddressRangesInformation) return false
        if (this.numberOfRanges != other.numberOfRanges) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.ranges != other.ranges) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfRanges.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.ranges.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDynamicEnforcedAddressRangesInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDynamicEnforcedAddressRangesInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ProcessDynamicEnforcedAddressRangesInformation =
                    ProcessDynamicEnforcedAddressRangesInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ProcessDynamicEnforcedAddressRange>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ProcessDynamicEnforcedAddressRangesInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.numberOfRanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ProcessDynamicEnforcedAddressRange>(64)
                    ).writeNative(addr + 8L, value.ranges)
                }
            }

        public operator fun invoke(
            numberOfRanges: UShort = 0u,
            reserved: UShort = 0u,
            reserved2: UInt = 0u,
            ranges: MutPtr<ProcessDynamicEnforcedAddressRange> = MutPtr(0L),
        ): ProcessDynamicEnforcedAddressRangesInformation =
            ProcessDynamicEnforcedAddressRangesInformation(
                numberOfRanges = numberOfRanges,
                reserved = reserved,
                reserved2 = reserved2,
                rangesCtorArg = ranges,
            )
    }
}

public class ProcessInformation internal constructor(
    hProcessCtorArg: Handle,
    hThreadCtorArg: Handle,
    public var dwProcessId: UInt,
    public var dwThreadId: UInt,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public var hThread: Handle = hThreadCtorArg
        internal set

    public constructor() : this(
        hProcessCtorArg = MutPtr(0L),
        hThreadCtorArg = MutPtr(0L),
        dwProcessId = 0u,
        dwThreadId = 0u,
    )

    public operator fun component1(): Handle = this.hProcess

    public operator fun component2(): Handle = this.hThread

    public operator fun component3(): UInt = this.dwProcessId

    public operator fun component4(): UInt = this.dwThreadId

    public fun copy(hProcess: Handle = this.hProcess, hThread: Handle = this.hThread, dwProcessId: UInt = this.dwProcessId, dwThreadId: UInt = this.dwThreadId): ProcessInformation = ProcessInformation(hProcessCtorArg = hProcess, hThreadCtorArg = hThread, dwProcessId = dwProcessId, dwThreadId = dwThreadId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessInformation) return false
        if (this.hProcess != other.hProcess) return false
        if (this.hThread != other.hThread) return false
        if (this.dwProcessId != other.dwProcessId) return false
        if (this.dwThreadId != other.dwThreadId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hProcess.hashCode()
        result = 31 * result + this.hThread.hashCode()
        result = 31 * result + this.dwProcessId.hashCode()
        result = 31 * result + this.dwThreadId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hProcess: Handle = MutPtr(0L),
            hThread: Handle = MutPtr(0L),
            dwProcessId: UInt = 0u,
            dwThreadId: UInt = 0u,
        ): ProcessInformation =
            ProcessInformation(
                hProcessCtorArg = hProcess,
                hThreadCtorArg = hThread,
                dwProcessId = dwProcessId,
                dwThreadId = dwThreadId,
            )
    }
}

public data class ProcessLeapSecondInfo(
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessLeapSecondInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessLeapSecondInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ProcessLeapSecondInfo =
                    ProcessLeapSecondInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ProcessLeapSecondInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class ProcessMachineInformation(
    public var processMachine: ImageFileMachine = 0u,
    public var res0: UShort = 0u,
    public var machineAttributes: MachineAttributes = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMachineInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMachineInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ProcessMachineInformation =
                    ProcessMachineInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ProcessMachineInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.processMachine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.res0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.machineAttributes)
                }
            }
    }
}

public data class ProcessMemoryExhaustionInfo(
    public var version: UShort = 0u,
    public var reserved: UShort = 0u,
    public var type: ProcessMemoryExhaustionType = 0,
    public var value: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMemoryExhaustionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMemoryExhaustionInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ProcessMemoryExhaustionInfo =
                    ProcessMemoryExhaustionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ProcessMemoryExhaustionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public data class ProcessPowerThrottlingState(
    public var version: UInt = 0u,
    public var controlMask: UInt = 0u,
    public var stateMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessPowerThrottlingState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessPowerThrottlingState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ProcessPowerThrottlingState =
                    ProcessPowerThrottlingState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ProcessPowerThrottlingState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.controlMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stateMask)
                }
            }
    }
}

public data class ProcessProtectionLevelInformation(
    public var protectionLevel: ProcessProtectionLevel = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessProtectionLevelInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessProtectionLevelInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessProtectionLevelInformation =
                    ProcessProtectionLevelInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessProtectionLevelInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.protectionLevel)
                }
            }
    }
}

public data class ReasonContext(
    public var version: UInt = 0u,
    public var flags: PowerRequestContextFlags = 0u,
    public var reason: ReasonContext0 = ReasonContext0(),
)

public class ReasonContext0 internal constructor(
    public var detailed: ReasonContext00,
    simpleReasonStringCtorArg: Pwstr,
) {
    public var simpleReasonString: Pwstr = simpleReasonStringCtorArg
        internal set

    public constructor() : this(
        detailed = ReasonContext00(),
        simpleReasonStringCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ReasonContext00 = this.detailed

    public operator fun component2(): Pwstr = this.simpleReasonString

    public fun copy(detailed: ReasonContext00 = this.detailed, simpleReasonString: Pwstr = this.simpleReasonString): ReasonContext0 = ReasonContext0(detailed = detailed, simpleReasonStringCtorArg = simpleReasonString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReasonContext0) return false
        if (this.detailed != other.detailed) return false
        if (this.simpleReasonString != other.simpleReasonString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.detailed.hashCode()
        result = 31 * result + this.simpleReasonString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            detailed: ReasonContext00 = ReasonContext00(),
            simpleReasonString: Pwstr = MutPtr(0L),
        ): ReasonContext0 =
            ReasonContext0(
                detailed = detailed,
                simpleReasonStringCtorArg = simpleReasonString,
            )
    }
}

public class ReasonContext00 internal constructor(
    localizedReasonModuleCtorArg: Hmodule,
    public var localizedReasonId: UInt,
    public var reasonStringCount: UInt,
    reasonStringsCtorArg: MutPtr<Pwstr>,
) {
    public var localizedReasonModule: Hmodule = localizedReasonModuleCtorArg
        internal set

    public var reasonStrings: MutPtr<Pwstr> = reasonStringsCtorArg
        internal set

    public constructor() : this(
        localizedReasonModuleCtorArg = MutPtr(0L),
        localizedReasonId = 0u,
        reasonStringCount = 0u,
        reasonStringsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hmodule = this.localizedReasonModule

    public operator fun component2(): UInt = this.localizedReasonId

    public operator fun component3(): UInt = this.reasonStringCount

    public operator fun component4(): MutPtr<Pwstr> = this.reasonStrings

    public fun copy(localizedReasonModule: Hmodule = this.localizedReasonModule, localizedReasonId: UInt = this.localizedReasonId, reasonStringCount: UInt = this.reasonStringCount, reasonStrings: MutPtr<Pwstr> = this.reasonStrings): ReasonContext00 = ReasonContext00(localizedReasonModuleCtorArg = localizedReasonModule, localizedReasonId = localizedReasonId, reasonStringCount = reasonStringCount, reasonStringsCtorArg = reasonStrings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReasonContext00) return false
        if (this.localizedReasonModule != other.localizedReasonModule) return false
        if (this.localizedReasonId != other.localizedReasonId) return false
        if (this.reasonStringCount != other.reasonStringCount) return false
        if (this.reasonStrings != other.reasonStrings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localizedReasonModule.hashCode()
        result = 31 * result + this.localizedReasonId.hashCode()
        result = 31 * result + this.reasonStringCount.hashCode()
        result = 31 * result + this.reasonStrings.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            localizedReasonModule: Hmodule = MutPtr(0L),
            localizedReasonId: UInt = 0u,
            reasonStringCount: UInt = 0u,
            reasonStrings: MutPtr<Pwstr> = MutPtr(0L),
        ): ReasonContext00 =
            ReasonContext00(
                localizedReasonModuleCtorArg = localizedReasonModule,
                localizedReasonId = localizedReasonId,
                reasonStringCount = reasonStringCount,
                reasonStringsCtorArg = reasonStrings,
            )
    }
}

public class RtlUserProcessParameters internal constructor(
    public var reserved1: UByteArray,
    reserved2CtorArg: List<MutPtr<CVoid>>,
    public var imagePathName: UnicodeString,
    public var commandLine: UnicodeString,
) {
    public var reserved2: List<MutPtr<CVoid>> = reserved2CtorArg
        internal set

    public constructor() : this(
        reserved1 = UByteArray(16),
        reserved2CtorArg = List(10) { MutPtr(0L) },
        imagePathName = UnicodeString(),
        commandLine = UnicodeString(),
    )

    public operator fun component1(): UByteArray = this.reserved1

    public operator fun component2(): List<MutPtr<CVoid>> = this.reserved2

    public operator fun component3(): UnicodeString = this.imagePathName

    public operator fun component4(): UnicodeString = this.commandLine

    public fun copy(reserved1: UByteArray = this.reserved1, reserved2: List<MutPtr<CVoid>> = this.reserved2, imagePathName: UnicodeString = this.imagePathName, commandLine: UnicodeString = this.commandLine): RtlUserProcessParameters = RtlUserProcessParameters(reserved1 = reserved1, reserved2CtorArg = reserved2, imagePathName = imagePathName, commandLine = commandLine)

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

    public companion object {
        public operator fun invoke(
            reserved1: UByteArray = UByteArray(16),
            reserved2: List<MutPtr<CVoid>> = List(10) { MutPtr(0L) },
            imagePathName: UnicodeString = UnicodeString(),
            commandLine: UnicodeString = UnicodeString(),
        ): RtlUserProcessParameters =
            RtlUserProcessParameters(
                reserved1 = reserved1,
                reserved2CtorArg = reserved2,
                imagePathName = imagePathName,
                commandLine = commandLine,
            )
    }
}

public class Srwlock internal constructor(
    ptrCtorArg: MutPtr<CVoid>,
) {
    public var ptr: MutPtr<CVoid> = ptrCtorArg
        internal set

    public constructor() : this(
        ptrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.ptr

    public fun copy(ptr: MutPtr<CVoid> = this.ptr): Srwlock = Srwlock(ptrCtorArg = ptr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Srwlock) return false
        if (this.ptr != other.ptr) return false
        return true
    }

    override fun hashCode(): Int = this.ptr.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Srwlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Srwlock> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Srwlock =
                    Srwlock(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Srwlock) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ptr)
                }
            }

        public operator fun invoke(
            ptr: MutPtr<CVoid> = MutPtr(0L),
        ): Srwlock =
            Srwlock(
                ptrCtorArg = ptr,
            )
    }
}

public class Startupinfoa internal constructor(
    public var cb: UInt,
    lpReservedCtorArg: Pstr,
    lpDesktopCtorArg: Pstr,
    lpTitleCtorArg: Pstr,
    public var dwX: UInt,
    public var dwY: UInt,
    public var dwXSize: UInt,
    public var dwYSize: UInt,
    public var dwXCountChars: UInt,
    public var dwYCountChars: UInt,
    public var dwFillAttribute: UInt,
    public var dwFlags: StartupinfowFlags,
    public var wShowWindow: UShort,
    public var cbReserved2: UShort,
    lpReserved2CtorArg: MutPtr<UByte>,
    hStdInputCtorArg: Handle,
    hStdOutputCtorArg: Handle,
    hStdErrorCtorArg: Handle,
) {
    public var lpReserved: Pstr = lpReservedCtorArg
        internal set

    public var lpDesktop: Pstr = lpDesktopCtorArg
        internal set

    public var lpTitle: Pstr = lpTitleCtorArg
        internal set

    public var lpReserved2: MutPtr<UByte> = lpReserved2CtorArg
        internal set

    public var hStdInput: Handle = hStdInputCtorArg
        internal set

    public var hStdOutput: Handle = hStdOutputCtorArg
        internal set

    public var hStdError: Handle = hStdErrorCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        lpReservedCtorArg = MutPtr(0L),
        lpDesktopCtorArg = MutPtr(0L),
        lpTitleCtorArg = MutPtr(0L),
        dwX = 0u,
        dwY = 0u,
        dwXSize = 0u,
        dwYSize = 0u,
        dwXCountChars = 0u,
        dwYCountChars = 0u,
        dwFillAttribute = 0u,
        dwFlags = 0u,
        wShowWindow = 0u,
        cbReserved2 = 0u,
        lpReserved2CtorArg = MutPtr(0L),
        hStdInputCtorArg = MutPtr(0L),
        hStdOutputCtorArg = MutPtr(0L),
        hStdErrorCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            lpReserved: Pstr = MutPtr(0L),
            lpDesktop: Pstr = MutPtr(0L),
            lpTitle: Pstr = MutPtr(0L),
            dwX: UInt = 0u,
            dwY: UInt = 0u,
            dwXSize: UInt = 0u,
            dwYSize: UInt = 0u,
            dwXCountChars: UInt = 0u,
            dwYCountChars: UInt = 0u,
            dwFillAttribute: UInt = 0u,
            dwFlags: StartupinfowFlags = 0u,
            wShowWindow: UShort = 0u,
            cbReserved2: UShort = 0u,
            lpReserved2: MutPtr<UByte> = MutPtr(0L),
            hStdInput: Handle = MutPtr(0L),
            hStdOutput: Handle = MutPtr(0L),
            hStdError: Handle = MutPtr(0L),
        ): Startupinfoa =
            Startupinfoa(
                cb = cb,
                lpReservedCtorArg = lpReserved,
                lpDesktopCtorArg = lpDesktop,
                lpTitleCtorArg = lpTitle,
                dwX = dwX,
                dwY = dwY,
                dwXSize = dwXSize,
                dwYSize = dwYSize,
                dwXCountChars = dwXCountChars,
                dwYCountChars = dwYCountChars,
                dwFillAttribute = dwFillAttribute,
                dwFlags = dwFlags,
                wShowWindow = wShowWindow,
                cbReserved2 = cbReserved2,
                lpReserved2CtorArg = lpReserved2,
                hStdInputCtorArg = hStdInput,
                hStdOutputCtorArg = hStdOutput,
                hStdErrorCtorArg = hStdError,
            )
    }
}

public class Startupinfoexa internal constructor(
    public var startupInfo: Startupinfoa,
    lpAttributeListCtorArg: LpprocThreadAttributeList,
) {
    public var lpAttributeList: LpprocThreadAttributeList = lpAttributeListCtorArg
        internal set

    public constructor() : this(
        startupInfo = Startupinfoa(),
        lpAttributeListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Startupinfoa = this.startupInfo

    public operator fun component2(): LpprocThreadAttributeList = this.lpAttributeList

    public fun copy(startupInfo: Startupinfoa = this.startupInfo, lpAttributeList: LpprocThreadAttributeList = this.lpAttributeList): Startupinfoexa = Startupinfoexa(startupInfo = startupInfo, lpAttributeListCtorArg = lpAttributeList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Startupinfoexa) return false
        if (this.startupInfo != other.startupInfo) return false
        if (this.lpAttributeList != other.lpAttributeList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startupInfo.hashCode()
        result = 31 * result + this.lpAttributeList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            startupInfo: Startupinfoa = Startupinfoa(),
            lpAttributeList: LpprocThreadAttributeList = MutPtr(0L),
        ): Startupinfoexa =
            Startupinfoexa(
                startupInfo = startupInfo,
                lpAttributeListCtorArg = lpAttributeList,
            )
    }
}

public class Startupinfoexw internal constructor(
    public var startupInfo: Startupinfow,
    lpAttributeListCtorArg: LpprocThreadAttributeList,
) {
    public var lpAttributeList: LpprocThreadAttributeList = lpAttributeListCtorArg
        internal set

    public constructor() : this(
        startupInfo = Startupinfow(),
        lpAttributeListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Startupinfow = this.startupInfo

    public operator fun component2(): LpprocThreadAttributeList = this.lpAttributeList

    public fun copy(startupInfo: Startupinfow = this.startupInfo, lpAttributeList: LpprocThreadAttributeList = this.lpAttributeList): Startupinfoexw = Startupinfoexw(startupInfo = startupInfo, lpAttributeListCtorArg = lpAttributeList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Startupinfoexw) return false
        if (this.startupInfo != other.startupInfo) return false
        if (this.lpAttributeList != other.lpAttributeList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startupInfo.hashCode()
        result = 31 * result + this.lpAttributeList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            startupInfo: Startupinfow = Startupinfow(),
            lpAttributeList: LpprocThreadAttributeList = MutPtr(0L),
        ): Startupinfoexw =
            Startupinfoexw(
                startupInfo = startupInfo,
                lpAttributeListCtorArg = lpAttributeList,
            )
    }
}

public class Startupinfow internal constructor(
    public var cb: UInt,
    lpReservedCtorArg: Pwstr,
    lpDesktopCtorArg: Pwstr,
    lpTitleCtorArg: Pwstr,
    public var dwX: UInt,
    public var dwY: UInt,
    public var dwXSize: UInt,
    public var dwYSize: UInt,
    public var dwXCountChars: UInt,
    public var dwYCountChars: UInt,
    public var dwFillAttribute: UInt,
    public var dwFlags: StartupinfowFlags,
    public var wShowWindow: UShort,
    public var cbReserved2: UShort,
    lpReserved2CtorArg: MutPtr<UByte>,
    hStdInputCtorArg: Handle,
    hStdOutputCtorArg: Handle,
    hStdErrorCtorArg: Handle,
) {
    public var lpReserved: Pwstr = lpReservedCtorArg
        internal set

    public var lpDesktop: Pwstr = lpDesktopCtorArg
        internal set

    public var lpTitle: Pwstr = lpTitleCtorArg
        internal set

    public var lpReserved2: MutPtr<UByte> = lpReserved2CtorArg
        internal set

    public var hStdInput: Handle = hStdInputCtorArg
        internal set

    public var hStdOutput: Handle = hStdOutputCtorArg
        internal set

    public var hStdError: Handle = hStdErrorCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        lpReservedCtorArg = MutPtr(0L),
        lpDesktopCtorArg = MutPtr(0L),
        lpTitleCtorArg = MutPtr(0L),
        dwX = 0u,
        dwY = 0u,
        dwXSize = 0u,
        dwYSize = 0u,
        dwXCountChars = 0u,
        dwYCountChars = 0u,
        dwFillAttribute = 0u,
        dwFlags = 0u,
        wShowWindow = 0u,
        cbReserved2 = 0u,
        lpReserved2CtorArg = MutPtr(0L),
        hStdInputCtorArg = MutPtr(0L),
        hStdOutputCtorArg = MutPtr(0L),
        hStdErrorCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            lpReserved: Pwstr = MutPtr(0L),
            lpDesktop: Pwstr = MutPtr(0L),
            lpTitle: Pwstr = MutPtr(0L),
            dwX: UInt = 0u,
            dwY: UInt = 0u,
            dwXSize: UInt = 0u,
            dwYSize: UInt = 0u,
            dwXCountChars: UInt = 0u,
            dwYCountChars: UInt = 0u,
            dwFillAttribute: UInt = 0u,
            dwFlags: StartupinfowFlags = 0u,
            wShowWindow: UShort = 0u,
            cbReserved2: UShort = 0u,
            lpReserved2: MutPtr<UByte> = MutPtr(0L),
            hStdInput: Handle = MutPtr(0L),
            hStdOutput: Handle = MutPtr(0L),
            hStdError: Handle = MutPtr(0L),
        ): Startupinfow =
            Startupinfow(
                cb = cb,
                lpReservedCtorArg = lpReserved,
                lpDesktopCtorArg = lpDesktop,
                lpTitleCtorArg = lpTitle,
                dwX = dwX,
                dwY = dwY,
                dwXSize = dwXSize,
                dwYSize = dwYSize,
                dwXCountChars = dwXCountChars,
                dwYCountChars = dwYCountChars,
                dwFillAttribute = dwFillAttribute,
                dwFlags = dwFlags,
                wShowWindow = wShowWindow,
                cbReserved2 = cbReserved2,
                lpReserved2CtorArg = lpReserved2,
                hStdInputCtorArg = hStdInput,
                hStdOutputCtorArg = hStdOutput,
                hStdErrorCtorArg = hStdError,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SynchronizationBarrier> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SynchronizationBarrier> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SynchronizationBarrier =
                    SynchronizationBarrier(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SynchronizationBarrier) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                    ).writeNative(addr + 8L, value.reserved3.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.reserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.reserved5)
                }
            }
    }
}

public class Teb internal constructor(
    reserved1CtorArg: List<MutPtr<CVoid>>,
    processEnvironmentBlockCtorArg: MutPtr<Peb>,
    reserved2CtorArg: List<MutPtr<CVoid>>,
    public var reserved3: UByteArray,
    tlsSlotsCtorArg: List<MutPtr<CVoid>>,
    public var reserved4: UByteArray,
    reserved5CtorArg: List<MutPtr<CVoid>>,
    reservedForOleCtorArg: MutPtr<CVoid>,
    reserved6CtorArg: List<MutPtr<CVoid>>,
    tlsExpansionSlotsCtorArg: MutPtr<CVoid>,
) {
    public var reserved1: List<MutPtr<CVoid>> = reserved1CtorArg
        internal set

    public var processEnvironmentBlock: MutPtr<Peb> = processEnvironmentBlockCtorArg
        internal set

    public var reserved2: List<MutPtr<CVoid>> = reserved2CtorArg
        internal set

    public var tlsSlots: List<MutPtr<CVoid>> = tlsSlotsCtorArg
        internal set

    public var reserved5: List<MutPtr<CVoid>> = reserved5CtorArg
        internal set

    public var reservedForOle: MutPtr<CVoid> = reservedForOleCtorArg
        internal set

    public var reserved6: List<MutPtr<CVoid>> = reserved6CtorArg
        internal set

    public var tlsExpansionSlots: MutPtr<CVoid> = tlsExpansionSlotsCtorArg
        internal set

    public constructor() : this(
        reserved1CtorArg = List(12) { MutPtr(0L) },
        processEnvironmentBlockCtorArg = MutPtr(0L),
        reserved2CtorArg = List(399) { MutPtr(0L) },
        reserved3 = UByteArray(1952),
        tlsSlotsCtorArg = List(64) { MutPtr(0L) },
        reserved4 = UByteArray(8),
        reserved5CtorArg = List(26) { MutPtr(0L) },
        reservedForOleCtorArg = MutPtr(0L),
        reserved6CtorArg = List(4) { MutPtr(0L) },
        tlsExpansionSlotsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.reserved1

    public operator fun component2(): MutPtr<Peb> = this.processEnvironmentBlock

    public operator fun component3(): List<MutPtr<CVoid>> = this.reserved2

    public operator fun component4(): UByteArray = this.reserved3

    public operator fun component5(): List<MutPtr<CVoid>> = this.tlsSlots

    public operator fun component6(): UByteArray = this.reserved4

    public operator fun component7(): List<MutPtr<CVoid>> = this.reserved5

    public operator fun component8(): MutPtr<CVoid> = this.reservedForOle

    public operator fun component9(): List<MutPtr<CVoid>> = this.reserved6

    public operator fun component10(): MutPtr<CVoid> = this.tlsExpansionSlots

    public fun copy(reserved1: List<MutPtr<CVoid>> = this.reserved1, processEnvironmentBlock: MutPtr<Peb> = this.processEnvironmentBlock, reserved2: List<MutPtr<CVoid>> = this.reserved2, reserved3: UByteArray = this.reserved3, tlsSlots: List<MutPtr<CVoid>> = this.tlsSlots, reserved4: UByteArray = this.reserved4, reserved5: List<MutPtr<CVoid>> = this.reserved5, reservedForOle: MutPtr<CVoid> = this.reservedForOle, reserved6: List<MutPtr<CVoid>> = this.reserved6, tlsExpansionSlots: MutPtr<CVoid> = this.tlsExpansionSlots): Teb = Teb(reserved1CtorArg = reserved1, processEnvironmentBlockCtorArg = processEnvironmentBlock, reserved2CtorArg = reserved2, reserved3 = reserved3, tlsSlotsCtorArg = tlsSlots, reserved4 = reserved4, reserved5CtorArg = reserved5, reservedForOleCtorArg = reservedForOle, reserved6CtorArg = reserved6, tlsExpansionSlotsCtorArg = tlsExpansionSlots)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Teb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Teb> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 6024L
                override fun readNative(addr: Long): Teb =
                    Teb(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (12).toInt(),
                                )
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Peb>(64)
                        ).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (399).toInt(),
                                )
                        ).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1952).toInt())
                        ).readNative(addr + 3296L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (64).toInt(),
                                )
                        ).readNative(addr + 5248L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 5760L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (26).toInt(),
                                )
                        ).readNative(addr + 5768L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 5976L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (4).toInt(),
                                )
                        ).readNative(addr + 5984L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 6016L),
                    )
                override fun writeNative(addr: Long, value: Teb) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (12).toInt(),
                            )
                    ).writeNative(addr, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Peb>(64)
                    ).writeNative(addr + 96L, value.processEnvironmentBlock)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (399).toInt(),
                            )
                    ).writeNative(addr + 104L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1952).toInt())
                    ).writeNative(addr + 3296L, value.reserved3.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (64).toInt(),
                            )
                    ).writeNative(addr + 5248L, value.tlsSlots)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 5760L, value.reserved4.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (26).toInt(),
                            )
                    ).writeNative(addr + 5768L, value.reserved5)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 5976L, value.reservedForOle)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (4).toInt(),
                            )
                    ).writeNative(addr + 5984L, value.reserved6)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 6016L, value.tlsExpansionSlots)
                }
            }

        public operator fun invoke(
            reserved1: List<MutPtr<CVoid>> = List(12) { MutPtr(0L) },
            processEnvironmentBlock: MutPtr<Peb> = MutPtr(0L),
            reserved2: List<MutPtr<CVoid>> = List(399) { MutPtr(0L) },
            reserved3: UByteArray = UByteArray(1952),
            tlsSlots: List<MutPtr<CVoid>> = List(64) { MutPtr(0L) },
            reserved4: UByteArray = UByteArray(8),
            reserved5: List<MutPtr<CVoid>> = List(26) { MutPtr(0L) },
            reservedForOle: MutPtr<CVoid> = MutPtr(0L),
            reserved6: List<MutPtr<CVoid>> = List(4) { MutPtr(0L) },
            tlsExpansionSlots: MutPtr<CVoid> = MutPtr(0L),
        ): Teb =
            Teb(
                reserved1CtorArg = reserved1,
                processEnvironmentBlockCtorArg = processEnvironmentBlock,
                reserved2CtorArg = reserved2,
                reserved3 = reserved3,
                tlsSlotsCtorArg = tlsSlots,
                reserved4 = reserved4,
                reserved5CtorArg = reserved5,
                reservedForOleCtorArg = reservedForOle,
                reserved6CtorArg = reserved6,
                tlsExpansionSlotsCtorArg = tlsExpansionSlots,
            )
    }
}

public data class ThreadPowerThrottlingState(
    public var version: UInt = 0u,
    public var controlMask: UInt = 0u,
    public var stateMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadPowerThrottlingState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadPowerThrottlingState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ThreadPowerThrottlingState =
                    ThreadPowerThrottlingState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ThreadPowerThrottlingState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.controlMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stateMask)
                }
            }
    }
}

public class TpCallbackEnvironV3 internal constructor(
    public var version: UInt,
    public var pool: PtpPool,
    public var cleanupGroup: PtpCleanupGroup,
    public var cleanupGroupCancelCallback: PtpCleanupGroupCancelCallback,
    raceDllCtorArg: MutPtr<CVoid>,
    public var activationContext: Int,
    public var finalizationCallback: PtpSimpleCallback,
    public var u: TpCallbackEnvironV30,
    public var callbackPriority: TpCallbackPriority,
    public var size: UInt,
) {
    public var raceDll: MutPtr<CVoid> = raceDllCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        pool = 0L,
        cleanupGroup = 0L,
        cleanupGroupCancelCallback = null,
        raceDllCtorArg = MutPtr(0L),
        activationContext = 0,
        finalizationCallback = null,
        u = TpCallbackEnvironV30(),
        callbackPriority = 0,
        size = 0u,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): PtpPool = this.pool

    public operator fun component3(): PtpCleanupGroup = this.cleanupGroup

    public operator fun component4(): PtpCleanupGroupCancelCallback = this.cleanupGroupCancelCallback

    public operator fun component5(): MutPtr<CVoid> = this.raceDll

    public operator fun component6(): Int = this.activationContext

    public operator fun component7(): PtpSimpleCallback = this.finalizationCallback

    public operator fun component8(): TpCallbackEnvironV30 = this.u

    public operator fun component9(): TpCallbackPriority = this.callbackPriority

    public operator fun component10(): UInt = this.size

    public fun copy(version: UInt = this.version, pool: PtpPool = this.pool, cleanupGroup: PtpCleanupGroup = this.cleanupGroup, cleanupGroupCancelCallback: PtpCleanupGroupCancelCallback = this.cleanupGroupCancelCallback, raceDll: MutPtr<CVoid> = this.raceDll, activationContext: Int = this.activationContext, finalizationCallback: PtpSimpleCallback = this.finalizationCallback, u: TpCallbackEnvironV30 = this.u, callbackPriority: TpCallbackPriority = this.callbackPriority, size: UInt = this.size): TpCallbackEnvironV3 = TpCallbackEnvironV3(version = version, pool = pool, cleanupGroup = cleanupGroup, cleanupGroupCancelCallback = cleanupGroupCancelCallback, raceDllCtorArg = raceDll, activationContext = activationContext, finalizationCallback = finalizationCallback, u = u, callbackPriority = callbackPriority, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TpCallbackEnvironV3) return false
        if (this.version != other.version) return false
        if (this.pool != other.pool) return false
        if (this.cleanupGroup != other.cleanupGroup) return false
        if (this.cleanupGroupCancelCallback != other.cleanupGroupCancelCallback) return false
        if (this.raceDll != other.raceDll) return false
        if (this.activationContext != other.activationContext) return false
        if (this.finalizationCallback != other.finalizationCallback) return false
        if (this.u != other.u) return false
        if (this.callbackPriority != other.callbackPriority) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.pool.hashCode()
        result = 31 * result + this.cleanupGroup.hashCode()
        result = 31 * result + this.cleanupGroupCancelCallback.hashCode()
        result = 31 * result + this.raceDll.hashCode()
        result = 31 * result + this.activationContext.hashCode()
        result = 31 * result + this.finalizationCallback.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.callbackPriority.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            pool: PtpPool = 0L,
            cleanupGroup: PtpCleanupGroup = 0L,
            cleanupGroupCancelCallback: PtpCleanupGroupCancelCallback = null,
            raceDll: MutPtr<CVoid> = MutPtr(0L),
            activationContext: Int = 0,
            finalizationCallback: PtpSimpleCallback = null,
            u: TpCallbackEnvironV30 = TpCallbackEnvironV30(),
            callbackPriority: TpCallbackPriority = 0,
            size: UInt = 0u,
        ): TpCallbackEnvironV3 =
            TpCallbackEnvironV3(
                version = version,
                pool = pool,
                cleanupGroup = cleanupGroup,
                cleanupGroupCancelCallback = cleanupGroupCancelCallback,
                raceDllCtorArg = raceDll,
                activationContext = activationContext,
                finalizationCallback = finalizationCallback,
                u = u,
                callbackPriority = callbackPriority,
                size = size,
            )
    }
}

public data class TpCallbackEnvironV30(
    public var flags: UInt = 0u,
    public var s: TpCallbackEnvironV300 = TpCallbackEnvironV300(),
)

public data class TpCallbackEnvironV300(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpCallbackEnvironV300> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpCallbackEnvironV300> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TpCallbackEnvironV300 =
                    TpCallbackEnvironV300(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TpCallbackEnvironV300) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class TpPoolStackInformation(
    public var stackReserve: Int = 0,
    public var stackCommit: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpPoolStackInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpPoolStackInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TpPoolStackInformation =
                    TpPoolStackInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TpPoolStackInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.stackReserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.stackCommit)
                }
            }
    }
}

public class UmsSchedulerStartupInfo internal constructor(
    public var umsVersion: UInt,
    completionListCtorArg: MutPtr<CVoid>,
    public var schedulerProc: PrtlUmsSchedulerEntryPoint,
    schedulerParamCtorArg: MutPtr<CVoid>,
) {
    public var completionList: MutPtr<CVoid> = completionListCtorArg
        internal set

    public var schedulerParam: MutPtr<CVoid> = schedulerParamCtorArg
        internal set

    public constructor() : this(
        umsVersion = 0u,
        completionListCtorArg = MutPtr(0L),
        schedulerProc = null,
        schedulerParamCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.umsVersion

    public operator fun component2(): MutPtr<CVoid> = this.completionList

    public operator fun component3(): PrtlUmsSchedulerEntryPoint = this.schedulerProc

    public operator fun component4(): MutPtr<CVoid> = this.schedulerParam

    public fun copy(umsVersion: UInt = this.umsVersion, completionList: MutPtr<CVoid> = this.completionList, schedulerProc: PrtlUmsSchedulerEntryPoint = this.schedulerProc, schedulerParam: MutPtr<CVoid> = this.schedulerParam): UmsSchedulerStartupInfo = UmsSchedulerStartupInfo(umsVersion = umsVersion, completionListCtorArg = completionList, schedulerProc = schedulerProc, schedulerParamCtorArg = schedulerParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UmsSchedulerStartupInfo) return false
        if (this.umsVersion != other.umsVersion) return false
        if (this.completionList != other.completionList) return false
        if (this.schedulerProc != other.schedulerProc) return false
        if (this.schedulerParam != other.schedulerParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.umsVersion.hashCode()
        result = 31 * result + this.completionList.hashCode()
        result = 31 * result + this.schedulerProc.hashCode()
        result = 31 * result + this.schedulerParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            umsVersion: UInt = 0u,
            completionList: MutPtr<CVoid> = MutPtr(0L),
            schedulerProc: PrtlUmsSchedulerEntryPoint = null,
            schedulerParam: MutPtr<CVoid> = MutPtr(0L),
        ): UmsSchedulerStartupInfo =
            UmsSchedulerStartupInfo(
                umsVersion = umsVersion,
                completionListCtorArg = completionList,
                schedulerProc = schedulerProc,
                schedulerParamCtorArg = schedulerParam,
            )
    }
}

public data class UmsSystemThreadInformation(
    public var umsVersion: UInt = 0u,
    public var anonymous: UmsSystemThreadInformation0 = UmsSystemThreadInformation0(),
)

public data class UmsSystemThreadInformation0(
    public var anonymous: UmsSystemThreadInformation00 = UmsSystemThreadInformation00(),
    public var threadUmsFlags: UInt = 0u,
)

public data class UmsSystemThreadInformation00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UmsSystemThreadInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UmsSystemThreadInformation00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UmsSystemThreadInformation00 =
                    UmsSystemThreadInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UmsSystemThreadInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}
