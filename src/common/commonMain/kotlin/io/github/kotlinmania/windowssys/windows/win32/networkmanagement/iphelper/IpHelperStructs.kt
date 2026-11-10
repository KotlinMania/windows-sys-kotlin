@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.AddressFamily
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlBandwidthInformation
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlDadState
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlInterfaceOffloadRod
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlLinkLocalAddressBehavior
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlNeighborState
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlPrefixOrigin
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlRouteOrigin
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlRouteProtocol
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlRouterDiscoveryBehavior
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlSuffixOrigin
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.ScopeId
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Sockaddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrIn
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrIn6
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrInet
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddress
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.IfOperStatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NdisMedium
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NdisPhysicalMedium
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfAccessType
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfAdminStatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfCompartmentId
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfConnectionType
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfDirectionType
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfMediaConnectState
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetLuidLh
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.TunnelType

public data class ArpSendReply(public var destAddress: UInt = 0u, public var srcAddress: UInt = 0u)

public data class DnsDohServerSettings(public var template: Pwstr = null, public var flags: ULong = 0uL)

public data class DnsInterfaceSettings(
    public var version: UInt = 0u,
    public var flags: ULong = 0uL,
    public var domain: Pwstr = null,
    public var nameServer: Pwstr = null,
    public var searchList: Pwstr = null,
    public var registrationEnabled: UInt = 0u,
    public var registerAdapterName: UInt = 0u,
    public var enableLLMNR: UInt = 0u,
    public var queryAdapterName: UInt = 0u,
    public var profileNameServer: Pwstr = null,
)

public data class DnsInterfaceSettings3(
    public var version: UInt = 0u,
    public var flags: ULong = 0uL,
    public var domain: Pwstr = null,
    public var nameServer: Pwstr = null,
    public var searchList: Pwstr = null,
    public var registrationEnabled: UInt = 0u,
    public var registerAdapterName: UInt = 0u,
    public var enableLLMNR: UInt = 0u,
    public var queryAdapterName: UInt = 0u,
    public var profileNameServer: Pwstr = null,
    public var disableUnconstrainedQueries: UInt = 0u,
    public var supplementalSearchList: Pwstr = null,
    public var cServerProperties: UInt = 0u,
    public var serverProperties: DnsServerProperty? = null,
    public var cProfileServerProperties: UInt = 0u,
    public var profileServerProperties: DnsServerProperty? = null,
)

public class DnsInterfaceSettings4(
    public var version: UInt = 0u,
    public var flags: ULong = 0uL,
    public var domain: Pwstr = null,
    public var nameServer: Pwstr = null,
    public var searchList: Pwstr = null,
    public var registrationEnabled: UInt = 0u,
    public var registerAdapterName: UInt = 0u,
    public var enableLLMNR: UInt = 0u,
    public var queryAdapterName: UInt = 0u,
    public var profileNameServer: Pwstr = null,
    public var disableUnconstrainedQueries: UInt = 0u,
    public var supplementalSearchList: Pwstr = null,
    public var cServerProperties: UInt = 0u,
    public var serverProperties: DnsServerProperty? = null,
    public var cProfileServerProperties: UInt = 0u,
    public var profileServerProperties: DnsServerProperty? = null,
    public var encryptedDnsAdapterFlags: UInt = 0u,
)

public data class DnsInterfaceSettingsEx(
    public var settingsV1: DnsInterfaceSettings = DnsInterfaceSettings(),
    public var disableUnconstrainedQueries: UInt = 0u,
    public var supplementalSearchList: Pwstr = null,
)

public data class DnsServerProperty(
    public var version: UInt = 0u,
    public var serverIndex: UInt = 0u,
    public var type: DnsServerPropertyType = 0,
    public var property: DnsServerPropertyTypes = DnsServerPropertyTypes(),
)

public data class DnsServerPropertyTypes(public var dohSettings: DnsDohServerSettings? = null)

public data class DnsSettings(
    public var version: UInt = 0u,
    public var flags: ULong = 0uL,
    public var hostname: Pwstr = null,
    public var domain: Pwstr = null,
    public var searchList: Pwstr = null,
)

public data class DnsSettings2(
    public var version: UInt = 0u,
    public var flags: ULong = 0uL,
    public var hostname: Pwstr = null,
    public var domain: Pwstr = null,
    public var searchList: Pwstr = null,
    public var settingFlags: ULong = 0uL,
)

public data class FixedInfoW2ksp1(
    public var hostName: ByteArray = ByteArray(132),
    public var domainName: ByteArray = ByteArray(132),
    public var currentDnsServer: IpAddrString? = null,
    public var dnsServerList: IpAddrString = IpAddrString(),
    public var nodeType: UInt = 0u,
    public var scopeId: ByteArray = ByteArray(260),
    public var enableRouting: UInt = 0u,
    public var enableProxy: UInt = 0u,
    public var enableDns: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FixedInfoW2ksp1) return false
        if (!this.hostName.contentEquals(other.hostName)) return false
        if (!this.domainName.contentEquals(other.domainName)) return false
        if (this.currentDnsServer != other.currentDnsServer) return false
        if (this.dnsServerList != other.dnsServerList) return false
        if (this.nodeType != other.nodeType) return false
        if (!this.scopeId.contentEquals(other.scopeId)) return false
        if (this.enableRouting != other.enableRouting) return false
        if (this.enableProxy != other.enableProxy) return false
        if (this.enableDns != other.enableDns) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hostName.contentHashCode()
        result = 31 * result + this.domainName.contentHashCode()
        result = 31 * result + this.currentDnsServer.hashCode()
        result = 31 * result + this.dnsServerList.hashCode()
        result = 31 * result + this.nodeType.hashCode()
        result = 31 * result + this.scopeId.contentHashCode()
        result = 31 * result + this.enableRouting.hashCode()
        result = 31 * result + this.enableProxy.hashCode()
        result = 31 * result + this.enableDns.hashCode()
        return result
    }
}

public data class Icmpv6EchoReplyLh(
    public var address: Ipv6AddressEx = Ipv6AddressEx(),
    public var status: UInt = 0u,
    public var roundTripTime: UInt = 0u,
)

public data class IcmpEchoReply(
    public var address: UInt = 0u,
    public var status: UInt = 0u,
    public var roundTripTime: UInt = 0u,
    public var dataSize: UShort = 0u,
    public var reserved: UShort = 0u,
    public var data: COpaquePointer? = null,
    public var options: IpOptionInformation = IpOptionInformation(),
)

public data class IcmpEchoReply32(
    public var address: UInt = 0u,
    public var status: UInt = 0u,
    public var roundTripTime: UInt = 0u,
    public var dataSize: UShort = 0u,
    public var reserved: UShort = 0u,
    public var data: COpaquePointer? = null,
    public var options: IpOptionInformation32 = IpOptionInformation32(),
)

public data class InterfaceHardwareCrosstimestamp(
    public var systemTimestamp1: ULong = 0uL,
    public var hardwareClockTimestamp: ULong = 0uL,
    public var systemTimestamp2: ULong = 0uL,
)

public data class InterfaceHardwareTimestampCapabilities(
    public var ptpV2OverUdpIPv4EventMessageReceive: Boolean = false,
    public var ptpV2OverUdpIPv4AllMessageReceive: Boolean = false,
    public var ptpV2OverUdpIPv4EventMessageTransmit: Boolean = false,
    public var ptpV2OverUdpIPv4AllMessageTransmit: Boolean = false,
    public var ptpV2OverUdpIPv6EventMessageReceive: Boolean = false,
    public var ptpV2OverUdpIPv6AllMessageReceive: Boolean = false,
    public var ptpV2OverUdpIPv6EventMessageTransmit: Boolean = false,
    public var ptpV2OverUdpIPv6AllMessageTransmit: Boolean = false,
    public var allReceive: Boolean = false,
    public var allTransmit: Boolean = false,
    public var taggedTransmit: Boolean = false,
)

