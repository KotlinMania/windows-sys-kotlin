@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class JOBOBJECT_ASSOCIATE_COMPLETION_PORT(public var CompletionKey: Long = 0L, public var CompletionPort: Foundation.HANDLE = Foundation.HANDLE())

public data class JOBOBJECT_BASIC_ACCOUNTING_INFORMATION(
    public var TotalUserTime: Long = 0L,
    public var TotalKernelTime: Long = 0L,
    public var ThisPeriodTotalUserTime: Long = 0L,
    public var ThisPeriodTotalKernelTime: Long = 0L,
    public var TotalPageFaultCount: UInt = 0u,
    public var TotalProcesses: UInt = 0u,
    public var ActiveProcesses: UInt = 0u,
    public var TotalTerminatedProcesses: UInt = 0u,
)

public data class JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION(public var BasicInfo: JOBOBJECT_BASIC_ACCOUNTING_INFORMATION = JOBOBJECT_BASIC_ACCOUNTING_INFORMATION(), public var IoInfo: Threading.IO_COUNTERS = Threading.IO_COUNTERS())

public data class JOBOBJECT_BASIC_LIMIT_INFORMATION(
    public var PerProcessUserTimeLimit: Long = 0L,
    public var PerJobUserTimeLimit: Long = 0L,
    public var LimitFlags: JOB_OBJECT_LIMIT = 0u,
    public var MinimumWorkingSetSize: ULong = 0uL,
    public var MaximumWorkingSetSize: ULong = 0uL,
    public var ActiveProcessLimit: UInt = 0u,
    public var Affinity: ULong = 0uL,
    public var PriorityClass: UInt = 0u,
    public var SchedulingClass: UInt = 0u,
)

public data class JOBOBJECT_BASIC_PROCESS_ID_LIST(
    public var NumberOfAssignedProcesses: UInt = 0u,
    public var NumberOfProcessIdsInList: UInt = 0u,
    public var ProcessIdList: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JOBOBJECT_BASIC_PROCESS_ID_LIST) return false
        if (this.NumberOfAssignedProcesses != other.NumberOfAssignedProcesses) return false
        if (this.NumberOfProcessIdsInList != other.NumberOfProcessIdsInList) return false
        if (!this.ProcessIdList.contentEquals(other.ProcessIdList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumberOfAssignedProcesses.hashCode()
        result = 31 * result + this.NumberOfProcessIdsInList.hashCode()
        result = 31 * result + this.ProcessIdList.contentHashCode()
        return result
    }
}

public data class JOBOBJECT_BASIC_UI_RESTRICTIONS(public var UIRestrictionsClass: JOB_OBJECT_UILIMIT = 0u)

public data class JOBOBJECT_CPU_RATE_CONTROL_INFORMATION(public var ControlFlags: JOB_OBJECT_CPU_RATE_CONTROL = 0u, public var Anonymous: JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0 = JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0())

public data class JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0(
    public var CpuRate: UInt = 0u,
    public var Weight: UInt = 0u,
    public var Anonymous: JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0_0 = JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0_0(),
)

public data class JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0_0(public var MinRate: UShort = 0u, public var MaxRate: UShort = 0u)

public data class JOBOBJECT_END_OF_JOB_TIME_INFORMATION(public var EndOfJobTimeAction: JOB_OBJECT_TERMINATE_AT_END_ACTION = 0u)

public data class JOBOBJECT_EXTENDED_LIMIT_INFORMATION(
    public var BasicLimitInformation: JOBOBJECT_BASIC_LIMIT_INFORMATION = JOBOBJECT_BASIC_LIMIT_INFORMATION(),
    public var IoInfo: Threading.IO_COUNTERS = Threading.IO_COUNTERS(),
    public var ProcessMemoryLimit: ULong = 0uL,
    public var JobMemoryLimit: ULong = 0uL,
    public var PeakProcessMemoryUsed: ULong = 0uL,
    public var PeakJobMemoryUsed: ULong = 0uL,
)

