@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ARP_SEND_REPLY(public var DestAddress: UInt = 0u, public var SrcAddress: UInt = 0u)

public data class DNS_DOH_SERVER_SETTINGS(public var Template: PWSTR = 0L, public var Flags: ULong = 0uL)

public data class DNS_INTERFACE_SETTINGS(
    public var Version: UInt = 0u,
    public var Flags: ULong = 0uL,
    public var Domain: PWSTR = 0L,
    public var NameServer: PWSTR = 0L,
    public var SearchList: PWSTR = 0L,
    public var RegistrationEnabled: UInt = 0u,
    public var RegisterAdapterName: UInt = 0u,
    public var EnableLLMNR: UInt = 0u,
    public var QueryAdapterName: UInt = 0u,
    public var ProfileNameServer: PWSTR = 0L,
)

public data class DNS_INTERFACE_SETTINGS3(
    public var Version: UInt = 0u,
    public var Flags: ULong = 0uL,
    public var Domain: PWSTR = 0L,
    public var NameServer: PWSTR = 0L,
    public var SearchList: PWSTR = 0L,
    public var RegistrationEnabled: UInt = 0u,
    public var RegisterAdapterName: UInt = 0u,
    public var EnableLLMNR: UInt = 0u,
    public var QueryAdapterName: UInt = 0u,
    public var ProfileNameServer: PWSTR = 0L,
    public var DisableUnconstrainedQueries: UInt = 0u,
    public var SupplementalSearchList: PWSTR = 0L,
    public var cServerProperties: UInt = 0u,
    public var ServerProperties: Long = 0L,
    public var cProfileServerProperties: UInt = 0u,
    public var ProfileServerProperties: Long = 0L,
)

public class DNS_INTERFACE_SETTINGS4(
    public var Version: UInt = 0u,
    public var Flags: ULong = 0uL,
    public var Domain: PWSTR = 0L,
    public var NameServer: PWSTR = 0L,
    public var SearchList: PWSTR = 0L,
    public var RegistrationEnabled: UInt = 0u,
    public var RegisterAdapterName: UInt = 0u,
    public var EnableLLMNR: UInt = 0u,
    public var QueryAdapterName: UInt = 0u,
    public var ProfileNameServer: PWSTR = 0L,
    public var DisableUnconstrainedQueries: UInt = 0u,
    public var SupplementalSearchList: PWSTR = 0L,
    public var cServerProperties: UInt = 0u,
    public var ServerProperties: Long = 0L,
    public var cProfileServerProperties: UInt = 0u,
    public var ProfileServerProperties: Long = 0L,
    public var EncryptedDnsAdapterFlags: UInt = 0u,
)

public data class DNS_INTERFACE_SETTINGS_EX(
    public var SettingsV1: DNS_INTERFACE_SETTINGS = DNS_INTERFACE_SETTINGS(),
    public var DisableUnconstrainedQueries: UInt = 0u,
    public var SupplementalSearchList: PWSTR = 0L,
)

public data class DNS_SERVER_PROPERTY(
    public var Version: UInt = 0u,
    public var ServerIndex: UInt = 0u,
    public var Type: DNS_SERVER_PROPERTY_TYPE = 0,
    public var Property: DNS_SERVER_PROPERTY_TYPES = DNS_SERVER_PROPERTY_TYPES(),
)

public data class DNS_SERVER_PROPERTY_TYPES(public var DohSettings: Long = 0L)

public data class DNS_SETTINGS(
    public var Version: UInt = 0u,
    public var Flags: ULong = 0uL,
    public var Hostname: PWSTR = 0L,
    public var Domain: PWSTR = 0L,
    public var SearchList: PWSTR = 0L,
)

public data class DNS_SETTINGS2(
    public var Version: UInt = 0u,
    public var Flags: ULong = 0uL,
    public var Hostname: PWSTR = 0L,
    public var Domain: PWSTR = 0L,
    public var SearchList: PWSTR = 0L,
    public var SettingFlags: ULong = 0uL,
)

public data class FIXED_INFO_W2KSP1(
    public var HostName: ByteArray = ByteArray(132),
    public var DomainName: ByteArray = ByteArray(132),
    public var CurrentDnsServer: Long = 0L,
    public var DnsServerList: IP_ADDR_STRING = IP_ADDR_STRING(),
    public var NodeType: UInt = 0u,
    public var ScopeId: ByteArray = ByteArray(260),
    public var EnableRouting: UInt = 0u,
    public var EnableProxy: UInt = 0u,
    public var EnableDns: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FIXED_INFO_W2KSP1) return false
        if (!this.HostName.contentEquals(other.HostName)) return false
        if (!this.DomainName.contentEquals(other.DomainName)) return false
        if (this.CurrentDnsServer != other.CurrentDnsServer) return false
        if (this.DnsServerList != other.DnsServerList) return false
        if (this.NodeType != other.NodeType) return false
        if (!this.ScopeId.contentEquals(other.ScopeId)) return false
        if (this.EnableRouting != other.EnableRouting) return false
        if (this.EnableProxy != other.EnableProxy) return false
        if (this.EnableDns != other.EnableDns) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HostName.contentHashCode()
        result = 31 * result + this.DomainName.contentHashCode()
        result = 31 * result + this.CurrentDnsServer.hashCode()
        result = 31 * result + this.DnsServerList.hashCode()
        result = 31 * result + this.NodeType.hashCode()
        result = 31 * result + this.ScopeId.contentHashCode()
        result = 31 * result + this.EnableRouting.hashCode()
        result = 31 * result + this.EnableProxy.hashCode()
        result = 31 * result + this.EnableDns.hashCode()
        return result
    }
}

public data class ICMPV6_ECHO_REPLY_LH(
    public var Address: IPV6_ADDRESS_EX = IPV6_ADDRESS_EX(),
    public var Status: UInt = 0u,
    public var RoundTripTime: UInt = 0u,
)

public data class ICMP_ECHO_REPLY(
    public var Address: UInt = 0u,
    public var Status: UInt = 0u,
    public var RoundTripTime: UInt = 0u,
    public var DataSize: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Data: Long = 0L,
    public var Options: IP_OPTION_INFORMATION = IP_OPTION_INFORMATION(),
)

public data class ICMP_ECHO_REPLY32(
    public var Address: UInt = 0u,
    public var Status: UInt = 0u,
    public var RoundTripTime: UInt = 0u,
    public var DataSize: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Data: Long = 0L,
    public var Options: IP_OPTION_INFORMATION32 = IP_OPTION_INFORMATION32(),
)

public data class INTERFACE_HARDWARE_CROSSTIMESTAMP(
    public var SystemTimestamp1: ULong = 0uL,
    public var HardwareClockTimestamp: ULong = 0uL,
    public var SystemTimestamp2: ULong = 0uL,
)

public data class INTERFACE_HARDWARE_TIMESTAMP_CAPABILITIES(
    public var PtpV2OverUdpIPv4EventMessageReceive: Boolean = false,
    public var PtpV2OverUdpIPv4AllMessageReceive: Boolean = false,
    public var PtpV2OverUdpIPv4EventMessageTransmit: Boolean = false,
    public var PtpV2OverUdpIPv4AllMessageTransmit: Boolean = false,
    public var PtpV2OverUdpIPv6EventMessageReceive: Boolean = false,
    public var PtpV2OverUdpIPv6AllMessageReceive: Boolean = false,
    public var PtpV2OverUdpIPv6EventMessageTransmit: Boolean = false,
    public var PtpV2OverUdpIPv6AllMessageTransmit: Boolean = false,
    public var AllReceive: Boolean = false,
    public var AllTransmit: Boolean = false,
    public var TaggedTransmit: Boolean = false,
)

public data class INTERFACE_SOFTWARE_TIMESTAMP_CAPABILITIES(
    public var AllReceive: Boolean = false,
    public var AllTransmit: Boolean = false,
    public var TaggedTransmit: Boolean = false,
)

public data class INTERFACE_TIMESTAMP_CAPABILITIES(
    public var HardwareClockFrequencyHz: ULong = 0uL,
    public var SupportsCrossTimestamp: Boolean = false,
    public var HardwareCapabilities: INTERFACE_HARDWARE_TIMESTAMP_CAPABILITIES = INTERFACE_HARDWARE_TIMESTAMP_CAPABILITIES(),
    public var SoftwareCapabilities: INTERFACE_SOFTWARE_TIMESTAMP_CAPABILITIES = INTERFACE_SOFTWARE_TIMESTAMP_CAPABILITIES(),
)

public data class IPV6_ADDRESS_EX(
    public var sin6_port: UShort = 0u,
    public var sin6_flowinfo: UInt = 0u,
    public var sin6_addr: UShortArray = UShortArray(8),
    public var sin6_scope_id: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPV6_ADDRESS_EX) return false
        if (this.sin6_port != other.sin6_port) return false
        if (this.sin6_flowinfo != other.sin6_flowinfo) return false
        if (!this.sin6_addr.contentEquals(other.sin6_addr)) return false
        if (this.sin6_scope_id != other.sin6_scope_id) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin6_port.hashCode()
        result = 31 * result + this.sin6_flowinfo.hashCode()
        result = 31 * result + this.sin6_addr.contentHashCode()
        result = 31 * result + this.sin6_scope_id.hashCode()
        return result
    }
}

public class IP_ADAPTER_ADDRESSES_LH(
    public var Anonymous1: IP_ADAPTER_ADDRESSES_LH_0 = IP_ADAPTER_ADDRESSES_LH_0(),
    public var Next: Long = 0L,
    public var AdapterName: PSTR = 0L,
    public var FirstUnicastAddress: Long = 0L,
    public var FirstAnycastAddress: Long = 0L,
    public var FirstMulticastAddress: Long = 0L,
    public var FirstDnsServerAddress: Long = 0L,
    public var DnsSuffix: PWSTR = 0L,
    public var Description: PWSTR = 0L,
    public var FriendlyName: PWSTR = 0L,
    public var PhysicalAddress: UByteArray = UByteArray(8),
    public var PhysicalAddressLength: UInt = 0u,
    public var Anonymous2: IP_ADAPTER_ADDRESSES_LH_1 = IP_ADAPTER_ADDRESSES_LH_1(),
    public var Mtu: UInt = 0u,
    public var IfType: UInt = 0u,
    public var OperStatus: Ndis.IF_OPER_STATUS = Ndis.IF_OPER_STATUS(),
    public var Ipv6IfIndex: UInt = 0u,
    public var ZoneIndices: UIntArray = UIntArray(16),
    public var FirstPrefix: Long = 0L,
    public var TransmitLinkSpeed: ULong = 0uL,
    public var ReceiveLinkSpeed: ULong = 0uL,
    public var FirstWinsServerAddress: Long = 0L,
    public var FirstGatewayAddress: Long = 0L,
    public var Ipv4Metric: UInt = 0u,
    public var Ipv6Metric: UInt = 0u,
    public var Luid: Ndis.NET_LUID_LH = Ndis.NET_LUID_LH(),
    public var Dhcpv4Server: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
    public var CompartmentId: Ndis.NET_IF_COMPARTMENT_ID = Ndis.NET_IF_COMPARTMENT_ID(),
    public var NetworkGuid: GUID = GUID(),
    public var ConnectionType: Ndis.NET_IF_CONNECTION_TYPE = Ndis.NET_IF_CONNECTION_TYPE(),
    public var TunnelType: Ndis.TUNNEL_TYPE = Ndis.TUNNEL_TYPE(),
    public var Dhcpv6Server: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
    public var Dhcpv6ClientDuid: UByteArray = UByteArray(130),
    public var Dhcpv6ClientDuidLength: UInt = 0u,
    public var Dhcpv6Iaid: UInt = 0u,
    public var FirstDnsSuffix: Long = 0L,
)

