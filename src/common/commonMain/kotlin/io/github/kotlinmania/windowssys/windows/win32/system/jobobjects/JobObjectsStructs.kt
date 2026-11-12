package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenPrivileges
import io.github.kotlinmania.windowssys.windows.win32.system.threading.IoCounters

public class JobobjectAssociateCompletionPort internal constructor(
    completionKeyCtorArg: MutPtr<CVoid>,
    completionPortCtorArg: Handle,
) {
    public var completionKey: MutPtr<CVoid> = completionKeyCtorArg
        internal set

    public var completionPort: Handle = completionPortCtorArg
        internal set

    public constructor() : this(
        completionKeyCtorArg = MutPtr(0L),
        completionPortCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.completionKey

    public operator fun component2(): Handle = this.completionPort

    public fun copy(completionKey: MutPtr<CVoid> = this.completionKey, completionPort: Handle = this.completionPort): JobobjectAssociateCompletionPort = JobobjectAssociateCompletionPort(completionKeyCtorArg = completionKey, completionPortCtorArg = completionPort)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JobobjectAssociateCompletionPort) return false
        if (this.completionKey != other.completionKey) return false
        if (this.completionPort != other.completionPort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.completionKey.hashCode()
        result = 31 * result + this.completionPort.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            completionKey: MutPtr<CVoid> = MutPtr(0L),
            completionPort: Handle = MutPtr(0L),
        ): JobobjectAssociateCompletionPort =
            JobobjectAssociateCompletionPort(
                completionKeyCtorArg = completionKey,
                completionPortCtorArg = completionPort,
            )
    }
}

public data class JobobjectBasicAccountingInformation(
    public var totalUserTime: Long = 0L,
    public var totalKernelTime: Long = 0L,
    public var thisPeriodTotalUserTime: Long = 0L,
    public var thisPeriodTotalKernelTime: Long = 0L,
    public var totalPageFaultCount: UInt = 0u,
    public var totalProcesses: UInt = 0u,
    public var activeProcesses: UInt = 0u,
    public var totalTerminatedProcesses: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectBasicAccountingInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectBasicAccountingInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): JobobjectBasicAccountingInformation =
                    JobobjectBasicAccountingInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: JobobjectBasicAccountingInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.totalUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.totalKernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.thisPeriodTotalUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.thisPeriodTotalKernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.totalPageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.totalProcesses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.activeProcesses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.totalTerminatedProcesses)
                }
            }
    }
}

public data class JobobjectBasicAndIoAccountingInformation(
    public var basicInfo: JobobjectBasicAccountingInformation = JobobjectBasicAccountingInformation(),
    public var ioInfo: IoCounters = IoCounters(),
)

public data class JobobjectBasicLimitInformation(
    public var perProcessUserTimeLimit: Long = 0L,
    public var perJobUserTimeLimit: Long = 0L,
    public var limitFlags: JobObjectLimit = 0u,
    public var minimumWorkingSetSize: Int = 0,
    public var maximumWorkingSetSize: Int = 0,
    public var activeProcessLimit: UInt = 0u,
    public var affinity: Int = 0,
    public var priorityClass: UInt = 0u,
    public var schedulingClass: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectBasicLimitInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectBasicLimitInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): JobobjectBasicLimitInformation =
                    JobobjectBasicLimitInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: JobobjectBasicLimitInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.perProcessUserTimeLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.perJobUserTimeLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.limitFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.minimumWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.maximumWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.activeProcessLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.affinity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.priorityClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.schedulingClass)
                }
            }
    }
}

public data class JobobjectBasicProcessIdList(
    public var numberOfAssignedProcesses: UInt = 0u,
    public var numberOfProcessIdsInList: UInt = 0u,
    public var processIdList: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JobobjectBasicProcessIdList) return false
        if (this.numberOfAssignedProcesses != other.numberOfAssignedProcesses) return false
        if (this.numberOfProcessIdsInList != other.numberOfProcessIdsInList) return false
        if (!this.processIdList.contentEquals(other.processIdList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfAssignedProcesses.hashCode()
        result = 31 * result + this.numberOfProcessIdsInList.hashCode()
        result = 31 * result + this.processIdList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectBasicProcessIdList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectBasicProcessIdList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): JobobjectBasicProcessIdList =
                    JobobjectBasicProcessIdList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (1).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: JobobjectBasicProcessIdList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfAssignedProcesses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfProcessIdsInList)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (1).toInt())
                    ).writeNative(addr + 8L, value.processIdList.toList())
                }
            }
    }
}

