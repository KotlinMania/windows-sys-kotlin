@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Appdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Appdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): Appdata =
                    Appdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (Appstatistics.typeLayout()).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: Appdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mIdApp)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                    ).writeNative(addr + 4L, value.mSzAppGuid.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.mDwAppProcessId)
                    (Appstatistics.typeLayout()).writeNative(addr + 88L, value.mAppStatistics)
                }
            }
    }
}

public data class Appstatistics(
    public var mCTotalCalls: UInt = 0u,
    public var mCTotalInstances: UInt = 0u,
    public var mCTotalClasses: UInt = 0u,
    public var mCCallsPerSecond: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Appstatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Appstatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Appstatistics =
                    Appstatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Appstatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mCTotalCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mCTotalInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mCTotalClasses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.mCCallsPerSecond)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ApplicationProcessStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ApplicationProcessStatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ApplicationProcessStatistics =
                    ApplicationProcessStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: ApplicationProcessStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numCallsOutstanding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numTrackedComponents)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numComponentInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.avgCallsPerSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.reserved4)
                }
            }
    }
}

public class ApplicationProcessSummary internal constructor(
    public var partitionIdPrimaryApplication: Guid,
    public var applicationIdPrimaryApplication: Guid,
    public var applicationInstanceId: Guid,
    public var processId: UInt,
    public var type: ComplusApptype,
    processExeNameCtorArg: Pwstr,
    public var isService: Bool,
    public var isPaused: Bool,
    public var isRecycled: Bool,
) {
    public var processExeName: Pwstr = processExeNameCtorArg
        internal set

    public constructor() : this(
        partitionIdPrimaryApplication = Guid(),
        applicationIdPrimaryApplication = Guid(),
        applicationInstanceId = Guid(),
        processId = 0u,
        type = 0,
        processExeNameCtorArg = MutPtr(0L),
        isService = 0,
        isPaused = 0,
        isRecycled = 0,
    )

    public operator fun component1(): Guid = this.partitionIdPrimaryApplication

    public operator fun component2(): Guid = this.applicationIdPrimaryApplication

    public operator fun component3(): Guid = this.applicationInstanceId

    public operator fun component4(): UInt = this.processId

    public operator fun component5(): ComplusApptype = this.type

    public operator fun component6(): Pwstr = this.processExeName

    public operator fun component7(): Bool = this.isService

    public operator fun component8(): Bool = this.isPaused

    public operator fun component9(): Bool = this.isRecycled

    public fun copy(partitionIdPrimaryApplication: Guid = this.partitionIdPrimaryApplication, applicationIdPrimaryApplication: Guid = this.applicationIdPrimaryApplication, applicationInstanceId: Guid = this.applicationInstanceId, processId: UInt = this.processId, type: ComplusApptype = this.type, processExeName: Pwstr = this.processExeName, isService: Bool = this.isService, isPaused: Bool = this.isPaused, isRecycled: Bool = this.isRecycled): ApplicationProcessSummary = ApplicationProcessSummary(partitionIdPrimaryApplication = partitionIdPrimaryApplication, applicationIdPrimaryApplication = applicationIdPrimaryApplication, applicationInstanceId = applicationInstanceId, processId = processId, type = type, processExeNameCtorArg = processExeName, isService = isService, isPaused = isPaused, isRecycled = isRecycled)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ApplicationProcessSummary) return false
        if (this.partitionIdPrimaryApplication != other.partitionIdPrimaryApplication) return false
        if (this.applicationIdPrimaryApplication != other.applicationIdPrimaryApplication) return false
        if (this.applicationInstanceId != other.applicationInstanceId) return false
        if (this.processId != other.processId) return false
        if (this.type != other.type) return false
        if (this.processExeName != other.processExeName) return false
        if (this.isService != other.isService) return false
        if (this.isPaused != other.isPaused) return false
        if (this.isRecycled != other.isRecycled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.partitionIdPrimaryApplication.hashCode()
        result = 31 * result + this.applicationIdPrimaryApplication.hashCode()
        result = 31 * result + this.applicationInstanceId.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.processExeName.hashCode()
        result = 31 * result + this.isService.hashCode()
        result = 31 * result + this.isPaused.hashCode()
        result = 31 * result + this.isRecycled.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            partitionIdPrimaryApplication: Guid = Guid(),
            applicationIdPrimaryApplication: Guid = Guid(),
            applicationInstanceId: Guid = Guid(),
            processId: UInt = 0u,
            type: ComplusApptype = 0,
            processExeName: Pwstr = MutPtr(0L),
            isService: Bool = 0,
            isPaused: Bool = 0,
            isRecycled: Bool = 0,
        ): ApplicationProcessSummary =
            ApplicationProcessSummary(
                partitionIdPrimaryApplication = partitionIdPrimaryApplication,
                applicationIdPrimaryApplication = applicationIdPrimaryApplication,
                applicationInstanceId = applicationInstanceId,
                processId = processId,
                type = type,
                processExeNameCtorArg = processExeName,
                isService = isService,
                isPaused = isPaused,
                isRecycled = isRecycled,
            )
    }
}

