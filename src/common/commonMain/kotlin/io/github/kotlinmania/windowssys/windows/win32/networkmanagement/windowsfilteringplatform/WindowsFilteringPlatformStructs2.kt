@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.core.Pwstr

public data class IpsecStatistics0(
    public var aggregateSaStatistics: IpsecAggregateSaStatistics0 = IpsecAggregateSaStatistics0(),
    public var espDropPacketStatistics: IpsecEspDropPacketStatistics0 = IpsecEspDropPacketStatistics0(),
    public var ahDropPacketStatistics: IpsecAhDropPacketStatistics0 = IpsecAhDropPacketStatistics0(),
    public var aggregateDropPacketStatistics: IpsecAggregateDropPacketStatistics0 = IpsecAggregateDropPacketStatistics0(),
    public var inboundTrafficStatistics: IpsecTrafficStatistics0 = IpsecTrafficStatistics0(),
    public var outboundTrafficStatistics: IpsecTrafficStatistics0 = IpsecTrafficStatistics0(),
)

public data class IpsecStatistics1(
    public var aggregateSaStatistics: IpsecAggregateSaStatistics0 = IpsecAggregateSaStatistics0(),
    public var espDropPacketStatistics: IpsecEspDropPacketStatistics0 = IpsecEspDropPacketStatistics0(),
    public var ahDropPacketStatistics: IpsecAhDropPacketStatistics0 = IpsecAhDropPacketStatistics0(),
    public var aggregateDropPacketStatistics: IpsecAggregateDropPacketStatistics1 = IpsecAggregateDropPacketStatistics1(),
    public var inboundTrafficStatistics: IpsecTrafficStatistics1 = IpsecTrafficStatistics1(),
    public var outboundTrafficStatistics: IpsecTrafficStatistics1 = IpsecTrafficStatistics1(),
)

public data class IpsecToken0(
    public var type: IpsecTokenType = 0,
    public var principal: IpsecTokenPrincipal = 0,
    public var mode: IpsecTokenMode = 0,
    public var token: ULong = 0uL,
)

public data class IpsecTraffic0(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: IpsecTraffic00 = IpsecTraffic00(),
    public var anonymous2: IpsecTraffic01 = IpsecTraffic01(),
    public var trafficType: IpsecTrafficType = 0,
    public var anonymous3: IpsecTraffic02 = IpsecTraffic02(),
    public var remotePort: UShort = 0u,
)