public data class IP_ADAPTER_ADDRESSES_LH_0(public var Alignment: ULong = 0uL, public var Anonymous: IP_ADAPTER_ADDRESSES_LH_0_0 = IP_ADAPTER_ADDRESSES_LH_0_0())

public data class IP_ADAPTER_ADDRESSES_LH_0_0(public var Length: UInt = 0u, public var IfIndex: UInt = 0u)

public data class IP_ADAPTER_ADDRESSES_LH_1(public var Flags: UInt = 0u, public var Anonymous: IP_ADAPTER_ADDRESSES_LH_1_0 = IP_ADAPTER_ADDRESSES_LH_1_0())

public data class IP_ADAPTER_ADDRESSES_LH_1_0(public var _bitfield: UInt = 0u)

public class IP_ADAPTER_ADDRESSES_XP(
    public var Anonymous: IP_ADAPTER_ADDRESSES_XP_0 = IP_ADAPTER_ADDRESSES_XP_0(),
    public var Next: Long = 0L,
    public var AdapterName: PSTR = 0L,
    public var FirstUnicastAddress: Long = 0L,
    public var FirstAnycastAddress: Long = 0L,
    public var FirstMulticastAddress: Long = 0L,
    public var FirstDnsServerAddress: Long = 0L,
    public var DnsSuffix: PWSTR = 0L,
    public var Description: PWSTR = 0L,
    public var FriendlyName: PWSTR = 0L,
    public var PhysicalAddress: UByteArray = UByteArray(8),
    public var PhysicalAddressLength: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Mtu: UInt = 0u,
    public var IfType: UInt = 0u,
    public var OperStatus: Ndis.IF_OPER_STATUS = Ndis.IF_OPER_STATUS(),
    public var Ipv6IfIndex: UInt = 0u,
    public var ZoneIndices: UIntArray = UIntArray(16),
    public var FirstPrefix: Long = 0L,
)

public data class IP_ADAPTER_ADDRESSES_XP_0(public var Alignment: ULong = 0uL, public var Anonymous: IP_ADAPTER_ADDRESSES_XP_0_0 = IP_ADAPTER_ADDRESSES_XP_0_0())

public data class IP_ADAPTER_ADDRESSES_XP_0_0(public var Length: UInt = 0u, public var IfIndex: UInt = 0u)

public data class IP_ADAPTER_ANYCAST_ADDRESS_XP(
    public var Anonymous: IP_ADAPTER_ANYCAST_ADDRESS_XP_0 = IP_ADAPTER_ANYCAST_ADDRESS_XP_0(),
    public var Next: Long = 0L,
    public var Address: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
)

public data class IP_ADAPTER_ANYCAST_ADDRESS_XP_0(public var Alignment: ULong = 0uL, public var Anonymous: IP_ADAPTER_ANYCAST_ADDRESS_XP_0_0 = IP_ADAPTER_ANYCAST_ADDRESS_XP_0_0())

public data class IP_ADAPTER_ANYCAST_ADDRESS_XP_0_0(public var Length: UInt = 0u, public var Flags: UInt = 0u)

public data class IP_ADAPTER_DNS_SERVER_ADDRESS_XP(
    public var Anonymous: IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0 = IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0(),
    public var Next: Long = 0L,
    public var Address: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
)

public data class IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0(public var Alignment: ULong = 0uL, public var Anonymous: IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0_0 = IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0_0())

public data class IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0_0(public var Length: UInt = 0u, public var Reserved: UInt = 0u)

public data class IP_ADAPTER_DNS_SUFFIX(public var Next: Long = 0L, public var String: UShortArray = UShortArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IP_ADAPTER_DNS_SUFFIX) return false
        if (this.Next != other.Next) return false
        if (!this.String.contentEquals(other.String)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Next.hashCode()
        result = 31 * result + this.String.contentHashCode()
        return result
    }
}

public data class IP_ADAPTER_GATEWAY_ADDRESS_LH(
    public var Anonymous: IP_ADAPTER_GATEWAY_ADDRESS_LH_0 = IP_ADAPTER_GATEWAY_ADDRESS_LH_0(),
    public var Next: Long = 0L,
    public var Address: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
)

public data class IP_ADAPTER_GATEWAY_ADDRESS_LH_0(public var Alignment: ULong = 0uL, public var Anonymous: IP_ADAPTER_GATEWAY_ADDRESS_LH_0_0 = IP_ADAPTER_GATEWAY_ADDRESS_LH_0_0())

public data class IP_ADAPTER_GATEWAY_ADDRESS_LH_0_0(public var Length: UInt = 0u, public var Reserved: UInt = 0u)

public data class IP_ADAPTER_INDEX_MAP(public var Index: UInt = 0u, public var Name: UShortArray = UShortArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IP_ADAPTER_INDEX_MAP) return false
        if (this.Index != other.Index) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Index.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public class IP_ADAPTER_INFO(
    public var Next: Long = 0L,
    public var ComboIndex: UInt = 0u,
    public var AdapterName: ByteArray = ByteArray(260),
    public var Description: ByteArray = ByteArray(132),
    public var AddressLength: UInt = 0u,
    public var Address: UByteArray = UByteArray(8),
    public var Index: UInt = 0u,
    public var Type: UInt = 0u,
    public var DhcpEnabled: UInt = 0u,
    public var CurrentIpAddress: Long = 0L,
    public var IpAddressList: IP_ADDR_STRING = IP_ADDR_STRING(),
    public var GatewayList: IP_ADDR_STRING = IP_ADDR_STRING(),
    public var DhcpServer: IP_ADDR_STRING = IP_ADDR_STRING(),
    public var HaveWins: BOOL = 0,
    public var PrimaryWinsServer: IP_ADDR_STRING = IP_ADDR_STRING(),
    public var SecondaryWinsServer: IP_ADDR_STRING = IP_ADDR_STRING(),
    public var LeaseObtained: Long = 0L,
    public var LeaseExpires: Long = 0L,
)

public data class IP_ADAPTER_MULTICAST_ADDRESS_XP(
    public var Anonymous: IP_ADAPTER_MULTICAST_ADDRESS_XP_0 = IP_ADAPTER_MULTICAST_ADDRESS_XP_0(),
    public var Next: Long = 0L,
    public var Address: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
)

public data class IP_ADAPTER_MULTICAST_ADDRESS_XP_0(public var Alignment: ULong = 0uL, public var Anonymous: IP_ADAPTER_MULTICAST_ADDRESS_XP_0_0 = IP_ADAPTER_MULTICAST_ADDRESS_XP_0_0())

public data class IP_ADAPTER_MULTICAST_ADDRESS_XP_0_0(public var Length: UInt = 0u, public var Flags: UInt = 0u)

public data class IP_ADAPTER_ORDER_MAP(public var NumAdapters: UInt = 0u, public var AdapterOrder: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IP_ADAPTER_ORDER_MAP) return false
        if (this.NumAdapters != other.NumAdapters) return false
        if (!this.AdapterOrder.contentEquals(other.AdapterOrder)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumAdapters.hashCode()
        result = 31 * result + this.AdapterOrder.contentHashCode()
        return result
    }
}

public data class IP_ADAPTER_PREFIX_XP(
    public var Anonymous: IP_ADAPTER_PREFIX_XP_0 = IP_ADAPTER_PREFIX_XP_0(),
    public var Next: Long = 0L,
    public var Address: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
    public var PrefixLength: UInt = 0u,
)

public data class IP_ADAPTER_PREFIX_XP_0(public var Alignment: ULong = 0uL, public var Anonymous: IP_ADAPTER_PREFIX_XP_0_0 = IP_ADAPTER_PREFIX_XP_0_0())

public data class IP_ADAPTER_PREFIX_XP_0_0(public var Length: UInt = 0u, public var Flags: UInt = 0u)

public data class IP_ADAPTER_UNICAST_ADDRESS_LH(
    public var Anonymous: IP_ADAPTER_UNICAST_ADDRESS_LH_0 = IP_ADAPTER_UNICAST_ADDRESS_LH_0(),
    public var Next: Long = 0L,
    public var Address: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
    public var PrefixOrigin: Networking.WinSock.NL_PREFIX_ORIGIN = Networking.WinSock.NL_PREFIX_ORIGIN(),
    public var SuffixOrigin: Networking.WinSock.NL_SUFFIX_ORIGIN = Networking.WinSock.NL_SUFFIX_ORIGIN(),
    public var DadState: Networking.WinSock.NL_DAD_STATE = Networking.WinSock.NL_DAD_STATE(),
    public var ValidLifetime: UInt = 0u,
    public var PreferredLifetime: UInt = 0u,
    public var LeaseLifetime: UInt = 0u,
    public var OnLinkPrefixLength: UByte = 0u,
)

public data class IP_ADAPTER_UNICAST_ADDRESS_LH_0(public var Alignment: ULong = 0uL, public var Anonymous: IP_ADAPTER_UNICAST_ADDRESS_LH_0_0 = IP_ADAPTER_UNICAST_ADDRESS_LH_0_0())

public data class IP_ADAPTER_UNICAST_ADDRESS_LH_0_0(public var Length: UInt = 0u, public var Flags: UInt = 0u)

