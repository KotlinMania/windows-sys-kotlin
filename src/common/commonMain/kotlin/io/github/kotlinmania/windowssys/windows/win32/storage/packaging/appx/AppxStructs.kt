package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class APPX_ENCRYPTED_EXEMPTIONS(public var count: UInt = 0u, public var plainTextFiles: Long = 0L)

public data class APPX_ENCRYPTED_PACKAGE_SETTINGS(
    public var keyLength: UInt = 0u,
    public var encryptionAlgorithm: PCWSTR = 0L,
    public var useDiffusion: BOOL = 0,
    public var blockMapHashAlgorithm: Long = 0L,
)

public data class APPX_ENCRYPTED_PACKAGE_SETTINGS2(
    public var keyLength: UInt = 0u,
    public var encryptionAlgorithm: PCWSTR = 0L,
    public var blockMapHashAlgorithm: Long = 0L,
    public var options: UInt = 0u,
)

public data class APPX_KEY_INFO(
    public var keyLength: UInt = 0u,
    public var keyIdLength: UInt = 0u,
    public var key: Long = 0L,
    public var keyId: Long = 0L,
)

public data class APPX_PACKAGE_SETTINGS(public var forceZip32: BOOL = 0, public var hashMethod: Long = 0L)

public data class APPX_PACKAGE_WRITER_PAYLOAD_STREAM(
    public var inputStream: Long = 0L,
    public var fileName: PCWSTR = 0L,
    public var contentType: PCWSTR = 0L,
    public var compressionOption: APPX_COMPRESSION_OPTION = 0,
)

public data class PACKAGE_ID(
    public var reserved: UInt = 0u,
    public var processorArchitecture: UInt = 0u,
    public var version: PACKAGE_VERSION = PACKAGE_VERSION(),
    public var name: PWSTR = 0L,
    public var publisher: PWSTR = 0L,
    public var resourceId: PWSTR = 0L,
    public var publisherId: PWSTR = 0L,
)

public data class PACKAGE_INFO(
    public var reserved: UInt = 0u,
    public var flags: UInt = 0u,
    public var path: PWSTR = 0L,
    public var packageFullName: PWSTR = 0L,
    public var packageFamilyName: PWSTR = 0L,
    public var packageId: PACKAGE_ID = PACKAGE_ID(),
)

public data class PACKAGE_VERSION(public var Anonymous: PACKAGE_VERSION_0 = PACKAGE_VERSION_0())

public data class PACKAGE_VERSION_0(public var Version: ULong = 0uL, public var Anonymous: PACKAGE_VERSION_0_0 = PACKAGE_VERSION_0_0())

public data class PACKAGE_VERSION_0_0(
    public var Revision: UShort = 0u,
    public var Build: UShort = 0u,
    public var Minor: UShort = 0u,
    public var Major: UShort = 0u,
)

public data class _PACKAGE_INFO_REFERENCE(public var reserved: Long = 0L)
