@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public data class NET_INTERFACE_CONTEXT(public var InterfaceIndex: UInt = 0u, public var ConfigurationName: PWSTR = 0L)

public data class NET_INTERFACE_CONTEXT_TABLE(
    public var InterfaceContextHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var NumberOfEntries: UInt = 0u,
    public var InterfaceContextArray: Long = 0L,
)

public data class WCM_BILLING_CYCLE_INFO(
    public var StartDate: Foundation.FILETIME = Foundation.FILETIME(),
    public var Duration: WCM_TIME_INTERVAL = WCM_TIME_INTERVAL(),
    public var Reset: BOOL = 0,
)

public data class WCM_CONNECTION_COST_DATA(public var ConnectionCost: UInt = 0u, public var CostSource: WCM_CONNECTION_COST_SOURCE = 0)

public data class WCM_DATAPLAN_STATUS(
    public var UsageData: WCM_USAGE_DATA = WCM_USAGE_DATA(),
    public var DataLimitInMegabytes: UInt = 0u,
    public var InboundBandwidthInKbps: UInt = 0u,
    public var OutboundBandwidthInKbps: UInt = 0u,
    public var BillingCycle: WCM_BILLING_CYCLE_INFO = WCM_BILLING_CYCLE_INFO(),
    public var MaxTransferSizeInMegabytes: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class WCM_POLICY_VALUE(public var fValue: BOOL = 0, public var fIsGroupPolicy: BOOL = 0)

public data class WCM_PROFILE_INFO(
    public var strProfileName: UShortArray = UShortArray(256),
    public var AdapterGUID: GUID = GUID(),
    public var Media: WCM_MEDIA_TYPE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WCM_PROFILE_INFO) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.AdapterGUID != other.AdapterGUID) return false
        if (this.Media != other.Media) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strProfileName.contentHashCode()
        result = 31 * result + this.AdapterGUID.hashCode()
        result = 31 * result + this.Media.hashCode()
        return result
    }
}

public data class WCM_PROFILE_INFO_LIST(public var dwNumberOfItems: UInt = 0u, public var ProfileInfo: List<WCM_PROFILE_INFO> = List(1) { WCM_PROFILE_INFO() })

public data class WCM_TIME_INTERVAL(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wMilliseconds: UShort = 0u,
)

public data class WCM_USAGE_DATA(public var UsageInMegabytes: UInt = 0u, public var LastSyncTime: Foundation.FILETIME = Foundation.FILETIME())
