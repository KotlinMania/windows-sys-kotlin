@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class DateTime(public var dwLowDateTime: UInt = 0u, public var dwHighDateTime: UInt = 0u)

public data class DhcpapiParams(
    public var flags: UInt = 0u,
    public var optionId: UInt = 0u,
    public var isVendor: Bool = 0,
    public var data: COpaquePointer? = null,
    public var nBytesData: UInt = 0u,
)

public data class DhcpcapiClassid(
    public var flags: UInt = 0u,
    public var data: COpaquePointer? = null,
    public var nBytesData: UInt = 0u,
)

public data class DhcpcapiParamsArray(public var nParams: UInt = 0u, public var params: DhcpapiParams? = null)

public data class DhcpdsServer(
    public var version: UInt = 0u,
    public var serverName: Pwstr = null,
    public var serverAddress: UInt = 0u,
    public var flags: UInt = 0u,
    public var state: UInt = 0u,
    public var dsLocation: Pwstr = null,
    public var dsLocType: UInt = 0u,
)

public data class DhcpdsServers(
    public var flags: UInt = 0u,
    public var numElements: UInt = 0u,
    public var servers: DhcpdsServer? = null,
)

public class Dhcpv4FailoverClientInfo(
    public var clientIpAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
    public var clientComment: Pwstr = null,
    public var clientLeaseExpires: DateTime = DateTime(),
    public var ownerHost: DhcpHostInfo = DhcpHostInfo(),
    public var bClientType: UByte = 0u,
    public var addressState: UByte = 0u,
    public var status: QuarantineStatus = 0,
    public var probationEnds: DateTime = DateTime(),
    public var quarantineCapable: Bool = 0,
    public var sentPotExpTime: UInt = 0u,
    public var ackPotExpTime: UInt = 0u,
    public var recvPotExpTime: UInt = 0u,
    public var startTime: UInt = 0u,
    public var cltLastTransTime: UInt = 0u,
    public var lastBndUpdTime: UInt = 0u,
    public var bndMsgStatus: UInt = 0u,
    public var policyName: Pwstr = null,
    public var flags: UByte = 0u,
)

public data class Dhcpv4FailoverClientInfoArray(public var numElements: UInt = 0u, public var clients: COpaquePointer? = null)

public class Dhcpv4FailoverClientInfoEx(
    public var clientIpAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
    public var clientComment: Pwstr = null,
    public var clientLeaseExpires: DateTime = DateTime(),
    public var ownerHost: DhcpHostInfo = DhcpHostInfo(),
    public var bClientType: UByte = 0u,
    public var addressState: UByte = 0u,
    public var status: QuarantineStatus = 0,
    public var probationEnds: DateTime = DateTime(),
    public var quarantineCapable: Bool = 0,
    public var sentPotExpTime: UInt = 0u,
    public var ackPotExpTime: UInt = 0u,
    public var recvPotExpTime: UInt = 0u,
    public var startTime: UInt = 0u,
    public var cltLastTransTime: UInt = 0u,
    public var lastBndUpdTime: UInt = 0u,
    public var bndMsgStatus: UInt = 0u,
    public var policyName: Pwstr = null,
    public var flags: UByte = 0u,
    public var addressStateEx: UInt = 0u,
)

public data class Dhcpv6capiClassid(
    public var flags: UInt = 0u,
    public var data: COpaquePointer? = null,
    public var nBytesData: UInt = 0u,
)

public data class Dhcpv6capiParams(
    public var flags: UInt = 0u,
    public var optionId: UInt = 0u,
    public var isVendor: Bool = 0,
    public var data: COpaquePointer? = null,
    public var nBytesData: UInt = 0u,
)

public data class Dhcpv6capiParamsArray(public var nParams: UInt = 0u, public var params: Dhcpv6capiParams? = null)

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
    public var prefixArray: DHCPV6Prefix? = null,
    public var iaid: UInt = 0u,
    public var t1: Long = 0L,
    public var t2: Long = 0L,
    public var maxLeaseExpirationTime: Long = 0L,
    public var lastRenewalTime: Long = 0L,
    public var status: StatusCode = 0,
    public var serverId: COpaquePointer? = null,
    public var serverIdLen: UInt = 0u,
)

public data class Dhcpv6BindElement(
    public var flags: UInt = 0u,
    public var fBoundToDHCPServer: Bool = 0,
    public var adapterPrimaryAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var adapterSubnetAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var ifDescription: Pwstr = null,
    public var ipV6IfIndex: UInt = 0u,
    public var ifIdSize: UInt = 0u,
    public var ifId: COpaquePointer? = null,
)

public data class Dhcpv6BindElementArray(public var numElements: UInt = 0u, public var elements: Dhcpv6BindElement? = null)

