@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class IpsecStatistics0(
    public var aggregateSaStatistics: IpsecAggregateSaStatistics0 = IpsecAggregateSaStatistics0(),
    public var espDropPacketStatistics: IpsecEspDropPacketStatistics0 = IpsecEspDropPacketStatistics0(),
    public var ahDropPacketStatistics: IpsecAhDropPacketStatistics0 = IpsecAhDropPacketStatistics0(),
    public var aggregateDropPacketStatistics: IpsecAggregateDropPacketStatistics0 = IpsecAggregateDropPacketStatistics0(),
    public var inboundTrafficStatistics: IpsecTrafficStatistics0 = IpsecTrafficStatistics0(),
    public var outboundTrafficStatistics: IpsecTrafficStatistics0 = IpsecTrafficStatistics0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecStatistics0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 200L
                override fun readNative(addr: Long): IpsecStatistics0 =
                    IpsecStatistics0(
                        (IpsecAggregateSaStatistics0.typeLayout()).readNative(addr),
                        (IpsecEspDropPacketStatistics0.typeLayout()).readNative(addr + 28L),
                        (IpsecAhDropPacketStatistics0.typeLayout()).readNative(addr + 48L),
                        (IpsecAggregateDropPacketStatistics0.typeLayout()).readNative(addr + 64L),
                        (IpsecTrafficStatistics0.typeLayout()).readNative(addr + 104L),
                        (IpsecTrafficStatistics0.typeLayout()).readNative(addr + 152L),
                    )
                override fun writeNative(addr: Long, value: IpsecStatistics0) {
                    (IpsecAggregateSaStatistics0.typeLayout()).writeNative(addr, value.aggregateSaStatistics)
                    (IpsecEspDropPacketStatistics0.typeLayout()).writeNative(addr + 28L, value.espDropPacketStatistics)
                    (IpsecAhDropPacketStatistics0.typeLayout()).writeNative(addr + 48L, value.ahDropPacketStatistics)
                    (IpsecAggregateDropPacketStatistics0.typeLayout()).writeNative(addr + 64L, value.aggregateDropPacketStatistics)
                    (IpsecTrafficStatistics0.typeLayout()).writeNative(addr + 104L, value.inboundTrafficStatistics)
                    (IpsecTrafficStatistics0.typeLayout()).writeNative(addr + 152L, value.outboundTrafficStatistics)
                }
            }
    }
}

public data class IpsecStatistics1(
    public var aggregateSaStatistics: IpsecAggregateSaStatistics0 = IpsecAggregateSaStatistics0(),
    public var espDropPacketStatistics: IpsecEspDropPacketStatistics0 = IpsecEspDropPacketStatistics0(),
    public var ahDropPacketStatistics: IpsecAhDropPacketStatistics0 = IpsecAhDropPacketStatistics0(),
    public var aggregateDropPacketStatistics: IpsecAggregateDropPacketStatistics1 = IpsecAggregateDropPacketStatistics1(),
    public var inboundTrafficStatistics: IpsecTrafficStatistics1 = IpsecTrafficStatistics1(),
    public var outboundTrafficStatistics: IpsecTrafficStatistics1 = IpsecTrafficStatistics1(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecStatistics1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecStatistics1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 216L
                override fun readNative(addr: Long): IpsecStatistics1 =
                    IpsecStatistics1(
                        (IpsecAggregateSaStatistics0.typeLayout()).readNative(addr),
                        (IpsecEspDropPacketStatistics0.typeLayout()).readNative(addr + 28L),
                        (IpsecAhDropPacketStatistics0.typeLayout()).readNative(addr + 48L),
                        (IpsecAggregateDropPacketStatistics1.typeLayout()).readNative(addr + 64L),
                        (IpsecTrafficStatistics1.typeLayout()).readNative(addr + 104L),
                        (IpsecTrafficStatistics1.typeLayout()).readNative(addr + 160L),
                    )
                override fun writeNative(addr: Long, value: IpsecStatistics1) {
                    (IpsecAggregateSaStatistics0.typeLayout()).writeNative(addr, value.aggregateSaStatistics)
                    (IpsecEspDropPacketStatistics0.typeLayout()).writeNative(addr + 28L, value.espDropPacketStatistics)
                    (IpsecAhDropPacketStatistics0.typeLayout()).writeNative(addr + 48L, value.ahDropPacketStatistics)
                    (IpsecAggregateDropPacketStatistics1.typeLayout()).writeNative(addr + 64L, value.aggregateDropPacketStatistics)
                    (IpsecTrafficStatistics1.typeLayout()).writeNative(addr + 104L, value.inboundTrafficStatistics)
                    (IpsecTrafficStatistics1.typeLayout()).writeNative(addr + 160L, value.outboundTrafficStatistics)
                }
            }
    }
}

public data class IpsecToken0(
    public var type: IpsecTokenType = 0,
    public var principal: IpsecTokenPrincipal = 0,
    public var mode: IpsecTokenMode = 0,
    public var token: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecToken0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecToken0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IpsecToken0 =
                    IpsecToken0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IpsecToken0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.principal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.token)
                }
            }
    }
}

public data class IpsecTraffic0(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: IpsecTraffic00 = IpsecTraffic00(),
    public var anonymous2: IpsecTraffic01 = IpsecTraffic01(),
    public var trafficType: IpsecTrafficType = 0,
    public var anonymous3: IpsecTraffic02 = IpsecTraffic02(),
    public var remotePort: UShort = 0u,
)

