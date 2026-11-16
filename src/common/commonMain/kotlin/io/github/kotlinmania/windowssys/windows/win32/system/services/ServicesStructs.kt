@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public class EnumServiceStatusa internal constructor(
    lpServiceNameCtorArg: Pstr,
    lpDisplayNameCtorArg: Pstr,
    public var serviceStatus: ServiceStatus,
) {
    public var lpServiceName: Pstr = lpServiceNameCtorArg
        internal set

    public var lpDisplayName: Pstr = lpDisplayNameCtorArg
        internal set

    public constructor() : this(
        lpServiceNameCtorArg = MutPtr(0L),
        lpDisplayNameCtorArg = MutPtr(0L),
        serviceStatus = ServiceStatus(),
    )

    public operator fun component1(): Pstr = this.lpServiceName

    public operator fun component2(): Pstr = this.lpDisplayName

    public operator fun component3(): ServiceStatus = this.serviceStatus

    public fun copy(lpServiceName: Pstr = this.lpServiceName, lpDisplayName: Pstr = this.lpDisplayName, serviceStatus: ServiceStatus = this.serviceStatus): EnumServiceStatusa = EnumServiceStatusa(lpServiceNameCtorArg = lpServiceName, lpDisplayNameCtorArg = lpDisplayName, serviceStatus = serviceStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnumServiceStatusa) return false
        if (this.lpServiceName != other.lpServiceName) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        if (this.serviceStatus != other.serviceStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceName.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        result = 31 * result + this.serviceStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceName: Pstr = MutPtr(0L),
            lpDisplayName: Pstr = MutPtr(0L),
            serviceStatus: ServiceStatus = ServiceStatus(),
        ): EnumServiceStatusa =
            EnumServiceStatusa(
                lpServiceNameCtorArg = lpServiceName,
                lpDisplayNameCtorArg = lpDisplayName,
                serviceStatus = serviceStatus,
            )
    }
}

public class EnumServiceStatusw internal constructor(
    lpServiceNameCtorArg: Pwstr,
    lpDisplayNameCtorArg: Pwstr,
    public var serviceStatus: ServiceStatus,
) {
    public var lpServiceName: Pwstr = lpServiceNameCtorArg
        internal set

    public var lpDisplayName: Pwstr = lpDisplayNameCtorArg
        internal set

    public constructor() : this(
        lpServiceNameCtorArg = MutPtr(0L),
        lpDisplayNameCtorArg = MutPtr(0L),
        serviceStatus = ServiceStatus(),
    )

    public operator fun component1(): Pwstr = this.lpServiceName

    public operator fun component2(): Pwstr = this.lpDisplayName

    public operator fun component3(): ServiceStatus = this.serviceStatus

    public fun copy(lpServiceName: Pwstr = this.lpServiceName, lpDisplayName: Pwstr = this.lpDisplayName, serviceStatus: ServiceStatus = this.serviceStatus): EnumServiceStatusw = EnumServiceStatusw(lpServiceNameCtorArg = lpServiceName, lpDisplayNameCtorArg = lpDisplayName, serviceStatus = serviceStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnumServiceStatusw) return false
        if (this.lpServiceName != other.lpServiceName) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        if (this.serviceStatus != other.serviceStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceName.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        result = 31 * result + this.serviceStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceName: Pwstr = MutPtr(0L),
            lpDisplayName: Pwstr = MutPtr(0L),
            serviceStatus: ServiceStatus = ServiceStatus(),
        ): EnumServiceStatusw =
            EnumServiceStatusw(
                lpServiceNameCtorArg = lpServiceName,
                lpDisplayNameCtorArg = lpDisplayName,
                serviceStatus = serviceStatus,
            )
    }
}

public class EnumServiceStatusProcessa internal constructor(
    lpServiceNameCtorArg: Pstr,
    lpDisplayNameCtorArg: Pstr,
    public var serviceStatusProcess: ServiceStatusProcess,
) {
    public var lpServiceName: Pstr = lpServiceNameCtorArg
        internal set

    public var lpDisplayName: Pstr = lpDisplayNameCtorArg
        internal set

    public constructor() : this(
        lpServiceNameCtorArg = MutPtr(0L),
        lpDisplayNameCtorArg = MutPtr(0L),
        serviceStatusProcess = ServiceStatusProcess(),
    )

    public operator fun component1(): Pstr = this.lpServiceName

    public operator fun component2(): Pstr = this.lpDisplayName

    public operator fun component3(): ServiceStatusProcess = this.serviceStatusProcess

    public fun copy(lpServiceName: Pstr = this.lpServiceName, lpDisplayName: Pstr = this.lpDisplayName, serviceStatusProcess: ServiceStatusProcess = this.serviceStatusProcess): EnumServiceStatusProcessa = EnumServiceStatusProcessa(lpServiceNameCtorArg = lpServiceName, lpDisplayNameCtorArg = lpDisplayName, serviceStatusProcess = serviceStatusProcess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnumServiceStatusProcessa) return false
        if (this.lpServiceName != other.lpServiceName) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        if (this.serviceStatusProcess != other.serviceStatusProcess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceName.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        result = 31 * result + this.serviceStatusProcess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceName: Pstr = MutPtr(0L),
            lpDisplayName: Pstr = MutPtr(0L),
            serviceStatusProcess: ServiceStatusProcess = ServiceStatusProcess(),
        ): EnumServiceStatusProcessa =
            EnumServiceStatusProcessa(
                lpServiceNameCtorArg = lpServiceName,
                lpDisplayNameCtorArg = lpDisplayName,
                serviceStatusProcess = serviceStatusProcess,
            )
    }
}

public class EnumServiceStatusProcessw internal constructor(
    lpServiceNameCtorArg: Pwstr,
    lpDisplayNameCtorArg: Pwstr,
    public var serviceStatusProcess: ServiceStatusProcess,
) {
    public var lpServiceName: Pwstr = lpServiceNameCtorArg
        internal set

    public var lpDisplayName: Pwstr = lpDisplayNameCtorArg
        internal set

    public constructor() : this(
        lpServiceNameCtorArg = MutPtr(0L),
        lpDisplayNameCtorArg = MutPtr(0L),
        serviceStatusProcess = ServiceStatusProcess(),
    )

    public operator fun component1(): Pwstr = this.lpServiceName

    public operator fun component2(): Pwstr = this.lpDisplayName

    public operator fun component3(): ServiceStatusProcess = this.serviceStatusProcess

    public fun copy(lpServiceName: Pwstr = this.lpServiceName, lpDisplayName: Pwstr = this.lpDisplayName, serviceStatusProcess: ServiceStatusProcess = this.serviceStatusProcess): EnumServiceStatusProcessw = EnumServiceStatusProcessw(lpServiceNameCtorArg = lpServiceName, lpDisplayNameCtorArg = lpDisplayName, serviceStatusProcess = serviceStatusProcess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnumServiceStatusProcessw) return false
        if (this.lpServiceName != other.lpServiceName) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        if (this.serviceStatusProcess != other.serviceStatusProcess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceName.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        result = 31 * result + this.serviceStatusProcess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceName: Pwstr = MutPtr(0L),
            lpDisplayName: Pwstr = MutPtr(0L),
            serviceStatusProcess: ServiceStatusProcess = ServiceStatusProcess(),
        ): EnumServiceStatusProcessw =
            EnumServiceStatusProcessw(
                lpServiceNameCtorArg = lpServiceName,
                lpDisplayNameCtorArg = lpDisplayName,
                serviceStatusProcess = serviceStatusProcess,
            )
    }
}