public data class JOBOBJECT_IO_ATTRIBUTION_INFORMATION(
    public var ControlFlags: UInt = 0u,
    public var ReadStats: JOBOBJECT_IO_ATTRIBUTION_STATS = JOBOBJECT_IO_ATTRIBUTION_STATS(),
    public var WriteStats: JOBOBJECT_IO_ATTRIBUTION_STATS = JOBOBJECT_IO_ATTRIBUTION_STATS(),
)

public data class JOBOBJECT_IO_ATTRIBUTION_STATS(
    public var IoCount: ULong = 0uL,
    public var TotalNonOverlappedQueueTime: ULong = 0uL,
    public var TotalNonOverlappedServiceTime: ULong = 0uL,
    public var TotalSize: ULong = 0uL,
)

public data class JOBOBJECT_IO_RATE_CONTROL_INFORMATION(
    public var MaxIops: Long = 0L,
    public var MaxBandwidth: Long = 0L,
    public var ReservationIops: Long = 0L,
    public var VolumeName: PCWSTR = 0L,
    public var BaseIoSize: UInt = 0u,
    public var ControlFlags: UInt = 0u,
)

public data class JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V1(
    public var MaxIops: Long = 0L,
    public var MaxBandwidth: Long = 0L,
    public var ReservationIops: Long = 0L,
    public var VolumeName: PWSTR = 0L,
    public var BaseIoSize: UInt = 0u,
    public var ControlFlags: JOB_OBJECT_IO_RATE_CONTROL_FLAGS = 0,
    public var VolumeNameLength: UShort = 0u,
)

public data class JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V2(
    public var MaxIops: Long = 0L,
    public var MaxBandwidth: Long = 0L,
    public var ReservationIops: Long = 0L,
    public var VolumeName: PWSTR = 0L,
    public var BaseIoSize: UInt = 0u,
    public var ControlFlags: JOB_OBJECT_IO_RATE_CONTROL_FLAGS = 0,
    public var VolumeNameLength: UShort = 0u,
    public var CriticalReservationIops: Long = 0L,
    public var ReservationBandwidth: Long = 0L,
    public var CriticalReservationBandwidth: Long = 0L,
    public var MaxTimePercent: Long = 0L,
    public var ReservationTimePercent: Long = 0L,
    public var CriticalReservationTimePercent: Long = 0L,
)

public class JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3(
    public var MaxIops: Long = 0L,
    public var MaxBandwidth: Long = 0L,
    public var ReservationIops: Long = 0L,
    public var VolumeName: PWSTR = 0L,
    public var BaseIoSize: UInt = 0u,
    public var ControlFlags: JOB_OBJECT_IO_RATE_CONTROL_FLAGS = 0,
    public var VolumeNameLength: UShort = 0u,
    public var CriticalReservationIops: Long = 0L,
    public var ReservationBandwidth: Long = 0L,
    public var CriticalReservationBandwidth: Long = 0L,
    public var MaxTimePercent: Long = 0L,
    public var ReservationTimePercent: Long = 0L,
    public var CriticalReservationTimePercent: Long = 0L,
    public var SoftMaxIops: Long = 0L,
    public var SoftMaxBandwidth: Long = 0L,
    public var SoftMaxTimePercent: Long = 0L,
    public var LimitExcessNotifyIops: Long = 0L,
    public var LimitExcessNotifyBandwidth: Long = 0L,
    public var LimitExcessNotifyTimePercent: Long = 0L,
)

public data class JOBOBJECT_JOBSET_INFORMATION(public var MemberLevel: UInt = 0u)