public data class InterfaceSoftwareTimestampCapabilities(
    public var allReceive: Boolean = false,
    public var allTransmit: Boolean = false,
    public var taggedTransmit: Boolean = false,
)

public data class InterfaceTimestampCapabilities(
    public var hardwareClockFrequencyHz: ULong = 0uL,
    public var supportsCrossTimestamp: Boolean = false,
    public var hardwareCapabilities: InterfaceHardwareTimestampCapabilities = InterfaceHardwareTimestampCapabilities(),
    public var softwareCapabilities: InterfaceSoftwareTimestampCapabilities = InterfaceSoftwareTimestampCapabilities(),
)

public data class Ipv6AddressEx(
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: UShortArray = UShortArray(8),
    public var sin6ScopeId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6AddressEx) return false
        if (this.sin6Port != other.sin6Port) return false
        if (this.sin6Flowinfo != other.sin6Flowinfo) return false
        if (!this.sin6Addr.contentEquals(other.sin6Addr)) return false
        if (this.sin6ScopeId != other.sin6ScopeId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin6Port.hashCode()
        result = 31 * result + this.sin6Flowinfo.hashCode()
        result = 31 * result + this.sin6Addr.contentHashCode()
        result = 31 * result + this.sin6ScopeId.hashCode()
        return result
    }
}

public class IpAdapterAddressesLh(
    public var anonymous1: IpAdapterAddressesLh0 = IpAdapterAddressesLh0(),
    public var next: IpAdapterAddressesLh? = null,
    public var adapterName: Pstr = null,
    public var firstUnicastAddress: IpAdapterUnicastAddressLh? = null,
    public var firstAnycastAddress: IpAdapterAnycastAddressXp? = null,
    public var firstMulticastAddress: IpAdapterMulticastAddressXp? = null,
    public var firstDnsServerAddress: IpAdapterDnsServerAddressXp? = null,
    public var dnsSuffix: Pwstr = null,
    public var description: Pwstr = null,
    public var friendlyName: Pwstr = null,
    public var physicalAddress: UByteArray = UByteArray(8),
    public var physicalAddressLength: UInt = 0u,
    public var anonymous2: IpAdapterAddressesLh1 = IpAdapterAddressesLh1(),
    public var mtu: UInt = 0u,
    public var ifType: UInt = 0u,
    public var operStatus: IfOperStatus = 0,
    public var ipv6IfIndex: UInt = 0u,
    public var zoneIndices: UIntArray = UIntArray(16),
    public var firstPrefix: IpAdapterPrefixXp? = null,
    public var transmitLinkSpeed: ULong = 0uL,
    public var receiveLinkSpeed: ULong = 0uL,
    public var firstWinsServerAddress: IpAdapterWinsServerAddressLh? = null,
    public var firstGatewayAddress: IpAdapterGatewayAddressLh? = null,
    public var ipv4Metric: UInt = 0u,
    public var ipv6Metric: UInt = 0u,
    public var luid: NetLuidLh = NetLuidLh(),
    public var dhcpv4Server: SocketAddress = SocketAddress(),
    public var compartmentId: NetIfCompartmentId = 0u,
    public var networkGuid: Guid = Guid(),
    public var connectionType: NetIfConnectionType = 0,
    public var tunnelType: TunnelType = 0,
    public var dhcpv6Server: SocketAddress = SocketAddress(),
    public var dhcpv6ClientDuid: UByteArray = UByteArray(130),
    public var dhcpv6ClientDuidLength: UInt = 0u,
    public var dhcpv6Iaid: UInt = 0u,
    public var firstDnsSuffix: IpAdapterDnsSuffix? = null,
)

public data class IpAdapterAddressesLh0(public var alignment: ULong = 0uL, public var anonymous: IpAdapterAddressesLh00 = IpAdapterAddressesLh00())

public data class IpAdapterAddressesLh00(public var length: UInt = 0u, public var ifIndex: UInt = 0u)

public data class IpAdapterAddressesLh1(public var flags: UInt = 0u, public var anonymous: IpAdapterAddressesLh10 = IpAdapterAddressesLh10())

public data class IpAdapterAddressesLh10(public var bitfield: UInt = 0u)

public class IpAdapterAddressesXp(
    public var anonymous: IpAdapterAddressesXp0 = IpAdapterAddressesXp0(),
    public var next: IpAdapterAddressesXp? = null,
    public var adapterName: Pstr = null,
    public var firstUnicastAddress: IpAdapterUnicastAddressXp? = null,
    public var firstAnycastAddress: IpAdapterAnycastAddressXp? = null,
    public var firstMulticastAddress: IpAdapterMulticastAddressXp? = null,
    public var firstDnsServerAddress: IpAdapterDnsServerAddressXp? = null,
    public var dnsSuffix: Pwstr = null,
    public var description: Pwstr = null,
    public var friendlyName: Pwstr = null,
    public var physicalAddress: UByteArray = UByteArray(8),
    public var physicalAddressLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var mtu: UInt = 0u,
    public var ifType: UInt = 0u,
    public var operStatus: IfOperStatus = 0,
    public var ipv6IfIndex: UInt = 0u,
    public var zoneIndices: UIntArray = UIntArray(16),
    public var firstPrefix: IpAdapterPrefixXp? = null,
)

public data class IpAdapterAddressesXp0(public var alignment: ULong = 0uL, public var anonymous: IpAdapterAddressesXp00 = IpAdapterAddressesXp00())

public data class IpAdapterAddressesXp00(public var length: UInt = 0u, public var ifIndex: UInt = 0u)

public data class IpAdapterAnycastAddressXp(
    public var anonymous: IpAdapterAnycastAddressXp0 = IpAdapterAnycastAddressXp0(),
    public var next: IpAdapterAnycastAddressXp? = null,
    public var address: SocketAddress = SocketAddress(),
)

public data class IpAdapterAnycastAddressXp0(public var alignment: ULong = 0uL, public var anonymous: IpAdapterAnycastAddressXp00 = IpAdapterAnycastAddressXp00())

public data class IpAdapterAnycastAddressXp00(public var length: UInt = 0u, public var flags: UInt = 0u)

public data class IpAdapterDnsServerAddressXp(
    public var anonymous: IpAdapterDnsServerAddressXp0 = IpAdapterDnsServerAddressXp0(),
    public var next: IpAdapterDnsServerAddressXp? = null,
    public var address: SocketAddress = SocketAddress(),
)

public data class IpAdapterDnsServerAddressXp0(public var alignment: ULong = 0uL, public var anonymous: IpAdapterDnsServerAddressXp00 = IpAdapterDnsServerAddressXp00())

public data class IpAdapterDnsServerAddressXp00(public var length: UInt = 0u, public var reserved: UInt = 0u)

public data class IpAdapterDnsSuffix(public var next: IpAdapterDnsSuffix? = null, public var string: UShortArray = UShortArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterDnsSuffix) return false
        if (this.next != other.next) return false
        if (!this.string.contentEquals(other.string)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.string.contentHashCode()
        return result
    }
}

public data class IpAdapterGatewayAddressLh(
    public var anonymous: IpAdapterGatewayAddressLh0 = IpAdapterGatewayAddressLh0(),
    public var next: IpAdapterGatewayAddressLh? = null,
    public var address: SocketAddress = SocketAddress(),
)