public data class Dhcpv6IpArray(public var numElements: UInt = 0u, public var elements: DhcpIpv6Address? = null)

public data class Dhcpv6StatelessParams(public var status: Bool = 0, public var purgeInterval: UInt = 0u)

public data class Dhcpv6StatelessScopeStats(
    public var subnetAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var numStatelessClientsAdded: ULong = 0uL,
    public var numStatelessClientsRemoved: ULong = 0uL,
)

public data class Dhcpv6StatelessStats(public var numScopes: UInt = 0u, public var scopeStats: Dhcpv6StatelessScopeStats? = null)

public data class DhcpAddrPattern(
    public var matchHWType: Bool = 0,
    public var hWType: UByte = 0u,
    public var isWildcard: Bool = 0,
    public var length: UByte = 0u,
    public var pattern: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpAddrPattern) return false
        if (this.matchHWType != other.matchHWType) return false
        if (this.hWType != other.hWType) return false
        if (this.isWildcard != other.isWildcard) return false
        if (this.length != other.length) return false
        if (!this.pattern.contentEquals(other.pattern)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.matchHWType.hashCode()
        result = 31 * result + this.hWType.hashCode()
        result = 31 * result + this.isWildcard.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.pattern.contentHashCode()
        return result
    }
}

public data class DhcpAllOptions(
    public var flags: UInt = 0u,
    public var nonVendorOptions: DhcpOptionArray? = null,
    public var numVendorOptions: UInt = 0u,
    public var vendorOptions: DhcpAllOptions0? = null,
)

public data class DhcpAllOptions0(
    public var option: DhcpOption = DhcpOption(),
    public var vendorName: Pwstr = null,
    public var className: Pwstr = null,
)

public data class DhcpAllOptionValues(
    public var flags: UInt = 0u,
    public var numElements: UInt = 0u,
    public var options: DhcpAllOptionValues0? = null,
)

public data class DhcpAllOptionValues0(
    public var className: Pwstr = null,
    public var vendorName: Pwstr = null,
    public var isVendor: Bool = 0,
    public var optionsArray: DhcpOptionValueArray? = null,
)

public data class DhcpAllOptionValuesPb(
    public var flags: UInt = 0u,
    public var numElements: UInt = 0u,
    public var options: DhcpAllOptionValuesPb0? = null,
)

public data class DhcpAllOptionValuesPb0(
    public var policyName: Pwstr = null,
    public var vendorName: Pwstr = null,
    public var isVendor: Bool = 0,
    public var optionsArray: DhcpOptionValueArray? = null,
)

public data class DhcpAttrib(
    public var dhcpAttribId: UInt = 0u,
    public var dhcpAttribType: UInt = 0u,
    public var anonymous: DhcpAttrib0 = DhcpAttrib0(),
)

public data class DhcpAttrib0(public var dhcpAttribBool: Bool = 0, public var dhcpAttribUlong: UInt = 0u)

public data class DhcpAttribArray(public var numElements: UInt = 0u, public var dhcpAttribs: DhcpAttrib? = null)

public data class DhcpBinaryData(public var dataLength: UInt = 0u, public var data: COpaquePointer? = null)

public data class DhcpBindElement(
    public var flags: UInt = 0u,
    public var fBoundToDHCPServer: Bool = 0,
    public var adapterPrimaryAddress: UInt = 0u,
    public var adapterSubnetAddress: UInt = 0u,
    public var ifDescription: Pwstr = null,
    public var ifIdSize: UInt = 0u,
    public var ifId: COpaquePointer? = null,
)

public data class DhcpBindElementArray(public var numElements: UInt = 0u, public var elements: DhcpBindElement? = null)

public data class DhcpBootpIpRange(
    public var startAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var bootpAllocated: UInt = 0u,
    public var maxBootpAllowed: UInt = 0u,
)

public data class DhcpCalloutTable(
    public var dhcpControlHook: LpdhcpControl = null,
    public var dhcpNewPktHook: LpdhcpNewpkt = null,
    public var dhcpPktDropHook: LpdhcpDropSend = null,
    public var dhcpPktSendHook: LpdhcpDropSend = null,
    public var dhcpAddressDelHook: LpdhcpProb = null,
    public var dhcpAddressOfferHook: LpdhcpGiveAddress = null,
    public var dhcpHandleOptionsHook: LpdhcpHandleOptions = null,
    public var dhcpDeleteClientHook: LpdhcpDeleteClient = null,
    public var dhcpExtensionHook: COpaquePointer? = null,
    public var dhcpReservedHook: COpaquePointer? = null,
)

