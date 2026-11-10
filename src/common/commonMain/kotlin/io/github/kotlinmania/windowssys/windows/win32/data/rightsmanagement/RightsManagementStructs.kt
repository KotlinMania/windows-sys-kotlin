@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pwstr

public data class Drmboundlicenseparams(
    public var uVersion: UInt = 0u,
    public var hEnablingPrincipal: UInt = 0u,
    public var hSecureStore: UInt = 0u,
    public var wszRightsRequested: Pwstr = null,
    public var wszRightsGroup: Pwstr = null,
    public var idResource: Drmid = Drmid(),
    public var cAuthenticatorCount: UInt = 0u,
    public var rghAuthenticators: UInt? = null,
    public var wszDefaultEnablingPrincipalCredentials: Pwstr = null,
    public var dwFlags: UInt = 0u,
)

public data class Drmid(
    public var uVersion: UInt = 0u,
    public var wszIDType: Pwstr = null,
    public var wszID: Pwstr = null,
)

public data class DrmActservInfo(
    public var uVersion: UInt = 0u,
    public var wszPubKey: Pwstr = null,
    public var wszURL: Pwstr = null,
)

public data class DrmClientVersionInfo(
    public var uStructVersion: UInt = 0u,
    public var dwVersion: UIntArray = UIntArray(4),
    public var wszHierarchy: UShortArray = UShortArray(256),
    public var wszProductId: UShortArray = UShortArray(256),
    public var wszProductDescription: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrmClientVersionInfo) return false
        if (this.uStructVersion != other.uStructVersion) return false
        if (!this.dwVersion.contentEquals(other.dwVersion)) return false
        if (!this.wszHierarchy.contentEquals(other.wszHierarchy)) return false
        if (!this.wszProductId.contentEquals(other.wszProductId)) return false
        if (!this.wszProductDescription.contentEquals(other.wszProductDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uStructVersion.hashCode()
        result = 31 * result + this.dwVersion.contentHashCode()
        result = 31 * result + this.wszHierarchy.contentHashCode()
        result = 31 * result + this.wszProductId.contentHashCode()
        result = 31 * result + this.wszProductDescription.contentHashCode()
        return result
    }
}

public data class DrmLicenseAcqData(
    public var uVersion: UInt = 0u,
    public var wszURL: Pwstr = null,
    public var wszLocalFilename: Pwstr = null,
    public var pbPostData: COpaquePointer? = null,
    public var dwPostDataSize: UInt = 0u,
    public var wszFriendlyName: Pwstr = null,
)