public data class IpAdapterGatewayAddressLh0(public var alignment: ULong = 0uL, public var anonymous: IpAdapterGatewayAddressLh00 = IpAdapterGatewayAddressLh00())

public data class IpAdapterGatewayAddressLh00(public var length: UInt = 0u, public var reserved: UInt = 0u)

public data class IpAdapterIndexMap(public var index: UInt = 0u, public var name: UShortArray = UShortArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterIndexMap) return false
        if (this.index != other.index) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.index.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public class IpAdapterInfo(
    public var next: IpAdapterInfo? = null,
    public var comboIndex: UInt = 0u,
    public var adapterName: ByteArray = ByteArray(260),
    public var description: ByteArray = ByteArray(132),
    public var addressLength: UInt = 0u,
    public var address: UByteArray = UByteArray(8),
    public var index: UInt = 0u,
    public var type: UInt = 0u,
    public var dhcpEnabled: UInt = 0u,
    public var currentIpAddress: IpAddrString? = null,
    public var ipAddressList: IpAddrString = IpAddrString(),
    public var gatewayList: IpAddrString = IpAddrString(),
    public var dhcpServer: IpAddrString = IpAddrString(),
    public var haveWins: Bool = 0,
    public var primaryWinsServer: IpAddrString = IpAddrString(),
    public var secondaryWinsServer: IpAddrString = IpAddrString(),
    public var leaseObtained: Long = 0L,
    public var leaseExpires: Long = 0L,
)

public data class IpAdapterMulticastAddressXp(
    public var anonymous: IpAdapterMulticastAddressXp0 = IpAdapterMulticastAddressXp0(),
    public var next: IpAdapterMulticastAddressXp? = null,
    public var address: SocketAddress = SocketAddress(),
)

public data class IpAdapterMulticastAddressXp0(public var alignment: ULong = 0uL, public var anonymous: IpAdapterMulticastAddressXp00 = IpAdapterMulticastAddressXp00())

public data class IpAdapterMulticastAddressXp00(public var length: UInt = 0u, public var flags: UInt = 0u)

public data class IpAdapterOrderMap(public var numAdapters: UInt = 0u, public var adapterOrder: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterOrderMap) return false
        if (this.numAdapters != other.numAdapters) return false
        if (!this.adapterOrder.contentEquals(other.adapterOrder)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numAdapters.hashCode()
        result = 31 * result + this.adapterOrder.contentHashCode()
        return result
    }
}

public data class IpAdapterPrefixXp(
    public var anonymous: IpAdapterPrefixXp0 = IpAdapterPrefixXp0(),
    public var next: IpAdapterPrefixXp? = null,
    public var address: SocketAddress = SocketAddress(),
    public var prefixLength: UInt = 0u,
)

public data class IpAdapterPrefixXp0(public var alignment: ULong = 0uL, public var anonymous: IpAdapterPrefixXp00 = IpAdapterPrefixXp00())

public data class IpAdapterPrefixXp00(public var length: UInt = 0u, public var flags: UInt = 0u)

public data class IpAdapterUnicastAddressLh(
    public var anonymous: IpAdapterUnicastAddressLh0 = IpAdapterUnicastAddressLh0(),
    public var next: IpAdapterUnicastAddressLh? = null,
    public var address: SocketAddress = SocketAddress(),
    public var prefixOrigin: NlPrefixOrigin = 0,
    public var suffixOrigin: NlSuffixOrigin = 0,
    public var dadState: NlDadState = 0,
    public var validLifetime: UInt = 0u,
    public var preferredLifetime: UInt = 0u,
    public var leaseLifetime: UInt = 0u,
    public var onLinkPrefixLength: UByte = 0u,
)

public data class IpAdapterUnicastAddressLh0(public var alignment: ULong = 0uL, public var anonymous: IpAdapterUnicastAddressLh00 = IpAdapterUnicastAddressLh00())

public data class IpAdapterUnicastAddressLh00(public var length: UInt = 0u, public var flags: UInt = 0u)

public data class IpAdapterUnicastAddressXp(
    public var anonymous: IpAdapterUnicastAddressXp0 = IpAdapterUnicastAddressXp0(),
    public var next: IpAdapterUnicastAddressXp? = null,
    public var address: SocketAddress = SocketAddress(),
    public var prefixOrigin: NlPrefixOrigin = 0,
    public var suffixOrigin: NlSuffixOrigin = 0,
    public var dadState: NlDadState = 0,
    public var validLifetime: UInt = 0u,
    public var preferredLifetime: UInt = 0u,
    public var leaseLifetime: UInt = 0u,
)

public data class IpAdapterUnicastAddressXp0(public var alignment: ULong = 0uL, public var anonymous: IpAdapterUnicastAddressXp00 = IpAdapterUnicastAddressXp00())

public data class IpAdapterUnicastAddressXp00(public var length: UInt = 0u, public var flags: UInt = 0u)

public data class IpAdapterWinsServerAddressLh(
    public var anonymous: IpAdapterWinsServerAddressLh0 = IpAdapterWinsServerAddressLh0(),
    public var next: IpAdapterWinsServerAddressLh? = null,
    public var address: SocketAddress = SocketAddress(),
)

public data class IpAdapterWinsServerAddressLh0(public var alignment: ULong = 0uL, public var anonymous: IpAdapterWinsServerAddressLh00 = IpAdapterWinsServerAddressLh00())

public data class IpAdapterWinsServerAddressLh00(public var length: UInt = 0u, public var reserved: UInt = 0u)

public data class IpAddressPrefix(public var prefix: SockaddrInet = SockaddrInet(), public var prefixLength: UByte = 0u)

public data class IpAddressString(public var string: ByteArray = ByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAddressString) return false
        if (!this.string.contentEquals(other.string)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.string.contentHashCode()
    }
}

public data class IpAddrString(
    public var next: IpAddrString? = null,
    public var ipAddress: IpAddressString = IpAddressString(),
    public var ipMask: IpAddressString = IpAddressString(),
    public var context: UInt = 0u,
)

public data class IpInterfaceInfo(public var numAdapters: Int = 0, public var adapter: List<IpAdapterIndexMap> = List(1) { IpAdapterIndexMap() })

public data class IpInterfaceNameInfoW2ksp1(
    public var index: UInt = 0u,
    public var mediaType: UInt = 0u,
    public var connectionType: UByte = 0u,
    public var accessType: UByte = 0u,
    public var deviceGuid: Guid = Guid(),
    public var interfaceGuid: Guid = Guid(),
)

public data class IpMcastCounterInfo(
    public var inMcastOctets: ULong = 0uL,
    public var outMcastOctets: ULong = 0uL,
    public var inMcastPkts: ULong = 0uL,
    public var outMcastPkts: ULong = 0uL,
)

public data class IpOptionInformation(
    public var ttl: UByte = 0u,
    public var tos: UByte = 0u,
    public var flags: UByte = 0u,
    public var optionsSize: UByte = 0u,
    public var optionsData: COpaquePointer? = null,
)

public data class IpOptionInformation32(
    public var ttl: UByte = 0u,
    public var tos: UByte = 0u,
    public var flags: UByte = 0u,
    public var optionsSize: UByte = 0u,
    public var optionsData: COpaquePointer? = null,
)

public data class IpPerAdapterInfoW2ksp1(
    public var autoconfigEnabled: UInt = 0u,
    public var autoconfigActive: UInt = 0u,
    public var currentDnsServer: IpAddrString? = null,
    public var dnsServerList: IpAddrString = IpAddrString(),
)

public data class IpUnidirectionalAdapterAddress(public var numAdapters: UInt = 0u, public var address: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpUnidirectionalAdapterAddress) return false
        if (this.numAdapters != other.numAdapters) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numAdapters.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }
}