public data class IpsecTraffic00(
    public var localV4Address: UInt = 0u,
    public var localV6Address: UByteArray = UByteArray(16),
) {
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

public data class IpsecTraffic01(
    public var remoteV4Address: UInt = 0u,
    public var remoteV6Address: UByteArray = UByteArray(16),
) {
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

public data class IpsecTraffic02(
    public var ipsecFilterId: ULong = 0uL,
    public var tunnelPolicyId: ULong = 0uL,
)

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

public data class IpsecTraffic10(
    public var localV4Address: UInt = 0u,
    public var localV6Address: UByteArray = UByteArray(16),
) {
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

public data class IpsecTraffic11(
    public var remoteV4Address: UInt = 0u,
    public var remoteV6Address: UByteArray = UByteArray(16),
) {
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

public data class IpsecTraffic12(
    public var ipsecFilterId: ULong = 0uL,
    public var tunnelPolicyId: ULong = 0uL,
)

public data class IpsecTrafficSelector0(
    public var protocolId: UByte = 0u,
    public var portStart: UShort = 0u,
    public var portEnd: UShort = 0u,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: IpsecTrafficSelector00 = IpsecTrafficSelector00(),
    public var anonymous2: IpsecTrafficSelector01 = IpsecTrafficSelector01(),
)

public data class IpsecTrafficSelector00(
    public var startV4Address: UInt = 0u,
    public var startV6Address: UByteArray = UByteArray(16),
) {
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

public data class IpsecTrafficSelector01(
    public var endV4Address: UInt = 0u,
    public var endV6Address: UByteArray = UByteArray(16),
) {
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

public class IpsecTrafficSelectorPolicy0 internal constructor(
    public var flags: UInt,
    public var numLocalTrafficSelectors: UInt,
    localTrafficSelectorsCtorArg: MutPtr,
    public var numRemoteTrafficSelectors: UInt,
    remoteTrafficSelectorsCtorArg: MutPtr,
) {
    public var localTrafficSelectors: MutPtr = localTrafficSelectorsCtorArg
        internal set

    public var remoteTrafficSelectors: MutPtr = remoteTrafficSelectorsCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        numLocalTrafficSelectors = 0u,
        localTrafficSelectorsCtorArg = MutPtr(0L),
        numRemoteTrafficSelectors = 0u,
        remoteTrafficSelectorsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.numLocalTrafficSelectors

    public operator fun component3(): MutPtr = this.localTrafficSelectors

    public operator fun component4(): UInt = this.numRemoteTrafficSelectors

    public operator fun component5(): MutPtr = this.remoteTrafficSelectors

    public fun copy(flags: UInt = this.flags, numLocalTrafficSelectors: UInt = this.numLocalTrafficSelectors, localTrafficSelectors: MutPtr = this.localTrafficSelectors, numRemoteTrafficSelectors: UInt = this.numRemoteTrafficSelectors, remoteTrafficSelectors: MutPtr = this.remoteTrafficSelectors): IpsecTrafficSelectorPolicy0 = IpsecTrafficSelectorPolicy0(flags = flags, numLocalTrafficSelectors = numLocalTrafficSelectors, localTrafficSelectorsCtorArg = localTrafficSelectors, numRemoteTrafficSelectors = numRemoteTrafficSelectors, remoteTrafficSelectorsCtorArg = remoteTrafficSelectors)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTrafficSelectorPolicy0) return false
        if (this.flags != other.flags) return false
        if (this.numLocalTrafficSelectors != other.numLocalTrafficSelectors) return false
        if (this.localTrafficSelectors != other.localTrafficSelectors) return false
        if (this.numRemoteTrafficSelectors != other.numRemoteTrafficSelectors) return false
        if (this.remoteTrafficSelectors != other.remoteTrafficSelectors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.numLocalTrafficSelectors.hashCode()
        result = 31 * result + this.localTrafficSelectors.hashCode()
        result = 31 * result + this.numRemoteTrafficSelectors.hashCode()
        result = 31 * result + this.remoteTrafficSelectors.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTrafficSelectorPolicy0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTrafficSelectorPolicy0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): IpsecTrafficSelectorPolicy0 =
                    IpsecTrafficSelectorPolicy0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IpsecTrafficSelectorPolicy0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numLocalTrafficSelectors)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.localTrafficSelectors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numRemoteTrafficSelectors)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.remoteTrafficSelectors)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            numLocalTrafficSelectors: UInt = 0u,
            localTrafficSelectors: MutPtr = MutPtr(0L),
            numRemoteTrafficSelectors: UInt = 0u,
            remoteTrafficSelectors: MutPtr = MutPtr(0L),
        ): IpsecTrafficSelectorPolicy0 =
            IpsecTrafficSelectorPolicy0(
                flags = flags,
                numLocalTrafficSelectors = numLocalTrafficSelectors,
                localTrafficSelectorsCtorArg = localTrafficSelectors,
                numRemoteTrafficSelectors = numRemoteTrafficSelectors,
                remoteTrafficSelectorsCtorArg = remoteTrafficSelectors,
            )
    }
}

public data class IpsecTrafficStatistics0(
    public var encryptedByteCount: ULong = 0uL,
    public var authenticatedAHByteCount: ULong = 0uL,
    public var authenticatedESPByteCount: ULong = 0uL,
    public var transportByteCount: ULong = 0uL,
    public var tunnelByteCount: ULong = 0uL,
    public var offloadByteCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTrafficStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTrafficStatistics0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): IpsecTrafficStatistics0 =
                    IpsecTrafficStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: IpsecTrafficStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.encryptedByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.authenticatedAHByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.authenticatedESPByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.transportByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.tunnelByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.offloadByteCount)
                }
            }
    }
}

