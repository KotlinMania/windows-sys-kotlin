@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.AddressFamily
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.DlEui48
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.InAddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlDadState

public data class WnvCustomerAddressChangeParam(
    public var mACAddress: DlEui48 = DlEui48(),
    public var cAFamily: AddressFamily = 0u,
    public var ca: WnvIpAddress = WnvIpAddress(),
    public var virtualSubnetId: UInt = 0u,
    public var pAFamily: AddressFamily = 0u,
    public var pa: WnvIpAddress = WnvIpAddress(),
    public var notificationReason: WnvCaNotificationType = 0,
)

public data class WnvIpAddress(
    public var ip: WnvIpAddress0 = WnvIpAddress0(),
)

public data class WnvIpAddress0(
    public var v4: InAddr = InAddr(),
    public var v6: In6Addr = In6Addr(),
    public var addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WnvIpAddress0) return false
        if (this.v4 != other.v4) return false
        if (this.v6 != other.v6) return false
        if (!this.addr.contentEquals(other.addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.v4.hashCode()
        result = 31 * result + this.v6.hashCode()
        result = 31 * result + this.addr.contentHashCode()
        return result
    }
}

public data class WnvNotificationParam(
    public var header: WnvObjectHeader = WnvObjectHeader(),
    public var notificationType: WnvNotificationType = 0,
    public var pendingNotifications: UInt = 0u,
    public var buffer: COpaquePointer? = null,
)

public data class WnvObjectChangeParam(
    public var objectType: WnvObjectType = 0,
    public var objectParam: WnvObjectChangeParam0 = WnvObjectChangeParam0(),
)

public data class WnvObjectChangeParam0(
    public var providerAddressChange: WnvProviderAddressChangeParam = WnvProviderAddressChangeParam(),
    public var customerAddressChange: WnvCustomerAddressChangeParam = WnvCustomerAddressChangeParam(),
)

public data class WnvObjectHeader(
    public var majorVersion: UByte = 0u,
    public var minorVersion: UByte = 0u,
    public var size: UInt = 0u,
)

public data class WnvPolicyMismatchParam(
    public var cAFamily: AddressFamily = 0u,
    public var pAFamily: AddressFamily = 0u,
    public var virtualSubnetId: UInt = 0u,
    public var ca: WnvIpAddress = WnvIpAddress(),
    public var pa: WnvIpAddress = WnvIpAddress(),
)

public data class WnvProviderAddressChangeParam(
    public var pAFamily: AddressFamily = 0u,
    public var pa: WnvIpAddress = WnvIpAddress(),
    public var addressState: NlDadState = 0,
)

public data class WnvRedirectParam(
    public var cAFamily: AddressFamily = 0u,
    public var pAFamily: AddressFamily = 0u,
    public var newPAFamily: AddressFamily = 0u,
    public var virtualSubnetId: UInt = 0u,
    public var ca: WnvIpAddress = WnvIpAddress(),
    public var pa: WnvIpAddress = WnvIpAddress(),
    public var newPA: WnvIpAddress = WnvIpAddress(),
)
