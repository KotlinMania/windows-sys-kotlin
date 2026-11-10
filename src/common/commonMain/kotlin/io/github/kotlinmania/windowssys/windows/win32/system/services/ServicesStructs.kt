@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class EnumServiceStatusa(
    public var lpServiceName: Pstr = null,
    public var lpDisplayName: Pstr = null,
    public var serviceStatus: ServiceStatus = ServiceStatus(),
)

public data class EnumServiceStatusw(
    public var lpServiceName: Pwstr = null,
    public var lpDisplayName: Pwstr = null,
    public var serviceStatus: ServiceStatus = ServiceStatus(),
)

public data class EnumServiceStatusProcessa(
    public var lpServiceName: Pstr = null,
    public var lpDisplayName: Pstr = null,
    public var serviceStatusProcess: ServiceStatusProcess = ServiceStatusProcess(),
)

public data class EnumServiceStatusProcessw(
    public var lpServiceName: Pwstr = null,
    public var lpDisplayName: Pwstr = null,
    public var serviceStatusProcess: ServiceStatusProcess = ServiceStatusProcess(),
)

public data class QueryServiceConfiga(
    public var dwServiceType: EnumServiceType = 0u,
    public var dwStartType: ServiceStartType = 0u,
    public var dwErrorControl: ServiceError = 0u,
    public var lpBinaryPathName: Pstr = null,
    public var lpLoadOrderGroup: Pstr = null,
    public var dwTagId: UInt = 0u,
    public var lpDependencies: Pstr = null,
    public var lpServiceStartName: Pstr = null,
    public var lpDisplayName: Pstr = null,
)

public data class QueryServiceConfigw(
    public var dwServiceType: EnumServiceType = 0u,
    public var dwStartType: ServiceStartType = 0u,
    public var dwErrorControl: ServiceError = 0u,
    public var lpBinaryPathName: Pwstr = null,
    public var lpLoadOrderGroup: Pwstr = null,
    public var dwTagId: UInt = 0u,
    public var lpDependencies: Pwstr = null,
    public var lpServiceStartName: Pwstr = null,
    public var lpDisplayName: Pwstr = null,
)

public data class QueryServiceLockStatusa(
    public var fIsLocked: UInt = 0u,
    public var lpLockOwner: Pstr = null,
    public var dwLockDuration: UInt = 0u,
)

public data class QueryServiceLockStatusw(
    public var fIsLocked: UInt = 0u,
    public var lpLockOwner: Pwstr = null,
    public var dwLockDuration: UInt = 0u,
)

public data class ScAction(
    public var type: ScActionType = 0,
    public var delay: UInt = 0u,
)

public data class ServiceControlStatusReasonParamsa(
    public var dwReason: UInt = 0u,
    public var pszComment: Pstr = null,
    public var serviceStatus: ServiceStatusProcess = ServiceStatusProcess(),
)

public data class ServiceControlStatusReasonParamsw(
    public var dwReason: UInt = 0u,
    public var pszComment: Pwstr = null,
    public var serviceStatus: ServiceStatusProcess = ServiceStatusProcess(),
)

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
}

public data class ServiceDelayedAutoStartInfo(
    public var fDelayedAutostart: Bool = 0,
)

public data class ServiceDescriptiona(
    public var lpDescription: Pstr = null,
)

public data class ServiceDescriptionw(
    public var lpDescription: Pwstr = null,
)

public data class ServiceFailureActionsa(
    public var dwResetPeriod: UInt = 0u,
    public var lpRebootMsg: Pstr = null,
    public var lpCommand: Pstr = null,
    public var cActions: UInt = 0u,
    public var lpsaActions: ScAction? = null,
)

public data class ServiceFailureActionsw(
    public var dwResetPeriod: UInt = 0u,
    public var lpRebootMsg: Pwstr = null,
    public var lpCommand: Pwstr = null,
    public var cActions: UInt = 0u,
    public var lpsaActions: ScAction? = null,
)