public data class IpsecTrafficStatistics1(
    public var encryptedByteCount: ULong = 0uL,
    public var authenticatedAHByteCount: ULong = 0uL,
    public var authenticatedESPByteCount: ULong = 0uL,
    public var transportByteCount: ULong = 0uL,
    public var tunnelByteCount: ULong = 0uL,
    public var offloadByteCount: ULong = 0uL,
    public var totalSuccessfulPackets: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTrafficStatistics1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTrafficStatistics1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): IpsecTrafficStatistics1 =
                    IpsecTrafficStatistics1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: IpsecTrafficStatistics1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.encryptedByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.authenticatedAHByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.authenticatedESPByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.transportByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.tunnelByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.offloadByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.totalSuccessfulPackets)
                }
            }
    }
}

public class IpsecTransportPolicy0 internal constructor(
    public var numIpsecProposals: UInt,
    ipsecProposalsCtorArg: MutPtr,
    public var flags: IpsecPolicyFlag,
    public var ndAllowClearTimeoutSeconds: UInt,
    public var saIdleTimeout: IpsecSaIdleTimeout0,
    emPolicyCtorArg: MutPtr,
) {
    public var ipsecProposals: MutPtr = ipsecProposalsCtorArg
        internal set

    public var emPolicy: MutPtr = emPolicyCtorArg
        internal set

    public constructor() : this(
        numIpsecProposals = 0u,
        ipsecProposalsCtorArg = MutPtr(0L),
        flags = 0u,
        ndAllowClearTimeoutSeconds = 0u,
        saIdleTimeout = IpsecSaIdleTimeout0(),
        emPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numIpsecProposals

    public operator fun component2(): MutPtr = this.ipsecProposals

    public operator fun component3(): IpsecPolicyFlag = this.flags

    public operator fun component4(): UInt = this.ndAllowClearTimeoutSeconds

    public operator fun component5(): IpsecSaIdleTimeout0 = this.saIdleTimeout

    public operator fun component6(): MutPtr = this.emPolicy

    public fun copy(numIpsecProposals: UInt = this.numIpsecProposals, ipsecProposals: MutPtr = this.ipsecProposals, flags: IpsecPolicyFlag = this.flags, ndAllowClearTimeoutSeconds: UInt = this.ndAllowClearTimeoutSeconds, saIdleTimeout: IpsecSaIdleTimeout0 = this.saIdleTimeout, emPolicy: MutPtr = this.emPolicy): IpsecTransportPolicy0 = IpsecTransportPolicy0(numIpsecProposals = numIpsecProposals, ipsecProposalsCtorArg = ipsecProposals, flags = flags, ndAllowClearTimeoutSeconds = ndAllowClearTimeoutSeconds, saIdleTimeout = saIdleTimeout, emPolicyCtorArg = emPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTransportPolicy0) return false
        if (this.numIpsecProposals != other.numIpsecProposals) return false
        if (this.ipsecProposals != other.ipsecProposals) return false
        if (this.flags != other.flags) return false
        if (this.ndAllowClearTimeoutSeconds != other.ndAllowClearTimeoutSeconds) return false
        if (this.saIdleTimeout != other.saIdleTimeout) return false
        if (this.emPolicy != other.emPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numIpsecProposals.hashCode()
        result = 31 * result + this.ipsecProposals.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ndAllowClearTimeoutSeconds.hashCode()
        result = 31 * result + this.saIdleTimeout.hashCode()
        result = 31 * result + this.emPolicy.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTransportPolicy0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTransportPolicy0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IpsecTransportPolicy0 =
                    IpsecTransportPolicy0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (IpsecSaIdleTimeout0.typeLayout()).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IpsecTransportPolicy0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numIpsecProposals)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.ipsecProposals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ndAllowClearTimeoutSeconds)
                    (IpsecSaIdleTimeout0.typeLayout()).writeNative(addr + 24L, value.saIdleTimeout)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.emPolicy)
                }
            }

        public operator fun invoke(
            numIpsecProposals: UInt = 0u,
            ipsecProposals: MutPtr = MutPtr(0L),
            flags: IpsecPolicyFlag = 0u,
            ndAllowClearTimeoutSeconds: UInt = 0u,
            saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
            emPolicy: MutPtr = MutPtr(0L),
        ): IpsecTransportPolicy0 =
            IpsecTransportPolicy0(
                numIpsecProposals = numIpsecProposals,
                ipsecProposalsCtorArg = ipsecProposals,
                flags = flags,
                ndAllowClearTimeoutSeconds = ndAllowClearTimeoutSeconds,
                saIdleTimeout = saIdleTimeout,
                emPolicyCtorArg = emPolicy,
            )
    }
}

