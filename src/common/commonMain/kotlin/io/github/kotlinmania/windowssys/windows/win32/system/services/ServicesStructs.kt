@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ENUM_SERVICE_STATUSA(
    public var lpServiceName: PSTR = 0L,
    public var lpDisplayName: PSTR = 0L,
    public var ServiceStatus: SERVICE_STATUS = SERVICE_STATUS(),
)

public data class ENUM_SERVICE_STATUSW(
    public var lpServiceName: PWSTR = 0L,
    public var lpDisplayName: PWSTR = 0L,
    public var ServiceStatus: SERVICE_STATUS = SERVICE_STATUS(),
)

public data class ENUM_SERVICE_STATUS_PROCESSA(
    public var lpServiceName: PSTR = 0L,
    public var lpDisplayName: PSTR = 0L,
    public var ServiceStatusProcess: SERVICE_STATUS_PROCESS = SERVICE_STATUS_PROCESS(),
)

public data class ENUM_SERVICE_STATUS_PROCESSW(
    public var lpServiceName: PWSTR = 0L,
    public var lpDisplayName: PWSTR = 0L,
    public var ServiceStatusProcess: SERVICE_STATUS_PROCESS = SERVICE_STATUS_PROCESS(),
)

public data class QUERY_SERVICE_CONFIGA(
    public var dwServiceType: ENUM_SERVICE_TYPE = 0u,
    public var dwStartType: SERVICE_START_TYPE = 0u,
    public var dwErrorControl: SERVICE_ERROR = 0u,
    public var lpBinaryPathName: PSTR = 0L,
    public var lpLoadOrderGroup: PSTR = 0L,
    public var dwTagId: UInt = 0u,
    public var lpDependencies: PSTR = 0L,
    public var lpServiceStartName: PSTR = 0L,
    public var lpDisplayName: PSTR = 0L,
)

public data class QUERY_SERVICE_CONFIGW(
    public var dwServiceType: ENUM_SERVICE_TYPE = 0u,
    public var dwStartType: SERVICE_START_TYPE = 0u,
    public var dwErrorControl: SERVICE_ERROR = 0u,
    public var lpBinaryPathName: PWSTR = 0L,
    public var lpLoadOrderGroup: PWSTR = 0L,
    public var dwTagId: UInt = 0u,
    public var lpDependencies: PWSTR = 0L,
    public var lpServiceStartName: PWSTR = 0L,
    public var lpDisplayName: PWSTR = 0L,
)

public data class QUERY_SERVICE_LOCK_STATUSA(
    public var fIsLocked: UInt = 0u,
    public var lpLockOwner: PSTR = 0L,
    public var dwLockDuration: UInt = 0u,
)

public data class QUERY_SERVICE_LOCK_STATUSW(
    public var fIsLocked: UInt = 0u,
    public var lpLockOwner: PWSTR = 0L,
    public var dwLockDuration: UInt = 0u,
)

public data class SC_ACTION(public var Type: SC_ACTION_TYPE = 0, public var Delay: UInt = 0u)

public data class SERVICE_CONTROL_STATUS_REASON_PARAMSA(
    public var dwReason: UInt = 0u,
    public var pszComment: PSTR = 0L,
    public var ServiceStatus: SERVICE_STATUS_PROCESS = SERVICE_STATUS_PROCESS(),
)

public data class SERVICE_CONTROL_STATUS_REASON_PARAMSW(
    public var dwReason: UInt = 0u,
    public var pszComment: PWSTR = 0L,
    public var ServiceStatus: SERVICE_STATUS_PROCESS = SERVICE_STATUS_PROCESS(),
)

public data class SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM(public var u: SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0 = SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0())

public data class SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0(public var CustomStateId: SERVICE_TRIGGER_CUSTOM_STATE_ID = SERVICE_TRIGGER_CUSTOM_STATE_ID(), public var s: SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0 = SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0())

public data class SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0(public var DataOffset: UInt = 0u, public var Data: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0) return false
        if (this.DataOffset != other.DataOffset) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DataOffset.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class SERVICE_DELAYED_AUTO_START_INFO(public var fDelayedAutostart: BOOL = 0)

public data class SERVICE_DESCRIPTIONA(public var lpDescription: PSTR = 0L)

public data class SERVICE_DESCRIPTIONW(public var lpDescription: PWSTR = 0L)

public data class SERVICE_FAILURE_ACTIONSA(
    public var dwResetPeriod: UInt = 0u,
    public var lpRebootMsg: PSTR = 0L,
    public var lpCommand: PSTR = 0L,
    public var cActions: UInt = 0u,
    public var lpsaActions: Long = 0L,
)

public data class SERVICE_FAILURE_ACTIONSW(
    public var dwResetPeriod: UInt = 0u,
    public var lpRebootMsg: PWSTR = 0L,
    public var lpCommand: PWSTR = 0L,
    public var cActions: UInt = 0u,
    public var lpsaActions: Long = 0L,
)