public data class IP_ADAPTER_UNICAST_ADDRESS_XP(
    public var Anonymous: IP_ADAPTER_UNICAST_ADDRESS_XP_0 = IP_ADAPTER_UNICAST_ADDRESS_XP_0(),
    public var Next: Long = 0L,
    public var Address: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
    public var PrefixOrigin: Networking.WinSock.NL_PREFIX_ORIGIN = Networking.WinSock.NL_PREFIX_ORIGIN(),
    public var SuffixOrigin: Networking.WinSock.NL_SUFFIX_ORIGIN = Networking.WinSock.NL_SUFFIX_ORIGIN(),
    public var DadState: Networking.WinSock.NL_DAD_STATE = Networking.WinSock.NL_DAD_STATE(),
    public var ValidLifetime: UInt = 0u,
    public var PreferredLifetime: UInt = 0u,
    public var LeaseLifetime: UInt = 0u,
)

public data class IP_ADAPTER_UNICAST_ADDRESS_XP_0(public var Alignment: ULong = 0uL, public var Anonymous: IP_ADAPTER_UNICAST_ADDRESS_XP_0_0 = IP_ADAPTER_UNICAST_ADDRESS_XP_0_0())

public data class IP_ADAPTER_UNICAST_ADDRESS_XP_0_0(public var Length: UInt = 0u, public var Flags: UInt = 0u)

public data class IP_ADAPTER_WINS_SERVER_ADDRESS_LH(
    public var Anonymous: IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0 = IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0(),
    public var Next: Long = 0L,
    public var Address: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
)

public data class IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0(public var Alignment: ULong = 0uL, public var Anonymous: IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0_0 = IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0_0())

public data class IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0_0(public var Length: UInt = 0u, public var Reserved: UInt = 0u)

public data class IP_ADDRESS_PREFIX(public var Prefix: Networking.WinSock.SOCKADDR_INET = Networking.WinSock.SOCKADDR_INET(), public var PrefixLength: UByte = 0u)

public data class IP_ADDRESS_STRING(public var String: ByteArray = ByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IP_ADDRESS_STRING) return false
        if (!this.String.contentEquals(other.String)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.String.contentHashCode()
    }
}

public data class IP_ADDR_STRING(
    public var Next: Long = 0L,
    public var IpAddress: IP_ADDRESS_STRING = IP_ADDRESS_STRING(),
    public var IpMask: IP_ADDRESS_STRING = IP_ADDRESS_STRING(),
    public var Context: UInt = 0u,
)

public data class IP_INTERFACE_INFO(public var NumAdapters: Int = 0, public var Adapter: List<IP_ADAPTER_INDEX_MAP> = List(1) { IP_ADAPTER_INDEX_MAP() })

public data class IP_INTERFACE_NAME_INFO_W2KSP1(
    public var Index: UInt = 0u,
    public var MediaType: UInt = 0u,
    public var ConnectionType: UByte = 0u,
    public var AccessType: UByte = 0u,
    public var DeviceGuid: GUID = GUID(),
    public var InterfaceGuid: GUID = GUID(),
)

public data class IP_MCAST_COUNTER_INFO(
    public var InMcastOctets: ULong = 0uL,
    public var OutMcastOctets: ULong = 0uL,
    public var InMcastPkts: ULong = 0uL,
    public var OutMcastPkts: ULong = 0uL,
)

public data class IP_OPTION_INFORMATION(
    public var Ttl: UByte = 0u,
    public var Tos: UByte = 0u,
    public var Flags: UByte = 0u,
    public var OptionsSize: UByte = 0u,
    public var OptionsData: Long = 0L,
)

public data class IP_OPTION_INFORMATION32(
    public var Ttl: UByte = 0u,
    public var Tos: UByte = 0u,
    public var Flags: UByte = 0u,
    public var OptionsSize: UByte = 0u,
    public var OptionsData: Long = 0L,
)

public data class IP_PER_ADAPTER_INFO_W2KSP1(
    public var AutoconfigEnabled: UInt = 0u,
    public var AutoconfigActive: UInt = 0u,
    public var CurrentDnsServer: Long = 0L,
    public var DnsServerList: IP_ADDR_STRING = IP_ADDR_STRING(),
)

public data class IP_UNIDIRECTIONAL_ADAPTER_ADDRESS(public var NumAdapters: UInt = 0u, public var Address: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IP_UNIDIRECTIONAL_ADAPTER_ADDRESS) return false
        if (this.NumAdapters != other.NumAdapters) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumAdapters.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        return result
    }
}

public data class MIBICMPINFO(public var icmpInStats: MIBICMPSTATS = MIBICMPSTATS(), public var icmpOutStats: MIBICMPSTATS = MIBICMPSTATS())

public data class MIBICMPSTATS(
    public var dwMsgs: UInt = 0u,
    public var dwErrors: UInt = 0u,
    public var dwDestUnreachs: UInt = 0u,
    public var dwTimeExcds: UInt = 0u,
    public var dwParmProbs: UInt = 0u,
    public var dwSrcQuenchs: UInt = 0u,
    public var dwRedirects: UInt = 0u,
    public var dwEchos: UInt = 0u,
    public var dwEchoReps: UInt = 0u,
    public var dwTimestamps: UInt = 0u,
    public var dwTimestampReps: UInt = 0u,
    public var dwAddrMasks: UInt = 0u,
    public var dwAddrMaskReps: UInt = 0u,
)

public data class MIBICMPSTATS_EX_XPSP1(
    public var dwMsgs: UInt = 0u,
    public var dwErrors: UInt = 0u,
    public var rgdwTypeCount: UIntArray = UIntArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIBICMPSTATS_EX_XPSP1) return false
        if (this.dwMsgs != other.dwMsgs) return false
        if (this.dwErrors != other.dwErrors) return false
        if (!this.rgdwTypeCount.contentEquals(other.rgdwTypeCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMsgs.hashCode()
        result = 31 * result + this.dwErrors.hashCode()
        result = 31 * result + this.rgdwTypeCount.contentHashCode()
        return result
    }
}

public data class MIB_ANYCASTIPADDRESS_ROW(
    public var Address: Networking.WinSock.SOCKADDR_INET = Networking.WinSock.SOCKADDR_INET(),
    public var InterfaceLuid: Ndis.NET_LUID_LH = Ndis.NET_LUID_LH(),
    public var InterfaceIndex: UInt = 0u,
    public var ScopeId: Networking.WinSock.SCOPE_ID = Networking.WinSock.SCOPE_ID(),
)

public data class MIB_ANYCASTIPADDRESS_TABLE(public var NumEntries: UInt = 0u, public var Table: List<MIB_ANYCASTIPADDRESS_ROW> = List(1) { MIB_ANYCASTIPADDRESS_ROW() })

public data class MIB_BEST_IF(public var dwDestAddr: UInt = 0u, public var dwIfIndex: UInt = 0u)

public data class MIB_BOUNDARYROW(public var dwGroupAddress: UInt = 0u, public var dwGroupMask: UInt = 0u)

public data class MIB_ICMP(public var stats: MIBICMPINFO = MIBICMPINFO())

public data class MIB_ICMP_EX_XPSP1(public var icmpInStats: MIBICMPSTATS_EX_XPSP1 = MIBICMPSTATS_EX_XPSP1(), public var icmpOutStats: MIBICMPSTATS_EX_XPSP1 = MIBICMPSTATS_EX_XPSP1())

public data class MIB_IFNUMBER(public var dwValue: UInt = 0u)

public class MIB_IFROW(
    public var wszName: UShortArray = UShortArray(256),
    public var dwIndex: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwMtu: UInt = 0u,
    public var dwSpeed: UInt = 0u,
    public var dwPhysAddrLen: UInt = 0u,
    public var bPhysAddr: UByteArray = UByteArray(8),
    public var dwAdminStatus: UInt = 0u,
    public var dwOperStatus: INTERNAL_IF_OPER_STATUS = 0,
    public var dwLastChange: UInt = 0u,
    public var dwInOctets: UInt = 0u,
    public var dwInUcastPkts: UInt = 0u,
    public var dwInNUcastPkts: UInt = 0u,
    public var dwInDiscards: UInt = 0u,
    public var dwInErrors: UInt = 0u,
    public var dwInUnknownProtos: UInt = 0u,
    public var dwOutOctets: UInt = 0u,
    public var dwOutUcastPkts: UInt = 0u,
    public var dwOutNUcastPkts: UInt = 0u,
    public var dwOutDiscards: UInt = 0u,
    public var dwOutErrors: UInt = 0u,
    public var dwOutQLen: UInt = 0u,
    public var dwDescrLen: UInt = 0u,
    public var bDescr: UByteArray = UByteArray(256),
)

public data class MIB_IFSTACK_ROW(public var HigherLayerInterfaceIndex: UInt = 0u, public var LowerLayerInterfaceIndex: UInt = 0u)

public data class MIB_IFSTACK_TABLE(public var NumEntries: UInt = 0u, public var Table: List<MIB_IFSTACK_ROW> = List(1) { MIB_IFSTACK_ROW() })

public data class MIB_IFSTATUS(
    public var dwIfIndex: UInt = 0u,
    public var dwAdminStatus: UInt = 0u,
    public var dwOperationalStatus: UInt = 0u,
    public var bMHbeatActive: BOOL = 0,
    public var bMHbeatAlive: BOOL = 0,
)

public data class MIB_IFTABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_IFROW> = List(1) { MIB_IFROW() })

public class MIB_IF_ROW2(
    public var InterfaceLuid: Ndis.NET_LUID_LH = Ndis.NET_LUID_LH(),
    public var InterfaceIndex: UInt = 0u,
    public var InterfaceGuid: GUID = GUID(),
    public var Alias: UShortArray = UShortArray(257),
    public var Description: UShortArray = UShortArray(257),
    public var PhysicalAddressLength: UInt = 0u,
    public var PhysicalAddress: UByteArray = UByteArray(32),
    public var PermanentPhysicalAddress: UByteArray = UByteArray(32),
    public var Mtu: UInt = 0u,
    public var Type: UInt = 0u,
    public var TunnelType: Ndis.TUNNEL_TYPE = Ndis.TUNNEL_TYPE(),
    public var MediaType: Ndis.NDIS_MEDIUM = Ndis.NDIS_MEDIUM(),
    public var PhysicalMediumType: Ndis.NDIS_PHYSICAL_MEDIUM = Ndis.NDIS_PHYSICAL_MEDIUM(),
    public var AccessType: Ndis.NET_IF_ACCESS_TYPE = Ndis.NET_IF_ACCESS_TYPE(),
    public var DirectionType: Ndis.NET_IF_DIRECTION_TYPE = Ndis.NET_IF_DIRECTION_TYPE(),
    public var InterfaceAndOperStatusFlags: MIB_IF_ROW2_0 = MIB_IF_ROW2_0(),
    public var OperStatus: Ndis.IF_OPER_STATUS = Ndis.IF_OPER_STATUS(),
    public var AdminStatus: Ndis.NET_IF_ADMIN_STATUS = Ndis.NET_IF_ADMIN_STATUS(),
    public var MediaConnectState: Ndis.NET_IF_MEDIA_CONNECT_STATE = Ndis.NET_IF_MEDIA_CONNECT_STATE(),
    public var NetworkGuid: GUID = GUID(),
    public var ConnectionType: Ndis.NET_IF_CONNECTION_TYPE = Ndis.NET_IF_CONNECTION_TYPE(),
    public var TransmitLinkSpeed: ULong = 0uL,
    public var ReceiveLinkSpeed: ULong = 0uL,
    public var InOctets: ULong = 0uL,
    public var InUcastPkts: ULong = 0uL,
    public var InNUcastPkts: ULong = 0uL,
    public var InDiscards: ULong = 0uL,
    public var InErrors: ULong = 0uL,
    public var InUnknownProtos: ULong = 0uL,
    public var InUcastOctets: ULong = 0uL,
    public var InMulticastOctets: ULong = 0uL,
    public var InBroadcastOctets: ULong = 0uL,
    public var OutOctets: ULong = 0uL,
    public var OutUcastPkts: ULong = 0uL,
    public var OutNUcastPkts: ULong = 0uL,
    public var OutDiscards: ULong = 0uL,
    public var OutErrors: ULong = 0uL,
    public var OutUcastOctets: ULong = 0uL,
    public var OutMulticastOctets: ULong = 0uL,
    public var OutBroadcastOctets: ULong = 0uL,
    public var OutQLen: ULong = 0uL,
)

