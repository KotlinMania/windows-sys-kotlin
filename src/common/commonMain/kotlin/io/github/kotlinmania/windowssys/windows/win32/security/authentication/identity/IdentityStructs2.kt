@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.CypherBlock

public class SlNongenuineUiOptions internal constructor(
    public var cbSize: UInt,
    pComponentIdCtorArg: ConstPtr<Guid>,
    public var hResultUI: Hresult,
) {
    public var pComponentId: ConstPtr<Guid> = pComponentIdCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pComponentIdCtorArg = ConstPtr(0L),
        hResultUI = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): ConstPtr<Guid> = this.pComponentId

    public operator fun component3(): Hresult = this.hResultUI

    public fun copy(cbSize: UInt = this.cbSize, pComponentId: ConstPtr<Guid> = this.pComponentId, hResultUI: Hresult = this.hResultUI): SlNongenuineUiOptions = SlNongenuineUiOptions(cbSize = cbSize, pComponentIdCtorArg = pComponentId, hResultUI = hResultUI)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SlNongenuineUiOptions) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pComponentId != other.pComponentId) return false
        if (this.hResultUI != other.hResultUI) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pComponentId.hashCode()
        result = 31 * result + this.hResultUI.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlNongenuineUiOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlNongenuineUiOptions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SlNongenuineUiOptions =
                    SlNongenuineUiOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SlNongenuineUiOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.pComponentId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.hResultUI)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pComponentId: ConstPtr<Guid> = ConstPtr(0L),
            hResultUI: Hresult = 0,
        ): SlNongenuineUiOptions =
            SlNongenuineUiOptions(
                cbSize = cbSize,
                pComponentIdCtorArg = pComponentId,
                hResultUI = hResultUI,
            )
    }
}

public class SlSystemPolicyInformation internal constructor(
    reserved1CtorArg: List<MutPtr<CVoid>>,
    public var reserved2: UIntArray,
) {
    public var reserved1: List<MutPtr<CVoid>> = reserved1CtorArg
        internal set

    public constructor() : this(
        reserved1CtorArg = List(2) { MutPtr(0L) },
        reserved2 = UIntArray(3),
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.reserved1

    public operator fun component2(): UIntArray = this.reserved2

    public fun copy(reserved1: List<MutPtr<CVoid>> = this.reserved1, reserved2: UIntArray = this.reserved2): SlSystemPolicyInformation = SlSystemPolicyInformation(reserved1CtorArg = reserved1, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SlSystemPolicyInformation) return false
        if (this.reserved1 != other.reserved1) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlSystemPolicyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlSystemPolicyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SlSystemPolicyInformation =
                    SlSystemPolicyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (2).toInt(),
                                )
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: SlSystemPolicyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (2).toInt(),
                            )
                    ).writeNative(addr, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 16L, value.reserved2.toList())
                }
            }

        public operator fun invoke(
            reserved1: List<MutPtr<CVoid>> = List(2) { MutPtr(0L) },
            reserved2: UIntArray = UIntArray(3),
        ): SlSystemPolicyInformation =
            SlSystemPolicyInformation(
                reserved1CtorArg = reserved1,
                reserved2 = reserved2,
            )
    }
}

public class SrSecurityDescriptor internal constructor(
    public var length: UInt,
    securityDescriptorCtorArg: MutPtr<UByte>,
) {
    public var securityDescriptor: MutPtr<UByte> = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        securityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<UByte> = this.securityDescriptor

    public fun copy(length: UInt = this.length, securityDescriptor: MutPtr<UByte> = this.securityDescriptor): SrSecurityDescriptor = SrSecurityDescriptor(length = length, securityDescriptorCtorArg = securityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SrSecurityDescriptor) return false
        if (this.length != other.length) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrSecurityDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrSecurityDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SrSecurityDescriptor =
                    SrSecurityDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SrSecurityDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.securityDescriptor)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            securityDescriptor: MutPtr<UByte> = MutPtr(0L),
        ): SrSecurityDescriptor =
            SrSecurityDescriptor(
                length = length,
                securityDescriptorCtorArg = securityDescriptor,
            )
    }
}

public class SslCredentialCertificate internal constructor(
    public var cbPrivateKey: UInt,
    pPrivateKeyCtorArg: MutPtr<UByte>,
    public var cbCertificate: UInt,
    pCertificateCtorArg: MutPtr<UByte>,
    pszPasswordCtorArg: Pstr,
) {
    public var pPrivateKey: MutPtr<UByte> = pPrivateKeyCtorArg
        internal set

    public var pCertificate: MutPtr<UByte> = pCertificateCtorArg
        internal set

    public var pszPassword: Pstr = pszPasswordCtorArg
        internal set

    public constructor() : this(
        cbPrivateKey = 0u,
        pPrivateKeyCtorArg = MutPtr(0L),
        cbCertificate = 0u,
        pCertificateCtorArg = MutPtr(0L),
        pszPasswordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbPrivateKey

    public operator fun component2(): MutPtr<UByte> = this.pPrivateKey

    public operator fun component3(): UInt = this.cbCertificate

    public operator fun component4(): MutPtr<UByte> = this.pCertificate

    public operator fun component5(): Pstr = this.pszPassword

    public fun copy(cbPrivateKey: UInt = this.cbPrivateKey, pPrivateKey: MutPtr<UByte> = this.pPrivateKey, cbCertificate: UInt = this.cbCertificate, pCertificate: MutPtr<UByte> = this.pCertificate, pszPassword: Pstr = this.pszPassword): SslCredentialCertificate = SslCredentialCertificate(cbPrivateKey = cbPrivateKey, pPrivateKeyCtorArg = pPrivateKey, cbCertificate = cbCertificate, pCertificateCtorArg = pCertificate, pszPasswordCtorArg = pszPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SslCredentialCertificate) return false
        if (this.cbPrivateKey != other.cbPrivateKey) return false
        if (this.pPrivateKey != other.pPrivateKey) return false
        if (this.cbCertificate != other.cbCertificate) return false
        if (this.pCertificate != other.pCertificate) return false
        if (this.pszPassword != other.pszPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbPrivateKey.hashCode()
        result = 31 * result + this.pPrivateKey.hashCode()
        result = 31 * result + this.cbCertificate.hashCode()
        result = 31 * result + this.pCertificate.hashCode()
        result = 31 * result + this.pszPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbPrivateKey: UInt = 0u,
            pPrivateKey: MutPtr<UByte> = MutPtr(0L),
            cbCertificate: UInt = 0u,
            pCertificate: MutPtr<UByte> = MutPtr(0L),
            pszPassword: Pstr = MutPtr(0L),
        ): SslCredentialCertificate =
            SslCredentialCertificate(
                cbPrivateKey = cbPrivateKey,
                pPrivateKeyCtorArg = pPrivateKey,
                cbCertificate = cbCertificate,
                pCertificateCtorArg = pCertificate,
                pszPasswordCtorArg = pszPassword,
            )
    }
}

public data class SubscribeGenericTlsExtension(
    public var flags: UInt = 0u,
    public var subscriptionsCount: UInt = 0u,
    public var subscriptions: List<TlsExtensionSubscription> = List(1) { TlsExtensionSubscription() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SubscribeGenericTlsExtension> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SubscribeGenericTlsExtension> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SubscribeGenericTlsExtension =
                    SubscribeGenericTlsExtension(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(TlsExtensionSubscription.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SubscribeGenericTlsExtension) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.subscriptionsCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(TlsExtensionSubscription.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.subscriptions)
                }
            }
    }
}

public class SecBuffer internal constructor(
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

    public fun copy(cbBuffer: UInt = this.cbBuffer, bufferType: UInt = this.bufferType, pvBuffer: MutPtr<CVoid> = this.pvBuffer): SecBuffer = SecBuffer(cbBuffer = cbBuffer, bufferType = bufferType, pvBufferCtorArg = pvBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecBuffer) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecBuffer =
                    SecBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecBuffer) {
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
        ): SecBuffer =
            SecBuffer(
                cbBuffer = cbBuffer,
                bufferType = bufferType,
                pvBufferCtorArg = pvBuffer,
            )
    }
}

public class SecBufferDesc internal constructor(
    public var ulVersion: UInt,
    public var cBuffers: UInt,
    pBuffersCtorArg: MutPtr<SecBuffer>,
) {
    public var pBuffers: MutPtr<SecBuffer> = pBuffersCtorArg
        internal set

    public constructor() : this(
        ulVersion = 0u,
        cBuffers = 0u,
        pBuffersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulVersion

    public operator fun component2(): UInt = this.cBuffers

    public operator fun component3(): MutPtr<SecBuffer> = this.pBuffers

    public fun copy(ulVersion: UInt = this.ulVersion, cBuffers: UInt = this.cBuffers, pBuffers: MutPtr<SecBuffer> = this.pBuffers): SecBufferDesc = SecBufferDesc(ulVersion = ulVersion, cBuffers = cBuffers, pBuffersCtorArg = pBuffers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecBufferDesc) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecBufferDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecBufferDesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecBufferDesc =
                    SecBufferDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecBuffer>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecBufferDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cBuffers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecBuffer>(64)
                    ).writeNative(addr + 8L, value.pBuffers)
                }
            }

        public operator fun invoke(
            ulVersion: UInt = 0u,
            cBuffers: UInt = 0u,
            pBuffers: MutPtr<SecBuffer> = MutPtr(0L),
        ): SecBufferDesc =
            SecBufferDesc(
                ulVersion = ulVersion,
                cBuffers = cBuffers,
                pBuffersCtorArg = pBuffers,
            )
    }
}

public class SecPkgContextAccessToken internal constructor(
    accessTokenCtorArg: MutPtr<CVoid>,
) {
    public var accessToken: MutPtr<CVoid> = accessTokenCtorArg
        internal set

    public constructor() : this(
        accessTokenCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.accessToken

    public fun copy(accessToken: MutPtr<CVoid> = this.accessToken): SecPkgContextAccessToken = SecPkgContextAccessToken(accessTokenCtorArg = accessToken)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextAccessToken) return false
        if (this.accessToken != other.accessToken) return false
        return true
    }

    override fun hashCode(): Int = this.accessToken.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextAccessToken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextAccessToken> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextAccessToken =
                    SecPkgContextAccessToken(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextAccessToken) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.accessToken)
                }
            }

        public operator fun invoke(
            accessToken: MutPtr<CVoid> = MutPtr(0L),
        ): SecPkgContextAccessToken =
            SecPkgContextAccessToken(
                accessTokenCtorArg = accessToken,
            )
    }
}

public data class SecPkgContextApplicationProtocol(
    public var protoNegoStatus: SecApplicationProtocolNegotiationStatus = 0,
    public var protoNegoExt: SecApplicationProtocolNegotiationExt = 0,
    public var protocolIdSize: UByte = 0u,
    public var protocolId: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextApplicationProtocol) return false
        if (this.protoNegoStatus != other.protoNegoStatus) return false
        if (this.protoNegoExt != other.protoNegoExt) return false
        if (this.protocolIdSize != other.protocolIdSize) return false
        if (!this.protocolId.contentEquals(other.protocolId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protoNegoStatus.hashCode()
        result = 31 * result + this.protoNegoExt.hashCode()
        result = 31 * result + this.protocolIdSize.hashCode()
        result = 31 * result + this.protocolId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextApplicationProtocol> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextApplicationProtocol> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 264L
                override fun readNative(addr: Long): SecPkgContextApplicationProtocol =
                    SecPkgContextApplicationProtocol(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextApplicationProtocol) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.protoNegoStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.protoNegoExt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.protocolIdSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                    ).writeNative(addr + 9L, value.protocolId.toList())
                }
            }
    }
}

public class SecPkgContextAuthorityA internal constructor(
    sAuthorityNameCtorArg: MutPtr<Byte>,
) {
    public var sAuthorityName: MutPtr<Byte> = sAuthorityNameCtorArg
        internal set

    public constructor() : this(
        sAuthorityNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.sAuthorityName

    public fun copy(sAuthorityName: MutPtr<Byte> = this.sAuthorityName): SecPkgContextAuthorityA = SecPkgContextAuthorityA(sAuthorityNameCtorArg = sAuthorityName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextAuthorityA) return false
        if (this.sAuthorityName != other.sAuthorityName) return false
        return true
    }

    override fun hashCode(): Int = this.sAuthorityName.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextAuthorityA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextAuthorityA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextAuthorityA =
                    SecPkgContextAuthorityA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextAuthorityA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.sAuthorityName)
                }
            }

        public operator fun invoke(
            sAuthorityName: MutPtr<Byte> = MutPtr(0L),
        ): SecPkgContextAuthorityA =
            SecPkgContextAuthorityA(
                sAuthorityNameCtorArg = sAuthorityName,
            )
    }
}

public class SecPkgContextAuthorityW internal constructor(
    sAuthorityNameCtorArg: MutPtr<UShort>,
) {
    public var sAuthorityName: MutPtr<UShort> = sAuthorityNameCtorArg
        internal set

    public constructor() : this(
        sAuthorityNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UShort> = this.sAuthorityName

    public fun copy(sAuthorityName: MutPtr<UShort> = this.sAuthorityName): SecPkgContextAuthorityW = SecPkgContextAuthorityW(sAuthorityNameCtorArg = sAuthorityName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextAuthorityW) return false
        if (this.sAuthorityName != other.sAuthorityName) return false
        return true
    }

    override fun hashCode(): Int = this.sAuthorityName.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextAuthorityW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextAuthorityW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextAuthorityW =
                    SecPkgContextAuthorityW(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextAuthorityW) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.sAuthorityName)
                }
            }

        public operator fun invoke(
            sAuthorityName: MutPtr<UShort> = MutPtr(0L),
        ): SecPkgContextAuthorityW =
            SecPkgContextAuthorityW(
                sAuthorityNameCtorArg = sAuthorityName,
            )
    }
}

public class SecPkgContextAuthzId internal constructor(
    public var authzIDLength: UInt,
    authzIDCtorArg: Pstr,
) {
    public var authzID: Pstr = authzIDCtorArg
        internal set

    public constructor() : this(
        authzIDLength = 0u,
        authzIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.authzIDLength

    public operator fun component2(): Pstr = this.authzID

    public fun copy(authzIDLength: UInt = this.authzIDLength, authzID: Pstr = this.authzID): SecPkgContextAuthzId = SecPkgContextAuthzId(authzIDLength = authzIDLength, authzIDCtorArg = authzID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextAuthzId) return false
        if (this.authzIDLength != other.authzIDLength) return false
        if (this.authzID != other.authzID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.authzIDLength.hashCode()
        result = 31 * result + this.authzID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            authzIDLength: UInt = 0u,
            authzID: Pstr = MutPtr(0L),
        ): SecPkgContextAuthzId =
            SecPkgContextAuthzId(
                authzIDLength = authzIDLength,
                authzIDCtorArg = authzID,
            )
    }
}

public class SecPkgContextBindings internal constructor(
    public var bindingsLength: UInt,
    bindingsCtorArg: MutPtr<SecChannelBindings>,
) {
    public var bindings: MutPtr<SecChannelBindings> = bindingsCtorArg
        internal set

    public constructor() : this(
        bindingsLength = 0u,
        bindingsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.bindingsLength

    public operator fun component2(): MutPtr<SecChannelBindings> = this.bindings

    public fun copy(bindingsLength: UInt = this.bindingsLength, bindings: MutPtr<SecChannelBindings> = this.bindings): SecPkgContextBindings = SecPkgContextBindings(bindingsLength = bindingsLength, bindingsCtorArg = bindings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextBindings) return false
        if (this.bindingsLength != other.bindingsLength) return false
        if (this.bindings != other.bindings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bindingsLength.hashCode()
        result = 31 * result + this.bindings.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextBindings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextBindings> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextBindings =
                    SecPkgContextBindings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecChannelBindings>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextBindings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bindingsLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecChannelBindings>(64)
                    ).writeNative(addr + 8L, value.bindings)
                }
            }

        public operator fun invoke(
            bindingsLength: UInt = 0u,
            bindings: MutPtr<SecChannelBindings> = MutPtr(0L),
        ): SecPkgContextBindings =
            SecPkgContextBindings(
                bindingsLength = bindingsLength,
                bindingsCtorArg = bindings,
            )
    }
}

public class SecPkgContextCertInfo internal constructor(
    public var dwVersion: UInt,
    public var cbSubjectName: UInt,
    pwszSubjectNameCtorArg: Pwstr,
    public var cbIssuerName: UInt,
    pwszIssuerNameCtorArg: Pwstr,
    public var dwKeySize: UInt,
) {
    public var pwszSubjectName: Pwstr = pwszSubjectNameCtorArg
        internal set

    public var pwszIssuerName: Pwstr = pwszIssuerNameCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbSubjectName = 0u,
        pwszSubjectNameCtorArg = MutPtr(0L),
        cbIssuerName = 0u,
        pwszIssuerNameCtorArg = MutPtr(0L),
        dwKeySize = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbSubjectName

    public operator fun component3(): Pwstr = this.pwszSubjectName

    public operator fun component4(): UInt = this.cbIssuerName

    public operator fun component5(): Pwstr = this.pwszIssuerName

    public operator fun component6(): UInt = this.dwKeySize

    public fun copy(dwVersion: UInt = this.dwVersion, cbSubjectName: UInt = this.cbSubjectName, pwszSubjectName: Pwstr = this.pwszSubjectName, cbIssuerName: UInt = this.cbIssuerName, pwszIssuerName: Pwstr = this.pwszIssuerName, dwKeySize: UInt = this.dwKeySize): SecPkgContextCertInfo = SecPkgContextCertInfo(dwVersion = dwVersion, cbSubjectName = cbSubjectName, pwszSubjectNameCtorArg = pwszSubjectName, cbIssuerName = cbIssuerName, pwszIssuerNameCtorArg = pwszIssuerName, dwKeySize = dwKeySize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextCertInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbSubjectName != other.cbSubjectName) return false
        if (this.pwszSubjectName != other.pwszSubjectName) return false
        if (this.cbIssuerName != other.cbIssuerName) return false
        if (this.pwszIssuerName != other.pwszIssuerName) return false
        if (this.dwKeySize != other.dwKeySize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbSubjectName.hashCode()
        result = 31 * result + this.pwszSubjectName.hashCode()
        result = 31 * result + this.cbIssuerName.hashCode()
        result = 31 * result + this.pwszIssuerName.hashCode()
        result = 31 * result + this.dwKeySize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbSubjectName: UInt = 0u,
            pwszSubjectName: Pwstr = MutPtr(0L),
            cbIssuerName: UInt = 0u,
            pwszIssuerName: Pwstr = MutPtr(0L),
            dwKeySize: UInt = 0u,
        ): SecPkgContextCertInfo =
            SecPkgContextCertInfo(
                dwVersion = dwVersion,
                cbSubjectName = cbSubjectName,
                pwszSubjectNameCtorArg = pwszSubjectName,
                cbIssuerName = cbIssuerName,
                pwszIssuerNameCtorArg = pwszIssuerName,
                dwKeySize = dwKeySize,
            )
    }
}

public data class SecPkgContextCertificateValidationResult(
    public var dwChainErrorStatus: UInt = 0u,
    public var hrVerifyChainStatus: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCertificateValidationResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCertificateValidationResult> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextCertificateValidationResult =
                    SecPkgContextCertificateValidationResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextCertificateValidationResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwChainErrorStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.hrVerifyChainStatus)
                }
            }
    }
}

public class SecPkgContextCertificates internal constructor(
    public var cCertificates: UInt,
    public var cbCertificateChain: UInt,
    pbCertificateChainCtorArg: MutPtr<UByte>,
) {
    public var pbCertificateChain: MutPtr<UByte> = pbCertificateChainCtorArg
        internal set

    public constructor() : this(
        cCertificates = 0u,
        cbCertificateChain = 0u,
        pbCertificateChainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCertificates

    public operator fun component2(): UInt = this.cbCertificateChain

    public operator fun component3(): MutPtr<UByte> = this.pbCertificateChain

    public fun copy(cCertificates: UInt = this.cCertificates, cbCertificateChain: UInt = this.cbCertificateChain, pbCertificateChain: MutPtr<UByte> = this.pbCertificateChain): SecPkgContextCertificates = SecPkgContextCertificates(cCertificates = cCertificates, cbCertificateChain = cbCertificateChain, pbCertificateChainCtorArg = pbCertificateChain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextCertificates) return false
        if (this.cCertificates != other.cCertificates) return false
        if (this.cbCertificateChain != other.cbCertificateChain) return false
        if (this.pbCertificateChain != other.pbCertificateChain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCertificates.hashCode()
        result = 31 * result + this.cbCertificateChain.hashCode()
        result = 31 * result + this.pbCertificateChain.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCertificates> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCertificates> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextCertificates =
                    SecPkgContextCertificates(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextCertificates) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCertificates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbCertificateChain)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbCertificateChain)
                }
            }

        public operator fun invoke(
            cCertificates: UInt = 0u,
            cbCertificateChain: UInt = 0u,
            pbCertificateChain: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgContextCertificates =
            SecPkgContextCertificates(
                cCertificates = cCertificates,
                cbCertificateChain = cbCertificateChain,
                pbCertificateChainCtorArg = pbCertificateChain,
            )
    }
}

