@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

public data class IpngAddress(
    public var ipAddrV4: UInt = 0u,
    public var ipAddrV6: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpngAddress) return false
        if (this.ipAddrV4 != other.ipAddrV4) return false
        if (!this.ipAddrV6.contentEquals(other.ipAddrV6)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipAddrV4.hashCode()
        result = 31 * result + this.ipAddrV6.contentHashCode()
        return result
    }
}

public class McastClientUid internal constructor(
    clientUIDCtorArg: MutPtr,
    public var clientUIDLength: UInt,
) {
    public var clientUID: MutPtr = clientUIDCtorArg
        internal set

    public constructor() : this(
        clientUIDCtorArg = MutPtr(0L),
        clientUIDLength = 0u,
    )

    public operator fun component1(): MutPtr = this.clientUID

    public operator fun component2(): UInt = this.clientUIDLength

    public fun copy(clientUID: MutPtr = this.clientUID, clientUIDLength: UInt = this.clientUIDLength): McastClientUid = McastClientUid(clientUIDCtorArg = clientUID, clientUIDLength = clientUIDLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McastClientUid) return false
        if (this.clientUID != other.clientUID) return false
        if (this.clientUIDLength != other.clientUIDLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientUID.hashCode()
        result = 31 * result + this.clientUIDLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McastClientUid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McastClientUid> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): McastClientUid =
                    McastClientUid(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: McastClientUid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.clientUID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.clientUIDLength)
                }
            }

        public operator fun invoke(
            clientUID: MutPtr = MutPtr(0L),
            clientUIDLength: UInt = 0u,
        ): McastClientUid =
            McastClientUid(
                clientUIDCtorArg = clientUID,
                clientUIDLength = clientUIDLength,
            )
    }
}

public class McastLeaseRequest internal constructor(
    public var leaseStartTime: Int,
    public var maxLeaseStartTime: Int,
    public var leaseDuration: UInt,
    public var minLeaseDuration: UInt,
    public var serverAddress: IpngAddress,
    public var minAddrCount: UShort,
    public var addrCount: UShort,
    pAddrBufCtorArg: MutPtr,
) {
    public var pAddrBuf: MutPtr = pAddrBufCtorArg
        internal set

    public constructor() : this(
        leaseStartTime = 0,
        maxLeaseStartTime = 0,
        leaseDuration = 0u,
        minLeaseDuration = 0u,
        serverAddress = IpngAddress(),
        minAddrCount = 0u,
        addrCount = 0u,
        pAddrBufCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.leaseStartTime

    public operator fun component2(): Int = this.maxLeaseStartTime

    public operator fun component3(): UInt = this.leaseDuration

    public operator fun component4(): UInt = this.minLeaseDuration

    public operator fun component5(): IpngAddress = this.serverAddress

    public operator fun component6(): UShort = this.minAddrCount

    public operator fun component7(): UShort = this.addrCount

    public operator fun component8(): MutPtr = this.pAddrBuf

    public fun copy(leaseStartTime: Int = this.leaseStartTime, maxLeaseStartTime: Int = this.maxLeaseStartTime, leaseDuration: UInt = this.leaseDuration, minLeaseDuration: UInt = this.minLeaseDuration, serverAddress: IpngAddress = this.serverAddress, minAddrCount: UShort = this.minAddrCount, addrCount: UShort = this.addrCount, pAddrBuf: MutPtr = this.pAddrBuf): McastLeaseRequest = McastLeaseRequest(leaseStartTime = leaseStartTime, maxLeaseStartTime = maxLeaseStartTime, leaseDuration = leaseDuration, minLeaseDuration = minLeaseDuration, serverAddress = serverAddress, minAddrCount = minAddrCount, addrCount = addrCount, pAddrBufCtorArg = pAddrBuf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McastLeaseRequest) return false
        if (this.leaseStartTime != other.leaseStartTime) return false
        if (this.maxLeaseStartTime != other.maxLeaseStartTime) return false
        if (this.leaseDuration != other.leaseDuration) return false
        if (this.minLeaseDuration != other.minLeaseDuration) return false
        if (this.serverAddress != other.serverAddress) return false
        if (this.minAddrCount != other.minAddrCount) return false
        if (this.addrCount != other.addrCount) return false
        if (this.pAddrBuf != other.pAddrBuf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.leaseStartTime.hashCode()
        result = 31 * result + this.maxLeaseStartTime.hashCode()
        result = 31 * result + this.leaseDuration.hashCode()
        result = 31 * result + this.minLeaseDuration.hashCode()
        result = 31 * result + this.serverAddress.hashCode()
        result = 31 * result + this.minAddrCount.hashCode()
        result = 31 * result + this.addrCount.hashCode()
        result = 31 * result + this.pAddrBuf.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            leaseStartTime: Int = 0,
            maxLeaseStartTime: Int = 0,
            leaseDuration: UInt = 0u,
            minLeaseDuration: UInt = 0u,
            serverAddress: IpngAddress = IpngAddress(),
            minAddrCount: UShort = 0u,
            addrCount: UShort = 0u,
            pAddrBuf: MutPtr = MutPtr(0L),
        ): McastLeaseRequest =
            McastLeaseRequest(
                leaseStartTime = leaseStartTime,
                maxLeaseStartTime = maxLeaseStartTime,
                leaseDuration = leaseDuration,
                minLeaseDuration = minLeaseDuration,
                serverAddress = serverAddress,
                minAddrCount = minAddrCount,
                addrCount = addrCount,
                pAddrBufCtorArg = pAddrBuf,
            )
    }
}