public data class ServiceFailureActionsFlag(
    public var fFailureActionsOnNonCrashFailures: Bool = 0,
)

public data class ServiceLaunchProtectedInfo(
    public var dwLaunchProtected: UInt = 0u,
)

public data class ServiceNotify1(
    public var dwVersion: UInt = 0u,
    public var pfnNotifyCallback: PfnScNotifyCallback = null,
    public var pContext: COpaquePointer? = null,
    public var dwNotificationStatus: UInt = 0u,
    public var serviceStatus: ServiceStatusProcess = ServiceStatusProcess(),
)

public data class ServiceNotify2a(
    public var dwVersion: UInt = 0u,
    public var pfnNotifyCallback: PfnScNotifyCallback = null,
    public var pContext: COpaquePointer? = null,
    public var dwNotificationStatus: UInt = 0u,
    public var serviceStatus: ServiceStatusProcess = ServiceStatusProcess(),
    public var dwNotificationTriggered: UInt = 0u,
    public var pszServiceNames: Pstr = null,
)

public data class ServiceNotify2w(
    public var dwVersion: UInt = 0u,
    public var pfnNotifyCallback: PfnScNotifyCallback = null,
    public var pContext: COpaquePointer? = null,
    public var dwNotificationStatus: UInt = 0u,
    public var serviceStatus: ServiceStatusProcess = ServiceStatusProcess(),
    public var dwNotificationTriggered: UInt = 0u,
    public var pszServiceNames: Pwstr = null,
)

public data class ServicePreferredNodeInfo(
    public var usPreferredNode: UShort = 0u,
    public var fDelete: Boolean = false,
)

public data class ServicePreshutdownInfo(
    public var dwPreshutdownTimeout: UInt = 0u,
)

public data class ServiceRequiredPrivilegesInfoa(
    public var pmszRequiredPrivileges: Pstr = null,
)

public data class ServiceRequiredPrivilegesInfow(
    public var pmszRequiredPrivileges: Pwstr = null,
)

public data class ServiceSidInfo(
    public var dwServiceSidType: UInt = 0u,
)

public data class ServiceStartReason(
    public var dwReason: UInt = 0u,
)

public data class ServiceStatus(
    public var dwServiceType: EnumServiceType = 0u,
    public var dwCurrentState: ServiceStatusCurrentState = 0u,
    public var dwControlsAccepted: UInt = 0u,
    public var dwWin32ExitCode: UInt = 0u,
    public var dwServiceSpecificExitCode: UInt = 0u,
    public var dwCheckPoint: UInt = 0u,
    public var dwWaitHint: UInt = 0u,
)

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
)

public data class ServiceTableEntrya(
    public var lpServiceName: Pstr = null,
    public var lpServiceProc: LpserviceMainFunctiona = null,
)

public data class ServiceTableEntryw(
    public var lpServiceName: Pwstr = null,
    public var lpServiceProc: LpserviceMainFunctionw = null,
)

public data class ServiceTimechangeInfo(
    public var liNewTime: Long = 0L,
    public var liOldTime: Long = 0L,
)

public data class ServiceTrigger(
    public var dwTriggerType: ServiceTriggerType = 0u,
    public var dwAction: ServiceTriggerAction = 0u,
    public var pTriggerSubtype: Guid? = null,
    public var cDataItems: UInt = 0u,
    public var pDataItems: ServiceTriggerSpecificDataItem? = null,
)

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
}

public data class ServiceTriggerInfo(
    public var cTriggers: UInt = 0u,
    public var pTriggers: ServiceTrigger? = null,
    public var pReserved: COpaquePointer? = null,
)

public data class ServiceTriggerSpecificDataItem(
    public var dwDataType: ServiceTriggerSpecificDataItemDataType = 0u,
    public var cbData: UInt = 0u,
    public var pData: COpaquePointer? = null,
)