public data class JobobjectBasicUiRestrictions(
    public var uIRestrictionsClass: JobObjectUilimit = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectBasicUiRestrictions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectBasicUiRestrictions> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): JobobjectBasicUiRestrictions =
                    JobobjectBasicUiRestrictions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: JobobjectBasicUiRestrictions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uIRestrictionsClass)
                }
            }
    }
}

public data class JobobjectCpuRateControlInformation(
    public var controlFlags: JobObjectCpuRateControl = 0u,
    public var anonymous: JobobjectCpuRateControlInformation0 = JobobjectCpuRateControlInformation0(),
)

public data class JobobjectCpuRateControlInformation0(
    public var cpuRate: UInt = 0u,
    public var weight: UInt = 0u,
    public var anonymous: JobobjectCpuRateControlInformation00 = JobobjectCpuRateControlInformation00(),
)

public data class JobobjectCpuRateControlInformation00(
    public var minRate: UShort = 0u,
    public var maxRate: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectCpuRateControlInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectCpuRateControlInformation00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): JobobjectCpuRateControlInformation00 =
                    JobobjectCpuRateControlInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: JobobjectCpuRateControlInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.minRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maxRate)
                }
            }
    }
}

public data class JobobjectEndOfJobTimeInformation(
    public var endOfJobTimeAction: JobObjectTerminateAtEndAction = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectEndOfJobTimeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectEndOfJobTimeInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): JobobjectEndOfJobTimeInformation =
                    JobobjectEndOfJobTimeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: JobobjectEndOfJobTimeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.endOfJobTimeAction)
                }
            }
    }
}

public data class JobobjectExtendedLimitInformation(
    public var basicLimitInformation: JobobjectBasicLimitInformation = JobobjectBasicLimitInformation(),
    public var ioInfo: IoCounters = IoCounters(),
    public var processMemoryLimit: Int = 0,
    public var jobMemoryLimit: Int = 0,
    public var peakProcessMemoryUsed: Int = 0,
    public var peakJobMemoryUsed: Int = 0,
)

public data class JobobjectIoAttributionInformation(
    public var controlFlags: UInt = 0u,
    public var readStats: JobobjectIoAttributionStats = JobobjectIoAttributionStats(),
    public var writeStats: JobobjectIoAttributionStats = JobobjectIoAttributionStats(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectIoAttributionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectIoAttributionInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): JobobjectIoAttributionInformation =
                    JobobjectIoAttributionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (JobobjectIoAttributionStats.typeLayout()).readNative(addr + 8L),
                        (JobobjectIoAttributionStats.typeLayout()).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: JobobjectIoAttributionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.controlFlags)
                    (JobobjectIoAttributionStats.typeLayout()).writeNative(addr + 8L, value.readStats)
                    (JobobjectIoAttributionStats.typeLayout()).writeNative(addr + 40L, value.writeStats)
                }
            }
    }
}

public data class JobobjectIoAttributionStats(
    public var ioCount: Int = 0,
    public var totalNonOverlappedQueueTime: ULong = 0uL,
    public var totalNonOverlappedServiceTime: ULong = 0uL,
    public var totalSize: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectIoAttributionStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectIoAttributionStats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): JobobjectIoAttributionStats =
                    JobobjectIoAttributionStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: JobobjectIoAttributionStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.ioCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.totalNonOverlappedQueueTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.totalNonOverlappedServiceTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.totalSize)
                }
            }
    }
}