public data class Mibicmpinfo(public var icmpInStats: Mibicmpstats = Mibicmpstats(), public var icmpOutStats: Mibicmpstats = Mibicmpstats())

public data class Mibicmpstats(
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

public data class MibicmpstatsExXpsp1(
    public var dwMsgs: UInt = 0u,
    public var dwErrors: UInt = 0u,
    public var rgdwTypeCount: UIntArray = UIntArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibicmpstatsExXpsp1) return false
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

public data class MibAnycastipaddressRow(
    public var address: SockaddrInet = SockaddrInet(),
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var scopeId: ScopeId = ScopeId(),
)

public data class MibAnycastipaddressTable(public var numEntries: UInt = 0u, public var table: List<MibAnycastipaddressRow> = List(1) { MibAnycastipaddressRow() })

public data class MibBestIf(public var dwDestAddr: UInt = 0u, public var dwIfIndex: UInt = 0u)

public data class MibBoundaryrow(public var dwGroupAddress: UInt = 0u, public var dwGroupMask: UInt = 0u)

public data class MibIcmp(public var stats: Mibicmpinfo = Mibicmpinfo())

public data class MibIcmpExXpsp1(public var icmpInStats: MibicmpstatsExXpsp1 = MibicmpstatsExXpsp1(), public var icmpOutStats: MibicmpstatsExXpsp1 = MibicmpstatsExXpsp1())

public data class MibIfnumber(public var dwValue: UInt = 0u)

public class MibIfrow(
    public var wszName: UShortArray = UShortArray(256),
    public var dwIndex: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwMtu: UInt = 0u,
    public var dwSpeed: UInt = 0u,
    public var dwPhysAddrLen: UInt = 0u,
    public var bPhysAddr: UByteArray = UByteArray(8),
    public var dwAdminStatus: UInt = 0u,
    public var dwOperStatus: InternalIfOperStatus = 0,
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

public data class MibIfstackRow(public var higherLayerInterfaceIndex: UInt = 0u, public var lowerLayerInterfaceIndex: UInt = 0u)

public data class MibIfstackTable(public var numEntries: UInt = 0u, public var table: List<MibIfstackRow> = List(1) { MibIfstackRow() })

public data class MibIfstatus(
    public var dwIfIndex: UInt = 0u,
    public var dwAdminStatus: UInt = 0u,
    public var dwOperationalStatus: UInt = 0u,
    public var bMHbeatActive: Bool = 0,
    public var bMHbeatAlive: Bool = 0,
)

public data class MibIftable(public var dwNumEntries: UInt = 0u, public var table: List<MibIfrow> = List(1) { MibIfrow() })

public class MibIfRow2(
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var interfaceGuid: Guid = Guid(),
    public var alias: UShortArray = UShortArray(257),
    public var description: UShortArray = UShortArray(257),
    public var physicalAddressLength: UInt = 0u,
    public var physicalAddress: UByteArray = UByteArray(32),
    public var permanentPhysicalAddress: UByteArray = UByteArray(32),
    public var mtu: UInt = 0u,
    public var type: UInt = 0u,
    public var tunnelType: TunnelType = 0,
    public var mediaType: NdisMedium = 0,
    public var physicalMediumType: NdisPhysicalMedium = 0,
    public var accessType: NetIfAccessType = 0,
    public var directionType: NetIfDirectionType = 0,
    public var interfaceAndOperStatusFlags: MibIfRow20 = MibIfRow20(),
    public var operStatus: IfOperStatus = 0,
    public var adminStatus: NetIfAdminStatus = 0,
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var networkGuid: Guid = Guid(),
    public var connectionType: NetIfConnectionType = 0,
    public var transmitLinkSpeed: ULong = 0uL,
    public var receiveLinkSpeed: ULong = 0uL,
    public var inOctets: ULong = 0uL,
    public var inUcastPkts: ULong = 0uL,
    public var inNUcastPkts: ULong = 0uL,
    public var inDiscards: ULong = 0uL,
    public var inErrors: ULong = 0uL,
    public var inUnknownProtos: ULong = 0uL,
    public var inUcastOctets: ULong = 0uL,
    public var inMulticastOctets: ULong = 0uL,
    public var inBroadcastOctets: ULong = 0uL,
    public var outOctets: ULong = 0uL,
    public var outUcastPkts: ULong = 0uL,
    public var outNUcastPkts: ULong = 0uL,
    public var outDiscards: ULong = 0uL,
    public var outErrors: ULong = 0uL,
    public var outUcastOctets: ULong = 0uL,
    public var outMulticastOctets: ULong = 0uL,
    public var outBroadcastOctets: ULong = 0uL,
    public var outQLen: ULong = 0uL,
)

public data class MibIfRow20(public var bitfield: UByte = 0u)

public data class MibIfTable2(public var numEntries: UInt = 0u, public var table: List<MibIfRow2> = List(1) { MibIfRow2() })

public data class MibInvertedifstackRow(public var lowerLayerInterfaceIndex: UInt = 0u, public var higherLayerInterfaceIndex: UInt = 0u)

public data class MibInvertedifstackTable(public var numEntries: UInt = 0u, public var table: List<MibInvertedifstackRow> = List(1) { MibInvertedifstackRow() })

public data class MibIpaddrrowW2k(
    public var dwAddr: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwBCastAddr: UInt = 0u,
    public var dwReasmSize: UInt = 0u,
    public var unused1: UShort = 0u,
    public var unused2: UShort = 0u,
)

public data class MibIpaddrrowXp(
    public var dwAddr: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwBCastAddr: UInt = 0u,
    public var dwReasmSize: UInt = 0u,
    public var unused1: UShort = 0u,
    public var wType: UShort = 0u,
)

public data class MibIpaddrtable(public var dwNumEntries: UInt = 0u, public var table: List<MibIpaddrrowXp> = List(1) { MibIpaddrrowXp() })

public data class MibIpdestrow(
    public var forwardRow: MibIpforwardrow = MibIpforwardrow(),
    public var dwForwardPreference: UInt = 0u,
    public var dwForwardViewSet: UInt = 0u,
)

public data class MibIpdesttable(public var dwNumEntries: UInt = 0u, public var table: List<MibIpdestrow> = List(1) { MibIpdestrow() })

public data class MibIpforwardnumber(public var dwValue: UInt = 0u)

public data class MibIpforwardrow(
    public var dwForwardDest: UInt = 0u,
    public var dwForwardMask: UInt = 0u,
    public var dwForwardPolicy: UInt = 0u,
    public var dwForwardNextHop: UInt = 0u,
    public var dwForwardIfIndex: UInt = 0u,
    public var anonymous1: MibIpforwardrow0 = MibIpforwardrow0(),
    public var anonymous2: MibIpforwardrow1 = MibIpforwardrow1(),
    public var dwForwardAge: UInt = 0u,
    public var dwForwardNextHopAS: UInt = 0u,
    public var dwForwardMetric1: UInt = 0u,
    public var dwForwardMetric2: UInt = 0u,
    public var dwForwardMetric3: UInt = 0u,
    public var dwForwardMetric4: UInt = 0u,
    public var dwForwardMetric5: UInt = 0u,
)

public data class MibIpforwardrow0(public var dwForwardType: UInt = 0u, public var forwardType: MibIpforwardType = 0)

public data class MibIpforwardrow1(public var dwForwardProto: UInt = 0u, public var forwardProto: NlRouteProtocol = 0)

public data class MibIpforwardtable(public var dwNumEntries: UInt = 0u, public var table: List<MibIpforwardrow> = List(1) { MibIpforwardrow() })

public data class MibIpforwardRow2(
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var destinationPrefix: IpAddressPrefix = IpAddressPrefix(),
    public var nextHop: SockaddrInet = SockaddrInet(),
    public var sitePrefixLength: UByte = 0u,
    public var validLifetime: UInt = 0u,
    public var preferredLifetime: UInt = 0u,
    public var metric: UInt = 0u,
    public var protocol: NlRouteProtocol = 0,
    public var loopback: Boolean = false,
    public var autoconfigureAddress: Boolean = false,
    public var publish: Boolean = false,
    public var immortal: Boolean = false,
    public var age: UInt = 0u,
    public var origin: NlRouteOrigin = 0,
)

public data class MibIpforwardTable2(public var numEntries: UInt = 0u, public var table: List<MibIpforwardRow2> = List(1) { MibIpforwardRow2() })

public class MibIpinterfaceRow(
    public var family: AddressFamily = 0u,
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var maxReassemblySize: UInt = 0u,
    public var interfaceIdentifier: ULong = 0uL,
    public var minRouterAdvertisementInterval: UInt = 0u,
    public var maxRouterAdvertisementInterval: UInt = 0u,
    public var advertisingEnabled: Boolean = false,
    public var forwardingEnabled: Boolean = false,
    public var weakHostSend: Boolean = false,
    public var weakHostReceive: Boolean = false,
    public var useAutomaticMetric: Boolean = false,
    public var useNeighborUnreachabilityDetection: Boolean = false,
    public var managedAddressConfigurationSupported: Boolean = false,
    public var otherStatefulConfigurationSupported: Boolean = false,
    public var advertiseDefaultRoute: Boolean = false,
    public var routerDiscoveryBehavior: NlRouterDiscoveryBehavior = 0,
    public var dadTransmits: UInt = 0u,
    public var baseReachableTime: UInt = 0u,
    public var retransmitTime: UInt = 0u,
    public var pathMtuDiscoveryTimeout: UInt = 0u,
    public var linkLocalAddressBehavior: NlLinkLocalAddressBehavior = 0,
    public var linkLocalAddressTimeout: UInt = 0u,
    public var zoneIndices: UIntArray = UIntArray(16),
    public var sitePrefixLength: UInt = 0u,
    public var metric: UInt = 0u,
    public var nlMtu: UInt = 0u,
    public var connected: Boolean = false,
    public var supportsWakeUpPatterns: Boolean = false,
    public var supportsNeighborDiscovery: Boolean = false,
    public var supportsRouterDiscovery: Boolean = false,
    public var reachableTime: UInt = 0u,
    public var transmitOffload: NlInterfaceOffloadRod = NlInterfaceOffloadRod(),
    public var receiveOffload: NlInterfaceOffloadRod = NlInterfaceOffloadRod(),
    public var disableDefaultRoutes: Boolean = false,
)

public data class MibIpinterfaceTable(public var numEntries: UInt = 0u, public var table: List<MibIpinterfaceRow> = List(1) { MibIpinterfaceRow() })

public data class MibIpmcastBoundary(
    public var dwIfIndex: UInt = 0u,
    public var dwGroupAddress: UInt = 0u,
    public var dwGroupMask: UInt = 0u,
    public var dwStatus: UInt = 0u,
)

public data class MibIpmcastBoundaryTable(public var dwNumEntries: UInt = 0u, public var table: List<MibIpmcastBoundary> = List(1) { MibIpmcastBoundary() })

public data class MibIpmcastGlobal(public var dwEnable: UInt = 0u)

public data class MibIpmcastIfEntry(
    public var dwIfIndex: UInt = 0u,
    public var dwTtl: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var dwRateLimit: UInt = 0u,
    public var ulInMcastOctets: UInt = 0u,
    public var ulOutMcastOctets: UInt = 0u,
)

public data class MibIpmcastIfTable(public var dwNumEntries: UInt = 0u, public var table: List<MibIpmcastIfEntry> = List(1) { MibIpmcastIfEntry() })

public data class MibIpmcastMfe(
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
    public var rgmioOutInfo: List<MibIpmcastOifXp> = List(1) { MibIpmcastOifXp() },
)

public class MibIpmcastMfeStats(
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
    public var rgmiosOutStats: List<MibIpmcastOifStatsLh> = List(1) { MibIpmcastOifStatsLh() },
)

public class MibIpmcastMfeStatsExXp(
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
    public var rgmiosOutStats: List<MibIpmcastOifStatsLh> = List(1) { MibIpmcastOifStatsLh() },
)

public data class MibIpmcastOifStatsLh(
    public var dwOutIfIndex: UInt = 0u,
    public var dwNextHopAddr: UInt = 0u,
    public var dwDialContext: UInt = 0u,
    public var ulTtlTooLow: UInt = 0u,
    public var ulFragNeeded: UInt = 0u,
    public var ulOutPackets: UInt = 0u,
    public var ulOutDiscards: UInt = 0u,
)

public data class MibIpmcastOifStatsW2k(
    public var dwOutIfIndex: UInt = 0u,
    public var dwNextHopAddr: UInt = 0u,
    public var pvDialContext: COpaquePointer? = null,
    public var ulTtlTooLow: UInt = 0u,
    public var ulFragNeeded: UInt = 0u,
    public var ulOutPackets: UInt = 0u,
    public var ulOutDiscards: UInt = 0u,
)

public data class MibIpmcastOifW2k(
    public var dwOutIfIndex: UInt = 0u,
    public var dwNextHopAddr: UInt = 0u,
    public var pvReserved: COpaquePointer? = null,
    public var dwReserved: UInt = 0u,
)

public data class MibIpmcastOifXp(
    public var dwOutIfIndex: UInt = 0u,
    public var dwNextHopAddr: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var dwReserved1: UInt = 0u,
)

public data class MibIpmcastScope(
    public var dwGroupAddress: UInt = 0u,
    public var dwGroupMask: UInt = 0u,
    public var snNameBuffer: UShortArray = UShortArray(256),
    public var dwStatus: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibIpmcastScope) return false
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

public data class MibIpnetrowLh(
    public var dwIndex: UInt = 0u,
    public var dwPhysAddrLen: UInt = 0u,
    public var bPhysAddr: UByteArray = UByteArray(8),
    public var dwAddr: UInt = 0u,
    public var anonymous: MibIpnetrowLh0 = MibIpnetrowLh0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibIpnetrowLh) return false
        if (this.dwIndex != other.dwIndex) return false
        if (this.dwPhysAddrLen != other.dwPhysAddrLen) return false
        if (!this.bPhysAddr.contentEquals(other.bPhysAddr)) return false
        if (this.dwAddr != other.dwAddr) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIndex.hashCode()
        result = 31 * result + this.dwPhysAddrLen.hashCode()
        result = 31 * result + this.bPhysAddr.contentHashCode()
        result = 31 * result + this.dwAddr.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class MibIpnetrowLh0(public var dwType: UInt = 0u, public var type: MibIpnetType = 0)

public data class MibIpnetrowW2k(
    public var dwIndex: UInt = 0u,
    public var dwPhysAddrLen: UInt = 0u,
    public var bPhysAddr: UByteArray = UByteArray(8),
    public var dwAddr: UInt = 0u,
    public var dwType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibIpnetrowW2k) return false
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

public data class MibIpnettable(public var dwNumEntries: UInt = 0u, public var table: List<MibIpnetrowLh> = List(1) { MibIpnetrowLh() })

public data class MibIpnetRow2(
    public var address: SockaddrInet = SockaddrInet(),
    public var interfaceIndex: UInt = 0u,
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var physicalAddress: UByteArray = UByteArray(32),
    public var physicalAddressLength: UInt = 0u,
    public var state: NlNeighborState = 0,
    public var anonymous: MibIpnetRow20 = MibIpnetRow20(),
    public var reachabilityTime: MibIpnetRow21 = MibIpnetRow21(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibIpnetRow2) return false
        if (this.address != other.address) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.interfaceLuid != other.interfaceLuid) return false
        if (!this.physicalAddress.contentEquals(other.physicalAddress)) return false
        if (this.physicalAddressLength != other.physicalAddressLength) return false
        if (this.state != other.state) return false
        if (this.anonymous != other.anonymous) return false
        if (this.reachabilityTime != other.reachabilityTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.interfaceIndex.hashCode()
        result = 31 * result + this.interfaceLuid.hashCode()
        result = 31 * result + this.physicalAddress.contentHashCode()
        result = 31 * result + this.physicalAddressLength.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.reachabilityTime.hashCode()
        return result
    }
}

public data class MibIpnetRow20(public var anonymous: MibIpnetRow200 = MibIpnetRow200(), public var flags: UByte = 0u)

public data class MibIpnetRow200(public var bitfield: UByte = 0u)

public data class MibIpnetRow21(public var lastReachable: UInt = 0u, public var lastUnreachable: UInt = 0u)

public data class MibIpnetTable2(public var numEntries: UInt = 0u, public var table: List<MibIpnetRow2> = List(1) { MibIpnetRow2() })

public data class MibIppathRow(
    public var source: SockaddrInet = SockaddrInet(),
    public var destination: SockaddrInet = SockaddrInet(),
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var currentNextHop: SockaddrInet = SockaddrInet(),
    public var pathMtu: UInt = 0u,
    public var rttMean: UInt = 0u,
    public var rttDeviation: UInt = 0u,
    public var anonymous: MibIppathRow0 = MibIppathRow0(),
    public var isReachable: Boolean = false,
    public var linkTransmitSpeed: ULong = 0uL,
    public var linkReceiveSpeed: ULong = 0uL,
)

public data class MibIppathRow0(public var lastReachable: UInt = 0u, public var lastUnreachable: UInt = 0u)

public data class MibIppathTable(public var numEntries: UInt = 0u, public var table: List<MibIppathRow> = List(1) { MibIppathRow() })

public class MibIpstatsLh(
    public var anonymous: MibIpstatsLh0 = MibIpstatsLh0(),
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

public data class MibIpstatsLh0(public var dwForwarding: UInt = 0u, public var forwarding: MibIpstatsForwarding = 0)

public class MibIpstatsW2k(
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

public data class MibIpNetworkConnectionBandwidthEstimates(public var inboundBandwidthInformation: NlBandwidthInformation = NlBandwidthInformation(), public var outboundBandwidthInformation: NlBandwidthInformation = NlBandwidthInformation())

public data class MibMcastLimitRow(public var dwTtl: UInt = 0u, public var dwRateLimit: UInt = 0u)

public data class MibMfeStatsTable(public var dwNumEntries: UInt = 0u, public var table: List<MibIpmcastMfeStats> = List(1) { MibIpmcastMfeStats() })

public data class MibMfeStatsTableExXp(public var dwNumEntries: UInt = 0u, public var table: List<MibIpmcastMfeStatsExXp> = List(1) { MibIpmcastMfeStatsExXp() })

public data class MibMfeTable(public var dwNumEntries: UInt = 0u, public var table: List<MibIpmcastMfe> = List(1) { MibIpmcastMfe() })

public data class MibMulticastipaddressRow(
    public var address: SockaddrInet = SockaddrInet(),
    public var interfaceIndex: UInt = 0u,
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var scopeId: ScopeId = ScopeId(),
)

public data class MibMulticastipaddressTable(public var numEntries: UInt = 0u, public var table: List<MibMulticastipaddressRow> = List(1) { MibMulticastipaddressRow() })

public data class MibOpaqueInfo(public var dwId: UInt = 0u, public var anonymous: MibOpaqueInfo0 = MibOpaqueInfo0())

public data class MibOpaqueInfo0(public var ullAlign: ULong = 0uL, public var rgbyData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibOpaqueInfo0) return false
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

public data class MibOpaqueQuery(public var dwVarId: UInt = 0u, public var rgdwVarIndex: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibOpaqueQuery) return false
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

public data class MibProxyarp(
    public var dwAddress: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwIfIndex: UInt = 0u,
)

public data class MibRoutestate(public var bRoutesSetToStack: Bool = 0)

public data class MibTcp6row(
    public var state: MibTcpState = 0,
    public var localAddr: In6Addr = In6Addr(),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var remoteAddr: In6Addr = In6Addr(),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
)

public data class MibTcp6row2(
    public var localAddr: In6Addr = In6Addr(),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var remoteAddr: In6Addr = In6Addr(),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var state: MibTcpState = 0,
    public var dwOwningPid: UInt = 0u,
    public var dwOffloadState: TcpConnectionOffloadState = 0,
)

public data class MibTcp6rowOwnerModule(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var ucRemoteAddr: UByteArray = UByteArray(16),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var owningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibTcp6rowOwnerModule) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (!this.ucRemoteAddr.contentEquals(other.ucRemoteAddr)) return false
        if (this.dwRemoteScopeId != other.dwRemoteScopeId) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        if (this.dwState != other.dwState) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
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
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        return result
    }
}

public data class MibTcp6rowOwnerPid(
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
        if (other !is MibTcp6rowOwnerPid) return false
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

public data class MibTcp6table(public var dwNumEntries: UInt = 0u, public var table: List<MibTcp6row> = List(1) { MibTcp6row() })

public data class MibTcp6table2(public var dwNumEntries: UInt = 0u, public var table: List<MibTcp6row2> = List(1) { MibTcp6row2() })

public data class MibTcp6tableOwnerModule(public var dwNumEntries: UInt = 0u, public var table: List<MibTcp6rowOwnerModule> = List(1) { MibTcp6rowOwnerModule() })

public data class MibTcp6tableOwnerPid(public var dwNumEntries: UInt = 0u, public var table: List<MibTcp6rowOwnerPid> = List(1) { MibTcp6rowOwnerPid() })

public data class MibTcprow2(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var dwOffloadState: TcpConnectionOffloadState = 0,
)

public data class MibTcprowLh(
    public var anonymous: MibTcprowLh0 = MibTcprowLh0(),
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
)

public data class MibTcprowLh0(public var dwState: UInt = 0u, public var state: MibTcpState = 0)

public data class MibTcprowOwnerModule(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var owningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibTcprowOwnerModule) return false
        if (this.dwState != other.dwState) return false
        if (this.dwLocalAddr != other.dwLocalAddr) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwRemoteAddr != other.dwRemoteAddr) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
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
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        return result
    }
}

