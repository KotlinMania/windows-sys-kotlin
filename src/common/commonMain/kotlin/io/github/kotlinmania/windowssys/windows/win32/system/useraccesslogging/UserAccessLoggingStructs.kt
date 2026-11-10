@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage

public data class UalDataBlob(
    public var size: UInt = 0u,
    public var roleGuid: Guid = Guid(),
    public var tenantId: Guid = Guid(),
    public var address: SockaddrStorage = SockaddrStorage(),
    public var userName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UalDataBlob) return false
        if (this.size != other.size) return false
        if (this.roleGuid != other.roleGuid) return false
        if (this.tenantId != other.tenantId) return false
        if (this.address != other.address) return false
        if (!this.userName.contentEquals(other.userName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.roleGuid.hashCode()
        result = 31 * result + this.tenantId.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.userName.contentHashCode()
        return result
    }
}