public data class SecPkgContextCipherInfo(
    public var dwVersion: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var dwCipherSuite: UInt = 0u,
    public var dwBaseCipherSuite: UInt = 0u,
    public var szCipherSuite: UShortArray = UShortArray(64),
    public var szCipher: UShortArray = UShortArray(64),
    public var dwCipherLen: UInt = 0u,
    public var dwCipherBlockLen: UInt = 0u,
    public var szHash: UShortArray = UShortArray(64),
    public var dwHashLen: UInt = 0u,
    public var szExchange: UShortArray = UShortArray(64),
    public var dwMinExchangeLen: UInt = 0u,
    public var dwMaxExchangeLen: UInt = 0u,
    public var szCertificate: UShortArray = UShortArray(64),
    public var dwKeyType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextCipherInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.dwCipherSuite != other.dwCipherSuite) return false
        if (this.dwBaseCipherSuite != other.dwBaseCipherSuite) return false
        if (!this.szCipherSuite.contentEquals(other.szCipherSuite)) return false
        if (!this.szCipher.contentEquals(other.szCipher)) return false
        if (this.dwCipherLen != other.dwCipherLen) return false
        if (this.dwCipherBlockLen != other.dwCipherBlockLen) return false
        if (!this.szHash.contentEquals(other.szHash)) return false
        if (this.dwHashLen != other.dwHashLen) return false
        if (!this.szExchange.contentEquals(other.szExchange)) return false
        if (this.dwMinExchangeLen != other.dwMinExchangeLen) return false
        if (this.dwMaxExchangeLen != other.dwMaxExchangeLen) return false
        if (!this.szCertificate.contentEquals(other.szCertificate)) return false
        if (this.dwKeyType != other.dwKeyType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwProtocol.hashCode()
        result = 31 * result + this.dwCipherSuite.hashCode()
        result = 31 * result + this.dwBaseCipherSuite.hashCode()
        result = 31 * result + this.szCipherSuite.contentHashCode()
        result = 31 * result + this.szCipher.contentHashCode()
        result = 31 * result + this.dwCipherLen.hashCode()
        result = 31 * result + this.dwCipherBlockLen.hashCode()
        result = 31 * result + this.szHash.contentHashCode()
        result = 31 * result + this.dwHashLen.hashCode()
        result = 31 * result + this.szExchange.contentHashCode()
        result = 31 * result + this.dwMinExchangeLen.hashCode()
        result = 31 * result + this.dwMaxExchangeLen.hashCode()
        result = 31 * result + this.szCertificate.contentHashCode()
        result = 31 * result + this.dwKeyType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCipherInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCipherInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 680L
                override fun readNative(addr: Long): SecPkgContextCipherInfo =
                    SecPkgContextCipherInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 144L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 276L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 280L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 408L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 412L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 540L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 544L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 548L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 676L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextCipherInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCipherSuite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwBaseCipherSuite)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 16L, value.szCipherSuite.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 144L, value.szCipher.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 272L, value.dwCipherLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 276L, value.dwCipherBlockLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 280L, value.szHash.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 408L, value.dwHashLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 412L, value.szExchange.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 540L, value.dwMinExchangeLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 544L, value.dwMaxExchangeLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 548L, value.szCertificate.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 676L, value.dwKeyType)
                }
            }
    }
}

public data class SecPkgContextClientCertPolicyResult(
    public var dwPolicyResult: Hresult = 0,
    public var guidPolicyId: Guid = Guid(),
)

public class SecPkgContextClientSpecifiedTarget internal constructor(
    sTargetNameCtorArg: MutPtr<UShort>,
) {
    public var sTargetName: MutPtr<UShort> = sTargetNameCtorArg
        internal set

    public constructor() : this(
        sTargetNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UShort> = this.sTargetName

    public fun copy(sTargetName: MutPtr<UShort> = this.sTargetName): SecPkgContextClientSpecifiedTarget = SecPkgContextClientSpecifiedTarget(sTargetNameCtorArg = sTargetName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextClientSpecifiedTarget) return false
        if (this.sTargetName != other.sTargetName) return false
        return true
    }

    override fun hashCode(): Int = this.sTargetName.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextClientSpecifiedTarget> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextClientSpecifiedTarget> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextClientSpecifiedTarget =
                    SecPkgContextClientSpecifiedTarget(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextClientSpecifiedTarget) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.sTargetName)
                }
            }

        public operator fun invoke(
            sTargetName: MutPtr<UShort> = MutPtr(0L),
        ): SecPkgContextClientSpecifiedTarget =
            SecPkgContextClientSpecifiedTarget(
                sTargetNameCtorArg = sTargetName,
            )
    }
}

public data class SecPkgContextConnectionInfo(
    public var dwProtocol: UInt = 0u,
    public var aiCipher: AlgId = 0u,
    public var dwCipherStrength: UInt = 0u,
    public var aiHash: AlgId = 0u,
    public var dwHashStrength: UInt = 0u,
    public var aiExch: AlgId = 0u,
    public var dwExchStrength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextConnectionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextConnectionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): SecPkgContextConnectionInfo =
                    SecPkgContextConnectionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextConnectionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aiCipher)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCipherStrength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.aiHash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwHashStrength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.aiExch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwExchStrength)
                }
            }
    }
}

public data class SecPkgContextConnectionInfoEx(
    public var dwVersion: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var szCipher: UShortArray = UShortArray(64),
    public var dwCipherStrength: UInt = 0u,
    public var szHash: UShortArray = UShortArray(64),
    public var dwHashStrength: UInt = 0u,
    public var szExchange: UShortArray = UShortArray(64),
    public var dwExchStrength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextConnectionInfoEx) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (!this.szCipher.contentEquals(other.szCipher)) return false
        if (this.dwCipherStrength != other.dwCipherStrength) return false
        if (!this.szHash.contentEquals(other.szHash)) return false
        if (this.dwHashStrength != other.dwHashStrength) return false
        if (!this.szExchange.contentEquals(other.szExchange)) return false
        if (this.dwExchStrength != other.dwExchStrength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwProtocol.hashCode()
        result = 31 * result + this.szCipher.contentHashCode()
        result = 31 * result + this.dwCipherStrength.hashCode()
        result = 31 * result + this.szHash.contentHashCode()
        result = 31 * result + this.dwHashStrength.hashCode()
        result = 31 * result + this.szExchange.contentHashCode()
        result = 31 * result + this.dwExchStrength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextConnectionInfoEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextConnectionInfoEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 404L
                override fun readNative(addr: Long): SecPkgContextConnectionInfoEx =
                    SecPkgContextConnectionInfoEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 140L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 272L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 400L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextConnectionInfoEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwProtocol)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 8L, value.szCipher.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dwCipherStrength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 140L, value.szHash.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.dwHashStrength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 272L, value.szExchange.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 400L, value.dwExchStrength)
                }
            }
    }
}

public data class SecPkgContextCredInfo(
    public var credClass: SecpkgCredClass = 0,
    public var isPromptingNeeded: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCredInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCredInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextCredInfo =
                    SecPkgContextCredInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextCredInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.credClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.isPromptingNeeded)
                }
            }
    }
}

public class SecPkgContextCredentialNameA internal constructor(
    public var credentialType: UInt,
    sCredentialNameCtorArg: MutPtr<Byte>,
) {
    public var sCredentialName: MutPtr<Byte> = sCredentialNameCtorArg
        internal set

    public constructor() : this(
        credentialType = 0u,
        sCredentialNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.credentialType

    public operator fun component2(): MutPtr<Byte> = this.sCredentialName

    public fun copy(credentialType: UInt = this.credentialType, sCredentialName: MutPtr<Byte> = this.sCredentialName): SecPkgContextCredentialNameA = SecPkgContextCredentialNameA(credentialType = credentialType, sCredentialNameCtorArg = sCredentialName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextCredentialNameA) return false
        if (this.credentialType != other.credentialType) return false
        if (this.sCredentialName != other.sCredentialName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.credentialType.hashCode()
        result = 31 * result + this.sCredentialName.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCredentialNameA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCredentialNameA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextCredentialNameA =
                    SecPkgContextCredentialNameA(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextCredentialNameA) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.credentialType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.sCredentialName)
                }
            }

        public operator fun invoke(
            credentialType: UInt = 0u,
            sCredentialName: MutPtr<Byte> = MutPtr(0L),
        ): SecPkgContextCredentialNameA =
            SecPkgContextCredentialNameA(
                credentialType = credentialType,
                sCredentialNameCtorArg = sCredentialName,
            )
    }
}

public class SecPkgContextCredentialNameW internal constructor(
    public var credentialType: UInt,
    sCredentialNameCtorArg: MutPtr<UShort>,
) {
    public var sCredentialName: MutPtr<UShort> = sCredentialNameCtorArg
        internal set

    public constructor() : this(
        credentialType = 0u,
        sCredentialNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.credentialType

    public operator fun component2(): MutPtr<UShort> = this.sCredentialName

    public fun copy(credentialType: UInt = this.credentialType, sCredentialName: MutPtr<UShort> = this.sCredentialName): SecPkgContextCredentialNameW = SecPkgContextCredentialNameW(credentialType = credentialType, sCredentialNameCtorArg = sCredentialName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextCredentialNameW) return false
        if (this.credentialType != other.credentialType) return false
        if (this.sCredentialName != other.sCredentialName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.credentialType.hashCode()
        result = 31 * result + this.sCredentialName.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCredentialNameW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextCredentialNameW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextCredentialNameW =
                    SecPkgContextCredentialNameW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextCredentialNameW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.credentialType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.sCredentialName)
                }
            }

        public operator fun invoke(
            credentialType: UInt = 0u,
            sCredentialName: MutPtr<UShort> = MutPtr(0L),
        ): SecPkgContextCredentialNameW =
            SecPkgContextCredentialNameW(
                credentialType = credentialType,
                sCredentialNameCtorArg = sCredentialName,
            )
    }
}

public class SecPkgContextDceInfo internal constructor(
    public var authzSvc: UInt,
    pPacCtorArg: MutPtr<CVoid>,
) {
    public var pPac: MutPtr<CVoid> = pPacCtorArg
        internal set

    public constructor() : this(
        authzSvc = 0u,
        pPacCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.authzSvc

    public operator fun component2(): MutPtr<CVoid> = this.pPac

    public fun copy(authzSvc: UInt = this.authzSvc, pPac: MutPtr<CVoid> = this.pPac): SecPkgContextDceInfo = SecPkgContextDceInfo(authzSvc = authzSvc, pPacCtorArg = pPac)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextDceInfo) return false
        if (this.authzSvc != other.authzSvc) return false
        if (this.pPac != other.pPac) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.authzSvc.hashCode()
        result = 31 * result + this.pPac.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextDceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextDceInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextDceInfo =
                    SecPkgContextDceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextDceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.authzSvc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pPac)
                }
            }

        public operator fun invoke(
            authzSvc: UInt = 0u,
            pPac: MutPtr<CVoid> = MutPtr(0L),
        ): SecPkgContextDceInfo =
            SecPkgContextDceInfo(
                authzSvc = authzSvc,
                pPacCtorArg = pPac,
            )
    }
}

public data class SecPkgContextEapKeyBlock(
    public var rgbKeys: UByteArray = UByteArray(128),
    public var rgbIVs: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextEapKeyBlock) return false
        if (!this.rgbKeys.contentEquals(other.rgbKeys)) return false
        if (!this.rgbIVs.contentEquals(other.rgbIVs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgbKeys.contentHashCode()
        result = 31 * result + this.rgbIVs.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextEapKeyBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextEapKeyBlock> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 192L
                override fun readNative(addr: Long): SecPkgContextEapKeyBlock =
                    SecPkgContextEapKeyBlock(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 128L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextEapKeyBlock) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr, value.rgbKeys.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 128L, value.rgbIVs.toList())
                }
            }
    }
}

public class SecPkgContextEapPrfInfo internal constructor(
    public var dwVersion: UInt,
    public var cbPrfData: UInt,
    pbPrfDataCtorArg: MutPtr<UByte>,
) {
    public var pbPrfData: MutPtr<UByte> = pbPrfDataCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbPrfData = 0u,
        pbPrfDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbPrfData

    public operator fun component3(): MutPtr<UByte> = this.pbPrfData

    public fun copy(dwVersion: UInt = this.dwVersion, cbPrfData: UInt = this.cbPrfData, pbPrfData: MutPtr<UByte> = this.pbPrfData): SecPkgContextEapPrfInfo = SecPkgContextEapPrfInfo(dwVersion = dwVersion, cbPrfData = cbPrfData, pbPrfDataCtorArg = pbPrfData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextEapPrfInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbPrfData != other.cbPrfData) return false
        if (this.pbPrfData != other.pbPrfData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbPrfData.hashCode()
        result = 31 * result + this.pbPrfData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextEapPrfInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextEapPrfInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextEapPrfInfo =
                    SecPkgContextEapPrfInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextEapPrfInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbPrfData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbPrfData)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbPrfData: UInt = 0u,
            pbPrfData: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgContextEapPrfInfo =
            SecPkgContextEapPrfInfo(
                dwVersion = dwVersion,
                cbPrfData = cbPrfData,
                pbPrfDataCtorArg = pbPrfData,
            )
    }
}

public data class SecPkgContextEarlyStart(
    public var dwEarlyStartFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextEarlyStart> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextEarlyStart> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SecPkgContextEarlyStart =
                    SecPkgContextEarlyStart(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextEarlyStart) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwEarlyStartFlags)
                }
            }
    }
}

public data class SecPkgContextFlags(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextFlags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SecPkgContextFlags =
                    SecPkgContextFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public class SecPkgContextIssuerListInfoEx internal constructor(
    aIssuersCtorArg: MutPtr<CryptIntegerBlob>,
    public var cIssuers: UInt,
) {
    public var aIssuers: MutPtr<CryptIntegerBlob> = aIssuersCtorArg
        internal set

    public constructor() : this(
        aIssuersCtorArg = MutPtr(0L),
        cIssuers = 0u,
    )

    public operator fun component1(): MutPtr<CryptIntegerBlob> = this.aIssuers

    public operator fun component2(): UInt = this.cIssuers

    public fun copy(aIssuers: MutPtr<CryptIntegerBlob> = this.aIssuers, cIssuers: UInt = this.cIssuers): SecPkgContextIssuerListInfoEx = SecPkgContextIssuerListInfoEx(aIssuersCtorArg = aIssuers, cIssuers = cIssuers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextIssuerListInfoEx) return false
        if (this.aIssuers != other.aIssuers) return false
        if (this.cIssuers != other.cIssuers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aIssuers.hashCode()
        result = 31 * result + this.cIssuers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextIssuerListInfoEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextIssuerListInfoEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextIssuerListInfoEx =
                    SecPkgContextIssuerListInfoEx(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CryptIntegerBlob>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextIssuerListInfoEx) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CryptIntegerBlob>(64)
                    ).writeNative(addr, value.aIssuers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cIssuers)
                }
            }

        public operator fun invoke(
            aIssuers: MutPtr<CryptIntegerBlob> = MutPtr(0L),
            cIssuers: UInt = 0u,
        ): SecPkgContextIssuerListInfoEx =
            SecPkgContextIssuerListInfoEx(
                aIssuersCtorArg = aIssuers,
                cIssuers = cIssuers,
            )
    }
}

public class SecPkgContextKeyInfoA internal constructor(
    sSignatureAlgorithmNameCtorArg: MutPtr<Byte>,
    sEncryptAlgorithmNameCtorArg: MutPtr<Byte>,
    public var keySize: UInt,
    public var signatureAlgorithm: UInt,
    public var encryptAlgorithm: UInt,
) {
    public var sSignatureAlgorithmName: MutPtr<Byte> = sSignatureAlgorithmNameCtorArg
        internal set

    public var sEncryptAlgorithmName: MutPtr<Byte> = sEncryptAlgorithmNameCtorArg
        internal set

    public constructor() : this(
        sSignatureAlgorithmNameCtorArg = MutPtr(0L),
        sEncryptAlgorithmNameCtorArg = MutPtr(0L),
        keySize = 0u,
        signatureAlgorithm = 0u,
        encryptAlgorithm = 0u,
    )

    public operator fun component1(): MutPtr<Byte> = this.sSignatureAlgorithmName

    public operator fun component2(): MutPtr<Byte> = this.sEncryptAlgorithmName

    public operator fun component3(): UInt = this.keySize

    public operator fun component4(): UInt = this.signatureAlgorithm

    public operator fun component5(): UInt = this.encryptAlgorithm

    public fun copy(sSignatureAlgorithmName: MutPtr<Byte> = this.sSignatureAlgorithmName, sEncryptAlgorithmName: MutPtr<Byte> = this.sEncryptAlgorithmName, keySize: UInt = this.keySize, signatureAlgorithm: UInt = this.signatureAlgorithm, encryptAlgorithm: UInt = this.encryptAlgorithm): SecPkgContextKeyInfoA = SecPkgContextKeyInfoA(sSignatureAlgorithmNameCtorArg = sSignatureAlgorithmName, sEncryptAlgorithmNameCtorArg = sEncryptAlgorithmName, keySize = keySize, signatureAlgorithm = signatureAlgorithm, encryptAlgorithm = encryptAlgorithm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextKeyInfoA) return false
        if (this.sSignatureAlgorithmName != other.sSignatureAlgorithmName) return false
        if (this.sEncryptAlgorithmName != other.sEncryptAlgorithmName) return false
        if (this.keySize != other.keySize) return false
        if (this.signatureAlgorithm != other.signatureAlgorithm) return false
        if (this.encryptAlgorithm != other.encryptAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sSignatureAlgorithmName.hashCode()
        result = 31 * result + this.sEncryptAlgorithmName.hashCode()
        result = 31 * result + this.keySize.hashCode()
        result = 31 * result + this.signatureAlgorithm.hashCode()
        result = 31 * result + this.encryptAlgorithm.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextKeyInfoA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextKeyInfoA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SecPkgContextKeyInfoA =
                    SecPkgContextKeyInfoA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextKeyInfoA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.sSignatureAlgorithmName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.sEncryptAlgorithmName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.keySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.signatureAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.encryptAlgorithm)
                }
            }

        public operator fun invoke(
            sSignatureAlgorithmName: MutPtr<Byte> = MutPtr(0L),
            sEncryptAlgorithmName: MutPtr<Byte> = MutPtr(0L),
            keySize: UInt = 0u,
            signatureAlgorithm: UInt = 0u,
            encryptAlgorithm: UInt = 0u,
        ): SecPkgContextKeyInfoA =
            SecPkgContextKeyInfoA(
                sSignatureAlgorithmNameCtorArg = sSignatureAlgorithmName,
                sEncryptAlgorithmNameCtorArg = sEncryptAlgorithmName,
                keySize = keySize,
                signatureAlgorithm = signatureAlgorithm,
                encryptAlgorithm = encryptAlgorithm,
            )
    }
}

