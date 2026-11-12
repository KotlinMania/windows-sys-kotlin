@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

public class AuthenticodeExtraCertChainPolicyPara internal constructor(
    public var cbSize: UInt,
    public var dwRegPolicySettings: UInt,
    pSignerInfoCtorArg: MutPtr<CmsgSignerInfo>,
) {
    public var pSignerInfo: MutPtr<CmsgSignerInfo> = pSignerInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwRegPolicySettings = 0u,
        pSignerInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwRegPolicySettings

    public operator fun component3(): MutPtr<CmsgSignerInfo> = this.pSignerInfo

    public fun copy(cbSize: UInt = this.cbSize, dwRegPolicySettings: UInt = this.dwRegPolicySettings, pSignerInfo: MutPtr<CmsgSignerInfo> = this.pSignerInfo): AuthenticodeExtraCertChainPolicyPara = AuthenticodeExtraCertChainPolicyPara(cbSize = cbSize, dwRegPolicySettings = dwRegPolicySettings, pSignerInfoCtorArg = pSignerInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthenticodeExtraCertChainPolicyPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwRegPolicySettings != other.dwRegPolicySettings) return false
        if (this.pSignerInfo != other.pSignerInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwRegPolicySettings.hashCode()
        result = 31 * result + this.pSignerInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthenticodeExtraCertChainPolicyPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthenticodeExtraCertChainPolicyPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AuthenticodeExtraCertChainPolicyPara =
                    AuthenticodeExtraCertChainPolicyPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmsgSignerInfo>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AuthenticodeExtraCertChainPolicyPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRegPolicySettings)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmsgSignerInfo>(64)
                    ).writeNative(addr + 8L, value.pSignerInfo)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            dwRegPolicySettings: UInt = 0u,
            pSignerInfo: MutPtr<CmsgSignerInfo> = MutPtr(0L),
        ): AuthenticodeExtraCertChainPolicyPara =
            AuthenticodeExtraCertChainPolicyPara(
                cbSize = cbSize,
                dwRegPolicySettings = dwRegPolicySettings,
                pSignerInfoCtorArg = pSignerInfo,
            )
    }
}

public data class AuthenticodeExtraCertChainPolicyStatus(
    public var cbSize: UInt = 0u,
    public var fCommercial: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthenticodeExtraCertChainPolicyStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthenticodeExtraCertChainPolicyStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): AuthenticodeExtraCertChainPolicyStatus =
                    AuthenticodeExtraCertChainPolicyStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AuthenticodeExtraCertChainPolicyStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fCommercial)
                }
            }
    }
}

public data class AuthenticodeTsExtraCertChainPolicyPara(
    public var cbSize: UInt = 0u,
    public var dwRegPolicySettings: UInt = 0u,
    public var fCommercial: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthenticodeTsExtraCertChainPolicyPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthenticodeTsExtraCertChainPolicyPara> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): AuthenticodeTsExtraCertChainPolicyPara =
                    AuthenticodeTsExtraCertChainPolicyPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AuthenticodeTsExtraCertChainPolicyPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRegPolicySettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fCommercial)
                }
            }
    }
}

public class BcryptAlgorithmIdentifier internal constructor(
    pszNameCtorArg: Pwstr,
    public var dwClass: UInt,
    public var dwFlags: UInt,
) {
    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public constructor() : this(
        pszNameCtorArg = MutPtr(0L),
        dwClass = 0u,
        dwFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.pszName

    public operator fun component2(): UInt = this.dwClass

    public operator fun component3(): UInt = this.dwFlags

    public fun copy(pszName: Pwstr = this.pszName, dwClass: UInt = this.dwClass, dwFlags: UInt = this.dwFlags): BcryptAlgorithmIdentifier = BcryptAlgorithmIdentifier(pszNameCtorArg = pszName, dwClass = dwClass, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptAlgorithmIdentifier) return false
        if (this.pszName != other.pszName) return false
        if (this.dwClass != other.dwClass) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszName.hashCode()
        result = 31 * result + this.dwClass.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszName: Pwstr = MutPtr(0L),
            dwClass: UInt = 0u,
            dwFlags: UInt = 0u,
        ): BcryptAlgorithmIdentifier =
            BcryptAlgorithmIdentifier(
                pszNameCtorArg = pszName,
                dwClass = dwClass,
                dwFlags = dwFlags,
            )
    }
}

public data class BcryptAsymmetricEncryptionFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var generateKeyPair: BCryptGenerateKeyPairFn = null,
    public var finalizeKeyPair: BCryptFinalizeKeyPairFn = null,
    public var encrypt: BCryptEncryptFn = null,
    public var decrypt: BCryptDecryptFn = null,
    public var importKeyPair: BCryptImportKeyPairFn = null,
    public var exportKey: BCryptExportKeyFn = null,
    public var destroyKey: BCryptDestroyKeyFn = null,
    public var signHash: BCryptSignHashFn = null,
    public var verifySignature: BCryptVerifySignatureFn = null,
)

public class BcryptAuthenticatedCipherModeInfo internal constructor(
    public var cbSize: UInt,
    public var dwInfoVersion: UInt,
    pbNonceCtorArg: MutPtr<UByte>,
    public var cbNonce: UInt,
    pbAuthDataCtorArg: MutPtr<UByte>,
    public var cbAuthData: UInt,
    pbTagCtorArg: MutPtr<UByte>,
    public var cbTag: UInt,
    pbMacContextCtorArg: MutPtr<UByte>,
    public var cbMacContext: UInt,
    public var cbAAD: UInt,
    public var cbData: ULong,
    public var dwFlags: UInt,
) {
    public var pbNonce: MutPtr<UByte> = pbNonceCtorArg
        internal set

    public var pbAuthData: MutPtr<UByte> = pbAuthDataCtorArg
        internal set

    public var pbTag: MutPtr<UByte> = pbTagCtorArg
        internal set

    public var pbMacContext: MutPtr<UByte> = pbMacContextCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwInfoVersion = 0u,
        pbNonceCtorArg = MutPtr(0L),
        cbNonce = 0u,
        pbAuthDataCtorArg = MutPtr(0L),
        cbAuthData = 0u,
        pbTagCtorArg = MutPtr(0L),
        cbTag = 0u,
        pbMacContextCtorArg = MutPtr(0L),
        cbMacContext = 0u,
        cbAAD = 0u,
        cbData = 0uL,
        dwFlags = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwInfoVersion

    public operator fun component3(): MutPtr<UByte> = this.pbNonce

    public operator fun component4(): UInt = this.cbNonce

    public operator fun component5(): MutPtr<UByte> = this.pbAuthData

    public operator fun component6(): UInt = this.cbAuthData

    public operator fun component7(): MutPtr<UByte> = this.pbTag

    public operator fun component8(): UInt = this.cbTag

    public operator fun component9(): MutPtr<UByte> = this.pbMacContext

    public operator fun component10(): UInt = this.cbMacContext

    public operator fun component11(): UInt = this.cbAAD

    public operator fun component12(): ULong = this.cbData

    public operator fun component13(): UInt = this.dwFlags

    public fun copy(cbSize: UInt = this.cbSize, dwInfoVersion: UInt = this.dwInfoVersion, pbNonce: MutPtr<UByte> = this.pbNonce, cbNonce: UInt = this.cbNonce, pbAuthData: MutPtr<UByte> = this.pbAuthData, cbAuthData: UInt = this.cbAuthData, pbTag: MutPtr<UByte> = this.pbTag, cbTag: UInt = this.cbTag, pbMacContext: MutPtr<UByte> = this.pbMacContext, cbMacContext: UInt = this.cbMacContext, cbAAD: UInt = this.cbAAD, cbData: ULong = this.cbData, dwFlags: UInt = this.dwFlags): BcryptAuthenticatedCipherModeInfo = BcryptAuthenticatedCipherModeInfo(cbSize = cbSize, dwInfoVersion = dwInfoVersion, pbNonceCtorArg = pbNonce, cbNonce = cbNonce, pbAuthDataCtorArg = pbAuthData, cbAuthData = cbAuthData, pbTagCtorArg = pbTag, cbTag = cbTag, pbMacContextCtorArg = pbMacContext, cbMacContext = cbMacContext, cbAAD = cbAAD, cbData = cbData, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptAuthenticatedCipherModeInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwInfoVersion != other.dwInfoVersion) return false
        if (this.pbNonce != other.pbNonce) return false
        if (this.cbNonce != other.cbNonce) return false
        if (this.pbAuthData != other.pbAuthData) return false
        if (this.cbAuthData != other.cbAuthData) return false
        if (this.pbTag != other.pbTag) return false
        if (this.cbTag != other.cbTag) return false
        if (this.pbMacContext != other.pbMacContext) return false
        if (this.cbMacContext != other.cbMacContext) return false
        if (this.cbAAD != other.cbAAD) return false
        if (this.cbData != other.cbData) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwInfoVersion.hashCode()
        result = 31 * result + this.pbNonce.hashCode()
        result = 31 * result + this.cbNonce.hashCode()
        result = 31 * result + this.pbAuthData.hashCode()
        result = 31 * result + this.cbAuthData.hashCode()
        result = 31 * result + this.pbTag.hashCode()
        result = 31 * result + this.cbTag.hashCode()
        result = 31 * result + this.pbMacContext.hashCode()
        result = 31 * result + this.cbMacContext.hashCode()
        result = 31 * result + this.cbAAD.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptAuthenticatedCipherModeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptAuthenticatedCipherModeInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): BcryptAuthenticatedCipherModeInfo =
                    BcryptAuthenticatedCipherModeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: BcryptAuthenticatedCipherModeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwInfoVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbNonce)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbNonce)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pbAuthData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cbAuthData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 40L, value.pbTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cbTag)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 56L, value.pbMacContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.cbMacContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.cbAAD)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.cbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwFlags)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            dwInfoVersion: UInt = 0u,
            pbNonce: MutPtr<UByte> = MutPtr(0L),
            cbNonce: UInt = 0u,
            pbAuthData: MutPtr<UByte> = MutPtr(0L),
            cbAuthData: UInt = 0u,
            pbTag: MutPtr<UByte> = MutPtr(0L),
            cbTag: UInt = 0u,
            pbMacContext: MutPtr<UByte> = MutPtr(0L),
            cbMacContext: UInt = 0u,
            cbAAD: UInt = 0u,
            cbData: ULong = 0uL,
            dwFlags: UInt = 0u,
        ): BcryptAuthenticatedCipherModeInfo =
            BcryptAuthenticatedCipherModeInfo(
                cbSize = cbSize,
                dwInfoVersion = dwInfoVersion,
                pbNonceCtorArg = pbNonce,
                cbNonce = cbNonce,
                pbAuthDataCtorArg = pbAuthData,
                cbAuthData = cbAuthData,
                pbTagCtorArg = pbTag,
                cbTag = cbTag,
                pbMacContextCtorArg = pbMacContext,
                cbMacContext = cbMacContext,
                cbAAD = cbAAD,
                cbData = cbData,
                dwFlags = dwFlags,
            )
    }
}

public data class BcryptCipherFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var generateKey: BCryptGenerateSymmetricKeyFn = null,
    public var encrypt: BCryptEncryptFn = null,
    public var decrypt: BCryptDecryptFn = null,
    public var importKey: BCryptImportKeyFn = null,
    public var exportKey: BCryptExportKeyFn = null,
    public var duplicateKey: BCryptDuplicateKeyFn = null,
    public var destroyKey: BCryptDestroyKeyFn = null,
)

public data class BcryptDhKeyBlob(
    public var dwMagic: BcryptDhKeyBlobMagic = 0u,
    public var cbKey: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDhKeyBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDhKeyBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BcryptDhKeyBlob =
                    BcryptDhKeyBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BcryptDhKeyBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbKey)
                }
            }
    }
}

public data class BcryptDhParameterHeader(
    public var cbLength: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbKeyLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDhParameterHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDhParameterHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): BcryptDhParameterHeader =
                    BcryptDhParameterHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BcryptDhParameterHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbKeyLength)
                }
            }
    }
}

public data class BcryptDsaKeyBlob(
    public var dwMagic: BcryptDsaMagic = 0u,
    public var cbKey: UInt = 0u,
    public var count: UByteArray = UByteArray(4),
    public var seed: UByteArray = UByteArray(20),
    public var q: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptDsaKeyBlob) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKey != other.cbKey) return false
        if (!this.count.contentEquals(other.count)) return false
        if (!this.seed.contentEquals(other.seed)) return false
        if (!this.q.contentEquals(other.q)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMagic.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.count.contentHashCode()
        result = 31 * result + this.seed.contentHashCode()
        result = 31 * result + this.q.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDsaKeyBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDsaKeyBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): BcryptDsaKeyBlob =
                    BcryptDsaKeyBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BcryptDsaKeyBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 8L, value.count.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 12L, value.seed.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 32L, value.q.toList())
                }
            }
    }
}

public data class BcryptDsaKeyBlobV2(
    public var dwMagic: BcryptDsaMagic = 0u,
    public var cbKey: UInt = 0u,
    public var hashAlgorithm: HashalgorithmEnum = 0,
    public var standardVersion: DsafipsversionEnum = 0,
    public var cbSeedLength: UInt = 0u,
    public var cbGroupSize: UInt = 0u,
    public var count: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptDsaKeyBlobV2) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKey != other.cbKey) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.standardVersion != other.standardVersion) return false
        if (this.cbSeedLength != other.cbSeedLength) return false
        if (this.cbGroupSize != other.cbGroupSize) return false
        if (!this.count.contentEquals(other.count)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMagic.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.standardVersion.hashCode()
        result = 31 * result + this.cbSeedLength.hashCode()
        result = 31 * result + this.cbGroupSize.hashCode()
        result = 31 * result + this.count.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDsaKeyBlobV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDsaKeyBlobV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): BcryptDsaKeyBlobV2 =
                    BcryptDsaKeyBlobV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BcryptDsaKeyBlobV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.hashAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.standardVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbSeedLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbGroupSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 24L, value.count.toList())
                }
            }
    }
}

public data class BcryptDsaParameterHeader(
    public var cbLength: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbKeyLength: UInt = 0u,
    public var count: UByteArray = UByteArray(4),
    public var seed: UByteArray = UByteArray(20),
    public var q: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptDsaParameterHeader) return false
        if (this.cbLength != other.cbLength) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKeyLength != other.cbKeyLength) return false
        if (!this.count.contentEquals(other.count)) return false
        if (!this.seed.contentEquals(other.seed)) return false
        if (!this.q.contentEquals(other.q)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLength.hashCode()
        result = 31 * result + this.dwMagic.hashCode()
        result = 31 * result + this.cbKeyLength.hashCode()
        result = 31 * result + this.count.contentHashCode()
        result = 31 * result + this.seed.contentHashCode()
        result = 31 * result + this.q.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDsaParameterHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDsaParameterHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): BcryptDsaParameterHeader =
                    BcryptDsaParameterHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 36L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BcryptDsaParameterHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbKeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 12L, value.count.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 16L, value.seed.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 36L, value.q.toList())
                }
            }
    }
}

public data class BcryptDsaParameterHeaderV2(
    public var cbLength: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbKeyLength: UInt = 0u,
    public var hashAlgorithm: HashalgorithmEnum = 0,
    public var standardVersion: DsafipsversionEnum = 0,
    public var cbSeedLength: UInt = 0u,
    public var cbGroupSize: UInt = 0u,
    public var count: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptDsaParameterHeaderV2) return false
        if (this.cbLength != other.cbLength) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKeyLength != other.cbKeyLength) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.standardVersion != other.standardVersion) return false
        if (this.cbSeedLength != other.cbSeedLength) return false
        if (this.cbGroupSize != other.cbGroupSize) return false
        if (!this.count.contentEquals(other.count)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLength.hashCode()
        result = 31 * result + this.dwMagic.hashCode()
        result = 31 * result + this.cbKeyLength.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.standardVersion.hashCode()
        result = 31 * result + this.cbSeedLength.hashCode()
        result = 31 * result + this.cbGroupSize.hashCode()
        result = 31 * result + this.count.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDsaParameterHeaderV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptDsaParameterHeaderV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): BcryptDsaParameterHeaderV2 =
                    BcryptDsaParameterHeaderV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BcryptDsaParameterHeaderV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbKeyLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.hashAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.standardVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbSeedLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbGroupSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 28L, value.count.toList())
                }
            }
    }
}

public data class BcryptEccfullkeyBlob(
    public var dwMagic: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwCurveType: EccCurveTypeEnum = 0,
    public var dwCurveGenerationAlgId: EccCurveAlgIdEnum = 0,
    public var cbFieldLength: UInt = 0u,
    public var cbSubgroupOrder: UInt = 0u,
    public var cbCofactor: UInt = 0u,
    public var cbSeed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptEccfullkeyBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptEccfullkeyBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): BcryptEccfullkeyBlob =
                    BcryptEccfullkeyBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: BcryptEccfullkeyBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.dwCurveType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.dwCurveGenerationAlgId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbFieldLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbSubgroupOrder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbCofactor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cbSeed)
                }
            }
    }
}

public data class BcryptEcckeyBlob(
    public var dwMagic: UInt = 0u,
    public var cbKey: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptEcckeyBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptEcckeyBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BcryptEcckeyBlob =
                    BcryptEcckeyBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BcryptEcckeyBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbKey)
                }
            }
    }
}

public class BcryptEccCurveNames internal constructor(
    public var dwEccCurveNames: UInt,
    pEccCurveNamesCtorArg: MutPtr<Pwstr>,
) {
    public var pEccCurveNames: MutPtr<Pwstr> = pEccCurveNamesCtorArg
        internal set

    public constructor() : this(
        dwEccCurveNames = 0u,
        pEccCurveNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwEccCurveNames

    public operator fun component2(): MutPtr<Pwstr> = this.pEccCurveNames

    public fun copy(dwEccCurveNames: UInt = this.dwEccCurveNames, pEccCurveNames: MutPtr<Pwstr> = this.pEccCurveNames): BcryptEccCurveNames = BcryptEccCurveNames(dwEccCurveNames = dwEccCurveNames, pEccCurveNamesCtorArg = pEccCurveNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptEccCurveNames) return false
        if (this.dwEccCurveNames != other.dwEccCurveNames) return false
        if (this.pEccCurveNames != other.pEccCurveNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwEccCurveNames.hashCode()
        result = 31 * result + this.pEccCurveNames.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptEccCurveNames> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptEccCurveNames> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BcryptEccCurveNames =
                    BcryptEccCurveNames(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Pwstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BcryptEccCurveNames) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwEccCurveNames)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Pwstr>(64)
                    ).writeNative(addr + 8L, value.pEccCurveNames)
                }
            }

        public operator fun invoke(
            dwEccCurveNames: UInt = 0u,
            pEccCurveNames: MutPtr<Pwstr> = MutPtr(0L),
        ): BcryptEccCurveNames =
            BcryptEccCurveNames(
                dwEccCurveNames = dwEccCurveNames,
                pEccCurveNamesCtorArg = pEccCurveNames,
            )
    }
}

public data class BcryptEccParameterHeader(
    public var dwVersion: UInt = 0u,
    public var dwCurveType: EccCurveTypeEnum = 0,
    public var dwCurveGenerationAlgId: EccCurveAlgIdEnum = 0,
    public var cbFieldLength: UInt = 0u,
    public var cbSubgroupOrder: UInt = 0u,
    public var cbCofactor: UInt = 0u,
    public var cbSeed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptEccParameterHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptEccParameterHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): BcryptEccParameterHeader =
                    BcryptEccParameterHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: BcryptEccParameterHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dwCurveType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.dwCurveGenerationAlgId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbFieldLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbSubgroupOrder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbCofactor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbSeed)
                }
            }
    }
}

public data class BcryptHashFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var createHash: BCryptCreateHashFn = null,
    public var hashData: BCryptHashDataFn = null,
    public var finishHash: BCryptFinishHashFn = null,
    public var duplicateHash: BCryptDuplicateHashFn = null,
    public var destroyHash: BCryptDestroyHashFn = null,
    public var createMultiHash: BCryptCreateMultiHashFn = null,
    public var processMultiOperations: BCryptProcessMultiOperationsFn = null,
)

public data class BcryptInterfaceVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptInterfaceVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptInterfaceVersion> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): BcryptInterfaceVersion =
                    BcryptInterfaceVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: BcryptInterfaceVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minorVersion)
                }
            }
    }
}

public data class BcryptKeyBlob(
    public var magic: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptKeyBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptKeyBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): BcryptKeyBlob =
                    BcryptKeyBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BcryptKeyBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                }
            }
    }
}

public data class BcryptKeyDataBlobHeader(
    public var dwMagic: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var cbKeyData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptKeyDataBlobHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptKeyDataBlobHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): BcryptKeyDataBlobHeader =
                    BcryptKeyDataBlobHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BcryptKeyDataBlobHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbKeyData)
                }
            }
    }
}

public data class BcryptKeyDerivationFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var generateKey: BCryptGenerateSymmetricKeyFn = null,
    public var destroyKey: BCryptDestroyKeyFn = null,
    public var keyDerivation: BCryptKeyDerivationFn = null,
    public var exportKey: BCryptExportKeyFn = null,
    public var importKey: BCryptImportKeyFn = null,
    public var duplicateKey: BCryptDuplicateKeyFn = null,
)

public data class BcryptKeyLengthsStruct(
    public var dwMinLength: UInt = 0u,
    public var dwMaxLength: UInt = 0u,
    public var dwIncrement: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptKeyLengthsStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptKeyLengthsStruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): BcryptKeyLengthsStruct =
                    BcryptKeyLengthsStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BcryptKeyLengthsStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMinLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMaxLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwIncrement)
                }
            }
    }
}

public class BcryptMultiHashOperation internal constructor(
    public var iHash: UInt,
    public var hashOperation: BcryptHashOperationType,
    pbBufferCtorArg: MutPtr<UByte>,
    public var cbBuffer: UInt,
) {
    public var pbBuffer: MutPtr<UByte> = pbBufferCtorArg
        internal set

    public constructor() : this(
        iHash = 0u,
        hashOperation = 0,
        pbBufferCtorArg = MutPtr(0L),
        cbBuffer = 0u,
    )

    public operator fun component1(): UInt = this.iHash

    public operator fun component2(): BcryptHashOperationType = this.hashOperation

    public operator fun component3(): MutPtr<UByte> = this.pbBuffer

    public operator fun component4(): UInt = this.cbBuffer

    public fun copy(iHash: UInt = this.iHash, hashOperation: BcryptHashOperationType = this.hashOperation, pbBuffer: MutPtr<UByte> = this.pbBuffer, cbBuffer: UInt = this.cbBuffer): BcryptMultiHashOperation = BcryptMultiHashOperation(iHash = iHash, hashOperation = hashOperation, pbBufferCtorArg = pbBuffer, cbBuffer = cbBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptMultiHashOperation) return false
        if (this.iHash != other.iHash) return false
        if (this.hashOperation != other.hashOperation) return false
        if (this.pbBuffer != other.pbBuffer) return false
        if (this.cbBuffer != other.cbBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iHash.hashCode()
        result = 31 * result + this.hashOperation.hashCode()
        result = 31 * result + this.pbBuffer.hashCode()
        result = 31 * result + this.cbBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptMultiHashOperation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptMultiHashOperation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): BcryptMultiHashOperation =
                    BcryptMultiHashOperation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: BcryptMultiHashOperation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iHash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.hashOperation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbBuffer)
                }
            }

        public operator fun invoke(
            iHash: UInt = 0u,
            hashOperation: BcryptHashOperationType = 0,
            pbBuffer: MutPtr<UByte> = MutPtr(0L),
            cbBuffer: UInt = 0u,
        ): BcryptMultiHashOperation =
            BcryptMultiHashOperation(
                iHash = iHash,
                hashOperation = hashOperation,
                pbBufferCtorArg = pbBuffer,
                cbBuffer = cbBuffer,
            )
    }
}

public data class BcryptMultiObjectLengthStruct(
    public var cbPerObject: UInt = 0u,
    public var cbPerElement: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptMultiObjectLengthStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptMultiObjectLengthStruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BcryptMultiObjectLengthStruct =
                    BcryptMultiObjectLengthStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BcryptMultiObjectLengthStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbPerObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbPerElement)
                }
            }
    }
}

public class BcryptOaepPaddingInfo internal constructor(
    pszAlgIdCtorArg: Pcwstr,
    pbLabelCtorArg: MutPtr<UByte>,
    public var cbLabel: UInt,
) {
    public var pszAlgId: Pcwstr = pszAlgIdCtorArg
        internal set

    public var pbLabel: MutPtr<UByte> = pbLabelCtorArg
        internal set

    public constructor() : this(
        pszAlgIdCtorArg = ConstPtr(0L),
        pbLabelCtorArg = MutPtr(0L),
        cbLabel = 0u,
    )

    public operator fun component1(): Pcwstr = this.pszAlgId

    public operator fun component2(): MutPtr<UByte> = this.pbLabel

    public operator fun component3(): UInt = this.cbLabel

    public fun copy(pszAlgId: Pcwstr = this.pszAlgId, pbLabel: MutPtr<UByte> = this.pbLabel, cbLabel: UInt = this.cbLabel): BcryptOaepPaddingInfo = BcryptOaepPaddingInfo(pszAlgIdCtorArg = pszAlgId, pbLabelCtorArg = pbLabel, cbLabel = cbLabel)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptOaepPaddingInfo) return false
        if (this.pszAlgId != other.pszAlgId) return false
        if (this.pbLabel != other.pbLabel) return false
        if (this.cbLabel != other.cbLabel) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAlgId.hashCode()
        result = 31 * result + this.pbLabel.hashCode()
        result = 31 * result + this.cbLabel.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAlgId: Pcwstr = ConstPtr(0L),
            pbLabel: MutPtr<UByte> = MutPtr(0L),
            cbLabel: UInt = 0u,
        ): BcryptOaepPaddingInfo =
            BcryptOaepPaddingInfo(
                pszAlgIdCtorArg = pszAlgId,
                pbLabelCtorArg = pbLabel,
                cbLabel = cbLabel,
            )
    }
}

public class BcryptOid internal constructor(
    public var cbOID: UInt,
    pbOIDCtorArg: MutPtr<UByte>,
) {
    public var pbOID: MutPtr<UByte> = pbOIDCtorArg
        internal set

    public constructor() : this(
        cbOID = 0u,
        pbOIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbOID

    public operator fun component2(): MutPtr<UByte> = this.pbOID

    public fun copy(cbOID: UInt = this.cbOID, pbOID: MutPtr<UByte> = this.pbOID): BcryptOid = BcryptOid(cbOID = cbOID, pbOIDCtorArg = pbOID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptOid) return false
        if (this.cbOID != other.cbOID) return false
        if (this.pbOID != other.pbOID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbOID.hashCode()
        result = 31 * result + this.pbOID.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptOid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptOid> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BcryptOid =
                    BcryptOid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BcryptOid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbOID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbOID)
                }
            }

        public operator fun invoke(
            cbOID: UInt = 0u,
            pbOID: MutPtr<UByte> = MutPtr(0L),
        ): BcryptOid =
            BcryptOid(
                cbOID = cbOID,
                pbOIDCtorArg = pbOID,
            )
    }
}

public class BcryptOidList internal constructor(
    public var dwOIDCount: UInt,
    pOIDsCtorArg: MutPtr<BcryptOid>,
) {
    public var pOIDs: MutPtr<BcryptOid> = pOIDsCtorArg
        internal set

    public constructor() : this(
        dwOIDCount = 0u,
        pOIDsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwOIDCount

    public operator fun component2(): MutPtr<BcryptOid> = this.pOIDs

    public fun copy(dwOIDCount: UInt = this.dwOIDCount, pOIDs: MutPtr<BcryptOid> = this.pOIDs): BcryptOidList = BcryptOidList(dwOIDCount = dwOIDCount, pOIDsCtorArg = pOIDs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptOidList) return false
        if (this.dwOIDCount != other.dwOIDCount) return false
        if (this.pOIDs != other.pOIDs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOIDCount.hashCode()
        result = 31 * result + this.pOIDs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptOidList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptOidList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BcryptOidList =
                    BcryptOidList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<BcryptOid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BcryptOidList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOIDCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<BcryptOid>(64)
                    ).writeNative(addr + 8L, value.pOIDs)
                }
            }

        public operator fun invoke(
            dwOIDCount: UInt = 0u,
            pOIDs: MutPtr<BcryptOid> = MutPtr(0L),
        ): BcryptOidList =
            BcryptOidList(
                dwOIDCount = dwOIDCount,
                pOIDsCtorArg = pOIDs,
            )
    }
}

public class BcryptPkcs1PaddingInfo internal constructor(
    pszAlgIdCtorArg: Pcwstr,
) {
    public var pszAlgId: Pcwstr = pszAlgIdCtorArg
        internal set

    public constructor() : this(
        pszAlgIdCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pszAlgId

    public fun copy(pszAlgId: Pcwstr = this.pszAlgId): BcryptPkcs1PaddingInfo = BcryptPkcs1PaddingInfo(pszAlgIdCtorArg = pszAlgId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptPkcs1PaddingInfo) return false
        if (this.pszAlgId != other.pszAlgId) return false
        return true
    }

    override fun hashCode(): Int = this.pszAlgId.hashCode()

    public companion object {
        public operator fun invoke(
            pszAlgId: Pcwstr = ConstPtr(0L),
        ): BcryptPkcs1PaddingInfo =
            BcryptPkcs1PaddingInfo(
                pszAlgIdCtorArg = pszAlgId,
            )
    }
}

public class BcryptProviderName internal constructor(
    pszProviderNameCtorArg: Pwstr,
) {
    public var pszProviderName: Pwstr = pszProviderNameCtorArg
        internal set

    public constructor() : this(
        pszProviderNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszProviderName

    public fun copy(pszProviderName: Pwstr = this.pszProviderName): BcryptProviderName = BcryptProviderName(pszProviderNameCtorArg = pszProviderName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptProviderName) return false
        if (this.pszProviderName != other.pszProviderName) return false
        return true
    }

    override fun hashCode(): Int = this.pszProviderName.hashCode()

    public companion object {
        public operator fun invoke(
            pszProviderName: Pwstr = MutPtr(0L),
        ): BcryptProviderName =
            BcryptProviderName(
                pszProviderNameCtorArg = pszProviderName,
            )
    }
}

public class BcryptPssPaddingInfo internal constructor(
    pszAlgIdCtorArg: Pcwstr,
    public var cbSalt: UInt,
) {
    public var pszAlgId: Pcwstr = pszAlgIdCtorArg
        internal set

    public constructor() : this(
        pszAlgIdCtorArg = ConstPtr(0L),
        cbSalt = 0u,
    )

    public operator fun component1(): Pcwstr = this.pszAlgId

    public operator fun component2(): UInt = this.cbSalt

    public fun copy(pszAlgId: Pcwstr = this.pszAlgId, cbSalt: UInt = this.cbSalt): BcryptPssPaddingInfo = BcryptPssPaddingInfo(pszAlgIdCtorArg = pszAlgId, cbSalt = cbSalt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptPssPaddingInfo) return false
        if (this.pszAlgId != other.pszAlgId) return false
        if (this.cbSalt != other.cbSalt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAlgId.hashCode()
        result = 31 * result + this.cbSalt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAlgId: Pcwstr = ConstPtr(0L),
            cbSalt: UInt = 0u,
        ): BcryptPssPaddingInfo =
            BcryptPssPaddingInfo(
                pszAlgIdCtorArg = pszAlgId,
                cbSalt = cbSalt,
            )
    }
}

public data class BcryptRngFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var genRandom: BCryptGenRandomFn = null,
)

public data class BcryptRsakeyBlob(
    public var magic: BcryptRsakeyBlobMagic = 0u,
    public var bitLength: UInt = 0u,
    public var cbPublicExp: UInt = 0u,
    public var cbModulus: UInt = 0u,
    public var cbPrime1: UInt = 0u,
    public var cbPrime2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptRsakeyBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BcryptRsakeyBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): BcryptRsakeyBlob =
                    BcryptRsakeyBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: BcryptRsakeyBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbPublicExp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbModulus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbPrime1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbPrime2)
                }
            }
    }
}

public data class BcryptSecretAgreementFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var secretAgreement: BCryptSecretAgreementFn = null,
    public var deriveKey: BCryptDeriveKeyFn = null,
    public var destroySecret: BCryptDestroySecretFn = null,
    public var generateKeyPair: BCryptGenerateKeyPairFn = null,
    public var finalizeKeyPair: BCryptFinalizeKeyPairFn = null,
    public var importKeyPair: BCryptImportKeyPairFn = null,
    public var exportKey: BCryptExportKeyFn = null,
    public var destroyKey: BCryptDestroyKeyFn = null,
)

public data class BcryptSignatureFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var generateKeyPair: BCryptGenerateKeyPairFn = null,
    public var finalizeKeyPair: BCryptFinalizeKeyPairFn = null,
    public var signHash: BCryptSignHashFn = null,
    public var verifySignature: BCryptVerifySignatureFn = null,
    public var importKeyPair: BCryptImportKeyPairFn = null,
    public var exportKey: BCryptExportKeyFn = null,
    public var destroyKey: BCryptDestroyKeyFn = null,
)

public class BCryptBuffer internal constructor(
    public var cbBuffer: UInt,
    public var bufferType: UInt,
    pvBufferCtorArg: MutPtr<CVoid>,
) {
    public var pvBuffer: MutPtr<CVoid> = pvBufferCtorArg
        internal set

    public constructor() : this(
        cbBuffer = 0u,
        bufferType = 0u,
        pvBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbBuffer

    public operator fun component2(): UInt = this.bufferType

    public operator fun component3(): MutPtr<CVoid> = this.pvBuffer

    public fun copy(cbBuffer: UInt = this.cbBuffer, bufferType: UInt = this.bufferType, pvBuffer: MutPtr<CVoid> = this.pvBuffer): BCryptBuffer = BCryptBuffer(cbBuffer = cbBuffer, bufferType = bufferType, pvBufferCtorArg = pvBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BCryptBuffer) return false
        if (this.cbBuffer != other.cbBuffer) return false
        if (this.bufferType != other.bufferType) return false
        if (this.pvBuffer != other.pvBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbBuffer.hashCode()
        result = 31 * result + this.bufferType.hashCode()
        result = 31 * result + this.pvBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BCryptBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BCryptBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BCryptBuffer =
                    BCryptBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BCryptBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bufferType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pvBuffer)
                }
            }

        public operator fun invoke(
            cbBuffer: UInt = 0u,
            bufferType: UInt = 0u,
            pvBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): BCryptBuffer =
            BCryptBuffer(
                cbBuffer = cbBuffer,
                bufferType = bufferType,
                pvBufferCtorArg = pvBuffer,
            )
    }
}

public class BCryptBufferDesc internal constructor(
    public var ulVersion: UInt,
    public var cBuffers: UInt,
    pBuffersCtorArg: MutPtr<BCryptBuffer>,
) {
    public var pBuffers: MutPtr<BCryptBuffer> = pBuffersCtorArg
        internal set

    public constructor() : this(
        ulVersion = 0u,
        cBuffers = 0u,
        pBuffersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulVersion

    public operator fun component2(): UInt = this.cBuffers

    public operator fun component3(): MutPtr<BCryptBuffer> = this.pBuffers

    public fun copy(ulVersion: UInt = this.ulVersion, cBuffers: UInt = this.cBuffers, pBuffers: MutPtr<BCryptBuffer> = this.pBuffers): BCryptBufferDesc = BCryptBufferDesc(ulVersion = ulVersion, cBuffers = cBuffers, pBuffersCtorArg = pBuffers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BCryptBufferDesc) return false
        if (this.ulVersion != other.ulVersion) return false
        if (this.cBuffers != other.cBuffers) return false
        if (this.pBuffers != other.pBuffers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulVersion.hashCode()
        result = 31 * result + this.cBuffers.hashCode()
        result = 31 * result + this.pBuffers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BCryptBufferDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BCryptBufferDesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BCryptBufferDesc =
                    BCryptBufferDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<BCryptBuffer>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BCryptBufferDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cBuffers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<BCryptBuffer>(64)
                    ).writeNative(addr + 8L, value.pBuffers)
                }
            }

        public operator fun invoke(
            ulVersion: UInt = 0u,
            cBuffers: UInt = 0u,
            pBuffers: MutPtr<BCryptBuffer> = MutPtr(0L),
        ): BCryptBufferDesc =
            BCryptBufferDesc(
                ulVersion = ulVersion,
                cBuffers = cBuffers,
                pBuffersCtorArg = pBuffers,
            )
    }
}

public data class CardAuthenticate(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pinId: UInt = 0u,
    public var cbPinData: UInt = 0u,
    public var pbPinData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardAuthenticate) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pinId != other.pinId) return false
        if (this.cbPinData != other.cbPinData) return false
        if (!this.pbPinData.contentEquals(other.pbPinData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pinId.hashCode()
        result = 31 * result + this.cbPinData.hashCode()
        result = 31 * result + this.pbPinData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardAuthenticate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardAuthenticate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): CardAuthenticate =
                    CardAuthenticate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CardAuthenticate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pinId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbPinData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.pbPinData.toList())
                }
            }
    }
}

public data class CardAuthenticateResponse(
    public var dwVersion: UInt = 0u,
    public var cbSessionPin: UInt = 0u,
    public var cAttemptsRemaining: UInt = 0u,
    public var pbSessionPin: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardAuthenticateResponse) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbSessionPin != other.cbSessionPin) return false
        if (this.cAttemptsRemaining != other.cAttemptsRemaining) return false
        if (!this.pbSessionPin.contentEquals(other.pbSessionPin)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbSessionPin.hashCode()
        result = 31 * result + this.cAttemptsRemaining.hashCode()
        result = 31 * result + this.pbSessionPin.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardAuthenticateResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardAuthenticateResponse> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CardAuthenticateResponse =
                    CardAuthenticateResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CardAuthenticateResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbSessionPin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cAttemptsRemaining)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.pbSessionPin.toList())
                }
            }
    }
}

public data class CardCacheFileFormat(
    public var bVersion: UByte = 0u,
    public var bPinsFreshness: UByte = 0u,
    public var wContainersFreshness: UShort = 0u,
    public var wFilesFreshness: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardCacheFileFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardCacheFileFormat> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): CardCacheFileFormat =
                    CardCacheFileFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CardCacheFileFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bPinsFreshness)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wContainersFreshness)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wFilesFreshness)
                }
            }
    }
}

public data class CardCapabilities(
    public var dwVersion: UInt = 0u,
    public var fCertificateCompression: Bool = 0,
    public var fKeyGen: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CardCapabilities =
                    CardCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CardCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fCertificateCompression)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fKeyGen)
                }
            }
    }
}

public data class CardChangeAuthenticator(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwAuthenticatingPinId: UInt = 0u,
    public var cbAuthenticatingPinData: UInt = 0u,
    public var dwTargetPinId: UInt = 0u,
    public var cbTargetData: UInt = 0u,
    public var cRetryCount: UInt = 0u,
    public var pbData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardChangeAuthenticator) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwAuthenticatingPinId != other.dwAuthenticatingPinId) return false
        if (this.cbAuthenticatingPinData != other.cbAuthenticatingPinData) return false
        if (this.dwTargetPinId != other.dwTargetPinId) return false
        if (this.cbTargetData != other.cbTargetData) return false
        if (this.cRetryCount != other.cRetryCount) return false
        if (!this.pbData.contentEquals(other.pbData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwAuthenticatingPinId.hashCode()
        result = 31 * result + this.cbAuthenticatingPinData.hashCode()
        result = 31 * result + this.dwTargetPinId.hashCode()
        result = 31 * result + this.cbTargetData.hashCode()
        result = 31 * result + this.cRetryCount.hashCode()
        result = 31 * result + this.pbData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardChangeAuthenticator> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardChangeAuthenticator> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CardChangeAuthenticator =
                    CardChangeAuthenticator(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CardChangeAuthenticator) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAuthenticatingPinId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbAuthenticatingPinData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwTargetPinId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbTargetData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cRetryCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 28L, value.pbData.toList())
                }
            }
    }
}

public data class CardChangeAuthenticatorResponse(
    public var dwVersion: UInt = 0u,
    public var cAttemptsRemaining: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardChangeAuthenticatorResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardChangeAuthenticatorResponse> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CardChangeAuthenticatorResponse =
                    CardChangeAuthenticatorResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CardChangeAuthenticatorResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cAttemptsRemaining)
                }
            }
    }
}

public class CardData internal constructor(
    public var dwVersion: UInt,
    pbAtrCtorArg: MutPtr<UByte>,
    public var cbAtr: UInt,
    pwszCardNameCtorArg: Pwstr,
    public var pfnCspAlloc: PfnCspAlloc,
    public var pfnCspReAlloc: PfnCspRealloc,
    public var pfnCspFree: PfnCspFree,
    public var pfnCspCacheAddFile: PfnCspCacheAddFile,
    public var pfnCspCacheLookupFile: PfnCspCacheLookupFile,
    public var pfnCspCacheDeleteFile: PfnCspCacheDeleteFile,
    pvCacheContextCtorArg: MutPtr<CVoid>,
    public var pfnCspPadData: PfnCspPadData,
    public var hSCardCtx: Int,
    public var hScard: Int,
    pvVendorSpecificCtorArg: MutPtr<CVoid>,
    public var pfnCardDeleteContext: PfnCardDeleteContext,
    public var pfnCardQueryCapabilities: PfnCardQueryCapabilities,
    public var pfnCardDeleteContainer: PfnCardDeleteContainer,
    public var pfnCardCreateContainer: PfnCardCreateContainer,
    public var pfnCardGetContainerInfo: PfnCardGetContainerInfo,
    public var pfnCardAuthenticatePin: PfnCardAuthenticatePin,
    public var pfnCardGetChallenge: PfnCardGetChallenge,
    public var pfnCardAuthenticateChallenge: PfnCardAuthenticateChallenge,
    public var pfnCardUnblockPin: PfnCardUnblockPin,
    public var pfnCardChangeAuthenticator: PfnCardChangeAuthenticator,
    public var pfnCardDeauthenticate: PfnCardDeauthenticate,
    public var pfnCardCreateDirectory: PfnCardCreateDirectory,
    public var pfnCardDeleteDirectory: PfnCardDeleteDirectory,
    pvUnused3CtorArg: MutPtr<CVoid>,
    pvUnused4CtorArg: MutPtr<CVoid>,
    public var pfnCardCreateFile: PfnCardCreateFile,
    public var pfnCardReadFile: PfnCardReadFile,
    public var pfnCardWriteFile: PfnCardWriteFile,
    public var pfnCardDeleteFile: PfnCardDeleteFile,
    public var pfnCardEnumFiles: PfnCardEnumFiles,
    public var pfnCardGetFileInfo: PfnCardGetFileInfo,
    public var pfnCardQueryFreeSpace: PfnCardQueryFreeSpace,
    public var pfnCardQueryKeySizes: PfnCardQueryKeySizes,
    public var pfnCardSignData: PfnCardSignData,
    public var pfnCardRSADecrypt: PfnCardRsaDecrypt,
    public var pfnCardConstructDHAgreement: PfnCardConstructDhAgreement,
    public var pfnCardDeriveKey: PfnCardDeriveKey,
    public var pfnCardDestroyDHAgreement: PfnCardDestroyDhAgreement,
    public var pfnCspGetDHAgreement: PfnCspGetDhAgreement,
    public var pfnCardGetChallengeEx: PfnCardGetChallengeEx,
    public var pfnCardAuthenticateEx: PfnCardAuthenticateEx,
    public var pfnCardChangeAuthenticatorEx: PfnCardChangeAuthenticatorEx,
    public var pfnCardDeauthenticateEx: PfnCardDeauthenticateEx,
    public var pfnCardGetContainerProperty: PfnCardGetContainerProperty,
    public var pfnCardSetContainerProperty: PfnCardSetContainerProperty,
    public var pfnCardGetProperty: PfnCardGetProperty,
    public var pfnCardSetProperty: PfnCardSetProperty,
    public var pfnCspUnpadData: PfnCspUnpadData,
    public var pfnMDImportSessionKey: PfnMdImportSessionKey,
    public var pfnMDEncryptData: PfnMdEncryptData,
    public var pfnCardImportSessionKey: PfnCardImportSessionKey,
    public var pfnCardGetSharedKeyHandle: PfnCardGetSharedKeyHandle,
    public var pfnCardGetAlgorithmProperty: PfnCardGetAlgorithmProperty,
    public var pfnCardGetKeyProperty: PfnCardGetKeyProperty,
    public var pfnCardSetKeyProperty: PfnCardSetKeyProperty,
    public var pfnCardDestroyKey: PfnCardDestroyKey,
    public var pfnCardProcessEncryptedData: PfnCardProcessEncryptedData,
    public var pfnCardCreateContainerEx: PfnCardCreateContainerEx,
) {
    public var pbAtr: MutPtr<UByte> = pbAtrCtorArg
        internal set

    public var pwszCardName: Pwstr = pwszCardNameCtorArg
        internal set

    public var pvCacheContext: MutPtr<CVoid> = pvCacheContextCtorArg
        internal set

    public var pvVendorSpecific: MutPtr<CVoid> = pvVendorSpecificCtorArg
        internal set

    public var pvUnused3: MutPtr<CVoid> = pvUnused3CtorArg
        internal set

    public var pvUnused4: MutPtr<CVoid> = pvUnused4CtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pbAtrCtorArg = MutPtr(0L),
        cbAtr = 0u,
        pwszCardNameCtorArg = MutPtr(0L),
        pfnCspAlloc = null,
        pfnCspReAlloc = null,
        pfnCspFree = null,
        pfnCspCacheAddFile = null,
        pfnCspCacheLookupFile = null,
        pfnCspCacheDeleteFile = null,
        pvCacheContextCtorArg = MutPtr(0L),
        pfnCspPadData = null,
        hSCardCtx = 0,
        hScard = 0,
        pvVendorSpecificCtorArg = MutPtr(0L),
        pfnCardDeleteContext = null,
        pfnCardQueryCapabilities = null,
        pfnCardDeleteContainer = null,
        pfnCardCreateContainer = null,
        pfnCardGetContainerInfo = null,
        pfnCardAuthenticatePin = null,
        pfnCardGetChallenge = null,
        pfnCardAuthenticateChallenge = null,
        pfnCardUnblockPin = null,
        pfnCardChangeAuthenticator = null,
        pfnCardDeauthenticate = null,
        pfnCardCreateDirectory = null,
        pfnCardDeleteDirectory = null,
        pvUnused3CtorArg = MutPtr(0L),
        pvUnused4CtorArg = MutPtr(0L),
        pfnCardCreateFile = null,
        pfnCardReadFile = null,
        pfnCardWriteFile = null,
        pfnCardDeleteFile = null,
        pfnCardEnumFiles = null,
        pfnCardGetFileInfo = null,
        pfnCardQueryFreeSpace = null,
        pfnCardQueryKeySizes = null,
        pfnCardSignData = null,
        pfnCardRSADecrypt = null,
        pfnCardConstructDHAgreement = null,
        pfnCardDeriveKey = null,
        pfnCardDestroyDHAgreement = null,
        pfnCspGetDHAgreement = null,
        pfnCardGetChallengeEx = null,
        pfnCardAuthenticateEx = null,
        pfnCardChangeAuthenticatorEx = null,
        pfnCardDeauthenticateEx = null,
        pfnCardGetContainerProperty = null,
        pfnCardSetContainerProperty = null,
        pfnCardGetProperty = null,
        pfnCardSetProperty = null,
        pfnCspUnpadData = null,
        pfnMDImportSessionKey = null,
        pfnMDEncryptData = null,
        pfnCardImportSessionKey = null,
        pfnCardGetSharedKeyHandle = null,
        pfnCardGetAlgorithmProperty = null,
        pfnCardGetKeyProperty = null,
        pfnCardSetKeyProperty = null,
        pfnCardDestroyKey = null,
        pfnCardProcessEncryptedData = null,
        pfnCardCreateContainerEx = null,
    )

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            pbAtr: MutPtr<UByte> = MutPtr(0L),
            cbAtr: UInt = 0u,
            pwszCardName: Pwstr = MutPtr(0L),
            pfnCspAlloc: PfnCspAlloc = null,
            pfnCspReAlloc: PfnCspRealloc = null,
            pfnCspFree: PfnCspFree = null,
            pfnCspCacheAddFile: PfnCspCacheAddFile = null,
            pfnCspCacheLookupFile: PfnCspCacheLookupFile = null,
            pfnCspCacheDeleteFile: PfnCspCacheDeleteFile = null,
            pvCacheContext: MutPtr<CVoid> = MutPtr(0L),
            pfnCspPadData: PfnCspPadData = null,
            hSCardCtx: Int = 0,
            hScard: Int = 0,
            pvVendorSpecific: MutPtr<CVoid> = MutPtr(0L),
            pfnCardDeleteContext: PfnCardDeleteContext = null,
            pfnCardQueryCapabilities: PfnCardQueryCapabilities = null,
            pfnCardDeleteContainer: PfnCardDeleteContainer = null,
            pfnCardCreateContainer: PfnCardCreateContainer = null,
            pfnCardGetContainerInfo: PfnCardGetContainerInfo = null,
            pfnCardAuthenticatePin: PfnCardAuthenticatePin = null,
            pfnCardGetChallenge: PfnCardGetChallenge = null,
            pfnCardAuthenticateChallenge: PfnCardAuthenticateChallenge = null,
            pfnCardUnblockPin: PfnCardUnblockPin = null,
            pfnCardChangeAuthenticator: PfnCardChangeAuthenticator = null,
            pfnCardDeauthenticate: PfnCardDeauthenticate = null,
            pfnCardCreateDirectory: PfnCardCreateDirectory = null,
            pfnCardDeleteDirectory: PfnCardDeleteDirectory = null,
            pvUnused3: MutPtr<CVoid> = MutPtr(0L),
            pvUnused4: MutPtr<CVoid> = MutPtr(0L),
            pfnCardCreateFile: PfnCardCreateFile = null,
            pfnCardReadFile: PfnCardReadFile = null,
            pfnCardWriteFile: PfnCardWriteFile = null,
            pfnCardDeleteFile: PfnCardDeleteFile = null,
            pfnCardEnumFiles: PfnCardEnumFiles = null,
            pfnCardGetFileInfo: PfnCardGetFileInfo = null,
            pfnCardQueryFreeSpace: PfnCardQueryFreeSpace = null,
            pfnCardQueryKeySizes: PfnCardQueryKeySizes = null,
            pfnCardSignData: PfnCardSignData = null,
            pfnCardRSADecrypt: PfnCardRsaDecrypt = null,
            pfnCardConstructDHAgreement: PfnCardConstructDhAgreement = null,
            pfnCardDeriveKey: PfnCardDeriveKey = null,
            pfnCardDestroyDHAgreement: PfnCardDestroyDhAgreement = null,
            pfnCspGetDHAgreement: PfnCspGetDhAgreement = null,
            pfnCardGetChallengeEx: PfnCardGetChallengeEx = null,
            pfnCardAuthenticateEx: PfnCardAuthenticateEx = null,
            pfnCardChangeAuthenticatorEx: PfnCardChangeAuthenticatorEx = null,
            pfnCardDeauthenticateEx: PfnCardDeauthenticateEx = null,
            pfnCardGetContainerProperty: PfnCardGetContainerProperty = null,
            pfnCardSetContainerProperty: PfnCardSetContainerProperty = null,
            pfnCardGetProperty: PfnCardGetProperty = null,
            pfnCardSetProperty: PfnCardSetProperty = null,
            pfnCspUnpadData: PfnCspUnpadData = null,
            pfnMDImportSessionKey: PfnMdImportSessionKey = null,
            pfnMDEncryptData: PfnMdEncryptData = null,
            pfnCardImportSessionKey: PfnCardImportSessionKey = null,
            pfnCardGetSharedKeyHandle: PfnCardGetSharedKeyHandle = null,
            pfnCardGetAlgorithmProperty: PfnCardGetAlgorithmProperty = null,
            pfnCardGetKeyProperty: PfnCardGetKeyProperty = null,
            pfnCardSetKeyProperty: PfnCardSetKeyProperty = null,
            pfnCardDestroyKey: PfnCardDestroyKey = null,
            pfnCardProcessEncryptedData: PfnCardProcessEncryptedData = null,
            pfnCardCreateContainerEx: PfnCardCreateContainerEx = null,
        ): CardData =
            CardData(
                dwVersion = dwVersion,
                pbAtrCtorArg = pbAtr,
                cbAtr = cbAtr,
                pwszCardNameCtorArg = pwszCardName,
                pfnCspAlloc = pfnCspAlloc,
                pfnCspReAlloc = pfnCspReAlloc,
                pfnCspFree = pfnCspFree,
                pfnCspCacheAddFile = pfnCspCacheAddFile,
                pfnCspCacheLookupFile = pfnCspCacheLookupFile,
                pfnCspCacheDeleteFile = pfnCspCacheDeleteFile,
                pvCacheContextCtorArg = pvCacheContext,
                pfnCspPadData = pfnCspPadData,
                hSCardCtx = hSCardCtx,
                hScard = hScard,
                pvVendorSpecificCtorArg = pvVendorSpecific,
                pfnCardDeleteContext = pfnCardDeleteContext,
                pfnCardQueryCapabilities = pfnCardQueryCapabilities,
                pfnCardDeleteContainer = pfnCardDeleteContainer,
                pfnCardCreateContainer = pfnCardCreateContainer,
                pfnCardGetContainerInfo = pfnCardGetContainerInfo,
                pfnCardAuthenticatePin = pfnCardAuthenticatePin,
                pfnCardGetChallenge = pfnCardGetChallenge,
                pfnCardAuthenticateChallenge = pfnCardAuthenticateChallenge,
                pfnCardUnblockPin = pfnCardUnblockPin,
                pfnCardChangeAuthenticator = pfnCardChangeAuthenticator,
                pfnCardDeauthenticate = pfnCardDeauthenticate,
                pfnCardCreateDirectory = pfnCardCreateDirectory,
                pfnCardDeleteDirectory = pfnCardDeleteDirectory,
                pvUnused3CtorArg = pvUnused3,
                pvUnused4CtorArg = pvUnused4,
                pfnCardCreateFile = pfnCardCreateFile,
                pfnCardReadFile = pfnCardReadFile,
                pfnCardWriteFile = pfnCardWriteFile,
                pfnCardDeleteFile = pfnCardDeleteFile,
                pfnCardEnumFiles = pfnCardEnumFiles,
                pfnCardGetFileInfo = pfnCardGetFileInfo,
                pfnCardQueryFreeSpace = pfnCardQueryFreeSpace,
                pfnCardQueryKeySizes = pfnCardQueryKeySizes,
                pfnCardSignData = pfnCardSignData,
                pfnCardRSADecrypt = pfnCardRSADecrypt,
                pfnCardConstructDHAgreement = pfnCardConstructDHAgreement,
                pfnCardDeriveKey = pfnCardDeriveKey,
                pfnCardDestroyDHAgreement = pfnCardDestroyDHAgreement,
                pfnCspGetDHAgreement = pfnCspGetDHAgreement,
                pfnCardGetChallengeEx = pfnCardGetChallengeEx,
                pfnCardAuthenticateEx = pfnCardAuthenticateEx,
                pfnCardChangeAuthenticatorEx = pfnCardChangeAuthenticatorEx,
                pfnCardDeauthenticateEx = pfnCardDeauthenticateEx,
                pfnCardGetContainerProperty = pfnCardGetContainerProperty,
                pfnCardSetContainerProperty = pfnCardSetContainerProperty,
                pfnCardGetProperty = pfnCardGetProperty,
                pfnCardSetProperty = pfnCardSetProperty,
                pfnCspUnpadData = pfnCspUnpadData,
                pfnMDImportSessionKey = pfnMDImportSessionKey,
                pfnMDEncryptData = pfnMDEncryptData,
                pfnCardImportSessionKey = pfnCardImportSessionKey,
                pfnCardGetSharedKeyHandle = pfnCardGetSharedKeyHandle,
                pfnCardGetAlgorithmProperty = pfnCardGetAlgorithmProperty,
                pfnCardGetKeyProperty = pfnCardGetKeyProperty,
                pfnCardSetKeyProperty = pfnCardSetKeyProperty,
                pfnCardDestroyKey = pfnCardDestroyKey,
                pfnCardProcessEncryptedData = pfnCardProcessEncryptedData,
                pfnCardCreateContainerEx = pfnCardCreateContainerEx,
            )
    }
}

public class CardDeriveKey internal constructor(
    public var dwVersion: UInt,
    public var dwFlags: UInt,
    pwszKDFCtorArg: Pwstr,
    public var bSecretAgreementIndex: UByte,
    pParameterListCtorArg: MutPtr<CVoid>,
    pbDerivedKeyCtorArg: MutPtr<UByte>,
    public var cbDerivedKey: UInt,
    pwszAlgIdCtorArg: Pwstr,
    public var dwKeyLen: UInt,
    public var hKey: Int,
) {
    public var pwszKDF: Pwstr = pwszKDFCtorArg
        internal set

    public var pParameterList: MutPtr<CVoid> = pParameterListCtorArg
        internal set

    public var pbDerivedKey: MutPtr<UByte> = pbDerivedKeyCtorArg
        internal set

    public var pwszAlgId: Pwstr = pwszAlgIdCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwFlags = 0u,
        pwszKDFCtorArg = MutPtr(0L),
        bSecretAgreementIndex = 0u,
        pParameterListCtorArg = MutPtr(0L),
        pbDerivedKeyCtorArg = MutPtr(0L),
        cbDerivedKey = 0u,
        pwszAlgIdCtorArg = MutPtr(0L),
        dwKeyLen = 0u,
        hKey = 0,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pwstr = this.pwszKDF

    public operator fun component4(): UByte = this.bSecretAgreementIndex

    public operator fun component5(): MutPtr<CVoid> = this.pParameterList

    public operator fun component6(): MutPtr<UByte> = this.pbDerivedKey

    public operator fun component7(): UInt = this.cbDerivedKey

    public operator fun component8(): Pwstr = this.pwszAlgId

    public operator fun component9(): UInt = this.dwKeyLen

    public operator fun component10(): Int = this.hKey

    public fun copy(dwVersion: UInt = this.dwVersion, dwFlags: UInt = this.dwFlags, pwszKDF: Pwstr = this.pwszKDF, bSecretAgreementIndex: UByte = this.bSecretAgreementIndex, pParameterList: MutPtr<CVoid> = this.pParameterList, pbDerivedKey: MutPtr<UByte> = this.pbDerivedKey, cbDerivedKey: UInt = this.cbDerivedKey, pwszAlgId: Pwstr = this.pwszAlgId, dwKeyLen: UInt = this.dwKeyLen, hKey: Int = this.hKey): CardDeriveKey = CardDeriveKey(dwVersion = dwVersion, dwFlags = dwFlags, pwszKDFCtorArg = pwszKDF, bSecretAgreementIndex = bSecretAgreementIndex, pParameterListCtorArg = pParameterList, pbDerivedKeyCtorArg = pbDerivedKey, cbDerivedKey = cbDerivedKey, pwszAlgIdCtorArg = pwszAlgId, dwKeyLen = dwKeyLen, hKey = hKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardDeriveKey) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pwszKDF != other.pwszKDF) return false
        if (this.bSecretAgreementIndex != other.bSecretAgreementIndex) return false
        if (this.pParameterList != other.pParameterList) return false
        if (this.pbDerivedKey != other.pbDerivedKey) return false
        if (this.cbDerivedKey != other.cbDerivedKey) return false
        if (this.pwszAlgId != other.pwszAlgId) return false
        if (this.dwKeyLen != other.dwKeyLen) return false
        if (this.hKey != other.hKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pwszKDF.hashCode()
        result = 31 * result + this.bSecretAgreementIndex.hashCode()
        result = 31 * result + this.pParameterList.hashCode()
        result = 31 * result + this.pbDerivedKey.hashCode()
        result = 31 * result + this.cbDerivedKey.hashCode()
        result = 31 * result + this.pwszAlgId.hashCode()
        result = 31 * result + this.dwKeyLen.hashCode()
        result = 31 * result + this.hKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwFlags: UInt = 0u,
            pwszKDF: Pwstr = MutPtr(0L),
            bSecretAgreementIndex: UByte = 0u,
            pParameterList: MutPtr<CVoid> = MutPtr(0L),
            pbDerivedKey: MutPtr<UByte> = MutPtr(0L),
            cbDerivedKey: UInt = 0u,
            pwszAlgId: Pwstr = MutPtr(0L),
            dwKeyLen: UInt = 0u,
            hKey: Int = 0,
        ): CardDeriveKey =
            CardDeriveKey(
                dwVersion = dwVersion,
                dwFlags = dwFlags,
                pwszKDFCtorArg = pwszKDF,
                bSecretAgreementIndex = bSecretAgreementIndex,
                pParameterListCtorArg = pParameterList,
                pbDerivedKeyCtorArg = pbDerivedKey,
                cbDerivedKey = cbDerivedKey,
                pwszAlgIdCtorArg = pwszAlgId,
                dwKeyLen = dwKeyLen,
                hKey = hKey,
            )
    }
}

public class CardDhAgreementInfo internal constructor(
    public var dwVersion: UInt,
    public var bContainerIndex: UByte,
    public var dwFlags: UInt,
    public var dwPublicKey: UInt,
    pbPublicKeyCtorArg: MutPtr<UByte>,
    pbReservedCtorArg: MutPtr<UByte>,
    public var cbReserved: UInt,
    public var bSecretAgreementIndex: UByte,
) {
    public var pbPublicKey: MutPtr<UByte> = pbPublicKeyCtorArg
        internal set

    public var pbReserved: MutPtr<UByte> = pbReservedCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        bContainerIndex = 0u,
        dwFlags = 0u,
        dwPublicKey = 0u,
        pbPublicKeyCtorArg = MutPtr(0L),
        pbReservedCtorArg = MutPtr(0L),
        cbReserved = 0u,
        bSecretAgreementIndex = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UByte = this.bContainerIndex

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): UInt = this.dwPublicKey

    public operator fun component5(): MutPtr<UByte> = this.pbPublicKey

    public operator fun component6(): MutPtr<UByte> = this.pbReserved

    public operator fun component7(): UInt = this.cbReserved

    public operator fun component8(): UByte = this.bSecretAgreementIndex

    public fun copy(dwVersion: UInt = this.dwVersion, bContainerIndex: UByte = this.bContainerIndex, dwFlags: UInt = this.dwFlags, dwPublicKey: UInt = this.dwPublicKey, pbPublicKey: MutPtr<UByte> = this.pbPublicKey, pbReserved: MutPtr<UByte> = this.pbReserved, cbReserved: UInt = this.cbReserved, bSecretAgreementIndex: UByte = this.bSecretAgreementIndex): CardDhAgreementInfo = CardDhAgreementInfo(dwVersion = dwVersion, bContainerIndex = bContainerIndex, dwFlags = dwFlags, dwPublicKey = dwPublicKey, pbPublicKeyCtorArg = pbPublicKey, pbReservedCtorArg = pbReserved, cbReserved = cbReserved, bSecretAgreementIndex = bSecretAgreementIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardDhAgreementInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.bContainerIndex != other.bContainerIndex) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwPublicKey != other.dwPublicKey) return false
        if (this.pbPublicKey != other.pbPublicKey) return false
        if (this.pbReserved != other.pbReserved) return false
        if (this.cbReserved != other.cbReserved) return false
        if (this.bSecretAgreementIndex != other.bSecretAgreementIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.bContainerIndex.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwPublicKey.hashCode()
        result = 31 * result + this.pbPublicKey.hashCode()
        result = 31 * result + this.pbReserved.hashCode()
        result = 31 * result + this.cbReserved.hashCode()
        result = 31 * result + this.bSecretAgreementIndex.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardDhAgreementInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardDhAgreementInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CardDhAgreementInfo =
                    CardDhAgreementInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: CardDhAgreementInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bContainerIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwPublicKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.pbPublicKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pbReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cbReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 36L, value.bSecretAgreementIndex)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            bContainerIndex: UByte = 0u,
            dwFlags: UInt = 0u,
            dwPublicKey: UInt = 0u,
            pbPublicKey: MutPtr<UByte> = MutPtr(0L),
            pbReserved: MutPtr<UByte> = MutPtr(0L),
            cbReserved: UInt = 0u,
            bSecretAgreementIndex: UByte = 0u,
        ): CardDhAgreementInfo =
            CardDhAgreementInfo(
                dwVersion = dwVersion,
                bContainerIndex = bContainerIndex,
                dwFlags = dwFlags,
                dwPublicKey = dwPublicKey,
                pbPublicKeyCtorArg = pbPublicKey,
                pbReservedCtorArg = pbReserved,
                cbReserved = cbReserved,
                bSecretAgreementIndex = bSecretAgreementIndex,
            )
    }
}

public class CardEncryptedData internal constructor(
    pbEncryptedDataCtorArg: MutPtr<UByte>,
    public var cbEncryptedData: UInt,
) {
    public var pbEncryptedData: MutPtr<UByte> = pbEncryptedDataCtorArg
        internal set

    public constructor() : this(
        pbEncryptedDataCtorArg = MutPtr(0L),
        cbEncryptedData = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.pbEncryptedData

    public operator fun component2(): UInt = this.cbEncryptedData

    public fun copy(pbEncryptedData: MutPtr<UByte> = this.pbEncryptedData, cbEncryptedData: UInt = this.cbEncryptedData): CardEncryptedData = CardEncryptedData(pbEncryptedDataCtorArg = pbEncryptedData, cbEncryptedData = cbEncryptedData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardEncryptedData) return false
        if (this.pbEncryptedData != other.pbEncryptedData) return false
        if (this.cbEncryptedData != other.cbEncryptedData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pbEncryptedData.hashCode()
        result = 31 * result + this.cbEncryptedData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardEncryptedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardEncryptedData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CardEncryptedData =
                    CardEncryptedData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CardEncryptedData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.pbEncryptedData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbEncryptedData)
                }
            }

        public operator fun invoke(
            pbEncryptedData: MutPtr<UByte> = MutPtr(0L),
            cbEncryptedData: UInt = 0u,
        ): CardEncryptedData =
            CardEncryptedData(
                pbEncryptedDataCtorArg = pbEncryptedData,
                cbEncryptedData = cbEncryptedData,
            )
    }
}

public data class CardFileInfo(
    public var dwVersion: UInt = 0u,
    public var cbFileSize: UInt = 0u,
    public var accessCondition: CardFileAccessCondition = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardFileInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardFileInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CardFileInfo =
                    CardFileInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CardFileInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbFileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.accessCondition)
                }
            }
    }
}

public data class CardFreeSpaceInfo(
    public var dwVersion: UInt = 0u,
    public var dwBytesAvailable: UInt = 0u,
    public var dwKeyContainersAvailable: UInt = 0u,
    public var dwMaxKeyContainers: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardFreeSpaceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardFreeSpaceInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CardFreeSpaceInfo =
                    CardFreeSpaceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: CardFreeSpaceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwBytesAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwKeyContainersAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMaxKeyContainers)
                }
            }
    }
}

public data class CardImportKeypair(
    public var dwVersion: UInt = 0u,
    public var bContainerIndex: UByte = 0u,
    public var pinId: UInt = 0u,
    public var dwKeySpec: UInt = 0u,
    public var dwKeySize: UInt = 0u,
    public var cbInput: UInt = 0u,
    public var pbInput: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardImportKeypair) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.bContainerIndex != other.bContainerIndex) return false
        if (this.pinId != other.pinId) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.dwKeySize != other.dwKeySize) return false
        if (this.cbInput != other.cbInput) return false
        if (!this.pbInput.contentEquals(other.pbInput)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.bContainerIndex.hashCode()
        result = 31 * result + this.pinId.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.dwKeySize.hashCode()
        result = 31 * result + this.cbInput.hashCode()
        result = 31 * result + this.pbInput.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardImportKeypair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardImportKeypair> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): CardImportKeypair =
                    CardImportKeypair(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CardImportKeypair) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bContainerIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pinId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwKeySpec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwKeySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbInput)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 24L, value.pbInput.toList())
                }
            }
    }
}

public data class CardKeySizes(
    public var dwVersion: UInt = 0u,
    public var dwMinimumBitlen: UInt = 0u,
    public var dwDefaultBitlen: UInt = 0u,
    public var dwMaximumBitlen: UInt = 0u,
    public var dwIncrementalBitlen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardKeySizes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardKeySizes> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): CardKeySizes =
                    CardKeySizes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CardKeySizes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMinimumBitlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDefaultBitlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMaximumBitlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwIncrementalBitlen)
                }
            }
    }
}

public class CardRsaDecryptInfo internal constructor(
    public var dwVersion: UInt,
    public var bContainerIndex: UByte,
    public var dwKeySpec: UInt,
    pbDataCtorArg: MutPtr<UByte>,
    public var cbData: UInt,
    pPaddingInfoCtorArg: MutPtr<CVoid>,
    public var dwPaddingType: UInt,
) {
    public var pbData: MutPtr<UByte> = pbDataCtorArg
        internal set

    public var pPaddingInfo: MutPtr<CVoid> = pPaddingInfoCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        bContainerIndex = 0u,
        dwKeySpec = 0u,
        pbDataCtorArg = MutPtr(0L),
        cbData = 0u,
        pPaddingInfoCtorArg = MutPtr(0L),
        dwPaddingType = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UByte = this.bContainerIndex

    public operator fun component3(): UInt = this.dwKeySpec

    public operator fun component4(): MutPtr<UByte> = this.pbData

    public operator fun component5(): UInt = this.cbData

    public operator fun component6(): MutPtr<CVoid> = this.pPaddingInfo

    public operator fun component7(): UInt = this.dwPaddingType

    public fun copy(dwVersion: UInt = this.dwVersion, bContainerIndex: UByte = this.bContainerIndex, dwKeySpec: UInt = this.dwKeySpec, pbData: MutPtr<UByte> = this.pbData, cbData: UInt = this.cbData, pPaddingInfo: MutPtr<CVoid> = this.pPaddingInfo, dwPaddingType: UInt = this.dwPaddingType): CardRsaDecryptInfo = CardRsaDecryptInfo(dwVersion = dwVersion, bContainerIndex = bContainerIndex, dwKeySpec = dwKeySpec, pbDataCtorArg = pbData, cbData = cbData, pPaddingInfoCtorArg = pPaddingInfo, dwPaddingType = dwPaddingType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardRsaDecryptInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.bContainerIndex != other.bContainerIndex) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.pbData != other.pbData) return false
        if (this.cbData != other.cbData) return false
        if (this.pPaddingInfo != other.pPaddingInfo) return false
        if (this.dwPaddingType != other.dwPaddingType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.bContainerIndex.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.pbData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pPaddingInfo.hashCode()
        result = 31 * result + this.dwPaddingType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardRsaDecryptInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardRsaDecryptInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CardRsaDecryptInfo =
                    CardRsaDecryptInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CardRsaDecryptInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bContainerIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwKeySpec)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.pbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.pPaddingInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwPaddingType)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            bContainerIndex: UByte = 0u,
            dwKeySpec: UInt = 0u,
            pbData: MutPtr<UByte> = MutPtr(0L),
            cbData: UInt = 0u,
            pPaddingInfo: MutPtr<CVoid> = MutPtr(0L),
            dwPaddingType: UInt = 0u,
        ): CardRsaDecryptInfo =
            CardRsaDecryptInfo(
                dwVersion = dwVersion,
                bContainerIndex = bContainerIndex,
                dwKeySpec = dwKeySpec,
                pbDataCtorArg = pbData,
                cbData = cbData,
                pPaddingInfoCtorArg = pPaddingInfo,
                dwPaddingType = dwPaddingType,
            )
    }
}

public class CardSigningInfo internal constructor(
    public var dwVersion: UInt,
    public var bContainerIndex: UByte,
    public var dwKeySpec: UInt,
    public var dwSigningFlags: UInt,
    public var aiHashAlg: AlgId,
    pbDataCtorArg: MutPtr<UByte>,
    public var cbData: UInt,
    pbSignedDataCtorArg: MutPtr<UByte>,
    public var cbSignedData: UInt,
    pPaddingInfoCtorArg: MutPtr<CVoid>,
    public var dwPaddingType: UInt,
) {
    public var pbData: MutPtr<UByte> = pbDataCtorArg
        internal set

    public var pbSignedData: MutPtr<UByte> = pbSignedDataCtorArg
        internal set

    public var pPaddingInfo: MutPtr<CVoid> = pPaddingInfoCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        bContainerIndex = 0u,
        dwKeySpec = 0u,
        dwSigningFlags = 0u,
        aiHashAlg = 0u,
        pbDataCtorArg = MutPtr(0L),
        cbData = 0u,
        pbSignedDataCtorArg = MutPtr(0L),
        cbSignedData = 0u,
        pPaddingInfoCtorArg = MutPtr(0L),
        dwPaddingType = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UByte = this.bContainerIndex

    public operator fun component3(): UInt = this.dwKeySpec

    public operator fun component4(): UInt = this.dwSigningFlags

    public operator fun component5(): AlgId = this.aiHashAlg

    public operator fun component6(): MutPtr<UByte> = this.pbData

    public operator fun component7(): UInt = this.cbData

    public operator fun component8(): MutPtr<UByte> = this.pbSignedData

    public operator fun component9(): UInt = this.cbSignedData

    public operator fun component10(): MutPtr<CVoid> = this.pPaddingInfo

    public operator fun component11(): UInt = this.dwPaddingType

    public fun copy(dwVersion: UInt = this.dwVersion, bContainerIndex: UByte = this.bContainerIndex, dwKeySpec: UInt = this.dwKeySpec, dwSigningFlags: UInt = this.dwSigningFlags, aiHashAlg: AlgId = this.aiHashAlg, pbData: MutPtr<UByte> = this.pbData, cbData: UInt = this.cbData, pbSignedData: MutPtr<UByte> = this.pbSignedData, cbSignedData: UInt = this.cbSignedData, pPaddingInfo: MutPtr<CVoid> = this.pPaddingInfo, dwPaddingType: UInt = this.dwPaddingType): CardSigningInfo = CardSigningInfo(dwVersion = dwVersion, bContainerIndex = bContainerIndex, dwKeySpec = dwKeySpec, dwSigningFlags = dwSigningFlags, aiHashAlg = aiHashAlg, pbDataCtorArg = pbData, cbData = cbData, pbSignedDataCtorArg = pbSignedData, cbSignedData = cbSignedData, pPaddingInfoCtorArg = pPaddingInfo, dwPaddingType = dwPaddingType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardSigningInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.bContainerIndex != other.bContainerIndex) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.dwSigningFlags != other.dwSigningFlags) return false
        if (this.aiHashAlg != other.aiHashAlg) return false
        if (this.pbData != other.pbData) return false
        if (this.cbData != other.cbData) return false
        if (this.pbSignedData != other.pbSignedData) return false
        if (this.cbSignedData != other.cbSignedData) return false
        if (this.pPaddingInfo != other.pPaddingInfo) return false
        if (this.dwPaddingType != other.dwPaddingType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.bContainerIndex.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.dwSigningFlags.hashCode()
        result = 31 * result + this.aiHashAlg.hashCode()
        result = 31 * result + this.pbData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pbSignedData.hashCode()
        result = 31 * result + this.cbSignedData.hashCode()
        result = 31 * result + this.pPaddingInfo.hashCode()
        result = 31 * result + this.dwPaddingType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardSigningInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CardSigningInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): CardSigningInfo =
                    CardSigningInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: CardSigningInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bContainerIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwKeySpec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSigningFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aiHashAlg)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 40L, value.pbSignedData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cbSignedData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.pPaddingInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwPaddingType)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            bContainerIndex: UByte = 0u,
            dwKeySpec: UInt = 0u,
            dwSigningFlags: UInt = 0u,
            aiHashAlg: AlgId = 0u,
            pbData: MutPtr<UByte> = MutPtr(0L),
            cbData: UInt = 0u,
            pbSignedData: MutPtr<UByte> = MutPtr(0L),
            cbSignedData: UInt = 0u,
            pPaddingInfo: MutPtr<CVoid> = MutPtr(0L),
            dwPaddingType: UInt = 0u,
        ): CardSigningInfo =
            CardSigningInfo(
                dwVersion = dwVersion,
                bContainerIndex = bContainerIndex,
                dwKeySpec = dwKeySpec,
                dwSigningFlags = dwSigningFlags,
                aiHashAlg = aiHashAlg,
                pbDataCtorArg = pbData,
                cbData = cbData,
                pbSignedDataCtorArg = pbSignedData,
                cbSignedData = cbSignedData,
                pPaddingInfoCtorArg = pPaddingInfo,
                dwPaddingType = dwPaddingType,
            )
    }
}

public class CertificateChainBlob internal constructor(
    public var certCount: UInt,
    rawCertificatesCtorArg: MutPtr<CryptIntegerBlob>,
) {
    public var rawCertificates: MutPtr<CryptIntegerBlob> = rawCertificatesCtorArg
        internal set

    public constructor() : this(
        certCount = 0u,
        rawCertificatesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.certCount

    public operator fun component2(): MutPtr<CryptIntegerBlob> = this.rawCertificates

    public fun copy(certCount: UInt = this.certCount, rawCertificates: MutPtr<CryptIntegerBlob> = this.rawCertificates): CertificateChainBlob = CertificateChainBlob(certCount = certCount, rawCertificatesCtorArg = rawCertificates)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertificateChainBlob) return false
        if (this.certCount != other.certCount) return false
        if (this.rawCertificates != other.rawCertificates) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.certCount.hashCode()
        result = 31 * result + this.rawCertificates.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertificateChainBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertificateChainBlob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertificateChainBlob =
                    CertificateChainBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CryptIntegerBlob>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertificateChainBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.certCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CryptIntegerBlob>(64)
                    ).writeNative(addr + 8L, value.rawCertificates)
                }
            }

        public operator fun invoke(
            certCount: UInt = 0u,
            rawCertificates: MutPtr<CryptIntegerBlob> = MutPtr(0L),
        ): CertificateChainBlob =
            CertificateChainBlob(
                certCount = certCount,
                rawCertificatesCtorArg = rawCertificates,
            )
    }
}

public class CertAccessDescription internal constructor(
    pszAccessMethodCtorArg: Pstr,
    public var accessLocation: CertAltNameEntry,
) {
    public var pszAccessMethod: Pstr = pszAccessMethodCtorArg
        internal set

    public constructor() : this(
        pszAccessMethodCtorArg = MutPtr(0L),
        accessLocation = CertAltNameEntry(),
    )

    public operator fun component1(): Pstr = this.pszAccessMethod

    public operator fun component2(): CertAltNameEntry = this.accessLocation

    public fun copy(pszAccessMethod: Pstr = this.pszAccessMethod, accessLocation: CertAltNameEntry = this.accessLocation): CertAccessDescription = CertAccessDescription(pszAccessMethodCtorArg = pszAccessMethod, accessLocation = accessLocation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertAccessDescription) return false
        if (this.pszAccessMethod != other.pszAccessMethod) return false
        if (this.accessLocation != other.accessLocation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszAccessMethod.hashCode()
        result = 31 * result + this.accessLocation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszAccessMethod: Pstr = MutPtr(0L),
            accessLocation: CertAltNameEntry = CertAltNameEntry(),
        ): CertAccessDescription =
            CertAccessDescription(
                pszAccessMethodCtorArg = pszAccessMethod,
                accessLocation = accessLocation,
            )
    }
}

public data class CertAltNameEntry(
    public var dwAltNameChoice: UInt = 0u,
    public var anonymous: CertAltNameEntry0 = CertAltNameEntry0(),
)

public class CertAltNameEntry0 internal constructor(
    pOtherNameCtorArg: MutPtr<CertOtherName>,
    pwszRfc822NameCtorArg: Pwstr,
    pwszDNSNameCtorArg: Pwstr,
    public var directoryName: CryptIntegerBlob,
    pwszURLCtorArg: Pwstr,
    public var iPAddress: CryptIntegerBlob,
    pszRegisteredIDCtorArg: Pstr,
) {
    public var pOtherName: MutPtr<CertOtherName> = pOtherNameCtorArg
        internal set

    public var pwszRfc822Name: Pwstr = pwszRfc822NameCtorArg
        internal set

    public var pwszDNSName: Pwstr = pwszDNSNameCtorArg
        internal set

    public var pwszURL: Pwstr = pwszURLCtorArg
        internal set

    public var pszRegisteredID: Pstr = pszRegisteredIDCtorArg
        internal set

    public constructor() : this(
        pOtherNameCtorArg = MutPtr(0L),
        pwszRfc822NameCtorArg = MutPtr(0L),
        pwszDNSNameCtorArg = MutPtr(0L),
        directoryName = CryptIntegerBlob(),
        pwszURLCtorArg = MutPtr(0L),
        iPAddress = CryptIntegerBlob(),
        pszRegisteredIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CertOtherName> = this.pOtherName

    public operator fun component2(): Pwstr = this.pwszRfc822Name

    public operator fun component3(): Pwstr = this.pwszDNSName

    public operator fun component4(): CryptIntegerBlob = this.directoryName

    public operator fun component5(): Pwstr = this.pwszURL

    public operator fun component6(): CryptIntegerBlob = this.iPAddress

    public operator fun component7(): Pstr = this.pszRegisteredID

    public fun copy(pOtherName: MutPtr<CertOtherName> = this.pOtherName, pwszRfc822Name: Pwstr = this.pwszRfc822Name, pwszDNSName: Pwstr = this.pwszDNSName, directoryName: CryptIntegerBlob = this.directoryName, pwszURL: Pwstr = this.pwszURL, iPAddress: CryptIntegerBlob = this.iPAddress, pszRegisteredID: Pstr = this.pszRegisteredID): CertAltNameEntry0 = CertAltNameEntry0(pOtherNameCtorArg = pOtherName, pwszRfc822NameCtorArg = pwszRfc822Name, pwszDNSNameCtorArg = pwszDNSName, directoryName = directoryName, pwszURLCtorArg = pwszURL, iPAddress = iPAddress, pszRegisteredIDCtorArg = pszRegisteredID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertAltNameEntry0) return false
        if (this.pOtherName != other.pOtherName) return false
        if (this.pwszRfc822Name != other.pwszRfc822Name) return false
        if (this.pwszDNSName != other.pwszDNSName) return false
        if (this.directoryName != other.directoryName) return false
        if (this.pwszURL != other.pwszURL) return false
        if (this.iPAddress != other.iPAddress) return false
        if (this.pszRegisteredID != other.pszRegisteredID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pOtherName.hashCode()
        result = 31 * result + this.pwszRfc822Name.hashCode()
        result = 31 * result + this.pwszDNSName.hashCode()
        result = 31 * result + this.directoryName.hashCode()
        result = 31 * result + this.pwszURL.hashCode()
        result = 31 * result + this.iPAddress.hashCode()
        result = 31 * result + this.pszRegisteredID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pOtherName: MutPtr<CertOtherName> = MutPtr(0L),
            pwszRfc822Name: Pwstr = MutPtr(0L),
            pwszDNSName: Pwstr = MutPtr(0L),
            directoryName: CryptIntegerBlob = CryptIntegerBlob(),
            pwszURL: Pwstr = MutPtr(0L),
            iPAddress: CryptIntegerBlob = CryptIntegerBlob(),
            pszRegisteredID: Pstr = MutPtr(0L),
        ): CertAltNameEntry0 =
            CertAltNameEntry0(
                pOtherNameCtorArg = pOtherName,
                pwszRfc822NameCtorArg = pwszRfc822Name,
                pwszDNSNameCtorArg = pwszDNSName,
                directoryName = directoryName,
                pwszURLCtorArg = pwszURL,
                iPAddress = iPAddress,
                pszRegisteredIDCtorArg = pszRegisteredID,
            )
    }
}

public class CertAltNameInfo internal constructor(
    public var cAltEntry: UInt,
    rgAltEntryCtorArg: MutPtr<CertAltNameEntry>,
) {
    public var rgAltEntry: MutPtr<CertAltNameEntry> = rgAltEntryCtorArg
        internal set

    public constructor() : this(
        cAltEntry = 0u,
        rgAltEntryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cAltEntry

    public operator fun component2(): MutPtr<CertAltNameEntry> = this.rgAltEntry

    public fun copy(cAltEntry: UInt = this.cAltEntry, rgAltEntry: MutPtr<CertAltNameEntry> = this.rgAltEntry): CertAltNameInfo = CertAltNameInfo(cAltEntry = cAltEntry, rgAltEntryCtorArg = rgAltEntry)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertAltNameInfo) return false
        if (this.cAltEntry != other.cAltEntry) return false
        if (this.rgAltEntry != other.rgAltEntry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cAltEntry.hashCode()
        result = 31 * result + this.rgAltEntry.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertAltNameInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertAltNameInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertAltNameInfo =
                    CertAltNameInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertAltNameEntry>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertAltNameInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cAltEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertAltNameEntry>(64)
                    ).writeNative(addr + 8L, value.rgAltEntry)
                }
            }

        public operator fun invoke(
            cAltEntry: UInt = 0u,
            rgAltEntry: MutPtr<CertAltNameEntry> = MutPtr(0L),
        ): CertAltNameInfo =
            CertAltNameInfo(
                cAltEntry = cAltEntry,
                rgAltEntryCtorArg = rgAltEntry,
            )
    }
}

public class CertAuthorityInfoAccess internal constructor(
    public var cAccDescr: UInt,
    rgAccDescrCtorArg: MutPtr<CertAccessDescription>,
) {
    public var rgAccDescr: MutPtr<CertAccessDescription> = rgAccDescrCtorArg
        internal set

    public constructor() : this(
        cAccDescr = 0u,
        rgAccDescrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cAccDescr

    public operator fun component2(): MutPtr<CertAccessDescription> = this.rgAccDescr

    public fun copy(cAccDescr: UInt = this.cAccDescr, rgAccDescr: MutPtr<CertAccessDescription> = this.rgAccDescr): CertAuthorityInfoAccess = CertAuthorityInfoAccess(cAccDescr = cAccDescr, rgAccDescrCtorArg = rgAccDescr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertAuthorityInfoAccess) return false
        if (this.cAccDescr != other.cAccDescr) return false
        if (this.rgAccDescr != other.rgAccDescr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cAccDescr.hashCode()
        result = 31 * result + this.rgAccDescr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertAuthorityInfoAccess> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertAuthorityInfoAccess> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertAuthorityInfoAccess =
                    CertAuthorityInfoAccess(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertAccessDescription>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertAuthorityInfoAccess) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cAccDescr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertAccessDescription>(64)
                    ).writeNative(addr + 8L, value.rgAccDescr)
                }
            }

        public operator fun invoke(
            cAccDescr: UInt = 0u,
            rgAccDescr: MutPtr<CertAccessDescription> = MutPtr(0L),
        ): CertAuthorityInfoAccess =
            CertAuthorityInfoAccess(
                cAccDescr = cAccDescr,
                rgAccDescrCtorArg = rgAccDescr,
            )
    }
}

public data class CertAuthorityKeyId2Info(
    public var keyId: CryptIntegerBlob = CryptIntegerBlob(),
    public var authorityCertIssuer: CertAltNameInfo = CertAltNameInfo(),
    public var authorityCertSerialNumber: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertAuthorityKeyId2Info> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertAuthorityKeyId2Info> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CertAuthorityKeyId2Info =
                    CertAuthorityKeyId2Info(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (CertAltNameInfo.typeLayout()).readNative(addr + 16L),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CertAuthorityKeyId2Info) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.keyId)
                    (CertAltNameInfo.typeLayout()).writeNative(addr + 16L, value.authorityCertIssuer)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 32L, value.authorityCertSerialNumber)
                }
            }
    }
}

public data class CertAuthorityKeyIdInfo(
    public var keyId: CryptIntegerBlob = CryptIntegerBlob(),
    public var certIssuer: CryptIntegerBlob = CryptIntegerBlob(),
    public var certSerialNumber: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertAuthorityKeyIdInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertAuthorityKeyIdInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CertAuthorityKeyIdInfo =
                    CertAuthorityKeyIdInfo(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 16L),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CertAuthorityKeyIdInfo) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.keyId)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 16L, value.certIssuer)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 32L, value.certSerialNumber)
                }
            }
    }
}

public data class CertBasicConstraints2Info(
    public var fCA: Bool = 0,
    public var fPathLenConstraint: Bool = 0,
    public var dwPathLenConstraint: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertBasicConstraints2Info> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertBasicConstraints2Info> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CertBasicConstraints2Info =
                    CertBasicConstraints2Info(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertBasicConstraints2Info) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fCA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fPathLenConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwPathLenConstraint)
                }
            }
    }
}

public class CertBasicConstraintsInfo internal constructor(
    public var subjectType: CryptBitBlob,
    public var fPathLenConstraint: Bool,
    public var dwPathLenConstraint: UInt,
    public var cSubtreesConstraint: UInt,
    rgSubtreesConstraintCtorArg: MutPtr<CryptIntegerBlob>,
) {
    public var rgSubtreesConstraint: MutPtr<CryptIntegerBlob> = rgSubtreesConstraintCtorArg
        internal set

    public constructor() : this(
        subjectType = CryptBitBlob(),
        fPathLenConstraint = 0,
        dwPathLenConstraint = 0u,
        cSubtreesConstraint = 0u,
        rgSubtreesConstraintCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptBitBlob = this.subjectType

    public operator fun component2(): Bool = this.fPathLenConstraint

    public operator fun component3(): UInt = this.dwPathLenConstraint

    public operator fun component4(): UInt = this.cSubtreesConstraint

    public operator fun component5(): MutPtr<CryptIntegerBlob> = this.rgSubtreesConstraint

    public fun copy(subjectType: CryptBitBlob = this.subjectType, fPathLenConstraint: Bool = this.fPathLenConstraint, dwPathLenConstraint: UInt = this.dwPathLenConstraint, cSubtreesConstraint: UInt = this.cSubtreesConstraint, rgSubtreesConstraint: MutPtr<CryptIntegerBlob> = this.rgSubtreesConstraint): CertBasicConstraintsInfo = CertBasicConstraintsInfo(subjectType = subjectType, fPathLenConstraint = fPathLenConstraint, dwPathLenConstraint = dwPathLenConstraint, cSubtreesConstraint = cSubtreesConstraint, rgSubtreesConstraintCtorArg = rgSubtreesConstraint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertBasicConstraintsInfo) return false
        if (this.subjectType != other.subjectType) return false
        if (this.fPathLenConstraint != other.fPathLenConstraint) return false
        if (this.dwPathLenConstraint != other.dwPathLenConstraint) return false
        if (this.cSubtreesConstraint != other.cSubtreesConstraint) return false
        if (this.rgSubtreesConstraint != other.rgSubtreesConstraint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subjectType.hashCode()
        result = 31 * result + this.fPathLenConstraint.hashCode()
        result = 31 * result + this.dwPathLenConstraint.hashCode()
        result = 31 * result + this.cSubtreesConstraint.hashCode()
        result = 31 * result + this.rgSubtreesConstraint.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertBasicConstraintsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertBasicConstraintsInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CertBasicConstraintsInfo =
                    CertBasicConstraintsInfo(
                        (CryptBitBlob.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CryptIntegerBlob>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CertBasicConstraintsInfo) {
                    (CryptBitBlob.typeLayout()).writeNative(addr, value.subjectType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.fPathLenConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwPathLenConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cSubtreesConstraint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CryptIntegerBlob>(64)
                    ).writeNative(addr + 40L, value.rgSubtreesConstraint)
                }
            }

        public operator fun invoke(
            subjectType: CryptBitBlob = CryptBitBlob(),
            fPathLenConstraint: Bool = 0,
            dwPathLenConstraint: UInt = 0u,
            cSubtreesConstraint: UInt = 0u,
            rgSubtreesConstraint: MutPtr<CryptIntegerBlob> = MutPtr(0L),
        ): CertBasicConstraintsInfo =
            CertBasicConstraintsInfo(
                subjectType = subjectType,
                fPathLenConstraint = fPathLenConstraint,
                dwPathLenConstraint = dwPathLenConstraint,
                cSubtreesConstraint = cSubtreesConstraint,
                rgSubtreesConstraintCtorArg = rgSubtreesConstraint,
            )
    }
}

public data class CertBiometricData(
    public var dwTypeOfBiometricDataChoice: CertBiometricDataType = 0u,
    public var anonymous: CertBiometricData0 = CertBiometricData0(),
    public var hashedUrl: CertHashedUrl = CertHashedUrl(),
)

public class CertBiometricData0 internal constructor(
    public var dwPredefined: UInt,
    pszObjIdCtorArg: Pstr,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        dwPredefined = 0u,
        pszObjIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwPredefined

    public operator fun component2(): Pstr = this.pszObjId

    public fun copy(dwPredefined: UInt = this.dwPredefined, pszObjId: Pstr = this.pszObjId): CertBiometricData0 = CertBiometricData0(dwPredefined = dwPredefined, pszObjIdCtorArg = pszObjId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertBiometricData0) return false
        if (this.dwPredefined != other.dwPredefined) return false
        if (this.pszObjId != other.pszObjId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwPredefined.hashCode()
        result = 31 * result + this.pszObjId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwPredefined: UInt = 0u,
            pszObjId: Pstr = MutPtr(0L),
        ): CertBiometricData0 =
            CertBiometricData0(
                dwPredefined = dwPredefined,
                pszObjIdCtorArg = pszObjId,
            )
    }
}

public class CertBiometricExtInfo internal constructor(
    public var cBiometricData: UInt,
    rgBiometricDataCtorArg: MutPtr<CertBiometricData>,
) {
    public var rgBiometricData: MutPtr<CertBiometricData> = rgBiometricDataCtorArg
        internal set

    public constructor() : this(
        cBiometricData = 0u,
        rgBiometricDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cBiometricData

    public operator fun component2(): MutPtr<CertBiometricData> = this.rgBiometricData

    public fun copy(cBiometricData: UInt = this.cBiometricData, rgBiometricData: MutPtr<CertBiometricData> = this.rgBiometricData): CertBiometricExtInfo = CertBiometricExtInfo(cBiometricData = cBiometricData, rgBiometricDataCtorArg = rgBiometricData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertBiometricExtInfo) return false
        if (this.cBiometricData != other.cBiometricData) return false
        if (this.rgBiometricData != other.rgBiometricData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBiometricData.hashCode()
        result = 31 * result + this.rgBiometricData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertBiometricExtInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertBiometricExtInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertBiometricExtInfo =
                    CertBiometricExtInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertBiometricData>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertBiometricExtInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cBiometricData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertBiometricData>(64)
                    ).writeNative(addr + 8L, value.rgBiometricData)
                }
            }

        public operator fun invoke(
            cBiometricData: UInt = 0u,
            rgBiometricData: MutPtr<CertBiometricData> = MutPtr(0L),
        ): CertBiometricExtInfo =
            CertBiometricExtInfo(
                cBiometricData = cBiometricData,
                rgBiometricDataCtorArg = rgBiometricData,
            )
    }
}

public class CertChain internal constructor(
    public var cCerts: UInt,
    certsCtorArg: MutPtr<CryptIntegerBlob>,
    public var keyLocatorInfo: CryptKeyProvInfo,
) {
    public var certs: MutPtr<CryptIntegerBlob> = certsCtorArg
        internal set

    public constructor() : this(
        cCerts = 0u,
        certsCtorArg = MutPtr(0L),
        keyLocatorInfo = CryptKeyProvInfo(),
    )

    public operator fun component1(): UInt = this.cCerts

    public operator fun component2(): MutPtr<CryptIntegerBlob> = this.certs

    public operator fun component3(): CryptKeyProvInfo = this.keyLocatorInfo

    public fun copy(cCerts: UInt = this.cCerts, certs: MutPtr<CryptIntegerBlob> = this.certs, keyLocatorInfo: CryptKeyProvInfo = this.keyLocatorInfo): CertChain = CertChain(cCerts = cCerts, certsCtorArg = certs, keyLocatorInfo = keyLocatorInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertChain) return false
        if (this.cCerts != other.cCerts) return false
        if (this.certs != other.certs) return false
        if (this.keyLocatorInfo != other.keyLocatorInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCerts.hashCode()
        result = 31 * result + this.certs.hashCode()
        result = 31 * result + this.keyLocatorInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cCerts: UInt = 0u,
            certs: MutPtr<CryptIntegerBlob> = MutPtr(0L),
            keyLocatorInfo: CryptKeyProvInfo = CryptKeyProvInfo(),
        ): CertChain =
            CertChain(
                cCerts = cCerts,
                certsCtorArg = certs,
                keyLocatorInfo = keyLocatorInfo,
            )
    }
}

public class CertChainContext internal constructor(
    public var cbSize: UInt,
    public var trustStatus: CertTrustStatus,
    public var cChain: UInt,
    rgpChainCtorArg: MutPtr<MutPtr<CertSimpleChain>>,
    public var cLowerQualityChainContext: UInt,
    rgpLowerQualityChainContextCtorArg: MutPtr<MutPtr<CertChainContext>>,
    public var fHasRevocationFreshnessTime: Bool,
    public var dwRevocationFreshnessTime: UInt,
    public var dwCreateFlags: UInt,
    public var chainId: Guid,
) {
    public var rgpChain: MutPtr<MutPtr<CertSimpleChain>> = rgpChainCtorArg
        internal set

    public var rgpLowerQualityChainContext: MutPtr<MutPtr<CertChainContext>> = rgpLowerQualityChainContextCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        trustStatus = CertTrustStatus(),
        cChain = 0u,
        rgpChainCtorArg = MutPtr(0L),
        cLowerQualityChainContext = 0u,
        rgpLowerQualityChainContextCtorArg = MutPtr(0L),
        fHasRevocationFreshnessTime = 0,
        dwRevocationFreshnessTime = 0u,
        dwCreateFlags = 0u,
        chainId = Guid(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CertTrustStatus = this.trustStatus

    public operator fun component3(): UInt = this.cChain

    public operator fun component4(): MutPtr<MutPtr<CertSimpleChain>> = this.rgpChain

    public operator fun component5(): UInt = this.cLowerQualityChainContext

    public operator fun component6(): MutPtr<MutPtr<CertChainContext>> = this.rgpLowerQualityChainContext

    public operator fun component7(): Bool = this.fHasRevocationFreshnessTime

    public operator fun component8(): UInt = this.dwRevocationFreshnessTime

    public operator fun component9(): UInt = this.dwCreateFlags

    public operator fun component10(): Guid = this.chainId

    public fun copy(cbSize: UInt = this.cbSize, trustStatus: CertTrustStatus = this.trustStatus, cChain: UInt = this.cChain, rgpChain: MutPtr<MutPtr<CertSimpleChain>> = this.rgpChain, cLowerQualityChainContext: UInt = this.cLowerQualityChainContext, rgpLowerQualityChainContext: MutPtr<MutPtr<CertChainContext>> = this.rgpLowerQualityChainContext, fHasRevocationFreshnessTime: Bool = this.fHasRevocationFreshnessTime, dwRevocationFreshnessTime: UInt = this.dwRevocationFreshnessTime, dwCreateFlags: UInt = this.dwCreateFlags, chainId: Guid = this.chainId): CertChainContext = CertChainContext(cbSize = cbSize, trustStatus = trustStatus, cChain = cChain, rgpChainCtorArg = rgpChain, cLowerQualityChainContext = cLowerQualityChainContext, rgpLowerQualityChainContextCtorArg = rgpLowerQualityChainContext, fHasRevocationFreshnessTime = fHasRevocationFreshnessTime, dwRevocationFreshnessTime = dwRevocationFreshnessTime, dwCreateFlags = dwCreateFlags, chainId = chainId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertChainContext) return false
        if (this.cbSize != other.cbSize) return false
        if (this.trustStatus != other.trustStatus) return false
        if (this.cChain != other.cChain) return false
        if (this.rgpChain != other.rgpChain) return false
        if (this.cLowerQualityChainContext != other.cLowerQualityChainContext) return false
        if (this.rgpLowerQualityChainContext != other.rgpLowerQualityChainContext) return false
        if (this.fHasRevocationFreshnessTime != other.fHasRevocationFreshnessTime) return false
        if (this.dwRevocationFreshnessTime != other.dwRevocationFreshnessTime) return false
        if (this.dwCreateFlags != other.dwCreateFlags) return false
        if (this.chainId != other.chainId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.trustStatus.hashCode()
        result = 31 * result + this.cChain.hashCode()
        result = 31 * result + this.rgpChain.hashCode()
        result = 31 * result + this.cLowerQualityChainContext.hashCode()
        result = 31 * result + this.rgpLowerQualityChainContext.hashCode()
        result = 31 * result + this.fHasRevocationFreshnessTime.hashCode()
        result = 31 * result + this.dwRevocationFreshnessTime.hashCode()
        result = 31 * result + this.dwCreateFlags.hashCode()
        result = 31 * result + this.chainId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            trustStatus: CertTrustStatus = CertTrustStatus(),
            cChain: UInt = 0u,
            rgpChain: MutPtr<MutPtr<CertSimpleChain>> = MutPtr(0L),
            cLowerQualityChainContext: UInt = 0u,
            rgpLowerQualityChainContext: MutPtr<MutPtr<CertChainContext>> = MutPtr(0L),
            fHasRevocationFreshnessTime: Bool = 0,
            dwRevocationFreshnessTime: UInt = 0u,
            dwCreateFlags: UInt = 0u,
            chainId: Guid = Guid(),
        ): CertChainContext =
            CertChainContext(
                cbSize = cbSize,
                trustStatus = trustStatus,
                cChain = cChain,
                rgpChainCtorArg = rgpChain,
                cLowerQualityChainContext = cLowerQualityChainContext,
                rgpLowerQualityChainContextCtorArg = rgpLowerQualityChainContext,
                fHasRevocationFreshnessTime = fHasRevocationFreshnessTime,
                dwRevocationFreshnessTime = dwRevocationFreshnessTime,
                dwCreateFlags = dwCreateFlags,
                chainId = chainId,
            )
    }
}

public class CertChainElement internal constructor(
    public var cbSize: UInt,
    pCertContextCtorArg: ConstPtr<CertContext>,
    public var trustStatus: CertTrustStatus,
    pRevocationInfoCtorArg: MutPtr<CertRevocationInfo>,
    pIssuanceUsageCtorArg: MutPtr<CtlUsage>,
    pApplicationUsageCtorArg: MutPtr<CtlUsage>,
    pwszExtendedErrorInfoCtorArg: Pcwstr,
) {
    public var pCertContext: ConstPtr<CertContext> = pCertContextCtorArg
        internal set

    public var pRevocationInfo: MutPtr<CertRevocationInfo> = pRevocationInfoCtorArg
        internal set

    public var pIssuanceUsage: MutPtr<CtlUsage> = pIssuanceUsageCtorArg
        internal set

    public var pApplicationUsage: MutPtr<CtlUsage> = pApplicationUsageCtorArg
        internal set

    public var pwszExtendedErrorInfo: Pcwstr = pwszExtendedErrorInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pCertContextCtorArg = ConstPtr(0L),
        trustStatus = CertTrustStatus(),
        pRevocationInfoCtorArg = MutPtr(0L),
        pIssuanceUsageCtorArg = MutPtr(0L),
        pApplicationUsageCtorArg = MutPtr(0L),
        pwszExtendedErrorInfoCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): ConstPtr<CertContext> = this.pCertContext

    public operator fun component3(): CertTrustStatus = this.trustStatus

    public operator fun component4(): MutPtr<CertRevocationInfo> = this.pRevocationInfo

    public operator fun component5(): MutPtr<CtlUsage> = this.pIssuanceUsage

    public operator fun component6(): MutPtr<CtlUsage> = this.pApplicationUsage

    public operator fun component7(): Pcwstr = this.pwszExtendedErrorInfo

    public fun copy(cbSize: UInt = this.cbSize, pCertContext: ConstPtr<CertContext> = this.pCertContext, trustStatus: CertTrustStatus = this.trustStatus, pRevocationInfo: MutPtr<CertRevocationInfo> = this.pRevocationInfo, pIssuanceUsage: MutPtr<CtlUsage> = this.pIssuanceUsage, pApplicationUsage: MutPtr<CtlUsage> = this.pApplicationUsage, pwszExtendedErrorInfo: Pcwstr = this.pwszExtendedErrorInfo): CertChainElement = CertChainElement(cbSize = cbSize, pCertContextCtorArg = pCertContext, trustStatus = trustStatus, pRevocationInfoCtorArg = pRevocationInfo, pIssuanceUsageCtorArg = pIssuanceUsage, pApplicationUsageCtorArg = pApplicationUsage, pwszExtendedErrorInfoCtorArg = pwszExtendedErrorInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertChainElement) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pCertContext != other.pCertContext) return false
        if (this.trustStatus != other.trustStatus) return false
        if (this.pRevocationInfo != other.pRevocationInfo) return false
        if (this.pIssuanceUsage != other.pIssuanceUsage) return false
        if (this.pApplicationUsage != other.pApplicationUsage) return false
        if (this.pwszExtendedErrorInfo != other.pwszExtendedErrorInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pCertContext.hashCode()
        result = 31 * result + this.trustStatus.hashCode()
        result = 31 * result + this.pRevocationInfo.hashCode()
        result = 31 * result + this.pIssuanceUsage.hashCode()
        result = 31 * result + this.pApplicationUsage.hashCode()
        result = 31 * result + this.pwszExtendedErrorInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pCertContext: ConstPtr<CertContext> = ConstPtr(0L),
            trustStatus: CertTrustStatus = CertTrustStatus(),
            pRevocationInfo: MutPtr<CertRevocationInfo> = MutPtr(0L),
            pIssuanceUsage: MutPtr<CtlUsage> = MutPtr(0L),
            pApplicationUsage: MutPtr<CtlUsage> = MutPtr(0L),
            pwszExtendedErrorInfo: Pcwstr = ConstPtr(0L),
        ): CertChainElement =
            CertChainElement(
                cbSize = cbSize,
                pCertContextCtorArg = pCertContext,
                trustStatus = trustStatus,
                pRevocationInfoCtorArg = pRevocationInfo,
                pIssuanceUsageCtorArg = pIssuanceUsage,
                pApplicationUsageCtorArg = pApplicationUsage,
                pwszExtendedErrorInfoCtorArg = pwszExtendedErrorInfo,
            )
    }
}

public class CertChainEngineConfig internal constructor(
    public var cbSize: UInt,
    hRestrictedRootCtorArg: Hcertstore,
    hRestrictedTrustCtorArg: Hcertstore,
    hRestrictedOtherCtorArg: Hcertstore,
    public var cAdditionalStore: UInt,
    rghAdditionalStoreCtorArg: MutPtr<Hcertstore>,
    public var dwFlags: UInt,
    public var dwUrlRetrievalTimeout: UInt,
    public var maximumCachedCertificates: UInt,
    public var cycleDetectionModulus: UInt,
    hExclusiveRootCtorArg: Hcertstore,
    hExclusiveTrustedPeopleCtorArg: Hcertstore,
    public var dwExclusiveFlags: UInt,
) {
    public var hRestrictedRoot: Hcertstore = hRestrictedRootCtorArg
        internal set

    public var hRestrictedTrust: Hcertstore = hRestrictedTrustCtorArg
        internal set

    public var hRestrictedOther: Hcertstore = hRestrictedOtherCtorArg
        internal set

    public var rghAdditionalStore: MutPtr<Hcertstore> = rghAdditionalStoreCtorArg
        internal set

    public var hExclusiveRoot: Hcertstore = hExclusiveRootCtorArg
        internal set

    public var hExclusiveTrustedPeople: Hcertstore = hExclusiveTrustedPeopleCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hRestrictedRootCtorArg = MutPtr(0L),
        hRestrictedTrustCtorArg = MutPtr(0L),
        hRestrictedOtherCtorArg = MutPtr(0L),
        cAdditionalStore = 0u,
        rghAdditionalStoreCtorArg = MutPtr(0L),
        dwFlags = 0u,
        dwUrlRetrievalTimeout = 0u,
        maximumCachedCertificates = 0u,
        cycleDetectionModulus = 0u,
        hExclusiveRootCtorArg = MutPtr(0L),
        hExclusiveTrustedPeopleCtorArg = MutPtr(0L),
        dwExclusiveFlags = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hcertstore = this.hRestrictedRoot

    public operator fun component3(): Hcertstore = this.hRestrictedTrust

    public operator fun component4(): Hcertstore = this.hRestrictedOther

    public operator fun component5(): UInt = this.cAdditionalStore

    public operator fun component6(): MutPtr<Hcertstore> = this.rghAdditionalStore

    public operator fun component7(): UInt = this.dwFlags

    public operator fun component8(): UInt = this.dwUrlRetrievalTimeout

    public operator fun component9(): UInt = this.maximumCachedCertificates

    public operator fun component10(): UInt = this.cycleDetectionModulus

    public operator fun component11(): Hcertstore = this.hExclusiveRoot

    public operator fun component12(): Hcertstore = this.hExclusiveTrustedPeople

    public operator fun component13(): UInt = this.dwExclusiveFlags

    public fun copy(cbSize: UInt = this.cbSize, hRestrictedRoot: Hcertstore = this.hRestrictedRoot, hRestrictedTrust: Hcertstore = this.hRestrictedTrust, hRestrictedOther: Hcertstore = this.hRestrictedOther, cAdditionalStore: UInt = this.cAdditionalStore, rghAdditionalStore: MutPtr<Hcertstore> = this.rghAdditionalStore, dwFlags: UInt = this.dwFlags, dwUrlRetrievalTimeout: UInt = this.dwUrlRetrievalTimeout, maximumCachedCertificates: UInt = this.maximumCachedCertificates, cycleDetectionModulus: UInt = this.cycleDetectionModulus, hExclusiveRoot: Hcertstore = this.hExclusiveRoot, hExclusiveTrustedPeople: Hcertstore = this.hExclusiveTrustedPeople, dwExclusiveFlags: UInt = this.dwExclusiveFlags): CertChainEngineConfig = CertChainEngineConfig(cbSize = cbSize, hRestrictedRootCtorArg = hRestrictedRoot, hRestrictedTrustCtorArg = hRestrictedTrust, hRestrictedOtherCtorArg = hRestrictedOther, cAdditionalStore = cAdditionalStore, rghAdditionalStoreCtorArg = rghAdditionalStore, dwFlags = dwFlags, dwUrlRetrievalTimeout = dwUrlRetrievalTimeout, maximumCachedCertificates = maximumCachedCertificates, cycleDetectionModulus = cycleDetectionModulus, hExclusiveRootCtorArg = hExclusiveRoot, hExclusiveTrustedPeopleCtorArg = hExclusiveTrustedPeople, dwExclusiveFlags = dwExclusiveFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertChainEngineConfig) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hRestrictedRoot != other.hRestrictedRoot) return false
        if (this.hRestrictedTrust != other.hRestrictedTrust) return false
        if (this.hRestrictedOther != other.hRestrictedOther) return false
        if (this.cAdditionalStore != other.cAdditionalStore) return false
        if (this.rghAdditionalStore != other.rghAdditionalStore) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwUrlRetrievalTimeout != other.dwUrlRetrievalTimeout) return false
        if (this.maximumCachedCertificates != other.maximumCachedCertificates) return false
        if (this.cycleDetectionModulus != other.cycleDetectionModulus) return false
        if (this.hExclusiveRoot != other.hExclusiveRoot) return false
        if (this.hExclusiveTrustedPeople != other.hExclusiveTrustedPeople) return false
        if (this.dwExclusiveFlags != other.dwExclusiveFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hRestrictedRoot.hashCode()
        result = 31 * result + this.hRestrictedTrust.hashCode()
        result = 31 * result + this.hRestrictedOther.hashCode()
        result = 31 * result + this.cAdditionalStore.hashCode()
        result = 31 * result + this.rghAdditionalStore.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwUrlRetrievalTimeout.hashCode()
        result = 31 * result + this.maximumCachedCertificates.hashCode()
        result = 31 * result + this.cycleDetectionModulus.hashCode()
        result = 31 * result + this.hExclusiveRoot.hashCode()
        result = 31 * result + this.hExclusiveTrustedPeople.hashCode()
        result = 31 * result + this.dwExclusiveFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertChainEngineConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertChainEngineConfig> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): CertChainEngineConfig =
                    CertChainEngineConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Hcertstore>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: CertChainEngineConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.hRestrictedRoot)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.hRestrictedTrust)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.hRestrictedOther)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cAdditionalStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Hcertstore>(64)
                    ).writeNative(addr + 40L, value.rghAdditionalStore)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwUrlRetrievalTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.maximumCachedCertificates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.cycleDetectionModulus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 64L, value.hExclusiveRoot)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 72L, value.hExclusiveTrustedPeople)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwExclusiveFlags)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            hRestrictedRoot: Hcertstore = MutPtr(0L),
            hRestrictedTrust: Hcertstore = MutPtr(0L),
            hRestrictedOther: Hcertstore = MutPtr(0L),
            cAdditionalStore: UInt = 0u,
            rghAdditionalStore: MutPtr<Hcertstore> = MutPtr(0L),
            dwFlags: UInt = 0u,
            dwUrlRetrievalTimeout: UInt = 0u,
            maximumCachedCertificates: UInt = 0u,
            cycleDetectionModulus: UInt = 0u,
            hExclusiveRoot: Hcertstore = MutPtr(0L),
            hExclusiveTrustedPeople: Hcertstore = MutPtr(0L),
            dwExclusiveFlags: UInt = 0u,
        ): CertChainEngineConfig =
            CertChainEngineConfig(
                cbSize = cbSize,
                hRestrictedRootCtorArg = hRestrictedRoot,
                hRestrictedTrustCtorArg = hRestrictedTrust,
                hRestrictedOtherCtorArg = hRestrictedOther,
                cAdditionalStore = cAdditionalStore,
                rghAdditionalStoreCtorArg = rghAdditionalStore,
                dwFlags = dwFlags,
                dwUrlRetrievalTimeout = dwUrlRetrievalTimeout,
                maximumCachedCertificates = maximumCachedCertificates,
                cycleDetectionModulus = cycleDetectionModulus,
                hExclusiveRootCtorArg = hExclusiveRoot,
                hExclusiveTrustedPeopleCtorArg = hExclusiveTrustedPeople,
                dwExclusiveFlags = dwExclusiveFlags,
            )
    }
}

public class CertChainFindByIssuerPara internal constructor(
    public var cbSize: UInt,
    pszUsageIdentifierCtorArg: Pcstr,
    public var dwKeySpec: UInt,
    public var dwAcquirePrivateKeyFlags: UInt,
    public var cIssuer: UInt,
    rgIssuerCtorArg: MutPtr<CryptIntegerBlob>,
    public var pfnFindCallback: PfnCertChainFindByIssuerCallback,
    pvFindArgCtorArg: MutPtr<CVoid>,
) {
    public var pszUsageIdentifier: Pcstr = pszUsageIdentifierCtorArg
        internal set

    public var rgIssuer: MutPtr<CryptIntegerBlob> = rgIssuerCtorArg
        internal set

    public var pvFindArg: MutPtr<CVoid> = pvFindArgCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pszUsageIdentifierCtorArg = ConstPtr(0L),
        dwKeySpec = 0u,
        dwAcquirePrivateKeyFlags = 0u,
        cIssuer = 0u,
        rgIssuerCtorArg = MutPtr(0L),
        pfnFindCallback = null,
        pvFindArgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcstr = this.pszUsageIdentifier

    public operator fun component3(): UInt = this.dwKeySpec

    public operator fun component4(): UInt = this.dwAcquirePrivateKeyFlags

    public operator fun component5(): UInt = this.cIssuer

    public operator fun component6(): MutPtr<CryptIntegerBlob> = this.rgIssuer

    public operator fun component7(): PfnCertChainFindByIssuerCallback = this.pfnFindCallback

    public operator fun component8(): MutPtr<CVoid> = this.pvFindArg

    public fun copy(cbSize: UInt = this.cbSize, pszUsageIdentifier: Pcstr = this.pszUsageIdentifier, dwKeySpec: UInt = this.dwKeySpec, dwAcquirePrivateKeyFlags: UInt = this.dwAcquirePrivateKeyFlags, cIssuer: UInt = this.cIssuer, rgIssuer: MutPtr<CryptIntegerBlob> = this.rgIssuer, pfnFindCallback: PfnCertChainFindByIssuerCallback = this.pfnFindCallback, pvFindArg: MutPtr<CVoid> = this.pvFindArg): CertChainFindByIssuerPara = CertChainFindByIssuerPara(cbSize = cbSize, pszUsageIdentifierCtorArg = pszUsageIdentifier, dwKeySpec = dwKeySpec, dwAcquirePrivateKeyFlags = dwAcquirePrivateKeyFlags, cIssuer = cIssuer, rgIssuerCtorArg = rgIssuer, pfnFindCallback = pfnFindCallback, pvFindArgCtorArg = pvFindArg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertChainFindByIssuerPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pszUsageIdentifier != other.pszUsageIdentifier) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.dwAcquirePrivateKeyFlags != other.dwAcquirePrivateKeyFlags) return false
        if (this.cIssuer != other.cIssuer) return false
        if (this.rgIssuer != other.rgIssuer) return false
        if (this.pfnFindCallback != other.pfnFindCallback) return false
        if (this.pvFindArg != other.pvFindArg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pszUsageIdentifier.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.dwAcquirePrivateKeyFlags.hashCode()
        result = 31 * result + this.cIssuer.hashCode()
        result = 31 * result + this.rgIssuer.hashCode()
        result = 31 * result + this.pfnFindCallback.hashCode()
        result = 31 * result + this.pvFindArg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pszUsageIdentifier: Pcstr = ConstPtr(0L),
            dwKeySpec: UInt = 0u,
            dwAcquirePrivateKeyFlags: UInt = 0u,
            cIssuer: UInt = 0u,
            rgIssuer: MutPtr<CryptIntegerBlob> = MutPtr(0L),
            pfnFindCallback: PfnCertChainFindByIssuerCallback = null,
            pvFindArg: MutPtr<CVoid> = MutPtr(0L),
        ): CertChainFindByIssuerPara =
            CertChainFindByIssuerPara(
                cbSize = cbSize,
                pszUsageIdentifierCtorArg = pszUsageIdentifier,
                dwKeySpec = dwKeySpec,
                dwAcquirePrivateKeyFlags = dwAcquirePrivateKeyFlags,
                cIssuer = cIssuer,
                rgIssuerCtorArg = rgIssuer,
                pfnFindCallback = pfnFindCallback,
                pvFindArgCtorArg = pvFindArg,
            )
    }
}

public class CertChainPara internal constructor(
    public var cbSize: UInt,
    public var requestedUsage: CertUsageMatch,
    public var requestedIssuancePolicy: CertUsageMatch,
    public var dwUrlRetrievalTimeout: UInt,
    public var fCheckRevocationFreshnessTime: Bool,
    public var dwRevocationFreshnessTime: UInt,
    pftCacheResyncCtorArg: MutPtr<Filetime>,
    pStrongSignParaCtorArg: MutPtr<CertStrongSignPara>,
    public var dwStrongSignFlags: UInt,
) {
    public var pftCacheResync: MutPtr<Filetime> = pftCacheResyncCtorArg
        internal set

    public var pStrongSignPara: MutPtr<CertStrongSignPara> = pStrongSignParaCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        requestedUsage = CertUsageMatch(),
        requestedIssuancePolicy = CertUsageMatch(),
        dwUrlRetrievalTimeout = 0u,
        fCheckRevocationFreshnessTime = 0,
        dwRevocationFreshnessTime = 0u,
        pftCacheResyncCtorArg = MutPtr(0L),
        pStrongSignParaCtorArg = MutPtr(0L),
        dwStrongSignFlags = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CertUsageMatch = this.requestedUsage

    public operator fun component3(): CertUsageMatch = this.requestedIssuancePolicy

    public operator fun component4(): UInt = this.dwUrlRetrievalTimeout

    public operator fun component5(): Bool = this.fCheckRevocationFreshnessTime

    public operator fun component6(): UInt = this.dwRevocationFreshnessTime

    public operator fun component7(): MutPtr<Filetime> = this.pftCacheResync

    public operator fun component8(): MutPtr<CertStrongSignPara> = this.pStrongSignPara

    public operator fun component9(): UInt = this.dwStrongSignFlags

    public fun copy(cbSize: UInt = this.cbSize, requestedUsage: CertUsageMatch = this.requestedUsage, requestedIssuancePolicy: CertUsageMatch = this.requestedIssuancePolicy, dwUrlRetrievalTimeout: UInt = this.dwUrlRetrievalTimeout, fCheckRevocationFreshnessTime: Bool = this.fCheckRevocationFreshnessTime, dwRevocationFreshnessTime: UInt = this.dwRevocationFreshnessTime, pftCacheResync: MutPtr<Filetime> = this.pftCacheResync, pStrongSignPara: MutPtr<CertStrongSignPara> = this.pStrongSignPara, dwStrongSignFlags: UInt = this.dwStrongSignFlags): CertChainPara = CertChainPara(cbSize = cbSize, requestedUsage = requestedUsage, requestedIssuancePolicy = requestedIssuancePolicy, dwUrlRetrievalTimeout = dwUrlRetrievalTimeout, fCheckRevocationFreshnessTime = fCheckRevocationFreshnessTime, dwRevocationFreshnessTime = dwRevocationFreshnessTime, pftCacheResyncCtorArg = pftCacheResync, pStrongSignParaCtorArg = pStrongSignPara, dwStrongSignFlags = dwStrongSignFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertChainPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.requestedUsage != other.requestedUsage) return false
        if (this.requestedIssuancePolicy != other.requestedIssuancePolicy) return false
        if (this.dwUrlRetrievalTimeout != other.dwUrlRetrievalTimeout) return false
        if (this.fCheckRevocationFreshnessTime != other.fCheckRevocationFreshnessTime) return false
        if (this.dwRevocationFreshnessTime != other.dwRevocationFreshnessTime) return false
        if (this.pftCacheResync != other.pftCacheResync) return false
        if (this.pStrongSignPara != other.pStrongSignPara) return false
        if (this.dwStrongSignFlags != other.dwStrongSignFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.requestedUsage.hashCode()
        result = 31 * result + this.requestedIssuancePolicy.hashCode()
        result = 31 * result + this.dwUrlRetrievalTimeout.hashCode()
        result = 31 * result + this.fCheckRevocationFreshnessTime.hashCode()
        result = 31 * result + this.dwRevocationFreshnessTime.hashCode()
        result = 31 * result + this.pftCacheResync.hashCode()
        result = 31 * result + this.pStrongSignPara.hashCode()
        result = 31 * result + this.dwStrongSignFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertChainPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertChainPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): CertChainPara =
                    CertChainPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CertUsageMatch.typeLayout()).readNative(addr + 8L),
                        (CertUsageMatch.typeLayout()).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Filetime>(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertStrongSignPara>(64)
                        ).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: CertChainPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (CertUsageMatch.typeLayout()).writeNative(addr + 8L, value.requestedUsage)
                    (CertUsageMatch.typeLayout()).writeNative(addr + 32L, value.requestedIssuancePolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwUrlRetrievalTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.fCheckRevocationFreshnessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwRevocationFreshnessTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Filetime>(64)
                    ).writeNative(addr + 72L, value.pftCacheResync)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertStrongSignPara>(64)
                    ).writeNative(addr + 80L, value.pStrongSignPara)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwStrongSignFlags)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            requestedUsage: CertUsageMatch = CertUsageMatch(),
            requestedIssuancePolicy: CertUsageMatch = CertUsageMatch(),
            dwUrlRetrievalTimeout: UInt = 0u,
            fCheckRevocationFreshnessTime: Bool = 0,
            dwRevocationFreshnessTime: UInt = 0u,
            pftCacheResync: MutPtr<Filetime> = MutPtr(0L),
            pStrongSignPara: MutPtr<CertStrongSignPara> = MutPtr(0L),
            dwStrongSignFlags: UInt = 0u,
        ): CertChainPara =
            CertChainPara(
                cbSize = cbSize,
                requestedUsage = requestedUsage,
                requestedIssuancePolicy = requestedIssuancePolicy,
                dwUrlRetrievalTimeout = dwUrlRetrievalTimeout,
                fCheckRevocationFreshnessTime = fCheckRevocationFreshnessTime,
                dwRevocationFreshnessTime = dwRevocationFreshnessTime,
                pftCacheResyncCtorArg = pftCacheResync,
                pStrongSignParaCtorArg = pStrongSignPara,
                dwStrongSignFlags = dwStrongSignFlags,
            )
    }
}

public class CertChainPolicyPara internal constructor(
    public var cbSize: UInt,
    public var dwFlags: CertChainPolicyFlags,
    pvExtraPolicyParaCtorArg: MutPtr<CVoid>,
) {
    public var pvExtraPolicyPara: MutPtr<CVoid> = pvExtraPolicyParaCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        pvExtraPolicyParaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CertChainPolicyFlags = this.dwFlags

    public operator fun component3(): MutPtr<CVoid> = this.pvExtraPolicyPara

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: CertChainPolicyFlags = this.dwFlags, pvExtraPolicyPara: MutPtr<CVoid> = this.pvExtraPolicyPara): CertChainPolicyPara = CertChainPolicyPara(cbSize = cbSize, dwFlags = dwFlags, pvExtraPolicyParaCtorArg = pvExtraPolicyPara)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertChainPolicyPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pvExtraPolicyPara != other.pvExtraPolicyPara) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pvExtraPolicyPara.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertChainPolicyPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertChainPolicyPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertChainPolicyPara =
                    CertChainPolicyPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertChainPolicyPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pvExtraPolicyPara)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: CertChainPolicyFlags = 0u,
            pvExtraPolicyPara: MutPtr<CVoid> = MutPtr(0L),
        ): CertChainPolicyPara =
            CertChainPolicyPara(
                cbSize = cbSize,
                dwFlags = dwFlags,
                pvExtraPolicyParaCtorArg = pvExtraPolicyPara,
            )
    }
}

public class CertChainPolicyStatus internal constructor(
    public var cbSize: UInt,
    public var dwError: UInt,
    public var lChainIndex: Int,
    public var lElementIndex: Int,
    pvExtraPolicyStatusCtorArg: MutPtr<CVoid>,
) {
    public var pvExtraPolicyStatus: MutPtr<CVoid> = pvExtraPolicyStatusCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwError = 0u,
        lChainIndex = 0,
        lElementIndex = 0,
        pvExtraPolicyStatusCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwError

    public operator fun component3(): Int = this.lChainIndex

    public operator fun component4(): Int = this.lElementIndex

    public operator fun component5(): MutPtr<CVoid> = this.pvExtraPolicyStatus

    public fun copy(cbSize: UInt = this.cbSize, dwError: UInt = this.dwError, lChainIndex: Int = this.lChainIndex, lElementIndex: Int = this.lElementIndex, pvExtraPolicyStatus: MutPtr<CVoid> = this.pvExtraPolicyStatus): CertChainPolicyStatus = CertChainPolicyStatus(cbSize = cbSize, dwError = dwError, lChainIndex = lChainIndex, lElementIndex = lElementIndex, pvExtraPolicyStatusCtorArg = pvExtraPolicyStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertChainPolicyStatus) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwError != other.dwError) return false
        if (this.lChainIndex != other.lChainIndex) return false
        if (this.lElementIndex != other.lElementIndex) return false
        if (this.pvExtraPolicyStatus != other.pvExtraPolicyStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.lChainIndex.hashCode()
        result = 31 * result + this.lElementIndex.hashCode()
        result = 31 * result + this.pvExtraPolicyStatus.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertChainPolicyStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertChainPolicyStatus> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CertChainPolicyStatus =
                    CertChainPolicyStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CertChainPolicyStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lChainIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lElementIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.pvExtraPolicyStatus)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            dwError: UInt = 0u,
            lChainIndex: Int = 0,
            lElementIndex: Int = 0,
            pvExtraPolicyStatus: MutPtr<CVoid> = MutPtr(0L),
        ): CertChainPolicyStatus =
            CertChainPolicyStatus(
                cbSize = cbSize,
                dwError = dwError,
                lChainIndex = lChainIndex,
                lElementIndex = lElementIndex,
                pvExtraPolicyStatusCtorArg = pvExtraPolicyStatus,
            )
    }
}

public class CertContext internal constructor(
    public var dwCertEncodingType: CertQueryEncodingType,
    pbCertEncodedCtorArg: MutPtr<UByte>,
    public var cbCertEncoded: UInt,
    pCertInfoCtorArg: MutPtr<CertInfo>,
    hCertStoreCtorArg: Hcertstore,
) {
    public var pbCertEncoded: MutPtr<UByte> = pbCertEncodedCtorArg
        internal set

    public var pCertInfo: MutPtr<CertInfo> = pCertInfoCtorArg
        internal set

    public var hCertStore: Hcertstore = hCertStoreCtorArg
        internal set

    public constructor() : this(
        dwCertEncodingType = 0u,
        pbCertEncodedCtorArg = MutPtr(0L),
        cbCertEncoded = 0u,
        pCertInfoCtorArg = MutPtr(0L),
        hCertStoreCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CertQueryEncodingType = this.dwCertEncodingType

    public operator fun component2(): MutPtr<UByte> = this.pbCertEncoded

    public operator fun component3(): UInt = this.cbCertEncoded

    public operator fun component4(): MutPtr<CertInfo> = this.pCertInfo

    public operator fun component5(): Hcertstore = this.hCertStore

    public fun copy(dwCertEncodingType: CertQueryEncodingType = this.dwCertEncodingType, pbCertEncoded: MutPtr<UByte> = this.pbCertEncoded, cbCertEncoded: UInt = this.cbCertEncoded, pCertInfo: MutPtr<CertInfo> = this.pCertInfo, hCertStore: Hcertstore = this.hCertStore): CertContext = CertContext(dwCertEncodingType = dwCertEncodingType, pbCertEncodedCtorArg = pbCertEncoded, cbCertEncoded = cbCertEncoded, pCertInfoCtorArg = pCertInfo, hCertStoreCtorArg = hCertStore)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertContext) return false
        if (this.dwCertEncodingType != other.dwCertEncodingType) return false
        if (this.pbCertEncoded != other.pbCertEncoded) return false
        if (this.cbCertEncoded != other.cbCertEncoded) return false
        if (this.pCertInfo != other.pCertInfo) return false
        if (this.hCertStore != other.hCertStore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCertEncodingType.hashCode()
        result = 31 * result + this.pbCertEncoded.hashCode()
        result = 31 * result + this.cbCertEncoded.hashCode()
        result = 31 * result + this.pCertInfo.hashCode()
        result = 31 * result + this.hCertStore.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CertContext =
                    CertContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertInfo>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CertContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCertEncodingType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbCertEncoded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbCertEncoded)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertInfo>(64)
                    ).writeNative(addr + 24L, value.pCertInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.hCertStore)
                }
            }

        public operator fun invoke(
            dwCertEncodingType: CertQueryEncodingType = 0u,
            pbCertEncoded: MutPtr<UByte> = MutPtr(0L),
            cbCertEncoded: UInt = 0u,
            pCertInfo: MutPtr<CertInfo> = MutPtr(0L),
            hCertStore: Hcertstore = MutPtr(0L),
        ): CertContext =
            CertContext(
                dwCertEncodingType = dwCertEncodingType,
                pbCertEncodedCtorArg = pbCertEncoded,
                cbCertEncoded = cbCertEncoded,
                pCertInfoCtorArg = pCertInfo,
                hCertStoreCtorArg = hCertStore,
            )
    }
}

public class CertCreateContextPara internal constructor(
    public var cbSize: UInt,
    public var pfnFree: PfnCryptFree,
    pvFreeCtorArg: MutPtr<CVoid>,
    public var pfnSort: PfnCertCreateContextSortFunc,
    pvSortCtorArg: MutPtr<CVoid>,
) {
    public var pvFree: MutPtr<CVoid> = pvFreeCtorArg
        internal set

    public var pvSort: MutPtr<CVoid> = pvSortCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pfnFree = null,
        pvFreeCtorArg = MutPtr(0L),
        pfnSort = null,
        pvSortCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): PfnCryptFree = this.pfnFree

    public operator fun component3(): MutPtr<CVoid> = this.pvFree

    public operator fun component4(): PfnCertCreateContextSortFunc = this.pfnSort

    public operator fun component5(): MutPtr<CVoid> = this.pvSort

    public fun copy(cbSize: UInt = this.cbSize, pfnFree: PfnCryptFree = this.pfnFree, pvFree: MutPtr<CVoid> = this.pvFree, pfnSort: PfnCertCreateContextSortFunc = this.pfnSort, pvSort: MutPtr<CVoid> = this.pvSort): CertCreateContextPara = CertCreateContextPara(cbSize = cbSize, pfnFree = pfnFree, pvFreeCtorArg = pvFree, pfnSort = pfnSort, pvSortCtorArg = pvSort)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertCreateContextPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pfnFree != other.pfnFree) return false
        if (this.pvFree != other.pvFree) return false
        if (this.pfnSort != other.pfnSort) return false
        if (this.pvSort != other.pvSort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pfnFree.hashCode()
        result = 31 * result + this.pvFree.hashCode()
        result = 31 * result + this.pfnSort.hashCode()
        result = 31 * result + this.pvSort.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pfnFree: PfnCryptFree = null,
            pvFree: MutPtr<CVoid> = MutPtr(0L),
            pfnSort: PfnCertCreateContextSortFunc = null,
            pvSort: MutPtr<CVoid> = MutPtr(0L),
        ): CertCreateContextPara =
            CertCreateContextPara(
                cbSize = cbSize,
                pfnFree = pfnFree,
                pvFreeCtorArg = pvFree,
                pfnSort = pfnSort,
                pvSortCtorArg = pvSort,
            )
    }
}

public class CertCrlContextPair internal constructor(
    pCertContextCtorArg: ConstPtr<CertContext>,
    pCrlContextCtorArg: MutPtr<CrlContext>,
) {
    public var pCertContext: ConstPtr<CertContext> = pCertContextCtorArg
        internal set

    public var pCrlContext: MutPtr<CrlContext> = pCrlContextCtorArg
        internal set

    public constructor() : this(
        pCertContextCtorArg = ConstPtr(0L),
        pCrlContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<CertContext> = this.pCertContext

    public operator fun component2(): MutPtr<CrlContext> = this.pCrlContext

    public fun copy(pCertContext: ConstPtr<CertContext> = this.pCertContext, pCrlContext: MutPtr<CrlContext> = this.pCrlContext): CertCrlContextPair = CertCrlContextPair(pCertContextCtorArg = pCertContext, pCrlContextCtorArg = pCrlContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertCrlContextPair) return false
        if (this.pCertContext != other.pCertContext) return false
        if (this.pCrlContext != other.pCrlContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pCertContext.hashCode()
        result = 31 * result + this.pCrlContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertCrlContextPair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertCrlContextPair> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertCrlContextPair =
                    CertCrlContextPair(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CertContext>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CrlContext>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertCrlContextPair) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CertContext>(64)
                    ).writeNative(addr, value.pCertContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CrlContext>(64)
                    ).writeNative(addr + 8L, value.pCrlContext)
                }
            }

        public operator fun invoke(
            pCertContext: ConstPtr<CertContext> = ConstPtr(0L),
            pCrlContext: MutPtr<CrlContext> = MutPtr(0L),
        ): CertCrlContextPair =
            CertCrlContextPair(
                pCertContextCtorArg = pCertContext,
                pCrlContextCtorArg = pCrlContext,
            )
    }
}

public data class CertDhParameters(
    public var p: CryptIntegerBlob = CryptIntegerBlob(),
    public var g: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertDhParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertDhParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CertDhParameters =
                    CertDhParameters(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CertDhParameters) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.p)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 16L, value.g)
                }
            }
    }
}

public data class CertDssParameters(
    public var p: CryptIntegerBlob = CryptIntegerBlob(),
    public var q: CryptIntegerBlob = CryptIntegerBlob(),
    public var g: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertDssParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertDssParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CertDssParameters =
                    CertDssParameters(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 16L),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CertDssParameters) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.p)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 16L, value.q)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 32L, value.g)
                }
            }
    }
}

public data class CertEccSignature(
    public var r: CryptIntegerBlob = CryptIntegerBlob(),
    public var s: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertEccSignature> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertEccSignature> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CertEccSignature =
                    CertEccSignature(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CertEccSignature) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.r)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 16L, value.s)
                }
            }
    }
}

public class CertExtension internal constructor(
    pszObjIdCtorArg: Pstr,
    public var fCritical: Bool,
    public var value: CryptIntegerBlob,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        fCritical = 0,
        value = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): Bool = this.fCritical

    public operator fun component3(): CryptIntegerBlob = this.value

    public fun copy(pszObjId: Pstr = this.pszObjId, fCritical: Bool = this.fCritical, value: CryptIntegerBlob = this.value): CertExtension = CertExtension(pszObjIdCtorArg = pszObjId, fCritical = fCritical, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertExtension) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.fCritical != other.fCritical) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.fCritical.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            fCritical: Bool = 0,
            value: CryptIntegerBlob = CryptIntegerBlob(),
        ): CertExtension =
            CertExtension(
                pszObjIdCtorArg = pszObjId,
                fCritical = fCritical,
                value = value,
            )
    }
}

public class CertExtensions internal constructor(
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr<CertExtension>,
) {
    public var rgExtension: MutPtr<CertExtension> = rgExtensionCtorArg
        internal set

    public constructor() : this(
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cExtension

    public operator fun component2(): MutPtr<CertExtension> = this.rgExtension

    public fun copy(cExtension: UInt = this.cExtension, rgExtension: MutPtr<CertExtension> = this.rgExtension): CertExtensions = CertExtensions(cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertExtensions) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertExtensions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertExtensions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertExtensions =
                    CertExtensions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertExtension>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertExtensions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cExtension)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertExtension>(64)
                    ).writeNative(addr + 8L, value.rgExtension)
                }
            }

        public operator fun invoke(
            cExtension: UInt = 0u,
            rgExtension: MutPtr<CertExtension> = MutPtr(0L),
        ): CertExtensions =
            CertExtensions(
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public data class CertFortezzaDataProp(
    public var serialNumber: UByteArray = UByteArray(8),
    public var certIndex: Int = 0,
    public var certLabel: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertFortezzaDataProp) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        if (this.certIndex != other.certIndex) return false
        if (!this.certLabel.contentEquals(other.certLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serialNumber.contentHashCode()
        result = 31 * result + this.certIndex.hashCode()
        result = 31 * result + this.certLabel.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertFortezzaDataProp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertFortezzaDataProp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CertFortezzaDataProp =
                    CertFortezzaDataProp(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CertFortezzaDataProp) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr, value.serialNumber.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.certIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                    ).writeNative(addr + 12L, value.certLabel.toList())
                }
            }
    }
}

public data class CertGeneralSubtree(
    public var base: CertAltNameEntry = CertAltNameEntry(),
    public var dwMinimum: UInt = 0u,
    public var fMaximum: Bool = 0,
    public var dwMaximum: UInt = 0u,
)

public class CertHashedUrl internal constructor(
    public var hashAlgorithm: CryptAlgorithmIdentifier,
    public var hash: CryptIntegerBlob,
    pwszUrlCtorArg: Pwstr,
) {
    public var pwszUrl: Pwstr = pwszUrlCtorArg
        internal set

    public constructor() : this(
        hashAlgorithm = CryptAlgorithmIdentifier(),
        hash = CryptIntegerBlob(),
        pwszUrlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptAlgorithmIdentifier = this.hashAlgorithm

    public operator fun component2(): CryptIntegerBlob = this.hash

    public operator fun component3(): Pwstr = this.pwszUrl

    public fun copy(hashAlgorithm: CryptAlgorithmIdentifier = this.hashAlgorithm, hash: CryptIntegerBlob = this.hash, pwszUrl: Pwstr = this.pwszUrl): CertHashedUrl = CertHashedUrl(hashAlgorithm = hashAlgorithm, hash = hash, pwszUrlCtorArg = pwszUrl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertHashedUrl) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.hash != other.hash) return false
        if (this.pwszUrl != other.pwszUrl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hashAlgorithm.hashCode()
        result = 31 * result + this.hash.hashCode()
        result = 31 * result + this.pwszUrl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            hash: CryptIntegerBlob = CryptIntegerBlob(),
            pwszUrl: Pwstr = MutPtr(0L),
        ): CertHashedUrl =
            CertHashedUrl(
                hashAlgorithm = hashAlgorithm,
                hash = hash,
                pwszUrlCtorArg = pwszUrl,
            )
    }
}

public data class CertId(
    public var dwIdChoice: CertIdOption = 0u,
    public var anonymous: CertId0 = CertId0(),
)

public data class CertId0(
    public var issuerSerialNumber: CertIssuerSerialNumber = CertIssuerSerialNumber(),
    public var keyId: CryptIntegerBlob = CryptIntegerBlob(),
    public var hashId: CryptIntegerBlob = CryptIntegerBlob(),
)

public class CertInfo internal constructor(
    public var dwVersion: UInt,
    public var serialNumber: CryptIntegerBlob,
    public var signatureAlgorithm: CryptAlgorithmIdentifier,
    public var issuer: CryptIntegerBlob,
    public var notBefore: Filetime,
    public var notAfter: Filetime,
    public var subject: CryptIntegerBlob,
    public var subjectPublicKeyInfo: CertPublicKeyInfo,
    public var issuerUniqueId: CryptBitBlob,
    public var subjectUniqueId: CryptBitBlob,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr<CertExtension>,
) {
    public var rgExtension: MutPtr<CertExtension> = rgExtensionCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        serialNumber = CryptIntegerBlob(),
        signatureAlgorithm = CryptAlgorithmIdentifier(),
        issuer = CryptIntegerBlob(),
        notBefore = Filetime(),
        notAfter = Filetime(),
        subject = CryptIntegerBlob(),
        subjectPublicKeyInfo = CertPublicKeyInfo(),
        issuerUniqueId = CryptBitBlob(),
        subjectUniqueId = CryptBitBlob(),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): CryptIntegerBlob = this.serialNumber

    public operator fun component3(): CryptAlgorithmIdentifier = this.signatureAlgorithm

    public operator fun component4(): CryptIntegerBlob = this.issuer

    public operator fun component5(): Filetime = this.notBefore

    public operator fun component6(): Filetime = this.notAfter

    public operator fun component7(): CryptIntegerBlob = this.subject

    public operator fun component8(): CertPublicKeyInfo = this.subjectPublicKeyInfo

    public operator fun component9(): CryptBitBlob = this.issuerUniqueId

    public operator fun component10(): CryptBitBlob = this.subjectUniqueId

    public operator fun component11(): UInt = this.cExtension

    public operator fun component12(): MutPtr<CertExtension> = this.rgExtension

    public fun copy(dwVersion: UInt = this.dwVersion, serialNumber: CryptIntegerBlob = this.serialNumber, signatureAlgorithm: CryptAlgorithmIdentifier = this.signatureAlgorithm, issuer: CryptIntegerBlob = this.issuer, notBefore: Filetime = this.notBefore, notAfter: Filetime = this.notAfter, subject: CryptIntegerBlob = this.subject, subjectPublicKeyInfo: CertPublicKeyInfo = this.subjectPublicKeyInfo, issuerUniqueId: CryptBitBlob = this.issuerUniqueId, subjectUniqueId: CryptBitBlob = this.subjectUniqueId, cExtension: UInt = this.cExtension, rgExtension: MutPtr<CertExtension> = this.rgExtension): CertInfo = CertInfo(dwVersion = dwVersion, serialNumber = serialNumber, signatureAlgorithm = signatureAlgorithm, issuer = issuer, notBefore = notBefore, notAfter = notAfter, subject = subject, subjectPublicKeyInfo = subjectPublicKeyInfo, issuerUniqueId = issuerUniqueId, subjectUniqueId = subjectUniqueId, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.serialNumber != other.serialNumber) return false
        if (this.signatureAlgorithm != other.signatureAlgorithm) return false
        if (this.issuer != other.issuer) return false
        if (this.notBefore != other.notBefore) return false
        if (this.notAfter != other.notAfter) return false
        if (this.subject != other.subject) return false
        if (this.subjectPublicKeyInfo != other.subjectPublicKeyInfo) return false
        if (this.issuerUniqueId != other.issuerUniqueId) return false
        if (this.subjectUniqueId != other.subjectUniqueId) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.serialNumber.hashCode()
        result = 31 * result + this.signatureAlgorithm.hashCode()
        result = 31 * result + this.issuer.hashCode()
        result = 31 * result + this.notBefore.hashCode()
        result = 31 * result + this.notAfter.hashCode()
        result = 31 * result + this.subject.hashCode()
        result = 31 * result + this.subjectPublicKeyInfo.hashCode()
        result = 31 * result + this.issuerUniqueId.hashCode()
        result = 31 * result + this.subjectUniqueId.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
            signatureAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            issuer: CryptIntegerBlob = CryptIntegerBlob(),
            notBefore: Filetime = Filetime(),
            notAfter: Filetime = Filetime(),
            subject: CryptIntegerBlob = CryptIntegerBlob(),
            subjectPublicKeyInfo: CertPublicKeyInfo = CertPublicKeyInfo(),
            issuerUniqueId: CryptBitBlob = CryptBitBlob(),
            subjectUniqueId: CryptBitBlob = CryptBitBlob(),
            cExtension: UInt = 0u,
            rgExtension: MutPtr<CertExtension> = MutPtr(0L),
        ): CertInfo =
            CertInfo(
                dwVersion = dwVersion,
                serialNumber = serialNumber,
                signatureAlgorithm = signatureAlgorithm,
                issuer = issuer,
                notBefore = notBefore,
                notAfter = notAfter,
                subject = subject,
                subjectPublicKeyInfo = subjectPublicKeyInfo,
                issuerUniqueId = issuerUniqueId,
                subjectUniqueId = subjectUniqueId,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public data class CertIssuerSerialNumber(
    public var issuer: CryptIntegerBlob = CryptIntegerBlob(),
    public var serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertIssuerSerialNumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertIssuerSerialNumber> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CertIssuerSerialNumber =
                    CertIssuerSerialNumber(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CertIssuerSerialNumber) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.issuer)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 16L, value.serialNumber)
                }
            }
    }
}

public class CertKeygenRequestInfo internal constructor(
    public var dwVersion: UInt,
    public var subjectPublicKeyInfo: CertPublicKeyInfo,
    pwszChallengeStringCtorArg: Pwstr,
) {
    public var pwszChallengeString: Pwstr = pwszChallengeStringCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        subjectPublicKeyInfo = CertPublicKeyInfo(),
        pwszChallengeStringCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): CertPublicKeyInfo = this.subjectPublicKeyInfo

    public operator fun component3(): Pwstr = this.pwszChallengeString

    public fun copy(dwVersion: UInt = this.dwVersion, subjectPublicKeyInfo: CertPublicKeyInfo = this.subjectPublicKeyInfo, pwszChallengeString: Pwstr = this.pwszChallengeString): CertKeygenRequestInfo = CertKeygenRequestInfo(dwVersion = dwVersion, subjectPublicKeyInfo = subjectPublicKeyInfo, pwszChallengeStringCtorArg = pwszChallengeString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertKeygenRequestInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.subjectPublicKeyInfo != other.subjectPublicKeyInfo) return false
        if (this.pwszChallengeString != other.pwszChallengeString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.subjectPublicKeyInfo.hashCode()
        result = 31 * result + this.pwszChallengeString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            subjectPublicKeyInfo: CertPublicKeyInfo = CertPublicKeyInfo(),
            pwszChallengeString: Pwstr = MutPtr(0L),
        ): CertKeygenRequestInfo =
            CertKeygenRequestInfo(
                dwVersion = dwVersion,
                subjectPublicKeyInfo = subjectPublicKeyInfo,
                pwszChallengeStringCtorArg = pwszChallengeString,
            )
    }
}

public class CertKeyAttributesInfo internal constructor(
    public var keyId: CryptIntegerBlob,
    public var intendedKeyUsage: CryptBitBlob,
    pPrivateKeyUsagePeriodCtorArg: MutPtr<CertPrivateKeyValidity>,
) {
    public var pPrivateKeyUsagePeriod: MutPtr<CertPrivateKeyValidity> = pPrivateKeyUsagePeriodCtorArg
        internal set

    public constructor() : this(
        keyId = CryptIntegerBlob(),
        intendedKeyUsage = CryptBitBlob(),
        pPrivateKeyUsagePeriodCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptIntegerBlob = this.keyId

    public operator fun component2(): CryptBitBlob = this.intendedKeyUsage

    public operator fun component3(): MutPtr<CertPrivateKeyValidity> = this.pPrivateKeyUsagePeriod

    public fun copy(keyId: CryptIntegerBlob = this.keyId, intendedKeyUsage: CryptBitBlob = this.intendedKeyUsage, pPrivateKeyUsagePeriod: MutPtr<CertPrivateKeyValidity> = this.pPrivateKeyUsagePeriod): CertKeyAttributesInfo = CertKeyAttributesInfo(keyId = keyId, intendedKeyUsage = intendedKeyUsage, pPrivateKeyUsagePeriodCtorArg = pPrivateKeyUsagePeriod)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertKeyAttributesInfo) return false
        if (this.keyId != other.keyId) return false
        if (this.intendedKeyUsage != other.intendedKeyUsage) return false
        if (this.pPrivateKeyUsagePeriod != other.pPrivateKeyUsagePeriod) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyId.hashCode()
        result = 31 * result + this.intendedKeyUsage.hashCode()
        result = 31 * result + this.pPrivateKeyUsagePeriod.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertKeyAttributesInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertKeyAttributesInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CertKeyAttributesInfo =
                    CertKeyAttributesInfo(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (CryptBitBlob.typeLayout()).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertPrivateKeyValidity>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CertKeyAttributesInfo) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.keyId)
                    (CryptBitBlob.typeLayout()).writeNative(addr + 16L, value.intendedKeyUsage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertPrivateKeyValidity>(64)
                    ).writeNative(addr + 40L, value.pPrivateKeyUsagePeriod)
                }
            }

        public operator fun invoke(
            keyId: CryptIntegerBlob = CryptIntegerBlob(),
            intendedKeyUsage: CryptBitBlob = CryptBitBlob(),
            pPrivateKeyUsagePeriod: MutPtr<CertPrivateKeyValidity> = MutPtr(0L),
        ): CertKeyAttributesInfo =
            CertKeyAttributesInfo(
                keyId = keyId,
                intendedKeyUsage = intendedKeyUsage,
                pPrivateKeyUsagePeriodCtorArg = pPrivateKeyUsagePeriod,
            )
    }
}

public data class CertKeyContext(
    public var cbSize: UInt = 0u,
    public var anonymous: CertKeyContext0 = CertKeyContext0(),
    public var dwKeySpec: UInt = 0u,
)

public data class CertKeyContext0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public class CertKeyUsageRestrictionInfo internal constructor(
    public var cCertPolicyId: UInt,
    rgCertPolicyIdCtorArg: MutPtr<CertPolicyId>,
    public var restrictedKeyUsage: CryptBitBlob,
) {
    public var rgCertPolicyId: MutPtr<CertPolicyId> = rgCertPolicyIdCtorArg
        internal set

    public constructor() : this(
        cCertPolicyId = 0u,
        rgCertPolicyIdCtorArg = MutPtr(0L),
        restrictedKeyUsage = CryptBitBlob(),
    )

    public operator fun component1(): UInt = this.cCertPolicyId

    public operator fun component2(): MutPtr<CertPolicyId> = this.rgCertPolicyId

    public operator fun component3(): CryptBitBlob = this.restrictedKeyUsage

    public fun copy(cCertPolicyId: UInt = this.cCertPolicyId, rgCertPolicyId: MutPtr<CertPolicyId> = this.rgCertPolicyId, restrictedKeyUsage: CryptBitBlob = this.restrictedKeyUsage): CertKeyUsageRestrictionInfo = CertKeyUsageRestrictionInfo(cCertPolicyId = cCertPolicyId, rgCertPolicyIdCtorArg = rgCertPolicyId, restrictedKeyUsage = restrictedKeyUsage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertKeyUsageRestrictionInfo) return false
        if (this.cCertPolicyId != other.cCertPolicyId) return false
        if (this.rgCertPolicyId != other.rgCertPolicyId) return false
        if (this.restrictedKeyUsage != other.restrictedKeyUsage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCertPolicyId.hashCode()
        result = 31 * result + this.rgCertPolicyId.hashCode()
        result = 31 * result + this.restrictedKeyUsage.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertKeyUsageRestrictionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertKeyUsageRestrictionInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CertKeyUsageRestrictionInfo =
                    CertKeyUsageRestrictionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertPolicyId>(64)
                        ).readNative(addr + 8L),
                        (CryptBitBlob.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CertKeyUsageRestrictionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCertPolicyId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertPolicyId>(64)
                    ).writeNative(addr + 8L, value.rgCertPolicyId)
                    (CryptBitBlob.typeLayout()).writeNative(addr + 16L, value.restrictedKeyUsage)
                }
            }

        public operator fun invoke(
            cCertPolicyId: UInt = 0u,
            rgCertPolicyId: MutPtr<CertPolicyId> = MutPtr(0L),
            restrictedKeyUsage: CryptBitBlob = CryptBitBlob(),
        ): CertKeyUsageRestrictionInfo =
            CertKeyUsageRestrictionInfo(
                cCertPolicyId = cCertPolicyId,
                rgCertPolicyIdCtorArg = rgCertPolicyId,
                restrictedKeyUsage = restrictedKeyUsage,
            )
    }
}

public class CertLdapStoreOpenedPara internal constructor(
    pvLdapSessionHandleCtorArg: MutPtr<CVoid>,
    pwszLdapUrlCtorArg: Pcwstr,
) {
    public var pvLdapSessionHandle: MutPtr<CVoid> = pvLdapSessionHandleCtorArg
        internal set

    public var pwszLdapUrl: Pcwstr = pwszLdapUrlCtorArg
        internal set

    public constructor() : this(
        pvLdapSessionHandleCtorArg = MutPtr(0L),
        pwszLdapUrlCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.pvLdapSessionHandle

    public operator fun component2(): Pcwstr = this.pwszLdapUrl

    public fun copy(pvLdapSessionHandle: MutPtr<CVoid> = this.pvLdapSessionHandle, pwszLdapUrl: Pcwstr = this.pwszLdapUrl): CertLdapStoreOpenedPara = CertLdapStoreOpenedPara(pvLdapSessionHandleCtorArg = pvLdapSessionHandle, pwszLdapUrlCtorArg = pwszLdapUrl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertLdapStoreOpenedPara) return false
        if (this.pvLdapSessionHandle != other.pvLdapSessionHandle) return false
        if (this.pwszLdapUrl != other.pwszLdapUrl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvLdapSessionHandle.hashCode()
        result = 31 * result + this.pwszLdapUrl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pvLdapSessionHandle: MutPtr<CVoid> = MutPtr(0L),
            pwszLdapUrl: Pcwstr = ConstPtr(0L),
        ): CertLdapStoreOpenedPara =
            CertLdapStoreOpenedPara(
                pvLdapSessionHandleCtorArg = pvLdapSessionHandle,
                pwszLdapUrlCtorArg = pwszLdapUrl,
            )
    }
}

public class CertLogotypeAudio internal constructor(
    public var logotypeDetails: CertLogotypeDetails,
    pLogotypeAudioInfoCtorArg: MutPtr<CertLogotypeAudioInfo>,
) {
    public var pLogotypeAudioInfo: MutPtr<CertLogotypeAudioInfo> = pLogotypeAudioInfoCtorArg
        internal set

    public constructor() : this(
        logotypeDetails = CertLogotypeDetails(),
        pLogotypeAudioInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CertLogotypeDetails = this.logotypeDetails

    public operator fun component2(): MutPtr<CertLogotypeAudioInfo> = this.pLogotypeAudioInfo

    public fun copy(logotypeDetails: CertLogotypeDetails = this.logotypeDetails, pLogotypeAudioInfo: MutPtr<CertLogotypeAudioInfo> = this.pLogotypeAudioInfo): CertLogotypeAudio = CertLogotypeAudio(logotypeDetails = logotypeDetails, pLogotypeAudioInfoCtorArg = pLogotypeAudioInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertLogotypeAudio) return false
        if (this.logotypeDetails != other.logotypeDetails) return false
        if (this.pLogotypeAudioInfo != other.pLogotypeAudioInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logotypeDetails.hashCode()
        result = 31 * result + this.pLogotypeAudioInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            logotypeDetails: CertLogotypeDetails = CertLogotypeDetails(),
            pLogotypeAudioInfo: MutPtr<CertLogotypeAudioInfo> = MutPtr(0L),
        ): CertLogotypeAudio =
            CertLogotypeAudio(
                logotypeDetails = logotypeDetails,
                pLogotypeAudioInfoCtorArg = pLogotypeAudioInfo,
            )
    }
}

public class CertLogotypeAudioInfo internal constructor(
    public var dwFileSize: UInt,
    public var dwPlayTime: UInt,
    public var dwChannels: UInt,
    public var dwSampleRate: UInt,
    pwszLanguageCtorArg: Pwstr,
) {
    public var pwszLanguage: Pwstr = pwszLanguageCtorArg
        internal set

    public constructor() : this(
        dwFileSize = 0u,
        dwPlayTime = 0u,
        dwChannels = 0u,
        dwSampleRate = 0u,
        pwszLanguageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFileSize

    public operator fun component2(): UInt = this.dwPlayTime

    public operator fun component3(): UInt = this.dwChannels

    public operator fun component4(): UInt = this.dwSampleRate

    public operator fun component5(): Pwstr = this.pwszLanguage

    public fun copy(dwFileSize: UInt = this.dwFileSize, dwPlayTime: UInt = this.dwPlayTime, dwChannels: UInt = this.dwChannels, dwSampleRate: UInt = this.dwSampleRate, pwszLanguage: Pwstr = this.pwszLanguage): CertLogotypeAudioInfo = CertLogotypeAudioInfo(dwFileSize = dwFileSize, dwPlayTime = dwPlayTime, dwChannels = dwChannels, dwSampleRate = dwSampleRate, pwszLanguageCtorArg = pwszLanguage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertLogotypeAudioInfo) return false
        if (this.dwFileSize != other.dwFileSize) return false
        if (this.dwPlayTime != other.dwPlayTime) return false
        if (this.dwChannels != other.dwChannels) return false
        if (this.dwSampleRate != other.dwSampleRate) return false
        if (this.pwszLanguage != other.pwszLanguage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFileSize.hashCode()
        result = 31 * result + this.dwPlayTime.hashCode()
        result = 31 * result + this.dwChannels.hashCode()
        result = 31 * result + this.dwSampleRate.hashCode()
        result = 31 * result + this.pwszLanguage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFileSize: UInt = 0u,
            dwPlayTime: UInt = 0u,
            dwChannels: UInt = 0u,
            dwSampleRate: UInt = 0u,
            pwszLanguage: Pwstr = MutPtr(0L),
        ): CertLogotypeAudioInfo =
            CertLogotypeAudioInfo(
                dwFileSize = dwFileSize,
                dwPlayTime = dwPlayTime,
                dwChannels = dwChannels,
                dwSampleRate = dwSampleRate,
                pwszLanguageCtorArg = pwszLanguage,
            )
    }
}

public class CertLogotypeData internal constructor(
    public var cLogotypeImage: UInt,
    rgLogotypeImageCtorArg: MutPtr<CertLogotypeImage>,
    public var cLogotypeAudio: UInt,
    rgLogotypeAudioCtorArg: MutPtr<CertLogotypeAudio>,
) {
    public var rgLogotypeImage: MutPtr<CertLogotypeImage> = rgLogotypeImageCtorArg
        internal set

    public var rgLogotypeAudio: MutPtr<CertLogotypeAudio> = rgLogotypeAudioCtorArg
        internal set

    public constructor() : this(
        cLogotypeImage = 0u,
        rgLogotypeImageCtorArg = MutPtr(0L),
        cLogotypeAudio = 0u,
        rgLogotypeAudioCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cLogotypeImage

    public operator fun component2(): MutPtr<CertLogotypeImage> = this.rgLogotypeImage

    public operator fun component3(): UInt = this.cLogotypeAudio

    public operator fun component4(): MutPtr<CertLogotypeAudio> = this.rgLogotypeAudio

    public fun copy(cLogotypeImage: UInt = this.cLogotypeImage, rgLogotypeImage: MutPtr<CertLogotypeImage> = this.rgLogotypeImage, cLogotypeAudio: UInt = this.cLogotypeAudio, rgLogotypeAudio: MutPtr<CertLogotypeAudio> = this.rgLogotypeAudio): CertLogotypeData = CertLogotypeData(cLogotypeImage = cLogotypeImage, rgLogotypeImageCtorArg = rgLogotypeImage, cLogotypeAudio = cLogotypeAudio, rgLogotypeAudioCtorArg = rgLogotypeAudio)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertLogotypeData) return false
        if (this.cLogotypeImage != other.cLogotypeImage) return false
        if (this.rgLogotypeImage != other.rgLogotypeImage) return false
        if (this.cLogotypeAudio != other.cLogotypeAudio) return false
        if (this.rgLogotypeAudio != other.rgLogotypeAudio) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cLogotypeImage.hashCode()
        result = 31 * result + this.rgLogotypeImage.hashCode()
        result = 31 * result + this.cLogotypeAudio.hashCode()
        result = 31 * result + this.rgLogotypeAudio.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertLogotypeData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertLogotypeData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CertLogotypeData =
                    CertLogotypeData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertLogotypeImage>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertLogotypeAudio>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CertLogotypeData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cLogotypeImage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertLogotypeImage>(64)
                    ).writeNative(addr + 8L, value.rgLogotypeImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cLogotypeAudio)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertLogotypeAudio>(64)
                    ).writeNative(addr + 24L, value.rgLogotypeAudio)
                }
            }

        public operator fun invoke(
            cLogotypeImage: UInt = 0u,
            rgLogotypeImage: MutPtr<CertLogotypeImage> = MutPtr(0L),
            cLogotypeAudio: UInt = 0u,
            rgLogotypeAudio: MutPtr<CertLogotypeAudio> = MutPtr(0L),
        ): CertLogotypeData =
            CertLogotypeData(
                cLogotypeImage = cLogotypeImage,
                rgLogotypeImageCtorArg = rgLogotypeImage,
                cLogotypeAudio = cLogotypeAudio,
                rgLogotypeAudioCtorArg = rgLogotypeAudio,
            )
    }
}

public class CertLogotypeDetails internal constructor(
    pwszMimeTypeCtorArg: Pwstr,
    public var cHashedUrl: UInt,
    rgHashedUrlCtorArg: MutPtr<CertHashedUrl>,
) {
    public var pwszMimeType: Pwstr = pwszMimeTypeCtorArg
        internal set

    public var rgHashedUrl: MutPtr<CertHashedUrl> = rgHashedUrlCtorArg
        internal set

    public constructor() : this(
        pwszMimeTypeCtorArg = MutPtr(0L),
        cHashedUrl = 0u,
        rgHashedUrlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszMimeType

    public operator fun component2(): UInt = this.cHashedUrl

    public operator fun component3(): MutPtr<CertHashedUrl> = this.rgHashedUrl

    public fun copy(pwszMimeType: Pwstr = this.pwszMimeType, cHashedUrl: UInt = this.cHashedUrl, rgHashedUrl: MutPtr<CertHashedUrl> = this.rgHashedUrl): CertLogotypeDetails = CertLogotypeDetails(pwszMimeTypeCtorArg = pwszMimeType, cHashedUrl = cHashedUrl, rgHashedUrlCtorArg = rgHashedUrl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertLogotypeDetails) return false
        if (this.pwszMimeType != other.pwszMimeType) return false
        if (this.cHashedUrl != other.cHashedUrl) return false
        if (this.rgHashedUrl != other.rgHashedUrl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszMimeType.hashCode()
        result = 31 * result + this.cHashedUrl.hashCode()
        result = 31 * result + this.rgHashedUrl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszMimeType: Pwstr = MutPtr(0L),
            cHashedUrl: UInt = 0u,
            rgHashedUrl: MutPtr<CertHashedUrl> = MutPtr(0L),
        ): CertLogotypeDetails =
            CertLogotypeDetails(
                pwszMimeTypeCtorArg = pwszMimeType,
                cHashedUrl = cHashedUrl,
                rgHashedUrlCtorArg = rgHashedUrl,
            )
    }
}

public class CertLogotypeExtInfo internal constructor(
    public var cCommunityLogo: UInt,
    rgCommunityLogoCtorArg: MutPtr<CertLogotypeInfo>,
    pIssuerLogoCtorArg: MutPtr<CertLogotypeInfo>,
    pSubjectLogoCtorArg: MutPtr<CertLogotypeInfo>,
    public var cOtherLogo: UInt,
    rgOtherLogoCtorArg: MutPtr<CertOtherLogotypeInfo>,
) {
    public var rgCommunityLogo: MutPtr<CertLogotypeInfo> = rgCommunityLogoCtorArg
        internal set

    public var pIssuerLogo: MutPtr<CertLogotypeInfo> = pIssuerLogoCtorArg
        internal set

    public var pSubjectLogo: MutPtr<CertLogotypeInfo> = pSubjectLogoCtorArg
        internal set

    public var rgOtherLogo: MutPtr<CertOtherLogotypeInfo> = rgOtherLogoCtorArg
        internal set

    public constructor() : this(
        cCommunityLogo = 0u,
        rgCommunityLogoCtorArg = MutPtr(0L),
        pIssuerLogoCtorArg = MutPtr(0L),
        pSubjectLogoCtorArg = MutPtr(0L),
        cOtherLogo = 0u,
        rgOtherLogoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCommunityLogo

    public operator fun component2(): MutPtr<CertLogotypeInfo> = this.rgCommunityLogo

    public operator fun component3(): MutPtr<CertLogotypeInfo> = this.pIssuerLogo

    public operator fun component4(): MutPtr<CertLogotypeInfo> = this.pSubjectLogo

    public operator fun component5(): UInt = this.cOtherLogo

    public operator fun component6(): MutPtr<CertOtherLogotypeInfo> = this.rgOtherLogo

    public fun copy(cCommunityLogo: UInt = this.cCommunityLogo, rgCommunityLogo: MutPtr<CertLogotypeInfo> = this.rgCommunityLogo, pIssuerLogo: MutPtr<CertLogotypeInfo> = this.pIssuerLogo, pSubjectLogo: MutPtr<CertLogotypeInfo> = this.pSubjectLogo, cOtherLogo: UInt = this.cOtherLogo, rgOtherLogo: MutPtr<CertOtherLogotypeInfo> = this.rgOtherLogo): CertLogotypeExtInfo = CertLogotypeExtInfo(cCommunityLogo = cCommunityLogo, rgCommunityLogoCtorArg = rgCommunityLogo, pIssuerLogoCtorArg = pIssuerLogo, pSubjectLogoCtorArg = pSubjectLogo, cOtherLogo = cOtherLogo, rgOtherLogoCtorArg = rgOtherLogo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertLogotypeExtInfo) return false
        if (this.cCommunityLogo != other.cCommunityLogo) return false
        if (this.rgCommunityLogo != other.rgCommunityLogo) return false
        if (this.pIssuerLogo != other.pIssuerLogo) return false
        if (this.pSubjectLogo != other.pSubjectLogo) return false
        if (this.cOtherLogo != other.cOtherLogo) return false
        if (this.rgOtherLogo != other.rgOtherLogo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCommunityLogo.hashCode()
        result = 31 * result + this.rgCommunityLogo.hashCode()
        result = 31 * result + this.pIssuerLogo.hashCode()
        result = 31 * result + this.pSubjectLogo.hashCode()
        result = 31 * result + this.cOtherLogo.hashCode()
        result = 31 * result + this.rgOtherLogo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertLogotypeExtInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertLogotypeExtInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CertLogotypeExtInfo =
                    CertLogotypeExtInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertLogotypeInfo>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertLogotypeInfo>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertLogotypeInfo>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertOtherLogotypeInfo>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CertLogotypeExtInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCommunityLogo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertLogotypeInfo>(64)
                    ).writeNative(addr + 8L, value.rgCommunityLogo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertLogotypeInfo>(64)
                    ).writeNative(addr + 16L, value.pIssuerLogo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertLogotypeInfo>(64)
                    ).writeNative(addr + 24L, value.pSubjectLogo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cOtherLogo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertOtherLogotypeInfo>(64)
                    ).writeNative(addr + 40L, value.rgOtherLogo)
                }
            }

        public operator fun invoke(
            cCommunityLogo: UInt = 0u,
            rgCommunityLogo: MutPtr<CertLogotypeInfo> = MutPtr(0L),
            pIssuerLogo: MutPtr<CertLogotypeInfo> = MutPtr(0L),
            pSubjectLogo: MutPtr<CertLogotypeInfo> = MutPtr(0L),
            cOtherLogo: UInt = 0u,
            rgOtherLogo: MutPtr<CertOtherLogotypeInfo> = MutPtr(0L),
        ): CertLogotypeExtInfo =
            CertLogotypeExtInfo(
                cCommunityLogo = cCommunityLogo,
                rgCommunityLogoCtorArg = rgCommunityLogo,
                pIssuerLogoCtorArg = pIssuerLogo,
                pSubjectLogoCtorArg = pSubjectLogo,
                cOtherLogo = cOtherLogo,
                rgOtherLogoCtorArg = rgOtherLogo,
            )
    }
}

public class CertLogotypeImage internal constructor(
    public var logotypeDetails: CertLogotypeDetails,
    pLogotypeImageInfoCtorArg: MutPtr<CertLogotypeImageInfo>,
) {
    public var pLogotypeImageInfo: MutPtr<CertLogotypeImageInfo> = pLogotypeImageInfoCtorArg
        internal set

    public constructor() : this(
        logotypeDetails = CertLogotypeDetails(),
        pLogotypeImageInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CertLogotypeDetails = this.logotypeDetails

    public operator fun component2(): MutPtr<CertLogotypeImageInfo> = this.pLogotypeImageInfo

    public fun copy(logotypeDetails: CertLogotypeDetails = this.logotypeDetails, pLogotypeImageInfo: MutPtr<CertLogotypeImageInfo> = this.pLogotypeImageInfo): CertLogotypeImage = CertLogotypeImage(logotypeDetails = logotypeDetails, pLogotypeImageInfoCtorArg = pLogotypeImageInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertLogotypeImage) return false
        if (this.logotypeDetails != other.logotypeDetails) return false
        if (this.pLogotypeImageInfo != other.pLogotypeImageInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logotypeDetails.hashCode()
        result = 31 * result + this.pLogotypeImageInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            logotypeDetails: CertLogotypeDetails = CertLogotypeDetails(),
            pLogotypeImageInfo: MutPtr<CertLogotypeImageInfo> = MutPtr(0L),
        ): CertLogotypeImage =
            CertLogotypeImage(
                logotypeDetails = logotypeDetails,
                pLogotypeImageInfoCtorArg = pLogotypeImageInfo,
            )
    }
}

public class CertLogotypeImageInfo internal constructor(
    public var dwLogotypeImageInfoChoice: CertLogotypeImageInfoType,
    public var dwFileSize: UInt,
    public var dwXSize: UInt,
    public var dwYSize: UInt,
    public var dwLogotypeImageResolutionChoice: CertLogotypeChoice,
    public var anonymous: CertLogotypeImageInfo0,
    pwszLanguageCtorArg: Pwstr,
) {
    public var pwszLanguage: Pwstr = pwszLanguageCtorArg
        internal set

    public constructor() : this(
        dwLogotypeImageInfoChoice = 0u,
        dwFileSize = 0u,
        dwXSize = 0u,
        dwYSize = 0u,
        dwLogotypeImageResolutionChoice = 0u,
        anonymous = CertLogotypeImageInfo0(),
        pwszLanguageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CertLogotypeImageInfoType = this.dwLogotypeImageInfoChoice

    public operator fun component2(): UInt = this.dwFileSize

    public operator fun component3(): UInt = this.dwXSize

    public operator fun component4(): UInt = this.dwYSize

    public operator fun component5(): CertLogotypeChoice = this.dwLogotypeImageResolutionChoice

    public operator fun component6(): CertLogotypeImageInfo0 = this.anonymous

    public operator fun component7(): Pwstr = this.pwszLanguage

    public fun copy(dwLogotypeImageInfoChoice: CertLogotypeImageInfoType = this.dwLogotypeImageInfoChoice, dwFileSize: UInt = this.dwFileSize, dwXSize: UInt = this.dwXSize, dwYSize: UInt = this.dwYSize, dwLogotypeImageResolutionChoice: CertLogotypeChoice = this.dwLogotypeImageResolutionChoice, anonymous: CertLogotypeImageInfo0 = this.anonymous, pwszLanguage: Pwstr = this.pwszLanguage): CertLogotypeImageInfo = CertLogotypeImageInfo(dwLogotypeImageInfoChoice = dwLogotypeImageInfoChoice, dwFileSize = dwFileSize, dwXSize = dwXSize, dwYSize = dwYSize, dwLogotypeImageResolutionChoice = dwLogotypeImageResolutionChoice, anonymous = anonymous, pwszLanguageCtorArg = pwszLanguage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertLogotypeImageInfo) return false
        if (this.dwLogotypeImageInfoChoice != other.dwLogotypeImageInfoChoice) return false
        if (this.dwFileSize != other.dwFileSize) return false
        if (this.dwXSize != other.dwXSize) return false
        if (this.dwYSize != other.dwYSize) return false
        if (this.dwLogotypeImageResolutionChoice != other.dwLogotypeImageResolutionChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pwszLanguage != other.pwszLanguage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLogotypeImageInfoChoice.hashCode()
        result = 31 * result + this.dwFileSize.hashCode()
        result = 31 * result + this.dwXSize.hashCode()
        result = 31 * result + this.dwYSize.hashCode()
        result = 31 * result + this.dwLogotypeImageResolutionChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.pwszLanguage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwLogotypeImageInfoChoice: CertLogotypeImageInfoType = 0u,
            dwFileSize: UInt = 0u,
            dwXSize: UInt = 0u,
            dwYSize: UInt = 0u,
            dwLogotypeImageResolutionChoice: CertLogotypeChoice = 0u,
            anonymous: CertLogotypeImageInfo0 = CertLogotypeImageInfo0(),
            pwszLanguage: Pwstr = MutPtr(0L),
        ): CertLogotypeImageInfo =
            CertLogotypeImageInfo(
                dwLogotypeImageInfoChoice = dwLogotypeImageInfoChoice,
                dwFileSize = dwFileSize,
                dwXSize = dwXSize,
                dwYSize = dwYSize,
                dwLogotypeImageResolutionChoice = dwLogotypeImageResolutionChoice,
                anonymous = anonymous,
                pwszLanguageCtorArg = pwszLanguage,
            )
    }
}

public data class CertLogotypeImageInfo0(
    public var dwNumBits: UInt = 0u,
    public var dwTableSize: UInt = 0u,
)

public data class CertLogotypeInfo(
    public var dwLogotypeInfoChoice: CertLogotypeOption = 0u,
    public var anonymous: CertLogotypeInfo0 = CertLogotypeInfo0(),
)

public class CertLogotypeInfo0 internal constructor(
    pLogotypeDirectInfoCtorArg: MutPtr<CertLogotypeData>,
    pLogotypeIndirectInfoCtorArg: MutPtr<CertLogotypeReference>,
) {
    public var pLogotypeDirectInfo: MutPtr<CertLogotypeData> = pLogotypeDirectInfoCtorArg
        internal set

    public var pLogotypeIndirectInfo: MutPtr<CertLogotypeReference> = pLogotypeIndirectInfoCtorArg
        internal set

    public constructor() : this(
        pLogotypeDirectInfoCtorArg = MutPtr(0L),
        pLogotypeIndirectInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CertLogotypeData> = this.pLogotypeDirectInfo

    public operator fun component2(): MutPtr<CertLogotypeReference> = this.pLogotypeIndirectInfo

    public fun copy(pLogotypeDirectInfo: MutPtr<CertLogotypeData> = this.pLogotypeDirectInfo, pLogotypeIndirectInfo: MutPtr<CertLogotypeReference> = this.pLogotypeIndirectInfo): CertLogotypeInfo0 = CertLogotypeInfo0(pLogotypeDirectInfoCtorArg = pLogotypeDirectInfo, pLogotypeIndirectInfoCtorArg = pLogotypeIndirectInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertLogotypeInfo0) return false
        if (this.pLogotypeDirectInfo != other.pLogotypeDirectInfo) return false
        if (this.pLogotypeIndirectInfo != other.pLogotypeIndirectInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pLogotypeDirectInfo.hashCode()
        result = 31 * result + this.pLogotypeIndirectInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pLogotypeDirectInfo: MutPtr<CertLogotypeData> = MutPtr(0L),
            pLogotypeIndirectInfo: MutPtr<CertLogotypeReference> = MutPtr(0L),
        ): CertLogotypeInfo0 =
            CertLogotypeInfo0(
                pLogotypeDirectInfoCtorArg = pLogotypeDirectInfo,
                pLogotypeIndirectInfoCtorArg = pLogotypeIndirectInfo,
            )
    }
}

public class CertLogotypeReference internal constructor(
    public var cHashedUrl: UInt,
    rgHashedUrlCtorArg: MutPtr<CertHashedUrl>,
) {
    public var rgHashedUrl: MutPtr<CertHashedUrl> = rgHashedUrlCtorArg
        internal set

    public constructor() : this(
        cHashedUrl = 0u,
        rgHashedUrlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cHashedUrl

    public operator fun component2(): MutPtr<CertHashedUrl> = this.rgHashedUrl

    public fun copy(cHashedUrl: UInt = this.cHashedUrl, rgHashedUrl: MutPtr<CertHashedUrl> = this.rgHashedUrl): CertLogotypeReference = CertLogotypeReference(cHashedUrl = cHashedUrl, rgHashedUrlCtorArg = rgHashedUrl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertLogotypeReference) return false
        if (this.cHashedUrl != other.cHashedUrl) return false
        if (this.rgHashedUrl != other.rgHashedUrl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cHashedUrl.hashCode()
        result = 31 * result + this.rgHashedUrl.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertLogotypeReference> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertLogotypeReference> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertLogotypeReference =
                    CertLogotypeReference(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertHashedUrl>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertLogotypeReference) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cHashedUrl)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertHashedUrl>(64)
                    ).writeNative(addr + 8L, value.rgHashedUrl)
                }
            }

        public operator fun invoke(
            cHashedUrl: UInt = 0u,
            rgHashedUrl: MutPtr<CertHashedUrl> = MutPtr(0L),
        ): CertLogotypeReference =
            CertLogotypeReference(
                cHashedUrl = cHashedUrl,
                rgHashedUrlCtorArg = rgHashedUrl,
            )
    }
}

public class CertNameConstraintsInfo internal constructor(
    public var cPermittedSubtree: UInt,
    rgPermittedSubtreeCtorArg: MutPtr<CertGeneralSubtree>,
    public var cExcludedSubtree: UInt,
    rgExcludedSubtreeCtorArg: MutPtr<CertGeneralSubtree>,
) {
    public var rgPermittedSubtree: MutPtr<CertGeneralSubtree> = rgPermittedSubtreeCtorArg
        internal set

    public var rgExcludedSubtree: MutPtr<CertGeneralSubtree> = rgExcludedSubtreeCtorArg
        internal set

    public constructor() : this(
        cPermittedSubtree = 0u,
        rgPermittedSubtreeCtorArg = MutPtr(0L),
        cExcludedSubtree = 0u,
        rgExcludedSubtreeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cPermittedSubtree

    public operator fun component2(): MutPtr<CertGeneralSubtree> = this.rgPermittedSubtree

    public operator fun component3(): UInt = this.cExcludedSubtree

    public operator fun component4(): MutPtr<CertGeneralSubtree> = this.rgExcludedSubtree

    public fun copy(cPermittedSubtree: UInt = this.cPermittedSubtree, rgPermittedSubtree: MutPtr<CertGeneralSubtree> = this.rgPermittedSubtree, cExcludedSubtree: UInt = this.cExcludedSubtree, rgExcludedSubtree: MutPtr<CertGeneralSubtree> = this.rgExcludedSubtree): CertNameConstraintsInfo = CertNameConstraintsInfo(cPermittedSubtree = cPermittedSubtree, rgPermittedSubtreeCtorArg = rgPermittedSubtree, cExcludedSubtree = cExcludedSubtree, rgExcludedSubtreeCtorArg = rgExcludedSubtree)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertNameConstraintsInfo) return false
        if (this.cPermittedSubtree != other.cPermittedSubtree) return false
        if (this.rgPermittedSubtree != other.rgPermittedSubtree) return false
        if (this.cExcludedSubtree != other.cExcludedSubtree) return false
        if (this.rgExcludedSubtree != other.rgExcludedSubtree) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cPermittedSubtree.hashCode()
        result = 31 * result + this.rgPermittedSubtree.hashCode()
        result = 31 * result + this.cExcludedSubtree.hashCode()
        result = 31 * result + this.rgExcludedSubtree.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertNameConstraintsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertNameConstraintsInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CertNameConstraintsInfo =
                    CertNameConstraintsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertGeneralSubtree>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertGeneralSubtree>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CertNameConstraintsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cPermittedSubtree)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertGeneralSubtree>(64)
                    ).writeNative(addr + 8L, value.rgPermittedSubtree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cExcludedSubtree)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertGeneralSubtree>(64)
                    ).writeNative(addr + 24L, value.rgExcludedSubtree)
                }
            }

        public operator fun invoke(
            cPermittedSubtree: UInt = 0u,
            rgPermittedSubtree: MutPtr<CertGeneralSubtree> = MutPtr(0L),
            cExcludedSubtree: UInt = 0u,
            rgExcludedSubtree: MutPtr<CertGeneralSubtree> = MutPtr(0L),
        ): CertNameConstraintsInfo =
            CertNameConstraintsInfo(
                cPermittedSubtree = cPermittedSubtree,
                rgPermittedSubtreeCtorArg = rgPermittedSubtree,
                cExcludedSubtree = cExcludedSubtree,
                rgExcludedSubtreeCtorArg = rgExcludedSubtree,
            )
    }
}

public class CertNameInfo internal constructor(
    public var cRDN: UInt,
    rgRDNCtorArg: MutPtr<CertRdn>,
) {
    public var rgRDN: MutPtr<CertRdn> = rgRDNCtorArg
        internal set

    public constructor() : this(
        cRDN = 0u,
        rgRDNCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cRDN

    public operator fun component2(): MutPtr<CertRdn> = this.rgRDN

    public fun copy(cRDN: UInt = this.cRDN, rgRDN: MutPtr<CertRdn> = this.rgRDN): CertNameInfo = CertNameInfo(cRDN = cRDN, rgRDNCtorArg = rgRDN)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertNameInfo) return false
        if (this.cRDN != other.cRDN) return false
        if (this.rgRDN != other.rgRDN) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cRDN.hashCode()
        result = 31 * result + this.rgRDN.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertNameInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertNameInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertNameInfo =
                    CertNameInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertRdn>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertNameInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cRDN)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertRdn>(64)
                    ).writeNative(addr + 8L, value.rgRDN)
                }
            }

        public operator fun invoke(
            cRDN: UInt = 0u,
            rgRDN: MutPtr<CertRdn> = MutPtr(0L),
        ): CertNameInfo =
            CertNameInfo(
                cRDN = cRDN,
                rgRDNCtorArg = rgRDN,
            )
    }
}

public data class CertNameValue(
    public var dwValueType: UInt = 0u,
    public var value: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertNameValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertNameValue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CertNameValue =
                    CertNameValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertNameValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwValueType)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public class CertOrCrlBlob internal constructor(
    public var dwChoice: UInt,
    public var cbEncoded: UInt,
    pbEncodedCtorArg: MutPtr<UByte>,
) {
    public var pbEncoded: MutPtr<UByte> = pbEncodedCtorArg
        internal set

    public constructor() : this(
        dwChoice = 0u,
        cbEncoded = 0u,
        pbEncodedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwChoice

    public operator fun component2(): UInt = this.cbEncoded

    public operator fun component3(): MutPtr<UByte> = this.pbEncoded

    public fun copy(dwChoice: UInt = this.dwChoice, cbEncoded: UInt = this.cbEncoded, pbEncoded: MutPtr<UByte> = this.pbEncoded): CertOrCrlBlob = CertOrCrlBlob(dwChoice = dwChoice, cbEncoded = cbEncoded, pbEncodedCtorArg = pbEncoded)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertOrCrlBlob) return false
        if (this.dwChoice != other.dwChoice) return false
        if (this.cbEncoded != other.cbEncoded) return false
        if (this.pbEncoded != other.pbEncoded) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwChoice.hashCode()
        result = 31 * result + this.cbEncoded.hashCode()
        result = 31 * result + this.pbEncoded.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertOrCrlBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertOrCrlBlob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertOrCrlBlob =
                    CertOrCrlBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertOrCrlBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwChoice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbEncoded)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbEncoded)
                }
            }

        public operator fun invoke(
            dwChoice: UInt = 0u,
            cbEncoded: UInt = 0u,
            pbEncoded: MutPtr<UByte> = MutPtr(0L),
        ): CertOrCrlBlob =
            CertOrCrlBlob(
                dwChoice = dwChoice,
                cbEncoded = cbEncoded,
                pbEncodedCtorArg = pbEncoded,
            )
    }
}

public class CertOrCrlBundle internal constructor(
    public var cItem: UInt,
    rgItemCtorArg: MutPtr<CertOrCrlBlob>,
) {
    public var rgItem: MutPtr<CertOrCrlBlob> = rgItemCtorArg
        internal set

    public constructor() : this(
        cItem = 0u,
        rgItemCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cItem

    public operator fun component2(): MutPtr<CertOrCrlBlob> = this.rgItem

    public fun copy(cItem: UInt = this.cItem, rgItem: MutPtr<CertOrCrlBlob> = this.rgItem): CertOrCrlBundle = CertOrCrlBundle(cItem = cItem, rgItemCtorArg = rgItem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertOrCrlBundle) return false
        if (this.cItem != other.cItem) return false
        if (this.rgItem != other.rgItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cItem.hashCode()
        result = 31 * result + this.rgItem.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertOrCrlBundle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertOrCrlBundle> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertOrCrlBundle =
                    CertOrCrlBundle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertOrCrlBlob>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertOrCrlBundle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cItem)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertOrCrlBlob>(64)
                    ).writeNative(addr + 8L, value.rgItem)
                }
            }

        public operator fun invoke(
            cItem: UInt = 0u,
            rgItem: MutPtr<CertOrCrlBlob> = MutPtr(0L),
        ): CertOrCrlBundle =
            CertOrCrlBundle(
                cItem = cItem,
                rgItemCtorArg = rgItem,
            )
    }
}

public class CertOtherLogotypeInfo internal constructor(
    pszObjIdCtorArg: Pstr,
    public var logotypeInfo: CertLogotypeInfo,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        logotypeInfo = CertLogotypeInfo(),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): CertLogotypeInfo = this.logotypeInfo

    public fun copy(pszObjId: Pstr = this.pszObjId, logotypeInfo: CertLogotypeInfo = this.logotypeInfo): CertOtherLogotypeInfo = CertOtherLogotypeInfo(pszObjIdCtorArg = pszObjId, logotypeInfo = logotypeInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertOtherLogotypeInfo) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.logotypeInfo != other.logotypeInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.logotypeInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            logotypeInfo: CertLogotypeInfo = CertLogotypeInfo(),
        ): CertOtherLogotypeInfo =
            CertOtherLogotypeInfo(
                pszObjIdCtorArg = pszObjId,
                logotypeInfo = logotypeInfo,
            )
    }
}

public class CertOtherName internal constructor(
    pszObjIdCtorArg: Pstr,
    public var value: CryptIntegerBlob,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        value = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): CryptIntegerBlob = this.value

    public fun copy(pszObjId: Pstr = this.pszObjId, value: CryptIntegerBlob = this.value): CertOtherName = CertOtherName(pszObjIdCtorArg = pszObjId, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertOtherName) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            value: CryptIntegerBlob = CryptIntegerBlob(),
        ): CertOtherName =
            CertOtherName(
                pszObjIdCtorArg = pszObjId,
                value = value,
            )
    }
}

public data class CertPair(
    public var forward: CryptIntegerBlob = CryptIntegerBlob(),
    public var reverse: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertPair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertPair> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CertPair =
                    CertPair(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CertPair) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.forward)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 16L, value.reverse)
                }
            }
    }
}

public class CertPhysicalStoreInfo internal constructor(
    public var cbSize: UInt,
    pszOpenStoreProviderCtorArg: Pstr,
    public var dwOpenEncodingType: UInt,
    public var dwOpenFlags: UInt,
    public var openParameters: CryptIntegerBlob,
    public var dwFlags: UInt,
    public var dwPriority: UInt,
) {
    public var pszOpenStoreProvider: Pstr = pszOpenStoreProviderCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pszOpenStoreProviderCtorArg = MutPtr(0L),
        dwOpenEncodingType = 0u,
        dwOpenFlags = 0u,
        openParameters = CryptIntegerBlob(),
        dwFlags = 0u,
        dwPriority = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pstr = this.pszOpenStoreProvider

    public operator fun component3(): UInt = this.dwOpenEncodingType

    public operator fun component4(): UInt = this.dwOpenFlags

    public operator fun component5(): CryptIntegerBlob = this.openParameters

    public operator fun component6(): UInt = this.dwFlags

    public operator fun component7(): UInt = this.dwPriority

    public fun copy(cbSize: UInt = this.cbSize, pszOpenStoreProvider: Pstr = this.pszOpenStoreProvider, dwOpenEncodingType: UInt = this.dwOpenEncodingType, dwOpenFlags: UInt = this.dwOpenFlags, openParameters: CryptIntegerBlob = this.openParameters, dwFlags: UInt = this.dwFlags, dwPriority: UInt = this.dwPriority): CertPhysicalStoreInfo = CertPhysicalStoreInfo(cbSize = cbSize, pszOpenStoreProviderCtorArg = pszOpenStoreProvider, dwOpenEncodingType = dwOpenEncodingType, dwOpenFlags = dwOpenFlags, openParameters = openParameters, dwFlags = dwFlags, dwPriority = dwPriority)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertPhysicalStoreInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pszOpenStoreProvider != other.pszOpenStoreProvider) return false
        if (this.dwOpenEncodingType != other.dwOpenEncodingType) return false
        if (this.dwOpenFlags != other.dwOpenFlags) return false
        if (this.openParameters != other.openParameters) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwPriority != other.dwPriority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pszOpenStoreProvider.hashCode()
        result = 31 * result + this.dwOpenEncodingType.hashCode()
        result = 31 * result + this.dwOpenFlags.hashCode()
        result = 31 * result + this.openParameters.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwPriority.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pszOpenStoreProvider: Pstr = MutPtr(0L),
            dwOpenEncodingType: UInt = 0u,
            dwOpenFlags: UInt = 0u,
            openParameters: CryptIntegerBlob = CryptIntegerBlob(),
            dwFlags: UInt = 0u,
            dwPriority: UInt = 0u,
        ): CertPhysicalStoreInfo =
            CertPhysicalStoreInfo(
                cbSize = cbSize,
                pszOpenStoreProviderCtorArg = pszOpenStoreProvider,
                dwOpenEncodingType = dwOpenEncodingType,
                dwOpenFlags = dwOpenFlags,
                openParameters = openParameters,
                dwFlags = dwFlags,
                dwPriority = dwPriority,
            )
    }
}

public class CertPoliciesInfo internal constructor(
    public var cPolicyInfo: UInt,
    rgPolicyInfoCtorArg: MutPtr<CertPolicyInfo>,
) {
    public var rgPolicyInfo: MutPtr<CertPolicyInfo> = rgPolicyInfoCtorArg
        internal set

    public constructor() : this(
        cPolicyInfo = 0u,
        rgPolicyInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cPolicyInfo

    public operator fun component2(): MutPtr<CertPolicyInfo> = this.rgPolicyInfo

    public fun copy(cPolicyInfo: UInt = this.cPolicyInfo, rgPolicyInfo: MutPtr<CertPolicyInfo> = this.rgPolicyInfo): CertPoliciesInfo = CertPoliciesInfo(cPolicyInfo = cPolicyInfo, rgPolicyInfoCtorArg = rgPolicyInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertPoliciesInfo) return false
        if (this.cPolicyInfo != other.cPolicyInfo) return false
        if (this.rgPolicyInfo != other.rgPolicyInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cPolicyInfo.hashCode()
        result = 31 * result + this.rgPolicyInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertPoliciesInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertPoliciesInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertPoliciesInfo =
                    CertPoliciesInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertPolicyInfo>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertPoliciesInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cPolicyInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertPolicyInfo>(64)
                    ).writeNative(addr + 8L, value.rgPolicyInfo)
                }
            }

        public operator fun invoke(
            cPolicyInfo: UInt = 0u,
            rgPolicyInfo: MutPtr<CertPolicyInfo> = MutPtr(0L),
        ): CertPoliciesInfo =
            CertPoliciesInfo(
                cPolicyInfo = cPolicyInfo,
                rgPolicyInfoCtorArg = rgPolicyInfo,
            )
    }
}

public class CertPolicy95Qualifier1 internal constructor(
    pszPracticesReferenceCtorArg: Pwstr,
    pszNoticeIdentifierCtorArg: Pstr,
    pszNSINoticeIdentifierCtorArg: Pstr,
    public var cCPSURLs: UInt,
    rgCPSURLsCtorArg: MutPtr<CpsUrls>,
) {
    public var pszPracticesReference: Pwstr = pszPracticesReferenceCtorArg
        internal set

    public var pszNoticeIdentifier: Pstr = pszNoticeIdentifierCtorArg
        internal set

    public var pszNSINoticeIdentifier: Pstr = pszNSINoticeIdentifierCtorArg
        internal set

    public var rgCPSURLs: MutPtr<CpsUrls> = rgCPSURLsCtorArg
        internal set

    public constructor() : this(
        pszPracticesReferenceCtorArg = MutPtr(0L),
        pszNoticeIdentifierCtorArg = MutPtr(0L),
        pszNSINoticeIdentifierCtorArg = MutPtr(0L),
        cCPSURLs = 0u,
        rgCPSURLsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszPracticesReference

    public operator fun component2(): Pstr = this.pszNoticeIdentifier

    public operator fun component3(): Pstr = this.pszNSINoticeIdentifier

    public operator fun component4(): UInt = this.cCPSURLs

    public operator fun component5(): MutPtr<CpsUrls> = this.rgCPSURLs

    public fun copy(pszPracticesReference: Pwstr = this.pszPracticesReference, pszNoticeIdentifier: Pstr = this.pszNoticeIdentifier, pszNSINoticeIdentifier: Pstr = this.pszNSINoticeIdentifier, cCPSURLs: UInt = this.cCPSURLs, rgCPSURLs: MutPtr<CpsUrls> = this.rgCPSURLs): CertPolicy95Qualifier1 = CertPolicy95Qualifier1(pszPracticesReferenceCtorArg = pszPracticesReference, pszNoticeIdentifierCtorArg = pszNoticeIdentifier, pszNSINoticeIdentifierCtorArg = pszNSINoticeIdentifier, cCPSURLs = cCPSURLs, rgCPSURLsCtorArg = rgCPSURLs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertPolicy95Qualifier1) return false
        if (this.pszPracticesReference != other.pszPracticesReference) return false
        if (this.pszNoticeIdentifier != other.pszNoticeIdentifier) return false
        if (this.pszNSINoticeIdentifier != other.pszNSINoticeIdentifier) return false
        if (this.cCPSURLs != other.cCPSURLs) return false
        if (this.rgCPSURLs != other.rgCPSURLs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszPracticesReference.hashCode()
        result = 31 * result + this.pszNoticeIdentifier.hashCode()
        result = 31 * result + this.pszNSINoticeIdentifier.hashCode()
        result = 31 * result + this.cCPSURLs.hashCode()
        result = 31 * result + this.rgCPSURLs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszPracticesReference: Pwstr = MutPtr(0L),
            pszNoticeIdentifier: Pstr = MutPtr(0L),
            pszNSINoticeIdentifier: Pstr = MutPtr(0L),
            cCPSURLs: UInt = 0u,
            rgCPSURLs: MutPtr<CpsUrls> = MutPtr(0L),
        ): CertPolicy95Qualifier1 =
            CertPolicy95Qualifier1(
                pszPracticesReferenceCtorArg = pszPracticesReference,
                pszNoticeIdentifierCtorArg = pszNoticeIdentifier,
                pszNSINoticeIdentifierCtorArg = pszNSINoticeIdentifier,
                cCPSURLs = cCPSURLs,
                rgCPSURLsCtorArg = rgCPSURLs,
            )
    }
}

public data class CertPolicyConstraintsInfo(
    public var fRequireExplicitPolicy: Bool = 0,
    public var dwRequireExplicitPolicySkipCerts: UInt = 0u,
    public var fInhibitPolicyMapping: Bool = 0,
    public var dwInhibitPolicyMappingSkipCerts: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertPolicyConstraintsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertPolicyConstraintsInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertPolicyConstraintsInfo =
                    CertPolicyConstraintsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: CertPolicyConstraintsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fRequireExplicitPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRequireExplicitPolicySkipCerts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fInhibitPolicyMapping)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwInhibitPolicyMappingSkipCerts)
                }
            }
    }
}

public class CertPolicyId internal constructor(
    public var cCertPolicyElementId: UInt,
    rgpszCertPolicyElementIdCtorArg: MutPtr<Pstr>,
) {
    public var rgpszCertPolicyElementId: MutPtr<Pstr> = rgpszCertPolicyElementIdCtorArg
        internal set

    public constructor() : this(
        cCertPolicyElementId = 0u,
        rgpszCertPolicyElementIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCertPolicyElementId

    public operator fun component2(): MutPtr<Pstr> = this.rgpszCertPolicyElementId

    public fun copy(cCertPolicyElementId: UInt = this.cCertPolicyElementId, rgpszCertPolicyElementId: MutPtr<Pstr> = this.rgpszCertPolicyElementId): CertPolicyId = CertPolicyId(cCertPolicyElementId = cCertPolicyElementId, rgpszCertPolicyElementIdCtorArg = rgpszCertPolicyElementId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertPolicyId) return false
        if (this.cCertPolicyElementId != other.cCertPolicyElementId) return false
        if (this.rgpszCertPolicyElementId != other.rgpszCertPolicyElementId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCertPolicyElementId.hashCode()
        result = 31 * result + this.rgpszCertPolicyElementId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertPolicyId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertPolicyId> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertPolicyId =
                    CertPolicyId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Pstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertPolicyId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCertPolicyElementId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Pstr>(64)
                    ).writeNative(addr + 8L, value.rgpszCertPolicyElementId)
                }
            }

        public operator fun invoke(
            cCertPolicyElementId: UInt = 0u,
            rgpszCertPolicyElementId: MutPtr<Pstr> = MutPtr(0L),
        ): CertPolicyId =
            CertPolicyId(
                cCertPolicyElementId = cCertPolicyElementId,
                rgpszCertPolicyElementIdCtorArg = rgpszCertPolicyElementId,
            )
    }
}

public class CertPolicyInfo internal constructor(
    pszPolicyIdentifierCtorArg: Pstr,
    public var cPolicyQualifier: UInt,
    rgPolicyQualifierCtorArg: MutPtr<CertPolicyQualifierInfo>,
) {
    public var pszPolicyIdentifier: Pstr = pszPolicyIdentifierCtorArg
        internal set

    public var rgPolicyQualifier: MutPtr<CertPolicyQualifierInfo> = rgPolicyQualifierCtorArg
        internal set

    public constructor() : this(
        pszPolicyIdentifierCtorArg = MutPtr(0L),
        cPolicyQualifier = 0u,
        rgPolicyQualifierCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pszPolicyIdentifier

    public operator fun component2(): UInt = this.cPolicyQualifier

    public operator fun component3(): MutPtr<CertPolicyQualifierInfo> = this.rgPolicyQualifier

    public fun copy(pszPolicyIdentifier: Pstr = this.pszPolicyIdentifier, cPolicyQualifier: UInt = this.cPolicyQualifier, rgPolicyQualifier: MutPtr<CertPolicyQualifierInfo> = this.rgPolicyQualifier): CertPolicyInfo = CertPolicyInfo(pszPolicyIdentifierCtorArg = pszPolicyIdentifier, cPolicyQualifier = cPolicyQualifier, rgPolicyQualifierCtorArg = rgPolicyQualifier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertPolicyInfo) return false
        if (this.pszPolicyIdentifier != other.pszPolicyIdentifier) return false
        if (this.cPolicyQualifier != other.cPolicyQualifier) return false
        if (this.rgPolicyQualifier != other.rgPolicyQualifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszPolicyIdentifier.hashCode()
        result = 31 * result + this.cPolicyQualifier.hashCode()
        result = 31 * result + this.rgPolicyQualifier.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszPolicyIdentifier: Pstr = MutPtr(0L),
            cPolicyQualifier: UInt = 0u,
            rgPolicyQualifier: MutPtr<CertPolicyQualifierInfo> = MutPtr(0L),
        ): CertPolicyInfo =
            CertPolicyInfo(
                pszPolicyIdentifierCtorArg = pszPolicyIdentifier,
                cPolicyQualifier = cPolicyQualifier,
                rgPolicyQualifierCtorArg = rgPolicyQualifier,
            )
    }
}

public class CertPolicyMapping internal constructor(
    pszIssuerDomainPolicyCtorArg: Pstr,
    pszSubjectDomainPolicyCtorArg: Pstr,
) {
    public var pszIssuerDomainPolicy: Pstr = pszIssuerDomainPolicyCtorArg
        internal set

    public var pszSubjectDomainPolicy: Pstr = pszSubjectDomainPolicyCtorArg
        internal set

    public constructor() : this(
        pszIssuerDomainPolicyCtorArg = MutPtr(0L),
        pszSubjectDomainPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pszIssuerDomainPolicy

    public operator fun component2(): Pstr = this.pszSubjectDomainPolicy

    public fun copy(pszIssuerDomainPolicy: Pstr = this.pszIssuerDomainPolicy, pszSubjectDomainPolicy: Pstr = this.pszSubjectDomainPolicy): CertPolicyMapping = CertPolicyMapping(pszIssuerDomainPolicyCtorArg = pszIssuerDomainPolicy, pszSubjectDomainPolicyCtorArg = pszSubjectDomainPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertPolicyMapping) return false
        if (this.pszIssuerDomainPolicy != other.pszIssuerDomainPolicy) return false
        if (this.pszSubjectDomainPolicy != other.pszSubjectDomainPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszIssuerDomainPolicy.hashCode()
        result = 31 * result + this.pszSubjectDomainPolicy.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszIssuerDomainPolicy: Pstr = MutPtr(0L),
            pszSubjectDomainPolicy: Pstr = MutPtr(0L),
        ): CertPolicyMapping =
            CertPolicyMapping(
                pszIssuerDomainPolicyCtorArg = pszIssuerDomainPolicy,
                pszSubjectDomainPolicyCtorArg = pszSubjectDomainPolicy,
            )
    }
}

public class CertPolicyMappingsInfo internal constructor(
    public var cPolicyMapping: UInt,
    rgPolicyMappingCtorArg: MutPtr<CertPolicyMapping>,
) {
    public var rgPolicyMapping: MutPtr<CertPolicyMapping> = rgPolicyMappingCtorArg
        internal set

    public constructor() : this(
        cPolicyMapping = 0u,
        rgPolicyMappingCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cPolicyMapping

    public operator fun component2(): MutPtr<CertPolicyMapping> = this.rgPolicyMapping

    public fun copy(cPolicyMapping: UInt = this.cPolicyMapping, rgPolicyMapping: MutPtr<CertPolicyMapping> = this.rgPolicyMapping): CertPolicyMappingsInfo = CertPolicyMappingsInfo(cPolicyMapping = cPolicyMapping, rgPolicyMappingCtorArg = rgPolicyMapping)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertPolicyMappingsInfo) return false
        if (this.cPolicyMapping != other.cPolicyMapping) return false
        if (this.rgPolicyMapping != other.rgPolicyMapping) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cPolicyMapping.hashCode()
        result = 31 * result + this.rgPolicyMapping.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertPolicyMappingsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertPolicyMappingsInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertPolicyMappingsInfo =
                    CertPolicyMappingsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertPolicyMapping>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertPolicyMappingsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cPolicyMapping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertPolicyMapping>(64)
                    ).writeNative(addr + 8L, value.rgPolicyMapping)
                }
            }

        public operator fun invoke(
            cPolicyMapping: UInt = 0u,
            rgPolicyMapping: MutPtr<CertPolicyMapping> = MutPtr(0L),
        ): CertPolicyMappingsInfo =
            CertPolicyMappingsInfo(
                cPolicyMapping = cPolicyMapping,
                rgPolicyMappingCtorArg = rgPolicyMapping,
            )
    }
}

public class CertPolicyQualifierInfo internal constructor(
    pszPolicyQualifierIdCtorArg: Pstr,
    public var qualifier: CryptIntegerBlob,
) {
    public var pszPolicyQualifierId: Pstr = pszPolicyQualifierIdCtorArg
        internal set

    public constructor() : this(
        pszPolicyQualifierIdCtorArg = MutPtr(0L),
        qualifier = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszPolicyQualifierId

    public operator fun component2(): CryptIntegerBlob = this.qualifier

    public fun copy(pszPolicyQualifierId: Pstr = this.pszPolicyQualifierId, qualifier: CryptIntegerBlob = this.qualifier): CertPolicyQualifierInfo = CertPolicyQualifierInfo(pszPolicyQualifierIdCtorArg = pszPolicyQualifierId, qualifier = qualifier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertPolicyQualifierInfo) return false
        if (this.pszPolicyQualifierId != other.pszPolicyQualifierId) return false
        if (this.qualifier != other.qualifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszPolicyQualifierId.hashCode()
        result = 31 * result + this.qualifier.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszPolicyQualifierId: Pstr = MutPtr(0L),
            qualifier: CryptIntegerBlob = CryptIntegerBlob(),
        ): CertPolicyQualifierInfo =
            CertPolicyQualifierInfo(
                pszPolicyQualifierIdCtorArg = pszPolicyQualifierId,
                qualifier = qualifier,
            )
    }
}

public class CertPolicyQualifierNoticeReference internal constructor(
    pszOrganizationCtorArg: Pstr,
    public var cNoticeNumbers: UInt,
    rgNoticeNumbersCtorArg: MutPtr<Int>,
) {
    public var pszOrganization: Pstr = pszOrganizationCtorArg
        internal set

    public var rgNoticeNumbers: MutPtr<Int> = rgNoticeNumbersCtorArg
        internal set

    public constructor() : this(
        pszOrganizationCtorArg = MutPtr(0L),
        cNoticeNumbers = 0u,
        rgNoticeNumbersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pszOrganization

    public operator fun component2(): UInt = this.cNoticeNumbers

    public operator fun component3(): MutPtr<Int> = this.rgNoticeNumbers

    public fun copy(pszOrganization: Pstr = this.pszOrganization, cNoticeNumbers: UInt = this.cNoticeNumbers, rgNoticeNumbers: MutPtr<Int> = this.rgNoticeNumbers): CertPolicyQualifierNoticeReference = CertPolicyQualifierNoticeReference(pszOrganizationCtorArg = pszOrganization, cNoticeNumbers = cNoticeNumbers, rgNoticeNumbersCtorArg = rgNoticeNumbers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertPolicyQualifierNoticeReference) return false
        if (this.pszOrganization != other.pszOrganization) return false
        if (this.cNoticeNumbers != other.cNoticeNumbers) return false
        if (this.rgNoticeNumbers != other.rgNoticeNumbers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszOrganization.hashCode()
        result = 31 * result + this.cNoticeNumbers.hashCode()
        result = 31 * result + this.rgNoticeNumbers.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszOrganization: Pstr = MutPtr(0L),
            cNoticeNumbers: UInt = 0u,
            rgNoticeNumbers: MutPtr<Int> = MutPtr(0L),
        ): CertPolicyQualifierNoticeReference =
            CertPolicyQualifierNoticeReference(
                pszOrganizationCtorArg = pszOrganization,
                cNoticeNumbers = cNoticeNumbers,
                rgNoticeNumbersCtorArg = rgNoticeNumbers,
            )
    }
}

public class CertPolicyQualifierUserNotice internal constructor(
    pNoticeReferenceCtorArg: MutPtr<CertPolicyQualifierNoticeReference>,
    pszDisplayTextCtorArg: Pwstr,
) {
    public var pNoticeReference: MutPtr<CertPolicyQualifierNoticeReference> = pNoticeReferenceCtorArg
        internal set

    public var pszDisplayText: Pwstr = pszDisplayTextCtorArg
        internal set

    public constructor() : this(
        pNoticeReferenceCtorArg = MutPtr(0L),
        pszDisplayTextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CertPolicyQualifierNoticeReference> = this.pNoticeReference

    public operator fun component2(): Pwstr = this.pszDisplayText

    public fun copy(pNoticeReference: MutPtr<CertPolicyQualifierNoticeReference> = this.pNoticeReference, pszDisplayText: Pwstr = this.pszDisplayText): CertPolicyQualifierUserNotice = CertPolicyQualifierUserNotice(pNoticeReferenceCtorArg = pNoticeReference, pszDisplayTextCtorArg = pszDisplayText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertPolicyQualifierUserNotice) return false
        if (this.pNoticeReference != other.pNoticeReference) return false
        if (this.pszDisplayText != other.pszDisplayText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNoticeReference.hashCode()
        result = 31 * result + this.pszDisplayText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNoticeReference: MutPtr<CertPolicyQualifierNoticeReference> = MutPtr(0L),
            pszDisplayText: Pwstr = MutPtr(0L),
        ): CertPolicyQualifierUserNotice =
            CertPolicyQualifierUserNotice(
                pNoticeReferenceCtorArg = pNoticeReference,
                pszDisplayTextCtorArg = pszDisplayText,
            )
    }
}

public data class CertPrivateKeyValidity(
    public var notBefore: Filetime = Filetime(),
    public var notAfter: Filetime = Filetime(),
)

public data class CertPublicKeyInfo(
    public var algorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var publicKey: CryptBitBlob = CryptBitBlob(),
)

public class CertQcStatement internal constructor(
    pszStatementIdCtorArg: Pstr,
    public var statementInfo: CryptIntegerBlob,
) {
    public var pszStatementId: Pstr = pszStatementIdCtorArg
        internal set

    public constructor() : this(
        pszStatementIdCtorArg = MutPtr(0L),
        statementInfo = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszStatementId

    public operator fun component2(): CryptIntegerBlob = this.statementInfo

    public fun copy(pszStatementId: Pstr = this.pszStatementId, statementInfo: CryptIntegerBlob = this.statementInfo): CertQcStatement = CertQcStatement(pszStatementIdCtorArg = pszStatementId, statementInfo = statementInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertQcStatement) return false
        if (this.pszStatementId != other.pszStatementId) return false
        if (this.statementInfo != other.statementInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszStatementId.hashCode()
        result = 31 * result + this.statementInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszStatementId: Pstr = MutPtr(0L),
            statementInfo: CryptIntegerBlob = CryptIntegerBlob(),
        ): CertQcStatement =
            CertQcStatement(
                pszStatementIdCtorArg = pszStatementId,
                statementInfo = statementInfo,
            )
    }
}

public class CertQcStatementsExtInfo internal constructor(
    public var cStatement: UInt,
    rgStatementCtorArg: MutPtr<CertQcStatement>,
) {
    public var rgStatement: MutPtr<CertQcStatement> = rgStatementCtorArg
        internal set

    public constructor() : this(
        cStatement = 0u,
        rgStatementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cStatement

    public operator fun component2(): MutPtr<CertQcStatement> = this.rgStatement

    public fun copy(cStatement: UInt = this.cStatement, rgStatement: MutPtr<CertQcStatement> = this.rgStatement): CertQcStatementsExtInfo = CertQcStatementsExtInfo(cStatement = cStatement, rgStatementCtorArg = rgStatement)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertQcStatementsExtInfo) return false
        if (this.cStatement != other.cStatement) return false
        if (this.rgStatement != other.rgStatement) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cStatement.hashCode()
        result = 31 * result + this.rgStatement.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertQcStatementsExtInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertQcStatementsExtInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertQcStatementsExtInfo =
                    CertQcStatementsExtInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertQcStatement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertQcStatementsExtInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cStatement)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertQcStatement>(64)
                    ).writeNative(addr + 8L, value.rgStatement)
                }
            }

        public operator fun invoke(
            cStatement: UInt = 0u,
            rgStatement: MutPtr<CertQcStatement> = MutPtr(0L),
        ): CertQcStatementsExtInfo =
            CertQcStatementsExtInfo(
                cStatement = cStatement,
                rgStatementCtorArg = rgStatement,
            )
    }
}

public class CertRdn internal constructor(
    public var cRDNAttr: UInt,
    rgRDNAttrCtorArg: MutPtr<CertRdnAttr>,
) {
    public var rgRDNAttr: MutPtr<CertRdnAttr> = rgRDNAttrCtorArg
        internal set

    public constructor() : this(
        cRDNAttr = 0u,
        rgRDNAttrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cRDNAttr

    public operator fun component2(): MutPtr<CertRdnAttr> = this.rgRDNAttr

    public fun copy(cRDNAttr: UInt = this.cRDNAttr, rgRDNAttr: MutPtr<CertRdnAttr> = this.rgRDNAttr): CertRdn = CertRdn(cRDNAttr = cRDNAttr, rgRDNAttrCtorArg = rgRDNAttr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertRdn) return false
        if (this.cRDNAttr != other.cRDNAttr) return false
        if (this.rgRDNAttr != other.rgRDNAttr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cRDNAttr.hashCode()
        result = 31 * result + this.rgRDNAttr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertRdn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertRdn> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertRdn =
                    CertRdn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertRdnAttr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertRdn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cRDNAttr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertRdnAttr>(64)
                    ).writeNative(addr + 8L, value.rgRDNAttr)
                }
            }

        public operator fun invoke(
            cRDNAttr: UInt = 0u,
            rgRDNAttr: MutPtr<CertRdnAttr> = MutPtr(0L),
        ): CertRdn =
            CertRdn(
                cRDNAttr = cRDNAttr,
                rgRDNAttrCtorArg = rgRDNAttr,
            )
    }
}

public class CertRdnAttr internal constructor(
    pszObjIdCtorArg: Pstr,
    public var dwValueType: UInt,
    public var value: CryptIntegerBlob,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        dwValueType = 0u,
        value = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): UInt = this.dwValueType

    public operator fun component3(): CryptIntegerBlob = this.value

    public fun copy(pszObjId: Pstr = this.pszObjId, dwValueType: UInt = this.dwValueType, value: CryptIntegerBlob = this.value): CertRdnAttr = CertRdnAttr(pszObjIdCtorArg = pszObjId, dwValueType = dwValueType, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertRdnAttr) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.dwValueType != other.dwValueType) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.dwValueType.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            dwValueType: UInt = 0u,
            value: CryptIntegerBlob = CryptIntegerBlob(),
        ): CertRdnAttr =
            CertRdnAttr(
                pszObjIdCtorArg = pszObjId,
                dwValueType = dwValueType,
                value = value,
            )
    }
}

public class CertRegistryStoreClientGptPara internal constructor(
    hKeyBaseCtorArg: Hkey,
    pwszRegPathCtorArg: Pwstr,
) {
    public var hKeyBase: Hkey = hKeyBaseCtorArg
        internal set

    public var pwszRegPath: Pwstr = pwszRegPathCtorArg
        internal set

    public constructor() : this(
        hKeyBaseCtorArg = MutPtr(0L),
        pwszRegPathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hkey = this.hKeyBase

    public operator fun component2(): Pwstr = this.pwszRegPath

    public fun copy(hKeyBase: Hkey = this.hKeyBase, pwszRegPath: Pwstr = this.pwszRegPath): CertRegistryStoreClientGptPara = CertRegistryStoreClientGptPara(hKeyBaseCtorArg = hKeyBase, pwszRegPathCtorArg = pwszRegPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertRegistryStoreClientGptPara) return false
        if (this.hKeyBase != other.hKeyBase) return false
        if (this.pwszRegPath != other.pwszRegPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hKeyBase.hashCode()
        result = 31 * result + this.pwszRegPath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hKeyBase: Hkey = MutPtr(0L),
            pwszRegPath: Pwstr = MutPtr(0L),
        ): CertRegistryStoreClientGptPara =
            CertRegistryStoreClientGptPara(
                hKeyBaseCtorArg = hKeyBase,
                pwszRegPathCtorArg = pwszRegPath,
            )
    }
}

public class CertRegistryStoreRoamingPara internal constructor(
    hKeyCtorArg: Hkey,
    pwszStoreDirectoryCtorArg: Pwstr,
) {
    public var hKey: Hkey = hKeyCtorArg
        internal set

    public var pwszStoreDirectory: Pwstr = pwszStoreDirectoryCtorArg
        internal set

    public constructor() : this(
        hKeyCtorArg = MutPtr(0L),
        pwszStoreDirectoryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hkey = this.hKey

    public operator fun component2(): Pwstr = this.pwszStoreDirectory

    public fun copy(hKey: Hkey = this.hKey, pwszStoreDirectory: Pwstr = this.pwszStoreDirectory): CertRegistryStoreRoamingPara = CertRegistryStoreRoamingPara(hKeyCtorArg = hKey, pwszStoreDirectoryCtorArg = pwszStoreDirectory)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertRegistryStoreRoamingPara) return false
        if (this.hKey != other.hKey) return false
        if (this.pwszStoreDirectory != other.pwszStoreDirectory) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hKey.hashCode()
        result = 31 * result + this.pwszStoreDirectory.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hKey: Hkey = MutPtr(0L),
            pwszStoreDirectory: Pwstr = MutPtr(0L),
        ): CertRegistryStoreRoamingPara =
            CertRegistryStoreRoamingPara(
                hKeyCtorArg = hKey,
                pwszStoreDirectoryCtorArg = pwszStoreDirectory,
            )
    }
}

public class CertRequestInfo internal constructor(
    public var dwVersion: UInt,
    public var subject: CryptIntegerBlob,
    public var subjectPublicKeyInfo: CertPublicKeyInfo,
    public var cAttribute: UInt,
    rgAttributeCtorArg: MutPtr<CryptAttribute>,
) {
    public var rgAttribute: MutPtr<CryptAttribute> = rgAttributeCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        subject = CryptIntegerBlob(),
        subjectPublicKeyInfo = CertPublicKeyInfo(),
        cAttribute = 0u,
        rgAttributeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): CryptIntegerBlob = this.subject

    public operator fun component3(): CertPublicKeyInfo = this.subjectPublicKeyInfo

    public operator fun component4(): UInt = this.cAttribute

    public operator fun component5(): MutPtr<CryptAttribute> = this.rgAttribute

    public fun copy(dwVersion: UInt = this.dwVersion, subject: CryptIntegerBlob = this.subject, subjectPublicKeyInfo: CertPublicKeyInfo = this.subjectPublicKeyInfo, cAttribute: UInt = this.cAttribute, rgAttribute: MutPtr<CryptAttribute> = this.rgAttribute): CertRequestInfo = CertRequestInfo(dwVersion = dwVersion, subject = subject, subjectPublicKeyInfo = subjectPublicKeyInfo, cAttribute = cAttribute, rgAttributeCtorArg = rgAttribute)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertRequestInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.subject != other.subject) return false
        if (this.subjectPublicKeyInfo != other.subjectPublicKeyInfo) return false
        if (this.cAttribute != other.cAttribute) return false
        if (this.rgAttribute != other.rgAttribute) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.subject.hashCode()
        result = 31 * result + this.subjectPublicKeyInfo.hashCode()
        result = 31 * result + this.cAttribute.hashCode()
        result = 31 * result + this.rgAttribute.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            subject: CryptIntegerBlob = CryptIntegerBlob(),
            subjectPublicKeyInfo: CertPublicKeyInfo = CertPublicKeyInfo(),
            cAttribute: UInt = 0u,
            rgAttribute: MutPtr<CryptAttribute> = MutPtr(0L),
        ): CertRequestInfo =
            CertRequestInfo(
                dwVersion = dwVersion,
                subject = subject,
                subjectPublicKeyInfo = subjectPublicKeyInfo,
                cAttribute = cAttribute,
                rgAttributeCtorArg = rgAttribute,
            )
    }
}

public class CertRevocationChainPara internal constructor(
    public var cbSize: UInt,
    hChainEngineCtorArg: Hcertchainengine,
    hAdditionalStoreCtorArg: Hcertstore,
    public var dwChainFlags: UInt,
    public var dwUrlRetrievalTimeout: UInt,
    pftCurrentTimeCtorArg: MutPtr<Filetime>,
    pftCacheResyncCtorArg: MutPtr<Filetime>,
    public var cbMaxUrlRetrievalByteCount: UInt,
) {
    public var hChainEngine: Hcertchainengine = hChainEngineCtorArg
        internal set

    public var hAdditionalStore: Hcertstore = hAdditionalStoreCtorArg
        internal set

    public var pftCurrentTime: MutPtr<Filetime> = pftCurrentTimeCtorArg
        internal set

    public var pftCacheResync: MutPtr<Filetime> = pftCacheResyncCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hChainEngineCtorArg = MutPtr(0L),
        hAdditionalStoreCtorArg = MutPtr(0L),
        dwChainFlags = 0u,
        dwUrlRetrievalTimeout = 0u,
        pftCurrentTimeCtorArg = MutPtr(0L),
        pftCacheResyncCtorArg = MutPtr(0L),
        cbMaxUrlRetrievalByteCount = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hcertchainengine = this.hChainEngine

    public operator fun component3(): Hcertstore = this.hAdditionalStore

    public operator fun component4(): UInt = this.dwChainFlags

    public operator fun component5(): UInt = this.dwUrlRetrievalTimeout

    public operator fun component6(): MutPtr<Filetime> = this.pftCurrentTime

    public operator fun component7(): MutPtr<Filetime> = this.pftCacheResync

    public operator fun component8(): UInt = this.cbMaxUrlRetrievalByteCount

    public fun copy(cbSize: UInt = this.cbSize, hChainEngine: Hcertchainengine = this.hChainEngine, hAdditionalStore: Hcertstore = this.hAdditionalStore, dwChainFlags: UInt = this.dwChainFlags, dwUrlRetrievalTimeout: UInt = this.dwUrlRetrievalTimeout, pftCurrentTime: MutPtr<Filetime> = this.pftCurrentTime, pftCacheResync: MutPtr<Filetime> = this.pftCacheResync, cbMaxUrlRetrievalByteCount: UInt = this.cbMaxUrlRetrievalByteCount): CertRevocationChainPara = CertRevocationChainPara(cbSize = cbSize, hChainEngineCtorArg = hChainEngine, hAdditionalStoreCtorArg = hAdditionalStore, dwChainFlags = dwChainFlags, dwUrlRetrievalTimeout = dwUrlRetrievalTimeout, pftCurrentTimeCtorArg = pftCurrentTime, pftCacheResyncCtorArg = pftCacheResync, cbMaxUrlRetrievalByteCount = cbMaxUrlRetrievalByteCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertRevocationChainPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hChainEngine != other.hChainEngine) return false
        if (this.hAdditionalStore != other.hAdditionalStore) return false
        if (this.dwChainFlags != other.dwChainFlags) return false
        if (this.dwUrlRetrievalTimeout != other.dwUrlRetrievalTimeout) return false
        if (this.pftCurrentTime != other.pftCurrentTime) return false
        if (this.pftCacheResync != other.pftCacheResync) return false
        if (this.cbMaxUrlRetrievalByteCount != other.cbMaxUrlRetrievalByteCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hChainEngine.hashCode()
        result = 31 * result + this.hAdditionalStore.hashCode()
        result = 31 * result + this.dwChainFlags.hashCode()
        result = 31 * result + this.dwUrlRetrievalTimeout.hashCode()
        result = 31 * result + this.pftCurrentTime.hashCode()
        result = 31 * result + this.pftCacheResync.hashCode()
        result = 31 * result + this.cbMaxUrlRetrievalByteCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertRevocationChainPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertRevocationChainPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): CertRevocationChainPara =
                    CertRevocationChainPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Filetime>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Filetime>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: CertRevocationChainPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.hChainEngine)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.hAdditionalStore)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwChainFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwUrlRetrievalTimeout)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Filetime>(64)
                    ).writeNative(addr + 32L, value.pftCurrentTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Filetime>(64)
                    ).writeNative(addr + 40L, value.pftCacheResync)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cbMaxUrlRetrievalByteCount)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            hChainEngine: Hcertchainengine = MutPtr(0L),
            hAdditionalStore: Hcertstore = MutPtr(0L),
            dwChainFlags: UInt = 0u,
            dwUrlRetrievalTimeout: UInt = 0u,
            pftCurrentTime: MutPtr<Filetime> = MutPtr(0L),
            pftCacheResync: MutPtr<Filetime> = MutPtr(0L),
            cbMaxUrlRetrievalByteCount: UInt = 0u,
        ): CertRevocationChainPara =
            CertRevocationChainPara(
                cbSize = cbSize,
                hChainEngineCtorArg = hChainEngine,
                hAdditionalStoreCtorArg = hAdditionalStore,
                dwChainFlags = dwChainFlags,
                dwUrlRetrievalTimeout = dwUrlRetrievalTimeout,
                pftCurrentTimeCtorArg = pftCurrentTime,
                pftCacheResyncCtorArg = pftCacheResync,
                cbMaxUrlRetrievalByteCount = cbMaxUrlRetrievalByteCount,
            )
    }
}

public class CertRevocationCrlInfo internal constructor(
    public var cbSize: UInt,
    pBaseCrlContextCtorArg: MutPtr<CrlContext>,
    pDeltaCrlContextCtorArg: MutPtr<CrlContext>,
    pCrlEntryCtorArg: MutPtr<CrlEntry>,
    public var fDeltaCrlEntry: Bool,
) {
    public var pBaseCrlContext: MutPtr<CrlContext> = pBaseCrlContextCtorArg
        internal set

    public var pDeltaCrlContext: MutPtr<CrlContext> = pDeltaCrlContextCtorArg
        internal set

    public var pCrlEntry: MutPtr<CrlEntry> = pCrlEntryCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pBaseCrlContextCtorArg = MutPtr(0L),
        pDeltaCrlContextCtorArg = MutPtr(0L),
        pCrlEntryCtorArg = MutPtr(0L),
        fDeltaCrlEntry = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<CrlContext> = this.pBaseCrlContext

    public operator fun component3(): MutPtr<CrlContext> = this.pDeltaCrlContext

    public operator fun component4(): MutPtr<CrlEntry> = this.pCrlEntry

    public operator fun component5(): Bool = this.fDeltaCrlEntry

    public fun copy(cbSize: UInt = this.cbSize, pBaseCrlContext: MutPtr<CrlContext> = this.pBaseCrlContext, pDeltaCrlContext: MutPtr<CrlContext> = this.pDeltaCrlContext, pCrlEntry: MutPtr<CrlEntry> = this.pCrlEntry, fDeltaCrlEntry: Bool = this.fDeltaCrlEntry): CertRevocationCrlInfo = CertRevocationCrlInfo(cbSize = cbSize, pBaseCrlContextCtorArg = pBaseCrlContext, pDeltaCrlContextCtorArg = pDeltaCrlContext, pCrlEntryCtorArg = pCrlEntry, fDeltaCrlEntry = fDeltaCrlEntry)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertRevocationCrlInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pBaseCrlContext != other.pBaseCrlContext) return false
        if (this.pDeltaCrlContext != other.pDeltaCrlContext) return false
        if (this.pCrlEntry != other.pCrlEntry) return false
        if (this.fDeltaCrlEntry != other.fDeltaCrlEntry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pBaseCrlContext.hashCode()
        result = 31 * result + this.pDeltaCrlContext.hashCode()
        result = 31 * result + this.pCrlEntry.hashCode()
        result = 31 * result + this.fDeltaCrlEntry.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertRevocationCrlInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertRevocationCrlInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CertRevocationCrlInfo =
                    CertRevocationCrlInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CrlContext>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CrlContext>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CrlEntry>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CertRevocationCrlInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CrlContext>(64)
                    ).writeNative(addr + 8L, value.pBaseCrlContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CrlContext>(64)
                    ).writeNative(addr + 16L, value.pDeltaCrlContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CrlEntry>(64)
                    ).writeNative(addr + 24L, value.pCrlEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.fDeltaCrlEntry)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pBaseCrlContext: MutPtr<CrlContext> = MutPtr(0L),
            pDeltaCrlContext: MutPtr<CrlContext> = MutPtr(0L),
            pCrlEntry: MutPtr<CrlEntry> = MutPtr(0L),
            fDeltaCrlEntry: Bool = 0,
        ): CertRevocationCrlInfo =
            CertRevocationCrlInfo(
                cbSize = cbSize,
                pBaseCrlContextCtorArg = pBaseCrlContext,
                pDeltaCrlContextCtorArg = pDeltaCrlContext,
                pCrlEntryCtorArg = pCrlEntry,
                fDeltaCrlEntry = fDeltaCrlEntry,
            )
    }
}

public class CertRevocationInfo internal constructor(
    public var cbSize: UInt,
    public var dwRevocationResult: UInt,
    pszRevocationOidCtorArg: Pcstr,
    pvOidSpecificInfoCtorArg: MutPtr<CVoid>,
    public var fHasFreshnessTime: Bool,
    public var dwFreshnessTime: UInt,
    pCrlInfoCtorArg: MutPtr<CertRevocationCrlInfo>,
) {
    public var pszRevocationOid: Pcstr = pszRevocationOidCtorArg
        internal set

    public var pvOidSpecificInfo: MutPtr<CVoid> = pvOidSpecificInfoCtorArg
        internal set

    public var pCrlInfo: MutPtr<CertRevocationCrlInfo> = pCrlInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwRevocationResult = 0u,
        pszRevocationOidCtorArg = ConstPtr(0L),
        pvOidSpecificInfoCtorArg = MutPtr(0L),
        fHasFreshnessTime = 0,
        dwFreshnessTime = 0u,
        pCrlInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwRevocationResult

    public operator fun component3(): Pcstr = this.pszRevocationOid

    public operator fun component4(): MutPtr<CVoid> = this.pvOidSpecificInfo

    public operator fun component5(): Bool = this.fHasFreshnessTime

    public operator fun component6(): UInt = this.dwFreshnessTime

    public operator fun component7(): MutPtr<CertRevocationCrlInfo> = this.pCrlInfo

    public fun copy(cbSize: UInt = this.cbSize, dwRevocationResult: UInt = this.dwRevocationResult, pszRevocationOid: Pcstr = this.pszRevocationOid, pvOidSpecificInfo: MutPtr<CVoid> = this.pvOidSpecificInfo, fHasFreshnessTime: Bool = this.fHasFreshnessTime, dwFreshnessTime: UInt = this.dwFreshnessTime, pCrlInfo: MutPtr<CertRevocationCrlInfo> = this.pCrlInfo): CertRevocationInfo = CertRevocationInfo(cbSize = cbSize, dwRevocationResult = dwRevocationResult, pszRevocationOidCtorArg = pszRevocationOid, pvOidSpecificInfoCtorArg = pvOidSpecificInfo, fHasFreshnessTime = fHasFreshnessTime, dwFreshnessTime = dwFreshnessTime, pCrlInfoCtorArg = pCrlInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertRevocationInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwRevocationResult != other.dwRevocationResult) return false
        if (this.pszRevocationOid != other.pszRevocationOid) return false
        if (this.pvOidSpecificInfo != other.pvOidSpecificInfo) return false
        if (this.fHasFreshnessTime != other.fHasFreshnessTime) return false
        if (this.dwFreshnessTime != other.dwFreshnessTime) return false
        if (this.pCrlInfo != other.pCrlInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwRevocationResult.hashCode()
        result = 31 * result + this.pszRevocationOid.hashCode()
        result = 31 * result + this.pvOidSpecificInfo.hashCode()
        result = 31 * result + this.fHasFreshnessTime.hashCode()
        result = 31 * result + this.dwFreshnessTime.hashCode()
        result = 31 * result + this.pCrlInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwRevocationResult: UInt = 0u,
            pszRevocationOid: Pcstr = ConstPtr(0L),
            pvOidSpecificInfo: MutPtr<CVoid> = MutPtr(0L),
            fHasFreshnessTime: Bool = 0,
            dwFreshnessTime: UInt = 0u,
            pCrlInfo: MutPtr<CertRevocationCrlInfo> = MutPtr(0L),
        ): CertRevocationInfo =
            CertRevocationInfo(
                cbSize = cbSize,
                dwRevocationResult = dwRevocationResult,
                pszRevocationOidCtorArg = pszRevocationOid,
                pvOidSpecificInfoCtorArg = pvOidSpecificInfo,
                fHasFreshnessTime = fHasFreshnessTime,
                dwFreshnessTime = dwFreshnessTime,
                pCrlInfoCtorArg = pCrlInfo,
            )
    }
}

public class CertRevocationPara internal constructor(
    public var cbSize: UInt,
    pIssuerCertCtorArg: ConstPtr<CertContext>,
    public var cCertStore: UInt,
    rgCertStoreCtorArg: MutPtr<Hcertstore>,
    hCrlStoreCtorArg: Hcertstore,
    pftTimeToUseCtorArg: MutPtr<Filetime>,
) {
    public var pIssuerCert: ConstPtr<CertContext> = pIssuerCertCtorArg
        internal set

    public var rgCertStore: MutPtr<Hcertstore> = rgCertStoreCtorArg
        internal set

    public var hCrlStore: Hcertstore = hCrlStoreCtorArg
        internal set

    public var pftTimeToUse: MutPtr<Filetime> = pftTimeToUseCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pIssuerCertCtorArg = ConstPtr(0L),
        cCertStore = 0u,
        rgCertStoreCtorArg = MutPtr(0L),
        hCrlStoreCtorArg = MutPtr(0L),
        pftTimeToUseCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): ConstPtr<CertContext> = this.pIssuerCert

    public operator fun component3(): UInt = this.cCertStore

    public operator fun component4(): MutPtr<Hcertstore> = this.rgCertStore

    public operator fun component5(): Hcertstore = this.hCrlStore

    public operator fun component6(): MutPtr<Filetime> = this.pftTimeToUse

    public fun copy(cbSize: UInt = this.cbSize, pIssuerCert: ConstPtr<CertContext> = this.pIssuerCert, cCertStore: UInt = this.cCertStore, rgCertStore: MutPtr<Hcertstore> = this.rgCertStore, hCrlStore: Hcertstore = this.hCrlStore, pftTimeToUse: MutPtr<Filetime> = this.pftTimeToUse): CertRevocationPara = CertRevocationPara(cbSize = cbSize, pIssuerCertCtorArg = pIssuerCert, cCertStore = cCertStore, rgCertStoreCtorArg = rgCertStore, hCrlStoreCtorArg = hCrlStore, pftTimeToUseCtorArg = pftTimeToUse)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertRevocationPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pIssuerCert != other.pIssuerCert) return false
        if (this.cCertStore != other.cCertStore) return false
        if (this.rgCertStore != other.rgCertStore) return false
        if (this.hCrlStore != other.hCrlStore) return false
        if (this.pftTimeToUse != other.pftTimeToUse) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pIssuerCert.hashCode()
        result = 31 * result + this.cCertStore.hashCode()
        result = 31 * result + this.rgCertStore.hashCode()
        result = 31 * result + this.hCrlStore.hashCode()
        result = 31 * result + this.pftTimeToUse.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertRevocationPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertRevocationPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CertRevocationPara =
                    CertRevocationPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CertContext>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Hcertstore>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Filetime>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CertRevocationPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CertContext>(64)
                    ).writeNative(addr + 8L, value.pIssuerCert)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cCertStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Hcertstore>(64)
                    ).writeNative(addr + 24L, value.rgCertStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.hCrlStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Filetime>(64)
                    ).writeNative(addr + 40L, value.pftTimeToUse)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pIssuerCert: ConstPtr<CertContext> = ConstPtr(0L),
            cCertStore: UInt = 0u,
            rgCertStore: MutPtr<Hcertstore> = MutPtr(0L),
            hCrlStore: Hcertstore = MutPtr(0L),
            pftTimeToUse: MutPtr<Filetime> = MutPtr(0L),
        ): CertRevocationPara =
            CertRevocationPara(
                cbSize = cbSize,
                pIssuerCertCtorArg = pIssuerCert,
                cCertStore = cCertStore,
                rgCertStoreCtorArg = rgCertStore,
                hCrlStoreCtorArg = hCrlStore,
                pftTimeToUseCtorArg = pftTimeToUse,
            )
    }
}

public data class CertRevocationStatus(
    public var cbSize: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwReason: CertRevocationStatusReason = 0u,
    public var fHasFreshnessTime: Bool = 0,
    public var dwFreshnessTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertRevocationStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertRevocationStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CertRevocationStatus =
                    CertRevocationStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: CertRevocationStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.fHasFreshnessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwFreshnessTime)
                }
            }
    }
}

public class CertSelectChainPara internal constructor(
    hChainEngineCtorArg: Hcertchainengine,
    pTimeCtorArg: MutPtr<Filetime>,
    hAdditionalStoreCtorArg: Hcertstore,
    pChainParaCtorArg: MutPtr<CertChainPara>,
    public var dwFlags: UInt,
) {
    public var hChainEngine: Hcertchainengine = hChainEngineCtorArg
        internal set

    public var pTime: MutPtr<Filetime> = pTimeCtorArg
        internal set

    public var hAdditionalStore: Hcertstore = hAdditionalStoreCtorArg
        internal set

    public var pChainPara: MutPtr<CertChainPara> = pChainParaCtorArg
        internal set

    public constructor() : this(
        hChainEngineCtorArg = MutPtr(0L),
        pTimeCtorArg = MutPtr(0L),
        hAdditionalStoreCtorArg = MutPtr(0L),
        pChainParaCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): Hcertchainengine = this.hChainEngine

    public operator fun component2(): MutPtr<Filetime> = this.pTime

    public operator fun component3(): Hcertstore = this.hAdditionalStore

    public operator fun component4(): MutPtr<CertChainPara> = this.pChainPara

    public operator fun component5(): UInt = this.dwFlags

    public fun copy(hChainEngine: Hcertchainengine = this.hChainEngine, pTime: MutPtr<Filetime> = this.pTime, hAdditionalStore: Hcertstore = this.hAdditionalStore, pChainPara: MutPtr<CertChainPara> = this.pChainPara, dwFlags: UInt = this.dwFlags): CertSelectChainPara = CertSelectChainPara(hChainEngineCtorArg = hChainEngine, pTimeCtorArg = pTime, hAdditionalStoreCtorArg = hAdditionalStore, pChainParaCtorArg = pChainPara, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertSelectChainPara) return false
        if (this.hChainEngine != other.hChainEngine) return false
        if (this.pTime != other.pTime) return false
        if (this.hAdditionalStore != other.hAdditionalStore) return false
        if (this.pChainPara != other.pChainPara) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hChainEngine.hashCode()
        result = 31 * result + this.pTime.hashCode()
        result = 31 * result + this.hAdditionalStore.hashCode()
        result = 31 * result + this.pChainPara.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertSelectChainPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertSelectChainPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CertSelectChainPara =
                    CertSelectChainPara(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Filetime>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertChainPara>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CertSelectChainPara) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.hChainEngine)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Filetime>(64)
                    ).writeNative(addr + 8L, value.pTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.hAdditionalStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertChainPara>(64)
                    ).writeNative(addr + 24L, value.pChainPara)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwFlags)
                }
            }

        public operator fun invoke(
            hChainEngine: Hcertchainengine = MutPtr(0L),
            pTime: MutPtr<Filetime> = MutPtr(0L),
            hAdditionalStore: Hcertstore = MutPtr(0L),
            pChainPara: MutPtr<CertChainPara> = MutPtr(0L),
            dwFlags: UInt = 0u,
        ): CertSelectChainPara =
            CertSelectChainPara(
                hChainEngineCtorArg = hChainEngine,
                pTimeCtorArg = pTime,
                hAdditionalStoreCtorArg = hAdditionalStore,
                pChainParaCtorArg = pChainPara,
                dwFlags = dwFlags,
            )
    }
}

public class CertSelectCriteria internal constructor(
    public var dwType: CertSelectCriteriaType,
    public var cPara: UInt,
    ppParaCtorArg: MutPtr<MutPtr<CVoid>>,
) {
    public var ppPara: MutPtr<MutPtr<CVoid>> = ppParaCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        cPara = 0u,
        ppParaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CertSelectCriteriaType = this.dwType

    public operator fun component2(): UInt = this.cPara

    public operator fun component3(): MutPtr<MutPtr<CVoid>> = this.ppPara

    public fun copy(dwType: CertSelectCriteriaType = this.dwType, cPara: UInt = this.cPara, ppPara: MutPtr<MutPtr<CVoid>> = this.ppPara): CertSelectCriteria = CertSelectCriteria(dwType = dwType, cPara = cPara, ppParaCtorArg = ppPara)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertSelectCriteria) return false
        if (this.dwType != other.dwType) return false
        if (this.cPara != other.cPara) return false
        if (this.ppPara != other.ppPara) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.cPara.hashCode()
        result = 31 * result + this.ppPara.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertSelectCriteria> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertSelectCriteria> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CertSelectCriteria =
                    CertSelectCriteria(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertSelectCriteria) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cPara)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr + 8L, value.ppPara)
                }
            }

        public operator fun invoke(
            dwType: CertSelectCriteriaType = 0u,
            cPara: UInt = 0u,
            ppPara: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
        ): CertSelectCriteria =
            CertSelectCriteria(
                dwType = dwType,
                cPara = cPara,
                ppParaCtorArg = ppPara,
            )
    }
}

public class CertServerOcspResponseContext internal constructor(
    public var cbSize: UInt,
    pbEncodedOcspResponseCtorArg: MutPtr<UByte>,
    public var cbEncodedOcspResponse: UInt,
) {
    public var pbEncodedOcspResponse: MutPtr<UByte> = pbEncodedOcspResponseCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pbEncodedOcspResponseCtorArg = MutPtr(0L),
        cbEncodedOcspResponse = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<UByte> = this.pbEncodedOcspResponse

    public operator fun component3(): UInt = this.cbEncodedOcspResponse

    public fun copy(cbSize: UInt = this.cbSize, pbEncodedOcspResponse: MutPtr<UByte> = this.pbEncodedOcspResponse, cbEncodedOcspResponse: UInt = this.cbEncodedOcspResponse): CertServerOcspResponseContext = CertServerOcspResponseContext(cbSize = cbSize, pbEncodedOcspResponseCtorArg = pbEncodedOcspResponse, cbEncodedOcspResponse = cbEncodedOcspResponse)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertServerOcspResponseContext) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pbEncodedOcspResponse != other.pbEncodedOcspResponse) return false
        if (this.cbEncodedOcspResponse != other.cbEncodedOcspResponse) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pbEncodedOcspResponse.hashCode()
        result = 31 * result + this.cbEncodedOcspResponse.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertServerOcspResponseContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertServerOcspResponseContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CertServerOcspResponseContext =
                    CertServerOcspResponseContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CertServerOcspResponseContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbEncodedOcspResponse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbEncodedOcspResponse)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pbEncodedOcspResponse: MutPtr<UByte> = MutPtr(0L),
            cbEncodedOcspResponse: UInt = 0u,
        ): CertServerOcspResponseContext =
            CertServerOcspResponseContext(
                cbSize = cbSize,
                pbEncodedOcspResponseCtorArg = pbEncodedOcspResponse,
                cbEncodedOcspResponse = cbEncodedOcspResponse,
            )
    }
}

public class CertServerOcspResponseOpenPara internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    pcbUsedSizeCtorArg: MutPtr<UInt>,
    pwszOcspDirectoryCtorArg: Pwstr,
    public var pfnUpdateCallback: PfnCertServerOcspResponseUpdateCallback,
    pvUpdateCallbackArgCtorArg: MutPtr<CVoid>,
) {
    public var pcbUsedSize: MutPtr<UInt> = pcbUsedSizeCtorArg
        internal set

    public var pwszOcspDirectory: Pwstr = pwszOcspDirectoryCtorArg
        internal set

    public var pvUpdateCallbackArg: MutPtr<CVoid> = pvUpdateCallbackArgCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        pcbUsedSizeCtorArg = MutPtr(0L),
        pwszOcspDirectoryCtorArg = MutPtr(0L),
        pfnUpdateCallback = null,
        pvUpdateCallbackArgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): MutPtr<UInt> = this.pcbUsedSize

    public operator fun component4(): Pwstr = this.pwszOcspDirectory

    public operator fun component5(): PfnCertServerOcspResponseUpdateCallback = this.pfnUpdateCallback

    public operator fun component6(): MutPtr<CVoid> = this.pvUpdateCallbackArg

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, pcbUsedSize: MutPtr<UInt> = this.pcbUsedSize, pwszOcspDirectory: Pwstr = this.pwszOcspDirectory, pfnUpdateCallback: PfnCertServerOcspResponseUpdateCallback = this.pfnUpdateCallback, pvUpdateCallbackArg: MutPtr<CVoid> = this.pvUpdateCallbackArg): CertServerOcspResponseOpenPara = CertServerOcspResponseOpenPara(cbSize = cbSize, dwFlags = dwFlags, pcbUsedSizeCtorArg = pcbUsedSize, pwszOcspDirectoryCtorArg = pwszOcspDirectory, pfnUpdateCallback = pfnUpdateCallback, pvUpdateCallbackArgCtorArg = pvUpdateCallbackArg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertServerOcspResponseOpenPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pcbUsedSize != other.pcbUsedSize) return false
        if (this.pwszOcspDirectory != other.pwszOcspDirectory) return false
        if (this.pfnUpdateCallback != other.pfnUpdateCallback) return false
        if (this.pvUpdateCallbackArg != other.pvUpdateCallbackArg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pcbUsedSize.hashCode()
        result = 31 * result + this.pwszOcspDirectory.hashCode()
        result = 31 * result + this.pfnUpdateCallback.hashCode()
        result = 31 * result + this.pvUpdateCallbackArg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            pcbUsedSize: MutPtr<UInt> = MutPtr(0L),
            pwszOcspDirectory: Pwstr = MutPtr(0L),
            pfnUpdateCallback: PfnCertServerOcspResponseUpdateCallback = null,
            pvUpdateCallbackArg: MutPtr<CVoid> = MutPtr(0L),
        ): CertServerOcspResponseOpenPara =
            CertServerOcspResponseOpenPara(
                cbSize = cbSize,
                dwFlags = dwFlags,
                pcbUsedSizeCtorArg = pcbUsedSize,
                pwszOcspDirectoryCtorArg = pwszOcspDirectory,
                pfnUpdateCallback = pfnUpdateCallback,
                pvUpdateCallbackArgCtorArg = pvUpdateCallbackArg,
            )
    }
}

public data class CertSignedContentInfo(
    public var toBeSigned: CryptIntegerBlob = CryptIntegerBlob(),
    public var signatureAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var signature: CryptBitBlob = CryptBitBlob(),
)

public class CertSimpleChain internal constructor(
    public var cbSize: UInt,
    public var trustStatus: CertTrustStatus,
    public var cElement: UInt,
    rgpElementCtorArg: MutPtr<MutPtr<CertChainElement>>,
    pTrustListInfoCtorArg: MutPtr<CertTrustListInfo>,
    public var fHasRevocationFreshnessTime: Bool,
    public var dwRevocationFreshnessTime: UInt,
) {
    public var rgpElement: MutPtr<MutPtr<CertChainElement>> = rgpElementCtorArg
        internal set

    public var pTrustListInfo: MutPtr<CertTrustListInfo> = pTrustListInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        trustStatus = CertTrustStatus(),
        cElement = 0u,
        rgpElementCtorArg = MutPtr(0L),
        pTrustListInfoCtorArg = MutPtr(0L),
        fHasRevocationFreshnessTime = 0,
        dwRevocationFreshnessTime = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CertTrustStatus = this.trustStatus

    public operator fun component3(): UInt = this.cElement

    public operator fun component4(): MutPtr<MutPtr<CertChainElement>> = this.rgpElement

    public operator fun component5(): MutPtr<CertTrustListInfo> = this.pTrustListInfo

    public operator fun component6(): Bool = this.fHasRevocationFreshnessTime

    public operator fun component7(): UInt = this.dwRevocationFreshnessTime

    public fun copy(cbSize: UInt = this.cbSize, trustStatus: CertTrustStatus = this.trustStatus, cElement: UInt = this.cElement, rgpElement: MutPtr<MutPtr<CertChainElement>> = this.rgpElement, pTrustListInfo: MutPtr<CertTrustListInfo> = this.pTrustListInfo, fHasRevocationFreshnessTime: Bool = this.fHasRevocationFreshnessTime, dwRevocationFreshnessTime: UInt = this.dwRevocationFreshnessTime): CertSimpleChain = CertSimpleChain(cbSize = cbSize, trustStatus = trustStatus, cElement = cElement, rgpElementCtorArg = rgpElement, pTrustListInfoCtorArg = pTrustListInfo, fHasRevocationFreshnessTime = fHasRevocationFreshnessTime, dwRevocationFreshnessTime = dwRevocationFreshnessTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertSimpleChain) return false
        if (this.cbSize != other.cbSize) return false
        if (this.trustStatus != other.trustStatus) return false
        if (this.cElement != other.cElement) return false
        if (this.rgpElement != other.rgpElement) return false
        if (this.pTrustListInfo != other.pTrustListInfo) return false
        if (this.fHasRevocationFreshnessTime != other.fHasRevocationFreshnessTime) return false
        if (this.dwRevocationFreshnessTime != other.dwRevocationFreshnessTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.trustStatus.hashCode()
        result = 31 * result + this.cElement.hashCode()
        result = 31 * result + this.rgpElement.hashCode()
        result = 31 * result + this.pTrustListInfo.hashCode()
        result = 31 * result + this.fHasRevocationFreshnessTime.hashCode()
        result = 31 * result + this.dwRevocationFreshnessTime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertSimpleChain> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertSimpleChain> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CertSimpleChain =
                    CertSimpleChain(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CertTrustStatus.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CertChainElement>>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertTrustListInfo>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: CertSimpleChain) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (CertTrustStatus.typeLayout()).writeNative(addr + 4L, value.trustStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cElement)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CertChainElement>>(64)
                    ).writeNative(addr + 16L, value.rgpElement)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertTrustListInfo>(64)
                    ).writeNative(addr + 24L, value.pTrustListInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.fHasRevocationFreshnessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwRevocationFreshnessTime)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            trustStatus: CertTrustStatus = CertTrustStatus(),
            cElement: UInt = 0u,
            rgpElement: MutPtr<MutPtr<CertChainElement>> = MutPtr(0L),
            pTrustListInfo: MutPtr<CertTrustListInfo> = MutPtr(0L),
            fHasRevocationFreshnessTime: Bool = 0,
            dwRevocationFreshnessTime: UInt = 0u,
        ): CertSimpleChain =
            CertSimpleChain(
                cbSize = cbSize,
                trustStatus = trustStatus,
                cElement = cElement,
                rgpElementCtorArg = rgpElement,
                pTrustListInfoCtorArg = pTrustListInfo,
                fHasRevocationFreshnessTime = fHasRevocationFreshnessTime,
                dwRevocationFreshnessTime = dwRevocationFreshnessTime,
            )
    }
}

public class CertStoreProvFindInfo internal constructor(
    public var cbSize: UInt,
    public var dwMsgAndCertEncodingType: UInt,
    public var dwFindFlags: UInt,
    public var dwFindType: UInt,
    pvFindParaCtorArg: ConstPtr<CVoid>,
) {
    public var pvFindPara: ConstPtr<CVoid> = pvFindParaCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMsgAndCertEncodingType = 0u,
        dwFindFlags = 0u,
        dwFindType = 0u,
        pvFindParaCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwMsgAndCertEncodingType

    public operator fun component3(): UInt = this.dwFindFlags

    public operator fun component4(): UInt = this.dwFindType

    public operator fun component5(): ConstPtr<CVoid> = this.pvFindPara

    public fun copy(cbSize: UInt = this.cbSize, dwMsgAndCertEncodingType: UInt = this.dwMsgAndCertEncodingType, dwFindFlags: UInt = this.dwFindFlags, dwFindType: UInt = this.dwFindType, pvFindPara: ConstPtr<CVoid> = this.pvFindPara): CertStoreProvFindInfo = CertStoreProvFindInfo(cbSize = cbSize, dwMsgAndCertEncodingType = dwMsgAndCertEncodingType, dwFindFlags = dwFindFlags, dwFindType = dwFindType, pvFindParaCtorArg = pvFindPara)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertStoreProvFindInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMsgAndCertEncodingType != other.dwMsgAndCertEncodingType) return false
        if (this.dwFindFlags != other.dwFindFlags) return false
        if (this.dwFindType != other.dwFindType) return false
        if (this.pvFindPara != other.pvFindPara) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMsgAndCertEncodingType.hashCode()
        result = 31 * result + this.dwFindFlags.hashCode()
        result = 31 * result + this.dwFindType.hashCode()
        result = 31 * result + this.pvFindPara.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertStoreProvFindInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertStoreProvFindInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CertStoreProvFindInfo =
                    CertStoreProvFindInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CertStoreProvFindInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMsgAndCertEncodingType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFindFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFindType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.pvFindPara)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMsgAndCertEncodingType: UInt = 0u,
            dwFindFlags: UInt = 0u,
            dwFindType: UInt = 0u,
            pvFindPara: ConstPtr<CVoid> = ConstPtr(0L),
        ): CertStoreProvFindInfo =
            CertStoreProvFindInfo(
                cbSize = cbSize,
                dwMsgAndCertEncodingType = dwMsgAndCertEncodingType,
                dwFindFlags = dwFindFlags,
                dwFindType = dwFindType,
                pvFindParaCtorArg = pvFindPara,
            )
    }
}

public class CertStoreProvInfo internal constructor(
    public var cbSize: UInt,
    public var cStoreProvFunc: UInt,
    rgpvStoreProvFuncCtorArg: MutPtr<MutPtr<CVoid>>,
    hStoreProvCtorArg: Hcertstoreprov,
    public var dwStoreProvFlags: CertStoreProvFlags,
    hStoreProvFuncAddr2CtorArg: MutPtr<CVoid>,
) {
    public var rgpvStoreProvFunc: MutPtr<MutPtr<CVoid>> = rgpvStoreProvFuncCtorArg
        internal set

    public var hStoreProv: Hcertstoreprov = hStoreProvCtorArg
        internal set

    public var hStoreProvFuncAddr2: MutPtr<CVoid> = hStoreProvFuncAddr2CtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        cStoreProvFunc = 0u,
        rgpvStoreProvFuncCtorArg = MutPtr(0L),
        hStoreProvCtorArg = MutPtr(0L),
        dwStoreProvFlags = 0u,
        hStoreProvFuncAddr2CtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.cStoreProvFunc

    public operator fun component3(): MutPtr<MutPtr<CVoid>> = this.rgpvStoreProvFunc

    public operator fun component4(): Hcertstoreprov = this.hStoreProv

    public operator fun component5(): CertStoreProvFlags = this.dwStoreProvFlags

    public operator fun component6(): MutPtr<CVoid> = this.hStoreProvFuncAddr2

    public fun copy(cbSize: UInt = this.cbSize, cStoreProvFunc: UInt = this.cStoreProvFunc, rgpvStoreProvFunc: MutPtr<MutPtr<CVoid>> = this.rgpvStoreProvFunc, hStoreProv: Hcertstoreprov = this.hStoreProv, dwStoreProvFlags: CertStoreProvFlags = this.dwStoreProvFlags, hStoreProvFuncAddr2: MutPtr<CVoid> = this.hStoreProvFuncAddr2): CertStoreProvInfo = CertStoreProvInfo(cbSize = cbSize, cStoreProvFunc = cStoreProvFunc, rgpvStoreProvFuncCtorArg = rgpvStoreProvFunc, hStoreProvCtorArg = hStoreProv, dwStoreProvFlags = dwStoreProvFlags, hStoreProvFuncAddr2CtorArg = hStoreProvFuncAddr2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertStoreProvInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.cStoreProvFunc != other.cStoreProvFunc) return false
        if (this.rgpvStoreProvFunc != other.rgpvStoreProvFunc) return false
        if (this.hStoreProv != other.hStoreProv) return false
        if (this.dwStoreProvFlags != other.dwStoreProvFlags) return false
        if (this.hStoreProvFuncAddr2 != other.hStoreProvFuncAddr2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.cStoreProvFunc.hashCode()
        result = 31 * result + this.rgpvStoreProvFunc.hashCode()
        result = 31 * result + this.hStoreProv.hashCode()
        result = 31 * result + this.dwStoreProvFlags.hashCode()
        result = 31 * result + this.hStoreProvFuncAddr2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertStoreProvInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertStoreProvInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CertStoreProvInfo =
                    CertStoreProvInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CertStoreProvInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cStoreProvFunc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr + 8L, value.rgpvStoreProvFunc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.hStoreProv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwStoreProvFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.hStoreProvFuncAddr2)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            cStoreProvFunc: UInt = 0u,
            rgpvStoreProvFunc: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            hStoreProv: Hcertstoreprov = MutPtr(0L),
            dwStoreProvFlags: CertStoreProvFlags = 0u,
            hStoreProvFuncAddr2: MutPtr<CVoid> = MutPtr(0L),
        ): CertStoreProvInfo =
            CertStoreProvInfo(
                cbSize = cbSize,
                cStoreProvFunc = cStoreProvFunc,
                rgpvStoreProvFuncCtorArg = rgpvStoreProvFunc,
                hStoreProvCtorArg = hStoreProv,
                dwStoreProvFlags = dwStoreProvFlags,
                hStoreProvFuncAddr2CtorArg = hStoreProvFuncAddr2,
            )
    }
}

public data class CertStrongSignPara(
    public var cbSize: UInt = 0u,
    public var dwInfoChoice: UInt = 0u,
    public var anonymous: CertStrongSignPara0 = CertStrongSignPara0(),
)

public class CertStrongSignPara0 internal constructor(
    pvInfoCtorArg: MutPtr<CVoid>,
    pSerializedInfoCtorArg: MutPtr<CertStrongSignSerializedInfo>,
    pszOIDCtorArg: Pstr,
) {
    public var pvInfo: MutPtr<CVoid> = pvInfoCtorArg
        internal set

    public var pSerializedInfo: MutPtr<CertStrongSignSerializedInfo> = pSerializedInfoCtorArg
        internal set

    public var pszOID: Pstr = pszOIDCtorArg
        internal set

    public constructor() : this(
        pvInfoCtorArg = MutPtr(0L),
        pSerializedInfoCtorArg = MutPtr(0L),
        pszOIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.pvInfo

    public operator fun component2(): MutPtr<CertStrongSignSerializedInfo> = this.pSerializedInfo

    public operator fun component3(): Pstr = this.pszOID

    public fun copy(pvInfo: MutPtr<CVoid> = this.pvInfo, pSerializedInfo: MutPtr<CertStrongSignSerializedInfo> = this.pSerializedInfo, pszOID: Pstr = this.pszOID): CertStrongSignPara0 = CertStrongSignPara0(pvInfoCtorArg = pvInfo, pSerializedInfoCtorArg = pSerializedInfo, pszOIDCtorArg = pszOID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertStrongSignPara0) return false
        if (this.pvInfo != other.pvInfo) return false
        if (this.pSerializedInfo != other.pSerializedInfo) return false
        if (this.pszOID != other.pszOID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvInfo.hashCode()
        result = 31 * result + this.pSerializedInfo.hashCode()
        result = 31 * result + this.pszOID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pvInfo: MutPtr<CVoid> = MutPtr(0L),
            pSerializedInfo: MutPtr<CertStrongSignSerializedInfo> = MutPtr(0L),
            pszOID: Pstr = MutPtr(0L),
        ): CertStrongSignPara0 =
            CertStrongSignPara0(
                pvInfoCtorArg = pvInfo,
                pSerializedInfoCtorArg = pSerializedInfo,
                pszOIDCtorArg = pszOID,
            )
    }
}

public class CertStrongSignSerializedInfo internal constructor(
    public var dwFlags: CertStrongSignFlags,
    pwszCNGSignHashAlgidsCtorArg: Pwstr,
    pwszCNGPubKeyMinBitLengthsCtorArg: Pwstr,
) {
    public var pwszCNGSignHashAlgids: Pwstr = pwszCNGSignHashAlgidsCtorArg
        internal set

    public var pwszCNGPubKeyMinBitLengths: Pwstr = pwszCNGPubKeyMinBitLengthsCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        pwszCNGSignHashAlgidsCtorArg = MutPtr(0L),
        pwszCNGPubKeyMinBitLengthsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CertStrongSignFlags = this.dwFlags

    public operator fun component2(): Pwstr = this.pwszCNGSignHashAlgids

    public operator fun component3(): Pwstr = this.pwszCNGPubKeyMinBitLengths

    public fun copy(dwFlags: CertStrongSignFlags = this.dwFlags, pwszCNGSignHashAlgids: Pwstr = this.pwszCNGSignHashAlgids, pwszCNGPubKeyMinBitLengths: Pwstr = this.pwszCNGPubKeyMinBitLengths): CertStrongSignSerializedInfo = CertStrongSignSerializedInfo(dwFlags = dwFlags, pwszCNGSignHashAlgidsCtorArg = pwszCNGSignHashAlgids, pwszCNGPubKeyMinBitLengthsCtorArg = pwszCNGPubKeyMinBitLengths)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertStrongSignSerializedInfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pwszCNGSignHashAlgids != other.pwszCNGSignHashAlgids) return false
        if (this.pwszCNGPubKeyMinBitLengths != other.pwszCNGPubKeyMinBitLengths) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.pwszCNGSignHashAlgids.hashCode()
        result = 31 * result + this.pwszCNGPubKeyMinBitLengths.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: CertStrongSignFlags = 0u,
            pwszCNGSignHashAlgids: Pwstr = MutPtr(0L),
            pwszCNGPubKeyMinBitLengths: Pwstr = MutPtr(0L),
        ): CertStrongSignSerializedInfo =
            CertStrongSignSerializedInfo(
                dwFlags = dwFlags,
                pwszCNGSignHashAlgidsCtorArg = pwszCNGSignHashAlgids,
                pwszCNGPubKeyMinBitLengthsCtorArg = pwszCNGPubKeyMinBitLengths,
            )
    }
}

public data class CertSupportedAlgorithmInfo(
    public var algorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var intendedKeyUsage: CryptBitBlob = CryptBitBlob(),
    public var intendedCertPolicies: CertPoliciesInfo = CertPoliciesInfo(),
)

public data class CertSystemStoreInfo(
    public var cbSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertSystemStoreInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertSystemStoreInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CertSystemStoreInfo =
                    CertSystemStoreInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CertSystemStoreInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                }
            }
    }
}

public data class CertSystemStoreRelocatePara(
    public var anonymous1: CertSystemStoreRelocatePara0 = CertSystemStoreRelocatePara0(),
    public var anonymous2: CertSystemStoreRelocatePara1 = CertSystemStoreRelocatePara1(),
)

public class CertSystemStoreRelocatePara0 internal constructor(
    hKeyBaseCtorArg: Hkey,
    pvBaseCtorArg: MutPtr<CVoid>,
) {
    public var hKeyBase: Hkey = hKeyBaseCtorArg
        internal set

    public var pvBase: MutPtr<CVoid> = pvBaseCtorArg
        internal set

    public constructor() : this(
        hKeyBaseCtorArg = MutPtr(0L),
        pvBaseCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hkey = this.hKeyBase

    public operator fun component2(): MutPtr<CVoid> = this.pvBase

    public fun copy(hKeyBase: Hkey = this.hKeyBase, pvBase: MutPtr<CVoid> = this.pvBase): CertSystemStoreRelocatePara0 = CertSystemStoreRelocatePara0(hKeyBaseCtorArg = hKeyBase, pvBaseCtorArg = pvBase)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertSystemStoreRelocatePara0) return false
        if (this.hKeyBase != other.hKeyBase) return false
        if (this.pvBase != other.pvBase) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hKeyBase.hashCode()
        result = 31 * result + this.pvBase.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hKeyBase: Hkey = MutPtr(0L),
            pvBase: MutPtr<CVoid> = MutPtr(0L),
        ): CertSystemStoreRelocatePara0 =
            CertSystemStoreRelocatePara0(
                hKeyBaseCtorArg = hKeyBase,
                pvBaseCtorArg = pvBase,
            )
    }
}

public class CertSystemStoreRelocatePara1 internal constructor(
    pvSystemStoreCtorArg: MutPtr<CVoid>,
    pszSystemStoreCtorArg: Pcstr,
    pwszSystemStoreCtorArg: Pcwstr,
) {
    public var pvSystemStore: MutPtr<CVoid> = pvSystemStoreCtorArg
        internal set

    public var pszSystemStore: Pcstr = pszSystemStoreCtorArg
        internal set

    public var pwszSystemStore: Pcwstr = pwszSystemStoreCtorArg
        internal set

    public constructor() : this(
        pvSystemStoreCtorArg = MutPtr(0L),
        pszSystemStoreCtorArg = ConstPtr(0L),
        pwszSystemStoreCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.pvSystemStore

    public operator fun component2(): Pcstr = this.pszSystemStore

    public operator fun component3(): Pcwstr = this.pwszSystemStore

    public fun copy(pvSystemStore: MutPtr<CVoid> = this.pvSystemStore, pszSystemStore: Pcstr = this.pszSystemStore, pwszSystemStore: Pcwstr = this.pwszSystemStore): CertSystemStoreRelocatePara1 = CertSystemStoreRelocatePara1(pvSystemStoreCtorArg = pvSystemStore, pszSystemStoreCtorArg = pszSystemStore, pwszSystemStoreCtorArg = pwszSystemStore)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertSystemStoreRelocatePara1) return false
        if (this.pvSystemStore != other.pvSystemStore) return false
        if (this.pszSystemStore != other.pszSystemStore) return false
        if (this.pwszSystemStore != other.pwszSystemStore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvSystemStore.hashCode()
        result = 31 * result + this.pszSystemStore.hashCode()
        result = 31 * result + this.pwszSystemStore.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pvSystemStore: MutPtr<CVoid> = MutPtr(0L),
            pszSystemStore: Pcstr = ConstPtr(0L),
            pwszSystemStore: Pcwstr = ConstPtr(0L),
        ): CertSystemStoreRelocatePara1 =
            CertSystemStoreRelocatePara1(
                pvSystemStoreCtorArg = pvSystemStore,
                pszSystemStoreCtorArg = pszSystemStore,
                pwszSystemStoreCtorArg = pwszSystemStore,
            )
    }
}

public class CertTemplateExt internal constructor(
    pszObjIdCtorArg: Pstr,
    public var dwMajorVersion: UInt,
    public var fMinorVersion: Bool,
    public var dwMinorVersion: UInt,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        dwMajorVersion = 0u,
        fMinorVersion = 0,
        dwMinorVersion = 0u,
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): UInt = this.dwMajorVersion

    public operator fun component3(): Bool = this.fMinorVersion

    public operator fun component4(): UInt = this.dwMinorVersion

    public fun copy(pszObjId: Pstr = this.pszObjId, dwMajorVersion: UInt = this.dwMajorVersion, fMinorVersion: Bool = this.fMinorVersion, dwMinorVersion: UInt = this.dwMinorVersion): CertTemplateExt = CertTemplateExt(pszObjIdCtorArg = pszObjId, dwMajorVersion = dwMajorVersion, fMinorVersion = fMinorVersion, dwMinorVersion = dwMinorVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertTemplateExt) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.dwMajorVersion != other.dwMajorVersion) return false
        if (this.fMinorVersion != other.fMinorVersion) return false
        if (this.dwMinorVersion != other.dwMinorVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.dwMajorVersion.hashCode()
        result = 31 * result + this.fMinorVersion.hashCode()
        result = 31 * result + this.dwMinorVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            dwMajorVersion: UInt = 0u,
            fMinorVersion: Bool = 0,
            dwMinorVersion: UInt = 0u,
        ): CertTemplateExt =
            CertTemplateExt(
                pszObjIdCtorArg = pszObjId,
                dwMajorVersion = dwMajorVersion,
                fMinorVersion = fMinorVersion,
                dwMinorVersion = dwMinorVersion,
            )
    }
}

public class CertTpmSpecificationInfo internal constructor(
    pwszFamilyCtorArg: Pwstr,
    public var dwLevel: UInt,
    public var dwRevision: UInt,
) {
    public var pwszFamily: Pwstr = pwszFamilyCtorArg
        internal set

    public constructor() : this(
        pwszFamilyCtorArg = MutPtr(0L),
        dwLevel = 0u,
        dwRevision = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszFamily

    public operator fun component2(): UInt = this.dwLevel

    public operator fun component3(): UInt = this.dwRevision

    public fun copy(pwszFamily: Pwstr = this.pwszFamily, dwLevel: UInt = this.dwLevel, dwRevision: UInt = this.dwRevision): CertTpmSpecificationInfo = CertTpmSpecificationInfo(pwszFamilyCtorArg = pwszFamily, dwLevel = dwLevel, dwRevision = dwRevision)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertTpmSpecificationInfo) return false
        if (this.pwszFamily != other.pwszFamily) return false
        if (this.dwLevel != other.dwLevel) return false
        if (this.dwRevision != other.dwRevision) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszFamily.hashCode()
        result = 31 * result + this.dwLevel.hashCode()
        result = 31 * result + this.dwRevision.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszFamily: Pwstr = MutPtr(0L),
            dwLevel: UInt = 0u,
            dwRevision: UInt = 0u,
        ): CertTpmSpecificationInfo =
            CertTpmSpecificationInfo(
                pwszFamilyCtorArg = pwszFamily,
                dwLevel = dwLevel,
                dwRevision = dwRevision,
            )
    }
}

public class CertTrustListInfo internal constructor(
    public var cbSize: UInt,
    pCtlEntryCtorArg: MutPtr<CtlEntry>,
    pCtlContextCtorArg: MutPtr<CtlContext>,
) {
    public var pCtlEntry: MutPtr<CtlEntry> = pCtlEntryCtorArg
        internal set

    public var pCtlContext: MutPtr<CtlContext> = pCtlContextCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pCtlEntryCtorArg = MutPtr(0L),
        pCtlContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<CtlEntry> = this.pCtlEntry

    public operator fun component3(): MutPtr<CtlContext> = this.pCtlContext

    public fun copy(cbSize: UInt = this.cbSize, pCtlEntry: MutPtr<CtlEntry> = this.pCtlEntry, pCtlContext: MutPtr<CtlContext> = this.pCtlContext): CertTrustListInfo = CertTrustListInfo(cbSize = cbSize, pCtlEntryCtorArg = pCtlEntry, pCtlContextCtorArg = pCtlContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertTrustListInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pCtlEntry != other.pCtlEntry) return false
        if (this.pCtlContext != other.pCtlContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pCtlEntry.hashCode()
        result = 31 * result + this.pCtlContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertTrustListInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertTrustListInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CertTrustListInfo =
                    CertTrustListInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CtlEntry>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CtlContext>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CertTrustListInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CtlEntry>(64)
                    ).writeNative(addr + 8L, value.pCtlEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CtlContext>(64)
                    ).writeNative(addr + 16L, value.pCtlContext)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pCtlEntry: MutPtr<CtlEntry> = MutPtr(0L),
            pCtlContext: MutPtr<CtlContext> = MutPtr(0L),
        ): CertTrustListInfo =
            CertTrustListInfo(
                cbSize = cbSize,
                pCtlEntryCtorArg = pCtlEntry,
                pCtlContextCtorArg = pCtlContext,
            )
    }
}

public data class CertTrustStatus(
    public var dwErrorStatus: UInt = 0u,
    public var dwInfoStatus: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertTrustStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertTrustStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CertTrustStatus =
                    CertTrustStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CertTrustStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwErrorStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwInfoStatus)
                }
            }
    }
}

public data class CertUsageMatch(
    public var dwType: UInt = 0u,
    public var usage: CtlUsage = CtlUsage(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertUsageMatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertUsageMatch> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CertUsageMatch =
                    CertUsageMatch(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CtlUsage.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CertUsageMatch) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (CtlUsage.typeLayout()).writeNative(addr + 8L, value.usage)
                }
            }
    }
}

public class CertX942DhParameters internal constructor(
    public var p: CryptIntegerBlob,
    public var g: CryptIntegerBlob,
    public var q: CryptIntegerBlob,
    public var j: CryptIntegerBlob,
    pValidationParamsCtorArg: MutPtr<CertX942DhValidationParams>,
) {
    public var pValidationParams: MutPtr<CertX942DhValidationParams> = pValidationParamsCtorArg
        internal set

    public constructor() : this(
        p = CryptIntegerBlob(),
        g = CryptIntegerBlob(),
        q = CryptIntegerBlob(),
        j = CryptIntegerBlob(),
        pValidationParamsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptIntegerBlob = this.p

    public operator fun component2(): CryptIntegerBlob = this.g

    public operator fun component3(): CryptIntegerBlob = this.q

    public operator fun component4(): CryptIntegerBlob = this.j

    public operator fun component5(): MutPtr<CertX942DhValidationParams> = this.pValidationParams

    public fun copy(p: CryptIntegerBlob = this.p, g: CryptIntegerBlob = this.g, q: CryptIntegerBlob = this.q, j: CryptIntegerBlob = this.j, pValidationParams: MutPtr<CertX942DhValidationParams> = this.pValidationParams): CertX942DhParameters = CertX942DhParameters(p = p, g = g, q = q, j = j, pValidationParamsCtorArg = pValidationParams)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertX942DhParameters) return false
        if (this.p != other.p) return false
        if (this.g != other.g) return false
        if (this.q != other.q) return false
        if (this.j != other.j) return false
        if (this.pValidationParams != other.pValidationParams) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.p.hashCode()
        result = 31 * result + this.g.hashCode()
        result = 31 * result + this.q.hashCode()
        result = 31 * result + this.j.hashCode()
        result = 31 * result + this.pValidationParams.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertX942DhParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertX942DhParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): CertX942DhParameters =
                    CertX942DhParameters(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 16L),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 32L),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertX942DhValidationParams>(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: CertX942DhParameters) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.p)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 16L, value.g)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 32L, value.q)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 48L, value.j)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertX942DhValidationParams>(64)
                    ).writeNative(addr + 64L, value.pValidationParams)
                }
            }

        public operator fun invoke(
            p: CryptIntegerBlob = CryptIntegerBlob(),
            g: CryptIntegerBlob = CryptIntegerBlob(),
            q: CryptIntegerBlob = CryptIntegerBlob(),
            j: CryptIntegerBlob = CryptIntegerBlob(),
            pValidationParams: MutPtr<CertX942DhValidationParams> = MutPtr(0L),
        ): CertX942DhParameters =
            CertX942DhParameters(
                p = p,
                g = g,
                q = q,
                j = j,
                pValidationParamsCtorArg = pValidationParams,
            )
    }
}

public data class CertX942DhValidationParams(
    public var seed: CryptBitBlob = CryptBitBlob(),
    public var pgenCounter: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertX942DhValidationParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertX942DhValidationParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CertX942DhValidationParams =
                    CertX942DhValidationParams(
                        (CryptBitBlob.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CertX942DhValidationParams) {
                    (CryptBitBlob.typeLayout()).writeNative(addr, value.seed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.pgenCounter)
                }
            }
    }
}

public class Claimlist internal constructor(
    public var count: UInt,
    claimsCtorArg: ConstPtr<Pcwstr>,
) {
    public var claims: ConstPtr<Pcwstr> = claimsCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        claimsCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): ConstPtr<Pcwstr> = this.claims

    public fun copy(count: UInt = this.count, claims: ConstPtr<Pcwstr> = this.claims): Claimlist = Claimlist(count = count, claimsCtorArg = claims)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Claimlist) return false
        if (this.count != other.count) return false
        if (this.claims != other.claims) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.claims.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Claimlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Claimlist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Claimlist =
                    Claimlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Pcwstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Claimlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Pcwstr>(64)
                    ).writeNative(addr + 8L, value.claims)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            claims: ConstPtr<Pcwstr> = ConstPtr(0L),
        ): Claimlist =
            Claimlist(
                count = count,
                claimsCtorArg = claims,
            )
    }
}

public class ClmdPivCertData internal constructor(
    public var dwVersion: UInt,
    public var dwCertTag: UInt,
    pbCertCtorArg: MutPtr<UByte>,
    public var cbCert: UInt,
) {
    public var pbCert: MutPtr<UByte> = pbCertCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwCertTag = 0u,
        pbCertCtorArg = MutPtr(0L),
        cbCert = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.dwCertTag

    public operator fun component3(): MutPtr<UByte> = this.pbCert

    public operator fun component4(): UInt = this.cbCert

    public fun copy(dwVersion: UInt = this.dwVersion, dwCertTag: UInt = this.dwCertTag, pbCert: MutPtr<UByte> = this.pbCert, cbCert: UInt = this.cbCert): ClmdPivCertData = ClmdPivCertData(dwVersion = dwVersion, dwCertTag = dwCertTag, pbCertCtorArg = pbCert, cbCert = cbCert)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClmdPivCertData) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwCertTag != other.dwCertTag) return false
        if (this.pbCert != other.pbCert) return false
        if (this.cbCert != other.cbCert) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwCertTag.hashCode()
        result = 31 * result + this.pbCert.hashCode()
        result = 31 * result + this.cbCert.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClmdPivCertData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClmdPivCertData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ClmdPivCertData =
                    ClmdPivCertData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ClmdPivCertData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCertTag)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbCert)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbCert)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwCertTag: UInt = 0u,
            pbCert: MutPtr<UByte> = MutPtr(0L),
            cbCert: UInt = 0u,
        ): ClmdPivCertData =
            ClmdPivCertData(
                dwVersion = dwVersion,
                dwCertTag = dwCertTag,
                pbCertCtorArg = pbCert,
                cbCert = cbCert,
            )
    }
}

public class ClmdPivGenerateAsymmetricKey internal constructor(
    public var dwVersion: UInt,
    public var bAlgorithmId: UByte,
    public var bKeyId: UByte,
    pbKeyCtorArg: MutPtr<UByte>,
    public var cbKey: UInt,
) {
    public var pbKey: MutPtr<UByte> = pbKeyCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        bAlgorithmId = 0u,
        bKeyId = 0u,
        pbKeyCtorArg = MutPtr(0L),
        cbKey = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UByte = this.bAlgorithmId

    public operator fun component3(): UByte = this.bKeyId

    public operator fun component4(): MutPtr<UByte> = this.pbKey

    public operator fun component5(): UInt = this.cbKey

    public fun copy(dwVersion: UInt = this.dwVersion, bAlgorithmId: UByte = this.bAlgorithmId, bKeyId: UByte = this.bKeyId, pbKey: MutPtr<UByte> = this.pbKey, cbKey: UInt = this.cbKey): ClmdPivGenerateAsymmetricKey = ClmdPivGenerateAsymmetricKey(dwVersion = dwVersion, bAlgorithmId = bAlgorithmId, bKeyId = bKeyId, pbKeyCtorArg = pbKey, cbKey = cbKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClmdPivGenerateAsymmetricKey) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.bAlgorithmId != other.bAlgorithmId) return false
        if (this.bKeyId != other.bKeyId) return false
        if (this.pbKey != other.pbKey) return false
        if (this.cbKey != other.cbKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.bAlgorithmId.hashCode()
        result = 31 * result + this.bKeyId.hashCode()
        result = 31 * result + this.pbKey.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClmdPivGenerateAsymmetricKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClmdPivGenerateAsymmetricKey> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ClmdPivGenerateAsymmetricKey =
                    ClmdPivGenerateAsymmetricKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ClmdPivGenerateAsymmetricKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bAlgorithmId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bKeyId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbKey)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            bAlgorithmId: UByte = 0u,
            bKeyId: UByte = 0u,
            pbKey: MutPtr<UByte> = MutPtr(0L),
            cbKey: UInt = 0u,
        ): ClmdPivGenerateAsymmetricKey =
            ClmdPivGenerateAsymmetricKey(
                dwVersion = dwVersion,
                bAlgorithmId = bAlgorithmId,
                bKeyId = bKeyId,
                pbKeyCtorArg = pbKey,
                cbKey = cbKey,
            )
    }
}

public class ClmdPivPublicKeyData internal constructor(
    public var dwVersion: UInt,
    public var bKeyId: UByte,
    pbPublicKeyCtorArg: MutPtr<UByte>,
    public var cbPublicKey: UInt,
) {
    public var pbPublicKey: MutPtr<UByte> = pbPublicKeyCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        bKeyId = 0u,
        pbPublicKeyCtorArg = MutPtr(0L),
        cbPublicKey = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UByte = this.bKeyId

    public operator fun component3(): MutPtr<UByte> = this.pbPublicKey

    public operator fun component4(): UInt = this.cbPublicKey

    public fun copy(dwVersion: UInt = this.dwVersion, bKeyId: UByte = this.bKeyId, pbPublicKey: MutPtr<UByte> = this.pbPublicKey, cbPublicKey: UInt = this.cbPublicKey): ClmdPivPublicKeyData = ClmdPivPublicKeyData(dwVersion = dwVersion, bKeyId = bKeyId, pbPublicKeyCtorArg = pbPublicKey, cbPublicKey = cbPublicKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClmdPivPublicKeyData) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.bKeyId != other.bKeyId) return false
        if (this.pbPublicKey != other.pbPublicKey) return false
        if (this.cbPublicKey != other.cbPublicKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.bKeyId.hashCode()
        result = 31 * result + this.pbPublicKey.hashCode()
        result = 31 * result + this.cbPublicKey.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClmdPivPublicKeyData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClmdPivPublicKeyData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ClmdPivPublicKeyData =
                    ClmdPivPublicKeyData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ClmdPivPublicKeyData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bKeyId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbPublicKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbPublicKey)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            bKeyId: UByte = 0u,
            pbPublicKey: MutPtr<UByte> = MutPtr(0L),
            cbPublicKey: UInt = 0u,
        ): ClmdPivPublicKeyData =
            ClmdPivPublicKeyData(
                dwVersion = dwVersion,
                bKeyId = bKeyId,
                pbPublicKeyCtorArg = pbPublicKey,
                cbPublicKey = cbPublicKey,
            )
    }
}

public class CmcAddAttributesInfo internal constructor(
    public var dwCmcDataReference: UInt,
    public var cCertReference: UInt,
    rgdwCertReferenceCtorArg: MutPtr<UInt>,
    public var cAttribute: UInt,
    rgAttributeCtorArg: MutPtr<CryptAttribute>,
) {
    public var rgdwCertReference: MutPtr<UInt> = rgdwCertReferenceCtorArg
        internal set

    public var rgAttribute: MutPtr<CryptAttribute> = rgAttributeCtorArg
        internal set

    public constructor() : this(
        dwCmcDataReference = 0u,
        cCertReference = 0u,
        rgdwCertReferenceCtorArg = MutPtr(0L),
        cAttribute = 0u,
        rgAttributeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwCmcDataReference

    public operator fun component2(): UInt = this.cCertReference

    public operator fun component3(): MutPtr<UInt> = this.rgdwCertReference

    public operator fun component4(): UInt = this.cAttribute

    public operator fun component5(): MutPtr<CryptAttribute> = this.rgAttribute

    public fun copy(dwCmcDataReference: UInt = this.dwCmcDataReference, cCertReference: UInt = this.cCertReference, rgdwCertReference: MutPtr<UInt> = this.rgdwCertReference, cAttribute: UInt = this.cAttribute, rgAttribute: MutPtr<CryptAttribute> = this.rgAttribute): CmcAddAttributesInfo = CmcAddAttributesInfo(dwCmcDataReference = dwCmcDataReference, cCertReference = cCertReference, rgdwCertReferenceCtorArg = rgdwCertReference, cAttribute = cAttribute, rgAttributeCtorArg = rgAttribute)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmcAddAttributesInfo) return false
        if (this.dwCmcDataReference != other.dwCmcDataReference) return false
        if (this.cCertReference != other.cCertReference) return false
        if (this.rgdwCertReference != other.rgdwCertReference) return false
        if (this.cAttribute != other.cAttribute) return false
        if (this.rgAttribute != other.rgAttribute) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCmcDataReference.hashCode()
        result = 31 * result + this.cCertReference.hashCode()
        result = 31 * result + this.rgdwCertReference.hashCode()
        result = 31 * result + this.cAttribute.hashCode()
        result = 31 * result + this.rgAttribute.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcAddAttributesInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcAddAttributesInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CmcAddAttributesInfo =
                    CmcAddAttributesInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CryptAttribute>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CmcAddAttributesInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCmcDataReference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cCertReference)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.rgdwCertReference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cAttribute)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CryptAttribute>(64)
                    ).writeNative(addr + 24L, value.rgAttribute)
                }
            }

        public operator fun invoke(
            dwCmcDataReference: UInt = 0u,
            cCertReference: UInt = 0u,
            rgdwCertReference: MutPtr<UInt> = MutPtr(0L),
            cAttribute: UInt = 0u,
            rgAttribute: MutPtr<CryptAttribute> = MutPtr(0L),
        ): CmcAddAttributesInfo =
            CmcAddAttributesInfo(
                dwCmcDataReference = dwCmcDataReference,
                cCertReference = cCertReference,
                rgdwCertReferenceCtorArg = rgdwCertReference,
                cAttribute = cAttribute,
                rgAttributeCtorArg = rgAttribute,
            )
    }
}

public class CmcAddExtensionsInfo internal constructor(
    public var dwCmcDataReference: UInt,
    public var cCertReference: UInt,
    rgdwCertReferenceCtorArg: MutPtr<UInt>,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr<CertExtension>,
) {
    public var rgdwCertReference: MutPtr<UInt> = rgdwCertReferenceCtorArg
        internal set

    public var rgExtension: MutPtr<CertExtension> = rgExtensionCtorArg
        internal set

    public constructor() : this(
        dwCmcDataReference = 0u,
        cCertReference = 0u,
        rgdwCertReferenceCtorArg = MutPtr(0L),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwCmcDataReference

    public operator fun component2(): UInt = this.cCertReference

    public operator fun component3(): MutPtr<UInt> = this.rgdwCertReference

    public operator fun component4(): UInt = this.cExtension

    public operator fun component5(): MutPtr<CertExtension> = this.rgExtension

    public fun copy(dwCmcDataReference: UInt = this.dwCmcDataReference, cCertReference: UInt = this.cCertReference, rgdwCertReference: MutPtr<UInt> = this.rgdwCertReference, cExtension: UInt = this.cExtension, rgExtension: MutPtr<CertExtension> = this.rgExtension): CmcAddExtensionsInfo = CmcAddExtensionsInfo(dwCmcDataReference = dwCmcDataReference, cCertReference = cCertReference, rgdwCertReferenceCtorArg = rgdwCertReference, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmcAddExtensionsInfo) return false
        if (this.dwCmcDataReference != other.dwCmcDataReference) return false
        if (this.cCertReference != other.cCertReference) return false
        if (this.rgdwCertReference != other.rgdwCertReference) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCmcDataReference.hashCode()
        result = 31 * result + this.cCertReference.hashCode()
        result = 31 * result + this.rgdwCertReference.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcAddExtensionsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcAddExtensionsInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CmcAddExtensionsInfo =
                    CmcAddExtensionsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertExtension>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CmcAddExtensionsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCmcDataReference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cCertReference)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.rgdwCertReference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cExtension)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertExtension>(64)
                    ).writeNative(addr + 24L, value.rgExtension)
                }
            }

        public operator fun invoke(
            dwCmcDataReference: UInt = 0u,
            cCertReference: UInt = 0u,
            rgdwCertReference: MutPtr<UInt> = MutPtr(0L),
            cExtension: UInt = 0u,
            rgExtension: MutPtr<CertExtension> = MutPtr(0L),
        ): CmcAddExtensionsInfo =
            CmcAddExtensionsInfo(
                dwCmcDataReference = dwCmcDataReference,
                cCertReference = cCertReference,
                rgdwCertReferenceCtorArg = rgdwCertReference,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public class CmcDataInfo internal constructor(
    public var cTaggedAttribute: UInt,
    rgTaggedAttributeCtorArg: MutPtr<CmcTaggedAttribute>,
    public var cTaggedRequest: UInt,
    rgTaggedRequestCtorArg: MutPtr<CmcTaggedRequest>,
    public var cTaggedContentInfo: UInt,
    rgTaggedContentInfoCtorArg: MutPtr<CmcTaggedContentInfo>,
    public var cTaggedOtherMsg: UInt,
    rgTaggedOtherMsgCtorArg: MutPtr<CmcTaggedOtherMsg>,
) {
    public var rgTaggedAttribute: MutPtr<CmcTaggedAttribute> = rgTaggedAttributeCtorArg
        internal set

    public var rgTaggedRequest: MutPtr<CmcTaggedRequest> = rgTaggedRequestCtorArg
        internal set

    public var rgTaggedContentInfo: MutPtr<CmcTaggedContentInfo> = rgTaggedContentInfoCtorArg
        internal set

    public var rgTaggedOtherMsg: MutPtr<CmcTaggedOtherMsg> = rgTaggedOtherMsgCtorArg
        internal set

    public constructor() : this(
        cTaggedAttribute = 0u,
        rgTaggedAttributeCtorArg = MutPtr(0L),
        cTaggedRequest = 0u,
        rgTaggedRequestCtorArg = MutPtr(0L),
        cTaggedContentInfo = 0u,
        rgTaggedContentInfoCtorArg = MutPtr(0L),
        cTaggedOtherMsg = 0u,
        rgTaggedOtherMsgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cTaggedAttribute

    public operator fun component2(): MutPtr<CmcTaggedAttribute> = this.rgTaggedAttribute

    public operator fun component3(): UInt = this.cTaggedRequest

    public operator fun component4(): MutPtr<CmcTaggedRequest> = this.rgTaggedRequest

    public operator fun component5(): UInt = this.cTaggedContentInfo

    public operator fun component6(): MutPtr<CmcTaggedContentInfo> = this.rgTaggedContentInfo

    public operator fun component7(): UInt = this.cTaggedOtherMsg

    public operator fun component8(): MutPtr<CmcTaggedOtherMsg> = this.rgTaggedOtherMsg

    public fun copy(cTaggedAttribute: UInt = this.cTaggedAttribute, rgTaggedAttribute: MutPtr<CmcTaggedAttribute> = this.rgTaggedAttribute, cTaggedRequest: UInt = this.cTaggedRequest, rgTaggedRequest: MutPtr<CmcTaggedRequest> = this.rgTaggedRequest, cTaggedContentInfo: UInt = this.cTaggedContentInfo, rgTaggedContentInfo: MutPtr<CmcTaggedContentInfo> = this.rgTaggedContentInfo, cTaggedOtherMsg: UInt = this.cTaggedOtherMsg, rgTaggedOtherMsg: MutPtr<CmcTaggedOtherMsg> = this.rgTaggedOtherMsg): CmcDataInfo = CmcDataInfo(cTaggedAttribute = cTaggedAttribute, rgTaggedAttributeCtorArg = rgTaggedAttribute, cTaggedRequest = cTaggedRequest, rgTaggedRequestCtorArg = rgTaggedRequest, cTaggedContentInfo = cTaggedContentInfo, rgTaggedContentInfoCtorArg = rgTaggedContentInfo, cTaggedOtherMsg = cTaggedOtherMsg, rgTaggedOtherMsgCtorArg = rgTaggedOtherMsg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmcDataInfo) return false
        if (this.cTaggedAttribute != other.cTaggedAttribute) return false
        if (this.rgTaggedAttribute != other.rgTaggedAttribute) return false
        if (this.cTaggedRequest != other.cTaggedRequest) return false
        if (this.rgTaggedRequest != other.rgTaggedRequest) return false
        if (this.cTaggedContentInfo != other.cTaggedContentInfo) return false
        if (this.rgTaggedContentInfo != other.rgTaggedContentInfo) return false
        if (this.cTaggedOtherMsg != other.cTaggedOtherMsg) return false
        if (this.rgTaggedOtherMsg != other.rgTaggedOtherMsg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cTaggedAttribute.hashCode()
        result = 31 * result + this.rgTaggedAttribute.hashCode()
        result = 31 * result + this.cTaggedRequest.hashCode()
        result = 31 * result + this.rgTaggedRequest.hashCode()
        result = 31 * result + this.cTaggedContentInfo.hashCode()
        result = 31 * result + this.rgTaggedContentInfo.hashCode()
        result = 31 * result + this.cTaggedOtherMsg.hashCode()
        result = 31 * result + this.rgTaggedOtherMsg.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcDataInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcDataInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): CmcDataInfo =
                    CmcDataInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmcTaggedAttribute>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmcTaggedRequest>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmcTaggedContentInfo>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmcTaggedOtherMsg>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: CmcDataInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cTaggedAttribute)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmcTaggedAttribute>(64)
                    ).writeNative(addr + 8L, value.rgTaggedAttribute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cTaggedRequest)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmcTaggedRequest>(64)
                    ).writeNative(addr + 24L, value.rgTaggedRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cTaggedContentInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmcTaggedContentInfo>(64)
                    ).writeNative(addr + 40L, value.rgTaggedContentInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cTaggedOtherMsg)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmcTaggedOtherMsg>(64)
                    ).writeNative(addr + 56L, value.rgTaggedOtherMsg)
                }
            }

        public operator fun invoke(
            cTaggedAttribute: UInt = 0u,
            rgTaggedAttribute: MutPtr<CmcTaggedAttribute> = MutPtr(0L),
            cTaggedRequest: UInt = 0u,
            rgTaggedRequest: MutPtr<CmcTaggedRequest> = MutPtr(0L),
            cTaggedContentInfo: UInt = 0u,
            rgTaggedContentInfo: MutPtr<CmcTaggedContentInfo> = MutPtr(0L),
            cTaggedOtherMsg: UInt = 0u,
            rgTaggedOtherMsg: MutPtr<CmcTaggedOtherMsg> = MutPtr(0L),
        ): CmcDataInfo =
            CmcDataInfo(
                cTaggedAttribute = cTaggedAttribute,
                rgTaggedAttributeCtorArg = rgTaggedAttribute,
                cTaggedRequest = cTaggedRequest,
                rgTaggedRequestCtorArg = rgTaggedRequest,
                cTaggedContentInfo = cTaggedContentInfo,
                rgTaggedContentInfoCtorArg = rgTaggedContentInfo,
                cTaggedOtherMsg = cTaggedOtherMsg,
                rgTaggedOtherMsgCtorArg = rgTaggedOtherMsg,
            )
    }
}

public data class CmcPendInfo(
    public var pendToken: CryptIntegerBlob = CryptIntegerBlob(),
    public var pendTime: Filetime = Filetime(),
)

public class CmcResponseInfo internal constructor(
    public var cTaggedAttribute: UInt,
    rgTaggedAttributeCtorArg: MutPtr<CmcTaggedAttribute>,
    public var cTaggedContentInfo: UInt,
    rgTaggedContentInfoCtorArg: MutPtr<CmcTaggedContentInfo>,
    public var cTaggedOtherMsg: UInt,
    rgTaggedOtherMsgCtorArg: MutPtr<CmcTaggedOtherMsg>,
) {
    public var rgTaggedAttribute: MutPtr<CmcTaggedAttribute> = rgTaggedAttributeCtorArg
        internal set

    public var rgTaggedContentInfo: MutPtr<CmcTaggedContentInfo> = rgTaggedContentInfoCtorArg
        internal set

    public var rgTaggedOtherMsg: MutPtr<CmcTaggedOtherMsg> = rgTaggedOtherMsgCtorArg
        internal set

    public constructor() : this(
        cTaggedAttribute = 0u,
        rgTaggedAttributeCtorArg = MutPtr(0L),
        cTaggedContentInfo = 0u,
        rgTaggedContentInfoCtorArg = MutPtr(0L),
        cTaggedOtherMsg = 0u,
        rgTaggedOtherMsgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cTaggedAttribute

    public operator fun component2(): MutPtr<CmcTaggedAttribute> = this.rgTaggedAttribute

    public operator fun component3(): UInt = this.cTaggedContentInfo

    public operator fun component4(): MutPtr<CmcTaggedContentInfo> = this.rgTaggedContentInfo

    public operator fun component5(): UInt = this.cTaggedOtherMsg

    public operator fun component6(): MutPtr<CmcTaggedOtherMsg> = this.rgTaggedOtherMsg

    public fun copy(cTaggedAttribute: UInt = this.cTaggedAttribute, rgTaggedAttribute: MutPtr<CmcTaggedAttribute> = this.rgTaggedAttribute, cTaggedContentInfo: UInt = this.cTaggedContentInfo, rgTaggedContentInfo: MutPtr<CmcTaggedContentInfo> = this.rgTaggedContentInfo, cTaggedOtherMsg: UInt = this.cTaggedOtherMsg, rgTaggedOtherMsg: MutPtr<CmcTaggedOtherMsg> = this.rgTaggedOtherMsg): CmcResponseInfo = CmcResponseInfo(cTaggedAttribute = cTaggedAttribute, rgTaggedAttributeCtorArg = rgTaggedAttribute, cTaggedContentInfo = cTaggedContentInfo, rgTaggedContentInfoCtorArg = rgTaggedContentInfo, cTaggedOtherMsg = cTaggedOtherMsg, rgTaggedOtherMsgCtorArg = rgTaggedOtherMsg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmcResponseInfo) return false
        if (this.cTaggedAttribute != other.cTaggedAttribute) return false
        if (this.rgTaggedAttribute != other.rgTaggedAttribute) return false
        if (this.cTaggedContentInfo != other.cTaggedContentInfo) return false
        if (this.rgTaggedContentInfo != other.rgTaggedContentInfo) return false
        if (this.cTaggedOtherMsg != other.cTaggedOtherMsg) return false
        if (this.rgTaggedOtherMsg != other.rgTaggedOtherMsg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cTaggedAttribute.hashCode()
        result = 31 * result + this.rgTaggedAttribute.hashCode()
        result = 31 * result + this.cTaggedContentInfo.hashCode()
        result = 31 * result + this.rgTaggedContentInfo.hashCode()
        result = 31 * result + this.cTaggedOtherMsg.hashCode()
        result = 31 * result + this.rgTaggedOtherMsg.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcResponseInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcResponseInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CmcResponseInfo =
                    CmcResponseInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmcTaggedAttribute>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmcTaggedContentInfo>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmcTaggedOtherMsg>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CmcResponseInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cTaggedAttribute)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmcTaggedAttribute>(64)
                    ).writeNative(addr + 8L, value.rgTaggedAttribute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cTaggedContentInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmcTaggedContentInfo>(64)
                    ).writeNative(addr + 24L, value.rgTaggedContentInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cTaggedOtherMsg)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmcTaggedOtherMsg>(64)
                    ).writeNative(addr + 40L, value.rgTaggedOtherMsg)
                }
            }

        public operator fun invoke(
            cTaggedAttribute: UInt = 0u,
            rgTaggedAttribute: MutPtr<CmcTaggedAttribute> = MutPtr(0L),
            cTaggedContentInfo: UInt = 0u,
            rgTaggedContentInfo: MutPtr<CmcTaggedContentInfo> = MutPtr(0L),
            cTaggedOtherMsg: UInt = 0u,
            rgTaggedOtherMsg: MutPtr<CmcTaggedOtherMsg> = MutPtr(0L),
        ): CmcResponseInfo =
            CmcResponseInfo(
                cTaggedAttribute = cTaggedAttribute,
                rgTaggedAttributeCtorArg = rgTaggedAttribute,
                cTaggedContentInfo = cTaggedContentInfo,
                rgTaggedContentInfoCtorArg = rgTaggedContentInfo,
                cTaggedOtherMsg = cTaggedOtherMsg,
                rgTaggedOtherMsgCtorArg = rgTaggedOtherMsg,
            )
    }
}

public class CmcStatusInfo internal constructor(
    public var dwStatus: UInt,
    public var cBodyList: UInt,
    rgdwBodyListCtorArg: MutPtr<UInt>,
    pwszStatusStringCtorArg: Pwstr,
    public var dwOtherInfoChoice: UInt,
    public var anonymous: CmcStatusInfo0,
) {
    public var rgdwBodyList: MutPtr<UInt> = rgdwBodyListCtorArg
        internal set

    public var pwszStatusString: Pwstr = pwszStatusStringCtorArg
        internal set

    public constructor() : this(
        dwStatus = 0u,
        cBodyList = 0u,
        rgdwBodyListCtorArg = MutPtr(0L),
        pwszStatusStringCtorArg = MutPtr(0L),
        dwOtherInfoChoice = 0u,
        anonymous = CmcStatusInfo0(),
    )

    public operator fun component1(): UInt = this.dwStatus

    public operator fun component2(): UInt = this.cBodyList

    public operator fun component3(): MutPtr<UInt> = this.rgdwBodyList

    public operator fun component4(): Pwstr = this.pwszStatusString

    public operator fun component5(): UInt = this.dwOtherInfoChoice

    public operator fun component6(): CmcStatusInfo0 = this.anonymous

    public fun copy(dwStatus: UInt = this.dwStatus, cBodyList: UInt = this.cBodyList, rgdwBodyList: MutPtr<UInt> = this.rgdwBodyList, pwszStatusString: Pwstr = this.pwszStatusString, dwOtherInfoChoice: UInt = this.dwOtherInfoChoice, anonymous: CmcStatusInfo0 = this.anonymous): CmcStatusInfo = CmcStatusInfo(dwStatus = dwStatus, cBodyList = cBodyList, rgdwBodyListCtorArg = rgdwBodyList, pwszStatusStringCtorArg = pwszStatusString, dwOtherInfoChoice = dwOtherInfoChoice, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmcStatusInfo) return false
        if (this.dwStatus != other.dwStatus) return false
        if (this.cBodyList != other.cBodyList) return false
        if (this.rgdwBodyList != other.rgdwBodyList) return false
        if (this.pwszStatusString != other.pwszStatusString) return false
        if (this.dwOtherInfoChoice != other.dwOtherInfoChoice) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStatus.hashCode()
        result = 31 * result + this.cBodyList.hashCode()
        result = 31 * result + this.rgdwBodyList.hashCode()
        result = 31 * result + this.pwszStatusString.hashCode()
        result = 31 * result + this.dwOtherInfoChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStatus: UInt = 0u,
            cBodyList: UInt = 0u,
            rgdwBodyList: MutPtr<UInt> = MutPtr(0L),
            pwszStatusString: Pwstr = MutPtr(0L),
            dwOtherInfoChoice: UInt = 0u,
            anonymous: CmcStatusInfo0 = CmcStatusInfo0(),
        ): CmcStatusInfo =
            CmcStatusInfo(
                dwStatus = dwStatus,
                cBodyList = cBodyList,
                rgdwBodyListCtorArg = rgdwBodyList,
                pwszStatusStringCtorArg = pwszStatusString,
                dwOtherInfoChoice = dwOtherInfoChoice,
                anonymous = anonymous,
            )
    }
}

public class CmcStatusInfo0 internal constructor(
    public var dwFailInfo: UInt,
    pPendInfoCtorArg: MutPtr<CmcPendInfo>,
) {
    public var pPendInfo: MutPtr<CmcPendInfo> = pPendInfoCtorArg
        internal set

    public constructor() : this(
        dwFailInfo = 0u,
        pPendInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFailInfo

    public operator fun component2(): MutPtr<CmcPendInfo> = this.pPendInfo

    public fun copy(dwFailInfo: UInt = this.dwFailInfo, pPendInfo: MutPtr<CmcPendInfo> = this.pPendInfo): CmcStatusInfo0 = CmcStatusInfo0(dwFailInfo = dwFailInfo, pPendInfoCtorArg = pPendInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmcStatusInfo0) return false
        if (this.dwFailInfo != other.dwFailInfo) return false
        if (this.pPendInfo != other.pPendInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFailInfo.hashCode()
        result = 31 * result + this.pPendInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFailInfo: UInt = 0u,
            pPendInfo: MutPtr<CmcPendInfo> = MutPtr(0L),
        ): CmcStatusInfo0 =
            CmcStatusInfo0(
                dwFailInfo = dwFailInfo,
                pPendInfoCtorArg = pPendInfo,
            )
    }
}

public data class CmcTaggedAttribute(
    public var dwBodyPartID: UInt = 0u,
    public var attribute: CryptAttribute = CryptAttribute(),
)

public data class CmcTaggedCertRequest(
    public var dwBodyPartID: UInt = 0u,
    public var signedCertRequest: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcTaggedCertRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcTaggedCertRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CmcTaggedCertRequest =
                    CmcTaggedCertRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmcTaggedCertRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwBodyPartID)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 8L, value.signedCertRequest)
                }
            }
    }
}

public data class CmcTaggedContentInfo(
    public var dwBodyPartID: UInt = 0u,
    public var encodedContentInfo: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcTaggedContentInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmcTaggedContentInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CmcTaggedContentInfo =
                    CmcTaggedContentInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmcTaggedContentInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwBodyPartID)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 8L, value.encodedContentInfo)
                }
            }
    }
}

public class CmcTaggedOtherMsg internal constructor(
    public var dwBodyPartID: UInt,
    pszObjIdCtorArg: Pstr,
    public var value: CryptIntegerBlob,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        dwBodyPartID = 0u,
        pszObjIdCtorArg = MutPtr(0L),
        value = CryptIntegerBlob(),
    )

    public operator fun component1(): UInt = this.dwBodyPartID

    public operator fun component2(): Pstr = this.pszObjId

    public operator fun component3(): CryptIntegerBlob = this.value

    public fun copy(dwBodyPartID: UInt = this.dwBodyPartID, pszObjId: Pstr = this.pszObjId, value: CryptIntegerBlob = this.value): CmcTaggedOtherMsg = CmcTaggedOtherMsg(dwBodyPartID = dwBodyPartID, pszObjIdCtorArg = pszObjId, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmcTaggedOtherMsg) return false
        if (this.dwBodyPartID != other.dwBodyPartID) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwBodyPartID.hashCode()
        result = 31 * result + this.pszObjId.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwBodyPartID: UInt = 0u,
            pszObjId: Pstr = MutPtr(0L),
            value: CryptIntegerBlob = CryptIntegerBlob(),
        ): CmcTaggedOtherMsg =
            CmcTaggedOtherMsg(
                dwBodyPartID = dwBodyPartID,
                pszObjIdCtorArg = pszObjId,
                value = value,
            )
    }
}

public data class CmcTaggedRequest(
    public var dwTaggedRequestChoice: UInt = 0u,
    public var anonymous: CmcTaggedRequest0 = CmcTaggedRequest0(),
)

public class CmcTaggedRequest0 internal constructor(
    pTaggedCertRequestCtorArg: MutPtr<CmcTaggedCertRequest>,
) {
    public var pTaggedCertRequest: MutPtr<CmcTaggedCertRequest> = pTaggedCertRequestCtorArg
        internal set

    public constructor() : this(
        pTaggedCertRequestCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CmcTaggedCertRequest> = this.pTaggedCertRequest

    public fun copy(pTaggedCertRequest: MutPtr<CmcTaggedCertRequest> = this.pTaggedCertRequest): CmcTaggedRequest0 = CmcTaggedRequest0(pTaggedCertRequestCtorArg = pTaggedCertRequest)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmcTaggedRequest0) return false
        if (this.pTaggedCertRequest != other.pTaggedCertRequest) return false
        return true
    }

    override fun hashCode(): Int = this.pTaggedCertRequest.hashCode()

    public companion object {
        public operator fun invoke(
            pTaggedCertRequest: MutPtr<CmcTaggedCertRequest> = MutPtr(0L),
        ): CmcTaggedRequest0 =
            CmcTaggedRequest0(
                pTaggedCertRequestCtorArg = pTaggedCertRequest,
            )
    }
}

public data class CmsgCmsRecipientInfo(
    public var dwRecipientChoice: UInt = 0u,
    public var anonymous: CmsgCmsRecipientInfo0 = CmsgCmsRecipientInfo0(),
)

public class CmsgCmsRecipientInfo0 internal constructor(
    pKeyTransCtorArg: MutPtr<CmsgKeyTransRecipientInfo>,
    pKeyAgreeCtorArg: MutPtr<CmsgKeyAgreeRecipientInfo>,
    pMailListCtorArg: MutPtr<CmsgMailListRecipientInfo>,
) {
    public var pKeyTrans: MutPtr<CmsgKeyTransRecipientInfo> = pKeyTransCtorArg
        internal set

    public var pKeyAgree: MutPtr<CmsgKeyAgreeRecipientInfo> = pKeyAgreeCtorArg
        internal set

    public var pMailList: MutPtr<CmsgMailListRecipientInfo> = pMailListCtorArg
        internal set

    public constructor() : this(
        pKeyTransCtorArg = MutPtr(0L),
        pKeyAgreeCtorArg = MutPtr(0L),
        pMailListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CmsgKeyTransRecipientInfo> = this.pKeyTrans

    public operator fun component2(): MutPtr<CmsgKeyAgreeRecipientInfo> = this.pKeyAgree

    public operator fun component3(): MutPtr<CmsgMailListRecipientInfo> = this.pMailList

    public fun copy(pKeyTrans: MutPtr<CmsgKeyTransRecipientInfo> = this.pKeyTrans, pKeyAgree: MutPtr<CmsgKeyAgreeRecipientInfo> = this.pKeyAgree, pMailList: MutPtr<CmsgMailListRecipientInfo> = this.pMailList): CmsgCmsRecipientInfo0 = CmsgCmsRecipientInfo0(pKeyTransCtorArg = pKeyTrans, pKeyAgreeCtorArg = pKeyAgree, pMailListCtorArg = pMailList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgCmsRecipientInfo0) return false
        if (this.pKeyTrans != other.pKeyTrans) return false
        if (this.pKeyAgree != other.pKeyAgree) return false
        if (this.pMailList != other.pMailList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pKeyTrans.hashCode()
        result = 31 * result + this.pKeyAgree.hashCode()
        result = 31 * result + this.pMailList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pKeyTrans: MutPtr<CmsgKeyTransRecipientInfo> = MutPtr(0L),
            pKeyAgree: MutPtr<CmsgKeyAgreeRecipientInfo> = MutPtr(0L),
            pMailList: MutPtr<CmsgMailListRecipientInfo> = MutPtr(0L),
        ): CmsgCmsRecipientInfo0 =
            CmsgCmsRecipientInfo0(
                pKeyTransCtorArg = pKeyTrans,
                pKeyAgreeCtorArg = pKeyAgree,
                pMailListCtorArg = pMailList,
            )
    }
}

public data class CmsgCmsSignerInfo(
    public var dwVersion: UInt = 0u,
    public var signerId: CertId = CertId(),
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var hashEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedHash: CryptIntegerBlob = CryptIntegerBlob(),
    public var authAttrs: CryptAttributes = CryptAttributes(),
    public var unauthAttrs: CryptAttributes = CryptAttributes(),
)

public class CmsgCngContentDecryptInfo internal constructor(
    public var cbSize: UInt,
    public var contentEncryptionAlgorithm: CryptAlgorithmIdentifier,
    public var pfnAlloc: PfnCmsgAlloc,
    public var pfnFree: PfnCmsgFree,
    public var hNCryptKey: NcryptKeyHandle,
    pbContentEncryptKeyCtorArg: MutPtr<UByte>,
    public var cbContentEncryptKey: UInt,
    hCNGContentEncryptKeyCtorArg: BcryptKeyHandle,
    pbCNGContentEncryptKeyObjectCtorArg: MutPtr<UByte>,
) {
    public var pbContentEncryptKey: MutPtr<UByte> = pbContentEncryptKeyCtorArg
        internal set

    public var hCNGContentEncryptKey: BcryptKeyHandle = hCNGContentEncryptKeyCtorArg
        internal set

    public var pbCNGContentEncryptKeyObject: MutPtr<UByte> = pbCNGContentEncryptKeyObjectCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        contentEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        pfnAlloc = null,
        pfnFree = null,
        hNCryptKey = 0uL,
        pbContentEncryptKeyCtorArg = MutPtr(0L),
        cbContentEncryptKey = 0u,
        hCNGContentEncryptKeyCtorArg = MutPtr(0L),
        pbCNGContentEncryptKeyObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CryptAlgorithmIdentifier = this.contentEncryptionAlgorithm

    public operator fun component3(): PfnCmsgAlloc = this.pfnAlloc

    public operator fun component4(): PfnCmsgFree = this.pfnFree

    public operator fun component5(): NcryptKeyHandle = this.hNCryptKey

    public operator fun component6(): MutPtr<UByte> = this.pbContentEncryptKey

    public operator fun component7(): UInt = this.cbContentEncryptKey

    public operator fun component8(): BcryptKeyHandle = this.hCNGContentEncryptKey

    public operator fun component9(): MutPtr<UByte> = this.pbCNGContentEncryptKeyObject

    public fun copy(cbSize: UInt = this.cbSize, contentEncryptionAlgorithm: CryptAlgorithmIdentifier = this.contentEncryptionAlgorithm, pfnAlloc: PfnCmsgAlloc = this.pfnAlloc, pfnFree: PfnCmsgFree = this.pfnFree, hNCryptKey: NcryptKeyHandle = this.hNCryptKey, pbContentEncryptKey: MutPtr<UByte> = this.pbContentEncryptKey, cbContentEncryptKey: UInt = this.cbContentEncryptKey, hCNGContentEncryptKey: BcryptKeyHandle = this.hCNGContentEncryptKey, pbCNGContentEncryptKeyObject: MutPtr<UByte> = this.pbCNGContentEncryptKeyObject): CmsgCngContentDecryptInfo = CmsgCngContentDecryptInfo(cbSize = cbSize, contentEncryptionAlgorithm = contentEncryptionAlgorithm, pfnAlloc = pfnAlloc, pfnFree = pfnFree, hNCryptKey = hNCryptKey, pbContentEncryptKeyCtorArg = pbContentEncryptKey, cbContentEncryptKey = cbContentEncryptKey, hCNGContentEncryptKeyCtorArg = hCNGContentEncryptKey, pbCNGContentEncryptKeyObjectCtorArg = pbCNGContentEncryptKeyObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgCngContentDecryptInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.contentEncryptionAlgorithm != other.contentEncryptionAlgorithm) return false
        if (this.pfnAlloc != other.pfnAlloc) return false
        if (this.pfnFree != other.pfnFree) return false
        if (this.hNCryptKey != other.hNCryptKey) return false
        if (this.pbContentEncryptKey != other.pbContentEncryptKey) return false
        if (this.cbContentEncryptKey != other.cbContentEncryptKey) return false
        if (this.hCNGContentEncryptKey != other.hCNGContentEncryptKey) return false
        if (this.pbCNGContentEncryptKeyObject != other.pbCNGContentEncryptKeyObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.contentEncryptionAlgorithm.hashCode()
        result = 31 * result + this.pfnAlloc.hashCode()
        result = 31 * result + this.pfnFree.hashCode()
        result = 31 * result + this.hNCryptKey.hashCode()
        result = 31 * result + this.pbContentEncryptKey.hashCode()
        result = 31 * result + this.cbContentEncryptKey.hashCode()
        result = 31 * result + this.hCNGContentEncryptKey.hashCode()
        result = 31 * result + this.pbCNGContentEncryptKeyObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            contentEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pfnAlloc: PfnCmsgAlloc = null,
            pfnFree: PfnCmsgFree = null,
            hNCryptKey: NcryptKeyHandle = 0uL,
            pbContentEncryptKey: MutPtr<UByte> = MutPtr(0L),
            cbContentEncryptKey: UInt = 0u,
            hCNGContentEncryptKey: BcryptKeyHandle = MutPtr(0L),
            pbCNGContentEncryptKeyObject: MutPtr<UByte> = MutPtr(0L),
        ): CmsgCngContentDecryptInfo =
            CmsgCngContentDecryptInfo(
                cbSize = cbSize,
                contentEncryptionAlgorithm = contentEncryptionAlgorithm,
                pfnAlloc = pfnAlloc,
                pfnFree = pfnFree,
                hNCryptKey = hNCryptKey,
                pbContentEncryptKeyCtorArg = pbContentEncryptKey,
                cbContentEncryptKey = cbContentEncryptKey,
                hCNGContentEncryptKeyCtorArg = hCNGContentEncryptKey,
                pbCNGContentEncryptKeyObjectCtorArg = pbCNGContentEncryptKeyObject,
            )
    }
}

public class CmsgContentEncryptInfo internal constructor(
    public var cbSize: UInt,
    public var hCryptProv: HcryptprovLegacy,
    public var contentEncryptionAlgorithm: CryptAlgorithmIdentifier,
    pvEncryptionAuxInfoCtorArg: MutPtr<CVoid>,
    public var cRecipients: UInt,
    rgCmsRecipientsCtorArg: MutPtr<CmsgRecipientEncodeInfo>,
    public var pfnAlloc: PfnCmsgAlloc,
    public var pfnFree: PfnCmsgFree,
    public var dwEncryptFlags: UInt,
    public var anonymous: CmsgContentEncryptInfo0,
    public var dwFlags: UInt,
    public var fCNG: Bool,
    pbCNGContentEncryptKeyObjectCtorArg: MutPtr<UByte>,
    pbContentEncryptKeyCtorArg: MutPtr<UByte>,
    public var cbContentEncryptKey: UInt,
) {
    public var pvEncryptionAuxInfo: MutPtr<CVoid> = pvEncryptionAuxInfoCtorArg
        internal set

    public var rgCmsRecipients: MutPtr<CmsgRecipientEncodeInfo> = rgCmsRecipientsCtorArg
        internal set

    public var pbCNGContentEncryptKeyObject: MutPtr<UByte> = pbCNGContentEncryptKeyObjectCtorArg
        internal set

    public var pbContentEncryptKey: MutPtr<UByte> = pbContentEncryptKeyCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hCryptProv = 0uL,
        contentEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        pvEncryptionAuxInfoCtorArg = MutPtr(0L),
        cRecipients = 0u,
        rgCmsRecipientsCtorArg = MutPtr(0L),
        pfnAlloc = null,
        pfnFree = null,
        dwEncryptFlags = 0u,
        anonymous = CmsgContentEncryptInfo0(),
        dwFlags = 0u,
        fCNG = 0,
        pbCNGContentEncryptKeyObjectCtorArg = MutPtr(0L),
        pbContentEncryptKeyCtorArg = MutPtr(0L),
        cbContentEncryptKey = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): HcryptprovLegacy = this.hCryptProv

    public operator fun component3(): CryptAlgorithmIdentifier = this.contentEncryptionAlgorithm

    public operator fun component4(): MutPtr<CVoid> = this.pvEncryptionAuxInfo

    public operator fun component5(): UInt = this.cRecipients

    public operator fun component6(): MutPtr<CmsgRecipientEncodeInfo> = this.rgCmsRecipients

    public operator fun component7(): PfnCmsgAlloc = this.pfnAlloc

    public operator fun component8(): PfnCmsgFree = this.pfnFree

    public operator fun component9(): UInt = this.dwEncryptFlags

    public operator fun component10(): CmsgContentEncryptInfo0 = this.anonymous

    public operator fun component11(): UInt = this.dwFlags

    public operator fun component12(): Bool = this.fCNG

    public operator fun component13(): MutPtr<UByte> = this.pbCNGContentEncryptKeyObject

    public operator fun component14(): MutPtr<UByte> = this.pbContentEncryptKey

    public operator fun component15(): UInt = this.cbContentEncryptKey

    public fun copy(cbSize: UInt = this.cbSize, hCryptProv: HcryptprovLegacy = this.hCryptProv, contentEncryptionAlgorithm: CryptAlgorithmIdentifier = this.contentEncryptionAlgorithm, pvEncryptionAuxInfo: MutPtr<CVoid> = this.pvEncryptionAuxInfo, cRecipients: UInt = this.cRecipients, rgCmsRecipients: MutPtr<CmsgRecipientEncodeInfo> = this.rgCmsRecipients, pfnAlloc: PfnCmsgAlloc = this.pfnAlloc, pfnFree: PfnCmsgFree = this.pfnFree, dwEncryptFlags: UInt = this.dwEncryptFlags, anonymous: CmsgContentEncryptInfo0 = this.anonymous, dwFlags: UInt = this.dwFlags, fCNG: Bool = this.fCNG, pbCNGContentEncryptKeyObject: MutPtr<UByte> = this.pbCNGContentEncryptKeyObject, pbContentEncryptKey: MutPtr<UByte> = this.pbContentEncryptKey, cbContentEncryptKey: UInt = this.cbContentEncryptKey): CmsgContentEncryptInfo = CmsgContentEncryptInfo(cbSize = cbSize, hCryptProv = hCryptProv, contentEncryptionAlgorithm = contentEncryptionAlgorithm, pvEncryptionAuxInfoCtorArg = pvEncryptionAuxInfo, cRecipients = cRecipients, rgCmsRecipientsCtorArg = rgCmsRecipients, pfnAlloc = pfnAlloc, pfnFree = pfnFree, dwEncryptFlags = dwEncryptFlags, anonymous = anonymous, dwFlags = dwFlags, fCNG = fCNG, pbCNGContentEncryptKeyObjectCtorArg = pbCNGContentEncryptKeyObject, pbContentEncryptKeyCtorArg = pbContentEncryptKey, cbContentEncryptKey = cbContentEncryptKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgContentEncryptInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.contentEncryptionAlgorithm != other.contentEncryptionAlgorithm) return false
        if (this.pvEncryptionAuxInfo != other.pvEncryptionAuxInfo) return false
        if (this.cRecipients != other.cRecipients) return false
        if (this.rgCmsRecipients != other.rgCmsRecipients) return false
        if (this.pfnAlloc != other.pfnAlloc) return false
        if (this.pfnFree != other.pfnFree) return false
        if (this.dwEncryptFlags != other.dwEncryptFlags) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.fCNG != other.fCNG) return false
        if (this.pbCNGContentEncryptKeyObject != other.pbCNGContentEncryptKeyObject) return false
        if (this.pbContentEncryptKey != other.pbContentEncryptKey) return false
        if (this.cbContentEncryptKey != other.cbContentEncryptKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.contentEncryptionAlgorithm.hashCode()
        result = 31 * result + this.pvEncryptionAuxInfo.hashCode()
        result = 31 * result + this.cRecipients.hashCode()
        result = 31 * result + this.rgCmsRecipients.hashCode()
        result = 31 * result + this.pfnAlloc.hashCode()
        result = 31 * result + this.pfnFree.hashCode()
        result = 31 * result + this.dwEncryptFlags.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.fCNG.hashCode()
        result = 31 * result + this.pbCNGContentEncryptKeyObject.hashCode()
        result = 31 * result + this.pbContentEncryptKey.hashCode()
        result = 31 * result + this.cbContentEncryptKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hCryptProv: HcryptprovLegacy = 0uL,
            contentEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvEncryptionAuxInfo: MutPtr<CVoid> = MutPtr(0L),
            cRecipients: UInt = 0u,
            rgCmsRecipients: MutPtr<CmsgRecipientEncodeInfo> = MutPtr(0L),
            pfnAlloc: PfnCmsgAlloc = null,
            pfnFree: PfnCmsgFree = null,
            dwEncryptFlags: UInt = 0u,
            anonymous: CmsgContentEncryptInfo0 = CmsgContentEncryptInfo0(),
            dwFlags: UInt = 0u,
            fCNG: Bool = 0,
            pbCNGContentEncryptKeyObject: MutPtr<UByte> = MutPtr(0L),
            pbContentEncryptKey: MutPtr<UByte> = MutPtr(0L),
            cbContentEncryptKey: UInt = 0u,
        ): CmsgContentEncryptInfo =
            CmsgContentEncryptInfo(
                cbSize = cbSize,
                hCryptProv = hCryptProv,
                contentEncryptionAlgorithm = contentEncryptionAlgorithm,
                pvEncryptionAuxInfoCtorArg = pvEncryptionAuxInfo,
                cRecipients = cRecipients,
                rgCmsRecipientsCtorArg = rgCmsRecipients,
                pfnAlloc = pfnAlloc,
                pfnFree = pfnFree,
                dwEncryptFlags = dwEncryptFlags,
                anonymous = anonymous,
                dwFlags = dwFlags,
                fCNG = fCNG,
                pbCNGContentEncryptKeyObjectCtorArg = pbCNGContentEncryptKeyObject,
                pbContentEncryptKeyCtorArg = pbContentEncryptKey,
                cbContentEncryptKey = cbContentEncryptKey,
            )
    }
}

public class CmsgContentEncryptInfo0 internal constructor(
    public var hContentEncryptKey: Int,
    hCNGContentEncryptKeyCtorArg: BcryptKeyHandle,
) {
    public var hCNGContentEncryptKey: BcryptKeyHandle = hCNGContentEncryptKeyCtorArg
        internal set

    public constructor() : this(
        hContentEncryptKey = 0,
        hCNGContentEncryptKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.hContentEncryptKey

    public operator fun component2(): BcryptKeyHandle = this.hCNGContentEncryptKey

    public fun copy(hContentEncryptKey: Int = this.hContentEncryptKey, hCNGContentEncryptKey: BcryptKeyHandle = this.hCNGContentEncryptKey): CmsgContentEncryptInfo0 = CmsgContentEncryptInfo0(hContentEncryptKey = hContentEncryptKey, hCNGContentEncryptKeyCtorArg = hCNGContentEncryptKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgContentEncryptInfo0) return false
        if (this.hContentEncryptKey != other.hContentEncryptKey) return false
        if (this.hCNGContentEncryptKey != other.hCNGContentEncryptKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContentEncryptKey.hashCode()
        result = 31 * result + this.hCNGContentEncryptKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hContentEncryptKey: Int = 0,
            hCNGContentEncryptKey: BcryptKeyHandle = MutPtr(0L),
        ): CmsgContentEncryptInfo0 =
            CmsgContentEncryptInfo0(
                hContentEncryptKey = hContentEncryptKey,
                hCNGContentEncryptKeyCtorArg = hCNGContentEncryptKey,
            )
    }
}

public data class CmsgCtrlAddSignerUnauthAttrPara(
    public var cbSize: UInt = 0u,
    public var dwSignerIndex: UInt = 0u,
    public var blob: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgCtrlAddSignerUnauthAttrPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgCtrlAddSignerUnauthAttrPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CmsgCtrlAddSignerUnauthAttrPara =
                    CmsgCtrlAddSignerUnauthAttrPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmsgCtrlAddSignerUnauthAttrPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSignerIndex)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 8L, value.blob)
                }
            }
    }
}

public data class CmsgCtrlDecryptPara(
    public var cbSize: UInt = 0u,
    public var anonymous: CmsgCtrlDecryptPara0 = CmsgCtrlDecryptPara0(),
    public var dwKeySpec: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
)

public data class CmsgCtrlDecryptPara0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public data class CmsgCtrlDelSignerUnauthAttrPara(
    public var cbSize: UInt = 0u,
    public var dwSignerIndex: UInt = 0u,
    public var dwUnauthAttrIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgCtrlDelSignerUnauthAttrPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgCtrlDelSignerUnauthAttrPara> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CmsgCtrlDelSignerUnauthAttrPara =
                    CmsgCtrlDelSignerUnauthAttrPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmsgCtrlDelSignerUnauthAttrPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSignerIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUnauthAttrIndex)
                }
            }
    }
}

public class CmsgCtrlKeyAgreeDecryptPara internal constructor(
    public var cbSize: UInt,
    public var anonymous: CmsgCtrlKeyAgreeDecryptPara0,
    public var dwKeySpec: UInt,
    pKeyAgreeCtorArg: MutPtr<CmsgKeyAgreeRecipientInfo>,
    public var dwRecipientIndex: UInt,
    public var dwRecipientEncryptedKeyIndex: UInt,
    public var originatorPublicKey: CryptBitBlob,
) {
    public var pKeyAgree: MutPtr<CmsgKeyAgreeRecipientInfo> = pKeyAgreeCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        anonymous = CmsgCtrlKeyAgreeDecryptPara0(),
        dwKeySpec = 0u,
        pKeyAgreeCtorArg = MutPtr(0L),
        dwRecipientIndex = 0u,
        dwRecipientEncryptedKeyIndex = 0u,
        originatorPublicKey = CryptBitBlob(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CmsgCtrlKeyAgreeDecryptPara0 = this.anonymous

    public operator fun component3(): UInt = this.dwKeySpec

    public operator fun component4(): MutPtr<CmsgKeyAgreeRecipientInfo> = this.pKeyAgree

    public operator fun component5(): UInt = this.dwRecipientIndex

    public operator fun component6(): UInt = this.dwRecipientEncryptedKeyIndex

    public operator fun component7(): CryptBitBlob = this.originatorPublicKey

    public fun copy(cbSize: UInt = this.cbSize, anonymous: CmsgCtrlKeyAgreeDecryptPara0 = this.anonymous, dwKeySpec: UInt = this.dwKeySpec, pKeyAgree: MutPtr<CmsgKeyAgreeRecipientInfo> = this.pKeyAgree, dwRecipientIndex: UInt = this.dwRecipientIndex, dwRecipientEncryptedKeyIndex: UInt = this.dwRecipientEncryptedKeyIndex, originatorPublicKey: CryptBitBlob = this.originatorPublicKey): CmsgCtrlKeyAgreeDecryptPara = CmsgCtrlKeyAgreeDecryptPara(cbSize = cbSize, anonymous = anonymous, dwKeySpec = dwKeySpec, pKeyAgreeCtorArg = pKeyAgree, dwRecipientIndex = dwRecipientIndex, dwRecipientEncryptedKeyIndex = dwRecipientEncryptedKeyIndex, originatorPublicKey = originatorPublicKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgCtrlKeyAgreeDecryptPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.pKeyAgree != other.pKeyAgree) return false
        if (this.dwRecipientIndex != other.dwRecipientIndex) return false
        if (this.dwRecipientEncryptedKeyIndex != other.dwRecipientEncryptedKeyIndex) return false
        if (this.originatorPublicKey != other.originatorPublicKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.pKeyAgree.hashCode()
        result = 31 * result + this.dwRecipientIndex.hashCode()
        result = 31 * result + this.dwRecipientEncryptedKeyIndex.hashCode()
        result = 31 * result + this.originatorPublicKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            anonymous: CmsgCtrlKeyAgreeDecryptPara0 = CmsgCtrlKeyAgreeDecryptPara0(),
            dwKeySpec: UInt = 0u,
            pKeyAgree: MutPtr<CmsgKeyAgreeRecipientInfo> = MutPtr(0L),
            dwRecipientIndex: UInt = 0u,
            dwRecipientEncryptedKeyIndex: UInt = 0u,
            originatorPublicKey: CryptBitBlob = CryptBitBlob(),
        ): CmsgCtrlKeyAgreeDecryptPara =
            CmsgCtrlKeyAgreeDecryptPara(
                cbSize = cbSize,
                anonymous = anonymous,
                dwKeySpec = dwKeySpec,
                pKeyAgreeCtorArg = pKeyAgree,
                dwRecipientIndex = dwRecipientIndex,
                dwRecipientEncryptedKeyIndex = dwRecipientEncryptedKeyIndex,
                originatorPublicKey = originatorPublicKey,
            )
    }
}

public data class CmsgCtrlKeyAgreeDecryptPara0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public class CmsgCtrlKeyTransDecryptPara internal constructor(
    public var cbSize: UInt,
    public var anonymous: CmsgCtrlKeyTransDecryptPara0,
    public var dwKeySpec: UInt,
    pKeyTransCtorArg: MutPtr<CmsgKeyTransRecipientInfo>,
    public var dwRecipientIndex: UInt,
) {
    public var pKeyTrans: MutPtr<CmsgKeyTransRecipientInfo> = pKeyTransCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        anonymous = CmsgCtrlKeyTransDecryptPara0(),
        dwKeySpec = 0u,
        pKeyTransCtorArg = MutPtr(0L),
        dwRecipientIndex = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CmsgCtrlKeyTransDecryptPara0 = this.anonymous

    public operator fun component3(): UInt = this.dwKeySpec

    public operator fun component4(): MutPtr<CmsgKeyTransRecipientInfo> = this.pKeyTrans

    public operator fun component5(): UInt = this.dwRecipientIndex

    public fun copy(cbSize: UInt = this.cbSize, anonymous: CmsgCtrlKeyTransDecryptPara0 = this.anonymous, dwKeySpec: UInt = this.dwKeySpec, pKeyTrans: MutPtr<CmsgKeyTransRecipientInfo> = this.pKeyTrans, dwRecipientIndex: UInt = this.dwRecipientIndex): CmsgCtrlKeyTransDecryptPara = CmsgCtrlKeyTransDecryptPara(cbSize = cbSize, anonymous = anonymous, dwKeySpec = dwKeySpec, pKeyTransCtorArg = pKeyTrans, dwRecipientIndex = dwRecipientIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgCtrlKeyTransDecryptPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.pKeyTrans != other.pKeyTrans) return false
        if (this.dwRecipientIndex != other.dwRecipientIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.pKeyTrans.hashCode()
        result = 31 * result + this.dwRecipientIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            anonymous: CmsgCtrlKeyTransDecryptPara0 = CmsgCtrlKeyTransDecryptPara0(),
            dwKeySpec: UInt = 0u,
            pKeyTrans: MutPtr<CmsgKeyTransRecipientInfo> = MutPtr(0L),
            dwRecipientIndex: UInt = 0u,
        ): CmsgCtrlKeyTransDecryptPara =
            CmsgCtrlKeyTransDecryptPara(
                cbSize = cbSize,
                anonymous = anonymous,
                dwKeySpec = dwKeySpec,
                pKeyTransCtorArg = pKeyTrans,
                dwRecipientIndex = dwRecipientIndex,
            )
    }
}

public data class CmsgCtrlKeyTransDecryptPara0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public class CmsgCtrlMailListDecryptPara internal constructor(
    public var cbSize: UInt,
    public var hCryptProv: Int,
    pMailListCtorArg: MutPtr<CmsgMailListRecipientInfo>,
    public var dwRecipientIndex: UInt,
    public var dwKeyChoice: UInt,
    public var anonymous: CmsgCtrlMailListDecryptPara0,
) {
    public var pMailList: MutPtr<CmsgMailListRecipientInfo> = pMailListCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hCryptProv = 0,
        pMailListCtorArg = MutPtr(0L),
        dwRecipientIndex = 0u,
        dwKeyChoice = 0u,
        anonymous = CmsgCtrlMailListDecryptPara0(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Int = this.hCryptProv

    public operator fun component3(): MutPtr<CmsgMailListRecipientInfo> = this.pMailList

    public operator fun component4(): UInt = this.dwRecipientIndex

    public operator fun component5(): UInt = this.dwKeyChoice

    public operator fun component6(): CmsgCtrlMailListDecryptPara0 = this.anonymous

    public fun copy(cbSize: UInt = this.cbSize, hCryptProv: Int = this.hCryptProv, pMailList: MutPtr<CmsgMailListRecipientInfo> = this.pMailList, dwRecipientIndex: UInt = this.dwRecipientIndex, dwKeyChoice: UInt = this.dwKeyChoice, anonymous: CmsgCtrlMailListDecryptPara0 = this.anonymous): CmsgCtrlMailListDecryptPara = CmsgCtrlMailListDecryptPara(cbSize = cbSize, hCryptProv = hCryptProv, pMailListCtorArg = pMailList, dwRecipientIndex = dwRecipientIndex, dwKeyChoice = dwKeyChoice, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgCtrlMailListDecryptPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.pMailList != other.pMailList) return false
        if (this.dwRecipientIndex != other.dwRecipientIndex) return false
        if (this.dwKeyChoice != other.dwKeyChoice) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.pMailList.hashCode()
        result = 31 * result + this.dwRecipientIndex.hashCode()
        result = 31 * result + this.dwKeyChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hCryptProv: Int = 0,
            pMailList: MutPtr<CmsgMailListRecipientInfo> = MutPtr(0L),
            dwRecipientIndex: UInt = 0u,
            dwKeyChoice: UInt = 0u,
            anonymous: CmsgCtrlMailListDecryptPara0 = CmsgCtrlMailListDecryptPara0(),
        ): CmsgCtrlMailListDecryptPara =
            CmsgCtrlMailListDecryptPara(
                cbSize = cbSize,
                hCryptProv = hCryptProv,
                pMailListCtorArg = pMailList,
                dwRecipientIndex = dwRecipientIndex,
                dwKeyChoice = dwKeyChoice,
                anonymous = anonymous,
            )
    }
}

public class CmsgCtrlMailListDecryptPara0 internal constructor(
    public var hKeyEncryptionKey: Int,
    pvKeyEncryptionKeyCtorArg: MutPtr<CVoid>,
) {
    public var pvKeyEncryptionKey: MutPtr<CVoid> = pvKeyEncryptionKeyCtorArg
        internal set

    public constructor() : this(
        hKeyEncryptionKey = 0,
        pvKeyEncryptionKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.hKeyEncryptionKey

    public operator fun component2(): MutPtr<CVoid> = this.pvKeyEncryptionKey

    public fun copy(hKeyEncryptionKey: Int = this.hKeyEncryptionKey, pvKeyEncryptionKey: MutPtr<CVoid> = this.pvKeyEncryptionKey): CmsgCtrlMailListDecryptPara0 = CmsgCtrlMailListDecryptPara0(hKeyEncryptionKey = hKeyEncryptionKey, pvKeyEncryptionKeyCtorArg = pvKeyEncryptionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgCtrlMailListDecryptPara0) return false
        if (this.hKeyEncryptionKey != other.hKeyEncryptionKey) return false
        if (this.pvKeyEncryptionKey != other.pvKeyEncryptionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hKeyEncryptionKey.hashCode()
        result = 31 * result + this.pvKeyEncryptionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hKeyEncryptionKey: Int = 0,
            pvKeyEncryptionKey: MutPtr<CVoid> = MutPtr(0L),
        ): CmsgCtrlMailListDecryptPara0 =
            CmsgCtrlMailListDecryptPara0(
                hKeyEncryptionKey = hKeyEncryptionKey,
                pvKeyEncryptionKeyCtorArg = pvKeyEncryptionKey,
            )
    }
}

public class CmsgCtrlVerifySignatureExPara internal constructor(
    public var cbSize: UInt,
    public var hCryptProv: HcryptprovLegacy,
    public var dwSignerIndex: UInt,
    public var dwSignerType: UInt,
    pvSignerCtorArg: MutPtr<CVoid>,
) {
    public var pvSigner: MutPtr<CVoid> = pvSignerCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hCryptProv = 0uL,
        dwSignerIndex = 0u,
        dwSignerType = 0u,
        pvSignerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): HcryptprovLegacy = this.hCryptProv

    public operator fun component3(): UInt = this.dwSignerIndex

    public operator fun component4(): UInt = this.dwSignerType

    public operator fun component5(): MutPtr<CVoid> = this.pvSigner

    public fun copy(cbSize: UInt = this.cbSize, hCryptProv: HcryptprovLegacy = this.hCryptProv, dwSignerIndex: UInt = this.dwSignerIndex, dwSignerType: UInt = this.dwSignerType, pvSigner: MutPtr<CVoid> = this.pvSigner): CmsgCtrlVerifySignatureExPara = CmsgCtrlVerifySignatureExPara(cbSize = cbSize, hCryptProv = hCryptProv, dwSignerIndex = dwSignerIndex, dwSignerType = dwSignerType, pvSignerCtorArg = pvSigner)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgCtrlVerifySignatureExPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.dwSignerIndex != other.dwSignerIndex) return false
        if (this.dwSignerType != other.dwSignerType) return false
        if (this.pvSigner != other.pvSigner) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.dwSignerIndex.hashCode()
        result = 31 * result + this.dwSignerType.hashCode()
        result = 31 * result + this.pvSigner.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgCtrlVerifySignatureExPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgCtrlVerifySignatureExPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CmsgCtrlVerifySignatureExPara =
                    CmsgCtrlVerifySignatureExPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CmsgCtrlVerifySignatureExPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.hCryptProv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwSignerIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwSignerType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pvSigner)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            hCryptProv: HcryptprovLegacy = 0uL,
            dwSignerIndex: UInt = 0u,
            dwSignerType: UInt = 0u,
            pvSigner: MutPtr<CVoid> = MutPtr(0L),
        ): CmsgCtrlVerifySignatureExPara =
            CmsgCtrlVerifySignatureExPara(
                cbSize = cbSize,
                hCryptProv = hCryptProv,
                dwSignerIndex = dwSignerIndex,
                dwSignerType = dwSignerType,
                pvSignerCtorArg = pvSigner,
            )
    }
}

public class CmsgEncryptedEncodeInfo internal constructor(
    public var cbSize: UInt,
    public var contentEncryptionAlgorithm: CryptAlgorithmIdentifier,
    pvEncryptionAuxInfoCtorArg: MutPtr<CVoid>,
) {
    public var pvEncryptionAuxInfo: MutPtr<CVoid> = pvEncryptionAuxInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        contentEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        pvEncryptionAuxInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CryptAlgorithmIdentifier = this.contentEncryptionAlgorithm

    public operator fun component3(): MutPtr<CVoid> = this.pvEncryptionAuxInfo

    public fun copy(cbSize: UInt = this.cbSize, contentEncryptionAlgorithm: CryptAlgorithmIdentifier = this.contentEncryptionAlgorithm, pvEncryptionAuxInfo: MutPtr<CVoid> = this.pvEncryptionAuxInfo): CmsgEncryptedEncodeInfo = CmsgEncryptedEncodeInfo(cbSize = cbSize, contentEncryptionAlgorithm = contentEncryptionAlgorithm, pvEncryptionAuxInfoCtorArg = pvEncryptionAuxInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgEncryptedEncodeInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.contentEncryptionAlgorithm != other.contentEncryptionAlgorithm) return false
        if (this.pvEncryptionAuxInfo != other.pvEncryptionAuxInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.contentEncryptionAlgorithm.hashCode()
        result = 31 * result + this.pvEncryptionAuxInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            contentEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvEncryptionAuxInfo: MutPtr<CVoid> = MutPtr(0L),
        ): CmsgEncryptedEncodeInfo =
            CmsgEncryptedEncodeInfo(
                cbSize = cbSize,
                contentEncryptionAlgorithm = contentEncryptionAlgorithm,
                pvEncryptionAuxInfoCtorArg = pvEncryptionAuxInfo,
            )
    }
}

public class CmsgEnvelopedEncodeInfo internal constructor(
    public var cbSize: UInt,
    public var hCryptProv: HcryptprovLegacy,
    public var contentEncryptionAlgorithm: CryptAlgorithmIdentifier,
    pvEncryptionAuxInfoCtorArg: MutPtr<CVoid>,
    public var cRecipients: UInt,
    rgpRecipientsCtorArg: MutPtr<MutPtr<CertInfo>>,
) {
    public var pvEncryptionAuxInfo: MutPtr<CVoid> = pvEncryptionAuxInfoCtorArg
        internal set

    public var rgpRecipients: MutPtr<MutPtr<CertInfo>> = rgpRecipientsCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hCryptProv = 0uL,
        contentEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        pvEncryptionAuxInfoCtorArg = MutPtr(0L),
        cRecipients = 0u,
        rgpRecipientsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): HcryptprovLegacy = this.hCryptProv

    public operator fun component3(): CryptAlgorithmIdentifier = this.contentEncryptionAlgorithm

    public operator fun component4(): MutPtr<CVoid> = this.pvEncryptionAuxInfo

    public operator fun component5(): UInt = this.cRecipients

    public operator fun component6(): MutPtr<MutPtr<CertInfo>> = this.rgpRecipients

    public fun copy(cbSize: UInt = this.cbSize, hCryptProv: HcryptprovLegacy = this.hCryptProv, contentEncryptionAlgorithm: CryptAlgorithmIdentifier = this.contentEncryptionAlgorithm, pvEncryptionAuxInfo: MutPtr<CVoid> = this.pvEncryptionAuxInfo, cRecipients: UInt = this.cRecipients, rgpRecipients: MutPtr<MutPtr<CertInfo>> = this.rgpRecipients): CmsgEnvelopedEncodeInfo = CmsgEnvelopedEncodeInfo(cbSize = cbSize, hCryptProv = hCryptProv, contentEncryptionAlgorithm = contentEncryptionAlgorithm, pvEncryptionAuxInfoCtorArg = pvEncryptionAuxInfo, cRecipients = cRecipients, rgpRecipientsCtorArg = rgpRecipients)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgEnvelopedEncodeInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.contentEncryptionAlgorithm != other.contentEncryptionAlgorithm) return false
        if (this.pvEncryptionAuxInfo != other.pvEncryptionAuxInfo) return false
        if (this.cRecipients != other.cRecipients) return false
        if (this.rgpRecipients != other.rgpRecipients) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.contentEncryptionAlgorithm.hashCode()
        result = 31 * result + this.pvEncryptionAuxInfo.hashCode()
        result = 31 * result + this.cRecipients.hashCode()
        result = 31 * result + this.rgpRecipients.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hCryptProv: HcryptprovLegacy = 0uL,
            contentEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvEncryptionAuxInfo: MutPtr<CVoid> = MutPtr(0L),
            cRecipients: UInt = 0u,
            rgpRecipients: MutPtr<MutPtr<CertInfo>> = MutPtr(0L),
        ): CmsgEnvelopedEncodeInfo =
            CmsgEnvelopedEncodeInfo(
                cbSize = cbSize,
                hCryptProv = hCryptProv,
                contentEncryptionAlgorithm = contentEncryptionAlgorithm,
                pvEncryptionAuxInfoCtorArg = pvEncryptionAuxInfo,
                cRecipients = cRecipients,
                rgpRecipientsCtorArg = rgpRecipients,
            )
    }
}

public class CmsgHashedEncodeInfo internal constructor(
    public var cbSize: UInt,
    public var hCryptProv: HcryptprovLegacy,
    public var hashAlgorithm: CryptAlgorithmIdentifier,
    pvHashAuxInfoCtorArg: MutPtr<CVoid>,
) {
    public var pvHashAuxInfo: MutPtr<CVoid> = pvHashAuxInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hCryptProv = 0uL,
        hashAlgorithm = CryptAlgorithmIdentifier(),
        pvHashAuxInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): HcryptprovLegacy = this.hCryptProv

    public operator fun component3(): CryptAlgorithmIdentifier = this.hashAlgorithm

    public operator fun component4(): MutPtr<CVoid> = this.pvHashAuxInfo

    public fun copy(cbSize: UInt = this.cbSize, hCryptProv: HcryptprovLegacy = this.hCryptProv, hashAlgorithm: CryptAlgorithmIdentifier = this.hashAlgorithm, pvHashAuxInfo: MutPtr<CVoid> = this.pvHashAuxInfo): CmsgHashedEncodeInfo = CmsgHashedEncodeInfo(cbSize = cbSize, hCryptProv = hCryptProv, hashAlgorithm = hashAlgorithm, pvHashAuxInfoCtorArg = pvHashAuxInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgHashedEncodeInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.pvHashAuxInfo != other.pvHashAuxInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.pvHashAuxInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hCryptProv: HcryptprovLegacy = 0uL,
            hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvHashAuxInfo: MutPtr<CVoid> = MutPtr(0L),
        ): CmsgHashedEncodeInfo =
            CmsgHashedEncodeInfo(
                cbSize = cbSize,
                hCryptProv = hCryptProv,
                hashAlgorithm = hashAlgorithm,
                pvHashAuxInfoCtorArg = pvHashAuxInfo,
            )
    }
}

public class CmsgKeyAgreeEncryptInfo internal constructor(
    public var cbSize: UInt,
    public var dwRecipientIndex: UInt,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier,
    public var userKeyingMaterial: CryptIntegerBlob,
    public var dwOriginatorChoice: CmsgKeyAgreeOriginator,
    public var anonymous: CmsgKeyAgreeEncryptInfo0,
    public var cKeyAgreeKeyEncryptInfo: UInt,
    rgpKeyAgreeKeyEncryptInfoCtorArg: MutPtr<MutPtr<CmsgKeyAgreeKeyEncryptInfo>>,
    public var dwFlags: UInt,
) {
    public var rgpKeyAgreeKeyEncryptInfo: MutPtr<MutPtr<CmsgKeyAgreeKeyEncryptInfo>> = rgpKeyAgreeKeyEncryptInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwRecipientIndex = 0u,
        keyEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        userKeyingMaterial = CryptIntegerBlob(),
        dwOriginatorChoice = 0u,
        anonymous = CmsgKeyAgreeEncryptInfo0(),
        cKeyAgreeKeyEncryptInfo = 0u,
        rgpKeyAgreeKeyEncryptInfoCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwRecipientIndex

    public operator fun component3(): CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm

    public operator fun component4(): CryptIntegerBlob = this.userKeyingMaterial

    public operator fun component5(): CmsgKeyAgreeOriginator = this.dwOriginatorChoice

    public operator fun component6(): CmsgKeyAgreeEncryptInfo0 = this.anonymous

    public operator fun component7(): UInt = this.cKeyAgreeKeyEncryptInfo

    public operator fun component8(): MutPtr<MutPtr<CmsgKeyAgreeKeyEncryptInfo>> = this.rgpKeyAgreeKeyEncryptInfo

    public operator fun component9(): UInt = this.dwFlags

    public fun copy(cbSize: UInt = this.cbSize, dwRecipientIndex: UInt = this.dwRecipientIndex, keyEncryptionAlgorithm: CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm, userKeyingMaterial: CryptIntegerBlob = this.userKeyingMaterial, dwOriginatorChoice: CmsgKeyAgreeOriginator = this.dwOriginatorChoice, anonymous: CmsgKeyAgreeEncryptInfo0 = this.anonymous, cKeyAgreeKeyEncryptInfo: UInt = this.cKeyAgreeKeyEncryptInfo, rgpKeyAgreeKeyEncryptInfo: MutPtr<MutPtr<CmsgKeyAgreeKeyEncryptInfo>> = this.rgpKeyAgreeKeyEncryptInfo, dwFlags: UInt = this.dwFlags): CmsgKeyAgreeEncryptInfo = CmsgKeyAgreeEncryptInfo(cbSize = cbSize, dwRecipientIndex = dwRecipientIndex, keyEncryptionAlgorithm = keyEncryptionAlgorithm, userKeyingMaterial = userKeyingMaterial, dwOriginatorChoice = dwOriginatorChoice, anonymous = anonymous, cKeyAgreeKeyEncryptInfo = cKeyAgreeKeyEncryptInfo, rgpKeyAgreeKeyEncryptInfoCtorArg = rgpKeyAgreeKeyEncryptInfo, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgKeyAgreeEncryptInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwRecipientIndex != other.dwRecipientIndex) return false
        if (this.keyEncryptionAlgorithm != other.keyEncryptionAlgorithm) return false
        if (this.userKeyingMaterial != other.userKeyingMaterial) return false
        if (this.dwOriginatorChoice != other.dwOriginatorChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.cKeyAgreeKeyEncryptInfo != other.cKeyAgreeKeyEncryptInfo) return false
        if (this.rgpKeyAgreeKeyEncryptInfo != other.rgpKeyAgreeKeyEncryptInfo) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwRecipientIndex.hashCode()
        result = 31 * result + this.keyEncryptionAlgorithm.hashCode()
        result = 31 * result + this.userKeyingMaterial.hashCode()
        result = 31 * result + this.dwOriginatorChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.cKeyAgreeKeyEncryptInfo.hashCode()
        result = 31 * result + this.rgpKeyAgreeKeyEncryptInfo.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwRecipientIndex: UInt = 0u,
            keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            userKeyingMaterial: CryptIntegerBlob = CryptIntegerBlob(),
            dwOriginatorChoice: CmsgKeyAgreeOriginator = 0u,
            anonymous: CmsgKeyAgreeEncryptInfo0 = CmsgKeyAgreeEncryptInfo0(),
            cKeyAgreeKeyEncryptInfo: UInt = 0u,
            rgpKeyAgreeKeyEncryptInfo: MutPtr<MutPtr<CmsgKeyAgreeKeyEncryptInfo>> = MutPtr(0L),
            dwFlags: UInt = 0u,
        ): CmsgKeyAgreeEncryptInfo =
            CmsgKeyAgreeEncryptInfo(
                cbSize = cbSize,
                dwRecipientIndex = dwRecipientIndex,
                keyEncryptionAlgorithm = keyEncryptionAlgorithm,
                userKeyingMaterial = userKeyingMaterial,
                dwOriginatorChoice = dwOriginatorChoice,
                anonymous = anonymous,
                cKeyAgreeKeyEncryptInfo = cKeyAgreeKeyEncryptInfo,
                rgpKeyAgreeKeyEncryptInfoCtorArg = rgpKeyAgreeKeyEncryptInfo,
                dwFlags = dwFlags,
            )
    }
}

public data class CmsgKeyAgreeEncryptInfo0(
    public var originatorCertId: CertId = CertId(),
    public var originatorPublicKeyInfo: CertPublicKeyInfo = CertPublicKeyInfo(),
)

public data class CmsgKeyAgreeKeyEncryptInfo(
    public var cbSize: UInt = 0u,
    public var encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgKeyAgreeKeyEncryptInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgKeyAgreeKeyEncryptInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CmsgKeyAgreeKeyEncryptInfo =
                    CmsgKeyAgreeKeyEncryptInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CmsgKeyAgreeKeyEncryptInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 8L, value.encryptedKey)
                }
            }
    }
}

public class CmsgKeyAgreeRecipientEncodeInfo internal constructor(
    public var cbSize: UInt,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier,
    pvKeyEncryptionAuxInfoCtorArg: MutPtr<CVoid>,
    public var keyWrapAlgorithm: CryptAlgorithmIdentifier,
    pvKeyWrapAuxInfoCtorArg: MutPtr<CVoid>,
    public var hCryptProv: HcryptprovLegacy,
    public var dwKeySpec: UInt,
    public var dwKeyChoice: CmsgKeyAgreeOption,
    public var anonymous: CmsgKeyAgreeRecipientEncodeInfo0,
    public var userKeyingMaterial: CryptIntegerBlob,
    public var cRecipientEncryptedKeys: UInt,
    rgpRecipientEncryptedKeysCtorArg: MutPtr<MutPtr<CmsgRecipientEncryptedKeyEncodeInfo>>,
) {
    public var pvKeyEncryptionAuxInfo: MutPtr<CVoid> = pvKeyEncryptionAuxInfoCtorArg
        internal set

    public var pvKeyWrapAuxInfo: MutPtr<CVoid> = pvKeyWrapAuxInfoCtorArg
        internal set

    public var rgpRecipientEncryptedKeys: MutPtr<MutPtr<CmsgRecipientEncryptedKeyEncodeInfo>> = rgpRecipientEncryptedKeysCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        keyEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        pvKeyEncryptionAuxInfoCtorArg = MutPtr(0L),
        keyWrapAlgorithm = CryptAlgorithmIdentifier(),
        pvKeyWrapAuxInfoCtorArg = MutPtr(0L),
        hCryptProv = 0uL,
        dwKeySpec = 0u,
        dwKeyChoice = 0u,
        anonymous = CmsgKeyAgreeRecipientEncodeInfo0(),
        userKeyingMaterial = CryptIntegerBlob(),
        cRecipientEncryptedKeys = 0u,
        rgpRecipientEncryptedKeysCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm

    public operator fun component3(): MutPtr<CVoid> = this.pvKeyEncryptionAuxInfo

    public operator fun component4(): CryptAlgorithmIdentifier = this.keyWrapAlgorithm

    public operator fun component5(): MutPtr<CVoid> = this.pvKeyWrapAuxInfo

    public operator fun component6(): HcryptprovLegacy = this.hCryptProv

    public operator fun component7(): UInt = this.dwKeySpec

    public operator fun component8(): CmsgKeyAgreeOption = this.dwKeyChoice

    public operator fun component9(): CmsgKeyAgreeRecipientEncodeInfo0 = this.anonymous

    public operator fun component10(): CryptIntegerBlob = this.userKeyingMaterial

    public operator fun component11(): UInt = this.cRecipientEncryptedKeys

    public operator fun component12(): MutPtr<MutPtr<CmsgRecipientEncryptedKeyEncodeInfo>> = this.rgpRecipientEncryptedKeys

    public fun copy(cbSize: UInt = this.cbSize, keyEncryptionAlgorithm: CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm, pvKeyEncryptionAuxInfo: MutPtr<CVoid> = this.pvKeyEncryptionAuxInfo, keyWrapAlgorithm: CryptAlgorithmIdentifier = this.keyWrapAlgorithm, pvKeyWrapAuxInfo: MutPtr<CVoid> = this.pvKeyWrapAuxInfo, hCryptProv: HcryptprovLegacy = this.hCryptProv, dwKeySpec: UInt = this.dwKeySpec, dwKeyChoice: CmsgKeyAgreeOption = this.dwKeyChoice, anonymous: CmsgKeyAgreeRecipientEncodeInfo0 = this.anonymous, userKeyingMaterial: CryptIntegerBlob = this.userKeyingMaterial, cRecipientEncryptedKeys: UInt = this.cRecipientEncryptedKeys, rgpRecipientEncryptedKeys: MutPtr<MutPtr<CmsgRecipientEncryptedKeyEncodeInfo>> = this.rgpRecipientEncryptedKeys): CmsgKeyAgreeRecipientEncodeInfo = CmsgKeyAgreeRecipientEncodeInfo(cbSize = cbSize, keyEncryptionAlgorithm = keyEncryptionAlgorithm, pvKeyEncryptionAuxInfoCtorArg = pvKeyEncryptionAuxInfo, keyWrapAlgorithm = keyWrapAlgorithm, pvKeyWrapAuxInfoCtorArg = pvKeyWrapAuxInfo, hCryptProv = hCryptProv, dwKeySpec = dwKeySpec, dwKeyChoice = dwKeyChoice, anonymous = anonymous, userKeyingMaterial = userKeyingMaterial, cRecipientEncryptedKeys = cRecipientEncryptedKeys, rgpRecipientEncryptedKeysCtorArg = rgpRecipientEncryptedKeys)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgKeyAgreeRecipientEncodeInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.keyEncryptionAlgorithm != other.keyEncryptionAlgorithm) return false
        if (this.pvKeyEncryptionAuxInfo != other.pvKeyEncryptionAuxInfo) return false
        if (this.keyWrapAlgorithm != other.keyWrapAlgorithm) return false
        if (this.pvKeyWrapAuxInfo != other.pvKeyWrapAuxInfo) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.dwKeyChoice != other.dwKeyChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.userKeyingMaterial != other.userKeyingMaterial) return false
        if (this.cRecipientEncryptedKeys != other.cRecipientEncryptedKeys) return false
        if (this.rgpRecipientEncryptedKeys != other.rgpRecipientEncryptedKeys) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.keyEncryptionAlgorithm.hashCode()
        result = 31 * result + this.pvKeyEncryptionAuxInfo.hashCode()
        result = 31 * result + this.keyWrapAlgorithm.hashCode()
        result = 31 * result + this.pvKeyWrapAuxInfo.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.dwKeyChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.userKeyingMaterial.hashCode()
        result = 31 * result + this.cRecipientEncryptedKeys.hashCode()
        result = 31 * result + this.rgpRecipientEncryptedKeys.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvKeyEncryptionAuxInfo: MutPtr<CVoid> = MutPtr(0L),
            keyWrapAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvKeyWrapAuxInfo: MutPtr<CVoid> = MutPtr(0L),
            hCryptProv: HcryptprovLegacy = 0uL,
            dwKeySpec: UInt = 0u,
            dwKeyChoice: CmsgKeyAgreeOption = 0u,
            anonymous: CmsgKeyAgreeRecipientEncodeInfo0 = CmsgKeyAgreeRecipientEncodeInfo0(),
            userKeyingMaterial: CryptIntegerBlob = CryptIntegerBlob(),
            cRecipientEncryptedKeys: UInt = 0u,
            rgpRecipientEncryptedKeys: MutPtr<MutPtr<CmsgRecipientEncryptedKeyEncodeInfo>> = MutPtr(0L),
        ): CmsgKeyAgreeRecipientEncodeInfo =
            CmsgKeyAgreeRecipientEncodeInfo(
                cbSize = cbSize,
                keyEncryptionAlgorithm = keyEncryptionAlgorithm,
                pvKeyEncryptionAuxInfoCtorArg = pvKeyEncryptionAuxInfo,
                keyWrapAlgorithm = keyWrapAlgorithm,
                pvKeyWrapAuxInfoCtorArg = pvKeyWrapAuxInfo,
                hCryptProv = hCryptProv,
                dwKeySpec = dwKeySpec,
                dwKeyChoice = dwKeyChoice,
                anonymous = anonymous,
                userKeyingMaterial = userKeyingMaterial,
                cRecipientEncryptedKeys = cRecipientEncryptedKeys,
                rgpRecipientEncryptedKeysCtorArg = rgpRecipientEncryptedKeys,
            )
    }
}

public class CmsgKeyAgreeRecipientEncodeInfo0 internal constructor(
    pEphemeralAlgorithmCtorArg: MutPtr<CryptAlgorithmIdentifier>,
    pSenderIdCtorArg: MutPtr<CertId>,
) {
    public var pEphemeralAlgorithm: MutPtr<CryptAlgorithmIdentifier> = pEphemeralAlgorithmCtorArg
        internal set

    public var pSenderId: MutPtr<CertId> = pSenderIdCtorArg
        internal set

    public constructor() : this(
        pEphemeralAlgorithmCtorArg = MutPtr(0L),
        pSenderIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CryptAlgorithmIdentifier> = this.pEphemeralAlgorithm

    public operator fun component2(): MutPtr<CertId> = this.pSenderId

    public fun copy(pEphemeralAlgorithm: MutPtr<CryptAlgorithmIdentifier> = this.pEphemeralAlgorithm, pSenderId: MutPtr<CertId> = this.pSenderId): CmsgKeyAgreeRecipientEncodeInfo0 = CmsgKeyAgreeRecipientEncodeInfo0(pEphemeralAlgorithmCtorArg = pEphemeralAlgorithm, pSenderIdCtorArg = pSenderId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgKeyAgreeRecipientEncodeInfo0) return false
        if (this.pEphemeralAlgorithm != other.pEphemeralAlgorithm) return false
        if (this.pSenderId != other.pSenderId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pEphemeralAlgorithm.hashCode()
        result = 31 * result + this.pSenderId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pEphemeralAlgorithm: MutPtr<CryptAlgorithmIdentifier> = MutPtr(0L),
            pSenderId: MutPtr<CertId> = MutPtr(0L),
        ): CmsgKeyAgreeRecipientEncodeInfo0 =
            CmsgKeyAgreeRecipientEncodeInfo0(
                pEphemeralAlgorithmCtorArg = pEphemeralAlgorithm,
                pSenderIdCtorArg = pSenderId,
            )
    }
}

public class CmsgKeyAgreeRecipientInfo internal constructor(
    public var dwVersion: UInt,
    public var dwOriginatorChoice: CmsgKeyAgreeOriginator,
    public var anonymous: CmsgKeyAgreeRecipientInfo0,
    public var userKeyingMaterial: CryptIntegerBlob,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier,
    public var cRecipientEncryptedKeys: UInt,
    rgpRecipientEncryptedKeysCtorArg: MutPtr<MutPtr<CmsgRecipientEncryptedKeyInfo>>,
) {
    public var rgpRecipientEncryptedKeys: MutPtr<MutPtr<CmsgRecipientEncryptedKeyInfo>> = rgpRecipientEncryptedKeysCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwOriginatorChoice = 0u,
        anonymous = CmsgKeyAgreeRecipientInfo0(),
        userKeyingMaterial = CryptIntegerBlob(),
        keyEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        cRecipientEncryptedKeys = 0u,
        rgpRecipientEncryptedKeysCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): CmsgKeyAgreeOriginator = this.dwOriginatorChoice

    public operator fun component3(): CmsgKeyAgreeRecipientInfo0 = this.anonymous

    public operator fun component4(): CryptIntegerBlob = this.userKeyingMaterial

    public operator fun component5(): CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm

    public operator fun component6(): UInt = this.cRecipientEncryptedKeys

    public operator fun component7(): MutPtr<MutPtr<CmsgRecipientEncryptedKeyInfo>> = this.rgpRecipientEncryptedKeys

    public fun copy(dwVersion: UInt = this.dwVersion, dwOriginatorChoice: CmsgKeyAgreeOriginator = this.dwOriginatorChoice, anonymous: CmsgKeyAgreeRecipientInfo0 = this.anonymous, userKeyingMaterial: CryptIntegerBlob = this.userKeyingMaterial, keyEncryptionAlgorithm: CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm, cRecipientEncryptedKeys: UInt = this.cRecipientEncryptedKeys, rgpRecipientEncryptedKeys: MutPtr<MutPtr<CmsgRecipientEncryptedKeyInfo>> = this.rgpRecipientEncryptedKeys): CmsgKeyAgreeRecipientInfo = CmsgKeyAgreeRecipientInfo(dwVersion = dwVersion, dwOriginatorChoice = dwOriginatorChoice, anonymous = anonymous, userKeyingMaterial = userKeyingMaterial, keyEncryptionAlgorithm = keyEncryptionAlgorithm, cRecipientEncryptedKeys = cRecipientEncryptedKeys, rgpRecipientEncryptedKeysCtorArg = rgpRecipientEncryptedKeys)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgKeyAgreeRecipientInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwOriginatorChoice != other.dwOriginatorChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.userKeyingMaterial != other.userKeyingMaterial) return false
        if (this.keyEncryptionAlgorithm != other.keyEncryptionAlgorithm) return false
        if (this.cRecipientEncryptedKeys != other.cRecipientEncryptedKeys) return false
        if (this.rgpRecipientEncryptedKeys != other.rgpRecipientEncryptedKeys) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwOriginatorChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.userKeyingMaterial.hashCode()
        result = 31 * result + this.keyEncryptionAlgorithm.hashCode()
        result = 31 * result + this.cRecipientEncryptedKeys.hashCode()
        result = 31 * result + this.rgpRecipientEncryptedKeys.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwOriginatorChoice: CmsgKeyAgreeOriginator = 0u,
            anonymous: CmsgKeyAgreeRecipientInfo0 = CmsgKeyAgreeRecipientInfo0(),
            userKeyingMaterial: CryptIntegerBlob = CryptIntegerBlob(),
            keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            cRecipientEncryptedKeys: UInt = 0u,
            rgpRecipientEncryptedKeys: MutPtr<MutPtr<CmsgRecipientEncryptedKeyInfo>> = MutPtr(0L),
        ): CmsgKeyAgreeRecipientInfo =
            CmsgKeyAgreeRecipientInfo(
                dwVersion = dwVersion,
                dwOriginatorChoice = dwOriginatorChoice,
                anonymous = anonymous,
                userKeyingMaterial = userKeyingMaterial,
                keyEncryptionAlgorithm = keyEncryptionAlgorithm,
                cRecipientEncryptedKeys = cRecipientEncryptedKeys,
                rgpRecipientEncryptedKeysCtorArg = rgpRecipientEncryptedKeys,
            )
    }
}

public data class CmsgKeyAgreeRecipientInfo0(
    public var originatorCertId: CertId = CertId(),
    public var originatorPublicKeyInfo: CertPublicKeyInfo = CertPublicKeyInfo(),
)

public data class CmsgKeyTransEncryptInfo(
    public var cbSize: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwFlags: UInt = 0u,
)

public class CmsgKeyTransRecipientEncodeInfo internal constructor(
    public var cbSize: UInt,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier,
    pvKeyEncryptionAuxInfoCtorArg: MutPtr<CVoid>,
    public var hCryptProv: HcryptprovLegacy,
    public var recipientPublicKey: CryptBitBlob,
    public var recipientId: CertId,
) {
    public var pvKeyEncryptionAuxInfo: MutPtr<CVoid> = pvKeyEncryptionAuxInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        keyEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        pvKeyEncryptionAuxInfoCtorArg = MutPtr(0L),
        hCryptProv = 0uL,
        recipientPublicKey = CryptBitBlob(),
        recipientId = CertId(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm

    public operator fun component3(): MutPtr<CVoid> = this.pvKeyEncryptionAuxInfo

    public operator fun component4(): HcryptprovLegacy = this.hCryptProv

    public operator fun component5(): CryptBitBlob = this.recipientPublicKey

    public operator fun component6(): CertId = this.recipientId

    public fun copy(cbSize: UInt = this.cbSize, keyEncryptionAlgorithm: CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm, pvKeyEncryptionAuxInfo: MutPtr<CVoid> = this.pvKeyEncryptionAuxInfo, hCryptProv: HcryptprovLegacy = this.hCryptProv, recipientPublicKey: CryptBitBlob = this.recipientPublicKey, recipientId: CertId = this.recipientId): CmsgKeyTransRecipientEncodeInfo = CmsgKeyTransRecipientEncodeInfo(cbSize = cbSize, keyEncryptionAlgorithm = keyEncryptionAlgorithm, pvKeyEncryptionAuxInfoCtorArg = pvKeyEncryptionAuxInfo, hCryptProv = hCryptProv, recipientPublicKey = recipientPublicKey, recipientId = recipientId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgKeyTransRecipientEncodeInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.keyEncryptionAlgorithm != other.keyEncryptionAlgorithm) return false
        if (this.pvKeyEncryptionAuxInfo != other.pvKeyEncryptionAuxInfo) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.recipientPublicKey != other.recipientPublicKey) return false
        if (this.recipientId != other.recipientId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.keyEncryptionAlgorithm.hashCode()
        result = 31 * result + this.pvKeyEncryptionAuxInfo.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.recipientPublicKey.hashCode()
        result = 31 * result + this.recipientId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvKeyEncryptionAuxInfo: MutPtr<CVoid> = MutPtr(0L),
            hCryptProv: HcryptprovLegacy = 0uL,
            recipientPublicKey: CryptBitBlob = CryptBitBlob(),
            recipientId: CertId = CertId(),
        ): CmsgKeyTransRecipientEncodeInfo =
            CmsgKeyTransRecipientEncodeInfo(
                cbSize = cbSize,
                keyEncryptionAlgorithm = keyEncryptionAlgorithm,
                pvKeyEncryptionAuxInfoCtorArg = pvKeyEncryptionAuxInfo,
                hCryptProv = hCryptProv,
                recipientPublicKey = recipientPublicKey,
                recipientId = recipientId,
            )
    }
}

public data class CmsgKeyTransRecipientInfo(
    public var dwVersion: UInt = 0u,
    public var recipientId: CertId = CertId(),
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CmsgMailListEncryptInfo(
    public var cbSize: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwFlags: UInt = 0u,
)

public class CmsgMailListRecipientEncodeInfo internal constructor(
    public var cbSize: UInt,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier,
    pvKeyEncryptionAuxInfoCtorArg: MutPtr<CVoid>,
    public var hCryptProv: Int,
    public var dwKeyChoice: UInt,
    public var anonymous: CmsgMailListRecipientEncodeInfo0,
    public var keyId: CryptIntegerBlob,
    public var date: Filetime,
    pOtherAttrCtorArg: MutPtr<CryptAttributeTypeValue>,
) {
    public var pvKeyEncryptionAuxInfo: MutPtr<CVoid> = pvKeyEncryptionAuxInfoCtorArg
        internal set

    public var pOtherAttr: MutPtr<CryptAttributeTypeValue> = pOtherAttrCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        keyEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        pvKeyEncryptionAuxInfoCtorArg = MutPtr(0L),
        hCryptProv = 0,
        dwKeyChoice = 0u,
        anonymous = CmsgMailListRecipientEncodeInfo0(),
        keyId = CryptIntegerBlob(),
        date = Filetime(),
        pOtherAttrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm

    public operator fun component3(): MutPtr<CVoid> = this.pvKeyEncryptionAuxInfo

    public operator fun component4(): Int = this.hCryptProv

    public operator fun component5(): UInt = this.dwKeyChoice

    public operator fun component6(): CmsgMailListRecipientEncodeInfo0 = this.anonymous

    public operator fun component7(): CryptIntegerBlob = this.keyId

    public operator fun component8(): Filetime = this.date

    public operator fun component9(): MutPtr<CryptAttributeTypeValue> = this.pOtherAttr

    public fun copy(cbSize: UInt = this.cbSize, keyEncryptionAlgorithm: CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm, pvKeyEncryptionAuxInfo: MutPtr<CVoid> = this.pvKeyEncryptionAuxInfo, hCryptProv: Int = this.hCryptProv, dwKeyChoice: UInt = this.dwKeyChoice, anonymous: CmsgMailListRecipientEncodeInfo0 = this.anonymous, keyId: CryptIntegerBlob = this.keyId, date: Filetime = this.date, pOtherAttr: MutPtr<CryptAttributeTypeValue> = this.pOtherAttr): CmsgMailListRecipientEncodeInfo = CmsgMailListRecipientEncodeInfo(cbSize = cbSize, keyEncryptionAlgorithm = keyEncryptionAlgorithm, pvKeyEncryptionAuxInfoCtorArg = pvKeyEncryptionAuxInfo, hCryptProv = hCryptProv, dwKeyChoice = dwKeyChoice, anonymous = anonymous, keyId = keyId, date = date, pOtherAttrCtorArg = pOtherAttr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgMailListRecipientEncodeInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.keyEncryptionAlgorithm != other.keyEncryptionAlgorithm) return false
        if (this.pvKeyEncryptionAuxInfo != other.pvKeyEncryptionAuxInfo) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.dwKeyChoice != other.dwKeyChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.keyId != other.keyId) return false
        if (this.date != other.date) return false
        if (this.pOtherAttr != other.pOtherAttr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.keyEncryptionAlgorithm.hashCode()
        result = 31 * result + this.pvKeyEncryptionAuxInfo.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.dwKeyChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.keyId.hashCode()
        result = 31 * result + this.date.hashCode()
        result = 31 * result + this.pOtherAttr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvKeyEncryptionAuxInfo: MutPtr<CVoid> = MutPtr(0L),
            hCryptProv: Int = 0,
            dwKeyChoice: UInt = 0u,
            anonymous: CmsgMailListRecipientEncodeInfo0 = CmsgMailListRecipientEncodeInfo0(),
            keyId: CryptIntegerBlob = CryptIntegerBlob(),
            date: Filetime = Filetime(),
            pOtherAttr: MutPtr<CryptAttributeTypeValue> = MutPtr(0L),
        ): CmsgMailListRecipientEncodeInfo =
            CmsgMailListRecipientEncodeInfo(
                cbSize = cbSize,
                keyEncryptionAlgorithm = keyEncryptionAlgorithm,
                pvKeyEncryptionAuxInfoCtorArg = pvKeyEncryptionAuxInfo,
                hCryptProv = hCryptProv,
                dwKeyChoice = dwKeyChoice,
                anonymous = anonymous,
                keyId = keyId,
                date = date,
                pOtherAttrCtorArg = pOtherAttr,
            )
    }
}

public class CmsgMailListRecipientEncodeInfo0 internal constructor(
    public var hKeyEncryptionKey: Int,
    pvKeyEncryptionKeyCtorArg: MutPtr<CVoid>,
) {
    public var pvKeyEncryptionKey: MutPtr<CVoid> = pvKeyEncryptionKeyCtorArg
        internal set

    public constructor() : this(
        hKeyEncryptionKey = 0,
        pvKeyEncryptionKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.hKeyEncryptionKey

    public operator fun component2(): MutPtr<CVoid> = this.pvKeyEncryptionKey

    public fun copy(hKeyEncryptionKey: Int = this.hKeyEncryptionKey, pvKeyEncryptionKey: MutPtr<CVoid> = this.pvKeyEncryptionKey): CmsgMailListRecipientEncodeInfo0 = CmsgMailListRecipientEncodeInfo0(hKeyEncryptionKey = hKeyEncryptionKey, pvKeyEncryptionKeyCtorArg = pvKeyEncryptionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgMailListRecipientEncodeInfo0) return false
        if (this.hKeyEncryptionKey != other.hKeyEncryptionKey) return false
        if (this.pvKeyEncryptionKey != other.pvKeyEncryptionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hKeyEncryptionKey.hashCode()
        result = 31 * result + this.pvKeyEncryptionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hKeyEncryptionKey: Int = 0,
            pvKeyEncryptionKey: MutPtr<CVoid> = MutPtr(0L),
        ): CmsgMailListRecipientEncodeInfo0 =
            CmsgMailListRecipientEncodeInfo0(
                hKeyEncryptionKey = hKeyEncryptionKey,
                pvKeyEncryptionKeyCtorArg = pvKeyEncryptionKey,
            )
    }
}

public class CmsgMailListRecipientInfo internal constructor(
    public var dwVersion: UInt,
    public var keyId: CryptIntegerBlob,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier,
    public var encryptedKey: CryptIntegerBlob,
    public var date: Filetime,
    pOtherAttrCtorArg: MutPtr<CryptAttributeTypeValue>,
) {
    public var pOtherAttr: MutPtr<CryptAttributeTypeValue> = pOtherAttrCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        keyId = CryptIntegerBlob(),
        keyEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        encryptedKey = CryptIntegerBlob(),
        date = Filetime(),
        pOtherAttrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): CryptIntegerBlob = this.keyId

    public operator fun component3(): CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm

    public operator fun component4(): CryptIntegerBlob = this.encryptedKey

    public operator fun component5(): Filetime = this.date

    public operator fun component6(): MutPtr<CryptAttributeTypeValue> = this.pOtherAttr

    public fun copy(dwVersion: UInt = this.dwVersion, keyId: CryptIntegerBlob = this.keyId, keyEncryptionAlgorithm: CryptAlgorithmIdentifier = this.keyEncryptionAlgorithm, encryptedKey: CryptIntegerBlob = this.encryptedKey, date: Filetime = this.date, pOtherAttr: MutPtr<CryptAttributeTypeValue> = this.pOtherAttr): CmsgMailListRecipientInfo = CmsgMailListRecipientInfo(dwVersion = dwVersion, keyId = keyId, keyEncryptionAlgorithm = keyEncryptionAlgorithm, encryptedKey = encryptedKey, date = date, pOtherAttrCtorArg = pOtherAttr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgMailListRecipientInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.keyId != other.keyId) return false
        if (this.keyEncryptionAlgorithm != other.keyEncryptionAlgorithm) return false
        if (this.encryptedKey != other.encryptedKey) return false
        if (this.date != other.date) return false
        if (this.pOtherAttr != other.pOtherAttr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.keyId.hashCode()
        result = 31 * result + this.keyEncryptionAlgorithm.hashCode()
        result = 31 * result + this.encryptedKey.hashCode()
        result = 31 * result + this.date.hashCode()
        result = 31 * result + this.pOtherAttr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            keyId: CryptIntegerBlob = CryptIntegerBlob(),
            keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
            date: Filetime = Filetime(),
            pOtherAttr: MutPtr<CryptAttributeTypeValue> = MutPtr(0L),
        ): CmsgMailListRecipientInfo =
            CmsgMailListRecipientInfo(
                dwVersion = dwVersion,
                keyId = keyId,
                keyEncryptionAlgorithm = keyEncryptionAlgorithm,
                encryptedKey = encryptedKey,
                date = date,
                pOtherAttrCtorArg = pOtherAttr,
            )
    }
}

public data class CmsgRc2AuxInfo(
    public var cbSize: UInt = 0u,
    public var dwBitLen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgRc2AuxInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgRc2AuxInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CmsgRc2AuxInfo =
                    CmsgRc2AuxInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CmsgRc2AuxInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwBitLen)
                }
            }
    }
}

public data class CmsgRc4AuxInfo(
    public var cbSize: UInt = 0u,
    public var dwBitLen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgRc4AuxInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgRc4AuxInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CmsgRc4AuxInfo =
                    CmsgRc4AuxInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CmsgRc4AuxInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwBitLen)
                }
            }
    }
}

public data class CmsgRecipientEncodeInfo(
    public var dwRecipientChoice: UInt = 0u,
    public var anonymous: CmsgRecipientEncodeInfo0 = CmsgRecipientEncodeInfo0(),
)

public class CmsgRecipientEncodeInfo0 internal constructor(
    pKeyTransCtorArg: MutPtr<CmsgKeyTransRecipientEncodeInfo>,
    pKeyAgreeCtorArg: MutPtr<CmsgKeyAgreeRecipientEncodeInfo>,
    pMailListCtorArg: MutPtr<CmsgMailListRecipientEncodeInfo>,
) {
    public var pKeyTrans: MutPtr<CmsgKeyTransRecipientEncodeInfo> = pKeyTransCtorArg
        internal set

    public var pKeyAgree: MutPtr<CmsgKeyAgreeRecipientEncodeInfo> = pKeyAgreeCtorArg
        internal set

    public var pMailList: MutPtr<CmsgMailListRecipientEncodeInfo> = pMailListCtorArg
        internal set

    public constructor() : this(
        pKeyTransCtorArg = MutPtr(0L),
        pKeyAgreeCtorArg = MutPtr(0L),
        pMailListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CmsgKeyTransRecipientEncodeInfo> = this.pKeyTrans

    public operator fun component2(): MutPtr<CmsgKeyAgreeRecipientEncodeInfo> = this.pKeyAgree

    public operator fun component3(): MutPtr<CmsgMailListRecipientEncodeInfo> = this.pMailList

    public fun copy(pKeyTrans: MutPtr<CmsgKeyTransRecipientEncodeInfo> = this.pKeyTrans, pKeyAgree: MutPtr<CmsgKeyAgreeRecipientEncodeInfo> = this.pKeyAgree, pMailList: MutPtr<CmsgMailListRecipientEncodeInfo> = this.pMailList): CmsgRecipientEncodeInfo0 = CmsgRecipientEncodeInfo0(pKeyTransCtorArg = pKeyTrans, pKeyAgreeCtorArg = pKeyAgree, pMailListCtorArg = pMailList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgRecipientEncodeInfo0) return false
        if (this.pKeyTrans != other.pKeyTrans) return false
        if (this.pKeyAgree != other.pKeyAgree) return false
        if (this.pMailList != other.pMailList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pKeyTrans.hashCode()
        result = 31 * result + this.pKeyAgree.hashCode()
        result = 31 * result + this.pMailList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pKeyTrans: MutPtr<CmsgKeyTransRecipientEncodeInfo> = MutPtr(0L),
            pKeyAgree: MutPtr<CmsgKeyAgreeRecipientEncodeInfo> = MutPtr(0L),
            pMailList: MutPtr<CmsgMailListRecipientEncodeInfo> = MutPtr(0L),
        ): CmsgRecipientEncodeInfo0 =
            CmsgRecipientEncodeInfo0(
                pKeyTransCtorArg = pKeyTrans,
                pKeyAgreeCtorArg = pKeyAgree,
                pMailListCtorArg = pMailList,
            )
    }
}

public class CmsgRecipientEncryptedKeyEncodeInfo internal constructor(
    public var cbSize: UInt,
    public var recipientPublicKey: CryptBitBlob,
    public var recipientId: CertId,
    public var date: Filetime,
    pOtherAttrCtorArg: MutPtr<CryptAttributeTypeValue>,
) {
    public var pOtherAttr: MutPtr<CryptAttributeTypeValue> = pOtherAttrCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        recipientPublicKey = CryptBitBlob(),
        recipientId = CertId(),
        date = Filetime(),
        pOtherAttrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CryptBitBlob = this.recipientPublicKey

    public operator fun component3(): CertId = this.recipientId

    public operator fun component4(): Filetime = this.date

    public operator fun component5(): MutPtr<CryptAttributeTypeValue> = this.pOtherAttr

    public fun copy(cbSize: UInt = this.cbSize, recipientPublicKey: CryptBitBlob = this.recipientPublicKey, recipientId: CertId = this.recipientId, date: Filetime = this.date, pOtherAttr: MutPtr<CryptAttributeTypeValue> = this.pOtherAttr): CmsgRecipientEncryptedKeyEncodeInfo = CmsgRecipientEncryptedKeyEncodeInfo(cbSize = cbSize, recipientPublicKey = recipientPublicKey, recipientId = recipientId, date = date, pOtherAttrCtorArg = pOtherAttr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgRecipientEncryptedKeyEncodeInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.recipientPublicKey != other.recipientPublicKey) return false
        if (this.recipientId != other.recipientId) return false
        if (this.date != other.date) return false
        if (this.pOtherAttr != other.pOtherAttr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.recipientPublicKey.hashCode()
        result = 31 * result + this.recipientId.hashCode()
        result = 31 * result + this.date.hashCode()
        result = 31 * result + this.pOtherAttr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            recipientPublicKey: CryptBitBlob = CryptBitBlob(),
            recipientId: CertId = CertId(),
            date: Filetime = Filetime(),
            pOtherAttr: MutPtr<CryptAttributeTypeValue> = MutPtr(0L),
        ): CmsgRecipientEncryptedKeyEncodeInfo =
            CmsgRecipientEncryptedKeyEncodeInfo(
                cbSize = cbSize,
                recipientPublicKey = recipientPublicKey,
                recipientId = recipientId,
                date = date,
                pOtherAttrCtorArg = pOtherAttr,
            )
    }
}

public class CmsgRecipientEncryptedKeyInfo internal constructor(
    public var recipientId: CertId,
    public var encryptedKey: CryptIntegerBlob,
    public var date: Filetime,
    pOtherAttrCtorArg: MutPtr<CryptAttributeTypeValue>,
) {
    public var pOtherAttr: MutPtr<CryptAttributeTypeValue> = pOtherAttrCtorArg
        internal set

    public constructor() : this(
        recipientId = CertId(),
        encryptedKey = CryptIntegerBlob(),
        date = Filetime(),
        pOtherAttrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CertId = this.recipientId

    public operator fun component2(): CryptIntegerBlob = this.encryptedKey

    public operator fun component3(): Filetime = this.date

    public operator fun component4(): MutPtr<CryptAttributeTypeValue> = this.pOtherAttr

    public fun copy(recipientId: CertId = this.recipientId, encryptedKey: CryptIntegerBlob = this.encryptedKey, date: Filetime = this.date, pOtherAttr: MutPtr<CryptAttributeTypeValue> = this.pOtherAttr): CmsgRecipientEncryptedKeyInfo = CmsgRecipientEncryptedKeyInfo(recipientId = recipientId, encryptedKey = encryptedKey, date = date, pOtherAttrCtorArg = pOtherAttr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgRecipientEncryptedKeyInfo) return false
        if (this.recipientId != other.recipientId) return false
        if (this.encryptedKey != other.encryptedKey) return false
        if (this.date != other.date) return false
        if (this.pOtherAttr != other.pOtherAttr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recipientId.hashCode()
        result = 31 * result + this.encryptedKey.hashCode()
        result = 31 * result + this.date.hashCode()
        result = 31 * result + this.pOtherAttr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            recipientId: CertId = CertId(),
            encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
            date: Filetime = Filetime(),
            pOtherAttr: MutPtr<CryptAttributeTypeValue> = MutPtr(0L),
        ): CmsgRecipientEncryptedKeyInfo =
            CmsgRecipientEncryptedKeyInfo(
                recipientId = recipientId,
                encryptedKey = encryptedKey,
                date = date,
                pOtherAttrCtorArg = pOtherAttr,
            )
    }
}

public data class CmsgSignedAndEnvelopedEncodeInfo(
    public var cbSize: UInt = 0u,
    public var signedInfo: CmsgSignedEncodeInfo = CmsgSignedEncodeInfo(),
    public var envelopedInfo: CmsgEnvelopedEncodeInfo = CmsgEnvelopedEncodeInfo(),
)

public class CmsgSignedEncodeInfo internal constructor(
    public var cbSize: UInt,
    public var cSigners: UInt,
    rgSignersCtorArg: MutPtr<CmsgSignerEncodeInfo>,
    public var cCertEncoded: UInt,
    rgCertEncodedCtorArg: MutPtr<CryptIntegerBlob>,
    public var cCrlEncoded: UInt,
    rgCrlEncodedCtorArg: MutPtr<CryptIntegerBlob>,
) {
    public var rgSigners: MutPtr<CmsgSignerEncodeInfo> = rgSignersCtorArg
        internal set

    public var rgCertEncoded: MutPtr<CryptIntegerBlob> = rgCertEncodedCtorArg
        internal set

    public var rgCrlEncoded: MutPtr<CryptIntegerBlob> = rgCrlEncodedCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        cSigners = 0u,
        rgSignersCtorArg = MutPtr(0L),
        cCertEncoded = 0u,
        rgCertEncodedCtorArg = MutPtr(0L),
        cCrlEncoded = 0u,
        rgCrlEncodedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.cSigners

    public operator fun component3(): MutPtr<CmsgSignerEncodeInfo> = this.rgSigners

    public operator fun component4(): UInt = this.cCertEncoded

    public operator fun component5(): MutPtr<CryptIntegerBlob> = this.rgCertEncoded

    public operator fun component6(): UInt = this.cCrlEncoded

    public operator fun component7(): MutPtr<CryptIntegerBlob> = this.rgCrlEncoded

    public fun copy(cbSize: UInt = this.cbSize, cSigners: UInt = this.cSigners, rgSigners: MutPtr<CmsgSignerEncodeInfo> = this.rgSigners, cCertEncoded: UInt = this.cCertEncoded, rgCertEncoded: MutPtr<CryptIntegerBlob> = this.rgCertEncoded, cCrlEncoded: UInt = this.cCrlEncoded, rgCrlEncoded: MutPtr<CryptIntegerBlob> = this.rgCrlEncoded): CmsgSignedEncodeInfo = CmsgSignedEncodeInfo(cbSize = cbSize, cSigners = cSigners, rgSignersCtorArg = rgSigners, cCertEncoded = cCertEncoded, rgCertEncodedCtorArg = rgCertEncoded, cCrlEncoded = cCrlEncoded, rgCrlEncodedCtorArg = rgCrlEncoded)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgSignedEncodeInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.cSigners != other.cSigners) return false
        if (this.rgSigners != other.rgSigners) return false
        if (this.cCertEncoded != other.cCertEncoded) return false
        if (this.rgCertEncoded != other.rgCertEncoded) return false
        if (this.cCrlEncoded != other.cCrlEncoded) return false
        if (this.rgCrlEncoded != other.rgCrlEncoded) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.cSigners.hashCode()
        result = 31 * result + this.rgSigners.hashCode()
        result = 31 * result + this.cCertEncoded.hashCode()
        result = 31 * result + this.rgCertEncoded.hashCode()
        result = 31 * result + this.cCrlEncoded.hashCode()
        result = 31 * result + this.rgCrlEncoded.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgSignedEncodeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgSignedEncodeInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CmsgSignedEncodeInfo =
                    CmsgSignedEncodeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmsgSignerEncodeInfo>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CryptIntegerBlob>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CryptIntegerBlob>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CmsgSignedEncodeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cSigners)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmsgSignerEncodeInfo>(64)
                    ).writeNative(addr + 8L, value.rgSigners)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cCertEncoded)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CryptIntegerBlob>(64)
                    ).writeNative(addr + 24L, value.rgCertEncoded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cCrlEncoded)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CryptIntegerBlob>(64)
                    ).writeNative(addr + 40L, value.rgCrlEncoded)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            cSigners: UInt = 0u,
            rgSigners: MutPtr<CmsgSignerEncodeInfo> = MutPtr(0L),
            cCertEncoded: UInt = 0u,
            rgCertEncoded: MutPtr<CryptIntegerBlob> = MutPtr(0L),
            cCrlEncoded: UInt = 0u,
            rgCrlEncoded: MutPtr<CryptIntegerBlob> = MutPtr(0L),
        ): CmsgSignedEncodeInfo =
            CmsgSignedEncodeInfo(
                cbSize = cbSize,
                cSigners = cSigners,
                rgSignersCtorArg = rgSigners,
                cCertEncoded = cCertEncoded,
                rgCertEncodedCtorArg = rgCertEncoded,
                cCrlEncoded = cCrlEncoded,
                rgCrlEncodedCtorArg = rgCrlEncoded,
            )
    }
}

public class CmsgSignerEncodeInfo internal constructor(
    public var cbSize: UInt,
    pCertInfoCtorArg: MutPtr<CertInfo>,
    public var anonymous: CmsgSignerEncodeInfo0,
    public var dwKeySpec: UInt,
    public var hashAlgorithm: CryptAlgorithmIdentifier,
    pvHashAuxInfoCtorArg: MutPtr<CVoid>,
    public var cAuthAttr: UInt,
    rgAuthAttrCtorArg: MutPtr<CryptAttribute>,
    public var cUnauthAttr: UInt,
    rgUnauthAttrCtorArg: MutPtr<CryptAttribute>,
) {
    public var pCertInfo: MutPtr<CertInfo> = pCertInfoCtorArg
        internal set

    public var pvHashAuxInfo: MutPtr<CVoid> = pvHashAuxInfoCtorArg
        internal set

    public var rgAuthAttr: MutPtr<CryptAttribute> = rgAuthAttrCtorArg
        internal set

    public var rgUnauthAttr: MutPtr<CryptAttribute> = rgUnauthAttrCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pCertInfoCtorArg = MutPtr(0L),
        anonymous = CmsgSignerEncodeInfo0(),
        dwKeySpec = 0u,
        hashAlgorithm = CryptAlgorithmIdentifier(),
        pvHashAuxInfoCtorArg = MutPtr(0L),
        cAuthAttr = 0u,
        rgAuthAttrCtorArg = MutPtr(0L),
        cUnauthAttr = 0u,
        rgUnauthAttrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<CertInfo> = this.pCertInfo

    public operator fun component3(): CmsgSignerEncodeInfo0 = this.anonymous

    public operator fun component4(): UInt = this.dwKeySpec

    public operator fun component5(): CryptAlgorithmIdentifier = this.hashAlgorithm

    public operator fun component6(): MutPtr<CVoid> = this.pvHashAuxInfo

    public operator fun component7(): UInt = this.cAuthAttr

    public operator fun component8(): MutPtr<CryptAttribute> = this.rgAuthAttr

    public operator fun component9(): UInt = this.cUnauthAttr

    public operator fun component10(): MutPtr<CryptAttribute> = this.rgUnauthAttr

    public fun copy(cbSize: UInt = this.cbSize, pCertInfo: MutPtr<CertInfo> = this.pCertInfo, anonymous: CmsgSignerEncodeInfo0 = this.anonymous, dwKeySpec: UInt = this.dwKeySpec, hashAlgorithm: CryptAlgorithmIdentifier = this.hashAlgorithm, pvHashAuxInfo: MutPtr<CVoid> = this.pvHashAuxInfo, cAuthAttr: UInt = this.cAuthAttr, rgAuthAttr: MutPtr<CryptAttribute> = this.rgAuthAttr, cUnauthAttr: UInt = this.cUnauthAttr, rgUnauthAttr: MutPtr<CryptAttribute> = this.rgUnauthAttr): CmsgSignerEncodeInfo = CmsgSignerEncodeInfo(cbSize = cbSize, pCertInfoCtorArg = pCertInfo, anonymous = anonymous, dwKeySpec = dwKeySpec, hashAlgorithm = hashAlgorithm, pvHashAuxInfoCtorArg = pvHashAuxInfo, cAuthAttr = cAuthAttr, rgAuthAttrCtorArg = rgAuthAttr, cUnauthAttr = cUnauthAttr, rgUnauthAttrCtorArg = rgUnauthAttr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgSignerEncodeInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pCertInfo != other.pCertInfo) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.pvHashAuxInfo != other.pvHashAuxInfo) return false
        if (this.cAuthAttr != other.cAuthAttr) return false
        if (this.rgAuthAttr != other.rgAuthAttr) return false
        if (this.cUnauthAttr != other.cUnauthAttr) return false
        if (this.rgUnauthAttr != other.rgUnauthAttr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pCertInfo.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.pvHashAuxInfo.hashCode()
        result = 31 * result + this.cAuthAttr.hashCode()
        result = 31 * result + this.rgAuthAttr.hashCode()
        result = 31 * result + this.cUnauthAttr.hashCode()
        result = 31 * result + this.rgUnauthAttr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pCertInfo: MutPtr<CertInfo> = MutPtr(0L),
            anonymous: CmsgSignerEncodeInfo0 = CmsgSignerEncodeInfo0(),
            dwKeySpec: UInt = 0u,
            hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvHashAuxInfo: MutPtr<CVoid> = MutPtr(0L),
            cAuthAttr: UInt = 0u,
            rgAuthAttr: MutPtr<CryptAttribute> = MutPtr(0L),
            cUnauthAttr: UInt = 0u,
            rgUnauthAttr: MutPtr<CryptAttribute> = MutPtr(0L),
        ): CmsgSignerEncodeInfo =
            CmsgSignerEncodeInfo(
                cbSize = cbSize,
                pCertInfoCtorArg = pCertInfo,
                anonymous = anonymous,
                dwKeySpec = dwKeySpec,
                hashAlgorithm = hashAlgorithm,
                pvHashAuxInfoCtorArg = pvHashAuxInfo,
                cAuthAttr = cAuthAttr,
                rgAuthAttrCtorArg = rgAuthAttr,
                cUnauthAttr = cUnauthAttr,
                rgUnauthAttrCtorArg = rgUnauthAttr,
            )
    }
}

public data class CmsgSignerEncodeInfo0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public data class CmsgSignerInfo(
    public var dwVersion: UInt = 0u,
    public var issuer: CryptIntegerBlob = CryptIntegerBlob(),
    public var serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var hashEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedHash: CryptIntegerBlob = CryptIntegerBlob(),
    public var authAttrs: CryptAttributes = CryptAttributes(),
    public var unauthAttrs: CryptAttributes = CryptAttributes(),
)

public data class CmsgSp3CompatibleAuxInfo(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgSp3CompatibleAuxInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsgSp3CompatibleAuxInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CmsgSp3CompatibleAuxInfo =
                    CmsgSp3CompatibleAuxInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CmsgSp3CompatibleAuxInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public class CmsgStreamInfo internal constructor(
    public var cbContent: UInt,
    public var pfnStreamOutput: PfnCmsgStreamOutput,
    pvArgCtorArg: MutPtr<CVoid>,
) {
    public var pvArg: MutPtr<CVoid> = pvArgCtorArg
        internal set

    public constructor() : this(
        cbContent = 0u,
        pfnStreamOutput = null,
        pvArgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbContent

    public operator fun component2(): PfnCmsgStreamOutput = this.pfnStreamOutput

    public operator fun component3(): MutPtr<CVoid> = this.pvArg

    public fun copy(cbContent: UInt = this.cbContent, pfnStreamOutput: PfnCmsgStreamOutput = this.pfnStreamOutput, pvArg: MutPtr<CVoid> = this.pvArg): CmsgStreamInfo = CmsgStreamInfo(cbContent = cbContent, pfnStreamOutput = pfnStreamOutput, pvArgCtorArg = pvArg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsgStreamInfo) return false
        if (this.cbContent != other.cbContent) return false
        if (this.pfnStreamOutput != other.pfnStreamOutput) return false
        if (this.pvArg != other.pvArg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbContent.hashCode()
        result = 31 * result + this.pfnStreamOutput.hashCode()
        result = 31 * result + this.pvArg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbContent: UInt = 0u,
            pfnStreamOutput: PfnCmsgStreamOutput = null,
            pvArg: MutPtr<CVoid> = MutPtr(0L),
        ): CmsgStreamInfo =
            CmsgStreamInfo(
                cbContent = cbContent,
                pfnStreamOutput = pfnStreamOutput,
                pvArgCtorArg = pvArg,
            )
    }
}

public class CmsDhKeyInfo internal constructor(
    public var dwVersion: UInt,
    public var algid: AlgId,
    pszContentEncObjIdCtorArg: Pstr,
    public var pubInfo: CryptIntegerBlob,
    pReservedCtorArg: MutPtr<CVoid>,
) {
    public var pszContentEncObjId: Pstr = pszContentEncObjIdCtorArg
        internal set

    public var pReserved: MutPtr<CVoid> = pReservedCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        algid = 0u,
        pszContentEncObjIdCtorArg = MutPtr(0L),
        pubInfo = CryptIntegerBlob(),
        pReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): AlgId = this.algid

    public operator fun component3(): Pstr = this.pszContentEncObjId

    public operator fun component4(): CryptIntegerBlob = this.pubInfo

    public operator fun component5(): MutPtr<CVoid> = this.pReserved

    public fun copy(dwVersion: UInt = this.dwVersion, algid: AlgId = this.algid, pszContentEncObjId: Pstr = this.pszContentEncObjId, pubInfo: CryptIntegerBlob = this.pubInfo, pReserved: MutPtr<CVoid> = this.pReserved): CmsDhKeyInfo = CmsDhKeyInfo(dwVersion = dwVersion, algid = algid, pszContentEncObjIdCtorArg = pszContentEncObjId, pubInfo = pubInfo, pReservedCtorArg = pReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsDhKeyInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.algid != other.algid) return false
        if (this.pszContentEncObjId != other.pszContentEncObjId) return false
        if (this.pubInfo != other.pubInfo) return false
        if (this.pReserved != other.pReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.algid.hashCode()
        result = 31 * result + this.pszContentEncObjId.hashCode()
        result = 31 * result + this.pubInfo.hashCode()
        result = 31 * result + this.pReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            algid: AlgId = 0u,
            pszContentEncObjId: Pstr = MutPtr(0L),
            pubInfo: CryptIntegerBlob = CryptIntegerBlob(),
            pReserved: MutPtr<CVoid> = MutPtr(0L),
        ): CmsDhKeyInfo =
            CmsDhKeyInfo(
                dwVersion = dwVersion,
                algid = algid,
                pszContentEncObjIdCtorArg = pszContentEncObjId,
                pubInfo = pubInfo,
                pReservedCtorArg = pReserved,
            )
    }
}

public class CmsKeyInfo internal constructor(
    public var dwVersion: UInt,
    public var algid: AlgId,
    pbOIDCtorArg: MutPtr<UByte>,
    public var cbOID: UInt,
) {
    public var pbOID: MutPtr<UByte> = pbOIDCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        algid = 0u,
        pbOIDCtorArg = MutPtr(0L),
        cbOID = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): AlgId = this.algid

    public operator fun component3(): MutPtr<UByte> = this.pbOID

    public operator fun component4(): UInt = this.cbOID

    public fun copy(dwVersion: UInt = this.dwVersion, algid: AlgId = this.algid, pbOID: MutPtr<UByte> = this.pbOID, cbOID: UInt = this.cbOID): CmsKeyInfo = CmsKeyInfo(dwVersion = dwVersion, algid = algid, pbOIDCtorArg = pbOID, cbOID = cbOID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmsKeyInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.algid != other.algid) return false
        if (this.pbOID != other.pbOID) return false
        if (this.cbOID != other.cbOID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.algid.hashCode()
        result = 31 * result + this.pbOID.hashCode()
        result = 31 * result + this.cbOID.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsKeyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmsKeyInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CmsKeyInfo =
                    CmsKeyInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CmsKeyInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.algid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbOID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbOID)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            algid: AlgId = 0u,
            pbOID: MutPtr<UByte> = MutPtr(0L),
            cbOID: UInt = 0u,
        ): CmsKeyInfo =
            CmsKeyInfo(
                dwVersion = dwVersion,
                algid = algid,
                pbOIDCtorArg = pbOID,
                cbOID = cbOID,
            )
    }
}

public class ContainerInfo internal constructor(
    public var dwVersion: UInt,
    public var dwReserved: UInt,
    public var cbSigPublicKey: UInt,
    pbSigPublicKeyCtorArg: MutPtr<UByte>,
    public var cbKeyExPublicKey: UInt,
    pbKeyExPublicKeyCtorArg: MutPtr<UByte>,
) {
    public var pbSigPublicKey: MutPtr<UByte> = pbSigPublicKeyCtorArg
        internal set

    public var pbKeyExPublicKey: MutPtr<UByte> = pbKeyExPublicKeyCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwReserved = 0u,
        cbSigPublicKey = 0u,
        pbSigPublicKeyCtorArg = MutPtr(0L),
        cbKeyExPublicKey = 0u,
        pbKeyExPublicKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.dwReserved

    public operator fun component3(): UInt = this.cbSigPublicKey

    public operator fun component4(): MutPtr<UByte> = this.pbSigPublicKey

    public operator fun component5(): UInt = this.cbKeyExPublicKey

    public operator fun component6(): MutPtr<UByte> = this.pbKeyExPublicKey

    public fun copy(dwVersion: UInt = this.dwVersion, dwReserved: UInt = this.dwReserved, cbSigPublicKey: UInt = this.cbSigPublicKey, pbSigPublicKey: MutPtr<UByte> = this.pbSigPublicKey, cbKeyExPublicKey: UInt = this.cbKeyExPublicKey, pbKeyExPublicKey: MutPtr<UByte> = this.pbKeyExPublicKey): ContainerInfo = ContainerInfo(dwVersion = dwVersion, dwReserved = dwReserved, cbSigPublicKey = cbSigPublicKey, pbSigPublicKeyCtorArg = pbSigPublicKey, cbKeyExPublicKey = cbKeyExPublicKey, pbKeyExPublicKeyCtorArg = pbKeyExPublicKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ContainerInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.cbSigPublicKey != other.cbSigPublicKey) return false
        if (this.pbSigPublicKey != other.pbSigPublicKey) return false
        if (this.cbKeyExPublicKey != other.cbKeyExPublicKey) return false
        if (this.pbKeyExPublicKey != other.pbKeyExPublicKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.cbSigPublicKey.hashCode()
        result = 31 * result + this.pbSigPublicKey.hashCode()
        result = 31 * result + this.cbKeyExPublicKey.hashCode()
        result = 31 * result + this.pbKeyExPublicKey.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ContainerInfo =
                    ContainerInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: ContainerInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbSigPublicKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.pbSigPublicKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbKeyExPublicKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.pbKeyExPublicKey)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwReserved: UInt = 0u,
            cbSigPublicKey: UInt = 0u,
            pbSigPublicKey: MutPtr<UByte> = MutPtr(0L),
            cbKeyExPublicKey: UInt = 0u,
            pbKeyExPublicKey: MutPtr<UByte> = MutPtr(0L),
        ): ContainerInfo =
            ContainerInfo(
                dwVersion = dwVersion,
                dwReserved = dwReserved,
                cbSigPublicKey = cbSigPublicKey,
                pbSigPublicKeyCtorArg = pbSigPublicKey,
                cbKeyExPublicKey = cbKeyExPublicKey,
                pbKeyExPublicKeyCtorArg = pbKeyExPublicKey,
            )
    }
}

public data class ContainerMapRecord(
    public var wszGuid: UShortArray = UShortArray(40),
    public var bFlags: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var wSigKeySizeBits: UShort = 0u,
    public var wKeyExchangeKeySizeBits: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ContainerMapRecord) return false
        if (!this.wszGuid.contentEquals(other.wszGuid)) return false
        if (this.bFlags != other.bFlags) return false
        if (this.bReserved != other.bReserved) return false
        if (this.wSigKeySizeBits != other.wSigKeySizeBits) return false
        if (this.wKeyExchangeKeySizeBits != other.wKeyExchangeKeySizeBits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszGuid.contentHashCode()
        result = 31 * result + this.bFlags.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.wSigKeySizeBits.hashCode()
        result = 31 * result + this.wKeyExchangeKeySizeBits.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerMapRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerMapRecord> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 86L
                override fun readNative(addr: Long): ContainerMapRecord =
                    ContainerMapRecord(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 81L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 82L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 84L),
                    )
                override fun writeNative(addr: Long, value: ContainerMapRecord) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                    ).writeNative(addr, value.wszGuid.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 80L, value.bFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 81L, value.bReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 82L, value.wSigKeySizeBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 84L, value.wKeyExchangeKeySizeBits)
                }
            }
    }
}

public class CpsUrls internal constructor(
    pszURLCtorArg: Pwstr,
    pAlgorithmCtorArg: MutPtr<CryptAlgorithmIdentifier>,
    pDigestCtorArg: MutPtr<CryptIntegerBlob>,
) {
    public var pszURL: Pwstr = pszURLCtorArg
        internal set

    public var pAlgorithm: MutPtr<CryptAlgorithmIdentifier> = pAlgorithmCtorArg
        internal set

    public var pDigest: MutPtr<CryptIntegerBlob> = pDigestCtorArg
        internal set

    public constructor() : this(
        pszURLCtorArg = MutPtr(0L),
        pAlgorithmCtorArg = MutPtr(0L),
        pDigestCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszURL

    public operator fun component2(): MutPtr<CryptAlgorithmIdentifier> = this.pAlgorithm

    public operator fun component3(): MutPtr<CryptIntegerBlob> = this.pDigest

    public fun copy(pszURL: Pwstr = this.pszURL, pAlgorithm: MutPtr<CryptAlgorithmIdentifier> = this.pAlgorithm, pDigest: MutPtr<CryptIntegerBlob> = this.pDigest): CpsUrls = CpsUrls(pszURLCtorArg = pszURL, pAlgorithmCtorArg = pAlgorithm, pDigestCtorArg = pDigest)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpsUrls) return false
        if (this.pszURL != other.pszURL) return false
        if (this.pAlgorithm != other.pAlgorithm) return false
        if (this.pDigest != other.pDigest) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszURL.hashCode()
        result = 31 * result + this.pAlgorithm.hashCode()
        result = 31 * result + this.pDigest.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszURL: Pwstr = MutPtr(0L),
            pAlgorithm: MutPtr<CryptAlgorithmIdentifier> = MutPtr(0L),
            pDigest: MutPtr<CryptIntegerBlob> = MutPtr(0L),
        ): CpsUrls =
            CpsUrls(
                pszURLCtorArg = pszURL,
                pAlgorithmCtorArg = pAlgorithm,
                pDigestCtorArg = pDigest,
            )
    }
}

public class CrlContext internal constructor(
    public var dwCertEncodingType: CertQueryEncodingType,
    pbCrlEncodedCtorArg: MutPtr<UByte>,
    public var cbCrlEncoded: UInt,
    pCrlInfoCtorArg: MutPtr<CrlInfo>,
    hCertStoreCtorArg: Hcertstore,
) {
    public var pbCrlEncoded: MutPtr<UByte> = pbCrlEncodedCtorArg
        internal set

    public var pCrlInfo: MutPtr<CrlInfo> = pCrlInfoCtorArg
        internal set

    public var hCertStore: Hcertstore = hCertStoreCtorArg
        internal set

    public constructor() : this(
        dwCertEncodingType = 0u,
        pbCrlEncodedCtorArg = MutPtr(0L),
        cbCrlEncoded = 0u,
        pCrlInfoCtorArg = MutPtr(0L),
        hCertStoreCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CertQueryEncodingType = this.dwCertEncodingType

    public operator fun component2(): MutPtr<UByte> = this.pbCrlEncoded

    public operator fun component3(): UInt = this.cbCrlEncoded

    public operator fun component4(): MutPtr<CrlInfo> = this.pCrlInfo

    public operator fun component5(): Hcertstore = this.hCertStore

    public fun copy(dwCertEncodingType: CertQueryEncodingType = this.dwCertEncodingType, pbCrlEncoded: MutPtr<UByte> = this.pbCrlEncoded, cbCrlEncoded: UInt = this.cbCrlEncoded, pCrlInfo: MutPtr<CrlInfo> = this.pCrlInfo, hCertStore: Hcertstore = this.hCertStore): CrlContext = CrlContext(dwCertEncodingType = dwCertEncodingType, pbCrlEncodedCtorArg = pbCrlEncoded, cbCrlEncoded = cbCrlEncoded, pCrlInfoCtorArg = pCrlInfo, hCertStoreCtorArg = hCertStore)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CrlContext) return false
        if (this.dwCertEncodingType != other.dwCertEncodingType) return false
        if (this.pbCrlEncoded != other.pbCrlEncoded) return false
        if (this.cbCrlEncoded != other.cbCrlEncoded) return false
        if (this.pCrlInfo != other.pCrlInfo) return false
        if (this.hCertStore != other.hCertStore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCertEncodingType.hashCode()
        result = 31 * result + this.pbCrlEncoded.hashCode()
        result = 31 * result + this.cbCrlEncoded.hashCode()
        result = 31 * result + this.pCrlInfo.hashCode()
        result = 31 * result + this.hCertStore.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrlContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrlContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CrlContext =
                    CrlContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CrlInfo>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CrlContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCertEncodingType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbCrlEncoded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbCrlEncoded)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CrlInfo>(64)
                    ).writeNative(addr + 24L, value.pCrlInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.hCertStore)
                }
            }

        public operator fun invoke(
            dwCertEncodingType: CertQueryEncodingType = 0u,
            pbCrlEncoded: MutPtr<UByte> = MutPtr(0L),
            cbCrlEncoded: UInt = 0u,
            pCrlInfo: MutPtr<CrlInfo> = MutPtr(0L),
            hCertStore: Hcertstore = MutPtr(0L),
        ): CrlContext =
            CrlContext(
                dwCertEncodingType = dwCertEncodingType,
                pbCrlEncodedCtorArg = pbCrlEncoded,
                cbCrlEncoded = cbCrlEncoded,
                pCrlInfoCtorArg = pCrlInfo,
                hCertStoreCtorArg = hCertStore,
            )
    }
}

public data class CrlDistPoint(
    public var distPointName: CrlDistPointName = CrlDistPointName(),
    public var reasonFlags: CryptBitBlob = CryptBitBlob(),
    public var cRLIssuer: CertAltNameInfo = CertAltNameInfo(),
)

public class CrlDistPointsInfo internal constructor(
    public var cDistPoint: UInt,
    rgDistPointCtorArg: MutPtr<CrlDistPoint>,
) {
    public var rgDistPoint: MutPtr<CrlDistPoint> = rgDistPointCtorArg
        internal set

    public constructor() : this(
        cDistPoint = 0u,
        rgDistPointCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cDistPoint

    public operator fun component2(): MutPtr<CrlDistPoint> = this.rgDistPoint

    public fun copy(cDistPoint: UInt = this.cDistPoint, rgDistPoint: MutPtr<CrlDistPoint> = this.rgDistPoint): CrlDistPointsInfo = CrlDistPointsInfo(cDistPoint = cDistPoint, rgDistPointCtorArg = rgDistPoint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CrlDistPointsInfo) return false
        if (this.cDistPoint != other.cDistPoint) return false
        if (this.rgDistPoint != other.rgDistPoint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cDistPoint.hashCode()
        result = 31 * result + this.rgDistPoint.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrlDistPointsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrlDistPointsInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CrlDistPointsInfo =
                    CrlDistPointsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CrlDistPoint>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CrlDistPointsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cDistPoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CrlDistPoint>(64)
                    ).writeNative(addr + 8L, value.rgDistPoint)
                }
            }

        public operator fun invoke(
            cDistPoint: UInt = 0u,
            rgDistPoint: MutPtr<CrlDistPoint> = MutPtr(0L),
        ): CrlDistPointsInfo =
            CrlDistPointsInfo(
                cDistPoint = cDistPoint,
                rgDistPointCtorArg = rgDistPoint,
            )
    }
}

public data class CrlDistPointName(
    public var dwDistPointNameChoice: UInt = 0u,
    public var anonymous: CrlDistPointName0 = CrlDistPointName0(),
)

public data class CrlDistPointName0(
    public var fullName: CertAltNameInfo = CertAltNameInfo(),
)

public class CrlEntry internal constructor(
    public var serialNumber: CryptIntegerBlob,
    public var revocationDate: Filetime,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr<CertExtension>,
) {
    public var rgExtension: MutPtr<CertExtension> = rgExtensionCtorArg
        internal set

    public constructor() : this(
        serialNumber = CryptIntegerBlob(),
        revocationDate = Filetime(),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptIntegerBlob = this.serialNumber

    public operator fun component2(): Filetime = this.revocationDate

    public operator fun component3(): UInt = this.cExtension

    public operator fun component4(): MutPtr<CertExtension> = this.rgExtension

    public fun copy(serialNumber: CryptIntegerBlob = this.serialNumber, revocationDate: Filetime = this.revocationDate, cExtension: UInt = this.cExtension, rgExtension: MutPtr<CertExtension> = this.rgExtension): CrlEntry = CrlEntry(serialNumber = serialNumber, revocationDate = revocationDate, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CrlEntry) return false
        if (this.serialNumber != other.serialNumber) return false
        if (this.revocationDate != other.revocationDate) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serialNumber.hashCode()
        result = 31 * result + this.revocationDate.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
            revocationDate: Filetime = Filetime(),
            cExtension: UInt = 0u,
            rgExtension: MutPtr<CertExtension> = MutPtr(0L),
        ): CrlEntry =
            CrlEntry(
                serialNumber = serialNumber,
                revocationDate = revocationDate,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public class CrlFindIssuedForPara internal constructor(
    pSubjectCertCtorArg: ConstPtr<CertContext>,
    pIssuerCertCtorArg: ConstPtr<CertContext>,
) {
    public var pSubjectCert: ConstPtr<CertContext> = pSubjectCertCtorArg
        internal set

    public var pIssuerCert: ConstPtr<CertContext> = pIssuerCertCtorArg
        internal set

    public constructor() : this(
        pSubjectCertCtorArg = ConstPtr(0L),
        pIssuerCertCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<CertContext> = this.pSubjectCert

    public operator fun component2(): ConstPtr<CertContext> = this.pIssuerCert

    public fun copy(pSubjectCert: ConstPtr<CertContext> = this.pSubjectCert, pIssuerCert: ConstPtr<CertContext> = this.pIssuerCert): CrlFindIssuedForPara = CrlFindIssuedForPara(pSubjectCertCtorArg = pSubjectCert, pIssuerCertCtorArg = pIssuerCert)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CrlFindIssuedForPara) return false
        if (this.pSubjectCert != other.pSubjectCert) return false
        if (this.pIssuerCert != other.pIssuerCert) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pSubjectCert.hashCode()
        result = 31 * result + this.pIssuerCert.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrlFindIssuedForPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrlFindIssuedForPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CrlFindIssuedForPara =
                    CrlFindIssuedForPara(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CertContext>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CertContext>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CrlFindIssuedForPara) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CertContext>(64)
                    ).writeNative(addr, value.pSubjectCert)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CertContext>(64)
                    ).writeNative(addr + 8L, value.pIssuerCert)
                }
            }

        public operator fun invoke(
            pSubjectCert: ConstPtr<CertContext> = ConstPtr(0L),
            pIssuerCert: ConstPtr<CertContext> = ConstPtr(0L),
        ): CrlFindIssuedForPara =
            CrlFindIssuedForPara(
                pSubjectCertCtorArg = pSubjectCert,
                pIssuerCertCtorArg = pIssuerCert,
            )
    }
}

public class CrlInfo internal constructor(
    public var dwVersion: UInt,
    public var signatureAlgorithm: CryptAlgorithmIdentifier,
    public var issuer: CryptIntegerBlob,
    public var thisUpdate: Filetime,
    public var nextUpdate: Filetime,
    public var cCRLEntry: UInt,
    rgCRLEntryCtorArg: MutPtr<CrlEntry>,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr<CertExtension>,
) {
    public var rgCRLEntry: MutPtr<CrlEntry> = rgCRLEntryCtorArg
        internal set

    public var rgExtension: MutPtr<CertExtension> = rgExtensionCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        signatureAlgorithm = CryptAlgorithmIdentifier(),
        issuer = CryptIntegerBlob(),
        thisUpdate = Filetime(),
        nextUpdate = Filetime(),
        cCRLEntry = 0u,
        rgCRLEntryCtorArg = MutPtr(0L),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): CryptAlgorithmIdentifier = this.signatureAlgorithm

    public operator fun component3(): CryptIntegerBlob = this.issuer

    public operator fun component4(): Filetime = this.thisUpdate

    public operator fun component5(): Filetime = this.nextUpdate

    public operator fun component6(): UInt = this.cCRLEntry

    public operator fun component7(): MutPtr<CrlEntry> = this.rgCRLEntry

    public operator fun component8(): UInt = this.cExtension

    public operator fun component9(): MutPtr<CertExtension> = this.rgExtension

    public fun copy(dwVersion: UInt = this.dwVersion, signatureAlgorithm: CryptAlgorithmIdentifier = this.signatureAlgorithm, issuer: CryptIntegerBlob = this.issuer, thisUpdate: Filetime = this.thisUpdate, nextUpdate: Filetime = this.nextUpdate, cCRLEntry: UInt = this.cCRLEntry, rgCRLEntry: MutPtr<CrlEntry> = this.rgCRLEntry, cExtension: UInt = this.cExtension, rgExtension: MutPtr<CertExtension> = this.rgExtension): CrlInfo = CrlInfo(dwVersion = dwVersion, signatureAlgorithm = signatureAlgorithm, issuer = issuer, thisUpdate = thisUpdate, nextUpdate = nextUpdate, cCRLEntry = cCRLEntry, rgCRLEntryCtorArg = rgCRLEntry, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CrlInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.signatureAlgorithm != other.signatureAlgorithm) return false
        if (this.issuer != other.issuer) return false
        if (this.thisUpdate != other.thisUpdate) return false
        if (this.nextUpdate != other.nextUpdate) return false
        if (this.cCRLEntry != other.cCRLEntry) return false
        if (this.rgCRLEntry != other.rgCRLEntry) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.signatureAlgorithm.hashCode()
        result = 31 * result + this.issuer.hashCode()
        result = 31 * result + this.thisUpdate.hashCode()
        result = 31 * result + this.nextUpdate.hashCode()
        result = 31 * result + this.cCRLEntry.hashCode()
        result = 31 * result + this.rgCRLEntry.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            signatureAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            issuer: CryptIntegerBlob = CryptIntegerBlob(),
            thisUpdate: Filetime = Filetime(),
            nextUpdate: Filetime = Filetime(),
            cCRLEntry: UInt = 0u,
            rgCRLEntry: MutPtr<CrlEntry> = MutPtr(0L),
            cExtension: UInt = 0u,
            rgExtension: MutPtr<CertExtension> = MutPtr(0L),
        ): CrlInfo =
            CrlInfo(
                dwVersion = dwVersion,
                signatureAlgorithm = signatureAlgorithm,
                issuer = issuer,
                thisUpdate = thisUpdate,
                nextUpdate = nextUpdate,
                cCRLEntry = cCRLEntry,
                rgCRLEntryCtorArg = rgCRLEntry,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public data class CrlIssuingDistPoint(
    public var distPointName: CrlDistPointName = CrlDistPointName(),
    public var fOnlyContainsUserCerts: Bool = 0,
    public var fOnlyContainsCACerts: Bool = 0,
    public var onlySomeReasonFlags: CryptBitBlob = CryptBitBlob(),
    public var fIndirectCRL: Bool = 0,
)

public class CrlRevocationInfo internal constructor(
    pCrlEntryCtorArg: MutPtr<CrlEntry>,
    pCrlContextCtorArg: MutPtr<CrlContext>,
    pCrlIssuerChainCtorArg: MutPtr<CertChainContext>,
) {
    public var pCrlEntry: MutPtr<CrlEntry> = pCrlEntryCtorArg
        internal set

    public var pCrlContext: MutPtr<CrlContext> = pCrlContextCtorArg
        internal set

    public var pCrlIssuerChain: MutPtr<CertChainContext> = pCrlIssuerChainCtorArg
        internal set

    public constructor() : this(
        pCrlEntryCtorArg = MutPtr(0L),
        pCrlContextCtorArg = MutPtr(0L),
        pCrlIssuerChainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CrlEntry> = this.pCrlEntry

    public operator fun component2(): MutPtr<CrlContext> = this.pCrlContext

    public operator fun component3(): MutPtr<CertChainContext> = this.pCrlIssuerChain

    public fun copy(pCrlEntry: MutPtr<CrlEntry> = this.pCrlEntry, pCrlContext: MutPtr<CrlContext> = this.pCrlContext, pCrlIssuerChain: MutPtr<CertChainContext> = this.pCrlIssuerChain): CrlRevocationInfo = CrlRevocationInfo(pCrlEntryCtorArg = pCrlEntry, pCrlContextCtorArg = pCrlContext, pCrlIssuerChainCtorArg = pCrlIssuerChain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CrlRevocationInfo) return false
        if (this.pCrlEntry != other.pCrlEntry) return false
        if (this.pCrlContext != other.pCrlContext) return false
        if (this.pCrlIssuerChain != other.pCrlIssuerChain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pCrlEntry.hashCode()
        result = 31 * result + this.pCrlContext.hashCode()
        result = 31 * result + this.pCrlIssuerChain.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrlRevocationInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrlRevocationInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CrlRevocationInfo =
                    CrlRevocationInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CrlEntry>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CrlContext>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertChainContext>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CrlRevocationInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CrlEntry>(64)
                    ).writeNative(addr, value.pCrlEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CrlContext>(64)
                    ).writeNative(addr + 8L, value.pCrlContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertChainContext>(64)
                    ).writeNative(addr + 16L, value.pCrlIssuerChain)
                }
            }

        public operator fun invoke(
            pCrlEntry: MutPtr<CrlEntry> = MutPtr(0L),
            pCrlContext: MutPtr<CrlContext> = MutPtr(0L),
            pCrlIssuerChain: MutPtr<CertChainContext> = MutPtr(0L),
        ): CrlRevocationInfo =
            CrlRevocationInfo(
                pCrlEntryCtorArg = pCrlEntry,
                pCrlContextCtorArg = pCrlContext,
                pCrlIssuerChainCtorArg = pCrlIssuerChain,
            )
    }
}

public class CrossCertDistPointsInfo internal constructor(
    public var dwSyncDeltaTime: UInt,
    public var cDistPoint: UInt,
    rgDistPointCtorArg: MutPtr<CertAltNameInfo>,
) {
    public var rgDistPoint: MutPtr<CertAltNameInfo> = rgDistPointCtorArg
        internal set

    public constructor() : this(
        dwSyncDeltaTime = 0u,
        cDistPoint = 0u,
        rgDistPointCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSyncDeltaTime

    public operator fun component2(): UInt = this.cDistPoint

    public operator fun component3(): MutPtr<CertAltNameInfo> = this.rgDistPoint

    public fun copy(dwSyncDeltaTime: UInt = this.dwSyncDeltaTime, cDistPoint: UInt = this.cDistPoint, rgDistPoint: MutPtr<CertAltNameInfo> = this.rgDistPoint): CrossCertDistPointsInfo = CrossCertDistPointsInfo(dwSyncDeltaTime = dwSyncDeltaTime, cDistPoint = cDistPoint, rgDistPointCtorArg = rgDistPoint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CrossCertDistPointsInfo) return false
        if (this.dwSyncDeltaTime != other.dwSyncDeltaTime) return false
        if (this.cDistPoint != other.cDistPoint) return false
        if (this.rgDistPoint != other.rgDistPoint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSyncDeltaTime.hashCode()
        result = 31 * result + this.cDistPoint.hashCode()
        result = 31 * result + this.rgDistPoint.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrossCertDistPointsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrossCertDistPointsInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CrossCertDistPointsInfo =
                    CrossCertDistPointsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertAltNameInfo>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CrossCertDistPointsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSyncDeltaTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cDistPoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertAltNameInfo>(64)
                    ).writeNative(addr + 8L, value.rgDistPoint)
                }
            }

        public operator fun invoke(
            dwSyncDeltaTime: UInt = 0u,
            cDistPoint: UInt = 0u,
            rgDistPoint: MutPtr<CertAltNameInfo> = MutPtr(0L),
        ): CrossCertDistPointsInfo =
            CrossCertDistPointsInfo(
                dwSyncDeltaTime = dwSyncDeltaTime,
                cDistPoint = cDistPoint,
                rgDistPointCtorArg = rgDistPoint,
            )
    }
}

public data class CryptnetUrlCacheFlushInfo(
    public var cbSize: UInt = 0u,
    public var dwExemptSeconds: UInt = 0u,
    public var expireTime: Filetime = Filetime(),
)

public data class CryptnetUrlCachePreFetchInfo(
    public var cbSize: UInt = 0u,
    public var dwObjectType: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var thisUpdateTime: Filetime = Filetime(),
    public var nextUpdateTime: Filetime = Filetime(),
    public var publishTime: Filetime = Filetime(),
)

public class CryptnetUrlCacheResponseInfo internal constructor(
    public var cbSize: UInt,
    public var wResponseType: UShort,
    public var wResponseFlags: UShort,
    public var lastModifiedTime: Filetime,
    public var dwMaxAge: UInt,
    pwszETagCtorArg: Pcwstr,
    public var dwProxyId: UInt,
) {
    public var pwszETag: Pcwstr = pwszETagCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        wResponseType = 0u,
        wResponseFlags = 0u,
        lastModifiedTime = Filetime(),
        dwMaxAge = 0u,
        pwszETagCtorArg = ConstPtr(0L),
        dwProxyId = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UShort = this.wResponseType

    public operator fun component3(): UShort = this.wResponseFlags

    public operator fun component4(): Filetime = this.lastModifiedTime

    public operator fun component5(): UInt = this.dwMaxAge

    public operator fun component6(): Pcwstr = this.pwszETag

    public operator fun component7(): UInt = this.dwProxyId

    public fun copy(cbSize: UInt = this.cbSize, wResponseType: UShort = this.wResponseType, wResponseFlags: UShort = this.wResponseFlags, lastModifiedTime: Filetime = this.lastModifiedTime, dwMaxAge: UInt = this.dwMaxAge, pwszETag: Pcwstr = this.pwszETag, dwProxyId: UInt = this.dwProxyId): CryptnetUrlCacheResponseInfo = CryptnetUrlCacheResponseInfo(cbSize = cbSize, wResponseType = wResponseType, wResponseFlags = wResponseFlags, lastModifiedTime = lastModifiedTime, dwMaxAge = dwMaxAge, pwszETagCtorArg = pwszETag, dwProxyId = dwProxyId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptnetUrlCacheResponseInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.wResponseType != other.wResponseType) return false
        if (this.wResponseFlags != other.wResponseFlags) return false
        if (this.lastModifiedTime != other.lastModifiedTime) return false
        if (this.dwMaxAge != other.dwMaxAge) return false
        if (this.pwszETag != other.pwszETag) return false
        if (this.dwProxyId != other.dwProxyId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.wResponseType.hashCode()
        result = 31 * result + this.wResponseFlags.hashCode()
        result = 31 * result + this.lastModifiedTime.hashCode()
        result = 31 * result + this.dwMaxAge.hashCode()
        result = 31 * result + this.pwszETag.hashCode()
        result = 31 * result + this.dwProxyId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            wResponseType: UShort = 0u,
            wResponseFlags: UShort = 0u,
            lastModifiedTime: Filetime = Filetime(),
            dwMaxAge: UInt = 0u,
            pwszETag: Pcwstr = ConstPtr(0L),
            dwProxyId: UInt = 0u,
        ): CryptnetUrlCacheResponseInfo =
            CryptnetUrlCacheResponseInfo(
                cbSize = cbSize,
                wResponseType = wResponseType,
                wResponseFlags = wResponseFlags,
                lastModifiedTime = lastModifiedTime,
                dwMaxAge = dwMaxAge,
                pwszETagCtorArg = pwszETag,
                dwProxyId = dwProxyId,
            )
    }
}

public class CryptprotectPromptstruct internal constructor(
    public var cbSize: UInt,
    public var dwPromptFlags: UInt,
    hwndAppCtorArg: Hwnd,
    szPromptCtorArg: Pcwstr,
) {
    public var hwndApp: Hwnd = hwndAppCtorArg
        internal set

    public var szPrompt: Pcwstr = szPromptCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwPromptFlags = 0u,
        hwndAppCtorArg = MutPtr(0L),
        szPromptCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwPromptFlags

    public operator fun component3(): Hwnd = this.hwndApp

    public operator fun component4(): Pcwstr = this.szPrompt

    public fun copy(cbSize: UInt = this.cbSize, dwPromptFlags: UInt = this.dwPromptFlags, hwndApp: Hwnd = this.hwndApp, szPrompt: Pcwstr = this.szPrompt): CryptprotectPromptstruct = CryptprotectPromptstruct(cbSize = cbSize, dwPromptFlags = dwPromptFlags, hwndAppCtorArg = hwndApp, szPromptCtorArg = szPrompt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptprotectPromptstruct) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwPromptFlags != other.dwPromptFlags) return false
        if (this.hwndApp != other.hwndApp) return false
        if (this.szPrompt != other.szPrompt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwPromptFlags.hashCode()
        result = 31 * result + this.hwndApp.hashCode()
        result = 31 * result + this.szPrompt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwPromptFlags: UInt = 0u,
            hwndApp: Hwnd = MutPtr(0L),
            szPrompt: Pcwstr = ConstPtr(0L),
        ): CryptprotectPromptstruct =
            CryptprotectPromptstruct(
                cbSize = cbSize,
                dwPromptFlags = dwPromptFlags,
                hwndAppCtorArg = hwndApp,
                szPromptCtorArg = szPrompt,
            )
    }
}

public data class Crypt3desKeyState(
    public var key: UByteArray = UByteArray(24),
    public var iv: UByteArray = UByteArray(8),
    public var feedback: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Crypt3desKeyState) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.feedback.contentEquals(other.feedback)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.contentHashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.feedback.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Crypt3desKeyState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Crypt3desKeyState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Crypt3desKeyState =
                    Crypt3desKeyState(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Crypt3desKeyState) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                    ).writeNative(addr, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 24L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 32L, value.feedback.toList())
                }
            }
    }
}

public data class CryptAes128KeyState(
    public var key: UByteArray = UByteArray(16),
    public var iv: UByteArray = UByteArray(16),
    public var encryptionState: UByteArray = UByteArray(176),
    public var decryptionState: UByteArray = UByteArray(176),
    public var feedback: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptAes128KeyState) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.encryptionState.contentEquals(other.encryptionState)) return false
        if (!this.decryptionState.contentEquals(other.decryptionState)) return false
        if (!this.feedback.contentEquals(other.feedback)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.contentHashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.encryptionState.contentHashCode()
        result = 31 * result + this.decryptionState.contentHashCode()
        result = 31 * result + this.feedback.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptAes128KeyState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptAes128KeyState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 400L
                override fun readNative(addr: Long): CryptAes128KeyState =
                    CryptAes128KeyState(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (176).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (176).toInt())
                        ).readNative(addr + 208L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 384L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CryptAes128KeyState) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (176).toInt())
                    ).writeNative(addr + 32L, value.encryptionState.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (176).toInt())
                    ).writeNative(addr + 208L, value.decryptionState.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 384L, value.feedback.toList())
                }
            }
    }
}

public data class CryptAes256KeyState(
    public var key: UByteArray = UByteArray(32),
    public var iv: UByteArray = UByteArray(16),
    public var encryptionState: UByteArray = UByteArray(240),
    public var decryptionState: UByteArray = UByteArray(240),
    public var feedback: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptAes256KeyState) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.encryptionState.contentEquals(other.encryptionState)) return false
        if (!this.decryptionState.contentEquals(other.decryptionState)) return false
        if (!this.feedback.contentEquals(other.feedback)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.contentHashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.encryptionState.contentHashCode()
        result = 31 * result + this.decryptionState.contentHashCode()
        result = 31 * result + this.feedback.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptAes256KeyState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptAes256KeyState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 544L
                override fun readNative(addr: Long): CryptAes256KeyState =
                    CryptAes256KeyState(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (240).toInt())
                        ).readNative(addr + 48L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (240).toInt())
                        ).readNative(addr + 288L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 528L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CryptAes256KeyState) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 32L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (240).toInt())
                    ).writeNative(addr + 48L, value.encryptionState.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (240).toInt())
                    ).writeNative(addr + 288L, value.decryptionState.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 528L, value.feedback.toList())
                }
            }
    }
}

public class CryptAlgorithmIdentifier internal constructor(
    pszObjIdCtorArg: Pstr,
    public var parameters: CryptIntegerBlob,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        parameters = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): CryptIntegerBlob = this.parameters

    public fun copy(pszObjId: Pstr = this.pszObjId, parameters: CryptIntegerBlob = this.parameters): CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(pszObjIdCtorArg = pszObjId, parameters = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptAlgorithmIdentifier) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            parameters: CryptIntegerBlob = CryptIntegerBlob(),
        ): CryptAlgorithmIdentifier =
            CryptAlgorithmIdentifier(
                pszObjIdCtorArg = pszObjId,
                parameters = parameters,
            )
    }
}
