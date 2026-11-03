@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class DATE_TIME(public var dwLowDateTime: UInt = 0u, public var dwHighDateTime: UInt = 0u)

public data class DHCPAPI_PARAMS(
    public var Flags: UInt = 0u,
    public var OptionId: UInt = 0u,
    public var IsVendor: BOOL = 0,
    public var Data: Long = 0L,
    public var nBytesData: UInt = 0u,
)

public data class DHCPCAPI_CLASSID(
    public var Flags: UInt = 0u,
    public var Data: Long = 0L,
    public var nBytesData: UInt = 0u,
)

public data class DHCPCAPI_PARAMS_ARRAY(public var nParams: UInt = 0u, public var Params: Long = 0L)

public data class DHCPDS_SERVER(
    public var Version: UInt = 0u,
    public var ServerName: PWSTR = 0L,
    public var ServerAddress: UInt = 0u,
    public var Flags: UInt = 0u,
    public var State: UInt = 0u,
    public var DsLocation: PWSTR = 0L,
    public var DsLocType: UInt = 0u,
)

public data class DHCPDS_SERVERS(
    public var Flags: UInt = 0u,
    public var NumElements: UInt = 0u,
    public var Servers: Long = 0L,
)

public class DHCPV4_FAILOVER_CLIENT_INFO(
    public var ClientIpAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var ClientHardwareAddress: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
    public var ClientComment: PWSTR = 0L,
    public var ClientLeaseExpires: DATE_TIME = DATE_TIME(),
    public var OwnerHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
    public var bClientType: UByte = 0u,
    public var AddressState: UByte = 0u,
    public var Status: QuarantineStatus = 0,
    public var ProbationEnds: DATE_TIME = DATE_TIME(),
    public var QuarantineCapable: BOOL = 0,
    public var SentPotExpTime: UInt = 0u,
    public var AckPotExpTime: UInt = 0u,
    public var RecvPotExpTime: UInt = 0u,
    public var StartTime: UInt = 0u,
    public var CltLastTransTime: UInt = 0u,
    public var LastBndUpdTime: UInt = 0u,
    public var BndMsgStatus: UInt = 0u,
    public var PolicyName: PWSTR = 0L,
    public var Flags: UByte = 0u,
)

public data class DHCPV4_FAILOVER_CLIENT_INFO_ARRAY(public var NumElements: UInt = 0u, public var Clients: Long = 0L)

public class DHCPV4_FAILOVER_CLIENT_INFO_EX(
    public var ClientIpAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var ClientHardwareAddress: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
    public var ClientComment: PWSTR = 0L,
    public var ClientLeaseExpires: DATE_TIME = DATE_TIME(),
    public var OwnerHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
    public var bClientType: UByte = 0u,
    public var AddressState: UByte = 0u,
    public var Status: QuarantineStatus = 0,
    public var ProbationEnds: DATE_TIME = DATE_TIME(),
    public var QuarantineCapable: BOOL = 0,
    public var SentPotExpTime: UInt = 0u,
    public var AckPotExpTime: UInt = 0u,
    public var RecvPotExpTime: UInt = 0u,
    public var StartTime: UInt = 0u,
    public var CltLastTransTime: UInt = 0u,
    public var LastBndUpdTime: UInt = 0u,
    public var BndMsgStatus: UInt = 0u,
    public var PolicyName: PWSTR = 0L,
    public var Flags: UByte = 0u,
    public var AddressStateEx: UInt = 0u,
)

public data class DHCPV6CAPI_CLASSID(
    public var Flags: UInt = 0u,
    public var Data: Long = 0L,
    public var nBytesData: UInt = 0u,
)

public data class DHCPV6CAPI_PARAMS(
    public var Flags: UInt = 0u,
    public var OptionId: UInt = 0u,
    public var IsVendor: BOOL = 0,
    public var Data: Long = 0L,
    public var nBytesData: UInt = 0u,
)

public data class DHCPV6CAPI_PARAMS_ARRAY(public var nParams: UInt = 0u, public var Params: Long = 0L)

public data class DHCPV6Prefix(
    public var prefix: UByteArray = UByteArray(16),
    public var prefixLength: UInt = 0u,
    public var preferredLifeTime: UInt = 0u,
    public var validLifeTime: UInt = 0u,
    public var status: StatusCode = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DHCPV6Prefix) return false
        if (!this.prefix.contentEquals(other.prefix)) return false
        if (this.prefixLength != other.prefixLength) return false
        if (this.preferredLifeTime != other.preferredLifeTime) return false
        if (this.validLifeTime != other.validLifeTime) return false
        if (this.status != other.status) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prefix.contentHashCode()
        result = 31 * result + this.prefixLength.hashCode()
        result = 31 * result + this.preferredLifeTime.hashCode()
        result = 31 * result + this.validLifeTime.hashCode()
        result = 31 * result + this.status.hashCode()
        return result
    }
}

public data class DHCPV6PrefixLeaseInformation(
    public var nPrefixes: UInt = 0u,
    public var prefixArray: Long = 0L,
    public var iaid: UInt = 0u,
    public var T1: Long = 0L,
    public var T2: Long = 0L,
    public var MaxLeaseExpirationTime: Long = 0L,
    public var LastRenewalTime: Long = 0L,
    public var status: StatusCode = 0,
    public var ServerId: Long = 0L,
    public var ServerIdLen: UInt = 0u,
)

