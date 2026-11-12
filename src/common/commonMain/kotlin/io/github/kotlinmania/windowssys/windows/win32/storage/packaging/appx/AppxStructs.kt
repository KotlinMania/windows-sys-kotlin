package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public class AppxEncryptedExemptions internal constructor(
    public var count: UInt,
    plainTextFilesCtorArg: ConstPtr<Pcwstr>,
) {
    public var plainTextFiles: ConstPtr<Pcwstr> = plainTextFilesCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        plainTextFilesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): ConstPtr<Pcwstr> = this.plainTextFiles

    public fun copy(count: UInt = this.count, plainTextFiles: ConstPtr<Pcwstr> = this.plainTextFiles): AppxEncryptedExemptions = AppxEncryptedExemptions(count = count, plainTextFilesCtorArg = plainTextFiles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppxEncryptedExemptions) return false
        if (this.count != other.count) return false
        if (this.plainTextFiles != other.plainTextFiles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.plainTextFiles.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppxEncryptedExemptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppxEncryptedExemptions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AppxEncryptedExemptions =
                    AppxEncryptedExemptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Pcwstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AppxEncryptedExemptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Pcwstr>(64)
                    ).writeNative(addr + 8L, value.plainTextFiles)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            plainTextFiles: ConstPtr<Pcwstr> = ConstPtr(0L),
        ): AppxEncryptedExemptions =
            AppxEncryptedExemptions(
                count = count,
                plainTextFilesCtorArg = plainTextFiles,
            )
    }
}

public class AppxEncryptedPackageSettings internal constructor(
    public var keyLength: UInt,
    encryptionAlgorithmCtorArg: Pcwstr,
    public var useDiffusion: Bool,
    blockMapHashAlgorithmCtorArg: MutPtr<CVoid>,
) {
    public var encryptionAlgorithm: Pcwstr = encryptionAlgorithmCtorArg
        internal set

    public var blockMapHashAlgorithm: MutPtr<CVoid> = blockMapHashAlgorithmCtorArg
        internal set

    public constructor() : this(
        keyLength = 0u,
        encryptionAlgorithmCtorArg = ConstPtr(0L),
        useDiffusion = 0,
        blockMapHashAlgorithmCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.keyLength

    public operator fun component2(): Pcwstr = this.encryptionAlgorithm

    public operator fun component3(): Bool = this.useDiffusion

    public operator fun component4(): MutPtr<CVoid> = this.blockMapHashAlgorithm

    public fun copy(keyLength: UInt = this.keyLength, encryptionAlgorithm: Pcwstr = this.encryptionAlgorithm, useDiffusion: Bool = this.useDiffusion, blockMapHashAlgorithm: MutPtr<CVoid> = this.blockMapHashAlgorithm): AppxEncryptedPackageSettings = AppxEncryptedPackageSettings(keyLength = keyLength, encryptionAlgorithmCtorArg = encryptionAlgorithm, useDiffusion = useDiffusion, blockMapHashAlgorithmCtorArg = blockMapHashAlgorithm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppxEncryptedPackageSettings) return false
        if (this.keyLength != other.keyLength) return false
        if (this.encryptionAlgorithm != other.encryptionAlgorithm) return false
        if (this.useDiffusion != other.useDiffusion) return false
        if (this.blockMapHashAlgorithm != other.blockMapHashAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyLength.hashCode()
        result = 31 * result + this.encryptionAlgorithm.hashCode()
        result = 31 * result + this.useDiffusion.hashCode()
        result = 31 * result + this.blockMapHashAlgorithm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            keyLength: UInt = 0u,
            encryptionAlgorithm: Pcwstr = ConstPtr(0L),
            useDiffusion: Bool = 0,
            blockMapHashAlgorithm: MutPtr<CVoid> = MutPtr(0L),
        ): AppxEncryptedPackageSettings =
            AppxEncryptedPackageSettings(
                keyLength = keyLength,
                encryptionAlgorithmCtorArg = encryptionAlgorithm,
                useDiffusion = useDiffusion,
                blockMapHashAlgorithmCtorArg = blockMapHashAlgorithm,
            )
    }
}