public class QueryServiceConfiga internal constructor(
    public var dwServiceType: EnumServiceType,
    public var dwStartType: ServiceStartType,
    public var dwErrorControl: ServiceError,
    lpBinaryPathNameCtorArg: Pstr,
    lpLoadOrderGroupCtorArg: Pstr,
    public var dwTagId: UInt,
    lpDependenciesCtorArg: Pstr,
    lpServiceStartNameCtorArg: Pstr,
    lpDisplayNameCtorArg: Pstr,
) {
    public var lpBinaryPathName: Pstr = lpBinaryPathNameCtorArg
        internal set

    public var lpLoadOrderGroup: Pstr = lpLoadOrderGroupCtorArg
        internal set

    public var lpDependencies: Pstr = lpDependenciesCtorArg
        internal set

    public var lpServiceStartName: Pstr = lpServiceStartNameCtorArg
        internal set

    public var lpDisplayName: Pstr = lpDisplayNameCtorArg
        internal set

    public constructor() : this(
        dwServiceType = 0u,
        dwStartType = 0u,
        dwErrorControl = 0u,
        lpBinaryPathNameCtorArg = MutPtr(0L),
        lpLoadOrderGroupCtorArg = MutPtr(0L),
        dwTagId = 0u,
        lpDependenciesCtorArg = MutPtr(0L),
        lpServiceStartNameCtorArg = MutPtr(0L),
        lpDisplayNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): EnumServiceType = this.dwServiceType

    public operator fun component2(): ServiceStartType = this.dwStartType

    public operator fun component3(): ServiceError = this.dwErrorControl

    public operator fun component4(): Pstr = this.lpBinaryPathName

    public operator fun component5(): Pstr = this.lpLoadOrderGroup

    public operator fun component6(): UInt = this.dwTagId

    public operator fun component7(): Pstr = this.lpDependencies

    public operator fun component8(): Pstr = this.lpServiceStartName

    public operator fun component9(): Pstr = this.lpDisplayName

    public fun copy(dwServiceType: EnumServiceType = this.dwServiceType, dwStartType: ServiceStartType = this.dwStartType, dwErrorControl: ServiceError = this.dwErrorControl, lpBinaryPathName: Pstr = this.lpBinaryPathName, lpLoadOrderGroup: Pstr = this.lpLoadOrderGroup, dwTagId: UInt = this.dwTagId, lpDependencies: Pstr = this.lpDependencies, lpServiceStartName: Pstr = this.lpServiceStartName, lpDisplayName: Pstr = this.lpDisplayName): QueryServiceConfiga = QueryServiceConfiga(dwServiceType = dwServiceType, dwStartType = dwStartType, dwErrorControl = dwErrorControl, lpBinaryPathNameCtorArg = lpBinaryPathName, lpLoadOrderGroupCtorArg = lpLoadOrderGroup, dwTagId = dwTagId, lpDependenciesCtorArg = lpDependencies, lpServiceStartNameCtorArg = lpServiceStartName, lpDisplayNameCtorArg = lpDisplayName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QueryServiceConfiga) return false
        if (this.dwServiceType != other.dwServiceType) return false
        if (this.dwStartType != other.dwStartType) return false
        if (this.dwErrorControl != other.dwErrorControl) return false
        if (this.lpBinaryPathName != other.lpBinaryPathName) return false
        if (this.lpLoadOrderGroup != other.lpLoadOrderGroup) return false
        if (this.dwTagId != other.dwTagId) return false
        if (this.lpDependencies != other.lpDependencies) return false
        if (this.lpServiceStartName != other.lpServiceStartName) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwServiceType.hashCode()
        result = 31 * result + this.dwStartType.hashCode()
        result = 31 * result + this.dwErrorControl.hashCode()
        result = 31 * result + this.lpBinaryPathName.hashCode()
        result = 31 * result + this.lpLoadOrderGroup.hashCode()
        result = 31 * result + this.dwTagId.hashCode()
        result = 31 * result + this.lpDependencies.hashCode()
        result = 31 * result + this.lpServiceStartName.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwServiceType: EnumServiceType = 0u,
            dwStartType: ServiceStartType = 0u,
            dwErrorControl: ServiceError = 0u,
            lpBinaryPathName: Pstr = MutPtr(0L),
            lpLoadOrderGroup: Pstr = MutPtr(0L),
            dwTagId: UInt = 0u,
            lpDependencies: Pstr = MutPtr(0L),
            lpServiceStartName: Pstr = MutPtr(0L),
            lpDisplayName: Pstr = MutPtr(0L),
        ): QueryServiceConfiga =
            QueryServiceConfiga(
                dwServiceType = dwServiceType,
                dwStartType = dwStartType,
                dwErrorControl = dwErrorControl,
                lpBinaryPathNameCtorArg = lpBinaryPathName,
                lpLoadOrderGroupCtorArg = lpLoadOrderGroup,
                dwTagId = dwTagId,
                lpDependenciesCtorArg = lpDependencies,
                lpServiceStartNameCtorArg = lpServiceStartName,
                lpDisplayNameCtorArg = lpDisplayName,
            )
    }
}