public data class DHCPV6_BIND_ELEMENT(
    public var Flags: UInt = 0u,
    public var fBoundToDHCPServer: BOOL = 0,
    public var AdapterPrimaryAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(),
    public var AdapterSubnetAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(),
    public var IfDescription: PWSTR = 0L,
    public var IpV6IfIndex: UInt = 0u,
    public var IfIdSize: UInt = 0u,
    public var IfId: Long = 0L,
)

public data class DHCPV6_BIND_ELEMENT_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCPV6_IP_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCPV6_STATELESS_PARAMS(public var Status: BOOL = 0, public var PurgeInterval: UInt = 0u)

public data class DHCPV6_STATELESS_SCOPE_STATS(
    public var SubnetAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(),
    public var NumStatelessClientsAdded: ULong = 0uL,
    public var NumStatelessClientsRemoved: ULong = 0uL,
)

public data class DHCPV6_STATELESS_STATS(public var NumScopes: UInt = 0u, public var ScopeStats: Long = 0L)

public data class DHCP_ADDR_PATTERN(
    public var MatchHWType: BOOL = 0,
    public var HWType: UByte = 0u,
    public var IsWildcard: BOOL = 0,
    public var Length: UByte = 0u,
    public var Pattern: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DHCP_ADDR_PATTERN) return false
        if (this.MatchHWType != other.MatchHWType) return false
        if (this.HWType != other.HWType) return false
        if (this.IsWildcard != other.IsWildcard) return false
        if (this.Length != other.Length) return false
        if (!this.Pattern.contentEquals(other.Pattern)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MatchHWType.hashCode()
        result = 31 * result + this.HWType.hashCode()
        result = 31 * result + this.IsWildcard.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Pattern.contentHashCode()
        return result
    }
}

public data class DHCP_ALL_OPTIONS(
    public var Flags: UInt = 0u,
    public var NonVendorOptions: Long = 0L,
    public var NumVendorOptions: UInt = 0u,
    public var VendorOptions: Long = 0L,
)

public data class DHCP_ALL_OPTIONS_0(
    public var Option: DHCP_OPTION = DHCP_OPTION(),
    public var VendorName: PWSTR = 0L,
    public var ClassName: PWSTR = 0L,
)

public data class DHCP_ALL_OPTION_VALUES(
    public var Flags: UInt = 0u,
    public var NumElements: UInt = 0u,
    public var Options: Long = 0L,
)

public data class DHCP_ALL_OPTION_VALUES_0(
    public var ClassName: PWSTR = 0L,
    public var VendorName: PWSTR = 0L,
    public var IsVendor: BOOL = 0,
    public var OptionsArray: Long = 0L,
)

public data class DHCP_ALL_OPTION_VALUES_PB(
    public var Flags: UInt = 0u,
    public var NumElements: UInt = 0u,
    public var Options: Long = 0L,
)

public data class DHCP_ALL_OPTION_VALUES_PB_0(
    public var PolicyName: PWSTR = 0L,
    public var VendorName: PWSTR = 0L,
    public var IsVendor: BOOL = 0,
    public var OptionsArray: Long = 0L,
)

public data class DHCP_ATTRIB(
    public var DhcpAttribId: UInt = 0u,
    public var DhcpAttribType: UInt = 0u,
    public var Anonymous: DHCP_ATTRIB_0 = DHCP_ATTRIB_0(),
)

public data class DHCP_ATTRIB_0(public var DhcpAttribBool: BOOL = 0, public var DhcpAttribUlong: UInt = 0u)

public data class DHCP_ATTRIB_ARRAY(public var NumElements: UInt = 0u, public var DhcpAttribs: Long = 0L)

public data class DHCP_BINARY_DATA(public var DataLength: UInt = 0u, public var Data: Long = 0L)

public data class DHCP_BIND_ELEMENT(
    public var Flags: UInt = 0u,
    public var fBoundToDHCPServer: BOOL = 0,
    public var AdapterPrimaryAddress: UInt = 0u,
    public var AdapterSubnetAddress: UInt = 0u,
    public var IfDescription: PWSTR = 0L,
    public var IfIdSize: UInt = 0u,
    public var IfId: Long = 0L,
)

public data class DHCP_BIND_ELEMENT_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_BOOTP_IP_RANGE(
    public var StartAddress: UInt = 0u,
    public var EndAddress: UInt = 0u,
    public var BootpAllocated: UInt = 0u,
    public var MaxBootpAllowed: UInt = 0u,
)

public data class DHCP_CALLOUT_TABLE(
    public var DhcpControlHook: LPDHCP_CONTROL = null,
    public var DhcpNewPktHook: LPDHCP_NEWPKT = null,
    public var DhcpPktDropHook: LPDHCP_DROP_SEND = null,
    public var DhcpPktSendHook: LPDHCP_DROP_SEND = null,
    public var DhcpAddressDelHook: LPDHCP_PROB = null,
    public var DhcpAddressOfferHook: LPDHCP_GIVE_ADDRESS = null,
    public var DhcpHandleOptionsHook: LPDHCP_HANDLE_OPTIONS = null,
    public var DhcpDeleteClientHook: LPDHCP_DELETE_CLIENT = null,
    public var DhcpExtensionHook: Long = 0L,
    public var DhcpReservedHook: Long = 0L,
)