public data class DhcpClassInfo(
    public var className: Pwstr = null,
    public var classComment: Pwstr = null,
    public var classDataLength: UInt = 0u,
    public var isVendor: Bool = 0,
    public var flags: UInt = 0u,
    public var classData: COpaquePointer? = null,
)

public data class DhcpClassInfoArray(public var numElements: UInt = 0u, public var classes: DhcpClassInfo? = null)

public data class DhcpClassInfoArrayV6(public var numElements: UInt = 0u, public var classes: DhcpClassInfoV6? = null)

public data class DhcpClassInfoV6(
    public var className: Pwstr = null,
    public var classComment: Pwstr = null,
    public var classDataLength: UInt = 0u,
    public var isVendor: Bool = 0,
    public var enterpriseNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var classData: COpaquePointer? = null,
)

public data class DhcpClientFilterStatusInfo(
    public var clientIpAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
    public var clientComment: Pwstr = null,
    public var clientLeaseExpires: DateTime = DateTime(),
    public var ownerHost: DhcpHostInfo = DhcpHostInfo(),
    public var bClientType: UByte = 0u,
    public var addressState: UByte = 0u,
    public var status: QuarantineStatus = 0,
    public var probationEnds: DateTime = DateTime(),
    public var quarantineCapable: Bool = 0,
    public var filterStatus: UInt = 0u,
)

public data class DhcpClientFilterStatusInfoArray(public var numElements: UInt = 0u, public var clients: COpaquePointer? = null)

public data class DhcpClientInfo(
    public var clientIpAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
    public var clientComment: Pwstr = null,
    public var clientLeaseExpires: DateTime = DateTime(),
    public var ownerHost: DhcpHostInfo = DhcpHostInfo(),
)

public data class DhcpClientInfoArray(public var numElements: UInt = 0u, public var clients: COpaquePointer? = null)

public data class DhcpClientInfoArrayV4(public var numElements: UInt = 0u, public var clients: COpaquePointer? = null)

public data class DhcpClientInfoArrayV5(public var numElements: UInt = 0u, public var clients: COpaquePointer? = null)

public data class DhcpClientInfoArrayV6(public var numElements: UInt = 0u, public var clients: COpaquePointer? = null)

public data class DhcpClientInfoArrayVq(public var numElements: UInt = 0u, public var clients: COpaquePointer? = null)

public data class DhcpClientInfoEx(
    public var clientIpAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
    public var clientComment: Pwstr = null,
    public var clientLeaseExpires: DateTime = DateTime(),
    public var ownerHost: DhcpHostInfo = DhcpHostInfo(),
    public var bClientType: UByte = 0u,
    public var addressState: UByte = 0u,
    public var status: QuarantineStatus = 0,
    public var probationEnds: DateTime = DateTime(),
    public var quarantineCapable: Bool = 0,
    public var filterStatus: UInt = 0u,
    public var policyName: Pwstr = null,
    public var properties: DhcpPropertyArray? = null,
)

public data class DhcpClientInfoExArray(public var numElements: UInt = 0u, public var clients: COpaquePointer? = null)

public data class DhcpClientInfoPb(
    public var clientIpAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
    public var clientComment: Pwstr = null,
    public var clientLeaseExpires: DateTime = DateTime(),
    public var ownerHost: DhcpHostInfo = DhcpHostInfo(),
    public var bClientType: UByte = 0u,
    public var addressState: UByte = 0u,
    public var status: QuarantineStatus = 0,
    public var probationEnds: DateTime = DateTime(),
    public var quarantineCapable: Bool = 0,
    public var filterStatus: UInt = 0u,
    public var policyName: Pwstr = null,
)

public data class DhcpClientInfoPbArray(public var numElements: UInt = 0u, public var clients: COpaquePointer? = null)

public data class DhcpClientInfoV4(
    public var clientIpAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
    public var clientComment: Pwstr = null,
    public var clientLeaseExpires: DateTime = DateTime(),
    public var ownerHost: DhcpHostInfo = DhcpHostInfo(),
    public var bClientType: UByte = 0u,
)

public data class DhcpClientInfoV5(
    public var clientIpAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
    public var clientComment: Pwstr = null,
    public var clientLeaseExpires: DateTime = DateTime(),
    public var ownerHost: DhcpHostInfo = DhcpHostInfo(),
    public var bClientType: UByte = 0u,
    public var addressState: UByte = 0u,
)

public data class DhcpClientInfoV6(
    public var clientIpAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var clientDUID: DhcpBinaryData = DhcpBinaryData(),
    public var addressType: UInt = 0u,
    public var iaid: UInt = 0u,
    public var clientName: Pwstr = null,
    public var clientComment: Pwstr = null,
    public var clientValidLeaseExpires: DateTime = DateTime(),
    public var clientPrefLeaseExpires: DateTime = DateTime(),
    public var ownerHost: DhcpHostInfoV6 = DhcpHostInfoV6(),
)