public class QueryServiceConfigw internal constructor(
    public var dwServiceType: EnumServiceType,
    public var dwStartType: ServiceStartType,
    public var dwErrorControl: ServiceError,
    lpBinaryPathNameCtorArg: Pwstr,
    lpLoadOrderGroupCtorArg: Pwstr,
    public var dwTagId: UInt,
    lpDependenciesCtorArg: Pwstr,
    lpServiceStartNameCtorArg: Pwstr,
    lpDisplayNameCtorArg: Pwstr,
) {
    public var lpBinaryPathName: Pwstr = lpBinaryPathNameCtorArg
        internal set

    public var lpLoadOrderGroup: Pwstr = lpLoadOrderGroupCtorArg
        internal set

    public var lpDependencies: Pwstr = lpDependenciesCtorArg
        internal set

    public var lpServiceStartName: Pwstr = lpServiceStartNameCtorArg
        internal set

    public var lpDisplayName: Pwstr = lpDisplayNameCtorArg
        internal set

    public constructor() : this(
        dwServiceType = 0u,
        dwStartType = 0u,
        dwErrorControl = 0u,
        lpBinaryPathNameCtorArg = MutPtr(0L),
        lpLoadOrderGroupCtorArg = MutPtr(0L),
        dwTagId = 0u,
        lpDependenciesCtorArg = MutPtr(0L),
        lpServiceStartNameCtorArg = MutPtr(0L),
        lpDisplayNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): EnumServiceType = this.dwServiceType

    public operator fun component2(): ServiceStartType = this.dwStartType

    public operator fun component3(): ServiceError = this.dwErrorControl

    public operator fun component4(): Pwstr = this.lpBinaryPathName

    public operator fun component5(): Pwstr = this.lpLoadOrderGroup

    public operator fun component6(): UInt = this.dwTagId

    public operator fun component7(): Pwstr = this.lpDependencies

    public operator fun component8(): Pwstr = this.lpServiceStartName

    public operator fun component9(): Pwstr = this.lpDisplayName

    public fun copy(dwServiceType: EnumServiceType = this.dwServiceType, dwStartType: ServiceStartType = this.dwStartType, dwErrorControl: ServiceError = this.dwErrorControl, lpBinaryPathName: Pwstr = this.lpBinaryPathName, lpLoadOrderGroup: Pwstr = this.lpLoadOrderGroup, dwTagId: UInt = this.dwTagId, lpDependencies: Pwstr = this.lpDependencies, lpServiceStartName: Pwstr = this.lpServiceStartName, lpDisplayName: Pwstr = this.lpDisplayName): QueryServiceConfigw = QueryServiceConfigw(dwServiceType = dwServiceType, dwStartType = dwStartType, dwErrorControl = dwErrorControl, lpBinaryPathNameCtorArg = lpBinaryPathName, lpLoadOrderGroupCtorArg = lpLoadOrderGroup, dwTagId = dwTagId, lpDependenciesCtorArg = lpDependencies, lpServiceStartNameCtorArg = lpServiceStartName, lpDisplayNameCtorArg = lpDisplayName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QueryServiceConfigw) return false
        if (this.dwServiceType != other.dwServiceType) return false
        if (this.dwStartType != other.dwStartType) return false
        if (this.dwErrorControl != other.dwErrorControl) return false
        if (this.lpBinaryPathName != other.lpBinaryPathName) return false
        if (this.lpLoadOrderGroup != other.lpLoadOrderGroup) return false
        if (this.dwTagId != other.dwTagId) return false
        if (this.lpDependencies != other.lpDependencies) return false
        if (this.lpServiceStartName != other.lpServiceStartName) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwServiceType.hashCode()
        result = 31 * result + this.dwStartType.hashCode()
        result = 31 * result + this.dwErrorControl.hashCode()
        result = 31 * result + this.lpBinaryPathName.hashCode()
        result = 31 * result + this.lpLoadOrderGroup.hashCode()
        result = 31 * result + this.dwTagId.hashCode()
        result = 31 * result + this.lpDependencies.hashCode()
        result = 31 * result + this.lpServiceStartName.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwServiceType: EnumServiceType = 0u,
            dwStartType: ServiceStartType = 0u,
            dwErrorControl: ServiceError = 0u,
            lpBinaryPathName: Pwstr = MutPtr(0L),
            lpLoadOrderGroup: Pwstr = MutPtr(0L),
            dwTagId: UInt = 0u,
            lpDependencies: Pwstr = MutPtr(0L),
            lpServiceStartName: Pwstr = MutPtr(0L),
            lpDisplayName: Pwstr = MutPtr(0L),
        ): QueryServiceConfigw =
            QueryServiceConfigw(
                dwServiceType = dwServiceType,
                dwStartType = dwStartType,
                dwErrorControl = dwErrorControl,
                lpBinaryPathNameCtorArg = lpBinaryPathName,
                lpLoadOrderGroupCtorArg = lpLoadOrderGroup,
                dwTagId = dwTagId,
                lpDependenciesCtorArg = lpDependencies,
                lpServiceStartNameCtorArg = lpServiceStartName,
                lpDisplayNameCtorArg = lpDisplayName,
            )
    }
}

public class QueryServiceLockStatusa internal constructor(
    public var fIsLocked: UInt,
    lpLockOwnerCtorArg: Pstr,
    public var dwLockDuration: UInt,
) {
    public var lpLockOwner: Pstr = lpLockOwnerCtorArg
        internal set

    public constructor() : this(
        fIsLocked = 0u,
        lpLockOwnerCtorArg = MutPtr(0L),
        dwLockDuration = 0u,
    )

    public operator fun component1(): UInt = this.fIsLocked

    public operator fun component2(): Pstr = this.lpLockOwner

    public operator fun component3(): UInt = this.dwLockDuration

    public fun copy(fIsLocked: UInt = this.fIsLocked, lpLockOwner: Pstr = this.lpLockOwner, dwLockDuration: UInt = this.dwLockDuration): QueryServiceLockStatusa = QueryServiceLockStatusa(fIsLocked = fIsLocked, lpLockOwnerCtorArg = lpLockOwner, dwLockDuration = dwLockDuration)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QueryServiceLockStatusa) return false
        if (this.fIsLocked != other.fIsLocked) return false
        if (this.lpLockOwner != other.lpLockOwner) return false
        if (this.dwLockDuration != other.dwLockDuration) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fIsLocked.hashCode()
        result = 31 * result + this.lpLockOwner.hashCode()
        result = 31 * result + this.dwLockDuration.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fIsLocked: UInt = 0u,
            lpLockOwner: Pstr = MutPtr(0L),
            dwLockDuration: UInt = 0u,
        ): QueryServiceLockStatusa =
            QueryServiceLockStatusa(
                fIsLocked = fIsLocked,
                lpLockOwnerCtorArg = lpLockOwner,
                dwLockDuration = dwLockDuration,
            )
    }
}

public class QueryServiceLockStatusw internal constructor(
    public var fIsLocked: UInt,
    lpLockOwnerCtorArg: Pwstr,
    public var dwLockDuration: UInt,
) {
    public var lpLockOwner: Pwstr = lpLockOwnerCtorArg
        internal set

    public constructor() : this(
        fIsLocked = 0u,
        lpLockOwnerCtorArg = MutPtr(0L),
        dwLockDuration = 0u,
    )

    public operator fun component1(): UInt = this.fIsLocked

    public operator fun component2(): Pwstr = this.lpLockOwner

    public operator fun component3(): UInt = this.dwLockDuration

    public fun copy(fIsLocked: UInt = this.fIsLocked, lpLockOwner: Pwstr = this.lpLockOwner, dwLockDuration: UInt = this.dwLockDuration): QueryServiceLockStatusw = QueryServiceLockStatusw(fIsLocked = fIsLocked, lpLockOwnerCtorArg = lpLockOwner, dwLockDuration = dwLockDuration)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QueryServiceLockStatusw) return false
        if (this.fIsLocked != other.fIsLocked) return false
        if (this.lpLockOwner != other.lpLockOwner) return false
        if (this.dwLockDuration != other.dwLockDuration) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fIsLocked.hashCode()
        result = 31 * result + this.lpLockOwner.hashCode()
        result = 31 * result + this.dwLockDuration.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fIsLocked: UInt = 0u,
            lpLockOwner: Pwstr = MutPtr(0L),
            dwLockDuration: UInt = 0u,
        ): QueryServiceLockStatusw =
            QueryServiceLockStatusw(
                fIsLocked = fIsLocked,
                lpLockOwnerCtorArg = lpLockOwner,
                dwLockDuration = dwLockDuration,
            )
    }
}

public data class ScAction(
    public var type: ScActionType = 0,
    public var delay: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScAction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScAction> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScAction =
                    ScAction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScAction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.delay)
                }
            }
    }
}