public class IpsecTransportPolicy1 internal constructor(
    public var numIpsecProposals: UInt,
    ipsecProposalsCtorArg: MutPtr,
    public var flags: IpsecPolicyFlag,
    public var ndAllowClearTimeoutSeconds: UInt,
    public var saIdleTimeout: IpsecSaIdleTimeout0,
    emPolicyCtorArg: MutPtr,
) {
    public var ipsecProposals: MutPtr = ipsecProposalsCtorArg
        internal set

    public var emPolicy: MutPtr = emPolicyCtorArg
        internal set

    public constructor() : this(
        numIpsecProposals = 0u,
        ipsecProposalsCtorArg = MutPtr(0L),
        flags = 0u,
        ndAllowClearTimeoutSeconds = 0u,
        saIdleTimeout = IpsecSaIdleTimeout0(),
        emPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numIpsecProposals

    public operator fun component2(): MutPtr = this.ipsecProposals

    public operator fun component3(): IpsecPolicyFlag = this.flags

    public operator fun component4(): UInt = this.ndAllowClearTimeoutSeconds

    public operator fun component5(): IpsecSaIdleTimeout0 = this.saIdleTimeout

    public operator fun component6(): MutPtr = this.emPolicy

    public fun copy(numIpsecProposals: UInt = this.numIpsecProposals, ipsecProposals: MutPtr = this.ipsecProposals, flags: IpsecPolicyFlag = this.flags, ndAllowClearTimeoutSeconds: UInt = this.ndAllowClearTimeoutSeconds, saIdleTimeout: IpsecSaIdleTimeout0 = this.saIdleTimeout, emPolicy: MutPtr = this.emPolicy): IpsecTransportPolicy1 = IpsecTransportPolicy1(numIpsecProposals = numIpsecProposals, ipsecProposalsCtorArg = ipsecProposals, flags = flags, ndAllowClearTimeoutSeconds = ndAllowClearTimeoutSeconds, saIdleTimeout = saIdleTimeout, emPolicyCtorArg = emPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTransportPolicy1) return false
        if (this.numIpsecProposals != other.numIpsecProposals) return false
        if (this.ipsecProposals != other.ipsecProposals) return false
        if (this.flags != other.flags) return false
        if (this.ndAllowClearTimeoutSeconds != other.ndAllowClearTimeoutSeconds) return false
        if (this.saIdleTimeout != other.saIdleTimeout) return false
        if (this.emPolicy != other.emPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numIpsecProposals.hashCode()
        result = 31 * result + this.ipsecProposals.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ndAllowClearTimeoutSeconds.hashCode()
        result = 31 * result + this.saIdleTimeout.hashCode()
        result = 31 * result + this.emPolicy.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTransportPolicy1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTransportPolicy1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IpsecTransportPolicy1 =
                    IpsecTransportPolicy1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (IpsecSaIdleTimeout0.typeLayout()).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IpsecTransportPolicy1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numIpsecProposals)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.ipsecProposals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ndAllowClearTimeoutSeconds)
                    (IpsecSaIdleTimeout0.typeLayout()).writeNative(addr + 24L, value.saIdleTimeout)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.emPolicy)
                }
            }

        public operator fun invoke(
            numIpsecProposals: UInt = 0u,
            ipsecProposals: MutPtr = MutPtr(0L),
            flags: IpsecPolicyFlag = 0u,
            ndAllowClearTimeoutSeconds: UInt = 0u,
            saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
            emPolicy: MutPtr = MutPtr(0L),
        ): IpsecTransportPolicy1 =
            IpsecTransportPolicy1(
                numIpsecProposals = numIpsecProposals,
                ipsecProposalsCtorArg = ipsecProposals,
                flags = flags,
                ndAllowClearTimeoutSeconds = ndAllowClearTimeoutSeconds,
                saIdleTimeout = saIdleTimeout,
                emPolicyCtorArg = emPolicy,
            )
    }
}

public class IpsecTransportPolicy2 internal constructor(
    public var numIpsecProposals: UInt,
    ipsecProposalsCtorArg: MutPtr,
    public var flags: IpsecPolicyFlag,
    public var ndAllowClearTimeoutSeconds: UInt,
    public var saIdleTimeout: IpsecSaIdleTimeout0,
    emPolicyCtorArg: MutPtr,
) {
    public var ipsecProposals: MutPtr = ipsecProposalsCtorArg
        internal set

    public var emPolicy: MutPtr = emPolicyCtorArg
        internal set

    public constructor() : this(
        numIpsecProposals = 0u,
        ipsecProposalsCtorArg = MutPtr(0L),
        flags = 0u,
        ndAllowClearTimeoutSeconds = 0u,
        saIdleTimeout = IpsecSaIdleTimeout0(),
        emPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numIpsecProposals

    public operator fun component2(): MutPtr = this.ipsecProposals

    public operator fun component3(): IpsecPolicyFlag = this.flags

    public operator fun component4(): UInt = this.ndAllowClearTimeoutSeconds

    public operator fun component5(): IpsecSaIdleTimeout0 = this.saIdleTimeout

    public operator fun component6(): MutPtr = this.emPolicy

    public fun copy(numIpsecProposals: UInt = this.numIpsecProposals, ipsecProposals: MutPtr = this.ipsecProposals, flags: IpsecPolicyFlag = this.flags, ndAllowClearTimeoutSeconds: UInt = this.ndAllowClearTimeoutSeconds, saIdleTimeout: IpsecSaIdleTimeout0 = this.saIdleTimeout, emPolicy: MutPtr = this.emPolicy): IpsecTransportPolicy2 = IpsecTransportPolicy2(numIpsecProposals = numIpsecProposals, ipsecProposalsCtorArg = ipsecProposals, flags = flags, ndAllowClearTimeoutSeconds = ndAllowClearTimeoutSeconds, saIdleTimeout = saIdleTimeout, emPolicyCtorArg = emPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTransportPolicy2) return false
        if (this.numIpsecProposals != other.numIpsecProposals) return false
        if (this.ipsecProposals != other.ipsecProposals) return false
        if (this.flags != other.flags) return false
        if (this.ndAllowClearTimeoutSeconds != other.ndAllowClearTimeoutSeconds) return false
        if (this.saIdleTimeout != other.saIdleTimeout) return false
        if (this.emPolicy != other.emPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numIpsecProposals.hashCode()
        result = 31 * result + this.ipsecProposals.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ndAllowClearTimeoutSeconds.hashCode()
        result = 31 * result + this.saIdleTimeout.hashCode()
        result = 31 * result + this.emPolicy.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTransportPolicy2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecTransportPolicy2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IpsecTransportPolicy2 =
                    IpsecTransportPolicy2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (IpsecSaIdleTimeout0.typeLayout()).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IpsecTransportPolicy2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numIpsecProposals)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.ipsecProposals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ndAllowClearTimeoutSeconds)
                    (IpsecSaIdleTimeout0.typeLayout()).writeNative(addr + 24L, value.saIdleTimeout)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.emPolicy)
                }
            }

        public operator fun invoke(
            numIpsecProposals: UInt = 0u,
            ipsecProposals: MutPtr = MutPtr(0L),
            flags: IpsecPolicyFlag = 0u,
            ndAllowClearTimeoutSeconds: UInt = 0u,
            saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
            emPolicy: MutPtr = MutPtr(0L),
        ): IpsecTransportPolicy2 =
            IpsecTransportPolicy2(
                numIpsecProposals = numIpsecProposals,
                ipsecProposalsCtorArg = ipsecProposals,
                flags = flags,
                ndAllowClearTimeoutSeconds = ndAllowClearTimeoutSeconds,
                saIdleTimeout = saIdleTimeout,
                emPolicyCtorArg = emPolicy,
            )
    }
}