public data class DhcpClientInfoVq(
    public var clientIpAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
    public var clientComment: Pwstr = null,
    public var clientLeaseExpires: DateTime = DateTime(),
    public var ownerHost: DhcpHostInfo = DhcpHostInfo(),
    public var bClientType: UByte = 0u,
    public var addressState: UByte = 0u,
    public var status: QuarantineStatus = 0,
    public var probationEnds: DateTime = DateTime(),
    public var quarantineCapable: Bool = 0,
)

public data class DhcpFailoverRelationship(
    public var primaryServer: UInt = 0u,
    public var secondaryServer: UInt = 0u,
    public var mode: DhcpFailoverMode = 0,
    public var serverType: DhcpFailoverServer = 0,
    public var state: FsmState = 0,
    public var prevState: FsmState = 0,
    public var mclt: UInt = 0u,
    public var safePeriod: UInt = 0u,
    public var relationshipName: Pwstr = null,
    public var primaryServerName: Pwstr = null,
    public var secondaryServerName: Pwstr = null,
    public var pScopes: DhcpIpArray? = null,
    public var percentage: UByte = 0u,
    public var sharedSecret: Pwstr = null,
)

public data class DhcpFailoverRelationshipArray(public var numElements: UInt = 0u, public var pRelationships: DhcpFailoverRelationship? = null)

public data class DhcpFailoverStatistics(
    public var numAddr: UInt = 0u,
    public var addrFree: UInt = 0u,
    public var addrInUse: UInt = 0u,
    public var partnerAddrFree: UInt = 0u,
    public var thisAddrFree: UInt = 0u,
    public var partnerAddrInUse: UInt = 0u,
    public var thisAddrInUse: UInt = 0u,
)

public data class DhcpFilterAddInfo(
    public var addrPatt: DhcpAddrPattern = DhcpAddrPattern(),
    public var comment: Pwstr = null,
    public var listType: DhcpFilterListType = 0,
)

public data class DhcpFilterEnumInfo(public var numElements: UInt = 0u, public var pEnumRecords: DhcpFilterRecord? = null)

public data class DhcpFilterGlobalInfo(public var enforceAllowList: Bool = 0, public var enforceDenyList: Bool = 0)

public data class DhcpFilterRecord(public var addrPatt: DhcpAddrPattern = DhcpAddrPattern(), public var comment: Pwstr = null)

public data class DhcpHostInfo(
    public var ipAddress: UInt = 0u,
    public var netBiosName: Pwstr = null,
    public var hostName: Pwstr = null,
)

public data class DhcpHostInfoV6(
    public var ipAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var netBiosName: Pwstr = null,
    public var hostName: Pwstr = null,
)

public data class DhcpIpv6Address(public var highOrderBits: ULong = 0uL, public var lowOrderBits: ULong = 0uL)

public data class DhcpIpArray(public var numElements: UInt = 0u, public var elements: UInt? = null)

public data class DhcpIpCluster(public var clusterAddress: UInt = 0u, public var clusterMask: UInt = 0u)

public data class DhcpIpRange(public var startAddress: UInt = 0u, public var endAddress: UInt = 0u)

public data class DhcpIpRangeArray(public var numElements: UInt = 0u, public var elements: DhcpIpRange? = null)

public data class DhcpIpRangeV6(public var startAddress: DhcpIpv6Address = DhcpIpv6Address(), public var endAddress: DhcpIpv6Address = DhcpIpv6Address())

public data class DhcpIpReservation(public var reservedIpAddress: UInt = 0u, public var reservedForClient: DhcpBinaryData? = null)

public data class DhcpIpReservationInfo(
    public var reservedIpAddress: UInt = 0u,
    public var reservedForClient: DhcpBinaryData = DhcpBinaryData(),
    public var reservedClientName: Pwstr = null,
    public var reservedClientDesc: Pwstr = null,
    public var bAllowedClientTypes: UByte = 0u,
    public var fOptionsPresent: UByte = 0u,
)

public data class DhcpIpReservationV4(
    public var reservedIpAddress: UInt = 0u,
    public var reservedForClient: DhcpBinaryData? = null,
    public var bAllowedClientTypes: UByte = 0u,
)

public data class DhcpIpReservationV6(
    public var reservedIpAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var reservedForClient: DhcpBinaryData? = null,
    public var interfaceId: UInt = 0u,
)