public data class MIB_IF_ROW2_0(public var _bitfield: UByte = 0u)

public data class MIB_IF_TABLE2(public var NumEntries: UInt = 0u, public var Table: List<MIB_IF_ROW2> = List(1) { MIB_IF_ROW2() })

public data class MIB_INVERTEDIFSTACK_ROW(public var LowerLayerInterfaceIndex: UInt = 0u, public var HigherLayerInterfaceIndex: UInt = 0u)

public data class MIB_INVERTEDIFSTACK_TABLE(public var NumEntries: UInt = 0u, public var Table: List<MIB_INVERTEDIFSTACK_ROW> = List(1) { MIB_INVERTEDIFSTACK_ROW() })

public data class MIB_IPADDRROW_W2K(
    public var dwAddr: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwBCastAddr: UInt = 0u,
    public var dwReasmSize: UInt = 0u,
    public var unused1: UShort = 0u,
    public var unused2: UShort = 0u,
)

public data class MIB_IPADDRROW_XP(
    public var dwAddr: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwBCastAddr: UInt = 0u,
    public var dwReasmSize: UInt = 0u,
    public var unused1: UShort = 0u,
    public var wType: UShort = 0u,
)

public data class MIB_IPADDRTABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_IPADDRROW_XP> = List(1) { MIB_IPADDRROW_XP() })

public data class MIB_IPDESTROW(
    public var ForwardRow: MIB_IPFORWARDROW = MIB_IPFORWARDROW(),
    public var dwForwardPreference: UInt = 0u,
    public var dwForwardViewSet: UInt = 0u,
)

public data class MIB_IPDESTTABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_IPDESTROW> = List(1) { MIB_IPDESTROW() })

public data class MIB_IPFORWARDNUMBER(public var dwValue: UInt = 0u)

public data class MIB_IPFORWARDROW(
    public var dwForwardDest: UInt = 0u,
    public var dwForwardMask: UInt = 0u,
    public var dwForwardPolicy: UInt = 0u,
    public var dwForwardNextHop: UInt = 0u,
    public var dwForwardIfIndex: UInt = 0u,
    public var Anonymous1: MIB_IPFORWARDROW_0 = MIB_IPFORWARDROW_0(),
    public var Anonymous2: MIB_IPFORWARDROW_1 = MIB_IPFORWARDROW_1(),
    public var dwForwardAge: UInt = 0u,
    public var dwForwardNextHopAS: UInt = 0u,
    public var dwForwardMetric1: UInt = 0u,
    public var dwForwardMetric2: UInt = 0u,
    public var dwForwardMetric3: UInt = 0u,
    public var dwForwardMetric4: UInt = 0u,
    public var dwForwardMetric5: UInt = 0u,
)

public data class MIB_IPFORWARDROW_0(public var dwForwardType: UInt = 0u, public var ForwardType: MIB_IPFORWARD_TYPE = 0)

public data class MIB_IPFORWARDROW_1(public var dwForwardProto: UInt = 0u, public var ForwardProto: Networking.WinSock.NL_ROUTE_PROTOCOL = Networking.WinSock.NL_ROUTE_PROTOCOL())

public data class MIB_IPFORWARDTABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_IPFORWARDROW> = List(1) { MIB_IPFORWARDROW() })

public data class MIB_IPFORWARD_ROW2(
    public var InterfaceLuid: Ndis.NET_LUID_LH = Ndis.NET_LUID_LH(),
    public var InterfaceIndex: UInt = 0u,
    public var DestinationPrefix: IP_ADDRESS_PREFIX = IP_ADDRESS_PREFIX(),
    public var NextHop: Networking.WinSock.SOCKADDR_INET = Networking.WinSock.SOCKADDR_INET(),
    public var SitePrefixLength: UByte = 0u,
    public var ValidLifetime: UInt = 0u,
    public var PreferredLifetime: UInt = 0u,
    public var Metric: UInt = 0u,
    public var Protocol: Networking.WinSock.NL_ROUTE_PROTOCOL = Networking.WinSock.NL_ROUTE_PROTOCOL(),
    public var Loopback: Boolean = false,
    public var AutoconfigureAddress: Boolean = false,
    public var Publish: Boolean = false,
    public var Immortal: Boolean = false,
    public var Age: UInt = 0u,
    public var Origin: Networking.WinSock.NL_ROUTE_ORIGIN = Networking.WinSock.NL_ROUTE_ORIGIN(),
)

public data class MIB_IPFORWARD_TABLE2(public var NumEntries: UInt = 0u, public var Table: List<MIB_IPFORWARD_ROW2> = List(1) { MIB_IPFORWARD_ROW2() })

public class MIB_IPINTERFACE_ROW(
    public var Family: Networking.WinSock.ADDRESS_FAMILY = Networking.WinSock.ADDRESS_FAMILY(),
    public var InterfaceLuid: Ndis.NET_LUID_LH = Ndis.NET_LUID_LH(),
    public var InterfaceIndex: UInt = 0u,
    public var MaxReassemblySize: UInt = 0u,
    public var InterfaceIdentifier: ULong = 0uL,
    public var MinRouterAdvertisementInterval: UInt = 0u,
    public var MaxRouterAdvertisementInterval: UInt = 0u,
    public var AdvertisingEnabled: Boolean = false,
    public var ForwardingEnabled: Boolean = false,
    public var WeakHostSend: Boolean = false,
    public var WeakHostReceive: Boolean = false,
    public var UseAutomaticMetric: Boolean = false,
    public var UseNeighborUnreachabilityDetection: Boolean = false,
    public var ManagedAddressConfigurationSupported: Boolean = false,
    public var OtherStatefulConfigurationSupported: Boolean = false,
    public var AdvertiseDefaultRoute: Boolean = false,
    public var RouterDiscoveryBehavior: Networking.WinSock.NL_ROUTER_DISCOVERY_BEHAVIOR = Networking.WinSock.NL_ROUTER_DISCOVERY_BEHAVIOR(),
    public var DadTransmits: UInt = 0u,
    public var BaseReachableTime: UInt = 0u,
    public var RetransmitTime: UInt = 0u,
    public var PathMtuDiscoveryTimeout: UInt = 0u,
    public var LinkLocalAddressBehavior: Networking.WinSock.NL_LINK_LOCAL_ADDRESS_BEHAVIOR = Networking.WinSock.NL_LINK_LOCAL_ADDRESS_BEHAVIOR(),
    public var LinkLocalAddressTimeout: UInt = 0u,
    public var ZoneIndices: UIntArray = UIntArray(16),
    public var SitePrefixLength: UInt = 0u,
    public var Metric: UInt = 0u,
    public var NlMtu: UInt = 0u,
    public var Connected: Boolean = false,
    public var SupportsWakeUpPatterns: Boolean = false,
    public var SupportsNeighborDiscovery: Boolean = false,
    public var SupportsRouterDiscovery: Boolean = false,
    public var ReachableTime: UInt = 0u,
    public var TransmitOffload: Networking.WinSock.NL_INTERFACE_OFFLOAD_ROD = Networking.WinSock.NL_INTERFACE_OFFLOAD_ROD(),
    public var ReceiveOffload: Networking.WinSock.NL_INTERFACE_OFFLOAD_ROD = Networking.WinSock.NL_INTERFACE_OFFLOAD_ROD(),
    public var DisableDefaultRoutes: Boolean = false,
)

public data class MIB_IPINTERFACE_TABLE(public var NumEntries: UInt = 0u, public var Table: List<MIB_IPINTERFACE_ROW> = List(1) { MIB_IPINTERFACE_ROW() })

public data class MIB_IPMCAST_BOUNDARY(
    public var dwIfIndex: UInt = 0u,
    public var dwGroupAddress: UInt = 0u,
    public var dwGroupMask: UInt = 0u,
    public var dwStatus: UInt = 0u,
)

public data class MIB_IPMCAST_BOUNDARY_TABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_IPMCAST_BOUNDARY> = List(1) { MIB_IPMCAST_BOUNDARY() })

public data class MIB_IPMCAST_GLOBAL(public var dwEnable: UInt = 0u)

public data class MIB_IPMCAST_IF_ENTRY(
    public var dwIfIndex: UInt = 0u,
    public var dwTtl: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var dwRateLimit: UInt = 0u,
    public var ulInMcastOctets: UInt = 0u,
    public var ulOutMcastOctets: UInt = 0u,
)

public data class MIB_IPMCAST_IF_TABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_IPMCAST_IF_ENTRY> = List(1) { MIB_IPMCAST_IF_ENTRY() })

public data class MIB_IPMCAST_MFE(
    public var dwGroup: UInt = 0u,
    public var dwSource: UInt = 0u,
    public var dwSrcMask: UInt = 0u,
    public var dwUpStrmNgbr: UInt = 0u,
    public var dwInIfIndex: UInt = 0u,
    public var dwInIfProtocol: UInt = 0u,
    public var dwRouteProtocol: UInt = 0u,
    public var dwRouteNetwork: UInt = 0u,
    public var dwRouteMask: UInt = 0u,
    public var ulUpTime: UInt = 0u,
    public var ulExpiryTime: UInt = 0u,
    public var ulTimeOut: UInt = 0u,
    public var ulNumOutIf: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgmioOutInfo: List<MIB_IPMCAST_OIF_XP> = List(1) { MIB_IPMCAST_OIF_XP() },
)