public class SecPkgContextKeyInfoW internal constructor(
    sSignatureAlgorithmNameCtorArg: MutPtr<UShort>,
    sEncryptAlgorithmNameCtorArg: MutPtr<UShort>,
    public var keySize: UInt,
    public var signatureAlgorithm: UInt,
    public var encryptAlgorithm: UInt,
) {
    public var sSignatureAlgorithmName: MutPtr<UShort> = sSignatureAlgorithmNameCtorArg
        internal set

    public var sEncryptAlgorithmName: MutPtr<UShort> = sEncryptAlgorithmNameCtorArg
        internal set

    public constructor() : this(
        sSignatureAlgorithmNameCtorArg = MutPtr(0L),
        sEncryptAlgorithmNameCtorArg = MutPtr(0L),
        keySize = 0u,
        signatureAlgorithm = 0u,
        encryptAlgorithm = 0u,
    )

    public operator fun component1(): MutPtr<UShort> = this.sSignatureAlgorithmName

    public operator fun component2(): MutPtr<UShort> = this.sEncryptAlgorithmName

    public operator fun component3(): UInt = this.keySize

    public operator fun component4(): UInt = this.signatureAlgorithm

    public operator fun component5(): UInt = this.encryptAlgorithm

    public fun copy(sSignatureAlgorithmName: MutPtr<UShort> = this.sSignatureAlgorithmName, sEncryptAlgorithmName: MutPtr<UShort> = this.sEncryptAlgorithmName, keySize: UInt = this.keySize, signatureAlgorithm: UInt = this.signatureAlgorithm, encryptAlgorithm: UInt = this.encryptAlgorithm): SecPkgContextKeyInfoW = SecPkgContextKeyInfoW(sSignatureAlgorithmNameCtorArg = sSignatureAlgorithmName, sEncryptAlgorithmNameCtorArg = sEncryptAlgorithmName, keySize = keySize, signatureAlgorithm = signatureAlgorithm, encryptAlgorithm = encryptAlgorithm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextKeyInfoW) return false
        if (this.sSignatureAlgorithmName != other.sSignatureAlgorithmName) return false
        if (this.sEncryptAlgorithmName != other.sEncryptAlgorithmName) return false
        if (this.keySize != other.keySize) return false
        if (this.signatureAlgorithm != other.signatureAlgorithm) return false
        if (this.encryptAlgorithm != other.encryptAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sSignatureAlgorithmName.hashCode()
        result = 31 * result + this.sEncryptAlgorithmName.hashCode()
        result = 31 * result + this.keySize.hashCode()
        result = 31 * result + this.signatureAlgorithm.hashCode()
        result = 31 * result + this.encryptAlgorithm.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextKeyInfoW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextKeyInfoW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SecPkgContextKeyInfoW =
                    SecPkgContextKeyInfoW(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextKeyInfoW) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.sSignatureAlgorithmName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.sEncryptAlgorithmName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.keySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.signatureAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.encryptAlgorithm)
                }
            }

        public operator fun invoke(
            sSignatureAlgorithmName: MutPtr<UShort> = MutPtr(0L),
            sEncryptAlgorithmName: MutPtr<UShort> = MutPtr(0L),
            keySize: UInt = 0u,
            signatureAlgorithm: UInt = 0u,
            encryptAlgorithm: UInt = 0u,
        ): SecPkgContextKeyInfoW =
            SecPkgContextKeyInfoW(
                sSignatureAlgorithmNameCtorArg = sSignatureAlgorithmName,
                sEncryptAlgorithmNameCtorArg = sEncryptAlgorithmName,
                keySize = keySize,
                signatureAlgorithm = signatureAlgorithm,
                encryptAlgorithm = encryptAlgorithm,
            )
    }
}

public class SecPkgContextKeyingMaterial internal constructor(
    public var cbKeyingMaterial: UInt,
    pbKeyingMaterialCtorArg: MutPtr<UByte>,
) {
    public var pbKeyingMaterial: MutPtr<UByte> = pbKeyingMaterialCtorArg
        internal set

    public constructor() : this(
        cbKeyingMaterial = 0u,
        pbKeyingMaterialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbKeyingMaterial

    public operator fun component2(): MutPtr<UByte> = this.pbKeyingMaterial

    public fun copy(cbKeyingMaterial: UInt = this.cbKeyingMaterial, pbKeyingMaterial: MutPtr<UByte> = this.pbKeyingMaterial): SecPkgContextKeyingMaterial = SecPkgContextKeyingMaterial(cbKeyingMaterial = cbKeyingMaterial, pbKeyingMaterialCtorArg = pbKeyingMaterial)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextKeyingMaterial) return false
        if (this.cbKeyingMaterial != other.cbKeyingMaterial) return false
        if (this.pbKeyingMaterial != other.pbKeyingMaterial) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbKeyingMaterial.hashCode()
        result = 31 * result + this.pbKeyingMaterial.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextKeyingMaterial> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextKeyingMaterial> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextKeyingMaterial =
                    SecPkgContextKeyingMaterial(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextKeyingMaterial) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbKeyingMaterial)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbKeyingMaterial)
                }
            }

        public operator fun invoke(
            cbKeyingMaterial: UInt = 0u,
            pbKeyingMaterial: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgContextKeyingMaterial =
            SecPkgContextKeyingMaterial(
                cbKeyingMaterial = cbKeyingMaterial,
                pbKeyingMaterialCtorArg = pbKeyingMaterial,
            )
    }
}

public class SecPkgContextKeyingMaterialInfo internal constructor(
    public var cbLabel: UShort,
    pszLabelCtorArg: Pstr,
    public var cbContextValue: UShort,
    pbContextValueCtorArg: MutPtr<UByte>,
    public var cbKeyingMaterial: UInt,
) {
    public var pszLabel: Pstr = pszLabelCtorArg
        internal set

    public var pbContextValue: MutPtr<UByte> = pbContextValueCtorArg
        internal set

    public constructor() : this(
        cbLabel = 0u,
        pszLabelCtorArg = MutPtr(0L),
        cbContextValue = 0u,
        pbContextValueCtorArg = MutPtr(0L),
        cbKeyingMaterial = 0u,
    )

    public operator fun component1(): UShort = this.cbLabel

    public operator fun component2(): Pstr = this.pszLabel

    public operator fun component3(): UShort = this.cbContextValue

    public operator fun component4(): MutPtr<UByte> = this.pbContextValue

    public operator fun component5(): UInt = this.cbKeyingMaterial

    public fun copy(cbLabel: UShort = this.cbLabel, pszLabel: Pstr = this.pszLabel, cbContextValue: UShort = this.cbContextValue, pbContextValue: MutPtr<UByte> = this.pbContextValue, cbKeyingMaterial: UInt = this.cbKeyingMaterial): SecPkgContextKeyingMaterialInfo = SecPkgContextKeyingMaterialInfo(cbLabel = cbLabel, pszLabelCtorArg = pszLabel, cbContextValue = cbContextValue, pbContextValueCtorArg = pbContextValue, cbKeyingMaterial = cbKeyingMaterial)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextKeyingMaterialInfo) return false
        if (this.cbLabel != other.cbLabel) return false
        if (this.pszLabel != other.pszLabel) return false
        if (this.cbContextValue != other.cbContextValue) return false
        if (this.pbContextValue != other.pbContextValue) return false
        if (this.cbKeyingMaterial != other.cbKeyingMaterial) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLabel.hashCode()
        result = 31 * result + this.pszLabel.hashCode()
        result = 31 * result + this.cbContextValue.hashCode()
        result = 31 * result + this.pbContextValue.hashCode()
        result = 31 * result + this.cbKeyingMaterial.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbLabel: UShort = 0u,
            pszLabel: Pstr = MutPtr(0L),
            cbContextValue: UShort = 0u,
            pbContextValue: MutPtr<UByte> = MutPtr(0L),
            cbKeyingMaterial: UInt = 0u,
        ): SecPkgContextKeyingMaterialInfo =
            SecPkgContextKeyingMaterialInfo(
                cbLabel = cbLabel,
                pszLabelCtorArg = pszLabel,
                cbContextValue = cbContextValue,
                pbContextValueCtorArg = pbContextValue,
                cbKeyingMaterial = cbKeyingMaterial,
            )
    }
}

public class SecPkgContextKeyingMaterialInproc internal constructor(
    public var cbLabel: UShort,
    pszLabelCtorArg: Pstr,
    public var cbContextValue: UShort,
    pbContextValueCtorArg: MutPtr<UByte>,
    public var cbKeyingMaterial: UInt,
    pbKeyingMaterialCtorArg: MutPtr<UByte>,
) {
    public var pszLabel: Pstr = pszLabelCtorArg
        internal set

    public var pbContextValue: MutPtr<UByte> = pbContextValueCtorArg
        internal set

    public var pbKeyingMaterial: MutPtr<UByte> = pbKeyingMaterialCtorArg
        internal set

    public constructor() : this(
        cbLabel = 0u,
        pszLabelCtorArg = MutPtr(0L),
        cbContextValue = 0u,
        pbContextValueCtorArg = MutPtr(0L),
        cbKeyingMaterial = 0u,
        pbKeyingMaterialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.cbLabel

    public operator fun component2(): Pstr = this.pszLabel

    public operator fun component3(): UShort = this.cbContextValue

    public operator fun component4(): MutPtr<UByte> = this.pbContextValue

    public operator fun component5(): UInt = this.cbKeyingMaterial

    public operator fun component6(): MutPtr<UByte> = this.pbKeyingMaterial

    public fun copy(cbLabel: UShort = this.cbLabel, pszLabel: Pstr = this.pszLabel, cbContextValue: UShort = this.cbContextValue, pbContextValue: MutPtr<UByte> = this.pbContextValue, cbKeyingMaterial: UInt = this.cbKeyingMaterial, pbKeyingMaterial: MutPtr<UByte> = this.pbKeyingMaterial): SecPkgContextKeyingMaterialInproc = SecPkgContextKeyingMaterialInproc(cbLabel = cbLabel, pszLabelCtorArg = pszLabel, cbContextValue = cbContextValue, pbContextValueCtorArg = pbContextValue, cbKeyingMaterial = cbKeyingMaterial, pbKeyingMaterialCtorArg = pbKeyingMaterial)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextKeyingMaterialInproc) return false
        if (this.cbLabel != other.cbLabel) return false
        if (this.pszLabel != other.pszLabel) return false
        if (this.cbContextValue != other.cbContextValue) return false
        if (this.pbContextValue != other.pbContextValue) return false
        if (this.cbKeyingMaterial != other.cbKeyingMaterial) return false
        if (this.pbKeyingMaterial != other.pbKeyingMaterial) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLabel.hashCode()
        result = 31 * result + this.pszLabel.hashCode()
        result = 31 * result + this.cbContextValue.hashCode()
        result = 31 * result + this.pbContextValue.hashCode()
        result = 31 * result + this.cbKeyingMaterial.hashCode()
        result = 31 * result + this.pbKeyingMaterial.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbLabel: UShort = 0u,
            pszLabel: Pstr = MutPtr(0L),
            cbContextValue: UShort = 0u,
            pbContextValue: MutPtr<UByte> = MutPtr(0L),
            cbKeyingMaterial: UInt = 0u,
            pbKeyingMaterial: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgContextKeyingMaterialInproc =
            SecPkgContextKeyingMaterialInproc(
                cbLabel = cbLabel,
                pszLabelCtorArg = pszLabel,
                cbContextValue = cbContextValue,
                pbContextValueCtorArg = pbContextValue,
                cbKeyingMaterial = cbKeyingMaterial,
                pbKeyingMaterialCtorArg = pbKeyingMaterial,
            )
    }
}

public data class SecPkgContextLastClientTokenStatus(
    public var lastClientTokenStatus: SecpkgAttrLctStatus = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextLastClientTokenStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextLastClientTokenStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SecPkgContextLastClientTokenStatus =
                    SecPkgContextLastClientTokenStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextLastClientTokenStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lastClientTokenStatus)
                }
            }
    }
}

public data class SecPkgContextLifespan(
    public var tsStart: Long = 0L,
    public var tsExpiry: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextLifespan> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextLifespan> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextLifespan =
                    SecPkgContextLifespan(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextLifespan) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tsStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tsExpiry)
                }
            }
    }
}

public class SecPkgContextLocalCredentialInfo internal constructor(
    public var cbCertificateChain: UInt,
    pbCertificateChainCtorArg: MutPtr<UByte>,
    public var cCertificates: UInt,
    public var fFlags: UInt,
    public var dwBits: UInt,
) {
    public var pbCertificateChain: MutPtr<UByte> = pbCertificateChainCtorArg
        internal set

    public constructor() : this(
        cbCertificateChain = 0u,
        pbCertificateChainCtorArg = MutPtr(0L),
        cCertificates = 0u,
        fFlags = 0u,
        dwBits = 0u,
    )

    public operator fun component1(): UInt = this.cbCertificateChain

    public operator fun component2(): MutPtr<UByte> = this.pbCertificateChain

    public operator fun component3(): UInt = this.cCertificates

    public operator fun component4(): UInt = this.fFlags

    public operator fun component5(): UInt = this.dwBits

    public fun copy(cbCertificateChain: UInt = this.cbCertificateChain, pbCertificateChain: MutPtr<UByte> = this.pbCertificateChain, cCertificates: UInt = this.cCertificates, fFlags: UInt = this.fFlags, dwBits: UInt = this.dwBits): SecPkgContextLocalCredentialInfo = SecPkgContextLocalCredentialInfo(cbCertificateChain = cbCertificateChain, pbCertificateChainCtorArg = pbCertificateChain, cCertificates = cCertificates, fFlags = fFlags, dwBits = dwBits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextLocalCredentialInfo) return false
        if (this.cbCertificateChain != other.cbCertificateChain) return false
        if (this.pbCertificateChain != other.pbCertificateChain) return false
        if (this.cCertificates != other.cCertificates) return false
        if (this.fFlags != other.fFlags) return false
        if (this.dwBits != other.dwBits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbCertificateChain.hashCode()
        result = 31 * result + this.pbCertificateChain.hashCode()
        result = 31 * result + this.cCertificates.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.dwBits.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextLocalCredentialInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextLocalCredentialInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SecPkgContextLocalCredentialInfo =
                    SecPkgContextLocalCredentialInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextLocalCredentialInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbCertificateChain)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbCertificateChain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cCertificates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.fFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwBits)
                }
            }

        public operator fun invoke(
            cbCertificateChain: UInt = 0u,
            pbCertificateChain: MutPtr<UByte> = MutPtr(0L),
            cCertificates: UInt = 0u,
            fFlags: UInt = 0u,
            dwBits: UInt = 0u,
        ): SecPkgContextLocalCredentialInfo =
            SecPkgContextLocalCredentialInfo(
                cbCertificateChain = cbCertificateChain,
                pbCertificateChainCtorArg = pbCertificateChain,
                cCertificates = cCertificates,
                fFlags = fFlags,
                dwBits = dwBits,
            )
    }
}

public data class SecPkgContextLogoffTime(
    public var tsLogoffTime: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextLogoffTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextLogoffTime> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextLogoffTime =
                    SecPkgContextLogoffTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextLogoffTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tsLogoffTime)
                }
            }
    }
}

public class SecPkgContextMappedCredAttr internal constructor(
    public var dwAttribute: UInt,
    pvBufferCtorArg: MutPtr<CVoid>,
) {
    public var pvBuffer: MutPtr<CVoid> = pvBufferCtorArg
        internal set

    public constructor() : this(
        dwAttribute = 0u,
        pvBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwAttribute

    public operator fun component2(): MutPtr<CVoid> = this.pvBuffer

    public fun copy(dwAttribute: UInt = this.dwAttribute, pvBuffer: MutPtr<CVoid> = this.pvBuffer): SecPkgContextMappedCredAttr = SecPkgContextMappedCredAttr(dwAttribute = dwAttribute, pvBufferCtorArg = pvBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextMappedCredAttr) return false
        if (this.dwAttribute != other.dwAttribute) return false
        if (this.pvBuffer != other.pvBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAttribute.hashCode()
        result = 31 * result + this.pvBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextMappedCredAttr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextMappedCredAttr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextMappedCredAttr =
                    SecPkgContextMappedCredAttr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextMappedCredAttr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAttribute)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pvBuffer)
                }
            }

        public operator fun invoke(
            dwAttribute: UInt = 0u,
            pvBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): SecPkgContextMappedCredAttr =
            SecPkgContextMappedCredAttr(
                dwAttribute = dwAttribute,
                pvBufferCtorArg = pvBuffer,
            )
    }
}

public class SecPkgContextNamesA internal constructor(
    sUserNameCtorArg: MutPtr<Byte>,
) {
    public var sUserName: MutPtr<Byte> = sUserNameCtorArg
        internal set

    public constructor() : this(
        sUserNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.sUserName

    public fun copy(sUserName: MutPtr<Byte> = this.sUserName): SecPkgContextNamesA = SecPkgContextNamesA(sUserNameCtorArg = sUserName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextNamesA) return false
        if (this.sUserName != other.sUserName) return false
        return true
    }

    override fun hashCode(): Int = this.sUserName.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNamesA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNamesA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextNamesA =
                    SecPkgContextNamesA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextNamesA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.sUserName)
                }
            }

        public operator fun invoke(
            sUserName: MutPtr<Byte> = MutPtr(0L),
        ): SecPkgContextNamesA =
            SecPkgContextNamesA(
                sUserNameCtorArg = sUserName,
            )
    }
}

public class SecPkgContextNamesW internal constructor(
    sUserNameCtorArg: MutPtr<UShort>,
) {
    public var sUserName: MutPtr<UShort> = sUserNameCtorArg
        internal set

    public constructor() : this(
        sUserNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UShort> = this.sUserName

    public fun copy(sUserName: MutPtr<UShort> = this.sUserName): SecPkgContextNamesW = SecPkgContextNamesW(sUserNameCtorArg = sUserName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextNamesW) return false
        if (this.sUserName != other.sUserName) return false
        return true
    }

    override fun hashCode(): Int = this.sUserName.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNamesW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNamesW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextNamesW =
                    SecPkgContextNamesW(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextNamesW) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.sUserName)
                }
            }

        public operator fun invoke(
            sUserName: MutPtr<UShort> = MutPtr(0L),
        ): SecPkgContextNamesW =
            SecPkgContextNamesW(
                sUserNameCtorArg = sUserName,
            )
    }
}

public class SecPkgContextNativeNamesA internal constructor(
    sClientNameCtorArg: MutPtr<Byte>,
    sServerNameCtorArg: MutPtr<Byte>,
) {
    public var sClientName: MutPtr<Byte> = sClientNameCtorArg
        internal set

    public var sServerName: MutPtr<Byte> = sServerNameCtorArg
        internal set

    public constructor() : this(
        sClientNameCtorArg = MutPtr(0L),
        sServerNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.sClientName

    public operator fun component2(): MutPtr<Byte> = this.sServerName

    public fun copy(sClientName: MutPtr<Byte> = this.sClientName, sServerName: MutPtr<Byte> = this.sServerName): SecPkgContextNativeNamesA = SecPkgContextNativeNamesA(sClientNameCtorArg = sClientName, sServerNameCtorArg = sServerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextNativeNamesA) return false
        if (this.sClientName != other.sClientName) return false
        if (this.sServerName != other.sServerName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sClientName.hashCode()
        result = 31 * result + this.sServerName.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNativeNamesA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNativeNamesA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextNativeNamesA =
                    SecPkgContextNativeNamesA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextNativeNamesA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.sClientName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.sServerName)
                }
            }

        public operator fun invoke(
            sClientName: MutPtr<Byte> = MutPtr(0L),
            sServerName: MutPtr<Byte> = MutPtr(0L),
        ): SecPkgContextNativeNamesA =
            SecPkgContextNativeNamesA(
                sClientNameCtorArg = sClientName,
                sServerNameCtorArg = sServerName,
            )
    }
}

public class SecPkgContextNativeNamesW internal constructor(
    sClientNameCtorArg: MutPtr<UShort>,
    sServerNameCtorArg: MutPtr<UShort>,
) {
    public var sClientName: MutPtr<UShort> = sClientNameCtorArg
        internal set

    public var sServerName: MutPtr<UShort> = sServerNameCtorArg
        internal set

    public constructor() : this(
        sClientNameCtorArg = MutPtr(0L),
        sServerNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UShort> = this.sClientName

    public operator fun component2(): MutPtr<UShort> = this.sServerName

    public fun copy(sClientName: MutPtr<UShort> = this.sClientName, sServerName: MutPtr<UShort> = this.sServerName): SecPkgContextNativeNamesW = SecPkgContextNativeNamesW(sClientNameCtorArg = sClientName, sServerNameCtorArg = sServerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextNativeNamesW) return false
        if (this.sClientName != other.sClientName) return false
        if (this.sServerName != other.sServerName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sClientName.hashCode()
        result = 31 * result + this.sServerName.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNativeNamesW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNativeNamesW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextNativeNamesW =
                    SecPkgContextNativeNamesW(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextNativeNamesW) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.sClientName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.sServerName)
                }
            }

        public operator fun invoke(
            sClientName: MutPtr<UShort> = MutPtr(0L),
            sServerName: MutPtr<UShort> = MutPtr(0L),
        ): SecPkgContextNativeNamesW =
            SecPkgContextNativeNamesW(
                sClientNameCtorArg = sClientName,
                sServerNameCtorArg = sServerName,
            )
    }
}