public class ServiceControlStatusReasonParamsa internal constructor(
    public var dwReason: UInt,
    pszCommentCtorArg: Pstr,
    public var serviceStatus: ServiceStatusProcess,
) {
    public var pszComment: Pstr = pszCommentCtorArg
        internal set

    public constructor() : this(
        dwReason = 0u,
        pszCommentCtorArg = MutPtr(0L),
        serviceStatus = ServiceStatusProcess(),
    )

    public operator fun component1(): UInt = this.dwReason

    public operator fun component2(): Pstr = this.pszComment

    public operator fun component3(): ServiceStatusProcess = this.serviceStatus

    public fun copy(dwReason: UInt = this.dwReason, pszComment: Pstr = this.pszComment, serviceStatus: ServiceStatusProcess = this.serviceStatus): ServiceControlStatusReasonParamsa = ServiceControlStatusReasonParamsa(dwReason = dwReason, pszCommentCtorArg = pszComment, serviceStatus = serviceStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceControlStatusReasonParamsa) return false
        if (this.dwReason != other.dwReason) return false
        if (this.pszComment != other.pszComment) return false
        if (this.serviceStatus != other.serviceStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwReason.hashCode()
        result = 31 * result + this.pszComment.hashCode()
        result = 31 * result + this.serviceStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwReason: UInt = 0u,
            pszComment: Pstr = MutPtr(0L),
            serviceStatus: ServiceStatusProcess = ServiceStatusProcess(),
        ): ServiceControlStatusReasonParamsa =
            ServiceControlStatusReasonParamsa(
                dwReason = dwReason,
                pszCommentCtorArg = pszComment,
                serviceStatus = serviceStatus,
            )
    }
}

public class ServiceControlStatusReasonParamsw internal constructor(
    public var dwReason: UInt,
    pszCommentCtorArg: Pwstr,
    public var serviceStatus: ServiceStatusProcess,
) {
    public var pszComment: Pwstr = pszCommentCtorArg
        internal set

    public constructor() : this(
        dwReason = 0u,
        pszCommentCtorArg = MutPtr(0L),
        serviceStatus = ServiceStatusProcess(),
    )

    public operator fun component1(): UInt = this.dwReason

    public operator fun component2(): Pwstr = this.pszComment

    public operator fun component3(): ServiceStatusProcess = this.serviceStatus

    public fun copy(dwReason: UInt = this.dwReason, pszComment: Pwstr = this.pszComment, serviceStatus: ServiceStatusProcess = this.serviceStatus): ServiceControlStatusReasonParamsw = ServiceControlStatusReasonParamsw(dwReason = dwReason, pszCommentCtorArg = pszComment, serviceStatus = serviceStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceControlStatusReasonParamsw) return false
        if (this.dwReason != other.dwReason) return false
        if (this.pszComment != other.pszComment) return false
        if (this.serviceStatus != other.serviceStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwReason.hashCode()
        result = 31 * result + this.pszComment.hashCode()
        result = 31 * result + this.serviceStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwReason: UInt = 0u,
            pszComment: Pwstr = MutPtr(0L),
            serviceStatus: ServiceStatusProcess = ServiceStatusProcess(),
        ): ServiceControlStatusReasonParamsw =
            ServiceControlStatusReasonParamsw(
                dwReason = dwReason,
                pszCommentCtorArg = pszComment,
                serviceStatus = serviceStatus,
            )
    }
}

public data class ServiceCustomSystemStateChangeDataItem(
    public var u: ServiceCustomSystemStateChangeDataItem0 = ServiceCustomSystemStateChangeDataItem0(),
)

public data class ServiceCustomSystemStateChangeDataItem0(
    public var customStateId: ServiceTriggerCustomStateId = ServiceTriggerCustomStateId(),
    public var s: ServiceCustomSystemStateChangeDataItem00 = ServiceCustomSystemStateChangeDataItem00(),
)

public data class ServiceCustomSystemStateChangeDataItem00(
    public var dataOffset: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceCustomSystemStateChangeDataItem00) return false
        if (this.dataOffset != other.dataOffset) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataOffset.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceCustomSystemStateChangeDataItem00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceCustomSystemStateChangeDataItem00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ServiceCustomSystemStateChangeDataItem00 =
                    ServiceCustomSystemStateChangeDataItem00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ServiceCustomSystemStateChangeDataItem00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dataOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data.toList())
                }
            }
    }
}

public data class ServiceDelayedAutoStartInfo(
    public var fDelayedAutostart: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceDelayedAutoStartInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceDelayedAutoStartInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServiceDelayedAutoStartInfo =
                    ServiceDelayedAutoStartInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServiceDelayedAutoStartInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fDelayedAutostart)
                }
            }
    }
}

public class ServiceDescriptiona internal constructor(
    lpDescriptionCtorArg: Pstr,
) {
    public var lpDescription: Pstr = lpDescriptionCtorArg
        internal set

    public constructor() : this(
        lpDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.lpDescription

    public fun copy(lpDescription: Pstr = this.lpDescription): ServiceDescriptiona = ServiceDescriptiona(lpDescriptionCtorArg = lpDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceDescriptiona) return false
        if (this.lpDescription != other.lpDescription) return false
        return true
    }

    override fun hashCode(): Int = this.lpDescription.hashCode()

    public companion object {
        public operator fun invoke(
            lpDescription: Pstr = MutPtr(0L),
        ): ServiceDescriptiona =
            ServiceDescriptiona(
                lpDescriptionCtorArg = lpDescription,
            )
    }
}

public class ServiceDescriptionw internal constructor(
    lpDescriptionCtorArg: Pwstr,
) {
    public var lpDescription: Pwstr = lpDescriptionCtorArg
        internal set

    public constructor() : this(
        lpDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lpDescription

    public fun copy(lpDescription: Pwstr = this.lpDescription): ServiceDescriptionw = ServiceDescriptionw(lpDescriptionCtorArg = lpDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceDescriptionw) return false
        if (this.lpDescription != other.lpDescription) return false
        return true
    }

    override fun hashCode(): Int = this.lpDescription.hashCode()

    public companion object {
        public operator fun invoke(
            lpDescription: Pwstr = MutPtr(0L),
        ): ServiceDescriptionw =
            ServiceDescriptionw(
                lpDescriptionCtorArg = lpDescription,
            )
    }
}

