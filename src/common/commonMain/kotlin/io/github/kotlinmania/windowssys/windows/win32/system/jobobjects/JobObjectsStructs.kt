package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenPrivileges
import io.github.kotlinmania.windowssys.windows.win32.system.threading.IoCounters

public data class JobobjectAssociateCompletionPort(public var completionKey: COpaquePointer? = null, public var completionPort: Handle = null)

public data class JobobjectBasicAccountingInformation(
    public var totalUserTime: Long = 0L,
    public var totalKernelTime: Long = 0L,
    public var thisPeriodTotalUserTime: Long = 0L,
    public var thisPeriodTotalKernelTime: Long = 0L,
    public var totalPageFaultCount: UInt = 0u,
    public var totalProcesses: UInt = 0u,
    public var activeProcesses: UInt = 0u,
    public var totalTerminatedProcesses: UInt = 0u,
)

public data class JobobjectBasicAndIoAccountingInformation(public var basicInfo: JobobjectBasicAccountingInformation = JobobjectBasicAccountingInformation(), public var ioInfo: IoCounters = IoCounters())

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
)

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
}

public data class JobobjectBasicUiRestrictions(public var uIRestrictionsClass: JobObjectUilimit = 0u)

public data class JobobjectCpuRateControlInformation(public var controlFlags: JobObjectCpuRateControl = 0u, public var anonymous: JobobjectCpuRateControlInformation0 = JobobjectCpuRateControlInformation0())

public data class JobobjectCpuRateControlInformation0(
    public var cpuRate: UInt = 0u,
    public var weight: UInt = 0u,
    public var anonymous: JobobjectCpuRateControlInformation00 = JobobjectCpuRateControlInformation00(),
)

public data class JobobjectCpuRateControlInformation00(public var minRate: UShort = 0u, public var maxRate: UShort = 0u)

public data class JobobjectEndOfJobTimeInformation(public var endOfJobTimeAction: JobObjectTerminateAtEndAction = 0u)

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
)

public data class JobobjectIoAttributionStats(
    public var ioCount: Int = 0,
    public var totalNonOverlappedQueueTime: ULong = 0uL,
    public var totalNonOverlappedServiceTime: ULong = 0uL,
    public var totalSize: ULong = 0uL,
)

public data class JobobjectIoRateControlInformation(
    public var maxIops: Long = 0L,
    public var maxBandwidth: Long = 0L,
    public var reservationIops: Long = 0L,
    public var volumeName: Pcwstr = null,
    public var baseIoSize: UInt = 0u,
    public var controlFlags: UInt = 0u,
)

public data class JobobjectIoRateControlInformationNativeV1(
    public var maxIops: Long = 0L,
    public var maxBandwidth: Long = 0L,
    public var reservationIops: Long = 0L,
    public var volumeName: Pwstr = null,
    public var baseIoSize: UInt = 0u,
    public var controlFlags: JobObjectIoRateControlFlags = 0,
    public var volumeNameLength: UShort = 0u,
)

public data class JobobjectIoRateControlInformationNativeV2(
    public var maxIops: Long = 0L,
    public var maxBandwidth: Long = 0L,
    public var reservationIops: Long = 0L,
    public var volumeName: Pwstr = null,
    public var baseIoSize: UInt = 0u,
    public var controlFlags: JobObjectIoRateControlFlags = 0,
    public var volumeNameLength: UShort = 0u,
    public var criticalReservationIops: Long = 0L,
    public var reservationBandwidth: Long = 0L,
    public var criticalReservationBandwidth: Long = 0L,
    public var maxTimePercent: Long = 0L,
    public var reservationTimePercent: Long = 0L,
    public var criticalReservationTimePercent: Long = 0L,
)

public class JobobjectIoRateControlInformationNativeV3(
    public var maxIops: Long = 0L,
    public var maxBandwidth: Long = 0L,
    public var reservationIops: Long = 0L,
    public var volumeName: Pwstr = null,
    public var baseIoSize: UInt = 0u,
    public var controlFlags: JobObjectIoRateControlFlags = 0,
    public var volumeNameLength: UShort = 0u,
    public var criticalReservationIops: Long = 0L,
    public var reservationBandwidth: Long = 0L,
    public var criticalReservationBandwidth: Long = 0L,
    public var maxTimePercent: Long = 0L,
    public var reservationTimePercent: Long = 0L,
    public var criticalReservationTimePercent: Long = 0L,
    public var softMaxIops: Long = 0L,
    public var softMaxBandwidth: Long = 0L,
    public var softMaxTimePercent: Long = 0L,
    public var limitExcessNotifyIops: Long = 0L,
    public var limitExcessNotifyBandwidth: Long = 0L,
    public var limitExcessNotifyTimePercent: Long = 0L,
)

public data class JobobjectJobsetInformation(public var memberLevel: UInt = 0u)

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
)

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

public data class JobobjectLimitViolationInformation20(public var jobHighMemoryLimit: ULong = 0uL, public var jobMemoryLimit: ULong = 0uL)

public data class JobobjectLimitViolationInformation21(public var rateControlTolerance: JobobjectRateControlTolerance = 0, public var cpuRateControlTolerance: JobobjectRateControlTolerance = 0)

public data class JobobjectLimitViolationInformation22(public var rateControlToleranceLimit: JobobjectRateControlTolerance = 0, public var cpuRateControlToleranceLimit: JobobjectRateControlTolerance = 0)

public data class JobobjectNetRateControlInformation(
    public var maxBandwidth: ULong = 0uL,
    public var controlFlags: JobObjectNetRateControlFlags = 0,
    public var dscpTag: UByte = 0u,
)

public data class JobobjectNotificationLimitInformation(
    public var ioReadBytesLimit: ULong = 0uL,
    public var ioWriteBytesLimit: ULong = 0uL,
    public var perJobUserTimeLimit: Long = 0L,
    public var jobMemoryLimit: ULong = 0uL,
    public var rateControlTolerance: JobobjectRateControlTolerance = 0,
    public var rateControlToleranceInterval: JobobjectRateControlToleranceInterval = 0,
    public var limitFlags: JobObjectLimit = 0u,
)

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

public data class JobobjectNotificationLimitInformation20(public var jobHighMemoryLimit: ULong = 0uL, public var jobMemoryLimit: ULong = 0uL)

public data class JobobjectNotificationLimitInformation21(public var rateControlTolerance: JobobjectRateControlTolerance = 0, public var cpuRateControlTolerance: JobobjectRateControlTolerance = 0)

public data class JobobjectNotificationLimitInformation22(public var rateControlToleranceInterval: JobobjectRateControlToleranceInterval = 0, public var cpuRateControlToleranceInterval: JobobjectRateControlToleranceInterval = 0)

public data class JobobjectSecurityLimitInformation(
    public var securityLimitFlags: JobObjectSecurity = 0u,
    public var jobToken: Handle = null,
    public var sidsToDisable: TokenGroups? = null,
    public var privilegesToDelete: TokenPrivileges? = null,
    public var restrictedSids: TokenGroups? = null,
)

public data class JobSetArray(
    public var jobHandle: Handle = null,
    public var memberLevel: UInt = 0u,
    public var flags: UInt = 0u,
)
