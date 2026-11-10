package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class AppxEncryptedExemptions(
    public var count: UInt = 0u,
    public var plainTextFiles: Pcwstr? = null,
)

public data class AppxEncryptedPackageSettings(
    public var keyLength: UInt = 0u,
    public var encryptionAlgorithm: Pcwstr = null,
    public var useDiffusion: Bool = 0,
    public var blockMapHashAlgorithm: COpaquePointer? = null,
)

public data class AppxEncryptedPackageSettings2(
    public var keyLength: UInt = 0u,
    public var encryptionAlgorithm: Pcwstr = null,
    public var blockMapHashAlgorithm: COpaquePointer? = null,
    public var options: UInt = 0u,
)

public data class AppxKeyInfo(
    public var keyLength: UInt = 0u,
    public var keyIdLength: UInt = 0u,
    public var key: COpaquePointer? = null,
    public var keyId: COpaquePointer? = null,
)

public data class AppxPackageSettings(
    public var forceZip32: Bool = 0,
    public var hashMethod: COpaquePointer? = null,
)

public data class AppxPackageWriterPayloadStream(
    public var inputStream: COpaquePointer? = null,
    public var fileName: Pcwstr = null,
    public var contentType: Pcwstr = null,
    public var compressionOption: AppxCompressionOption = 0,
)

public data class PackageId(
    public var reserved: UInt = 0u,
    public var processorArchitecture: UInt = 0u,
    public var version: PackageVersion = PackageVersion(),
    public var name: Pwstr = null,
    public var publisher: Pwstr = null,
    public var resourceId: Pwstr = null,
    public var publisherId: Pwstr = null,
)

public data class PackageInfo(
    public var reserved: UInt = 0u,
    public var flags: UInt = 0u,
    public var path: Pwstr = null,
    public var packageFullName: Pwstr = null,
    public var packageFamilyName: Pwstr = null,
    public var packageId: PackageId = PackageId(),
)

public data class PackageVersion(
    public var anonymous: PackageVersion0 = PackageVersion0(),
)

public data class PackageVersion0(
    public var version: ULong = 0uL,
    public var anonymous: PackageVersion00 = PackageVersion00(),
)

public data class PackageVersion00(
    public var revision: UShort = 0u,
    public var build: UShort = 0u,
    public var minor: UShort = 0u,
    public var major: UShort = 0u,
)

public data class PackageInfoReference(
    public var reserved: COpaquePointer? = null,
)