public class ServiceFailureActionsa internal constructor(
    public var dwResetPeriod: UInt,
    lpRebootMsgCtorArg: Pstr,
    lpCommandCtorArg: Pstr,
    public var cActions: UInt,
    lpsaActionsCtorArg: MutPtr,
) {
    public var lpRebootMsg: Pstr = lpRebootMsgCtorArg
        internal set

    public var lpCommand: Pstr = lpCommandCtorArg
        internal set

    public var lpsaActions: MutPtr = lpsaActionsCtorArg
        internal set

    public constructor() : this(
        dwResetPeriod = 0u,
        lpRebootMsgCtorArg = MutPtr(0L),
        lpCommandCtorArg = MutPtr(0L),
        cActions = 0u,
        lpsaActionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwResetPeriod

    public operator fun component2(): Pstr = this.lpRebootMsg

    public operator fun component3(): Pstr = this.lpCommand

    public operator fun component4(): UInt = this.cActions

    public operator fun component5(): MutPtr = this.lpsaActions

    public fun copy(dwResetPeriod: UInt = this.dwResetPeriod, lpRebootMsg: Pstr = this.lpRebootMsg, lpCommand: Pstr = this.lpCommand, cActions: UInt = this.cActions, lpsaActions: MutPtr = this.lpsaActions): ServiceFailureActionsa = ServiceFailureActionsa(dwResetPeriod = dwResetPeriod, lpRebootMsgCtorArg = lpRebootMsg, lpCommandCtorArg = lpCommand, cActions = cActions, lpsaActionsCtorArg = lpsaActions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceFailureActionsa) return false
        if (this.dwResetPeriod != other.dwResetPeriod) return false
        if (this.lpRebootMsg != other.lpRebootMsg) return false
        if (this.lpCommand != other.lpCommand) return false
        if (this.cActions != other.cActions) return false
        if (this.lpsaActions != other.lpsaActions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwResetPeriod.hashCode()
        result = 31 * result + this.lpRebootMsg.hashCode()
        result = 31 * result + this.lpCommand.hashCode()
        result = 31 * result + this.cActions.hashCode()
        result = 31 * result + this.lpsaActions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwResetPeriod: UInt = 0u,
            lpRebootMsg: Pstr = MutPtr(0L),
            lpCommand: Pstr = MutPtr(0L),
            cActions: UInt = 0u,
            lpsaActions: MutPtr = MutPtr(0L),
        ): ServiceFailureActionsa =
            ServiceFailureActionsa(
                dwResetPeriod = dwResetPeriod,
                lpRebootMsgCtorArg = lpRebootMsg,
                lpCommandCtorArg = lpCommand,
                cActions = cActions,
                lpsaActionsCtorArg = lpsaActions,
            )
    }
}

public class ServiceFailureActionsw internal constructor(
    public var dwResetPeriod: UInt,
    lpRebootMsgCtorArg: Pwstr,
    lpCommandCtorArg: Pwstr,
    public var cActions: UInt,
    lpsaActionsCtorArg: MutPtr,
) {
    public var lpRebootMsg: Pwstr = lpRebootMsgCtorArg
        internal set

    public var lpCommand: Pwstr = lpCommandCtorArg
        internal set

    public var lpsaActions: MutPtr = lpsaActionsCtorArg
        internal set

    public constructor() : this(
        dwResetPeriod = 0u,
        lpRebootMsgCtorArg = MutPtr(0L),
        lpCommandCtorArg = MutPtr(0L),
        cActions = 0u,
        lpsaActionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwResetPeriod

    public operator fun component2(): Pwstr = this.lpRebootMsg

    public operator fun component3(): Pwstr = this.lpCommand

    public operator fun component4(): UInt = this.cActions

    public operator fun component5(): MutPtr = this.lpsaActions

    public fun copy(dwResetPeriod: UInt = this.dwResetPeriod, lpRebootMsg: Pwstr = this.lpRebootMsg, lpCommand: Pwstr = this.lpCommand, cActions: UInt = this.cActions, lpsaActions: MutPtr = this.lpsaActions): ServiceFailureActionsw = ServiceFailureActionsw(dwResetPeriod = dwResetPeriod, lpRebootMsgCtorArg = lpRebootMsg, lpCommandCtorArg = lpCommand, cActions = cActions, lpsaActionsCtorArg = lpsaActions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceFailureActionsw) return false
        if (this.dwResetPeriod != other.dwResetPeriod) return false
        if (this.lpRebootMsg != other.lpRebootMsg) return false
        if (this.lpCommand != other.lpCommand) return false
        if (this.cActions != other.cActions) return false
        if (this.lpsaActions != other.lpsaActions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwResetPeriod.hashCode()
        result = 31 * result + this.lpRebootMsg.hashCode()
        result = 31 * result + this.lpCommand.hashCode()
        result = 31 * result + this.cActions.hashCode()
        result = 31 * result + this.lpsaActions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwResetPeriod: UInt = 0u,
            lpRebootMsg: Pwstr = MutPtr(0L),
            lpCommand: Pwstr = MutPtr(0L),
            cActions: UInt = 0u,
            lpsaActions: MutPtr = MutPtr(0L),
        ): ServiceFailureActionsw =
            ServiceFailureActionsw(
                dwResetPeriod = dwResetPeriod,
                lpRebootMsgCtorArg = lpRebootMsg,
                lpCommandCtorArg = lpCommand,
                cActions = cActions,
                lpsaActionsCtorArg = lpsaActions,
            )
    }
}

public data class ServiceFailureActionsFlag(
    public var fFailureActionsOnNonCrashFailures: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceFailureActionsFlag> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceFailureActionsFlag> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServiceFailureActionsFlag =
                    ServiceFailureActionsFlag(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServiceFailureActionsFlag) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fFailureActionsOnNonCrashFailures)
                }
            }
    }
}

public data class ServiceLaunchProtectedInfo(
    public var dwLaunchProtected: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceLaunchProtectedInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceLaunchProtectedInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServiceLaunchProtectedInfo =
                    ServiceLaunchProtectedInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServiceLaunchProtectedInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLaunchProtected)
                }
            }
    }
}

public class ServiceNotify1 internal constructor(
    public var dwVersion: UInt,
    public var pfnNotifyCallback: PfnScNotifyCallback,
    pContextCtorArg: MutPtr,
    public var dwNotificationStatus: UInt,
    public var serviceStatus: ServiceStatusProcess,
) {
    public var pContext: MutPtr = pContextCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pfnNotifyCallback = null,
        pContextCtorArg = MutPtr(0L),
        dwNotificationStatus = 0u,
        serviceStatus = ServiceStatusProcess(),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): PfnScNotifyCallback = this.pfnNotifyCallback

    public operator fun component3(): MutPtr = this.pContext

    public operator fun component4(): UInt = this.dwNotificationStatus

    public operator fun component5(): ServiceStatusProcess = this.serviceStatus

    public fun copy(dwVersion: UInt = this.dwVersion, pfnNotifyCallback: PfnScNotifyCallback = this.pfnNotifyCallback, pContext: MutPtr = this.pContext, dwNotificationStatus: UInt = this.dwNotificationStatus, serviceStatus: ServiceStatusProcess = this.serviceStatus): ServiceNotify1 = ServiceNotify1(dwVersion = dwVersion, pfnNotifyCallback = pfnNotifyCallback, pContextCtorArg = pContext, dwNotificationStatus = dwNotificationStatus, serviceStatus = serviceStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceNotify1) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.pfnNotifyCallback != other.pfnNotifyCallback) return false
        if (this.pContext != other.pContext) return false
        if (this.dwNotificationStatus != other.dwNotificationStatus) return false
        if (this.serviceStatus != other.serviceStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.pfnNotifyCallback.hashCode()
        result = 31 * result + this.pContext.hashCode()
        result = 31 * result + this.dwNotificationStatus.hashCode()
        result = 31 * result + this.serviceStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            pfnNotifyCallback: PfnScNotifyCallback = null,
            pContext: MutPtr = MutPtr(0L),
            dwNotificationStatus: UInt = 0u,
            serviceStatus: ServiceStatusProcess = ServiceStatusProcess(),
        ): ServiceNotify1 =
            ServiceNotify1(
                dwVersion = dwVersion,
                pfnNotifyCallback = pfnNotifyCallback,
                pContextCtorArg = pContext,
                dwNotificationStatus = dwNotificationStatus,
                serviceStatus = serviceStatus,
            )
    }
}

