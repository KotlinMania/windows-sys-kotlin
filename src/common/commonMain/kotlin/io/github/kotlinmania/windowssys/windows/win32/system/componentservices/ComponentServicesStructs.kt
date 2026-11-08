@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.system.com.BLOB

public data class APPDATA(
    public var m_idApp: UInt = 0u,
    public var m_szAppGuid: UShortArray = UShortArray(40),
    public var m_dwAppProcessId: UInt = 0u,
    public var m_AppStatistics: APPSTATISTICS = APPSTATISTICS(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is APPDATA) return false
        if (this.m_idApp != other.m_idApp) return false
        if (!this.m_szAppGuid.contentEquals(other.m_szAppGuid)) return false
        if (this.m_dwAppProcessId != other.m_dwAppProcessId) return false
        if (this.m_AppStatistics != other.m_AppStatistics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.m_idApp.hashCode()
        result = 31 * result + this.m_szAppGuid.contentHashCode()
        result = 31 * result + this.m_dwAppProcessId.hashCode()
        result = 31 * result + this.m_AppStatistics.hashCode()
        return result
    }
}

public data class APPSTATISTICS(
    public var m_cTotalCalls: UInt = 0u,
    public var m_cTotalInstances: UInt = 0u,
    public var m_cTotalClasses: UInt = 0u,
    public var m_cCallsPerSecond: UInt = 0u,
)

public data class ApplicationProcessRecycleInfo(
    public var IsRecyclable: BOOL = 0,
    public var IsRecycled: BOOL = 0,
    public var TimeRecycled: FILETIME = FILETIME(),
    public var TimeToTerminate: FILETIME = FILETIME(),
    public var RecycleReasonCode: Int = 0,
    public var IsPendingRecycle: BOOL = 0,
    public var HasAutomaticLifetimeRecycling: BOOL = 0,
    public var TimeForAutomaticRecycling: FILETIME = FILETIME(),
    public var MemoryLimitInKB: UInt = 0u,
    public var MemoryUsageInKBLastCheck: UInt = 0u,
    public var ActivationLimit: UInt = 0u,
    public var NumActivationsLastReported: UInt = 0u,
    public var CallLimit: UInt = 0u,
    public var NumCallsLastReported: UInt = 0u,
)

public data class ApplicationProcessStatistics(
    public var NumCallsOutstanding: UInt = 0u,
    public var NumTrackedComponents: UInt = 0u,
    public var NumComponentInstances: UInt = 0u,
    public var AvgCallsPerSecond: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var Reserved3: UInt = 0u,
    public var Reserved4: UInt = 0u,
)

public data class ApplicationProcessSummary(
    public var PartitionIdPrimaryApplication: GUID = GUID(),
    public var ApplicationIdPrimaryApplication: GUID = GUID(),
    public var ApplicationInstanceId: GUID = GUID(),
    public var ProcessId: UInt = 0u,
    public var Type: COMPLUS_APPTYPE = 0,
    public var ProcessExeName: PWSTR = 0L,
    public var IsService: BOOL = 0,
    public var IsPaused: BOOL = 0,
    public var IsRecycled: BOOL = 0,
)

public data class ApplicationSummary(
    public var ApplicationInstanceId: GUID = GUID(),
    public var PartitionId: GUID = GUID(),
    public var ApplicationId: GUID = GUID(),
    public var Type: COMPLUS_APPTYPE = 0,
    public var ApplicationName: PWSTR = 0L,
    public var NumTrackedComponents: UInt = 0u,
    public var NumComponentInstances: UInt = 0u,
)

public data class CLSIDDATA(
    public var m_clsid: GUID = GUID(),
    public var m_cReferences: UInt = 0u,
    public var m_cBound: UInt = 0u,
    public var m_cPooled: UInt = 0u,
    public var m_cInCall: UInt = 0u,
    public var m_dwRespTime: UInt = 0u,
    public var m_cCallsCompleted: UInt = 0u,
    public var m_cCallsFailed: UInt = 0u,
)

public data class CLSIDDATA2(
    public var m_clsid: GUID = GUID(),
    public var m_appid: GUID = GUID(),
    public var m_partid: GUID = GUID(),
    public var m_pwszAppName: PWSTR = 0L,
    public var m_pwszCtxName: PWSTR = 0L,
    public var m_eAppType: COMPLUS_APPTYPE = 0,
    public var m_cReferences: UInt = 0u,
    public var m_cBound: UInt = 0u,
    public var m_cPooled: UInt = 0u,
    public var m_cInCall: UInt = 0u,
    public var m_dwRespTime: UInt = 0u,
    public var m_cCallsCompleted: UInt = 0u,
    public var m_cCallsFailed: UInt = 0u,
)

public data class COMSVCSEVENTINFO(
    public var cbSize: UInt = 0u,
    public var dwPid: UInt = 0u,
    public var lTime: Long = 0L,
    public var lMicroTime: Int = 0,
    public var perfCount: Long = 0L,
    public var guidApp: GUID = GUID(),
    public var sMachineName: PWSTR = 0L,
)

public data class ComponentHangMonitorInfo(
    public var IsMonitored: BOOL = 0,
    public var TerminateOnHang: BOOL = 0,
    public var AvgCallThresholdInMs: UInt = 0u,
)

public data class ComponentStatistics(
    public var NumInstances: UInt = 0u,
    public var NumBoundReferences: UInt = 0u,
    public var NumPooledObjects: UInt = 0u,
    public var NumObjectsInCall: UInt = 0u,
    public var AvgResponseTimeInMs: UInt = 0u,
    public var NumCallsCompletedRecent: UInt = 0u,
    public var NumCallsFailedRecent: UInt = 0u,
    public var NumCallsCompletedTotal: UInt = 0u,
    public var NumCallsFailedTotal: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var Reserved3: UInt = 0u,
    public var Reserved4: UInt = 0u,
)

public data class ComponentSummary(
    public var ApplicationInstanceId: GUID = GUID(),
    public var PartitionId: GUID = GUID(),
    public var ApplicationId: GUID = GUID(),
    public var Clsid: GUID = GUID(),
    public var ClassName: PWSTR = 0L,
    public var ApplicationName: PWSTR = 0L,
)

public data class CrmLogRecordRead(
    public var dwCrmFlags: UInt = 0u,
    public var dwSequenceNumber: UInt = 0u,
    public var blobUserData: BLOB = BLOB(),
)

public data class HANG_INFO(
    public var fAppHangMonitorEnabled: BOOL = 0,
    public var fTerminateOnHang: BOOL = 0,
    public var DumpType: DUMPTYPE = 0,
    public var dwHangTimeout: UInt = 0u,
    public var dwDumpCount: UInt = 0u,
    public var dwInfoMsgCount: UInt = 0u,
)

public data class RECYCLE_INFO(
    public var guidCombaseProcessIdentifier: GUID = GUID(),
    public var ProcessStartTime: Long = 0L,
    public var dwRecycleLifetimeLimit: UInt = 0u,
    public var dwRecycleMemoryLimit: UInt = 0u,
    public var dwRecycleExpirationTimeout: UInt = 0u,
)
