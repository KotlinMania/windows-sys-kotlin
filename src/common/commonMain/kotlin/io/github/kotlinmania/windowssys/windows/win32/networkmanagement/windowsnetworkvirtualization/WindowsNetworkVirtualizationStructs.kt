@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

public data class WNV_CUSTOMER_ADDRESS_CHANGE_PARAM(
    public var MACAddress: Networking.WinSock.DL_EUI48 = Networking.WinSock.DL_EUI48(),
    public var CAFamily: Networking.WinSock.ADDRESS_FAMILY = Networking.WinSock.ADDRESS_FAMILY(),
    public var CA: WNV_IP_ADDRESS = WNV_IP_ADDRESS(),
    public var VirtualSubnetId: UInt = 0u,
    public var PAFamily: Networking.WinSock.ADDRESS_FAMILY = Networking.WinSock.ADDRESS_FAMILY(),
    public var PA: WNV_IP_ADDRESS = WNV_IP_ADDRESS(),
    public var NotificationReason: WNV_CA_NOTIFICATION_TYPE = 0,
)

public data class WNV_IP_ADDRESS(public var IP: WNV_IP_ADDRESS_0 = WNV_IP_ADDRESS_0())

public data class WNV_IP_ADDRESS_0(
    public var v4: Networking.WinSock.IN_ADDR = Networking.WinSock.IN_ADDR(),
    public var v6: Networking.WinSock.IN6_ADDR = Networking.WinSock.IN6_ADDR(),
    public var Addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WNV_IP_ADDRESS_0) return false
        if (this.v4 != other.v4) return false
        if (this.v6 != other.v6) return false
        if (!this.Addr.contentEquals(other.Addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.v4.hashCode()
        result = 31 * result + this.v6.hashCode()
        result = 31 * result + this.Addr.contentHashCode()
        return result
    }
}

public data class WNV_NOTIFICATION_PARAM(
    public var Header: WNV_OBJECT_HEADER = WNV_OBJECT_HEADER(),
    public var NotificationType: WNV_NOTIFICATION_TYPE = 0,
    public var PendingNotifications: UInt = 0u,
    public var Buffer: Long = 0L,
)

public data class WNV_OBJECT_CHANGE_PARAM(public var ObjectType: WNV_OBJECT_TYPE = 0, public var ObjectParam: WNV_OBJECT_CHANGE_PARAM_0 = WNV_OBJECT_CHANGE_PARAM_0())

public data class WNV_OBJECT_CHANGE_PARAM_0(public var ProviderAddressChange: WNV_PROVIDER_ADDRESS_CHANGE_PARAM = WNV_PROVIDER_ADDRESS_CHANGE_PARAM(), public var CustomerAddressChange: WNV_CUSTOMER_ADDRESS_CHANGE_PARAM = WNV_CUSTOMER_ADDRESS_CHANGE_PARAM())

public data class WNV_OBJECT_HEADER(
    public var MajorVersion: UByte = 0u,
    public var MinorVersion: UByte = 0u,
    public var Size: UInt = 0u,
)

public data class WNV_POLICY_MISMATCH_PARAM(
    public var CAFamily: Networking.WinSock.ADDRESS_FAMILY = Networking.WinSock.ADDRESS_FAMILY(),
    public var PAFamily: Networking.WinSock.ADDRESS_FAMILY = Networking.WinSock.ADDRESS_FAMILY(),
    public var VirtualSubnetId: UInt = 0u,
    public var CA: WNV_IP_ADDRESS = WNV_IP_ADDRESS(),
    public var PA: WNV_IP_ADDRESS = WNV_IP_ADDRESS(),
)

public data class WNV_PROVIDER_ADDRESS_CHANGE_PARAM(
    public var PAFamily: Networking.WinSock.ADDRESS_FAMILY = Networking.WinSock.ADDRESS_FAMILY(),
    public var PA: WNV_IP_ADDRESS = WNV_IP_ADDRESS(),
    public var AddressState: Networking.WinSock.NL_DAD_STATE = Networking.WinSock.NL_DAD_STATE(),
)

public data class WNV_REDIRECT_PARAM(
    public var CAFamily: Networking.WinSock.ADDRESS_FAMILY = Networking.WinSock.ADDRESS_FAMILY(),
    public var PAFamily: Networking.WinSock.ADDRESS_FAMILY = Networking.WinSock.ADDRESS_FAMILY(),
    public var NewPAFamily: Networking.WinSock.ADDRESS_FAMILY = Networking.WinSock.ADDRESS_FAMILY(),
    public var VirtualSubnetId: UInt = 0u,
    public var CA: WNV_IP_ADDRESS = WNV_IP_ADDRESS(),
    public var PA: WNV_IP_ADDRESS = WNV_IP_ADDRESS(),
    public var NewPA: WNV_IP_ADDRESS = WNV_IP_ADDRESS(),
)