public class ApplicationSummary internal constructor(
    public var applicationInstanceId: Guid,
    public var partitionId: Guid,
    public var applicationId: Guid,
    public var type: ComplusApptype,
    applicationNameCtorArg: Pwstr,
    public var numTrackedComponents: UInt,
    public var numComponentInstances: UInt,
) {
    public var applicationName: Pwstr = applicationNameCtorArg
        internal set

    public constructor() : this(
        applicationInstanceId = Guid(),
        partitionId = Guid(),
        applicationId = Guid(),
        type = 0,
        applicationNameCtorArg = MutPtr(0L),
        numTrackedComponents = 0u,
        numComponentInstances = 0u,
    )

    public operator fun component1(): Guid = this.applicationInstanceId

    public operator fun component2(): Guid = this.partitionId

    public operator fun component3(): Guid = this.applicationId

    public operator fun component4(): ComplusApptype = this.type

    public operator fun component5(): Pwstr = this.applicationName

    public operator fun component6(): UInt = this.numTrackedComponents

    public operator fun component7(): UInt = this.numComponentInstances

    public fun copy(applicationInstanceId: Guid = this.applicationInstanceId, partitionId: Guid = this.partitionId, applicationId: Guid = this.applicationId, type: ComplusApptype = this.type, applicationName: Pwstr = this.applicationName, numTrackedComponents: UInt = this.numTrackedComponents, numComponentInstances: UInt = this.numComponentInstances): ApplicationSummary = ApplicationSummary(applicationInstanceId = applicationInstanceId, partitionId = partitionId, applicationId = applicationId, type = type, applicationNameCtorArg = applicationName, numTrackedComponents = numTrackedComponents, numComponentInstances = numComponentInstances)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ApplicationSummary) return false
        if (this.applicationInstanceId != other.applicationInstanceId) return false
        if (this.partitionId != other.partitionId) return false
        if (this.applicationId != other.applicationId) return false
        if (this.type != other.type) return false
        if (this.applicationName != other.applicationName) return false
        if (this.numTrackedComponents != other.numTrackedComponents) return false
        if (this.numComponentInstances != other.numComponentInstances) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.applicationInstanceId.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.applicationId.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.applicationName.hashCode()
        result = 31 * result + this.numTrackedComponents.hashCode()
        result = 31 * result + this.numComponentInstances.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            applicationInstanceId: Guid = Guid(),
            partitionId: Guid = Guid(),
            applicationId: Guid = Guid(),
            type: ComplusApptype = 0,
            applicationName: Pwstr = MutPtr(0L),
            numTrackedComponents: UInt = 0u,
            numComponentInstances: UInt = 0u,
        ): ApplicationSummary =
            ApplicationSummary(
                applicationInstanceId = applicationInstanceId,
                partitionId = partitionId,
                applicationId = applicationId,
                type = type,
                applicationNameCtorArg = applicationName,
                numTrackedComponents = numTrackedComponents,
                numComponentInstances = numComponentInstances,
            )
    }
}

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

