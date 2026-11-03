@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.core.PWSTR

public data class IPSEC_STATISTICS0(
    public var aggregateSaStatistics: IPSEC_AGGREGATE_SA_STATISTICS0 = IPSEC_AGGREGATE_SA_STATISTICS0(),
    public var espDropPacketStatistics: IPSEC_ESP_DROP_PACKET_STATISTICS0 = IPSEC_ESP_DROP_PACKET_STATISTICS0(),
    public var ahDropPacketStatistics: IPSEC_AH_DROP_PACKET_STATISTICS0 = IPSEC_AH_DROP_PACKET_STATISTICS0(),
    public var aggregateDropPacketStatistics: IPSEC_AGGREGATE_DROP_PACKET_STATISTICS0 = IPSEC_AGGREGATE_DROP_PACKET_STATISTICS0(),
    public var inboundTrafficStatistics: IPSEC_TRAFFIC_STATISTICS0 = IPSEC_TRAFFIC_STATISTICS0(),
    public var outboundTrafficStatistics: IPSEC_TRAFFIC_STATISTICS0 = IPSEC_TRAFFIC_STATISTICS0(),
)

public data class IPSEC_STATISTICS1(
    public var aggregateSaStatistics: IPSEC_AGGREGATE_SA_STATISTICS0 = IPSEC_AGGREGATE_SA_STATISTICS0(),
    public var espDropPacketStatistics: IPSEC_ESP_DROP_PACKET_STATISTICS0 = IPSEC_ESP_DROP_PACKET_STATISTICS0(),
    public var ahDropPacketStatistics: IPSEC_AH_DROP_PACKET_STATISTICS0 = IPSEC_AH_DROP_PACKET_STATISTICS0(),
    public var aggregateDropPacketStatistics: IPSEC_AGGREGATE_DROP_PACKET_STATISTICS1 = IPSEC_AGGREGATE_DROP_PACKET_STATISTICS1(),
    public var inboundTrafficStatistics: IPSEC_TRAFFIC_STATISTICS1 = IPSEC_TRAFFIC_STATISTICS1(),
    public var outboundTrafficStatistics: IPSEC_TRAFFIC_STATISTICS1 = IPSEC_TRAFFIC_STATISTICS1(),
)

public data class IPSEC_TOKEN0(
    public var type: IPSEC_TOKEN_TYPE = 0,
    public var principal: IPSEC_TOKEN_PRINCIPAL = 0,
    public var mode: IPSEC_TOKEN_MODE = 0,
    public var token: ULong = 0uL,
)

public data class IPSEC_TRAFFIC0(
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous1: IPSEC_TRAFFIC0_0 = IPSEC_TRAFFIC0_0(),
    public var Anonymous2: IPSEC_TRAFFIC0_1 = IPSEC_TRAFFIC0_1(),
    public var trafficType: IPSEC_TRAFFIC_TYPE = 0,
    public var Anonymous3: IPSEC_TRAFFIC0_2 = IPSEC_TRAFFIC0_2(),
    public var remotePort: UShort = 0u,
)

public data class IPSEC_TRAFFIC0_0(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TRAFFIC0_0) return false
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

public data class IPSEC_TRAFFIC0_1(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TRAFFIC0_1) return false
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

public data class IPSEC_TRAFFIC0_2(public var ipsecFilterId: ULong = 0uL, public var tunnelPolicyId: ULong = 0uL)

public data class IPSEC_TRAFFIC1(
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous1: IPSEC_TRAFFIC1_0 = IPSEC_TRAFFIC1_0(),
    public var Anonymous2: IPSEC_TRAFFIC1_1 = IPSEC_TRAFFIC1_1(),
    public var trafficType: IPSEC_TRAFFIC_TYPE = 0,
    public var Anonymous3: IPSEC_TRAFFIC1_2 = IPSEC_TRAFFIC1_2(),
    public var remotePort: UShort = 0u,
    public var localPort: UShort = 0u,
    public var ipProtocol: UByte = 0u,
    public var localIfLuid: ULong = 0uL,
    public var realIfProfileId: UInt = 0u,
)

public data class IPSEC_TRAFFIC1_0(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TRAFFIC1_0) return false
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