public data class DHCP_CLASS_INFO(
    public var ClassName: PWSTR = 0L,
    public var ClassComment: PWSTR = 0L,
    public var ClassDataLength: UInt = 0u,
    public var IsVendor: BOOL = 0,
    public var Flags: UInt = 0u,
    public var ClassData: Long = 0L,
)

public data class DHCP_CLASS_INFO_ARRAY(public var NumElements: UInt = 0u, public var Classes: Long = 0L)

public data class DHCP_CLASS_INFO_ARRAY_V6(public var NumElements: UInt = 0u, public var Classes: Long = 0L)

public data class DHCP_CLASS_INFO_V6(
    public var ClassName: PWSTR = 0L,
    public var ClassComment: PWSTR = 0L,
    public var ClassDataLength: UInt = 0u,
    public var IsVendor: BOOL = 0,
    public var EnterpriseNumber: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ClassData: Long = 0L,
)

public data class DHCP_CLIENT_FILTER_STATUS_INFO(
    public var ClientIpAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var ClientHardwareAddress: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
    public var ClientComment: PWSTR = 0L,
    public var ClientLeaseExpires: DATE_TIME = DATE_TIME(),
    public var OwnerHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
    public var bClientType: UByte = 0u,
    public var AddressState: UByte = 0u,
    public var Status: QuarantineStatus = 0,
    public var ProbationEnds: DATE_TIME = DATE_TIME(),
    public var QuarantineCapable: BOOL = 0,
    public var FilterStatus: UInt = 0u,
)

public data class DHCP_CLIENT_FILTER_STATUS_INFO_ARRAY(public var NumElements: UInt = 0u, public var Clients: Long = 0L)

public data class DHCP_CLIENT_INFO(
    public var ClientIpAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var ClientHardwareAddress: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
    public var ClientComment: PWSTR = 0L,
    public var ClientLeaseExpires: DATE_TIME = DATE_TIME(),
    public var OwnerHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
)

public data class DHCP_CLIENT_INFO_ARRAY(public var NumElements: UInt = 0u, public var Clients: Long = 0L)

public data class DHCP_CLIENT_INFO_ARRAY_V4(public var NumElements: UInt = 0u, public var Clients: Long = 0L)

public data class DHCP_CLIENT_INFO_ARRAY_V5(public var NumElements: UInt = 0u, public var Clients: Long = 0L)

public data class DHCP_CLIENT_INFO_ARRAY_V6(public var NumElements: UInt = 0u, public var Clients: Long = 0L)

public data class DHCP_CLIENT_INFO_ARRAY_VQ(public var NumElements: UInt = 0u, public var Clients: Long = 0L)

public data class DHCP_CLIENT_INFO_EX(
    public var ClientIpAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var ClientHardwareAddress: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
    public var ClientComment: PWSTR = 0L,
    public var ClientLeaseExpires: DATE_TIME = DATE_TIME(),
    public var OwnerHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
    public var bClientType: UByte = 0u,
    public var AddressState: UByte = 0u,
    public var Status: QuarantineStatus = 0,
    public var ProbationEnds: DATE_TIME = DATE_TIME(),
    public var QuarantineCapable: BOOL = 0,
    public var FilterStatus: UInt = 0u,
    public var PolicyName: PWSTR = 0L,
    public var Properties: Long = 0L,
)

public data class DHCP_CLIENT_INFO_EX_ARRAY(public var NumElements: UInt = 0u, public var Clients: Long = 0L)

public data class DHCP_CLIENT_INFO_PB(
    public var ClientIpAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var ClientHardwareAddress: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
    public var ClientComment: PWSTR = 0L,
    public var ClientLeaseExpires: DATE_TIME = DATE_TIME(),
    public var OwnerHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
    public var bClientType: UByte = 0u,
    public var AddressState: UByte = 0u,
    public var Status: QuarantineStatus = 0,
    public var ProbationEnds: DATE_TIME = DATE_TIME(),
    public var QuarantineCapable: BOOL = 0,
    public var FilterStatus: UInt = 0u,
    public var PolicyName: PWSTR = 0L,
)

public data class DHCP_CLIENT_INFO_PB_ARRAY(public var NumElements: UInt = 0u, public var Clients: Long = 0L)

public data class DHCP_CLIENT_INFO_V4(
    public var ClientIpAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var ClientHardwareAddress: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
    public var ClientComment: PWSTR = 0L,
    public var ClientLeaseExpires: DATE_TIME = DATE_TIME(),
    public var OwnerHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
    public var bClientType: UByte = 0u,
)

public data class DHCP_CLIENT_INFO_V5(
    public var ClientIpAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var ClientHardwareAddress: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
    public var ClientComment: PWSTR = 0L,
    public var ClientLeaseExpires: DATE_TIME = DATE_TIME(),
    public var OwnerHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
    public var bClientType: UByte = 0u,
    public var AddressState: UByte = 0u,
)