public class Clsiddata2 internal constructor(
    public var mClsid: Guid,
    public var mAppid: Guid,
    public var mPartid: Guid,
    mPwszAppNameCtorArg: Pwstr,
    mPwszCtxNameCtorArg: Pwstr,
    public var mEAppType: ComplusApptype,
    public var mCReferences: UInt,
    public var mCBound: UInt,
    public var mCPooled: UInt,
    public var mCInCall: UInt,
    public var mDwRespTime: UInt,
    public var mCCallsCompleted: UInt,
    public var mCCallsFailed: UInt,
) {
    public var mPwszAppName: Pwstr = mPwszAppNameCtorArg
        internal set

    public var mPwszCtxName: Pwstr = mPwszCtxNameCtorArg
        internal set

    public constructor() : this(
        mClsid = Guid(),
        mAppid = Guid(),
        mPartid = Guid(),
        mPwszAppNameCtorArg = MutPtr(0L),
        mPwszCtxNameCtorArg = MutPtr(0L),
        mEAppType = 0,
        mCReferences = 0u,
        mCBound = 0u,
        mCPooled = 0u,
        mCInCall = 0u,
        mDwRespTime = 0u,
        mCCallsCompleted = 0u,
        mCCallsFailed = 0u,
    )

    public operator fun component1(): Guid = this.mClsid

    public operator fun component2(): Guid = this.mAppid

    public operator fun component3(): Guid = this.mPartid

    public operator fun component4(): Pwstr = this.mPwszAppName

    public operator fun component5(): Pwstr = this.mPwszCtxName

    public operator fun component6(): ComplusApptype = this.mEAppType

    public operator fun component7(): UInt = this.mCReferences

    public operator fun component8(): UInt = this.mCBound

    public operator fun component9(): UInt = this.mCPooled

    public operator fun component10(): UInt = this.mCInCall

    public operator fun component11(): UInt = this.mDwRespTime

    public operator fun component12(): UInt = this.mCCallsCompleted

    public operator fun component13(): UInt = this.mCCallsFailed

    public fun copy(mClsid: Guid = this.mClsid, mAppid: Guid = this.mAppid, mPartid: Guid = this.mPartid, mPwszAppName: Pwstr = this.mPwszAppName, mPwszCtxName: Pwstr = this.mPwszCtxName, mEAppType: ComplusApptype = this.mEAppType, mCReferences: UInt = this.mCReferences, mCBound: UInt = this.mCBound, mCPooled: UInt = this.mCPooled, mCInCall: UInt = this.mCInCall, mDwRespTime: UInt = this.mDwRespTime, mCCallsCompleted: UInt = this.mCCallsCompleted, mCCallsFailed: UInt = this.mCCallsFailed): Clsiddata2 = Clsiddata2(mClsid = mClsid, mAppid = mAppid, mPartid = mPartid, mPwszAppNameCtorArg = mPwszAppName, mPwszCtxNameCtorArg = mPwszCtxName, mEAppType = mEAppType, mCReferences = mCReferences, mCBound = mCBound, mCPooled = mCPooled, mCInCall = mCInCall, mDwRespTime = mDwRespTime, mCCallsCompleted = mCCallsCompleted, mCCallsFailed = mCCallsFailed)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Clsiddata2) return false
        if (this.mClsid != other.mClsid) return false
        if (this.mAppid != other.mAppid) return false
        if (this.mPartid != other.mPartid) return false
        if (this.mPwszAppName != other.mPwszAppName) return false
        if (this.mPwszCtxName != other.mPwszCtxName) return false
        if (this.mEAppType != other.mEAppType) return false
        if (this.mCReferences != other.mCReferences) return false
        if (this.mCBound != other.mCBound) return false
        if (this.mCPooled != other.mCPooled) return false
        if (this.mCInCall != other.mCInCall) return false
        if (this.mDwRespTime != other.mDwRespTime) return false
        if (this.mCCallsCompleted != other.mCCallsCompleted) return false
        if (this.mCCallsFailed != other.mCCallsFailed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mClsid.hashCode()
        result = 31 * result + this.mAppid.hashCode()
        result = 31 * result + this.mPartid.hashCode()
        result = 31 * result + this.mPwszAppName.hashCode()
        result = 31 * result + this.mPwszCtxName.hashCode()
        result = 31 * result + this.mEAppType.hashCode()
        result = 31 * result + this.mCReferences.hashCode()
        result = 31 * result + this.mCBound.hashCode()
        result = 31 * result + this.mCPooled.hashCode()
        result = 31 * result + this.mCInCall.hashCode()
        result = 31 * result + this.mDwRespTime.hashCode()
        result = 31 * result + this.mCCallsCompleted.hashCode()
        result = 31 * result + this.mCCallsFailed.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mClsid: Guid = Guid(),
            mAppid: Guid = Guid(),
            mPartid: Guid = Guid(),
            mPwszAppName: Pwstr = MutPtr(0L),
            mPwszCtxName: Pwstr = MutPtr(0L),
            mEAppType: ComplusApptype = 0,
            mCReferences: UInt = 0u,
            mCBound: UInt = 0u,
            mCPooled: UInt = 0u,
            mCInCall: UInt = 0u,
            mDwRespTime: UInt = 0u,
            mCCallsCompleted: UInt = 0u,
            mCCallsFailed: UInt = 0u,
        ): Clsiddata2 =
            Clsiddata2(
                mClsid = mClsid,
                mAppid = mAppid,
                mPartid = mPartid,
                mPwszAppNameCtorArg = mPwszAppName,
                mPwszCtxNameCtorArg = mPwszCtxName,
                mEAppType = mEAppType,
                mCReferences = mCReferences,
                mCBound = mCBound,
                mCPooled = mCPooled,
                mCInCall = mCInCall,
                mDwRespTime = mDwRespTime,
                mCCallsCompleted = mCCallsCompleted,
                mCCallsFailed = mCCallsFailed,
            )
    }
}