public class AppxEncryptedPackageSettings2 internal constructor(
    public var keyLength: UInt,
    encryptionAlgorithmCtorArg: Pcwstr,
    blockMapHashAlgorithmCtorArg: MutPtr<CVoid>,
    public var options: UInt,
) {
    public var encryptionAlgorithm: Pcwstr = encryptionAlgorithmCtorArg
        internal set

    public var blockMapHashAlgorithm: MutPtr<CVoid> = blockMapHashAlgorithmCtorArg
        internal set

    public constructor() : this(
        keyLength = 0u,
        encryptionAlgorithmCtorArg = ConstPtr(0L),
        blockMapHashAlgorithmCtorArg = MutPtr(0L),
        options = 0u,
    )

    public operator fun component1(): UInt = this.keyLength

    public operator fun component2(): Pcwstr = this.encryptionAlgorithm

    public operator fun component3(): MutPtr<CVoid> = this.blockMapHashAlgorithm

    public operator fun component4(): UInt = this.options

    public fun copy(keyLength: UInt = this.keyLength, encryptionAlgorithm: Pcwstr = this.encryptionAlgorithm, blockMapHashAlgorithm: MutPtr<CVoid> = this.blockMapHashAlgorithm, options: UInt = this.options): AppxEncryptedPackageSettings2 = AppxEncryptedPackageSettings2(keyLength = keyLength, encryptionAlgorithmCtorArg = encryptionAlgorithm, blockMapHashAlgorithmCtorArg = blockMapHashAlgorithm, options = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppxEncryptedPackageSettings2) return false
        if (this.keyLength != other.keyLength) return false
        if (this.encryptionAlgorithm != other.encryptionAlgorithm) return false
        if (this.blockMapHashAlgorithm != other.blockMapHashAlgorithm) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyLength.hashCode()
        result = 31 * result + this.encryptionAlgorithm.hashCode()
        result = 31 * result + this.blockMapHashAlgorithm.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            keyLength: UInt = 0u,
            encryptionAlgorithm: Pcwstr = ConstPtr(0L),
            blockMapHashAlgorithm: MutPtr<CVoid> = MutPtr(0L),
            options: UInt = 0u,
        ): AppxEncryptedPackageSettings2 =
            AppxEncryptedPackageSettings2(
                keyLength = keyLength,
                encryptionAlgorithmCtorArg = encryptionAlgorithm,
                blockMapHashAlgorithmCtorArg = blockMapHashAlgorithm,
                options = options,
            )
    }
}

public class AppxKeyInfo internal constructor(
    public var keyLength: UInt,
    public var keyIdLength: UInt,
    keyCtorArg: MutPtr<UByte>,
    keyIdCtorArg: MutPtr<UByte>,
) {
    public var key: MutPtr<UByte> = keyCtorArg
        internal set

    public var keyId: MutPtr<UByte> = keyIdCtorArg
        internal set

    public constructor() : this(
        keyLength = 0u,
        keyIdLength = 0u,
        keyCtorArg = MutPtr(0L),
        keyIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.keyLength

    public operator fun component2(): UInt = this.keyIdLength

    public operator fun component3(): MutPtr<UByte> = this.key

    public operator fun component4(): MutPtr<UByte> = this.keyId

    public fun copy(keyLength: UInt = this.keyLength, keyIdLength: UInt = this.keyIdLength, key: MutPtr<UByte> = this.key, keyId: MutPtr<UByte> = this.keyId): AppxKeyInfo = AppxKeyInfo(keyLength = keyLength, keyIdLength = keyIdLength, keyCtorArg = key, keyIdCtorArg = keyId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppxKeyInfo) return false
        if (this.keyLength != other.keyLength) return false
        if (this.keyIdLength != other.keyIdLength) return false
        if (this.key != other.key) return false
        if (this.keyId != other.keyId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyLength.hashCode()
        result = 31 * result + this.keyIdLength.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.keyId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppxKeyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppxKeyInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): AppxKeyInfo =
                    AppxKeyInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AppxKeyInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.keyLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keyIdLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.key)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.keyId)
                }
            }

        public operator fun invoke(
            keyLength: UInt = 0u,
            keyIdLength: UInt = 0u,
            key: MutPtr<UByte> = MutPtr(0L),
            keyId: MutPtr<UByte> = MutPtr(0L),
        ): AppxKeyInfo =
            AppxKeyInfo(
                keyLength = keyLength,
                keyIdLength = keyIdLength,
                keyCtorArg = key,
                keyIdCtorArg = keyId,
            )
    }
}