public data class MibTcprowOwnerPid(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
)

public data class MibTcprowW2k(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
)

public data class MibTcpstats2(
    public var rtoAlgorithm: TcpRtoAlgorithm = 0,
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

public data class MibTcpstatsLh(
    public var anonymous: MibTcpstatsLh0 = MibTcpstatsLh0(),
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

public data class MibTcpstatsLh0(public var dwRtoAlgorithm: UInt = 0u, public var rtoAlgorithm: TcpRtoAlgorithm = 0)

public data class MibTcpstatsW2k(
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

public data class MibTcptable(public var dwNumEntries: UInt = 0u, public var table: List<MibTcprowLh> = List(1) { MibTcprowLh() })

public data class MibTcptable2(public var dwNumEntries: UInt = 0u, public var table: List<MibTcprow2> = List(1) { MibTcprow2() })

public data class MibTcptableOwnerModule(public var dwNumEntries: UInt = 0u, public var table: List<MibTcprowOwnerModule> = List(1) { MibTcprowOwnerModule() })

public data class MibTcptableOwnerPid(public var dwNumEntries: UInt = 0u, public var table: List<MibTcprowOwnerPid> = List(1) { MibTcprowOwnerPid() })

public data class MibUdp6row(
    public var dwLocalAddr: In6Addr = In6Addr(),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
)

public data class MibUdp6row2(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var anonymous: MibUdp6row20 = MibUdp6row20(),
    public var owningModuleInfo: ULongArray = ULongArray(16),
    public var ucRemoteAddr: UByteArray = UByteArray(16),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibUdp6row2) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
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
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        result = 31 * result + this.ucRemoteAddr.contentHashCode()
        result = 31 * result + this.dwRemoteScopeId.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        return result
    }
}

public data class MibUdp6row20(public var anonymous: MibUdp6row200 = MibUdp6row200(), public var dwFlags: Int = 0)

public data class MibUdp6row200(public var bitfield: Int = 0)

public data class MibUdp6rowOwnerModule(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var anonymous: MibUdp6rowOwnerModule0 = MibUdp6rowOwnerModule0(),
    public var owningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibUdp6rowOwnerModule) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        return result
    }
}