public class Comsvcseventinfo internal constructor(
    public var cbSize: UInt,
    public var dwPid: UInt,
    public var lTime: Long,
    public var lMicroTime: Int,
    public var perfCount: Long,
    public var guidApp: Guid,
    sMachineNameCtorArg: Pwstr,
) {
    public var sMachineName: Pwstr = sMachineNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwPid = 0u,
        lTime = 0L,
        lMicroTime = 0,
        perfCount = 0L,
        guidApp = Guid(),
        sMachineNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwPid

    public operator fun component3(): Long = this.lTime

    public operator fun component4(): Int = this.lMicroTime

    public operator fun component5(): Long = this.perfCount

    public operator fun component6(): Guid = this.guidApp

    public operator fun component7(): Pwstr = this.sMachineName

    public fun copy(cbSize: UInt = this.cbSize, dwPid: UInt = this.dwPid, lTime: Long = this.lTime, lMicroTime: Int = this.lMicroTime, perfCount: Long = this.perfCount, guidApp: Guid = this.guidApp, sMachineName: Pwstr = this.sMachineName): Comsvcseventinfo = Comsvcseventinfo(cbSize = cbSize, dwPid = dwPid, lTime = lTime, lMicroTime = lMicroTime, perfCount = perfCount, guidApp = guidApp, sMachineNameCtorArg = sMachineName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Comsvcseventinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwPid != other.dwPid) return false
        if (this.lTime != other.lTime) return false
        if (this.lMicroTime != other.lMicroTime) return false
        if (this.perfCount != other.perfCount) return false
        if (this.guidApp != other.guidApp) return false
        if (this.sMachineName != other.sMachineName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwPid.hashCode()
        result = 31 * result + this.lTime.hashCode()
        result = 31 * result + this.lMicroTime.hashCode()
        result = 31 * result + this.perfCount.hashCode()
        result = 31 * result + this.guidApp.hashCode()
        result = 31 * result + this.sMachineName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwPid: UInt = 0u,
            lTime: Long = 0L,
            lMicroTime: Int = 0,
            perfCount: Long = 0L,
            guidApp: Guid = Guid(),
            sMachineName: Pwstr = MutPtr(0L),
        ): Comsvcseventinfo =
            Comsvcseventinfo(
                cbSize = cbSize,
                dwPid = dwPid,
                lTime = lTime,
                lMicroTime = lMicroTime,
                perfCount = perfCount,
                guidApp = guidApp,
                sMachineNameCtorArg = sMachineName,
            )
    }
}