public class SecPkgContextNegoKeys internal constructor(
    public var keyType: UInt,
    public var keyLength: UShort,
    keyValueCtorArg: MutPtr<UByte>,
    public var verifyKeyType: UInt,
    public var verifyKeyLength: UShort,
    verifyKeyValueCtorArg: MutPtr<UByte>,
) {
    public var keyValue: MutPtr<UByte> = keyValueCtorArg
        internal set

    public var verifyKeyValue: MutPtr<UByte> = verifyKeyValueCtorArg
        internal set

    public constructor() : this(
        keyType = 0u,
        keyLength = 0u,
        keyValueCtorArg = MutPtr(0L),
        verifyKeyType = 0u,
        verifyKeyLength = 0u,
        verifyKeyValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.keyType

    public operator fun component2(): UShort = this.keyLength

    public operator fun component3(): MutPtr<UByte> = this.keyValue

    public operator fun component4(): UInt = this.verifyKeyType

    public operator fun component5(): UShort = this.verifyKeyLength

    public operator fun component6(): MutPtr<UByte> = this.verifyKeyValue

    public fun copy(keyType: UInt = this.keyType, keyLength: UShort = this.keyLength, keyValue: MutPtr<UByte> = this.keyValue, verifyKeyType: UInt = this.verifyKeyType, verifyKeyLength: UShort = this.verifyKeyLength, verifyKeyValue: MutPtr<UByte> = this.verifyKeyValue): SecPkgContextNegoKeys = SecPkgContextNegoKeys(keyType = keyType, keyLength = keyLength, keyValueCtorArg = keyValue, verifyKeyType = verifyKeyType, verifyKeyLength = verifyKeyLength, verifyKeyValueCtorArg = verifyKeyValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextNegoKeys) return false
        if (this.keyType != other.keyType) return false
        if (this.keyLength != other.keyLength) return false
        if (this.keyValue != other.keyValue) return false
        if (this.verifyKeyType != other.verifyKeyType) return false
        if (this.verifyKeyLength != other.verifyKeyLength) return false
        if (this.verifyKeyValue != other.verifyKeyValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyType.hashCode()
        result = 31 * result + this.keyLength.hashCode()
        result = 31 * result + this.keyValue.hashCode()
        result = 31 * result + this.verifyKeyType.hashCode()
        result = 31 * result + this.verifyKeyLength.hashCode()
        result = 31 * result + this.verifyKeyValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegoKeys> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegoKeys> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SecPkgContextNegoKeys =
                    SecPkgContextNegoKeys(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextNegoKeys) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.keyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.keyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.keyValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.verifyKeyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.verifyKeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.verifyKeyValue)
                }
            }

        public operator fun invoke(
            keyType: UInt = 0u,
            keyLength: UShort = 0u,
            keyValue: MutPtr<UByte> = MutPtr(0L),
            verifyKeyType: UInt = 0u,
            verifyKeyLength: UShort = 0u,
            verifyKeyValue: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgContextNegoKeys =
            SecPkgContextNegoKeys(
                keyType = keyType,
                keyLength = keyLength,
                keyValueCtorArg = keyValue,
                verifyKeyType = verifyKeyType,
                verifyKeyLength = verifyKeyLength,
                verifyKeyValueCtorArg = verifyKeyValue,
            )
    }
}

public data class SecPkgContextNegoPackageInfo(
    public var packageMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegoPackageInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegoPackageInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SecPkgContextNegoPackageInfo =
                    SecPkgContextNegoPackageInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextNegoPackageInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.packageMask)
                }
            }
    }
}

public data class SecPkgContextNegoStatus(
    public var lastStatus: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegoStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegoStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SecPkgContextNegoStatus =
                    SecPkgContextNegoStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextNegoStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lastStatus)
                }
            }
    }
}

public class SecPkgContextNegotiatedTlsExtensions internal constructor(
    public var extensionsCount: UInt,
    extensionsCtorArg: MutPtr<UShort>,
) {
    public var extensions: MutPtr<UShort> = extensionsCtorArg
        internal set

    public constructor() : this(
        extensionsCount = 0u,
        extensionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.extensionsCount

    public operator fun component2(): MutPtr<UShort> = this.extensions

    public fun copy(extensionsCount: UInt = this.extensionsCount, extensions: MutPtr<UShort> = this.extensions): SecPkgContextNegotiatedTlsExtensions = SecPkgContextNegotiatedTlsExtensions(extensionsCount = extensionsCount, extensionsCtorArg = extensions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextNegotiatedTlsExtensions) return false
        if (this.extensionsCount != other.extensionsCount) return false
        if (this.extensions != other.extensions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extensionsCount.hashCode()
        result = 31 * result + this.extensions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegotiatedTlsExtensions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegotiatedTlsExtensions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextNegotiatedTlsExtensions =
                    SecPkgContextNegotiatedTlsExtensions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextNegotiatedTlsExtensions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extensionsCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.extensions)
                }
            }

        public operator fun invoke(
            extensionsCount: UInt = 0u,
            extensions: MutPtr<UShort> = MutPtr(0L),
        ): SecPkgContextNegotiatedTlsExtensions =
            SecPkgContextNegotiatedTlsExtensions(
                extensionsCount = extensionsCount,
                extensionsCtorArg = extensions,
            )
    }
}

public class SecPkgContextNegotiationInfoA internal constructor(
    packageInfoCtorArg: MutPtr<SecPkgInfoA>,
    public var negotiationState: UInt,
) {
    public var packageInfo: MutPtr<SecPkgInfoA> = packageInfoCtorArg
        internal set

    public constructor() : this(
        packageInfoCtorArg = MutPtr(0L),
        negotiationState = 0u,
    )

    public operator fun component1(): MutPtr<SecPkgInfoA> = this.packageInfo

    public operator fun component2(): UInt = this.negotiationState

    public fun copy(packageInfo: MutPtr<SecPkgInfoA> = this.packageInfo, negotiationState: UInt = this.negotiationState): SecPkgContextNegotiationInfoA = SecPkgContextNegotiationInfoA(packageInfoCtorArg = packageInfo, negotiationState = negotiationState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextNegotiationInfoA) return false
        if (this.packageInfo != other.packageInfo) return false
        if (this.negotiationState != other.negotiationState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.packageInfo.hashCode()
        result = 31 * result + this.negotiationState.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegotiationInfoA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegotiationInfoA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextNegotiationInfoA =
                    SecPkgContextNegotiationInfoA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecPkgInfoA>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextNegotiationInfoA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecPkgInfoA>(64)
                    ).writeNative(addr, value.packageInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.negotiationState)
                }
            }

        public operator fun invoke(
            packageInfo: MutPtr<SecPkgInfoA> = MutPtr(0L),
            negotiationState: UInt = 0u,
        ): SecPkgContextNegotiationInfoA =
            SecPkgContextNegotiationInfoA(
                packageInfoCtorArg = packageInfo,
                negotiationState = negotiationState,
            )
    }
}

public class SecPkgContextNegotiationInfoW internal constructor(
    packageInfoCtorArg: MutPtr<SecPkgInfoW>,
    public var negotiationState: UInt,
) {
    public var packageInfo: MutPtr<SecPkgInfoW> = packageInfoCtorArg
        internal set

    public constructor() : this(
        packageInfoCtorArg = MutPtr(0L),
        negotiationState = 0u,
    )

    public operator fun component1(): MutPtr<SecPkgInfoW> = this.packageInfo

    public operator fun component2(): UInt = this.negotiationState

    public fun copy(packageInfo: MutPtr<SecPkgInfoW> = this.packageInfo, negotiationState: UInt = this.negotiationState): SecPkgContextNegotiationInfoW = SecPkgContextNegotiationInfoW(packageInfoCtorArg = packageInfo, negotiationState = negotiationState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextNegotiationInfoW) return false
        if (this.packageInfo != other.packageInfo) return false
        if (this.negotiationState != other.negotiationState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.packageInfo.hashCode()
        result = 31 * result + this.negotiationState.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegotiationInfoW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextNegotiationInfoW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextNegotiationInfoW =
                    SecPkgContextNegotiationInfoW(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecPkgInfoW>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextNegotiationInfoW) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecPkgInfoW>(64)
                    ).writeNative(addr, value.packageInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.negotiationState)
                }
            }

        public operator fun invoke(
            packageInfo: MutPtr<SecPkgInfoW> = MutPtr(0L),
            negotiationState: UInt = 0u,
        ): SecPkgContextNegotiationInfoW =
            SecPkgContextNegotiationInfoW(
                packageInfoCtorArg = packageInfo,
                negotiationState = negotiationState,
            )
    }
}

public class SecPkgContextPackageInfoA internal constructor(
    packageInfoCtorArg: MutPtr<SecPkgInfoA>,
) {
    public var packageInfo: MutPtr<SecPkgInfoA> = packageInfoCtorArg
        internal set

    public constructor() : this(
        packageInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<SecPkgInfoA> = this.packageInfo

    public fun copy(packageInfo: MutPtr<SecPkgInfoA> = this.packageInfo): SecPkgContextPackageInfoA = SecPkgContextPackageInfoA(packageInfoCtorArg = packageInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextPackageInfoA) return false
        if (this.packageInfo != other.packageInfo) return false
        return true
    }

    override fun hashCode(): Int = this.packageInfo.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextPackageInfoA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextPackageInfoA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextPackageInfoA =
                    SecPkgContextPackageInfoA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecPkgInfoA>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextPackageInfoA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecPkgInfoA>(64)
                    ).writeNative(addr, value.packageInfo)
                }
            }

        public operator fun invoke(
            packageInfo: MutPtr<SecPkgInfoA> = MutPtr(0L),
        ): SecPkgContextPackageInfoA =
            SecPkgContextPackageInfoA(
                packageInfoCtorArg = packageInfo,
            )
    }
}

public class SecPkgContextPackageInfoW internal constructor(
    packageInfoCtorArg: MutPtr<SecPkgInfoW>,
) {
    public var packageInfo: MutPtr<SecPkgInfoW> = packageInfoCtorArg
        internal set

    public constructor() : this(
        packageInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<SecPkgInfoW> = this.packageInfo

    public fun copy(packageInfo: MutPtr<SecPkgInfoW> = this.packageInfo): SecPkgContextPackageInfoW = SecPkgContextPackageInfoW(packageInfoCtorArg = packageInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextPackageInfoW) return false
        if (this.packageInfo != other.packageInfo) return false
        return true
    }

    override fun hashCode(): Int = this.packageInfo.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextPackageInfoW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextPackageInfoW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextPackageInfoW =
                    SecPkgContextPackageInfoW(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecPkgInfoW>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextPackageInfoW) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecPkgInfoW>(64)
                    ).writeNative(addr, value.packageInfo)
                }
            }

        public operator fun invoke(
            packageInfo: MutPtr<SecPkgInfoW> = MutPtr(0L),
        ): SecPkgContextPackageInfoW =
            SecPkgContextPackageInfoW(
                packageInfoCtorArg = packageInfo,
            )
    }
}

public data class SecPkgContextPasswordExpiry(
    public var tsPasswordExpires: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextPasswordExpiry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextPasswordExpiry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextPasswordExpiry =
                    SecPkgContextPasswordExpiry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextPasswordExpiry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tsPasswordExpires)
                }
            }
    }
}

public class SecPkgContextProtoInfoA internal constructor(
    sProtocolNameCtorArg: MutPtr<Byte>,
    public var majorVersion: UInt,
    public var minorVersion: UInt,
) {
    public var sProtocolName: MutPtr<Byte> = sProtocolNameCtorArg
        internal set

    public constructor() : this(
        sProtocolNameCtorArg = MutPtr(0L),
        majorVersion = 0u,
        minorVersion = 0u,
    )

    public operator fun component1(): MutPtr<Byte> = this.sProtocolName

    public operator fun component2(): UInt = this.majorVersion

    public operator fun component3(): UInt = this.minorVersion

    public fun copy(sProtocolName: MutPtr<Byte> = this.sProtocolName, majorVersion: UInt = this.majorVersion, minorVersion: UInt = this.minorVersion): SecPkgContextProtoInfoA = SecPkgContextProtoInfoA(sProtocolNameCtorArg = sProtocolName, majorVersion = majorVersion, minorVersion = minorVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextProtoInfoA) return false
        if (this.sProtocolName != other.sProtocolName) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sProtocolName.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextProtoInfoA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextProtoInfoA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextProtoInfoA =
                    SecPkgContextProtoInfoA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextProtoInfoA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.sProtocolName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.minorVersion)
                }
            }

        public operator fun invoke(
            sProtocolName: MutPtr<Byte> = MutPtr(0L),
            majorVersion: UInt = 0u,
            minorVersion: UInt = 0u,
        ): SecPkgContextProtoInfoA =
            SecPkgContextProtoInfoA(
                sProtocolNameCtorArg = sProtocolName,
                majorVersion = majorVersion,
                minorVersion = minorVersion,
            )
    }
}

public class SecPkgContextProtoInfoW internal constructor(
    sProtocolNameCtorArg: MutPtr<UShort>,
    public var majorVersion: UInt,
    public var minorVersion: UInt,
) {
    public var sProtocolName: MutPtr<UShort> = sProtocolNameCtorArg
        internal set

    public constructor() : this(
        sProtocolNameCtorArg = MutPtr(0L),
        majorVersion = 0u,
        minorVersion = 0u,
    )

    public operator fun component1(): MutPtr<UShort> = this.sProtocolName

    public operator fun component2(): UInt = this.majorVersion

    public operator fun component3(): UInt = this.minorVersion

    public fun copy(sProtocolName: MutPtr<UShort> = this.sProtocolName, majorVersion: UInt = this.majorVersion, minorVersion: UInt = this.minorVersion): SecPkgContextProtoInfoW = SecPkgContextProtoInfoW(sProtocolNameCtorArg = sProtocolName, majorVersion = majorVersion, minorVersion = minorVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextProtoInfoW) return false
        if (this.sProtocolName != other.sProtocolName) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sProtocolName.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextProtoInfoW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextProtoInfoW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextProtoInfoW =
                    SecPkgContextProtoInfoW(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextProtoInfoW) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.sProtocolName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.minorVersion)
                }
            }

        public operator fun invoke(
            sProtocolName: MutPtr<UShort> = MutPtr(0L),
            majorVersion: UInt = 0u,
            minorVersion: UInt = 0u,
        ): SecPkgContextProtoInfoW =
            SecPkgContextProtoInfoW(
                sProtocolNameCtorArg = sProtocolName,
                majorVersion = majorVersion,
                minorVersion = minorVersion,
            )
    }
}

public class SecPkgContextRemoteCredentialInfo internal constructor(
    public var cbCertificateChain: UInt,
    pbCertificateChainCtorArg: MutPtr<UByte>,
    public var cCertificates: UInt,
    public var fFlags: UInt,
    public var dwBits: UInt,
) {
    public var pbCertificateChain: MutPtr<UByte> = pbCertificateChainCtorArg
        internal set

    public constructor() : this(
        cbCertificateChain = 0u,
        pbCertificateChainCtorArg = MutPtr(0L),
        cCertificates = 0u,
        fFlags = 0u,
        dwBits = 0u,
    )

    public operator fun component1(): UInt = this.cbCertificateChain

    public operator fun component2(): MutPtr<UByte> = this.pbCertificateChain

    public operator fun component3(): UInt = this.cCertificates

    public operator fun component4(): UInt = this.fFlags

    public operator fun component5(): UInt = this.dwBits

    public fun copy(cbCertificateChain: UInt = this.cbCertificateChain, pbCertificateChain: MutPtr<UByte> = this.pbCertificateChain, cCertificates: UInt = this.cCertificates, fFlags: UInt = this.fFlags, dwBits: UInt = this.dwBits): SecPkgContextRemoteCredentialInfo = SecPkgContextRemoteCredentialInfo(cbCertificateChain = cbCertificateChain, pbCertificateChainCtorArg = pbCertificateChain, cCertificates = cCertificates, fFlags = fFlags, dwBits = dwBits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextRemoteCredentialInfo) return false
        if (this.cbCertificateChain != other.cbCertificateChain) return false
        if (this.pbCertificateChain != other.pbCertificateChain) return false
        if (this.cCertificates != other.cCertificates) return false
        if (this.fFlags != other.fFlags) return false
        if (this.dwBits != other.dwBits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbCertificateChain.hashCode()
        result = 31 * result + this.pbCertificateChain.hashCode()
        result = 31 * result + this.cCertificates.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.dwBits.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextRemoteCredentialInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextRemoteCredentialInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SecPkgContextRemoteCredentialInfo =
                    SecPkgContextRemoteCredentialInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextRemoteCredentialInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbCertificateChain)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbCertificateChain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cCertificates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.fFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwBits)
                }
            }

        public operator fun invoke(
            cbCertificateChain: UInt = 0u,
            pbCertificateChain: MutPtr<UByte> = MutPtr(0L),
            cCertificates: UInt = 0u,
            fFlags: UInt = 0u,
            dwBits: UInt = 0u,
        ): SecPkgContextRemoteCredentialInfo =
            SecPkgContextRemoteCredentialInfo(
                cbCertificateChain = cbCertificateChain,
                pbCertificateChainCtorArg = pbCertificateChain,
                cCertificates = cCertificates,
                fFlags = fFlags,
                dwBits = dwBits,
            )
    }
}

public class SecPkgContextSaslContext internal constructor(
    saslContextCtorArg: MutPtr<CVoid>,
) {
    public var saslContext: MutPtr<CVoid> = saslContextCtorArg
        internal set

    public constructor() : this(
        saslContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.saslContext

    public fun copy(saslContext: MutPtr<CVoid> = this.saslContext): SecPkgContextSaslContext = SecPkgContextSaslContext(saslContextCtorArg = saslContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextSaslContext) return false
        if (this.saslContext != other.saslContext) return false
        return true
    }

    override fun hashCode(): Int = this.saslContext.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSaslContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSaslContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextSaslContext =
                    SecPkgContextSaslContext(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextSaslContext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.saslContext)
                }
            }

        public operator fun invoke(
            saslContext: MutPtr<CVoid> = MutPtr(0L),
        ): SecPkgContextSaslContext =
            SecPkgContextSaslContext(
                saslContextCtorArg = saslContext,
            )
    }
}

public class SecPkgContextSessionAppData internal constructor(
    public var dwFlags: UInt,
    public var cbAppData: UInt,
    pbAppDataCtorArg: MutPtr<UByte>,
) {
    public var pbAppData: MutPtr<UByte> = pbAppDataCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        cbAppData = 0u,
        pbAppDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): UInt = this.cbAppData

    public operator fun component3(): MutPtr<UByte> = this.pbAppData

    public fun copy(dwFlags: UInt = this.dwFlags, cbAppData: UInt = this.cbAppData, pbAppData: MutPtr<UByte> = this.pbAppData): SecPkgContextSessionAppData = SecPkgContextSessionAppData(dwFlags = dwFlags, cbAppData = cbAppData, pbAppDataCtorArg = pbAppData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextSessionAppData) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbAppData != other.cbAppData) return false
        if (this.pbAppData != other.pbAppData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.cbAppData.hashCode()
        result = 31 * result + this.pbAppData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSessionAppData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSessionAppData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextSessionAppData =
                    SecPkgContextSessionAppData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextSessionAppData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbAppData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbAppData)
                }
            }

        public operator fun invoke(
            dwFlags: UInt = 0u,
            cbAppData: UInt = 0u,
            pbAppData: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgContextSessionAppData =
            SecPkgContextSessionAppData(
                dwFlags = dwFlags,
                cbAppData = cbAppData,
                pbAppDataCtorArg = pbAppData,
            )
    }
}

public data class SecPkgContextSessionInfo(
    public var dwFlags: UInt = 0u,
    public var cbSessionId: UInt = 0u,
    public var rgbSessionId: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextSessionInfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbSessionId != other.cbSessionId) return false
        if (!this.rgbSessionId.contentEquals(other.rgbSessionId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.cbSessionId.hashCode()
        result = 31 * result + this.rgbSessionId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSessionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSessionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): SecPkgContextSessionInfo =
                    SecPkgContextSessionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextSessionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbSessionId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.rgbSessionId.toList())
                }
            }
    }
}

public class SecPkgContextSessionKey internal constructor(
    public var sessionKeyLength: UInt,
    sessionKeyCtorArg: MutPtr<UByte>,
) {
    public var sessionKey: MutPtr<UByte> = sessionKeyCtorArg
        internal set

    public constructor() : this(
        sessionKeyLength = 0u,
        sessionKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sessionKeyLength

    public operator fun component2(): MutPtr<UByte> = this.sessionKey

    public fun copy(sessionKeyLength: UInt = this.sessionKeyLength, sessionKey: MutPtr<UByte> = this.sessionKey): SecPkgContextSessionKey = SecPkgContextSessionKey(sessionKeyLength = sessionKeyLength, sessionKeyCtorArg = sessionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextSessionKey) return false
        if (this.sessionKeyLength != other.sessionKeyLength) return false
        if (this.sessionKey != other.sessionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionKeyLength.hashCode()
        result = 31 * result + this.sessionKey.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSessionKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSessionKey> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextSessionKey =
                    SecPkgContextSessionKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextSessionKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionKeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.sessionKey)
                }
            }

        public operator fun invoke(
            sessionKeyLength: UInt = 0u,
            sessionKey: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgContextSessionKey =
            SecPkgContextSessionKey(
                sessionKeyLength = sessionKeyLength,
                sessionKeyCtorArg = sessionKey,
            )
    }
}