public data class MibUdp6rowOwnerModule0(public var anonymous: MibUdp6rowOwnerModule00 = MibUdp6rowOwnerModule00(), public var dwFlags: Int = 0)

public data class MibUdp6rowOwnerModule00(public var bitfield: Int = 0)

public data class MibUdp6rowOwnerPid(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibUdp6rowOwnerPid) return false
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

public data class MibUdp6table(public var dwNumEntries: UInt = 0u, public var table: List<MibUdp6row> = List(1) { MibUdp6row() })

public data class MibUdp6table2(public var dwNumEntries: UInt = 0u, public var table: List<MibUdp6row2> = List(1) { MibUdp6row2() })

public data class MibUdp6tableOwnerModule(public var dwNumEntries: UInt = 0u, public var table: List<MibUdp6rowOwnerModule> = List(1) { MibUdp6rowOwnerModule() })

public data class MibUdp6tableOwnerPid(public var dwNumEntries: UInt = 0u, public var table: List<MibUdp6rowOwnerPid> = List(1) { MibUdp6rowOwnerPid() })

public data class MibUdprow(public var dwLocalAddr: UInt = 0u, public var dwLocalPort: UInt = 0u)

public data class MibUdprow2(
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var anonymous: MibUdprow20 = MibUdprow20(),
    public var owningModuleInfo: ULongArray = ULongArray(16),
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibUdprow2) return false
        if (this.dwLocalAddr != other.dwLocalAddr) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
        if (this.dwRemoteAddr != other.dwRemoteAddr) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLocalAddr.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        result = 31 * result + this.dwRemoteAddr.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        return result
    }
}