public data class IPSEC_TRAFFIC1_1(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TRAFFIC1_1) return false
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

public data class IPSEC_TRAFFIC1_2(public var ipsecFilterId: ULong = 0uL, public var tunnelPolicyId: ULong = 0uL)

public data class IPSEC_TRAFFIC_SELECTOR0(
    public var protocolId: UByte = 0u,
    public var portStart: UShort = 0u,
    public var portEnd: UShort = 0u,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous1: IPSEC_TRAFFIC_SELECTOR0_0 = IPSEC_TRAFFIC_SELECTOR0_0(),
    public var Anonymous2: IPSEC_TRAFFIC_SELECTOR0_1 = IPSEC_TRAFFIC_SELECTOR0_1(),
)

public data class IPSEC_TRAFFIC_SELECTOR0_0(public var startV4Address: UInt = 0u, public var startV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TRAFFIC_SELECTOR0_0) return false
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

public data class IPSEC_TRAFFIC_SELECTOR0_1(public var endV4Address: UInt = 0u, public var endV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TRAFFIC_SELECTOR0_1) return false
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

public data class IPSEC_TRAFFIC_SELECTOR_POLICY0(
    public var flags: UInt = 0u,
    public var numLocalTrafficSelectors: UInt = 0u,
    public var localTrafficSelectors: Long = 0L,
    public var numRemoteTrafficSelectors: UInt = 0u,
    public var remoteTrafficSelectors: Long = 0L,
)

public data class IPSEC_TRAFFIC_STATISTICS0(
    public var encryptedByteCount: ULong = 0uL,
    public var authenticatedAHByteCount: ULong = 0uL,
    public var authenticatedESPByteCount: ULong = 0uL,
    public var transportByteCount: ULong = 0uL,
    public var tunnelByteCount: ULong = 0uL,
    public var offloadByteCount: ULong = 0uL,
)

public data class IPSEC_TRAFFIC_STATISTICS1(
    public var encryptedByteCount: ULong = 0uL,
    public var authenticatedAHByteCount: ULong = 0uL,
    public var authenticatedESPByteCount: ULong = 0uL,
    public var transportByteCount: ULong = 0uL,
    public var tunnelByteCount: ULong = 0uL,
    public var offloadByteCount: ULong = 0uL,
    public var totalSuccessfulPackets: ULong = 0uL,
)

public data class IPSEC_TRANSPORT_POLICY0(
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: Long = 0L,
    public var flags: IPSEC_POLICY_FLAG = 0u,
    public var ndAllowClearTimeoutSeconds: UInt = 0u,
    public var saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0 = IPSEC_SA_IDLE_TIMEOUT0(),
    public var emPolicy: Long = 0L,
)

public data class IPSEC_TRANSPORT_POLICY1(
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: Long = 0L,
    public var flags: IPSEC_POLICY_FLAG = 0u,
    public var ndAllowClearTimeoutSeconds: UInt = 0u,
    public var saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0 = IPSEC_SA_IDLE_TIMEOUT0(),
    public var emPolicy: Long = 0L,
)

public data class IPSEC_TRANSPORT_POLICY2(
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: Long = 0L,
    public var flags: IPSEC_POLICY_FLAG = 0u,
    public var ndAllowClearTimeoutSeconds: UInt = 0u,
    public var saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0 = IPSEC_SA_IDLE_TIMEOUT0(),
    public var emPolicy: Long = 0L,
)

public data class IPSEC_TUNNEL_ENDPOINT0(public var ipVersion: FWP_IP_VERSION = 0, public var Anonymous: IPSEC_TUNNEL_ENDPOINT0_0 = IPSEC_TUNNEL_ENDPOINT0_0())

public data class IPSEC_TUNNEL_ENDPOINT0_0(public var v4Address: UInt = 0u, public var v6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TUNNEL_ENDPOINT0_0) return false
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

public data class IPSEC_TUNNEL_ENDPOINTS0(
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous1: IPSEC_TUNNEL_ENDPOINTS0_0 = IPSEC_TUNNEL_ENDPOINTS0_0(),
    public var Anonymous2: IPSEC_TUNNEL_ENDPOINTS0_1 = IPSEC_TUNNEL_ENDPOINTS0_1(),
)