public data class SecPkgContextSizes(
    public var cbMaxToken: UInt = 0u,
    public var cbMaxSignature: UInt = 0u,
    public var cbBlockSize: UInt = 0u,
    public var cbSecurityTrailer: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSizes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSizes> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextSizes =
                    SecPkgContextSizes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextSizes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbMaxToken)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbMaxSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbSecurityTrailer)
                }
            }
    }
}

public class SecPkgContextSrtpParameters internal constructor(
    public var protectionProfile: UShort,
    public var masterKeyIdentifierSize: UByte,
    masterKeyIdentifierCtorArg: MutPtr<UByte>,
) {
    public var masterKeyIdentifier: MutPtr<UByte> = masterKeyIdentifierCtorArg
        internal set

    public constructor() : this(
        protectionProfile = 0u,
        masterKeyIdentifierSize = 0u,
        masterKeyIdentifierCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.protectionProfile

    public operator fun component2(): UByte = this.masterKeyIdentifierSize

    public operator fun component3(): MutPtr<UByte> = this.masterKeyIdentifier

    public fun copy(protectionProfile: UShort = this.protectionProfile, masterKeyIdentifierSize: UByte = this.masterKeyIdentifierSize, masterKeyIdentifier: MutPtr<UByte> = this.masterKeyIdentifier): SecPkgContextSrtpParameters = SecPkgContextSrtpParameters(protectionProfile = protectionProfile, masterKeyIdentifierSize = masterKeyIdentifierSize, masterKeyIdentifierCtorArg = masterKeyIdentifier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextSrtpParameters) return false
        if (this.protectionProfile != other.protectionProfile) return false
        if (this.masterKeyIdentifierSize != other.masterKeyIdentifierSize) return false
        if (this.masterKeyIdentifier != other.masterKeyIdentifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protectionProfile.hashCode()
        result = 31 * result + this.masterKeyIdentifierSize.hashCode()
        result = 31 * result + this.masterKeyIdentifier.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSrtpParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSrtpParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextSrtpParameters =
                    SecPkgContextSrtpParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextSrtpParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.protectionProfile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.masterKeyIdentifierSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.masterKeyIdentifier)
                }
            }

        public operator fun invoke(
            protectionProfile: UShort = 0u,
            masterKeyIdentifierSize: UByte = 0u,
            masterKeyIdentifier: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgContextSrtpParameters =
            SecPkgContextSrtpParameters(
                protectionProfile = protectionProfile,
                masterKeyIdentifierSize = masterKeyIdentifierSize,
                masterKeyIdentifierCtorArg = masterKeyIdentifier,
            )
    }
}

public data class SecPkgContextStreamSizes(
    public var cbHeader: UInt = 0u,
    public var cbTrailer: UInt = 0u,
    public var cbMaximumMessage: UInt = 0u,
    public var cBuffers: UInt = 0u,
    public var cbBlockSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextStreamSizes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextStreamSizes> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SecPkgContextStreamSizes =
                    SecPkgContextStreamSizes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextStreamSizes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbTrailer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbMaximumMessage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbBlockSize)
                }
            }
    }
}

public class SecPkgContextSubjectAttributes internal constructor(
    attributeInfoCtorArg: MutPtr<CVoid>,
) {
    public var attributeInfo: MutPtr<CVoid> = attributeInfoCtorArg
        internal set

    public constructor() : this(
        attributeInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.attributeInfo

    public fun copy(attributeInfo: MutPtr<CVoid> = this.attributeInfo): SecPkgContextSubjectAttributes = SecPkgContextSubjectAttributes(attributeInfoCtorArg = attributeInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextSubjectAttributes) return false
        if (this.attributeInfo != other.attributeInfo) return false
        return true
    }

    override fun hashCode(): Int = this.attributeInfo.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSubjectAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSubjectAttributes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgContextSubjectAttributes =
                    SecPkgContextSubjectAttributes(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextSubjectAttributes) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.attributeInfo)
                }
            }

        public operator fun invoke(
            attributeInfo: MutPtr<CVoid> = MutPtr(0L),
        ): SecPkgContextSubjectAttributes =
            SecPkgContextSubjectAttributes(
                attributeInfoCtorArg = attributeInfo,
            )
    }
}

public class SecPkgContextSupportedSignatures internal constructor(
    public var cSignatureAndHashAlgorithms: UShort,
    pSignatureAndHashAlgorithmsCtorArg: MutPtr<UShort>,
) {
    public var pSignatureAndHashAlgorithms: MutPtr<UShort> = pSignatureAndHashAlgorithmsCtorArg
        internal set

    public constructor() : this(
        cSignatureAndHashAlgorithms = 0u,
        pSignatureAndHashAlgorithmsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.cSignatureAndHashAlgorithms

    public operator fun component2(): MutPtr<UShort> = this.pSignatureAndHashAlgorithms

    public fun copy(cSignatureAndHashAlgorithms: UShort = this.cSignatureAndHashAlgorithms, pSignatureAndHashAlgorithms: MutPtr<UShort> = this.pSignatureAndHashAlgorithms): SecPkgContextSupportedSignatures = SecPkgContextSupportedSignatures(cSignatureAndHashAlgorithms = cSignatureAndHashAlgorithms, pSignatureAndHashAlgorithmsCtorArg = pSignatureAndHashAlgorithms)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextSupportedSignatures) return false
        if (this.cSignatureAndHashAlgorithms != other.cSignatureAndHashAlgorithms) return false
        if (this.pSignatureAndHashAlgorithms != other.pSignatureAndHashAlgorithms) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cSignatureAndHashAlgorithms.hashCode()
        result = 31 * result + this.pSignatureAndHashAlgorithms.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSupportedSignatures> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextSupportedSignatures> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextSupportedSignatures =
                    SecPkgContextSupportedSignatures(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextSupportedSignatures) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cSignatureAndHashAlgorithms)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.pSignatureAndHashAlgorithms)
                }
            }

        public operator fun invoke(
            cSignatureAndHashAlgorithms: UShort = 0u,
            pSignatureAndHashAlgorithms: MutPtr<UShort> = MutPtr(0L),
        ): SecPkgContextSupportedSignatures =
            SecPkgContextSupportedSignatures(
                cSignatureAndHashAlgorithms = cSignatureAndHashAlgorithms,
                pSignatureAndHashAlgorithmsCtorArg = pSignatureAndHashAlgorithms,
            )
    }
}

public class SecPkgContextTarget internal constructor(
    public var targetLength: UInt,
    targetCtorArg: Pstr,
) {
    public var target: Pstr = targetCtorArg
        internal set

    public constructor() : this(
        targetLength = 0u,
        targetCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.targetLength

    public operator fun component2(): Pstr = this.target

    public fun copy(targetLength: UInt = this.targetLength, target: Pstr = this.target): SecPkgContextTarget = SecPkgContextTarget(targetLength = targetLength, targetCtorArg = target)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextTarget) return false
        if (this.targetLength != other.targetLength) return false
        if (this.target != other.target) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetLength.hashCode()
        result = 31 * result + this.target.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            targetLength: UInt = 0u,
            target: Pstr = MutPtr(0L),
        ): SecPkgContextTarget =
            SecPkgContextTarget(
                targetLength = targetLength,
                targetCtorArg = target,
            )
    }
}

public class SecPkgContextTargetInformation internal constructor(
    public var marshalledTargetInfoLength: UInt,
    marshalledTargetInfoCtorArg: MutPtr<UByte>,
) {
    public var marshalledTargetInfo: MutPtr<UByte> = marshalledTargetInfoCtorArg
        internal set

    public constructor() : this(
        marshalledTargetInfoLength = 0u,
        marshalledTargetInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.marshalledTargetInfoLength

    public operator fun component2(): MutPtr<UByte> = this.marshalledTargetInfo

    public fun copy(marshalledTargetInfoLength: UInt = this.marshalledTargetInfoLength, marshalledTargetInfo: MutPtr<UByte> = this.marshalledTargetInfo): SecPkgContextTargetInformation = SecPkgContextTargetInformation(marshalledTargetInfoLength = marshalledTargetInfoLength, marshalledTargetInfoCtorArg = marshalledTargetInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextTargetInformation) return false
        if (this.marshalledTargetInfoLength != other.marshalledTargetInfoLength) return false
        if (this.marshalledTargetInfo != other.marshalledTargetInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.marshalledTargetInfoLength.hashCode()
        result = 31 * result + this.marshalledTargetInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextTargetInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextTargetInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextTargetInformation =
                    SecPkgContextTargetInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextTargetInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.marshalledTargetInfoLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.marshalledTargetInfo)
                }
            }

        public operator fun invoke(
            marshalledTargetInfoLength: UInt = 0u,
            marshalledTargetInfo: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgContextTargetInformation =
            SecPkgContextTargetInformation(
                marshalledTargetInfoLength = marshalledTargetInfoLength,
                marshalledTargetInfoCtorArg = marshalledTargetInfo,
            )
    }
}

public class SecPkgContextTokenBinding internal constructor(
    public var majorVersion: UByte,
    public var minorVersion: UByte,
    public var keyParametersSize: UShort,
    keyParametersCtorArg: MutPtr<UByte>,
) {
    public var keyParameters: MutPtr<UByte> = keyParametersCtorArg
        internal set

    public constructor() : this(
        majorVersion = 0u,
        minorVersion = 0u,
        keyParametersSize = 0u,
        keyParametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.majorVersion

    public operator fun component2(): UByte = this.minorVersion

    public operator fun component3(): UShort = this.keyParametersSize

    public operator fun component4(): MutPtr<UByte> = this.keyParameters

    public fun copy(majorVersion: UByte = this.majorVersion, minorVersion: UByte = this.minorVersion, keyParametersSize: UShort = this.keyParametersSize, keyParameters: MutPtr<UByte> = this.keyParameters): SecPkgContextTokenBinding = SecPkgContextTokenBinding(majorVersion = majorVersion, minorVersion = minorVersion, keyParametersSize = keyParametersSize, keyParametersCtorArg = keyParameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextTokenBinding) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.keyParametersSize != other.keyParametersSize) return false
        if (this.keyParameters != other.keyParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.keyParametersSize.hashCode()
        result = 31 * result + this.keyParameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextTokenBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextTokenBinding> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextTokenBinding =
                    SecPkgContextTokenBinding(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextTokenBinding) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.keyParametersSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.keyParameters)
                }
            }

        public operator fun invoke(
            majorVersion: UByte = 0u,
            minorVersion: UByte = 0u,
            keyParametersSize: UShort = 0u,
            keyParameters: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgContextTokenBinding =
            SecPkgContextTokenBinding(
                majorVersion = majorVersion,
                minorVersion = minorVersion,
                keyParametersSize = keyParametersSize,
                keyParametersCtorArg = keyParameters,
            )
    }
}

public class SecPkgContextUiInfo internal constructor(
    hParentWindowCtorArg: Hwnd,
) {
    public var hParentWindow: Hwnd = hParentWindowCtorArg
        internal set

    public constructor() : this(
        hParentWindowCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hwnd = this.hParentWindow

    public fun copy(hParentWindow: Hwnd = this.hParentWindow): SecPkgContextUiInfo = SecPkgContextUiInfo(hParentWindowCtorArg = hParentWindow)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextUiInfo) return false
        if (this.hParentWindow != other.hParentWindow) return false
        return true
    }

    override fun hashCode(): Int = this.hParentWindow.hashCode()

    public companion object {
        public operator fun invoke(
            hParentWindow: Hwnd = MutPtr(0L),
        ): SecPkgContextUiInfo =
            SecPkgContextUiInfo(
                hParentWindowCtorArg = hParentWindow,
            )
    }
}

public data class SecPkgContextUserFlags(
    public var userFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextUserFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextUserFlags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SecPkgContextUserFlags =
                    SecPkgContextUserFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextUserFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.userFlags)
                }
            }
    }
}

public data class SecPkgCredCipherStrengths(
    public var dwMinimumCipherStrength: UInt = 0u,
    public var dwMaximumCipherStrength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredCipherStrengths> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredCipherStrengths> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgCredCipherStrengths =
                    SecPkgCredCipherStrengths(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecPkgCredCipherStrengths) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMinimumCipherStrength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMaximumCipherStrength)
                }
            }
    }
}

public class SecPkgCredClientCertPolicy internal constructor(
    public var dwFlags: UInt,
    public var guidPolicyId: Guid,
    public var dwCertFlags: UInt,
    public var dwUrlRetrievalTimeout: UInt,
    public var fCheckRevocationFreshnessTime: Bool,
    public var dwRevocationFreshnessTime: UInt,
    public var fOmitUsageCheck: Bool,
    pwszSslCtlStoreNameCtorArg: Pwstr,
    pwszSslCtlIdentifierCtorArg: Pwstr,
) {
    public var pwszSslCtlStoreName: Pwstr = pwszSslCtlStoreNameCtorArg
        internal set

    public var pwszSslCtlIdentifier: Pwstr = pwszSslCtlIdentifierCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        guidPolicyId = Guid(),
        dwCertFlags = 0u,
        dwUrlRetrievalTimeout = 0u,
        fCheckRevocationFreshnessTime = 0,
        dwRevocationFreshnessTime = 0u,
        fOmitUsageCheck = 0,
        pwszSslCtlStoreNameCtorArg = MutPtr(0L),
        pwszSslCtlIdentifierCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): Guid = this.guidPolicyId

    public operator fun component3(): UInt = this.dwCertFlags

    public operator fun component4(): UInt = this.dwUrlRetrievalTimeout

    public operator fun component5(): Bool = this.fCheckRevocationFreshnessTime

    public operator fun component6(): UInt = this.dwRevocationFreshnessTime

    public operator fun component7(): Bool = this.fOmitUsageCheck

    public operator fun component8(): Pwstr = this.pwszSslCtlStoreName

    public operator fun component9(): Pwstr = this.pwszSslCtlIdentifier

    public fun copy(dwFlags: UInt = this.dwFlags, guidPolicyId: Guid = this.guidPolicyId, dwCertFlags: UInt = this.dwCertFlags, dwUrlRetrievalTimeout: UInt = this.dwUrlRetrievalTimeout, fCheckRevocationFreshnessTime: Bool = this.fCheckRevocationFreshnessTime, dwRevocationFreshnessTime: UInt = this.dwRevocationFreshnessTime, fOmitUsageCheck: Bool = this.fOmitUsageCheck, pwszSslCtlStoreName: Pwstr = this.pwszSslCtlStoreName, pwszSslCtlIdentifier: Pwstr = this.pwszSslCtlIdentifier): SecPkgCredClientCertPolicy = SecPkgCredClientCertPolicy(dwFlags = dwFlags, guidPolicyId = guidPolicyId, dwCertFlags = dwCertFlags, dwUrlRetrievalTimeout = dwUrlRetrievalTimeout, fCheckRevocationFreshnessTime = fCheckRevocationFreshnessTime, dwRevocationFreshnessTime = dwRevocationFreshnessTime, fOmitUsageCheck = fOmitUsageCheck, pwszSslCtlStoreNameCtorArg = pwszSslCtlStoreName, pwszSslCtlIdentifierCtorArg = pwszSslCtlIdentifier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCredClientCertPolicy) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.guidPolicyId != other.guidPolicyId) return false
        if (this.dwCertFlags != other.dwCertFlags) return false
        if (this.dwUrlRetrievalTimeout != other.dwUrlRetrievalTimeout) return false
        if (this.fCheckRevocationFreshnessTime != other.fCheckRevocationFreshnessTime) return false
        if (this.dwRevocationFreshnessTime != other.dwRevocationFreshnessTime) return false
        if (this.fOmitUsageCheck != other.fOmitUsageCheck) return false
        if (this.pwszSslCtlStoreName != other.pwszSslCtlStoreName) return false
        if (this.pwszSslCtlIdentifier != other.pwszSslCtlIdentifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.guidPolicyId.hashCode()
        result = 31 * result + this.dwCertFlags.hashCode()
        result = 31 * result + this.dwUrlRetrievalTimeout.hashCode()
        result = 31 * result + this.fCheckRevocationFreshnessTime.hashCode()
        result = 31 * result + this.dwRevocationFreshnessTime.hashCode()
        result = 31 * result + this.fOmitUsageCheck.hashCode()
        result = 31 * result + this.pwszSslCtlStoreName.hashCode()
        result = 31 * result + this.pwszSslCtlIdentifier.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            guidPolicyId: Guid = Guid(),
            dwCertFlags: UInt = 0u,
            dwUrlRetrievalTimeout: UInt = 0u,
            fCheckRevocationFreshnessTime: Bool = 0,
            dwRevocationFreshnessTime: UInt = 0u,
            fOmitUsageCheck: Bool = 0,
            pwszSslCtlStoreName: Pwstr = MutPtr(0L),
            pwszSslCtlIdentifier: Pwstr = MutPtr(0L),
        ): SecPkgCredClientCertPolicy =
            SecPkgCredClientCertPolicy(
                dwFlags = dwFlags,
                guidPolicyId = guidPolicyId,
                dwCertFlags = dwCertFlags,
                dwUrlRetrievalTimeout = dwUrlRetrievalTimeout,
                fCheckRevocationFreshnessTime = fCheckRevocationFreshnessTime,
                dwRevocationFreshnessTime = dwRevocationFreshnessTime,
                fOmitUsageCheck = fOmitUsageCheck,
                pwszSslCtlStoreNameCtorArg = pwszSslCtlStoreName,
                pwszSslCtlIdentifierCtorArg = pwszSslCtlIdentifier,
            )
    }
}

public data class SecPkgCredSessionTicketKey(
    public var ticketInfoVersion: UInt = 0u,
    public var keyId: UByteArray = UByteArray(16),
    public var keyingMaterial: UByteArray = UByteArray(64),
    public var keyingMaterialSize: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCredSessionTicketKey) return false
        if (this.ticketInfoVersion != other.ticketInfoVersion) return false
        if (!this.keyId.contentEquals(other.keyId)) return false
        if (!this.keyingMaterial.contentEquals(other.keyingMaterial)) return false
        if (this.keyingMaterialSize != other.keyingMaterialSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ticketInfoVersion.hashCode()
        result = 31 * result + this.keyId.contentHashCode()
        result = 31 * result + this.keyingMaterial.contentHashCode()
        result = 31 * result + this.keyingMaterialSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredSessionTicketKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredSessionTicketKey> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): SecPkgCredSessionTicketKey =
                    SecPkgCredSessionTicketKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 84L),
                    )
                override fun writeNative(addr: Long, value: SecPkgCredSessionTicketKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ticketInfoVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 4L, value.keyId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 20L, value.keyingMaterial.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 84L, value.keyingMaterialSize)
                }
            }
    }
}

public class SecPkgCredSessionTicketKeys internal constructor(
    public var cSessionTicketKeys: UInt,
    pSessionTicketKeysCtorArg: MutPtr<SecPkgCredSessionTicketKey>,
) {
    public var pSessionTicketKeys: MutPtr<SecPkgCredSessionTicketKey> = pSessionTicketKeysCtorArg
        internal set

    public constructor() : this(
        cSessionTicketKeys = 0u,
        pSessionTicketKeysCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cSessionTicketKeys

    public operator fun component2(): MutPtr<SecPkgCredSessionTicketKey> = this.pSessionTicketKeys

    public fun copy(cSessionTicketKeys: UInt = this.cSessionTicketKeys, pSessionTicketKeys: MutPtr<SecPkgCredSessionTicketKey> = this.pSessionTicketKeys): SecPkgCredSessionTicketKeys = SecPkgCredSessionTicketKeys(cSessionTicketKeys = cSessionTicketKeys, pSessionTicketKeysCtorArg = pSessionTicketKeys)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCredSessionTicketKeys) return false
        if (this.cSessionTicketKeys != other.cSessionTicketKeys) return false
        if (this.pSessionTicketKeys != other.pSessionTicketKeys) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cSessionTicketKeys.hashCode()
        result = 31 * result + this.pSessionTicketKeys.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredSessionTicketKeys> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredSessionTicketKeys> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgCredSessionTicketKeys =
                    SecPkgCredSessionTicketKeys(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecPkgCredSessionTicketKey>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgCredSessionTicketKeys) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cSessionTicketKeys)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecPkgCredSessionTicketKey>(64)
                    ).writeNative(addr + 8L, value.pSessionTicketKeys)
                }
            }

        public operator fun invoke(
            cSessionTicketKeys: UInt = 0u,
            pSessionTicketKeys: MutPtr<SecPkgCredSessionTicketKey> = MutPtr(0L),
        ): SecPkgCredSessionTicketKeys =
            SecPkgCredSessionTicketKeys(
                cSessionTicketKeys = cSessionTicketKeys,
                pSessionTicketKeysCtorArg = pSessionTicketKeys,
            )
    }
}