public class McastLeaseResponse internal constructor(
    public var leaseStartTime: Int,
    public var leaseEndTime: Int,
    public var serverAddress: IpngAddress,
    public var addrCount: UShort,
    pAddrBufCtorArg: MutPtr,
) {
    public var pAddrBuf: MutPtr = pAddrBufCtorArg
        internal set

    public constructor() : this(
        leaseStartTime = 0,
        leaseEndTime = 0,
        serverAddress = IpngAddress(),
        addrCount = 0u,
        pAddrBufCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.leaseStartTime

    public operator fun component2(): Int = this.leaseEndTime

    public operator fun component3(): IpngAddress = this.serverAddress

    public operator fun component4(): UShort = this.addrCount

    public operator fun component5(): MutPtr = this.pAddrBuf

    public fun copy(leaseStartTime: Int = this.leaseStartTime, leaseEndTime: Int = this.leaseEndTime, serverAddress: IpngAddress = this.serverAddress, addrCount: UShort = this.addrCount, pAddrBuf: MutPtr = this.pAddrBuf): McastLeaseResponse = McastLeaseResponse(leaseStartTime = leaseStartTime, leaseEndTime = leaseEndTime, serverAddress = serverAddress, addrCount = addrCount, pAddrBufCtorArg = pAddrBuf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McastLeaseResponse) return false
        if (this.leaseStartTime != other.leaseStartTime) return false
        if (this.leaseEndTime != other.leaseEndTime) return false
        if (this.serverAddress != other.serverAddress) return false
        if (this.addrCount != other.addrCount) return false
        if (this.pAddrBuf != other.pAddrBuf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.leaseStartTime.hashCode()
        result = 31 * result + this.leaseEndTime.hashCode()
        result = 31 * result + this.serverAddress.hashCode()
        result = 31 * result + this.addrCount.hashCode()
        result = 31 * result + this.pAddrBuf.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            leaseStartTime: Int = 0,
            leaseEndTime: Int = 0,
            serverAddress: IpngAddress = IpngAddress(),
            addrCount: UShort = 0u,
            pAddrBuf: MutPtr = MutPtr(0L),
        ): McastLeaseResponse =
            McastLeaseResponse(
                leaseStartTime = leaseStartTime,
                leaseEndTime = leaseEndTime,
                serverAddress = serverAddress,
                addrCount = addrCount,
                pAddrBufCtorArg = pAddrBuf,
            )
    }
}

public data class McastScopeCtx(
    public var scopeID: IpngAddress = IpngAddress(),
    public var iface: IpngAddress = IpngAddress(),
    public var serverID: IpngAddress = IpngAddress(),
)

public data class McastScopeEntry(
    public var scopeCtx: McastScopeCtx = McastScopeCtx(),
    public var lastAddr: IpngAddress = IpngAddress(),
    public var ttl: UInt = 0u,
    public var scopeDesc: UnicodeString = UnicodeString(),
)