public class JobobjectIoRateControlInformation internal constructor(
    public var maxIops: Long,
    public var maxBandwidth: Long,
    public var reservationIops: Long,
    volumeNameCtorArg: Pcwstr,
    public var baseIoSize: UInt,
    public var controlFlags: UInt,
) {
    public var volumeName: Pcwstr = volumeNameCtorArg
        internal set

    public constructor() : this(
        maxIops = 0L,
        maxBandwidth = 0L,
        reservationIops = 0L,
        volumeNameCtorArg = ConstPtr(0L),
        baseIoSize = 0u,
        controlFlags = 0u,
    )

    public operator fun component1(): Long = this.maxIops

    public operator fun component2(): Long = this.maxBandwidth

    public operator fun component3(): Long = this.reservationIops

    public operator fun component4(): Pcwstr = this.volumeName

    public operator fun component5(): UInt = this.baseIoSize

    public operator fun component6(): UInt = this.controlFlags

    public fun copy(maxIops: Long = this.maxIops, maxBandwidth: Long = this.maxBandwidth, reservationIops: Long = this.reservationIops, volumeName: Pcwstr = this.volumeName, baseIoSize: UInt = this.baseIoSize, controlFlags: UInt = this.controlFlags): JobobjectIoRateControlInformation = JobobjectIoRateControlInformation(maxIops = maxIops, maxBandwidth = maxBandwidth, reservationIops = reservationIops, volumeNameCtorArg = volumeName, baseIoSize = baseIoSize, controlFlags = controlFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JobobjectIoRateControlInformation) return false
        if (this.maxIops != other.maxIops) return false
        if (this.maxBandwidth != other.maxBandwidth) return false
        if (this.reservationIops != other.reservationIops) return false
        if (this.volumeName != other.volumeName) return false
        if (this.baseIoSize != other.baseIoSize) return false
        if (this.controlFlags != other.controlFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxIops.hashCode()
        result = 31 * result + this.maxBandwidth.hashCode()
        result = 31 * result + this.reservationIops.hashCode()
        result = 31 * result + this.volumeName.hashCode()
        result = 31 * result + this.baseIoSize.hashCode()
        result = 31 * result + this.controlFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            maxIops: Long = 0L,
            maxBandwidth: Long = 0L,
            reservationIops: Long = 0L,
            volumeName: Pcwstr = ConstPtr(0L),
            baseIoSize: UInt = 0u,
            controlFlags: UInt = 0u,
        ): JobobjectIoRateControlInformation =
            JobobjectIoRateControlInformation(
                maxIops = maxIops,
                maxBandwidth = maxBandwidth,
                reservationIops = reservationIops,
                volumeNameCtorArg = volumeName,
                baseIoSize = baseIoSize,
                controlFlags = controlFlags,
            )
    }
}

public class JobobjectIoRateControlInformationNativeV1 internal constructor(
    public var maxIops: Long,
    public var maxBandwidth: Long,
    public var reservationIops: Long,
    volumeNameCtorArg: Pwstr,
    public var baseIoSize: UInt,
    public var controlFlags: JobObjectIoRateControlFlags,
    public var volumeNameLength: UShort,
) {
    public var volumeName: Pwstr = volumeNameCtorArg
        internal set

    public constructor() : this(
        maxIops = 0L,
        maxBandwidth = 0L,
        reservationIops = 0L,
        volumeNameCtorArg = MutPtr(0L),
        baseIoSize = 0u,
        controlFlags = 0,
        volumeNameLength = 0u,
    )

    public operator fun component1(): Long = this.maxIops

    public operator fun component2(): Long = this.maxBandwidth

    public operator fun component3(): Long = this.reservationIops

    public operator fun component4(): Pwstr = this.volumeName

    public operator fun component5(): UInt = this.baseIoSize

    public operator fun component6(): JobObjectIoRateControlFlags = this.controlFlags

    public operator fun component7(): UShort = this.volumeNameLength

    public fun copy(maxIops: Long = this.maxIops, maxBandwidth: Long = this.maxBandwidth, reservationIops: Long = this.reservationIops, volumeName: Pwstr = this.volumeName, baseIoSize: UInt = this.baseIoSize, controlFlags: JobObjectIoRateControlFlags = this.controlFlags, volumeNameLength: UShort = this.volumeNameLength): JobobjectIoRateControlInformationNativeV1 = JobobjectIoRateControlInformationNativeV1(maxIops = maxIops, maxBandwidth = maxBandwidth, reservationIops = reservationIops, volumeNameCtorArg = volumeName, baseIoSize = baseIoSize, controlFlags = controlFlags, volumeNameLength = volumeNameLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JobobjectIoRateControlInformationNativeV1) return false
        if (this.maxIops != other.maxIops) return false
        if (this.maxBandwidth != other.maxBandwidth) return false
        if (this.reservationIops != other.reservationIops) return false
        if (this.volumeName != other.volumeName) return false
        if (this.baseIoSize != other.baseIoSize) return false
        if (this.controlFlags != other.controlFlags) return false
        if (this.volumeNameLength != other.volumeNameLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxIops.hashCode()
        result = 31 * result + this.maxBandwidth.hashCode()
        result = 31 * result + this.reservationIops.hashCode()
        result = 31 * result + this.volumeName.hashCode()
        result = 31 * result + this.baseIoSize.hashCode()
        result = 31 * result + this.controlFlags.hashCode()
        result = 31 * result + this.volumeNameLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            maxIops: Long = 0L,
            maxBandwidth: Long = 0L,
            reservationIops: Long = 0L,
            volumeName: Pwstr = MutPtr(0L),
            baseIoSize: UInt = 0u,
            controlFlags: JobObjectIoRateControlFlags = 0,
            volumeNameLength: UShort = 0u,
        ): JobobjectIoRateControlInformationNativeV1 =
            JobobjectIoRateControlInformationNativeV1(
                maxIops = maxIops,
                maxBandwidth = maxBandwidth,
                reservationIops = reservationIops,
                volumeNameCtorArg = volumeName,
                baseIoSize = baseIoSize,
                controlFlags = controlFlags,
                volumeNameLength = volumeNameLength,
            )
    }
}

