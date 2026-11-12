@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId

public class SaferCodePropertiesV1 internal constructor(
    public var cbSize: UInt,
    public var dwCheckFlags: UInt,
    imagePathCtorArg: Pcwstr,
    hImageFileHandleCtorArg: Handle,
    public var urlZoneId: UInt,
    public var imageHash: UByteArray,
    public var dwImageHashSize: UInt,
    public var imageSize: Long,
    public var hashAlgorithm: AlgId,
    pByteBlockCtorArg: MutPtr<UByte>,
    hWndParentCtorArg: Hwnd,
    public var dwWVTUIChoice: UInt,
) {
    public var imagePath: Pcwstr = imagePathCtorArg
        internal set

    public var hImageFileHandle: Handle = hImageFileHandleCtorArg
        internal set

    public var pByteBlock: MutPtr<UByte> = pByteBlockCtorArg
        internal set

    public var hWndParent: Hwnd = hWndParentCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwCheckFlags = 0u,
        imagePathCtorArg = ConstPtr(0L),
        hImageFileHandleCtorArg = MutPtr(0L),
        urlZoneId = 0u,
        imageHash = UByteArray(64),
        dwImageHashSize = 0u,
        imageSize = 0L,
        hashAlgorithm = 0u,
        pByteBlockCtorArg = MutPtr(0L),
        hWndParentCtorArg = MutPtr(0L),
        dwWVTUIChoice = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwCheckFlags

    public operator fun component3(): Pcwstr = this.imagePath

    public operator fun component4(): Handle = this.hImageFileHandle

    public operator fun component5(): UInt = this.urlZoneId

    public operator fun component6(): UByteArray = this.imageHash

    public operator fun component7(): UInt = this.dwImageHashSize

    public operator fun component8(): Long = this.imageSize

    public operator fun component9(): AlgId = this.hashAlgorithm

    public operator fun component10(): MutPtr<UByte> = this.pByteBlock

    public operator fun component11(): Hwnd = this.hWndParent

    public operator fun component12(): UInt = this.dwWVTUIChoice

    public fun copy(cbSize: UInt = this.cbSize, dwCheckFlags: UInt = this.dwCheckFlags, imagePath: Pcwstr = this.imagePath, hImageFileHandle: Handle = this.hImageFileHandle, urlZoneId: UInt = this.urlZoneId, imageHash: UByteArray = this.imageHash, dwImageHashSize: UInt = this.dwImageHashSize, imageSize: Long = this.imageSize, hashAlgorithm: AlgId = this.hashAlgorithm, pByteBlock: MutPtr<UByte> = this.pByteBlock, hWndParent: Hwnd = this.hWndParent, dwWVTUIChoice: UInt = this.dwWVTUIChoice): SaferCodePropertiesV1 = SaferCodePropertiesV1(cbSize = cbSize, dwCheckFlags = dwCheckFlags, imagePathCtorArg = imagePath, hImageFileHandleCtorArg = hImageFileHandle, urlZoneId = urlZoneId, imageHash = imageHash, dwImageHashSize = dwImageHashSize, imageSize = imageSize, hashAlgorithm = hashAlgorithm, pByteBlockCtorArg = pByteBlock, hWndParentCtorArg = hWndParent, dwWVTUIChoice = dwWVTUIChoice)

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

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwCheckFlags: UInt = 0u,
            imagePath: Pcwstr = ConstPtr(0L),
            hImageFileHandle: Handle = MutPtr(0L),
            urlZoneId: UInt = 0u,
            imageHash: UByteArray = UByteArray(64),
            dwImageHashSize: UInt = 0u,
            imageSize: Long = 0L,
            hashAlgorithm: AlgId = 0u,
            pByteBlock: MutPtr<UByte> = MutPtr(0L),
            hWndParent: Hwnd = MutPtr(0L),
            dwWVTUIChoice: UInt = 0u,
        ): SaferCodePropertiesV1 =
            SaferCodePropertiesV1(
                cbSize = cbSize,
                dwCheckFlags = dwCheckFlags,
                imagePathCtorArg = imagePath,
                hImageFileHandleCtorArg = hImageFileHandle,
                urlZoneId = urlZoneId,
                imageHash = imageHash,
                dwImageHashSize = dwImageHashSize,
                imageSize = imageSize,
                hashAlgorithm = hashAlgorithm,
                pByteBlockCtorArg = pByteBlock,
                hWndParentCtorArg = hWndParent,
                dwWVTUIChoice = dwWVTUIChoice,
            )
    }
}