public data class SERVICE_FAILURE_ACTIONS_FLAG(public var fFailureActionsOnNonCrashFailures: BOOL = 0)

public data class SERVICE_LAUNCH_PROTECTED_INFO(public var dwLaunchProtected: UInt = 0u)

public data class SERVICE_NOTIFY_1(
    public var dwVersion: UInt = 0u,
    public var pfnNotifyCallback: PFN_SC_NOTIFY_CALLBACK = null,
    public var pContext: Long = 0L,
    public var dwNotificationStatus: UInt = 0u,
    public var ServiceStatus: SERVICE_STATUS_PROCESS = SERVICE_STATUS_PROCESS(),
)

public data class SERVICE_NOTIFY_2A(
    public var dwVersion: UInt = 0u,
    public var pfnNotifyCallback: PFN_SC_NOTIFY_CALLBACK = null,
    public var pContext: Long = 0L,
    public var dwNotificationStatus: UInt = 0u,
    public var ServiceStatus: SERVICE_STATUS_PROCESS = SERVICE_STATUS_PROCESS(),
    public var dwNotificationTriggered: UInt = 0u,
    public var pszServiceNames: PSTR = 0L,
)

public data class SERVICE_NOTIFY_2W(
    public var dwVersion: UInt = 0u,
    public var pfnNotifyCallback: PFN_SC_NOTIFY_CALLBACK = null,
    public var pContext: Long = 0L,
    public var dwNotificationStatus: UInt = 0u,
    public var ServiceStatus: SERVICE_STATUS_PROCESS = SERVICE_STATUS_PROCESS(),
    public var dwNotificationTriggered: UInt = 0u,
    public var pszServiceNames: PWSTR = 0L,
)

public data class SERVICE_PREFERRED_NODE_INFO(public var usPreferredNode: UShort = 0u, public var fDelete: Boolean = false)

public data class SERVICE_PRESHUTDOWN_INFO(public var dwPreshutdownTimeout: UInt = 0u)

public data class SERVICE_REQUIRED_PRIVILEGES_INFOA(public var pmszRequiredPrivileges: PSTR = 0L)

public data class SERVICE_REQUIRED_PRIVILEGES_INFOW(public var pmszRequiredPrivileges: PWSTR = 0L)

public data class SERVICE_SID_INFO(public var dwServiceSidType: UInt = 0u)

public data class SERVICE_START_REASON(public var dwReason: UInt = 0u)

public data class SERVICE_STATUS(
    public var dwServiceType: ENUM_SERVICE_TYPE = 0u,
    public var dwCurrentState: SERVICE_STATUS_CURRENT_STATE = 0u,
    public var dwControlsAccepted: UInt = 0u,
    public var dwWin32ExitCode: UInt = 0u,
    public var dwServiceSpecificExitCode: UInt = 0u,
    public var dwCheckPoint: UInt = 0u,
    public var dwWaitHint: UInt = 0u,
)

public data class SERVICE_STATUS_PROCESS(
    public var dwServiceType: ENUM_SERVICE_TYPE = 0u,
    public var dwCurrentState: SERVICE_STATUS_CURRENT_STATE = 0u,
    public var dwControlsAccepted: UInt = 0u,
    public var dwWin32ExitCode: UInt = 0u,
    public var dwServiceSpecificExitCode: UInt = 0u,
    public var dwCheckPoint: UInt = 0u,
    public var dwWaitHint: UInt = 0u,
    public var dwProcessId: UInt = 0u,
    public var dwServiceFlags: SERVICE_RUNS_IN_PROCESS = 0u,
)

public data class SERVICE_TABLE_ENTRYA(public var lpServiceName: PSTR = 0L, public var lpServiceProc: LPSERVICE_MAIN_FUNCTIONA = null)

public data class SERVICE_TABLE_ENTRYW(public var lpServiceName: PWSTR = 0L, public var lpServiceProc: LPSERVICE_MAIN_FUNCTIONW = null)

public data class SERVICE_TIMECHANGE_INFO(public var liNewTime: Long = 0L, public var liOldTime: Long = 0L)

public data class SERVICE_TRIGGER(
    public var dwTriggerType: SERVICE_TRIGGER_TYPE = 0u,
    public var dwAction: SERVICE_TRIGGER_ACTION = 0u,
    public var pTriggerSubtype: Long = 0L,
    public var cDataItems: UInt = 0u,
    public var pDataItems: Long = 0L,
)

public data class SERVICE_TRIGGER_CUSTOM_STATE_ID(public var Data: UIntArray = UIntArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SERVICE_TRIGGER_CUSTOM_STATE_ID) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Data.contentHashCode()
    }
}

public data class SERVICE_TRIGGER_INFO(
    public var cTriggers: UInt = 0u,
    public var pTriggers: Long = 0L,
    public var pReserved: Long = 0L,
)

public data class SERVICE_TRIGGER_SPECIFIC_DATA_ITEM(
    public var dwDataType: SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE = 0u,
    public var cbData: UInt = 0u,
    public var pData: Long = 0L,
)
