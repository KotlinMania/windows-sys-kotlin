@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ALG_ID

public data class SAFER_CODE_PROPERTIES_V1(
    public var cbSize: UInt = 0u,
    public var dwCheckFlags: UInt = 0u,
    public var ImagePath: PCWSTR = 0L,
    public var hImageFileHandle: HANDLE = 0L,
    public var UrlZoneId: UInt = 0u,
    public var ImageHash: UByteArray = UByteArray(64),
    public var dwImageHashSize: UInt = 0u,
    public var ImageSize: Long = 0L,
    public var HashAlgorithm: ALG_ID = 0u,
    public var pByteBlock: Long = 0L,
    public var hWndParent: HWND = 0L,
    public var dwWVTUIChoice: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SAFER_CODE_PROPERTIES_V1) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwCheckFlags != other.dwCheckFlags) return false
        if (this.ImagePath != other.ImagePath) return false
        if (this.hImageFileHandle != other.hImageFileHandle) return false
        if (this.UrlZoneId != other.UrlZoneId) return false
        if (!this.ImageHash.contentEquals(other.ImageHash)) return false
        if (this.dwImageHashSize != other.dwImageHashSize) return false
        if (this.ImageSize != other.ImageSize) return false
        if (this.HashAlgorithm != other.HashAlgorithm) return false
        if (this.pByteBlock != other.pByteBlock) return false
        if (this.hWndParent != other.hWndParent) return false
        if (this.dwWVTUIChoice != other.dwWVTUIChoice) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwCheckFlags.hashCode()
        result = 31 * result + this.ImagePath.hashCode()
        result = 31 * result + this.hImageFileHandle.hashCode()
        result = 31 * result + this.UrlZoneId.hashCode()
        result = 31 * result + this.ImageHash.contentHashCode()
        result = 31 * result + this.dwImageHashSize.hashCode()
        result = 31 * result + this.ImageSize.hashCode()
        result = 31 * result + this.HashAlgorithm.hashCode()
        result = 31 * result + this.pByteBlock.hashCode()
        result = 31 * result + this.hWndParent.hashCode()
        result = 31 * result + this.dwWVTUIChoice.hashCode()
        return result
    }
}

public class SAFER_CODE_PROPERTIES_V2(
    public var cbSize: UInt = 0u,
    public var dwCheckFlags: UInt = 0u,
    public var ImagePath: PCWSTR = 0L,
    public var hImageFileHandle: HANDLE = 0L,
    public var UrlZoneId: UInt = 0u,
    public var ImageHash: UByteArray = UByteArray(64),
    public var dwImageHashSize: UInt = 0u,
    public var ImageSize: Long = 0L,
    public var HashAlgorithm: ALG_ID = 0u,
    public var pByteBlock: Long = 0L,
    public var hWndParent: HWND = 0L,
    public var dwWVTUIChoice: UInt = 0u,
    public var PackageMoniker: PCWSTR = 0L,
    public var PackagePublisher: PCWSTR = 0L,
    public var PackageName: PCWSTR = 0L,
    public var PackageVersion: ULong = 0uL,
    public var PackageIsFramework: BOOL = 0,
)

public data class SAFER_HASH_IDENTIFICATION(
    public var header: SAFER_IDENTIFICATION_HEADER = SAFER_IDENTIFICATION_HEADER(),
    public var Description: UShortArray = UShortArray(256),
    public var FriendlyName: UShortArray = UShortArray(256),
    public var HashSize: UInt = 0u,
    public var ImageHash: UByteArray = UByteArray(64),
    public var HashAlgorithm: ALG_ID = 0u,
    public var ImageSize: Long = 0L,
    public var dwSaferFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SAFER_HASH_IDENTIFICATION) return false
        if (this.header != other.header) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (!this.FriendlyName.contentEquals(other.FriendlyName)) return false
        if (this.HashSize != other.HashSize) return false
        if (!this.ImageHash.contentEquals(other.ImageHash)) return false
        if (this.HashAlgorithm != other.HashAlgorithm) return false
        if (this.ImageSize != other.ImageSize) return false
        if (this.dwSaferFlags != other.dwSaferFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.FriendlyName.contentHashCode()
        result = 31 * result + this.HashSize.hashCode()
        result = 31 * result + this.ImageHash.contentHashCode()
        result = 31 * result + this.HashAlgorithm.hashCode()
        result = 31 * result + this.ImageSize.hashCode()
        result = 31 * result + this.dwSaferFlags.hashCode()
        return result
    }
}

public data class SAFER_HASH_IDENTIFICATION2(
    public var hashIdentification: SAFER_HASH_IDENTIFICATION = SAFER_HASH_IDENTIFICATION(),
    public var HashSize: UInt = 0u,
    public var ImageHash: UByteArray = UByteArray(64),
    public var HashAlgorithm: ALG_ID = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SAFER_HASH_IDENTIFICATION2) return false
        if (this.hashIdentification != other.hashIdentification) return false
        if (this.HashSize != other.HashSize) return false
        if (!this.ImageHash.contentEquals(other.ImageHash)) return false
        if (this.HashAlgorithm != other.HashAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hashIdentification.hashCode()
        result = 31 * result + this.HashSize.hashCode()
        result = 31 * result + this.ImageHash.contentHashCode()
        result = 31 * result + this.HashAlgorithm.hashCode()
        return result
    }
}

public data class SAFER_IDENTIFICATION_HEADER(
    public var dwIdentificationType: SAFER_IDENTIFICATION_TYPES = 0,
    public var cbStructSize: UInt = 0u,
    public var IdentificationGuid: GUID = GUID(),
    public var lastModified: FILETIME = FILETIME(),
)

public data class SAFER_PATHNAME_IDENTIFICATION(
    public var header: SAFER_IDENTIFICATION_HEADER = SAFER_IDENTIFICATION_HEADER(),
    public var Description: UShortArray = UShortArray(256),
    public var ImageName: PWSTR = 0L,
    public var dwSaferFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SAFER_PATHNAME_IDENTIFICATION) return false
        if (this.header != other.header) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (this.ImageName != other.ImageName) return false
        if (this.dwSaferFlags != other.dwSaferFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.ImageName.hashCode()
        result = 31 * result + this.dwSaferFlags.hashCode()
        return result
    }
}

public data class SAFER_URLZONE_IDENTIFICATION(
    public var header: SAFER_IDENTIFICATION_HEADER = SAFER_IDENTIFICATION_HEADER(),
    public var UrlZoneId: UInt = 0u,
    public var dwSaferFlags: UInt = 0u,
)
