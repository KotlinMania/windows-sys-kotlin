package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public data class EnumPageFileInformation(
    public var cb: UInt = 0u,
    public var reserved: UInt = 0u,
    public var totalSize: Int = 0,
    public var totalInUse: Int = 0,
    public var peakUsage: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EnumPageFileInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EnumPageFileInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): EnumPageFileInformation =
                    EnumPageFileInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: EnumPageFileInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.totalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.totalInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.peakUsage)
                }
            }
    }
}

public class Moduleinfo internal constructor(
    lpBaseOfDllCtorArg: MutPtr,
    public var sizeOfImage: UInt,
    entryPointCtorArg: MutPtr,
) {
    public var lpBaseOfDll: MutPtr = lpBaseOfDllCtorArg
        internal set

    public var entryPoint: MutPtr = entryPointCtorArg
        internal set

    public constructor() : this(
        lpBaseOfDllCtorArg = MutPtr(0L),
        sizeOfImage = 0u,
        entryPointCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.lpBaseOfDll

    public operator fun component2(): UInt = this.sizeOfImage

    public operator fun component3(): MutPtr = this.entryPoint

    public fun copy(lpBaseOfDll: MutPtr = this.lpBaseOfDll, sizeOfImage: UInt = this.sizeOfImage, entryPoint: MutPtr = this.entryPoint): Moduleinfo = Moduleinfo(lpBaseOfDllCtorArg = lpBaseOfDll, sizeOfImage = sizeOfImage, entryPointCtorArg = entryPoint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Moduleinfo) return false
        if (this.lpBaseOfDll != other.lpBaseOfDll) return false
        if (this.sizeOfImage != other.sizeOfImage) return false
        if (this.entryPoint != other.entryPoint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpBaseOfDll.hashCode()
        result = 31 * result + this.sizeOfImage.hashCode()
        result = 31 * result + this.entryPoint.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Moduleinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Moduleinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Moduleinfo =
                    Moduleinfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Moduleinfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.lpBaseOfDll)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sizeOfImage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.entryPoint)
                }
            }

        public operator fun invoke(
            lpBaseOfDll: MutPtr = MutPtr(0L),
            sizeOfImage: UInt = 0u,
            entryPoint: MutPtr = MutPtr(0L),
        ): Moduleinfo =
            Moduleinfo(
                lpBaseOfDllCtorArg = lpBaseOfDll,
                sizeOfImage = sizeOfImage,
                entryPointCtorArg = entryPoint,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerformanceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerformanceInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): PerformanceInformation =
                    PerformanceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: PerformanceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.commitTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.commitLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.commitPeak)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.physicalTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.physicalAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.systemCache)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.kernelTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.kernelPaged)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 72L, value.kernelNonpaged)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 80L, value.pageSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.handleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.processCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.threadCount)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMemoryCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMemoryCounters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): ProcessMemoryCounters =
                    ProcessMemoryCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: ProcessMemoryCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.peakWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.workingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.quotaPeakPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.quotaPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.quotaPeakNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.quotaNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.pagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.peakPagefileUsage)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMemoryCountersEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMemoryCountersEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): ProcessMemoryCountersEx =
                    ProcessMemoryCountersEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: ProcessMemoryCountersEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.peakWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.workingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.quotaPeakPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.quotaPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.quotaPeakNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.quotaNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.pagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.peakPagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 72L, value.privateUsage)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMemoryCountersEx2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMemoryCountersEx2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): ProcessMemoryCountersEx2 =
                    ProcessMemoryCountersEx2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: ProcessMemoryCountersEx2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.peakWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.workingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.quotaPeakPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.quotaPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.quotaPeakNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.quotaNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.pagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.peakPagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 72L, value.privateUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 80L, value.privateWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.sharedCommitUsage)
                }
            }
    }
}

public data class PsapiWorkingSetBlock(
    public var flags: Int = 0,
    public var anonymous: PsapiWorkingSetBlock0 = PsapiWorkingSetBlock0(),
)