public data class IpsecTunnelEndpoint0(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IpsecTunnelEndpoint00 = IpsecTunnelEndpoint00(),
)

public data class IpsecTunnelEndpoint00(
    public var v4Address: UInt = 0u,
    public var v6Address: UByteArray = UByteArray(16),
) {
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

public data class IpsecTunnelEndpoints00(
    public var localV4Address: UInt = 0u,
    public var localV6Address: UByteArray = UByteArray(16),
) {
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

public data class IpsecTunnelEndpoints01(
    public var remoteV4Address: UInt = 0u,
    public var remoteV6Address: UByteArray = UByteArray(16),
) {
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

public data class IpsecTunnelEndpoints10(
    public var localV4Address: UInt = 0u,
    public var localV6Address: UByteArray = UByteArray(16),
) {
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

public data class IpsecTunnelEndpoints11(
    public var remoteV4Address: UInt = 0u,
    public var remoteV6Address: UByteArray = UByteArray(16),
) {
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

public class IpsecTunnelEndpoints2 internal constructor(
    public var ipVersion: FwpIpVersion,
    public var anonymous1: IpsecTunnelEndpoints20,
    public var anonymous2: IpsecTunnelEndpoints21,
    public var localIfLuid: ULong,
    remoteFqdnCtorArg: Pwstr,
    public var numAddresses: UInt,
    remoteAddressesCtorArg: MutPtr,
) {
    public var remoteFqdn: Pwstr = remoteFqdnCtorArg
        internal set

    public var remoteAddresses: MutPtr = remoteAddressesCtorArg
        internal set

    public constructor() : this(
        ipVersion = 0,
        anonymous1 = IpsecTunnelEndpoints20(),
        anonymous2 = IpsecTunnelEndpoints21(),
        localIfLuid = 0uL,
        remoteFqdnCtorArg = MutPtr(0L),
        numAddresses = 0u,
        remoteAddressesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): FwpIpVersion = this.ipVersion

    public operator fun component2(): IpsecTunnelEndpoints20 = this.anonymous1

    public operator fun component3(): IpsecTunnelEndpoints21 = this.anonymous2

    public operator fun component4(): ULong = this.localIfLuid

    public operator fun component5(): Pwstr = this.remoteFqdn

    public operator fun component6(): UInt = this.numAddresses

    public operator fun component7(): MutPtr = this.remoteAddresses

    public fun copy(ipVersion: FwpIpVersion = this.ipVersion, anonymous1: IpsecTunnelEndpoints20 = this.anonymous1, anonymous2: IpsecTunnelEndpoints21 = this.anonymous2, localIfLuid: ULong = this.localIfLuid, remoteFqdn: Pwstr = this.remoteFqdn, numAddresses: UInt = this.numAddresses, remoteAddresses: MutPtr = this.remoteAddresses): IpsecTunnelEndpoints2 = IpsecTunnelEndpoints2(ipVersion = ipVersion, anonymous1 = anonymous1, anonymous2 = anonymous2, localIfLuid = localIfLuid, remoteFqdnCtorArg = remoteFqdn, numAddresses = numAddresses, remoteAddressesCtorArg = remoteAddresses)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelEndpoints2) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.localIfLuid != other.localIfLuid) return false
        if (this.remoteFqdn != other.remoteFqdn) return false
        if (this.numAddresses != other.numAddresses) return false
        if (this.remoteAddresses != other.remoteAddresses) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipVersion.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.localIfLuid.hashCode()
        result = 31 * result + this.remoteFqdn.hashCode()
        result = 31 * result + this.numAddresses.hashCode()
        result = 31 * result + this.remoteAddresses.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ipVersion: FwpIpVersion = 0,
            anonymous1: IpsecTunnelEndpoints20 = IpsecTunnelEndpoints20(),
            anonymous2: IpsecTunnelEndpoints21 = IpsecTunnelEndpoints21(),
            localIfLuid: ULong = 0uL,
            remoteFqdn: Pwstr = MutPtr(0L),
            numAddresses: UInt = 0u,
            remoteAddresses: MutPtr = MutPtr(0L),
        ): IpsecTunnelEndpoints2 =
            IpsecTunnelEndpoints2(
                ipVersion = ipVersion,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                localIfLuid = localIfLuid,
                remoteFqdnCtorArg = remoteFqdn,
                numAddresses = numAddresses,
                remoteAddressesCtorArg = remoteAddresses,
            )
    }
}

public data class IpsecTunnelEndpoints20(
    public var localV4Address: UInt = 0u,
    public var localV6Address: UByteArray = UByteArray(16),
) {
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

public data class IpsecTunnelEndpoints21(
    public var remoteV4Address: UInt = 0u,
    public var remoteV6Address: UByteArray = UByteArray(16),
) {
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

public class IpsecTunnelPolicy0 internal constructor(
    public var flags: IpsecPolicyFlag,
    public var numIpsecProposals: UInt,
    ipsecProposalsCtorArg: MutPtr,
    public var tunnelEndpoints: IpsecTunnelEndpoints0,
    public var saIdleTimeout: IpsecSaIdleTimeout0,
    emPolicyCtorArg: MutPtr,
) {
    public var ipsecProposals: MutPtr = ipsecProposalsCtorArg
        internal set

    public var emPolicy: MutPtr = emPolicyCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        numIpsecProposals = 0u,
        ipsecProposalsCtorArg = MutPtr(0L),
        tunnelEndpoints = IpsecTunnelEndpoints0(),
        saIdleTimeout = IpsecSaIdleTimeout0(),
        emPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IpsecPolicyFlag = this.flags

    public operator fun component2(): UInt = this.numIpsecProposals

    public operator fun component3(): MutPtr = this.ipsecProposals

    public operator fun component4(): IpsecTunnelEndpoints0 = this.tunnelEndpoints

    public operator fun component5(): IpsecSaIdleTimeout0 = this.saIdleTimeout

    public operator fun component6(): MutPtr = this.emPolicy

    public fun copy(flags: IpsecPolicyFlag = this.flags, numIpsecProposals: UInt = this.numIpsecProposals, ipsecProposals: MutPtr = this.ipsecProposals, tunnelEndpoints: IpsecTunnelEndpoints0 = this.tunnelEndpoints, saIdleTimeout: IpsecSaIdleTimeout0 = this.saIdleTimeout, emPolicy: MutPtr = this.emPolicy): IpsecTunnelPolicy0 = IpsecTunnelPolicy0(flags = flags, numIpsecProposals = numIpsecProposals, ipsecProposalsCtorArg = ipsecProposals, tunnelEndpoints = tunnelEndpoints, saIdleTimeout = saIdleTimeout, emPolicyCtorArg = emPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelPolicy0) return false
        if (this.flags != other.flags) return false
        if (this.numIpsecProposals != other.numIpsecProposals) return false
        if (this.ipsecProposals != other.ipsecProposals) return false
        if (this.tunnelEndpoints != other.tunnelEndpoints) return false
        if (this.saIdleTimeout != other.saIdleTimeout) return false
        if (this.emPolicy != other.emPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.numIpsecProposals.hashCode()
        result = 31 * result + this.ipsecProposals.hashCode()
        result = 31 * result + this.tunnelEndpoints.hashCode()
        result = 31 * result + this.saIdleTimeout.hashCode()
        result = 31 * result + this.emPolicy.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: IpsecPolicyFlag = 0u,
            numIpsecProposals: UInt = 0u,
            ipsecProposals: MutPtr = MutPtr(0L),
            tunnelEndpoints: IpsecTunnelEndpoints0 = IpsecTunnelEndpoints0(),
            saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
            emPolicy: MutPtr = MutPtr(0L),
        ): IpsecTunnelPolicy0 =
            IpsecTunnelPolicy0(
                flags = flags,
                numIpsecProposals = numIpsecProposals,
                ipsecProposalsCtorArg = ipsecProposals,
                tunnelEndpoints = tunnelEndpoints,
                saIdleTimeout = saIdleTimeout,
                emPolicyCtorArg = emPolicy,
            )
    }
}

public class IpsecTunnelPolicy1 internal constructor(
    public var flags: IpsecPolicyFlag,
    public var numIpsecProposals: UInt,
    ipsecProposalsCtorArg: MutPtr,
    public var tunnelEndpoints: IpsecTunnelEndpoints1,
    public var saIdleTimeout: IpsecSaIdleTimeout0,
    emPolicyCtorArg: MutPtr,
) {
    public var ipsecProposals: MutPtr = ipsecProposalsCtorArg
        internal set

    public var emPolicy: MutPtr = emPolicyCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        numIpsecProposals = 0u,
        ipsecProposalsCtorArg = MutPtr(0L),
        tunnelEndpoints = IpsecTunnelEndpoints1(),
        saIdleTimeout = IpsecSaIdleTimeout0(),
        emPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IpsecPolicyFlag = this.flags

    public operator fun component2(): UInt = this.numIpsecProposals

    public operator fun component3(): MutPtr = this.ipsecProposals

    public operator fun component4(): IpsecTunnelEndpoints1 = this.tunnelEndpoints

    public operator fun component5(): IpsecSaIdleTimeout0 = this.saIdleTimeout

    public operator fun component6(): MutPtr = this.emPolicy

    public fun copy(flags: IpsecPolicyFlag = this.flags, numIpsecProposals: UInt = this.numIpsecProposals, ipsecProposals: MutPtr = this.ipsecProposals, tunnelEndpoints: IpsecTunnelEndpoints1 = this.tunnelEndpoints, saIdleTimeout: IpsecSaIdleTimeout0 = this.saIdleTimeout, emPolicy: MutPtr = this.emPolicy): IpsecTunnelPolicy1 = IpsecTunnelPolicy1(flags = flags, numIpsecProposals = numIpsecProposals, ipsecProposalsCtorArg = ipsecProposals, tunnelEndpoints = tunnelEndpoints, saIdleTimeout = saIdleTimeout, emPolicyCtorArg = emPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelPolicy1) return false
        if (this.flags != other.flags) return false
        if (this.numIpsecProposals != other.numIpsecProposals) return false
        if (this.ipsecProposals != other.ipsecProposals) return false
        if (this.tunnelEndpoints != other.tunnelEndpoints) return false
        if (this.saIdleTimeout != other.saIdleTimeout) return false
        if (this.emPolicy != other.emPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.numIpsecProposals.hashCode()
        result = 31 * result + this.ipsecProposals.hashCode()
        result = 31 * result + this.tunnelEndpoints.hashCode()
        result = 31 * result + this.saIdleTimeout.hashCode()
        result = 31 * result + this.emPolicy.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: IpsecPolicyFlag = 0u,
            numIpsecProposals: UInt = 0u,
            ipsecProposals: MutPtr = MutPtr(0L),
            tunnelEndpoints: IpsecTunnelEndpoints1 = IpsecTunnelEndpoints1(),
            saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
            emPolicy: MutPtr = MutPtr(0L),
        ): IpsecTunnelPolicy1 =
            IpsecTunnelPolicy1(
                flags = flags,
                numIpsecProposals = numIpsecProposals,
                ipsecProposalsCtorArg = ipsecProposals,
                tunnelEndpoints = tunnelEndpoints,
                saIdleTimeout = saIdleTimeout,
                emPolicyCtorArg = emPolicy,
            )
    }
}

public class IpsecTunnelPolicy2 internal constructor(
    public var flags: IpsecPolicyFlag,
    public var numIpsecProposals: UInt,
    ipsecProposalsCtorArg: MutPtr,
    public var tunnelEndpoints: IpsecTunnelEndpoints2,
    public var saIdleTimeout: IpsecSaIdleTimeout0,
    emPolicyCtorArg: MutPtr,
    public var fwdPathSaLifetime: UInt,
) {
    public var ipsecProposals: MutPtr = ipsecProposalsCtorArg
        internal set

    public var emPolicy: MutPtr = emPolicyCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        numIpsecProposals = 0u,
        ipsecProposalsCtorArg = MutPtr(0L),
        tunnelEndpoints = IpsecTunnelEndpoints2(),
        saIdleTimeout = IpsecSaIdleTimeout0(),
        emPolicyCtorArg = MutPtr(0L),
        fwdPathSaLifetime = 0u,
    )

    public operator fun component1(): IpsecPolicyFlag = this.flags

    public operator fun component2(): UInt = this.numIpsecProposals

    public operator fun component3(): MutPtr = this.ipsecProposals

    public operator fun component4(): IpsecTunnelEndpoints2 = this.tunnelEndpoints

    public operator fun component5(): IpsecSaIdleTimeout0 = this.saIdleTimeout

    public operator fun component6(): MutPtr = this.emPolicy

    public operator fun component7(): UInt = this.fwdPathSaLifetime

    public fun copy(flags: IpsecPolicyFlag = this.flags, numIpsecProposals: UInt = this.numIpsecProposals, ipsecProposals: MutPtr = this.ipsecProposals, tunnelEndpoints: IpsecTunnelEndpoints2 = this.tunnelEndpoints, saIdleTimeout: IpsecSaIdleTimeout0 = this.saIdleTimeout, emPolicy: MutPtr = this.emPolicy, fwdPathSaLifetime: UInt = this.fwdPathSaLifetime): IpsecTunnelPolicy2 = IpsecTunnelPolicy2(flags = flags, numIpsecProposals = numIpsecProposals, ipsecProposalsCtorArg = ipsecProposals, tunnelEndpoints = tunnelEndpoints, saIdleTimeout = saIdleTimeout, emPolicyCtorArg = emPolicy, fwdPathSaLifetime = fwdPathSaLifetime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelPolicy2) return false
        if (this.flags != other.flags) return false
        if (this.numIpsecProposals != other.numIpsecProposals) return false
        if (this.ipsecProposals != other.ipsecProposals) return false
        if (this.tunnelEndpoints != other.tunnelEndpoints) return false
        if (this.saIdleTimeout != other.saIdleTimeout) return false
        if (this.emPolicy != other.emPolicy) return false
        if (this.fwdPathSaLifetime != other.fwdPathSaLifetime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.numIpsecProposals.hashCode()
        result = 31 * result + this.ipsecProposals.hashCode()
        result = 31 * result + this.tunnelEndpoints.hashCode()
        result = 31 * result + this.saIdleTimeout.hashCode()
        result = 31 * result + this.emPolicy.hashCode()
        result = 31 * result + this.fwdPathSaLifetime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: IpsecPolicyFlag = 0u,
            numIpsecProposals: UInt = 0u,
            ipsecProposals: MutPtr = MutPtr(0L),
            tunnelEndpoints: IpsecTunnelEndpoints2 = IpsecTunnelEndpoints2(),
            saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
            emPolicy: MutPtr = MutPtr(0L),
            fwdPathSaLifetime: UInt = 0u,
        ): IpsecTunnelPolicy2 =
            IpsecTunnelPolicy2(
                flags = flags,
                numIpsecProposals = numIpsecProposals,
                ipsecProposalsCtorArg = ipsecProposals,
                tunnelEndpoints = tunnelEndpoints,
                saIdleTimeout = saIdleTimeout,
                emPolicyCtorArg = emPolicy,
                fwdPathSaLifetime = fwdPathSaLifetime,
            )
    }
}

