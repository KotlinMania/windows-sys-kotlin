@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.core.PWSTR

public data class DRMBOUNDLICENSEPARAMS(
    public var uVersion: UInt = 0u,
    public var hEnablingPrincipal: UInt = 0u,
    public var hSecureStore: UInt = 0u,
    public var wszRightsRequested: PWSTR = 0L,
    public var wszRightsGroup: PWSTR = 0L,
    public var idResource: DRMID = DRMID(),
    public var cAuthenticatorCount: UInt = 0u,
    public var rghAuthenticators: Long = 0L,
    public var wszDefaultEnablingPrincipalCredentials: PWSTR = 0L,
    public var dwFlags: UInt = 0u,
)

public data class DRMID(
    public var uVersion: UInt = 0u,
    public var wszIDType: PWSTR = 0L,
    public var wszID: PWSTR = 0L,
)

public data class DRM_ACTSERV_INFO(
    public var uVersion: UInt = 0u,
    public var wszPubKey: PWSTR = 0L,
    public var wszURL: PWSTR = 0L,
)

public data class DRM_CLIENT_VERSION_INFO(
    public var uStructVersion: UInt = 0u,
    public var dwVersion: UIntArray = UIntArray(4),
    public var wszHierarchy: UShortArray = UShortArray(256),
    public var wszProductId: UShortArray = UShortArray(256),
    public var wszProductDescription: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DRM_CLIENT_VERSION_INFO) return false
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

public data class DRM_LICENSE_ACQ_DATA(
    public var uVersion: UInt = 0u,
    public var wszURL: PWSTR = 0L,
    public var wszLocalFilename: PWSTR = 0L,
    public var pbPostData: Long = 0L,
    public var dwPostDataSize: UInt = 0u,
    public var wszFriendlyName: PWSTR = 0L,
)