public data class DhcpMibInfo(
    public var discovers: UInt = 0u,
    public var offers: UInt = 0u,
    public var requests: UInt = 0u,
    public var acks: UInt = 0u,
    public var naks: UInt = 0u,
    public var declines: UInt = 0u,
    public var releases: UInt = 0u,
    public var serverStartTime: DateTime = DateTime(),
    public var scopes: UInt = 0u,
    public var scopeInfo: ScopeMibInfo? = null,
)

public class DhcpMibInfoV5(
    public var discovers: UInt = 0u,
    public var offers: UInt = 0u,
    public var requests: UInt = 0u,
    public var acks: UInt = 0u,
    public var naks: UInt = 0u,
    public var declines: UInt = 0u,
    public var releases: UInt = 0u,
    public var serverStartTime: DateTime = DateTime(),
    public var qtnNumLeases: UInt = 0u,
    public var qtnPctQtnLeases: UInt = 0u,
    public var qtnProbationLeases: UInt = 0u,
    public var qtnNonQtnLeases: UInt = 0u,
    public var qtnExemptLeases: UInt = 0u,
    public var qtnCapableClients: UInt = 0u,
    public var qtnIASErrors: UInt = 0u,
    public var delayedOffers: UInt = 0u,
    public var scopesWithDelayedOffers: UInt = 0u,
    public var scopes: UInt = 0u,
    public var scopeInfo: ScopeMibInfoV5? = null,
)

public data class DhcpMibInfoV6(
    public var solicits: UInt = 0u,
    public var advertises: UInt = 0u,
    public var requests: UInt = 0u,
    public var renews: UInt = 0u,
    public var rebinds: UInt = 0u,
    public var replies: UInt = 0u,
    public var confirms: UInt = 0u,
    public var declines: UInt = 0u,
    public var releases: UInt = 0u,
    public var informs: UInt = 0u,
    public var serverStartTime: DateTime = DateTime(),
    public var scopes: UInt = 0u,
    public var scopeInfo: ScopeMibInfoV6? = null,
)

public class DhcpMibInfoVq(
    public var discovers: UInt = 0u,
    public var offers: UInt = 0u,
    public var requests: UInt = 0u,
    public var acks: UInt = 0u,
    public var naks: UInt = 0u,
    public var declines: UInt = 0u,
    public var releases: UInt = 0u,
    public var serverStartTime: DateTime = DateTime(),
    public var qtnNumLeases: UInt = 0u,
    public var qtnPctQtnLeases: UInt = 0u,
    public var qtnProbationLeases: UInt = 0u,
    public var qtnNonQtnLeases: UInt = 0u,
    public var qtnExemptLeases: UInt = 0u,
    public var qtnCapableClients: UInt = 0u,
    public var qtnIASErrors: UInt = 0u,
    public var scopes: UInt = 0u,
    public var scopeInfo: ScopeMibInfoVq? = null,
)

public data class DhcpOption(
    public var optionID: UInt = 0u,
    public var optionName: Pwstr = null,
    public var optionComment: Pwstr = null,
    public var defaultValue: DhcpOptionData = DhcpOptionData(),
    public var optionType: DhcpOptionType = 0,
)

public data class DhcpOptionArray(public var numElements: UInt = 0u, public var options: DhcpOption? = null)

public data class DhcpOptionData(public var numElements: UInt = 0u, public var elements: DhcpOptionDataElement? = null)

public data class DhcpOptionDataElement(public var optionType: DhcpOptionDataType = 0, public var element: DhcpOptionDataElement0 = DhcpOptionDataElement0())

public data class DhcpOptionDataElement0(
    public var byteOption: UByte = 0u,
    public var wordOption: UShort = 0u,
    public var dWordOption: UInt = 0u,
    public var dWordDWordOption: DwordDword = DwordDword(),
    public var ipAddressOption: UInt = 0u,
    public var stringDataOption: Pwstr = null,
    public var binaryDataOption: DhcpBinaryData = DhcpBinaryData(),
    public var encapsulatedDataOption: DhcpBinaryData = DhcpBinaryData(),
    public var ipv6AddressDataOption: Pwstr = null,
)

public data class DhcpOptionList(public var numOptions: UInt = 0u, public var options: DhcpOptionValue? = null)

public data class DhcpOptionScopeInfo(public var scopeType: DhcpOptionScopeType = 0, public var scopeInfo: DhcpOptionScopeInfo0 = DhcpOptionScopeInfo0())

public data class DhcpOptionScopeInfo0(
    public var defaultScopeInfo: COpaquePointer? = null,
    public var globalScopeInfo: COpaquePointer? = null,
    public var subnetScopeInfo: UInt = 0u,
    public var reservedScopeInfo: DhcpReservedScope = DhcpReservedScope(),
    public var mScopeInfo: Pwstr = null,
)

