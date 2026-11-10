@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId

public data class SaferCodePropertiesV1(
    public var cbSize: UInt = 0u,
    public var dwCheckFlags: UInt = 0u,
    public var imagePath: Pcwstr = null,
    public var hImageFileHandle: Handle = null,
    public var urlZoneId: UInt = 0u,
    public var imageHash: UByteArray = UByteArray(64),
    public var dwImageHashSize: UInt = 0u,
    public var imageSize: Long = 0L,
    public var hashAlgorithm: AlgId = 0u,
    public var pByteBlock: COpaquePointer? = null,
    public var hWndParent: Hwnd = null,
    public var dwWVTUIChoice: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SaferCodePropertiesV1) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwCheckFlags != other.dwCheckFlags) return false
        if (this.imagePath != other.imagePath) return false
        if (this.hImageFileHandle != other.hImageFileHandle) return false
        if (this.urlZoneId != other.urlZoneId) return false
        if (!this.imageHash.contentEquals(other.imageHash)) return false
        if (this.dwImageHashSize != other.dwImageHashSize) return false
        if (this.imageSize != other.imageSize) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.pByteBlock != other.pByteBlock) return false
        if (this.hWndParent != other.hWndParent) return false
        if (this.dwWVTUIChoice != other.dwWVTUIChoice) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwCheckFlags.hashCode()
        result = 31 * result + this.imagePath.hashCode()
        result = 31 * result + this.hImageFileHandle.hashCode()
        result = 31 * result + this.urlZoneId.hashCode()
        result = 31 * result + this.imageHash.contentHashCode()
        result = 31 * result + this.dwImageHashSize.hashCode()
        result = 31 * result + this.imageSize.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.pByteBlock.hashCode()
        result = 31 * result + this.hWndParent.hashCode()
        result = 31 * result + this.dwWVTUIChoice.hashCode()
        return result
    }
}

public class SaferCodePropertiesV2(
    public var cbSize: UInt = 0u,
    public var dwCheckFlags: UInt = 0u,
    public var imagePath: Pcwstr = null,
    public var hImageFileHandle: Handle = null,
    public var urlZoneId: UInt = 0u,
    public var imageHash: UByteArray = UByteArray(64),
    public var dwImageHashSize: UInt = 0u,
    public var imageSize: Long = 0L,
    public var hashAlgorithm: AlgId = 0u,
    public var pByteBlock: COpaquePointer? = null,
    public var hWndParent: Hwnd = null,
    public var dwWVTUIChoice: UInt = 0u,
    public var packageMoniker: Pcwstr = null,
    public var packagePublisher: Pcwstr = null,
    public var packageName: Pcwstr = null,
    public var packageVersion: ULong = 0uL,
    public var packageIsFramework: Bool = 0,
)

public data class SaferHashIdentification(
    public var header: SaferIdentificationHeader = SaferIdentificationHeader(),
    public var description: UShortArray = UShortArray(256),
    public var friendlyName: UShortArray = UShortArray(256),
    public var hashSize: UInt = 0u,
    public var imageHash: UByteArray = UByteArray(64),
    public var hashAlgorithm: AlgId = 0u,
    public var imageSize: Long = 0L,
    public var dwSaferFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SaferHashIdentification) return false
        if (this.header != other.header) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.friendlyName.contentEquals(other.friendlyName)) return false
        if (this.hashSize != other.hashSize) return false
        if (!this.imageHash.contentEquals(other.imageHash)) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.imageSize != other.imageSize) return false
        if (this.dwSaferFlags != other.dwSaferFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.friendlyName.contentHashCode()
        result = 31 * result + this.hashSize.hashCode()
        result = 31 * result + this.imageHash.contentHashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.imageSize.hashCode()
        result = 31 * result + this.dwSaferFlags.hashCode()
        return result
    }
}

public data class SaferHashIdentification2(
    public var hashIdentification: SaferHashIdentification = SaferHashIdentification(),
    public var hashSize: UInt = 0u,
    public var imageHash: UByteArray = UByteArray(64),
    public var hashAlgorithm: AlgId = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SaferHashIdentification2) return false
        if (this.hashIdentification != other.hashIdentification) return false
        if (this.hashSize != other.hashSize) return false
        if (!this.imageHash.contentEquals(other.imageHash)) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hashIdentification.hashCode()
        result = 31 * result + this.hashSize.hashCode()
        result = 31 * result + this.imageHash.contentHashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        return result
    }
}

public data class SaferIdentificationHeader(
    public var dwIdentificationType: SaferIdentificationTypes = 0,
    public var cbStructSize: UInt = 0u,
    public var identificationGuid: Guid = Guid(),
    public var lastModified: Filetime = Filetime(),
)

public data class SaferPathnameIdentification(
    public var header: SaferIdentificationHeader = SaferIdentificationHeader(),
    public var description: UShortArray = UShortArray(256),
    public var imageName: Pwstr = null,
    public var dwSaferFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SaferPathnameIdentification) return false
        if (this.header != other.header) return false
        if (!this.description.contentEquals(other.description)) return false
        if (this.imageName != other.imageName) return false
        if (this.dwSaferFlags != other.dwSaferFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.imageName.hashCode()
        result = 31 * result + this.dwSaferFlags.hashCode()
        return result
    }
}

public data class SaferUrlzoneIdentification(
    public var header: SaferIdentificationHeader = SaferIdentificationHeader(),
    public var urlZoneId: UInt = 0u,
    public var dwSaferFlags: UInt = 0u,
)