public data class MibUdprow20(public var anonymous: MibUdprow200 = MibUdprow200(), public var dwFlags: Int = 0)

public data class MibUdprow200(public var bitfield: Int = 0)

public data class MibUdprowOwnerModule(
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var anonymous: MibUdprowOwnerModule0 = MibUdprowOwnerModule0(),
    public var owningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibUdprowOwnerModule) return false
        if (this.dwLocalAddr != other.dwLocalAddr) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLocalAddr.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        return result
    }
}

public data class MibUdprowOwnerModule0(public var anonymous: MibUdprowOwnerModule00 = MibUdprowOwnerModule00(), public var dwFlags: Int = 0)

public data class MibUdprowOwnerModule00(public var bitfield: Int = 0)

public data class MibUdprowOwnerPid(
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
)

public data class MibUdpstats(
    public var dwInDatagrams: UInt = 0u,
    public var dwNoPorts: UInt = 0u,
    public var dwInErrors: UInt = 0u,
    public var dwOutDatagrams: UInt = 0u,
    public var dwNumAddrs: UInt = 0u,
)

public data class MibUdpstats2(
    public var dw64InDatagrams: ULong = 0uL,
    public var dwNoPorts: UInt = 0u,
    public var dwInErrors: UInt = 0u,
    public var dw64OutDatagrams: ULong = 0uL,
    public var dwNumAddrs: UInt = 0u,
)

public data class MibUdptable(public var dwNumEntries: UInt = 0u, public var table: List<MibUdprow> = List(1) { MibUdprow() })

public data class MibUdptable2(public var dwNumEntries: UInt = 0u, public var table: List<MibUdprow2> = List(1) { MibUdprow2() })

public data class MibUdptableOwnerModule(public var dwNumEntries: UInt = 0u, public var table: List<MibUdprowOwnerModule> = List(1) { MibUdprowOwnerModule() })

public data class MibUdptableOwnerPid(public var dwNumEntries: UInt = 0u, public var table: List<MibUdprowOwnerPid> = List(1) { MibUdprowOwnerPid() })

public data class MibUnicastipaddressRow(
    public var address: SockaddrInet = SockaddrInet(),
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var prefixOrigin: NlPrefixOrigin = 0,
    public var suffixOrigin: NlSuffixOrigin = 0,
    public var validLifetime: UInt = 0u,
    public var preferredLifetime: UInt = 0u,
    public var onLinkPrefixLength: UByte = 0u,
    public var skipAsSource: Boolean = false,
    public var dadState: NlDadState = 0,
    public var scopeId: ScopeId = ScopeId(),
    public var creationTimeStamp: Long = 0L,
)

public data class MibUnicastipaddressTable(public var numEntries: UInt = 0u, public var table: List<MibUnicastipaddressRow> = List(1) { MibUnicastipaddressRow() })

public data class NetAddressInfo(public var format: NetAddressFormat = 0, public var anonymous: NetAddressInfo0 = NetAddressInfo0())

public data class NetAddressInfo0(
    public var namedAddress: NetAddressInfo00 = NetAddressInfo00(),
    public var ipv4Address: SockaddrIn = SockaddrIn(),
    public var ipv6Address: SockaddrIn6 = SockaddrIn6(),
    public var ipAddress: Sockaddr = Sockaddr(),
)

public data class NetAddressInfo00(public var address: UShortArray = UShortArray(256), public var port: UShortArray = UShortArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetAddressInfo00) return false
        if (!this.address.contentEquals(other.address)) return false
        if (!this.port.contentEquals(other.port)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.contentHashCode()
        result = 31 * result + this.port.contentHashCode()
        return result
    }
}