public class MIB_IPMCAST_MFE_STATS(
    public var dwGroup: UInt = 0u,
    public var dwSource: UInt = 0u,
    public var dwSrcMask: UInt = 0u,
    public var dwUpStrmNgbr: UInt = 0u,
    public var dwInIfIndex: UInt = 0u,
    public var dwInIfProtocol: UInt = 0u,
    public var dwRouteProtocol: UInt = 0u,
    public var dwRouteNetwork: UInt = 0u,
    public var dwRouteMask: UInt = 0u,
    public var ulUpTime: UInt = 0u,
    public var ulExpiryTime: UInt = 0u,
    public var ulNumOutIf: UInt = 0u,
    public var ulInPkts: UInt = 0u,
    public var ulInOctets: UInt = 0u,
    public var ulPktsDifferentIf: UInt = 0u,
    public var ulQueueOverflow: UInt = 0u,
    public var rgmiosOutStats: List<MIB_IPMCAST_OIF_STATS_LH> = List(1) { MIB_IPMCAST_OIF_STATS_LH() },
)

public class MIB_IPMCAST_MFE_STATS_EX_XP(
    public var dwGroup: UInt = 0u,
    public var dwSource: UInt = 0u,
    public var dwSrcMask: UInt = 0u,
    public var dwUpStrmNgbr: UInt = 0u,
    public var dwInIfIndex: UInt = 0u,
    public var dwInIfProtocol: UInt = 0u,
    public var dwRouteProtocol: UInt = 0u,
    public var dwRouteNetwork: UInt = 0u,
    public var dwRouteMask: UInt = 0u,
    public var ulUpTime: UInt = 0u,
    public var ulExpiryTime: UInt = 0u,
    public var ulNumOutIf: UInt = 0u,
    public var ulInPkts: UInt = 0u,
    public var ulInOctets: UInt = 0u,
    public var ulPktsDifferentIf: UInt = 0u,
    public var ulQueueOverflow: UInt = 0u,
    public var ulUninitMfe: UInt = 0u,
    public var ulNegativeMfe: UInt = 0u,
    public var ulInDiscards: UInt = 0u,
    public var ulInHdrErrors: UInt = 0u,
    public var ulTotalOutPackets: UInt = 0u,
    public var rgmiosOutStats: List<MIB_IPMCAST_OIF_STATS_LH> = List(1) { MIB_IPMCAST_OIF_STATS_LH() },
)

public data class MIB_IPMCAST_OIF_STATS_LH(
    public var dwOutIfIndex: UInt = 0u,
    public var dwNextHopAddr: UInt = 0u,
    public var dwDialContext: UInt = 0u,
    public var ulTtlTooLow: UInt = 0u,
    public var ulFragNeeded: UInt = 0u,
    public var ulOutPackets: UInt = 0u,
    public var ulOutDiscards: UInt = 0u,
)

public data class MIB_IPMCAST_OIF_STATS_W2K(
    public var dwOutIfIndex: UInt = 0u,
    public var dwNextHopAddr: UInt = 0u,
    public var pvDialContext: Long = 0L,
    public var ulTtlTooLow: UInt = 0u,
    public var ulFragNeeded: UInt = 0u,
    public var ulOutPackets: UInt = 0u,
    public var ulOutDiscards: UInt = 0u,
)

public data class MIB_IPMCAST_OIF_W2K(
    public var dwOutIfIndex: UInt = 0u,
    public var dwNextHopAddr: UInt = 0u,
    public var pvReserved: Long = 0L,
    public var dwReserved: UInt = 0u,
)

public data class MIB_IPMCAST_OIF_XP(
    public var dwOutIfIndex: UInt = 0u,
    public var dwNextHopAddr: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var dwReserved1: UInt = 0u,
)

public data class MIB_IPMCAST_SCOPE(
    public var dwGroupAddress: UInt = 0u,
    public var dwGroupMask: UInt = 0u,
    public var snNameBuffer: UShortArray = UShortArray(256),
    public var dwStatus: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_IPMCAST_SCOPE) return false
        if (this.dwGroupAddress != other.dwGroupAddress) return false
        if (this.dwGroupMask != other.dwGroupMask) return false
        if (!this.snNameBuffer.contentEquals(other.snNameBuffer)) return false
        if (this.dwStatus != other.dwStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwGroupAddress.hashCode()
        result = 31 * result + this.dwGroupMask.hashCode()
        result = 31 * result + this.snNameBuffer.contentHashCode()
        result = 31 * result + this.dwStatus.hashCode()
        return result
    }
}

public data class MIB_IPNETROW_LH(
    public var dwIndex: UInt = 0u,
    public var dwPhysAddrLen: UInt = 0u,
    public var bPhysAddr: UByteArray = UByteArray(8),
    public var dwAddr: UInt = 0u,
    public var Anonymous: MIB_IPNETROW_LH_0 = MIB_IPNETROW_LH_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_IPNETROW_LH) return false
        if (this.dwIndex != other.dwIndex) return false
        if (this.dwPhysAddrLen != other.dwPhysAddrLen) return false
        if (!this.bPhysAddr.contentEquals(other.bPhysAddr)) return false
        if (this.dwAddr != other.dwAddr) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIndex.hashCode()
        result = 31 * result + this.dwPhysAddrLen.hashCode()
        result = 31 * result + this.bPhysAddr.contentHashCode()
        result = 31 * result + this.dwAddr.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class MIB_IPNETROW_LH_0(public var dwType: UInt = 0u, public var Type: MIB_IPNET_TYPE = 0)

public data class MIB_IPNETROW_W2K(
    public var dwIndex: UInt = 0u,
    public var dwPhysAddrLen: UInt = 0u,
    public var bPhysAddr: UByteArray = UByteArray(8),
    public var dwAddr: UInt = 0u,
    public var dwType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_IPNETROW_W2K) return false
        if (this.dwIndex != other.dwIndex) return false
        if (this.dwPhysAddrLen != other.dwPhysAddrLen) return false
        if (!this.bPhysAddr.contentEquals(other.bPhysAddr)) return false
        if (this.dwAddr != other.dwAddr) return false
        if (this.dwType != other.dwType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIndex.hashCode()
        result = 31 * result + this.dwPhysAddrLen.hashCode()
        result = 31 * result + this.bPhysAddr.contentHashCode()
        result = 31 * result + this.dwAddr.hashCode()
        result = 31 * result + this.dwType.hashCode()
        return result
    }
}

public data class MIB_IPNETTABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_IPNETROW_LH> = List(1) { MIB_IPNETROW_LH() })

public data class MIB_IPNET_ROW2(
    public var Address: Networking.WinSock.SOCKADDR_INET = Networking.WinSock.SOCKADDR_INET(),
    public var InterfaceIndex: UInt = 0u,
    public var InterfaceLuid: Ndis.NET_LUID_LH = Ndis.NET_LUID_LH(),
    public var PhysicalAddress: UByteArray = UByteArray(32),
    public var PhysicalAddressLength: UInt = 0u,
    public var State: Networking.WinSock.NL_NEIGHBOR_STATE = Networking.WinSock.NL_NEIGHBOR_STATE(),
    public var Anonymous: MIB_IPNET_ROW2_0 = MIB_IPNET_ROW2_0(),
    public var ReachabilityTime: MIB_IPNET_ROW2_1 = MIB_IPNET_ROW2_1(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_IPNET_ROW2) return false
        if (this.Address != other.Address) return false
        if (this.InterfaceIndex != other.InterfaceIndex) return false
        if (this.InterfaceLuid != other.InterfaceLuid) return false
        if (!this.PhysicalAddress.contentEquals(other.PhysicalAddress)) return false
        if (this.PhysicalAddressLength != other.PhysicalAddressLength) return false
        if (this.State != other.State) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.ReachabilityTime != other.ReachabilityTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Address.hashCode()
        result = 31 * result + this.InterfaceIndex.hashCode()
        result = 31 * result + this.InterfaceLuid.hashCode()
        result = 31 * result + this.PhysicalAddress.contentHashCode()
        result = 31 * result + this.PhysicalAddressLength.hashCode()
        result = 31 * result + this.State.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.ReachabilityTime.hashCode()
        return result
    }
}

public data class MIB_IPNET_ROW2_0(public var Anonymous: MIB_IPNET_ROW2_0_0 = MIB_IPNET_ROW2_0_0(), public var Flags: UByte = 0u)

public data class MIB_IPNET_ROW2_0_0(public var _bitfield: UByte = 0u)

public data class MIB_IPNET_ROW2_1(public var LastReachable: UInt = 0u, public var LastUnreachable: UInt = 0u)

public data class MIB_IPNET_TABLE2(public var NumEntries: UInt = 0u, public var Table: List<MIB_IPNET_ROW2> = List(1) { MIB_IPNET_ROW2() })

public data class MIB_IPPATH_ROW(
    public var Source: Networking.WinSock.SOCKADDR_INET = Networking.WinSock.SOCKADDR_INET(),
    public var Destination: Networking.WinSock.SOCKADDR_INET = Networking.WinSock.SOCKADDR_INET(),
    public var InterfaceLuid: Ndis.NET_LUID_LH = Ndis.NET_LUID_LH(),
    public var InterfaceIndex: UInt = 0u,
    public var CurrentNextHop: Networking.WinSock.SOCKADDR_INET = Networking.WinSock.SOCKADDR_INET(),
    public var PathMtu: UInt = 0u,
    public var RttMean: UInt = 0u,
    public var RttDeviation: UInt = 0u,
    public var Anonymous: MIB_IPPATH_ROW_0 = MIB_IPPATH_ROW_0(),
    public var IsReachable: Boolean = false,
    public var LinkTransmitSpeed: ULong = 0uL,
    public var LinkReceiveSpeed: ULong = 0uL,
)

public data class MIB_IPPATH_ROW_0(public var LastReachable: UInt = 0u, public var LastUnreachable: UInt = 0u)

public data class MIB_IPPATH_TABLE(public var NumEntries: UInt = 0u, public var Table: List<MIB_IPPATH_ROW> = List(1) { MIB_IPPATH_ROW() })