public class JobobjectIoRateControlInformationNativeV2 internal constructor(
    public var maxIops: Long,
    public var maxBandwidth: Long,
    public var reservationIops: Long,
    volumeNameCtorArg: Pwstr,
    public var baseIoSize: UInt,
    public var controlFlags: JobObjectIoRateControlFlags,
    public var volumeNameLength: UShort,
    public var criticalReservationIops: Long,
    public var reservationBandwidth: Long,
    public var criticalReservationBandwidth: Long,
    public var maxTimePercent: Long,
    public var reservationTimePercent: Long,
    public var criticalReservationTimePercent: Long,
) {
    public var volumeName: Pwstr = volumeNameCtorArg
        internal set

    public constructor() : this(
        maxIops = 0L,
        maxBandwidth = 0L,
        reservationIops = 0L,
        volumeNameCtorArg = MutPtr(0L),
        baseIoSize = 0u,
        controlFlags = 0,
        volumeNameLength = 0u,
        criticalReservationIops = 0L,
        reservationBandwidth = 0L,
        criticalReservationBandwidth = 0L,
        maxTimePercent = 0L,
        reservationTimePercent = 0L,
        criticalReservationTimePercent = 0L,
    )

    public operator fun component1(): Long = this.maxIops

    public operator fun component2(): Long = this.maxBandwidth

    public operator fun component3(): Long = this.reservationIops

    public operator fun component4(): Pwstr = this.volumeName

    public operator fun component5(): UInt = this.baseIoSize

    public operator fun component6(): JobObjectIoRateControlFlags = this.controlFlags

    public operator fun component7(): UShort = this.volumeNameLength

    public operator fun component8(): Long = this.criticalReservationIops

    public operator fun component9(): Long = this.reservationBandwidth

    public operator fun component10(): Long = this.criticalReservationBandwidth

    public operator fun component11(): Long = this.maxTimePercent

    public operator fun component12(): Long = this.reservationTimePercent

    public operator fun component13(): Long = this.criticalReservationTimePercent

    public fun copy(maxIops: Long = this.maxIops, maxBandwidth: Long = this.maxBandwidth, reservationIops: Long = this.reservationIops, volumeName: Pwstr = this.volumeName, baseIoSize: UInt = this.baseIoSize, controlFlags: JobObjectIoRateControlFlags = this.controlFlags, volumeNameLength: UShort = this.volumeNameLength, criticalReservationIops: Long = this.criticalReservationIops, reservationBandwidth: Long = this.reservationBandwidth, criticalReservationBandwidth: Long = this.criticalReservationBandwidth, maxTimePercent: Long = this.maxTimePercent, reservationTimePercent: Long = this.reservationTimePercent, criticalReservationTimePercent: Long = this.criticalReservationTimePercent): JobobjectIoRateControlInformationNativeV2 = JobobjectIoRateControlInformationNativeV2(maxIops = maxIops, maxBandwidth = maxBandwidth, reservationIops = reservationIops, volumeNameCtorArg = volumeName, baseIoSize = baseIoSize, controlFlags = controlFlags, volumeNameLength = volumeNameLength, criticalReservationIops = criticalReservationIops, reservationBandwidth = reservationBandwidth, criticalReservationBandwidth = criticalReservationBandwidth, maxTimePercent = maxTimePercent, reservationTimePercent = reservationTimePercent, criticalReservationTimePercent = criticalReservationTimePercent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JobobjectIoRateControlInformationNativeV2) return false
        if (this.maxIops != other.maxIops) return false
        if (this.maxBandwidth != other.maxBandwidth) return false
        if (this.reservationIops != other.reservationIops) return false
        if (this.volumeName != other.volumeName) return false
        if (this.baseIoSize != other.baseIoSize) return false
        if (this.controlFlags != other.controlFlags) return false
        if (this.volumeNameLength != other.volumeNameLength) return false
        if (this.criticalReservationIops != other.criticalReservationIops) return false
        if (this.reservationBandwidth != other.reservationBandwidth) return false
        if (this.criticalReservationBandwidth != other.criticalReservationBandwidth) return false
        if (this.maxTimePercent != other.maxTimePercent) return false
        if (this.reservationTimePercent != other.reservationTimePercent) return false
        if (this.criticalReservationTimePercent != other.criticalReservationTimePercent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxIops.hashCode()
        result = 31 * result + this.maxBandwidth.hashCode()
        result = 31 * result + this.reservationIops.hashCode()
        result = 31 * result + this.volumeName.hashCode()
        result = 31 * result + this.baseIoSize.hashCode()
        result = 31 * result + this.controlFlags.hashCode()
        result = 31 * result + this.volumeNameLength.hashCode()
        result = 31 * result + this.criticalReservationIops.hashCode()
        result = 31 * result + this.reservationBandwidth.hashCode()
        result = 31 * result + this.criticalReservationBandwidth.hashCode()
        result = 31 * result + this.maxTimePercent.hashCode()
        result = 31 * result + this.reservationTimePercent.hashCode()
        result = 31 * result + this.criticalReservationTimePercent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            maxIops: Long = 0L,
            maxBandwidth: Long = 0L,
            reservationIops: Long = 0L,
            volumeName: Pwstr = MutPtr(0L),
            baseIoSize: UInt = 0u,
            controlFlags: JobObjectIoRateControlFlags = 0,
            volumeNameLength: UShort = 0u,
            criticalReservationIops: Long = 0L,
            reservationBandwidth: Long = 0L,
            criticalReservationBandwidth: Long = 0L,
            maxTimePercent: Long = 0L,
            reservationTimePercent: Long = 0L,
            criticalReservationTimePercent: Long = 0L,
        ): JobobjectIoRateControlInformationNativeV2 =
            JobobjectIoRateControlInformationNativeV2(
                maxIops = maxIops,
                maxBandwidth = maxBandwidth,
                reservationIops = reservationIops,
                volumeNameCtorArg = volumeName,
                baseIoSize = baseIoSize,
                controlFlags = controlFlags,
                volumeNameLength = volumeNameLength,
                criticalReservationIops = criticalReservationIops,
                reservationBandwidth = reservationBandwidth,
                criticalReservationBandwidth = criticalReservationBandwidth,
                maxTimePercent = maxTimePercent,
                reservationTimePercent = reservationTimePercent,
                criticalReservationTimePercent = criticalReservationTimePercent,
            )
    }
}

