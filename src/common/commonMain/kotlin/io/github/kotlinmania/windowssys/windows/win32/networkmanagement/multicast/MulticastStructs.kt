@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.COpaquePointer
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

public data class McastClientUid(
    public var clientUID: COpaquePointer? = null,
    public var clientUIDLength: UInt = 0u,
)

public data class McastLeaseRequest(
    public var leaseStartTime: Int = 0,
    public var maxLeaseStartTime: Int = 0,
    public var leaseDuration: UInt = 0u,
    public var minLeaseDuration: UInt = 0u,
    public var serverAddress: IpngAddress = IpngAddress(),
    public var minAddrCount: UShort = 0u,
    public var addrCount: UShort = 0u,
    public var pAddrBuf: COpaquePointer? = null,
)

public data class McastLeaseResponse(
    public var leaseStartTime: Int = 0,
    public var leaseEndTime: Int = 0,
    public var serverAddress: IpngAddress = IpngAddress(),
    public var addrCount: UShort = 0u,
    public var pAddrBuf: COpaquePointer? = null,
)

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