public class MIB_IPSTATS_LH(
    public var Anonymous: MIB_IPSTATS_LH_0 = MIB_IPSTATS_LH_0(),
    public var dwDefaultTTL: UInt = 0u,
    public var dwInReceives: UInt = 0u,
    public var dwInHdrErrors: UInt = 0u,
    public var dwInAddrErrors: UInt = 0u,
    public var dwForwDatagrams: UInt = 0u,
    public var dwInUnknownProtos: UInt = 0u,
    public var dwInDiscards: UInt = 0u,
    public var dwInDelivers: UInt = 0u,
    public var dwOutRequests: UInt = 0u,
    public var dwRoutingDiscards: UInt = 0u,
    public var dwOutDiscards: UInt = 0u,
    public var dwOutNoRoutes: UInt = 0u,
    public var dwReasmTimeout: UInt = 0u,
    public var dwReasmReqds: UInt = 0u,
    public var dwReasmOks: UInt = 0u,
    public var dwReasmFails: UInt = 0u,
    public var dwFragOks: UInt = 0u,
    public var dwFragFails: UInt = 0u,
    public var dwFragCreates: UInt = 0u,
    public var dwNumIf: UInt = 0u,
    public var dwNumAddr: UInt = 0u,
    public var dwNumRoutes: UInt = 0u,
)

public data class MIB_IPSTATS_LH_0(public var dwForwarding: UInt = 0u, public var Forwarding: MIB_IPSTATS_FORWARDING = 0)

public class MIB_IPSTATS_W2K(
    public var dwForwarding: UInt = 0u,
    public var dwDefaultTTL: UInt = 0u,
    public var dwInReceives: UInt = 0u,
    public var dwInHdrErrors: UInt = 0u,
    public var dwInAddrErrors: UInt = 0u,
    public var dwForwDatagrams: UInt = 0u,
    public var dwInUnknownProtos: UInt = 0u,
    public var dwInDiscards: UInt = 0u,
    public var dwInDelivers: UInt = 0u,
    public var dwOutRequests: UInt = 0u,
    public var dwRoutingDiscards: UInt = 0u,
    public var dwOutDiscards: UInt = 0u,
    public var dwOutNoRoutes: UInt = 0u,
    public var dwReasmTimeout: UInt = 0u,
    public var dwReasmReqds: UInt = 0u,
    public var dwReasmOks: UInt = 0u,
    public var dwReasmFails: UInt = 0u,
    public var dwFragOks: UInt = 0u,
    public var dwFragFails: UInt = 0u,
    public var dwFragCreates: UInt = 0u,
    public var dwNumIf: UInt = 0u,
    public var dwNumAddr: UInt = 0u,
    public var dwNumRoutes: UInt = 0u,
)

public data class MIB_IP_NETWORK_CONNECTION_BANDWIDTH_ESTIMATES(public var InboundBandwidthInformation: Networking.WinSock.NL_BANDWIDTH_INFORMATION = Networking.WinSock.NL_BANDWIDTH_INFORMATION(), public var OutboundBandwidthInformation: Networking.WinSock.NL_BANDWIDTH_INFORMATION = Networking.WinSock.NL_BANDWIDTH_INFORMATION())

public data class MIB_MCAST_LIMIT_ROW(public var dwTtl: UInt = 0u, public var dwRateLimit: UInt = 0u)

public data class MIB_MFE_STATS_TABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_IPMCAST_MFE_STATS> = List(1) { MIB_IPMCAST_MFE_STATS() })

public data class MIB_MFE_STATS_TABLE_EX_XP(public var dwNumEntries: UInt = 0u, public var table: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_MFE_STATS_TABLE_EX_XP) return false
        if (this.dwNumEntries != other.dwNumEntries) return false
        if (!this.table.contentEquals(other.table)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNumEntries.hashCode()
        result = 31 * result + this.table.contentHashCode()
        return result
    }
}

public data class MIB_MFE_TABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_IPMCAST_MFE> = List(1) { MIB_IPMCAST_MFE() })

public data class MIB_MULTICASTIPADDRESS_ROW(
    public var Address: Networking.WinSock.SOCKADDR_INET = Networking.WinSock.SOCKADDR_INET(),
    public var InterfaceIndex: UInt = 0u,
    public var InterfaceLuid: Ndis.NET_LUID_LH = Ndis.NET_LUID_LH(),
    public var ScopeId: Networking.WinSock.SCOPE_ID = Networking.WinSock.SCOPE_ID(),
)

public data class MIB_MULTICASTIPADDRESS_TABLE(public var NumEntries: UInt = 0u, public var Table: List<MIB_MULTICASTIPADDRESS_ROW> = List(1) { MIB_MULTICASTIPADDRESS_ROW() })

public data class MIB_OPAQUE_INFO(public var dwId: UInt = 0u, public var Anonymous: MIB_OPAQUE_INFO_0 = MIB_OPAQUE_INFO_0())

public data class MIB_OPAQUE_INFO_0(public var ullAlign: ULong = 0uL, public var rgbyData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_OPAQUE_INFO_0) return false
        if (this.ullAlign != other.ullAlign) return false
        if (!this.rgbyData.contentEquals(other.rgbyData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ullAlign.hashCode()
        result = 31 * result + this.rgbyData.contentHashCode()
        return result
    }
}

public data class MIB_OPAQUE_QUERY(public var dwVarId: UInt = 0u, public var rgdwVarIndex: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_OPAQUE_QUERY) return false
        if (this.dwVarId != other.dwVarId) return false
        if (!this.rgdwVarIndex.contentEquals(other.rgdwVarIndex)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVarId.hashCode()
        result = 31 * result + this.rgdwVarIndex.contentHashCode()
        return result
    }
}

public data class MIB_PROXYARP(
    public var dwAddress: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwIfIndex: UInt = 0u,
)

public data class MIB_ROUTESTATE(public var bRoutesSetToStack: BOOL = 0)

public data class MIB_TCP6ROW(
    public var State: MIB_TCP_STATE = 0,
    public var LocalAddr: Networking.WinSock.IN6_ADDR = Networking.WinSock.IN6_ADDR(),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var RemoteAddr: Networking.WinSock.IN6_ADDR = Networking.WinSock.IN6_ADDR(),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
)

public data class MIB_TCP6ROW2(
    public var LocalAddr: Networking.WinSock.IN6_ADDR = Networking.WinSock.IN6_ADDR(),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var RemoteAddr: Networking.WinSock.IN6_ADDR = Networking.WinSock.IN6_ADDR(),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var State: MIB_TCP_STATE = 0,
    public var dwOwningPid: UInt = 0u,
    public var dwOffloadState: TCP_CONNECTION_OFFLOAD_STATE = 0,
)

public data class MIB_TCP6ROW_OWNER_MODULE(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var ucRemoteAddr: UByteArray = UByteArray(16),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var OwningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_TCP6ROW_OWNER_MODULE) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (!this.ucRemoteAddr.contentEquals(other.ucRemoteAddr)) return false
        if (this.dwRemoteScopeId != other.dwRemoteScopeId) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        if (this.dwState != other.dwState) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (!this.OwningModuleInfo.contentEquals(other.OwningModuleInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.ucRemoteAddr.contentHashCode()
        result = 31 * result + this.dwRemoteScopeId.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.OwningModuleInfo.contentHashCode()
        return result
    }
}

public data class MIB_TCP6ROW_OWNER_PID(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var ucRemoteAddr: UByteArray = UByteArray(16),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_TCP6ROW_OWNER_PID) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (!this.ucRemoteAddr.contentEquals(other.ucRemoteAddr)) return false
        if (this.dwRemoteScopeId != other.dwRemoteScopeId) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        if (this.dwState != other.dwState) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.ucRemoteAddr.contentHashCode()
        result = 31 * result + this.dwRemoteScopeId.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        return result
    }
}

public data class MIB_TCP6TABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_TCP6ROW> = List(1) { MIB_TCP6ROW() })

public data class MIB_TCP6TABLE2(public var dwNumEntries: UInt = 0u, public var table: List<MIB_TCP6ROW2> = List(1) { MIB_TCP6ROW2() })

public data class MIB_TCP6TABLE_OWNER_MODULE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_TCP6ROW_OWNER_MODULE> = List(1) { MIB_TCP6ROW_OWNER_MODULE() })

public data class MIB_TCP6TABLE_OWNER_PID(public var dwNumEntries: UInt = 0u, public var table: List<MIB_TCP6ROW_OWNER_PID> = List(1) { MIB_TCP6ROW_OWNER_PID() })

public data class MIB_TCPROW2(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var dwOffloadState: TCP_CONNECTION_OFFLOAD_STATE = 0,
)

public data class MIB_TCPROW_LH(
    public var Anonymous: MIB_TCPROW_LH_0 = MIB_TCPROW_LH_0(),
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
)

public data class MIB_TCPROW_LH_0(public var dwState: UInt = 0u, public var State: MIB_TCP_STATE = 0)

public data class MIB_TCPROW_OWNER_MODULE(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var OwningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_TCPROW_OWNER_MODULE) return false
        if (this.dwState != other.dwState) return false
        if (this.dwLocalAddr != other.dwLocalAddr) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwRemoteAddr != other.dwRemoteAddr) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (!this.OwningModuleInfo.contentEquals(other.OwningModuleInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwState.hashCode()
        result = 31 * result + this.dwLocalAddr.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwRemoteAddr.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.OwningModuleInfo.contentHashCode()
        return result
    }
}

public data class MIB_TCPROW_OWNER_PID(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
)

public data class MIB_TCPROW_W2K(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
)

public data class MIB_TCPSTATS2(
    public var RtoAlgorithm: TCP_RTO_ALGORITHM = 0,
    public var dwRtoMin: UInt = 0u,
    public var dwRtoMax: UInt = 0u,
    public var dwMaxConn: UInt = 0u,
    public var dwActiveOpens: UInt = 0u,
    public var dwPassiveOpens: UInt = 0u,
    public var dwAttemptFails: UInt = 0u,
    public var dwEstabResets: UInt = 0u,
    public var dwCurrEstab: UInt = 0u,
    public var dw64InSegs: ULong = 0uL,
    public var dw64OutSegs: ULong = 0uL,
    public var dwRetransSegs: UInt = 0u,
    public var dwInErrs: UInt = 0u,
    public var dwOutRsts: UInt = 0u,
    public var dwNumConns: UInt = 0u,
)

public data class MIB_TCPSTATS_LH(
    public var Anonymous: MIB_TCPSTATS_LH_0 = MIB_TCPSTATS_LH_0(),
    public var dwRtoMin: UInt = 0u,
    public var dwRtoMax: UInt = 0u,
    public var dwMaxConn: UInt = 0u,
    public var dwActiveOpens: UInt = 0u,
    public var dwPassiveOpens: UInt = 0u,
    public var dwAttemptFails: UInt = 0u,
    public var dwEstabResets: UInt = 0u,
    public var dwCurrEstab: UInt = 0u,
    public var dwInSegs: UInt = 0u,
    public var dwOutSegs: UInt = 0u,
    public var dwRetransSegs: UInt = 0u,
    public var dwInErrs: UInt = 0u,
    public var dwOutRsts: UInt = 0u,
    public var dwNumConns: UInt = 0u,
)