public data class ComponentHangMonitorInfo(
    public var isMonitored: Bool = 0,
    public var terminateOnHang: Bool = 0,
    public var avgCallThresholdInMs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ComponentHangMonitorInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ComponentHangMonitorInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ComponentHangMonitorInfo =
                    ComponentHangMonitorInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ComponentHangMonitorInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.isMonitored)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.terminateOnHang)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.avgCallThresholdInMs)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ComponentStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ComponentStatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): ComponentStatistics =
                    ComponentStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: ComponentStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numBoundReferences)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numPooledObjects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numObjectsInCall)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.avgResponseTimeInMs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.numCallsCompletedRecent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numCallsFailedRecent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.numCallsCompletedTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.numCallsFailedTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.reserved4)
                }
            }
    }
}

public class ComponentSummary internal constructor(
    public var applicationInstanceId: Guid,
    public var partitionId: Guid,
    public var applicationId: Guid,
    public var clsid: Guid,
    clsNameCtorArg: Pwstr,
    applicationNameCtorArg: Pwstr,
) {
    public var clsName: Pwstr = clsNameCtorArg
        internal set

    public var applicationName: Pwstr = applicationNameCtorArg
        internal set

    public constructor() : this(
        applicationInstanceId = Guid(),
        partitionId = Guid(),
        applicationId = Guid(),
        clsid = Guid(),
        clsNameCtorArg = MutPtr(0L),
        applicationNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.applicationInstanceId

    public operator fun component2(): Guid = this.partitionId

    public operator fun component3(): Guid = this.applicationId

    public operator fun component4(): Guid = this.clsid

    public operator fun component5(): Pwstr = this.clsName

    public operator fun component6(): Pwstr = this.applicationName

    public fun copy(applicationInstanceId: Guid = this.applicationInstanceId, partitionId: Guid = this.partitionId, applicationId: Guid = this.applicationId, clsid: Guid = this.clsid, clsName: Pwstr = this.clsName, applicationName: Pwstr = this.applicationName): ComponentSummary = ComponentSummary(applicationInstanceId = applicationInstanceId, partitionId = partitionId, applicationId = applicationId, clsid = clsid, clsNameCtorArg = clsName, applicationNameCtorArg = applicationName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ComponentSummary) return false
        if (this.applicationInstanceId != other.applicationInstanceId) return false
        if (this.partitionId != other.partitionId) return false
        if (this.applicationId != other.applicationId) return false
        if (this.clsid != other.clsid) return false
        if (this.clsName != other.clsName) return false
        if (this.applicationName != other.applicationName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.applicationInstanceId.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.applicationId.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.clsName.hashCode()
        result = 31 * result + this.applicationName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            applicationInstanceId: Guid = Guid(),
            partitionId: Guid = Guid(),
            applicationId: Guid = Guid(),
            clsid: Guid = Guid(),
            clsName: Pwstr = MutPtr(0L),
            applicationName: Pwstr = MutPtr(0L),
        ): ComponentSummary =
            ComponentSummary(
                applicationInstanceId = applicationInstanceId,
                partitionId = partitionId,
                applicationId = applicationId,
                clsid = clsid,
                clsNameCtorArg = clsName,
                applicationNameCtorArg = applicationName,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HangInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HangInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): HangInfo =
                    HangInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: HangInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fAppHangMonitorEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fTerminateOnHang)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.dumpType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwHangTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDumpCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwInfoMsgCount)
                }
            }
    }
}

public data class RecycleInfo(
    public var guidCombaseProcessIdentifier: Guid = Guid(),
    public var processStartTime: Long = 0L,
    public var dwRecycleLifetimeLimit: UInt = 0u,
    public var dwRecycleMemoryLimit: UInt = 0u,
    public var dwRecycleExpirationTimeout: UInt = 0u,
)