public class AppxPackageSettings internal constructor(
    public var forceZip32: Bool,
    hashMethodCtorArg: MutPtr<CVoid>,
) {
    public var hashMethod: MutPtr<CVoid> = hashMethodCtorArg
        internal set

    public constructor() : this(
        forceZip32 = 0,
        hashMethodCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.forceZip32

    public operator fun component2(): MutPtr<CVoid> = this.hashMethod

    public fun copy(forceZip32: Bool = this.forceZip32, hashMethod: MutPtr<CVoid> = this.hashMethod): AppxPackageSettings = AppxPackageSettings(forceZip32 = forceZip32, hashMethodCtorArg = hashMethod)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppxPackageSettings) return false
        if (this.forceZip32 != other.forceZip32) return false
        if (this.hashMethod != other.hashMethod) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.forceZip32.hashCode()
        result = 31 * result + this.hashMethod.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppxPackageSettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppxPackageSettings> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AppxPackageSettings =
                    AppxPackageSettings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AppxPackageSettings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.forceZip32)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.hashMethod)
                }
            }

        public operator fun invoke(
            forceZip32: Bool = 0,
            hashMethod: MutPtr<CVoid> = MutPtr(0L),
        ): AppxPackageSettings =
            AppxPackageSettings(
                forceZip32 = forceZip32,
                hashMethodCtorArg = hashMethod,
            )
    }
}

public class AppxPackageWriterPayloadStream internal constructor(
    inputStreamCtorArg: MutPtr<CVoid>,
    fileNameCtorArg: Pcwstr,
    contentTypeCtorArg: Pcwstr,
    public var compressionOption: AppxCompressionOption,
) {
    public var inputStream: MutPtr<CVoid> = inputStreamCtorArg
        internal set

    public var fileName: Pcwstr = fileNameCtorArg
        internal set

    public var contentType: Pcwstr = contentTypeCtorArg
        internal set

    public constructor() : this(
        inputStreamCtorArg = MutPtr(0L),
        fileNameCtorArg = ConstPtr(0L),
        contentTypeCtorArg = ConstPtr(0L),
        compressionOption = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.inputStream

    public operator fun component2(): Pcwstr = this.fileName

    public operator fun component3(): Pcwstr = this.contentType

    public operator fun component4(): AppxCompressionOption = this.compressionOption

    public fun copy(inputStream: MutPtr<CVoid> = this.inputStream, fileName: Pcwstr = this.fileName, contentType: Pcwstr = this.contentType, compressionOption: AppxCompressionOption = this.compressionOption): AppxPackageWriterPayloadStream = AppxPackageWriterPayloadStream(inputStreamCtorArg = inputStream, fileNameCtorArg = fileName, contentTypeCtorArg = contentType, compressionOption = compressionOption)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppxPackageWriterPayloadStream) return false
        if (this.inputStream != other.inputStream) return false
        if (this.fileName != other.fileName) return false
        if (this.contentType != other.contentType) return false
        if (this.compressionOption != other.compressionOption) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inputStream.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.contentType.hashCode()
        result = 31 * result + this.compressionOption.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            inputStream: MutPtr<CVoid> = MutPtr(0L),
            fileName: Pcwstr = ConstPtr(0L),
            contentType: Pcwstr = ConstPtr(0L),
            compressionOption: AppxCompressionOption = 0,
        ): AppxPackageWriterPayloadStream =
            AppxPackageWriterPayloadStream(
                inputStreamCtorArg = inputStream,
                fileNameCtorArg = fileName,
                contentTypeCtorArg = contentType,
                compressionOption = compressionOption,
            )
    }
}

public class PackageId internal constructor(
    public var reserved: UInt,
    public var processorArchitecture: UInt,
    public var version: PackageVersion,
    nameCtorArg: Pwstr,
    publisherCtorArg: Pwstr,
    resourceIdCtorArg: Pwstr,
    publisherIdCtorArg: Pwstr,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public var publisher: Pwstr = publisherCtorArg
        internal set

    public var resourceId: Pwstr = resourceIdCtorArg
        internal set

    public var publisherId: Pwstr = publisherIdCtorArg
        internal set

    public constructor() : this(
        reserved = 0u,
        processorArchitecture = 0u,
        version = PackageVersion(),
        nameCtorArg = MutPtr(0L),
        publisherCtorArg = MutPtr(0L),
        resourceIdCtorArg = MutPtr(0L),
        publisherIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.reserved

    public operator fun component2(): UInt = this.processorArchitecture

    public operator fun component3(): PackageVersion = this.version

    public operator fun component4(): Pwstr = this.name

    public operator fun component5(): Pwstr = this.publisher

    public operator fun component6(): Pwstr = this.resourceId

    public operator fun component7(): Pwstr = this.publisherId

    public fun copy(reserved: UInt = this.reserved, processorArchitecture: UInt = this.processorArchitecture, version: PackageVersion = this.version, name: Pwstr = this.name, publisher: Pwstr = this.publisher, resourceId: Pwstr = this.resourceId, publisherId: Pwstr = this.publisherId): PackageId = PackageId(reserved = reserved, processorArchitecture = processorArchitecture, version = version, nameCtorArg = name, publisherCtorArg = publisher, resourceIdCtorArg = resourceId, publisherIdCtorArg = publisherId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PackageId) return false
        if (this.reserved != other.reserved) return false
        if (this.processorArchitecture != other.processorArchitecture) return false
        if (this.version != other.version) return false
        if (this.name != other.name) return false
        if (this.publisher != other.publisher) return false
        if (this.resourceId != other.resourceId) return false
        if (this.publisherId != other.publisherId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.processorArchitecture.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.publisher.hashCode()
        result = 31 * result + this.resourceId.hashCode()
        result = 31 * result + this.publisherId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            reserved: UInt = 0u,
            processorArchitecture: UInt = 0u,
            version: PackageVersion = PackageVersion(),
            name: Pwstr = MutPtr(0L),
            publisher: Pwstr = MutPtr(0L),
            resourceId: Pwstr = MutPtr(0L),
            publisherId: Pwstr = MutPtr(0L),
        ): PackageId =
            PackageId(
                reserved = reserved,
                processorArchitecture = processorArchitecture,
                version = version,
                nameCtorArg = name,
                publisherCtorArg = publisher,
                resourceIdCtorArg = resourceId,
                publisherIdCtorArg = publisherId,
            )
    }
}