public class JobobjectIoRateControlInformationNativeV3 internal constructor(
    public var maxIops: Long,
    public var maxBandwidth: Long,
    public var reservationIops: Long,
    volumeNameCtorArg: Pwstr,
    public var baseIoSize: UInt,
    public var controlFlags: JobObjectIoRateControlFlags,
    public var volumeNameLength: UShort,
    public var criticalReservationIops: Long,
    public var reservationBandwidth: Long,
    public var criticalReservationBandwidth: Long,
    public var maxTimePercent: Long,
    public var reservationTimePercent: Long,
    public var criticalReservationTimePercent: Long,
    public var softMaxIops: Long,
    public var softMaxBandwidth: Long,
    public var softMaxTimePercent: Long,
    public var limitExcessNotifyIops: Long,
    public var limitExcessNotifyBandwidth: Long,
    public var limitExcessNotifyTimePercent: Long,
) {
    public var volumeName: Pwstr = volumeNameCtorArg
        internal set

    public constructor() : this(
        maxIops = 0L,
        maxBandwidth = 0L,
        reservationIops = 0L,
        volumeNameCtorArg = MutPtr(0L),
        baseIoSize = 0u,
        controlFlags = 0,
        volumeNameLength = 0u,
        criticalReservationIops = 0L,
        reservationBandwidth = 0L,
        criticalReservationBandwidth = 0L,
        maxTimePercent = 0L,
        reservationTimePercent = 0L,
        criticalReservationTimePercent = 0L,
        softMaxIops = 0L,
        softMaxBandwidth = 0L,
        softMaxTimePercent = 0L,
        limitExcessNotifyIops = 0L,
        limitExcessNotifyBandwidth = 0L,
        limitExcessNotifyTimePercent = 0L,
    )

    public companion object {
        public operator fun invoke(
            maxIops: Long = 0L,
            maxBandwidth: Long = 0L,
            reservationIops: Long = 0L,
            volumeName: Pwstr = MutPtr(0L),
            baseIoSize: UInt = 0u,
            controlFlags: JobObjectIoRateControlFlags = 0,
            volumeNameLength: UShort = 0u,
            criticalReservationIops: Long = 0L,
            reservationBandwidth: Long = 0L,
            criticalReservationBandwidth: Long = 0L,
            maxTimePercent: Long = 0L,
            reservationTimePercent: Long = 0L,
            criticalReservationTimePercent: Long = 0L,
            softMaxIops: Long = 0L,
            softMaxBandwidth: Long = 0L,
            softMaxTimePercent: Long = 0L,
            limitExcessNotifyIops: Long = 0L,
            limitExcessNotifyBandwidth: Long = 0L,
            limitExcessNotifyTimePercent: Long = 0L,
        ): JobobjectIoRateControlInformationNativeV3 =
            JobobjectIoRateControlInformationNativeV3(
                maxIops = maxIops,
                maxBandwidth = maxBandwidth,
                reservationIops = reservationIops,
                volumeNameCtorArg = volumeName,
                baseIoSize = baseIoSize,
                controlFlags = controlFlags,
                volumeNameLength = volumeNameLength,
                criticalReservationIops = criticalReservationIops,
                reservationBandwidth = reservationBandwidth,
                criticalReservationBandwidth = criticalReservationBandwidth,
                maxTimePercent = maxTimePercent,
                reservationTimePercent = reservationTimePercent,
                criticalReservationTimePercent = criticalReservationTimePercent,
                softMaxIops = softMaxIops,
                softMaxBandwidth = softMaxBandwidth,
                softMaxTimePercent = softMaxTimePercent,
                limitExcessNotifyIops = limitExcessNotifyIops,
                limitExcessNotifyBandwidth = limitExcessNotifyBandwidth,
                limitExcessNotifyTimePercent = limitExcessNotifyTimePercent,
            )
    }
}