public data class DhcpOptionScopeInfo6(public var scopeType: DhcpOptionScopeType6 = 0, public var scopeInfo: DhcpOptionScopeInfo60 = DhcpOptionScopeInfo60())

public data class DhcpOptionScopeInfo60(
    public var defaultScopeInfo: COpaquePointer? = null,
    public var subnetScopeInfo: DhcpIpv6Address = DhcpIpv6Address(),
    public var reservedScopeInfo: DhcpReservedScope6 = DhcpReservedScope6(),
)

public data class DhcpOptionValue(public var optionID: UInt = 0u, public var value: DhcpOptionData = DhcpOptionData())

public data class DhcpOptionValueArray(public var numElements: UInt = 0u, public var values: DhcpOptionValue? = null)

public class DhcpPerfStats(
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

public data class DhcpPolicy(
    public var policyName: Pwstr = null,
    public var isGlobalPolicy: Bool = 0,
    public var subnet: UInt = 0u,
    public var processingOrder: UInt = 0u,
    public var conditions: DhcpPolCondArray? = null,
    public var expressions: DhcpPolExprArray? = null,
    public var ranges: DhcpIpRangeArray? = null,
    public var description: Pwstr = null,
    public var enabled: Bool = 0,
)

public data class DhcpPolicyArray(public var numElements: UInt = 0u, public var elements: DhcpPolicy? = null)

public data class DhcpPolicyEx(
    public var policyName: Pwstr = null,
    public var isGlobalPolicy: Bool = 0,
    public var subnet: UInt = 0u,
    public var processingOrder: UInt = 0u,
    public var conditions: DhcpPolCondArray? = null,
    public var expressions: DhcpPolExprArray? = null,
    public var ranges: DhcpIpRangeArray? = null,
    public var description: Pwstr = null,
    public var enabled: Bool = 0,
    public var properties: DhcpPropertyArray? = null,
)

public data class DhcpPolicyExArray(public var numElements: UInt = 0u, public var elements: DhcpPolicyEx? = null)

public data class DhcpPolCond(
    public var parentExpr: UInt = 0u,
    public var type: DhcpPolAttrType = 0,
    public var optionID: UInt = 0u,
    public var subOptionID: UInt = 0u,
    public var vendorName: Pwstr = null,
    public var operator: DhcpPolComparator = 0,
    public var value: COpaquePointer? = null,
    public var valueLength: UInt = 0u,
)

public data class DhcpPolCondArray(public var numElements: UInt = 0u, public var elements: DhcpPolCond? = null)

public data class DhcpPolExpr(public var parentExpr: UInt = 0u, public var operator: DhcpPolLogicOper = 0)

public data class DhcpPolExprArray(public var numElements: UInt = 0u, public var elements: DhcpPolExpr? = null)

public data class DhcpProperty(
    public var id: DhcpPropertyId = 0,
    public var type: DhcpPropertyType = 0,
    public var value: DhcpProperty0 = DhcpProperty0(),
)

public data class DhcpProperty0(
    public var byteValue: UByte = 0u,
    public var wordValue: UShort = 0u,
    public var dWordValue: UInt = 0u,
    public var stringValue: Pwstr = null,
    public var binaryValue: DhcpBinaryData = DhcpBinaryData(),
)

public data class DhcpPropertyArray(public var numElements: UInt = 0u, public var elements: DhcpProperty? = null)

public data class DhcpReservationInfoArray(public var numElements: UInt = 0u, public var elements: COpaquePointer? = null)

public data class DhcpReservedScope(public var reservedIpAddress: UInt = 0u, public var reservedIpSubnetAddress: UInt = 0u)

public data class DhcpReservedScope6(public var reservedIpAddress: DhcpIpv6Address = DhcpIpv6Address(), public var reservedIpSubnetAddress: DhcpIpv6Address = DhcpIpv6Address())

public data class DhcpScanItem(public var ipAddress: UInt = 0u, public var scanFlag: DhcpScanFlag = 0)

public data class DhcpScanList(public var numScanItems: UInt = 0u, public var scanItems: DhcpScanItem? = null)

public data class DhcpSearchInfo(public var searchType: DhcpSearchInfoType = 0, public var searchInfo: DhcpSearchInfo0 = DhcpSearchInfo0())

public data class DhcpSearchInfo0(
    public var clientIpAddress: UInt = 0u,
    public var clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
)

public data class DhcpSearchInfoV6(public var searchType: DhcpSearchInfoTypeV6 = 0, public var searchInfo: DhcpSearchInfoV60 = DhcpSearchInfoV60())

public data class DhcpSearchInfoV60(
    public var clientIpAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var clientDUID: DhcpBinaryData = DhcpBinaryData(),
    public var clientName: Pwstr = null,
)

public data class DhcpServerConfigInfo(
    public var aPIProtocolSupport: UInt = 0u,
    public var databaseName: Pwstr = null,
    public var databasePath: Pwstr = null,
    public var backupPath: Pwstr = null,
    public var backupInterval: UInt = 0u,
    public var databaseLoggingFlag: UInt = 0u,
    public var restoreFlag: UInt = 0u,
    public var databaseCleanupInterval: UInt = 0u,
    public var debugFlag: UInt = 0u,
)

public data class DhcpServerConfigInfoV4(
    public var aPIProtocolSupport: UInt = 0u,
    public var databaseName: Pwstr = null,
    public var databasePath: Pwstr = null,
    public var backupPath: Pwstr = null,
    public var backupInterval: UInt = 0u,
    public var databaseLoggingFlag: UInt = 0u,
    public var restoreFlag: UInt = 0u,
    public var databaseCleanupInterval: UInt = 0u,
    public var debugFlag: UInt = 0u,
    public var dwPingRetries: UInt = 0u,
    public var cbBootTableString: UInt = 0u,
    public var wszBootTableString: Pwstr = null,
    public var fAuditLog: Bool = 0,
)

public data class DhcpServerConfigInfoV6(
    public var unicastFlag: Bool = 0,
    public var rapidCommitFlag: Bool = 0,
    public var preferredLifetime: UInt = 0u,
    public var validLifetime: UInt = 0u,
    public var t1: UInt = 0u,
    public var t2: UInt = 0u,
    public var preferredLifetimeIATA: UInt = 0u,
    public var validLifetimeIATA: UInt = 0u,
    public var fAuditLog: Bool = 0,
)

public data class DhcpServerConfigInfoVq(
    public var aPIProtocolSupport: UInt = 0u,
    public var databaseName: Pwstr = null,
    public var databasePath: Pwstr = null,
    public var backupPath: Pwstr = null,
    public var backupInterval: UInt = 0u,
    public var databaseLoggingFlag: UInt = 0u,
    public var restoreFlag: UInt = 0u,
    public var databaseCleanupInterval: UInt = 0u,
    public var debugFlag: UInt = 0u,
    public var dwPingRetries: UInt = 0u,
    public var cbBootTableString: UInt = 0u,
    public var wszBootTableString: Pwstr = null,
    public var fAuditLog: Bool = 0,
    public var quarantineOn: Bool = 0,
    public var quarDefFail: UInt = 0u,
    public var quarRuntimeStatus: Bool = 0,
)

public class DhcpServerOptions(
    public var messageType: COpaquePointer? = null,
    public var subnetMask: UInt? = null,
    public var requestedAddress: UInt? = null,
    public var requestLeaseTime: UInt? = null,
    public var overlayFields: COpaquePointer? = null,
    public var routerAddress: UInt? = null,
    public var server: UInt? = null,
    public var parameterRequestList: COpaquePointer? = null,
    public var parameterRequestListLength: UInt = 0u,
    public var machineName: Pstr = null,
    public var machineNameLength: UInt = 0u,
    public var clientHardwareAddressType: UByte = 0u,
    public var clientHardwareAddressLength: UByte = 0u,
    public var clientHardwareAddress: COpaquePointer? = null,
    public var classIdentifier: Pstr = null,
    public var classIdentifierLength: UInt = 0u,
    public var vendorClass: COpaquePointer? = null,
    public var vendorClassLength: UInt = 0u,
    public var dNSFlags: UInt = 0u,
    public var dNSNameLength: UInt = 0u,
    public var dNSName: COpaquePointer? = null,
    public var dSDomainNameRequested: Boolean = false,
    public var dSDomainName: Pstr = null,
    public var dSDomainNameLen: UInt = 0u,
    public var scopeId: UInt? = null,
)

public data class DhcpServerSpecificStrings(public var defaultVendorClassName: Pwstr = null, public var defaultUserClassName: Pwstr = null)

public data class DhcpSubnetElementData(public var elementType: DhcpSubnetElementType = 0, public var element: DhcpSubnetElementData0 = DhcpSubnetElementData0())

public data class DhcpSubnetElementData0(
    public var ipRange: DhcpIpRange? = null,
    public var secondaryHost: DhcpHostInfo? = null,
    public var reservedIp: DhcpIpReservation? = null,
    public var excludeIpRange: DhcpIpRange? = null,
    public var ipUsedCluster: DhcpIpCluster? = null,
)

public data class DhcpSubnetElementDataV4(public var elementType: DhcpSubnetElementType = 0, public var element: DhcpSubnetElementDataV40 = DhcpSubnetElementDataV40())

public data class DhcpSubnetElementDataV40(
    public var ipRange: DhcpIpRange? = null,
    public var secondaryHost: DhcpHostInfo? = null,
    public var reservedIp: DhcpIpReservationV4? = null,
    public var excludeIpRange: DhcpIpRange? = null,
    public var ipUsedCluster: DhcpIpCluster? = null,
)

public data class DhcpSubnetElementDataV5(public var elementType: DhcpSubnetElementType = 0, public var element: DhcpSubnetElementDataV50 = DhcpSubnetElementDataV50())

public data class DhcpSubnetElementDataV50(
    public var ipRange: DhcpBootpIpRange? = null,
    public var secondaryHost: DhcpHostInfo? = null,
    public var reservedIp: DhcpIpReservationV4? = null,
    public var excludeIpRange: DhcpIpRange? = null,
    public var ipUsedCluster: DhcpIpCluster? = null,
)

public data class DhcpSubnetElementDataV6(public var elementType: DhcpSubnetElementTypeV6 = 0, public var element: DhcpSubnetElementDataV60 = DhcpSubnetElementDataV60())

public data class DhcpSubnetElementDataV60(
    public var ipRange: DhcpIpRangeV6? = null,
    public var reservedIp: DhcpIpReservationV6? = null,
    public var excludeIpRange: DhcpIpRangeV6? = null,
)

public data class DhcpSubnetElementInfoArray(public var numElements: UInt = 0u, public var elements: DhcpSubnetElementData? = null)

public data class DhcpSubnetElementInfoArrayV4(public var numElements: UInt = 0u, public var elements: DhcpSubnetElementDataV4? = null)

public data class DhcpSubnetElementInfoArrayV5(public var numElements: UInt = 0u, public var elements: DhcpSubnetElementDataV5? = null)

public data class DhcpSubnetElementInfoArrayV6(public var numElements: UInt = 0u, public var elements: DhcpSubnetElementDataV6? = null)

public data class DhcpSubnetInfo(
    public var subnetAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var subnetName: Pwstr = null,
    public var subnetComment: Pwstr = null,
    public var primaryHost: DhcpHostInfo = DhcpHostInfo(),
    public var subnetState: DhcpSubnetState = 0,
)

public data class DhcpSubnetInfoV6(
    public var subnetAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var prefix: UInt = 0u,
    public var preference: UShort = 0u,
    public var subnetName: Pwstr = null,
    public var subnetComment: Pwstr = null,
    public var state: UInt = 0u,
    public var scopeId: UInt = 0u,
)

public data class DhcpSubnetInfoVq(
    public var subnetAddress: UInt = 0u,
    public var subnetMask: UInt = 0u,
    public var subnetName: Pwstr = null,
    public var subnetComment: Pwstr = null,
    public var primaryHost: DhcpHostInfo = DhcpHostInfo(),
    public var subnetState: DhcpSubnetState = 0,
    public var quarantineOn: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var reserved3: Long = 0L,
    public var reserved4: Long = 0L,
)

public data class DhcpSuperScopeTable(public var cEntries: UInt = 0u, public var pEntries: DhcpSuperScopeTableEntry? = null)

public data class DhcpSuperScopeTableEntry(
    public var subnetAddress: UInt = 0u,
    public var superScopeNumber: UInt = 0u,
    public var nextInSuperScope: UInt = 0u,
    public var superScopeName: Pwstr = null,
)

public data class DwordDword(public var dWord1: UInt = 0u, public var dWord2: UInt = 0u)

public data class ScopeMibInfo(
    public var subnet: UInt = 0u,
    public var numAddressesInuse: UInt = 0u,
    public var numAddressesFree: UInt = 0u,
    public var numPendingOffers: UInt = 0u,
)

public data class ScopeMibInfoV5(
    public var subnet: UInt = 0u,
    public var numAddressesInuse: UInt = 0u,
    public var numAddressesFree: UInt = 0u,
    public var numPendingOffers: UInt = 0u,
)

public data class ScopeMibInfoV6(
    public var subnet: DhcpIpv6Address = DhcpIpv6Address(),
    public var numAddressesInuse: ULong = 0uL,
    public var numAddressesFree: ULong = 0uL,
    public var numPendingAdvertises: ULong = 0uL,
)

public data class ScopeMibInfoVq(
    public var subnet: UInt = 0u,
    public var numAddressesInuse: UInt = 0u,
    public var numAddressesFree: UInt = 0u,
    public var numPendingOffers: UInt = 0u,
    public var qtnNumLeases: UInt = 0u,
    public var qtnPctQtnLeases: UInt = 0u,
    public var qtnProbationLeases: UInt = 0u,
    public var qtnNonQtnLeases: UInt = 0u,
    public var qtnExemptLeases: UInt = 0u,
    public var qtnCapableClients: UInt = 0u,
)