public class PackageInfo internal constructor(
    public var reserved: UInt,
    public var flags: UInt,
    pathCtorArg: Pwstr,
    packageFullNameCtorArg: Pwstr,
    packageFamilyNameCtorArg: Pwstr,
    public var packageId: PackageId,
) {
    public var path: Pwstr = pathCtorArg
        internal set

    public var packageFullName: Pwstr = packageFullNameCtorArg
        internal set

    public var packageFamilyName: Pwstr = packageFamilyNameCtorArg
        internal set

    public constructor() : this(
        reserved = 0u,
        flags = 0u,
        pathCtorArg = MutPtr(0L),
        packageFullNameCtorArg = MutPtr(0L),
        packageFamilyNameCtorArg = MutPtr(0L),
        packageId = PackageId(),
    )

    public operator fun component1(): UInt = this.reserved

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Pwstr = this.path

    public operator fun component4(): Pwstr = this.packageFullName

    public operator fun component5(): Pwstr = this.packageFamilyName

    public operator fun component6(): PackageId = this.packageId

    public fun copy(reserved: UInt = this.reserved, flags: UInt = this.flags, path: Pwstr = this.path, packageFullName: Pwstr = this.packageFullName, packageFamilyName: Pwstr = this.packageFamilyName, packageId: PackageId = this.packageId): PackageInfo = PackageInfo(reserved = reserved, flags = flags, pathCtorArg = path, packageFullNameCtorArg = packageFullName, packageFamilyNameCtorArg = packageFamilyName, packageId = packageId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PackageInfo) return false
        if (this.reserved != other.reserved) return false
        if (this.flags != other.flags) return false
        if (this.path != other.path) return false
        if (this.packageFullName != other.packageFullName) return false
        if (this.packageFamilyName != other.packageFamilyName) return false
        if (this.packageId != other.packageId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.path.hashCode()
        result = 31 * result + this.packageFullName.hashCode()
        result = 31 * result + this.packageFamilyName.hashCode()
        result = 31 * result + this.packageId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            reserved: UInt = 0u,
            flags: UInt = 0u,
            path: Pwstr = MutPtr(0L),
            packageFullName: Pwstr = MutPtr(0L),
            packageFamilyName: Pwstr = MutPtr(0L),
            packageId: PackageId = PackageId(),
        ): PackageInfo =
            PackageInfo(
                reserved = reserved,
                flags = flags,
                pathCtorArg = path,
                packageFullNameCtorArg = packageFullName,
                packageFamilyNameCtorArg = packageFamilyName,
                packageId = packageId,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PackageVersion00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PackageVersion00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PackageVersion00 =
                    PackageVersion00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: PackageVersion00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.build)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.minor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.major)
                }
            }
    }
}

public class PackageInfoReference internal constructor(
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.reserved

    public fun copy(reserved: MutPtr<CVoid> = this.reserved): PackageInfoReference = PackageInfoReference(reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PackageInfoReference) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PackageInfoReference> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PackageInfoReference> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PackageInfoReference =
                    PackageInfoReference(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PackageInfoReference) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.reserved)
                }
            }

        public operator fun invoke(
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): PackageInfoReference =
            PackageInfoReference(
                reservedCtorArg = reserved,
            )
    }
}