public data class Pflogframe(
    public var timestamp: Long = 0L,
    public var pfeTypeOfFrame: Pfframetype = 0,
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
        if (other !is Pflogframe) return false
        if (this.timestamp != other.timestamp) return false
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
        var result = this.timestamp.hashCode()
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

public data class PfFilterDescriptor(
    public var dwFilterFlags: UInt = 0u,
    public var dwRule: UInt = 0u,
    public var pfatType: Pfaddresstype = 0,
    public var srcAddr: COpaquePointer? = null,
    public var srcMask: COpaquePointer? = null,
    public var dstAddr: COpaquePointer? = null,
    public var dstMask: COpaquePointer? = null,
    public var dwProtocol: UInt = 0u,
    public var fLateBound: UInt = 0u,
    public var wSrcPort: UShort = 0u,
    public var wDstPort: UShort = 0u,
    public var wSrcPortHighRange: UShort = 0u,
    public var wDstPortHighRange: UShort = 0u,
)

public data class PfFilterStats(public var dwNumPacketsFiltered: UInt = 0u, public var info: PfFilterDescriptor = PfFilterDescriptor())

public data class PfInterfaceStats(
    public var pvDriverContext: COpaquePointer? = null,
    public var dwFlags: UInt = 0u,
    public var dwInDrops: UInt = 0u,
    public var dwOutDrops: UInt = 0u,
    public var eaInAction: PfforwardAction = 0,
    public var eaOutAction: PfforwardAction = 0,
    public var dwNumInFilters: UInt = 0u,
    public var dwNumOutFilters: UInt = 0u,
    public var dwFrag: UInt = 0u,
    public var dwSpoof: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var liSYN: Long = 0L,
    public var liTotalLogged: Long = 0L,
    public var dwLostLogEntries: UInt = 0u,
    public var filterInfo: List<PfFilterStats> = List(1) { PfFilterStats() },
)

public data class PfLatebindInfo(
    public var srcAddr: COpaquePointer? = null,
    public var dstAddr: COpaquePointer? = null,
    public var mask: COpaquePointer? = null,
)

public data class TcpipOwnerModuleBasicInfo(public var pModuleName: Pwstr = null, public var pModulePath: Pwstr = null)

public data class TcpEstatsBandwidthRodV0(
    public var outboundBandwidth: ULong = 0uL,
    public var inboundBandwidth: ULong = 0uL,
    public var outboundInstability: ULong = 0uL,
    public var inboundInstability: ULong = 0uL,
    public var outboundBandwidthPeaked: Boolean = false,
    public var inboundBandwidthPeaked: Boolean = false,
)

public data class TcpEstatsBandwidthRwV0(public var enableCollectionOutbound: TcpBooleanOptional = 0, public var enableCollectionInbound: TcpBooleanOptional = 0)

public data class TcpEstatsDataRodV0(
    public var dataBytesOut: ULong = 0uL,
    public var dataSegsOut: ULong = 0uL,
    public var dataBytesIn: ULong = 0uL,
    public var dataSegsIn: ULong = 0uL,
    public var segsOut: ULong = 0uL,
    public var segsIn: ULong = 0uL,
    public var softErrors: UInt = 0u,
    public var softErrorReason: UInt = 0u,
    public var sndUna: UInt = 0u,
    public var sndNxt: UInt = 0u,
    public var sndMax: UInt = 0u,
    public var thruBytesAcked: ULong = 0uL,
    public var rcvNxt: UInt = 0u,
    public var thruBytesReceived: ULong = 0uL,
)

public data class TcpEstatsDataRwV0(public var enableCollection: Boolean = false)

public data class TcpEstatsFineRttRodV0(
    public var rttVar: UInt = 0u,
    public var maxRtt: UInt = 0u,
    public var minRtt: UInt = 0u,
    public var sumRtt: UInt = 0u,
)

public data class TcpEstatsFineRttRwV0(public var enableCollection: Boolean = false)

public data class TcpEstatsObsRecRodV0(
    public var curRwinRcvd: UInt = 0u,
    public var maxRwinRcvd: UInt = 0u,
    public var minRwinRcvd: UInt = 0u,
    public var winScaleRcvd: UByte = 0u,
)

public data class TcpEstatsObsRecRwV0(public var enableCollection: Boolean = false)

public class TcpEstatsPathRodV0(
    public var fastRetran: UInt = 0u,
    public var timeouts: UInt = 0u,
    public var subsequentTimeouts: UInt = 0u,
    public var curTimeoutCount: UInt = 0u,
    public var abruptTimeouts: UInt = 0u,
    public var pktsRetrans: UInt = 0u,
    public var bytesRetrans: UInt = 0u,
    public var dupAcksIn: UInt = 0u,
    public var sacksRcvd: UInt = 0u,
    public var sackBlocksRcvd: UInt = 0u,
    public var congSignals: UInt = 0u,
    public var preCongSumCwnd: UInt = 0u,
    public var preCongSumRtt: UInt = 0u,
    public var postCongSumRtt: UInt = 0u,
    public var postCongCountRtt: UInt = 0u,
    public var ecnSignals: UInt = 0u,
    public var eceRcvd: UInt = 0u,
    public var sendStall: UInt = 0u,
    public var quenchRcvd: UInt = 0u,
    public var retranThresh: UInt = 0u,
    public var sndDupAckEpisodes: UInt = 0u,
    public var sumBytesReordered: UInt = 0u,
    public var nonRecovDa: UInt = 0u,
    public var nonRecovDaEpisodes: UInt = 0u,
    public var ackAfterFr: UInt = 0u,
    public var dsackDups: UInt = 0u,
    public var sampleRtt: UInt = 0u,
    public var smoothedRtt: UInt = 0u,
    public var rttVar: UInt = 0u,
    public var maxRtt: UInt = 0u,
    public var minRtt: UInt = 0u,
    public var sumRtt: UInt = 0u,
    public var countRtt: UInt = 0u,
    public var curRto: UInt = 0u,
    public var maxRto: UInt = 0u,
    public var minRto: UInt = 0u,
    public var curMss: UInt = 0u,
    public var maxMss: UInt = 0u,
    public var minMss: UInt = 0u,
    public var spuriousRtoDetections: UInt = 0u,
)

public data class TcpEstatsPathRwV0(public var enableCollection: Boolean = false)

public data class TcpEstatsRecRodV0(
    public var curRwinSent: UInt = 0u,
    public var maxRwinSent: UInt = 0u,
    public var minRwinSent: UInt = 0u,
    public var limRwin: UInt = 0u,
    public var dupAckEpisodes: UInt = 0u,
    public var dupAcksOut: UInt = 0u,
    public var ceRcvd: UInt = 0u,
    public var ecnSent: UInt = 0u,
    public var ecnNoncesRcvd: UInt = 0u,
    public var curReasmQueue: UInt = 0u,
    public var maxReasmQueue: UInt = 0u,
    public var curAppRQueue: Int = 0,
    public var maxAppRQueue: Int = 0,
    public var winScaleSent: UByte = 0u,
)

public data class TcpEstatsRecRwV0(public var enableCollection: Boolean = false)

public data class TcpEstatsSendBuffRodV0(
    public var curRetxQueue: Int = 0,
    public var maxRetxQueue: Int = 0,
    public var curAppWQueue: Int = 0,
    public var maxAppWQueue: Int = 0,
)

public data class TcpEstatsSendBuffRwV0(public var enableCollection: Boolean = false)

public class TcpEstatsSndCongRodV0(
    public var sndLimTransRwin: UInt = 0u,
    public var sndLimTimeRwin: UInt = 0u,
    public var sndLimBytesRwin: Int = 0,
    public var sndLimTransCwnd: UInt = 0u,
    public var sndLimTimeCwnd: UInt = 0u,
    public var sndLimBytesCwnd: Int = 0,
    public var sndLimTransSnd: UInt = 0u,
    public var sndLimTimeSnd: UInt = 0u,
    public var sndLimBytesSnd: Int = 0,
    public var slowStart: UInt = 0u,
    public var congAvoid: UInt = 0u,
    public var otherReductions: UInt = 0u,
    public var curCwnd: UInt = 0u,
    public var maxSsCwnd: UInt = 0u,
    public var maxCaCwnd: UInt = 0u,
    public var curSsthresh: UInt = 0u,
    public var maxSsthresh: UInt = 0u,
    public var minSsthresh: UInt = 0u,
)

public data class TcpEstatsSndCongRosV0(public var limCwnd: UInt = 0u)

public data class TcpEstatsSndCongRwV0(public var enableCollection: Boolean = false)

public data class TcpEstatsSynOptsRosV0(
    public var activeOpen: Boolean = false,
    public var mssRcvd: UInt = 0u,
    public var mssSent: UInt = 0u,
)

public data class TcpReservePortRange(public var upperRange: UShort = 0u, public var lowerRange: UShort = 0u)