public class ServiceNotify2a internal constructor(
    public var dwVersion: UInt,
    public var pfnNotifyCallback: PfnScNotifyCallback,
    pContextCtorArg: MutPtr,
    public var dwNotificationStatus: UInt,
    public var serviceStatus: ServiceStatusProcess,
    public var dwNotificationTriggered: UInt,
    pszServiceNamesCtorArg: Pstr,
) {
    public var pContext: MutPtr = pContextCtorArg
        internal set

    public var pszServiceNames: Pstr = pszServiceNamesCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pfnNotifyCallback = null,
        pContextCtorArg = MutPtr(0L),
        dwNotificationStatus = 0u,
        serviceStatus = ServiceStatusProcess(),
        dwNotificationTriggered = 0u,
        pszServiceNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): PfnScNotifyCallback = this.pfnNotifyCallback

    public operator fun component3(): MutPtr = this.pContext

    public operator fun component4(): UInt = this.dwNotificationStatus

    public operator fun component5(): ServiceStatusProcess = this.serviceStatus

    public operator fun component6(): UInt = this.dwNotificationTriggered

    public operator fun component7(): Pstr = this.pszServiceNames

    public fun copy(dwVersion: UInt = this.dwVersion, pfnNotifyCallback: PfnScNotifyCallback = this.pfnNotifyCallback, pContext: MutPtr = this.pContext, dwNotificationStatus: UInt = this.dwNotificationStatus, serviceStatus: ServiceStatusProcess = this.serviceStatus, dwNotificationTriggered: UInt = this.dwNotificationTriggered, pszServiceNames: Pstr = this.pszServiceNames): ServiceNotify2a = ServiceNotify2a(dwVersion = dwVersion, pfnNotifyCallback = pfnNotifyCallback, pContextCtorArg = pContext, dwNotificationStatus = dwNotificationStatus, serviceStatus = serviceStatus, dwNotificationTriggered = dwNotificationTriggered, pszServiceNamesCtorArg = pszServiceNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceNotify2a) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.pfnNotifyCallback != other.pfnNotifyCallback) return false
        if (this.pContext != other.pContext) return false
        if (this.dwNotificationStatus != other.dwNotificationStatus) return false
        if (this.serviceStatus != other.serviceStatus) return false
        if (this.dwNotificationTriggered != other.dwNotificationTriggered) return false
        if (this.pszServiceNames != other.pszServiceNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.pfnNotifyCallback.hashCode()
        result = 31 * result + this.pContext.hashCode()
        result = 31 * result + this.dwNotificationStatus.hashCode()
        result = 31 * result + this.serviceStatus.hashCode()
        result = 31 * result + this.dwNotificationTriggered.hashCode()
        result = 31 * result + this.pszServiceNames.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            pfnNotifyCallback: PfnScNotifyCallback = null,
            pContext: MutPtr = MutPtr(0L),
            dwNotificationStatus: UInt = 0u,
            serviceStatus: ServiceStatusProcess = ServiceStatusProcess(),
            dwNotificationTriggered: UInt = 0u,
            pszServiceNames: Pstr = MutPtr(0L),
        ): ServiceNotify2a =
            ServiceNotify2a(
                dwVersion = dwVersion,
                pfnNotifyCallback = pfnNotifyCallback,
                pContextCtorArg = pContext,
                dwNotificationStatus = dwNotificationStatus,
                serviceStatus = serviceStatus,
                dwNotificationTriggered = dwNotificationTriggered,
                pszServiceNamesCtorArg = pszServiceNames,
            )
    }
}

public class ServiceNotify2w internal constructor(
    public var dwVersion: UInt,
    public var pfnNotifyCallback: PfnScNotifyCallback,
    pContextCtorArg: MutPtr,
    public var dwNotificationStatus: UInt,
    public var serviceStatus: ServiceStatusProcess,
    public var dwNotificationTriggered: UInt,
    pszServiceNamesCtorArg: Pwstr,
) {
    public var pContext: MutPtr = pContextCtorArg
        internal set

    public var pszServiceNames: Pwstr = pszServiceNamesCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pfnNotifyCallback = null,
        pContextCtorArg = MutPtr(0L),
        dwNotificationStatus = 0u,
        serviceStatus = ServiceStatusProcess(),
        dwNotificationTriggered = 0u,
        pszServiceNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): PfnScNotifyCallback = this.pfnNotifyCallback

    public operator fun component3(): MutPtr = this.pContext

    public operator fun component4(): UInt = this.dwNotificationStatus

    public operator fun component5(): ServiceStatusProcess = this.serviceStatus

    public operator fun component6(): UInt = this.dwNotificationTriggered

    public operator fun component7(): Pwstr = this.pszServiceNames

    public fun copy(dwVersion: UInt = this.dwVersion, pfnNotifyCallback: PfnScNotifyCallback = this.pfnNotifyCallback, pContext: MutPtr = this.pContext, dwNotificationStatus: UInt = this.dwNotificationStatus, serviceStatus: ServiceStatusProcess = this.serviceStatus, dwNotificationTriggered: UInt = this.dwNotificationTriggered, pszServiceNames: Pwstr = this.pszServiceNames): ServiceNotify2w = ServiceNotify2w(dwVersion = dwVersion, pfnNotifyCallback = pfnNotifyCallback, pContextCtorArg = pContext, dwNotificationStatus = dwNotificationStatus, serviceStatus = serviceStatus, dwNotificationTriggered = dwNotificationTriggered, pszServiceNamesCtorArg = pszServiceNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceNotify2w) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.pfnNotifyCallback != other.pfnNotifyCallback) return false
        if (this.pContext != other.pContext) return false
        if (this.dwNotificationStatus != other.dwNotificationStatus) return false
        if (this.serviceStatus != other.serviceStatus) return false
        if (this.dwNotificationTriggered != other.dwNotificationTriggered) return false
        if (this.pszServiceNames != other.pszServiceNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.pfnNotifyCallback.hashCode()
        result = 31 * result + this.pContext.hashCode()
        result = 31 * result + this.dwNotificationStatus.hashCode()
        result = 31 * result + this.serviceStatus.hashCode()
        result = 31 * result + this.dwNotificationTriggered.hashCode()
        result = 31 * result + this.pszServiceNames.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            pfnNotifyCallback: PfnScNotifyCallback = null,
            pContext: MutPtr = MutPtr(0L),
            dwNotificationStatus: UInt = 0u,
            serviceStatus: ServiceStatusProcess = ServiceStatusProcess(),
            dwNotificationTriggered: UInt = 0u,
            pszServiceNames: Pwstr = MutPtr(0L),
        ): ServiceNotify2w =
            ServiceNotify2w(
                dwVersion = dwVersion,
                pfnNotifyCallback = pfnNotifyCallback,
                pContextCtorArg = pContext,
                dwNotificationStatus = dwNotificationStatus,
                serviceStatus = serviceStatus,
                dwNotificationTriggered = dwNotificationTriggered,
                pszServiceNamesCtorArg = pszServiceNames,
            )
    }
}