public data class IpsecTraffic00(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTraffic00) return false
        if (this.localV4Address != other.localV4Address) return false
        if (!this.localV6Address.contentEquals(other.localV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localV4Address.hashCode()
        result = 31 * result + this.localV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTraffic01(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTraffic01) return false
        if (this.remoteV4Address != other.remoteV4Address) return false
        if (!this.remoteV6Address.contentEquals(other.remoteV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteV4Address.hashCode()
        result = 31 * result + this.remoteV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTraffic02(public var ipsecFilterId: ULong = 0uL, public var tunnelPolicyId: ULong = 0uL)

public data class IpsecTraffic1(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: IpsecTraffic10 = IpsecTraffic10(),
    public var anonymous2: IpsecTraffic11 = IpsecTraffic11(),
    public var trafficType: IpsecTrafficType = 0,
    public var anonymous3: IpsecTraffic12 = IpsecTraffic12(),
    public var remotePort: UShort = 0u,
    public var localPort: UShort = 0u,
    public var ipProtocol: UByte = 0u,
    public var localIfLuid: ULong = 0uL,
    public var realIfProfileId: UInt = 0u,
)

public data class IpsecTraffic10(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTraffic10) return false
        if (this.localV4Address != other.localV4Address) return false
        if (!this.localV6Address.contentEquals(other.localV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localV4Address.hashCode()
        result = 31 * result + this.localV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTraffic11(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTraffic11) return false
        if (this.remoteV4Address != other.remoteV4Address) return false
        if (!this.remoteV6Address.contentEquals(other.remoteV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteV4Address.hashCode()
        result = 31 * result + this.remoteV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTraffic12(public var ipsecFilterId: ULong = 0uL, public var tunnelPolicyId: ULong = 0uL)

public data class IpsecTrafficSelector0(
    public var protocolId: UByte = 0u,
    public var portStart: UShort = 0u,
    public var portEnd: UShort = 0u,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: IpsecTrafficSelector00 = IpsecTrafficSelector00(),
    public var anonymous2: IpsecTrafficSelector01 = IpsecTrafficSelector01(),
)

public data class IpsecTrafficSelector00(public var startV4Address: UInt = 0u, public var startV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTrafficSelector00) return false
        if (this.startV4Address != other.startV4Address) return false
        if (!this.startV6Address.contentEquals(other.startV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startV4Address.hashCode()
        result = 31 * result + this.startV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTrafficSelector01(public var endV4Address: UInt = 0u, public var endV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTrafficSelector01) return false
        if (this.endV4Address != other.endV4Address) return false
        if (!this.endV6Address.contentEquals(other.endV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endV4Address.hashCode()
        result = 31 * result + this.endV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTrafficSelectorPolicy0(
    public var flags: UInt = 0u,
    public var numLocalTrafficSelectors: UInt = 0u,
    public var localTrafficSelectors: IpsecTrafficSelector0? = null,
    public var numRemoteTrafficSelectors: UInt = 0u,
    public var remoteTrafficSelectors: IpsecTrafficSelector0? = null,
)

public data class IpsecTrafficStatistics0(
    public var encryptedByteCount: ULong = 0uL,
    public var authenticatedAHByteCount: ULong = 0uL,
    public var authenticatedESPByteCount: ULong = 0uL,
    public var transportByteCount: ULong = 0uL,
    public var tunnelByteCount: ULong = 0uL,
    public var offloadByteCount: ULong = 0uL,
)

public data class IpsecTrafficStatistics1(
    public var encryptedByteCount: ULong = 0uL,
    public var authenticatedAHByteCount: ULong = 0uL,
    public var authenticatedESPByteCount: ULong = 0uL,
    public var transportByteCount: ULong = 0uL,
    public var tunnelByteCount: ULong = 0uL,
    public var offloadByteCount: ULong = 0uL,
    public var totalSuccessfulPackets: ULong = 0uL,
)

public data class IpsecTransportPolicy0(
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: IpsecProposal0? = null,
    public var flags: IpsecPolicyFlag = 0u,
    public var ndAllowClearTimeoutSeconds: UInt = 0u,
    public var saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
    public var emPolicy: IkeextEmPolicy0? = null,
)

public data class IpsecTransportPolicy1(
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: IpsecProposal0? = null,
    public var flags: IpsecPolicyFlag = 0u,
    public var ndAllowClearTimeoutSeconds: UInt = 0u,
    public var saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
    public var emPolicy: IkeextEmPolicy1? = null,
)

public data class IpsecTransportPolicy2(
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: IpsecProposal0? = null,
    public var flags: IpsecPolicyFlag = 0u,
    public var ndAllowClearTimeoutSeconds: UInt = 0u,
    public var saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
    public var emPolicy: IkeextEmPolicy2? = null,
)

public data class IpsecTunnelEndpoint0(public var ipVersion: FwpIpVersion = 0, public var anonymous: IpsecTunnelEndpoint00 = IpsecTunnelEndpoint00())

public data class IpsecTunnelEndpoint00(public var v4Address: UInt = 0u, public var v6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelEndpoint00) return false
        if (this.v4Address != other.v4Address) return false
        if (!this.v6Address.contentEquals(other.v6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.v4Address.hashCode()
        result = 31 * result + this.v6Address.contentHashCode()
        return result
    }
}

public data class IpsecTunnelEndpoints0(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: IpsecTunnelEndpoints00 = IpsecTunnelEndpoints00(),
    public var anonymous2: IpsecTunnelEndpoints01 = IpsecTunnelEndpoints01(),
)

public data class IpsecTunnelEndpoints00(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelEndpoints00) return false
        if (this.localV4Address != other.localV4Address) return false
        if (!this.localV6Address.contentEquals(other.localV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localV4Address.hashCode()
        result = 31 * result + this.localV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTunnelEndpoints01(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelEndpoints01) return false
        if (this.remoteV4Address != other.remoteV4Address) return false
        if (!this.remoteV6Address.contentEquals(other.remoteV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteV4Address.hashCode()
        result = 31 * result + this.remoteV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTunnelEndpoints1(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: IpsecTunnelEndpoints10 = IpsecTunnelEndpoints10(),
    public var anonymous2: IpsecTunnelEndpoints11 = IpsecTunnelEndpoints11(),
    public var localIfLuid: ULong = 0uL,
)

public data class IpsecTunnelEndpoints10(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelEndpoints10) return false
        if (this.localV4Address != other.localV4Address) return false
        if (!this.localV6Address.contentEquals(other.localV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localV4Address.hashCode()
        result = 31 * result + this.localV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTunnelEndpoints11(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelEndpoints11) return false
        if (this.remoteV4Address != other.remoteV4Address) return false
        if (!this.remoteV6Address.contentEquals(other.remoteV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteV4Address.hashCode()
        result = 31 * result + this.remoteV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTunnelEndpoints2(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: IpsecTunnelEndpoints20 = IpsecTunnelEndpoints20(),
    public var anonymous2: IpsecTunnelEndpoints21 = IpsecTunnelEndpoints21(),
    public var localIfLuid: ULong = 0uL,
    public var remoteFqdn: Pwstr = null,
    public var numAddresses: UInt = 0u,
    public var remoteAddresses: IpsecTunnelEndpoint0? = null,
)

public data class IpsecTunnelEndpoints20(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelEndpoints20) return false
        if (this.localV4Address != other.localV4Address) return false
        if (!this.localV6Address.contentEquals(other.localV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localV4Address.hashCode()
        result = 31 * result + this.localV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTunnelEndpoints21(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelEndpoints21) return false
        if (this.remoteV4Address != other.remoteV4Address) return false
        if (!this.remoteV6Address.contentEquals(other.remoteV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteV4Address.hashCode()
        result = 31 * result + this.remoteV6Address.contentHashCode()
        return result
    }
}

public data class IpsecTunnelPolicy0(
    public var flags: IpsecPolicyFlag = 0u,
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: IpsecProposal0? = null,
    public var tunnelEndpoints: IpsecTunnelEndpoints0 = IpsecTunnelEndpoints0(),
    public var saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
    public var emPolicy: IkeextEmPolicy0? = null,
)

public data class IpsecTunnelPolicy1(
    public var flags: IpsecPolicyFlag = 0u,
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: IpsecProposal0? = null,
    public var tunnelEndpoints: IpsecTunnelEndpoints1 = IpsecTunnelEndpoints1(),
    public var saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
    public var emPolicy: IkeextEmPolicy1? = null,
)

public data class IpsecTunnelPolicy2(
    public var flags: IpsecPolicyFlag = 0u,
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: IpsecProposal0? = null,
    public var tunnelEndpoints: IpsecTunnelEndpoints2 = IpsecTunnelEndpoints2(),
    public var saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
    public var emPolicy: IkeextEmPolicy2? = null,
    public var fwdPathSaLifetime: UInt = 0u,
)

public data class IpsecTunnelPolicy3(
    public var flags: UInt = 0u,
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: IpsecProposal0? = null,
    public var tunnelEndpoints: IpsecTunnelEndpoints2 = IpsecTunnelEndpoints2(),
    public var saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
    public var emPolicy: IkeextEmPolicy2? = null,
    public var fwdPathSaLifetime: UInt = 0u,
    public var compartmentId: UInt = 0u,
    public var numTrafficSelectorPolicy: UInt = 0u,
    public var trafficSelectorPolicies: IpsecTrafficSelectorPolicy0? = null,
)

public data class IpsecV4UdpEncapsulation0(public var localUdpEncapPort: UShort = 0u, public var remoteUdpEncapPort: UShort = 0u)

public data class IpsecVirtualIfTunnelInfo0(public var virtualIfTunnelId: ULong = 0uL, public var trafficSelectorId: ULong = 0uL)