public data class JobobjectJobsetInformation(
    public var memberLevel: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectJobsetInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectJobsetInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): JobobjectJobsetInformation =
                    JobobjectJobsetInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: JobobjectJobsetInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.memberLevel)
                }
            }
    }
}

public data class JobobjectLimitViolationInformation(
    public var limitFlags: JobObjectLimit = 0u,
    public var violationLimitFlags: JobObjectLimit = 0u,
    public var ioReadBytes: ULong = 0uL,
    public var ioReadBytesLimit: ULong = 0uL,
    public var ioWriteBytes: ULong = 0uL,
    public var ioWriteBytesLimit: ULong = 0uL,
    public var perJobUserTime: Long = 0L,
    public var perJobUserTimeLimit: Long = 0L,
    public var jobMemory: ULong = 0uL,
    public var jobMemoryLimit: ULong = 0uL,
    public var rateControlTolerance: JobobjectRateControlTolerance = 0,
    public var rateControlToleranceLimit: JobobjectRateControlTolerance = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectLimitViolationInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectLimitViolationInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): JobobjectLimitViolationInformation =
                    JobobjectLimitViolationInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 76L),
                    )
                override fun writeNative(addr: Long, value: JobobjectLimitViolationInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.limitFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.violationLimitFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ioReadBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ioReadBytesLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ioWriteBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ioWriteBytesLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.perJobUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.perJobUserTimeLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.jobMemory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.jobMemoryLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.rateControlTolerance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 76L, value.rateControlToleranceLimit)
                }
            }
    }
}

public class JobobjectLimitViolationInformation2(
    public var limitFlags: JobObjectLimit = 0u,
    public var violationLimitFlags: JobObjectLimit = 0u,
    public var ioReadBytes: ULong = 0uL,
    public var ioReadBytesLimit: ULong = 0uL,
    public var ioWriteBytes: ULong = 0uL,
    public var ioWriteBytesLimit: ULong = 0uL,
    public var perJobUserTime: Long = 0L,
    public var perJobUserTimeLimit: Long = 0L,
    public var jobMemory: ULong = 0uL,
    public var anonymous1: JobobjectLimitViolationInformation20 = JobobjectLimitViolationInformation20(),
    public var anonymous2: JobobjectLimitViolationInformation21 = JobobjectLimitViolationInformation21(),
    public var anonymous3: JobobjectLimitViolationInformation22 = JobobjectLimitViolationInformation22(),
    public var jobLowMemoryLimit: ULong = 0uL,
    public var ioRateControlTolerance: JobobjectRateControlTolerance = 0,
    public var ioRateControlToleranceLimit: JobobjectRateControlTolerance = 0,
    public var netRateControlTolerance: JobobjectRateControlTolerance = 0,
    public var netRateControlToleranceLimit: JobobjectRateControlTolerance = 0,
)