public class SecPkgCredSupportedAlgs internal constructor(
    public var cSupportedAlgs: UInt,
    palgSupportedAlgsCtorArg: MutPtr<AlgId>,
) {
    public var palgSupportedAlgs: MutPtr<AlgId> = palgSupportedAlgsCtorArg
        internal set

    public constructor() : this(
        cSupportedAlgs = 0u,
        palgSupportedAlgsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cSupportedAlgs

    public operator fun component2(): MutPtr<AlgId> = this.palgSupportedAlgs

    public fun copy(cSupportedAlgs: UInt = this.cSupportedAlgs, palgSupportedAlgs: MutPtr<AlgId> = this.palgSupportedAlgs): SecPkgCredSupportedAlgs = SecPkgCredSupportedAlgs(cSupportedAlgs = cSupportedAlgs, palgSupportedAlgsCtorArg = palgSupportedAlgs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCredSupportedAlgs) return false
        if (this.cSupportedAlgs != other.cSupportedAlgs) return false
        if (this.palgSupportedAlgs != other.palgSupportedAlgs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cSupportedAlgs.hashCode()
        result = 31 * result + this.palgSupportedAlgs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredSupportedAlgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredSupportedAlgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgCredSupportedAlgs =
                    SecPkgCredSupportedAlgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<AlgId>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgCredSupportedAlgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cSupportedAlgs)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<AlgId>(64)
                    ).writeNative(addr + 8L, value.palgSupportedAlgs)
                }
            }

        public operator fun invoke(
            cSupportedAlgs: UInt = 0u,
            palgSupportedAlgs: MutPtr<AlgId> = MutPtr(0L),
        ): SecPkgCredSupportedAlgs =
            SecPkgCredSupportedAlgs(
                cSupportedAlgs = cSupportedAlgs,
                palgSupportedAlgsCtorArg = palgSupportedAlgs,
            )
    }
}

public data class SecPkgCredSupportedProtocols(
    public var grbitProtocol: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredSupportedProtocols> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredSupportedProtocols> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SecPkgCredSupportedProtocols =
                    SecPkgCredSupportedProtocols(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgCredSupportedProtocols) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.grbitProtocol)
                }
            }
    }
}

public class SecPkgCredentialsCert internal constructor(
    public var encodedCertSize: UInt,
    encodedCertCtorArg: MutPtr<UByte>,
) {
    public var encodedCert: MutPtr<UByte> = encodedCertCtorArg
        internal set

    public constructor() : this(
        encodedCertSize = 0u,
        encodedCertCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.encodedCertSize

    public operator fun component2(): MutPtr<UByte> = this.encodedCert

    public fun copy(encodedCertSize: UInt = this.encodedCertSize, encodedCert: MutPtr<UByte> = this.encodedCert): SecPkgCredentialsCert = SecPkgCredentialsCert(encodedCertSize = encodedCertSize, encodedCertCtorArg = encodedCert)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCredentialsCert) return false
        if (this.encodedCertSize != other.encodedCertSize) return false
        if (this.encodedCert != other.encodedCert) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.encodedCertSize.hashCode()
        result = 31 * result + this.encodedCert.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredentialsCert> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredentialsCert> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgCredentialsCert =
                    SecPkgCredentialsCert(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgCredentialsCert) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encodedCertSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.encodedCert)
                }
            }

        public operator fun invoke(
            encodedCertSize: UInt = 0u,
            encodedCert: MutPtr<UByte> = MutPtr(0L),
        ): SecPkgCredentialsCert =
            SecPkgCredentialsCert(
                encodedCertSize = encodedCertSize,
                encodedCertCtorArg = encodedCert,
            )
    }
}

public data class SecPkgCredentialsKdcProxySettingsW(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var proxyServerOffset: UShort = 0u,
    public var proxyServerLength: UShort = 0u,
    public var clientTlsCredOffset: UShort = 0u,
    public var clientTlsCredLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredentialsKdcProxySettingsW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredentialsKdcProxySettingsW> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgCredentialsKdcProxySettingsW =
                    SecPkgCredentialsKdcProxySettingsW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: SecPkgCredentialsKdcProxySettingsW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.proxyServerOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.proxyServerLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.clientTlsCredOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.clientTlsCredLength)
                }
            }
    }
}

public class SecPkgCredentialsNamesA internal constructor(
    sUserNameCtorArg: MutPtr<Byte>,
) {
    public var sUserName: MutPtr<Byte> = sUserNameCtorArg
        internal set

    public constructor() : this(
        sUserNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.sUserName

    public fun copy(sUserName: MutPtr<Byte> = this.sUserName): SecPkgCredentialsNamesA = SecPkgCredentialsNamesA(sUserNameCtorArg = sUserName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCredentialsNamesA) return false
        if (this.sUserName != other.sUserName) return false
        return true
    }

    override fun hashCode(): Int = this.sUserName.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredentialsNamesA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredentialsNamesA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgCredentialsNamesA =
                    SecPkgCredentialsNamesA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgCredentialsNamesA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.sUserName)
                }
            }

        public operator fun invoke(
            sUserName: MutPtr<Byte> = MutPtr(0L),
        ): SecPkgCredentialsNamesA =
            SecPkgCredentialsNamesA(
                sUserNameCtorArg = sUserName,
            )
    }
}

public class SecPkgCredentialsNamesW internal constructor(
    sUserNameCtorArg: MutPtr<UShort>,
) {
    public var sUserName: MutPtr<UShort> = sUserNameCtorArg
        internal set

    public constructor() : this(
        sUserNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UShort> = this.sUserName

    public fun copy(sUserName: MutPtr<UShort> = this.sUserName): SecPkgCredentialsNamesW = SecPkgCredentialsNamesW(sUserNameCtorArg = sUserName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCredentialsNamesW) return false
        if (this.sUserName != other.sUserName) return false
        return true
    }

    override fun hashCode(): Int = this.sUserName.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredentialsNamesW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgCredentialsNamesW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecPkgCredentialsNamesW =
                    SecPkgCredentialsNamesW(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecPkgCredentialsNamesW) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.sUserName)
                }
            }

        public operator fun invoke(
            sUserName: MutPtr<UShort> = MutPtr(0L),
        ): SecPkgCredentialsNamesW =
            SecPkgCredentialsNamesW(
                sUserNameCtorArg = sUserName,
            )
    }
}

public class SecPkgCredentialsSsiproviderA internal constructor(
    sProviderNameCtorArg: MutPtr<Byte>,
    public var providerInfoLength: UInt,
    providerInfoCtorArg: Pstr,
) {
    public var sProviderName: MutPtr<Byte> = sProviderNameCtorArg
        internal set

    public var providerInfo: Pstr = providerInfoCtorArg
        internal set

    public constructor() : this(
        sProviderNameCtorArg = MutPtr(0L),
        providerInfoLength = 0u,
        providerInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.sProviderName

    public operator fun component2(): UInt = this.providerInfoLength

    public operator fun component3(): Pstr = this.providerInfo

    public fun copy(sProviderName: MutPtr<Byte> = this.sProviderName, providerInfoLength: UInt = this.providerInfoLength, providerInfo: Pstr = this.providerInfo): SecPkgCredentialsSsiproviderA = SecPkgCredentialsSsiproviderA(sProviderNameCtorArg = sProviderName, providerInfoLength = providerInfoLength, providerInfoCtorArg = providerInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCredentialsSsiproviderA) return false
        if (this.sProviderName != other.sProviderName) return false
        if (this.providerInfoLength != other.providerInfoLength) return false
        if (this.providerInfo != other.providerInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sProviderName.hashCode()
        result = 31 * result + this.providerInfoLength.hashCode()
        result = 31 * result + this.providerInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sProviderName: MutPtr<Byte> = MutPtr(0L),
            providerInfoLength: UInt = 0u,
            providerInfo: Pstr = MutPtr(0L),
        ): SecPkgCredentialsSsiproviderA =
            SecPkgCredentialsSsiproviderA(
                sProviderNameCtorArg = sProviderName,
                providerInfoLength = providerInfoLength,
                providerInfoCtorArg = providerInfo,
            )
    }
}

public class SecPkgCredentialsSsiproviderW internal constructor(
    sProviderNameCtorArg: MutPtr<UShort>,
    public var providerInfoLength: UInt,
    providerInfoCtorArg: Pstr,
) {
    public var sProviderName: MutPtr<UShort> = sProviderNameCtorArg
        internal set

    public var providerInfo: Pstr = providerInfoCtorArg
        internal set

    public constructor() : this(
        sProviderNameCtorArg = MutPtr(0L),
        providerInfoLength = 0u,
        providerInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UShort> = this.sProviderName

    public operator fun component2(): UInt = this.providerInfoLength

    public operator fun component3(): Pstr = this.providerInfo

    public fun copy(sProviderName: MutPtr<UShort> = this.sProviderName, providerInfoLength: UInt = this.providerInfoLength, providerInfo: Pstr = this.providerInfo): SecPkgCredentialsSsiproviderW = SecPkgCredentialsSsiproviderW(sProviderNameCtorArg = sProviderName, providerInfoLength = providerInfoLength, providerInfoCtorArg = providerInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCredentialsSsiproviderW) return false
        if (this.sProviderName != other.sProviderName) return false
        if (this.providerInfoLength != other.providerInfoLength) return false
        if (this.providerInfo != other.providerInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sProviderName.hashCode()
        result = 31 * result + this.providerInfoLength.hashCode()
        result = 31 * result + this.providerInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sProviderName: MutPtr<UShort> = MutPtr(0L),
            providerInfoLength: UInt = 0u,
            providerInfo: Pstr = MutPtr(0L),
        ): SecPkgCredentialsSsiproviderW =
            SecPkgCredentialsSsiproviderW(
                sProviderNameCtorArg = sProviderName,
                providerInfoLength = providerInfoLength,
                providerInfoCtorArg = providerInfo,
            )
    }
}

public class SecPkgInfoA internal constructor(
    public var fCapabilities: UInt,
    public var wVersion: UShort,
    public var wRPCID: UShort,
    public var cbMaxToken: UInt,
    nameCtorArg: MutPtr<Byte>,
    commentCtorArg: MutPtr<Byte>,
) {
    public var name: MutPtr<Byte> = nameCtorArg
        internal set

    public var comment: MutPtr<Byte> = commentCtorArg
        internal set

    public constructor() : this(
        fCapabilities = 0u,
        wVersion = 0u,
        wRPCID = 0u,
        cbMaxToken = 0u,
        nameCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.fCapabilities

    public operator fun component2(): UShort = this.wVersion

    public operator fun component3(): UShort = this.wRPCID

    public operator fun component4(): UInt = this.cbMaxToken

    public operator fun component5(): MutPtr<Byte> = this.name

    public operator fun component6(): MutPtr<Byte> = this.comment

    public fun copy(fCapabilities: UInt = this.fCapabilities, wVersion: UShort = this.wVersion, wRPCID: UShort = this.wRPCID, cbMaxToken: UInt = this.cbMaxToken, name: MutPtr<Byte> = this.name, comment: MutPtr<Byte> = this.comment): SecPkgInfoA = SecPkgInfoA(fCapabilities = fCapabilities, wVersion = wVersion, wRPCID = wRPCID, cbMaxToken = cbMaxToken, nameCtorArg = name, commentCtorArg = comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgInfoA) return false
        if (this.fCapabilities != other.fCapabilities) return false
        if (this.wVersion != other.wVersion) return false
        if (this.wRPCID != other.wRPCID) return false
        if (this.cbMaxToken != other.cbMaxToken) return false
        if (this.name != other.name) return false
        if (this.comment != other.comment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fCapabilities.hashCode()
        result = 31 * result + this.wVersion.hashCode()
        result = 31 * result + this.wRPCID.hashCode()
        result = 31 * result + this.cbMaxToken.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.comment.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgInfoA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgInfoA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SecPkgInfoA =
                    SecPkgInfoA(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SecPkgInfoA) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wRPCID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbMaxToken)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 16L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 24L, value.comment)
                }
            }

        public operator fun invoke(
            fCapabilities: UInt = 0u,
            wVersion: UShort = 0u,
            wRPCID: UShort = 0u,
            cbMaxToken: UInt = 0u,
            name: MutPtr<Byte> = MutPtr(0L),
            comment: MutPtr<Byte> = MutPtr(0L),
        ): SecPkgInfoA =
            SecPkgInfoA(
                fCapabilities = fCapabilities,
                wVersion = wVersion,
                wRPCID = wRPCID,
                cbMaxToken = cbMaxToken,
                nameCtorArg = name,
                commentCtorArg = comment,
            )
    }
}

public class SecPkgInfoW internal constructor(
    public var fCapabilities: UInt,
    public var wVersion: UShort,
    public var wRPCID: UShort,
    public var cbMaxToken: UInt,
    nameCtorArg: MutPtr<UShort>,
    commentCtorArg: MutPtr<UShort>,
) {
    public var name: MutPtr<UShort> = nameCtorArg
        internal set

    public var comment: MutPtr<UShort> = commentCtorArg
        internal set

    public constructor() : this(
        fCapabilities = 0u,
        wVersion = 0u,
        wRPCID = 0u,
        cbMaxToken = 0u,
        nameCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.fCapabilities

    public operator fun component2(): UShort = this.wVersion

    public operator fun component3(): UShort = this.wRPCID

    public operator fun component4(): UInt = this.cbMaxToken

    public operator fun component5(): MutPtr<UShort> = this.name

    public operator fun component6(): MutPtr<UShort> = this.comment

    public fun copy(fCapabilities: UInt = this.fCapabilities, wVersion: UShort = this.wVersion, wRPCID: UShort = this.wRPCID, cbMaxToken: UInt = this.cbMaxToken, name: MutPtr<UShort> = this.name, comment: MutPtr<UShort> = this.comment): SecPkgInfoW = SecPkgInfoW(fCapabilities = fCapabilities, wVersion = wVersion, wRPCID = wRPCID, cbMaxToken = cbMaxToken, nameCtorArg = name, commentCtorArg = comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgInfoW) return false
        if (this.fCapabilities != other.fCapabilities) return false
        if (this.wVersion != other.wVersion) return false
        if (this.wRPCID != other.wRPCID) return false
        if (this.cbMaxToken != other.cbMaxToken) return false
        if (this.name != other.name) return false
        if (this.comment != other.comment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fCapabilities.hashCode()
        result = 31 * result + this.wVersion.hashCode()
        result = 31 * result + this.wRPCID.hashCode()
        result = 31 * result + this.cbMaxToken.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.comment.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgInfoW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgInfoW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SecPkgInfoW =
                    SecPkgInfoW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SecPkgInfoW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wRPCID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbMaxToken)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 16L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 24L, value.comment)
                }
            }

        public operator fun invoke(
            fCapabilities: UInt = 0u,
            wVersion: UShort = 0u,
            wRPCID: UShort = 0u,
            cbMaxToken: UInt = 0u,
            name: MutPtr<UShort> = MutPtr(0L),
            comment: MutPtr<UShort> = MutPtr(0L),
        ): SecPkgInfoW =
            SecPkgInfoW(
                fCapabilities = fCapabilities,
                wVersion = wVersion,
                wRPCID = wRPCID,
                cbMaxToken = cbMaxToken,
                nameCtorArg = name,
                commentCtorArg = comment,
            )
    }
}

public class SecurityFunctionTableA internal constructor(
    public var dwVersion: UInt,
    public var enumerateSecurityPackagesA: EnumerateSecurityPackagesFnA,
    public var queryCredentialsAttributesA: QueryCredentialsAttributesFnA,
    public var acquireCredentialsHandleA: AcquireCredentialsHandleFnA,
    public var freeCredentialsHandle: FreeCredentialsHandleFn,
    reserved2CtorArg: MutPtr<CVoid>,
    public var initializeSecurityContextA: InitializeSecurityContextFnA,
    public var acceptSecurityContext: AcceptSecurityContextFn,
    public var completeAuthToken: CompleteAuthTokenFn,
    public var deleteSecurityContext: DeleteSecurityContextFn,
    public var applyControlToken: ApplyControlTokenFn,
    public var queryContextAttributesA: QueryContextAttributesFnA,
    public var impersonateSecurityContext: ImpersonateSecurityContextFn,
    public var revertSecurityContext: RevertSecurityContextFn,
    public var makeSignature: MakeSignatureFn,
    public var verifySignature: VerifySignatureFn,
    public var freeContextBuffer: FreeContextBufferFn,
    public var querySecurityPackageInfoA: QuerySecurityPackageInfoFnA,
    reserved3CtorArg: MutPtr<CVoid>,
    reserved4CtorArg: MutPtr<CVoid>,
    public var exportSecurityContext: ExportSecurityContextFn,
    public var importSecurityContextA: ImportSecurityContextFnA,
    public var addCredentialsA: AddCredentialsFnA,
    reserved8CtorArg: MutPtr<CVoid>,
    public var querySecurityContextToken: QuerySecurityContextTokenFn,
    public var encryptMessage: EncryptMessageFn,
    public var decryptMessage: DecryptMessageFn,
    public var setContextAttributesA: SetContextAttributesFnA,
    public var setCredentialsAttributesA: SetCredentialsAttributesFnA,
    public var changeAccountPasswordA: ChangePasswordFnA,
    public var queryContextAttributesExA: QueryContextAttributesExFnA,
    public var queryCredentialsAttributesExA: QueryCredentialsAttributesExFnA,
) {
    public var reserved2: MutPtr<CVoid> = reserved2CtorArg
        internal set

    public var reserved3: MutPtr<CVoid> = reserved3CtorArg
        internal set

    public var reserved4: MutPtr<CVoid> = reserved4CtorArg
        internal set

    public var reserved8: MutPtr<CVoid> = reserved8CtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        enumerateSecurityPackagesA = null,
        queryCredentialsAttributesA = null,
        acquireCredentialsHandleA = null,
        freeCredentialsHandle = null,
        reserved2CtorArg = MutPtr(0L),
        initializeSecurityContextA = null,
        acceptSecurityContext = null,
        completeAuthToken = null,
        deleteSecurityContext = null,
        applyControlToken = null,
        queryContextAttributesA = null,
        impersonateSecurityContext = null,
        revertSecurityContext = null,
        makeSignature = null,
        verifySignature = null,
        freeContextBuffer = null,
        querySecurityPackageInfoA = null,
        reserved3CtorArg = MutPtr(0L),
        reserved4CtorArg = MutPtr(0L),
        exportSecurityContext = null,
        importSecurityContextA = null,
        addCredentialsA = null,
        reserved8CtorArg = MutPtr(0L),
        querySecurityContextToken = null,
        encryptMessage = null,
        decryptMessage = null,
        setContextAttributesA = null,
        setCredentialsAttributesA = null,
        changeAccountPasswordA = null,
        queryContextAttributesExA = null,
        queryCredentialsAttributesExA = null,
    )

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            enumerateSecurityPackagesA: EnumerateSecurityPackagesFnA = null,
            queryCredentialsAttributesA: QueryCredentialsAttributesFnA = null,
            acquireCredentialsHandleA: AcquireCredentialsHandleFnA = null,
            freeCredentialsHandle: FreeCredentialsHandleFn = null,
            reserved2: MutPtr<CVoid> = MutPtr(0L),
            initializeSecurityContextA: InitializeSecurityContextFnA = null,
            acceptSecurityContext: AcceptSecurityContextFn = null,
            completeAuthToken: CompleteAuthTokenFn = null,
            deleteSecurityContext: DeleteSecurityContextFn = null,
            applyControlToken: ApplyControlTokenFn = null,
            queryContextAttributesA: QueryContextAttributesFnA = null,
            impersonateSecurityContext: ImpersonateSecurityContextFn = null,
            revertSecurityContext: RevertSecurityContextFn = null,
            makeSignature: MakeSignatureFn = null,
            verifySignature: VerifySignatureFn = null,
            freeContextBuffer: FreeContextBufferFn = null,
            querySecurityPackageInfoA: QuerySecurityPackageInfoFnA = null,
            reserved3: MutPtr<CVoid> = MutPtr(0L),
            reserved4: MutPtr<CVoid> = MutPtr(0L),
            exportSecurityContext: ExportSecurityContextFn = null,
            importSecurityContextA: ImportSecurityContextFnA = null,
            addCredentialsA: AddCredentialsFnA = null,
            reserved8: MutPtr<CVoid> = MutPtr(0L),
            querySecurityContextToken: QuerySecurityContextTokenFn = null,
            encryptMessage: EncryptMessageFn = null,
            decryptMessage: DecryptMessageFn = null,
            setContextAttributesA: SetContextAttributesFnA = null,
            setCredentialsAttributesA: SetCredentialsAttributesFnA = null,
            changeAccountPasswordA: ChangePasswordFnA = null,
            queryContextAttributesExA: QueryContextAttributesExFnA = null,
            queryCredentialsAttributesExA: QueryCredentialsAttributesExFnA = null,
        ): SecurityFunctionTableA =
            SecurityFunctionTableA(
                dwVersion = dwVersion,
                enumerateSecurityPackagesA = enumerateSecurityPackagesA,
                queryCredentialsAttributesA = queryCredentialsAttributesA,
                acquireCredentialsHandleA = acquireCredentialsHandleA,
                freeCredentialsHandle = freeCredentialsHandle,
                reserved2CtorArg = reserved2,
                initializeSecurityContextA = initializeSecurityContextA,
                acceptSecurityContext = acceptSecurityContext,
                completeAuthToken = completeAuthToken,
                deleteSecurityContext = deleteSecurityContext,
                applyControlToken = applyControlToken,
                queryContextAttributesA = queryContextAttributesA,
                impersonateSecurityContext = impersonateSecurityContext,
                revertSecurityContext = revertSecurityContext,
                makeSignature = makeSignature,
                verifySignature = verifySignature,
                freeContextBuffer = freeContextBuffer,
                querySecurityPackageInfoA = querySecurityPackageInfoA,
                reserved3CtorArg = reserved3,
                reserved4CtorArg = reserved4,
                exportSecurityContext = exportSecurityContext,
                importSecurityContextA = importSecurityContextA,
                addCredentialsA = addCredentialsA,
                reserved8CtorArg = reserved8,
                querySecurityContextToken = querySecurityContextToken,
                encryptMessage = encryptMessage,
                decryptMessage = decryptMessage,
                setContextAttributesA = setContextAttributesA,
                setCredentialsAttributesA = setCredentialsAttributesA,
                changeAccountPasswordA = changeAccountPasswordA,
                queryContextAttributesExA = queryContextAttributesExA,
                queryCredentialsAttributesExA = queryCredentialsAttributesExA,
            )
    }
}