public data class ServicePreferredNodeInfo(
    public var usPreferredNode: UShort = 0u,
    public var fDelete: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServicePreferredNodeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServicePreferredNodeInfo> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServicePreferredNodeInfo =
                    ServicePreferredNodeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ServicePreferredNodeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usPreferredNode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.fDelete)
                }
            }
    }
}

public data class ServicePreshutdownInfo(
    public var dwPreshutdownTimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServicePreshutdownInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServicePreshutdownInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServicePreshutdownInfo =
                    ServicePreshutdownInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServicePreshutdownInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPreshutdownTimeout)
                }
            }
    }
}

public class ServiceRequiredPrivilegesInfoa internal constructor(
    pmszRequiredPrivilegesCtorArg: Pstr,
) {
    public var pmszRequiredPrivileges: Pstr = pmszRequiredPrivilegesCtorArg
        internal set

    public constructor() : this(
        pmszRequiredPrivilegesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pmszRequiredPrivileges

    public fun copy(pmszRequiredPrivileges: Pstr = this.pmszRequiredPrivileges): ServiceRequiredPrivilegesInfoa = ServiceRequiredPrivilegesInfoa(pmszRequiredPrivilegesCtorArg = pmszRequiredPrivileges)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceRequiredPrivilegesInfoa) return false
        if (this.pmszRequiredPrivileges != other.pmszRequiredPrivileges) return false
        return true
    }

    override fun hashCode(): Int = this.pmszRequiredPrivileges.hashCode()

    public companion object {
        public operator fun invoke(
            pmszRequiredPrivileges: Pstr = MutPtr(0L),
        ): ServiceRequiredPrivilegesInfoa =
            ServiceRequiredPrivilegesInfoa(
                pmszRequiredPrivilegesCtorArg = pmszRequiredPrivileges,
            )
    }
}

public class ServiceRequiredPrivilegesInfow internal constructor(
    pmszRequiredPrivilegesCtorArg: Pwstr,
) {
    public var pmszRequiredPrivileges: Pwstr = pmszRequiredPrivilegesCtorArg
        internal set

    public constructor() : this(
        pmszRequiredPrivilegesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pmszRequiredPrivileges

    public fun copy(pmszRequiredPrivileges: Pwstr = this.pmszRequiredPrivileges): ServiceRequiredPrivilegesInfow = ServiceRequiredPrivilegesInfow(pmszRequiredPrivilegesCtorArg = pmszRequiredPrivileges)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceRequiredPrivilegesInfow) return false
        if (this.pmszRequiredPrivileges != other.pmszRequiredPrivileges) return false
        return true
    }

    override fun hashCode(): Int = this.pmszRequiredPrivileges.hashCode()

    public companion object {
        public operator fun invoke(
            pmszRequiredPrivileges: Pwstr = MutPtr(0L),
        ): ServiceRequiredPrivilegesInfow =
            ServiceRequiredPrivilegesInfow(
                pmszRequiredPrivilegesCtorArg = pmszRequiredPrivileges,
            )
    }
}

public data class ServiceSidInfo(
    public var dwServiceSidType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceSidInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceSidInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServiceSidInfo =
                    ServiceSidInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServiceSidInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwServiceSidType)
                }
            }
    }
}

public data class ServiceStartReason(
    public var dwReason: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceStartReason> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceStartReason> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ServiceStartReason =
                    ServiceStartReason(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ServiceStartReason) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwReason)
                }
            }
    }
}

public data class ServiceStatus(
    public var dwServiceType: EnumServiceType = 0u,
    public var dwCurrentState: ServiceStatusCurrentState = 0u,
    public var dwControlsAccepted: UInt = 0u,
    public var dwWin32ExitCode: UInt = 0u,
    public var dwServiceSpecificExitCode: UInt = 0u,
    public var dwCheckPoint: UInt = 0u,
    public var dwWaitHint: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): ServiceStatus =
                    ServiceStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ServiceStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwServiceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCurrentState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwControlsAccepted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwWin32ExitCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwServiceSpecificExitCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCheckPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwWaitHint)
                }
            }
    }
}

public data class ServiceStatusProcess(
    public var dwServiceType: EnumServiceType = 0u,
    public var dwCurrentState: ServiceStatusCurrentState = 0u,
    public var dwControlsAccepted: UInt = 0u,
    public var dwWin32ExitCode: UInt = 0u,
    public var dwServiceSpecificExitCode: UInt = 0u,
    public var dwCheckPoint: UInt = 0u,
    public var dwWaitHint: UInt = 0u,
    public var dwProcessId: UInt = 0u,
    public var dwServiceFlags: ServiceRunsInProcess = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceStatusProcess> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceStatusProcess> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): ServiceStatusProcess =
                    ServiceStatusProcess(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: ServiceStatusProcess) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwServiceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCurrentState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwControlsAccepted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwWin32ExitCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwServiceSpecificExitCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCheckPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwWaitHint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwProcessId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwServiceFlags)
                }
            }
    }
}

public class ServiceTableEntrya internal constructor(
    lpServiceNameCtorArg: Pstr,
    public var lpServiceProc: LpserviceMainFunctiona,
) {
    public var lpServiceName: Pstr = lpServiceNameCtorArg
        internal set

    public constructor() : this(
        lpServiceNameCtorArg = MutPtr(0L),
        lpServiceProc = null,
    )

    public operator fun component1(): Pstr = this.lpServiceName

    public operator fun component2(): LpserviceMainFunctiona = this.lpServiceProc

    public fun copy(lpServiceName: Pstr = this.lpServiceName, lpServiceProc: LpserviceMainFunctiona = this.lpServiceProc): ServiceTableEntrya = ServiceTableEntrya(lpServiceNameCtorArg = lpServiceName, lpServiceProc = lpServiceProc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceTableEntrya) return false
        if (this.lpServiceName != other.lpServiceName) return false
        if (this.lpServiceProc != other.lpServiceProc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceName.hashCode()
        result = 31 * result + this.lpServiceProc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceName: Pstr = MutPtr(0L),
            lpServiceProc: LpserviceMainFunctiona = null,
        ): ServiceTableEntrya =
            ServiceTableEntrya(
                lpServiceNameCtorArg = lpServiceName,
                lpServiceProc = lpServiceProc,
            )
    }
}

public class ServiceTableEntryw internal constructor(
    lpServiceNameCtorArg: Pwstr,
    public var lpServiceProc: LpserviceMainFunctionw,
) {
    public var lpServiceName: Pwstr = lpServiceNameCtorArg
        internal set

    public constructor() : this(
        lpServiceNameCtorArg = MutPtr(0L),
        lpServiceProc = null,
    )

    public operator fun component1(): Pwstr = this.lpServiceName

    public operator fun component2(): LpserviceMainFunctionw = this.lpServiceProc

    public fun copy(lpServiceName: Pwstr = this.lpServiceName, lpServiceProc: LpserviceMainFunctionw = this.lpServiceProc): ServiceTableEntryw = ServiceTableEntryw(lpServiceNameCtorArg = lpServiceName, lpServiceProc = lpServiceProc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceTableEntryw) return false
        if (this.lpServiceName != other.lpServiceName) return false
        if (this.lpServiceProc != other.lpServiceProc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceName.hashCode()
        result = 31 * result + this.lpServiceProc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceName: Pwstr = MutPtr(0L),
            lpServiceProc: LpserviceMainFunctionw = null,
        ): ServiceTableEntryw =
            ServiceTableEntryw(
                lpServiceNameCtorArg = lpServiceName,
                lpServiceProc = lpServiceProc,
            )
    }
}

