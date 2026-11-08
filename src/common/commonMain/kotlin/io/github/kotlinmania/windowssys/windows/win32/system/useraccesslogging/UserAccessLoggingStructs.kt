@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKADDR_STORAGE

public data class UAL_DATA_BLOB(
    public var Size: UInt = 0u,
    public var RoleGuid: GUID = GUID(),
    public var TenantId: GUID = GUID(),
    public var Address: SOCKADDR_STORAGE = SOCKADDR_STORAGE(),
    public var UserName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UAL_DATA_BLOB) return false
        if (this.Size != other.Size) return false
        if (this.RoleGuid != other.RoleGuid) return false
        if (this.TenantId != other.TenantId) return false
        if (this.Address != other.Address) return false
        if (!this.UserName.contentEquals(other.UserName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.RoleGuid.hashCode()
        result = 31 * result + this.TenantId.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.UserName.contentHashCode()
        return result
    }
}