public class SecurityFunctionTableW internal constructor(
    public var dwVersion: UInt,
    public var enumerateSecurityPackagesW: EnumerateSecurityPackagesFnW,
    public var queryCredentialsAttributesW: QueryCredentialsAttributesFnW,
    public var acquireCredentialsHandleW: AcquireCredentialsHandleFnW,
    public var freeCredentialsHandle: FreeCredentialsHandleFn,
    reserved2CtorArg: MutPtr<CVoid>,
    public var initializeSecurityContextW: InitializeSecurityContextFnW,
    public var acceptSecurityContext: AcceptSecurityContextFn,
    public var completeAuthToken: CompleteAuthTokenFn,
    public var deleteSecurityContext: DeleteSecurityContextFn,
    public var applyControlToken: ApplyControlTokenFn,
    public var queryContextAttributesW: QueryContextAttributesFnW,
    public var impersonateSecurityContext: ImpersonateSecurityContextFn,
    public var revertSecurityContext: RevertSecurityContextFn,
    public var makeSignature: MakeSignatureFn,
    public var verifySignature: VerifySignatureFn,
    public var freeContextBuffer: FreeContextBufferFn,
    public var querySecurityPackageInfoW: QuerySecurityPackageInfoFnW,
    reserved3CtorArg: MutPtr<CVoid>,
    reserved4CtorArg: MutPtr<CVoid>,
    public var exportSecurityContext: ExportSecurityContextFn,
    public var importSecurityContextW: ImportSecurityContextFnW,
    public var addCredentialsW: AddCredentialsFnW,
    reserved8CtorArg: MutPtr<CVoid>,
    public var querySecurityContextToken: QuerySecurityContextTokenFn,
    public var encryptMessage: EncryptMessageFn,
    public var decryptMessage: DecryptMessageFn,
    public var setContextAttributesW: SetContextAttributesFnW,
    public var setCredentialsAttributesW: SetCredentialsAttributesFnW,
    public var changeAccountPasswordW: ChangePasswordFnW,
    public var queryContextAttributesExW: QueryContextAttributesExFnW,
    public var queryCredentialsAttributesExW: QueryCredentialsAttributesExFnW,
) {
    public var reserved2: MutPtr<CVoid> = reserved2CtorArg
        internal set

    public var reserved3: MutPtr<CVoid> = reserved3CtorArg
        internal set

    public var reserved4: MutPtr<CVoid> = reserved4CtorArg
        internal set

    public var reserved8: MutPtr<CVoid> = reserved8CtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        enumerateSecurityPackagesW = null,
        queryCredentialsAttributesW = null,
        acquireCredentialsHandleW = null,
        freeCredentialsHandle = null,
        reserved2CtorArg = MutPtr(0L),
        initializeSecurityContextW = null,
        acceptSecurityContext = null,
        completeAuthToken = null,
        deleteSecurityContext = null,
        applyControlToken = null,
        queryContextAttributesW = null,
        impersonateSecurityContext = null,
        revertSecurityContext = null,
        makeSignature = null,
        verifySignature = null,
        freeContextBuffer = null,
        querySecurityPackageInfoW = null,
        reserved3CtorArg = MutPtr(0L),
        reserved4CtorArg = MutPtr(0L),
        exportSecurityContext = null,
        importSecurityContextW = null,
        addCredentialsW = null,
        reserved8CtorArg = MutPtr(0L),
        querySecurityContextToken = null,
        encryptMessage = null,
        decryptMessage = null,
        setContextAttributesW = null,
        setCredentialsAttributesW = null,
        changeAccountPasswordW = null,
        queryContextAttributesExW = null,
        queryCredentialsAttributesExW = null,
    )

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            enumerateSecurityPackagesW: EnumerateSecurityPackagesFnW = null,
            queryCredentialsAttributesW: QueryCredentialsAttributesFnW = null,
            acquireCredentialsHandleW: AcquireCredentialsHandleFnW = null,
            freeCredentialsHandle: FreeCredentialsHandleFn = null,
            reserved2: MutPtr<CVoid> = MutPtr(0L),
            initializeSecurityContextW: InitializeSecurityContextFnW = null,
            acceptSecurityContext: AcceptSecurityContextFn = null,
            completeAuthToken: CompleteAuthTokenFn = null,
            deleteSecurityContext: DeleteSecurityContextFn = null,
            applyControlToken: ApplyControlTokenFn = null,
            queryContextAttributesW: QueryContextAttributesFnW = null,
            impersonateSecurityContext: ImpersonateSecurityContextFn = null,
            revertSecurityContext: RevertSecurityContextFn = null,
            makeSignature: MakeSignatureFn = null,
            verifySignature: VerifySignatureFn = null,
            freeContextBuffer: FreeContextBufferFn = null,
            querySecurityPackageInfoW: QuerySecurityPackageInfoFnW = null,
            reserved3: MutPtr<CVoid> = MutPtr(0L),
            reserved4: MutPtr<CVoid> = MutPtr(0L),
            exportSecurityContext: ExportSecurityContextFn = null,
            importSecurityContextW: ImportSecurityContextFnW = null,
            addCredentialsW: AddCredentialsFnW = null,
            reserved8: MutPtr<CVoid> = MutPtr(0L),
            querySecurityContextToken: QuerySecurityContextTokenFn = null,
            encryptMessage: EncryptMessageFn = null,
            decryptMessage: DecryptMessageFn = null,
            setContextAttributesW: SetContextAttributesFnW = null,
            setCredentialsAttributesW: SetCredentialsAttributesFnW = null,
            changeAccountPasswordW: ChangePasswordFnW = null,
            queryContextAttributesExW: QueryContextAttributesExFnW = null,
            queryCredentialsAttributesExW: QueryCredentialsAttributesExFnW = null,
        ): SecurityFunctionTableW =
            SecurityFunctionTableW(
                dwVersion = dwVersion,
                enumerateSecurityPackagesW = enumerateSecurityPackagesW,
                queryCredentialsAttributesW = queryCredentialsAttributesW,
                acquireCredentialsHandleW = acquireCredentialsHandleW,
                freeCredentialsHandle = freeCredentialsHandle,
                reserved2CtorArg = reserved2,
                initializeSecurityContextW = initializeSecurityContextW,
                acceptSecurityContext = acceptSecurityContext,
                completeAuthToken = completeAuthToken,
                deleteSecurityContext = deleteSecurityContext,
                applyControlToken = applyControlToken,
                queryContextAttributesW = queryContextAttributesW,
                impersonateSecurityContext = impersonateSecurityContext,
                revertSecurityContext = revertSecurityContext,
                makeSignature = makeSignature,
                verifySignature = verifySignature,
                freeContextBuffer = freeContextBuffer,
                querySecurityPackageInfoW = querySecurityPackageInfoW,
                reserved3CtorArg = reserved3,
                reserved4CtorArg = reserved4,
                exportSecurityContext = exportSecurityContext,
                importSecurityContextW = importSecurityContextW,
                addCredentialsW = addCredentialsW,
                reserved8CtorArg = reserved8,
                querySecurityContextToken = querySecurityContextToken,
                encryptMessage = encryptMessage,
                decryptMessage = decryptMessage,
                setContextAttributesW = setContextAttributesW,
                setCredentialsAttributesW = setCredentialsAttributesW,
                changeAccountPasswordW = changeAccountPasswordW,
                queryContextAttributesExW = queryContextAttributesExW,
                queryCredentialsAttributesExW = queryCredentialsAttributesExW,
            )
    }
}

public data class TlsExtensionSubscription(
    public var extensionType: UShort = 0u,
    public var handshakeType: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TlsExtensionSubscription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TlsExtensionSubscription> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TlsExtensionSubscription =
                    TlsExtensionSubscription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: TlsExtensionSubscription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.extensionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.handshakeType)
                }
            }
    }
}

public class TlsParameters internal constructor(
    public var cAlpnIds: UInt,
    rgstrAlpnIdsCtorArg: MutPtr<LsaUnicodeString>,
    public var grbitDisabledProtocols: UInt,
    public var cDisabledCrypto: UInt,
    pDisabledCryptoCtorArg: MutPtr<CryptoSettings>,
    public var dwFlags: UInt,
) {
    public var rgstrAlpnIds: MutPtr<LsaUnicodeString> = rgstrAlpnIdsCtorArg
        internal set

    public var pDisabledCrypto: MutPtr<CryptoSettings> = pDisabledCryptoCtorArg
        internal set

    public constructor() : this(
        cAlpnIds = 0u,
        rgstrAlpnIdsCtorArg = MutPtr(0L),
        grbitDisabledProtocols = 0u,
        cDisabledCrypto = 0u,
        pDisabledCryptoCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): UInt = this.cAlpnIds

    public operator fun component2(): MutPtr<LsaUnicodeString> = this.rgstrAlpnIds

    public operator fun component3(): UInt = this.grbitDisabledProtocols

    public operator fun component4(): UInt = this.cDisabledCrypto

    public operator fun component5(): MutPtr<CryptoSettings> = this.pDisabledCrypto

    public operator fun component6(): UInt = this.dwFlags

    public fun copy(cAlpnIds: UInt = this.cAlpnIds, rgstrAlpnIds: MutPtr<LsaUnicodeString> = this.rgstrAlpnIds, grbitDisabledProtocols: UInt = this.grbitDisabledProtocols, cDisabledCrypto: UInt = this.cDisabledCrypto, pDisabledCrypto: MutPtr<CryptoSettings> = this.pDisabledCrypto, dwFlags: UInt = this.dwFlags): TlsParameters = TlsParameters(cAlpnIds = cAlpnIds, rgstrAlpnIdsCtorArg = rgstrAlpnIds, grbitDisabledProtocols = grbitDisabledProtocols, cDisabledCrypto = cDisabledCrypto, pDisabledCryptoCtorArg = pDisabledCrypto, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TlsParameters) return false
        if (this.cAlpnIds != other.cAlpnIds) return false
        if (this.rgstrAlpnIds != other.rgstrAlpnIds) return false
        if (this.grbitDisabledProtocols != other.grbitDisabledProtocols) return false
        if (this.cDisabledCrypto != other.cDisabledCrypto) return false
        if (this.pDisabledCrypto != other.pDisabledCrypto) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cAlpnIds.hashCode()
        result = 31 * result + this.rgstrAlpnIds.hashCode()
        result = 31 * result + this.grbitDisabledProtocols.hashCode()
        result = 31 * result + this.cDisabledCrypto.hashCode()
        result = 31 * result + this.pDisabledCrypto.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TlsParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TlsParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): TlsParameters =
                    TlsParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LsaUnicodeString>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CryptoSettings>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: TlsParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cAlpnIds)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LsaUnicodeString>(64)
                    ).writeNative(addr + 8L, value.rgstrAlpnIds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.grbitDisabledProtocols)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cDisabledCrypto)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CryptoSettings>(64)
                    ).writeNative(addr + 24L, value.pDisabledCrypto)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwFlags)
                }
            }

        public operator fun invoke(
            cAlpnIds: UInt = 0u,
            rgstrAlpnIds: MutPtr<LsaUnicodeString> = MutPtr(0L),
            grbitDisabledProtocols: UInt = 0u,
            cDisabledCrypto: UInt = 0u,
            pDisabledCrypto: MutPtr<CryptoSettings> = MutPtr(0L),
            dwFlags: UInt = 0u,
        ): TlsParameters =
            TlsParameters(
                cAlpnIds = cAlpnIds,
                rgstrAlpnIdsCtorArg = rgstrAlpnIds,
                grbitDisabledProtocols = grbitDisabledProtocols,
                cDisabledCrypto = cDisabledCrypto,
                pDisabledCryptoCtorArg = pDisabledCrypto,
                dwFlags = dwFlags,
            )
    }
}

public data class TokenbindingIdentifier(
    public var keyType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenbindingIdentifier> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenbindingIdentifier> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): TokenbindingIdentifier =
                    TokenbindingIdentifier(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TokenbindingIdentifier) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.keyType)
                }
            }
    }
}

public class TokenbindingKeyTypes internal constructor(
    public var keyCount: UInt,
    keyTypeCtorArg: MutPtr<TokenbindingKeyParametersType>,
) {
    public var keyType: MutPtr<TokenbindingKeyParametersType> = keyTypeCtorArg
        internal set

    public constructor() : this(
        keyCount = 0u,
        keyTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.keyCount

    public operator fun component2(): MutPtr<TokenbindingKeyParametersType> = this.keyType

    public fun copy(keyCount: UInt = this.keyCount, keyType: MutPtr<TokenbindingKeyParametersType> = this.keyType): TokenbindingKeyTypes = TokenbindingKeyTypes(keyCount = keyCount, keyTypeCtorArg = keyType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenbindingKeyTypes) return false
        if (this.keyCount != other.keyCount) return false
        if (this.keyType != other.keyType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyCount.hashCode()
        result = 31 * result + this.keyType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenbindingKeyTypes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenbindingKeyTypes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TokenbindingKeyTypes =
                    TokenbindingKeyTypes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<TokenbindingKeyParametersType>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TokenbindingKeyTypes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.keyCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<TokenbindingKeyParametersType>(64)
                    ).writeNative(addr + 8L, value.keyType)
                }
            }

        public operator fun invoke(
            keyCount: UInt = 0u,
            keyType: MutPtr<TokenbindingKeyParametersType> = MutPtr(0L),
        ): TokenbindingKeyTypes =
            TokenbindingKeyTypes(
                keyCount = keyCount,
                keyTypeCtorArg = keyType,
            )
    }
}

public class TokenbindingResultData internal constructor(
    public var bindingType: TokenbindingType,
    public var identifierSize: UInt,
    identifierDataCtorArg: MutPtr<TokenbindingIdentifier>,
    public var extensionFormat: TokenbindingExtensionFormat,
    public var extensionSize: UInt,
    extensionDataCtorArg: MutPtr<CVoid>,
) {
    public var identifierData: MutPtr<TokenbindingIdentifier> = identifierDataCtorArg
        internal set

    public var extensionData: MutPtr<CVoid> = extensionDataCtorArg
        internal set

    public constructor() : this(
        bindingType = 0,
        identifierSize = 0u,
        identifierDataCtorArg = MutPtr(0L),
        extensionFormat = 0,
        extensionSize = 0u,
        extensionDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): TokenbindingType = this.bindingType

    public operator fun component2(): UInt = this.identifierSize

    public operator fun component3(): MutPtr<TokenbindingIdentifier> = this.identifierData

    public operator fun component4(): TokenbindingExtensionFormat = this.extensionFormat

    public operator fun component5(): UInt = this.extensionSize

    public operator fun component6(): MutPtr<CVoid> = this.extensionData

    public fun copy(bindingType: TokenbindingType = this.bindingType, identifierSize: UInt = this.identifierSize, identifierData: MutPtr<TokenbindingIdentifier> = this.identifierData, extensionFormat: TokenbindingExtensionFormat = this.extensionFormat, extensionSize: UInt = this.extensionSize, extensionData: MutPtr<CVoid> = this.extensionData): TokenbindingResultData = TokenbindingResultData(bindingType = bindingType, identifierSize = identifierSize, identifierDataCtorArg = identifierData, extensionFormat = extensionFormat, extensionSize = extensionSize, extensionDataCtorArg = extensionData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenbindingResultData) return false
        if (this.bindingType != other.bindingType) return false
        if (this.identifierSize != other.identifierSize) return false
        if (this.identifierData != other.identifierData) return false
        if (this.extensionFormat != other.extensionFormat) return false
        if (this.extensionSize != other.extensionSize) return false
        if (this.extensionData != other.extensionData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bindingType.hashCode()
        result = 31 * result + this.identifierSize.hashCode()
        result = 31 * result + this.identifierData.hashCode()
        result = 31 * result + this.extensionFormat.hashCode()
        result = 31 * result + this.extensionSize.hashCode()
        result = 31 * result + this.extensionData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenbindingResultData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenbindingResultData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): TokenbindingResultData =
                    TokenbindingResultData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<TokenbindingIdentifier>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TokenbindingResultData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bindingType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.identifierSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<TokenbindingIdentifier>(64)
                    ).writeNative(addr + 8L, value.identifierData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.extensionFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.extensionSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.extensionData)
                }
            }

        public operator fun invoke(
            bindingType: TokenbindingType = 0,
            identifierSize: UInt = 0u,
            identifierData: MutPtr<TokenbindingIdentifier> = MutPtr(0L),
            extensionFormat: TokenbindingExtensionFormat = 0,
            extensionSize: UInt = 0u,
            extensionData: MutPtr<CVoid> = MutPtr(0L),
        ): TokenbindingResultData =
            TokenbindingResultData(
                bindingType = bindingType,
                identifierSize = identifierSize,
                identifierDataCtorArg = identifierData,
                extensionFormat = extensionFormat,
                extensionSize = extensionSize,
                extensionDataCtorArg = extensionData,
            )
    }
}

public class TokenbindingResultList internal constructor(
    public var resultCount: UInt,
    resultDataCtorArg: MutPtr<TokenbindingResultData>,
) {
    public var resultData: MutPtr<TokenbindingResultData> = resultDataCtorArg
        internal set

    public constructor() : this(
        resultCount = 0u,
        resultDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.resultCount

    public operator fun component2(): MutPtr<TokenbindingResultData> = this.resultData

    public fun copy(resultCount: UInt = this.resultCount, resultData: MutPtr<TokenbindingResultData> = this.resultData): TokenbindingResultList = TokenbindingResultList(resultCount = resultCount, resultDataCtorArg = resultData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenbindingResultList) return false
        if (this.resultCount != other.resultCount) return false
        if (this.resultData != other.resultData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resultCount.hashCode()
        result = 31 * result + this.resultData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenbindingResultList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TokenbindingResultList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TokenbindingResultList =
                    TokenbindingResultList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<TokenbindingResultData>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TokenbindingResultList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.resultCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<TokenbindingResultData>(64)
                    ).writeNative(addr + 8L, value.resultData)
                }
            }

        public operator fun invoke(
            resultCount: UInt = 0u,
            resultData: MutPtr<TokenbindingResultData> = MutPtr(0L),
        ): TokenbindingResultList =
            TokenbindingResultList(
                resultCount = resultCount,
                resultDataCtorArg = resultData,
            )
    }
}