public data class JOBOBJECT_LIMIT_VIOLATION_INFORMATION(
    public var LimitFlags: JOB_OBJECT_LIMIT = 0u,
    public var ViolationLimitFlags: JOB_OBJECT_LIMIT = 0u,
    public var IoReadBytes: ULong = 0uL,
    public var IoReadBytesLimit: ULong = 0uL,
    public var IoWriteBytes: ULong = 0uL,
    public var IoWriteBytesLimit: ULong = 0uL,
    public var PerJobUserTime: Long = 0L,
    public var PerJobUserTimeLimit: Long = 0L,
    public var JobMemory: ULong = 0uL,
    public var JobMemoryLimit: ULong = 0uL,
    public var RateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0,
    public var RateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0,
)

public class JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2(
    public var LimitFlags: JOB_OBJECT_LIMIT = 0u,
    public var ViolationLimitFlags: JOB_OBJECT_LIMIT = 0u,
    public var IoReadBytes: ULong = 0uL,
    public var IoReadBytesLimit: ULong = 0uL,
    public var IoWriteBytes: ULong = 0uL,
    public var IoWriteBytesLimit: ULong = 0uL,
    public var PerJobUserTime: Long = 0L,
    public var PerJobUserTimeLimit: Long = 0L,
    public var JobMemory: ULong = 0uL,
    public var Anonymous1: JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_0 = JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_0(),
    public var Anonymous2: JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_1 = JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_1(),
    public var Anonymous3: JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_2 = JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_2(),
    public var JobLowMemoryLimit: ULong = 0uL,
    public var IoRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0,
    public var IoRateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0,
    public var NetRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0,
    public var NetRateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0,
)

public data class JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_0(public var JobHighMemoryLimit: ULong = 0uL, public var JobMemoryLimit: ULong = 0uL)

public data class JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_1(public var RateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0, public var CpuRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0)

public data class JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_2(public var RateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0, public var CpuRateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0)

public data class JOBOBJECT_NET_RATE_CONTROL_INFORMATION(
    public var MaxBandwidth: ULong = 0uL,
    public var ControlFlags: JOB_OBJECT_NET_RATE_CONTROL_FLAGS = 0,
    public var DscpTag: UByte = 0u,
)

public data class JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION(
    public var IoReadBytesLimit: ULong = 0uL,
    public var IoWriteBytesLimit: ULong = 0uL,
    public var PerJobUserTimeLimit: Long = 0L,
    public var JobMemoryLimit: ULong = 0uL,
    public var RateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0,
    public var RateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL = 0,
    public var LimitFlags: JOB_OBJECT_LIMIT = 0u,
)

public data class JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2(
    public var IoReadBytesLimit: ULong = 0uL,
    public var IoWriteBytesLimit: ULong = 0uL,
    public var PerJobUserTimeLimit: Long = 0L,
    public var Anonymous1: JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_0 = JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_0(),
    public var Anonymous2: JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_1 = JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_1(),
    public var Anonymous3: JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_2 = JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_2(),
    public var LimitFlags: JOB_OBJECT_LIMIT = 0u,
    public var IoRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0,
    public var JobLowMemoryLimit: ULong = 0uL,
    public var IoRateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL = 0,
    public var NetRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0,
    public var NetRateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL = 0,
)

public data class JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_0(public var JobHighMemoryLimit: ULong = 0uL, public var JobMemoryLimit: ULong = 0uL)

public data class JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_1(public var RateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0, public var CpuRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE = 0)

public data class JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_2(public var RateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL = 0, public var CpuRateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL = 0)

public data class JOBOBJECT_SECURITY_LIMIT_INFORMATION(
    public var SecurityLimitFlags: JOB_OBJECT_SECURITY = 0u,
    public var JobToken: Foundation.HANDLE = Foundation.HANDLE(),
    public var SidsToDisable: Long = 0L,
    public var PrivilegesToDelete: Long = 0L,
    public var RestrictedSids: Long = 0L,
)

public data class JOB_SET_ARRAY(
    public var JobHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var MemberLevel: UInt = 0u,
    public var Flags: UInt = 0u,
)