public class SaferCodePropertiesV2 internal constructor(
    public var cbSize: UInt,
    public var dwCheckFlags: UInt,
    imagePathCtorArg: Pcwstr,
    hImageFileHandleCtorArg: Handle,
    public var urlZoneId: UInt,
    public var imageHash: UByteArray,
    public var dwImageHashSize: UInt,
    public var imageSize: Long,
    public var hashAlgorithm: AlgId,
    pByteBlockCtorArg: MutPtr<UByte>,
    hWndParentCtorArg: Hwnd,
    public var dwWVTUIChoice: UInt,
    packageMonikerCtorArg: Pcwstr,
    packagePublisherCtorArg: Pcwstr,
    packageNameCtorArg: Pcwstr,
    public var packageVersion: ULong,
    public var packageIsFramework: Bool,
) {
    public var imagePath: Pcwstr = imagePathCtorArg
        internal set

    public var hImageFileHandle: Handle = hImageFileHandleCtorArg
        internal set

    public var pByteBlock: MutPtr<UByte> = pByteBlockCtorArg
        internal set

    public var hWndParent: Hwnd = hWndParentCtorArg
        internal set

    public var packageMoniker: Pcwstr = packageMonikerCtorArg
        internal set

    public var packagePublisher: Pcwstr = packagePublisherCtorArg
        internal set

    public var packageName: Pcwstr = packageNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwCheckFlags = 0u,
        imagePathCtorArg = ConstPtr(0L),
        hImageFileHandleCtorArg = MutPtr(0L),
        urlZoneId = 0u,
        imageHash = UByteArray(64),
        dwImageHashSize = 0u,
        imageSize = 0L,
        hashAlgorithm = 0u,
        pByteBlockCtorArg = MutPtr(0L),
        hWndParentCtorArg = MutPtr(0L),
        dwWVTUIChoice = 0u,
        packageMonikerCtorArg = ConstPtr(0L),
        packagePublisherCtorArg = ConstPtr(0L),
        packageNameCtorArg = ConstPtr(0L),
        packageVersion = 0uL,
        packageIsFramework = 0,
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwCheckFlags: UInt = 0u,
            imagePath: Pcwstr = ConstPtr(0L),
            hImageFileHandle: Handle = MutPtr(0L),
            urlZoneId: UInt = 0u,
            imageHash: UByteArray = UByteArray(64),
            dwImageHashSize: UInt = 0u,
            imageSize: Long = 0L,
            hashAlgorithm: AlgId = 0u,
            pByteBlock: MutPtr<UByte> = MutPtr(0L),
            hWndParent: Hwnd = MutPtr(0L),
            dwWVTUIChoice: UInt = 0u,
            packageMoniker: Pcwstr = ConstPtr(0L),
            packagePublisher: Pcwstr = ConstPtr(0L),
            packageName: Pcwstr = ConstPtr(0L),
            packageVersion: ULong = 0uL,
            packageIsFramework: Bool = 0,
        ): SaferCodePropertiesV2 =
            SaferCodePropertiesV2(
                cbSize = cbSize,
                dwCheckFlags = dwCheckFlags,
                imagePathCtorArg = imagePath,
                hImageFileHandleCtorArg = hImageFileHandle,
                urlZoneId = urlZoneId,
                imageHash = imageHash,
                dwImageHashSize = dwImageHashSize,
                imageSize = imageSize,
                hashAlgorithm = hashAlgorithm,
                pByteBlockCtorArg = pByteBlock,
                hWndParentCtorArg = hWndParent,
                dwWVTUIChoice = dwWVTUIChoice,
                packageMonikerCtorArg = packageMoniker,
                packagePublisherCtorArg = packagePublisher,
                packageNameCtorArg = packageName,
                packageVersion = packageVersion,
                packageIsFramework = packageIsFramework,
            )
    }
}

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

public class SaferPathnameIdentification internal constructor(
    public var header: SaferIdentificationHeader,
    public var description: UShortArray,
    imageNameCtorArg: Pwstr,
    public var dwSaferFlags: UInt,
) {
    public var imageName: Pwstr = imageNameCtorArg
        internal set

    public constructor() : this(
        header = SaferIdentificationHeader(),
        description = UShortArray(256),
        imageNameCtorArg = MutPtr(0L),
        dwSaferFlags = 0u,
    )

    public operator fun component1(): SaferIdentificationHeader = this.header

    public operator fun component2(): UShortArray = this.description

    public operator fun component3(): Pwstr = this.imageName

    public operator fun component4(): UInt = this.dwSaferFlags

    public fun copy(header: SaferIdentificationHeader = this.header, description: UShortArray = this.description, imageName: Pwstr = this.imageName, dwSaferFlags: UInt = this.dwSaferFlags): SaferPathnameIdentification = SaferPathnameIdentification(header = header, description = description, imageNameCtorArg = imageName, dwSaferFlags = dwSaferFlags)

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

    public companion object {
        public operator fun invoke(
            header: SaferIdentificationHeader = SaferIdentificationHeader(),
            description: UShortArray = UShortArray(256),
            imageName: Pwstr = MutPtr(0L),
            dwSaferFlags: UInt = 0u,
        ): SaferPathnameIdentification =
            SaferPathnameIdentification(
                header = header,
                description = description,
                imageNameCtorArg = imageName,
                dwSaferFlags = dwSaferFlags,
            )
    }
}

public data class SaferUrlzoneIdentification(
    public var header: SaferIdentificationHeader = SaferIdentificationHeader(),
    public var urlZoneId: UInt = 0u,
    public var dwSaferFlags: UInt = 0u,
)