public data class DHCP_CLIENT_INFO_V6(
    public var ClientIpAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(),
    public var ClientDUID: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var AddressType: UInt = 0u,
    public var IAID: UInt = 0u,
    public var ClientName: PWSTR = 0L,
    public var ClientComment: PWSTR = 0L,
    public var ClientValidLeaseExpires: DATE_TIME = DATE_TIME(),
    public var ClientPrefLeaseExpires: DATE_TIME = DATE_TIME(),
    public var OwnerHost: DHCP_HOST_INFO_V6 = DHCP_HOST_INFO_V6(),
)

public data class DHCP_CLIENT_INFO_VQ(
    public var ClientIpAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var ClientHardwareAddress: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
    public var ClientComment: PWSTR = 0L,
    public var ClientLeaseExpires: DATE_TIME = DATE_TIME(),
    public var OwnerHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
    public var bClientType: UByte = 0u,
    public var AddressState: UByte = 0u,
    public var Status: QuarantineStatus = 0,
    public var ProbationEnds: DATE_TIME = DATE_TIME(),
    public var QuarantineCapable: BOOL = 0,
)

public data class DHCP_FAILOVER_RELATIONSHIP(
    public var PrimaryServer: UInt = 0u,
    public var SecondaryServer: UInt = 0u,
    public var Mode: DHCP_FAILOVER_MODE = 0,
    public var ServerType: DHCP_FAILOVER_SERVER = 0,
    public var State: FSM_STATE = 0,
    public var PrevState: FSM_STATE = 0,
    public var Mclt: UInt = 0u,
    public var SafePeriod: UInt = 0u,
    public var RelationshipName: PWSTR = 0L,
    public var PrimaryServerName: PWSTR = 0L,
    public var SecondaryServerName: PWSTR = 0L,
    public var pScopes: Long = 0L,
    public var Percentage: UByte = 0u,
    public var SharedSecret: PWSTR = 0L,
)

public data class DHCP_FAILOVER_RELATIONSHIP_ARRAY(public var NumElements: UInt = 0u, public var pRelationships: Long = 0L)

public data class DHCP_FAILOVER_STATISTICS(
    public var NumAddr: UInt = 0u,
    public var AddrFree: UInt = 0u,
    public var AddrInUse: UInt = 0u,
    public var PartnerAddrFree: UInt = 0u,
    public var ThisAddrFree: UInt = 0u,
    public var PartnerAddrInUse: UInt = 0u,
    public var ThisAddrInUse: UInt = 0u,
)

public data class DHCP_FILTER_ADD_INFO(
    public var AddrPatt: DHCP_ADDR_PATTERN = DHCP_ADDR_PATTERN(),
    public var Comment: PWSTR = 0L,
    public var ListType: DHCP_FILTER_LIST_TYPE = 0,
)

public data class DHCP_FILTER_ENUM_INFO(public var NumElements: UInt = 0u, public var pEnumRecords: Long = 0L)

public data class DHCP_FILTER_GLOBAL_INFO(public var EnforceAllowList: BOOL = 0, public var EnforceDenyList: BOOL = 0)

public data class DHCP_FILTER_RECORD(public var AddrPatt: DHCP_ADDR_PATTERN = DHCP_ADDR_PATTERN(), public var Comment: PWSTR = 0L)

public data class DHCP_HOST_INFO(
    public var IpAddress: UInt = 0u,
    public var NetBiosName: PWSTR = 0L,
    public var HostName: PWSTR = 0L,
)

public data class DHCP_HOST_INFO_V6(
    public var IpAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(),
    public var NetBiosName: PWSTR = 0L,
    public var HostName: PWSTR = 0L,
)

public data class DHCP_IPV6_ADDRESS(public var HighOrderBits: ULong = 0uL, public var LowOrderBits: ULong = 0uL)

public data class DHCP_IP_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_IP_CLUSTER(public var ClusterAddress: UInt = 0u, public var ClusterMask: UInt = 0u)

public data class DHCP_IP_RANGE(public var StartAddress: UInt = 0u, public var EndAddress: UInt = 0u)

public data class DHCP_IP_RANGE_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_IP_RANGE_V6(public var StartAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(), public var EndAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS())

public data class DHCP_IP_RESERVATION(public var ReservedIpAddress: UInt = 0u, public var ReservedForClient: Long = 0L)

public data class DHCP_IP_RESERVATION_INFO(
    public var ReservedIpAddress: UInt = 0u,
    public var ReservedForClient: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ReservedClientName: PWSTR = 0L,
    public var ReservedClientDesc: PWSTR = 0L,
    public var bAllowedClientTypes: UByte = 0u,
    public var fOptionsPresent: UByte = 0u,
)

public data class DHCP_IP_RESERVATION_V4(
    public var ReservedIpAddress: UInt = 0u,
    public var ReservedForClient: Long = 0L,
    public var bAllowedClientTypes: UByte = 0u,
)

public data class DHCP_IP_RESERVATION_V6(
    public var ReservedIpAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(),
    public var ReservedForClient: Long = 0L,
    public var InterfaceId: UInt = 0u,
)