public data class MIB_TCPSTATS_LH_0(public var dwRtoAlgorithm: UInt = 0u, public var RtoAlgorithm: TCP_RTO_ALGORITHM = 0)

public data class MIB_TCPSTATS_W2K(
    public var dwRtoAlgorithm: UInt = 0u,
    public var dwRtoMin: UInt = 0u,
    public var dwRtoMax: UInt = 0u,
    public var dwMaxConn: UInt = 0u,
    public var dwActiveOpens: UInt = 0u,
    public var dwPassiveOpens: UInt = 0u,
    public var dwAttemptFails: UInt = 0u,
    public var dwEstabResets: UInt = 0u,
    public var dwCurrEstab: UInt = 0u,
    public var dwInSegs: UInt = 0u,
    public var dwOutSegs: UInt = 0u,
    public var dwRetransSegs: UInt = 0u,
    public var dwInErrs: UInt = 0u,
    public var dwOutRsts: UInt = 0u,
    public var dwNumConns: UInt = 0u,
)

public data class MIB_TCPTABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_TCPROW_LH> = List(1) { MIB_TCPROW_LH() })

public data class MIB_TCPTABLE2(public var dwNumEntries: UInt = 0u, public var table: List<MIB_TCPROW2> = List(1) { MIB_TCPROW2() })

public data class MIB_TCPTABLE_OWNER_MODULE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_TCPROW_OWNER_MODULE> = List(1) { MIB_TCPROW_OWNER_MODULE() })

public data class MIB_TCPTABLE_OWNER_PID(public var dwNumEntries: UInt = 0u, public var table: List<MIB_TCPROW_OWNER_PID> = List(1) { MIB_TCPROW_OWNER_PID() })

public data class MIB_UDP6ROW(
    public var dwLocalAddr: Networking.WinSock.IN6_ADDR = Networking.WinSock.IN6_ADDR(),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
)

public data class MIB_UDP6ROW2(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var Anonymous: MIB_UDP6ROW2_0 = MIB_UDP6ROW2_0(),
    public var OwningModuleInfo: ULongArray = ULongArray(16),
    public var ucRemoteAddr: UByteArray = UByteArray(16),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_UDP6ROW2) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.OwningModuleInfo.contentEquals(other.OwningModuleInfo)) return false
        if (!this.ucRemoteAddr.contentEquals(other.ucRemoteAddr)) return false
        if (this.dwRemoteScopeId != other.dwRemoteScopeId) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.OwningModuleInfo.contentHashCode()
        result = 31 * result + this.ucRemoteAddr.contentHashCode()
        result = 31 * result + this.dwRemoteScopeId.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        return result
    }
}

public data class MIB_UDP6ROW2_0(public var Anonymous: MIB_UDP6ROW2_0_0 = MIB_UDP6ROW2_0_0(), public var dwFlags: Int = 0)

public data class MIB_UDP6ROW2_0_0(public var _bitfield: Int = 0)

public data class MIB_UDP6ROW_OWNER_MODULE(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var Anonymous: MIB_UDP6ROW_OWNER_MODULE_0 = MIB_UDP6ROW_OWNER_MODULE_0(),
    public var OwningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_UDP6ROW_OWNER_MODULE) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.OwningModuleInfo.contentEquals(other.OwningModuleInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.OwningModuleInfo.contentHashCode()
        return result
    }
}

public data class MIB_UDP6ROW_OWNER_MODULE_0(public var Anonymous: MIB_UDP6ROW_OWNER_MODULE_0_0 = MIB_UDP6ROW_OWNER_MODULE_0_0(), public var dwFlags: Int = 0)

public data class MIB_UDP6ROW_OWNER_MODULE_0_0(public var _bitfield: Int = 0)

public data class MIB_UDP6ROW_OWNER_PID(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_UDP6ROW_OWNER_PID) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        return result
    }
}

public data class MIB_UDP6TABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_UDP6ROW> = List(1) { MIB_UDP6ROW() })

public data class MIB_UDP6TABLE2(public var dwNumEntries: UInt = 0u, public var table: List<MIB_UDP6ROW2> = List(1) { MIB_UDP6ROW2() })

public data class MIB_UDP6TABLE_OWNER_MODULE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_UDP6ROW_OWNER_MODULE> = List(1) { MIB_UDP6ROW_OWNER_MODULE() })

public data class MIB_UDP6TABLE_OWNER_PID(public var dwNumEntries: UInt = 0u, public var table: List<MIB_UDP6ROW_OWNER_PID> = List(1) { MIB_UDP6ROW_OWNER_PID() })

public data class MIB_UDPROW(public var dwLocalAddr: UInt = 0u, public var dwLocalPort: UInt = 0u)

public data class MIB_UDPROW2(
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var Anonymous: MIB_UDPROW2_0 = MIB_UDPROW2_0(),
    public var OwningModuleInfo: ULongArray = ULongArray(16),
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_UDPROW2) return false
        if (this.dwLocalAddr != other.dwLocalAddr) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.OwningModuleInfo.contentEquals(other.OwningModuleInfo)) return false
        if (this.dwRemoteAddr != other.dwRemoteAddr) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLocalAddr.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.OwningModuleInfo.contentHashCode()
        result = 31 * result + this.dwRemoteAddr.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        return result
    }
}

public data class MIB_UDPROW2_0(public var Anonymous: MIB_UDPROW2_0_0 = MIB_UDPROW2_0_0(), public var dwFlags: Int = 0)

public data class MIB_UDPROW2_0_0(public var _bitfield: Int = 0)

public data class MIB_UDPROW_OWNER_MODULE(
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var Anonymous: MIB_UDPROW_OWNER_MODULE_0 = MIB_UDPROW_OWNER_MODULE_0(),
    public var OwningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIB_UDPROW_OWNER_MODULE) return false
        if (this.dwLocalAddr != other.dwLocalAddr) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.OwningModuleInfo.contentEquals(other.OwningModuleInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLocalAddr.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.OwningModuleInfo.contentHashCode()
        return result
    }
}

public data class MIB_UDPROW_OWNER_MODULE_0(public var Anonymous: MIB_UDPROW_OWNER_MODULE_0_0 = MIB_UDPROW_OWNER_MODULE_0_0(), public var dwFlags: Int = 0)

public data class MIB_UDPROW_OWNER_MODULE_0_0(public var _bitfield: Int = 0)

public data class MIB_UDPROW_OWNER_PID(
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
)

public data class MIB_UDPSTATS(
    public var dwInDatagrams: UInt = 0u,
    public var dwNoPorts: UInt = 0u,
    public var dwInErrors: UInt = 0u,
    public var dwOutDatagrams: UInt = 0u,
    public var dwNumAddrs: UInt = 0u,
)

public data class MIB_UDPSTATS2(
    public var dw64InDatagrams: ULong = 0uL,
    public var dwNoPorts: UInt = 0u,
    public var dwInErrors: UInt = 0u,
    public var dw64OutDatagrams: ULong = 0uL,
    public var dwNumAddrs: UInt = 0u,
)

public data class MIB_UDPTABLE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_UDPROW> = List(1) { MIB_UDPROW() })

public data class MIB_UDPTABLE2(public var dwNumEntries: UInt = 0u, public var table: List<MIB_UDPROW2> = List(1) { MIB_UDPROW2() })

public data class MIB_UDPTABLE_OWNER_MODULE(public var dwNumEntries: UInt = 0u, public var table: List<MIB_UDPROW_OWNER_MODULE> = List(1) { MIB_UDPROW_OWNER_MODULE() })

public data class MIB_UDPTABLE_OWNER_PID(public var dwNumEntries: UInt = 0u, public var table: List<MIB_UDPROW_OWNER_PID> = List(1) { MIB_UDPROW_OWNER_PID() })

public data class MIB_UNICASTIPADDRESS_ROW(
    public var Address: Networking.WinSock.SOCKADDR_INET = Networking.WinSock.SOCKADDR_INET(),
    public var InterfaceLuid: Ndis.NET_LUID_LH = Ndis.NET_LUID_LH(),
    public var InterfaceIndex: UInt = 0u,
    public var PrefixOrigin: Networking.WinSock.NL_PREFIX_ORIGIN = Networking.WinSock.NL_PREFIX_ORIGIN(),
    public var SuffixOrigin: Networking.WinSock.NL_SUFFIX_ORIGIN = Networking.WinSock.NL_SUFFIX_ORIGIN(),
    public var ValidLifetime: UInt = 0u,
    public var PreferredLifetime: UInt = 0u,
    public var OnLinkPrefixLength: UByte = 0u,
    public var SkipAsSource: Boolean = false,
    public var DadState: Networking.WinSock.NL_DAD_STATE = Networking.WinSock.NL_DAD_STATE(),
    public var ScopeId: Networking.WinSock.SCOPE_ID = Networking.WinSock.SCOPE_ID(),
    public var CreationTimeStamp: Long = 0L,
)

public data class MIB_UNICASTIPADDRESS_TABLE(public var NumEntries: UInt = 0u, public var Table: List<MIB_UNICASTIPADDRESS_ROW> = List(1) { MIB_UNICASTIPADDRESS_ROW() })

public data class NET_ADDRESS_INFO(public var Format: NET_ADDRESS_FORMAT = 0, public var Anonymous: NET_ADDRESS_INFO_0 = NET_ADDRESS_INFO_0())

public data class NET_ADDRESS_INFO_0(
    public var NamedAddress: NET_ADDRESS_INFO_0_0 = NET_ADDRESS_INFO_0_0(),
    public var Ipv4Address: Networking.WinSock.SOCKADDR_IN = Networking.WinSock.SOCKADDR_IN(),
    public var Ipv6Address: Networking.WinSock.SOCKADDR_IN6 = Networking.WinSock.SOCKADDR_IN6(),
    public var IpAddress: Networking.WinSock.SOCKADDR = Networking.WinSock.SOCKADDR(),
)

public data class NET_ADDRESS_INFO_0_0(public var Address: UShortArray = UShortArray(256), public var Port: UShortArray = UShortArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NET_ADDRESS_INFO_0_0) return false
        if (!this.Address.contentEquals(other.Address)) return false
        if (!this.Port.contentEquals(other.Port)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Address.contentHashCode()
        result = 31 * result + this.Port.contentHashCode()
        return result
    }
}