public data class PsapiWorkingSetBlock0(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsapiWorkingSetBlock0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsapiWorkingSetBlock0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PsapiWorkingSetBlock0 =
                    PsapiWorkingSetBlock0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PsapiWorkingSetBlock0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PsapiWorkingSetExBlock(
    public var flags: Int = 0,
    public var anonymous: PsapiWorkingSetExBlock0 = PsapiWorkingSetExBlock0(),
)

public data class PsapiWorkingSetExBlock0(
    public var anonymous: PsapiWorkingSetExBlock00 = PsapiWorkingSetExBlock00(),
    public var invalid: PsapiWorkingSetExBlock01 = PsapiWorkingSetExBlock01(),
)

public data class PsapiWorkingSetExBlock00(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsapiWorkingSetExBlock00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsapiWorkingSetExBlock00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PsapiWorkingSetExBlock00 =
                    PsapiWorkingSetExBlock00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PsapiWorkingSetExBlock00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PsapiWorkingSetExBlock01(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsapiWorkingSetExBlock01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsapiWorkingSetExBlock01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PsapiWorkingSetExBlock01 =
                    PsapiWorkingSetExBlock01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PsapiWorkingSetExBlock01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PsapiWorkingSetExInformation internal constructor(
    virtualAddressCtorArg: MutPtr,
    public var virtualAttributes: PsapiWorkingSetExBlock,
) {
    public var virtualAddress: MutPtr = virtualAddressCtorArg
        internal set

    public constructor() : this(
        virtualAddressCtorArg = MutPtr(0L),
        virtualAttributes = PsapiWorkingSetExBlock(),
    )

    public operator fun component1(): MutPtr = this.virtualAddress

    public operator fun component2(): PsapiWorkingSetExBlock = this.virtualAttributes

    public fun copy(virtualAddress: MutPtr = this.virtualAddress, virtualAttributes: PsapiWorkingSetExBlock = this.virtualAttributes): PsapiWorkingSetExInformation = PsapiWorkingSetExInformation(virtualAddressCtorArg = virtualAddress, virtualAttributes = virtualAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PsapiWorkingSetExInformation) return false
        if (this.virtualAddress != other.virtualAddress) return false
        if (this.virtualAttributes != other.virtualAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualAddress.hashCode()
        result = 31 * result + this.virtualAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            virtualAddress: MutPtr = MutPtr(0L),
            virtualAttributes: PsapiWorkingSetExBlock = PsapiWorkingSetExBlock(),
        ): PsapiWorkingSetExInformation =
            PsapiWorkingSetExInformation(
                virtualAddressCtorArg = virtualAddress,
                virtualAttributes = virtualAttributes,
            )
    }
}

public data class PsapiWorkingSetInformation(
    public var numberOfEntries: Int = 0,
    public var workingSetInfo: List<PsapiWorkingSetBlock> = List(1) { PsapiWorkingSetBlock() },
)

public class PsapiWsWatchInformation internal constructor(
    faultingPcCtorArg: MutPtr,
    faultingVaCtorArg: MutPtr,
) {
    public var faultingPc: MutPtr = faultingPcCtorArg
        internal set

    public var faultingVa: MutPtr = faultingVaCtorArg
        internal set

    public constructor() : this(
        faultingPcCtorArg = MutPtr(0L),
        faultingVaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.faultingPc

    public operator fun component2(): MutPtr = this.faultingVa

    public fun copy(faultingPc: MutPtr = this.faultingPc, faultingVa: MutPtr = this.faultingVa): PsapiWsWatchInformation = PsapiWsWatchInformation(faultingPcCtorArg = faultingPc, faultingVaCtorArg = faultingVa)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PsapiWsWatchInformation) return false
        if (this.faultingPc != other.faultingPc) return false
        if (this.faultingVa != other.faultingVa) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.faultingPc.hashCode()
        result = 31 * result + this.faultingVa.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsapiWsWatchInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsapiWsWatchInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PsapiWsWatchInformation =
                    PsapiWsWatchInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PsapiWsWatchInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.faultingPc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.faultingVa)
                }
            }

        public operator fun invoke(
            faultingPc: MutPtr = MutPtr(0L),
            faultingVa: MutPtr = MutPtr(0L),
        ): PsapiWsWatchInformation =
            PsapiWsWatchInformation(
                faultingPcCtorArg = faultingPc,
                faultingVaCtorArg = faultingVa,
            )
    }
}

public data class PsapiWsWatchInformationEx(
    public var basicInfo: PsapiWsWatchInformation = PsapiWsWatchInformation(),
    public var faultingThreadId: Int = 0,
    public var flags: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsapiWsWatchInformationEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsapiWsWatchInformationEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PsapiWsWatchInformationEx =
                    PsapiWsWatchInformationEx(
                        (PsapiWsWatchInformation.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PsapiWsWatchInformationEx) {
                    (PsapiWsWatchInformation.typeLayout()).writeNative(addr, value.basicInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.faultingThreadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.flags)
                }
            }
    }
}