public data class IPSEC_TUNNEL_ENDPOINTS0_0(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TUNNEL_ENDPOINTS0_0) return false
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

public data class IPSEC_TUNNEL_ENDPOINTS0_1(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TUNNEL_ENDPOINTS0_1) return false
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

public data class IPSEC_TUNNEL_ENDPOINTS1(
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous1: IPSEC_TUNNEL_ENDPOINTS1_0 = IPSEC_TUNNEL_ENDPOINTS1_0(),
    public var Anonymous2: IPSEC_TUNNEL_ENDPOINTS1_1 = IPSEC_TUNNEL_ENDPOINTS1_1(),
    public var localIfLuid: ULong = 0uL,
)

public data class IPSEC_TUNNEL_ENDPOINTS1_0(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TUNNEL_ENDPOINTS1_0) return false
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

public data class IPSEC_TUNNEL_ENDPOINTS1_1(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TUNNEL_ENDPOINTS1_1) return false
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

public data class IPSEC_TUNNEL_ENDPOINTS2(
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous1: IPSEC_TUNNEL_ENDPOINTS2_0 = IPSEC_TUNNEL_ENDPOINTS2_0(),
    public var Anonymous2: IPSEC_TUNNEL_ENDPOINTS2_1 = IPSEC_TUNNEL_ENDPOINTS2_1(),
    public var localIfLuid: ULong = 0uL,
    public var remoteFqdn: PWSTR = 0L,
    public var numAddresses: UInt = 0u,
    public var remoteAddresses: Long = 0L,
)

public data class IPSEC_TUNNEL_ENDPOINTS2_0(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TUNNEL_ENDPOINTS2_0) return false
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

public data class IPSEC_TUNNEL_ENDPOINTS2_1(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_TUNNEL_ENDPOINTS2_1) return false
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

public data class IPSEC_TUNNEL_POLICY0(
    public var flags: IPSEC_POLICY_FLAG = 0u,
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: Long = 0L,
    public var tunnelEndpoints: IPSEC_TUNNEL_ENDPOINTS0 = IPSEC_TUNNEL_ENDPOINTS0(),
    public var saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0 = IPSEC_SA_IDLE_TIMEOUT0(),
    public var emPolicy: Long = 0L,
)

public data class IPSEC_TUNNEL_POLICY1(
    public var flags: IPSEC_POLICY_FLAG = 0u,
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: Long = 0L,
    public var tunnelEndpoints: IPSEC_TUNNEL_ENDPOINTS1 = IPSEC_TUNNEL_ENDPOINTS1(),
    public var saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0 = IPSEC_SA_IDLE_TIMEOUT0(),
    public var emPolicy: Long = 0L,
)

public data class IPSEC_TUNNEL_POLICY2(
    public var flags: IPSEC_POLICY_FLAG = 0u,
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: Long = 0L,
    public var tunnelEndpoints: IPSEC_TUNNEL_ENDPOINTS2 = IPSEC_TUNNEL_ENDPOINTS2(),
    public var saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0 = IPSEC_SA_IDLE_TIMEOUT0(),
    public var emPolicy: Long = 0L,
    public var fwdPathSaLifetime: UInt = 0u,
)

public data class IPSEC_TUNNEL_POLICY3(
    public var flags: UInt = 0u,
    public var numIpsecProposals: UInt = 0u,
    public var ipsecProposals: Long = 0L,
    public var tunnelEndpoints: IPSEC_TUNNEL_ENDPOINTS2 = IPSEC_TUNNEL_ENDPOINTS2(),
    public var saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0 = IPSEC_SA_IDLE_TIMEOUT0(),
    public var emPolicy: Long = 0L,
    public var fwdPathSaLifetime: UInt = 0u,
    public var compartmentId: UInt = 0u,
    public var numTrafficSelectorPolicy: UInt = 0u,
    public var trafficSelectorPolicies: Long = 0L,
)

public data class IPSEC_V4_UDP_ENCAPSULATION0(public var localUdpEncapPort: UShort = 0u, public var remoteUdpEncapPort: UShort = 0u)

public data class IPSEC_VIRTUAL_IF_TUNNEL_INFO0(public var virtualIfTunnelId: ULong = 0uL, public var trafficSelectorId: ULong = 0uL)