public class TrustedControllersInfo internal constructor(
    public var entries: UInt,
    namesCtorArg: MutPtr<LsaUnicodeString>,
) {
    public var names: MutPtr<LsaUnicodeString> = namesCtorArg
        internal set

    public constructor() : this(
        entries = 0u,
        namesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.entries

    public operator fun component2(): MutPtr<LsaUnicodeString> = this.names

    public fun copy(entries: UInt = this.entries, names: MutPtr<LsaUnicodeString> = this.names): TrustedControllersInfo = TrustedControllersInfo(entries = entries, namesCtorArg = names)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TrustedControllersInfo) return false
        if (this.entries != other.entries) return false
        if (this.names != other.names) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entries.hashCode()
        result = 31 * result + this.names.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TrustedControllersInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TrustedControllersInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TrustedControllersInfo =
                    TrustedControllersInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LsaUnicodeString>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TrustedControllersInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.entries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LsaUnicodeString>(64)
                    ).writeNative(addr + 8L, value.names)
                }
            }

        public operator fun invoke(
            entries: UInt = 0u,
            names: MutPtr<LsaUnicodeString> = MutPtr(0L),
        ): TrustedControllersInfo =
            TrustedControllersInfo(
                entries = entries,
                namesCtorArg = names,
            )
    }
}

public class TrustedDomainAuthInformation internal constructor(
    public var incomingAuthInfos: UInt,
    incomingAuthenticationInformationCtorArg: MutPtr<LsaAuthInformation>,
    incomingPreviousAuthenticationInformationCtorArg: MutPtr<LsaAuthInformation>,
    public var outgoingAuthInfos: UInt,
    outgoingAuthenticationInformationCtorArg: MutPtr<LsaAuthInformation>,
    outgoingPreviousAuthenticationInformationCtorArg: MutPtr<LsaAuthInformation>,
) {
    public var incomingAuthenticationInformation: MutPtr<LsaAuthInformation> = incomingAuthenticationInformationCtorArg
        internal set

    public var incomingPreviousAuthenticationInformation: MutPtr<LsaAuthInformation> = incomingPreviousAuthenticationInformationCtorArg
        internal set

    public var outgoingAuthenticationInformation: MutPtr<LsaAuthInformation> = outgoingAuthenticationInformationCtorArg
        internal set

    public var outgoingPreviousAuthenticationInformation: MutPtr<LsaAuthInformation> = outgoingPreviousAuthenticationInformationCtorArg
        internal set

    public constructor() : this(
        incomingAuthInfos = 0u,
        incomingAuthenticationInformationCtorArg = MutPtr(0L),
        incomingPreviousAuthenticationInformationCtorArg = MutPtr(0L),
        outgoingAuthInfos = 0u,
        outgoingAuthenticationInformationCtorArg = MutPtr(0L),
        outgoingPreviousAuthenticationInformationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.incomingAuthInfos

    public operator fun component2(): MutPtr<LsaAuthInformation> = this.incomingAuthenticationInformation

    public operator fun component3(): MutPtr<LsaAuthInformation> = this.incomingPreviousAuthenticationInformation

    public operator fun component4(): UInt = this.outgoingAuthInfos

    public operator fun component5(): MutPtr<LsaAuthInformation> = this.outgoingAuthenticationInformation

    public operator fun component6(): MutPtr<LsaAuthInformation> = this.outgoingPreviousAuthenticationInformation

    public fun copy(incomingAuthInfos: UInt = this.incomingAuthInfos, incomingAuthenticationInformation: MutPtr<LsaAuthInformation> = this.incomingAuthenticationInformation, incomingPreviousAuthenticationInformation: MutPtr<LsaAuthInformation> = this.incomingPreviousAuthenticationInformation, outgoingAuthInfos: UInt = this.outgoingAuthInfos, outgoingAuthenticationInformation: MutPtr<LsaAuthInformation> = this.outgoingAuthenticationInformation, outgoingPreviousAuthenticationInformation: MutPtr<LsaAuthInformation> = this.outgoingPreviousAuthenticationInformation): TrustedDomainAuthInformation = TrustedDomainAuthInformation(incomingAuthInfos = incomingAuthInfos, incomingAuthenticationInformationCtorArg = incomingAuthenticationInformation, incomingPreviousAuthenticationInformationCtorArg = incomingPreviousAuthenticationInformation, outgoingAuthInfos = outgoingAuthInfos, outgoingAuthenticationInformationCtorArg = outgoingAuthenticationInformation, outgoingPreviousAuthenticationInformationCtorArg = outgoingPreviousAuthenticationInformation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TrustedDomainAuthInformation) return false
        if (this.incomingAuthInfos != other.incomingAuthInfos) return false
        if (this.incomingAuthenticationInformation != other.incomingAuthenticationInformation) return false
        if (this.incomingPreviousAuthenticationInformation != other.incomingPreviousAuthenticationInformation) return false
        if (this.outgoingAuthInfos != other.outgoingAuthInfos) return false
        if (this.outgoingAuthenticationInformation != other.outgoingAuthenticationInformation) return false
        if (this.outgoingPreviousAuthenticationInformation != other.outgoingPreviousAuthenticationInformation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.incomingAuthInfos.hashCode()
        result = 31 * result + this.incomingAuthenticationInformation.hashCode()
        result = 31 * result + this.incomingPreviousAuthenticationInformation.hashCode()
        result = 31 * result + this.outgoingAuthInfos.hashCode()
        result = 31 * result + this.outgoingAuthenticationInformation.hashCode()
        result = 31 * result + this.outgoingPreviousAuthenticationInformation.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TrustedDomainAuthInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TrustedDomainAuthInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): TrustedDomainAuthInformation =
                    TrustedDomainAuthInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LsaAuthInformation>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LsaAuthInformation>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LsaAuthInformation>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LsaAuthInformation>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: TrustedDomainAuthInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.incomingAuthInfos)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LsaAuthInformation>(64)
                    ).writeNative(addr + 8L, value.incomingAuthenticationInformation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LsaAuthInformation>(64)
                    ).writeNative(addr + 16L, value.incomingPreviousAuthenticationInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.outgoingAuthInfos)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LsaAuthInformation>(64)
                    ).writeNative(addr + 32L, value.outgoingAuthenticationInformation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LsaAuthInformation>(64)
                    ).writeNative(addr + 40L, value.outgoingPreviousAuthenticationInformation)
                }
            }

        public operator fun invoke(
            incomingAuthInfos: UInt = 0u,
            incomingAuthenticationInformation: MutPtr<LsaAuthInformation> = MutPtr(0L),
            incomingPreviousAuthenticationInformation: MutPtr<LsaAuthInformation> = MutPtr(0L),
            outgoingAuthInfos: UInt = 0u,
            outgoingAuthenticationInformation: MutPtr<LsaAuthInformation> = MutPtr(0L),
            outgoingPreviousAuthenticationInformation: MutPtr<LsaAuthInformation> = MutPtr(0L),
        ): TrustedDomainAuthInformation =
            TrustedDomainAuthInformation(
                incomingAuthInfos = incomingAuthInfos,
                incomingAuthenticationInformationCtorArg = incomingAuthenticationInformation,
                incomingPreviousAuthenticationInformationCtorArg = incomingPreviousAuthenticationInformation,
                outgoingAuthInfos = outgoingAuthInfos,
                outgoingAuthenticationInformationCtorArg = outgoingAuthenticationInformation,
                outgoingPreviousAuthenticationInformationCtorArg = outgoingPreviousAuthenticationInformation,
            )
    }
}

public data class TrustedDomainFullInformation(
    public var information: TrustedDomainInformationEx = TrustedDomainInformationEx(),
    public var posixOffset: TrustedPosixOffsetInfo = TrustedPosixOffsetInfo(),
    public var authInformation: TrustedDomainAuthInformation = TrustedDomainAuthInformation(),
)

public data class TrustedDomainFullInformation2(
    public var information: TrustedDomainInformationEx2 = TrustedDomainInformationEx2(),
    public var posixOffset: TrustedPosixOffsetInfo = TrustedPosixOffsetInfo(),
    public var authInformation: TrustedDomainAuthInformation = TrustedDomainAuthInformation(),
)

public class TrustedDomainInformationEx internal constructor(
    public var name: LsaUnicodeString,
    public var flatName: LsaUnicodeString,
    sidCtorArg: Psid,
    public var trustDirection: TrustedDomainTrustDirection,
    public var trustType: TrustedDomainTrustType,
    public var trustAttributes: TrustedDomainTrustAttributes,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        name = LsaUnicodeString(),
        flatName = LsaUnicodeString(),
        sidCtorArg = MutPtr(0L),
        trustDirection = 0u,
        trustType = 0u,
        trustAttributes = 0u,
    )

    public operator fun component1(): LsaUnicodeString = this.name

    public operator fun component2(): LsaUnicodeString = this.flatName

    public operator fun component3(): Psid = this.sid

    public operator fun component4(): TrustedDomainTrustDirection = this.trustDirection

    public operator fun component5(): TrustedDomainTrustType = this.trustType

    public operator fun component6(): TrustedDomainTrustAttributes = this.trustAttributes

    public fun copy(name: LsaUnicodeString = this.name, flatName: LsaUnicodeString = this.flatName, sid: Psid = this.sid, trustDirection: TrustedDomainTrustDirection = this.trustDirection, trustType: TrustedDomainTrustType = this.trustType, trustAttributes: TrustedDomainTrustAttributes = this.trustAttributes): TrustedDomainInformationEx = TrustedDomainInformationEx(name = name, flatName = flatName, sidCtorArg = sid, trustDirection = trustDirection, trustType = trustType, trustAttributes = trustAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TrustedDomainInformationEx) return false
        if (this.name != other.name) return false
        if (this.flatName != other.flatName) return false
        if (this.sid != other.sid) return false
        if (this.trustDirection != other.trustDirection) return false
        if (this.trustType != other.trustType) return false
        if (this.trustAttributes != other.trustAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.flatName.hashCode()
        result = 31 * result + this.sid.hashCode()
        result = 31 * result + this.trustDirection.hashCode()
        result = 31 * result + this.trustType.hashCode()
        result = 31 * result + this.trustAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: LsaUnicodeString = LsaUnicodeString(),
            flatName: LsaUnicodeString = LsaUnicodeString(),
            sid: Psid = MutPtr(0L),
            trustDirection: TrustedDomainTrustDirection = 0u,
            trustType: TrustedDomainTrustType = 0u,
            trustAttributes: TrustedDomainTrustAttributes = 0u,
        ): TrustedDomainInformationEx =
            TrustedDomainInformationEx(
                name = name,
                flatName = flatName,
                sidCtorArg = sid,
                trustDirection = trustDirection,
                trustType = trustType,
                trustAttributes = trustAttributes,
            )
    }
}

public class TrustedDomainInformationEx2 internal constructor(
    public var name: LsaUnicodeString,
    public var flatName: LsaUnicodeString,
    sidCtorArg: Psid,
    public var trustDirection: UInt,
    public var trustType: UInt,
    public var trustAttributes: UInt,
    public var forestTrustLength: UInt,
    forestTrustInfoCtorArg: MutPtr<UByte>,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public var forestTrustInfo: MutPtr<UByte> = forestTrustInfoCtorArg
        internal set

    public constructor() : this(
        name = LsaUnicodeString(),
        flatName = LsaUnicodeString(),
        sidCtorArg = MutPtr(0L),
        trustDirection = 0u,
        trustType = 0u,
        trustAttributes = 0u,
        forestTrustLength = 0u,
        forestTrustInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LsaUnicodeString = this.name

    public operator fun component2(): LsaUnicodeString = this.flatName

    public operator fun component3(): Psid = this.sid

    public operator fun component4(): UInt = this.trustDirection

    public operator fun component5(): UInt = this.trustType

    public operator fun component6(): UInt = this.trustAttributes

    public operator fun component7(): UInt = this.forestTrustLength

    public operator fun component8(): MutPtr<UByte> = this.forestTrustInfo

    public fun copy(name: LsaUnicodeString = this.name, flatName: LsaUnicodeString = this.flatName, sid: Psid = this.sid, trustDirection: UInt = this.trustDirection, trustType: UInt = this.trustType, trustAttributes: UInt = this.trustAttributes, forestTrustLength: UInt = this.forestTrustLength, forestTrustInfo: MutPtr<UByte> = this.forestTrustInfo): TrustedDomainInformationEx2 = TrustedDomainInformationEx2(name = name, flatName = flatName, sidCtorArg = sid, trustDirection = trustDirection, trustType = trustType, trustAttributes = trustAttributes, forestTrustLength = forestTrustLength, forestTrustInfoCtorArg = forestTrustInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TrustedDomainInformationEx2) return false
        if (this.name != other.name) return false
        if (this.flatName != other.flatName) return false
        if (this.sid != other.sid) return false
        if (this.trustDirection != other.trustDirection) return false
        if (this.trustType != other.trustType) return false
        if (this.trustAttributes != other.trustAttributes) return false
        if (this.forestTrustLength != other.forestTrustLength) return false
        if (this.forestTrustInfo != other.forestTrustInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.flatName.hashCode()
        result = 31 * result + this.sid.hashCode()
        result = 31 * result + this.trustDirection.hashCode()
        result = 31 * result + this.trustType.hashCode()
        result = 31 * result + this.trustAttributes.hashCode()
        result = 31 * result + this.forestTrustLength.hashCode()
        result = 31 * result + this.forestTrustInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: LsaUnicodeString = LsaUnicodeString(),
            flatName: LsaUnicodeString = LsaUnicodeString(),
            sid: Psid = MutPtr(0L),
            trustDirection: UInt = 0u,
            trustType: UInt = 0u,
            trustAttributes: UInt = 0u,
            forestTrustLength: UInt = 0u,
            forestTrustInfo: MutPtr<UByte> = MutPtr(0L),
        ): TrustedDomainInformationEx2 =
            TrustedDomainInformationEx2(
                name = name,
                flatName = flatName,
                sidCtorArg = sid,
                trustDirection = trustDirection,
                trustType = trustType,
                trustAttributes = trustAttributes,
                forestTrustLength = forestTrustLength,
                forestTrustInfoCtorArg = forestTrustInfo,
            )
    }
}

public data class TrustedDomainNameInfo(
    public var name: LsaUnicodeString = LsaUnicodeString(),
)

public data class TrustedDomainSupportedEncryptionTypes(
    public var supportedEncryptionTypes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TrustedDomainSupportedEncryptionTypes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TrustedDomainSupportedEncryptionTypes> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TrustedDomainSupportedEncryptionTypes =
                    TrustedDomainSupportedEncryptionTypes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TrustedDomainSupportedEncryptionTypes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.supportedEncryptionTypes)
                }
            }
    }
}

public data class TrustedPasswordInfo(
    public var password: LsaUnicodeString = LsaUnicodeString(),
    public var oldPassword: LsaUnicodeString = LsaUnicodeString(),
)

public data class TrustedPosixOffsetInfo(
    public var offset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TrustedPosixOffsetInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TrustedPosixOffsetInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TrustedPosixOffsetInfo =
                    TrustedPosixOffsetInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TrustedPosixOffsetInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offset)
                }
            }
    }
}

public class UserAllInformation(
    public var lastLogon: Long = 0L,
    public var lastLogoff: Long = 0L,
    public var passwordLastSet: Long = 0L,
    public var accountExpires: Long = 0L,
    public var passwordCanChange: Long = 0L,
    public var passwordMustChange: Long = 0L,
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var fullName: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectory: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectoryDrive: LsaUnicodeString = LsaUnicodeString(),
    public var scriptPath: LsaUnicodeString = LsaUnicodeString(),
    public var profilePath: LsaUnicodeString = LsaUnicodeString(),
    public var adminComment: LsaUnicodeString = LsaUnicodeString(),
    public var workStations: LsaUnicodeString = LsaUnicodeString(),
    public var userComment: LsaUnicodeString = LsaUnicodeString(),
    public var parameters: LsaUnicodeString = LsaUnicodeString(),
    public var lmPassword: LsaUnicodeString = LsaUnicodeString(),
    public var ntPassword: LsaUnicodeString = LsaUnicodeString(),
    public var privateData: LsaUnicodeString = LsaUnicodeString(),
    public var securityDescriptor: SrSecurityDescriptor = SrSecurityDescriptor(),
    public var userId: UInt = 0u,
    public var primaryGroupId: UInt = 0u,
    public var userAccountControl: UInt = 0u,
    public var whichFields: UInt = 0u,
    public var logonHours: LogonHours = LogonHours(),
    public var badPasswordCount: UShort = 0u,
    public var logonCount: UShort = 0u,
    public var countryCode: UShort = 0u,
    public var codePage: UShort = 0u,
    public var lmPasswordPresent: Boolean = false,
    public var ntPasswordPresent: Boolean = false,
    public var passwordExpired: Boolean = false,
    public var privateDataSensitive: Boolean = false,
)

public data class UserSessionKey(
    public var data: List<CypherBlock> = List(2) { CypherBlock() },
)

public class X509Certificate internal constructor(
    public var version: UInt,
    public var serialNumber: UIntArray,
    public var signatureAlgorithm: AlgId,
    public var validFrom: Filetime,
    public var validUntil: Filetime,
    pszIssuerCtorArg: Pstr,
    pszSubjectCtorArg: Pstr,
    pPublicKeyCtorArg: MutPtr<PctPublicKey>,
) {
    public var pszIssuer: Pstr = pszIssuerCtorArg
        internal set

    public var pszSubject: Pstr = pszSubjectCtorArg
        internal set

    public var pPublicKey: MutPtr<PctPublicKey> = pPublicKeyCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        serialNumber = UIntArray(4),
        signatureAlgorithm = 0u,
        validFrom = Filetime(),
        validUntil = Filetime(),
        pszIssuerCtorArg = MutPtr(0L),
        pszSubjectCtorArg = MutPtr(0L),
        pPublicKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UIntArray = this.serialNumber

    public operator fun component3(): AlgId = this.signatureAlgorithm

    public operator fun component4(): Filetime = this.validFrom

    public operator fun component5(): Filetime = this.validUntil

    public operator fun component6(): Pstr = this.pszIssuer

    public operator fun component7(): Pstr = this.pszSubject

    public operator fun component8(): MutPtr<PctPublicKey> = this.pPublicKey

    public fun copy(version: UInt = this.version, serialNumber: UIntArray = this.serialNumber, signatureAlgorithm: AlgId = this.signatureAlgorithm, validFrom: Filetime = this.validFrom, validUntil: Filetime = this.validUntil, pszIssuer: Pstr = this.pszIssuer, pszSubject: Pstr = this.pszSubject, pPublicKey: MutPtr<PctPublicKey> = this.pPublicKey): X509Certificate = X509Certificate(version = version, serialNumber = serialNumber, signatureAlgorithm = signatureAlgorithm, validFrom = validFrom, validUntil = validUntil, pszIssuerCtorArg = pszIssuer, pszSubjectCtorArg = pszSubject, pPublicKeyCtorArg = pPublicKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is X509Certificate) return false
        if (this.version != other.version) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        if (this.signatureAlgorithm != other.signatureAlgorithm) return false
        if (this.validFrom != other.validFrom) return false
        if (this.validUntil != other.validUntil) return false
        if (this.pszIssuer != other.pszIssuer) return false
        if (this.pszSubject != other.pszSubject) return false
        if (this.pPublicKey != other.pPublicKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        result = 31 * result + this.signatureAlgorithm.hashCode()
        result = 31 * result + this.validFrom.hashCode()
        result = 31 * result + this.validUntil.hashCode()
        result = 31 * result + this.pszIssuer.hashCode()
        result = 31 * result + this.pszSubject.hashCode()
        result = 31 * result + this.pPublicKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            serialNumber: UIntArray = UIntArray(4),
            signatureAlgorithm: AlgId = 0u,
            validFrom: Filetime = Filetime(),
            validUntil: Filetime = Filetime(),
            pszIssuer: Pstr = MutPtr(0L),
            pszSubject: Pstr = MutPtr(0L),
            pPublicKey: MutPtr<PctPublicKey> = MutPtr(0L),
        ): X509Certificate =
            X509Certificate(
                version = version,
                serialNumber = serialNumber,
                signatureAlgorithm = signatureAlgorithm,
                validFrom = validFrom,
                validUntil = validUntil,
                pszIssuerCtorArg = pszIssuer,
                pszSubjectCtorArg = pszSubject,
                pPublicKeyCtorArg = pPublicKey,
            )
    }
}
