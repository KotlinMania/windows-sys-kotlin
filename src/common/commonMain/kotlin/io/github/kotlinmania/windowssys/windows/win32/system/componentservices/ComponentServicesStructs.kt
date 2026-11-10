@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob

public data class Appdata(
    public var mIdApp: UInt = 0u,
    public var mSzAppGuid: UShortArray = UShortArray(40),
    public var mDwAppProcessId: UInt = 0u,
    public var mAppStatistics: Appstatistics = Appstatistics(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Appdata) return false
        if (this.mIdApp != other.mIdApp) return false
        if (!this.mSzAppGuid.contentEquals(other.mSzAppGuid)) return false
        if (this.mDwAppProcessId != other.mDwAppProcessId) return false
        if (this.mAppStatistics != other.mAppStatistics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mIdApp.hashCode()
        result = 31 * result + this.mSzAppGuid.contentHashCode()
        result = 31 * result + this.mDwAppProcessId.hashCode()
        result = 31 * result + this.mAppStatistics.hashCode()
        return result
    }
}

public data class Appstatistics(
    public var mCTotalCalls: UInt = 0u,
    public var mCTotalInstances: UInt = 0u,
    public var mCTotalClasses: UInt = 0u,
    public var mCCallsPerSecond: UInt = 0u,
)

public data class ApplicationProcessRecycleInfo(
    public var isRecyclable: Bool = 0,
    public var isRecycled: Bool = 0,
    public var timeRecycled: Filetime = Filetime(),
    public var timeToTerminate: Filetime = Filetime(),
    public var recycleReasonCode: Int = 0,
    public var isPendingRecycle: Bool = 0,
    public var hasAutomaticLifetimeRecycling: Bool = 0,
    public var timeForAutomaticRecycling: Filetime = Filetime(),
    public var memoryLimitInKB: UInt = 0u,
    public var memoryUsageInKBLastCheck: UInt = 0u,
    public var activationLimit: UInt = 0u,
    public var numActivationsLastReported: UInt = 0u,
    public var callLimit: UInt = 0u,
    public var numCallsLastReported: UInt = 0u,
)

public data class ApplicationProcessStatistics(
    public var numCallsOutstanding: UInt = 0u,
    public var numTrackedComponents: UInt = 0u,
    public var numComponentInstances: UInt = 0u,
    public var avgCallsPerSecond: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var reserved3: UInt = 0u,
    public var reserved4: UInt = 0u,
)

public data class ApplicationProcessSummary(
    public var partitionIdPrimaryApplication: Guid = Guid(),
    public var applicationIdPrimaryApplication: Guid = Guid(),
    public var applicationInstanceId: Guid = Guid(),
    public var processId: UInt = 0u,
    public var type: ComplusApptype = 0,
    public var processExeName: Pwstr = null,
    public var isService: Bool = 0,
    public var isPaused: Bool = 0,
    public var isRecycled: Bool = 0,
)

public data class ApplicationSummary(
    public var applicationInstanceId: Guid = Guid(),
    public var partitionId: Guid = Guid(),
    public var applicationId: Guid = Guid(),
    public var type: ComplusApptype = 0,
    public var applicationName: Pwstr = null,
    public var numTrackedComponents: UInt = 0u,
    public var numComponentInstances: UInt = 0u,
)

public data class Clsiddata(
    public var mClsid: Guid = Guid(),
    public var mCReferences: UInt = 0u,
    public var mCBound: UInt = 0u,
    public var mCPooled: UInt = 0u,
    public var mCInCall: UInt = 0u,
    public var mDwRespTime: UInt = 0u,
    public var mCCallsCompleted: UInt = 0u,
    public var mCCallsFailed: UInt = 0u,
)

public data class Clsiddata2(
    public var mClsid: Guid = Guid(),
    public var mAppid: Guid = Guid(),
    public var mPartid: Guid = Guid(),
    public var mPwszAppName: Pwstr = null,
    public var mPwszCtxName: Pwstr = null,
    public var mEAppType: ComplusApptype = 0,
    public var mCReferences: UInt = 0u,
    public var mCBound: UInt = 0u,
    public var mCPooled: UInt = 0u,
    public var mCInCall: UInt = 0u,
    public var mDwRespTime: UInt = 0u,
    public var mCCallsCompleted: UInt = 0u,
    public var mCCallsFailed: UInt = 0u,
)

public data class Comsvcseventinfo(
    public var cbSize: UInt = 0u,
    public var dwPid: UInt = 0u,
    public var lTime: Long = 0L,
    public var lMicroTime: Int = 0,
    public var perfCount: Long = 0L,
    public var guidApp: Guid = Guid(),
    public var sMachineName: Pwstr = null,
)

public data class ComponentHangMonitorInfo(
    public var isMonitored: Bool = 0,
    public var terminateOnHang: Bool = 0,
    public var avgCallThresholdInMs: UInt = 0u,
)

public data class ComponentStatistics(
    public var numInstances: UInt = 0u,
    public var numBoundReferences: UInt = 0u,
    public var numPooledObjects: UInt = 0u,
    public var numObjectsInCall: UInt = 0u,
    public var avgResponseTimeInMs: UInt = 0u,
    public var numCallsCompletedRecent: UInt = 0u,
    public var numCallsFailedRecent: UInt = 0u,
    public var numCallsCompletedTotal: UInt = 0u,
    public var numCallsFailedTotal: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var reserved3: UInt = 0u,
    public var reserved4: UInt = 0u,
)

public data class ComponentSummary(
    public var applicationInstanceId: Guid = Guid(),
    public var partitionId: Guid = Guid(),
    public var applicationId: Guid = Guid(),
    public var clsid: Guid = Guid(),
    public var className: Pwstr = null,
    public var applicationName: Pwstr = null,
)

public data class CrmLogRecordRead(
    public var dwCrmFlags: UInt = 0u,
    public var dwSequenceNumber: UInt = 0u,
    public var blobUserData: Blob = Blob(),
)

public data class HangInfo(
    public var fAppHangMonitorEnabled: Bool = 0,
    public var fTerminateOnHang: Bool = 0,
    public var dumpType: Dumptype = 0,
    public var dwHangTimeout: UInt = 0u,
    public var dwDumpCount: UInt = 0u,
    public var dwInfoMsgCount: UInt = 0u,
)

public data class RecycleInfo(
    public var guidCombaseProcessIdentifier: Guid = Guid(),
    public var processStartTime: Long = 0L,
    public var dwRecycleLifetimeLimit: UInt = 0u,
    public var dwRecycleMemoryLimit: UInt = 0u,
    public var dwRecycleExpirationTimeout: UInt = 0u,
)
