@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

public data class IPNG_ADDRESS(public var IpAddrV4: UInt = 0u, public var IpAddrV6: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPNG_ADDRESS) return false
        if (this.IpAddrV4 != other.IpAddrV4) return false
        if (!this.IpAddrV6.contentEquals(other.IpAddrV6)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.IpAddrV4.hashCode()
        result = 31 * result + this.IpAddrV6.contentHashCode()
        return result
    }
}

public data class MCAST_CLIENT_UID(public var ClientUID: Long = 0L, public var ClientUIDLength: UInt = 0u)

public data class MCAST_LEASE_REQUEST(
    public var LeaseStartTime: Int = 0,
    public var MaxLeaseStartTime: Int = 0,
    public var LeaseDuration: UInt = 0u,
    public var MinLeaseDuration: UInt = 0u,
    public var ServerAddress: IPNG_ADDRESS = IPNG_ADDRESS(),
    public var MinAddrCount: UShort = 0u,
    public var AddrCount: UShort = 0u,
    public var pAddrBuf: Long = 0L,
)

public data class MCAST_LEASE_RESPONSE(
    public var LeaseStartTime: Int = 0,
    public var LeaseEndTime: Int = 0,
    public var ServerAddress: IPNG_ADDRESS = IPNG_ADDRESS(),
    public var AddrCount: UShort = 0u,
    public var pAddrBuf: Long = 0L,
)

public data class MCAST_SCOPE_CTX(
    public var ScopeID: IPNG_ADDRESS = IPNG_ADDRESS(),
    public var Interface: IPNG_ADDRESS = IPNG_ADDRESS(),
    public var ServerID: IPNG_ADDRESS = IPNG_ADDRESS(),
)

public data class MCAST_SCOPE_ENTRY(
    public var ScopeCtx: MCAST_SCOPE_CTX = MCAST_SCOPE_CTX(),
    public var LastAddr: IPNG_ADDRESS = IPNG_ADDRESS(),
    public var TTL: UInt = 0u,
    public var ScopeDesc: Foundation.UNICODE_STRING = Foundation.UNICODE_STRING(),
)