public class IpsecTunnelPolicy3 internal constructor(
    public var flags: UInt,
    public var numIpsecProposals: UInt,
    ipsecProposalsCtorArg: MutPtr,
    public var tunnelEndpoints: IpsecTunnelEndpoints2,
    public var saIdleTimeout: IpsecSaIdleTimeout0,
    emPolicyCtorArg: MutPtr,
    public var fwdPathSaLifetime: UInt,
    public var compartmentId: UInt,
    public var numTrafficSelectorPolicy: UInt,
    trafficSelectorPoliciesCtorArg: MutPtr,
) {
    public var ipsecProposals: MutPtr = ipsecProposalsCtorArg
        internal set

    public var emPolicy: MutPtr = emPolicyCtorArg
        internal set

    public var trafficSelectorPolicies: MutPtr = trafficSelectorPoliciesCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        numIpsecProposals = 0u,
        ipsecProposalsCtorArg = MutPtr(0L),
        tunnelEndpoints = IpsecTunnelEndpoints2(),
        saIdleTimeout = IpsecSaIdleTimeout0(),
        emPolicyCtorArg = MutPtr(0L),
        fwdPathSaLifetime = 0u,
        compartmentId = 0u,
        numTrafficSelectorPolicy = 0u,
        trafficSelectorPoliciesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.numIpsecProposals

    public operator fun component3(): MutPtr = this.ipsecProposals

    public operator fun component4(): IpsecTunnelEndpoints2 = this.tunnelEndpoints

    public operator fun component5(): IpsecSaIdleTimeout0 = this.saIdleTimeout

    public operator fun component6(): MutPtr = this.emPolicy

    public operator fun component7(): UInt = this.fwdPathSaLifetime

    public operator fun component8(): UInt = this.compartmentId

    public operator fun component9(): UInt = this.numTrafficSelectorPolicy

    public operator fun component10(): MutPtr = this.trafficSelectorPolicies

    public fun copy(flags: UInt = this.flags, numIpsecProposals: UInt = this.numIpsecProposals, ipsecProposals: MutPtr = this.ipsecProposals, tunnelEndpoints: IpsecTunnelEndpoints2 = this.tunnelEndpoints, saIdleTimeout: IpsecSaIdleTimeout0 = this.saIdleTimeout, emPolicy: MutPtr = this.emPolicy, fwdPathSaLifetime: UInt = this.fwdPathSaLifetime, compartmentId: UInt = this.compartmentId, numTrafficSelectorPolicy: UInt = this.numTrafficSelectorPolicy, trafficSelectorPolicies: MutPtr = this.trafficSelectorPolicies): IpsecTunnelPolicy3 = IpsecTunnelPolicy3(flags = flags, numIpsecProposals = numIpsecProposals, ipsecProposalsCtorArg = ipsecProposals, tunnelEndpoints = tunnelEndpoints, saIdleTimeout = saIdleTimeout, emPolicyCtorArg = emPolicy, fwdPathSaLifetime = fwdPathSaLifetime, compartmentId = compartmentId, numTrafficSelectorPolicy = numTrafficSelectorPolicy, trafficSelectorPoliciesCtorArg = trafficSelectorPolicies)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecTunnelPolicy3) return false
        if (this.flags != other.flags) return false
        if (this.numIpsecProposals != other.numIpsecProposals) return false
        if (this.ipsecProposals != other.ipsecProposals) return false
        if (this.tunnelEndpoints != other.tunnelEndpoints) return false
        if (this.saIdleTimeout != other.saIdleTimeout) return false
        if (this.emPolicy != other.emPolicy) return false
        if (this.fwdPathSaLifetime != other.fwdPathSaLifetime) return false
        if (this.compartmentId != other.compartmentId) return false
        if (this.numTrafficSelectorPolicy != other.numTrafficSelectorPolicy) return false
        if (this.trafficSelectorPolicies != other.trafficSelectorPolicies) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.numIpsecProposals.hashCode()
        result = 31 * result + this.ipsecProposals.hashCode()
        result = 31 * result + this.tunnelEndpoints.hashCode()
        result = 31 * result + this.saIdleTimeout.hashCode()
        result = 31 * result + this.emPolicy.hashCode()
        result = 31 * result + this.fwdPathSaLifetime.hashCode()
        result = 31 * result + this.compartmentId.hashCode()
        result = 31 * result + this.numTrafficSelectorPolicy.hashCode()
        result = 31 * result + this.trafficSelectorPolicies.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            numIpsecProposals: UInt = 0u,
            ipsecProposals: MutPtr = MutPtr(0L),
            tunnelEndpoints: IpsecTunnelEndpoints2 = IpsecTunnelEndpoints2(),
            saIdleTimeout: IpsecSaIdleTimeout0 = IpsecSaIdleTimeout0(),
            emPolicy: MutPtr = MutPtr(0L),
            fwdPathSaLifetime: UInt = 0u,
            compartmentId: UInt = 0u,
            numTrafficSelectorPolicy: UInt = 0u,
            trafficSelectorPolicies: MutPtr = MutPtr(0L),
        ): IpsecTunnelPolicy3 =
            IpsecTunnelPolicy3(
                flags = flags,
                numIpsecProposals = numIpsecProposals,
                ipsecProposalsCtorArg = ipsecProposals,
                tunnelEndpoints = tunnelEndpoints,
                saIdleTimeout = saIdleTimeout,
                emPolicyCtorArg = emPolicy,
                fwdPathSaLifetime = fwdPathSaLifetime,
                compartmentId = compartmentId,
                numTrafficSelectorPolicy = numTrafficSelectorPolicy,
                trafficSelectorPoliciesCtorArg = trafficSelectorPolicies,
            )
    }
}

public data class IpsecV4UdpEncapsulation0(
    public var localUdpEncapPort: UShort = 0u,
    public var remoteUdpEncapPort: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecV4UdpEncapsulation0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecV4UdpEncapsulation0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): IpsecV4UdpEncapsulation0 =
                    IpsecV4UdpEncapsulation0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: IpsecV4UdpEncapsulation0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.localUdpEncapPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.remoteUdpEncapPort)
                }
            }
    }
}

public data class IpsecVirtualIfTunnelInfo0(
    public var virtualIfTunnelId: ULong = 0uL,
    public var trafficSelectorId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecVirtualIfTunnelInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecVirtualIfTunnelInfo0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IpsecVirtualIfTunnelInfo0 =
                    IpsecVirtualIfTunnelInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IpsecVirtualIfTunnelInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.virtualIfTunnelId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.trafficSelectorId)
                }
            }
    }
}