public data class PFLOGFRAME(
    public var Timestamp: Long = 0L,
    public var pfeTypeOfFrame: PFFRAMETYPE = 0,
    public var dwTotalSizeUsed: UInt = 0u,
    public var dwFilterRule: UInt = 0u,
    public var wSizeOfAdditionalData: UShort = 0u,
    public var wSizeOfIpHeader: UShort = 0u,
    public var dwInterfaceName: UInt = 0u,
    public var dwIPIndex: UInt = 0u,
    public var bPacketData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PFLOGFRAME) return false
        if (this.Timestamp != other.Timestamp) return false
        if (this.pfeTypeOfFrame != other.pfeTypeOfFrame) return false
        if (this.dwTotalSizeUsed != other.dwTotalSizeUsed) return false
        if (this.dwFilterRule != other.dwFilterRule) return false
        if (this.wSizeOfAdditionalData != other.wSizeOfAdditionalData) return false
        if (this.wSizeOfIpHeader != other.wSizeOfIpHeader) return false
        if (this.dwInterfaceName != other.dwInterfaceName) return false
        if (this.dwIPIndex != other.dwIPIndex) return false
        if (!this.bPacketData.contentEquals(other.bPacketData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Timestamp.hashCode()
        result = 31 * result + this.pfeTypeOfFrame.hashCode()
        result = 31 * result + this.dwTotalSizeUsed.hashCode()
        result = 31 * result + this.dwFilterRule.hashCode()
        result = 31 * result + this.wSizeOfAdditionalData.hashCode()
        result = 31 * result + this.wSizeOfIpHeader.hashCode()
        result = 31 * result + this.dwInterfaceName.hashCode()
        result = 31 * result + this.dwIPIndex.hashCode()
        result = 31 * result + this.bPacketData.contentHashCode()
        return result
    }
}

public data class PF_FILTER_DESCRIPTOR(
    public var dwFilterFlags: UInt = 0u,
    public var dwRule: UInt = 0u,
    public var pfatType: PFADDRESSTYPE = 0,
    public var SrcAddr: Long = 0L,
    public var SrcMask: Long = 0L,
    public var DstAddr: Long = 0L,
    public var DstMask: Long = 0L,
    public var dwProtocol: UInt = 0u,
    public var fLateBound: UInt = 0u,
    public var wSrcPort: UShort = 0u,
    public var wDstPort: UShort = 0u,
    public var wSrcPortHighRange: UShort = 0u,
    public var wDstPortHighRange: UShort = 0u,
)

public data class PF_FILTER_STATS(public var dwNumPacketsFiltered: UInt = 0u, public var info: PF_FILTER_DESCRIPTOR = PF_FILTER_DESCRIPTOR())

public data class PF_INTERFACE_STATS(
    public var pvDriverContext: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var dwInDrops: UInt = 0u,
    public var dwOutDrops: UInt = 0u,
    public var eaInAction: PFFORWARD_ACTION = 0,
    public var eaOutAction: PFFORWARD_ACTION = 0,
    public var dwNumInFilters: UInt = 0u,
    public var dwNumOutFilters: UInt = 0u,
    public var dwFrag: UInt = 0u,
    public var dwSpoof: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var liSYN: Long = 0L,
    public var liTotalLogged: Long = 0L,
    public var dwLostLogEntries: UInt = 0u,
    public var FilterInfo: List<PF_FILTER_STATS> = List(1) { PF_FILTER_STATS() },
)

public data class PF_LATEBIND_INFO(
    public var SrcAddr: Long = 0L,
    public var DstAddr: Long = 0L,
    public var Mask: Long = 0L,
)

public data class TCPIP_OWNER_MODULE_BASIC_INFO(public var pModuleName: PWSTR = 0L, public var pModulePath: PWSTR = 0L)

public data class TCP_ESTATS_BANDWIDTH_ROD_v0(
    public var OutboundBandwidth: ULong = 0uL,
    public var InboundBandwidth: ULong = 0uL,
    public var OutboundInstability: ULong = 0uL,
    public var InboundInstability: ULong = 0uL,
    public var OutboundBandwidthPeaked: Boolean = false,
    public var InboundBandwidthPeaked: Boolean = false,
)

public data class TCP_ESTATS_BANDWIDTH_RW_v0(public var EnableCollectionOutbound: TCP_BOOLEAN_OPTIONAL = 0, public var EnableCollectionInbound: TCP_BOOLEAN_OPTIONAL = 0)

public data class TCP_ESTATS_DATA_ROD_v0(
    public var DataBytesOut: ULong = 0uL,
    public var DataSegsOut: ULong = 0uL,
    public var DataBytesIn: ULong = 0uL,
    public var DataSegsIn: ULong = 0uL,
    public var SegsOut: ULong = 0uL,
    public var SegsIn: ULong = 0uL,
    public var SoftErrors: UInt = 0u,
    public var SoftErrorReason: UInt = 0u,
    public var SndUna: UInt = 0u,
    public var SndNxt: UInt = 0u,
    public var SndMax: UInt = 0u,
    public var ThruBytesAcked: ULong = 0uL,
    public var RcvNxt: UInt = 0u,
    public var ThruBytesReceived: ULong = 0uL,
)

public data class TCP_ESTATS_DATA_RW_v0(public var EnableCollection: Boolean = false)

public data class TCP_ESTATS_FINE_RTT_ROD_v0(
    public var RttVar: UInt = 0u,
    public var MaxRtt: UInt = 0u,
    public var MinRtt: UInt = 0u,
    public var SumRtt: UInt = 0u,
)

public data class TCP_ESTATS_FINE_RTT_RW_v0(public var EnableCollection: Boolean = false)

public data class TCP_ESTATS_OBS_REC_ROD_v0(
    public var CurRwinRcvd: UInt = 0u,
    public var MaxRwinRcvd: UInt = 0u,
    public var MinRwinRcvd: UInt = 0u,
    public var WinScaleRcvd: UByte = 0u,
)

public data class TCP_ESTATS_OBS_REC_RW_v0(public var EnableCollection: Boolean = false)

public class TCP_ESTATS_PATH_ROD_v0(
    public var FastRetran: UInt = 0u,
    public var Timeouts: UInt = 0u,
    public var SubsequentTimeouts: UInt = 0u,
    public var CurTimeoutCount: UInt = 0u,
    public var AbruptTimeouts: UInt = 0u,
    public var PktsRetrans: UInt = 0u,
    public var BytesRetrans: UInt = 0u,
    public var DupAcksIn: UInt = 0u,
    public var SacksRcvd: UInt = 0u,
    public var SackBlocksRcvd: UInt = 0u,
    public var CongSignals: UInt = 0u,
    public var PreCongSumCwnd: UInt = 0u,
    public var PreCongSumRtt: UInt = 0u,
    public var PostCongSumRtt: UInt = 0u,
    public var PostCongCountRtt: UInt = 0u,
    public var EcnSignals: UInt = 0u,
    public var EceRcvd: UInt = 0u,
    public var SendStall: UInt = 0u,
    public var QuenchRcvd: UInt = 0u,
    public var RetranThresh: UInt = 0u,
    public var SndDupAckEpisodes: UInt = 0u,
    public var SumBytesReordered: UInt = 0u,
    public var NonRecovDa: UInt = 0u,
    public var NonRecovDaEpisodes: UInt = 0u,
    public var AckAfterFr: UInt = 0u,
    public var DsackDups: UInt = 0u,
    public var SampleRtt: UInt = 0u,
    public var SmoothedRtt: UInt = 0u,
    public var RttVar: UInt = 0u,
    public var MaxRtt: UInt = 0u,
    public var MinRtt: UInt = 0u,
    public var SumRtt: UInt = 0u,
    public var CountRtt: UInt = 0u,
    public var CurRto: UInt = 0u,
    public var MaxRto: UInt = 0u,
    public var MinRto: UInt = 0u,
    public var CurMss: UInt = 0u,
    public var MaxMss: UInt = 0u,
    public var MinMss: UInt = 0u,
    public var SpuriousRtoDetections: UInt = 0u,
)

public data class TCP_ESTATS_PATH_RW_v0(public var EnableCollection: Boolean = false)

public data class TCP_ESTATS_REC_ROD_v0(
    public var CurRwinSent: UInt = 0u,
    public var MaxRwinSent: UInt = 0u,
    public var MinRwinSent: UInt = 0u,
    public var LimRwin: UInt = 0u,
    public var DupAckEpisodes: UInt = 0u,
    public var DupAcksOut: UInt = 0u,
    public var CeRcvd: UInt = 0u,
    public var EcnSent: UInt = 0u,
    public var EcnNoncesRcvd: UInt = 0u,
    public var CurReasmQueue: UInt = 0u,
    public var MaxReasmQueue: UInt = 0u,
    public var CurAppRQueue: ULong = 0uL,
    public var MaxAppRQueue: ULong = 0uL,
    public var WinScaleSent: UByte = 0u,
)

public data class TCP_ESTATS_REC_RW_v0(public var EnableCollection: Boolean = false)

public data class TCP_ESTATS_SEND_BUFF_ROD_v0(
    public var CurRetxQueue: ULong = 0uL,
    public var MaxRetxQueue: ULong = 0uL,
    public var CurAppWQueue: ULong = 0uL,
    public var MaxAppWQueue: ULong = 0uL,
)

public data class TCP_ESTATS_SEND_BUFF_RW_v0(public var EnableCollection: Boolean = false)

public class TCP_ESTATS_SND_CONG_ROD_v0(
    public var SndLimTransRwin: UInt = 0u,
    public var SndLimTimeRwin: UInt = 0u,
    public var SndLimBytesRwin: ULong = 0uL,
    public var SndLimTransCwnd: UInt = 0u,
    public var SndLimTimeCwnd: UInt = 0u,
    public var SndLimBytesCwnd: ULong = 0uL,
    public var SndLimTransSnd: UInt = 0u,
    public var SndLimTimeSnd: UInt = 0u,
    public var SndLimBytesSnd: ULong = 0uL,
    public var SlowStart: UInt = 0u,
    public var CongAvoid: UInt = 0u,
    public var OtherReductions: UInt = 0u,
    public var CurCwnd: UInt = 0u,
    public var MaxSsCwnd: UInt = 0u,
    public var MaxCaCwnd: UInt = 0u,
    public var CurSsthresh: UInt = 0u,
    public var MaxSsthresh: UInt = 0u,
    public var MinSsthresh: UInt = 0u,
)

public data class TCP_ESTATS_SND_CONG_ROS_v0(public var LimCwnd: UInt = 0u)

public data class TCP_ESTATS_SND_CONG_RW_v0(public var EnableCollection: Boolean = false)

public data class TCP_ESTATS_SYN_OPTS_ROS_v0(
    public var ActiveOpen: Boolean = false,
    public var MssRcvd: UInt = 0u,
    public var MssSent: UInt = 0u,
)

public data class TCP_RESERVE_PORT_RANGE(public var UpperRange: UShort = 0u, public var LowerRange: UShort = 0u)