public data class DHCP_MIB_INFO(
    public var Discovers: UInt = 0u,
    public var Offers: UInt = 0u,
    public var Requests: UInt = 0u,
    public var Acks: UInt = 0u,
    public var Naks: UInt = 0u,
    public var Declines: UInt = 0u,
    public var Releases: UInt = 0u,
    public var ServerStartTime: DATE_TIME = DATE_TIME(),
    public var Scopes: UInt = 0u,
    public var ScopeInfo: Long = 0L,
)

public class DHCP_MIB_INFO_V5(
    public var Discovers: UInt = 0u,
    public var Offers: UInt = 0u,
    public var Requests: UInt = 0u,
    public var Acks: UInt = 0u,
    public var Naks: UInt = 0u,
    public var Declines: UInt = 0u,
    public var Releases: UInt = 0u,
    public var ServerStartTime: DATE_TIME = DATE_TIME(),
    public var QtnNumLeases: UInt = 0u,
    public var QtnPctQtnLeases: UInt = 0u,
    public var QtnProbationLeases: UInt = 0u,
    public var QtnNonQtnLeases: UInt = 0u,
    public var QtnExemptLeases: UInt = 0u,
    public var QtnCapableClients: UInt = 0u,
    public var QtnIASErrors: UInt = 0u,
    public var DelayedOffers: UInt = 0u,
    public var ScopesWithDelayedOffers: UInt = 0u,
    public var Scopes: UInt = 0u,
    public var ScopeInfo: Long = 0L,
)

public data class DHCP_MIB_INFO_V6(
    public var Solicits: UInt = 0u,
    public var Advertises: UInt = 0u,
    public var Requests: UInt = 0u,
    public var Renews: UInt = 0u,
    public var Rebinds: UInt = 0u,
    public var Replies: UInt = 0u,
    public var Confirms: UInt = 0u,
    public var Declines: UInt = 0u,
    public var Releases: UInt = 0u,
    public var Informs: UInt = 0u,
    public var ServerStartTime: DATE_TIME = DATE_TIME(),
    public var Scopes: UInt = 0u,
    public var ScopeInfo: Long = 0L,
)

public class DHCP_MIB_INFO_VQ(
    public var Discovers: UInt = 0u,
    public var Offers: UInt = 0u,
    public var Requests: UInt = 0u,
    public var Acks: UInt = 0u,
    public var Naks: UInt = 0u,
    public var Declines: UInt = 0u,
    public var Releases: UInt = 0u,
    public var ServerStartTime: DATE_TIME = DATE_TIME(),
    public var QtnNumLeases: UInt = 0u,
    public var QtnPctQtnLeases: UInt = 0u,
    public var QtnProbationLeases: UInt = 0u,
    public var QtnNonQtnLeases: UInt = 0u,
    public var QtnExemptLeases: UInt = 0u,
    public var QtnCapableClients: UInt = 0u,
    public var QtnIASErrors: UInt = 0u,
    public var Scopes: UInt = 0u,
    public var ScopeInfo: Long = 0L,
)

public data class DHCP_OPTION(
    public var OptionID: UInt = 0u,
    public var OptionName: PWSTR = 0L,
    public var OptionComment: PWSTR = 0L,
    public var DefaultValue: DHCP_OPTION_DATA = DHCP_OPTION_DATA(),
    public var OptionType: DHCP_OPTION_TYPE = 0,
)

public data class DHCP_OPTION_ARRAY(public var NumElements: UInt = 0u, public var Options: Long = 0L)