public data class JobobjectLimitViolationInformation20(
    public var jobHighMemoryLimit: ULong = 0uL,
    public var jobMemoryLimit: ULong = 0uL,
)

public data class JobobjectLimitViolationInformation21(
    public var rateControlTolerance: JobobjectRateControlTolerance = 0,
    public var cpuRateControlTolerance: JobobjectRateControlTolerance = 0,
)

public data class JobobjectLimitViolationInformation22(
    public var rateControlToleranceLimit: JobobjectRateControlTolerance = 0,
    public var cpuRateControlToleranceLimit: JobobjectRateControlTolerance = 0,
)

public data class JobobjectNetRateControlInformation(
    public var maxBandwidth: ULong = 0uL,
    public var controlFlags: JobObjectNetRateControlFlags = 0,
    public var dscpTag: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectNetRateControlInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectNetRateControlInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): JobobjectNetRateControlInformation =
                    JobobjectNetRateControlInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: JobobjectNetRateControlInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.maxBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.controlFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.dscpTag)
                }
            }
    }
}

public data class JobobjectNotificationLimitInformation(
    public var ioReadBytesLimit: ULong = 0uL,
    public var ioWriteBytesLimit: ULong = 0uL,
    public var perJobUserTimeLimit: Long = 0L,
    public var jobMemoryLimit: ULong = 0uL,
    public var rateControlTolerance: JobobjectRateControlTolerance = 0,
    public var rateControlToleranceInterval: JobobjectRateControlToleranceInterval = 0,
    public var limitFlags: JobObjectLimit = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectNotificationLimitInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobobjectNotificationLimitInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): JobobjectNotificationLimitInformation =
                    JobobjectNotificationLimitInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: JobobjectNotificationLimitInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ioReadBytesLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ioWriteBytesLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.perJobUserTimeLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.jobMemoryLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.rateControlTolerance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.rateControlToleranceInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.limitFlags)
                }
            }
    }
}

public data class JobobjectNotificationLimitInformation2(
    public var ioReadBytesLimit: ULong = 0uL,
    public var ioWriteBytesLimit: ULong = 0uL,
    public var perJobUserTimeLimit: Long = 0L,
    public var anonymous1: JobobjectNotificationLimitInformation20 = JobobjectNotificationLimitInformation20(),
    public var anonymous2: JobobjectNotificationLimitInformation21 = JobobjectNotificationLimitInformation21(),
    public var anonymous3: JobobjectNotificationLimitInformation22 = JobobjectNotificationLimitInformation22(),
    public var limitFlags: JobObjectLimit = 0u,
    public var ioRateControlTolerance: JobobjectRateControlTolerance = 0,
    public var jobLowMemoryLimit: ULong = 0uL,
    public var ioRateControlToleranceInterval: JobobjectRateControlToleranceInterval = 0,
    public var netRateControlTolerance: JobobjectRateControlTolerance = 0,
    public var netRateControlToleranceInterval: JobobjectRateControlToleranceInterval = 0,
)

public data class JobobjectNotificationLimitInformation20(
    public var jobHighMemoryLimit: ULong = 0uL,
    public var jobMemoryLimit: ULong = 0uL,
)

public data class JobobjectNotificationLimitInformation21(
    public var rateControlTolerance: JobobjectRateControlTolerance = 0,
    public var cpuRateControlTolerance: JobobjectRateControlTolerance = 0,
)

public data class JobobjectNotificationLimitInformation22(
    public var rateControlToleranceInterval: JobobjectRateControlToleranceInterval = 0,
    public var cpuRateControlToleranceInterval: JobobjectRateControlToleranceInterval = 0,
)

