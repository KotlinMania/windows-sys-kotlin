@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class NetInterfaceContext(
    public var interfaceIndex: UInt = 0u,
    public var configurationName: Pwstr = null,
)

public data class NetInterfaceContextTable(
    public var interfaceContextHandle: Handle = null,
    public var numberOfEntries: UInt = 0u,
    public var interfaceContextArray: NetInterfaceContext? = null,
)

public data class WcmBillingCycleInfo(
    public var startDate: Filetime = Filetime(),
    public var duration: WcmTimeInterval = WcmTimeInterval(),
    public var reset: Bool = 0,
)

public data class WcmConnectionCostData(
    public var connectionCost: UInt = 0u,
    public var costSource: WcmConnectionCostSource = 0,
)

public data class WcmDataplanStatus(
    public var usageData: WcmUsageData = WcmUsageData(),
    public var dataLimitInMegabytes: UInt = 0u,
    public var inboundBandwidthInKbps: UInt = 0u,
    public var outboundBandwidthInKbps: UInt = 0u,
    public var billingCycle: WcmBillingCycleInfo = WcmBillingCycleInfo(),
    public var maxTransferSizeInMegabytes: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class WcmPolicyValue(
    public var fValue: Bool = 0,
    public var fIsGroupPolicy: Bool = 0,
)

public data class WcmProfileInfo(
    public var strProfileName: UShortArray = UShortArray(256),
    public var adapterGUID: Guid = Guid(),
    public var media: WcmMediaType = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WcmProfileInfo) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.adapterGUID != other.adapterGUID) return false
        if (this.media != other.media) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strProfileName.contentHashCode()
        result = 31 * result + this.adapterGUID.hashCode()
        result = 31 * result + this.media.hashCode()
        return result
    }
}

public data class WcmProfileInfoList(
    public var dwNumberOfItems: UInt = 0u,
    public var profileInfo: List<WcmProfileInfo> = List(1) { WcmProfileInfo() },
)

public data class WcmTimeInterval(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wMilliseconds: UShort = 0u,
)

public data class WcmUsageData(
    public var usageInMegabytes: UInt = 0u,
    public var lastSyncTime: Filetime = Filetime(),
)