public data class DHCP_OPTION_DATA(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_OPTION_DATA_ELEMENT(public var OptionType: DHCP_OPTION_DATA_TYPE = 0, public var Element: DHCP_OPTION_DATA_ELEMENT_0 = DHCP_OPTION_DATA_ELEMENT_0())

public data class DHCP_OPTION_DATA_ELEMENT_0(
    public var ByteOption: UByte = 0u,
    public var WordOption: UShort = 0u,
    public var DWordOption: UInt = 0u,
    public var DWordDWordOption: DWORD_DWORD = DWORD_DWORD(),
    public var IpAddressOption: UInt = 0u,
    public var StringDataOption: PWSTR = 0L,
    public var BinaryDataOption: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var EncapsulatedDataOption: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var Ipv6AddressDataOption: PWSTR = 0L,
)

public data class DHCP_OPTION_LIST(public var NumOptions: UInt = 0u, public var Options: Long = 0L)

public data class DHCP_OPTION_SCOPE_INFO(public var ScopeType: DHCP_OPTION_SCOPE_TYPE = 0, public var ScopeInfo: DHCP_OPTION_SCOPE_INFO_0 = DHCP_OPTION_SCOPE_INFO_0())

public data class DHCP_OPTION_SCOPE_INFO_0(
    public var DefaultScopeInfo: Long = 0L,
    public var GlobalScopeInfo: Long = 0L,
    public var SubnetScopeInfo: UInt = 0u,
    public var ReservedScopeInfo: DHCP_RESERVED_SCOPE = DHCP_RESERVED_SCOPE(),
    public var MScopeInfo: PWSTR = 0L,
)

public data class DHCP_OPTION_SCOPE_INFO6(public var ScopeType: DHCP_OPTION_SCOPE_TYPE6 = 0, public var ScopeInfo: DHCP_OPTION_SCOPE_INFO6_0 = DHCP_OPTION_SCOPE_INFO6_0())

public data class DHCP_OPTION_SCOPE_INFO6_0(
    public var DefaultScopeInfo: Long = 0L,
    public var SubnetScopeInfo: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(),
    public var ReservedScopeInfo: DHCP_RESERVED_SCOPE6 = DHCP_RESERVED_SCOPE6(),
)

public data class DHCP_OPTION_VALUE(public var OptionID: UInt = 0u, public var Value: DHCP_OPTION_DATA = DHCP_OPTION_DATA())

public data class DHCP_OPTION_VALUE_ARRAY(public var NumElements: UInt = 0u, public var Values: Long = 0L)

public class DHCP_PERF_STATS(
    public var dwNumPacketsReceived: UInt = 0u,
    public var dwNumPacketsDuplicate: UInt = 0u,
    public var dwNumPacketsExpired: UInt = 0u,
    public var dwNumMilliSecondsProcessed: UInt = 0u,
    public var dwNumPacketsInActiveQueue: UInt = 0u,
    public var dwNumPacketsInPingQueue: UInt = 0u,
    public var dwNumDiscoversReceived: UInt = 0u,
    public var dwNumOffersSent: UInt = 0u,
    public var dwNumRequestsReceived: UInt = 0u,
    public var dwNumInformsReceived: UInt = 0u,
    public var dwNumAcksSent: UInt = 0u,
    public var dwNumNacksSent: UInt = 0u,
    public var dwNumDeclinesReceived: UInt = 0u,
    public var dwNumReleasesReceived: UInt = 0u,
    public var dwNumDelayedOfferInQueue: UInt = 0u,
    public var dwNumPacketsProcessed: UInt = 0u,
    public var dwNumPacketsInQuarWaitingQueue: UInt = 0u,
    public var dwNumPacketsInQuarReadyQueue: UInt = 0u,
    public var dwNumPacketsInQuarDecisionQueue: UInt = 0u,
)

public data class DHCP_POLICY(
    public var PolicyName: PWSTR = 0L,
    public var IsGlobalPolicy: BOOL = 0,
    public var Subnet: UInt = 0u,
    public var ProcessingOrder: UInt = 0u,
    public var Conditions: Long = 0L,
    public var Expressions: Long = 0L,
    public var Ranges: Long = 0L,
    public var Description: PWSTR = 0L,
    public var Enabled: BOOL = 0,
)

public data class DHCP_POLICY_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_POLICY_EX(
    public var PolicyName: PWSTR = 0L,
    public var IsGlobalPolicy: BOOL = 0,
    public var Subnet: UInt = 0u,
    public var ProcessingOrder: UInt = 0u,
    public var Conditions: Long = 0L,
    public var Expressions: Long = 0L,
    public var Ranges: Long = 0L,
    public var Description: PWSTR = 0L,
    public var Enabled: BOOL = 0,
    public var Properties: Long = 0L,
)

public data class DHCP_POLICY_EX_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_POL_COND(
    public var ParentExpr: UInt = 0u,
    public var Type: DHCP_POL_ATTR_TYPE = 0,
    public var OptionID: UInt = 0u,
    public var SubOptionID: UInt = 0u,
    public var VendorName: PWSTR = 0L,
    public var Operator: DHCP_POL_COMPARATOR = 0,
    public var Value: Long = 0L,
    public var ValueLength: UInt = 0u,
)

public data class DHCP_POL_COND_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_POL_EXPR(public var ParentExpr: UInt = 0u, public var Operator: DHCP_POL_LOGIC_OPER = 0)

public data class DHCP_POL_EXPR_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_PROPERTY(
    public var ID: DHCP_PROPERTY_ID = 0,
    public var Type: DHCP_PROPERTY_TYPE = 0,
    public var Value: DHCP_PROPERTY_0 = DHCP_PROPERTY_0(),
)

public data class DHCP_PROPERTY_0(
    public var ByteValue: UByte = 0u,
    public var WordValue: UShort = 0u,
    public var DWordValue: UInt = 0u,
    public var StringValue: PWSTR = 0L,
    public var BinaryValue: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
)

public data class DHCP_PROPERTY_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_RESERVATION_INFO_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_RESERVED_SCOPE(public var ReservedIpAddress: UInt = 0u, public var ReservedIpSubnetAddress: UInt = 0u)

public data class DHCP_RESERVED_SCOPE6(public var ReservedIpAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(), public var ReservedIpSubnetAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS())

public data class DHCP_SCAN_ITEM(public var IpAddress: UInt = 0u, public var ScanFlag: DHCP_SCAN_FLAG = 0)

public data class DHCP_SCAN_LIST(public var NumScanItems: UInt = 0u, public var ScanItems: Long = 0L)

public data class DHCP_SEARCH_INFO(public var SearchType: DHCP_SEARCH_INFO_TYPE = 0, public var SearchInfo: DHCP_SEARCH_INFO_0 = DHCP_SEARCH_INFO_0())

public data class DHCP_SEARCH_INFO_0(
    public var ClientIpAddress: UInt = 0u,
    public var ClientHardwareAddress: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
)

public data class DHCP_SEARCH_INFO_V6(public var SearchType: DHCP_SEARCH_INFO_TYPE_V6 = 0, public var SearchInfo: DHCP_SEARCH_INFO_V6_0 = DHCP_SEARCH_INFO_V6_0())

public data class DHCP_SEARCH_INFO_V6_0(
    public var ClientIpAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(),
    public var ClientDUID: DHCP_BINARY_DATA = DHCP_BINARY_DATA(),
    public var ClientName: PWSTR = 0L,
)

public data class DHCP_SERVER_CONFIG_INFO(
    public var APIProtocolSupport: UInt = 0u,
    public var DatabaseName: PWSTR = 0L,
    public var DatabasePath: PWSTR = 0L,
    public var BackupPath: PWSTR = 0L,
    public var BackupInterval: UInt = 0u,
    public var DatabaseLoggingFlag: UInt = 0u,
    public var RestoreFlag: UInt = 0u,
    public var DatabaseCleanupInterval: UInt = 0u,
    public var DebugFlag: UInt = 0u,
)

public data class DHCP_SERVER_CONFIG_INFO_V4(
    public var APIProtocolSupport: UInt = 0u,
    public var DatabaseName: PWSTR = 0L,
    public var DatabasePath: PWSTR = 0L,
    public var BackupPath: PWSTR = 0L,
    public var BackupInterval: UInt = 0u,
    public var DatabaseLoggingFlag: UInt = 0u,
    public var RestoreFlag: UInt = 0u,
    public var DatabaseCleanupInterval: UInt = 0u,
    public var DebugFlag: UInt = 0u,
    public var dwPingRetries: UInt = 0u,
    public var cbBootTableString: UInt = 0u,
    public var wszBootTableString: PWSTR = 0L,
    public var fAuditLog: BOOL = 0,
)

public data class DHCP_SERVER_CONFIG_INFO_V6(
    public var UnicastFlag: BOOL = 0,
    public var RapidCommitFlag: BOOL = 0,
    public var PreferredLifetime: UInt = 0u,
    public var ValidLifetime: UInt = 0u,
    public var T1: UInt = 0u,
    public var T2: UInt = 0u,
    public var PreferredLifetimeIATA: UInt = 0u,
    public var ValidLifetimeIATA: UInt = 0u,
    public var fAuditLog: BOOL = 0,
)

public data class DHCP_SERVER_CONFIG_INFO_VQ(
    public var APIProtocolSupport: UInt = 0u,
    public var DatabaseName: PWSTR = 0L,
    public var DatabasePath: PWSTR = 0L,
    public var BackupPath: PWSTR = 0L,
    public var BackupInterval: UInt = 0u,
    public var DatabaseLoggingFlag: UInt = 0u,
    public var RestoreFlag: UInt = 0u,
    public var DatabaseCleanupInterval: UInt = 0u,
    public var DebugFlag: UInt = 0u,
    public var dwPingRetries: UInt = 0u,
    public var cbBootTableString: UInt = 0u,
    public var wszBootTableString: PWSTR = 0L,
    public var fAuditLog: BOOL = 0,
    public var QuarantineOn: BOOL = 0,
    public var QuarDefFail: UInt = 0u,
    public var QuarRuntimeStatus: BOOL = 0,
)

public class DHCP_SERVER_OPTIONS(
    public var MessageType: Long = 0L,
    public var SubnetMask: Long = 0L,
    public var RequestedAddress: Long = 0L,
    public var RequestLeaseTime: Long = 0L,
    public var OverlayFields: Long = 0L,
    public var RouterAddress: Long = 0L,
    public var Server: Long = 0L,
    public var ParameterRequestList: Long = 0L,
    public var ParameterRequestListLength: UInt = 0u,
    public var MachineName: PSTR = 0L,
    public var MachineNameLength: UInt = 0u,
    public var ClientHardwareAddressType: UByte = 0u,
    public var ClientHardwareAddressLength: UByte = 0u,
    public var ClientHardwareAddress: Long = 0L,
    public var ClassIdentifier: PSTR = 0L,
    public var ClassIdentifierLength: UInt = 0u,
    public var VendorClass: Long = 0L,
    public var VendorClassLength: UInt = 0u,
    public var DNSFlags: UInt = 0u,
    public var DNSNameLength: UInt = 0u,
    public var DNSName: Long = 0L,
    public var DSDomainNameRequested: Boolean = false,
    public var DSDomainName: PSTR = 0L,
    public var DSDomainNameLen: UInt = 0u,
    public var ScopeId: Long = 0L,
)

public data class DHCP_SERVER_SPECIFIC_STRINGS(public var DefaultVendorClassName: PWSTR = 0L, public var DefaultUserClassName: PWSTR = 0L)

public data class DHCP_SUBNET_ELEMENT_DATA(public var ElementType: DHCP_SUBNET_ELEMENT_TYPE = 0, public var Element: DHCP_SUBNET_ELEMENT_DATA_0 = DHCP_SUBNET_ELEMENT_DATA_0())

public data class DHCP_SUBNET_ELEMENT_DATA_0(
    public var IpRange: Long = 0L,
    public var SecondaryHost: Long = 0L,
    public var ReservedIp: Long = 0L,
    public var ExcludeIpRange: Long = 0L,
    public var IpUsedCluster: Long = 0L,
)

public data class DHCP_SUBNET_ELEMENT_DATA_V4(public var ElementType: DHCP_SUBNET_ELEMENT_TYPE = 0, public var Element: DHCP_SUBNET_ELEMENT_DATA_V4_0 = DHCP_SUBNET_ELEMENT_DATA_V4_0())

public data class DHCP_SUBNET_ELEMENT_DATA_V4_0(
    public var IpRange: Long = 0L,
    public var SecondaryHost: Long = 0L,
    public var ReservedIp: Long = 0L,
    public var ExcludeIpRange: Long = 0L,
    public var IpUsedCluster: Long = 0L,
)

public data class DHCP_SUBNET_ELEMENT_DATA_V5(public var ElementType: DHCP_SUBNET_ELEMENT_TYPE = 0, public var Element: DHCP_SUBNET_ELEMENT_DATA_V5_0 = DHCP_SUBNET_ELEMENT_DATA_V5_0())

public data class DHCP_SUBNET_ELEMENT_DATA_V5_0(
    public var IpRange: Long = 0L,
    public var SecondaryHost: Long = 0L,
    public var ReservedIp: Long = 0L,
    public var ExcludeIpRange: Long = 0L,
    public var IpUsedCluster: Long = 0L,
)

public data class DHCP_SUBNET_ELEMENT_DATA_V6(public var ElementType: DHCP_SUBNET_ELEMENT_TYPE_V6 = 0, public var Element: DHCP_SUBNET_ELEMENT_DATA_V6_0 = DHCP_SUBNET_ELEMENT_DATA_V6_0())

public data class DHCP_SUBNET_ELEMENT_DATA_V6_0(
    public var IpRange: Long = 0L,
    public var ReservedIp: Long = 0L,
    public var ExcludeIpRange: Long = 0L,
)

public data class DHCP_SUBNET_ELEMENT_INFO_ARRAY(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_SUBNET_ELEMENT_INFO_ARRAY_V4(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_SUBNET_ELEMENT_INFO_ARRAY_V5(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_SUBNET_ELEMENT_INFO_ARRAY_V6(public var NumElements: UInt = 0u, public var Elements: Long = 0L)

public data class DHCP_SUBNET_INFO(
    public var SubnetAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var SubnetName: PWSTR = 0L,
    public var SubnetComment: PWSTR = 0L,
    public var PrimaryHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
    public var SubnetState: DHCP_SUBNET_STATE = 0,
)

public data class DHCP_SUBNET_INFO_V6(
    public var SubnetAddress: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(),
    public var Prefix: UInt = 0u,
    public var Preference: UShort = 0u,
    public var SubnetName: PWSTR = 0L,
    public var SubnetComment: PWSTR = 0L,
    public var State: UInt = 0u,
    public var ScopeId: UInt = 0u,
)

public data class DHCP_SUBNET_INFO_VQ(
    public var SubnetAddress: UInt = 0u,
    public var SubnetMask: UInt = 0u,
    public var SubnetName: PWSTR = 0L,
    public var SubnetComment: PWSTR = 0L,
    public var PrimaryHost: DHCP_HOST_INFO = DHCP_HOST_INFO(),
    public var SubnetState: DHCP_SUBNET_STATE = 0,
    public var QuarantineOn: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var Reserved3: Long = 0L,
    public var Reserved4: Long = 0L,
)

public data class DHCP_SUPER_SCOPE_TABLE(public var cEntries: UInt = 0u, public var pEntries: Long = 0L)

public data class DHCP_SUPER_SCOPE_TABLE_ENTRY(
    public var SubnetAddress: UInt = 0u,
    public var SuperScopeNumber: UInt = 0u,
    public var NextInSuperScope: UInt = 0u,
    public var SuperScopeName: PWSTR = 0L,
)

public data class DWORD_DWORD(public var DWord1: UInt = 0u, public var DWord2: UInt = 0u)

public data class SCOPE_MIB_INFO(
    public var Subnet: UInt = 0u,
    public var NumAddressesInuse: UInt = 0u,
    public var NumAddressesFree: UInt = 0u,
    public var NumPendingOffers: UInt = 0u,
)

public data class SCOPE_MIB_INFO_V5(
    public var Subnet: UInt = 0u,
    public var NumAddressesInuse: UInt = 0u,
    public var NumAddressesFree: UInt = 0u,
    public var NumPendingOffers: UInt = 0u,
)

public data class SCOPE_MIB_INFO_V6(
    public var Subnet: DHCP_IPV6_ADDRESS = DHCP_IPV6_ADDRESS(),
    public var NumAddressesInuse: ULong = 0uL,
    public var NumAddressesFree: ULong = 0uL,
    public var NumPendingAdvertises: ULong = 0uL,
)

public data class SCOPE_MIB_INFO_VQ(
    public var Subnet: UInt = 0u,
    public var NumAddressesInuse: UInt = 0u,
    public var NumAddressesFree: UInt = 0u,
    public var NumPendingOffers: UInt = 0u,
    public var QtnNumLeases: UInt = 0u,
    public var QtnPctQtnLeases: UInt = 0u,
    public var QtnProbationLeases: UInt = 0u,
    public var QtnNonQtnLeases: UInt = 0u,
    public var QtnExemptLeases: UInt = 0u,
    public var QtnCapableClients: UInt = 0u,
)