public class JobobjectSecurityLimitInformation internal constructor(
    public var securityLimitFlags: JobObjectSecurity,
    jobTokenCtorArg: Handle,
    sidsToDisableCtorArg: MutPtr<TokenGroups>,
    privilegesToDeleteCtorArg: MutPtr<TokenPrivileges>,
    restrictedSidsCtorArg: MutPtr<TokenGroups>,
) {
    public var jobToken: Handle = jobTokenCtorArg
        internal set

    public var sidsToDisable: MutPtr<TokenGroups> = sidsToDisableCtorArg
        internal set

    public var privilegesToDelete: MutPtr<TokenPrivileges> = privilegesToDeleteCtorArg
        internal set

    public var restrictedSids: MutPtr<TokenGroups> = restrictedSidsCtorArg
        internal set

    public constructor() : this(
        securityLimitFlags = 0u,
        jobTokenCtorArg = MutPtr(0L),
        sidsToDisableCtorArg = MutPtr(0L),
        privilegesToDeleteCtorArg = MutPtr(0L),
        restrictedSidsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): JobObjectSecurity = this.securityLimitFlags

    public operator fun component2(): Handle = this.jobToken

    public operator fun component3(): MutPtr<TokenGroups> = this.sidsToDisable

    public operator fun component4(): MutPtr<TokenPrivileges> = this.privilegesToDelete

    public operator fun component5(): MutPtr<TokenGroups> = this.restrictedSids

    public fun copy(securityLimitFlags: JobObjectSecurity = this.securityLimitFlags, jobToken: Handle = this.jobToken, sidsToDisable: MutPtr<TokenGroups> = this.sidsToDisable, privilegesToDelete: MutPtr<TokenPrivileges> = this.privilegesToDelete, restrictedSids: MutPtr<TokenGroups> = this.restrictedSids): JobobjectSecurityLimitInformation = JobobjectSecurityLimitInformation(securityLimitFlags = securityLimitFlags, jobTokenCtorArg = jobToken, sidsToDisableCtorArg = sidsToDisable, privilegesToDeleteCtorArg = privilegesToDelete, restrictedSidsCtorArg = restrictedSids)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JobobjectSecurityLimitInformation) return false
        if (this.securityLimitFlags != other.securityLimitFlags) return false
        if (this.jobToken != other.jobToken) return false
        if (this.sidsToDisable != other.sidsToDisable) return false
        if (this.privilegesToDelete != other.privilegesToDelete) return false
        if (this.restrictedSids != other.restrictedSids) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityLimitFlags.hashCode()
        result = 31 * result + this.jobToken.hashCode()
        result = 31 * result + this.sidsToDisable.hashCode()
        result = 31 * result + this.privilegesToDelete.hashCode()
        result = 31 * result + this.restrictedSids.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            securityLimitFlags: JobObjectSecurity = 0u,
            jobToken: Handle = MutPtr(0L),
            sidsToDisable: MutPtr<TokenGroups> = MutPtr(0L),
            privilegesToDelete: MutPtr<TokenPrivileges> = MutPtr(0L),
            restrictedSids: MutPtr<TokenGroups> = MutPtr(0L),
        ): JobobjectSecurityLimitInformation =
            JobobjectSecurityLimitInformation(
                securityLimitFlags = securityLimitFlags,
                jobTokenCtorArg = jobToken,
                sidsToDisableCtorArg = sidsToDisable,
                privilegesToDeleteCtorArg = privilegesToDelete,
                restrictedSidsCtorArg = restrictedSids,
            )
    }
}

public class JobSetArray internal constructor(
    jobHandleCtorArg: Handle,
    public var memberLevel: UInt,
    public var flags: UInt,
) {
    public var jobHandle: Handle = jobHandleCtorArg
        internal set

    public constructor() : this(
        jobHandleCtorArg = MutPtr(0L),
        memberLevel = 0u,
        flags = 0u,
    )

    public operator fun component1(): Handle = this.jobHandle

    public operator fun component2(): UInt = this.memberLevel

    public operator fun component3(): UInt = this.flags

    public fun copy(jobHandle: Handle = this.jobHandle, memberLevel: UInt = this.memberLevel, flags: UInt = this.flags): JobSetArray = JobSetArray(jobHandleCtorArg = jobHandle, memberLevel = memberLevel, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JobSetArray) return false
        if (this.jobHandle != other.jobHandle) return false
        if (this.memberLevel != other.memberLevel) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.jobHandle.hashCode()
        result = 31 * result + this.memberLevel.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            jobHandle: Handle = MutPtr(0L),
            memberLevel: UInt = 0u,
            flags: UInt = 0u,
        ): JobSetArray =
            JobSetArray(
                jobHandleCtorArg = jobHandle,
                memberLevel = memberLevel,
                flags = flags,
            )
    }
}