public data class ServiceTimechangeInfo(
    public var liNewTime: Long = 0L,
    public var liOldTime: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTimechangeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTimechangeInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ServiceTimechangeInfo =
                    ServiceTimechangeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ServiceTimechangeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.liNewTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.liOldTime)
                }
            }
    }
}

public class ServiceTrigger internal constructor(
    public var dwTriggerType: ServiceTriggerType,
    public var dwAction: ServiceTriggerAction,
    pTriggerSubtypeCtorArg: MutPtr,
    public var cDataItems: UInt,
    pDataItemsCtorArg: MutPtr,
) {
    public var pTriggerSubtype: MutPtr = pTriggerSubtypeCtorArg
        internal set

    public var pDataItems: MutPtr = pDataItemsCtorArg
        internal set

    public constructor() : this(
        dwTriggerType = 0u,
        dwAction = 0u,
        pTriggerSubtypeCtorArg = MutPtr(0L),
        cDataItems = 0u,
        pDataItemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ServiceTriggerType = this.dwTriggerType

    public operator fun component2(): ServiceTriggerAction = this.dwAction

    public operator fun component3(): MutPtr = this.pTriggerSubtype

    public operator fun component4(): UInt = this.cDataItems

    public operator fun component5(): MutPtr = this.pDataItems

    public fun copy(dwTriggerType: ServiceTriggerType = this.dwTriggerType, dwAction: ServiceTriggerAction = this.dwAction, pTriggerSubtype: MutPtr = this.pTriggerSubtype, cDataItems: UInt = this.cDataItems, pDataItems: MutPtr = this.pDataItems): ServiceTrigger = ServiceTrigger(dwTriggerType = dwTriggerType, dwAction = dwAction, pTriggerSubtypeCtorArg = pTriggerSubtype, cDataItems = cDataItems, pDataItemsCtorArg = pDataItems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceTrigger) return false
        if (this.dwTriggerType != other.dwTriggerType) return false
        if (this.dwAction != other.dwAction) return false
        if (this.pTriggerSubtype != other.pTriggerSubtype) return false
        if (this.cDataItems != other.cDataItems) return false
        if (this.pDataItems != other.pDataItems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwTriggerType.hashCode()
        result = 31 * result + this.dwAction.hashCode()
        result = 31 * result + this.pTriggerSubtype.hashCode()
        result = 31 * result + this.cDataItems.hashCode()
        result = 31 * result + this.pDataItems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTrigger> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTrigger> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ServiceTrigger =
                    ServiceTrigger(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ServiceTrigger) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTriggerType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAction)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pTriggerSubtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cDataItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pDataItems)
                }
            }

        public operator fun invoke(
            dwTriggerType: ServiceTriggerType = 0u,
            dwAction: ServiceTriggerAction = 0u,
            pTriggerSubtype: MutPtr = MutPtr(0L),
            cDataItems: UInt = 0u,
            pDataItems: MutPtr = MutPtr(0L),
        ): ServiceTrigger =
            ServiceTrigger(
                dwTriggerType = dwTriggerType,
                dwAction = dwAction,
                pTriggerSubtypeCtorArg = pTriggerSubtype,
                cDataItems = cDataItems,
                pDataItemsCtorArg = pDataItems,
            )
    }
}

public data class ServiceTriggerCustomStateId(
    public var data: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceTriggerCustomStateId) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTriggerCustomStateId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTriggerCustomStateId> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ServiceTriggerCustomStateId =
                    ServiceTriggerCustomStateId(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: ServiceTriggerCustomStateId) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr, value.data.toList())
                }
            }
    }
}

public class ServiceTriggerInfo internal constructor(
    public var cTriggers: UInt,
    pTriggersCtorArg: MutPtr,
    pReservedCtorArg: MutPtr,
) {
    public var pTriggers: MutPtr = pTriggersCtorArg
        internal set

    public var pReserved: MutPtr = pReservedCtorArg
        internal set

    public constructor() : this(
        cTriggers = 0u,
        pTriggersCtorArg = MutPtr(0L),
        pReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cTriggers

    public operator fun component2(): MutPtr = this.pTriggers

    public operator fun component3(): MutPtr = this.pReserved

    public fun copy(cTriggers: UInt = this.cTriggers, pTriggers: MutPtr = this.pTriggers, pReserved: MutPtr = this.pReserved): ServiceTriggerInfo = ServiceTriggerInfo(cTriggers = cTriggers, pTriggersCtorArg = pTriggers, pReservedCtorArg = pReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceTriggerInfo) return false
        if (this.cTriggers != other.cTriggers) return false
        if (this.pTriggers != other.pTriggers) return false
        if (this.pReserved != other.pReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cTriggers.hashCode()
        result = 31 * result + this.pTriggers.hashCode()
        result = 31 * result + this.pReserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTriggerInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTriggerInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ServiceTriggerInfo =
                    ServiceTriggerInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ServiceTriggerInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cTriggers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pTriggers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pReserved)
                }
            }

        public operator fun invoke(
            cTriggers: UInt = 0u,
            pTriggers: MutPtr = MutPtr(0L),
            pReserved: MutPtr = MutPtr(0L),
        ): ServiceTriggerInfo =
            ServiceTriggerInfo(
                cTriggers = cTriggers,
                pTriggersCtorArg = pTriggers,
                pReservedCtorArg = pReserved,
            )
    }
}

public class ServiceTriggerSpecificDataItem internal constructor(
    public var dwDataType: ServiceTriggerSpecificDataItemDataType,
    public var cbData: UInt,
    pDataCtorArg: MutPtr,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        dwDataType = 0u,
        cbData = 0u,
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ServiceTriggerSpecificDataItemDataType = this.dwDataType

    public operator fun component2(): UInt = this.cbData

    public operator fun component3(): MutPtr = this.pData

    public fun copy(dwDataType: ServiceTriggerSpecificDataItemDataType = this.dwDataType, cbData: UInt = this.cbData, pData: MutPtr = this.pData): ServiceTriggerSpecificDataItem = ServiceTriggerSpecificDataItem(dwDataType = dwDataType, cbData = cbData, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceTriggerSpecificDataItem) return false
        if (this.dwDataType != other.dwDataType) return false
        if (this.cbData != other.cbData) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDataType.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTriggerSpecificDataItem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTriggerSpecificDataItem> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ServiceTriggerSpecificDataItem =
                    ServiceTriggerSpecificDataItem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ServiceTriggerSpecificDataItem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDataType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pData)
                }
            }

        public operator fun invoke(
            dwDataType: ServiceTriggerSpecificDataItemDataType = 0u,
            cbData: UInt = 0u,
            pData: MutPtr = MutPtr(0L),
        ): ServiceTriggerSpecificDataItem =
            ServiceTriggerSpecificDataItem(
                dwDataType = dwDataType,
                cbData = cbData,
                pDataCtorArg = pData,
            )
    }
}
